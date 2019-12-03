package Object_Repository;

import org.openqa.selenium.By;

public class Middleorder {
	
	public static final By SC_EXE_SEC_ORDERS_Number=By.id("transactionId");
	public static final By commitTheDeal=By.xpath("//img[@title='Commit the deal']");
	public static final By orderno=By.id("disabled_ORDER.NUMBER");
	public static final By securityno=By.id("disabled_SECURITY.NO");
	public static final By transactioncode=By.id("disabled_TRANSACTION.CODE");
	public static final By ordertype=By.id("disabled_ORDER.TYPE");
	public static final By tradeccy=By.id("disabled_TRADE.CCY");
	public static final By nominalbalance=By.id("disabled_NOMINAL.BALANCE");
	public static final By custno1=By.id("disabled_CUSTOMER.NO:1");
	public static final By securityacc1=By.id("disabled_SECURITY.ACCT:1");
	public static final By custaccno1=By.id("");
	public static final By custnominal1=By.id("fieldName:CUST.NOMINAL:1:1");
	public static final By custprice1=By.id("fieldName:CUST.PRICE:1:1");
	public static final By calcchrgs=By.id("fieldName:CALC.CHRGS:1");
	public static final By cashchrgs=By.id("fieldName:CASH.CHRGS:1");
	public static final By splitchrgs=By.id("fieldName:SPLIT.CHRGS:1");
	public static final By cashrounding1=By.id("fieldName:CASH.ROUNDING:1");
	public static final By adjustcomm1=By.id("fieldName:ADJUST.COMM:1");
	public static final By cubrkrcomm1=By.id("fieldName:CU.BRKR.COMM:1");
	public static final By cuforeignfee=By.id("fieldName:CU.FOREIGN.FEE:1");
	public static final By cucommission1=By.id("fieldName:CU.COMMISSION:1");
	public static final By custamptax=By.id("fieldName:CU.STAMP.TAX:1");
	public static final By cuebvfee1=By.id("fieldName:CU.EBV.FEES:1");
	public static final By cufeemisc=By.id("fieldName:CU.FEES.MISC:1");
	public static final By cudiskpcent=By.id("fieldName:CU.DISC.PCENT:1");
	public static final By cuexrate=By.id("fieldName:CU.EX.RATE.ACC:1");
	public static final By cuaccccy=By.id("disabled_CU.ACCOUNT.CCY:1");
	public static final By cudepository=By.id("fieldName:CU.DEPOSITORY:1");
	public static final By cuintctr=By.id("fieldName:CU.INT.CTR:1");
	public static final By cunotes=By.id("fieldName:CU.NOTES:1:1");
	public static final By narrative=By.id("fieldName:NARRATIVE:1:1");
	public static final By cuincomeacc=By.id("fieldName:CU.INCOME.ACC:1");
	public static final By brokerno1=By.id("fieldName:BROKER.NO:1");
	
	public static final By brokertype1=By.id("fieldName:BROKER.TYPE:1");
	public static final By braccno1=By.id("fieldName:BR.ACC.NO:1");
	public static final By brsecacct1=By.id("fieldName:BR.SEC.ACCT:1");
	public static final By nominalrecd=By.id("fieldName:NOMINAL.RECD:1");
	public static final By price1=By.id("fieldName:PRICE:1");
	public static final By brbrokkercomm1=By.id("fieldName:BR.BROKER.COMM:1");
	public static final By brforeignfee=By.id("fieldName:BR.FOREIGN.FEE:1");
	public static final By clcommision1=By.id("fieldName:CL.COMMISSION:1");
	public static final By brstamptax1=By.xpath("//input[@name='fieldName:BR.STAMP.TAX:1']");
	public static final By brebvfee=By.id("fieldName:BR.EBV.FEES:1");
	public static final By brfeemisc=By.id("fieldName:BR.FEES.MISC:1");
	public static final By brexrateacc=By.id("fieldName:BR.EX.RATE.ACC:1");
	public static final By deliveryinstr=By.id("fieldName:DELIVERY.INSTR:1");
	public static final By tradetime1=By.id("fieldName:TRADE.TIME:1");
	public static final By brexeadvref=By.id("fieldName:BR.EXE.ADV.REF:1");
	public static final By tradedate=By.id("fieldName:TRADE.DATE");
	public static final By valuedate=By.id("fieldName:VALUE.DATE");
	public static final By depository=By.id("fieldName:DEPOSITORY");
	public static final By stockexchange=By.id("fieldName:STOCK.EXCHANGE");

	public static final By markettypenone=By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[1]");
	public static final By markettypef=By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[2]");
	public static final By markettypen=By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[3]");
	public static final By markettypes=By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[4]");

	public static final By settnarrative=By.id("fieldName:SETT.NARRATIVE:1");
	public static final By intctr=By.id("fieldName:INT.CTR");
	
	public static final By orderstatusnone=By.xpath("(//input[@id='radio:tab1:ORDER.STATUS'])[1]");
	public static final By orderstatusaccept=By.xpath("(//input[@id='radio:tab1:ORDER.STATUS'])[2]");
	public static final By orderstatusreject=By.xpath("(//input[@id='radio:tab1:ORDER.STATUS'])[3]");
	public static final By orderstatustransmit=By.xpath("(//input[@id='radio:tab1:ORDER.STATUS'])[4]");


	public static final By oddlotordernone=By.xpath("(//input[@id='radio:tab1:ODD.LOT.ORDER'])[1]");
	public static final By oddlotorderno=By.xpath("(//input[@id='radio:tab1:ODD.LOT.ORDER'])[2]");
	public static final By oddlotorderyes=By.xpath("(//input[@id='radio:tab1:ODD.LOT.ORDER'])[3]");
	
