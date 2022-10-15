public class Main {
    public static void main(String[] args) {

//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();
//
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setCity("Ankara");
//
////        CustomerManager customerManager =new CustomerManager(customer);
////        customerManager.save();
////        customerManager.delete();
//
//        Company company = new Company();
//        company.setTaxNumber("12345");
//        company.setCompanyName("Arçelik");
//        company.setId(100);
//
//        CustomerManager customerManager2 = new CustomerManager(new Person(), new TeacherCreditManager());
//
//        Person person = new Person();
//        person.setNationalIdentity("12345");

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();
    }
}