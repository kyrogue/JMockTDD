package com.lotustechblog.tutorial2;

public class Showeight {
private IConvert mockVal;
public void setWeightValue(IConvert convtVal){
	this.mockVal = convtVal;
}

public String PrintWeight(String packName,double val,boolean convType){
	double weightVal = 0.0;
	if(convType==true){
		weightVal = mockVal.convertP2Kg(val);
		
	}else{
		weightVal=mockVal.convertKg2P(val);
	}
	
	return "Weight for "+packName+" is "+weightVal+" kg";
}
}
