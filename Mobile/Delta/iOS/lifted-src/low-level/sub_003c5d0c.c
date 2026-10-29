/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x3c5d0c..0x3c5de4 (216 bytes). */
#include "../lift_runtime.hpp"

void sub_003c5d0c(Arm64Context& cpu) {
    /* 0x003c5d0c: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x003c5d10: mov      x0, #1 */ ARM64("mov x0, #1");
    /* 0x003c5d14: movk     x0, #0x2000, lsl #48 */ ARM64("movk x0, #0x2000, lsl #48");
    /* 0x003c5d18: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x003c5d1c: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x003c5d20: csel     x9, xzr, x9, eq */ ARM64("csel x9, xzr, x9, eq");
    /* 0x003c5d24: cmp      w8, #3 */ ARM64("cmp w8, #3");
    /* 0x003c5d28: mov      w10, #0x28 */ ARM64("mov w10, #0x28");
    /* 0x003c5d2c: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d30: cmp      w8, #6 */ ARM64("cmp w8, #6");
    /* 0x003c5d34: mov      w10, #0x10 */ ARM64("mov w10, #0x10");
    /* 0x003c5d38: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d3c: cmp      w8, #4 */ ARM64("cmp w8, #4");
    /* 0x003c5d40: mov      w10, #0x30 */ ARM64("mov w10, #0x30");
    /* 0x003c5d44: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d48: cmp      w8, #5 */ ARM64("cmp w8, #5");
    /* 0x003c5d4c: mov      w10, #8 */ ARM64("mov w10, #8");
    /* 0x003c5d50: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d54: sub      w10, w8, #7 */ ARM64("sub w10, w8, #7");
    /* 0x003c5d58: cmp      w10, #2 */ ARM64("cmp w10, #2");
    /* 0x003c5d5c: mov      w10, #0x48 */ ARM64("mov w10, #0x48");
    /* 0x003c5d60: csel     x9, x10, x9, lo */ ARM64("csel x9, x10, x9, lo");
    /* 0x003c5d64: cmp      w8, #9 */ ARM64("cmp w8, #9");
    /* 0x003c5d68: mov      w10, #0x50 */ ARM64("mov w10, #0x50");
    /* 0x003c5d6c: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d70: cmp      w8, #0xa */ ARM64("cmp w8, #0xa");
    /* 0x003c5d74: mov      w10, #0x38 */ ARM64("mov w10, #0x38");
    /* 0x003c5d78: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x003c5d7c: cmp      w8, #0xb */ ARM64("cmp w8, #0xb");
    /* 0x003c5d80: mov      w8, #0x20 */ ARM64("mov w8, #0x20");
    /* 0x003c5d84: csel     x8, x8, x9, eq */ ARM64("csel x8, x8, x9, eq");
    /* 0x003c5d88: adrp     x9, #0xe7d000 */ ARM64("adrp x9, #0xe7d000");
    /* 0x003c5d8c: add      x9, x9, #0x800 */ ARM64("add x9, x9, #0x800");
    /* 0x003c5d90: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x003c5d94: br       x8 */ ARM64("br x8");
    /* 0x003c5d98: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x003c5d9c: ret       */ return;
    /* 0x003c5da0: mov      x0, #3 */ ARM64("mov x0, #3");
    /* 0x003c5da4: movk     x0, #0x6000, lsl #48 */ ARM64("movk x0, #0x6000, lsl #48");
    /* 0x003c5da8: ret       */ return;
    /* 0x003c5dac: mov      x0, #0xb */ ARM64("mov x0, #0xb");
    /* 0x003c5db0: movk     x0, #0x3000, lsl #48 */ ARM64("movk x0, #0x3000, lsl #48");
    /* 0x003c5db4: ret       */ return;
    /* 0x003c5db8: mov      x0, #0xb */ ARM64("mov x0, #0xb");
    /* 0x003c5dbc: movk     x0, #0x7000, lsl #48 */ ARM64("movk x0, #0x7000, lsl #48");
    /* 0x003c5dc0: ret       */ return;
    /* 0x003c5dc4: mov      x0, #0x2000000000000000 */ ARM64("mov x0, #0x2000000000000000");
    /* 0x003c5dc8: ret       */ return;
    /* 0x003c5dcc: orr      x0, x0, #2 */ ARM64("orr x0, x0, #2");
    /* 0x003c5dd0: ret       */ return;
    /* 0x003c5dd4: add      x0, x0, #0x3e */ ARM64("add x0, x0, #0x3e");
    /* 0x003c5dd8: ret       */ return;
    /* 0x003c5ddc: mov      w0, #0xc */ ARM64("mov w0, #0xc");
    /* 0x003c5de0: ret       */ return;
}
