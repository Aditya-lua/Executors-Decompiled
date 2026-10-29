/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x13e21c..0x13e320 (260 bytes). */
#include "../lift_runtime.hpp"

void sub_0013e21c(Arm64Context& cpu) {
    /* 0x0013e21c: sub      sp, sp, #0x20 */ ARM64("sub sp, sp, #0x20");
    /* 0x0013e220: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x0013e224: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x0013e228: sub      w8, w2, #0x700, lsl #12 */ ARM64("sub w8, w2, #0x700, lsl #12");
    /* 0x0013e22c: cmp      w8, #0x2f */ ARM64("cmp w8, #0x2f");
    /* 0x0013e230: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x0013e234: mov      x9, sp */ ARM64("mov x9, sp");
    /* 0x0013e238: str      x9, [sp, #8] */ ARM64("str x9, [sp, #8]");
    /* 0x0013e23c: add      x9, sp, #8 */ ARM64("add x9, sp, #8");
    /* 0x0013e240: str      x9, [sp] */ ARM64("str x9, [sp]");
    /* 0x0013e244: ubfiz    x8, x8, #3, #0x20 */ ARM64("ubfiz x8, x8, #3, #0x20");
    /* 0x0013e248: mov      w9, #0xb53b */ ARM64("mov w9, #0xb53b");
    /* 0x0013e24c: movk     w9, #0x7c9a, lsl #16 */ ARM64("movk w9, #0x7c9a, lsl #16");
    /* 0x0013e250: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013e254: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x0013e258: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013e25c: mov      w9, #0xbb18 */ ARM64("mov w9, #0xbb18");
    /* 0x0013e260: movk     w9, #0xf8aa, lsl #16 */ ARM64("movk w9, #0xf8aa, lsl #16");
    /* 0x0013e264: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013e268: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x0013e26c: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013e270: mov      w9, #0x998a */ ARM64("mov w9, #0x998a");
    /* 0x0013e274: movk     w9, #0x76da, lsl #16 */ ARM64("movk w9, #0x76da, lsl #16");
    /* 0x0013e278: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013e27c: mov      w9, #0x20 */ ARM64("mov w9, #0x20");
    /* 0x0013e280: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013e284: adrp     x9, #0xe6e000 */ ARM64("adrp x9, #0xe6e000");
    /* 0x0013e288: add      x9, x9, #0xe88 */ ARM64("add x9, x9, #0xe88");
    /* 0x0013e28c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x0013e290: br       x8 */ ARM64("br x8");
    /* 0x0013e294: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0013e298: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013e29c: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013e2a0: ret       */ return;
    /* 0x0013e2a4: ldrb     w8, [x1, #0x8c] */ ARM64("ldrb w8, [x1, #0x8c]");
    /* 0x0013e2a8: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0013e2ac: str      w8, [x9] */ ARM64("str w8, [x9]");
    /* 0x0013e2b0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x0013e2b4: b        #0x13e2e8 */ goto loc_0013e2e8;
    /* 0x0013e2b8: add      x1, x1, #0x80 */ ARM64("add x1, x1, #0x80");
    /* 0x0013e2bc: bl       #0x13cab4 */ CALL_DIRECT(sub_0013cab4);
    /* 0x0013e2c0: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0013e2c4: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013e2c8: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013e2cc: ret       */ return;
    /* 0x0013e2d0: ldr      s0, [x1, #0x88] */ ARM64("ldr s0, [x1, #0x88]");
    /* 0x0013e2d4: fcvtzs   w8, s0 */ ARM64("fcvtzs w8, s0");
    /* 0x0013e2d8: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0013e2dc: scvtf    d0, w8 */ ARM64("scvtf d0, w8");
    /* 0x0013e2e0: str      d0, [x9] */ ARM64("str d0, [x9]");
    /* 0x0013e2e4: mov      w8, #3 */ ARM64("mov w8, #3");
loc_0013e2e8:
    /* 0x0013e2e8: str      w8, [x9, #0xc] */ ARM64("str w8, [x9, #0xc]");
    /* 0x0013e2ec: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0013e2f0: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x0013e2f4: str      x8, [x0, #0x58] */ ARM64("str x8, [x0, #0x58]");
    /* 0x0013e2f8: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0013e2fc: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013e300: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013e304: ret       */ return;
    /* 0x0013e308: add      x1, x1, #0x78 */ ARM64("add x1, x1, #0x78");
    /* 0x0013e30c: bl       #0x13cab4 */ CALL_DIRECT(sub_0013cab4);
    /* 0x0013e310: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0013e314: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013e318: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013e31c: ret       */ return;
}
