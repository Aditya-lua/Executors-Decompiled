// Export address-indexed native pseudocode and disassembly after headless analysis.
// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileOptions;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.Reference;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;

public class DumpRecovery extends GhidraScript {
    private String cell(Object v) {
        return String.valueOf(v).replace("\t", " ").replace("\r", "\\r").replace("\n", "\\n");
    }
    private BufferedWriter writer(Path p) throws Exception {
        Files.createDirectories(p.getParent());
        return Files.newBufferedWriter(p, StandardCharsets.UTF_8);
    }
    @Override public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length < 1 || args.length > 2) throw new IllegalArgumentException("DumpRecovery.java OUTPUT_DIRECTORY [--incremental]");
        Path root = Paths.get(args[0]);
        boolean incremental = args.length == 2 && args[1].equals("--incremental");
        Files.createDirectories(root.resolve("pseudocode"));
        Files.createDirectories(root.resolve("disassembly"));
        Files.createDirectories(root.resolve("data"));
        Map<String, String[]> previous = new HashMap<>();
        Set<String> refresh = new HashSet<>();
        Path oldIndex = root.resolve("data/functions.tsv");
        if (incremental && Files.exists(oldIndex)) {
            for (String line : Files.readAllLines(oldIndex, StandardCharsets.UTF_8)) {
                String[] row = line.split("\t", -1);
                if (row.length == 8 && !row[0].equals("address")) previous.put(row[0], row);
            }
            FunctionIterator all = currentProgram.getFunctionManager().getFunctions(true);
            while (all.hasNext()) {
                Function fn = all.next();
                if (!previous.containsKey(fn.getEntryPoint().toString())) {
                    var references = currentProgram.getReferenceManager().getReferencesTo(fn.getEntryPoint());
                    while (references.hasNext()) {
                        Function caller = getFunctionContaining(references.next().getFromAddress());
                        if (caller != null) refresh.add(caller.getEntryPoint().toString());
                    }
                }
            }
        }
        DecompInterface decompiler = new DecompInterface();
        DecompileOptions options = new DecompileOptions();
        options.grabFromProgram(currentProgram);
        decompiler.setOptions(options);
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(false);
        if (!decompiler.openProgram(currentProgram)) throw new IOException(decompiler.getLastMessage());
        int total = 0, completed = 0, failed = 0, skipped = 0;
        try (BufferedWriter index = writer(root.resolve("data/functions.tsv"));
             BufferedWriter calls = writer(root.resolve("data/calls.tsv"));
             BufferedWriter refs = writer(root.resolve("data/references.tsv"))) {
            index.write("address\telf_vaddr\tname\tbody_bytes\tstatus\tpseudocode\tdisassembly\tdiagnostic\n");
            calls.write("caller\tcallee\tname\n");
            refs.write("function\tfrom\tto\ttype\n");
            FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);
            while (functions.hasNext() && !monitor.isCancelled()) {
                Function f = functions.next();
                String address = f.getEntryPoint().toString();
                String asmPath = "disassembly/" + address + ".asm";
                String cPath = "pseudocode/" + address + ".c";
                String status = "skipped", diagnostic = "";
                if (f.isExternal()) { skipped++; continue; }
                total++;
                try (BufferedWriter asm = writer(root.resolve(asmPath))) {
                    asm.write("; " + cell(f.getName(true)) + " @ " + address + "\n");
                    InstructionIterator insns = currentProgram.getListing().getInstructions(f.getBody(), true);
                    while (insns.hasNext()) {
                        Instruction ins = insns.next();
                        asm.write(ins.getAddress() + "\t" + ins.toString() + "\n");
                        for (Reference r : ins.getReferencesFrom()) {
                            refs.write(address + "\t" + ins.getAddress() + "\t" + r.getToAddress() + "\t" + r.getReferenceType() + "\n");
                        }
                    }
                }
                for (Function target : f.getCalledFunctions(monitor)) {
                    calls.write(address + "\t" + target.getEntryPoint() + "\t" + cell(target.getName(true)) + "\n");
                }
                String[] cached = previous.get(address);
                if (cached != null && cached[4].equals("decompiled") &&
                    cached[3].equals(Long.toString(f.getBody().getNumAddresses())) &&
                    Files.exists(root.resolve(cPath)) && !refresh.contains(address)) {
                    status = "decompiled"; diagnostic = cached[7]; completed++;
                } else try {
                    DecompileResults result = decompiler.decompileFunction(f, 30, monitor);
                    diagnostic = result.getErrorMessage();
                    if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                        String code = result.getDecompiledFunction().getC();
                        try (BufferedWriter out = writer(root.resolve(cPath))) {
                            out.write("/* Ghidra 12.2 pseudocode; native types and names may be inferred.\n");
                            out.write(" * Binary: " + cell(currentProgram.getName()) + "; entry: " + address + "\n */\n");
                            out.write(code);
                        }
                        status = "decompiled"; completed++;
                    } else { status = "failed"; cPath = ""; failed++; }
                } catch (Exception ex) {
                    status = "failed"; cPath = ""; diagnostic = ex.toString(); failed++;
                }
                String elfAddress = "0x" + Long.toHexString(f.getEntryPoint().subtract(currentProgram.getImageBase()));
                index.write(address + "\t" + elfAddress + "\t" + cell(f.getName(true)) + "\t" + f.getBody().getNumAddresses() + "\t" + status + "\t" + cPath + "\t" + asmPath + "\t" + cell(diagnostic) + "\n");
                if (total % 250 == 0) {
                    index.flush(); calls.flush(); refs.flush();
                    println("RECOVERY_PROGRESS functions=" + total + " decompiled=" + completed + " failed=" + failed);
                }
            }
        } finally { decompiler.dispose(); }
        try (BufferedWriter strings = writer(root.resolve("data/defined-strings.tsv"))) {
            strings.write("address\tvalue\n");
            DataIterator data = currentProgram.getListing().getDefinedData(true);
            while (data.hasNext()) {
                Data d = data.next();
                if (d.hasStringValue()) strings.write(d.getAddress() + "\t" + cell(d.getValue()) + "\n");
            }
        }
        String summary = "{\n  \"binary\": \"" + cell(currentProgram.getName()) + "\",\n" +
            "  \"ghidra_image_base\": \"" + currentProgram.getImageBase() + "\",\n" +
            "  \"language\": \"" + currentProgram.getLanguageID() + "\",\n" +
            "  \"functions\": " + total + ",\n  \"decompiled\": " + completed +
            ",\n  \"failed\": " + failed + ",\n  \"external_skipped\": " + skipped +
            ",\n  \"cancelled\": " + monitor.isCancelled() + "\n}\n";
        Files.writeString(root.resolve("data/recovery-summary.json"), summary, StandardCharsets.UTF_8);
        println("RECOVERY_COMPLETE " + summary);
    }
}
