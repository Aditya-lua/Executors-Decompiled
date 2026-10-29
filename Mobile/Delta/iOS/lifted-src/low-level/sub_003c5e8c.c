/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x3c5e8c..0x3c5eb4 (40 bytes). */
#include "../lift_runtime.hpp"

void sub_003c5e8c(Arm64Context& cpu) {
    /* 0x003c5e8c: stp      x29, x30, [sp, #-0x10]! */ ARM64("stp x29, x30, [sp, #-0x10]!");
    /* 0x003c5e90: mov      x29, sp */ ARM64("mov x29, sp");
    /* 0x003c5e94: adrp     x8, #0xf0d000 */ ARM64("adrp x8, #0xf0d000");
    /* 0x003c5e98: add      x8, x8, #0x3d8 */ ARM64("add x8, x8, #0x3d8");
    /* 0x003c5e9c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x003c5ea0: ldr      x8, [x8, #0x1d0] */ ARM64("ldr x8, [x8, #0x1d0]");
    /* 0x003c5ea4: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x003c5ea8: ldr      w0, [x0] */ ARM64("ldr w0, [x0]");
    /* 0x003c5eac: ldp      x29, x30, [sp], #0x10 */ ARM64("ldp x29, x30, [sp], #0x10");
    /* 0x003c5eb0: ret       */ return;
}
