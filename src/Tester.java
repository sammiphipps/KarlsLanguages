
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanguageList ll = new LanguageList(); 
		
		ll.addLanguage("Kotlin");
		ll.addLanguage("Python"); 
		ll.addLanguage("Scala");
		
		System.out.println("Array: " + ll.print()); 
		
		ll.removeLanguage("Scala");
		System.out.println("Array after removal: " + ll.print()); 
		
		System.out.println("First language: " + ll.firstLanguage()); 
		
		System.out.println("Size: " + ll.count()); 
		
		System.out.println("Contain Python? " + ll.containsLanguage("Python")); 
		System.out.println("Contain Ruby? " + ll.containsLanguage("Ruby")); 
		
		System.out.println("Is Exciting? " + ll.isExciting()); 
		
		LanguageList notExciting = new LanguageList(); 
		notExciting.addLanguage("Ruby");
		notExciting.addLanguage("React");
		notExciting.addLanguage("Vue");
		System.out.println("Not Exciting List: " + notExciting.print()); 
		System.out.println("Is Exciting? " + notExciting.isExciting()); 
	}

}
