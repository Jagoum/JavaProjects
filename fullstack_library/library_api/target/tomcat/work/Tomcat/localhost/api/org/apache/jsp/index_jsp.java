/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-05-17 11:21:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Library Management System</title>\n");
      out.write("    <style>\n");
      out.write("        /* Modern, centered layout */\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #2c3e50;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Input form styling */\n");
      out.write("        .input-form {\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input {\n");
      out.write("            width: calc(100% - 22px);\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: #3498db;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #2980b9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Book list styling */\n");
      out.write("        #book-list {\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 500px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book {\n");
      out.write("            background: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-info {\n");
      out.write("            flex-grow: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-title {\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-author {\n");
      out.write("            color: #7f8c8d;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .delete-btn {\n");
      out.write("            background-color: #e74c3c;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .delete-btn:hover {\n");
      out.write("            background-color: #c0392b;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1> Library Management System</h1>\n");
      out.write("\n");
      out.write("    <div class=\"input-form\">\n");
      out.write("        <input id=\"title\" placeholder=\"Book Title (e.g., Clean Code)\">\n");
      out.write("        <input id=\"author\" placeholder=\"Author (e.g., Robert Martin)\">\n");
      out.write("        <button onclick=\"addBook()\">Add Book</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"book-list\"></div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/app.js\" defer></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
