// Export every discovered function as C-like Ghidra pseudocode.
// @category Madius

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import ghidra.program.model.mem.MemoryBlock;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExportAllDecompiled extends GhidraScript {
    private static String safeName(String value) {
        return value.replaceAll("[^A-Za-z0-9_.-]", "_");
    }

    private static String tsv(String value) {
        return value.replace("\t", " ").replace("\r", " ").replace("\n", " ");
    }

    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 1) {
            throw new IllegalArgumentException("usage: ExportAllDecompiled.java <output-directory>");
        }

        Path outputDir = Paths.get(args[0]).toAbsolutePath();
        Path functionsDir = outputDir.resolve("functions");
        Files.createDirectories(functionsDir);

        DecompInterface decompiler = new DecompInterface();
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        if (!decompiler.openProgram(currentProgram)) {
            throw new IllegalStateException("failed to initialize decompiler");
        }

        // The reconstructed image still contains protector VM sections.  They are
        // not application source and make bulk decompilation effectively
        // unbounded, so export only functions whose entry points are in the
        // restored native application .text section.
        int total = 0;
        FunctionIterator countFunctions = currentProgram.getFunctionManager().getFunctions(true);
        while (countFunctions.hasNext()) {
            Function function = countFunctions.next();
            MemoryBlock block = currentProgram.getMemory().getBlock(function.getEntryPoint());
            if (block != null && ".text".equals(block.getName())) {
                total++;
            }
        }
        int index = 0;
        int succeeded = 0;
        int failed = 0;
        int skipped = 0;

        try (
            BufferedWriter manifest = Files.newBufferedWriter(
                outputDir.resolve("manifest.tsv"), StandardCharsets.UTF_8
            );
            BufferedWriter combined = Files.newBufferedWriter(
                outputDir.resolve("all_functions.c"), StandardCharsets.UTF_8
            )
        ) {
            manifest.write("address\tname\tstatus\tfile\terror\n");
            combined.write("/* Ghidra pseudocode export: " + currentProgram.getName() + " */\n\n");

            FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);
            while (functions.hasNext() && !monitor.isCancelled()) {
                Function function = functions.next();
                MemoryBlock block = currentProgram.getMemory().getBlock(function.getEntryPoint());
                if (block == null || !".text".equals(block.getName())) {
                    continue;
                }
                index++;
                String address = function.getEntryPoint().toString();
                String name = function.getName();
                String fileName = address + "_" + safeName(name) + ".c";
                Path functionFile = functionsDir.resolve(fileName);

                // Protector-confused analysis can create a function whose entry
                // is in .text but whose body incorrectly absorbs executable VM
                // sections.  Reject those bodies before invoking the decompiler.
                MemoryBlock minBlock = currentProgram.getMemory().getBlock(function.getBody().getMinAddress());
                MemoryBlock maxBlock = currentProgram.getMemory().getBlock(function.getBody().getMaxAddress());
                long bodyBytes = function.getBody().getNumAddresses();
                if (minBlock == null || maxBlock == null ||
                    !".text".equals(minBlock.getName()) || !".text".equals(maxBlock.getName()) ||
                    bodyBytes > 0x40000) {
                    manifest.write(address + "\t" + tsv(name) + "\tskipped\t\t" +
                        "body escapes .text or exceeds 0x40000 bytes\n");
                    skipped++;
                    continue;
                }

                DecompileResults result = decompiler.decompileFunction(function, 10, monitor);
                if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                    String code = result.getDecompiledFunction().getC();
                    String header = "/* " + address + " " + name + " */\n";
                    Files.writeString(functionFile, header + code + "\n", StandardCharsets.UTF_8);
                    combined.write(header);
                    combined.write(code);
                    combined.write("\n\n");
                    manifest.write(address + "\t" + tsv(name) + "\tok\tfunctions/" + fileName + "\t\n");
                    succeeded++;
                } else {
                    String error = result.getErrorMessage();
                    manifest.write(address + "\t" + tsv(name) + "\tfailed\t\t" + tsv(error == null ? "unknown" : error) + "\n");
                    failed++;
                }

                if (index % 250 == 0) {
                    println("decompiled " + index + "/" + total + " functions");
                }
            }
        } finally {
            decompiler.dispose();
        }

        println("export complete: " + succeeded + " succeeded, " + failed + " failed, " +
            skipped + " skipped, " + total + " total");
    }
}
