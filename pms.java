
import java.util.Objects;
import java.util.Scanner;

public class pms {
    public static void main(String[] args) {

        // Welcoming the user
        System.out.println("|======|| P M S ||======|\n");

        // Declaring variables that we will use for our projectInfo class
        int projectNumber = 0; String projectName = ""; double erfNumber = 0.0;
        String buildingType = ""; String projectAddress = ""; int projectPrice = 0;
        int totalPaid = 0; String projectDeadline = ""; String customerName = "";

        // Declaring variables that we will use for our PersonDetails class
        String name = ""; String telNum = ""; String title = ""; String email = ""; String address = "";

        // Creating an instance of the projectInfo class
        projectInfo project = new projectInfo(projectNumber, projectName, buildingType,
                projectAddress, erfNumber, projectPrice, totalPaid, projectDeadline);

        // Creating an instance of the PersonDetails class
        PersonDetails contractor = new PersonDetails(name, title, telNum, email, address);

        // Presenting options to the user

        boolean run = true;

        while (run){
            // Presenting options to the user
            System.out.println("\nEnter 1 of the options below"
                +"\n1 - Capture Project Details"
                +"\n2 - Change project due date"
                +"\n3 - Change total amount of fee paid to date"
                +"\n4 - Update the contractor's contact details"
                +"\n5 - Exit");

            // Taking user input
            Scanner response = new Scanner(System.in);
            System.out.println("\nPlease enter option here: ");
            int userChoice = response.nextInt();


            // Executing the program accordingly
            if(userChoice == 1) {
                Scanner input = new Scanner(System.in);

                // Asking the ser to enter the name of project
                System.out.println("Enter project name: ");
                projectName = input.nextLine();
                project.setProjectName(projectName);

                // Asking the user to enter the project number
                System.out.println("Enter Project Number (Integer): ");
                projectNumber = input.nextInt();
                // updating the project number
                project.setProjectNumber(projectNumber);


                // Asking the user to enter the erf number
                System.out.println("Enter Project ERF Number(float/decimal): ");
                erfNumber = input.nextDouble();
                project.setErfNumber(erfNumber);
                input.nextLine(); // line to consume the \n character;


                // Asking the ser to enter the type of the building
                System.out.println("Enter Building Type: ");
                buildingType = input.nextLine();
                project.setBuildingType(buildingType);

                // Asking the user to enter the project address
                System.out.println("Enter Project Address: ");
                projectAddress = input.nextLine();
                project.setProjectAddress(projectAddress);


                // Asking the user to enter the project price
                System.out.println("Enter Project Price(Integer): ");
                projectPrice = input.nextInt();
                project.setTotalProjectCost(projectPrice);


                // Asking the user to enter the amount paid to date
                System.out.println("Enter Project amount paid so far(Integer): ");
                totalPaid = input.nextInt();
                project.setTotalPaid(totalPaid);

                // Asking the user to enter deadline of the project
                System.out.println("Enter Project Deadline(dd/mm/yyyy): ");
                String projectDeadline_ = input.next();
                project.setProjectDeadline(projectDeadline_);
                input.nextLine(); // line to consume the \n character;

                // Assigning the project name to the customerName if the user does not
                // provide a project name
                if (Objects.equals(projectName, "")){
                    // Asking the user to enter the name of the customer
                    System.out.println("Please Enter the name of the Customer: ");
                    customerName = input.next();
                    project.setProjectName(customerName);
                }


                // Informing user that the project details have been recorded
                System.out.println("Project details have been recorded successfully!\n");

                // Printing out the project information
                System.out.println("Below are the project Details:\n");
                System.out.println(project.getProjectDetails());
            }
            // if the user has chosen to Change project due date
            else if (userChoice == 2)
            {
                // informing the user that they cannot update the project due date since
                // they haven't added any project information
                if(projectNumber == 0){
                    System.out.println("ERROR!!\nYOU HAVE NOT RECORDED ANY PROJECT INFO!!" +
                            "\nPlease select OPTION - '1' so you nay record project info");
                }
                // if the user has chosen to Change project due date
                // after recording some project information
                else{
                    System.out.println("Please Enter New Project Deadline: ");
                    String newDeadline = response.next();
                    project.setProjectDeadline(newDeadline);

                    // Informing the user that their request has been processed
                    System.out.println("The due date has been updated\n");

                    //Printing out the project details
                    System.out.println(project.getProjectDetails());
                }

            }
            // if the user has chosen to Change project Amount Paid to Date
            else if(userChoice == 3)
            {
                System.out.println("Please Enter New total Amount Paid to Date: ");
                int newPaidToDate = response.nextInt();
                project.setTotalPaid(newPaidToDate);

                // Informing the user that their request has been processed
                System.out.println("The amount paid to date has been updated\n");

                //Printing out the project details
                System.out.println(project.getProjectDetails());
            }

            // if the user has chosen to update the contractors details
            else if(userChoice == 4)
            {
                // if the user has chosen to update the contractors details
                // while they haven't captured any contractor information
                if(name.length() == 0)
                {
                    // Getting the user to record the contractor's info before they can update iit
                    System.out.println("\nALERT!!!You Have Not Captured the Contractors Information yet." +
                            "\nPlease follow the following Prompts to record the Contractor's Details");

                    //******* Capturing Contractor's details **********

                    // Capturing contractor's name
                    System.out.println("Enter Contractors Name: ");
                    String newName = response.next();
                    contractor.setName(newName);
                    System.out.println("Success!!");

                    // Capturing contractor's title
                    System.out.println("Enter Contractors Title: ");
                    String newTitle = response.next();
                    contractor.setTitle(newTitle);
                    System.out.println("Success!!");

                    // Capturing contractor's tel number
                    System.out.println("Enter Contractors Tel Number: ");
                    String newTel = response.next();
                    contractor.setTelNum(newTel);
                    System.out.println("Success!!");

                    // Capturing contractor's email address
                    System.out.println("Enter Contractors Email: ");
                    String newEmail = response.next();
                    contractor.setEmail(newEmail);
                    System.out.println("Success!!");

                    // Capturing contractor's address
                    System.out.println("Enter Contractors Address: ");
                    String newAddress = response.next();
                    contractor.setAddress(newAddress);
                    System.out.println("Success!!");
                }
                //************| Updating Contractor's Details |************

                // Asking the user to select contractor info to update
                System.out.println("Select Contractor Detail to Update:" +
                        "\n1 - Name\n2 - Tel Num\n3 - Email Address\n4 - Physical Address");

                System.out.println("Please Enter Option Here: ");
                int option = response.nextInt();

                // if user selects to change contractor name
                if(option == 1){
                    System.out.println("Please Enter New Name: ");
                    String newContractorName = response.next();
                    contractor.setName(newContractorName);

                    // Informing the user that their request has been processed
                    System.out.println("The contractor's has been updated\n");

                    //Printing out the project details
                    System.out.println(contractor.printPersonInfo());
                }
                // if user selects to change contractor tel number
                else if (option == 2){
                    System.out.println("Please Enter New Tel Number: ");
                    String newContractorTel = response.next();
                    contractor.setTelNum(newContractorTel);

                    // Informing the user that their request has been processed
                    System.out.println("The contractor's tel number has been updated\n");

                    //Printing out the project details
                    System.out.println(contractor.printPersonInfo());
                }
                // if user selects to change contractor email address
                if(option == 3){
                    System.out.println("Please Enter New Email Address: ");
                    String newContractorMail = response.next();
                    contractor.setEmail(newContractorMail);

                    // Informing the user that their request has been processed
                    System.out.println("The contractor's email address has been updated\n");

                    //Printing out the project details
                    System.out.println(contractor.printPersonInfo());
                }
                // if user selects to change contractor physical address
                if(option == 4){
                    System.out.println("Please Enter New Physical Address: ");
                    String newAddress = response.next();
                    contractor.setAddress(newAddress);

                    // Informing the user that their request has been processed
                    System.out.println("The contractor's address has been updated\n");

                    //Printing out the project details
                    System.out.println(contractor.printPersonInfo());
                }
            }
            // If the user has chosen to stop the program
            else if (userChoice == 5){
                System.out.println("\nThank You For Using:\n||=======|| P M S ||=======||" +
                "Until Next Time ----- Bye! :)");
                run = false;
            }
            System.out.println(projectDeadline);

        }
    }
}
