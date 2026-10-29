/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x40200..0x40254 (84 bytes). */
#include "../lift_runtime.hpp"

void sub_00040200(Arm64Context& cpu) {
    /* 0x00040200: cmp      w1, #0 */ ARM64("cmp w1, #0");
    /* 0x00040204: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00040208: csel     x8, xzr, x8, eq */ ARM64("csel x8, xzr, x8, eq");
    /* 0x0004020c: cmp      w1, #1 */ ARM64("cmp w1, #1");
    /* 0x00040210: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00040214: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00040218: cmp      w1, #2 */ ARM64("cmp w1, #2");
    /* 0x0004021c: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x00040220: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00040224: adrp     x9, #0xe66000 */ ARM64("adrp x9, #0xe66000");
    /* 0x00040228: add      x9, x9, #0xe40 */ ARM64("add x9, x9, #0xe40");
    /* 0x0004022c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00040230: br       x8 */ ARM64("br x8");
    /* 0x00040234: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00040238: ret       */ return;
    /* 0x0004023c: mov      w0, #0x33 */ ARM64("mov w0, #0x33");
    /* 0x00040240: ret       */ return;
    /* 0x00040244: mov      w0, #0x34 */ ARM64("mov w0, #0x34");
    /* 0x00040248: ret       */ return;
    /* 0x0004024c: mov      w0, #0x32 */ ARM64("mov w0, #0x32");
    /* 0x00040250: ret       */ return;
}
