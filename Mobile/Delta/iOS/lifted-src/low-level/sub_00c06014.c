/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xc06014..0xc06078 (100 bytes). */
#include "../lift_runtime.hpp"

void sub_00c06014(Arm64Context& cpu) {
    /* 0x00c06014: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00c06018: ldr      x9, [x0], #8 */ ARM64("ldr x9, [x0], #8");
    /* 0x00c0601c: adrp     x10, #0xe06000 */ ARM64("adrp x10, #0xe06000");
    /* 0x00c06020: add      x10, x10, #0xa17 */ ARM64("add x10, x10, #0xa17");
    /* 0x00c06024: adr      x11, #0xc06034 */ ARM64("adr x11, #0xc06034");
    /* 0x00c06028: ldrb     w12, [x10, x9] */ ARM64("ldrb w12, [x10, x9]");
    /* 0x00c0602c: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00c06030: br       x11 */ ARM64("br x11");
loc_00c06034:
    /* 0x00c06034: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00c06038: ret       */ return;
    /* 0x00c0603c: b        #0xc0af08 */ goto sub_00c0af08;
    /* 0x00c06040: ldr      x9, [x0] */ ARM64("ldr x9, [x0]");
    /* 0x00c06044: eor      x10, x9, #0x8000000000000000 */ ARM64("eor x10, x9, #0x8000000000000000");
    /* 0x00c06048: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00c0604c: mov      w9, #2 */ ARM64("mov w9, #2");
    /* 0x00c06050: csel     x9, x10, x9, mi */ ARM64("csel x9, x10, x9, mi");
    /* 0x00c06054: cbz      x9, #0xc06034 */ if (x9 == 0) goto loc_00c06034;
    /* 0x00c06058: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00c0605c: b.ne     #0xc06068 */ if (COND_NE) goto loc_00c06068;
    /* 0x00c06060: add      x0, x8, #0x10 */ ARM64("add x0, x8, #0x10");
    /* 0x00c06064: b        #0xc02d10 */ goto sub_00c02d10;
loc_00c06068:
    /* 0x00c06068: b        #0xc02b98 */ goto sub_00c02b98;
    /* 0x00c0606c: b        #0xc01a9c */ goto sub_00c01a9c;
    /* 0x00c06070: b        #0xc12738 */ goto sub_00c12738;
    /* 0x00c06074: b        #0xc01bec */ goto sub_00c01bec;
}
