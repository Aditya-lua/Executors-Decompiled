/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb676b4..0xb6c688 (20436 bytes). */
#include "../lift_runtime.hpp"

void sub_00b676b4(Arm64Context& cpu) {
    /* 0x00b676b4: stp      d9, d8, [sp, #-0x70]! */ ARM64("stp d9, d8, [sp, #-0x70]!");
    /* 0x00b676b8: stp      x28, x27, [sp, #0x10] */ ARM64("stp x28, x27, [sp, #0x10]");
    /* 0x00b676bc: stp      x26, x25, [sp, #0x20] */ ARM64("stp x26, x25, [sp, #0x20]");
    /* 0x00b676c0: stp      x24, x23, [sp, #0x30] */ ARM64("stp x24, x23, [sp, #0x30]");
    /* 0x00b676c4: stp      x22, x21, [sp, #0x40] */ ARM64("stp x22, x21, [sp, #0x40]");
    /* 0x00b676c8: stp      x20, x19, [sp, #0x50] */ ARM64("stp x20, x19, [sp, #0x50]");
    /* 0x00b676cc: stp      x29, x30, [sp, #0x60] */ ARM64("stp x29, x30, [sp, #0x60]");
    /* 0x00b676d0: add      x29, sp, #0x60 */ ARM64("add x29, sp, #0x60");
    /* 0x00b676d4: sub      sp, sp, #0x770 */ ARM64("sub sp, sp, #0x770");
    /* 0x00b676d8: str      xzr, [sp] */ ARM64("str xzr, [sp]");
    /* 0x00b676dc: mov      x8, x2 */ ARM64("mov x8, x2");
    /* 0x00b676e0: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x00b676e4: str      x0, [sp, #0xa8] */ ARM64("str x0, [sp, #0xa8]");
    /* 0x00b676e8: str      x1, [sp, #0x198] */ ARM64("str x1, [sp, #0x198]");
    /* 0x00b676ec: str      x3, [sp, #0xf8] */ ARM64("str x3, [sp, #0xf8]");
    /* 0x00b676f0: ldp      x2, x3, [x3, #8] */ ARM64("ldp x2, x3, [x3, #8]");
    /* 0x00b676f4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b676f8: str      x8, [sp, #0x170] */ ARM64("str x8, [sp, #0x170]");
    /* 0x00b676fc: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00b67700: bl       #0xbbd404 */ CALL_DIRECT(sub_00bbd404);
    /* 0x00b67704: add      x28, sp, #0x210 */ ARM64("add x28, sp, #0x210");
    /* 0x00b67708: ldr      q0, [x28, #0x20] */ ARM64("ldr q0, [x28, #0x20]");
    /* 0x00b6770c: str      q0, [sp, #0x1a0] */ ARM64("str q0, [sp, #0x1a0]");
    /* 0x00b67710: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b67714: ldr      x21, [sp, #0x248] */ ARM64("ldr x21, [sp, #0x248]");
    /* 0x00b67718: str      x8, [sp, #0x1b0] */ ARM64("str x8, [sp, #0x1b0]");
    /* 0x00b6771c: ldr      x23, [sp, #0x250] */ ARM64("ldr x23, [sp, #0x250]");
    /* 0x00b67720: ldr      x8, [sp, #0x258] */ ARM64("ldr x8, [sp, #0x258]");
    /* 0x00b67724: ldr      x9, [sp, #0x260] */ ARM64("ldr x9, [sp, #0x260]");
    /* 0x00b67728: str      x9, [sp, #0xb8] */ ARM64("str x9, [sp, #0xb8]");
    /* 0x00b6772c: ldr      x22, [sp, #0x268] */ ARM64("ldr x22, [sp, #0x268]");
    /* 0x00b67730: ldr      x24, [sp, #0x270] */ ARM64("ldr x24, [sp, #0x270]");
    /* 0x00b67734: ldr      x9, [sp, #0x278] */ ARM64("ldr x9, [sp, #0x278]");
    /* 0x00b67738: mov      w10, #0x28 */ ARM64("mov w10, #0x28");
    /* 0x00b6773c: madd     x26, x8, x10, x23 */ ARM64("madd x26, x8, x10, x23");
    /* 0x00b67740: add      x25, x24, x9, lsl #5 */ ARM64("add x25, x24, x9, lsl #5");
    /* 0x00b67744: mov      w10, #1 */ ARM64("mov w10, #1");
    /* 0x00b67748: str      x10, [sp, #0x470] */ ARM64("str x10, [sp, #0x470]");
    /* 0x00b6774c: str      x23, [sp, #0x478] */ ARM64("str x23, [sp, #0x478]");
    /* 0x00b67750: str      x23, [sp, #0x480] */ ARM64("str x23, [sp, #0x480]");
    /* 0x00b67754: str      x21, [sp, #0x488] */ ARM64("str x21, [sp, #0x488]");
    /* 0x00b67758: str      x26, [sp, #0x490] */ ARM64("str x26, [sp, #0x490]");
    /* 0x00b6775c: str      x24, [sp, #0x498] */ ARM64("str x24, [sp, #0x498]");
    /* 0x00b67760: str      x24, [sp, #0x4a0] */ ARM64("str x24, [sp, #0x4a0]");
    /* 0x00b67764: str      x22, [sp, #0x4a8] */ ARM64("str x22, [sp, #0x4a8]");
    /* 0x00b67768: mov      x20, #-0x7fffffffffffffff */ ARM64("mov x20, #-0x7fffffffffffffff");
    /* 0x00b6776c: str      x25, [sp, #0x4b0] */ ARM64("str x25, [sp, #0x4b0]");
    /* 0x00b67770: str      x20, [sp, #0x4b8] */ ARM64("str x20, [sp, #0x4b8]");
    /* 0x00b67774: str      x20, [sp, #0x500] */ ARM64("str x20, [sp, #0x500]");
    /* 0x00b67778: orr      x27, x9, x8 */ ARM64("orr x27, x9, x8");
    /* 0x00b6777c: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00b67780: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b67784: add      x9, sp, #0x230 */ ARM64("add x9, sp, #0x230");
    /* 0x00b67788: csel     x8, x8, x9, eq */ ARM64("csel x8, x8, x9, eq");
    /* 0x00b6778c: str      xzr, [x8] */ ARM64("str xzr, [x8]");
    /* 0x00b67790: adrp     x0, #0xf0b000 */ ARM64("adrp x0, #0xf0b000");
    /* 0x00b67794: add      x0, x0, #0x210 */ ARM64("add x0, x0, #0x210");
    /* 0x00b67798: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00b6779c: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00b677a0: ldrb     w8, [x0, #0x10] */ ARM64("ldrb w8, [x0, #0x10]");
    /* 0x00b677a4: tbz      w8, #0, #0xb6b460 */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b460;
loc_00b677a8:
    /* 0x00b677a8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b677ac: str      xzr, [sp, #0x550] */ ARM64("str xzr, [sp, #0x550]");
    /* 0x00b677b0: str      x8, [sp, #0x558] */ ARM64("str x8, [sp, #0x558]");
    /* 0x00b677b4: adrp     x8, #0xe0e000 */ ARM64("adrp x8, #0xe0e000");
    /* 0x00b677b8: add      x8, x8, #0xd10 */ ARM64("add x8, x8, #0xd10");
    /* 0x00b677bc: add      x10, sp, #0x550 */ ARM64("add x10, sp, #0x550");
    /* 0x00b677c0: str      xzr, [sp, #0x560] */ ARM64("str xzr, [sp, #0x560]");
    /* 0x00b677c4: str      x8, [sp, #0x568] */ ARM64("str x8, [sp, #0x568]");
    /* 0x00b677c8: str      xzr, [sp, #0x580] */ ARM64("str xzr, [sp, #0x580]");
    /* 0x00b677cc: str      xzr, [sp, #0x570] */ ARM64("str xzr, [sp, #0x570]");
    /* 0x00b677d0: str      xzr, [sp, #0x578] */ ARM64("str xzr, [sp, #0x578]");
    /* 0x00b677d4: ldr      q0, [x0] */ ARM64("ldr q0, [x0]");
    /* 0x00b677d8: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00b677dc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b677e0: str      x0, [sp, #0x158] */ ARM64("str x0, [sp, #0x158]");
    /* 0x00b677e4: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00b677e8: stur     q0, [x10, #0x38] */ ARM64("stur q0, [x10, #0x38]");
    /* 0x00b677ec: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b677f0: str      x8, [sp, #0x5a0] */ ARM64("str x8, [sp, #0x5a0]");
    /* 0x00b677f4: str      x23, [sp, #0x5a8] */ ARM64("str x23, [sp, #0x5a8]");
    /* 0x00b677f8: str      x23, [sp, #0x5b0] */ ARM64("str x23, [sp, #0x5b0]");
    /* 0x00b677fc: str      x21, [sp, #0x5b8] */ ARM64("str x21, [sp, #0x5b8]");
    /* 0x00b67800: str      x26, [sp, #0x5c0] */ ARM64("str x26, [sp, #0x5c0]");
    /* 0x00b67804: str      x24, [sp, #0x5c8] */ ARM64("str x24, [sp, #0x5c8]");
    /* 0x00b67808: str      x24, [sp, #0x5d0] */ ARM64("str x24, [sp, #0x5d0]");
    /* 0x00b6780c: str      x22, [sp, #0x5d8] */ ARM64("str x22, [sp, #0x5d8]");
    /* 0x00b67810: str      x25, [sp, #0x5e0] */ ARM64("str x25, [sp, #0x5e0]");
    /* 0x00b67814: str      x20, [sp, #0x5e8] */ ARM64("str x20, [sp, #0x5e8]");
    /* 0x00b67818: str      x20, [sp, #0x630] */ ARM64("str x20, [sp, #0x630]");
    /* 0x00b6781c: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00b67820: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b67824: add      x9, sp, #0x6a0 */ ARM64("add x9, sp, #0x6a0");
    /* 0x00b67828: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x00b6782c: str      xzr, [x8] */ ARM64("str xzr, [x8]");
    /* 0x00b67830: ldp      q0, q1, [x10, #0xf0] */ ARM64("ldp q0, q1, [x10, #0xf0]");
    /* 0x00b67834: stp      q0, q1, [x28, #0xc0] */ ARM64("stp q0, q1, [x28, #0xc0]");
    /* 0x00b67838: ldr      q0, [x10, #0x110] */ ARM64("ldr q0, [x10, #0x110]");
    /* 0x00b6783c: str      q0, [x28, #0xe0] */ ARM64("str q0, [x28, #0xe0]");
    /* 0x00b67840: ldr      x8, [sp, #0x670] */ ARM64("ldr x8, [sp, #0x670]");
    /* 0x00b67844: str      x8, [sp, #0x300] */ ARM64("str x8, [sp, #0x300]");
    /* 0x00b67848: ldp      q0, q1, [x10, #0xb0] */ ARM64("ldp q0, q1, [x10, #0xb0]");
    /* 0x00b6784c: stp      q0, q1, [x28, #0x80] */ ARM64("stp q0, q1, [x28, #0x80]");
    /* 0x00b67850: ldp      q0, q1, [x10, #0xd0] */ ARM64("ldp q0, q1, [x10, #0xd0]");
    /* 0x00b67854: stp      q0, q1, [x28, #0xa0] */ ARM64("stp q0, q1, [x28, #0xa0]");
    /* 0x00b67858: ldp      q0, q1, [x10, #0x70] */ ARM64("ldp q0, q1, [x10, #0x70]");
    /* 0x00b6785c: stp      q0, q1, [x28, #0x40] */ ARM64("stp q0, q1, [x28, #0x40]");
    /* 0x00b67860: ldp      q0, q1, [x10, #0x90] */ ARM64("ldp q0, q1, [x10, #0x90]");
    /* 0x00b67864: stp      q0, q1, [x28, #0x60] */ ARM64("stp q0, q1, [x28, #0x60]");
    /* 0x00b67868: ldp      q0, q1, [x10, #0x50] */ ARM64("ldp q0, q1, [x10, #0x50]");
    /* 0x00b6786c: stp      q0, q1, [x28, #0x20] */ ARM64("stp q0, q1, [x28, #0x20]");
    /* 0x00b67870: add      x8, sp, #0x550 */ ARM64("add x8, sp, #0x550");
    /* 0x00b67874: str      x8, [sp, #0x210] */ ARM64("str x8, [sp, #0x210]");
    /* 0x00b67878: ldr      x8, [sp, #0x278] */ ARM64("ldr x8, [sp, #0x278]");
    /* 0x00b6787c: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00b67880: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b67884: b.eq     #0xb6789c */ if (COND_EQ) goto loc_00b6789c;
    /* 0x00b67888: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6788c: ldr      x2, [sp, #0x628] */ ARM64("ldr x2, [sp, #0x628]");
    /* 0x00b67890: add      x0, x8, #0x48 */ ARM64("add x0, x8, #0x48");
    /* 0x00b67894: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b67898: bl       #0xc05a74 */ CALL_DIRECT(sub_00c05a74);
loc_00b6789c:
    /* 0x00b6789c: ldr      w8, [sp, #0x230] */ ARM64("ldr w8, [sp, #0x230]");
    /* 0x00b678a0: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b678a4: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b678a8: tbz      w8, #0, #0xb67a88 */ if (((w8 >> #0) & 1) == 0) goto loc_00b67a88;
    /* 0x00b678ac: ldur     q0, [x28, #0x58] */ ARM64("ldur q0, [x28, #0x58]");
    /* 0x00b678b0: ldur     q1, [x28, #0x68] */ ARM64("ldur q1, [x28, #0x68]");
    /* 0x00b678b4: stp      q0, q1, [sp, #0x1c0] */ ARM64("stp q0, q1, [sp, #0x1c0]");
    /* 0x00b678b8: ldur     q0, [x28, #0x78] */ ARM64("ldur q0, [x28, #0x78]");
    /* 0x00b678bc: ldur     q1, [x28, #0x88] */ ARM64("ldur q1, [x28, #0x88]");
    /* 0x00b678c0: stp      q0, q1, [sp, #0x1e0] */ ARM64("stp q0, q1, [sp, #0x1e0]");
    /* 0x00b678c4: ldr      x8, [sp, #0x1c0] */ ARM64("ldr x8, [sp, #0x1c0]");
    /* 0x00b678c8: cbz      x8, #0xb67984 */ if (x8 == 0) goto loc_00b67984;
    /* 0x00b678cc: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b678d0: ldur     q0, [x8, #0x18] */ ARM64("ldur q0, [x8, #0x18]");
    /* 0x00b678d4: ldur     q1, [x8, #8] */ ARM64("ldur q1, [x8, #8]");
    /* 0x00b678d8: stp      q1, q0, [x28, #0x130] */ ARM64("stp q1, q0, [x28, #0x130]");
    /* 0x00b678dc: ldr      x21, [sp, #0x698] */ ARM64("ldr x21, [sp, #0x698]");
    /* 0x00b678e0: ldr      x20, [sp, #0x688] */ ARM64("ldr x20, [sp, #0x688]");
    /* 0x00b678e4: cmp      x20, x21 */ ARM64("cmp x20, x21");
    /* 0x00b678e8: b.eq     #0xb6797c */ if (COND_EQ) goto loc_00b6797c;
    /* 0x00b678ec: mov      w22, #8 */ ARM64("mov w22, #8");
loc_00b678f0:
    /* 0x00b678f0: ldp      x2, x8, [x20] */ ARM64("ldp x2, x8, [x20]");
    /* 0x00b678f4: ldr      x9, [x20, #0x10] */ ARM64("ldr x9, [x20, #0x10]");
    /* 0x00b678f8: ldr      x10, [x20, #0x20] */ ARM64("ldr x10, [x20, #0x20]");
    /* 0x00b678fc: add      x20, x20, #0x28 */ ARM64("add x20, x20, #0x28");
    /* 0x00b67900: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00b67904: lsl      x11, x9, #3 */ ARM64("lsl x11, x9, #3");
    /* 0x00b67908: add      x12, x11, x9 */ ARM64("add x12, x11, x9");
    /* 0x00b6790c: add      x12, x12, #0x11 */ ARM64("add x12, x12, #0x11");
    /* 0x00b67910: sub      x11, x8, x11 */ ARM64("sub x11, x8, x11");
    /* 0x00b67914: sub      x11, x11, #8 */ ARM64("sub x11, x11, #8");
    /* 0x00b67918: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b6791c: csel     x12, x8, x12, eq */ ARM64("csel x12, x8, x12, eq");
    /* 0x00b67920: csel     x11, x8, x11, eq */ ARM64("csel x11, x8, x11, eq");
    /* 0x00b67924: csel     x13, xzr, x22, eq */ ARM64("csel x13, xzr, x22, eq");
    /* 0x00b67928: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6792c: fmov     x14, d0 */ ARM64("fmov x14, d0");
    /* 0x00b67930: and      x14, x14, #0x8080808080808080 */ ARM64("and x14, x14, #0x8080808080808080");
    /* 0x00b67934: str      x13, [sp, #0x6a0] */ ARM64("str x13, [sp, #0x6a0]");
    /* 0x00b67938: str      x12, [sp, #0x6a8] */ ARM64("str x12, [sp, #0x6a8]");
    /* 0x00b6793c: add      x12, x8, #8 */ ARM64("add x12, x8, #8");
    /* 0x00b67940: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b67944: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00b67948: str      x11, [sp, #0x6b0] */ ARM64("str x11, [sp, #0x6b0]");
    /* 0x00b6794c: str      x8, [sp, #0x6b8] */ ARM64("str x8, [sp, #0x6b8]");
    /* 0x00b67950: str      x14, [sp, #0x6c0] */ ARM64("str x14, [sp, #0x6c0]");
    /* 0x00b67954: str      x12, [sp, #0x6c8] */ ARM64("str x12, [sp, #0x6c8]");
    /* 0x00b67958: str      x9, [sp, #0x6d0] */ ARM64("str x9, [sp, #0x6d0]");
    /* 0x00b6795c: str      x10, [sp, #0x6d8] */ ARM64("str x10, [sp, #0x6d8]");
    /* 0x00b67960: str      x2, [sp, #0x6e0] */ ARM64("str x2, [sp, #0x6e0]");
    /* 0x00b67964: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b67968: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b6796c: bl       #0xc05a74 */ CALL_DIRECT(sub_00c05a74);
    /* 0x00b67970: cmp      x20, x21 */ ARM64("cmp x20, x21");
    /* 0x00b67974: b.ne     #0xb678f0 */ if (COND_NE) goto loc_00b678f0;
    /* 0x00b67978: str      x20, [sp, #0x688] */ ARM64("str x20, [sp, #0x688]");
loc_00b6797c:
    /* 0x00b6797c: add      x0, sp, #0x680 */ ARM64("add x0, sp, #0x680");
    /* 0x00b67980: bl       #0xc055f8 */ CALL_DIRECT(sub_00c055f8);
loc_00b67984:
    /* 0x00b67984: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00b67988: cbz      x8, #0xb67a88 */ if (x8 == 0) goto loc_00b67a88;
    /* 0x00b6798c: ldur     q0, [x28, #0x88] */ ARM64("ldur q0, [x28, #0x88]");
    /* 0x00b67990: ldur     q1, [x28, #0x78] */ ARM64("ldur q1, [x28, #0x78]");
    /* 0x00b67994: stp      q1, q0, [x28, #0x1a0] */ ARM64("stp q1, q0, [x28, #0x1a0]");
    /* 0x00b67998: ldur     x20, [x29, #-0xc8] */ ARM64("ldur x20, [x29, #-0xc8]");
    /* 0x00b6799c: ldur     x21, [x29, #-0xd8] */ ARM64("ldur x21, [x29, #-0xd8]");
    /* 0x00b679a0: cmp      x21, x20 */ ARM64("cmp x21, x20");
    /* 0x00b679a4: b.eq     #0xb67a7c */ if (COND_EQ) goto loc_00b67a7c;
    /* 0x00b679a8: adrp     x8, #0xd0a000 */ ARM64("adrp x8, #0xd0a000");
    /* 0x00b679ac: ldr      q0, [x8, #0xd80] */ ARM64("ldr q0, [x8, #0xd80]");
    /* 0x00b679b0: str      q0, [sp, #0x180] */ ARM64("str q0, [sp, #0x180]");
    /* 0x00b679b4: mov      x22, #-0x8000000000000000 */ ARM64("mov x22, #-0x8000000000000000");
    /* 0x00b679b8: mov      w23, #8 */ ARM64("mov w23, #8");
loc_00b679bc:
    /* 0x00b679bc: ldp      x26, x27, [x21] */ ARM64("ldp x26, x27, [x21]");
    /* 0x00b679c0: ldr      x25, [x21, #0x18] */ ARM64("ldr x25, [x21, #0x18]");
    /* 0x00b679c4: add      x24, x21, #0x20 */ ARM64("add x24, x21, #0x20");
    /* 0x00b679c8: ldr      q0, [x21] */ ARM64("ldr q0, [x21]");
    /* 0x00b679cc: str      q0, [x28, #0x150] */ ARM64("str q0, [x28, #0x150]");
    /* 0x00b679d0: ldr      q0, [x21, #0x10] */ ARM64("ldr q0, [x21, #0x10]");
    /* 0x00b679d4: str      q0, [x28, #0x160] */ ARM64("str q0, [x28, #0x160]");
    /* 0x00b679d8: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00b679dc: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b679e0: cbz      x0, #0xb6b1c8 */ if (x0 == 0) goto loc_00b6b1c8;
    /* 0x00b679e4: mov      x2, x0 */ ARM64("mov x2, x0");
    /* 0x00b679e8: ldr      q0, [sp, #0x180] */ ARM64("ldr q0, [sp, #0x180]");
    /* 0x00b679ec: str      q0, [x0] */ ARM64("str q0, [x0]");
    /* 0x00b679f0: str      x22, [x0, #0x10] */ ARM64("str x22, [x0, #0x10]");
    /* 0x00b679f4: ldr      d0, [x26] */ ARM64("ldr d0, [x26]");
    /* 0x00b679f8: lsl      x8, x27, #3 */ ARM64("lsl x8, x27, #3");
    /* 0x00b679fc: add      x9, x8, x27 */ ARM64("add x9, x8, x27");
    /* 0x00b67a00: add      x9, x9, #0x11 */ ARM64("add x9, x9, #0x11");
    /* 0x00b67a04: sub      x8, x26, x8 */ ARM64("sub x8, x26, x8");
    /* 0x00b67a08: sub      x8, x8, #8 */ ARM64("sub x8, x8, #8");
    /* 0x00b67a0c: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00b67a10: csel     x9, x8, x9, eq */ ARM64("csel x9, x8, x9, eq");
    /* 0x00b67a14: csel     x8, x8, x8, eq */ ARM64("csel x8, x8, x8, eq");
    /* 0x00b67a18: csel     x10, xzr, x23, eq */ ARM64("csel x10, xzr, x23, eq");
    /* 0x00b67a1c: str      x10, [sp, #0x6a0] */ ARM64("str x10, [sp, #0x6a0]");
    /* 0x00b67a20: str      x9, [sp, #0x6a8] */ ARM64("str x9, [sp, #0x6a8]");
    /* 0x00b67a24: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b67a28: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b67a2c: and      x9, x9, #0x8080808080808080 */ ARM64("and x9, x9, #0x8080808080808080");
    /* 0x00b67a30: add      x10, x26, #8 */ ARM64("add x10, x26, #8");
    /* 0x00b67a34: str      x8, [sp, #0x6b0] */ ARM64("str x8, [sp, #0x6b0]");
    /* 0x00b67a38: str      x26, [sp, #0x6b8] */ ARM64("str x26, [sp, #0x6b8]");
    /* 0x00b67a3c: add      x8, x26, x27 */ ARM64("add x8, x26, x27");
    /* 0x00b67a40: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b67a44: str      x9, [sp, #0x6c0] */ ARM64("str x9, [sp, #0x6c0]");
    /* 0x00b67a48: str      x10, [sp, #0x6c8] */ ARM64("str x10, [sp, #0x6c8]");
    /* 0x00b67a4c: str      x8, [sp, #0x6d0] */ ARM64("str x8, [sp, #0x6d0]");
    /* 0x00b67a50: str      x25, [sp, #0x6d8] */ ARM64("str x25, [sp, #0x6d8]");
    /* 0x00b67a54: str      x0, [sp, #0x6e0] */ ARM64("str x0, [sp, #0x6e0]");
    /* 0x00b67a58: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b67a5c: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b67a60: bl       #0xc05a74 */ CALL_DIRECT(sub_00c05a74);
    /* 0x00b67a64: add      x21, x21, #0x20 */ ARM64("add x21, x21, #0x20");
    /* 0x00b67a68: cmp      x21, x20 */ ARM64("cmp x21, x20");
    /* 0x00b67a6c: b.ne     #0xb679bc */ if (COND_NE) goto loc_00b679bc;
    /* 0x00b67a70: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00b67a74: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b67a78: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
loc_00b67a7c:
    /* 0x00b67a7c: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00b67a80: sub      x0, x29, #0xe0 */ ARM64("sub x0, x29, #0xe0");
    /* 0x00b67a84: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
loc_00b67a88:
    /* 0x00b67a88: ldr      x8, [sp, #0x2c0] */ ARM64("ldr x8, [sp, #0x2c0]");
    /* 0x00b67a8c: mov      x20, #-0x7fffffffffffffff */ ARM64("mov x20, #-0x7fffffffffffffff");
    /* 0x00b67a90: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00b67a94: b.eq     #0xb67ab0 */ if (COND_EQ) goto loc_00b67ab0;
    /* 0x00b67a98: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b67a9c: ldr      x2, [sp, #0x670] */ ARM64("ldr x2, [sp, #0x670]");
    /* 0x00b67aa0: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00b67aa4: add      x0, x8, #0x90 */ ARM64("add x0, x8, #0x90");
    /* 0x00b67aa8: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b67aac: bl       #0xc05a74 */ CALL_DIRECT(sub_00c05a74);
loc_00b67ab0:
    /* 0x00b67ab0: ldp      q0, q1, [x28, #0x20] */ ARM64("ldp q0, q1, [x28, #0x20]");
    /* 0x00b67ab4: stp      q0, q1, [sp, #0x1e0] */ ARM64("stp q0, q1, [sp, #0x1e0]");
    /* 0x00b67ab8: ldr      x8, [sp, #0x590] */ ARM64("ldr x8, [sp, #0x590]");
    /* 0x00b67abc: str      x8, [sp, #0x200] */ ARM64("str x8, [sp, #0x200]");
    /* 0x00b67ac0: ldp      q1, q0, [x28] */ ARM64("ldp q1, q0, [x28]");
    /* 0x00b67ac4: stp      q1, q0, [sp, #0x1c0] */ ARM64("stp q1, q0, [sp, #0x1c0]");
    /* 0x00b67ac8: ldp      x8, x9, [sp, #0x1a0] */ ARM64("ldp x8, x9, [sp, #0x1a0]");
    /* 0x00b67acc: ldr      x10, [sp, #0x1b0] */ ARM64("ldr x10, [sp, #0x1b0]");
    /* 0x00b67ad0: add      x10, x9, x10, lsl #5 */ ARM64("add x10, x9, x10, lsl #5");
    /* 0x00b67ad4: adrp     x11, #0xefc000 */ ARM64("adrp x11, #0xefc000");
    /* 0x00b67ad8: add      x11, x11, #0x958 */ ARM64("add x11, x11, #0x958");
    /* 0x00b67adc: str      x20, [sp, #0x470] */ ARM64("str x20, [sp, #0x470]");
    /* 0x00b67ae0: str      x20, [sp, #0x4b8] */ ARM64("str x20, [sp, #0x4b8]");
    /* 0x00b67ae4: str      x9, [sp, #0x500] */ ARM64("str x9, [sp, #0x500]");
    /* 0x00b67ae8: str      x9, [sp, #0x508] */ ARM64("str x9, [sp, #0x508]");
    /* 0x00b67aec: str      x8, [sp, #0x510] */ ARM64("str x8, [sp, #0x510]");
    /* 0x00b67af0: str      x10, [sp, #0x518] */ ARM64("str x10, [sp, #0x518]");
    /* 0x00b67af4: ldp      q0, q1, [x26, #0x2e0] */ ARM64("ldp q0, q1, [x26, #0x2e0]");
    /* 0x00b67af8: stp      q0, q1, [x28, #0xd0] */ ARM64("stp q0, q1, [x28, #0xd0]");
    /* 0x00b67afc: ldr      q0, [x26, #0x300] */ ARM64("ldr q0, [x26, #0x300]");
    /* 0x00b67b00: str      q0, [x28, #0xf0] */ ARM64("str q0, [x28, #0xf0]");
    /* 0x00b67b04: ldp      q0, q1, [x26, #0x2a0] */ ARM64("ldp q0, q1, [x26, #0x2a0]");
    /* 0x00b67b08: stp      q0, q1, [x28, #0x90] */ ARM64("stp q0, q1, [x28, #0x90]");
    /* 0x00b67b0c: ldp      q0, q1, [x26, #0x2c0] */ ARM64("ldp q0, q1, [x26, #0x2c0]");
    /* 0x00b67b10: stp      q0, q1, [x28, #0xb0] */ ARM64("stp q0, q1, [x28, #0xb0]");
    /* 0x00b67b14: ldp      q0, q1, [x26, #0x260] */ ARM64("ldp q0, q1, [x26, #0x260]");
    /* 0x00b67b18: stp      q0, q1, [x28, #0x50] */ ARM64("stp q0, q1, [x28, #0x50]");
    /* 0x00b67b1c: ldp      q0, q2, [x26, #0x280] */ ARM64("ldp q0, q2, [x26, #0x280]");
    /* 0x00b67b20: stp      q0, q2, [x28, #0x70] */ ARM64("stp q0, q2, [x28, #0x70]");
    /* 0x00b67b24: ldp      q0, q2, [x11] */ ARM64("ldp q0, q2, [x11]");
    /* 0x00b67b28: stp      q2, q0, [sp, #0x130] */ ARM64("stp q2, q0, [sp, #0x130]");
    /* 0x00b67b2c: stp      q0, q2, [x28, #0x1a0] */ ARM64("stp q0, q2, [x28, #0x1a0]");
    /* 0x00b67b30: str      xzr, [sp, #0x520] */ ARM64("str xzr, [sp, #0x520]");
    /* 0x00b67b34: str      xzr, [sp, #0x650] */ ARM64("str xzr, [sp, #0x650]");
    /* 0x00b67b38: ldr      x8, [sp, #0x5a0] */ ARM64("ldr x8, [sp, #0x5a0]");
    /* 0x00b67b3c: ldr      x9, [sp, #0x5d8] */ ARM64("ldr x9, [sp, #0x5d8]");
    /* 0x00b67b40: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00b67b44: csel     x8, xzr, x9, eq */ ARM64("csel x8, xzr, x9, eq");
    /* 0x00b67b48: ldr      x9, [sp, #0x5e8] */ ARM64("ldr x9, [sp, #0x5e8]");
    /* 0x00b67b4c: ldr      x10, [sp, #0x620] */ ARM64("ldr x10, [sp, #0x620]");
    /* 0x00b67b50: cmp      x9, x20 */ ARM64("cmp x9, x20");
    /* 0x00b67b54: csel     x9, xzr, x10, eq */ ARM64("csel x9, xzr, x10, eq");
    /* 0x00b67b58: adds     x10, x8, x9 */ ARM64("adds x10, x8, x9");
    /* 0x00b67b5c: csinv    x1, x10, xzr, lo */ ARM64("csinv x1, x10, xzr, lo");
    /* 0x00b67b60: ldr      x10, [sp, #0x630] */ ARM64("ldr x10, [sp, #0x630]");
    /* 0x00b67b64: cbz      x10, #0xb67b84 */ if (x10 == 0) goto loc_00b67b84;
    /* 0x00b67b68: ldr      x10, [sp, #0x638] */ ARM64("ldr x10, [sp, #0x638]");
    /* 0x00b67b6c: ldr      x11, [sp, #0x648] */ ARM64("ldr x11, [sp, #0x648]");
    /* 0x00b67b70: cmp      x11, x10 */ ARM64("cmp x11, x10");
    /* 0x00b67b74: b.eq     #0xb67b84 */ if (COND_EQ) goto loc_00b67b84;
    /* 0x00b67b78: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b67b7c: add      x9, sp, #0x230 */ ARM64("add x9, sp, #0x230");
    /* 0x00b67b80: b        #0xb67b8c */ goto loc_00b67b8c;
loc_00b67b84:
    /* 0x00b67b84: add      x8, x9, x8 */ ARM64("add x8, x9, x8");
    /* 0x00b67b88: add      x9, sp, #0x6a0 */ ARM64("add x9, sp, #0x6a0");
loc_00b67b8c:
    /* 0x00b67b8c: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00b67b90: cbnz     x1, #0xb6b46c */ if (x1 != 0) goto loc_00b6b46c;
loc_00b67b94:
    /* 0x00b67b94: ldp      q0, q1, [x26, #0x2e0] */ ARM64("ldp q0, q1, [x26, #0x2e0]");
    /* 0x00b67b98: stp      q0, q1, [x26, #0xa0] */ ARM64("stp q0, q1, [x26, #0xa0]");
    /* 0x00b67b9c: ldr      q0, [x26, #0x300] */ ARM64("ldr q0, [x26, #0x300]");
    /* 0x00b67ba0: str      q0, [x26, #0xc0] */ ARM64("str q0, [x26, #0xc0]");
    /* 0x00b67ba4: ldr      x8, [sp, #0x520] */ ARM64("ldr x8, [sp, #0x520]");
    /* 0x00b67ba8: str      x8, [sp, #0x2e0] */ ARM64("str x8, [sp, #0x2e0]");
    /* 0x00b67bac: ldp      q0, q1, [x26, #0x2a0] */ ARM64("ldp q0, q1, [x26, #0x2a0]");
    /* 0x00b67bb0: stp      q0, q1, [x26, #0x60] */ ARM64("stp q0, q1, [x26, #0x60]");
    /* 0x00b67bb4: ldp      q0, q1, [x26, #0x2c0] */ ARM64("ldp q0, q1, [x26, #0x2c0]");
    /* 0x00b67bb8: stp      q0, q1, [x26, #0x80] */ ARM64("stp q0, q1, [x26, #0x80]");
    /* 0x00b67bbc: ldp      q0, q1, [x26, #0x260] */ ARM64("ldp q0, q1, [x26, #0x260]");
    /* 0x00b67bc0: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b67bc4: ldp      q0, q1, [x26, #0x280] */ ARM64("ldp q0, q1, [x26, #0x280]");
    /* 0x00b67bc8: stp      q0, q1, [x26, #0x40] */ ARM64("stp q0, q1, [x26, #0x40]");
    /* 0x00b67bcc: sub      x8, x29, #0xe0 */ ARM64("sub x8, x29, #0xe0");
    /* 0x00b67bd0: str      x8, [sp, #0x680] */ ARM64("str x8, [sp, #0x680]");
    /* 0x00b67bd4: mov      x8, #-0x7fffffffffffffff */ ARM64("mov x8, #-0x7fffffffffffffff");
    /* 0x00b67bd8: ldr      x9, [sp, #0x230] */ ARM64("ldr x9, [sp, #0x230]");
    /* 0x00b67bdc: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00b67be0: b.eq     #0xb67bf0 */ if (COND_EQ) goto loc_00b67bf0;
    /* 0x00b67be4: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b67be8: add      x1, sp, #0x680 */ ARM64("add x1, sp, #0x680");
    /* 0x00b67bec: bl       #0xc0cb88 */ CALL_DIRECT(sub_00c0cb88);
loc_00b67bf0:
    /* 0x00b67bf0: add      x9, sp, #0x470 */ ARM64("add x9, sp, #0x470");
    /* 0x00b67bf4: ldr      x8, [sp, #0x2c0] */ ARM64("ldr x8, [sp, #0x2c0]");
    /* 0x00b67bf8: cbz      x8, #0xb67cc0 */ if (x8 == 0) goto loc_00b67cc0;
    /* 0x00b67bfc: ldur     q0, [x9, #0x98] */ ARM64("ldur q0, [x9, #0x98]");
    /* 0x00b67c00: stur     q0, [x28, #8] */ ARM64("stur q0, [x28, #8]");
    /* 0x00b67c04: ldr      x20, [sp, #0x518] */ ARM64("ldr x20, [sp, #0x518]");
    /* 0x00b67c08: ldr      x22, [sp, #0x2e0] */ ARM64("ldr x22, [sp, #0x2e0]");
    /* 0x00b67c0c: str      x20, [sp, #0x568] */ ARM64("str x20, [sp, #0x568]");
    /* 0x00b67c10: str      x8, [sp, #0x550] */ ARM64("str x8, [sp, #0x550]");
    /* 0x00b67c14: ldr      x21, [sp, #0x558] */ ARM64("ldr x21, [sp, #0x558]");
    /* 0x00b67c18: cmp      x21, x20 */ ARM64("cmp x21, x20");
    /* 0x00b67c1c: b.eq     #0xb67cb4 */ if (COND_EQ) goto loc_00b67cb4;
    /* 0x00b67c20: mov      w23, #8 */ ARM64("mov w23, #8");
loc_00b67c24:
    /* 0x00b67c24: ldp      x8, x9, [x21] */ ARM64("ldp x8, x9, [x21]");
    /* 0x00b67c28: ldr      x10, [x21, #0x18] */ ARM64("ldr x10, [x21, #0x18]");
    /* 0x00b67c2c: add      x21, x21, #0x20 */ ARM64("add x21, x21, #0x20");
    /* 0x00b67c30: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00b67c34: lsl      x11, x9, #3 */ ARM64("lsl x11, x9, #3");
    /* 0x00b67c38: add      x12, x11, x9 */ ARM64("add x12, x11, x9");
    /* 0x00b67c3c: add      x12, x12, #0x11 */ ARM64("add x12, x12, #0x11");
    /* 0x00b67c40: sub      x11, x8, x11 */ ARM64("sub x11, x8, x11");
    /* 0x00b67c44: sub      x11, x11, #8 */ ARM64("sub x11, x11, #8");
    /* 0x00b67c48: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b67c4c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b67c50: fmov     x13, d0 */ ARM64("fmov x13, d0");
    /* 0x00b67c54: and      x13, x13, #0x8080808080808080 */ ARM64("and x13, x13, #0x8080808080808080");
    /* 0x00b67c58: add      x14, x8, #8 */ ARM64("add x14, x8, #8");
    /* 0x00b67c5c: str      x13, [sp, #0x6c0] */ ARM64("str x13, [sp, #0x6c0]");
    /* 0x00b67c60: str      x14, [sp, #0x6c8] */ ARM64("str x14, [sp, #0x6c8]");
    /* 0x00b67c64: csel     x12, x8, x12, eq */ ARM64("csel x12, x8, x12, eq");
    /* 0x00b67c68: csel     x11, x8, x11, eq */ ARM64("csel x11, x8, x11, eq");
    /* 0x00b67c6c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b67c70: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00b67c74: str      x9, [sp, #0x6d0] */ ARM64("str x9, [sp, #0x6d0]");
    /* 0x00b67c78: str      x10, [sp, #0x6d8] */ ARM64("str x10, [sp, #0x6d8]");
    /* 0x00b67c7c: csel     x9, xzr, x23, eq */ ARM64("csel x9, xzr, x23, eq");
    /* 0x00b67c80: str      x9, [sp, #0x6a0] */ ARM64("str x9, [sp, #0x6a0]");
    /* 0x00b67c84: str      x12, [sp, #0x6a8] */ ARM64("str x12, [sp, #0x6a8]");
    /* 0x00b67c88: str      x8, [sp, #0x6b8] */ ARM64("str x8, [sp, #0x6b8]");
    /* 0x00b67c8c: str      x11, [sp, #0x6b0] */ ARM64("str x11, [sp, #0x6b0]");
    /* 0x00b67c90: str      x22, [sp, #0x6e0] */ ARM64("str x22, [sp, #0x6e0]");
    /* 0x00b67c94: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b67c98: add      x1, sp, #0x680 */ ARM64("add x1, sp, #0x680");
    /* 0x00b67c9c: bl       #0xc0cb88 */ CALL_DIRECT(sub_00c0cb88);
    /* 0x00b67ca0: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b67ca4: cmp      x21, x20 */ ARM64("cmp x21, x20");
    /* 0x00b67ca8: b.ne     #0xb67c24 */ if (COND_NE) goto loc_00b67c24;
    /* 0x00b67cac: str      x21, [sp, #0x558] */ ARM64("str x21, [sp, #0x558]");
    /* 0x00b67cb0: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
loc_00b67cb4:
    /* 0x00b67cb4: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00b67cb8: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b67cbc: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
loc_00b67cc0:
    /* 0x00b67cc0: ldr      x8, [sp, #0x278] */ ARM64("ldr x8, [sp, #0x278]");
    /* 0x00b67cc4: mov      x9, #-0x7fffffffffffffff */ ARM64("mov x9, #-0x7fffffffffffffff");
    /* 0x00b67cc8: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b67ccc: b.eq     #0xb67ce4 */ if (COND_EQ) goto loc_00b67ce4;
    /* 0x00b67cd0: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b67cd4: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00b67cd8: add      x0, x8, #0x48 */ ARM64("add x0, x8, #0x48");
    /* 0x00b67cdc: add      x1, sp, #0x680 */ ARM64("add x1, sp, #0x680");
    /* 0x00b67ce0: bl       #0xc0cb88 */ CALL_DIRECT(sub_00c0cb88);
loc_00b67ce4:
    /* 0x00b67ce4: ldp      q0, q1, [x28, #0x1a0] */ ARM64("ldp q0, q1, [x28, #0x1a0]");
    /* 0x00b67ce8: str      q0, [sp, #0x210] */ ARM64("str q0, [sp, #0x210]");
    /* 0x00b67cec: ldr      x21, [sp, #0x170] */ ARM64("ldr x21, [sp, #0x170]");
    /* 0x00b67cf0: add      x22, x21, #0x18 */ ARM64("add x22, x21, #0x18");
    /* 0x00b67cf4: add      x9, sp, #0x230 */ ARM64("add x9, sp, #0x230");
    /* 0x00b67cf8: str      q1, [x26, #0x10] */ ARM64("str q1, [x26, #0x10]");
    /* 0x00b67cfc: add      x8, x9, #0x30 */ ARM64("add x8, x9, #0x30");
    /* 0x00b67d00: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00b67d04: add      x8, x9, #0x50 */ ARM64("add x8, x9, #0x50");
    /* 0x00b67d08: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
    /* 0x00b67d0c: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b67d10: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b67d14: add      x9, x8, #0x8f8 */ ARM64("add x9, x8, #0x8f8");
    /* 0x00b67d18: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b67d1c: add      x8, x8, #0x8b0 */ ARM64("add x8, x8, #0x8b0");
    /* 0x00b67d20: stp      x9, x8, [sp, #0x98] */ ARM64("stp x9, x8, [sp, #0x98]");
    /* 0x00b67d24: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b67d28: add      x8, x8, #0xf10 */ ARM64("add x8, x8, #0xf10");
    /* 0x00b67d2c: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
    /* 0x00b67d30: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
    /* 0x00b67d34: str      x22, [sp, #0xd8] */ ARM64("str x22, [sp, #0xd8]");
loc_00b67d38:
    /* 0x00b67d38: ldr      w8, [x21, #0x78] */ ARM64("ldr w8, [x21, #0x78]");
    /* 0x00b67d3c: str      w8, [sp, #0xd4] */ ARM64("str w8, [sp, #0xd4]");
    /* 0x00b67d40: tbz      w8, #0, #0xb6b410 */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b410;
    /* 0x00b67d44: ldr      w8, [x21, #0x7c] */ ARM64("ldr w8, [x21, #0x7c]");
    /* 0x00b67d48: str      w8, [sp, #0x128] */ ARM64("str w8, [sp, #0x128]");
    /* 0x00b67d4c: str      xzr, [sp, #0x550] */ ARM64("str xzr, [sp, #0x550]");
    /* 0x00b67d50: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b67d54: str      x8, [sp, #0x558] */ ARM64("str x8, [sp, #0x558]");
    /* 0x00b67d58: str      xzr, [sp, #0x560] */ ARM64("str xzr, [sp, #0x560]");
    /* 0x00b67d5c: ldrb     w8, [x23, #0x10] */ ARM64("ldrb w8, [x23, #0x10]");
    /* 0x00b67d60: tbz      w8, #0, #0xb69c3c */ if (((w8 >> #0) & 1) == 0) goto loc_00b69c3c;
loc_00b67d64:
    /* 0x00b67d64: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b67d68: add      x9, sp, #0x470 */ ARM64("add x9, sp, #0x470");
    /* 0x00b67d6c: stp      q1, q0, [x9] */ ARM64("stp q1, q0, [x9]");
    /* 0x00b67d70: ldr      q0, [x23] */ ARM64("ldr q0, [x23]");
    /* 0x00b67d74: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00b67d78: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b67d7c: str      x8, [x23] */ ARM64("str x8, [x23]");
    /* 0x00b67d80: str      q0, [x9, #0x20] */ ARM64("str q0, [x9, #0x20]");
    /* 0x00b67d84: ldp      x1, x2, [x21, #0x20] */ ARM64("ldp x1, x2, [x21, #0x20]");
    /* 0x00b67d88: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b67d8c: bl       #0xbd972c */ CALL_DIRECT(sub_00bd972c);
    /* 0x00b67d90: ldp      x1, x2, [x21, #0x20] */ ARM64("ldp x1, x2, [x21, #0x20]");
    /* 0x00b67d94: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b67d98: bl       #0xbd972c */ CALL_DIRECT(sub_00bd972c);
    /* 0x00b67d9c: str      xzr, [sp, #0x5a0] */ ARM64("str xzr, [sp, #0x5a0]");
    /* 0x00b67da0: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b67da4: str      x8, [sp, #0x5a8] */ ARM64("str x8, [sp, #0x5a8]");
    /* 0x00b67da8: ldp      q0, q1, [x28, #0x150] */ ARM64("ldp q0, q1, [x28, #0x150]");
    /* 0x00b67dac: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b67db0: stur     q0, [x8, #0x18] */ ARM64("stur q0, [x8, #0x18]");
    /* 0x00b67db4: stur     q1, [x8, #0x28] */ ARM64("stur q1, [x8, #0x28]");
    /* 0x00b67db8: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b67dbc: stur     q0, [x8, #0x38] */ ARM64("stur q0, [x8, #0x38]");
    /* 0x00b67dc0: stur     q1, [x8, #0x48] */ ARM64("stur q1, [x8, #0x48]");
    /* 0x00b67dc4: str      xzr, [sp, #0x5b0] */ ARM64("str xzr, [sp, #0x5b0]");
    /* 0x00b67dc8: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b67dcc: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b67dd0: str      xzr, [sp, #0x178] */ ARM64("str xzr, [sp, #0x178]");
    /* 0x00b67dd4: ldr      x8, [sp, #0x5a8] */ ARM64("ldr x8, [sp, #0x5a8]");
    /* 0x00b67dd8: ldr      w9, [sp, #0x128] */ ARM64("ldr w9, [sp, #0x128]");
    /* 0x00b67ddc: str      w9, [x8] */ ARM64("str w9, [x8]");
    /* 0x00b67de0: str      x24, [sp, #0x5b0] */ ARM64("str x24, [sp, #0x5b0]");
    /* 0x00b67de4: ldp      q0, q1, [x28, #0x70] */ ARM64("ldp q0, q1, [x28, #0x70]");
    /* 0x00b67de8: stp      q0, q1, [x26, #0x40] */ ARM64("stp q0, q1, [x26, #0x40]");
    /* 0x00b67dec: ldr      q0, [x28, #0x90] */ ARM64("ldr q0, [x28, #0x90]");
    /* 0x00b67df0: str      q0, [x26, #0x60] */ ARM64("str q0, [x26, #0x60]");
    /* 0x00b67df4: ldr      x8, [sp, #0x5f0] */ ARM64("ldr x8, [sp, #0x5f0]");
    /* 0x00b67df8: ldp      q0, q1, [x28, #0x50] */ ARM64("ldp q0, q1, [x28, #0x50]");
    /* 0x00b67dfc: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b67e00: str      x8, [sp, #0x280] */ ARM64("str x8, [sp, #0x280]");
    /* 0x00b67e04: str      x22, [sp, #0x288] */ ARM64("str x22, [sp, #0x288]");
    /* 0x00b67e08: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00b67e0c: stp      x8, xzr, [sp, #0x110] */ ARM64("stp x8, xzr, [sp, #0x110]");
    /* 0x00b67e10: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b67e14: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00b67e18: ldr      x8, [sp, #0x170] */ ARM64("ldr x8, [sp, #0x170]");
    /* 0x00b67e1c: add      x23, x8, #0x18 */ ARM64("add x23, x8, #0x18");
    /* 0x00b67e20: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b67e24: cbz      x8, #0xb68564 */ if (x8 == 0) goto loc_00b68564;
loc_00b67e28:
    /* 0x00b67e28: ldr      x9, [sp, #0x238] */ ARM64("ldr x9, [sp, #0x238]");
    /* 0x00b67e2c: b        #0xb67e38 */ goto loc_00b67e38;
loc_00b67e30:
    /* 0x00b67e30: mov      w24, #1 */ ARM64("mov w24, #1");
loc_00b67e34:
    /* 0x00b67e34: cbz      x8, #0xb68564 */ if (x8 == 0) goto loc_00b68564;
loc_00b67e38:
    /* 0x00b67e38: add      x10, x9, x8, lsl #2 */ ARM64("add x10, x9, x8, lsl #2");
    /* 0x00b67e3c: ldur     w22, [x10, #-4] */ ARM64("ldur w22, [x10, #-4]");
    /* 0x00b67e40: str      x22, [sp, #0x6a0] */ ARM64("str x22, [sp, #0x6a0]");
    /* 0x00b67e44: ldr      x10, [sp, #0x260] */ ARM64("ldr x10, [sp, #0x260]");
    /* 0x00b67e48: cmp      x10, x22 */ ARM64("cmp x10, x22");
    /* 0x00b67e4c: b.ls     #0xb69f70 */ if (COND_LS) goto loc_00b69f70;
    /* 0x00b67e50: lsr      x10, x22, #5 */ ARM64("lsr x10, x22, #5");
    /* 0x00b67e54: ldr      x12, [sp, #0x250] */ ARM64("ldr x12, [sp, #0x250]");
    /* 0x00b67e58: ldr      w13, [x12, x10, lsl #2] */ ARM64("ldr w13, [x12, x10, lsl #2]");
    /* 0x00b67e5c: lsl      w11, w24, w22 */ ARM64("lsl w11, w24, w22");
    /* 0x00b67e60: orr      w14, w13, w11 */ ARM64("orr w14, w13, w11");
    /* 0x00b67e64: str      w14, [x12, x10, lsl #2] */ ARM64("str w14, [x12, x10, lsl #2]");
    /* 0x00b67e68: tst      w13, w11 */ ARM64("tst w13, w11");
    /* 0x00b67e6c: b.eq     #0xb67ea4 */ if (COND_EQ) goto loc_00b67ea4;
    /* 0x00b67e70: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00b67e74: str      x8, [sp, #0x240] */ ARM64("str x8, [sp, #0x240]");
    /* 0x00b67e78: str      x22, [sp, #0x6a0] */ ARM64("str x22, [sp, #0x6a0]");
    /* 0x00b67e7c: ldr      x12, [sp, #0x280] */ ARM64("ldr x12, [sp, #0x280]");
    /* 0x00b67e80: cmp      x12, x22 */ ARM64("cmp x12, x22");
    /* 0x00b67e84: b.ls     #0xb69f84 */ if (COND_LS) goto loc_00b69f84;
    /* 0x00b67e88: ldr      x12, [sp, #0x270] */ ARM64("ldr x12, [sp, #0x270]");
    /* 0x00b67e8c: ldr      w13, [x12, x10, lsl #2] */ ARM64("ldr w13, [x12, x10, lsl #2]");
    /* 0x00b67e90: orr      w14, w13, w11 */ ARM64("orr w14, w13, w11");
    /* 0x00b67e94: str      w14, [x12, x10, lsl #2] */ ARM64("str w14, [x12, x10, lsl #2]");
    /* 0x00b67e98: tst      w13, w11 */ ARM64("tst w13, w11");
    /* 0x00b67e9c: b.ne     #0xb67e34 */ if (COND_NE) goto loc_00b67e34;
    /* 0x00b67ea0: b        #0xb67f7c */ goto loc_00b67f7c;
loc_00b67ea4:
    /* 0x00b67ea4: ldr      x10, [x23, #0x10] */ ARM64("ldr x10, [x23, #0x10]");
    /* 0x00b67ea8: cmp      x10, x22 */ ARM64("cmp x10, x22");
    /* 0x00b67eac: b.ls     #0xb67ec8 */ if (COND_LS) goto loc_00b67ec8;
    /* 0x00b67eb0: ldr      x10, [x23, #8] */ ARM64("ldr x10, [x23, #8]");
    /* 0x00b67eb4: add      x10, x10, x22, lsl #5 */ ARM64("add x10, x10, x22, lsl #5");
    /* 0x00b67eb8: ldr      x11, [x10] */ ARM64("ldr x11, [x10]");
    /* 0x00b67ebc: mov      x12, #-0x8000000000000000 */ ARM64("mov x12, #-0x8000000000000000");
    /* 0x00b67ec0: cmp      x11, x12 */ ARM64("cmp x11, x12");
    /* 0x00b67ec4: b.ne     #0xb67ed0 */ if (COND_NE) goto loc_00b67ed0;
loc_00b67ec8:
    /* 0x00b67ec8: mov      w21, #-1 */ ARM64("mov w21, #-1");
    /* 0x00b67ecc: b        #0xb67ed4 */ goto loc_00b67ed4;
loc_00b67ed0:
    /* 0x00b67ed0: ldr      w21, [x10, #0x18] */ ARM64("ldr w21, [x10, #0x18]");
loc_00b67ed4:
    /* 0x00b67ed4: ldp      x22, x24, [x23, #0x20] */ ARM64("ldp x22, x24, [x23, #0x20]");
    /* 0x00b67ed8: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b67edc: str      q0, [sp, #0x180] */ ARM64("str q0, [sp, #0x180]");
loc_00b67ee0:
    /* 0x00b67ee0: ldr      x10, [sp, #0x258] */ ARM64("ldr x10, [sp, #0x258]");
    /* 0x00b67ee4: ldr      x11, [sp, #0x250] */ ARM64("ldr x11, [sp, #0x250]");
loc_00b67ee8:
    /* 0x00b67ee8: cmp      x24, x21 */ ARM64("cmp x24, x21");
    /* 0x00b67eec: b.ls     #0xb67f00 */ if (COND_LS) goto loc_00b67f00;
    /* 0x00b67ef0: madd     x12, x21, x20, x22 */ ARM64("madd x12, x21, x20, x22");
    /* 0x00b67ef4: ldr      w21, [x12, #0x20] */ ARM64("ldr w21, [x12, #0x20]");
    /* 0x00b67ef8: ldr      w25, [x12, #0x2c] */ ARM64("ldr w25, [x12, #0x2c]");
    /* 0x00b67efc: b        #0xb67f34 */ goto loc_00b67f34;
loc_00b67f00:
    /* 0x00b67f00: ldr      q0, [sp, #0x180] */ ARM64("ldr q0, [sp, #0x180]");
    /* 0x00b67f04: fmov     w13, s0 */ ARM64("fmov w13, s0");
    /* 0x00b67f08: mov      w12, v0.s[1] */ ARM64("mov w12, v0.s[1]");
loc_00b67f0c:
    /* 0x00b67f0c: mov      w13, w13 */ ARM64("mov w13, w13");
    /* 0x00b67f10: cmp      x24, x13 */ ARM64("cmp x24, x13");
    /* 0x00b67f14: b.ls     #0xb67e30 */ if (COND_LS) goto loc_00b67e30;
    /* 0x00b67f18: umaddl   x14, w13, w20, x22 */ ARM64("umaddl x14, w13, w20, x22");
    /* 0x00b67f1c: ldp      w13, w25, [x14, #0x24] */ ARM64("ldp w13, w25, [x14, #0x24]");
    /* 0x00b67f20: ldr      q0, [sp, #0x180] */ ARM64("ldr q0, [sp, #0x180]");
    /* 0x00b67f24: mov      v0.s[0], w13 */ ARM64("mov v0.s[0], w13");
    /* 0x00b67f28: str      q0, [sp, #0x180] */ ARM64("str q0, [sp, #0x180]");
    /* 0x00b67f2c: cmp      w25, w12 */ ARM64("cmp w25, w12");
    /* 0x00b67f30: b.eq     #0xb67f0c */ if (COND_EQ) goto loc_00b67f0c;
loc_00b67f34:
    /* 0x00b67f34: lsr      w12, w25, #5 */ ARM64("lsr w12, w25, #5");
    /* 0x00b67f38: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00b67f3c: b.ls     #0xb67f4c */ if (COND_LS) goto loc_00b67f4c;
    /* 0x00b67f40: ldr      w12, [x11, x12, lsl #2] */ ARM64("ldr w12, [x11, x12, lsl #2]");
    /* 0x00b67f44: lsr      w12, w12, w25 */ ARM64("lsr w12, w12, w25");
    /* 0x00b67f48: tbnz     w12, #0, #0xb67ee8 */ if (((w12 >> #0) & 1) != 0) goto loc_00b67ee8;
loc_00b67f4c:
    /* 0x00b67f4c: ldr      x26, [sp, #0x240] */ ARM64("ldr x26, [sp, #0x240]");
    /* 0x00b67f50: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b67f54: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b67f58: b.ne     #0xb67f64 */ if (COND_NE) goto loc_00b67f64;
    /* 0x00b67f5c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b67f60: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
loc_00b67f64:
    /* 0x00b67f64: ldr      x9, [sp, #0x238] */ ARM64("ldr x9, [sp, #0x238]");
    /* 0x00b67f68: str      w25, [x9, x26, lsl #2] */ ARM64("str w25, [x9, x26, lsl #2]");
    /* 0x00b67f6c: add      x8, x26, #1 */ ARM64("add x8, x26, #1");
    /* 0x00b67f70: str      x8, [sp, #0x240] */ ARM64("str x8, [sp, #0x240]");
    /* 0x00b67f74: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b67f78: b        #0xb67ee0 */ goto loc_00b67ee0;
loc_00b67f7c:
    /* 0x00b67f7c: ldr      x8, [sp, #0x550] */ ARM64("ldr x8, [sp, #0x550]");
    /* 0x00b67f80: ldr      x21, [sp, #0x178] */ ARM64("ldr x21, [sp, #0x178]");
    /* 0x00b67f84: cmp      x21, x8 */ ARM64("cmp x21, x8");
    /* 0x00b67f88: b.ne     #0xb67f9c */ if (COND_NE) goto loc_00b67f9c;
    /* 0x00b67f8c: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b67f90: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b67f94: ldr      x8, [sp, #0x558] */ ARM64("ldr x8, [sp, #0x558]");
    /* 0x00b67f98: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
loc_00b67f9c:
    /* 0x00b67f9c: ldr      x8, [sp, #0x100] */ ARM64("ldr x8, [sp, #0x100]");
    /* 0x00b67fa0: str      w22, [x8, x21, lsl #2] */ ARM64("str w22, [x8, x21, lsl #2]");
    /* 0x00b67fa4: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b67fa8: str      x21, [sp, #0x560] */ ARM64("str x21, [sp, #0x560]");
    /* 0x00b67fac: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b67fb0: ldr      x8, [x9, #0x28] */ ARM64("ldr x8, [x9, #0x28]");
    /* 0x00b67fb4: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00b67fb8: str      x21, [sp, #0x178] */ ARM64("str x21, [sp, #0x178]");
    /* 0x00b67fbc: b.ls     #0xb67fd8 */ if (COND_LS) goto loc_00b67fd8;
    /* 0x00b67fc0: ldr      x8, [x9, #0x20] */ ARM64("ldr x8, [x9, #0x20]");
    /* 0x00b67fc4: add      x8, x8, x22, lsl #5 */ ARM64("add x8, x8, x22, lsl #5");
    /* 0x00b67fc8: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b67fcc: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b67fd0: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b67fd4: b.ne     #0xb67fe0 */ if (COND_NE) goto loc_00b67fe0;
loc_00b67fd8:
    /* 0x00b67fd8: mov      w11, #-1 */ ARM64("mov w11, #-1");
    /* 0x00b67fdc: b        #0xb67fe4 */ goto loc_00b67fe4;
loc_00b67fe0:
    /* 0x00b67fe0: ldr      w11, [x8, #0x18] */ ARM64("ldr w11, [x8, #0x18]");
loc_00b67fe4:
    /* 0x00b67fe4: ldr      x8, [sp, #0x170] */ ARM64("ldr x8, [sp, #0x170]");
    /* 0x00b67fe8: ldp      x24, x26, [x8, #0x38] */ ARM64("ldp x24, x26, [x8, #0x38]");
    /* 0x00b67fec: mov      x8, #0x6573 */ ARM64("mov x8, #0x6573");
    /* 0x00b67ff0: movk     x8, #0x7974, lsl #16 */ ARM64("movk x8, #0x7974, lsl #16");
    /* 0x00b67ff4: movk     x8, #0x6462, lsl #32 */ ARM64("movk x8, #0x6462, lsl #32");
    /* 0x00b67ff8: movk     x8, #0x7065, lsl #48 */ ARM64("movk x8, #0x7065, lsl #48");
    /* 0x00b67ffc: eor      x8, x22, x8 */ ARM64("eor x8, x22, x8");
    /* 0x00b68000: str      x8, [sp, #0x120] */ ARM64("str x8, [sp, #0x120]");
    /* 0x00b68004: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b68008: b        #0xb680e0 */ goto loc_00b680e0;
loc_00b6800c:
    /* 0x00b6800c: and      x14, x14, x11 */ ARM64("and x14, x14, x11");
    /* 0x00b68010: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b68014: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b68018: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b6801c: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b68020: b.eq     #0xb68050 */ if (COND_EQ) goto loc_00b68050;
loc_00b68024:
    /* 0x00b68024: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b68028: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b6802c: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b68030: and      x16, x16, x11 */ ARM64("and x16, x16, x11");
    /* 0x00b68034: sub      x16, x9, x16, lsl #2 */ ARM64("sub x16, x9, x16, lsl #2");
    /* 0x00b68038: ldur     w16, [x16, #-4] */ ARM64("ldur w16, [x16, #-4]");
    /* 0x00b6803c: cmp      w22, w16 */ ARM64("cmp w22, w16");
    /* 0x00b68040: b.eq     #0xb680d8 */ if (COND_EQ) goto loc_00b680d8;
    /* 0x00b68044: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b68048: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b6804c: b.ne     #0xb68024 */ if (COND_NE) goto loc_00b68024;
loc_00b68050:
    /* 0x00b68050: cmp      x12, #1 */ ARM64("cmp x12, #1");
    /* 0x00b68054: b.eq     #0xb68074 */ if (COND_EQ) goto loc_00b68074;
    /* 0x00b68058: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b6805c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b68060: cbz      x12, #0xb68090 */ if (x12 == 0) goto loc_00b68090;
    /* 0x00b68064: rbit     x12, x12 */ ARM64("rbit x12, x12");
    /* 0x00b68068: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b6806c: add      x12, x14, x12, lsr #3 */ ARM64("add x12, x14, x12, lsr #3");
    /* 0x00b68070: and      x13, x12, x11 */ ARM64("and x13, x12, x11");
loc_00b68074:
    /* 0x00b68074: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b68078: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b6807c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b68080: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b68084: tbnz     w12, #0, #0xb6809c */ if (((w12 >> #0) & 1) != 0) goto loc_00b6809c;
    /* 0x00b68088: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00b6808c: b        #0xb68090 */ goto loc_00b68090;
loc_00b68090:
    /* 0x00b68090: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b68094: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b68098: b        #0xb6800c */ goto loc_00b6800c;
loc_00b6809c:
    /* 0x00b6809c: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b680a0: tbz      w8, #0x1f, #0xb68520 */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b68520;
loc_00b680a4:
    /* 0x00b680a4: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b680a8: sub      x12, x13, #8 */ ARM64("sub x12, x13, #8");
    /* 0x00b680ac: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b680b0: strb     w10, [x9, x13] */ ARM64("strb w10, [x9, x13]");
    /* 0x00b680b4: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b680b8: strb     w10, [x11, #8] */ ARM64("strb w10, [x11, #8]");
    /* 0x00b680bc: ldur     q0, [x27, #-0x20] */ ARM64("ldur q0, [x27, #-0x20]");
    /* 0x00b680c0: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00b680c4: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00b680c8: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00b680cc: stur     q0, [x27, #-0x20] */ ARM64("stur q0, [x27, #-0x20]");
    /* 0x00b680d0: sub      x8, x9, x13, lsl #2 */ ARM64("sub x8, x9, x13, lsl #2");
    /* 0x00b680d4: stur     w22, [x8, #-4] */ ARM64("stur w22, [x8, #-4]");
loc_00b680d8:
    /* 0x00b680d8: ldr      x11, [sp, #0x180] */ ARM64("ldr x11, [sp, #0x180]");
    /* 0x00b680dc: ldr      q0, [sp, #0x160] */ ARM64("ldr q0, [sp, #0x160]");
loc_00b680e0:
    /* 0x00b680e0: cmp      x26, x11 */ ARM64("cmp x26, x11");
    /* 0x00b680e4: b.ls     #0xb68100 */ if (COND_LS) goto loc_00b68100;
    /* 0x00b680e8: str      q0, [sp, #0x160] */ ARM64("str q0, [sp, #0x160]");
    /* 0x00b680ec: madd     x8, x11, x20, x24 */ ARM64("madd x8, x11, x20, x24");
    /* 0x00b680f0: ldr      w9, [x8, #0x20] */ ARM64("ldr w9, [x8, #0x20]");
    /* 0x00b680f4: str      x9, [sp, #0x180] */ ARM64("str x9, [sp, #0x180]");
    /* 0x00b680f8: ldr      w25, [x8, #0x2c] */ ARM64("ldr w25, [x8, #0x2c]");
    /* 0x00b680fc: b        #0xb68130 */ goto loc_00b68130;
loc_00b68100:
    /* 0x00b68100: fmov     w9, s0 */ ARM64("fmov w9, s0");
    /* 0x00b68104: mov      w8, v0.s[1] */ ARM64("mov w8, v0.s[1]");
loc_00b68108:
    /* 0x00b68108: mov      w9, w9 */ ARM64("mov w9, w9");
    /* 0x00b6810c: cmp      x26, x9 */ ARM64("cmp x26, x9");
    /* 0x00b68110: b.ls     #0xb68540 */ if (COND_LS) goto loc_00b68540;
    /* 0x00b68114: umaddl   x10, w9, w20, x24 */ ARM64("umaddl x10, w9, w20, x24");
    /* 0x00b68118: ldp      w9, w25, [x10, #0x24] */ ARM64("ldp w9, w25, [x10, #0x24]");
    /* 0x00b6811c: mov      v0.s[0], w9 */ ARM64("mov v0.s[0], w9");
    /* 0x00b68120: cmp      w25, w8 */ ARM64("cmp w25, w8");
    /* 0x00b68124: b.eq     #0xb68108 */ if (COND_EQ) goto loc_00b68108;
    /* 0x00b68128: str      q0, [sp, #0x160] */ ARM64("str q0, [sp, #0x160]");
    /* 0x00b6812c: str      x11, [sp, #0x180] */ ARM64("str x11, [sp, #0x180]");
loc_00b68130:
    /* 0x00b68130: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b68134: ldr      x9, [sp, #0x490] */ ARM64("ldr x9, [sp, #0x490]");
    /* 0x00b68138: ldr      x10, [sp, #0x498] */ ARM64("ldr x10, [sp, #0x498]");
    /* 0x00b6813c: mov      x11, #0x6575 */ ARM64("mov x11, #0x6575");
    /* 0x00b68140: movk     x11, #0x7073, lsl #16 */ ARM64("movk x11, #0x7073, lsl #16");
    /* 0x00b68144: movk     x11, #0x6d65, lsl #32 */ ARM64("movk x11, #0x6d65, lsl #32");
    /* 0x00b68148: movk     x11, #0x736f, lsl #48 */ ARM64("movk x11, #0x736f, lsl #48");
    /* 0x00b6814c: eor      x11, x9, x11 */ ARM64("eor x11, x9, x11");
    /* 0x00b68150: mov      x12, #0x6f6d */ ARM64("mov x12, #0x6f6d");
    /* 0x00b68154: movk     x12, #0x6e64, lsl #16 */ ARM64("movk x12, #0x6e64, lsl #16");
    /* 0x00b68158: movk     x12, #0x7261, lsl #32 */ ARM64("movk x12, #0x7261, lsl #32");
    /* 0x00b6815c: movk     x12, #0x646f, lsl #48 */ ARM64("movk x12, #0x646f, lsl #48");
    /* 0x00b68160: eor      x12, x10, x12 */ ARM64("eor x12, x10, x12");
    /* 0x00b68164: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00b68168: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00b6816c: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00b68170: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00b68174: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b68178: mov      w13, w25 */ ARM64("mov w13, w25");
    /* 0x00b6817c: orr      x13, x13, #0x400000000000000 */ ARM64("orr x13, x13, #0x400000000000000");
    /* 0x00b68180: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00b68184: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00b68188: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00b6818c: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00b68190: eor      x10, x10, x14 */ ARM64("eor x10, x10, x14");
    /* 0x00b68194: eor      x10, x10, x13 */ ARM64("eor x10, x10, x13");
    /* 0x00b68198: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b6819c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b681a0: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b681a4: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b681a8: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b681ac: add      x9, x9, x12 */ ARM64("add x9, x9, x12");
    /* 0x00b681b0: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b681b4: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b681b8: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b681bc: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b681c0: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00b681c4: eor      x9, x9, #0xff */ ARM64("eor x9, x9, #0xff");
    /* 0x00b681c8: add      x11, x11, x12 */ ARM64("add x11, x11, x12");
    /* 0x00b681cc: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b681d0: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b681d4: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b681d8: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b681dc: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00b681e0: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b681e4: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b681e8: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b681ec: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b681f0: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b681f4: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b681f8: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b681fc: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b68200: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68204: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00b68208: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b6820c: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b68210: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b68214: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b68218: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b6821c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b68220: eor      x11, x11, x12, ror #51 */ ARM64("eor x11, x11, x12, ror #51");
    /* 0x00b68224: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b68228: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b6822c: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b68230: eor      x10, x10, x11, ror #47 */ ARM64("eor x10, x10, x11, ror #47");
    /* 0x00b68234: eor      x10, x10, x9, ror #32 */ ARM64("eor x10, x10, x9, ror #32");
    /* 0x00b68238: eor      x23, x10, x9 */ ARM64("eor x23, x10, x9");
    /* 0x00b6823c: lsr      x21, x23, #0x39 */ ARM64("lsr x21, x23, #0x39");
    /* 0x00b68240: ldr      x9, [sp, #0x478] */ ARM64("ldr x9, [sp, #0x478]");
    /* 0x00b68244: ldr      x10, [sp, #0x470] */ ARM64("ldr x10, [sp, #0x470]");
    /* 0x00b68248: dup      v0.8b, w21 */ ARM64("dup v0.8b, w21");
    /* 0x00b6824c: and      x11, x23, x9 */ ARM64("and x11, x23, x9");
    /* 0x00b68250: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b68254: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b68258: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b6825c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b68260: b.eq     #0xb68298 */ if (COND_EQ) goto loc_00b68298;
loc_00b68264:
    /* 0x00b68264: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b68268: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b6826c: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b68270: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00b68274: mov      w14, #0x38 */ ARM64("mov w14, #0x38");
    /* 0x00b68278: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00b6827c: add      x27, x10, x13 */ ARM64("add x27, x10, x13");
    /* 0x00b68280: ldur     w13, [x27, #-0x38] */ ARM64("ldur w13, [x27, #-0x38]");
    /* 0x00b68284: cmp      w13, w25 */ ARM64("cmp w13, w25");
    /* 0x00b68288: b.eq     #0xb68398 */ if (COND_EQ) goto loc_00b68398;
    /* 0x00b6828c: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b68290: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b68294: b.ne     #0xb68264 */ if (COND_NE) goto loc_00b68264;
loc_00b68298:
    /* 0x00b68298: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b6829c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b682a0: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b682a4: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b682a8: tbnz     w12, #0, #0xb682d0 */ if (((w12 >> #0) & 1) != 0) goto loc_00b682d0;
    /* 0x00b682ac: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b682b0: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00b682b4: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00b682b8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b682bc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b682c0: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b682c4: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b682c8: b.ne     #0xb68264 */ if (COND_NE) goto loc_00b68264;
    /* 0x00b682cc: b        #0xb68298 */ goto loc_00b68298;
loc_00b682d0:
    /* 0x00b682d0: ldr      x8, [sp, #0x480] */ ARM64("ldr x8, [sp, #0x480]");
    /* 0x00b682d4: cbz      x8, #0xb684dc */ if (x8 == 0) goto loc_00b684dc;
loc_00b682d8:
    /* 0x00b682d8: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00b682dc: ldrb     w8, [x8, #0x10] */ ARM64("ldrb w8, [x8, #0x10]");
    /* 0x00b682e0: tbz      w8, #0, #0xb684f0 */ if (((w8 >> #0) & 1) == 0) goto loc_00b684f0;
loc_00b682e4:
    /* 0x00b682e4: ldr      x9, [sp, #0x158] */ ARM64("ldr x9, [sp, #0x158]");
    /* 0x00b682e8: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00b682ec: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00b682f0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b682f4: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00b682f8: ldp      q1, q2, [sp, #0x130] */ ARM64("ldp q1, q2, [sp, #0x130]");
    /* 0x00b682fc: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b68300: stur     q2, [x8, #4] */ ARM64("stur q2, [x8, #4]");
    /* 0x00b68304: stur     q1, [x8, #0x14] */ ARM64("stur q1, [x8, #0x14]");
    /* 0x00b68308: ldr      x8, [sp, #0x470] */ ARM64("ldr x8, [sp, #0x470]");
    /* 0x00b6830c: ldr      x9, [sp, #0x478] */ ARM64("ldr x9, [sp, #0x478]");
    /* 0x00b68310: and      x10, x9, x23 */ ARM64("and x10, x9, x23");
    /* 0x00b68314: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00b68318: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b6831c: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00b68320: cbz      x12, #0xb684b8 */ if (x12 == 0) goto loc_00b684b8;
loc_00b68324:
    /* 0x00b68324: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00b68328: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b6832c: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00b68330: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00b68334: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00b68338: tbz      w10, #0x1f, #0xb68500 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00b68500;
loc_00b6833c:
    /* 0x00b6833c: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00b68340: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00b68344: strb     w21, [x8, x11] */ ARM64("strb w21, [x8, x11]");
    /* 0x00b68348: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b6834c: strb     w21, [x9, #8] */ ARM64("strb w21, [x9, #8]");
    /* 0x00b68350: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00b68354: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00b68358: add      x27, x8, x9 */ ARM64("add x27, x8, x9");
    /* 0x00b6835c: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00b68360: stur     w25, [x27, #-0x38] */ ARM64("stur w25, [x27, #-0x38]");
    /* 0x00b68364: ldr      q1, [x28, #0x50] */ ARM64("ldr q1, [x28, #0x50]");
    /* 0x00b68368: stur     q1, [x27, #-0x34] */ ARM64("stur q1, [x27, #-0x34]");
    /* 0x00b6836c: ldr      q1, [x28, #0x60] */ ARM64("ldr q1, [x28, #0x60]");
    /* 0x00b68370: stur     q1, [x27, #-0x24] */ ARM64("stur q1, [x27, #-0x24]");
    /* 0x00b68374: ldr      w9, [sp, #0x5c0] */ ARM64("ldr w9, [sp, #0x5c0]");
    /* 0x00b68378: stur     w9, [x27, #-0x14] */ ARM64("stur w9, [x27, #-0x14]");
    /* 0x00b6837c: stur     q0, [x27, #-0x10] */ ARM64("stur q0, [x27, #-0x10]");
    /* 0x00b68380: add      x9, sp, #0x470 */ ARM64("add x9, sp, #0x470");
    /* 0x00b68384: ldr      q0, [x9, #0x10] */ ARM64("ldr q0, [x9, #0x10]");
    /* 0x00b68388: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00b6838c: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00b68390: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00b68394: str      q0, [x9, #0x10] */ ARM64("str q0, [x9, #0x10]");
loc_00b68398:
    /* 0x00b68398: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b6839c: ldp      x21, x23, [x1, #-0x10]! */ ARM64("ldp x21, x23, [x1, #-0x10]!");
    /* 0x00b683a0: ldur     x8, [x1, #-0x10] */ ARM64("ldur x8, [x1, #-0x10]");
    /* 0x00b683a4: cbz      x8, #0xb684ac */ if (x8 == 0) goto loc_00b684ac;
loc_00b683a8:
    /* 0x00b683a8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00b683ac: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b683b0: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b683b4: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b683b8: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b683bc: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b683c0: eor      x9, x21, x9 */ ARM64("eor x9, x21, x9");
    /* 0x00b683c4: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00b683c8: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00b683cc: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00b683d0: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00b683d4: eor      x10, x23, x10 */ ARM64("eor x10, x23, x10");
    /* 0x00b683d8: mov      x11, #0x7261 */ ARM64("mov x11, #0x7261");
    /* 0x00b683dc: movk     x11, #0x6e65, lsl #16 */ ARM64("movk x11, #0x6e65, lsl #16");
    /* 0x00b683e0: movk     x11, #0x6765, lsl #32 */ ARM64("movk x11, #0x6765, lsl #32");
    /* 0x00b683e4: movk     x11, #0x6c79, lsl #48 */ ARM64("movk x11, #0x6c79, lsl #48");
    /* 0x00b683e8: eor      x11, x21, x11 */ ARM64("eor x11, x21, x11");
    /* 0x00b683ec: ldr      x13, [sp, #0x120] */ ARM64("ldr x13, [sp, #0x120]");
    /* 0x00b683f0: eor      x13, x23, x13 */ ARM64("eor x13, x23, x13");
    /* 0x00b683f4: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b683f8: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b683fc: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b68400: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b68404: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b68408: add      x11, x11, x10 */ ARM64("add x11, x11, x10");
    /* 0x00b6840c: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b68410: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b68414: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68418: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b6841c: orr      x14, x22, #0x400000000000000 */ ARM64("orr x14, x22, #0x400000000000000");
    /* 0x00b68420: eor      x9, x9, x14 */ ARM64("eor x9, x9, x14");
    /* 0x00b68424: eor      x11, x11, #0xff */ ARM64("eor x11, x11, #0xff");
    /* 0x00b68428: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00b6842c: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b68430: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b68434: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b68438: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b6843c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b68440: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b68444: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b68448: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b6844c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68450: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b68454: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b68458: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b6845c: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b68460: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b68464: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b68468: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b6846c: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b68470: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b68474: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68478: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b6847c: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b68480: eor      x9, x9, x10, ror #51 */ ARM64("eor x9, x9, x10, ror #51");
    /* 0x00b68484: eor      x10, x11, x13, ror #48 */ ARM64("eor x10, x11, x13, ror #48");
    /* 0x00b68488: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b6848c: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b68490: eor      x9, x10, x9, ror #47 */ ARM64("eor x9, x10, x9, ror #47");
    /* 0x00b68494: eor      x9, x9, x11, ror #32 */ ARM64("eor x9, x9, x11, ror #32");
    /* 0x00b68498: eor      x14, x9, x11 */ ARM64("eor x14, x9, x11");
    /* 0x00b6849c: ldp      x9, x11, [x27, #-0x30] */ ARM64("ldp x9, x11, [x27, #-0x30]");
    /* 0x00b684a0: lsr      x10, x14, #0x39 */ ARM64("lsr x10, x14, #0x39");
    /* 0x00b684a4: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
    /* 0x00b684a8: b        #0xb6800c */ goto loc_00b6800c;
loc_00b684ac:
    /* 0x00b684ac: sub      x0, x1, #0x20 */ ARM64("sub x0, x1, #0x20");
    /* 0x00b684b0: bl       #0xc6df10 */ CALL_DIRECT(sub_00c6df10);
    /* 0x00b684b4: b        #0xb683a8 */ goto loc_00b683a8;
loc_00b684b8:
    /* 0x00b684b8: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00b684bc:
    /* 0x00b684bc: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00b684c0: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00b684c4: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00b684c8: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b684cc: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00b684d0: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00b684d4: cbnz     x12, #0xb68324 */ if (x12 != 0) goto loc_00b68324;
    /* 0x00b684d8: b        #0xb684bc */ goto loc_00b684bc;
loc_00b684dc:
    /* 0x00b684dc: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b684e0: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b684e4: add      x1, x8, #0x20 */ ARM64("add x1, x8, #0x20");
    /* 0x00b684e8: bl       #0xc6d288 */ CALL_DIRECT(sub_00c6d288);
    /* 0x00b684ec: b        #0xb682d8 */ goto loc_00b682d8;
loc_00b684f0:
    /* 0x00b684f0: ldr      x0, [sp, #0x158] */ ARM64("ldr x0, [sp, #0x158]");
    /* 0x00b684f4: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b684f8: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b684fc: b        #0xb682e4 */ goto loc_00b682e4;
loc_00b68500:
    /* 0x00b68500: ldr      d1, [x8] */ ARM64("ldr d1, [x8]");
    /* 0x00b68504: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b68508: fmov     x10, d1 */ ARM64("fmov x10, d1");
    /* 0x00b6850c: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b68510: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b68514: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00b68518: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00b6851c: b        #0xb6833c */ goto loc_00b6833c;
loc_00b68520:
    /* 0x00b68520: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b68524: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b68528: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6852c: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b68530: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b68534: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b68538: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b6853c: b        #0xb680a4 */ goto loc_00b680a4;
loc_00b68540:
    /* 0x00b68540: ldr      x23, [sp, #0x288] */ ARM64("ldr x23, [sp, #0x288]");
    /* 0x00b68544: ldp      x10, x8, [sp, #0x110] */ ARM64("ldp x10, x8, [sp, #0x110]");
    /* 0x00b68548: add      x9, x10, #1 */ ARM64("add x9, x10, #1");
    /* 0x00b6854c: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00b68550: stp      x9, x8, [sp, #0x110] */ ARM64("stp x9, x8, [sp, #0x110]");
    /* 0x00b68554: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b68558: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b6855c: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b68560: cbnz     x8, #0xb67e28 */ if (x8 != 0) goto loc_00b67e28;
loc_00b68564:
    /* 0x00b68564: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b68568: cbz      x8, #0xb68574 */ if (x8 == 0) goto loc_00b68574;
    /* 0x00b6856c: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b68570: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b68574:
    /* 0x00b68574: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b68578: ldr      x21, [sp, #0x158] */ ARM64("ldr x21, [sp, #0x158]");
    /* 0x00b6857c: ldr      x22, [sp, #0x178] */ ARM64("ldr x22, [sp, #0x178]");
    /* 0x00b68580: cbz      x8, #0xb6858c */ if (x8 == 0) goto loc_00b6858c;
    /* 0x00b68584: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b68588: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6858c:
    /* 0x00b6858c: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00b68590: cbz      x8, #0xb6859c */ if (x8 == 0) goto loc_00b6859c;
    /* 0x00b68594: ldr      x0, [sp, #0x270] */ ARM64("ldr x0, [sp, #0x270]");
    /* 0x00b68598: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6859c:
    /* 0x00b6859c: ldr      x25, [sp, #0x550] */ ARM64("ldr x25, [sp, #0x550]");
    /* 0x00b685a0: ldr      x8, [sp, #0x558] */ ARM64("ldr x8, [sp, #0x558]");
    /* 0x00b685a4: str      x8, [sp, #0x180] */ ARM64("str x8, [sp, #0x180]");
    /* 0x00b685a8: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b685ac: ldp      q0, q1, [x8] */ ARM64("ldp q0, q1, [x8]");
    /* 0x00b685b0: stp      q0, q1, [x28, #0x50] */ ARM64("stp q0, q1, [x28, #0x50]");
    /* 0x00b685b4: ldr      q0, [x8, #0x20] */ ARM64("ldr q0, [x8, #0x20]");
    /* 0x00b685b8: str      q0, [x28, #0x70] */ ARM64("str q0, [x28, #0x70]");
    /* 0x00b685bc: ldrb     w8, [x21, #0x10] */ ARM64("ldrb w8, [x21, #0x10]");
    /* 0x00b685c0: tbz      w8, #0, #0xb69c4c */ if (((w8 >> #0) & 1) == 0) goto loc_00b69c4c;
loc_00b685c4:
    /* 0x00b685c4: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b685c8: stp      q1, q0, [x26, #0x20] */ ARM64("stp q1, q0, [x26, #0x20]");
    /* 0x00b685cc: ldr      q0, [x21] */ ARM64("ldr q0, [x21]");
    /* 0x00b685d0: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x00b685d4: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b685d8: str      x8, [x21] */ ARM64("str x8, [x21]");
    /* 0x00b685dc: str      q0, [x26, #0x40] */ ARM64("str q0, [x26, #0x40]");
    /* 0x00b685e0: cbnz     x22, #0xb69c5c */ if (x22 != 0) goto loc_00b69c5c;
    /* 0x00b685e4: mov      w22, #1 */ ARM64("mov w22, #1");
loc_00b685e8:
    /* 0x00b685e8: ldr      x21, [sp, #0x230] */ ARM64("ldr x21, [sp, #0x230]");
    /* 0x00b685ec: ldr      x8, [sp, #0x238] */ ARM64("ldr x8, [sp, #0x238]");
    /* 0x00b685f0: str      x8, [sp, #0x120] */ ARM64("str x8, [sp, #0x120]");
    /* 0x00b685f4: ldr      x16, [sp, #0x248] */ ARM64("ldr x16, [sp, #0x248]");
    /* 0x00b685f8: ldr      x23, [sp, #0x250] */ ARM64("ldr x23, [sp, #0x250]");
    /* 0x00b685fc: ldr      x24, [sp, #0x258] */ ARM64("ldr x24, [sp, #0x258]");
    /* 0x00b68600: ldp      q0, q1, [x28, #0x50] */ ARM64("ldp q0, q1, [x28, #0x50]");
    /* 0x00b68604: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b68608: ldr      q0, [x28, #0x70] */ ARM64("ldr q0, [x28, #0x70]");
    /* 0x00b6860c: str      q0, [x26, #0x40] */ ARM64("str q0, [x26, #0x40]");
    /* 0x00b68610: mov      x8, #0x5555555555555555 */ ARM64("mov x8, #0x5555555555555555");
    /* 0x00b68614: movk     x8, #0x555, lsl #48 */ ARM64("movk x8, #0x555, lsl #48");
    /* 0x00b68618: ldr      x9, [sp, #0x178] */ ARM64("ldr x9, [sp, #0x178]");
    /* 0x00b6861c: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00b68620: b.hi     #0xb69f18 */ if (COND_HI) goto loc_00b69f18;
    /* 0x00b68624: str      x21, [sp, #0x100] */ ARM64("str x21, [sp, #0x100]");
    /* 0x00b68628: str      x25, [sp, #0xf0] */ ARM64("str x25, [sp, #0xf0]");
    /* 0x00b6862c: add      x8, x9, x9, lsl #1 */ ARM64("add x8, x9, x9, lsl #1");
    /* 0x00b68630: lsl      x21, x8, #3 */ ARM64("lsl x21, x8, #3");
    /* 0x00b68634: cbz      x21, #0xb686b8 */ if (x21 == 0) goto loc_00b686b8;
    /* 0x00b68638: mov      x26, x16 */ ARM64("mov x26, x16");
    /* 0x00b6863c: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b68640: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b68644: mov      w25, #0x18 */ ARM64("mov w25, #0x18");
    /* 0x00b68648: cbz      x0, #0xb6b938 */ if (x0 == 0) goto loc_00b6b938;
    /* 0x00b6864c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b68650: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b68654: str      x8, [sp, #0xc8] */ ARM64("str x8, [sp, #0xc8]");
    /* 0x00b68658: mov      x16, x26 */ ARM64("mov x16, x26");
    /* 0x00b6865c: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
    /* 0x00b68660: tbz      w22, #0, #0xb686cc */ if (((w22 >> #0) & 1) == 0) goto loc_00b686cc;
loc_00b68664:
    /* 0x00b68664: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b68668: ldr      x24, [sp, #0x178] */ ARM64("ldr x24, [sp, #0x178]");
    /* 0x00b6866c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b68670: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b68674: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b68678: cbz      x24, #0xb6b94c */ if (x24 == 0) goto loc_00b6b94c;
loc_00b6867c:
    /* 0x00b6867c: lsl      x26, x24, #3 */ ARM64("lsl x26, x24, #3");
    /* 0x00b68680: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b68684: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b68688: cbz      x0, #0xb6b508 */ if (x0 == 0) goto loc_00b6b508;
    /* 0x00b6868c: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b68690: subs     x9, x24, #2 */ ARM64("subs x9, x24, #2");
    /* 0x00b68694: b.lo     #0xb68e58 */ if (COND_LO) goto loc_00b68e58;
    /* 0x00b68698: cmp      x24, #5 */ ARM64("cmp x24, #5");
    /* 0x00b6869c: add      x23, sp, #0x210 */ ARM64("add x23, sp, #0x210");
    /* 0x00b686a0: mov      x13, #-1 */ ARM64("mov x13, #-1");
    /* 0x00b686a4: mov      w17, #0x18 */ ARM64("mov w17, #0x18");
    /* 0x00b686a8: b.hs     #0xb68e70 */ if (COND_HS) goto loc_00b68e70;
    /* 0x00b686ac: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00b686b0: mov      w10, #1 */ ARM64("mov w10, #1");
    /* 0x00b686b4: b        #0xb68ea4 */ goto loc_00b68ea4;
loc_00b686b8:
    /* 0x00b686b8: str      xzr, [sp, #0xc8] */ ARM64("str xzr, [sp, #0xc8]");
    /* 0x00b686bc: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b686c0: mov      w25, #0x18 */ ARM64("mov w25, #0x18");
    /* 0x00b686c4: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
    /* 0x00b686c8: tbnz     w22, #0, #0xb68664 */ if (((w22 >> #0) & 1) != 0) goto loc_00b68664;
loc_00b686cc:
    /* 0x00b686cc: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b686d0: ldr      x8, [sp, #0x258] */ ARM64("ldr x8, [sp, #0x258]");
    /* 0x00b686d4: ldr      x9, [sp, #0x250] */ ARM64("ldr x9, [sp, #0x250]");
    /* 0x00b686d8: ldr      x26, [sp, #0x248] */ ARM64("ldr x26, [sp, #0x248]");
    /* 0x00b686dc: mov      x12, #0x6575 */ ARM64("mov x12, #0x6575");
    /* 0x00b686e0: movk     x12, #0x7073, lsl #16 */ ARM64("movk x12, #0x7073, lsl #16");
    /* 0x00b686e4: movk     x12, #0x6d65, lsl #32 */ ARM64("movk x12, #0x6d65, lsl #32");
    /* 0x00b686e8: movk     x12, #0x736f, lsl #48 */ ARM64("movk x12, #0x736f, lsl #48");
    /* 0x00b686ec: eor      x10, x9, x12 */ ARM64("eor x10, x9, x12");
    /* 0x00b686f0: mov      x14, #0x6f6d */ ARM64("mov x14, #0x6f6d");
    /* 0x00b686f4: movk     x14, #0x6e64, lsl #16 */ ARM64("movk x14, #0x6e64, lsl #16");
    /* 0x00b686f8: movk     x14, #0x7261, lsl #32 */ ARM64("movk x14, #0x7261, lsl #32");
    /* 0x00b686fc: movk     x14, #0x646f, lsl #48 */ ARM64("movk x14, #0x646f, lsl #48");
    /* 0x00b68700: eor      x11, x8, x14 */ ARM64("eor x11, x8, x14");
    /* 0x00b68704: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00b68708: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00b6870c: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00b68710: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00b68714: eor      x17, x9, x13 */ ARM64("eor x17, x9, x13");
    /* 0x00b68718: add      x9, x11, x10 */ ARM64("add x9, x11, x10");
    /* 0x00b6871c: eor      x1, x9, x11, ror #51 */ ARM64("eor x1, x9, x11, ror #51");
    /* 0x00b68720: ror      x2, x9, #0x20 */ ARM64("ror x2, x9, #0x20");
    /* 0x00b68724: ror      x3, x1, #0x2f */ ARM64("ror x3, x1, #0x2f");
    /* 0x00b68728: eor      x9, x23, x12 */ ARM64("eor x9, x23, x12");
    /* 0x00b6872c: eor      x10, x24, x14 */ ARM64("eor x10, x24, x14");
    /* 0x00b68730: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b68734: eor      x4, x9, x10, ror #51 */ ARM64("eor x4, x9, x10, ror #51");
    /* 0x00b68738: ldr      x5, [sp, #0x238] */ ARM64("ldr x5, [sp, #0x238]");
    /* 0x00b6873c: ldr      x6, [sp, #0x240] */ ARM64("ldr x6, [sp, #0x240]");
    /* 0x00b68740: mov      x10, #0x6573 */ ARM64("mov x10, #0x6573");
    /* 0x00b68744: movk     x10, #0x7974, lsl #16 */ ARM64("movk x10, #0x7974, lsl #16");
    /* 0x00b68748: movk     x10, #0x6462, lsl #32 */ ARM64("movk x10, #0x6462, lsl #32");
    /* 0x00b6874c: movk     x10, #0x7465, lsl #48 */ ARM64("movk x10, #0x7465, lsl #48");
    /* 0x00b68750: eor      x7, x8, x10 */ ARM64("eor x7, x8, x10");
    /* 0x00b68754: eor      x0, x23, x13 */ ARM64("eor x0, x23, x13");
    /* 0x00b68758: eor      x30, x24, x10 */ ARM64("eor x30, x24, x10");
    /* 0x00b6875c: ror      x8, x9, #0x20 */ ARM64("ror x8, x9, #0x20");
    /* 0x00b68760: str      x8, [sp, #0x160] */ ARM64("str x8, [sp, #0x160]");
    /* 0x00b68764: ror      x8, x4, #0x2f */ ARM64("ror x8, x4, #0x2f");
    /* 0x00b68768: str      x8, [sp, #0xe8] */ ARM64("str x8, [sp, #0xe8]");
    /* 0x00b6876c: ldr      x24, [sp, #0x178] */ ARM64("ldr x24, [sp, #0x178]");
loc_00b68770:
    /* 0x00b68770: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b68774: ldr      x9, [sp, #0x180] */ ARM64("ldr x9, [sp, #0x180]");
    /* 0x00b68778: ldr      w9, [x9, x22, lsl #2] */ ARM64("ldr w9, [x9, x22, lsl #2]");
    /* 0x00b6877c: orr      x10, x9, #0x400000000000000 */ ARM64("orr x10, x9, #0x400000000000000");
    /* 0x00b68780: eor      x11, x10, x7 */ ARM64("eor x11, x10, x7");
    /* 0x00b68784: add      x12, x11, x17 */ ARM64("add x12, x11, x17");
    /* 0x00b68788: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b6878c: add      x12, x12, x1 */ ARM64("add x12, x12, x1");
    /* 0x00b68790: add      x13, x11, x2 */ ARM64("add x13, x11, x2");
    /* 0x00b68794: eor      x11, x13, x11, ror #43 */ ARM64("eor x11, x13, x11, ror #43");
    /* 0x00b68798: eor      x10, x13, x10 */ ARM64("eor x10, x13, x10");
    /* 0x00b6879c: eor      x13, x12, x3 */ ARM64("eor x13, x12, x3");
    /* 0x00b687a0: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b687a4: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b687a8: add      x10, x10, x13 */ ARM64("add x10, x10, x13");
    /* 0x00b687ac: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b687b0: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b687b4: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b687b8: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b687bc: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b687c0: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b687c4: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b687c8: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b687cc: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b687d0: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b687d4: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b687d8: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b687dc: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b687e0: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b687e4: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b687e8: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b687ec: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b687f0: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b687f4: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b687f8: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b687fc: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b68800: eor      x10, x10, x13, ror #51 */ ARM64("eor x10, x10, x13, ror #51");
    /* 0x00b68804: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b68808: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b6880c: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b68810: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b68814: eor      x10, x10, x12, ror #32 */ ARM64("eor x10, x10, x12, ror #32");
    /* 0x00b68818: eor      x11, x10, x12 */ ARM64("eor x11, x10, x12");
    /* 0x00b6881c: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00b68820: ldr      x10, [sp, #0x230] */ ARM64("ldr x10, [sp, #0x230]");
    /* 0x00b68824: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00b68828: and      x12, x11, x5 */ ARM64("and x12, x11, x5");
    /* 0x00b6882c: ldr      d1, [x10, x12] */ ARM64("ldr d1, [x10, x12]");
    /* 0x00b68830: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b68834: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b68838: ands     x13, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6883c: b.eq     #0xb68874 */ if (COND_EQ) goto loc_00b68874;
loc_00b68840:
    /* 0x00b68840: rbit     x11, x13 */ ARM64("rbit x11, x13");
    /* 0x00b68844: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b68848: add      x11, x12, x11, lsr #3 */ ARM64("add x11, x12, x11, lsr #3");
    /* 0x00b6884c: and      x14, x11, x5 */ ARM64("and x14, x11, x5");
    /* 0x00b68850: mov      w11, #0x38 */ ARM64("mov w11, #0x38");
    /* 0x00b68854: mneg     x11, x14, x11 */ ARM64("mneg x11, x14, x11");
    /* 0x00b68858: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b6885c: ldur     w15, [x11, #-0x38] */ ARM64("ldur w15, [x11, #-0x38]");
    /* 0x00b68860: cmp      w9, w15 */ ARM64("cmp w9, w15");
    /* 0x00b68864: b.eq     #0xb688ac */ if (COND_EQ) goto loc_00b688ac;
    /* 0x00b68868: sub      x11, x13, #1 */ ARM64("sub x11, x13, #1");
    /* 0x00b6886c: ands     x13, x11, x13 */ ARM64("ands x13, x11, x13");
    /* 0x00b68870: b.ne     #0xb68840 */ if (COND_NE) goto loc_00b68840;
loc_00b68874:
    /* 0x00b68874: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b68878: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b6887c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b68880: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b68884: tbnz     w11, #0, #0xb68dd4 */ if (((w11 >> #0) & 1) != 0) goto loc_00b68dd4;
    /* 0x00b68888: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b6888c: add      x11, x12, x8 */ ARM64("add x11, x12, x8");
    /* 0x00b68890: and      x12, x11, x5 */ ARM64("and x12, x11, x5");
    /* 0x00b68894: ldr      d1, [x10, x12] */ ARM64("ldr d1, [x10, x12]");
    /* 0x00b68898: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6889c: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b688a0: ands     x13, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b688a4: b.ne     #0xb68840 */ if (COND_NE) goto loc_00b68840;
    /* 0x00b688a8: b        #0xb68874 */ goto loc_00b68874;
loc_00b688ac:
    /* 0x00b688ac: lsl      x8, x14, #6 */ ARM64("lsl x8, x14, #6");
    /* 0x00b688b0: sub      x8, x8, x14, lsl #3 */ ARM64("sub x8, x8, x14, lsl #3");
    /* 0x00b688b4: asr      x8, x8, #3 */ ARM64("asr x8, x8, #3");
    /* 0x00b688b8: mov      x9, #0x6db7 */ ARM64("mov x9, #0x6db7");
    /* 0x00b688bc: movk     x9, #0xb6db, lsl #16 */ ARM64("movk x9, #0xb6db, lsl #16");
    /* 0x00b688c0: movk     x9, #0xdb6d, lsl #32 */ ARM64("movk x9, #0xdb6d, lsl #32");
    /* 0x00b688c4: movk     x9, #0x6db6, lsl #48 */ ARM64("movk x9, #0x6db6, lsl #48");
    /* 0x00b688c8: mul      x8, x8, x9 */ ARM64("mul x8, x8, x9");
    /* 0x00b688cc: sub      x9, x8, #8 */ ARM64("sub x9, x8, #8");
    /* 0x00b688d0: and      x9, x9, x5 */ ARM64("and x9, x9, x5");
    /* 0x00b688d4: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b688d8: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b688dc: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00b688e0: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00b688e4: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00b688e8: ldr      d0, [x10, x8] */ ARM64("ldr d0, [x10, x8]");
    /* 0x00b688ec: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00b688f0: fmov     x13, d0 */ ARM64("fmov x13, d0");
    /* 0x00b688f4: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b688f8: rbit     x13, x13 */ ARM64("rbit x13, x13");
    /* 0x00b688fc: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b68900: lsr      x13, x13, #3 */ ARM64("lsr x13, x13, #3");
    /* 0x00b68904: add      x12, x13, x12, lsr #3 */ ARM64("add x12, x13, x12, lsr #3");
    /* 0x00b68908: cmp      x12, #7 */ ARM64("cmp x12, #7");
    /* 0x00b6890c: b.ls     #0xb68930 */ if (COND_LS) goto loc_00b68930;
    /* 0x00b68910: mov      w12, #0x80 */ ARM64("mov w12, #0x80");
    /* 0x00b68914: strb     w12, [x10, x8] */ ARM64("strb w12, [x10, x8]");
    /* 0x00b68918: strb     w12, [x9, #8] */ ARM64("strb w12, [x9, #8]");
    /* 0x00b6891c: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
    /* 0x00b68920: str      x26, [sp, #0x248] */ ARM64("str x26, [sp, #0x248]");
    /* 0x00b68924: ldur     x27, [x11, #-0x30] */ ARM64("ldur x27, [x11, #-0x30]");
    /* 0x00b68928: cbnz     x27, #0xb68954 */ if (x27 != 0) goto loc_00b68954;
    /* 0x00b6892c: b        #0xb68dd4 */ goto loc_00b68dd4;
loc_00b68930:
    /* 0x00b68930: add      x6, x6, #1 */ ARM64("add x6, x6, #1");
    /* 0x00b68934: str      x6, [sp, #0x240] */ ARM64("str x6, [sp, #0x240]");
    /* 0x00b68938: mov      w12, #0xff */ ARM64("mov w12, #0xff");
    /* 0x00b6893c: strb     w12, [x10, x8] */ ARM64("strb w12, [x10, x8]");
    /* 0x00b68940: strb     w12, [x9, #8] */ ARM64("strb w12, [x9, #8]");
    /* 0x00b68944: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
    /* 0x00b68948: str      x26, [sp, #0x248] */ ARM64("str x26, [sp, #0x248]");
    /* 0x00b6894c: ldur     x27, [x11, #-0x30] */ ARM64("ldur x27, [x11, #-0x30]");
    /* 0x00b68950: cbz      x27, #0xb68dd4 */ if (x27 == 0) goto loc_00b68dd4;
loc_00b68954:
    /* 0x00b68954: ldur     x12, [x11, #-0x28] */ ARM64("ldur x12, [x11, #-0x28]");
    /* 0x00b68958: ldur     x14, [x11, #-0x18] */ ARM64("ldur x14, [x11, #-0x18]");
    /* 0x00b6895c: ldr      d0, [x27] */ ARM64("ldr d0, [x27]");
    /* 0x00b68960: cbz      x12, #0xb68998 */ if (x12 == 0) goto loc_00b68998;
    /* 0x00b68964: mov      x10, x0 */ ARM64("mov x10, x0");
    /* 0x00b68968: lsl      x8, x12, #2 */ ARM64("lsl x8, x12, #2");
    /* 0x00b6896c: add      x8, x8, #0xb */ ARM64("add x8, x8, #0xb");
    /* 0x00b68970: and      x9, x8, #0xfffffffffffffff8 */ ARM64("and x9, x8, #0xfffffffffffffff8");
    /* 0x00b68974: add      x8, x12, x9 */ ARM64("add x8, x12, x9");
    /* 0x00b68978: adds     x8, x8, #9 */ ARM64("adds x8, x8, #9");
    /* 0x00b6897c: sub      x0, x27, x9 */ ARM64("sub x0, x27, x9");
    /* 0x00b68980: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00b68984: cbz      x14, #0xb68d94 */ if (x14 == 0) goto loc_00b68d94;
    /* 0x00b68988: str      w9, [sp, #0x78] */ ARM64("str w9, [sp, #0x78]");
    /* 0x00b6898c: str      x0, [sp, #0x70] */ ARM64("str x0, [sp, #0x70]");
    /* 0x00b68990: mov      x0, x10 */ ARM64("mov x0, x10");
    /* 0x00b68994: b        #0xb6899c */ goto loc_00b6899c;
loc_00b68998:
    /* 0x00b68998: cbz      x14, #0xb68dd4 */ if (x14 == 0) goto loc_00b68dd4;
loc_00b6899c:
    /* 0x00b6899c: str      x12, [sp, #0x88] */ ARM64("str x12, [sp, #0x88]");
    /* 0x00b689a0: add      x23, x27, #8 */ ARM64("add x23, x27, #8");
    /* 0x00b689a4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b689a8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b689ac: ands     x9, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x9, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b689b0: b.ne     #0xb689cc */ if (COND_NE) goto loc_00b689cc;
loc_00b689b4:
    /* 0x00b689b4: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00b689b8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b689bc: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b689c0: sub      x27, x27, #0x20 */ ARM64("sub x27, x27, #0x20");
    /* 0x00b689c4: and      x9, x8, #0x8080808080808080 */ ARM64("and x9, x8, #0x8080808080808080");
    /* 0x00b689c8: cbz      x9, #0xb689b4 */ if (x9 == 0) goto loc_00b689b4;
loc_00b689cc:
    /* 0x00b689cc: cbz      x16, #0xb69f2c */ if (x16 == 0) goto loc_00b69f2c;
    /* 0x00b689d0: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b689d4: sub      x10, x9, #1 */ ARM64("sub x10, x9, #1");
    /* 0x00b689d8: rbit     x11, x9 */ ARM64("rbit x11, x9");
    /* 0x00b689dc: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b689e0: and      x25, x10, x9 */ ARM64("and x25, x10, x9");
    /* 0x00b689e4: lsr      x9, x11, #1 */ ARM64("lsr x9, x11, #1");
    /* 0x00b689e8: and      x9, x9, #0x3c */ ARM64("and x9, x9, #0x3c");
    /* 0x00b689ec: sub      x9, x27, x9 */ ARM64("sub x9, x27, x9");
    /* 0x00b689f0: sub      x15, x14, #1 */ ARM64("sub x15, x14, #1");
    /* 0x00b689f4: ldur     w9, [x9, #-4] */ ARM64("ldur w9, [x9, #-4]");
    /* 0x00b689f8: orr      x10, x9, #0x400000000000000 */ ARM64("orr x10, x9, #0x400000000000000");
    /* 0x00b689fc: eor      x11, x10, x30 */ ARM64("eor x11, x10, x30");
    /* 0x00b68a00: add      x12, x11, x0 */ ARM64("add x12, x11, x0");
    /* 0x00b68a04: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b68a08: add      x12, x12, x4 */ ARM64("add x12, x12, x4");
    /* 0x00b68a0c: ldr      x13, [sp, #0x160] */ ARM64("ldr x13, [sp, #0x160]");
    /* 0x00b68a10: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00b68a14: eor      x11, x13, x11, ror #43 */ ARM64("eor x11, x13, x11, ror #43");
    /* 0x00b68a18: eor      x10, x13, x10 */ ARM64("eor x10, x13, x10");
    /* 0x00b68a1c: ldr      x13, [sp, #0xe8] */ ARM64("ldr x13, [sp, #0xe8]");
    /* 0x00b68a20: eor      x13, x12, x13 */ ARM64("eor x13, x12, x13");
    /* 0x00b68a24: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b68a28: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b68a2c: add      x10, x10, x13 */ ARM64("add x10, x10, x13");
    /* 0x00b68a30: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b68a34: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b68a38: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b68a3c: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b68a40: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b68a44: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b68a48: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b68a4c: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b68a50: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b68a54: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b68a58: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b68a5c: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b68a60: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b68a64: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b68a68: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b68a6c: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b68a70: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b68a74: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b68a78: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b68a7c: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b68a80: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b68a84: eor      x10, x10, x13, ror #51 */ ARM64("eor x10, x10, x13, ror #51");
    /* 0x00b68a88: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b68a8c: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b68a90: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b68a94: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b68a98: eor      x10, x10, x12, ror #32 */ ARM64("eor x10, x10, x12, ror #32");
    /* 0x00b68a9c: eor      x10, x10, x12 */ ARM64("eor x10, x10, x12");
    /* 0x00b68aa0: lsr      x11, x10, #0x39 */ ARM64("lsr x11, x10, #0x39");
    /* 0x00b68aa4: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
loc_00b68aa8:
    /* 0x00b68aa8: ldr      x11, [sp, #0x120] */ ARM64("ldr x11, [sp, #0x120]");
    /* 0x00b68aac: and      x10, x10, x11 */ ARM64("and x10, x10, x11");
    /* 0x00b68ab0: ldr      d1, [x21, x10] */ ARM64("ldr d1, [x21, x10]");
    /* 0x00b68ab4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b68ab8: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b68abc: ands     x12, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b68ac0: b.eq     #0xb68af4 */ if (COND_EQ) goto loc_00b68af4;
loc_00b68ac4:
    /* 0x00b68ac4: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00b68ac8: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b68acc: add      x11, x10, x11, lsr #3 */ ARM64("add x11, x10, x11, lsr #3");
    /* 0x00b68ad0: ldr      x13, [sp, #0x120] */ ARM64("ldr x13, [sp, #0x120]");
    /* 0x00b68ad4: and      x11, x11, x13 */ ARM64("and x11, x11, x13");
    /* 0x00b68ad8: sub      x11, x21, x11, lsl #4 */ ARM64("sub x11, x21, x11, lsl #4");
    /* 0x00b68adc: ldur     w13, [x11, #-0x10] */ ARM64("ldur w13, [x11, #-0x10]");
    /* 0x00b68ae0: cmp      w9, w13 */ ARM64("cmp w9, w13");
    /* 0x00b68ae4: b.eq     #0xb68b14 */ if (COND_EQ) goto loc_00b68b14;
    /* 0x00b68ae8: sub      x11, x12, #1 */ ARM64("sub x11, x12, #1");
    /* 0x00b68aec: ands     x12, x11, x12 */ ARM64("ands x12, x11, x12");
    /* 0x00b68af0: b.ne     #0xb68ac4 */ if (COND_NE) goto loc_00b68ac4;
loc_00b68af4:
    /* 0x00b68af4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b68af8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b68afc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b68b00: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b68b04: tbnz     w11, #0, #0xb69f2c */ if (((w11 >> #0) & 1) != 0) goto loc_00b69f2c;
    /* 0x00b68b08: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b68b0c: add      x10, x10, x8 */ ARM64("add x10, x10, x8");
    /* 0x00b68b10: b        #0xb68aa8 */ goto loc_00b68aa8;
loc_00b68b14:
    /* 0x00b68b14: mov      x10, x0 */ ARM64("mov x10, x0");
    /* 0x00b68b18: str      x30, [sp, #0x80] */ ARM64("str x30, [sp, #0x80]");
    /* 0x00b68b1c: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b68b20: adds     x8, x15, #1 */ ARM64("adds x8, x15, #1");
    /* 0x00b68b24: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00b68b28: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00b68b2c: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b68b30: csel     x24, x8, x9, hi */ ARM64("csel x24, x8, x9, hi");
    /* 0x00b68b34: lsr      x8, x8, #0x3d */ ARM64("lsr x8, x8, #0x3d");
    /* 0x00b68b38: cbnz     x8, #0xb6b9d0 */ if (x8 != 0) goto loc_00b6b9d0;
    /* 0x00b68b3c: str      x26, [sp, #8] */ ARM64("str x26, [sp, #8]");
    /* 0x00b68b40: lsl      x26, x24, #3 */ ARM64("lsl x26, x24, #3");
    /* 0x00b68b44: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00b68b48: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b68b4c: b.hi     #0xb6b9d0 */ if (COND_HI) goto loc_00b6b9d0;
    /* 0x00b68b50: sub      x8, x14, #1 */ ARM64("sub x8, x14, #1");
    /* 0x00b68b54: str      x8, [sp, #0x10] */ ARM64("str x8, [sp, #0x10]");
    /* 0x00b68b58: str      x14, [sp] */ ARM64("str x14, [sp]");
    /* 0x00b68b5c: stp      x10, x7, [sp, #0x30] */ ARM64("stp x10, x7, [sp, #0x30]");
    /* 0x00b68b60: stp      x6, x5, [sp, #0x40] */ ARM64("stp x6, x5, [sp, #0x40]");
    /* 0x00b68b64: stp      x4, x3, [sp, #0x50] */ ARM64("stp x4, x3, [sp, #0x50]");
    /* 0x00b68b68: stp      x2, x17, [sp, #0x20] */ ARM64("stp x2, x17, [sp, #0x20]");
    /* 0x00b68b6c: stp      x1, x16, [sp, #0x60] */ ARM64("stp x1, x16, [sp, #0x60]");
    /* 0x00b68b70: mov      x21, x28 */ ARM64("mov x21, x28");
    /* 0x00b68b74: ldur     x28, [x11, #-8] */ ARM64("ldur x28, [x11, #-8]");
    /* 0x00b68b78: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b68b7c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b68b80: cbz      x0, #0xb6b9c0 */ if (x0 == 0) goto loc_00b6b9c0;
    /* 0x00b68b84: str      x28, [x0] */ ARM64("str x28, [x0]");
    /* 0x00b68b88: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00b68b8c: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b68b90: str      x24, [sp, #0x470] */ ARM64("str x24, [sp, #0x470]");
    /* 0x00b68b94: str      x0, [sp, #0x18] */ ARM64("str x0, [sp, #0x18]");
    /* 0x00b68b98: str      x0, [sp, #0x478] */ ARM64("str x0, [sp, #0x478]");
    /* 0x00b68b9c: mov      x28, x21 */ ARM64("mov x28, x21");
    /* 0x00b68ba0: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
    /* 0x00b68ba4: ldp      x1, x16, [sp, #0x60] */ ARM64("ldp x1, x16, [sp, #0x60]");
    /* 0x00b68ba8: ldp      x2, x17, [sp, #0x20] */ ARM64("ldp x2, x17, [sp, #0x20]");
    /* 0x00b68bac: ldp      x4, x3, [sp, #0x50] */ ARM64("ldp x4, x3, [sp, #0x50]");
    /* 0x00b68bb0: ldp      x6, x5, [sp, #0x40] */ ARM64("ldp x6, x5, [sp, #0x40]");
    /* 0x00b68bb4: ldp      x0, x7, [sp, #0x30] */ ARM64("ldp x0, x7, [sp, #0x30]");
    /* 0x00b68bb8: ldr      x30, [sp, #0x80] */ ARM64("ldr x30, [sp, #0x80]");
    /* 0x00b68bbc: ldr      x15, [sp, #0x10] */ ARM64("ldr x15, [sp, #0x10]");
    /* 0x00b68bc0: b        #0xb68bcc */ goto loc_00b68bcc;
loc_00b68bc4:
    /* 0x00b68bc4: str      x10, [x8, x26, lsl #3] */ ARM64("str x10, [x8, x26, lsl #3]");
    /* 0x00b68bc8: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
loc_00b68bcc:
    /* 0x00b68bcc: str      x26, [sp, #0x480] */ ARM64("str x26, [sp, #0x480]");
    /* 0x00b68bd0: ldr      x24, [sp, #0x178] */ ARM64("ldr x24, [sp, #0x178]");
    /* 0x00b68bd4: cbz      x15, #0xb68e0c */ if (x15 == 0) goto loc_00b68e0c;
    /* 0x00b68bd8: cbnz     x25, #0xb68bf4 */ if (x25 != 0) goto loc_00b68bf4;
loc_00b68bdc:
    /* 0x00b68bdc: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00b68be0: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b68be4: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b68be8: sub      x27, x27, #0x20 */ ARM64("sub x27, x27, #0x20");
    /* 0x00b68bec: and      x25, x9, #0x8080808080808080 */ ARM64("and x25, x9, #0x8080808080808080");
    /* 0x00b68bf0: cbz      x25, #0xb68bdc */ if (x25 == 0) goto loc_00b68bdc;
loc_00b68bf4:
    /* 0x00b68bf4: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b68bf8: sub      x10, x25, #1 */ ARM64("sub x10, x25, #1");
    /* 0x00b68bfc: rbit     x11, x25 */ ARM64("rbit x11, x25");
    /* 0x00b68c00: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b68c04: and      x25, x10, x25 */ ARM64("and x25, x10, x25");
    /* 0x00b68c08: lsr      x10, x11, #1 */ ARM64("lsr x10, x11, #1");
    /* 0x00b68c0c: and      x10, x10, #0x3c */ ARM64("and x10, x10, #0x3c");
    /* 0x00b68c10: sub      x10, x27, x10 */ ARM64("sub x10, x27, x10");
    /* 0x00b68c14: sub      x15, x15, #1 */ ARM64("sub x15, x15, #1");
    /* 0x00b68c18: ldur     w10, [x10, #-4] */ ARM64("ldur w10, [x10, #-4]");
    /* 0x00b68c1c: orr      x11, x10, #0x400000000000000 */ ARM64("orr x11, x10, #0x400000000000000");
    /* 0x00b68c20: eor      x12, x11, x30 */ ARM64("eor x12, x11, x30");
    /* 0x00b68c24: add      x13, x12, x0 */ ARM64("add x13, x12, x0");
    /* 0x00b68c28: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b68c2c: add      x13, x13, x4 */ ARM64("add x13, x13, x4");
    /* 0x00b68c30: ldr      x14, [sp, #0x160] */ ARM64("ldr x14, [sp, #0x160]");
    /* 0x00b68c34: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00b68c38: eor      x12, x14, x12, ror #43 */ ARM64("eor x12, x14, x12, ror #43");
    /* 0x00b68c3c: eor      x11, x14, x11 */ ARM64("eor x11, x14, x11");
    /* 0x00b68c40: ldr      x14, [sp, #0xe8] */ ARM64("ldr x14, [sp, #0xe8]");
    /* 0x00b68c44: eor      x14, x13, x14 */ ARM64("eor x14, x13, x14");
    /* 0x00b68c48: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b68c4c: eor      x13, x13, #0xff */ ARM64("eor x13, x13, #0xff");
    /* 0x00b68c50: add      x11, x11, x14 */ ARM64("add x11, x11, x14");
    /* 0x00b68c54: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b68c58: eor      x14, x11, x14, ror #51 */ ARM64("eor x14, x11, x14, ror #51");
    /* 0x00b68c5c: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b68c60: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68c64: add      x13, x14, x13 */ ARM64("add x13, x14, x13");
    /* 0x00b68c68: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b68c6c: eor      x14, x13, x14, ror #47 */ ARM64("eor x14, x13, x14, ror #47");
    /* 0x00b68c70: eor      x12, x11, x12, ror #43 */ ARM64("eor x12, x11, x12, ror #43");
    /* 0x00b68c74: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b68c78: add      x11, x14, x11 */ ARM64("add x11, x14, x11");
    /* 0x00b68c7c: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b68c80: eor      x14, x11, x14, ror #51 */ ARM64("eor x14, x11, x14, ror #51");
    /* 0x00b68c84: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b68c88: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b68c8c: add      x13, x14, x13 */ ARM64("add x13, x14, x13");
    /* 0x00b68c90: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b68c94: eor      x14, x13, x14, ror #47 */ ARM64("eor x14, x13, x14, ror #47");
    /* 0x00b68c98: eor      x12, x11, x12, ror #43 */ ARM64("eor x12, x11, x12, ror #43");
    /* 0x00b68c9c: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b68ca0: add      x11, x14, x11 */ ARM64("add x11, x14, x11");
    /* 0x00b68ca4: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b68ca8: eor      x11, x11, x14, ror #51 */ ARM64("eor x11, x11, x14, ror #51");
    /* 0x00b68cac: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b68cb0: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00b68cb4: ror      x12, x12, #0x2b */ ARM64("ror x12, x12, #0x2b");
    /* 0x00b68cb8: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b68cbc: eor      x11, x11, x13, ror #32 */ ARM64("eor x11, x11, x13, ror #32");
    /* 0x00b68cc0: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00b68cc4: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00b68cc8: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
loc_00b68ccc:
    /* 0x00b68ccc: ldr      x12, [sp, #0x120] */ ARM64("ldr x12, [sp, #0x120]");
    /* 0x00b68cd0: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b68cd4: ldr      d1, [x21, x11] */ ARM64("ldr d1, [x21, x11]");
    /* 0x00b68cd8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b68cdc: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b68ce0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b68ce4: b.eq     #0xb68d18 */ if (COND_EQ) goto loc_00b68d18;
loc_00b68ce8:
    /* 0x00b68ce8: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b68cec: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b68cf0: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b68cf4: ldr      x14, [sp, #0x120] */ ARM64("ldr x14, [sp, #0x120]");
    /* 0x00b68cf8: and      x13, x13, x14 */ ARM64("and x13, x13, x14");
    /* 0x00b68cfc: sub      x13, x21, x13, lsl #4 */ ARM64("sub x13, x21, x13, lsl #4");
    /* 0x00b68d00: ldur     w14, [x13, #-0x10] */ ARM64("ldur w14, [x13, #-0x10]");
    /* 0x00b68d04: cmp      w10, w14 */ ARM64("cmp w10, w14");
    /* 0x00b68d08: b.eq     #0xb68d38 */ if (COND_EQ) goto loc_00b68d38;
    /* 0x00b68d0c: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b68d10: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b68d14: b.ne     #0xb68ce8 */ if (COND_NE) goto loc_00b68ce8;
loc_00b68d18:
    /* 0x00b68d18: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b68d1c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b68d20: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b68d24: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b68d28: tbnz     w12, #0, #0xb69f40 */ if (((w12 >> #0) & 1) != 0) goto loc_00b69f40;
    /* 0x00b68d2c: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00b68d30: add      x11, x11, x9 */ ARM64("add x11, x11, x9");
    /* 0x00b68d34: b        #0xb68ccc */ goto loc_00b68ccc;
loc_00b68d38:
    /* 0x00b68d38: ldur     x10, [x13, #-8] */ ARM64("ldur x10, [x13, #-8]");
    /* 0x00b68d3c: ldr      x9, [sp, #0x470] */ ARM64("ldr x9, [sp, #0x470]");
    /* 0x00b68d40: cmp      x26, x9 */ ARM64("cmp x26, x9");
    /* 0x00b68d44: b.ne     #0xb68bc4 */ if (COND_NE) goto loc_00b68bc4;
    /* 0x00b68d48: str      x10, [sp, #0x10] */ ARM64("str x10, [sp, #0x10]");
    /* 0x00b68d4c: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b68d50: mov      x24, x15 */ ARM64("mov x24, x15");
    /* 0x00b68d54: adds     x8, x15, #1 */ ARM64("adds x8, x15, #1");
    /* 0x00b68d58: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00b68d5c: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b68d60: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b68d64: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00b68d68: bl       #0xc6c0cc */ CALL_DIRECT(sub_00c6c0cc);
    /* 0x00b68d6c: ldr      x8, [sp, #0x478] */ ARM64("ldr x8, [sp, #0x478]");
    /* 0x00b68d70: ldp      x1, x16, [sp, #0x60] */ ARM64("ldp x1, x16, [sp, #0x60]");
    /* 0x00b68d74: ldp      x2, x17, [sp, #0x20] */ ARM64("ldp x2, x17, [sp, #0x20]");
    /* 0x00b68d78: ldp      x4, x3, [sp, #0x50] */ ARM64("ldp x4, x3, [sp, #0x50]");
    /* 0x00b68d7c: ldp      x6, x5, [sp, #0x40] */ ARM64("ldp x6, x5, [sp, #0x40]");
    /* 0x00b68d80: ldp      x0, x7, [sp, #0x30] */ ARM64("ldp x0, x7, [sp, #0x30]");
    /* 0x00b68d84: ldr      x30, [sp, #0x80] */ ARM64("ldr x30, [sp, #0x80]");
    /* 0x00b68d88: mov      x15, x24 */ ARM64("mov x15, x24");
    /* 0x00b68d8c: ldr      x10, [sp, #0x10] */ ARM64("ldr x10, [sp, #0x10]");
    /* 0x00b68d90: b        #0xb68bc4 */ goto loc_00b68bc4;
loc_00b68d94:
    /* 0x00b68d94: cbz      x8, #0xb68dfc */ if (x8 == 0) goto loc_00b68dfc;
    /* 0x00b68d98: str      x30, [sp, #0x80] */ ARM64("str x30, [sp, #0x80]");
    /* 0x00b68d9c: stp      x1, x16, [sp, #0x60] */ ARM64("stp x1, x16, [sp, #0x60]");
    /* 0x00b68da0: mov      x27, x17 */ ARM64("mov x27, x17");
    /* 0x00b68da4: mov      x23, x2 */ ARM64("mov x23, x2");
    /* 0x00b68da8: stp      x4, x3, [sp, #0x50] */ ARM64("stp x4, x3, [sp, #0x50]");
    /* 0x00b68dac: stp      x6, x5, [sp, #0x40] */ ARM64("stp x6, x5, [sp, #0x40]");
    /* 0x00b68db0: stp      x10, x7, [sp, #0x30] */ ARM64("stp x10, x7, [sp, #0x30]");
    /* 0x00b68db4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b68db8: ldr      x30, [sp, #0x80] */ ARM64("ldr x30, [sp, #0x80]");
    /* 0x00b68dbc: ldp      x0, x7, [sp, #0x30] */ ARM64("ldp x0, x7, [sp, #0x30]");
    /* 0x00b68dc0: ldp      x6, x5, [sp, #0x40] */ ARM64("ldp x6, x5, [sp, #0x40]");
    /* 0x00b68dc4: ldp      x4, x3, [sp, #0x50] */ ARM64("ldp x4, x3, [sp, #0x50]");
    /* 0x00b68dc8: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b68dcc: ldp      x1, x16, [sp, #0x60] */ ARM64("ldp x1, x16, [sp, #0x60]");
    /* 0x00b68dd0: mov      x17, x27 */ ARM64("mov x17, x27");
loc_00b68dd4:
    /* 0x00b68dd4: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00b68dd8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b68ddc: mov      w9, #8 */ ARM64("mov w9, #8");
loc_00b68de0:
    /* 0x00b68de0: madd     x10, x22, x25, x28 */ ARM64("madd x10, x22, x25, x28");
    /* 0x00b68de4: stp      x8, x9, [x10] */ ARM64("stp x8, x9, [x10]");
    /* 0x00b68de8: str      x11, [x10, #0x10] */ ARM64("str x11, [x10, #0x10]");
    /* 0x00b68dec: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b68df0: cmp      x22, x24 */ ARM64("cmp x22, x24");
    /* 0x00b68df4: b.ne     #0xb68770 */ if (COND_NE) goto loc_00b68770;
    /* 0x00b68df8: b        #0xb69c24 */ goto loc_00b69c24;
loc_00b68dfc:
    /* 0x00b68dfc: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00b68e00: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00b68e04: mov      x0, x10 */ ARM64("mov x0, x10");
    /* 0x00b68e08: b        #0xb68de0 */ goto loc_00b68de0;
loc_00b68e0c:
    /* 0x00b68e0c: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b68e10: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b68e14: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b68e18: ldr      w9, [sp, #0x78] */ ARM64("ldr w9, [sp, #0x78]");
    /* 0x00b68e1c: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b68e20: tbnz     w8, #0, #0xb68e44 */ if (((w8 >> #0) & 1) != 0) goto loc_00b68e44;
    /* 0x00b68e24: ldr      x0, [sp, #0x70] */ ARM64("ldr x0, [sp, #0x70]");
    /* 0x00b68e28: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b68e2c: ldr      x30, [sp, #0x80] */ ARM64("ldr x30, [sp, #0x80]");
    /* 0x00b68e30: ldp      x0, x7, [sp, #0x30] */ ARM64("ldp x0, x7, [sp, #0x30]");
    /* 0x00b68e34: ldp      x6, x5, [sp, #0x40] */ ARM64("ldp x6, x5, [sp, #0x40]");
    /* 0x00b68e38: ldp      x4, x3, [sp, #0x50] */ ARM64("ldp x4, x3, [sp, #0x50]");
    /* 0x00b68e3c: ldp      x2, x17, [sp, #0x20] */ ARM64("ldp x2, x17, [sp, #0x20]");
    /* 0x00b68e40: ldp      x1, x16, [sp, #0x60] */ ARM64("ldp x1, x16, [sp, #0x60]");
loc_00b68e44:
    /* 0x00b68e44: ldr      x8, [sp, #0x470] */ ARM64("ldr x8, [sp, #0x470]");
    /* 0x00b68e48: ldr      x9, [sp, #0x478] */ ARM64("ldr x9, [sp, #0x478]");
    /* 0x00b68e4c: mov      w25, #0x18 */ ARM64("mov w25, #0x18");
    /* 0x00b68e50: ldp      x11, x26, [sp] */ ARM64("ldp x11, x26, [sp]");
    /* 0x00b68e54: b        #0xb68de0 */ goto loc_00b68de0;
loc_00b68e58:
    /* 0x00b68e58: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00b68e5c: mov      w27, #1 */ ARM64("mov w27, #1");
    /* 0x00b68e60: add      x23, sp, #0x210 */ ARM64("add x23, sp, #0x210");
    /* 0x00b68e64: mov      x13, #-1 */ ARM64("mov x13, #-1");
    /* 0x00b68e68: mov      w17, #0x18 */ ARM64("mov w17, #0x18");
    /* 0x00b68e6c: b        #0xb68ebc */ goto loc_00b68ebc;
loc_00b68e70:
    /* 0x00b68e70: sub      x11, x24, #1 */ ARM64("sub x11, x24, #1");
    /* 0x00b68e74: and      x10, x11, #0xfffffffffffffffc */ ARM64("and x10, x11, #0xfffffffffffffffc");
    /* 0x00b68e78: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00b68e7c: and      x8, x8, #0xfffffffffffffffc */ ARM64("and x8, x8, #0xfffffffffffffffc");
    /* 0x00b68e80: mov      x12, x21 */ ARM64("mov x12, x21");
    /* 0x00b68e84: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
loc_00b68e88:
    /* 0x00b68e88: stp      q0, q0, [x12], #0x20 */ ARM64("stp q0, q0, [x12], #0x20");
    /* 0x00b68e8c: subs     x8, x8, #4 */ ARM64("subs x8, x8, #4");
    /* 0x00b68e90: b.ne     #0xb68e88 */ if (COND_NE) goto loc_00b68e88;
    /* 0x00b68e94: add      x8, x21, x10, lsl #3 */ ARM64("add x8, x21, x10, lsl #3");
    /* 0x00b68e98: cmp      x11, x10 */ ARM64("cmp x11, x10");
    /* 0x00b68e9c: b.eq     #0xb68eb8 */ if (COND_EQ) goto loc_00b68eb8;
    /* 0x00b68ea0: orr      x10, x10, #1 */ ARM64("orr x10, x10, #1");
loc_00b68ea4:
    /* 0x00b68ea4: ldr      x11, [sp, #0x118] */ ARM64("ldr x11, [sp, #0x118]");
    /* 0x00b68ea8: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
loc_00b68eac:
    /* 0x00b68eac: str      x13, [x8], #8 */ ARM64("str x13, [x8], #8");
    /* 0x00b68eb0: adds     x10, x10, #1 */ ARM64("adds x10, x10, #1");
    /* 0x00b68eb4: b.lo     #0xb68eac */ if (COND_LO) goto loc_00b68eac;
loc_00b68eb8:
    /* 0x00b68eb8: mov      x27, x24 */ ARM64("mov x27, x24");
loc_00b68ebc:
    /* 0x00b68ebc: str      x13, [x8] */ ARM64("str x13, [x8]");
    /* 0x00b68ec0: sub      x0, x24, #1 */ ARM64("sub x0, x24, #1");
    /* 0x00b68ec4: cmp      x0, x27 */ ARM64("cmp x0, x27");
    /* 0x00b68ec8: b.hs     #0xb6b794 */ if (COND_HS) goto loc_00b6b794;
    /* 0x00b68ecc: str      x0, [x21, x0, lsl #3] */ ARM64("str x0, [x21, x0, lsl #3]");
    /* 0x00b68ed0: cbz      x0, #0xb68fc8 */ if (x0 == 0) goto loc_00b68fc8;
    /* 0x00b68ed4: mov      w11, #0 */ ARM64("mov w11, #0");
    /* 0x00b68ed8: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
loc_00b68edc:
    /* 0x00b68edc: sub      x10, x8, #1 */ ARM64("sub x10, x8, #1");
    /* 0x00b68ee0: cmp      x10, x22 */ ARM64("cmp x10, x22");
    /* 0x00b68ee4: b.hs     #0xb6b770 */ if (COND_HS) goto loc_00b6b770;
    /* 0x00b68ee8: madd     x8, x10, x17, x28 */ ARM64("madd x8, x10, x17, x28");
    /* 0x00b68eec: ldp      x12, x8, [x8, #8] */ ARM64("ldp x12, x8, [x8, #8]");
    /* 0x00b68ef0: lsl      x13, x8, #3 */ ARM64("lsl x13, x8, #3");
    /* 0x00b68ef4: add      x14, x12, x13 */ ARM64("add x14, x12, x13");
loc_00b68ef8:
    /* 0x00b68ef8: cbz      x13, #0xb6b480 */ if (x13 == 0) goto loc_00b6b480;
    /* 0x00b68efc: ldr      x8, [x12], #8 */ ARM64("ldr x8, [x12], #8");
    /* 0x00b68f00: cmp      x8, x27 */ ARM64("cmp x8, x27");
    /* 0x00b68f04: b.hs     #0xb6b51c */ if (COND_HS) goto loc_00b6b51c;
    /* 0x00b68f08: ldr      x15, [x21, x8, lsl #3] */ ARM64("ldr x15, [x21, x8, lsl #3]");
    /* 0x00b68f0c: sub      x13, x13, #8 */ ARM64("sub x13, x13, #8");
    /* 0x00b68f10: cmn      x15, #1 */ ARM64("cmn x15, #1");
    /* 0x00b68f14: b.eq     #0xb68ef8 */ if (COND_EQ) goto loc_00b68ef8;
    /* 0x00b68f18: cmp      x12, x14 */ ARM64("cmp x12, x14");
    /* 0x00b68f1c: b.eq     #0xb68f90 */ if (COND_EQ) goto loc_00b68f90;
    /* 0x00b68f20: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00b68f24: sub      x14, x14, x12 */ ARM64("sub x14, x14, x12");
    /* 0x00b68f28: lsr      x14, x14, #3 */ ARM64("lsr x14, x14, #3");
    /* 0x00b68f2c: b        #0xb68f3c */ goto loc_00b68f3c;
loc_00b68f30:
    /* 0x00b68f30: add      x13, x13, #1 */ ARM64("add x13, x13, #1");
    /* 0x00b68f34: cmp      x13, x14 */ ARM64("cmp x13, x14");
    /* 0x00b68f38: b.eq     #0xb68f90 */ if (COND_EQ) goto loc_00b68f90;
loc_00b68f3c:
    /* 0x00b68f3c: ldr      x15, [x12, x13, lsl #3] */ ARM64("ldr x15, [x12, x13, lsl #3]");
    /* 0x00b68f40: cmp      x15, x27 */ ARM64("cmp x15, x27");
    /* 0x00b68f44: b.hs     #0xb6b518 */ if (COND_HS) goto loc_00b6b518;
    /* 0x00b68f48: ldr      x16, [x21, x15, lsl #3] */ ARM64("ldr x16, [x21, x15, lsl #3]");
    /* 0x00b68f4c: cmn      x16, #1 */ ARM64("cmn x16, #1");
    /* 0x00b68f50: b.eq     #0xb68f30 */ if (COND_EQ) goto loc_00b68f30;
loc_00b68f54:
    /* 0x00b68f54: cmp      x8, x15 */ ARM64("cmp x8, x15");
    /* 0x00b68f58: cset     w16, hi */ ARM64("cset w16, hi");
    /* 0x00b68f5c: csinv    w16, w16, wzr, hs */ ARM64("csinv w16, w16, wzr, hs");
    /* 0x00b68f60: and      w16, w16, #0xff */ ARM64("and w16, w16, #0xff");
    /* 0x00b68f64: cmp      w16, #0xff */ ARM64("cmp w16, #0xff");
    /* 0x00b68f68: b.ne     #0xb68f7c */ if (COND_NE) goto loc_00b68f7c;
    /* 0x00b68f6c: cmp      x8, x27 */ ARM64("cmp x8, x27");
    /* 0x00b68f70: b.hs     #0xb6b3f8 */ if (COND_HS) goto loc_00b6b3f8;
    /* 0x00b68f74: ldr      x8, [x21, x8, lsl #3] */ ARM64("ldr x8, [x21, x8, lsl #3]");
    /* 0x00b68f78: b        #0xb68f54 */ goto loc_00b68f54;
loc_00b68f7c:
    /* 0x00b68f7c: cbz      w16, #0xb68f30 */ if (w16 == 0) goto loc_00b68f30;
    /* 0x00b68f80: cmp      x15, x27 */ ARM64("cmp x15, x27");
    /* 0x00b68f84: b.hs     #0xb6b70c */ if (COND_HS) goto loc_00b6b70c;
    /* 0x00b68f88: ldr      x15, [x21, x15, lsl #3] */ ARM64("ldr x15, [x21, x15, lsl #3]");
    /* 0x00b68f8c: b        #0xb68f54 */ goto loc_00b68f54;
loc_00b68f90:
    /* 0x00b68f90: cmp      x9, x27 */ ARM64("cmp x9, x27");
    /* 0x00b68f94: b.hs     #0xb6b784 */ if (COND_HS) goto loc_00b6b784;
    /* 0x00b68f98: ldr      x13, [x21, x10, lsl #3] */ ARM64("ldr x13, [x21, x10, lsl #3]");
    /* 0x00b68f9c: mov      x12, x11 */ ARM64("mov x12, x11");
    /* 0x00b68fa0: cmp      x8, x13 */ ARM64("cmp x8, x13");
    /* 0x00b68fa4: b.eq     #0xb68fb0 */ if (COND_EQ) goto loc_00b68fb0;
    /* 0x00b68fa8: str      x8, [x21, x10, lsl #3] */ ARM64("str x8, [x21, x10, lsl #3]");
    /* 0x00b68fac: mov      w12, #1 */ ARM64("mov w12, #1");
loc_00b68fb0:
    /* 0x00b68fb0: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00b68fb4: cset     w8, ne */ ARM64("cset w8, ne");
    /* 0x00b68fb8: and      w11, w8, w12 */ ARM64("and w11, w8, w12");
    /* 0x00b68fbc: csel     x8, x10, x0, ne */ ARM64("csel x8, x10, x0, ne");
    /* 0x00b68fc0: cbnz     x10, #0xb68edc */ if (x10 != 0) goto loc_00b68edc;
    /* 0x00b68fc4: tbnz     w12, #0, #0xb68edc */ if (((w12 >> #0) & 1) != 0) goto loc_00b68edc;
loc_00b68fc8:
    /* 0x00b68fc8: ldr      x0, [sp, #0x158] */ ARM64("ldr x0, [sp, #0x158]");
    /* 0x00b68fcc: ldrb     w8, [x0, #0x10] */ ARM64("ldrb w8, [x0, #0x10]");
    /* 0x00b68fd0: tbz      w8, #0, #0xb69eec */ if (((w8 >> #0) & 1) == 0) goto loc_00b69eec;
loc_00b68fd4:
    /* 0x00b68fd4: str      x28, [sp, #0xe8] */ ARM64("str x28, [sp, #0xe8]");
    /* 0x00b68fd8: add      x9, x21, x27, lsl #3 */ ARM64("add x9, x21, x27, lsl #3");
    /* 0x00b68fdc: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b68fe0: stp      q1, q0, [x23, #0x20] */ ARM64("stp q1, q0, [x23, #0x20]");
    /* 0x00b68fe4: ldr      q0, [x0] */ ARM64("ldr q0, [x0]");
    /* 0x00b68fe8: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00b68fec: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b68ff0: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00b68ff4: str      q0, [x23, #0x40] */ ARM64("str q0, [x23, #0x40]");
    /* 0x00b68ff8: str      x9, [sp, #0x160] */ ARM64("str x9, [sp, #0x160]");
    /* 0x00b68ffc: cmp      x21, x9 */ ARM64("cmp x21, x9");
    /* 0x00b69000: b.ne     #0xb69ef8 */ if (COND_NE) goto loc_00b69ef8;
loc_00b69004:
    /* 0x00b69004: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00b69008: mov      x26, x21 */ ARM64("mov x26, x21");
    /* 0x00b6900c: b        #0xb690c0 */ goto loc_00b690c0;
loc_00b69010:
    /* 0x00b69010: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00b69014: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b69018: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6901c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b69020: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b69024: b.eq     #0xb69054 */ if (COND_EQ) goto loc_00b69054;
loc_00b69028:
    /* 0x00b69028: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b6902c: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b69030: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b69034: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00b69038: sub      x17, x9, x16, lsl #3 */ ARM64("sub x17, x9, x16, lsl #3");
    /* 0x00b6903c: ldur     w17, [x17, #-8] */ ARM64("ldur w17, [x17, #-8]");
    /* 0x00b69040: cmp      w24, w17 */ ARM64("cmp w24, w17");
    /* 0x00b69044: b.eq     #0xb690a0 */ if (COND_EQ) goto loc_00b690a0;
    /* 0x00b69048: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b6904c: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b69050: b.ne     #0xb69028 */ if (COND_NE) goto loc_00b69028;
loc_00b69054:
    /* 0x00b69054: cmp      x10, #1 */ ARM64("cmp x10, #1");
    /* 0x00b69058: b.eq     #0xb69078 */ if (COND_EQ) goto loc_00b69078;
    /* 0x00b6905c: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b69060: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00b69064: cbz      x10, #0xb69094 */ if (x10 == 0) goto loc_00b69094;
    /* 0x00b69068: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b6906c: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b69070: add      x10, x14, x10, lsr #3 */ ARM64("add x10, x14, x10, lsr #3");
    /* 0x00b69074: and      x13, x10, x12 */ ARM64("and x13, x10, x12");
loc_00b69078:
    /* 0x00b69078: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b6907c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b69080: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b69084: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00b69088: tbnz     w10, #0, #0xb6920c */ if (((w10 >> #0) & 1) != 0) goto loc_00b6920c;
    /* 0x00b6908c: mov      w10, #1 */ ARM64("mov w10, #1");
    /* 0x00b69090: b        #0xb69094 */ goto loc_00b69094;
loc_00b69094:
    /* 0x00b69094: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b69098: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b6909c: b        #0xb69010 */ goto loc_00b69010;
loc_00b690a0:
    /* 0x00b690a0: neg      x8, x16 */ ARM64("neg x8, x16");
loc_00b690a4:
    /* 0x00b690a4: add      x8, x9, x8, lsl #3 */ ARM64("add x8, x9, x8, lsl #3");
    /* 0x00b690a8: stur     w27, [x8, #-4] */ ARM64("stur w27, [x8, #-4]");
    /* 0x00b690ac: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b690b0: ldr      x8, [sp, #0x160] */ ARM64("ldr x8, [sp, #0x160]");
    /* 0x00b690b4: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b690b8: ldr      x24, [sp, #0x178] */ ARM64("ldr x24, [sp, #0x178]");
    /* 0x00b690bc: b.eq     #0xb6928c */ if (COND_EQ) goto loc_00b6928c;
loc_00b690c0:
    /* 0x00b690c0: cmp      x25, x24 */ ARM64("cmp x25, x24");
    /* 0x00b690c4: b.eq     #0xb6b73c */ if (COND_EQ) goto loc_00b6b73c;
    /* 0x00b690c8: ldr      x0, [x26], #8 */ ARM64("ldr x0, [x26], #8");
    /* 0x00b690cc: cmp      x0, x24 */ ARM64("cmp x0, x24");
    /* 0x00b690d0: b.hs     #0xb6b744 */ if (COND_HS) goto loc_00b6b744;
    /* 0x00b690d4: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b690d8: ldr      w24, [x8, x25, lsl #2] */ ARM64("ldr w24, [x8, x25, lsl #2]");
    /* 0x00b690dc: ldr      w27, [x8, x0, lsl #2] */ ARM64("ldr w27, [x8, x0, lsl #2]");
    /* 0x00b690e0: ldr      x28, [sp, #0x258] */ ARM64("ldr x28, [sp, #0x258]");
    /* 0x00b690e4: ldr      x23, [sp, #0x250] */ ARM64("ldr x23, [sp, #0x250]");
    /* 0x00b690e8: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b690ec: cbz      x8, #0xb69254 */ if (x8 == 0) goto loc_00b69254;
loc_00b690f0:
    /* 0x00b690f0: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00b690f4: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b690f8: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b690fc: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b69100: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b69104: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b69108: eor      x9, x23, x9 */ ARM64("eor x9, x23, x9");
    /* 0x00b6910c: mov      x11, #0x6f6d */ ARM64("mov x11, #0x6f6d");
    /* 0x00b69110: movk     x11, #0x6e64, lsl #16 */ ARM64("movk x11, #0x6e64, lsl #16");
    /* 0x00b69114: movk     x11, #0x7261, lsl #32 */ ARM64("movk x11, #0x7261, lsl #32");
    /* 0x00b69118: movk     x11, #0x646f, lsl #48 */ ARM64("movk x11, #0x646f, lsl #48");
    /* 0x00b6911c: eor      x11, x28, x11 */ ARM64("eor x11, x28, x11");
    /* 0x00b69120: mov      x12, #0x7261 */ ARM64("mov x12, #0x7261");
    /* 0x00b69124: movk     x12, #0x6e65, lsl #16 */ ARM64("movk x12, #0x6e65, lsl #16");
    /* 0x00b69128: movk     x12, #0x6765, lsl #32 */ ARM64("movk x12, #0x6765, lsl #32");
    /* 0x00b6912c: movk     x12, #0x6c79, lsl #48 */ ARM64("movk x12, #0x6c79, lsl #48");
    /* 0x00b69130: eor      x12, x23, x12 */ ARM64("eor x12, x23, x12");
    /* 0x00b69134: orr      x13, x24, #0x400000000000000 */ ARM64("orr x13, x24, #0x400000000000000");
    /* 0x00b69138: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00b6913c: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00b69140: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00b69144: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00b69148: eor      x14, x28, x14 */ ARM64("eor x14, x28, x14");
    /* 0x00b6914c: eor      x14, x14, x13 */ ARM64("eor x14, x14, x13");
    /* 0x00b69150: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b69154: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b69158: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b6915c: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b69160: eor      x14, x12, x14, ror #48 */ ARM64("eor x14, x12, x14, ror #48");
    /* 0x00b69164: add      x12, x12, x11 */ ARM64("add x12, x12, x11");
    /* 0x00b69168: add      x9, x14, x9 */ ARM64("add x9, x14, x9");
    /* 0x00b6916c: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b69170: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b69174: eor      x14, x9, x14, ror #43 */ ARM64("eor x14, x9, x14, ror #43");
    /* 0x00b69178: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b6917c: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b69180: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00b69184: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b69188: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b6918c: eor      x13, x12, x14, ror #48 */ ARM64("eor x13, x12, x14, ror #48");
    /* 0x00b69190: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b69194: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b69198: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b6919c: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b691a0: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b691a4: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b691a8: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b691ac: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b691b0: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b691b4: eor      x13, x12, x13, ror #48 */ ARM64("eor x13, x12, x13, ror #48");
    /* 0x00b691b8: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b691bc: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b691c0: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b691c4: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b691c8: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b691cc: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b691d0: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b691d4: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b691d8: eor      x9, x9, x11, ror #51 */ ARM64("eor x9, x9, x11, ror #51");
    /* 0x00b691dc: eor      x11, x12, x13, ror #48 */ ARM64("eor x11, x12, x13, ror #48");
    /* 0x00b691e0: add      x12, x9, x12 */ ARM64("add x12, x9, x12");
    /* 0x00b691e4: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b691e8: eor      x9, x11, x9, ror #47 */ ARM64("eor x9, x11, x9, ror #47");
    /* 0x00b691ec: eor      x9, x9, x12, ror #32 */ ARM64("eor x9, x9, x12, ror #32");
    /* 0x00b691f0: eor      x14, x9, x12 */ ARM64("eor x14, x9, x12");
    /* 0x00b691f4: ldr      x9, [sp, #0x230] */ ARM64("ldr x9, [sp, #0x230]");
    /* 0x00b691f8: ldr      x12, [sp, #0x238] */ ARM64("ldr x12, [sp, #0x238]");
    /* 0x00b691fc: lsr      x11, x14, #0x39 */ ARM64("lsr x11, x14, #0x39");
    /* 0x00b69200: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
    /* 0x00b69204: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b69208: b        #0xb69010 */ goto loc_00b69010;
loc_00b6920c:
    /* 0x00b6920c: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b69210: tbz      w8, #0x1f, #0xb6926c */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b6926c;
loc_00b69214:
    /* 0x00b69214: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b69218: sub      x10, x13, #8 */ ARM64("sub x10, x13, #8");
    /* 0x00b6921c: strb     w11, [x9, x13] */ ARM64("strb w11, [x9, x13]");
    /* 0x00b69220: and      x10, x12, x10 */ ARM64("and x10, x12, x10");
    /* 0x00b69224: add      x10, x9, x10 */ ARM64("add x10, x9, x10");
    /* 0x00b69228: strb     w11, [x10, #8] */ ARM64("strb w11, [x10, #8]");
    /* 0x00b6922c: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b69230: mov      v0.d[0], x8 */ ARM64("mov v0.d[0], x8");
    /* 0x00b69234: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b69238: ldr      q1, [x8, #0x30] */ ARM64("ldr q1, [x8, #0x30]");
    /* 0x00b6923c: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00b69240: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00b69244: neg      x8, x13 */ ARM64("neg x8, x13");
    /* 0x00b69248: sub      x10, x9, x13, lsl #3 */ ARM64("sub x10, x9, x13, lsl #3");
    /* 0x00b6924c: stur     w24, [x10, #-8] */ ARM64("stur w24, [x10, #-8]");
    /* 0x00b69250: b        #0xb690a4 */ goto loc_00b690a4;
loc_00b69254:
    /* 0x00b69254: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69258: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6925c: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b69260: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b69264: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00b69268: b        #0xb690f0 */ goto loc_00b690f0;
loc_00b6926c:
    /* 0x00b6926c: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b69270: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b69274: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b69278: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b6927c: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b69280: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b69284: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b69288: b        #0xb69214 */ goto loc_00b69214;
loc_00b6928c:
    /* 0x00b6928c: cbz      x24, #0xb69298 */ if (x24 == 0) goto loc_00b69298;
    /* 0x00b69290: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b69294: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69298:
    /* 0x00b69298: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6929c: str      x8, [sp, #0x160] */ ARM64("str x8, [sp, #0x160]");
    /* 0x00b692a0: ldr      x8, [sp, #0x238] */ ARM64("ldr x8, [sp, #0x238]");
    /* 0x00b692a4: str      x8, [sp, #0x178] */ ARM64("str x8, [sp, #0x178]");
    /* 0x00b692a8: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b692ac: str      x8, [sp, #0x88] */ ARM64("str x8, [sp, #0x88]");
    /* 0x00b692b0: ldr      x9, [sp, #0x250] */ ARM64("ldr x9, [sp, #0x250]");
    /* 0x00b692b4: ldp      x8, x23, [sp, #0xe8] */ ARM64("ldp x8, x23, [sp, #0xe8]");
    /* 0x00b692b8: add      x21, x8, #8 */ ARM64("add x21, x8, #8");
    /* 0x00b692bc: ldr      x8, [sp, #0x258] */ ARM64("ldr x8, [sp, #0x258]");
    /* 0x00b692c0: stp      x8, x9, [sp, #0x110] */ ARM64("stp x8, x9, [sp, #0x110]");
    /* 0x00b692c4: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b692c8: b        #0xb692d4 */ goto loc_00b692d4;
loc_00b692cc:
    /* 0x00b692cc: add      x21, x21, #0x18 */ ARM64("add x21, x21, #0x18");
    /* 0x00b692d0: sub      x22, x22, #1 */ ARM64("sub x22, x22, #1");
loc_00b692d4:
    /* 0x00b692d4: cbz      x22, #0xb692ec */ if (x22 == 0) goto loc_00b692ec;
    /* 0x00b692d8: ldur     x8, [x21, #-8] */ ARM64("ldur x8, [x21, #-8]");
    /* 0x00b692dc: cbz      x8, #0xb692cc */ if (x8 == 0) goto loc_00b692cc;
    /* 0x00b692e0: ldr      x0, [x21] */ ARM64("ldr x0, [x21]");
    /* 0x00b692e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b692e8: b        #0xb692cc */ goto loc_00b692cc;
loc_00b692ec:
    /* 0x00b692ec: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b692f0: cbz      x8, #0xb692fc */ if (x8 == 0) goto loc_00b692fc;
    /* 0x00b692f4: ldr      x0, [sp, #0xe8] */ ARM64("ldr x0, [sp, #0xe8]");
    /* 0x00b692f8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b692fc:
    /* 0x00b692fc: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
    /* 0x00b69300: ldr      x10, [sp, #0x100] */ ARM64("ldr x10, [sp, #0x100]");
    /* 0x00b69304: ldr      x9, [sp, #0x120] */ ARM64("ldr x9, [sp, #0x120]");
    /* 0x00b69308: cbz      x9, #0xb69328 */ if (x9 == 0) goto loc_00b69328;
    /* 0x00b6930c: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00b69310: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b69314: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b69318: b.eq     #0xb69328 */ if (COND_EQ) goto loc_00b69328;
    /* 0x00b6931c: sub      x8, x10, x8 */ ARM64("sub x8, x10, x8");
    /* 0x00b69320: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b69324: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69328:
    /* 0x00b69328: cbz      x23, #0xb69334 */ if (x23 == 0) goto loc_00b69334;
    /* 0x00b6932c: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b69330: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69334:
    /* 0x00b69334: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b69338: ldp      x8, x9, [x9, #0x20] */ ARM64("ldp x8, x9, [x9, #0x20]");
    /* 0x00b6933c: add      x9, x8, x9, lsl #5 */ ARM64("add x9, x8, x9, lsl #5");
    /* 0x00b69340: str      x8, [sp, #0x470] */ ARM64("str x8, [sp, #0x470]");
    /* 0x00b69344: str      x9, [sp, #0x478] */ ARM64("str x9, [sp, #0x478]");
    /* 0x00b69348: str      xzr, [sp, #0x480] */ ARM64("str xzr, [sp, #0x480]");
    /* 0x00b6934c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69350: add      x1, sp, #0x470 */ ARM64("add x1, sp, #0x470");
    /* 0x00b69354: bl       #0xb9c8e4 */ CALL_DIRECT(sub_00b9c8e4);
    /* 0x00b69358: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6935c: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00b69360: ldr      x25, [sp, #0x238] */ ARM64("ldr x25, [sp, #0x238]");
    /* 0x00b69364: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b69368: cbz      x8, #0xb69384 */ if (x8 == 0) goto loc_00b69384;
    /* 0x00b6936c: mov      w23, #0 */ ARM64("mov w23, #0");
    /* 0x00b69370: add      x21, x25, x8, lsl #2 */ ARM64("add x21, x25, x8, lsl #2");
    /* 0x00b69374: mov      x8, x25 */ ARM64("mov x8, x25");
    /* 0x00b69378: str      x25, [sp, #0xf0] */ ARM64("str x25, [sp, #0xf0]");
    /* 0x00b6937c: str      x21, [sp, #0x120] */ ARM64("str x21, [sp, #0x120]");
    /* 0x00b69380: b        #0xb69448 */ goto loc_00b69448;
loc_00b69384:
    /* 0x00b69384: mov      w23, #0 */ ARM64("mov w23, #0");
loc_00b69388:
    /* 0x00b69388: ldr      x8, [sp, #0x100] */ ARM64("ldr x8, [sp, #0x100]");
    /* 0x00b6938c: cbz      x8, #0xb69398 */ if (x8 == 0) goto loc_00b69398;
    /* 0x00b69390: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b69394: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69398:
    /* 0x00b69398: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b6939c: add      x2, sp, #0x1c0 */ ARM64("add x2, sp, #0x1c0");
    /* 0x00b693a0: ldr      x24, [sp, #0x170] */ ARM64("ldr x24, [sp, #0x170]");
    /* 0x00b693a4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b693a8: bl       #0xbc5648 */ CALL_DIRECT(sub_00bc5648);
    /* 0x00b693ac: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b693b0: bl       #0xbb4e28 */ CALL_DIRECT(sub_00bb4e28);
    /* 0x00b693b4: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b693b8: str      w22, [sp, #0xe4] */ ARM64("str w22, [sp, #0xe4]");
    /* 0x00b693bc: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b693c0: stp      q1, q0, [x28, #0x50] */ ARM64("stp q1, q0, [x28, #0x50]");
    /* 0x00b693c4: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b693c8: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b693cc: bl       #0xbbaffc */ CALL_DIRECT(sub_00bbaffc);
    /* 0x00b693d0: mov      x22, x0 */ ARM64("mov x22, x0");
    /* 0x00b693d4: ldp      q0, q1, [x28, #0x50] */ ARM64("ldp q0, q1, [x28, #0x50]");
    /* 0x00b693d8: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b693dc: add      x1, sp, #0x230 */ ARM64("add x1, sp, #0x230");
    /* 0x00b693e0: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b693e4: bl       #0xbb99e8 */ CALL_DIRECT(sub_00bb99e8);
    /* 0x00b693e8: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b693ec: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b693f0: cbz      x8, #0xb69418 */ if (x8 == 0) goto loc_00b69418;
    /* 0x00b693f4: mov      x9, x8 */ ARM64("mov x9, x8");
    /* 0x00b693f8: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b693fc: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b69400: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b69404: b.eq     #0xb69418 */ if (COND_EQ) goto loc_00b69418;
    /* 0x00b69408: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00b6940c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b69410: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b69414: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69418:
    /* 0x00b69418: orr      w8, w23, w21 */ ARM64("orr w8, w23, w21");
    /* 0x00b6941c: orr      w8, w8, w22 */ ARM64("orr w8, w8, w22");
    /* 0x00b69420: ldr      x21, [sp, #0x170] */ ARM64("ldr x21, [sp, #0x170]");
    /* 0x00b69424: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b69428: ldr      x22, [sp, #0xd8] */ ARM64("ldr x22, [sp, #0xd8]");
    /* 0x00b6942c: tbnz     w8, #0, #0xb67d38 */ if (((w8 >> #0) & 1) != 0) goto loc_00b67d38;
    /* 0x00b69430: b        #0xb69fbc */ goto loc_00b69fbc;
loc_00b69434:
    /* 0x00b69434: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
loc_00b69438:
    /* 0x00b69438: ldr      x21, [sp, #0x120] */ ARM64("ldr x21, [sp, #0x120]");
loc_00b6943c:
    /* 0x00b6943c: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b69440: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00b69444: b.eq     #0xb69388 */ if (COND_EQ) goto loc_00b69388;
loc_00b69448:
    /* 0x00b69448: ldr      w24, [x8], #4 */ ARM64("ldr w24, [x8], #4");
    /* 0x00b6944c: str      x8, [sp, #0x180] */ ARM64("str x8, [sp, #0x180]");
    /* 0x00b69450: ldr      x10, [sp, #0x170] */ ARM64("ldr x10, [sp, #0x170]");
    /* 0x00b69454: ldr      x8, [x10, #0x28] */ ARM64("ldr x8, [x10, #0x28]");
    /* 0x00b69458: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00b6945c: b.ls     #0xb6943c */ if (COND_LS) goto loc_00b6943c;
    /* 0x00b69460: ldr      x8, [x10, #0x20] */ ARM64("ldr x8, [x10, #0x20]");
    /* 0x00b69464: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00b69468: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b6946c: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00b69470: cmp      x9, x11 */ ARM64("cmp x9, x11");
    /* 0x00b69474: b.eq     #0xb6943c */ if (COND_EQ) goto loc_00b6943c;
    /* 0x00b69478: ldp      x9, x10, [x10, #0x38] */ ARM64("ldp x9, x10, [x10, #0x38]");
    /* 0x00b6947c: str      w24, [sp, #0x250] */ ARM64("str w24, [sp, #0x250]");
    /* 0x00b69480: str      x9, [sp, #0x238] */ ARM64("str x9, [sp, #0x238]");
    /* 0x00b69484: str      x10, [sp, #0x240] */ ARM64("str x10, [sp, #0x240]");
    /* 0x00b69488: ldr      d0, [x8, #0x18] */ ARM64("ldr d0, [x8, #0x18]");
    /* 0x00b6948c: str      d0, [sp, #0x248] */ ARM64("str d0, [sp, #0x248]");
    /* 0x00b69490: str      xzr, [sp, #0x230] */ ARM64("str xzr, [sp, #0x230]");
    /* 0x00b69494: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b69498: add      x1, sp, #0x230 */ ARM64("add x1, sp, #0x230");
    /* 0x00b6949c: bl       #0xb9b9f0 */ CALL_DIRECT(sub_00b9b9f0);
    /* 0x00b694a0: ldr      x8, [sp, #0x5b0] */ ARM64("ldr x8, [sp, #0x5b0]");
    /* 0x00b694a4: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b694a8: b.ne     #0xb694d0 */ if (COND_NE) goto loc_00b694d0;
    /* 0x00b694ac: ldr      x8, [sp, #0x5a8] */ ARM64("ldr x8, [sp, #0x5a8]");
    /* 0x00b694b0: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b694b4: ldp      w22, w8, [x8, #0xc] */ ARM64("ldp w22, w8, [x8, #0xc]");
    /* 0x00b694b8: str      w8, [sp, #0x108] */ ARM64("str w8, [sp, #0x108]");
    /* 0x00b694bc: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b694c0: cset     w21, eq */ ARM64("cset w21, eq");
    /* 0x00b694c4: ldr      x8, [sp, #0x5a0] */ ARM64("ldr x8, [sp, #0x5a0]");
    /* 0x00b694c8: cbnz     x8, #0xb694dc */ if (x8 != 0) goto loc_00b694dc;
    /* 0x00b694cc: b        #0xb694e4 */ goto loc_00b694e4;
loc_00b694d0:
    /* 0x00b694d0: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00b694d4: ldr      x8, [sp, #0x5a0] */ ARM64("ldr x8, [sp, #0x5a0]");
    /* 0x00b694d8: cbz      x8, #0xb694e4 */ if (x8 == 0) goto loc_00b694e4;
loc_00b694dc:
    /* 0x00b694dc: ldr      x0, [sp, #0x5a8] */ ARM64("ldr x0, [sp, #0x5a8]");
    /* 0x00b694e0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b694e4:
    /* 0x00b694e4: cmp      w22, w24 */ ARM64("cmp w22, w24");
    /* 0x00b694e8: csinc    w8, w21, wzr, ne */ ARM64("csinc w8, w21, wzr, ne");
    /* 0x00b694ec: tbnz     w8, #0, #0xb69438 */ if (((w8 >> #0) & 1) != 0) goto loc_00b69438;
    /* 0x00b694f0: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b694f4: ldr      x8, [x9, #0x28] */ ARM64("ldr x8, [x9, #0x28]");
    /* 0x00b694f8: mov      w13, w22 */ ARM64("mov w13, w22");
    /* 0x00b694fc: cmp      x8, x13 */ ARM64("cmp x8, x13");
    /* 0x00b69500: b.ls     #0xb6b918 */ if (COND_LS) goto loc_00b6b918;
    /* 0x00b69504: ldr      x9, [x9, #0x20] */ ARM64("ldr x9, [x9, #0x20]");
    /* 0x00b69508: add      x10, x9, x13, lsl #5 */ ARM64("add x10, x9, x13, lsl #5");
    /* 0x00b6950c: ldr      x11, [x10] */ ARM64("ldr x11, [x10]");
    /* 0x00b69510: mov      x12, #-0x8000000000000000 */ ARM64("mov x12, #-0x8000000000000000");
    /* 0x00b69514: cmp      x11, x12 */ ARM64("cmp x11, x12");
    /* 0x00b69518: b.eq     #0xb6b918 */ if (COND_EQ) goto loc_00b6b918;
    /* 0x00b6951c: ldr      x11, [x10, #0x10] */ ARM64("ldr x11, [x10, #0x10]");
    /* 0x00b69520: ldr      x21, [sp, #0x120] */ ARM64("ldr x21, [sp, #0x120]");
    /* 0x00b69524: cbz      x11, #0xb6954c */ if (x11 == 0) goto loc_00b6954c;
    /* 0x00b69528: ldr      x10, [x10, #8] */ ARM64("ldr x10, [x10, #8]");
    /* 0x00b6952c: ldr      x10, [x10, #0x18] */ ARM64("ldr x10, [x10, #0x18]");
    /* 0x00b69530: sub      x11, x10, #0xc */ ARM64("sub x11, x10, #0xc");
    /* 0x00b69534: cmp      x10, #0xb */ ARM64("cmp x10, #0xb");
    /* 0x00b69538: mov      w10, #9 */ ARM64("mov w10, #9");
    /* 0x00b6953c: csel     x10, x11, x10, hi */ ARM64("csel x10, x11, x10, hi");
    /* 0x00b69540: cmp      x10, #0xa */ ARM64("cmp x10, #0xa");
    /* 0x00b69544: ccmp     x10, #0xd, #4, ne */ ARM64("ccmp x10, #0xd, #4, ne");
    /* 0x00b69548: b.eq     #0xb6943c */ if (COND_EQ) goto loc_00b6943c;
loc_00b6954c:
    /* 0x00b6954c: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00b69550: b.ls     #0xb6b9b4 */ if (COND_LS) goto loc_00b6b9b4;
    /* 0x00b69554: add      x8, x9, x24, lsl #5 */ ARM64("add x8, x9, x24, lsl #5");
    /* 0x00b69558: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b6955c: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b69560: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b69564: b.eq     #0xb6b9b4 */ if (COND_EQ) goto loc_00b6b9b4;
    /* 0x00b69568: str      w22, [sp, #0xe4] */ ARM64("str w22, [sp, #0xe4]");
    /* 0x00b6956c: ldr      x9, [x8, #0x10] */ ARM64("ldr x9, [x8, #0x10]");
    /* 0x00b69570: cbz      x9, #0xb695a4 */ if (x9 == 0) goto loc_00b695a4;
loc_00b69574:
    /* 0x00b69574: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b69578: ldr      x8, [x9, #0x28] */ ARM64("ldr x8, [x9, #0x28]");
    /* 0x00b6957c: cmp      x8, x13 */ ARM64("cmp x8, x13");
    /* 0x00b69580: b.ls     #0xb6959c */ if (COND_LS) goto loc_00b6959c;
    /* 0x00b69584: ldr      x8, [x9, #0x20] */ ARM64("ldr x8, [x9, #0x20]");
    /* 0x00b69588: add      x8, x8, x13, lsl #5 */ ARM64("add x8, x8, x13, lsl #5");
    /* 0x00b6958c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b69590: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b69594: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b69598: b.ne     #0xb696e0 */ if (COND_NE) goto loc_00b696e0;
loc_00b6959c:
    /* 0x00b6959c: mov      w8, #-1 */ ARM64("mov w8, #-1");
    /* 0x00b695a0: b        #0xb696e4 */ goto loc_00b696e4;
loc_00b695a4:
    /* 0x00b695a4: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b695a8: ldp      x28, x26, [x9, #0x38] */ ARM64("ldp x28, x26, [x9, #0x38]");
    /* 0x00b695ac: ldr      w22, [x8, #0x1c] */ ARM64("ldr w22, [x8, #0x1c]");
    /* 0x00b695b0: lsr      x8, x26, #0x20 */ ARM64("lsr x8, x26, #0x20");
    /* 0x00b695b4: cbz      x8, #0xb695e0 */ if (x8 == 0) goto loc_00b695e0;
    /* 0x00b695b8: str      x13, [sp, #0x80] */ ARM64("str x13, [sp, #0x80]");
    /* 0x00b695bc: mov      x8, #0xfffffff0 */ ARM64("mov x8, #0xfffffff0");
    /* 0x00b695c0: movk     x8, #0x2f, lsl #32 */ ARM64("movk x8, #0x2f, lsl #32");
    /* 0x00b695c4: add      x8, x28, x8 */ ARM64("add x8, x28, x8");
    /* 0x00b695c8: ldr      w25, [x8] */ ARM64("ldr w25, [x8]");
    /* 0x00b695cc: ldr      w21, [x8, #0xc] */ ARM64("ldr w21, [x8, #0xc]");
    /* 0x00b695d0: mov      w0, #0x10 */ ARM64("mov w0, #0x10");
    /* 0x00b695d4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b695d8: cbnz     x0, #0xb6960c */ if (x0 != 0) goto loc_00b6960c;
    /* 0x00b695dc: b        #0xb6b998 */ goto loc_00b6b998;
loc_00b695e0:
    /* 0x00b695e0: cmp      x26, x22 */ ARM64("cmp x26, x22");
    /* 0x00b695e4: b.ls     #0xb69b4c */ if (COND_LS) goto loc_00b69b4c;
    /* 0x00b695e8: madd     x8, x22, x20, x28 */ ARM64("madd x8, x22, x20, x28");
    /* 0x00b695ec: ldp      w22, w21, [x8, #0x24] */ ARM64("ldp w22, w21, [x8, #0x24]");
    /* 0x00b695f0: cmn      w21, #1 */ ARM64("cmn w21, #1");
    /* 0x00b695f4: b.eq     #0xb695e0 */ if (COND_EQ) goto loc_00b695e0;
    /* 0x00b695f8: str      x13, [sp, #0x80] */ ARM64("str x13, [sp, #0x80]");
    /* 0x00b695fc: mov      w25, #-1 */ ARM64("mov w25, #-1");
    /* 0x00b69600: mov      w0, #0x10 */ ARM64("mov w0, #0x10");
    /* 0x00b69604: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b69608: cbz      x0, #0xb6b998 */ if (x0 == 0) goto loc_00b6b998;
loc_00b6960c:
    /* 0x00b6960c: mov      x27, x0 */ ARM64("mov x27, x0");
    /* 0x00b69610: str      w21, [x0] */ ARM64("str w21, [x0]");
    /* 0x00b69614: mov      w21, #4 */ ARM64("mov w21, #4");
    /* 0x00b69618: mov      w10, #4 */ ARM64("mov w10, #4");
    /* 0x00b6961c: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00b69620: mov      x11, x25 */ ARM64("mov x11, x25");
    /* 0x00b69624: cmp      x26, x25 */ ARM64("cmp x26, x25");
    /* 0x00b69628: b.hi     #0xb696b4 */ if (COND_HI) goto loc_00b696b4;
loc_00b6962c:
    /* 0x00b6962c: cmp      x26, x22 */ ARM64("cmp x26, x22");
    /* 0x00b69630: b.ls     #0xb698ac */ if (COND_LS) goto loc_00b698ac;
    /* 0x00b69634: madd     x8, x22, x20, x28 */ ARM64("madd x8, x22, x20, x28");
    /* 0x00b69638: ldp      w22, w25, [x8, #0x24] */ ARM64("ldp w22, w25, [x8, #0x24]");
    /* 0x00b6963c: cmn      w25, #1 */ ARM64("cmn w25, #1");
    /* 0x00b69640: b.eq     #0xb6962c */ if (COND_EQ) goto loc_00b6962c;
    /* 0x00b69644: cmp      x12, x10 */ ARM64("cmp x12, x10");
    /* 0x00b69648: b.ne     #0xb696c8 */ if (COND_NE) goto loc_00b696c8;
loc_00b6964c:
    /* 0x00b6964c: lsl      x8, x10, #1 */ ARM64("lsl x8, x10, #1");
    /* 0x00b69650: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00b69654: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b69658: csel     x9, x8, x9, hi */ ARM64("csel x9, x8, x9, hi");
    /* 0x00b6965c: ubfx     x8, x10, #0x3c, #3 */ ARM64("ubfx x8, x10, #0x3c, #3");
    /* 0x00b69660: str      x10, [sp, #0xc8] */ ARM64("str x10, [sp, #0xc8]");
    /* 0x00b69664: cbnz     x8, #0xb69f50 */ if (x8 != 0) goto loc_00b69f50;
    /* 0x00b69668: stp      x12, x11, [sp, #0x70] */ ARM64("stp x12, x11, [sp, #0x70]");
    /* 0x00b6966c: lsl      x8, x9, #2 */ ARM64("lsl x8, x9, #2");
    /* 0x00b69670: stp      x8, x9, [sp, #0x60] */ ARM64("stp x8, x9, [sp, #0x60]");
    /* 0x00b69674: cbz      x10, #0xb69688 */ if (x10 == 0) goto loc_00b69688;
    /* 0x00b69678: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b6967c: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00b69680: bl       #0xc7b024 */ CALL_DIRECT(sub_00c7b024);
    /* 0x00b69684: b        #0xb69690 */ goto loc_00b69690;
loc_00b69688:
    /* 0x00b69688: mov      x0, x8 */ ARM64("mov x0, x8");
    /* 0x00b6968c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
loc_00b69690:
    /* 0x00b69690: ldp      x12, x11, [sp, #0x70] */ ARM64("ldp x12, x11, [sp, #0x70]");
    /* 0x00b69694: cbz      x0, #0xb6b9dc */ if (x0 == 0) goto loc_00b6b9dc;
    /* 0x00b69698: ldr      x10, [sp, #0x68] */ ARM64("ldr x10, [sp, #0x68]");
    /* 0x00b6969c: mov      x27, x0 */ ARM64("mov x27, x0");
    /* 0x00b696a0: str      w25, [x0, x12, lsl #2] */ ARM64("str w25, [x0, x12, lsl #2]");
    /* 0x00b696a4: add      x12, x12, #1 */ ARM64("add x12, x12, #1");
    /* 0x00b696a8: add      x21, x21, #4 */ ARM64("add x21, x21, #4");
    /* 0x00b696ac: cmp      x26, x11 */ ARM64("cmp x26, x11");
    /* 0x00b696b0: b.ls     #0xb6962c */ if (COND_LS) goto loc_00b6962c;
loc_00b696b4:
    /* 0x00b696b4: madd     x8, x11, x20, x28 */ ARM64("madd x8, x11, x20, x28");
    /* 0x00b696b8: ldr      w11, [x8, #0x20] */ ARM64("ldr w11, [x8, #0x20]");
    /* 0x00b696bc: ldr      w25, [x8, #0x2c] */ ARM64("ldr w25, [x8, #0x2c]");
    /* 0x00b696c0: cmp      x12, x10 */ ARM64("cmp x12, x10");
    /* 0x00b696c4: b.eq     #0xb6964c */ if (COND_EQ) goto loc_00b6964c;
loc_00b696c8:
    /* 0x00b696c8: str      w25, [x27, x12, lsl #2] */ ARM64("str w25, [x27, x12, lsl #2]");
    /* 0x00b696cc: add      x12, x12, #1 */ ARM64("add x12, x12, #1");
    /* 0x00b696d0: add      x21, x21, #4 */ ARM64("add x21, x21, #4");
    /* 0x00b696d4: cmp      x26, x11 */ ARM64("cmp x26, x11");
    /* 0x00b696d8: b.ls     #0xb6962c */ if (COND_LS) goto loc_00b6962c;
    /* 0x00b696dc: b        #0xb696b4 */ goto loc_00b696b4;
loc_00b696e0:
    /* 0x00b696e0: ldr      w8, [x8, #0x1c] */ ARM64("ldr w8, [x8, #0x1c]");
loc_00b696e4:
    /* 0x00b696e4: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b696e8: ldr      x10, [sp, #0x170] */ ARM64("ldr x10, [sp, #0x170]");
    /* 0x00b696ec: ldp      x25, x26, [x10, #0x38] */ ARM64("ldp x25, x26, [x10, #0x38]");
    /* 0x00b696f0: mov      w10, #-1 */ ARM64("mov w10, #-1");
    /* 0x00b696f4: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
    /* 0x00b696f8: cmp      x26, x10 */ ARM64("cmp x26, x10");
    /* 0x00b696fc: b.hi     #0xb69724 */ if (COND_HI) goto loc_00b69724;
loc_00b69700:
    /* 0x00b69700: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b69704: b.ls     #0xb6973c */ if (COND_LS) goto loc_00b6973c;
    /* 0x00b69708: madd     x11, x8, x20, x25 */ ARM64("madd x11, x8, x20, x25");
    /* 0x00b6970c: ldp      w8, w11, [x11, #0x24] */ ARM64("ldp w8, w11, [x11, #0x24]");
    /* 0x00b69710: cmn      w11, #1 */ ARM64("cmn w11, #1");
    /* 0x00b69714: b.eq     #0xb69700 */ if (COND_EQ) goto loc_00b69700;
    /* 0x00b69718: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00b6971c: cmp      x26, x10 */ ARM64("cmp x26, x10");
    /* 0x00b69720: b.ls     #0xb69700 */ if (COND_LS) goto loc_00b69700;
loc_00b69724:
    /* 0x00b69724: madd     x10, x10, x20, x25 */ ARM64("madd x10, x10, x20, x25");
    /* 0x00b69728: ldr      w10, [x10, #0x20] */ ARM64("ldr w10, [x10, #0x20]");
    /* 0x00b6972c: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00b69730: cmp      x26, x10 */ ARM64("cmp x26, x10");
    /* 0x00b69734: b.hi     #0xb69724 */ if (COND_HI) goto loc_00b69724;
    /* 0x00b69738: b        #0xb69700 */ goto loc_00b69700;
loc_00b6973c:
    /* 0x00b6973c: cmp      x9, #1 */ ARM64("cmp x9, #1");
    /* 0x00b69740: b.ne     #0xb697d8 */ if (COND_NE) goto loc_00b697d8;
    /* 0x00b69744: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b69748: cbz      x8, #0xb697d8 */ if (x8 == 0) goto loc_00b697d8;
    /* 0x00b6974c: ldp      x1, x0, [sp, #0x110] */ ARM64("ldp x1, x0, [sp, #0x110]");
    /* 0x00b69750: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00b69754: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00b69758: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b6975c: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00b69760: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
loc_00b69764:
    /* 0x00b69764: ldr      x9, [sp, #0x178] */ ARM64("ldr x9, [sp, #0x178]");
    /* 0x00b69768: and      x9, x0, x9 */ ARM64("and x9, x0, x9");
    /* 0x00b6976c: ldr      x10, [sp, #0x160] */ ARM64("ldr x10, [sp, #0x160]");
    /* 0x00b69770: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00b69774: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b69778: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00b6977c: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b69780: b.eq     #0xb697b8 */ if (COND_EQ) goto loc_00b697b8;
loc_00b69784:
    /* 0x00b69784: rbit     x11, x10 */ ARM64("rbit x11, x10");
    /* 0x00b69788: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b6978c: add      x11, x9, x11, lsr #3 */ ARM64("add x11, x9, x11, lsr #3");
    /* 0x00b69790: ldr      x12, [sp, #0x178] */ ARM64("ldr x12, [sp, #0x178]");
    /* 0x00b69794: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b69798: ldr      x12, [sp, #0x160] */ ARM64("ldr x12, [sp, #0x160]");
    /* 0x00b6979c: sub      x11, x12, x11, lsl #3 */ ARM64("sub x11, x12, x11, lsl #3");
    /* 0x00b697a0: ldur     w11, [x11, #-8] */ ARM64("ldur w11, [x11, #-8]");
    /* 0x00b697a4: cmp      w22, w11 */ ARM64("cmp w22, w11");
    /* 0x00b697a8: b.eq     #0xb697e4 */ if (COND_EQ) goto loc_00b697e4;
    /* 0x00b697ac: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00b697b0: ands     x10, x11, x10 */ ARM64("ands x10, x11, x10");
    /* 0x00b697b4: b.ne     #0xb69784 */ if (COND_NE) goto loc_00b69784;
loc_00b697b8:
    /* 0x00b697b8: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b697bc: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b697c0: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b697c4: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00b697c8: tbnz     w10, #0, #0xb697d8 */ if (((w10 >> #0) & 1) != 0) goto loc_00b697d8;
    /* 0x00b697cc: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b697d0: add      x0, x9, x8 */ ARM64("add x0, x9, x8");
    /* 0x00b697d4: b        #0xb69764 */ goto loc_00b69764;
loc_00b697d8:
    /* 0x00b697d8: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b697dc: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b697e0: b        #0xb6943c */ goto loc_00b6943c;
loc_00b697e4:
    /* 0x00b697e4: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b697e8: b        #0xb6986c */ goto loc_00b6986c;
loc_00b697ec:
    /* 0x00b697ec: ldr      x9, [sp, #0x178] */ ARM64("ldr x9, [sp, #0x178]");
    /* 0x00b697f0: and      x9, x0, x9 */ ARM64("and x9, x0, x9");
    /* 0x00b697f4: ldr      x10, [sp, #0x160] */ ARM64("ldr x10, [sp, #0x160]");
    /* 0x00b697f8: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00b697fc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b69800: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00b69804: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b69808: b.eq     #0xb69840 */ if (COND_EQ) goto loc_00b69840;
loc_00b6980c:
    /* 0x00b6980c: rbit     x11, x10 */ ARM64("rbit x11, x10");
    /* 0x00b69810: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b69814: add      x11, x9, x11, lsr #3 */ ARM64("add x11, x9, x11, lsr #3");
    /* 0x00b69818: ldr      x12, [sp, #0x178] */ ARM64("ldr x12, [sp, #0x178]");
    /* 0x00b6981c: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b69820: ldr      x12, [sp, #0x160] */ ARM64("ldr x12, [sp, #0x160]");
    /* 0x00b69824: sub      x11, x12, x11, lsl #3 */ ARM64("sub x11, x12, x11, lsl #3");
    /* 0x00b69828: ldur     w12, [x11, #-8] */ ARM64("ldur w12, [x11, #-8]");
    /* 0x00b6982c: cmp      w22, w12 */ ARM64("cmp w22, w12");
    /* 0x00b69830: b.eq     #0xb69860 */ if (COND_EQ) goto loc_00b69860;
    /* 0x00b69834: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00b69838: ands     x10, x11, x10 */ ARM64("ands x10, x11, x10");
    /* 0x00b6983c: b.ne     #0xb6980c */ if (COND_NE) goto loc_00b6980c;
loc_00b69840:
    /* 0x00b69840: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b69844: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b69848: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b6984c: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00b69850: tbnz     w10, #0, #0xb6987c */ if (((w10 >> #0) & 1) != 0) goto loc_00b6987c;
    /* 0x00b69854: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b69858: add      x0, x9, x8 */ ARM64("add x0, x9, x8");
    /* 0x00b6985c: b        #0xb697ec */ goto loc_00b697ec;
loc_00b69860:
    /* 0x00b69860: ldur     w9, [x11, #-4] */ ARM64("ldur w9, [x11, #-4]");
    /* 0x00b69864: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b69868: b        #0xb69880 */ goto loc_00b69880;
loc_00b6986c:
    /* 0x00b6986c: tbz      w8, #0, #0xb69924 */ if (((w8 >> #0) & 1) == 0) goto loc_00b69924;
    /* 0x00b69870: ldr      w8, [sp, #0x128] */ ARM64("ldr w8, [sp, #0x128]");
    /* 0x00b69874: cmp      w22, w8 */ ARM64("cmp w22, w8");
    /* 0x00b69878: b.ne     #0xb69890 */ if (COND_NE) goto loc_00b69890;
loc_00b6987c:
    /* 0x00b6987c: mov      w8, #0 */ ARM64("mov w8, #0");
loc_00b69880:
    /* 0x00b69880: cmp      w22, w24 */ ARM64("cmp w22, w24");
    /* 0x00b69884: mov      x22, x9 */ ARM64("mov x22, x9");
    /* 0x00b69888: b.ne     #0xb6986c */ if (COND_NE) goto loc_00b6986c;
    /* 0x00b6988c: b        #0xb69934 */ goto loc_00b69934;
loc_00b69890:
    /* 0x00b69890: ldp      x1, x0, [sp, #0x110] */ ARM64("ldp x1, x0, [sp, #0x110]");
    /* 0x00b69894: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00b69898: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00b6989c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b698a0: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00b698a4: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00b698a8: b        #0xb697ec */ goto loc_00b697ec;
loc_00b698ac:
    /* 0x00b698ac: str      x10, [sp, #0xc8] */ ARM64("str x10, [sp, #0xc8]");
    /* 0x00b698b0: mov      w22, #1 */ ARM64("mov w22, #1");
    /* 0x00b698b4: str      x27, [sp, #0x78] */ ARM64("str x27, [sp, #0x78]");
    /* 0x00b698b8: mov      x25, x27 */ ARM64("mov x25, x27");
loc_00b698bc:
    /* 0x00b698bc: ldr      w26, [x25], #4 */ ARM64("ldr w26, [x25], #4");
    /* 0x00b698c0: ldr      x27, [sp, #0x170] */ ARM64("ldr x27, [sp, #0x170]");
    /* 0x00b698c4: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b698c8: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b698cc: ldr      w2, [sp, #0x108] */ ARM64("ldr w2, [sp, #0x108]");
    /* 0x00b698d0: bl       #0xbb1d1c */ CALL_DIRECT(sub_00bb1d1c);
    /* 0x00b698d4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b698d8: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b698dc: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b698e0: bl       #0xbb2220 */ CALL_DIRECT(sub_00bb2220);
    /* 0x00b698e4: orr      w8, w28, w0 */ ARM64("orr w8, w28, w0");
    /* 0x00b698e8: orr      w23, w8, w23 */ ARM64("orr w23, w8, w23");
    /* 0x00b698ec: and      w22, w22, w8 */ ARM64("and w22, w22, w8");
    /* 0x00b698f0: subs     x21, x21, #4 */ ARM64("subs x21, x21, #4");
    /* 0x00b698f4: b.ne     #0xb698bc */ if (COND_NE) goto loc_00b698bc;
    /* 0x00b698f8: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b698fc: cbz      x8, #0xb69b5c */ if (x8 == 0) goto loc_00b69b5c;
    /* 0x00b69900: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b69904: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b69908: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6990c: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b69910: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69914: ldr      x21, [sp, #0x120] */ ARM64("ldr x21, [sp, #0x120]");
    /* 0x00b69918: ldr      x13, [sp, #0x80] */ ARM64("ldr x13, [sp, #0x80]");
    /* 0x00b6991c: tbz      w22, #0, #0xb69574 */ if (((w22 >> #0) & 1) == 0) goto loc_00b69574;
    /* 0x00b69920: b        #0xb69b74 */ goto loc_00b69b74;
loc_00b69924:
    /* 0x00b69924: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b69928: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
    /* 0x00b6992c: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69930: b        #0xb6943c */ goto loc_00b6943c;
loc_00b69934:
    /* 0x00b69934: ldr      w8, [sp, #0x108] */ ARM64("ldr w8, [sp, #0x108]");
    /* 0x00b69938: mov      w8, w8 */ ARM64("mov w8, w8");
    /* 0x00b6993c: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b69940: b.ls     #0xb6b9a8 */ if (COND_LS) goto loc_00b6b9a8;
    /* 0x00b69944: umaddl   x8, w8, w20, x25 */ ARM64("umaddl x8, w8, w20, x25");
    /* 0x00b69948: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b6994c: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b69950: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b69954: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b69958: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
    /* 0x00b6995c: b.eq     #0xb6b9a8 */ if (COND_EQ) goto loc_00b6b9a8;
    /* 0x00b69960: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00b69964: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69968: cbnz     x8, #0xb6943c */ if (x8 != 0) goto loc_00b6943c;
    /* 0x00b6996c: sub      x0, x29, #0x88 */ ARM64("sub x0, x29, #0x88");
    /* 0x00b69970: ldr      x1, [sp, #0x170] */ ARM64("ldr x1, [sp, #0x170]");
    /* 0x00b69974: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00b69978: bl       #0xbd8948 */ CALL_DIRECT(sub_00bd8948);
    /* 0x00b6997c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69980: ldr      x1, [sp, #0x170] */ ARM64("ldr x1, [sp, #0x170]");
    /* 0x00b69984: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00b69988: bl       #0xbd8578 */ CALL_DIRECT(sub_00bd8578);
    /* 0x00b6998c: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b69990: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00b69994: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b69998: b.eq     #0xb6b760 */ if (COND_EQ) goto loc_00b6b760;
    /* 0x00b6999c: ldr      q0, [x26, #0x20] */ ARM64("ldr q0, [x26, #0x20]");
    /* 0x00b699a0: str      q0, [x28, #0x50] */ ARM64("str q0, [x28, #0x50]");
    /* 0x00b699a4: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b699a8: str      x8, [sp, #0x5b0] */ ARM64("str x8, [sp, #0x5b0]");
    /* 0x00b699ac: ldr      x8, [sp, #0x170] */ ARM64("ldr x8, [sp, #0x170]");
    /* 0x00b699b0: ldr      w9, [x8, #0x78] */ ARM64("ldr w9, [x8, #0x78]");
    /* 0x00b699b4: ldr      x8, [x8, #0x28] */ ARM64("ldr x8, [x8, #0x28]");
    /* 0x00b699b8: cmp      w9, #1 */ ARM64("cmp w9, #1");
    /* 0x00b699bc: b.ne     #0xb699fc */ if (COND_NE) goto loc_00b699fc;
    /* 0x00b699c0: ldr      x9, [sp, #0x170] */ ARM64("ldr x9, [sp, #0x170]");
    /* 0x00b699c4: ldr      w9, [x9, #0x7c] */ ARM64("ldr w9, [x9, #0x7c]");
    /* 0x00b699c8: cmp      w22, w9 */ ARM64("cmp w22, w9");
    /* 0x00b699cc: b.ne     #0xb699fc */ if (COND_NE) goto loc_00b699fc;
    /* 0x00b699d0: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00b699d4: ldr      x11, [sp, #0x170] */ ARM64("ldr x11, [sp, #0x170]");
    /* 0x00b699d8: b.ls     #0xb6b854 */ if (COND_LS) goto loc_00b6b854;
    /* 0x00b699dc: ldr      x9, [x11, #0x20] */ ARM64("ldr x9, [x11, #0x20]");
    /* 0x00b699e0: lsl      x10, x24, #5 */ ARM64("lsl x10, x24, #5");
    /* 0x00b699e4: ldr      x9, [x9, x10] */ ARM64("ldr x9, [x9, x10]");
    /* 0x00b699e8: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b699ec: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b699f0: b.eq     #0xb6b854 */ if (COND_EQ) goto loc_00b6b854;
    /* 0x00b699f4: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00b699f8: stp      w9, w24, [x11, #0x78] */ ARM64("stp w9, w24, [x11, #0x78]");
loc_00b699fc:
    /* 0x00b699fc: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00b69a00: b.ls     #0xb6b9f0 */ if (COND_LS) goto loc_00b6b9f0;
    /* 0x00b69a04: ldr      x8, [sp, #0x170] */ ARM64("ldr x8, [sp, #0x170]");
    /* 0x00b69a08: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00b69a0c: add      x22, x8, x24, lsl #5 */ ARM64("add x22, x8, x24, lsl #5");
    /* 0x00b69a10: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00b69a14: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00b69a18: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b69a1c: b.eq     #0xb6b9f0 */ if (COND_EQ) goto loc_00b6b9f0;
    /* 0x00b69a20: ldr      x21, [sp, #0x5a0] */ ARM64("ldr x21, [sp, #0x5a0]");
    /* 0x00b69a24: ldr      x28, [sp, #0x5a8] */ ARM64("ldr x28, [sp, #0x5a8]");
    /* 0x00b69a28: ldr      x26, [sp, #0x5b0] */ ARM64("ldr x26, [sp, #0x5b0]");
    /* 0x00b69a2c: add      x9, x26, x26, lsl #5 */ ARM64("add x9, x26, x26, lsl #5");
    /* 0x00b69a30: lsl      x23, x9, #3 */ ARM64("lsl x23, x9, #3");
    /* 0x00b69a34: add      x9, x28, x23 */ ARM64("add x9, x28, x23");
    /* 0x00b69a38: str      x28, [sp, #0x230] */ ARM64("str x28, [sp, #0x230]");
    /* 0x00b69a3c: str      x28, [sp, #0x238] */ ARM64("str x28, [sp, #0x238]");
    /* 0x00b69a40: str      x21, [sp, #0x240] */ ARM64("str x21, [sp, #0x240]");
    /* 0x00b69a44: str      x9, [sp, #0x248] */ ARM64("str x9, [sp, #0x248]");
    /* 0x00b69a48: ldr      x25, [x22, #0x10] */ ARM64("ldr x25, [x22, #0x10]");
    /* 0x00b69a4c: sub      x8, x8, x25 */ ARM64("sub x8, x8, x25");
    /* 0x00b69a50: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b69a54: b.hi     #0xb69c04 */ if (COND_HI) goto loc_00b69c04;
    /* 0x00b69a58: cbz      x26, #0xb69a74 */ if (x26 == 0) goto loc_00b69a74;
loc_00b69a5c:
    /* 0x00b69a5c: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00b69a60: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00b69a64: madd     x0, x25, x9, x8 */ ARM64("madd x0, x25, x9, x8");
    /* 0x00b69a68: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00b69a6c: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b69a70: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
loc_00b69a74:
    /* 0x00b69a74: add      x8, x25, x26 */ ARM64("add x8, x25, x26");
    /* 0x00b69a78: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
    /* 0x00b69a7c: str      x28, [sp, #0x248] */ ARM64("str x28, [sp, #0x248]");
    /* 0x00b69a80: cbz      x21, #0xb69a8c */ if (x21 == 0) goto loc_00b69a8c;
    /* 0x00b69a84: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b69a88: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69a8c:
    /* 0x00b69a8c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69a90: sub      x3, x29, #0x88 */ ARM64("sub x3, x29, #0x88");
    /* 0x00b69a94: ldr      x1, [sp, #0x170] */ ARM64("ldr x1, [sp, #0x170]");
    /* 0x00b69a98: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b69a9c: bl       #0xbd9184 */ CALL_DIRECT(sub_00bd9184);
    /* 0x00b69aa0: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b69aa4: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00b69aa8: ldr      x8, [sp, #0x238] */ ARM64("ldr x8, [sp, #0x238]");
    /* 0x00b69aac: ldr      x21, [sp, #0x240] */ ARM64("ldr x21, [sp, #0x240]");
    /* 0x00b69ab0: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
    /* 0x00b69ab4: add      x22, x8, #0x30 */ ARM64("add x22, x8, #0x30");
    /* 0x00b69ab8: str      x21, [sp, #0xc8] */ ARM64("str x21, [sp, #0xc8]");
    /* 0x00b69abc: b        #0xb69acc */ goto loc_00b69acc;
loc_00b69ac0:
    /* 0x00b69ac0: add      x22, x22, #0x28 */ ARM64("add x22, x22, #0x28");
    /* 0x00b69ac4: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00b69ac8: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
loc_00b69acc:
    /* 0x00b69acc: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b69ad0: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00b69ad4: b.eq     #0xb69bcc */ if (COND_EQ) goto loc_00b69bcc;
    /* 0x00b69ad8: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00b69adc: mov      w8, #0x28 */ ARM64("mov w8, #0x28");
    /* 0x00b69ae0: ldr      x9, [sp, #0x80] */ ARM64("ldr x9, [sp, #0x80]");
    /* 0x00b69ae4: madd     x24, x23, x8, x9 */ ARM64("madd x24, x23, x8, x9");
    /* 0x00b69ae8: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00b69aec: ldp      x26, x28, [x24, #0x10] */ ARM64("ldp x26, x28, [x24, #0x10]");
    /* 0x00b69af0: b        #0xb69afc */ goto loc_00b69afc;
loc_00b69af4:
    /* 0x00b69af4: add      x0, x27, #8 */ ARM64("add x0, x27, #8");
    /* 0x00b69af8: bl       #0xb9b2c4 */ CALL_DIRECT(sub_00b9b2c4);
loc_00b69afc:
    /* 0x00b69afc: cmp      x25, x28 */ ARM64("cmp x25, x28");
    /* 0x00b69b00: b.eq     #0xb69b38 */ if (COND_EQ) goto loc_00b69b38;
    /* 0x00b69b04: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00b69b08: madd     x27, x25, x8, x26 */ ARM64("madd x27, x25, x8, x26");
    /* 0x00b69b0c: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b69b10: ldr      x8, [x27] */ ARM64("ldr x8, [x27]");
loc_00b69b14:
    /* 0x00b69b14: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b69b18: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b69b1c: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b69b20: cbnz     w10, #0xb69b14 */ if (w10 != 0) goto loc_00b69b14;
    /* 0x00b69b24: b.ne     #0xb69af4 */ if (COND_NE) goto loc_00b69af4;
    /* 0x00b69b28: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b69b2c: ldr      x0, [x27] */ ARM64("ldr x0, [x27]");
    /* 0x00b69b30: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b69b34: b        #0xb69af4 */ goto loc_00b69af4;
loc_00b69b38:
    /* 0x00b69b38: ldr      x8, [x24, #8] */ ARM64("ldr x8, [x24, #8]");
    /* 0x00b69b3c: cbz      x8, #0xb69ac0 */ if (x8 == 0) goto loc_00b69ac0;
    /* 0x00b69b40: ldr      x0, [x24, #0x10] */ ARM64("ldr x0, [x24, #0x10]");
    /* 0x00b69b44: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b69b48: b        #0xb69ac0 */ goto loc_00b69ac0;
loc_00b69b4c:
    /* 0x00b69b4c: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b69b50: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b69b54: ldr      x21, [sp, #0x120] */ ARM64("ldr x21, [sp, #0x120]");
    /* 0x00b69b58: b        #0xb69b74 */ goto loc_00b69b74;
loc_00b69b5c:
    /* 0x00b69b5c: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b69b60: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b69b64: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69b68: ldr      x21, [sp, #0x120] */ ARM64("ldr x21, [sp, #0x120]");
    /* 0x00b69b6c: ldr      x13, [sp, #0x80] */ ARM64("ldr x13, [sp, #0x80]");
    /* 0x00b69b70: cbz      w22, #0xb69574 */ if (w22 == 0) goto loc_00b69574;
loc_00b69b74:
    /* 0x00b69b74: ldr      x1, [sp, #0x170] */ ARM64("ldr x1, [sp, #0x170]");
    /* 0x00b69b78: ldp      w8, w9, [x1, #0x78] */ ARM64("ldp w8, w9, [x1, #0x78]");
    /* 0x00b69b7c: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b69b80: ccmp     w9, w24, #0, eq */ ARM64("ccmp w9, w24, #0, eq");
    /* 0x00b69b84: b.eq     #0xb69574 */ if (COND_EQ) goto loc_00b69574;
    /* 0x00b69b88: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69b8c: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b69b90: bl       #0xbd8578 */ CALL_DIRECT(sub_00bd8578);
    /* 0x00b69b94: ldr      x21, [sp, #0x230] */ ARM64("ldr x21, [sp, #0x230]");
    /* 0x00b69b98: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00b69b9c: cmp      x21, x8 */ ARM64("cmp x21, x8");
    /* 0x00b69ba0: b.eq     #0xb69434 */ if (COND_EQ) goto loc_00b69434;
    /* 0x00b69ba4: ldr      x22, [sp, #0x238] */ ARM64("ldr x22, [sp, #0x238]");
    /* 0x00b69ba8: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b69bac: add      x25, x8, #1 */ ARM64("add x25, x8, #1");
    /* 0x00b69bb0: mov      x0, x22 */ ARM64("mov x0, x22");
loc_00b69bb4:
    /* 0x00b69bb4: subs     x25, x25, #1 */ ARM64("subs x25, x25, #1");
    /* 0x00b69bb8: b.eq     #0xb69bf0 */ if (COND_EQ) goto loc_00b69bf0;
    /* 0x00b69bbc: add      x24, x0, #0x108 */ ARM64("add x24, x0, #0x108");
    /* 0x00b69bc0: bl       #0xb9a8fc */ CALL_DIRECT(sub_00b9a8fc);
    /* 0x00b69bc4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b69bc8: b        #0xb69bb4 */ goto loc_00b69bb4;
loc_00b69bcc:
    /* 0x00b69bcc: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b69bd0: cbz      x8, #0xb69bdc */ if (x8 == 0) goto loc_00b69bdc;
    /* 0x00b69bd4: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b69bd8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b69bdc:
    /* 0x00b69bdc: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00b69be0: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b69be4: ldr      w22, [sp, #0xe4] */ ARM64("ldr w22, [sp, #0xe4]");
    /* 0x00b69be8: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69bec: b        #0xb69438 */ goto loc_00b69438;
loc_00b69bf0:
    /* 0x00b69bf0: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69bf4: cbz      x21, #0xb69434 */ if (x21 == 0) goto loc_00b69434;
    /* 0x00b69bf8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b69bfc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b69c00: b        #0xb69434 */ goto loc_00b69434;
loc_00b69c04:
    /* 0x00b69c04: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b69c08: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00b69c0c: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00b69c10: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b69c14: mov      w4, #0x108 */ ARM64("mov w4, #0x108");
    /* 0x00b69c18: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00b69c1c: ldr      x25, [x22, #0x10] */ ARM64("ldr x25, [x22, #0x10]");
    /* 0x00b69c20: b        #0xb69a5c */ goto loc_00b69a5c;
loc_00b69c24:
    /* 0x00b69c24: mov      x22, x24 */ ARM64("mov x22, x24");
    /* 0x00b69c28: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69c2c: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b69c30: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69c34: cbnz     x24, #0xb6867c */ if (x24 != 0) goto loc_00b6867c;
    /* 0x00b69c38: b        #0xb6b94c */ goto loc_00b6b94c;
loc_00b69c3c:
    /* 0x00b69c3c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b69c40: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b69c44: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b69c48: b        #0xb67d64 */ goto loc_00b67d64;
loc_00b69c4c:
    /* 0x00b69c4c: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b69c50: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b69c54: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b69c58: b        #0xb685c4 */ goto loc_00b685c4;
loc_00b69c5c:
    /* 0x00b69c5c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69c60: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b69c64: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b69c68: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b69c6c: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00b69c70: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00b69c74: b        #0xb69d24 */ goto loc_00b69d24;
loc_00b69c78:
    /* 0x00b69c78: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00b69c7c: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b69c80: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b69c84: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b69c88: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b69c8c: b.eq     #0xb69cbc */ if (COND_EQ) goto loc_00b69cbc;
loc_00b69c90:
    /* 0x00b69c90: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b69c94: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b69c98: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b69c9c: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00b69ca0: sub      x17, x9, x16, lsl #4 */ ARM64("sub x17, x9, x16, lsl #4");
    /* 0x00b69ca4: ldur     w17, [x17, #-0x10] */ ARM64("ldur w17, [x17, #-0x10]");
    /* 0x00b69ca8: cmp      w22, w17 */ ARM64("cmp w22, w17");
    /* 0x00b69cac: b.eq     #0xb69d08 */ if (COND_EQ) goto loc_00b69d08;
    /* 0x00b69cb0: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b69cb4: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b69cb8: b.ne     #0xb69c90 */ if (COND_NE) goto loc_00b69c90;
loc_00b69cbc:
    /* 0x00b69cbc: cmp      x11, #1 */ ARM64("cmp x11, #1");
    /* 0x00b69cc0: b.eq     #0xb69ce0 */ if (COND_EQ) goto loc_00b69ce0;
    /* 0x00b69cc4: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b69cc8: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b69ccc: cbz      x11, #0xb69cfc */ if (x11 == 0) goto loc_00b69cfc;
    /* 0x00b69cd0: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00b69cd4: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b69cd8: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00b69cdc: and      x13, x11, x12 */ ARM64("and x13, x11, x12");
loc_00b69ce0:
    /* 0x00b69ce0: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b69ce4: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b69ce8: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b69cec: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b69cf0: tbnz     w11, #0, #0xb69e58 */ if (((w11 >> #0) & 1) != 0) goto loc_00b69e58;
    /* 0x00b69cf4: mov      w11, #1 */ ARM64("mov w11, #1");
    /* 0x00b69cf8: b        #0xb69cfc */ goto loc_00b69cfc;
loc_00b69cfc:
    /* 0x00b69cfc: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b69d00: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b69d04: b        #0xb69c78 */ goto loc_00b69c78;
loc_00b69d08:
    /* 0x00b69d08: neg      x8, x16 */ ARM64("neg x8, x16");
    /* 0x00b69d0c: mov      w22, #0 */ ARM64("mov w22, #0");
    /* 0x00b69d10: add      x8, x9, x8, lsl #4 */ ARM64("add x8, x9, x8, lsl #4");
    /* 0x00b69d14: stur     x21, [x8, #-8] */ ARM64("stur x21, [x8, #-8]");
    /* 0x00b69d18: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b69d1c: cmp      x21, x0 */ ARM64("cmp x21, x0");
    /* 0x00b69d20: b.eq     #0xb685e8 */ if (COND_EQ) goto loc_00b685e8;
loc_00b69d24:
    /* 0x00b69d24: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b69d28: ldr      w22, [x8, x21, lsl #2] */ ARM64("ldr w22, [x8, x21, lsl #2]");
    /* 0x00b69d2c: ldr      x23, [sp, #0x258] */ ARM64("ldr x23, [sp, #0x258]");
    /* 0x00b69d30: ldr      x24, [sp, #0x250] */ ARM64("ldr x24, [sp, #0x250]");
    /* 0x00b69d34: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b69d38: cbz      x8, #0xb69eb4 */ if (x8 == 0) goto loc_00b69eb4;
loc_00b69d3c:
    /* 0x00b69d3c: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00b69d40: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b69d44: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b69d48: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b69d4c: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b69d50: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b69d54: eor      x9, x24, x9 */ ARM64("eor x9, x24, x9");
    /* 0x00b69d58: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00b69d5c: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00b69d60: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00b69d64: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00b69d68: eor      x10, x23, x10 */ ARM64("eor x10, x23, x10");
    /* 0x00b69d6c: mov      x12, #0x7261 */ ARM64("mov x12, #0x7261");
    /* 0x00b69d70: movk     x12, #0x6e65, lsl #16 */ ARM64("movk x12, #0x6e65, lsl #16");
    /* 0x00b69d74: movk     x12, #0x6765, lsl #32 */ ARM64("movk x12, #0x6765, lsl #32");
    /* 0x00b69d78: movk     x12, #0x6c79, lsl #48 */ ARM64("movk x12, #0x6c79, lsl #48");
    /* 0x00b69d7c: eor      x12, x24, x12 */ ARM64("eor x12, x24, x12");
    /* 0x00b69d80: orr      x13, x22, #0x400000000000000 */ ARM64("orr x13, x22, #0x400000000000000");
    /* 0x00b69d84: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00b69d88: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00b69d8c: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00b69d90: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00b69d94: eor      x14, x23, x14 */ ARM64("eor x14, x23, x14");
    /* 0x00b69d98: eor      x14, x14, x13 */ ARM64("eor x14, x14, x13");
    /* 0x00b69d9c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b69da0: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b69da4: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b69da8: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b69dac: eor      x14, x12, x14, ror #48 */ ARM64("eor x14, x12, x14, ror #48");
    /* 0x00b69db0: add      x12, x12, x10 */ ARM64("add x12, x12, x10");
    /* 0x00b69db4: add      x9, x14, x9 */ ARM64("add x9, x14, x9");
    /* 0x00b69db8: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b69dbc: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b69dc0: eor      x14, x9, x14, ror #43 */ ARM64("eor x14, x9, x14, ror #43");
    /* 0x00b69dc4: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b69dc8: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b69dcc: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00b69dd0: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b69dd4: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b69dd8: eor      x13, x12, x14, ror #48 */ ARM64("eor x13, x12, x14, ror #48");
    /* 0x00b69ddc: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b69de0: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b69de4: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b69de8: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b69dec: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b69df0: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b69df4: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b69df8: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b69dfc: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b69e00: eor      x13, x12, x13, ror #48 */ ARM64("eor x13, x12, x13, ror #48");
    /* 0x00b69e04: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b69e08: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b69e0c: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b69e10: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b69e14: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b69e18: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b69e1c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b69e20: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b69e24: eor      x9, x9, x10, ror #51 */ ARM64("eor x9, x9, x10, ror #51");
    /* 0x00b69e28: eor      x10, x12, x13, ror #48 */ ARM64("eor x10, x12, x13, ror #48");
    /* 0x00b69e2c: add      x12, x9, x12 */ ARM64("add x12, x9, x12");
    /* 0x00b69e30: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b69e34: eor      x9, x10, x9, ror #47 */ ARM64("eor x9, x10, x9, ror #47");
    /* 0x00b69e38: eor      x9, x9, x12, ror #32 */ ARM64("eor x9, x9, x12, ror #32");
    /* 0x00b69e3c: eor      x14, x9, x12 */ ARM64("eor x14, x9, x12");
    /* 0x00b69e40: ldr      x9, [sp, #0x230] */ ARM64("ldr x9, [sp, #0x230]");
    /* 0x00b69e44: ldr      x12, [sp, #0x238] */ ARM64("ldr x12, [sp, #0x238]");
    /* 0x00b69e48: lsr      x10, x14, #0x39 */ ARM64("lsr x10, x14, #0x39");
    /* 0x00b69e4c: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
    /* 0x00b69e50: ldr      x0, [sp, #0x178] */ ARM64("ldr x0, [sp, #0x178]");
    /* 0x00b69e54: b        #0xb69c78 */ goto loc_00b69c78;
loc_00b69e58:
    /* 0x00b69e58: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b69e5c: tbz      w8, #0x1f, #0xb69ecc */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b69ecc;
loc_00b69e60:
    /* 0x00b69e60: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b69e64: sub      x11, x13, #8 */ ARM64("sub x11, x13, #8");
    /* 0x00b69e68: strb     w10, [x9, x13] */ ARM64("strb w10, [x9, x13]");
    /* 0x00b69e6c: and      x11, x12, x11 */ ARM64("and x11, x12, x11");
    /* 0x00b69e70: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b69e74: strb     w10, [x11, #8] */ ARM64("strb w10, [x11, #8]");
    /* 0x00b69e78: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b69e7c: mov      v0.d[0], x8 */ ARM64("mov v0.d[0], x8");
    /* 0x00b69e80: ldr      q1, [x26, #0x30] */ ARM64("ldr q1, [x26, #0x30]");
    /* 0x00b69e84: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00b69e88: str      q0, [x26, #0x30] */ ARM64("str q0, [x26, #0x30]");
    /* 0x00b69e8c: neg      x8, x13 */ ARM64("neg x8, x13");
    /* 0x00b69e90: sub      x10, x9, x13, lsl #4 */ ARM64("sub x10, x9, x13, lsl #4");
    /* 0x00b69e94: stur     w22, [x10, #-0x10] */ ARM64("stur w22, [x10, #-0x10]");
    /* 0x00b69e98: mov      w22, #0 */ ARM64("mov w22, #0");
    /* 0x00b69e9c: add      x8, x9, x8, lsl #4 */ ARM64("add x8, x9, x8, lsl #4");
    /* 0x00b69ea0: stur     x21, [x8, #-8] */ ARM64("stur x21, [x8, #-8]");
    /* 0x00b69ea4: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b69ea8: cmp      x21, x0 */ ARM64("cmp x21, x0");
    /* 0x00b69eac: b.ne     #0xb69d24 */ if (COND_NE) goto loc_00b69d24;
    /* 0x00b69eb0: b        #0xb685e8 */ goto loc_00b685e8;
loc_00b69eb4:
    /* 0x00b69eb4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69eb8: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b69ebc: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b69ec0: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b69ec4: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00b69ec8: b        #0xb69d3c */ goto loc_00b69d3c;
loc_00b69ecc:
    /* 0x00b69ecc: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b69ed0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b69ed4: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b69ed8: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b69edc: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b69ee0: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b69ee4: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b69ee8: b        #0xb69e60 */ goto loc_00b69e60;
loc_00b69eec:
    /* 0x00b69eec: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b69ef0: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b69ef4: b        #0xb68fd4 */ goto loc_00b68fd4;
loc_00b69ef8:
    /* 0x00b69ef8: ldr      x8, [sp, #0x160] */ ARM64("ldr x8, [sp, #0x160]");
    /* 0x00b69efc: sub      x8, x8, x21 */ ARM64("sub x8, x8, x21");
    /* 0x00b69f00: lsr      x1, x8, #3 */ ARM64("lsr x1, x8, #3");
    /* 0x00b69f04: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69f08: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b69f0c: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b69f10: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00b69f14: b        #0xb69004 */ goto loc_00b69004;
loc_00b69f18:
    /* 0x00b69f18: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00b69f1c:
    /* 0x00b69f1c: ldr      x1, [sp, #0xe8] */ ARM64("ldr x1, [sp, #0xe8]");
    /* 0x00b69f20: ldr      x20, [sp, #0x120] */ ARM64("ldr x20, [sp, #0x120]");
    /* 0x00b69f24: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b69f28: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b69f2c:
    /* 0x00b69f2c: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b69f30: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00b69f34: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69f38: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b69f3c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b69f40:
    /* 0x00b69f40: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b69f44: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00b69f48: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b69f4c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b69f50:
    /* 0x00b69f50: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b69f54: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
loc_00b69f58:
    /* 0x00b69f58: str      x9, [x8] */ ARM64("str x9, [x8]");
    /* 0x00b69f5c: ldr      x0, [sp, #0x230] */ ARM64("ldr x0, [sp, #0x230]");
    /* 0x00b69f60: ldr      x1, [sp, #0x5a0] */ ARM64("ldr x1, [sp, #0x5a0]");
    /* 0x00b69f64: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b69f68: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b69f6c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b69f70:
    /* 0x00b69f70: add      x8, sp, #0x6a0 */ ARM64("add x8, sp, #0x6a0");
    /* 0x00b69f74: str      x8, [sp, #0x5a0] */ ARM64("str x8, [sp, #0x5a0]");
    /* 0x00b69f78: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b69f7c: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00b69f80: b        #0xb69f94 */ goto loc_00b69f94;
loc_00b69f84:
    /* 0x00b69f84: add      x8, sp, #0x6a0 */ ARM64("add x8, sp, #0x6a0");
    /* 0x00b69f88: str      x8, [sp, #0x5a0] */ ARM64("str x8, [sp, #0x5a0]");
    /* 0x00b69f8c: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b69f90: ldr      x9, [sp, #0xb0] */ ARM64("ldr x9, [sp, #0xb0]");
loc_00b69f94:
    /* 0x00b69f94: adrp     x8, #0xbef000 */ ARM64("adrp x8, #0xbef000");
    /* 0x00b69f98: add      x8, x8, #0x1c8 */ ARM64("add x8, x8, #0x1c8");
    /* 0x00b69f9c: stp      x8, x9, [x1, #8] */ ARM64("stp x8, x9, [x1, #8]");
    /* 0x00b69fa0: str      x8, [x1, #0x18] */ ARM64("str x8, [x1, #0x18]");
    /* 0x00b69fa4: adrp     x0, #0xcb9000 */ ARM64("adrp x0, #0xcb9000");
    /* 0x00b69fa8: add      x0, x0, #0xf36 */ ARM64("add x0, x0, #0xf36");
    /* 0x00b69fac: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b69fb0: add      x2, x2, #0x830 */ ARM64("add x2, x2, #0x830");
    /* 0x00b69fb4: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
    /* 0x00b69fb8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b69fbc:
    /* 0x00b69fbc: ldp      q0, q1, [sp, #0x1e0] */ ARM64("ldp q0, q1, [sp, #0x1e0]");
    /* 0x00b69fc0: add      x9, sp, #0x470 */ ARM64("add x9, sp, #0x470");
    /* 0x00b69fc4: stp      q0, q1, [x9, #0x20] */ ARM64("stp q0, q1, [x9, #0x20]");
    /* 0x00b69fc8: ldr      x8, [sp, #0x200] */ ARM64("ldr x8, [sp, #0x200]");
    /* 0x00b69fcc: str      x8, [sp, #0x4b0] */ ARM64("str x8, [sp, #0x4b0]");
    /* 0x00b69fd0: ldp      q1, q0, [sp, #0x1c0] */ ARM64("ldp q1, q0, [sp, #0x1c0]");
    /* 0x00b69fd4: stp      q1, q0, [x9] */ ARM64("stp q1, q0, [x9]");
    /* 0x00b69fd8: ldr      x8, [sp, #0xf8] */ ARM64("ldr x8, [sp, #0xf8]");
    /* 0x00b69fdc: ldp      x20, x21, [x8, #8] */ ARM64("ldp x20, x21, [x8, #8]");
    /* 0x00b69fe0: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b69fe4: stp      q1, q0, [x26, #0x20] */ ARM64("stp q1, q0, [x26, #0x20]");
    /* 0x00b69fe8: cbnz     x21, #0xb6b7ac */ if (x21 != 0) goto loc_00b6b7ac;
loc_00b69fec:
    /* 0x00b69fec: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b69ff0: stp      q0, q1, [x28, #0x130] */ ARM64("stp q0, q1, [x28, #0x130]");
    /* 0x00b69ff4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b69ff8: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00b69ffc: ldr      x20, [sp, #0xb8] */ ARM64("ldr x20, [sp, #0xb8]");
    /* 0x00b6a000: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00b6a004: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00b6a008: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b6a00c: stp      q0, q1, [x28, #0x1a0] */ ARM64("stp q0, q1, [x28, #0x1a0]");
    /* 0x00b6a010: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a014: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00b6a018: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00b6a01c: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00b6a020: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b6a024: stp      q0, q1, [x28] */ ARM64("stp q0, q1, [x28]");
    /* 0x00b6a028: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a02c: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00b6a030: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00b6a034: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00b6a038: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b6a03c: stp      q0, q1, [x28, #0x150] */ ARM64("stp q0, q1, [x28, #0x150]");
    /* 0x00b6a040: ldrb     w8, [x23, #0x10] */ ARM64("ldrb w8, [x23, #0x10]");
    /* 0x00b6a044: tbz      w8, #0, #0xb6b804 */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b804;
    /* 0x00b6a048: mov      w10, #1 */ ARM64("mov w10, #1");
loc_00b6a04c:
    /* 0x00b6a04c: ldp      x11, x8, [x23] */ ARM64("ldp x11, x8, [x23]");
    /* 0x00b6a050: add      x9, x11, #1 */ ARM64("add x9, x11, #1");
    /* 0x00b6a054: str      x9, [x23] */ ARM64("str x9, [x23]");
    /* 0x00b6a058: mov      w12, #8 */ ARM64("mov w12, #8");
    /* 0x00b6a05c: str      xzr, [sp, #0x5a0] */ ARM64("str xzr, [sp, #0x5a0]");
    /* 0x00b6a060: str      x12, [sp, #0x5a8] */ ARM64("str x12, [sp, #0x5a8]");
    /* 0x00b6a064: str      xzr, [sp, #0x5b0] */ ARM64("str xzr, [sp, #0x5b0]");
    /* 0x00b6a068: adrp     x12, #0xe0e000 */ ARM64("adrp x12, #0xe0e000");
    /* 0x00b6a06c: add      x12, x12, #0xd10 */ ARM64("add x12, x12, #0xd10");
    /* 0x00b6a070: str      x12, [sp, #0x5b8] */ ARM64("str x12, [sp, #0x5b8]");
    /* 0x00b6a074: str      xzr, [sp, #0x5c0] */ ARM64("str xzr, [sp, #0x5c0]");
    /* 0x00b6a078: str      xzr, [sp, #0x5c8] */ ARM64("str xzr, [sp, #0x5c8]");
    /* 0x00b6a07c: str      xzr, [sp, #0x5d0] */ ARM64("str xzr, [sp, #0x5d0]");
    /* 0x00b6a080: str      x11, [sp, #0x5d8] */ ARM64("str x11, [sp, #0x5d8]");
    /* 0x00b6a084: str      x8, [sp, #0x5e0] */ ARM64("str x8, [sp, #0x5e0]");
    /* 0x00b6a088: tbz      w10, #0, #0xb6b824 */ if (((w10 >> #0) & 1) == 0) goto loc_00b6b824;
loc_00b6a08c:
    /* 0x00b6a08c: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00b6a090: str      x10, [x23] */ ARM64("str x10, [x23]");
    /* 0x00b6a094: ldp      q1, q0, [x28, #0x50] */ ARM64("ldp q1, q0, [x28, #0x50]");
    /* 0x00b6a098: stur     q0, [x26, #0x78] */ ARM64("stur q0, [x26, #0x78]");
    /* 0x00b6a09c: ldp      q0, q2, [x28, #0x70] */ ARM64("ldp q0, q2, [x28, #0x70]");
    /* 0x00b6a0a0: stur     q0, [x26, #0x88] */ ARM64("stur q0, [x26, #0x88]");
    /* 0x00b6a0a4: stur     q2, [x26, #0x98] */ ARM64("stur q2, [x26, #0x98]");
    /* 0x00b6a0a8: ldr      x10, [sp, #0x5e0] */ ARM64("ldr x10, [sp, #0x5e0]");
    /* 0x00b6a0ac: stur     q1, [x26, #0x68] */ ARM64("stur q1, [x26, #0x68]");
    /* 0x00b6a0b0: ldp      q0, q1, [sp, #0x1c0] */ ARM64("ldp q0, q1, [sp, #0x1c0]");
    /* 0x00b6a0b4: ldp      q2, q3, [sp, #0x1e0] */ ARM64("ldp q2, q3, [sp, #0x1e0]");
    /* 0x00b6a0b8: ldr      x11, [sp, #0x200] */ ARM64("ldr x11, [sp, #0x200]");
    /* 0x00b6a0bc: str      x10, [sp, #0x2b8] */ ARM64("str x10, [sp, #0x2b8]");
    /* 0x00b6a0c0: str      x11, [sp, #0x270] */ ARM64("str x11, [sp, #0x270]");
    /* 0x00b6a0c4: stp      q2, q3, [x26, #0x40] */ ARM64("stp q2, q3, [x26, #0x40]");
    /* 0x00b6a0c8: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b6a0cc: ldp      q0, q1, [x28, #0x130] */ ARM64("ldp q0, q1, [x28, #0x130]");
    /* 0x00b6a0d0: stp      q0, q1, [x26, #0x100] */ ARM64("stp q0, q1, [x26, #0x100]");
    /* 0x00b6a0d4: ldp      q0, q1, [x28, #0x1a0] */ ARM64("ldp q0, q1, [x28, #0x1a0]");
    /* 0x00b6a0d8: stp      q0, q1, [x26, #0x120] */ ARM64("stp q0, q1, [x26, #0x120]");
    /* 0x00b6a0dc: ldp      q0, q1, [x28] */ ARM64("ldp q0, q1, [x28]");
    /* 0x00b6a0e0: stp      q0, q1, [x26, #0x140] */ ARM64("stp q0, q1, [x26, #0x140]");
    /* 0x00b6a0e4: ldp      q2, q3, [sp, #0x130] */ ARM64("ldp q2, q3, [sp, #0x130]");
    /* 0x00b6a0e8: stp      q3, q2, [x26, #0x160] */ ARM64("stp q3, q2, [x26, #0x160]");
    /* 0x00b6a0ec: stp      q3, q2, [x26, #0x180] */ ARM64("stp q3, q2, [x26, #0x180]");
    /* 0x00b6a0f0: ldp      q0, q1, [x28, #0x150] */ ARM64("ldp q0, q1, [x28, #0x150]");
    /* 0x00b6a0f4: stp      q0, q1, [x26, #0x1a0] */ ARM64("stp q0, q1, [x26, #0x1a0]");
    /* 0x00b6a0f8: stp      q3, q2, [x26, #0x1c0] */ ARM64("stp q3, q2, [x26, #0x1c0]");
    /* 0x00b6a0fc: mov      w10, #8 */ ARM64("mov w10, #8");
    /* 0x00b6a100: str      xzr, [sp, #0x2c0] */ ARM64("str xzr, [sp, #0x2c0]");
    /* 0x00b6a104: str      x10, [sp, #0x2c8] */ ARM64("str x10, [sp, #0x2c8]");
    /* 0x00b6a108: str      xzr, [sp, #0x2d0] */ ARM64("str xzr, [sp, #0x2d0]");
    /* 0x00b6a10c: adrp     x10, #0xe0e000 */ ARM64("adrp x10, #0xe0e000");
    /* 0x00b6a110: add      x10, x10, #0xd10 */ ARM64("add x10, x10, #0xd10");
    /* 0x00b6a114: str      x10, [sp, #0x2d8] */ ARM64("str x10, [sp, #0x2d8]");
    /* 0x00b6a118: str      xzr, [sp, #0x2e8] */ ARM64("str xzr, [sp, #0x2e8]");
    /* 0x00b6a11c: str      xzr, [sp, #0x2e0] */ ARM64("str xzr, [sp, #0x2e0]");
    /* 0x00b6a120: str      xzr, [sp, #0x2f0] */ ARM64("str xzr, [sp, #0x2f0]");
    /* 0x00b6a124: str      x9, [sp, #0x2f8] */ ARM64("str x9, [sp, #0x2f8]");
    /* 0x00b6a128: ldr      x21, [sp, #0x170] */ ARM64("ldr x21, [sp, #0x170]");
    /* 0x00b6a12c: str      x21, [sp, #0x308] */ ARM64("str x21, [sp, #0x308]");
    /* 0x00b6a130: str      x8, [sp, #0x300] */ ARM64("str x8, [sp, #0x300]");
    /* 0x00b6a134: stp      q3, q2, [x26, #0x1e0] */ ARM64("stp q3, q2, [x26, #0x1e0]");
    /* 0x00b6a138: stp      q3, q2, [x26, #0x200] */ ARM64("stp q3, q2, [x26, #0x200]");
    /* 0x00b6a13c: stp      q3, q2, [x26, #0x220] */ ARM64("stp q3, q2, [x26, #0x220]");
    /* 0x00b6a140: add      x20, sp, #0x230 */ ARM64("add x20, sp, #0x230");
    /* 0x00b6a144: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a148: bl       #0xb9fa50 */ CALL_DIRECT(sub_00b9fa50);
    /* 0x00b6a14c: ldr      q0, [x21] */ ARM64("ldr q0, [x21]");
    /* 0x00b6a150: str      q0, [x26, #0x240] */ ARM64("str q0, [x26, #0x240]");
    /* 0x00b6a154: ldr      x8, [x21, #0x10] */ ARM64("ldr x8, [x21, #0x10]");
    /* 0x00b6a158: str      xzr, [x21, #0x10] */ ARM64("str xzr, [x21, #0x10]");
    /* 0x00b6a15c: ldp      q0, q1, [x21, #0x50] */ ARM64("ldp q0, q1, [x21, #0x50]");
    /* 0x00b6a160: ldp      q2, q3, [x21, #0x70] */ ARM64("ldp q2, q3, [x21, #0x70]");
    /* 0x00b6a164: stp      q1, q2, [x26, #0x80] */ ARM64("stp q1, q2, [x26, #0x80]");
    /* 0x00b6a168: ldp      q1, q2, [x21, #0x10] */ ARM64("ldp q1, q2, [x21, #0x10]");
    /* 0x00b6a16c: ldp      q4, q5, [x21, #0x30] */ ARM64("ldp q4, q5, [x21, #0x30]");
    /* 0x00b6a170: stp      q2, q4, [x26, #0x40] */ ARM64("stp q2, q4, [x26, #0x40]");
    /* 0x00b6a174: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00b6a178: stp      xzr, x9, [x21] */ ARM64("stp xzr, x9, [x21]");
    /* 0x00b6a17c: stp      q5, q0, [x26, #0x60] */ ARM64("stp q5, q0, [x26, #0x60]");
    /* 0x00b6a180: ldr      q0, [x21] */ ARM64("ldr q0, [x21]");
    /* 0x00b6a184: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b6a188: str      x8, [sp, #0x460] */ ARM64("str x8, [sp, #0x460]");
    /* 0x00b6a18c: ldrb     w8, [x21, #0x88] */ ARM64("ldrb w8, [x21, #0x88]");
    /* 0x00b6a190: str      w8, [sp, #0x160] */ ARM64("str w8, [sp, #0x160]");
    /* 0x00b6a194: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b6a198: stp      q3, q1, [x26, #0xa0] */ ARM64("stp q3, q1, [x26, #0xa0]");
    /* 0x00b6a19c: stp      q0, q1, [x26, #0xc0] */ ARM64("stp q0, q1, [x26, #0xc0]");
    /* 0x00b6a1a0: str      q0, [x26, #0xe0] */ ARM64("str q0, [x26, #0xe0]");
    /* 0x00b6a1a4: ldr      w8, [sp, #0x2a8] */ ARM64("ldr w8, [sp, #0x2a8]");
    /* 0x00b6a1a8: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b6a1ac: b.ne     #0xb6b844 */ if (COND_NE) goto loc_00b6b844;
    /* 0x00b6a1b0: ldr      w1, [sp, #0x2ac] */ ARM64("ldr w1, [sp, #0x2ac]");
    /* 0x00b6a1b4: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6a1b8: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00b6a1bc: add      x2, x20, #0x90 */ ARM64("add x2, x20, #0x90");
    /* 0x00b6a1c0: bl       #0xc2b800 */ CALL_DIRECT(sub_00c2b800);
    /* 0x00b6a1c4: ldp      q0, q1, [x26, #0xc0] */ ARM64("ldp q0, q1, [x26, #0xc0]");
    /* 0x00b6a1c8: stp      q0, q1, [x28, #0xf0] */ ARM64("stp q0, q1, [x28, #0xf0]");
    /* 0x00b6a1cc: ldr      q0, [x26, #0xe0] */ ARM64("ldr q0, [x26, #0xe0]");
    /* 0x00b6a1d0: str      q0, [x28, #0x110] */ ARM64("str q0, [x28, #0x110]");
    /* 0x00b6a1d4: ldp      q0, q1, [x26, #0x80] */ ARM64("ldp q0, q1, [x26, #0x80]");
    /* 0x00b6a1d8: stp      q0, q1, [x28, #0xb0] */ ARM64("stp q0, q1, [x28, #0xb0]");
    /* 0x00b6a1dc: ldp      q1, q0, [x26, #0xa0] */ ARM64("ldp q1, q0, [x26, #0xa0]");
    /* 0x00b6a1e0: stp      q1, q0, [x28, #0xd0] */ ARM64("stp q1, q0, [x28, #0xd0]");
    /* 0x00b6a1e4: ldp      q0, q1, [x26, #0x40] */ ARM64("ldp q0, q1, [x26, #0x40]");
    /* 0x00b6a1e8: stp      q0, q1, [x28, #0x70] */ ARM64("stp q0, q1, [x28, #0x70]");
    /* 0x00b6a1ec: ldp      q1, q0, [x26, #0x60] */ ARM64("ldp q1, q0, [x26, #0x60]");
    /* 0x00b6a1f0: stp      q1, q0, [x28, #0x90] */ ARM64("stp q1, q0, [x28, #0x90]");
    /* 0x00b6a1f4: ldp      q1, q0, [x26, #0x20] */ ARM64("ldp q1, q0, [x26, #0x20]");
    /* 0x00b6a1f8: mov      x25, #-0x8000000000000000 */ ARM64("mov x25, #-0x8000000000000000");
    /* 0x00b6a1fc: stp      q1, q0, [x28, #0x50] */ ARM64("stp q1, q0, [x28, #0x50]");
loc_00b6a200:
    /* 0x00b6a200: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a204: bl       #0xc15184 */ CALL_DIRECT(sub_00c15184);
    /* 0x00b6a208: tbnz     w0, #0, #0xb6a200 */ if (((w0 >> #0) & 1) != 0) goto loc_00b6a200;
    /* 0x00b6a20c: ldr      x8, [sp, #0x5e8] */ ARM64("ldr x8, [sp, #0x5e8]");
    /* 0x00b6a210: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b6a214: b.eq     #0xb6a858 */ if (COND_EQ) goto loc_00b6a858;
    /* 0x00b6a218: ldr      x20, [sp, #0x5d8] */ ARM64("ldr x20, [sp, #0x5d8]");
    /* 0x00b6a21c: ldr      x8, [sp, #0x5e0] */ ARM64("ldr x8, [sp, #0x5e0]");
    /* 0x00b6a220: add      x8, x8, x8, lsl #1 */ ARM64("add x8, x8, x8, lsl #1");
    /* 0x00b6a224: lsl      x8, x8, #4 */ ARM64("lsl x8, x8, #4");
    /* 0x00b6a228: add      x21, x20, x8 */ ARM64("add x21, x20, x8");
    /* 0x00b6a22c: mov      x22, #-1 */ ARM64("mov x22, #-1");
loc_00b6a230:
    /* 0x00b6a230: cbz      x8, #0xb6a834 */ if (x8 == 0) goto loc_00b6a834;
    /* 0x00b6a234: mov      x23, x22 */ ARM64("mov x23, x22");
    /* 0x00b6a238: ldr      x9, [x20], #0x30 */ ARM64("ldr x9, [x20], #0x30");
    /* 0x00b6a23c: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b6a240: sub      x8, x8, #0x30 */ ARM64("sub x8, x8, #0x30");
    /* 0x00b6a244: cmp      x9, x25 */ ARM64("cmp x9, x25");
    /* 0x00b6a248: b.eq     #0xb6a230 */ if (COND_EQ) goto loc_00b6a230;
    /* 0x00b6a24c: mov      w0, #0x10 */ ARM64("mov w0, #0x10");
    /* 0x00b6a250: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b6a254: cbz      x0, #0xb6ba00 */ if (x0 == 0) goto loc_00b6ba00;
    /* 0x00b6a258: add      x23, x23, #2 */ ARM64("add x23, x23, #2");
    /* 0x00b6a25c: str      w22, [x0] */ ARM64("str w22, [x0]");
    /* 0x00b6a260: mov      w27, #4 */ ARM64("mov w27, #4");
    /* 0x00b6a264: mov      w22, #1 */ ARM64("mov w22, #1");
    /* 0x00b6a268: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b6a26c: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6a270: str      x0, [sp, #0x238] */ ARM64("str x0, [sp, #0x238]");
loc_00b6a274:
    /* 0x00b6a274: str      x22, [sp, #0x240] */ ARM64("str x22, [sp, #0x240]");
loc_00b6a278:
    /* 0x00b6a278: cmp      x20, x21 */ ARM64("cmp x20, x21");
    /* 0x00b6a27c: b.eq     #0xb6a2cc */ if (COND_EQ) goto loc_00b6a2cc;
    /* 0x00b6a280: mov      x24, x23 */ ARM64("mov x24, x23");
    /* 0x00b6a284: ldr      x8, [x20], #0x30 */ ARM64("ldr x8, [x20], #0x30");
    /* 0x00b6a288: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00b6a28c: cmp      x8, x25 */ ARM64("cmp x8, x25");
    /* 0x00b6a290: b.eq     #0xb6a278 */ if (COND_EQ) goto loc_00b6a278;
    /* 0x00b6a294: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6a298: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00b6a29c: b.ne     #0xb6a2bc */ if (COND_NE) goto loc_00b6a2bc;
    /* 0x00b6a2a0: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a2a4: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b6a2a8: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00b6a2ac: mov      w3, #4 */ ARM64("mov w3, #4");
    /* 0x00b6a2b0: mov      w4, #4 */ ARM64("mov w4, #4");
    /* 0x00b6a2b4: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00b6a2b8: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
loc_00b6a2bc:
    /* 0x00b6a2bc: str      w24, [x0, x22, lsl #2] */ ARM64("str w24, [x0, x22, lsl #2]");
    /* 0x00b6a2c0: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b6a2c4: add      x27, x27, #4 */ ARM64("add x27, x27, #4");
    /* 0x00b6a2c8: b        #0xb6a274 */ goto loc_00b6a274;
loc_00b6a2cc:
    /* 0x00b6a2cc: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6a2d0: ldr      x20, [sp, #0x238] */ ARM64("ldr x20, [sp, #0x238]");
    /* 0x00b6a2d4: add      x23, x20, x22, lsl #2 */ ARM64("add x23, x20, x22, lsl #2");
    /* 0x00b6a2d8: stp      x8, x20, [sp, #0x178] */ ARM64("stp x8, x20, [sp, #0x178]");
    /* 0x00b6a2dc: mov      w24, #0x30 */ ARM64("mov w24, #0x30");
    /* 0x00b6a2e0: b        #0xb6a2fc */ goto loc_00b6a2fc;
loc_00b6a2e4:
    /* 0x00b6a2e4: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6a2e8: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6a2ec: mov      x25, #-0x8000000000000000 */ ARM64("mov x25, #-0x8000000000000000");
    /* 0x00b6a2f0: mov      w24, #0x30 */ ARM64("mov w24, #0x30");
loc_00b6a2f4:
    /* 0x00b6a2f4: cmp      x20, x23 */ ARM64("cmp x20, x23");
    /* 0x00b6a2f8: b.eq     #0xb6a730 */ if (COND_EQ) goto loc_00b6a730;
loc_00b6a2fc:
    /* 0x00b6a2fc: ldr      w22, [x20], #4 */ ARM64("ldr w22, [x20], #4");
    /* 0x00b6a300: ldr      x8, [sp, #0x5e0] */ ARM64("ldr x8, [sp, #0x5e0]");
    /* 0x00b6a304: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00b6a308: b.ls     #0xb6a2f4 */ if (COND_LS) goto loc_00b6a2f4;
    /* 0x00b6a30c: ldr      x8, [sp, #0x5d8] */ ARM64("ldr x8, [sp, #0x5d8]");
    /* 0x00b6a310: umaddl   x8, w22, w24, x8 */ ARM64("umaddl x8, w22, w24, x8");
    /* 0x00b6a314: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b6a318: cmp      x9, x25 */ ARM64("cmp x9, x25");
    /* 0x00b6a31c: b.eq     #0xb6a2f4 */ if (COND_EQ) goto loc_00b6a2f4;
    /* 0x00b6a320: ldr      w9, [sp, #0x618] */ ARM64("ldr w9, [sp, #0x618]");
    /* 0x00b6a324: cmp      w9, #1 */ ARM64("cmp w9, #1");
    /* 0x00b6a328: b.ne     #0xb6b71c */ if (COND_NE) goto loc_00b6b71c;
    /* 0x00b6a32c: ldp      w25, w24, [x8, #0x28] */ ARM64("ldp w25, w24, [x8, #0x28]");
    /* 0x00b6a330: ldr      w2, [sp, #0x61c] */ ARM64("ldr w2, [sp, #0x61c]");
    /* 0x00b6a334: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a338: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6a33c: add      x1, x8, #0x18 */ ARM64("add x1, x8, #0x18");
    /* 0x00b6a340: bl       #0xc39878 */ CALL_DIRECT(sub_00c39878);
    /* 0x00b6a344: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a348: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b6a34c: bl       #0xc2cf20 */ CALL_DIRECT(sub_00c2cf20);
    /* 0x00b6a350: mov      x26, x0 */ ARM64("mov x26, x0");
    /* 0x00b6a354: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a358: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00b6a35c: bl       #0xc2cf20 */ CALL_DIRECT(sub_00c2cf20);
    /* 0x00b6a360: ldr      x28, [sp, #0x230] */ ARM64("ldr x28, [sp, #0x230]");
    /* 0x00b6a364: ldr      x21, [sp, #0x238] */ ARM64("ldr x21, [sp, #0x238]");
    /* 0x00b6a368: cbz      w26, #0xb6a70c */ if (w26 == 0) goto loc_00b6a70c;
    /* 0x00b6a36c: tbz      w0, #0, #0xb6a70c */ if (((w0 >> #0) & 1) == 0) goto loc_00b6a70c;
    /* 0x00b6a370: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b6a374: ldr      x11, [sp, #0x250] */ ARM64("ldr x11, [sp, #0x250]");
    /* 0x00b6a378: ldr      x12, [sp, #0x258] */ ARM64("ldr x12, [sp, #0x258]");
    /* 0x00b6a37c: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b6a380: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b6a384: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b6a388: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b6a38c: eor      x9, x11, x9 */ ARM64("eor x9, x11, x9");
    /* 0x00b6a390: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00b6a394: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00b6a398: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00b6a39c: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00b6a3a0: eor      x10, x12, x10 */ ARM64("eor x10, x12, x10");
    /* 0x00b6a3a4: add      x13, x10, x9 */ ARM64("add x13, x10, x9");
    /* 0x00b6a3a8: eor      x9, x13, x10, ror #51 */ ARM64("eor x9, x13, x10, ror #51");
    /* 0x00b6a3ac: ldr      w10, [sp, #0x260] */ ARM64("ldr w10, [sp, #0x260]");
    /* 0x00b6a3b0: mov      x14, #0x7261 */ ARM64("mov x14, #0x7261");
    /* 0x00b6a3b4: movk     x14, #0x6e65, lsl #16 */ ARM64("movk x14, #0x6e65, lsl #16");
    /* 0x00b6a3b8: movk     x14, #0x6765, lsl #32 */ ARM64("movk x14, #0x6765, lsl #32");
    /* 0x00b6a3bc: movk     x14, #0x6c79, lsl #48 */ ARM64("movk x14, #0x6c79, lsl #48");
    /* 0x00b6a3c0: eor      x11, x11, x14 */ ARM64("eor x11, x11, x14");
    /* 0x00b6a3c4: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00b6a3c8: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00b6a3cc: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00b6a3d0: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00b6a3d4: eor      x12, x12, x14 */ ARM64("eor x12, x12, x14");
    /* 0x00b6a3d8: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b6a3dc: ror      x14, x9, #0x2f */ ARM64("ror x14, x9, #0x2f");
    /* 0x00b6a3e0: mov      w16, #1 */ ARM64("mov w16, #1");
    /* 0x00b6a3e4: mov      x15, x24 */ ARM64("mov x15, x24");
    /* 0x00b6a3e8: b        #0xb6a46c */ goto loc_00b6a46c;
loc_00b6a3ec:
    /* 0x00b6a3ec: and      x0, x0, x21 */ ARM64("and x0, x0, x21");
    /* 0x00b6a3f0: ldr      d1, [x28, x0] */ ARM64("ldr d1, [x28, x0]");
    /* 0x00b6a3f4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6a3f8: fmov     x1, d2 */ ARM64("fmov x1, d2");
    /* 0x00b6a3fc: ands     x1, x1, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x1, x1, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6a400: b.eq     #0xb6a430 */ if (COND_EQ) goto loc_00b6a430;
loc_00b6a404:
    /* 0x00b6a404: rbit     x2, x1 */ ARM64("rbit x2, x1");
    /* 0x00b6a408: clz      x2, x2 */ ARM64("clz x2, x2");
    /* 0x00b6a40c: add      x2, x0, x2, lsr #3 */ ARM64("add x2, x0, x2, lsr #3");
    /* 0x00b6a410: and      x2, x2, x21 */ ARM64("and x2, x2, x21");
    /* 0x00b6a414: sub      x2, x28, x2, lsl #3 */ ARM64("sub x2, x28, x2, lsl #3");
    /* 0x00b6a418: ldur     w3, [x2, #-8] */ ARM64("ldur w3, [x2, #-8]");
    /* 0x00b6a41c: cmp      w15, w3 */ ARM64("cmp w15, w3");
    /* 0x00b6a420: b.eq     #0xb6a450 */ if (COND_EQ) goto loc_00b6a450;
    /* 0x00b6a424: sub      x2, x1, #1 */ ARM64("sub x2, x1, #1");
    /* 0x00b6a428: ands     x1, x2, x1 */ ARM64("ands x1, x2, x1");
    /* 0x00b6a42c: b.ne     #0xb6a404 */ if (COND_NE) goto loc_00b6a404;
loc_00b6a430:
    /* 0x00b6a430: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b6a434: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b6a438: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b6a43c: fmov     w1, s1 */ ARM64("fmov w1, s1");
    /* 0x00b6a440: tbnz     w1, #0, #0xb6a534 */ if (((w1 >> #0) & 1) != 0) goto loc_00b6a534;
    /* 0x00b6a444: add      x17, x17, #8 */ ARM64("add x17, x17, #8");
    /* 0x00b6a448: add      x0, x0, x17 */ ARM64("add x0, x0, x17");
    /* 0x00b6a44c: b        #0xb6a3ec */ goto loc_00b6a3ec;
loc_00b6a450:
    /* 0x00b6a450: ldur     w0, [x2, #-4] */ ARM64("ldur w0, [x2, #-4]");
    /* 0x00b6a454: mov      w17, #1 */ ARM64("mov w17, #1");
    /* 0x00b6a458: tbz      w16, #0, #0xb6a53c */ if (((w16 >> #0) & 1) == 0) goto loc_00b6a53c;
loc_00b6a45c:
    /* 0x00b6a45c: mov      x16, x17 */ ARM64("mov x16, x17");
    /* 0x00b6a460: cmp      w15, w25 */ ARM64("cmp w15, w25");
    /* 0x00b6a464: mov      x15, x0 */ ARM64("mov x15, x0");
    /* 0x00b6a468: b.eq     #0xb6a70c */ if (COND_EQ) goto loc_00b6a70c;
loc_00b6a46c:
    /* 0x00b6a46c: tbz      w16, #0, #0xb6a53c */ if (((w16 >> #0) & 1) == 0) goto loc_00b6a53c;
    /* 0x00b6a470: mov      w17, #0 */ ARM64("mov w17, #0");
    /* 0x00b6a474: cmp      w15, w10 */ ARM64("cmp w15, w10");
    /* 0x00b6a478: b.eq     #0xb6a45c */ if (COND_EQ) goto loc_00b6a45c;
    /* 0x00b6a47c: cbz      x8, #0xb6a45c */ if (x8 == 0) goto loc_00b6a45c;
    /* 0x00b6a480: mov      x17, #0 */ ARM64("mov x17, #0");
    /* 0x00b6a484: mov      w0, w15 */ ARM64("mov w0, w15");
    /* 0x00b6a488: orr      x0, x0, #0x400000000000000 */ ARM64("orr x0, x0, #0x400000000000000");
    /* 0x00b6a48c: eor      x1, x0, x12 */ ARM64("eor x1, x0, x12");
    /* 0x00b6a490: add      x2, x1, x11 */ ARM64("add x2, x1, x11");
    /* 0x00b6a494: eor      x1, x2, x1, ror #48 */ ARM64("eor x1, x2, x1, ror #48");
    /* 0x00b6a498: add      x2, x2, x9 */ ARM64("add x2, x2, x9");
    /* 0x00b6a49c: add      x3, x1, x13 */ ARM64("add x3, x1, x13");
    /* 0x00b6a4a0: eor      x1, x3, x1, ror #43 */ ARM64("eor x1, x3, x1, ror #43");
    /* 0x00b6a4a4: eor      x0, x3, x0 */ ARM64("eor x0, x3, x0");
    /* 0x00b6a4a8: eor      x3, x2, x14 */ ARM64("eor x3, x2, x14");
    /* 0x00b6a4ac: ror      x2, x2, #0x20 */ ARM64("ror x2, x2, #0x20");
    /* 0x00b6a4b0: eor      x2, x2, #0xff */ ARM64("eor x2, x2, #0xff");
    /* 0x00b6a4b4: add      x0, x0, x3 */ ARM64("add x0, x0, x3");
    /* 0x00b6a4b8: add      x2, x1, x2 */ ARM64("add x2, x1, x2");
    /* 0x00b6a4bc: eor      x3, x0, x3, ror #51 */ ARM64("eor x3, x0, x3, ror #51");
    /* 0x00b6a4c0: eor      x1, x2, x1, ror #48 */ ARM64("eor x1, x2, x1, ror #48");
    /* 0x00b6a4c4: ror      x0, x0, #0x20 */ ARM64("ror x0, x0, #0x20");
    /* 0x00b6a4c8: add      x2, x3, x2 */ ARM64("add x2, x3, x2");
    /* 0x00b6a4cc: add      x0, x1, x0 */ ARM64("add x0, x1, x0");
    /* 0x00b6a4d0: eor      x3, x2, x3, ror #47 */ ARM64("eor x3, x2, x3, ror #47");
    /* 0x00b6a4d4: eor      x1, x0, x1, ror #43 */ ARM64("eor x1, x0, x1, ror #43");
    /* 0x00b6a4d8: ror      x2, x2, #0x20 */ ARM64("ror x2, x2, #0x20");
    /* 0x00b6a4dc: add      x0, x3, x0 */ ARM64("add x0, x3, x0");
    /* 0x00b6a4e0: add      x2, x1, x2 */ ARM64("add x2, x1, x2");
    /* 0x00b6a4e4: eor      x3, x0, x3, ror #51 */ ARM64("eor x3, x0, x3, ror #51");
    /* 0x00b6a4e8: eor      x1, x2, x1, ror #48 */ ARM64("eor x1, x2, x1, ror #48");
    /* 0x00b6a4ec: ror      x0, x0, #0x20 */ ARM64("ror x0, x0, #0x20");
    /* 0x00b6a4f0: add      x2, x3, x2 */ ARM64("add x2, x3, x2");
    /* 0x00b6a4f4: add      x0, x1, x0 */ ARM64("add x0, x1, x0");
    /* 0x00b6a4f8: eor      x3, x2, x3, ror #47 */ ARM64("eor x3, x2, x3, ror #47");
    /* 0x00b6a4fc: eor      x1, x0, x1, ror #43 */ ARM64("eor x1, x0, x1, ror #43");
    /* 0x00b6a500: ror      x2, x2, #0x20 */ ARM64("ror x2, x2, #0x20");
    /* 0x00b6a504: add      x0, x3, x0 */ ARM64("add x0, x3, x0");
    /* 0x00b6a508: add      x2, x1, x2 */ ARM64("add x2, x1, x2");
    /* 0x00b6a50c: eor      x0, x0, x3, ror #51 */ ARM64("eor x0, x0, x3, ror #51");
    /* 0x00b6a510: eor      x1, x2, x1, ror #48 */ ARM64("eor x1, x2, x1, ror #48");
    /* 0x00b6a514: add      x2, x0, x2 */ ARM64("add x2, x0, x2");
    /* 0x00b6a518: ror      x1, x1, #0x2b */ ARM64("ror x1, x1, #0x2b");
    /* 0x00b6a51c: eor      x0, x1, x0, ror #47 */ ARM64("eor x0, x1, x0, ror #47");
    /* 0x00b6a520: eor      x0, x0, x2, ror #32 */ ARM64("eor x0, x0, x2, ror #32");
    /* 0x00b6a524: eor      x0, x0, x2 */ ARM64("eor x0, x0, x2");
    /* 0x00b6a528: lsr      x1, x0, #0x39 */ ARM64("lsr x1, x0, #0x39");
    /* 0x00b6a52c: dup      v0.8b, w1 */ ARM64("dup v0.8b, w1");
    /* 0x00b6a530: b        #0xb6a3ec */ goto loc_00b6a3ec;
loc_00b6a534:
    /* 0x00b6a534: mov      w17, #0 */ ARM64("mov w17, #0");
    /* 0x00b6a538: tbnz     w16, #0, #0xb6a45c */ if (((w16 >> #0) & 1) != 0) goto loc_00b6a45c;
loc_00b6a53c:
    /* 0x00b6a53c: mov      w15, #1 */ ARM64("mov w15, #1");
    /* 0x00b6a540: b        #0xb6a5bc */ goto loc_00b6a5bc;
loc_00b6a544:
    /* 0x00b6a544: and      x16, x16, x21 */ ARM64("and x16, x16, x21");
    /* 0x00b6a548: ldr      d1, [x28, x16] */ ARM64("ldr d1, [x28, x16]");
    /* 0x00b6a54c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6a550: fmov     x17, d2 */ ARM64("fmov x17, d2");
    /* 0x00b6a554: ands     x17, x17, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x17, x17, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6a558: b.eq     #0xb6a588 */ if (COND_EQ) goto loc_00b6a588;
loc_00b6a55c:
    /* 0x00b6a55c: rbit     x0, x17 */ ARM64("rbit x0, x17");
    /* 0x00b6a560: clz      x0, x0 */ ARM64("clz x0, x0");
    /* 0x00b6a564: add      x0, x16, x0, lsr #3 */ ARM64("add x0, x16, x0, lsr #3");
    /* 0x00b6a568: and      x0, x0, x21 */ ARM64("and x0, x0, x21");
    /* 0x00b6a56c: sub      x0, x28, x0, lsl #3 */ ARM64("sub x0, x28, x0, lsl #3");
    /* 0x00b6a570: ldur     w1, [x0, #-8] */ ARM64("ldur w1, [x0, #-8]");
    /* 0x00b6a574: cmp      w25, w1 */ ARM64("cmp w25, w1");
    /* 0x00b6a578: b.eq     #0xb6a5a8 */ if (COND_EQ) goto loc_00b6a5a8;
    /* 0x00b6a57c: sub      x0, x17, #1 */ ARM64("sub x0, x17, #1");
    /* 0x00b6a580: ands     x17, x0, x17 */ ARM64("ands x17, x0, x17");
    /* 0x00b6a584: b.ne     #0xb6a55c */ if (COND_NE) goto loc_00b6a55c;
loc_00b6a588:
    /* 0x00b6a588: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b6a58c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b6a590: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b6a594: fmov     w17, s1 */ ARM64("fmov w17, s1");
    /* 0x00b6a598: tbnz     w17, #0, #0xb6a684 */ if (((w17 >> #0) & 1) != 0) goto loc_00b6a684;
    /* 0x00b6a59c: add      x15, x15, #8 */ ARM64("add x15, x15, #8");
    /* 0x00b6a5a0: add      x16, x16, x15 */ ARM64("add x16, x16, x15");
    /* 0x00b6a5a4: b        #0xb6a544 */ goto loc_00b6a544;
loc_00b6a5a8:
    /* 0x00b6a5a8: ldur     w16, [x0, #-4] */ ARM64("ldur w16, [x0, #-4]");
    /* 0x00b6a5ac: mov      w15, #1 */ ARM64("mov w15, #1");
loc_00b6a5b0:
    /* 0x00b6a5b0: cmp      w25, w24 */ ARM64("cmp w25, w24");
    /* 0x00b6a5b4: mov      x25, x16 */ ARM64("mov x25, x16");
    /* 0x00b6a5b8: b.eq     #0xb6a70c */ if (COND_EQ) goto loc_00b6a70c;
loc_00b6a5bc:
    /* 0x00b6a5bc: tbz      w15, #0, #0xb6a68c */ if (((w15 >> #0) & 1) == 0) goto loc_00b6a68c;
    /* 0x00b6a5c0: mov      w15, #0 */ ARM64("mov w15, #0");
    /* 0x00b6a5c4: cmp      w25, w10 */ ARM64("cmp w25, w10");
    /* 0x00b6a5c8: b.eq     #0xb6a5b0 */ if (COND_EQ) goto loc_00b6a5b0;
    /* 0x00b6a5cc: cbz      x8, #0xb6a5b0 */ if (x8 == 0) goto loc_00b6a5b0;
    /* 0x00b6a5d0: mov      x15, #0 */ ARM64("mov x15, #0");
    /* 0x00b6a5d4: mov      w16, w25 */ ARM64("mov w16, w25");
    /* 0x00b6a5d8: orr      x16, x16, #0x400000000000000 */ ARM64("orr x16, x16, #0x400000000000000");
    /* 0x00b6a5dc: eor      x17, x16, x12 */ ARM64("eor x17, x16, x12");
    /* 0x00b6a5e0: add      x0, x17, x11 */ ARM64("add x0, x17, x11");
    /* 0x00b6a5e4: eor      x17, x0, x17, ror #48 */ ARM64("eor x17, x0, x17, ror #48");
    /* 0x00b6a5e8: add      x0, x0, x9 */ ARM64("add x0, x0, x9");
    /* 0x00b6a5ec: add      x1, x17, x13 */ ARM64("add x1, x17, x13");
    /* 0x00b6a5f0: eor      x17, x1, x17, ror #43 */ ARM64("eor x17, x1, x17, ror #43");
    /* 0x00b6a5f4: eor      x16, x1, x16 */ ARM64("eor x16, x1, x16");
    /* 0x00b6a5f8: eor      x1, x0, x14 */ ARM64("eor x1, x0, x14");
    /* 0x00b6a5fc: ror      x0, x0, #0x20 */ ARM64("ror x0, x0, #0x20");
    /* 0x00b6a600: eor      x0, x0, #0xff */ ARM64("eor x0, x0, #0xff");
    /* 0x00b6a604: add      x16, x16, x1 */ ARM64("add x16, x16, x1");
    /* 0x00b6a608: add      x0, x17, x0 */ ARM64("add x0, x17, x0");
    /* 0x00b6a60c: eor      x1, x16, x1, ror #51 */ ARM64("eor x1, x16, x1, ror #51");
    /* 0x00b6a610: eor      x17, x0, x17, ror #48 */ ARM64("eor x17, x0, x17, ror #48");
    /* 0x00b6a614: ror      x16, x16, #0x20 */ ARM64("ror x16, x16, #0x20");
    /* 0x00b6a618: add      x0, x1, x0 */ ARM64("add x0, x1, x0");
    /* 0x00b6a61c: add      x16, x17, x16 */ ARM64("add x16, x17, x16");
    /* 0x00b6a620: eor      x1, x0, x1, ror #47 */ ARM64("eor x1, x0, x1, ror #47");
    /* 0x00b6a624: eor      x17, x16, x17, ror #43 */ ARM64("eor x17, x16, x17, ror #43");
    /* 0x00b6a628: ror      x0, x0, #0x20 */ ARM64("ror x0, x0, #0x20");
    /* 0x00b6a62c: add      x16, x1, x16 */ ARM64("add x16, x1, x16");
    /* 0x00b6a630: add      x0, x17, x0 */ ARM64("add x0, x17, x0");
    /* 0x00b6a634: eor      x1, x16, x1, ror #51 */ ARM64("eor x1, x16, x1, ror #51");
    /* 0x00b6a638: eor      x17, x0, x17, ror #48 */ ARM64("eor x17, x0, x17, ror #48");
    /* 0x00b6a63c: ror      x16, x16, #0x20 */ ARM64("ror x16, x16, #0x20");
    /* 0x00b6a640: add      x0, x1, x0 */ ARM64("add x0, x1, x0");
    /* 0x00b6a644: add      x16, x17, x16 */ ARM64("add x16, x17, x16");
    /* 0x00b6a648: eor      x1, x0, x1, ror #47 */ ARM64("eor x1, x0, x1, ror #47");
    /* 0x00b6a64c: eor      x17, x16, x17, ror #43 */ ARM64("eor x17, x16, x17, ror #43");
    /* 0x00b6a650: ror      x0, x0, #0x20 */ ARM64("ror x0, x0, #0x20");
    /* 0x00b6a654: add      x16, x1, x16 */ ARM64("add x16, x1, x16");
    /* 0x00b6a658: add      x0, x17, x0 */ ARM64("add x0, x17, x0");
    /* 0x00b6a65c: eor      x16, x16, x1, ror #51 */ ARM64("eor x16, x16, x1, ror #51");
    /* 0x00b6a660: eor      x17, x0, x17, ror #48 */ ARM64("eor x17, x0, x17, ror #48");
    /* 0x00b6a664: add      x0, x16, x0 */ ARM64("add x0, x16, x0");
    /* 0x00b6a668: ror      x17, x17, #0x2b */ ARM64("ror x17, x17, #0x2b");
    /* 0x00b6a66c: eor      x16, x17, x16, ror #47 */ ARM64("eor x16, x17, x16, ror #47");
    /* 0x00b6a670: eor      x16, x16, x0, ror #32 */ ARM64("eor x16, x16, x0, ror #32");
    /* 0x00b6a674: eor      x16, x16, x0 */ ARM64("eor x16, x16, x0");
    /* 0x00b6a678: lsr      x17, x16, #0x39 */ ARM64("lsr x17, x16, #0x39");
    /* 0x00b6a67c: dup      v0.8b, w17 */ ARM64("dup v0.8b, w17");
    /* 0x00b6a680: b        #0xb6a544 */ goto loc_00b6a544;
loc_00b6a684:
    /* 0x00b6a684: mov      w15, #0 */ ARM64("mov w15, #0");
    /* 0x00b6a688: b        #0xb6a5b0 */ goto loc_00b6a5b0;
loc_00b6a68c:
    /* 0x00b6a68c: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a690: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b6a694: bl       #0xc15a4c */ CALL_DIRECT(sub_00c15a4c);
    /* 0x00b6a698: ldr      x8, [sp, #0x648] */ ARM64("ldr x8, [sp, #0x648]");
    /* 0x00b6a69c: cbz      x8, #0xb6a6e0 */ if (x8 == 0) goto loc_00b6a6e0;
    /* 0x00b6a6a0: ldr      x22, [sp, #0x638] */ ARM64("ldr x22, [sp, #0x638]");
    /* 0x00b6a6a4: cbz      x22, #0xb6a6d4 */ if (x22 == 0) goto loc_00b6a6d4;
    /* 0x00b6a6a8: ldr      x0, [sp, #0x630] */ ARM64("ldr x0, [sp, #0x630]");
    /* 0x00b6a6ac: add      x2, x22, #9 */ ARM64("add x2, x22, #9");
    /* 0x00b6a6b0: mov      w1, #0xff */ ARM64("mov w1, #0xff");
    /* 0x00b6a6b4: bl       #0xc7ad84 */ CALL_DIRECT(sub_00c7ad84);
    /* 0x00b6a6b8: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00b6a6bc: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00b6a6c0: lsl      x9, x8, #3 */ ARM64("lsl x9, x8, #3");
    /* 0x00b6a6c4: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6a6c8: cmp      x22, #8 */ ARM64("cmp x22, #8");
    /* 0x00b6a6cc: csel     x8, x22, x8, lo */ ARM64("csel x8, x22, x8, lo");
    /* 0x00b6a6d0: b        #0xb6a6d8 */ goto loc_00b6a6d8;
loc_00b6a6d4:
    /* 0x00b6a6d4: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b6a6d8:
    /* 0x00b6a6d8: str      xzr, [sp, #0x648] */ ARM64("str xzr, [sp, #0x648]");
    /* 0x00b6a6dc: str      x8, [sp, #0x640] */ ARM64("str x8, [sp, #0x640]");
loc_00b6a6e0:
    /* 0x00b6a6e0: ldr      w8, [sp, #0x618] */ ARM64("ldr w8, [sp, #0x618]");
    /* 0x00b6a6e4: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b6a6e8: b.ne     #0xb6b888 */ if (COND_NE) goto loc_00b6b888;
    /* 0x00b6a6ec: ldr      w1, [sp, #0x61c] */ ARM64("ldr w1, [sp, #0x61c]");
    /* 0x00b6a6f0: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6a6f4: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00b6a6f8: add      x2, x8, #0x90 */ ARM64("add x2, x8, #0x90");
    /* 0x00b6a6fc: bl       #0xc2b800 */ CALL_DIRECT(sub_00c2b800);
    /* 0x00b6a700: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a704: bl       #0xc15184 */ CALL_DIRECT(sub_00c15184);
    /* 0x00b6a708: tbnz     w0, #0, #0xb6a7f8 */ if (((w0 >> #0) & 1) != 0) goto loc_00b6a7f8;
loc_00b6a70c:
    /* 0x00b6a70c: cbz      x21, #0xb6a2e4 */ if (x21 == 0) goto loc_00b6a2e4;
    /* 0x00b6a710: lsl      x8, x21, #3 */ ARM64("lsl x8, x21, #3");
    /* 0x00b6a714: add      x9, x8, x21 */ ARM64("add x9, x8, x21");
    /* 0x00b6a718: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6a71c: b.eq     #0xb6a2e4 */ if (COND_EQ) goto loc_00b6a2e4;
    /* 0x00b6a720: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00b6a724: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6a728: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6a72c: b        #0xb6a2e4 */ goto loc_00b6a2e4;
loc_00b6a730:
    /* 0x00b6a730: ldr      x20, [sp, #0x180] */ ARM64("ldr x20, [sp, #0x180]");
    /* 0x00b6a734: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6a738: b        #0xb6a744 */ goto loc_00b6a744;
loc_00b6a73c:
    /* 0x00b6a73c: subs     x27, x27, #4 */ ARM64("subs x27, x27, #4");
    /* 0x00b6a740: b.eq     #0xb6a83c */ if (COND_EQ) goto loc_00b6a83c;
loc_00b6a744:
    /* 0x00b6a744: ldr      w1, [x20], #4 */ ARM64("ldr w1, [x20], #4");
    /* 0x00b6a748: ldr      x8, [sp, #0x5e0] */ ARM64("ldr x8, [sp, #0x5e0]");
    /* 0x00b6a74c: cmp      x8, x1 */ ARM64("cmp x8, x1");
    /* 0x00b6a750: b.ls     #0xb6a73c */ if (COND_LS) goto loc_00b6a73c;
    /* 0x00b6a754: ldr      x8, [sp, #0x5d8] */ ARM64("ldr x8, [sp, #0x5d8]");
    /* 0x00b6a758: umull    x9, w1, w24 */ ARM64("umull x9, w1, w24");
    /* 0x00b6a75c: ldr      x8, [x8, x9] */ ARM64("ldr x8, [x8, x9]");
    /* 0x00b6a760: cmp      x8, x25 */ ARM64("cmp x8, x25");
    /* 0x00b6a764: b.eq     #0xb6a73c */ if (COND_EQ) goto loc_00b6a73c;
    /* 0x00b6a768: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a76c: bl       #0xc15a4c */ CALL_DIRECT(sub_00c15a4c);
    /* 0x00b6a770: ldr      x8, [sp, #0x648] */ ARM64("ldr x8, [sp, #0x648]");
    /* 0x00b6a774: cbz      x8, #0xb6a7b8 */ if (x8 == 0) goto loc_00b6a7b8;
    /* 0x00b6a778: ldr      x21, [sp, #0x638] */ ARM64("ldr x21, [sp, #0x638]");
    /* 0x00b6a77c: cbz      x21, #0xb6a7ac */ if (x21 == 0) goto loc_00b6a7ac;
    /* 0x00b6a780: ldr      x0, [sp, #0x630] */ ARM64("ldr x0, [sp, #0x630]");
    /* 0x00b6a784: add      x2, x21, #9 */ ARM64("add x2, x21, #9");
    /* 0x00b6a788: mov      w1, #0xff */ ARM64("mov w1, #0xff");
    /* 0x00b6a78c: bl       #0xc7ad84 */ CALL_DIRECT(sub_00c7ad84);
    /* 0x00b6a790: add      x8, x21, #1 */ ARM64("add x8, x21, #1");
    /* 0x00b6a794: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00b6a798: lsl      x9, x8, #3 */ ARM64("lsl x9, x8, #3");
    /* 0x00b6a79c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6a7a0: cmp      x21, #8 */ ARM64("cmp x21, #8");
    /* 0x00b6a7a4: csel     x8, x21, x8, lo */ ARM64("csel x8, x21, x8, lo");
    /* 0x00b6a7a8: b        #0xb6a7b0 */ goto loc_00b6a7b0;
loc_00b6a7ac:
    /* 0x00b6a7ac: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b6a7b0:
    /* 0x00b6a7b0: str      xzr, [sp, #0x648] */ ARM64("str xzr, [sp, #0x648]");
    /* 0x00b6a7b4: str      x8, [sp, #0x640] */ ARM64("str x8, [sp, #0x640]");
loc_00b6a7b8:
    /* 0x00b6a7b8: ldr      w8, [sp, #0x618] */ ARM64("ldr w8, [sp, #0x618]");
    /* 0x00b6a7bc: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b6a7c0: b.ne     #0xb6b72c */ if (COND_NE) goto loc_00b6b72c;
    /* 0x00b6a7c4: ldr      w1, [sp, #0x61c] */ ARM64("ldr w1, [sp, #0x61c]");
    /* 0x00b6a7c8: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6a7cc: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00b6a7d0: add      x2, x8, #0x90 */ ARM64("add x2, x8, #0x90");
    /* 0x00b6a7d4: bl       #0xc2b800 */ CALL_DIRECT(sub_00c2b800);
    /* 0x00b6a7d8: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a7dc: bl       #0xc15184 */ CALL_DIRECT(sub_00c15184);
    /* 0x00b6a7e0: tbz      w0, #0, #0xb6a73c */ if (((w0 >> #0) & 1) == 0) goto loc_00b6a73c;
    /* 0x00b6a7e4: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6a7e8: cbz      x8, #0xb6a200 */ if (x8 == 0) goto loc_00b6a200;
loc_00b6a7ec:
    /* 0x00b6a7ec: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6a7f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6a7f4: b        #0xb6a200 */ goto loc_00b6a200;
loc_00b6a7f8:
    /* 0x00b6a7f8: cbz      x21, #0xb6a818 */ if (x21 == 0) goto loc_00b6a818;
    /* 0x00b6a7fc: lsl      x8, x21, #3 */ ARM64("lsl x8, x21, #3");
    /* 0x00b6a800: add      x9, x8, x21 */ ARM64("add x9, x8, x21");
    /* 0x00b6a804: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6a808: b.eq     #0xb6a818 */ if (COND_EQ) goto loc_00b6a818;
    /* 0x00b6a80c: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00b6a810: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6a814: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6a818:
    /* 0x00b6a818: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6a81c: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6a820: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6a824: mov      x25, #-0x8000000000000000 */ ARM64("mov x25, #-0x8000000000000000");
    /* 0x00b6a828: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6a82c: cbnz     x8, #0xb6a7ec */ if (x8 != 0) goto loc_00b6a7ec;
    /* 0x00b6a830: b        #0xb6a200 */ goto loc_00b6a200;
loc_00b6a834:
    /* 0x00b6a834: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6a838: b        #0xb6a84c */ goto loc_00b6a84c;
loc_00b6a83c:
    /* 0x00b6a83c: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6a840: cbz      x8, #0xb6a84c */ if (x8 == 0) goto loc_00b6a84c;
    /* 0x00b6a844: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6a848: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6a84c:
    /* 0x00b6a84c: ldr      x8, [sp, #0x5e8] */ ARM64("ldr x8, [sp, #0x5e8]");
    /* 0x00b6a850: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b6a854: b.ne     #0xb6aac4 */ if (COND_NE) goto loc_00b6aac4;
loc_00b6a858:
    /* 0x00b6a858: ldr      w8, [sp, #0x618] */ ARM64("ldr w8, [sp, #0x618]");
    /* 0x00b6a85c: tbz      w8, #0, #0xb6b8dc */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b8dc;
    /* 0x00b6a860: ldr      w2, [sp, #0x61c] */ ARM64("ldr w2, [sp, #0x61c]");
    /* 0x00b6a864: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6a868: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b6a86c: bl       #0xbd8578 */ CALL_DIRECT(sub_00bd8578);
    /* 0x00b6a870: ldr      x20, [sp, #0x230] */ ARM64("ldr x20, [sp, #0x230]");
    /* 0x00b6a874: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00b6a878: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00b6a87c: b.eq     #0xb6b8e8 */ if (COND_EQ) goto loc_00b6b8e8;
    /* 0x00b6a880: ldr      x22, [sp, #0x238] */ ARM64("ldr x22, [sp, #0x238]");
    /* 0x00b6a884: ldr      x25, [sp, #0x240] */ ARM64("ldr x25, [sp, #0x240]");
    /* 0x00b6a888: cbz      x25, #0xb6a8ac */ if (x25 == 0) goto loc_00b6a8ac;
    /* 0x00b6a88c: sub      x9, x25, #1 */ ARM64("sub x9, x25, #1");
    /* 0x00b6a890: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00b6a894: madd     x8, x9, x8, x22 */ ARM64("madd x8, x9, x8, x22");
    /* 0x00b6a898: ldr      x10, [x8, #0x18] */ ARM64("ldr x10, [x8, #0x18]");
    /* 0x00b6a89c: cmp      x10, #0x1b */ ARM64("cmp x10, #0x1b");
    /* 0x00b6a8a0: b.ne     #0xb6a8ac */ if (COND_NE) goto loc_00b6a8ac;
    /* 0x00b6a8a4: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00b6a8a8: cbz      x8, #0xb6b420 */ if (x8 == 0) goto loc_00b6b420;
loc_00b6a8ac:
    /* 0x00b6a8ac: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a8b0: bl       #0xc14ff4 */ CALL_DIRECT(sub_00c14ff4);
    /* 0x00b6a8b4: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b6a8b8: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6a8bc: strb     wzr, [sp, #0x238] */ ARM64("strb wzr, [sp, #0x238]");
    /* 0x00b6a8c0: str      x20, [sp, #0x240] */ ARM64("str x20, [sp, #0x240]");
    /* 0x00b6a8c4: str      x22, [sp, #0x248] */ ARM64("str x22, [sp, #0x248]");
    /* 0x00b6a8c8: str      x25, [sp, #0x250] */ ARM64("str x25, [sp, #0x250]");
    /* 0x00b6a8cc: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00b6a8d0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b6a8d4: cbz      x0, #0xb6b8bc */ if (x0 == 0) goto loc_00b6b8bc;
    /* 0x00b6a8d8: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b6a8dc: ldp      q0, q1, [x26, #0x20] */ ARM64("ldp q0, q1, [x26, #0x20]");
    /* 0x00b6a8e0: stp      q0, q1, [x0] */ ARM64("stp q0, q1, [x0]");
    /* 0x00b6a8e4: ldr      x8, [sp, #0x250] */ ARM64("ldr x8, [sp, #0x250]");
    /* 0x00b6a8e8: str      x8, [x0, #0x20] */ ARM64("str x8, [x0, #0x20]");
    /* 0x00b6a8ec: str      x0, [sp, #0x550] */ ARM64("str x0, [sp, #0x550]");
    /* 0x00b6a8f0: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b6a8f4: str      xzr, [sp, #0x5a0] */ ARM64("str xzr, [sp, #0x5a0]");
    /* 0x00b6a8f8: str      x8, [sp, #0x5a8] */ ARM64("str x8, [sp, #0x5a8]");
    /* 0x00b6a8fc: str      xzr, [sp, #0x5b8] */ ARM64("str xzr, [sp, #0x5b8]");
    /* 0x00b6a900: str      xzr, [sp, #0x5b0] */ ARM64("str xzr, [sp, #0x5b0]");
    /* 0x00b6a904: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b6a908: str      x8, [sp, #0x5c0] */ ARM64("str x8, [sp, #0x5c0]");
    /* 0x00b6a90c: str      xzr, [sp, #0x5c8] */ ARM64("str xzr, [sp, #0x5c8]");
    /* 0x00b6a910: ldrb     w8, [x23, #0x10] */ ARM64("ldrb w8, [x23, #0x10]");
    /* 0x00b6a914: tbz      w8, #0, #0xb6b8cc */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b8cc;
loc_00b6a918:
    /* 0x00b6a918: str      xzr, [sp, #0x288] */ ARM64("str xzr, [sp, #0x288]");
    /* 0x00b6a91c: str      xzr, [sp, #0x280] */ ARM64("str xzr, [sp, #0x280]");
    /* 0x00b6a920: str      xzr, [sp, #0x290] */ ARM64("str xzr, [sp, #0x290]");
    /* 0x00b6a924: ldp      q3, q2, [sp, #0x130] */ ARM64("ldp q3, q2, [sp, #0x130]");
    /* 0x00b6a928: stur     q2, [x26, #0x98] */ ARM64("stur q2, [x26, #0x98]");
    /* 0x00b6a92c: stur     q3, [x26, #0xa8] */ ARM64("stur q3, [x26, #0xa8]");
    /* 0x00b6a930: ldp      q0, q1, [x28, #0x50] */ ARM64("ldp q0, q1, [x28, #0x50]");
    /* 0x00b6a934: stp      q0, q1, [x26, #0x20] */ ARM64("stp q0, q1, [x26, #0x20]");
    /* 0x00b6a938: ldr      q0, [x28, #0x70] */ ARM64("ldr q0, [x28, #0x70]");
    /* 0x00b6a93c: str      q0, [x26, #0x40] */ ARM64("str q0, [x26, #0x40]");
    /* 0x00b6a940: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b6a944: str      xzr, [sp, #0x260] */ ARM64("str xzr, [sp, #0x260]");
    /* 0x00b6a948: str      x8, [sp, #0x268] */ ARM64("str x8, [sp, #0x268]");
    /* 0x00b6a94c: str      xzr, [sp, #0x270] */ ARM64("str xzr, [sp, #0x270]");
    /* 0x00b6a950: adrp     x8, #0xe0e000 */ ARM64("adrp x8, #0xe0e000");
    /* 0x00b6a954: add      x8, x8, #0xd10 */ ARM64("add x8, x8, #0xd10");
    /* 0x00b6a958: str      x8, [sp, #0x278] */ ARM64("str x8, [sp, #0x278]");
    /* 0x00b6a95c: ldr      q0, [x23] */ ARM64("ldr q0, [x23]");
    /* 0x00b6a960: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00b6a964: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b6a968: str      x8, [x23] */ ARM64("str x8, [x23]");
    /* 0x00b6a96c: stur     q0, [x26, #0x88] */ ARM64("stur q0, [x26, #0x88]");
    /* 0x00b6a970: stur     q3, [x26, #0xc8] */ ARM64("stur q3, [x26, #0xc8]");
    /* 0x00b6a974: stur     q2, [x26, #0xb8] */ ARM64("stur q2, [x26, #0xb8]");
loc_00b6a978:
    /* 0x00b6a978: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b6a97c: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b6a980: stxr     w10, x9, [x21] */ ARM64("stxr w10, x9, [x21]");
    /* 0x00b6a984: cbnz     w10, #0xb6a978 */ if (w10 != 0) goto loc_00b6a978;
    /* 0x00b6a988: tbnz     x8, #0x3f, #0xb6b800 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00b6b800;
    /* 0x00b6a98c: str      x21, [sp, #0x6a0] */ ARM64("str x21, [sp, #0x6a0]");
    /* 0x00b6a990: ldr      x8, [sp, #0xf8] */ ARM64("ldr x8, [sp, #0xf8]");
    /* 0x00b6a994: ldp      x23, x24, [x8, #8] */ ARM64("ldp x23, x24, [x8, #8]");
    /* 0x00b6a998: ldr      x20, [sp, #0x458] */ ARM64("ldr x20, [sp, #0x458]");
    /* 0x00b6a99c: ldr      x22, [sp, #0x460] */ ARM64("ldr x22, [sp, #0x460]");
    /* 0x00b6a9a0: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b6a9a4: stp      q1, q0, [x28, #0x50] */ ARM64("stp q1, q0, [x28, #0x50]");
    /* 0x00b6a9a8: adds     x1, x22, x24 */ ARM64("adds x1, x22, x24");
    /* 0x00b6a9ac: b.ne     #0xb6b898 */ if (COND_NE) goto loc_00b6b898;
loc_00b6a9b0:
    /* 0x00b6a9b0: cbz      x24, #0xb6a9e4 */ if (x24 == 0) goto loc_00b6a9e4;
    /* 0x00b6a9b4: mov      x25, #0 */ ARM64("mov x25, #0");
loc_00b6a9b8:
    /* 0x00b6a9b8: ldr      x1, [x23, x25, lsl #3] */ ARM64("ldr x1, [x23, x25, lsl #3]");
loc_00b6a9bc:
    /* 0x00b6a9bc: ldxr     x8, [x1] */ ARM64("ldxr x8, [x1]");
    /* 0x00b6a9c0: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b6a9c4: stxr     w10, x9, [x1] */ ARM64("stxr w10, x9, [x1]");
    /* 0x00b6a9c8: cbnz     w10, #0xb6a9bc */ if (w10 != 0) goto loc_00b6a9bc;
    /* 0x00b6a9cc: tbnz     x8, #0x3f, #0xb6b800 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00b6b800;
    /* 0x00b6a9d0: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6a9d4: bl       #0xc014cc */ CALL_DIRECT(sub_00c014cc);
    /* 0x00b6a9d8: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b6a9dc: cmp      x25, x24 */ ARM64("cmp x25, x24");
    /* 0x00b6a9e0: b.ne     #0xb6a9b8 */ if (COND_NE) goto loc_00b6a9b8;
loc_00b6a9e4:
    /* 0x00b6a9e4: cbz      x22, #0xb6aa18 */ if (x22 == 0) goto loc_00b6aa18;
    /* 0x00b6a9e8: mov      x23, #0 */ ARM64("mov x23, #0");
loc_00b6a9ec:
    /* 0x00b6a9ec: ldr      x1, [x20, x23, lsl #3] */ ARM64("ldr x1, [x20, x23, lsl #3]");
loc_00b6a9f0:
    /* 0x00b6a9f0: ldxr     x8, [x1] */ ARM64("ldxr x8, [x1]");
    /* 0x00b6a9f4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b6a9f8: stxr     w10, x9, [x1] */ ARM64("stxr w10, x9, [x1]");
    /* 0x00b6a9fc: cbnz     w10, #0xb6a9f0 */ if (w10 != 0) goto loc_00b6a9f0;
    /* 0x00b6aa00: tbnz     x8, #0x3f, #0xb6b800 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00b6b800;
    /* 0x00b6aa04: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6aa08: bl       #0xc014cc */ CALL_DIRECT(sub_00c014cc);
    /* 0x00b6aa0c: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00b6aa10: cmp      x23, x22 */ ARM64("cmp x23, x22");
    /* 0x00b6aa14: b.ne     #0xb6a9ec */ if (COND_NE) goto loc_00b6a9ec;
loc_00b6aa18:
    /* 0x00b6aa18: ldp      q0, q1, [x28, #0x50] */ ARM64("ldp q0, q1, [x28, #0x50]");
    /* 0x00b6aa1c: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b6aa20: stp      q0, q1, [x8] */ ARM64("stp q0, q1, [x8]");
    /* 0x00b6aa24: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6aa28: add      x2, sp, #0x470 */ ARM64("add x2, sp, #0x470");
    /* 0x00b6aa2c: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00b6aa30: bl       #0xb8ce50 */ CALL_DIRECT(sub_00b8ce50);
    /* 0x00b6aa34: ldr      x20, [sp, #0x478] */ ARM64("ldr x20, [sp, #0x478]");
    /* 0x00b6aa38: cbz      x20, #0xb6b1fc */ if (x20 == 0) goto loc_00b6b1fc;
    /* 0x00b6aa3c: ldr      x22, [sp, #0x488] */ ARM64("ldr x22, [sp, #0x488]");
    /* 0x00b6aa40: cbz      x22, #0xb6b1dc */ if (x22 == 0) goto loc_00b6b1dc;
    /* 0x00b6aa44: ldr      x23, [sp, #0x470] */ ARM64("ldr x23, [sp, #0x470]");
    /* 0x00b6aa48: mov      x24, x23 */ ARM64("mov x24, x23");
    /* 0x00b6aa4c: ldr      d0, [x24], #8 */ ARM64("ldr d0, [x24], #8");
    /* 0x00b6aa50: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6aa54: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6aa58: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00b6aa5c: b        #0xb6aa64 */ goto loc_00b6aa64;
loc_00b6aa60:
    /* 0x00b6aa60: cbz      x22, #0xb6b1dc */ if (x22 == 0) goto loc_00b6b1dc;
loc_00b6aa64:
    /* 0x00b6aa64: cbnz     x25, #0xb6aa80 */ if (x25 != 0) goto loc_00b6aa80;
loc_00b6aa68:
    /* 0x00b6aa68: ldr      d0, [x24], #8 */ ARM64("ldr d0, [x24], #8");
    /* 0x00b6aa6c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6aa70: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6aa74: sub      x23, x23, #0x40 */ ARM64("sub x23, x23, #0x40");
    /* 0x00b6aa78: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00b6aa7c: cbz      x25, #0xb6aa68 */ if (x25 == 0) goto loc_00b6aa68;
loc_00b6aa80:
    /* 0x00b6aa80: sub      x8, x25, #1 */ ARM64("sub x8, x25, #1");
    /* 0x00b6aa84: rbit     x9, x25 */ ARM64("rbit x9, x25");
    /* 0x00b6aa88: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b6aa8c: and      x25, x8, x25 */ ARM64("and x25, x8, x25");
    /* 0x00b6aa90: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00b6aa94: sub      x8, x23, x8 */ ARM64("sub x8, x23, x8");
    /* 0x00b6aa98: sub      x22, x22, #1 */ ARM64("sub x22, x22, #1");
    /* 0x00b6aa9c: ldur     x9, [x8, #-8] */ ARM64("ldur x9, [x8, #-8]");
loc_00b6aaa0:
    /* 0x00b6aaa0: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b6aaa4: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b6aaa8: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b6aaac: cbnz     w11, #0xb6aaa0 */ if (w11 != 0) goto loc_00b6aaa0;
    /* 0x00b6aab0: b.ne     #0xb6aa60 */ if (COND_NE) goto loc_00b6aa60;
    /* 0x00b6aab4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6aab8: ldur     x0, [x8, #-8] */ ARM64("ldur x0, [x8, #-8]");
    /* 0x00b6aabc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b6aac0: b        #0xb6aa60 */ goto loc_00b6aa60;
loc_00b6aac4:
    /* 0x00b6aac4: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b6aac8: stp      xzr, x8, [x29, #-0xc0] */ ARM64("stp xzr, x8, [x29, #-0xc0]");
    /* 0x00b6aacc: stur     xzr, [x29, #-0xb0] */ ARM64("stur xzr, [x29, #-0xb0]");
    /* 0x00b6aad0: ldr      w8, [sp, #0x618] */ ARM64("ldr w8, [sp, #0x618]");
    /* 0x00b6aad4: tbz      w8, #0, #0xb6b8f8 */ if (((w8 >> #0) & 1) == 0) goto loc_00b6b8f8;
    /* 0x00b6aad8: ldr      w20, [sp, #0x61c] */ ARM64("ldr w20, [sp, #0x61c]");
    /* 0x00b6aadc: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b6aae0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b6aae4: cbz      x0, #0xb6b908 */ if (x0 == 0) goto loc_00b6b908;
    /* 0x00b6aae8: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b6aaec: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00b6aaf0: mov      x22, #0xa95 */ ARM64("mov x22, #0xa95");
    /* 0x00b6aaf4: movk     x22, #0x2722, lsl #16 */ ARM64("movk x22, #0x2722, lsl #16");
    /* 0x00b6aaf8: movk     x22, #0xc1b7, lsl #32 */ ARM64("movk x22, #0xc1b7, lsl #32");
    /* 0x00b6aafc: movk     x22, #0x517c, lsl #48 */ ARM64("movk x22, #0x517c, lsl #48");
    /* 0x00b6ab00: str      w20, [x0] */ ARM64("str w20, [x0]");
    /* 0x00b6ab04: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00b6ab08: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00b6ab0c: stp      x20, x0, [x29, #-0xa8] */ ARM64("stp x20, x0, [x29, #-0xa8]");
    /* 0x00b6ab10: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b6ab14: stp      q1, q0, [x28, #0x150] */ ARM64("stp q1, q0, [x28, #0x150]");
loc_00b6ab18:
    /* 0x00b6ab18: sub      x20, x20, #1 */ ARM64("sub x20, x20, #1");
    /* 0x00b6ab1c: stur     x20, [x29, #-0x98] */ ARM64("stur x20, [x29, #-0x98]");
    /* 0x00b6ab20: ldr      w24, [x21, x20, lsl #2] */ ARM64("ldr w24, [x21, x20, lsl #2]");
    /* 0x00b6ab24: ldr      x8, [sp, #0x6b8] */ ARM64("ldr x8, [sp, #0x6b8]");
    /* 0x00b6ab28: cbz      x8, #0xb6abc0 */ if (x8 == 0) goto loc_00b6abc0;
    /* 0x00b6ab2c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b6ab30: mul      x11, x24, x22 */ ARM64("mul x11, x24, x22");
    /* 0x00b6ab34: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00b6ab38: ldr      x9, [sp, #0x6a8] */ ARM64("ldr x9, [sp, #0x6a8]");
    /* 0x00b6ab3c: ldr      x10, [sp, #0x6a0] */ ARM64("ldr x10, [sp, #0x6a0]");
    /* 0x00b6ab40: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00b6ab44: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00b6ab48: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b6ab4c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6ab50: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b6ab54: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6ab58: b.eq     #0xb6ab88 */ if (COND_EQ) goto loc_00b6ab88;
loc_00b6ab5c:
    /* 0x00b6ab5c: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b6ab60: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b6ab64: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b6ab68: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00b6ab6c: sub      x13, x10, x13, lsl #2 */ ARM64("sub x13, x10, x13, lsl #2");
    /* 0x00b6ab70: ldur     w13, [x13, #-4] */ ARM64("ldur w13, [x13, #-4]");
    /* 0x00b6ab74: cmp      w24, w13 */ ARM64("cmp w24, w13");
    /* 0x00b6ab78: b.eq     #0xb6b124 */ if (COND_EQ) goto loc_00b6b124;
    /* 0x00b6ab7c: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b6ab80: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b6ab84: b.ne     #0xb6ab5c */ if (COND_NE) goto loc_00b6ab5c;
loc_00b6ab88:
    /* 0x00b6ab88: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b6ab8c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b6ab90: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b6ab94: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b6ab98: tbnz     w12, #0, #0xb6abc0 */ if (((w12 >> #0) & 1) != 0) goto loc_00b6abc0;
    /* 0x00b6ab9c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b6aba0: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00b6aba4: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00b6aba8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b6abac: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b6abb0: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b6abb4: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6abb8: b.ne     #0xb6ab5c */ if (COND_NE) goto loc_00b6ab5c;
    /* 0x00b6abbc: b        #0xb6ab88 */ goto loc_00b6ab88;
loc_00b6abc0:
    /* 0x00b6abc0: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b6abc4: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b6abc8: bl       #0xbaf968 */ CALL_DIRECT(sub_00baf968);
    /* 0x00b6abcc: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6abd0: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b6abd4: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b6abd8: bl       #0xbd8578 */ CALL_DIRECT(sub_00bd8578);
    /* 0x00b6abdc: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6abe0: cmp      x8, x23 */ ARM64("cmp x8, x23");
    /* 0x00b6abe4: b.eq     #0xb6b8ac */ if (COND_EQ) goto loc_00b6b8ac;
    /* 0x00b6abe8: ldr      q0, [x26, #0x20] */ ARM64("ldr q0, [x26, #0x20]");
    /* 0x00b6abec: str      q0, [x28] */ ARM64("str q0, [x28]");
    /* 0x00b6abf0: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b6abf4: str      x8, [sp, #0x560] */ ARM64("str x8, [sp, #0x560]");
    /* 0x00b6abf8: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00b6abfc: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b6ac00: stp      q1, q0, [x8] */ ARM64("stp q1, q0, [x8]");
    /* 0x00b6ac04: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6ac08: add      x1, sp, #0x470 */ ARM64("add x1, sp, #0x470");
    /* 0x00b6ac0c: bl       #0xc16978 */ CALL_DIRECT(sub_00c16978);
    /* 0x00b6ac10: str      x24, [sp, #0xf0] */ ARM64("str x24, [sp, #0xf0]");
    /* 0x00b6ac14: str      x21, [sp, #0x118] */ ARM64("str x21, [sp, #0x118]");
    /* 0x00b6ac18: str      x20, [sp, #0x128] */ ARM64("str x20, [sp, #0x128]");
    /* 0x00b6ac1c: ldr      x25, [sp, #0x470] */ ARM64("ldr x25, [sp, #0x470]");
    /* 0x00b6ac20: ldr      x10, [sp, #0x478] */ ARM64("ldr x10, [sp, #0x478]");
    /* 0x00b6ac24: cbz      x10, #0xb6ac4c */ if (x10 == 0) goto loc_00b6ac4c;
    /* 0x00b6ac28: add      x8, x10, x10, lsl #1 */ ARM64("add x8, x10, x10, lsl #1");
    /* 0x00b6ac2c: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b6ac30: add      x9, x8, x10 */ ARM64("add x9, x8, x10");
    /* 0x00b6ac34: sub      x8, x25, x8 */ ARM64("sub x8, x25, x8");
    /* 0x00b6ac38: sub      x8, x8, #0x18 */ ARM64("sub x8, x8, #0x18");
    /* 0x00b6ac3c: str      x8, [sp, #0xe8] */ ARM64("str x8, [sp, #0xe8]");
    /* 0x00b6ac40: cmn      x9, #0x21 */ ARM64("cmn x9, #0x21");
    /* 0x00b6ac44: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6ac48: str      w8, [sp, #0x110] */ ARM64("str w8, [sp, #0x110]");
loc_00b6ac4c:
    /* 0x00b6ac4c: str      x10, [sp, #0x120] */ ARM64("str x10, [sp, #0x120]");
    /* 0x00b6ac50: ldr      x21, [sp, #0x488] */ ARM64("ldr x21, [sp, #0x488]");
    /* 0x00b6ac54: ldr      d0, [x25] */ ARM64("ldr d0, [x25]");
    /* 0x00b6ac58: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6ac5c: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6ac60: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b6ac64: add      x28, x25, #8 */ ARM64("add x28, x25, #8");
loc_00b6ac68:
    /* 0x00b6ac68: cbz      x21, #0xb6aebc */ if (x21 == 0) goto loc_00b6aebc;
    /* 0x00b6ac6c: cbnz     x24, #0xb6ac88 */ if (x24 != 0) goto loc_00b6ac88;
loc_00b6ac70:
    /* 0x00b6ac70: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00b6ac74: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6ac78: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6ac7c: sub      x25, x25, #0xc0 */ ARM64("sub x25, x25, #0xc0");
    /* 0x00b6ac80: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b6ac84: cbz      x24, #0xb6ac70 */ if (x24 == 0) goto loc_00b6ac70;
loc_00b6ac88:
    /* 0x00b6ac88: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00b6ac8c: rbit     x9, x24 */ ARM64("rbit x9, x24");
    /* 0x00b6ac90: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b6ac94: and      x24, x8, x24 */ ARM64("and x24, x8, x24");
    /* 0x00b6ac98: neg      x8, x9, lsr #3 */ ARM64("neg x8, x9, lsr #3");
    /* 0x00b6ac9c: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00b6aca0: smaddl   x8, w8, w9, x25 */ ARM64("smaddl x8, w8, w9, x25");
    /* 0x00b6aca4: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00b6aca8: ldur     x27, [x8, #-0x18] */ ARM64("ldur x27, [x8, #-0x18]");
    /* 0x00b6acac: cmp      x27, x23 */ ARM64("cmp x27, x23");
    /* 0x00b6acb0: b.eq     #0xb6aeb8 */ if (COND_EQ) goto loc_00b6aeb8;
    /* 0x00b6acb4: ldur     x9, [x8, #-0x10] */ ARM64("ldur x9, [x8, #-0x10]");
    /* 0x00b6acb8: str      x9, [sp, #0x180] */ ARM64("str x9, [sp, #0x180]");
    /* 0x00b6acbc: ldr      x9, [sp, #0x668] */ ARM64("ldr x9, [sp, #0x668]");
    /* 0x00b6acc0: cbz      x9, #0xb6b1ac */ if (x9 == 0) goto loc_00b6b1ac;
    /* 0x00b6acc4: ldur     x26, [x8, #-8] */ ARM64("ldur x26, [x8, #-8]");
    /* 0x00b6acc8: cmp      x26, #8 */ ARM64("cmp x26, #8");
    /* 0x00b6accc: b.lo     #0xb6acf8 */ if (COND_LO) goto loc_00b6acf8;
    /* 0x00b6acd0: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b6acd4: ldr      x9, [sp, #0x180] */ ARM64("ldr x9, [sp, #0x180]");
    /* 0x00b6acd8: mov      x10, x26 */ ARM64("mov x10, x26");
loc_00b6acdc:
    /* 0x00b6acdc: ldr      x11, [x9], #8 */ ARM64("ldr x11, [x9], #8");
    /* 0x00b6ace0: eor      x8, x11, x8, ror #59 */ ARM64("eor x8, x11, x8, ror #59");
    /* 0x00b6ace4: mul      x8, x8, x22 */ ARM64("mul x8, x8, x22");
    /* 0x00b6ace8: sub      x10, x10, #8 */ ARM64("sub x10, x10, #8");
    /* 0x00b6acec: cmp      x10, #7 */ ARM64("cmp x10, #7");
    /* 0x00b6acf0: b.hi     #0xb6acdc */ if (COND_HI) goto loc_00b6acdc;
    /* 0x00b6acf4: b        #0xb6ad04 */ goto loc_00b6ad04;
loc_00b6acf8:
    /* 0x00b6acf8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b6acfc: mov      x10, x26 */ ARM64("mov x10, x26");
    /* 0x00b6ad00: ldr      x9, [sp, #0x180] */ ARM64("ldr x9, [sp, #0x180]");
loc_00b6ad04:
    /* 0x00b6ad04: cmp      x10, #3 */ ARM64("cmp x10, #3");
    /* 0x00b6ad08: b.ls     #0xb6adf8 */ if (COND_LS) goto loc_00b6adf8;
    /* 0x00b6ad0c: ldr      w11, [x9], #4 */ ARM64("ldr w11, [x9], #4");
    /* 0x00b6ad10: eor      x8, x11, x8, ror #59 */ ARM64("eor x8, x11, x8, ror #59");
    /* 0x00b6ad14: mul      x8, x8, x22 */ ARM64("mul x8, x8, x22");
    /* 0x00b6ad18: sub      x10, x10, #4 */ ARM64("sub x10, x10, #4");
    /* 0x00b6ad1c: cmp      x10, #1 */ ARM64("cmp x10, #1");
    /* 0x00b6ad20: b.hi     #0xb6ae00 */ if (COND_HI) goto loc_00b6ae00;
loc_00b6ad24:
    /* 0x00b6ad24: cbz      x10, #0xb6ad34 */ if (x10 == 0) goto loc_00b6ad34;
loc_00b6ad28:
    /* 0x00b6ad28: ldrb     w9, [x9] */ ARM64("ldrb w9, [x9]");
    /* 0x00b6ad2c: eor      x8, x9, x8, ror #59 */ ARM64("eor x8, x9, x8, ror #59");
    /* 0x00b6ad30: mul      x8, x8, x22 */ ARM64("mul x8, x8, x22");
loc_00b6ad34:
    /* 0x00b6ad34: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00b6ad38: ror      x8, x8, #0x3b */ ARM64("ror x8, x8, #0x3b");
    /* 0x00b6ad3c: eor      x8, x8, #0xff */ ARM64("eor x8, x8, #0xff");
    /* 0x00b6ad40: mul      x8, x8, x22 */ ARM64("mul x8, x8, x22");
    /* 0x00b6ad44: lsr      x9, x8, #0x39 */ ARM64("lsr x9, x8, #0x39");
    /* 0x00b6ad48: ldr      x23, [sp, #0x658] */ ARM64("ldr x23, [sp, #0x658]");
    /* 0x00b6ad4c: ldr      x20, [sp, #0x650] */ ARM64("ldr x20, [sp, #0x650]");
    /* 0x00b6ad50: dup      v8.8b, w9 */ ARM64("dup v8.8b, w9");
    /* 0x00b6ad54: and      x22, x8, x23 */ ARM64("and x22, x8, x23");
    /* 0x00b6ad58: ldr      d9, [x20, x22] */ ARM64("ldr d9, [x20, x22]");
    /* 0x00b6ad5c: cmeq     v0.8b, v9.8b, v8.8b */ ARM64("cmeq v0.8b, v9.8b, v8.8b");
    /* 0x00b6ad60: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6ad64: ands     x9, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x9, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6ad68: b.eq     #0xb6adc0 */ if (COND_EQ) goto loc_00b6adc0;
loc_00b6ad6c:
    /* 0x00b6ad6c: str      x27, [sp, #0x178] */ ARM64("str x27, [sp, #0x178]");
    /* 0x00b6ad70: str      x10, [sp, #0x100] */ ARM64("str x10, [sp, #0x100]");
loc_00b6ad74:
    /* 0x00b6ad74: str      x9, [sp, #0x108] */ ARM64("str x9, [sp, #0x108]");
    /* 0x00b6ad78: rbit     x8, x9 */ ARM64("rbit x8, x9");
    /* 0x00b6ad7c: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b6ad80: add      x8, x22, x8, lsr #3 */ ARM64("add x8, x22, x8, lsr #3");
    /* 0x00b6ad84: and      x8, x8, x23 */ ARM64("and x8, x8, x23");
    /* 0x00b6ad88: sub      x27, x20, x8, lsl #5 */ ARM64("sub x27, x20, x8, lsl #5");
    /* 0x00b6ad8c: ldur     x8, [x27, #-0x10] */ ARM64("ldur x8, [x27, #-0x10]");
    /* 0x00b6ad90: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b6ad94: b.ne     #0xb6adac */ if (COND_NE) goto loc_00b6adac;
    /* 0x00b6ad98: ldur     x1, [x27, #-0x18] */ ARM64("ldur x1, [x27, #-0x18]");
    /* 0x00b6ad9c: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6ada0: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00b6ada4: bl       #0xc7ad60 */ CALL_DIRECT(sub_00c7ad60);
    /* 0x00b6ada8: cbz      w0, #0xb6ae18 */ if (w0 == 0) goto loc_00b6ae18;
loc_00b6adac:
    /* 0x00b6adac: ldp      x10, x9, [sp, #0x100] */ ARM64("ldp x10, x9, [sp, #0x100]");
    /* 0x00b6adb0: sub      x8, x9, #1 */ ARM64("sub x8, x9, #1");
    /* 0x00b6adb4: ands     x9, x8, x9 */ ARM64("ands x9, x8, x9");
    /* 0x00b6adb8: ldr      x27, [sp, #0x178] */ ARM64("ldr x27, [sp, #0x178]");
    /* 0x00b6adbc: b.ne     #0xb6ad74 */ if (COND_NE) goto loc_00b6ad74;
loc_00b6adc0:
    /* 0x00b6adc0: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b6adc4: cmeq     v0.8b, v9.8b, v0.8b */ ARM64("cmeq v0.8b, v9.8b, v0.8b");
    /* 0x00b6adc8: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00b6adcc: fmov     w8, s0 */ ARM64("fmov w8, s0");
    /* 0x00b6add0: tbnz     w8, #0, #0xb6b1ac */ if (((w8 >> #0) & 1) != 0) goto loc_00b6b1ac;
    /* 0x00b6add4: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00b6add8: add      x8, x22, x10 */ ARM64("add x8, x22, x10");
    /* 0x00b6addc: and      x22, x8, x23 */ ARM64("and x22, x8, x23");
    /* 0x00b6ade0: ldr      d9, [x20, x22] */ ARM64("ldr d9, [x20, x22]");
    /* 0x00b6ade4: cmeq     v0.8b, v9.8b, v8.8b */ ARM64("cmeq v0.8b, v9.8b, v8.8b");
    /* 0x00b6ade8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6adec: ands     x9, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x9, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b6adf0: b.ne     #0xb6ad6c */ if (COND_NE) goto loc_00b6ad6c;
    /* 0x00b6adf4: b        #0xb6adc0 */ goto loc_00b6adc0;
loc_00b6adf8:
    /* 0x00b6adf8: cmp      x10, #1 */ ARM64("cmp x10, #1");
    /* 0x00b6adfc: b.ls     #0xb6ad24 */ if (COND_LS) goto loc_00b6ad24;
loc_00b6ae00:
    /* 0x00b6ae00: ldrh     w11, [x9], #2 */ ARM64("ldrh w11, [x9], #2");
    /* 0x00b6ae04: eor      x8, x11, x8, ror #59 */ ARM64("eor x8, x11, x8, ror #59");
    /* 0x00b6ae08: mul      x8, x8, x22 */ ARM64("mul x8, x8, x22");
    /* 0x00b6ae0c: sub      x10, x10, #2 */ ARM64("sub x10, x10, #2");
    /* 0x00b6ae10: cbnz     x10, #0xb6ad28 */ if (x10 != 0) goto loc_00b6ad28;
    /* 0x00b6ae14: b        #0xb6ad34 */ goto loc_00b6ad34;
loc_00b6ae18:
    /* 0x00b6ae18: ldur     w20, [x27, #-8] */ ARM64("ldur w20, [x27, #-8]");
    /* 0x00b6ae1c: ldr      x8, [sp, #0x5c8] */ ARM64("ldr x8, [sp, #0x5c8]");
    /* 0x00b6ae20: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00b6ae24: b.ls     #0xb6ae90 */ if (COND_LS) goto loc_00b6ae90;
    /* 0x00b6ae28: ldr      x8, [sp, #0x5c0] */ ARM64("ldr x8, [sp, #0x5c0]");
    /* 0x00b6ae2c: lsl      x9, x20, #5 */ ARM64("lsl x9, x20, #5");
    /* 0x00b6ae30: ldr      x8, [x8, x9] */ ARM64("ldr x8, [x8, x9]");
    /* 0x00b6ae34: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00b6ae38: cmp      x8, x23 */ ARM64("cmp x8, x23");
    /* 0x00b6ae3c: mov      x22, #0xa95 */ ARM64("mov x22, #0xa95");
    /* 0x00b6ae40: movk     x22, #0x2722, lsl #16 */ ARM64("movk x22, #0x2722, lsl #16");
    /* 0x00b6ae44: movk     x22, #0xc1b7, lsl #32 */ ARM64("movk x22, #0xc1b7, lsl #32");
    /* 0x00b6ae48: movk     x22, #0x517c, lsl #48 */ ARM64("movk x22, #0x517c, lsl #48");
    /* 0x00b6ae4c: ldr      x27, [sp, #0x178] */ ARM64("ldr x27, [sp, #0x178]");
    /* 0x00b6ae50: b.eq     #0xb6aea8 */ if (COND_EQ) goto loc_00b6aea8;
    /* 0x00b6ae54: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00b6ae58: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00b6ae5c: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00b6ae60: b.ne     #0xb6ae74 */ if (COND_NE) goto loc_00b6ae74;
    /* 0x00b6ae64: sub      x0, x29, #0xa8 */ ARM64("sub x0, x29, #0xa8");
    /* 0x00b6ae68: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b6ae6c: ldur     x8, [x29, #-0xa0] */ ARM64("ldur x8, [x29, #-0xa0]");
    /* 0x00b6ae70: str      x8, [sp, #0x118] */ ARM64("str x8, [sp, #0x118]");
loc_00b6ae74:
    /* 0x00b6ae74: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00b6ae78: ldr      x9, [sp, #0x118] */ ARM64("ldr x9, [sp, #0x118]");
    /* 0x00b6ae7c: str      w20, [x9, x8, lsl #2] */ ARM64("str w20, [x9, x8, lsl #2]");
    /* 0x00b6ae80: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b6ae84: str      x8, [sp, #0x128] */ ARM64("str x8, [sp, #0x128]");
    /* 0x00b6ae88: stur     x8, [x29, #-0x98] */ ARM64("stur x8, [x29, #-0x98]");
    /* 0x00b6ae8c: b        #0xb6aea8 */ goto loc_00b6aea8;
loc_00b6ae90:
    /* 0x00b6ae90: mov      x22, #0xa95 */ ARM64("mov x22, #0xa95");
    /* 0x00b6ae94: movk     x22, #0x2722, lsl #16 */ ARM64("movk x22, #0x2722, lsl #16");
    /* 0x00b6ae98: movk     x22, #0xc1b7, lsl #32 */ ARM64("movk x22, #0xc1b7, lsl #32");
    /* 0x00b6ae9c: movk     x22, #0x517c, lsl #48 */ ARM64("movk x22, #0x517c, lsl #48");
    /* 0x00b6aea0: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00b6aea4: ldr      x27, [sp, #0x178] */ ARM64("ldr x27, [sp, #0x178]");
loc_00b6aea8:
    /* 0x00b6aea8: cbz      x27, #0xb6ac68 */ if (x27 == 0) goto loc_00b6ac68;
    /* 0x00b6aeac: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6aeb0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6aeb4: b        #0xb6ac68 */ goto loc_00b6ac68;
loc_00b6aeb8:
    /* 0x00b6aeb8: cbnz     x21, #0xb6af34 */ if (x21 != 0) goto loc_00b6af34;
loc_00b6aebc:
    /* 0x00b6aebc: ldr      x8, [sp, #0x120] */ ARM64("ldr x8, [sp, #0x120]");
    /* 0x00b6aec0: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b6aec4: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6aec8: ldr      w9, [sp, #0x110] */ ARM64("ldr w9, [sp, #0x110]");
    /* 0x00b6aecc: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b6aed0: tbnz     w8, #0, #0xb6aedc */ if (((w8 >> #0) & 1) != 0) goto loc_00b6aedc;
    /* 0x00b6aed4: ldr      x0, [sp, #0xe8] */ ARM64("ldr x0, [sp, #0xe8]");
    /* 0x00b6aed8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6aedc:
    /* 0x00b6aedc: ldur     x25, [x29, #-0xb0] */ ARM64("ldur x25, [x29, #-0xb0]");
    /* 0x00b6aee0: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6aee4: ldr      x24, [sp, #0xf0] */ ARM64("ldr x24, [sp, #0xf0]");
    /* 0x00b6aee8: cbz      x25, #0xb6af78 */ if (x25 == 0) goto loc_00b6af78;
    /* 0x00b6aeec: ldur     x10, [x29, #-0xb8] */ ARM64("ldur x10, [x29, #-0xb8]");
    /* 0x00b6aef0: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00b6aef4: madd     x8, x25, x8, x10 */ ARM64("madd x8, x25, x8, x10");
    /* 0x00b6aef8: ldur     x9, [x8, #-0xf0] */ ARM64("ldur x9, [x8, #-0xf0]");
    /* 0x00b6aefc: cmp      x9, #0x11 */ ARM64("cmp x9, #0x11");
    /* 0x00b6af00: b.ne     #0xb6af78 */ if (COND_NE) goto loc_00b6af78;
    /* 0x00b6af04: ldp      x9, x1, [x8, #-0x100] */ ARM64("ldp x9, x1, [x8, #-0x100]");
    /* 0x00b6af08: subs     x21, x1, #1 */ ARM64("subs x21, x1, #1");
    /* 0x00b6af0c: stp      x10, x9, [sp, #0x178] */ ARM64("stp x10, x9, [sp, #0x178]");
    /* 0x00b6af10: add      x22, sp, #0x210 */ ARM64("add x22, sp, #0x210");
    /* 0x00b6af14: b.hi     #0xb6af88 */ if (COND_HI) goto loc_00b6af88;
    /* 0x00b6af18: b.ne     #0xb6b96c */ if (COND_NE) goto loc_00b6b96c;
    /* 0x00b6af1c: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00b6af20: b        #0xb6af94 */ goto loc_00b6af94;
loc_00b6af24:
    /* 0x00b6af24: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00b6af28: and      x24, x8, x24 */ ARM64("and x24, x8, x24");
    /* 0x00b6af2c: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00b6af30: cbz      x21, #0xb6aebc */ if (x21 == 0) goto loc_00b6aebc;
loc_00b6af34:
    /* 0x00b6af34: cbnz     x24, #0xb6af50 */ if (x24 != 0) goto loc_00b6af50;
loc_00b6af38:
    /* 0x00b6af38: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00b6af3c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6af40: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6af44: sub      x25, x25, #0xc0 */ ARM64("sub x25, x25, #0xc0");
    /* 0x00b6af48: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b6af4c: cbz      x24, #0xb6af38 */ if (x24 == 0) goto loc_00b6af38;
loc_00b6af50:
    /* 0x00b6af50: rbit     x8, x24 */ ARM64("rbit x8, x24");
    /* 0x00b6af54: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b6af58: neg      x8, x8, lsr #3 */ ARM64("neg x8, x8, lsr #3");
    /* 0x00b6af5c: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00b6af60: smaddl   x8, w8, w9, x25 */ ARM64("smaddl x8, w8, w9, x25");
    /* 0x00b6af64: ldur     x9, [x8, #-0x18] */ ARM64("ldur x9, [x8, #-0x18]");
    /* 0x00b6af68: cbz      x9, #0xb6af24 */ if (x9 == 0) goto loc_00b6af24;
    /* 0x00b6af6c: ldur     x0, [x8, #-0x10] */ ARM64("ldur x0, [x8, #-0x10]");
    /* 0x00b6af70: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6af74: b        #0xb6af24 */ goto loc_00b6af24;
loc_00b6af78:
    /* 0x00b6af78: add      x22, sp, #0x210 */ ARM64("add x22, sp, #0x210");
    /* 0x00b6af7c: ldr      x26, [sp, #0x560] */ ARM64("ldr x26, [sp, #0x560]");
    /* 0x00b6af80: cbnz     x26, #0xb6b018 */ if (x26 != 0) goto loc_00b6b018;
    /* 0x00b6af84: b        #0xb6b028 */ goto loc_00b6b028;
loc_00b6af88:
    /* 0x00b6af88: ldrsb    w8, [x9, #1] */ ARM64("ldrsb w8, [x9, #1]");
    /* 0x00b6af8c: cmn      w8, #0x40 */ ARM64("cmn w8, #0x40");
    /* 0x00b6af90: b.lt     #0xb6b96c */ if (COND_LT) goto loc_00b6b96c;
loc_00b6af94:
    /* 0x00b6af94: sub      x1, x29, #0xe0 */ ARM64("sub x1, x29, #0xe0");
    /* 0x00b6af98: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b6af9c: bl       #0xbea10c */ CALL_DIRECT(sub_00bea10c);
    /* 0x00b6afa0: mov      x27, x0 */ ARM64("mov x27, x0");
    /* 0x00b6afa4: mov      x26, x1 */ ARM64("mov x26, x1");
    /* 0x00b6afa8: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6afac: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00b6afb0: mov      w3, #1 */ ARM64("mov w3, #1");
    /* 0x00b6afb4: bl       #0xc2bf7c */ CALL_DIRECT(sub_00c2bf7c);
    /* 0x00b6afb8: ldr      w8, [sp, #0x230] */ ARM64("ldr w8, [sp, #0x230]");
    /* 0x00b6afbc: ldr      x28, [sp, #0x238] */ ARM64("ldr x28, [sp, #0x238]");
    /* 0x00b6afc0: tbnz     w8, #0, #0xb6b988 */ if (((w8 >> #0) & 1) != 0) goto loc_00b6b988;
    /* 0x00b6afc4: ldr      x20, [sp, #0x240] */ ARM64("ldr x20, [sp, #0x240]");
    /* 0x00b6afc8: cbz      x26, #0xb6afdc */ if (x26 == 0) goto loc_00b6afdc;
    /* 0x00b6afcc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b6afd0: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b6afd4: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00b6afd8: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
loc_00b6afdc:
    /* 0x00b6afdc: cmp      x21, x26 */ ARM64("cmp x21, x26");
    /* 0x00b6afe0: b.ne     #0xb6b000 */ if (COND_NE) goto loc_00b6b000;
    /* 0x00b6afe4: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00b6afe8: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b6afec: add      x0, x8, #1 */ ARM64("add x0, x8, #1");
    /* 0x00b6aff0: mov      x21, x20 */ ARM64("mov x21, x20");
    /* 0x00b6aff4: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00b6aff8: bl       #0xc7ad60 */ CALL_DIRECT(sub_00c7ad60);
    /* 0x00b6affc: cbz      w0, #0xb6b12c */ if (w0 == 0) goto loc_00b6b12c;
loc_00b6b000:
    /* 0x00b6b000: cbz      x28, #0xb6b00c */ if (x28 == 0) goto loc_00b6b00c;
    /* 0x00b6b004: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b6b008: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b00c:
    /* 0x00b6b00c: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b010: ldr      x26, [sp, #0x560] */ ARM64("ldr x26, [sp, #0x560]");
    /* 0x00b6b014: cbz      x26, #0xb6b028 */ if (x26 == 0) goto loc_00b6b028;
loc_00b6b018:
    /* 0x00b6b018: ldr      x27, [sp, #0x558] */ ARM64("ldr x27, [sp, #0x558]");
    /* 0x00b6b01c: ldr      x8, [x27, #0x18] */ ARM64("ldr x8, [x27, #0x18]");
    /* 0x00b6b020: cmp      x8, #0x12 */ ARM64("cmp x8, #0x12");
    /* 0x00b6b024: b.eq     #0xb6b0a4 */ if (COND_EQ) goto loc_00b6b0a4;
loc_00b6b028:
    /* 0x00b6b028: stur     x24, [x29, #-0xe0] */ ARM64("stur x24, [x29, #-0xe0]");
    /* 0x00b6b02c: sub      x8, x29, #0xe0 */ ARM64("sub x8, x29, #0xe0");
    /* 0x00b6b030: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6b034: adrp     x8, #0xbef000 */ ARM64("adrp x8, #0xbef000");
    /* 0x00b6b038: add      x8, x8, #0x1c8 */ ARM64("add x8, x8, #0x1c8");
    /* 0x00b6b03c: str      x8, [sp, #0x238] */ ARM64("str x8, [sp, #0x238]");
    /* 0x00b6b040: add      x0, sp, #0x680 */ ARM64("add x0, sp, #0x680");
    /* 0x00b6b044: add      x2, sp, #0x230 */ ARM64("add x2, sp, #0x230");
    /* 0x00b6b048: adrp     x1, #0xcb9000 */ ARM64("adrp x1, #0xcb9000");
    /* 0x00b6b04c: add      x1, x1, #0xda3 */ ARM64("add x1, x1, #0xda3");
    /* 0x00b6b050: bl       #0xb71ea8 */ CALL_DIRECT(sub_00b71ea8);
    /* 0x00b6b054: ldr      q0, [x28, #0x130] */ ARM64("ldr q0, [x28, #0x130]");
    /* 0x00b6b058: str      q0, [x22, #0x20] */ ARM64("str q0, [x22, #0x20]");
    /* 0x00b6b05c: ldr      x8, [sp, #0x690] */ ARM64("ldr x8, [sp, #0x690]");
    /* 0x00b6b060: str      x8, [sp, #0x240] */ ARM64("str x8, [sp, #0x240]");
    /* 0x00b6b064: mov      w8, #0x20 */ ARM64("mov w8, #0x20");
    /* 0x00b6b068: str      x8, [sp, #0x248] */ ARM64("str x8, [sp, #0x248]");
    /* 0x00b6b06c: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6b070: cmp      x25, x8 */ ARM64("cmp x25, x8");
    /* 0x00b6b074: b.ne     #0xb6b080 */ if (COND_NE) goto loc_00b6b080;
    /* 0x00b6b078: sub      x0, x29, #0xc0 */ ARM64("sub x0, x29, #0xc0");
    /* 0x00b6b07c: bl       #0xc6c42c */ CALL_DIRECT(sub_00c6c42c);
loc_00b6b080:
    /* 0x00b6b080: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00b6b084: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00b6b088: madd     x0, x25, x9, x8 */ ARM64("madd x0, x25, x9, x8");
    /* 0x00b6b08c: add      x1, sp, #0x230 */ ARM64("add x1, sp, #0x230");
    /* 0x00b6b090: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00b6b094: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b6b098: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b6b09c: stur     x25, [x29, #-0xb0] */ ARM64("stur x25, [x29, #-0xb0]");
    /* 0x00b6b0a0: ldr      x27, [sp, #0x558] */ ARM64("ldr x27, [sp, #0x558]");
loc_00b6b0a4:
    /* 0x00b6b0a4: ldr      x20, [sp, #0x550] */ ARM64("ldr x20, [sp, #0x550]");
    /* 0x00b6b0a8: add      x8, x26, x26, lsl #5 */ ARM64("add x8, x26, x26, lsl #5");
    /* 0x00b6b0ac: lsl      x24, x8, #3 */ ARM64("lsl x24, x8, #3");
    /* 0x00b6b0b0: add      x8, x27, x24 */ ARM64("add x8, x27, x24");
    /* 0x00b6b0b4: str      x27, [sp, #0x230] */ ARM64("str x27, [sp, #0x230]");
    /* 0x00b6b0b8: str      x27, [sp, #0x238] */ ARM64("str x27, [sp, #0x238]");
    /* 0x00b6b0bc: str      x20, [sp, #0x240] */ ARM64("str x20, [sp, #0x240]");
    /* 0x00b6b0c0: str      x8, [sp, #0x248] */ ARM64("str x8, [sp, #0x248]");
    /* 0x00b6b0c4: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6b0c8: sub      x8, x8, x25 */ ARM64("sub x8, x8, x25");
    /* 0x00b6b0cc: cmp      x26, x8 */ ARM64("cmp x26, x8");
    /* 0x00b6b0d0: b.hi     #0xb6b184 */ if (COND_HI) goto loc_00b6b184;
    /* 0x00b6b0d4: cbz      x26, #0xb6b0f0 */ if (x26 == 0) goto loc_00b6b0f0;
loc_00b6b0d8:
    /* 0x00b6b0d8: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00b6b0dc: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00b6b0e0: madd     x0, x25, x9, x8 */ ARM64("madd x0, x25, x9, x8");
    /* 0x00b6b0e4: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b6b0e8: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b6b0ec: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
loc_00b6b0f0:
    /* 0x00b6b0f0: add      x25, x25, x26 */ ARM64("add x25, x25, x26");
    /* 0x00b6b0f4: stur     x25, [x29, #-0xb0] */ ARM64("stur x25, [x29, #-0xb0]");
    /* 0x00b6b0f8: str      x27, [sp, #0x248] */ ARM64("str x27, [sp, #0x248]");
    /* 0x00b6b0fc: cbz      x20, #0xb6b108 */ if (x20 == 0) goto loc_00b6b108;
    /* 0x00b6b100: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b6b104: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b108:
    /* 0x00b6b108: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b10c: mov      x22, #0xa95 */ ARM64("mov x22, #0xa95");
    /* 0x00b6b110: movk     x22, #0x2722, lsl #16 */ ARM64("movk x22, #0x2722, lsl #16");
    /* 0x00b6b114: movk     x22, #0xc1b7, lsl #32 */ ARM64("movk x22, #0xc1b7, lsl #32");
    /* 0x00b6b118: movk     x22, #0x517c, lsl #48 */ ARM64("movk x22, #0x517c, lsl #48");
    /* 0x00b6b11c: ldr      x20, [sp, #0x128] */ ARM64("ldr x20, [sp, #0x128]");
    /* 0x00b6b120: ldr      x21, [sp, #0x118] */ ARM64("ldr x21, [sp, #0x118]");
loc_00b6b124:
    /* 0x00b6b124: cbnz     x20, #0xb6ab18 */ if (x20 != 0) goto loc_00b6ab18;
    /* 0x00b6b128: b        #0xb6b528 */ goto loc_00b6b528;
loc_00b6b12c:
    /* 0x00b6b12c: cbz      x28, #0xb6b138 */ if (x28 == 0) goto loc_00b6b138;
    /* 0x00b6b130: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6b134: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b138:
    /* 0x00b6b138: sub      x25, x25, #1 */ ARM64("sub x25, x25, #1");
    /* 0x00b6b13c: stur     x25, [x29, #-0xb0] */ ARM64("stur x25, [x29, #-0xb0]");
    /* 0x00b6b140: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00b6b144: ldr      x9, [sp, #0x178] */ ARM64("ldr x9, [sp, #0x178]");
    /* 0x00b6b148: madd     x1, x25, x8, x9 */ ARM64("madd x1, x25, x8, x9");
    /* 0x00b6b14c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b150: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00b6b154: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b6b158: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b6b15c: cmp      x8, #0x21 */ ARM64("cmp x8, #0x21");
    /* 0x00b6b160: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b164: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00b6b168: b.eq     #0xb6b174 */ if (COND_EQ) goto loc_00b6b174;
    /* 0x00b6b16c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b170: bl       #0xc1629c */ CALL_DIRECT(sub_00c1629c);
loc_00b6b174:
    /* 0x00b6b174: ldr      x24, [sp, #0xf0] */ ARM64("ldr x24, [sp, #0xf0]");
    /* 0x00b6b178: ldr      x26, [sp, #0x560] */ ARM64("ldr x26, [sp, #0x560]");
    /* 0x00b6b17c: cbnz     x26, #0xb6b018 */ if (x26 != 0) goto loc_00b6b018;
    /* 0x00b6b180: b        #0xb6b028 */ goto loc_00b6b028;
loc_00b6b184:
    /* 0x00b6b184: sub      x0, x29, #0xc0 */ ARM64("sub x0, x29, #0xc0");
    /* 0x00b6b188: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00b6b18c: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00b6b190: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b6b194: mov      w4, #0x108 */ ARM64("mov w4, #0x108");
    /* 0x00b6b198: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00b6b19c: ldur     x25, [x29, #-0xb0] */ ARM64("ldur x25, [x29, #-0xb0]");
    /* 0x00b6b1a0: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b1a4: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00b6b1a8: b        #0xb6b0d8 */ goto loc_00b6b0d8;
loc_00b6b1ac:
    /* 0x00b6b1ac: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00b6b1b0: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00b6b1b4: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00b6b1b8: add      x2, x2, #0xe48 */ ARM64("add x2, x2, #0xe48");
    /* 0x00b6b1bc: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00b6b1c0: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00b6b1c4: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b1c8:
    /* 0x00b6b1c8: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00b6b1cc: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b6b1d0: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00b6b1d4: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b6b1d8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b1dc:
    /* 0x00b6b1dc: lsl      x8, x20, #3 */ ARM64("lsl x8, x20, #3");
    /* 0x00b6b1e0: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00b6b1e4: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6b1e8: b.eq     #0xb6b1fc */ if (COND_EQ) goto loc_00b6b1fc;
    /* 0x00b6b1ec: ldr      x9, [sp, #0x470] */ ARM64("ldr x9, [sp, #0x470]");
    /* 0x00b6b1f0: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6b1f4: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6b1f8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b1fc:
    /* 0x00b6b1fc: add      x20, x19, #8 */ ARM64("add x20, x19, #8");
    /* 0x00b6b200: ldaxrb   w8, [x20] */ ARM64("ldaxrb w8, [x20]");
    /* 0x00b6b204: cbnz     w8, #0xb6ba10 */ if (w8 != 0) goto loc_00b6ba10;
    /* 0x00b6b208: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b6b20c: stxrb    w9, w8, [x20] */ ARM64("stxrb w9, w8, [x20]");
    /* 0x00b6b210: cbnz     w9, #0xb6ba14 */ if (w9 != 0) goto loc_00b6ba14;
loc_00b6b214:
    /* 0x00b6b214: ldar     x8, [x21] */ ARM64("ldar x8, [x21]");
    /* 0x00b6b218: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b6b21c: b.ne     #0xb6ba20 */ if (COND_NE) goto loc_00b6ba20;
    /* 0x00b6b220: ldr      q0, [x21, #0x10] */ ARM64("ldr q0, [x21, #0x10]");
    /* 0x00b6b224: str      q0, [x26, #0x20] */ ARM64("str q0, [x26, #0x20]");
    /* 0x00b6b228: ldr      x8, [x21, #0x20] */ ARM64("ldr x8, [x21, #0x20]");
    /* 0x00b6b22c: str      x8, [sp, #0x240] */ ARM64("str x8, [sp, #0x240]");
    /* 0x00b6b230: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6b234: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6b238: ldr      q0, [x26, #0x20] */ ARM64("ldr q0, [x26, #0x20]");
    /* 0x00b6b23c: str      q0, [x28, #0x50] */ ARM64("str q0, [x28, #0x50]");
    /* 0x00b6b240: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b6b244: str      x8, [sp, #0x5b0] */ ARM64("str x8, [sp, #0x5b0]");
    /* 0x00b6b248: ldp      x0, x8, [x19, #0x30] */ ARM64("ldp x0, x8, [x19, #0x30]");
    /* 0x00b6b24c: add      x22, x8, #1 */ ARM64("add x22, x8, #1");
loc_00b6b250:
    /* 0x00b6b250: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00b6b254: b.eq     #0xb6b268 */ if (COND_EQ) goto loc_00b6b268;
    /* 0x00b6b258: add      x21, x0, #0x108 */ ARM64("add x21, x0, #0x108");
    /* 0x00b6b25c: bl       #0xbfe1e8 */ CALL_DIRECT(sub_00bfe1e8);
    /* 0x00b6b260: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6b264: b        #0xb6b250 */ goto loc_00b6b250;
loc_00b6b268:
    /* 0x00b6b268: ldur     x8, [x19, #0x28] */ ARM64("ldur x8, [x19, #0x28]");
    /* 0x00b6b26c: cbz      x8, #0xb6b278 */ if (x8 == 0) goto loc_00b6b278;
    /* 0x00b6b270: ldr      x0, [x19, #0x30] */ ARM64("ldr x0, [x19, #0x30]");
    /* 0x00b6b274: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b278:
    /* 0x00b6b278: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b6b27c: ldr      q0, [x28, #0x50] */ ARM64("ldr q0, [x28, #0x50]");
    /* 0x00b6b280: stur     q0, [x19, #0x28] */ ARM64("stur q0, [x19, #0x28]");
    /* 0x00b6b284: ldr      x8, [sp, #0x5b0] */ ARM64("ldr x8, [sp, #0x5b0]");
    /* 0x00b6b288: stur     x8, [x19, #0x38] */ ARM64("stur x8, [x19, #0x38]");
    /* 0x00b6b28c: ldp      x21, x23, [x19, #0x18] */ ARM64("ldp x21, x23, [x19, #0x18]");
loc_00b6b290:
    /* 0x00b6b290: cmp      x22, x23 */ ARM64("cmp x22, x23");
    /* 0x00b6b294: b.eq     #0xb6b2c8 */ if (COND_EQ) goto loc_00b6b2c8;
    /* 0x00b6b298: mov      x8, x22 */ ARM64("mov x8, x22");
    /* 0x00b6b29c: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b6b2a0: ldr      x9, [x21, x8, lsl #3] */ ARM64("ldr x9, [x21, x8, lsl #3]");
loc_00b6b2a4:
    /* 0x00b6b2a4: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b6b2a8: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b6b2ac: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b6b2b0: cbnz     w11, #0xb6b2a4 */ if (w11 != 0) goto loc_00b6b2a4;
    /* 0x00b6b2b4: b.ne     #0xb6b290 */ if (COND_NE) goto loc_00b6b290;
    /* 0x00b6b2b8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6b2bc: ldr      x0, [x21, x8, lsl #3] */ ARM64("ldr x0, [x21, x8, lsl #3]");
    /* 0x00b6b2c0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b6b2c4: b        #0xb6b290 */ goto loc_00b6b290;
loc_00b6b2c8:
    /* 0x00b6b2c8: ldur     x8, [x19, #0x10] */ ARM64("ldur x8, [x19, #0x10]");
    /* 0x00b6b2cc: cbz      x8, #0xb6b2d8 */ if (x8 == 0) goto loc_00b6b2d8;
    /* 0x00b6b2d0: ldr      x0, [x19, #0x18] */ ARM64("ldr x0, [x19, #0x18]");
    /* 0x00b6b2d4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b2d8:
    /* 0x00b6b2d8: ldr      q0, [x26, #0x240] */ ARM64("ldr q0, [x26, #0x240]");
    /* 0x00b6b2dc: stur     q0, [x19, #0x10] */ ARM64("stur q0, [x19, #0x10]");
    /* 0x00b6b2e0: ldr      x8, [sp, #0x460] */ ARM64("ldr x8, [sp, #0x460]");
    /* 0x00b6b2e4: stur     x8, [x19, #0x20] */ ARM64("stur x8, [x19, #0x20]");
    /* 0x00b6b2e8: ldr      w8, [sp, #0x160] */ ARM64("ldr w8, [sp, #0x160]");
    /* 0x00b6b2ec: strb     w8, [x19, #0x58] */ ARM64("strb w8, [x19, #0x58]");
loc_00b6b2f0:
    /* 0x00b6b2f0: ldxrb    w8, [x20] */ ARM64("ldxrb w8, [x20]");
    /* 0x00b6b2f4: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b6b2f8: b.ne     #0xb6ba4c */ if (COND_NE) goto loc_00b6ba4c;
    /* 0x00b6b2fc: stlxrb   w8, wzr, [x20] */ ARM64("stlxrb w8, wzr, [x20]");
    /* 0x00b6b300: cbnz     w8, #0xb6b2f0 */ if (w8 != 0) goto loc_00b6b2f0;
loc_00b6b304:
    /* 0x00b6b304: ldr      x8, [sp, #0xf8] */ ARM64("ldr x8, [sp, #0xf8]");
    /* 0x00b6b308: ldr      q0, [x8] */ ARM64("ldr q0, [x8]");
    /* 0x00b6b30c: ldr      x9, [sp, #0xa8] */ ARM64("ldr x9, [sp, #0xa8]");
    /* 0x00b6b310: stur     q0, [x9, #8] */ ARM64("stur q0, [x9, #8]");
    /* 0x00b6b314: ldr      x8, [x8, #0x10] */ ARM64("ldr x8, [x8, #0x10]");
    /* 0x00b6b318: str      x8, [x9, #0x18] */ ARM64("str x8, [x9, #0x18]");
    /* 0x00b6b31c: str      x19, [x9] */ ARM64("str x19, [x9]");
    /* 0x00b6b320: ldr      x19, [sp, #0x218] */ ARM64("ldr x19, [sp, #0x218]");
    /* 0x00b6b324: cbz      x19, #0xb6b3d4 */ if (x19 == 0) goto loc_00b6b3d4;
    /* 0x00b6b328: ldr      x20, [sp, #0x228] */ ARM64("ldr x20, [sp, #0x228]");
    /* 0x00b6b32c: cbz      x20, #0xb6b3b4 */ if (x20 == 0) goto loc_00b6b3b4;
    /* 0x00b6b330: ldr      x21, [sp, #0x210] */ ARM64("ldr x21, [sp, #0x210]");
    /* 0x00b6b334: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00b6b338: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b6b33c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6b340: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6b344: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00b6b348: b        #0xb6b350 */ goto loc_00b6b350;
loc_00b6b34c:
    /* 0x00b6b34c: cbz      x20, #0xb6b3b4 */ if (x20 == 0) goto loc_00b6b3b4;
loc_00b6b350:
    /* 0x00b6b350: cbnz     x23, #0xb6b36c */ if (x23 != 0) goto loc_00b6b36c;
loc_00b6b354:
    /* 0x00b6b354: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b6b358: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6b35c: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6b360: sub      x21, x21, #0x80 */ ARM64("sub x21, x21, #0x80");
    /* 0x00b6b364: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00b6b368: cbz      x23, #0xb6b354 */ if (x23 == 0) goto loc_00b6b354;
loc_00b6b36c:
    /* 0x00b6b36c: sub      x8, x23, #1 */ ARM64("sub x8, x23, #1");
    /* 0x00b6b370: rbit     x9, x23 */ ARM64("rbit x9, x23");
    /* 0x00b6b374: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b6b378: and      x23, x8, x23 */ ARM64("and x23, x8, x23");
    /* 0x00b6b37c: lsl      x8, x9, #1 */ ARM64("lsl x8, x9, #1");
    /* 0x00b6b380: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00b6b384: sub      x8, x21, x8 */ ARM64("sub x8, x21, x8");
    /* 0x00b6b388: sub      x20, x20, #1 */ ARM64("sub x20, x20, #1");
    /* 0x00b6b38c: ldur     x9, [x8, #-0x10] */ ARM64("ldur x9, [x8, #-0x10]");
loc_00b6b390:
    /* 0x00b6b390: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b6b394: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b6b398: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b6b39c: cbnz     w11, #0xb6b390 */ if (w11 != 0) goto loc_00b6b390;
    /* 0x00b6b3a0: b.ne     #0xb6b34c */ if (COND_NE) goto loc_00b6b34c;
    /* 0x00b6b3a4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6b3a8: ldur     x0, [x8, #-0x10] */ ARM64("ldur x0, [x8, #-0x10]");
    /* 0x00b6b3ac: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b6b3b0: b        #0xb6b34c */ goto loc_00b6b34c;
loc_00b6b3b4:
    /* 0x00b6b3b4: lsl      x8, x19, #4 */ ARM64("lsl x8, x19, #4");
    /* 0x00b6b3b8: add      x9, x8, x19 */ ARM64("add x9, x8, x19");
    /* 0x00b6b3bc: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b6b3c0: b.eq     #0xb6b3d4 */ if (COND_EQ) goto loc_00b6b3d4;
    /* 0x00b6b3c4: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b6b3c8: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6b3cc: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b6b3d0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b3d4:
    /* 0x00b6b3d4: add      sp, sp, #0x770 */ ARM64("add sp, sp, #0x770");
    /* 0x00b6b3d8: ldp      x29, x30, [sp, #0x60] */ ARM64("ldp x29, x30, [sp, #0x60]");
    /* 0x00b6b3dc: ldp      x20, x19, [sp, #0x50] */ ARM64("ldp x20, x19, [sp, #0x50]");
    /* 0x00b6b3e0: ldp      x22, x21, [sp, #0x40] */ ARM64("ldp x22, x21, [sp, #0x40]");
    /* 0x00b6b3e4: ldp      x24, x23, [sp, #0x30] */ ARM64("ldp x24, x23, [sp, #0x30]");
    /* 0x00b6b3e8: ldp      x26, x25, [sp, #0x20] */ ARM64("ldp x26, x25, [sp, #0x20]");
    /* 0x00b6b3ec: ldp      x28, x27, [sp, #0x10] */ ARM64("ldp x28, x27, [sp, #0x10]");
    /* 0x00b6b3f0: ldp      d9, d8, [sp], #0x70 */ ARM64("ldp d9, d8, [sp], #0x70");
    /* 0x00b6b3f4: ret       */ return;
loc_00b6b3f8:
    /* 0x00b6b3f8: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b6b3fc: add      x2, x2, #0x990 */ ARM64("add x2, x2, #0x990");
loc_00b6b400:
    /* 0x00b6b400: mov      x0, x8 */ ARM64("mov x0, x8");
    /* 0x00b6b404: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b6b408: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b6b40c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b410:
    /* 0x00b6b410: adrp     x0, #0xef7000 */ ARM64("adrp x0, #0xef7000");
    /* 0x00b6b414: add      x0, x0, #0xde0 */ ARM64("add x0, x0, #0xde0");
    /* 0x00b6b418: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b41c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b420:
    /* 0x00b6b420: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00b6b424: madd     x8, x25, x8, x22 */ ARM64("madd x8, x25, x8, x22");
    /* 0x00b6b428: str      x9, [sp, #0x250] */ ARM64("str x9, [sp, #0x250]");
    /* 0x00b6b42c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6b430: mov      x10, x22 */ ARM64("mov x10, x22");
    /* 0x00b6b434: cbz      x9, #0xb6b4a4 */ if (x9 == 0) goto loc_00b6b4a4;
    /* 0x00b6b438: add      x10, x25, x25, lsl #5 */ ARM64("add x10, x25, x25, lsl #5");
    /* 0x00b6b43c: lsl      x11, x10, #3 */ ARM64("lsl x11, x10, #3");
    /* 0x00b6b440: mov      x10, x22 */ ARM64("mov x10, x22");
loc_00b6b444:
    /* 0x00b6b444: cbz      x11, #0xb6b49c */ if (x11 == 0) goto loc_00b6b49c;
    /* 0x00b6b448: add      x10, x10, #0x108 */ ARM64("add x10, x10, #0x108");
    /* 0x00b6b44c: sub      x11, x11, #0x108 */ ARM64("sub x11, x11, #0x108");
    /* 0x00b6b450: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00b6b454: cbnz     x9, #0xb6b444 */ if (x9 != 0) goto loc_00b6b444;
    /* 0x00b6b458: mov      x0, x10 */ ARM64("mov x0, x10");
    /* 0x00b6b45c: b        #0xb6b4a0 */ goto loc_00b6b4a0;
loc_00b6b460:
    /* 0x00b6b460: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b6b464: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b6b468: b        #0xb677a8 */ goto loc_00b677a8;
loc_00b6b46c:
    /* 0x00b6b46c: sub      x8, x29, #0xe0 */ ARM64("sub x8, x29, #0xe0");
    /* 0x00b6b470: sub      x0, x29, #0xe0 */ ARM64("sub x0, x29, #0xe0");
    /* 0x00b6b474: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b6b478: bl       #0xc70708 */ CALL_DIRECT(sub_00c70708);
    /* 0x00b6b47c: b        #0xb67b94 */ goto loc_00b67b94;
loc_00b6b480:
    /* 0x00b6b480: adrp     x0, #0xe0a000 */ ARM64("adrp x0, #0xe0a000");
    /* 0x00b6b484: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00b6b488: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b6b48c: add      x2, x2, #0x928 */ ARM64("add x2, x2, #0x928");
    /* 0x00b6b490: mov      w1, #0x9e */ ARM64("mov w1, #0x9e");
    /* 0x00b6b494: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00b6b498: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b49c:
    /* 0x00b6b49c: mov      x0, x8 */ ARM64("mov x0, x8");
loc_00b6b4a0:
    /* 0x00b6b4a0: str      x9, [sp, #0x250] */ ARM64("str x9, [sp, #0x250]");
loc_00b6b4a4:
    /* 0x00b6b4a4: sub      x9, x10, x22 */ ARM64("sub x9, x10, x22");
    /* 0x00b6b4a8: lsr      x9, x9, #3 */ ARM64("lsr x9, x9, #3");
    /* 0x00b6b4ac: mov      x10, #0x83e1 */ ARM64("mov x10, #0x83e1");
    /* 0x00b6b4b0: movk     x10, #0x3e0f, lsl #16 */ ARM64("movk x10, #0x3e0f, lsl #16");
    /* 0x00b6b4b4: movk     x10, #0xe0f8, lsl #32 */ ARM64("movk x10, #0xe0f8, lsl #32");
    /* 0x00b6b4b8: movk     x10, #0xf83, lsl #48 */ ARM64("movk x10, #0xf83, lsl #48");
    /* 0x00b6b4bc: mul      x25, x9, x10 */ ARM64("mul x25, x9, x10");
    /* 0x00b6b4c0: str      x22, [sp, #0x470] */ ARM64("str x22, [sp, #0x470]");
    /* 0x00b6b4c4: str      x25, [sp, #0x478] */ ARM64("str x25, [sp, #0x478]");
    /* 0x00b6b4c8: str      x20, [sp, #0x480] */ ARM64("str x20, [sp, #0x480]");
    /* 0x00b6b4cc: sub      x8, x8, x0 */ ARM64("sub x8, x8, x0");
    /* 0x00b6b4d0: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00b6b4d4: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00b6b4d8: str      x9, [sp, #0x230] */ ARM64("str x9, [sp, #0x230]");
    /* 0x00b6b4dc: str      x9, [sp, #0x238] */ ARM64("str x9, [sp, #0x238]");
    /* 0x00b6b4e0: str      xzr, [sp, #0x240] */ ARM64("str xzr, [sp, #0x240]");
    /* 0x00b6b4e4: str      x9, [sp, #0x248] */ ARM64("str x9, [sp, #0x248]");
    /* 0x00b6b4e8: mov      x9, #1 */ ARM64("mov x9, #1");
    /* 0x00b6b4ec: madd     x24, x8, x10, x9 */ ARM64("madd x24, x8, x10, x9");
loc_00b6b4f0:
    /* 0x00b6b4f0: subs     x24, x24, #1 */ ARM64("subs x24, x24, #1");
    /* 0x00b6b4f4: b.eq     #0xb6a8ac */ if (COND_EQ) goto loc_00b6a8ac;
    /* 0x00b6b4f8: add      x21, x0, #0x108 */ ARM64("add x21, x0, #0x108");
    /* 0x00b6b4fc: bl       #0xc3896c */ CALL_DIRECT(sub_00c3896c);
    /* 0x00b6b500: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6b504: b        #0xb6b4f0 */ goto loc_00b6b4f0;
loc_00b6b508:
    /* 0x00b6b508: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b6b50c: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b6b510: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b6b514: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b518:
    /* 0x00b6b518: mov      x8, x15 */ ARM64("mov x8, x15");
loc_00b6b51c:
    /* 0x00b6b51c: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b6b520: add      x2, x2, #0x978 */ ARM64("add x2, x2, #0x978");
    /* 0x00b6b524: b        #0xb6b400 */ goto loc_00b6b400;
loc_00b6b528:
    /* 0x00b6b528: ldr      x8, [sp, #0x5c0] */ ARM64("ldr x8, [sp, #0x5c0]");
    /* 0x00b6b52c: ldr      x9, [sp, #0x5c8] */ ARM64("ldr x9, [sp, #0x5c8]");
    /* 0x00b6b530: add      x9, x8, x9, lsl #5 */ ARM64("add x9, x8, x9, lsl #5");
    /* 0x00b6b534: stp      x8, x9, [x29, #-0xe0] */ ARM64("stp x8, x9, [x29, #-0xe0]");
    /* 0x00b6b538: stur     xzr, [x29, #-0xd0] */ ARM64("stur xzr, [x29, #-0xd0]");
    /* 0x00b6b53c: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b540: sub      x1, x29, #0xe0 */ ARM64("sub x1, x29, #0xe0");
    /* 0x00b6b544: bl       #0xc27d50 */ CALL_DIRECT(sub_00c27d50);
    /* 0x00b6b548: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6b54c: str      x8, [sp, #0x180] */ ARM64("str x8, [sp, #0x180]");
    /* 0x00b6b550: ldr      x21, [sp, #0x238] */ ARM64("ldr x21, [sp, #0x238]");
    /* 0x00b6b554: ldr      x8, [sp, #0x240] */ ARM64("ldr x8, [sp, #0x240]");
    /* 0x00b6b558: cbz      x8, #0xb6b6cc */ if (x8 == 0) goto loc_00b6b6cc;
    /* 0x00b6b55c: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00b6b560: lsl      x28, x8, #2 */ ARM64("lsl x28, x8, #2");
    /* 0x00b6b564: mov      w22, #0x108 */ ARM64("mov w22, #0x108");
    /* 0x00b6b568: b        #0xb6b57c */ goto loc_00b6b57c;
loc_00b6b56c:
    /* 0x00b6b56c: add      x23, x23, #4 */ ARM64("add x23, x23, #4");
    /* 0x00b6b570: cmp      x28, x23 */ ARM64("cmp x28, x23");
    /* 0x00b6b574: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b578: b.eq     #0xb6b6cc */ if (COND_EQ) goto loc_00b6b6cc;
loc_00b6b57c:
    /* 0x00b6b57c: ldr      w27, [x21, x23] */ ARM64("ldr w27, [x21, x23]");
    /* 0x00b6b580: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b584: add      x1, sp, #0x5a0 */ ARM64("add x1, sp, #0x5a0");
    /* 0x00b6b588: mov      x2, x27 */ ARM64("mov x2, x27");
    /* 0x00b6b58c: bl       #0xbd8578 */ CALL_DIRECT(sub_00bd8578);
    /* 0x00b6b590: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6b594: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00b6b598: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b6b59c: b.eq     #0xb6b928 */ if (COND_EQ) goto loc_00b6b928;
    /* 0x00b6b5a0: add      x20, sp, #0x210 */ ARM64("add x20, sp, #0x210");
    /* 0x00b6b5a4: ldr      q0, [x26, #0x20] */ ARM64("ldr q0, [x26, #0x20]");
    /* 0x00b6b5a8: add      x8, sp, #0x550 */ ARM64("add x8, sp, #0x550");
    /* 0x00b6b5ac: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00b6b5b0: ldr      x24, [sp, #0x240] */ ARM64("ldr x24, [sp, #0x240]");
    /* 0x00b6b5b4: str      x24, [sp, #0x560] */ ARM64("str x24, [sp, #0x560]");
    /* 0x00b6b5b8: cbz      x24, #0xb6b5cc */ if (x24 == 0) goto loc_00b6b5cc;
    /* 0x00b6b5bc: ldr      x26, [sp, #0x558] */ ARM64("ldr x26, [sp, #0x558]");
    /* 0x00b6b5c0: ldr      x8, [x26, #0x18] */ ARM64("ldr x8, [x26, #0x18]");
    /* 0x00b6b5c4: cmp      x8, #0x12 */ ARM64("cmp x8, #0x12");
    /* 0x00b6b5c8: b.eq     #0xb6b648 */ if (COND_EQ) goto loc_00b6b648;
loc_00b6b5cc:
    /* 0x00b6b5cc: stur     x27, [x29, #-0x90] */ ARM64("stur x27, [x29, #-0x90]");
    /* 0x00b6b5d0: sub      x8, x29, #0x90 */ ARM64("sub x8, x29, #0x90");
    /* 0x00b6b5d4: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6b5d8: adrp     x8, #0xbef000 */ ARM64("adrp x8, #0xbef000");
    /* 0x00b6b5dc: add      x8, x8, #0x1c8 */ ARM64("add x8, x8, #0x1c8");
    /* 0x00b6b5e0: str      x8, [sp, #0x238] */ ARM64("str x8, [sp, #0x238]");
    /* 0x00b6b5e4: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6b5e8: add      x2, sp, #0x230 */ ARM64("add x2, sp, #0x230");
    /* 0x00b6b5ec: adrp     x1, #0xcb9000 */ ARM64("adrp x1, #0xcb9000");
    /* 0x00b6b5f0: add      x1, x1, #0xda3 */ ARM64("add x1, x1, #0xda3");
    /* 0x00b6b5f4: bl       #0xb71ea8 */ CALL_DIRECT(sub_00b71ea8);
    /* 0x00b6b5f8: add      x8, sp, #0x470 */ ARM64("add x8, sp, #0x470");
    /* 0x00b6b5fc: ldr      q0, [x8] */ ARM64("ldr q0, [x8]");
    /* 0x00b6b600: str      q0, [x20, #0x20] */ ARM64("str q0, [x20, #0x20]");
    /* 0x00b6b604: ldr      x8, [sp, #0x480] */ ARM64("ldr x8, [sp, #0x480]");
    /* 0x00b6b608: str      x8, [sp, #0x240] */ ARM64("str x8, [sp, #0x240]");
    /* 0x00b6b60c: mov      w8, #0x20 */ ARM64("mov w8, #0x20");
    /* 0x00b6b610: str      x8, [sp, #0x248] */ ARM64("str x8, [sp, #0x248]");
    /* 0x00b6b614: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6b618: cmp      x25, x8 */ ARM64("cmp x25, x8");
    /* 0x00b6b61c: b.ne     #0xb6b628 */ if (COND_NE) goto loc_00b6b628;
    /* 0x00b6b620: sub      x0, x29, #0xc0 */ ARM64("sub x0, x29, #0xc0");
    /* 0x00b6b624: bl       #0xc6c42c */ CALL_DIRECT(sub_00c6c42c);
loc_00b6b628:
    /* 0x00b6b628: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00b6b62c: madd     x0, x25, x22, x8 */ ARM64("madd x0, x25, x22, x8");
    /* 0x00b6b630: add      x1, sp, #0x230 */ ARM64("add x1, sp, #0x230");
    /* 0x00b6b634: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00b6b638: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b6b63c: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b6b640: stur     x25, [x29, #-0xb0] */ ARM64("stur x25, [x29, #-0xb0]");
    /* 0x00b6b644: ldr      x26, [sp, #0x558] */ ARM64("ldr x26, [sp, #0x558]");
loc_00b6b648:
    /* 0x00b6b648: ldr      x20, [sp, #0x550] */ ARM64("ldr x20, [sp, #0x550]");
    /* 0x00b6b64c: add      x8, x24, x24, lsl #5 */ ARM64("add x8, x24, x24, lsl #5");
    /* 0x00b6b650: lsl      x27, x8, #3 */ ARM64("lsl x27, x8, #3");
    /* 0x00b6b654: add      x8, x26, x27 */ ARM64("add x8, x26, x27");
    /* 0x00b6b658: str      x26, [sp, #0x230] */ ARM64("str x26, [sp, #0x230]");
    /* 0x00b6b65c: str      x26, [sp, #0x238] */ ARM64("str x26, [sp, #0x238]");
    /* 0x00b6b660: str      x20, [sp, #0x240] */ ARM64("str x20, [sp, #0x240]");
    /* 0x00b6b664: str      x8, [sp, #0x248] */ ARM64("str x8, [sp, #0x248]");
    /* 0x00b6b668: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6b66c: sub      x8, x8, x25 */ ARM64("sub x8, x8, x25");
    /* 0x00b6b670: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00b6b674: b.hi     #0xb6b6ac */ if (COND_HI) goto loc_00b6b6ac;
    /* 0x00b6b678: cbz      x24, #0xb6b690 */ if (x24 == 0) goto loc_00b6b690;
loc_00b6b67c:
    /* 0x00b6b67c: ldur     x8, [x29, #-0xb8] */ ARM64("ldur x8, [x29, #-0xb8]");
    /* 0x00b6b680: madd     x0, x25, x22, x8 */ ARM64("madd x0, x25, x22, x8");
    /* 0x00b6b684: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b6b688: mov      x2, x27 */ ARM64("mov x2, x27");
    /* 0x00b6b68c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
loc_00b6b690:
    /* 0x00b6b690: add      x25, x25, x24 */ ARM64("add x25, x25, x24");
    /* 0x00b6b694: stur     x25, [x29, #-0xb0] */ ARM64("stur x25, [x29, #-0xb0]");
    /* 0x00b6b698: str      x26, [sp, #0x248] */ ARM64("str x26, [sp, #0x248]");
    /* 0x00b6b69c: cbz      x20, #0xb6b56c */ if (x20 == 0) goto loc_00b6b56c;
    /* 0x00b6b6a0: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b6b6a4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6b6a8: b        #0xb6b56c */ goto loc_00b6b56c;
loc_00b6b6ac:
    /* 0x00b6b6ac: sub      x0, x29, #0xc0 */ ARM64("sub x0, x29, #0xc0");
    /* 0x00b6b6b0: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00b6b6b4: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b6b6b8: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b6b6bc: mov      w4, #0x108 */ ARM64("mov w4, #0x108");
    /* 0x00b6b6c0: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00b6b6c4: ldur     x25, [x29, #-0xb0] */ ARM64("ldur x25, [x29, #-0xb0]");
    /* 0x00b6b6c8: b        #0xb6b67c */ goto loc_00b6b67c;
loc_00b6b6cc:
    /* 0x00b6b6cc: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b6b6d0: cbz      x8, #0xb6b6dc */ if (x8 == 0) goto loc_00b6b6dc;
    /* 0x00b6b6d4: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6b6d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b6dc:
    /* 0x00b6b6dc: ldp      x20, x22, [x29, #-0xc0] */ ARM64("ldp x20, x22, [x29, #-0xc0]");
    /* 0x00b6b6e0: ldr      x0, [sp, #0x6a0] */ ARM64("ldr x0, [sp, #0x6a0]");
    /* 0x00b6b6e4: ldr      x1, [sp, #0x6a8] */ ARM64("ldr x1, [sp, #0x6a8]");
    /* 0x00b6b6e8: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00b6b6ec: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00b6b6f0: cbz      x8, #0xb6b6fc */ if (x8 == 0) goto loc_00b6b6fc;
    /* 0x00b6b6f4: ldur     x0, [x29, #-0xa0] */ ARM64("ldur x0, [x29, #-0xa0]");
    /* 0x00b6b6f8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6b6fc:
    /* 0x00b6b6fc: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b700: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b704: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6b708: b        #0xb6a8ac */ goto loc_00b6a8ac;
loc_00b6b70c:
    /* 0x00b6b70c: mov      x8, x15 */ ARM64("mov x8, x15");
    /* 0x00b6b710: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b6b714: add      x2, x2, #0x9a8 */ ARM64("add x2, x2, #0x9a8");
    /* 0x00b6b718: b        #0xb6b400 */ goto loc_00b6b400;
loc_00b6b71c:
    /* 0x00b6b71c: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b720: add      x0, x0, #0xda0 */ ARM64("add x0, x0, #0xda0");
    /* 0x00b6b724: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b728: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b72c:
    /* 0x00b6b72c: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b730: add      x0, x0, #0xcb0 */ ARM64("add x0, x0, #0xcb0");
    /* 0x00b6b734: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b738: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b73c:
    /* 0x00b6b73c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b6b740: b        #0xb6b750 */ goto loc_00b6b750;
loc_00b6b744:
    /* 0x00b6b744: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b6b748: add      x8, x8, #0x8c8 */ ARM64("add x8, x8, #0x8c8");
    /* 0x00b6b74c: str      x8, [sp, #0xa0] */ ARM64("str x8, [sp, #0xa0]");
loc_00b6b750:
    /* 0x00b6b750: ldr      x1, [sp, #0x178] */ ARM64("ldr x1, [sp, #0x178]");
    /* 0x00b6b754: ldr      x2, [sp, #0xa0] */ ARM64("ldr x2, [sp, #0xa0]");
    /* 0x00b6b758: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b6b75c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b760:
    /* 0x00b6b760: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b6b764: add      x0, x0, #0xf40 */ ARM64("add x0, x0, #0xf40");
    /* 0x00b6b768: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b76c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b770:
    /* 0x00b6b770: mov      x0, x10 */ ARM64("mov x0, x10");
    /* 0x00b6b774: mov      x27, x22 */ ARM64("mov x27, x22");
    /* 0x00b6b778: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b6b77c: add      x8, x8, #0x910 */ ARM64("add x8, x8, #0x910");
    /* 0x00b6b780: b        #0xb6b790 */ goto loc_00b6b790;
loc_00b6b784:
    /* 0x00b6b784: mov      x0, x10 */ ARM64("mov x0, x10");
    /* 0x00b6b788: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b6b78c: add      x8, x8, #0x940 */ ARM64("add x8, x8, #0x940");
loc_00b6b790:
    /* 0x00b6b790: str      x8, [sp, #0x98] */ ARM64("str x8, [sp, #0x98]");
loc_00b6b794:
    /* 0x00b6b794: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b6b798: ldr      x2, [sp, #0x98] */ ARM64("ldr x2, [sp, #0x98]");
    /* 0x00b6b79c: ldr      x24, [sp, #0x178] */ ARM64("ldr x24, [sp, #0x178]");
    /* 0x00b6b7a0: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6b7a4: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b6b7a8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b7ac:
    /* 0x00b6b7ac: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6b7b0: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b7b4: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b6b7b8: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00b6b7bc: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00b6b7c0: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b6b7c4: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b7c8: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b7cc: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
loc_00b6b7d0:
    /* 0x00b6b7d0: ldr      x1, [x20, x22, lsl #3] */ ARM64("ldr x1, [x20, x22, lsl #3]");
loc_00b6b7d4:
    /* 0x00b6b7d4: ldxr     x8, [x1] */ ARM64("ldxr x8, [x1]");
    /* 0x00b6b7d8: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b6b7dc: stxr     w10, x9, [x1] */ ARM64("stxr w10, x9, [x1]");
    /* 0x00b6b7e0: cbnz     w10, #0xb6b7d4 */ if (w10 != 0) goto loc_00b6b7d4;
    /* 0x00b6b7e4: tbnz     x8, #0x3f, #0xb6b800 */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00b6b800;
    /* 0x00b6b7e8: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6b7ec: bl       #0xc014cc */ CALL_DIRECT(sub_00c014cc);
    /* 0x00b6b7f0: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b6b7f4: cmp      x22, x21 */ ARM64("cmp x22, x21");
    /* 0x00b6b7f8: b.ne     #0xb6b7d0 */ if (COND_NE) goto loc_00b6b7d0;
    /* 0x00b6b7fc: b        #0xb69fec */ goto loc_00b69fec;
loc_00b6b800:
    /* 0x00b6b800: bl       #0xc769bc */ CALL_DIRECT(sub_00c769bc);
loc_00b6b804:
    /* 0x00b6b804: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b6b808: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b6b80c: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b6b810: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6b814: ldrb     w10, [x23, #0x10] */ ARM64("ldrb w10, [x23, #0x10]");
    /* 0x00b6b818: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b81c: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b820: b        #0xb6a04c */ goto loc_00b6a04c;
loc_00b6b824:
    /* 0x00b6b824: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b6b828: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b6b82c: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b6b830: ldr      x23, [sp, #0x158] */ ARM64("ldr x23, [sp, #0x158]");
    /* 0x00b6b834: ldp      x9, x8, [x23] */ ARM64("ldp x9, x8, [x23]");
    /* 0x00b6b838: add      x26, sp, #0x210 */ ARM64("add x26, sp, #0x210");
    /* 0x00b6b83c: add      x28, sp, #0x550 */ ARM64("add x28, sp, #0x550");
    /* 0x00b6b840: b        #0xb6a08c */ goto loc_00b6a08c;
loc_00b6b844:
    /* 0x00b6b844: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b848: add      x0, x0, #0xcb0 */ ARM64("add x0, x0, #0xcb0");
    /* 0x00b6b84c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b850: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b854:
    /* 0x00b6b854: adrp     x8, #0xefa000 */ ARM64("adrp x8, #0xefa000");
    /* 0x00b6b858: add      x8, x8, #0x478 */ ARM64("add x8, x8, #0x478");
    /* 0x00b6b85c: adrp     x9, #0xbe7000 */ ARM64("adrp x9, #0xbe7000");
    /* 0x00b6b860: add      x9, x9, #0x66c */ ARM64("add x9, x9, #0x66c");
    /* 0x00b6b864: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6b868: str      x9, [sp, #0x238] */ ARM64("str x9, [sp, #0x238]");
    /* 0x00b6b86c: adrp     x0, #0xcba000 */ ARM64("adrp x0, #0xcba000");
    /* 0x00b6b870: add      x0, x0, #0x67f */ ARM64("add x0, x0, #0x67f");
    /* 0x00b6b874: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00b6b878: add      x2, x2, #0x488 */ ARM64("add x2, x2, #0x488");
    /* 0x00b6b87c: add      x1, sp, #0x230 */ ARM64("add x1, sp, #0x230");
    /* 0x00b6b880: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
    /* 0x00b6b884: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b888:
    /* 0x00b6b888: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b88c: add      x0, x0, #0xcb0 */ ARM64("add x0, x0, #0xcb0");
    /* 0x00b6b890: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b894: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b898:
    /* 0x00b6b898: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6b89c: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6b8a0: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b6b8a4: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00b6b8a8: b        #0xb6a9b0 */ goto loc_00b6a9b0;
loc_00b6b8ac:
    /* 0x00b6b8ac: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b8b0: add      x0, x0, #0xe18 */ ARM64("add x0, x0, #0xe18");
    /* 0x00b6b8b4: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b8b8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b8bc:
    /* 0x00b6b8bc: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b6b8c0: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00b6b8c4: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b6b8c8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b8cc:
    /* 0x00b6b8cc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b6b8d0: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b6b8d4: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b6b8d8: b        #0xb6a918 */ goto loc_00b6a918;
loc_00b6b8dc:
    /* 0x00b6b8dc: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b8e0: add      x0, x0, #0xdb8 */ ARM64("add x0, x0, #0xdb8");
    /* 0x00b6b8e4: b        #0xb6b8f0 */ goto loc_00b6b8f0;
loc_00b6b8e8:
    /* 0x00b6b8e8: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b8ec: add      x0, x0, #0xdd0 */ ARM64("add x0, x0, #0xdd0");
loc_00b6b8f0:
    /* 0x00b6b8f0: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b8f4: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b8f8:
    /* 0x00b6b8f8: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b8fc: add      x0, x0, #0xde8 */ ARM64("add x0, x0, #0xde8");
    /* 0x00b6b900: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b904: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b908:
    /* 0x00b6b908: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b6b90c: mov      w1, #4 */ ARM64("mov w1, #4");
    /* 0x00b6b910: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b6b914: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b918:
    /* 0x00b6b918: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b6b91c: add      x0, x0, #0xeb0 */ ARM64("add x0, x0, #0xeb0");
    /* 0x00b6b920: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b924: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b928:
    /* 0x00b6b928: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00b6b92c: add      x0, x0, #0xe00 */ ARM64("add x0, x0, #0xe00");
    /* 0x00b6b930: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b934: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b938:
    /* 0x00b6b938: str      x21, [sp, #0xe8] */ ARM64("str x21, [sp, #0xe8]");
    /* 0x00b6b93c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b6b940: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6b944: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
    /* 0x00b6b948: b        #0xb69f1c */ goto loc_00b69f1c;
loc_00b6b94c:
    /* 0x00b6b94c: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00b6b950: sub      x0, x24, #1 */ ARM64("sub x0, x24, #1");
    /* 0x00b6b954: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b6b958: add      x8, x8, #0x8f8 */ ARM64("add x8, x8, #0x8f8");
    /* 0x00b6b95c: str      x8, [sp, #0x98] */ ARM64("str x8, [sp, #0x98]");
    /* 0x00b6b960: mov      w21, #8 */ ARM64("mov w21, #8");
    /* 0x00b6b964: str      xzr, [sp, #0x178] */ ARM64("str xzr, [sp, #0x178]");
    /* 0x00b6b968: b        #0xb6b794 */ goto loc_00b6b794;
loc_00b6b96c:
    /* 0x00b6b96c: adrp     x4, #0xefb000 */ ARM64("adrp x4, #0xefb000");
    /* 0x00b6b970: add      x4, x4, #0xe30 */ ARM64("add x4, x4, #0xe30");
    /* 0x00b6b974: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6b978: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00b6b97c: mov      x3, x1 */ ARM64("mov x3, x1");
    /* 0x00b6b980: bl       #0xc73cc8 */ CALL_DIRECT(sub_00c73cc8);
    /* 0x00b6b984: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b988:
    /* 0x00b6b988: ldr      x1, [sp, #0x240] */ ARM64("ldr x1, [sp, #0x240]");
    /* 0x00b6b98c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b6b990: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b6b994: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b998:
    /* 0x00b6b998: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b6b99c: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00b6b9a0: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b6b9a4: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b9a8:
    /* 0x00b6b9a8: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b6b9ac: add      x8, x8, #0xf28 */ ARM64("add x8, x8, #0xf28");
    /* 0x00b6b9b0: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
loc_00b6b9b4:
    /* 0x00b6b9b4: ldr      x0, [sp, #0x90] */ ARM64("ldr x0, [sp, #0x90]");
    /* 0x00b6b9b8: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b9bc: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b9c0:
    /* 0x00b6b9c0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b6b9c4: str      x26, [sp, #0x18] */ ARM64("str x26, [sp, #0x18]");
    /* 0x00b6b9c8: mov      x28, x21 */ ARM64("mov x28, x21");
    /* 0x00b6b9cc: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
loc_00b6b9d0:
    /* 0x00b6b9d0: ldr      x1, [sp, #0x18] */ ARM64("ldr x1, [sp, #0x18]");
    /* 0x00b6b9d4: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b6b9d8: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6b9dc:
    /* 0x00b6b9dc: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b6b9e0: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b6b9e4: add      x8, sp, #0x5a0 */ ARM64("add x8, sp, #0x5a0");
    /* 0x00b6b9e8: ldr      x9, [sp, #0x60] */ ARM64("ldr x9, [sp, #0x60]");
    /* 0x00b6b9ec: b        #0xb69f58 */ goto loc_00b69f58;
loc_00b6b9f0:
    /* 0x00b6b9f0: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b6b9f4: add      x0, x0, #0xf58 */ ARM64("add x0, x0, #0xf58");
    /* 0x00b6b9f8: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b6b9fc: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6ba00:
    /* 0x00b6ba00: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b6ba04: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00b6ba08: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b6ba0c: b        #0xb6ba48 */ goto loc_00b6ba48;
loc_00b6ba10:
    /* 0x00b6ba10: clrex     */ ARM64("clrex");
loc_00b6ba14:
    /* 0x00b6ba14: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b6ba18: bl       #0xc7573c */ CALL_DIRECT(sub_00c7573c);
    /* 0x00b6ba1c: b        #0xb6b214 */ goto loc_00b6b214;
loc_00b6ba20:
    /* 0x00b6ba20: str      x21, [sp, #0x230] */ ARM64("str x21, [sp, #0x230]");
    /* 0x00b6ba24: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00b6ba28: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00b6ba2c: adrp     x3, #0xef7000 */ ARM64("adrp x3, #0xef7000");
    /* 0x00b6ba30: add      x3, x3, #0xdf8 */ ARM64("add x3, x3, #0xdf8");
    /* 0x00b6ba34: adrp     x4, #0xef7000 */ ARM64("adrp x4, #0xef7000");
    /* 0x00b6ba38: add      x4, x4, #0xdc8 */ ARM64("add x4, x4, #0xdc8");
    /* 0x00b6ba3c: add      x2, sp, #0x230 */ ARM64("add x2, sp, #0x230");
    /* 0x00b6ba40: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00b6ba44: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
loc_00b6ba48:
    /* 0x00b6ba48: brk      #1 */ ARM64("brk #1");
loc_00b6ba4c:
    /* 0x00b6ba4c: clrex     */ ARM64("clrex");
    /* 0x00b6ba50: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b6ba54: bl       #0xc75418 */ CALL_DIRECT(sub_00c75418);
    /* 0x00b6ba58: b        #0xb6b304 */ goto loc_00b6b304;
    /* 0x00b6ba5c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6ba60: b        #0xb6c324 */ goto loc_00b6c324;
    /* 0x00b6ba64: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6ba68: b        #0xb6bd48 */ goto loc_00b6bd48;
    /* 0x00b6ba6c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6ba70: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6ba74: bl       #0xb65c48 */ CALL_DIRECT(sub_00b65c48);
    /* 0x00b6ba78: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b6ba7c: add      x0, x0, #0x958 */ ARM64("add x0, x0, #0x958");
    /* 0x00b6ba80: bl       #0xbfbdf8 */ CALL_DIRECT(sub_00bfbdf8);
    /* 0x00b6ba84: b        #0xb6bd48 */ goto loc_00b6bd48;
    /* 0x00b6ba88: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6ba8c: b        #0xb6bd14 */ goto loc_00b6bd14;
    /* 0x00b6ba90: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6ba94: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6ba98: bl       #0xbd4c28 */ CALL_DIRECT(sub_00bd4c28);
    /* 0x00b6ba9c: b        #0xb6baa4 */ goto loc_00b6baa4;
    /* 0x00b6baa0: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6baa4:
    /* 0x00b6baa4: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b6baa8: add      x0, x0, #0x958 */ ARM64("add x0, x0, #0x958");
    /* 0x00b6baac: bl       #0xb9a464 */ CALL_DIRECT(sub_00b9a464);
    /* 0x00b6bab0: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b6bab4: bl       #0xb9a694 */ CALL_DIRECT(sub_00b9a694);
    /* 0x00b6bab8: b        #0xb6bc58 */ goto loc_00b6bc58;
    /* 0x00b6babc: b        #0xb6bac0 */ goto loc_00b6bac0;
loc_00b6bac0:
    /* 0x00b6bac0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bac4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bac8: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
    /* 0x00b6bacc: add      x0, sp, #0x1c0 */ ARM64("add x0, sp, #0x1c0");
    /* 0x00b6bad0: bl       #0xb65b48 */ CALL_DIRECT(sub_00b65b48);
    /* 0x00b6bad4: b        #0xb6bca0 */ goto loc_00b6bca0;
    /* 0x00b6bad8: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6badc: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bae0: bl       #0xc397b0 */ CALL_DIRECT(sub_00c397b0);
    /* 0x00b6bae4: b        #0xb6be90 */ goto loc_00b6be90;
    /* 0x00b6bae8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6baec: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6baf0: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6baf4: bl       #0xc1629c */ CALL_DIRECT(sub_00c1629c);
    /* 0x00b6baf8: b        #0xb6bbcc */ goto loc_00b6bbcc;
    /* 0x00b6bafc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bb00: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb04: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bb08: bl       #0xc010e0 */ CALL_DIRECT(sub_00c010e0);
    /* 0x00b6bb0c: b        #0xb6bff8 */ goto loc_00b6bff8;
    /* 0x00b6bb10: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bb14: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb18: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6bb1c: bl       #0xc0e524 */ CALL_DIRECT(sub_00c0e524);
    /* 0x00b6bb20: b        #0xb6c168 */ goto loc_00b6c168;
    /* 0x00b6bb24: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb28: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bb2c: bl       #0xc397b0 */ CALL_DIRECT(sub_00c397b0);
    /* 0x00b6bb30: b        #0xb6c24c */ goto loc_00b6c24c;
    /* 0x00b6bb34: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bb38: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb3c: b        #0xb6c214 */ goto loc_00b6c214;
    /* 0x00b6bb40: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb44: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bb48: bl       #0xc1629c */ CALL_DIRECT(sub_00c1629c);
    /* 0x00b6bb4c: b        #0xb6c214 */ goto loc_00b6c214;
    /* 0x00b6bb50: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bb54: b        #0xb6c1e0 */ goto loc_00b6c1e0;
    /* 0x00b6bb58: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb5c: cbnz     x24, #0xb6c0d0 */ if (x24 != 0) goto loc_00b6c0d0;
    /* 0x00b6bb60: b        #0xb6c0d8 */ goto loc_00b6c0d8;
    /* 0x00b6bb64: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb68: cbnz     x24, #0xb6bb74 */ if (x24 != 0) goto loc_00b6bb74;
    /* 0x00b6bb6c: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6bb70: b        #0xb6c194 */ goto loc_00b6c194;
loc_00b6bb74:
    /* 0x00b6bb74: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6bb78: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6bb7c: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6bb80: b        #0xb6c194 */ goto loc_00b6c194;
    /* 0x00b6bb84: b        #0xb6bb88 */ goto loc_00b6bb88;
loc_00b6bb88:
    /* 0x00b6bb88: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bb8c: ldr      x0, [sp, #0x230] */ ARM64("ldr x0, [sp, #0x230]");
    /* 0x00b6bb90: ldr      x1, [sp, #0x238] */ ARM64("ldr x1, [sp, #0x238]");
    /* 0x00b6bb94: bl       #0xbfc140 */ CALL_DIRECT(sub_00bfc140);
    /* 0x00b6bb98: b        #0xb6bba0 */ goto loc_00b6bba0;
    /* 0x00b6bb9c: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bba0:
    /* 0x00b6bba0: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bba4: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b6bba8: b        #0xb6c53c */ goto loc_00b6c53c;
    /* 0x00b6bbac: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bbb0: b        #0xb6c548 */ goto loc_00b6c548;
    /* 0x00b6bbb4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bbb8: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bbbc: bl       #0xbe66c0 */ CALL_DIRECT(sub_00be66c0);
    /* 0x00b6bbc0: b        #0xb6bfb0 */ goto loc_00b6bfb0;
    /* 0x00b6bbc4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bbc8: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bbcc:
    /* 0x00b6bbcc: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6bbd0: bl       #0xc168cc */ CALL_DIRECT(sub_00c168cc);
    /* 0x00b6bbd4: b        #0xb6be90 */ goto loc_00b6be90;
    /* 0x00b6bbd8: b        #0xb6c394 */ goto loc_00b6c394;
    /* 0x00b6bbdc: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bbe0: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6bbe4: cbz      x8, #0xb6c314 */ if (x8 == 0) goto loc_00b6c314;
    /* 0x00b6bbe8: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b6bbec: b        #0xb6c310 */ goto loc_00b6c310;
    /* 0x00b6bbf0: b        #0xb6be8c */ goto loc_00b6be8c;
    /* 0x00b6bbf4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bbf8: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
loc_00b6bbfc:
    /* 0x00b6bbfc: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b6bc00: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b6bc04: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b6bc08: cbnz     w10, #0xb6bbfc */ if (w10 != 0) goto loc_00b6bbfc;
    /* 0x00b6bc0c: b.ne     #0xb6bdb4 */ if (COND_NE) goto loc_00b6bdb4;
    /* 0x00b6bc10: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6bc14: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bc18: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b6bc1c: b        #0xb6bdb4 */ goto loc_00b6bdb4;
    /* 0x00b6bc20: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bc24: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bc28: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6bc2c: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
    /* 0x00b6bc30: b        #0xb6bd48 */ goto loc_00b6bd48;
    /* 0x00b6bc34: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bc38: b        #0xb6c31c */ goto loc_00b6c31c;
    /* 0x00b6bc3c: b        #0xb6bf68 */ goto loc_00b6bf68;
    /* 0x00b6bc40: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bc44: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6bc48: bl       #0xc2b714 */ CALL_DIRECT(sub_00c2b714);
    /* 0x00b6bc4c: b        #0xb6c214 */ goto loc_00b6c214;
    /* 0x00b6bc50: b        #0xb6c0c4 */ goto loc_00b6c0c4;
    /* 0x00b6bc54: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bc58:
    /* 0x00b6bc58: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b6bc5c: add      x0, x0, #0x958 */ ARM64("add x0, x0, #0x958");
    /* 0x00b6bc60: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00b6bc64: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b6bc68: add      x0, x0, #0x958 */ ARM64("add x0, x0, #0x958");
    /* 0x00b6bc6c: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00b6bc70: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6bc74: bl       #0xb9a148 */ CALL_DIRECT(sub_00b9a148);
    /* 0x00b6bc78: b        #0xb6bc80 */ goto loc_00b6bc80;
    /* 0x00b6bc7c: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bc80:
    /* 0x00b6bc80: sub      x0, x29, #0xe0 */ ARM64("sub x0, x29, #0xe0");
    /* 0x00b6bc84: bl       #0xb9a264 */ CALL_DIRECT(sub_00b9a264);
    /* 0x00b6bc88: b        #0xb6bc90 */ goto loc_00b6bc90;
    /* 0x00b6bc8c: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bc90:
    /* 0x00b6bc90: add      x0, sp, #0x680 */ ARM64("add x0, sp, #0x680");
    /* 0x00b6bc94: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
    /* 0x00b6bc98: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6bc9c: bl       #0xb9f9c8 */ CALL_DIRECT(sub_00b9f9c8);
loc_00b6bca0:
    /* 0x00b6bca0: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00b6bca4: b        #0xb6c54c */ goto loc_00b6c54c;
    /* 0x00b6bca8: b        #0xb6bef4 */ goto loc_00b6bef4;
    /* 0x00b6bcac: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bcb0:
    /* 0x00b6bcb0: subs     x24, x24, #1 */ ARM64("subs x24, x24, #1");
    /* 0x00b6bcb4: b.eq     #0xb6bccc */ if (COND_EQ) goto loc_00b6bccc;
    /* 0x00b6bcb8: add      x20, x21, #0x108 */ ARM64("add x20, x21, #0x108");
    /* 0x00b6bcbc: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6bcc0: bl       #0xc3896c */ CALL_DIRECT(sub_00c3896c);
    /* 0x00b6bcc4: mov      x21, x20 */ ARM64("mov x21, x20");
    /* 0x00b6bcc8: b        #0xb6bcb0 */ goto loc_00b6bcb0;
loc_00b6bccc:
    /* 0x00b6bccc: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6bcd0: bl       #0xc3497c */ CALL_DIRECT(sub_00c3497c);
    /* 0x00b6bcd4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bcd8: bl       #0xc397b0 */ CALL_DIRECT(sub_00c397b0);
    /* 0x00b6bcdc: b        #0xb6c314 */ goto loc_00b6c314;
    /* 0x00b6bce0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bce4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bce8: b        #0xb6befc */ goto loc_00b6befc;
    /* 0x00b6bcec: b        #0xb6bed4 */ goto loc_00b6bed4;
    /* 0x00b6bcf0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bcf4: b        #0xb6bfb4 */ goto loc_00b6bfb4;
    /* 0x00b6bcf8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bcfc: b        #0xb6bf68 */ goto loc_00b6bf68;
    /* 0x00b6bd00: b        #0xb6bf40 */ goto loc_00b6bf40;
    /* 0x00b6bd04: b        #0xb6c0b0 */ goto loc_00b6c0b0;
    /* 0x00b6bd08: b        #0xb6c444 */ goto loc_00b6c444;
    /* 0x00b6bd0c: b        #0xb6c0b0 */ goto loc_00b6c0b0;
    /* 0x00b6bd10: b        #0xb6bd14 */ goto loc_00b6bd14;
loc_00b6bd14:
    /* 0x00b6bd14: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bd18: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bd1c: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
loc_00b6bd20:
    /* 0x00b6bd20: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b6bd24: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b6bd28: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b6bd2c: cbnz     w9, #0xb6bd20 */ if (w9 != 0) goto loc_00b6bd20;
    /* 0x00b6bd30: b.ne     #0xb6bd40 */ if (COND_NE) goto loc_00b6bd40;
    /* 0x00b6bd34: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6bd38: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b6bd3c: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b6bd40:
    /* 0x00b6bd40: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bd44: bl       #0xb66664 */ CALL_DIRECT(sub_00b66664);
loc_00b6bd48:
    /* 0x00b6bd48: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b6bd4c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b6bd50: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b6bd54: cbnz     w9, #0xb6bd48 */ if (w9 != 0) goto loc_00b6bd48;
    /* 0x00b6bd58: b.ne     #0xb6c31c */ if (COND_NE) goto loc_00b6c31c;
    /* 0x00b6bd5c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6bd60: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6bd64: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b6bd68: b        #0xb6c31c */ goto loc_00b6c31c;
    /* 0x00b6bd6c: b        #0xb6bed4 */ goto loc_00b6bed4;
    /* 0x00b6bd70: add      x25, sp, #0x550 */ ARM64("add x25, sp, #0x550");
    /* 0x00b6bd74: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bd78:
    /* 0x00b6bd78: subs     x22, x22, #1 */ ARM64("subs x22, x22, #1");
    /* 0x00b6bd7c: b.eq     #0xb6bd94 */ if (COND_EQ) goto loc_00b6bd94;
    /* 0x00b6bd80: add      x24, x21, #0x108 */ ARM64("add x24, x21, #0x108");
    /* 0x00b6bd84: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6bd88: bl       #0xbfe1e8 */ CALL_DIRECT(sub_00bfe1e8);
    /* 0x00b6bd8c: mov      x21, x24 */ ARM64("mov x21, x24");
    /* 0x00b6bd90: b        #0xb6bd78 */ goto loc_00b6bd78;
loc_00b6bd94:
    /* 0x00b6bd94: ldur     x8, [x19, #0x28] */ ARM64("ldur x8, [x19, #0x28]");
    /* 0x00b6bd98: cbz      x8, #0xb6bda4 */ if (x8 == 0) goto loc_00b6bda4;
    /* 0x00b6bd9c: ldr      x0, [x19, #0x30] */ ARM64("ldr x0, [x19, #0x30]");
    /* 0x00b6bda0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6bda4:
    /* 0x00b6bda4: ldr      q0, [x25, #0x50] */ ARM64("ldr q0, [x25, #0x50]");
    /* 0x00b6bda8: stur     q0, [x19, #0x28] */ ARM64("stur q0, [x19, #0x28]");
    /* 0x00b6bdac: ldr      x8, [sp, #0x5b0] */ ARM64("ldr x8, [sp, #0x5b0]");
    /* 0x00b6bdb0: stur     x8, [x19, #0x38] */ ARM64("stur x8, [x19, #0x38]");
loc_00b6bdb4:
    /* 0x00b6bdb4: ldxrb    w8, [x20] */ ARM64("ldxrb w8, [x20]");
    /* 0x00b6bdb8: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b6bdbc: b.ne     #0xb6bdcc */ if (COND_NE) goto loc_00b6bdcc;
    /* 0x00b6bdc0: stlxrb   w8, wzr, [x20] */ ARM64("stlxrb w8, wzr, [x20]");
    /* 0x00b6bdc4: cbz      w8, #0xb6c31c */ if (w8 == 0) goto loc_00b6c31c;
    /* 0x00b6bdc8: b        #0xb6bdb4 */ goto loc_00b6bdb4;
loc_00b6bdcc:
    /* 0x00b6bdcc: clrex     */ ARM64("clrex");
    /* 0x00b6bdd0: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b6bdd4: bl       #0xc75418 */ CALL_DIRECT(sub_00c75418);
    /* 0x00b6bdd8: b        #0xb6c31c */ goto loc_00b6c31c;
    /* 0x00b6bddc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bde0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bde4: b        #0xb6c214 */ goto loc_00b6c214;
    /* 0x00b6bde8: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bdec: b        #0xb6c418 */ goto loc_00b6c418;
    /* 0x00b6bdf0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bdf4: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bdf8: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00b6bdfc: b        #0xb6c418 */ goto loc_00b6c418;
    /* 0x00b6be00: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be04: b        #0xb6bf8c */ goto loc_00b6bf8c;
    /* 0x00b6be08: b        #0xb6c394 */ goto loc_00b6c394;
    /* 0x00b6be0c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be10: ldr      x8, [sp, #0x2c0] */ ARM64("ldr x8, [sp, #0x2c0]");
    /* 0x00b6be14: cbz      x8, #0xb6bfd4 */ if (x8 == 0) goto loc_00b6bfd4;
    /* 0x00b6be18: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6be1c: add      x0, x8, #0x90 */ ARM64("add x0, x8, #0x90");
    /* 0x00b6be20: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
    /* 0x00b6be24: b        #0xb6bfd4 */ goto loc_00b6bfd4;
    /* 0x00b6be28: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6be2c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be30: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6be34: bl       #0xc0e3bc */ CALL_DIRECT(sub_00c0e3bc);
    /* 0x00b6be38: b        #0xb6c13c */ goto loc_00b6c13c;
    /* 0x00b6be3c: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6be40:
    /* 0x00b6be40: subs     x25, x25, #1 */ ARM64("subs x25, x25, #1");
    /* 0x00b6be44: b.eq     #0xb6be5c */ if (COND_EQ) goto loc_00b6be5c;
    /* 0x00b6be48: add      x20, x24, #0x108 */ ARM64("add x20, x24, #0x108");
    /* 0x00b6be4c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b6be50: bl       #0xb9a8fc */ CALL_DIRECT(sub_00b9a8fc);
    /* 0x00b6be54: mov      x24, x20 */ ARM64("mov x24, x20");
    /* 0x00b6be58: b        #0xb6be40 */ goto loc_00b6be40;
loc_00b6be5c:
    /* 0x00b6be5c: cbz      x21, #0xb6c090 */ if (x21 == 0) goto loc_00b6c090;
    /* 0x00b6be60: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6be64: b        #0xb6c09c */ goto loc_00b6c09c;
    /* 0x00b6be68: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6be6c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be70: b        #0xb6c140 */ goto loc_00b6c140;
    /* 0x00b6be74: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be78: b        #0xb6c418 */ goto loc_00b6c418;
    /* 0x00b6be7c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be80: b        #0xb6c170 */ goto loc_00b6c170;
    /* 0x00b6be84: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6be88: b        #0xb6bfd8 */ goto loc_00b6bfd8;
loc_00b6be8c:
    /* 0x00b6be8c: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6be90:
    /* 0x00b6be90: ldr      x8, [sp, #0x180] */ ARM64("ldr x8, [sp, #0x180]");
    /* 0x00b6be94: cbnz     x8, #0xb6c244 */ if (x8 != 0) goto loc_00b6c244;
    /* 0x00b6be98: b        #0xb6c24c */ goto loc_00b6c24c;
    /* 0x00b6be9c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bea0: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bea4: bl       #0xbd989c */ CALL_DIRECT(sub_00bd989c);
    /* 0x00b6bea8: b        #0xb6c3dc */ goto loc_00b6c3dc;
    /* 0x00b6beac: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6beb0: ldr      x8, [sp, #0x6a0] */ ARM64("ldr x8, [sp, #0x6a0]");
    /* 0x00b6beb4: cbz      x8, #0xb6c3dc */ if (x8 == 0) goto loc_00b6c3dc;
    /* 0x00b6beb8: ldr      x0, [sp, #0x6a8] */ ARM64("ldr x0, [sp, #0x6a8]");
    /* 0x00b6bebc: b        #0xb6c3d8 */ goto loc_00b6c3d8;
    /* 0x00b6bec0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bec4: b        #0xb6c3dc */ goto loc_00b6c3dc;
    /* 0x00b6bec8: b        #0xb6c394 */ goto loc_00b6c394;
    /* 0x00b6becc: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bed0: b        #0xb6c408 */ goto loc_00b6c408;
loc_00b6bed4:
    /* 0x00b6bed4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bed8: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6bedc: b        #0xb6c408 */ goto loc_00b6c408;
    /* 0x00b6bee0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bee4: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bee8: bl       #0xb65dc4 */ CALL_DIRECT(sub_00b65dc4);
    /* 0x00b6beec: b        #0xb6c31c */ goto loc_00b6c31c;
    /* 0x00b6bef0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6bef4:
    /* 0x00b6bef4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bef8: b        #0xb6c24c */ goto loc_00b6c24c;
loc_00b6befc:
    /* 0x00b6befc: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf00: cbz      x21, #0xb6c0b4 */ if (x21 == 0) goto loc_00b6c0b4;
    /* 0x00b6bf04: lsl      x8, x21, #3 */ ARM64("lsl x8, x21, #3");
    /* 0x00b6bf08: add      x9, x8, x21 */ ARM64("add x9, x8, x21");
    /* 0x00b6bf0c: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6bf10: b.eq     #0xb6c0b4 */ if (COND_EQ) goto loc_00b6c0b4;
    /* 0x00b6bf14: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00b6bf18: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6bf1c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6bf20: b        #0xb6c0b4 */ goto loc_00b6c0b4;
    /* 0x00b6bf24: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf28: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b6bf2c: cbz      x8, #0xb6c090 */ if (x8 == 0) goto loc_00b6c090;
    /* 0x00b6bf30: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b6bf34: b        #0xb6c09c */ goto loc_00b6c09c;
    /* 0x00b6bf38: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf3c: b        #0xb6c288 */ goto loc_00b6c288;
loc_00b6bf40:
    /* 0x00b6bf40: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf44: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6bf48: bl       #0xbb29c8 */ CALL_DIRECT(sub_00bb29c8);
    /* 0x00b6bf4c: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6bf50: b        #0xb6bfb4 */ goto loc_00b6bfb4;
    /* 0x00b6bf54: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf58: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6bf5c: bl       #0xc14ff4 */ CALL_DIRECT(sub_00c14ff4);
    /* 0x00b6bf60: b        #0xb6c31c */ goto loc_00b6c31c;
    /* 0x00b6bf64: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6bf68:
    /* 0x00b6bf68: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf6c: b        #0xb6c314 */ goto loc_00b6c314;
    /* 0x00b6bf70: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf74: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00b6bf78: b        #0xb6c134 */ goto loc_00b6c134;
    /* 0x00b6bf7c: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bf80: str      x20, [sp, #0x688] */ ARM64("str x20, [sp, #0x688]");
    /* 0x00b6bf84: add      x0, sp, #0x680 */ ARM64("add x0, sp, #0x680");
    /* 0x00b6bf88: bl       #0xc055f8 */ CALL_DIRECT(sub_00c055f8);
loc_00b6bf8c:
    /* 0x00b6bf8c: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00b6bf90: cbz      x8, #0xb6c13c */ if (x8 == 0) goto loc_00b6c13c;
    /* 0x00b6bf94: add      x8, sp, #0x1c0 */ ARM64("add x8, sp, #0x1c0");
    /* 0x00b6bf98: add      x0, x8, #0x20 */ ARM64("add x0, x8, #0x20");
    /* 0x00b6bf9c: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
    /* 0x00b6bfa0: b        #0xb6c13c */ goto loc_00b6c13c;
    /* 0x00b6bfa4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bfa8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bfac: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6bfb0:
    /* 0x00b6bfb0: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
loc_00b6bfb4:
    /* 0x00b6bfb4: sub      x0, x29, #0x88 */ ARM64("sub x0, x29, #0x88");
    /* 0x00b6bfb8: bl       #0xbb2a74 */ CALL_DIRECT(sub_00bb2a74);
    /* 0x00b6bfbc: b        #0xb6c408 */ goto loc_00b6c408;
    /* 0x00b6bfc0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6bfc4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6bfc8: str      x21, [sp, #0x558] */ ARM64("str x21, [sp, #0x558]");
    /* 0x00b6bfcc: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6bfd0: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
loc_00b6bfd4:
    /* 0x00b6bfd4: mov      w20, #1 */ ARM64("mov w20, #1");
loc_00b6bfd8:
    /* 0x00b6bfd8: cbz      w20, #0xb6bff8 */ if (w20 == 0) goto loc_00b6bff8;
    /* 0x00b6bfdc: ldr      x8, [sp, #0x278] */ ARM64("ldr x8, [sp, #0x278]");
    /* 0x00b6bfe0: mov      x9, #-0x7fffffffffffffff */ ARM64("mov x9, #-0x7fffffffffffffff");
    /* 0x00b6bfe4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b6bfe8: b.eq     #0xb6bff8 */ if (COND_EQ) goto loc_00b6bff8;
    /* 0x00b6bfec: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6bff0: add      x0, x8, #0x48 */ ARM64("add x0, x8, #0x48");
    /* 0x00b6bff4: bl       #0xb99af8 */ CALL_DIRECT(sub_00b99af8);
loc_00b6bff8:
    /* 0x00b6bff8: sub      x0, x29, #0xe0 */ ARM64("sub x0, x29, #0xe0");
    /* 0x00b6bffc: bl       #0xb9a794 */ CALL_DIRECT(sub_00b9a794);
    /* 0x00b6c000: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00b6c004: b        #0xb6c584 */ goto loc_00b6c584;
    /* 0x00b6c008: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c00c: b        #0xb6c0b0 */ goto loc_00b6c0b0;
    /* 0x00b6c010: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c014: mov      w20, #0x48 */ ARM64("mov w20, #0x48");
    /* 0x00b6c018: b        #0xb6c024 */ goto loc_00b6c024;
loc_00b6c01c:
    /* 0x00b6c01c: add      x0, x27, #8 */ ARM64("add x0, x27, #8");
    /* 0x00b6c020: bl       #0xb9b2c4 */ CALL_DIRECT(sub_00b9b2c4);
loc_00b6c024:
    /* 0x00b6c024: cmp      x25, x28 */ ARM64("cmp x25, x28");
    /* 0x00b6c028: b.eq     #0xb6c05c */ if (COND_EQ) goto loc_00b6c05c;
    /* 0x00b6c02c: madd     x27, x25, x20, x26 */ ARM64("madd x27, x25, x20, x26");
    /* 0x00b6c030: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b6c034: ldr      x8, [x27] */ ARM64("ldr x8, [x27]");
loc_00b6c038:
    /* 0x00b6c038: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b6c03c: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b6c040: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b6c044: cbnz     w10, #0xb6c038 */ if (w10 != 0) goto loc_00b6c038;
    /* 0x00b6c048: b.ne     #0xb6c01c */ if (COND_NE) goto loc_00b6c01c;
    /* 0x00b6c04c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6c050: ldr      x0, [x27] */ ARM64("ldr x0, [x27]");
    /* 0x00b6c054: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b6c058: b        #0xb6c01c */ goto loc_00b6c01c;
loc_00b6c05c:
    /* 0x00b6c05c: ldr      x8, [x24, #8] */ ARM64("ldr x8, [x24, #8]");
    /* 0x00b6c060: cbz      x8, #0xb6c06c */ if (x8 == 0) goto loc_00b6c06c;
    /* 0x00b6c064: ldr      x0, [x24, #0x10] */ ARM64("ldr x0, [x24, #0x10]");
    /* 0x00b6c068: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c06c:
    /* 0x00b6c06c: subs     x21, x21, #1 */ ARM64("subs x21, x21, #1");
    /* 0x00b6c070: b.eq     #0xb6c088 */ if (COND_EQ) goto loc_00b6c088;
    /* 0x00b6c074: add      x20, x22, #0x28 */ ARM64("add x20, x22, #0x28");
    /* 0x00b6c078: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6c07c: bl       #0xb9dd40 */ CALL_DIRECT(sub_00b9dd40);
    /* 0x00b6c080: mov      x22, x20 */ ARM64("mov x22, x20");
    /* 0x00b6c084: b        #0xb6c06c */ goto loc_00b6c06c;
loc_00b6c088:
    /* 0x00b6c088: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6c08c: cbnz     x8, #0xb6c098 */ if (x8 != 0) goto loc_00b6c098;
loc_00b6c090:
    /* 0x00b6c090: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6c094: b        #0xb6c408 */ goto loc_00b6c408;
loc_00b6c098:
    /* 0x00b6c098: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
loc_00b6c09c:
    /* 0x00b6c09c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c0a0: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6c0a4: b        #0xb6c408 */ goto loc_00b6c408;
    /* 0x00b6c0a8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c0ac: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6c0b0:
    /* 0x00b6c0b0: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6c0b4:
    /* 0x00b6c0b4: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6c0b8: cbz      x8, #0xb6c314 */ if (x8 == 0) goto loc_00b6c314;
    /* 0x00b6c0bc: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6c0c0: b        #0xb6c310 */ goto loc_00b6c310;
loc_00b6c0c4:
    /* 0x00b6c0c4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c0c8: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6c0cc: cbz      x8, #0xb6c0d8 */ if (x8 == 0) goto loc_00b6c0d8;
loc_00b6c0d0:
    /* 0x00b6c0d0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c0d4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c0d8:
    /* 0x00b6c0d8: ldr      x9, [sp, #0x238] */ ARM64("ldr x9, [sp, #0x238]");
    /* 0x00b6c0dc: cbz      x9, #0xb6c0f0 */ if (x9 == 0) goto loc_00b6c0f0;
    /* 0x00b6c0e0: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00b6c0e4: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b6c0e8: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6c0ec: b.ne     #0xb6c0f8 */ if (COND_NE) goto loc_00b6c0f8;
loc_00b6c0f0:
    /* 0x00b6c0f0: ldp      x28, x25, [sp, #0xe8] */ ARM64("ldp x28, x25, [sp, #0xe8]");
    /* 0x00b6c0f4: b        #0xb6c194 */ goto loc_00b6c194;
loc_00b6c0f8:
    /* 0x00b6c0f8: ldr      x9, [sp, #0x230] */ ARM64("ldr x9, [sp, #0x230]");
    /* 0x00b6c0fc: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6c100: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6c104: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c108: ldp      x28, x25, [sp, #0xe8] */ ARM64("ldp x28, x25, [sp, #0xe8]");
    /* 0x00b6c10c: b        #0xb6c194 */ goto loc_00b6c194;
    /* 0x00b6c110: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c114: b        #0xb6c194 */ goto loc_00b6c194;
    /* 0x00b6c118: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c11c: ldr      w8, [sp, #0xd4] */ ARM64("ldr w8, [sp, #0xd4]");
    /* 0x00b6c120: eor      w21, w8, #1 */ ARM64("eor w21, w8, #1");
    /* 0x00b6c124: b        #0xb6c54c */ goto loc_00b6c54c;
    /* 0x00b6c128: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c12c: add      x0, sp, #0x6a0 */ ARM64("add x0, sp, #0x6a0");
    /* 0x00b6c130: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
loc_00b6c134:
    /* 0x00b6c134: sub      x0, x29, #0xe0 */ ARM64("sub x0, x29, #0xe0");
    /* 0x00b6c138: bl       #0xc0461c */ CALL_DIRECT(sub_00c0461c);
loc_00b6c13c:
    /* 0x00b6c13c: mov      w21, #1 */ ARM64("mov w21, #1");
loc_00b6c140:
    /* 0x00b6c140: cbz      w21, #0xb6c160 */ if (w21 == 0) goto loc_00b6c160;
    /* 0x00b6c144: ldr      x8, [sp, #0x2c0] */ ARM64("ldr x8, [sp, #0x2c0]");
    /* 0x00b6c148: mov      x9, #-0x7fffffffffffffff */ ARM64("mov x9, #-0x7fffffffffffffff");
    /* 0x00b6c14c: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b6c150: b.eq     #0xb6c160 */ if (COND_EQ) goto loc_00b6c160;
    /* 0x00b6c154: add      x8, sp, #0x230 */ ARM64("add x8, sp, #0x230");
    /* 0x00b6c158: add      x0, x8, #0x90 */ ARM64("add x0, x8, #0x90");
    /* 0x00b6c15c: bl       #0xc0e424 */ CALL_DIRECT(sub_00c0e424);
loc_00b6c160:
    /* 0x00b6c160: add      x0, sp, #0x550 */ ARM64("add x0, sp, #0x550");
    /* 0x00b6c164: bl       #0xb65b48 */ CALL_DIRECT(sub_00b65b48);
loc_00b6c168:
    /* 0x00b6c168: add      x0, sp, #0x1a0 */ ARM64("add x0, sp, #0x1a0");
    /* 0x00b6c16c: bl       #0xb6607c */ CALL_DIRECT(sub_00b6607c);
loc_00b6c170:
    /* 0x00b6c170: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00b6c174: b        #0xb6c5b8 */ goto loc_00b6c5b8;
    /* 0x00b6c178: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c17c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c180: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c184: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c188: cbz      x24, #0xb6c194 */ if (x24 == 0) goto loc_00b6c194;
    /* 0x00b6c18c: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c190: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c194:
    /* 0x00b6c194: ldr      x21, [sp, #0x100] */ ARM64("ldr x21, [sp, #0x100]");
    /* 0x00b6c198: add      x20, x28, #8 */ ARM64("add x20, x28, #8");
    /* 0x00b6c19c: b        #0xb6c1a8 */ goto loc_00b6c1a8;
loc_00b6c1a0:
    /* 0x00b6c1a0: add      x20, x20, #0x18 */ ARM64("add x20, x20, #0x18");
    /* 0x00b6c1a4: sub      x22, x22, #1 */ ARM64("sub x22, x22, #1");
loc_00b6c1a8:
    /* 0x00b6c1a8: cbz      x22, #0xb6c1c0 */ if (x22 == 0) goto loc_00b6c1c0;
    /* 0x00b6c1ac: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00b6c1b0: cbz      x8, #0xb6c1a0 */ if (x8 == 0) goto loc_00b6c1a0;
    /* 0x00b6c1b4: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00b6c1b8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c1bc: b        #0xb6c1a0 */ goto loc_00b6c1a0;
loc_00b6c1c0:
    /* 0x00b6c1c0: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b6c1c4: cbnz     x8, #0xb6c1d0 */ if (x8 != 0) goto loc_00b6c1d0;
    /* 0x00b6c1c8: ldr      x20, [sp, #0x120] */ ARM64("ldr x20, [sp, #0x120]");
    /* 0x00b6c1cc: b        #0xb6c51c */ goto loc_00b6c51c;
loc_00b6c1d0:
    /* 0x00b6c1d0: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b6c1d4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c1d8: ldr      x20, [sp, #0x120] */ ARM64("ldr x20, [sp, #0x120]");
    /* 0x00b6c1dc: b        #0xb6c51c */ goto loc_00b6c51c;
loc_00b6c1e0:
    /* 0x00b6c1e0: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c1e4: ldr      w22, [sp, #0x110] */ ARM64("ldr w22, [sp, #0x110]");
    /* 0x00b6c1e8: cbz      x27, #0xb6c1f4 */ if (x27 == 0) goto loc_00b6c1f4;
    /* 0x00b6c1ec: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
    /* 0x00b6c1f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c1f4:
    /* 0x00b6c1f4: cbnz     x21, #0xb6c2ac */ if (x21 != 0) goto loc_00b6c2ac;
loc_00b6c1f8:
    /* 0x00b6c1f8: ldr      x8, [sp, #0x120] */ ARM64("ldr x8, [sp, #0x120]");
    /* 0x00b6c1fc: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b6c200: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6c204: orr      w8, w22, w8 */ ARM64("orr w8, w22, w8");
    /* 0x00b6c208: tbnz     w8, #0, #0xb6c214 */ if (((w8 >> #0) & 1) != 0) goto loc_00b6c214;
    /* 0x00b6c20c: ldr      x0, [sp, #0xe8] */ ARM64("ldr x0, [sp, #0xe8]");
    /* 0x00b6c210: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c214:
    /* 0x00b6c214: ldr      x21, [sp, #0x558] */ ARM64("ldr x21, [sp, #0x558]");
    /* 0x00b6c218: ldr      x8, [sp, #0x560] */ ARM64("ldr x8, [sp, #0x560]");
    /* 0x00b6c21c: add      x20, x8, #1 */ ARM64("add x20, x8, #1");
    /* 0x00b6c220: mov      x0, x21 */ ARM64("mov x0, x21");
loc_00b6c224:
    /* 0x00b6c224: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00b6c228: b.eq     #0xb6c23c */ if (COND_EQ) goto loc_00b6c23c;
    /* 0x00b6c22c: add      x22, x0, #0x108 */ ARM64("add x22, x0, #0x108");
    /* 0x00b6c230: bl       #0xc259a4 */ CALL_DIRECT(sub_00c259a4);
    /* 0x00b6c234: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6c238: b        #0xb6c224 */ goto loc_00b6c224;
loc_00b6c23c:
    /* 0x00b6c23c: ldr      x8, [sp, #0x550] */ ARM64("ldr x8, [sp, #0x550]");
    /* 0x00b6c240: cbz      x8, #0xb6c24c */ if (x8 == 0) goto loc_00b6c24c;
loc_00b6c244:
    /* 0x00b6c244: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c248: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c24c:
    /* 0x00b6c24c: ldr      x9, [sp, #0x6a8] */ ARM64("ldr x9, [sp, #0x6a8]");
    /* 0x00b6c250: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b6c254: lsl      x8, x9, #2 */ ARM64("lsl x8, x9, #2");
    /* 0x00b6c258: add      x8, x8, #0xb */ ARM64("add x8, x8, #0xb");
    /* 0x00b6c25c: and      x8, x8, #0xfffffffffffffff8 */ ARM64("and x8, x8, #0xfffffffffffffff8");
    /* 0x00b6c260: add      x9, x9, x8 */ ARM64("add x9, x9, x8");
    /* 0x00b6c264: ccmn     x9, #9, #4, ne */ ARM64("ccmn x9, #9, #4, ne");
    /* 0x00b6c268: b.eq     #0xb6c278 */ if (COND_EQ) goto loc_00b6c278;
    /* 0x00b6c26c: ldr      x9, [sp, #0x6a0] */ ARM64("ldr x9, [sp, #0x6a0]");
    /* 0x00b6c270: sub      x0, x9, x8 */ ARM64("sub x0, x9, x8");
    /* 0x00b6c274: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c278:
    /* 0x00b6c278: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00b6c27c: cbz      x8, #0xb6c288 */ if (x8 == 0) goto loc_00b6c288;
    /* 0x00b6c280: ldur     x0, [x29, #-0xa0] */ ARM64("ldur x0, [x29, #-0xa0]");
    /* 0x00b6c284: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c288:
    /* 0x00b6c288: ldp      x21, x8, [x29, #-0xb8] */ ARM64("ldp x21, x8, [x29, #-0xb8]");
    /* 0x00b6c28c: add      x20, x8, #1 */ ARM64("add x20, x8, #1");
    /* 0x00b6c290: mov      x0, x21 */ ARM64("mov x0, x21");
loc_00b6c294:
    /* 0x00b6c294: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00b6c298: b.eq     #0xb6c304 */ if (COND_EQ) goto loc_00b6c304;
    /* 0x00b6c29c: add      x22, x0, #0x108 */ ARM64("add x22, x0, #0x108");
    /* 0x00b6c2a0: bl       #0xc259a4 */ CALL_DIRECT(sub_00c259a4);
    /* 0x00b6c2a4: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6c2a8: b        #0xb6c294 */ goto loc_00b6c294;
loc_00b6c2ac:
    /* 0x00b6c2ac: mov      w20, #0x18 */ ARM64("mov w20, #0x18");
    /* 0x00b6c2b0: b        #0xb6c2c4 */ goto loc_00b6c2c4;
loc_00b6c2b4:
    /* 0x00b6c2b4: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00b6c2b8: and      x24, x8, x24 */ ARM64("and x24, x8, x24");
    /* 0x00b6c2bc: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00b6c2c0: cbz      x21, #0xb6c1f8 */ if (x21 == 0) goto loc_00b6c1f8;
loc_00b6c2c4:
    /* 0x00b6c2c4: cbnz     x24, #0xb6c2e0 */ if (x24 != 0) goto loc_00b6c2e0;
loc_00b6c2c8:
    /* 0x00b6c2c8: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00b6c2cc: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6c2d0: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6c2d4: sub      x25, x25, #0xc0 */ ARM64("sub x25, x25, #0xc0");
    /* 0x00b6c2d8: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b6c2dc: cbz      x24, #0xb6c2c8 */ if (x24 == 0) goto loc_00b6c2c8;
loc_00b6c2e0:
    /* 0x00b6c2e0: rbit     x8, x24 */ ARM64("rbit x8, x24");
    /* 0x00b6c2e4: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b6c2e8: neg      x8, x8, lsr #3 */ ARM64("neg x8, x8, lsr #3");
    /* 0x00b6c2ec: smaddl   x8, w8, w20, x25 */ ARM64("smaddl x8, w8, w20, x25");
    /* 0x00b6c2f0: ldur     x9, [x8, #-0x18] */ ARM64("ldur x9, [x8, #-0x18]");
    /* 0x00b6c2f4: cbz      x9, #0xb6c2b4 */ if (x9 == 0) goto loc_00b6c2b4;
    /* 0x00b6c2f8: ldur     x0, [x8, #-0x10] */ ARM64("ldur x0, [x8, #-0x10]");
    /* 0x00b6c2fc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c300: b        #0xb6c2b4 */ goto loc_00b6c2b4;
loc_00b6c304:
    /* 0x00b6c304: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6c308: cbz      x8, #0xb6c314 */ if (x8 == 0) goto loc_00b6c314;
    /* 0x00b6c30c: mov      x0, x21 */ ARM64("mov x0, x21");
loc_00b6c310:
    /* 0x00b6c310: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c314:
    /* 0x00b6c314: add      x0, sp, #0x5a0 */ ARM64("add x0, sp, #0x5a0");
    /* 0x00b6c318: bl       #0xc14ff4 */ CALL_DIRECT(sub_00c14ff4);
loc_00b6c31c:
    /* 0x00b6c31c: add      x0, sp, #0x450 */ ARM64("add x0, sp, #0x450");
    /* 0x00b6c320: bl       #0xb661ac */ CALL_DIRECT(sub_00b661ac);
loc_00b6c324:
    /* 0x00b6c324: mov      w21, #0 */ ARM64("mov w21, #0");
    /* 0x00b6c328: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00b6c32c: b        #0xb6c550 */ goto loc_00b6c550;
    /* 0x00b6c330: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6c334:
    /* 0x00b6c334: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00b6c338: b.eq     #0xb6c350 */ if (COND_EQ) goto loc_00b6c350;
    /* 0x00b6c33c: add      x19, x22, #0x108 */ ARM64("add x19, x22, #0x108");
    /* 0x00b6c340: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6c344: bl       #0xc259a4 */ CALL_DIRECT(sub_00c259a4);
    /* 0x00b6c348: mov      x22, x19 */ ARM64("mov x22, x19");
    /* 0x00b6c34c: b        #0xb6c334 */ goto loc_00b6c334;
loc_00b6c350:
    /* 0x00b6c350: ldur     x8, [x29, #-0xc0] */ ARM64("ldur x8, [x29, #-0xc0]");
    /* 0x00b6c354: cbnz     x8, #0xb6c384 */ if (x8 != 0) goto loc_00b6c384;
    /* 0x00b6c358: b        #0xb6c680 */ goto loc_00b6c680;
    /* 0x00b6c35c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6c360:
    /* 0x00b6c360: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00b6c364: b.eq     #0xb6c37c */ if (COND_EQ) goto loc_00b6c37c;
    /* 0x00b6c368: add      x19, x22, #0x108 */ ARM64("add x19, x22, #0x108");
    /* 0x00b6c36c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b6c370: bl       #0xc259a4 */ CALL_DIRECT(sub_00c259a4);
    /* 0x00b6c374: mov      x22, x19 */ ARM64("mov x22, x19");
    /* 0x00b6c378: b        #0xb6c360 */ goto loc_00b6c360;
loc_00b6c37c:
    /* 0x00b6c37c: ldr      x8, [sp, #0x550] */ ARM64("ldr x8, [sp, #0x550]");
    /* 0x00b6c380: cbz      x8, #0xb6c680 */ if (x8 == 0) goto loc_00b6c680;
loc_00b6c384:
    /* 0x00b6c384: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c388: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c38c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c390: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b6c394:
    /* 0x00b6c394: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c398: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b6c39c: cbnz     x8, #0xb6c3b4 */ if (x8 != 0) goto loc_00b6c3b4;
    /* 0x00b6c3a0: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b6c3a4: cbnz     x8, #0xb6c3c4 */ if (x8 != 0) goto loc_00b6c3c4;
loc_00b6c3a8:
    /* 0x00b6c3a8: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00b6c3ac: cbz      x8, #0xb6c3dc */ if (x8 == 0) goto loc_00b6c3dc;
    /* 0x00b6c3b0: b        #0xb6c3d4 */ goto loc_00b6c3d4;
loc_00b6c3b4:
    /* 0x00b6c3b4: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b6c3b8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c3bc: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b6c3c0: cbz      x8, #0xb6c3a8 */ if (x8 == 0) goto loc_00b6c3a8;
loc_00b6c3c4:
    /* 0x00b6c3c4: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b6c3c8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c3cc: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00b6c3d0: cbz      x8, #0xb6c3dc */ if (x8 == 0) goto loc_00b6c3dc;
loc_00b6c3d4:
    /* 0x00b6c3d4: ldr      x0, [sp, #0x270] */ ARM64("ldr x0, [sp, #0x270]");
loc_00b6c3d8:
    /* 0x00b6c3d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c3dc:
    /* 0x00b6c3dc: add      x0, sp, #0x470 */ ARM64("add x0, sp, #0x470");
    /* 0x00b6c3e0: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b6c3e4: ldr      x8, [sp, #0x550] */ ARM64("ldr x8, [sp, #0x550]");
    /* 0x00b6c3e8: cbz      x8, #0xb6c548 */ if (x8 == 0) goto loc_00b6c548;
    /* 0x00b6c3ec: ldr      x0, [sp, #0x558] */ ARM64("ldr x0, [sp, #0x558]");
    /* 0x00b6c3f0: b        #0xb6c544 */ goto loc_00b6c544;
    /* 0x00b6c3f4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c3f8: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b6c3fc: cbz      x8, #0xb6c408 */ if (x8 == 0) goto loc_00b6c408;
    /* 0x00b6c400: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b6c404: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c408:
    /* 0x00b6c408: ldr      x8, [sp, #0x100] */ ARM64("ldr x8, [sp, #0x100]");
    /* 0x00b6c40c: cbz      x8, #0xb6c418 */ if (x8 == 0) goto loc_00b6c418;
    /* 0x00b6c410: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b6c414: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c418:
    /* 0x00b6c418: ldr      x8, [sp, #0x178] */ ARM64("ldr x8, [sp, #0x178]");
    /* 0x00b6c41c: cbz      x8, #0xb6c548 */ if (x8 == 0) goto loc_00b6c548;
    /* 0x00b6c420: mov      x9, x8 */ ARM64("mov x9, x8");
    /* 0x00b6c424: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b6c428: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b6c42c: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b6c430: b.eq     #0xb6c548 */ if (COND_EQ) goto loc_00b6c548;
    /* 0x00b6c434: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00b6c438: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6c43c: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6c440: b        #0xb6c544 */ goto loc_00b6c544;
loc_00b6c444:
    /* 0x00b6c444: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c448: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6c44c: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b6c450: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b6c454: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6c458: ldr      w9, [sp, #0x78] */ ARM64("ldr w9, [sp, #0x78]");
    /* 0x00b6c45c: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b6c460: tbnz     w8, #0, #0xb6c46c */ if (((w8 >> #0) & 1) != 0) goto loc_00b6c46c;
    /* 0x00b6c464: ldr      x0, [sp, #0x70] */ ARM64("ldr x0, [sp, #0x70]");
    /* 0x00b6c468: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c46c:
    /* 0x00b6c46c: ldr      x8, [sp, #0x470] */ ARM64("ldr x8, [sp, #0x470]");
    /* 0x00b6c470: cbz      x8, #0xb6c4c8 */ if (x8 == 0) goto loc_00b6c4c8;
    /* 0x00b6c474: ldr      x8, [sp, #0x478] */ ARM64("ldr x8, [sp, #0x478]");
    /* 0x00b6c478: str      x8, [sp, #0x70] */ ARM64("str x8, [sp, #0x70]");
    /* 0x00b6c47c: b        #0xb6c4c0 */ goto loc_00b6c4c0;
    /* 0x00b6c480: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c484: ldr      x25, [sp, #0xf0] */ ARM64("ldr x25, [sp, #0xf0]");
    /* 0x00b6c488: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b6c48c: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b6c490: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6c494: ldr      w9, [sp, #0x78] */ ARM64("ldr w9, [sp, #0x78]");
    /* 0x00b6c498: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b6c49c: tbnz     w8, #0, #0xb6c4c8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b6c4c8;
    /* 0x00b6c4a0: b        #0xb6c4c0 */ goto loc_00b6c4c0;
    /* 0x00b6c4a4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b6c4a8: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b6c4ac: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b6c4b0: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b6c4b4: ldr      w9, [sp, #0x78] */ ARM64("ldr w9, [sp, #0x78]");
    /* 0x00b6c4b8: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b6c4bc: tbnz     w8, #0, #0xb6c4c8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b6c4c8;
loc_00b6c4c0:
    /* 0x00b6c4c0: ldr      x0, [sp, #0x70] */ ARM64("ldr x0, [sp, #0x70]");
    /* 0x00b6c4c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c4c8:
    /* 0x00b6c4c8: add      x20, x28, #8 */ ARM64("add x20, x28, #8");
    /* 0x00b6c4cc: b        #0xb6c4d8 */ goto loc_00b6c4d8;
loc_00b6c4d0:
    /* 0x00b6c4d0: add      x20, x20, #0x18 */ ARM64("add x20, x20, #0x18");
    /* 0x00b6c4d4: sub      x22, x22, #1 */ ARM64("sub x22, x22, #1");
loc_00b6c4d8:
    /* 0x00b6c4d8: cbz      x22, #0xb6c4f0 */ if (x22 == 0) goto loc_00b6c4f0;
    /* 0x00b6c4dc: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00b6c4e0: cbz      x8, #0xb6c4d0 */ if (x8 == 0) goto loc_00b6c4d0;
    /* 0x00b6c4e4: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00b6c4e8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c4ec: b        #0xb6c4d0 */ goto loc_00b6c4d0;
loc_00b6c4f0:
    /* 0x00b6c4f0: ldr      x8, [sp, #0xc8] */ ARM64("ldr x8, [sp, #0xc8]");
    /* 0x00b6c4f4: cbnz     x8, #0xb6c500 */ if (x8 != 0) goto loc_00b6c500;
    /* 0x00b6c4f8: ldr      x20, [sp, #0x120] */ ARM64("ldr x20, [sp, #0x120]");
    /* 0x00b6c4fc: b        #0xb6c514 */ goto loc_00b6c514;
loc_00b6c500:
    /* 0x00b6c500: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b6c504: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b6c508: ldr      x20, [sp, #0x120] */ ARM64("ldr x20, [sp, #0x120]");
    /* 0x00b6c50c: b        #0xb6c514 */ goto loc_00b6c514;
    /* 0x00b6c510: mov      x23, x0 */ ARM64("mov x23, x0");
loc_00b6c514:
    /* 0x00b6c514: add      x0, sp, #0x230 */ ARM64("add x0, sp, #0x230");
    /* 0x00b6c518: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
loc_00b6c51c:
    /* 0x00b6c51c: cbz      x20, #0xb6c53c */ if (x20 == 0) goto loc_00b6c53c;
    /* 0x00b6c520: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00b6c524: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00b6c528: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b6c52c: b.eq     #0xb6c53c */ if (COND_EQ) goto loc_00b6c53c;
    /* 0x00b6c530: sub      x8, x21, x8 */ ARM64("sub x8, x21, x8");
    /* 0x00b6c534: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b6c538: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c53c:
    /* 0x00b6c53c: cbz      x25, #0xb6c548 */ if (x25 == 0) goto loc_00b6c548;
    /* 0x00b6c540: ldr      x0, [sp, #0x180] */ ARM64("ldr x0, [sp, #0x180]");
loc_00b6c544:
    /* 0x00b6c544: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c548:
    /* 0x00b6c548: mov      w21, #1 */ ARM64("mov w21, #1");
loc_00b6c54c:
    /* 0x00b6c54c: mov      w20, #1 */ ARM64("mov w20, #1");
loc_00b6c550:
    /* 0x00b6c550: ldr      x22, [sp, #0x218] */ ARM64("ldr x22, [sp, #0x218]");
    /* 0x00b6c554: cbz      x22, #0xb6c580 */ if (x22 == 0) goto loc_00b6c580;
    /* 0x00b6c558: ldr      x24, [sp, #0x228] */ ARM64("ldr x24, [sp, #0x228]");
    /* 0x00b6c55c: cbnz     x24, #0xb6c5f4 */ if (x24 != 0) goto loc_00b6c5f4;
loc_00b6c560:
    /* 0x00b6c560: lsl      x8, x22, #4 */ ARM64("lsl x8, x22, #4");
    /* 0x00b6c564: add      x9, x8, x22 */ ARM64("add x9, x8, x22");
    /* 0x00b6c568: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b6c56c: b.eq     #0xb6c580 */ if (COND_EQ) goto loc_00b6c580;
    /* 0x00b6c570: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b6c574: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b6c578: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b6c57c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c580:
    /* 0x00b6c580: tbz      w21, #0, #0xb6c5b8 */ if (((w21 >> #0) & 1) == 0) goto loc_00b6c5b8;
loc_00b6c584:
    /* 0x00b6c584: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00b6c588: cbz      x8, #0xb6c59c */ if (x8 == 0) goto loc_00b6c59c;
    /* 0x00b6c58c: ldr      x9, [sp, #0x1d8] */ ARM64("ldr x9, [sp, #0x1d8]");
    /* 0x00b6c590: sub      x8, x9, x8, lsl #3 */ ARM64("sub x8, x9, x8, lsl #3");
    /* 0x00b6c594: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b6c598: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c59c:
    /* 0x00b6c59c: ldp      x21, x1, [sp, #0x1c8] */ ARM64("ldp x21, x1, [sp, #0x1c8]");
    /* 0x00b6c5a0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c5a4: bl       #0xb9ee34 */ CALL_DIRECT(sub_00b9ee34);
    /* 0x00b6c5a8: ldr      x8, [sp, #0x1c0] */ ARM64("ldr x8, [sp, #0x1c0]");
    /* 0x00b6c5ac: cbz      x8, #0xb6c5b8 */ if (x8 == 0) goto loc_00b6c5b8;
    /* 0x00b6c5b0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b6c5b4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b6c5b8:
    /* 0x00b6c5b8: ldr      x0, [sp, #0xf8] */ ARM64("ldr x0, [sp, #0xf8]");
    /* 0x00b6c5bc: bl       #0xb661ac */ CALL_DIRECT(sub_00b661ac);
    /* 0x00b6c5c0: tbz      w20, #0, #0xb6c5cc */ if (((w20 >> #0) & 1) == 0) goto loc_00b6c5cc;
    /* 0x00b6c5c4: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00b6c5c8: bl       #0xb665d8 */ CALL_DIRECT(sub_00b665d8);
loc_00b6c5cc:
    /* 0x00b6c5cc: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b6c5d0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b6c5d4: stlxr    w9, x8, [x19] */ ARM64("stlxr w9, x8, [x19]");
    /* 0x00b6c5d8: cbnz     w9, #0xb6c5cc */ if (w9 != 0) goto loc_00b6c5cc;
    /* 0x00b6c5dc: b.ne     #0xb6c5ec */ if (COND_NE) goto loc_00b6c5ec;
    /* 0x00b6c5e0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6c5e4: add      x0, sp, #0x198 */ ARM64("add x0, sp, #0x198");
    /* 0x00b6c5e8: bl       #0xb86ac8 */ CALL_DIRECT(sub_00b86ac8);
loc_00b6c5ec:
    /* 0x00b6c5ec: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b6c5f0: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
loc_00b6c5f4:
    /* 0x00b6c5f4: ldr      x25, [sp, #0x210] */ ARM64("ldr x25, [sp, #0x210]");
    /* 0x00b6c5f8: mov      x26, x25 */ ARM64("mov x26, x25");
    /* 0x00b6c5fc: ldr      d0, [x26], #8 */ ARM64("ldr d0, [x26], #8");
    /* 0x00b6c600: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6c604: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6c608: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00b6c60c: b        #0xb6c614 */ goto loc_00b6c614;
loc_00b6c610:
    /* 0x00b6c610: cbz      x24, #0xb6c560 */ if (x24 == 0) goto loc_00b6c560;
loc_00b6c614:
    /* 0x00b6c614: cbnz     x27, #0xb6c630 */ if (x27 != 0) goto loc_00b6c630;
loc_00b6c618:
    /* 0x00b6c618: ldr      d0, [x26], #8 */ ARM64("ldr d0, [x26], #8");
    /* 0x00b6c61c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b6c620: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b6c624: sub      x25, x25, #0x80 */ ARM64("sub x25, x25, #0x80");
    /* 0x00b6c628: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00b6c62c: cbz      x27, #0xb6c618 */ if (x27 == 0) goto loc_00b6c618;
loc_00b6c630:
    /* 0x00b6c630: sub      x8, x27, #1 */ ARM64("sub x8, x27, #1");
    /* 0x00b6c634: rbit     x9, x27 */ ARM64("rbit x9, x27");
    /* 0x00b6c638: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b6c63c: and      x27, x8, x27 */ ARM64("and x27, x8, x27");
    /* 0x00b6c640: lsl      x8, x9, #1 */ ARM64("lsl x8, x9, #1");
    /* 0x00b6c644: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00b6c648: sub      x8, x25, x8 */ ARM64("sub x8, x25, x8");
    /* 0x00b6c64c: sub      x24, x24, #1 */ ARM64("sub x24, x24, #1");
    /* 0x00b6c650: ldur     x9, [x8, #-0x10] */ ARM64("ldur x9, [x8, #-0x10]");
loc_00b6c654:
    /* 0x00b6c654: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b6c658: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b6c65c: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b6c660: cbnz     w11, #0xb6c654 */ if (w11 != 0) goto loc_00b6c654;
    /* 0x00b6c664: b.ne     #0xb6c610 */ if (COND_NE) goto loc_00b6c610;
    /* 0x00b6c668: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b6c66c: ldur     x0, [x8, #-0x10] */ ARM64("ldur x0, [x8, #-0x10]");
    /* 0x00b6c670: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b6c674: b        #0xb6c610 */ goto loc_00b6c610;
    /* 0x00b6c678: ldr      x8, [sp, #0x1c0] */ ARM64("ldr x8, [sp, #0x1c0]");
    /* 0x00b6c67c: cbnz     x8, #0xb6c384 */ if (x8 != 0) goto loc_00b6c384;
loc_00b6c680:
    /* 0x00b6c680: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b6c684: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
}
