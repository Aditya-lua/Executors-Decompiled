/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x517f4..0x5184c (88 bytes). */
#include "../lift_runtime.hpp"

void sub_000517f4(Arm64Context& cpu) {
    /* 0x000517f4: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x000517f8: stp      x20, x19, [sp, #0x10] */ ARM64("stp x20, x19, [sp, #0x10]");
    /* 0x000517fc: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x00051800: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x00051804: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x00051808: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x0005180c: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x00051810: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x00051814: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x00051818: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x0005181c: ldr      x1, [x1, #0x20] */ ARM64("ldr x1, [x1, #0x20]");
    /* 0x00051820: bl       #0x513b8 */ CALL_DIRECT(sub_000513b8);
    /* 0x00051824: ldr      x0, [x19, #0x28] */ ARM64("ldr x0, [x19, #0x28]");
    /* 0x00051828: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x0005182c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00051830: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00051834: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00051838: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0005183c: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x00051840: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x00051844: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x00051848: ret       */ return;
}
