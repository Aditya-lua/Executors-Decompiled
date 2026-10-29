/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa66e80..0xa66e88 (8 bytes). */
#include "../lift_runtime.hpp"

void sub_00a66e80(Arm64Context& cpu) {
    /* 0x00a66e80: eor3     v0.16b, v0.16b, v1.16b, v2.16b */ ARM64("eor3 v0.16b, v0.16b, v1.16b, v2.16b");
    /* 0x00a66e84: ret       */ return;
}