	public static final By probrchgsnone=By.xpath("(//input[@id='radio:tab1:PRO.BR.CHGS'])[1]");
	public static final By probrchgsno=By.xpath("(//input[@id='radio:tab1:PRO.BR.CHGS'])[1]");
	public static final By probrchgsyes=By.xpath("(//input[@id='radio:tab1:PRO.BR.CHGS'])[1]");


	public static final By calcavgpricenone=By.xpath("(//input[@id='radio:tab1:CALC.AVG.PRICE'])[1]");
	public static final By calcavgpriceno=By.xpath("(//input[@id='radio:tab1:CALC.AVG.PRICE'])[2]");
	public static final By calcavgpriceyes=By.xpath("(//input[@id='radio:tab1:CALC.AVG.PRICE'])[3]");

	public static final By tradecreation=By.id("fieldName:TRADE.CREATION");

	public static final By proratanomnone=By.xpath("(//input[@id='radio:tab1:PRORATA.NOM'])[1]");
	public static final By proratanomno=By.xpath("(//input[@id='radio:tab1:PRORATA.NOM'])[2]");
	public static final By proratanomyes=By.xpath("(//input[@id='radio:tab1:PRORATA.NOM'])[3]");


	public static final By cancelremainordnone=By.xpath("(//input[@id='radio:tab1:CANCEL.REMAIN.ORD'])[1]");
	public static final By cancelremainordno=By.xpath("(//input[@id='radio:tab1:CANCEL.REMAIN.ORD'])[2]");
	public static final By cancelremainordyes=By.xpath("(//input[@id='radio:tab1:CANCEL.REMAIN.ORD'])[3]");


	public static final By routsecacc=By.id("fieldName:ROUT.SEC.ACC");
	public static final By pricespread=By.id("fieldName:PRICE.SPREAD");

	public static final By defaultcalcchgnone=By.xpath("(//input[@id='radio:tab1:DEFAULT.CALC.CHG'])[1]");
	public static final By defaultcalcchgno=By.xpath("(//input[@id='radio:tab1:DEFAULT.CALC.CHG'])[2]");
	public static final By defaultcalcchgyes=By.xpath("(//input[@id='radio:tab1:DEFAULT.CALC.CHG'])[3]");

	public static final By cumexind1=By.id("fieldName:CUM.EX.IND:1");

	public static final By chargecalcmethodnone=By.xpath("(//input[@id='radio:tab1:CHARGE.CALC.METHOD'])[1]");
	public static final By chargecalcmethodbybroker=By.xpath("(//input[@id='radio:tab1:CHARGE.CALC.METHOD'])[2]");
	public static final By chargecalcmethodbytranche=By.xpath("(//input[@id='radio:tab1:CHARGE.CALC.METHOD'])[3]");


	public static final By advicereqd=By.id("CheckBox:fieldName:ADVICE.REQD");
	public static final By mt502rejreason=By.id("fieldName:MT502.REJ.REASON:1");
	public static final By consolidateexec=By.id("CheckBox:fieldName:CONSOLIDATE.EXEC");
	public static final By daytrade=By.id("CheckBox:fieldName:DAY.TRADE");
	public static final By authoricetrade=By.id("CheckBox:fieldName:AUTHORISE.TRADE");
	public static final By parent=By.id("CheckBox:fieldName:PARENT");
	public static final By parentreference=By.id("fieldName:PARENT.REFERENCE");
	
	public static final By exehltnone=By.xpath("(//input[@id='radio:tab1:EXE.HLT'])[1]");
	public static final By exehltno=By.xpath("(//input[@id='radio:tab1:EXE.HLT'])[2]");
	public static final By exehltyes=By.xpath("(//input[@id='radio:tab1:EXE.HLT'])[3]");


	public static final By tradehltnone=By.xpath("(//input[@id='radio:tab1:TRADE.HLT'])[1]");
	public static final By tradehltno=By.xpath("(//input[@id='radio:tab1:TRADE.HLT'])[2]");
	public static final By tradehltyes=By.xpath("(//input[@id='radio:tab1:TRADE.HLT'])[3]");

	public static final By parentchilddeponone=By.xpath("(//input[@id='radio:tab1:PARENT.CHILD.DEPO'])[1]");
	public static final By parentchilddepono=By.xpath("(//input[@id='radio:tab1:PARENT.CHILD.DEPO'])[2]");
	public static final By parentchilddepoyes=By.xpath("(//input[@id='radio:tab1:PARENT.CHILD.DEPO'])[3]");

	
	public static final By roundingfactor=By.id("fieldName:ROUNDING.FACTOR");
	public static final By integdataitem=By.id("fieldName:INTEG.DATA.ITEM:1");
	public static final By integdatavalue=By.id("fieldName:INTEG.DATA.VALUE:1");
	public static final By recordstatus=By.id("disabled_RECORD.STATUS");
	public static final By inputter1=By.id("disabled_INPUTTER:1");
	public static final By datetime1=By.id("disabled_DATE.TIME:1");
	public static final By cocode=By.id("disabled_CO.CODE");
	public static final By deptcode=By.id("disabled_DEPT.CODE");

	public static final By authorisesADeal=By.xpath("//img[@title='Authorises a deal']");
	public static final By transactionId=By.id("transactionId");
	public static final By viewAContract=By.xpath("//img[@title='View a contract']");
	public static final By  acceptOverrides = By.xpath("//a[text()='Accept Overrides']");
		
	public static final By secTradeId_1_1=By.xpath("//span[contains(text(),'SCT')]");
}

	


