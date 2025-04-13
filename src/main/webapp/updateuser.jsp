<!DOCTYPE html>
<%@page import ="java.util.Vector" %>

<html><% 
Vector vt = null;


%>
<head>
  <%@ include file ="header.jsp"%>
</head>

<body>
  <div class="hero_area">
    <!-- header section strats -->
    <%@ include file ="nav.jsp"%>
    <!-- end header section -->

  </div>
  <!-- end hero area -->

  <!-- contact section -->

  <section class="contact_section layout_padding">
    <div class="container px-0">
      <div class="heading_container ">
        <h2 class="">
        Update Details 
        </h2>
      </div>
    </div>
    <div class="container container-bg">
      <div class="row">
        
        <div class="col-md-6 col-lg-5 px-0">
          <form action="CustomerUpdateServlet" method="post">
            <div>
            <input type="text" name="cid" value="<%= (Integer)vt.elementAt(0) %>" />
              
            </div>
            <div>
              <input type="text" name ="cname" value"<%=(String)vt.elementAt(1)%>" />
              
            </div>
            <div>
              <input type="text" name ="cadd" value "<%=(String)vt.elementAt(2)%>" />
              
            </div>
            <div>
              <input type="text" name="mob" value "<%=(String)vt.elementAt(3)%>" />
              
            </div>
            
            <div>
              <input type="text" name ="email" value "<%=(String)vt.elementAt(4)%>" />
              
            </div>
            <div>
              <input type="text" name ="unm" value "<%=(String)vt.elementAt(5)%>" />
              
            </div>
            <div>
              <input type="text" name ="pw" value "<%=(String)vt.elementAt(6)%>" />
              
            </div>
            <div class="d-flex ">
              <button>
                UPDATE
              </button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>

  <!-- end contact section -->

  <!-- info section -->

  <section class="info_section  layout_padding2-top">
    <div class="social_container">
      <div class="social_box">
        <a href="">
          <i class="fa fa-facebook" aria-hidden="true"></i>
        </a>
        <a href="">
          <i class="fa fa-twitter" aria-hidden="true"></i>
        </a>
        <a href="">
          <i class="fa fa-instagram" aria-hidden="true"></i>
        </a>
        <a href="">
          <i class="fa fa-youtube" aria-hidden="true"></i>
        </a>
      </div>
    </div>
    <div class="info_container ">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-3">
            <h6>
              ABOUT US
            </h6>
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doLorem ipsum dolor sit amet, consectetur adipiscing elit, sed doLorem ipsum dolor sit amet,
            </p>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="info_form ">
              <h5>
                Newsletter
              </h5>
              <form action="#">
                <input type="email" placeholder="Enter your email">
                <button>
                  Subscribe
                </button>
              </form>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <h6>
              NEED HELP
            </h6>
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doLorem ipsum dolor sit amet, consectetur adipiscing elit, sed doLorem ipsum dolor sit amet,
            </p>
          </div>
          <div class="col-md-6 col-lg-3">
            <h6>
              CONTACT US
            </h6>
            <div class="info_link-box">
              <a href="">
                <i class="fa fa-map-marker" aria-hidden="true"></i>
                <span> Gb road 123 london Uk </span>
              </a>
              <a href="">
                <i class="fa fa-phone" aria-hidden="true"></i>
                <span>+01 12345678901</span>
              </a>
              <a href="">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <span> demo@gmail.com</span>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- footer section -->
    <%@ include file ="footer.jsp"%>
    <!-- footer section -->

  </section>

  <!-- end info section -->


  <script src="js/jquery-3.4.1.min.js"></script>
  <script src="js/bootstrap.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <script src="js/custom.js"></script>

</body>

</html>