package com.ittp.ittpserver.jasper.util;

import com.ittp.ittpserver.jasper.generate.GeneratePdf;
import net.sf.jasperreports.engine.JRException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdfGenController {

    @RequestMapping("/pdf/gen")
    public ResponseEntity<byte[]> index() throws JRException {
        GeneratePdf util = GeneratePdf.getInstance();
        String sampleJrxml = "";
        byte[] out = null;
        String fileName = "report.pdf";
        sampleJrxml = "/Users/tharitpongsaneh/ittp-server/template/sample.jrxml";
        out = util.generateMockPdf(sampleJrxml);
        return ResponseEntity
                .ok()
                // Specify content type as PDF
                .header("Content-Type", "application/pdf; charset=UTF-8")
                // Tell browser to display PDF if it can
                .header("Content-Disposition", "inline; filename=\"" + "test" + ".pdf\"")
                .body(out);
    }

}
