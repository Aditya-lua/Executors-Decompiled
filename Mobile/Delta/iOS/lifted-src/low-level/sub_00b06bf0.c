/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb06bf0..0xb06c68 (120 bytes). */
#include "../lift_runtime.hpp"

void sub_00b06bf0(Arm64Context& cpu) {
    /* 0x00b06bf0: stp      x20, x19, [sp, #-0x20]! */ ARM64("stp x20, x19, [sp, #-0x20]!");
    /* 0x00b06bf4: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x00b06bf8: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x00b06bfc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00b06c00: bl       #0xa2f9e0 */ CALL_DIRECT(sub_00a2f9e0);
    /* 0x00b06c04: cbz      w0, #0xb06c54 */ if (w0 == 0) goto loc_00b06c54;
    /* 0x00b06c08: adrp     x1, #0xcb1000 */ ARM64("adrp x1, #0xcb1000");
    /* 0x00b06c0c: add      x1, x1, #0x506 */ ARM64("add x1, x1, #0x506");
    /* 0x00b06c10: mov      w0, #0x1d8 */ ARM64("mov w0, #0x1d8");
    /* 0x00b06c14: mov      w2, #0x34 */ ARM64("mov w2, #0x34");
    /* 0x00b06c18: bl       #0xa6bffc */ CALL_DIRECT(sub_00a6bffc);
    /* 0x00b06c1c: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x00b06c20: cbz      x0, #0xb06c58 */ if (x0 == 0) goto loc_00b06c58;
    /* 0x00b06c24: mov      w0, #0xc0 */ ARM64("mov w0, #0xc0");
    /* 0x00b06c28: bl       #0xb07954 */ CALL_DIRECT(sub_00b07954);
    /* 0x00b06c2c: mov      x6, x0 */ ARM64("mov x6, x0");
    /* 0x00b06c30: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b06c34: mov      w1, #0xc0 */ ARM64("mov w1, #0xc0");
    /* 0x00b06c38: mov      w2, #0x80 */ ARM64("mov w2, #0x80");
    /* 0x00b06c3c: mov      x3, #0 */ ARM64("mov x3, #0");
    /* 0x00b06c40: mov      w4, #1 */ ARM64("mov w4, #1");
    /* 0x00b06c44: mov      x5, #0 */ ARM64("mov x5, #0");
    /* 0x00b06c48: mov      x7, x19 */ ARM64("mov x7, x19");
    /* 0x00b06c4c: bl       #0xb5c5bc */ CALL_DIRECT(sub_00b5c5bc);
    /* 0x00b06c50: b        #0xb06c58 */ goto loc_00b06c58;
loc_00b06c54:
    /* 0x00b06c54: mov      x20, #0 */ ARM64("mov x20, #0");
loc_00b06c58:
    /* 0x00b06c58: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b06c5c: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x00b06c60: ldp      x20, x19, [sp], #0x20 */ ARM64("ldp x20, x19, [sp], #0x20");
    /* 0x00b06c64: ret       */ return;
}
