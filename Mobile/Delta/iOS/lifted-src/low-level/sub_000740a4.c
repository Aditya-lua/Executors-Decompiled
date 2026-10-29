/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x740a4..0x740e0 (60 bytes). */
#include "../lift_runtime.hpp"

void sub_000740a4(Arm64Context& cpu) {
    /* 0x000740a4: sub      w8, w1, #1 */ ARM64("sub w8, w1, #1");
    /* 0x000740a8: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x000740ac: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x000740b0: csel     x8, xzr, x8, lo */ ARM64("csel x8, xzr, x8, lo");
    /* 0x000740b4: cmp      w1, #5 */ ARM64("cmp w1, #5");
    /* 0x000740b8: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x000740bc: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x000740c0: adrp     x9, #0xe6a000 */ ARM64("adrp x9, #0xe6a000");
    /* 0x000740c4: add      x9, x9, #0xc88 */ ARM64("add x9, x9, #0xc88");
    /* 0x000740c8: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x000740cc: br       x8 */ ARM64("br x8");
    /* 0x000740d0: ldr      w0, [x0] */ ARM64("ldr w0, [x0]");
    /* 0x000740d4: ret       */ return;
    /* 0x000740d8: ldar     w0, [x0] */ ARM64("ldar w0, [x0]");
    /* 0x000740dc: ret       */ return;
}
