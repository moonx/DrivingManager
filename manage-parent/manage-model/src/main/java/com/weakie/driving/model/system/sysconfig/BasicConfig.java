package com.weakie.driving.model.system.sysconfig;


public class BasicConfig {

	private String startTime;//15:20
	private DebitedPeriod debPeriod;
	private double debAmount;
	private int recoveryTime;
	private boolean callDriverDirectly;
	private String companyURL;

	public BasicConfig() {
		super();
	}
	
	public BasicConfig(String startTime, DebitedPeriod debPeriod, double debAmount, int recoveryTime,
			boolean callDriverDirectly, String companyURL) {
		super();
		this.startTime = startTime;
		this.debPeriod = debPeriod;
		this.debAmount = debAmount;
		this.recoveryTime = recoveryTime;
		this.callDriverDirectly = callDriverDirectly;
		this.companyURL = companyURL;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public DebitedPeriod getDebPeriod() {
		return debPeriod;
	}
	public void setDebPeriod(DebitedPeriod debPeriod) {
		this.debPeriod = debPeriod;
	}
	public double getDebAmount() {
		return debAmount;
	}
	public void setDebAmount(double debAmount) {
		this.debAmount = debAmount;
	}
	public int getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(int recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	public boolean isCallDriverDirectly() {
		return callDriverDirectly;
	}
	public void setCallDriverDirectly(boolean callDriverDirectly) {
		this.callDriverDirectly = callDriverDirectly;
	}
	public String getCompanyURL() {
		return companyURL;
	}
	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	@Override
	public String toString() {
		return "BasicConfig [startTime=" + startTime + ", debPeriod=" + debPeriod + ", debAmount=" + debAmount
				+ ", recoveryTime=" + recoveryTime + ", callDriverDirectly=" + callDriverDirectly + ", companyURL="
				+ companyURL + "]";
	}
	
}
