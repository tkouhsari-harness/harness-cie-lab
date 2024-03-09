package com.nikp.payment.domain;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Value;

public class PaymentDto {

    private String userId;
    private String accountFrom;
    private String accountTo;
    private Long amount;
    private String bankValidation="";
    
    

	public String getBankValidation() {
		return bankValidation;
	}

	public void setBankValidation(String bankValidation) {
		this.bankValidation = bankValidation;
	}

	@Value( "${harness.build}" )
	private String buildNumber;

   public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}


	public PaymentDto() {
    }

    public PaymentDto(String userId, String accountFrom, String accountTo, Long amount) {
        this.userId = userId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
            "userId='" + userId + '\'' +
            ", accountFrom='" + accountFrom + '\'' +
            ", accountTo='" + accountTo + '\'' +
            ", amount=" + amount +
            '}';
    }
}
