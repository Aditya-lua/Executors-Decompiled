/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x724dc..0x72518 (60 bytes). */
#include "../lift_runtime.hpp"

void sub_000724dc(Arm64Context& cpu) {
    /* 0x000724dc: sub      w8, w1, #1 */ ARM64("sub w8, w1, #1");
    /* 0x000724e0: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x000724e4: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x000724e8: csel     x8, xzr, x8, lo */ ARM64("csel x8, xzr, x8, lo");
    /* 0x000724ec: cmp      w1, #5 */ ARM64("cmp w1, #5");
    /* 0x000724f0: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x000724f4: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x000724f8: adrp     x9, #0xe6a000 */ ARM64("adrp x9, #0xe6a000");
    /* 0x000724fc: add      x9, x9, #0xca8 */ ARM64("add x9, x9, #0xca8");
    /* 0x00072500: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00072504: br       x8 */ ARM64("br x8");
    /* 0x00072508: ldrh     w0, [x0] */ ARM64("ldrh w0, [x0]");
    /* 0x0007250c: ret       */ return;
    /* 0x00072510: ldarh    w0, [x0] */ ARM64("ldarh w0, [x0]");
    /* 0x00072514: ret       */ return;
}
