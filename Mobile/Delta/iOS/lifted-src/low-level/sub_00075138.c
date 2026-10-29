/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x75138..0x75174 (60 bytes). */
#include "../lift_runtime.hpp"

void sub_00075138(Arm64Context& cpu) {
    /* 0x00075138: sub      w8, w1, #1 */ ARM64("sub w8, w1, #1");
    /* 0x0007513c: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x00075140: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00075144: csel     x8, xzr, x8, lo */ ARM64("csel x8, xzr, x8, lo");
    /* 0x00075148: cmp      w1, #5 */ ARM64("cmp w1, #5");
    /* 0x0007514c: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00075150: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00075154: adrp     x9, #0xe6a000 */ ARM64("adrp x9, #0xe6a000");
    /* 0x00075158: add      x9, x9, #0xcc8 */ ARM64("add x9, x9, #0xcc8");
    /* 0x0007515c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00075160: br       x8 */ ARM64("br x8");
    /* 0x00075164: ldr      x0, [x0] */ ARM64("ldr x0, [x0]");
    /* 0x00075168: ret       */ return;
    /* 0x0007516c: ldar     x0, [x0] */ ARM64("ldar x0, [x0]");
    /* 0x00075170: ret       */ return;
}
