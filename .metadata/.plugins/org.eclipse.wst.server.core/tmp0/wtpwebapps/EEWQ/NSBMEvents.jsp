<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
    <%@page import="com.microsoft.sqlserver.jdbc.SQLServerDriver"%>
    <%@page import="com.benz.demo.Event" %>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>

<!-- Basic Page Needs ================================================== 
================================================== -->

<meta charset="utf-8">
<title>Freebix Responsive Site Template</title>
<meta name="description" content="Place to put your description text">
<meta name="author" content="">
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

<!-- Mobile Specific Metas ================================================== 
================================================== -->

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">

<!-- CSS ==================================================
================================================== -->

<link rel="stylesheet" href="base.css">
<link rel="stylesheet" href="skeleton.css">
<link rel="stylesheet" href="screen.css">
<link rel="stylesheet" href="prettyPhoto.css" type="text/css" media="screen" />

<!-- Favicons ==================================================
================================================== -->

<link rel="shortcut icon" href="favicon.png">
<link rel="apple-touch-icon" href="apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72" href="apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114" href="apple-touch-icon-114x114.png">

<!-- Google Fonts ==================================================
================================================== -->
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Content Part ==================================================
================================================== -->
<div id="header">
  <div class="container"> 
    <!-- Header | Logo, Menu
		================================================== -->
    <div class="logo"><a href="index.html"><img src="" alt="" /></a></div>
    <div class="mainmenu">
      <div id="mainmenu">
        <ul class="sf-menu">
          <li><a href="index.html">Home</a></li>
          <li><a href="about.html">About</a></li>
          <li><a href="portfolio.html">Portfolio</a>
            <ul>
              <li><a href="portfolioproject.html">Portfolio Project</a></li>
            </ul>
          </li>
          <li><a href="blog.html" id="visited">Blog</a>
            <ul>
              <li><a href="singleblog.html">Single Post</a></li>
            </ul>
          </li>
          <li><a href="features.html">Features</a></li>
          <li><a href="contact.html">Contact</a></li>
        </ul>
      </div>
      <!-- mainmenu ends here --> 
      
      <!-- Responsive Menu -->
      
    </div>
    <!-- mainmenu ends here --> 
  </div>
  <!-- container ends here --> 
</div>
<!-- header ends here --> 
<!--Breadcrumbs ==================================================
================================================== -->
<div class="breadcrumbs">
  <div class="container">
    <header>
      <h3>University & Industry Events</h3>
    </header>
  </div>
  <!-- container ends here -->
  <hr class="separator1">
</div>
<!-- breadcrumbs ends here --> 
<!-- Blog ==================================================
================================================== -->
<div class="container">
  <div class="ten columns alpha">
    <article class="post">
    
      <h3>IIT 100th Celebration</h3>
      <a href="1.jpg" class="prettyPhoto[gal]"><img class="shadow" src="event4.jpg" alt="" height="250px" width="800px" /></a>
      <div class="entry-date">
        <div class="number">08 DEC</div>
      </div>
      
      <p>Lorem ipsum dolor sit amet, proscriptum videt ulteriori. Filiam sunt amore nec est cum autem est se in. Cellam sanctissima coniunx in lucem exempli paupers coniunx rex cum autem quod ait regem Ardalio. Filiam sunt amore nec est cum autem est se in.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam,feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
      <a href="singleblog.html">more <span>+</span></a> </article>

       <article class="post">
      <h3>Mini Hacayhon</h3>
      <a href="1.jpg" class="prettyPhoto[gal]"><img class="shadow" src="1.jpg" alt=""  height="250px" width="800px" /></a>
      <div class="entry-date">
        <div class="number">08 DEC</div>
      </div>
      <p>Lorem ipsum dolor sit amet, proscriptum videt ulteriori. Filiam sunt amore nec est cum autem est se in. Cellam sanctissima coniunx in lucem exempli paupers coniunx rex cum autem quod ait regem Ardalio. Filiam sunt amore nec est cum autem est se in.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam,feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
      <a href="singleblog.html">more <span>+</span></a> </article>
    
    <%
//String id = request.getParameter("userid");
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
String conString = "jdbc:sqlserver://localhost:1433;databaseName=LKR;IntegratedSecurity=true;";
                   

try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
    
 <%
try{
connection = DriverManager.getConnection(conString);
statement=connection.createStatement();
String sql ="select EventName,U_Date,Infor,E_Photo from Event where University = 'NSBM Green University'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	Event eve = new Event();
	eve.setEvent_name(resultSet.getString("EventName"));
	eve.setDetails(resultSet.getString("Infor"));
	eve.setPhoto( resultSet.getString("E_Photo"));
    //eve.setDate("09 Dec");
%>   
    <article class="post">
      <h3><%=eve.getEvent_name()%></h3>
      <a href=<%=eve.getPhoto() %> class="prettyPhoto[gal]"><img class="shadow" src=<%=eve.getPhoto() %> alt=""/ height="250px" width="800px"></a>
      <div class="entry-date">
        <div class="number">08 DEC</div>
      </div>
      <p><%=eve.getDetails()%></p>
      <a href="singleblog.html">more <span>+</span></a> </article>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
  </div>
  <!-- ten columns ends here -->
  
  
  <!--end six columns--> 
</div>
<!-- container ends here --> 
<!-- Socialize ==================================================
================================================== -->
<hr class="separator2">
<div class="socialsblock">
  <div class="container socialize">
    <h3>Socialize with us!</h3>
    <section class="socials">
      <ul class="socials">
        <li><a href="#"><img src="twitter.png" alt="" /></a></li>
        <li><a href="#"><img src="facebook.png" alt="" /></a></li>
        <li><a href="#"><img src="dribbble.png" alt="" /></a></li>
        <li><a href="#"><img src="google+.png" alt="" /></a></li>
        <li><a href="#"><img src="linkedin.png" alt="" /></a></li>
        <li><a href="#"><img src="youtube.png" alt="" /></a></li>
      </ul>
    </section>
  </div>
  <!-- container ends here --> 
</div>
<!-- socialsblock ends here --> 
<!-- Footer ==================================================
================================================== -->

<!-- footer ends here --> 
<!-- Copyright ==================================================
================================================== -->

<!-- copyright ends here --> 
<!-- End Document
================================================== --> 
<!-- Scripts ==================================================
================================================== --> 
<script src="js/jquery-1.8.0.min.js" type="text/javascript"></script> 
<!-- Main js files --> 
<script src="js/screen.js" type="text/javascript"></script> 
<!-- Tabs --> 
<script src="js/tabs.js" type="text/javascript"></script> 
<!-- Include prettyPhoto --> 
<script src="js/jquery.prettyPhoto.js" type="text/javascript"></script> 
<!-- Include Superfish --> 
<script src="js/superfish.js" type="text/javascript"></script> 
<script src="js/hoverIntent.js" type="text/javascript"></script> 
<!-- Flexslider --> 
<script src="js/jquery.flexslider-min.js" type="text/javascript"></script> 
<!-- Modernizr --> 
<script type="text/javascript" src="js/modernizr.custom.29473.js"></script>
</body>
</html>