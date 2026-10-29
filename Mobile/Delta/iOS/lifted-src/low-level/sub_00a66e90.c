/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa66e90..0xa66e98 (8 bytes). */
#include "../lift_runtime.hpp"

void sub_00a66e90(Arm64Context& cpu) {
    /* 0x00a66e90: xar      z0.d, z0.d, z0.d, #0x20 */ ARM64("xar z0.d, z0.d, z0.d, #0x20");
    /* 0x00a66e94: ret       */ return;
}
