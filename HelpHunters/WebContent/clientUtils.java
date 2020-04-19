public class clientUtils {
    public static String header(String title) {
        return header(title, null);
    }
	 public static String header(String user) {
		 
        StringBuilder str = new StringBuilder();
        str.append("<!DOCTYPE HTML>");
        str.append("<html>");
		str.append("<header id='header-container' class='fullwidth transparent-header'>");
		str.append("<div id='header'>");
		str.append("<div class='container'>");
		str.append("<div class='left-side'>");
		str.append("<div id='logo'>");
		str.append("<a href='index.html'><img src='images/logo.png' data-sticky-logo='images/logo.png' data-transparent-logo='images/logo.png' alt=''></a>");
		str.append("</div>");
		str.append("</div>");
		str.append("<div class='right-side'>");
		str.append("<div class='header-widget'>");
		str.append("<div class='header-notifications user-menu'>");
		str.append("<div class='header-notifications-trigger'>");
		str.append("<a href='#'><div class='user-avatar status-online'><img src='images/random.png' alt=''></div></a>");
		str.append("</div>");
		str.append("<div class='header-notifications-dropdown'>");
		str.append("<div class='user-status'>");
		str.append("<div class='user-details'>");
		str.append("<div class='user-avatar status-online'><img src='images/random.png' alt=''></div>");
		str.append("<div class='user-name'>");
		str.append(""+ user +"");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("<ul class='user-menu-small-nav'>");
		str.append("<li><a href='clientProfile'><i class='icon-material-outline-dashboard'></i> View my Profile </a></li>");
		str.append("<li><a href='clientReviews'><i class='icon-material-outline-dashboard'></i> Reviews</a></li>");
		str.append("<li><a href='clientMessages'><i class='icon-material-outline-dashboard'></i> Messages</a></li>");
		str.append("<li><a href='clientJobs.html'><i class='icon-material-outline-dashboard'></i> Jobs</a></li>");
		str.append("<li><a href='clientSettings'><i class='icon-material-outline-settings'></i> Settings</a></li>");
		str.append("<li><a href='INICIO.html'><i class='icon-material-outline-power-settings-new'></i> Logout</a></li>");
		str.append("</ul>");
		str.append("");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</header>");
		str.append("<div class='clearfix'></div>");
		return str.toString();
	 }
	
    public static String footer(String user) {
        StringBuilder str = new StringBuilder();
		str.append("<div id='footer'>");
		str.append("<div class='footer-top-section'>");
		str.append("<div class='container'>");
		str.append("<div class='row'>");
		str.append("<div class='col-xl-12'>");
		str.append("<div class='footer-rows-container'>");
		str.append("<div class='footer-rows-left'>");
		str.append("<div class='footer-row'>");
		str.append("<div class='footer-row-inner footer-logo'>");
		str.append("<img src='images/logo.png' alt=''>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("<div class='footer-rows-right'>");
		str.append("<div class='footer-row'>");
		str.append("<div class='footer-row-inner'>");
		str.append("<ul class='footer-social-links'>");
		str.append("<li>");
		str.append("<a href='facebook.com' title='Facebook' data-tippy-placement='bottom' data-tippy-theme='light'>");
		str.append("<i class='icon-brand-facebook-f'></i>");
		str.append("</a>");
		str.append("</li>");
		str.append("<li>");
		str.append("<a href='twitter.com' title='Twitter' data-tippy-placement='bottom' data-tippy-theme='light'>");
		str.append("<i class='icon-brand-twitter'></i>");
		str.append("</a>");
		str.append("</li>");
		str.append("<li>");
		str.append("<a href='google.com' title='Google Plus' data-tippy-placement='bottom' data-tippy-theme='light'>");
		str.append("<i class='icon-brand-google-plus-g'></i>");
		str.append("</a>");
		str.append("</li>");
		str.append("<li>");
		str.append("<a href='linkedin.com' title='LinkedIn' data-tippy-placement='bottom' data-tippy-theme='light'>");
		str.append("<i class='icon-brand-linkedin-in'></i>");
		str.append("</a>");
		str.append("</li>");
		str.append("</ul>");
		str.append("<div class='clearfix'></div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("<div class='footer-bottom-section'>");
		str.append("<div class='container'>");
		str.append("<div class='row'>");
		str.append("<div class='col-xl-12'>");
		str.append("© 2020 <strong>Help Hunters</strong>. All Rights Reserved.");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
		str.append("</div>");
        str.append("</body>");
        str.append("</html>");
        return str.toString();
    }
}