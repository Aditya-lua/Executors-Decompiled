/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x563cc..0x56424 (88 bytes). */
#include "../lift_runtime.hpp"

void sub_000563cc(Arm64Context& cpu) {
    /* 0x000563cc: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x000563d0: stp      x20, x19, [sp, #0x10] */ ARM64("stp x20, x19, [sp, #0x10]");
    /* 0x000563d4: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x000563d8: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x000563dc: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x000563e0: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x000563e4: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x000563e8: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x000563ec: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x000563f0: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x000563f4: ldr      x1, [x1, #0x20] */ ARM64("ldr x1, [x1, #0x20]");
    /* 0x000563f8: bl       #0x56620 */ CALL_DIRECT(sub_00056620);
    /* 0x000563fc: ldr      x0, [x19, #0x28] */ ARM64("ldr x0, [x19, #0x28]");
    /* 0x00056400: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00056404: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00056408: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x0005640c: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00056410: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00056414: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x00056418: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x0005641c: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x00056420: ret       */ return;
}
