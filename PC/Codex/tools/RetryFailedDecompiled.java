import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileOptions;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class RetryFailedDecompiled extends GhidraScript {
    private static final String[] ADDRESSES = {
        "180002ad0", "18000fed0", "1800295e0", "180034da0",
        "180040d60", "1800d2200", "18018e670"
    };

    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 1) throw new IllegalArgumentException("usage: RetryFailedDecompiled <output.c>");
        DecompInterface decompiler = new DecompInterface();
        decompiler.setOptions(new DecompileOptions());
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(false);
        decompiler.setSimplificationStyle("decompile");
        decompiler.openProgram(currentProgram);
        int ok = 0;
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(args[0]), StandardCharsets.UTF_8), 1024 * 1024))) {
            out.println("/* Longer-timeout retries for functions that failed the primary export. */");
            for (String address : ADDRESSES) {
                Function function = currentProgram.getFunctionManager().getFunctionAt(toAddr(address));
                out.println("\n/* ==================================================================== */");
                out.println("/* " + address + " / " + (function == null ? "missing" : function.getName(true)) + " */");
                if (function == null) {
                    out.println("/* FUNCTION NOT FOUND */");
                    continue;
                }
                try {
                    DecompileResults result = decompiler.decompileFunction(function, 45, monitor);
                    if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                        out.println(result.getDecompiledFunction().getC());
                        ok++;
                        println("Retry succeeded: " + address);
                    } else {
                        out.println("/* RETRY FAILED: " + result.getErrorMessage() + " */");
                        println("Retry failed: " + address + " / " + result.getErrorMessage());
                    }
                } catch (Exception ex) {
                    out.println("/* RETRY EXCEPTION: " + ex + " */");
                    println("Retry exception: " + address + " / " + ex);
                    decompiler.dispose();
                    decompiler = new DecompInterface();
                    decompiler.setOptions(new DecompileOptions());
                    decompiler.toggleCCode(true);
                    decompiler.toggleSyntaxTree(false);
                    decompiler.setSimplificationStyle("decompile");
                    decompiler.openProgram(currentProgram);
                }
                out.flush();
            }
            out.println("\n/* Retry summary: recovered=" + ok + ", attempted=" + ADDRESSES.length + " */");
        } finally {
            decompiler.dispose();
        }
    }
}
