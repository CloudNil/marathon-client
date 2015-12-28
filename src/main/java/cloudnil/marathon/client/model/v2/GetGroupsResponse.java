package cloudnil.marathon.client.model.v2;

import java.util.Collection;

import cloudnil.marathon.client.utils.ModelUtils;

public class GetGroupsResponse {
	private Collection<Group> groups;
	
	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
