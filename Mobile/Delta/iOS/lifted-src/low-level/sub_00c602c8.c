/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xc602c8..0xc602dc (20 bytes). */
#include "../lift_runtime.hpp"

void sub_00c602c8(Arm64Context& cpu) {
    /* 0x00c602c8: str      wzr, [sp, #0xb0] */ ARM64("str wzr, [sp, #0xb0]");
    /* 0x00c602cc: str      wzr, [sp, #0xa0] */ ARM64("str wzr, [sp, #0xa0]");
    /* 0x00c602d0: str      wzr, [sp, #0x98] */ ARM64("str wzr, [sp, #0x98]");
    /* 0x00c602d4: str      wzr, [sp, #0x90] */ ARM64("str wzr, [sp, #0x90]");
    /* 0x00c602d8: ret       */ return;
}
