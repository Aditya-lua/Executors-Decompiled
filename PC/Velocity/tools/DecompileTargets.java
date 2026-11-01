// Decompile entry point and every function referencing requested addresses.
// @category Velocity

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Set;

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressIterator;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionManager;
import ghidra.program.model.symbol.Reference;
import ghidra.program.model.symbol.ReferenceIterator;

public class DecompileTargets extends GhidraScript {
    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length < 1) {
            printerr("Usage: DecompileTargets <output-file> [target-address ...]");
            return;
        }

        Set<Function> targets = new LinkedHashSet<>();
        FunctionManager fm = currentProgram.getFunctionManager();
        AddressIterator entries = currentProgram.getSymbolTable().getExternalEntryPointIterator();
        while (entries.hasNext()) {
            Function entryFunction = fm.getFunctionContaining(entries.next());
            if (entryFunction != null) targets.add(entryFunction);
        }

        for (int i = 1; i < args.length; i++) {
            Address address = toAddr(args[i]);
            ReferenceIterator refs = currentProgram.getReferenceManager().getReferencesTo(address);
            while (refs.hasNext()) {
                Reference ref = refs.next();
                Function f = fm.getFunctionContaining(ref.getFromAddress());
                if (f != null) targets.add(f);
            }
        }

        DecompInterface decompiler = new DecompInterface();
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        decompiler.openProgram(currentProgram);

        File out = new File(args[0]);
        out.getParentFile().mkdirs();
        try (FileWriter writer = new FileWriter(out)) {
            writer.write("/* Ghidra static pseudocode. Original symbols unavailable. */\n\n");
            for (Function f : targets) {
                writer.write("/* address=" + f.getEntryPoint() + " name=" + f.getName() + " */\n");
                DecompileResults result = decompiler.decompileFunction(f, 180, monitor);
                if (result.decompileCompleted()) {
                    writer.write(result.getDecompiledFunction().getC());
                } else {
                    writer.write("/* decompilation failed: " + result.getErrorMessage() + " */\n");
                }
                writer.write("\n\n");
            }
            writer.write("/* functions_emitted=" + targets.size() + " */\n");
        }
        decompiler.dispose();
        println("Decompiled " + targets.size() + " target functions to " + out);
    }
}
