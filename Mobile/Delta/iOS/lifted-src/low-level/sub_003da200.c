/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x3da200..0x3da270 (112 bytes). */
#include "../lift_runtime.hpp"

void sub_003da200(Arm64Context& cpu) {
    /* 0x003da200: cmp      w3, #0 */ ARM64("cmp w3, #0");
    /* 0x003da204: mov      w8, #0x28 */ ARM64("mov w8, #0x28");
    /* 0x003da208: csel     x8, xzr, x8, eq */ ARM64("csel x8, xzr, x8, eq");
    /* 0x003da20c: cmp      w3, #1 */ ARM64("cmp w3, #1");
    /* 0x003da210: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x003da214: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x003da218: cmp      w3, #2 */ ARM64("cmp w3, #2");
    /* 0x003da21c: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x003da220: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x003da224: adrp     x9, #0xe7f000 */ ARM64("adrp x9, #0xe7f000");
    /* 0x003da228: add      x9, x9, #0x428 */ ARM64("add x9, x9, #0x428");
    /* 0x003da22c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x003da230: br       x8 */ ARM64("br x8");
    /* 0x003da234: mov      x0, #-1 */ ARM64("mov x0, #-1");
    /* 0x003da238: ret       */ return;
    /* 0x003da23c: ldr      x8, [x1, #0x10] */ ARM64("ldr x8, [x1, #0x10]");
    /* 0x003da240: add      x8, x8, x2 */ ARM64("add x8, x8, x2");
    /* 0x003da244: str      x8, [x1, #0x10] */ ARM64("str x8, [x1, #0x10]");
    /* 0x003da248: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x003da24c: ret       */ return;
    /* 0x003da250: ldr      x8, [x1, #8] */ ARM64("ldr x8, [x1, #8]");
    /* 0x003da254: add      x8, x8, x2 */ ARM64("add x8, x8, x2");
    /* 0x003da258: str      x8, [x1, #0x10] */ ARM64("str x8, [x1, #0x10]");
    /* 0x003da25c: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x003da260: ret       */ return;
    /* 0x003da264: str      x2, [x1, #0x10] */ ARM64("str x2, [x1, #0x10]");
    /* 0x003da268: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x003da26c: ret       */ return;
}
