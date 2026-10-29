/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x56424..0x5647c (88 bytes). */
#include "../lift_runtime.hpp"

void sub_00056424(Arm64Context& cpu) {
    /* 0x00056424: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x00056428: stp      x20, x19, [sp, #0x10] */ ARM64("stp x20, x19, [sp, #0x10]");
    /* 0x0005642c: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x00056430: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x00056434: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x00056438: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x0005643c: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x00056440: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x00056444: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x00056448: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x0005644c: ldr      x1, [x1, #0x28] */ ARM64("ldr x1, [x1, #0x28]");
    /* 0x00056450: bl       #0x56620 */ CALL_DIRECT(sub_00056620);
    /* 0x00056454: ldr      x0, [x19, #0x30] */ ARM64("ldr x0, [x19, #0x30]");
    /* 0x00056458: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x0005645c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00056460: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00056464: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00056468: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0005646c: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x00056470: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x00056474: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x00056478: ret       */ return;
}
