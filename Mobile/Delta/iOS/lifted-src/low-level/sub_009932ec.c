/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x9932ec..0x993e5c (2928 bytes). */
#include "../lift_runtime.hpp"

void sub_009932ec(Arm64Context& cpu) {
    /* 0x009932ec: sub      sp, sp, #0xb0 */ ARM64("sub sp, sp, #0xb0");
    /* 0x009932f0: stp      x28, x27, [sp, #0x50] */ ARM64("stp x28, x27, [sp, #0x50]");
    /* 0x009932f4: stp      x26, x25, [sp, #0x60] */ ARM64("stp x26, x25, [sp, #0x60]");
    /* 0x009932f8: stp      x24, x23, [sp, #0x70] */ ARM64("stp x24, x23, [sp, #0x70]");
    /* 0x009932fc: stp      x22, x21, [sp, #0x80] */ ARM64("stp x22, x21, [sp, #0x80]");
    /* 0x00993300: stp      x20, x19, [sp, #0x90] */ ARM64("stp x20, x19, [sp, #0x90]");
    /* 0x00993304: stp      x29, x30, [sp, #0xa0] */ ARM64("stp x29, x30, [sp, #0xa0]");
    /* 0x00993308: add      x29, sp, #0xa0 */ ARM64("add x29, sp, #0xa0");
    /* 0x0099330c: mov      x22, x6 */ ARM64("mov x22, x6");
    /* 0x00993310: mov      x23, x3 */ ARM64("mov x23, x3");
    /* 0x00993314: mov      x26, x1 */ ARM64("mov x26, x1");
    /* 0x00993318: cbz      x0, #0x99332c */ if (x0 == 0) goto loc_0099332c;
    /* 0x0099331c: ldr      w8, [x0] */ ARM64("ldr w8, [x0]");
    /* 0x00993320: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x00993324: csel     x19, x0, xzr, eq */ ARM64("csel x19, x0, xzr, eq");
    /* 0x00993328: b        #0x993330 */ goto loc_00993330;
loc_0099332c:
    /* 0x0099332c: mov      x19, #0 */ ARM64("mov x19, #0");
loc_00993330:
    /* 0x00993330: ldr      x8, [x19, #0x18] */ ARM64("ldr x8, [x19, #0x18]");
    /* 0x00993334: ldr      x9, [x8, #0xd8] */ ARM64("ldr x9, [x8, #0xd8]");
    /* 0x00993338: ldrb     w9, [x9, #0x50] */ ARM64("ldrb w9, [x9, #0x50]");
    /* 0x0099333c: tbnz     w9, #3, #0x993360 */ if (((w9 >> #3) & 1) != 0) goto loc_00993360;
    /* 0x00993340: ldr      w8, [x8] */ ARM64("ldr w8, [x8]");
    /* 0x00993344: cmp      w8, #0x303 */ ARM64("cmp w8, #0x303");
    /* 0x00993348: mov      w9, #0x10000 */ ARM64("mov w9, #0x10000");
    /* 0x0099334c: ccmp     w8, w9, #4, gt */ ARM64("ccmp w8, w9, #4, gt");
    /* 0x00993350: cset     w27, ne */ ARM64("cset w27, ne");
    /* 0x00993354: cmp      w26, #0x17 */ ARM64("cmp w26, #0x17");
    /* 0x00993358: b.ls     #0x99336c */ if (COND_LS) goto loc_0099336c;
    /* 0x0099335c: b        #0x993390 */ goto loc_00993390;
loc_00993360:
    /* 0x00993360: mov      w27, #0 */ ARM64("mov w27, #0");
    /* 0x00993364: cmp      w26, #0x17 */ ARM64("cmp w26, #0x17");
    /* 0x00993368: b.hi     #0x993390 */ if (COND_HI) goto loc_00993390;
loc_0099336c:
    /* 0x0099336c: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00993370: lsl      w8, w8, w26 */ ARM64("lsl w8, w8, w26");
    /* 0x00993374: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00993378: movk     w9, #0xc0, lsl #16 */ ARM64("movk w9, #0xc0, lsl #16");
    /* 0x0099337c: tst      w8, w9 */ ARM64("tst w8, w9");
    /* 0x00993380: b.eq     #0x993390 */ if (COND_EQ) goto loc_00993390;
    /* 0x00993384: cmp      w26, #0x17 */ ARM64("cmp w26, #0x17");
    /* 0x00993388: b.eq     #0x9933ec */ if (COND_EQ) goto loc_009933ec;
    /* 0x0099338c: cbz      w5, #0x9933ec */ if (w5 == 0) goto loc_009933ec;
loc_00993390:
    /* 0x00993390: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993394: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993398: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x0099339c: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x009933a0: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x009933a4: mov      w1, #0x27f */ ARM64("mov w1, #0x27f");
loc_009933a8:
    /* 0x009933a8: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x009933ac: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009933b0: mov      w1, #0x50 */ ARM64("mov w1, #0x50");
loc_009933b4:
    /* 0x009933b4: mov      w2, #0x103 */ ARM64("mov w2, #0x103");
    /* 0x009933b8: movk     w2, #0xc, lsl #16 */ ARM64("movk w2, #0xc, lsl #16");
loc_009933bc:
    /* 0x009933bc: mov      x3, #0 */ ARM64("mov x3, #0");
    /* 0x009933c0: bl       #0x9a58a4 */ CALL_DIRECT(sub_009a58a4);
loc_009933c4:
    /* 0x009933c4: mov      w20, #-1 */ ARM64("mov w20, #-1");
loc_009933c8:
    /* 0x009933c8: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x009933cc: ldp      x29, x30, [sp, #0xa0] */ ARM64("ldp x29, x30, [sp, #0xa0]");
    /* 0x009933d0: ldp      x20, x19, [sp, #0x90] */ ARM64("ldp x20, x19, [sp, #0x90]");
    /* 0x009933d4: ldp      x22, x21, [sp, #0x80] */ ARM64("ldp x22, x21, [sp, #0x80]");
    /* 0x009933d8: ldp      x24, x23, [sp, #0x70] */ ARM64("ldp x24, x23, [sp, #0x70]");
    /* 0x009933dc: ldp      x26, x25, [sp, #0x60] */ ARM64("ldp x26, x25, [sp, #0x60]");
    /* 0x009933e0: ldp      x28, x27, [sp, #0x50] */ ARM64("ldp x28, x27, [sp, #0x50]");
    /* 0x009933e4: add      sp, sp, #0xb0 */ ARM64("add sp, sp, #0xb0");
    /* 0x009933e8: ret       */ return;
loc_009933ec:
    /* 0x009933ec: cmp      w26, #0x16 */ ARM64("cmp w26, #0x16");
    /* 0x009933f0: b.ne     #0x99343c */ if (COND_NE) goto loc_0099343c;
    /* 0x009933f4: ldr      x8, [x19, #0xcb8] */ ARM64("ldr x8, [x19, #0xcb8]");
    /* 0x009933f8: cbz      x8, #0x99343c */ if (x8 == 0) goto loc_0099343c;
    /* 0x009933fc: add      x8, x19, #0xcb0 */ ARM64("add x8, x19, #0xcb0");
    /* 0x00993400: cbz      x4, #0x993a2c */ if (x4 == 0) goto loc_00993a2c;
    /* 0x00993404: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00993408: mov      w10, #1 */ ARM64("mov w10, #1");
loc_0099340c:
    /* 0x0099340c: cbz      x10, #0x993a58 */ if (x10 == 0) goto loc_00993a58;
    /* 0x00993410: ldrb     w10, [x8, x9] */ ARM64("ldrb w10, [x8, x9]");
    /* 0x00993414: strb     w10, [x23, x9] */ ARM64("strb w10, [x23, x9]");
    /* 0x00993418: ldr      x10, [x19, #0xcb8] */ ARM64("ldr x10, [x19, #0xcb8]");
    /* 0x0099341c: sub      x10, x10, #1 */ ARM64("sub x10, x10, #1");
    /* 0x00993420: str      x10, [x19, #0xcb8] */ ARM64("str x10, [x19, #0xcb8]");
    /* 0x00993424: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00993428: cmp      x4, x9 */ ARM64("cmp x4, x9");
    /* 0x0099342c: b.ne     #0x99340c */ if (COND_NE) goto loc_0099340c;
    /* 0x00993430: cbz      x10, #0x993a54 */ if (x10 == 0) goto loc_00993a54;
    /* 0x00993434: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00993438: b        #0x993a30 */ goto loc_00993a30;
loc_0099343c:
    /* 0x0099343c: str      x0, [sp, #0x40] */ ARM64("str x0, [sp, #0x40]");
    /* 0x00993440: mov      x24, x5 */ ARM64("mov x24, x5");
    /* 0x00993444: mov      x21, x4 */ ARM64("mov x21, x4");
    /* 0x00993448: mov      x25, x2 */ ARM64("mov x25, x2");
    /* 0x0099344c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993450: bl       #0x9a5960 */ CALL_DIRECT(sub_009a5960);
    /* 0x00993454: cbz      w0, #0x993a04 */ if (w0 == 0) goto loc_00993a04;
loc_00993458:
    /* 0x00993458: str      w27, [sp, #0x4c] */ ARM64("str w27, [sp, #0x4c]");
    /* 0x0099345c: str      w24, [sp, #0x34] */ ARM64("str w24, [sp, #0x34]");
    /* 0x00993460: str      x21, [sp, #0x38] */ ARM64("str x21, [sp, #0x38]");
    /* 0x00993464: add      x21, x19, #0xd08 */ ARM64("add x21, x19, #0xd08");
    /* 0x00993468: add      x27, x19, #0xd18 */ ARM64("add x27, x19, #0xd18");
    /* 0x0099346c: add      x8, x19, #0xcb0 */ ARM64("add x8, x19, #0xcb0");
    /* 0x00993470: stp      xzr, x8, [sp, #0x18] */ ARM64("stp xzr, x8, [sp, #0x18]");
    /* 0x00993474: ldr      x24, [sp, #0x40] */ ARM64("ldr x24, [sp, #0x40]");
    /* 0x00993478: str      x25, [sp, #0x28] */ ARM64("str x25, [sp, #0x28]");
loc_0099347c:
    /* 0x0099347c: ldr      x25, [sp, #0x28] */ ARM64("ldr x25, [sp, #0x28]");
loc_00993480:
    /* 0x00993480: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00993484: str      w8, [x19, #0x68] */ ARM64("str w8, [x19, #0x68]");
    /* 0x00993488: ldr      x10, [x19, #0xd10] */ ARM64("ldr x10, [x19, #0xd10]");
    /* 0x0099348c: ldr      x8, [x19, #0xd08] */ ARM64("ldr x8, [x19, #0xd08]");
    /* 0x00993490: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00993494: b.lo     #0x993528 */ if (COND_LO) goto loc_00993528;
    /* 0x00993498: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x0099349c: stp      xzr, xzr, [x21] */ ARM64("stp xzr, xzr, [x21]");
loc_009934a0:
    /* 0x009934a0: add      x28, x27, x8, lsl #6 */ ARM64("add x28, x27, x8, lsl #6");
    /* 0x009934a4: ldr      x8, [x19, #0xc70] */ ARM64("ldr x8, [x19, #0xc70]");
    /* 0x009934a8: ldr      x8, [x8, #0x40] */ ARM64("ldr x8, [x8, #0x40]");
    /* 0x009934ac: ldr      x0, [x19, #0xc80] */ ARM64("ldr x0, [x19, #0xc80]");
    /* 0x009934b0: add      x2, x28, #8 */ ARM64("add x2, x28, #8");
    /* 0x009934b4: add      x3, x28, #0xc */ ARM64("add x3, x28, #0xc");
    /* 0x009934b8: add      x4, x28, #0x10 */ ARM64("add x4, x28, #0x10");
    /* 0x009934bc: add      x5, x28, #0x20 */ ARM64("add x5, x28, #0x20");
    /* 0x009934c0: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x009934c4: mov      x6, #0 */ ARM64("mov x6, #0");
    /* 0x009934c8: mov      x7, #0 */ ARM64("mov x7, #0");
    /* 0x009934cc: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x009934d0: mov      x2, x0 */ ARM64("mov x2, x0");
    /* 0x009934d4: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009934d8: mov      w1, #0 */ ARM64("mov w1, #0");
    /* 0x009934dc: adrp     x3, #0xc89000 */ ARM64("adrp x3, #0xc89000");
    /* 0x009934e0: add      x3, x3, #0x79c */ ARM64("add x3, x3, #0x79c");
    /* 0x009934e4: mov      w4, #0x2bf */ ARM64("mov w4, #0x2bf");
    /* 0x009934e8: bl       #0x99319c */ CALL_DIRECT(sub_0099319c);
    /* 0x009934ec: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x009934f0: b.lt     #0x9939fc */ if (COND_LT) goto loc_009939fc;
    /* 0x009934f4: str      xzr, [x28, #0x28] */ ARM64("str xzr, [x28, #0x28]");
    /* 0x009934f8: ldr      x8, [x19, #0xd08] */ ARM64("ldr x8, [x19, #0xd08]");
    /* 0x009934fc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00993500: str      x8, [x19, #0xd08] */ ARM64("str x8, [x19, #0xd08]");
    /* 0x00993504: ldr      x8, [x19, #0xc70] */ ARM64("ldr x8, [x19, #0xc70]");
    /* 0x00993508: ldr      x8, [x8, #0x18] */ ARM64("ldr x8, [x8, #0x18]");
    /* 0x0099350c: ldr      x0, [x19, #0xc80] */ ARM64("ldr x0, [x19, #0xc80]");
    /* 0x00993510: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00993514: cbz      w0, #0x993524 */ if (w0 == 0) goto loc_00993524;
    /* 0x00993518: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x0099351c: cmp      x8, #0x20 */ ARM64("cmp x8, #0x20");
    /* 0x00993520: b.lo     #0x9934a0 */ if (COND_LO) goto loc_009934a0;
loc_00993524:
    /* 0x00993524: ldr      x10, [x19, #0xd10] */ ARM64("ldr x10, [x19, #0xd10]");
loc_00993528:
    /* 0x00993528: add      x28, x27, x10, lsl #6 */ ARM64("add x28, x27, x10, lsl #6");
    /* 0x0099352c: ldr      x8, [x19, #0xcb8] */ ARM64("ldr x8, [x19, #0xcb8]");
    /* 0x00993530: ldrb     w9, [x28, #0xc] */ ARM64("ldrb w9, [x28, #0xc]");
    /* 0x00993534: cbz      x8, #0x993564 */ if (x8 == 0) goto loc_00993564;
    /* 0x00993538: cmp      w9, #0x16 */ ARM64("cmp w9, #0x16");
    /* 0x0099353c: b.eq     #0x993580 */ if (COND_EQ) goto loc_00993580;
    /* 0x00993540: ldr      x11, [x19, #0x18] */ ARM64("ldr x11, [x19, #0x18]");
    /* 0x00993544: ldr      x12, [x11, #0xd8] */ ARM64("ldr x12, [x11, #0xd8]");
    /* 0x00993548: ldrb     w12, [x12, #0x50] */ ARM64("ldrb w12, [x12, #0x50]");
    /* 0x0099354c: tbnz     w12, #3, #0x993564 */ if (((w12 >> #3) & 1) != 0) goto loc_00993564;
    /* 0x00993550: ldr      w11, [x11] */ ARM64("ldr w11, [x11]");
    /* 0x00993554: cmp      w11, #0x304 */ ARM64("cmp w11, #0x304");
    /* 0x00993558: b.lt     #0x993564 */ if (COND_LT) goto loc_00993564;
    /* 0x0099355c: cmp      w11, #0x10, lsl #12 */ ARM64("cmp w11, #0x10, lsl #12");
    /* 0x00993560: b.ne     #0x993bfc */ if (COND_NE) goto loc_00993bfc;
loc_00993564:
    /* 0x00993564: cmp      w9, #0x15 */ ARM64("cmp w9, #0x15");
    /* 0x00993568: b.ne     #0x993580 */ if (COND_NE) goto loc_00993580;
    /* 0x0099356c: ldr      w9, [x19, #0x1b8] */ ARM64("ldr w9, [x19, #0x1b8]");
    /* 0x00993570: cbnz     w9, #0x993a70 */ if (w9 != 0) goto loc_00993a70;
    /* 0x00993574: mov      w9, #0x15 */ ARM64("mov w9, #0x15");
    /* 0x00993578: mov      w11, #1 */ ARM64("mov w11, #1");
    /* 0x0099357c: b        #0x9935a0 */ goto loc_009935a0;
loc_00993580:
    /* 0x00993580: ldr      x11, [x28, #0x20] */ ARM64("ldr x11, [x28, #0x20]");
    /* 0x00993584: cbz      x11, #0x99358c */ if (x11 == 0) goto loc_0099358c;
    /* 0x00993588: str      wzr, [x19, #0xcd8] */ ARM64("str wzr, [x19, #0xcd8]");
loc_0099358c:
    /* 0x0099358c: mov      w11, #0 */ ARM64("mov w11, #0");
    /* 0x00993590: cmp      w9, #0x16 */ ARM64("cmp w9, #0x16");
    /* 0x00993594: b.eq     #0x9935a0 */ if (COND_EQ) goto loc_009935a0;
    /* 0x00993598: ldr      w12, [x19, #0x1b8] */ ARM64("ldr w12, [x19, #0x1b8]");
    /* 0x0099359c: cbnz     w12, #0x993a70 */ if (w12 != 0) goto loc_00993a70;
loc_009935a0:
    /* 0x009935a0: ldr      w12, [x19, #0x84] */ ARM64("ldr w12, [x19, #0x84]");
    /* 0x009935a4: tbnz     w12, #1, #0x993ad0 */ if (((w12 >> #1) & 1) != 0) goto loc_00993ad0;
    /* 0x009935a8: cmp      w9, w26 */ ARM64("cmp w9, w26");
    /* 0x009935ac: b.eq     #0x993788 */ if (COND_EQ) goto loc_00993788;
    /* 0x009935b0: cmp      w9, #0x14 */ ARM64("cmp w9, #0x14");
    /* 0x009935b4: ccmp     w26, #0x16, #0, eq */ ARM64("ccmp w26, #0x16, #0, eq");
    /* 0x009935b8: ccmp     x25, #0, #4, eq */ ARM64("ccmp x25, #0, #4, eq");
    /* 0x009935bc: ldr      w10, [sp, #0x4c] */ ARM64("ldr w10, [sp, #0x4c]");
    /* 0x009935c0: csinc    w10, w10, wzr, ne */ ARM64("csinc w10, w10, wzr, ne");
    /* 0x009935c4: tbz      w10, #0, #0x9937b0 */ if (((w10 >> #0) & 1) == 0) goto loc_009937b0;
    /* 0x009935c8: ldr      w10, [x28, #8] */ ARM64("ldr w10, [x28, #8]");
    /* 0x009935cc: cmp      w10, #2 */ ARM64("cmp w10, #2");
    /* 0x009935d0: b.eq     #0x993ae8 */ if (COND_EQ) goto loc_00993ae8;
    /* 0x009935d4: ldr      x13, [x24, #0x18] */ ARM64("ldr x13, [x24, #0x18]");
    /* 0x009935d8: ldr      w13, [x13] */ ARM64("ldr w13, [x13]");
    /* 0x009935dc: cmp      w13, #0x10, lsl #12 */ ARM64("cmp w13, #0x10, lsl #12");
    /* 0x009935e0: b.eq     #0x9937bc */ if (COND_EQ) goto loc_009937bc;
    /* 0x009935e4: cbnz     w11, #0x9937cc */ if (w11 != 0) goto loc_009937cc;
    /* 0x009935e8: tbnz     w12, #0, #0x993600 */ if (((w12 >> #0) & 1) != 0) goto loc_00993600;
    /* 0x009935ec: cmp      w9, #0x16 */ ARM64("cmp w9, #0x16");
    /* 0x009935f0: b.eq     #0x99362c */ if (COND_EQ) goto loc_0099362c;
    /* 0x009935f4: cmp      w9, #0x14 */ ARM64("cmp w9, #0x14");
    /* 0x009935f8: b.ne     #0x9936c0 */ if (COND_NE) goto loc_009936c0;
    /* 0x009935fc: b        #0x993b50 */ goto loc_00993b50;
loc_00993600:
    /* 0x00993600: cmp      w9, #0x16 */ ARM64("cmp w9, #0x16");
    /* 0x00993604: b.ne     #0x993b04 */ if (COND_NE) goto loc_00993b04;
    /* 0x00993608: ldr      x9, [x19, #0x18] */ ARM64("ldr x9, [x19, #0x18]");
    /* 0x0099360c: ldr      x10, [x9, #0xd8] */ ARM64("ldr x10, [x9, #0xd8]");
    /* 0x00993610: ldrb     w10, [x10, #0x50] */ ARM64("ldrb w10, [x10, #0x50]");
    /* 0x00993614: tbnz     w10, #3, #0x993688 */ if (((w10 >> #3) & 1) != 0) goto loc_00993688;
    /* 0x00993618: ldr      w9, [x9] */ ARM64("ldr w9, [x9]");
    /* 0x0099361c: cmp      w9, #0x304 */ ARM64("cmp w9, #0x304");
    /* 0x00993620: b.lt     #0x993688 */ if (COND_LT) goto loc_00993688;
    /* 0x00993624: cmp      w9, #0x10, lsl #12 */ ARM64("cmp w9, #0x10, lsl #12");
    /* 0x00993628: b.eq     #0x993688 */ if (COND_EQ) goto loc_00993688;
loc_0099362c:
    /* 0x0099362c: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00993630: sub      x10, x9, x8 */ ARM64("sub x10, x9, x8");
    /* 0x00993634: ldr      x9, [x28, #0x20] */ ARM64("ldr x9, [x28, #0x20]");
    /* 0x00993638: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x0099363c: csel     x20, x9, x10, lo */ ARM64("csel x20, x9, x10, lo");
    /* 0x00993640: cbz      x20, #0x9936a8 */ if (x20 == 0) goto loc_009936a8;
    /* 0x00993644: ldr      x9, [x28, #0x10] */ ARM64("ldr x9, [x28, #0x10]");
    /* 0x00993648: ldr      x10, [x28, #0x28] */ ARM64("ldr x10, [x28, #0x28]");
    /* 0x0099364c: ldr      x11, [sp, #0x20] */ ARM64("ldr x11, [sp, #0x20]");
    /* 0x00993650: add      x0, x11, x8 */ ARM64("add x0, x11, x8");
    /* 0x00993654: add      x1, x9, x10 */ ARM64("add x1, x9, x10");
    /* 0x00993658: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x0099365c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00993660: ldr      x8, [x19, #0xcb8] */ ARM64("ldr x8, [x19, #0xcb8]");
    /* 0x00993664: add      x8, x8, x20 */ ARM64("add x8, x8, x20");
    /* 0x00993668: str      x8, [x19, #0xcb8] */ ARM64("str x8, [x19, #0xcb8]");
loc_0099366c:
    /* 0x0099366c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993670: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993674: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00993678: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x0099367c: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
    /* 0x00993680: ldr      x8, [x19, #0xcb8] */ ARM64("ldr x8, [x19, #0xcb8]");
    /* 0x00993684: b        #0x9936ac */ goto loc_009936ac;
loc_00993688:
    /* 0x00993688: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0099368c: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993690: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00993694: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993698: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
    /* 0x0099369c: ldrb     w8, [x19, #0x9b8] */ ARM64("ldrb w8, [x19, #0x9b8]");
    /* 0x009936a0: tbnz     w8, #2, #0x993480 */ if (((w8 >> #2) & 1) != 0) goto loc_00993480;
    /* 0x009936a4: b        #0x993b7c */ goto loc_00993b7c;
loc_009936a8:
    /* 0x009936a8: cbz      x9, #0x99366c */ if (x9 == 0) goto loc_0099366c;
loc_009936ac:
    /* 0x009936ac: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x009936b0: b.lo     #0x993480 */ if (COND_LO) goto loc_00993480;
    /* 0x009936b4: ldrb     w9, [x28, #0xc] */ ARM64("ldrb w9, [x28, #0xc]");
    /* 0x009936b8: cmp      w9, #0x14 */ ARM64("cmp w9, #0x14");
    /* 0x009936bc: b.eq     #0x993b50 */ if (COND_EQ) goto loc_00993b50;
loc_009936c0:
    /* 0x009936c0: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x009936c4: b.lo     #0x9936d8 */ if (COND_LO) goto loc_009936d8;
    /* 0x009936c8: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009936cc: bl       #0x9a5960 */ CALL_DIRECT(sub_009a5960);
    /* 0x009936d0: cbz      w0, #0x99372c */ if (w0 == 0) goto loc_0099372c;
    /* 0x009936d4: ldrb     w9, [x28, #0xc] */ ARM64("ldrb w9, [x28, #0xc]");
loc_009936d8:
    /* 0x009936d8: cmp      w9, #0x17 */ ARM64("cmp w9, #0x17");
    /* 0x009936dc: b.ne     #0x993a9c */ if (COND_NE) goto loc_00993a9c;
    /* 0x009936e0: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009936e4: bl       #0x9a66a4 */ CALL_DIRECT(sub_009a66a4);
    /* 0x009936e8: cbnz     w0, #0x993bc4 */ if (w0 != 0) goto loc_00993bc4;
    /* 0x009936ec: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009936f0: bl       #0x9a5980 */ CALL_DIRECT(sub_009a5980);
    /* 0x009936f4: cbz      w0, #0x993bd0 */ if (w0 == 0) goto loc_00993bd0;
    /* 0x009936f8: ldr      x1, [x28, #0x20] */ ARM64("ldr x1, [x28, #0x20]");
    /* 0x009936fc: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993700: mov      w2, #0x68 */ ARM64("mov w2, #0x68");
    /* 0x00993704: mov      w3, #0 */ ARM64("mov w3, #0");
    /* 0x00993708: bl       #0x9930b0 */ CALL_DIRECT(sub_009930b0);
    /* 0x0099370c: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
    /* 0x00993710: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993714: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993718: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x0099371c: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993720: mov      w20, #-1 */ ARM64("mov w20, #-1");
    /* 0x00993724: cbnz     w0, #0x993480 */ if (w0 != 0) goto loc_00993480;
    /* 0x00993728: b        #0x9933c8 */ goto loc_009933c8;
loc_0099372c:
    /* 0x0099372c: mov      x25, x22 */ ARM64("mov x25, x22");
    /* 0x00993730: ldr      w22, [x19, #0xf0] */ ARM64("ldr w22, [x19, #0xf0]");
    /* 0x00993734: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993738: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x0099373c: bl       #0x9a57a8 */ CALL_DIRECT(sub_009a57a8);
    /* 0x00993740: ldr      x8, [x19, #0x70] */ ARM64("ldr x8, [x19, #0x70]");
    /* 0x00993744: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00993748: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x0099374c: tbnz     w0, #0x1f, #0x9939fc */ if (((w0 >> #0x1f) & 1) != 0) goto loc_009939fc;
    /* 0x00993750: mov      w20, #-1 */ ARM64("mov w20, #-1");
    /* 0x00993754: cbz      w0, #0x9933c8 */ if (w0 == 0) goto loc_009933c8;
    /* 0x00993758: cmp      w22, #0xb */ ARM64("cmp w22, #0xb");
    /* 0x0099375c: mov      x22, x25 */ ARM64("mov x22, x25");
    /* 0x00993760: ldr      x25, [sp, #0x28] */ ARM64("ldr x25, [sp, #0x28]");
    /* 0x00993764: b.eq     #0x9933c8 */ if (COND_EQ) goto loc_009933c8;
    /* 0x00993768: ldrb     w8, [x19, #0x9b8] */ ARM64("ldrb w8, [x19, #0x9b8]");
    /* 0x0099376c: tbnz     w8, #2, #0x993480 */ if (((w8 >> #2) & 1) != 0) goto loc_00993480;
    /* 0x00993770: ldr      x8, [x19, #0xc70] */ ARM64("ldr x8, [x19, #0xc70]");
    /* 0x00993774: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00993778: ldr      x0, [x19, #0xc80] */ ARM64("ldr x0, [x19, #0xc80]");
    /* 0x0099377c: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00993780: cbnz     w0, #0x993480 */ if (w0 != 0) goto loc_00993480;
    /* 0x00993784: b        #0x993c84 */ goto loc_00993c84;
loc_00993788:
    /* 0x00993788: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x0099378c: bl       #0x9a5694 */ CALL_DIRECT(sub_009a5694);
    /* 0x00993790: cmp      w26, #0x17 */ ARM64("cmp w26, #0x17");
    /* 0x00993794: b.ne     #0x993904 */ if (COND_NE) goto loc_00993904;
    /* 0x00993798: cbz      w0, #0x993904 */ if (w0 == 0) goto loc_00993904;
    /* 0x0099379c: ldr      x8, [x19, #0x260] */ ARM64("ldr x8, [x19, #0x260]");
    /* 0x009937a0: cbz      x8, #0x993cb0 */ if (x8 == 0) goto loc_00993cb0;
    /* 0x009937a4: ldr      x8, [x19, #0x2e8] */ ARM64("ldr x8, [x19, #0x2e8]");
    /* 0x009937a8: cbnz     x8, #0x993920 */ if (x8 != 0) goto loc_00993920;
    /* 0x009937ac: b        #0x993cb0 */ goto loc_00993cb0;
loc_009937b0:
    /* 0x009937b0: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x009937b4: bl       #0x9a5694 */ CALL_DIRECT(sub_009a5694);
    /* 0x009937b8: b        #0x99390c */ goto loc_0099390c;
loc_009937bc:
    /* 0x009937bc: ldr      w8, [x19, #0x78] */ ARM64("ldr w8, [x19, #0x78]");
    /* 0x009937c0: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x009937c4: csel     w8, wzr, w11, ne */ ARM64("csel w8, wzr, w11, ne");
    /* 0x009937c8: tbz      w8, #0, #0x993cdc */ if (((w8 >> #0) & 1) == 0) goto loc_00993cdc;
loc_009937cc:
    /* 0x009937cc: ldr      x8, [x28, #0x20] */ ARM64("ldr x8, [x28, #0x20]");
    /* 0x009937d0: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x009937d4: b.lt     #0x993c28 */ if (COND_LT) goto loc_00993c28;
    /* 0x009937d8: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x009937dc: b.eq     #0x993c28 */ if (COND_EQ) goto loc_00993c28;
    /* 0x009937e0: cmp      x8, #2 */ ARM64("cmp x8, #2");
    /* 0x009937e4: b.ne     #0x993c28 */ if (COND_NE) goto loc_00993c28;
    /* 0x009937e8: mov      x25, x22 */ ARM64("mov x25, x22");
    /* 0x009937ec: ldr      x8, [x28, #0x10] */ ARM64("ldr x8, [x28, #0x10]");
    /* 0x009937f0: ldr      x9, [x28, #0x28] */ ARM64("ldr x9, [x28, #0x28]");
    /* 0x009937f4: add      x3, x8, x9 */ ARM64("add x3, x8, x9");
    /* 0x009937f8: ldrb     w12, [x3] */ ARM64("ldrb w12, [x3]");
    /* 0x009937fc: ldrb     w11, [x3, #1] */ ARM64("ldrb w11, [x3, #1]");
    /* 0x00993800: ldr      x8, [x19, #0x4f8] */ ARM64("ldr x8, [x19, #0x4f8]");
    /* 0x00993804: mov      x20, x11 */ ARM64("mov x20, x11");
    /* 0x00993808: str      w12, [sp, #0x10] */ ARM64("str w12, [sp, #0x10]");
    /* 0x0099380c: cbz      x8, #0x993834 */ if (x8 == 0) goto loc_00993834;
    /* 0x00993810: ldr      w1, [x19, #0x48] */ ARM64("ldr w1, [x19, #0x48]");
    /* 0x00993814: ldr      x6, [x19, #0x500] */ ARM64("ldr x6, [x19, #0x500]");
    /* 0x00993818: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x0099381c: mov      w2, #0x15 */ ARM64("mov w2, #0x15");
    /* 0x00993820: mov      w4, #2 */ ARM64("mov w4, #2");
    /* 0x00993824: mov      x5, x24 */ ARM64("mov x5, x24");
    /* 0x00993828: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x0099382c: ldr      w12, [sp, #0x10] */ ARM64("ldr w12, [sp, #0x10]");
    /* 0x00993830: mov      x11, x20 */ ARM64("mov x11, x20");
loc_00993834:
    /* 0x00993834: ldr      x22, [x19, #0x960] */ ARM64("ldr x22, [x19, #0x960]");
    /* 0x00993838: cbnz     x22, #0x993854 */ if (x22 != 0) goto loc_00993854;
    /* 0x0099383c: ldr      x8, [x24, #8] */ ARM64("ldr x8, [x24, #8]");
    /* 0x00993840: ldr      x8, [x8, #0x120] */ ARM64("ldr x8, [x8, #0x120]");
    /* 0x00993844: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00993848: ldr      x9, [sp, #0x18] */ ARM64("ldr x9, [sp, #0x18]");
    /* 0x0099384c: csel     x22, x9, x8, eq */ ARM64("csel x22, x9, x8, eq");
    /* 0x00993850: cbz      x22, #0x9939f4 */ if (x22 == 0) goto loc_009939f4;
loc_00993854:
    /* 0x00993854: orr      w2, w11, w12, lsl #8 */ ARM64("orr w2, w11, w12, lsl #8");
    /* 0x00993858: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x0099385c: mov      w1, #0x4004 */ ARM64("mov w1, #0x4004");
    /* 0x00993860: blr      x22 */ CALL_INDIRECT(x22);
    /* 0x00993864: ldr      w12, [sp, #0x10] */ ARM64("ldr w12, [sp, #0x10]");
    /* 0x00993868: mov      x11, x20 */ ARM64("mov x11, x20");
    /* 0x0099386c: str      x22, [sp, #0x18] */ ARM64("str x22, [sp, #0x18]");
loc_00993870:
    /* 0x00993870: mov      x22, x25 */ ARM64("mov x22, x25");
    /* 0x00993874: cmp      w12, #1 */ ARM64("cmp w12, #1");
    /* 0x00993878: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x0099387c: cmp      w11, #0x5a */ ARM64("cmp w11, #0x5a");
    /* 0x00993880: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00993884: ldr      w10, [sp, #0x4c] */ ARM64("ldr w10, [sp, #0x4c]");
    /* 0x00993888: cmp      w10, #0 */ ARM64("cmp w10, #0");
    /* 0x0099388c: csel     w8, w9, w8, ne */ ARM64("csel w8, w9, w8, ne");
    /* 0x00993890: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00993894: b.ne     #0x9938cc */ if (COND_NE) goto loc_009938cc;
    /* 0x00993898: str      w11, [x19, #0x1bc] */ ARM64("str w11, [x19, #0x1bc]");
    /* 0x0099389c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x009938a0: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x009938a4: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x009938a8: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x009938ac: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
    /* 0x009938b0: ldr      w8, [x19, #0xcd8] */ ARM64("ldr w8, [x19, #0xcd8]");
    /* 0x009938b4: add      w8, w8, #1 */ ARM64("add w8, w8, #1");
    /* 0x009938b8: str      w8, [x19, #0xcd8] */ ARM64("str w8, [x19, #0xcd8]");
    /* 0x009938bc: cmp      w8, #5 */ ARM64("cmp w8, #5");
    /* 0x009938c0: mov      x11, x20 */ ARM64("mov x11, x20");
    /* 0x009938c4: ldr      w12, [sp, #0x10] */ ARM64("ldr w12, [sp, #0x10]");
    /* 0x009938c8: b.eq     #0x993d34 */ if (COND_EQ) goto loc_00993d34;
loc_009938cc:
    /* 0x009938cc: cmp      w11, #0x5a */ ARM64("cmp w11, #0x5a");
    /* 0x009938d0: ldr      w8, [sp, #0x4c] */ ARM64("ldr w8, [sp, #0x4c]");
    /* 0x009938d4: csel     w8, wzr, w8, ne */ ARM64("csel w8, wzr, w8, ne");
    /* 0x009938d8: tbnz     w8, #0, #0x99347c */ if (((w8 >> #0) & 1) != 0) goto loc_0099347c;
    /* 0x009938dc: cbz      w11, #0x993d0c */ if (w11 == 0) goto loc_00993d0c;
    /* 0x009938e0: cmp      w12, #2 */ ARM64("cmp w12, #2");
    /* 0x009938e4: ldr      w8, [sp, #0x4c] */ ARM64("ldr w8, [sp, #0x4c]");
    /* 0x009938e8: csinc    w8, w8, wzr, ne */ ARM64("csinc w8, w8, wzr, ne");
    /* 0x009938ec: tbnz     w8, #0, #0x993db0 */ if (((w8 >> #0) & 1) != 0) goto loc_00993db0;
    /* 0x009938f0: cmp      w11, #0x64 */ ARM64("cmp w11, #0x64");
    /* 0x009938f4: b.eq     #0x993d60 */ if (COND_EQ) goto loc_00993d60;
    /* 0x009938f8: cmp      w12, #1 */ ARM64("cmp w12, #1");
    /* 0x009938fc: b.eq     #0x99347c */ if (COND_EQ) goto loc_0099347c;
    /* 0x00993900: b        #0x993e30 */ goto loc_00993e30;
loc_00993904:
    /* 0x00993904: cmp      w26, #0x16 */ ARM64("cmp w26, #0x16");
    /* 0x00993908: b.ne     #0x993920 */ if (COND_NE) goto loc_00993920;
loc_0099390c:
    /* 0x0099390c: ldrb     w8, [x28, #0xc] */ ARM64("ldrb w8, [x28, #0xc]");
    /* 0x00993910: cmp      w8, #0x14 */ ARM64("cmp w8, #0x14");
    /* 0x00993914: b.ne     #0x993920 */ if (COND_NE) goto loc_00993920;
    /* 0x00993918: ldr      x8, [x19, #0xcb8] */ ARM64("ldr x8, [x19, #0xcb8]");
    /* 0x0099391c: cbnz     x8, #0x993d8c */ if (x8 != 0) goto loc_00993d8c;
loc_00993920:
    /* 0x00993920: cbz      x25, #0x99392c */ if (x25 == 0) goto loc_0099392c;
    /* 0x00993924: ldrb     w8, [x28, #0xc] */ ARM64("ldrb w8, [x28, #0xc]");
    /* 0x00993928: strb     w8, [x25] */ ARM64("strb w8, [x25]");
loc_0099392c:
    /* 0x0099392c: ldr      x8, [sp, #0x38] */ ARM64("ldr x8, [sp, #0x38]");
    /* 0x00993930: cbz      x8, #0x993c54 */ if (x8 == 0) goto loc_00993c54;
    /* 0x00993934: str      x22, [sp, #0x10] */ ARM64("str x22, [sp, #0x10]");
    /* 0x00993938: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x0099393c: ldr      x22, [x19, #0xd10] */ ARM64("ldr x22, [x19, #0xd10]");
    /* 0x00993940: ldr      x9, [sp, #0x38] */ ARM64("ldr x9, [sp, #0x38]");
    /* 0x00993944: ldr      w24, [sp, #0x34] */ ARM64("ldr w24, [sp, #0x34]");
loc_00993948:
    /* 0x00993948: sub      x8, x9, x25 */ ARM64("sub x8, x9, x25");
    /* 0x0099394c: ldp      x9, x10, [x28, #0x20] */ ARM64("ldp x9, x10, [x28, #0x20]");
    /* 0x00993950: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00993954: csel     x20, x8, x9, lo */ ARM64("csel x20, x8, x9, lo");
    /* 0x00993958: ldr      x8, [x28, #0x10] */ ARM64("ldr x8, [x28, #0x10]");
    /* 0x0099395c: add      x1, x8, x10 */ ARM64("add x1, x8, x10");
    /* 0x00993960: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00993964: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00993968: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x0099396c: cbz      w24, #0x993988 */ if (w24 == 0) goto loc_00993988;
    /* 0x00993970: ldr      x8, [x28, #0x20] */ ARM64("ldr x8, [x28, #0x20]");
    /* 0x00993974: cbnz     x8, #0x99399c */ if (x8 != 0) goto loc_0099399c;
    /* 0x00993978: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0099397c: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993980: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00993984: b        #0x993994 */ goto loc_00993994;
loc_00993988:
    /* 0x00993988: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x0099398c: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993990: mov      x2, x20 */ ARM64("mov x2, x20");
loc_00993994:
    /* 0x00993994: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993998: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
loc_0099399c:
    /* 0x0099399c: add      x23, x23, x20 */ ARM64("add x23, x23, x20");
    /* 0x009939a0: add      x25, x20, x25 */ ARM64("add x25, x20, x25");
    /* 0x009939a4: cmp      w26, #0x17 */ ARM64("cmp w26, #0x17");
    /* 0x009939a8: ldr      x9, [sp, #0x38] */ ARM64("ldr x9, [sp, #0x38]");
    /* 0x009939ac: ldr      w24, [sp, #0x34] */ ARM64("ldr w24, [sp, #0x34]");
    /* 0x009939b0: b.ne     #0x9939e4 */ if (COND_NE) goto loc_009939e4;
    /* 0x009939b4: cmp      w24, #0 */ ARM64("cmp w24, #0");
    /* 0x009939b8: ldr      x8, [x28, #0x20] */ ARM64("ldr x8, [x28, #0x20]");
    /* 0x009939bc: ccmp     x20, x8, #0, ne */ ARM64("ccmp x20, x8, #0, ne");
    /* 0x009939c0: ccmp     x8, #0, #4, ne */ ARM64("ccmp x8, #0, #4, ne");
    /* 0x009939c4: cinc     x22, x22, eq */ ARM64("cinc x22, x22, eq");
    /* 0x009939c8: mov      w8, #0x40 */ ARM64("mov w8, #0x40");
    /* 0x009939cc: csel     x8, x8, xzr, eq */ ARM64("csel x8, x8, xzr, eq");
    /* 0x009939d0: add      x28, x28, x8 */ ARM64("add x28, x28, x8");
    /* 0x009939d4: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x009939d8: cmp      x25, x9 */ ARM64("cmp x25, x9");
    /* 0x009939dc: ccmp     x22, x8, #2, lo */ ARM64("ccmp x22, x8, #2, lo");
    /* 0x009939e0: b.lo     #0x993948 */ if (COND_LO) goto loc_00993948;
loc_009939e4:
    /* 0x009939e4: ldr      x22, [sp, #0x10] */ ARM64("ldr x22, [sp, #0x10]");
    /* 0x009939e8: ldr      x24, [sp, #0x40] */ ARM64("ldr x24, [sp, #0x40]");
    /* 0x009939ec: cbz      x25, #0x99347c */ if (x25 == 0) goto loc_0099347c;
    /* 0x009939f0: b        #0x993c78 */ goto loc_00993c78;
loc_009939f4:
    /* 0x009939f4: str      xzr, [sp, #0x18] */ ARM64("str xzr, [sp, #0x18]");
    /* 0x009939f8: b        #0x993870 */ goto loc_00993870;
loc_009939fc:
    /* 0x009939fc: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x00993a00: b        #0x9933c8 */ goto loc_009933c8;
loc_00993a04:
    /* 0x00993a04: ldr      x0, [sp, #0x40] */ ARM64("ldr x0, [sp, #0x40]");
    /* 0x00993a08: bl       #0x9a5694 */ CALL_DIRECT(sub_009a5694);
    /* 0x00993a0c: cbz      w0, #0x993458 */ if (w0 == 0) goto loc_00993458;
    /* 0x00993a10: ldr      x8, [x19, #0x70] */ ARM64("ldr x8, [x19, #0x70]");
    /* 0x00993a14: ldr      x0, [sp, #0x40] */ ARM64("ldr x0, [sp, #0x40]");
    /* 0x00993a18: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00993a1c: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x00993a20: tbnz     w0, #0x1f, #0x9933c8 */ if (((w0 >> #0x1f) & 1) != 0) goto loc_009933c8;
    /* 0x00993a24: cbnz     w20, #0x993458 */ if (w20 != 0) goto loc_00993458;
    /* 0x00993a28: b        #0x9933c4 */ goto loc_009933c4;
loc_00993a2c:
    /* 0x00993a2c: mov      x9, x8 */ ARM64("mov x9, x8");
loc_00993a30:
    /* 0x00993a30: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00993a34: mov      w11, #1 */ ARM64("mov w11, #1");
loc_00993a38:
    /* 0x00993a38: ldrb     w12, [x9], #1 */ ARM64("ldrb w12, [x9], #1");
    /* 0x00993a3c: strb     w12, [x8, x10] */ ARM64("strb w12, [x8, x10]");
    /* 0x00993a40: mov      w10, w11 */ ARM64("mov w10, w11");
    /* 0x00993a44: ldr      x12, [x19, #0xcb8] */ ARM64("ldr x12, [x19, #0xcb8]");
    /* 0x00993a48: add      w11, w11, #1 */ ARM64("add w11, w11, #1");
    /* 0x00993a4c: cmp      x12, x10 */ ARM64("cmp x12, x10");
    /* 0x00993a50: b.hi     #0x993a38 */ if (COND_HI) goto loc_00993a38;
loc_00993a54:
    /* 0x00993a54: mov      x9, x4 */ ARM64("mov x9, x4");
loc_00993a58:
    /* 0x00993a58: cbz      x2, #0x993a64 */ if (x2 == 0) goto loc_00993a64;
    /* 0x00993a5c: mov      w8, #0x16 */ ARM64("mov w8, #0x16");
    /* 0x00993a60: strb     w8, [x2] */ ARM64("strb w8, [x2]");
loc_00993a64:
    /* 0x00993a64: str      x9, [x22] */ ARM64("str x9, [x22]");
    /* 0x00993a68: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00993a6c: b        #0x9933c8 */ goto loc_009933c8;
loc_00993a70:
    /* 0x00993a70: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993a74: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993a78: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993a7c: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993a80: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993a84: mov      w1, #0x2e0 */ ARM64("mov w1, #0x2e0");
    /* 0x00993a88: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993a8c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993a90: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993a94: mov      w2, #0x91 */ ARM64("mov w2, #0x91");
    /* 0x00993a98: b        #0x9933bc */ goto loc_009933bc;
loc_00993a9c:
    /* 0x00993a9c: sub      w8, w9, #0x14 */ ARM64("sub w8, w9, #0x14");
    /* 0x00993aa0: cmp      w8, #3 */ ARM64("cmp w8, #3");
    /* 0x00993aa4: b.hs     #0x993ba8 */ if (COND_HS) goto loc_00993ba8;
    /* 0x00993aa8: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993aac: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993ab0: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993ab4: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993ab8: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993abc: mov      w1, #0x43f */ ARM64("mov w1, #0x43f");
    /* 0x00993ac0: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993ac4: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993ac8: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993acc: b        #0x9933b4 */ goto loc_009933b4;
loc_00993ad0:
    /* 0x00993ad0: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00993ad4: add      x8, x10, #1 */ ARM64("add x8, x10, #1");
    /* 0x00993ad8: str      x8, [x19, #0xd10] */ ARM64("str x8, [x19, #0xd10]");
    /* 0x00993adc: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00993ae0: str      w8, [x19, #0x68] */ ARM64("str w8, [x19, #0x68]");
    /* 0x00993ae4: b        #0x9933c8 */ goto loc_009933c8;
loc_00993ae8:
    /* 0x00993ae8: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993aec: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993af0: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993af4: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993af8: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993afc: mov      w1, #0x34a */ ARM64("mov w1, #0x34a");
    /* 0x00993b00: b        #0x9933a8 */ goto loc_009933a8;
loc_00993b04:
    /* 0x00993b04: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993b08: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993b0c: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00993b10: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993b14: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
    /* 0x00993b18: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993b1c: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993b20: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993b24: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993b28: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993b2c: mov      w1, #0x3d5 */ ARM64("mov w1, #0x3d5");
    /* 0x00993b30: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993b34: mov      w20, #-1 */ ARM64("mov w20, #-1");
    /* 0x00993b38: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993b3c: mov      w1, #-1 */ ARM64("mov w1, #-1");
    /* 0x00993b40: mov      w2, #0x123 */ ARM64("mov w2, #0x123");
    /* 0x00993b44: mov      x3, #0 */ ARM64("mov x3, #0");
    /* 0x00993b48: bl       #0x9a58a4 */ CALL_DIRECT(sub_009a58a4);
    /* 0x00993b4c: b        #0x9933c8 */ goto loc_009933c8;
loc_00993b50:
    /* 0x00993b50: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993b54: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993b58: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993b5c: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993b60: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993b64: mov      w1, #0x3fa */ ARM64("mov w1, #0x3fa");
loc_00993b68:
    /* 0x00993b68: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993b6c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993b70: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993b74: mov      w2, #0x85 */ ARM64("mov w2, #0x85");
    /* 0x00993b78: b        #0x9933bc */ goto loc_009933bc;
loc_00993b7c:
    /* 0x00993b7c: mov      w8, #3 */ ARM64("mov w8, #3");
    /* 0x00993b80: str      w8, [x19, #0x68] */ ARM64("str w8, [x19, #0x68]");
    /* 0x00993b84: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00993b88: bl       #0x95f850 */ CALL_DIRECT(sub_0095f850);
    /* 0x00993b8c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00993b90: mov      w1, #0xf */ ARM64("mov w1, #0xf");
    /* 0x00993b94: bl       #0x9d3d58 */ CALL_DIRECT(sub_009d3d58);
    /* 0x00993b98: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993b9c: mov      w1, #9 */ ARM64("mov w1, #9");
    /* 0x00993ba0: bl       #0x9d3d74 */ CALL_DIRECT(sub_009d3d74);
    /* 0x00993ba4: b        #0x9933c4 */ goto loc_009933c4;
loc_00993ba8:
    /* 0x00993ba8: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993bac: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993bb0: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993bb4: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993bb8: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993bbc: mov      w1, #0x435 */ ARM64("mov w1, #0x435");
    /* 0x00993bc0: b        #0x993be8 */ goto loc_00993be8;
loc_00993bc4:
    /* 0x00993bc4: mov      w8, #2 */ ARM64("mov w8, #2");
    /* 0x00993bc8: str      w8, [x19, #0x1d8] */ ARM64("str w8, [x19, #0x1d8]");
    /* 0x00993bcc: b        #0x9933c4 */ goto loc_009933c4;
loc_00993bd0:
    /* 0x00993bd0: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993bd4: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993bd8: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993bdc: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993be0: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993be4: mov      w1, #0x45f */ ARM64("mov w1, #0x45f");
loc_00993be8:
    /* 0x00993be8: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993bec: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993bf0: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993bf4: mov      w2, #0xf5 */ ARM64("mov w2, #0xf5");
    /* 0x00993bf8: b        #0x9933bc */ goto loc_009933bc;
loc_00993bfc:
    /* 0x00993bfc: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993c00: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993c04: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993c08: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993c0c: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993c10: mov      w1, #0x2cf */ ARM64("mov w1, #0x2cf");
    /* 0x00993c14: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993c18: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993c1c: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993c20: mov      w2, #0x125 */ ARM64("mov w2, #0x125");
    /* 0x00993c24: b        #0x9933bc */ goto loc_009933bc;
loc_00993c28:
    /* 0x00993c28: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993c2c: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993c30: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993c34: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993c38: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993c3c: mov      w1, #0x369 */ ARM64("mov w1, #0x369");
    /* 0x00993c40: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993c44: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993c48: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993c4c: mov      w2, #0xcd */ ARM64("mov w2, #0xcd");
    /* 0x00993c50: b        #0x9933bc */ goto loc_009933bc;
loc_00993c54:
    /* 0x00993c54: ldr      x8, [x28, #0x20] */ ARM64("ldr x8, [x28, #0x20]");
    /* 0x00993c58: cbnz     x8, #0x993c70 */ if (x8 != 0) goto loc_00993c70;
    /* 0x00993c5c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993c60: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993c64: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00993c68: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993c6c: cbz      w0, #0x9933c4 */ if (w0 == 0) goto loc_009933c4;
loc_00993c70:
    /* 0x00993c70: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00993c74: b        #0x9933c8 */ goto loc_009933c8;
loc_00993c78:
    /* 0x00993c78: str      x25, [x22] */ ARM64("str x25, [x22]");
    /* 0x00993c7c: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00993c80: b        #0x9933c8 */ goto loc_009933c8;
loc_00993c84:
    /* 0x00993c84: mov      w8, #3 */ ARM64("mov w8, #3");
    /* 0x00993c88: str      w8, [x19, #0x68] */ ARM64("str w8, [x19, #0x68]");
    /* 0x00993c8c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00993c90: bl       #0x95f850 */ CALL_DIRECT(sub_0095f850);
    /* 0x00993c94: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00993c98: mov      w1, #0xf */ ARM64("mov w1, #0xf");
    /* 0x00993c9c: bl       #0x9d3d58 */ CALL_DIRECT(sub_009d3d58);
    /* 0x00993ca0: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993ca4: mov      w1, #9 */ ARM64("mov w1, #9");
    /* 0x00993ca8: bl       #0x9d3d74 */ CALL_DIRECT(sub_009d3d74);
    /* 0x00993cac: b        #0x9933c8 */ goto loc_009933c8;
loc_00993cb0:
    /* 0x00993cb0: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993cb4: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993cb8: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993cbc: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993cc0: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993cc4: mov      w1, #0x2fd */ ARM64("mov w1, #0x2fd");
    /* 0x00993cc8: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993ccc: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993cd0: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993cd4: mov      w2, #0x64 */ ARM64("mov w2, #0x64");
    /* 0x00993cd8: b        #0x9933bc */ goto loc_009933bc;
loc_00993cdc:
    /* 0x00993cdc: str      w10, [x19, #0x48] */ ARM64("str w10, [x19, #0x48]");
    /* 0x00993ce0: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993ce4: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993ce8: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993cec: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993cf0: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993cf4: mov      w1, #0x357 */ ARM64("mov w1, #0x357");
    /* 0x00993cf8: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993cfc: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993d00: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993d04: mov      w2, #0xf4 */ ARM64("mov w2, #0xf4");
    /* 0x00993d08: b        #0x9933bc */ goto loc_009933bc;
loc_00993d0c:
    /* 0x00993d0c: cmp      w12, #1 */ ARM64("cmp w12, #1");
    /* 0x00993d10: ldr      w8, [sp, #0x4c] */ ARM64("ldr w8, [sp, #0x4c]");
    /* 0x00993d14: csinc    w8, w8, wzr, ne */ ARM64("csinc w8, w8, wzr, ne");
    /* 0x00993d18: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00993d1c: b.ne     #0x993da8 */ if (COND_NE) goto loc_00993da8;
    /* 0x00993d20: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00993d24: ldr      w8, [x19, #0x84] */ ARM64("ldr w8, [x19, #0x84]");
    /* 0x00993d28: orr      w8, w8, #2 */ ARM64("orr w8, w8, #2");
    /* 0x00993d2c: str      w8, [x19, #0x84] */ ARM64("str w8, [x19, #0x84]");
    /* 0x00993d30: b        #0x9933c8 */ goto loc_009933c8;
loc_00993d34:
    /* 0x00993d34: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993d38: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993d3c: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993d40: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993d44: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993d48: mov      w1, #0x384 */ ARM64("mov w1, #0x384");
    /* 0x00993d4c: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993d50: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993d54: mov      w1, #0xa */ ARM64("mov w1, #0xa");
    /* 0x00993d58: mov      w2, #0x199 */ ARM64("mov w2, #0x199");
    /* 0x00993d5c: b        #0x9933bc */ goto loc_009933bc;
loc_00993d60:
    /* 0x00993d60: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993d64: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993d68: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993d6c: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993d70: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993d74: mov      w1, #0x3a7 */ ARM64("mov w1, #0x3a7");
    /* 0x00993d78: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993d7c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993d80: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00993d84: mov      w2, #0x153 */ ARM64("mov w2, #0x153");
    /* 0x00993d88: b        #0x9933bc */ goto loc_009933bc;
loc_00993d8c:
    /* 0x00993d8c: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993d90: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993d94: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993d98: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993d9c: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993da0: mov      w1, #0x304 */ ARM64("mov w1, #0x304");
    /* 0x00993da4: b        #0x993b68 */ goto loc_00993b68;
loc_00993da8:
    /* 0x00993da8: cmp      w12, #2 */ ARM64("cmp w12, #2");
    /* 0x00993dac: b.ne     #0x993e30 */ if (COND_NE) goto loc_00993e30;
loc_00993db0:
    /* 0x00993db0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00993db4: str      w8, [x19, #0x68] */ ARM64("str w8, [x19, #0x68]");
    /* 0x00993db8: str      w11, [x19, #0x1c0] */ ARM64("str w11, [x19, #0x1c0]");
    /* 0x00993dbc: mov      x21, x11 */ ARM64("mov x21, x11");
    /* 0x00993dc0: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993dc4: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993dc8: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993dcc: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993dd0: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993dd4: mov      w1, #0x396 */ ARM64("mov w1, #0x396");
    /* 0x00993dd8: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993ddc: adrp     x3, #0xc89000 */ ARM64("adrp x3, #0xc89000");
    /* 0x00993de0: add      x3, x3, #0x754 */ ARM64("add x3, x3, #0x754");
    /* 0x00993de4: str      x21, [sp] */ ARM64("str x21, [sp]");
    /* 0x00993de8: mov      w20, #-1 */ ARM64("mov w20, #-1");
    /* 0x00993dec: add      w2, w21, #0x3e8 */ ARM64("add w2, w21, #0x3e8");
    /* 0x00993df0: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993df4: mov      w1, #-1 */ ARM64("mov w1, #-1");
    /* 0x00993df8: bl       #0x9a58a4 */ CALL_DIRECT(sub_009a58a4);
    /* 0x00993dfc: ldr      w8, [x19, #0x84] */ ARM64("ldr w8, [x19, #0x84]");
    /* 0x00993e00: orr      w8, w8, #2 */ ARM64("orr w8, w8, #2");
    /* 0x00993e04: str      w8, [x19, #0x84] */ ARM64("str w8, [x19, #0x84]");
    /* 0x00993e08: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993e0c: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00993e10: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00993e14: bl       #0x991f74 */ CALL_DIRECT(sub_00991f74);
    /* 0x00993e18: cbz      w0, #0x9933c8 */ if (w0 == 0) goto loc_009933c8;
    /* 0x00993e1c: ldr      x0, [x19, #0xb88] */ ARM64("ldr x0, [x19, #0xb88]");
    /* 0x00993e20: ldr      x1, [x19, #0x900] */ ARM64("ldr x1, [x19, #0x900]");
    /* 0x00993e24: bl       #0x966abc */ CALL_DIRECT(sub_00966abc);
    /* 0x00993e28: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00993e2c: b        #0x9933c8 */ goto loc_009933c8;
loc_00993e30:
    /* 0x00993e30: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00993e34: adrp     x0, #0xc89000 */ ARM64("adrp x0, #0xc89000");
    /* 0x00993e38: add      x0, x0, #0x79c */ ARM64("add x0, x0, #0x79c");
    /* 0x00993e3c: adrp     x2, #0xc89000 */ ARM64("adrp x2, #0xc89000");
    /* 0x00993e40: add      x2, x2, #0x7c7 */ ARM64("add x2, x2, #0x7c7");
    /* 0x00993e44: mov      w1, #0x3ae */ ARM64("mov w1, #0x3ae");
    /* 0x00993e48: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00993e4c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00993e50: mov      w1, #0x2f */ ARM64("mov w1, #0x2f");
    /* 0x00993e54: mov      w2, #0xf6 */ ARM64("mov w2, #0xf6");
    /* 0x00993e58: b        #0x9933bc */ goto loc_009933bc;
}
