# 🎯 Block IP Address Web Application

## Description
This is a simple **Java web application** that uses a **Filter** to block access to a webpage based on the client's IP address. If the client’s IP address is `127.0.0.1` (localhost), they will be blocked and shown a message. Otherwise, they will be able to access the webpage.

The application consists of the following components:

* **Filter** (`MyBlock.java`): Intercepts requests and blocks access based on the IP address.
* **Servlet** (`WorldServlet.java`): Displays a welcome message if the IP address is not blocked.
* **HTML page** (`index.html`): A simple webpage with a link to the servlet.
* **web.xml**: Configuration file to map the filter and servlet.

---

## Prerequisites

Before running the application, you will need:

* **Eclipse IDE** (or any IDE that supports Java and servlet development).
* **Apache Tomcat** server installed and configured.
* **JDK 8+** installed on your system.
* Basic understanding of **Java Servlets** and **Filters**.

---

## Expected Behavior

1. **Blocked IP (127.0.0.1)**:

   * If the client's IP address is `127.0.0.1`, the filter will block access and display the message:
     **"Your IP address is blocked by this website"**.

2. **Allowed IP (not 127.0.0.1)**:

   * If the client's IP address is **not** `127.0.0.1`, the servlet will display:
     **"Hello Client, welcome to my Website..."**.

---

