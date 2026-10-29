/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xc7687c..0xc7698c (272 bytes). */
#include "../lift_runtime.hpp"

void sub_00c7687c(Arm64Context& cpu) {
    /* 0x00c7687c: sub      sp, sp, #0x40 */ ARM64("sub sp, sp, #0x40");
    /* 0x00c76880: stp      x20, x19, [sp, #0x20] */ ARM64("stp x20, x19, [sp, #0x20]");
    /* 0x00c76884: stp      x29, x30, [sp, #0x30] */ ARM64("stp x29, x30, [sp, #0x30]");
    /* 0x00c76888: add      x29, sp, #0x30 */ ARM64("add x29, sp, #0x30");
    /* 0x00c7688c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00c76890: adrp     x0, #0xf0b000 */ ARM64("adrp x0, #0xf0b000");
    /* 0x00c76894: add      x0, x0, #0x228 */ ARM64("add x0, x0, #0x228");
    /* 0x00c76898: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00c7689c: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00c768a0: ldr      x0, [x0] */ ARM64("ldr x0, [x0]");
    /* 0x00c768a4: cmp      x0, #2 */ ARM64("cmp x0, #2");
    /* 0x00c768a8: b.ls     #0xc768c8 */ if (COND_LS) goto loc_00c768c8;
    /* 0x00c768ac: sub      x0, x0, #0x10 */ ARM64("sub x0, x0, #0x10");
loc_00c768b0:
    /* 0x00c768b0: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00c768b4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00c768b8: stxr     w10, x9, [x0] */ ARM64("stxr w10, x9, [x0]");
    /* 0x00c768bc: cbnz     w10, #0xc768b0 */ if (w10 != 0) goto loc_00c768b0;
    /* 0x00c768c0: tbz      x8, #0x3f, #0xc76940 */ if (((x8 >> #0x3f) & 1) == 0) goto loc_00c76940;
    /* 0x00c768c4: brk      #1 */ ARM64("brk #1");
loc_00c768c8:
    /* 0x00c768c8: b.ne     #0xc76960 */ if (COND_NE) goto loc_00c76960;
    /* 0x00c768cc: adrp     x0, #0xf0b000 */ ARM64("adrp x0, #0xf0b000");
    /* 0x00c768d0: add      x0, x0, #0x240 */ ARM64("add x0, x0, #0x240");
    /* 0x00c768d4: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00c768d8: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00c768dc: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00c768e0: cbnz     x8, #0xc7692c */ if (x8 != 0) goto loc_00c7692c;
    /* 0x00c768e4: adrp     x8, #0xf14000 */ ARM64("adrp x8, #0xf14000");
    /* 0x00c768e8: ldr      x10, [x8, #0x3f0] */ ARM64("ldr x10, [x8, #0x3f0]");
    /* 0x00c768ec: adrp     x9, #0xf14000 */ ARM64("adrp x9, #0xf14000");
    /* 0x00c768f0: add      x9, x9, #0x3f0 */ ARM64("add x9, x9, #0x3f0");
loc_00c768f4:
    /* 0x00c768f4: cmn      x10, #1 */ ARM64("cmn x10, #1");
    /* 0x00c768f8: b.eq     #0xc76988 */ if (COND_EQ) goto loc_00c76988;
    /* 0x00c768fc: ldxr     x11, [x9] */ ARM64("ldxr x11, [x9]");
    /* 0x00c76900: cmp      x11, x10 */ ARM64("cmp x11, x10");
    /* 0x00c76904: b.ne     #0xc7691c */ if (COND_NE) goto loc_00c7691c;
    /* 0x00c76908: add      x8, x10, #1 */ ARM64("add x8, x10, #1");
    /* 0x00c7690c: stxr     w12, x8, [x9] */ ARM64("stxr w12, x8, [x9]");
    /* 0x00c76910: mov      x10, x11 */ ARM64("mov x10, x11");
    /* 0x00c76914: cbz      w12, #0xc76928 */ if (w12 == 0) goto loc_00c76928;
    /* 0x00c76918: b        #0xc768f4 */ goto loc_00c768f4;
loc_00c7691c:
    /* 0x00c7691c: clrex     */ ARM64("clrex");
    /* 0x00c76920: mov      x10, x11 */ ARM64("mov x10, x11");
    /* 0x00c76924: b        #0xc768f4 */ goto loc_00c768f4;
loc_00c76928:
    /* 0x00c76928: str      x8, [x0] */ ARM64("str x8, [x0]");
loc_00c7692c:
    /* 0x00c7692c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00c76930: str      x9, [sp, #8] */ ARM64("str x9, [sp, #8]");
    /* 0x00c76934: add      x1, sp, #8 */ ARM64("add x1, sp, #8");
    /* 0x00c76938: mov      x0, x8 */ ARM64("mov x0, x8");
    /* 0x00c7693c: bl       #0xc5eaa8 */ CALL_DIRECT(sub_00c5eaa8);
loc_00c76940:
    /* 0x00c76940: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x00c76944: cbnz     x8, #0xc7696c */ if (x8 != 0) goto loc_00c7696c;
loc_00c76948:
    /* 0x00c76948: str      x0, [x19] */ ARM64("str x0, [x19]");
    /* 0x00c7694c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00c76950: ldp      x29, x30, [sp, #0x30] */ ARM64("ldp x29, x30, [sp, #0x30]");
    /* 0x00c76954: ldp      x20, x19, [sp, #0x20] */ ARM64("ldp x20, x19, [sp, #0x20]");
    /* 0x00c76958: add      sp, sp, #0x40 */ ARM64("add sp, sp, #0x40");
    /* 0x00c7695c: ret       */ return;
loc_00c76960:
    /* 0x00c76960: bl       #0xc79be8 */ CALL_DIRECT(sub_00c79be8);
    /* 0x00c76964: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x00c76968: cbz      x8, #0xc76948 */ if (x8 == 0) goto loc_00c76948;
loc_00c7696c:
    /* 0x00c7696c: bl       #0xc5ecc8 */ CALL_DIRECT(sub_00c5ecc8);
    /* 0x00c76970: adrp     x0, #0xe0c000 */ ARM64("adrp x0, #0xe0c000");
    /* 0x00c76974: add      x0, x0, #0xe23 */ ARM64("add x0, x0, #0xe23");
    /* 0x00c76978: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00c7697c: add      x2, x2, #0xe78 */ ARM64("add x2, x2, #0xe78");
    /* 0x00c76980: mov      w1, #0x1d */ ARM64("mov w1, #0x1d");
    /* 0x00c76984: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
loc_00c76988:
    /* 0x00c76988: bl       #0xc799e4 */ CALL_DIRECT(sub_00c799e4);
}
