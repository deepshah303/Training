import java.util.Locale;
import java.util.ResourceBundle;

public class DemoInternationalization {
	public static void main(String[] args) {
		Locale loc = new Locale("hi", "in");
		// i18n Demo
		ResourceBundle bundle = ResourceBundle.getBundle("greeting", loc);

		System.out.println(bundle.getString("message"));

	}
}
