/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa66e70..0xa66e78 (8 bytes). */
#include "../lift_runtime.hpp"

void sub_00a66e70(Arm64Context& cpu) {
    /* 0x00a66e70: sm4e     v0.4s, v0.4s */ ARM64("sm4e v0.4s, v0.4s");
    /* 0x00a66e74: ret       */ return;
}
