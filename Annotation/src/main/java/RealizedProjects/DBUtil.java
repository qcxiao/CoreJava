package RealizedProjects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 根据注解将对象转为sql
 * @author qcxiao
 *
 */
public class DBUtil {
	public static String query(Object obj) {
		StringBuffer sb = new StringBuffer();
		Class c = obj.getClass();
		// 获取Table是否存在
		boolean isExistTable = c.isAnnotationPresent(Table.class);
		if(!isExistTable){
			return null;
		}
		// 获取Table
		Table table = (Table)c.getAnnotation(Table.class);
		String tableName = table.value();
		sb.append("select * from ").append(tableName).append(" where '1' = '1'");
		// 遍历所有字段
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			boolean isExistField = field.isAnnotationPresent(Column.class);
			if(!isExistField){
				continue;
			}
			Column column = (Column)field.getAnnotation(Column.class);
			// 获取字段的名称
			String columnName = column.value();
			// 获取字段的值
			String fieldName = field.getName();
			String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
			Object fieldValue = null;
			try {
				Method method = c.getMethod(methodName);
				fieldValue = method.invoke(obj);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			// 拼装SQL
			if(null != fieldValue && fieldValue instanceof String)
				sb.append(" and ").append(columnName).append(" = ").append("'").append(fieldValue).append("'");
			else if(null != fieldValue && fieldValue instanceof Integer && 0 != (Integer)fieldValue)
				sb.append(" and ").append(columnName).append(" = ").append(fieldValue);
		}
		return sb.toString();
	}
}
