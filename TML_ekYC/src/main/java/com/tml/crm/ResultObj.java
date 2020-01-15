package com.tml.crm;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/*
@XmlType(name = "", propOrder = {
		"status","name","canFlag","rc_body_type_desc","rc_chasi_no","rc_color","rc_cubic_cap","rc_eng_no","rc_f_name",
		"rc_financer","rc_fit_upto","rc_fuel_desc","rc_gvw","rc_insurance_comp","rc_insurance_policy_no","rc_insurance_upto",
		"rc_maker_desc","rc_maker_model","rc_manu_month_yr","rc_mobile_no","rc_no_cyl","rc_norms_desc","rc_owner_name",
		"rc_permanent_address","rc_present_address","rc_registered_at","rc_regn_dt","rc_regn_no","rc_seat_cap",
		"rc_sleeper_cap","rc_stand_cap","rc_status_as_on","rc_tax_upto","rc_unld_wt","rc_vch_catg","rc_vh_class_desc",
		"rc_wheelbase","stautsMessage","issue_date","father_husband","img","blood_group","dob","dl_number","address",
		"ps_lat_long","rln_name_v1","rln_name_v2","rln_name_v3","part_no","rln_type","section_no","id","epic_no",
		"rln_name","district","last_update","state","ac_no","slno_inpart","ps_name","pc_name","house_no","part_name",
		"st_code","gender","age","ac_name","name_v1","name_v3","name_v2","aadhaarNo","approximateSubsidyAvailed",
		"bankAccountNo","bankName","consumerAddress","consumerContact","consumerEmail","consumerName","consumerNo",
		"distributorAddress","distributorCode","distributorName","givenUpSubsidy",
		"iFSCCode","lastBookingDate","subsidizedRefillConsumed","totalRefillConsumed","city_town","pin","message",
		
		"pradr","validity","cov_details","sim_details_status","contact","device","history","identity","profile",
		"sim_details","dateOfIssue","passportNumber","namedetails"

}) */

import com.fasterxml.jackson.annotation.JsonFormat;



@XmlType(name = "", propOrder = {
		"status","name","canFlag","rc_body_type_desc","rc_chasi_no","rc_color","rc_cubic_cap","rc_eng_no","rc_f_name",
		"rc_financer","rc_fit_upto","rc_fuel_desc","rc_gvw","rc_insurance_comp","rc_insurance_policy_no","rc_insurance_upto",
		"rc_maker_desc","rc_maker_model","rc_manu_month_yr","rc_mobile_no","rc_no_cyl","rc_norms_desc","rc_owner_name",
		"rc_permanent_address","rc_present_address","rc_registered_at","rc_regn_dt","rc_regn_no","rc_seat_cap",
		"rc_sleeper_cap","rc_stand_cap","rc_status_as_on","rc_tax_upto","rc_unld_wt","rc_vch_catg","rc_vh_class_desc",
		"rc_wheelbase","stautsMessage","issue_date","father_husband","img","blood_group","dob","dl_number","address",
		"ps_lat_long","rln_name_v1","rln_name_v2","rln_name_v3","part_no","rln_type","section_no","id","epic_no",
		"rln_name","district","last_update","state","ac_no","slno_inpart","ps_name","pc_name","house_no","part_name",
		"st_code","gender","age","ac_name","name_v1","name_v3","name_v2","aadhaarNo","approximateSubsidyAvailed",
		"bankAccountNo","bankName","consumerAddress","consumerContact","consumerEmail","consumerName","consumerNo",
		"distributorAddress","distributorCode","distributorName","givenUpSubsidy",
		"iFSCCode","lastBookingDate","subsidizedRefillConsumed","totalRefillConsumed","city_town","pin","message","score",
		
		"pradr","validity","cov_details","contact","device","history","identity","profile",
		"sim_details","dateOfIssue","passportNumber","namedetails"

}) 

