/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xbc5648..0xbca704 (20668 bytes). */
#include "../lift_runtime.hpp"

void sub_00bc5648(Arm64Context& cpu) {
    /* 0x00bc5648: stp      x28, x27, [sp, #-0x60]! */ ARM64("stp x28, x27, [sp, #-0x60]!");
    /* 0x00bc564c: stp      x26, x25, [sp, #0x10] */ ARM64("stp x26, x25, [sp, #0x10]");
    /* 0x00bc5650: stp      x24, x23, [sp, #0x20] */ ARM64("stp x24, x23, [sp, #0x20]");
    /* 0x00bc5654: stp      x22, x21, [sp, #0x30] */ ARM64("stp x22, x21, [sp, #0x30]");
    /* 0x00bc5658: stp      x20, x19, [sp, #0x40] */ ARM64("stp x20, x19, [sp, #0x40]");
    /* 0x00bc565c: stp      x29, x30, [sp, #0x50] */ ARM64("stp x29, x30, [sp, #0x50]");
    /* 0x00bc5660: add      x29, sp, #0x50 */ ARM64("add x29, sp, #0x50");
    /* 0x00bc5664: sub      sp, sp, #0x570 */ ARM64("sub sp, sp, #0x570");
    /* 0x00bc5668: str      xzr, [sp] */ ARM64("str xzr, [sp]");
    /* 0x00bc566c: str      x2, [sp, #0x170] */ ARM64("str x2, [sp, #0x170]");
    /* 0x00bc5670: str      x1, [sp, #0x160] */ ARM64("str x1, [sp, #0x160]");
    /* 0x00bc5674: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc5678: add      x19, sp, #0x1d0 */ ARM64("add x19, sp, #0x1d0");
    /* 0x00bc567c: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00bc5680: add      x8, x8, #0x958 */ ARM64("add x8, x8, #0x958");
    /* 0x00bc5684: ldp      q0, q1, [x8] */ ARM64("ldp q0, q1, [x8]");
    /* 0x00bc5688: stp      q1, q0, [sp, #0xe0] */ ARM64("stp q1, q0, [sp, #0xe0]");
    /* 0x00bc568c: stp      q0, q1, [sp, #0x1b0] */ ARM64("stp q0, q1, [sp, #0x1b0]");
    /* 0x00bc5690: ldp      x23, x8, [x0, #0x20] */ ARM64("ldp x23, x8, [x0, #0x20]");
    /* 0x00bc5694: stp      x23, x8, [sp, #0x198] */ ARM64("stp x23, x8, [sp, #0x198]");
    /* 0x00bc5698: add      x11, x23, x8, lsl #5 */ ARM64("add x11, x23, x8, lsl #5");
    /* 0x00bc569c: ldp      x9, x8, [x0, #0x38] */ ARM64("ldp x9, x8, [x0, #0x38]");
    /* 0x00bc56a0: stp      x8, x9, [sp, #0x188] */ ARM64("stp x8, x9, [sp, #0x188]");
    /* 0x00bc56a4: str      x0, [sp, #0x118] */ ARM64("str x0, [sp, #0x118]");
    /* 0x00bc56a8: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00bc56ac: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00bc56b0: mov      w25, #0x30 */ ARM64("mov w25, #0x30");
    /* 0x00bc56b4: mov      w27, #0x48 */ ARM64("mov w27, #0x48");
    /* 0x00bc56b8: str      x11, [sp, #0x180] */ ARM64("str x11, [sp, #0x180]");
    /* 0x00bc56bc: b        #0xbc56d0 */ goto loc_00bc56d0;
loc_00bc56c0:
    /* 0x00bc56c0: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc56c4: bl       #0xbcc024 */ CALL_DIRECT(sub_00bcc024);
    /* 0x00bc56c8: ldr      x10, [sp, #0x1a8] */ ARM64("ldr x10, [sp, #0x1a8]");
    /* 0x00bc56cc: ldr      x11, [sp, #0x180] */ ARM64("ldr x11, [sp, #0x180]");
loc_00bc56d0:
    /* 0x00bc56d0: cmp      x23, x11 */ ARM64("cmp x23, x11");
    /* 0x00bc56d4: b.eq     #0xbc5b48 */ if (COND_EQ) goto loc_00bc5b48;
    /* 0x00bc56d8: mov      x8, x10 */ ARM64("mov x8, x10");
    /* 0x00bc56dc: ldr      x9, [x23], #0x20 */ ARM64("ldr x9, [x23], #0x20");
    /* 0x00bc56e0: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x00bc56e4: cmp      x9, x28 */ ARM64("cmp x9, x28");
    /* 0x00bc56e8: b.eq     #0xbc56d0 */ if (COND_EQ) goto loc_00bc56d0;
    /* 0x00bc56ec: mov      w9, w8 */ ARM64("mov w9, w8");
    /* 0x00bc56f0: ldr      x10, [sp, #0x1a0] */ ARM64("ldr x10, [sp, #0x1a0]");
    /* 0x00bc56f4: cmp      x10, x9 */ ARM64("cmp x10, x9");
    /* 0x00bc56f8: b.ls     #0xbc9560 */ if (COND_LS) goto loc_00bc9560;
    /* 0x00bc56fc: ldr      x10, [sp, #0x198] */ ARM64("ldr x10, [sp, #0x198]");
    /* 0x00bc5700: add      x9, x10, x9, lsl #5 */ ARM64("add x9, x10, x9, lsl #5");
    /* 0x00bc5704: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00bc5708: cmp      x10, x28 */ ARM64("cmp x10, x28");
    /* 0x00bc570c: b.eq     #0xbc9560 */ if (COND_EQ) goto loc_00bc9560;
    /* 0x00bc5710: add      x10, x8, #1 */ ARM64("add x10, x8, #1");
    /* 0x00bc5714: str      x10, [sp, #0x1a8] */ ARM64("str x10, [sp, #0x1a8]");
    /* 0x00bc5718: ldp      x10, x11, [x9, #8] */ ARM64("ldp x10, x11, [x9, #8]");
    /* 0x00bc571c: mov      w12, #0x108 */ ARM64("mov w12, #0x108");
    /* 0x00bc5720: madd     x11, x11, x12, x10 */ ARM64("madd x11, x11, x12, x10");
    /* 0x00bc5724: ldr      d0, [x9, #0x18] */ ARM64("ldr d0, [x9, #0x18]");
    /* 0x00bc5728: stp      x21, xzr, [sp, #0x1d0] */ ARM64("stp x21, xzr, [sp, #0x1d0]");
    /* 0x00bc572c: str      xzr, [sp, #0x1f8] */ ARM64("str xzr, [sp, #0x1f8]");
    /* 0x00bc5730: str      x10, [sp, #0x218] */ ARM64("str x10, [sp, #0x218]");
    /* 0x00bc5734: str      x11, [sp, #0x220] */ ARM64("str x11, [sp, #0x220]");
    /* 0x00bc5738: str      xzr, [sp, #0x228] */ ARM64("str xzr, [sp, #0x228]");
    /* 0x00bc573c: str      xzr, [sp, #0x280] */ ARM64("str xzr, [sp, #0x280]");
    /* 0x00bc5740: str      xzr, [sp, #0x2d8] */ ARM64("str xzr, [sp, #0x2d8]");
    /* 0x00bc5744: ldp      x9, x10, [sp, #0x188] */ ARM64("ldp x9, x10, [sp, #0x188]");
    /* 0x00bc5748: str      x10, [sp, #0x2e0] */ ARM64("str x10, [sp, #0x2e0]");
    /* 0x00bc574c: str      x9, [sp, #0x2e8] */ ARM64("str x9, [sp, #0x2e8]");
    /* 0x00bc5750: str      d0, [sp, #0x2f0] */ ARM64("str d0, [sp, #0x2f0]");
    /* 0x00bc5754: str      w8, [sp, #0x2f8] */ ARM64("str w8, [sp, #0x2f8]");
    /* 0x00bc5758: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00bc575c: b        #0xbc57bc */ goto loc_00bc57bc;
loc_00bc5760:
    /* 0x00bc5760: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00bc5764: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00bc5768: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00bc576c: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00bc5770: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00bc5774: tbz      w10, #0x1f, #0xbc5b10 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00bc5b10;
loc_00bc5778:
    /* 0x00bc5778: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00bc577c: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00bc5780: strb     w24, [x8, x11] */ ARM64("strb w24, [x8, x11]");
    /* 0x00bc5784: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc5788: strb     w24, [x9, #8] */ ARM64("strb w24, [x9, #8]");
    /* 0x00bc578c: sub      x20, x8, x11, lsl #4 */ ARM64("sub x20, x8, x11, lsl #4");
    /* 0x00bc5790: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00bc5794: stp      x22, xzr, [x20, #-0x10] */ ARM64("stp x22, xzr, [x20, #-0x10]");
    /* 0x00bc5798: ldr      q0, [sp, #0x1c0] */ ARM64("ldr q0, [sp, #0x1c0]");
    /* 0x00bc579c: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00bc57a0: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00bc57a4: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00bc57a8: str      q0, [sp, #0x1c0] */ ARM64("str q0, [sp, #0x1c0]");
loc_00bc57ac:
    /* 0x00bc57ac: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00bc57b0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00bc57b4: stur     x8, [x20, #-8] */ ARM64("stur x8, [x20, #-8]");
    /* 0x00bc57b8: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
loc_00bc57bc:
    /* 0x00bc57bc: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc57c0: b.ne     #0xbc58f4 */ if (COND_NE) goto loc_00bc58f4;
    /* 0x00bc57c4: ldr      x0, [sp, #0x1d8] */ ARM64("ldr x0, [sp, #0x1d8]");
    /* 0x00bc57c8: cbz      x0, #0xbc57f8 */ if (x0 == 0) goto loc_00bc57f8;
    /* 0x00bc57cc: ldr      x8, [sp, #0x1f0] */ ARM64("ldr x8, [sp, #0x1f0]");
    /* 0x00bc57d0: ldr      x22, [sp, #0x1e0] */ ARM64("ldr x22, [sp, #0x1e0]");
    /* 0x00bc57d4: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc57d8: b.eq     #0xbc57e8 */ if (COND_EQ) goto loc_00bc57e8;
loc_00bc57dc:
    /* 0x00bc57dc: ldr      x0, [x22], #8 */ ARM64("ldr x0, [x22], #8");
    /* 0x00bc57e0: str      x22, [sp, #0x1e0] */ ARM64("str x22, [sp, #0x1e0]");
    /* 0x00bc57e4: b        #0xbc59ec */ goto loc_00bc59ec;
loc_00bc57e8:
    /* 0x00bc57e8: ldr      x8, [sp, #0x1e8] */ ARM64("ldr x8, [sp, #0x1e8]");
    /* 0x00bc57ec: cbz      x8, #0xbc57f4 */ if (x8 == 0) goto loc_00bc57f4;
    /* 0x00bc57f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc57f4:
    /* 0x00bc57f4: str      xzr, [sp, #0x1d8] */ ARM64("str xzr, [sp, #0x1d8]");
loc_00bc57f8:
    /* 0x00bc57f8: ldr      x1, [sp, #0x218] */ ARM64("ldr x1, [sp, #0x218]");
    /* 0x00bc57fc: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00bc5800: cmp      x1, #0 */ ARM64("cmp x1, #0");
    /* 0x00bc5804: ccmp     x1, x8, #4, ne */ ARM64("ccmp x1, x8, #4, ne");
    /* 0x00bc5808: b.ne     #0xbc5830 */ if (COND_NE) goto loc_00bc5830;
loc_00bc580c:
    /* 0x00bc580c: ldr      x0, [sp, #0x1f8] */ ARM64("ldr x0, [sp, #0x1f8]");
    /* 0x00bc5810: cbz      x0, #0xbc58c0 */ if (x0 == 0) goto loc_00bc58c0;
    /* 0x00bc5814: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00bc5818: ldr      x8, [sp, #0x200] */ ARM64("ldr x8, [sp, #0x200]");
    /* 0x00bc581c: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc5820: b.eq     #0xbc58b0 */ if (COND_EQ) goto loc_00bc58b0;
    /* 0x00bc5824: ldr      x0, [x8], #8 */ ARM64("ldr x0, [x8], #8");
    /* 0x00bc5828: str      x8, [sp, #0x200] */ ARM64("str x8, [sp, #0x200]");
    /* 0x00bc582c: b        #0xbc59ec */ goto loc_00bc59ec;
loc_00bc5830:
    /* 0x00bc5830: add      x8, x1, #0x108 */ ARM64("add x8, x1, #0x108");
    /* 0x00bc5834: str      x8, [sp, #0x218] */ ARM64("str x8, [sp, #0x218]");
    /* 0x00bc5838: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc583c: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
loc_00bc5840:
    /* 0x00bc5840: ldr      x24, [sp, #0x300] */ ARM64("ldr x24, [sp, #0x300]");
    /* 0x00bc5844: cmp      x24, x28 */ ARM64("cmp x24, x28");
    /* 0x00bc5848: b.eq     #0xbc580c */ if (COND_EQ) goto loc_00bc580c;
    /* 0x00bc584c: ldr      x22, [sp, #0x308] */ ARM64("ldr x22, [sp, #0x308]");
    /* 0x00bc5850: ldr      x20, [sp, #0x310] */ ARM64("ldr x20, [sp, #0x310]");
    /* 0x00bc5854: ldr      x0, [sp, #0x1d8] */ ARM64("ldr x0, [sp, #0x1d8]");
    /* 0x00bc5858: cbz      x0, #0xbc5868 */ if (x0 == 0) goto loc_00bc5868;
    /* 0x00bc585c: ldr      x8, [sp, #0x1e8] */ ARM64("ldr x8, [sp, #0x1e8]");
    /* 0x00bc5860: cbz      x8, #0xbc5868 */ if (x8 == 0) goto loc_00bc5868;
    /* 0x00bc5864: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc5868:
    /* 0x00bc5868: stp      x22, x22, [sp, #0x1d8] */ ARM64("stp x22, x22, [sp, #0x1d8]");
    /* 0x00bc586c: add      x8, x22, x20, lsl #3 */ ARM64("add x8, x22, x20, lsl #3");
    /* 0x00bc5870: stp      x24, x8, [sp, #0x1e8] */ ARM64("stp x24, x8, [sp, #0x1e8]");
    /* 0x00bc5874: cbnz     x20, #0xbc57dc */ if (x20 != 0) goto loc_00bc57dc;
    /* 0x00bc5878: cbz      x24, #0xbc5884 */ if (x24 == 0) goto loc_00bc5884;
    /* 0x00bc587c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc5880: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc5884:
    /* 0x00bc5884: str      xzr, [sp, #0x1d8] */ ARM64("str xzr, [sp, #0x1d8]");
    /* 0x00bc5888: ldr      x1, [sp, #0x218] */ ARM64("ldr x1, [sp, #0x218]");
    /* 0x00bc588c: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00bc5890: cmp      x1, #0 */ ARM64("cmp x1, #0");
    /* 0x00bc5894: ccmp     x1, x8, #4, ne */ ARM64("ccmp x1, x8, #4, ne");
    /* 0x00bc5898: b.eq     #0xbc580c */ if (COND_EQ) goto loc_00bc580c;
    /* 0x00bc589c: add      x8, x1, #0x108 */ ARM64("add x8, x1, #0x108");
    /* 0x00bc58a0: str      x8, [sp, #0x218] */ ARM64("str x8, [sp, #0x218]");
    /* 0x00bc58a4: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc58a8: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc58ac: b        #0xbc5840 */ goto loc_00bc5840;
loc_00bc58b0:
    /* 0x00bc58b0: ldr      x8, [sp, #0x208] */ ARM64("ldr x8, [sp, #0x208]");
    /* 0x00bc58b4: cbz      x8, #0xbc58bc */ if (x8 == 0) goto loc_00bc58bc;
    /* 0x00bc58b8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc58bc:
    /* 0x00bc58bc: str      xzr, [sp, #0x1f8] */ ARM64("str xzr, [sp, #0x1f8]");
loc_00bc58c0:
    /* 0x00bc58c0: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc58c4: cbz      x8, #0xbc58f0 */ if (x8 == 0) goto loc_00bc58f0;
    /* 0x00bc58c8: ldr      x0, [sp, #0x1d8] */ ARM64("ldr x0, [sp, #0x1d8]");
    /* 0x00bc58cc: cbz      x0, #0xbc58f0 */ if (x0 == 0) goto loc_00bc58f0;
    /* 0x00bc58d0: ldr      x8, [sp, #0x1e8] */ ARM64("ldr x8, [sp, #0x1e8]");
    /* 0x00bc58d4: cbz      x8, #0xbc58f0 */ if (x8 == 0) goto loc_00bc58f0;
    /* 0x00bc58d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc58dc: ldr      x0, [sp, #0x1f8] */ ARM64("ldr x0, [sp, #0x1f8]");
    /* 0x00bc58e0: cbz      x0, #0xbc58f0 */ if (x0 == 0) goto loc_00bc58f0;
    /* 0x00bc58e4: ldr      x8, [sp, #0x208] */ ARM64("ldr x8, [sp, #0x208]");
    /* 0x00bc58e8: cbz      x8, #0xbc58f0 */ if (x8 == 0) goto loc_00bc58f0;
    /* 0x00bc58ec: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc58f0:
    /* 0x00bc58f0: str      xzr, [sp, #0x1d0] */ ARM64("str xzr, [sp, #0x1d0]");
loc_00bc58f4:
    /* 0x00bc58f4: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00bc58f8: cmp      x8, #2 */ ARM64("cmp x8, #2");
    /* 0x00bc58fc: b.ne     #0xbc591c */ if (COND_NE) goto loc_00bc591c;
    /* 0x00bc5900: b        #0xbc56c0 */ goto loc_00bc56c0;
loc_00bc5904:
    /* 0x00bc5904: str      x21, [sp, #0x228] */ ARM64("str x21, [sp, #0x228]");
    /* 0x00bc5908: str      xzr, [sp, #0x230] */ ARM64("str xzr, [sp, #0x230]");
    /* 0x00bc590c: madd     x8, x22, x27, x20 */ ARM64("madd x8, x22, x27, x20");
    /* 0x00bc5910: str      xzr, [sp, #0x250] */ ARM64("str xzr, [sp, #0x250]");
    /* 0x00bc5914: str      x20, [sp, #0x270] */ ARM64("str x20, [sp, #0x270]");
    /* 0x00bc5918: str      x8, [sp, #0x278] */ ARM64("str x8, [sp, #0x278]");
loc_00bc591c:
    /* 0x00bc591c: add      x0, x19, #0x58 */ ARM64("add x0, x19, #0x58");
    /* 0x00bc5920: bl       #0xbcc0e8 */ CALL_DIRECT(sub_00bcc0e8);
    /* 0x00bc5924: cbnz     x0, #0xbc59ec */ if (x0 != 0) goto loc_00bc59ec;
    /* 0x00bc5928: ldr      x8, [sp, #0x2d8] */ ARM64("ldr x8, [sp, #0x2d8]");
    /* 0x00bc592c: cmp      x8, #2 */ ARM64("cmp x8, #2");
    /* 0x00bc5930: b.eq     #0xbc59e0 */ if (COND_EQ) goto loc_00bc59e0;
    /* 0x00bc5934: cbz      x8, #0xbc5974 */ if (x8 == 0) goto loc_00bc5974;
    /* 0x00bc5938: ldr      x9, [sp, #0x2e8] */ ARM64("ldr x9, [sp, #0x2e8]");
    /* 0x00bc593c: ldr      w8, [sp, #0x2f4] */ ARM64("ldr w8, [sp, #0x2f4]");
    /* 0x00bc5940: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc5944: b.ls     #0xbc59d8 */ if (COND_LS) goto loc_00bc59d8;
    /* 0x00bc5948: ldr      x9, [sp, #0x2e0] */ ARM64("ldr x9, [sp, #0x2e0]");
    /* 0x00bc594c: umaddl   x8, w8, w25, x9 */ ARM64("umaddl x8, w8, w25, x9");
    /* 0x00bc5950: ldr      w9, [x8, #0x24] */ ARM64("ldr w9, [x8, #0x24]");
    /* 0x00bc5954: str      w9, [sp, #0x2f4] */ ARM64("str w9, [sp, #0x2f4]");
    /* 0x00bc5958: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc595c: cmp      x9, x28 */ ARM64("cmp x9, x28");
    /* 0x00bc5960: b.eq     #0xbc94c8 */ if (COND_EQ) goto loc_00bc94c8;
    /* 0x00bc5964: ldp      x20, x22, [x8, #8] */ ARM64("ldp x20, x22, [x8, #8]");
    /* 0x00bc5968: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00bc596c: cbnz     x8, #0xbc59ac */ if (x8 != 0) goto loc_00bc59ac;
    /* 0x00bc5970: b        #0xbc5904 */ goto loc_00bc5904;
loc_00bc5974:
    /* 0x00bc5974: ldr      w8, [sp, #0x2f0] */ ARM64("ldr w8, [sp, #0x2f0]");
    /* 0x00bc5978: ldr      x9, [sp, #0x2e8] */ ARM64("ldr x9, [sp, #0x2e8]");
    /* 0x00bc597c: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc5980: b.ls     #0xbc59d8 */ if (COND_LS) goto loc_00bc59d8;
    /* 0x00bc5984: ldr      x9, [sp, #0x2e0] */ ARM64("ldr x9, [sp, #0x2e0]");
    /* 0x00bc5988: umaddl   x8, w8, w25, x9 */ ARM64("umaddl x8, w8, w25, x9");
    /* 0x00bc598c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc5990: cmp      x9, x28 */ ARM64("cmp x9, x28");
    /* 0x00bc5994: b.eq     #0xbc59d8 */ if (COND_EQ) goto loc_00bc59d8;
    /* 0x00bc5998: ldr      w9, [x8, #0x20] */ ARM64("ldr w9, [x8, #0x20]");
    /* 0x00bc599c: str      w9, [sp, #0x2f0] */ ARM64("str w9, [sp, #0x2f0]");
    /* 0x00bc59a0: ldp      x20, x22, [x8, #8] */ ARM64("ldp x20, x22, [x8, #8]");
    /* 0x00bc59a4: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00bc59a8: cbz      x8, #0xbc5904 */ if (x8 == 0) goto loc_00bc5904;
loc_00bc59ac:
    /* 0x00bc59ac: ldr      x0, [sp, #0x230] */ ARM64("ldr x0, [sp, #0x230]");
    /* 0x00bc59b0: cbz      x0, #0xbc59c0 */ if (x0 == 0) goto loc_00bc59c0;
    /* 0x00bc59b4: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00bc59b8: cbz      x8, #0xbc59c0 */ if (x8 == 0) goto loc_00bc59c0;
    /* 0x00bc59bc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc59c0:
    /* 0x00bc59c0: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00bc59c4: cbz      x0, #0xbc5904 */ if (x0 == 0) goto loc_00bc5904;
    /* 0x00bc59c8: ldr      x8, [sp, #0x260] */ ARM64("ldr x8, [sp, #0x260]");
    /* 0x00bc59cc: cbz      x8, #0xbc5904 */ if (x8 == 0) goto loc_00bc5904;
    /* 0x00bc59d0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc59d4: b        #0xbc5904 */ goto loc_00bc5904;
loc_00bc59d8:
    /* 0x00bc59d8: mov      w8, #2 */ ARM64("mov w8, #2");
    /* 0x00bc59dc: str      x8, [sp, #0x2d8] */ ARM64("str x8, [sp, #0x2d8]");
loc_00bc59e0:
    /* 0x00bc59e0: add      x0, x19, #0xb0 */ ARM64("add x0, x19, #0xb0");
    /* 0x00bc59e4: bl       #0xbcc0e8 */ CALL_DIRECT(sub_00bcc0e8);
    /* 0x00bc59e8: cbz      x0, #0xbc56c0 */ if (x0 == 0) goto loc_00bc56c0;
loc_00bc59ec:
    /* 0x00bc59ec: ldr      x22, [x0] */ ARM64("ldr x22, [x0]");
loc_00bc59f0:
    /* 0x00bc59f0: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc59f4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00bc59f8: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00bc59fc: cbnz     w10, #0xbc59f0 */ if (w10 != 0) goto loc_00bc59f0;
    /* 0x00bc5a00: tbnz     x8, #0x3f, #0xbc9508 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00bc9508;
    /* 0x00bc5a04: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc5a08: add      x9, x22, #8 */ ARM64("add x9, x22, #8");
    /* 0x00bc5a0c: mov      x10, #0xa95 */ ARM64("mov x10, #0xa95");
    /* 0x00bc5a10: movk     x10, #0x2722, lsl #16 */ ARM64("movk x10, #0x2722, lsl #16");
    /* 0x00bc5a14: movk     x10, #0xc1b7, lsl #32 */ ARM64("movk x10, #0xc1b7, lsl #32");
    /* 0x00bc5a18: movk     x10, #0x517c, lsl #48 */ ARM64("movk x10, #0x517c, lsl #48");
    /* 0x00bc5a1c: mul      x26, x9, x10 */ ARM64("mul x26, x9, x10");
    /* 0x00bc5a20: lsr      x24, x26, #0x39 */ ARM64("lsr x24, x26, #0x39");
    /* 0x00bc5a24: ldp      x10, x9, [sp, #0x1b0] */ ARM64("ldp x10, x9, [sp, #0x1b0]");
    /* 0x00bc5a28: dup      v0.8b, w24 */ ARM64("dup v0.8b, w24");
    /* 0x00bc5a2c: and      x11, x26, x9 */ ARM64("and x11, x26, x9");
    /* 0x00bc5a30: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc5a34: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc5a38: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc5a3c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc5a40: b.eq     #0xbc5a70 */ if (COND_EQ) goto loc_00bc5a70;
loc_00bc5a44:
    /* 0x00bc5a44: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00bc5a48: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00bc5a4c: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00bc5a50: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00bc5a54: sub      x20, x10, x13, lsl #4 */ ARM64("sub x20, x10, x13, lsl #4");
    /* 0x00bc5a58: ldur     x13, [x20, #-0x10] */ ARM64("ldur x13, [x20, #-0x10]");
    /* 0x00bc5a5c: cmp      x13, x22 */ ARM64("cmp x13, x22");
    /* 0x00bc5a60: b.eq     #0xbc5aa8 */ if (COND_EQ) goto loc_00bc5aa8;
    /* 0x00bc5a64: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00bc5a68: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00bc5a6c: b.ne     #0xbc5a44 */ if (COND_NE) goto loc_00bc5a44;
loc_00bc5a70:
    /* 0x00bc5a70: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc5a74: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc5a78: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc5a7c: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00bc5a80: tbnz     w12, #0, #0xbc5acc */ if (((w12 >> #0) & 1) != 0) goto loc_00bc5acc;
    /* 0x00bc5a84: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc5a88: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00bc5a8c: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc5a90: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc5a94: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc5a98: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc5a9c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc5aa0: b.ne     #0xbc5a44 */ if (COND_NE) goto loc_00bc5a44;
    /* 0x00bc5aa4: b        #0xbc5a70 */ goto loc_00bc5a70;
loc_00bc5aa8:
    /* 0x00bc5aa8: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc5aac: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc5ab0: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bc5ab4: cbnz     w9, #0xbc5aa8 */ if (w9 != 0) goto loc_00bc5aa8;
    /* 0x00bc5ab8: b.ne     #0xbc57ac */ if (COND_NE) goto loc_00bc57ac;
    /* 0x00bc5abc: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc5ac0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc5ac4: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc5ac8: b        #0xbc57ac */ goto loc_00bc57ac;
loc_00bc5acc:
    /* 0x00bc5acc: ldr      x8, [sp, #0x1c0] */ ARM64("ldr x8, [sp, #0x1c0]");
    /* 0x00bc5ad0: cbz      x8, #0xbc5b30 */ if (x8 == 0) goto loc_00bc5b30;
loc_00bc5ad4:
    /* 0x00bc5ad4: ldp      x8, x9, [sp, #0x1b0] */ ARM64("ldp x8, x9, [sp, #0x1b0]");
    /* 0x00bc5ad8: and      x10, x9, x26 */ ARM64("and x10, x9, x26");
    /* 0x00bc5adc: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00bc5ae0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00bc5ae4: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00bc5ae8: cbnz     x12, #0xbc5760 */ if (x12 != 0) goto loc_00bc5760;
    /* 0x00bc5aec: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00bc5af0:
    /* 0x00bc5af0: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00bc5af4: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00bc5af8: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00bc5afc: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00bc5b00: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00bc5b04: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00bc5b08: cbnz     x12, #0xbc5760 */ if (x12 != 0) goto loc_00bc5760;
    /* 0x00bc5b0c: b        #0xbc5af0 */ goto loc_00bc5af0;
loc_00bc5b10:
    /* 0x00bc5b10: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00bc5b14: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00bc5b18: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00bc5b1c: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00bc5b20: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00bc5b24: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00bc5b28: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00bc5b2c: b        #0xbc5778 */ goto loc_00bc5778;
loc_00bc5b30:
    /* 0x00bc5b30: add      x0, sp, #0x1b0 */ ARM64("add x0, sp, #0x1b0");
    /* 0x00bc5b34: add      x8, sp, #0x1b0 */ ARM64("add x8, sp, #0x1b0");
    /* 0x00bc5b38: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00bc5b3c: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00bc5b40: bl       #0xc70708 */ CALL_DIRECT(sub_00c70708);
    /* 0x00bc5b44: b        #0xbc5ad4 */ goto loc_00bc5ad4;
loc_00bc5b48:
    /* 0x00bc5b48: ldr      x13, [sp, #0x118] */ ARM64("ldr x13, [sp, #0x118]");
    /* 0x00bc5b4c: ldp      x22, x8, [x13, #0x20] */ ARM64("ldp x22, x8, [x13, #0x20]");
    /* 0x00bc5b50: str      x8, [sp, #0xc8] */ ARM64("str x8, [sp, #0xc8]");
    /* 0x00bc5b54: add      x15, x22, x8, lsl #5 */ ARM64("add x15, x22, x8, lsl #5");
    /* 0x00bc5b58: mov      x8, #0x6575 */ ARM64("mov x8, #0x6575");
    /* 0x00bc5b5c: movk     x8, #0x7073, lsl #16 */ ARM64("movk x8, #0x7073, lsl #16");
    /* 0x00bc5b60: movk     x8, #0x6d65, lsl #32 */ ARM64("movk x8, #0x6d65, lsl #32");
    /* 0x00bc5b64: movk     x8, #0x736f, lsl #48 */ ARM64("movk x8, #0x736f, lsl #48");
    /* 0x00bc5b68: ldr      x14, [sp, #0x170] */ ARM64("ldr x14, [sp, #0x170]");
    /* 0x00bc5b6c: ldp      x10, x9, [x14, #0x30] */ ARM64("ldp x10, x9, [x14, #0x30]");
    /* 0x00bc5b70: str      x10, [sp, #0x178] */ ARM64("str x10, [sp, #0x178]");
    /* 0x00bc5b74: eor      x8, x9, x8 */ ARM64("eor x8, x9, x8");
    /* 0x00bc5b78: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00bc5b7c: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00bc5b80: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00bc5b84: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00bc5b88: ldr      x11, [x14, #0x40] */ ARM64("ldr x11, [x14, #0x40]");
    /* 0x00bc5b8c: eor      x10, x11, x10 */ ARM64("eor x10, x11, x10");
    /* 0x00bc5b90: mov      x12, #0x7261 */ ARM64("mov x12, #0x7261");
    /* 0x00bc5b94: movk     x12, #0x6e65, lsl #16 */ ARM64("movk x12, #0x6e65, lsl #16");
    /* 0x00bc5b98: movk     x12, #0x6765, lsl #32 */ ARM64("movk x12, #0x6765, lsl #32");
    /* 0x00bc5b9c: movk     x12, #0x6c79, lsl #48 */ ARM64("movk x12, #0x6c79, lsl #48");
    /* 0x00bc5ba0: eor      x9, x9, x12 */ ARM64("eor x9, x9, x12");
    /* 0x00bc5ba4: str      x9, [sp, #0x140] */ ARM64("str x9, [sp, #0x140]");
    /* 0x00bc5ba8: mov      x9, #0x6573 */ ARM64("mov x9, #0x6573");
    /* 0x00bc5bac: movk     x9, #0x7974, lsl #16 */ ARM64("movk x9, #0x7974, lsl #16");
    /* 0x00bc5bb0: movk     x9, #0x6462, lsl #32 */ ARM64("movk x9, #0x6462, lsl #32");
    /* 0x00bc5bb4: movk     x9, #0x7465, lsl #48 */ ARM64("movk x9, #0x7465, lsl #48");
    /* 0x00bc5bb8: eor      x9, x11, x9 */ ARM64("eor x9, x11, x9");
    /* 0x00bc5bbc: str      x9, [sp, #0x138] */ ARM64("str x9, [sp, #0x138]");
    /* 0x00bc5bc0: add      x8, x10, x8 */ ARM64("add x8, x10, x8");
    /* 0x00bc5bc4: eor      x9, x8, x10, ror #51 */ ARM64("eor x9, x8, x10, ror #51");
    /* 0x00bc5bc8: ror      x8, x8, #0x20 */ ARM64("ror x8, x8, #0x20");
    /* 0x00bc5bcc: stp      x8, x9, [sp, #0x128] */ ARM64("stp x8, x9, [sp, #0x128]");
    /* 0x00bc5bd0: ror      x8, x9, #0x2f */ ARM64("ror x8, x9, #0x2f");
    /* 0x00bc5bd4: str      x8, [sp, #0x120] */ ARM64("str x8, [sp, #0x120]");
    /* 0x00bc5bd8: ldp      x10, x8, [x14, #8] */ ARM64("ldp x10, x8, [x14, #8]");
    /* 0x00bc5bdc: stp      x10, x8, [sp, #0xd0] */ ARM64("stp x10, x8, [sp, #0xd0]");
    /* 0x00bc5be0: ldp      x10, x8, [x14, #0x18] */ ARM64("ldp x10, x8, [x14, #0x18]");
    /* 0x00bc5be4: stp      x8, x10, [sp, #0x180] */ ARM64("stp x8, x10, [sp, #0x180]");
    /* 0x00bc5be8: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00bc5bec: ldr      x8, [x9, #0x18] */ ARM64("ldr x8, [x9, #0x18]");
    /* 0x00bc5bf0: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00bc5bf4: ldp      x8, x10, [x9] */ ARM64("ldp x8, x10, [x9]");
    /* 0x00bc5bf8: stp      x8, x10, [sp, #0x160] */ ARM64("stp x8, x10, [sp, #0x160]");
    /* 0x00bc5bfc: ldp      x10, x8, [x13, #0x38] */ ARM64("ldp x10, x8, [x13, #0x38]");
    /* 0x00bc5c00: str      x10, [sp, #0x110] */ ARM64("str x10, [sp, #0x110]");
    /* 0x00bc5c04: str      x8, [sp, #0x148] */ ARM64("str x8, [sp, #0x148]");
    /* 0x00bc5c08: adrp     x8, #0xefa000 */ ARM64("adrp x8, #0xefa000");
    /* 0x00bc5c0c: add      x8, x8, #0x120 */ ARM64("add x8, x8, #0x120");
    /* 0x00bc5c10: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
    /* 0x00bc5c14: adrp     x8, #0xe0e000 */ ARM64("adrp x8, #0xe0e000");
    /* 0x00bc5c18: ldr      q0, [x8, #0xa10] */ ARM64("ldr q0, [x8, #0xa10]");
    /* 0x00bc5c1c: str      q0, [sp, #0xa0] */ ARM64("str q0, [sp, #0xa0]");
    /* 0x00bc5c20: mov      x8, #0x5555555555555555 */ ARM64("mov x8, #0x5555555555555555");
    /* 0x00bc5c24: movk     x8, #0x5556 */ ARM64("movk x8, #0x5556");
    /* 0x00bc5c28: movk     x8, #0x555, lsl #48 */ ARM64("movk x8, #0x555, lsl #48");
    /* 0x00bc5c2c: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00bc5c30: str      x8, [sp, #0xb8] */ ARM64("str x8, [sp, #0xb8]");
    /* 0x00bc5c34: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c38: add      x8, x8, #0xfe8 */ ARM64("add x8, x8, #0xfe8");
    /* 0x00bc5c3c: str      x8, [sp, #0x98] */ ARM64("str x8, [sp, #0x98]");
    /* 0x00bc5c40: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c44: add      x10, x8, #0xaf0 */ ARM64("add x10, x8, #0xaf0");
    /* 0x00bc5c48: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c4c: add      x8, x8, #0xb08 */ ARM64("add x8, x8, #0xb08");
    /* 0x00bc5c50: stp      x10, x8, [sp, #0x68] */ ARM64("stp x10, x8, [sp, #0x68]");
    /* 0x00bc5c54: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c58: add      x10, x8, #0xbb0 */ ARM64("add x10, x8, #0xbb0");
    /* 0x00bc5c5c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c60: add      x8, x8, #0xbc8 */ ARM64("add x8, x8, #0xbc8");
    /* 0x00bc5c64: stp      x10, x8, [sp, #0x58] */ ARM64("stp x10, x8, [sp, #0x58]");
    /* 0x00bc5c68: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c6c: add      x10, x8, #0xd18 */ ARM64("add x10, x8, #0xd18");
    /* 0x00bc5c70: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c74: add      x8, x8, #0xe98 */ ARM64("add x8, x8, #0xe98");
    /* 0x00bc5c78: stp      x8, x10, [sp, #0x80] */ ARM64("stp x8, x10, [sp, #0x80]");
    /* 0x00bc5c7c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c80: add      x8, x8, #0xda8 */ ARM64("add x8, x8, #0xda8");
    /* 0x00bc5c84: str      x8, [sp, #0x50] */ ARM64("str x8, [sp, #0x50]");
    /* 0x00bc5c88: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc5c8c: add      x8, x8, #0xdc0 */ ARM64("add x8, x8, #0xdc0");
    /* 0x00bc5c90: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
    /* 0x00bc5c94: str      x22, [sp, #0x108] */ ARM64("str x22, [sp, #0x108]");
    /* 0x00bc5c98: str      x15, [sp, #0x1a8] */ ARM64("str x15, [sp, #0x1a8]");
loc_00bc5c9c:
    /* 0x00bc5c9c: str      x22, [sp, #0x3e0] */ ARM64("str x22, [sp, #0x3e0]");
    /* 0x00bc5ca0: str      x15, [sp, #0x3e8] */ ARM64("str x15, [sp, #0x3e8]");
    /* 0x00bc5ca4: str      xzr, [sp, #0x3f0] */ ARM64("str xzr, [sp, #0x3f0]");
    /* 0x00bc5ca8: add      x0, sp, #0x3c8 */ ARM64("add x0, sp, #0x3c8");
    /* 0x00bc5cac: add      x1, sp, #0x3e0 */ ARM64("add x1, sp, #0x3e0");
    /* 0x00bc5cb0: bl       #0xb9c8e4 */ CALL_DIRECT(sub_00b9c8e4);
    /* 0x00bc5cb4: ldr      x8, [sp, #0x3c8] */ ARM64("ldr x8, [sp, #0x3c8]");
    /* 0x00bc5cb8: str      x8, [sp, #0x190] */ ARM64("str x8, [sp, #0x190]");
    /* 0x00bc5cbc: ldr      x25, [sp, #0x3d0] */ ARM64("ldr x25, [sp, #0x3d0]");
    /* 0x00bc5cc0: ldr      x8, [sp, #0x3d8] */ ARM64("ldr x8, [sp, #0x3d8]");
    /* 0x00bc5cc4: cbz      x8, #0xbc8700 */ if (x8 == 0) goto loc_00bc8700;
    /* 0x00bc5cc8: add      x8, x25, x8, lsl #2 */ ARM64("add x8, x25, x8, lsl #2");
    /* 0x00bc5ccc: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
    /* 0x00bc5cd0: mov      x8, x25 */ ARM64("mov x8, x25");
    /* 0x00bc5cd4: str      x25, [sp, #0x1a0] */ ARM64("str x25, [sp, #0x1a0]");
loc_00bc5cd8:
    /* 0x00bc5cd8: mov      x9, x8 */ ARM64("mov x9, x8");
    /* 0x00bc5cdc: ldr      w8, [x9], #4 */ ARM64("ldr w8, [x9], #4");
    /* 0x00bc5ce0: str      x9, [sp, #0x150] */ ARM64("str x9, [sp, #0x150]");
    /* 0x00bc5ce4: ldr      x9, [sp, #0xc8] */ ARM64("ldr x9, [sp, #0xc8]");
    /* 0x00bc5ce8: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc5cec: b.ls     #0xbc96a8 */ if (COND_LS) goto loc_00bc96a8;
    /* 0x00bc5cf0: add      x20, x22, x8, lsl #5 */ ARM64("add x20, x22, x8, lsl #5");
    /* 0x00bc5cf4: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x00bc5cf8: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc5cfc: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc5d00: b.eq     #0xbc96a8 */ if (COND_EQ) goto loc_00bc96a8;
    /* 0x00bc5d04: ldr      x22, [x20, #0x10] */ ARM64("ldr x22, [x20, #0x10]");
    /* 0x00bc5d08: str      x20, [sp, #0x198] */ ARM64("str x20, [sp, #0x198]");
    /* 0x00bc5d0c: cbz      x22, #0xbc5ed4 */ if (x22 == 0) goto loc_00bc5ed4;
    /* 0x00bc5d10: add      x8, x22, x22, lsl #1 */ ARM64("add x8, x22, x22, lsl #1");
    /* 0x00bc5d14: lsl      x20, x8, #3 */ ARM64("lsl x20, x8, #3");
    /* 0x00bc5d18: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc5d1c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00bc5d20: cbz      x0, #0xbc95d4 */ if (x0 == 0) goto loc_00bc95d4;
    /* 0x00bc5d24: str      x22, [sp, #0x3f8] */ ARM64("str x22, [sp, #0x3f8]");
    /* 0x00bc5d28: str      x0, [sp, #0x400] */ ARM64("str x0, [sp, #0x400]");
    /* 0x00bc5d2c: str      xzr, [sp, #0x408] */ ARM64("str xzr, [sp, #0x408]");
    /* 0x00bc5d30: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc5d34: ldr      x24, [x8, #8]! */ ARM64("ldr x24, [x8, #8]!");
    /* 0x00bc5d38: str      x8, [sp, #0x158] */ ARM64("str x8, [sp, #0x158]");
    /* 0x00bc5d3c: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00bc5d40: madd     x22, x22, x8, x24 */ ARM64("madd x22, x22, x8, x24");
loc_00bc5d44:
    /* 0x00bc5d44: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc5d48: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00bc5d4c: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc5d50: ldp      x20, x23, [sp, #0x1d0] */ ARM64("ldp x20, x23, [sp, #0x1d0]");
    /* 0x00bc5d54: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc5d58: mov      x26, x23 */ ARM64("mov x26, x23");
    /* 0x00bc5d5c: cbz      x8, #0xbc5e68 */ if (x8 == 0) goto loc_00bc5e68;
    /* 0x00bc5d60: add      x27, x23, x8, lsl #3 */ ARM64("add x27, x23, x8, lsl #3");
    /* 0x00bc5d64: mov      x25, x23 */ ARM64("mov x25, x23");
    /* 0x00bc5d68: mov      x26, x23 */ ARM64("mov x26, x23");
    /* 0x00bc5d6c: b        #0xbc5d78 */ goto loc_00bc5d78;
loc_00bc5d70:
    /* 0x00bc5d70: cmp      x25, x27 */ ARM64("cmp x25, x27");
    /* 0x00bc5d74: b.eq     #0xbc5e68 */ if (COND_EQ) goto loc_00bc5e68;
loc_00bc5d78:
    /* 0x00bc5d78: ldr      x8, [sp, #0x1c8] */ ARM64("ldr x8, [sp, #0x1c8]");
    /* 0x00bc5d7c: cbz      x8, #0xbc94d8 */ if (x8 == 0) goto loc_00bc94d8;
    /* 0x00bc5d80: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc5d84: ldr      x28, [x25], #8 */ ARM64("ldr x28, [x25], #8");
    /* 0x00bc5d88: ldr      x1, [x28] */ ARM64("ldr x1, [x28]");
    /* 0x00bc5d8c: add      x9, x1, #8 */ ARM64("add x9, x1, #8");
    /* 0x00bc5d90: mov      x10, #0xa95 */ ARM64("mov x10, #0xa95");
    /* 0x00bc5d94: movk     x10, #0x2722, lsl #16 */ ARM64("movk x10, #0x2722, lsl #16");
    /* 0x00bc5d98: movk     x10, #0xc1b7, lsl #32 */ ARM64("movk x10, #0xc1b7, lsl #32");
    /* 0x00bc5d9c: movk     x10, #0x517c, lsl #48 */ ARM64("movk x10, #0x517c, lsl #48");
    /* 0x00bc5da0: mul      x11, x9, x10 */ ARM64("mul x11, x9, x10");
    /* 0x00bc5da4: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00bc5da8: ldp      x10, x9, [sp, #0x1b0] */ ARM64("ldp x10, x9, [sp, #0x1b0]");
    /* 0x00bc5dac: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00bc5db0: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc5db4: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc5db8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc5dbc: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc5dc0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc5dc4: b.eq     #0xbc5df4 */ if (COND_EQ) goto loc_00bc5df4;
loc_00bc5dc8:
    /* 0x00bc5dc8: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00bc5dcc: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00bc5dd0: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00bc5dd4: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00bc5dd8: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00bc5ddc: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00bc5de0: cmp      x1, x14 */ ARM64("cmp x1, x14");
    /* 0x00bc5de4: b.eq     #0xbc5e2c */ if (COND_EQ) goto loc_00bc5e2c;
    /* 0x00bc5de8: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00bc5dec: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00bc5df0: b.ne     #0xbc5dc8 */ if (COND_NE) goto loc_00bc5dc8;
loc_00bc5df4:
    /* 0x00bc5df4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc5df8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc5dfc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc5e00: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00bc5e04: tbnz     w12, #0, #0xbc94d8 */ if (((w12 >> #0) & 1) != 0) goto loc_00bc94d8;
    /* 0x00bc5e08: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc5e0c: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00bc5e10: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc5e14: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc5e18: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc5e1c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc5e20: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc5e24: b.ne     #0xbc5dc8 */ if (COND_NE) goto loc_00bc5dc8;
    /* 0x00bc5e28: b        #0xbc5df4 */ goto loc_00bc5df4;
loc_00bc5e2c:
    /* 0x00bc5e2c: ldur     x8, [x13, #-8] */ ARM64("ldur x8, [x13, #-8]");
    /* 0x00bc5e30: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc5e34: b.ne     #0xbc5d70 */ if (COND_NE) goto loc_00bc5d70;
    /* 0x00bc5e38: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00bc5e3c: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00bc5e40: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00bc5e44: b.eq     #0xbc5d70 */ if (COND_EQ) goto loc_00bc5d70;
    /* 0x00bc5e48: ldr      x8, [x28] */ ARM64("ldr x8, [x28]");
loc_00bc5e4c:
    /* 0x00bc5e4c: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc5e50: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00bc5e54: stxr     w11, x10, [x8] */ ARM64("stxr w11, x10, [x8]");
    /* 0x00bc5e58: cbnz     w11, #0xbc5e4c */ if (w11 != 0) goto loc_00bc5e4c;
    /* 0x00bc5e5c: tbnz     x9, #0x3f, #0xbc9508 */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00bc9508;
    /* 0x00bc5e60: str      x8, [x26], #8 */ ARM64("str x8, [x26], #8");
    /* 0x00bc5e64: b        #0xbc5d70 */ goto loc_00bc5d70;
loc_00bc5e68:
    /* 0x00bc5e68: sub      x8, x26, x23 */ ARM64("sub x8, x26, x23");
    /* 0x00bc5e6c: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00bc5e70: stp      x20, x23, [sp, #0x1d0] */ ARM64("stp x20, x23, [sp, #0x1d0]");
    /* 0x00bc5e74: str      x8, [sp, #0x1e0] */ ARM64("str x8, [sp, #0x1e0]");
    /* 0x00bc5e78: ldr      x20, [sp, #0x408] */ ARM64("ldr x20, [sp, #0x408]");
    /* 0x00bc5e7c: ldr      x8, [sp, #0x3f8] */ ARM64("ldr x8, [sp, #0x3f8]");
    /* 0x00bc5e80: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00bc5e84: b.ne     #0xbc5e90 */ if (COND_NE) goto loc_00bc5e90;
    /* 0x00bc5e88: add      x0, sp, #0x3f8 */ ARM64("add x0, sp, #0x3f8");
    /* 0x00bc5e8c: bl       #0xc6c3c4 */ CALL_DIRECT(sub_00c6c3c4);
loc_00bc5e90:
    /* 0x00bc5e90: add      x24, x24, #0x108 */ ARM64("add x24, x24, #0x108");
    /* 0x00bc5e94: ldr      x8, [sp, #0x400] */ ARM64("ldr x8, [sp, #0x400]");
    /* 0x00bc5e98: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00bc5e9c: madd     x8, x20, x9, x8 */ ARM64("madd x8, x20, x9, x8");
    /* 0x00bc5ea0: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc5ea4: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc5ea8: ldr      x9, [sp, #0x1e0] */ ARM64("ldr x9, [sp, #0x1e0]");
    /* 0x00bc5eac: str      x9, [x8, #0x10] */ ARM64("str x9, [x8, #0x10]");
    /* 0x00bc5eb0: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00bc5eb4: str      x8, [sp, #0x408] */ ARM64("str x8, [sp, #0x408]");
    /* 0x00bc5eb8: cmp      x24, x22 */ ARM64("cmp x24, x22");
    /* 0x00bc5ebc: ldp      x20, x25, [sp, #0x198] */ ARM64("ldp x20, x25, [sp, #0x198]");
    /* 0x00bc5ec0: b.ne     #0xbc5d44 */ if (COND_NE) goto loc_00bc5d44;
    /* 0x00bc5ec4: ldr      x8, [x20, #0x10] */ ARM64("ldr x8, [x20, #0x10]");
    /* 0x00bc5ec8: cbz      x8, #0xbc5eec */ if (x8 == 0) goto loc_00bc5eec;
    /* 0x00bc5ecc: mov      x28, #0 */ ARM64("mov x28, #0");
    /* 0x00bc5ed0: b        #0xbc5ffc */ goto loc_00bc5ffc;
loc_00bc5ed4:
    /* 0x00bc5ed4: str      xzr, [sp, #0x3f8] */ ARM64("str xzr, [sp, #0x3f8]");
    /* 0x00bc5ed8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00bc5edc: str      x8, [sp, #0x400] */ ARM64("str x8, [sp, #0x400]");
    /* 0x00bc5ee0: add      x8, x20, #8 */ ARM64("add x8, x20, #8");
    /* 0x00bc5ee4: str      x8, [sp, #0x158] */ ARM64("str x8, [sp, #0x158]");
    /* 0x00bc5ee8: str      xzr, [sp, #0x408] */ ARM64("str xzr, [sp, #0x408]");
loc_00bc5eec:
    /* 0x00bc5eec: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x00bc5ef0: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc5ef4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc5ef8: b.ne     #0xbc5f10 */ if (COND_NE) goto loc_00bc5f10;
    /* 0x00bc5efc: mov      w22, #-1 */ ARM64("mov w22, #-1");
    /* 0x00bc5f00: ldr      x8, [sp, #0x148] */ ARM64("ldr x8, [sp, #0x148]");
    /* 0x00bc5f04: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00bc5f08: b.hi     #0xbc5f20 */ if (COND_HI) goto loc_00bc5f20;
    /* 0x00bc5f0c: b        #0xbc5f3c */ goto loc_00bc5f3c;
loc_00bc5f10:
    /* 0x00bc5f10: ldr      w22, [x20, #0x18] */ ARM64("ldr w22, [x20, #0x18]");
    /* 0x00bc5f14: ldr      x8, [sp, #0x148] */ ARM64("ldr x8, [sp, #0x148]");
    /* 0x00bc5f18: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00bc5f1c: b.ls     #0xbc5f3c */ if (COND_LS) goto loc_00bc5f3c;
loc_00bc5f20:
    /* 0x00bc5f20: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00bc5f24: mov      w9, #0x30 */ ARM64("mov w9, #0x30");
    /* 0x00bc5f28: umaddl   x8, w22, w9, x8 */ ARM64("umaddl x8, w22, w9, x8");
    /* 0x00bc5f2c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc5f30: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc5f34: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc5f38: b.ne     #0xbc754c */ if (COND_NE) goto loc_00bc754c;
loc_00bc5f3c:
    /* 0x00bc5f3c: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00bc5f40: ldr      x22, [sp, #0x400] */ ARM64("ldr x22, [sp, #0x400]");
    /* 0x00bc5f44: ldr      x23, [sp, #0x408] */ ARM64("ldr x23, [sp, #0x408]");
loc_00bc5f48:
    /* 0x00bc5f48: cmp      x20, x23 */ ARM64("cmp x20, x23");
    /* 0x00bc5f4c: b.eq     #0xbc5fbc */ if (COND_EQ) goto loc_00bc5fbc;
    /* 0x00bc5f50: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00bc5f54: madd     x24, x20, x8, x22 */ ARM64("madd x24, x20, x8, x22");
    /* 0x00bc5f58: ldr      x25, [x24, #0x10] */ ARM64("ldr x25, [x24, #0x10]");
    /* 0x00bc5f5c: cbz      x25, #0xbc5fa4 */ if (x25 == 0) goto loc_00bc5fa4;
    /* 0x00bc5f60: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00bc5f64: ldr      x27, [x24, #8] */ ARM64("ldr x27, [x24, #8]");
    /* 0x00bc5f68: b        #0xbc5f78 */ goto loc_00bc5f78;
loc_00bc5f6c:
    /* 0x00bc5f6c: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00bc5f70: cmp      x26, x25 */ ARM64("cmp x26, x25");
    /* 0x00bc5f74: b.eq     #0xbc5fa4 */ if (COND_EQ) goto loc_00bc5fa4;
loc_00bc5f78:
    /* 0x00bc5f78: ldr      x8, [x27, x26, lsl #3] */ ARM64("ldr x8, [x27, x26, lsl #3]");
    /* 0x00bc5f7c: cbz      x8, #0xbc5f6c */ if (x8 == 0) goto loc_00bc5f6c;
loc_00bc5f80:
    /* 0x00bc5f80: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc5f84: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bc5f88: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bc5f8c: cbnz     w10, #0xbc5f80 */ if (w10 != 0) goto loc_00bc5f80;
    /* 0x00bc5f90: b.ne     #0xbc5f6c */ if (COND_NE) goto loc_00bc5f6c;
    /* 0x00bc5f94: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc5f98: ldr      x0, [x27, x26, lsl #3] */ ARM64("ldr x0, [x27, x26, lsl #3]");
    /* 0x00bc5f9c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc5fa0: b        #0xbc5f6c */ goto loc_00bc5f6c;
loc_00bc5fa4:
    /* 0x00bc5fa4: add      x20, x20, #1 */ ARM64("add x20, x20, #1");
    /* 0x00bc5fa8: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00bc5fac: cbz      x8, #0xbc5f48 */ if (x8 == 0) goto loc_00bc5f48;
    /* 0x00bc5fb0: ldr      x0, [x24, #8] */ ARM64("ldr x0, [x24, #8]");
    /* 0x00bc5fb4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc5fb8: b        #0xbc5f48 */ goto loc_00bc5f48;
loc_00bc5fbc:
    /* 0x00bc5fbc: ldr      x8, [sp, #0x3f8] */ ARM64("ldr x8, [sp, #0x3f8]");
    /* 0x00bc5fc0: cbz      x8, #0xbc5fcc */ if (x8 == 0) goto loc_00bc5fcc;
    /* 0x00bc5fc4: ldr      x0, [sp, #0x400] */ ARM64("ldr x0, [sp, #0x400]");
    /* 0x00bc5fc8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc5fcc:
    /* 0x00bc5fcc: ldr      x8, [sp, #0xb0] */ ARM64("ldr x8, [sp, #0xb0]");
    /* 0x00bc5fd0: ldr      x9, [sp, #0x150] */ ARM64("ldr x9, [sp, #0x150]");
    /* 0x00bc5fd4: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc5fd8: mov      x8, x9 */ ARM64("mov x8, x9");
    /* 0x00bc5fdc: ldr      x22, [sp, #0x108] */ ARM64("ldr x22, [sp, #0x108]");
    /* 0x00bc5fe0: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc5fe4: b.ne     #0xbc5cd8 */ if (COND_NE) goto loc_00bc5cd8;
    /* 0x00bc5fe8: b        #0xbc8700 */ goto loc_00bc8700;
loc_00bc5fec:
    /* 0x00bc5fec: add      x28, x28, #1 */ ARM64("add x28, x28, #1");
loc_00bc5ff0:
    /* 0x00bc5ff0: ldr      x8, [x20, #0x10] */ ARM64("ldr x8, [x20, #0x10]");
    /* 0x00bc5ff4: cmp      x28, x8 */ ARM64("cmp x28, x8");
    /* 0x00bc5ff8: b.hs     #0xbc5eec */ if (COND_HS) goto loc_00bc5eec;
loc_00bc5ffc:
    /* 0x00bc5ffc: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00bc6000: str      q1, [sp, #0x410] */ ARM64("str q1, [sp, #0x410]");
    /* 0x00bc6004: str      q0, [sp, #0x420] */ ARM64("str q0, [sp, #0x420]");
    /* 0x00bc6008: cbz      x28, #0xbc5fec */ if (x28 == 0) goto loc_00bc5fec;
    /* 0x00bc600c: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00bc6010: mov      x22, x28 */ ARM64("mov x22, x28");
loc_00bc6014:
    /* 0x00bc6014: ldr      x26, [sp, #0x408] */ ARM64("ldr x26, [sp, #0x408]");
    /* 0x00bc6018: cmp      x28, x26 */ ARM64("cmp x28, x26");
    /* 0x00bc601c: b.hs     #0xbc9928 */ if (COND_HS) goto loc_00bc9928;
    /* 0x00bc6020: sub      x22, x22, #1 */ ARM64("sub x22, x22, #1");
    /* 0x00bc6024: ldr      x11, [sp, #0x400] */ ARM64("ldr x11, [sp, #0x400]");
    /* 0x00bc6028: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00bc602c: madd     x27, x28, x8, x11 */ ARM64("madd x27, x28, x8, x11");
    /* 0x00bc6030: ldp      x8, x9, [x27, #8] */ ARM64("ldp x8, x9, [x27, #8]");
    /* 0x00bc6034: lsl      x9, x9, #3 */ ARM64("lsl x9, x9, #3");
loc_00bc6038:
    /* 0x00bc6038: cbz      x9, #0xbc6d58 */ if (x9 == 0) goto loc_00bc6d58;
    /* 0x00bc603c: ldr      x10, [x8], #8 */ ARM64("ldr x10, [x8], #8");
    /* 0x00bc6040: sub      x9, x9, #8 */ ARM64("sub x9, x9, #8");
    /* 0x00bc6044: cbz      x10, #0xbc6038 */ if (x10 == 0) goto loc_00bc6038;
    /* 0x00bc6048: str      x11, [sp, #0x40] */ ARM64("str x11, [sp, #0x40]");
    /* 0x00bc604c: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6050: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00bc6054: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc6058: b.hs     #0xbc9940 */ if (COND_HS) goto loc_00bc9940;
    /* 0x00bc605c: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6060: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6064: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6068: madd     x1, x22, x9, x8 */ ARM64("madd x1, x22, x9, x8");
    /* 0x00bc606c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc6070: bl       #0xbca948 */ CALL_DIRECT(sub_00bca948);
    /* 0x00bc6074: str      x22, [sp, #0x48] */ ARM64("str x22, [sp, #0x48]");
    /* 0x00bc6078: ldp      x22, x23, [sp, #0x1d0] */ ARM64("ldp x22, x23, [sp, #0x1d0]");
    /* 0x00bc607c: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc6080: cbz      x8, #0xbc6230 */ if (x8 == 0) goto loc_00bc6230;
    /* 0x00bc6084: add      x8, x23, x8, lsl #3 */ ARM64("add x8, x23, x8, lsl #3");
    /* 0x00bc6088: mov      x9, x23 */ ARM64("mov x9, x23");
    /* 0x00bc608c: b        #0xbc6130 */ goto loc_00bc6130;
loc_00bc6090:
    /* 0x00bc6090: ldp      x15, x14, [sp, #0x180] */ ARM64("ldp x15, x14, [sp, #0x180]");
    /* 0x00bc6094: and      x13, x13, x15 */ ARM64("and x13, x13, x15");
    /* 0x00bc6098: ldr      x14, [x14, x13] */ ARM64("ldr x14, [x14, x13]");
    /* 0x00bc609c: eor      x15, x14, x12 */ ARM64("eor x15, x14, x12");
    /* 0x00bc60a0: mov      x16, #-0x101010101010102 */ ARM64("mov x16, #-0x101010101010102");
    /* 0x00bc60a4: movk     x16, #0xfeff */ ARM64("movk x16, #0xfeff");
    /* 0x00bc60a8: add      x16, x15, x16 */ ARM64("add x16, x15, x16");
    /* 0x00bc60ac: bic      x15, x16, x15 */ ARM64("bic x15, x16, x15");
    /* 0x00bc60b0: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc60b4: b.eq     #0xbc6108 */ if (COND_EQ) goto loc_00bc6108;
loc_00bc60b8:
    /* 0x00bc60b8: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc60bc: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc60c0: add      x16, x13, x16, lsr #3 */ ARM64("add x16, x13, x16, lsr #3");
    /* 0x00bc60c4: ldr      x17, [sp, #0x180] */ ARM64("ldr x17, [sp, #0x180]");
    /* 0x00bc60c8: and      x16, x16, x17 */ ARM64("and x16, x16, x17");
    /* 0x00bc60cc: ldr      x17, [sp, #0x188] */ ARM64("ldr x17, [sp, #0x188]");
    /* 0x00bc60d0: sub      x16, x17, x16, lsl #3 */ ARM64("sub x16, x17, x16, lsl #3");
    /* 0x00bc60d4: ldur     x0, [x16, #-8] */ ARM64("ldur x0, [x16, #-8]");
    /* 0x00bc60d8: ldr      x16, [sp, #0xd8] */ ARM64("ldr x16, [sp, #0xd8]");
    /* 0x00bc60dc: cmp      x0, x16 */ ARM64("cmp x0, x16");
    /* 0x00bc60e0: b.hs     #0xbc97f8 */ if (COND_HS) goto loc_00bc97f8;
    /* 0x00bc60e4: mov      w16, #0x18 */ ARM64("mov w16, #0x18");
    /* 0x00bc60e8: mul      x16, x0, x16 */ ARM64("mul x16, x0, x16");
    /* 0x00bc60ec: ldr      x17, [sp, #0xd0] */ ARM64("ldr x17, [sp, #0xd0]");
    /* 0x00bc60f0: ldr      x16, [x17, x16] */ ARM64("ldr x16, [x17, x16]");
    /* 0x00bc60f4: cmp      x11, x16 */ ARM64("cmp x11, x16");
    /* 0x00bc60f8: b.eq     #0xbc6120 */ if (COND_EQ) goto loc_00bc6120;
    /* 0x00bc60fc: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc6100: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc6104: b.ne     #0xbc60b8 */ if (COND_NE) goto loc_00bc60b8;
loc_00bc6108:
    /* 0x00bc6108: and      x14, x14, x14, lsl #1 */ ARM64("and x14, x14, x14, lsl #1");
    /* 0x00bc610c: tst      x14, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x14, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc6110: b.ne     #0xbc6124 */ if (COND_NE) goto loc_00bc6124;
    /* 0x00bc6114: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00bc6118: add      x13, x13, x10 */ ARM64("add x13, x13, x10");
    /* 0x00bc611c: b        #0xbc6090 */ goto loc_00bc6090;
loc_00bc6120:
    /* 0x00bc6120: mov      w20, #0 */ ARM64("mov w20, #0");
loc_00bc6124:
    /* 0x00bc6124: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00bc6128: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc612c: b.eq     #0xbc6230 */ if (COND_EQ) goto loc_00bc6230;
loc_00bc6130:
    /* 0x00bc6130: ldr      x10, [sp, #0x178] */ ARM64("ldr x10, [sp, #0x178]");
    /* 0x00bc6134: cbz      x10, #0xbc6124 */ if (x10 == 0) goto loc_00bc6124;
    /* 0x00bc6138: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc613c: ldr      x11, [x9] */ ARM64("ldr x11, [x9]");
    /* 0x00bc6140: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc6144: add      x12, x11, #8 */ ARM64("add x12, x11, #8");
    /* 0x00bc6148: ldp      x13, x14, [sp, #0x138] */ ARM64("ldp x13, x14, [sp, #0x138]");
    /* 0x00bc614c: eor      x13, x13, x12 */ ARM64("eor x13, x13, x12");
    /* 0x00bc6150: add      x14, x13, x14 */ ARM64("add x14, x13, x14");
    /* 0x00bc6154: eor      x13, x14, x13, ror #48 */ ARM64("eor x13, x14, x13, ror #48");
    /* 0x00bc6158: ldp      x15, x16, [sp, #0x128] */ ARM64("ldp x15, x16, [sp, #0x128]");
    /* 0x00bc615c: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc6160: eor      x12, x15, x12 */ ARM64("eor x12, x15, x12");
    /* 0x00bc6164: add      x14, x14, x16 */ ARM64("add x14, x14, x16");
    /* 0x00bc6168: eor      x13, x15, x13, ror #43 */ ARM64("eor x13, x15, x13, ror #43");
    /* 0x00bc616c: ror      x15, x14, #0x20 */ ARM64("ror x15, x14, #0x20");
    /* 0x00bc6170: ldr      x16, [sp, #0x120] */ ARM64("ldr x16, [sp, #0x120]");
    /* 0x00bc6174: eor      x14, x14, x16 */ ARM64("eor x14, x14, x16");
    /* 0x00bc6178: eor      x13, x13, #0x800000000000000 */ ARM64("eor x13, x13, #0x800000000000000");
    /* 0x00bc617c: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc6180: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc6184: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc6188: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc618c: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc6190: add      x15, x15, x14 */ ARM64("add x15, x15, x14");
    /* 0x00bc6194: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc6198: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc619c: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc61a0: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc61a4: eor      x12, x12, #0x800000000000000 */ ARM64("eor x12, x12, #0x800000000000000");
    /* 0x00bc61a8: eor      x15, x15, #0xff */ ARM64("eor x15, x15, #0xff");
    /* 0x00bc61ac: add      x12, x12, x14 */ ARM64("add x12, x12, x14");
    /* 0x00bc61b0: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc61b4: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc61b8: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc61bc: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc61c0: add      x15, x14, x15 */ ARM64("add x15, x14, x15");
    /* 0x00bc61c4: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc61c8: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc61cc: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc61d0: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc61d4: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc61d8: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc61dc: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc61e0: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc61e4: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc61e8: add      x15, x14, x15 */ ARM64("add x15, x14, x15");
    /* 0x00bc61ec: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc61f0: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc61f4: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc61f8: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc61fc: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc6200: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc6204: eor      x12, x12, x14, ror #51 */ ARM64("eor x12, x12, x14, ror #51");
    /* 0x00bc6208: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc620c: ror      x13, x13, #0x2b */ ARM64("ror x13, x13, #0x2b");
    /* 0x00bc6210: add      x14, x12, x15 */ ARM64("add x14, x12, x15");
    /* 0x00bc6214: eor      x12, x13, x12, ror #47 */ ARM64("eor x12, x13, x12, ror #47");
    /* 0x00bc6218: eor      x12, x12, x14, ror #32 */ ARM64("eor x12, x12, x14, ror #32");
    /* 0x00bc621c: eor      x13, x12, x14 */ ARM64("eor x13, x12, x14");
    /* 0x00bc6220: lsr      x12, x13, #0x39 */ ARM64("lsr x12, x13, #0x39");
    /* 0x00bc6224: mov      x14, #0x101010101010101 */ ARM64("mov x14, #0x101010101010101");
    /* 0x00bc6228: mul      x12, x12, x14 */ ARM64("mul x12, x12, x14");
    /* 0x00bc622c: b        #0xbc6090 */ goto loc_00bc6090;
loc_00bc6230:
    /* 0x00bc6230: cbz      x22, #0xbc623c */ if (x22 == 0) goto loc_00bc623c;
    /* 0x00bc6234: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc6238: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc623c:
    /* 0x00bc623c: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6240: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00bc6244: ldr      x22, [sp, #0x48] */ ARM64("ldr x22, [sp, #0x48]");
    /* 0x00bc6248: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc624c: b.hs     #0xbc9954 */ if (COND_HS) goto loc_00bc9954;
    /* 0x00bc6250: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6254: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6258: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc625c: madd     x1, x22, x9, x8 */ ARM64("madd x1, x22, x9, x8");
    /* 0x00bc6260: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc6264: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc6268: ldp      x8, x0, [sp, #0x1d0] */ ARM64("ldp x8, x0, [sp, #0x1d0]");
    /* 0x00bc626c: ldr      x9, [sp, #0x1e0] */ ARM64("ldr x9, [sp, #0x1e0]");
    /* 0x00bc6270: cbz      x9, #0xbc63e0 */ if (x9 == 0) goto loc_00bc63e0;
    /* 0x00bc6274: ldr      x10, [sp, #0xc0] */ ARM64("ldr x10, [sp, #0xc0]");
    /* 0x00bc6278: cbz      x10, #0xbc63e0 */ if (x10 == 0) goto loc_00bc63e0;
    /* 0x00bc627c: add      x9, x0, x9, lsl #3 */ ARM64("add x9, x0, x9, lsl #3");
    /* 0x00bc6280: ldr      x10, [sp, #0x428] */ ARM64("ldr x10, [sp, #0x428]");
    /* 0x00bc6284: mov      x11, x0 */ ARM64("mov x11, x0");
    /* 0x00bc6288: ldr      x12, [sp, #0x418] */ ARM64("ldr x12, [sp, #0x418]");
    /* 0x00bc628c: ldr      x13, [sp, #0x410] */ ARM64("ldr x13, [sp, #0x410]");
    /* 0x00bc6290: b        #0xbc63b0 */ goto loc_00bc63b0;
loc_00bc6294:
    /* 0x00bc6294: ldr      x17, [sp, #0x168] */ ARM64("ldr x17, [sp, #0x168]");
    /* 0x00bc6298: and      x16, x16, x17 */ ARM64("and x16, x16, x17");
    /* 0x00bc629c: ldr      x17, [sp, #0x160] */ ARM64("ldr x17, [sp, #0x160]");
    /* 0x00bc62a0: ldr      d1, [x17, x16] */ ARM64("ldr d1, [x17, x16]");
    /* 0x00bc62a4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc62a8: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc62ac: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc62b0: b.eq     #0xbc62e4 */ if (COND_EQ) goto loc_00bc62e4;
loc_00bc62b4:
    /* 0x00bc62b4: rbit     x1, x17 */ ARM64("rbit x1, x17");
    /* 0x00bc62b8: clz      x1, x1 */ ARM64("clz x1, x1");
    /* 0x00bc62bc: add      x1, x16, x1, lsr #3 */ ARM64("add x1, x16, x1, lsr #3");
    /* 0x00bc62c0: ldp      x2, x3, [sp, #0x160] */ ARM64("ldp x2, x3, [sp, #0x160]");
    /* 0x00bc62c4: and      x1, x1, x3 */ ARM64("and x1, x1, x3");
    /* 0x00bc62c8: sub      x1, x2, x1, lsl #4 */ ARM64("sub x1, x2, x1, lsl #4");
    /* 0x00bc62cc: ldur     x2, [x1, #-0x10] */ ARM64("ldur x2, [x1, #-0x10]");
    /* 0x00bc62d0: cmp      x15, x2 */ ARM64("cmp x15, x2");
    /* 0x00bc62d4: b.eq     #0xbc6304 */ if (COND_EQ) goto loc_00bc6304;
    /* 0x00bc62d8: sub      x1, x17, #1 */ ARM64("sub x1, x17, #1");
    /* 0x00bc62dc: ands     x17, x1, x17 */ ARM64("ands x17, x1, x17");
    /* 0x00bc62e0: b.ne     #0xbc62b4 */ if (COND_NE) goto loc_00bc62b4;
loc_00bc62e4:
    /* 0x00bc62e4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc62e8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc62ec: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc62f0: fmov     w17, s1 */ ARM64("fmov w17, s1");
    /* 0x00bc62f4: tbnz     w17, #0, #0xbc63a8 */ if (((w17 >> #0) & 1) != 0) goto loc_00bc63a8;
    /* 0x00bc62f8: add      x14, x14, #8 */ ARM64("add x14, x14, #8");
    /* 0x00bc62fc: add      x16, x16, x14 */ ARM64("add x16, x16, x14");
    /* 0x00bc6300: b        #0xbc6294 */ goto loc_00bc6294;
loc_00bc6304:
    /* 0x00bc6304: cbz      x10, #0xbc63a8 */ if (x10 == 0) goto loc_00bc63a8;
    /* 0x00bc6308: mov      x14, #0 */ ARM64("mov x14, #0");
    /* 0x00bc630c: ldur     x15, [x1, #-8] */ ARM64("ldur x15, [x1, #-8]");
    /* 0x00bc6310: mov      x16, #0xa95 */ ARM64("mov x16, #0xa95");
    /* 0x00bc6314: movk     x16, #0x2722, lsl #16 */ ARM64("movk x16, #0x2722, lsl #16");
    /* 0x00bc6318: movk     x16, #0xc1b7, lsl #32 */ ARM64("movk x16, #0xc1b7, lsl #32");
    /* 0x00bc631c: movk     x16, #0x517c, lsl #48 */ ARM64("movk x16, #0x517c, lsl #48");
    /* 0x00bc6320: mul      x16, x15, x16 */ ARM64("mul x16, x15, x16");
    /* 0x00bc6324: lsr      x17, x16, #0x39 */ ARM64("lsr x17, x16, #0x39");
    /* 0x00bc6328: dup      v0.8b, w17 */ ARM64("dup v0.8b, w17");
    /* 0x00bc632c: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc6330: ldr      d1, [x13, x16] */ ARM64("ldr d1, [x13, x16]");
    /* 0x00bc6334: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc6338: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc633c: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc6340: b.eq     #0xbc6370 */ if (COND_EQ) goto loc_00bc6370;
loc_00bc6344:
    /* 0x00bc6344: rbit     x1, x17 */ ARM64("rbit x1, x17");
    /* 0x00bc6348: clz      x1, x1 */ ARM64("clz x1, x1");
    /* 0x00bc634c: add      x1, x16, x1, lsr #3 */ ARM64("add x1, x16, x1, lsr #3");
    /* 0x00bc6350: and      x1, x1, x12 */ ARM64("and x1, x1, x12");
    /* 0x00bc6354: sub      x1, x13, x1, lsl #3 */ ARM64("sub x1, x13, x1, lsl #3");
    /* 0x00bc6358: ldur     x1, [x1, #-8] */ ARM64("ldur x1, [x1, #-8]");
    /* 0x00bc635c: cmp      x15, x1 */ ARM64("cmp x15, x1");
    /* 0x00bc6360: b.eq     #0xbc64dc */ if (COND_EQ) goto loc_00bc64dc;
    /* 0x00bc6364: sub      x1, x17, #1 */ ARM64("sub x1, x17, #1");
    /* 0x00bc6368: ands     x17, x1, x17 */ ARM64("ands x17, x1, x17");
    /* 0x00bc636c: b.ne     #0xbc6344 */ if (COND_NE) goto loc_00bc6344;
loc_00bc6370:
    /* 0x00bc6370: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc6374: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc6378: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc637c: fmov     w17, s1 */ ARM64("fmov w17, s1");
    /* 0x00bc6380: tbnz     w17, #0, #0xbc63a8 */ if (((w17 >> #0) & 1) != 0) goto loc_00bc63a8;
    /* 0x00bc6384: add      x14, x14, #8 */ ARM64("add x14, x14, #8");
    /* 0x00bc6388: add      x16, x16, x14 */ ARM64("add x16, x16, x14");
    /* 0x00bc638c: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc6390: ldr      d1, [x13, x16] */ ARM64("ldr d1, [x13, x16]");
    /* 0x00bc6394: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc6398: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc639c: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc63a0: b.ne     #0xbc6344 */ if (COND_NE) goto loc_00bc6344;
    /* 0x00bc63a4: b        #0xbc6370 */ goto loc_00bc6370;
loc_00bc63a8:
    /* 0x00bc63a8: cmp      x11, x9 */ ARM64("cmp x11, x9");
    /* 0x00bc63ac: b.eq     #0xbc63e0 */ if (COND_EQ) goto loc_00bc63e0;
loc_00bc63b0:
    /* 0x00bc63b0: mov      x14, #0 */ ARM64("mov x14, #0");
    /* 0x00bc63b4: ldr      x15, [x11], #8 */ ARM64("ldr x15, [x11], #8");
    /* 0x00bc63b8: ldr      x15, [x15] */ ARM64("ldr x15, [x15]");
    /* 0x00bc63bc: add      x16, x15, #8 */ ARM64("add x16, x15, #8");
    /* 0x00bc63c0: mov      x17, #0xa95 */ ARM64("mov x17, #0xa95");
    /* 0x00bc63c4: movk     x17, #0x2722, lsl #16 */ ARM64("movk x17, #0x2722, lsl #16");
    /* 0x00bc63c8: movk     x17, #0xc1b7, lsl #32 */ ARM64("movk x17, #0xc1b7, lsl #32");
    /* 0x00bc63cc: movk     x17, #0x517c, lsl #48 */ ARM64("movk x17, #0x517c, lsl #48");
    /* 0x00bc63d0: mul      x16, x16, x17 */ ARM64("mul x16, x16, x17");
    /* 0x00bc63d4: lsr      x17, x16, #0x39 */ ARM64("lsr x17, x16, #0x39");
    /* 0x00bc63d8: dup      v0.8b, w17 */ ARM64("dup v0.8b, w17");
    /* 0x00bc63dc: b        #0xbc6294 */ goto loc_00bc6294;
loc_00bc63e0:
    /* 0x00bc63e0: cbz      x8, #0xbc63e8 */ if (x8 == 0) goto loc_00bc63e8;
    /* 0x00bc63e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc63e8:
    /* 0x00bc63e8: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc63ec: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00bc63f0: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc63f4: b.hs     #0xbc99c4 */ if (COND_HS) goto loc_00bc99c4;
    /* 0x00bc63f8: ldr      x9, [sp, #0x158] */ ARM64("ldr x9, [sp, #0x158]");
    /* 0x00bc63fc: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00bc6400: mov      w10, #0x108 */ ARM64("mov w10, #0x108");
    /* 0x00bc6404: madd     x24, x22, x10, x9 */ ARM64("madd x24, x22, x10, x9");
    /* 0x00bc6408: ldr      x9, [x24, #0x18] */ ARM64("ldr x9, [x24, #0x18]");
    /* 0x00bc640c: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc6410: b.ne     #0xbc6aa4 */ if (COND_NE) goto loc_00bc6aa4;
    /* 0x00bc6414: ldr      x8, [x24, #0x48] */ ARM64("ldr x8, [x24, #0x48]");
    /* 0x00bc6418: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc641c: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc6420: ldr      x22, [x24, #0x40] */ ARM64("ldr x22, [x24, #0x40]");
    /* 0x00bc6424: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00bc6428: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00bc642c: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc6430: add      x11, x11, #0x5ce */ ARM64("add x11, x11, #0x5ce");
    /* 0x00bc6434: adr      x9, #0xbc6444 */ ARM64("adr x9, #0xbc6444");
    /* 0x00bc6438: ldrb     w10, [x11, x8] */ ARM64("ldrb w10, [x11, x8]");
    /* 0x00bc643c: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc6440: br       x9 */ ARM64("br x9");
loc_00bc6444:
    /* 0x00bc6444: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc6448: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00bc644c: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00bc6450: str      x28, [sp, #0x38] */ ARM64("str x28, [sp, #0x38]");
    /* 0x00bc6454: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00bc6458: ldp      x22, x8, [sp, #0x1d8] */ ARM64("ldp x22, x8, [sp, #0x1d8]");
    /* 0x00bc645c: lsl      x28, x8, #3 */ ARM64("lsl x28, x8, #3");
loc_00bc6460:
    /* 0x00bc6460: cmp      x28, x25 */ ARM64("cmp x28, x25");
    /* 0x00bc6464: cset     w23, ne */ ARM64("cset w23, ne");
    /* 0x00bc6468: b.eq     #0xbc6488 */ if (COND_EQ) goto loc_00bc6488;
    /* 0x00bc646c: ldr      x8, [x22, x25] */ ARM64("ldr x8, [x22, x25]");
    /* 0x00bc6470: ldr      x1, [x8] */ ARM64("ldr x1, [x8]");
    /* 0x00bc6474: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00bc6478: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00bc647c: add      x25, x25, #8 */ ARM64("add x25, x25, #8");
    /* 0x00bc6480: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00bc6484: b.ne     #0xbc6460 */ if (COND_NE) goto loc_00bc6460;
loc_00bc6488:
    /* 0x00bc6488: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc648c: ldr      x28, [sp, #0x38] */ ARM64("ldr x28, [sp, #0x38]");
    /* 0x00bc6490: cbz      x8, #0xbc649c */ if (x8 == 0) goto loc_00bc649c;
    /* 0x00bc6494: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc6498: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc649c:
    /* 0x00bc649c: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
loc_00bc64a0:
    /* 0x00bc64a0: orn      w8, w20, w23 */ ARM64("orn w8, w20, w23");
    /* 0x00bc64a4: tbz      w8, #0, #0xbc6a98 */ if (((w8 >> #0) & 1) == 0) goto loc_00bc6a98;
    /* 0x00bc64a8: ldp      x9, x8, [x24, #0x28] */ ARM64("ldp x9, x8, [x24, #0x28]");
    /* 0x00bc64ac: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc64b0: b.ne     #0xbc6608 */ if (COND_NE) goto loc_00bc6608;
    /* 0x00bc64b4: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00bc64b8: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00bc64bc: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00bc64c0: b.ne     #0xbc6608 */ if (COND_NE) goto loc_00bc6608;
    /* 0x00bc64c4: ldr      x10, [x27, #0x10] */ ARM64("ldr x10, [x27, #0x10]");
    /* 0x00bc64c8: cbz      x10, #0xbc6608 */ if (x10 == 0) goto loc_00bc6608;
    /* 0x00bc64cc: ldr      x22, [x27, #8] */ ARM64("ldr x22, [x27, #8]");
    /* 0x00bc64d0: lsl      x10, x10, #3 */ ARM64("lsl x10, x10, #3");
    /* 0x00bc64d4: mov      x11, x22 */ ARM64("mov x11, x22");
    /* 0x00bc64d8: b        #0xbc64f8 */ goto loc_00bc64f8;
loc_00bc64dc:
    /* 0x00bc64dc: cbz      x8, #0xbc6d38 */ if (x8 == 0) goto loc_00bc6d38;
    /* 0x00bc64e0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc64e4: cbnz     x22, #0xbc6014 */ if (x22 != 0) goto loc_00bc6014;
    /* 0x00bc64e8: b        #0xbc6d8c */ goto loc_00bc6d8c;
loc_00bc64ec:
    /* 0x00bc64ec: mov      x22, x11 */ ARM64("mov x22, x11");
    /* 0x00bc64f0: subs     x10, x10, #8 */ ARM64("subs x10, x10, #8");
    /* 0x00bc64f4: b.eq     #0xbc6608 */ if (COND_EQ) goto loc_00bc6608;
loc_00bc64f8:
    /* 0x00bc64f8: ldr      x12, [x11], #8 */ ARM64("ldr x12, [x11], #8");
    /* 0x00bc64fc: cbz      x12, #0xbc64ec */ if (x12 == 0) goto loc_00bc64ec;
    /* 0x00bc6500: ldr      x13, [x9, #8] */ ARM64("ldr x13, [x9, #8]");
    /* 0x00bc6504: cmp      x12, x13 */ ARM64("cmp x12, x13");
    /* 0x00bc6508: b.ne     #0xbc64ec */ if (COND_NE) goto loc_00bc64ec;
    /* 0x00bc650c: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6510: ldr      x26, [x8, #0x10] */ ARM64("ldr x26, [x8, #0x10]");
    /* 0x00bc6514: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc6518: cmp      x0, x26 */ ARM64("cmp x0, x26");
    /* 0x00bc651c: b.hs     #0xbc9ae8 */ if (COND_HS) goto loc_00bc9ae8;
    /* 0x00bc6520: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6524: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6528: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc652c: madd     x8, x0, x9, x8 */ ARM64("madd x8, x0, x9, x8");
    /* 0x00bc6530: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc6534: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc6538: b.ne     #0xbc9990 */ if (COND_NE) goto loc_00bc9990;
    /* 0x00bc653c: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc6540: cbz      x9, #0xbc98f4 */ if (x9 == 0) goto loc_00bc98f4;
    /* 0x00bc6544: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00bc6548: str      x9, [x8, #0x48] */ ARM64("str x9, [x8, #0x48]");
    /* 0x00bc654c: ldr      x8, [x8, #0x40] */ ARM64("ldr x8, [x8, #0x40]");
    /* 0x00bc6550: add      x8, x8, x9, lsl #6 */ ARM64("add x8, x8, x9, lsl #6");
    /* 0x00bc6554: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc6558: ldr      x10, [x8, #0x38] */ ARM64("ldr x10, [x8, #0x38]");
    /* 0x00bc655c: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00bc6560: ldur     q1, [x8, #0x18] */ ARM64("ldur q1, [x8, #0x18]");
    /* 0x00bc6564: ldur     q2, [x8, #8] */ ARM64("ldur q2, [x8, #8]");
    /* 0x00bc6568: str      x9, [sp, #0x430] */ ARM64("str x9, [sp, #0x430]");
    /* 0x00bc656c: add      x8, sp, #0x430 */ ARM64("add x8, sp, #0x430");
    /* 0x00bc6570: stur     q2, [x8, #8] */ ARM64("stur q2, [x8, #8]");
    /* 0x00bc6574: stur     q1, [x8, #0x18] */ ARM64("stur q1, [x8, #0x18]");
    /* 0x00bc6578: stur     q0, [x8, #0x28] */ ARM64("stur q0, [x8, #0x28]");
    /* 0x00bc657c: stur     x10, [x8, #0x38] */ ARM64("stur x10, [x8, #0x38]");
    /* 0x00bc6580: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6584: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc6588: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc658c: b.hs     #0xbc9ba0 */ if (COND_HS) goto loc_00bc9ba0;
    /* 0x00bc6590: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00bc6594: cbz      x8, #0xbc990c */ if (x8 == 0) goto loc_00bc990c;
    /* 0x00bc6598: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc659c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc65a0: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc65a4: madd     x0, x28, x9, x8 */ ARM64("madd x0, x28, x9, x8");
    /* 0x00bc65a8: str      x22, [sp, #0x300] */ ARM64("str x22, [sp, #0x300]");
    /* 0x00bc65ac: sturb    w23, [x29, #-0x78] */ ARM64("sturb w23, [x29, #-0x78]");
    /* 0x00bc65b0: add      x8, sp, #0x300 */ ARM64("add x8, sp, #0x300");
    /* 0x00bc65b4: str      x8, [sp, #0x1d0] */ ARM64("str x8, [sp, #0x1d0]");
    /* 0x00bc65b8: add      x8, sp, #0x430 */ ARM64("add x8, sp, #0x430");
    /* 0x00bc65bc: str      x8, [sp, #0x1d8] */ ARM64("str x8, [sp, #0x1d8]");
    /* 0x00bc65c0: sub      x8, x29, #0x78 */ ARM64("sub x8, x29, #0x78");
    /* 0x00bc65c4: str      x8, [sp, #0x1e0] */ ARM64("str x8, [sp, #0x1e0]");
    /* 0x00bc65c8: ldr      x8, [x0, #0x18] */ ARM64("ldr x8, [x0, #0x18]");
    /* 0x00bc65cc: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00bc65d0: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00bc65d4: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00bc65d8: csel     x8, x9, x8, hi */ ARM64("csel x8, x9, x8, hi");
    /* 0x00bc65dc: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc65e0: add      x11, x11, #0x5da */ ARM64("add x11, x11, #0x5da");
    /* 0x00bc65e4: adr      x9, #0xbc65f8 */ ARM64("adr x9, #0xbc65f8");
    /* 0x00bc65e8: ldrb     w10, [x11, x8] */ ARM64("ldrb w10, [x11, x8]");
    /* 0x00bc65ec: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc65f0: ldr      x23, [sp, #0x48] */ ARM64("ldr x23, [sp, #0x48]");
    /* 0x00bc65f4: br       x9 */ ARM64("br x9");
loc_00bc65f8:
    /* 0x00bc65f8: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc65fc: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc6600: bl       #0xbd3dc4 */ CALL_DIRECT(sub_00bd3dc4);
    /* 0x00bc6604: b        #0xbc69e4 */ goto loc_00bc69e4;
loc_00bc6608:
    /* 0x00bc6608: ldr      x10, [sp, #0x198] */ ARM64("ldr x10, [sp, #0x198]");
    /* 0x00bc660c: ldr      x10, [x10, #0x10] */ ARM64("ldr x10, [x10, #0x10]");
    /* 0x00bc6610: cmp      x28, x10 */ ARM64("cmp x28, x10");
    /* 0x00bc6614: b.hs     #0xbc9a5c */ if (COND_HS) goto loc_00bc9a5c;
    /* 0x00bc6618: ldr      x11, [sp, #0x158] */ ARM64("ldr x11, [sp, #0x158]");
    /* 0x00bc661c: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc6620: mov      w12, #0x108 */ ARM64("mov w12, #0x108");
    /* 0x00bc6624: madd     x12, x28, x12, x11 */ ARM64("madd x12, x28, x12, x11");
    /* 0x00bc6628: ldr      x11, [x12, #0x18] */ ARM64("ldr x11, [x12, #0x18]");
    /* 0x00bc662c: cmp      x11, #0x18 */ ARM64("cmp x11, #0x18");
    /* 0x00bc6630: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc6634: add      x11, x8, x8, lsl #1 */ ARM64("add x11, x8, x8, lsl #1");
    /* 0x00bc6638: lsl      x13, x11, #3 */ ARM64("lsl x13, x11, #3");
    /* 0x00bc663c: add      x11, x9, x13 */ ARM64("add x11, x9, x13");
    /* 0x00bc6640: ldp      x27, x12, [x12, #0x40] */ ARM64("ldp x27, x12, [x12, #0x40]");
    /* 0x00bc6644: lsl      x14, x12, #6 */ ARM64("lsl x14, x12, #6");
    /* 0x00bc6648: add      x22, x27, x14 */ ARM64("add x22, x27, x14");
    /* 0x00bc664c: neg      x14, x14 */ ARM64("neg x14, x14");
    /* 0x00bc6650: mov      x16, x22 */ ARM64("mov x16, x22");
loc_00bc6654:
    /* 0x00bc6654: cbz      x14, #0xbc6694 */ if (x14 == 0) goto loc_00bc6694;
    /* 0x00bc6658: mov      x15, x16 */ ARM64("mov x15, x16");
    /* 0x00bc665c: ldr      x17, [x15, #-0x40]! */ ARM64("ldr x17, [x15, #-0x40]!");
    /* 0x00bc6660: cbnz     x17, #0xbc6694 */ if (x17 != 0) goto loc_00bc6694;
    /* 0x00bc6664: cbz      x13, #0xbc6a98 */ if (x13 == 0) goto loc_00bc6a98;
    /* 0x00bc6668: ldur     x16, [x16, #-0x38] */ ARM64("ldur x16, [x16, #-0x38]");
    /* 0x00bc666c: add      x17, x9, x13 */ ARM64("add x17, x9, x13");
    /* 0x00bc6670: ldp      x0, x17, [x17, #-0x18] */ ARM64("ldp x0, x17, [x17, #-0x18]");
    /* 0x00bc6674: sub      x13, x13, #0x18 */ ARM64("sub x13, x13, #0x18");
    /* 0x00bc6678: add      x14, x14, #0x40 */ ARM64("add x14, x14, #0x40");
    /* 0x00bc667c: mov      x1, #-0x8000000000000000 */ ARM64("mov x1, #-0x8000000000000000");
    /* 0x00bc6680: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00bc6684: ccmp     x16, x17, #0, eq */ ARM64("ccmp x16, x17, #0, eq");
    /* 0x00bc6688: mov      x16, x15 */ ARM64("mov x16, x15");
    /* 0x00bc668c: b.eq     #0xbc6654 */ if (COND_EQ) goto loc_00bc6654;
    /* 0x00bc6690: b        #0xbc6a98 */ goto loc_00bc6a98;
loc_00bc6694:
    /* 0x00bc6694: add      x13, x9, x13 */ ARM64("add x13, x9, x13");
    /* 0x00bc6698: cmp      x9, x13 */ ARM64("cmp x9, x13");
    /* 0x00bc669c: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc66a0: cbz      x8, #0xbc6708 */ if (x8 == 0) goto loc_00bc6708;
    /* 0x00bc66a4: cmp      x28, x26 */ ARM64("cmp x28, x26");
    /* 0x00bc66a8: b.hs     #0xbc67a4 */ if (COND_HS) goto loc_00bc67a4;
    /* 0x00bc66ac: mov      w13, #0x18 */ ARM64("mov w13, #0x18");
    /* 0x00bc66b0: ldr      x14, [sp, #0x40] */ ARM64("ldr x14, [sp, #0x40]");
    /* 0x00bc66b4: madd     x13, x28, x13, x14 */ ARM64("madd x13, x28, x13, x14");
    /* 0x00bc66b8: mov      x14, x9 */ ARM64("mov x14, x9");
loc_00bc66bc:
    /* 0x00bc66bc: ldr      x15, [x14], #0x18 */ ARM64("ldr x15, [x14], #0x18");
    /* 0x00bc66c0: mov      x16, #-0x8000000000000000 */ ARM64("mov x16, #-0x8000000000000000");
    /* 0x00bc66c4: cmp      x15, x16 */ ARM64("cmp x15, x16");
    /* 0x00bc66c8: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc66cc: ldr      x16, [x13, #0x10] */ ARM64("ldr x16, [x13, #0x10]");
    /* 0x00bc66d0: cbz      x16, #0xbc6a98 */ if (x16 == 0) goto loc_00bc6a98;
    /* 0x00bc66d4: ldr      x15, [x13, #8] */ ARM64("ldr x15, [x13, #8]");
    /* 0x00bc66d8: lsl      x16, x16, #3 */ ARM64("lsl x16, x16, #3");
    /* 0x00bc66dc: b        #0xbc66e8 */ goto loc_00bc66e8;
loc_00bc66e0:
    /* 0x00bc66e0: subs     x16, x16, #8 */ ARM64("subs x16, x16, #8");
    /* 0x00bc66e4: b.eq     #0xbc6a98 */ if (COND_EQ) goto loc_00bc6a98;
loc_00bc66e8:
    /* 0x00bc66e8: ldr      x17, [x15], #8 */ ARM64("ldr x17, [x15], #8");
    /* 0x00bc66ec: cbz      x17, #0xbc66e0 */ if (x17 == 0) goto loc_00bc66e0;
    /* 0x00bc66f0: ldr      x0, [x9, #8] */ ARM64("ldr x0, [x9, #8]");
    /* 0x00bc66f4: cmp      x17, x0 */ ARM64("cmp x17, x0");
    /* 0x00bc66f8: b.ne     #0xbc66e0 */ if (COND_NE) goto loc_00bc66e0;
    /* 0x00bc66fc: mov      x9, x14 */ ARM64("mov x9, x14");
    /* 0x00bc6700: cmp      x14, x11 */ ARM64("cmp x14, x11");
    /* 0x00bc6704: b.ne     #0xbc66bc */ if (COND_NE) goto loc_00bc66bc;
loc_00bc6708:
    /* 0x00bc6708: sub      x26, x12, x8 */ ARM64("sub x26, x12, x8");
    /* 0x00bc670c: tbz      w23, #0, #0xbc6dc4 */ if (((w23 >> #0) & 1) == 0) goto loc_00bc6dc4;
    /* 0x00bc6710: cbz      x26, #0xbc6dc4 */ if (x26 == 0) goto loc_00bc6dc4;
    /* 0x00bc6714: mov      x23, x26 */ ARM64("mov x23, x26");
    /* 0x00bc6718: b        #0xbc67d0 */ goto loc_00bc67d0;
    /* 0x00bc671c: add      x0, x22, #8 */ ARM64("add x0, x22, #8");
    /* 0x00bc6720: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc6724: tbnz     w0, #0, #0xbc64a0 */ if (((w0 >> #0) & 1) != 0) goto loc_00bc64a0;
    /* 0x00bc6728: b        #0xbc6444 */ goto loc_00bc6444;
    /* 0x00bc672c: ldrb     w8, [x22, #0x10] */ ARM64("ldrb w8, [x22, #0x10]");
    /* 0x00bc6730: cbnz     w8, #0xbc64a0 */ if (w8 != 0) goto loc_00bc64a0;
    /* 0x00bc6734: mov      x8, x22 */ ARM64("mov x8, x22");
loc_00bc6738:
    /* 0x00bc6738: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc673c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc6740: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc6744: b.ne     #0xbc677c */ if (COND_NE) goto loc_00bc677c;
    /* 0x00bc6748: ldrb     w9, [x8, #0x10] */ ARM64("ldrb w9, [x8, #0x10]");
    /* 0x00bc674c: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00bc6750: cbz      w9, #0xbc6738 */ if (w9 == 0) goto loc_00bc6738;
    /* 0x00bc6754: b        #0xbc64a0 */ goto loc_00bc64a0;
    /* 0x00bc6758: add      x0, x22, #8 */ ARM64("add x0, x22, #8");
    /* 0x00bc675c: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc6760: tbz      w0, #0, #0xbc6444 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc6444;
    /* 0x00bc6764: b        #0xbc64a0 */ goto loc_00bc64a0;
    /* 0x00bc6768: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00bc676c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc6770: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc6774: b.eq     #0xbc6444 */ if (COND_EQ) goto loc_00bc6444;
    /* 0x00bc6778: b        #0xbc64a0 */ goto loc_00bc64a0;
loc_00bc677c:
    /* 0x00bc677c: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00bc6780: cmp      x9, #4 */ ARM64("cmp x9, #4");
    /* 0x00bc6784: b.le     #0xbc68c0 */ if (COND_LE) goto loc_00bc68c0;
    /* 0x00bc6788: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc678c: b.gt     #0xbc68d0 */ if (COND_GT) goto loc_00bc68d0;
    /* 0x00bc6790: cmp      x9, #5 */ ARM64("cmp x9, #5");
    /* 0x00bc6794: b.eq     #0xbc68f4 */ if (COND_EQ) goto loc_00bc68f4;
    /* 0x00bc6798: cmp      x9, #6 */ ARM64("cmp x9, #6");
    /* 0x00bc679c: b.eq     #0xbc6444 */ if (COND_EQ) goto loc_00bc6444;
    /* 0x00bc67a0: b        #0xbc64a0 */ goto loc_00bc64a0;
loc_00bc67a4:
    /* 0x00bc67a4: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00bc67a8: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc67ac: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc67b0: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc67b4: b        #0xbc9af4 */ goto loc_00bc9af4;
loc_00bc67b8:
    /* 0x00bc67b8: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc67bc: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc67c0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc67c4: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
loc_00bc67c8:
    /* 0x00bc67c8: add      x27, x27, #0x40 */ ARM64("add x27, x27, #0x40");
    /* 0x00bc67cc: cbz      x23, #0xbc6dbc */ if (x23 == 0) goto loc_00bc6dbc;
loc_00bc67d0:
    /* 0x00bc67d0: cmp      x27, x22 */ ARM64("cmp x27, x22");
    /* 0x00bc67d4: b.eq     #0xbc6dbc */ if (COND_EQ) goto loc_00bc6dbc;
    /* 0x00bc67d8: sub      x23, x23, #1 */ ARM64("sub x23, x23, #1");
    /* 0x00bc67dc: ldr      x8, [x27] */ ARM64("ldr x8, [x27]");
    /* 0x00bc67e0: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc67e4: add      x11, x11, #0x604 */ ARM64("add x11, x11, #0x604");
    /* 0x00bc67e8: adr      x9, #0xbc67b8 */ ARM64("adr x9, #0xbc67b8");
    /* 0x00bc67ec: ldrb     w10, [x11, x8] */ ARM64("ldrb w10, [x11, x8]");
    /* 0x00bc67f0: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc67f4: br       x9 */ ARM64("br x9");
    /* 0x00bc67f8: add      x0, x27, #8 */ ARM64("add x0, x27, #8");
    /* 0x00bc67fc: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc6800: tbz      w0, #0, #0xbc67c8 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc67c8;
    /* 0x00bc6804: b        #0xbc6a98 */ goto loc_00bc6a98;
    /* 0x00bc6808: ldrb     w8, [x27, #0x10] */ ARM64("ldrb w8, [x27, #0x10]");
    /* 0x00bc680c: cbnz     w8, #0xbc6a98 */ if (w8 != 0) goto loc_00bc6a98;
    /* 0x00bc6810: mov      x8, x27 */ ARM64("mov x8, x27");
loc_00bc6814:
    /* 0x00bc6814: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc6818: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc681c: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc6820: b.ne     #0xbc6840 */ if (COND_NE) goto loc_00bc6840;
    /* 0x00bc6824: ldrb     w9, [x8, #0x10] */ ARM64("ldrb w9, [x8, #0x10]");
    /* 0x00bc6828: cbz      w9, #0xbc6814 */ if (w9 == 0) goto loc_00bc6814;
    /* 0x00bc682c: b        #0xbc6a98 */ goto loc_00bc6a98;
    /* 0x00bc6830: add      x0, x27, #8 */ ARM64("add x0, x27, #8");
    /* 0x00bc6834: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc6838: tbz      w0, #0, #0xbc67c8 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc67c8;
    /* 0x00bc683c: b        #0xbc6a98 */ goto loc_00bc6a98;
loc_00bc6840:
    /* 0x00bc6840: cmp      x9, #4 */ ARM64("cmp x9, #4");
    /* 0x00bc6844: b.le     #0xbc6868 */ if (COND_LE) goto loc_00bc6868;
    /* 0x00bc6848: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc684c: b.gt     #0xbc6878 */ if (COND_GT) goto loc_00bc6878;
    /* 0x00bc6850: cmp      x9, #5 */ ARM64("cmp x9, #5");
    /* 0x00bc6854: b.eq     #0xbc68a0 */ if (COND_EQ) goto loc_00bc68a0;
    /* 0x00bc6858: cmp      x9, #6 */ ARM64("cmp x9, #6");
    /* 0x00bc685c: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc6860: b.ne     #0xbc6a98 */ if (COND_NE) goto loc_00bc6a98;
    /* 0x00bc6864: b        #0xbc67c8 */ goto loc_00bc67c8;
loc_00bc6868:
    /* 0x00bc6868: sub      x8, x9, #1 */ ARM64("sub x8, x9, #1");
    /* 0x00bc686c: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00bc6870: b.lo     #0xbc6a98 */ if (COND_LO) goto loc_00bc6a98;
    /* 0x00bc6874: b        #0xbc67c8 */ goto loc_00bc67c8;
loc_00bc6878:
    /* 0x00bc6878: cmp      x9, #9 */ ARM64("cmp x9, #9");
    /* 0x00bc687c: b.eq     #0xbc68ac */ if (COND_EQ) goto loc_00bc68ac;
    /* 0x00bc6880: cmp      x9, #0xa */ ARM64("cmp x9, #0xa");
    /* 0x00bc6884: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc6888: b.eq     #0xbc67c8 */ if (COND_EQ) goto loc_00bc67c8;
    /* 0x00bc688c: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc6890: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc6894: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc6898: b.eq     #0xbc67c8 */ if (COND_EQ) goto loc_00bc67c8;
    /* 0x00bc689c: b        #0xbc6a98 */ goto loc_00bc6a98;
loc_00bc68a0:
    /* 0x00bc68a0: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc68a4: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc68a8: b        #0xbc68b4 */ goto loc_00bc68b4;
loc_00bc68ac:
    /* 0x00bc68ac: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc68b0: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
loc_00bc68b4:
    /* 0x00bc68b4: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc68b8: tbz      w0, #0, #0xbc67c8 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc67c8;
    /* 0x00bc68bc: b        #0xbc6a98 */ goto loc_00bc6a98;
loc_00bc68c0:
    /* 0x00bc68c0: sub      x8, x9, #1 */ ARM64("sub x8, x9, #1");
    /* 0x00bc68c4: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00bc68c8: b.lo     #0xbc64a0 */ if (COND_LO) goto loc_00bc64a0;
    /* 0x00bc68cc: b        #0xbc6444 */ goto loc_00bc6444;
loc_00bc68d0:
    /* 0x00bc68d0: cmp      x9, #9 */ ARM64("cmp x9, #9");
    /* 0x00bc68d4: b.eq     #0xbc6904 */ if (COND_EQ) goto loc_00bc6904;
    /* 0x00bc68d8: cmp      x9, #0xa */ ARM64("cmp x9, #0xa");
    /* 0x00bc68dc: b.eq     #0xbc6444 */ if (COND_EQ) goto loc_00bc6444;
    /* 0x00bc68e0: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc68e4: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc68e8: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc68ec: b.eq     #0xbc6444 */ if (COND_EQ) goto loc_00bc6444;
    /* 0x00bc68f0: b        #0xbc64a0 */ goto loc_00bc64a0;
loc_00bc68f4:
    /* 0x00bc68f4: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc68f8: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc68fc: tbz      w0, #0, #0xbc6444 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc6444;
    /* 0x00bc6900: b        #0xbc64a0 */ goto loc_00bc64a0;
loc_00bc6904:
    /* 0x00bc6904: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc6908: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc690c: tbz      w0, #0, #0xbc6444 */ if (((w0 >> #0) & 1) == 0) goto loc_00bc6444;
    /* 0x00bc6910: b        #0xbc64a0 */ goto loc_00bc64a0;
    /* 0x00bc6914: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6918: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc691c: bl       #0xbd3b44 */ CALL_DIRECT(sub_00bd3b44);
    /* 0x00bc6920: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6924: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6928: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc692c: bl       #0xbe2fe0 */ CALL_DIRECT(sub_00be2fe0);
    /* 0x00bc6930: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6934: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6938: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc693c: bl       #0xbdc0e0 */ CALL_DIRECT(sub_00bdc0e0);
    /* 0x00bc6940: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6944: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6948: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc694c: bl       #0xbe3310 */ CALL_DIRECT(sub_00be3310);
    /* 0x00bc6950: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6954: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6958: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc695c: bl       #0xbdc0e0 */ CALL_DIRECT(sub_00bdc0e0);
    /* 0x00bc6960: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6964: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc6968: bl       #0xbe2a7c */ CALL_DIRECT(sub_00be2a7c);
    /* 0x00bc696c: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6970: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6974: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc6978: bl       #0xbe2ca4 */ CALL_DIRECT(sub_00be2ca4);
    /* 0x00bc697c: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6980: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6984: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc6988: bl       #0xbe2e7c */ CALL_DIRECT(sub_00be2e7c);
    /* 0x00bc698c: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc6990: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc6994: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc6998: bl       #0xbe2fe0 */ CALL_DIRECT(sub_00be2fe0);
    /* 0x00bc699c: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc69a0: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc69a4: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc69a8: bl       #0xbe315c */ CALL_DIRECT(sub_00be315c);
    /* 0x00bc69ac: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc69b0: ldp      x8, x1, [x0, #0x40] */ ARM64("ldp x8, x1, [x0, #0x40]");
    /* 0x00bc69b4: add      x2, sp, #0x1d0 */ ARM64("add x2, sp, #0x1d0");
    /* 0x00bc69b8: mov      x0, x8 */ ARM64("mov x0, x8");
    /* 0x00bc69bc: bl       #0xbe2060 */ CALL_DIRECT(sub_00be2060);
    /* 0x00bc69c0: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc69c4: ldp      x8, x1, [x0, #8] */ ARM64("ldp x8, x1, [x0, #8]");
    /* 0x00bc69c8: add      x2, sp, #0x1d0 */ ARM64("add x2, sp, #0x1d0");
    /* 0x00bc69cc: mov      x0, x8 */ ARM64("mov x0, x8");
    /* 0x00bc69d0: bl       #0xbdc148 */ CALL_DIRECT(sub_00bdc148);
    /* 0x00bc69d4: b        #0xbc69e4 */ goto loc_00bc69e4;
    /* 0x00bc69d8: add      x0, x0, #0x20 */ ARM64("add x0, x0, #0x20");
    /* 0x00bc69dc: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc69e0: bl       #0xbe3378 */ CALL_DIRECT(sub_00be3378);
loc_00bc69e4:
    /* 0x00bc69e4: and      w8, w0, #0xff */ ARM64("and w8, w0, #0xff");
    /* 0x00bc69e8: tbnz     w8, #0, #0xbc71fc */ if (((w8 >> #0) & 1) != 0) goto loc_00bc71fc;
    /* 0x00bc69ec: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc69f0: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc69f4: cmp      x23, x1 */ ARM64("cmp x23, x1");
    /* 0x00bc69f8: b.hs     #0xbc9b0c */ if (COND_HS) goto loc_00bc9b0c;
    /* 0x00bc69fc: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6a00: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6a04: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6a08: madd     x22, x23, x9, x8 */ ARM64("madd x22, x23, x9, x8");
    /* 0x00bc6a0c: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00bc6a10: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00bc6a14: b.ne     #0xbc9900 */ if (COND_NE) goto loc_00bc9900;
    /* 0x00bc6a18: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bc6a1c: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc6a20: b.eq     #0xbc9918 */ if (COND_EQ) goto loc_00bc9918;
    /* 0x00bc6a24: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc6a28: ldr      x9, [x0, #0x38]! */ ARM64("ldr x9, [x0, #0x38]!");
    /* 0x00bc6a2c: str      x8, [sp, #0x1d0] */ ARM64("str x8, [sp, #0x1d0]");
    /* 0x00bc6a30: add      x8, sp, #0x430 */ ARM64("add x8, sp, #0x430");
    /* 0x00bc6a34: ldur     q0, [x8, #8] */ ARM64("ldur q0, [x8, #8]");
    /* 0x00bc6a38: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc6a3c: stur     q0, [x10, #8] */ ARM64("stur q0, [x10, #8]");
    /* 0x00bc6a40: ldur     q0, [x8, #0x18] */ ARM64("ldur q0, [x8, #0x18]");
    /* 0x00bc6a44: stur     q0, [x10, #0x18] */ ARM64("stur q0, [x10, #0x18]");
    /* 0x00bc6a48: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00bc6a4c: stur     q0, [x10, #0x28] */ ARM64("stur q0, [x10, #0x28]");
    /* 0x00bc6a50: ldur     x8, [x8, #0x38] */ ARM64("ldur x8, [x8, #0x38]");
    /* 0x00bc6a54: stur     x8, [x10, #0x38] */ ARM64("stur x8, [x10, #0x38]");
    /* 0x00bc6a58: ldr      x23, [x0, #0x10] */ ARM64("ldr x23, [x0, #0x10]");
    /* 0x00bc6a5c: cmp      x23, x9 */ ARM64("cmp x23, x9");
    /* 0x00bc6a60: b.ne     #0xbc6a68 */ if (COND_NE) goto loc_00bc6a68;
    /* 0x00bc6a64: bl       #0xc73818 */ CALL_DIRECT(sub_00c73818);
loc_00bc6a68:
    /* 0x00bc6a68: ldr      x8, [x22, #0x40] */ ARM64("ldr x8, [x22, #0x40]");
    /* 0x00bc6a6c: add      x8, x8, x23, lsl #6 */ ARM64("add x8, x8, x23, lsl #6");
    /* 0x00bc6a70: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc6a74: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc6a78: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00bc6a7c: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00bc6a80: ldr      q0, [sp, #0x1f0] */ ARM64("ldr q0, [sp, #0x1f0]");
    /* 0x00bc6a84: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00bc6a88: ldr      q0, [sp, #0x200] */ ARM64("ldr q0, [sp, #0x200]");
    /* 0x00bc6a8c: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00bc6a90: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00bc6a94: str      x8, [x22, #0x48] */ ARM64("str x8, [x22, #0x48]");
loc_00bc6a98:
    /* 0x00bc6a98: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6a9c: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00bc6aa0: ldr      x22, [sp, #0x48] */ ARM64("ldr x22, [sp, #0x48]");
loc_00bc6aa4:
    /* 0x00bc6aa4: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc6aa8: b.hs     #0xbc99d8 */ if (COND_HS) goto loc_00bc99d8;
    /* 0x00bc6aac: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6ab0: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6ab4: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6ab8: madd     x1, x22, x9, x8 */ ARM64("madd x1, x22, x9, x8");
    /* 0x00bc6abc: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc6ac0: bl       #0xbca948 */ CALL_DIRECT(sub_00bca948);
    /* 0x00bc6ac4: ldp      x22, x23, [sp, #0x1d0] */ ARM64("ldp x22, x23, [sp, #0x1d0]");
    /* 0x00bc6ac8: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc6acc: cbz      x8, #0xbc6ccc */ if (x8 == 0) goto loc_00bc6ccc;
    /* 0x00bc6ad0: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00bc6ad4: cbz      x9, #0xbc6ccc */ if (x9 == 0) goto loc_00bc6ccc;
    /* 0x00bc6ad8: add      x26, x23, x8, lsl #3 */ ARM64("add x26, x23, x8, lsl #3");
    /* 0x00bc6adc: mov      x27, x23 */ ARM64("mov x27, x23");
    /* 0x00bc6ae0: b        #0xbc6bbc */ goto loc_00bc6bbc;
loc_00bc6ae4:
    /* 0x00bc6ae4: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00bc6ae8: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00bc6aec: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc6af0: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00bc6af4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc6af8: b.eq     #0xbc6b28 */ if (COND_EQ) goto loc_00bc6b28;
loc_00bc6afc:
    /* 0x00bc6afc: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc6b00: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc6b04: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00bc6b08: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00bc6b0c: sub      x16, x8, x16, lsl #3 */ ARM64("sub x16, x8, x16, lsl #3");
    /* 0x00bc6b10: ldur     x16, [x16, #-8] */ ARM64("ldur x16, [x16, #-8]");
    /* 0x00bc6b14: cmp      x24, x16 */ ARM64("cmp x24, x16");
    /* 0x00bc6b18: b.eq     #0xbc6bb4 */ if (COND_EQ) goto loc_00bc6bb4;
    /* 0x00bc6b1c: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc6b20: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc6b24: b.ne     #0xbc6afc */ if (COND_NE) goto loc_00bc6afc;
loc_00bc6b28:
    /* 0x00bc6b28: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00bc6b2c: b.eq     #0xbc6b4c */ if (COND_EQ) goto loc_00bc6b4c;
    /* 0x00bc6b30: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00bc6b34: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00bc6b38: cbz      x11, #0xbc6b68 */ if (x11 == 0) goto loc_00bc6b68;
    /* 0x00bc6b3c: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00bc6b40: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00bc6b44: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00bc6b48: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00bc6b4c:
    /* 0x00bc6b4c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc6b50: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc6b54: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc6b58: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00bc6b5c: tbnz     w13, #0, #0xbc6b78 */ if (((w13 >> #0) & 1) != 0) goto loc_00bc6b78;
    /* 0x00bc6b60: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00bc6b64: b        #0xbc6b6c */ goto loc_00bc6b6c;
loc_00bc6b68:
    /* 0x00bc6b68: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00bc6b6c:
    /* 0x00bc6b6c: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00bc6b70: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00bc6b74: b        #0xbc6ae4 */ goto loc_00bc6ae4;
loc_00bc6b78:
    /* 0x00bc6b78: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00bc6b7c: tbz      w12, #0x1f, #0xbc6cac */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00bc6cac;
loc_00bc6b80:
    /* 0x00bc6b80: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00bc6b84: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00bc6b88: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00bc6b8c: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00bc6b90: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00bc6b94: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00bc6b98: ldr      q0, [sp, #0x420] */ ARM64("ldr q0, [sp, #0x420]");
    /* 0x00bc6b9c: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00bc6ba0: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00bc6ba4: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00bc6ba8: str      q0, [sp, #0x420] */ ARM64("str q0, [sp, #0x420]");
    /* 0x00bc6bac: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00bc6bb0: stur     x24, [x8, #-8] */ ARM64("stur x24, [x8, #-8]");
loc_00bc6bb4:
    /* 0x00bc6bb4: cmp      x27, x26 */ ARM64("cmp x27, x26");
    /* 0x00bc6bb8: b.eq     #0xbc6ccc */ if (COND_EQ) goto loc_00bc6ccc;
loc_00bc6bbc:
    /* 0x00bc6bbc: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc6bc0: ldr      x9, [x27], #8 */ ARM64("ldr x9, [x27], #8");
    /* 0x00bc6bc4: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00bc6bc8: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00bc6bcc: mov      x11, #0xa95 */ ARM64("mov x11, #0xa95");
    /* 0x00bc6bd0: movk     x11, #0x2722, lsl #16 */ ARM64("movk x11, #0x2722, lsl #16");
    /* 0x00bc6bd4: movk     x11, #0xc1b7, lsl #32 */ ARM64("movk x11, #0xc1b7, lsl #32");
    /* 0x00bc6bd8: movk     x11, #0x517c, lsl #48 */ ARM64("movk x11, #0x517c, lsl #48");
    /* 0x00bc6bdc: mul      x10, x10, x11 */ ARM64("mul x10, x10, x11");
    /* 0x00bc6be0: lsr      x11, x10, #0x39 */ ARM64("lsr x11, x10, #0x39");
    /* 0x00bc6be4: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
loc_00bc6be8:
    /* 0x00bc6be8: ldr      x11, [sp, #0x168] */ ARM64("ldr x11, [sp, #0x168]");
    /* 0x00bc6bec: and      x10, x10, x11 */ ARM64("and x10, x10, x11");
    /* 0x00bc6bf0: ldr      x11, [sp, #0x160] */ ARM64("ldr x11, [sp, #0x160]");
    /* 0x00bc6bf4: ldr      d1, [x11, x10] */ ARM64("ldr d1, [x11, x10]");
    /* 0x00bc6bf8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc6bfc: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00bc6c00: ands     x11, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x11, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc6c04: b.eq     #0xbc6c38 */ if (COND_EQ) goto loc_00bc6c38;
loc_00bc6c08:
    /* 0x00bc6c08: rbit     x12, x11 */ ARM64("rbit x12, x11");
    /* 0x00bc6c0c: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00bc6c10: add      x12, x10, x12, lsr #3 */ ARM64("add x12, x10, x12, lsr #3");
    /* 0x00bc6c14: ldp      x13, x14, [sp, #0x160] */ ARM64("ldp x13, x14, [sp, #0x160]");
    /* 0x00bc6c18: and      x12, x12, x14 */ ARM64("and x12, x12, x14");
    /* 0x00bc6c1c: sub      x12, x13, x12, lsl #4 */ ARM64("sub x12, x13, x12, lsl #4");
    /* 0x00bc6c20: ldur     x13, [x12, #-0x10] */ ARM64("ldur x13, [x12, #-0x10]");
    /* 0x00bc6c24: cmp      x9, x13 */ ARM64("cmp x9, x13");
    /* 0x00bc6c28: b.eq     #0xbc6c58 */ if (COND_EQ) goto loc_00bc6c58;
    /* 0x00bc6c2c: sub      x12, x11, #1 */ ARM64("sub x12, x11, #1");
    /* 0x00bc6c30: ands     x11, x12, x11 */ ARM64("ands x11, x12, x11");
    /* 0x00bc6c34: b.ne     #0xbc6c08 */ if (COND_NE) goto loc_00bc6c08;
loc_00bc6c38:
    /* 0x00bc6c38: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc6c3c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc6c40: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc6c44: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00bc6c48: tbnz     w11, #0, #0xbc6bb4 */ if (((w11 >> #0) & 1) != 0) goto loc_00bc6bb4;
    /* 0x00bc6c4c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc6c50: add      x10, x10, x8 */ ARM64("add x10, x10, x8");
    /* 0x00bc6c54: b        #0xbc6be8 */ goto loc_00bc6be8;
loc_00bc6c58:
    /* 0x00bc6c58: ldur     x24, [x12, #-8] */ ARM64("ldur x24, [x12, #-8]");
    /* 0x00bc6c5c: ldr      x8, [sp, #0x420] */ ARM64("ldr x8, [sp, #0x420]");
    /* 0x00bc6c60: cbz      x8, #0xbc6c94 */ if (x8 == 0) goto loc_00bc6c94;
loc_00bc6c64:
    /* 0x00bc6c64: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00bc6c68: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00bc6c6c: mov      x8, #0xa95 */ ARM64("mov x8, #0xa95");
    /* 0x00bc6c70: movk     x8, #0x2722, lsl #16 */ ARM64("movk x8, #0x2722, lsl #16");
    /* 0x00bc6c74: movk     x8, #0xc1b7, lsl #32 */ ARM64("movk x8, #0xc1b7, lsl #32");
    /* 0x00bc6c78: movk     x8, #0x517c, lsl #48 */ ARM64("movk x8, #0x517c, lsl #48");
    /* 0x00bc6c7c: mul      x14, x24, x8 */ ARM64("mul x14, x24, x8");
    /* 0x00bc6c80: ldr      x8, [sp, #0x410] */ ARM64("ldr x8, [sp, #0x410]");
    /* 0x00bc6c84: ldr      x10, [sp, #0x418] */ ARM64("ldr x10, [sp, #0x418]");
    /* 0x00bc6c88: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00bc6c8c: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00bc6c90: b        #0xbc6ae4 */ goto loc_00bc6ae4;
loc_00bc6c94:
    /* 0x00bc6c94: add      x0, sp, #0x410 */ ARM64("add x0, sp, #0x410");
    /* 0x00bc6c98: add      x8, sp, #0x410 */ ARM64("add x8, sp, #0x410");
    /* 0x00bc6c9c: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00bc6ca0: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00bc6ca4: bl       #0xc724cc */ CALL_DIRECT(sub_00c724cc);
    /* 0x00bc6ca8: b        #0xbc6c64 */ goto loc_00bc6c64;
loc_00bc6cac:
    /* 0x00bc6cac: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00bc6cb0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00bc6cb4: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00bc6cb8: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00bc6cbc: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00bc6cc0: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00bc6cc4: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00bc6cc8: b        #0xbc6b80 */ goto loc_00bc6b80;
loc_00bc6ccc:
    /* 0x00bc6ccc: cbz      x22, #0xbc6cd8 */ if (x22 == 0) goto loc_00bc6cd8;
    /* 0x00bc6cd0: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc6cd4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc6cd8:
    /* 0x00bc6cd8: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6cdc: ldr      x26, [x8, #0x10] */ ARM64("ldr x26, [x8, #0x10]");
    /* 0x00bc6ce0: ldr      x22, [sp, #0x48] */ ARM64("ldr x22, [sp, #0x48]");
    /* 0x00bc6ce4: cmp      x22, x26 */ ARM64("cmp x22, x26");
    /* 0x00bc6ce8: b.hs     #0xbc99ec */ if (COND_HS) goto loc_00bc99ec;
    /* 0x00bc6cec: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6cf0: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6cf4: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6cf8: madd     x8, x22, x9, x8 */ ARM64("madd x8, x22, x9, x8");
    /* 0x00bc6cfc: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc6d00: sub      x10, x9, #0xc */ ARM64("sub x10, x9, #0xc");
    /* 0x00bc6d04: cmp      x9, #0xb */ ARM64("cmp x9, #0xb");
    /* 0x00bc6d08: mov      w9, #9 */ ARM64("mov w9, #9");
    /* 0x00bc6d0c: csel     x9, x10, x9, hi */ ARM64("csel x9, x10, x9, hi");
    /* 0x00bc6d10: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00bc6d14: adrp     x12, #0xe06000 */ ARM64("adrp x12, #0xe06000");
    /* 0x00bc6d18: add      x12, x12, #0x610 */ ARM64("add x12, x12, #0x610");
    /* 0x00bc6d1c: adr      x10, #0xbc6d2c */ ARM64("adr x10, #0xbc6d2c");
    /* 0x00bc6d20: ldrb     w11, [x12, x9] */ ARM64("ldrb w11, [x12, x9]");
    /* 0x00bc6d24: add      x10, x10, x11, lsl #2 */ ARM64("add x10, x10, x11, lsl #2");
    /* 0x00bc6d28: br       x10 */ ARM64("br x10");
loc_00bc6d2c:
    /* 0x00bc6d2c: mov      w0, #1 */ ARM64("mov w0, #1");
loc_00bc6d30:
    /* 0x00bc6d30: eor      w8, w0, #1 */ ARM64("eor w8, w0, #1");
    /* 0x00bc6d34: and      w20, w20, w8 */ ARM64("and w20, w20, w8");
loc_00bc6d38:
    /* 0x00bc6d38: cbnz     x22, #0xbc6014 */ if (x22 != 0) goto loc_00bc6014;
    /* 0x00bc6d3c: b        #0xbc6d8c */ goto loc_00bc6d8c;
    /* 0x00bc6d40: add      x0, x8, #0x20 */ ARM64("add x0, x8, #0x20");
    /* 0x00bc6d44: bl       #0xb8bf50 */ CALL_DIRECT(sub_00b8bf50);
    /* 0x00bc6d48: b        #0xbc6d30 */ goto loc_00bc6d30;
    /* 0x00bc6d4c: add      x0, x8, #0x20 */ ARM64("add x0, x8, #0x20");
    /* 0x00bc6d50: bl       #0xb93604 */ CALL_DIRECT(sub_00b93604);
    /* 0x00bc6d54: b        #0xbc6d30 */ goto loc_00bc6d30;
loc_00bc6d58:
    /* 0x00bc6d58: add      x28, x28, #1 */ ARM64("add x28, x28, #1");
loc_00bc6d5c:
    /* 0x00bc6d5c: ldr      x9, [sp, #0x418] */ ARM64("ldr x9, [sp, #0x418]");
    /* 0x00bc6d60: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00bc6d64: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc6d68: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc6d6c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00bc6d70: ldr      x20, [sp, #0x198] */ ARM64("ldr x20, [sp, #0x198]");
    /* 0x00bc6d74: b.eq     #0xbc5ff0 */ if (COND_EQ) goto loc_00bc5ff0;
    /* 0x00bc6d78: ldr      x9, [sp, #0x410] */ ARM64("ldr x9, [sp, #0x410]");
    /* 0x00bc6d7c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc6d80: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00bc6d84: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc6d88: b        #0xbc5ff0 */ goto loc_00bc5ff0;
loc_00bc6d8c:
    /* 0x00bc6d8c: ldr      x9, [sp, #0x418] */ ARM64("ldr x9, [sp, #0x418]");
    /* 0x00bc6d90: ldr      x20, [sp, #0x198] */ ARM64("ldr x20, [sp, #0x198]");
    /* 0x00bc6d94: cbz      x9, #0xbc5fec */ if (x9 == 0) goto loc_00bc5fec;
    /* 0x00bc6d98: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc6d9c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc6da0: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00bc6da4: b.eq     #0xbc5fec */ if (COND_EQ) goto loc_00bc5fec;
    /* 0x00bc6da8: ldr      x9, [sp, #0x410] */ ARM64("ldr x9, [sp, #0x410]");
    /* 0x00bc6dac: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc6db0: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00bc6db4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc6db8: b        #0xbc5fec */ goto loc_00bc5fec;
loc_00bc6dbc:
    /* 0x00bc6dbc: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6dc0: ldr      x10, [x8, #0x10] */ ARM64("ldr x10, [x8, #0x10]");
loc_00bc6dc4:
    /* 0x00bc6dc4: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc6dc8: cmp      x0, x10 */ ARM64("cmp x0, x10");
    /* 0x00bc6dcc: b.hs     #0xbc9b1c */ if (COND_HS) goto loc_00bc9b1c;
    /* 0x00bc6dd0: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6dd4: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6dd8: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6ddc: madd     x8, x0, x9, x8 */ ARM64("madd x8, x0, x9, x8");
    /* 0x00bc6de0: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc6de4: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc6de8: b.ne     #0xbc9978 */ if (COND_NE) goto loc_00bc9978;
    /* 0x00bc6dec: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc6df0: cbz      x9, #0xbc9984 */ if (x9 == 0) goto loc_00bc9984;
    /* 0x00bc6df4: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00bc6df8: str      x9, [x8, #0x48] */ ARM64("str x9, [x8, #0x48]");
    /* 0x00bc6dfc: ldr      x8, [x8, #0x40] */ ARM64("ldr x8, [x8, #0x40]");
    /* 0x00bc6e00: add      x8, x8, x9, lsl #6 */ ARM64("add x8, x8, x9, lsl #6");
    /* 0x00bc6e04: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc6e08: ldur     q0, [x8, #8] */ ARM64("ldur q0, [x8, #8]");
    /* 0x00bc6e0c: add      x10, sp, #0x4a8 */ ARM64("add x10, sp, #0x4a8");
    /* 0x00bc6e10: stur     q0, [x10, #8] */ ARM64("stur q0, [x10, #8]");
    /* 0x00bc6e14: ldur     q0, [x8, #0x18] */ ARM64("ldur q0, [x8, #0x18]");
    /* 0x00bc6e18: stur     q0, [x10, #0x18] */ ARM64("stur q0, [x10, #0x18]");
    /* 0x00bc6e1c: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00bc6e20: stur     q0, [x10, #0x28] */ ARM64("stur q0, [x10, #0x28]");
    /* 0x00bc6e24: ldr      x8, [x8, #0x38] */ ARM64("ldr x8, [x8, #0x38]");
    /* 0x00bc6e28: stur     x8, [x10, #0x38] */ ARM64("stur x8, [x10, #0x38]");
    /* 0x00bc6e2c: str      x9, [sp, #0x4a8] */ ARM64("str x9, [sp, #0x4a8]");
    /* 0x00bc6e30: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6e34: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc6e38: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc6e3c: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc6e40: b.hs     #0xbc9b2c */ if (COND_HS) goto loc_00bc9b2c;
    /* 0x00bc6e44: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6e48: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6e4c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6e50: madd     x20, x0, x9, x8 */ ARM64("madd x20, x0, x9, x8");
    /* 0x00bc6e54: ldr      x8, [x20, #0x18] */ ARM64("ldr x8, [x20, #0x18]");
    /* 0x00bc6e58: cmp      x8, #0x18 */ ARM64("cmp x8, #0x18");
    /* 0x00bc6e5c: b.ne     #0xbc999c */ if (COND_NE) goto loc_00bc999c;
    /* 0x00bc6e60: ldr      x1, [x20, #0x48] */ ARM64("ldr x1, [x20, #0x48]");
    /* 0x00bc6e64: cmp      x1, x26 */ ARM64("cmp x1, x26");
    /* 0x00bc6e68: b.lo     #0xbc99ac */ if (COND_LO) goto loc_00bc99ac;
    /* 0x00bc6e6c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00bc6e70: str      x26, [x20, #0x48] */ ARM64("str x26, [x20, #0x48]");
    /* 0x00bc6e74: ldr      x8, [x20, #0x40] */ ARM64("ldr x8, [x20, #0x40]");
    /* 0x00bc6e78: add      x9, x8, x26, lsl #6 */ ARM64("add x9, x8, x26, lsl #6");
    /* 0x00bc6e7c: add      x8, x8, x1, lsl #6 */ ARM64("add x8, x8, x1, lsl #6");
    /* 0x00bc6e80: stp      x9, x8, [x29, #-0xd8] */ ARM64("stp x9, x8, [x29, #-0xd8]");
    /* 0x00bc6e84: add      x8, x20, #0x38 */ ARM64("add x8, x20, #0x38");
    /* 0x00bc6e88: stp      x8, x1, [x29, #-0xc8] */ ARM64("stp x8, x1, [x29, #-0xc8]");
    /* 0x00bc6e8c: stur     xzr, [x29, #-0xb8] */ ARM64("stur xzr, [x29, #-0xb8]");
    /* 0x00bc6e90: subs     x24, x1, x26 */ ARM64("subs x24, x1, x26");
    /* 0x00bc6e94: b.eq     #0xbc6eb0 */ if (COND_EQ) goto loc_00bc6eb0;
    /* 0x00bc6e98: lsl      x22, x24, #3 */ ARM64("lsl x22, x24, #3");
    /* 0x00bc6e9c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc6ea0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00bc6ea4: cbz      x0, #0xbc9b3c */ if (x0 == 0) goto loc_00bc9b3c;
    /* 0x00bc6ea8: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00bc6eac: b        #0xbc6eb4 */ goto loc_00bc6eb4;
loc_00bc6eb0:
    /* 0x00bc6eb0: mov      w23, #8 */ ARM64("mov w23, #8");
loc_00bc6eb4:
    /* 0x00bc6eb4: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00bc6eb8: add      x10, sp, #0x4a8 */ ARM64("add x10, sp, #0x4a8");
    /* 0x00bc6ebc: ldp      q0, q1, [x10, #0x40] */ ARM64("ldp q0, q1, [x10, #0x40]");
    /* 0x00bc6ec0: str      q0, [sp, #0x430] */ ARM64("str q0, [sp, #0x430]");
    /* 0x00bc6ec4: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00bc6ec8: str      x8, [sp, #0x450] */ ARM64("str x8, [sp, #0x450]");
    /* 0x00bc6ecc: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bc6ed0: ldr      x9, [sp, #0x438] */ ARM64("ldr x9, [sp, #0x438]");
    /* 0x00bc6ed4: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc6ed8: stp      x24, x23, [x29, #-0x78] */ ARM64("stp x24, x23, [x29, #-0x78]");
    /* 0x00bc6edc: stur     xzr, [x29, #-0x68] */ ARM64("stur xzr, [x29, #-0x68]");
    /* 0x00bc6ee0: str      q1, [sp, #0x440] */ ARM64("str q1, [sp, #0x440]");
    /* 0x00bc6ee4: lsr      x2, x8, #6 */ ARM64("lsr x2, x8, #6");
    /* 0x00bc6ee8: cmp      x2, x24 */ ARM64("cmp x2, x24");
    /* 0x00bc6eec: b.hi     #0xbc752c */ if (COND_HI) goto loc_00bc752c;
loc_00bc6ef0:
    /* 0x00bc6ef0: ldp      q0, q1, [x10, #0x40] */ ARM64("ldp q0, q1, [x10, #0x40]");
    /* 0x00bc6ef4: stp      q0, q1, [sp, #0x300] */ ARM64("stp q0, q1, [sp, #0x300]");
    /* 0x00bc6ef8: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00bc6efc: str      x8, [sp, #0x320] */ ARM64("str x8, [sp, #0x320]");
    /* 0x00bc6f00: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc6f04: ldr      x25, [sp, #0x308] */ ARM64("ldr x25, [sp, #0x308]");
    /* 0x00bc6f08: cmp      x8, x25 */ ARM64("cmp x8, x25");
    /* 0x00bc6f0c: b.eq     #0xbc6f84 */ if (COND_EQ) goto loc_00bc6f84;
loc_00bc6f10:
    /* 0x00bc6f10: mov      x24, x8 */ ARM64("mov x24, x8");
    /* 0x00bc6f14: ldr      x9, [x24], #0x40 */ ARM64("ldr x9, [x24], #0x40");
    /* 0x00bc6f18: cmp      x9, #0xc */ ARM64("cmp x9, #0xc");
    /* 0x00bc6f1c: b.eq     #0xbc6f80 */ if (COND_EQ) goto loc_00bc6f80;
    /* 0x00bc6f20: ldur     q0, [x8, #8] */ ARM64("ldur q0, [x8, #8]");
    /* 0x00bc6f24: ldur     q1, [x8, #0x18] */ ARM64("ldur q1, [x8, #0x18]");
    /* 0x00bc6f28: ldur     q2, [x8, #0x28] */ ARM64("ldur q2, [x8, #0x28]");
    /* 0x00bc6f2c: ldr      x8, [x8, #0x38] */ ARM64("ldr x8, [x8, #0x38]");
    /* 0x00bc6f30: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc6f34: stur     x8, [x10, #0x38] */ ARM64("stur x8, [x10, #0x38]");
    /* 0x00bc6f38: stur     q2, [x10, #0x28] */ ARM64("stur q2, [x10, #0x28]");
    /* 0x00bc6f3c: stur     q1, [x10, #0x18] */ ARM64("stur q1, [x10, #0x18]");
    /* 0x00bc6f40: stur     q0, [x10, #8] */ ARM64("stur q0, [x10, #8]");
    /* 0x00bc6f44: str      x9, [sp, #0x1d0] */ ARM64("str x9, [sp, #0x1d0]");
    /* 0x00bc6f48: cbnz     x9, #0xbc980c */ if (x9 != 0) goto loc_00bc980c;
    /* 0x00bc6f4c: ldr      x26, [sp, #0x1d8] */ ARM64("ldr x26, [sp, #0x1d8]");
loc_00bc6f50:
    /* 0x00bc6f50: ldxr     x8, [x26] */ ARM64("ldxr x8, [x26]");
    /* 0x00bc6f54: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00bc6f58: stxr     w10, x9, [x26] */ ARM64("stxr w10, x9, [x26]");
    /* 0x00bc6f5c: cbnz     w10, #0xbc6f50 */ if (w10 != 0) goto loc_00bc6f50;
    /* 0x00bc6f60: tbnz     x8, #0x3f, #0xbc9508 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00bc9508;
    /* 0x00bc6f64: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc6f68: bl       #0xbcc998 */ CALL_DIRECT(sub_00bcc998);
    /* 0x00bc6f6c: str      x26, [x23, x22, lsl #3] */ ARM64("str x26, [x23, x22, lsl #3]");
    /* 0x00bc6f70: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bc6f74: mov      x8, x24 */ ARM64("mov x8, x24");
    /* 0x00bc6f78: cmp      x24, x25 */ ARM64("cmp x24, x25");
    /* 0x00bc6f7c: b.ne     #0xbc6f10 */ if (COND_NE) goto loc_00bc6f10;
loc_00bc6f80:
    /* 0x00bc6f80: str      x24, [sp, #0x300] */ ARM64("str x24, [sp, #0x300]");
loc_00bc6f84:
    /* 0x00bc6f84: stur     x22, [x29, #-0x68] */ ARM64("stur x22, [x29, #-0x68]");
    /* 0x00bc6f88: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc6f8c: bl       #0xbd1a60 */ CALL_DIRECT(sub_00bd1a60);
    /* 0x00bc6f90: add      x23, sp, #0x4a8 */ ARM64("add x23, sp, #0x4a8");
    /* 0x00bc6f94: ldr      q0, [x23, #0xa0] */ ARM64("ldr q0, [x23, #0xa0]");
    /* 0x00bc6f98: str      q0, [sp, #0x300] */ ARM64("str q0, [sp, #0x300]");
    /* 0x00bc6f9c: ldur     x8, [x29, #-0x68] */ ARM64("ldur x8, [x29, #-0x68]");
    /* 0x00bc6fa0: str      x8, [sp, #0x310] */ ARM64("str x8, [sp, #0x310]");
    /* 0x00bc6fa4: ldr      x22, [x20, #0x48] */ ARM64("ldr x22, [x20, #0x48]");
    /* 0x00bc6fa8: ldr      x8, [x20, #0x38] */ ARM64("ldr x8, [x20, #0x38]");
    /* 0x00bc6fac: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc6fb0: b.ne     #0xbc6fbc */ if (COND_NE) goto loc_00bc6fbc;
    /* 0x00bc6fb4: add      x0, x20, #0x38 */ ARM64("add x0, x20, #0x38");
    /* 0x00bc6fb8: bl       #0xc73818 */ CALL_DIRECT(sub_00c73818);
loc_00bc6fbc:
    /* 0x00bc6fbc: ldr      x8, [x20, #0x40] */ ARM64("ldr x8, [x20, #0x40]");
    /* 0x00bc6fc0: add      x8, x8, x22, lsl #6 */ ARM64("add x8, x8, x22, lsl #6");
    /* 0x00bc6fc4: ldp      q0, q1, [x23] */ ARM64("ldp q0, q1, [x23]");
    /* 0x00bc6fc8: stp      q0, q1, [x8] */ ARM64("stp q0, q1, [x8]");
    /* 0x00bc6fcc: ldp      q0, q1, [x23, #0x20] */ ARM64("ldp q0, q1, [x23, #0x20]");
    /* 0x00bc6fd0: stp      q0, q1, [x8, #0x20] */ ARM64("stp q0, q1, [x8, #0x20]");
    /* 0x00bc6fd4: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00bc6fd8: str      x8, [x20, #0x48] */ ARM64("str x8, [x20, #0x48]");
    /* 0x00bc6fdc: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc6fe0: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc6fe4: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc6fe8: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00bc6fec: b.hs     #0xbc9b4c */ if (COND_HS) goto loc_00bc9b4c;
    /* 0x00bc6ff0: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc6ff4: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc6ff8: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc6ffc: madd     x1, x0, x9, x8 */ ARM64("madd x1, x0, x9, x8");
    /* 0x00bc7000: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7004: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc7008: ldp      x20, x22, [sp, #0x1d0] */ ARM64("ldp x20, x22, [sp, #0x1d0]");
    /* 0x00bc700c: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc7010: cbz      x8, #0xbc70dc */ if (x8 == 0) goto loc_00bc70dc;
    /* 0x00bc7014: add      x8, x22, x8, lsl #3 */ ARM64("add x8, x22, x8, lsl #3");
    /* 0x00bc7018: mov      x9, x22 */ ARM64("mov x9, x22");
    /* 0x00bc701c: b        #0xbc70a0 */ goto loc_00bc70a0;
loc_00bc7020:
    /* 0x00bc7020: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00bc7024: ldr      d1, [x13, x14] */ ARM64("ldr d1, [x13, x14]");
    /* 0x00bc7028: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc702c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00bc7030: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7034: b.eq     #0xbc7064 */ if (COND_EQ) goto loc_00bc7064;
loc_00bc7038:
    /* 0x00bc7038: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc703c: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc7040: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00bc7044: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc7048: sub      x16, x13, x16, lsl #4 */ ARM64("sub x16, x13, x16, lsl #4");
    /* 0x00bc704c: ldur     x17, [x16, #-0x10] */ ARM64("ldur x17, [x16, #-0x10]");
    /* 0x00bc7050: cmp      x11, x17 */ ARM64("cmp x11, x17");
    /* 0x00bc7054: b.eq     #0xbc7084 */ if (COND_EQ) goto loc_00bc7084;
    /* 0x00bc7058: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc705c: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc7060: b.ne     #0xbc7038 */ if (COND_NE) goto loc_00bc7038;
loc_00bc7064:
    /* 0x00bc7064: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc7068: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc706c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc7070: fmov     w15, s1 */ ARM64("fmov w15, s1");
    /* 0x00bc7074: tbnz     w15, #0, #0xbc9648 */ if (((w15 >> #0) & 1) != 0) goto loc_00bc9648;
    /* 0x00bc7078: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00bc707c: add      x14, x14, x10 */ ARM64("add x14, x14, x10");
    /* 0x00bc7080: b        #0xbc7020 */ goto loc_00bc7020;
loc_00bc7084:
    /* 0x00bc7084: ldur     x10, [x16, #-8] */ ARM64("ldur x10, [x16, #-8]");
    /* 0x00bc7088: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00bc708c: cset     w11, ne */ ARM64("cset w11, ne");
    /* 0x00bc7090: sub      x10, x10, x11 */ ARM64("sub x10, x10, x11");
    /* 0x00bc7094: stur     x10, [x16, #-8] */ ARM64("stur x10, [x16, #-8]");
    /* 0x00bc7098: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc709c: b.eq     #0xbc70dc */ if (COND_EQ) goto loc_00bc70dc;
loc_00bc70a0:
    /* 0x00bc70a0: ldr      x10, [sp, #0x1c8] */ ARM64("ldr x10, [sp, #0x1c8]");
    /* 0x00bc70a4: cbz      x10, #0xbc9648 */ if (x10 == 0) goto loc_00bc9648;
    /* 0x00bc70a8: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc70ac: ldr      x11, [x9], #8 */ ARM64("ldr x11, [x9], #8");
    /* 0x00bc70b0: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc70b4: add      x12, x11, #8 */ ARM64("add x12, x11, #8");
    /* 0x00bc70b8: mov      x13, #0xa95 */ ARM64("mov x13, #0xa95");
    /* 0x00bc70bc: movk     x13, #0x2722, lsl #16 */ ARM64("movk x13, #0x2722, lsl #16");
    /* 0x00bc70c0: movk     x13, #0xc1b7, lsl #32 */ ARM64("movk x13, #0xc1b7, lsl #32");
    /* 0x00bc70c4: movk     x13, #0x517c, lsl #48 */ ARM64("movk x13, #0x517c, lsl #48");
    /* 0x00bc70c8: mul      x14, x12, x13 */ ARM64("mul x14, x12, x13");
    /* 0x00bc70cc: lsr      x15, x14, #0x39 */ ARM64("lsr x15, x14, #0x39");
    /* 0x00bc70d0: ldp      x13, x12, [sp, #0x1b0] */ ARM64("ldp x13, x12, [sp, #0x1b0]");
    /* 0x00bc70d4: dup      v0.8b, w15 */ ARM64("dup v0.8b, w15");
    /* 0x00bc70d8: b        #0xbc7020 */ goto loc_00bc7020;
loc_00bc70dc:
    /* 0x00bc70dc: cbz      x20, #0xbc70e8 */ if (x20 == 0) goto loc_00bc70e8;
    /* 0x00bc70e0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc70e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc70e8:
    /* 0x00bc70e8: mov      w8, #0xc */ ARM64("mov w8, #0xc");
    /* 0x00bc70ec: str      x8, [sp, #0x1e8] */ ARM64("str x8, [sp, #0x1e8]");
    /* 0x00bc70f0: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc70f4: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc70f8: ldr      x8, [sp, #0x48] */ ARM64("ldr x8, [sp, #0x48]");
    /* 0x00bc70fc: cmp      x8, x1 */ ARM64("cmp x8, x1");
    /* 0x00bc7100: b.hs     #0xbc9b5c */ if (COND_HS) goto loc_00bc9b5c;
    /* 0x00bc7104: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc7108: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc710c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7110: ldr      x10, [sp, #0x48] */ ARM64("ldr x10, [sp, #0x48]");
    /* 0x00bc7114: madd     x22, x10, x9, x8 */ ARM64("madd x22, x10, x9, x8");
    /* 0x00bc7118: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc711c: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc7120: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc7124: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc7128: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc712c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc7130: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc7134: ldr      x20, [sp, #0x308] */ ARM64("ldr x20, [sp, #0x308]");
    /* 0x00bc7138: ldr      x9, [sp, #0x310] */ ARM64("ldr x9, [sp, #0x310]");
    /* 0x00bc713c: add      x23, x20, x9, lsl #3 */ ARM64("add x23, x20, x9, lsl #3");
    /* 0x00bc7140: stp      x20, x20, [sp, #0x1d0] */ ARM64("stp x20, x20, [sp, #0x1d0]");
    /* 0x00bc7144: stp      x8, x23, [sp, #0x1e0] */ ARM64("stp x8, x23, [sp, #0x1e0]");
    /* 0x00bc7148: mov      x25, x28 */ ARM64("mov x25, x28");
    /* 0x00bc714c: cbnz     x9, #0xbc7168 */ if (x9 != 0) goto loc_00bc7168;
loc_00bc7150:
    /* 0x00bc7150: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7154: bl       #0xb8bec4 */ CALL_DIRECT(sub_00b8bec4);
loc_00bc7158:
    /* 0x00bc7158: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc715c: b        #0xbc6d5c */ goto loc_00bc6d5c;
loc_00bc7160:
    /* 0x00bc7160: cmp      x20, x23 */ ARM64("cmp x20, x23");
    /* 0x00bc7164: b.eq     #0xbc7150 */ if (COND_EQ) goto loc_00bc7150;
loc_00bc7168:
    /* 0x00bc7168: ldr      x22, [x20], #8 */ ARM64("ldr x22, [x20], #8");
    /* 0x00bc716c: str      x20, [sp, #0x1d8] */ ARM64("str x20, [sp, #0x1d8]");
    /* 0x00bc7170: ldr      x1, [sp, #0x408] */ ARM64("ldr x1, [sp, #0x408]");
    /* 0x00bc7174: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00bc7178: b.hs     #0xbc9b70 */ if (COND_HS) goto loc_00bc9b70;
    /* 0x00bc717c: ldr      x8, [sp, #0x400] */ ARM64("ldr x8, [sp, #0x400]");
    /* 0x00bc7180: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00bc7184: madd     x9, x25, x9, x8 */ ARM64("madd x9, x25, x9, x8");
    /* 0x00bc7188: ldr      x8, [x9, #0x10] */ ARM64("ldr x8, [x9, #0x10]");
    /* 0x00bc718c: cbz      x8, #0xbc9a34 */ if (x8 == 0) goto loc_00bc9a34;
    /* 0x00bc7190: ldr      x24, [x9, #8] */ ARM64("ldr x24, [x9, #8]");
    /* 0x00bc7194: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
loc_00bc7198:
    /* 0x00bc7198: ldr      x9, [x24] */ ARM64("ldr x9, [x24]");
    /* 0x00bc719c: cmp      x9, x22 */ ARM64("cmp x9, x22");
    /* 0x00bc71a0: b.eq     #0xbc71b4 */ if (COND_EQ) goto loc_00bc71b4;
    /* 0x00bc71a4: add      x24, x24, #8 */ ARM64("add x24, x24, #8");
    /* 0x00bc71a8: subs     x8, x8, #8 */ ARM64("subs x8, x8, #8");
    /* 0x00bc71ac: b.ne     #0xbc7198 */ if (COND_NE) goto loc_00bc7198;
    /* 0x00bc71b0: b        #0xbc9a34 */ goto loc_00bc9a34;
loc_00bc71b4:
    /* 0x00bc71b4: ldxr     x8, [x9] */ ARM64("ldxr x8, [x9]");
    /* 0x00bc71b8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc71bc: stlxr    w10, x8, [x9] */ ARM64("stlxr w10, x8, [x9]");
    /* 0x00bc71c0: cbnz     w10, #0xbc71b4 */ if (w10 != 0) goto loc_00bc71b4;
    /* 0x00bc71c4: b.ne     #0xbc71d4 */ if (COND_NE) goto loc_00bc71d4;
    /* 0x00bc71c8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc71cc: ldr      x0, [x24] */ ARM64("ldr x0, [x24]");
    /* 0x00bc71d0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc71d4:
    /* 0x00bc71d4: str      xzr, [x24] */ ARM64("str xzr, [x24]");
loc_00bc71d8:
    /* 0x00bc71d8: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc71dc: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc71e0: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bc71e4: cbnz     w9, #0xbc71d8 */ if (w9 != 0) goto loc_00bc71d8;
    /* 0x00bc71e8: b.ne     #0xbc7160 */ if (COND_NE) goto loc_00bc7160;
    /* 0x00bc71ec: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc71f0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc71f4: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc71f8: b        #0xbc7160 */ goto loc_00bc7160;
loc_00bc71fc:
    /* 0x00bc71fc: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bc7200: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc7204: b.ne     #0xbc9a80 */ if (COND_NE) goto loc_00bc9a80;
    /* 0x00bc7208: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc720c: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7210: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc7214: b.hs     #0xbc9b84 */ if (COND_HS) goto loc_00bc9b84;
    /* 0x00bc7218: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc721c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7220: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7224: madd     x1, x28, x9, x8 */ ARM64("madd x1, x28, x9, x8");
    /* 0x00bc7228: ldr      x8, [x1, #0x18] */ ARM64("ldr x8, [x1, #0x18]");
    /* 0x00bc722c: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00bc7230: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00bc7234: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00bc7238: csel     x10, x9, x8, hi */ ARM64("csel x10, x9, x8, hi");
    /* 0x00bc723c: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00bc7240: mov      w8, #0x40 */ ARM64("mov w8, #0x40");
    /* 0x00bc7244: adrp     x13, #0xe06000 */ ARM64("adrp x13, #0xe06000");
    /* 0x00bc7248: add      x13, x13, #0x5ef */ ARM64("add x13, x13, #0x5ef");
    /* 0x00bc724c: adr      x11, #0xbc725c */ ARM64("adr x11, #0xbc725c");
    /* 0x00bc7250: ldrb     w12, [x13, x10] */ ARM64("ldrb w12, [x13, x10]");
    /* 0x00bc7254: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00bc7258: br       x11 */ ARM64("br x11");
loc_00bc725c:
    /* 0x00bc725c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7260: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc7264: bl       #0xb935bc */ CALL_DIRECT(sub_00b935bc);
    /* 0x00bc7268: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc726c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7270: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc7274: bl       #0xb8bd48 */ CALL_DIRECT(sub_00b8bd48);
    /* 0x00bc7278: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc727c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7280: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc7284: bl       #0xb8bd10 */ CALL_DIRECT(sub_00b8bd10);
    /* 0x00bc7288: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc728c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7290: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc7294: bl       #0xb935bc */ CALL_DIRECT(sub_00b935bc);
    /* 0x00bc7298: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc729c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc72a0: bl       #0xb85074 */ CALL_DIRECT(sub_00b85074);
    /* 0x00bc72a4: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc72a8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc72ac: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc72b0: bl       #0xb84bf4 */ CALL_DIRECT(sub_00b84bf4);
    /* 0x00bc72b4: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc72b8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc72bc: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc72c0: bl       #0xb85020 */ CALL_DIRECT(sub_00b85020);
    /* 0x00bc72c4: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc72c8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc72cc: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc72d0: bl       #0xb850cc */ CALL_DIRECT(sub_00b850cc);
    /* 0x00bc72d4: b        #0xbc72f8 */ goto loc_00bc72f8;
    /* 0x00bc72d8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00bc72dc: mov      w9, #0x10 */ ARM64("mov w9, #0x10");
    /* 0x00bc72e0: ldr      x8, [x1, x8] */ ARM64("ldr x8, [x1, x8]");
    /* 0x00bc72e4: ldr      x9, [x1, x9] */ ARM64("ldr x9, [x1, x9]");
    /* 0x00bc72e8: add      x2, x8, x9, lsl #6 */ ARM64("add x2, x8, x9, lsl #6");
    /* 0x00bc72ec: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc72f0: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00bc72f4: bl       #0xb76800 */ CALL_DIRECT(sub_00b76800);
loc_00bc72f8:
    /* 0x00bc72f8: ldp      x20, x8, [sp, #0x1d8] */ ARM64("ldp x20, x8, [sp, #0x1d8]");
    /* 0x00bc72fc: ldr      x24, [sp, #0x1d0] */ ARM64("ldr x24, [sp, #0x1d0]");
    /* 0x00bc7300: cbz      x8, #0xbc7374 */ if (x8 == 0) goto loc_00bc7374;
    /* 0x00bc7304: lsl      x25, x8, #3 */ ARM64("lsl x25, x8, #3");
    /* 0x00bc7308: mov      x26, x20 */ ARM64("mov x26, x20");
loc_00bc730c:
    /* 0x00bc730c: ldr      x23, [x26], #8 */ ARM64("ldr x23, [x26], #8");
    /* 0x00bc7310: ldr      q0, [x23] */ ARM64("ldr q0, [x23]");
    /* 0x00bc7314: str      q0, [sp, #0x1d0] */ ARM64("str q0, [sp, #0x1d0]");
    /* 0x00bc7318: ldr      q0, [x23, #0x10] */ ARM64("ldr q0, [x23, #0x10]");
    /* 0x00bc731c: str      q0, [sp, #0x1e0] */ ARM64("str q0, [sp, #0x1e0]");
    /* 0x00bc7320: ldr      q0, [x23, #0x20] */ ARM64("ldr q0, [x23, #0x20]");
    /* 0x00bc7324: str      q0, [sp, #0x1f0] */ ARM64("str q0, [sp, #0x1f0]");
    /* 0x00bc7328: ldr      q0, [x23, #0x30] */ ARM64("ldr q0, [x23, #0x30]");
    /* 0x00bc732c: str      q0, [sp, #0x200] */ ARM64("str q0, [sp, #0x200]");
    /* 0x00bc7330: ldr      q0, [sp, #0xa0] */ ARM64("ldr q0, [sp, #0xa0]");
    /* 0x00bc7334: str      q0, [x23] */ ARM64("str q0, [x23]");
    /* 0x00bc7338: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc733c: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc7340: bl       #0xb7de54 */ CALL_DIRECT(sub_00b7de54);
    /* 0x00bc7344: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc7348: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc734c: ldr      q0, [sp, #0x300] */ ARM64("ldr q0, [sp, #0x300]");
    /* 0x00bc7350: str      q0, [x23] */ ARM64("str q0, [x23]");
    /* 0x00bc7354: ldr      q0, [sp, #0x310] */ ARM64("ldr q0, [sp, #0x310]");
    /* 0x00bc7358: str      q0, [x23, #0x10] */ ARM64("str q0, [x23, #0x10]");
    /* 0x00bc735c: ldr      q0, [sp, #0x320] */ ARM64("ldr q0, [sp, #0x320]");
    /* 0x00bc7360: str      q0, [x23, #0x20] */ ARM64("str q0, [x23, #0x20]");
    /* 0x00bc7364: ldr      q0, [sp, #0x330] */ ARM64("ldr q0, [sp, #0x330]");
    /* 0x00bc7368: str      q0, [x23, #0x30] */ ARM64("str q0, [x23, #0x30]");
    /* 0x00bc736c: subs     x25, x25, #8 */ ARM64("subs x25, x25, #8");
    /* 0x00bc7370: b.ne     #0xbc730c */ if (COND_NE) goto loc_00bc730c;
loc_00bc7374:
    /* 0x00bc7374: cbz      x24, #0xbc7380 */ if (x24 == 0) goto loc_00bc7380;
    /* 0x00bc7378: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc737c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc7380:
    /* 0x00bc7380: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc7384: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7388: ldr      x8, [sp, #0x48] */ ARM64("ldr x8, [sp, #0x48]");
    /* 0x00bc738c: cmp      x8, x1 */ ARM64("cmp x8, x1");
    /* 0x00bc7390: b.hs     #0xbc9b90 */ if (COND_HS) goto loc_00bc9b90;
    /* 0x00bc7394: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc7398: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc739c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc73a0: ldr      x10, [sp, #0x48] */ ARM64("ldr x10, [sp, #0x48]");
    /* 0x00bc73a4: madd     x1, x10, x9, x8 */ ARM64("madd x1, x10, x9, x8");
    /* 0x00bc73a8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc73ac: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc73b0: ldp      x23, x20, [sp, #0x1d0] */ ARM64("ldp x23, x20, [sp, #0x1d0]");
    /* 0x00bc73b4: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc73b8: cbz      x8, #0xbc7484 */ if (x8 == 0) goto loc_00bc7484;
    /* 0x00bc73bc: add      x8, x20, x8, lsl #3 */ ARM64("add x8, x20, x8, lsl #3");
    /* 0x00bc73c0: mov      x9, x20 */ ARM64("mov x9, x20");
    /* 0x00bc73c4: b        #0xbc7448 */ goto loc_00bc7448;
loc_00bc73c8:
    /* 0x00bc73c8: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00bc73cc: ldr      d1, [x13, x14] */ ARM64("ldr d1, [x13, x14]");
    /* 0x00bc73d0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc73d4: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00bc73d8: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc73dc: b.eq     #0xbc740c */ if (COND_EQ) goto loc_00bc740c;
loc_00bc73e0:
    /* 0x00bc73e0: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc73e4: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc73e8: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00bc73ec: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc73f0: sub      x16, x13, x16, lsl #4 */ ARM64("sub x16, x13, x16, lsl #4");
    /* 0x00bc73f4: ldur     x17, [x16, #-0x10] */ ARM64("ldur x17, [x16, #-0x10]");
    /* 0x00bc73f8: cmp      x11, x17 */ ARM64("cmp x11, x17");
    /* 0x00bc73fc: b.eq     #0xbc742c */ if (COND_EQ) goto loc_00bc742c;
    /* 0x00bc7400: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc7404: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc7408: b.ne     #0xbc73e0 */ if (COND_NE) goto loc_00bc73e0;
loc_00bc740c:
    /* 0x00bc740c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc7410: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc7414: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc7418: fmov     w15, s1 */ ARM64("fmov w15, s1");
    /* 0x00bc741c: tbnz     w15, #0, #0xbc967c */ if (((w15 >> #0) & 1) != 0) goto loc_00bc967c;
    /* 0x00bc7420: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00bc7424: add      x14, x14, x10 */ ARM64("add x14, x14, x10");
    /* 0x00bc7428: b        #0xbc73c8 */ goto loc_00bc73c8;
loc_00bc742c:
    /* 0x00bc742c: ldur     x10, [x16, #-8] */ ARM64("ldur x10, [x16, #-8]");
    /* 0x00bc7430: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00bc7434: cset     w11, ne */ ARM64("cset w11, ne");
    /* 0x00bc7438: sub      x10, x10, x11 */ ARM64("sub x10, x10, x11");
    /* 0x00bc743c: stur     x10, [x16, #-8] */ ARM64("stur x10, [x16, #-8]");
    /* 0x00bc7440: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc7444: b.eq     #0xbc7484 */ if (COND_EQ) goto loc_00bc7484;
loc_00bc7448:
    /* 0x00bc7448: ldr      x10, [sp, #0x1c8] */ ARM64("ldr x10, [sp, #0x1c8]");
    /* 0x00bc744c: cbz      x10, #0xbc967c */ if (x10 == 0) goto loc_00bc967c;
    /* 0x00bc7450: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc7454: ldr      x11, [x9], #8 */ ARM64("ldr x11, [x9], #8");
    /* 0x00bc7458: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc745c: add      x12, x11, #8 */ ARM64("add x12, x11, #8");
    /* 0x00bc7460: mov      x13, #0xa95 */ ARM64("mov x13, #0xa95");
    /* 0x00bc7464: movk     x13, #0x2722, lsl #16 */ ARM64("movk x13, #0x2722, lsl #16");
    /* 0x00bc7468: movk     x13, #0xc1b7, lsl #32 */ ARM64("movk x13, #0xc1b7, lsl #32");
    /* 0x00bc746c: movk     x13, #0x517c, lsl #48 */ ARM64("movk x13, #0x517c, lsl #48");
    /* 0x00bc7470: mul      x14, x12, x13 */ ARM64("mul x14, x12, x13");
    /* 0x00bc7474: lsr      x15, x14, #0x39 */ ARM64("lsr x15, x14, #0x39");
    /* 0x00bc7478: ldp      x13, x12, [sp, #0x1b0] */ ARM64("ldp x13, x12, [sp, #0x1b0]");
    /* 0x00bc747c: dup      v0.8b, w15 */ ARM64("dup v0.8b, w15");
    /* 0x00bc7480: b        #0xbc73c8 */ goto loc_00bc73c8;
loc_00bc7484:
    /* 0x00bc7484: cbz      x23, #0xbc7490 */ if (x23 == 0) goto loc_00bc7490;
    /* 0x00bc7488: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc748c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc7490:
    /* 0x00bc7490: mov      w8, #0xc */ ARM64("mov w8, #0xc");
    /* 0x00bc7494: str      x8, [sp, #0x1e8] */ ARM64("str x8, [sp, #0x1e8]");
    /* 0x00bc7498: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc749c: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc74a0: ldr      x8, [sp, #0x48] */ ARM64("ldr x8, [sp, #0x48]");
    /* 0x00bc74a4: cmp      x8, x1 */ ARM64("cmp x8, x1");
    /* 0x00bc74a8: b.hs     #0xbc9bb0 */ if (COND_HS) goto loc_00bc9bb0;
    /* 0x00bc74ac: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc74b0: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc74b4: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc74b8: ldr      x10, [sp, #0x48] */ ARM64("ldr x10, [sp, #0x48]");
    /* 0x00bc74bc: madd     x20, x10, x9, x8 */ ARM64("madd x20, x10, x9, x8");
    /* 0x00bc74c0: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc74c4: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc74c8: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc74cc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc74d0: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc74d4: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc74d8: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00bc74dc: cbz      x8, #0xbc7500 */ if (x8 == 0) goto loc_00bc7500;
loc_00bc74e0:
    /* 0x00bc74e0: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc74e4: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bc74e8: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bc74ec: cbnz     w10, #0xbc74e0 */ if (w10 != 0) goto loc_00bc74e0;
    /* 0x00bc74f0: b.ne     #0xbc7500 */ if (COND_NE) goto loc_00bc7500;
    /* 0x00bc74f4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc74f8: ldr      x0, [x22] */ ARM64("ldr x0, [x22]");
    /* 0x00bc74fc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc7500:
    /* 0x00bc7500: str      xzr, [x22] */ ARM64("str xzr, [x22]");
    /* 0x00bc7504: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bc7508: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc750c: b.eq     #0xbc7158 */ if (COND_EQ) goto loc_00bc7158;
    /* 0x00bc7510: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bc7514: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc7518: b        #0xbc7158 */ goto loc_00bc7158;
    /* 0x00bc751c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7520: add      x1, x1, #0x20 */ ARM64("add x1, x1, #0x20");
    /* 0x00bc7524: bl       #0xb937a0 */ CALL_DIRECT(sub_00b937a0);
    /* 0x00bc7528: b        #0xbc72f8 */ goto loc_00bc72f8;
loc_00bc752c:
    /* 0x00bc752c: sub      x0, x29, #0x78 */ ARM64("sub x0, x29, #0x78");
    /* 0x00bc7530: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00bc7534: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00bc7538: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00bc753c: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00bc7540: ldp      x23, x22, [x29, #-0x70] */ ARM64("ldp x23, x22, [x29, #-0x70]");
    /* 0x00bc7544: add      x10, sp, #0x4a8 */ ARM64("add x10, sp, #0x4a8");
    /* 0x00bc7548: b        #0xbc6ef0 */ goto loc_00bc6ef0;
loc_00bc754c:
    /* 0x00bc754c: ldr      w20, [x8, #0x20] */ ARM64("ldr w20, [x8, #0x20]");
    /* 0x00bc7550: mov      w0, #0x10 */ ARM64("mov w0, #0x10");
    /* 0x00bc7554: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00bc7558: cbz      x0, #0xbc9968 */ if (x0 == 0) goto loc_00bc9968;
    /* 0x00bc755c: str      w22, [x0] */ ARM64("str w22, [x0]");
    /* 0x00bc7560: mov      w22, #1 */ ARM64("mov w22, #1");
    /* 0x00bc7564: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00bc7568: stp      x8, x0, [sp, #0x1d0] */ ARM64("stp x8, x0, [sp, #0x1d0]");
    /* 0x00bc756c: b        #0xbc7580 */ goto loc_00bc7580;
loc_00bc7570:
    /* 0x00bc7570: ldr      x0, [sp, #0x1d8] */ ARM64("ldr x0, [sp, #0x1d8]");
loc_00bc7574:
    /* 0x00bc7574: str      w20, [x0, x22, lsl #2] */ ARM64("str w20, [x0, x22, lsl #2]");
    /* 0x00bc7578: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bc757c: mov      x20, x23 */ ARM64("mov x20, x23");
loc_00bc7580:
    /* 0x00bc7580: str      x22, [sp, #0x1e0] */ ARM64("str x22, [sp, #0x1e0]");
    /* 0x00bc7584: ldr      x8, [sp, #0x148] */ ARM64("ldr x8, [sp, #0x148]");
    /* 0x00bc7588: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00bc758c: b.ls     #0xbc75d8 */ if (COND_LS) goto loc_00bc75d8;
    /* 0x00bc7590: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00bc7594: mov      w9, #0x30 */ ARM64("mov w9, #0x30");
    /* 0x00bc7598: madd     x8, x20, x9, x8 */ ARM64("madd x8, x20, x9, x8");
    /* 0x00bc759c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc75a0: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc75a4: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc75a8: b.eq     #0xbc75d8 */ if (COND_EQ) goto loc_00bc75d8;
    /* 0x00bc75ac: ldr      w23, [x8, #0x20] */ ARM64("ldr w23, [x8, #0x20]");
    /* 0x00bc75b0: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc75b4: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc75b8: b.ne     #0xbc7574 */ if (COND_NE) goto loc_00bc7574;
    /* 0x00bc75bc: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc75c0: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00bc75c4: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00bc75c8: mov      w3, #4 */ ARM64("mov w3, #4");
    /* 0x00bc75cc: mov      w4, #4 */ ARM64("mov w4, #4");
    /* 0x00bc75d0: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00bc75d4: b        #0xbc7570 */ goto loc_00bc7570;
loc_00bc75d8:
    /* 0x00bc75d8: ldp      x23, x20, [sp, #0x1d0] */ ARM64("ldp x23, x20, [sp, #0x1d0]");
    /* 0x00bc75dc: add      x11, x20, x22, lsl #2 */ ARM64("add x11, x20, x22, lsl #2");
    /* 0x00bc75e0: mov      x12, x20 */ ARM64("mov x12, x20");
loc_00bc75e4:
    /* 0x00bc75e4: ldr      w8, [x12], #4 */ ARM64("ldr w8, [x12], #4");
    /* 0x00bc75e8: ldr      x9, [sp, #0x148] */ ARM64("ldr x9, [sp, #0x148]");
    /* 0x00bc75ec: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc75f0: b.ls     #0xbc9930 */ if (COND_LS) goto loc_00bc9930;
    /* 0x00bc75f4: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00bc75f8: mov      w10, #0x30 */ ARM64("mov w10, #0x30");
    /* 0x00bc75fc: umaddl   x10, w8, w10, x9 */ ARM64("umaddl x10, w8, w10, x9");
    /* 0x00bc7600: ldr      x8, [x10] */ ARM64("ldr x8, [x10]");
    /* 0x00bc7604: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc7608: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc760c: b.eq     #0xbc9930 */ if (COND_EQ) goto loc_00bc9930;
    /* 0x00bc7610: ldr      x24, [x10, #0x10] */ ARM64("ldr x24, [x10, #0x10]");
    /* 0x00bc7614: ldr      x8, [sp, #0xb8] */ ARM64("ldr x8, [sp, #0xb8]");
    /* 0x00bc7618: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00bc761c: b.hi     #0xbc9530 */ if (COND_HI) goto loc_00bc9530;
    /* 0x00bc7620: stp      x12, x11, [sp, #0x20] */ ARM64("stp x12, x11, [sp, #0x20]");
    /* 0x00bc7624: str      x20, [sp, #0x40] */ ARM64("str x20, [sp, #0x40]");
    /* 0x00bc7628: str      x10, [sp, #0x18] */ ARM64("str x10, [sp, #0x18]");
    /* 0x00bc762c: ldr      x26, [x10, #8] */ ARM64("ldr x26, [x10, #8]");
    /* 0x00bc7630: add      x8, x24, x24, lsl #1 */ ARM64("add x8, x24, x24, lsl #1");
    /* 0x00bc7634: lsl      x20, x8, #3 */ ARM64("lsl x20, x8, #3");
    /* 0x00bc7638: cbz      x20, #0xbc7654 */ if (x20 == 0) goto loc_00bc7654;
    /* 0x00bc763c: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc7640: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00bc7644: cbz      x0, #0xbc9a44 */ if (x0 == 0) goto loc_00bc9a44;
    /* 0x00bc7648: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00bc764c: str      x24, [sp, #0x38] */ ARM64("str x24, [sp, #0x38]");
    /* 0x00bc7650: b        #0xbc765c */ goto loc_00bc765c;
loc_00bc7654:
    /* 0x00bc7654: str      xzr, [sp, #0x38] */ ARM64("str xzr, [sp, #0x38]");
    /* 0x00bc7658: mov      w21, #8 */ ARM64("mov w21, #8");
loc_00bc765c:
    /* 0x00bc765c: str      x23, [sp, #0x30] */ ARM64("str x23, [sp, #0x30]");
    /* 0x00bc7660: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00bc7664: cbz      x24, #0xbc8650 */ if (x24 == 0) goto loc_00bc8650;
loc_00bc7668:
    /* 0x00bc7668: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00bc766c: mov      x22, x26 */ ARM64("mov x22, x26");
    /* 0x00bc7670: madd     x8, x20, x8, x26 */ ARM64("madd x8, x20, x8, x26");
    /* 0x00bc7674: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7678: add      x1, x8, #8 */ ARM64("add x1, x8, #8");
    /* 0x00bc767c: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00bc7680: ldp      x8, x23, [sp, #0x1d0] */ ARM64("ldp x8, x23, [sp, #0x1d0]");
    /* 0x00bc7684: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
    /* 0x00bc7688: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc768c: mov      x26, x23 */ ARM64("mov x26, x23");
    /* 0x00bc7690: cbz      x8, #0xbc779c */ if (x8 == 0) goto loc_00bc779c;
    /* 0x00bc7694: add      x25, x23, x8, lsl #3 */ ARM64("add x25, x23, x8, lsl #3");
    /* 0x00bc7698: mov      x27, x23 */ ARM64("mov x27, x23");
    /* 0x00bc769c: mov      x26, x23 */ ARM64("mov x26, x23");
    /* 0x00bc76a0: b        #0xbc76b0 */ goto loc_00bc76b0;
loc_00bc76a4:
    /* 0x00bc76a4: str      x8, [x26], #8 */ ARM64("str x8, [x26], #8");
loc_00bc76a8:
    /* 0x00bc76a8: cmp      x27, x25 */ ARM64("cmp x27, x25");
    /* 0x00bc76ac: b.eq     #0xbc779c */ if (COND_EQ) goto loc_00bc779c;
loc_00bc76b0:
    /* 0x00bc76b0: ldr      x8, [sp, #0x1c8] */ ARM64("ldr x8, [sp, #0x1c8]");
    /* 0x00bc76b4: cbz      x8, #0xbc9540 */ if (x8 == 0) goto loc_00bc9540;
    /* 0x00bc76b8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc76bc: ldr      x28, [x27], #8 */ ARM64("ldr x28, [x27], #8");
    /* 0x00bc76c0: ldr      x1, [x28] */ ARM64("ldr x1, [x28]");
    /* 0x00bc76c4: add      x9, x1, #8 */ ARM64("add x9, x1, #8");
    /* 0x00bc76c8: mov      x10, #0xa95 */ ARM64("mov x10, #0xa95");
    /* 0x00bc76cc: movk     x10, #0x2722, lsl #16 */ ARM64("movk x10, #0x2722, lsl #16");
    /* 0x00bc76d0: movk     x10, #0xc1b7, lsl #32 */ ARM64("movk x10, #0xc1b7, lsl #32");
    /* 0x00bc76d4: movk     x10, #0x517c, lsl #48 */ ARM64("movk x10, #0x517c, lsl #48");
    /* 0x00bc76d8: mul      x11, x9, x10 */ ARM64("mul x11, x9, x10");
    /* 0x00bc76dc: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00bc76e0: ldp      x10, x9, [sp, #0x1b0] */ ARM64("ldp x10, x9, [sp, #0x1b0]");
    /* 0x00bc76e4: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00bc76e8: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc76ec: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc76f0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc76f4: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc76f8: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc76fc: b.eq     #0xbc772c */ if (COND_EQ) goto loc_00bc772c;
loc_00bc7700:
    /* 0x00bc7700: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00bc7704: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00bc7708: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00bc770c: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00bc7710: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00bc7714: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00bc7718: cmp      x1, x14 */ ARM64("cmp x1, x14");
    /* 0x00bc771c: b.eq     #0xbc7764 */ if (COND_EQ) goto loc_00bc7764;
    /* 0x00bc7720: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00bc7724: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00bc7728: b.ne     #0xbc7700 */ if (COND_NE) goto loc_00bc7700;
loc_00bc772c:
    /* 0x00bc772c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc7730: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc7734: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc7738: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00bc773c: tbnz     w12, #0, #0xbc9540 */ if (((w12 >> #0) & 1) != 0) goto loc_00bc9540;
    /* 0x00bc7740: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc7744: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00bc7748: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc774c: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc7750: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc7754: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc7758: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc775c: b.ne     #0xbc7700 */ if (COND_NE) goto loc_00bc7700;
    /* 0x00bc7760: b        #0xbc772c */ goto loc_00bc772c;
loc_00bc7764:
    /* 0x00bc7764: ldur     x8, [x13, #-8] */ ARM64("ldur x8, [x13, #-8]");
    /* 0x00bc7768: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc776c: b.ne     #0xbc76a8 */ if (COND_NE) goto loc_00bc76a8;
    /* 0x00bc7770: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00bc7774: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00bc7778: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00bc777c: b.eq     #0xbc76a8 */ if (COND_EQ) goto loc_00bc76a8;
    /* 0x00bc7780: ldr      x8, [x28] */ ARM64("ldr x8, [x28]");
loc_00bc7784:
    /* 0x00bc7784: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc7788: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00bc778c: stxr     w11, x10, [x8] */ ARM64("stxr w11, x10, [x8]");
    /* 0x00bc7790: cbnz     w11, #0xbc7784 */ if (w11 != 0) goto loc_00bc7784;
    /* 0x00bc7794: tbz      x9, #0x3f, #0xbc76a4 */ if (((x9 >> #0x3f) & 1) == 0) goto loc_00bc76a4;
    /* 0x00bc7798: b        #0xbc9508 */ goto loc_00bc9508;
loc_00bc779c:
    /* 0x00bc779c: sub      x8, x26, x23 */ ARM64("sub x8, x26, x23");
    /* 0x00bc77a0: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00bc77a4: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00bc77a8: madd     x9, x20, x9, x21 */ ARM64("madd x9, x20, x9, x21");
    /* 0x00bc77ac: ldr      x10, [sp, #0x48] */ ARM64("ldr x10, [sp, #0x48]");
    /* 0x00bc77b0: stp      x10, x23, [x9] */ ARM64("stp x10, x23, [x9]");
    /* 0x00bc77b4: str      x8, [x9, #0x10] */ ARM64("str x8, [x9, #0x10]");
    /* 0x00bc77b8: add      x20, x20, #1 */ ARM64("add x20, x20, #1");
    /* 0x00bc77bc: cmp      x20, x24 */ ARM64("cmp x20, x24");
    /* 0x00bc77c0: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc77c4: mov      x26, x22 */ ARM64("mov x26, x22");
    /* 0x00bc77c8: b.ne     #0xbc7668 */ if (COND_NE) goto loc_00bc7668;
    /* 0x00bc77cc: cbz      x20, #0xbc8650 */ if (x20 == 0) goto loc_00bc8650;
    /* 0x00bc77d0: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00bc77d4: b        #0xbc77e4 */ goto loc_00bc77e4;
loc_00bc77d8:
    /* 0x00bc77d8: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
loc_00bc77dc:
    /* 0x00bc77dc: cmp      x26, x20 */ ARM64("cmp x26, x20");
    /* 0x00bc77e0: b.hs     #0xbc8650 */ if (COND_HS) goto loc_00bc8650;
loc_00bc77e4:
    /* 0x00bc77e4: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00bc77e8: str      q1, [sp, #0x430] */ ARM64("str q1, [sp, #0x430]");
    /* 0x00bc77ec: str      q0, [sp, #0x440] */ ARM64("str q0, [sp, #0x440]");
    /* 0x00bc77f0: ldr      x10, [sp, #0x198] */ ARM64("ldr x10, [sp, #0x198]");
    /* 0x00bc77f4: ldr      x8, [x10] */ ARM64("ldr x8, [x10]");
    /* 0x00bc77f8: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc77fc: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc7800: b.eq     #0xbc9aa8 */ if (COND_EQ) goto loc_00bc9aa8;
    /* 0x00bc7804: ldr      x28, [x10, #0x10] */ ARM64("ldr x28, [x10, #0x10]");
    /* 0x00bc7808: cbz      x28, #0xbc77d8 */ if (x28 == 0) goto loc_00bc77d8;
    /* 0x00bc780c: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00bc7810: madd     x24, x26, x8, x21 */ ARM64("madd x24, x26, x8, x21");
loc_00bc7814:
    /* 0x00bc7814: cmp      x26, x20 */ ARM64("cmp x26, x20");
    /* 0x00bc7818: b.hs     #0xbc9a54 */ if (COND_HS) goto loc_00bc9a54;
    /* 0x00bc781c: sub      x28, x28, #1 */ ARM64("sub x28, x28, #1");
    /* 0x00bc7820: ldp      x8, x9, [x24, #8] */ ARM64("ldp x8, x9, [x24, #8]");
    /* 0x00bc7824: lsl      x9, x9, #3 */ ARM64("lsl x9, x9, #3");
loc_00bc7828:
    /* 0x00bc7828: cbz      x9, #0xbc8458 */ if (x9 == 0) goto loc_00bc8458;
    /* 0x00bc782c: ldr      x10, [x8], #8 */ ARM64("ldr x10, [x8], #8");
    /* 0x00bc7830: sub      x9, x9, #8 */ ARM64("sub x9, x9, #8");
    /* 0x00bc7834: cbz      x10, #0xbc7828 */ if (x10 == 0) goto loc_00bc7828;
    /* 0x00bc7838: ldr      x10, [sp, #0x198] */ ARM64("ldr x10, [sp, #0x198]");
    /* 0x00bc783c: ldr      x8, [x10] */ ARM64("ldr x8, [x10]");
    /* 0x00bc7840: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc7844: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc7848: b.eq     #0xbc9a9c */ if (COND_EQ) goto loc_00bc9a9c;
    /* 0x00bc784c: ldr      x1, [x10, #0x10] */ ARM64("ldr x1, [x10, #0x10]");
    /* 0x00bc7850: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc7854: b.hs     #0xbc9ab4 */ if (COND_HS) goto loc_00bc9ab4;
    /* 0x00bc7858: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc785c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7860: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7864: madd     x1, x28, x9, x8 */ ARM64("madd x1, x28, x9, x8");
    /* 0x00bc7868: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc786c: bl       #0xbca948 */ CALL_DIRECT(sub_00bca948);
    /* 0x00bc7870: ldp      x22, x23, [sp, #0x1d0] */ ARM64("ldp x22, x23, [sp, #0x1d0]");
    /* 0x00bc7874: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc7878: add      x8, x23, x8, lsl #3 */ ARM64("add x8, x23, x8, lsl #3");
    /* 0x00bc787c: mov      x9, x23 */ ARM64("mov x9, x23");
    /* 0x00bc7880: b        #0xbc7914 */ goto loc_00bc7914;
loc_00bc7884:
    /* 0x00bc7884: ldp      x15, x14, [sp, #0x180] */ ARM64("ldp x15, x14, [sp, #0x180]");
    /* 0x00bc7888: and      x13, x13, x15 */ ARM64("and x13, x13, x15");
    /* 0x00bc788c: ldr      x14, [x14, x13] */ ARM64("ldr x14, [x14, x13]");
    /* 0x00bc7890: eor      x15, x14, x12 */ ARM64("eor x15, x14, x12");
    /* 0x00bc7894: mov      x16, #-0x101010101010102 */ ARM64("mov x16, #-0x101010101010102");
    /* 0x00bc7898: movk     x16, #0xfeff */ ARM64("movk x16, #0xfeff");
    /* 0x00bc789c: add      x16, x15, x16 */ ARM64("add x16, x15, x16");
    /* 0x00bc78a0: bic      x15, x16, x15 */ ARM64("bic x15, x16, x15");
    /* 0x00bc78a4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc78a8: b.eq     #0xbc78fc */ if (COND_EQ) goto loc_00bc78fc;
loc_00bc78ac:
    /* 0x00bc78ac: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc78b0: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc78b4: add      x16, x13, x16, lsr #3 */ ARM64("add x16, x13, x16, lsr #3");
    /* 0x00bc78b8: ldr      x17, [sp, #0x180] */ ARM64("ldr x17, [sp, #0x180]");
    /* 0x00bc78bc: and      x16, x16, x17 */ ARM64("and x16, x16, x17");
    /* 0x00bc78c0: ldr      x17, [sp, #0x188] */ ARM64("ldr x17, [sp, #0x188]");
    /* 0x00bc78c4: sub      x16, x17, x16, lsl #3 */ ARM64("sub x16, x17, x16, lsl #3");
    /* 0x00bc78c8: ldur     x0, [x16, #-8] */ ARM64("ldur x0, [x16, #-8]");
    /* 0x00bc78cc: ldr      x16, [sp, #0xd8] */ ARM64("ldr x16, [sp, #0xd8]");
    /* 0x00bc78d0: cmp      x0, x16 */ ARM64("cmp x0, x16");
    /* 0x00bc78d4: b.hs     #0xbc9ad4 */ if (COND_HS) goto loc_00bc9ad4;
    /* 0x00bc78d8: mov      w16, #0x18 */ ARM64("mov w16, #0x18");
    /* 0x00bc78dc: mul      x16, x0, x16 */ ARM64("mul x16, x0, x16");
    /* 0x00bc78e0: ldr      x17, [sp, #0xd0] */ ARM64("ldr x17, [sp, #0xd0]");
    /* 0x00bc78e4: ldr      x16, [x17, x16] */ ARM64("ldr x16, [x17, x16]");
    /* 0x00bc78e8: cmp      x11, x16 */ ARM64("cmp x11, x16");
    /* 0x00bc78ec: b.eq     #0xbc844c */ if (COND_EQ) goto loc_00bc844c;
    /* 0x00bc78f0: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc78f4: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc78f8: b.ne     #0xbc78ac */ if (COND_NE) goto loc_00bc78ac;
loc_00bc78fc:
    /* 0x00bc78fc: and      x14, x14, x14, lsl #1 */ ARM64("and x14, x14, x14, lsl #1");
    /* 0x00bc7900: tst      x14, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x14, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7904: b.ne     #0xbc7a1c */ if (COND_NE) goto loc_00bc7a1c;
    /* 0x00bc7908: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00bc790c: add      x13, x13, x10 */ ARM64("add x13, x13, x10");
    /* 0x00bc7910: b        #0xbc7884 */ goto loc_00bc7884;
loc_00bc7914:
    /* 0x00bc7914: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc7918: b.eq     #0xbc7a24 */ if (COND_EQ) goto loc_00bc7a24;
    /* 0x00bc791c: ldr      x10, [sp, #0x178] */ ARM64("ldr x10, [sp, #0x178]");
    /* 0x00bc7920: cbz      x10, #0xbc7a1c */ if (x10 == 0) goto loc_00bc7a1c;
    /* 0x00bc7924: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc7928: ldr      x11, [x9] */ ARM64("ldr x11, [x9]");
    /* 0x00bc792c: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc7930: add      x12, x11, #8 */ ARM64("add x12, x11, #8");
    /* 0x00bc7934: ldp      x13, x14, [sp, #0x138] */ ARM64("ldp x13, x14, [sp, #0x138]");
    /* 0x00bc7938: eor      x13, x13, x12 */ ARM64("eor x13, x13, x12");
    /* 0x00bc793c: add      x14, x13, x14 */ ARM64("add x14, x13, x14");
    /* 0x00bc7940: eor      x13, x14, x13, ror #48 */ ARM64("eor x13, x14, x13, ror #48");
    /* 0x00bc7944: ldp      x15, x16, [sp, #0x128] */ ARM64("ldp x15, x16, [sp, #0x128]");
    /* 0x00bc7948: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc794c: eor      x12, x15, x12 */ ARM64("eor x12, x15, x12");
    /* 0x00bc7950: add      x14, x14, x16 */ ARM64("add x14, x14, x16");
    /* 0x00bc7954: eor      x13, x15, x13, ror #43 */ ARM64("eor x13, x15, x13, ror #43");
    /* 0x00bc7958: ror      x15, x14, #0x20 */ ARM64("ror x15, x14, #0x20");
    /* 0x00bc795c: ldr      x16, [sp, #0x120] */ ARM64("ldr x16, [sp, #0x120]");
    /* 0x00bc7960: eor      x14, x14, x16 */ ARM64("eor x14, x14, x16");
    /* 0x00bc7964: eor      x13, x13, #0x800000000000000 */ ARM64("eor x13, x13, #0x800000000000000");
    /* 0x00bc7968: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc796c: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc7970: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc7974: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc7978: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc797c: add      x15, x15, x14 */ ARM64("add x15, x15, x14");
    /* 0x00bc7980: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc7984: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc7988: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc798c: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc7990: eor      x12, x12, #0x800000000000000 */ ARM64("eor x12, x12, #0x800000000000000");
    /* 0x00bc7994: eor      x15, x15, #0xff */ ARM64("eor x15, x15, #0xff");
    /* 0x00bc7998: add      x12, x12, x14 */ ARM64("add x12, x12, x14");
    /* 0x00bc799c: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc79a0: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc79a4: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc79a8: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc79ac: add      x15, x14, x15 */ ARM64("add x15, x14, x15");
    /* 0x00bc79b0: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc79b4: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc79b8: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc79bc: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc79c0: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc79c4: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc79c8: eor      x14, x12, x14, ror #51 */ ARM64("eor x14, x12, x14, ror #51");
    /* 0x00bc79cc: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc79d0: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00bc79d4: add      x15, x14, x15 */ ARM64("add x15, x14, x15");
    /* 0x00bc79d8: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00bc79dc: eor      x14, x15, x14, ror #47 */ ARM64("eor x14, x15, x14, ror #47");
    /* 0x00bc79e0: eor      x13, x12, x13, ror #43 */ ARM64("eor x13, x12, x13, ror #43");
    /* 0x00bc79e4: ror      x15, x15, #0x20 */ ARM64("ror x15, x15, #0x20");
    /* 0x00bc79e8: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00bc79ec: add      x15, x13, x15 */ ARM64("add x15, x13, x15");
    /* 0x00bc79f0: eor      x12, x12, x14, ror #51 */ ARM64("eor x12, x12, x14, ror #51");
    /* 0x00bc79f4: eor      x13, x15, x13, ror #48 */ ARM64("eor x13, x15, x13, ror #48");
    /* 0x00bc79f8: ror      x13, x13, #0x2b */ ARM64("ror x13, x13, #0x2b");
    /* 0x00bc79fc: add      x14, x12, x15 */ ARM64("add x14, x12, x15");
    /* 0x00bc7a00: eor      x12, x13, x12, ror #47 */ ARM64("eor x12, x13, x12, ror #47");
    /* 0x00bc7a04: eor      x12, x12, x14, ror #32 */ ARM64("eor x12, x12, x14, ror #32");
    /* 0x00bc7a08: eor      x13, x12, x14 */ ARM64("eor x13, x12, x14");
    /* 0x00bc7a0c: lsr      x12, x13, #0x39 */ ARM64("lsr x12, x13, #0x39");
    /* 0x00bc7a10: mov      x14, #0x101010101010101 */ ARM64("mov x14, #0x101010101010101");
    /* 0x00bc7a14: mul      x12, x12, x14 */ ARM64("mul x12, x12, x14");
    /* 0x00bc7a18: b        #0xbc7884 */ goto loc_00bc7884;
loc_00bc7a1c:
    /* 0x00bc7a1c: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00bc7a20: b        #0xbc7914 */ goto loc_00bc7914;
loc_00bc7a24:
    /* 0x00bc7a24: cbz      x22, #0xbc7a30 */ if (x22 == 0) goto loc_00bc7a30;
    /* 0x00bc7a28: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc7a2c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc7a30:
    /* 0x00bc7a30: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc7a34: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7a38: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc7a3c: b.hs     #0xbc9bc4 */ if (COND_HS) goto loc_00bc9bc4;
    /* 0x00bc7a40: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc7a44: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7a48: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7a4c: madd     x1, x28, x9, x8 */ ARM64("madd x1, x28, x9, x8");
    /* 0x00bc7a50: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7a54: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc7a58: ldp      x8, x0, [sp, #0x1d0] */ ARM64("ldp x8, x0, [sp, #0x1d0]");
    /* 0x00bc7a5c: ldr      x9, [sp, #0x1e0] */ ARM64("ldr x9, [sp, #0x1e0]");
    /* 0x00bc7a60: cbz      x9, #0xbc7bd8 */ if (x9 == 0) goto loc_00bc7bd8;
    /* 0x00bc7a64: ldr      x10, [sp, #0xc0] */ ARM64("ldr x10, [sp, #0xc0]");
    /* 0x00bc7a68: cbz      x10, #0xbc7bd8 */ if (x10 == 0) goto loc_00bc7bd8;
    /* 0x00bc7a6c: add      x9, x0, x9, lsl #3 */ ARM64("add x9, x0, x9, lsl #3");
    /* 0x00bc7a70: ldr      x10, [sp, #0x448] */ ARM64("ldr x10, [sp, #0x448]");
    /* 0x00bc7a74: mov      x11, x0 */ ARM64("mov x11, x0");
    /* 0x00bc7a78: ldr      x12, [sp, #0x438] */ ARM64("ldr x12, [sp, #0x438]");
    /* 0x00bc7a7c: ldr      x13, [sp, #0x430] */ ARM64("ldr x13, [sp, #0x430]");
    /* 0x00bc7a80: b        #0xbc7ba8 */ goto loc_00bc7ba8;
loc_00bc7a84:
    /* 0x00bc7a84: ldr      x17, [sp, #0x168] */ ARM64("ldr x17, [sp, #0x168]");
    /* 0x00bc7a88: and      x16, x16, x17 */ ARM64("and x16, x16, x17");
    /* 0x00bc7a8c: ldr      x17, [sp, #0x160] */ ARM64("ldr x17, [sp, #0x160]");
    /* 0x00bc7a90: ldr      d1, [x17, x16] */ ARM64("ldr d1, [x17, x16]");
    /* 0x00bc7a94: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc7a98: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc7a9c: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7aa0: b.eq     #0xbc7ad4 */ if (COND_EQ) goto loc_00bc7ad4;
loc_00bc7aa4:
    /* 0x00bc7aa4: rbit     x1, x17 */ ARM64("rbit x1, x17");
    /* 0x00bc7aa8: clz      x1, x1 */ ARM64("clz x1, x1");
    /* 0x00bc7aac: add      x2, x16, x1, lsr #3 */ ARM64("add x2, x16, x1, lsr #3");
    /* 0x00bc7ab0: ldp      x1, x3, [sp, #0x160] */ ARM64("ldp x1, x3, [sp, #0x160]");
    /* 0x00bc7ab4: and      x2, x2, x3 */ ARM64("and x2, x2, x3");
    /* 0x00bc7ab8: sub      x2, x1, x2, lsl #4 */ ARM64("sub x2, x1, x2, lsl #4");
    /* 0x00bc7abc: ldur     x1, [x2, #-0x10] */ ARM64("ldur x1, [x2, #-0x10]");
    /* 0x00bc7ac0: cmp      x15, x1 */ ARM64("cmp x15, x1");
    /* 0x00bc7ac4: b.eq     #0xbc7af4 */ if (COND_EQ) goto loc_00bc7af4;
    /* 0x00bc7ac8: sub      x1, x17, #1 */ ARM64("sub x1, x17, #1");
    /* 0x00bc7acc: ands     x17, x1, x17 */ ARM64("ands x17, x1, x17");
    /* 0x00bc7ad0: b.ne     #0xbc7aa4 */ if (COND_NE) goto loc_00bc7aa4;
loc_00bc7ad4:
    /* 0x00bc7ad4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc7ad8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc7adc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc7ae0: fmov     w17, s1 */ ARM64("fmov w17, s1");
    /* 0x00bc7ae4: tbnz     w17, #0, #0xbc7ba0 */ if (((w17 >> #0) & 1) != 0) goto loc_00bc7ba0;
    /* 0x00bc7ae8: add      x14, x14, #8 */ ARM64("add x14, x14, #8");
    /* 0x00bc7aec: add      x16, x16, x14 */ ARM64("add x16, x16, x14");
    /* 0x00bc7af0: b        #0xbc7a84 */ goto loc_00bc7a84;
loc_00bc7af4:
    /* 0x00bc7af4: cbz      x10, #0xbc7ba0 */ if (x10 == 0) goto loc_00bc7ba0;
    /* 0x00bc7af8: mov      x14, #0 */ ARM64("mov x14, #0");
    /* 0x00bc7afc: ldur     x15, [x2, #-8] */ ARM64("ldur x15, [x2, #-8]");
    /* 0x00bc7b00: mov      x16, #0xa95 */ ARM64("mov x16, #0xa95");
    /* 0x00bc7b04: movk     x16, #0x2722, lsl #16 */ ARM64("movk x16, #0x2722, lsl #16");
    /* 0x00bc7b08: movk     x16, #0xc1b7, lsl #32 */ ARM64("movk x16, #0xc1b7, lsl #32");
    /* 0x00bc7b0c: movk     x16, #0x517c, lsl #48 */ ARM64("movk x16, #0x517c, lsl #48");
    /* 0x00bc7b10: mul      x16, x15, x16 */ ARM64("mul x16, x15, x16");
    /* 0x00bc7b14: lsr      x17, x16, #0x39 */ ARM64("lsr x17, x16, #0x39");
    /* 0x00bc7b18: dup      v0.8b, w17 */ ARM64("dup v0.8b, w17");
    /* 0x00bc7b1c: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc7b20: ldr      d1, [x13, x16] */ ARM64("ldr d1, [x13, x16]");
    /* 0x00bc7b24: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc7b28: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc7b2c: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7b30: b.eq     #0xbc7b68 */ if (COND_EQ) goto loc_00bc7b68;
loc_00bc7b34:
    /* 0x00bc7b34: str      x0, [sp, #0x48] */ ARM64("str x0, [sp, #0x48]");
loc_00bc7b38:
    /* 0x00bc7b38: rbit     x0, x17 */ ARM64("rbit x0, x17");
    /* 0x00bc7b3c: clz      x0, x0 */ ARM64("clz x0, x0");
    /* 0x00bc7b40: add      x0, x16, x0, lsr #3 */ ARM64("add x0, x16, x0, lsr #3");
    /* 0x00bc7b44: and      x0, x0, x12 */ ARM64("and x0, x0, x12");
    /* 0x00bc7b48: sub      x0, x13, x0, lsl #3 */ ARM64("sub x0, x13, x0, lsl #3");
    /* 0x00bc7b4c: ldur     x0, [x0, #-8] */ ARM64("ldur x0, [x0, #-8]");
    /* 0x00bc7b50: cmp      x15, x0 */ ARM64("cmp x15, x0");
    /* 0x00bc7b54: b.eq     #0xbc7c58 */ if (COND_EQ) goto loc_00bc7c58;
    /* 0x00bc7b58: sub      x0, x17, #1 */ ARM64("sub x0, x17, #1");
    /* 0x00bc7b5c: ands     x17, x0, x17 */ ARM64("ands x17, x0, x17");
    /* 0x00bc7b60: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc7b64: b.ne     #0xbc7b38 */ if (COND_NE) goto loc_00bc7b38;
loc_00bc7b68:
    /* 0x00bc7b68: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc7b6c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc7b70: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc7b74: fmov     w17, s1 */ ARM64("fmov w17, s1");
    /* 0x00bc7b78: tbnz     w17, #0, #0xbc7ba0 */ if (((w17 >> #0) & 1) != 0) goto loc_00bc7ba0;
    /* 0x00bc7b7c: add      x14, x14, #8 */ ARM64("add x14, x14, #8");
    /* 0x00bc7b80: add      x16, x16, x14 */ ARM64("add x16, x16, x14");
    /* 0x00bc7b84: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc7b88: ldr      d1, [x13, x16] */ ARM64("ldr d1, [x13, x16]");
    /* 0x00bc7b8c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc7b90: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00bc7b94: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7b98: b.ne     #0xbc7b34 */ if (COND_NE) goto loc_00bc7b34;
    /* 0x00bc7b9c: b        #0xbc7b68 */ goto loc_00bc7b68;
loc_00bc7ba0:
    /* 0x00bc7ba0: cmp      x11, x9 */ ARM64("cmp x11, x9");
    /* 0x00bc7ba4: b.eq     #0xbc7bd8 */ if (COND_EQ) goto loc_00bc7bd8;
loc_00bc7ba8:
    /* 0x00bc7ba8: mov      x14, #0 */ ARM64("mov x14, #0");
    /* 0x00bc7bac: ldr      x15, [x11], #8 */ ARM64("ldr x15, [x11], #8");
    /* 0x00bc7bb0: ldr      x15, [x15] */ ARM64("ldr x15, [x15]");
    /* 0x00bc7bb4: add      x16, x15, #8 */ ARM64("add x16, x15, #8");
    /* 0x00bc7bb8: mov      x17, #0xa95 */ ARM64("mov x17, #0xa95");
    /* 0x00bc7bbc: movk     x17, #0x2722, lsl #16 */ ARM64("movk x17, #0x2722, lsl #16");
    /* 0x00bc7bc0: movk     x17, #0xc1b7, lsl #32 */ ARM64("movk x17, #0xc1b7, lsl #32");
    /* 0x00bc7bc4: movk     x17, #0x517c, lsl #48 */ ARM64("movk x17, #0x517c, lsl #48");
    /* 0x00bc7bc8: mul      x16, x16, x17 */ ARM64("mul x16, x16, x17");
    /* 0x00bc7bcc: lsr      x17, x16, #0x39 */ ARM64("lsr x17, x16, #0x39");
    /* 0x00bc7bd0: dup      v0.8b, w17 */ ARM64("dup v0.8b, w17");
    /* 0x00bc7bd4: b        #0xbc7a84 */ goto loc_00bc7a84;
loc_00bc7bd8:
    /* 0x00bc7bd8: str      x24, [sp, #0x10] */ ARM64("str x24, [sp, #0x10]");
    /* 0x00bc7bdc: cbz      x8, #0xbc7be4 */ if (x8 == 0) goto loc_00bc7be4;
    /* 0x00bc7be0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc7be4:
    /* 0x00bc7be4: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc7be8: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7bec: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc7bf0: b.hs     #0xbc9bd4 */ if (COND_HS) goto loc_00bc9bd4;
    /* 0x00bc7bf4: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc7bf8: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7bfc: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7c00: madd     x27, x28, x9, x8 */ ARM64("madd x27, x28, x9, x8");
    /* 0x00bc7c04: ldr      x8, [x27, #0x18] */ ARM64("ldr x8, [x27, #0x18]");
    /* 0x00bc7c08: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00bc7c0c: b.ne     #0xbc81bc */ if (COND_NE) goto loc_00bc81bc;
    /* 0x00bc7c10: ldr      x8, [x27, #0x48] */ ARM64("ldr x8, [x27, #0x48]");
    /* 0x00bc7c14: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc7c18: b.ne     #0xbc81bc */ if (COND_NE) goto loc_00bc81bc;
    /* 0x00bc7c1c: ldr      x23, [x27, #0x40] */ ARM64("ldr x23, [x27, #0x40]");
    /* 0x00bc7c20: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00bc7c24: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc7c28: add      x11, x11, #0x626 */ ARM64("add x11, x11, #0x626");
    /* 0x00bc7c2c: adr      x9, #0xbc7c3c */ ARM64("adr x9, #0xbc7c3c");
    /* 0x00bc7c30: ldrh     w10, [x11, x8, lsl #1] */ ARM64("ldrh w10, [x11, x8, lsl #1]");
    /* 0x00bc7c34: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc7c38: br       x9 */ ARM64("br x9");
loc_00bc7c3c:
    /* 0x00bc7c3c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7c40: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00bc7c44: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00bc7c48: ldp      x23, x8, [sp, #0x1d8] */ ARM64("ldp x23, x8, [sp, #0x1d8]");
    /* 0x00bc7c4c: add      x22, x23, x8, lsl #3 */ ARM64("add x22, x23, x8, lsl #3");
    /* 0x00bc7c50: mov      x24, x23 */ ARM64("mov x24, x23");
    /* 0x00bc7c54: b        #0xbc7cf0 */ goto loc_00bc7cf0;
loc_00bc7c58:
    /* 0x00bc7c58: cbnz     x8, #0xbc8414 */ if (x8 != 0) goto loc_00bc8414;
    /* 0x00bc7c5c: b        #0xbc841c */ goto loc_00bc841c;
loc_00bc7c60:
    /* 0x00bc7c60: ldp      x13, x12, [sp, #0x180] */ ARM64("ldp x13, x12, [sp, #0x180]");
    /* 0x00bc7c64: and      x11, x11, x13 */ ARM64("and x11, x11, x13");
    /* 0x00bc7c68: ldr      x12, [x12, x11] */ ARM64("ldr x12, [x12, x11]");
    /* 0x00bc7c6c: eor      x13, x12, x10 */ ARM64("eor x13, x12, x10");
    /* 0x00bc7c70: mov      x14, #-0x101010101010102 */ ARM64("mov x14, #-0x101010101010102");
    /* 0x00bc7c74: movk     x14, #0xfeff */ ARM64("movk x14, #0xfeff");
    /* 0x00bc7c78: add      x14, x13, x14 */ ARM64("add x14, x13, x14");
    /* 0x00bc7c7c: bic      x13, x14, x13 */ ARM64("bic x13, x14, x13");
    /* 0x00bc7c80: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7c84: b.eq     #0xbc7cd8 */ if (COND_EQ) goto loc_00bc7cd8;
loc_00bc7c88:
    /* 0x00bc7c88: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00bc7c8c: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00bc7c90: add      x14, x11, x14, lsr #3 */ ARM64("add x14, x11, x14, lsr #3");
    /* 0x00bc7c94: ldr      x15, [sp, #0x180] */ ARM64("ldr x15, [sp, #0x180]");
    /* 0x00bc7c98: and      x14, x14, x15 */ ARM64("and x14, x14, x15");
    /* 0x00bc7c9c: ldr      x15, [sp, #0x188] */ ARM64("ldr x15, [sp, #0x188]");
    /* 0x00bc7ca0: sub      x14, x15, x14, lsl #3 */ ARM64("sub x14, x15, x14, lsl #3");
    /* 0x00bc7ca4: ldur     x0, [x14, #-8] */ ARM64("ldur x0, [x14, #-8]");
    /* 0x00bc7ca8: ldr      x14, [sp, #0xd8] */ ARM64("ldr x14, [sp, #0xd8]");
    /* 0x00bc7cac: cmp      x0, x14 */ ARM64("cmp x0, x14");
    /* 0x00bc7cb0: b.hs     #0xbc9be4 */ if (COND_HS) goto loc_00bc9be4;
    /* 0x00bc7cb4: mov      w14, #0x18 */ ARM64("mov w14, #0x18");
    /* 0x00bc7cb8: mul      x14, x0, x14 */ ARM64("mul x14, x0, x14");
    /* 0x00bc7cbc: ldr      x15, [sp, #0xd0] */ ARM64("ldr x15, [sp, #0xd0]");
    /* 0x00bc7cc0: ldr      x14, [x15, x14] */ ARM64("ldr x14, [x15, x14]");
    /* 0x00bc7cc4: cmp      x9, x14 */ ARM64("cmp x9, x14");
    /* 0x00bc7cc8: b.eq     #0xbc7e00 */ if (COND_EQ) goto loc_00bc7e00;
    /* 0x00bc7ccc: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00bc7cd0: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00bc7cd4: b.ne     #0xbc7c88 */ if (COND_NE) goto loc_00bc7c88;
loc_00bc7cd8:
    /* 0x00bc7cd8: and      x12, x12, x12, lsl #1 */ ARM64("and x12, x12, x12, lsl #1");
    /* 0x00bc7cdc: tst      x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc7ce0: b.ne     #0xbc7df8 */ if (COND_NE) goto loc_00bc7df8;
    /* 0x00bc7ce4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc7ce8: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00bc7cec: b        #0xbc7c60 */ goto loc_00bc7c60;
loc_00bc7cf0:
    /* 0x00bc7cf0: cmp      x24, x22 */ ARM64("cmp x24, x22");
    /* 0x00bc7cf4: b.eq     #0xbc7e00 */ if (COND_EQ) goto loc_00bc7e00;
    /* 0x00bc7cf8: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00bc7cfc: cbz      x8, #0xbc7df8 */ if (x8 == 0) goto loc_00bc7df8;
    /* 0x00bc7d00: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc7d04: ldr      x9, [x24] */ ARM64("ldr x9, [x24]");
    /* 0x00bc7d08: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00bc7d0c: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00bc7d10: ldp      x11, x12, [sp, #0x138] */ ARM64("ldp x11, x12, [sp, #0x138]");
    /* 0x00bc7d14: eor      x11, x11, x10 */ ARM64("eor x11, x11, x10");
    /* 0x00bc7d18: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00bc7d1c: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00bc7d20: ldp      x13, x14, [sp, #0x128] */ ARM64("ldp x13, x14, [sp, #0x128]");
    /* 0x00bc7d24: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00bc7d28: eor      x10, x13, x10 */ ARM64("eor x10, x13, x10");
    /* 0x00bc7d2c: add      x12, x12, x14 */ ARM64("add x12, x12, x14");
    /* 0x00bc7d30: eor      x11, x13, x11, ror #43 */ ARM64("eor x11, x13, x11, ror #43");
    /* 0x00bc7d34: ror      x13, x12, #0x20 */ ARM64("ror x13, x12, #0x20");
    /* 0x00bc7d38: ldr      x14, [sp, #0x120] */ ARM64("ldr x14, [sp, #0x120]");
    /* 0x00bc7d3c: eor      x12, x12, x14 */ ARM64("eor x12, x12, x14");
    /* 0x00bc7d40: eor      x11, x11, #0x800000000000000 */ ARM64("eor x11, x11, #0x800000000000000");
    /* 0x00bc7d44: add      x10, x12, x10 */ ARM64("add x10, x12, x10");
    /* 0x00bc7d48: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00bc7d4c: eor      x12, x10, x12, ror #51 */ ARM64("eor x12, x10, x12, ror #51");
    /* 0x00bc7d50: eor      x11, x13, x11, ror #48 */ ARM64("eor x11, x13, x11, ror #48");
    /* 0x00bc7d54: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00bc7d58: add      x13, x13, x12 */ ARM64("add x13, x13, x12");
    /* 0x00bc7d5c: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00bc7d60: eor      x12, x13, x12, ror #47 */ ARM64("eor x12, x13, x12, ror #47");
    /* 0x00bc7d64: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00bc7d68: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00bc7d6c: eor      x10, x10, #0x800000000000000 */ ARM64("eor x10, x10, #0x800000000000000");
    /* 0x00bc7d70: eor      x13, x13, #0xff */ ARM64("eor x13, x13, #0xff");
    /* 0x00bc7d74: add      x10, x10, x12 */ ARM64("add x10, x10, x12");
    /* 0x00bc7d78: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00bc7d7c: eor      x12, x10, x12, ror #51 */ ARM64("eor x12, x10, x12, ror #51");
    /* 0x00bc7d80: eor      x11, x13, x11, ror #48 */ ARM64("eor x11, x13, x11, ror #48");
    /* 0x00bc7d84: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00bc7d88: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00bc7d8c: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00bc7d90: eor      x12, x13, x12, ror #47 */ ARM64("eor x12, x13, x12, ror #47");
    /* 0x00bc7d94: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00bc7d98: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00bc7d9c: add      x10, x12, x10 */ ARM64("add x10, x12, x10");
    /* 0x00bc7da0: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00bc7da4: eor      x12, x10, x12, ror #51 */ ARM64("eor x12, x10, x12, ror #51");
    /* 0x00bc7da8: eor      x11, x13, x11, ror #48 */ ARM64("eor x11, x13, x11, ror #48");
    /* 0x00bc7dac: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00bc7db0: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00bc7db4: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00bc7db8: eor      x12, x13, x12, ror #47 */ ARM64("eor x12, x13, x12, ror #47");
    /* 0x00bc7dbc: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00bc7dc0: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00bc7dc4: add      x10, x12, x10 */ ARM64("add x10, x12, x10");
    /* 0x00bc7dc8: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00bc7dcc: eor      x10, x10, x12, ror #51 */ ARM64("eor x10, x10, x12, ror #51");
    /* 0x00bc7dd0: eor      x11, x13, x11, ror #48 */ ARM64("eor x11, x13, x11, ror #48");
    /* 0x00bc7dd4: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00bc7dd8: add      x12, x10, x13 */ ARM64("add x12, x10, x13");
    /* 0x00bc7ddc: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00bc7de0: eor      x10, x10, x12, ror #32 */ ARM64("eor x10, x10, x12, ror #32");
    /* 0x00bc7de4: eor      x11, x10, x12 */ ARM64("eor x11, x10, x12");
    /* 0x00bc7de8: lsr      x10, x11, #0x39 */ ARM64("lsr x10, x11, #0x39");
    /* 0x00bc7dec: mov      x12, #0x101010101010101 */ ARM64("mov x12, #0x101010101010101");
    /* 0x00bc7df0: mul      x10, x10, x12 */ ARM64("mul x10, x10, x12");
    /* 0x00bc7df4: b        #0xbc7c60 */ goto loc_00bc7c60;
loc_00bc7df8:
    /* 0x00bc7df8: add      x24, x24, #8 */ ARM64("add x24, x24, #8");
    /* 0x00bc7dfc: b        #0xbc7cf0 */ goto loc_00bc7cf0;
loc_00bc7e00:
    /* 0x00bc7e00: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc7e04: cbz      x8, #0xbc7e10 */ if (x8 == 0) goto loc_00bc7e10;
    /* 0x00bc7e08: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc7e0c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc7e10:
    /* 0x00bc7e10: cmp      x24, x22 */ ARM64("cmp x24, x22");
    /* 0x00bc7e14: b.ne     #0xbc81bc */ if (COND_NE) goto loc_00bc81bc;
    /* 0x00bc7e18: ldr      x8, [x27, #0x30] */ ARM64("ldr x8, [x27, #0x30]");
    /* 0x00bc7e1c: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc7e20: b.ne     #0xbc81bc */ if (COND_NE) goto loc_00bc81bc;
    /* 0x00bc7e24: ldr      x8, [x27, #0x28] */ ARM64("ldr x8, [x27, #0x28]");
    /* 0x00bc7e28: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc7e2c: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc7e30: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc7e34: b.ne     #0xbc81bc */ if (COND_NE) goto loc_00bc81bc;
    /* 0x00bc7e38: ldr      x9, [sp, #0x10] */ ARM64("ldr x9, [sp, #0x10]");
    /* 0x00bc7e3c: ldr      x9, [x9, #0x10] */ ARM64("ldr x9, [x9, #0x10]");
    /* 0x00bc7e40: cbz      x9, #0xbc81bc */ if (x9 == 0) goto loc_00bc81bc;
    /* 0x00bc7e44: ldr      x10, [sp, #0x10] */ ARM64("ldr x10, [sp, #0x10]");
    /* 0x00bc7e48: ldr      x27, [x10, #8] */ ARM64("ldr x27, [x10, #8]");
    /* 0x00bc7e4c: lsl      x9, x9, #3 */ ARM64("lsl x9, x9, #3");
    /* 0x00bc7e50: mov      x10, x27 */ ARM64("mov x10, x27");
    /* 0x00bc7e54: b        #0xbc7e64 */ goto loc_00bc7e64;
loc_00bc7e58:
    /* 0x00bc7e58: mov      x27, x10 */ ARM64("mov x27, x10");
    /* 0x00bc7e5c: subs     x9, x9, #8 */ ARM64("subs x9, x9, #8");
    /* 0x00bc7e60: b.eq     #0xbc81bc */ if (COND_EQ) goto loc_00bc81bc;
loc_00bc7e64:
    /* 0x00bc7e64: ldr      x11, [x10], #8 */ ARM64("ldr x11, [x10], #8");
    /* 0x00bc7e68: cbz      x11, #0xbc7e58 */ if (x11 == 0) goto loc_00bc7e58;
    /* 0x00bc7e6c: ldr      x12, [x8, #8] */ ARM64("ldr x12, [x8, #8]");
    /* 0x00bc7e70: cmp      x11, x12 */ ARM64("cmp x11, x12");
    /* 0x00bc7e74: b.ne     #0xbc7e58 */ if (COND_NE) goto loc_00bc7e58;
    /* 0x00bc7e78: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc7e7c: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7e80: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc7e84: b.hs     #0xbc9bf8 */ if (COND_HS) goto loc_00bc9bf8;
    /* 0x00bc7e88: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc7e8c: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7e90: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc7e94: madd     x8, x28, x9, x8 */ ARM64("madd x8, x28, x9, x8");
    /* 0x00bc7e98: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc7e9c: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc7ea0: b.ne     #0xbc9c08 */ if (COND_NE) goto loc_00bc9c08;
    /* 0x00bc7ea4: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc7ea8: cbz      x9, #0xbc9c14 */ if (x9 == 0) goto loc_00bc9c14;
    /* 0x00bc7eac: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00bc7eb0: str      x9, [x8, #0x48] */ ARM64("str x9, [x8, #0x48]");
    /* 0x00bc7eb4: ldr      x8, [x8, #0x40] */ ARM64("ldr x8, [x8, #0x40]");
    /* 0x00bc7eb8: add      x8, x8, x9, lsl #6 */ ARM64("add x8, x8, x9, lsl #6");
    /* 0x00bc7ebc: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc7ec0: ldr      x10, [x8, #0x38] */ ARM64("ldr x10, [x8, #0x38]");
    /* 0x00bc7ec4: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00bc7ec8: ldur     q1, [x8, #0x18] */ ARM64("ldur q1, [x8, #0x18]");
    /* 0x00bc7ecc: ldur     q2, [x8, #8] */ ARM64("ldur q2, [x8, #8]");
    /* 0x00bc7ed0: str      x9, [sp, #0x300] */ ARM64("str x9, [sp, #0x300]");
    /* 0x00bc7ed4: add      x8, sp, #0x300 */ ARM64("add x8, sp, #0x300");
    /* 0x00bc7ed8: stur     q2, [x8, #8] */ ARM64("stur q2, [x8, #8]");
    /* 0x00bc7edc: stur     q1, [x8, #0x18] */ ARM64("stur q1, [x8, #0x18]");
    /* 0x00bc7ee0: stur     q0, [x8, #0x28] */ ARM64("stur q0, [x8, #0x28]");
    /* 0x00bc7ee4: stur     x10, [x8, #0x38] */ ARM64("stur x10, [x8, #0x38]");
    /* 0x00bc7ee8: ldr      x8, [sp, #0x18] */ ARM64("ldr x8, [sp, #0x18]");
    /* 0x00bc7eec: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc7ef0: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc7ef4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc7ef8: b.eq     #0xbc9ca8 */ if (COND_EQ) goto loc_00bc9ca8;
    /* 0x00bc7efc: ldr      x8, [sp, #0x18] */ ARM64("ldr x8, [sp, #0x18]");
    /* 0x00bc7f00: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc7f04: cmp      x26, x1 */ ARM64("cmp x26, x1");
    /* 0x00bc7f08: b.hs     #0xbc9cc4 */ if (COND_HS) goto loc_00bc9cc4;
    /* 0x00bc7f0c: ldr      x8, [x27] */ ARM64("ldr x8, [x27]");
    /* 0x00bc7f10: cbz      x8, #0xbc9c20 */ if (x8 == 0) goto loc_00bc9c20;
    /* 0x00bc7f14: ldr      x8, [sp, #0x18] */ ARM64("ldr x8, [sp, #0x18]");
    /* 0x00bc7f18: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc7f1c: str      x27, [sp, #0x410] */ ARM64("str x27, [sp, #0x410]");
    /* 0x00bc7f20: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00bc7f24: madd     x22, x26, x9, x8 */ ARM64("madd x22, x26, x9, x8");
    /* 0x00bc7f28: sturb    wzr, [x29, #-0x78] */ ARM64("sturb wzr, [x29, #-0x78]");
    /* 0x00bc7f2c: add      x8, sp, #0x410 */ ARM64("add x8, sp, #0x410");
    /* 0x00bc7f30: str      x8, [sp, #0x1d0] */ ARM64("str x8, [sp, #0x1d0]");
    /* 0x00bc7f34: add      x8, sp, #0x300 */ ARM64("add x8, sp, #0x300");
    /* 0x00bc7f38: str      x8, [sp, #0x1d8] */ ARM64("str x8, [sp, #0x1d8]");
    /* 0x00bc7f3c: sub      x8, x29, #0x78 */ ARM64("sub x8, x29, #0x78");
    /* 0x00bc7f40: str      x8, [sp, #0x1e0] */ ARM64("str x8, [sp, #0x1e0]");
    /* 0x00bc7f44: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc7f48: add      x2, x22, #8 */ ARM64("add x2, x22, #8");
    /* 0x00bc7f4c: mov      w1, #0 */ ARM64("mov w1, #0");
    /* 0x00bc7f50: bl       #0xbcaa5c */ CALL_DIRECT(sub_00bcaa5c);
    /* 0x00bc7f54: and      w8, w0, #0xff */ ARM64("and w8, w0, #0xff");
    /* 0x00bc7f58: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x00bc7f5c: b.ne     #0xbc80f8 */ if (COND_NE) goto loc_00bc80f8;
    /* 0x00bc7f60: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00bc7f64: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc7f68: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc7f6c: add      x11, x11, #0x63e */ ARM64("add x11, x11, #0x63e");
    /* 0x00bc7f70: adr      x9, #0xbc7f80 */ ARM64("adr x9, #0xbc7f80");
    /* 0x00bc7f74: ldrb     w10, [x11, x8] */ ARM64("ldrb w10, [x11, x8]");
    /* 0x00bc7f78: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc7f7c: br       x9 */ ARM64("br x9");
loc_00bc7f80:
    /* 0x00bc7f80: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc7f84: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc7f88: bl       #0xbd3928 */ CALL_DIRECT(sub_00bd3928);
    /* 0x00bc7f8c: b        #0xbc80d0 */ goto loc_00bc80d0;
    /* 0x00bc7f90: add      x0, x23, #8 */ ARM64("add x0, x23, #8");
    /* 0x00bc7f94: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc7f98: tbnz     w0, #0, #0xbc81bc */ if (((w0 >> #0) & 1) != 0) goto loc_00bc81bc;
    /* 0x00bc7f9c: b        #0xbc7c3c */ goto loc_00bc7c3c;
    /* 0x00bc7fa0: ldrb     w8, [x23, #0x10] */ ARM64("ldrb w8, [x23, #0x10]");
    /* 0x00bc7fa4: cbnz     w8, #0xbc81bc */ if (w8 != 0) goto loc_00bc81bc;
    /* 0x00bc7fa8: mov      x8, x23 */ ARM64("mov x8, x23");
loc_00bc7fac:
    /* 0x00bc7fac: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc7fb0: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc7fb4: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc7fb8: b.ne     #0xbc7fec */ if (COND_NE) goto loc_00bc7fec;
    /* 0x00bc7fbc: ldrb     w9, [x8, #0x10] */ ARM64("ldrb w9, [x8, #0x10]");
    /* 0x00bc7fc0: cbz      w9, #0xbc7fac */ if (w9 == 0) goto loc_00bc7fac;
    /* 0x00bc7fc4: b        #0xbc81bc */ goto loc_00bc81bc;
    /* 0x00bc7fc8: add      x0, x23, #8 */ ARM64("add x0, x23, #8");
    /* 0x00bc7fcc: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc7fd0: tbz      w0, #0, #0xbc7c3c */ if (((w0 >> #0) & 1) == 0) goto loc_00bc7c3c;
    /* 0x00bc7fd4: b        #0xbc81bc */ goto loc_00bc81bc;
    /* 0x00bc7fd8: ldr      x8, [x23, #8] */ ARM64("ldr x8, [x23, #8]");
    /* 0x00bc7fdc: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc7fe0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc7fe4: b.eq     #0xbc7c3c */ if (COND_EQ) goto loc_00bc7c3c;
    /* 0x00bc7fe8: b        #0xbc81bc */ goto loc_00bc81bc;
loc_00bc7fec:
    /* 0x00bc7fec: cmp      x9, #4 */ ARM64("cmp x9, #4");
    /* 0x00bc7ff0: b.le     #0xbc8010 */ if (COND_LE) goto loc_00bc8010;
    /* 0x00bc7ff4: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc7ff8: b.gt     #0xbc8020 */ if (COND_GT) goto loc_00bc8020;
    /* 0x00bc7ffc: cmp      x9, #5 */ ARM64("cmp x9, #5");
    /* 0x00bc8000: b.eq     #0xbc8044 */ if (COND_EQ) goto loc_00bc8044;
    /* 0x00bc8004: cmp      x9, #6 */ ARM64("cmp x9, #6");
    /* 0x00bc8008: b.eq     #0xbc7c3c */ if (COND_EQ) goto loc_00bc7c3c;
    /* 0x00bc800c: b        #0xbc81bc */ goto loc_00bc81bc;
loc_00bc8010:
    /* 0x00bc8010: sub      x8, x9, #1 */ ARM64("sub x8, x9, #1");
    /* 0x00bc8014: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00bc8018: b.lo     #0xbc81bc */ if (COND_LO) goto loc_00bc81bc;
    /* 0x00bc801c: b        #0xbc7c3c */ goto loc_00bc7c3c;
loc_00bc8020:
    /* 0x00bc8020: cmp      x9, #9 */ ARM64("cmp x9, #9");
    /* 0x00bc8024: b.eq     #0xbc8054 */ if (COND_EQ) goto loc_00bc8054;
    /* 0x00bc8028: cmp      x9, #0xa */ ARM64("cmp x9, #0xa");
    /* 0x00bc802c: b.eq     #0xbc7c3c */ if (COND_EQ) goto loc_00bc7c3c;
    /* 0x00bc8030: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc8034: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc8038: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc803c: b.eq     #0xbc7c3c */ if (COND_EQ) goto loc_00bc7c3c;
    /* 0x00bc8040: b        #0xbc81bc */ goto loc_00bc81bc;
loc_00bc8044:
    /* 0x00bc8044: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc8048: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc804c: tbz      w0, #0, #0xbc7c3c */ if (((w0 >> #0) & 1) == 0) goto loc_00bc7c3c;
    /* 0x00bc8050: b        #0xbc81bc */ goto loc_00bc81bc;
loc_00bc8054:
    /* 0x00bc8054: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc8058: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc805c: tbz      w0, #0, #0xbc7c3c */ if (((w0 >> #0) & 1) == 0) goto loc_00bc7c3c;
    /* 0x00bc8060: b        #0xbc81bc */ goto loc_00bc81bc;
    /* 0x00bc8064: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc8068: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc806c: bl       #0xbd370c */ CALL_DIRECT(sub_00bd370c);
    /* 0x00bc8070: b        #0xbc80d0 */ goto loc_00bc80d0;
    /* 0x00bc8074: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc8078: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc807c: bl       #0xbcd994 */ CALL_DIRECT(sub_00bcd994);
    /* 0x00bc8080: b        #0xbc80d0 */ goto loc_00bc80d0;
    /* 0x00bc8084: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc8088: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc808c: bl       #0xbd3a2c */ CALL_DIRECT(sub_00bd3a2c);
    /* 0x00bc8090: b        #0xbc80d0 */ goto loc_00bc80d0;
    /* 0x00bc8094: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00bc8098: eor      x9, x8, #0x8000000000000000 */ ARM64("eor x9, x8, #0x8000000000000000");
    /* 0x00bc809c: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00bc80a0: mov      w8, #2 */ ARM64("mov w8, #2");
    /* 0x00bc80a4: csel     x8, x9, x8, mi */ ARM64("csel x8, x9, x8, mi");
    /* 0x00bc80a8: cbz      x8, #0xbc80dc */ if (x8 == 0) goto loc_00bc80dc;
    /* 0x00bc80ac: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00bc80b0: b.ne     #0xbc80c4 */ if (COND_NE) goto loc_00bc80c4;
    /* 0x00bc80b4: add      x0, x22, #0x18 */ ARM64("add x0, x22, #0x18");
    /* 0x00bc80b8: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc80bc: bl       #0xbd3824 */ CALL_DIRECT(sub_00bd3824);
    /* 0x00bc80c0: b        #0xbc80d0 */ goto loc_00bc80d0;
loc_00bc80c4:
    /* 0x00bc80c4: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00bc80c8: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc80cc: bl       #0xbd329c */ CALL_DIRECT(sub_00bd329c);
loc_00bc80d0:
    /* 0x00bc80d0: and      w8, w0, #0xff */ ARM64("and w8, w0, #0xff");
    /* 0x00bc80d4: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x00bc80d8: b.ne     #0xbc80f8 */ if (COND_NE) goto loc_00bc80f8;
loc_00bc80dc:
    /* 0x00bc80dc: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc80e0: add      x2, x22, #8 */ ARM64("add x2, x22, #8");
    /* 0x00bc80e4: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00bc80e8: bl       #0xbcaa5c */ CALL_DIRECT(sub_00bcaa5c);
    /* 0x00bc80ec: and      w8, w0, #0xff */ ARM64("and w8, w0, #0xff");
    /* 0x00bc80f0: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x00bc80f4: b.eq     #0xbc80fc */ if (COND_EQ) goto loc_00bc80fc;
loc_00bc80f8:
    /* 0x00bc80f8: tbnz     w8, #0, #0xbc8488 */ if (((w8 >> #0) & 1) != 0) goto loc_00bc8488;
loc_00bc80fc:
    /* 0x00bc80fc: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc8100: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc8104: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc8108: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc810c: b.eq     #0xbc9c2c */ if (COND_EQ) goto loc_00bc9c2c;
    /* 0x00bc8110: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc8114: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc8118: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc811c: b.hs     #0xbc9c38 */ if (COND_HS) goto loc_00bc9c38;
    /* 0x00bc8120: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc8124: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc8128: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc812c: madd     x22, x28, x9, x8 */ ARM64("madd x22, x28, x9, x8");
    /* 0x00bc8130: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00bc8134: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00bc8138: b.ne     #0xbc9c48 */ if (COND_NE) goto loc_00bc9c48;
    /* 0x00bc813c: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc8140: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc8144: b.eq     #0xbc9c54 */ if (COND_EQ) goto loc_00bc9c54;
    /* 0x00bc8148: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc814c: ldr      x9, [x0, #0x38]! */ ARM64("ldr x9, [x0, #0x38]!");
    /* 0x00bc8150: str      x8, [sp, #0x1d0] */ ARM64("str x8, [sp, #0x1d0]");
    /* 0x00bc8154: add      x8, sp, #0x300 */ ARM64("add x8, sp, #0x300");
    /* 0x00bc8158: ldur     q0, [x8, #8] */ ARM64("ldur q0, [x8, #8]");
    /* 0x00bc815c: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc8160: stur     q0, [x10, #8] */ ARM64("stur q0, [x10, #8]");
    /* 0x00bc8164: ldur     q0, [x8, #0x18] */ ARM64("ldur q0, [x8, #0x18]");
    /* 0x00bc8168: stur     q0, [x10, #0x18] */ ARM64("stur q0, [x10, #0x18]");
    /* 0x00bc816c: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00bc8170: stur     q0, [x10, #0x28] */ ARM64("stur q0, [x10, #0x28]");
    /* 0x00bc8174: ldur     x8, [x8, #0x38] */ ARM64("ldur x8, [x8, #0x38]");
    /* 0x00bc8178: stur     x8, [x10, #0x38] */ ARM64("stur x8, [x10, #0x38]");
    /* 0x00bc817c: ldr      x23, [x0, #0x10] */ ARM64("ldr x23, [x0, #0x10]");
    /* 0x00bc8180: cmp      x23, x9 */ ARM64("cmp x23, x9");
    /* 0x00bc8184: b.ne     #0xbc818c */ if (COND_NE) goto loc_00bc818c;
    /* 0x00bc8188: bl       #0xc73818 */ CALL_DIRECT(sub_00c73818);
loc_00bc818c:
    /* 0x00bc818c: ldr      x8, [x22, #0x40] */ ARM64("ldr x8, [x22, #0x40]");
    /* 0x00bc8190: add      x8, x8, x23, lsl #6 */ ARM64("add x8, x8, x23, lsl #6");
    /* 0x00bc8194: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc8198: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc819c: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00bc81a0: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00bc81a4: ldr      q0, [sp, #0x1f0] */ ARM64("ldr q0, [sp, #0x1f0]");
    /* 0x00bc81a8: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00bc81ac: ldr      q0, [sp, #0x200] */ ARM64("ldr q0, [sp, #0x200]");
    /* 0x00bc81b0: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00bc81b4: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00bc81b8: str      x8, [x22, #0x48] */ ARM64("str x8, [x22, #0x48]");
loc_00bc81bc:
    /* 0x00bc81bc: ldr      x10, [sp, #0x198] */ ARM64("ldr x10, [sp, #0x198]");
    /* 0x00bc81c0: ldr      x8, [x10] */ ARM64("ldr x8, [x10]");
    /* 0x00bc81c4: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc81c8: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc81cc: b.eq     #0xbc9c64 */ if (COND_EQ) goto loc_00bc9c64;
    /* 0x00bc81d0: ldr      x1, [x10, #0x10] */ ARM64("ldr x1, [x10, #0x10]");
    /* 0x00bc81d4: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc81d8: b.hs     #0xbc9c70 */ if (COND_HS) goto loc_00bc9c70;
    /* 0x00bc81dc: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc81e0: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc81e4: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc81e8: madd     x1, x28, x9, x8 */ ARM64("madd x1, x28, x9, x8");
    /* 0x00bc81ec: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc81f0: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc81f4: bl       #0xbca948 */ CALL_DIRECT(sub_00bca948);
    /* 0x00bc81f8: ldr      x24, [sp, #0x10] */ ARM64("ldr x24, [sp, #0x10]");
    /* 0x00bc81fc: ldp      x9, x8, [sp, #0x1d0] */ ARM64("ldp x9, x8, [sp, #0x1d0]");
    /* 0x00bc8200: str      x9, [sp, #8] */ ARM64("str x9, [sp, #8]");
    /* 0x00bc8204: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
    /* 0x00bc8208: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc820c: cbz      x8, #0xbc840c */ if (x8 == 0) goto loc_00bc840c;
    /* 0x00bc8210: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00bc8214: cbz      x9, #0xbc840c */ if (x9 == 0) goto loc_00bc840c;
    /* 0x00bc8218: ldr      x23, [sp, #0x48] */ ARM64("ldr x23, [sp, #0x48]");
    /* 0x00bc821c: add      x27, x23, x8, lsl #3 */ ARM64("add x27, x23, x8, lsl #3");
    /* 0x00bc8220: b        #0xbc82fc */ goto loc_00bc82fc;
loc_00bc8224:
    /* 0x00bc8224: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00bc8228: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00bc822c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc8230: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00bc8234: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc8238: b.eq     #0xbc8268 */ if (COND_EQ) goto loc_00bc8268;
loc_00bc823c:
    /* 0x00bc823c: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc8240: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc8244: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00bc8248: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00bc824c: sub      x16, x8, x16, lsl #3 */ ARM64("sub x16, x8, x16, lsl #3");
    /* 0x00bc8250: ldur     x16, [x16, #-8] */ ARM64("ldur x16, [x16, #-8]");
    /* 0x00bc8254: cmp      x22, x16 */ ARM64("cmp x22, x16");
    /* 0x00bc8258: b.eq     #0xbc82f4 */ if (COND_EQ) goto loc_00bc82f4;
    /* 0x00bc825c: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc8260: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc8264: b.ne     #0xbc823c */ if (COND_NE) goto loc_00bc823c;
loc_00bc8268:
    /* 0x00bc8268: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00bc826c: b.eq     #0xbc828c */ if (COND_EQ) goto loc_00bc828c;
    /* 0x00bc8270: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00bc8274: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00bc8278: cbz      x11, #0xbc82a8 */ if (x11 == 0) goto loc_00bc82a8;
    /* 0x00bc827c: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00bc8280: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00bc8284: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00bc8288: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00bc828c:
    /* 0x00bc828c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc8290: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc8294: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc8298: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00bc829c: tbnz     w13, #0, #0xbc82b8 */ if (((w13 >> #0) & 1) != 0) goto loc_00bc82b8;
    /* 0x00bc82a0: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00bc82a4: b        #0xbc82ac */ goto loc_00bc82ac;
loc_00bc82a8:
    /* 0x00bc82a8: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00bc82ac:
    /* 0x00bc82ac: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00bc82b0: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00bc82b4: b        #0xbc8224 */ goto loc_00bc8224;
loc_00bc82b8:
    /* 0x00bc82b8: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00bc82bc: tbz      w12, #0x1f, #0xbc83ec */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00bc83ec;
loc_00bc82c0:
    /* 0x00bc82c0: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00bc82c4: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00bc82c8: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00bc82cc: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00bc82d0: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00bc82d4: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00bc82d8: ldr      q0, [sp, #0x440] */ ARM64("ldr q0, [sp, #0x440]");
    /* 0x00bc82dc: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00bc82e0: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00bc82e4: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00bc82e8: str      q0, [sp, #0x440] */ ARM64("str q0, [sp, #0x440]");
    /* 0x00bc82ec: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00bc82f0: stur     x22, [x8, #-8] */ ARM64("stur x22, [x8, #-8]");
loc_00bc82f4:
    /* 0x00bc82f4: cmp      x23, x27 */ ARM64("cmp x23, x27");
    /* 0x00bc82f8: b.eq     #0xbc840c */ if (COND_EQ) goto loc_00bc840c;
loc_00bc82fc:
    /* 0x00bc82fc: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc8300: ldr      x9, [x23], #8 */ ARM64("ldr x9, [x23], #8");
    /* 0x00bc8304: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00bc8308: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00bc830c: mov      x11, #0xa95 */ ARM64("mov x11, #0xa95");
    /* 0x00bc8310: movk     x11, #0x2722, lsl #16 */ ARM64("movk x11, #0x2722, lsl #16");
    /* 0x00bc8314: movk     x11, #0xc1b7, lsl #32 */ ARM64("movk x11, #0xc1b7, lsl #32");
    /* 0x00bc8318: movk     x11, #0x517c, lsl #48 */ ARM64("movk x11, #0x517c, lsl #48");
    /* 0x00bc831c: mul      x10, x10, x11 */ ARM64("mul x10, x10, x11");
    /* 0x00bc8320: lsr      x11, x10, #0x39 */ ARM64("lsr x11, x10, #0x39");
    /* 0x00bc8324: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
loc_00bc8328:
    /* 0x00bc8328: ldr      x11, [sp, #0x168] */ ARM64("ldr x11, [sp, #0x168]");
    /* 0x00bc832c: and      x10, x10, x11 */ ARM64("and x10, x10, x11");
    /* 0x00bc8330: ldr      x11, [sp, #0x160] */ ARM64("ldr x11, [sp, #0x160]");
    /* 0x00bc8334: ldr      d1, [x11, x10] */ ARM64("ldr d1, [x11, x10]");
    /* 0x00bc8338: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc833c: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00bc8340: ands     x11, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x11, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc8344: b.eq     #0xbc8378 */ if (COND_EQ) goto loc_00bc8378;
loc_00bc8348:
    /* 0x00bc8348: rbit     x12, x11 */ ARM64("rbit x12, x11");
    /* 0x00bc834c: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00bc8350: add      x12, x10, x12, lsr #3 */ ARM64("add x12, x10, x12, lsr #3");
    /* 0x00bc8354: ldp      x13, x14, [sp, #0x160] */ ARM64("ldp x13, x14, [sp, #0x160]");
    /* 0x00bc8358: and      x12, x12, x14 */ ARM64("and x12, x12, x14");
    /* 0x00bc835c: sub      x12, x13, x12, lsl #4 */ ARM64("sub x12, x13, x12, lsl #4");
    /* 0x00bc8360: ldur     x13, [x12, #-0x10] */ ARM64("ldur x13, [x12, #-0x10]");
    /* 0x00bc8364: cmp      x9, x13 */ ARM64("cmp x9, x13");
    /* 0x00bc8368: b.eq     #0xbc8398 */ if (COND_EQ) goto loc_00bc8398;
    /* 0x00bc836c: sub      x12, x11, #1 */ ARM64("sub x12, x11, #1");
    /* 0x00bc8370: ands     x11, x12, x11 */ ARM64("ands x11, x12, x11");
    /* 0x00bc8374: b.ne     #0xbc8348 */ if (COND_NE) goto loc_00bc8348;
loc_00bc8378:
    /* 0x00bc8378: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc837c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc8380: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc8384: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00bc8388: tbnz     w11, #0, #0xbc82f4 */ if (((w11 >> #0) & 1) != 0) goto loc_00bc82f4;
    /* 0x00bc838c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc8390: add      x10, x10, x8 */ ARM64("add x10, x10, x8");
    /* 0x00bc8394: b        #0xbc8328 */ goto loc_00bc8328;
loc_00bc8398:
    /* 0x00bc8398: ldur     x22, [x12, #-8] */ ARM64("ldur x22, [x12, #-8]");
    /* 0x00bc839c: ldr      x8, [sp, #0x440] */ ARM64("ldr x8, [sp, #0x440]");
    /* 0x00bc83a0: cbz      x8, #0xbc83d4 */ if (x8 == 0) goto loc_00bc83d4;
loc_00bc83a4:
    /* 0x00bc83a4: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00bc83a8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00bc83ac: mov      x8, #0xa95 */ ARM64("mov x8, #0xa95");
    /* 0x00bc83b0: movk     x8, #0x2722, lsl #16 */ ARM64("movk x8, #0x2722, lsl #16");
    /* 0x00bc83b4: movk     x8, #0xc1b7, lsl #32 */ ARM64("movk x8, #0xc1b7, lsl #32");
    /* 0x00bc83b8: movk     x8, #0x517c, lsl #48 */ ARM64("movk x8, #0x517c, lsl #48");
    /* 0x00bc83bc: mul      x14, x22, x8 */ ARM64("mul x14, x22, x8");
    /* 0x00bc83c0: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bc83c4: ldr      x10, [sp, #0x438] */ ARM64("ldr x10, [sp, #0x438]");
    /* 0x00bc83c8: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00bc83cc: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00bc83d0: b        #0xbc8224 */ goto loc_00bc8224;
loc_00bc83d4:
    /* 0x00bc83d4: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bc83d8: add      x8, sp, #0x430 */ ARM64("add x8, sp, #0x430");
    /* 0x00bc83dc: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00bc83e0: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00bc83e4: bl       #0xc724cc */ CALL_DIRECT(sub_00c724cc);
    /* 0x00bc83e8: b        #0xbc83a4 */ goto loc_00bc83a4;
loc_00bc83ec:
    /* 0x00bc83ec: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00bc83f0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00bc83f4: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00bc83f8: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00bc83fc: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00bc8400: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00bc8404: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00bc8408: b        #0xbc82c0 */ goto loc_00bc82c0;
loc_00bc840c:
    /* 0x00bc840c: ldr      x8, [sp, #8] */ ARM64("ldr x8, [sp, #8]");
    /* 0x00bc8410: cbz      x8, #0xbc841c */ if (x8 == 0) goto loc_00bc841c;
loc_00bc8414:
    /* 0x00bc8414: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc8418: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc841c:
    /* 0x00bc841c: cbnz     x28, #0xbc7814 */ if (x28 != 0) goto loc_00bc7814;
    /* 0x00bc8420: ldr      x9, [sp, #0x438] */ ARM64("ldr x9, [sp, #0x438]");
    /* 0x00bc8424: cbz      x9, #0xbc77d8 */ if (x9 == 0) goto loc_00bc77d8;
    /* 0x00bc8428: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc842c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc8430: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00bc8434: b.eq     #0xbc77d8 */ if (COND_EQ) goto loc_00bc77d8;
    /* 0x00bc8438: ldr      x9, [sp, #0x430] */ ARM64("ldr x9, [sp, #0x430]");
    /* 0x00bc843c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc8440: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00bc8444: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc8448: b        #0xbc77d8 */ goto loc_00bc77d8;
loc_00bc844c:
    /* 0x00bc844c: cbz      x22, #0xbc8458 */ if (x22 == 0) goto loc_00bc8458;
    /* 0x00bc8450: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc8454: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc8458:
    /* 0x00bc8458: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00bc845c: ldr      x9, [sp, #0x438] */ ARM64("ldr x9, [sp, #0x438]");
    /* 0x00bc8460: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00bc8464: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc8468: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc846c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00bc8470: b.eq     #0xbc77dc */ if (COND_EQ) goto loc_00bc77dc;
loc_00bc8474:
    /* 0x00bc8474: ldr      x9, [sp, #0x430] */ ARM64("ldr x9, [sp, #0x430]");
    /* 0x00bc8478: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc847c: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00bc8480: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc8484: b        #0xbc77dc */ goto loc_00bc77dc;
loc_00bc8488:
    /* 0x00bc8488: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc848c: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc8490: b.ne     #0xbc9c80 */ if (COND_NE) goto loc_00bc9c80;
    /* 0x00bc8494: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc8498: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc849c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc84a0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc84a4: b.eq     #0xbc9c9c */ if (COND_EQ) goto loc_00bc9c9c;
    /* 0x00bc84a8: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc84ac: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc84b0: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc84b4: b.hs     #0xbc9cb4 */ if (COND_HS) goto loc_00bc9cb4;
    /* 0x00bc84b8: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc84bc: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc84c0: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc84c4: madd     x1, x28, x9, x8 */ ARM64("madd x1, x28, x9, x8");
    /* 0x00bc84c8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc84cc: bl       #0xbca704 */ CALL_DIRECT(sub_00bca704);
    /* 0x00bc84d0: ldp      x22, x23, [sp, #0x1d0] */ ARM64("ldp x22, x23, [sp, #0x1d0]");
    /* 0x00bc84d4: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc84d8: cbz      x8, #0xbc85a4 */ if (x8 == 0) goto loc_00bc85a4;
    /* 0x00bc84dc: add      x8, x23, x8, lsl #3 */ ARM64("add x8, x23, x8, lsl #3");
    /* 0x00bc84e0: mov      x9, x23 */ ARM64("mov x9, x23");
    /* 0x00bc84e4: b        #0xbc8568 */ goto loc_00bc8568;
loc_00bc84e8:
    /* 0x00bc84e8: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00bc84ec: ldr      d1, [x13, x14] */ ARM64("ldr d1, [x13, x14]");
    /* 0x00bc84f0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc84f4: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00bc84f8: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc84fc: b.eq     #0xbc852c */ if (COND_EQ) goto loc_00bc852c;
loc_00bc8500:
    /* 0x00bc8500: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00bc8504: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00bc8508: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00bc850c: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00bc8510: sub      x16, x13, x16, lsl #4 */ ARM64("sub x16, x13, x16, lsl #4");
    /* 0x00bc8514: ldur     x17, [x16, #-0x10] */ ARM64("ldur x17, [x16, #-0x10]");
    /* 0x00bc8518: cmp      x11, x17 */ ARM64("cmp x11, x17");
    /* 0x00bc851c: b.eq     #0xbc854c */ if (COND_EQ) goto loc_00bc854c;
    /* 0x00bc8520: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00bc8524: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00bc8528: b.ne     #0xbc8500 */ if (COND_NE) goto loc_00bc8500;
loc_00bc852c:
    /* 0x00bc852c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc8530: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc8534: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc8538: fmov     w15, s1 */ ARM64("fmov w15, s1");
    /* 0x00bc853c: tbnz     w15, #0, #0xbc9a70 */ if (((w15 >> #0) & 1) != 0) goto loc_00bc9a70;
    /* 0x00bc8540: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00bc8544: add      x14, x14, x10 */ ARM64("add x14, x14, x10");
    /* 0x00bc8548: b        #0xbc84e8 */ goto loc_00bc84e8;
loc_00bc854c:
    /* 0x00bc854c: ldur     x10, [x16, #-8] */ ARM64("ldur x10, [x16, #-8]");
    /* 0x00bc8550: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00bc8554: cset     w11, ne */ ARM64("cset w11, ne");
    /* 0x00bc8558: sub      x10, x10, x11 */ ARM64("sub x10, x10, x11");
    /* 0x00bc855c: stur     x10, [x16, #-8] */ ARM64("stur x10, [x16, #-8]");
    /* 0x00bc8560: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc8564: b.eq     #0xbc85a4 */ if (COND_EQ) goto loc_00bc85a4;
loc_00bc8568:
    /* 0x00bc8568: ldr      x10, [sp, #0x1c8] */ ARM64("ldr x10, [sp, #0x1c8]");
    /* 0x00bc856c: cbz      x10, #0xbc9a70 */ if (x10 == 0) goto loc_00bc9a70;
    /* 0x00bc8570: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc8574: ldr      x11, [x9], #8 */ ARM64("ldr x11, [x9], #8");
    /* 0x00bc8578: ldr      x11, [x11] */ ARM64("ldr x11, [x11]");
    /* 0x00bc857c: add      x12, x11, #8 */ ARM64("add x12, x11, #8");
    /* 0x00bc8580: mov      x13, #0xa95 */ ARM64("mov x13, #0xa95");
    /* 0x00bc8584: movk     x13, #0x2722, lsl #16 */ ARM64("movk x13, #0x2722, lsl #16");
    /* 0x00bc8588: movk     x13, #0xc1b7, lsl #32 */ ARM64("movk x13, #0xc1b7, lsl #32");
    /* 0x00bc858c: movk     x13, #0x517c, lsl #48 */ ARM64("movk x13, #0x517c, lsl #48");
    /* 0x00bc8590: mul      x14, x12, x13 */ ARM64("mul x14, x12, x13");
    /* 0x00bc8594: lsr      x15, x14, #0x39 */ ARM64("lsr x15, x14, #0x39");
    /* 0x00bc8598: ldp      x13, x12, [sp, #0x1b0] */ ARM64("ldp x13, x12, [sp, #0x1b0]");
    /* 0x00bc859c: dup      v0.8b, w15 */ ARM64("dup v0.8b, w15");
    /* 0x00bc85a0: b        #0xbc84e8 */ goto loc_00bc84e8;
loc_00bc85a4:
    /* 0x00bc85a4: cbz      x22, #0xbc85b0 */ if (x22 == 0) goto loc_00bc85b0;
    /* 0x00bc85a8: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc85ac: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc85b0:
    /* 0x00bc85b0: mov      w8, #0xc */ ARM64("mov w8, #0xc");
    /* 0x00bc85b4: str      x8, [sp, #0x1e8] */ ARM64("str x8, [sp, #0x1e8]");
    /* 0x00bc85b8: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc85bc: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00bc85c0: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc85c4: b.hs     #0xbc9cd4 */ if (COND_HS) goto loc_00bc9cd4;
    /* 0x00bc85c8: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc85cc: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00bc85d0: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc85d4: madd     x23, x28, x9, x8 */ ARM64("madd x23, x28, x9, x8");
    /* 0x00bc85d8: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc85dc: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc85e0: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc85e4: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc85e8: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc85ec: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc85f0: ldr      x8, [x27] */ ARM64("ldr x8, [x27]");
    /* 0x00bc85f4: cbz      x8, #0xbc8618 */ if (x8 == 0) goto loc_00bc8618;
loc_00bc85f8:
    /* 0x00bc85f8: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc85fc: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bc8600: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bc8604: cbnz     w10, #0xbc85f8 */ if (w10 != 0) goto loc_00bc85f8;
    /* 0x00bc8608: b.ne     #0xbc8618 */ if (COND_NE) goto loc_00bc8618;
    /* 0x00bc860c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc8610: ldr      x0, [x27] */ ARM64("ldr x0, [x27]");
    /* 0x00bc8614: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc8618:
    /* 0x00bc8618: str      xzr, [x27] */ ARM64("str xzr, [x27]");
    /* 0x00bc861c: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc8620: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc8624: b.eq     #0xbc8630 */ if (COND_EQ) goto loc_00bc8630;
    /* 0x00bc8628: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc862c: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
loc_00bc8630:
    /* 0x00bc8630: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc8634: ldr      x9, [sp, #0x438] */ ARM64("ldr x9, [sp, #0x438]");
    /* 0x00bc8638: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00bc863c: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc8640: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc8644: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00bc8648: b.eq     #0xbc77dc */ if (COND_EQ) goto loc_00bc77dc;
    /* 0x00bc864c: b        #0xbc8474 */ goto loc_00bc8474;
loc_00bc8650:
    /* 0x00bc8650: mov      x22, #0 */ ARM64("mov x22, #0");
loc_00bc8654:
    /* 0x00bc8654: cmp      x22, x20 */ ARM64("cmp x22, x20");
    /* 0x00bc8658: b.eq     #0xbc86cc */ if (COND_EQ) goto loc_00bc86cc;
    /* 0x00bc865c: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00bc8660: madd     x23, x22, x8, x21 */ ARM64("madd x23, x22, x8, x21");
    /* 0x00bc8664: ldr      x24, [x23, #0x10] */ ARM64("ldr x24, [x23, #0x10]");
    /* 0x00bc8668: cbz      x24, #0xbc86b0 */ if (x24 == 0) goto loc_00bc86b0;
    /* 0x00bc866c: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00bc8670: ldr      x26, [x23, #8] */ ARM64("ldr x26, [x23, #8]");
    /* 0x00bc8674: b        #0xbc8684 */ goto loc_00bc8684;
loc_00bc8678:
    /* 0x00bc8678: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00bc867c: cmp      x25, x24 */ ARM64("cmp x25, x24");
    /* 0x00bc8680: b.eq     #0xbc86b0 */ if (COND_EQ) goto loc_00bc86b0;
loc_00bc8684:
    /* 0x00bc8684: ldr      x8, [x26, x25, lsl #3] */ ARM64("ldr x8, [x26, x25, lsl #3]");
    /* 0x00bc8688: cbz      x8, #0xbc8678 */ if (x8 == 0) goto loc_00bc8678;
loc_00bc868c:
    /* 0x00bc868c: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bc8690: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bc8694: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bc8698: cbnz     w10, #0xbc868c */ if (w10 != 0) goto loc_00bc868c;
    /* 0x00bc869c: b.ne     #0xbc8678 */ if (COND_NE) goto loc_00bc8678;
    /* 0x00bc86a0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc86a4: ldr      x0, [x26, x25, lsl #3] */ ARM64("ldr x0, [x26, x25, lsl #3]");
    /* 0x00bc86a8: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc86ac: b        #0xbc8678 */ goto loc_00bc8678;
loc_00bc86b0:
    /* 0x00bc86b0: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bc86b4: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00bc86b8: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bc86bc: cbz      x8, #0xbc8654 */ if (x8 == 0) goto loc_00bc8654;
    /* 0x00bc86c0: ldr      x0, [x23, #8] */ ARM64("ldr x0, [x23, #8]");
    /* 0x00bc86c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc86c8: b        #0xbc8654 */ goto loc_00bc8654;
loc_00bc86cc:
    /* 0x00bc86cc: ldr      x8, [sp, #0x38] */ ARM64("ldr x8, [sp, #0x38]");
    /* 0x00bc86d0: cbz      x8, #0xbc86dc */ if (x8 == 0) goto loc_00bc86dc;
    /* 0x00bc86d4: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00bc86d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc86dc:
    /* 0x00bc86dc: ldp      x12, x11, [sp, #0x20] */ ARM64("ldp x12, x11, [sp, #0x20]");
    /* 0x00bc86e0: cmp      x12, x11 */ ARM64("cmp x12, x11");
    /* 0x00bc86e4: ldr      x20, [sp, #0x40] */ ARM64("ldr x20, [sp, #0x40]");
    /* 0x00bc86e8: ldr      x23, [sp, #0x30] */ ARM64("ldr x23, [sp, #0x30]");
    /* 0x00bc86ec: b.ne     #0xbc75e4 */ if (COND_NE) goto loc_00bc75e4;
    /* 0x00bc86f0: cbz      x23, #0xbc5f3c */ if (x23 == 0) goto loc_00bc5f3c;
    /* 0x00bc86f4: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc86f8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc86fc: b        #0xbc5f3c */ goto loc_00bc5f3c;
loc_00bc8700:
    /* 0x00bc8700: ldr      x8, [sp, #0x190] */ ARM64("ldr x8, [sp, #0x190]");
    /* 0x00bc8704: cbz      x8, #0xbc8710 */ if (x8 == 0) goto loc_00bc8710;
    /* 0x00bc8708: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00bc870c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc8710:
    /* 0x00bc8710: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00bc8714: ldr      x26, [sp, #0x108] */ ARM64("ldr x26, [sp, #0x108]");
    /* 0x00bc8718: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
loc_00bc871c:
    /* 0x00bc871c: cmp      x26, x22 */ ARM64("cmp x26, x22");
    /* 0x00bc8720: b.eq     #0xbc8b04 */ if (COND_EQ) goto loc_00bc8b04;
    /* 0x00bc8724: mov      x27, x26 */ ARM64("mov x27, x26");
    /* 0x00bc8728: ldr      x8, [x26], #0x20 */ ARM64("ldr x8, [x26], #0x20");
    /* 0x00bc872c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc8730: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc8734: b.eq     #0xbc871c */ if (COND_EQ) goto loc_00bc871c;
    /* 0x00bc8738: ldr      x28, [x27, #0x10] */ ARM64("ldr x28, [x27, #0x10]");
    /* 0x00bc873c: cbz      x28, #0xbc871c */ if (x28 == 0) goto loc_00bc871c;
    /* 0x00bc8740: mov      x24, #0 */ ARM64("mov x24, #0");
    /* 0x00bc8744: b        #0xbc8760 */ goto loc_00bc8760;
loc_00bc8748:
    /* 0x00bc8748: ldur     x8, [x14, #-8] */ ARM64("ldur x8, [x14, #-8]");
    /* 0x00bc874c: cbz      x8, #0xbc88a0 */ if (x8 == 0) goto loc_00bc88a0;
loc_00bc8750:
    /* 0x00bc8750: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
loc_00bc8754:
    /* 0x00bc8754: add      x24, x24, #1 */ ARM64("add x24, x24, #1");
    /* 0x00bc8758: cmp      x24, x28 */ ARM64("cmp x24, x28");
    /* 0x00bc875c: b.eq     #0xbc871c */ if (COND_EQ) goto loc_00bc871c;
loc_00bc8760:
    /* 0x00bc8760: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8764: cmp      x24, x1 */ ARM64("cmp x24, x1");
    /* 0x00bc8768: b.hs     #0xbc968c */ if (COND_HS) goto loc_00bc968c;
    /* 0x00bc876c: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8770: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8774: madd     x8, x24, x9, x8 */ ARM64("madd x8, x24, x9, x8");
    /* 0x00bc8778: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc877c: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8780: b.ne     #0xbc8754 */ if (COND_NE) goto loc_00bc8754;
    /* 0x00bc8784: ldr      x9, [x8, #0x30] */ ARM64("ldr x9, [x8, #0x30]");
    /* 0x00bc8788: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc878c: b.ne     #0xbc8754 */ if (COND_NE) goto loc_00bc8754;
    /* 0x00bc8790: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc8794: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8798: b.ne     #0xbc8754 */ if (COND_NE) goto loc_00bc8754;
    /* 0x00bc879c: ldr      x22, [x8, #0x28] */ ARM64("ldr x22, [x8, #0x28]");
    /* 0x00bc87a0: ldr      x9, [x22] */ ARM64("ldr x9, [x22]");
    /* 0x00bc87a4: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc87a8: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc87ac: b.ne     #0xbc8750 */ if (COND_NE) goto loc_00bc8750;
    /* 0x00bc87b0: ldr      x23, [x8, #0x40] */ ARM64("ldr x23, [x8, #0x40]");
    /* 0x00bc87b4: str      x23, [sp, #0x1a0] */ ARM64("str x23, [sp, #0x1a0]");
    /* 0x00bc87b8: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00bc87bc: mov      w25, #0 */ ARM64("mov w25, #0");
    /* 0x00bc87c0: adrp     x11, #0xe06000 */ ARM64("adrp x11, #0xe06000");
    /* 0x00bc87c4: add      x11, x11, #0x64a */ ARM64("add x11, x11, #0x64a");
    /* 0x00bc87c8: adr      x9, #0xbc87d8 */ ARM64("adr x9, #0xbc87d8");
    /* 0x00bc87cc: ldrb     w10, [x11, x8] */ ARM64("ldrb w10, [x11, x8]");
    /* 0x00bc87d0: add      x9, x9, x10, lsl #2 */ ARM64("add x9, x9, x10, lsl #2");
    /* 0x00bc87d4: br       x9 */ ARM64("br x9");
loc_00bc87d8:
    /* 0x00bc87d8: mov      w25, #1 */ ARM64("mov w25, #1");
loc_00bc87dc:
    /* 0x00bc87dc: ldr      x1, [x22, #8] */ ARM64("ldr x1, [x22, #8]");
    /* 0x00bc87e0: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00bc87e4: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00bc87e8: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00bc87ec: b.eq     #0xbc8750 */ if (COND_EQ) goto loc_00bc8750;
    /* 0x00bc87f0: ldr      x8, [sp, #0x1c8] */ ARM64("ldr x8, [sp, #0x1c8]");
    /* 0x00bc87f4: cbz      x8, #0xbc88a0 */ if (x8 == 0) goto loc_00bc88a0;
    /* 0x00bc87f8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc87fc: ldr      x9, [x22, #8] */ ARM64("ldr x9, [x22, #8]");
    /* 0x00bc8800: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00bc8804: mov      x11, #0xa95 */ ARM64("mov x11, #0xa95");
    /* 0x00bc8808: movk     x11, #0x2722, lsl #16 */ ARM64("movk x11, #0x2722, lsl #16");
    /* 0x00bc880c: movk     x11, #0xc1b7, lsl #32 */ ARM64("movk x11, #0xc1b7, lsl #32");
    /* 0x00bc8810: movk     x11, #0x517c, lsl #48 */ ARM64("movk x11, #0x517c, lsl #48");
    /* 0x00bc8814: mul      x12, x10, x11 */ ARM64("mul x12, x10, x11");
    /* 0x00bc8818: lsr      x13, x12, #0x39 */ ARM64("lsr x13, x12, #0x39");
    /* 0x00bc881c: ldp      x11, x10, [sp, #0x1b0] */ ARM64("ldp x11, x10, [sp, #0x1b0]");
    /* 0x00bc8820: dup      v0.8b, w13 */ ARM64("dup v0.8b, w13");
    /* 0x00bc8824: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00bc8828: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00bc882c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc8830: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00bc8834: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc8838: b.eq     #0xbc8868 */ if (COND_EQ) goto loc_00bc8868;
loc_00bc883c:
    /* 0x00bc883c: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00bc8840: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00bc8844: add      x14, x12, x14, lsr #3 */ ARM64("add x14, x12, x14, lsr #3");
    /* 0x00bc8848: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00bc884c: sub      x14, x11, x14, lsl #4 */ ARM64("sub x14, x11, x14, lsl #4");
    /* 0x00bc8850: ldur     x15, [x14, #-0x10] */ ARM64("ldur x15, [x14, #-0x10]");
    /* 0x00bc8854: cmp      x9, x15 */ ARM64("cmp x9, x15");
    /* 0x00bc8858: b.eq     #0xbc8748 */ if (COND_EQ) goto loc_00bc8748;
    /* 0x00bc885c: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00bc8860: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00bc8864: b.ne     #0xbc883c */ if (COND_NE) goto loc_00bc883c;
loc_00bc8868:
    /* 0x00bc8868: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc886c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc8870: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc8874: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00bc8878: tbnz     w13, #0, #0xbc88a0 */ if (((w13 >> #0) & 1) != 0) goto loc_00bc88a0;
    /* 0x00bc887c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc8880: add      x12, x12, x8 */ ARM64("add x12, x12, x8");
    /* 0x00bc8884: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00bc8888: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00bc888c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc8890: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00bc8894: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc8898: b.ne     #0xbc883c */ if (COND_NE) goto loc_00bc883c;
    /* 0x00bc889c: b        #0xbc8868 */ goto loc_00bc8868;
loc_00bc88a0:
    /* 0x00bc88a0: tbz      w25, #0, #0xbc88f0 */ if (((w25 >> #0) & 1) == 0) goto loc_00bc88f0;
    /* 0x00bc88a4: ldr      x1, [sp, #0x1a0] */ ARM64("ldr x1, [sp, #0x1a0]");
    /* 0x00bc88a8: ldr      x8, [x1] */ ARM64("ldr x8, [x1]");
    /* 0x00bc88ac: cmp      x8, #2 */ ARM64("cmp x8, #2");
    /* 0x00bc88b0: b.eq     #0xbc8988 */ if (COND_EQ) goto loc_00bc8988;
    /* 0x00bc88b4: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00bc88b8: b.eq     #0xbc89e8 */ if (COND_EQ) goto loc_00bc89e8;
    /* 0x00bc88bc: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00bc88c0: b.ne     #0xbc8750 */ if (COND_NE) goto loc_00bc8750;
    /* 0x00bc88c4: ldr      x8, [x1, #8]! */ ARM64("ldr x8, [x1, #8]!");
    /* 0x00bc88c8: eor      x9, x8, #0x8000000000000000 */ ARM64("eor x9, x8, #0x8000000000000000");
    /* 0x00bc88cc: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00bc88d0: mov      w8, #2 */ ARM64("mov w8, #2");
    /* 0x00bc88d4: csel     x8, x9, x8, mi */ ARM64("csel x8, x9, x8, mi");
    /* 0x00bc88d8: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
    /* 0x00bc88dc: cbz      x8, #0xbc8754 */ if (x8 == 0) goto loc_00bc8754;
    /* 0x00bc88e0: cmp      x8, #2 */ ARM64("cmp x8, #2");
    /* 0x00bc88e4: b.eq     #0xbc89ec */ if (COND_EQ) goto loc_00bc89ec;
    /* 0x00bc88e8: mov      w20, #0x10 */ ARM64("mov w20, #0x10");
    /* 0x00bc88ec: b        #0xbc898c */ goto loc_00bc898c;
loc_00bc88f0:
    /* 0x00bc88f0: mov      w8, #0xc */ ARM64("mov w8, #0xc");
    /* 0x00bc88f4: str      x8, [sp, #0x1e8] */ ARM64("str x8, [sp, #0x1e8]");
    /* 0x00bc88f8: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc88fc: cmp      x24, x1 */ ARM64("cmp x24, x1");
    /* 0x00bc8900: b.hs     #0xbc9a0c */ if (COND_HS) goto loc_00bc9a0c;
    /* 0x00bc8904: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8908: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc890c: madd     x20, x24, x9, x8 */ ARM64("madd x20, x24, x9, x8");
    /* 0x00bc8910: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc8914: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc8918: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
    /* 0x00bc891c: b        #0xbc8a90 */ goto loc_00bc8a90;
    /* 0x00bc8920: add      x0, x23, #8 */ ARM64("add x0, x23, #8");
loc_00bc8924:
    /* 0x00bc8924: bl       #0xb85b50 */ CALL_DIRECT(sub_00b85b50);
    /* 0x00bc8928: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00bc892c: b        #0xbc87dc */ goto loc_00bc87dc;
    /* 0x00bc8930: ldr      x9, [sp, #0x1a0] */ ARM64("ldr x9, [sp, #0x1a0]");
    /* 0x00bc8934: ldrb     w8, [x9, #0x10] */ ARM64("ldrb w8, [x9, #0x10]");
    /* 0x00bc8938: cbnz     w8, #0xbc87d8 */ if (w8 != 0) goto loc_00bc87d8;
    /* 0x00bc893c: mov      x8, x9 */ ARM64("mov x8, x9");
loc_00bc8940:
    /* 0x00bc8940: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc8944: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc8948: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc894c: b.ne     #0xbc8aa8 */ if (COND_NE) goto loc_00bc8aa8;
    /* 0x00bc8950: ldrb     w9, [x8, #0x10] */ ARM64("ldrb w9, [x8, #0x10]");
    /* 0x00bc8954: mov      w25, #1 */ ARM64("mov w25, #1");
    /* 0x00bc8958: cbz      w9, #0xbc8940 */ if (w9 == 0) goto loc_00bc8940;
    /* 0x00bc895c: b        #0xbc87dc */ goto loc_00bc87dc;
    /* 0x00bc8960: add      x0, x23, #8 */ ARM64("add x0, x23, #8");
loc_00bc8964:
    /* 0x00bc8964: bl       #0xb95bb4 */ CALL_DIRECT(sub_00b95bb4);
    /* 0x00bc8968: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00bc896c: b        #0xbc87dc */ goto loc_00bc87dc;
    /* 0x00bc8970: ldr      x8, [sp, #0x1a0] */ ARM64("ldr x8, [sp, #0x1a0]");
loc_00bc8974:
    /* 0x00bc8974: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc8978: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc897c: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc8980: cset     w25, ne */ ARM64("cset w25, ne");
    /* 0x00bc8984: b        #0xbc87dc */ goto loc_00bc87dc;
loc_00bc8988:
    /* 0x00bc8988: mov      w20, #8 */ ARM64("mov w20, #8");
loc_00bc898c:
    /* 0x00bc898c: mov      w0, #0x40 */ ARM64("mov w0, #0x40");
    /* 0x00bc8990: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00bc8994: cbz      x0, #0xbc9658 */ if (x0 == 0) goto loc_00bc9658;
    /* 0x00bc8998: mov      x22, x0 */ ARM64("mov x22, x0");
    /* 0x00bc899c: add      x20, x23, x20 */ ARM64("add x20, x23, x20");
    /* 0x00bc89a0: ldr      x1, [x20, #0x18] */ ARM64("ldr x1, [x20, #0x18]");
    /* 0x00bc89a4: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc89a8: bl       #0xbcb990 */ CALL_DIRECT(sub_00bcb990);
    /* 0x00bc89ac: ldp      q0, q1, [sp, #0x1d0] */ ARM64("ldp q0, q1, [sp, #0x1d0]");
    /* 0x00bc89b0: stp      q0, q1, [x22] */ ARM64("stp q0, q1, [x22]");
    /* 0x00bc89b4: ldp      q0, q1, [sp, #0x1f0] */ ARM64("ldp q0, q1, [sp, #0x1f0]");
    /* 0x00bc89b8: stp      q0, q1, [x22, #0x20] */ ARM64("stp q0, q1, [x22, #0x20]");
    /* 0x00bc89bc: str      x22, [sp, #0x300] */ ARM64("str x22, [sp, #0x300]");
    /* 0x00bc89c0: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc89c4: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00bc89c8: bl       #0xb9e1f8 */ CALL_DIRECT(sub_00b9e1f8);
    /* 0x00bc89cc: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc89d0: str      q0, [sp, #0x430] */ ARM64("str q0, [sp, #0x430]");
    /* 0x00bc89d4: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00bc89d8: str      x8, [sp, #0x440] */ ARM64("str x8, [sp, #0x440]");
    /* 0x00bc89dc: mov      w8, #0xd */ ARM64("mov w8, #0xd");
    /* 0x00bc89e0: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc89e4: b        #0xbc8a1c */ goto loc_00bc8a1c;
loc_00bc89e8:
    /* 0x00bc89e8: add      x1, x23, #8 */ ARM64("add x1, x23, #8");
loc_00bc89ec:
    /* 0x00bc89ec: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc89f0: bl       #0xbcbf10 */ CALL_DIRECT(sub_00bcbf10);
    /* 0x00bc89f4: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc89f8: str      q0, [sp, #0x430] */ ARM64("str q0, [sp, #0x430]");
    /* 0x00bc89fc: ldp      x8, x22, [sp, #0x1e0] */ ARM64("ldp x8, x22, [sp, #0x1e0]");
    /* 0x00bc8a00: str      x8, [sp, #0x440] */ ARM64("str x8, [sp, #0x440]");
    /* 0x00bc8a04: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc8a08: ldur     q0, [x10, #0x20] */ ARM64("ldur q0, [x10, #0x20]");
    /* 0x00bc8a0c: str      q0, [sp, #0x300] */ ARM64("str q0, [sp, #0x300]");
    /* 0x00bc8a10: ldur     x8, [x10, #0x30] */ ARM64("ldur x8, [x10, #0x30]");
    /* 0x00bc8a14: str      x8, [sp, #0x310] */ ARM64("str x8, [sp, #0x310]");
    /* 0x00bc8a18: mov      w8, #0xe */ ARM64("mov w8, #0xe");
loc_00bc8a1c:
    /* 0x00bc8a1c: ldr      q0, [sp, #0x430] */ ARM64("ldr q0, [sp, #0x430]");
    /* 0x00bc8a20: stur     q0, [x10, #0x20] */ ARM64("stur q0, [x10, #0x20]");
    /* 0x00bc8a24: ldr      x9, [sp, #0x440] */ ARM64("ldr x9, [sp, #0x440]");
    /* 0x00bc8a28: stur     x9, [x10, #0x30] */ ARM64("stur x9, [x10, #0x30]");
    /* 0x00bc8a2c: ldp      q0, q1, [sp, #0x3a0] */ ARM64("ldp q0, q1, [sp, #0x3a0]");
    /* 0x00bc8a30: stp      q0, q1, [x10, #0xe0] */ ARM64("stp q0, q1, [x10, #0xe0]");
    /* 0x00bc8a34: ldr      x9, [sp, #0x3c0] */ ARM64("ldr x9, [sp, #0x3c0]");
    /* 0x00bc8a38: str      x9, [x10, #0x100] */ ARM64("str x9, [x10, #0x100]");
    /* 0x00bc8a3c: ldp      q0, q1, [sp, #0x360] */ ARM64("ldp q0, q1, [sp, #0x360]");
    /* 0x00bc8a40: stp      q0, q1, [x10, #0xa0] */ ARM64("stp q0, q1, [x10, #0xa0]");
    /* 0x00bc8a44: ldp      q1, q0, [sp, #0x380] */ ARM64("ldp q1, q0, [sp, #0x380]");
    /* 0x00bc8a48: stp      q1, q0, [x10, #0xc0] */ ARM64("stp q1, q0, [x10, #0xc0]");
    /* 0x00bc8a4c: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00bc8a50: stp      q0, q1, [x10, #0x60] */ ARM64("stp q0, q1, [x10, #0x60]");
    /* 0x00bc8a54: ldp      q1, q0, [sp, #0x340] */ ARM64("ldp q1, q0, [sp, #0x340]");
    /* 0x00bc8a58: stp      q1, q0, [x10, #0x80] */ ARM64("stp q1, q0, [x10, #0x80]");
    /* 0x00bc8a5c: ldp      q1, q0, [sp, #0x300] */ ARM64("ldp q1, q0, [sp, #0x300]");
    /* 0x00bc8a60: stp      q1, q0, [x10, #0x40] */ ARM64("stp q1, q0, [x10, #0x40]");
    /* 0x00bc8a64: str      x8, [sp, #0x1e8] */ ARM64("str x8, [sp, #0x1e8]");
    /* 0x00bc8a68: str      x22, [sp, #0x208] */ ARM64("str x22, [sp, #0x208]");
    /* 0x00bc8a6c: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8a70: cmp      x24, x1 */ ARM64("cmp x24, x1");
    /* 0x00bc8a74: b.hs     #0xbc9a20 */ if (COND_HS) goto loc_00bc9a20;
    /* 0x00bc8a78: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8a7c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8a80: madd     x20, x24, x9, x8 */ ARM64("madd x20, x24, x9, x8");
    /* 0x00bc8a84: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc8a88: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc8a8c: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
loc_00bc8a90:
    /* 0x00bc8a90: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc8a94: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc8a98: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc8a9c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc8aa0: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00bc8aa4: b        #0xbc8754 */ goto loc_00bc8754;
loc_00bc8aa8:
    /* 0x00bc8aa8: mov      w25, #0 */ ARM64("mov w25, #0");
    /* 0x00bc8aac: cmp      x9, #4 */ ARM64("cmp x9, #4");
    /* 0x00bc8ab0: b.le     #0xbc8ad0 */ if (COND_LE) goto loc_00bc8ad0;
    /* 0x00bc8ab4: cmp      x9, #8 */ ARM64("cmp x9, #8");
    /* 0x00bc8ab8: b.gt     #0xbc8ae0 */ if (COND_GT) goto loc_00bc8ae0;
    /* 0x00bc8abc: cmp      x9, #5 */ ARM64("cmp x9, #5");
    /* 0x00bc8ac0: b.eq     #0xbc8af4 */ if (COND_EQ) goto loc_00bc8af4;
    /* 0x00bc8ac4: cmp      x9, #6 */ ARM64("cmp x9, #6");
    /* 0x00bc8ac8: b.ne     #0xbc87d8 */ if (COND_NE) goto loc_00bc87d8;
    /* 0x00bc8acc: b        #0xbc87dc */ goto loc_00bc87dc;
loc_00bc8ad0:
    /* 0x00bc8ad0: sub      x8, x9, #1 */ ARM64("sub x8, x9, #1");
    /* 0x00bc8ad4: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00bc8ad8: b.lo     #0xbc87d8 */ if (COND_LO) goto loc_00bc87d8;
    /* 0x00bc8adc: b        #0xbc87dc */ goto loc_00bc87dc;
loc_00bc8ae0:
    /* 0x00bc8ae0: cmp      x9, #9 */ ARM64("cmp x9, #9");
    /* 0x00bc8ae4: b.eq     #0xbc8afc */ if (COND_EQ) goto loc_00bc8afc;
    /* 0x00bc8ae8: cmp      x9, #0xa */ ARM64("cmp x9, #0xa");
    /* 0x00bc8aec: b.eq     #0xbc87dc */ if (COND_EQ) goto loc_00bc87dc;
    /* 0x00bc8af0: b        #0xbc8974 */ goto loc_00bc8974;
loc_00bc8af4:
    /* 0x00bc8af4: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc8af8: b        #0xbc8924 */ goto loc_00bc8924;
loc_00bc8afc:
    /* 0x00bc8afc: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00bc8b00: b        #0xbc8964 */ goto loc_00bc8964;
loc_00bc8b04:
    /* 0x00bc8b04: ldr      x11, [sp, #0x108] */ ARM64("ldr x11, [sp, #0x108]");
    /* 0x00bc8b08: b        #0xbc8b18 */ goto loc_00bc8b18;
loc_00bc8b0c:
    /* 0x00bc8b0c: str      x26, [x27, #0x10] */ ARM64("str x26, [x27, #0x10]");
    /* 0x00bc8b10: ldp      x11, x22, [sp, #0x1a0] */ ARM64("ldp x11, x22, [sp, #0x1a0]");
loc_00bc8b14:
    /* 0x00bc8b14: cbnz     x26, #0xbc8b84 */ if (x26 != 0) goto loc_00bc8b84;
loc_00bc8b18:
    /* 0x00bc8b18: cmp      x11, x22 */ ARM64("cmp x11, x22");
    /* 0x00bc8b1c: b.eq     #0xbc94a8 */ if (COND_EQ) goto loc_00bc94a8;
    /* 0x00bc8b20: mov      x27, x11 */ ARM64("mov x27, x11");
    /* 0x00bc8b24: ldr      x8, [x11], #0x20 */ ARM64("ldr x8, [x11], #0x20");
    /* 0x00bc8b28: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc8b2c: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc8b30: b.eq     #0xbc8b18 */ if (COND_EQ) goto loc_00bc8b18;
    /* 0x00bc8b34: ldr      x23, [x27, #0x10] */ ARM64("ldr x23, [x27, #0x10]");
    /* 0x00bc8b38: str      x11, [sp, #0x1a0] */ ARM64("str x11, [sp, #0x1a0]");
    /* 0x00bc8b3c: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00bc8b40: cbz      x23, #0xbc8b14 */ if (x23 == 0) goto loc_00bc8b14;
    /* 0x00bc8b44: ldr      x24, [x27, #8] */ ARM64("ldr x24, [x27, #8]");
    /* 0x00bc8b48: add      x22, x24, #0x108 */ ARM64("add x22, x24, #0x108");
    /* 0x00bc8b4c: mov      w25, #2 */ ARM64("mov w25, #2");
    /* 0x00bc8b50: mov      x0, x24 */ ARM64("mov x0, x24");
loc_00bc8b54:
    /* 0x00bc8b54: ldr      x8, [x0, #0x18] */ ARM64("ldr x8, [x0, #0x18]");
    /* 0x00bc8b58: add      x28, x26, #1 */ ARM64("add x28, x26, #1");
    /* 0x00bc8b5c: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc8b60: b.eq     #0xbc9454 */ if (COND_EQ) goto loc_00bc9454;
    /* 0x00bc8b64: add      x0, x0, #0x108 */ ARM64("add x0, x0, #0x108");
    /* 0x00bc8b68: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00bc8b6c: add      x22, x22, #0x108 */ ARM64("add x22, x22, #0x108");
    /* 0x00bc8b70: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc8b74: cmp      x23, x28 */ ARM64("cmp x23, x28");
    /* 0x00bc8b78: b.ne     #0xbc8b54 */ if (COND_NE) goto loc_00bc8b54;
    /* 0x00bc8b7c: mov      x26, x23 */ ARM64("mov x26, x23");
    /* 0x00bc8b80: ldp      x11, x22, [sp, #0x1a0] */ ARM64("ldp x11, x22, [sp, #0x1a0]");
loc_00bc8b84:
    /* 0x00bc8b84: mov      x28, #0 */ ARM64("mov x28, #0");
    /* 0x00bc8b88: b        #0xbc8b9c */ goto loc_00bc8b9c;
loc_00bc8b8c:
    /* 0x00bc8b8c: add      x25, x28, #1 */ ARM64("add x25, x28, #1");
    /* 0x00bc8b90: mov      x28, x25 */ ARM64("mov x28, x25");
    /* 0x00bc8b94: cmp      x25, x26 */ ARM64("cmp x25, x26");
    /* 0x00bc8b98: b.hs     #0xbc8f40 */ if (COND_HS) goto loc_00bc8f40;
loc_00bc8b9c:
    /* 0x00bc8b9c: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8ba0: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8ba4: madd     x8, x28, x9, x8 */ ARM64("madd x8, x28, x9, x8");
    /* 0x00bc8ba8: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8bac: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8bb0: b.ne     #0xbc8b8c */ if (COND_NE) goto loc_00bc8b8c;
    /* 0x00bc8bb4: ldr      x9, [x8, #0x30] */ ARM64("ldr x9, [x8, #0x30]");
    /* 0x00bc8bb8: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8bbc: b.ne     #0xbc8b8c */ if (COND_NE) goto loc_00bc8b8c;
    /* 0x00bc8bc0: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc8bc4: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8bc8: b.ne     #0xbc8b8c */ if (COND_NE) goto loc_00bc8b8c;
    /* 0x00bc8bcc: ldr      x9, [x8, #0x40] */ ARM64("ldr x9, [x8, #0x40]");
    /* 0x00bc8bd0: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00bc8bd4: cmp      x9, #5 */ ARM64("cmp x9, #5");
    /* 0x00bc8bd8: b.ne     #0xbc8b8c */ if (COND_NE) goto loc_00bc8b8c;
    /* 0x00bc8bdc: ldr      x8, [x8, #0x28] */ ARM64("ldr x8, [x8, #0x28]");
    /* 0x00bc8be0: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc8be4: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc8be8: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc8bec: b.ne     #0xbc8b8c */ if (COND_NE) goto loc_00bc8b8c;
    /* 0x00bc8bf0: ldr      x24, [x8, #8] */ ARM64("ldr x24, [x8, #8]");
loc_00bc8bf4:
    /* 0x00bc8bf4: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00bc8bf8: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00bc8bfc: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00bc8c00: cbnz     w10, #0xbc8bf4 */ if (w10 != 0) goto loc_00bc8bf4;
    /* 0x00bc8c04: tbnz     x8, #0x3f, #0xbc9508 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00bc9508;
    /* 0x00bc8c08: add      x25, x28, #1 */ ARM64("add x25, x28, #1");
    /* 0x00bc8c0c: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8c10: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00bc8c14: b.hs     #0xbc8f08 */ if (COND_HS) goto loc_00bc8f08;
loc_00bc8c18:
    /* 0x00bc8c18: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8c1c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8c20: madd     x8, x25, x9, x8 */ ARM64("madd x8, x25, x9, x8");
    /* 0x00bc8c24: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8c28: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8c2c: b.ne     #0xbc8f08 */ if (COND_NE) goto loc_00bc8f08;
    /* 0x00bc8c30: ldr      x9, [x8, #0x30] */ ARM64("ldr x9, [x8, #0x30]");
    /* 0x00bc8c34: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8c38: b.ne     #0xbc8f08 */ if (COND_NE) goto loc_00bc8f08;
    /* 0x00bc8c3c: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc8c40: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8c44: b.ne     #0xbc8f08 */ if (COND_NE) goto loc_00bc8f08;
    /* 0x00bc8c48: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00bc8c4c: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00bc8c50: mov      x11, #-7 */ ARM64("mov x11, #-7");
    /* 0x00bc8c54: movk     x11, #0x7fff, lsl #48 */ ARM64("movk x11, #0x7fff, lsl #48");
    /* 0x00bc8c58: add      x11, x11, #9 */ ARM64("add x11, x11, #9");
    /* 0x00bc8c5c: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00bc8c60: b.ne     #0xbc8f08 */ if (COND_NE) goto loc_00bc8f08;
    /* 0x00bc8c64: ldr      x9, [x9, #8] */ ARM64("ldr x9, [x9, #8]");
    /* 0x00bc8c68: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00bc8c6c: cbnz     x10, #0xbc8f08 */ if (x10 != 0) goto loc_00bc8f08;
    /* 0x00bc8c70: ldr      x9, [x9, #8] */ ARM64("ldr x9, [x9, #8]");
    /* 0x00bc8c74: cmp      x9, x24 */ ARM64("cmp x9, x24");
    /* 0x00bc8c78: b.ne     #0xbc8f08 */ if (COND_NE) goto loc_00bc8f08;
    /* 0x00bc8c7c: ldr      x8, [x8, #0x40] */ ARM64("ldr x8, [x8, #0x40]");
    /* 0x00bc8c80: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc8c84: cmp      x9, #0xa */ ARM64("cmp x9, #0xa");
    /* 0x00bc8c88: b.eq     #0xbc8cd4 */ if (COND_EQ) goto loc_00bc8cd4;
    /* 0x00bc8c8c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc8c90: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00bc8c94: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00bc8c98: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc8c9c: ldp      x0, x9, [sp, #0x1d8] */ ARM64("ldp x0, x9, [sp, #0x1d8]");
    /* 0x00bc8ca0: lsl      x9, x9, #3 */ ARM64("lsl x9, x9, #3");
loc_00bc8ca4:
    /* 0x00bc8ca4: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00bc8ca8: b.eq     #0xbc8cc4 */ if (COND_EQ) goto loc_00bc8cc4;
    /* 0x00bc8cac: ldr      x10, [x0, x8] */ ARM64("ldr x10, [x0, x8]");
    /* 0x00bc8cb0: ldr      x10, [x10] */ ARM64("ldr x10, [x10]");
    /* 0x00bc8cb4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc8cb8: cmp      x10, x24 */ ARM64("cmp x10, x24");
    /* 0x00bc8cbc: b.ne     #0xbc8ca4 */ if (COND_NE) goto loc_00bc8ca4;
    /* 0x00bc8cc0: b        #0xbc8efc */ goto loc_00bc8efc;
loc_00bc8cc4:
    /* 0x00bc8cc4: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc8cc8: cbz      x8, #0xbc8cd0 */ if (x8 == 0) goto loc_00bc8cd0;
    /* 0x00bc8ccc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc8cd0:
    /* 0x00bc8cd0: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
loc_00bc8cd4:
    /* 0x00bc8cd4: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00bc8cd8: b.hs     #0xbc96b8 */ if (COND_HS) goto loc_00bc96b8;
    /* 0x00bc8cdc: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8ce0: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8ce4: madd     x8, x25, x9, x8 */ ARM64("madd x8, x25, x9, x8");
    /* 0x00bc8ce8: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8cec: mov      w10, #0xc */ ARM64("mov w10, #0xc");
    /* 0x00bc8cf0: str      x10, [x8, #0x18] */ ARM64("str x10, [x8, #0x18]");
    /* 0x00bc8cf4: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8cf8: b.ne     #0xbc9714 */ if (COND_NE) goto loc_00bc9714;
    /* 0x00bc8cfc: ldp      x26, x22, [x8, #0x20] */ ARM64("ldp x26, x22, [x8, #0x20]");
    /* 0x00bc8d00: ldp      x23, x10, [x8, #0x30] */ ARM64("ldp x23, x10, [x8, #0x30]");
    /* 0x00bc8d04: ldp      x9, x8, [x8, #0x40] */ ARM64("ldp x9, x8, [x8, #0x40]");
    /* 0x00bc8d08: stp      x9, x10, [sp, #0x190] */ ARM64("stp x9, x10, [sp, #0x190]");
    /* 0x00bc8d0c: str      x8, [sp, #0x158] */ ARM64("str x8, [sp, #0x158]");
    /* 0x00bc8d10: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8d14: cmp      x28, x1 */ ARM64("cmp x28, x1");
    /* 0x00bc8d18: b.hs     #0xbc96e0 */ if (COND_HS) goto loc_00bc96e0;
    /* 0x00bc8d1c: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8d20: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8d24: madd     x8, x28, x9, x8 */ ARM64("madd x8, x28, x9, x8");
    /* 0x00bc8d28: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8d2c: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8d30: b.ne     #0xbc95b8 */ if (COND_NE) goto loc_00bc95b8;
    /* 0x00bc8d34: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc8d38: cbz      x9, #0xbc96cc */ if (x9 == 0) goto loc_00bc96cc;
    /* 0x00bc8d3c: ldr      x20, [x8, #0x40] */ ARM64("ldr x20, [x8, #0x40]");
    /* 0x00bc8d40: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x00bc8d44: cmp      x8, #5 */ ARM64("cmp x8, #5");
    /* 0x00bc8d48: b.ne     #0xbc95c4 */ if (COND_NE) goto loc_00bc95c4;
    /* 0x00bc8d4c: stp      x22, x22, [x29, #-0xd8] */ ARM64("stp x22, x22, [x29, #-0xd8]");
    /* 0x00bc8d50: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00bc8d54: madd     x8, x23, x8, x22 */ ARM64("madd x8, x23, x8, x22");
    /* 0x00bc8d58: stp      x26, x8, [x29, #-0xc8] */ ARM64("stp x26, x8, [x29, #-0xc8]");
    /* 0x00bc8d5c: cbz      x23, #0xbc96f0 */ if (x23 == 0) goto loc_00bc96f0;
    /* 0x00bc8d60: add      x8, x22, #0x18 */ ARM64("add x8, x22, #0x18");
    /* 0x00bc8d64: stur     x8, [x29, #-0xd0] */ ARM64("stur x8, [x29, #-0xd0]");
    /* 0x00bc8d68: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00bc8d6c: mov      x9, #-0x7ffffffffffffffd */ ARM64("mov x9, #-0x7ffffffffffffffd");
    /* 0x00bc8d70: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc8d74: b.eq     #0xbc96f0 */ if (COND_EQ) goto loc_00bc96f0;
    /* 0x00bc8d78: ldp      x10, x0, [x22, #8] */ ARM64("ldp x10, x0, [x22, #8]");
    /* 0x00bc8d7c: mov      x9, #-7 */ ARM64("mov x9, #-7");
    /* 0x00bc8d80: movk     x9, #0x7fff, lsl #48 */ ARM64("movk x9, #0x7fff, lsl #48");
    /* 0x00bc8d84: add      x9, x9, #9 */ ARM64("add x9, x9, #9");
    /* 0x00bc8d88: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc8d8c: b.ne     #0xbc97c4 */ if (COND_NE) goto loc_00bc97c4;
    /* 0x00bc8d90: str      x10, [sp, #0x150] */ ARM64("str x10, [sp, #0x150]");
    /* 0x00bc8d94: ldr      q0, [x0] */ ARM64("ldr q0, [x0]");
    /* 0x00bc8d98: str      q0, [sp, #0x300] */ ARM64("str q0, [sp, #0x300]");
    /* 0x00bc8d9c: ldr      q0, [x0, #0x10] */ ARM64("ldr q0, [x0, #0x10]");
    /* 0x00bc8da0: str      q0, [sp, #0x310] */ ARM64("str q0, [sp, #0x310]");
    /* 0x00bc8da4: ldr      q0, [x0, #0x20] */ ARM64("ldr q0, [x0, #0x20]");
    /* 0x00bc8da8: str      q0, [sp, #0x320] */ ARM64("str q0, [sp, #0x320]");
    /* 0x00bc8dac: ldr      q0, [x0, #0x30] */ ARM64("ldr q0, [x0, #0x30]");
    /* 0x00bc8db0: str      q0, [sp, #0x330] */ ARM64("str q0, [sp, #0x330]");
    /* 0x00bc8db4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc8db8: ldr      x11, [sp, #0x158] */ ARM64("ldr x11, [sp, #0x158]");
    /* 0x00bc8dbc: lsl      x22, x11, #6 */ ARM64("lsl x22, x11, #6");
    /* 0x00bc8dc0: ldp      x9, x10, [sp, #0x190] */ ARM64("ldp x9, x10, [sp, #0x190]");
    /* 0x00bc8dc4: add      x8, x9, x22 */ ARM64("add x8, x9, x22");
    /* 0x00bc8dc8: str      x9, [sp, #0x430] */ ARM64("str x9, [sp, #0x430]");
    /* 0x00bc8dcc: str      x9, [sp, #0x438] */ ARM64("str x9, [sp, #0x438]");
    /* 0x00bc8dd0: str      x10, [sp, #0x440] */ ARM64("str x10, [sp, #0x440]");
    /* 0x00bc8dd4: str      x8, [sp, #0x448] */ ARM64("str x8, [sp, #0x448]");
    /* 0x00bc8dd8: cbz      x11, #0xbc9700 */ if (x11 == 0) goto loc_00bc9700;
    /* 0x00bc8ddc: mov      x26, x9 */ ARM64("mov x26, x9");
    /* 0x00bc8de0: ldr      x8, [x26], #0x40 */ ARM64("ldr x8, [x26], #0x40");
    /* 0x00bc8de4: str      x26, [sp, #0x438] */ ARM64("str x26, [sp, #0x438]");
    /* 0x00bc8de8: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc8dec: b.eq     #0xbc9704 */ if (COND_EQ) goto loc_00bc9704;
    /* 0x00bc8df0: ldur     q0, [x9, #8] */ ARM64("ldur q0, [x9, #8]");
    /* 0x00bc8df4: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc8df8: stur     q0, [x10, #0x48] */ ARM64("stur q0, [x10, #0x48]");
    /* 0x00bc8dfc: ldur     q0, [x9, #0x18] */ ARM64("ldur q0, [x9, #0x18]");
    /* 0x00bc8e00: stur     q0, [x10, #0x58] */ ARM64("stur q0, [x10, #0x58]");
    /* 0x00bc8e04: ldur     q0, [x9, #0x28] */ ARM64("ldur q0, [x9, #0x28]");
    /* 0x00bc8e08: stur     q0, [x10, #0x68] */ ARM64("stur q0, [x10, #0x68]");
    /* 0x00bc8e0c: ldr      x9, [x9, #0x38] */ ARM64("ldr x9, [x9, #0x38]");
    /* 0x00bc8e10: stur     x9, [x10, #0x78] */ ARM64("stur x9, [x10, #0x78]");
    /* 0x00bc8e14: ldp      q0, q1, [sp, #0x300] */ ARM64("ldp q0, q1, [sp, #0x300]");
    /* 0x00bc8e18: stp      q0, q1, [sp, #0x1d0] */ ARM64("stp q0, q1, [sp, #0x1d0]");
    /* 0x00bc8e1c: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00bc8e20: stp      q0, q1, [sp, #0x1f0] */ ARM64("stp q0, q1, [sp, #0x1f0]");
    /* 0x00bc8e24: str      x8, [sp, #0x210] */ ARM64("str x8, [sp, #0x210]");
    /* 0x00bc8e28: ldr      x23, [x20, #0x18] */ ARM64("ldr x23, [x20, #0x18]");
    /* 0x00bc8e2c: ldr      x8, [x20, #8] */ ARM64("ldr x8, [x20, #8]");
    /* 0x00bc8e30: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00bc8e34: b.ne     #0xbc8e40 */ if (COND_NE) goto loc_00bc8e40;
    /* 0x00bc8e38: add      x0, x20, #8 */ ARM64("add x0, x20, #8");
    /* 0x00bc8e3c: bl       #0xc73950 */ CALL_DIRECT(sub_00c73950);
loc_00bc8e40:
    /* 0x00bc8e40: ldr      x8, [x20, #0x10] */ ARM64("ldr x8, [x20, #0x10]");
    /* 0x00bc8e44: add      x8, x8, x23, lsl #7 */ ARM64("add x8, x8, x23, lsl #7");
    /* 0x00bc8e48: ldr      q0, [sp, #0x210] */ ARM64("ldr q0, [sp, #0x210]");
    /* 0x00bc8e4c: str      q0, [x8, #0x40] */ ARM64("str q0, [x8, #0x40]");
    /* 0x00bc8e50: ldr      q0, [sp, #0x220] */ ARM64("ldr q0, [sp, #0x220]");
    /* 0x00bc8e54: str      q0, [x8, #0x50] */ ARM64("str q0, [x8, #0x50]");
    /* 0x00bc8e58: ldr      q0, [sp, #0x230] */ ARM64("ldr q0, [sp, #0x230]");
    /* 0x00bc8e5c: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
    /* 0x00bc8e60: ldr      q0, [sp, #0x240] */ ARM64("ldr q0, [sp, #0x240]");
    /* 0x00bc8e64: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00bc8e68: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc8e6c: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc8e70: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00bc8e74: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00bc8e78: ldr      q0, [sp, #0x1f0] */ ARM64("ldr q0, [sp, #0x1f0]");
    /* 0x00bc8e7c: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00bc8e80: ldr      q0, [sp, #0x200] */ ARM64("ldr q0, [sp, #0x200]");
    /* 0x00bc8e84: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00bc8e88: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00bc8e8c: str      x8, [x20, #0x18] */ ARM64("str x8, [x20, #0x18]");
    /* 0x00bc8e90: sub      x8, x22, #0x40 */ ARM64("sub x8, x22, #0x40");
    /* 0x00bc8e94: lsr      x8, x8, #6 */ ARM64("lsr x8, x8, #6");
    /* 0x00bc8e98: add      x20, x8, #1 */ ARM64("add x20, x8, #1");
loc_00bc8e9c:
    /* 0x00bc8e9c: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00bc8ea0: b.eq     #0xbc8eb8 */ if (COND_EQ) goto loc_00bc8eb8;
    /* 0x00bc8ea4: add      x22, x26, #0x40 */ ARM64("add x22, x26, #0x40");
    /* 0x00bc8ea8: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00bc8eac: bl       #0xbe6008 */ CALL_DIRECT(sub_00be6008);
    /* 0x00bc8eb0: mov      x26, x22 */ ARM64("mov x26, x22");
    /* 0x00bc8eb4: b        #0xbc8e9c */ goto loc_00bc8e9c;
loc_00bc8eb8:
    /* 0x00bc8eb8: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc8ebc: cbz      x8, #0xbc8ec8 */ if (x8 == 0) goto loc_00bc8ec8;
    /* 0x00bc8ec0: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
    /* 0x00bc8ec4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc8ec8:
    /* 0x00bc8ec8: ldr      x20, [sp, #0x150] */ ARM64("ldr x20, [sp, #0x150]");
    /* 0x00bc8ecc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc8ed0: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc8ed4: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc8ed8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc8edc: sub      x0, x29, #0xd8 */ ARM64("sub x0, x29, #0xd8");
    /* 0x00bc8ee0: bl       #0xbe5df4 */ CALL_DIRECT(sub_00be5df4);
    /* 0x00bc8ee4: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00bc8ee8: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8eec: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00bc8ef0: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00bc8ef4: b.lo     #0xbc8c18 */ if (COND_LO) goto loc_00bc8c18;
    /* 0x00bc8ef8: b        #0xbc8f08 */ goto loc_00bc8f08;
loc_00bc8efc:
    /* 0x00bc8efc: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc8f00: cbz      x8, #0xbc8f08 */ if (x8 == 0) goto loc_00bc8f08;
    /* 0x00bc8f04: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc8f08:
    /* 0x00bc8f08: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
loc_00bc8f0c:
    /* 0x00bc8f0c: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00bc8f10: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc8f14: stlxr    w9, x8, [x24] */ ARM64("stlxr w9, x8, [x24]");
    /* 0x00bc8f18: cbnz     w9, #0xbc8f0c */ if (w9 != 0) goto loc_00bc8f0c;
    /* 0x00bc8f1c: b.ne     #0xbc8f2c */ if (COND_NE) goto loc_00bc8f2c;
    /* 0x00bc8f20: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc8f24: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bc8f28: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc8f2c:
    /* 0x00bc8f2c: ldr      x26, [x27, #0x10] */ ARM64("ldr x26, [x27, #0x10]");
    /* 0x00bc8f30: ldr      x11, [sp, #0x1a0] */ ARM64("ldr x11, [sp, #0x1a0]");
    /* 0x00bc8f34: mov      x28, x25 */ ARM64("mov x28, x25");
    /* 0x00bc8f38: cmp      x25, x26 */ ARM64("cmp x25, x26");
    /* 0x00bc8f3c: b.lo     #0xbc8b9c */ if (COND_LO) goto loc_00bc8b9c;
loc_00bc8f40:
    /* 0x00bc8f40: cmp      x26, #2 */ ARM64("cmp x26, #2");
    /* 0x00bc8f44: b.lo     #0xbc8b18 */ if (COND_LO) goto loc_00bc8b18;
    /* 0x00bc8f48: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00bc8f4c: b        #0xbc8f68 */ goto loc_00bc8f68;
loc_00bc8f50:
    /* 0x00bc8f50: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc8f54: bl       #0xbcb868 */ CALL_DIRECT(sub_00bcb868);
loc_00bc8f58:
    /* 0x00bc8f58: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
loc_00bc8f5c:
    /* 0x00bc8f5c: add      x24, x24, #1 */ ARM64("add x24, x24, #1");
    /* 0x00bc8f60: cmp      x24, x26 */ ARM64("cmp x24, x26");
    /* 0x00bc8f64: b.eq     #0xbc944c */ if (COND_EQ) goto loc_00bc944c;
loc_00bc8f68:
    /* 0x00bc8f68: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8f6c: cmp      x24, x1 */ ARM64("cmp x24, x1");
    /* 0x00bc8f70: b.hs     #0xbc9698 */ if (COND_HS) goto loc_00bc9698;
    /* 0x00bc8f74: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8f78: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8f7c: madd     x8, x24, x9, x8 */ ARM64("madd x8, x24, x9, x8");
    /* 0x00bc8f80: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8f84: cmp      x9, #0x1f */ ARM64("cmp x9, #0x1f");
    /* 0x00bc8f88: b.ne     #0xbc8f5c */ if (COND_NE) goto loc_00bc8f5c;
    /* 0x00bc8f8c: ldr      x22, [x8, #0x78] */ ARM64("ldr x22, [x8, #0x78]");
loc_00bc8f90:
    /* 0x00bc8f90: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc8f94: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00bc8f98: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00bc8f9c: cbnz     w10, #0xbc8f90 */ if (w10 != 0) goto loc_00bc8f90;
    /* 0x00bc8fa0: tbnz     x8, #0x3f, #0xbc9508 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00bc9508;
    /* 0x00bc8fa4: sub      x23, x24, #1 */ ARM64("sub x23, x24, #1");
    /* 0x00bc8fa8: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc8fac: cmp      x23, x1 */ ARM64("cmp x23, x1");
    /* 0x00bc8fb0: b.hs     #0xbc9668 */ if (COND_HS) goto loc_00bc9668;
    /* 0x00bc8fb4: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc8fb8: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc8fbc: madd     x8, x23, x9, x8 */ ARM64("madd x8, x23, x9, x8");
    /* 0x00bc8fc0: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc8fc4: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc8fc8: b.ne     #0xbc911c */ if (COND_NE) goto loc_00bc911c;
    /* 0x00bc8fcc: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00bc8fd0: stp      x9, x22, [sp, #0x1d0] */ ARM64("stp x9, x22, [sp, #0x1d0]");
    /* 0x00bc8fd4: ldr      x9, [x8, #0x30] */ ARM64("ldr x9, [x8, #0x30]");
    /* 0x00bc8fd8: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00bc8fdc: b.ne     #0xbc8f50 */ if (COND_NE) goto loc_00bc8f50;
    /* 0x00bc8fe0: ldr      x8, [x8, #0x28] */ ARM64("ldr x8, [x8, #0x28]");
    /* 0x00bc8fe4: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00bc8fe8: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00bc8fec: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00bc8ff0: b.ne     #0xbc8f50 */ if (COND_NE) goto loc_00bc8f50;
    /* 0x00bc8ff4: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00bc8ff8: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00bc8ffc: b.ne     #0xbc8f50 */ if (COND_NE) goto loc_00bc8f50;
    /* 0x00bc9000: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9004: bl       #0xbcb868 */ CALL_DIRECT(sub_00bcb868);
    /* 0x00bc9008: ldr      x1, [x27, #0x10] */ ARM64("ldr x1, [x27, #0x10]");
    /* 0x00bc900c: cmp      x24, x1 */ ARM64("cmp x24, x1");
    /* 0x00bc9010: b.hs     #0xbc9820 */ if (COND_HS) goto loc_00bc9820;
    /* 0x00bc9014: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc9018: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc901c: madd     x8, x24, x9, x8 */ ARM64("madd x8, x24, x9, x8");
    /* 0x00bc9020: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc9024: mov      w10, #0xc */ ARM64("mov w10, #0xc");
    /* 0x00bc9028: str      x10, [x8, #0x18] */ ARM64("str x10, [x8, #0x18]");
    /* 0x00bc902c: cmp      x9, #0x1f */ ARM64("cmp x9, #0x1f");
    /* 0x00bc9030: b.ne     #0xbc9834 */ if (COND_NE) goto loc_00bc9834;
    /* 0x00bc9034: ldur     q0, [x8, #0x70] */ ARM64("ldur q0, [x8, #0x70]");
    /* 0x00bc9038: str      q0, [sp, #0x350] */ ARM64("str q0, [sp, #0x350]");
    /* 0x00bc903c: ldur     q0, [x8, #0x50] */ ARM64("ldur q0, [x8, #0x50]");
    /* 0x00bc9040: str      q0, [sp, #0x330] */ ARM64("str q0, [sp, #0x330]");
    /* 0x00bc9044: ldur     q0, [x8, #0x60] */ ARM64("ldur q0, [x8, #0x60]");
    /* 0x00bc9048: str      q0, [sp, #0x340] */ ARM64("str q0, [sp, #0x340]");
    /* 0x00bc904c: ldur     x9, [x8, #0x80] */ ARM64("ldur x9, [x8, #0x80]");
    /* 0x00bc9050: str      x9, [sp, #0x360] */ ARM64("str x9, [sp, #0x360]");
    /* 0x00bc9054: ldur     q0, [x8, #0x20] */ ARM64("ldur q0, [x8, #0x20]");
    /* 0x00bc9058: str      q0, [sp, #0x300] */ ARM64("str q0, [sp, #0x300]");
    /* 0x00bc905c: ldur     q0, [x8, #0x30] */ ARM64("ldur q0, [x8, #0x30]");
    /* 0x00bc9060: str      q0, [sp, #0x310] */ ARM64("str q0, [sp, #0x310]");
    /* 0x00bc9064: ldur     q0, [x8, #0x40] */ ARM64("ldur q0, [x8, #0x40]");
    /* 0x00bc9068: str      q0, [sp, #0x320] */ ARM64("str q0, [sp, #0x320]");
    /* 0x00bc906c: ldr      x20, [sp, #0x358] */ ARM64("ldr x20, [sp, #0x358]");
    /* 0x00bc9070: ldr      x8, [sp, #0x1c8] */ ARM64("ldr x8, [sp, #0x1c8]");
    /* 0x00bc9074: cbz      x8, #0xbc94f4 */ if (x8 == 0) goto loc_00bc94f4;
    /* 0x00bc9078: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00bc907c: add      x9, x20, #8 */ ARM64("add x9, x20, #8");
    /* 0x00bc9080: mov      x10, #0xa95 */ ARM64("mov x10, #0xa95");
    /* 0x00bc9084: movk     x10, #0x2722, lsl #16 */ ARM64("movk x10, #0x2722, lsl #16");
    /* 0x00bc9088: movk     x10, #0xc1b7, lsl #32 */ ARM64("movk x10, #0xc1b7, lsl #32");
    /* 0x00bc908c: movk     x10, #0x517c, lsl #48 */ ARM64("movk x10, #0x517c, lsl #48");
    /* 0x00bc9090: mul      x11, x9, x10 */ ARM64("mul x11, x9, x10");
    /* 0x00bc9094: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00bc9098: ldp      x10, x9, [sp, #0x1b0] */ ARM64("ldp x10, x9, [sp, #0x1b0]");
    /* 0x00bc909c: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00bc90a0: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc90a4: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc90a8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc90ac: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc90b0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc90b4: b.eq     #0xbc90e4 */ if (COND_EQ) goto loc_00bc90e4;
loc_00bc90b8:
    /* 0x00bc90b8: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00bc90bc: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00bc90c0: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00bc90c4: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00bc90c8: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00bc90cc: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00bc90d0: cmp      x20, x14 */ ARM64("cmp x20, x14");
    /* 0x00bc90d4: b.eq     #0xbc9140 */ if (COND_EQ) goto loc_00bc9140;
    /* 0x00bc90d8: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00bc90dc: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00bc90e0: b.ne     #0xbc90b8 */ if (COND_NE) goto loc_00bc90b8;
loc_00bc90e4:
    /* 0x00bc90e4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00bc90e8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00bc90ec: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00bc90f0: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00bc90f4: tbnz     w12, #0, #0xbc94f4 */ if (((w12 >> #0) & 1) != 0) goto loc_00bc94f4;
    /* 0x00bc90f8: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00bc90fc: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00bc9100: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00bc9104: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00bc9108: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00bc910c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00bc9110: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00bc9114: b.ne     #0xbc90b8 */ if (COND_NE) goto loc_00bc90b8;
    /* 0x00bc9118: b        #0xbc90e4 */ goto loc_00bc90e4;
loc_00bc911c:
    /* 0x00bc911c: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc9120: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc9124: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bc9128: cbnz     w9, #0xbc911c */ if (w9 != 0) goto loc_00bc911c;
    /* 0x00bc912c: b.ne     #0xbc8f58 */ if (COND_NE) goto loc_00bc8f58;
    /* 0x00bc9130: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc9134: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9138: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc913c: b        #0xbc8f58 */ goto loc_00bc8f58;
loc_00bc9140:
    /* 0x00bc9140: ldur     x8, [x13, #-8] */ ARM64("ldur x8, [x13, #-8]");
    /* 0x00bc9144: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00bc9148: stur     x8, [x13, #-8] */ ARM64("stur x8, [x13, #-8]");
    /* 0x00bc914c: ldr      x8, [x27, #0x10] */ ARM64("ldr x8, [x27, #0x10]");
    /* 0x00bc9150: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00bc9154: b.hs     #0xbc95e4 */ if (COND_HS) goto loc_00bc95e4;
    /* 0x00bc9158: ldr      x8, [x27, #8] */ ARM64("ldr x8, [x27, #8]");
    /* 0x00bc915c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00bc9160: madd     x8, x23, x9, x8 */ ARM64("madd x8, x23, x9, x8");
    /* 0x00bc9164: ldr      x9, [x8, #0x18] */ ARM64("ldr x9, [x8, #0x18]");
    /* 0x00bc9168: cmp      x9, #0xf */ ARM64("cmp x9, #0xf");
    /* 0x00bc916c: b.ne     #0xbc95f0 */ if (COND_NE) goto loc_00bc95f0;
    /* 0x00bc9170: ldr      x9, [x8, #0x48] */ ARM64("ldr x9, [x8, #0x48]");
    /* 0x00bc9174: cbz      x9, #0xbc98d8 */ if (x9 == 0) goto loc_00bc98d8;
    /* 0x00bc9178: ldr      x25, [x8, #0x40] */ ARM64("ldr x25, [x8, #0x40]");
    /* 0x00bc917c: ldr      x8, [x25] */ ARM64("ldr x8, [x25]");
    /* 0x00bc9180: cmp      x8, #5 */ ARM64("cmp x8, #5");
    /* 0x00bc9184: b.ne     #0xbc95fc */ if (COND_NE) goto loc_00bc95fc;
    /* 0x00bc9188: ldr      x22, [x25, #0x18] */ ARM64("ldr x22, [x25, #0x18]");
    /* 0x00bc918c: mov      x10, x22 */ ARM64("mov x10, x22");
    /* 0x00bc9190: cbz      x22, #0xbc920c */ if (x22 == 0) goto loc_00bc920c;
    /* 0x00bc9194: ldr      x8, [x25, #0x10] */ ARM64("ldr x8, [x25, #0x10]");
    /* 0x00bc9198: cmp      x22, #1 */ ARM64("cmp x22, #1");
    /* 0x00bc919c: b.ne     #0xbc91ac */ if (COND_NE) goto loc_00bc91ac;
    /* 0x00bc91a0: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00bc91a4: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc91a8: b        #0xbc91f0 */ goto loc_00bc91f0;
loc_00bc91ac:
    /* 0x00bc91ac: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00bc91b0: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00bc91b4: and      x9, x22, #0xfffffffffffffffe */ ARM64("and x9, x22, #0xfffffffffffffffe");
    /* 0x00bc91b8: add      x12, x8, #0x80 */ ARM64("add x12, x8, #0x80");
    /* 0x00bc91bc: and      x13, x22, #0xfffffffffffffffe */ ARM64("and x13, x22, #0xfffffffffffffffe");
loc_00bc91c0:
    /* 0x00bc91c0: ldur     x14, [x12, #-0x80] */ ARM64("ldur x14, [x12, #-0x80]");
    /* 0x00bc91c4: ldr      x15, [x12] */ ARM64("ldr x15, [x12]");
    /* 0x00bc91c8: cmp      x14, #0xc */ ARM64("cmp x14, #0xc");
    /* 0x00bc91cc: cinc     x10, x10, eq */ ARM64("cinc x10, x10, eq");
    /* 0x00bc91d0: cmp      x15, #0xc */ ARM64("cmp x15, #0xc");
    /* 0x00bc91d4: cinc     x11, x11, eq */ ARM64("cinc x11, x11, eq");
    /* 0x00bc91d8: add      x12, x12, #0x100 */ ARM64("add x12, x12, #0x100");
    /* 0x00bc91dc: subs     x13, x13, #2 */ ARM64("subs x13, x13, #2");
    /* 0x00bc91e0: b.ne     #0xbc91c0 */ if (COND_NE) goto loc_00bc91c0;
    /* 0x00bc91e4: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00bc91e8: cmp      x22, x9 */ ARM64("cmp x22, x9");
    /* 0x00bc91ec: b.eq     #0xbc920c */ if (COND_EQ) goto loc_00bc920c;
loc_00bc91f0:
    /* 0x00bc91f0: sub      x11, x22, x9 */ ARM64("sub x11, x22, x9");
    /* 0x00bc91f4: add      x8, x8, x9, lsl #7 */ ARM64("add x8, x8, x9, lsl #7");
loc_00bc91f8:
    /* 0x00bc91f8: ldr      x9, [x8], #0x80 */ ARM64("ldr x9, [x8], #0x80");
    /* 0x00bc91fc: cmp      x9, #0xc */ ARM64("cmp x9, #0xc");
    /* 0x00bc9200: cinc     x10, x10, eq */ ARM64("cinc x10, x10, eq");
    /* 0x00bc9204: subs     x11, x11, #1 */ ARM64("subs x11, x11, #1");
    /* 0x00bc9208: b.ne     #0xbc91f8 */ if (COND_NE) goto loc_00bc91f8;
loc_00bc920c:
    /* 0x00bc920c: ldr      x8, [sp, #0x360] */ ARM64("ldr x8, [sp, #0x360]");
    /* 0x00bc9210: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00bc9214: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00bc9218: b.ne     #0xbc9608 */ if (COND_NE) goto loc_00bc9608;
    /* 0x00bc921c: ldr      x9, [sp, #0x340] */ ARM64("ldr x9, [sp, #0x340]");
    /* 0x00bc9220: ldr      x28, [sp, #0x348] */ ARM64("ldr x28, [sp, #0x348]");
    /* 0x00bc9224: ldr      x8, [sp, #0x350] */ ARM64("ldr x8, [sp, #0x350]");
    /* 0x00bc9228: add      x10, x28, x8, lsl #6 */ ARM64("add x10, x28, x8, lsl #6");
    /* 0x00bc922c: str      x28, [sp, #0x430] */ ARM64("str x28, [sp, #0x430]");
    /* 0x00bc9230: str      x28, [sp, #0x438] */ ARM64("str x28, [sp, #0x438]");
    /* 0x00bc9234: str      x9, [sp, #0x158] */ ARM64("str x9, [sp, #0x158]");
    /* 0x00bc9238: str      x9, [sp, #0x440] */ ARM64("str x9, [sp, #0x440]");
    /* 0x00bc923c: str      x10, [sp, #0x198] */ ARM64("str x10, [sp, #0x198]");
    /* 0x00bc9240: str      x10, [sp, #0x448] */ ARM64("str x10, [sp, #0x448]");
    /* 0x00bc9244: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9248: cbz      x8, #0xbc932c */ if (x8 == 0) goto loc_00bc932c;
    /* 0x00bc924c: lsl      x23, x22, #7 */ ARM64("lsl x23, x22, #7");
    /* 0x00bc9250: str      x28, [sp, #0x150] */ ARM64("str x28, [sp, #0x150]");
    /* 0x00bc9254: add      x0, x28, #0x40 */ ARM64("add x0, x28, #0x40");
    /* 0x00bc9258: b        #0xbc92c4 */ goto loc_00bc92c4;
loc_00bc925c:
    /* 0x00bc925c: add      x0, x28, #0x80 */ ARM64("add x0, x28, #0x80");
    /* 0x00bc9260: ldr      x8, [x25, #0x10] */ ARM64("ldr x8, [x25, #0x10]");
    /* 0x00bc9264: add      x8, x8, x23 */ ARM64("add x8, x8, x23");
    /* 0x00bc9268: ldr      q0, [sp, #0x210] */ ARM64("ldr q0, [sp, #0x210]");
    /* 0x00bc926c: str      q0, [x8, #0x40] */ ARM64("str q0, [x8, #0x40]");
    /* 0x00bc9270: ldr      q0, [sp, #0x220] */ ARM64("ldr q0, [sp, #0x220]");
    /* 0x00bc9274: str      q0, [x8, #0x50] */ ARM64("str q0, [x8, #0x50]");
    /* 0x00bc9278: ldr      q0, [sp, #0x230] */ ARM64("ldr q0, [sp, #0x230]");
    /* 0x00bc927c: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
    /* 0x00bc9280: ldr      q0, [sp, #0x240] */ ARM64("ldr q0, [sp, #0x240]");
    /* 0x00bc9284: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00bc9288: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc928c: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc9290: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00bc9294: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00bc9298: ldr      q0, [sp, #0x1f0] */ ARM64("ldr q0, [sp, #0x1f0]");
    /* 0x00bc929c: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00bc92a0: ldr      q0, [sp, #0x200] */ ARM64("ldr q0, [sp, #0x200]");
    /* 0x00bc92a4: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00bc92a8: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bc92ac: str      x22, [x25, #0x18] */ ARM64("str x22, [x25, #0x18]");
    /* 0x00bc92b0: add      x23, x23, #0x80 */ ARM64("add x23, x23, #0x80");
    /* 0x00bc92b4: add      x8, x28, #0x40 */ ARM64("add x8, x28, #0x40");
    /* 0x00bc92b8: ldr      x9, [sp, #0x198] */ ARM64("ldr x9, [sp, #0x198]");
    /* 0x00bc92bc: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00bc92c0: b.eq     #0xbc9320 */ if (COND_EQ) goto loc_00bc9320;
loc_00bc92c4:
    /* 0x00bc92c4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00bc92c8: ldr      x8, [x28, #-0x40]! */ ARM64("ldr x8, [x28, #-0x40]!");
    /* 0x00bc92cc: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc92d0: b.eq     #0xbc9324 */ if (COND_EQ) goto loc_00bc9324;
    /* 0x00bc92d4: str      x0, [sp, #0x190] */ ARM64("str x0, [sp, #0x190]");
    /* 0x00bc92d8: ldur     q0, [x28, #8] */ ARM64("ldur q0, [x28, #8]");
    /* 0x00bc92dc: add      x10, sp, #0x1d0 */ ARM64("add x10, sp, #0x1d0");
    /* 0x00bc92e0: stur     q0, [x10, #0x48] */ ARM64("stur q0, [x10, #0x48]");
    /* 0x00bc92e4: ldur     q0, [x28, #0x18] */ ARM64("ldur q0, [x28, #0x18]");
    /* 0x00bc92e8: stur     q0, [x10, #0x58] */ ARM64("stur q0, [x10, #0x58]");
    /* 0x00bc92ec: ldur     q0, [x28, #0x28] */ ARM64("ldur q0, [x28, #0x28]");
    /* 0x00bc92f0: stur     q0, [x10, #0x68] */ ARM64("stur q0, [x10, #0x68]");
    /* 0x00bc92f4: ldr      x9, [x28, #0x38] */ ARM64("ldr x9, [x28, #0x38]");
    /* 0x00bc92f8: stur     x9, [x10, #0x78] */ ARM64("stur x9, [x10, #0x78]");
    /* 0x00bc92fc: mov      w9, #0xc */ ARM64("mov w9, #0xc");
    /* 0x00bc9300: str      x9, [sp, #0x1d0] */ ARM64("str x9, [sp, #0x1d0]");
    /* 0x00bc9304: str      x8, [sp, #0x210] */ ARM64("str x8, [sp, #0x210]");
    /* 0x00bc9308: ldur     x8, [x25, #8] */ ARM64("ldur x8, [x25, #8]");
    /* 0x00bc930c: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc9310: b.ne     #0xbc925c */ if (COND_NE) goto loc_00bc925c;
    /* 0x00bc9314: add      x0, x25, #8 */ ARM64("add x0, x25, #8");
    /* 0x00bc9318: bl       #0xc73950 */ CALL_DIRECT(sub_00c73950);
    /* 0x00bc931c: b        #0xbc925c */ goto loc_00bc925c;
loc_00bc9320:
    /* 0x00bc9320: ldr      x0, [sp, #0x198] */ ARM64("ldr x0, [sp, #0x198]");
loc_00bc9324:
    /* 0x00bc9324: str      x0, [sp, #0x438] */ ARM64("str x0, [sp, #0x438]");
    /* 0x00bc9328: ldr      x28, [sp, #0x150] */ ARM64("ldr x28, [sp, #0x150]");
loc_00bc932c:
    /* 0x00bc932c: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bc9330: sub      x8, x8, x0 */ ARM64("sub x8, x8, x0");
    /* 0x00bc9334: lsr      x8, x8, #6 */ ARM64("lsr x8, x8, #6");
    /* 0x00bc9338: add      x23, x8, #1 */ ARM64("add x23, x8, #1");
loc_00bc933c:
    /* 0x00bc933c: subs     x23, x23, #1 */ ARM64("subs x23, x23, #1");
    /* 0x00bc9340: b.eq     #0xbc9354 */ if (COND_EQ) goto loc_00bc9354;
    /* 0x00bc9344: add      x22, x0, #0x40 */ ARM64("add x22, x0, #0x40");
    /* 0x00bc9348: bl       #0xbe6008 */ CALL_DIRECT(sub_00be6008);
    /* 0x00bc934c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9350: b        #0xbc933c */ goto loc_00bc933c;
loc_00bc9354:
    /* 0x00bc9354: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bc9358: cbz      x8, #0xbc9364 */ if (x8 == 0) goto loc_00bc9364;
    /* 0x00bc935c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9360: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc9364:
    /* 0x00bc9364: ldr      x22, [x25, #0x18] */ ARM64("ldr x22, [x25, #0x18]");
    /* 0x00bc9368: cbz      x22, #0xbc9394 */ if (x22 == 0) goto loc_00bc9394;
    /* 0x00bc936c: ldr      x8, [x25, #0x10] */ ARM64("ldr x8, [x25, #0x10]");
    /* 0x00bc9370: add      x8, x8, x22, lsl #7 */ ARM64("add x8, x8, x22, lsl #7");
    /* 0x00bc9374: cmp      x8, #0x80 */ ARM64("cmp x8, #0x80");
    /* 0x00bc9378: b.eq     #0xbc9394 */ if (COND_EQ) goto loc_00bc9394;
    /* 0x00bc937c: ldur     x9, [x8, #-0x80] */ ARM64("ldur x9, [x8, #-0x80]");
    /* 0x00bc9380: ldur     x8, [x8, #-0x40] */ ARM64("ldur x8, [x8, #-0x40]");
    /* 0x00bc9384: sub      x8, x8, #2 */ ARM64("sub x8, x8, #2");
    /* 0x00bc9388: cmp      x9, #0xc */ ARM64("cmp x9, #0xc");
    /* 0x00bc938c: ccmp     x8, #3, #2, eq */ ARM64("ccmp x8, #3, #2, eq");
    /* 0x00bc9390: b.lo     #0xbc9628 */ if (COND_LO) goto loc_00bc9628;
loc_00bc9394:
    /* 0x00bc9394: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc9398: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc939c: b.eq     #0xbc9420 */ if (COND_EQ) goto loc_00bc9420;
    /* 0x00bc93a0: ldp      q0, q1, [sp, #0x300] */ ARM64("ldp q0, q1, [sp, #0x300]");
    /* 0x00bc93a4: add      x8, sp, #0x1d0 */ ARM64("add x8, sp, #0x1d0");
    /* 0x00bc93a8: stp      q0, q1, [x8, #0x40] */ ARM64("stp q0, q1, [x8, #0x40]");
    /* 0x00bc93ac: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00bc93b0: stp      q0, q1, [x8, #0x60] */ ARM64("stp q0, q1, [x8, #0x60]");
    /* 0x00bc93b4: mov      w8, #0xc */ ARM64("mov w8, #0xc");
    /* 0x00bc93b8: str      x8, [sp, #0x1d0] */ ARM64("str x8, [sp, #0x1d0]");
    /* 0x00bc93bc: ldur     x8, [x25, #8] */ ARM64("ldur x8, [x25, #8]");
    /* 0x00bc93c0: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00bc93c4: b.ne     #0xbc93d0 */ if (COND_NE) goto loc_00bc93d0;
    /* 0x00bc93c8: add      x0, x25, #8 */ ARM64("add x0, x25, #8");
    /* 0x00bc93cc: bl       #0xc73950 */ CALL_DIRECT(sub_00c73950);
loc_00bc93d0:
    /* 0x00bc93d0: ldr      x8, [x25, #0x10] */ ARM64("ldr x8, [x25, #0x10]");
    /* 0x00bc93d4: add      x8, x8, x22, lsl #7 */ ARM64("add x8, x8, x22, lsl #7");
    /* 0x00bc93d8: ldr      q0, [sp, #0x210] */ ARM64("ldr q0, [sp, #0x210]");
    /* 0x00bc93dc: str      q0, [x8, #0x40] */ ARM64("str q0, [x8, #0x40]");
    /* 0x00bc93e0: ldr      q0, [sp, #0x220] */ ARM64("ldr q0, [sp, #0x220]");
    /* 0x00bc93e4: str      q0, [x8, #0x50] */ ARM64("str q0, [x8, #0x50]");
    /* 0x00bc93e8: ldr      q0, [sp, #0x230] */ ARM64("ldr q0, [sp, #0x230]");
    /* 0x00bc93ec: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
    /* 0x00bc93f0: ldr      q0, [sp, #0x240] */ ARM64("ldr q0, [sp, #0x240]");
    /* 0x00bc93f4: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00bc93f8: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00bc93fc: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00bc9400: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00bc9404: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00bc9408: ldr      q0, [sp, #0x1f0] */ ARM64("ldr q0, [sp, #0x1f0]");
    /* 0x00bc940c: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00bc9410: ldr      q0, [sp, #0x200] */ ARM64("ldr q0, [sp, #0x200]");
    /* 0x00bc9414: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00bc9418: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00bc941c: str      x8, [x25, #0x18] */ ARM64("str x8, [x25, #0x18]");
loc_00bc9420:
    /* 0x00bc9420: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00bc9424: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc9428: stlxr    w9, x8, [x20] */ ARM64("stlxr w9, x8, [x20]");
    /* 0x00bc942c: cbnz     w9, #0xbc9420 */ if (w9 != 0) goto loc_00bc9420;
    /* 0x00bc9430: ldr      x22, [sp, #0x1a8] */ ARM64("ldr x22, [sp, #0x1a8]");
    /* 0x00bc9434: b.ne     #0xbc9444 */ if (COND_NE) goto loc_00bc9444;
    /* 0x00bc9438: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc943c: ldr      x0, [sp, #0x358] */ ARM64("ldr x0, [sp, #0x358]");
    /* 0x00bc9440: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc9444:
    /* 0x00bc9444: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00bc9448: b        #0xbc8f5c */ goto loc_00bc8f5c;
loc_00bc944c:
    /* 0x00bc944c: ldr      x11, [sp, #0x1a0] */ ARM64("ldr x11, [sp, #0x1a0]");
    /* 0x00bc9450: b        #0xbc8b18 */ goto loc_00bc8b18;
loc_00bc9454:
    /* 0x00bc9454: bl       #0xb9a8fc */ CALL_DIRECT(sub_00b9a8fc);
    /* 0x00bc9458: cmp      x28, x23 */ ARM64("cmp x28, x23");
    /* 0x00bc945c: b.lo     #0xbc9490 */ if (COND_LO) goto loc_00bc9490;
    /* 0x00bc9460: b        #0xbc8b0c */ goto loc_00bc8b0c;
loc_00bc9464:
    /* 0x00bc9464: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00bc9468: madd     x0, x26, x8, x24 */ ARM64("madd x0, x26, x8, x24");
    /* 0x00bc946c: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00bc9470: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc9474: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc9478: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
loc_00bc947c:
    /* 0x00bc947c: add      x28, x28, #1 */ ARM64("add x28, x28, #1");
    /* 0x00bc9480: add      x22, x22, #0x108 */ ARM64("add x22, x22, #0x108");
    /* 0x00bc9484: cmp      x25, x23 */ ARM64("cmp x25, x23");
    /* 0x00bc9488: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00bc948c: b.hs     #0xbc8b0c */ if (COND_HS) goto loc_00bc8b0c;
loc_00bc9490:
    /* 0x00bc9490: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00bc9494: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc9498: b.ne     #0xbc9464 */ if (COND_NE) goto loc_00bc9464;
    /* 0x00bc949c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc94a0: bl       #0xb9a8fc */ CALL_DIRECT(sub_00b9a8fc);
    /* 0x00bc94a4: b        #0xbc947c */ goto loc_00bc947c;
loc_00bc94a8:
    /* 0x00bc94a8: mov      x15, x22 */ ARM64("mov x15, x22");
    /* 0x00bc94ac: ldr      x22, [sp, #0x108] */ ARM64("ldr x22, [sp, #0x108]");
    /* 0x00bc94b0: tbnz     w20, #0, #0xbc5c9c */ if (((w20 >> #0) & 1) != 0) goto loc_00bc5c9c;
    /* 0x00bc94b4: ldr      x8, [sp, #0x118] */ ARM64("ldr x8, [sp, #0x118]");
    /* 0x00bc94b8: ldp      x0, x8, [x8, #0x20] */ ARM64("ldp x0, x8, [x8, #0x20]");
    /* 0x00bc94bc: lsl      x19, x8, #5 */ ARM64("lsl x19, x8, #5");
    /* 0x00bc94c0: mov      x20, #-0x8000000000000000 */ ARM64("mov x20, #-0x8000000000000000");
    /* 0x00bc94c4: b        #0xbc9514 */ goto loc_00bc9514;
loc_00bc94c8:
    /* 0x00bc94c8: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00bc94cc: add      x0, x0, #0x7d0 */ ARM64("add x0, x0, #0x7d0");
    /* 0x00bc94d0: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc94d4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc94d8:
    /* 0x00bc94d8: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00bc94dc: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00bc94e0: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc94e4: add      x2, x2, #0x688 */ ARM64("add x2, x2, #0x688");
    /* 0x00bc94e8: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00bc94ec: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00bc94f0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc94f4:
    /* 0x00bc94f4: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc94f8: add      x0, x0, #0x48 */ ARM64("add x0, x0, #0x48");
loc_00bc94fc:
    /* 0x00bc94fc: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00bc9500: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9504: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9508:
    /* 0x00bc9508: bl       #0xc769bc */ CALL_DIRECT(sub_00c769bc);
loc_00bc950c:
    /* 0x00bc950c: sub      x19, x19, #0x20 */ ARM64("sub x19, x19, #0x20");
    /* 0x00bc9510: mov      x0, x21 */ ARM64("mov x0, x21");
loc_00bc9514:
    /* 0x00bc9514: cbz      x19, #0xbc9590 */ if (x19 == 0) goto loc_00bc9590;
    /* 0x00bc9518: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00bc951c: ldr      x8, [x21], #0x20 */ ARM64("ldr x8, [x21], #0x20");
    /* 0x00bc9520: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00bc9524: b.eq     #0xbc950c */ if (COND_EQ) goto loc_00bc950c;
    /* 0x00bc9528: bl       #0xb9b8a8 */ CALL_DIRECT(sub_00b9b8a8);
    /* 0x00bc952c: b        #0xbc950c */ goto loc_00bc950c;
loc_00bc9530:
    /* 0x00bc9530: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00bc9534:
    /* 0x00bc9534: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00bc9538: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00bc953c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9540:
    /* 0x00bc9540: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00bc9544: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00bc9548: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc954c: add      x2, x2, #0x670 */ ARM64("add x2, x2, #0x670");
    /* 0x00bc9550: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00bc9554: ldr      x25, [sp, #0x48] */ ARM64("ldr x25, [sp, #0x48]");
    /* 0x00bc9558: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00bc955c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9560:
    /* 0x00bc9560: adrp     x8, #0xefa000 */ ARM64("adrp x8, #0xefa000");
    /* 0x00bc9564: add      x8, x8, #0x408 */ ARM64("add x8, x8, #0x408");
    /* 0x00bc9568: adrp     x9, #0xbe7000 */ ARM64("adrp x9, #0xbe7000");
    /* 0x00bc956c: add      x9, x9, #0x66c */ ARM64("add x9, x9, #0x66c");
    /* 0x00bc9570: stp      x8, x9, [sp, #0x1d0] */ ARM64("stp x8, x9, [sp, #0x1d0]");
    /* 0x00bc9574: adrp     x0, #0xcba000 */ ARM64("adrp x0, #0xcba000");
    /* 0x00bc9578: add      x0, x0, #0x67f */ ARM64("add x0, x0, #0x67f");
    /* 0x00bc957c: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9580: add      x2, x2, #0x418 */ ARM64("add x2, x2, #0x418");
    /* 0x00bc9584: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc9588: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
    /* 0x00bc958c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9590:
    /* 0x00bc9590: add      x0, sp, #0x1b0 */ ARM64("add x0, sp, #0x1b0");
    /* 0x00bc9594: bl       #0xb9a794 */ CALL_DIRECT(sub_00b9a794);
    /* 0x00bc9598: add      sp, sp, #0x570 */ ARM64("add sp, sp, #0x570");
    /* 0x00bc959c: ldp      x29, x30, [sp, #0x50] */ ARM64("ldp x29, x30, [sp, #0x50]");
    /* 0x00bc95a0: ldp      x20, x19, [sp, #0x40] */ ARM64("ldp x20, x19, [sp, #0x40]");
    /* 0x00bc95a4: ldp      x22, x21, [sp, #0x30] */ ARM64("ldp x22, x21, [sp, #0x30]");
    /* 0x00bc95a8: ldp      x24, x23, [sp, #0x20] */ ARM64("ldp x24, x23, [sp, #0x20]");
    /* 0x00bc95ac: ldp      x26, x25, [sp, #0x10] */ ARM64("ldp x26, x25, [sp, #0x10]");
    /* 0x00bc95b0: ldp      x28, x27, [sp], #0x60 */ ARM64("ldp x28, x27, [sp], #0x60");
    /* 0x00bc95b4: ret       */ return;
loc_00bc95b8:
    /* 0x00bc95b8: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc95bc: add      x0, x0, #0x1b0 */ ARM64("add x0, x0, #0x1b0");
    /* 0x00bc95c0: b        #0xbc95cc */ goto loc_00bc95cc;
loc_00bc95c4:
    /* 0x00bc95c4: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc95c8: add      x0, x0, #0x198 */ ARM64("add x0, x0, #0x198");
loc_00bc95cc:
    /* 0x00bc95cc: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc95d0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc95d4:
    /* 0x00bc95d4: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00bc95d8: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00bc95dc: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00bc95e0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc95e4:
    /* 0x00bc95e4: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc95e8: add      x0, x0, #0x60 */ ARM64("add x0, x0, #0x60");
    /* 0x00bc95ec: b        #0xbc94fc */ goto loc_00bc94fc;
loc_00bc95f0:
    /* 0x00bc95f0: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc95f4: add      x0, x0, #0xd8 */ ARM64("add x0, x0, #0xd8");
    /* 0x00bc95f8: b        #0xbc94fc */ goto loc_00bc94fc;
loc_00bc95fc:
    /* 0x00bc95fc: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc9600: add      x0, x0, #0xc0 */ ARM64("add x0, x0, #0xc0");
    /* 0x00bc9604: b        #0xbc94fc */ goto loc_00bc94fc;
loc_00bc9608:
    /* 0x00bc9608: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00bc960c: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00bc9610: add      x0, x0, #0x993 */ ARM64("add x0, x0, #0x993");
    /* 0x00bc9614: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9618: add      x2, x2, #0x90 */ ARM64("add x2, x2, #0x90");
    /* 0x00bc961c: mov      w1, #0x5b */ ARM64("mov w1, #0x5b");
    /* 0x00bc9620: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00bc9624: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9628:
    /* 0x00bc9628: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00bc962c: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00bc9630: add      x0, x0, #0x9ee */ ARM64("add x0, x0, #0x9ee");
    /* 0x00bc9634: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9638: add      x2, x2, #0xa8 */ ARM64("add x2, x2, #0xa8");
    /* 0x00bc963c: mov      w1, #0xd8 */ ARM64("mov w1, #0xd8");
    /* 0x00bc9640: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00bc9644: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9648:
    /* 0x00bc9648: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc964c: add      x0, x0, #0xf70 */ ARM64("add x0, x0, #0xf70");
    /* 0x00bc9650: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9654: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9658:
    /* 0x00bc9658: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00bc965c: mov      w1, #0x40 */ ARM64("mov w1, #0x40");
    /* 0x00bc9660: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00bc9664: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9668:
    /* 0x00bc9668: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc966c: add      x2, x2, #0 */ ARM64("add x2, x2, #0");
    /* 0x00bc9670: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc9674: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9678: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc967c:
    /* 0x00bc967c: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc9680: add      x0, x0, #0xe80 */ ARM64("add x0, x0, #0xe80");
    /* 0x00bc9684: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9688: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc968c:
    /* 0x00bc968c: adrp     x8, #0xefa000 */ ARM64("adrp x8, #0xefa000");
    /* 0x00bc9690: add      x8, x8, #0x1c8 */ ARM64("add x8, x8, #0x1c8");
    /* 0x00bc9694: str      x8, [sp, #0x98] */ ARM64("str x8, [sp, #0x98]");
loc_00bc9698:
    /* 0x00bc9698: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bc969c: ldr      x2, [sp, #0x98] */ ARM64("ldr x2, [sp, #0x98]");
    /* 0x00bc96a0: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc96a4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc96a8:
    /* 0x00bc96a8: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc96ac: add      x0, x0, #0xac0 */ ARM64("add x0, x0, #0xac0");
    /* 0x00bc96b0: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc96b4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc96b8:
    /* 0x00bc96b8: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc96bc: add      x2, x2, #0xf0 */ ARM64("add x2, x2, #0xf0");
    /* 0x00bc96c0: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00bc96c4: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc96c8: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc96cc:
    /* 0x00bc96cc: mov      x28, #0 */ ARM64("mov x28, #0");
    /* 0x00bc96d0: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00bc96d4: adrp     x8, #0xefa000 */ ARM64("adrp x8, #0xefa000");
    /* 0x00bc96d8: add      x8, x8, #0x138 */ ARM64("add x8, x8, #0x138");
    /* 0x00bc96dc: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
loc_00bc96e0:
    /* 0x00bc96e0: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc96e4: ldr      x2, [sp, #0x90] */ ARM64("ldr x2, [sp, #0x90]");
    /* 0x00bc96e8: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc96ec: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc96f0:
    /* 0x00bc96f0: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc96f4: add      x0, x0, #0x150 */ ARM64("add x0, x0, #0x150");
    /* 0x00bc96f8: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc96fc: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9700:
    /* 0x00bc9700: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
loc_00bc9704:
    /* 0x00bc9704: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc9708: add      x0, x0, #0x180 */ ARM64("add x0, x0, #0x180");
    /* 0x00bc970c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9710: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9714:
    /* 0x00bc9714: ldr      q0, [x8] */ ARM64("ldr q0, [x8]");
    /* 0x00bc9718: ldr      x10, [x8, #0x10] */ ARM64("ldr x10, [x8, #0x10]");
    /* 0x00bc971c: str      x10, [sp, #0x1e0] */ ARM64("str x10, [sp, #0x1e0]");
    /* 0x00bc9720: str      q0, [sp, #0x1d0] */ ARM64("str q0, [sp, #0x1d0]");
    /* 0x00bc9724: ldur     q0, [x8, #0x68] */ ARM64("ldur q0, [x8, #0x68]");
    /* 0x00bc9728: ldur     q1, [x8, #0x78] */ ARM64("ldur q1, [x8, #0x78]");
    /* 0x00bc972c: ldur     q2, [x8, #0x58] */ ARM64("ldur q2, [x8, #0x58]");
    /* 0x00bc9730: add      x10, sp, #0x129 */ ARM64("add x10, sp, #0x129");
    /* 0x00bc9734: stur     q2, [x10, #0xff] */ ARM64("stur q2, [x10, #0xff]");
    /* 0x00bc9738: stur     q1, [x19, #0x78] */ ARM64("stur q1, [x19, #0x78]");
    /* 0x00bc973c: stur     q0, [x19, #0x68] */ ARM64("stur q0, [x19, #0x68]");
    /* 0x00bc9740: ldur     q0, [x8, #0x88] */ ARM64("ldur q0, [x8, #0x88]");
    /* 0x00bc9744: ldur     q1, [x8, #0x98] */ ARM64("ldur q1, [x8, #0x98]");
    /* 0x00bc9748: ldur     q2, [x8, #0xa8] */ ARM64("ldur q2, [x8, #0xa8]");
    /* 0x00bc974c: ldur     q3, [x8, #0xb8] */ ARM64("ldur q3, [x8, #0xb8]");
    /* 0x00bc9750: stur     q3, [x19, #0xb8] */ ARM64("stur q3, [x19, #0xb8]");
    /* 0x00bc9754: stur     q2, [x19, #0xa8] */ ARM64("stur q2, [x19, #0xa8]");
    /* 0x00bc9758: stur     q1, [x19, #0x98] */ ARM64("stur q1, [x19, #0x98]");
    /* 0x00bc975c: stur     q0, [x19, #0x88] */ ARM64("stur q0, [x19, #0x88]");
    /* 0x00bc9760: ldur     q0, [x8, #0xc8] */ ARM64("ldur q0, [x8, #0xc8]");
    /* 0x00bc9764: ldur     q1, [x8, #0xd8] */ ARM64("ldur q1, [x8, #0xd8]");
    /* 0x00bc9768: ldur     q2, [x8, #0xe8] */ ARM64("ldur q2, [x8, #0xe8]");
    /* 0x00bc976c: ldur     q3, [x8, #0xf8] */ ARM64("ldur q3, [x8, #0xf8]");
    /* 0x00bc9770: stur     q3, [x19, #0xf8] */ ARM64("stur q3, [x19, #0xf8]");
    /* 0x00bc9774: stur     q2, [x19, #0xe8] */ ARM64("stur q2, [x19, #0xe8]");
    /* 0x00bc9778: stur     q1, [x19, #0xd8] */ ARM64("stur q1, [x19, #0xd8]");
    /* 0x00bc977c: stur     q0, [x19, #0xc8] */ ARM64("stur q0, [x19, #0xc8]");
    /* 0x00bc9780: str      x9, [sp, #0x1e8] */ ARM64("str x9, [sp, #0x1e8]");
    /* 0x00bc9784: ldp      q0, q1, [x8, #0x20] */ ARM64("ldp q0, q1, [x8, #0x20]");
    /* 0x00bc9788: ldur     q2, [x8, #0x40] */ ARM64("ldur q2, [x8, #0x40]");
    /* 0x00bc978c: ldur     x8, [x8, #0x50] */ ARM64("ldur x8, [x8, #0x50]");
    /* 0x00bc9790: str      x8, [sp, #0x220] */ ARM64("str x8, [sp, #0x220]");
    /* 0x00bc9794: stp      q1, q2, [sp, #0x200] */ ARM64("stp q1, q2, [sp, #0x200]");
    /* 0x00bc9798: str      q0, [sp, #0x1f0] */ ARM64("str q0, [sp, #0x1f0]");
    /* 0x00bc979c: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00bc97a0: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00bc97a4: adrp     x3, #0xef9000 */ ARM64("adrp x3, #0xef9000");
    /* 0x00bc97a8: add      x3, x3, #0xaa0 */ ARM64("add x3, x3, #0xaa0");
    /* 0x00bc97ac: adrp     x4, #0xefa000 */ ARM64("adrp x4, #0xefa000");
    /* 0x00bc97b0: add      x4, x4, #0x108 */ ARM64("add x4, x4, #0x108");
    /* 0x00bc97b4: add      x2, sp, #0x1d0 */ ARM64("add x2, sp, #0x1d0");
    /* 0x00bc97b8: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00bc97bc: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
    /* 0x00bc97c0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc97c4:
    /* 0x00bc97c4: str      x8, [sp, #0x300] */ ARM64("str x8, [sp, #0x300]");
    /* 0x00bc97c8: str      x10, [sp, #0x308] */ ARM64("str x10, [sp, #0x308]");
    /* 0x00bc97cc: str      x0, [sp, #0x310] */ ARM64("str x0, [sp, #0x310]");
    /* 0x00bc97d0: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00bc97d4: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00bc97d8: adrp     x3, #0xef9000 */ ARM64("adrp x3, #0xef9000");
    /* 0x00bc97dc: add      x3, x3, #0xa80 */ ARM64("add x3, x3, #0xa80");
    /* 0x00bc97e0: adrp     x4, #0xefa000 */ ARM64("adrp x4, #0xefa000");
    /* 0x00bc97e4: add      x4, x4, #0x168 */ ARM64("add x4, x4, #0x168");
    /* 0x00bc97e8: add      x2, sp, #0x300 */ ARM64("add x2, sp, #0x300");
    /* 0x00bc97ec: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00bc97f0: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
    /* 0x00bc97f4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc97f8:
    /* 0x00bc97f8: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00bc97fc: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00bc9800: ldr      x1, [sp, #0xd8] */ ARM64("ldr x1, [sp, #0xd8]");
    /* 0x00bc9804: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9808: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc980c:
    /* 0x00bc980c: str      x24, [sp, #0x300] */ ARM64("str x24, [sp, #0x300]");
    /* 0x00bc9810: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00bc9814: add      x0, x0, #0x210 */ ARM64("add x0, x0, #0x210");
    /* 0x00bc9818: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc981c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9820:
    /* 0x00bc9820: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9824: add      x2, x2, #0x18 */ ARM64("add x2, x2, #0x18");
    /* 0x00bc9828: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bc982c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9830: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9834:
    /* 0x00bc9834: ldr      q0, [x8] */ ARM64("ldr q0, [x8]");
    /* 0x00bc9838: ldr      x10, [x8, #0x10] */ ARM64("ldr x10, [x8, #0x10]");
    /* 0x00bc983c: str      x10, [sp, #0x1e0] */ ARM64("str x10, [sp, #0x1e0]");
    /* 0x00bc9840: str      q0, [sp, #0x1d0] */ ARM64("str q0, [sp, #0x1d0]");
    /* 0x00bc9844: ldur     q0, [x8, #0x98] */ ARM64("ldur q0, [x8, #0x98]");
    /* 0x00bc9848: ldur     q1, [x8, #0xa8] */ ARM64("ldur q1, [x8, #0xa8]");
    /* 0x00bc984c: ldur     q2, [x8, #0xb8] */ ARM64("ldur q2, [x8, #0xb8]");
    /* 0x00bc9850: ldur     q3, [x8, #0x88] */ ARM64("ldur q3, [x8, #0x88]");
    /* 0x00bc9854: stur     q3, [x19, #0x88] */ ARM64("stur q3, [x19, #0x88]");
    /* 0x00bc9858: stur     q2, [x19, #0xb8] */ ARM64("stur q2, [x19, #0xb8]");
    /* 0x00bc985c: stur     q1, [x19, #0xa8] */ ARM64("stur q1, [x19, #0xa8]");
    /* 0x00bc9860: stur     q0, [x19, #0x98] */ ARM64("stur q0, [x19, #0x98]");
    /* 0x00bc9864: ldur     q0, [x8, #0xc8] */ ARM64("ldur q0, [x8, #0xc8]");
    /* 0x00bc9868: ldur     q1, [x8, #0xd8] */ ARM64("ldur q1, [x8, #0xd8]");
    /* 0x00bc986c: ldur     q2, [x8, #0xe8] */ ARM64("ldur q2, [x8, #0xe8]");
    /* 0x00bc9870: ldur     q3, [x8, #0xf8] */ ARM64("ldur q3, [x8, #0xf8]");
    /* 0x00bc9874: stur     q3, [x19, #0xf8] */ ARM64("stur q3, [x19, #0xf8]");
    /* 0x00bc9878: stur     q2, [x19, #0xe8] */ ARM64("stur q2, [x19, #0xe8]");
    /* 0x00bc987c: stur     q1, [x19, #0xd8] */ ARM64("stur q1, [x19, #0xd8]");
    /* 0x00bc9880: stur     q0, [x19, #0xc8] */ ARM64("stur q0, [x19, #0xc8]");
    /* 0x00bc9884: str      x9, [sp, #0x1e8] */ ARM64("str x9, [sp, #0x1e8]");
    /* 0x00bc9888: ldp      q0, q1, [x8, #0x20] */ ARM64("ldp q0, q1, [x8, #0x20]");
    /* 0x00bc988c: ldur     q2, [x8, #0x40] */ ARM64("ldur q2, [x8, #0x40]");
    /* 0x00bc9890: stp      q1, q2, [sp, #0x200] */ ARM64("stp q1, q2, [sp, #0x200]");
    /* 0x00bc9894: str      q0, [sp, #0x1f0] */ ARM64("str q0, [sp, #0x1f0]");
    /* 0x00bc9898: ldp      q0, q1, [x8, #0x50] */ ARM64("ldp q0, q1, [x8, #0x50]");
    /* 0x00bc989c: ldur     q2, [x8, #0x70] */ ARM64("ldur q2, [x8, #0x70]");
    /* 0x00bc98a0: ldur     x8, [x8, #0x80] */ ARM64("ldur x8, [x8, #0x80]");
    /* 0x00bc98a4: str      x8, [sp, #0x250] */ ARM64("str x8, [sp, #0x250]");
    /* 0x00bc98a8: stp      q1, q2, [sp, #0x230] */ ARM64("stp q1, q2, [sp, #0x230]");
    /* 0x00bc98ac: str      q0, [sp, #0x220] */ ARM64("str q0, [sp, #0x220]");
    /* 0x00bc98b0: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00bc98b4: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00bc98b8: adrp     x3, #0xef9000 */ ARM64("adrp x3, #0xef9000");
    /* 0x00bc98bc: add      x3, x3, #0xaa0 */ ARM64("add x3, x3, #0xaa0");
    /* 0x00bc98c0: adrp     x4, #0xefa000 */ ARM64("adrp x4, #0xefa000");
    /* 0x00bc98c4: add      x4, x4, #0x30 */ ARM64("add x4, x4, #0x30");
    /* 0x00bc98c8: add      x2, sp, #0x1d0 */ ARM64("add x2, sp, #0x1d0");
    /* 0x00bc98cc: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00bc98d0: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
    /* 0x00bc98d4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc98d8:
    /* 0x00bc98d8: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00bc98dc: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc98e0: add      x2, x2, #0x78 */ ARM64("add x2, x2, #0x78");
    /* 0x00bc98e4: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00bc98e8: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00bc98ec: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc98f0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc98f4:
    /* 0x00bc98f4: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc98f8: add      x8, x8, #0xd90 */ ARM64("add x8, x8, #0xd90");
    /* 0x00bc98fc: b        #0xbc998c */ goto loc_00bc998c;
loc_00bc9900:
    /* 0x00bc9900: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9904: add      x8, x8, #0xe08 */ ARM64("add x8, x8, #0xe08");
    /* 0x00bc9908: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
loc_00bc990c:
    /* 0x00bc990c: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00bc9910: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9914: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9918:
    /* 0x00bc9918: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc991c: add      x0, x0, #0xdf0 */ ARM64("add x0, x0, #0xdf0");
    /* 0x00bc9920: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9924: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9928:
    /* 0x00bc9928: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc992c: b        #0xbc99fc */ goto loc_00bc99fc;
loc_00bc9930:
    /* 0x00bc9930: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc9934: add      x0, x0, #0xad8 */ ARM64("add x0, x0, #0xad8");
    /* 0x00bc9938: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc993c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9940:
    /* 0x00bc9940: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9944: mov      x26, x8 */ ARM64("mov x26, x8");
    /* 0x00bc9948: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc994c: add      x8, x8, #0xd30 */ ARM64("add x8, x8, #0xd30");
    /* 0x00bc9950: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc9954:
    /* 0x00bc9954: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9958: mov      x26, x8 */ ARM64("mov x26, x8");
    /* 0x00bc995c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9960: add      x8, x8, #0xd48 */ ARM64("add x8, x8, #0xd48");
    /* 0x00bc9964: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc9968:
    /* 0x00bc9968: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00bc996c: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00bc9970: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00bc9974: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9978:
    /* 0x00bc9978: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc997c: add      x8, x8, #0xfa0 */ ARM64("add x8, x8, #0xfa0");
    /* 0x00bc9980: b        #0xbc998c */ goto loc_00bc998c;
loc_00bc9984:
    /* 0x00bc9984: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9988: add      x8, x8, #0xee0 */ ARM64("add x8, x8, #0xee0");
loc_00bc998c:
    /* 0x00bc998c: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
loc_00bc9990:
    /* 0x00bc9990: ldr      x0, [sp, #0x80] */ ARM64("ldr x0, [sp, #0x80]");
    /* 0x00bc9994: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9998: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc999c:
    /* 0x00bc999c: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc99a0: add      x0, x0, #0xf88 */ ARM64("add x0, x0, #0xf88");
    /* 0x00bc99a4: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc99a8: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc99ac:
    /* 0x00bc99ac: adrp     x3, #0xefa000 */ ARM64("adrp x3, #0xefa000");
    /* 0x00bc99b0: add      x3, x3, #0x6b8 */ ARM64("add x3, x3, #0x6b8");
    /* 0x00bc99b4: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00bc99b8: mov      x2, x1 */ ARM64("mov x2, x1");
    /* 0x00bc99bc: bl       #0xc73bb0 */ CALL_DIRECT(sub_00c73bb0);
    /* 0x00bc99c0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc99c4:
    /* 0x00bc99c4: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc99c8: mov      x26, x8 */ ARM64("mov x26, x8");
    /* 0x00bc99cc: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc99d0: add      x8, x8, #0xd60 */ ARM64("add x8, x8, #0xd60");
    /* 0x00bc99d4: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc99d8:
    /* 0x00bc99d8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc99dc: mov      x26, x8 */ ARM64("mov x26, x8");
    /* 0x00bc99e0: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc99e4: add      x8, x8, #0xfb8 */ ARM64("add x8, x8, #0xfb8");
    /* 0x00bc99e8: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc99ec:
    /* 0x00bc99ec: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc99f0: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc99f4: add      x8, x8, #0xfd0 */ ARM64("add x8, x8, #0xfd0");
loc_00bc99f8:
    /* 0x00bc99f8: str      x8, [sp, #0x88] */ ARM64("str x8, [sp, #0x88]");
loc_00bc99fc:
    /* 0x00bc99fc: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00bc9a00: ldr      x2, [sp, #0x88] */ ARM64("ldr x2, [sp, #0x88]");
    /* 0x00bc9a04: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9a08: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a0c:
    /* 0x00bc9a0c: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9a10: add      x2, x2, #0x1e0 */ ARM64("add x2, x2, #0x1e0");
    /* 0x00bc9a14: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bc9a18: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9a1c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a20:
    /* 0x00bc9a20: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00bc9a24: add      x2, x2, #0x1f8 */ ARM64("add x2, x2, #0x1f8");
    /* 0x00bc9a28: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bc9a2c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9a30: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a34:
    /* 0x00bc9a34: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc9a38: add      x0, x0, #0xf58 */ ARM64("add x0, x0, #0xf58");
    /* 0x00bc9a3c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9a40: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a44:
    /* 0x00bc9a44: mov      x21, x20 */ ARM64("mov x21, x20");
    /* 0x00bc9a48: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00bc9a4c: ldr      x20, [sp, #0x40] */ ARM64("ldr x20, [sp, #0x40]");
    /* 0x00bc9a50: b        #0xbc9534 */ goto loc_00bc9534;
loc_00bc9a54:
    /* 0x00bc9a54: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00bc9a58: b        #0xbc9ac4 */ goto loc_00bc9ac4;
loc_00bc9a5c:
    /* 0x00bc9a5c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9a60: mov      x26, x10 */ ARM64("mov x26, x10");
    /* 0x00bc9a64: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9a68: add      x8, x8, #0xeb0 */ ARM64("add x8, x8, #0xeb0");
    /* 0x00bc9a6c: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc9a70:
    /* 0x00bc9a70: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc9a74: add      x0, x0, #0xcb8 */ ARM64("add x0, x0, #0xcb8");
    /* 0x00bc9a78: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9a7c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a80:
    /* 0x00bc9a80: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00bc9a84: add      x0, x0, #0x96d */ ARM64("add x0, x0, #0x96d");
    /* 0x00bc9a88: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9a8c: add      x2, x2, #0xe20 */ ARM64("add x2, x2, #0xe20");
    /* 0x00bc9a90: mov      w1, #0x26 */ ARM64("mov w1, #0x26");
    /* 0x00bc9a94: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00bc9a98: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9a9c:
    /* 0x00bc9a9c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9aa0: add      x8, x8, #0xb20 */ ARM64("add x8, x8, #0xb20");
loc_00bc9aa4:
    /* 0x00bc9aa4: str      x8, [sp, #0x68] */ ARM64("str x8, [sp, #0x68]");
loc_00bc9aa8:
    /* 0x00bc9aa8: ldr      x0, [sp, #0x68] */ ARM64("ldr x0, [sp, #0x68]");
    /* 0x00bc9aac: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9ab0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9ab4:
    /* 0x00bc9ab4: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9ab8: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9abc: add      x8, x8, #0xb38 */ ARM64("add x8, x8, #0xb38");
loc_00bc9ac0:
    /* 0x00bc9ac0: str      x8, [sp, #0x70] */ ARM64("str x8, [sp, #0x70]");
loc_00bc9ac4:
    /* 0x00bc9ac4: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00bc9ac8: ldr      x2, [sp, #0x70] */ ARM64("ldr x2, [sp, #0x70]");
    /* 0x00bc9acc: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9ad0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9ad4:
    /* 0x00bc9ad4: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00bc9ad8: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00bc9adc: ldr      x1, [sp, #0xd8] */ ARM64("ldr x1, [sp, #0xd8]");
    /* 0x00bc9ae0: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9ae4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9ae8:
    /* 0x00bc9ae8: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9aec: add      x8, x8, #0xd78 */ ARM64("add x8, x8, #0xd78");
    /* 0x00bc9af0: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc9af4:
    /* 0x00bc9af4: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9af8: add      x2, x2, #0xa68 */ ARM64("add x2, x2, #0xa68");
    /* 0x00bc9afc: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9b00: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00bc9b04: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9b08: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b0c:
    /* 0x00bc9b0c: mov      x28, x23 */ ARM64("mov x28, x23");
    /* 0x00bc9b10: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9b14: add      x8, x8, #0xdd8 */ ARM64("add x8, x8, #0xdd8");
    /* 0x00bc9b18: b        #0xbc9b9c */ goto loc_00bc9b9c;
loc_00bc9b1c:
    /* 0x00bc9b1c: mov      x26, x10 */ ARM64("mov x26, x10");
    /* 0x00bc9b20: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9b24: add      x8, x8, #0xec8 */ ARM64("add x8, x8, #0xec8");
    /* 0x00bc9b28: b        #0xbc99f8 */ goto loc_00bc99f8;
loc_00bc9b2c:
    /* 0x00bc9b2c: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9b30: add      x2, x2, #0xef8 */ ARM64("add x2, x2, #0xef8");
    /* 0x00bc9b34: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9b38: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b3c:
    /* 0x00bc9b3c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00bc9b40: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00bc9b44: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00bc9b48: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b4c:
    /* 0x00bc9b4c: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9b50: add      x2, x2, #0xf10 */ ARM64("add x2, x2, #0xf10");
    /* 0x00bc9b54: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9b58: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b5c:
    /* 0x00bc9b5c: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9b60: add      x2, x2, #0xf28 */ ARM64("add x2, x2, #0xf28");
    /* 0x00bc9b64: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc9b68: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9b6c: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b70:
    /* 0x00bc9b70: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9b74: add      x2, x2, #0xf40 */ ARM64("add x2, x2, #0xf40");
    /* 0x00bc9b78: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00bc9b7c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9b80: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9b84:
    /* 0x00bc9b84: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9b88: add      x8, x8, #0xe38 */ ARM64("add x8, x8, #0xe38");
    /* 0x00bc9b8c: b        #0xbc9b9c */ goto loc_00bc9b9c;
loc_00bc9b90:
    /* 0x00bc9b90: ldr      x28, [sp, #0x48] */ ARM64("ldr x28, [sp, #0x48]");
    /* 0x00bc9b94: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9b98: add      x8, x8, #0xe50 */ ARM64("add x8, x8, #0xe50");
loc_00bc9b9c:
    /* 0x00bc9b9c: str      x8, [sp, #0x50] */ ARM64("str x8, [sp, #0x50]");
loc_00bc9ba0:
    /* 0x00bc9ba0: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9ba4: ldr      x2, [sp, #0x50] */ ARM64("ldr x2, [sp, #0x50]");
    /* 0x00bc9ba8: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9bac: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9bb0:
    /* 0x00bc9bb0: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9bb4: add      x2, x2, #0xe68 */ ARM64("add x2, x2, #0xe68");
    /* 0x00bc9bb8: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc9bbc: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9bc0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9bc4:
    /* 0x00bc9bc4: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9bc8: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9bcc: add      x8, x8, #0xb50 */ ARM64("add x8, x8, #0xb50");
    /* 0x00bc9bd0: b        #0xbc9ac0 */ goto loc_00bc9ac0;
loc_00bc9bd4:
    /* 0x00bc9bd4: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9bd8: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9bdc: add      x8, x8, #0xb68 */ ARM64("add x8, x8, #0xb68");
    /* 0x00bc9be0: b        #0xbc9ac0 */ goto loc_00bc9ac0;
loc_00bc9be4:
    /* 0x00bc9be4: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00bc9be8: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00bc9bec: ldr      x1, [sp, #0xd8] */ ARM64("ldr x1, [sp, #0xd8]");
    /* 0x00bc9bf0: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9bf4: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9bf8:
    /* 0x00bc9bf8: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9bfc: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c00: add      x8, x8, #0xb80 */ ARM64("add x8, x8, #0xb80");
    /* 0x00bc9c04: b        #0xbc9ac0 */ goto loc_00bc9ac0;
loc_00bc9c08:
    /* 0x00bc9c08: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c0c: add      x8, x8, #0xcd0 */ ARM64("add x8, x8, #0xcd0");
    /* 0x00bc9c10: b        #0xbc9aa4 */ goto loc_00bc9aa4;
loc_00bc9c14:
    /* 0x00bc9c14: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c18: add      x8, x8, #0xb98 */ ARM64("add x8, x8, #0xb98");
    /* 0x00bc9c1c: b        #0xbc9aa4 */ goto loc_00bc9aa4;
loc_00bc9c20:
    /* 0x00bc9c20: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c24: add      x8, x8, #0xbe0 */ ARM64("add x8, x8, #0xbe0");
    /* 0x00bc9c28: b        #0xbc9ca4 */ goto loc_00bc9ca4;
loc_00bc9c2c:
    /* 0x00bc9c2c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c30: add      x8, x8, #0xbf8 */ ARM64("add x8, x8, #0xbf8");
    /* 0x00bc9c34: b        #0xbc9ca4 */ goto loc_00bc9ca4;
loc_00bc9c38:
    /* 0x00bc9c38: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9c3c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c40: add      x8, x8, #0xc10 */ ARM64("add x8, x8, #0xc10");
    /* 0x00bc9c44: b        #0xbc9cc0 */ goto loc_00bc9cc0;
loc_00bc9c48:
    /* 0x00bc9c48: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c4c: add      x8, x8, #0xc40 */ ARM64("add x8, x8, #0xc40");
    /* 0x00bc9c50: b        #0xbc9ca4 */ goto loc_00bc9ca4;
loc_00bc9c54:
    /* 0x00bc9c54: adrp     x0, #0xef9000 */ ARM64("adrp x0, #0xef9000");
    /* 0x00bc9c58: add      x0, x0, #0xc28 */ ARM64("add x0, x0, #0xc28");
    /* 0x00bc9c5c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9c60: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9c64:
    /* 0x00bc9c64: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c68: add      x8, x8, #0xce8 */ ARM64("add x8, x8, #0xce8");
    /* 0x00bc9c6c: b        #0xbc9aa4 */ goto loc_00bc9aa4;
loc_00bc9c70:
    /* 0x00bc9c70: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9c74: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9c78: add      x8, x8, #0xd00 */ ARM64("add x8, x8, #0xd00");
    /* 0x00bc9c7c: b        #0xbc9ac0 */ goto loc_00bc9ac0;
loc_00bc9c80:
    /* 0x00bc9c80: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00bc9c84: add      x0, x0, #0x96d */ ARM64("add x0, x0, #0x96d");
    /* 0x00bc9c88: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9c8c: add      x2, x2, #0xc58 */ ARM64("add x2, x2, #0xc58");
    /* 0x00bc9c90: mov      w1, #0x26 */ ARM64("mov w1, #0x26");
    /* 0x00bc9c94: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00bc9c98: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9c9c:
    /* 0x00bc9c9c: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9ca0: add      x8, x8, #0xc70 */ ARM64("add x8, x8, #0xc70");
loc_00bc9ca4:
    /* 0x00bc9ca4: str      x8, [sp, #0x58] */ ARM64("str x8, [sp, #0x58]");
loc_00bc9ca8:
    /* 0x00bc9ca8: ldr      x0, [sp, #0x58] */ ARM64("ldr x0, [sp, #0x58]");
    /* 0x00bc9cac: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00bc9cb0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9cb4:
    /* 0x00bc9cb4: mov      x26, x28 */ ARM64("mov x26, x28");
    /* 0x00bc9cb8: adrp     x8, #0xef9000 */ ARM64("adrp x8, #0xef9000");
    /* 0x00bc9cbc: add      x8, x8, #0xc88 */ ARM64("add x8, x8, #0xc88");
loc_00bc9cc0:
    /* 0x00bc9cc0: str      x8, [sp, #0x60] */ ARM64("str x8, [sp, #0x60]");
loc_00bc9cc4:
    /* 0x00bc9cc4: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00bc9cc8: ldr      x2, [sp, #0x60] */ ARM64("ldr x2, [sp, #0x60]");
    /* 0x00bc9ccc: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00bc9cd0: b        #0xbc9ce4 */ goto loc_00bc9ce4;
loc_00bc9cd4:
    /* 0x00bc9cd4: adrp     x2, #0xef9000 */ ARM64("adrp x2, #0xef9000");
    /* 0x00bc9cd8: add      x2, x2, #0xca0 */ ARM64("add x2, x2, #0xca0");
    /* 0x00bc9cdc: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bc9ce0: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
loc_00bc9ce4:
    /* 0x00bc9ce4: brk      #1 */ ARM64("brk #1");
    /* 0x00bc9ce8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9cec: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9cf0: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc9cf4: b        #0xbc9e90 */ goto loc_00bc9e90;
    /* 0x00bc9cf8: b        #0xbc9ee4 */ goto loc_00bc9ee4;
    /* 0x00bc9cfc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d00: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bc9d04: cbnz     x8, #0xbc9e70 */ if (x8 != 0) goto loc_00bc9e70;
    /* 0x00bc9d08: b        #0xbc9ee8 */ goto loc_00bc9ee8;
    /* 0x00bc9d0c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d10: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9d14: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc9d18: b        #0xbca1f4 */ goto loc_00bca1f4;
    /* 0x00bc9d1c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d20: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9d24: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc9d28: b        #0xbca300 */ goto loc_00bca300;
    /* 0x00bc9d2c: b        #0xbc9e14 */ goto loc_00bc9e14;
    /* 0x00bc9d30: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d34: sub      x0, x29, #0xd8 */ ARM64("sub x0, x29, #0xd8");
    /* 0x00bc9d38: bl       #0xbd1a60 */ CALL_DIRECT(sub_00bd1a60);
    /* 0x00bc9d3c: b        #0xbca104 */ goto loc_00bca104;
    /* 0x00bc9d40: b        #0xbc9ee4 */ goto loc_00bc9ee4;
    /* 0x00bc9d44: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d48: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc9d4c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc9d50: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc9d54: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc9d58: b        #0xbc9e90 */ goto loc_00bc9e90;
    /* 0x00bc9d5c: b        #0xbc9e60 */ goto loc_00bc9e60;
    /* 0x00bc9d60: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d64: ldr      x8, [sp, #8] */ ARM64("ldr x8, [sp, #8]");
    /* 0x00bc9d68: cbz      x8, #0xbc9ee8 */ if (x8 == 0) goto loc_00bc9ee8;
    /* 0x00bc9d6c: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00bc9d70: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc9d74: b        #0xbc9ee8 */ goto loc_00bc9ee8;
    /* 0x00bc9d78: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d7c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9d80: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc9d84: b        #0xbc9ee8 */ goto loc_00bc9ee8;
    /* 0x00bc9d88: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9d8c: b        #0xbc9e60 */ goto loc_00bc9e60;
    /* 0x00bc9d90: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9d94: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bc9d98: bl       #0xbd1a60 */ CALL_DIRECT(sub_00bd1a60);
    /* 0x00bc9d9c: b        #0xbca0fc */ goto loc_00bca0fc;
    /* 0x00bc9da0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9da4: b        #0xbca0b4 */ goto loc_00bca0b4;
    /* 0x00bc9da8: b        #0xbca1b4 */ goto loc_00bca1b4;
    /* 0x00bc9dac: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9db0: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc9db4: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc9db8: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc9dbc: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc9dc0: b        #0xbca1f4 */ goto loc_00bca1f4;
    /* 0x00bc9dc4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9dc8: ldr      q0, [sp, #0x300] */ ARM64("ldr q0, [sp, #0x300]");
    /* 0x00bc9dcc: str      q0, [x23] */ ARM64("str q0, [x23]");
    /* 0x00bc9dd0: ldr      q0, [sp, #0x310] */ ARM64("ldr q0, [sp, #0x310]");
    /* 0x00bc9dd4: str      q0, [x23, #0x10] */ ARM64("str q0, [x23, #0x10]");
    /* 0x00bc9dd8: ldr      q0, [sp, #0x320] */ ARM64("ldr q0, [sp, #0x320]");
    /* 0x00bc9ddc: str      q0, [x23, #0x20] */ ARM64("str q0, [x23, #0x20]");
    /* 0x00bc9de0: ldr      q0, [sp, #0x330] */ ARM64("ldr q0, [sp, #0x330]");
    /* 0x00bc9de4: str      q0, [x23, #0x30] */ ARM64("str q0, [x23, #0x30]");
    /* 0x00bc9de8: b        #0xbc9df0 */ goto loc_00bc9df0;
    /* 0x00bc9dec: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bc9df0:
    /* 0x00bc9df0: cbnz     x24, #0xbca1ec */ if (x24 != 0) goto loc_00bca1ec;
    /* 0x00bc9df4: b        #0xbca1f4 */ goto loc_00bca1f4;
    /* 0x00bc9df8: b        #0xbca1b4 */ goto loc_00bca1b4;
    /* 0x00bc9dfc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e00: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc9e04: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9e08: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc9e0c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc9e10: b        #0xbca300 */ goto loc_00bca300;
loc_00bc9e14:
    /* 0x00bc9e14: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e18: b        #0xbca300 */ goto loc_00bca300;
    /* 0x00bc9e1c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e20: add      x0, sp, #0x4a8 */ ARM64("add x0, sp, #0x4a8");
    /* 0x00bc9e24: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc9e28: b        #0xbca300 */ goto loc_00bca300;
    /* 0x00bc9e2c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9e30: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e34: b        #0xbca0fc */ goto loc_00bca0fc;
    /* 0x00bc9e38: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e3c: str      x24, [sp, #0x300] */ ARM64("str x24, [sp, #0x300]");
    /* 0x00bc9e40: b        #0xbca0f0 */ goto loc_00bca0f0;
    /* 0x00bc9e44: b        #0xbca130 */ goto loc_00bca130;
    /* 0x00bc9e48: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e4c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9e50: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc9e54: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bc9e58: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9e5c: b        #0xbca0b4 */ goto loc_00bca0b4;
loc_00bc9e60:
    /* 0x00bc9e60: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e64: b        #0xbc9e90 */ goto loc_00bc9e90;
    /* 0x00bc9e68: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e6c: cbz      x22, #0xbc9ee8 */ if (x22 == 0) goto loc_00bc9ee8;
loc_00bc9e70:
    /* 0x00bc9e70: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc9e74: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc9e78: b        #0xbc9ee8 */ goto loc_00bc9ee8;
    /* 0x00bc9e7c: b        #0xbc9ee4 */ goto loc_00bc9ee4;
    /* 0x00bc9e80: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9e84: cbz      x22, #0xbc9e90 */ if (x22 == 0) goto loc_00bc9e90;
    /* 0x00bc9e88: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bc9e8c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc9e90:
    /* 0x00bc9e90: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bc9e94: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bc9e98: b.eq     #0xbc9ee8 */ if (COND_EQ) goto loc_00bc9ee8;
    /* 0x00bc9e9c: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc9ea0: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bc9ea4: b        #0xbc9ee8 */ goto loc_00bc9ee8;
    /* 0x00bc9ea8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9eac: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bc9eb0: bl       #0xbcbed4 */ CALL_DIRECT(sub_00bcbed4);
    /* 0x00bc9eb4: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bc9eb8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9ebc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9ec0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9ec4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc9ec8: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bc9ecc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9ed0: ldr      x25, [sp, #0x48] */ ARM64("ldr x25, [sp, #0x48]");
    /* 0x00bc9ed4: b        #0xbca3e4 */ goto loc_00bca3e4;
    /* 0x00bc9ed8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9edc: add      x25, x26, #1 */ ARM64("add x25, x26, #1");
    /* 0x00bc9ee0: b        #0xbca064 */ goto loc_00bca064;
loc_00bc9ee4:
    /* 0x00bc9ee4: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bc9ee8:
    /* 0x00bc9ee8: ldr      x9, [sp, #0x438] */ ARM64("ldr x9, [sp, #0x438]");
    /* 0x00bc9eec: cbz      x9, #0xbc9f10 */ if (x9 == 0) goto loc_00bc9f10;
    /* 0x00bc9ef0: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bc9ef4: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bc9ef8: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00bc9efc: b.eq     #0xbc9f10 */ if (COND_EQ) goto loc_00bc9f10;
    /* 0x00bc9f00: ldr      x9, [sp, #0x430] */ ARM64("ldr x9, [sp, #0x430]");
    /* 0x00bc9f04: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bc9f08: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00bc9f0c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bc9f10:
    /* 0x00bc9f10: add      x22, x20, #1 */ ARM64("add x22, x20, #1");
    /* 0x00bc9f14: mov      x0, x21 */ ARM64("mov x0, x21");
loc_00bc9f18:
    /* 0x00bc9f18: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00bc9f1c: b.eq     #0xbca470 */ if (COND_EQ) goto loc_00bca470;
    /* 0x00bc9f20: add      x20, x0, #0x18 */ ARM64("add x20, x0, #0x18");
    /* 0x00bc9f24: bl       #0xb9de3c */ CALL_DIRECT(sub_00b9de3c);
    /* 0x00bc9f28: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc9f2c: b        #0xbc9f18 */ goto loc_00bc9f18;
loc_00bc9f30:
    /* 0x00bc9f30: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00bc9f34: b.eq     #0xbc9f4c */ if (COND_EQ) goto loc_00bc9f4c;
    /* 0x00bc9f38: add      x19, x20, #0x18 */ ARM64("add x19, x20, #0x18");
    /* 0x00bc9f3c: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc9f40: bl       #0xb9de3c */ CALL_DIRECT(sub_00b9de3c);
    /* 0x00bc9f44: mov      x20, x19 */ ARM64("mov x20, x19");
    /* 0x00bc9f48: b        #0xbc9f30 */ goto loc_00bc9f30;
loc_00bc9f4c:
    /* 0x00bc9f4c: ldr      x8, [sp, #0x38] */ ARM64("ldr x8, [sp, #0x38]");
    /* 0x00bc9f50: cbz      x8, #0xbca634 */ if (x8 == 0) goto loc_00bca634;
    /* 0x00bc9f54: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00bc9f58: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bc9f5c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9f60: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bc9f64: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bc9f68:
    /* 0x00bc9f68: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc9f6c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc9f70: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bc9f74: cbnz     w9, #0xbc9f68 */ if (w9 != 0) goto loc_00bc9f68;
    /* 0x00bc9f78: b.ne     #0xbc9f88 */ if (COND_NE) goto loc_00bc9f88;
    /* 0x00bc9f7c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc9f80: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9f84: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bc9f88:
    /* 0x00bc9f88: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9f8c: bl       #0xb8bec4 */ CALL_DIRECT(sub_00b8bec4);
    /* 0x00bc9f90: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bc9f94: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9f98: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9f9c: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc9fa0: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bc9fa4: b        #0xbc9fe8 */ goto loc_00bc9fe8;
    /* 0x00bc9fa8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9fac: b        #0xbca3f8 */ goto loc_00bca3f8;
    /* 0x00bc9fb0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bc9fb4:
    /* 0x00bc9fb4: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bc9fb8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bc9fbc: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bc9fc0: cbnz     w9, #0xbc9fb4 */ if (w9 != 0) goto loc_00bc9fb4;
    /* 0x00bc9fc4: b.ne     #0xbca640 */ if (COND_NE) goto loc_00bca640;
    /* 0x00bc9fc8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bc9fcc: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bc9fd0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bc9fd4: b        #0xbca640 */ goto loc_00bca640;
    /* 0x00bc9fd8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9fdc: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bc9fe0: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bc9fe4: b        #0xbca648 */ goto loc_00bca648;
loc_00bc9fe8:
    /* 0x00bc9fe8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bc9fec: add      x1, sp, #0x1d0 */ ARM64("add x1, sp, #0x1d0");
    /* 0x00bc9ff0: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bc9ff4: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00bc9ff8: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00bc9ffc: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca000: b        #0xbca004 */ goto loc_00bca004;
loc_00bca004:
    /* 0x00bca004: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca008: b        #0xbca104 */ goto loc_00bca104;
    /* 0x00bca00c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca010: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca014: bl       #0xbcb944 */ CALL_DIRECT(sub_00bcb944);
    /* 0x00bca018: mov      w22, #0 */ ARM64("mov w22, #0");
    /* 0x00bca01c: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00bca020: b        #0xbca4ec */ goto loc_00bca4ec;
    /* 0x00bca024: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca028: b        #0xbca11c */ goto loc_00bca11c;
    /* 0x00bca02c: b        #0xbca3d8 */ goto loc_00bca3d8;
    /* 0x00bca030: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca034: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bca038: cbz      x8, #0xbca308 */ if (x8 == 0) goto loc_00bca308;
    /* 0x00bca03c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca040: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca044: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bca048: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca04c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca050: bl       #0xb9de3c */ CALL_DIRECT(sub_00b9de3c);
    /* 0x00bca054: b        #0xbca320 */ goto loc_00bca320;
    /* 0x00bca058: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca05c: b        #0xbca4d4 */ goto loc_00bca4d4;
    /* 0x00bca060: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca064:
    /* 0x00bca064: sub      x20, x23, x25 */ ARM64("sub x20, x23, x25");
    /* 0x00bca068: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00bca06c: madd     x1, x25, x8, x24 */ ARM64("madd x1, x25, x8, x24");
    /* 0x00bca070: madd     x0, x26, x8, x24 */ ARM64("madd x0, x26, x8, x24");
    /* 0x00bca074: add      x8, x20, x20, lsl #5 */ ARM64("add x8, x20, x20, lsl #5");
    /* 0x00bca078: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00bca07c: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00bca080: add      x8, x26, x20 */ ARM64("add x8, x26, x20");
    /* 0x00bca084: str      x8, [x27, #0x10] */ ARM64("str x8, [x27, #0x10]");
    /* 0x00bca088: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca08c: b        #0xbca1b4 */ goto loc_00bca1b4;
    /* 0x00bca090: b        #0xbca1b4 */ goto loc_00bca1b4;
    /* 0x00bca094: b        #0xbca3d8 */ goto loc_00bca3d8;
    /* 0x00bca098: b        #0xbca564 */ goto loc_00bca564;
    /* 0x00bca09c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca0a0: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca0a4: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bca0a8: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca0ac: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca0b0: b        #0xbca3d8 */ goto loc_00bca3d8;
loc_00bca0b4:
    /* 0x00bca0b4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca0b8: b        #0xbca1f4 */ goto loc_00bca1f4;
    /* 0x00bca0bc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca0c0: ldr      x8, [sp, #0x1d0] */ ARM64("ldr x8, [sp, #0x1d0]");
    /* 0x00bca0c4: cbz      x8, #0xbca320 */ if (x8 == 0) goto loc_00bca320;
    /* 0x00bca0c8: ldr      x0, [sp, #0x1d8] */ ARM64("ldr x0, [sp, #0x1d8]");
    /* 0x00bca0cc: b        #0xbca334 */ goto loc_00bca334;
    /* 0x00bca0d0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca0d4: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca0d8: bl       #0xbcb944 */ CALL_DIRECT(sub_00bcb944);
    /* 0x00bca0dc: b        #0xbca1a8 */ goto loc_00bca1a8;
    /* 0x00bca0e0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca0e4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca0e8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca0ec: bl       #0xbcc998 */ CALL_DIRECT(sub_00bcc998);
loc_00bca0f0:
    /* 0x00bca0f0: stur     x22, [x29, #-0x68] */ ARM64("stur x22, [x29, #-0x68]");
    /* 0x00bca0f4: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bca0f8: bl       #0xbd1a60 */ CALL_DIRECT(sub_00bd1a60);
loc_00bca0fc:
    /* 0x00bca0fc: sub      x0, x29, #0x78 */ ARM64("sub x0, x29, #0x78");
    /* 0x00bca100: bl       #0xb661ac */ CALL_DIRECT(sub_00b661ac);
loc_00bca104:
    /* 0x00bca104: add      x0, sp, #0x4a8 */ ARM64("add x0, sp, #0x4a8");
    /* 0x00bca108: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bca10c: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bca110: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca114: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca118: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00bca11c:
    /* 0x00bca11c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca120: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bca124: b        #0xbca580 */ goto loc_00bca580;
    /* 0x00bca128: b        #0xbca17c */ goto loc_00bca17c;
    /* 0x00bca12c: b        #0xbca3d8 */ goto loc_00bca3d8;
loc_00bca130:
    /* 0x00bca130: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca134: cbz      x22, #0xbca308 */ if (x22 == 0) goto loc_00bca308;
    /* 0x00bca138: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bca13c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca140: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bca144: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca148: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bca14c: bl       #0xbcb868 */ CALL_DIRECT(sub_00bcb868);
    /* 0x00bca150: b        #0xbca170 */ goto loc_00bca170;
    /* 0x00bca154: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca158: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca15c: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca160: bl       #0xbcb180 */ CALL_DIRECT(sub_00bcb180);
    /* 0x00bca164: b        #0xbca38c */ goto loc_00bca38c;
    /* 0x00bca168: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca16c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca170:
    /* 0x00bca170: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00bca174: b        #0xbca2cc */ goto loc_00bca2cc;
    /* 0x00bca178: b        #0xbca17c */ goto loc_00bca17c;
loc_00bca17c:
    /* 0x00bca17c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca180: b        #0xbca38c */ goto loc_00bca38c;
    /* 0x00bca184: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca188: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca18c: b        #0xbca2c4 */ goto loc_00bca2c4;
    /* 0x00bca190: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca194: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bca198: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bca19c: b.eq     #0xbca1a8 */ if (COND_EQ) goto loc_00bca1a8;
    /* 0x00bca1a0: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bca1a4: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
loc_00bca1a8:
    /* 0x00bca1a8: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bca1ac: bl       #0xbe660c */ CALL_DIRECT(sub_00be660c);
    /* 0x00bca1b0: b        #0xbca2b8 */ goto loc_00bca2b8;
loc_00bca1b4:
    /* 0x00bca1b4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca1b8: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bca1bc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca1c0: ldr      x8, [sp, #0x190] */ ARM64("ldr x8, [sp, #0x190]");
    /* 0x00bca1c4: str      x8, [sp, #0x438] */ ARM64("str x8, [sp, #0x438]");
    /* 0x00bca1c8: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca1cc: bl       #0xbcb944 */ CALL_DIRECT(sub_00bcb944);
    /* 0x00bca1d0: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bca1d4: bl       #0xbe660c */ CALL_DIRECT(sub_00be660c);
    /* 0x00bca1d8: b        #0xbca234 */ goto loc_00bca234;
    /* 0x00bca1dc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca1e0: b        #0xbca3d8 */ goto loc_00bca3d8;
    /* 0x00bca1e4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca1e8: cbz      x23, #0xbca1f4 */ if (x23 == 0) goto loc_00bca1f4;
loc_00bca1ec:
    /* 0x00bca1ec: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca1f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca1f4:
    /* 0x00bca1f4: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00bca1f8: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bca1fc: b.eq     #0xbca308 */ if (COND_EQ) goto loc_00bca308;
    /* 0x00bca200: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00bca204: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bca208: b        #0xbca308 */ goto loc_00bca308;
    /* 0x00bca20c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca210:
    /* 0x00bca210: subs     x23, x23, #1 */ ARM64("subs x23, x23, #1");
    /* 0x00bca214: b.eq     #0xbca22c */ if (COND_EQ) goto loc_00bca22c;
    /* 0x00bca218: add      x21, x22, #0x40 */ ARM64("add x21, x22, #0x40");
    /* 0x00bca21c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca220: bl       #0xbe6008 */ CALL_DIRECT(sub_00be6008);
    /* 0x00bca224: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00bca228: b        #0xbca210 */ goto loc_00bca210;
loc_00bca22c:
    /* 0x00bca22c: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00bca230: cbnz     x8, #0xbca23c */ if (x8 != 0) goto loc_00bca23c;
loc_00bca234:
    /* 0x00bca234: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00bca238: b        #0xbca4e8 */ goto loc_00bca4e8;
loc_00bca23c:
    /* 0x00bca23c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00bca240: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca244: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00bca248: b        #0xbca4e8 */ goto loc_00bca4e8;
    /* 0x00bca24c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca250: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca254:
    /* 0x00bca254: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00bca258: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bca25c: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00bca260: cbnz     w9, #0xbca254 */ if (w9 != 0) goto loc_00bca254;
    /* 0x00bca264: b.ne     #0xbca648 */ if (COND_NE) goto loc_00bca648;
    /* 0x00bca268: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca26c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca270: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca274: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca278: b        #0xbca3d8 */ goto loc_00bca3d8;
    /* 0x00bca27c: b        #0xbca3d8 */ goto loc_00bca3d8;
    /* 0x00bca280: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca284:
    /* 0x00bca284: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00bca288: b.eq     #0xbca2a0 */ if (COND_EQ) goto loc_00bca2a0;
    /* 0x00bca28c: add      x21, x22, #0x40 */ ARM64("add x21, x22, #0x40");
    /* 0x00bca290: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca294: bl       #0xbe6008 */ CALL_DIRECT(sub_00be6008);
    /* 0x00bca298: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00bca29c: b        #0xbca284 */ goto loc_00bca284;
loc_00bca2a0:
    /* 0x00bca2a0: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bca2a4: cbnz     x8, #0xbca2b0 */ if (x8 != 0) goto loc_00bca2b0;
    /* 0x00bca2a8: str      xzr, [sp, #0x198] */ ARM64("str xzr, [sp, #0x198]");
    /* 0x00bca2ac: b        #0xbca2b8 */ goto loc_00bca2b8;
loc_00bca2b0:
    /* 0x00bca2b0: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
    /* 0x00bca2b4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca2b8:
    /* 0x00bca2b8: ldr      x0, [sp, #0x150] */ ARM64("ldr x0, [sp, #0x150]");
    /* 0x00bca2bc: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bca2c0: ldr      x0, [sp, #0x150] */ ARM64("ldr x0, [sp, #0x150]");
loc_00bca2c4:
    /* 0x00bca2c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca2c8: mov      w20, #0 */ ARM64("mov w20, #0");
loc_00bca2cc:
    /* 0x00bca2cc: sub      x0, x29, #0xd8 */ ARM64("sub x0, x29, #0xd8");
    /* 0x00bca2d0: bl       #0xbe5df4 */ CALL_DIRECT(sub_00be5df4);
    /* 0x00bca2d4: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
    /* 0x00bca2d8: tbz      w20, #0, #0xbca38c */ if (((w20 >> #0) & 1) == 0) goto loc_00bca38c;
    /* 0x00bca2dc: b        #0xbca374 */ goto loc_00bca374;
    /* 0x00bca2e0: ldr      x0, [sp, #0x150] */ ARM64("ldr x0, [sp, #0x150]");
    /* 0x00bca2e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca2e8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca2ec: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca2f0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca2f4: cbz      x20, #0xbca300 */ if (x20 == 0) goto loc_00bca300;
    /* 0x00bca2f8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca2fc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca300:
    /* 0x00bca300: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bca304: bl       #0xb661ac */ CALL_DIRECT(sub_00b661ac);
loc_00bca308:
    /* 0x00bca308: ldr      x9, [sp, #0x418] */ ARM64("ldr x9, [sp, #0x418]");
    /* 0x00bca30c: cbz      x9, #0xbca320 */ if (x9 == 0) goto loc_00bca320;
    /* 0x00bca310: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00bca314: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00bca318: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00bca31c: b.ne     #0xbca328 */ if (COND_NE) goto loc_00bca328;
loc_00bca320:
    /* 0x00bca320: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bca324: b        #0xbca580 */ goto loc_00bca580;
loc_00bca328:
    /* 0x00bca328: ldr      x9, [sp, #0x410] */ ARM64("ldr x9, [sp, #0x410]");
    /* 0x00bca32c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bca330: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
loc_00bca334:
    /* 0x00bca334: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca338: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bca33c: b        #0xbca580 */ goto loc_00bca580;
    /* 0x00bca340: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca344: b        #0xbca63c */ goto loc_00bca63c;
    /* 0x00bca348: b        #0xbca63c */ goto loc_00bca63c;
    /* 0x00bca34c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca350: b        #0xbca5b8 */ goto loc_00bca5b8;
    /* 0x00bca354: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca358: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca35c: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00bca360: bl       #0xb9eff8 */ CALL_DIRECT(sub_00b9eff8);
    /* 0x00bca364: cbz      x26, #0xbca370 */ if (x26 == 0) goto loc_00bca370;
    /* 0x00bca368: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca36c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca370:
    /* 0x00bca370: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
loc_00bca374:
    /* 0x00bca374: ldr      x1, [sp, #0x158] */ ARM64("ldr x1, [sp, #0x158]");
    /* 0x00bca378: bl       #0xb9f060 */ CALL_DIRECT(sub_00b9f060);
    /* 0x00bca37c: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bca380: cbz      x8, #0xbca38c */ if (x8 == 0) goto loc_00bca38c;
    /* 0x00bca384: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
    /* 0x00bca388: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca38c:
    /* 0x00bca38c: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00bca390: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bca394: stlxr    w9, x8, [x24] */ ARM64("stlxr w9, x8, [x24]");
    /* 0x00bca398: cbnz     w9, #0xbca38c */ if (w9 != 0) goto loc_00bca38c;
    /* 0x00bca39c: b.ne     #0xbca648 */ if (COND_NE) goto loc_00bca648;
    /* 0x00bca3a0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca3a4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00bca3a8: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca3ac: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca3b0: ldr      x8, [sp, #0x198] */ ARM64("ldr x8, [sp, #0x198]");
    /* 0x00bca3b4: cbz      x8, #0xbca634 */ if (x8 == 0) goto loc_00bca634;
    /* 0x00bca3b8: ldr      x0, [sp, #0x190] */ ARM64("ldr x0, [sp, #0x190]");
    /* 0x00bca3bc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca3c0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca3c4: cbz      x26, #0xbca634 */ if (x26 == 0) goto loc_00bca634;
    /* 0x00bca3c8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00bca3cc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca3d0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca3d4: b        #0xbca63c */ goto loc_00bca63c;
loc_00bca3d8:
    /* 0x00bca3d8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca3dc: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca3e0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca3e4:
    /* 0x00bca3e4: subs     x8, x26, x23 */ ARM64("subs x8, x26, x23");
    /* 0x00bca3e8: b.ne     #0xbca490 */ if (COND_NE) goto loc_00bca490;
loc_00bca3ec:
    /* 0x00bca3ec: cbz      x25, #0xbca3f8 */ if (x25 == 0) goto loc_00bca3f8;
    /* 0x00bca3f0: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00bca3f4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca3f8:
    /* 0x00bca3f8: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00bca3fc: mov      w23, #0x18 */ ARM64("mov w23, #0x18");
loc_00bca400:
    /* 0x00bca400: cmp      x22, x20 */ ARM64("cmp x22, x20");
    /* 0x00bca404: b.eq     #0xbca470 */ if (COND_EQ) goto loc_00bca470;
    /* 0x00bca408: madd     x24, x22, x23, x21 */ ARM64("madd x24, x22, x23, x21");
    /* 0x00bca40c: ldr      x25, [x24, #0x10] */ ARM64("ldr x25, [x24, #0x10]");
    /* 0x00bca410: cbz      x25, #0xbca458 */ if (x25 == 0) goto loc_00bca458;
    /* 0x00bca414: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00bca418: ldr      x27, [x24, #8] */ ARM64("ldr x27, [x24, #8]");
    /* 0x00bca41c: b        #0xbca42c */ goto loc_00bca42c;
loc_00bca420:
    /* 0x00bca420: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00bca424: cmp      x26, x25 */ ARM64("cmp x26, x25");
    /* 0x00bca428: b.eq     #0xbca458 */ if (COND_EQ) goto loc_00bca458;
loc_00bca42c:
    /* 0x00bca42c: ldr      x8, [x27, x26, lsl #3] */ ARM64("ldr x8, [x27, x26, lsl #3]");
    /* 0x00bca430: cbz      x8, #0xbca420 */ if (x8 == 0) goto loc_00bca420;
loc_00bca434:
    /* 0x00bca434: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bca438: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bca43c: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bca440: cbnz     w10, #0xbca434 */ if (w10 != 0) goto loc_00bca434;
    /* 0x00bca444: b.ne     #0xbca420 */ if (COND_NE) goto loc_00bca420;
    /* 0x00bca448: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca44c: ldr      x0, [x27, x26, lsl #3] */ ARM64("ldr x0, [x27, x26, lsl #3]");
    /* 0x00bca450: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca454: b        #0xbca420 */ goto loc_00bca420;
loc_00bca458:
    /* 0x00bca458: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bca45c: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00bca460: cbz      x8, #0xbca400 */ if (x8 == 0) goto loc_00bca400;
    /* 0x00bca464: ldr      x0, [x24, #8] */ ARM64("ldr x0, [x24, #8]");
    /* 0x00bca468: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca46c: b        #0xbca400 */ goto loc_00bca400;
loc_00bca470:
    /* 0x00bca470: ldr      x8, [sp, #0x38] */ ARM64("ldr x8, [sp, #0x38]");
    /* 0x00bca474: cbz      x8, #0xbca480 */ if (x8 == 0) goto loc_00bca480;
    /* 0x00bca478: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00bca47c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca480:
    /* 0x00bca480: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bca484: ldr      x20, [sp, #0x40] */ ARM64("ldr x20, [sp, #0x40]");
    /* 0x00bca488: ldr      x23, [sp, #0x30] */ ARM64("ldr x23, [sp, #0x30]");
    /* 0x00bca48c: b        #0xbca4d8 */ goto loc_00bca4d8;
loc_00bca490:
    /* 0x00bca490: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00bca494: lsr      x24, x8, #3 */ ARM64("lsr x24, x8, #3");
    /* 0x00bca498: b        #0xbca4a8 */ goto loc_00bca4a8;
loc_00bca49c:
    /* 0x00bca49c: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00bca4a0: cmp      x22, x24 */ ARM64("cmp x22, x24");
    /* 0x00bca4a4: b.eq     #0xbca3ec */ if (COND_EQ) goto loc_00bca3ec;
loc_00bca4a8:
    /* 0x00bca4a8: ldr      x8, [x23, x22, lsl #3] */ ARM64("ldr x8, [x23, x22, lsl #3]");
    /* 0x00bca4ac: cbz      x8, #0xbca49c */ if (x8 == 0) goto loc_00bca49c;
loc_00bca4b0:
    /* 0x00bca4b0: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bca4b4: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bca4b8: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bca4bc: cbnz     w10, #0xbca4b0 */ if (w10 != 0) goto loc_00bca4b0;
    /* 0x00bca4c0: b.ne     #0xbca49c */ if (COND_NE) goto loc_00bca49c;
    /* 0x00bca4c4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca4c8: ldr      x0, [x23, x22, lsl #3] */ ARM64("ldr x0, [x23, x22, lsl #3]");
    /* 0x00bca4cc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca4d0: b        #0xbca49c */ goto loc_00bca49c;
loc_00bca4d4:
    /* 0x00bca4d4: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca4d8:
    /* 0x00bca4d8: cbz      x23, #0xbca580 */ if (x23 == 0) goto loc_00bca580;
    /* 0x00bca4dc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca4e0: b        #0xbca57c */ goto loc_00bca57c;
    /* 0x00bca4e4: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca4e8:
    /* 0x00bca4e8: mov      w22, #1 */ ARM64("mov w22, #1");
loc_00bca4ec:
    /* 0x00bca4ec: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00bca4f0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00bca4f4: stlxr    w9, x8, [x20] */ ARM64("stlxr w9, x8, [x20]");
    /* 0x00bca4f8: cbnz     w9, #0xbca4ec */ if (w9 != 0) goto loc_00bca4ec;
    /* 0x00bca4fc: b.ne     #0xbca50c */ if (COND_NE) goto loc_00bca50c;
    /* 0x00bca500: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca504: ldr      x0, [sp, #0x358] */ ARM64("ldr x0, [sp, #0x358]");
    /* 0x00bca508: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00bca50c:
    /* 0x00bca50c: tbz      w21, #0, #0xbca530 */ if (((w21 >> #0) & 1) == 0) goto loc_00bca530;
    /* 0x00bca510: ldr      x20, [sp, #0x348] */ ARM64("ldr x20, [sp, #0x348]");
    /* 0x00bca514: ldr      x1, [sp, #0x350] */ ARM64("ldr x1, [sp, #0x350]");
    /* 0x00bca518: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca51c: bl       #0xb9f060 */ CALL_DIRECT(sub_00b9f060);
    /* 0x00bca520: ldr      x8, [sp, #0x340] */ ARM64("ldr x8, [sp, #0x340]");
    /* 0x00bca524: cbz      x8, #0xbca530 */ if (x8 == 0) goto loc_00bca530;
    /* 0x00bca528: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca52c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca530:
    /* 0x00bca530: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00bca534: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00bca538: csel     w8, wzr, w22, eq */ ARM64("csel w8, wzr, w22, eq");
    /* 0x00bca53c: tbz      w8, #0, #0xbca648 */ if (((w8 >> #0) & 1) == 0) goto loc_00bca648;
    /* 0x00bca540: add      x0, sp, #0x300 */ ARM64("add x0, sp, #0x300");
    /* 0x00bca544: bl       #0xbcad60 */ CALL_DIRECT(sub_00bcad60);
    /* 0x00bca548: b        #0xbca648 */ goto loc_00bca648;
    /* 0x00bca54c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca550: ldr      x8, [sp, #0x340] */ ARM64("ldr x8, [sp, #0x340]");
    /* 0x00bca554: cbz      x8, #0xbca634 */ if (x8 == 0) goto loc_00bca634;
loc_00bca558:
    /* 0x00bca558: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca55c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca560: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00bca564:
    /* 0x00bca564: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00bca568: ldr      x25, [sp, #0x1a0] */ ARM64("ldr x25, [sp, #0x1a0]");
    /* 0x00bca56c: subs     x8, x26, x23 */ ARM64("subs x8, x26, x23");
    /* 0x00bca570: b.ne     #0xbca5cc */ if (COND_NE) goto loc_00bca5cc;
loc_00bca574:
    /* 0x00bca574: cbz      x20, #0xbca580 */ if (x20 == 0) goto loc_00bca580;
    /* 0x00bca578: mov      x0, x23 */ ARM64("mov x0, x23");
loc_00bca57c:
    /* 0x00bca57c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca580:
    /* 0x00bca580: ldr      x20, [sp, #0x400] */ ARM64("ldr x20, [sp, #0x400]");
    /* 0x00bca584: ldr      x8, [sp, #0x408] */ ARM64("ldr x8, [sp, #0x408]");
    /* 0x00bca588: add      x22, x8, #1 */ ARM64("add x22, x8, #1");
    /* 0x00bca58c: mov      x0, x20 */ ARM64("mov x0, x20");
loc_00bca590:
    /* 0x00bca590: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00bca594: b.eq     #0xbca5a8 */ if (COND_EQ) goto loc_00bca5a8;
    /* 0x00bca598: add      x21, x0, #0x18 */ ARM64("add x21, x0, #0x18");
    /* 0x00bca59c: bl       #0xb9de3c */ CALL_DIRECT(sub_00b9de3c);
    /* 0x00bca5a0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00bca5a4: b        #0xbca590 */ goto loc_00bca590;
loc_00bca5a8:
    /* 0x00bca5a8: ldr      x8, [sp, #0x3f8] */ ARM64("ldr x8, [sp, #0x3f8]");
    /* 0x00bca5ac: cbz      x8, #0xbca5b8 */ if (x8 == 0) goto loc_00bca5b8;
    /* 0x00bca5b0: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00bca5b4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca5b8:
    /* 0x00bca5b8: ldr      x8, [sp, #0x190] */ ARM64("ldr x8, [sp, #0x190]");
    /* 0x00bca5bc: cbz      x8, #0xbca648 */ if (x8 == 0) goto loc_00bca648;
    /* 0x00bca5c0: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00bca5c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00bca5c8: b        #0xbca648 */ goto loc_00bca648;
loc_00bca5cc:
    /* 0x00bca5cc: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00bca5d0: lsr      x22, x8, #3 */ ARM64("lsr x22, x8, #3");
    /* 0x00bca5d4: b        #0xbca5e4 */ goto loc_00bca5e4;
loc_00bca5d8:
    /* 0x00bca5d8: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00bca5dc: cmp      x21, x22 */ ARM64("cmp x21, x22");
    /* 0x00bca5e0: b.eq     #0xbca574 */ if (COND_EQ) goto loc_00bca574;
loc_00bca5e4:
    /* 0x00bca5e4: ldr      x8, [x23, x21, lsl #3] */ ARM64("ldr x8, [x23, x21, lsl #3]");
    /* 0x00bca5e8: cbz      x8, #0xbca5d8 */ if (x8 == 0) goto loc_00bca5d8;
loc_00bca5ec:
    /* 0x00bca5ec: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00bca5f0: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00bca5f4: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00bca5f8: cbnz     w10, #0xbca5ec */ if (w10 != 0) goto loc_00bca5ec;
    /* 0x00bca5fc: b.ne     #0xbca5d8 */ if (COND_NE) goto loc_00bca5d8;
    /* 0x00bca600: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca604: ldr      x0, [x23, x21, lsl #3] */ ARM64("ldr x0, [x23, x21, lsl #3]");
    /* 0x00bca608: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca60c: b        #0xbca5d8 */ goto loc_00bca5d8;
loc_00bca610:
    /* 0x00bca610: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00bca614: b.eq     #0xbca62c */ if (COND_EQ) goto loc_00bca62c;
    /* 0x00bca618: add      x19, x21, #0x18 */ ARM64("add x19, x21, #0x18");
    /* 0x00bca61c: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00bca620: bl       #0xb9de3c */ CALL_DIRECT(sub_00b9de3c);
    /* 0x00bca624: mov      x21, x19 */ ARM64("mov x21, x19");
    /* 0x00bca628: b        #0xbca610 */ goto loc_00bca610;
loc_00bca62c:
    /* 0x00bca62c: ldr      x8, [sp, #0x3f8] */ ARM64("ldr x8, [sp, #0x3f8]");
    /* 0x00bca630: cbnz     x8, #0xbca558 */ if (x8 != 0) goto loc_00bca558;
loc_00bca634:
    /* 0x00bca634: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00bca638: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00bca63c:
    /* 0x00bca63c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00bca640:
    /* 0x00bca640: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00bca644: bl       #0xbcc024 */ CALL_DIRECT(sub_00bcc024);
loc_00bca648:
    /* 0x00bca648: ldr      x20, [sp, #0x1b8] */ ARM64("ldr x20, [sp, #0x1b8]");
    /* 0x00bca64c: cbz      x20, #0xbca678 */ if (x20 == 0) goto loc_00bca678;
    /* 0x00bca650: ldr      x21, [sp, #0x1c8] */ ARM64("ldr x21, [sp, #0x1c8]");
    /* 0x00bca654: cbnz     x21, #0xbca680 */ if (x21 != 0) goto loc_00bca680;
loc_00bca658:
    /* 0x00bca658: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00bca65c: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00bca660: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00bca664: b.eq     #0xbca678 */ if (COND_EQ) goto loc_00bca678;
    /* 0x00bca668: ldr      x9, [sp, #0x1b0] */ ARM64("ldr x9, [sp, #0x1b0]");
    /* 0x00bca66c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00bca670: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00bca674: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00bca678:
    /* 0x00bca678: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00bca67c: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
loc_00bca680:
    /* 0x00bca680: ldr      x22, [sp, #0x1b0] */ ARM64("ldr x22, [sp, #0x1b0]");
    /* 0x00bca684: mov      x23, x22 */ ARM64("mov x23, x22");
    /* 0x00bca688: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00bca68c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00bca690: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00bca694: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00bca698: b        #0xbca6a0 */ goto loc_00bca6a0;
loc_00bca69c:
    /* 0x00bca69c: cbz      x21, #0xbca658 */ if (x21 == 0) goto loc_00bca658;
loc_00bca6a0:
    /* 0x00bca6a0: cbnz     x24, #0xbca6bc */ if (x24 != 0) goto loc_00bca6bc;
loc_00bca6a4:
    /* 0x00bca6a4: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00bca6a8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00bca6ac: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00bca6b0: sub      x22, x22, #0x80 */ ARM64("sub x22, x22, #0x80");
    /* 0x00bca6b4: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00bca6b8: cbz      x24, #0xbca6a4 */ if (x24 == 0) goto loc_00bca6a4;
loc_00bca6bc:
    /* 0x00bca6bc: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00bca6c0: rbit     x9, x24 */ ARM64("rbit x9, x24");
    /* 0x00bca6c4: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00bca6c8: and      x24, x8, x24 */ ARM64("and x24, x8, x24");
    /* 0x00bca6cc: lsl      x8, x9, #1 */ ARM64("lsl x8, x9, #1");
    /* 0x00bca6d0: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00bca6d4: sub      x8, x22, x8 */ ARM64("sub x8, x22, x8");
    /* 0x00bca6d8: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00bca6dc: ldur     x9, [x8, #-0x10] */ ARM64("ldur x9, [x8, #-0x10]");
loc_00bca6e0:
    /* 0x00bca6e0: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00bca6e4: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00bca6e8: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00bca6ec: cbnz     w11, #0xbca6e0 */ if (w11 != 0) goto loc_00bca6e0;
    /* 0x00bca6f0: b.ne     #0xbca69c */ if (COND_NE) goto loc_00bca69c;
    /* 0x00bca6f4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00bca6f8: ldur     x0, [x8, #-0x10] */ ARM64("ldur x0, [x8, #-0x10]");
    /* 0x00bca6fc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00bca700: b        #0xbca69c */ goto loc_00bca69c;
}
