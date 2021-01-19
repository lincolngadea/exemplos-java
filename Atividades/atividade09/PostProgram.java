import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class PostProgram {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		
		Post p1 = new Post(sdf.parse("01/18/2020 20:15:44"),
				"Traveling to New Sealand",
				"I am going to visit this wonderfull country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Have a nice trip!");
		Comment c4 = new Comment("Wow that's awesome");
		
		Post p2 = new Post(sdf.parse("01/18/2020 20:15:44"),
				"Traveling to New Sealand",
				"I am going to visit this wonderfull country!",
				12);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
