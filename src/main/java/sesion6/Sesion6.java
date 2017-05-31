package sesion6;

public class Sesion6 {
	
	public boolean ejercico2 (int x) {
		if (x >= 0)
			return true;
		else
			return false;
	}
	
	public boolean compruebaLoginEnBD (String username, String password) {
		// para hacer una simulacion del metodo he establecido que si son igual es valido
		if (username.equals(password))
			return true;
		return false;
	}
	
	public boolean ejercicio3 (String username, String password) {
		if (!username.equals(""))
			if (!password.equals(""))
				if (username.length()<30)
					if (password.length()<30)
						return compruebaLoginEnBD(username, password);
		return false;
	}
	
	public String ejercicio4 (int num) {
		String asteriscos = "";
		if (num >= 0) {
			for (int i=0; i<num; i++) {
				asteriscos += "*";
			} 
		} else {
			asteriscos = "Numero erroneo";
		}
		return asteriscos;
	}
	
	public String ejercicio5 (String p1, String p2) {
		String faltan = "";
		for (int i=0; i<p1.length(); i++) {
			if (!p2.contains(p1.charAt(i)+""))
				faltan += p1.charAt(i);
		}
		return faltan;		
	}
}
