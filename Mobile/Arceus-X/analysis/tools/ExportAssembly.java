// Export every instruction recognized by Ghidra's analysis.
// @category Export

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Instruction;
import ghidra.program.model.listing.InstructionIterator;

public class ExportAssembly extends GhidraScript {
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

        long count = 0;
        InstructionIterator instructions = currentProgram.getListing().getInstructions(true);
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(output)))) {
            writer.println("# Ghidra AArch64 instruction listing");
            writer.println("# Program: " + currentProgram.getName());
            writer.println("# Format: address | bytes | instruction");
            while (instructions.hasNext() && !monitor.isCancelled()) {
                Instruction instruction = instructions.next();
                byte[] bytes = instruction.getBytes();
                StringBuilder hex = new StringBuilder();
                for (byte value : bytes) {
                    hex.append(String.format("%02x", value & 0xff));
                }
                writer.printf("%s | %-16s | %s%n", instruction.getAddress(), hex.toString(), instruction.toString());
                count++;
            }
            writer.println("# Instruction count: " + count);
        }
        println("Exported " + count + " instructions");
    }
}
