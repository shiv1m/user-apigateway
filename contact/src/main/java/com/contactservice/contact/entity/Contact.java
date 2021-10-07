package com.contactservice.contact.entity;
import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String mobileNumber;
    private String emailId;
    private String contactName;
    private String address;
    private Long userId;

    public Contact() {
    }

    public Contact(Long contactId, String mobileNumber, String emailId, String contactName, String address, Long userId) {
        this.contactId = contactId;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.contactName = contactName;
        this.address = address;
        this.userId = userId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactName='" + contactName + '\'' +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                '}';
    }
}
