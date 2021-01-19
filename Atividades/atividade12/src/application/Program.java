package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS");
		
		Date date = new Date();
		System.out.println("Moment: "+ sdf.format(date));
		
		System.out.print("Title: ");
		String title = sc.nextLine();
		
		System.out.println("Content: ");
		String content = sc.nextLine();
		
		System.out.print("Likes: ");
		int likes = sc.nextInt();
		
		Post post = new Post(date, title, content, likes);

		sc.nextLine();
		System.out.println("Coment: ");
		String commentText = sc.nextLine();
		
		Comment comment = new Comment(commentText);
		
		post.addComment(comment);	
		
		System.out.println();
		System.out.println("------------------------------------");
		
		System.out.println(post.getTitle());
		System.out.println(post.getLikes());
		System.out.println(post.getMoment());
		System.out.println();
		System.out.println("Comments:");
		System.out.println(post.getComments());
		
		sc.close();
	}

}
