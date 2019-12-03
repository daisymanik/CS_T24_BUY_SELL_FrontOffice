package Object_Repository;

import org.openqa.selenium.By;

public class SecTrade {

	public static final By  securityCode = By.id("fieldName:SECURITY.CODE");
	public static final By  depository = By.id("fieldName:DEPOSITORY");
	public static final By  tradeDate = By.id("fieldName:TRADE.DATE");
	public static final By  valueDate = By.id("fieldName:VALUE.DATE");
	public static final By  tradeCcy = By.id("fieldName:TRADE.CCY");
	public static final By  stockExchange = By.id("fieldName:STOCK.EXCHANGE");

	public static final By  netTradeNone = By.xpath("(//input[@id='radio:tab1:NET.TRADE'])[1]");
	public static final By  netTradeNo = By.xpath("(//input[@id='radio:tab1:NET.TRADE'])[2]");
	public static final By  netTradeProrata = By.xpath("(//input[@id='radio:tab1:NET.TRADE'])[3]");
	public static final By  netTradeY = By.xpath("(//input[@id='radio:tab1:NET.TRADE'])[4]");

	public static final By  interestDays = By.id("fieldName:INTEREST.DAYS");
	public static final By  exchRateTrd = By.id("fieldName:EXCH.RATE.TRD");

	public static final By  marketTypeNone = By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[1]");
	public static final By  marketTypeF = By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[2]");
	public static final By  marketTypeN = By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[3]");
	public static final By  marketTypeS = By.xpath("(//input[@id='radio:tab1:MARKET.TYPE'])[4]");

