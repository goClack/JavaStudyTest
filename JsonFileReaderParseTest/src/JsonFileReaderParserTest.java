import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReaderParserTest {

	public JsonFileReaderParserTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/jsonData.json");
		
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = null;
		
		try {
			jsonObj = (JSONObject) parser.parse(fr);
		} catch (ParseException e) {
			System.out.println("Json Object 변환에 실패");
			e.printStackTrace();
		}
		
		System.out.println(jsonObj);
		System.out.println(jsonObj.get("title"));
		JSONArray testArray = (JSONArray)jsonObj.get("testArray");
		
		Iterator<Integer> iterator = testArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		for ( int i = 0; i< testArray.size(); i++)
		{
			System.out.println(testArray.get(i));
		}
	}

}
