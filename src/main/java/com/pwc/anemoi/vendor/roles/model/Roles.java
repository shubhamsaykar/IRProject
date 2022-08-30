//package com.pwc.anemoi.vendor.roles.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//import io.micronaut.core.annotation.NonNull;
//import io.micronaut.data.annotation.DateCreated;
//
//
//
//@Entity
//@Table(name = "roles")
//public class Roles {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	@NonNull
//	private int id;
//	
//	
//   private String roleName;
//    
//   private String numOfUsers;
//    
//   private String description;
//    
//   private boolean checked;
//    
//   private String accessItem;
//    
//   private String vendorTemplateAccess;
//    
//   private String dashboardAccess;
//    
//   private String  masterRepoAccess;
//    
//   private boolean status;
//   
//   @DateCreated
//   private Date createdOn;
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//public String getRoleName() {
//	return roleName;
//}
//
//public void setRoleName(String roleName) {
//	this.roleName = roleName;
//}
//
//public String getNumOfUsers() {
//	return numOfUsers;
//}
//
//public void setNumOfUsers(String numOfUsers) {
//	this.numOfUsers = numOfUsers;
//}
//
//public String getDescription() {
//	return description;
//}
//
//public void setDescription(String description) {
//	this.description = description;
//}
//
//public boolean isChecked() {
//	return checked;
//}
//
//public void setChecked(boolean checked) {
//	this.checked = checked;
//}
//
//public String getAccessItem() {
//	return accessItem;
//}
//
//public void setAccessItem(String accessItem) {
//	this.accessItem = accessItem;
//}
//
//public String getVendorTemplateAccess() {
//	return vendorTemplateAccess;
//}
//
//public void setVendorTemplateAccess(String vendorTemplateAccess) {
//	this.vendorTemplateAccess = vendorTemplateAccess;
//}
//
//public String getDashboardAccess() {
//	return dashboardAccess;
//}
//
//public void setDashboardAccess(String dashboardAccess) {
//	this.dashboardAccess = dashboardAccess;
//}
//
//public String getMasterRepoAccess() {
//	return masterRepoAccess;
//}
//
//public void setMasterRepoAccess(String masterRepoAccess) {
//	this.masterRepoAccess = masterRepoAccess;
//}
//
//public boolean isStatus() {
//	return status;
//}
//
//public void setStatus(boolean status) {
//	this.status = status;
//}
//
//public Date getCreatedOn() {
//	return createdOn;
//}
//
//public void setCreatedOn(Date createdOn) {
//	this.createdOn = createdOn;
//}
//
//@Override
//public String toString() {
//	return "Roles [id=" + id + ", roleName=" + roleName + ", numOfUsers=" + numOfUsers + ", description=" + description
//			+ ", checked=" + checked + ", accessItem=" + accessItem + ", vendorTemplateAccess=" + vendorTemplateAccess
//			+ ", dashboardAccess=" + dashboardAccess + ", masterRepoAccess=" + masterRepoAccess + ", status=" + status
//			+ ", createdOn=" + createdOn + "]";
//}
//
//public Roles(int id, String roleName, String numOfUsers, String description, boolean checked, String accessItem,
//		String vendorTemplateAccess, String dashboardAccess, String masterRepoAccess, boolean status, Date createdOn) {
//	super();
//	this.id = id;
//	this.roleName = roleName;
//	this.numOfUsers = numOfUsers;
//	this.description = description;
//	this.checked = checked;
//	this.accessItem = accessItem;
//	this.vendorTemplateAccess = vendorTemplateAccess;
//	this.dashboardAccess = dashboardAccess;
//	this.masterRepoAccess = masterRepoAccess;
//	this.status = status;
//	this.createdOn = createdOn;
//}
//
//public Roles() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//   
//   
//   
//}









package com.pwc.anemoi.vendor.roles.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.DateCreated;



@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@NonNull
	private int id;
	
	
   private String roleName;
    
   private String numOfUsers;
    
   private String description;
        
   private String accessItem;
    
   private String vendorTemplateAccess[];
    
   private String dashboardAccess[];
    
   private String  masterRepoAccess[];
    
   private boolean status;
   
   @DateCreated
   private Date createdOn;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}

public String getNumOfUsers() {
	return numOfUsers;
}

public void setNumOfUsers(String numOfUsers) {
	this.numOfUsers = numOfUsers;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}



public String getAccessItem() {
	return accessItem;
}

public void setAccessItem(String accessItem) {
	this.accessItem = accessItem;
}



public String[] getVendorTemplateAccess() {
	return vendorTemplateAccess;
}

public void setVendorTemplateAccess(String[] vendorTemplateAccess) {
	this.vendorTemplateAccess = vendorTemplateAccess;
}

public String[] getDashboardAccess() {
	return dashboardAccess;
}

public void setDashboardAccess(String[] dashboardAccess) {
	this.dashboardAccess = dashboardAccess;
}

public String[] getMasterRepoAccess() {
	return masterRepoAccess;
}

public void setMasterRepoAccess(String[] masterRepoAccess) {
	this.masterRepoAccess = masterRepoAccess;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public Date getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}

@Override
public String toString() {
	return "Roles [id=" + id + ", roleName=" + roleName + ", numOfUsers=" + numOfUsers + ", description=" + description
			+ ", accessItem=" + accessItem + ", vendorTemplateAccess=" + vendorTemplateAccess
			+ ", dashboardAccess=" + dashboardAccess + ", masterRepoAccess=" + masterRepoAccess + ", status=" + status
			+ ", createdOn=" + createdOn + "]";
}



public Roles(int id, String roleName, String numOfUsers, String description, String accessItem,
		String[] vendorTemplateAccess, String[] dashboardAccess, String[] masterRepoAccess, boolean status,
		Date createdOn) {
	super();
	this.id = id;
	this.roleName = roleName;
	this.numOfUsers = numOfUsers;
	this.description = description;
	this.accessItem = accessItem;
	this.vendorTemplateAccess = vendorTemplateAccess;
	this.dashboardAccess = dashboardAccess;
	this.masterRepoAccess = masterRepoAccess;
	this.status = status;
	this.createdOn = createdOn;
}

public Roles() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
   
}