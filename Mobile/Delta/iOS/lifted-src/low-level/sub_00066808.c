/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x66808..0x66844 (60 bytes). */
#include "../lift_runtime.hpp"

void sub_00066808(Arm64Context& cpu) {
    /* 0x00066808: sub      w8, w1, #1 */ ARM64("sub w8, w1, #1");
    /* 0x0006680c: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x00066810: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00066814: csel     x8, xzr, x8, lo */ ARM64("csel x8, xzr, x8, lo");
    /* 0x00066818: cmp      w1, #5 */ ARM64("cmp w1, #5");
    /* 0x0006681c: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00066820: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00066824: adrp     x9, #0xe6a000 */ ARM64("adrp x9, #0xe6a000");
    /* 0x00066828: add      x9, x9, #0x360 */ ARM64("add x9, x9, #0x360");
    /* 0x0006682c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00066830: br       x8 */ ARM64("br x8");
    /* 0x00066834: ldr      w0, [x0] */ ARM64("ldr w0, [x0]");
    /* 0x00066838: ret       */ return;
    /* 0x0006683c: ldar     w0, [x0] */ ARM64("ldar w0, [x0]");
    /* 0x00066840: ret       */ return;
}
