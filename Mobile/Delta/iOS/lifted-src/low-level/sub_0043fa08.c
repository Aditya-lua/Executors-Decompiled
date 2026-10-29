/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x43fa08..0x43fb44 (316 bytes). */
#include "../lift_runtime.hpp"

void sub_0043fa08(Arm64Context& cpu) {
loc_0043fa08:
    /* 0x0043fa08: adr      x16, #0x43fa08 */ ARM64("adr x16, #0x43fa08");
    /* 0x0043fa0c: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x0043fa10: ldr      x1, #0x43fa18 */ ARM64("ldr x1, #0x43fa18");
    /* 0x0043fa14: blr      x17 */ CALL_INDIRECT(x17);
loc_0043fa18:
    /* 0x0043fa18: ldr      x1, #0x43fa20 */ ARM64("ldr x1, #0x43fa20");
    /* 0x0043fa1c: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_0043fa20:
    /* 0x0043fa20: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x0043fa24: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x0043fa28: sub      sp, sp, #0x60 */ ARM64("sub sp, sp, #0x60");
    /* 0x0043fa2c: stp      x20, x19, [sp, #0x40] */ ARM64("stp x20, x19, [sp, #0x40]");
    /* 0x0043fa30: stp      x29, x30, [sp, #0x50] */ ARM64("stp x29, x30, [sp, #0x50]");
    /* 0x0043fa34: add      x29, sp, #0x50 */ ARM64("add x29, sp, #0x50");
    /* 0x0043fa38: adrp     x8, #0xe5c000 */ ARM64("adrp x8, #0xe5c000");
    /* 0x0043fa3c: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x0043fa40: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x0043fa44: stur     x8, [x29, #-0x18] */ ARM64("stur x8, [x29, #-0x18]");
    /* 0x0043fa48: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x0043fa4c: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x0043fa50: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x0043fa54: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x0043fa58: mov      x8, #0x7270 */ ARM64("mov x8, #0x7270");
    /* 0x0043fa5c: movk     x8, #0x7d6f, lsl #16 */ ARM64("movk x8, #0x7d6f, lsl #16");
    /* 0x0043fa60: movk     x8, #0x1f7f, lsl #32 */ ARM64("movk x8, #0x1f7f, lsl #32");
    /* 0x0043fa64: movk     x8, #0x1b93, lsl #48 */ ARM64("movk x8, #0x1b93, lsl #48");
    /* 0x0043fa68: mov      x9, #0x8baf */ ARM64("mov x9, #0x8baf");
    /* 0x0043fa6c: movk     x9, #0x2e34, lsl #16 */ ARM64("movk x9, #0x2e34, lsl #16");
    /* 0x0043fa70: movk     x9, #0x9d1f, lsl #32 */ ARM64("movk x9, #0x9d1f, lsl #32");
    /* 0x0043fa74: movk     x9, #0x19fd, lsl #48 */ ARM64("movk x9, #0x19fd, lsl #48");
    /* 0x0043fa78: stp      x8, x9, [sp, #0x10] */ ARM64("stp x8, x9, [sp, #0x10]");
    /* 0x0043fa7c: mov      x8, #0x1e11 */ ARM64("mov x8, #0x1e11");
    /* 0x0043fa80: movk     x8, #0x1203, lsl #16 */ ARM64("movk x8, #0x1203, lsl #16");
    /* 0x0043fa84: movk     x8, #0x6d08, lsl #32 */ ARM64("movk x8, #0x6d08, lsl #32");
    /* 0x0043fa88: movk     x8, #0x79fc, lsl #48 */ ARM64("movk x8, #0x79fc, lsl #48");
    /* 0x0043fa8c: mov      x9, #0xf3da */ ARM64("mov x9, #0xf3da");
    /* 0x0043fa90: movk     x9, #0x2e34, lsl #16 */ ARM64("movk x9, #0x2e34, lsl #16");
    /* 0x0043fa94: movk     x9, #0x9d1f, lsl #32 */ ARM64("movk x9, #0x9d1f, lsl #32");
    /* 0x0043fa98: movk     x9, #0x19fd, lsl #48 */ ARM64("movk x9, #0x19fd, lsl #48");
    /* 0x0043fa9c: stp      x8, x9, [sp, #0x20] */ ARM64("stp x8, x9, [sp, #0x20]");
    /* 0x0043faa0: add      x8, sp, #0x20 */ ARM64("add x8, sp, #0x20");
    /* 0x0043faa4: add      x19, sp, #0x10 */ ARM64("add x19, sp, #0x10");
    /* 0x0043faa8: ldr      q0, [x19] */ ARM64("ldr q0, [x19]");
    /* 0x0043faac: ldr      q1, [x8] */ ARM64("ldr q1, [x8]");
    /* 0x0043fab0: mvn      v2.16b, v0.16b */ ARM64("mvn v2.16b, v0.16b");
    /* 0x0043fab4: add      v3.2d, v2.2d, v2.2d */ ARM64("add v3.2d, v2.2d, v2.2d");
    /* 0x0043fab8: sub      v2.2d, v3.2d, v2.2d */ ARM64("sub v2.2d, v3.2d, v2.2d");
    /* 0x0043fabc: mvn      v3.16b, v2.16b */ ARM64("mvn v3.16b, v2.16b");
    /* 0x0043fac0: orn      v2.16b, v1.16b, v2.16b */ ARM64("orn v2.16b, v1.16b, v2.16b");
    /* 0x0043fac4: sub      v2.2d, v2.2d, v3.2d */ ARM64("sub v2.2d, v2.2d, v3.2d");
    /* 0x0043fac8: neg      v1.2d, v1.2d */ ARM64("neg v1.2d, v1.2d");
    /* 0x0043facc: eor      v3.16b, v0.16b, v1.16b */ ARM64("eor v3.16b, v0.16b, v1.16b");
    /* 0x0043fad0: and      v0.16b, v0.16b, v1.16b */ ARM64("and v0.16b, v0.16b, v1.16b");
    /* 0x0043fad4: add      v0.2d, v0.2d, v2.2d */ ARM64("add v0.2d, v0.2d, v2.2d");
    /* 0x0043fad8: add      v0.2d, v0.2d, v0.2d */ ARM64("add v0.2d, v0.2d, v0.2d");
    /* 0x0043fadc: add      v0.2d, v0.2d, v3.2d */ ARM64("add v0.2d, v0.2d, v3.2d");
    /* 0x0043fae0: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x0043fae4: add      x1, sp, #0x10 */ ARM64("add x1, sp, #0x10");
    /* 0x0043fae8: mov      x2, #0x800000000000000 */ ARM64("mov x2, #0x800000000000000");
    /* 0x0043faec: mov      w3, #0 */ ARM64("mov w3, #0");
    /* 0x0043faf0: mov      w4, #1 */ ARM64("mov w4, #1");
    /* 0x0043faf4: bl       #0x3f5888 */ CALL_DIRECT(sub_003f5888);
    /* 0x0043faf8: movi     v0.16b, #0 */ ARM64("movi v0.16b, #0");
    /* 0x0043fafc: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x0043fb00: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
    /* 0x0043fb04: ldur     x8, [x29, #-0x18] */ ARM64("ldur x8, [x29, #-0x18]");
    /* 0x0043fb08: adrp     x9, #0xe5c000 */ ARM64("adrp x9, #0xe5c000");
    /* 0x0043fb0c: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x0043fb10: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x0043fb14: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x0043fb18: b.ne     #0x43fb30 */ if (COND_NE) goto loc_0043fb30;
    /* 0x0043fb1c: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0043fb20: ldp      x29, x30, [sp, #0x50] */ ARM64("ldp x29, x30, [sp, #0x50]");
    /* 0x0043fb24: ldp      x20, x19, [sp, #0x40] */ ARM64("ldp x20, x19, [sp, #0x40]");
    /* 0x0043fb28: add      sp, sp, #0x60 */ ARM64("add sp, sp, #0x60");
    /* 0x0043fb2c: ret       */ return;
loc_0043fb30:
    /* 0x0043fb30: bl       #0xc7a904 */ CALL_DIRECT(sub_00c7a904);
    /* 0x0043fb34: movi     v0.16b, #0 */ ARM64("movi v0.16b, #0");
    /* 0x0043fb38: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x0043fb3c: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
    /* 0x0043fb40: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
}
