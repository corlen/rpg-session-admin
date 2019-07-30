package net.maximilianosantiago.rpg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roll {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	Integer dieFace;
	Integer quantity;
	Integer bonusIncrement = 0;
	Long playerId;
	Long sessionId;
	Integer sum;
	Long rolledDate;
	Integer[] rolledDice;
	Integer maxValue;
	Integer minValue;
	
	public Roll() { }
	
	public Roll(Long id, Integer dieFace, Integer quantity, Integer bonusIncrement, Long playerId, Long sessionId,
			Integer sum, Long rolledDate, Integer[] rolledDice, Integer maxValue, Integer minValue) {
		this.id = id;
		this.dieFace = dieFace;
		this.quantity = quantity;
		this.bonusIncrement = bonusIncrement;
		this.playerId = playerId;
		this.sessionId = sessionId;
		this.sum = sum;
		this.rolledDate = rolledDate;
		this.rolledDice = rolledDice;
		this.maxValue = maxValue;
		this.minValue = minValue;
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
	public Integer[] getRolledDice() {
		return rolledDice;
	}

	public void setRolledDice(Integer[] rolledDice) {
		this.rolledDice = rolledDice;
	}

	public Integer getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	public Integer getMinValue() {
		return minValue;
	}

	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}

	public Long getRolledDate() {
		return rolledDate;
	}

	public void setRolledDate(Long rolledDate) {
		this.rolledDate = rolledDate;
	}
	
}
