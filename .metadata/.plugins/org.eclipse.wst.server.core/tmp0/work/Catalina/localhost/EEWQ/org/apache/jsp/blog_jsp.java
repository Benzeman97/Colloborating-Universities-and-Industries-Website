/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-05-14 06:43:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import com.benz.demo.Event;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<!-- Basic Page Needs ================================================== \n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Freebix Responsive Site Template</title>\n");
      out.write("<meta name=\"description\" content=\"Place to put your description text\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("<!-- Mobile Specific Metas ================================================== \n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\">\n");
      out.write("\n");
      out.write("<!-- CSS ==================================================\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"base.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"skeleton.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"screen.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"prettyPhoto.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Favicons ==================================================\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"apple-touch-icon-72x72.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"apple-touch-icon-114x114.png\">\n");
      out.write("\n");
      out.write("<!-- Google Fonts ==================================================\n");
      out.write("================================================== -->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--Content Part ==================================================\n");
      out.write("================================================== -->\n");
      out.write("<div id=\"header\">\n");
      out.write("  <div class=\"container\"> \n");
      out.write("    <!-- Header | Logo, Menu\n");
      out.write("\t\t================================================== -->\n");
      out.write("    <div class=\"logo\"><a href=\"index.html\"><img src=\"\" alt=\"\" /></a></div>\n");
      out.write("    <div class=\"mainmenu\">\n");
      out.write("      <div id=\"mainmenu\">\n");
      out.write("        <ul class=\"sf-menu\">\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li><a href=\"about.html\">About</a></li>\n");
      out.write("          <li><a href=\"portfolio.html\">Portfolio</a>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"portfolioproject.html\">Portfolio Project</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"blog.html\" id=\"visited\">Blog</a>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"singleblog.html\">Single Post</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"features.html\">Features</a></li>\n");
      out.write("          <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- mainmenu ends here --> \n");
      out.write("      \n");
      out.write("      <!-- Responsive Menu -->\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <!-- mainmenu ends here --> \n");
      out.write("  </div>\n");
      out.write("  <!-- container ends here --> \n");
      out.write("</div>\n");
      out.write("<!-- header ends here --> \n");
      out.write("<!--Breadcrumbs ==================================================\n");
      out.write("================================================== -->\n");
      out.write("<div class=\"breadcrumbs\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <header>\n");
      out.write("      <h3>University & Industry Events</h3>\n");
      out.write("    </header>\n");
      out.write("  </div>\n");
      out.write("  <!-- container ends here -->\n");
      out.write("  <hr class=\"separator1\">\n");
      out.write("</div>\n");
      out.write("<!-- breadcrumbs ends here --> \n");
      out.write("<!-- Blog ==================================================\n");
      out.write("================================================== -->\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"ten columns alpha\">\n");
      out.write("    <article class=\"post\">\n");
      out.write("    \n");
      out.write("      <h3>IIT 100th Celebration</h3>\n");
      out.write("      <a href=\"1.jpg\" class=\"prettyPhoto[gal]\"><img class=\"shadow\" src=\"event4.jpg\" alt=\"\" height=\"250px\" width=\"800px\" /></a>\n");
      out.write("      <div class=\"entry-date\">\n");
      out.write("        <div class=\"number\">08 DEC</div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <p>Lorem ipsum dolor sit amet, proscriptum videt ulteriori. Filiam sunt amore nec est cum autem est se in. Cellam sanctissima coniunx in lucem exempli paupers coniunx rex cum autem quod ait regem Ardalio. Filiam sunt amore nec est cum autem est se in.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam,feugiat vitae, ultricies eget, tempor sit amet, ante.</p>\n");
      out.write("      <a href=\"singleblog.html\">more <span>+</span></a> </article>\n");
      out.write("\n");
      out.write("       <article class=\"post\">\n");
      out.write("      <h3>Mini Hacayhon</h3>\n");
      out.write("      <a href=\"1.jpg\" class=\"prettyPhoto[gal]\"><img class=\"shadow\" src=\"1.jpg\" alt=\"\"  height=\"250px\" width=\"800px\" /></a>\n");
      out.write("      <div class=\"entry-date\">\n");
      out.write("        <div class=\"number\">08 DEC</div>\n");
      out.write("      </div>\n");
      out.write("      <p>Lorem ipsum dolor sit amet, proscriptum videt ulteriori. Filiam sunt amore nec est cum autem est se in. Cellam sanctissima coniunx in lucem exempli paupers coniunx rex cum autem quod ait regem Ardalio. Filiam sunt amore nec est cum autem est se in.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam,feugiat vitae, ultricies eget, tempor sit amet, ante.</p>\n");
      out.write("      <a href=\"singleblog.html\">more <span>+</span></a> </article>\n");
      out.write("    \n");
      out.write("    ");

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

      out.write("\n");
      out.write("    \n");
      out.write(" ");

