/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-05-15 09:26:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ureg2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Freebix Responsive Site Template</title>\r\n");
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
      out.write("<div id=\"header\">\r\n");
      out.write("  <div class=\"container\"> \r\n");
      out.write("    <!-- Header | Logo, Menu\r\n");
      out.write("\t\t================================================== -->\r\n");
      out.write("    <div class=\"logo\"><a href=\"index.html\"><img src=\"\" alt=\"\" /></a></div>\r\n");
      out.write("    <div class=\"mainmenu\">\r\n");
      out.write("      <div id=\"mainmenu\">\r\n");
      out.write("        <ul class=\"sf-menu\">\r\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("          <li><a href=\"about.html\">About</a></li>\r\n");
      out.write("          <li><a href=\"portfolio.html\" id=\"visited\">Portfolio</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"portfolioproject.html\">Portfolio Project</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"blog.html\">Blog</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"singleblog.html\">Single Post</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"features.html\">Features</a></li>\r\n");
      out.write("          <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mainmenu ends here --> \r\n");
      out.write("      \r\n");
      out.write("      <!-- Responsive Menu -->\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- mainmenu ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- header ends here --> \r\n");
      out.write("<!--Breadcrumbs ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"breadcrumbs\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <h3>Industry Details</h3>\r\n");
      out.write("    \r\n");
      out.write("    </header>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here -->\r\n");
      out.write("  <hr class=\"separator1\">\r\n");
      out.write("</div>\r\n");
      out.write("<!-- breadcrumbs ends here --> \r\n");
      out.write("<!-- Portfolio ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"container portfolio\">\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"WS02.png\" alt=\"\" width=\"300px\" height=\"160px\" />\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"Research.jsp\">WSO2</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"sys.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"Research.jsp\">Sysco Labs</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"99x.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"Research.jsp\">99x Technology</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"pear.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"Research.jsp\">Pearson</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"><img src=\"ifs.jpg\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">IFS</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"oracle.jpg\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Oracle</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"enbala.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Enbala</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"micro.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Microsoft</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img src=\"goog.png\" alt=\"\" width=\"300px\" height=\"160px\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Google</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  \r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  \r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  \r\n");
      out.write("  <!--end one_third--> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- container ends here --> \r\n");
      out.write("<!-- Socialize ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<hr class=\"separator2\">\r\n");
      out.write("<div class=\"socialsblock\">\r\n");
      out.write("  <div class=\"container socialize\">\r\n");
      out.write("    <h3>Socialize with us!</h3>\r\n");
      out.write("    <section class=\"socials\">\r\n");
      out.write("      <ul class=\"socials\">\r\n");
      out.write("        <li><a href=\"#\"><img src=\"twitter.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"facebook.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"dribbble.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"google+.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"linkedin.png\" alt=\"\" /></a></li>\r\n");
      out.write("        <li><a href=\"#\"><img src=\"youtube.png\" alt=\"\" /></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- socialsblock ends here --> \r\n");
      out.write("<!-- Footer ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("  \r\n");
      out.write("<!-- Copyright ==================================================\r\n");
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
