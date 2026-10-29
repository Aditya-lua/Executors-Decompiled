/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x404a5c..0x404bdc (384 bytes). */
#include "../lift_runtime.hpp"

void sub_00404a5c(Arm64Context& cpu) {
loc_00404a5c:
    /* 0x00404a5c: adr      x16, #0x404a5c */ ARM64("adr x16, #0x404a5c");
    /* 0x00404a60: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x00404a64: ldr      x1, #0x404a6c */ ARM64("ldr x1, #0x404a6c");
    /* 0x00404a68: blr      x17 */ CALL_INDIRECT(x17);
loc_00404a6c:
    /* 0x00404a6c: ldr      x1, #0x404a74 */ ARM64("ldr x1, #0x404a74");
    /* 0x00404a70: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_00404a74:
    /* 0x00404a74: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x00404a78: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x00404a7c: sub      sp, sp, #0x60 */ ARM64("sub sp, sp, #0x60");
    /* 0x00404a80: stp      x20, x19, [sp, #0x40] */ ARM64("stp x20, x19, [sp, #0x40]");
    /* 0x00404a84: stp      x29, x30, [sp, #0x50] */ ARM64("stp x29, x30, [sp, #0x50]");
    /* 0x00404a88: add      x29, sp, #0x50 */ ARM64("add x29, sp, #0x50");
    /* 0x00404a8c: adrp     x8, #0xe5c000 */ ARM64("adrp x8, #0xe5c000");
    /* 0x00404a90: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00404a94: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00404a98: stur     x8, [x29, #-0x18] */ ARM64("stur x8, [x29, #-0x18]");
    /* 0x00404a9c: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x00404aa0: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x00404aa4: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x00404aa8: adrp     x9, #0xf0d000 */ ARM64("adrp x9, #0xf0d000");
    /* 0x00404aac: add      x9, x9, #0x198 */ ARM64("add x9, x9, #0x198");
    /* 0x00404ab0: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x00404ab4: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00404ab8: ldr      x8, [x8, #0x60] */ ARM64("ldr x8, [x8, #0x60]");
    /* 0x00404abc: ldr      x8, [x8, #0x100] */ ARM64("ldr x8, [x8, #0x100]");
    /* 0x00404ac0: mvn      x9, x8 */ ARM64("mvn x9, x8");
    /* 0x00404ac4: orr      x9, x9, #0x800000000000000 */ ARM64("orr x9, x9, #0x800000000000000");
    /* 0x00404ac8: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00404acc: eor      x10, x8, x9 */ ARM64("eor x10, x8, x9");
    /* 0x00404ad0: and      x8, x8, x9 */ ARM64("and x8, x8, x9");
    /* 0x00404ad4: add      x8, x10, x8, lsl #1 */ ARM64("add x8, x10, x8, lsl #1");
    /* 0x00404ad8: mov      x9, #0x800000000000000 */ ARM64("mov x9, #0x800000000000000");
    /* 0x00404adc: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00404ae0: b.ne     #0x404b9c */ if (COND_NE) goto loc_00404b9c;
    /* 0x00404ae4: mov      x8, #0x6d64 */ ARM64("mov x8, #0x6d64");
    /* 0x00404ae8: movk     x8, #0x6066, lsl #16 */ ARM64("movk x8, #0x6066, lsl #16");
    /* 0x00404aec: movk     x8, #0x669, lsl #32 */ ARM64("movk x8, #0x669, lsl #32");
    /* 0x00404af0: movk     x8, #0x1c92, lsl #48 */ ARM64("movk x8, #0x1c92, lsl #48");
    /* 0x00404af4: mov      x9, #0xf3ae */ ARM64("mov x9, #0xf3ae");
    /* 0x00404af8: movk     x9, #0x2e34, lsl #16 */ ARM64("movk x9, #0x2e34, lsl #16");
    /* 0x00404afc: movk     x9, #0x9d1f, lsl #32 */ ARM64("movk x9, #0x9d1f, lsl #32");
    /* 0x00404b00: movk     x9, #0x19fd, lsl #48 */ ARM64("movk x9, #0x19fd, lsl #48");
    /* 0x00404b04: stp      x8, x9, [sp, #0x10] */ ARM64("stp x8, x9, [sp, #0x10]");
    /* 0x00404b08: mov      x8, #0x1e11 */ ARM64("mov x8, #0x1e11");
    /* 0x00404b0c: movk     x8, #0x1203, lsl #16 */ ARM64("movk x8, #0x1203, lsl #16");
    /* 0x00404b10: movk     x8, #0x6d08, lsl #32 */ ARM64("movk x8, #0x6d08, lsl #32");
    /* 0x00404b14: movk     x8, #0x79fc, lsl #48 */ ARM64("movk x8, #0x79fc, lsl #48");
    /* 0x00404b18: mov      x9, #0xf3da */ ARM64("mov x9, #0xf3da");
    /* 0x00404b1c: movk     x9, #0x2e34, lsl #16 */ ARM64("movk x9, #0x2e34, lsl #16");
    /* 0x00404b20: movk     x9, #0x9d1f, lsl #32 */ ARM64("movk x9, #0x9d1f, lsl #32");
    /* 0x00404b24: movk     x9, #0x19fd, lsl #48 */ ARM64("movk x9, #0x19fd, lsl #48");
    /* 0x00404b28: stp      x8, x9, [sp, #0x20] */ ARM64("stp x8, x9, [sp, #0x20]");
    /* 0x00404b2c: add      x8, sp, #0x20 */ ARM64("add x8, sp, #0x20");
    /* 0x00404b30: add      x19, sp, #0x10 */ ARM64("add x19, sp, #0x10");
    /* 0x00404b34: ldr      q0, [x19] */ ARM64("ldr q0, [x19]");
    /* 0x00404b38: rev64    v0.16b, v0.16b */ ARM64("rev64 v0.16b, v0.16b");
    /* 0x00404b3c: ldr      q1, [x8] */ ARM64("ldr q1, [x8]");
    /* 0x00404b40: rev64    v1.16b, v1.16b */ ARM64("rev64 v1.16b, v1.16b");
    /* 0x00404b44: mvn      v2.16b, v0.16b */ ARM64("mvn v2.16b, v0.16b");
    /* 0x00404b48: add      v3.2d, v2.2d, v2.2d */ ARM64("add v3.2d, v2.2d, v2.2d");
    /* 0x00404b4c: sub      v2.2d, v3.2d, v2.2d */ ARM64("sub v2.2d, v3.2d, v2.2d");
    /* 0x00404b50: mvn      v3.16b, v2.16b */ ARM64("mvn v3.16b, v2.16b");
    /* 0x00404b54: orn      v2.16b, v1.16b, v2.16b */ ARM64("orn v2.16b, v1.16b, v2.16b");
    /* 0x00404b58: sub      v2.2d, v2.2d, v3.2d */ ARM64("sub v2.2d, v2.2d, v3.2d");
    /* 0x00404b5c: neg      v1.2d, v1.2d */ ARM64("neg v1.2d, v1.2d");
    /* 0x00404b60: eor      v3.16b, v1.16b, v0.16b */ ARM64("eor v3.16b, v1.16b, v0.16b");
    /* 0x00404b64: and      v0.16b, v1.16b, v0.16b */ ARM64("and v0.16b, v1.16b, v0.16b");
    /* 0x00404b68: add      v0.2d, v0.2d, v2.2d */ ARM64("add v0.2d, v0.2d, v2.2d");
    /* 0x00404b6c: add      v0.2d, v0.2d, v0.2d */ ARM64("add v0.2d, v0.2d, v0.2d");
    /* 0x00404b70: add      v0.2d, v0.2d, v3.2d */ ARM64("add v0.2d, v0.2d, v3.2d");
    /* 0x00404b74: rev64    v0.16b, v0.16b */ ARM64("rev64 v0.16b, v0.16b");
    /* 0x00404b78: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x00404b7c: add      x1, sp, #0x10 */ ARM64("add x1, sp, #0x10");
    /* 0x00404b80: mov      w2, #0x400 */ ARM64("mov w2, #0x400");
    /* 0x00404b84: mov      w3, #1 */ ARM64("mov w3, #1");
    /* 0x00404b88: mov      w4, #0 */ ARM64("mov w4, #0");
    /* 0x00404b8c: bl       #0x3f5888 */ CALL_DIRECT(sub_003f5888);
    /* 0x00404b90: movi     v0.16b, #0 */ ARM64("movi v0.16b, #0");
    /* 0x00404b94: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x00404b98: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
loc_00404b9c:
    /* 0x00404b9c: ldur     x8, [x29, #-0x18] */ ARM64("ldur x8, [x29, #-0x18]");
    /* 0x00404ba0: adrp     x9, #0xe5c000 */ ARM64("adrp x9, #0xe5c000");
    /* 0x00404ba4: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x00404ba8: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00404bac: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00404bb0: b.ne     #0x404bc8 */ if (COND_NE) goto loc_00404bc8;
    /* 0x00404bb4: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00404bb8: ldp      x29, x30, [sp, #0x50] */ ARM64("ldp x29, x30, [sp, #0x50]");
    /* 0x00404bbc: ldp      x20, x19, [sp, #0x40] */ ARM64("ldp x20, x19, [sp, #0x40]");
    /* 0x00404bc0: add      sp, sp, #0x60 */ ARM64("add sp, sp, #0x60");
    /* 0x00404bc4: ret       */ return;
loc_00404bc8:
    /* 0x00404bc8: bl       #0xc7a904 */ CALL_DIRECT(sub_00c7a904);
    /* 0x00404bcc: movi     v0.16b, #0 */ ARM64("movi v0.16b, #0");
    /* 0x00404bd0: str      q0, [x19] */ ARM64("str q0, [x19]");
    /* 0x00404bd4: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
    /* 0x00404bd8: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
}
