package ie.atu.oop.labexam;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class WORKSHOP {
    private String workshopName;
    private int capacity;
    Set<String>studentId=new HashSet<>();
    public WORKSHOP(String workshopName,int capacity) {

        this.workshopName=workshopName;
        this.capacity=capacity;

    }
    public String getWorkshopName() {
        return workshopName;
    }
    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;

    }
    public int getCapacity() {
        return capacity;

    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
