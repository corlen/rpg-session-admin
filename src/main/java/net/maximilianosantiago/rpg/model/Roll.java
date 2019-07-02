package net.maximilianosantiago.rpg.model;

public class Roll {

	Long id;
	Integer dieFace;
	Integer quantity;
	Integer bonusIncrement;
	Long playerId;
	Long sessionId;
	Integer sum;
	
	public Roll(Long id, Integer dieFace, Integer quantity, Integer bonusIncrement, Long playerId, Long sessionId,
			Integer sum) {
		this.id = id;
		this.dieFace = dieFace;
		this.quantity = quantity;
		this.bonusIncrement = bonusIncrement;
		this.playerId = playerId;
		this.sessionId = sessionId;
		this.sum = sum;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getDieFace() {
		return dieFace;
	}
	public void setDieFace(Integer dieFace) {
		this.dieFace = dieFace;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getBonusIncrement() {
		return bonusIncrement;
	}
	public void setBonusIncrement(Integer bonusIncrement) {
		this.bonusIncrement = bonusIncrement;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
}
