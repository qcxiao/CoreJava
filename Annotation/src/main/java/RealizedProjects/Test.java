package RealizedProjects;

/**
 * 项目实践,测试自定义的注解,并联系了反射的使用
 * @author qcxiao
 *
 */
public class Test {
	public static void main(String[] args) {
		Filter f1 = new Filter();
		f1.setId("1");
		Filter f2 = new Filter();
		f2.setUserName("qcxiao");
		Filter f3 = new Filter();
		f3.setAge(17);
		String sql1 = DBUtil.query(f1);
		String sql2 = DBUtil.query(f2);
		String sql3 = DBUtil.query(f3);
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
	}
	
}
