package allbegray.slack.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	protected String id;
	protected String team_id;
	protected String name;
	protected Boolean deleted;
	protected String color;
	protected String real_name;
	protected String tz;
	protected String tz_label;
	protected Integer tz_offset;
	protected Profile profile;
	protected Boolean is_admin;
	protected Boolean is_owner;
	protected Boolean is_primary_owner;
	protected Boolean is_restricted;
	protected Boolean is_ultra_restricted;
	protected Boolean is_bot;
	protected Boolean is_stranger;
	protected Integer updated;
	protected Boolean is_app_user;
	protected Boolean has_2fa;
	protected String locale;
	protected String two_factor_type;
	protected Boolean has_files;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public String getTz_label() {
		return tz_label;
	}

	public void setTz_label(String tz_label) {
		this.tz_label = tz_label;
	}

	public Integer getTz_offset() {
		return tz_offset;
	}

	public void setTz_offset(Integer tz_offset) {
		this.tz_offset = tz_offset;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Boolean getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Boolean is_admin) {
		this.is_admin = is_admin;
	}

	public Boolean getIs_owner() {
		return is_owner;
	}

	public void setIs_owner(Boolean is_owner) {
		this.is_owner = is_owner;
	}

	public Boolean getIs_primary_owner() {
		return is_primary_owner;
	}

	public void setIs_primary_owner(Boolean is_primary_owner) {
		this.is_primary_owner = is_primary_owner;
	}

	public Boolean getIs_restricted() {
		return is_restricted;
	}

	public void setIs_restricted(Boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	public Boolean getIs_ultra_restricted() {
		return is_ultra_restricted;
	}

	public void setIs_ultra_restricted(Boolean is_ultra_restricted) {
		this.is_ultra_restricted = is_ultra_restricted;
	}

	public Boolean getIs_bot() {
		return is_bot;
	}

	public void setIs_bot(Boolean is_bot) {
		this.is_bot = is_bot;
	}

	public Boolean getIs_stranger() {
		return is_stranger;
	}

	public void setIs_stranger(Boolean is_stranger) {
		this.is_stranger = is_stranger;
	}

	public Integer getUpdated() {
		return updated;
	}

	public void setUpdated(Integer updated) {
		this.updated = updated;
	}

	public Boolean getIs_app_user() {
		return is_app_user;
	}

	public void setIs_app_user(Boolean is_app_user) {
		this.is_app_user = is_app_user;
	}

	public Boolean getHas_2fa() {
		return has_2fa;
	}

	public void setHas_2fa(Boolean has_2fa) {
		this.has_2fa = has_2fa;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTwo_factor_type() {
		return two_factor_type;
	}

	public void setTwo_factor_type(String two_factor_type) {
		this.two_factor_type = two_factor_type;
	}

	public Boolean getHas_files() {
		return has_files;
	}

	public void setHas_files(Boolean has_files) {
		this.has_files = has_files;
	}

	@Override
	public String toString() {
		return "User [" +
				"id='" + id + '\'' +
				", team_id='" + team_id + '\'' +
				", name='" + name + '\'' +
				", deleted=" + deleted +
				", color='" + color + '\'' +
				", real_name='" + real_name + '\'' +
				", tz='" + tz + '\'' +
				", tz_label='" + tz_label + '\'' +
				", tz_offset=" + tz_offset +
				", profile=" + profile +
				", is_admin=" + is_admin +
				", is_owner=" + is_owner +
				", is_primary_owner=" + is_primary_owner +
				", is_restricted=" + is_restricted +
				", is_ultra_restricted=" + is_ultra_restricted +
				", is_bot=" + is_bot +
				", is_stranger=" + is_stranger +
				", updated=" + updated +
				", is_app_user=" + is_app_user +
				", has_2fa=" + has_2fa +
				", locale='" + locale + '\'' +
				", two_factor_type='" + two_factor_type + '\'' +
				", has_files=" + has_files +
				']';
	}
}
