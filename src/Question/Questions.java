package Question;
import java.util.*;

public class Questions {
	private int id;
	private String name;
	private List<String>answers;
	Questions(){
		
	}
	public Questions(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void display() {
		System.out.println(id+" "+name);
		System.out.println("answers are :");
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
}
