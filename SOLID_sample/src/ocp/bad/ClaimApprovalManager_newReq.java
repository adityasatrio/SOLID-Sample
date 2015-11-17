package ocp.bad;

public class ClaimApprovalManager_newReq {

	public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
		if (surveyor.isValidClaim()) {
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
	}

	/** new requirement */
	public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
		if (surveyor.isValidClaim()) {
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
	}
}