	public static final By  customerNo_1 = By.id("fieldName:CUSTOMER.NO:1");
	public static final By  custTransCode_1 = By.id("fieldName:CUST.TRANS.CODE:1");
	public static final By  custSecAcc_1 = By.id("fieldName:CUST.SEC.ACC:1");
	public static final By  custAccNo_1 = By.id("fieldName:CUST.ACC.NO:1");
	public static final By  custNominee_1 = By.id("fieldName:CUST.NOMINEE:1");
	public static final By  subAccount_1 = By.id("fieldName:SUB.ACCOUNT:1");
	public static final By  custNoNom_1_1 = By.id("fieldName:CUST.NO.NOM:1:1");
	public static final By  custPrice_1_1 = By.id("fieldName:CUST.PRICE:1:1");
	public static final By  cuReallowance_1 = By.id("fieldName:CU.REALLOWANCE:1");
	public static final By  cuReallowAmt_1 = By.id("fieldName:CU.REALLOW.AMT:1");
	public static final By  custIntrAmt_1 = By.id("fieldName:CUST.INTR.AMT:1");
	public static final By  cuBrkrComm_1 = By.id("fieldName:CU.BRKR.COMM:1");
	public static final By  cuForeignFee_1 = By.id("fieldName:CU.FOREIGN.FEE:1");
	public static final By  cuCommission_1 = By.id("fieldName:CU.COMMISSION:1");
	public static final By  cuStampTax_1 = By.id("fieldName:CU.STAMP.TAX:1");
	public static final By  cuEbvFees_1 = By.id("fieldName:CU.EBV.FEES:1");
	public static final By  cuFeesMisc_1 = By.id("fieldName:CU.FEES.MISC:1");
	public static final By  cuDiscPcent_1 = By.id("fieldName:CU.DISC.PCENT:1");
	public static final By  cuTaxCode_1_1 = By.id("fieldName:CU.TAX.CODE:1:1");
	public static final By  cuTaxType_1_1= By.id("fieldName:CU.TAX.TYPE:1:1");
	public static final By  cuMantaxtcy_1_1 = By.id("fieldName:CU.MANTAXTCY:1:1");
	public static final By  cuIntCtr_1 = By.id("fieldName:CU.INT.CTR:1");
	public static final By  cuAdviceReqd_1 = By.id("fieldName:CU.ADVICE.REQD:1");
	public static final By  cuExRateRef_1 = By.id("fieldName:CU.EX.RATE.REF:1");
	public static final By  cuExRateAcc_1 = By.id("fieldName:CU.EX.RATE.ACC:1");
	public static final By  cuDelivInstr_1 = By.id("fieldName:CU.DELIV.INSTR:1");
	public static final By  cuBenBank1_1= By.id("fieldName:CU.BEN.BANK.1:1");
	public static final By  cuBenBank2_1 = By.id("fieldName:CU.BEN.BANK.2:1");
	public static final By  cuBenAddr_1_1 = By.id("fieldName:CU.BEN.ADDR:1:1");
	public static final By  cuBenAcct_1_1 = By.id("fieldName:CU.BEN.ACCT:1:1");
	public static final By  cuOveAddr_1_1 = By.id("fieldName:CU.OVE.ADDR:1:1");
	public static final By  cuMessControl_1 = By.id("fieldName:CU.MESS.CONTROL:1");
	public static final By  cuEntitlId_1 = By.id("fieldName:CU.ENTITL.ID:1");
	public static final By  cuNarrative_1_1 = By.id("fieldName:CU.NARRATIVE:1:1");
	public static final By  cuNotes_1_1 = By.id("fieldName:CU.NOTES:1:1");
	public static final By  comTaxXrte_1 = By.id("fieldName:COM.TAX.XRTE:1");
	public static final By  cgtBaseAmt_1 = By.id("fieldName:CGT.BASE.AMT:1");
	public static final By  cgtCode_1_1 = By.id("fieldName:CGT.CODE:1:1");	
	public static final By  extCustodian_1 = By.id("fieldName:EXT.CUSTODIAN:1");
	public static final By  rpReference_1 = By.id("fieldName:RP.REFERENCE:1");
	public static final By  autoCustSett_1 = By.id("fieldName:AUTO.CUST.SETT:1");
	public static final By  portConstNo_1 = By.id("fieldName:PORT.CONST.NO:1");
	public static final By  cuIncomeAcc_1 = By.id("fieldName:CU.INCOME.ACC:1");
	public static final By  cuFttType_1 = By.id("fieldName:CU.FTT.TYPE:1");
	public static final By  cuFttPerc_1 = By.id("fieldName:CU.FTT.PERC:1");
	public static final By  cuFttBseAmt_1 = By.id("fieldName:CU.FTT.BSE.AMT:1");
	public static final By  cuFttAmtTcy_1 = By.id("fieldName:CU.FTT.AMT.TCY:1");
	public static final By  cuFttAmtLcy_1 = By.id("fieldName:CU.FTT.AMT.LCY:1");
	public static final By  cuFttAmtCcy_1 = By.id("fieldName:CU.FTT.AMT.CCY:1");
	public static final By  cuFttAmt_1 = By.id("fieldName:CU.FTT.AMT:1");
	public static final By  cuFttExRate_1 = By.id("fieldName:CU.FTT.EX.RATE:1");
	public static final By  brokerNo_1 = By.id("fieldName:BROKER.NO:1");
	public static final By  brokerType_1 = By.id("fieldName:BROKER.TYPE:1");
	public static final By  brTransCode_1 = By.id("fieldName:BR.TRANS.CODE:1");
	public static final By  brAccNo_1 = By.id("fieldName:BR.ACC.NO:1");
	public static final By  brokerDepo_1_1 = By.id("fieldName:BROKER.DEPO:1:1");
	public static final By  brSecDepotAc_1 = By.id("fieldName:BR.SEC.DEPOT.AC:1");
	public static final By  brAgent_1_1 = By.id("fieldName:BR.AGENT:1:1");
	public static final By  brAgentAc_1_1 = By.id("fieldName:BR.AGENT.AC:1:1");
	public static final By  brNoNom_1_1 = By.id("fieldName:BR.NO.NOM:1:1");
	public static final By  brPrice_1_1 = By.id("fieldName:BR.PRICE:1:1");
	public static final By  brTrdTime_1_1 = By.id("fieldName:BR.TRD.TIME:1:1");
	public static final By  brReallowance_1 = By.id("fieldName:BR.REALLOWANCE:1");
	public static final By  brReallowAmt_1 = By.id("fieldName:BR.REALLOW.AMT:1");
	public static final By  brIntrAmTrd_1 = By.id("fieldName:BR.INTR.AM.TRD:1");
	public static final By  brBrokerComm_1 = By.id("fieldName:BR.BROKER.COMM:1");
	public static final By  brForeignFee_1 = By.id("fieldName:BR.FOREIGN.FEE:1");
	public static final By  clCommission_1 = By.id("fieldName:CL.COMMISSION:1");
	public static final By  brStampTax_1 = By.id("fieldName:BR.STAMP.TAX:1");
	public static final By  brEbvFees_1 = By.id("fieldName:BR.EBV.FEES:1");
	public static final By  brFeesMisc_1 = By.id("fieldName:BR.FEES.MISC:1");
	public static final By  brExRateAcc_1 = By.id("fieldName:BR.EX.RATE.ACC:1");
	public static final By  brDelivInstr_1 = By.id("fieldName:BR.DELIV.INSTR:1");
	public static final By  brBenBank1_1 = By.id("fieldName:BR.BEN.BANK.1:1");
	public static final By  brBenBank2_1 = By.id("fieldName:BR.BEN.BANK.2:1");
	public static final By  brBenAddr_1_1 = By.id("fieldName:BR.BEN.ADDR:1:1");
	public static final By  brBenAcct_1_1 = By.id("fieldName:BR.BEN.ACCT:1:1");
	public static final By  custRemarks_1_1 = By.id("fieldName:CUST.REMARKS:1:1");
	public static final By  brOveAddr_1_1 = By.id("fieldName:BR.OVE.ADDR:1:1");
	public static final By  brMessControl_1 = By.id("fieldName:BR.MESS.CONTROL:1");
	public static final By  confByBroker_1 = By.id("fieldName:CONF.BY.BROKER:1");
	public static final By  brNarrative_1_1 = By.id("fieldName:BR.NARRATIVE:1:1");
	public static final By  stampIndicator_1 = By.id("fieldName:STAMP.INDICATOR:1");
	public static final By  brConfRef_1_1 = By.id("fieldName:BR.CONF.REF:1:1");
	public static final By  autoBrokSett_1 = By.id("fieldName:AUTO.BROK.SETT:1");
	public static final By  buyrSeller_1 = By.id("fieldName:BUYR.SELLER:1");
	public static final By  buyrSellerAc_1 = By.id("fieldName:BUYR.SELLER.AC:1");
	public static final By  plCode_1 = By.id("fieldName:PL.CODE:1");
	public static final By  plSafekeep_1 = By.id("fieldName:PL.SAFEKEEP:1");
	public static final By  brFttType_1 = By.id("fieldName:BR.FTT.TYPE:1");
	public static final By  brFttPerc_1 = By.id("fieldName:BR.FTT.PERC:1");
	public static final By  brFttBseAmt_1 = By.id("fieldName:BR.FTT.BSE.AMT:1");
	public static final By  brFttAmtTcy_1 = By.id("fieldName:BR.FTT.AMT.TCY:1");
	public static final By  brFttAmtLcy_1 = By.id("fieldName:BR.FTT.AMT.LCY:1");
	public static final By  brFttAmtCcy_1 = By.id("fieldName:BR.FTT.AMT.CCY:1");
	public static final By  brFttAmt_1 = By.id("fieldName:BR.FTT.AMT:1");
	public static final By  brFttExRate_1 = By.id("fieldName:BR.FTT.EX.RATE:1");
	public static final By  stampPrice_1 = By.id("fieldName:STAMP.PRICE:1");
	public static final By  SettNarrative_1 = By.id("fieldName:SETT.NARRATIVE:1");
	public static final By  tradeTime = By.id("fieldName:TRADE.TIME");
	public static final By  consolRate_1 = By.id("fieldName:CONSOL.RATE:1");
	public static final By  conValDate_1 = By.id("fieldName:CON.VAL.DATE:1");
	public static final By  linkReference = By.id("fieldName:LINK.REFERENCE");
	public static final By  cumExInd_1 = By.id("fieldName:CUM.EX.IND:1");
	public static final By  cptyLimitRef = By.id("fieldName:CPTY.LIMIT.REF");
	public static final By  cgTradeTime = By.id("fieldName:CG.TRADE.TIME");
	
