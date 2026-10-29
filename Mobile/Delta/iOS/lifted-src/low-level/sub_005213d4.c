/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x5213d4..0x52142c (88 bytes). */
#include "../lift_runtime.hpp"

void sub_005213d4(Arm64Context& cpu) {
loc_005213d4:
    /* 0x005213d4: adr      x16, #0x5213d4 */ ARM64("adr x16, #0x5213d4");
    /* 0x005213d8: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x005213dc: ldr      x1, #0x5213e4 */ ARM64("ldr x1, #0x5213e4");
    /* 0x005213e0: blr      x17 */ CALL_INDIRECT(x17);
loc_005213e4:
    /* 0x005213e4: ldr      x1, #0x5213ec */ ARM64("ldr x1, #0x5213ec");
    /* 0x005213e8: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_005213ec:
    /* 0x005213ec: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x005213f0: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x005213f4: stp      x20, x19, [sp, #-0x20]! */ ARM64("stp x20, x19, [sp, #-0x20]!");
    /* 0x005213f8: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x005213fc: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x00521400: adrp     x19, #0xf0d000 */ ARM64("adrp x19, #0xf0d000");
    /* 0x00521404: add      x19, x19, #0x198 */ ARM64("add x19, x19, #0x198");
    /* 0x00521408: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x0052140c: ldr      x0, [x8, #0x7a0] */ ARM64("ldr x0, [x8, #0x7a0]");
    /* 0x00521410: mov      w1, #0x400 */ ARM64("mov w1, #0x400");
    /* 0x00521414: bl       #0xc7a9d0 */ CALL_DIRECT(sub_00c7a9d0);
    /* 0x00521418: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x0052141c: str      xzr, [x8, #0x380] */ ARM64("str xzr, [x8, #0x380]");
    /* 0x00521420: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x00521424: ldp      x20, x19, [sp], #0x20 */ ARM64("ldp x20, x19, [sp], #0x20");
    /* 0x00521428: ret       */ return;
}
