package com.springmyresume.primefaces;


import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.stereotype.Component;

@Component

public class ChartBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3661942818161639522L;

	private CartesianChartModel categoryModel;

    private PieChartModel pieModel;

	public ChartBean() {
        createCategoryModel();
        createPieModel();
        //System.out.println("IN CHARTBEAN CONSTRUCTOR");
	}

	public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                        "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

    public void onNodeSelect(SelectEvent event) {
    	
    	
    }
    
    public void createBarChart(){
    	
    	//System.out.println("In CREATE BARCHART");
    	
    	categoryModel = new CartesianChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("BoysSSSSSSSSSSSS");

        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("GirlsSSSSSS");

        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);

        categoryModel.addSeries(boys);
        categoryModel.addSeries(girls);
        
    }
    public CartesianChartModel getCategoryModel() {
    	
        return categoryModel;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    private void createCategoryModel() {
        categoryModel = new CartesianChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");

        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");

        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);

        categoryModel.addSeries(boys);
        categoryModel.addSeries(girls);
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        pieModel.set("Brand 1", 540);
        pieModel.set("Brand 2", 325);
        pieModel.set("Brand 3", 702);
        pieModel.set("Brand 4", 421);
    }
}
                    