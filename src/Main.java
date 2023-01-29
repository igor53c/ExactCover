import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Feature feature1 = new Feature("Daten- und Identitätsdiebstahl");
//        Feature feature2 = new Feature("Telefonische Anwaltsberatung");
//        Feature feature3 = new Feature("Vertrags- und Sachenrecht");
//        Feature feature4 = new Feature("Steuerrecht");
//        Feature feature5 = new Feature("Rechtsschutz bei Unfällen");
//        Feature feature6 = new Feature("Mieterhöhungen");
//        Feature feature7 = new Feature("Schlichtung bei Rank the Code");
//        Feature feature8 = new Feature("Strafrecht");
//
//        Insurance insurance1 = new Insurance(
//                feature1,
//                feature2,
//                feature3,
//                feature4
//        );
//
//        Insurance insurance2 = new Insurance(
//                feature2,
//                feature5
//        );
//
//        Insurance insurance3 = new Insurance(
//                feature2,
//                feature6
//        );
//
//        InsuranceProvider insuranceProvider = InsuranceProvider.getInstance();
//
//        insuranceProvider.setInsurances(insurance1, insurance2, insurance3);
//
//        List<Insurance> insuranceList = InsuranceMatcher.getInsurancesByFeature(feature7);
//
//        for(Insurance insurance : insuranceList)
//            System.out.println(insurance.toString());
//
//        System.out.println("-----------------------------------------------");
//
//        insuranceList =
//                InsuranceMatcher.getMatchingInsurances(
//                        feature3,
//                        feature5,
//                        feature6
//                );
//
//        for(Insurance insurance : insuranceList)
//            System.out.println(insurance.toString());

        Feature a = new Feature("A");
        Feature b = new Feature("B");
        Feature c = new Feature("C");
        Feature d = new Feature("D");
        Feature e = new Feature("E");
        Feature f = new Feature("F");
        Feature g = new Feature("G");
        Feature h = new Feature("H");
        Feature i = new Feature("I");

        Insurance insurance1 = new Insurance( a, b, c);
        Insurance insurance2 = new Insurance( d, e, f, g, h, i);
        Insurance insurance3 = new Insurance( g, h, i);
        Insurance insurance4 = new Insurance( c, f);
        Insurance insurance5 = new Insurance( b, e, h);
        Insurance insurance6 = new Insurance( d, e);

        InsuranceProvider insuranceProvider = InsuranceProvider.getInstance();

        insuranceProvider.setInsurances(insurance1, insurance2, insurance3, insurance4, insurance5, insurance6);

        List<Insurance> insuranceList = InsuranceMatcher.getPerfectMatchingInsurances( a, b, c, d, e, g, h, i);

        for(Insurance insurance : insuranceList)
            System.out.println(insurance.toString());
    }
}