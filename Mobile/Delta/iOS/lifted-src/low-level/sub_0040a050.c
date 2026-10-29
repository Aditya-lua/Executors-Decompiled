/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x40a050..0x40a098 (72 bytes). */
#include "../lift_runtime.hpp"

void sub_0040a050(Arm64Context& cpu) {
loc_0040a050:
    /* 0x0040a050: adr      x16, #0x40a050 */ ARM64("adr x16, #0x40a050");
    /* 0x0040a054: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x0040a058: ldr      x1, #0x40a060 */ ARM64("ldr x1, #0x40a060");
    /* 0x0040a05c: blr      x17 */ CALL_INDIRECT(x17);
loc_0040a060:
    /* 0x0040a060: ldr      x1, #0x40a068 */ ARM64("ldr x1, #0x40a068");
    /* 0x0040a064: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_0040a068:
    /* 0x0040a068: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x0040a06c: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x0040a070: ldr      x8, [x0, #0x80] */ ARM64("ldr x8, [x0, #0x80]");
    /* 0x0040a074: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0040a078: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x0040a07c: mov      w8, #7 */ ARM64("mov w8, #7");
    /* 0x0040a080: str      w8, [x9, #0xc] */ ARM64("str w8, [x9, #0xc]");
    /* 0x0040a084: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0040a088: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x0040a08c: str      x8, [x0, #0x58] */ ARM64("str x8, [x0, #0x58]");
    /* 0x0040a090: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0040a094: ret       */ return;
}
