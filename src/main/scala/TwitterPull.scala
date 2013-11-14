import org.apache.http.client.HttpClient
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.client.methods.HttpGet
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer
import org.apache.commons.io.IOUtils
 
object TwitterPull {
 
   val AccessToken = "access token for your app";
   val AccessSecret = "access secret for your app";
   val ConsumerKey = "consumer key for your app";
   val ConsumerSecret = "consumer secret for your app";
 
 
  def main(args: Array[String]) {
 
  val consumer = new CommonsHttpOAuthConsumer(ConsumerKey,ConsumerSecret);
   consumer.setTokenWithSecret(AccessToken, AccessSecret);
 
     val request = new HttpGet("http://api.twitter.com/1.1/followers/ids.json?cursor=-1&screen_name=josdirksen");
     consumer.sign(request);
     val client = new DefaultHttpClient();
     val response = client.execute(request);
 
     println(response.getStatusLine().getStatusCode());
     println(IOUtils.toString(response.getEntity().getContent()));
  }
}