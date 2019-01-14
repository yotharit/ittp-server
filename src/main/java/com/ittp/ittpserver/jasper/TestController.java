//package com.ittp.ittpserver.jasper;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.ittp.ittpserver.jasper.generate.GeneratePdf;
//import net.sf.jasperreports.engine.JRException;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//
//@RestController
//public class TestController {
//
//    @RequestMapping(name = "/test", method=RequestMethod.POST)
//    public ResponseEntity<byte[]> index(@RequestBody TestBody test) throws JRException, IOException {
//
//        GeneratePdf util = GeneratePdf.getInstance();
//
//        String sampleJrxml = "";
//        String fileName = "test.pdf";
//
//        System.out.println(test.getType());
//
//        byte[] out = null;
//
//
//        if(test.getType().equals("1")){
//            sampleJrxml = "/Users/tharitpongsaneh/ittp-server/template/sample_with_param.jrxml";
//            out = util.generateMockPdf(sampleJrxml,fileName,test.getName());
//        } else  {
//            sampleJrxml =  "/Users/tharitpongsaneh/ittp-server/template/StyledTextReport.jrxml";
//            out = util.generatePdf(sampleJrxml, fileName);
//        }
//
////        return ResponseEntity
////                .ok()
////                // Specify content type as PDF
////                .header("Content-Type", "application/pdf; charset=UTF-8")
////                // Tell browser to display PDF if it can
////                .header("Content-Disposition", "inline; filename=\"" + "test" + ".pdf\"")
////                .body(out);
//        return (ResponseEntity<byte[]>) ResponseEntity.notFound();
//    }
//
//
//
//}
//
//class TestBody {
//
//    @JsonProperty("type")
//    private String type;
//    @JsonProperty("name")
//    private String name;
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}