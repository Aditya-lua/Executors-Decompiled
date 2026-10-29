/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa66ea0..0xa66ec0 (32 bytes). */
#include "../lift_runtime.hpp"

void sub_00a66ea0(Arm64Context& cpu) {
    /* 0x00a66ea0: sm3partw1 v4.4s, v0.4s, v3.4s */ ARM64("sm3partw1 v4.4s, v0.4s, v3.4s");
    /* 0x00a66ea4: ret       */ return;
    /* 0x00a66ea8: nop       */ ARM64("nop");
    /* 0x00a66eac: nop       */ ARM64("nop");
    /* 0x00a66eb0: nop       */ ARM64("nop");
    /* 0x00a66eb4: nop       */ ARM64("nop");
    /* 0x00a66eb8: nop       */ ARM64("nop");
    /* 0x00a66ebc: nop       */ ARM64("nop");
}
