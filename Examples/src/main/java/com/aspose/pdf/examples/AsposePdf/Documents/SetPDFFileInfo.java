package com.aspose.pdf.examples.AsposePdf.Documents;

import com.aspose.pdf.examples.Utils;

public class SetPDFFileInfo
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetPDFFileInfo.class);

        //open document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir+ "input.pdf");
        //get document information
        com.aspose.pdf.DocumentInfo docInfo = pdfDocument.getInfo();
        //set Author information
        docInfo.setAuthor("Aspose.Pdf for java");
        docInfo.setCreationDate(new java.util.Date());
        docInfo.setKeywords("Aspose.Pdf, DOM, API");
        docInfo.setModDate(new java.util.Date());
        docInfo.setSubject("PDF Information");
        docInfo.setTitle("Setting PDF Document Information");
        // save update document with new information
        pdfDocument.save(dataDir+ "Updated_Information.pdf");
        // Display result.
        System.out.println("Process completed successfully!");
    }
}




