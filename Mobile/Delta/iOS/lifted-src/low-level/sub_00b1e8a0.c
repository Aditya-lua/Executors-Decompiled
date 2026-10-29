/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb1e8a0..0xb1e928 (136 bytes). */
#include "../lift_runtime.hpp"

void sub_00b1e8a0(Arm64Context& cpu) {
    /* 0x00b1e8a0: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x00b1e8a4: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x00b1e8a8: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x00b1e8ac: cbnz     x3, #0xb1e8b4 */ if (x3 != 0) goto loc_00b1e8b4;
    /* 0x00b1e8b0: tbnz     w4, #1, #0xb1e8f4 */ if (((w4 >> #1) & 1) != 0) goto loc_00b1e8f4;
loc_00b1e8b4:
    /* 0x00b1e8b4: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00b1e8b8: adrp     x0, #0xcb1000 */ ARM64("adrp x0, #0xcb1000");
    /* 0x00b1e8bc: add      x0, x0, #0xeb5 */ ARM64("add x0, x0, #0xeb5");
    /* 0x00b1e8c0: adrp     x2, #0xcb3000 */ ARM64("adrp x2, #0xcb3000");
    /* 0x00b1e8c4: add      x2, x2, #0xe64 */ ARM64("add x2, x2, #0xe64");
    /* 0x00b1e8c8: mov      w1, #0x67a */ ARM64("mov w1, #0x67a");
    /* 0x00b1e8cc: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00b1e8d0: mov      w0, #0x39 */ ARM64("mov w0, #0x39");
    /* 0x00b1e8d4: mov      w1, #0x106 */ ARM64("mov w1, #0x106");
    /* 0x00b1e8d8: movk     w1, #8, lsl #16 */ ARM64("movk w1, #8, lsl #16");
    /* 0x00b1e8dc: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00b1e8e0: bl       #0xa36abc */ CALL_DIRECT(sub_00a36abc);
    /* 0x00b1e8e4: mov      w0, #0 */ ARM64("mov w0, #0");
loc_00b1e8e8:
    /* 0x00b1e8e8: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x00b1e8ec: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x00b1e8f0: ret       */ return;
loc_00b1e8f4:
    /* 0x00b1e8f4: mov      x7, x5 */ ARM64("mov x7, x5");
    /* 0x00b1e8f8: adrp     x8, #0xb23000 */ ARM64("adrp x8, #0xb23000");
    /* 0x00b1e8fc: add      x8, x8, #0xedc */ ARM64("add x8, x8, #0xedc");
    /* 0x00b1e900: stp      xzr, x8, [sp, #8] */ ARM64("stp xzr, x8, [sp, #8]");
    /* 0x00b1e904: str      x6, [sp] */ ARM64("str x6, [sp]");
    /* 0x00b1e908: adrp     x4, #0xcb3000 */ ARM64("adrp x4, #0xcb3000");
    /* 0x00b1e90c: add      x4, x4, #0xd1a */ ARM64("add x4, x4, #0xd1a");
    /* 0x00b1e910: adrp     x6, #0xb23000 */ ARM64("adrp x6, #0xb23000");
    /* 0x00b1e914: add      x6, x6, #0x7d4 */ ARM64("add x6, x6, #0x7d4");
    /* 0x00b1e918: mov      w3, #0x5be */ ARM64("mov w3, #0x5be");
    /* 0x00b1e91c: mov      x5, #0 */ ARM64("mov x5, #0");
    /* 0x00b1e920: bl       #0xb22848 */ CALL_DIRECT(sub_00b22848);
    /* 0x00b1e924: b        #0xb1e8e8 */ goto loc_00b1e8e8;
}
