//Subclass for Staff//
class Staff extends Person {
    private String department;

    //initialize fields//
    public Staff(String name, int id, String department) {
        super (name, id);
        this.department = department;
    }
    //Override display method//
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