public class ResultObj {

	
	String status;
	String name;
	String canFlag;
	String rc_body_type_desc;
	String rc_chasi_no;
	String rc_color;
	String rc_cubic_cap;
	String rc_eng_no;
	String rc_f_name;
	String rc_financer;
	String rc_fit_upto;
	String rc_fuel_desc;
	String rc_gvw;
	String rc_insurance_comp;
	String rc_insurance_policy_no;
	String rc_insurance_upto;
	String rc_maker_desc;
	String rc_maker_model;
	String rc_manu_month_yr;
	String rc_mobile_no;
	String rc_no_cyl;
	String rc_norms_desc;
	String rc_owner_name;
	String rc_permanent_address;
	String rc_present_address;
	String rc_registered_at;
	String rc_regn_dt;
	String rc_regn_no;
	String rc_seat_cap;
	String rc_sleeper_cap;
	String rc_stand_cap;
	String rc_status_as_on;
	String rc_tax_upto;
	String rc_unld_wt;
	String rc_vch_catg;
	String rc_vh_class_desc;
	String rc_wheelbase;
	String stautsMessage;
	String issue_date;
	String father_husband;
	String img;
	String blood_group;
	String dob;
	String dl_number;
	String address;
	String ps_lat_long;
	String rln_name_v1;
	String rln_name_v2;
	String rln_name_v3;
	String part_no;
	String rln_type;
	String section_no;
	String id;
	String epic_no;
	String rln_name;
	String district;
	String last_update;
	String state;
	String ac_no;
	String slno_inpart;
	String ps_name;
	String pc_name;
	String house_no;
	String part_name;
	String st_code;
	String gender;
	String age;
	String ac_name;
	String name_v1;
	String name_v3;
	String name_v2;
	String aadhaarNo;
	String approximateSubsidyAvailed;
	String bankAccountNo;
	String bankName;
	String consumerAddress;
	String consumerContact;
	String consumerEmail;
	String consumerName;
	String consumerNo;
	String distributorAddress;
	String distributorCode;
	String distributorName;
	String givenUpSubsidy;
	String iFSCCode;
	String lastBookingDate;
	String subsidizedRefillConsumed;
	String totalRefillConsumed;
	String city_town;
	String pin;
	String message;
	String score;
	
	
	
	
	@XmlElement(name="pradr")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PradrObj> pradr ;
	
	
	@XmlElement(name="validity")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ValidityObj> validity ;
	
	@XmlElement(name="cov_details")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<Cov_detailsObj> cov_details ;
	//protected List<Sim_details_statusObj> sim_details_status ;
	
	@XmlElement(name="contact")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ContactObj> contact ;
	
	@XmlElement(name="device")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DeviceObj> device ;
	
	@XmlElement(name="history")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<HistoryObj> history ;
	
	@XmlElement(name="identity")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<IdentityObj> identity ;
	
	@XmlElement(name="profile")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ProfileObj> profile ;
	
	@XmlElement(name="sim_details")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<Sim_detailsObj> sim_details ;
	
	@XmlElement(name="dateOfIssue")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<DateOfIssueObj> dateOfIssue ;
	
	@XmlElement(name="passportNumber")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<PassportNumberObj> passportNumber ;
	
	@XmlElement(name="namedetails")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<NamedetailsObj> namedetails ;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCanFlag() {
		return canFlag;
	}

	public void setCanFlag(String canFlag) {
		this.canFlag = canFlag;
	}

	public String getRc_body_type_desc() {
		return rc_body_type_desc;
	}

	public void setRc_body_type_desc(String rc_body_type_desc) {
		this.rc_body_type_desc = rc_body_type_desc;
	}

	public String getRc_chasi_no() {
		return rc_chasi_no;
	}

	public void setRc_chasi_no(String rc_chasi_no) {
		this.rc_chasi_no = rc_chasi_no;
	}

	public String getRc_color() {
		return rc_color;
	}

	public void setRc_color(String rc_color) {
		this.rc_color = rc_color;
	}

	public String getRc_cubic_cap() {
		return rc_cubic_cap;
	}

	public void setRc_cubic_cap(String rc_cubic_cap) {
		this.rc_cubic_cap = rc_cubic_cap;
	}

	public String getRc_eng_no() {
		return rc_eng_no;
	}

	public void setRc_eng_no(String rc_eng_no) {
		this.rc_eng_no = rc_eng_no;
	}

	public String getRc_f_name() {
		return rc_f_name;
	}

	public void setRc_f_name(String rc_f_name) {
		this.rc_f_name = rc_f_name;
	}

	public String getRc_financer() {
		return rc_financer;
	}

	public void setRc_financer(String rc_financer) {
		this.rc_financer = rc_financer;
	}

	public String getRc_fit_upto() {
		return rc_fit_upto;
	}

	public void setRc_fit_upto(String rc_fit_upto) {
		this.rc_fit_upto = rc_fit_upto;
	}

	public String getRc_fuel_desc() {
		return rc_fuel_desc;
	}

	public void setRc_fuel_desc(String rc_fuel_desc) {
		this.rc_fuel_desc = rc_fuel_desc;
	}

