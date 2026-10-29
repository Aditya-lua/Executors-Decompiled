// Disable analyzers that misinterpret protector indirection as giant functions.
// @category Madius

import ghidra.app.script.GhidraScript;

public class DisableProtectorConfusedAnalyzers extends GhidraScript {
    @Override
    public void run() throws Exception {
        setAnalysisOption(currentProgram, "Non-Returning Functions - Discovered", "false");
        setAnalysisOption(currentProgram, "Windows x86 PE Exception Handling", "false");
        println("disabled protector-confused non-return and exception analyzers");
    }
}
