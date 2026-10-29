/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xa4238c..0xa42900 (1396 bytes). */
#include "../lift_runtime.hpp"

void sub_00a4238c(Arm64Context& cpu) {
    /* 0x00a4238c: stp      x24, x23, [sp, #-0x40]! */ ARM64("stp x24, x23, [sp, #-0x40]!");
    /* 0x00a42390: stp      x22, x21, [sp, #0x10] */ ARM64("stp x22, x21, [sp, #0x10]");
    /* 0x00a42394: stp      x20, x19, [sp, #0x20] */ ARM64("stp x20, x19, [sp, #0x20]");
    /* 0x00a42398: stp      x29, x30, [sp, #0x30] */ ARM64("stp x29, x30, [sp, #0x30]");
    /* 0x00a4239c: add      x29, sp, #0x30 */ ARM64("add x29, sp, #0x30");
    /* 0x00a423a0: mov      x19, x3 */ ARM64("mov x19, x3");
    /* 0x00a423a4: mov      x23, x2 */ ARM64("mov x23, x2");
    /* 0x00a423a8: mov      x22, x1 */ ARM64("mov x22, x1");
    /* 0x00a423ac: mov      x24, x0 */ ARM64("mov x24, x0");
    /* 0x00a423b0: bl       #0x9ffdd8 */ CALL_DIRECT(sub_009ffdd8);
    /* 0x00a423b4: ldr      w8, [x0, #0xf8] */ ARM64("ldr w8, [x0, #0xf8]");
    /* 0x00a423b8: cbz      w8, #0xa428b4 */ if (w8 == 0) goto loc_00a428b4;
    /* 0x00a423bc: ldr      w8, [x0, #0x2d8] */ ARM64("ldr w8, [x0, #0x2d8]");
    /* 0x00a423c0: tbnz     w8, #0x1f, #0xa42430 */ if (((w8 >> #0x1f) & 1) != 0) goto loc_00a42430;
    /* 0x00a423c4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a423c8: bl       #0x9ffdd8 */ CALL_DIRECT(sub_009ffdd8);
    /* 0x00a423cc: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x00a423d0: mov      w0, #-1 */ ARM64("mov w0, #-1");
    /* 0x00a423d4: cmp      x22, x23 */ ARM64("cmp x22, x23");
    /* 0x00a423d8: b.ne     #0xa428b8 */ if (COND_NE) goto loc_00a428b8;
    /* 0x00a423dc: subs     x21, x19, #0x18 */ ARM64("subs x21, x19, #0x18");
    /* 0x00a423e0: b.lo     #0xa428b8 */ if (COND_LO) goto loc_00a428b8;
    /* 0x00a423e4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a423e8: bl       #0xa50720 */ CALL_DIRECT(sub_00a50720);
    /* 0x00a423ec: cbz      w0, #0xa424b8 */ if (w0 == 0) goto loc_00a424b8;
    /* 0x00a423f0: ldr      x8, [x20, #0x2e0] */ ARM64("ldr x8, [x20, #0x2e0]");
    /* 0x00a423f4: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00a423f8: str      x8, [x20, #0x2e0] */ ARM64("str x8, [x20, #0x2e0]");
    /* 0x00a423fc: b.lo     #0xa424b8 */ if (COND_LO) goto loc_00a424b8;
    /* 0x00a42400: bl       #0xa368c8 */ CALL_DIRECT(sub_00a368c8);
    /* 0x00a42404: adrp     x0, #0xc95000 */ ARM64("adrp x0, #0xc95000");
    /* 0x00a42408: add      x0, x0, #0xdd */ ARM64("add x0, x0, #0xdd");
    /* 0x00a4240c: adrp     x2, #0xc95000 */ ARM64("adrp x2, #0xc95000");
    /* 0x00a42410: add      x2, x2, #0x10e */ ARM64("add x2, x2, #0x10e");
    /* 0x00a42414: mov      w1, #0xb53 */ ARM64("mov w1, #0xb53");
    /* 0x00a42418: bl       #0xa369bc */ CALL_DIRECT(sub_00a369bc);
    /* 0x00a4241c: mov      w0, #6 */ ARM64("mov w0, #6");
    /* 0x00a42420: mov      w1, #0xb7 */ ARM64("mov w1, #0xb7");
    /* 0x00a42424: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00a42428: bl       #0xa36abc */ CALL_DIRECT(sub_00a36abc);
    /* 0x00a4242c: b        #0xa42504 */ goto loc_00a42504;
loc_00a42430:
    /* 0x00a42430: ldr      w8, [x0, #0xfc] */ ARM64("ldr w8, [x0, #0xfc]");
    /* 0x00a42434: cbz      w8, #0xa428b4 */ if (w8 == 0) goto loc_00a428b4;
    /* 0x00a42438: cbz      x23, #0xa42518 */ if (x23 == 0) goto loc_00a42518;
    /* 0x00a4243c: cbz      x22, #0xa42554 */ if (x22 == 0) goto loc_00a42554;
    /* 0x00a42440: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00a42444: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a42448: bl       #0xa50720 */ CALL_DIRECT(sub_00a50720);
    /* 0x00a4244c: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00a42450: ldr      x4, [x21, #0x2e8] */ ARM64("ldr x4, [x21, #0x2e8]");
    /* 0x00a42454: cbz      w0, #0xa425e4 */ if (w0 == 0) goto loc_00a425e4;
    /* 0x00a42458: cbz      x4, #0xa4266c */ if (x4 == 0) goto loc_00a4266c;
    /* 0x00a4245c: cmp      x19, #0x20 */ ARM64("cmp x19, #0x20");
    /* 0x00a42460: b.lo     #0xa42498 */ if (COND_LO) goto loc_00a42498;
    /* 0x00a42464: adrp     x9, #0x9ba000 */ ARM64("adrp x9, #0x9ba000");
    /* 0x00a42468: add      x9, x9, #0x8c0 */ ARM64("add x9, x9, #0x8c0");
    /* 0x00a4246c: cmp      x4, x9 */ ARM64("cmp x4, x9");
    /* 0x00a42470: b.eq     #0xa42484 */ if (COND_EQ) goto loc_00a42484;
    /* 0x00a42474: adrp     x9, #0x9bb000 */ ARM64("adrp x9, #0x9bb000");
    /* 0x00a42478: add      x9, x9, #0x300 */ ARM64("add x9, x9, #0x300");
    /* 0x00a4247c: cmp      x4, x9 */ ARM64("cmp x4, x9");
    /* 0x00a42480: b.ne     #0xa42498 */ if (COND_NE) goto loc_00a42498;
loc_00a42484:
    /* 0x00a42484: ldr      x9, [x8, #0x268] */ ARM64("ldr x9, [x8, #0x268]");
    /* 0x00a42488: adrp     x10, #0xa96000 */ ARM64("adrp x10, #0xa96000");
    /* 0x00a4248c: add      x10, x10, #0x3b0 */ ARM64("add x10, x10, #0x3b0");
    /* 0x00a42490: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00a42494: b.eq     #0xa42790 */ if (COND_EQ) goto loc_00a42790;
loc_00a42498:
    /* 0x00a42498: mov      x9, #0 */ ARM64("mov x9, #0");
loc_00a4249c:
    /* 0x00a4249c: sub      x3, x19, x9 */ ARM64("sub x3, x19, x9");
    /* 0x00a424a0: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a424a4: add      x1, x23, x9 */ ARM64("add x1, x23, x9");
    /* 0x00a424a8: add      x2, x22, x9 */ ARM64("add x2, x22, x9");
    /* 0x00a424ac: bl       #0xa956a0 */ CALL_DIRECT(sub_00a956a0);
    /* 0x00a424b0: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a424b4: b        #0xa42700 */ goto loc_00a42700;
loc_00a424b8:
    /* 0x00a424b8: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a424bc: bl       #0xa50720 */ CALL_DIRECT(sub_00a50720);
    /* 0x00a424c0: cmp      w0, #0 */ ARM64("cmp w0, #0");
    /* 0x00a424c4: mov      w8, #0x13 */ ARM64("mov w8, #0x13");
    /* 0x00a424c8: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00a424cc: csel     w1, w9, w8, eq */ ARM64("csel w1, w9, w8, eq");
    /* 0x00a424d0: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a424d4: mov      w2, #8 */ ARM64("mov w2, #8");
    /* 0x00a424d8: mov      x3, x22 */ ARM64("mov x3, x22");
    /* 0x00a424dc: bl       #0xa4d5dc */ CALL_DIRECT(sub_00a4d5dc);
    /* 0x00a424e0: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x00a424e4: b.lt     #0xa42504 */ if (COND_LT) goto loc_00a42504;
    /* 0x00a424e8: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a424ec: bl       #0xa507c8 */ CALL_DIRECT(sub_00a507c8);
    /* 0x00a424f0: mov      x1, x0 */ ARM64("mov x1, x0");
    /* 0x00a424f4: ldrsw    x2, [x20, #0x2d8] */ ARM64("ldrsw x2, [x20, #0x2d8]");
    /* 0x00a424f8: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a424fc: bl       #0xa94dd8 */ CALL_DIRECT(sub_00a94dd8);
    /* 0x00a42500: cbz      w0, #0xa4256c */ if (w0 == 0) goto loc_00a4256c;
loc_00a42504:
    /* 0x00a42504: mov      w0, #-1 */ ARM64("mov w0, #-1");
loc_00a42508:
    /* 0x00a42508: str      wzr, [x20, #0xfc] */ ARM64("str wzr, [x20, #0xfc]");
    /* 0x00a4250c: mov      w8, #-1 */ ARM64("mov w8, #-1");
    /* 0x00a42510: str      w8, [x20, #0x2d8] */ ARM64("str w8, [x20, #0x2d8]");
    /* 0x00a42514: b        #0xa428b8 */ goto loc_00a428b8;
loc_00a42518:
    /* 0x00a42518: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00a4251c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a42520: bl       #0xa50720 */ CALL_DIRECT(sub_00a50720);
    /* 0x00a42524: cbz      w0, #0xa42644 */ if (w0 == 0) goto loc_00a42644;
    /* 0x00a42528: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a4252c: bl       #0xa507c8 */ CALL_DIRECT(sub_00a507c8);
    /* 0x00a42530: mov      x1, x0 */ ARM64("mov x1, x0");
    /* 0x00a42534: mov      w20, #0x10 */ ARM64("mov w20, #0x10");
    /* 0x00a42538: add      x0, x19, #0x100 */ ARM64("add x0, x19, #0x100");
    /* 0x00a4253c: mov      w2, #0x10 */ ARM64("mov w2, #0x10");
    /* 0x00a42540: bl       #0xa95e44 */ CALL_DIRECT(sub_00a95e44);
    /* 0x00a42544: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x00a42548: str      w20, [x19, #0x2cc] */ ARM64("str w20, [x19, #0x2cc]");
loc_00a4254c:
    /* 0x00a4254c: str      wzr, [x19, #0xfc] */ ARM64("str wzr, [x19, #0xfc]");
    /* 0x00a42550: b        #0xa428b8 */ goto loc_00a428b8;
loc_00a42554:
    /* 0x00a42554: add      x0, x0, #0x100 */ ARM64("add x0, x0, #0x100");
    /* 0x00a42558: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a4255c: mov      x2, x19 */ ARM64("mov x2, x19");
    /* 0x00a42560: bl       #0xa94dd8 */ CALL_DIRECT(sub_00a94dd8);
    /* 0x00a42564: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42568: b        #0xa42700 */ goto loc_00a42700;
loc_00a4256c:
    /* 0x00a4256c: add      x23, x23, #8 */ ARM64("add x23, x23, #8");
    /* 0x00a42570: add      x22, x22, #8 */ ARM64("add x22, x22, #8");
    /* 0x00a42574: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a42578: bl       #0xa50720 */ CALL_DIRECT(sub_00a50720);
    /* 0x00a4257c: ldr      x4, [x20, #0x2e8] */ ARM64("ldr x4, [x20, #0x2e8]");
    /* 0x00a42580: cbz      w0, #0xa42688 */ if (w0 == 0) goto loc_00a42688;
    /* 0x00a42584: cbz      x4, #0xa42708 */ if (x4 == 0) goto loc_00a42708;
    /* 0x00a42588: cmp      x21, #0x20 */ ARM64("cmp x21, #0x20");
    /* 0x00a4258c: b.lo     #0xa425c4 */ if (COND_LO) goto loc_00a425c4;
    /* 0x00a42590: adrp     x8, #0x9ba000 */ ARM64("adrp x8, #0x9ba000");
    /* 0x00a42594: add      x8, x8, #0x8c0 */ ARM64("add x8, x8, #0x8c0");
    /* 0x00a42598: cmp      x4, x8 */ ARM64("cmp x4, x8");
    /* 0x00a4259c: b.eq     #0xa425b0 */ if (COND_EQ) goto loc_00a425b0;
    /* 0x00a425a0: adrp     x8, #0x9bb000 */ ARM64("adrp x8, #0x9bb000");
    /* 0x00a425a4: add      x8, x8, #0x300 */ ARM64("add x8, x8, #0x300");
    /* 0x00a425a8: cmp      x4, x8 */ ARM64("cmp x4, x8");
    /* 0x00a425ac: b.ne     #0xa425c4 */ if (COND_NE) goto loc_00a425c4;
loc_00a425b0:
    /* 0x00a425b0: ldr      x8, [x20, #0x268] */ ARM64("ldr x8, [x20, #0x268]");
    /* 0x00a425b4: adrp     x9, #0xa96000 */ ARM64("adrp x9, #0xa96000");
    /* 0x00a425b8: add      x9, x9, #0x3b0 */ ARM64("add x9, x9, #0x3b0");
    /* 0x00a425bc: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00a425c0: b.eq     #0xa42850 */ if (COND_EQ) goto loc_00a42850;
loc_00a425c4:
    /* 0x00a425c4: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00a425c8:
    /* 0x00a425c8: sub      x3, x21, x8 */ ARM64("sub x3, x21, x8");
    /* 0x00a425cc: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a425d0: add      x1, x23, x8 */ ARM64("add x1, x23, x8");
    /* 0x00a425d4: add      x2, x22, x8 */ ARM64("add x2, x22, x8");
    /* 0x00a425d8: bl       #0xa956a0 */ CALL_DIRECT(sub_00a956a0);
    /* 0x00a425dc: cbnz     w0, #0xa42504 */ if (w0 != 0) goto loc_00a42504;
    /* 0x00a425e0: b        #0xa42720 */ goto loc_00a42720;
loc_00a425e4:
    /* 0x00a425e4: cbz      x4, #0xa426e8 */ if (x4 == 0) goto loc_00a426e8;
    /* 0x00a425e8: cmp      x19, #0x10 */ ARM64("cmp x19, #0x10");
    /* 0x00a425ec: b.lo     #0xa42624 */ if (COND_LO) goto loc_00a42624;
    /* 0x00a425f0: adrp     x9, #0x9ba000 */ ARM64("adrp x9, #0x9ba000");
    /* 0x00a425f4: add      x9, x9, #0x8c0 */ ARM64("add x9, x9, #0x8c0");
    /* 0x00a425f8: cmp      x4, x9 */ ARM64("cmp x4, x9");
    /* 0x00a425fc: b.eq     #0xa42610 */ if (COND_EQ) goto loc_00a42610;
    /* 0x00a42600: adrp     x9, #0x9bb000 */ ARM64("adrp x9, #0x9bb000");
    /* 0x00a42604: add      x9, x9, #0x300 */ ARM64("add x9, x9, #0x300");
    /* 0x00a42608: cmp      x4, x9 */ ARM64("cmp x4, x9");
    /* 0x00a4260c: b.ne     #0xa42624 */ if (COND_NE) goto loc_00a42624;
loc_00a42610:
    /* 0x00a42610: ldr      x9, [x8, #0x268] */ ARM64("ldr x9, [x8, #0x268]");
    /* 0x00a42614: adrp     x10, #0xa96000 */ ARM64("adrp x10, #0xa96000");
    /* 0x00a42618: add      x10, x10, #0x3b0 */ ARM64("add x10, x10, #0x3b0");
    /* 0x00a4261c: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00a42620: b.eq     #0xa427f4 */ if (COND_EQ) goto loc_00a427f4;
loc_00a42624:
    /* 0x00a42624: mov      x9, #0 */ ARM64("mov x9, #0");
loc_00a42628:
    /* 0x00a42628: sub      x3, x19, x9 */ ARM64("sub x3, x19, x9");
    /* 0x00a4262c: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a42630: add      x1, x23, x9 */ ARM64("add x1, x23, x9");
    /* 0x00a42634: add      x2, x22, x9 */ ARM64("add x2, x22, x9");
    /* 0x00a42638: bl       #0xa959d4 */ CALL_DIRECT(sub_00a959d4);
    /* 0x00a4263c: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42640: b        #0xa42700 */ goto loc_00a42700;
loc_00a42644:
    /* 0x00a42644: ldr      w9, [x19, #0x2cc] */ ARM64("ldr w9, [x19, #0x2cc]");
    /* 0x00a42648: tbnz     w9, #0x1f, #0xa428b4 */ if (((w9 >> #0x1f) & 1) != 0) goto loc_00a428b4;
    /* 0x00a4264c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a42650: bl       #0xa507c8 */ CALL_DIRECT(sub_00a507c8);
    /* 0x00a42654: mov      x1, x0 */ ARM64("mov x1, x0");
    /* 0x00a42658: ldrsw    x2, [x19, #0x2cc] */ ARM64("ldrsw x2, [x19, #0x2cc]");
    /* 0x00a4265c: add      x0, x19, #0x100 */ ARM64("add x0, x19, #0x100");
    /* 0x00a42660: bl       #0xa95d28 */ CALL_DIRECT(sub_00a95d28);
    /* 0x00a42664: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42668: b        #0xa4254c */ goto loc_00a4254c;
loc_00a4266c:
    /* 0x00a4266c: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a42670: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a42674: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a42678: mov      x3, x19 */ ARM64("mov x3, x19");
    /* 0x00a4267c: bl       #0xa94fe8 */ CALL_DIRECT(sub_00a94fe8);
    /* 0x00a42680: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42684: b        #0xa42700 */ goto loc_00a42700;
loc_00a42688:
    /* 0x00a42688: cbz      x4, #0xa42738 */ if (x4 == 0) goto loc_00a42738;
    /* 0x00a4268c: cmp      x21, #0x10 */ ARM64("cmp x21, #0x10");
    /* 0x00a42690: b.lo     #0xa426c8 */ if (COND_LO) goto loc_00a426c8;
    /* 0x00a42694: adrp     x8, #0x9ba000 */ ARM64("adrp x8, #0x9ba000");
    /* 0x00a42698: add      x8, x8, #0x8c0 */ ARM64("add x8, x8, #0x8c0");
    /* 0x00a4269c: cmp      x4, x8 */ ARM64("cmp x4, x8");
    /* 0x00a426a0: b.eq     #0xa426b4 */ if (COND_EQ) goto loc_00a426b4;
    /* 0x00a426a4: adrp     x8, #0x9bb000 */ ARM64("adrp x8, #0x9bb000");
    /* 0x00a426a8: add      x8, x8, #0x300 */ ARM64("add x8, x8, #0x300");
    /* 0x00a426ac: cmp      x4, x8 */ ARM64("cmp x4, x8");
    /* 0x00a426b0: b.ne     #0xa426c8 */ if (COND_NE) goto loc_00a426c8;
loc_00a426b4:
    /* 0x00a426b4: ldr      x8, [x20, #0x268] */ ARM64("ldr x8, [x20, #0x268]");
    /* 0x00a426b8: adrp     x9, #0xa96000 */ ARM64("adrp x9, #0xa96000");
    /* 0x00a426bc: add      x9, x9, #0x3b0 */ ARM64("add x9, x9, #0x3b0");
    /* 0x00a426c0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00a426c4: b.eq     #0xa4289c */ if (COND_EQ) goto loc_00a4289c;
loc_00a426c8:
    /* 0x00a426c8: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00a426cc:
    /* 0x00a426cc: sub      x3, x21, x8 */ ARM64("sub x3, x21, x8");
    /* 0x00a426d0: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a426d4: add      x1, x23, x8 */ ARM64("add x1, x23, x8");
    /* 0x00a426d8: add      x2, x22, x8 */ ARM64("add x2, x22, x8");
    /* 0x00a426dc: bl       #0xa959d4 */ CALL_DIRECT(sub_00a959d4);
    /* 0x00a426e0: cbnz     w0, #0xa42504 */ if (w0 != 0) goto loc_00a42504;
    /* 0x00a426e4: b        #0xa42750 */ goto loc_00a42750;
loc_00a426e8:
    /* 0x00a426e8: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a426ec: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a426f0: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a426f4: mov      x3, x19 */ ARM64("mov x3, x19");
    /* 0x00a426f8: bl       #0xa95348 */ CALL_DIRECT(sub_00a95348);
    /* 0x00a426fc: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
loc_00a42700:
    /* 0x00a42700: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00a42704: b        #0xa428b8 */ goto loc_00a428b8;
loc_00a42708:
    /* 0x00a42708: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a4270c: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a42710: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a42714: mov      x3, x21 */ ARM64("mov x3, x21");
    /* 0x00a42718: bl       #0xa94fe8 */ CALL_DIRECT(sub_00a94fe8);
    /* 0x00a4271c: cbnz     w0, #0xa42504 */ if (w0 != 0) goto loc_00a42504;
loc_00a42720:
    /* 0x00a42720: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a42724: add      x1, x22, x21 */ ARM64("add x1, x22, x21");
    /* 0x00a42728: mov      w2, #0x10 */ ARM64("mov w2, #0x10");
    /* 0x00a4272c: bl       #0xa95e44 */ CALL_DIRECT(sub_00a95e44);
    /* 0x00a42730: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00a42734: b        #0xa42508 */ goto loc_00a42508;
loc_00a42738:
    /* 0x00a42738: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a4273c: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a42740: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a42744: mov      x3, x21 */ ARM64("mov x3, x21");
    /* 0x00a42748: bl       #0xa95348 */ CALL_DIRECT(sub_00a95348);
    /* 0x00a4274c: cbnz     w0, #0xa42504 */ if (w0 != 0) goto loc_00a42504;
loc_00a42750:
    /* 0x00a42750: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a42754: bl       #0xa507c8 */ CALL_DIRECT(sub_00a507c8);
    /* 0x00a42758: mov      x1, x0 */ ARM64("mov x1, x0");
    /* 0x00a4275c: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a42760: mov      w2, #0x10 */ ARM64("mov w2, #0x10");
    /* 0x00a42764: bl       #0xa95e44 */ CALL_DIRECT(sub_00a95e44);
    /* 0x00a42768: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00a4276c: bl       #0xa507c8 */ CALL_DIRECT(sub_00a507c8);
    /* 0x00a42770: add      x1, x23, x21 */ ARM64("add x1, x23, x21");
    /* 0x00a42774: mov      w2, #0x10 */ ARM64("mov w2, #0x10");
    /* 0x00a42778: bl       #0xa66f20 */ CALL_DIRECT(sub_00a66f20);
    /* 0x00a4277c: cbz      w0, #0xa427ec */ if (w0 == 0) goto loc_00a427ec;
    /* 0x00a42780: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00a42784: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00a42788: bl       #0xa66ec0 */ CALL_DIRECT(sub_00a66ec0);
    /* 0x00a4278c: b        #0xa42504 */ goto loc_00a42504;
loc_00a42790:
    /* 0x00a42790: ldr      w9, [x8, #0x278] */ ARM64("ldr w9, [x8, #0x278]");
    /* 0x00a42794: neg      w9, w9 */ ARM64("neg w9, w9");
    /* 0x00a42798: and      w20, w9, #0xf */ ARM64("and w20, w9, #0xf");
    /* 0x00a4279c: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a427a0: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a427a4: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a427a8: mov      x3, x20 */ ARM64("mov x3, x20");
    /* 0x00a427ac: bl       #0xa94fe8 */ CALL_DIRECT(sub_00a94fe8);
    /* 0x00a427b0: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a427b4: sub      x2, x19, x20 */ ARM64("sub x2, x19, x20");
    /* 0x00a427b8: ldr      x3, [x21, #0x288] */ ARM64("ldr x3, [x21, #0x288]");
    /* 0x00a427bc: add      x0, x23, x20 */ ARM64("add x0, x23, x20");
    /* 0x00a427c0: add      x1, x22, x20 */ ARM64("add x1, x22, x20");
    /* 0x00a427c4: add      x4, x21, #0x100 */ ARM64("add x4, x21, #0x100");
    /* 0x00a427c8: add      x5, x21, #0x140 */ ARM64("add x5, x21, #0x140");
    /* 0x00a427cc: bl       #0xb00e44 */ CALL_DIRECT(sub_00b00e44);
    /* 0x00a427d0: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00a427d4: ldr      x9, [x21, #0x138] */ ARM64("ldr x9, [x21, #0x138]");
    /* 0x00a427d8: add      x9, x9, x0 */ ARM64("add x9, x9, x0");
    /* 0x00a427dc: str      x9, [x21, #0x138] */ ARM64("str x9, [x21, #0x138]");
    /* 0x00a427e0: add      x9, x0, x20 */ ARM64("add x9, x0, x20");
    /* 0x00a427e4: ldr      x4, [x21, #0x2e8] */ ARM64("ldr x4, [x21, #0x2e8]");
    /* 0x00a427e8: b        #0xa4249c */ goto loc_00a4249c;
loc_00a427ec:
    /* 0x00a427ec: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00a427f0: b        #0xa42508 */ goto loc_00a42508;
loc_00a427f4:
    /* 0x00a427f4: ldr      w9, [x8, #0x278] */ ARM64("ldr w9, [x8, #0x278]");
    /* 0x00a427f8: neg      w9, w9 */ ARM64("neg w9, w9");
    /* 0x00a427fc: and      w20, w9, #0xf */ ARM64("and w20, w9, #0xf");
    /* 0x00a42800: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00a42804: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00a42808: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00a4280c: mov      x3, x20 */ ARM64("mov x3, x20");
    /* 0x00a42810: bl       #0xa95348 */ CALL_DIRECT(sub_00a95348);
    /* 0x00a42814: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42818: sub      x2, x19, x20 */ ARM64("sub x2, x19, x20");
    /* 0x00a4281c: ldr      x3, [x21, #0x288] */ ARM64("ldr x3, [x21, #0x288]");
    /* 0x00a42820: add      x0, x23, x20 */ ARM64("add x0, x23, x20");
    /* 0x00a42824: add      x1, x22, x20 */ ARM64("add x1, x22, x20");
    /* 0x00a42828: add      x4, x21, #0x100 */ ARM64("add x4, x21, #0x100");
    /* 0x00a4282c: add      x5, x21, #0x140 */ ARM64("add x5, x21, #0x140");
    /* 0x00a42830: bl       #0xb00f38 */ CALL_DIRECT(sub_00b00f38);
    /* 0x00a42834: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00a42838: ldr      x9, [x21, #0x138] */ ARM64("ldr x9, [x21, #0x138]");
    /* 0x00a4283c: add      x9, x9, x0 */ ARM64("add x9, x9, x0");
    /* 0x00a42840: str      x9, [x21, #0x138] */ ARM64("str x9, [x21, #0x138]");
    /* 0x00a42844: add      x9, x0, x20 */ ARM64("add x9, x0, x20");
    /* 0x00a42848: ldr      x4, [x21, #0x2e8] */ ARM64("ldr x4, [x21, #0x2e8]");
    /* 0x00a4284c: b        #0xa42628 */ goto loc_00a42628;
loc_00a42850:
    /* 0x00a42850: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a42854: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00a42858: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00a4285c: mov      x3, #0 */ ARM64("mov x3, #0");
    /* 0x00a42860: bl       #0xa94fe8 */ CALL_DIRECT(sub_00a94fe8);
    /* 0x00a42864: cbnz     w0, #0xa428b4 */ if (w0 != 0) goto loc_00a428b4;
    /* 0x00a42868: ldr      x3, [x20, #0x288] */ ARM64("ldr x3, [x20, #0x288]");
    /* 0x00a4286c: add      x4, x20, #0x100 */ ARM64("add x4, x20, #0x100");
    /* 0x00a42870: add      x5, x20, #0x140 */ ARM64("add x5, x20, #0x140");
    /* 0x00a42874: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00a42878: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00a4287c: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00a42880: bl       #0xb00e44 */ CALL_DIRECT(sub_00b00e44);
    /* 0x00a42884: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00a42888: ldr      x9, [x20, #0x138] */ ARM64("ldr x9, [x20, #0x138]");
    /* 0x00a4288c: add      x9, x9, x0 */ ARM64("add x9, x9, x0");
    /* 0x00a42890: str      x9, [x20, #0x138] */ ARM64("str x9, [x20, #0x138]");
    /* 0x00a42894: ldr      x4, [x20, #0x2e8] */ ARM64("ldr x4, [x20, #0x2e8]");
    /* 0x00a42898: b        #0xa425c8 */ goto loc_00a425c8;
loc_00a4289c:
    /* 0x00a4289c: add      x0, x20, #0x100 */ ARM64("add x0, x20, #0x100");
    /* 0x00a428a0: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00a428a4: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00a428a8: mov      x3, #0 */ ARM64("mov x3, #0");
    /* 0x00a428ac: bl       #0xa95348 */ CALL_DIRECT(sub_00a95348);
    /* 0x00a428b0: cbz      w0, #0xa428cc */ if (w0 == 0) goto loc_00a428cc;
loc_00a428b4:
    /* 0x00a428b4: mov      w0, #-1 */ ARM64("mov w0, #-1");
loc_00a428b8:
    /* 0x00a428b8: ldp      x29, x30, [sp, #0x30] */ ARM64("ldp x29, x30, [sp, #0x30]");
    /* 0x00a428bc: ldp      x20, x19, [sp, #0x20] */ ARM64("ldp x20, x19, [sp, #0x20]");
    /* 0x00a428c0: ldp      x22, x21, [sp, #0x10] */ ARM64("ldp x22, x21, [sp, #0x10]");
    /* 0x00a428c4: ldp      x24, x23, [sp], #0x40 */ ARM64("ldp x24, x23, [sp], #0x40");
    /* 0x00a428c8: ret       */ return;
loc_00a428cc:
    /* 0x00a428cc: ldr      x3, [x20, #0x288] */ ARM64("ldr x3, [x20, #0x288]");
    /* 0x00a428d0: add      x4, x20, #0x100 */ ARM64("add x4, x20, #0x100");
    /* 0x00a428d4: add      x5, x20, #0x140 */ ARM64("add x5, x20, #0x140");
    /* 0x00a428d8: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00a428dc: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00a428e0: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00a428e4: bl       #0xb00f38 */ CALL_DIRECT(sub_00b00f38);
    /* 0x00a428e8: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00a428ec: ldr      x9, [x20, #0x138] */ ARM64("ldr x9, [x20, #0x138]");
    /* 0x00a428f0: add      x9, x9, x0 */ ARM64("add x9, x9, x0");
    /* 0x00a428f4: str      x9, [x20, #0x138] */ ARM64("str x9, [x20, #0x138]");
    /* 0x00a428f8: ldr      x4, [x20, #0x2e8] */ ARM64("ldr x4, [x20, #0x2e8]");
    /* 0x00a428fc: b        #0xa426cc */ goto loc_00a426cc;
}
