/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x403a18..0x403aa8 (144 bytes). */
#include "../lift_runtime.hpp"

void sub_00403a18(Arm64Context& cpu) {
loc_00403a18:
    /* 0x00403a18: adr      x16, #0x403a18 */ ARM64("adr x16, #0x403a18");
    /* 0x00403a1c: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x00403a20: ldr      x1, #0x403a28 */ ARM64("ldr x1, #0x403a28");
    /* 0x00403a24: blr      x17 */ CALL_INDIRECT(x17);
loc_00403a28:
    /* 0x00403a28: ldr      x1, #0x403a30 */ ARM64("ldr x1, #0x403a30");
    /* 0x00403a2c: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_00403a30:
    /* 0x00403a30: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x00403a34: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x00403a38: adrp     x8, #0xf0d000 */ ARM64("adrp x8, #0xf0d000");
    /* 0x00403a3c: add      x8, x8, #0x198 */ ARM64("add x8, x8, #0x198");
    /* 0x00403a40: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00403a44: ldr      x8, [x8, #0x60] */ ARM64("ldr x8, [x8, #0x60]");
    /* 0x00403a48: ldr      x9, [x8, #0x100] */ ARM64("ldr x9, [x8, #0x100]");
    /* 0x00403a4c: mvn      x11, x9 */ ARM64("mvn x11, x9");
    /* 0x00403a50: orr      x12, x11, #0x1000 */ ARM64("orr x12, x11, #0x1000");
    /* 0x00403a54: add      x10, x9, x11, lsl #1 */ ARM64("add x10, x9, x11, lsl #1");
    /* 0x00403a58: eon      x13, x10, x12 */ ARM64("eon x13, x10, x12");
    /* 0x00403a5c: bic      x12, x12, x10 */ ARM64("bic x12, x12, x10");
    /* 0x00403a60: add      x12, x13, x12, lsl #1 */ ARM64("add x12, x13, x12, lsl #1");
    /* 0x00403a64: cmp      x12, #1, lsl #12 */ ARM64("cmp x12, #1, lsl #12");
    /* 0x00403a68: b.eq     #0x403aa0 */ if (COND_EQ) goto loc_00403aa0;
    /* 0x00403a6c: mvn      x12, x10 */ ARM64("mvn x12, x10");
    /* 0x00403a70: orr      x11, x11, #0x100 */ ARM64("orr x11, x11, #0x100");
    /* 0x00403a74: eor      x13, x11, x12 */ ARM64("eor x13, x11, x12");
    /* 0x00403a78: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00403a7c: add      x11, x13, x11, lsl #1 */ ARM64("add x11, x13, x11, lsl #1");
    /* 0x00403a80: cmp      x11, #0x100 */ ARM64("cmp x11, #0x100");
    /* 0x00403a84: b.eq     #0x403aa0 */ if (COND_EQ) goto loc_00403aa0;
    /* 0x00403a88: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x00403a8c: orr      x10, x10, #0xffffffffffffefff */ ARM64("orr x10, x10, #0xffffffffffffefff");
    /* 0x00403a90: mov      w11, #0x1001 */ ARM64("mov w11, #0x1001");
    /* 0x00403a94: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00403a98: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00403a9c: str      x9, [x8, #0x100] */ ARM64("str x9, [x8, #0x100]");
loc_00403aa0:
    /* 0x00403aa0: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00403aa4: ret       */ return;
}
