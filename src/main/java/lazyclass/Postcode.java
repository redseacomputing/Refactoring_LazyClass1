package lazyclass;

public class Postcode {
    private final String postcode;

    public Postcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPostcodeArea(){
        return postcode.split(" ")[0];
    }

}