import java.math.BigDecimal;

public class projectInfo {
    // Attributes
    private int projectNumber;
    String projectName;
    private String buildingType;
    private String projectAddress;
    private double erfNumber;
    private int totalProjectCost;
    private int totalPaid;
    private String projectDeadline;

    // Methods
    public projectInfo(int projectNumber, String projectName, String buildingType,
                       String projectAddress, double erfNumber, int totalProjectCost, int totalPaid,
                       String projectDeadline)
    {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.erfNumber = erfNumber;
        this.totalProjectCost = totalProjectCost;
        this.totalPaid = totalPaid;
        this.projectDeadline = projectDeadline;
    }

    // Getters and Setters
    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public double getErfNumber() {
        return erfNumber;
    }

    public void setErfNumber(double erfNumber) {
        this.erfNumber = erfNumber;
    }

    public int getTotalProjectCost() {
        return totalProjectCost;
    }

    public void setTotalProjectCost(int totalProjectCost) {
        this.totalProjectCost = totalProjectCost;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(int totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getProjectDeadline() {
        return projectDeadline;
    }

    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }

    // A method to print out the project info in a user-friendly manner
    public String getProjectDetails() {
        String outPut = "Project Number: " + projectNumber;
        outPut += "\nProject Name: " + projectName;
        outPut += "\nBuilding Type: " + buildingType;
        outPut += "\nAddress: " + projectAddress;
        outPut += "\nERF Number: " + erfNumber;
        outPut += "\nTotal Project Cost: " + totalProjectCost;
        outPut += "\nTotal Paid: " + totalPaid;
        outPut += "\nProject Deadline: " + getProjectDeadline();
        outPut += " ";

        return outPut;

    }


}