try{
connection = DriverManager.getConnection(conString);
statement=connection.createStatement();
String sql ="select EventName,U_Date,Infor,E_Photo from Event";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	Event eve = new Event();
	eve.setEvent_name(resultSet.getString("EventName"));
	eve.setDetails(resultSet.getString("Infor"));
	eve.setPhoto( resultSet.getString("E_Photo"));
    //eve.setDate("09 Dec");

      out.write("   \n");
      out.write("    <article class=\"post\">\n");
      out.write("      <h3>");
      out.print(eve.getEvent_name());
      out.write("</h3>\n");
      out.write("      <a href=");
      out.print(eve.getPhoto() );
      out.write(" class=\"prettyPhoto[gal]\"><img class=\"shadow\" src=");
      out.print(eve.getPhoto() );
      out.write(" alt=\"\"/ height=\"250px\" width=\"800px\"></a>\n");
      out.write("      <div class=\"entry-date\">\n");
      out.write("        <div class=\"number\">08 DEC</div>\n");
      out.write("      </div>\n");
      out.write("      <p>");
      out.print(eve.getDetails());
      out.write("</p>\n");
      out.write("      <a href=\"singleblog.html\">more <span>+</span></a> </article>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- ten columns ends here -->\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <!--end six columns--> \n");
      out.write("</div>\n");
      out.write("<!-- container ends here --> \n");
      out.write("<!-- Socialize ==================================================\n");
      out.write("================================================== -->\n");
      out.write("<hr class=\"separator2\">\n");
      out.write("<div class=\"socialsblock\">\n");
      out.write("  <div class=\"container socialize\">\n");
      out.write("    <h3>Socialize with us!</h3>\n");
      out.write("    <section class=\"socials\">\n");
      out.write("      <ul class=\"socials\">\n");
      out.write("        <li><a href=\"#\"><img src=\"twitter.png\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"facebook.png\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"dribbble.png\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"google+.png\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"linkedin.png\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"youtube.png\" alt=\"\" /></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </section>\n");
      out.write("  </div>\n");
      out.write("  <!-- container ends here --> \n");
      out.write("</div>\n");
      out.write("<!-- socialsblock ends here --> \n");
      out.write("<!-- Footer ==================================================\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<!-- footer ends here --> \n");
      out.write("<!-- Copyright ==================================================\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<!-- copyright ends here --> \n");
      out.write("<!-- End Document\n");
      out.write("================================================== --> \n");
      out.write("<!-- Scripts ==================================================\n");
      out.write("================================================== --> \n");
      out.write("<script src=\"js/jquery-1.8.0.min.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Main js files --> \n");
      out.write("<script src=\"js/screen.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Tabs --> \n");
      out.write("<script src=\"js/tabs.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Include prettyPhoto --> \n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Include Superfish --> \n");
      out.write("<script src=\"js/superfish.js\" type=\"text/javascript\"></script> \n");
      out.write("<script src=\"js/hoverIntent.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Flexslider --> \n");
      out.write("<script src=\"js/jquery.flexslider-min.js\" type=\"text/javascript\"></script> \n");
      out.write("<!-- Modernizr --> \n");
      out.write("<script type=\"text/javascript\" src=\"js/modernizr.custom.29473.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
