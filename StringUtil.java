
public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		char [] charArray = new char[n];
		for (int i = 0; i < n; i++) {
			charArray[i] = c;
		}
		return String.valueOf(charArray);
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{

		String ceros =  replicate(c,n);
		return ceros + s;

	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String [] arrString = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrString[i] = Integer.toString(arr[i]);
		}

		return arrString;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{

		int [] intString = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intString[i] = Integer.parseInt(arr[i]);
		}

		return intString;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{

		int flag = arr[0].length();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > flag) {
				flag = arr[i].length();
			}
		}
		return flag;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static String[] lNormalize(String arr[], char c)
	{
		int flag = maxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i],flag-arr[i].length(),c);
		}
		return arr;
	}
}
