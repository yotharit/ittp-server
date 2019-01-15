package com.ittp.ittpserver.jasper.generate;

import net.sf.jasperreports.engine.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratePdf {

    private static GeneratePdf instance = null;

    private GeneratePdf() {

    }

    public static GeneratePdf getInstance() {
        if (instance == null) {
            instance = new GeneratePdf();
        }
        return instance;
    }

    public byte[] generateMockPdf(String reportURL) throws JRException {

        byte[] bytes = null;

        JasperReport report = null;
        Map<String, Object> parameters = null;
        JRDataSource dataSource = null;
        JasperPrint jasperPrint = null;

        report = JasperCompileManager.compileReport(reportURL);
        parameters = new HashMap<String, Object>();
        parameters.put("name","Tharit Pongsaneh");
        parameters.put("barcode","1234");

        dataSource = new JREmptyDataSource();
        jasperPrint = JasperFillManager.fillReport(report, parameters, dataSource);

        bytes = JasperExportManager.exportReportToPdf(jasperPrint);

        return bytes;

    }

    public byte[] generateNcbMockPdf(String reportURL) throws JRException {

        byte[] bytes = null;

        JasperReport report = null;
        Map<String, Object> parameters = null;
        JRDataSource dataSource = null;
        JasperPrint jasperPrint = null;

        report = JasperCompileManager.compileReport(reportURL);
        parameters = new HashMap<String, Object>();
        parameters.put("Date", "22");
        parameters.put("Month", "มกราคม");
        parameters.put("Year","2019");
        parameters.put("Name","ธฤต พงษ์เสน่ห์");
        parameters.put("AddressFirst","นวชน อพาร์ทเมนต์ ห้อง K406");
        parameters.put("AdddressSecond","86/20-22 ซอยหอพักคุณหญิงอิศรา งามวงศ์วาน46 ถ.งามวงศ์วาน แขวงลาดยาว กรุงเทพมหานครฯ 10900");


        dataSource = new JREmptyDataSource();
        jasperPrint = JasperFillManager.fillReport(report, parameters, dataSource);

        bytes = JasperExportManager.exportReportToPdf(jasperPrint);

        return bytes;

    }

    public byte[] generatePdf(String reportURL, String fileName) throws JRException {

        byte[] bytes = null;

        JasperReport report = null;
        Map<String, Object> parameters = null;
        JRDataSource dataSource = null;
        JasperPrint jasperPrint = null;

        report = JasperCompileManager.compileReport(reportURL);
        parameters = new HashMap<String, Object>();
        parameters.put("name","Tharit Pongsaneh");

        dataSource = new JREmptyDataSource();
        jasperPrint = JasperFillManager.fillReport(report, parameters, dataSource);

        bytes = JasperExportManager.exportReportToPdf(jasperPrint);

        return bytes;

    }

}
