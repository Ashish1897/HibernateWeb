<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.hibernate.*,org.hibernate.boot.registry.*,
org.hibernate.cfg.Configuration,
com.coforge.training.hibernateweb.Question,
com.coforge.training.hibernateweb.Answer,
javax.persistence.TypedQuery,
java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One To Many</title>
</head>
<body>
<h1>ONe To Many Association</h1>

<%
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory(new
StandardServiceRegistryBuilder().configure().build());
Session sess= factory.openSession();
Transaction t = sess.beginTransaction();

Answer ans1=new Answer();
ans1.setAnswername("HTML is a markup language");
ans1.setPostedBy("Raj");

Answer ans2=new Answer();
ans2.setAnswername("HTML is used to display static Web Pages");
ans2.setPostedBy("Mike");

Answer ans3=new Answer();
ans3.setAnswername("jQuery is a JS library");
ans3.setPostedBy("John Joseph");

Answer ans4=new Answer();
ans4.setAnswername("jQuery simplifies AJAX");
ans4.setPostedBy("Arun");

ArrayList<Answer> list1=new ArrayList<Answer>();
list1.add(ans1);
list1.add(ans2);

ArrayList<Answer> list2=new ArrayList<Answer>();
list2.add(ans3);
list2.add(ans4);

Question question1=new Question();
question1.setqName("What is HTML?");
question1.setAnswers(list1);

Question question2=new Question();
question2.setqName("What is jQuery?");
question2.setAnswers(list2);

sess.persist(question1);
sess.persist(question2);

t.commit();
sess.close();
out.print("Success");
%>

</body>
</html>