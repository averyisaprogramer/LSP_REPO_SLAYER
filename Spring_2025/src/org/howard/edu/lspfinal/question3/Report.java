package org.howard.edu.lspfinal.question3;

/**
 * Abstract class defining the template for report generation.
 */
public abstract class Report {
    
    // Template method defining the general algorithm for generating a report
    public final void generateReport() {
        loadData();         // Common step
        formatData();       // This step is overridden by subclasses
        printReport();      // Common step
    }
    
    // Concrete method shared by all reports (no need to override)
    public void loadData() {
        System.out.println("Loading data...");
    }
    
    // Abstract method that must be implemented by subclasses for formatting data
    public abstract void formatData();
    
    // Concrete method shared by all reports (no need to override)
    public void printReport() {
        System.out.println("Printing report.");
    }
}
/* code sourced from chat gpt
 */