	public static final By  paymentReqdNone = By.xpath("(//input[@id='radio:tab1:PAYMENT.REQD'])[1]");
	public static final By  paymentReqdNo = By.xpath("(//input[@id='radio:tab1:PAYMENT.REQD'])[2]");
	public static final By  paymentReqdYes = By.xpath("(//input[@id='radio:tab1:PAYMENT.REQD'])[3]");
	
	public static final By  brokerAdviceReqdNone  = By.xpath("(//input[@id='radio:tab1:BROKER.ADVICE.REQD'])[1]");
	public static final By  brokerAdviceReqdNo = By.xpath("(//input[@id='radio:tab1:BROKER.ADVICE.REQD'])[2]");
	public static final By  brokerAdviceReqdYes = By.xpath("(//input[@id='radio:tab1:BROKER.ADVICE.REQD'])[3]");
	
	public static final By  DepotAdviceReqdNone = By.xpath("(//input[@id='radio:tab1:DEPOT.ADVICE.REQD'])[1]");
	public static final By  DepotAdviceReqdNo = By.xpath("(//input[@id='radio:tab1:DEPOT.ADVICE.REQD'])[2]");
	public static final By  DepotAdviceReqdYes = By.xpath("(//input[@id='radio:tab1:DEPOT.ADVICE.REQD'])[3]");
	
	public static final By  cashHoldSettleNone = By.xpath("(//input[@id='radio:tab1:CASH.HOLD.SETTLE'])[1]");
	public static final By  cashHoldSettleNo = By.xpath("(//input[@id='radio:tab1:CASH.HOLD.SETTLE'])[2]");
	public static final By  cashHoldSettleYes = By.xpath("(//input[@id='radio:tab1:CASH.HOLD.SETTLE'])[3]");
	
