/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-05-18 12:15:57 UTC
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
import com.benz.demo.Sidea;
import java.text.SimpleDateFormat;

public final class NSBMIdea_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Basic Page Needs ================================================== \r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Research Problems</title>\r\n");
      out.write("<meta name=\"description\" content=\"Place to put your description text\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Specific Metas ================================================== \r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"skeleton.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"screen.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"prettyPhoto.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"apple-touch-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"apple-touch-icon-114x114.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--Content Part ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<!--Breadcrumbs ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"breadcrumbs\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <h3>Student Ideas</h3>\r\n");
      out.write("      \r\n");
      out.write("    </header>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here -->\r\n");
      out.write("  <hr class=\"separator1\">\r\n");
      out.write("</div>\r\n");
      out.write("<!-- breadcrumbs ends here --> \r\n");
      out.write("<!-- Features ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div id=\"resume\">\r\n");
      out.write("  <div class=\"container resume\">\r\n");
      out.write("    <h3>Idea</h3>\r\n");
      out.write("    <p>Lorem ipsum dolor sit amet, Mauris laoreet nulla at dui consectetur vel elementum justo tempor. Sed erat dui, sagittis a pharetra ut, tempor erat dui, sagittis a pharetra ut, tempor vel turpis. Vestibulum blandit ultricies tempus. Phasellus sollicitudin quam vitae eros aliquam viverra.</p>\r\n");
      out.write("    <br/><br/>\r\n");
      out.write("    <div class=\"one_third\">\r\n");
      out.write("      <h4>Nafaz Benzema</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <h4>Bsc(Hons) Software Engineering</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <h4>23-05-2017</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"two_third lastcolumn\">\r\n");
      out.write("      <br/> \r\n");
      out.write("      <p> \r\n");
      out.write("         Mauris laoreet nulla at dui consectetur vel elementum justo tempor. Sed erat dui, sagittis a pharetra ut, tempor erat dui, sagittis a pharetra ut, tempor vel turpis. Vestibulum blandit ultricies tempus.\r\n");
      out.write("      Mauris laoreet nulla at dui consectetur vel elementum justo tempor. Sed erat dui, sagittis a pharetra ut, tempor erat dui, sagittis a pharetra ut, tempor vel turpis. Vestibulum blandit ultricies tempus.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"one_third\">\r\n");
      out.write("      <h4>Kelly Brook</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <h4>Bsc(Hons) Computer Science</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <h4>02-01-2018</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("   <div class=\"two_third lastcolumn\">\r\n");
      out.write("      <br/> \r\n");
      out.write("      <p> \r\n");
      out.write("         Mauris laoreet nulla at dui consectetur vel elementum justo tempor. Sed erat dui, sagittis a pharetra ut, tempor erat dui, sagittis a pharetra ut, tempor vel turpis. Vestibulum blandit ultricies tempus.\r\n");
      out.write("      Mauris laoreet nulla at dui consectetur vel elementum justo tempor. Sed erat dui, sagittis a pharetra ut, tempor erat dui, sagittis a pharetra ut, tempor vel turpis. Vestibulum blandit ultricies tempus.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("     ");

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
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

try{
connection = DriverManager.getConnection(conString);
statement=connection.createStatement();
String sql ="select S_name,Degree_Title,U_Date,Idea from Student_Idea";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	Sidea si = new Sidea();
	si.setsName(resultSet.getString("S_name"));
	si.setTitle(resultSet.getString("Degree_Title"));
	
	si.setIdea(resultSet.getString("Idea"));

	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"one_third\">\r\n");
      out.write("               <h4>");
      out.print(si.getsName());
      out.write("</h4>\r\n");
      out.write("           <br/>\r\n");
      out.write("      <h4>");
      out.print(si.getTitle());
      out.write("</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <h4>");
      out.print(resultSet.getString("U_Date"));
      out.write("</h4>\r\n");
      out.write("      <br/>\r\n");
      out.write("      </div>\r\n");
      out.write("    <div class=\"two_third lastcolumn\">\r\n");
      out.write("      <br/> \r\n");
      out.write("      <p> \r\n");
      out.write("      ");
      out.print(si.getIdea());
      out.write("\r\n");
      out.write("      </p>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Features FAQ ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- socialsblock ends here --> \r\n");
      out.write("<!-- Footer ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<!-- copyright ends here --> \r\n");
      out.write("<!-- End Document\r\n");
      out.write("================================================== --> \r\n");
      out.write("<!-- Scripts ==================================================\r\n");
      out.write("================================================== --> \r\n");
      out.write("<script src=\"jquery-1.8.0.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Main js files --> \r\n");
      out.write("<script src=\"screen.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Tabs --> \r\n");
      out.write("<script src=\"tabs.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Include prettyPhoto --> \r\n");
      out.write("<script src=\"jquery.prettyPhoto.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Include Superfish --> \r\n");
      out.write("<script src=\"superfish.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"hoverIntent.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Flexslider --> \r\n");
      out.write("<script src=\"jquery.flexslider-min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Modernizr --> \r\n");
      out.write("<script type=\"text/javascript\" src=\"modernizr.custom.29473.js\"></script>\r\n");
      out.write("</body>\r\n");
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
