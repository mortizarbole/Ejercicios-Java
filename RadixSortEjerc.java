
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static int [] radixSort(int []arr)
	{
		String [] arrString = StringUtil.toStringArray(arr);
		arrString = StringUtil.lNormalize(arrString,'0');
		// PROGRAMAR AQUI
		for (int i = arrString[0].length()-1; i >= 0 ; i--) {
			HashMap<String, ArrayList<String>> dictListas = new HashMap<>();
			for (int j = 0; j <= 9 ; j++) {
				dictListas.put(Integer.toString(j),new ArrayList<String>());
			}
			for (int j = 0; j < arrString.length; j++) {
				ArrayList<String> lista = dictListas.get(Character.toString(arrString[j].charAt(i)));
				lista.add(arrString[j]);
			}
			ArrayList<String> arrStringTemp = new ArrayList();
			for (Map.Entry<String,ArrayList<String>> entry: dictListas.entrySet()) {
				arrStringTemp.addAll(entry.getValue());
			}
			//
			arrString = arrStringTemp.toArray(arrString);
		}
		return StringUtil.toIntArray(arrString);

	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		 arr = radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
