/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x3daeb8..0x3dafac (244 bytes). */
#include "../lift_runtime.hpp"

void sub_003daeb8(Arm64Context& cpu) {
loc_003daeb8:
    /* 0x003daeb8: adr      x16, #0x3daeb8 */ ARM64("adr x16, #0x3daeb8");
    /* 0x003daebc: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x003daec0: ldr      x1, #0x3daec8 */ ARM64("ldr x1, #0x3daec8");
    /* 0x003daec4: blr      x17 */ CALL_INDIRECT(x17);
loc_003daec8:
    /* 0x003daec8: ldr      x1, #0x3daed0 */ ARM64("ldr x1, #0x3daed0");
    /* 0x003daecc: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_003daed0:
    /* 0x003daed0: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x003daed4: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x003daed8: sub      sp, sp, #0x50 */ ARM64("sub sp, sp, #0x50");
    /* 0x003daedc: stp      x22, x21, [sp, #0x20] */ ARM64("stp x22, x21, [sp, #0x20]");
    /* 0x003daee0: stp      x20, x19, [sp, #0x30] */ ARM64("stp x20, x19, [sp, #0x30]");
    /* 0x003daee4: stp      x29, x30, [sp, #0x40] */ ARM64("stp x29, x30, [sp, #0x40]");
    /* 0x003daee8: add      x29, sp, #0x40 */ ARM64("add x29, sp, #0x40");
    /* 0x003daeec: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x003daef0: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x003daef4: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x003daef8: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x003daefc: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x003daf00: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
    /* 0x003daf04: str      x8, [sp, #0x18] */ ARM64("str x8, [sp, #0x18]");
    /* 0x003daf08: add      x8, sp, #0x18 */ ARM64("add x8, sp, #0x18");
    /* 0x003daf0c: str      x8, [sp, #0x10] */ ARM64("str x8, [sp, #0x10]");
    /* 0x003daf10: adrp     x21, #0xf0d000 */ ARM64("adrp x21, #0xf0d000");
    /* 0x003daf14: add      x21, x21, #0x3d8 */ ARM64("add x21, x21, #0x3d8");
    /* 0x003daf18: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x003daf1c: ldr      x8, [x8, #0x178] */ ARM64("ldr x8, [x8, #0x178]");
    /* 0x003daf20: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x003daf24: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x003daf28: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x003daf2c: cbnz     x0, #0x3daf38 */ if (x0 != 0) goto loc_003daf38;
    /* 0x003daf30: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x003daf34: ldr      x20, [x8, #0x150] */ ARM64("ldr x20, [x8, #0x150]");
loc_003daf38:
    /* 0x003daf38: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x003daf3c: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x003daf40: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x003daf44: mov      w3, #1 */ ARM64("mov w3, #1");
    /* 0x003daf48: mov      x4, #0 */ ARM64("mov x4, #0");
    /* 0x003daf4c: bl       #0xe6664 */ CALL_DIRECT(sub_000e6664);
    /* 0x003daf50: ldr      w8, [x20] */ ARM64("ldr w8, [x20]");
    /* 0x003daf54: adrp     x9, #0xf0d000 */ ARM64("adrp x9, #0xf0d000");
    /* 0x003daf58: add      x9, x9, #0x198 */ ARM64("add x9, x9, #0x198");
    /* 0x003daf5c: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x003daf60: ldr      x9, [x9, #0x60] */ ARM64("ldr x9, [x9, #0x60]");
    /* 0x003daf64: ldr      x10, [x9, #0x180] */ ARM64("ldr x10, [x9, #0x180]");
    /* 0x003daf68: mvn      x11, x10 */ ARM64("mvn x11, x10");
    /* 0x003daf6c: add      x11, x10, x11, lsl #1 */ ARM64("add x11, x10, x11, lsl #1");
    /* 0x003daf70: add      w12, w11, #1 */ ARM64("add w12, w11, #1");
    /* 0x003daf74: orr      x12, x12, #0xffffffffffefffff */ ARM64("orr x12, x12, #0xffffffffffefffff");
    /* 0x003daf78: eon      x13, x11, x12 */ ARM64("eon x13, x11, x12");
    /* 0x003daf7c: bic      x11, x12, x11 */ ARM64("bic x11, x12, x11");
    /* 0x003daf80: add      x11, x13, x11, lsl #1 */ ARM64("add x11, x13, x11, lsl #1");
    /* 0x003daf84: orr      x10, x10, #0x100000 */ ARM64("orr x10, x10, #0x100000");
    /* 0x003daf88: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x003daf8c: csel     x8, x11, x10, eq */ ARM64("csel x8, x11, x10, eq");
    /* 0x003daf90: str      x8, [x9, #0x180] */ ARM64("str x8, [x9, #0x180]");
    /* 0x003daf94: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x003daf98: ldp      x29, x30, [sp, #0x40] */ ARM64("ldp x29, x30, [sp, #0x40]");
    /* 0x003daf9c: ldp      x20, x19, [sp, #0x30] */ ARM64("ldp x20, x19, [sp, #0x30]");
    /* 0x003dafa0: ldp      x22, x21, [sp, #0x20] */ ARM64("ldp x22, x21, [sp, #0x20]");
    /* 0x003dafa4: add      sp, sp, #0x50 */ ARM64("add sp, sp, #0x50");
    /* 0x003dafa8: ret       */ return;
}
