package hello;

public class Rev {

    
    private final String content;

    public Rev( String content) {
        String ans="";
        for (int i=0;i<content.length();i++){
            ans=content.charAt(i)+ans;
        }
        this.content=ans;
    }


    public String getContent() {
        return content;
    }

    public String revContent(String name) {
         String ans="";
        for (int i=0;i<name.length();i++){
            ans=name.charAt(i)+ans;
        }
        return ans;
    }
}