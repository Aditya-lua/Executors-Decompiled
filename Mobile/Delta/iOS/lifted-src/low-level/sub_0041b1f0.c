/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x41b1f0..0x41b24c (92 bytes). */
#include "../lift_runtime.hpp"

void sub_0041b1f0(Arm64Context& cpu) {
loc_0041b1f0:
    /* 0x0041b1f0: adr      x16, #0x41b1f0 */ ARM64("adr x16, #0x41b1f0");
    /* 0x0041b1f4: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x0041b1f8: ldr      x1, #0x41b200 */ ARM64("ldr x1, #0x41b200");
    /* 0x0041b1fc: blr      x17 */ CALL_INDIRECT(x17);
loc_0041b200:
    /* 0x0041b200: ldr      x1, #0x41b208 */ ARM64("ldr x1, #0x41b208");
    /* 0x0041b204: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_0041b208:
    /* 0x0041b208: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x0041b20c: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x0041b210: adrp     x8, #0xf0d000 */ ARM64("adrp x8, #0xf0d000");
    /* 0x0041b214: add      x8, x8, #0x198 */ ARM64("add x8, x8, #0x198");
    /* 0x0041b218: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x0041b21c: ldr      x8, [x8, #0x60] */ ARM64("ldr x8, [x8, #0x60]");
    /* 0x0041b220: ldr      d0, [x8, #0x2e0] */ ARM64("ldr d0, [x8, #0x2e0]");
    /* 0x0041b224: ucvtf    d0, d0 */ ARM64("ucvtf d0, d0");
    /* 0x0041b228: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0041b22c: str      d0, [x8] */ ARM64("str d0, [x8]");
    /* 0x0041b230: mov      w9, #3 */ ARM64("mov w9, #3");
    /* 0x0041b234: str      w9, [x8, #0xc] */ ARM64("str w9, [x8, #0xc]");
    /* 0x0041b238: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0041b23c: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x0041b240: str      x8, [x0, #0x58] */ ARM64("str x8, [x0, #0x58]");
    /* 0x0041b244: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0041b248: ret       */ return;
}
