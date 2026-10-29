/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xccfb8..0xcd050 (152 bytes). */
#include "../lift_runtime.hpp"

void sub_000ccfb8(Arm64Context& cpu) {
    /* 0x000ccfb8: sub      sp, sp, #0x20 */ ARM64("sub sp, sp, #0x20");
    /* 0x000ccfbc: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x000ccfc0: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x000ccfc4: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x000ccfc8: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x000ccfcc: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x000ccfd0: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x000ccfd4: cmp      w3, #1 */ ARM64("cmp w3, #1");
    /* 0x000ccfd8: mov      w8, #0x30 */ ARM64("mov w8, #0x30");
    /* 0x000ccfdc: csel     x8, xzr, x8, eq */ ARM64("csel x8, xzr, x8, eq");
    /* 0x000ccfe0: cmp      w3, #2 */ ARM64("cmp w3, #2");
    /* 0x000ccfe4: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x000ccfe8: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x000ccfec: cmp      w3, #0 */ ARM64("cmp w3, #0");
    /* 0x000ccff0: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x000ccff4: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x000ccff8: adrp     x9, #0xe6d000 */ ARM64("adrp x9, #0xe6d000");
    /* 0x000ccffc: add      x9, x9, #0x5c0 */ ARM64("add x9, x9, #0x5c0");
    /* 0x000cd000: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x000cd004: br       x8 */ ARM64("br x8");
    /* 0x000cd008: mov      x0, #-1 */ ARM64("mov x0, #-1");
    /* 0x000cd00c: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x000cd010: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x000cd014: ret       */ return;
    /* 0x000cd018: mov      w8, #2 */ ARM64("mov w8, #2");
    /* 0x000cd01c: b        #0xcd02c */ goto loc_000cd02c;
    /* 0x000cd020: mov      w8, #0 */ ARM64("mov w8, #0");
    /* 0x000cd024: b        #0xcd02c */ goto loc_000cd02c;
    /* 0x000cd028: mov      w8, #1 */ ARM64("mov w8, #1");
loc_000cd02c:
    /* 0x000cd02c: mov      x0, x1 */ ARM64("mov x0, x1");
    /* 0x000cd030: mov      x1, x2 */ ARM64("mov x1, x2");
    /* 0x000cd034: mov      x2, x8 */ ARM64("mov x2, x8");
    /* 0x000cd038: bl       #0xc7abc8 */ CALL_DIRECT(sub_00c7abc8);
    /* 0x000cd03c: cmp      w0, #0 */ ARM64("cmp w0, #0");
    /* 0x000cd040: csetm    x0, ne */ ARM64("csetm x0, ne");
    /* 0x000cd044: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x000cd048: add      sp, sp, #0x20 */ ARM64("add sp, sp, #0x20");
    /* 0x000cd04c: ret       */ return;
}
