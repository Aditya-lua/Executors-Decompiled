/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x445e8..0x446dc (244 bytes). */
#include "../lift_runtime.hpp"

void sub_000445e8(Arm64Context& cpu) {
    /* 0x000445e8: cmp      w1, #0 */ ARM64("cmp w1, #0");
    /* 0x000445ec: cset     w8, ne */ ARM64("cset w8, ne");
    /* 0x000445f0: ubfiz    x8, x8, #6, #0x20 */ ARM64("ubfiz x8, x8, #6, #0x20");
    /* 0x000445f4: cmp      w1, #1 */ ARM64("cmp w1, #1");
    /* 0x000445f8: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x000445fc: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00044600: cmp      w1, #2 */ ARM64("cmp w1, #2");
    /* 0x00044604: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x00044608: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0004460c: cmp      w1, #3 */ ARM64("cmp w1, #3");
    /* 0x00044610: mov      w9, #0x20 */ ARM64("mov w9, #0x20");
    /* 0x00044614: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00044618: cmp      w1, #4 */ ARM64("cmp w1, #4");
    /* 0x0004461c: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00044620: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00044624: cmp      w1, #5 */ ARM64("cmp w1, #5");
    /* 0x00044628: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x0004462c: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00044630: cmp      w1, #6 */ ARM64("cmp w1, #6");
    /* 0x00044634: mov      w9, #0x30 */ ARM64("mov w9, #0x30");
    /* 0x00044638: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x0004463c: adrp     x9, #0xe66000 */ ARM64("adrp x9, #0xe66000");
    /* 0x00044640: add      x9, x9, #0xe68 */ ARM64("add x9, x9, #0xe68");
    /* 0x00044644: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00044648: br       x8 */ ARM64("br x8");
    /* 0x0004464c: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00044650: ret       */ return;
    /* 0x00044654: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x00044658: mov      w8, #0x24 */ ARM64("mov w8, #0x24");
    /* 0x0004465c: mov      w9, #0x2a */ ARM64("mov w9, #0x2a");
    /* 0x00044660: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x00044664: ret       */ return;
    /* 0x00044668: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x0004466c: mov      w8, #0x22 */ ARM64("mov w8, #0x22");
    /* 0x00044670: mov      w9, #0x28 */ ARM64("mov w9, #0x28");
    /* 0x00044674: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x00044678: ret       */ return;
    /* 0x0004467c: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x00044680: mov      w8, #0x23 */ ARM64("mov w8, #0x23");
    /* 0x00044684: mov      w9, #0x29 */ ARM64("mov w9, #0x29");
    /* 0x00044688: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x0004468c: ret       */ return;
    /* 0x00044690: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x00044694: mov      w8, #0x26 */ ARM64("mov w8, #0x26");
    /* 0x00044698: mov      w9, #0x2c */ ARM64("mov w9, #0x2c");
    /* 0x0004469c: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x000446a0: ret       */ return;
    /* 0x000446a4: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x000446a8: mov      w8, #0x21 */ ARM64("mov w8, #0x21");
    /* 0x000446ac: mov      w9, #0x27 */ ARM64("mov w9, #0x27");
    /* 0x000446b0: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x000446b4: ret       */ return;
    /* 0x000446b8: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x000446bc: mov      w8, #0x51 */ ARM64("mov w8, #0x51");
    /* 0x000446c0: cinc     w0, w8, ne */ ARM64("cinc w0, w8, ne");
    /* 0x000446c4: ret       */ return;
    /* 0x000446c8: cmp      w2, #0 */ ARM64("cmp w2, #0");
    /* 0x000446cc: mov      w8, #0x25 */ ARM64("mov w8, #0x25");
    /* 0x000446d0: mov      w9, #0x2b */ ARM64("mov w9, #0x2b");
    /* 0x000446d4: csel     w0, w9, w8, ne */ ARM64("csel w0, w9, w8, ne");
    /* 0x000446d8: ret       */ return;
}
