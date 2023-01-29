import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsuranceProvider {
    private static InsuranceProvider INSTANCE;
    private List<Insurance> insurances = new LinkedList<>();
    private List<Feature> features = new LinkedList<>();

    private InsuranceProvider() {

    }

    public static InsuranceProvider getInstance() {
        if (InsuranceProvider.INSTANCE == null) {
            InsuranceProvider.INSTANCE = new InsuranceProvider();
        }
        return InsuranceProvider.INSTANCE;
    }

    public List<Insurance> getAllInsurances() {
        return this.insurances;
    }

    public void setInsurances(Insurance... insurances) {
        this.insurances = Arrays.asList(insurances);
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Feature... features) {
        this.features = Arrays.asList(features);
    }
}
