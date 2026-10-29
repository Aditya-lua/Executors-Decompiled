/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x97b360..0x97b628 (712 bytes). */
#include "../lift_runtime.hpp"

void sub_0097b360(Arm64Context& cpu) {
    /* 0x0097b360: stp      x24, x23, [sp, #-0x40]! */ ARM64("stp x24, x23, [sp, #-0x40]!");
    /* 0x0097b364: stp      x22, x21, [sp, #0x10] */ ARM64("stp x22, x21, [sp, #0x10]");
    /* 0x0097b368: stp      x20, x19, [sp, #0x20] */ ARM64("stp x20, x19, [sp, #0x20]");
    /* 0x0097b36c: stp      x29, x30, [sp, #0x30] */ ARM64("stp x29, x30, [sp, #0x30]");
    /* 0x0097b370: add      x29, sp, #0x30 */ ARM64("add x29, sp, #0x30");
    /* 0x0097b374: sub      sp, sp, #0x510 */ ARM64("sub sp, sp, #0x510");
    /* 0x0097b378: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x0097b37c: adrp     x8, #0xe5c000 */ ARM64("adrp x8, #0xe5c000");
    /* 0x0097b380: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x0097b384: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x0097b388: stur     x8, [x29, #-0x38] */ ARM64("stur x8, [x29, #-0x38]");
    /* 0x0097b38c: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0097b390: cbz      x8, #0x97b3d8 */ if (x8 == 0) goto loc_0097b3d8;
loc_0097b394:
    /* 0x0097b394: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0097b398: bl       #0x97b628 */ CALL_DIRECT(sub_0097b628);
    /* 0x0097b39c: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x0097b3a0: mov      w8, #-2 */ ARM64("mov w8, #-2");
    /* 0x0097b3a4: cinv     w0, w8, ge */ ARM64("cinv w0, w8, ge");
loc_0097b3a8:
    /* 0x0097b3a8: ldur     x8, [x29, #-0x38] */ ARM64("ldur x8, [x29, #-0x38]");
    /* 0x0097b3ac: adrp     x9, #0xe5c000 */ ARM64("adrp x9, #0xe5c000");
    /* 0x0097b3b0: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x0097b3b4: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x0097b3b8: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x0097b3bc: b.ne     #0x97b624 */ if (COND_NE) goto loc_0097b624;
    /* 0x0097b3c0: add      sp, sp, #0x510 */ ARM64("add sp, sp, #0x510");
    /* 0x0097b3c4: ldp      x29, x30, [sp, #0x30] */ ARM64("ldp x29, x30, [sp, #0x30]");
    /* 0x0097b3c8: ldp      x20, x19, [sp, #0x20] */ ARM64("ldp x20, x19, [sp, #0x20]");
    /* 0x0097b3cc: ldp      x22, x21, [sp, #0x10] */ ARM64("ldp x22, x21, [sp, #0x10]");
    /* 0x0097b3d0: ldp      x24, x23, [sp], #0x40 */ ARM64("ldp x24, x23, [sp], #0x40");
    /* 0x0097b3d4: ret       */ return;
loc_0097b3d8:
    /* 0x0097b3d8: add      x22, x19, #0x40 */ ARM64("add x22, x19, #0x40");
    /* 0x0097b3dc: ldr      x8, [x19, #0x50] */ ARM64("ldr x8, [x19, #0x50]");
    /* 0x0097b3e0: cmp      x8, #0x1f */ ARM64("cmp x8, #0x1f");
    /* 0x0097b3e4: b.hi     #0x97b458 */ if (COND_HI) goto loc_0097b458;
    /* 0x0097b3e8: adrp     x20, #0xc88000 */ ARM64("adrp x20, #0xc88000");
    /* 0x0097b3ec: add      x20, x20, #0x2f8 */ ARM64("add x20, x20, #0x2f8");
    /* 0x0097b3f0: b        #0x97b40c */ goto loc_0097b40c;
loc_0097b3f4:
    /* 0x0097b3f4: ldr      x8, [x19, #0x50] */ ARM64("ldr x8, [x19, #0x50]");
    /* 0x0097b3f8: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x0097b3fc: str      x8, [x19, #0x50] */ ARM64("str x8, [x19, #0x50]");
    /* 0x0097b400: strb     wzr, [x0, #0x119] */ ARM64("strb wzr, [x0, #0x119]");
    /* 0x0097b404: cmp      x8, #0x20 */ ARM64("cmp x8, #0x20");
    /* 0x0097b408: b.hs     #0x97b458 */ if (COND_HS) goto loc_0097b458;
loc_0097b40c:
    /* 0x0097b40c: ldr      x21, [x19, #0x10] */ ARM64("ldr x21, [x19, #0x10]");
    /* 0x0097b410: cmn      x21, #0x122 */ ARM64("cmn x21, #0x122");
    /* 0x0097b414: b.hi     #0x97b61c */ if (COND_HI) goto loc_0097b61c;
    /* 0x0097b418: add      x0, x21, #0x120 */ ARM64("add x0, x21, #0x120");
    /* 0x0097b41c: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x0097b420: mov      w2, #0xa2 */ ARM64("mov w2, #0xa2");
    /* 0x0097b424: bl       #0xa6bf4c */ CALL_DIRECT(sub_00a6bf4c);
    /* 0x0097b428: cbz      x0, #0x97b61c */ if (x0 == 0) goto loc_0097b61c;
    /* 0x0097b42c: stp      xzr, xzr, [x0] */ ARM64("stp xzr, xzr, [x0]");
    /* 0x0097b430: stp      xzr, x21, [x0, #0x10] */ ARM64("stp xzr, x21, [x0, #0x10]");
    /* 0x0097b434: ldr      x8, [x19, #0x48] */ ARM64("ldr x8, [x19, #0x48]");
    /* 0x0097b438: cbz      x8, #0x97b440 */ if (x8 == 0) goto loc_0097b440;
    /* 0x0097b43c: str      x0, [x8] */ ARM64("str x0, [x8]");
loc_0097b440:
    /* 0x0097b440: stp      xzr, x8, [x0] */ ARM64("stp xzr, x8, [x0]");
    /* 0x0097b444: str      x0, [x19, #0x48] */ ARM64("str x0, [x19, #0x48]");
    /* 0x0097b448: ldr      x8, [x19, #0x40] */ ARM64("ldr x8, [x19, #0x40]");
    /* 0x0097b44c: cbnz     x8, #0x97b3f4 */ if (x8 != 0) goto loc_0097b3f4;
    /* 0x0097b450: str      x0, [x22] */ ARM64("str x0, [x22]");
    /* 0x0097b454: b        #0x97b3f4 */ goto loc_0097b3f4;
loc_0097b458:
    /* 0x0097b458: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x0097b45c: cbz      x8, #0x97b520 */ if (x8 == 0) goto loc_0097b520;
    /* 0x0097b460: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x0097b464: add      x23, sp, #8 */ ARM64("add x23, sp, #8");
    /* 0x0097b468: mov      x21, x22 */ ARM64("mov x21, x22");
loc_0097b46c:
    /* 0x0097b46c: ldr      x1, [x21] */ ARM64("ldr x1, [x21]");
    /* 0x0097b470: cbz      x1, #0x97b4d8 */ if (x1 == 0) goto loc_0097b4d8;
    /* 0x0097b474: ldr      x2, [x19, #0x10] */ ARM64("ldr x2, [x19, #0x10]");
    /* 0x0097b478: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0097b47c: bl       #0xc61dbc */ CALL_DIRECT(sub_00c61dbc);
    /* 0x0097b480: cbz      x0, #0x97b61c */ if (x0 == 0) goto loc_0097b61c;
    /* 0x0097b484: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x0097b488: str      xzr, [x23, #0x20] */ ARM64("str xzr, [x23, #0x20]");
    /* 0x0097b48c: movi     v0.16b, #0 */ ARM64("movi v0.16b, #0");
    /* 0x0097b490: stp      q0, q0, [x23] */ ARM64("stp q0, q0, [x23]");
    /* 0x0097b494: add      x8, x0, #0x120 */ ARM64("add x8, x0, #0x120");
    /* 0x0097b498: ldr      x9, [x0, #0x18] */ ARM64("ldr x9, [x0, #0x18]");
    /* 0x0097b49c: stp      x8, x9, [x23] */ ARM64("stp x8, x9, [x23]");
    /* 0x0097b4a0: add      x0, x0, #0x38 */ ARM64("add x0, x0, #0x38");
    /* 0x0097b4a4: str      x0, [x23, #0x10] */ ARM64("str x0, [x23, #0x10]");
    /* 0x0097b4a8: bl       #0x9d353c */ CALL_DIRECT(sub_009d353c);
    /* 0x0097b4ac: ldrb     w8, [x19, #0x70] */ ARM64("ldrb w8, [x19, #0x70]");
    /* 0x0097b4b0: add      x0, x21, #0xa4 */ ARM64("add x0, x21, #0xa4");
    /* 0x0097b4b4: cbz      w8, #0x97b4c0 */ if (w8 == 0) goto loc_0097b4c0;
    /* 0x0097b4b8: str      x0, [x23, #0x18] */ ARM64("str x0, [x23, #0x18]");
    /* 0x0097b4bc: b        #0x97b4c4 */ goto loc_0097b4c4;
loc_0097b4c0:
    /* 0x0097b4c0: bl       #0x9d353c */ CALL_DIRECT(sub_009d353c);
loc_0097b4c4:
    /* 0x0097b4c4: add      x20, x20, #1 */ ARM64("add x20, x20, #1");
    /* 0x0097b4c8: add      x23, x23, #0x28 */ ARM64("add x23, x23, #0x28");
    /* 0x0097b4cc: cmp      x20, #0x20 */ ARM64("cmp x20, #0x20");
    /* 0x0097b4d0: b.ne     #0x97b46c */ if (COND_NE) goto loc_0097b46c;
    /* 0x0097b4d4: b        #0x97b4dc */ goto loc_0097b4dc;
loc_0097b4d8:
    /* 0x0097b4d8: cbz      x20, #0x97b61c */ if (x20 == 0) goto loc_0097b61c;
loc_0097b4dc:
    /* 0x0097b4dc: bl       #0xa36c8c */ CALL_DIRECT(sub_00a36c8c);
    /* 0x0097b4e0: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x0097b4e4: add      x1, sp, #8 */ ARM64("add x1, sp, #8");
    /* 0x0097b4e8: mov      x5, sp */ ARM64("mov x5, sp");
    /* 0x0097b4ec: mov      w2, #0x28 */ ARM64("mov w2, #0x28");
    /* 0x0097b4f0: mov      x3, x20 */ ARM64("mov x3, x20");
    /* 0x0097b4f4: mov      x4, #0 */ ARM64("mov x4, #0");
    /* 0x0097b4f8: bl       #0x9d44ac */ CALL_DIRECT(sub_009d44ac);
    /* 0x0097b4fc: cbz      w0, #0x97b528 */ if (w0 == 0) goto loc_0097b528;
    /* 0x0097b500: bl       #0xa36e70 */ CALL_DIRECT(sub_00a36e70);
    /* 0x0097b504: ldr      x8, [x19, #0x20] */ ARM64("ldr x8, [x19, #0x20]");
    /* 0x0097b508: cbz      x8, #0x97b540 */ if (x8 == 0) goto loc_0097b540;
    /* 0x0097b50c: ldr      x0, [x19, #0x28] */ ARM64("ldr x0, [x19, #0x28]");
    /* 0x0097b510: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x0097b514: ldr      x8, [sp] */ ARM64("ldr x8, [sp]");
    /* 0x0097b518: cbnz     x8, #0x97b54c */ if (x8 != 0) goto loc_0097b54c;
    /* 0x0097b51c: b        #0x97b394 */ goto loc_0097b394;
loc_0097b520:
    /* 0x0097b520: mov      w0, #-1 */ ARM64("mov w0, #-1");
    /* 0x0097b524: b        #0x97b3a8 */ goto loc_0097b3a8;
loc_0097b528:
    /* 0x0097b528: bl       #0xa36000 */ CALL_DIRECT(sub_00a36000);
    /* 0x0097b52c: bl       #0x9d3b0c */ CALL_DIRECT(sub_009d3b0c);
    /* 0x0097b530: cbz      w0, #0x97b618 */ if (w0 == 0) goto loc_0097b618;
    /* 0x0097b534: bl       #0xa36cd4 */ CALL_DIRECT(sub_00a36cd4);
    /* 0x0097b538: mov      w0, #-1 */ ARM64("mov w0, #-1");
    /* 0x0097b53c: b        #0x97b3a8 */ goto loc_0097b3a8;
loc_0097b540:
    /* 0x0097b540: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x0097b544: ldr      x8, [sp] */ ARM64("ldr x8, [sp]");
    /* 0x0097b548: cbz      x8, #0x97b394 */ if (x8 == 0) goto loc_0097b394;
loc_0097b54c:
    /* 0x0097b54c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x0097b550: ldr      x11, [x19, #0x40] */ ARM64("ldr x11, [x19, #0x40]");
    /* 0x0097b554: ldr      x9, [sp] */ ARM64("ldr x9, [sp]");
    /* 0x0097b558: add      x10, sp, #8 */ ARM64("add x10, sp, #8");
    /* 0x0097b55c: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x0097b560: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x0097b564: b        #0x97b588 */ goto loc_0097b588;
loc_0097b568:
    /* 0x0097b568: ldr      x14, [x19, #0x68] */ ARM64("ldr x14, [x19, #0x68]");
    /* 0x0097b56c: add      x14, x14, #1 */ ARM64("add x14, x14, #1");
    /* 0x0097b570: str      x14, [x19, #0x68] */ ARM64("str x14, [x19, #0x68]");
    /* 0x0097b574: strb     w12, [x11, #0x119] */ ARM64("strb w12, [x11, #0x119]");
    /* 0x0097b578: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x0097b57c: mov      x11, x13 */ ARM64("mov x11, x13");
    /* 0x0097b580: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x0097b584: b.hs     #0x97b394 */ if (COND_HS) goto loc_0097b394;
loc_0097b588:
    /* 0x0097b588: ldr      x13, [x11] */ ARM64("ldr x13, [x11]");
    /* 0x0097b58c: ldr      x14, [x10], #0x28 */ ARM64("ldr x14, [x10], #0x28");
    /* 0x0097b590: str      x14, [x11, #0x10] */ ARM64("str x14, [x11, #0x10]");
    /* 0x0097b594: str      x0, [x11, #0x110] */ ARM64("str x0, [x11, #0x110]");
    /* 0x0097b598: ldr      x14, [x19, #0x18] */ ARM64("ldr x14, [x19, #0x18]");
    /* 0x0097b59c: add      x15, x14, #1 */ ARM64("add x15, x14, #1");
    /* 0x0097b5a0: str      x15, [x19, #0x18] */ ARM64("str x15, [x19, #0x18]");
    /* 0x0097b5a4: str      x14, [x11, #0x30] */ ARM64("str x14, [x11, #0x30]");
    /* 0x0097b5a8: ldr      x14, [x19, #0x40] */ ARM64("ldr x14, [x19, #0x40]");
    /* 0x0097b5ac: cmp      x14, x11 */ ARM64("cmp x14, x11");
    /* 0x0097b5b0: b.ne     #0x97b5b8 */ if (COND_NE) goto loc_0097b5b8;
    /* 0x0097b5b4: str      x13, [x22] */ ARM64("str x13, [x22]");
loc_0097b5b8:
    /* 0x0097b5b8: ldr      x15, [x19, #0x48] */ ARM64("ldr x15, [x19, #0x48]");
    /* 0x0097b5bc: ldr      x14, [x11, #8] */ ARM64("ldr x14, [x11, #8]");
    /* 0x0097b5c0: cmp      x15, x11 */ ARM64("cmp x15, x11");
    /* 0x0097b5c4: b.eq     #0x97b60c */ if (COND_EQ) goto loc_0097b60c;
    /* 0x0097b5c8: cbz      x14, #0x97b5d0 */ if (x14 == 0) goto loc_0097b5d0;
loc_0097b5cc:
    /* 0x0097b5cc: str      x13, [x14] */ ARM64("str x13, [x14]");
loc_0097b5d0:
    /* 0x0097b5d0: cbz      x13, #0x97b5d8 */ if (x13 == 0) goto loc_0097b5d8;
    /* 0x0097b5d4: str      x14, [x13, #8] */ ARM64("str x14, [x13, #8]");
loc_0097b5d8:
    /* 0x0097b5d8: ldr      x14, [x19, #0x50] */ ARM64("ldr x14, [x19, #0x50]");
    /* 0x0097b5dc: sub      x14, x14, #1 */ ARM64("sub x14, x14, #1");
    /* 0x0097b5e0: str      x14, [x19, #0x50] */ ARM64("str x14, [x19, #0x50]");
    /* 0x0097b5e4: stp      xzr, xzr, [x11] */ ARM64("stp xzr, xzr, [x11]");
    /* 0x0097b5e8: ldr      x14, [x19, #0x60] */ ARM64("ldr x14, [x19, #0x60]");
    /* 0x0097b5ec: cbz      x14, #0x97b5f4 */ if (x14 == 0) goto loc_0097b5f4;
    /* 0x0097b5f0: str      x11, [x14] */ ARM64("str x11, [x14]");
loc_0097b5f4:
    /* 0x0097b5f4: stp      xzr, x14, [x11] */ ARM64("stp xzr, x14, [x11]");
    /* 0x0097b5f8: str      x11, [x19, #0x60] */ ARM64("str x11, [x19, #0x60]");
    /* 0x0097b5fc: ldr      x14, [x19, #0x58] */ ARM64("ldr x14, [x19, #0x58]");
    /* 0x0097b600: cbnz     x14, #0x97b568 */ if (x14 != 0) goto loc_0097b568;
    /* 0x0097b604: str      x11, [x19, #0x58] */ ARM64("str x11, [x19, #0x58]");
    /* 0x0097b608: b        #0x97b568 */ goto loc_0097b568;
loc_0097b60c:
    /* 0x0097b60c: str      x14, [x19, #0x48] */ ARM64("str x14, [x19, #0x48]");
    /* 0x0097b610: cbnz     x14, #0x97b5cc */ if (x14 != 0) goto loc_0097b5cc;
    /* 0x0097b614: b        #0x97b5d0 */ goto loc_0097b5d0;
loc_0097b618:
    /* 0x0097b618: bl       #0xa36e70 */ CALL_DIRECT(sub_00a36e70);
loc_0097b61c:
    /* 0x0097b61c: mov      w0, #-2 */ ARM64("mov w0, #-2");
    /* 0x0097b620: b        #0x97b3a8 */ goto loc_0097b3a8;
loc_0097b624:
    /* 0x0097b624: bl       #0xc7a904 */ CALL_DIRECT(sub_00c7a904);
}
