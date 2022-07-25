package com.apps.realestateco.Model;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AGENT")
public class Agent {

    @Id
    @Column(name = "AGENT_ID")
    private Long agentId;
    @Column(name = "AGENT_NAME")
    private String agentName;
    @Column(name = "PHONE_NUMBER")
    private int phoneNumber;
    @Column(name = "EMAIL")
    private VarcharTypeDescriptor email;

    public Agent(Long agentId, String agentName, int phoneNumber, VarcharTypeDescriptor email) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Agent() {

    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VarcharTypeDescriptor getEmail() {
        return email;
    }

    public void setEmail(VarcharTypeDescriptor email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId=" + agentId +
                ", agentName='" + agentName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email +
                '}';
    }
}
