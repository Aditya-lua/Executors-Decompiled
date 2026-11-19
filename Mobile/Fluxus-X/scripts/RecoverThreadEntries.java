// Mark function-pointer targets observed in startup-thread and hook call sites.
// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;

public class RecoverThreadEntries extends GhidraScript {
    @Override public void run() throws Exception {
        // ELF VAs: lambda passed to std::thread, pthread_create trampoline,
        // the trampoline's exception cleanup target, and Dobby hook callbacks. These are code
        // pointers observed in ARM64 instructions, not guessed API names.
        long[] entries = { 0x6fdb84L, 0x6ff484L, 0x6ff544L,
                           0x6fd060L, 0x6fd0d4L, 0x6fdaa0L };
        for (long offset : entries) {
            Address entry = currentProgram.getImageBase().add(offset);
            Function existing = getFunctionAt(entry);
            if (existing == null) {
                disassemble(entry);
                Function created = createFunction(entry, null);
                if (created == null) throw new IllegalStateException("Could not mark function " + entry);
                println("RECOVERED_FUNCTION_POINTER " + entry + " " + created.getName());
            }
        }
        analyzeChanges(currentProgram);
    }
}
