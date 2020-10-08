public class gameStoreService {
	public boolean validarLogin(String login, String senha) {
		if("alfredo".equals(login) && "123456".equals(senha)) 
			return true;
		return false;
	}
}
