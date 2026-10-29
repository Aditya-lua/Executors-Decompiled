/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xc01b88..0xc01bec (100 bytes). */
#include "../lift_runtime.hpp"

void sub_00c01b88(Arm64Context& cpu) {
    /* 0x00c01b88: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00c01b8c: ldr      x9, [x0], #8 */ ARM64("ldr x9, [x0], #8");
    /* 0x00c01b90: adrp     x10, #0xe06000 */ ARM64("adrp x10, #0xe06000");
    /* 0x00c01b94: add      x10, x10, #0x9ec */ ARM64("add x10, x10, #0x9ec");
    /* 0x00c01b98: adr      x11, #0xc01ba8 */ ARM64("adr x11, #0xc01ba8");
    /* 0x00c01b9c: ldrb     w12, [x10, x9] */ ARM64("ldrb w12, [x10, x9]");
    /* 0x00c01ba0: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00c01ba4: br       x11 */ ARM64("br x11");
loc_00c01ba8:
    /* 0x00c01ba8: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00c01bac: ret       */ return;
    /* 0x00c01bb0: b        #0xc0af08 */ goto sub_00c0af08;
    /* 0x00c01bb4: ldr      x9, [x0] */ ARM64("ldr x9, [x0]");
    /* 0x00c01bb8: eor      x10, x9, #0x8000000000000000 */ ARM64("eor x10, x9, #0x8000000000000000");
    /* 0x00c01bbc: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00c01bc0: mov      w9, #2 */ ARM64("mov w9, #2");
    /* 0x00c01bc4: csel     x9, x10, x9, mi */ ARM64("csel x9, x10, x9, mi");
    /* 0x00c01bc8: cbz      x9, #0xc01ba8 */ if (x9 == 0) goto loc_00c01ba8;
    /* 0x00c01bcc: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00c01bd0: b.ne     #0xc01bdc */ if (COND_NE) goto loc_00c01bdc;
    /* 0x00c01bd4: add      x0, x8, #0x10 */ ARM64("add x0, x8, #0x10");
    /* 0x00c01bd8: b        #0xc02d10 */ goto sub_00c02d10;
loc_00c01bdc:
    /* 0x00c01bdc: b        #0xc02b98 */ goto sub_00c02b98;
    /* 0x00c01be0: b        #0xc01a9c */ goto sub_00c01a9c;
    /* 0x00c01be4: b        #0xc12738 */ goto sub_00c12738;
    /* 0x00c01be8: b        #0xc01bec */ goto sub_00c01bec;
}
