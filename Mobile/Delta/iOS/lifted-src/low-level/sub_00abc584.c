/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xabc584..0xabc5a0 (28 bytes). */
#include "../lift_runtime.hpp"

void sub_00abc584(Arm64Context& cpu) {
    /* 0x00abc584: adrp     x6, #0xaba000 */ ARM64("adrp x6, #0xaba000");
    /* 0x00abc588: add      x6, x6, #0xf10 */ ARM64("add x6, x6, #0xf10");
    /* 0x00abc58c: b        #0xa97754 */ goto sub_00a97754;
    /* 0x00abc590: udf      #0 */ ARM64("udf #0");
    /* 0x00abc594: udf      #0 */ ARM64("udf #0");
    /* 0x00abc598: udf      #0 */ ARM64("udf #0");
    /* 0x00abc59c: udf      #0 */ ARM64("udf #0");
}
