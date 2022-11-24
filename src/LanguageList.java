
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List; 

public class LanguageList {
	private List<String> languages = new ArrayList<String>(); 
	
	public boolean isEmpty() {
		return this.languages.isEmpty(); 
	}
	
	public void addLanguage(String language) {
		this.languages.add(language); 
	}
	
	public void removeLanguage(String language) {
		this.languages.remove(language); 
	}
	
	public String firstLanguage() {
		return this.languages.get(0); 
	}
	
	public int count() {
		return this.languages.size();
	}
	
	public boolean containsLanguage(String language) {
		boolean languagePresent = false; 
		
		for(int i = 0; i < this.languages.size(); i++) {
			if(this.languages.get(i).equalsIgnoreCase(language)) {
				languagePresent = true; 
				break; 
			}
		}
		
		return languagePresent; 
	}
	
	public boolean isExciting() {
		if (this.containsLanguage("Java") || this.containsLanguage("Kotlin")) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public String print() {
		return this.languages.toString(); 
	}
	
}
