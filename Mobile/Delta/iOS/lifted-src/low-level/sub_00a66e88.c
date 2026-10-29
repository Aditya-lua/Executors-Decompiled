/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa66e88..0xa66e90 (8 bytes). */
#include "../lift_runtime.hpp"

void sub_00a66e88(Arm64Context& cpu) {
    /* 0x00a66e88: eor      z0.d, z0.d, z0.d */ ARM64("eor z0.d, z0.d, z0.d");
    /* 0x00a66e8c: ret       */ return;
}
