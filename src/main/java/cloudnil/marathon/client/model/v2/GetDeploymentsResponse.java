package cloudnil.marathon.client.model.v2;

import java.util.List;

import cloudnil.marathon.client.utils.ModelUtils;

public class GetDeploymentsResponse {
	private List<Deployment> deployments;

	public List<Deployment> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this); 
	}
}