	public String getRc_gvw() {
		return rc_gvw;
	}

	public void setRc_gvw(String rc_gvw) {
		this.rc_gvw = rc_gvw;
	}

	public String getRc_insurance_comp() {
		return rc_insurance_comp;
	}

	public void setRc_insurance_comp(String rc_insurance_comp) {
		this.rc_insurance_comp = rc_insurance_comp;
	}

	public String getRc_insurance_policy_no() {
		return rc_insurance_policy_no;
	}

	public void setRc_insurance_policy_no(String rc_insurance_policy_no) {
		this.rc_insurance_policy_no = rc_insurance_policy_no;
	}

	public String getRc_insurance_upto() {
		return rc_insurance_upto;
	}

	public void setRc_insurance_upto(String rc_insurance_upto) {
		this.rc_insurance_upto = rc_insurance_upto;
	}

	public String getRc_maker_desc() {
		return rc_maker_desc;
	}

	public void setRc_maker_desc(String rc_maker_desc) {
		this.rc_maker_desc = rc_maker_desc;
	}

	public String getRc_maker_model() {
		return rc_maker_model;
	}

	public void setRc_maker_model(String rc_maker_model) {
		this.rc_maker_model = rc_maker_model;
	}

	public String getRc_manu_month_yr() {
		return rc_manu_month_yr;
	}

	public void setRc_manu_month_yr(String rc_manu_month_yr) {
		this.rc_manu_month_yr = rc_manu_month_yr;
	}

	public String getRc_mobile_no() {
		return rc_mobile_no;
	}

	public void setRc_mobile_no(String rc_mobile_no) {
		this.rc_mobile_no = rc_mobile_no;
	}

	public String getRc_no_cyl() {
		return rc_no_cyl;
	}

	public void setRc_no_cyl(String rc_no_cyl) {
		this.rc_no_cyl = rc_no_cyl;
	}

	public String getRc_norms_desc() {
		return rc_norms_desc;
	}

	public void setRc_norms_desc(String rc_norms_desc) {
		this.rc_norms_desc = rc_norms_desc;
	}

	public String getRc_owner_name() {
		return rc_owner_name;
	}

	public void setRc_owner_name(String rc_owner_name) {
		this.rc_owner_name = rc_owner_name;
	}

	public String getRc_permanent_address() {
		return rc_permanent_address;
	}

	public void setRc_permanent_address(String rc_permanent_address) {
		this.rc_permanent_address = rc_permanent_address;
	}

	public String getRc_present_address() {
		return rc_present_address;
	}

	public void setRc_present_address(String rc_present_address) {
		this.rc_present_address = rc_present_address;
	}

	public String getRc_registered_at() {
		return rc_registered_at;
	}

	public void setRc_registered_at(String rc_registered_at) {
		this.rc_registered_at = rc_registered_at;
	}

	public String getRc_regn_dt() {
		return rc_regn_dt;
	}

	public void setRc_regn_dt(String rc_regn_dt) {
		this.rc_regn_dt = rc_regn_dt;
	}

	public String getRc_regn_no() {
		return rc_regn_no;
	}

	public void setRc_regn_no(String rc_regn_no) {
		this.rc_regn_no = rc_regn_no;
	}

	public String getRc_seat_cap() {
		return rc_seat_cap;
	}

	public void setRc_seat_cap(String rc_seat_cap) {
		this.rc_seat_cap = rc_seat_cap;
	}

	public String getRc_sleeper_cap() {
		return rc_sleeper_cap;
	}

	public void setRc_sleeper_cap(String rc_sleeper_cap) {
		this.rc_sleeper_cap = rc_sleeper_cap;
	}

	public String getRc_stand_cap() {
		return rc_stand_cap;
	}

	public void setRc_stand_cap(String rc_stand_cap) {
		this.rc_stand_cap = rc_stand_cap;
	}

	public String getRc_status_as_on() {
		return rc_status_as_on;
	}

	public void setRc_status_as_on(String rc_status_as_on) {
		this.rc_status_as_on = rc_status_as_on;
	}

	public String getRc_tax_upto() {
		return rc_tax_upto;
	}

	public void setRc_tax_upto(String rc_tax_upto) {
		this.rc_tax_upto = rc_tax_upto;
	}

	public String getRc_unld_wt() {
		return rc_unld_wt;
	}

	public void setRc_unld_wt(String rc_unld_wt) {
		this.rc_unld_wt = rc_unld_wt;
	}

