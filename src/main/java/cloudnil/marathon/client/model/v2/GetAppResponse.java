package cloudnil.marathon.client.model.v2;

import cloudnil.marathon.client.utils.ModelUtils;

public class GetAppResponse {
	private App app;

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
