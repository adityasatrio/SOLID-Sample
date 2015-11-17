package ocp;

import ocp.good.ClaimApprovalManager;
import ocp.good.HealthInsuranceSurveyor;
import ocp.good.VehicleInsuranceSurveyor;

import org.junit.Test;

public class TestClaimApprovalManager {

	@Test
	public void testProcessClaim() throws Exception {
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		ClaimApprovalManager claim1 = new ClaimApprovalManager();
		claim1.processClaim(healthInsuranceSurveyor);

		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager claim2 = new ClaimApprovalManager();
		claim2.processClaim(vehicleInsuranceSurveyor);
	}

}
