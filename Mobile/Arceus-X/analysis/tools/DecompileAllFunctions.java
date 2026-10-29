// Decompile every non-external function in the current Ghidra program.
// @category Export

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;

public class DecompileAllFunctions extends GhidraScript {
    @Override
    protected void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected one output-file argument");
        }

        File output = new File(args[0]);
        File parent = output.getParentFile();
        if (parent != null) {
            parent.mkdirs();
        }

        DecompInterface decompiler = new DecompInterface();
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        if (!decompiler.openProgram(currentProgram)) {
            throw new IllegalStateException("Could not initialize the decompiler");
        }

        int attempted = 0;
        int succeeded = 0;
        int failed = 0;
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(output)))) {
            writer.println("/*");
            writer.println(" * Ghidra native decompilation export");
            writer.println(" * Program: " + currentProgram.getName());
            writer.println(" * Language: " + currentProgram.getLanguageID());
            writer.println(" * Compiler: " + currentProgram.getCompilerSpec().getCompilerSpecID());
            writer.println(" * Functions are reconstructed pseudocode, not original source.");
            writer.println(" */");
            writer.println();

            FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);
            while (functions.hasNext() && !monitor.isCancelled()) {
                Function function = functions.next();
                if (function.isExternal()) {
                    continue;
                }
                attempted++;
                writer.println("/* ============================================================");
                writer.println(" * Address: " + function.getEntryPoint());
                writer.println(" * Symbol:  " + function.getName(true));
                writer.println(" * Size:    " + function.getBody().getNumAddresses() + " bytes");
                writer.println(" * ============================================================ */");

                DecompileResults result = decompiler.decompileFunction(function, 120, monitor);
                if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                    writer.println(result.getDecompiledFunction().getC());
                    succeeded++;
                }
                else {
                    writer.println("/* DECOMPILATION FAILED: " + result.getErrorMessage() + " */");
                    failed++;
                }
                writer.println();
                if ((attempted % 100) == 0) {
                    writer.flush();
                    println("Decompiled " + succeeded + "/" + attempted + " functions; failed=" + failed);
                }
            }
            writer.println("/* SUMMARY attempted=" + attempted + " succeeded=" + succeeded + " failed=" + failed + " */");
        }
        decompiler.dispose();
        println("Finished: attempted=" + attempted + " succeeded=" + succeeded + " failed=" + failed);
    }
}
