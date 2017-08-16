package com.yaodao.rpc.framework;

/**
 * 提供服务
 * @author qcxiao
 *
 */
public class RpcProvider {
	public static void main(String[] args) throws Exception {  
        HelloService service = new HelloServiceImpl();  
        RpcFramework.export(service, 1234);  
    }  
}
