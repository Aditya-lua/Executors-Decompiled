import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileOptions;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ExportAllDecompiled extends GhidraScript {
    private static String csv(String value) {
        if (value == null) return "";
        return "\"" + value.replace("\"", "\"\"").replace("\r", " ").replace("\n", " ") + "\"";
    }

    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 2) {
            throw new IllegalArgumentException("usage: ExportAllDecompiled <pseudocode.c> <functions.csv>");
        }

        DecompInterface decompiler = new DecompInterface();
        DecompileOptions options = new DecompileOptions();
        decompiler.setOptions(options);
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(false);
        decompiler.setSimplificationStyle("decompile");
        if (!decompiler.openProgram(currentProgram)) {
            throw new IllegalStateException("failed to initialize decompiler");
        }

        int seen = 0;
        int attempted = 0;
        int completed = 0;
        int failed = 0;
        int external = 0;
        int thunks = 0;

        try (PrintWriter code = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(args[0]), StandardCharsets.UTF_8), 1024 * 1024));
             PrintWriter index = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(args[1]), StandardCharsets.UTF_8), 256 * 1024))) {
            code.println("/* Ghidra-generated C-like pseudocode. Not original C/C++ source. */");
            code.println("/* Program: " + currentProgram.getName() + " */");
            index.println("address,name,size_bytes,external,thunk,signature,decompile_status");

            FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);
            while (functions.hasNext() && !monitor.isCancelled()) {
                Function function = functions.next();
                seen++;
                boolean isExternal = function.isExternal();
                boolean isThunk = function.isThunk();
                if (isExternal) external++;
                if (isThunk) thunks++;
                String status;

                if (isExternal) {
                    status = "external";
                } else {
                    attempted++;
                    code.println();
                    code.println("/* ==================================================================== */");
                    code.println("/* " + function.getName(true) + " @ " + function.getEntryPoint() + " */");
                    try {
                        DecompileResults result = decompiler.decompileFunction(function, 8, monitor);
                        if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                            code.println(result.getDecompiledFunction().getC());
                            completed++;
                            status = "ok";
                        } else {
                            String error = result.getErrorMessage();
                            code.println("/* DECOMPILE FAILED: " + error + " */");
                            failed++;
                            status = "failed: " + error;
                        }
                    } catch (Exception ex) {
                        code.println("/* DECOMPILE EXCEPTION: " + ex + " */");
                        failed++;
                        status = "exception: " + ex;
                    }
                }

                index.println(
                    csv(function.getEntryPoint().toString()) + "," +
                    csv(function.getName(true)) + "," +
                    function.getBody().getNumAddresses() + "," +
                    isExternal + "," + isThunk + "," +
                    csv(function.getPrototypeString(true, true)) + "," + csv(status)
                );
                if (seen % 100 == 0) {
                    code.flush();
                    index.flush();
                    println("Export progress: functions=" + seen + ", decompiled=" + completed + ", failed=" + failed);
                }
            }
            code.println();
            code.println("/* Summary: functions=" + seen + ", attempted=" + attempted +
                         ", completed=" + completed + ", failed=" + failed +
                         ", external=" + external + ", thunks=" + thunks + " */");
        } finally {
            decompiler.dispose();
        }
        println("Export complete: functions=" + seen + ", decompiled=" + completed + ", failed=" + failed);
    }
}
