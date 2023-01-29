import java.util.*;

public class InsuranceMatcher {
    public static List<Insurance> getInsurancesByFeature(Feature feature) {

        List<Insurance> retValue = new ArrayList<>();

        InsuranceProvider insuranceProvider = InsuranceProvider.getInstance();

        List<Insurance> insuranceList = insuranceProvider.getAllInsurances();

        for (Insurance insurance : insuranceList) {
            List<Feature> featureList = insurance.getFeatures();

            if(featureList.contains(feature))
                retValue.add(insurance);
        }

        return retValue;
    }

    public static List<Insurance> getMatchingInsurances(Feature... features) {
        List<Insurance> retValue = new ArrayList<>();

        InsuranceProvider insuranceProvider = InsuranceProvider.getInstance();

        List<Insurance> insuranceList = insuranceProvider.getAllInsurances();

        for (Insurance insurance : insuranceList) {
            List<Feature> featureList = insurance.getFeatures();

            for (Feature feature : features) {
                if(featureList.contains(feature))
                    retValue.add(insurance);
            }
        }

        return retValue;
    }

    public static List<Insurance> getPerfectMatchingInsurances(Feature... features) {

        Set<Insurance> perfectMatch = new HashSet<>();
        Set<Feature> allFeatures = new HashSet<>(Arrays.asList(features));

        InsuranceProvider insuranceProvider = InsuranceProvider.getInstance();

        List<Insurance> insuranceList = insuranceProvider.getAllInsurances();

        for (Insurance insurance : insuranceList) {
            if(allFeatures.containsAll(insurance.getFeatures())){
                perfectMatch.add(insurance);

                insurance.getFeatures().forEach(allFeatures::remove);
            }
        }

        if(allFeatures.isEmpty())
            return new ArrayList<>(perfectMatch);
        else
            return new ArrayList<>();
    }
}
