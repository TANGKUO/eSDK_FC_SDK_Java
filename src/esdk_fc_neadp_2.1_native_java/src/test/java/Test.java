import com.huawei.esdk.fusioncompute.local.ServiceFactory;
import com.huawei.esdk.fusioncompute.local.model.ClientProviderBean;
import com.huawei.esdk.fusioncompute.local.model.FCSDKResponse;
import com.huawei.esdk.fusioncompute.local.model.common.LoginResp;
import com.huawei.esdk.fusioncompute.local.resources.common.AuthenticateResource;


public class Test {
	public static void main(String[] args) {
	    //�趨����������
	    ClientProviderBean clientProvider = new ClientProviderBean();
	    //�趨����������_�趨������IP
	    clientProvider.setServerIp("172.22.32.56");
	    //�趨����������_�趨�������˿ں�
	    clientProvider.setServerPort("7443");
	    //��ʼ���û���Դʵ��
	    AuthenticateResource auth = ServiceFactory.getService(AuthenticateResource.class, clientProvider);
	    //���û������û�������Ϊ�������������AuthenticateResource�ṩ��login����������û��ĵ�¼
	    FCSDKResponse<LoginResp> resp = auth.login("test001", "Huawei@123");
	}
}
