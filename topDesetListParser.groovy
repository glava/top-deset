/**
 * Created by IntelliJ IDEA.
 * User: glava
 * Date: 10.12.11.
 * Time: 12.40
 * To change this template use File | Settings | File Templates.
 */
def file = "liste/indigo.txt"
def playMarkup = " ▷ <a class='playLink' href='#'>play</a>";
def spanStart = "<span>";
def spanNevidljiv = "<span class='nevidljiv'>";
def spanEnd = "</span>";
def brMarkup = "<br />";
def pEnd = "</p>";

String prepareYoutubeString(String s) {
    //format should be youtube.com/v/ID_FROM_YOUTUBE
    return s.replace("http://www.", "").replace("watch?v=", "v/");

}

String result = "<p>";
new File(file).eachLine { String line ->
    //each line got striped and redressed for html
    String[] lineShardes = line.split("#");
    result += (spanStart + lineShardes[0].trim() + playMarkup + spanNevidljiv + prepareYoutubeString(lineShardes[1].trim()) + spanEnd + spanEnd + brMarkup)

}
result += pEnd
println(result)

