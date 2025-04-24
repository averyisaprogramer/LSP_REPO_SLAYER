package org.howard.edu.lspfinal.question3;

/**
 * Driver class to demonstrate report generation.
 */
public class ReportDriver {
    public static void main(String[] args) {
        // Create and generate a Sales Report
        Report salesReport = new SalesReport();
        System.out.println("Generating Sales Report:");
        salesReport.generateReport();  // Template method in action
        System.out.println();

        // Create and generate an Inventory Report
        Report inventoryReport = new InventoryReport();
        System.out.println("Generating Inventory Report:");
        inventoryReport.generateReport();  // Template method in action
    }
}

