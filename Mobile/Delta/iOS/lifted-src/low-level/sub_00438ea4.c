/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x438ea4..0x438f38 (148 bytes). */
#include "../lift_runtime.hpp"

void sub_00438ea4(Arm64Context& cpu) {
loc_00438ea4:
    /* 0x00438ea4: adr      x16, #0x438ea4 */ ARM64("adr x16, #0x438ea4");
    /* 0x00438ea8: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x00438eac: ldr      x1, #0x438eb4 */ ARM64("ldr x1, #0x438eb4");
    /* 0x00438eb0: blr      x17 */ CALL_INDIRECT(x17);
loc_00438eb4:
    /* 0x00438eb4: ldr      x1, #0x438ebc */ ARM64("ldr x1, #0x438ebc");
    /* 0x00438eb8: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_00438ebc:
    /* 0x00438ebc: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x00438ec0: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x00438ec4: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x00438ec8: stp      x20, x19, [sp, #0x10] */ ARM64("stp x20, x19, [sp, #0x10]");
    /* 0x00438ecc: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x00438ed0: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x00438ed4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00438ed8: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x00438edc: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x00438ee0: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x00438ee4: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x00438ee8: adrp     x8, #0xd1d000 */ ARM64("adrp x8, #0xd1d000");
    /* 0x00438eec: ldr      x8, [x8, #0xfd8] */ ARM64("ldr x8, [x8, #0xfd8]");
    /* 0x00438ef0: adrp     x9, #0xe80000 */ ARM64("adrp x9, #0xe80000");
    /* 0x00438ef4: ldr      x9, [x9, #0xce8] */ ARM64("ldr x9, [x9, #0xce8]");
    /* 0x00438ef8: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00438efc: mov      w1, #0 */ ARM64("mov w1, #0");
    /* 0x00438f00: mov      w2, #0 */ ARM64("mov w2, #0");
    /* 0x00438f04: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00438f08: ldr      x8, [x19, #0x58] */ ARM64("ldr x8, [x19, #0x58]");
    /* 0x00438f0c: str      w0, [x8] */ ARM64("str w0, [x8]");
    /* 0x00438f10: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00438f14: str      w9, [x8, #0xc] */ ARM64("str w9, [x8, #0xc]");
    /* 0x00438f18: ldr      x8, [x19, #0x58] */ ARM64("ldr x8, [x19, #0x58]");
    /* 0x00438f1c: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x00438f20: str      x8, [x19, #0x58] */ ARM64("str x8, [x19, #0x58]");
    /* 0x00438f24: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x00438f28: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x00438f2c: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x00438f30: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x00438f34: ret       */ return;
}
