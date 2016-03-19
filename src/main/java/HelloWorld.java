import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class HelloWorld {
  public String jsonCheck() {
    String jsonData = "{'aa':'aa'}";
    JSONObject logJson;
    try {
      logJson = new JSONObject(jsonData);
      return "ok";
    } catch (JSONException ex) {
       return "エラー";
    }
  }
}
