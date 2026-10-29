/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x3b4b0..0x3b54c (156 bytes). */
#include "../lift_runtime.hpp"

void sub_0003b4b0(Arm64Context& cpu) {
    /* 0x0003b4b0: cmp      w1, #8 */ ARM64("cmp w1, #8");
    /* 0x0003b4b4: mov      w8, #0x28 */ ARM64("mov w8, #0x28");
    /* 0x0003b4b8: csel     x8, xzr, x8, eq */ ARM64("csel x8, xzr, x8, eq");
    /* 0x0003b4bc: cmp      w1, #9 */ ARM64("cmp w1, #9");
    /* 0x0003b4c0: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x0003b4c4: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0003b4c8: cmp      w1, #0xa */ ARM64("cmp w1, #0xa");
    /* 0x0003b4cc: ccmp     w1, #0xc, #4, ne */ ARM64("ccmp w1, #0xc, #4, ne");
    /* 0x0003b4d0: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x0003b4d4: csel     x9, x9, x8, eq */ ARM64("csel x9, x9, x8, eq");
    /* 0x0003b4d8: cmp      w1, #0xb */ ARM64("cmp w1, #0xb");
    /* 0x0003b4dc: ccmp     w1, #0xd, #4, ne */ ARM64("ccmp w1, #0xd, #4, ne");
    /* 0x0003b4e0: mov      w8, #0x20 */ ARM64("mov w8, #0x20");
    /* 0x0003b4e4: csel     x9, x8, x9, eq */ ARM64("csel x9, x8, x9, eq");
    /* 0x0003b4e8: adrp     x10, #0xe67000 */ ARM64("adrp x10, #0xe67000");
    /* 0x0003b4ec: add      x10, x10, #0x48 */ ARM64("add x10, x10, #0x48");
    /* 0x0003b4f0: ldr      x9, [x10, x9] */ ARM64("ldr x9, [x10, x9]");
    /* 0x0003b4f4: br       x9 */ ARM64("br x9");
    /* 0x0003b4f8: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0003b4fc: ret       */ return;
    /* 0x0003b500: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x0003b504: mov      w8, #0x1c */ ARM64("mov w8, #0x1c");
    /* 0x0003b508: mov      w9, #0x1f */ ARM64("mov w9, #0x1f");
    /* 0x0003b50c: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x0003b510: ret       */ return;
    /* 0x0003b514: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x0003b518: mov      w8, #0x1b */ ARM64("mov w8, #0x1b");
    /* 0x0003b51c: mov      w9, #0x1e */ ARM64("mov w9, #0x1e");
    /* 0x0003b520: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x0003b524: ret       */ return;
    /* 0x0003b528: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x0003b52c: mov      w9, #0x1d */ ARM64("mov w9, #0x1d");
    /* 0x0003b530: csel     w0, w8, w9, ne */ ARM64("csel w0, w8, w9, ne");
    /* 0x0003b534: ret       */ return;
    /* 0x0003b538: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x0003b53c: mov      w8, #0x1e */ ARM64("mov w8, #0x1e");
    /* 0x0003b540: mov      w9, #0x1b */ ARM64("mov w9, #0x1b");
    /* 0x0003b544: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x0003b548: ret       */ return;
}
