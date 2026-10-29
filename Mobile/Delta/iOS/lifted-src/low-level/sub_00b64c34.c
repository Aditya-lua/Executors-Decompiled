/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb64c34..0xb64c44 (16 bytes). */
#include "../lift_runtime.hpp"

void sub_00b64c34(Arm64Context& cpu) {
    /* 0x00b64c34: udf      #0x10 */ ARM64("udf #0x10");
    /* 0x00b64c38: udf      #0x20 */ ARM64("udf #0x20");
    /* 0x00b64c3c: udf      #0x70 */ ARM64("udf #0x70");
    /* 0x00b64c40: udf      #0x80 */ ARM64("udf #0x80");
}