	public static final By  secHoldSettleNone = By.xpath("(//input[@id='radio:tab1:SEC.HOLD.SETTLE'])[1]");
	public static final By  secHoldSettleNo = By.xpath("(//input[@id='radio:tab1:SEC.HOLD.SETTLE'])[2]");
	public static final By  secHoldSettleYes = By.xpath("(//input[@id='radio:tab1:SEC.HOLD.SETTLE'])[3]");
	
	public static final By  custActSuspCat = By.id("fieldName:CUST.ACT.SUSP.CAT");
	public static final By  brokActSuspCat = By.id("fieldName:BROK.ACT.SUSP.CAT");
	public static final By  miscActSuspCat = By.id("fieldName:MISC.ACT.SUSP.CAT");
	
	public static final By  oddLotTradeNone = By.xpath("(//input[@id='radio:tab1:ODD.LOT.TRADE'])[1]");
	public static final By  oddLotTradeNo = By.xpath("(//input[@id='radio:tab1:ODD.LOT.TRADE'])[2]");
	public static final By  oddLotTradeYes = By.xpath("(//input[@id='radio:tab1:ODD.LOT.TRADE'])[3]");
	
	public static final By  pset = By.id("fieldName:PSET");
	public static final By  toContraRef = By.id("fieldName:TO.CONTRA.REF");
	
	public static final By  bulkProcessingNone = By.xpath("(//input[@id='radio:tab1:BULK.PROCESSING'])[1]");
	public static final By  bulkProcessingNo = By.xpath("(//input[@id='radio:tab1:BULK.PROCESSING'])[2]");
	public static final By  bulkProcessingYes = By.xpath("(//input[@id='radio:tab1:BULK.PROCESSING'])[3]");
	
	public static final By  intCtr = By.id("fieldName:INT.CTR");
	
	public static final By cuNavTypeNone  = By.xpath("(//input[@id='radio:tab1:CU.NAV.TYPE'])[1]");
	public static final By cuNavTypeGross  = By.xpath("(//input[@id='radio:tab1:CU.NAV.TYPE'])[2]");
	public static final By cuNavTypeNet  = By.xpath("(//input[@id='radio:tab1:CU.NAV.TYPE'])[3]");
	
	public static final By  treasuryPrice = By.id("fieldName:TREASURY.PRICE");
	public static final By  marginFactor = By.id("fieldName:MARGIN.FACTOR");
	public static final By  parent = By.id("CheckBox:fieldName:PARENT");
	public static final By  parentReference = By.id("fieldName:PARENT.REFERENCE");
	public static final By  reverseChild = By.id("CheckBox:fieldName:REVERSE.CHILD");
	public static final By  supMisSusp = By.id("fieldName:SUP.MIS.SUSP");
	public static final By  sprtyNarrQual = By.id("fieldName:SPRTY.NARR.QUAL");
	public static final By  sprtyNarr = By.id("fieldName:SPRTY.NARR");
	public static final By  beneOwner = By.id("fieldName:BENE.OWNER");
	public static final By  buyrNation = By.id("fieldName:BUYR.NATION");
	public static final By  authoriseChild = By.id("CheckBox:fieldName:AUTHORISE.CHILD");
	public static final By  deleteChild = By.id("CheckBox:fieldName:DELETE.CHILD");
	public static final By  bulkUpdate = By.id("CheckBox:fieldName:BULK.UPDATE");
	public static final By  upfrontSec = By.id("CheckBox:fieldName:UPFRONT.SEC");
	public static final By  syDxReference = By.id("fieldName:SY.DX.REFERENCE");
	public static final By  principalAgent = By.id("fieldName:PRINCIPAL.AGENT");
	public static final By  integDataItem_1 = By.id("fieldName:INTEG.DATA.ITEM:1");
	public static final By  integDataValue_1 = By.id("fieldName:INTEG.DATA.VALUE:1");
	public static final By  depoDelivInstr = By.id("fieldName:DEPO.DELIV.INSTR");
	public static final By  ssiId = By.id("fieldName:SSI.ID");
	public static final By  ttRefNo = By.id("fieldName:TT.REF.NO");
	public static final By  dealerName = By.id("fieldName:DEALER.NAME");
	public static final By  purposeOfTran = By.id("fieldName:PURPOSE.OF.TRAN");

	public static final By  commitTheDeal = By.xpath("//img[@title='Commit the deal']");
	public static final By  acceptOverrides = By.xpath("//a[text()='Accept Overrides']");
	public static final By authorisesADeal=By.xpath("//img[@title='Authorises a deal']");
}
