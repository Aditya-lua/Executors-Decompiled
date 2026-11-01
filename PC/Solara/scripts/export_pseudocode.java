import ghidra.app.script.GhidraScript;
import ghidra.app.cmd.disassemble.DisassembleCommand;
import ghidra.app.decompiler.*;
import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressSet;
import ghidra.program.model.listing.Function;
import java.io.File;
import java.nio.file.Files;

public class export_pseudocode extends GhidraScript {

    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        File rangeFile = new File(args[0]);
        File outDir = new File(args[1]);
        int timeout = Integer.parseInt(args[2]);
        outDir.mkdirs();

        DecompInterface di = new DecompInterface();
        di.toggleCCode(true);
        di.toggleSyntaxTree(true);
        di.setSimplificationStyle("decompile");

        if (!di.openProgram(currentProgram)) {
            println("OPEN_FAILED");
            return;
        }

        StringBuilder index = new StringBuilder("start\tend\tbytes\tname\tstatus\tfile\n");
        int ok = 0;
        int fail = 0;
        int total = 0;

        for (String raw : Files.readAllLines(rangeFile.toPath())) {
            String line = raw.trim();
            if (line.isEmpty() || line.startsWith("#")) {
                continue;
            }
            String[] p = line.split("\\s+");
            long st = Long.parseUnsignedLong(p[0], 16);
            long en = Long.parseUnsignedLong(p[1], 16);
            total++;

            Address start = toAddr(st);
            Address end = toAddr(en);

            try {
                new DisassembleCommand(start, new AddressSet(start, end), false)
                        .applyTo(currentProgram, monitor);

                Function f = getFunctionAt(start);
                if (f == null) {
                    f = createFunction(start, null);
                }
                if (f == null) {
                    index.append(String.format("%x\t%x\t%d\t?\tNO_FUNCTION\t-\n", st, en, en - st));
                    fail++;
                    continue;
                }

                DecompileResults res = di.decompileFunction(f, timeout, monitor);
                String name = f.getName();

                if (res.decompileCompleted() && res.getDecompiledFunction() != null) {
                    String c = res.getDecompiledFunction().getC();
                    String safe = name.replaceAll("[^A-Za-z0-9_.]", "_");
                    String fn = String.format("%08x_%s.c", st & 0xffffffffL, safe);
                    Files.write(outDir.toPath().resolve(fn), c.getBytes("UTF-8"));
                    index.append(String.format("%x\t%x\t%d\t%s\tOK\t%s\n", st, en, en - st, name, fn));
                    ok++;
                    println("OK " + String.format("%x", st) + " " + name + " " + c.length());
                } else {
                    index.append(String.format("%x\t%x\t%d\t%s\tFAIL\t-\n", st, en, en - st, name));
                    fail++;
                    println("FAIL " + String.format("%x", st) + " " + res.getErrorMessage());
                }
            } catch (Throwable t) {
                index.append(String.format("%x\t%x\t%d\t?\tERROR_%s\t-\n",
                        st, en, en - st, t.getClass().getSimpleName()));
                fail++;
            }
        }

        Files.write(outDir.toPath().resolve("INDEX.tsv"), index.toString().getBytes("UTF-8"));
        println("DONE=" + ok + "/" + total + " fail=" + fail);
    }
}