	public String getRc_vch_catg() {
		return rc_vch_catg;
	}

	public void setRc_vch_catg(String rc_vch_catg) {
		this.rc_vch_catg = rc_vch_catg;
	}

	public String getRc_vh_class_desc() {
		return rc_vh_class_desc;
	}

	public void setRc_vh_class_desc(String rc_vh_class_desc) {
		this.rc_vh_class_desc = rc_vh_class_desc;
	}

	public String getRc_wheelbase() {
		return rc_wheelbase;
	}

	public void setRc_wheelbase(String rc_wheelbase) {
		this.rc_wheelbase = rc_wheelbase;
	}

	public String getStautsMessage() {
		return stautsMessage;
	}

	public void setStautsMessage(String stautsMessage) {
		this.stautsMessage = stautsMessage;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getFather_husband() {
		return father_husband;
	}

	public void setFather_husband(String father_husband) {
		this.father_husband = father_husband;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDl_number() {
		return dl_number;
	}

	public void setDl_number(String dl_number) {
		this.dl_number = dl_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPs_lat_long() {
		return ps_lat_long;
	}

	public void setPs_lat_long(String ps_lat_long) {
		this.ps_lat_long = ps_lat_long;
	}

	public String getRln_name_v1() {
		return rln_name_v1;
	}

	public void setRln_name_v1(String rln_name_v1) {
		this.rln_name_v1 = rln_name_v1;
	}

	public String getRln_name_v2() {
		return rln_name_v2;
	}

	public void setRln_name_v2(String rln_name_v2) {
		this.rln_name_v2 = rln_name_v2;
	}

	public String getRln_name_v3() {
		return rln_name_v3;
	}

	public void setRln_name_v3(String rln_name_v3) {
		this.rln_name_v3 = rln_name_v3;
	}

	public String getPart_no() {
		return part_no;
	}

	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}

	public String getRln_type() {
		return rln_type;
	}

	public void setRln_type(String rln_type) {
		this.rln_type = rln_type;
	}

	public String getSection_no() {
		return section_no;
	}

	public void setSection_no(String section_no) {
		this.section_no = section_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEpic_no() {
		return epic_no;
	}

	public void setEpic_no(String epic_no) {
		this.epic_no = epic_no;
	}

	public String getRln_name() {
		return rln_name;
	}

	public void setRln_name(String rln_name) {
		this.rln_name = rln_name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAc_no() {
		return ac_no;
	}

	public void setAc_no(String ac_no) {
		this.ac_no = ac_no;
	}

	public String getSlno_inpart() {
		return slno_inpart;
	}

	public void setSlno_inpart(String slno_inpart) {
		this.slno_inpart = slno_inpart;
	}

	public String getPs_name() {
		return ps_name;
	}

	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}

	public String getPc_name() {
		return pc_name;
	}

	public void setPc_name(String pc_name) {
		this.pc_name = pc_name;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getPart_name() {
		return part_name;
	}

	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}

	public String getSt_code() {
		return st_code;
	}

	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public String getName_v1() {
		return name_v1;
	}

	public void setName_v1(String name_v1) {
		this.name_v1 = name_v1;
	}

	public String getName_v3() {
		return name_v3;
	}

	public void setName_v3(String name_v3) {
		this.name_v3 = name_v3;
	}

	public String getName_v2() {
		return name_v2;
	}

	public void setName_v2(String name_v2) {
		this.name_v2 = name_v2;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getApproximateSubsidyAvailed() {
		return approximateSubsidyAvailed;
	}

	public void setApproximateSubsidyAvailed(String approximateSubsidyAvailed) {
		this.approximateSubsidyAvailed = approximateSubsidyAvailed;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public String getConsumerContact() {
		return consumerContact;
	}

	public void setConsumerContact(String consumerContact) {
		this.consumerContact = consumerContact;
	}

	public String getConsumerEmail() {
		return consumerEmail;
	}

	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumerNo() {
		return consumerNo;
	}

	public void setConsumerNo(String consumerNo) {
		this.consumerNo = consumerNo;
	}

	public String getDistributorAddress() {
		return distributorAddress;
	}

	public void setDistributorAddress(String distributorAddress) {
		this.distributorAddress = distributorAddress;
	}

	public String getDistributorCode() {
		return distributorCode;
	}

	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getGivenUpSubsidy() {
		return givenUpSubsidy;
	}

	public void setGivenUpSubsidy(String givenUpSubsidy) {
		this.givenUpSubsidy = givenUpSubsidy;
	}

	public String getiFSCCode() {
		return iFSCCode;
	}

	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}

	public String getLastBookingDate() {
		return lastBookingDate;
	}

	public void setLastBookingDate(String lastBookingDate) {
		this.lastBookingDate = lastBookingDate;
	}

	public String getSubsidizedRefillConsumed() {
		return subsidizedRefillConsumed;
	}

	public void setSubsidizedRefillConsumed(String subsidizedRefillConsumed) {
		this.subsidizedRefillConsumed = subsidizedRefillConsumed;
	}

	public String getTotalRefillConsumed() {
		return totalRefillConsumed;
	}

	public void setTotalRefillConsumed(String totalRefillConsumed) {
		this.totalRefillConsumed = totalRefillConsumed;
	}

	public String getCity_town() {
		return city_town;
	}

	public void setCity_town(String city_town) {
		this.city_town = city_town;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
/*
	 public List<PradrObj> getPradr() {
			
			if (pradr == null) {
				pradr = new ArrayList<PradrObj>();
	        }
	        return this.pradr;
		}

	public void setPradr(List<PradrObj> pradr) {
		this.pradr = pradr;
	}
	
	
	 
		public List<ValidityObj> getValidity() {
				
				if (validity == null) {
					validity = new ArrayList<ValidityObj>();
		        }
		        return this.validity;
			}
		 


		public List<Cov_detailsObj> getCov_details() {
		
		
				if (cov_details == null) {
					cov_details = new ArrayList<Cov_detailsObj>();
			    }
			    return this.cov_details;
		}

		

		

		public List<ContactObj> getContact() {
				
				
				if (contact == null) {
					contact = new ArrayList<ContactObj>();
			    }
			    return this.contact;
			}




		public List<DeviceObj> getDevice() {
		
			
			if (device == null) {
				device = new ArrayList<DeviceObj>();
		    }
		    return this.device;
		}
		
		
	public List<HistoryObj> getHistory() {
		
			
			if (history == null) {
				history = new ArrayList<HistoryObj>();
		    }
		    return this.history;
		}
		
		
		
		public List<IdentityObj> getIdentity() {
				

			if (identity == null) {
				identity = new ArrayList<IdentityObj>();
		    }
		    return this.identity;
		}

		
		
		
		
		

		public List<ProfileObj> getProfile() {
					
			if (profile == null) {
				profile = new ArrayList<ProfileObj>();
		    }
		    return this.profile;
		}




		public List<Sim_detailsObj> getSim_details() {
		
			if (sim_details == null) {
				sim_details = new ArrayList<Sim_detailsObj>();
		    }
		    return this.sim_details;
		}

		


		public List<DateOfIssueObj> getDateOfIssue() {
			
			
			if (dateOfIssue == null) {
				dateOfIssue = new ArrayList<DateOfIssueObj>();
		    }
		    return this.dateOfIssue;
		}

		


		public List<PassportNumberObj> getPassportNumber() {
			
			

			if (passportNumber == null) {
				passportNumber = new ArrayList<PassportNumberObj>();
		    }
		    return this.passportNumber;
		}

		


		public List<NamedetailsObj> getNamedetails() {
			
			
			if (namedetails == null) {
				namedetails = new ArrayList<NamedetailsObj>();
		    }
		    return this.namedetails;
		}

		public void setValidity(List<ValidityObj> validity) {
			this.validity = validity;
		}

		public void setCov_details(List<Cov_detailsObj> cov_details) {
			this.cov_details = cov_details;
		}

		

		public void setContact(List<ContactObj> contact) {
			this.contact = contact;
		}

		public void setDevice(List<DeviceObj> device) {
			this.device = device;
		}

		public void setHistory(List<HistoryObj> history) {
			this.history = history;
		}

		public void setIdentity(List<IdentityObj> identity) {
			this.identity = identity;
		}

		public void setProfile(List<ProfileObj> profile) {
			this.profile = profile;
		}

		public void setSim_details(List<Sim_detailsObj> sim_details) {
			this.sim_details = sim_details;
		}

		public void setDateOfIssue(List<DateOfIssueObj> dateOfIssue) {
			this.dateOfIssue = dateOfIssue;
		}

		public void setPassportNumber(List<PassportNumberObj> passportNumber) {
			this.passportNumber = passportNumber;
		}

		public void setNamedetails(List<NamedetailsObj> namedetails) {
			this.namedetails = namedetails;
		}
		
		*/
		
	
}
