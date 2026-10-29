/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x91ed04..0x91edd8 (212 bytes). */
#include "../lift_runtime.hpp"

void sub_0091ed04(Arm64Context& cpu) {
    /* 0x0091ed04: stp      x20, x19, [sp, #-0x20]! */ ARM64("stp x20, x19, [sp, #-0x20]!");
    /* 0x0091ed08: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x0091ed0c: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x0091ed10: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x0091ed14: adrp     x20, #0xf0d000 */ ARM64("adrp x20, #0xf0d000");
    /* 0x0091ed18: add      x20, x20, #0x198 */ ARM64("add x20, x20, #0x198");
    /* 0x0091ed1c: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x0091ed20: ldr      x8, [x8, #0x480] */ ARM64("ldr x8, [x8, #0x480]");
    /* 0x0091ed24: adrp     x9, #0xd26000 */ ARM64("adrp x9, #0xd26000");
    /* 0x0091ed28: ldr      x9, [x9, #0x7f0] */ ARM64("ldr x9, [x9, #0x7f0]");
    /* 0x0091ed2c: adrp     x10, #0xe82000 */ ARM64("adrp x10, #0xe82000");
    /* 0x0091ed30: ldr      x10, [x10, #0xdf0] */ ARM64("ldr x10, [x10, #0xdf0]");
    /* 0x0091ed34: sub      x9, x10, x9 */ ARM64("sub x9, x10, x9");
    /* 0x0091ed38: add      x8, x8, #0x11, lsl #12 */ ARM64("add x8, x8, #0x11, lsl #12");
    /* 0x0091ed3c: add      x0, x8, #0x958 */ ARM64("add x0, x8, #0x958");
    /* 0x0091ed40: add      x1, x19, #0x50 */ ARM64("add x1, x19, #0x50");
    /* 0x0091ed44: blr      x9 */ CALL_INDIRECT(x9);
    /* 0x0091ed48: ldr      x0, [x0] */ ARM64("ldr x0, [x0]");
    /* 0x0091ed4c: cbnz     x0, #0x91edcc */ if (x0 != 0) goto loc_0091edcc;
    /* 0x0091ed50: adrp     x8, #0xd26000 */ ARM64("adrp x8, #0xd26000");
    /* 0x0091ed54: ldr      x8, [x8, #0x7f8] */ ARM64("ldr x8, [x8, #0x7f8]");
    /* 0x0091ed58: adrp     x9, #0xe82000 */ ARM64("adrp x9, #0xe82000");
    /* 0x0091ed5c: ldr      x9, [x9, #0xdf8] */ ARM64("ldr x9, [x9, #0xdf8]");
    /* 0x0091ed60: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x0091ed64: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0091ed68: blr      x8 */ CALL_INDIRECT(x8);
loc_0091ed6c:
    /* 0x0091ed6c: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0091ed70: ldr      x9, [x0, #0x48] */ ARM64("ldr x9, [x0, #0x48]");
    /* 0x0091ed74: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x0091ed78: b.hs     #0x91ed8c */ if (COND_HS) goto loc_0091ed8c;
    /* 0x0091ed7c: add      x9, x8, #0x10 */ ARM64("add x9, x8, #0x10");
    /* 0x0091ed80: str      x9, [x0, #0x58] */ ARM64("str x9, [x0, #0x58]");
    /* 0x0091ed84: str      wzr, [x8, #0xc] */ ARM64("str wzr, [x8, #0xc]");
    /* 0x0091ed88: b        #0x91ed6c */ goto loc_0091ed6c;
loc_0091ed8c:
    /* 0x0091ed8c: str      x9, [x0, #0x58] */ ARM64("str x9, [x0, #0x58]");
    /* 0x0091ed90: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x0091ed94: ldr      x8, [x8, #0x480] */ ARM64("ldr x8, [x8, #0x480]");
    /* 0x0091ed98: adrp     x9, #0xd26000 */ ARM64("adrp x9, #0xd26000");
    /* 0x0091ed9c: ldr      x9, [x9, #0x800] */ ARM64("ldr x9, [x9, #0x800]");
    /* 0x0091eda0: adrp     x10, #0xe82000 */ ARM64("adrp x10, #0xe82000");
    /* 0x0091eda4: ldr      x10, [x10, #0xe00] */ ARM64("ldr x10, [x10, #0xe00]");
    /* 0x0091eda8: sub      x9, x10, x9 */ ARM64("sub x9, x10, x9");
    /* 0x0091edac: add      x8, x8, #0x11, lsl #12 */ ARM64("add x8, x8, #0x11, lsl #12");
    /* 0x0091edb0: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x0091edb4: add      x0, x8, #0x958 */ ARM64("add x0, x8, #0x958");
    /* 0x0091edb8: add      x1, x19, #0x50 */ ARM64("add x1, x19, #0x50");
    /* 0x0091edbc: blr      x9 */ CALL_INDIRECT(x9);
    /* 0x0091edc0: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x0091edc4: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x0091edc8: str      x20, [x8] */ ARM64("str x20, [x8]");
loc_0091edcc:
    /* 0x0091edcc: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0091edd0: ldp      x20, x19, [sp], #0x20 */ ARM64("ldp x20, x19, [sp], #0x20");
    /* 0x0091edd4: ret       */ return;
}
