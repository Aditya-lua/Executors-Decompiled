/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x13f558..0x13f684 (300 bytes). */
#include "../lift_runtime.hpp"

void sub_0013f558(Arm64Context& cpu) {
    /* 0x0013f558: sub      sp, sp, #0x20 */ ARM64("sub sp, sp, #0x20");
    /* 0x0013f55c: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x0013f560: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x0013f564: mov      w8, #0xe1d3 */ ARM64("mov w8, #0xe1d3");
    /* 0x0013f568: movk     w8, #0x5c6e, lsl #16 */ ARM64("movk w8, #0x5c6e, lsl #16");
    /* 0x0013f56c: cmp      w2, w8 */ ARM64("cmp w2, w8");
    /* 0x0013f570: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x0013f574: mov      x9, sp */ ARM64("mov x9, sp");
    /* 0x0013f578: str      x9, [sp, #8] */ ARM64("str x9, [sp, #8]");
    /* 0x0013f57c: add      x9, sp, #8 */ ARM64("add x9, sp, #8");
    /* 0x0013f580: str      x9, [sp] */ ARM64("str x9, [sp]");
    /* 0x0013f584: ubfiz    x8, x8, #3, #0x20 */ ARM64("ubfiz x8, x8, #3, #0x20");
    /* 0x0013f588: mov      w9, #0xe971 */ ARM64("mov w9, #0xe971");
    /* 0x0013f58c: movk     w9, #0x86f3, lsl #16 */ ARM64("movk w9, #0x86f3, lsl #16");
    /* 0x0013f590: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013f594: mov      w9, #0x28 */ ARM64("mov w9, #0x28");
    /* 0x0013f598: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013f59c: mov      w9, #0xb53b */ ARM64("mov w9, #0xb53b");
    /* 0x0013f5a0: movk     w9, #0x7c9a, lsl #16 */ ARM64("movk w9, #0x7c9a, lsl #16");
    /* 0x0013f5a4: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013f5a8: mov      w9, #0x30 */ ARM64("mov w9, #0x30");
    /* 0x0013f5ac: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013f5b0: mov      w9, #0xbb18 */ ARM64("mov w9, #0xbb18");
    /* 0x0013f5b4: movk     w9, #0xf8aa, lsl #16 */ ARM64("movk w9, #0xf8aa, lsl #16");
    /* 0x0013f5b8: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013f5bc: mov      w9, #0x20 */ ARM64("mov w9, #0x20");
    /* 0x0013f5c0: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013f5c4: mov      w9, #0x998a */ ARM64("mov w9, #0x998a");
    /* 0x0013f5c8: movk     w9, #0x76da, lsl #16 */ ARM64("movk w9, #0x76da, lsl #16");
    /* 0x0013f5cc: cmp      w2, w9 */ ARM64("cmp w2, w9");
    /* 0x0013f5d0: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x0013f5d4: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0013f5d8: adrp     x9, #0xe6e000 */ ARM64("adrp x9, #0xe6e000");
    /* 0x0013f5dc: add      x9, x9, #0xf60 */ ARM64("add x9, x9, #0xf60");
    /* 0x0013f5e0: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x0013f5e4: br       x8 */ ARM64("br x8");
    /* 0x0013f5e8: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0013f5ec: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013f5f0: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013f5f4: ret       */ return;
    /* 0x0013f5f8: ldr      s0, [x1, #0x88] */ ARM64("ldr s0, [x1, #0x88]");
    /* 0x0013f5fc: b        #0x13f604 */ goto loc_0013f604;
    /* 0x0013f600: ldr      s0, [x1, #0x80] */ ARM64("ldr s0, [x1, #0x80]");
loc_0013f604:
    /* 0x0013f604: fcvtzs   w8, s0 */ ARM64("fcvtzs w8, s0");
    /* 0x0013f608: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0013f60c: scvtf    d0, w8 */ ARM64("scvtf d0, w8");
    /* 0x0013f610: str      d0, [x9] */ ARM64("str d0, [x9]");
    /* 0x0013f614: mov      w8, #3 */ ARM64("mov w8, #3");
    /* 0x0013f618: b        #0x13f664 */ goto loc_0013f664;
    /* 0x0013f61c: add      x1, x1, #0x78 */ ARM64("add x1, x1, #0x78");
    /* 0x0013f620: bl       #0x13cab4 */ CALL_DIRECT(sub_0013cab4);
    /* 0x0013f624: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0013f628: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013f62c: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013f630: ret       */ return;
    /* 0x0013f634: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0013f638: ldr      s0, [x1, #0x84] */ ARM64("ldr s0, [x1, #0x84]");
    /* 0x0013f63c: sshll    v0.2d, v0.2s, #0 */ ARM64("sshll v0.2d, v0.2s, #0");
    /* 0x0013f640: scvtf    d0, d0 */ ARM64("scvtf d0, d0");
    /* 0x0013f644: str      d0, [x8] */ ARM64("str d0, [x8]");
    /* 0x0013f648: mov      w9, #3 */ ARM64("mov w9, #3");
    /* 0x0013f64c: str      w9, [x8, #0xc] */ ARM64("str w9, [x8, #0xc]");
    /* 0x0013f650: b        #0x13f668 */ goto loc_0013f668;
    /* 0x0013f654: ldrb     w8, [x1, #0x8c] */ ARM64("ldrb w8, [x1, #0x8c]");
    /* 0x0013f658: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0013f65c: str      w8, [x9] */ ARM64("str w8, [x9]");
    /* 0x0013f660: mov      w8, #1 */ ARM64("mov w8, #1");
loc_0013f664:
    /* 0x0013f664: str      w8, [x9, #0xc] */ ARM64("str w8, [x9, #0xc]");
loc_0013f668:
    /* 0x0013f668: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0013f66c: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x0013f670: str      x8, [x0, #0x58] */ ARM64("str x8, [x0, #0x58]");
    /* 0x0013f674: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0013f678: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x0013f67c: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x0013f680: ret       */ return;
}
