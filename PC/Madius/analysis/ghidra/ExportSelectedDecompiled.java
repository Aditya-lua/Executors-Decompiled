// Export selected virtual addresses as C-like Ghidra pseudocode.
// If an address falls inside a known function, that containing function is used.
// @category Madius

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExportSelectedDecompiled extends GhidraScript {
    private static String safeName(String value) {
        return value.replaceAll("[^A-Za-z0-9_.-]", "_");
    }

    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length < 2) {
            throw new IllegalArgumentException(
                "usage: ExportSelectedDecompiled.java <output-directory> <address> [address ...]"
            );
        }

        Path outputDir = Paths.get(args[0]).toAbsolutePath();
        Files.createDirectories(outputDir);

        DecompInterface decompiler = new DecompInterface();
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        if (!decompiler.openProgram(currentProgram)) {
            throw new IllegalStateException("failed to initialize decompiler");
        }

        try {
            for (int i = 1; i < args.length && !monitor.isCancelled(); i++) {
                Address requested = toAddr(args[i]);
                Function function = getFunctionContaining(requested);
                if (function == null) {
                    function = getFunctionAt(requested);
                }
                if (function == null) {
                    disassemble(requested);
                    function = createFunction(requested, "Recovered_" + requested);
                }
                if (function == null) {
                    println("no function at " + requested);
                    continue;
                }

                DecompileResults result = decompiler.decompileFunction(function, 180, monitor);
                if (!result.decompileCompleted() || result.getDecompiledFunction() == null) {
                    println("decompile failed at " + requested + ": " + result.getErrorMessage());
                    continue;
                }

                String entry = function.getEntryPoint().toString();
                String fileName = entry + "_" + safeName(function.getName()) + ".c";
                String header = "/* requested " + requested + "; entry " + entry +
                    "; " + function.getName() + " */\n";
                Files.writeString(
                    outputDir.resolve(fileName),
                    header + result.getDecompiledFunction().getC() + "\n",
                    StandardCharsets.UTF_8
                );
                println("exported " + requested + " as " + fileName);
            }
        } finally {
            decompiler.dispose();
        }
    }
}
