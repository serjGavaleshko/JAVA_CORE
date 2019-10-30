public class Student extends  Person{
    private String response;

    private void studak(){
        response = "Sheat_its works";
        System.out.println(response);

    }

    public String getResponse() {
        studak();
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
            }


}
