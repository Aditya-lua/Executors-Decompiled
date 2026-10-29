/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb9fa50..0xba89e4 (36756 bytes). */
#include "../lift_runtime.hpp"

void sub_00b9fa50(Arm64Context& cpu) {
    /* 0x00b9fa50: stp      d9, d8, [sp, #-0x70]! */ ARM64("stp d9, d8, [sp, #-0x70]!");
    /* 0x00b9fa54: stp      x28, x27, [sp, #0x10] */ ARM64("stp x28, x27, [sp, #0x10]");
    /* 0x00b9fa58: stp      x26, x25, [sp, #0x20] */ ARM64("stp x26, x25, [sp, #0x20]");
    /* 0x00b9fa5c: stp      x24, x23, [sp, #0x30] */ ARM64("stp x24, x23, [sp, #0x30]");
    /* 0x00b9fa60: stp      x22, x21, [sp, #0x40] */ ARM64("stp x22, x21, [sp, #0x40]");
    /* 0x00b9fa64: stp      x20, x19, [sp, #0x50] */ ARM64("stp x20, x19, [sp, #0x50]");
    /* 0x00b9fa68: stp      x29, x30, [sp, #0x60] */ ARM64("stp x29, x30, [sp, #0x60]");
    /* 0x00b9fa6c: add      x29, sp, #0x60 */ ARM64("add x29, sp, #0x60");
    /* 0x00b9fa70: sub      sp, sp, #0x440 */ ARM64("sub sp, sp, #0x440");
    /* 0x00b9fa74: str      xzr, [sp] */ ARM64("str xzr, [sp]");
    /* 0x00b9fa78: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9fa7c: ldr      x8, [x0, #0xd8] */ ARM64("ldr x8, [x0, #0xd8]");
    /* 0x00b9fa80: ldp      x9, x8, [x8, #0x20] */ ARM64("ldp x9, x8, [x8, #0x20]");
    /* 0x00b9fa84: add      x8, x9, x8, lsl #5 */ ARM64("add x8, x9, x8, lsl #5");
    /* 0x00b9fa88: str      x9, [sp, #0x268] */ ARM64("str x9, [sp, #0x268]");
    /* 0x00b9fa8c: str      x8, [sp, #0x270] */ ARM64("str x8, [sp, #0x270]");
    /* 0x00b9fa90: str      xzr, [sp, #0x278] */ ARM64("str xzr, [sp, #0x278]");
    /* 0x00b9fa94: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00b9fa98: add      x1, sp, #0x268 */ ARM64("add x1, sp, #0x268");
    /* 0x00b9fa9c: bl       #0xb9c8e4 */ CALL_DIRECT(sub_00b9c8e4);
    /* 0x00b9faa0: mov      x19, #0xa95 */ ARM64("mov x19, #0xa95");
    /* 0x00b9faa4: movk     x19, #0x2722, lsl #16 */ ARM64("movk x19, #0x2722, lsl #16");
    /* 0x00b9faa8: movk     x19, #0xc1b7, lsl #32 */ ARM64("movk x19, #0xc1b7, lsl #32");
    /* 0x00b9faac: movk     x19, #0x517c, lsl #48 */ ARM64("movk x19, #0x517c, lsl #48");
    /* 0x00b9fab0: ldp      x8, x23, [sp, #0x130] */ ARM64("ldp x8, x23, [sp, #0x130]");
    /* 0x00b9fab4: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00b9fab8: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00b9fabc: str      x28, [sp, #0x128] */ ARM64("str x28, [sp, #0x128]");
    /* 0x00b9fac0: cbz      x8, #0xba0a74 */ if (x8 == 0) goto loc_00ba0a74;
    /* 0x00b9fac4: add      x8, x23, x8, lsl #2 */ ARM64("add x8, x23, x8, lsl #2");
    /* 0x00b9fac8: str      x8, [sp, #0xd0] */ ARM64("str x8, [sp, #0xd0]");
    /* 0x00b9facc: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b9fad0: add      x8, x8, #0x958 */ ARM64("add x8, x8, #0x958");
    /* 0x00b9fad4: ldp      q0, q1, [x8] */ ARM64("ldp q0, q1, [x8]");
    /* 0x00b9fad8: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00b9fadc: mov      w25, #0x30 */ ARM64("mov w25, #0x30");
    /* 0x00b9fae0: adrp     x8, #0xd0a000 */ ARM64("adrp x8, #0xd0a000");
    /* 0x00b9fae4: ldr      q2, [x8, #0xd80] */ ARM64("ldr q2, [x8, #0xd80]");
    /* 0x00b9fae8: stp      q0, q2, [sp, #0x100] */ ARM64("stp q0, q2, [sp, #0x100]");
    /* 0x00b9faec: adrp     x21, #0xe0e000 */ ARM64("adrp x21, #0xe0e000");
    /* 0x00b9faf0: add      x21, x21, #0xd10 */ ARM64("add x21, x21, #0xd10");
    /* 0x00b9faf4: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b9faf8: add      x8, x8, #0x7d0 */ ARM64("add x8, x8, #0x7d0");
    /* 0x00b9fafc: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
    /* 0x00b9fb00: mov      x20, x23 */ ARM64("mov x20, x23");
    /* 0x00b9fb04: str      x23, [sp, #0xc0] */ ARM64("str x23, [sp, #0xc0]");
    /* 0x00b9fb08: str      q1, [sp, #0xf0] */ ARM64("str q1, [sp, #0xf0]");
loc_00b9fb0c:
    /* 0x00b9fb0c: ldr      w26, [x20], #4 */ ARM64("ldr w26, [x20], #4");
    /* 0x00b9fb10: stp      q0, q1, [sp, #0x2b0] */ ARM64("stp q0, q1, [sp, #0x2b0]");
    /* 0x00b9fb14: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00b9fb18: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00b9fb1c: cmp      x9, x26 */ ARM64("cmp x9, x26");
    /* 0x00b9fb20: b.ls     #0xb9fb38 */ if (COND_LS) goto loc_00b9fb38;
    /* 0x00b9fb24: ldr      x9, [x8, #0x20] */ ARM64("ldr x9, [x8, #0x20]");
    /* 0x00b9fb28: add      x9, x9, x26, lsl #5 */ ARM64("add x9, x9, x26, lsl #5");
    /* 0x00b9fb2c: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00b9fb30: cmp      x10, x24 */ ARM64("cmp x10, x24");
    /* 0x00b9fb34: b.ne     #0xb9fb40 */ if (COND_NE) goto loc_00b9fb40;
loc_00b9fb38:
    /* 0x00b9fb38: mov      x9, #-1 */ ARM64("mov x9, #-1");
    /* 0x00b9fb3c: b        #0xb9fb4c */ goto loc_00b9fb4c;
loc_00b9fb40:
    /* 0x00b9fb40: ldr      w9, [x9, #0x1c] */ ARM64("ldr w9, [x9, #0x1c]");
    /* 0x00b9fb44: mov      w10, #-1 */ ARM64("mov w10, #-1");
    /* 0x00b9fb48: orr      x9, x10, x9, lsl #32 */ ARM64("orr x9, x10, x9, lsl #32");
loc_00b9fb4c:
    /* 0x00b9fb4c: ldp      x10, x11, [x8, #0x38] */ ARM64("ldp x10, x11, [x8, #0x38]");
loc_00b9fb50:
    /* 0x00b9fb50: mov      w13, w9 */ ARM64("mov w13, w9");
    /* 0x00b9fb54: cmp      x11, x13 */ ARM64("cmp x11, x13");
    /* 0x00b9fb58: b.ls     #0xb9fb74 */ if (COND_LS) goto loc_00b9fb74;
    /* 0x00b9fb5c: mov      w12, w9 */ ARM64("mov w12, w9");
    /* 0x00b9fb60: umaddl   x13, w13, w25, x10 */ ARM64("umaddl x13, w13, w25, x10");
    /* 0x00b9fb64: ldr      w13, [x13, #0x20] */ ARM64("ldr w13, [x13, #0x20]");
    /* 0x00b9fb68: and      x9, x9, #0xffffffff00000000 */ ARM64("and x9, x9, #0xffffffff00000000");
    /* 0x00b9fb6c: orr      x9, x9, x13 */ ARM64("orr x9, x9, x13");
    /* 0x00b9fb70: b        #0xb9fb98 */ goto loc_00b9fb98;
loc_00b9fb74:
    /* 0x00b9fb74: lsr      x13, x9, #0x20 */ ARM64("lsr x13, x9, #0x20");
loc_00b9fb78:
    /* 0x00b9fb78: cmp      x11, x13 */ ARM64("cmp x11, x13");
    /* 0x00b9fb7c: b.ls     #0xb9fdd8 */ if (COND_LS) goto loc_00b9fdd8;
    /* 0x00b9fb80: mov      x12, x13 */ ARM64("mov x12, x13");
    /* 0x00b9fb84: madd     x14, x13, x25, x10 */ ARM64("madd x14, x13, x25, x10");
    /* 0x00b9fb88: ldp      w13, w14, [x14, #0x24] */ ARM64("ldp w13, w14, [x14, #0x24]");
    /* 0x00b9fb8c: bfi      x9, x13, #0x20, #0x20 */ ARM64("bfi x9, x13, #0x20, #0x20");
    /* 0x00b9fb90: cmn      w14, #1 */ ARM64("cmn w14, #1");
    /* 0x00b9fb94: b.eq     #0xb9fb78 */ if (COND_EQ) goto loc_00b9fb78;
loc_00b9fb98:
    /* 0x00b9fb98: cmp      x11, x12 */ ARM64("cmp x11, x12");
    /* 0x00b9fb9c: b.ls     #0xba7528 */ if (COND_LS) goto loc_00ba7528;
    /* 0x00b9fba0: madd     x12, x12, x25, x10 */ ARM64("madd x12, x12, x25, x10");
    /* 0x00b9fba4: ldr      x13, [x12] */ ARM64("ldr x13, [x12]");
    /* 0x00b9fba8: cmp      x13, x24 */ ARM64("cmp x13, x24");
    /* 0x00b9fbac: b.eq     #0xba7528 */ if (COND_EQ) goto loc_00ba7528;
    /* 0x00b9fbb0: ldr      w13, [x12, #0x2c] */ ARM64("ldr w13, [x12, #0x2c]");
    /* 0x00b9fbb4: cmp      w13, w26 */ ARM64("cmp w13, w26");
    /* 0x00b9fbb8: b.ne     #0xb9fb50 */ if (COND_NE) goto loc_00b9fb50;
    /* 0x00b9fbbc: ldr      x9, [x12, #0x10] */ ARM64("ldr x9, [x12, #0x10]");
    /* 0x00b9fbc0: cbz      x9, #0xb9fdd8 */ if (x9 == 0) goto loc_00b9fdd8;
    /* 0x00b9fbc4: str      x22, [sp, #0x68] */ ARM64("str x22, [sp, #0x68]");
    /* 0x00b9fbc8: str      x20, [sp, #0xe0] */ ARM64("str x20, [sp, #0xe0]");
    /* 0x00b9fbcc: ldr      x22, [x12, #8] */ ARM64("ldr x22, [x12, #8]");
    /* 0x00b9fbd0: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00b9fbd4: madd     x20, x9, x8, x22 */ ARM64("madd x20, x9, x8, x22");
    /* 0x00b9fbd8: b        #0xb9fbe4 */ goto loc_00b9fbe4;
loc_00b9fbdc:
    /* 0x00b9fbdc: cmp      x22, x20 */ ARM64("cmp x22, x20");
    /* 0x00b9fbe0: b.eq     #0xb9fcd4 */ if (COND_EQ) goto loc_00b9fcd4;
loc_00b9fbe4:
    /* 0x00b9fbe4: mov      x21, x22 */ ARM64("mov x21, x22");
    /* 0x00b9fbe8: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00b9fbec: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b9fbf0: cbz      x0, #0xba350c */ if (x0 == 0) goto loc_00ba350c;
    /* 0x00b9fbf4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b9fbf8: ldr      q0, [sp, #0x110] */ ARM64("ldr q0, [sp, #0x110]");
    /* 0x00b9fbfc: str      q0, [x0] */ ARM64("str q0, [x0]");
    /* 0x00b9fc00: str      x24, [x0, #0x10] */ ARM64("str x24, [x0, #0x10]");
    /* 0x00b9fc04: ldr      x1, [x21] */ ARM64("ldr x1, [x21]");
    /* 0x00b9fc08: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b9fc0c: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00b9fc10: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00b9fc14: b.ne     #0xb9fc88 */ if (COND_NE) goto loc_00b9fc88;
    /* 0x00b9fc18: ldr      x8, [x28, #0x10] */ ARM64("ldr x8, [x28, #0x10]");
    /* 0x00b9fc1c: cmp      x1, x8 */ ARM64("cmp x1, x8");
    /* 0x00b9fc20: b.hs     #0xba7608 */ if (COND_HS) goto loc_00ba7608;
    /* 0x00b9fc24: ldr      x8, [x28, #8] */ ARM64("ldr x8, [x28, #8]");
loc_00b9fc28:
    /* 0x00b9fc28: ldxr     x9, [x23] */ ARM64("ldxr x9, [x23]");
    /* 0x00b9fc2c: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00b9fc30: stxr     w11, x10, [x23] */ ARM64("stxr w11, x10, [x23]");
    /* 0x00b9fc34: cbnz     w11, #0xb9fc28 */ if (w11 != 0) goto loc_00b9fc28;
    /* 0x00b9fc38: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00b9fc3c: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00b9fc40: madd     x8, x1, x9, x8 */ ARM64("madd x8, x1, x9, x8");
    /* 0x00b9fc44: ldr      x2, [x8, #8] */ ARM64("ldr x2, [x8, #8]");
loc_00b9fc48:
    /* 0x00b9fc48: ldxr     x8, [x2] */ ARM64("ldxr x8, [x2]");
    /* 0x00b9fc4c: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b9fc50: stxr     w10, x9, [x2] */ ARM64("stxr w10, x9, [x2]");
    /* 0x00b9fc54: cbnz     w10, #0xb9fc48 */ if (w10 != 0) goto loc_00b9fc48;
    /* 0x00b9fc58: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00b9fc5c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b9fc60: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00b9fc64: bl       #0xbda618 */ CALL_DIRECT(sub_00bda618);
    /* 0x00b9fc68: cbz      x0, #0xb9fc88 */ if (x0 == 0) goto loc_00b9fc88;
loc_00b9fc6c:
    /* 0x00b9fc6c: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00b9fc70: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b9fc74: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00b9fc78: cbnz     w9, #0xb9fc6c */ if (w9 != 0) goto loc_00b9fc6c;
    /* 0x00b9fc7c: b.ne     #0xb9fc88 */ if (COND_NE) goto loc_00b9fc88;
    /* 0x00b9fc80: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b9fc84: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b9fc88:
    /* 0x00b9fc88: add      x22, x21, #0x48 */ ARM64("add x22, x21, #0x48");
    /* 0x00b9fc8c: ldr      x1, [x21] */ ARM64("ldr x1, [x21]");
loc_00b9fc90:
    /* 0x00b9fc90: ldxr     x8, [x1] */ ARM64("ldxr x8, [x1]");
    /* 0x00b9fc94: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b9fc98: stxr     w10, x9, [x1] */ ARM64("stxr w10, x9, [x1]");
    /* 0x00b9fc9c: cbnz     w10, #0xb9fc90 */ if (w10 != 0) goto loc_00b9fc90;
    /* 0x00b9fca0: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00b9fca4: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00b9fca8: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b9fcac: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00b9fcb0: cbz      x0, #0xb9fbdc */ if (x0 == 0) goto loc_00b9fbdc;
loc_00b9fcb4:
    /* 0x00b9fcb4: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00b9fcb8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b9fcbc: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00b9fcc0: cbnz     w9, #0xb9fcb4 */ if (w9 != 0) goto loc_00b9fcb4;
    /* 0x00b9fcc4: b.ne     #0xb9fbdc */ if (COND_NE) goto loc_00b9fbdc;
    /* 0x00b9fcc8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b9fccc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b9fcd0: b        #0xb9fbdc */ goto loc_00b9fbdc;
loc_00b9fcd4:
    /* 0x00b9fcd4: ldr      x9, [sp, #0x2c8] */ ARM64("ldr x9, [sp, #0x2c8]");
    /* 0x00b9fcd8: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00b9fcdc: ldr      x22, [sp, #0x68] */ ARM64("ldr x22, [sp, #0x68]");
    /* 0x00b9fce0: cbz      x9, #0xb9fdc8 */ if (x9 == 0) goto loc_00b9fdc8;
    /* 0x00b9fce4: mov      x27, #-0x8000000000000000 */ ARM64("mov x27, #-0x8000000000000000");
    /* 0x00b9fce8: ldr      x10, [x8, #0x28] */ ARM64("ldr x10, [x8, #0x28]");
    /* 0x00b9fcec: cmp      x10, x26 */ ARM64("cmp x10, x26");
    /* 0x00b9fcf0: b.ls     #0xba772c */ if (COND_LS) goto loc_00ba772c;
    /* 0x00b9fcf4: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00b9fcf8: add      x10, x8, x26, lsl #5 */ ARM64("add x10, x8, x26, lsl #5");
    /* 0x00b9fcfc: ldr      x8, [x10] */ ARM64("ldr x8, [x10]");
    /* 0x00b9fd00: cmp      x8, x27 */ ARM64("cmp x8, x27");
    /* 0x00b9fd04: b.eq     #0xba772c */ if (COND_EQ) goto loc_00ba772c;
    /* 0x00b9fd08: ldr      x20, [sp, #0x2b0] */ ARM64("ldr x20, [sp, #0x2b0]");
    /* 0x00b9fd0c: mov      x21, x20 */ ARM64("mov x21, x20");
    /* 0x00b9fd10: ldr      d0, [x21], #8 */ ARM64("ldr d0, [x21], #8");
    /* 0x00b9fd14: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b9fd18: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b9fd1c: ands     x8, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x8, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b9fd20: str      x10, [sp, #0xb0] */ ARM64("str x10, [sp, #0xb0]");
    /* 0x00b9fd24: b.ne     #0xb9fd40 */ if (COND_NE) goto loc_00b9fd40;
loc_00b9fd28:
    /* 0x00b9fd28: ldr      d0, [x21], #8 */ ARM64("ldr d0, [x21], #8");
    /* 0x00b9fd2c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b9fd30: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b9fd34: sub      x20, x20, #0x80 */ ARM64("sub x20, x20, #0x80");
    /* 0x00b9fd38: and      x8, x8, #0x8080808080808080 */ ARM64("and x8, x8, #0x8080808080808080");
    /* 0x00b9fd3c: cbz      x8, #0xb9fd28 */ if (x8 == 0) goto loc_00b9fd28;
loc_00b9fd40:
    /* 0x00b9fd40: sub      x10, x8, #1 */ ARM64("sub x10, x8, #1");
    /* 0x00b9fd44: rbit     x11, x8 */ ARM64("rbit x11, x8");
    /* 0x00b9fd48: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b9fd4c: and      x28, x10, x8 */ ARM64("and x28, x10, x8");
    /* 0x00b9fd50: lsl      x8, x11, #1 */ ARM64("lsl x8, x11, #1");
    /* 0x00b9fd54: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00b9fd58: sub      x8, x20, x8 */ ARM64("sub x8, x20, x8");
    /* 0x00b9fd5c: sub      x24, x9, #1 */ ARM64("sub x24, x9, #1");
    /* 0x00b9fd60: ldur     x8, [x8, #-0x10] */ ARM64("ldur x8, [x8, #-0x10]");
loc_00b9fd64:
    /* 0x00b9fd64: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b9fd68: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00b9fd6c: stxr     w11, x10, [x8] */ ARM64("stxr w11, x10, [x8]");
    /* 0x00b9fd70: cbnz     w11, #0xb9fd64 */ if (w11 != 0) goto loc_00b9fd64;
    /* 0x00b9fd74: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00b9fd78: str      x27, [sp, #0x2d0] */ ARM64("str x27, [sp, #0x2d0]");
    /* 0x00b9fd7c: str      x8, [sp, #0x2d8] */ ARM64("str x8, [sp, #0x2d8]");
    /* 0x00b9fd80: adds     x8, x24, #1 */ ARM64("adds x8, x24, #1");
    /* 0x00b9fd84: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00b9fd88: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00b9fd8c: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b9fd90: csel     x23, x8, x9, hi */ ARM64("csel x23, x8, x9, hi");
    /* 0x00b9fd94: mov      x9, #0x5555555555555555 */ ARM64("mov x9, #0x5555555555555555");
    /* 0x00b9fd98: movk     x9, #0x5556 */ ARM64("movk x9, #0x5556");
    /* 0x00b9fd9c: movk     x9, #0x555, lsl #48 */ ARM64("movk x9, #0x555, lsl #48");
    /* 0x00b9fda0: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00b9fda4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b9fda8: b.hi     #0xba0adc */ if (COND_HI) goto loc_00ba0adc;
    /* 0x00b9fdac: add      x8, x23, x23, lsl #1 */ ARM64("add x8, x23, x23, lsl #1");
    /* 0x00b9fdb0: lsl      x22, x8, #3 */ ARM64("lsl x22, x8, #3");
    /* 0x00b9fdb4: cbz      x22, #0xba072c */ if (x22 == 0) goto loc_00ba072c;
    /* 0x00b9fdb8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b9fdbc: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b9fdc0: cbnz     x0, #0xba0734 */ if (x0 != 0) goto loc_00ba0734;
    /* 0x00b9fdc4: b        #0xba77f0 */ goto loc_00ba77f0;
loc_00b9fdc8:
    /* 0x00b9fdc8: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00b9fdcc: adrp     x21, #0xe0e000 */ ARM64("adrp x21, #0xe0e000");
    /* 0x00b9fdd0: add      x21, x21, #0xd10 */ ARM64("add x21, x21, #0xd10");
    /* 0x00b9fdd4: ldr      x20, [sp, #0xe0] */ ARM64("ldr x20, [sp, #0xe0]");
loc_00b9fdd8:
    /* 0x00b9fdd8: ldp      q0, q1, [sp, #0xf0] */ ARM64("ldp q0, q1, [sp, #0xf0]");
    /* 0x00b9fddc: stp      q1, q0, [sp, #0x390] */ ARM64("stp q1, q0, [sp, #0x390]");
    /* 0x00b9fde0: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00b9fde4: cmp      x9, x26 */ ARM64("cmp x9, x26");
    /* 0x00b9fde8: b.ls     #0xb9fe00 */ if (COND_LS) goto loc_00b9fe00;
loc_00b9fdec:
    /* 0x00b9fdec: ldr      x9, [x8, #0x20] */ ARM64("ldr x9, [x8, #0x20]");
    /* 0x00b9fdf0: add      x9, x9, x26, lsl #5 */ ARM64("add x9, x9, x26, lsl #5");
    /* 0x00b9fdf4: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00b9fdf8: cmp      x10, x24 */ ARM64("cmp x10, x24");
    /* 0x00b9fdfc: b.ne     #0xb9fe08 */ if (COND_NE) goto loc_00b9fe08;
loc_00b9fe00:
    /* 0x00b9fe00: mov      x27, #-1 */ ARM64("mov x27, #-1");
    /* 0x00b9fe04: b        #0xb9fe14 */ goto loc_00b9fe14;
loc_00b9fe08:
    /* 0x00b9fe08: ldr      w9, [x9, #0x1c] */ ARM64("ldr w9, [x9, #0x1c]");
    /* 0x00b9fe0c: mov      w10, #-1 */ ARM64("mov w10, #-1");
    /* 0x00b9fe10: orr      x27, x10, x9, lsl #32 */ ARM64("orr x27, x10, x9, lsl #32");
loc_00b9fe14:
    /* 0x00b9fe14: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b9fe18: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00b9fe1c: mov      x10, x21 */ ARM64("mov x10, x21");
loc_00b9fe20:
    /* 0x00b9fe20: ldp      x12, x8, [x8, #0x38] */ ARM64("ldp x12, x8, [x8, #0x38]");
loc_00b9fe24:
    /* 0x00b9fe24: mov      w13, w27 */ ARM64("mov w13, w27");
    /* 0x00b9fe28: cmp      x8, x13 */ ARM64("cmp x8, x13");
    /* 0x00b9fe2c: b.ls     #0xb9fe48 */ if (COND_LS) goto loc_00b9fe48;
    /* 0x00b9fe30: umaddl   x13, w13, w25, x12 */ ARM64("umaddl x13, w13, w25, x12");
    /* 0x00b9fe34: ldr      w14, [x13, #0x20] */ ARM64("ldr w14, [x13, #0x20]");
    /* 0x00b9fe38: and      x15, x27, #0xffffffff00000000 */ ARM64("and x15, x27, #0xffffffff00000000");
    /* 0x00b9fe3c: orr      x27, x15, x14 */ ARM64("orr x27, x15, x14");
    /* 0x00b9fe40: ldr      w28, [x13, #0x2c] */ ARM64("ldr w28, [x13, #0x2c]");
    /* 0x00b9fe44: b        #0xb9fe68 */ goto loc_00b9fe68;
loc_00b9fe48:
    /* 0x00b9fe48: lsr      x13, x27, #0x20 */ ARM64("lsr x13, x27, #0x20");
loc_00b9fe4c:
    /* 0x00b9fe4c: cmp      x8, x13 */ ARM64("cmp x8, x13");
    /* 0x00b9fe50: b.ls     #0xba06e4 */ if (COND_LS) goto loc_00ba06e4;
    /* 0x00b9fe54: madd     x14, x13, x25, x12 */ ARM64("madd x14, x13, x25, x12");
    /* 0x00b9fe58: ldp      w13, w28, [x14, #0x24] */ ARM64("ldp w13, w28, [x14, #0x24]");
    /* 0x00b9fe5c: bfi      x27, x13, #0x20, #0x20 */ ARM64("bfi x27, x13, #0x20, #0x20");
    /* 0x00b9fe60: cmn      w28, #1 */ ARM64("cmn w28, #1");
    /* 0x00b9fe64: b.eq     #0xb9fe4c */ if (COND_EQ) goto loc_00b9fe4c;
loc_00b9fe68:
    /* 0x00b9fe68: cbz      x11, #0xb9fefc */ if (x11 == 0) goto loc_00b9fefc;
    /* 0x00b9fe6c: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00b9fe70: mov      w14, w28 */ ARM64("mov w14, w28");
    /* 0x00b9fe74: mul      x14, x14, x19 */ ARM64("mul x14, x14, x19");
    /* 0x00b9fe78: lsr      x15, x14, #0x39 */ ARM64("lsr x15, x14, #0x39");
    /* 0x00b9fe7c: dup      v0.8b, w15 */ ARM64("dup v0.8b, w15");
    /* 0x00b9fe80: and      x14, x14, x9 */ ARM64("and x14, x14, x9");
    /* 0x00b9fe84: ldr      d1, [x10, x14] */ ARM64("ldr d1, [x10, x14]");
    /* 0x00b9fe88: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b9fe8c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b9fe90: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b9fe94: b.eq     #0xb9fec4 */ if (COND_EQ) goto loc_00b9fec4;
loc_00b9fe98:
    /* 0x00b9fe98: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b9fe9c: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b9fea0: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b9fea4: and      x16, x16, x9 */ ARM64("and x16, x16, x9");
    /* 0x00b9fea8: sub      x16, x10, x16, lsl #2 */ ARM64("sub x16, x10, x16, lsl #2");
    /* 0x00b9feac: ldur     w16, [x16, #-4] */ ARM64("ldur w16, [x16, #-4]");
    /* 0x00b9feb0: cmp      w28, w16 */ ARM64("cmp w28, w16");
    /* 0x00b9feb4: b.eq     #0xb9fe24 */ if (COND_EQ) goto loc_00b9fe24;
    /* 0x00b9feb8: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b9febc: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b9fec0: b.ne     #0xb9fe98 */ if (COND_NE) goto loc_00b9fe98;
loc_00b9fec4:
    /* 0x00b9fec4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b9fec8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b9fecc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b9fed0: fmov     w15, s1 */ ARM64("fmov w15, s1");
    /* 0x00b9fed4: tbnz     w15, #0, #0xb9fefc */ if (((w15 >> #0) & 1) != 0) goto loc_00b9fefc;
    /* 0x00b9fed8: add      x13, x13, #8 */ ARM64("add x13, x13, #8");
    /* 0x00b9fedc: add      x14, x14, x13 */ ARM64("add x14, x14, x13");
    /* 0x00b9fee0: and      x14, x14, x9 */ ARM64("and x14, x14, x9");
    /* 0x00b9fee4: ldr      d1, [x10, x14] */ ARM64("ldr d1, [x10, x14]");
    /* 0x00b9fee8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b9feec: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b9fef0: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b9fef4: b.ne     #0xb9fe98 */ if (COND_NE) goto loc_00b9fe98;
    /* 0x00b9fef8: b        #0xb9fec4 */ goto loc_00b9fec4;
loc_00b9fefc:
    /* 0x00b9fefc: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00b9ff00: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00b9ff04: bl       #0xbaf968 */ CALL_DIRECT(sub_00baf968);
    /* 0x00b9ff08: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00b9ff0c: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00b9ff10: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00b9ff14: mov      w12, w28 */ ARM64("mov w12, w28");
    /* 0x00b9ff18: cmp      x9, x12 */ ARM64("cmp x9, x12");
    /* 0x00b9ff1c: str      x12, [sp, #0xb0] */ ARM64("str x12, [sp, #0xb0]");
    /* 0x00b9ff20: b.ls     #0xb9ff3c */ if (COND_LS) goto loc_00b9ff3c;
    /* 0x00b9ff24: ldr      x9, [x8, #0x20] */ ARM64("ldr x9, [x8, #0x20]");
    /* 0x00b9ff28: add      x9, x9, x12, lsl #5 */ ARM64("add x9, x9, x12, lsl #5");
    /* 0x00b9ff2c: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00b9ff30: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00b9ff34: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00b9ff38: b.ne     #0xb9ff44 */ if (COND_NE) goto loc_00b9ff44;
loc_00b9ff3c:
    /* 0x00b9ff3c: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b9ff40: b        #0xb9ff48 */ goto loc_00b9ff48;
loc_00b9ff44:
    /* 0x00b9ff44: ldr      d0, [x9, #0x18] */ ARM64("ldr d0, [x9, #0x18]");
loc_00b9ff48:
    /* 0x00b9ff48: ldp      x9, x8, [x8, #0x38] */ ARM64("ldp x9, x8, [x8, #0x38]");
    /* 0x00b9ff4c: stur     w28, [x29, #-0x90] */ ARM64("stur w28, [x29, #-0x90]");
    /* 0x00b9ff50: stp      x9, x8, [x29, #-0xa8] */ ARM64("stp x9, x8, [x29, #-0xa8]");
    /* 0x00b9ff54: stur     d0, [x29, #-0x98] */ ARM64("stur d0, [x29, #-0x98]");
    /* 0x00b9ff58: stur     xzr, [x29, #-0xb0] */ ARM64("stur xzr, [x29, #-0xb0]");
    /* 0x00b9ff5c: add      x0, sp, #0x280 */ ARM64("add x0, sp, #0x280");
    /* 0x00b9ff60: sub      x1, x29, #0xb0 */ ARM64("sub x1, x29, #0xb0");
    /* 0x00b9ff64: bl       #0xb9b9f0 */ CALL_DIRECT(sub_00b9b9f0);
    /* 0x00b9ff68: ldr      x11, [sp, #0x290] */ ARM64("ldr x11, [sp, #0x290]");
    /* 0x00b9ff6c: ldr      x8, [sp, #0x288] */ ARM64("ldr x8, [sp, #0x288]");
    /* 0x00b9ff70: cmp      x11, #1 */ ARM64("cmp x11, #1");
    /* 0x00b9ff74: b.ne     #0xb9ff84 */ if (COND_NE) goto loc_00b9ff84;
    /* 0x00b9ff78: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00b9ff7c: ldrb     w9, [x9, #0x18] */ ARM64("ldrb w9, [x9, #0x18]");
    /* 0x00b9ff80: cbnz     w9, #0xba601c */ if (w9 != 0) goto loc_00ba601c;
loc_00b9ff84:
    /* 0x00b9ff84: str      x20, [sp, #0xe0] */ ARM64("str x20, [sp, #0xe0]");
    /* 0x00b9ff88: add      x9, x11, x11, lsl #1 */ ARM64("add x9, x11, x11, lsl #1");
    /* 0x00b9ff8c: lsl      x9, x9, #3 */ ARM64("lsl x9, x9, #3");
    /* 0x00b9ff90: add      x20, x8, x9 */ ARM64("add x20, x8, x9");
loc_00b9ff94:
    /* 0x00b9ff94: cbz      x9, #0xba0038 */ if (x9 == 0) goto loc_00ba0038;
    /* 0x00b9ff98: add      x21, x8, #0x18 */ ARM64("add x21, x8, #0x18");
    /* 0x00b9ff9c: ldr      w10, [x8, #0xc] */ ARM64("ldr w10, [x8, #0xc]");
    /* 0x00b9ffa0: sub      x9, x9, #0x18 */ ARM64("sub x9, x9, #0x18");
    /* 0x00b9ffa4: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00b9ffa8: cmp      w10, w26 */ ARM64("cmp w10, w26");
    /* 0x00b9ffac: b.ne     #0xb9ff94 */ if (COND_NE) goto loc_00b9ff94;
    /* 0x00b9ffb0: str      x11, [sp, #0x70] */ ARM64("str x11, [sp, #0x70]");
    /* 0x00b9ffb4: mov      x24, x22 */ ARM64("mov x24, x22");
    /* 0x00b9ffb8: ldur     w22, [x21, #-8] */ ARM64("ldur w22, [x21, #-8]");
    /* 0x00b9ffbc: mov      w0, #0x10 */ ARM64("mov w0, #0x10");
    /* 0x00b9ffc0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b9ffc4: cbz      x0, #0xba769c */ if (x0 == 0) goto loc_00ba769c;
    /* 0x00b9ffc8: str      w22, [x0] */ ARM64("str w22, [x0]");
    /* 0x00b9ffcc: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00b9ffd0: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b9ffd4: stp      x8, x0, [sp, #0x130] */ ARM64("stp x8, x0, [sp, #0x130]");
loc_00b9ffd8:
    /* 0x00b9ffd8: str      x23, [sp, #0x140] */ ARM64("str x23, [sp, #0x140]");
    /* 0x00b9ffdc: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00b9ffe0: mov      x22, x24 */ ARM64("mov x22, x24");
loc_00b9ffe4:
    /* 0x00b9ffe4: cmp      x8, x20 */ ARM64("cmp x8, x20");
    /* 0x00b9ffe8: b.eq     #0xba006c */ if (COND_EQ) goto loc_00ba006c;
    /* 0x00b9ffec: add      x21, x8, #0x18 */ ARM64("add x21, x8, #0x18");
    /* 0x00b9fff0: ldr      w9, [x8, #0xc] */ ARM64("ldr w9, [x8, #0xc]");
    /* 0x00b9fff4: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00b9fff8: cmp      w9, w26 */ ARM64("cmp w9, w26");
    /* 0x00b9fffc: b.ne     #0xb9ffe4 */ if (COND_NE) goto loc_00b9ffe4;
    /* 0x00ba0000: ldur     w22, [x21, #-8] */ ARM64("ldur w22, [x21, #-8]");
    /* 0x00ba0004: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba0008: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba000c: b.ne     #0xba002c */ if (COND_NE) goto loc_00ba002c;
    /* 0x00ba0010: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0014: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba0018: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00ba001c: mov      w3, #4 */ ARM64("mov w3, #4");
    /* 0x00ba0020: mov      w4, #4 */ ARM64("mov w4, #4");
    /* 0x00ba0024: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00ba0028: ldr      x0, [sp, #0x138] */ ARM64("ldr x0, [sp, #0x138]");
loc_00ba002c:
    /* 0x00ba002c: str      w22, [x0, x23, lsl #2] */ ARM64("str w22, [x0, x23, lsl #2]");
    /* 0x00ba0030: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00ba0034: b        #0xb9ffd8 */ goto loc_00b9ffd8;
loc_00ba0038:
    /* 0x00ba0038: ldr      x20, [sp, #0x128] */ ARM64("ldr x20, [sp, #0x128]");
    /* 0x00ba003c: adrp     x21, #0xe0e000 */ ARM64("adrp x21, #0xe0e000");
    /* 0x00ba0040: add      x21, x21, #0xd10 */ ARM64("add x21, x21, #0xd10");
    /* 0x00ba0044: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba0048: cbz      x8, #0xba0054 */ if (x8 == 0) goto loc_00ba0054;
loc_00ba004c:
    /* 0x00ba004c: ldr      x0, [sp, #0x288] */ ARM64("ldr x0, [sp, #0x288]");
    /* 0x00ba0050: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba0054:
    /* 0x00ba0054: ldr      x8, [x20, #0xd8] */ ARM64("ldr x8, [x20, #0xd8]");
    /* 0x00ba0058: ldr      x11, [sp, #0x3a8] */ ARM64("ldr x11, [sp, #0x3a8]");
    /* 0x00ba005c: ldr      x9, [sp, #0x398] */ ARM64("ldr x9, [sp, #0x398]");
    /* 0x00ba0060: ldr      x10, [sp, #0x390] */ ARM64("ldr x10, [sp, #0x390]");
    /* 0x00ba0064: ldr      x20, [sp, #0xe0] */ ARM64("ldr x20, [sp, #0xe0]");
    /* 0x00ba0068: b        #0xb9fe20 */ goto loc_00b9fe20;
loc_00ba006c:
    /* 0x00ba006c: ldp      x9, x8, [sp, #0x130] */ ARM64("ldp x9, x8, [sp, #0x130]");
    /* 0x00ba0070: stp      x8, x9, [sp, #0xa0] */ ARM64("stp x8, x9, [sp, #0xa0]");
    /* 0x00ba0074: add      x9, x8, x23, lsl #2 */ ARM64("add x9, x8, x23, lsl #2");
    /* 0x00ba0078: str      x9, [sp, #0x78] */ ARM64("str x9, [sp, #0x78]");
    /* 0x00ba007c: mov      x20, #0x5555555555555555 */ ARM64("mov x20, #0x5555555555555555");
    /* 0x00ba0080: movk     x20, #0x5556 */ ARM64("movk x20, #0x5556");
    /* 0x00ba0084: movk     x20, #0x555, lsl #48 */ ARM64("movk x20, #0x555, lsl #48");
loc_00ba0088:
    /* 0x00ba0088: ldr      w23, [x8], #4 */ ARM64("ldr w23, [x8], #4");
    /* 0x00ba008c: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
    /* 0x00ba0090: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0094: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00ba0098: ldr      x9, [x8, #0x40] */ ARM64("ldr x9, [x8, #0x40]");
    /* 0x00ba009c: cmp      x9, x23 */ ARM64("cmp x9, x23");
    /* 0x00ba00a0: b.ls     #0xba7620 */ if (COND_LS) goto loc_00ba7620;
    /* 0x00ba00a4: ldr      x8, [x8, #0x38] */ ARM64("ldr x8, [x8, #0x38]");
    /* 0x00ba00a8: umaddl   x8, w23, w25, x8 */ ARM64("umaddl x8, w23, w25, x8");
    /* 0x00ba00ac: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba00b0: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba00b4: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba00b8: b.eq     #0xba7620 */ if (COND_EQ) goto loc_00ba7620;
    /* 0x00ba00bc: ldr      x21, [x8, #0x10] */ ARM64("ldr x21, [x8, #0x10]");
    /* 0x00ba00c0: sub      x9, x20, #1 */ ARM64("sub x9, x20, #1");
    /* 0x00ba00c4: cmp      x21, x9 */ ARM64("cmp x21, x9");
    /* 0x00ba00c8: b.hi     #0xba0aa0 */ if (COND_HI) goto loc_00ba0aa0;
    /* 0x00ba00cc: mov      x24, x22 */ ARM64("mov x24, x22");
    /* 0x00ba00d0: ldr      x20, [x8, #8] */ ARM64("ldr x20, [x8, #8]");
    /* 0x00ba00d4: add      x8, x21, x21, lsl #1 */ ARM64("add x8, x21, x21, lsl #1");
    /* 0x00ba00d8: lsl      x22, x8, #3 */ ARM64("lsl x22, x8, #3");
    /* 0x00ba00dc: cbz      x22, #0xba00f8 */ if (x22 == 0) goto loc_00ba00f8;
    /* 0x00ba00e0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba00e4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba00e8: cbz      x0, #0xba63c0 */ if (x0 == 0) goto loc_00ba63c0;
    /* 0x00ba00ec: mov      x9, x0 */ ARM64("mov x9, x0");
    /* 0x00ba00f0: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba00f4: b        #0xba0100 */ goto loc_00ba0100;
loc_00ba00f8:
    /* 0x00ba00f8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba00fc: mov      w9, #8 */ ARM64("mov w9, #8");
loc_00ba0100:
    /* 0x00ba0100: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba0104: stp      x8, x9, [sp, #0x130] */ ARM64("stp x8, x9, [sp, #0x130]");
    /* 0x00ba0108: str      xzr, [sp, #0x140] */ ARM64("str xzr, [sp, #0x140]");
    /* 0x00ba010c: lsl      x22, x21, #6 */ ARM64("lsl x22, x21, #6");
    /* 0x00ba0110: lsr      x8, x21, #0x3a */ ARM64("lsr x8, x21, #0x3a");
    /* 0x00ba0114: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba0118: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba011c: ccmp     x22, x8, #2, eq */ ARM64("ccmp x22, x8, #2, eq");
    /* 0x00ba0120: b.hi     #0xba7258 */ if (COND_HI) goto loc_00ba7258;
    /* 0x00ba0124: str      x9, [sp, #0x50] */ ARM64("str x9, [sp, #0x50]");
    /* 0x00ba0128: cbz      x22, #0xba0144 */ if (x22 == 0) goto loc_00ba0144;
    /* 0x00ba012c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba0130: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba0134: cbz      x0, #0xba7250 */ if (x0 == 0) goto loc_00ba7250;
    /* 0x00ba0138: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba013c: mov      x22, x0 */ ARM64("mov x22, x0");
    /* 0x00ba0140: b        #0xba014c */ goto loc_00ba014c;
loc_00ba0144:
    /* 0x00ba0144: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba0148: mov      w22, #8 */ ARM64("mov w22, #8");
loc_00ba014c:
    /* 0x00ba014c: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba0150: str      q0, [sp, #0x2d0] */ ARM64("str q0, [sp, #0x2d0]");
    /* 0x00ba0154: ldr      x9, [sp, #0x140] */ ARM64("ldr x9, [sp, #0x140]");
    /* 0x00ba0158: str      x9, [sp, #0x2e0] */ ARM64("str x9, [sp, #0x2e0]");
    /* 0x00ba015c: str      x8, [sp, #0x2e8] */ ARM64("str x8, [sp, #0x2e8]");
    /* 0x00ba0160: str      x22, [sp, #0x2f0] */ ARM64("str x22, [sp, #0x2f0]");
    /* 0x00ba0164: str      xzr, [sp, #0x2f8] */ ARM64("str xzr, [sp, #0x2f8]");
    /* 0x00ba0168: mov      w8, #0x100 */ ARM64("mov w8, #0x100");
    /* 0x00ba016c: strh     w8, [sp, #0x300] */ ARM64("strh w8, [sp, #0x300]");
    /* 0x00ba0170: str      x22, [sp, #0x68] */ ARM64("str x22, [sp, #0x68]");
    /* 0x00ba0174: cbz      x21, #0xba0418 */ if (x21 == 0) goto loc_00ba0418;
    /* 0x00ba0178: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00ba017c: madd     x8, x21, x8, x20 */ ARM64("madd x8, x21, x8, x20");
    /* 0x00ba0180: str      x8, [sp, #0x38] */ ARM64("str x8, [sp, #0x38]");
    /* 0x00ba0184: ldr      x8, [sp, #0x48] */ ARM64("ldr x8, [sp, #0x48]");
    /* 0x00ba0188: and      x8, x8, #0xffffffffffffff00 */ ARM64("and x8, x8, #0xffffffffffffff00");
    /* 0x00ba018c: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
    /* 0x00ba0190: b        #0xba01a8 */ goto loc_00ba01a8;
loc_00ba0194:
    /* 0x00ba0194: str      x21, [x20] */ ARM64("str x21, [x20]");
    /* 0x00ba0198: ldp      x8, x9, [sp, #0x38] */ ARM64("ldp x8, x9, [sp, #0x38]");
    /* 0x00ba019c: mov      x20, x9 */ ARM64("mov x20, x9");
    /* 0x00ba01a0: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba01a4: b.eq     #0xba0418 */ if (COND_EQ) goto loc_00ba0418;
loc_00ba01a8:
    /* 0x00ba01a8: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00ba01ac: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba01b0: cbz      x0, #0xba63b0 */ if (x0 == 0) goto loc_00ba63b0;
    /* 0x00ba01b4: mov      x24, x0 */ ARM64("mov x24, x0");
    /* 0x00ba01b8: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba01bc: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba01c0: ldr      x9, [sp, #0x48] */ ARM64("ldr x9, [sp, #0x48]");
    /* 0x00ba01c4: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00ba01c8: stp      x9, x8, [x0, #8] */ ARM64("stp x9, x8, [x0, #8]");
    /* 0x00ba01cc: mov      x21, x20 */ ARM64("mov x21, x20");
    /* 0x00ba01d0: ldr      x8, [x21, #8]! */ ARM64("ldr x8, [x21, #8]!");
    /* 0x00ba01d4: cbnz     x8, #0xba0260 */ if (x8 != 0) goto loc_00ba0260;
    /* 0x00ba01d8: ldr      x1, [x20, #0x10] */ ARM64("ldr x1, [x20, #0x10]");
    /* 0x00ba01dc: ldr      x0, [sp, #0x128] */ ARM64("ldr x0, [sp, #0x128]");
    /* 0x00ba01e0: bl       #0xbda060 */ CALL_DIRECT(sub_00bda060);
    /* 0x00ba01e4: cmp      x0, #1 */ ARM64("cmp x0, #1");
    /* 0x00ba01e8: b.ne     #0xba0260 */ if (COND_NE) goto loc_00ba0260;
    /* 0x00ba01ec: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba01f0: ldr      x8, [x9, #0x10] */ ARM64("ldr x8, [x9, #0x10]");
    /* 0x00ba01f4: cmp      x1, x8 */ ARM64("cmp x1, x8");
    /* 0x00ba01f8: b.hs     #0xba7770 */ if (COND_HS) goto loc_00ba7770;
    /* 0x00ba01fc: ldr      x8, [x9, #8] */ ARM64("ldr x8, [x9, #8]");
loc_00ba0200:
    /* 0x00ba0200: ldxr     x9, [x24] */ ARM64("ldxr x9, [x24]");
    /* 0x00ba0204: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba0208: stxr     w11, x10, [x24] */ ARM64("stxr w11, x10, [x24]");
    /* 0x00ba020c: cbnz     w11, #0xba0200 */ if (w11 != 0) goto loc_00ba0200;
    /* 0x00ba0210: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba0214: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba0218: madd     x8, x1, x9, x8 */ ARM64("madd x8, x1, x9, x8");
    /* 0x00ba021c: ldr      x2, [x8, #8] */ ARM64("ldr x2, [x8, #8]");
loc_00ba0220:
    /* 0x00ba0220: ldxr     x8, [x2] */ ARM64("ldxr x8, [x2]");
    /* 0x00ba0224: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba0228: stxr     w10, x9, [x2] */ ARM64("stxr w10, x9, [x2]");
    /* 0x00ba022c: cbnz     w10, #0xba0220 */ if (w10 != 0) goto loc_00ba0220;
    /* 0x00ba0230: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba0234: ldr      x0, [sp, #0x128] */ ARM64("ldr x0, [sp, #0x128]");
    /* 0x00ba0238: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba023c: bl       #0xbda618 */ CALL_DIRECT(sub_00bda618);
    /* 0x00ba0240: cbz      x0, #0xba0260 */ if (x0 == 0) goto loc_00ba0260;
loc_00ba0244:
    /* 0x00ba0244: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba0248: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba024c: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba0250: cbnz     w9, #0xba0244 */ if (w9 != 0) goto loc_00ba0244;
    /* 0x00ba0254: b.ne     #0xba0260 */ if (COND_NE) goto loc_00ba0260;
    /* 0x00ba0258: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba025c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba0260:
    /* 0x00ba0260: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba0264: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba0268: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba026c: cbnz     w10, #0xba0260 */ if (w10 != 0) goto loc_00ba0260;
    /* 0x00ba0270: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba0274: add      x8, x20, #0x48 */ ARM64("add x8, x20, #0x48");
    /* 0x00ba0278: str      x8, [sp, #0x40] */ ARM64("str x8, [sp, #0x40]");
    /* 0x00ba027c: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00ba0280: stp      x8, x24, [sp, #0x130] */ ARM64("stp x8, x24, [sp, #0x130]");
    /* 0x00ba0284: ldr      x22, [sp, #0x2e0] */ ARM64("ldr x22, [sp, #0x2e0]");
    /* 0x00ba0288: ldr      x8, [sp, #0x2d0] */ ARM64("ldr x8, [sp, #0x2d0]");
    /* 0x00ba028c: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba0290: b.ne     #0xba029c */ if (COND_NE) goto loc_00ba029c;
    /* 0x00ba0294: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0298: bl       #0xc6c3c4 */ CALL_DIRECT(sub_00c6c3c4);
loc_00ba029c:
    /* 0x00ba029c: ldr      x8, [sp, #0x2d8] */ ARM64("ldr x8, [sp, #0x2d8]");
    /* 0x00ba02a0: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba02a4: madd     x8, x22, x9, x8 */ ARM64("madd x8, x22, x9, x8");
    /* 0x00ba02a8: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba02ac: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba02b0: ldr      x9, [sp, #0x140] */ ARM64("ldr x9, [sp, #0x140]");
    /* 0x00ba02b4: str      x9, [x8, #0x10] */ ARM64("str x9, [x8, #0x10]");
    /* 0x00ba02b8: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba02bc: str      x8, [sp, #0x2e0] */ ARM64("str x8, [sp, #0x2e0]");
    /* 0x00ba02c0: ldr      q0, [x21] */ ARM64("ldr q0, [x21]");
    /* 0x00ba02c4: str      q0, [sp, #0x130] */ ARM64("str q0, [sp, #0x130]");
    /* 0x00ba02c8: ldr      q0, [x21, #0x10] */ ARM64("ldr q0, [x21, #0x10]");
    /* 0x00ba02cc: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba02d0: ldr      q0, [x21, #0x20] */ ARM64("ldr q0, [x21, #0x20]");
    /* 0x00ba02d4: str      q0, [sp, #0x150] */ ARM64("str q0, [sp, #0x150]");
    /* 0x00ba02d8: ldr      q0, [x21, #0x30] */ ARM64("ldr q0, [x21, #0x30]");
    /* 0x00ba02dc: str      q0, [sp, #0x160] */ ARM64("str q0, [sp, #0x160]");
    /* 0x00ba02e0: stp      xzr, x24, [x20, #8] */ ARM64("stp xzr, x24, [x20, #8]");
    /* 0x00ba02e4: ldr      x21, [sp, #0x2f8] */ ARM64("ldr x21, [sp, #0x2f8]");
    /* 0x00ba02e8: ldr      x8, [sp, #0x2e8] */ ARM64("ldr x8, [sp, #0x2e8]");
    /* 0x00ba02ec: cmp      x21, x8 */ ARM64("cmp x21, x8");
    /* 0x00ba02f0: b.ne     #0xba0300 */ if (COND_NE) goto loc_00ba0300;
    /* 0x00ba02f4: add      x8, sp, #0x2d0 */ ARM64("add x8, sp, #0x2d0");
    /* 0x00ba02f8: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00ba02fc: bl       #0xc73818 */ CALL_DIRECT(sub_00c73818);
loc_00ba0300:
    /* 0x00ba0300: ldr      x8, [sp, #0x2f0] */ ARM64("ldr x8, [sp, #0x2f0]");
    /* 0x00ba0304: add      x8, x8, x21, lsl #6 */ ARM64("add x8, x8, x21, lsl #6");
    /* 0x00ba0308: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba030c: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba0310: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba0314: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba0318: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba031c: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00ba0320: ldr      q0, [sp, #0x160] */ ARM64("ldr q0, [sp, #0x160]");
    /* 0x00ba0324: str      q0, [x8, #0x30] */ ARM64("str q0, [x8, #0x30]");
    /* 0x00ba0328: add      x8, x21, #1 */ ARM64("add x8, x21, #1");
    /* 0x00ba032c: str      x8, [sp, #0x2f8] */ ARM64("str x8, [sp, #0x2f8]");
    /* 0x00ba0330: ldr      x8, [sp, #0x2c8] */ ARM64("ldr x8, [sp, #0x2c8]");
    /* 0x00ba0334: ldr      x22, [sp, #0x68] */ ARM64("ldr x22, [sp, #0x68]");
    /* 0x00ba0338: cbz      x8, #0xba0ab8 */ if (x8 == 0) goto loc_00ba0ab8;
    /* 0x00ba033c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba0340: ldr      x9, [x20] */ ARM64("ldr x9, [x20]");
    /* 0x00ba0344: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00ba0348: mul      x12, x10, x19 */ ARM64("mul x12, x10, x19");
    /* 0x00ba034c: lsr      x13, x12, #0x39 */ ARM64("lsr x13, x12, #0x39");
    /* 0x00ba0350: ldr      x10, [sp, #0x2b8] */ ARM64("ldr x10, [sp, #0x2b8]");
    /* 0x00ba0354: ldr      x11, [sp, #0x2b0] */ ARM64("ldr x11, [sp, #0x2b0]");
    /* 0x00ba0358: dup      v0.8b, w13 */ ARM64("dup v0.8b, w13");
    /* 0x00ba035c: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba0360: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00ba0364: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba0368: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00ba036c: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba0370: b.eq     #0xba03a0 */ if (COND_EQ) goto loc_00ba03a0;
loc_00ba0374:
    /* 0x00ba0374: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00ba0378: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00ba037c: add      x14, x12, x14, lsr #3 */ ARM64("add x14, x12, x14, lsr #3");
    /* 0x00ba0380: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba0384: sub      x14, x11, x14, lsl #4 */ ARM64("sub x14, x11, x14, lsl #4");
    /* 0x00ba0388: ldur     x15, [x14, #-0x10] */ ARM64("ldur x15, [x14, #-0x10]");
    /* 0x00ba038c: cmp      x9, x15 */ ARM64("cmp x9, x15");
    /* 0x00ba0390: b.eq     #0xba03d8 */ if (COND_EQ) goto loc_00ba03d8;
    /* 0x00ba0394: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00ba0398: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00ba039c: b.ne     #0xba0374 */ if (COND_NE) goto loc_00ba0374;
loc_00ba03a0:
    /* 0x00ba03a0: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba03a4: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba03a8: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba03ac: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba03b0: tbnz     w13, #0, #0xba0ab8 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba0ab8;
    /* 0x00ba03b4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba03b8: add      x12, x12, x8 */ ARM64("add x12, x12, x8");
    /* 0x00ba03bc: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba03c0: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00ba03c4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba03c8: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00ba03cc: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba03d0: b.ne     #0xba0374 */ if (COND_NE) goto loc_00ba0374;
    /* 0x00ba03d4: b        #0xba03a0 */ goto loc_00ba03a0;
loc_00ba03d8:
    /* 0x00ba03d8: ldur     x21, [x14, #-8] */ ARM64("ldur x21, [x14, #-8]");
loc_00ba03dc:
    /* 0x00ba03dc: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00ba03e0: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba03e4: stxr     w10, x9, [x21] */ ARM64("stxr w10, x9, [x21]");
    /* 0x00ba03e8: cbnz     w10, #0xba03dc */ if (w10 != 0) goto loc_00ba03dc;
    /* 0x00ba03ec: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba03f0: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
loc_00ba03f4:
    /* 0x00ba03f4: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00ba03f8: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00ba03fc: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00ba0400: cbnz     w10, #0xba03f4 */ if (w10 != 0) goto loc_00ba03f4;
    /* 0x00ba0404: b.ne     #0xba0194 */ if (COND_NE) goto loc_00ba0194;
    /* 0x00ba0408: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba040c: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00ba0410: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba0414: b        #0xba0194 */ goto loc_00ba0194;
loc_00ba0418:
    /* 0x00ba0418: ldr      x8, [sp, #0x2e0] */ ARM64("ldr x8, [sp, #0x2e0]");
    /* 0x00ba041c: mov      x20, #0x5555555555555555 */ ARM64("mov x20, #0x5555555555555555");
    /* 0x00ba0420: movk     x20, #0x5556 */ ARM64("movk x20, #0x5556");
    /* 0x00ba0424: movk     x20, #0x555, lsl #48 */ ARM64("movk x20, #0x555, lsl #48");
    /* 0x00ba0428: cbz      x8, #0xba0448 */ if (x8 == 0) goto loc_00ba0448;
    /* 0x00ba042c: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0430: ldr      x0, [x8, #0xd8] */ ARM64("ldr x0, [x8, #0xd8]");
    /* 0x00ba0434: ldr      x8, [sp, #0x70] */ ARM64("ldr x8, [sp, #0x70]");
    /* 0x00ba0438: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00ba043c: b.ne     #0xba0468 */ if (COND_NE) goto loc_00ba0468;
    /* 0x00ba0440: ldr      x8, [sp, #0xb0] */ ARM64("ldr x8, [sp, #0xb0]");
    /* 0x00ba0444: b        #0xba061c */ goto loc_00ba061c;
loc_00ba0448:
    /* 0x00ba0448: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba044c: bl       #0xbd232c */ CALL_DIRECT(sub_00bd232c);
    /* 0x00ba0450: ldr      x8, [sp, #0x78] */ ARM64("ldr x8, [sp, #0x78]");
    /* 0x00ba0454: ldr      x9, [sp, #0x90] */ ARM64("ldr x9, [sp, #0x90]");
    /* 0x00ba0458: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba045c: mov      x8, x9 */ ARM64("mov x8, x9");
    /* 0x00ba0460: b.ne     #0xba0088 */ if (COND_NE) goto loc_00ba0088;
    /* 0x00ba0464: b        #0xba06b8 */ goto loc_00ba06b8;
loc_00ba0468:
    /* 0x00ba0468: bl       #0xbd8f3c */ CALL_DIRECT(sub_00bd8f3c);
    /* 0x00ba046c: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0470: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00ba0474: ldr      x9, [x8, #0x40] */ ARM64("ldr x9, [x8, #0x40]");
    /* 0x00ba0478: cmp      x9, x23 */ ARM64("cmp x9, x23");
    /* 0x00ba047c: b.ls     #0xba7294 */ if (COND_LS) goto loc_00ba7294;
    /* 0x00ba0480: ldr      x9, [x8, #0x38] */ ARM64("ldr x9, [x8, #0x38]");
    /* 0x00ba0484: umaddl   x9, w23, w25, x9 */ ARM64("umaddl x9, w23, w25, x9");
    /* 0x00ba0488: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00ba048c: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00ba0490: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba0494: b.eq     #0xba7294 */ if (COND_EQ) goto loc_00ba7294;
    /* 0x00ba0498: ldr      w9, [x9, #0x28] */ ARM64("ldr w9, [x9, #0x28]");
    /* 0x00ba049c: ldr      x10, [x8, #0x28] */ ARM64("ldr x10, [x8, #0x28]");
    /* 0x00ba04a0: cmp      x10, x9 */ ARM64("cmp x10, x9");
    /* 0x00ba04a4: b.ls     #0xba77a4 */ if (COND_LS) goto loc_00ba77a4;
    /* 0x00ba04a8: ldr      x10, [x8, #0x20] */ ARM64("ldr x10, [x8, #0x20]");
    /* 0x00ba04ac: add      x9, x10, x9, lsl #5 */ ARM64("add x9, x10, x9, lsl #5");
    /* 0x00ba04b0: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00ba04b4: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba04b8: b.eq     #0xba77a4 */ if (COND_EQ) goto loc_00ba77a4;
    /* 0x00ba04bc: mov      x24, x0 */ ARM64("mov x24, x0");
    /* 0x00ba04c0: ldr      x10, [x9, #0x10] */ ARM64("ldr x10, [x9, #0x10]");
    /* 0x00ba04c4: cbz      x10, #0xba050c */ if (x10 == 0) goto loc_00ba050c;
    /* 0x00ba04c8: ldr      x9, [x9, #8] */ ARM64("ldr x9, [x9, #8]");
    /* 0x00ba04cc: mov      w11, #0x108 */ ARM64("mov w11, #0x108");
    /* 0x00ba04d0: madd     x9, x10, x11, x9 */ ARM64("madd x9, x10, x11, x9");
    /* 0x00ba04d4: ldur     x9, [x9, #-0xf0] */ ARM64("ldur x9, [x9, #-0xf0]");
    /* 0x00ba04d8: sub      x10, x9, #0xc */ ARM64("sub x10, x9, #0xc");
    /* 0x00ba04dc: cmp      x9, #0xb */ ARM64("cmp x9, #0xb");
    /* 0x00ba04e0: mov      w9, #9 */ ARM64("mov w9, #9");
    /* 0x00ba04e4: csel     x9, x10, x9, hi */ ARM64("csel x9, x10, x9, hi");
    /* 0x00ba04e8: cmp      x9, #0xd */ ARM64("cmp x9, #0xd");
    /* 0x00ba04ec: ccmp     x9, #0xa, #4, ne */ ARM64("ccmp x9, #0xa, #4, ne");
    /* 0x00ba04f0: b.ne     #0xba050c */ if (COND_NE) goto loc_00ba050c;
    /* 0x00ba04f4: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba04f8: add      x0, x8, #0x200 */ ARM64("add x0, x8, #0x200");
    /* 0x00ba04fc: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba0500: bl       #0xbaf968 */ CALL_DIRECT(sub_00baf968);
    /* 0x00ba0504: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0508: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
loc_00ba050c:
    /* 0x00ba050c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0510: add      x1, x8, #0x18 */ ARM64("add x1, x8, #0x18");
    /* 0x00ba0514: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00ba0518: bl       #0xbd9618 */ CALL_DIRECT(sub_00bd9618);
    /* 0x00ba051c: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba0520: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00ba0524: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba0528: b.eq     #0xba72fc */ if (COND_EQ) goto loc_00ba72fc;
    /* 0x00ba052c: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba0530: stp      q0, q1, [x29, #-0xf0] */ ARM64("stp q0, q1, [x29, #-0xf0]");
    /* 0x00ba0534: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0538: ldr      x23, [x8, #0xd8] */ ARM64("ldr x23, [x8, #0xd8]");
    /* 0x00ba053c: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00ba0540: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba0544: cbz      x0, #0xba7314 */ if (x0 == 0) goto loc_00ba7314;
    /* 0x00ba0548: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00ba054c: add      x9, sp, #0x130 */ ARM64("add x9, sp, #0x130");
    /* 0x00ba0550: stur     q0, [x9, #4] */ ARM64("stur q0, [x9, #4]");
    /* 0x00ba0554: ldur     x8, [x29, #-0xe0] */ ARM64("ldur x8, [x29, #-0xe0]");
    /* 0x00ba0558: stur     x8, [x9, #0x14] */ ARM64("stur x8, [x9, #0x14]");
    /* 0x00ba055c: str      w26, [x0] */ ARM64("str w26, [x0]");
    /* 0x00ba0560: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba0564: stur     q0, [x0, #4] */ ARM64("stur q0, [x0, #4]");
    /* 0x00ba0568: add      x8, sp, #0x3d */ ARM64("add x8, sp, #0x3d");
    /* 0x00ba056c: ldur     q0, [x8, #0xff] */ ARM64("ldur q0, [x8, #0xff]");
    /* 0x00ba0570: str      q0, [x0, #0x10] */ ARM64("str q0, [x0, #0x10]");
    /* 0x00ba0574: strb     wzr, [x0, #0x20] */ ARM64("strb wzr, [x0, #0x20]");
    /* 0x00ba0578: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba057c: stp      x8, x0, [sp, #0x130] */ ARM64("stp x8, x0, [sp, #0x130]");
    /* 0x00ba0580: str      x8, [sp, #0x140] */ ARM64("str x8, [sp, #0x140]");
    /* 0x00ba0584: add      x0, sp, #0x298 */ ARM64("add x0, sp, #0x298");
    /* 0x00ba0588: add      x3, sp, #0x130 */ ARM64("add x3, sp, #0x130");
    /* 0x00ba058c: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba0590: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba0594: bl       #0xbd9184 */ CALL_DIRECT(sub_00bd9184);
    /* 0x00ba0598: ldr      x23, [sp, #0x2a0] */ ARM64("ldr x23, [sp, #0x2a0]");
    /* 0x00ba059c: ldr      x8, [sp, #0x2a8] */ ARM64("ldr x8, [sp, #0x2a8]");
    /* 0x00ba05a0: add      x0, x23, #8 */ ARM64("add x0, x23, #8");
    /* 0x00ba05a4: add      x20, x8, #1 */ ARM64("add x20, x8, #1");
loc_00ba05a8:
    /* 0x00ba05a8: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00ba05ac: b.eq     #0xba05c0 */ if (COND_EQ) goto loc_00ba05c0;
    /* 0x00ba05b0: add      x22, x0, #0x28 */ ARM64("add x22, x0, #0x28");
    /* 0x00ba05b4: bl       #0xb9dd40 */ CALL_DIRECT(sub_00b9dd40);
    /* 0x00ba05b8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba05bc: b        #0xba05a8 */ goto loc_00ba05a8;
loc_00ba05c0:
    /* 0x00ba05c0: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba05c4: ldr      x22, [sp, #0x68] */ ARM64("ldr x22, [sp, #0x68]");
    /* 0x00ba05c8: cbz      x8, #0xba05d4 */ if (x8 == 0) goto loc_00ba05d4;
    /* 0x00ba05cc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba05d0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba05d4:
    /* 0x00ba05d4: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba05d8: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00ba05dc: ldurb    w9, [x29, #-0xd8] */ ARM64("ldurb w9, [x29, #-0xd8]");
    /* 0x00ba05e0: strb     w9, [sp, #0x148] */ ARM64("strb w9, [sp, #0x148]");
    /* 0x00ba05e4: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba05e8: stp      xzr, x9, [sp, #0x130] */ ARM64("stp xzr, x9, [sp, #0x130]");
    /* 0x00ba05ec: str      xzr, [sp, #0x140] */ ARM64("str xzr, [sp, #0x140]");
    /* 0x00ba05f0: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00ba05f4: add      x3, sp, #0x130 */ ARM64("add x3, sp, #0x130");
    /* 0x00ba05f8: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00ba05fc: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba0600: bl       #0xbd929c */ CALL_DIRECT(sub_00bd929c);
    /* 0x00ba0604: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba0608: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba060c: bl       #0xbaf968 */ CALL_DIRECT(sub_00baf968);
    /* 0x00ba0610: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba0614: ldr      x0, [x8, #0xd8] */ ARM64("ldr x0, [x8, #0xd8]");
    /* 0x00ba0618: mov      w8, w24 */ ARM64("mov w8, w24");
loc_00ba061c:
    /* 0x00ba061c: ldr      x9, [x0, #0x28] */ ARM64("ldr x9, [x0, #0x28]");
    /* 0x00ba0620: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba0624: b.ls     #0xba7308 */ if (COND_LS) goto loc_00ba7308;
    /* 0x00ba0628: ldr      x9, [x0, #0x20] */ ARM64("ldr x9, [x0, #0x20]");
    /* 0x00ba062c: add      x23, x9, x8, lsl #5 */ ARM64("add x23, x9, x8, lsl #5");
    /* 0x00ba0630: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00ba0634: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00ba0638: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba063c: b.eq     #0xba7308 */ if (COND_EQ) goto loc_00ba7308;
    /* 0x00ba0640: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba0644: add      x10, sp, #0x130 */ ARM64("add x10, sp, #0x130");
    /* 0x00ba0648: stp      q0, q1, [x10, #0x20] */ ARM64("stp q0, q1, [x10, #0x20]");
    /* 0x00ba064c: ldr      q0, [sp, #0x2f0] */ ARM64("ldr q0, [sp, #0x2f0]");
    /* 0x00ba0650: stur     q0, [x10, #0x40] */ ARM64("stur q0, [x10, #0x40]");
    /* 0x00ba0654: ldr      x9, [sp, #0x300] */ ARM64("ldr x9, [sp, #0x300]");
    /* 0x00ba0658: stur     x9, [x10, #0x50] */ ARM64("stur x9, [x10, #0x50]");
    /* 0x00ba065c: mov      w9, #0xf */ ARM64("mov w9, #0xf");
    /* 0x00ba0660: str      x9, [sp, #0x148] */ ARM64("str x9, [sp, #0x148]");
    /* 0x00ba0664: ldr      x20, [x23, #0x10] */ ARM64("ldr x20, [x23, #0x10]");
    /* 0x00ba0668: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba066c: b.ne     #0xba0678 */ if (COND_NE) goto loc_00ba0678;
    /* 0x00ba0670: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba0674: bl       #0xc6c42c */ CALL_DIRECT(sub_00c6c42c);
loc_00ba0678:
    /* 0x00ba0678: ldr      x8, [x23, #8] */ ARM64("ldr x8, [x23, #8]");
    /* 0x00ba067c: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00ba0680: madd     x0, x20, x9, x8 */ ARM64("madd x0, x20, x9, x8");
    /* 0x00ba0684: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba0688: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00ba068c: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00ba0690: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba0694: str      x8, [x23, #0x10] */ ARM64("str x8, [x23, #0x10]");
    /* 0x00ba0698: mov      x20, #0x5555555555555555 */ ARM64("mov x20, #0x5555555555555555");
    /* 0x00ba069c: movk     x20, #0x5556 */ ARM64("movk x20, #0x5556");
    /* 0x00ba06a0: movk     x20, #0x555, lsl #48 */ ARM64("movk x20, #0x555, lsl #48");
    /* 0x00ba06a4: ldr      x8, [sp, #0x78] */ ARM64("ldr x8, [sp, #0x78]");
    /* 0x00ba06a8: ldr      x9, [sp, #0x90] */ ARM64("ldr x9, [sp, #0x90]");
    /* 0x00ba06ac: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba06b0: mov      x8, x9 */ ARM64("mov x8, x9");
    /* 0x00ba06b4: b.ne     #0xba0088 */ if (COND_NE) goto loc_00ba0088;
loc_00ba06b8:
    /* 0x00ba06b8: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00ba06bc: cbz      x8, #0xba06c8 */ if (x8 == 0) goto loc_00ba06c8;
    /* 0x00ba06c0: ldr      x0, [sp, #0xa0] */ ARM64("ldr x0, [sp, #0xa0]");
    /* 0x00ba06c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba06c8:
    /* 0x00ba06c8: ldr      x20, [sp, #0x128] */ ARM64("ldr x20, [sp, #0x128]");
    /* 0x00ba06cc: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba06d0: adrp     x21, #0xe0e000 */ ARM64("adrp x21, #0xe0e000");
    /* 0x00ba06d4: add      x21, x21, #0xd10 */ ARM64("add x21, x21, #0xd10");
    /* 0x00ba06d8: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba06dc: cbnz     x8, #0xba004c */ if (x8 != 0) goto loc_00ba004c;
    /* 0x00ba06e0: b        #0xba0054 */ goto loc_00ba0054;
loc_00ba06e4:
    /* 0x00ba06e4: cbz      x9, #0xba0708 */ if (x9 == 0) goto loc_00ba0708;
    /* 0x00ba06e8: lsl      x8, x9, #2 */ ARM64("lsl x8, x9, #2");
    /* 0x00ba06ec: add      x8, x8, #0xb */ ARM64("add x8, x8, #0xb");
    /* 0x00ba06f0: and      x8, x8, #0xfffffffffffffff8 */ ARM64("and x8, x8, #0xfffffffffffffff8");
    /* 0x00ba06f4: add      x9, x9, x8 */ ARM64("add x9, x9, x8");
    /* 0x00ba06f8: cmn      x9, #9 */ ARM64("cmn x9, #9");
    /* 0x00ba06fc: b.eq     #0xba0708 */ if (COND_EQ) goto loc_00ba0708;
    /* 0x00ba0700: sub      x0, x10, x8 */ ARM64("sub x0, x10, x8");
    /* 0x00ba0704: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba0708:
    /* 0x00ba0708: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba070c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba0710: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00ba0714: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba0718: ldr      x8, [sp, #0xd0] */ ARM64("ldr x8, [sp, #0xd0]");
    /* 0x00ba071c: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba0720: ldp      q1, q0, [sp, #0xf0] */ ARM64("ldp q1, q0, [sp, #0xf0]");
    /* 0x00ba0724: b.ne     #0xb9fb0c */ if (COND_NE) goto loc_00b9fb0c;
    /* 0x00ba0728: b        #0xba0a74 */ goto loc_00ba0a74;
loc_00ba072c:
    /* 0x00ba072c: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00ba0730: mov      w0, #8 */ ARM64("mov w0, #8");
loc_00ba0734:
    /* 0x00ba0734: ldr      q0, [sp, #0x2d0] */ ARM64("ldr q0, [sp, #0x2d0]");
    /* 0x00ba0738: str      q0, [x0] */ ARM64("str q0, [x0]");
    /* 0x00ba073c: ldr      x8, [sp, #0x2e0] */ ARM64("ldr x8, [sp, #0x2e0]");
    /* 0x00ba0740: str      x8, [x0, #0x10] */ ARM64("str x8, [x0, #0x10]");
    /* 0x00ba0744: stp      x23, x0, [x29, #-0xb0] */ ARM64("stp x23, x0, [x29, #-0xb0]");
    /* 0x00ba0748: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba074c: stur     x8, [x29, #-0xa0] */ ARM64("stur x8, [x29, #-0xa0]");
    /* 0x00ba0750: str      x0, [sp, #0x30] */ ARM64("str x0, [sp, #0x30]");
    /* 0x00ba0754: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00ba0758: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00ba075c: b        #0xba0780 */ goto loc_00ba0780;
loc_00ba0760:
    /* 0x00ba0760: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba0764: madd     x9, x23, x9, x8 */ ARM64("madd x9, x23, x9, x8");
    /* 0x00ba0768: ldr      q0, [sp, #0x2d0] */ ARM64("ldr q0, [sp, #0x2d0]");
    /* 0x00ba076c: ldr      x10, [sp, #0x2e0] */ ARM64("ldr x10, [sp, #0x2e0]");
    /* 0x00ba0770: str      x10, [x9, #0x10] */ ARM64("str x10, [x9, #0x10]");
    /* 0x00ba0774: str      q0, [x9] */ ARM64("str q0, [x9]");
    /* 0x00ba0778: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00ba077c: stur     x23, [x29, #-0xa0] */ ARM64("stur x23, [x29, #-0xa0]");
loc_00ba0780:
    /* 0x00ba0780: cbz      x24, #0xba0810 */ if (x24 == 0) goto loc_00ba0810;
    /* 0x00ba0784: cbnz     x28, #0xba07a0 */ if (x28 != 0) goto loc_00ba07a0;
loc_00ba0788:
    /* 0x00ba0788: ldr      d0, [x21], #8 */ ARM64("ldr d0, [x21], #8");
    /* 0x00ba078c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba0790: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00ba0794: sub      x20, x20, #0x80 */ ARM64("sub x20, x20, #0x80");
    /* 0x00ba0798: and      x28, x9, #0x8080808080808080 */ ARM64("and x28, x9, #0x8080808080808080");
    /* 0x00ba079c: cbz      x28, #0xba0788 */ if (x28 == 0) goto loc_00ba0788;
loc_00ba07a0:
    /* 0x00ba07a0: sub      x9, x28, #1 */ ARM64("sub x9, x28, #1");
    /* 0x00ba07a4: rbit     x10, x28 */ ARM64("rbit x10, x28");
    /* 0x00ba07a8: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba07ac: and      x28, x9, x28 */ ARM64("and x28, x9, x28");
    /* 0x00ba07b0: lsl      x9, x10, #1 */ ARM64("lsl x9, x10, #1");
    /* 0x00ba07b4: and      x9, x9, #0xf0 */ ARM64("and x9, x9, #0xf0");
    /* 0x00ba07b8: sub      x9, x20, x9 */ ARM64("sub x9, x20, x9");
    /* 0x00ba07bc: sub      x24, x24, #1 */ ARM64("sub x24, x24, #1");
    /* 0x00ba07c0: ldur     x9, [x9, #-0x10] */ ARM64("ldur x9, [x9, #-0x10]");
loc_00ba07c4:
    /* 0x00ba07c4: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00ba07c8: add      x11, x10, #1 */ ARM64("add x11, x10, #1");
    /* 0x00ba07cc: stxr     w12, x11, [x9] */ ARM64("stxr w12, x11, [x9]");
    /* 0x00ba07d0: cbnz     w12, #0xba07c4 */ if (w12 != 0) goto loc_00ba07c4;
    /* 0x00ba07d4: tbnz     x10, #0x3f, #0xba724c */ if (((x10 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba07d8: str      x27, [sp, #0x2d0] */ ARM64("str x27, [sp, #0x2d0]");
    /* 0x00ba07dc: str      x9, [sp, #0x2d8] */ ARM64("str x9, [sp, #0x2d8]");
    /* 0x00ba07e0: ldur     x9, [x29, #-0xb0] */ ARM64("ldur x9, [x29, #-0xb0]");
    /* 0x00ba07e4: cmp      x23, x9 */ ARM64("cmp x23, x9");
    /* 0x00ba07e8: b.ne     #0xba0760 */ if (COND_NE) goto loc_00ba0760;
    /* 0x00ba07ec: adds     x8, x24, #1 */ ARM64("adds x8, x24, #1");
    /* 0x00ba07f0: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00ba07f4: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba07f8: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba07fc: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00ba0800: mov      w4, #0x18 */ ARM64("mov w4, #0x18");
    /* 0x00ba0804: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00ba0808: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00ba080c: b        #0xba0760 */ goto loc_00ba0760;
loc_00ba0810:
    /* 0x00ba0810: ldur     q0, [x29, #-0xb0] */ ARM64("ldur q0, [x29, #-0xb0]");
    /* 0x00ba0814: stur     q0, [x29, #-0xf0] */ ARM64("stur q0, [x29, #-0xf0]");
    /* 0x00ba0818: ldur     x8, [x29, #-0xa0] */ ARM64("ldur x8, [x29, #-0xa0]");
    /* 0x00ba081c: stur     x8, [x29, #-0xe0] */ ARM64("stur x8, [x29, #-0xe0]");
    /* 0x00ba0820: ldr      x27, [sp, #0x2c8] */ ARM64("ldr x27, [sp, #0x2c8]");
    /* 0x00ba0824: cbz      x27, #0xba09b0 */ if (x27 == 0) goto loc_00ba09b0;
    /* 0x00ba0828: ldr      x21, [sp, #0x2b0] */ ARM64("ldr x21, [sp, #0x2b0]");
    /* 0x00ba082c: ldr      d0, [x21] */ ARM64("ldr d0, [x21]");
    /* 0x00ba0830: add      x24, x21, #8 */ ARM64("add x24, x21, #8");
    /* 0x00ba0834: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba0838: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba083c: ands     x8, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x8, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba0840: b.ne     #0xba085c */ if (COND_NE) goto loc_00ba085c;
loc_00ba0844:
    /* 0x00ba0844: ldr      d0, [x24], #8 */ ARM64("ldr d0, [x24], #8");
    /* 0x00ba0848: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba084c: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba0850: sub      x21, x21, #0x80 */ ARM64("sub x21, x21, #0x80");
    /* 0x00ba0854: and      x8, x8, #0x8080808080808080 */ ARM64("and x8, x8, #0x8080808080808080");
    /* 0x00ba0858: cbz      x8, #0xba0844 */ if (x8 == 0) goto loc_00ba0844;
loc_00ba085c:
    /* 0x00ba085c: sub      x9, x8, #1 */ ARM64("sub x9, x8, #1");
    /* 0x00ba0860: and      x20, x9, x8 */ ARM64("and x20, x9, x8");
    /* 0x00ba0864: sub      x28, x27, #1 */ ARM64("sub x28, x27, #1");
    /* 0x00ba0868: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00ba086c: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00ba0870: lsl      x8, x8, #1 */ ARM64("lsl x8, x8, #1");
    /* 0x00ba0874: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00ba0878: sub      x8, x21, x8 */ ARM64("sub x8, x21, x8");
    /* 0x00ba087c: ldur     x8, [x8, #-8] */ ARM64("ldur x8, [x8, #-8]");
loc_00ba0880:
    /* 0x00ba0880: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00ba0884: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba0888: stxr     w11, x10, [x8] */ ARM64("stxr w11, x10, [x8]");
    /* 0x00ba088c: cbnz     w11, #0xba0880 */ if (w11 != 0) goto loc_00ba0880;
    /* 0x00ba0890: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba0894: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba0898: str      xzr, [sp, #0x2d0] */ ARM64("str xzr, [sp, #0x2d0]");
    /* 0x00ba089c: str      x8, [sp, #0x2d8] */ ARM64("str x8, [sp, #0x2d8]");
    /* 0x00ba08a0: adds     x8, x28, #1 */ ARM64("adds x8, x28, #1");
    /* 0x00ba08a4: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00ba08a8: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00ba08ac: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00ba08b0: csel     x23, x8, x9, hi */ ARM64("csel x23, x8, x9, hi");
    /* 0x00ba08b4: lsr      x8, x8, #0x3a */ ARM64("lsr x8, x8, #0x3a");
    /* 0x00ba08b8: cbnz     x8, #0xba7868 */ if (x8 != 0) goto loc_00ba7868;
    /* 0x00ba08bc: lsl      x22, x23, #6 */ ARM64("lsl x22, x23, #6");
    /* 0x00ba08c0: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba08c4: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba08c8: b.hi     #0xba7868 */ if (COND_HI) goto loc_00ba7868;
    /* 0x00ba08cc: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba08d0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba08d4: cbz      x0, #0xba7860 */ if (x0 == 0) goto loc_00ba7860;
    /* 0x00ba08d8: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba08dc: stp      q0, q1, [x0] */ ARM64("stp q0, q1, [x0]");
    /* 0x00ba08e0: ldp      q0, q1, [sp, #0x2f0] */ ARM64("ldp q0, q1, [sp, #0x2f0]");
    /* 0x00ba08e4: stp      q0, q1, [x0, #0x20] */ ARM64("stp q0, q1, [x0, #0x20]");
    /* 0x00ba08e8: stp      x23, x0, [x29, #-0xb0] */ ARM64("stp x23, x0, [x29, #-0xb0]");
    /* 0x00ba08ec: str      x0, [sp, #0x28] */ ARM64("str x0, [sp, #0x28]");
    /* 0x00ba08f0: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00ba08f4: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00ba08f8: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00ba08fc: stur     x9, [x29, #-0xa0] */ ARM64("stur x9, [x29, #-0xa0]");
    /* 0x00ba0900: b        #0xba0920 */ goto loc_00ba0920;
loc_00ba0904:
    /* 0x00ba0904: add      x9, x8, x23, lsl #6 */ ARM64("add x9, x8, x23, lsl #6");
    /* 0x00ba0908: ldp      q0, q1, [sp, #0x2f0] */ ARM64("ldp q0, q1, [sp, #0x2f0]");
    /* 0x00ba090c: ldp      q3, q2, [sp, #0x2d0] */ ARM64("ldp q3, q2, [sp, #0x2d0]");
    /* 0x00ba0910: stp      q0, q1, [x9, #0x20] */ ARM64("stp q0, q1, [x9, #0x20]");
    /* 0x00ba0914: stp      q3, q2, [x9] */ ARM64("stp q3, q2, [x9]");
    /* 0x00ba0918: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00ba091c: stur     x23, [x29, #-0xa0] */ ARM64("stur x23, [x29, #-0xa0]");
loc_00ba0920:
    /* 0x00ba0920: cbz      x28, #0xba09bc */ if (x28 == 0) goto loc_00ba09bc;
    /* 0x00ba0924: cbnz     x20, #0xba0940 */ if (x20 != 0) goto loc_00ba0940;
loc_00ba0928:
    /* 0x00ba0928: ldr      d0, [x24], #8 */ ARM64("ldr d0, [x24], #8");
    /* 0x00ba092c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba0930: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00ba0934: sub      x21, x21, #0x80 */ ARM64("sub x21, x21, #0x80");
    /* 0x00ba0938: and      x20, x9, #0x8080808080808080 */ ARM64("and x20, x9, #0x8080808080808080");
    /* 0x00ba093c: cbz      x20, #0xba0928 */ if (x20 == 0) goto loc_00ba0928;
loc_00ba0940:
    /* 0x00ba0940: sub      x9, x20, #1 */ ARM64("sub x9, x20, #1");
    /* 0x00ba0944: rbit     x10, x20 */ ARM64("rbit x10, x20");
    /* 0x00ba0948: and      x20, x9, x20 */ ARM64("and x20, x9, x20");
    /* 0x00ba094c: sub      x28, x28, #1 */ ARM64("sub x28, x28, #1");
    /* 0x00ba0950: clz      x9, x10 */ ARM64("clz x9, x10");
    /* 0x00ba0954: lsl      x9, x9, #1 */ ARM64("lsl x9, x9, #1");
    /* 0x00ba0958: and      x9, x9, #0xf0 */ ARM64("and x9, x9, #0xf0");
    /* 0x00ba095c: sub      x9, x21, x9 */ ARM64("sub x9, x21, x9");
    /* 0x00ba0960: ldur     x9, [x9, #-8] */ ARM64("ldur x9, [x9, #-8]");
loc_00ba0964:
    /* 0x00ba0964: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00ba0968: add      x11, x10, #1 */ ARM64("add x11, x10, #1");
    /* 0x00ba096c: stxr     w12, x11, [x9] */ ARM64("stxr w12, x11, [x9]");
    /* 0x00ba0970: cbnz     w12, #0xba0964 */ if (w12 != 0) goto loc_00ba0964;
    /* 0x00ba0974: tbnz     x10, #0x3f, #0xba724c */ if (((x10 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba0978: str      xzr, [sp, #0x2d0] */ ARM64("str xzr, [sp, #0x2d0]");
    /* 0x00ba097c: str      x9, [sp, #0x2d8] */ ARM64("str x9, [sp, #0x2d8]");
    /* 0x00ba0980: ldur     x9, [x29, #-0xb0] */ ARM64("ldur x9, [x29, #-0xb0]");
    /* 0x00ba0984: cmp      x23, x9 */ ARM64("cmp x23, x9");
    /* 0x00ba0988: b.ne     #0xba0904 */ if (COND_NE) goto loc_00ba0904;
    /* 0x00ba098c: adds     x8, x28, #1 */ ARM64("adds x8, x28, #1");
    /* 0x00ba0990: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00ba0994: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba0998: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba099c: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00ba09a0: mov      w4, #0x40 */ ARM64("mov w4, #0x40");
    /* 0x00ba09a4: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00ba09a8: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00ba09ac: b        #0xba0904 */ goto loc_00ba0904;
loc_00ba09b0:
    /* 0x00ba09b0: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba09b4: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba09b8: b        #0xba09c0 */ goto loc_00ba09c0;
loc_00ba09bc:
    /* 0x00ba09bc: ldur     x9, [x29, #-0xb0] */ ARM64("ldur x9, [x29, #-0xb0]");
loc_00ba09c0:
    /* 0x00ba09c0: ldr      x21, [sp, #0x128] */ ARM64("ldr x21, [sp, #0x128]");
    /* 0x00ba09c4: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba09c8: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00ba09cc: add      x11, sp, #0x130 */ ARM64("add x11, sp, #0x130");
    /* 0x00ba09d0: stur     q0, [x11, #0x20] */ ARM64("stur q0, [x11, #0x20]");
    /* 0x00ba09d4: ldur     x10, [x29, #-0xe0] */ ARM64("ldur x10, [x29, #-0xe0]");
    /* 0x00ba09d8: stur     x10, [x11, #0x30] */ ARM64("stur x10, [x11, #0x30]");
    /* 0x00ba09dc: stp      x8, x27, [sp, #0x170] */ ARM64("stp x8, x27, [sp, #0x170]");
    /* 0x00ba09e0: mov      w8, #0x100 */ ARM64("mov w8, #0x100");
    /* 0x00ba09e4: strh     w8, [sp, #0x180] */ ARM64("strh w8, [sp, #0x180]");
    /* 0x00ba09e8: str      x9, [sp, #0x168] */ ARM64("str x9, [sp, #0x168]");
    /* 0x00ba09ec: mov      w8, #0xf */ ARM64("mov w8, #0xf");
    /* 0x00ba09f0: str      x8, [sp, #0x148] */ ARM64("str x8, [sp, #0x148]");
    /* 0x00ba09f4: ldr      x24, [sp, #0xb0] */ ARM64("ldr x24, [sp, #0xb0]");
    /* 0x00ba09f8: ldr      x20, [x24, #0x10] */ ARM64("ldr x20, [x24, #0x10]");
    /* 0x00ba09fc: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba0a00: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba0a04: b.ne     #0xba0a10 */ if (COND_NE) goto loc_00ba0a10;
    /* 0x00ba0a08: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba0a0c: bl       #0xc6c42c */ CALL_DIRECT(sub_00c6c42c);
loc_00ba0a10:
    /* 0x00ba0a10: ldr      x22, [x24, #8] */ ARM64("ldr x22, [x24, #8]");
    /* 0x00ba0a14: cbz      x20, #0xba0a2c */ if (x20 == 0) goto loc_00ba0a2c;
    /* 0x00ba0a18: add      x8, x20, x20, lsl #5 */ ARM64("add x8, x20, x20, lsl #5");
    /* 0x00ba0a1c: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00ba0a20: add      x0, x22, #0x108 */ ARM64("add x0, x22, #0x108");
    /* 0x00ba0a24: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba0a28: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
loc_00ba0a2c:
    /* 0x00ba0a2c: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba0a30: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba0a34: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00ba0a38: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00ba0a3c: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba0a40: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba0a44: ldr      x8, [x21, #0xd8] */ ARM64("ldr x8, [x21, #0xd8]");
    /* 0x00ba0a48: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba0a4c: adrp     x21, #0xe0e000 */ ARM64("adrp x21, #0xe0e000");
    /* 0x00ba0a50: add      x21, x21, #0xd10 */ ARM64("add x21, x21, #0xd10");
    /* 0x00ba0a54: ldr      x20, [sp, #0xe0] */ ARM64("ldr x20, [sp, #0xe0]");
    /* 0x00ba0a58: ldr      x22, [sp, #0x68] */ ARM64("ldr x22, [sp, #0x68]");
    /* 0x00ba0a5c: ldp      q0, q1, [sp, #0xf0] */ ARM64("ldp q0, q1, [sp, #0xf0]");
    /* 0x00ba0a60: stp      q1, q0, [sp, #0x390] */ ARM64("stp q1, q0, [sp, #0x390]");
    /* 0x00ba0a64: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00ba0a68: cmp      x9, x26 */ ARM64("cmp x9, x26");
    /* 0x00ba0a6c: b.hi     #0xb9fdec */ if (COND_HI) goto loc_00b9fdec;
    /* 0x00ba0a70: b        #0xb9fe00 */ goto loc_00b9fe00;
loc_00ba0a74:
    /* 0x00ba0a74: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba0a78: cbz      x8, #0xba0a84 */ if (x8 == 0) goto loc_00ba0a84;
    /* 0x00ba0a7c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba0a80: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba0a84:
    /* 0x00ba0a84: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba0a88: ldp      x9, x8, [x8, #0x38] */ ARM64("ldp x9, x8, [x8, #0x38]");
    /* 0x00ba0a8c: add      x20, x9, #0x10 */ ARM64("add x20, x9, #0x10");
    /* 0x00ba0a90: add      x8, x8, x8, lsl #1 */ ARM64("add x8, x8, x8, lsl #1");
    /* 0x00ba0a94: lsl      x21, x8, #4 */ ARM64("lsl x21, x8, #4");
    /* 0x00ba0a98: mov      x22, #-0x8000000000000000 */ ARM64("mov x22, #-0x8000000000000000");
    /* 0x00ba0a9c: b        #0xba0b00 */ goto loc_00ba0b00;
loc_00ba0aa0:
    /* 0x00ba0aa0: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba0aa4: ldr      x1, [sp, #0x50] */ ARM64("ldr x1, [sp, #0x50]");
loc_00ba0aa8:
    /* 0x00ba0aa8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba0aac: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba0ab0: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba0ab4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba0ab8:
    /* 0x00ba0ab8: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba0abc: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba0ac0: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba0ac4: add      x2, x2, #0x788 */ ARM64("add x2, x2, #0x788");
    /* 0x00ba0ac8: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba0acc: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba0ad0: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba0ad4: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba0ad8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba0adc:
    /* 0x00ba0adc: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00ba0ae0:
    /* 0x00ba0ae0: ldr      x1, [sp, #0x30] */ ARM64("ldr x1, [sp, #0x30]");
    /* 0x00ba0ae4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba0ae8: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba0aec: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba0af0: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba0af4:
    /* 0x00ba0af4: bl       #0xbd84b8 */ CALL_DIRECT(sub_00bd84b8);
loc_00ba0af8:
    /* 0x00ba0af8: add      x20, x20, #0x30 */ ARM64("add x20, x20, #0x30");
    /* 0x00ba0afc: sub      x21, x21, #0x30 */ ARM64("sub x21, x21, #0x30");
loc_00ba0b00:
    /* 0x00ba0b00: cbz      x21, #0xba0b30 */ if (x21 == 0) goto loc_00ba0b30;
    /* 0x00ba0b04: ldur     x8, [x20, #-0x10] */ ARM64("ldur x8, [x20, #-0x10]");
    /* 0x00ba0b08: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00ba0b0c: b.eq     #0xba0af8 */ if (COND_EQ) goto loc_00ba0af8;
    /* 0x00ba0b10: ldr      x1, [x20] */ ARM64("ldr x1, [x20]");
    /* 0x00ba0b14: cmp      x1, #2 */ ARM64("cmp x1, #2");
    /* 0x00ba0b18: b.lo     #0xba0af8 */ if (COND_LO) goto loc_00ba0af8;
    /* 0x00ba0b1c: ldur     x0, [x20, #-8] */ ARM64("ldur x0, [x20, #-8]");
    /* 0x00ba0b20: cmp      x1, #0x15 */ ARM64("cmp x1, #0x15");
    /* 0x00ba0b24: b.lo     #0xba0af4 */ if (COND_LO) goto loc_00ba0af4;
    /* 0x00ba0b28: bl       #0xbd7360 */ CALL_DIRECT(sub_00bd7360);
    /* 0x00ba0b2c: b        #0xba0af8 */ goto loc_00ba0af8;
loc_00ba0b30:
    /* 0x00ba0b30: ldr      x21, [x28, #0xd8] */ ARM64("ldr x21, [x28, #0xd8]");
    /* 0x00ba0b34: ldr      x2, [x21, #0x48] */ ARM64("ldr x2, [x21, #0x48]");
    /* 0x00ba0b38: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0b3c: mov      w1, #0xc8 */ ARM64("mov w1, #0xc8");
    /* 0x00ba0b40: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00ba0b44: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00ba0b48: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba0b4c: stp      q0, q1, [sp, #0x2b0] */ ARM64("stp q0, q1, [sp, #0x2b0]");
    /* 0x00ba0b50: ldp      x9, x8, [x21, #0x20] */ ARM64("ldp x9, x8, [x21, #0x20]");
    /* 0x00ba0b54: add      x10, x9, x8, lsl #5 */ ARM64("add x10, x9, x8, lsl #5");
    /* 0x00ba0b58: mov      x14, #-0x8000000000000000 */ ARM64("mov x14, #-0x8000000000000000");
    /* 0x00ba0b5c: stp      x9, x10, [sp, #0xa8] */ ARM64("stp x9, x10, [sp, #0xa8]");
    /* 0x00ba0b60: str      x21, [sp, #0xc0] */ ARM64("str x21, [sp, #0xc0]");
    /* 0x00ba0b64: b        #0xba0b70 */ goto loc_00ba0b70;
loc_00ba0b68:
    /* 0x00ba0b68: ldr      x10, [sp, #0xb0] */ ARM64("ldr x10, [sp, #0xb0]");
    /* 0x00ba0b6c: ldp      x9, x11, [sp, #0xd8] */ ARM64("ldp x9, x11, [sp, #0xd8]");
loc_00ba0b70:
    /* 0x00ba0b70: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba0b74: b.eq     #0xba1b20 */ if (COND_EQ) goto loc_00ba1b20;
    /* 0x00ba0b78: mov      x12, x11 */ ARM64("mov x12, x11");
    /* 0x00ba0b7c: ldr      x8, [x9], #0x20 */ ARM64("ldr x8, [x9], #0x20");
    /* 0x00ba0b80: add      x11, x11, #1 */ ARM64("add x11, x11, #1");
    /* 0x00ba0b84: cmp      x8, x14 */ ARM64("cmp x8, x14");
    /* 0x00ba0b88: b.eq     #0xba0b70 */ if (COND_EQ) goto loc_00ba0b70;
    /* 0x00ba0b8c: ldr      x8, [x21, #0x28] */ ARM64("ldr x8, [x21, #0x28]");
    /* 0x00ba0b90: mov      w11, w12 */ ARM64("mov w11, w12");
    /* 0x00ba0b94: cmp      x8, x11 */ ARM64("cmp x8, x11");
    /* 0x00ba0b98: b.ls     #0xba7538 */ if (COND_LS) goto loc_00ba7538;
    /* 0x00ba0b9c: ldr      x8, [x21, #0x20] */ ARM64("ldr x8, [x21, #0x20]");
    /* 0x00ba0ba0: add      x20, x8, x11, lsl #5 */ ARM64("add x20, x8, x11, lsl #5");
    /* 0x00ba0ba4: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x00ba0ba8: cmp      x8, x14 */ ARM64("cmp x8, x14");
    /* 0x00ba0bac: b.eq     #0xba7538 */ if (COND_EQ) goto loc_00ba7538;
    /* 0x00ba0bb0: str      x12, [sp, #0x100] */ ARM64("str x12, [sp, #0x100]");
    /* 0x00ba0bb4: add      x8, x12, #1 */ ARM64("add x8, x12, #1");
    /* 0x00ba0bb8: stp      x9, x8, [sp, #0xd8] */ ARM64("stp x9, x8, [sp, #0xd8]");
    /* 0x00ba0bbc: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00ba0bc0: str      x11, [sp, #0xf0] */ ARM64("str x11, [sp, #0xf0]");
    /* 0x00ba0bc4: mul      x11, x11, x19 */ ARM64("mul x11, x11, x19");
    /* 0x00ba0bc8: lsr      x22, x11, #0x39 */ ARM64("lsr x22, x11, #0x39");
    /* 0x00ba0bcc: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba0bd0: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba0bd4: dup      v8.8b, w22 */ ARM64("dup v8.8b, w22");
    /* 0x00ba0bd8: str      x11, [sp, #0xd0] */ ARM64("str x11, [sp, #0xd0]");
    /* 0x00ba0bdc: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba0be0: ldr      d0, [x8, x11] */ ARM64("ldr d0, [x8, x11]");
    /* 0x00ba0be4: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba0be8: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba0bec: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba0bf0: b.eq     #0xba0c2c */ if (COND_EQ) goto loc_00ba0c2c;
loc_00ba0bf4:
    /* 0x00ba0bf4: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba0bf8: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba0bfc: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba0c00: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba0c04: mov      w14, #0xc8 */ ARM64("mov w14, #0xc8");
    /* 0x00ba0c08: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00ba0c0c: add      x21, x8, x13 */ ARM64("add x21, x8, x13");
    /* 0x00ba0c10: ldur     w13, [x21, #-0xc8] */ ARM64("ldur w13, [x21, #-0xc8]");
    /* 0x00ba0c14: ldr      x14, [sp, #0x100] */ ARM64("ldr x14, [sp, #0x100]");
    /* 0x00ba0c18: cmp      w13, w14 */ ARM64("cmp w13, w14");
    /* 0x00ba0c1c: b.eq     #0xba0dc0 */ if (COND_EQ) goto loc_00ba0dc0;
    /* 0x00ba0c20: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba0c24: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba0c28: b.ne     #0xba0bf4 */ if (COND_NE) goto loc_00ba0bf4;
loc_00ba0c2c:
    /* 0x00ba0c2c: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba0c30: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba0c34: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba0c38: fmov     w12, s0 */ ARM64("fmov w12, s0");
    /* 0x00ba0c3c: tbnz     w12, #0, #0xba0c64 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba0c64;
    /* 0x00ba0c40: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00ba0c44: add      x11, x11, x10 */ ARM64("add x11, x11, x10");
    /* 0x00ba0c48: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba0c4c: ldr      d0, [x8, x11] */ ARM64("ldr d0, [x8, x11]");
    /* 0x00ba0c50: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba0c54: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba0c58: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba0c5c: b.ne     #0xba0bf4 */ if (COND_NE) goto loc_00ba0bf4;
    /* 0x00ba0c60: b        #0xba0c2c */ goto loc_00ba0c2c;
loc_00ba0c64:
    /* 0x00ba0c64: ldr      x10, [sp, #0x2c0] */ ARM64("ldr x10, [sp, #0x2c0]");
    /* 0x00ba0c68: cbz      x10, #0xba1ae4 */ if (x10 == 0) goto loc_00ba1ae4;
loc_00ba0c6c:
    /* 0x00ba0c6c: adrp     x10, #0xefc000 */ ARM64("adrp x10, #0xefc000");
    /* 0x00ba0c70: add      x10, x10, #0x958 */ ARM64("add x10, x10, #0x958");
    /* 0x00ba0c74: ldp      q0, q1, [x10] */ ARM64("ldp q0, q1, [x10]");
    /* 0x00ba0c78: add      x10, sp, #0x130 */ ARM64("add x10, sp, #0x130");
    /* 0x00ba0c7c: stp      q0, q1, [x10, #0x20] */ ARM64("stp q0, q1, [x10, #0x20]");
    /* 0x00ba0c80: stp      q0, q1, [sp, #0x2d0] */ ARM64("stp q0, q1, [sp, #0x2d0]");
    /* 0x00ba0c84: add      x11, sp, #0x2d0 */ ARM64("add x11, sp, #0x2d0");
    /* 0x00ba0c88: stp      q0, q1, [x11, #0x20] */ ARM64("stp q0, q1, [x11, #0x20]");
    /* 0x00ba0c8c: stp      q0, q1, [x11, #0x40] */ ARM64("stp q0, q1, [x11, #0x40]");
    /* 0x00ba0c90: stp      q0, q1, [x11, #0x60] */ ARM64("stp q0, q1, [x11, #0x60]");
    /* 0x00ba0c94: stp      q0, q1, [x11, #0x80] */ ARM64("stp q0, q1, [x11, #0x80]");
    /* 0x00ba0c98: ldp      q0, q1, [sp, #0x150] */ ARM64("ldp q0, q1, [sp, #0x150]");
    /* 0x00ba0c9c: stp      q0, q1, [x11, #0xa0] */ ARM64("stp q0, q1, [x11, #0xa0]");
    /* 0x00ba0ca0: ldp      q0, q1, [sp, #0x350] */ ARM64("ldp q0, q1, [sp, #0x350]");
    /* 0x00ba0ca4: stur     q0, [x10, #0x84] */ ARM64("stur q0, [x10, #0x84]");
    /* 0x00ba0ca8: stur     q1, [x10, #0x94] */ ARM64("stur q1, [x10, #0x94]");
    /* 0x00ba0cac: ldp      q0, q1, [sp, #0x370] */ ARM64("ldp q0, q1, [sp, #0x370]");
    /* 0x00ba0cb0: stur     q0, [x10, #0xa4] */ ARM64("stur q0, [x10, #0xa4]");
    /* 0x00ba0cb4: stur     q1, [x10, #0xb4] */ ARM64("stur q1, [x10, #0xb4]");
    /* 0x00ba0cb8: ldp      q0, q1, [sp, #0x330] */ ARM64("ldp q0, q1, [sp, #0x330]");
    /* 0x00ba0cbc: stur     q0, [x10, #0x64] */ ARM64("stur q0, [x10, #0x64]");
    /* 0x00ba0cc0: stur     q1, [x10, #0x74] */ ARM64("stur q1, [x10, #0x74]");
    /* 0x00ba0cc4: ldp      q0, q1, [sp, #0x310] */ ARM64("ldp q0, q1, [sp, #0x310]");
    /* 0x00ba0cc8: stur     q0, [x10, #0x44] */ ARM64("stur q0, [x10, #0x44]");
    /* 0x00ba0ccc: stur     q1, [x10, #0x54] */ ARM64("stur q1, [x10, #0x54]");
    /* 0x00ba0cd0: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba0cd4: stur     q0, [x10, #4] */ ARM64("stur q0, [x10, #4]");
    /* 0x00ba0cd8: stur     q1, [x10, #0x14] */ ARM64("stur q1, [x10, #0x14]");
    /* 0x00ba0cdc: ldp      q0, q1, [sp, #0x2f0] */ ARM64("ldp q0, q1, [sp, #0x2f0]");
    /* 0x00ba0ce0: stur     q0, [x10, #0x24] */ ARM64("stur q0, [x10, #0x24]");
    /* 0x00ba0ce4: stur     q1, [x10, #0x34] */ ARM64("stur q1, [x10, #0x34]");
    /* 0x00ba0ce8: ldr      x10, [sp, #0xd0] */ ARM64("ldr x10, [sp, #0xd0]");
    /* 0x00ba0cec: and      x10, x9, x10 */ ARM64("and x10, x9, x10");
    /* 0x00ba0cf0: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba0cf4: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba0cf8: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba0cfc: cbz      x12, #0xba1ac0 */ if (x12 == 0) goto loc_00ba1ac0;
loc_00ba0d00:
    /* 0x00ba0d00: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00ba0d04: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba0d08: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00ba0d0c: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00ba0d10: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00ba0d14: tbz      w10, #0x1f, #0xba1b00 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00ba1b00;
loc_00ba0d18:
    /* 0x00ba0d18: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00ba0d1c: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00ba0d20: strb     w22, [x8, x11] */ ARM64("strb w22, [x8, x11]");
    /* 0x00ba0d24: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba0d28: strb     w22, [x9, #8] */ ARM64("strb w22, [x9, #8]");
    /* 0x00ba0d2c: mov      w9, #0xc8 */ ARM64("mov w9, #0xc8");
    /* 0x00ba0d30: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00ba0d34: add      x21, x8, x9 */ ARM64("add x21, x8, x9");
    /* 0x00ba0d38: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00ba0d3c: ldr      x9, [sp, #0x100] */ ARM64("ldr x9, [sp, #0x100]");
    /* 0x00ba0d40: stur     w9, [x21, #-0xc8] */ ARM64("stur w9, [x21, #-0xc8]");
    /* 0x00ba0d44: ldr      q0, [sp, #0x1c0] */ ARM64("ldr q0, [sp, #0x1c0]");
    /* 0x00ba0d48: stur     q0, [x21, #-0x34] */ ARM64("stur q0, [x21, #-0x34]");
    /* 0x00ba0d4c: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00ba0d50: stur     q0, [x21, #-0x24] */ ARM64("stur q0, [x21, #-0x24]");
    /* 0x00ba0d54: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00ba0d58: stur     q0, [x21, #-0x14] */ ARM64("stur q0, [x21, #-0x14]");
    /* 0x00ba0d5c: ldr      w9, [sp, #0x1f0] */ ARM64("ldr w9, [sp, #0x1f0]");
    /* 0x00ba0d60: stur     w9, [x21, #-4] */ ARM64("stur w9, [x21, #-4]");
    /* 0x00ba0d64: ldr      q0, [sp, #0x180] */ ARM64("ldr q0, [sp, #0x180]");
    /* 0x00ba0d68: stur     q0, [x21, #-0x74] */ ARM64("stur q0, [x21, #-0x74]");
    /* 0x00ba0d6c: ldr      q0, [sp, #0x190] */ ARM64("ldr q0, [sp, #0x190]");
    /* 0x00ba0d70: stur     q0, [x21, #-0x64] */ ARM64("stur q0, [x21, #-0x64]");
    /* 0x00ba0d74: ldr      q0, [sp, #0x1a0] */ ARM64("ldr q0, [sp, #0x1a0]");
    /* 0x00ba0d78: stur     q0, [x21, #-0x54] */ ARM64("stur q0, [x21, #-0x54]");
    /* 0x00ba0d7c: ldr      q0, [sp, #0x1b0] */ ARM64("ldr q0, [sp, #0x1b0]");
    /* 0x00ba0d80: stur     q0, [x21, #-0x44] */ ARM64("stur q0, [x21, #-0x44]");
    /* 0x00ba0d84: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba0d88: stur     q0, [x21, #-0xb4] */ ARM64("stur q0, [x21, #-0xb4]");
    /* 0x00ba0d8c: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba0d90: stur     q0, [x21, #-0xa4] */ ARM64("stur q0, [x21, #-0xa4]");
    /* 0x00ba0d94: ldr      q0, [sp, #0x160] */ ARM64("ldr q0, [sp, #0x160]");
    /* 0x00ba0d98: stur     q0, [x21, #-0x94] */ ARM64("stur q0, [x21, #-0x94]");
    /* 0x00ba0d9c: ldr      q0, [sp, #0x170] */ ARM64("ldr q0, [sp, #0x170]");
    /* 0x00ba0da0: stur     q0, [x21, #-0x84] */ ARM64("stur q0, [x21, #-0x84]");
    /* 0x00ba0da4: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba0da8: stur     q0, [x21, #-0xc4] */ ARM64("stur q0, [x21, #-0xc4]");
    /* 0x00ba0dac: ldr      q0, [sp, #0x2c0] */ ARM64("ldr q0, [sp, #0x2c0]");
    /* 0x00ba0db0: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba0db4: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00ba0db8: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba0dbc: str      q0, [sp, #0x2c0] */ ARM64("str q0, [sp, #0x2c0]");
loc_00ba0dc0:
    /* 0x00ba0dc0: ldr      x8, [x20, #0x10] */ ARM64("ldr x8, [x20, #0x10]");
    /* 0x00ba0dc4: cbz      x8, #0xba13a8 */ if (x8 == 0) goto loc_00ba13a8;
    /* 0x00ba0dc8: ldr      x20, [x20, #8] */ ARM64("ldr x20, [x20, #8]");
    /* 0x00ba0dcc: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00ba0dd0: madd     x8, x8, x9, x20 */ ARM64("madd x8, x8, x9, x20");
    /* 0x00ba0dd4: str      x8, [sp, #0x110] */ ARM64("str x8, [sp, #0x110]");
    /* 0x00ba0dd8: b        #0xba0de8 */ goto loc_00ba0de8;
loc_00ba0ddc:
    /* 0x00ba0ddc: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba0de0: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba0de4: b.eq     #0xba13a8 */ if (COND_EQ) goto loc_00ba13a8;
loc_00ba0de8:
    /* 0x00ba0de8: mov      x22, x20 */ ARM64("mov x22, x20");
    /* 0x00ba0dec: add      x20, x20, #0x108 */ ARM64("add x20, x20, #0x108");
    /* 0x00ba0df0: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00ba0df4: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00ba0df8: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00ba0dfc: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00ba0e00: csel     x10, x9, x8, hi */ ARM64("csel x10, x9, x8, hi");
    /* 0x00ba0e04: mov      w8, #0x10 */ ARM64("mov w8, #0x10");
    /* 0x00ba0e08: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba0e0c: adrp     x13, #0xe06000 */ ARM64("adrp x13, #0xe06000");
    /* 0x00ba0e10: add      x13, x13, #0x3dd */ ARM64("add x13, x13, #0x3dd");
    /* 0x00ba0e14: adr      x11, #0xba0e24 */ ARM64("adr x11, #0xba0e24");
    /* 0x00ba0e18: ldrb     w12, [x13, x10] */ ARM64("ldrb w12, [x13, x10]");
    /* 0x00ba0e1c: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00ba0e20: br       x11 */ ARM64("br x11");
loc_00ba0e24:
    /* 0x00ba0e24: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba0e28: str      xzr, [sp, #0x2d0] */ ARM64("str xzr, [sp, #0x2d0]");
    /* 0x00ba0e2c: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba0e30: str      x8, [sp, #0x2d8] */ ARM64("str x8, [sp, #0x2d8]");
    /* 0x00ba0e34: str      xzr, [sp, #0x2e0] */ ARM64("str xzr, [sp, #0x2e0]");
    /* 0x00ba0e38: b        #0xba0fb0 */ goto loc_00ba0fb0;
    /* 0x00ba0e3c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0e40: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0e44: bl       #0xb8c08c */ CALL_DIRECT(sub_00b8c08c);
    /* 0x00ba0e48: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0e4c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0e50: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0e54: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba0e58: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0e5c: ldr      x1, [x22, #0x38] */ ARM64("ldr x1, [x22, #0x38]");
    /* 0x00ba0e60: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0e64: bl       #0xb8b79c */ CALL_DIRECT(sub_00b8b79c);
    /* 0x00ba0e68: ldp      x8, x9, [sp, #0x130] */ ARM64("ldp x8, x9, [sp, #0x130]");
    /* 0x00ba0e6c: ldr      x10, [sp, #0x140] */ ARM64("ldr x10, [sp, #0x140]");
    /* 0x00ba0e70: add      x10, x9, x10, lsl #3 */ ARM64("add x10, x9, x10, lsl #3");
    /* 0x00ba0e74: ldp      x11, x12, [x22, #0x28] */ ARM64("ldp x11, x12, [x22, #0x28]");
    /* 0x00ba0e78: add      x12, x11, x12, lsl #6 */ ARM64("add x12, x11, x12, lsl #6");
    /* 0x00ba0e7c: stp      x9, x8, [sp, #0x190] */ ARM64("stp x9, x8, [sp, #0x190]");
    /* 0x00ba0e80: str      x10, [sp, #0x1a0] */ ARM64("str x10, [sp, #0x1a0]");
    /* 0x00ba0e84: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba0e88: stp      x8, xzr, [sp, #0x130] */ ARM64("stp x8, xzr, [sp, #0x130]");
    /* 0x00ba0e8c: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
    /* 0x00ba0e90: stp      x11, x12, [sp, #0x178] */ ARM64("stp x11, x12, [sp, #0x178]");
    /* 0x00ba0e94: str      x9, [sp, #0x188] */ ARM64("str x9, [sp, #0x188]");
    /* 0x00ba0e98: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0e9c: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba0ea0: bl       #0xb755ac */ CALL_DIRECT(sub_00b755ac);
    /* 0x00ba0ea4: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0ea8: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0eac: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0eb0: bl       #0xb84c48 */ CALL_DIRECT(sub_00b84c48);
    /* 0x00ba0eb4: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0eb8: ldr      x1, [x22, #0x50] */ ARM64("ldr x1, [x22, #0x50]");
    /* 0x00ba0ebc: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0ec0: bl       #0xb8b79c */ CALL_DIRECT(sub_00b8b79c);
    /* 0x00ba0ec4: ldp      x8, x9, [sp, #0x130] */ ARM64("ldp x8, x9, [sp, #0x130]");
    /* 0x00ba0ec8: ldr      x10, [sp, #0x140] */ ARM64("ldr x10, [sp, #0x140]");
    /* 0x00ba0ecc: add      x10, x9, x10, lsl #3 */ ARM64("add x10, x9, x10, lsl #3");
    /* 0x00ba0ed0: ldp      x11, x12, [x22, #0x40] */ ARM64("ldp x11, x12, [x22, #0x40]");
    /* 0x00ba0ed4: add      x12, x11, x12, lsl #6 */ ARM64("add x12, x11, x12, lsl #6");
    /* 0x00ba0ed8: stp      x9, x8, [sp, #0x190] */ ARM64("stp x9, x8, [sp, #0x190]");
    /* 0x00ba0edc: str      x10, [sp, #0x1a0] */ ARM64("str x10, [sp, #0x1a0]");
    /* 0x00ba0ee0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba0ee4: stp      x8, xzr, [sp, #0x130] */ ARM64("stp x8, xzr, [sp, #0x130]");
    /* 0x00ba0ee8: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
    /* 0x00ba0eec: stp      x11, x12, [sp, #0x178] */ ARM64("stp x11, x12, [sp, #0x178]");
    /* 0x00ba0ef0: str      x9, [sp, #0x188] */ ARM64("str x9, [sp, #0x188]");
    /* 0x00ba0ef4: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0ef8: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba0efc: bl       #0xb755ac */ CALL_DIRECT(sub_00b755ac);
    /* 0x00ba0f00: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0f04: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0f08: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0f0c: bl       #0xb956bc */ CALL_DIRECT(sub_00b956bc);
    /* 0x00ba0f10: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0f14: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0f18: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0f1c: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba0f20: ldp      x25, x23, [sp, #0x130] */ ARM64("ldp x25, x23, [sp, #0x130]");
    /* 0x00ba0f24: ldr      x24, [sp, #0x140] */ ARM64("ldr x24, [sp, #0x140]");
    /* 0x00ba0f28: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba0f2c: add      x1, x22, #0x60 */ ARM64("add x1, x22, #0x60");
    /* 0x00ba0f30: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba0f34: add      x8, x23, x24, lsl #3 */ ARM64("add x8, x23, x24, lsl #3");
    /* 0x00ba0f38: ldp      x9, x10, [sp, #0x130] */ ARM64("ldp x9, x10, [sp, #0x130]");
    /* 0x00ba0f3c: ldr      x11, [sp, #0x140] */ ARM64("ldr x11, [sp, #0x140]");
    /* 0x00ba0f40: add      x11, x10, x11, lsl #3 */ ARM64("add x11, x10, x11, lsl #3");
    /* 0x00ba0f44: stp      x23, x23, [sp, #0x130] */ ARM64("stp x23, x23, [sp, #0x130]");
    /* 0x00ba0f48: stp      x25, x8, [sp, #0x140] */ ARM64("stp x25, x8, [sp, #0x140]");
    /* 0x00ba0f4c: stp      x10, x10, [sp, #0x150] */ ARM64("stp x10, x10, [sp, #0x150]");
    /* 0x00ba0f50: stp      x9, x11, [sp, #0x160] */ ARM64("stp x9, x11, [sp, #0x160]");
    /* 0x00ba0f54: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0f58: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba0f5c: bl       #0xb77430 */ CALL_DIRECT(sub_00b77430);
    /* 0x00ba0f60: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0f64: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0f68: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0f6c: bl       #0xb93d28 */ CALL_DIRECT(sub_00b93d28);
    /* 0x00ba0f70: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0f74: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0f78: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba0f7c: bl       #0xb837cc */ CALL_DIRECT(sub_00b837cc);
    /* 0x00ba0f80: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0f84: mov      w9, #0x40 */ ARM64("mov w9, #0x40");
    /* 0x00ba0f88: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00ba0f8c: ldr      x1, [x22, x9] */ ARM64("ldr x1, [x22, x9]");
    /* 0x00ba0f90: ldr      x2, [x22, x8] */ ARM64("ldr x2, [x22, x8]");
    /* 0x00ba0f94: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0f98: bl       #0xb85668 */ CALL_DIRECT(sub_00b85668);
    /* 0x00ba0f9c: b        #0xba0fac */ goto loc_00ba0fac;
    /* 0x00ba0fa0: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba0fa4: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba0fa8: bl       #0xb84e38 */ CALL_DIRECT(sub_00b84e38);
loc_00ba0fac:
    /* 0x00ba0fac: ldr      x27, [sp, #0x2d0] */ ARM64("ldr x27, [sp, #0x2d0]");
loc_00ba0fb0:
    /* 0x00ba0fb0: ldr      x28, [sp, #0x2d8] */ ARM64("ldr x28, [sp, #0x2d8]");
    /* 0x00ba0fb4: ldr      x23, [sp, #0x2e0] */ ARM64("ldr x23, [sp, #0x2e0]");
    /* 0x00ba0fb8: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00ba0fbc: lsr      x8, x8, #1 */ ARM64("lsr x8, x8, #1");
    /* 0x00ba0fc0: ldp      x10, x9, [x21, #-0xb0] */ ARM64("ldp x10, x9, [x21, #-0xb0]");
    /* 0x00ba0fc4: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00ba0fc8: csel     x1, x23, x8, eq */ ARM64("csel x1, x23, x8, eq");
    /* 0x00ba0fcc: cmp      x1, x10 */ ARM64("cmp x1, x10");
    /* 0x00ba0fd0: b.hi     #0xba1388 */ if (COND_HI) goto loc_00ba1388;
loc_00ba0fd4:
    /* 0x00ba0fd4: add      x25, x28, x23, lsl #3 */ ARM64("add x25, x28, x23, lsl #3");
    /* 0x00ba0fd8: mov      x23, x28 */ ARM64("mov x23, x28");
    /* 0x00ba0fdc: b        #0xba10b8 */ goto loc_00ba10b8;
loc_00ba0fe0:
    /* 0x00ba0fe0: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba0fe4: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba0fe8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba0fec: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba0ff0: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba0ff4: b.eq     #0xba102c */ if (COND_EQ) goto loc_00ba102c;
    /* 0x00ba0ff8: ldr      x16, [x26] */ ARM64("ldr x16, [x26]");
loc_00ba0ffc:
    /* 0x00ba0ffc: rbit     x17, x15 */ ARM64("rbit x17, x15");
    /* 0x00ba1000: clz      x17, x17 */ ARM64("clz x17, x17");
    /* 0x00ba1004: add      x17, x14, x17, lsr #3 */ ARM64("add x17, x14, x17, lsr #3");
    /* 0x00ba1008: and      x17, x17, x10 */ ARM64("and x17, x17, x10");
    /* 0x00ba100c: sub      x17, x8, x17, lsl #3 */ ARM64("sub x17, x8, x17, lsl #3");
    /* 0x00ba1010: ldur     x17, [x17, #-8] */ ARM64("ldur x17, [x17, #-8]");
    /* 0x00ba1014: ldr      x17, [x17] */ ARM64("ldr x17, [x17]");
    /* 0x00ba1018: cmp      x16, x17 */ ARM64("cmp x16, x17");
    /* 0x00ba101c: b.eq     #0xba10b8 */ if (COND_EQ) goto loc_00ba10b8;
    /* 0x00ba1020: sub      x17, x15, #1 */ ARM64("sub x17, x15, #1");
    /* 0x00ba1024: ands     x15, x17, x15 */ ARM64("ands x15, x17, x15");
    /* 0x00ba1028: b.ne     #0xba0ffc */ if (COND_NE) goto loc_00ba0ffc;
loc_00ba102c:
    /* 0x00ba102c: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba1030: b.eq     #0xba1050 */ if (COND_EQ) goto loc_00ba1050;
    /* 0x00ba1034: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba1038: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba103c: cbz      x11, #0xba106c */ if (x11 == 0) goto loc_00ba106c;
    /* 0x00ba1040: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1044: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1048: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba104c: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba1050:
    /* 0x00ba1050: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba1054: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba1058: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba105c: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba1060: tbnz     w13, #0, #0xba107c */ if (((w13 >> #0) & 1) != 0) goto loc_00ba107c;
    /* 0x00ba1064: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba1068: b        #0xba1070 */ goto loc_00ba1070;
loc_00ba106c:
    /* 0x00ba106c: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba1070:
    /* 0x00ba1070: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba1074: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba1078: b        #0xba0fe0 */ goto loc_00ba0fe0;
loc_00ba107c:
    /* 0x00ba107c: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba1080: tbz      w12, #0x1f, #0xba1104 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba1104;
loc_00ba1084:
    /* 0x00ba1084: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba1088: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba108c: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba1090: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba1094: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba1098: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba109c: ldur     q0, [x21, #-0xb0] */ ARM64("ldur q0, [x21, #-0xb0]");
    /* 0x00ba10a0: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba10a4: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba10a8: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba10ac: stur     q0, [x21, #-0xb0] */ ARM64("stur q0, [x21, #-0xb0]");
    /* 0x00ba10b0: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00ba10b4: stur     x26, [x8, #-8] */ ARM64("stur x26, [x8, #-8]");
loc_00ba10b8:
    /* 0x00ba10b8: cmp      x23, x25 */ ARM64("cmp x23, x25");
    /* 0x00ba10bc: b.eq     #0xba1124 */ if (COND_EQ) goto loc_00ba1124;
    /* 0x00ba10c0: ldr      x26, [x23], #8 */ ARM64("ldr x26, [x23], #8");
    /* 0x00ba10c4: ldr      x24, [x26] */ ARM64("ldr x24, [x26]");
    /* 0x00ba10c8: ldur     x8, [x21, #-0xb0] */ ARM64("ldur x8, [x21, #-0xb0]");
    /* 0x00ba10cc: cbz      x8, #0xba10f0 */ if (x8 == 0) goto loc_00ba10f0;
loc_00ba10d0:
    /* 0x00ba10d0: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba10d4: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba10d8: add      x8, x24, #8 */ ARM64("add x8, x24, #8");
    /* 0x00ba10dc: mul      x14, x8, x19 */ ARM64("mul x14, x8, x19");
    /* 0x00ba10e0: ldp      x8, x10, [x21, #-0xc0] */ ARM64("ldp x8, x10, [x21, #-0xc0]");
    /* 0x00ba10e4: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba10e8: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba10ec: b        #0xba0fe0 */ goto loc_00ba0fe0;
loc_00ba10f0:
    /* 0x00ba10f0: sub      x0, x21, #0xc0 */ ARM64("sub x0, x21, #0xc0");
    /* 0x00ba10f4: sub      x2, x21, #0xa0 */ ARM64("sub x2, x21, #0xa0");
    /* 0x00ba10f8: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba10fc: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba1100: b        #0xba10d0 */ goto loc_00ba10d0;
loc_00ba1104:
    /* 0x00ba1104: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba1108: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba110c: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba1110: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1114: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1118: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba111c: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba1120: b        #0xba1084 */ goto loc_00ba1084;
loc_00ba1124:
    /* 0x00ba1124: cbz      x27, #0xba1130 */ if (x27 == 0) goto loc_00ba1130;
    /* 0x00ba1128: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba112c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba1130:
    /* 0x00ba1130: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00ba1134: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00ba1138: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00ba113c: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00ba1140: csel     x10, x9, x8, hi */ ARM64("csel x10, x9, x8, hi");
    /* 0x00ba1144: mov      w8, #0xb0 */ ARM64("mov w8, #0xb0");
    /* 0x00ba1148: mov      w9, #0xa8 */ ARM64("mov w9, #0xa8");
    /* 0x00ba114c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba1150: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00ba1154: adrp     x13, #0xe06000 */ ARM64("adrp x13, #0xe06000");
    /* 0x00ba1158: add      x13, x13, #0x3f2 */ ARM64("add x13, x13, #0x3f2");
    /* 0x00ba115c: adr      x11, #0xba1170 */ ARM64("adr x11, #0xba1170");
    /* 0x00ba1160: ldrb     w12, [x13, x10] */ ARM64("ldrb w12, [x13, x10]");
    /* 0x00ba1164: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00ba1168: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba116c: br       x11 */ ARM64("br x11");
loc_00ba1170:
    /* 0x00ba1170: stp      x23, x0, [sp, #0x130] */ ARM64("stp x23, x0, [sp, #0x130]");
    /* 0x00ba1174: str      x23, [sp, #0x140] */ ARM64("str x23, [sp, #0x140]");
    /* 0x00ba1178: b        #0xba11b8 */ goto loc_00ba11b8;
    /* 0x00ba117c: mov      w9, #0x28 */ ARM64("mov w9, #0x28");
    /* 0x00ba1180: mov      w8, #0x30 */ ARM64("mov w8, #0x30");
    /* 0x00ba1184: ldr      x1, [x22, x9] */ ARM64("ldr x1, [x22, x9]");
    /* 0x00ba1188: ldr      x2, [x22, x8] */ ARM64("ldr x2, [x22, x8]");
    /* 0x00ba118c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba1190: bl       #0xb8c520 */ CALL_DIRECT(sub_00b8c520);
    /* 0x00ba1194: b        #0xba11b4 */ goto loc_00ba11b4;
    /* 0x00ba1198: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba119c: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba11a0: bl       #0xb838c4 */ CALL_DIRECT(sub_00b838c4);
    /* 0x00ba11a4: b        #0xba11b4 */ goto loc_00ba11b4;
    /* 0x00ba11a8: ldp      x1, x2, [x22, #0x28] */ ARM64("ldp x1, x2, [x22, #0x28]");
    /* 0x00ba11ac: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba11b0: bl       #0xb85118 */ CALL_DIRECT(sub_00b85118);
loc_00ba11b4:
    /* 0x00ba11b4: ldr      x23, [sp, #0x130] */ ARM64("ldr x23, [sp, #0x130]");
loc_00ba11b8:
    /* 0x00ba11b8: ldp      x22, x25, [sp, #0x138] */ ARM64("ldp x22, x25, [sp, #0x138]");
    /* 0x00ba11bc: add      x8, x25, #1 */ ARM64("add x8, x25, #1");
    /* 0x00ba11c0: lsr      x8, x8, #1 */ ARM64("lsr x8, x8, #1");
    /* 0x00ba11c4: ldp      x10, x9, [x21, #-0x90] */ ARM64("ldp x10, x9, [x21, #-0x90]");
    /* 0x00ba11c8: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00ba11cc: csel     x1, x25, x8, eq */ ARM64("csel x1, x25, x8, eq");
    /* 0x00ba11d0: cmp      x1, x10 */ ARM64("cmp x1, x10");
    /* 0x00ba11d4: b.hi     #0xba1398 */ if (COND_HI) goto loc_00ba1398;
loc_00ba11d8:
    /* 0x00ba11d8: add      x25, x22, x25, lsl #3 */ ARM64("add x25, x22, x25, lsl #3");
    /* 0x00ba11dc: mov      x27, x22 */ ARM64("mov x27, x22");
    /* 0x00ba11e0: b        #0xba12bc */ goto loc_00ba12bc;
loc_00ba11e4:
    /* 0x00ba11e4: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba11e8: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba11ec: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba11f0: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba11f4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba11f8: b.eq     #0xba1230 */ if (COND_EQ) goto loc_00ba1230;
    /* 0x00ba11fc: ldr      x16, [x26] */ ARM64("ldr x16, [x26]");
loc_00ba1200:
    /* 0x00ba1200: rbit     x17, x15 */ ARM64("rbit x17, x15");
    /* 0x00ba1204: clz      x17, x17 */ ARM64("clz x17, x17");
    /* 0x00ba1208: add      x17, x14, x17, lsr #3 */ ARM64("add x17, x14, x17, lsr #3");
    /* 0x00ba120c: and      x17, x17, x10 */ ARM64("and x17, x17, x10");
    /* 0x00ba1210: sub      x17, x8, x17, lsl #3 */ ARM64("sub x17, x8, x17, lsl #3");
    /* 0x00ba1214: ldur     x17, [x17, #-8] */ ARM64("ldur x17, [x17, #-8]");
    /* 0x00ba1218: ldr      x17, [x17] */ ARM64("ldr x17, [x17]");
    /* 0x00ba121c: cmp      x16, x17 */ ARM64("cmp x16, x17");
    /* 0x00ba1220: b.eq     #0xba12bc */ if (COND_EQ) goto loc_00ba12bc;
    /* 0x00ba1224: sub      x17, x15, #1 */ ARM64("sub x17, x15, #1");
    /* 0x00ba1228: ands     x15, x17, x15 */ ARM64("ands x15, x17, x15");
    /* 0x00ba122c: b.ne     #0xba1200 */ if (COND_NE) goto loc_00ba1200;
loc_00ba1230:
    /* 0x00ba1230: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba1234: b.eq     #0xba1254 */ if (COND_EQ) goto loc_00ba1254;
    /* 0x00ba1238: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba123c: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba1240: cbz      x11, #0xba1270 */ if (x11 == 0) goto loc_00ba1270;
    /* 0x00ba1244: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1248: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba124c: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba1250: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba1254:
    /* 0x00ba1254: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba1258: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba125c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba1260: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba1264: tbnz     w13, #0, #0xba1280 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba1280;
    /* 0x00ba1268: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba126c: b        #0xba1274 */ goto loc_00ba1274;
loc_00ba1270:
    /* 0x00ba1270: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba1274:
    /* 0x00ba1274: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba1278: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba127c: b        #0xba11e4 */ goto loc_00ba11e4;
loc_00ba1280:
    /* 0x00ba1280: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba1284: tbz      w12, #0x1f, #0xba1308 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba1308;
loc_00ba1288:
    /* 0x00ba1288: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba128c: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba1290: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba1294: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba1298: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba129c: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba12a0: ldur     q0, [x21, #-0x90] */ ARM64("ldur q0, [x21, #-0x90]");
    /* 0x00ba12a4: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba12a8: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba12ac: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba12b0: stur     q0, [x21, #-0x90] */ ARM64("stur q0, [x21, #-0x90]");
    /* 0x00ba12b4: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00ba12b8: stur     x26, [x8, #-8] */ ARM64("stur x26, [x8, #-8]");
loc_00ba12bc:
    /* 0x00ba12bc: cmp      x27, x25 */ ARM64("cmp x27, x25");
    /* 0x00ba12c0: b.eq     #0xba1328 */ if (COND_EQ) goto loc_00ba1328;
    /* 0x00ba12c4: ldr      x26, [x27], #8 */ ARM64("ldr x26, [x27], #8");
    /* 0x00ba12c8: ldr      x24, [x26] */ ARM64("ldr x24, [x26]");
    /* 0x00ba12cc: ldur     x8, [x21, #-0x90] */ ARM64("ldur x8, [x21, #-0x90]");
    /* 0x00ba12d0: cbz      x8, #0xba12f4 */ if (x8 == 0) goto loc_00ba12f4;
loc_00ba12d4:
    /* 0x00ba12d4: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba12d8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba12dc: add      x8, x24, #8 */ ARM64("add x8, x24, #8");
    /* 0x00ba12e0: mul      x14, x8, x19 */ ARM64("mul x14, x8, x19");
    /* 0x00ba12e4: ldp      x8, x10, [x21, #-0xa0] */ ARM64("ldp x8, x10, [x21, #-0xa0]");
    /* 0x00ba12e8: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba12ec: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba12f0: b        #0xba11e4 */ goto loc_00ba11e4;
loc_00ba12f4:
    /* 0x00ba12f4: sub      x0, x21, #0xa0 */ ARM64("sub x0, x21, #0xa0");
    /* 0x00ba12f8: sub      x2, x21, #0x80 */ ARM64("sub x2, x21, #0x80");
    /* 0x00ba12fc: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba1300: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba1304: b        #0xba12d4 */ goto loc_00ba12d4;
loc_00ba1308:
    /* 0x00ba1308: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba130c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1310: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba1314: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1318: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba131c: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba1320: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba1324: b        #0xba1288 */ goto loc_00ba1288;
loc_00ba1328:
    /* 0x00ba1328: cbz      x23, #0xba0ddc */ if (x23 == 0) goto loc_00ba0ddc;
    /* 0x00ba132c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba1330: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba1334: b        #0xba0ddc */ goto loc_00ba0ddc;
    /* 0x00ba1338: ldr      x8, [x22, #0xa0] */ ARM64("ldr x8, [x22, #0xa0]");
    /* 0x00ba133c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00ba1340: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba1344: b.ne     #0xba137c */ if (COND_NE) goto loc_00ba137c;
    /* 0x00ba1348: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba134c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba1350: cbz      x0, #0xba34c4 */ if (x0 == 0) goto loc_00ba34c4;
    /* 0x00ba1354: mov      w8, #0xa8 */ ARM64("mov w8, #0xa8");
    /* 0x00ba1358: b        #0xba136c */ goto loc_00ba136c;
    /* 0x00ba135c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba1360: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba1364: cbz      x0, #0xba34c4 */ if (x0 == 0) goto loc_00ba34c4;
    /* 0x00ba1368: mov      w8, #0xe0 */ ARM64("mov w8, #0xe0");
loc_00ba136c:
    /* 0x00ba136c: add      x8, x22, x8 */ ARM64("add x8, x22, x8");
    /* 0x00ba1370: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba1374: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00ba1378: b        #0xba1170 */ goto loc_00ba1170;
loc_00ba137c:
    /* 0x00ba137c: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00ba1380: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba1384: b        #0xba1170 */ goto loc_00ba1170;
loc_00ba1388:
    /* 0x00ba1388: sub      x0, x21, #0xc0 */ ARM64("sub x0, x21, #0xc0");
    /* 0x00ba138c: sub      x2, x21, #0xa0 */ ARM64("sub x2, x21, #0xa0");
    /* 0x00ba1390: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba1394: b        #0xba0fd4 */ goto loc_00ba0fd4;
loc_00ba1398:
    /* 0x00ba1398: sub      x0, x21, #0xa0 */ ARM64("sub x0, x21, #0xa0");
    /* 0x00ba139c: sub      x2, x21, #0x80 */ ARM64("sub x2, x21, #0x80");
    /* 0x00ba13a0: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba13a4: b        #0xba11d8 */ goto loc_00ba11d8;
loc_00ba13a8:
    /* 0x00ba13a8: ldr      x21, [sp, #0xc0] */ ARM64("ldr x21, [sp, #0xc0]");
    /* 0x00ba13ac: ldr      x8, [x21, #0x28] */ ARM64("ldr x8, [x21, #0x28]");
    /* 0x00ba13b0: ldr      x9, [sp, #0xf0] */ ARM64("ldr x9, [sp, #0xf0]");
    /* 0x00ba13b4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba13b8: b.ls     #0xba13e4 */ if (COND_LS) goto loc_00ba13e4;
    /* 0x00ba13bc: ldr      x8, [x21, #0x20] */ ARM64("ldr x8, [x21, #0x20]");
    /* 0x00ba13c0: add      x8, x8, x9, lsl #5 */ ARM64("add x8, x8, x9, lsl #5");
    /* 0x00ba13c4: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba13c8: mov      x14, #-0x8000000000000000 */ ARM64("mov x14, #-0x8000000000000000");
    /* 0x00ba13cc: cmp      x9, x14 */ ARM64("cmp x9, x14");
    /* 0x00ba13d0: mov      w15, #0x30 */ ARM64("mov w15, #0x30");
    /* 0x00ba13d4: ldr      x16, [sp, #0x100] */ ARM64("ldr x16, [sp, #0x100]");
    /* 0x00ba13d8: b.ne     #0xba13f8 */ if (COND_NE) goto loc_00ba13f8;
    /* 0x00ba13dc: mov      x20, #-1 */ ARM64("mov x20, #-1");
    /* 0x00ba13e0: b        #0xba1404 */ goto loc_00ba1404;
loc_00ba13e4:
    /* 0x00ba13e4: mov      x20, #-1 */ ARM64("mov x20, #-1");
loc_00ba13e8:
    /* 0x00ba13e8: mov      x14, #-0x8000000000000000 */ ARM64("mov x14, #-0x8000000000000000");
    /* 0x00ba13ec: mov      w15, #0x30 */ ARM64("mov w15, #0x30");
    /* 0x00ba13f0: ldr      x16, [sp, #0x100] */ ARM64("ldr x16, [sp, #0x100]");
    /* 0x00ba13f4: b        #0xba1404 */ goto loc_00ba1404;
loc_00ba13f8:
    /* 0x00ba13f8: ldr      w8, [x8, #0x1c] */ ARM64("ldr w8, [x8, #0x1c]");
    /* 0x00ba13fc: mov      w9, #-1 */ ARM64("mov w9, #-1");
    /* 0x00ba1400: orr      x20, x9, x8, lsl #32 */ ARM64("orr x20, x9, x8, lsl #32");
loc_00ba1404:
    /* 0x00ba1404: ldp      x9, x10, [x21, #0x38] */ ARM64("ldp x9, x10, [x21, #0x38]");
loc_00ba1408:
    /* 0x00ba1408: mov      w8, w20 */ ARM64("mov w8, w20");
    /* 0x00ba140c: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00ba1410: b.ls     #0xba1430 */ if (COND_LS) goto loc_00ba1430;
    /* 0x00ba1414: umaddl   x11, w8, w15, x9 */ ARM64("umaddl x11, w8, w15, x9");
    /* 0x00ba1418: ldr      w11, [x11, #0x20] */ ARM64("ldr w11, [x11, #0x20]");
    /* 0x00ba141c: and      x12, x20, #0xffffffff00000000 */ ARM64("and x12, x20, #0xffffffff00000000");
    /* 0x00ba1420: orr      x20, x12, x11 */ ARM64("orr x20, x12, x11");
    /* 0x00ba1424: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00ba1428: b.hi     #0xba1460 */ if (COND_HI) goto loc_00ba1460;
    /* 0x00ba142c: b        #0xba7284 */ goto loc_00ba7284;
loc_00ba1430:
    /* 0x00ba1430: lsr      x12, x20, #0x20 */ ARM64("lsr x12, x20, #0x20");
    /* 0x00ba1434: mov      w11, w20 */ ARM64("mov w11, w20");
loc_00ba1438:
    /* 0x00ba1438: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba143c: b.ls     #0xba0b68 */ if (COND_LS) goto loc_00ba0b68;
    /* 0x00ba1440: mov      x8, x12 */ ARM64("mov x8, x12");
    /* 0x00ba1444: madd     x13, x12, x15, x9 */ ARM64("madd x13, x12, x15, x9");
    /* 0x00ba1448: ldp      w12, w13, [x13, #0x24] */ ARM64("ldp w12, w13, [x13, #0x24]");
    /* 0x00ba144c: cmn      w13, #1 */ ARM64("cmn w13, #1");
    /* 0x00ba1450: b.eq     #0xba1438 */ if (COND_EQ) goto loc_00ba1438;
    /* 0x00ba1454: orr      x20, x11, x12, lsl #32 */ ARM64("orr x20, x11, x12, lsl #32");
    /* 0x00ba1458: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00ba145c: b.ls     #0xba7284 */ if (COND_LS) goto loc_00ba7284;
loc_00ba1460:
    /* 0x00ba1460: madd     x8, x8, x15, x9 */ ARM64("madd x8, x8, x15, x9");
    /* 0x00ba1464: ldr      x11, [x8] */ ARM64("ldr x11, [x8]");
    /* 0x00ba1468: cmp      x11, x14 */ ARM64("cmp x11, x14");
    /* 0x00ba146c: b.eq     #0xba7284 */ if (COND_EQ) goto loc_00ba7284;
    /* 0x00ba1470: ldr      w11, [x8, #0x2c] */ ARM64("ldr w11, [x8, #0x2c]");
    /* 0x00ba1474: cmp      w11, w16 */ ARM64("cmp w11, w16");
    /* 0x00ba1478: b.ne     #0xba1408 */ if (COND_NE) goto loc_00ba1408;
    /* 0x00ba147c: ldr      x9, [sp, #0x2c8] */ ARM64("ldr x9, [sp, #0x2c8]");
    /* 0x00ba1480: cbz      x9, #0xba2178 */ if (x9 == 0) goto loc_00ba2178;
    /* 0x00ba1484: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba1488: ldr      w22, [x8, #0x28] */ ARM64("ldr w22, [x8, #0x28]");
    /* 0x00ba148c: ldr      x12, [sp, #0xd0] */ ARM64("ldr x12, [sp, #0xd0]");
    /* 0x00ba1490: ldr      x10, [sp, #0x2b8] */ ARM64("ldr x10, [sp, #0x2b8]");
    /* 0x00ba1494: ldr      x11, [sp, #0x2b0] */ ARM64("ldr x11, [sp, #0x2b0]");
    /* 0x00ba1498: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba149c: ldr      d0, [x11, x12] */ ARM64("ldr d0, [x11, x12]");
    /* 0x00ba14a0: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba14a4: fmov     x13, d1 */ ARM64("fmov x13, d1");
    /* 0x00ba14a8: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba14ac: b.eq     #0xba14e8 */ if (COND_EQ) goto loc_00ba14e8;
loc_00ba14b0:
    /* 0x00ba14b0: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00ba14b4: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00ba14b8: add      x14, x12, x14, lsr #3 */ ARM64("add x14, x12, x14, lsr #3");
    /* 0x00ba14bc: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba14c0: mov      w15, #0xc8 */ ARM64("mov w15, #0xc8");
    /* 0x00ba14c4: mneg     x14, x14, x15 */ ARM64("mneg x14, x14, x15");
    /* 0x00ba14c8: add      x24, x11, x14 */ ARM64("add x24, x11, x14");
    /* 0x00ba14cc: ldur     w14, [x24, #-0xc8] */ ARM64("ldur w14, [x24, #-0xc8]");
    /* 0x00ba14d0: ldr      x15, [sp, #0x100] */ ARM64("ldr x15, [sp, #0x100]");
    /* 0x00ba14d4: cmp      w14, w15 */ ARM64("cmp w14, w15");
    /* 0x00ba14d8: b.eq     #0xba1520 */ if (COND_EQ) goto loc_00ba1520;
    /* 0x00ba14dc: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00ba14e0: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00ba14e4: b.ne     #0xba14b0 */ if (COND_NE) goto loc_00ba14b0;
loc_00ba14e8:
    /* 0x00ba14e8: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba14ec: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba14f0: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba14f4: fmov     w13, s0 */ ARM64("fmov w13, s0");
    /* 0x00ba14f8: tbnz     w13, #0, #0xba2178 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba2178;
    /* 0x00ba14fc: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00ba1500: add      x12, x12, x9 */ ARM64("add x12, x12, x9");
    /* 0x00ba1504: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba1508: ldr      d0, [x11, x12] */ ARM64("ldr d0, [x11, x12]");
    /* 0x00ba150c: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1510: fmov     x13, d1 */ ARM64("fmov x13, d1");
    /* 0x00ba1514: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1518: b.ne     #0xba14b0 */ if (COND_NE) goto loc_00ba14b0;
    /* 0x00ba151c: b        #0xba14e8 */ goto loc_00ba14e8;
loc_00ba1520:
    /* 0x00ba1520: ldp      x9, x23, [x8, #8] */ ARM64("ldp x9, x23, [x8, #8]");
    /* 0x00ba1524: str      x9, [sp, #0x110] */ ARM64("str x9, [sp, #0x110]");
    /* 0x00ba1528: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00ba152c: lsr      x8, x8, #1 */ ARM64("lsr x8, x8, #1");
    /* 0x00ba1530: ldp      x10, x9, [x24, #-0x50] */ ARM64("ldp x10, x9, [x24, #-0x50]");
    /* 0x00ba1534: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00ba1538: csel     x1, x23, x8, eq */ ARM64("csel x1, x23, x8, eq");
    /* 0x00ba153c: cmp      x1, x10 */ ARM64("cmp x1, x10");
    /* 0x00ba1540: b.hi     #0xba18a8 */ if (COND_HI) goto loc_00ba18a8;
loc_00ba1544:
    /* 0x00ba1544: cbz      x23, #0xba16a0 */ if (x23 == 0) goto loc_00ba16a0;
    /* 0x00ba1548: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba154c: b        #0xba1634 */ goto loc_00ba1634;
loc_00ba1550:
    /* 0x00ba1550: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba1554: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba1558: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba155c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba1560: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1564: b.eq     #0xba159c */ if (COND_EQ) goto loc_00ba159c;
    /* 0x00ba1568: ldr      x16, [x25] */ ARM64("ldr x16, [x25]");
loc_00ba156c:
    /* 0x00ba156c: rbit     x17, x15 */ ARM64("rbit x17, x15");
    /* 0x00ba1570: clz      x17, x17 */ ARM64("clz x17, x17");
    /* 0x00ba1574: add      x17, x14, x17, lsr #3 */ ARM64("add x17, x14, x17, lsr #3");
    /* 0x00ba1578: and      x17, x17, x10 */ ARM64("and x17, x17, x10");
    /* 0x00ba157c: sub      x17, x8, x17, lsl #3 */ ARM64("sub x17, x8, x17, lsl #3");
    /* 0x00ba1580: ldur     x17, [x17, #-8] */ ARM64("ldur x17, [x17, #-8]");
    /* 0x00ba1584: ldr      x17, [x17] */ ARM64("ldr x17, [x17]");
    /* 0x00ba1588: cmp      x16, x17 */ ARM64("cmp x16, x17");
    /* 0x00ba158c: b.eq     #0xba1628 */ if (COND_EQ) goto loc_00ba1628;
    /* 0x00ba1590: sub      x17, x15, #1 */ ARM64("sub x17, x15, #1");
    /* 0x00ba1594: ands     x15, x17, x15 */ ARM64("ands x15, x17, x15");
    /* 0x00ba1598: b.ne     #0xba156c */ if (COND_NE) goto loc_00ba156c;
loc_00ba159c:
    /* 0x00ba159c: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba15a0: b.eq     #0xba15c0 */ if (COND_EQ) goto loc_00ba15c0;
    /* 0x00ba15a4: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba15a8: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba15ac: cbz      x11, #0xba15dc */ if (x11 == 0) goto loc_00ba15dc;
    /* 0x00ba15b0: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba15b4: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba15b8: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba15bc: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba15c0:
    /* 0x00ba15c0: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba15c4: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba15c8: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba15cc: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba15d0: tbnz     w13, #0, #0xba15ec */ if (((w13 >> #0) & 1) != 0) goto loc_00ba15ec;
    /* 0x00ba15d4: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba15d8: b        #0xba15e0 */ goto loc_00ba15e0;
loc_00ba15dc:
    /* 0x00ba15dc: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba15e0:
    /* 0x00ba15e0: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba15e4: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba15e8: b        #0xba1550 */ goto loc_00ba1550;
loc_00ba15ec:
    /* 0x00ba15ec: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba15f0: tbz      w12, #0x1f, #0xba1680 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba1680;
loc_00ba15f4:
    /* 0x00ba15f4: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba15f8: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba15fc: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba1600: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba1604: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba1608: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba160c: ldur     q0, [x24, #-0x50] */ ARM64("ldur q0, [x24, #-0x50]");
    /* 0x00ba1610: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1614: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba1618: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba161c: stur     q0, [x24, #-0x50] */ ARM64("stur q0, [x24, #-0x50]");
    /* 0x00ba1620: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00ba1624: stur     x25, [x8, #-8] */ ARM64("stur x25, [x8, #-8]");
loc_00ba1628:
    /* 0x00ba1628: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00ba162c: cmp      x21, x23 */ ARM64("cmp x21, x23");
    /* 0x00ba1630: b.eq     #0xba16a0 */ if (COND_EQ) goto loc_00ba16a0;
loc_00ba1634:
    /* 0x00ba1634: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00ba1638: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba163c: madd     x25, x21, x8, x9 */ ARM64("madd x25, x21, x8, x9");
    /* 0x00ba1640: ldr      x26, [x25] */ ARM64("ldr x26, [x25]");
    /* 0x00ba1644: ldur     x8, [x24, #-0x50] */ ARM64("ldur x8, [x24, #-0x50]");
    /* 0x00ba1648: cbz      x8, #0xba166c */ if (x8 == 0) goto loc_00ba166c;
loc_00ba164c:
    /* 0x00ba164c: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba1650: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba1654: add      x8, x26, #8 */ ARM64("add x8, x26, #8");
    /* 0x00ba1658: mul      x14, x8, x19 */ ARM64("mul x14, x8, x19");
    /* 0x00ba165c: ldp      x8, x10, [x24, #-0x60] */ ARM64("ldp x8, x10, [x24, #-0x60]");
    /* 0x00ba1660: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba1664: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba1668: b        #0xba1550 */ goto loc_00ba1550;
loc_00ba166c:
    /* 0x00ba166c: sub      x0, x24, #0x60 */ ARM64("sub x0, x24, #0x60");
    /* 0x00ba1670: sub      x2, x24, #0x40 */ ARM64("sub x2, x24, #0x40");
    /* 0x00ba1674: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba1678: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba167c: b        #0xba164c */ goto loc_00ba164c;
loc_00ba1680:
    /* 0x00ba1680: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba1684: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1688: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba168c: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1690: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1694: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba1698: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba169c: b        #0xba15f4 */ goto loc_00ba15f4;
loc_00ba16a0:
    /* 0x00ba16a0: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00ba16a4: mul      x21, x22, x19 */ ARM64("mul x21, x22, x19");
    /* 0x00ba16a8: lsr      x27, x21, #0x39 */ ARM64("lsr x27, x21, #0x39");
    /* 0x00ba16ac: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba16b0: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba16b4: dup      v0.8b, w27 */ ARM64("dup v0.8b, w27");
    /* 0x00ba16b8: and      x11, x21, x9 */ ARM64("and x11, x21, x9");
    /* 0x00ba16bc: ldr      d1, [x8, x11] */ ARM64("ldr d1, [x8, x11]");
    /* 0x00ba16c0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba16c4: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba16c8: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba16cc: b.eq     #0xba1704 */ if (COND_EQ) goto loc_00ba1704;
loc_00ba16d0:
    /* 0x00ba16d0: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba16d4: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba16d8: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba16dc: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba16e0: mov      w14, #0xc8 */ ARM64("mov w14, #0xc8");
    /* 0x00ba16e4: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00ba16e8: add      x24, x8, x13 */ ARM64("add x24, x8, x13");
    /* 0x00ba16ec: ldur     w13, [x24, #-0xc8] */ ARM64("ldur w13, [x24, #-0xc8]");
    /* 0x00ba16f0: cmp      w13, w22 */ ARM64("cmp w13, w22");
    /* 0x00ba16f4: b.eq     #0xba1890 */ if (COND_EQ) goto loc_00ba1890;
    /* 0x00ba16f8: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba16fc: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba1700: b.ne     #0xba16d0 */ if (COND_NE) goto loc_00ba16d0;
loc_00ba1704:
    /* 0x00ba1704: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba1708: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba170c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba1710: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba1714: tbnz     w12, #0, #0xba173c */ if (((w12 >> #0) & 1) != 0) goto loc_00ba173c;
    /* 0x00ba1718: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00ba171c: add      x11, x11, x10 */ ARM64("add x11, x11, x10");
    /* 0x00ba1720: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba1724: ldr      d1, [x8, x11] */ ARM64("ldr d1, [x8, x11]");
    /* 0x00ba1728: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba172c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba1730: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1734: b.ne     #0xba16d0 */ if (COND_NE) goto loc_00ba16d0;
    /* 0x00ba1738: b        #0xba1704 */ goto loc_00ba1704;
loc_00ba173c:
    /* 0x00ba173c: ldr      x10, [sp, #0x2c0] */ ARM64("ldr x10, [sp, #0x2c0]");
    /* 0x00ba1740: cbz      x10, #0xba18dc */ if (x10 == 0) goto loc_00ba18dc;
loc_00ba1744:
    /* 0x00ba1744: adrp     x10, #0xefc000 */ ARM64("adrp x10, #0xefc000");
    /* 0x00ba1748: add      x10, x10, #0x958 */ ARM64("add x10, x10, #0x958");
    /* 0x00ba174c: ldp      q0, q1, [x10] */ ARM64("ldp q0, q1, [x10]");
    /* 0x00ba1750: add      x10, sp, #0x130 */ ARM64("add x10, sp, #0x130");
    /* 0x00ba1754: stp      q0, q1, [x10, #0x20] */ ARM64("stp q0, q1, [x10, #0x20]");
    /* 0x00ba1758: stp      q0, q1, [sp, #0x2d0] */ ARM64("stp q0, q1, [sp, #0x2d0]");
    /* 0x00ba175c: add      x11, sp, #0x2d0 */ ARM64("add x11, sp, #0x2d0");
    /* 0x00ba1760: stp      q0, q1, [x11, #0x20] */ ARM64("stp q0, q1, [x11, #0x20]");
    /* 0x00ba1764: stp      q0, q1, [x11, #0x40] */ ARM64("stp q0, q1, [x11, #0x40]");
    /* 0x00ba1768: stp      q0, q1, [x11, #0x60] */ ARM64("stp q0, q1, [x11, #0x60]");
    /* 0x00ba176c: stp      q0, q1, [x11, #0x80] */ ARM64("stp q0, q1, [x11, #0x80]");
    /* 0x00ba1770: ldp      q0, q1, [sp, #0x150] */ ARM64("ldp q0, q1, [sp, #0x150]");
    /* 0x00ba1774: stp      q0, q1, [x11, #0xa0] */ ARM64("stp q0, q1, [x11, #0xa0]");
    /* 0x00ba1778: ldp      q0, q1, [sp, #0x350] */ ARM64("ldp q0, q1, [sp, #0x350]");
    /* 0x00ba177c: stur     q0, [x10, #0x84] */ ARM64("stur q0, [x10, #0x84]");
    /* 0x00ba1780: stur     q1, [x10, #0x94] */ ARM64("stur q1, [x10, #0x94]");
    /* 0x00ba1784: ldp      q0, q1, [sp, #0x370] */ ARM64("ldp q0, q1, [sp, #0x370]");
    /* 0x00ba1788: stur     q0, [x10, #0xa4] */ ARM64("stur q0, [x10, #0xa4]");
    /* 0x00ba178c: stur     q1, [x10, #0xb4] */ ARM64("stur q1, [x10, #0xb4]");
    /* 0x00ba1790: ldp      q0, q1, [sp, #0x330] */ ARM64("ldp q0, q1, [sp, #0x330]");
    /* 0x00ba1794: stur     q0, [x10, #0x64] */ ARM64("stur q0, [x10, #0x64]");
    /* 0x00ba1798: stur     q1, [x10, #0x74] */ ARM64("stur q1, [x10, #0x74]");
    /* 0x00ba179c: ldp      q0, q1, [sp, #0x310] */ ARM64("ldp q0, q1, [sp, #0x310]");
    /* 0x00ba17a0: stur     q0, [x10, #0x44] */ ARM64("stur q0, [x10, #0x44]");
    /* 0x00ba17a4: stur     q1, [x10, #0x54] */ ARM64("stur q1, [x10, #0x54]");
    /* 0x00ba17a8: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba17ac: stur     q0, [x10, #4] */ ARM64("stur q0, [x10, #4]");
    /* 0x00ba17b0: stur     q1, [x10, #0x14] */ ARM64("stur q1, [x10, #0x14]");
    /* 0x00ba17b4: ldp      q0, q1, [sp, #0x2f0] */ ARM64("ldp q0, q1, [sp, #0x2f0]");
    /* 0x00ba17b8: stur     q0, [x10, #0x24] */ ARM64("stur q0, [x10, #0x24]");
    /* 0x00ba17bc: stur     q1, [x10, #0x34] */ ARM64("stur q1, [x10, #0x34]");
    /* 0x00ba17c0: and      x10, x9, x21 */ ARM64("and x10, x9, x21");
    /* 0x00ba17c4: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba17c8: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba17cc: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba17d0: cbz      x12, #0xba18b8 */ if (x12 == 0) goto loc_00ba18b8;
loc_00ba17d4:
    /* 0x00ba17d4: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00ba17d8: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba17dc: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00ba17e0: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00ba17e4: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00ba17e8: tbz      w10, #0x1f, #0xba18f8 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00ba18f8;
loc_00ba17ec:
    /* 0x00ba17ec: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00ba17f0: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00ba17f4: strb     w27, [x8, x11] */ ARM64("strb w27, [x8, x11]");
    /* 0x00ba17f8: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba17fc: strb     w27, [x9, #8] */ ARM64("strb w27, [x9, #8]");
    /* 0x00ba1800: mov      w9, #0xc8 */ ARM64("mov w9, #0xc8");
    /* 0x00ba1804: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00ba1808: add      x24, x8, x9 */ ARM64("add x24, x8, x9");
    /* 0x00ba180c: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00ba1810: stur     w22, [x24, #-0xc8] */ ARM64("stur w22, [x24, #-0xc8]");
    /* 0x00ba1814: ldr      q0, [sp, #0x1c0] */ ARM64("ldr q0, [sp, #0x1c0]");
    /* 0x00ba1818: stur     q0, [x24, #-0x34] */ ARM64("stur q0, [x24, #-0x34]");
    /* 0x00ba181c: ldr      q0, [sp, #0x1d0] */ ARM64("ldr q0, [sp, #0x1d0]");
    /* 0x00ba1820: stur     q0, [x24, #-0x24] */ ARM64("stur q0, [x24, #-0x24]");
    /* 0x00ba1824: ldr      q0, [sp, #0x1e0] */ ARM64("ldr q0, [sp, #0x1e0]");
    /* 0x00ba1828: stur     q0, [x24, #-0x14] */ ARM64("stur q0, [x24, #-0x14]");
    /* 0x00ba182c: ldr      w9, [sp, #0x1f0] */ ARM64("ldr w9, [sp, #0x1f0]");
    /* 0x00ba1830: stur     w9, [x24, #-4] */ ARM64("stur w9, [x24, #-4]");
    /* 0x00ba1834: ldr      q0, [sp, #0x180] */ ARM64("ldr q0, [sp, #0x180]");
    /* 0x00ba1838: stur     q0, [x24, #-0x74] */ ARM64("stur q0, [x24, #-0x74]");
    /* 0x00ba183c: ldr      q0, [sp, #0x190] */ ARM64("ldr q0, [sp, #0x190]");
    /* 0x00ba1840: stur     q0, [x24, #-0x64] */ ARM64("stur q0, [x24, #-0x64]");
    /* 0x00ba1844: ldr      q0, [sp, #0x1a0] */ ARM64("ldr q0, [sp, #0x1a0]");
    /* 0x00ba1848: stur     q0, [x24, #-0x54] */ ARM64("stur q0, [x24, #-0x54]");
    /* 0x00ba184c: ldr      q0, [sp, #0x1b0] */ ARM64("ldr q0, [sp, #0x1b0]");
    /* 0x00ba1850: stur     q0, [x24, #-0x44] */ ARM64("stur q0, [x24, #-0x44]");
    /* 0x00ba1854: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba1858: stur     q0, [x24, #-0xb4] */ ARM64("stur q0, [x24, #-0xb4]");
    /* 0x00ba185c: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba1860: stur     q0, [x24, #-0xa4] */ ARM64("stur q0, [x24, #-0xa4]");
    /* 0x00ba1864: ldr      q0, [sp, #0x160] */ ARM64("ldr q0, [sp, #0x160]");
    /* 0x00ba1868: stur     q0, [x24, #-0x94] */ ARM64("stur q0, [x24, #-0x94]");
    /* 0x00ba186c: ldr      q0, [sp, #0x170] */ ARM64("ldr q0, [sp, #0x170]");
    /* 0x00ba1870: stur     q0, [x24, #-0x84] */ ARM64("stur q0, [x24, #-0x84]");
    /* 0x00ba1874: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba1878: stur     q0, [x24, #-0xc4] */ ARM64("stur q0, [x24, #-0xc4]");
    /* 0x00ba187c: ldr      q0, [sp, #0x2c0] */ ARM64("ldr q0, [sp, #0x2c0]");
    /* 0x00ba1880: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1884: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00ba1888: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba188c: str      q0, [sp, #0x2c0] */ ARM64("str q0, [sp, #0x2c0]");
loc_00ba1890:
    /* 0x00ba1890: ldr      x21, [sp, #0xc0] */ ARM64("ldr x21, [sp, #0xc0]");
    /* 0x00ba1894: mov      x14, #-0x8000000000000000 */ ARM64("mov x14, #-0x8000000000000000");
    /* 0x00ba1898: mov      w15, #0x30 */ ARM64("mov w15, #0x30");
    /* 0x00ba189c: ldr      x16, [sp, #0x100] */ ARM64("ldr x16, [sp, #0x100]");
    /* 0x00ba18a0: cbnz     x23, #0xba1918 */ if (x23 != 0) goto loc_00ba1918;
    /* 0x00ba18a4: b        #0xba1404 */ goto loc_00ba1404;
loc_00ba18a8:
    /* 0x00ba18a8: sub      x0, x24, #0x60 */ ARM64("sub x0, x24, #0x60");
    /* 0x00ba18ac: sub      x2, x24, #0x40 */ ARM64("sub x2, x24, #0x40");
    /* 0x00ba18b0: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba18b4: b        #0xba1544 */ goto loc_00ba1544;
loc_00ba18b8:
    /* 0x00ba18b8: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00ba18bc:
    /* 0x00ba18bc: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00ba18c0: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00ba18c4: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba18c8: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba18cc: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba18d0: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba18d4: cbnz     x12, #0xba17d4 */ if (x12 != 0) goto loc_00ba17d4;
    /* 0x00ba18d8: b        #0xba18bc */ goto loc_00ba18bc;
loc_00ba18dc:
    /* 0x00ba18dc: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba18e0: add      x8, sp, #0x2b0 */ ARM64("add x8, sp, #0x2b0");
    /* 0x00ba18e4: add      x1, x8, #0x20 */ ARM64("add x1, x8, #0x20");
    /* 0x00ba18e8: bl       #0xc6f450 */ CALL_DIRECT(sub_00c6f450);
    /* 0x00ba18ec: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba18f0: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba18f4: b        #0xba1744 */ goto loc_00ba1744;
loc_00ba18f8:
    /* 0x00ba18f8: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba18fc: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1900: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba1904: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba1908: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba190c: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00ba1910: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00ba1914: b        #0xba17ec */ goto loc_00ba17ec;
loc_00ba1918:
    /* 0x00ba1918: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba191c: str      x23, [sp, #0xf0] */ ARM64("str x23, [sp, #0xf0]");
    /* 0x00ba1920: b        #0xba1938 */ goto loc_00ba1938;
loc_00ba1924:
    /* 0x00ba1924: add      x27, x27, #1 */ ARM64("add x27, x27, #1");
    /* 0x00ba1928: ldr      x23, [sp, #0xf0] */ ARM64("ldr x23, [sp, #0xf0]");
    /* 0x00ba192c: cmp      x27, x23 */ ARM64("cmp x27, x23");
    /* 0x00ba1930: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba1934: b.eq     #0xba1ab8 */ if (COND_EQ) goto loc_00ba1ab8;
loc_00ba1938:
    /* 0x00ba1938: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00ba193c: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba1940: madd     x8, x27, x8, x9 */ ARM64("madd x8, x27, x8, x9");
    /* 0x00ba1944: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba1948: add      x1, x8, #8 */ ARM64("add x1, x8, #8");
    /* 0x00ba194c: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba1950: ldp      x21, x22, [sp, #0x130] */ ARM64("ldp x21, x22, [sp, #0x130]");
    /* 0x00ba1954: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba1958: add      x25, x22, x8, lsl #3 */ ARM64("add x25, x22, x8, lsl #3");
    /* 0x00ba195c: mov      x28, x22 */ ARM64("mov x28, x22");
    /* 0x00ba1960: b        #0xba1a3c */ goto loc_00ba1a3c;
loc_00ba1964:
    /* 0x00ba1964: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba1968: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba196c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba1970: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba1974: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1978: b.eq     #0xba19b0 */ if (COND_EQ) goto loc_00ba19b0;
    /* 0x00ba197c: ldr      x16, [x26] */ ARM64("ldr x16, [x26]");
loc_00ba1980:
    /* 0x00ba1980: rbit     x17, x15 */ ARM64("rbit x17, x15");
    /* 0x00ba1984: clz      x17, x17 */ ARM64("clz x17, x17");
    /* 0x00ba1988: add      x17, x14, x17, lsr #3 */ ARM64("add x17, x14, x17, lsr #3");
    /* 0x00ba198c: and      x17, x17, x10 */ ARM64("and x17, x17, x10");
    /* 0x00ba1990: sub      x17, x8, x17, lsl #3 */ ARM64("sub x17, x8, x17, lsl #3");
    /* 0x00ba1994: ldur     x17, [x17, #-8] */ ARM64("ldur x17, [x17, #-8]");
    /* 0x00ba1998: ldr      x17, [x17] */ ARM64("ldr x17, [x17]");
    /* 0x00ba199c: cmp      x16, x17 */ ARM64("cmp x16, x17");
    /* 0x00ba19a0: b.eq     #0xba1a3c */ if (COND_EQ) goto loc_00ba1a3c;
    /* 0x00ba19a4: sub      x17, x15, #1 */ ARM64("sub x17, x15, #1");
    /* 0x00ba19a8: ands     x15, x17, x15 */ ARM64("ands x15, x17, x15");
    /* 0x00ba19ac: b.ne     #0xba1980 */ if (COND_NE) goto loc_00ba1980;
loc_00ba19b0:
    /* 0x00ba19b0: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba19b4: b.eq     #0xba19d4 */ if (COND_EQ) goto loc_00ba19d4;
    /* 0x00ba19b8: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba19bc: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba19c0: cbz      x11, #0xba19f0 */ if (x11 == 0) goto loc_00ba19f0;
    /* 0x00ba19c4: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba19c8: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba19cc: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba19d0: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba19d4:
    /* 0x00ba19d4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba19d8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba19dc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba19e0: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba19e4: tbnz     w13, #0, #0xba1a00 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba1a00;
    /* 0x00ba19e8: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba19ec: b        #0xba19f4 */ goto loc_00ba19f4;
loc_00ba19f0:
    /* 0x00ba19f0: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba19f4:
    /* 0x00ba19f4: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba19f8: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba19fc: b        #0xba1964 */ goto loc_00ba1964;
loc_00ba1a00:
    /* 0x00ba1a00: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba1a04: tbz      w12, #0x1f, #0xba1a88 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba1a88;
loc_00ba1a08:
    /* 0x00ba1a08: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba1a0c: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba1a10: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba1a14: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba1a18: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba1a1c: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba1a20: ldur     q0, [x24, #-0x70] */ ARM64("ldur q0, [x24, #-0x70]");
    /* 0x00ba1a24: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1a28: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba1a2c: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba1a30: stur     q0, [x24, #-0x70] */ ARM64("stur q0, [x24, #-0x70]");
    /* 0x00ba1a34: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00ba1a38: stur     x26, [x8, #-8] */ ARM64("stur x26, [x8, #-8]");
loc_00ba1a3c:
    /* 0x00ba1a3c: cmp      x28, x25 */ ARM64("cmp x28, x25");
    /* 0x00ba1a40: b.eq     #0xba1aa8 */ if (COND_EQ) goto loc_00ba1aa8;
    /* 0x00ba1a44: ldr      x26, [x28], #8 */ ARM64("ldr x26, [x28], #8");
    /* 0x00ba1a48: ldr      x23, [x26] */ ARM64("ldr x23, [x26]");
    /* 0x00ba1a4c: ldur     x8, [x24, #-0x70] */ ARM64("ldur x8, [x24, #-0x70]");
    /* 0x00ba1a50: cbz      x8, #0xba1a74 */ if (x8 == 0) goto loc_00ba1a74;
loc_00ba1a54:
    /* 0x00ba1a54: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba1a58: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba1a5c: add      x8, x23, #8 */ ARM64("add x8, x23, #8");
    /* 0x00ba1a60: mul      x14, x8, x19 */ ARM64("mul x14, x8, x19");
    /* 0x00ba1a64: ldp      x8, x10, [x24, #-0x80] */ ARM64("ldp x8, x10, [x24, #-0x80]");
    /* 0x00ba1a68: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba1a6c: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba1a70: b        #0xba1964 */ goto loc_00ba1964;
loc_00ba1a74:
    /* 0x00ba1a74: sub      x0, x24, #0x80 */ ARM64("sub x0, x24, #0x80");
    /* 0x00ba1a78: sub      x2, x24, #0x60 */ ARM64("sub x2, x24, #0x60");
    /* 0x00ba1a7c: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba1a80: bl       #0xc71c54 */ CALL_DIRECT(sub_00c71c54);
    /* 0x00ba1a84: b        #0xba1a54 */ goto loc_00ba1a54;
loc_00ba1a88:
    /* 0x00ba1a88: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba1a8c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1a90: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba1a94: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1a98: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1a9c: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba1aa0: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba1aa4: b        #0xba1a08 */ goto loc_00ba1a08;
loc_00ba1aa8:
    /* 0x00ba1aa8: cbz      x21, #0xba1924 */ if (x21 == 0) goto loc_00ba1924;
    /* 0x00ba1aac: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba1ab0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba1ab4: b        #0xba1924 */ goto loc_00ba1924;
loc_00ba1ab8:
    /* 0x00ba1ab8: ldr      x21, [sp, #0xc0] */ ARM64("ldr x21, [sp, #0xc0]");
    /* 0x00ba1abc: b        #0xba13e8 */ goto loc_00ba13e8;
loc_00ba1ac0:
    /* 0x00ba1ac0: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00ba1ac4:
    /* 0x00ba1ac4: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00ba1ac8: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00ba1acc: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba1ad0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1ad4: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba1ad8: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba1adc: cbnz     x12, #0xba0d00 */ if (x12 != 0) goto loc_00ba0d00;
    /* 0x00ba1ae0: b        #0xba1ac4 */ goto loc_00ba1ac4;
loc_00ba1ae4:
    /* 0x00ba1ae4: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba1ae8: add      x8, sp, #0x2b0 */ ARM64("add x8, sp, #0x2b0");
    /* 0x00ba1aec: add      x1, x8, #0x20 */ ARM64("add x1, x8, #0x20");
    /* 0x00ba1af0: bl       #0xc6f450 */ CALL_DIRECT(sub_00c6f450);
    /* 0x00ba1af4: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba1af8: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba1afc: b        #0xba0c6c */ goto loc_00ba0c6c;
loc_00ba1b00:
    /* 0x00ba1b00: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba1b04: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1b08: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba1b0c: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba1b10: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba1b14: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00ba1b18: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00ba1b1c: b        #0xba0d18 */ goto loc_00ba0d18;
loc_00ba1b20:
    /* 0x00ba1b20: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba1b24: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba1b28: add      x0, x0, #0x300 */ ARM64("add x0, x0, #0x300");
    /* 0x00ba1b2c: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00ba1b30: mov      w26, #0xc8 */ ARM64("mov w26, #0xc8");
    /* 0x00ba1b34: ldr      x21, [sp, #0xa8] */ ARM64("ldr x21, [sp, #0xa8]");
loc_00ba1b38:
    /* 0x00ba1b38: cmp      x21, x10 */ ARM64("cmp x21, x10");
    /* 0x00ba1b3c: b.eq     #0xba2190 */ if (COND_EQ) goto loc_00ba2190;
    /* 0x00ba1b40: mov      x22, x9 */ ARM64("mov x22, x9");
    /* 0x00ba1b44: ldr      x8, [x21], #0x20 */ ARM64("ldr x8, [x21], #0x20");
    /* 0x00ba1b48: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00ba1b4c: cmp      x8, x23 */ ARM64("cmp x8, x23");
    /* 0x00ba1b50: b.eq     #0xba1b38 */ if (COND_EQ) goto loc_00ba1b38;
    /* 0x00ba1b54: ldr      x8, [sp, #0x2c8] */ ARM64("ldr x8, [sp, #0x2c8]");
    /* 0x00ba1b58: cbz      x8, #0xba2184 */ if (x8 == 0) goto loc_00ba2184;
    /* 0x00ba1b5c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba1b60: mov      w9, w22 */ ARM64("mov w9, w22");
    /* 0x00ba1b64: mul      x28, x9, x19 */ ARM64("mul x28, x9, x19");
    /* 0x00ba1b68: lsr      x11, x28, #0x39 */ ARM64("lsr x11, x28, #0x39");
    /* 0x00ba1b6c: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba1b70: ldr      x10, [sp, #0x2b0] */ ARM64("ldr x10, [sp, #0x2b0]");
    /* 0x00ba1b74: dup      v8.8b, w11 */ ARM64("dup v8.8b, w11");
    /* 0x00ba1b78: and      x11, x28, x9 */ ARM64("and x11, x28, x9");
    /* 0x00ba1b7c: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1b80: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1b84: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1b88: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1b8c: b.eq     #0xba1bc0 */ if (COND_EQ) goto loc_00ba1bc0;
loc_00ba1b90:
    /* 0x00ba1b90: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba1b94: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba1b98: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba1b9c: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba1ba0: mneg     x13, x13, x26 */ ARM64("mneg x13, x13, x26");
    /* 0x00ba1ba4: add      x23, x10, x13 */ ARM64("add x23, x10, x13");
    /* 0x00ba1ba8: ldur     w13, [x23, #-0xc8] */ ARM64("ldur w13, [x23, #-0xc8]");
    /* 0x00ba1bac: cmp      w13, w22 */ ARM64("cmp w13, w22");
    /* 0x00ba1bb0: b.eq     #0xba1bf8 */ if (COND_EQ) goto loc_00ba1bf8;
    /* 0x00ba1bb4: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba1bb8: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba1bbc: b.ne     #0xba1b90 */ if (COND_NE) goto loc_00ba1b90;
loc_00ba1bc0:
    /* 0x00ba1bc0: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1bc4: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba1bc8: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba1bcc: fmov     w12, s0 */ ARM64("fmov w12, s0");
    /* 0x00ba1bd0: tbnz     w12, #0, #0xba2184 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba2184;
    /* 0x00ba1bd4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba1bd8: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba1bdc: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba1be0: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1be4: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1be8: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1bec: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1bf0: b.ne     #0xba1b90 */ if (COND_NE) goto loc_00ba1b90;
    /* 0x00ba1bf4: b        #0xba1bc0 */ goto loc_00ba1bc0;
loc_00ba1bf8:
    /* 0x00ba1bf8: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba1bfc: str      x8, [sp, #0xe0] */ ARM64("str x8, [sp, #0xe0]");
    /* 0x00ba1c00: str      x21, [sp, #0xa8] */ ARM64("str x21, [sp, #0xa8]");
    /* 0x00ba1c04: ldur     x8, [x23, #-0x48] */ ARM64("ldur x8, [x23, #-0x48]");
    /* 0x00ba1c08: ldur     x9, [x23, #-0xa8] */ ARM64("ldur x9, [x23, #-0xa8]");
    /* 0x00ba1c0c: ldur     x10, [x23, #-0x88] */ ARM64("ldur x10, [x23, #-0x88]");
    /* 0x00ba1c10: subs     x9, x9, x10 */ ARM64("subs x9, x9, x10");
    /* 0x00ba1c14: csel     x9, xzr, x9, lo */ ARM64("csel x9, xzr, x9, lo");
    /* 0x00ba1c18: add      x1, x9, x8 */ ARM64("add x1, x9, x8");
    /* 0x00ba1c1c: ldur     x8, [x23, #-0x30] */ ARM64("ldur x8, [x23, #-0x30]");
    /* 0x00ba1c20: cmp      x1, x8 */ ARM64("cmp x1, x8");
    /* 0x00ba1c24: b.hi     #0xba2144 */ if (COND_HI) goto loc_00ba2144;
loc_00ba1c28:
    /* 0x00ba1c28: ldp      x20, x25, [x23, #-0x80] */ ARM64("ldp x20, x25, [x23, #-0x80]");
    /* 0x00ba1c2c: ldur     x24, [x23, #-0x68] */ ARM64("ldur x24, [x23, #-0x68]");
    /* 0x00ba1c30: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00ba1c34: add      x8, x8, #0x958 */ ARM64("add x8, x8, #0x958");
    /* 0x00ba1c38: ldp      q0, q1, [x8] */ ARM64("ldp q0, q1, [x8]");
    /* 0x00ba1c3c: stp      q0, q1, [x23, #-0x80] */ ARM64("stp q0, q1, [x23, #-0x80]");
    /* 0x00ba1c40: ldur     x8, [x23, #-0x10] */ ARM64("ldur x8, [x23, #-0x10]");
    /* 0x00ba1c44: lsl      x21, x25, #3 */ ARM64("lsl x21, x25, #3");
    /* 0x00ba1c48: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00ba1c4c: b.hi     #0xba2154 */ if (COND_HI) goto loc_00ba2154;
loc_00ba1c50:
    /* 0x00ba1c50: ldr      d0, [x20] */ ARM64("ldr d0, [x20]");
    /* 0x00ba1c54: add      x8, x21, x25 */ ARM64("add x8, x21, x25");
    /* 0x00ba1c58: sub      x9, x20, x21 */ ARM64("sub x9, x20, x21");
    /* 0x00ba1c5c: sub      x9, x9, #8 */ ARM64("sub x9, x9, #8");
    /* 0x00ba1c60: cmn      x8, #0x11 */ ARM64("cmn x8, #0x11");
    /* 0x00ba1c64: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba1c68: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba1c6c: csel     w8, w8, w8, ne */ ARM64("csel w8, w8, w8, ne");
    /* 0x00ba1c70: str      w8, [sp, #0x100] */ ARM64("str w8, [sp, #0x100]");
    /* 0x00ba1c74: csel     x8, x9, x8, ne */ ARM64("csel x8, x9, x8, ne");
    /* 0x00ba1c78: str      x8, [sp, #0xf0] */ ARM64("str x8, [sp, #0xf0]");
    /* 0x00ba1c7c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba1c80: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba1c84: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba1c88: add      x23, x20, #8 */ ARM64("add x23, x20, #8");
    /* 0x00ba1c8c: str      x25, [sp, #0x110] */ ARM64("str x25, [sp, #0x110]");
    /* 0x00ba1c90: b        #0xba1da8 */ goto loc_00ba1da8;
loc_00ba1c94:
    /* 0x00ba1c94: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba1c98: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba1c9c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba1ca0: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba1ca4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1ca8: b.eq     #0xba1cd8 */ if (COND_EQ) goto loc_00ba1cd8;
loc_00ba1cac:
    /* 0x00ba1cac: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba1cb0: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba1cb4: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba1cb8: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba1cbc: sub      x16, x8, x16, lsl #3 */ ARM64("sub x16, x8, x16, lsl #3");
    /* 0x00ba1cc0: ldur     x16, [x16, #-8] */ ARM64("ldur x16, [x16, #-8]");
    /* 0x00ba1cc4: cmp      x25, x16 */ ARM64("cmp x25, x16");
    /* 0x00ba1cc8: b.eq     #0xba1d28 */ if (COND_EQ) goto loc_00ba1d28;
    /* 0x00ba1ccc: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba1cd0: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba1cd4: b.ne     #0xba1cac */ if (COND_NE) goto loc_00ba1cac;
loc_00ba1cd8:
    /* 0x00ba1cd8: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba1cdc: b.eq     #0xba1cfc */ if (COND_EQ) goto loc_00ba1cfc;
    /* 0x00ba1ce0: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba1ce4: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba1ce8: cbz      x11, #0xba1d18 */ if (x11 == 0) goto loc_00ba1d18;
    /* 0x00ba1cec: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1cf0: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1cf4: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba1cf8: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba1cfc:
    /* 0x00ba1cfc: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba1d00: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba1d04: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba1d08: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba1d0c: tbnz     w13, #0, #0xba1d50 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba1d50;
    /* 0x00ba1d10: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba1d14: b        #0xba1d1c */ goto loc_00ba1d1c;
loc_00ba1d18:
    /* 0x00ba1d18: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba1d1c:
    /* 0x00ba1d1c: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba1d20: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba1d24: b        #0xba1c94 */ goto loc_00ba1c94;
loc_00ba1d28:
    /* 0x00ba1d28: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba1d2c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba1d30: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba1d34: cbnz     w9, #0xba1d28 */ if (w9 != 0) goto loc_00ba1d28;
    /* 0x00ba1d38: mov      w26, #0xc8 */ ARM64("mov w26, #0xc8");
    /* 0x00ba1d3c: b.ne     #0xba1d90 */ if (COND_NE) goto loc_00ba1d90;
    /* 0x00ba1d40: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba1d44: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba1d48: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba1d4c: b        #0xba1d90 */ goto loc_00ba1d90;
loc_00ba1d50:
    /* 0x00ba1d50: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba1d54: tbz      w12, #0x1f, #0xba1ed4 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba1ed4;
loc_00ba1d58:
    /* 0x00ba1d58: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba1d5c: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba1d60: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba1d64: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba1d68: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba1d6c: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba1d70: ldur     q0, [x26, #-0x10] */ ARM64("ldur q0, [x26, #-0x10]");
    /* 0x00ba1d74: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1d78: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba1d7c: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba1d80: stur     q0, [x26, #-0x10] */ ARM64("stur q0, [x26, #-0x10]");
    /* 0x00ba1d84: sub      x8, x8, x11, lsl #3 */ ARM64("sub x8, x8, x11, lsl #3");
    /* 0x00ba1d88: stur     x25, [x8, #-8] */ ARM64("stur x25, [x8, #-8]");
    /* 0x00ba1d8c: mov      w26, #0xc8 */ ARM64("mov w26, #0xc8");
loc_00ba1d90:
    /* 0x00ba1d90: ldr      x3, [x27] */ ARM64("ldr x3, [x27]");
    /* 0x00ba1d94: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba1d98: ldr      x1, [sp, #0xc0] */ ARM64("ldr x1, [sp, #0xc0]");
    /* 0x00ba1d9c: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00ba1da0: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00ba1da4: bl       #0xbd4538 */ CALL_DIRECT(sub_00bd4538);
loc_00ba1da8:
    /* 0x00ba1da8: cbz      x24, #0xba1ef4 */ if (x24 == 0) goto loc_00ba1ef4;
    /* 0x00ba1dac: cbnz     x21, #0xba1dc8 */ if (x21 != 0) goto loc_00ba1dc8;
loc_00ba1db0:
    /* 0x00ba1db0: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba1db4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba1db8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba1dbc: sub      x20, x20, #0x40 */ ARM64("sub x20, x20, #0x40");
    /* 0x00ba1dc0: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba1dc4: cbz      x21, #0xba1db0 */ if (x21 == 0) goto loc_00ba1db0;
loc_00ba1dc8:
    /* 0x00ba1dc8: ldr      x8, [sp, #0x2c8] */ ARM64("ldr x8, [sp, #0x2c8]");
    /* 0x00ba1dcc: cbz      x8, #0xba2168 */ if (x8 == 0) goto loc_00ba2168;
    /* 0x00ba1dd0: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba1dd4: sub      x9, x21, #1 */ ARM64("sub x9, x21, #1");
    /* 0x00ba1dd8: rbit     x10, x21 */ ARM64("rbit x10, x21");
    /* 0x00ba1ddc: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba1de0: and      x21, x9, x21 */ ARM64("and x21, x9, x21");
    /* 0x00ba1de4: and      x9, x10, #0x78 */ ARM64("and x9, x10, #0x78");
    /* 0x00ba1de8: sub      x9, x20, x9 */ ARM64("sub x9, x20, x9");
    /* 0x00ba1dec: sub      x24, x24, #1 */ ARM64("sub x24, x24, #1");
    /* 0x00ba1df0: ldur     x27, [x9, #-8] */ ARM64("ldur x27, [x9, #-8]");
    /* 0x00ba1df4: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba1df8: ldr      x10, [sp, #0x2b0] */ ARM64("ldr x10, [sp, #0x2b0]");
    /* 0x00ba1dfc: and      x11, x28, x9 */ ARM64("and x11, x28, x9");
    /* 0x00ba1e00: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1e04: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1e08: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1e0c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1e10: b.eq     #0xba1e48 */ if (COND_EQ) goto loc_00ba1e48;
loc_00ba1e14:
    /* 0x00ba1e14: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba1e18: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba1e1c: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba1e20: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba1e24: mneg     x13, x13, x26 */ ARM64("mneg x13, x13, x26");
    /* 0x00ba1e28: add      x26, x10, x13 */ ARM64("add x26, x10, x13");
    /* 0x00ba1e2c: ldur     w13, [x26, #-0xc8] */ ARM64("ldur w13, [x26, #-0xc8]");
    /* 0x00ba1e30: cmp      w13, w22 */ ARM64("cmp w13, w22");
    /* 0x00ba1e34: b.eq     #0xba1e80 */ if (COND_EQ) goto loc_00ba1e80;
    /* 0x00ba1e38: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba1e3c: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba1e40: mov      w26, #0xc8 */ ARM64("mov w26, #0xc8");
    /* 0x00ba1e44: b.ne     #0xba1e14 */ if (COND_NE) goto loc_00ba1e14;
loc_00ba1e48:
    /* 0x00ba1e48: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1e4c: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba1e50: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba1e54: fmov     w12, s0 */ ARM64("fmov w12, s0");
    /* 0x00ba1e58: tbnz     w12, #0, #0xba2168 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba2168;
    /* 0x00ba1e5c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba1e60: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba1e64: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba1e68: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1e6c: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1e70: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1e74: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1e78: b.ne     #0xba1e14 */ if (COND_NE) goto loc_00ba1e14;
    /* 0x00ba1e7c: b        #0xba1e48 */ goto loc_00ba1e48;
loc_00ba1e80:
    /* 0x00ba1e80: ldr      x25, [x27] */ ARM64("ldr x25, [x27]");
loc_00ba1e84:
    /* 0x00ba1e84: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba1e88: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba1e8c: stxr     w10, x9, [x25] */ ARM64("stxr w10, x9, [x25]");
    /* 0x00ba1e90: cbnz     w10, #0xba1e84 */ if (w10 != 0) goto loc_00ba1e84;
    /* 0x00ba1e94: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba1e98: ldur     x8, [x26, #-0x10] */ ARM64("ldur x8, [x26, #-0x10]");
    /* 0x00ba1e9c: cbz      x8, #0xba1ec0 */ if (x8 == 0) goto loc_00ba1ec0;
loc_00ba1ea0:
    /* 0x00ba1ea0: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba1ea4: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba1ea8: add      x8, x25, #8 */ ARM64("add x8, x25, #8");
    /* 0x00ba1eac: mul      x14, x8, x19 */ ARM64("mul x14, x8, x19");
    /* 0x00ba1eb0: ldp      x8, x10, [x26, #-0x20] */ ARM64("ldp x8, x10, [x26, #-0x20]");
    /* 0x00ba1eb4: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba1eb8: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba1ebc: b        #0xba1c94 */ goto loc_00ba1c94;
loc_00ba1ec0:
    /* 0x00ba1ec0: sub      x0, x26, #0x20 */ ARM64("sub x0, x26, #0x20");
    /* 0x00ba1ec4: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba1ec8: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00ba1ecc: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00ba1ed0: b        #0xba1ea0 */ goto loc_00ba1ea0;
loc_00ba1ed4:
    /* 0x00ba1ed4: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba1ed8: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba1edc: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba1ee0: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba1ee4: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba1ee8: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba1eec: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba1ef0: b        #0xba1d58 */ goto loc_00ba1d58;
loc_00ba1ef4:
    /* 0x00ba1ef4: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba1ef8: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba1efc: ldr      w9, [sp, #0x100] */ ARM64("ldr w9, [sp, #0x100]");
    /* 0x00ba1f00: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00ba1f04: tbnz     w8, #0, #0xba1f10 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba1f10;
    /* 0x00ba1f08: ldr      x0, [sp, #0xf0] */ ARM64("ldr x0, [sp, #0xf0]");
    /* 0x00ba1f0c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba1f10:
    /* 0x00ba1f10: ldr      x8, [sp, #0x2c8] */ ARM64("ldr x8, [sp, #0x2c8]");
    /* 0x00ba1f14: cbz      x8, #0xba2f84 */ if (x8 == 0) goto loc_00ba2f84;
    /* 0x00ba1f18: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba1f1c: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba1f20: ldr      x10, [sp, #0x2b0] */ ARM64("ldr x10, [sp, #0x2b0]");
    /* 0x00ba1f24: and      x11, x28, x9 */ ARM64("and x11, x28, x9");
    /* 0x00ba1f28: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1f2c: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1f30: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1f34: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1f38: b.eq     #0xba1f6c */ if (COND_EQ) goto loc_00ba1f6c;
loc_00ba1f3c:
    /* 0x00ba1f3c: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba1f40: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba1f44: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba1f48: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba1f4c: mneg     x13, x13, x26 */ ARM64("mneg x13, x13, x26");
    /* 0x00ba1f50: add      x20, x10, x13 */ ARM64("add x20, x10, x13");
    /* 0x00ba1f54: ldur     w13, [x20, #-0xc8] */ ARM64("ldur w13, [x20, #-0xc8]");
    /* 0x00ba1f58: cmp      w13, w22 */ ARM64("cmp w13, w22");
    /* 0x00ba1f5c: b.eq     #0xba1fa4 */ if (COND_EQ) goto loc_00ba1fa4;
    /* 0x00ba1f60: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba1f64: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba1f68: b.ne     #0xba1f3c */ if (COND_NE) goto loc_00ba1f3c;
loc_00ba1f6c:
    /* 0x00ba1f6c: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba1f70: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba1f74: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba1f78: fmov     w12, s0 */ ARM64("fmov w12, s0");
    /* 0x00ba1f7c: tbnz     w12, #0, #0xba2f84 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba2f84;
    /* 0x00ba1f80: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba1f84: add      x28, x11, x8 */ ARM64("add x28, x11, x8");
    /* 0x00ba1f88: and      x11, x28, x9 */ ARM64("and x11, x28, x9");
    /* 0x00ba1f8c: ldr      d0, [x10, x11] */ ARM64("ldr d0, [x10, x11]");
    /* 0x00ba1f90: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba1f94: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba1f98: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba1f9c: b.ne     #0xba1f3c */ if (COND_NE) goto loc_00ba1f3c;
    /* 0x00ba1fa0: b        #0xba1f6c */ goto loc_00ba1f6c;
loc_00ba1fa4:
    /* 0x00ba1fa4: ldur     x25, [x20, #-0xb8] */ ARM64("ldur x25, [x20, #-0xb8]");
    /* 0x00ba1fa8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba1fac: cbz      x25, #0xba1ff0 */ if (x25 == 0) goto loc_00ba1ff0;
    /* 0x00ba1fb0: add      x8, x25, #1 */ ARM64("add x8, x25, #1");
    /* 0x00ba1fb4: lsr      x9, x8, #0x3d */ ARM64("lsr x9, x8, #0x3d");
    /* 0x00ba1fb8: cbnz     x9, #0xba34d4 */ if (x9 != 0) goto loc_00ba34d4;
    /* 0x00ba1fbc: lsl      x21, x8, #3 */ ARM64("lsl x21, x8, #3");
    /* 0x00ba1fc0: add      x8, x25, #9 */ ARM64("add x8, x25, #9");
    /* 0x00ba1fc4: adds     x23, x8, x21 */ ARM64("adds x23, x8, x21");
    /* 0x00ba1fc8: b.hs     #0xba34d4 */ if (COND_HS) goto loc_00ba34d4;
    /* 0x00ba1fcc: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba1fd0: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba1fd4: b.hi     #0xba34d4 */ if (COND_HI) goto loc_00ba34d4;
    /* 0x00ba1fd8: cbz      x23, #0xba2008 */ if (x23 == 0) goto loc_00ba2008;
    /* 0x00ba1fdc: cmp      x23, #7 */ ARM64("cmp x23, #7");
    /* 0x00ba1fe0: b.ls     #0xba2010 */ if (COND_LS) goto loc_00ba2010;
    /* 0x00ba1fe4: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba1fe8: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba1fec: b        #0xba202c */ goto loc_00ba202c;
loc_00ba1ff0:
    /* 0x00ba1ff0: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00ba1ff4: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba1ff8: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00ba1ffc: adrp     x23, #0xe0e000 */ ARM64("adrp x23, #0xe0e000");
    /* 0x00ba2000: add      x23, x23, #0xd10 */ ARM64("add x23, x23, #0xd10");
    /* 0x00ba2004: b        #0xba2090 */ goto loc_00ba2090;
loc_00ba2008:
    /* 0x00ba2008: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba200c: b        #0xba2030 */ goto loc_00ba2030;
loc_00ba2010:
    /* 0x00ba2010: str      xzr, [sp, #0x130] */ ARM64("str xzr, [sp, #0x130]");
    /* 0x00ba2014: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba2018: mov      w1, #8 */ ARM64("mov w1, #8");
    /* 0x00ba201c: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00ba2020: bl       #0xc7ae50 */ CALL_DIRECT(sub_00c7ae50);
    /* 0x00ba2024: cbnz     w0, #0xba78c0 */ if (w0 != 0) goto loc_00ba78c0;
    /* 0x00ba2028: ldr      x0, [sp, #0x130] */ ARM64("ldr x0, [sp, #0x130]");
loc_00ba202c:
    /* 0x00ba202c: cbz      x0, #0xba78c0 */ if (x0 == 0) goto loc_00ba78c0;
loc_00ba2030:
    /* 0x00ba2030: add      x23, x0, x21 */ ARM64("add x23, x0, x21");
    /* 0x00ba2034: ldur     x24, [x20, #-0xc0] */ ARM64("ldur x24, [x20, #-0xc0]");
    /* 0x00ba2038: add      x2, x25, #9 */ ARM64("add x2, x25, #9");
    /* 0x00ba203c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba2040: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba2044: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00ba2048: mvn      x8, x25 */ ARM64("mvn x8, x25");
    /* 0x00ba204c: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00ba2050: lsl      x26, x25, #3 */ ARM64("lsl x26, x25, #3");
    /* 0x00ba2054: add      x0, x23, x8 */ ARM64("add x0, x23, x8");
    /* 0x00ba2058: add      x1, x24, x8 */ ARM64("add x1, x24, x8");
    /* 0x00ba205c: add      x2, x26, #8 */ ARM64("add x2, x26, #8");
    /* 0x00ba2060: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00ba2064: ldur     x21, [x20, #-0xa8] */ ARM64("ldur x21, [x20, #-0xa8]");
    /* 0x00ba2068: ldr      d0, [x23] */ ARM64("ldr d0, [x23]");
    /* 0x00ba206c: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba2070: cset     w20, ne */ ARM64("cset w20, ne");
    /* 0x00ba2074: cbz      x25, #0xba2090 */ if (x25 == 0) goto loc_00ba2090;
    /* 0x00ba2078: add      x8, x26, x25 */ ARM64("add x8, x26, x25");
    /* 0x00ba207c: sub      x9, x23, x26 */ ARM64("sub x9, x23, x26");
    /* 0x00ba2080: sub      x24, x9, #8 */ ARM64("sub x24, x9, #8");
    /* 0x00ba2084: cmn      x8, #0x11 */ ARM64("cmn x8, #0x11");
    /* 0x00ba2088: cset     w25, eq */ ARM64("cset w25, eq");
    /* 0x00ba208c: b        #0xba2090 */ goto loc_00ba2090;
loc_00ba2090:
    /* 0x00ba2090: ldr      x10, [sp, #0xb0] */ ARM64("ldr x10, [sp, #0xb0]");
    /* 0x00ba2094: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2098: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba209c: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00ba20a0: add      x26, x23, #8 */ ARM64("add x26, x23, #8");
    /* 0x00ba20a4: b        #0xba20e0 */ goto loc_00ba20e0;
loc_00ba20a8:
    /* 0x00ba20a8: sub      x8, x27, #1 */ ARM64("sub x8, x27, #1");
    /* 0x00ba20ac: rbit     x9, x27 */ ARM64("rbit x9, x27");
    /* 0x00ba20b0: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba20b4: and      x27, x8, x27 */ ARM64("and x27, x8, x27");
    /* 0x00ba20b8: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00ba20bc: sub      x8, x23, x8 */ ARM64("sub x8, x23, x8");
    /* 0x00ba20c0: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00ba20c4: ldur     x8, [x8, #-8] */ ARM64("ldur x8, [x8, #-8]");
    /* 0x00ba20c8: ldr      x3, [x8] */ ARM64("ldr x3, [x8]");
    /* 0x00ba20cc: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba20d0: ldr      x1, [sp, #0xc0] */ ARM64("ldr x1, [sp, #0xc0]");
    /* 0x00ba20d4: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00ba20d8: bl       #0xbd4538 */ CALL_DIRECT(sub_00bd4538);
    /* 0x00ba20dc: ldr      x10, [sp, #0xb0] */ ARM64("ldr x10, [sp, #0xb0]");
loc_00ba20e0:
    /* 0x00ba20e0: cbz      x21, #0xba2104 */ if (x21 == 0) goto loc_00ba2104;
    /* 0x00ba20e4: cbnz     x27, #0xba20a8 */ if (x27 != 0) goto loc_00ba20a8;
loc_00ba20e8:
    /* 0x00ba20e8: ldr      d0, [x26], #8 */ ARM64("ldr d0, [x26], #8");
    /* 0x00ba20ec: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba20f0: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba20f4: sub      x23, x23, #0x40 */ ARM64("sub x23, x23, #0x40");
    /* 0x00ba20f8: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00ba20fc: cbz      x27, #0xba20e8 */ if (x27 == 0) goto loc_00ba20e8;
    /* 0x00ba2100: b        #0xba20a8 */ goto loc_00ba20a8;
loc_00ba2104:
    /* 0x00ba2104: orn      w8, w25, w20 */ ARM64("orn w8, w25, w20");
    /* 0x00ba2108: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba210c: add      x0, x0, #0x300 */ ARM64("add x0, x0, #0x300");
    /* 0x00ba2110: ldr      x21, [sp, #0xa8] */ ARM64("ldr x21, [sp, #0xa8]");
    /* 0x00ba2114: mov      x23, #-0x8000000000000000 */ ARM64("mov x23, #-0x8000000000000000");
    /* 0x00ba2118: ldr      x9, [sp, #0xe0] */ ARM64("ldr x9, [sp, #0xe0]");
    /* 0x00ba211c: mov      w26, #0xc8 */ ARM64("mov w26, #0xc8");
    /* 0x00ba2120: tbnz     w8, #0, #0xba1b38 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba1b38;
    /* 0x00ba2124: mov      x22, x9 */ ARM64("mov x22, x9");
    /* 0x00ba2128: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x00ba212c: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba2130: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2134: ldr      x10, [sp, #0xb0] */ ARM64("ldr x10, [sp, #0xb0]");
    /* 0x00ba2138: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba213c: mov      x9, x22 */ ARM64("mov x9, x22");
    /* 0x00ba2140: b        #0xba1b38 */ goto loc_00ba1b38;
loc_00ba2144:
    /* 0x00ba2144: sub      x0, x23, #0x40 */ ARM64("sub x0, x23, #0x40");
    /* 0x00ba2148: sub      x2, x23, #0x20 */ ARM64("sub x2, x23, #0x20");
    /* 0x00ba214c: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00ba2150: b        #0xba1c28 */ goto loc_00ba1c28;
loc_00ba2154:
    /* 0x00ba2154: sub      x0, x23, #0x20 */ ARM64("sub x0, x23, #0x20");
    /* 0x00ba2158: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba215c: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00ba2160: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00ba2164: b        #0xba1c50 */ goto loc_00ba1c50;
loc_00ba2168:
    /* 0x00ba2168: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba216c: add      x0, x0, #0x330 */ ARM64("add x0, x0, #0x330");
    /* 0x00ba2170: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba2174: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba2178:
    /* 0x00ba2178: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba217c: add      x0, x0, #0x360 */ ARM64("add x0, x0, #0x360");
    /* 0x00ba2180: b        #0xba2188 */ goto loc_00ba2188;
loc_00ba2184:
    /* 0x00ba2184: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
loc_00ba2188:
    /* 0x00ba2188: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba218c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba2190:
    /* 0x00ba2190: ldr      x21, [sp, #0x2b0] */ ARM64("ldr x21, [sp, #0x2b0]");
    /* 0x00ba2194: ldr      x8, [sp, #0x2b8] */ ARM64("ldr x8, [sp, #0x2b8]");
    /* 0x00ba2198: ldr      x20, [sp, #0x2c8] */ ARM64("ldr x20, [sp, #0x2c8]");
    /* 0x00ba219c: ldr      d0, [x21] */ ARM64("ldr d0, [x21]");
    /* 0x00ba21a0: mov      w9, #0xc8 */ ARM64("mov w9, #0xc8");
    /* 0x00ba21a4: mul      x9, x8, x9 */ ARM64("mul x9, x8, x9");
    /* 0x00ba21a8: add      x10, x9, x8 */ ARM64("add x10, x9, x8");
    /* 0x00ba21ac: add      x10, x10, #0xd1 */ ARM64("add x10, x10, #0xd1");
    /* 0x00ba21b0: sub      x9, x21, x9 */ ARM64("sub x9, x21, x9");
    /* 0x00ba21b4: sub      x9, x9, #0xc8 */ ARM64("sub x9, x9, #0xc8");
    /* 0x00ba21b8: mov      w11, #8 */ ARM64("mov w11, #8");
    /* 0x00ba21bc: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba21c0: csel     x22, x8, x10, eq */ ARM64("csel x22, x8, x10, eq");
    /* 0x00ba21c4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba21c8: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba21cc: adrp     x12, #0xefc000 */ ARM64("adrp x12, #0xefc000");
    /* 0x00ba21d0: add      x12, x12, #0x958 */ ARM64("add x12, x12, #0x958");
    /* 0x00ba21d4: ldp      q0, q1, [x12] */ ARM64("ldp q0, q1, [x12]");
    /* 0x00ba21d8: csel     x23, x8, x9, eq */ ARM64("csel x23, x8, x9, eq");
    /* 0x00ba21dc: csel     x27, xzr, x11, eq */ ARM64("csel x27, xzr, x11, eq");
    /* 0x00ba21e0: and      x24, x10, #0x8080808080808080 */ ARM64("and x24, x10, #0x8080808080808080");
    /* 0x00ba21e4: add      x26, x21, #8 */ ARM64("add x26, x21, #8");
    /* 0x00ba21e8: stp      q1, q0, [sp, #0xe0] */ ARM64("stp q1, q0, [sp, #0xe0]");
    /* 0x00ba21ec: stp      q0, q1, [sp, #0x390] */ ARM64("stp q0, q1, [sp, #0x390]");
    /* 0x00ba21f0: add      x8, x21, x8 */ ARM64("add x8, x21, x8");
    /* 0x00ba21f4: add      x25, x8, #1 */ ARM64("add x25, x8, #1");
    /* 0x00ba21f8: stp      x27, x22, [x29, #-0xf0] */ ARM64("stp x27, x22, [x29, #-0xf0]");
    /* 0x00ba21fc: stp      x23, x21, [x29, #-0xe0] */ ARM64("stp x23, x21, [x29, #-0xe0]");
    /* 0x00ba2200: stp      x24, x26, [x29, #-0xd0] */ ARM64("stp x24, x26, [x29, #-0xd0]");
    /* 0x00ba2204: stp      x25, x20, [x29, #-0xc0] */ ARM64("stp x25, x20, [x29, #-0xc0]");
    /* 0x00ba2208: cbnz     x20, #0xba732c */ if (x20 != 0) goto loc_00ba732c;
loc_00ba220c:
    /* 0x00ba220c: stp      x27, x22, [x29, #-0xb0] */ ARM64("stp x27, x22, [x29, #-0xb0]");
    /* 0x00ba2210: stp      x23, x21, [x29, #-0xa0] */ ARM64("stp x23, x21, [x29, #-0xa0]");
    /* 0x00ba2214: stp      x24, x26, [x29, #-0x90] */ ARM64("stp x24, x26, [x29, #-0x90]");
    /* 0x00ba2218: add      x22, sp, #0x130 */ ARM64("add x22, sp, #0x130");
    /* 0x00ba221c: stp      x25, x20, [x29, #-0x80] */ ARM64("stp x25, x20, [x29, #-0x80]");
    /* 0x00ba2220: cbnz     x20, #0xba2230 */ if (x20 != 0) goto loc_00ba2230;
    /* 0x00ba2224: b        #0xba2740 */ goto loc_00ba2740;
loc_00ba2228:
    /* 0x00ba2228: ldur     x20, [x29, #-0x78] */ ARM64("ldur x20, [x29, #-0x78]");
    /* 0x00ba222c: cbz      x20, #0xba2740 */ if (x20 == 0) goto loc_00ba2740;
loc_00ba2230:
    /* 0x00ba2230: ldp      x8, x9, [x29, #-0x98] */ ARM64("ldp x8, x9, [x29, #-0x98]");
    /* 0x00ba2234: cbnz     x9, #0xba225c */ if (x9 != 0) goto loc_00ba225c;
    /* 0x00ba2238: ldur     x10, [x29, #-0x88] */ ARM64("ldur x10, [x29, #-0x88]");
loc_00ba223c:
    /* 0x00ba223c: ldr      d0, [x10], #8 */ ARM64("ldr d0, [x10], #8");
    /* 0x00ba2240: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2244: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00ba2248: sub      x8, x8, #0x640 */ ARM64("sub x8, x8, #0x640");
    /* 0x00ba224c: and      x9, x9, #0x8080808080808080 */ ARM64("and x9, x9, #0x8080808080808080");
    /* 0x00ba2250: cbz      x9, #0xba223c */ if (x9 == 0) goto loc_00ba223c;
    /* 0x00ba2254: stur     x10, [x29, #-0x88] */ ARM64("stur x10, [x29, #-0x88]");
    /* 0x00ba2258: stur     x8, [x29, #-0x98] */ ARM64("stur x8, [x29, #-0x98]");
loc_00ba225c:
    /* 0x00ba225c: sub      x10, x9, #1 */ ARM64("sub x10, x9, #1");
    /* 0x00ba2260: rbit     x11, x9 */ ARM64("rbit x11, x9");
    /* 0x00ba2264: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba2268: and      x9, x10, x9 */ ARM64("and x9, x10, x9");
    /* 0x00ba226c: neg      x10, x11, lsr #3 */ ARM64("neg x10, x11, lsr #3");
    /* 0x00ba2270: mov      w11, #0xc8 */ ARM64("mov w11, #0xc8");
    /* 0x00ba2274: smaddl   x10, w10, w11, x8 */ ARM64("smaddl x10, w10, w11, x8");
    /* 0x00ba2278: sub      x26, x20, #1 */ ARM64("sub x26, x20, #1");
    /* 0x00ba227c: stur     x9, [x29, #-0x90] */ ARM64("stur x9, [x29, #-0x90]");
    /* 0x00ba2280: stur     x26, [x29, #-0x78] */ ARM64("stur x26, [x29, #-0x78]");
    /* 0x00ba2284: ldur     w20, [x10, #-0xc8] */ ARM64("ldur w20, [x10, #-0xc8]");
    /* 0x00ba2288: ldp      x8, x9, [x10, #-0xc0] */ ARM64("ldp x8, x9, [x10, #-0xc0]");
    /* 0x00ba228c: ldp      x24, x23, [x10, #-0xa0] */ ARM64("ldp x24, x23, [x10, #-0xa0]");
    /* 0x00ba2290: ldp      x28, x25, [x10, #-0x80] */ ARM64("ldp x28, x25, [x10, #-0x80]");
    /* 0x00ba2294: ldp      x21, x27, [x10, #-0x60] */ ARM64("ldp x21, x27, [x10, #-0x60]");
    /* 0x00ba2298: ldp      q0, q1, [x10, #-0x20] */ ARM64("ldp q0, q1, [x10, #-0x20]");
    /* 0x00ba229c: ldp      q3, q2, [x10, #-0x40] */ ARM64("ldp q3, q2, [x10, #-0x40]");
    /* 0x00ba22a0: stp      q0, q1, [sp, #0x160] */ ARM64("stp q0, q1, [sp, #0x160]");
    /* 0x00ba22a4: stp      q3, q2, [sp, #0x140] */ ARM64("stp q3, q2, [sp, #0x140]");
    /* 0x00ba22a8: ldur     q0, [x10, #-0x50] */ ARM64("ldur q0, [x10, #-0x50]");
    /* 0x00ba22ac: str      q0, [sp, #0x130] */ ARM64("str q0, [sp, #0x130]");
    /* 0x00ba22b0: cbz      x8, #0xba26d8 */ if (x8 == 0) goto loc_00ba26d8;
    /* 0x00ba22b4: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00ba22b8: lsl      x10, x9, #3 */ ARM64("lsl x10, x9, #3");
    /* 0x00ba22bc: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba22c0: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba22c4: b.ne     #0xba2314 */ if (COND_NE) goto loc_00ba2314;
    /* 0x00ba22c8: cmp      x23, #0 */ ARM64("cmp x23, #0");
    /* 0x00ba22cc: lsl      x8, x23, #3 */ ARM64("lsl x8, x23, #3");
    /* 0x00ba22d0: add      x9, x8, x23 */ ARM64("add x9, x8, x23");
    /* 0x00ba22d4: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba22d8: b.ne     #0xba2334 */ if (COND_NE) goto loc_00ba2334;
loc_00ba22dc:
    /* 0x00ba22dc: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba22e0: lsl      x8, x25, #3 */ ARM64("lsl x8, x25, #3");
    /* 0x00ba22e4: add      x9, x8, x25 */ ARM64("add x9, x8, x25");
    /* 0x00ba22e8: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba22ec: b.ne     #0xba2354 */ if (COND_NE) goto loc_00ba2354;
loc_00ba22f0:
    /* 0x00ba22f0: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00ba22f4: lsl      x8, x27, #3 */ ARM64("lsl x8, x27, #3");
    /* 0x00ba22f8: add      x9, x8, x27 */ ARM64("add x9, x8, x27");
    /* 0x00ba22fc: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba2300: b.ne     #0xba2374 */ if (COND_NE) goto loc_00ba2374;
loc_00ba2304:
    /* 0x00ba2304: ldr      x8, [sp, #0x3a0] */ ARM64("ldr x8, [sp, #0x3a0]");
    /* 0x00ba2308: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba230c: cbnz     x8, #0xba238c */ if (x8 != 0) goto loc_00ba238c;
    /* 0x00ba2310: b        #0xba26a0 */ goto loc_00ba26a0;
loc_00ba2314:
    /* 0x00ba2314: sub      x8, x8, x10 */ ARM64("sub x8, x8, x10");
    /* 0x00ba2318: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba231c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2320: cmp      x23, #0 */ ARM64("cmp x23, #0");
    /* 0x00ba2324: lsl      x8, x23, #3 */ ARM64("lsl x8, x23, #3");
    /* 0x00ba2328: add      x9, x8, x23 */ ARM64("add x9, x8, x23");
    /* 0x00ba232c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba2330: b.eq     #0xba22dc */ if (COND_EQ) goto loc_00ba22dc;
loc_00ba2334:
    /* 0x00ba2334: sub      x8, x24, x8 */ ARM64("sub x8, x24, x8");
    /* 0x00ba2338: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba233c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2340: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba2344: lsl      x8, x25, #3 */ ARM64("lsl x8, x25, #3");
    /* 0x00ba2348: add      x9, x8, x25 */ ARM64("add x9, x8, x25");
    /* 0x00ba234c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba2350: b.eq     #0xba22f0 */ if (COND_EQ) goto loc_00ba22f0;
loc_00ba2354:
    /* 0x00ba2354: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00ba2358: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba235c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2360: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00ba2364: lsl      x8, x27, #3 */ ARM64("lsl x8, x27, #3");
    /* 0x00ba2368: add      x9, x8, x27 */ ARM64("add x9, x8, x27");
    /* 0x00ba236c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00ba2370: b.eq     #0xba2304 */ if (COND_EQ) goto loc_00ba2304;
loc_00ba2374:
    /* 0x00ba2374: sub      x8, x21, x8 */ ARM64("sub x8, x21, x8");
    /* 0x00ba2378: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba237c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2380: ldr      x8, [sp, #0x3a0] */ ARM64("ldr x8, [sp, #0x3a0]");
    /* 0x00ba2384: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba2388: cbz      x8, #0xba26a0 */ if (x8 == 0) goto loc_00ba26a0;
loc_00ba238c:
    /* 0x00ba238c: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba2390: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba2394: mul      x14, x20, x19 */ ARM64("mul x14, x20, x19");
    /* 0x00ba2398: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba239c: ldr      x10, [sp, #0x398] */ ARM64("ldr x10, [sp, #0x398]");
    /* 0x00ba23a0: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba23a4: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba23a8: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba23ac: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba23b0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba23b4: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba23b8: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba23bc: b.eq     #0xba23f4 */ if (COND_EQ) goto loc_00ba23f4;
loc_00ba23c0:
    /* 0x00ba23c0: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba23c4: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba23c8: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba23cc: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba23d0: mov      w17, #0x48 */ ARM64("mov w17, #0x48");
    /* 0x00ba23d4: mneg     x16, x16, x17 */ ARM64("mneg x16, x16, x17");
    /* 0x00ba23d8: add      x16, x8, x16 */ ARM64("add x16, x8, x16");
    /* 0x00ba23dc: ldur     w17, [x16, #-0x48] */ ARM64("ldur w17, [x16, #-0x48]");
    /* 0x00ba23e0: cmp      w20, w17 */ ARM64("cmp w20, w17");
    /* 0x00ba23e4: b.eq     #0xba245c */ if (COND_EQ) goto loc_00ba245c;
    /* 0x00ba23e8: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba23ec: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba23f0: b.ne     #0xba23c0 */ if (COND_NE) goto loc_00ba23c0;
loc_00ba23f4:
    /* 0x00ba23f4: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba23f8: b.eq     #0xba2418 */ if (COND_EQ) goto loc_00ba2418;
    /* 0x00ba23fc: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba2400: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba2404: cbz      x11, #0xba2434 */ if (x11 == 0) goto loc_00ba2434;
    /* 0x00ba2408: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba240c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba2410: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba2414: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba2418:
    /* 0x00ba2418: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba241c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba2420: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba2424: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba2428: tbnz     w13, #0, #0xba260c */ if (((w13 >> #0) & 1) != 0) goto loc_00ba260c;
    /* 0x00ba242c: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba2430: b        #0xba2438 */ goto loc_00ba2438;
loc_00ba2434:
    /* 0x00ba2434: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba2438:
    /* 0x00ba2438: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba243c: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba2440: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba2444: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba2448: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba244c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba2450: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba2454: b.ne     #0xba23c0 */ if (COND_NE) goto loc_00ba23c0;
    /* 0x00ba2458: b        #0xba23f4 */ goto loc_00ba23f4;
loc_00ba245c:
    /* 0x00ba245c: ldur     q0, [x16, #-0x40] */ ARM64("ldur q0, [x16, #-0x40]");
    /* 0x00ba2460: str      q0, [sp, #0x2d0] */ ARM64("str q0, [sp, #0x2d0]");
    /* 0x00ba2464: ldur     q0, [x16, #-0x30] */ ARM64("ldur q0, [x16, #-0x30]");
    /* 0x00ba2468: str      q0, [sp, #0x2e0] */ ARM64("str q0, [sp, #0x2e0]");
    /* 0x00ba246c: ldur     q0, [x16, #-0x20] */ ARM64("ldur q0, [x16, #-0x20]");
    /* 0x00ba2470: str      q0, [sp, #0x2f0] */ ARM64("str q0, [sp, #0x2f0]");
    /* 0x00ba2474: ldur     q0, [x16, #-0x10] */ ARM64("ldur q0, [x16, #-0x10]");
    /* 0x00ba2478: str      q0, [sp, #0x300] */ ARM64("str q0, [sp, #0x300]");
    /* 0x00ba247c: ldur     q0, [x22, #0x10] */ ARM64("ldur q0, [x22, #0x10]");
    /* 0x00ba2480: stur     q0, [x16, #-0x40] */ ARM64("stur q0, [x16, #-0x40]");
    /* 0x00ba2484: ldur     q0, [x22, #0x20] */ ARM64("ldur q0, [x22, #0x20]");
    /* 0x00ba2488: stur     q0, [x16, #-0x30] */ ARM64("stur q0, [x16, #-0x30]");
    /* 0x00ba248c: ldur     q0, [x22, #0x30] */ ARM64("ldur q0, [x22, #0x30]");
    /* 0x00ba2490: stur     q0, [x16, #-0x20] */ ARM64("stur q0, [x16, #-0x20]");
    /* 0x00ba2494: ldur     q0, [x22, #0x40] */ ARM64("ldur q0, [x22, #0x40]");
    /* 0x00ba2498: stur     q0, [x16, #-0x10] */ ARM64("stur q0, [x16, #-0x10]");
    /* 0x00ba249c: ldr      x20, [sp, #0x2d0] */ ARM64("ldr x20, [sp, #0x2d0]");
    /* 0x00ba24a0: cbz      x20, #0xba2228 */ if (x20 == 0) goto loc_00ba2228;
    /* 0x00ba24a4: ldr      x26, [sp, #0x2d8] */ ARM64("ldr x26, [sp, #0x2d8]");
    /* 0x00ba24a8: cbz      x26, #0xba2554 */ if (x26 == 0) goto loc_00ba2554;
    /* 0x00ba24ac: ldr      x27, [sp, #0x2e8] */ ARM64("ldr x27, [sp, #0x2e8]");
    /* 0x00ba24b0: cbz      x27, #0xba2530 */ if (x27 == 0) goto loc_00ba2530;
    /* 0x00ba24b4: mov      x28, x20 */ ARM64("mov x28, x20");
    /* 0x00ba24b8: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00ba24bc: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba24c0: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba24c4: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba24c8: b        #0xba24d0 */ goto loc_00ba24d0;
loc_00ba24cc:
    /* 0x00ba24cc: cbz      x27, #0xba2530 */ if (x27 == 0) goto loc_00ba2530;
loc_00ba24d0:
    /* 0x00ba24d0: cbnz     x21, #0xba24ec */ if (x21 != 0) goto loc_00ba24ec;
loc_00ba24d4:
    /* 0x00ba24d4: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00ba24d8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba24dc: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba24e0: sub      x20, x20, #0x40 */ ARM64("sub x20, x20, #0x40");
    /* 0x00ba24e4: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba24e8: cbz      x21, #0xba24d4 */ if (x21 == 0) goto loc_00ba24d4;
loc_00ba24ec:
    /* 0x00ba24ec: sub      x8, x21, #1 */ ARM64("sub x8, x21, #1");
    /* 0x00ba24f0: rbit     x9, x21 */ ARM64("rbit x9, x21");
    /* 0x00ba24f4: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba24f8: and      x21, x8, x21 */ ARM64("and x21, x8, x21");
    /* 0x00ba24fc: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00ba2500: sub      x8, x20, x8 */ ARM64("sub x8, x20, x8");
    /* 0x00ba2504: sub      x27, x27, #1 */ ARM64("sub x27, x27, #1");
    /* 0x00ba2508: ldur     x9, [x8, #-8] */ ARM64("ldur x9, [x8, #-8]");
loc_00ba250c:
    /* 0x00ba250c: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00ba2510: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00ba2514: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00ba2518: cbnz     w11, #0xba250c */ if (w11 != 0) goto loc_00ba250c;
    /* 0x00ba251c: b.ne     #0xba24cc */ if (COND_NE) goto loc_00ba24cc;
    /* 0x00ba2520: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba2524: ldur     x0, [x8, #-8] */ ARM64("ldur x0, [x8, #-8]");
    /* 0x00ba2528: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba252c: b        #0xba24cc */ goto loc_00ba24cc;
loc_00ba2530:
    /* 0x00ba2530: lsl      x8, x26, #3 */ ARM64("lsl x8, x26, #3");
    /* 0x00ba2534: add      x9, x8, x26 */ ARM64("add x9, x8, x26");
    /* 0x00ba2538: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00ba253c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba2540: b.eq     #0xba2554 */ if (COND_EQ) goto loc_00ba2554;
    /* 0x00ba2544: ldr      x9, [sp, #0x2d0] */ ARM64("ldr x9, [sp, #0x2d0]");
    /* 0x00ba2548: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba254c: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba2550: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba2554:
    /* 0x00ba2554: ldr      x20, [sp, #0x2f8] */ ARM64("ldr x20, [sp, #0x2f8]");
    /* 0x00ba2558: cbz      x20, #0xba2228 */ if (x20 == 0) goto loc_00ba2228;
    /* 0x00ba255c: ldr      x26, [sp, #0x308] */ ARM64("ldr x26, [sp, #0x308]");
    /* 0x00ba2560: cbz      x26, #0xba25e4 */ if (x26 == 0) goto loc_00ba25e4;
    /* 0x00ba2564: ldr      x27, [sp, #0x2f0] */ ARM64("ldr x27, [sp, #0x2f0]");
    /* 0x00ba2568: mov      x28, x27 */ ARM64("mov x28, x27");
    /* 0x00ba256c: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00ba2570: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2574: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba2578: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba257c: b        #0xba2584 */ goto loc_00ba2584;
loc_00ba2580:
    /* 0x00ba2580: cbz      x26, #0xba25e4 */ if (x26 == 0) goto loc_00ba25e4;
loc_00ba2584:
    /* 0x00ba2584: cbnz     x21, #0xba25a0 */ if (x21 != 0) goto loc_00ba25a0;
loc_00ba2588:
    /* 0x00ba2588: ldr      d0, [x28], #8 */ ARM64("ldr d0, [x28], #8");
    /* 0x00ba258c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2590: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba2594: sub      x27, x27, #0x40 */ ARM64("sub x27, x27, #0x40");
    /* 0x00ba2598: and      x21, x8, #0x8080808080808080 */ ARM64("and x21, x8, #0x8080808080808080");
    /* 0x00ba259c: cbz      x21, #0xba2588 */ if (x21 == 0) goto loc_00ba2588;
loc_00ba25a0:
    /* 0x00ba25a0: sub      x8, x21, #1 */ ARM64("sub x8, x21, #1");
    /* 0x00ba25a4: rbit     x9, x21 */ ARM64("rbit x9, x21");
    /* 0x00ba25a8: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba25ac: and      x21, x8, x21 */ ARM64("and x21, x8, x21");
    /* 0x00ba25b0: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00ba25b4: sub      x8, x27, x8 */ ARM64("sub x8, x27, x8");
    /* 0x00ba25b8: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
    /* 0x00ba25bc: ldur     x9, [x8, #-8] */ ARM64("ldur x9, [x8, #-8]");
loc_00ba25c0:
    /* 0x00ba25c0: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00ba25c4: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00ba25c8: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00ba25cc: cbnz     w11, #0xba25c0 */ if (w11 != 0) goto loc_00ba25c0;
    /* 0x00ba25d0: b.ne     #0xba2580 */ if (COND_NE) goto loc_00ba2580;
    /* 0x00ba25d4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba25d8: ldur     x0, [x8, #-8] */ ARM64("ldur x0, [x8, #-8]");
    /* 0x00ba25dc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba25e0: b        #0xba2580 */ goto loc_00ba2580;
loc_00ba25e4:
    /* 0x00ba25e4: lsl      x8, x20, #3 */ ARM64("lsl x8, x20, #3");
    /* 0x00ba25e8: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00ba25ec: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00ba25f0: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba25f4: b.eq     #0xba2228 */ if (COND_EQ) goto loc_00ba2228;
    /* 0x00ba25f8: ldr      x9, [sp, #0x2f0] */ ARM64("ldr x9, [sp, #0x2f0]");
    /* 0x00ba25fc: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba2600: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba2604: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba2608: b        #0xba2228 */ goto loc_00ba2228;
loc_00ba260c:
    /* 0x00ba260c: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba2610: tbz      w12, #0x1f, #0xba26b8 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba26b8;
loc_00ba2614:
    /* 0x00ba2614: ldp      q0, q1, [x22, #0x10] */ ARM64("ldp q0, q1, [x22, #0x10]");
    /* 0x00ba2618: add      x13, sp, #0x2d0 */ ARM64("add x13, sp, #0x2d0");
    /* 0x00ba261c: stur     q0, [x13, #4] */ ARM64("stur q0, [x13, #4]");
    /* 0x00ba2620: stur     q1, [x13, #0x14] */ ARM64("stur q1, [x13, #0x14]");
    /* 0x00ba2624: ldp      q0, q1, [x22, #0x30] */ ARM64("ldp q0, q1, [x22, #0x30]");
    /* 0x00ba2628: stur     q0, [x13, #0x24] */ ARM64("stur q0, [x13, #0x24]");
    /* 0x00ba262c: stur     q1, [x13, #0x34] */ ARM64("stur q1, [x13, #0x34]");
    /* 0x00ba2630: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba2634: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba2638: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba263c: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba2640: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba2644: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba2648: ldr      q0, [sp, #0x3a0] */ ARM64("ldr q0, [sp, #0x3a0]");
    /* 0x00ba264c: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba2650: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba2654: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba2658: str      q0, [sp, #0x3a0] */ ARM64("str q0, [sp, #0x3a0]");
    /* 0x00ba265c: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00ba2660: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00ba2664: add      x8, x8, x9 */ ARM64("add x8, x8, x9");
    /* 0x00ba2668: stur     w20, [x8, #-0x48] */ ARM64("stur w20, [x8, #-0x48]");
    /* 0x00ba266c: ldr      q0, [sp, #0x2e0] */ ARM64("ldr q0, [sp, #0x2e0]");
    /* 0x00ba2670: stur     q0, [x8, #-0x34] */ ARM64("stur q0, [x8, #-0x34]");
    /* 0x00ba2674: ldr      q0, [sp, #0x2f0] */ ARM64("ldr q0, [sp, #0x2f0]");
    /* 0x00ba2678: stur     q0, [x8, #-0x24] */ ARM64("stur q0, [x8, #-0x24]");
    /* 0x00ba267c: ldr      q0, [sp, #0x300] */ ARM64("ldr q0, [sp, #0x300]");
    /* 0x00ba2680: stur     q0, [x8, #-0x14] */ ARM64("stur q0, [x8, #-0x14]");
    /* 0x00ba2684: ldr      w9, [sp, #0x310] */ ARM64("ldr w9, [sp, #0x310]");
    /* 0x00ba2688: stur     w9, [x8, #-4] */ ARM64("stur w9, [x8, #-4]");
    /* 0x00ba268c: ldr      q0, [sp, #0x2d0] */ ARM64("ldr q0, [sp, #0x2d0]");
    /* 0x00ba2690: stur     q0, [x8, #-0x44] */ ARM64("stur q0, [x8, #-0x44]");
    /* 0x00ba2694: ldur     x20, [x29, #-0x78] */ ARM64("ldur x20, [x29, #-0x78]");
    /* 0x00ba2698: cbnz     x20, #0xba2230 */ if (x20 != 0) goto loc_00ba2230;
    /* 0x00ba269c: b        #0xba2740 */ goto loc_00ba2740;
loc_00ba26a0:
    /* 0x00ba26a0: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba26a4: add      x8, sp, #0x390 */ ARM64("add x8, sp, #0x390");
    /* 0x00ba26a8: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00ba26ac: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba26b0: bl       #0xc6fa44 */ CALL_DIRECT(sub_00c6fa44);
    /* 0x00ba26b4: b        #0xba238c */ goto loc_00ba238c;
loc_00ba26b8:
    /* 0x00ba26b8: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba26bc: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba26c0: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba26c4: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba26c8: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba26cc: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba26d0: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba26d4: b        #0xba2614 */ goto loc_00ba2614;
loc_00ba26d8:
    /* 0x00ba26d8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba26dc: cbz      x26, #0xba2740 */ if (x26 == 0) goto loc_00ba2740;
    /* 0x00ba26e0: ldp      x20, x23, [x29, #-0x98] */ ARM64("ldp x20, x23, [x29, #-0x98]");
    /* 0x00ba26e4: mov      w21, #0xc8 */ ARM64("mov w21, #0xc8");
    /* 0x00ba26e8: ldur     x22, [x29, #-0x88] */ ARM64("ldur x22, [x29, #-0x88]");
loc_00ba26ec:
    /* 0x00ba26ec: cbnz     x23, #0xba2710 */ if (x23 != 0) goto loc_00ba2710;
loc_00ba26f0:
    /* 0x00ba26f0: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00ba26f4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba26f8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba26fc: sub      x20, x20, #0x640 */ ARM64("sub x20, x20, #0x640");
    /* 0x00ba2700: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00ba2704: cbz      x23, #0xba26f0 */ if (x23 == 0) goto loc_00ba26f0;
    /* 0x00ba2708: stur     x22, [x29, #-0x88] */ ARM64("stur x22, [x29, #-0x88]");
    /* 0x00ba270c: stur     x20, [x29, #-0x98] */ ARM64("stur x20, [x29, #-0x98]");
loc_00ba2710:
    /* 0x00ba2710: sub      x8, x23, #1 */ ARM64("sub x8, x23, #1");
    /* 0x00ba2714: rbit     x9, x23 */ ARM64("rbit x9, x23");
    /* 0x00ba2718: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba271c: and      x23, x8, x23 */ ARM64("and x23, x8, x23");
    /* 0x00ba2720: neg      x8, x9, lsr #3 */ ARM64("neg x8, x9, lsr #3");
    /* 0x00ba2724: smaddl   x8, w8, w21, x20 */ ARM64("smaddl x8, w8, w21, x20");
    /* 0x00ba2728: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
    /* 0x00ba272c: stur     x23, [x29, #-0x90] */ ARM64("stur x23, [x29, #-0x90]");
    /* 0x00ba2730: stur     x26, [x29, #-0x78] */ ARM64("stur x26, [x29, #-0x78]");
    /* 0x00ba2734: sub      x0, x8, #0xc8 */ ARM64("sub x0, x8, #0xc8");
    /* 0x00ba2738: bl       #0xb98aa8 */ CALL_DIRECT(sub_00b98aa8);
    /* 0x00ba273c: cbnz     x26, #0xba26ec */ if (x26 != 0) goto loc_00ba26ec;
loc_00ba2740:
    /* 0x00ba2740: ldp      x8, x9, [x29, #-0xb0] */ ARM64("ldp x8, x9, [x29, #-0xb0]");
    /* 0x00ba2744: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba2748: ccmp     x9, #0, #4, ne */ ARM64("ccmp x9, #0, #4, ne");
    /* 0x00ba274c: b.eq     #0xba2758 */ if (COND_EQ) goto loc_00ba2758;
    /* 0x00ba2750: ldur     x0, [x29, #-0xa0] */ ARM64("ldur x0, [x29, #-0xa0]");
    /* 0x00ba2754: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba2758:
    /* 0x00ba2758: ldp      q0, q1, [sp, #0x390] */ ARM64("ldp q0, q1, [sp, #0x390]");
    /* 0x00ba275c: stp      q0, q1, [sp, #0x130] */ ARM64("stp q0, q1, [sp, #0x130]");
    /* 0x00ba2760: ldr      x20, [x28, #0x1e8] */ ARM64("ldr x20, [x28, #0x1e8]");
    /* 0x00ba2764: cbz      x20, #0xba27f4 */ if (x20 == 0) goto loc_00ba27f4;
    /* 0x00ba2768: ldr      x21, [x28, #0x1f8] */ ARM64("ldr x21, [x28, #0x1f8]");
    /* 0x00ba276c: cbz      x21, #0xba27d0 */ if (x21 == 0) goto loc_00ba27d0;
    /* 0x00ba2770: ldr      x22, [x28, #0x1e0] */ ARM64("ldr x22, [x28, #0x1e0]");
    /* 0x00ba2774: mov      x23, x22 */ ARM64("mov x23, x22");
    /* 0x00ba2778: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba277c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2780: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba2784: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00ba2788: mov      w24, #0x48 */ ARM64("mov w24, #0x48");
loc_00ba278c:
    /* 0x00ba278c: cbnz     x25, #0xba27a8 */ if (x25 != 0) goto loc_00ba27a8;
loc_00ba2790:
    /* 0x00ba2790: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba2794: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba2798: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba279c: sub      x22, x22, #0x240 */ ARM64("sub x22, x22, #0x240");
    /* 0x00ba27a0: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00ba27a4: cbz      x25, #0xba2790 */ if (x25 == 0) goto loc_00ba2790;
loc_00ba27a8:
    /* 0x00ba27a8: rbit     x8, x25 */ ARM64("rbit x8, x25");
    /* 0x00ba27ac: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00ba27b0: neg      x8, x8, lsr #3 */ ARM64("neg x8, x8, lsr #3");
    /* 0x00ba27b4: smaddl   x8, w8, w24, x22 */ ARM64("smaddl x8, w8, w24, x22");
    /* 0x00ba27b8: sub      x0, x8, #0x40 */ ARM64("sub x0, x8, #0x40");
    /* 0x00ba27bc: bl       #0xb98b8c */ CALL_DIRECT(sub_00b98b8c);
    /* 0x00ba27c0: sub      x8, x25, #1 */ ARM64("sub x8, x25, #1");
    /* 0x00ba27c4: and      x25, x8, x25 */ ARM64("and x25, x8, x25");
    /* 0x00ba27c8: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00ba27cc: cbnz     x21, #0xba278c */ if (x21 != 0) goto loc_00ba278c;
loc_00ba27d0:
    /* 0x00ba27d0: add      x8, x20, x20, lsl #3 */ ARM64("add x8, x20, x20, lsl #3");
    /* 0x00ba27d4: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00ba27d8: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00ba27dc: cmn      x9, #0x51 */ ARM64("cmn x9, #0x51");
    /* 0x00ba27e0: b.eq     #0xba27f4 */ if (COND_EQ) goto loc_00ba27f4;
    /* 0x00ba27e4: ldr      x9, [x28, #0x1e0] */ ARM64("ldr x9, [x28, #0x1e0]");
    /* 0x00ba27e8: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba27ec: sub      x0, x8, #0x48 */ ARM64("sub x0, x8, #0x48");
    /* 0x00ba27f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba27f4:
    /* 0x00ba27f4: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba27f8: stp      q0, q1, [x28, #0x1e0] */ ARM64("stp q0, q1, [x28, #0x1e0]");
    /* 0x00ba27fc: ldr      x22, [x28, #0xd8] */ ARM64("ldr x22, [x28, #0xd8]");
    /* 0x00ba2800: ldr      w8, [x22, #0x78] */ ARM64("ldr w8, [x22, #0x78]");
    /* 0x00ba2804: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00ba2808: b.ne     #0xba7344 */ if (COND_NE) goto loc_00ba7344;
    /* 0x00ba280c: ldr      w20, [x22, #0x7c] */ ARM64("ldr w20, [x22, #0x7c]");
    /* 0x00ba2810: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00ba2814: stp      xzr, x8, [x29, #-0xf0] */ ARM64("stp xzr, x8, [x29, #-0xf0]");
    /* 0x00ba2818: stur     xzr, [x29, #-0xe0] */ ARM64("stur xzr, [x29, #-0xe0]");
    /* 0x00ba281c: adrp     x0, #0xf0b000 */ ARM64("adrp x0, #0xf0b000");
    /* 0x00ba2820: add      x0, x0, #0x210 */ ARM64("add x0, x0, #0x210");
    /* 0x00ba2824: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba2828: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00ba282c: ldrb     w8, [x0, #0x10] */ ARM64("ldrb w8, [x0, #0x10]");
    /* 0x00ba2830: tbz      w8, #0, #0xba7358 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba7358;
loc_00ba2834:
    /* 0x00ba2834: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba2838: stp      q1, q0, [x29, #-0xb0] */ ARM64("stp q1, q0, [x29, #-0xb0]");
    /* 0x00ba283c: ldr      q0, [x0] */ ARM64("ldr q0, [x0]");
    /* 0x00ba2840: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba2844: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba2848: str      x0, [sp, #0xd0] */ ARM64("str x0, [sp, #0xd0]");
    /* 0x00ba284c: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba2850: stur     q0, [x29, #-0x90] */ ARM64("stur q0, [x29, #-0x90]");
    /* 0x00ba2854: ldp      x1, x2, [x22, #0x20] */ ARM64("ldp x1, x2, [x22, #0x20]");
    /* 0x00ba2858: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba285c: str      w20, [sp, #0x78] */ ARM64("str w20, [sp, #0x78]");
    /* 0x00ba2860: mov      x3, x20 */ ARM64("mov x3, x20");
    /* 0x00ba2864: bl       #0xbd97c0 */ CALL_DIRECT(sub_00bd97c0);
    /* 0x00ba2868: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00ba286c: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00ba2870: add      x1, x22, #0x18 */ ARM64("add x1, x22, #0x18");
    /* 0x00ba2874: ldp      q0, q1, [sp, #0x2f0] */ ARM64("ldp q0, q1, [sp, #0x2f0]");
    /* 0x00ba2878: stp      q0, q1, [sp, #0x150] */ ARM64("stp q0, q1, [sp, #0x150]");
    /* 0x00ba287c: ldr      q0, [sp, #0x310] */ ARM64("ldr q0, [sp, #0x310]");
    /* 0x00ba2880: str      q0, [sp, #0x170] */ ARM64("str q0, [sp, #0x170]");
    /* 0x00ba2884: ldr      x8, [sp, #0x320] */ ARM64("ldr x8, [sp, #0x320]");
    /* 0x00ba2888: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba288c: mov      x9, #-2 */ ARM64("mov x9, #-2");
    /* 0x00ba2890: str      x9, [sp, #0xc0] */ ARM64("str x9, [sp, #0xc0]");
    /* 0x00ba2894: stp      q0, q1, [sp, #0x130] */ ARM64("stp q0, q1, [sp, #0x130]");
    /* 0x00ba2898: mov      x21, #-1 */ ARM64("mov x21, #-1");
    /* 0x00ba289c: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00ba28a0: str      x9, [sp, #0x90] */ ARM64("str x9, [sp, #0x90]");
    /* 0x00ba28a4: mov      w26, #0x30 */ ARM64("mov w26, #0x30");
    /* 0x00ba28a8: stp      x8, x1, [sp, #0x180] */ ARM64("stp x8, x1, [sp, #0x180]");
    /* 0x00ba28ac: str      x22, [sp, #0x80] */ ARM64("str x22, [sp, #0x80]");
    /* 0x00ba28b0: b        #0xba28dc */ goto loc_00ba28dc;
loc_00ba28b4:
    /* 0x00ba28b4: ldr      x1, [sp, #0x188] */ ARM64("ldr x1, [sp, #0x188]");
    /* 0x00ba28b8: ldr      x8, [sp, #0xc0] */ ARM64("ldr x8, [sp, #0xc0]");
    /* 0x00ba28bc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba28c0: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00ba28c4: ldp      x21, x20, [sp, #0xa8] */ ARM64("ldp x21, x20, [sp, #0xa8]");
    /* 0x00ba28c8: sub      x20, x20, #1 */ ARM64("sub x20, x20, #1");
    /* 0x00ba28cc: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00ba28d0: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba28d4: ldr      x23, [sp, #0xa0] */ ARM64("ldr x23, [sp, #0xa0]");
    /* 0x00ba28d8: ldr      x22, [sp, #0x80] */ ARM64("ldr x22, [sp, #0x80]");
loc_00ba28dc:
    /* 0x00ba28dc: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba28e0: bl       #0xbd98f0 */ CALL_DIRECT(sub_00bd98f0);
    /* 0x00ba28e4: str      w1, [sp, #0x110] */ ARM64("str w1, [sp, #0x110]");
    /* 0x00ba28e8: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x00ba28ec: stp      x21, x20, [sp, #0xa8] */ ARM64("stp x21, x20, [sp, #0xa8]");
    /* 0x00ba28f0: b.ne     #0xba2e90 */ if (COND_NE) goto loc_00ba2e90;
    /* 0x00ba28f4: ldur     x8, [x29, #-0xf0] */ ARM64("ldur x8, [x29, #-0xf0]");
    /* 0x00ba28f8: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba28fc: b.ne     #0xba2910 */ if (COND_NE) goto loc_00ba2910;
    /* 0x00ba2900: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba2904: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00ba2908: ldur     x8, [x29, #-0xe8] */ ARM64("ldur x8, [x29, #-0xe8]");
    /* 0x00ba290c: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
loc_00ba2910:
    /* 0x00ba2910: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba2914: ldr      w10, [sp, #0x110] */ ARM64("ldr w10, [sp, #0x110]");
    /* 0x00ba2918: str      w10, [x8, x23, lsl #2] */ ARM64("str w10, [x8, x23, lsl #2]");
    /* 0x00ba291c: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00ba2920: stur     x23, [x29, #-0xe0] */ ARM64("stur x23, [x29, #-0xe0]");
    /* 0x00ba2924: ldr      x9, [x22, #0x28] */ ARM64("ldr x9, [x22, #0x28]");
    /* 0x00ba2928: mov      w8, w10 */ ARM64("mov w8, w10");
    /* 0x00ba292c: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba2930: str      x23, [sp, #0xa0] */ ARM64("str x23, [sp, #0xa0]");
    /* 0x00ba2934: b.ls     #0xba2950 */ if (COND_LS) goto loc_00ba2950;
    /* 0x00ba2938: ldr      x9, [x22, #0x20] */ ARM64("ldr x9, [x22, #0x20]");
    /* 0x00ba293c: add      x9, x9, x8, lsl #5 */ ARM64("add x9, x9, x8, lsl #5");
    /* 0x00ba2940: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00ba2944: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00ba2948: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba294c: b.ne     #0xba2958 */ if (COND_NE) goto loc_00ba2958;
loc_00ba2950:
    /* 0x00ba2950: mov      w28, #-1 */ ARM64("mov w28, #-1");
    /* 0x00ba2954: b        #0xba295c */ goto loc_00ba295c;
loc_00ba2958:
    /* 0x00ba2958: ldr      w28, [x9, #0x18] */ ARM64("ldr w28, [x9, #0x18]");
loc_00ba295c:
    /* 0x00ba295c: mov      x9, x22 */ ARM64("mov x9, x22");
    /* 0x00ba2960: ldr      x22, [x22, #0x38] */ ARM64("ldr x22, [x22, #0x38]");
    /* 0x00ba2964: ldr      x21, [x9, #0x40] */ ARM64("ldr x21, [x9, #0x40]");
    /* 0x00ba2968: orr      x9, x8, #0x400000000000000 */ ARM64("orr x9, x8, #0x400000000000000");
    /* 0x00ba296c: mov      x8, #0x6573 */ ARM64("mov x8, #0x6573");
    /* 0x00ba2970: movk     x8, #0x7974, lsl #16 */ ARM64("movk x8, #0x7974, lsl #16");
    /* 0x00ba2974: movk     x8, #0x6462, lsl #32 */ ARM64("movk x8, #0x6462, lsl #32");
    /* 0x00ba2978: movk     x8, #0x7465, lsl #48 */ ARM64("movk x8, #0x7465, lsl #48");
    /* 0x00ba297c: str      x9, [sp, #0x100] */ ARM64("str x9, [sp, #0x100]");
    /* 0x00ba2980: eor      x8, x9, x8 */ ARM64("eor x8, x9, x8");
    /* 0x00ba2984: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00ba2988: mov      w23, #-1 */ ARM64("mov w23, #-1");
    /* 0x00ba298c: b        #0xba2a64 */ goto loc_00ba2a64;
loc_00ba2990:
    /* 0x00ba2990: and      x14, x14, x11 */ ARM64("and x14, x14, x11");
    /* 0x00ba2994: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00ba2998: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba299c: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba29a0: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba29a4: b.eq     #0xba29d8 */ if (COND_EQ) goto loc_00ba29d8;
loc_00ba29a8:
    /* 0x00ba29a8: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba29ac: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba29b0: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba29b4: and      x16, x16, x11 */ ARM64("and x16, x16, x11");
    /* 0x00ba29b8: sub      x16, x9, x16, lsl #2 */ ARM64("sub x16, x9, x16, lsl #2");
    /* 0x00ba29bc: ldur     w16, [x16, #-4] */ ARM64("ldur w16, [x16, #-4]");
    /* 0x00ba29c0: ldr      w17, [sp, #0x110] */ ARM64("ldr w17, [sp, #0x110]");
    /* 0x00ba29c4: cmp      w17, w16 */ ARM64("cmp w17, w16");
    /* 0x00ba29c8: b.eq     #0xba2a64 */ if (COND_EQ) goto loc_00ba2a64;
    /* 0x00ba29cc: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba29d0: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba29d4: b.ne     #0xba29a8 */ if (COND_NE) goto loc_00ba29a8;
loc_00ba29d8:
    /* 0x00ba29d8: cmp      x12, #1 */ ARM64("cmp x12, #1");
    /* 0x00ba29dc: b.eq     #0xba29fc */ if (COND_EQ) goto loc_00ba29fc;
    /* 0x00ba29e0: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba29e4: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba29e8: cbz      x12, #0xba2a18 */ if (x12 == 0) goto loc_00ba2a18;
    /* 0x00ba29ec: rbit     x12, x12 */ ARM64("rbit x12, x12");
    /* 0x00ba29f0: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00ba29f4: add      x12, x14, x12, lsr #3 */ ARM64("add x12, x14, x12, lsr #3");
    /* 0x00ba29f8: and      x13, x12, x11 */ ARM64("and x13, x12, x11");
loc_00ba29fc:
    /* 0x00ba29fc: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba2a00: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba2a04: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba2a08: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba2a0c: tbnz     w12, #0, #0xba2a24 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba2a24;
    /* 0x00ba2a10: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00ba2a14: b        #0xba2a18 */ goto loc_00ba2a18;
loc_00ba2a18:
    /* 0x00ba2a18: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba2a1c: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00ba2a20: b        #0xba2990 */ goto loc_00ba2990;
loc_00ba2a24:
    /* 0x00ba2a24: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00ba2a28: tbz      w8, #0x1f, #0xba2e70 */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00ba2e70;
loc_00ba2a2c:
    /* 0x00ba2a2c: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00ba2a30: sub      x12, x13, #8 */ ARM64("sub x12, x13, #8");
    /* 0x00ba2a34: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00ba2a38: strb     w10, [x9, x13] */ ARM64("strb w10, [x9, x13]");
    /* 0x00ba2a3c: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00ba2a40: strb     w10, [x11, #8] */ ARM64("strb w10, [x11, #8]");
    /* 0x00ba2a44: ldur     q0, [x20, #-0x20] */ ARM64("ldur q0, [x20, #-0x20]");
    /* 0x00ba2a48: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba2a4c: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00ba2a50: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba2a54: stur     q0, [x20, #-0x20] */ ARM64("stur q0, [x20, #-0x20]");
    /* 0x00ba2a58: sub      x8, x9, x13, lsl #2 */ ARM64("sub x8, x9, x13, lsl #2");
    /* 0x00ba2a5c: ldr      w9, [sp, #0x110] */ ARM64("ldr w9, [sp, #0x110]");
    /* 0x00ba2a60: stur     w9, [x8, #-4] */ ARM64("stur w9, [x8, #-4]");
loc_00ba2a64:
    /* 0x00ba2a64: cmp      x21, x28 */ ARM64("cmp x21, x28");
    /* 0x00ba2a68: b.ls     #0xba2a7c */ if (COND_LS) goto loc_00ba2a7c;
    /* 0x00ba2a6c: madd     x8, x28, x26, x22 */ ARM64("madd x8, x28, x26, x22");
    /* 0x00ba2a70: ldr      w28, [x8, #0x20] */ ARM64("ldr w28, [x8, #0x20]");
    /* 0x00ba2a74: ldr      w27, [x8, #0x2c] */ ARM64("ldr w27, [x8, #0x2c]");
    /* 0x00ba2a78: b        #0xba2a94 */ goto loc_00ba2a94;
loc_00ba2a7c:
    /* 0x00ba2a7c: cmp      x21, x23 */ ARM64("cmp x21, x23");
    /* 0x00ba2a80: b.ls     #0xba28b4 */ if (COND_LS) goto loc_00ba28b4;
    /* 0x00ba2a84: madd     x8, x23, x26, x22 */ ARM64("madd x8, x23, x26, x22");
    /* 0x00ba2a88: ldp      w23, w27, [x8, #0x24] */ ARM64("ldp w23, w27, [x8, #0x24]");
    /* 0x00ba2a8c: cmn      w27, #1 */ ARM64("cmn w27, #1");
    /* 0x00ba2a90: b.eq     #0xba2a7c */ if (COND_EQ) goto loc_00ba2a7c;
loc_00ba2a94:
    /* 0x00ba2a94: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba2a98: ldp      x9, x10, [x29, #-0x90] */ ARM64("ldp x9, x10, [x29, #-0x90]");
    /* 0x00ba2a9c: mov      x11, #0x6575 */ ARM64("mov x11, #0x6575");
    /* 0x00ba2aa0: movk     x11, #0x7073, lsl #16 */ ARM64("movk x11, #0x7073, lsl #16");
    /* 0x00ba2aa4: movk     x11, #0x6d65, lsl #32 */ ARM64("movk x11, #0x6d65, lsl #32");
    /* 0x00ba2aa8: movk     x11, #0x736f, lsl #48 */ ARM64("movk x11, #0x736f, lsl #48");
    /* 0x00ba2aac: eor      x11, x9, x11 */ ARM64("eor x11, x9, x11");
    /* 0x00ba2ab0: mov      x12, #0x6f6d */ ARM64("mov x12, #0x6f6d");
    /* 0x00ba2ab4: movk     x12, #0x6e64, lsl #16 */ ARM64("movk x12, #0x6e64, lsl #16");
    /* 0x00ba2ab8: movk     x12, #0x7261, lsl #32 */ ARM64("movk x12, #0x7261, lsl #32");
    /* 0x00ba2abc: movk     x12, #0x646f, lsl #48 */ ARM64("movk x12, #0x646f, lsl #48");
    /* 0x00ba2ac0: eor      x12, x10, x12 */ ARM64("eor x12, x10, x12");
    /* 0x00ba2ac4: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00ba2ac8: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00ba2acc: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00ba2ad0: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00ba2ad4: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00ba2ad8: orr      x13, x27, #0x400000000000000 */ ARM64("orr x13, x27, #0x400000000000000");
    /* 0x00ba2adc: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00ba2ae0: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00ba2ae4: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00ba2ae8: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00ba2aec: eor      x10, x10, x14 */ ARM64("eor x10, x10, x14");
    /* 0x00ba2af0: eor      x10, x10, x13 */ ARM64("eor x10, x10, x13");
    /* 0x00ba2af4: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba2af8: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2afc: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba2b00: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba2b04: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2b08: add      x9, x9, x12 */ ARM64("add x9, x9, x12");
    /* 0x00ba2b0c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba2b10: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba2b14: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba2b18: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2b1c: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00ba2b20: eor      x9, x9, #0xff */ ARM64("eor x9, x9, #0xff");
    /* 0x00ba2b24: add      x11, x11, x12 */ ARM64("add x11, x11, x12");
    /* 0x00ba2b28: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2b2c: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba2b30: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba2b34: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2b38: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba2b3c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba2b40: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba2b44: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba2b48: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2b4c: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba2b50: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2b54: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba2b58: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba2b5c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2b60: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba2b64: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba2b68: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba2b6c: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba2b70: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2b74: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba2b78: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2b7c: eor      x11, x11, x12, ror #51 */ ARM64("eor x11, x11, x12, ror #51");
    /* 0x00ba2b80: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba2b84: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00ba2b88: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00ba2b8c: eor      x10, x10, x11, ror #47 */ ARM64("eor x10, x10, x11, ror #47");
    /* 0x00ba2b90: eor      x10, x10, x9, ror #32 */ ARM64("eor x10, x10, x9, ror #32");
    /* 0x00ba2b94: eor      x24, x10, x9 */ ARM64("eor x24, x10, x9");
    /* 0x00ba2b98: lsr      x25, x24, #0x39 */ ARM64("lsr x25, x24, #0x39");
    /* 0x00ba2b9c: ldp      x10, x9, [x29, #-0xb0] */ ARM64("ldp x10, x9, [x29, #-0xb0]");
    /* 0x00ba2ba0: dup      v0.8b, w25 */ ARM64("dup v0.8b, w25");
    /* 0x00ba2ba4: and      x11, x24, x9 */ ARM64("and x11, x24, x9");
    /* 0x00ba2ba8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba2bac: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba2bb0: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba2bb4: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba2bb8: b.eq     #0xba2bf0 */ if (COND_EQ) goto loc_00ba2bf0;
loc_00ba2bbc:
    /* 0x00ba2bbc: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba2bc0: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba2bc4: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba2bc8: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba2bcc: mov      w14, #0x38 */ ARM64("mov w14, #0x38");
    /* 0x00ba2bd0: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00ba2bd4: add      x20, x10, x13 */ ARM64("add x20, x10, x13");
    /* 0x00ba2bd8: ldur     w13, [x20, #-0x38] */ ARM64("ldur w13, [x20, #-0x38]");
    /* 0x00ba2bdc: cmp      x13, x27 */ ARM64("cmp x13, x27");
    /* 0x00ba2be0: b.eq     #0xba2ce8 */ if (COND_EQ) goto loc_00ba2ce8;
    /* 0x00ba2be4: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba2be8: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba2bec: b.ne     #0xba2bbc */ if (COND_NE) goto loc_00ba2bbc;
loc_00ba2bf0:
    /* 0x00ba2bf0: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba2bf4: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba2bf8: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba2bfc: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba2c00: tbnz     w12, #0, #0xba2c28 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba2c28;
    /* 0x00ba2c04: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba2c08: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba2c0c: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba2c10: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba2c14: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba2c18: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba2c1c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba2c20: b.ne     #0xba2bbc */ if (COND_NE) goto loc_00ba2bbc;
    /* 0x00ba2c24: b        #0xba2bf0 */ goto loc_00ba2bf0;
loc_00ba2c28:
    /* 0x00ba2c28: ldur     x8, [x29, #-0xa0] */ ARM64("ldur x8, [x29, #-0xa0]");
    /* 0x00ba2c2c: cbz      x8, #0xba2e2c */ if (x8 == 0) goto loc_00ba2e2c;
loc_00ba2c30:
    /* 0x00ba2c30: ldr      x8, [sp, #0xd0] */ ARM64("ldr x8, [sp, #0xd0]");
    /* 0x00ba2c34: ldrb     w8, [x8, #0x10] */ ARM64("ldrb w8, [x8, #0x10]");
    /* 0x00ba2c38: tbz      w8, #0, #0xba2e40 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba2e40;
loc_00ba2c3c:
    /* 0x00ba2c3c: ldr      x9, [sp, #0xd0] */ ARM64("ldr x9, [sp, #0xd0]");
    /* 0x00ba2c40: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00ba2c44: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00ba2c48: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba2c4c: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00ba2c50: ldp      q1, q2, [sp, #0xe0] */ ARM64("ldp q1, q2, [sp, #0xe0]");
    /* 0x00ba2c54: add      x8, sp, #0x2d0 */ ARM64("add x8, sp, #0x2d0");
    /* 0x00ba2c58: stur     q2, [x8, #4] */ ARM64("stur q2, [x8, #4]");
    /* 0x00ba2c5c: stur     q1, [x8, #0x14] */ ARM64("stur q1, [x8, #0x14]");
    /* 0x00ba2c60: ldp      x8, x9, [x29, #-0xb0] */ ARM64("ldp x8, x9, [x29, #-0xb0]");
    /* 0x00ba2c64: and      x10, x9, x24 */ ARM64("and x10, x9, x24");
    /* 0x00ba2c68: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00ba2c6c: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00ba2c70: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba2c74: cbz      x12, #0xba2e08 */ if (x12 == 0) goto loc_00ba2e08;
loc_00ba2c78:
    /* 0x00ba2c78: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00ba2c7c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba2c80: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00ba2c84: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00ba2c88: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00ba2c8c: tbz      w10, #0x1f, #0xba2e50 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00ba2e50;
loc_00ba2c90:
    /* 0x00ba2c90: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00ba2c94: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00ba2c98: strb     w25, [x8, x11] */ ARM64("strb w25, [x8, x11]");
    /* 0x00ba2c9c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba2ca0: strb     w25, [x9, #8] */ ARM64("strb w25, [x9, #8]");
    /* 0x00ba2ca4: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00ba2ca8: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00ba2cac: add      x20, x8, x9 */ ARM64("add x20, x8, x9");
    /* 0x00ba2cb0: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00ba2cb4: stur     w27, [x20, #-0x38] */ ARM64("stur w27, [x20, #-0x38]");
    /* 0x00ba2cb8: ldr      q1, [sp, #0x2d0] */ ARM64("ldr q1, [sp, #0x2d0]");
    /* 0x00ba2cbc: stur     q1, [x20, #-0x34] */ ARM64("stur q1, [x20, #-0x34]");
    /* 0x00ba2cc0: ldr      q1, [sp, #0x2e0] */ ARM64("ldr q1, [sp, #0x2e0]");
    /* 0x00ba2cc4: stur     q1, [x20, #-0x24] */ ARM64("stur q1, [x20, #-0x24]");
    /* 0x00ba2cc8: ldr      w9, [sp, #0x2f0] */ ARM64("ldr w9, [sp, #0x2f0]");
    /* 0x00ba2ccc: stur     w9, [x20, #-0x14] */ ARM64("stur w9, [x20, #-0x14]");
    /* 0x00ba2cd0: stur     q0, [x20, #-0x10] */ ARM64("stur q0, [x20, #-0x10]");
    /* 0x00ba2cd4: ldur     q0, [x29, #-0xa0] */ ARM64("ldur q0, [x29, #-0xa0]");
    /* 0x00ba2cd8: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba2cdc: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00ba2ce0: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba2ce4: stur     q0, [x29, #-0xa0] */ ARM64("stur q0, [x29, #-0xa0]");
loc_00ba2ce8:
    /* 0x00ba2ce8: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00ba2cec: ldp      x24, x25, [x1, #-0x10]! */ ARM64("ldp x24, x25, [x1, #-0x10]!");
    /* 0x00ba2cf0: ldur     x8, [x1, #-0x10] */ ARM64("ldur x8, [x1, #-0x10]");
    /* 0x00ba2cf4: cbz      x8, #0xba2dfc */ if (x8 == 0) goto loc_00ba2dfc;
loc_00ba2cf8:
    /* 0x00ba2cf8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba2cfc: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba2d00: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00ba2d04: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00ba2d08: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00ba2d0c: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00ba2d10: eor      x9, x24, x9 */ ARM64("eor x9, x24, x9");
    /* 0x00ba2d14: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00ba2d18: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00ba2d1c: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00ba2d20: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00ba2d24: eor      x10, x25, x10 */ ARM64("eor x10, x25, x10");
    /* 0x00ba2d28: mov      x11, #0x7261 */ ARM64("mov x11, #0x7261");
    /* 0x00ba2d2c: movk     x11, #0x6e65, lsl #16 */ ARM64("movk x11, #0x6e65, lsl #16");
    /* 0x00ba2d30: movk     x11, #0x6765, lsl #32 */ ARM64("movk x11, #0x6765, lsl #32");
    /* 0x00ba2d34: movk     x11, #0x6c79, lsl #48 */ ARM64("movk x11, #0x6c79, lsl #48");
    /* 0x00ba2d38: eor      x11, x24, x11 */ ARM64("eor x11, x24, x11");
    /* 0x00ba2d3c: ldr      x13, [sp, #0xd8] */ ARM64("ldr x13, [sp, #0xd8]");
    /* 0x00ba2d40: eor      x13, x25, x13 */ ARM64("eor x13, x25, x13");
    /* 0x00ba2d44: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2d48: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00ba2d4c: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00ba2d50: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2d54: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00ba2d58: add      x11, x11, x10 */ ARM64("add x11, x11, x10");
    /* 0x00ba2d5c: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00ba2d60: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00ba2d64: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2d68: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00ba2d6c: ldr      x14, [sp, #0x100] */ ARM64("ldr x14, [sp, #0x100]");
    /* 0x00ba2d70: eor      x9, x9, x14 */ ARM64("eor x9, x9, x14");
    /* 0x00ba2d74: eor      x11, x11, #0xff */ ARM64("eor x11, x11, #0xff");
    /* 0x00ba2d78: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00ba2d7c: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00ba2d80: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00ba2d84: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00ba2d88: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2d8c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba2d90: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00ba2d94: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00ba2d98: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00ba2d9c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2da0: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2da4: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00ba2da8: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00ba2dac: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00ba2db0: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba2db4: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba2db8: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00ba2dbc: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00ba2dc0: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00ba2dc4: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba2dc8: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba2dcc: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00ba2dd0: eor      x9, x9, x10, ror #51 */ ARM64("eor x9, x9, x10, ror #51");
    /* 0x00ba2dd4: eor      x10, x11, x13, ror #48 */ ARM64("eor x10, x11, x13, ror #48");
    /* 0x00ba2dd8: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00ba2ddc: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00ba2de0: eor      x9, x10, x9, ror #47 */ ARM64("eor x9, x10, x9, ror #47");
    /* 0x00ba2de4: eor      x9, x9, x11, ror #32 */ ARM64("eor x9, x9, x11, ror #32");
    /* 0x00ba2de8: eor      x14, x9, x11 */ ARM64("eor x14, x9, x11");
    /* 0x00ba2dec: ldp      x9, x11, [x20, #-0x30] */ ARM64("ldp x9, x11, [x20, #-0x30]");
    /* 0x00ba2df0: lsr      x10, x14, #0x39 */ ARM64("lsr x10, x14, #0x39");
    /* 0x00ba2df4: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
    /* 0x00ba2df8: b        #0xba2990 */ goto loc_00ba2990;
loc_00ba2dfc:
    /* 0x00ba2dfc: sub      x0, x1, #0x20 */ ARM64("sub x0, x1, #0x20");
    /* 0x00ba2e00: bl       #0xc6df10 */ CALL_DIRECT(sub_00c6df10);
    /* 0x00ba2e04: b        #0xba2cf8 */ goto loc_00ba2cf8;
loc_00ba2e08:
    /* 0x00ba2e08: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00ba2e0c:
    /* 0x00ba2e0c: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00ba2e10: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00ba2e14: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00ba2e18: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00ba2e1c: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00ba2e20: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba2e24: cbnz     x12, #0xba2c78 */ if (x12 != 0) goto loc_00ba2c78;
    /* 0x00ba2e28: b        #0xba2e0c */ goto loc_00ba2e0c;
loc_00ba2e2c:
    /* 0x00ba2e2c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba2e30: sub      x8, x29, #0xb0 */ ARM64("sub x8, x29, #0xb0");
    /* 0x00ba2e34: add      x1, x8, #0x20 */ ARM64("add x1, x8, #0x20");
    /* 0x00ba2e38: bl       #0xc6d288 */ CALL_DIRECT(sub_00c6d288);
    /* 0x00ba2e3c: b        #0xba2c30 */ goto loc_00ba2c30;
loc_00ba2e40:
    /* 0x00ba2e40: ldr      x0, [sp, #0xd0] */ ARM64("ldr x0, [sp, #0xd0]");
    /* 0x00ba2e44: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba2e48: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba2e4c: b        #0xba2c3c */ goto loc_00ba2c3c;
loc_00ba2e50:
    /* 0x00ba2e50: ldr      d1, [x8] */ ARM64("ldr d1, [x8]");
    /* 0x00ba2e54: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00ba2e58: fmov     x10, d1 */ ARM64("fmov x10, d1");
    /* 0x00ba2e5c: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba2e60: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba2e64: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00ba2e68: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00ba2e6c: b        #0xba2c90 */ goto loc_00ba2c90;
loc_00ba2e70:
    /* 0x00ba2e70: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00ba2e74: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba2e78: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba2e7c: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00ba2e80: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00ba2e84: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00ba2e88: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00ba2e8c: b        #0xba2a2c */ goto loc_00ba2a2c;
loc_00ba2e90:
    /* 0x00ba2e90: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba2e94: cbz      x8, #0xba2ea0 */ if (x8 == 0) goto loc_00ba2ea0;
    /* 0x00ba2e98: ldr      x0, [sp, #0x138] */ ARM64("ldr x0, [sp, #0x138]");
    /* 0x00ba2e9c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba2ea0:
    /* 0x00ba2ea0: ldr      x8, [sp, #0x148] */ ARM64("ldr x8, [sp, #0x148]");
    /* 0x00ba2ea4: cbz      x8, #0xba2eb0 */ if (x8 == 0) goto loc_00ba2eb0;
    /* 0x00ba2ea8: ldr      x0, [sp, #0x150] */ ARM64("ldr x0, [sp, #0x150]");
    /* 0x00ba2eac: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba2eb0:
    /* 0x00ba2eb0: ldr      x8, [sp, #0x168] */ ARM64("ldr x8, [sp, #0x168]");
    /* 0x00ba2eb4: cbz      x8, #0xba2ec0 */ if (x8 == 0) goto loc_00ba2ec0;
    /* 0x00ba2eb8: ldr      x0, [sp, #0x170] */ ARM64("ldr x0, [sp, #0x170]");
    /* 0x00ba2ebc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba2ec0:
    /* 0x00ba2ec0: ldur     x25, [x29, #-0xf0] */ ARM64("ldur x25, [x29, #-0xf0]");
    /* 0x00ba2ec4: ldp      q0, q1, [x29, #-0xb0] */ ARM64("ldp q0, q1, [x29, #-0xb0]");
    /* 0x00ba2ec8: stp      q0, q1, [sp, #0x2d0] */ ARM64("stp q0, q1, [sp, #0x2d0]");
    /* 0x00ba2ecc: ldur     q0, [x29, #-0x90] */ ARM64("ldur q0, [x29, #-0x90]");
    /* 0x00ba2ed0: str      q0, [sp, #0x2f0] */ ARM64("str q0, [sp, #0x2f0]");
    /* 0x00ba2ed4: ldr      x0, [sp, #0xd0] */ ARM64("ldr x0, [sp, #0xd0]");
    /* 0x00ba2ed8: ldrb     w8, [x0, #0x10] */ ARM64("ldrb w8, [x0, #0x10]");
    /* 0x00ba2edc: tbz      w8, #0, #0xba7364 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba7364;
loc_00ba2ee0:
    /* 0x00ba2ee0: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba2ee4: stp      q1, q0, [sp, #0x130] */ ARM64("stp q1, q0, [sp, #0x130]");
    /* 0x00ba2ee8: ldr      q0, [x0] */ ARM64("ldr q0, [x0]");
    /* 0x00ba2eec: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba2ef0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba2ef4: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba2ef8: str      q0, [sp, #0x150] */ ARM64("str q0, [sp, #0x150]");
    /* 0x00ba2efc: mov      x24, x23 */ ARM64("mov x24, x23");
    /* 0x00ba2f00: cbnz     x23, #0xba7370 */ if (x23 != 0) goto loc_00ba7370;
    /* 0x00ba2f04: mov      w22, #1 */ ARM64("mov w22, #1");
loc_00ba2f08:
    /* 0x00ba2f08: ldp      x8, x20, [sp, #0x130] */ ARM64("ldp x8, x20, [sp, #0x130]");
    /* 0x00ba2f0c: str      x8, [sp, #0xa0] */ ARM64("str x8, [sp, #0xa0]");
    /* 0x00ba2f10: ldp      x21, x26, [sp, #0x148] */ ARM64("ldp x21, x26, [sp, #0x148]");
    /* 0x00ba2f14: ldr      x9, [sp, #0x158] */ ARM64("ldr x9, [sp, #0x158]");
    /* 0x00ba2f18: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba2f1c: stp      q0, q1, [sp, #0x130] */ ARM64("stp q0, q1, [sp, #0x130]");
    /* 0x00ba2f20: ldr      q0, [sp, #0x2f0] */ ARM64("ldr q0, [sp, #0x2f0]");
    /* 0x00ba2f24: add      x8, x23, x23, lsl #1 */ ARM64("add x8, x23, x23, lsl #1");
    /* 0x00ba2f28: lsl      x1, x8, #3 */ ARM64("lsl x1, x8, #3");
    /* 0x00ba2f2c: mov      x8, #0x5555555555555555 */ ARM64("mov x8, #0x5555555555555555");
    /* 0x00ba2f30: movk     x8, #0x5556 */ ARM64("movk x8, #0x5556");
    /* 0x00ba2f34: movk     x8, #0x555, lsl #48 */ ARM64("movk x8, #0x555, lsl #48");
    /* 0x00ba2f38: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00ba2f3c: str      q0, [sp, #0x150] */ ARM64("str q0, [sp, #0x150]");
    /* 0x00ba2f40: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba2f44: b.ls     #0xba2f54 */ if (COND_LS) goto loc_00ba2f54;
    /* 0x00ba2f48: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00ba2f4c:
    /* 0x00ba2f4c: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba2f50: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba2f54:
    /* 0x00ba2f54: str      x9, [sp, #0x50] */ ARM64("str x9, [sp, #0x50]");
    /* 0x00ba2f58: str      x20, [sp, #0x80] */ ARM64("str x20, [sp, #0x80]");
    /* 0x00ba2f5c: cbz      x1, #0xba2f94 */ if (x1 == 0) goto loc_00ba2f94;
    /* 0x00ba2f60: mov      x20, x1 */ ARM64("mov x20, x1");
    /* 0x00ba2f64: mov      x0, x1 */ ARM64("mov x0, x1");
    /* 0x00ba2f68: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba2f6c: mov      x8, x23 */ ARM64("mov x8, x23");
    /* 0x00ba2f70: cbnz     x0, #0xba2f9c */ if (x0 != 0) goto loc_00ba2f9c;
    /* 0x00ba2f74: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba2f78: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00ba2f7c: ldr      x20, [sp, #0x80] */ ARM64("ldr x20, [sp, #0x80]");
    /* 0x00ba2f80: b        #0xba2f4c */ goto loc_00ba2f4c;
loc_00ba2f84:
    /* 0x00ba2f84: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba2f88: add      x0, x0, #0x318 */ ARM64("add x0, x0, #0x318");
    /* 0x00ba2f8c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba2f90: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba2f94:
    /* 0x00ba2f94: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba2f98: mov      w0, #8 */ ARM64("mov w0, #8");
loc_00ba2f9c:
    /* 0x00ba2f9c: str      x8, [sp, #0x70] */ ARM64("str x8, [sp, #0x70]");
    /* 0x00ba2fa0: str      x0, [sp, #0x110] */ ARM64("str x0, [sp, #0x110]");
    /* 0x00ba2fa4: tbz      w22, #0, #0xba2ff8 */ if (((w22 >> #0) & 1) == 0) goto loc_00ba2ff8;
    /* 0x00ba2fa8: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00ba2fac: ldr      x22, [sp, #0xd0] */ ARM64("ldr x22, [sp, #0xd0]");
    /* 0x00ba2fb0: ldr      x20, [sp, #0xc0] */ ARM64("ldr x20, [sp, #0xc0]");
loc_00ba2fb4:
    /* 0x00ba2fb4: str      x25, [sp, #0x40] */ ARM64("str x25, [sp, #0x40]");
    /* 0x00ba2fb8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba2fbc: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00ba2fc0: cbz      x23, #0xba7874 */ if (x23 == 0) goto loc_00ba7874;
    /* 0x00ba2fc4: lsl      x27, x23, #3 */ ARM64("lsl x27, x23, #3");
    /* 0x00ba2fc8: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba2fcc: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba2fd0: ldr      x5, [sp, #0x110] */ ARM64("ldr x5, [sp, #0x110]");
    /* 0x00ba2fd4: cbz      x0, #0xba7890 */ if (x0 == 0) goto loc_00ba7890;
    /* 0x00ba2fd8: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00ba2fdc: cmp      x23, #2 */ ARM64("cmp x23, #2");
    /* 0x00ba2fe0: b.lo     #0xba34f0 */ if (COND_LO) goto loc_00ba34f0;
    /* 0x00ba2fe4: cmp      x23, #5 */ ARM64("cmp x23, #5");
    /* 0x00ba2fe8: b.hs     #0xba351c */ if (COND_HS) goto loc_00ba351c;
    /* 0x00ba2fec: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00ba2ff0: mov      x8, x25 */ ARM64("mov x8, x25");
    /* 0x00ba2ff4: b        #0xba3558 */ goto loc_00ba3558;
loc_00ba2ff8:
    /* 0x00ba2ff8: str      x26, [sp, #0x38] */ ARM64("str x26, [sp, #0x38]");
    /* 0x00ba2ffc: str      x21, [sp, #0x28] */ ARM64("str x21, [sp, #0x28]");
    /* 0x00ba3000: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00ba3004: ldp      x21, x8, [sp, #0x138] */ ARM64("ldp x21, x8, [sp, #0x138]");
    /* 0x00ba3008: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
    /* 0x00ba300c: ldp      x8, x28, [sp, #0x150] */ ARM64("ldp x8, x28, [sp, #0x150]");
    /* 0x00ba3010: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00ba3014: ldr      x8, [sp, #0x148] */ ARM64("ldr x8, [sp, #0x148]");
    /* 0x00ba3018: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00ba301c: ldr      x22, [sp, #0xd0] */ ARM64("ldr x22, [sp, #0xd0]");
    /* 0x00ba3020: ldr      x20, [sp, #0xc0] */ ARM64("ldr x20, [sp, #0xc0]");
    /* 0x00ba3024: str      x28, [sp, #0x30] */ ARM64("str x28, [sp, #0x30]");
    /* 0x00ba3028: str      x21, [sp, #0x68] */ ARM64("str x21, [sp, #0x68]");
loc_00ba302c:
    /* 0x00ba302c: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba3030: ldr      w27, [x8, x26, lsl #2] */ ARM64("ldr w27, [x8, x26, lsl #2]");
    /* 0x00ba3034: ldr      x0, [sp, #0xd8] */ ARM64("ldr x0, [sp, #0xd8]");
    /* 0x00ba3038: mov      x1, x28 */ ARM64("mov x1, x28");
    /* 0x00ba303c: mov      x2, x27 */ ARM64("mov x2, x27");
    /* 0x00ba3040: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba3044: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00ba3048: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba304c: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba3050: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba3054: and      x11, x0, x21 */ ARM64("and x11, x0, x21");
    /* 0x00ba3058: ldr      d1, [x8, x11] */ ARM64("ldr d1, [x8, x11]");
    /* 0x00ba305c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba3060: fmov     x9, d2 */ ARM64("fmov x9, d2");
    /* 0x00ba3064: ands     x12, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3068: b.eq     #0xba30a4 */ if (COND_EQ) goto loc_00ba30a4;
loc_00ba306c:
    /* 0x00ba306c: rbit     x9, x12 */ ARM64("rbit x9, x12");
    /* 0x00ba3070: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba3074: add      x9, x11, x9, lsr #3 */ ARM64("add x9, x11, x9, lsr #3");
    /* 0x00ba3078: and      x13, x9, x21 */ ARM64("and x13, x9, x21");
    /* 0x00ba307c: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00ba3080: mneg     x9, x13, x9 */ ARM64("mneg x9, x13, x9");
    /* 0x00ba3084: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba3088: ldur     w14, [x9, #-0x38] */ ARM64("ldur w14, [x9, #-0x38]");
    /* 0x00ba308c: cmp      w27, w14 */ ARM64("cmp w27, w14");
    /* 0x00ba3090: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba3094: b.eq     #0xba30e0 */ if (COND_EQ) goto loc_00ba30e0;
    /* 0x00ba3098: sub      x9, x12, #1 */ ARM64("sub x9, x12, #1");
    /* 0x00ba309c: ands     x12, x9, x12 */ ARM64("ands x12, x9, x12");
    /* 0x00ba30a0: b.ne     #0xba306c */ if (COND_NE) goto loc_00ba306c;
loc_00ba30a4:
    /* 0x00ba30a4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba30a8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba30ac: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba30b0: fmov     w9, s1 */ ARM64("fmov w9, s1");
    /* 0x00ba30b4: tbnz     w9, #0, #0xba31c4 */ if (((w9 >> #0) & 1) != 0) goto loc_00ba31c4;
    /* 0x00ba30b8: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00ba30bc: add      x0, x11, x10 */ ARM64("add x0, x11, x10");
    /* 0x00ba30c0: ldr      x21, [sp, #0x68] */ ARM64("ldr x21, [sp, #0x68]");
    /* 0x00ba30c4: and      x11, x0, x21 */ ARM64("and x11, x0, x21");
    /* 0x00ba30c8: ldr      d1, [x8, x11] */ ARM64("ldr d1, [x8, x11]");
    /* 0x00ba30cc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba30d0: fmov     x9, d2 */ ARM64("fmov x9, d2");
    /* 0x00ba30d4: ands     x12, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba30d8: b.ne     #0xba306c */ if (COND_NE) goto loc_00ba306c;
    /* 0x00ba30dc: b        #0xba30a4 */ goto loc_00ba30a4;
loc_00ba30e0:
    /* 0x00ba30e0: lsl      x10, x13, #6 */ ARM64("lsl x10, x13, #6");
    /* 0x00ba30e4: sub      x10, x10, x13, lsl #3 */ ARM64("sub x10, x10, x13, lsl #3");
    /* 0x00ba30e8: asr      x10, x10, #3 */ ARM64("asr x10, x10, #3");
    /* 0x00ba30ec: mov      x11, #0x6db7 */ ARM64("mov x11, #0x6db7");
    /* 0x00ba30f0: movk     x11, #0xb6db, lsl #16 */ ARM64("movk x11, #0xb6db, lsl #16");
    /* 0x00ba30f4: movk     x11, #0xdb6d, lsl #32 */ ARM64("movk x11, #0xdb6d, lsl #32");
    /* 0x00ba30f8: movk     x11, #0x6db6, lsl #48 */ ARM64("movk x11, #0x6db6, lsl #48");
    /* 0x00ba30fc: mul      x10, x10, x11 */ ARM64("mul x10, x10, x11");
    /* 0x00ba3100: sub      x11, x10, #8 */ ARM64("sub x11, x10, #8");
    /* 0x00ba3104: and      x11, x11, x21 */ ARM64("and x11, x11, x21");
    /* 0x00ba3108: add      x11, x8, x11 */ ARM64("add x11, x8, x11");
    /* 0x00ba310c: ldr      d0, [x11] */ ARM64("ldr d0, [x11]");
    /* 0x00ba3110: cmeq     v0.8b, v0.8b, v2.8b */ ARM64("cmeq v0.8b, v0.8b, v2.8b");
    /* 0x00ba3114: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba3118: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba311c: cmeq     v0.8b, v0.8b, v2.8b */ ARM64("cmeq v0.8b, v0.8b, v2.8b");
    /* 0x00ba3120: fmov     x13, d0 */ ARM64("fmov x13, d0");
    /* 0x00ba3124: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00ba3128: rbit     x13, x13 */ ARM64("rbit x13, x13");
    /* 0x00ba312c: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba3130: lsr      x13, x13, #3 */ ARM64("lsr x13, x13, #3");
    /* 0x00ba3134: add      x12, x13, x12, lsr #3 */ ARM64("add x12, x13, x12, lsr #3");
    /* 0x00ba3138: cmp      x12, #7 */ ARM64("cmp x12, #7");
    /* 0x00ba313c: b.ls     #0xba3148 */ if (COND_LS) goto loc_00ba3148;
    /* 0x00ba3140: mov      w12, #0x80 */ ARM64("mov w12, #0x80");
    /* 0x00ba3144: b        #0xba315c */ goto loc_00ba315c;
loc_00ba3148:
    /* 0x00ba3148: ldr      x12, [sp, #0x48] */ ARM64("ldr x12, [sp, #0x48]");
    /* 0x00ba314c: add      x12, x12, #1 */ ARM64("add x12, x12, #1");
    /* 0x00ba3150: str      x12, [sp, #0x48] */ ARM64("str x12, [sp, #0x48]");
    /* 0x00ba3154: str      x12, [sp, #0x140] */ ARM64("str x12, [sp, #0x140]");
    /* 0x00ba3158: mov      w12, #0xff */ ARM64("mov w12, #0xff");
loc_00ba315c:
    /* 0x00ba315c: ldr      x20, [sp, #0x80] */ ARM64("ldr x20, [sp, #0x80]");
    /* 0x00ba3160: ldr      x13, [sp, #0x100] */ ARM64("ldr x13, [sp, #0x100]");
    /* 0x00ba3164: strb     w12, [x8, x10] */ ARM64("strb w12, [x8, x10]");
    /* 0x00ba3168: strb     w12, [x11, #8] */ ARM64("strb w12, [x11, #8]");
    /* 0x00ba316c: sub      x13, x13, #1 */ ARM64("sub x13, x13, #1");
    /* 0x00ba3170: str      x13, [sp, #0x148] */ ARM64("str x13, [sp, #0x148]");
    /* 0x00ba3174: ldur     x28, [x9, #-0x30] */ ARM64("ldur x28, [x9, #-0x30]");
    /* 0x00ba3178: str      x13, [sp, #0x100] */ ARM64("str x13, [sp, #0x100]");
    /* 0x00ba317c: cbz      x28, #0xba31d4 */ if (x28 == 0) goto loc_00ba31d4;
    /* 0x00ba3180: ldur     x10, [x9, #-0x28] */ ARM64("ldur x10, [x9, #-0x28]");
    /* 0x00ba3184: ldur     x21, [x9, #-0x18] */ ARM64("ldur x21, [x9, #-0x18]");
    /* 0x00ba3188: ldr      d0, [x28] */ ARM64("ldr d0, [x28]");
    /* 0x00ba318c: cbz      x10, #0xba3214 */ if (x10 == 0) goto loc_00ba3214;
    /* 0x00ba3190: lsl      x8, x10, #2 */ ARM64("lsl x8, x10, #2");
    /* 0x00ba3194: add      x8, x8, #0xb */ ARM64("add x8, x8, #0xb");
    /* 0x00ba3198: and      x9, x8, #0xfffffffffffffff8 */ ARM64("and x9, x8, #0xfffffffffffffff8");
    /* 0x00ba319c: add      x8, x10, x9 */ ARM64("add x8, x10, x9");
    /* 0x00ba31a0: adds     x8, x8, #9 */ ARM64("adds x8, x8, #9");
    /* 0x00ba31a4: sub      x0, x28, x9 */ ARM64("sub x0, x28, x9");
    /* 0x00ba31a8: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00ba31ac: cbnz     x21, #0xba3218 */ if (x21 != 0) goto loc_00ba3218;
    /* 0x00ba31b0: ldr      x22, [sp, #0xd0] */ ARM64("ldr x22, [sp, #0xd0]");
    /* 0x00ba31b4: ldr      x20, [sp, #0xc0] */ ARM64("ldr x20, [sp, #0xc0]");
    /* 0x00ba31b8: ldr      x28, [sp, #0x30] */ ARM64("ldr x28, [sp, #0x30]");
    /* 0x00ba31bc: cbz      x8, #0xba3488 */ if (x8 == 0) goto loc_00ba3488;
    /* 0x00ba31c0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba31c4:
    /* 0x00ba31c4: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba31c8: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00ba31cc:
    /* 0x00ba31cc: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba31d0: b        #0xba31ec */ goto loc_00ba31ec;
loc_00ba31d4:
    /* 0x00ba31d4: mov      x21, #0 */ ARM64("mov x21, #0");
loc_00ba31d8:
    /* 0x00ba31d8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba31dc: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba31e0: ldr      x22, [sp, #0xd0] */ ARM64("ldr x22, [sp, #0xd0]");
loc_00ba31e4:
    /* 0x00ba31e4: ldr      x20, [sp, #0xc0] */ ARM64("ldr x20, [sp, #0xc0]");
    /* 0x00ba31e8: ldr      x28, [sp, #0x30] */ ARM64("ldr x28, [sp, #0x30]");
loc_00ba31ec:
    /* 0x00ba31ec: ldr      x10, [sp, #0x110] */ ARM64("ldr x10, [sp, #0x110]");
    /* 0x00ba31f0: mov      w11, #0x18 */ ARM64("mov w11, #0x18");
    /* 0x00ba31f4: madd     x10, x26, x11, x10 */ ARM64("madd x10, x26, x11, x10");
    /* 0x00ba31f8: stp      x8, x9, [x10] */ ARM64("stp x8, x9, [x10]");
    /* 0x00ba31fc: str      x21, [x10, #0x10] */ ARM64("str x21, [x10, #0x10]");
    /* 0x00ba3200: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00ba3204: cmp      x26, x23 */ ARM64("cmp x26, x23");
    /* 0x00ba3208: ldr      x21, [sp, #0x68] */ ARM64("ldr x21, [sp, #0x68]");
    /* 0x00ba320c: b.ne     #0xba302c */ if (COND_NE) goto loc_00ba302c;
    /* 0x00ba3210: b        #0xba2fb4 */ goto loc_00ba2fb4;
loc_00ba3214:
    /* 0x00ba3214: cbz      x21, #0xba31d8 */ if (x21 == 0) goto loc_00ba31d8;
loc_00ba3218:
    /* 0x00ba3218: add      x23, x28, #8 */ ARM64("add x23, x28, #8");
    /* 0x00ba321c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba3220: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba3224: ands     x8, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x8, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3228: str      x0, [sp, #0x10] */ ARM64("str x0, [sp, #0x10]");
    /* 0x00ba322c: str      x10, [sp, #0x20] */ ARM64("str x10, [sp, #0x20]");
    /* 0x00ba3230: str      w9, [sp, #0x1c] */ ARM64("str w9, [sp, #0x1c]");
    /* 0x00ba3234: b.ne     #0xba3250 */ if (COND_NE) goto loc_00ba3250;
loc_00ba3238:
    /* 0x00ba3238: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba323c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba3240: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba3244: sub      x28, x28, #0x20 */ ARM64("sub x28, x28, #0x20");
    /* 0x00ba3248: and      x8, x8, #0x8080808080808080 */ ARM64("and x8, x8, #0x8080808080808080");
    /* 0x00ba324c: cbz      x8, #0xba3238 */ if (x8 == 0) goto loc_00ba3238;
loc_00ba3250:
    /* 0x00ba3250: ldr      x9, [sp, #0x28] */ ARM64("ldr x9, [sp, #0x28]");
    /* 0x00ba3254: cbz      x9, #0xba34fc */ if (x9 == 0) goto loc_00ba34fc;
    /* 0x00ba3258: sub      x9, x8, #1 */ ARM64("sub x9, x8, #1");
    /* 0x00ba325c: rbit     x10, x8 */ ARM64("rbit x10, x8");
    /* 0x00ba3260: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba3264: and      x22, x9, x8 */ ARM64("and x22, x9, x8");
    /* 0x00ba3268: lsr      x8, x10, #1 */ ARM64("lsr x8, x10, #1");
    /* 0x00ba326c: and      x8, x8, #0x3c */ ARM64("and x8, x8, #0x3c");
    /* 0x00ba3270: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00ba3274: ldur     w27, [x8, #-4] */ ARM64("ldur w27, [x8, #-4]");
    /* 0x00ba3278: ldr      x0, [sp, #0x38] */ ARM64("ldr x0, [sp, #0x38]");
    /* 0x00ba327c: ldr      x1, [sp, #0x50] */ ARM64("ldr x1, [sp, #0x50]");
    /* 0x00ba3280: mov      x2, x27 */ ARM64("mov x2, x27");
    /* 0x00ba3284: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba3288: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba328c: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba3290: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
loc_00ba3294:
    /* 0x00ba3294: and      x9, x0, x20 */ ARM64("and x9, x0, x20");
    /* 0x00ba3298: ldr      x10, [sp, #0xa0] */ ARM64("ldr x10, [sp, #0xa0]");
    /* 0x00ba329c: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00ba32a0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba32a4: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00ba32a8: ands     x11, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x11, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba32ac: b.eq     #0xba32e8 */ if (COND_EQ) goto loc_00ba32e8;
    /* 0x00ba32b0: str      x25, [sp, #0x40] */ ARM64("str x25, [sp, #0x40]");
loc_00ba32b4:
    /* 0x00ba32b4: rbit     x10, x11 */ ARM64("rbit x10, x11");
    /* 0x00ba32b8: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba32bc: add      x10, x9, x10, lsr #3 */ ARM64("add x10, x9, x10, lsr #3");
    /* 0x00ba32c0: and      x10, x10, x20 */ ARM64("and x10, x10, x20");
    /* 0x00ba32c4: ldr      x12, [sp, #0xa0] */ ARM64("ldr x12, [sp, #0xa0]");
    /* 0x00ba32c8: sub      x10, x12, x10, lsl #4 */ ARM64("sub x10, x12, x10, lsl #4");
    /* 0x00ba32cc: ldur     w12, [x10, #-0x10] */ ARM64("ldur w12, [x10, #-0x10]");
    /* 0x00ba32d0: cmp      w27, w12 */ ARM64("cmp w27, w12");
    /* 0x00ba32d4: b.eq     #0xba3308 */ if (COND_EQ) goto loc_00ba3308;
    /* 0x00ba32d8: sub      x10, x11, #1 */ ARM64("sub x10, x11, #1");
    /* 0x00ba32dc: ands     x11, x10, x11 */ ARM64("ands x11, x10, x11");
    /* 0x00ba32e0: ldr      x25, [sp, #0x40] */ ARM64("ldr x25, [sp, #0x40]");
    /* 0x00ba32e4: b.ne     #0xba32b4 */ if (COND_NE) goto loc_00ba32b4;
loc_00ba32e8:
    /* 0x00ba32e8: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba32ec: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba32f0: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba32f4: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00ba32f8: tbnz     w10, #0, #0xba34fc */ if (((w10 >> #0) & 1) != 0) goto loc_00ba34fc;
    /* 0x00ba32fc: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba3300: add      x0, x9, x8 */ ARM64("add x0, x9, x8");
    /* 0x00ba3304: b        #0xba3294 */ goto loc_00ba3294;
loc_00ba3308:
    /* 0x00ba3308: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba330c: sub      x8, x21, #1 */ ARM64("sub x8, x21, #1");
    /* 0x00ba3310: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba3314: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00ba3318: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00ba331c: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00ba3320: csel     x25, x8, x9, hi */ ARM64("csel x25, x8, x9, hi");
    /* 0x00ba3324: lsr      x8, x8, #0x3d */ ARM64("lsr x8, x8, #0x3d");
    /* 0x00ba3328: cbnz     x8, #0xba7938 */ if (x8 != 0) goto loc_00ba7938;
    /* 0x00ba332c: lsl      x27, x25, #3 */ ARM64("lsl x27, x25, #3");
    /* 0x00ba3330: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba3334: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00ba3338: b.hi     #0xba7938 */ if (COND_HI) goto loc_00ba7938;
    /* 0x00ba333c: ldur     x20, [x10, #-8] */ ARM64("ldur x20, [x10, #-8]");
    /* 0x00ba3340: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba3344: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba3348: cbz      x0, #0xba7930 */ if (x0 == 0) goto loc_00ba7930;
    /* 0x00ba334c: str      x20, [x0] */ ARM64("str x20, [x0]");
    /* 0x00ba3350: stp      x0, x0, [sp] */ ARM64("stp x0, x0, [sp]");
    /* 0x00ba3354: mov      w27, #1 */ ARM64("mov w27, #1");
    /* 0x00ba3358: stp      x25, x0, [x29, #-0xb0] */ ARM64("stp x25, x0, [x29, #-0xb0]");
    /* 0x00ba335c: sub      x10, x21, #1 */ ARM64("sub x10, x21, #1");
    /* 0x00ba3360: b        #0xba3370 */ goto loc_00ba3370;
loc_00ba3364:
    /* 0x00ba3364: ldr      x8, [sp, #8] */ ARM64("ldr x8, [sp, #8]");
    /* 0x00ba3368: str      x25, [x8, x27, lsl #3] */ ARM64("str x25, [x8, x27, lsl #3]");
    /* 0x00ba336c: add      x27, x27, #1 */ ARM64("add x27, x27, #1");
loc_00ba3370:
    /* 0x00ba3370: stur     x27, [x29, #-0xa0] */ ARM64("stur x27, [x29, #-0xa0]");
    /* 0x00ba3374: cbz      x10, #0xba3490 */ if (x10 == 0) goto loc_00ba3490;
    /* 0x00ba3378: cbnz     x22, #0xba3394 */ if (x22 != 0) goto loc_00ba3394;
loc_00ba337c:
    /* 0x00ba337c: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba3380: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba3384: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba3388: sub      x28, x28, #0x20 */ ARM64("sub x28, x28, #0x20");
    /* 0x00ba338c: and      x22, x8, #0x8080808080808080 */ ARM64("and x22, x8, #0x8080808080808080");
    /* 0x00ba3390: cbz      x22, #0xba337c */ if (x22 == 0) goto loc_00ba337c;
loc_00ba3394:
    /* 0x00ba3394: sub      x8, x22, #1 */ ARM64("sub x8, x22, #1");
    /* 0x00ba3398: rbit     x9, x22 */ ARM64("rbit x9, x22");
    /* 0x00ba339c: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba33a0: and      x22, x8, x22 */ ARM64("and x22, x8, x22");
    /* 0x00ba33a4: lsr      x8, x9, #1 */ ARM64("lsr x8, x9, #1");
    /* 0x00ba33a8: and      x8, x8, #0x3c */ ARM64("and x8, x8, #0x3c");
    /* 0x00ba33ac: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00ba33b0: sub      x20, x10, #1 */ ARM64("sub x20, x10, #1");
    /* 0x00ba33b4: ldur     w25, [x8, #-4] */ ARM64("ldur w25, [x8, #-4]");
    /* 0x00ba33b8: ldr      x0, [sp, #0x38] */ ARM64("ldr x0, [sp, #0x38]");
    /* 0x00ba33bc: ldr      x1, [sp, #0x50] */ ARM64("ldr x1, [sp, #0x50]");
    /* 0x00ba33c0: mov      x2, x25 */ ARM64("mov x2, x25");
    /* 0x00ba33c4: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba33c8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba33cc: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba33d0: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
loc_00ba33d4:
    /* 0x00ba33d4: ldr      x9, [sp, #0x80] */ ARM64("ldr x9, [sp, #0x80]");
    /* 0x00ba33d8: and      x9, x0, x9 */ ARM64("and x9, x0, x9");
    /* 0x00ba33dc: ldr      x10, [sp, #0xa0] */ ARM64("ldr x10, [sp, #0xa0]");
    /* 0x00ba33e0: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00ba33e4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba33e8: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00ba33ec: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba33f0: b.eq     #0xba3428 */ if (COND_EQ) goto loc_00ba3428;
loc_00ba33f4:
    /* 0x00ba33f4: rbit     x11, x10 */ ARM64("rbit x11, x10");
    /* 0x00ba33f8: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba33fc: add      x11, x9, x11, lsr #3 */ ARM64("add x11, x9, x11, lsr #3");
    /* 0x00ba3400: ldr      x12, [sp, #0x80] */ ARM64("ldr x12, [sp, #0x80]");
    /* 0x00ba3404: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00ba3408: ldr      x12, [sp, #0xa0] */ ARM64("ldr x12, [sp, #0xa0]");
    /* 0x00ba340c: sub      x11, x12, x11, lsl #4 */ ARM64("sub x11, x12, x11, lsl #4");
    /* 0x00ba3410: ldur     w12, [x11, #-0x10] */ ARM64("ldur w12, [x11, #-0x10]");
    /* 0x00ba3414: cmp      w25, w12 */ ARM64("cmp w25, w12");
    /* 0x00ba3418: b.eq     #0xba3448 */ if (COND_EQ) goto loc_00ba3448;
    /* 0x00ba341c: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00ba3420: ands     x10, x11, x10 */ ARM64("ands x10, x11, x10");
    /* 0x00ba3424: b.ne     #0xba33f4 */ if (COND_NE) goto loc_00ba33f4;
loc_00ba3428:
    /* 0x00ba3428: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba342c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba3430: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba3434: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00ba3438: tbnz     w10, #0, #0xba5260 */ if (((w10 >> #0) & 1) != 0) goto loc_00ba5260;
    /* 0x00ba343c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba3440: add      x0, x9, x8 */ ARM64("add x0, x9, x8");
    /* 0x00ba3444: b        #0xba33d4 */ goto loc_00ba33d4;
loc_00ba3448:
    /* 0x00ba3448: ldur     x25, [x11, #-8] */ ARM64("ldur x25, [x11, #-8]");
    /* 0x00ba344c: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00ba3450: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00ba3454: mov      x10, x20 */ ARM64("mov x10, x20");
    /* 0x00ba3458: b.ne     #0xba3364 */ if (COND_NE) goto loc_00ba3364;
    /* 0x00ba345c: adds     x8, x10, #1 */ ARM64("adds x8, x10, #1");
    /* 0x00ba3460: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00ba3464: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba3468: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00ba346c: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00ba3470: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00ba3474: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00ba3478: ldur     x8, [x29, #-0xa8] */ ARM64("ldur x8, [x29, #-0xa8]");
    /* 0x00ba347c: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x00ba3480: mov      x10, x20 */ ARM64("mov x10, x20");
    /* 0x00ba3484: b        #0xba3364 */ goto loc_00ba3364;
loc_00ba3488:
    /* 0x00ba3488: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba348c: b        #0xba31cc */ goto loc_00ba31cc;
loc_00ba3490:
    /* 0x00ba3490: ldr      x8, [sp, #0x20] */ ARM64("ldr x8, [sp, #0x20]");
    /* 0x00ba3494: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba3498: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba349c: ldr      w9, [sp, #0x1c] */ ARM64("ldr w9, [sp, #0x1c]");
    /* 0x00ba34a0: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00ba34a4: tbnz     w8, #0, #0xba34b0 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba34b0;
    /* 0x00ba34a8: ldr      x0, [sp, #0x10] */ ARM64("ldr x0, [sp, #0x10]");
    /* 0x00ba34ac: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba34b0:
    /* 0x00ba34b0: ldp      x8, x9, [x29, #-0xb0] */ ARM64("ldp x8, x9, [x29, #-0xb0]");
    /* 0x00ba34b4: ldr      x22, [sp, #0xd0] */ ARM64("ldr x22, [sp, #0xd0]");
    /* 0x00ba34b8: mov      x23, x24 */ ARM64("mov x23, x24");
    /* 0x00ba34bc: ldr      x25, [sp, #0x40] */ ARM64("ldr x25, [sp, #0x40]");
    /* 0x00ba34c0: b        #0xba31e4 */ goto loc_00ba31e4;
loc_00ba34c4:
    /* 0x00ba34c4: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba34c8: mov      w1, #8 */ ARM64("mov w1, #8");
    /* 0x00ba34cc: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba34d0: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba34d4:
    /* 0x00ba34d4: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba34d8: add      x0, x0, #0xcf5 */ ARM64("add x0, x0, #0xcf5");
    /* 0x00ba34dc: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00ba34e0: add      x2, x2, #0xad0 */ ARM64("add x2, x2, #0xad0");
    /* 0x00ba34e4: mov      w1, #0x39 */ ARM64("mov w1, #0x39");
    /* 0x00ba34e8: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
    /* 0x00ba34ec: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba34f0:
    /* 0x00ba34f0: mov      w27, #1 */ ARM64("mov w27, #1");
    /* 0x00ba34f4: mov      x8, x25 */ ARM64("mov x8, x25");
    /* 0x00ba34f8: b        #0xba3574 */ goto loc_00ba3574;
loc_00ba34fc:
    /* 0x00ba34fc: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00ba3500: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00ba3504: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba3508: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba350c:
    /* 0x00ba350c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba3510: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00ba3514: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba3518: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba351c:
    /* 0x00ba351c: sub      x10, x23, #1 */ ARM64("sub x10, x23, #1");
    /* 0x00ba3520: and      x11, x10, #0xfffffffffffffffc */ ARM64("and x11, x10, #0xfffffffffffffffc");
    /* 0x00ba3524: add      x8, x25, x11, lsl #3 */ ARM64("add x8, x25, x11, lsl #3");
    /* 0x00ba3528: orr      x9, x11, #1 */ ARM64("orr x9, x11, #1");
    /* 0x00ba352c: add      x12, x25, #0x10 */ ARM64("add x12, x25, #0x10");
    /* 0x00ba3530: ldr      x13, [sp, #0xa8] */ ARM64("ldr x13, [sp, #0xa8]");
    /* 0x00ba3534: and      x13, x13, #0xfffffffffffffffc */ ARM64("and x13, x13, #0xfffffffffffffffc");
    /* 0x00ba3538: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
loc_00ba353c:
    /* 0x00ba353c: stp      q0, q0, [x12, #-0x10] */ ARM64("stp q0, q0, [x12, #-0x10]");
    /* 0x00ba3540: add      x12, x12, #0x20 */ ARM64("add x12, x12, #0x20");
    /* 0x00ba3544: subs     x13, x13, #4 */ ARM64("subs x13, x13, #4");
    /* 0x00ba3548: b.ne     #0xba353c */ if (COND_NE) goto loc_00ba353c;
    /* 0x00ba354c: mov      x27, x23 */ ARM64("mov x27, x23");
    /* 0x00ba3550: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba3554: b.eq     #0xba3574 */ if (COND_EQ) goto loc_00ba3574;
loc_00ba3558:
    /* 0x00ba3558: ldr      x10, [sp, #0xb0] */ ARM64("ldr x10, [sp, #0xb0]");
    /* 0x00ba355c: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00ba3560: mov      x10, #-1 */ ARM64("mov x10, #-1");
loc_00ba3564:
    /* 0x00ba3564: str      x10, [x8], #8 */ ARM64("str x10, [x8], #8");
    /* 0x00ba3568: adds     x9, x9, #1 */ ARM64("adds x9, x9, #1");
    /* 0x00ba356c: b.lo     #0xba3564 */ if (COND_LO) goto loc_00ba3564;
    /* 0x00ba3570: mov      x27, x23 */ ARM64("mov x27, x23");
loc_00ba3574:
    /* 0x00ba3574: mov      x9, #-1 */ ARM64("mov x9, #-1");
    /* 0x00ba3578: str      x9, [x8] */ ARM64("str x9, [x8]");
    /* 0x00ba357c: sub      x0, x23, #1 */ ARM64("sub x0, x23, #1");
    /* 0x00ba3580: cmp      x0, x27 */ ARM64("cmp x0, x27");
    /* 0x00ba3584: b.hs     #0xba78a0 */ if (COND_HS) goto loc_00ba78a0;
    /* 0x00ba3588: str      x0, [x25, x0, lsl #3] */ ARM64("str x0, [x25, x0, lsl #3]");
    /* 0x00ba358c: cbz      x0, #0xba36b0 */ if (x0 == 0) goto loc_00ba36b0;
    /* 0x00ba3590: mov      w14, #0 */ ARM64("mov w14, #0");
    /* 0x00ba3594: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00ba3598: add      x2, x2, #0x910 */ ARM64("add x2, x2, #0x910");
    /* 0x00ba359c: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00ba35a0: add      x8, x8, #0x978 */ ARM64("add x8, x8, #0x978");
    /* 0x00ba35a4: adrp     x10, #0xefc000 */ ARM64("adrp x10, #0xefc000");
    /* 0x00ba35a8: add      x10, x10, #0x940 */ ARM64("add x10, x10, #0x940");
    /* 0x00ba35ac: mov      w12, #0x18 */ ARM64("mov w12, #0x18");
    /* 0x00ba35b0: adrp     x11, #0xefc000 */ ARM64("adrp x11, #0xefc000");
    /* 0x00ba35b4: add      x11, x11, #0x990 */ ARM64("add x11, x11, #0x990");
    /* 0x00ba35b8: sub      x9, x23, #1 */ ARM64("sub x9, x23, #1");
    /* 0x00ba35bc: adrp     x13, #0xefc000 */ ARM64("adrp x13, #0xefc000");
    /* 0x00ba35c0: add      x13, x13, #0x9a8 */ ARM64("add x13, x13, #0x9a8");
loc_00ba35c4:
    /* 0x00ba35c4: sub      x15, x9, #1 */ ARM64("sub x15, x9, #1");
    /* 0x00ba35c8: cmp      x20, x26 */ ARM64("cmp x20, x26");
    /* 0x00ba35cc: b.hs     #0xba7740 */ if (COND_HS) goto loc_00ba7740;
    /* 0x00ba35d0: madd     x9, x15, x12, x5 */ ARM64("madd x9, x15, x12, x5");
    /* 0x00ba35d4: ldp      x16, x9, [x9, #8] */ ARM64("ldp x16, x9, [x9, #8]");
    /* 0x00ba35d8: lsl      x17, x9, #3 */ ARM64("lsl x17, x9, #3");
    /* 0x00ba35dc: add      x1, x16, x17 */ ARM64("add x1, x16, x17");
loc_00ba35e0:
    /* 0x00ba35e0: cbz      x17, #0xba7568 */ if (x17 == 0) goto loc_00ba7568;
    /* 0x00ba35e4: ldr      x9, [x16], #8 */ ARM64("ldr x9, [x16], #8");
    /* 0x00ba35e8: cmp      x9, x27 */ ARM64("cmp x9, x27");
    /* 0x00ba35ec: b.hs     #0xba7270 */ if (COND_HS) goto loc_00ba7270;
    /* 0x00ba35f0: ldr      x3, [x25, x9, lsl #3] */ ARM64("ldr x3, [x25, x9, lsl #3]");
    /* 0x00ba35f4: sub      x17, x17, #8 */ ARM64("sub x17, x17, #8");
    /* 0x00ba35f8: cmn      x3, #1 */ ARM64("cmn x3, #1");
    /* 0x00ba35fc: b.eq     #0xba35e0 */ if (COND_EQ) goto loc_00ba35e0;
    /* 0x00ba3600: cmp      x16, x1 */ ARM64("cmp x16, x1");
    /* 0x00ba3604: b.eq     #0xba3678 */ if (COND_EQ) goto loc_00ba3678;
    /* 0x00ba3608: mov      x17, #0 */ ARM64("mov x17, #0");
    /* 0x00ba360c: sub      x1, x1, x16 */ ARM64("sub x1, x1, x16");
    /* 0x00ba3610: lsr      x1, x1, #3 */ ARM64("lsr x1, x1, #3");
    /* 0x00ba3614: b        #0xba3624 */ goto loc_00ba3624;
loc_00ba3618:
    /* 0x00ba3618: add      x17, x17, #1 */ ARM64("add x17, x17, #1");
    /* 0x00ba361c: cmp      x17, x1 */ ARM64("cmp x17, x1");
    /* 0x00ba3620: b.eq     #0xba3678 */ if (COND_EQ) goto loc_00ba3678;
loc_00ba3624:
    /* 0x00ba3624: ldr      x3, [x16, x17, lsl #3] */ ARM64("ldr x3, [x16, x17, lsl #3]");
    /* 0x00ba3628: cmp      x3, x27 */ ARM64("cmp x3, x27");
    /* 0x00ba362c: b.hs     #0xba75e0 */ if (COND_HS) goto loc_00ba75e0;
    /* 0x00ba3630: ldr      x4, [x25, x3, lsl #3] */ ARM64("ldr x4, [x25, x3, lsl #3]");
    /* 0x00ba3634: cmn      x4, #1 */ ARM64("cmn x4, #1");
    /* 0x00ba3638: b.eq     #0xba3618 */ if (COND_EQ) goto loc_00ba3618;
loc_00ba363c:
    /* 0x00ba363c: cmp      x9, x3 */ ARM64("cmp x9, x3");
    /* 0x00ba3640: cset     w4, hi */ ARM64("cset w4, hi");
    /* 0x00ba3644: csinv    w4, w4, wzr, hs */ ARM64("csinv w4, w4, wzr, hs");
    /* 0x00ba3648: and      w4, w4, #0xff */ ARM64("and w4, w4, #0xff");
    /* 0x00ba364c: cmp      w4, #0xff */ ARM64("cmp w4, #0xff");
    /* 0x00ba3650: b.ne     #0xba3664 */ if (COND_NE) goto loc_00ba3664;
    /* 0x00ba3654: cmp      x9, x27 */ ARM64("cmp x9, x27");
    /* 0x00ba3658: b.hs     #0xba726c */ if (COND_HS) goto loc_00ba726c;
    /* 0x00ba365c: ldr      x9, [x25, x9, lsl #3] */ ARM64("ldr x9, [x25, x9, lsl #3]");
    /* 0x00ba3660: b        #0xba363c */ goto loc_00ba363c;
loc_00ba3664:
    /* 0x00ba3664: cbz      w4, #0xba3618 */ if (w4 == 0) goto loc_00ba3618;
    /* 0x00ba3668: cmp      x3, x27 */ ARM64("cmp x3, x27");
    /* 0x00ba366c: b.hs     #0xba7658 */ if (COND_HS) goto loc_00ba7658;
    /* 0x00ba3670: ldr      x3, [x25, x3, lsl #3] */ ARM64("ldr x3, [x25, x3, lsl #3]");
    /* 0x00ba3674: b        #0xba363c */ goto loc_00ba363c;
loc_00ba3678:
    /* 0x00ba3678: cmp      x20, x27 */ ARM64("cmp x20, x27");
    /* 0x00ba367c: b.hs     #0xba774c */ if (COND_HS) goto loc_00ba774c;
    /* 0x00ba3680: ldr      x17, [x25, x15, lsl #3] */ ARM64("ldr x17, [x25, x15, lsl #3]");
    /* 0x00ba3684: mov      x16, x14 */ ARM64("mov x16, x14");
    /* 0x00ba3688: cmp      x9, x17 */ ARM64("cmp x9, x17");
    /* 0x00ba368c: b.eq     #0xba3698 */ if (COND_EQ) goto loc_00ba3698;
    /* 0x00ba3690: str      x9, [x25, x15, lsl #3] */ ARM64("str x9, [x25, x15, lsl #3]");
    /* 0x00ba3694: mov      w16, #1 */ ARM64("mov w16, #1");
loc_00ba3698:
    /* 0x00ba3698: cmp      x15, #0 */ ARM64("cmp x15, #0");
    /* 0x00ba369c: cset     w9, ne */ ARM64("cset w9, ne");
    /* 0x00ba36a0: and      w14, w9, w16 */ ARM64("and w14, w9, w16");
    /* 0x00ba36a4: csel     x9, x0, x15, eq */ ARM64("csel x9, x0, x15, eq");
    /* 0x00ba36a8: cbnz     x15, #0xba35c4 */ if (x15 != 0) goto loc_00ba35c4;
    /* 0x00ba36ac: tbnz     w16, #0, #0xba35c4 */ if (((w16 >> #0) & 1) != 0) goto loc_00ba35c4;
loc_00ba36b0:
    /* 0x00ba36b0: ldrb     w8, [x22, #0x10] */ ARM64("ldrb w8, [x22, #0x10]");
    /* 0x00ba36b4: tbz      w8, #0, #0xba7594 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba7594;
loc_00ba36b8:
    /* 0x00ba36b8: add      x20, x25, x27, lsl #3 */ ARM64("add x20, x25, x27, lsl #3");
    /* 0x00ba36bc: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba36c0: stp      q1, q0, [sp, #0x130] */ ARM64("stp q1, q0, [sp, #0x130]");
    /* 0x00ba36c4: ldr      q0, [x22] */ ARM64("ldr q0, [x22]");
    /* 0x00ba36c8: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00ba36cc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba36d0: str      x8, [x22] */ ARM64("str x8, [x22]");
    /* 0x00ba36d4: str      q0, [sp, #0x150] */ ARM64("str q0, [sp, #0x150]");
    /* 0x00ba36d8: cmp      x25, x20 */ ARM64("cmp x25, x20");
    /* 0x00ba36dc: b.ne     #0xba75a4 */ if (COND_NE) goto loc_00ba75a4;
loc_00ba36e0:
    /* 0x00ba36e0: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba36e4: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00ba36e8: add      x8, x8, #0x8b0 */ ARM64("add x8, x8, #0x8b0");
    /* 0x00ba36ec: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00ba36f0: mov      x22, x25 */ ARM64("mov x22, x25");
    /* 0x00ba36f4: b        #0xba37ac */ goto loc_00ba37ac;
loc_00ba36f8:
    /* 0x00ba36f8: and      x14, x27, x10 */ ARM64("and x14, x27, x10");
    /* 0x00ba36fc: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba3700: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba3704: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba3708: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba370c: b.eq     #0xba373c */ if (COND_EQ) goto loc_00ba373c;
loc_00ba3710:
    /* 0x00ba3710: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba3714: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba3718: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba371c: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba3720: sub      x17, x8, x16, lsl #3 */ ARM64("sub x17, x8, x16, lsl #3");
    /* 0x00ba3724: ldur     w17, [x17, #-8] */ ARM64("ldur w17, [x17, #-8]");
    /* 0x00ba3728: cmp      w28, w17 */ ARM64("cmp w28, w17");
    /* 0x00ba372c: b.eq     #0xba378c */ if (COND_EQ) goto loc_00ba378c;
    /* 0x00ba3730: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba3734: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba3738: b.ne     #0xba3710 */ if (COND_NE) goto loc_00ba3710;
loc_00ba373c:
    /* 0x00ba373c: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba3740: b.eq     #0xba3760 */ if (COND_EQ) goto loc_00ba3760;
    /* 0x00ba3744: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba3748: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba374c: cbz      x11, #0xba377c */ if (x11 == 0) goto loc_00ba377c;
    /* 0x00ba3750: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba3754: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba3758: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba375c: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba3760:
    /* 0x00ba3760: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba3764: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba3768: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba376c: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba3770: tbnz     w13, #0, #0xba37fc */ if (((w13 >> #0) & 1) != 0) goto loc_00ba37fc;
    /* 0x00ba3774: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba3778: b        #0xba3780 */ goto loc_00ba3780;
loc_00ba377c:
    /* 0x00ba377c: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba3780:
    /* 0x00ba3780: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba3784: add      x27, x12, x14 */ ARM64("add x27, x12, x14");
    /* 0x00ba3788: b        #0xba36f8 */ goto loc_00ba36f8;
loc_00ba378c:
    /* 0x00ba378c: neg      x9, x16 */ ARM64("neg x9, x16");
loc_00ba3790:
    /* 0x00ba3790: add      x8, x8, x9, lsl #3 */ ARM64("add x8, x8, x9, lsl #3");
    /* 0x00ba3794: stur     w23, [x8, #-4] */ ARM64("stur w23, [x8, #-4]");
    /* 0x00ba3798: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00ba379c: cmp      x22, x20 */ ARM64("cmp x22, x20");
    /* 0x00ba37a0: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba37a4: mov      x23, x24 */ ARM64("mov x23, x24");
    /* 0x00ba37a8: b.eq     #0xba3878 */ if (COND_EQ) goto loc_00ba3878;
loc_00ba37ac:
    /* 0x00ba37ac: cmp      x21, x23 */ ARM64("cmp x21, x23");
    /* 0x00ba37b0: b.eq     #0xba76f8 */ if (COND_EQ) goto loc_00ba76f8;
    /* 0x00ba37b4: ldr      x8, [x22], #8 */ ARM64("ldr x8, [x22], #8");
    /* 0x00ba37b8: cmp      x8, x23 */ ARM64("cmp x8, x23");
    /* 0x00ba37bc: b.hs     #0xba76e8 */ if (COND_HS) goto loc_00ba76e8;
    /* 0x00ba37c0: ldr      x9, [sp, #0x90] */ ARM64("ldr x9, [sp, #0x90]");
    /* 0x00ba37c4: ldr      w28, [x9, x21, lsl #2] */ ARM64("ldr w28, [x9, x21, lsl #2]");
    /* 0x00ba37c8: ldr      w23, [x9, x8, lsl #2] */ ARM64("ldr w23, [x9, x8, lsl #2]");
    /* 0x00ba37cc: ldp      x0, x1, [sp, #0x150] */ ARM64("ldp x0, x1, [sp, #0x150]");
    /* 0x00ba37d0: mov      x2, x28 */ ARM64("mov x2, x28");
    /* 0x00ba37d4: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba37d8: mov      x27, x0 */ ARM64("mov x27, x0");
    /* 0x00ba37dc: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba37e0: cbz      x8, #0xba3840 */ if (x8 == 0) goto loc_00ba3840;
loc_00ba37e4:
    /* 0x00ba37e4: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba37e8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba37ec: ldp      x8, x10, [sp, #0x130] */ ARM64("ldp x8, x10, [sp, #0x130]");
    /* 0x00ba37f0: lsr      x9, x27, #0x39 */ ARM64("lsr x9, x27, #0x39");
    /* 0x00ba37f4: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba37f8: b        #0xba36f8 */ goto loc_00ba36f8;
loc_00ba37fc:
    /* 0x00ba37fc: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba3800: tbz      w12, #0x1f, #0xba3858 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba3858;
loc_00ba3804:
    /* 0x00ba3804: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba3808: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba380c: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba3810: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba3814: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba3818: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba381c: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00ba3820: mov      v0.d[0], x12 */ ARM64("mov v0.d[0], x12");
    /* 0x00ba3824: ldr      q1, [sp, #0x140] */ ARM64("ldr q1, [sp, #0x140]");
    /* 0x00ba3828: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00ba382c: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba3830: neg      x9, x11 */ ARM64("neg x9, x11");
    /* 0x00ba3834: sub      x10, x8, x11, lsl #3 */ ARM64("sub x10, x8, x11, lsl #3");
    /* 0x00ba3838: stur     w28, [x10, #-8] */ ARM64("stur w28, [x10, #-8]");
    /* 0x00ba383c: b        #0xba3790 */ goto loc_00ba3790;
loc_00ba3840:
    /* 0x00ba3840: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba3844: add      x8, sp, #0x130 */ ARM64("add x8, sp, #0x130");
    /* 0x00ba3848: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00ba384c: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba3850: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00ba3854: b        #0xba37e4 */ goto loc_00ba37e4;
loc_00ba3858:
    /* 0x00ba3858: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba385c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba3860: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba3864: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba3868: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba386c: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba3870: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba3874: b        #0xba3804 */ goto loc_00ba3804;
loc_00ba3878:
    /* 0x00ba3878: cbz      x23, #0xba3884 */ if (x23 == 0) goto loc_00ba3884;
    /* 0x00ba387c: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba3880: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba3884:
    /* 0x00ba3884: ldp      x8, x21, [sp, #0x130] */ ARM64("ldp x8, x21, [sp, #0x130]");
    /* 0x00ba3888: str      x8, [sp, #0x68] */ ARM64("str x8, [sp, #0x68]");
    /* 0x00ba388c: ldp      x9, x8, [sp, #0x148] */ ARM64("ldp x9, x8, [sp, #0x148]");
    /* 0x00ba3890: str      x9, [sp, #0xa8] */ ARM64("str x9, [sp, #0xa8]");
    /* 0x00ba3894: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00ba3898: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba389c: add      x20, x8, #8 */ ARM64("add x20, x8, #8");
    /* 0x00ba38a0: ldr      x8, [sp, #0x158] */ ARM64("ldr x8, [sp, #0x158]");
    /* 0x00ba38a4: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00ba38a8: ldr      x22, [sp, #0x40] */ ARM64("ldr x22, [sp, #0x40]");
    /* 0x00ba38ac: b        #0xba38b8 */ goto loc_00ba38b8;
loc_00ba38b0:
    /* 0x00ba38b0: add      x20, x20, #0x18 */ ARM64("add x20, x20, #0x18");
    /* 0x00ba38b4: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
loc_00ba38b8:
    /* 0x00ba38b8: cbz      x26, #0xba38d0 */ if (x26 == 0) goto loc_00ba38d0;
    /* 0x00ba38bc: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00ba38c0: cbz      x8, #0xba38b0 */ if (x8 == 0) goto loc_00ba38b0;
    /* 0x00ba38c4: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00ba38c8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba38cc: b        #0xba38b0 */ goto loc_00ba38b0;
loc_00ba38d0:
    /* 0x00ba38d0: ldr      x8, [sp, #0x70] */ ARM64("ldr x8, [sp, #0x70]");
    /* 0x00ba38d4: cbz      x8, #0xba38e0 */ if (x8 == 0) goto loc_00ba38e0;
    /* 0x00ba38d8: ldr      x0, [sp, #0x110] */ ARM64("ldr x0, [sp, #0x110]");
    /* 0x00ba38dc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba38e0:
    /* 0x00ba38e0: ldr      x9, [sp, #0x80] */ ARM64("ldr x9, [sp, #0x80]");
    /* 0x00ba38e4: ldr      x20, [sp, #0xa8] */ ARM64("ldr x20, [sp, #0xa8]");
    /* 0x00ba38e8: cbz      x9, #0xba390c */ if (x9 == 0) goto loc_00ba390c;
    /* 0x00ba38ec: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00ba38f0: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba38f4: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00ba38f8: b.eq     #0xba390c */ if (COND_EQ) goto loc_00ba390c;
    /* 0x00ba38fc: ldr      x9, [sp, #0xa0] */ ARM64("ldr x9, [sp, #0xa0]");
    /* 0x00ba3900: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba3904: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00ba3908: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba390c:
    /* 0x00ba390c: str      x21, [sp, #0xa0] */ ARM64("str x21, [sp, #0xa0]");
    /* 0x00ba3910: cbz      x22, #0xba391c */ if (x22 == 0) goto loc_00ba391c;
    /* 0x00ba3914: ldr      x0, [sp, #0x90] */ ARM64("ldr x0, [sp, #0x90]");
    /* 0x00ba3918: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba391c:
    /* 0x00ba391c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba3920: ldr      x9, [x28, #0xd8] */ ARM64("ldr x9, [x28, #0xd8]");
    /* 0x00ba3924: ldp      x23, x9, [x9, #0x20] */ ARM64("ldp x23, x9, [x9, #0x20]");
    /* 0x00ba3928: add      x25, x23, x9, lsl #5 */ ARM64("add x25, x23, x9, lsl #5");
    /* 0x00ba392c: add      x9, x28, #0x48 */ ARM64("add x9, x28, #0x48");
    /* 0x00ba3930: str      x9, [sp, #0x90] */ ARM64("str x9, [sp, #0x90]");
    /* 0x00ba3934: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba3938: adrp     x9, #0xe0e000 */ ARM64("adrp x9, #0xe0e000");
    /* 0x00ba393c: ldr      q0, [x9, #0x9e0] */ ARM64("ldr q0, [x9, #0x9e0]");
    /* 0x00ba3940: str      q0, [sp, #0xc0] */ ARM64("str q0, [sp, #0xc0]");
    /* 0x00ba3944: adrp     x9, #0xe0e000 */ ARM64("adrp x9, #0xe0e000");
    /* 0x00ba3948: mov      w10, #4 */ ARM64("mov w10, #4");
    /* 0x00ba394c: str      x10, [sp, #0x80] */ ARM64("str x10, [sp, #0x80]");
    /* 0x00ba3950: ldr      q0, [x9, #0x9f0] */ ARM64("ldr q0, [x9, #0x9f0]");
    /* 0x00ba3954: str      q0, [sp, #0xb0] */ ARM64("str q0, [sp, #0xb0]");
    /* 0x00ba3958: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba395c: str      x9, [sp, #0x70] */ ARM64("str x9, [sp, #0x70]");
    /* 0x00ba3960: b        #0xba39f0 */ goto loc_00ba39f0;
loc_00ba3964:
    /* 0x00ba3964: and      x12, x9, x24 */ ARM64("and x12, x9, x24");
    /* 0x00ba3968: ldr      x13, [x22, x12] */ ARM64("ldr x13, [x22, x12]");
    /* 0x00ba396c: eor      x9, x13, x11 */ ARM64("eor x9, x13, x11");
    /* 0x00ba3970: mov      x14, #-0x101010101010102 */ ARM64("mov x14, #-0x101010101010102");
    /* 0x00ba3974: movk     x14, #0xfeff */ ARM64("movk x14, #0xfeff");
    /* 0x00ba3978: add      x14, x9, x14 */ ARM64("add x14, x9, x14");
    /* 0x00ba397c: bic      x9, x14, x9 */ ARM64("bic x9, x14, x9");
    /* 0x00ba3980: ands     x14, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x14, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3984: b.eq     #0xba39cc */ if (COND_EQ) goto loc_00ba39cc;
loc_00ba3988:
    /* 0x00ba3988: rbit     x9, x14 */ ARM64("rbit x9, x14");
    /* 0x00ba398c: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba3990: add      x9, x12, x9, lsr #3 */ ARM64("add x9, x12, x9, lsr #3");
    /* 0x00ba3994: and      x9, x9, x24 */ ARM64("and x9, x9, x24");
    /* 0x00ba3998: sub      x9, x22, x9, lsl #3 */ ARM64("sub x9, x22, x9, lsl #3");
    /* 0x00ba399c: ldur     x9, [x9, #-8] */ ARM64("ldur x9, [x9, #-8]");
    /* 0x00ba39a0: cmp      x9, x1 */ ARM64("cmp x9, x1");
    /* 0x00ba39a4: b.hs     #0xba77dc */ if (COND_HS) goto loc_00ba77dc;
    /* 0x00ba39a8: add      x9, x8, x9, lsl #4 */ ARM64("add x9, x8, x9, lsl #4");
    /* 0x00ba39ac: ldp      w15, w9, [x9, #8] */ ARM64("ldp w15, w9, [x9, #8]");
    /* 0x00ba39b0: ldr      w16, [sp, #0x110] */ ARM64("ldr w16, [sp, #0x110]");
    /* 0x00ba39b4: cmp      w16, w15 */ ARM64("cmp w16, w15");
    /* 0x00ba39b8: ccmp     w9, w26, #0, eq */ ARM64("ccmp w9, w26, #0, eq");
    /* 0x00ba39bc: b.eq     #0xba39e4 */ if (COND_EQ) goto loc_00ba39e4;
    /* 0x00ba39c0: sub      x9, x14, #1 */ ARM64("sub x9, x14, #1");
    /* 0x00ba39c4: ands     x14, x9, x14 */ ARM64("ands x14, x9, x14");
    /* 0x00ba39c8: b.ne     #0xba3988 */ if (COND_NE) goto loc_00ba3988;
loc_00ba39cc:
    /* 0x00ba39cc: and      x9, x13, x13, lsl #1 */ ARM64("and x9, x13, x13, lsl #1");
    /* 0x00ba39d0: tst      x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba39d4: b.ne     #0xba3bf0 */ if (COND_NE) goto loc_00ba3bf0;
    /* 0x00ba39d8: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00ba39dc: add      x9, x12, x10 */ ARM64("add x9, x12, x10");
    /* 0x00ba39e0: b        #0xba3964 */ goto loc_00ba3964;
loc_00ba39e4:
    /* 0x00ba39e4: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba39e8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba39ec: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
loc_00ba39f0:
    /* 0x00ba39f0: cmp      x23, x25 */ ARM64("cmp x23, x25");
    /* 0x00ba39f4: b.eq     #0xba4000 */ if (COND_EQ) goto loc_00ba4000;
    /* 0x00ba39f8: ldr      x9, [x23], #0x20 */ ARM64("ldr x9, [x23], #0x20");
    /* 0x00ba39fc: add      x21, x8, #1 */ ARM64("add x21, x8, #1");
    /* 0x00ba3a00: cmp      x9, x24 */ ARM64("cmp x9, x24");
    /* 0x00ba3a04: mov      x26, x8 */ ARM64("mov x26, x8");
    /* 0x00ba3a08: ldr      w8, [sp, #0x78] */ ARM64("ldr w8, [sp, #0x78]");
    /* 0x00ba3a0c: ccmp     w8, w26, #4, ne */ ARM64("ccmp w8, w26, #4, ne");
    /* 0x00ba3a10: ccmp     x20, #0, #4, ne */ ARM64("ccmp x20, #0, #4, ne");
    /* 0x00ba3a14: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba3a18: b.eq     #0xba39f0 */ if (COND_EQ) goto loc_00ba39f0;
    /* 0x00ba3a1c: ldr      x0, [sp, #0x100] */ ARM64("ldr x0, [sp, #0x100]");
    /* 0x00ba3a20: ldr      x1, [sp, #0xd8] */ ARM64("ldr x1, [sp, #0xd8]");
    /* 0x00ba3a24: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00ba3a28: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba3a2c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba3a30: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba3a34: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
loc_00ba3a38:
    /* 0x00ba3a38: ldr      x9, [sp, #0xa0] */ ARM64("ldr x9, [sp, #0xa0]");
    /* 0x00ba3a3c: and      x9, x0, x9 */ ARM64("and x9, x0, x9");
    /* 0x00ba3a40: ldr      x10, [sp, #0x68] */ ARM64("ldr x10, [sp, #0x68]");
    /* 0x00ba3a44: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00ba3a48: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba3a4c: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00ba3a50: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3a54: b.eq     #0xba3a90 */ if (COND_EQ) goto loc_00ba3a90;
loc_00ba3a58:
    /* 0x00ba3a58: rbit     x11, x10 */ ARM64("rbit x11, x10");
    /* 0x00ba3a5c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba3a60: add      x11, x9, x11, lsr #3 */ ARM64("add x11, x9, x11, lsr #3");
    /* 0x00ba3a64: ldr      x12, [sp, #0xa0] */ ARM64("ldr x12, [sp, #0xa0]");
    /* 0x00ba3a68: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00ba3a6c: ldr      x12, [sp, #0x68] */ ARM64("ldr x12, [sp, #0x68]");
    /* 0x00ba3a70: sub      x11, x12, x11, lsl #3 */ ARM64("sub x11, x12, x11, lsl #3");
    /* 0x00ba3a74: ldur     w12, [x11, #-8] */ ARM64("ldur w12, [x11, #-8]");
    /* 0x00ba3a78: cmp      w12, w26 */ ARM64("cmp w12, w26");
    /* 0x00ba3a7c: b.eq     #0xba3ab0 */ if (COND_EQ) goto loc_00ba3ab0;
    /* 0x00ba3a80: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00ba3a84: ands     x10, x11, x10 */ ARM64("ands x10, x11, x10");
    /* 0x00ba3a88: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba3a8c: b.ne     #0xba3a58 */ if (COND_NE) goto loc_00ba3a58;
loc_00ba3a90:
    /* 0x00ba3a90: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba3a94: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba3a98: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba3a9c: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00ba3aa0: tbnz     w10, #0, #0xba3be8 */ if (((w10 >> #0) & 1) != 0) goto loc_00ba3be8;
    /* 0x00ba3aa4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba3aa8: add      x0, x9, x8 */ ARM64("add x0, x9, x8");
    /* 0x00ba3aac: b        #0xba3a38 */ goto loc_00ba3a38;
loc_00ba3ab0:
    /* 0x00ba3ab0: ldur     q0, [x28, #0xc8] */ ARM64("ldur q0, [x28, #0xc8]");
    /* 0x00ba3ab4: dup      v1.2d, v0.d[0] */ ARM64("dup v1.2d, v0.d[0]");
    /* 0x00ba3ab8: ldur     w9, [x11, #-4] */ ARM64("ldur w9, [x11, #-4]");
    /* 0x00ba3abc: ldp      q3, q2, [sp, #0xb0] */ ARM64("ldp q3, q2, [sp, #0xb0]");
    /* 0x00ba3ac0: eor      v1.16b, v1.16b, v2.16b */ ARM64("eor v1.16b, v1.16b, v2.16b");
    /* 0x00ba3ac4: dup      v2.2d, v0.d[1] */ ARM64("dup v2.2d, v0.d[1]");
    /* 0x00ba3ac8: eor      v2.16b, v2.16b, v3.16b */ ARM64("eor v2.16b, v2.16b, v3.16b");
    /* 0x00ba3acc: stp      q1, q2, [sp, #0x130] */ ARM64("stp q1, q2, [sp, #0x130]");
    /* 0x00ba3ad0: str      q0, [sp, #0x150] */ ARM64("str q0, [sp, #0x150]");
    /* 0x00ba3ad4: add      x8, sp, #0x130 */ ARM64("add x8, sp, #0x130");
    /* 0x00ba3ad8: stp      xzr, xzr, [x8, #0x38] */ ARM64("stp xzr, xzr, [x8, #0x38]");
    /* 0x00ba3adc: stur     xzr, [x8, #0x30] */ ARM64("stur xzr, [x8, #0x30]");
    /* 0x00ba3ae0: str      w9, [sp, #0x110] */ ARM64("str w9, [sp, #0x110]");
    /* 0x00ba3ae4: str      w9, [sp, #0x2d0] */ ARM64("str w9, [sp, #0x2d0]");
    /* 0x00ba3ae8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba3aec: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba3af0: mov      w2, #4 */ ARM64("mov w2, #4");
    /* 0x00ba3af4: bl       #0xbd9e78 */ CALL_DIRECT(sub_00bd9e78);
    /* 0x00ba3af8: str      w26, [sp, #0x2d0] */ ARM64("str w26, [sp, #0x2d0]");
    /* 0x00ba3afc: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba3b00: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba3b04: mov      w2, #4 */ ARM64("mov w2, #4");
    /* 0x00ba3b08: bl       #0xbd9e78 */ CALL_DIRECT(sub_00bd9e78);
    /* 0x00ba3b0c: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00ba3b10: ldp      x8, x9, [sp, #0x130] */ ARM64("ldp x8, x9, [sp, #0x130]");
    /* 0x00ba3b14: ldp      x11, x12, [sp, #0x140] */ ARM64("ldp x11, x12, [sp, #0x140]");
    /* 0x00ba3b18: ldp      x13, x14, [sp, #0x160] */ ARM64("ldp x13, x14, [sp, #0x160]");
    /* 0x00ba3b1c: orr      x13, x14, x13, lsl #56 */ ARM64("orr x13, x14, x13, lsl #56");
    /* 0x00ba3b20: eor      x12, x13, x12 */ ARM64("eor x12, x13, x12");
    /* 0x00ba3b24: add      x8, x11, x8 */ ARM64("add x8, x11, x8");
    /* 0x00ba3b28: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba3b2c: eor      x11, x8, x11, ror #51 */ ARM64("eor x11, x8, x11, ror #51");
    /* 0x00ba3b30: eor      x12, x9, x12, ror #48 */ ARM64("eor x12, x9, x12, ror #48");
    /* 0x00ba3b34: ror      x8, x8, #0x20 */ ARM64("ror x8, x8, #0x20");
    /* 0x00ba3b38: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00ba3b3c: add      x8, x12, x8 */ ARM64("add x8, x12, x8");
    /* 0x00ba3b40: eor      x11, x9, x11, ror #47 */ ARM64("eor x11, x9, x11, ror #47");
    /* 0x00ba3b44: eor      x12, x8, x12, ror #43 */ ARM64("eor x12, x8, x12, ror #43");
    /* 0x00ba3b48: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba3b4c: eor      x8, x8, x13 */ ARM64("eor x8, x8, x13");
    /* 0x00ba3b50: eor      x9, x9, #0xff */ ARM64("eor x9, x9, #0xff");
    /* 0x00ba3b54: add      x8, x8, x11 */ ARM64("add x8, x8, x11");
    /* 0x00ba3b58: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba3b5c: eor      x11, x8, x11, ror #51 */ ARM64("eor x11, x8, x11, ror #51");
    /* 0x00ba3b60: ror      x8, x8, #0x20 */ ARM64("ror x8, x8, #0x20");
    /* 0x00ba3b64: eor      x12, x9, x12, ror #48 */ ARM64("eor x12, x9, x12, ror #48");
    /* 0x00ba3b68: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00ba3b6c: add      x8, x12, x8 */ ARM64("add x8, x12, x8");
    /* 0x00ba3b70: eor      x11, x9, x11, ror #47 */ ARM64("eor x11, x9, x11, ror #47");
    /* 0x00ba3b74: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba3b78: eor      x12, x8, x12, ror #43 */ ARM64("eor x12, x8, x12, ror #43");
    /* 0x00ba3b7c: add      x8, x11, x8 */ ARM64("add x8, x11, x8");
    /* 0x00ba3b80: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba3b84: eor      x11, x8, x11, ror #51 */ ARM64("eor x11, x8, x11, ror #51");
    /* 0x00ba3b88: ror      x8, x8, #0x20 */ ARM64("ror x8, x8, #0x20");
    /* 0x00ba3b8c: eor      x12, x9, x12, ror #48 */ ARM64("eor x12, x9, x12, ror #48");
    /* 0x00ba3b90: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00ba3b94: add      x8, x12, x8 */ ARM64("add x8, x12, x8");
    /* 0x00ba3b98: eor      x11, x9, x11, ror #47 */ ARM64("eor x11, x9, x11, ror #47");
    /* 0x00ba3b9c: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba3ba0: eor      x12, x8, x12, ror #43 */ ARM64("eor x12, x8, x12, ror #43");
    /* 0x00ba3ba4: add      x8, x11, x8 */ ARM64("add x8, x11, x8");
    /* 0x00ba3ba8: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba3bac: eor      x8, x8, x11, ror #51 */ ARM64("eor x8, x8, x11, ror #51");
    /* 0x00ba3bb0: eor      x11, x9, x12, ror #48 */ ARM64("eor x11, x9, x12, ror #48");
    /* 0x00ba3bb4: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba3bb8: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00ba3bbc: eor      x8, x11, x8, ror #47 */ ARM64("eor x8, x11, x8, ror #47");
    /* 0x00ba3bc0: eor      x8, x8, x9, ror #32 */ ARM64("eor x8, x8, x9, ror #32");
    /* 0x00ba3bc4: mov      x11, x28 */ ARM64("mov x11, x28");
    /* 0x00ba3bc8: eor      x28, x8, x9 */ ARM64("eor x28, x8, x9");
    /* 0x00ba3bcc: ldp      x8, x1, [x11, #0x98] */ ARM64("ldp x8, x1, [x11, #0x98]");
    /* 0x00ba3bd0: ldp      x22, x24, [x11, #0xa8] */ ARM64("ldp x22, x24, [x11, #0xa8]");
    /* 0x00ba3bd4: lsr      x27, x28, #0x39 */ ARM64("lsr x27, x28, #0x39");
    /* 0x00ba3bd8: mov      x9, #0x101010101010101 */ ARM64("mov x9, #0x101010101010101");
    /* 0x00ba3bdc: mul      x11, x27, x9 */ ARM64("mul x11, x27, x9");
    /* 0x00ba3be0: mov      x9, x28 */ ARM64("mov x9, x28");
    /* 0x00ba3be4: b        #0xba3964 */ goto loc_00ba3964;
loc_00ba3be8:
    /* 0x00ba3be8: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba3bec: b        #0xba39f0 */ goto loc_00ba39f0;
loc_00ba3bf0:
    /* 0x00ba3bf0: and      x9, x24, x28 */ ARM64("and x9, x24, x28");
    /* 0x00ba3bf4: ldr      x10, [x22, x9] */ ARM64("ldr x10, [x22, x9]");
    /* 0x00ba3bf8: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3bfc: b.ne     #0xba3c1c */ if (COND_NE) goto loc_00ba3c1c;
    /* 0x00ba3c00: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00ba3c04:
    /* 0x00ba3c04: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00ba3c08: and      x9, x9, x24 */ ARM64("and x9, x9, x24");
    /* 0x00ba3c0c: ldr      x10, [x22, x9] */ ARM64("ldr x10, [x22, x9]");
    /* 0x00ba3c10: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba3c14: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3c18: b.eq     #0xba3c04 */ if (COND_EQ) goto loc_00ba3c04;
loc_00ba3c1c:
    /* 0x00ba3c1c: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba3c20: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba3c24: add      x9, x9, x10, lsr #3 */ ARM64("add x9, x9, x10, lsr #3");
    /* 0x00ba3c28: and      x0, x9, x24 */ ARM64("and x0, x9, x24");
    /* 0x00ba3c2c: ldrsb    w20, [x22, x0] */ ARM64("ldrsb w20, [x22, x0]");
    /* 0x00ba3c30: tbz      w20, #0x1f, #0xba3f98 */ if (((w20 >> #0x1f) & 1) == 0) goto loc_00ba3f98;
    /* 0x00ba3c34: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba3c38: ldr      x9, [x9, #0xb8] */ ARM64("ldr x9, [x9, #0xb8]");
    /* 0x00ba3c3c: cbnz     x9, #0xba3c44 */ if (x9 != 0) goto loc_00ba3c44;
loc_00ba3c40:
    /* 0x00ba3c40: tbnz     w20, #0, #0xba3fc0 */ if (((w20 >> #0) & 1) != 0) goto loc_00ba3fc0;
loc_00ba3c44:
    /* 0x00ba3c44: and      x8, x20, #1 */ ARM64("and x8, x20, #1");
    /* 0x00ba3c48: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba3c4c: ldr      x10, [sp, #0x128] */ ARM64("ldr x10, [sp, #0x128]");
    /* 0x00ba3c50: str      x8, [x10, #0xb8] */ ARM64("str x8, [x10, #0xb8]");
    /* 0x00ba3c54: sub      x8, x0, #8 */ ARM64("sub x8, x0, #8");
    /* 0x00ba3c58: and      x8, x24, x8 */ ARM64("and x8, x24, x8");
    /* 0x00ba3c5c: strb     w27, [x22, x0] */ ARM64("strb w27, [x22, x0]");
    /* 0x00ba3c60: ldr      x9, [x10, #0xa8] */ ARM64("ldr x9, [x10, #0xa8]");
    /* 0x00ba3c64: add      x8, x9, x8 */ ARM64("add x8, x9, x8");
    /* 0x00ba3c68: strb     w27, [x8, #8] */ ARM64("strb w27, [x8, #8]");
    /* 0x00ba3c6c: ldr      x8, [x10, #0xc0] */ ARM64("ldr x8, [x10, #0xc0]");
    /* 0x00ba3c70: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba3c74: str      x8, [x10, #0xc0] */ ARM64("str x8, [x10, #0xc0]");
    /* 0x00ba3c78: ldr      x8, [x10, #0xa8] */ ARM64("ldr x8, [x10, #0xa8]");
    /* 0x00ba3c7c: sub      x8, x8, x0, lsl #3 */ ARM64("sub x8, x8, x0, lsl #3");
    /* 0x00ba3c80: stur     x1, [x8, #-8] */ ARM64("stur x1, [x8, #-8]");
    /* 0x00ba3c84: ldr      x22, [x10, #0x90] */ ARM64("ldr x22, [x10, #0x90]");
    /* 0x00ba3c88: ldr      x20, [x10, #0xa0] */ ARM64("ldr x20, [x10, #0xa0]");
    /* 0x00ba3c8c: cmp      x1, x22 */ ARM64("cmp x1, x22");
    /* 0x00ba3c90: b.ne     #0xba3cbc */ if (COND_NE) goto loc_00ba3cbc;
    /* 0x00ba3c94: ldp      x9, x8, [x10, #0xb8] */ ARM64("ldp x9, x8, [x10, #0xb8]");
    /* 0x00ba3c98: add      x22, x9, x8 */ ARM64("add x22, x9, x8");
    /* 0x00ba3c9c: sub      x8, x22, x20 */ ARM64("sub x8, x22, x20");
    /* 0x00ba3ca0: sub      x9, x1, x20 */ ARM64("sub x9, x1, x20");
    /* 0x00ba3ca4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba3ca8: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba3cac: b.hi     #0xba3f50 */ if (COND_HI) goto loc_00ba3f50;
    /* 0x00ba3cb0: cmp      x20, x1 */ ARM64("cmp x20, x1");
    /* 0x00ba3cb4: b.eq     #0xba3cc8 */ if (COND_EQ) goto loc_00ba3cc8;
    /* 0x00ba3cb8: b        #0xba3cd4 */ goto loc_00ba3cd4;
loc_00ba3cbc:
    /* 0x00ba3cbc: mov      x24, #-0x8000000000000000 */ ARM64("mov x24, #-0x8000000000000000");
    /* 0x00ba3cc0: cmp      x20, x22 */ ARM64("cmp x20, x22");
    /* 0x00ba3cc4: b.ne     #0xba3cd4 */ if (COND_NE) goto loc_00ba3cd4;
loc_00ba3cc8:
    /* 0x00ba3cc8: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba3ccc: add      x0, x8, #0x90 */ ARM64("add x0, x8, #0x90");
    /* 0x00ba3cd0: bl       #0xc6c28c */ CALL_DIRECT(sub_00c6c28c);
loc_00ba3cd4:
    /* 0x00ba3cd4: ldr      x22, [sp, #0x128] */ ARM64("ldr x22, [sp, #0x128]");
    /* 0x00ba3cd8: ldr      x8, [x22, #0x98] */ ARM64("ldr x8, [x22, #0x98]");
    /* 0x00ba3cdc: add      x8, x8, x20, lsl #4 */ ARM64("add x8, x8, x20, lsl #4");
    /* 0x00ba3ce0: str      x28, [x8] */ ARM64("str x28, [x8]");
    /* 0x00ba3ce4: ldr      w27, [sp, #0x110] */ ARM64("ldr w27, [sp, #0x110]");
    /* 0x00ba3ce8: stp      w27, w26, [x8, #8] */ ARM64("stp w27, w26, [x8, #8]");
    /* 0x00ba3cec: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba3cf0: str      x8, [x22, #0xa0] */ ARM64("str x8, [x22, #0xa0]");
    /* 0x00ba3cf4: ldp      x0, x1, [x22, #0x80] */ ARM64("ldp x0, x1, [x22, #0x80]");
    /* 0x00ba3cf8: mov      x2, x27 */ ARM64("mov x2, x27");
    /* 0x00ba3cfc: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba3d00: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba3d04: ldp      x10, x1, [x22, #0x50] */ ARM64("ldp x10, x1, [x22, #0x50]");
    /* 0x00ba3d08: ldp      x11, x12, [x22, #0x60] */ ARM64("ldp x11, x12, [x22, #0x60]");
    /* 0x00ba3d0c: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba3d10: mov      x13, #0x101010101010101 */ ARM64("mov x13, #0x101010101010101");
    /* 0x00ba3d14: mul      x13, x9, x13 */ ARM64("mul x13, x9, x13");
    /* 0x00ba3d18: mov      x9, x0 */ ARM64("mov x9, x0");
loc_00ba3d1c:
    /* 0x00ba3d1c: and      x14, x9, x12 */ ARM64("and x14, x9, x12");
    /* 0x00ba3d20: ldr      x15, [x11, x14] */ ARM64("ldr x15, [x11, x14]");
    /* 0x00ba3d24: eor      x9, x15, x13 */ ARM64("eor x9, x15, x13");
    /* 0x00ba3d28: mov      x16, #-0x101010101010102 */ ARM64("mov x16, #-0x101010101010102");
    /* 0x00ba3d2c: movk     x16, #0xfeff */ ARM64("movk x16, #0xfeff");
    /* 0x00ba3d30: add      x16, x9, x16 */ ARM64("add x16, x9, x16");
    /* 0x00ba3d34: bic      x9, x16, x9 */ ARM64("bic x9, x16, x9");
    /* 0x00ba3d38: ands     x16, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x16, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3d3c: b.eq     #0xba3d84 */ if (COND_EQ) goto loc_00ba3d84;
loc_00ba3d40:
    /* 0x00ba3d40: rbit     x9, x16 */ ARM64("rbit x9, x16");
    /* 0x00ba3d44: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba3d48: add      x9, x14, x9, lsr #3 */ ARM64("add x9, x14, x9, lsr #3");
    /* 0x00ba3d4c: and      x9, x9, x12 */ ARM64("and x9, x9, x12");
    /* 0x00ba3d50: sub      x9, x11, x9, lsl #3 */ ARM64("sub x9, x11, x9, lsl #3");
    /* 0x00ba3d54: ldur     x9, [x9, #-8] */ ARM64("ldur x9, [x9, #-8]");
    /* 0x00ba3d58: cmp      x9, x1 */ ARM64("cmp x9, x1");
    /* 0x00ba3d5c: b.hs     #0xba77dc */ if (COND_HS) goto loc_00ba77dc;
    /* 0x00ba3d60: mov      w17, #0x28 */ ARM64("mov w17, #0x28");
    /* 0x00ba3d64: madd     x22, x9, x17, x10 */ ARM64("madd x22, x9, x17, x10");
    /* 0x00ba3d68: ldr      w9, [x22, #0x20] */ ARM64("ldr w9, [x22, #0x20]");
    /* 0x00ba3d6c: cmp      w27, w9 */ ARM64("cmp w27, w9");
    /* 0x00ba3d70: b.eq     #0xba3ddc */ if (COND_EQ) goto loc_00ba3ddc;
    /* 0x00ba3d74: sub      x9, x16, #1 */ ARM64("sub x9, x16, #1");
    /* 0x00ba3d78: ands     x16, x9, x16 */ ARM64("ands x16, x9, x16");
    /* 0x00ba3d7c: ldr      w27, [sp, #0x110] */ ARM64("ldr w27, [sp, #0x110]");
    /* 0x00ba3d80: b.ne     #0xba3d40 */ if (COND_NE) goto loc_00ba3d40;
loc_00ba3d84:
    /* 0x00ba3d84: and      x9, x15, x15, lsl #1 */ ARM64("and x9, x15, x15, lsl #1");
    /* 0x00ba3d88: tst      x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3d8c: b.ne     #0xba3d9c */ if (COND_NE) goto loc_00ba3d9c;
    /* 0x00ba3d90: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba3d94: add      x9, x14, x8 */ ARM64("add x9, x14, x8");
    /* 0x00ba3d98: b        #0xba3d1c */ goto loc_00ba3d1c;
loc_00ba3d9c:
    /* 0x00ba3d9c: str      w27, [sp, #0x148] */ ARM64("str w27, [sp, #0x148]");
    /* 0x00ba3da0: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba3da4: stp      x8, x0, [sp, #0x138] */ ARM64("stp x8, x0, [sp, #0x138]");
    /* 0x00ba3da8: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00ba3dac: str      x20, [sp, #0x130] */ ARM64("str x20, [sp, #0x130]");
    /* 0x00ba3db0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba3db4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba3db8: cbz      x0, #0xba78b0 */ if (x0 == 0) goto loc_00ba78b0;
    /* 0x00ba3dbc: str      x20, [sp, #0x2d0] */ ARM64("str x20, [sp, #0x2d0]");
    /* 0x00ba3dc0: str      x0, [sp, #0x2d8] */ ARM64("str x0, [sp, #0x2d8]");
    /* 0x00ba3dc4: str      xzr, [sp, #0x2e0] */ ARM64("str xzr, [sp, #0x2e0]");
    /* 0x00ba3dc8: add      x8, sp, #0x130 */ ARM64("add x8, sp, #0x130");
    /* 0x00ba3dcc: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00ba3dd0: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba3dd4: bl       #0xbd9b00 */ CALL_DIRECT(sub_00bd9b00);
    /* 0x00ba3dd8: mov      x22, x0 */ ARM64("mov x22, x0");
loc_00ba3ddc:
    /* 0x00ba3ddc: ldr      x20, [x22, #0x10] */ ARM64("ldr x20, [x22, #0x10]");
    /* 0x00ba3de0: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00ba3de4: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba3de8: b.ne     #0xba3df4 */ if (COND_NE) goto loc_00ba3df4;
    /* 0x00ba3dec: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba3df0: bl       #0xc739b8 */ CALL_DIRECT(sub_00c739b8);
loc_00ba3df4:
    /* 0x00ba3df4: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00ba3df8: add      x8, x8, x20, lsl #3 */ ARM64("add x8, x8, x20, lsl #3");
    /* 0x00ba3dfc: str      w26, [x8] */ ARM64("str w26, [x8]");
    /* 0x00ba3e00: strb     wzr, [x8, #4] */ ARM64("strb wzr, [x8, #4]");
    /* 0x00ba3e04: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba3e08: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
    /* 0x00ba3e0c: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba3e10: ldr      w9, [sp, #0x110] */ ARM64("ldr w9, [sp, #0x110]");
    /* 0x00ba3e14: cmp      w9, w26 */ ARM64("cmp w9, w26");
    /* 0x00ba3e18: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba3e1c: ldr      x20, [sp, #0xa8] */ ARM64("ldr x20, [sp, #0xa8]");
    /* 0x00ba3e20: b.eq     #0xba39f0 */ if (COND_EQ) goto loc_00ba39f0;
    /* 0x00ba3e24: ldp      x0, x1, [x28, #0x80] */ ARM64("ldp x0, x1, [x28, #0x80]");
    /* 0x00ba3e28: mov      x2, x26 */ ARM64("mov x2, x26");
    /* 0x00ba3e2c: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba3e30: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba3e34: ldp      x10, x1, [x28, #0x50] */ ARM64("ldp x10, x1, [x28, #0x50]");
    /* 0x00ba3e38: ldp      x11, x12, [x28, #0x60] */ ARM64("ldp x11, x12, [x28, #0x60]");
    /* 0x00ba3e3c: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00ba3e40: mov      x13, #0x101010101010101 */ ARM64("mov x13, #0x101010101010101");
    /* 0x00ba3e44: mul      x13, x9, x13 */ ARM64("mul x13, x9, x13");
    /* 0x00ba3e48: mov      x9, x0 */ ARM64("mov x9, x0");
loc_00ba3e4c:
    /* 0x00ba3e4c: and      x14, x9, x12 */ ARM64("and x14, x9, x12");
    /* 0x00ba3e50: ldr      x15, [x11, x14] */ ARM64("ldr x15, [x11, x14]");
    /* 0x00ba3e54: eor      x9, x15, x13 */ ARM64("eor x9, x15, x13");
    /* 0x00ba3e58: mov      x16, #-0x101010101010102 */ ARM64("mov x16, #-0x101010101010102");
    /* 0x00ba3e5c: movk     x16, #0xfeff */ ARM64("movk x16, #0xfeff");
    /* 0x00ba3e60: add      x16, x9, x16 */ ARM64("add x16, x9, x16");
    /* 0x00ba3e64: bic      x9, x16, x9 */ ARM64("bic x9, x16, x9");
    /* 0x00ba3e68: ands     x16, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x16, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3e6c: b.eq     #0xba3eb0 */ if (COND_EQ) goto loc_00ba3eb0;
loc_00ba3e70:
    /* 0x00ba3e70: rbit     x9, x16 */ ARM64("rbit x9, x16");
    /* 0x00ba3e74: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba3e78: add      x9, x14, x9, lsr #3 */ ARM64("add x9, x14, x9, lsr #3");
    /* 0x00ba3e7c: and      x9, x9, x12 */ ARM64("and x9, x9, x12");
    /* 0x00ba3e80: sub      x9, x11, x9, lsl #3 */ ARM64("sub x9, x11, x9, lsl #3");
    /* 0x00ba3e84: ldur     x9, [x9, #-8] */ ARM64("ldur x9, [x9, #-8]");
    /* 0x00ba3e88: cmp      x9, x1 */ ARM64("cmp x9, x1");
    /* 0x00ba3e8c: b.hs     #0xba77dc */ if (COND_HS) goto loc_00ba77dc;
    /* 0x00ba3e90: mov      w17, #0x28 */ ARM64("mov w17, #0x28");
    /* 0x00ba3e94: madd     x22, x9, x17, x10 */ ARM64("madd x22, x9, x17, x10");
    /* 0x00ba3e98: ldr      w9, [x22, #0x20] */ ARM64("ldr w9, [x22, #0x20]");
    /* 0x00ba3e9c: cmp      w9, w26 */ ARM64("cmp w9, w26");
    /* 0x00ba3ea0: b.eq     #0xba3f08 */ if (COND_EQ) goto loc_00ba3f08;
    /* 0x00ba3ea4: sub      x9, x16, #1 */ ARM64("sub x9, x16, #1");
    /* 0x00ba3ea8: ands     x16, x9, x16 */ ARM64("ands x16, x9, x16");
    /* 0x00ba3eac: b.ne     #0xba3e70 */ if (COND_NE) goto loc_00ba3e70;
loc_00ba3eb0:
    /* 0x00ba3eb0: and      x9, x15, x15, lsl #1 */ ARM64("and x9, x15, x15, lsl #1");
    /* 0x00ba3eb4: tst      x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba3eb8: b.ne     #0xba3ec8 */ if (COND_NE) goto loc_00ba3ec8;
    /* 0x00ba3ebc: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba3ec0: add      x9, x14, x8 */ ARM64("add x9, x14, x8");
    /* 0x00ba3ec4: b        #0xba3e4c */ goto loc_00ba3e4c;
loc_00ba3ec8:
    /* 0x00ba3ec8: str      w26, [sp, #0x148] */ ARM64("str w26, [sp, #0x148]");
    /* 0x00ba3ecc: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba3ed0: stp      x8, x0, [sp, #0x138] */ ARM64("stp x8, x0, [sp, #0x138]");
    /* 0x00ba3ed4: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00ba3ed8: str      x20, [sp, #0x130] */ ARM64("str x20, [sp, #0x130]");
    /* 0x00ba3edc: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba3ee0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba3ee4: cbz      x0, #0xba78b0 */ if (x0 == 0) goto loc_00ba78b0;
    /* 0x00ba3ee8: str      x20, [sp, #0x2d0] */ ARM64("str x20, [sp, #0x2d0]");
    /* 0x00ba3eec: str      x0, [sp, #0x2d8] */ ARM64("str x0, [sp, #0x2d8]");
    /* 0x00ba3ef0: str      xzr, [sp, #0x2e0] */ ARM64("str xzr, [sp, #0x2e0]");
    /* 0x00ba3ef4: add      x8, sp, #0x130 */ ARM64("add x8, sp, #0x130");
    /* 0x00ba3ef8: add      x0, x8, #8 */ ARM64("add x0, x8, #8");
    /* 0x00ba3efc: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba3f00: bl       #0xbd9b00 */ CALL_DIRECT(sub_00bd9b00);
    /* 0x00ba3f04: mov      x22, x0 */ ARM64("mov x22, x0");
loc_00ba3f08:
    /* 0x00ba3f08: ldr      x20, [x22, #0x10] */ ARM64("ldr x20, [x22, #0x10]");
    /* 0x00ba3f0c: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00ba3f10: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba3f14: b.ne     #0xba3f20 */ if (COND_NE) goto loc_00ba3f20;
    /* 0x00ba3f18: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba3f1c: bl       #0xc739b8 */ CALL_DIRECT(sub_00c739b8);
loc_00ba3f20:
    /* 0x00ba3f20: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00ba3f24: add      x8, x8, x20, lsl #3 */ ARM64("add x8, x8, x20, lsl #3");
    /* 0x00ba3f28: ldr      w9, [sp, #0x110] */ ARM64("ldr w9, [sp, #0x110]");
    /* 0x00ba3f2c: str      w9, [x8] */ ARM64("str w9, [x8]");
    /* 0x00ba3f30: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00ba3f34: strb     w9, [x8, #4] */ ARM64("strb w9, [x8, #4]");
    /* 0x00ba3f38: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba3f3c: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
    /* 0x00ba3f40: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba3f44: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba3f48: ldr      x20, [sp, #0xa8] */ ARM64("ldr x20, [sp, #0xa8]");
    /* 0x00ba3f4c: b        #0xba39f0 */ goto loc_00ba39f0;
loc_00ba3f50:
    /* 0x00ba3f50: cmp      x22, x20 */ ARM64("cmp x22, x20");
    /* 0x00ba3f54: b.lo     #0xba78ac */ if (COND_LO) goto loc_00ba78ac;
    /* 0x00ba3f58: ldr      x20, [sp, #0x128] */ ARM64("ldr x20, [sp, #0x128]");
    /* 0x00ba3f5c: ldr      x2, [x20, #0x98] */ ARM64("ldr x2, [x20, #0x98]");
    /* 0x00ba3f60: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba3f64: mov      x3, x22 */ ARM64("mov x3, x22");
    /* 0x00ba3f68: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00ba3f6c: mov      w5, #0x10 */ ARM64("mov w5, #0x10");
    /* 0x00ba3f70: bl       #0xc6c158 */ CALL_DIRECT(sub_00c6c158);
    /* 0x00ba3f74: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba3f78: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00ba3f7c: b.eq     #0xba79f0 */ if (COND_EQ) goto loc_00ba79f0;
    /* 0x00ba3f80: ldr      x8, [sp, #0x138] */ ARM64("ldr x8, [sp, #0x138]");
    /* 0x00ba3f84: stp      x22, x8, [x20, #0x90] */ ARM64("stp x22, x8, [x20, #0x90]");
    /* 0x00ba3f88: ldr      x20, [x20, #0xa0] */ ARM64("ldr x20, [x20, #0xa0]");
    /* 0x00ba3f8c: cmp      x20, x22 */ ARM64("cmp x20, x22");
    /* 0x00ba3f90: b.eq     #0xba3cc8 */ if (COND_EQ) goto loc_00ba3cc8;
    /* 0x00ba3f94: b        #0xba3cd4 */ goto loc_00ba3cd4;
loc_00ba3f98:
    /* 0x00ba3f98: ldr      x9, [x22] */ ARM64("ldr x9, [x22]");
    /* 0x00ba3f9c: and      x9, x9, #0x8080808080808080 */ ARM64("and x9, x9, #0x8080808080808080");
    /* 0x00ba3fa0: rbit     x9, x9 */ ARM64("rbit x9, x9");
    /* 0x00ba3fa4: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba3fa8: lsr      x0, x9, #3 */ ARM64("lsr x0, x9, #3");
    /* 0x00ba3fac: ldrb     w20, [x22, x0] */ ARM64("ldrb w20, [x22, x0]");
    /* 0x00ba3fb0: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba3fb4: ldr      x9, [x9, #0xb8] */ ARM64("ldr x9, [x9, #0xb8]");
    /* 0x00ba3fb8: cbz      x9, #0xba3c40 */ if (x9 == 0) goto loc_00ba3c40;
    /* 0x00ba3fbc: b        #0xba3c44 */ goto loc_00ba3c44;
loc_00ba3fc0:
    /* 0x00ba3fc0: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba3fc4: add      x0, x9, #0xa8 */ ARM64("add x0, x9, #0xa8");
    /* 0x00ba3fc8: mov      x2, x1 */ ARM64("mov x2, x1");
    /* 0x00ba3fcc: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00ba3fd0: str      x2, [sp, #0x50] */ ARM64("str x2, [sp, #0x50]");
    /* 0x00ba3fd4: bl       #0xc73374 */ CALL_DIRECT(sub_00c73374);
    /* 0x00ba3fd8: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba3fdc: ldp      x22, x24, [x8, #0xa8] */ ARM64("ldp x22, x24, [x8, #0xa8]");
    /* 0x00ba3fe0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba3fe4: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba3fe8: mov      x2, x28 */ ARM64("mov x2, x28");
    /* 0x00ba3fec: bl       #0xbd72f8 */ CALL_DIRECT(sub_00bd72f8);
    /* 0x00ba3ff0: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba3ff4: ldr      x9, [x8, #0xb8] */ ARM64("ldr x9, [x8, #0xb8]");
    /* 0x00ba3ff8: ldr      x1, [sp, #0x50] */ ARM64("ldr x1, [sp, #0x50]");
    /* 0x00ba3ffc: b        #0xba3c44 */ goto loc_00ba3c44;
loc_00ba4000:
    /* 0x00ba4000: ldr      x1, [x28, #0x78] */ ARM64("ldr x1, [x28, #0x78]");
    /* 0x00ba4004: ldr      x8, [x28, #0x1d0] */ ARM64("ldr x8, [x28, #0x1d0]");
    /* 0x00ba4008: cmp      x1, x8 */ ARM64("cmp x1, x8");
    /* 0x00ba400c: b.hi     #0xba75c0 */ if (COND_HI) goto loc_00ba75c0;
loc_00ba4010:
    /* 0x00ba4010: ldp      x8, x9, [x28, #0x50] */ ARM64("ldp x8, x9, [x28, #0x50]");
    /* 0x00ba4014: mov      w20, #0x28 */ ARM64("mov w20, #0x28");
    /* 0x00ba4018: madd     x21, x9, x20, x8 */ ARM64("madd x21, x9, x20, x8");
    /* 0x00ba401c: add      x24, sp, #0x130 */ ARM64("add x24, sp, #0x130");
    /* 0x00ba4020: mov      x25, #0x101010101010101 */ ARM64("mov x25, #0x101010101010101");
    /* 0x00ba4024: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00ba4028: b.ne     #0xba4180 */ if (COND_NE) goto loc_00ba4180;
loc_00ba402c:
    /* 0x00ba402c: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba4030: ldr      w9, [x8, #0x78] */ ARM64("ldr w9, [x8, #0x78]");
    /* 0x00ba4034: cmp      w9, #1 */ ARM64("cmp w9, #1");
    /* 0x00ba4038: b.ne     #0xba75d0 */ if (COND_NE) goto loc_00ba75d0;
    /* 0x00ba403c: ldr      w2, [x8, #0x7c] */ ARM64("ldr w2, [x8, #0x7c]");
    /* 0x00ba4040: ldr      x1, [x28, #0x78] */ ARM64("ldr x1, [x28, #0x78]");
    /* 0x00ba4044: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba4048: bl       #0xbda350 */ CALL_DIRECT(sub_00bda350);
    /* 0x00ba404c: str      xzr, [sp, #0x110] */ ARM64("str xzr, [sp, #0x110]");
    /* 0x00ba4050: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba4054: add      x9, x8, #0x440 */ ARM64("add x9, x8, #0x440");
    /* 0x00ba4058: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba405c: add      x8, x8, #0x488 */ ARM64("add x8, x8, #0x488");
    /* 0x00ba4060: stp      x8, x9, [sp, #0x38] */ ARM64("stp x8, x9, [sp, #0x38]");
    /* 0x00ba4064: adrp     x8, #0xe07000 */ ARM64("adrp x8, #0xe07000");
    /* 0x00ba4068: add      x9, x8, #0x4d3 */ ARM64("add x9, x8, #0x4d3");
    /* 0x00ba406c: mov      w8, #0x26 */ ARM64("mov w8, #0x26");
    /* 0x00ba4070: stp      x8, x9, [sp, #0x28] */ ARM64("stp x8, x9, [sp, #0x28]");
    /* 0x00ba4074: adrp     x8, #0xefb000 */ ARM64("adrp x8, #0xefb000");
    /* 0x00ba4078: add      x8, x8, #0xb78 */ ARM64("add x8, x8, #0xb78");
    /* 0x00ba407c: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
    /* 0x00ba4080: adrp     x8, #0xcbe000 */ ARM64("adrp x8, #0xcbe000");
    /* 0x00ba4084: mov      w9, #0x90 */ ARM64("mov w9, #0x90");
    /* 0x00ba4088: dup      v0.2d, x9 */ ARM64("dup v0.2d, x9");
    /* 0x00ba408c: str      q0, [sp, #0x90] */ ARM64("str q0, [sp, #0x90]");
    /* 0x00ba4090: ldr      q0, [x8, #0x900] */ ARM64("ldr q0, [x8, #0x900]");
    /* 0x00ba4094: str      q0, [sp, #0x50] */ ARM64("str q0, [sp, #0x50]");
    /* 0x00ba4098: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00ba409c: dup      v0.2d, x8 */ ARM64("dup v0.2d, x8");
    /* 0x00ba40a0: str      q0, [sp, #0x80] */ ARM64("str q0, [sp, #0x80]");
    /* 0x00ba40a4: ldr      x25, [sp, #0xa0] */ ARM64("ldr x25, [sp, #0xa0]");
    /* 0x00ba40a8: b        #0xba45b8 */ goto loc_00ba45b8;
loc_00ba40ac:
    /* 0x00ba40ac: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba40b0: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba40b4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba40b8: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba40bc: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba40c0: b.eq     #0xba40f4 */ if (COND_EQ) goto loc_00ba40f4;
loc_00ba40c4:
    /* 0x00ba40c4: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba40c8: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba40cc: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba40d0: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba40d4: mneg     x16, x16, x20 */ ARM64("mneg x16, x16, x20");
    /* 0x00ba40d8: add      x16, x8, x16 */ ARM64("add x16, x8, x16");
    /* 0x00ba40dc: ldur     w17, [x16, #-0x28] */ ARM64("ldur w17, [x16, #-0x28]");
    /* 0x00ba40e0: cmp      x27, x17 */ ARM64("cmp x27, x17");
    /* 0x00ba40e4: b.eq     #0xba4144 */ if (COND_EQ) goto loc_00ba4144;
    /* 0x00ba40e8: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba40ec: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba40f0: b.ne     #0xba40c4 */ if (COND_NE) goto loc_00ba40c4;
loc_00ba40f4:
    /* 0x00ba40f4: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba40f8: b.eq     #0xba4118 */ if (COND_EQ) goto loc_00ba4118;
    /* 0x00ba40fc: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba4100: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba4104: cbz      x11, #0xba4134 */ if (x11 == 0) goto loc_00ba4134;
    /* 0x00ba4108: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba410c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba4110: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba4114: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba4118:
    /* 0x00ba4118: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba411c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba4120: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba4124: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba4128: tbnz     w13, #0, #0xba4500 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba4500;
    /* 0x00ba412c: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba4130: b        #0xba4138 */ goto loc_00ba4138;
loc_00ba4134:
    /* 0x00ba4134: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba4138:
    /* 0x00ba4138: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba413c: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba4140: b        #0xba40ac */ goto loc_00ba40ac;
loc_00ba4144:
    /* 0x00ba4144: ldp      x8, x10, [x16, #-0x20] */ ARM64("ldp x8, x10, [x16, #-0x20]");
    /* 0x00ba4148: stp      x23, x22, [x16, #-0x20] */ ARM64("stp x23, x22, [x16, #-0x20]");
    /* 0x00ba414c: ldr      q0, [sp, #0x240] */ ARM64("ldr q0, [sp, #0x240]");
    /* 0x00ba4150: stur     q0, [x16, #-0x10] */ ARM64("stur q0, [x16, #-0x10]");
    /* 0x00ba4154: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba4158: ccmp     x10, #0, #4, ne */ ARM64("ccmp x10, #0, #4, ne");
    /* 0x00ba415c: lsl      x9, x10, #2 */ ARM64("lsl x9, x10, #2");
    /* 0x00ba4160: add      x9, x9, #0xb */ ARM64("add x9, x9, #0xb");
    /* 0x00ba4164: and      x9, x9, #0xfffffffffffffff8 */ ARM64("and x9, x9, #0xfffffffffffffff8");
    /* 0x00ba4168: add      x10, x10, x9 */ ARM64("add x10, x10, x9");
    /* 0x00ba416c: ccmn     x10, #9, #4, ne */ ARM64("ccmn x10, #9, #4, ne");
    /* 0x00ba4170: b.ne     #0xba455c */ if (COND_NE) goto loc_00ba455c;
    /* 0x00ba4174: mov      x8, x26 */ ARM64("mov x8, x26");
    /* 0x00ba4178: cmp      x26, x21 */ ARM64("cmp x26, x21");
    /* 0x00ba417c: b.eq     #0xba402c */ if (COND_EQ) goto loc_00ba402c;
loc_00ba4180:
    /* 0x00ba4180: add      x26, x8, #0x28 */ ARM64("add x26, x8, #0x28");
    /* 0x00ba4184: ldr      w27, [x8, #0x20] */ ARM64("ldr w27, [x8, #0x20]");
    /* 0x00ba4188: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba418c: stp      q1, q0, [sp, #0x130] */ ARM64("stp q1, q0, [sp, #0x130]");
    /* 0x00ba4190: mov      x8, x27 */ ARM64("mov x8, x27");
loc_00ba4194:
    /* 0x00ba4194: ldr      x9, [x28, #0x78] */ ARM64("ldr x9, [x28, #0x78]");
    /* 0x00ba4198: cbz      x9, #0xba4328 */ if (x9 == 0) goto loc_00ba4328;
    /* 0x00ba419c: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba41a0: ldp      x10, x11, [x28, #0x80] */ ARM64("ldp x10, x11, [x28, #0x80]");
    /* 0x00ba41a4: mov      x12, #0x6575 */ ARM64("mov x12, #0x6575");
    /* 0x00ba41a8: movk     x12, #0x7073, lsl #16 */ ARM64("movk x12, #0x7073, lsl #16");
    /* 0x00ba41ac: movk     x12, #0x6d65, lsl #32 */ ARM64("movk x12, #0x6d65, lsl #32");
    /* 0x00ba41b0: movk     x12, #0x736f, lsl #48 */ ARM64("movk x12, #0x736f, lsl #48");
    /* 0x00ba41b4: eor      x12, x10, x12 */ ARM64("eor x12, x10, x12");
    /* 0x00ba41b8: mov      x13, #0x6f6d */ ARM64("mov x13, #0x6f6d");
    /* 0x00ba41bc: movk     x13, #0x6e64, lsl #16 */ ARM64("movk x13, #0x6e64, lsl #16");
    /* 0x00ba41c0: movk     x13, #0x7261, lsl #32 */ ARM64("movk x13, #0x7261, lsl #32");
    /* 0x00ba41c4: movk     x13, #0x646f, lsl #48 */ ARM64("movk x13, #0x646f, lsl #48");
    /* 0x00ba41c8: eor      x13, x11, x13 */ ARM64("eor x13, x11, x13");
    /* 0x00ba41cc: mov      x14, #0x7261 */ ARM64("mov x14, #0x7261");
    /* 0x00ba41d0: movk     x14, #0x6e65, lsl #16 */ ARM64("movk x14, #0x6e65, lsl #16");
    /* 0x00ba41d4: movk     x14, #0x6765, lsl #32 */ ARM64("movk x14, #0x6765, lsl #32");
    /* 0x00ba41d8: movk     x14, #0x6c79, lsl #48 */ ARM64("movk x14, #0x6c79, lsl #48");
    /* 0x00ba41dc: eor      x10, x10, x14 */ ARM64("eor x10, x10, x14");
    /* 0x00ba41e0: orr      x14, x8, #0x400000000000000 */ ARM64("orr x14, x8, #0x400000000000000");
    /* 0x00ba41e4: mov      x15, #0x6573 */ ARM64("mov x15, #0x6573");
    /* 0x00ba41e8: movk     x15, #0x7974, lsl #16 */ ARM64("movk x15, #0x7974, lsl #16");
    /* 0x00ba41ec: movk     x15, #0x6462, lsl #32 */ ARM64("movk x15, #0x6462, lsl #32");
    /* 0x00ba41f0: movk     x15, #0x7465, lsl #48 */ ARM64("movk x15, #0x7465, lsl #48");
    /* 0x00ba41f4: eor      x15, x14, x15 */ ARM64("eor x15, x14, x15");
    /* 0x00ba41f8: eor      x11, x11, x15 */ ARM64("eor x11, x11, x15");
    /* 0x00ba41fc: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00ba4200: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00ba4204: eor      x13, x12, x13, ror #51 */ ARM64("eor x13, x12, x13, ror #51");
    /* 0x00ba4208: eor      x11, x10, x11, ror #48 */ ARM64("eor x11, x10, x11, ror #48");
    /* 0x00ba420c: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00ba4210: add      x10, x10, x13 */ ARM64("add x10, x10, x13");
    /* 0x00ba4214: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00ba4218: eor      x13, x10, x13, ror #47 */ ARM64("eor x13, x10, x13, ror #47");
    /* 0x00ba421c: eor      x11, x12, x11, ror #43 */ ARM64("eor x11, x12, x11, ror #43");
    /* 0x00ba4220: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00ba4224: eor      x12, x12, x14 */ ARM64("eor x12, x12, x14");
    /* 0x00ba4228: eor      x10, x10, #0xff */ ARM64("eor x10, x10, #0xff");
    /* 0x00ba422c: add      x12, x12, x13 */ ARM64("add x12, x12, x13");
    /* 0x00ba4230: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00ba4234: eor      x13, x12, x13, ror #51 */ ARM64("eor x13, x12, x13, ror #51");
    /* 0x00ba4238: eor      x11, x10, x11, ror #48 */ ARM64("eor x11, x10, x11, ror #48");
    /* 0x00ba423c: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00ba4240: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00ba4244: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00ba4248: eor      x13, x10, x13, ror #47 */ ARM64("eor x13, x10, x13, ror #47");
    /* 0x00ba424c: eor      x11, x12, x11, ror #43 */ ARM64("eor x11, x12, x11, ror #43");
    /* 0x00ba4250: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00ba4254: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00ba4258: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00ba425c: eor      x13, x12, x13, ror #51 */ ARM64("eor x13, x12, x13, ror #51");
    /* 0x00ba4260: eor      x11, x10, x11, ror #48 */ ARM64("eor x11, x10, x11, ror #48");
    /* 0x00ba4264: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00ba4268: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00ba426c: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00ba4270: eor      x13, x10, x13, ror #47 */ ARM64("eor x13, x10, x13, ror #47");
    /* 0x00ba4274: eor      x11, x12, x11, ror #43 */ ARM64("eor x11, x12, x11, ror #43");
    /* 0x00ba4278: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00ba427c: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00ba4280: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00ba4284: eor      x12, x12, x13, ror #51 */ ARM64("eor x12, x12, x13, ror #51");
    /* 0x00ba4288: eor      x11, x10, x11, ror #48 */ ARM64("eor x11, x10, x11, ror #48");
    /* 0x00ba428c: add      x10, x12, x10 */ ARM64("add x10, x12, x10");
    /* 0x00ba4290: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00ba4294: eor      x11, x11, x12, ror #47 */ ARM64("eor x11, x11, x12, ror #47");
    /* 0x00ba4298: eor      x11, x11, x10, ror #32 */ ARM64("eor x11, x11, x10, ror #32");
    /* 0x00ba429c: eor      x14, x11, x10 */ ARM64("eor x14, x11, x10");
    /* 0x00ba42a0: ldp      x10, x1, [x28, #0x50] */ ARM64("ldp x10, x1, [x28, #0x50]");
    /* 0x00ba42a4: ldp      x11, x12, [x28, #0x60] */ ARM64("ldp x11, x12, [x28, #0x60]");
    /* 0x00ba42a8: lsr      x13, x14, #0x39 */ ARM64("lsr x13, x14, #0x39");
    /* 0x00ba42ac: mul      x13, x13, x25 */ ARM64("mul x13, x13, x25");
loc_00ba42b0:
    /* 0x00ba42b0: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00ba42b4: ldr      x15, [x11, x14] */ ARM64("ldr x15, [x11, x14]");
    /* 0x00ba42b8: eor      x16, x15, x13 */ ARM64("eor x16, x15, x13");
    /* 0x00ba42bc: mov      x17, #-0x101010101010102 */ ARM64("mov x17, #-0x101010101010102");
    /* 0x00ba42c0: movk     x17, #0xfeff */ ARM64("movk x17, #0xfeff");
    /* 0x00ba42c4: add      x17, x16, x17 */ ARM64("add x17, x16, x17");
    /* 0x00ba42c8: bic      x16, x17, x16 */ ARM64("bic x16, x17, x16");
    /* 0x00ba42cc: ands     x16, x16, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x16, x16, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba42d0: b.eq     #0xba4310 */ if (COND_EQ) goto loc_00ba4310;
loc_00ba42d4:
    /* 0x00ba42d4: rbit     x17, x16 */ ARM64("rbit x17, x16");
    /* 0x00ba42d8: clz      x17, x17 */ ARM64("clz x17, x17");
    /* 0x00ba42dc: add      x17, x14, x17, lsr #3 */ ARM64("add x17, x14, x17, lsr #3");
    /* 0x00ba42e0: and      x17, x17, x12 */ ARM64("and x17, x17, x12");
    /* 0x00ba42e4: sub      x17, x11, x17, lsl #3 */ ARM64("sub x17, x11, x17, lsl #3");
    /* 0x00ba42e8: ldur     x0, [x17, #-8] */ ARM64("ldur x0, [x17, #-8]");
    /* 0x00ba42ec: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00ba42f0: b.hs     #0xba7760 */ if (COND_HS) goto loc_00ba7760;
    /* 0x00ba42f4: madd     x17, x0, x20, x10 */ ARM64("madd x17, x0, x20, x10");
    /* 0x00ba42f8: ldr      w0, [x17, #0x20] */ ARM64("ldr w0, [x17, #0x20]");
    /* 0x00ba42fc: cmp      x8, x0 */ ARM64("cmp x8, x0");
    /* 0x00ba4300: b.eq     #0xba4334 */ if (COND_EQ) goto loc_00ba4334;
    /* 0x00ba4304: sub      x17, x16, #1 */ ARM64("sub x17, x16, #1");
    /* 0x00ba4308: ands     x16, x17, x16 */ ARM64("ands x16, x17, x16");
    /* 0x00ba430c: b.ne     #0xba42d4 */ if (COND_NE) goto loc_00ba42d4;
loc_00ba4310:
    /* 0x00ba4310: and      x15, x15, x15, lsl #1 */ ARM64("and x15, x15, x15, lsl #1");
    /* 0x00ba4314: tst      x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba4318: b.ne     #0xba4328 */ if (COND_NE) goto loc_00ba4328;
    /* 0x00ba431c: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00ba4320: add      x14, x14, x9 */ ARM64("add x14, x14, x9");
    /* 0x00ba4324: b        #0xba42b0 */ goto loc_00ba42b0;
loc_00ba4328:
    /* 0x00ba4328: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00ba432c: mov      w11, #4 */ ARM64("mov w11, #4");
    /* 0x00ba4330: b        #0xba433c */ goto loc_00ba433c;
loc_00ba4334:
    /* 0x00ba4334: ldp      x11, x9, [x17, #8] */ ARM64("ldp x11, x9, [x17, #8]");
    /* 0x00ba4338: add      x9, x11, x9, lsl #3 */ ARM64("add x9, x11, x9, lsl #3");
loc_00ba433c:
    /* 0x00ba433c: cmp      x11, x9 */ ARM64("cmp x11, x9");
    /* 0x00ba4340: b.eq     #0xba44d0 */ if (COND_EQ) goto loc_00ba44d0;
    /* 0x00ba4344: add      x10, x11, #8 */ ARM64("add x10, x11, #8");
    /* 0x00ba4348: ldr      w22, [x11] */ ARM64("ldr w22, [x11]");
    /* 0x00ba434c: ldrb     w11, [x11, #4] */ ARM64("ldrb w11, [x11, #4]");
    /* 0x00ba4350: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba4354: ccmp     w11, #0, #0, ne */ ARM64("ccmp w11, #0, #0, ne");
    /* 0x00ba4358: mov      x11, x10 */ ARM64("mov x11, x10");
    /* 0x00ba435c: b.eq     #0xba433c */ if (COND_EQ) goto loc_00ba433c;
loc_00ba4360:
    /* 0x00ba4360: cmp      x10, x9 */ ARM64("cmp x10, x9");
    /* 0x00ba4364: b.eq     #0xba4384 */ if (COND_EQ) goto loc_00ba4384;
    /* 0x00ba4368: ldr      w11, [x10] */ ARM64("ldr w11, [x10]");
    /* 0x00ba436c: ldrb     w12, [x10, #4] */ ARM64("ldrb w12, [x10, #4]");
    /* 0x00ba4370: add      x10, x10, #8 */ ARM64("add x10, x10, #8");
    /* 0x00ba4374: cmp      x11, x8 */ ARM64("cmp x11, x8");
    /* 0x00ba4378: ccmp     w12, #0, #0, ne */ ARM64("ccmp w12, #0, #0, ne");
    /* 0x00ba437c: b.eq     #0xba4360 */ if (COND_EQ) goto loc_00ba4360;
    /* 0x00ba4380: b        #0xba44d0 */ goto loc_00ba44d0;
loc_00ba4384:
    /* 0x00ba4384: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba4388: cbz      x8, #0xba449c */ if (x8 == 0) goto loc_00ba449c;
loc_00ba438c:
    /* 0x00ba438c: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba4390: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba4394: mul      x14, x22, x19 */ ARM64("mul x14, x22, x19");
    /* 0x00ba4398: ldp      x8, x10, [sp, #0x130] */ ARM64("ldp x8, x10, [sp, #0x130]");
    /* 0x00ba439c: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba43a0: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba43a4: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba43a8: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba43ac: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba43b0: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba43b4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba43b8: b.eq     #0xba43e8 */ if (COND_EQ) goto loc_00ba43e8;
loc_00ba43bc:
    /* 0x00ba43bc: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba43c0: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba43c4: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba43c8: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba43cc: sub      x16, x8, x16, lsl #2 */ ARM64("sub x16, x8, x16, lsl #2");
    /* 0x00ba43d0: ldur     w16, [x16, #-4] */ ARM64("ldur w16, [x16, #-4]");
    /* 0x00ba43d4: cmp      x22, x16 */ ARM64("cmp x22, x16");
    /* 0x00ba43d8: b.eq     #0xba4450 */ if (COND_EQ) goto loc_00ba4450;
    /* 0x00ba43dc: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba43e0: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba43e4: b.ne     #0xba43bc */ if (COND_NE) goto loc_00ba43bc;
loc_00ba43e8:
    /* 0x00ba43e8: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba43ec: b.eq     #0xba440c */ if (COND_EQ) goto loc_00ba440c;
    /* 0x00ba43f0: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba43f4: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba43f8: cbz      x11, #0xba4428 */ if (x11 == 0) goto loc_00ba4428;
    /* 0x00ba43fc: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba4400: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba4404: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba4408: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba440c:
    /* 0x00ba440c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba4410: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba4414: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba4418: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba441c: tbnz     w13, #0, #0xba4458 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba4458;
    /* 0x00ba4420: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba4424: b        #0xba442c */ goto loc_00ba442c;
loc_00ba4428:
    /* 0x00ba4428: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba442c:
    /* 0x00ba442c: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba4430: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00ba4434: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba4438: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba443c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba4440: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba4444: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba4448: b.ne     #0xba43bc */ if (COND_NE) goto loc_00ba43bc;
    /* 0x00ba444c: b        #0xba43e8 */ goto loc_00ba43e8;
loc_00ba4450:
    /* 0x00ba4450: mov      x8, x22 */ ARM64("mov x8, x22");
    /* 0x00ba4454: b        #0xba4194 */ goto loc_00ba4194;
loc_00ba4458:
    /* 0x00ba4458: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba445c: tbz      w12, #0x1f, #0xba44b0 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba44b0;
loc_00ba4460:
    /* 0x00ba4460: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba4464: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba4468: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba446c: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba4470: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba4474: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba4478: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00ba447c: mov      v0.d[0], x12 */ ARM64("mov v0.d[0], x12");
    /* 0x00ba4480: ldr      q1, [sp, #0x140] */ ARM64("ldr q1, [sp, #0x140]");
    /* 0x00ba4484: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00ba4488: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba448c: sub      x8, x8, x11, lsl #2 */ ARM64("sub x8, x8, x11, lsl #2");
    /* 0x00ba4490: stur     w22, [x8, #-4] */ ARM64("stur w22, [x8, #-4]");
    /* 0x00ba4494: mov      x8, x22 */ ARM64("mov x8, x22");
    /* 0x00ba4498: b        #0xba4194 */ goto loc_00ba4194;
loc_00ba449c:
    /* 0x00ba449c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba44a0: add      x2, x24, #0x20 */ ARM64("add x2, x24, #0x20");
    /* 0x00ba44a4: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba44a8: bl       #0xc7031c */ CALL_DIRECT(sub_00c7031c);
    /* 0x00ba44ac: b        #0xba438c */ goto loc_00ba438c;
loc_00ba44b0:
    /* 0x00ba44b0: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba44b4: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba44b8: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba44bc: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba44c0: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba44c4: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba44c8: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba44cc: b        #0xba4460 */ goto loc_00ba4460;
loc_00ba44d0:
    /* 0x00ba44d0: ldp      x23, x22, [sp, #0x130] */ ARM64("ldp x23, x22, [sp, #0x130]");
    /* 0x00ba44d4: ldur     q0, [x24, #0x10] */ ARM64("ldur q0, [x24, #0x10]");
    /* 0x00ba44d8: str      q0, [sp, #0x240] */ ARM64("str q0, [sp, #0x240]");
    /* 0x00ba44dc: ldr      x8, [x28, #0x1d0] */ ARM64("ldr x8, [x28, #0x1d0]");
    /* 0x00ba44e0: cbz      x8, #0xba4574 */ if (x8 == 0) goto loc_00ba4574;
loc_00ba44e4:
    /* 0x00ba44e4: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba44e8: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba44ec: mul      x14, x27, x19 */ ARM64("mul x14, x27, x19");
    /* 0x00ba44f0: ldp      x8, x10, [x28, #0x1c0] */ ARM64("ldp x8, x10, [x28, #0x1c0]");
    /* 0x00ba44f4: lsr      x9, x14, #0x39 */ ARM64("lsr x9, x14, #0x39");
    /* 0x00ba44f8: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba44fc: b        #0xba40ac */ goto loc_00ba40ac;
loc_00ba4500:
    /* 0x00ba4500: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba4504: tbz      w12, #0x1f, #0xba4588 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba4588;
loc_00ba4508:
    /* 0x00ba4508: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba450c: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba4510: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba4514: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba4518: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba451c: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba4520: ldr      q0, [x28, #0x1d0] */ ARM64("ldr q0, [x28, #0x1d0]");
    /* 0x00ba4524: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba4528: mov      v1.d[0], x12 */ ARM64("mov v1.d[0], x12");
    /* 0x00ba452c: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba4530: str      q0, [x28, #0x1d0] */ ARM64("str q0, [x28, #0x1d0]");
    /* 0x00ba4534: mneg     x9, x11, x20 */ ARM64("mneg x9, x11, x20");
    /* 0x00ba4538: add      x8, x8, x9 */ ARM64("add x8, x8, x9");
    /* 0x00ba453c: stur     w27, [x8, #-0x28] */ ARM64("stur w27, [x8, #-0x28]");
    /* 0x00ba4540: stp      x23, x22, [x8, #-0x20] */ ARM64("stp x23, x22, [x8, #-0x20]");
    /* 0x00ba4544: ldr      q0, [sp, #0x240] */ ARM64("ldr q0, [sp, #0x240]");
    /* 0x00ba4548: stur     q0, [x8, #-0x10] */ ARM64("stur q0, [x8, #-0x10]");
    /* 0x00ba454c: mov      x8, x26 */ ARM64("mov x8, x26");
    /* 0x00ba4550: cmp      x26, x21 */ ARM64("cmp x26, x21");
    /* 0x00ba4554: b.ne     #0xba4180 */ if (COND_NE) goto loc_00ba4180;
    /* 0x00ba4558: b        #0xba402c */ goto loc_00ba402c;
loc_00ba455c:
    /* 0x00ba455c: sub      x0, x8, x9 */ ARM64("sub x0, x8, x9");
    /* 0x00ba4560: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba4564: mov      x8, x26 */ ARM64("mov x8, x26");
    /* 0x00ba4568: cmp      x26, x21 */ ARM64("cmp x26, x21");
    /* 0x00ba456c: b.ne     #0xba4180 */ if (COND_NE) goto loc_00ba4180;
    /* 0x00ba4570: b        #0xba402c */ goto loc_00ba402c;
loc_00ba4574:
    /* 0x00ba4574: add      x0, x28, #0x1c0 */ ARM64("add x0, x28, #0x1c0");
    /* 0x00ba4578: add      x2, x28, #0x1e0 */ ARM64("add x2, x28, #0x1e0");
    /* 0x00ba457c: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba4580: bl       #0xc6ec00 */ CALL_DIRECT(sub_00c6ec00);
    /* 0x00ba4584: b        #0xba44e4 */ goto loc_00ba44e4;
loc_00ba4588:
    /* 0x00ba4588: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba458c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba4590: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba4594: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba4598: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba459c: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba45a0: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba45a4: b        #0xba4508 */ goto loc_00ba4508;
loc_00ba45a8:
    /* 0x00ba45a8: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba45ac: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba45b0: str      x8, [sp, #0x110] */ ARM64("str x8, [sp, #0x110]");
    /* 0x00ba45b4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
loc_00ba45b8:
    /* 0x00ba45b8: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba45bc: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba45c0: add      x1, x8, #0x18 */ ARM64("add x1, x8, #0x18");
    /* 0x00ba45c4: bl       #0xbda430 */ CALL_DIRECT(sub_00bda430);
    /* 0x00ba45c8: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x00ba45cc: b.ne     #0xba5284 */ if (COND_NE) goto loc_00ba5284;
    /* 0x00ba45d0: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba45d4: ldr      x11, [x8, #0xd8] */ ARM64("ldr x11, [x8, #0xd8]");
    /* 0x00ba45d8: ldr      w8, [x11, #0x78] */ ARM64("ldr w8, [x11, #0x78]");
    /* 0x00ba45dc: tbz      w8, #0, #0xba77c0 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba77c0;
    /* 0x00ba45e0: mov      x28, x1 */ ARM64("mov x28, x1");
    /* 0x00ba45e4: ldr      w8, [x11, #0x7c] */ ARM64("ldr w8, [x11, #0x7c]");
    /* 0x00ba45e8: cmp      w1, w8 */ ARM64("cmp w1, w8");
    /* 0x00ba45ec: ldp      q7, q6, [sp, #0x80] */ ARM64("ldp q7, q6, [sp, #0x80]");
    /* 0x00ba45f0: b.ne     #0xba462c */ if (COND_NE) goto loc_00ba462c;
    /* 0x00ba45f4: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba45f8: cbnz     x8, #0xba7830 */ if (x8 != 0) goto loc_00ba7830;
    /* 0x00ba45fc: ldr      x8, [x11, #0x28] */ ARM64("ldr x8, [x11, #0x28]");
    /* 0x00ba4600: mov      w16, w28 */ ARM64("mov w16, w28");
    /* 0x00ba4604: cmp      x8, x16 */ ARM64("cmp x8, x16");
    /* 0x00ba4608: b.ls     #0xba4624 */ if (COND_LS) goto loc_00ba4624;
    /* 0x00ba460c: ldr      x8, [x11, #0x20] */ ARM64("ldr x8, [x11, #0x20]");
    /* 0x00ba4610: add      x8, x8, x16, lsl #5 */ ARM64("add x8, x8, x16, lsl #5");
    /* 0x00ba4614: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba4618: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba461c: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba4620: b.ne     #0xba4634 */ if (COND_NE) goto loc_00ba4634;
loc_00ba4624:
    /* 0x00ba4624: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba4628: b        #0xba4640 */ goto loc_00ba4640;
loc_00ba462c:
    /* 0x00ba462c: mov      w24, w28 */ ARM64("mov w24, w28");
    /* 0x00ba4630: b        #0xba49ac */ goto loc_00ba49ac;
loc_00ba4634:
    /* 0x00ba4634: ldr      w8, [x8, #0x1c] */ ARM64("ldr w8, [x8, #0x1c]");
    /* 0x00ba4638: mov      w9, #-1 */ ARM64("mov w9, #-1");
    /* 0x00ba463c: orr      x8, x9, x8, lsl #32 */ ARM64("orr x8, x9, x8, lsl #32");
loc_00ba4640:
    /* 0x00ba4640: ldp      x9, x10, [x11, #0x38] */ ARM64("ldp x9, x10, [x11, #0x38]");
loc_00ba4644:
    /* 0x00ba4644: mov      w13, w8 */ ARM64("mov w13, w8");
    /* 0x00ba4648: cmp      x10, x13 */ ARM64("cmp x10, x13");
    /* 0x00ba464c: b.ls     #0xba466c */ if (COND_LS) goto loc_00ba466c;
    /* 0x00ba4650: mov      w12, w8 */ ARM64("mov w12, w8");
    /* 0x00ba4654: mov      w14, #0x30 */ ARM64("mov w14, #0x30");
    /* 0x00ba4658: umaddl   x13, w13, w14, x9 */ ARM64("umaddl x13, w13, w14, x9");
    /* 0x00ba465c: ldr      w13, [x13, #0x20] */ ARM64("ldr w13, [x13, #0x20]");
    /* 0x00ba4660: and      x8, x8, #0xffffffff00000000 */ ARM64("and x8, x8, #0xffffffff00000000");
    /* 0x00ba4664: orr      x8, x8, x13 */ ARM64("orr x8, x8, x13");
    /* 0x00ba4668: b        #0xba4694 */ goto loc_00ba4694;
loc_00ba466c:
    /* 0x00ba466c: lsr      x13, x8, #0x20 */ ARM64("lsr x13, x8, #0x20");
loc_00ba4670:
    /* 0x00ba4670: cmp      x10, x13 */ ARM64("cmp x10, x13");
    /* 0x00ba4674: b.ls     #0xba46e4 */ if (COND_LS) goto loc_00ba46e4;
    /* 0x00ba4678: mov      x12, x13 */ ARM64("mov x12, x13");
    /* 0x00ba467c: mov      w13, #0x30 */ ARM64("mov w13, #0x30");
    /* 0x00ba4680: madd     x14, x12, x13, x9 */ ARM64("madd x14, x12, x13, x9");
    /* 0x00ba4684: ldp      w13, w14, [x14, #0x24] */ ARM64("ldp w13, w14, [x14, #0x24]");
    /* 0x00ba4688: bfi      x8, x13, #0x20, #0x20 */ ARM64("bfi x8, x13, #0x20, #0x20");
    /* 0x00ba468c: cmn      w14, #1 */ ARM64("cmn w14, #1");
    /* 0x00ba4690: b.eq     #0xba4670 */ if (COND_EQ) goto loc_00ba4670;
loc_00ba4694:
    /* 0x00ba4694: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba4698: b.ls     #0xba7808 */ if (COND_LS) goto loc_00ba7808;
    /* 0x00ba469c: mov      w13, #0x30 */ ARM64("mov w13, #0x30");
    /* 0x00ba46a0: madd     x13, x12, x13, x9 */ ARM64("madd x13, x12, x13, x9");
    /* 0x00ba46a4: ldr      x14, [x13] */ ARM64("ldr x14, [x13]");
    /* 0x00ba46a8: mov      x15, #-0x8000000000000000 */ ARM64("mov x15, #-0x8000000000000000");
    /* 0x00ba46ac: cmp      x14, x15 */ ARM64("cmp x14, x15");
    /* 0x00ba46b0: b.eq     #0xba7808 */ if (COND_EQ) goto loc_00ba7808;
    /* 0x00ba46b4: ldr      w13, [x13, #0x2c] */ ARM64("ldr w13, [x13, #0x2c]");
    /* 0x00ba46b8: cmp      w13, w28 */ ARM64("cmp w13, w28");
    /* 0x00ba46bc: b.ne     #0xba4644 */ if (COND_NE) goto loc_00ba4644;
    /* 0x00ba46c0: mov      w13, #0x30 */ ARM64("mov w13, #0x30");
    /* 0x00ba46c4: madd     x12, x12, x13, x9 */ ARM64("madd x12, x12, x13, x9");
    /* 0x00ba46c8: ldr      x13, [x12] */ ARM64("ldr x13, [x12]");
    /* 0x00ba46cc: mov      x14, #-0x8000000000000000 */ ARM64("mov x14, #-0x8000000000000000");
    /* 0x00ba46d0: cmp      x13, x14 */ ARM64("cmp x13, x14");
    /* 0x00ba46d4: b.eq     #0xba77fc */ if (COND_EQ) goto loc_00ba77fc;
    /* 0x00ba46d8: ldr      x12, [x12, #0x10] */ ARM64("ldr x12, [x12, #0x10]");
    /* 0x00ba46dc: cbz      x12, #0xba4644 */ if (x12 == 0) goto loc_00ba4644;
    /* 0x00ba46e0: b        #0xba7814 */ goto loc_00ba7814;
loc_00ba46e4:
    /* 0x00ba46e4: str      x16, [sp, #0xb0] */ ARM64("str x16, [sp, #0xb0]");
    /* 0x00ba46e8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba46ec: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00ba46f0: ldr      x10, [sp, #0x128] */ ARM64("ldr x10, [sp, #0x128]");
    /* 0x00ba46f4: ldp      x27, x9, [x10, #0xe0] */ ARM64("ldp x27, x9, [x10, #0xe0]");
    /* 0x00ba46f8: add      x9, x27, x9 */ ARM64("add x9, x27, x9");
    /* 0x00ba46fc: add      x12, x9, #1 */ ARM64("add x12, x9, #1");
    /* 0x00ba4700: ldr      d0, [x27] */ ARM64("ldr d0, [x27]");
    /* 0x00ba4704: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba4708: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00ba470c: add      x21, x27, #8 */ ARM64("add x21, x27, #8");
    /* 0x00ba4710: and      x25, x9, #0x8080808080808080 */ ARM64("and x25, x9, #0x8080808080808080");
    /* 0x00ba4714: ldr      x14, [x10, #0xf8] */ ARM64("ldr x14, [x10, #0xf8]");
    /* 0x00ba4718: ldp      x9, x10, [x10, #8] */ ARM64("ldp x9, x10, [x10, #8]");
    /* 0x00ba471c: mov      w13, #0x18 */ ARM64("mov w13, #0x18");
    /* 0x00ba4720: madd     x13, x10, x13, x9 */ ARM64("madd x13, x10, x13, x9");
    /* 0x00ba4724: ldp      x10, x11, [x11, #8] */ ARM64("ldp x10, x11, [x11, #8]");
    /* 0x00ba4728: add      x11, x10, x11, lsl #3 */ ARM64("add x11, x10, x11, lsl #3");
    /* 0x00ba472c: str      xzr, [sp, #0x130] */ ARM64("str xzr, [sp, #0x130]");
    /* 0x00ba4730: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
    /* 0x00ba4734: stp      x9, x13, [sp, #0x180] */ ARM64("stp x9, x13, [sp, #0x180]");
    /* 0x00ba4738: str      x13, [sp, #0xd8] */ ARM64("str x13, [sp, #0xd8]");
    /* 0x00ba473c: stp      x27, x25, [sp, #0x190] */ ARM64("stp x27, x25, [sp, #0x190]");
    /* 0x00ba4740: stp      x21, x12, [sp, #0x1a0] */ ARM64("stp x21, x12, [sp, #0x1a0]");
    /* 0x00ba4744: mov      x24, x14 */ ARM64("mov x24, x14");
    /* 0x00ba4748: stp      x14, x10, [sp, #0x1b0] */ ARM64("stp x14, x10, [sp, #0x1b0]");
    /* 0x00ba474c: str      x11, [sp, #0x100] */ ARM64("str x11, [sp, #0x100]");
    /* 0x00ba4750: stp      x11, xzr, [sp, #0x1c0] */ ARM64("stp x11, xzr, [sp, #0x1c0]");
    /* 0x00ba4754: ldr      x11, [sp, #0x150] */ ARM64("ldr x11, [sp, #0x150]");
    /* 0x00ba4758: str      x11, [sp, #0xc0] */ ARM64("str x11, [sp, #0xc0]");
    /* 0x00ba475c: cmp      x23, #3 */ ARM64("cmp x23, #3");
    /* 0x00ba4760: b.eq     #0xba4990 */ if (COND_EQ) goto loc_00ba4990;
    /* 0x00ba4764: b        #0xba4800 */ goto loc_00ba4800;
loc_00ba4768:
    /* 0x00ba4768: add      x26, x10, #8 */ ARM64("add x26, x10, #8");
    /* 0x00ba476c: str      x26, [sp, #0x1b8] */ ARM64("str x26, [sp, #0x1b8]");
    /* 0x00ba4770: mov      x20, x9 */ ARM64("mov x20, x9");
    /* 0x00ba4774: mov      w23, #3 */ ARM64("mov w23, #3");
    /* 0x00ba4778: mov      x9, x10 */ ARM64("mov x9, x10");
loc_00ba477c:
    /* 0x00ba477c: add      x22, x8, #1 */ ARM64("add x22, x8, #1");
    /* 0x00ba4780: str      x22, [sp, #0x1c8] */ ARM64("str x22, [sp, #0x1c8]");
    /* 0x00ba4784: ldr      x2, [x9] */ ARM64("ldr x2, [x9]");
    /* 0x00ba4788: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba478c: ldr      x9, [x9, #0x198] */ ARM64("ldr x9, [x9, #0x198]");
    /* 0x00ba4790: cbz      x9, #0xba47b4 */ if (x9 == 0) goto loc_00ba47b4;
    /* 0x00ba4794: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba4798: add      x10, x2, #8 */ ARM64("add x10, x2, #8");
    /* 0x00ba479c: mul      x12, x10, x19 */ ARM64("mul x12, x10, x19");
    /* 0x00ba47a0: lsr      x13, x12, #0x39 */ ARM64("lsr x13, x12, #0x39");
    /* 0x00ba47a4: ldr      x11, [sp, #0x128] */ ARM64("ldr x11, [sp, #0x128]");
    /* 0x00ba47a8: ldp      x11, x10, [x11, #0x180] */ ARM64("ldp x11, x10, [x11, #0x180]");
    /* 0x00ba47ac: dup      v0.8b, w13 */ ARM64("dup v0.8b, w13");
    /* 0x00ba47b0: b        #0xba4910 */ goto loc_00ba4910;
loc_00ba47b4:
    /* 0x00ba47b4: ldxr     x9, [x2] */ ARM64("ldxr x9, [x2]");
    /* 0x00ba47b8: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba47bc: stxr     w11, x10, [x2] */ ARM64("stxr w11, x10, [x2]");
    /* 0x00ba47c0: cbnz     w11, #0xba47b4 */ if (w11 != 0) goto loc_00ba47b4;
    /* 0x00ba47c4: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba47c8: stur     xzr, [x29, #-0xb0] */ ARM64("stur xzr, [x29, #-0xb0]");
    /* 0x00ba47cc: stur     w28, [x29, #-0xa8] */ ARM64("stur w28, [x29, #-0xa8]");
    /* 0x00ba47d0: stp      xzr, x8, [x29, #-0xa0] */ ARM64("stp xzr, x8, [x29, #-0xa0]");
    /* 0x00ba47d4: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba47d8: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba47dc: add      x1, x8, #0x180 */ ARM64("add x1, x8, #0x180");
    /* 0x00ba47e0: sub      x3, x29, #0xb0 */ ARM64("sub x3, x29, #0xb0");
    /* 0x00ba47e4: bl       #0xbb0614 */ CALL_DIRECT(sub_00bb0614);
    /* 0x00ba47e8: mov      x8, x22 */ ARM64("mov x8, x22");
    /* 0x00ba47ec: mov      x10, x26 */ ARM64("mov x10, x26");
    /* 0x00ba47f0: mov      x9, x20 */ ARM64("mov x9, x20");
    /* 0x00ba47f4: ldp      q7, q6, [sp, #0x80] */ ARM64("ldp q7, q6, [sp, #0x80]");
    /* 0x00ba47f8: cmp      x23, #3 */ ARM64("cmp x23, #3");
    /* 0x00ba47fc: b.eq     #0xba4990 */ if (COND_EQ) goto loc_00ba4990;
loc_00ba4800:
    /* 0x00ba4800: mov      w11, #2 */ ARM64("mov w11, #2");
    /* 0x00ba4804: cbz      x27, #0xba486c */ if (x27 == 0) goto loc_00ba486c;
    /* 0x00ba4808: cbz      x24, #0xba4868 */ if (x24 == 0) goto loc_00ba4868;
    /* 0x00ba480c: cbnz     x25, #0xba4830 */ if (x25 != 0) goto loc_00ba4830;
loc_00ba4810:
    /* 0x00ba4810: ldr      d0, [x21], #8 */ ARM64("ldr d0, [x21], #8");
    /* 0x00ba4814: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba4818: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba481c: sub      x27, x27, #0x40 */ ARM64("sub x27, x27, #0x40");
    /* 0x00ba4820: and      x25, x11, #0x8080808080808080 */ ARM64("and x25, x11, #0x8080808080808080");
    /* 0x00ba4824: cbz      x25, #0xba4810 */ if (x25 == 0) goto loc_00ba4810;
    /* 0x00ba4828: str      x21, [sp, #0x1a0] */ ARM64("str x21, [sp, #0x1a0]");
    /* 0x00ba482c: str      x27, [sp, #0x190] */ ARM64("str x27, [sp, #0x190]");
loc_00ba4830:
    /* 0x00ba4830: sub      x11, x25, #1 */ ARM64("sub x11, x25, #1");
    /* 0x00ba4834: rbit     x12, x25 */ ARM64("rbit x12, x25");
    /* 0x00ba4838: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00ba483c: and      x25, x11, x25 */ ARM64("and x25, x11, x25");
    /* 0x00ba4840: and      x11, x12, #0x78 */ ARM64("and x11, x12, #0x78");
    /* 0x00ba4844: sub      x11, x27, x11 */ ARM64("sub x11, x27, x11");
    /* 0x00ba4848: sub      x12, x24, #1 */ ARM64("sub x12, x24, #1");
    /* 0x00ba484c: str      x25, [sp, #0x198] */ ARM64("str x25, [sp, #0x198]");
    /* 0x00ba4850: mov      x24, x12 */ ARM64("mov x24, x12");
    /* 0x00ba4854: str      x12, [sp, #0x1b0] */ ARM64("str x12, [sp, #0x1b0]");
    /* 0x00ba4858: mov      x20, x9 */ ARM64("mov x20, x9");
    /* 0x00ba485c: sub      x9, x11, #8 */ ARM64("sub x9, x11, #8");
    /* 0x00ba4860: mov      x26, x10 */ ARM64("mov x26, x10");
    /* 0x00ba4864: b        #0xba477c */ goto loc_00ba477c;
loc_00ba4868:
    /* 0x00ba4868: str      xzr, [sp, #0x190] */ ARM64("str xzr, [sp, #0x190]");
loc_00ba486c:
    /* 0x00ba486c: cbz      x23, #0xba4880 */ if (x23 == 0) goto loc_00ba4880;
    /* 0x00ba4870: ldr      x12, [sp, #0x70] */ ARM64("ldr x12, [sp, #0x70]");
    /* 0x00ba4874: cmp      x12, #2 */ ARM64("cmp x12, #2");
    /* 0x00ba4878: b.ne     #0xba48cc */ if (COND_NE) goto loc_00ba48cc;
    /* 0x00ba487c: str      xzr, [sp, #0x130] */ ARM64("str xzr, [sp, #0x130]");
loc_00ba4880:
    /* 0x00ba4880: ldr      x12, [sp, #0xd8] */ ARM64("ldr x12, [sp, #0xd8]");
    /* 0x00ba4884: cmp      x9, x12 */ ARM64("cmp x9, x12");
    /* 0x00ba4888: b.eq     #0xba4900 */ if (COND_EQ) goto loc_00ba4900;
    /* 0x00ba488c: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba4890: add      x20, x9, #0x18 */ ARM64("add x20, x9, #0x18");
    /* 0x00ba4894: add      x12, x9, #8 */ ARM64("add x12, x9, #8");
    /* 0x00ba4898: stp      x11, x9, [sp, #0x140] */ ARM64("stp x11, x9, [sp, #0x140]");
    /* 0x00ba489c: str      x20, [sp, #0x180] */ ARM64("str x20, [sp, #0x180]");
    /* 0x00ba48a0: add      x11, x9, #8 */ ARM64("add x11, x9, #8");
    /* 0x00ba48a4: str      x11, [sp, #0xc0] */ ARM64("str x11, [sp, #0xc0]");
    /* 0x00ba48a8: str      x12, [sp, #0x150] */ ARM64("str x12, [sp, #0x150]");
    /* 0x00ba48ac: mov      w11, #1 */ ARM64("mov w11, #1");
    /* 0x00ba48b0: dup      v0.2d, x11 */ ARM64("dup v0.2d, x11");
    /* 0x00ba48b4: str      q0, [sp, #0x130] */ ARM64("str q0, [sp, #0x130]");
    /* 0x00ba48b8: mov      x26, x10 */ ARM64("mov x26, x10");
    /* 0x00ba48bc: mov      w10, #1 */ ARM64("mov w10, #1");
    /* 0x00ba48c0: str      x10, [sp, #0x70] */ ARM64("str x10, [sp, #0x70]");
    /* 0x00ba48c4: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00ba48c8: b        #0xba477c */ goto loc_00ba477c;
loc_00ba48cc:
    /* 0x00ba48cc: str      x11, [sp, #0x138] */ ARM64("str x11, [sp, #0x138]");
    /* 0x00ba48d0: ldr      x11, [sp, #0xc0] */ ARM64("ldr x11, [sp, #0xc0]");
    /* 0x00ba48d4: cbz      x11, #0xba48f8 */ if (x11 == 0) goto loc_00ba48f8;
    /* 0x00ba48d8: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba48dc: mov      x26, x10 */ ARM64("mov x26, x10");
    /* 0x00ba48e0: mov      x20, x9 */ ARM64("mov x20, x9");
    /* 0x00ba48e4: mov      w9, #2 */ ARM64("mov w9, #2");
    /* 0x00ba48e8: str      x9, [sp, #0x70] */ ARM64("str x9, [sp, #0x70]");
    /* 0x00ba48ec: mov      w23, #1 */ ARM64("mov w23, #1");
    /* 0x00ba48f0: mov      x9, x11 */ ARM64("mov x9, x11");
    /* 0x00ba48f4: b        #0xba477c */ goto loc_00ba477c;
loc_00ba48f8:
    /* 0x00ba48f8: mov      w11, #2 */ ARM64("mov w11, #2");
    /* 0x00ba48fc: str      x11, [sp, #0x70] */ ARM64("str x11, [sp, #0x70]");
loc_00ba4900:
    /* 0x00ba4900: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba4904: mov      w11, #3 */ ARM64("mov w11, #3");
    /* 0x00ba4908: str      x11, [sp, #0x130] */ ARM64("str x11, [sp, #0x130]");
    /* 0x00ba490c: b        #0xba4990 */ goto loc_00ba4990;
loc_00ba4910:
    /* 0x00ba4910: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba4914: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00ba4918: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba491c: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00ba4920: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba4924: b.eq     #0xba495c */ if (COND_EQ) goto loc_00ba495c;
loc_00ba4928:
    /* 0x00ba4928: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00ba492c: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00ba4930: add      x14, x12, x14, lsr #3 */ ARM64("add x14, x12, x14, lsr #3");
    /* 0x00ba4934: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba4938: mov      w15, #0x28 */ ARM64("mov w15, #0x28");
    /* 0x00ba493c: mneg     x14, x14, x15 */ ARM64("mneg x14, x14, x15");
    /* 0x00ba4940: add      x14, x11, x14 */ ARM64("add x14, x11, x14");
    /* 0x00ba4944: ldur     x14, [x14, #-0x28] */ ARM64("ldur x14, [x14, #-0x28]");
    /* 0x00ba4948: cmp      x2, x14 */ ARM64("cmp x2, x14");
    /* 0x00ba494c: b.eq     #0xba497c */ if (COND_EQ) goto loc_00ba497c;
    /* 0x00ba4950: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00ba4954: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00ba4958: b.ne     #0xba4928 */ if (COND_NE) goto loc_00ba4928;
loc_00ba495c:
    /* 0x00ba495c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba4960: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba4964: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba4968: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba496c: tbnz     w13, #0, #0xba47b4 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba47b4;
    /* 0x00ba4970: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00ba4974: add      x12, x12, x9 */ ARM64("add x12, x12, x9");
    /* 0x00ba4978: b        #0xba4910 */ goto loc_00ba4910;
loc_00ba497c:
    /* 0x00ba497c: mov      x8, x22 */ ARM64("mov x8, x22");
    /* 0x00ba4980: mov      x10, x26 */ ARM64("mov x10, x26");
    /* 0x00ba4984: mov      x9, x20 */ ARM64("mov x9, x20");
    /* 0x00ba4988: cmp      x23, #3 */ ARM64("cmp x23, #3");
    /* 0x00ba498c: b.ne     #0xba4800 */ if (COND_NE) goto loc_00ba4800;
loc_00ba4990:
    /* 0x00ba4990: ldr      x11, [sp, #0x100] */ ARM64("ldr x11, [sp, #0x100]");
    /* 0x00ba4994: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba4998: b.ne     #0xba4768 */ if (COND_NE) goto loc_00ba4768;
    /* 0x00ba499c: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba49a0: ldr      x11, [x8, #0xd8] */ ARM64("ldr x11, [x8, #0xd8]");
    /* 0x00ba49a4: ldr      x25, [sp, #0xa0] */ ARM64("ldr x25, [sp, #0xa0]");
    /* 0x00ba49a8: ldr      x24, [sp, #0xb0] */ ARM64("ldr x24, [sp, #0xb0]");
loc_00ba49ac:
    /* 0x00ba49ac: ldr      x8, [x11, #0x28] */ ARM64("ldr x8, [x11, #0x28]");
    /* 0x00ba49b0: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00ba49b4: b.ls     #0xba49d0 */ if (COND_LS) goto loc_00ba49d0;
    /* 0x00ba49b8: ldr      x8, [x11, #0x20] */ ARM64("ldr x8, [x11, #0x20]");
    /* 0x00ba49bc: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba49c0: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba49c4: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba49c8: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba49cc: b.ne     #0xba49d8 */ if (COND_NE) goto loc_00ba49d8;
loc_00ba49d0:
    /* 0x00ba49d0: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba49d4: b        #0xba49e4 */ goto loc_00ba49e4;
loc_00ba49d8:
    /* 0x00ba49d8: ldr      w8, [x8, #0x1c] */ ARM64("ldr w8, [x8, #0x1c]");
    /* 0x00ba49dc: mov      w9, #-1 */ ARM64("mov w9, #-1");
    /* 0x00ba49e0: orr      x8, x9, x8, lsl #32 */ ARM64("orr x8, x9, x8, lsl #32");
loc_00ba49e4:
    /* 0x00ba49e4: ldp      x9, x10, [x11, #0x38] */ ARM64("ldp x9, x10, [x11, #0x38]");
loc_00ba49e8:
    /* 0x00ba49e8: mov      w12, w8 */ ARM64("mov w12, w8");
    /* 0x00ba49ec: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba49f0: b.ls     #0xba4a10 */ if (COND_LS) goto loc_00ba4a10;
    /* 0x00ba49f4: mov      w11, w8 */ ARM64("mov w11, w8");
    /* 0x00ba49f8: mov      w13, #0x30 */ ARM64("mov w13, #0x30");
    /* 0x00ba49fc: umaddl   x12, w12, w13, x9 */ ARM64("umaddl x12, w12, w13, x9");
    /* 0x00ba4a00: ldr      w12, [x12, #0x20] */ ARM64("ldr w12, [x12, #0x20]");
    /* 0x00ba4a04: and      x8, x8, #0xffffffff00000000 */ ARM64("and x8, x8, #0xffffffff00000000");
    /* 0x00ba4a08: orr      x8, x8, x12 */ ARM64("orr x8, x8, x12");
    /* 0x00ba4a0c: b        #0xba4a38 */ goto loc_00ba4a38;
loc_00ba4a10:
    /* 0x00ba4a10: lsr      x12, x8, #0x20 */ ARM64("lsr x12, x8, #0x20");
loc_00ba4a14:
    /* 0x00ba4a14: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba4a18: b.ls     #0xba4bc0 */ if (COND_LS) goto loc_00ba4bc0;
    /* 0x00ba4a1c: mov      x11, x12 */ ARM64("mov x11, x12");
    /* 0x00ba4a20: mov      w12, #0x30 */ ARM64("mov w12, #0x30");
    /* 0x00ba4a24: madd     x13, x11, x12, x9 */ ARM64("madd x13, x11, x12, x9");
    /* 0x00ba4a28: ldp      w12, w13, [x13, #0x24] */ ARM64("ldp w12, w13, [x13, #0x24]");
    /* 0x00ba4a2c: bfi      x8, x12, #0x20, #0x20 */ ARM64("bfi x8, x12, #0x20, #0x20");
    /* 0x00ba4a30: cmn      w13, #1 */ ARM64("cmn w13, #1");
    /* 0x00ba4a34: b.eq     #0xba4a14 */ if (COND_EQ) goto loc_00ba4a14;
loc_00ba4a38:
    /* 0x00ba4a38: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba4a3c: b.ls     #0xba771c */ if (COND_LS) goto loc_00ba771c;
    /* 0x00ba4a40: mov      w12, #0x30 */ ARM64("mov w12, #0x30");
    /* 0x00ba4a44: madd     x11, x11, x12, x9 */ ARM64("madd x11, x11, x12, x9");
    /* 0x00ba4a48: ldr      x12, [x11] */ ARM64("ldr x12, [x11]");
    /* 0x00ba4a4c: mov      x13, #-0x8000000000000000 */ ARM64("mov x13, #-0x8000000000000000");
    /* 0x00ba4a50: cmp      x12, x13 */ ARM64("cmp x12, x13");
    /* 0x00ba4a54: b.eq     #0xba771c */ if (COND_EQ) goto loc_00ba771c;
    /* 0x00ba4a58: ldr      w12, [x11, #0x2c] */ ARM64("ldr w12, [x11, #0x2c]");
    /* 0x00ba4a5c: cmp      w12, w28 */ ARM64("cmp w12, w28");
    /* 0x00ba4a60: b.ne     #0xba49e8 */ if (COND_NE) goto loc_00ba49e8;
    /* 0x00ba4a64: ldr      x22, [x11, #0x10] */ ARM64("ldr x22, [x11, #0x10]");
    /* 0x00ba4a68: lsl      x21, x22, #4 */ ARM64("lsl x21, x22, #4");
    /* 0x00ba4a6c: lsr      x8, x22, #0x3c */ ARM64("lsr x8, x22, #0x3c");
    /* 0x00ba4a70: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba4a74: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba4a78: ccmp     x21, x8, #2, eq */ ARM64("ccmp x21, x8, #2, eq");
    /* 0x00ba4a7c: b.hi     #0xba5270 */ if (COND_HI) goto loc_00ba5270;
    /* 0x00ba4a80: ldr      x23, [x11, #8] */ ARM64("ldr x23, [x11, #8]");
    /* 0x00ba4a84: cbz      x21, #0xba4aa4 */ if (x21 == 0) goto loc_00ba4aa4;
    /* 0x00ba4a88: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00ba4a8c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba4a90: cbz      x0, #0xba7980 */ if (x0 == 0) goto loc_00ba7980;
    /* 0x00ba4a94: str      x0, [sp, #0x20] */ ARM64("str x0, [sp, #0x20]");
    /* 0x00ba4a98: mov      x20, x22 */ ARM64("mov x20, x22");
    /* 0x00ba4a9c: ldp      q7, q6, [sp, #0x80] */ ARM64("ldp q7, q6, [sp, #0x80]");
    /* 0x00ba4aa0: b        #0xba4ab0 */ goto loc_00ba4ab0;
loc_00ba4aa4:
    /* 0x00ba4aa4: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00ba4aa8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba4aac: str      x8, [sp, #0x20] */ ARM64("str x8, [sp, #0x20]");
loc_00ba4ab0:
    /* 0x00ba4ab0: cbz      x22, #0xba4bb4 */ if (x22 == 0) goto loc_00ba4bb4;
    /* 0x00ba4ab4: cmp      x22, #4 */ ARM64("cmp x22, #4");
    /* 0x00ba4ab8: b.hs     #0xba4ac8 */ if (COND_HS) goto loc_00ba4ac8;
    /* 0x00ba4abc: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba4ac0: ldr      x11, [sp, #0x20] */ ARM64("ldr x11, [sp, #0x20]");
    /* 0x00ba4ac4: b        #0xba4b3c */ goto loc_00ba4b3c;
loc_00ba4ac8:
    /* 0x00ba4ac8: and      x8, x22, #0xffffffffffffffc */ ARM64("and x8, x22, #0xffffffffffffffc");
    /* 0x00ba4acc: ldr      x9, [sp, #0x20] */ ARM64("ldr x9, [sp, #0x20]");
    /* 0x00ba4ad0: add      x9, x9, #0x20 */ ARM64("add x9, x9, #0x20");
    /* 0x00ba4ad4: dup      v0.2d, x23 */ ARM64("dup v0.2d, x23");
    /* 0x00ba4ad8: and      x10, x22, #0xffffffffffffffc */ ARM64("and x10, x22, #0xffffffffffffffc");
    /* 0x00ba4adc: ldr      q1, [sp, #0x50] */ ARM64("ldr q1, [sp, #0x50]");
    /* 0x00ba4ae0: mov      w12, #2 */ ARM64("mov w12, #2");
loc_00ba4ae4:
    /* 0x00ba4ae4: dup      v3.2d, x12 */ ARM64("dup v3.2d, x12");
    /* 0x00ba4ae8: add      v3.2d, v1.2d, v3.2d */ ARM64("add v3.2d, v1.2d, v3.2d");
    /* 0x00ba4aec: fmov     x11, d1 */ ARM64("fmov x11, d1");
    /* 0x00ba4af0: add      x11, x11, x11, lsl #3 */ ARM64("add x11, x11, x11, lsl #3");
    /* 0x00ba4af4: lsl      x11, x11, #3 */ ARM64("lsl x11, x11, #3");
    /* 0x00ba4af8: fmov     d5, x11 */ ARM64("fmov d5, x11");
    /* 0x00ba4afc: mov      x11, v1.d[1] */ ARM64("mov x11, v1.d[1]");
    /* 0x00ba4b00: add      x11, x11, x11, lsl #3 */ ARM64("add x11, x11, x11, lsl #3");
    /* 0x00ba4b04: lsl      x11, x11, #3 */ ARM64("lsl x11, x11, #3");
    /* 0x00ba4b08: mov      v5.d[1], x11 */ ARM64("mov v5.d[1], x11");
    /* 0x00ba4b0c: add      v2.2d, v0.2d, v5.2d */ ARM64("add v2.2d, v0.2d, v5.2d");
    /* 0x00ba4b10: sub      x11, x9, #0x20 */ ARM64("sub x11, x9, #0x20");
    /* 0x00ba4b14: st2      {v1.2d, v2.2d}, [x11] */ ARM64("st2 {v1.2d, v2.2d}, [x11]");
    /* 0x00ba4b18: add      v4.2d, v2.2d, v6.2d */ ARM64("add v4.2d, v2.2d, v6.2d");
    /* 0x00ba4b1c: st2      {v3.2d, v4.2d}, [x9] */ ARM64("st2 {v3.2d, v4.2d}, [x9]");
    /* 0x00ba4b20: add      v1.2d, v1.2d, v7.2d */ ARM64("add v1.2d, v1.2d, v7.2d");
    /* 0x00ba4b24: add      x9, x9, #0x40 */ ARM64("add x9, x9, #0x40");
    /* 0x00ba4b28: subs     x10, x10, #4 */ ARM64("subs x10, x10, #4");
    /* 0x00ba4b2c: b.ne     #0xba4ae4 */ if (COND_NE) goto loc_00ba4ae4;
    /* 0x00ba4b30: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba4b34: ldr      x11, [sp, #0x20] */ ARM64("ldr x11, [sp, #0x20]");
    /* 0x00ba4b38: b.eq     #0xba4b64 */ if (COND_EQ) goto loc_00ba4b64;
loc_00ba4b3c:
    /* 0x00ba4b3c: add      x9, x11, x8, lsl #4 */ ARM64("add x9, x11, x8, lsl #4");
    /* 0x00ba4b40: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00ba4b44: mov      w10, #0x48 */ ARM64("mov w10, #0x48");
    /* 0x00ba4b48: madd     x10, x8, x10, x23 */ ARM64("madd x10, x8, x10, x23");
loc_00ba4b4c:
    /* 0x00ba4b4c: stp      x8, x10, [x9, #-8] */ ARM64("stp x8, x10, [x9, #-8]");
    /* 0x00ba4b50: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba4b54: add      x9, x9, #0x10 */ ARM64("add x9, x9, #0x10");
    /* 0x00ba4b58: add      x10, x10, #0x48 */ ARM64("add x10, x10, #0x48");
    /* 0x00ba4b5c: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba4b60: b.ne     #0xba4b4c */ if (COND_NE) goto loc_00ba4b4c;
loc_00ba4b64:
    /* 0x00ba4b64: add      x21, x11, x21 */ ARM64("add x21, x11, x21");
    /* 0x00ba4b68: mov      x22, x11 */ ARM64("mov x22, x11");
loc_00ba4b6c:
    /* 0x00ba4b6c: ldp      x8, x9, [x22], #0x10 */ ARM64("ldp x8, x9, [x22], #0x10");
    /* 0x00ba4b70: ldr      x2, [x9] */ ARM64("ldr x2, [x9]");
loc_00ba4b74:
    /* 0x00ba4b74: ldxr     x9, [x2] */ ARM64("ldxr x9, [x2]");
    /* 0x00ba4b78: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba4b7c: stxr     w11, x10, [x2] */ ARM64("stxr w11, x10, [x2]");
    /* 0x00ba4b80: cbnz     w11, #0xba4b74 */ if (w11 != 0) goto loc_00ba4b74;
    /* 0x00ba4b84: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba4b88: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba4b8c: str      x9, [sp, #0x130] */ ARM64("str x9, [sp, #0x130]");
    /* 0x00ba4b90: str      w28, [sp, #0x138] */ ARM64("str w28, [sp, #0x138]");
    /* 0x00ba4b94: stp      xzr, x8, [sp, #0x140] */ ARM64("stp xzr, x8, [sp, #0x140]");
    /* 0x00ba4b98: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4b9c: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba4ba0: add      x1, x8, #0x180 */ ARM64("add x1, x8, #0x180");
    /* 0x00ba4ba4: add      x3, sp, #0x130 */ ARM64("add x3, sp, #0x130");
    /* 0x00ba4ba8: bl       #0xbb0614 */ CALL_DIRECT(sub_00bb0614);
    /* 0x00ba4bac: cmp      x22, x21 */ ARM64("cmp x22, x21");
    /* 0x00ba4bb0: b.ne     #0xba4b6c */ if (COND_NE) goto loc_00ba4b6c;
loc_00ba4bb4:
    /* 0x00ba4bb4: cbz      x20, #0xba4bc0 */ if (x20 == 0) goto loc_00ba4bc0;
    /* 0x00ba4bb8: ldr      x0, [sp, #0x20] */ ARM64("ldr x0, [sp, #0x20]");
    /* 0x00ba4bbc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba4bc0:
    /* 0x00ba4bc0: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba4bc4: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x00ba4bc8: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00ba4bcc: cmp      x9, x24 */ ARM64("cmp x9, x24");
    /* 0x00ba4bd0: b.ls     #0xba77b4 */ if (COND_LS) goto loc_00ba77b4;
    /* 0x00ba4bd4: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00ba4bd8: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba4bdc: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba4be0: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba4be4: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba4be8: b.eq     #0xba77b4 */ if (COND_EQ) goto loc_00ba77b4;
    /* 0x00ba4bec: ldr      x9, [x8, #0x10] */ ARM64("ldr x9, [x8, #0x10]");
    /* 0x00ba4bf0: cbz      x9, #0xba45a8 */ if (x9 == 0) goto loc_00ba45a8;
    /* 0x00ba4bf4: str      xzr, [sp, #0xc0] */ ARM64("str xzr, [sp, #0xc0]");
    /* 0x00ba4bf8: ldr      x27, [x8, #8] */ ARM64("ldr x27, [x8, #8]");
    /* 0x00ba4bfc: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00ba4c00: madd     x8, x9, x8, x27 */ ARM64("madd x8, x9, x8, x27");
    /* 0x00ba4c04: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
    /* 0x00ba4c08: mul      x8, x24, x19 */ ARM64("mul x8, x24, x19");
    /* 0x00ba4c0c: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00ba4c10: lsr      x8, x8, #0x39 */ ARM64("lsr x8, x8, #0x39");
    /* 0x00ba4c14: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00ba4c18: dup      v8.8b, w8 */ ARM64("dup v8.8b, w8");
    /* 0x00ba4c1c: b        #0xba4c2c */ goto loc_00ba4c2c;
loc_00ba4c20:
    /* 0x00ba4c20: ldr      x8, [sp, #0x78] */ ARM64("ldr x8, [sp, #0x78]");
    /* 0x00ba4c24: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00ba4c28: b.eq     #0xba45a8 */ if (COND_EQ) goto loc_00ba45a8;
loc_00ba4c2c:
    /* 0x00ba4c2c: mov      x22, x27 */ ARM64("mov x22, x27");
    /* 0x00ba4c30: ldr      x26, [sp, #0xc0] */ ARM64("ldr x26, [sp, #0xc0]");
    /* 0x00ba4c34: add      x27, x27, #0x108 */ ARM64("add x27, x27, #0x108");
    /* 0x00ba4c38: add      x8, x26, #1 */ ARM64("add x8, x26, #1");
    /* 0x00ba4c3c: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00ba4c40: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00ba4c44: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00ba4c48: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00ba4c4c: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00ba4c50: csel     x10, x9, x8, hi */ ARM64("csel x10, x9, x8, hi");
    /* 0x00ba4c54: mov      w8, #0xb0 */ ARM64("mov w8, #0xb0");
    /* 0x00ba4c58: mov      w9, #0xa8 */ ARM64("mov w9, #0xa8");
    /* 0x00ba4c5c: adrp     x13, #0xe06000 */ ARM64("adrp x13, #0xe06000");
    /* 0x00ba4c60: add      x13, x13, #0x407 */ ARM64("add x13, x13, #0x407");
    /* 0x00ba4c64: adr      x11, #0xba4c74 */ ARM64("adr x11, #0xba4c74");
    /* 0x00ba4c68: ldrb     w12, [x13, x10] */ ARM64("ldrb w12, [x13, x10]");
    /* 0x00ba4c6c: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00ba4c70: br       x11 */ ARM64("br x11");
loc_00ba4c74:
    /* 0x00ba4c74: mov      w9, #0x28 */ ARM64("mov w9, #0x28");
    /* 0x00ba4c78: mov      w8, #0x30 */ ARM64("mov w8, #0x30");
    /* 0x00ba4c7c: ldr      x1, [x22, x9] */ ARM64("ldr x1, [x22, x9]");
    /* 0x00ba4c80: ldr      x2, [x22, x8] */ ARM64("ldr x2, [x22, x8]");
    /* 0x00ba4c84: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4c88: bl       #0xb8c520 */ CALL_DIRECT(sub_00b8c520);
    /* 0x00ba4c8c: b        #0xba4cdc */ goto loc_00ba4cdc;
    /* 0x00ba4c90: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4c94: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba4c98: bl       #0xb838c4 */ CALL_DIRECT(sub_00b838c4);
    /* 0x00ba4c9c: b        #0xba4cdc */ goto loc_00ba4cdc;
    /* 0x00ba4ca0: ldr      x8, [x22, #0xa0] */ ARM64("ldr x8, [x22, #0xa0]");
    /* 0x00ba4ca4: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00ba4ca8: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba4cac: b.ne     #0xba5248 */ if (COND_NE) goto loc_00ba5248;
    /* 0x00ba4cb0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba4cb4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba4cb8: cbz      x0, #0xba72ec */ if (x0 == 0) goto loc_00ba72ec;
    /* 0x00ba4cbc: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00ba4cc0: add      x8, x22, #0xa8 */ ARM64("add x8, x22, #0xa8");
    /* 0x00ba4cc4: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba4cc8: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00ba4ccc: b        #0xba5250 */ goto loc_00ba5250;
    /* 0x00ba4cd0: ldp      x1, x2, [x22, #0x28] */ ARM64("ldp x1, x2, [x22, #0x28]");
    /* 0x00ba4cd4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4cd8: bl       #0xb85118 */ CALL_DIRECT(sub_00b85118);
loc_00ba4cdc:
    /* 0x00ba4cdc: ldp      x23, x8, [sp, #0x138] */ ARM64("ldp x23, x8, [sp, #0x138]");
    /* 0x00ba4ce0: ldr      x21, [sp, #0x130] */ ARM64("ldr x21, [sp, #0x130]");
    /* 0x00ba4ce4: cbz      x8, #0xba4d64 */ if (x8 == 0) goto loc_00ba4d64;
loc_00ba4ce8:
    /* 0x00ba4ce8: add      x24, x23, x8, lsl #3 */ ARM64("add x24, x23, x8, lsl #3");
    /* 0x00ba4cec: b        #0xba4d10 */ goto loc_00ba4d10;
    /* 0x00ba4cf0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba4cf4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba4cf8: cbz      x0, #0xba72ec */ if (x0 == 0) goto loc_00ba72ec;
    /* 0x00ba4cfc: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00ba4d00: add      x8, x22, #0xe0 */ ARM64("add x8, x22, #0xe0");
    /* 0x00ba4d04: mov      x24, x0 */ ARM64("mov x24, x0");
    /* 0x00ba4d08: str      x8, [x24], #8 */ ARM64("str x8, [x24], #8");
    /* 0x00ba4d0c: mov      w21, #1 */ ARM64("mov w21, #1");
loc_00ba4d10:
    /* 0x00ba4d10: mov      x25, x23 */ ARM64("mov x25, x23");
loc_00ba4d14:
    /* 0x00ba4d14: ldr      x8, [x25], #8 */ ARM64("ldr x8, [x25], #8");
    /* 0x00ba4d18: ldr      x2, [x8] */ ARM64("ldr x2, [x8]");
loc_00ba4d1c:
    /* 0x00ba4d1c: ldxr     x8, [x2] */ ARM64("ldxr x8, [x2]");
    /* 0x00ba4d20: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba4d24: stxr     w10, x9, [x2] */ ARM64("stxr w10, x9, [x2]");
    /* 0x00ba4d28: cbnz     w10, #0xba4d1c */ if (w10 != 0) goto loc_00ba4d1c;
    /* 0x00ba4d2c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba4d30: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba4d34: str      x8, [sp, #0x130] */ ARM64("str x8, [sp, #0x130]");
    /* 0x00ba4d38: str      w28, [sp, #0x138] */ ARM64("str w28, [sp, #0x138]");
    /* 0x00ba4d3c: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba4d40: stp      x8, x26, [sp, #0x140] */ ARM64("stp x8, x26, [sp, #0x140]");
    /* 0x00ba4d44: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4d48: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba4d4c: add      x1, x8, #0x180 */ ARM64("add x1, x8, #0x180");
    /* 0x00ba4d50: add      x3, sp, #0x130 */ ARM64("add x3, sp, #0x130");
    /* 0x00ba4d54: bl       #0xbb0614 */ CALL_DIRECT(sub_00bb0614);
    /* 0x00ba4d58: cmp      x25, x24 */ ARM64("cmp x25, x24");
    /* 0x00ba4d5c: b.ne     #0xba4d14 */ if (COND_NE) goto loc_00ba4d14;
    /* 0x00ba4d60: ldr      x25, [sp, #0xa0] */ ARM64("ldr x25, [sp, #0xa0]");
loc_00ba4d64:
    /* 0x00ba4d64: cbz      x21, #0xba4d70 */ if (x21 == 0) goto loc_00ba4d70;
    /* 0x00ba4d68: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba4d6c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba4d70:
    /* 0x00ba4d70: ldr      x8, [x22, #0x18] */ ARM64("ldr x8, [x22, #0x18]");
    /* 0x00ba4d74: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00ba4d78: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00ba4d7c: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00ba4d80: csel     x10, x9, x8, hi */ ARM64("csel x10, x9, x8, hi");
    /* 0x00ba4d84: mov      w8, #0x10 */ ARM64("mov w8, #0x10");
    /* 0x00ba4d88: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba4d8c: adrp     x13, #0xe06000 */ ARM64("adrp x13, #0xe06000");
    /* 0x00ba4d90: add      x13, x13, #0x41c */ ARM64("add x13, x13, #0x41c");
    /* 0x00ba4d94: adr      x11, #0xba4c20 */ ARM64("adr x11, #0xba4c20");
    /* 0x00ba4d98: ldrb     w12, [x13, x10] */ ARM64("ldrb w12, [x13, x10]");
    /* 0x00ba4d9c: add      x11, x11, x12, lsl #2 */ ARM64("add x11, x11, x12, lsl #2");
    /* 0x00ba4da0: br       x11 */ ARM64("br x11");
    /* 0x00ba4da4: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4da8: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4dac: bl       #0xb8c08c */ CALL_DIRECT(sub_00b8c08c);
    /* 0x00ba4db0: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4db4: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4db8: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4dbc: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba4dc0: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4dc4: ldr      x1, [x22, #0x38] */ ARM64("ldr x1, [x22, #0x38]");
    /* 0x00ba4dc8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4dcc: bl       #0xb8b79c */ CALL_DIRECT(sub_00b8b79c);
    /* 0x00ba4dd0: ldp      x8, x9, [sp, #0x130] */ ARM64("ldp x8, x9, [sp, #0x130]");
    /* 0x00ba4dd4: ldr      x10, [sp, #0x140] */ ARM64("ldr x10, [sp, #0x140]");
    /* 0x00ba4dd8: add      x10, x9, x10, lsl #3 */ ARM64("add x10, x9, x10, lsl #3");
    /* 0x00ba4ddc: ldp      x11, x12, [x22, #0x28] */ ARM64("ldp x11, x12, [x22, #0x28]");
    /* 0x00ba4de0: add      x12, x11, x12, lsl #6 */ ARM64("add x12, x11, x12, lsl #6");
    /* 0x00ba4de4: stp      x9, x8, [sp, #0x190] */ ARM64("stp x9, x8, [sp, #0x190]");
    /* 0x00ba4de8: str      x10, [sp, #0x1a0] */ ARM64("str x10, [sp, #0x1a0]");
    /* 0x00ba4dec: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba4df0: stp      x8, xzr, [sp, #0x130] */ ARM64("stp x8, xzr, [sp, #0x130]");
    /* 0x00ba4df4: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
    /* 0x00ba4df8: stp      x11, x12, [sp, #0x178] */ ARM64("stp x11, x12, [sp, #0x178]");
    /* 0x00ba4dfc: str      x9, [sp, #0x188] */ ARM64("str x9, [sp, #0x188]");
    /* 0x00ba4e00: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4e04: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba4e08: bl       #0xb755ac */ CALL_DIRECT(sub_00b755ac);
    /* 0x00ba4e0c: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4e10: ldr      x1, [x22, #0x50] */ ARM64("ldr x1, [x22, #0x50]");
    /* 0x00ba4e14: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4e18: bl       #0xb8b79c */ CALL_DIRECT(sub_00b8b79c);
    /* 0x00ba4e1c: ldp      x8, x9, [sp, #0x130] */ ARM64("ldp x8, x9, [sp, #0x130]");
    /* 0x00ba4e20: ldr      x10, [sp, #0x140] */ ARM64("ldr x10, [sp, #0x140]");
    /* 0x00ba4e24: add      x10, x9, x10, lsl #3 */ ARM64("add x10, x9, x10, lsl #3");
    /* 0x00ba4e28: ldp      x11, x12, [x22, #0x40] */ ARM64("ldp x11, x12, [x22, #0x40]");
    /* 0x00ba4e2c: add      x12, x11, x12, lsl #6 */ ARM64("add x12, x11, x12, lsl #6");
    /* 0x00ba4e30: stp      x9, x8, [sp, #0x190] */ ARM64("stp x9, x8, [sp, #0x190]");
    /* 0x00ba4e34: str      x10, [sp, #0x1a0] */ ARM64("str x10, [sp, #0x1a0]");
    /* 0x00ba4e38: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba4e3c: stp      x8, xzr, [sp, #0x130] */ ARM64("stp x8, xzr, [sp, #0x130]");
    /* 0x00ba4e40: str      xzr, [sp, #0x158] */ ARM64("str xzr, [sp, #0x158]");
    /* 0x00ba4e44: stp      x11, x12, [sp, #0x178] */ ARM64("stp x11, x12, [sp, #0x178]");
    /* 0x00ba4e48: str      x9, [sp, #0x188] */ ARM64("str x9, [sp, #0x188]");
    /* 0x00ba4e4c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4e50: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba4e54: bl       #0xb755ac */ CALL_DIRECT(sub_00b755ac);
    /* 0x00ba4e58: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4e5c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4e60: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4e64: bl       #0xb956bc */ CALL_DIRECT(sub_00b956bc);
    /* 0x00ba4e68: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4e6c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4e70: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4e74: bl       #0xb84c48 */ CALL_DIRECT(sub_00b84c48);
    /* 0x00ba4e78: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4e7c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4e80: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4e84: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba4e88: ldp      x21, x23, [sp, #0x130] */ ARM64("ldp x21, x23, [sp, #0x130]");
    /* 0x00ba4e8c: ldr      x24, [sp, #0x140] */ ARM64("ldr x24, [sp, #0x140]");
    /* 0x00ba4e90: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba4e94: add      x1, x22, #0x60 */ ARM64("add x1, x22, #0x60");
    /* 0x00ba4e98: bl       #0xbcc71c */ CALL_DIRECT(sub_00bcc71c);
    /* 0x00ba4e9c: add      x8, x23, x24, lsl #3 */ ARM64("add x8, x23, x24, lsl #3");
    /* 0x00ba4ea0: ldp      x9, x10, [sp, #0x130] */ ARM64("ldp x9, x10, [sp, #0x130]");
    /* 0x00ba4ea4: ldr      x11, [sp, #0x140] */ ARM64("ldr x11, [sp, #0x140]");
    /* 0x00ba4ea8: add      x11, x10, x11, lsl #3 */ ARM64("add x11, x10, x11, lsl #3");
    /* 0x00ba4eac: stp      x23, x23, [sp, #0x130] */ ARM64("stp x23, x23, [sp, #0x130]");
    /* 0x00ba4eb0: stp      x21, x8, [sp, #0x140] */ ARM64("stp x21, x8, [sp, #0x140]");
    /* 0x00ba4eb4: stp      x10, x10, [sp, #0x150] */ ARM64("stp x10, x10, [sp, #0x150]");
    /* 0x00ba4eb8: stp      x9, x11, [sp, #0x160] */ ARM64("stp x9, x11, [sp, #0x160]");
    /* 0x00ba4ebc: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4ec0: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba4ec4: bl       #0xb77430 */ CALL_DIRECT(sub_00b77430);
    /* 0x00ba4ec8: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4ecc: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4ed0: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4ed4: bl       #0xb93d28 */ CALL_DIRECT(sub_00b93d28);
    /* 0x00ba4ed8: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4edc: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4ee0: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba4ee4: bl       #0xb837cc */ CALL_DIRECT(sub_00b837cc);
    /* 0x00ba4ee8: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4eec: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4ef0: add      x1, x22, #0x20 */ ARM64("add x1, x22, #0x20");
    /* 0x00ba4ef4: bl       #0xb84e38 */ CALL_DIRECT(sub_00b84e38);
    /* 0x00ba4ef8: b        #0xba4f14 */ goto loc_00ba4f14;
    /* 0x00ba4efc: mov      w9, #0x40 */ ARM64("mov w9, #0x40");
    /* 0x00ba4f00: mov      w8, #0x48 */ ARM64("mov w8, #0x48");
    /* 0x00ba4f04: ldr      x1, [x22, x9] */ ARM64("ldr x1, [x22, x9]");
    /* 0x00ba4f08: ldr      x2, [x22, x8] */ ARM64("ldr x2, [x22, x8]");
    /* 0x00ba4f0c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba4f10: bl       #0xb85668 */ CALL_DIRECT(sub_00b85668);
loc_00ba4f14:
    /* 0x00ba4f14: ldur     x10, [x29, #-0xb0] */ ARM64("ldur x10, [x29, #-0xb0]");
    /* 0x00ba4f18: ldp      x9, x8, [x29, #-0xa8] */ ARM64("ldp x9, x8, [x29, #-0xa8]");
    /* 0x00ba4f1c: stp      x10, x9, [sp, #0xa8] */ ARM64("stp x10, x9, [sp, #0xa8]");
    /* 0x00ba4f20: cbz      x8, #0xba5234 */ if (x8 == 0) goto loc_00ba5234;
    /* 0x00ba4f24: ldr      x25, [sp, #0xb0] */ ARM64("ldr x25, [sp, #0xb0]");
    /* 0x00ba4f28: add      x22, x25, x8, lsl #3 */ ARM64("add x22, x25, x8, lsl #3");
    /* 0x00ba4f2c: b        #0xba5018 */ goto loc_00ba5018;
loc_00ba4f30:
    /* 0x00ba4f30: and      x12, x12, x9 */ ARM64("and x12, x12, x9");
    /* 0x00ba4f34: ldr      d0, [x8, x12] */ ARM64("ldr d0, [x8, x12]");
    /* 0x00ba4f38: cmeq     v1.8b, v0.8b, v8.8b */ ARM64("cmeq v1.8b, v0.8b, v8.8b");
    /* 0x00ba4f3c: fmov     x14, d1 */ ARM64("fmov x14, d1");
    /* 0x00ba4f40: ands     x14, x14, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x14, x14, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba4f44: b.eq     #0xba4f74 */ if (COND_EQ) goto loc_00ba4f74;
loc_00ba4f48:
    /* 0x00ba4f48: rbit     x15, x14 */ ARM64("rbit x15, x14");
    /* 0x00ba4f4c: clz      x15, x15 */ ARM64("clz x15, x15");
    /* 0x00ba4f50: add      x15, x12, x15, lsr #3 */ ARM64("add x15, x12, x15, lsr #3");
    /* 0x00ba4f54: and      x15, x15, x9 */ ARM64("and x15, x15, x9");
    /* 0x00ba4f58: sub      x15, x8, x15, lsl #5 */ ARM64("sub x15, x8, x15, lsl #5");
    /* 0x00ba4f5c: ldur     w16, [x15, #-0x20] */ ARM64("ldur w16, [x15, #-0x20]");
    /* 0x00ba4f60: cmp      w28, w16 */ ARM64("cmp w28, w16");
    /* 0x00ba4f64: b.eq     #0xba5000 */ if (COND_EQ) goto loc_00ba5000;
    /* 0x00ba4f68: sub      x15, x14, #1 */ ARM64("sub x15, x14, #1");
    /* 0x00ba4f6c: ands     x14, x15, x14 */ ARM64("ands x14, x15, x14");
    /* 0x00ba4f70: b.ne     #0xba4f48 */ if (COND_NE) goto loc_00ba4f48;
loc_00ba4f74:
    /* 0x00ba4f74: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba4f78: b.eq     #0xba4f98 */ if (COND_EQ) goto loc_00ba4f98;
    /* 0x00ba4f7c: cmlt     v1.8b, v0.8b, #0 */ ARM64("cmlt v1.8b, v0.8b, #0");
    /* 0x00ba4f80: fmov     x10, d1 */ ARM64("fmov x10, d1");
    /* 0x00ba4f84: cbz      x10, #0xba4fb4 */ if (x10 == 0) goto loc_00ba4fb4;
    /* 0x00ba4f88: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba4f8c: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba4f90: add      x10, x12, x10, lsr #3 */ ARM64("add x10, x12, x10, lsr #3");
    /* 0x00ba4f94: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
loc_00ba4f98:
    /* 0x00ba4f98: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00ba4f9c: cmeq     v0.8b, v0.8b, v1.8b */ ARM64("cmeq v0.8b, v0.8b, v1.8b");
    /* 0x00ba4fa0: umaxv    b0, v0.8b */ ARM64("umaxv b0, v0.8b");
    /* 0x00ba4fa4: fmov     w13, s0 */ ARM64("fmov w13, s0");
    /* 0x00ba4fa8: tbnz     w13, #0, #0xba4fc4 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba4fc4;
    /* 0x00ba4fac: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba4fb0: b        #0xba4fb8 */ goto loc_00ba4fb8;
loc_00ba4fb4:
    /* 0x00ba4fb4: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba4fb8:
    /* 0x00ba4fb8: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba4fbc: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00ba4fc0: b        #0xba4f30 */ goto loc_00ba4f30;
loc_00ba4fc4:
    /* 0x00ba4fc4: ldrsb    w11, [x8, x10] */ ARM64("ldrsb w11, [x8, x10]");
    /* 0x00ba4fc8: tbz      w11, #0x1f, #0xba5214 */ if (((w11 >> #0x1f) & 1) == 0) goto loc_00ba5214;
loc_00ba4fcc:
    /* 0x00ba4fcc: and      x11, x11, #1 */ ARM64("and x11, x11, #1");
    /* 0x00ba4fd0: sub      x12, x10, #8 */ ARM64("sub x12, x10, #8");
    /* 0x00ba4fd4: and      x9, x9, x12 */ ARM64("and x9, x9, x12");
    /* 0x00ba4fd8: ldr      x12, [sp, #0xd8] */ ARM64("ldr x12, [sp, #0xd8]");
    /* 0x00ba4fdc: strb     w12, [x8, x10] */ ARM64("strb w12, [x8, x10]");
    /* 0x00ba4fe0: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba4fe4: strb     w12, [x9, #8] */ ARM64("strb w12, [x9, #8]");
    /* 0x00ba4fe8: ldur     q0, [x21, #-0x10] */ ARM64("ldur q0, [x21, #-0x10]");
    /* 0x00ba4fec: mov      v1.d[0], x11 */ ARM64("mov v1.d[0], x11");
    /* 0x00ba4ff0: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00ba4ff4: stur     q0, [x21, #-0x10] */ ARM64("stur q0, [x21, #-0x10]");
    /* 0x00ba4ff8: sub      x15, x8, x10, lsl #5 */ ARM64("sub x15, x8, x10, lsl #5");
    /* 0x00ba4ffc: stur     w28, [x15, #-0x20] */ ARM64("stur w28, [x15, #-0x20]");
loc_00ba5000:
    /* 0x00ba5000: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba5004: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba5008: stp      x9, x8, [x15, #-0x18] */ ARM64("stp x9, x8, [x15, #-0x18]");
    /* 0x00ba500c: stur     x26, [x15, #-8] */ ARM64("stur x26, [x15, #-8]");
    /* 0x00ba5010: cmp      x25, x22 */ ARM64("cmp x25, x22");
    /* 0x00ba5014: b.eq     #0xba5234 */ if (COND_EQ) goto loc_00ba5234;
loc_00ba5018:
    /* 0x00ba5018: ldr      x8, [x25], #8 */ ARM64("ldr x8, [x25], #8");
    /* 0x00ba501c: ldr      x23, [x8] */ ARM64("ldr x23, [x8]");
loc_00ba5020:
    /* 0x00ba5020: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba5024: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5028: stxr     w10, x9, [x23] */ ARM64("stxr w10, x9, [x23]");
    /* 0x00ba502c: cbnz     w10, #0xba5020 */ if (w10 != 0) goto loc_00ba5020;
    /* 0x00ba5030: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5034: mov      x20, x28 */ ARM64("mov x20, x28");
    /* 0x00ba5038: mov      x28, x27 */ ARM64("mov x28, x27");
    /* 0x00ba503c: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba5040: add      x9, x23, #8 */ ARM64("add x9, x23, #8");
    /* 0x00ba5044: mul      x24, x9, x19 */ ARM64("mul x24, x9, x19");
    /* 0x00ba5048: lsr      x27, x24, #0x39 */ ARM64("lsr x27, x24, #0x39");
    /* 0x00ba504c: ldr      x10, [sp, #0x128] */ ARM64("ldr x10, [sp, #0x128]");
    /* 0x00ba5050: ldp      x10, x9, [x10, #0x1a0] */ ARM64("ldp x10, x9, [x10, #0x1a0]");
    /* 0x00ba5054: dup      v0.8b, w27 */ ARM64("dup v0.8b, w27");
    /* 0x00ba5058: and      x11, x24, x9 */ ARM64("and x11, x24, x9");
    /* 0x00ba505c: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba5060: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba5064: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba5068: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba506c: b.eq     #0xba50a4 */ if (COND_EQ) goto loc_00ba50a4;
loc_00ba5070:
    /* 0x00ba5070: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba5074: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba5078: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba507c: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba5080: mov      w14, #0x28 */ ARM64("mov w14, #0x28");
    /* 0x00ba5084: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00ba5088: add      x21, x10, x13 */ ARM64("add x21, x10, x13");
    /* 0x00ba508c: ldur     x13, [x21, #-0x28] */ ARM64("ldur x13, [x21, #-0x28]");
    /* 0x00ba5090: cmp      x13, x23 */ ARM64("cmp x13, x23");
    /* 0x00ba5094: b.eq     #0xba50dc */ if (COND_EQ) goto loc_00ba50dc;
    /* 0x00ba5098: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba509c: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba50a0: b.ne     #0xba5070 */ if (COND_NE) goto loc_00ba5070;
loc_00ba50a4:
    /* 0x00ba50a4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba50a8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba50ac: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba50b0: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba50b4: tbnz     w12, #0, #0xba5104 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba5104;
    /* 0x00ba50b8: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba50bc: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba50c0: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba50c4: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba50c8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba50cc: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba50d0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba50d4: b.ne     #0xba5070 */ if (COND_NE) goto loc_00ba5070;
    /* 0x00ba50d8: b        #0xba50a4 */ goto loc_00ba50a4;
loc_00ba50dc:
    /* 0x00ba50dc: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba50e0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba50e4: stlxr    w9, x8, [x23] */ ARM64("stlxr w9, x8, [x23]");
    /* 0x00ba50e8: cbnz     w9, #0xba50dc */ if (w9 != 0) goto loc_00ba50dc;
    /* 0x00ba50ec: mov      x27, x28 */ ARM64("mov x27, x28");
    /* 0x00ba50f0: b.ne     #0xba5190 */ if (COND_NE) goto loc_00ba5190;
    /* 0x00ba50f4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba50f8: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba50fc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba5100: b        #0xba5190 */ goto loc_00ba5190;
loc_00ba5104:
    /* 0x00ba5104: ldr      x21, [sp, #0x128] */ ARM64("ldr x21, [sp, #0x128]");
    /* 0x00ba5108: ldr      x8, [x21, #0x1b0] */ ARM64("ldr x8, [x21, #0x1b0]");
    /* 0x00ba510c: cbz      x8, #0xba51e4 */ if (x8 == 0) goto loc_00ba51e4;
loc_00ba5110:
    /* 0x00ba5110: ldp      x8, x9, [x21, #0x1a0] */ ARM64("ldp x8, x9, [x21, #0x1a0]");
    /* 0x00ba5114: and      x10, x9, x24 */ ARM64("and x10, x9, x24");
    /* 0x00ba5118: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba511c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba5120: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba5124: cbz      x12, #0xba51c0 */ if (x12 == 0) goto loc_00ba51c0;
loc_00ba5128:
    /* 0x00ba5128: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00ba512c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba5130: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00ba5134: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00ba5138: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00ba513c: tbz      w10, #0x1f, #0xba51f4 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00ba51f4;
loc_00ba5140:
    /* 0x00ba5140: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00ba5144: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00ba5148: strb     w27, [x8, x11] */ ARM64("strb w27, [x8, x11]");
    /* 0x00ba514c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba5150: strb     w27, [x9, #8] */ ARM64("strb w27, [x9, #8]");
    /* 0x00ba5154: mov      w9, #0x28 */ ARM64("mov w9, #0x28");
    /* 0x00ba5158: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00ba515c: add      x21, x8, x9 */ ARM64("add x21, x8, x9");
    /* 0x00ba5160: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00ba5164: ldr      x10, [sp, #0x128] */ ARM64("ldr x10, [sp, #0x128]");
    /* 0x00ba5168: ldr      x9, [x10, #0x1b0] */ ARM64("ldr x9, [x10, #0x1b0]");
    /* 0x00ba516c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba5170: str      x8, [x10, #0x1b0] */ ARM64("str x8, [x10, #0x1b0]");
    /* 0x00ba5174: stur     x23, [x21, #-0x28] */ ARM64("stur x23, [x21, #-0x28]");
    /* 0x00ba5178: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba517c: stp      q1, q0, [x21, #-0x20] */ ARM64("stp q1, q0, [x21, #-0x20]");
    /* 0x00ba5180: ldr      x8, [x10, #0x1b8] */ ARM64("ldr x8, [x10, #0x1b8]");
    /* 0x00ba5184: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba5188: str      x8, [x10, #0x1b8] */ ARM64("str x8, [x10, #0x1b8]");
    /* 0x00ba518c: mov      x27, x28 */ ARM64("mov x27, x28");
loc_00ba5190:
    /* 0x00ba5190: mov      x28, x20 */ ARM64("mov x28, x20");
    /* 0x00ba5194: ldur     x8, [x21, #-0x10] */ ARM64("ldur x8, [x21, #-0x10]");
    /* 0x00ba5198: cbz      x8, #0xba51b0 */ if (x8 == 0) goto loc_00ba51b0;
loc_00ba519c:
    /* 0x00ba519c: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba51a0: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00ba51a4: ldp      x8, x9, [x21, #-0x20] */ ARM64("ldp x8, x9, [x21, #-0x20]");
    /* 0x00ba51a8: ldr      x12, [sp, #0x100] */ ARM64("ldr x12, [sp, #0x100]");
    /* 0x00ba51ac: b        #0xba4f30 */ goto loc_00ba4f30;
loc_00ba51b0:
    /* 0x00ba51b0: sub      x0, x21, #0x20 */ ARM64("sub x0, x21, #0x20");
    /* 0x00ba51b4: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00ba51b8: bl       #0xc6fef8 */ CALL_DIRECT(sub_00c6fef8);
    /* 0x00ba51bc: b        #0xba519c */ goto loc_00ba519c;
loc_00ba51c0:
    /* 0x00ba51c0: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00ba51c4:
    /* 0x00ba51c4: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00ba51c8: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00ba51cc: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00ba51d0: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba51d4: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00ba51d8: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00ba51dc: cbnz     x12, #0xba5128 */ if (x12 != 0) goto loc_00ba5128;
    /* 0x00ba51e0: b        #0xba51c4 */ goto loc_00ba51c4;
loc_00ba51e4:
    /* 0x00ba51e4: add      x0, x21, #0x1a0 */ ARM64("add x0, x21, #0x1a0");
    /* 0x00ba51e8: add      x1, x21, #0x1c0 */ ARM64("add x1, x21, #0x1c0");
    /* 0x00ba51ec: bl       #0xc7133c */ CALL_DIRECT(sub_00c7133c);
    /* 0x00ba51f0: b        #0xba5110 */ goto loc_00ba5110;
loc_00ba51f4:
    /* 0x00ba51f4: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba51f8: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba51fc: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba5200: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba5204: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba5208: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00ba520c: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00ba5210: b        #0xba5140 */ goto loc_00ba5140;
loc_00ba5214:
    /* 0x00ba5214: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba5218: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba521c: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba5220: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00ba5224: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00ba5228: lsr      x10, x10, #3 */ ARM64("lsr x10, x10, #3");
    /* 0x00ba522c: ldrb     w11, [x8, x10] */ ARM64("ldrb w11, [x8, x10]");
    /* 0x00ba5230: b        #0xba4fcc */ goto loc_00ba4fcc;
loc_00ba5234:
    /* 0x00ba5234: ldp      x25, x8, [sp, #0xa0] */ ARM64("ldp x25, x8, [sp, #0xa0]");
    /* 0x00ba5238: cbz      x8, #0xba4c20 */ if (x8 == 0) goto loc_00ba4c20;
    /* 0x00ba523c: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00ba5240: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba5244: b        #0xba4c20 */ goto loc_00ba4c20;
loc_00ba5248:
    /* 0x00ba5248: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba524c: mov      w23, #8 */ ARM64("mov w23, #8");
loc_00ba5250:
    /* 0x00ba5250: stp      x21, x23, [sp, #0x130] */ ARM64("stp x21, x23, [sp, #0x130]");
    /* 0x00ba5254: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba5258: cbnz     x21, #0xba4ce8 */ if (x21 != 0) goto loc_00ba4ce8;
    /* 0x00ba525c: b        #0xba4d64 */ goto loc_00ba4d64;
loc_00ba5260:
    /* 0x00ba5260: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00ba5264: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00ba5268: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba526c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba5270:
    /* 0x00ba5270: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00ba5274:
    /* 0x00ba5274: ldr      x1, [sp, #0x20] */ ARM64("ldr x1, [sp, #0x20]");
    /* 0x00ba5278: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba527c: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba5280: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba5284:
    /* 0x00ba5284: ldr      x8, [sp, #0x2d0] */ ARM64("ldr x8, [sp, #0x2d0]");
    /* 0x00ba5288: cbz      x8, #0xba5294 */ if (x8 == 0) goto loc_00ba5294;
    /* 0x00ba528c: ldr      x0, [sp, #0x2d8] */ ARM64("ldr x0, [sp, #0x2d8]");
    /* 0x00ba5290: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba5294:
    /* 0x00ba5294: ldr      x8, [sp, #0x2f0] */ ARM64("ldr x8, [sp, #0x2f0]");
    /* 0x00ba5298: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba529c: cbz      x8, #0xba52c4 */ if (x8 == 0) goto loc_00ba52c4;
    /* 0x00ba52a0: lsl      x9, x8, #2 */ ARM64("lsl x9, x8, #2");
    /* 0x00ba52a4: add      x9, x9, #0xb */ ARM64("add x9, x9, #0xb");
    /* 0x00ba52a8: and      x9, x9, #0xfffffffffffffff8 */ ARM64("and x9, x9, #0xfffffffffffffff8");
    /* 0x00ba52ac: add      x8, x8, x9 */ ARM64("add x8, x8, x9");
    /* 0x00ba52b0: cmn      x8, #9 */ ARM64("cmn x8, #9");
    /* 0x00ba52b4: b.eq     #0xba52c4 */ if (COND_EQ) goto loc_00ba52c4;
    /* 0x00ba52b8: ldr      x8, [sp, #0x2e8] */ ARM64("ldr x8, [sp, #0x2e8]");
    /* 0x00ba52bc: sub      x0, x8, x9 */ ARM64("sub x0, x8, x9");
    /* 0x00ba52c0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba52c4:
    /* 0x00ba52c4: cbz      x25, #0xba52e8 */ if (x25 == 0) goto loc_00ba52e8;
    /* 0x00ba52c8: lsl      x8, x25, #3 */ ARM64("lsl x8, x25, #3");
    /* 0x00ba52cc: add      x9, x8, x25 */ ARM64("add x9, x8, x25");
    /* 0x00ba52d0: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00ba52d4: b.eq     #0xba52e8 */ if (COND_EQ) goto loc_00ba52e8;
    /* 0x00ba52d8: ldr      x9, [sp, #0x68] */ ARM64("ldr x9, [sp, #0x68]");
    /* 0x00ba52dc: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba52e0: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba52e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba52e8:
    /* 0x00ba52e8: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba52ec: ldr      w9, [x8, #0x78] */ ARM64("ldr w9, [x8, #0x78]");
    /* 0x00ba52f0: cmp      w9, #1 */ ARM64("cmp w9, #1");
    /* 0x00ba52f4: b.ne     #0xba76ac */ if (COND_NE) goto loc_00ba76ac;
    /* 0x00ba52f8: ldr      w8, [x8, #0x7c] */ ARM64("ldr w8, [x8, #0x7c]");
    /* 0x00ba52fc: str      w8, [sp, #0x110] */ ARM64("str w8, [sp, #0x110]");
    /* 0x00ba5300: ldr      x21, [x28, #0x78] */ ARM64("ldr x21, [x28, #0x78]");
    /* 0x00ba5304: ldr      x20, [sp, #0xd0] */ ARM64("ldr x20, [sp, #0xd0]");
    /* 0x00ba5308: ldrb     w8, [x20, #0x10] */ ARM64("ldrb w8, [x20, #0x10]");
    /* 0x00ba530c: tbz      w8, #0, #0xba76b8 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba76b8;
loc_00ba5310:
    /* 0x00ba5310: ldp      x24, x25, [x20] */ ARM64("ldp x24, x25, [x20]");
    /* 0x00ba5314: add      x8, x24, #1 */ ARM64("add x8, x24, #1");
    /* 0x00ba5318: str      x8, [x20] */ ARM64("str x8, [x20]");
    /* 0x00ba531c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba5320: mov      w1, #4 */ ARM64("mov w1, #4");
    /* 0x00ba5324: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00ba5328: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00ba532c: ldp      x22, x23, [sp, #0x130] */ ARM64("ldp x22, x23, [sp, #0x130]");
    /* 0x00ba5330: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba5334: stur     q0, [x29, #-0xb0] */ ARM64("stur q0, [x29, #-0xb0]");
    /* 0x00ba5338: ldrb     w8, [x20, #0x10] */ ARM64("ldrb w8, [x20, #0x10]");
    /* 0x00ba533c: tbz      w8, #0, #0xba76c8 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba76c8;
loc_00ba5340:
    /* 0x00ba5340: ldp      x26, x27, [x20] */ ARM64("ldp x26, x27, [x20]");
    /* 0x00ba5344: add      x8, x26, #1 */ ARM64("add x8, x26, #1");
    /* 0x00ba5348: str      x8, [x20] */ ARM64("str x8, [x20]");
    /* 0x00ba534c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba5350: mov      w1, #4 */ ARM64("mov w1, #4");
    /* 0x00ba5354: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00ba5358: bl       #0xb98708 */ CALL_DIRECT(sub_00b98708);
    /* 0x00ba535c: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba5360: add      x8, sp, #0x79 */ ARM64("add x8, sp, #0x79");
    /* 0x00ba5364: stur     q0, [x8, #0xff] */ ARM64("stur q0, [x8, #0xff]");
    /* 0x00ba5368: add      x8, sp, #0x89 */ ARM64("add x8, sp, #0x89");
    /* 0x00ba536c: stur     q1, [x8, #0xff] */ ARM64("stur q1, [x8, #0xff]");
    /* 0x00ba5370: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00ba5374: stp      xzr, x8, [sp, #0x130] */ ARM64("stp xzr, x8, [sp, #0x130]");
    /* 0x00ba5378: stp      x22, x23, [sp, #0x148] */ ARM64("stp x22, x23, [sp, #0x148]");
    /* 0x00ba537c: ldur     q0, [x29, #-0xb0] */ ARM64("ldur q0, [x29, #-0xb0]");
    /* 0x00ba5380: add      x8, sp, #0x59 */ ARM64("add x8, sp, #0x59");
    /* 0x00ba5384: stur     q0, [x8, #0xff] */ ARM64("stur q0, [x8, #0xff]");
    /* 0x00ba5388: stp      x24, x25, [sp, #0x168] */ ARM64("stp x24, x25, [sp, #0x168]");
    /* 0x00ba538c: stp      x26, x27, [sp, #0x198] */ ARM64("stp x26, x27, [sp, #0x198]");
    /* 0x00ba5390: str      xzr, [sp, #0x140] */ ARM64("str xzr, [sp, #0x140]");
    /* 0x00ba5394: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba5398: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00ba539c: ldr      x8, [sp, #0x138] */ ARM64("ldr x8, [sp, #0x138]");
    /* 0x00ba53a0: ldr      w9, [sp, #0x110] */ ARM64("ldr w9, [sp, #0x110]");
    /* 0x00ba53a4: str      w9, [x8] */ ARM64("str w9, [x8]");
    /* 0x00ba53a8: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba53ac: str      x8, [sp, #0x140] */ ARM64("str x8, [sp, #0x140]");
    /* 0x00ba53b0: ldp      q1, q0, [sp, #0x150] */ ARM64("ldp q1, q0, [sp, #0x150]");
    /* 0x00ba53b4: stp      q1, q0, [sp, #0x2f0] */ ARM64("stp q1, q0, [sp, #0x2f0]");
    /* 0x00ba53b8: ldr      x8, [sp, #0x1a0] */ ARM64("ldr x8, [sp, #0x1a0]");
    /* 0x00ba53bc: str      x8, [sp, #0x340] */ ARM64("str x8, [sp, #0x340]");
    /* 0x00ba53c0: ldp      q0, q1, [sp, #0x180] */ ARM64("ldp q0, q1, [sp, #0x180]");
    /* 0x00ba53c4: stp      q0, q1, [sp, #0x320] */ ARM64("stp q0, q1, [sp, #0x320]");
    /* 0x00ba53c8: ldr      q1, [sp, #0x170] */ ARM64("ldr q1, [sp, #0x170]");
    /* 0x00ba53cc: str      q1, [sp, #0x310] */ ARM64("str q1, [sp, #0x310]");
    /* 0x00ba53d0: add      x27, sp, #0x2d0 */ ARM64("add x27, sp, #0x2d0");
    /* 0x00ba53d4: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
    /* 0x00ba53d8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba53dc: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
    /* 0x00ba53e0: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba53e4: stp      q0, q1, [sp, #0x2d0] */ ARM64("stp q0, q1, [sp, #0x2d0]");
    /* 0x00ba53e8: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba53ec: add      x8, x8, #0xa10 */ ARM64("add x8, x8, #0xa10");
    /* 0x00ba53f0: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
loc_00ba53f4:
    /* 0x00ba53f4: ldr      x8, [sp, #0x2e0] */ ARM64("ldr x8, [sp, #0x2e0]");
    /* 0x00ba53f8: cbz      x8, #0xba5de4 */ if (x8 == 0) goto loc_00ba5de4;
    /* 0x00ba53fc: ldr      x22, [x28, #0xd8] */ ARM64("ldr x22, [x28, #0xd8]");
    /* 0x00ba5400: b        #0xba540c */ goto loc_00ba540c;
loc_00ba5404:
    /* 0x00ba5404: ldr      x8, [sp, #0x2e0] */ ARM64("ldr x8, [sp, #0x2e0]");
    /* 0x00ba5408: cbz      x8, #0xba5de4 */ if (x8 == 0) goto loc_00ba5de4;
loc_00ba540c:
    /* 0x00ba540c: ldr      x9, [sp, #0x2d8] */ ARM64("ldr x9, [sp, #0x2d8]");
    /* 0x00ba5410: add      x8, x9, x8, lsl #2 */ ARM64("add x8, x9, x8, lsl #2");
    /* 0x00ba5414: ldur     w24, [x8, #-4] */ ARM64("ldur w24, [x8, #-4]");
    /* 0x00ba5418: add      x0, x27, #0x18 */ ARM64("add x0, x27, #0x18");
    /* 0x00ba541c: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba5420: bl       #0xbd17cc */ CALL_DIRECT(sub_00bd17cc);
    /* 0x00ba5424: tbz      w0, #0, #0xba5454 */ if (((w0 >> #0) & 1) == 0) goto loc_00ba5454;
    /* 0x00ba5428: ldr      x8, [x22, #0x28] */ ARM64("ldr x8, [x22, #0x28]");
    /* 0x00ba542c: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00ba5430: b.ls     #0xba544c */ if (COND_LS) goto loc_00ba544c;
    /* 0x00ba5434: ldr      x8, [x22, #0x20] */ ARM64("ldr x8, [x22, #0x20]");
    /* 0x00ba5438: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba543c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba5440: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba5444: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba5448: b.ne     #0xba5478 */ if (COND_NE) goto loc_00ba5478;
loc_00ba544c:
    /* 0x00ba544c: mov      w21, #-1 */ ARM64("mov w21, #-1");
    /* 0x00ba5450: b        #0xba547c */ goto loc_00ba547c;
loc_00ba5454:
    /* 0x00ba5454: ldr      x8, [sp, #0x2e0] */ ARM64("ldr x8, [sp, #0x2e0]");
    /* 0x00ba5458: cbz      x8, #0xba5464 */ if (x8 == 0) goto loc_00ba5464;
    /* 0x00ba545c: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00ba5460: str      x8, [sp, #0x2e0] */ ARM64("str x8, [sp, #0x2e0]");
loc_00ba5464:
    /* 0x00ba5464: add      x0, x27, #0x48 */ ARM64("add x0, x27, #0x48");
    /* 0x00ba5468: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba546c: bl       #0xbd17cc */ CALL_DIRECT(sub_00bd17cc);
    /* 0x00ba5470: tbz      w0, #0, #0xba5404 */ if (((w0 >> #0) & 1) == 0) goto loc_00ba5404;
    /* 0x00ba5474: b        #0xba5684 */ goto loc_00ba5684;
loc_00ba5478:
    /* 0x00ba5478: ldr      w21, [x8, #0x18] */ ARM64("ldr w21, [x8, #0x18]");
loc_00ba547c:
    /* 0x00ba547c: ldp      x23, x24, [x22, #0x38] */ ARM64("ldp x23, x24, [x22, #0x38]");
    /* 0x00ba5480: mov      w25, #-1 */ ARM64("mov w25, #-1");
    /* 0x00ba5484: b        #0xba549c */ goto loc_00ba549c;
loc_00ba5488:
    /* 0x00ba5488: ldr      x8, [sp, #0x2d8] */ ARM64("ldr x8, [sp, #0x2d8]");
    /* 0x00ba548c: str      w26, [x8, x20, lsl #2] */ ARM64("str w26, [x8, x20, lsl #2]");
    /* 0x00ba5490: add      x8, x20, #1 */ ARM64("add x8, x20, #1");
    /* 0x00ba5494: str      x8, [sp, #0x2e0] */ ARM64("str x8, [sp, #0x2e0]");
    /* 0x00ba5498: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
loc_00ba549c:
    /* 0x00ba549c: cmp      x24, x21 */ ARM64("cmp x24, x21");
    /* 0x00ba54a0: b.ls     #0xba54b4 */ if (COND_LS) goto loc_00ba54b4;
    /* 0x00ba54a4: madd     x8, x21, x20, x23 */ ARM64("madd x8, x21, x20, x23");
    /* 0x00ba54a8: ldr      w21, [x8, #0x20] */ ARM64("ldr w21, [x8, #0x20]");
    /* 0x00ba54ac: ldr      w26, [x8, #0x2c] */ ARM64("ldr w26, [x8, #0x2c]");
    /* 0x00ba54b0: b        #0xba54cc */ goto loc_00ba54cc;
loc_00ba54b4:
    /* 0x00ba54b4: cmp      x24, x25 */ ARM64("cmp x24, x25");
    /* 0x00ba54b8: b.ls     #0xba5404 */ if (COND_LS) goto loc_00ba5404;
    /* 0x00ba54bc: madd     x8, x25, x20, x23 */ ARM64("madd x8, x25, x20, x23");
    /* 0x00ba54c0: ldp      w25, w26, [x8, #0x24] */ ARM64("ldp w25, w26, [x8, #0x24]");
    /* 0x00ba54c4: cmn      w26, #1 */ ARM64("cmn w26, #1");
    /* 0x00ba54c8: b.eq     #0xba54b4 */ if (COND_EQ) goto loc_00ba54b4;
loc_00ba54cc:
    /* 0x00ba54cc: ldr      x8, [sp, #0x300] */ ARM64("ldr x8, [sp, #0x300]");
    /* 0x00ba54d0: cbz      x8, #0xba5668 */ if (x8 == 0) goto loc_00ba5668;
    /* 0x00ba54d4: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba54d8: ldr      x9, [sp, #0x308] */ ARM64("ldr x9, [sp, #0x308]");
    /* 0x00ba54dc: ldr      x10, [sp, #0x310] */ ARM64("ldr x10, [sp, #0x310]");
    /* 0x00ba54e0: mov      x11, #0x6575 */ ARM64("mov x11, #0x6575");
    /* 0x00ba54e4: movk     x11, #0x7073, lsl #16 */ ARM64("movk x11, #0x7073, lsl #16");
    /* 0x00ba54e8: movk     x11, #0x6d65, lsl #32 */ ARM64("movk x11, #0x6d65, lsl #32");
    /* 0x00ba54ec: movk     x11, #0x736f, lsl #48 */ ARM64("movk x11, #0x736f, lsl #48");
    /* 0x00ba54f0: eor      x11, x9, x11 */ ARM64("eor x11, x9, x11");
    /* 0x00ba54f4: mov      x12, #0x6f6d */ ARM64("mov x12, #0x6f6d");
    /* 0x00ba54f8: movk     x12, #0x6e64, lsl #16 */ ARM64("movk x12, #0x6e64, lsl #16");
    /* 0x00ba54fc: movk     x12, #0x7261, lsl #32 */ ARM64("movk x12, #0x7261, lsl #32");
    /* 0x00ba5500: movk     x12, #0x646f, lsl #48 */ ARM64("movk x12, #0x646f, lsl #48");
    /* 0x00ba5504: eor      x12, x10, x12 */ ARM64("eor x12, x10, x12");
    /* 0x00ba5508: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00ba550c: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00ba5510: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00ba5514: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00ba5518: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00ba551c: orr      x13, x26, #0x400000000000000 */ ARM64("orr x13, x26, #0x400000000000000");
    /* 0x00ba5520: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00ba5524: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00ba5528: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00ba552c: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00ba5530: eor      x10, x10, x14 */ ARM64("eor x10, x10, x14");
    /* 0x00ba5534: eor      x10, x10, x13 */ ARM64("eor x10, x10, x13");
    /* 0x00ba5538: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba553c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba5540: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba5544: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba5548: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba554c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba5550: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba5554: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00ba5558: add      x9, x9, x12 */ ARM64("add x9, x9, x12");
    /* 0x00ba555c: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba5560: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba5564: eor      x9, x9, #0xff */ ARM64("eor x9, x9, #0xff");
    /* 0x00ba5568: add      x11, x11, x12 */ ARM64("add x11, x11, x12");
    /* 0x00ba556c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba5570: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba5574: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba5578: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba557c: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba5580: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba5584: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba5588: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba558c: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba5590: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba5594: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba5598: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00ba559c: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba55a0: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00ba55a4: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00ba55a8: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00ba55ac: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00ba55b0: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00ba55b4: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00ba55b8: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00ba55bc: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00ba55c0: eor      x11, x11, x12, ror #51 */ ARM64("eor x11, x11, x12, ror #51");
    /* 0x00ba55c4: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00ba55c8: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00ba55cc: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00ba55d0: eor      x10, x10, x11, ror #47 */ ARM64("eor x10, x10, x11, ror #47");
    /* 0x00ba55d4: eor      x10, x10, x9, ror #32 */ ARM64("eor x10, x10, x9, ror #32");
    /* 0x00ba55d8: eor      x11, x10, x9 */ ARM64("eor x11, x10, x9");
    /* 0x00ba55dc: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba55e0: ldr      x9, [sp, #0x2f0] */ ARM64("ldr x9, [sp, #0x2f0]");
    /* 0x00ba55e4: ldr      x10, [sp, #0x2e8] */ ARM64("ldr x10, [sp, #0x2e8]");
    /* 0x00ba55e8: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba55ec: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba55f0: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba55f4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba55f8: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba55fc: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba5600: b.eq     #0xba5630 */ if (COND_EQ) goto loc_00ba5630;
loc_00ba5604:
    /* 0x00ba5604: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba5608: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba560c: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba5610: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba5614: sub      x13, x10, x13, lsl #2 */ ARM64("sub x13, x10, x13, lsl #2");
    /* 0x00ba5618: ldur     w13, [x13, #-4] */ ARM64("ldur w13, [x13, #-4]");
    /* 0x00ba561c: cmp      x26, x13 */ ARM64("cmp x26, x13");
    /* 0x00ba5620: b.eq     #0xba549c */ if (COND_EQ) goto loc_00ba549c;
    /* 0x00ba5624: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba5628: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba562c: b.ne     #0xba5604 */ if (COND_NE) goto loc_00ba5604;
loc_00ba5630:
    /* 0x00ba5630: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba5634: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba5638: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba563c: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba5640: tbnz     w12, #0, #0xba5668 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba5668;
    /* 0x00ba5644: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba5648: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba564c: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba5650: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba5654: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba5658: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba565c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba5660: b.ne     #0xba5604 */ if (COND_NE) goto loc_00ba5604;
    /* 0x00ba5664: b        #0xba5630 */ goto loc_00ba5630;
loc_00ba5668:
    /* 0x00ba5668: ldr      x20, [sp, #0x2e0] */ ARM64("ldr x20, [sp, #0x2e0]");
    /* 0x00ba566c: ldr      x8, [sp, #0x2d0] */ ARM64("ldr x8, [sp, #0x2d0]");
    /* 0x00ba5670: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba5674: b.ne     #0xba5488 */ if (COND_NE) goto loc_00ba5488;
    /* 0x00ba5678: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba567c: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00ba5680: b        #0xba5488 */ goto loc_00ba5488;
loc_00ba5684:
    /* 0x00ba5684: ldr      x10, [x28, #0xd8] */ ARM64("ldr x10, [x28, #0xd8]");
    /* 0x00ba5688: ldr      x8, [x10, #0x28] */ ARM64("ldr x8, [x10, #0x28]");
    /* 0x00ba568c: cmp      x8, x24 */ ARM64("cmp x8, x24");
    /* 0x00ba5690: b.ls     #0xba56ac */ if (COND_LS) goto loc_00ba56ac;
    /* 0x00ba5694: ldr      x8, [x10, #0x20] */ ARM64("ldr x8, [x10, #0x20]");
    /* 0x00ba5698: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba569c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba56a0: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00ba56a4: cmp      x9, x11 */ ARM64("cmp x9, x11");
    /* 0x00ba56a8: b.ne     #0xba56b4 */ if (COND_NE) goto loc_00ba56b4;
loc_00ba56ac:
    /* 0x00ba56ac: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba56b0: b        #0xba56c0 */ goto loc_00ba56c0;
loc_00ba56b4:
    /* 0x00ba56b4: ldr      w8, [x8, #0x1c] */ ARM64("ldr w8, [x8, #0x1c]");
    /* 0x00ba56b8: mov      w9, #-1 */ ARM64("mov w9, #-1");
    /* 0x00ba56bc: orr      x8, x9, x8, lsl #32 */ ARM64("orr x8, x9, x8, lsl #32");
loc_00ba56c0:
    /* 0x00ba56c0: ldp      x9, x10, [x10, #0x38] */ ARM64("ldp x9, x10, [x10, #0x38]");
    /* 0x00ba56c4: str      x24, [sp, #0xa0] */ ARM64("str x24, [sp, #0xa0]");
loc_00ba56c8:
    /* 0x00ba56c8: mov      w12, w8 */ ARM64("mov w12, w8");
    /* 0x00ba56cc: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba56d0: b.ls     #0xba56ec */ if (COND_LS) goto loc_00ba56ec;
    /* 0x00ba56d4: mov      w11, w8 */ ARM64("mov w11, w8");
    /* 0x00ba56d8: umaddl   x12, w12, w20, x9 */ ARM64("umaddl x12, w12, w20, x9");
    /* 0x00ba56dc: ldr      w12, [x12, #0x20] */ ARM64("ldr w12, [x12, #0x20]");
    /* 0x00ba56e0: and      x8, x8, #0xffffffff00000000 */ ARM64("and x8, x8, #0xffffffff00000000");
    /* 0x00ba56e4: orr      x8, x8, x12 */ ARM64("orr x8, x8, x12");
    /* 0x00ba56e8: b        #0xba5710 */ goto loc_00ba5710;
loc_00ba56ec:
    /* 0x00ba56ec: lsr      x12, x8, #0x20 */ ARM64("lsr x12, x8, #0x20");
loc_00ba56f0:
    /* 0x00ba56f0: cmp      x10, x12 */ ARM64("cmp x10, x12");
    /* 0x00ba56f4: b.ls     #0xba5774 */ if (COND_LS) goto loc_00ba5774;
    /* 0x00ba56f8: mov      x11, x12 */ ARM64("mov x11, x12");
    /* 0x00ba56fc: madd     x13, x12, x20, x9 */ ARM64("madd x13, x12, x20, x9");
    /* 0x00ba5700: ldp      w12, w13, [x13, #0x24] */ ARM64("ldp w12, w13, [x13, #0x24]");
    /* 0x00ba5704: bfi      x8, x12, #0x20, #0x20 */ ARM64("bfi x8, x12, #0x20, #0x20");
    /* 0x00ba5708: cmn      w13, #1 */ ARM64("cmn w13, #1");
    /* 0x00ba570c: b.eq     #0xba56f0 */ if (COND_EQ) goto loc_00ba56f0;
loc_00ba5710:
    /* 0x00ba5710: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba5714: b.ls     #0xba7914 */ if (COND_LS) goto loc_00ba7914;
    /* 0x00ba5718: madd     x11, x11, x20, x9 */ ARM64("madd x11, x11, x20, x9");
    /* 0x00ba571c: ldr      x12, [x11] */ ARM64("ldr x12, [x11]");
    /* 0x00ba5720: mov      x13, #-0x8000000000000000 */ ARM64("mov x13, #-0x8000000000000000");
    /* 0x00ba5724: cmp      x12, x13 */ ARM64("cmp x12, x13");
    /* 0x00ba5728: b.eq     #0xba7914 */ if (COND_EQ) goto loc_00ba7914;
    /* 0x00ba572c: ldr      w12, [x11, #0x2c] */ ARM64("ldr w12, [x11, #0x2c]");
    /* 0x00ba5730: cmp      w12, w24 */ ARM64("cmp w12, w24");
    /* 0x00ba5734: b.ne     #0xba56c8 */ if (COND_NE) goto loc_00ba56c8;
    /* 0x00ba5738: ldr      x20, [x11, #0x10] */ ARM64("ldr x20, [x11, #0x10]");
    /* 0x00ba573c: lsl      x22, x20, #3 */ ARM64("lsl x22, x20, #3");
    /* 0x00ba5740: lsr      x8, x20, #0x3d */ ARM64("lsr x8, x20, #0x3d");
    /* 0x00ba5744: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba5748: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00ba574c: ccmp     x22, x8, #2, eq */ ARM64("ccmp x22, x8, #2, eq");
    /* 0x00ba5750: b.hi     #0xba72d8 */ if (COND_HI) goto loc_00ba72d8;
    /* 0x00ba5754: ldr      x21, [x11, #8] */ ARM64("ldr x21, [x11, #8]");
    /* 0x00ba5758: cbz      x22, #0xba5d80 */ if (x22 == 0) goto loc_00ba5d80;
    /* 0x00ba575c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba5760: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba5764: str      x0, [sp, #0x70] */ ARM64("str x0, [sp, #0x70]");
    /* 0x00ba5768: cbz      x0, #0xba7a30 */ if (x0 == 0) goto loc_00ba7a30;
    /* 0x00ba576c: mov      x8, x20 */ ARM64("mov x8, x20");
    /* 0x00ba5770: b        #0xba5d8c */ goto loc_00ba5d8c;
loc_00ba5774:
    /* 0x00ba5774: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00ba5778: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba577c: mov      w21, #8 */ ARM64("mov w21, #8");
loc_00ba5780:
    /* 0x00ba5780: lsl      x20, x20, #3 */ ARM64("lsl x20, x20, #3");
    /* 0x00ba5784: add      x9, x21, x20 */ ARM64("add x9, x21, x20");
    /* 0x00ba5788: str      x21, [sp, #0x130] */ ARM64("str x21, [sp, #0x130]");
    /* 0x00ba578c: stp      x8, x9, [sp, #0x140] */ ARM64("stp x8, x9, [sp, #0x140]");
loc_00ba5790:
    /* 0x00ba5790: cbz      x20, #0xba57a8 */ if (x20 == 0) goto loc_00ba57a8;
    /* 0x00ba5794: ldr      x1, [x21], #8 */ ARM64("ldr x1, [x21], #8");
    /* 0x00ba5798: sub      x20, x20, #8 */ ARM64("sub x20, x20, #8");
    /* 0x00ba579c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba57a0: bl       #0xba9a14 */ CALL_DIRECT(sub_00ba9a14);
    /* 0x00ba57a4: b        #0xba5790 */ goto loc_00ba5790;
loc_00ba57a8:
    /* 0x00ba57a8: str      x21, [sp, #0x138] */ ARM64("str x21, [sp, #0x138]");
    /* 0x00ba57ac: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba57b0: bl       #0xb8bec4 */ CALL_DIRECT(sub_00b8bec4);
    /* 0x00ba57b4: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba57b8: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00ba57bc: cmp      x9, x24 */ ARM64("cmp x9, x24");
    /* 0x00ba57c0: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
    /* 0x00ba57c4: b.ls     #0xba78dc */ if (COND_LS) goto loc_00ba78dc;
    /* 0x00ba57c8: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00ba57cc: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba57d0: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba57d4: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba57d8: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba57dc: b.eq     #0xba78dc */ if (COND_EQ) goto loc_00ba78dc;
    /* 0x00ba57e0: ldr      x11, [x8, #0x10] */ ARM64("ldr x11, [x8, #0x10]");
    /* 0x00ba57e4: cbz      x11, #0xba53f4 */ if (x11 == 0) goto loc_00ba53f4;
    /* 0x00ba57e8: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba57ec: str      x11, [sp, #0x78] */ ARM64("str x11, [sp, #0x78]");
    /* 0x00ba57f0: b        #0xba5800 */ goto loc_00ba5800;
loc_00ba57f4:
    /* 0x00ba57f4: add      x0, x0, #1 */ ARM64("add x0, x0, #1");
    /* 0x00ba57f8: cmp      x0, x11 */ ARM64("cmp x0, x11");
    /* 0x00ba57fc: b.eq     #0xba53f4 */ if (COND_EQ) goto loc_00ba53f4;
loc_00ba5800:
    /* 0x00ba5800: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba5804: ldr      x9, [x8, #0x28] */ ARM64("ldr x9, [x8, #0x28]");
    /* 0x00ba5808: cmp      x9, x24 */ ARM64("cmp x9, x24");
    /* 0x00ba580c: b.ls     #0xba78d0 */ if (COND_LS) goto loc_00ba78d0;
    /* 0x00ba5810: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00ba5814: add      x8, x8, x24, lsl #5 */ ARM64("add x8, x8, x24, lsl #5");
    /* 0x00ba5818: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba581c: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00ba5820: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00ba5824: b.eq     #0xba78d0 */ if (COND_EQ) goto loc_00ba78d0;
    /* 0x00ba5828: ldr      x1, [x8, #0x10] */ ARM64("ldr x1, [x8, #0x10]");
    /* 0x00ba582c: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00ba5830: b.hs     #0xba7944 */ if (COND_HS) goto loc_00ba7944;
    /* 0x00ba5834: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00ba5838: mov      w9, #0x108 */ ARM64("mov w9, #0x108");
    /* 0x00ba583c: madd     x23, x0, x9, x8 */ ARM64("madd x23, x0, x9, x8");
    /* 0x00ba5840: ldr      x8, [x23, #0x18] */ ARM64("ldr x8, [x23, #0x18]");
    /* 0x00ba5844: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00ba5848: b.ne     #0xba57f4 */ if (COND_NE) goto loc_00ba57f4;
    /* 0x00ba584c: str      x0, [sp, #0xa8] */ ARM64("str x0, [sp, #0xa8]");
    /* 0x00ba5850: mov      x24, #0 */ ARM64("mov x24, #0");
    /* 0x00ba5854: ldp      x9, x8, [x23, #0x28] */ ARM64("ldp x9, x8, [x23, #0x28]");
    /* 0x00ba5858: add      x8, x8, x8, lsl #1 */ ARM64("add x8, x8, x8, lsl #1");
    /* 0x00ba585c: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00ba5860: add      x25, x9, x8 */ ARM64("add x25, x9, x8");
    /* 0x00ba5864: cbz      x8, #0xba588c */ if (x8 == 0) goto loc_00ba588c;
loc_00ba5868:
    /* 0x00ba5868: mov      x26, x9 */ ARM64("mov x26, x9");
    /* 0x00ba586c: ldr      x10, [x26], #0x18 */ ARM64("ldr x10, [x26], #0x18");
    /* 0x00ba5870: mov      x11, #-0x8000000000000000 */ ARM64("mov x11, #-0x8000000000000000");
    /* 0x00ba5874: cmp      x10, x11 */ ARM64("cmp x10, x11");
    /* 0x00ba5878: b.eq     #0xba5898 */ if (COND_EQ) goto loc_00ba5898;
    /* 0x00ba587c: add      x24, x24, #1 */ ARM64("add x24, x24, #1");
    /* 0x00ba5880: sub      x8, x8, #0x18 */ ARM64("sub x8, x8, #0x18");
    /* 0x00ba5884: mov      x9, x26 */ ARM64("mov x9, x26");
    /* 0x00ba5888: cbnz     x8, #0xba5868 */ if (x8 != 0) goto loc_00ba5868;
loc_00ba588c:
    /* 0x00ba588c: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00ba5890: mov      w21, #8 */ ARM64("mov w21, #8");
    /* 0x00ba5894: b        #0xba59b8 */ goto loc_00ba59b8;
loc_00ba5898:
    /* 0x00ba5898: ldr      x20, [x9, #8] */ ARM64("ldr x20, [x9, #8]");
loc_00ba589c:
    /* 0x00ba589c: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba58a0: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba58a4: stxr     w10, x9, [x20] */ ARM64("stxr w10, x9, [x20]");
    /* 0x00ba58a8: cbnz     w10, #0xba589c */ if (w10 != 0) goto loc_00ba589c;
    /* 0x00ba58ac: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba58b0: ldr      x8, [x23, #0x48] */ ARM64("ldr x8, [x23, #0x48]");
    /* 0x00ba58b4: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00ba58b8: b.hs     #0xba58cc */ if (COND_HS) goto loc_00ba58cc;
    /* 0x00ba58bc: ldr      x8, [x23, #0x40] */ ARM64("ldr x8, [x23, #0x40]");
    /* 0x00ba58c0: add      x8, x8, x24, lsl #6 */ ARM64("add x8, x8, x24, lsl #6");
    /* 0x00ba58c4: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba58c8: cbz      x9, #0xba5d5c */ if (x9 == 0) goto loc_00ba5d5c;
loc_00ba58cc:
    /* 0x00ba58cc: mov      x21, #0 */ ARM64("mov x21, #0");
loc_00ba58d0:
    /* 0x00ba58d0: stp      x20, x21, [x29, #-0xb0] */ ARM64("stp x20, x21, [x29, #-0xb0]");
    /* 0x00ba58d4: mov      w0, #0x40 */ ARM64("mov w0, #0x40");
    /* 0x00ba58d8: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba58dc: cbz      x0, #0xba79e0 */ if (x0 == 0) goto loc_00ba79e0;
    /* 0x00ba58e0: stp      x20, x21, [x0] */ ARM64("stp x20, x21, [x0]");
    /* 0x00ba58e4: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00ba58e8: stp      x8, x0, [sp, #0x130] */ ARM64("stp x8, x0, [sp, #0x130]");
    /* 0x00ba58ec: mov      w22, #1 */ ARM64("mov w22, #1");
    /* 0x00ba58f0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba58f4: str      x8, [sp, #0x140] */ ARM64("str x8, [sp, #0x140]");
loc_00ba58f8:
    /* 0x00ba58f8: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
loc_00ba58fc:
    /* 0x00ba58fc: cmp      x26, x25 */ ARM64("cmp x26, x25");
    /* 0x00ba5900: b.eq     #0xba59b4 */ if (COND_EQ) goto loc_00ba59b4;
    /* 0x00ba5904: ldr      x8, [x26], #0x18 */ ARM64("ldr x8, [x26], #0x18");
    /* 0x00ba5908: add      x24, x24, #1 */ ARM64("add x24, x24, #1");
    /* 0x00ba590c: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00ba5910: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba5914: b.ne     #0xba58fc */ if (COND_NE) goto loc_00ba58fc;
    /* 0x00ba5918: ldur     x20, [x26, #-0x10] */ ARM64("ldur x20, [x26, #-0x10]");
loc_00ba591c:
    /* 0x00ba591c: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba5920: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5924: stxr     w10, x9, [x20] */ ARM64("stxr w10, x9, [x20]");
    /* 0x00ba5928: cbnz     w10, #0xba591c */ if (w10 != 0) goto loc_00ba591c;
    /* 0x00ba592c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5930: ldr      x8, [x23, #0x48] */ ARM64("ldr x8, [x23, #0x48]");
    /* 0x00ba5934: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00ba5938: b.hs     #0xba594c */ if (COND_HS) goto loc_00ba594c;
    /* 0x00ba593c: ldr      x8, [x23, #0x40] */ ARM64("ldr x8, [x23, #0x40]");
    /* 0x00ba5940: add      x8, x8, x24, lsl #6 */ ARM64("add x8, x8, x24, lsl #6");
    /* 0x00ba5944: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba5948: cbz      x9, #0xba5990 */ if (x9 == 0) goto loc_00ba5990;
loc_00ba594c:
    /* 0x00ba594c: mov      x21, #0 */ ARM64("mov x21, #0");
loc_00ba5950:
    /* 0x00ba5950: stp      x20, x21, [x29, #-0xb0] */ ARM64("stp x20, x21, [x29, #-0xb0]");
    /* 0x00ba5954: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba5958: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba595c: b.ne     #0xba597c */ if (COND_NE) goto loc_00ba597c;
    /* 0x00ba5960: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba5964: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba5968: mov      w2, #1 */ ARM64("mov w2, #1");
    /* 0x00ba596c: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00ba5970: mov      w4, #0x10 */ ARM64("mov w4, #0x10");
    /* 0x00ba5974: bl       #0xc736c8 */ CALL_DIRECT(sub_00c736c8);
    /* 0x00ba5978: ldr      x0, [sp, #0x138] */ ARM64("ldr x0, [sp, #0x138]");
loc_00ba597c:
    /* 0x00ba597c: add      x8, x0, x22, lsl #4 */ ARM64("add x8, x0, x22, lsl #4");
    /* 0x00ba5980: stp      x20, x21, [x8] */ ARM64("stp x20, x21, [x8]");
    /* 0x00ba5984: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00ba5988: str      x22, [sp, #0x140] */ ARM64("str x22, [sp, #0x140]");
    /* 0x00ba598c: b        #0xba58f8 */ goto loc_00ba58f8;
loc_00ba5990:
    /* 0x00ba5990: ldr      x21, [x8, #8] */ ARM64("ldr x21, [x8, #8]");
loc_00ba5994:
    /* 0x00ba5994: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00ba5998: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba599c: stxr     w10, x9, [x21] */ ARM64("stxr w10, x9, [x21]");
    /* 0x00ba59a0: cbnz     w10, #0xba5994 */ if (w10 != 0) goto loc_00ba5994;
    /* 0x00ba59a4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba59a8: add      x27, sp, #0x2d0 */ ARM64("add x27, sp, #0x2d0");
    /* 0x00ba59ac: tbz      x8, #0x3f, #0xba5950 */ if (((x8 >> #0x3f) & 1) == 0) goto loc_00ba5950;
    /* 0x00ba59b0: b        #0xba724c */ goto loc_00ba724c;
loc_00ba59b4:
    /* 0x00ba59b4: ldp      x8, x21, [sp, #0x130] */ ARM64("ldp x8, x21, [sp, #0x130]");
loc_00ba59b8:
    /* 0x00ba59b8: str      x21, [sp, #0x390] */ ARM64("str x21, [sp, #0x390]");
    /* 0x00ba59bc: str      x21, [sp, #0x398] */ ARM64("str x21, [sp, #0x398]");
    /* 0x00ba59c0: add      x23, x21, x22, lsl #4 */ ARM64("add x23, x21, x22, lsl #4");
    /* 0x00ba59c4: str      x8, [sp, #0x3a0] */ ARM64("str x8, [sp, #0x3a0]");
    /* 0x00ba59c8: str      x23, [sp, #0x3a8] */ ARM64("str x23, [sp, #0x3a8]");
    /* 0x00ba59cc: str      x23, [sp, #0xb0] */ ARM64("str x23, [sp, #0xb0]");
    /* 0x00ba59d0: cbnz     x22, #0xba59f0 */ if (x22 != 0) goto loc_00ba59f0;
loc_00ba59d4:
    /* 0x00ba59d4: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba59d8: bl       #0xbe71b0 */ CALL_DIRECT(sub_00be71b0);
    /* 0x00ba59dc: ldp      x24, x0, [sp, #0xa0] */ ARM64("ldp x24, x0, [sp, #0xa0]");
    /* 0x00ba59e0: ldr      x11, [sp, #0x78] */ ARM64("ldr x11, [sp, #0x78]");
    /* 0x00ba59e4: b        #0xba57f4 */ goto loc_00ba57f4;
loc_00ba59e8:
    /* 0x00ba59e8: cmp      x21, x23 */ ARM64("cmp x21, x23");
    /* 0x00ba59ec: b.eq     #0xba59d4 */ if (COND_EQ) goto loc_00ba59d4;
loc_00ba59f0:
    /* 0x00ba59f0: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba59f4: add      x21, x21, #0x10 */ ARM64("add x21, x21, #0x10");
    /* 0x00ba59f8: str      x21, [sp, #0x398] */ ARM64("str x21, [sp, #0x398]");
    /* 0x00ba59fc: ldp      x25, x26, [x8] */ ARM64("ldp x25, x26, [x8]");
    /* 0x00ba5a00: cbz      x26, #0xba5d24 */ if (x26 == 0) goto loc_00ba5d24;
loc_00ba5a04:
    /* 0x00ba5a04: ldxr     x8, [x26] */ ARM64("ldxr x8, [x26]");
    /* 0x00ba5a08: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5a0c: stxr     w10, x9, [x26] */ ARM64("stxr w10, x9, [x26]");
    /* 0x00ba5a10: cbnz     w10, #0xba5a04 */ if (w10 != 0) goto loc_00ba5a04;
    /* 0x00ba5a14: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5a18: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba5a1c: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00ba5a20: bl       #0xba9a14 */ CALL_DIRECT(sub_00ba9a14);
    /* 0x00ba5a24: ldr      x24, [x0] */ ARM64("ldr x24, [x0]");
    /* 0x00ba5a28: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba5a2c: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba5a30: str      x8, [x24] */ ARM64("str x8, [x24]");
    /* 0x00ba5a34: b.hs     #0xba7a2c */ if (COND_HS) goto loc_00ba7a2c;
    /* 0x00ba5a38: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba5a3c: str      x24, [sp, #0x110] */ ARM64("str x24, [sp, #0x110]");
    /* 0x00ba5a40: cbnz     x8, #0xba7584 */ if (x8 != 0) goto loc_00ba7584;
    /* 0x00ba5a44: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba5a48: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
loc_00ba5a4c:
    /* 0x00ba5a4c: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba5a50: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5a54: stxr     w10, x9, [x25] */ ARM64("stxr w10, x9, [x25]");
    /* 0x00ba5a58: cbnz     w10, #0xba5a4c */ if (w10 != 0) goto loc_00ba5a4c;
    /* 0x00ba5a5c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5a60: add      x0, x24, #0x18 */ ARM64("add x0, x24, #0x18");
    /* 0x00ba5a64: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00ba5a68: bl       #0xbb081c */ CALL_DIRECT(sub_00bb081c);
    /* 0x00ba5a6c: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba5a70: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba5a74: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
loc_00ba5a78:
    /* 0x00ba5a78: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba5a7c: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5a80: stxr     w10, x9, [x25] */ ARM64("stxr w10, x9, [x25]");
    /* 0x00ba5a84: cbnz     w10, #0xba5a78 */ if (w10 != 0) goto loc_00ba5a78;
    /* 0x00ba5a88: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5a8c: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba5a90: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba5a94: str      x8, [x24] */ ARM64("str x8, [x24]");
    /* 0x00ba5a98: b.hs     #0xba7a2c */ if (COND_HS) goto loc_00ba7a2c;
    /* 0x00ba5a9c: add      x0, x28, #0x100 */ ARM64("add x0, x28, #0x100");
    /* 0x00ba5aa0: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00ba5aa4: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba5aa8: bl       #0xbafed4 */ CALL_DIRECT(sub_00bafed4);
    /* 0x00ba5aac: cbz      x0, #0xba5cec */ if (x0 == 0) goto loc_00ba5cec;
    /* 0x00ba5ab0: str      x21, [sp, #0xd8] */ ARM64("str x21, [sp, #0xd8]");
    /* 0x00ba5ab4: ldr      x8, [x0, #0x10] */ ARM64("ldr x8, [x0, #0x10]");
    /* 0x00ba5ab8: str      x0, [sp, #0x100] */ ARM64("str x0, [sp, #0x100]");
    /* 0x00ba5abc: cbnz     x8, #0xba75e8 */ if (x8 != 0) goto loc_00ba75e8;
    /* 0x00ba5ac0: ldur     q0, [x0, #0x18] */ ARM64("ldur q0, [x0, #0x18]");
    /* 0x00ba5ac4: ldur     q1, [x0, #0x28] */ ARM64("ldur q1, [x0, #0x28]");
    /* 0x00ba5ac8: stp      q0, q1, [x29, #-0xf0] */ ARM64("stp q0, q1, [x29, #-0xf0]");
    /* 0x00ba5acc: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba5ad0: stur     q1, [x0, #0x18] */ ARM64("stur q1, [x0, #0x18]");
    /* 0x00ba5ad4: stur     q0, [x0, #0x28] */ ARM64("stur q0, [x0, #0x28]");
    /* 0x00ba5ad8: ldur     x28, [x29, #-0xf0] */ ARM64("ldur x28, [x29, #-0xf0]");
    /* 0x00ba5adc: ldur     x23, [x29, #-0xd8] */ ARM64("ldur x23, [x29, #-0xd8]");
    /* 0x00ba5ae0: mov      x20, x28 */ ARM64("mov x20, x28");
    /* 0x00ba5ae4: ldr      d0, [x20], #8 */ ARM64("ldr d0, [x20], #8");
    /* 0x00ba5ae8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba5aec: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba5af0: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00ba5af4: mov      x21, x23 */ ARM64("mov x21, x23");
    /* 0x00ba5af8: mov      x22, x20 */ ARM64("mov x22, x20");
    /* 0x00ba5afc: mov      x24, x28 */ ARM64("mov x24, x28");
loc_00ba5b00:
    /* 0x00ba5b00: cbz      x21, #0xba5b90 */ if (x21 == 0) goto loc_00ba5b90;
    /* 0x00ba5b04: cbnz     x27, #0xba5b20 */ if (x27 != 0) goto loc_00ba5b20;
loc_00ba5b08:
    /* 0x00ba5b08: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00ba5b0c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba5b10: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba5b14: sub      x24, x24, #0x40 */ ARM64("sub x24, x24, #0x40");
    /* 0x00ba5b18: and      x27, x8, #0x8080808080808080 */ ARM64("and x27, x8, #0x8080808080808080");
    /* 0x00ba5b1c: cbz      x27, #0xba5b08 */ if (x27 == 0) goto loc_00ba5b08;
loc_00ba5b20:
    /* 0x00ba5b20: sub      x8, x27, #1 */ ARM64("sub x8, x27, #1");
    /* 0x00ba5b24: rbit     x9, x27 */ ARM64("rbit x9, x27");
    /* 0x00ba5b28: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba5b2c: and      x27, x8, x27 */ ARM64("and x27, x8, x27");
    /* 0x00ba5b30: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00ba5b34: sub      x8, x24, x8 */ ARM64("sub x8, x24, x8");
    /* 0x00ba5b38: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00ba5b3c: ldur     x1, [x8, #-8] */ ARM64("ldur x1, [x8, #-8]");
loc_00ba5b40:
    /* 0x00ba5b40: ldxr     x8, [x1] */ ARM64("ldxr x8, [x1]");
    /* 0x00ba5b44: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5b48: stxr     w10, x9, [x1] */ ARM64("stxr w10, x9, [x1]");
    /* 0x00ba5b4c: cbnz     w10, #0xba5b40 */ if (w10 != 0) goto loc_00ba5b40;
    /* 0x00ba5b50: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5b54: ldr      x2, [sp, #0x110] */ ARM64("ldr x2, [sp, #0x110]");
    /* 0x00ba5b58: ldr      x8, [x2] */ ARM64("ldr x8, [x2]");
    /* 0x00ba5b5c: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba5b60: str      x8, [x2] */ ARM64("str x8, [x2]");
    /* 0x00ba5b64: b.hs     #0xba7a2c */ if (COND_HS) goto loc_00ba7a2c;
    /* 0x00ba5b68: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba5b6c: add      x0, x8, #0x100 */ ARM64("add x0, x8, #0x100");
    /* 0x00ba5b70: bl       #0xbafed4 */ CALL_DIRECT(sub_00bafed4);
    /* 0x00ba5b74: cbz      x0, #0xba5b00 */ if (x0 == 0) goto loc_00ba5b00;
    /* 0x00ba5b78: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba5b7c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5b80: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba5b84: b.ne     #0xba5b00 */ if (COND_NE) goto loc_00ba5b00;
    /* 0x00ba5b88: bl       #0xbdc2b4 */ CALL_DIRECT(sub_00bdc2b4);
    /* 0x00ba5b8c: b        #0xba5b00 */ goto loc_00ba5b00;
loc_00ba5b90:
    /* 0x00ba5b90: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba5b94: ldr      x8, [x9, #0x10] */ ARM64("ldr x8, [x9, #0x10]");
    /* 0x00ba5b98: cbnz     x8, #0xba75f8 */ if (x8 != 0) goto loc_00ba75f8;
    /* 0x00ba5b9c: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba5ba0: str      x8, [x9, #0x10] */ ARM64("str x8, [x9, #0x10]");
    /* 0x00ba5ba4: ldur     x10, [x29, #-0xe8] */ ARM64("ldur x10, [x29, #-0xe8]");
    /* 0x00ba5ba8: cbz      x10, #0xba5bc8 */ if (x10 == 0) goto loc_00ba5bc8;
    /* 0x00ba5bac: lsl      x8, x10, #3 */ ARM64("lsl x8, x10, #3");
    /* 0x00ba5bb0: add      x9, x8, x10 */ ARM64("add x9, x8, x10");
    /* 0x00ba5bb4: add      x9, x9, #0x11 */ ARM64("add x9, x9, #0x11");
    /* 0x00ba5bb8: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00ba5bbc: sub      x21, x8, #8 */ ARM64("sub x21, x8, #8");
    /* 0x00ba5bc0: mov      w24, #8 */ ARM64("mov w24, #8");
    /* 0x00ba5bc4: b        #0xba5bcc */ goto loc_00ba5bcc;
loc_00ba5bc8:
    /* 0x00ba5bc8: mov      x24, #0 */ ARM64("mov x24, #0");
loc_00ba5bcc:
    /* 0x00ba5bcc: str      x9, [sp, #0xd0] */ ARM64("str x9, [sp, #0xd0]");
    /* 0x00ba5bd0: ldr      d0, [x28] */ ARM64("ldr d0, [x28]");
    /* 0x00ba5bd4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba5bd8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba5bdc: and      x22, x8, #0x8080808080808080 */ ARM64("and x22, x8, #0x8080808080808080");
    /* 0x00ba5be0: str      x10, [sp, #0xc0] */ ARM64("str x10, [sp, #0xc0]");
    /* 0x00ba5be4: add      x8, x28, x10 */ ARM64("add x8, x28, x10");
    /* 0x00ba5be8: add      x27, x8, #1 */ ARM64("add x27, x8, #1");
    /* 0x00ba5bec: stp      x24, x9, [x29, #-0xb0] */ ARM64("stp x24, x9, [x29, #-0xb0]");
    /* 0x00ba5bf0: stp      x21, x28, [x29, #-0xa0] */ ARM64("stp x21, x28, [x29, #-0xa0]");
    /* 0x00ba5bf4: stp      x22, x20, [x29, #-0x90] */ ARM64("stp x22, x20, [x29, #-0x90]");
    /* 0x00ba5bf8: stp      x27, x23, [x29, #-0x80] */ ARM64("stp x27, x23, [x29, #-0x80]");
    /* 0x00ba5bfc: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba5c00: ldp      x9, x8, [x9, #0x28] */ ARM64("ldp x9, x8, [x9, #0x28]");
    /* 0x00ba5c04: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba5c08: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00ba5c0c: lsr      x8, x8, #1 */ ARM64("lsr x8, x8, #1");
    /* 0x00ba5c10: csel     x1, x23, x8, eq */ ARM64("csel x1, x23, x8, eq");
    /* 0x00ba5c14: cmp      x1, x9 */ ARM64("cmp x1, x9");
    /* 0x00ba5c18: b.hi     #0xba5d48 */ if (COND_HI) goto loc_00ba5d48;
loc_00ba5c1c:
    /* 0x00ba5c1c: ldr      x8, [sp, #0xd0] */ ARM64("ldr x8, [sp, #0xd0]");
    /* 0x00ba5c20: stp      x24, x8, [sp, #0x130] */ ARM64("stp x24, x8, [sp, #0x130]");
    /* 0x00ba5c24: stp      x21, x28, [sp, #0x140] */ ARM64("stp x21, x28, [sp, #0x140]");
    /* 0x00ba5c28: stp      x22, x20, [sp, #0x150] */ ARM64("stp x22, x20, [sp, #0x150]");
    /* 0x00ba5c2c: stp      x27, x23, [sp, #0x160] */ ARM64("stp x27, x23, [sp, #0x160]");
    /* 0x00ba5c30: ldr      x24, [sp, #0x110] */ ARM64("ldr x24, [sp, #0x110]");
    /* 0x00ba5c34: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00ba5c38: mov      x27, x21 */ ARM64("mov x27, x21");
    /* 0x00ba5c3c: mov      x21, x8 */ ARM64("mov x21, x8");
    /* 0x00ba5c40: b        #0xba5c74 */ goto loc_00ba5c74;
loc_00ba5c44:
    /* 0x00ba5c44: sub      x8, x22, #1 */ ARM64("sub x8, x22, #1");
    /* 0x00ba5c48: rbit     x9, x22 */ ARM64("rbit x9, x22");
    /* 0x00ba5c4c: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00ba5c50: and      x22, x8, x22 */ ARM64("and x22, x8, x22");
    /* 0x00ba5c54: and      x8, x9, #0x78 */ ARM64("and x8, x9, #0x78");
    /* 0x00ba5c58: sub      x8, x28, x8 */ ARM64("sub x8, x28, x8");
    /* 0x00ba5c5c: sub      x23, x23, #1 */ ARM64("sub x23, x23, #1");
    /* 0x00ba5c60: ldur     x1, [x8, #-8] */ ARM64("ldur x1, [x8, #-8]");
    /* 0x00ba5c64: add      x0, x24, #0x18 */ ARM64("add x0, x24, #0x18");
    /* 0x00ba5c68: bl       #0xbb081c */ CALL_DIRECT(sub_00bb081c);
    /* 0x00ba5c6c: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba5c70: mov      x8, x21 */ ARM64("mov x8, x21");
loc_00ba5c74:
    /* 0x00ba5c74: cbz      x23, #0xba5c98 */ if (x23 == 0) goto loc_00ba5c98;
    /* 0x00ba5c78: cbnz     x22, #0xba5c44 */ if (x22 != 0) goto loc_00ba5c44;
loc_00ba5c7c:
    /* 0x00ba5c7c: ldr      d0, [x20], #8 */ ARM64("ldr d0, [x20], #8");
    /* 0x00ba5c80: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba5c84: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba5c88: sub      x28, x28, #0x40 */ ARM64("sub x28, x28, #0x40");
    /* 0x00ba5c8c: and      x22, x8, #0x8080808080808080 */ ARM64("and x22, x8, #0x8080808080808080");
    /* 0x00ba5c90: cbz      x22, #0xba5c7c */ if (x22 == 0) goto loc_00ba5c7c;
    /* 0x00ba5c94: b        #0xba5c44 */ goto loc_00ba5c44;
loc_00ba5c98:
    /* 0x00ba5c98: stp      x28, x22, [sp, #0x148] */ ARM64("stp x28, x22, [sp, #0x148]");
    /* 0x00ba5c9c: str      xzr, [sp, #0x168] */ ARM64("str xzr, [sp, #0x168]");
    /* 0x00ba5ca0: str      x20, [sp, #0x158] */ ARM64("str x20, [sp, #0x158]");
    /* 0x00ba5ca4: cbz      x8, #0xba5cb4 */ if (x8 == 0) goto loc_00ba5cb4;
    /* 0x00ba5ca8: ldr      x8, [sp, #0xc0] */ ARM64("ldr x8, [sp, #0xc0]");
    /* 0x00ba5cac: cbz      x8, #0xba5cb4 */ if (x8 == 0) goto loc_00ba5cb4;
    /* 0x00ba5cb0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba5cb4:
    /* 0x00ba5cb4: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba5cb8: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba5cbc: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba5cc0: ldr      x0, [sp, #0x100] */ ARM64("ldr x0, [sp, #0x100]");
    /* 0x00ba5cc4: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba5cc8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5ccc: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba5cd0: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba5cd4: mov      w20, #0x30 */ ARM64("mov w20, #0x30");
    /* 0x00ba5cd8: ldr      x21, [sp, #0xd8] */ ARM64("ldr x21, [sp, #0xd8]");
    /* 0x00ba5cdc: ldr      x23, [sp, #0xb0] */ ARM64("ldr x23, [sp, #0xb0]");
    /* 0x00ba5ce0: add      x27, sp, #0x2d0 */ ARM64("add x27, sp, #0x2d0");
    /* 0x00ba5ce4: b.ne     #0xba5cec */ if (COND_NE) goto loc_00ba5cec;
    /* 0x00ba5ce8: bl       #0xbdc2b4 */ CALL_DIRECT(sub_00bdc2b4);
loc_00ba5cec:
    /* 0x00ba5cec: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba5cf0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5cf4: str      x8, [x24] */ ARM64("str x8, [x24]");
    /* 0x00ba5cf8: b.ne     #0xba5d04 */ if (COND_NE) goto loc_00ba5d04;
    /* 0x00ba5cfc: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba5d00: bl       #0xbdc2b4 */ CALL_DIRECT(sub_00bdc2b4);
loc_00ba5d04:
    /* 0x00ba5d04: ldxr     x8, [x26] */ ARM64("ldxr x8, [x26]");
    /* 0x00ba5d08: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5d0c: stlxr    w9, x8, [x26] */ ARM64("stlxr w9, x8, [x26]");
    /* 0x00ba5d10: cbnz     w9, #0xba5d04 */ if (w9 != 0) goto loc_00ba5d04;
    /* 0x00ba5d14: b.ne     #0xba5d24 */ if (COND_NE) goto loc_00ba5d24;
    /* 0x00ba5d18: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba5d1c: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00ba5d20: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba5d24:
    /* 0x00ba5d24: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba5d28: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5d2c: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba5d30: cbnz     w9, #0xba5d24 */ if (w9 != 0) goto loc_00ba5d24;
    /* 0x00ba5d34: b.ne     #0xba59e8 */ if (COND_NE) goto loc_00ba59e8;
    /* 0x00ba5d38: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba5d3c: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba5d40: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba5d44: b        #0xba59e8 */ goto loc_00ba59e8;
loc_00ba5d48:
    /* 0x00ba5d48: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba5d4c: add      x0, x8, #0x18 */ ARM64("add x0, x8, #0x18");
    /* 0x00ba5d50: add      x2, x8, #0x38 */ ARM64("add x2, x8, #0x38");
    /* 0x00ba5d54: bl       #0xc6e2f4 */ CALL_DIRECT(sub_00c6e2f4);
    /* 0x00ba5d58: b        #0xba5c1c */ goto loc_00ba5c1c;
loc_00ba5d5c:
    /* 0x00ba5d5c: ldr      x21, [x8, #8] */ ARM64("ldr x21, [x8, #8]");
loc_00ba5d60:
    /* 0x00ba5d60: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00ba5d64: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5d68: stxr     w10, x9, [x21] */ ARM64("stxr w10, x9, [x21]");
    /* 0x00ba5d6c: cbnz     w10, #0xba5d60 */ if (w10 != 0) goto loc_00ba5d60;
    /* 0x00ba5d70: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba5d74: add      x27, sp, #0x2d0 */ ARM64("add x27, sp, #0x2d0");
    /* 0x00ba5d78: tbz      x8, #0x3f, #0xba58d0 */ if (((x8 >> #0x3f) & 1) == 0) goto loc_00ba58d0;
    /* 0x00ba5d7c: b        #0xba724c */ goto loc_00ba724c;
loc_00ba5d80:
    /* 0x00ba5d80: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba5d84: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00ba5d88: str      x9, [sp, #0x70] */ ARM64("str x9, [sp, #0x70]");
loc_00ba5d8c:
    /* 0x00ba5d8c: cbz      x20, #0xba5dd0 */ if (x20 == 0) goto loc_00ba5dd0;
    /* 0x00ba5d90: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00ba5d94: mov      w14, #0x48 */ ARM64("mov w14, #0x48");
    /* 0x00ba5d98: ldr      x15, [sp, #0x70] */ ARM64("ldr x15, [sp, #0x70]");
loc_00ba5d9c:
    /* 0x00ba5d9c: mul      x10, x9, x14 */ ARM64("mul x10, x9, x14");
    /* 0x00ba5da0: ldr      x10, [x21, x10] */ ARM64("ldr x10, [x21, x10]");
loc_00ba5da4:
    /* 0x00ba5da4: ldxr     x11, [x10] */ ARM64("ldxr x11, [x10]");
    /* 0x00ba5da8: add      x12, x11, #1 */ ARM64("add x12, x11, #1");
    /* 0x00ba5dac: stxr     w13, x12, [x10] */ ARM64("stxr w13, x12, [x10]");
    /* 0x00ba5db0: cbnz     w13, #0xba5da4 */ if (w13 != 0) goto loc_00ba5da4;
    /* 0x00ba5db4: tbnz     x11, #0x3f, #0xba724c */ if (((x11 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5db8: str      x10, [x15, x9, lsl #3] */ ARM64("str x10, [x15, x9, lsl #3]");
    /* 0x00ba5dbc: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00ba5dc0: cmp      x9, x20 */ ARM64("cmp x9, x20");
    /* 0x00ba5dc4: b.ne     #0xba5d9c */ if (COND_NE) goto loc_00ba5d9c;
    /* 0x00ba5dc8: mov      x21, x15 */ ARM64("mov x21, x15");
    /* 0x00ba5dcc: b        #0xba5dd4 */ goto loc_00ba5dd4;
loc_00ba5dd0:
    /* 0x00ba5dd0: ldr      x21, [sp, #0x70] */ ARM64("ldr x21, [sp, #0x70]");
loc_00ba5dd4:
    /* 0x00ba5dd4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba5dd8: add      x27, sp, #0x2d0 */ ARM64("add x27, sp, #0x2d0");
    /* 0x00ba5ddc: ldr      x24, [sp, #0xa0] */ ARM64("ldr x24, [sp, #0xa0]");
    /* 0x00ba5de0: b        #0xba5780 */ goto loc_00ba5780;
loc_00ba5de4:
    /* 0x00ba5de4: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba5de8: bl       #0xba997c */ CALL_DIRECT(sub_00ba997c);
    /* 0x00ba5dec: ldp      x1, x8, [x28, #8] */ ARM64("ldp x1, x8, [x28, #8]");
    /* 0x00ba5df0: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba5df4: madd     x2, x8, x9, x1 */ ARM64("madd x2, x8, x9, x1");
    /* 0x00ba5df8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba5dfc: bl       #0xb9ca0c */ CALL_DIRECT(sub_00b9ca0c);
    /* 0x00ba5e00: ldp      x8, x21, [sp, #0x130] */ ARM64("ldp x8, x21, [sp, #0x130]");
    /* 0x00ba5e04: ldr      x9, [sp, #0x140] */ ARM64("ldr x9, [sp, #0x140]");
    /* 0x00ba5e08: add      x24, x21, x9, lsl #4 */ ARM64("add x24, x21, x9, lsl #4");
    /* 0x00ba5e0c: stp      x21, x21, [sp, #0x130] */ ARM64("stp x21, x21, [sp, #0x130]");
    /* 0x00ba5e10: stp      x8, x24, [sp, #0x140] */ ARM64("stp x8, x24, [sp, #0x140]");
    /* 0x00ba5e14: cbz      x9, #0xba603c */ if (x9 == 0) goto loc_00ba603c;
    /* 0x00ba5e18: mov      w25, #0x28 */ ARM64("mov w25, #0x28");
    /* 0x00ba5e1c: mov      x26, #-1 */ ARM64("mov x26, #-1");
    /* 0x00ba5e20: b        #0xba5e2c */ goto loc_00ba5e2c;
loc_00ba5e24:
    /* 0x00ba5e24: cmp      x21, x24 */ ARM64("cmp x21, x24");
    /* 0x00ba5e28: b.eq     #0xba603c */ if (COND_EQ) goto loc_00ba603c;
loc_00ba5e2c:
    /* 0x00ba5e2c: mov      x8, x21 */ ARM64("mov x8, x21");
    /* 0x00ba5e30: add      x21, x21, #0x10 */ ARM64("add x21, x21, #0x10");
    /* 0x00ba5e34: str      x21, [sp, #0x138] */ ARM64("str x21, [sp, #0x138]");
    /* 0x00ba5e38: ldp      x20, x22, [x8] */ ARM64("ldp x20, x22, [x8]");
loc_00ba5e3c:
    /* 0x00ba5e3c: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba5e40: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5e44: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba5e48: cbnz     w10, #0xba5e3c */ if (w10 != 0) goto loc_00ba5e3c;
    /* 0x00ba5e4c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5e50: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba5e54: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba5e58: bl       #0xba9cf8 */ CALL_DIRECT(sub_00ba9cf8);
    /* 0x00ba5e5c: ldr      x23, [x0] */ ARM64("ldr x23, [x0]");
    /* 0x00ba5e60: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00ba5e64: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba5e68: str      x8, [x23] */ ARM64("str x8, [x23]");
    /* 0x00ba5e6c: b.hs     #0xba7a2c */ if (COND_HS) goto loc_00ba7a2c;
    /* 0x00ba5e70: ldr      x8, [x28, #0x198] */ ARM64("ldr x8, [x28, #0x198]");
    /* 0x00ba5e74: cbz      x8, #0xba6000 */ if (x8 == 0) goto loc_00ba6000;
    /* 0x00ba5e78: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba5e7c: add      x9, x20, #8 */ ARM64("add x9, x20, #8");
    /* 0x00ba5e80: mul      x11, x9, x19 */ ARM64("mul x11, x9, x19");
    /* 0x00ba5e84: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba5e88: ldp      x10, x9, [x28, #0x180] */ ARM64("ldp x10, x9, [x28, #0x180]");
    /* 0x00ba5e8c: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba5e90: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba5e94: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba5e98: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba5e9c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba5ea0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba5ea4: b.eq     #0xba5ed8 */ if (COND_EQ) goto loc_00ba5ed8;
loc_00ba5ea8:
    /* 0x00ba5ea8: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba5eac: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba5eb0: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba5eb4: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba5eb8: mneg     x13, x13, x25 */ ARM64("mneg x13, x13, x25");
    /* 0x00ba5ebc: add      x13, x10, x13 */ ARM64("add x13, x10, x13");
    /* 0x00ba5ec0: ldur     x14, [x13, #-0x28] */ ARM64("ldur x14, [x13, #-0x28]");
    /* 0x00ba5ec4: cmp      x20, x14 */ ARM64("cmp x20, x14");
    /* 0x00ba5ec8: b.eq     #0xba5f10 */ if (COND_EQ) goto loc_00ba5f10;
    /* 0x00ba5ecc: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba5ed0: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba5ed4: b.ne     #0xba5ea8 */ if (COND_NE) goto loc_00ba5ea8;
loc_00ba5ed8:
    /* 0x00ba5ed8: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba5edc: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba5ee0: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba5ee4: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba5ee8: tbnz     w12, #0, #0xba6000 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba6000;
    /* 0x00ba5eec: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba5ef0: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba5ef4: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba5ef8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba5efc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba5f00: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba5f04: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba5f08: b.ne     #0xba5ea8 */ if (COND_NE) goto loc_00ba5ea8;
    /* 0x00ba5f0c: b        #0xba5ed8 */ goto loc_00ba5ed8;
loc_00ba5f10:
    /* 0x00ba5f10: ldr      x8, [x23, #0x10] */ ARM64("ldr x8, [x23, #0x10]");
    /* 0x00ba5f14: cbnz     x8, #0xba76d8 */ if (x8 != 0) goto loc_00ba76d8;
    /* 0x00ba5f18: ldur     x8, [x13, #-0x20] */ ARM64("ldur x8, [x13, #-0x20]");
    /* 0x00ba5f1c: str      x8, [sp, #0x2d0] */ ARM64("str x8, [sp, #0x2d0]");
    /* 0x00ba5f20: ldur     q0, [x13, #-0x10] */ ARM64("ldur q0, [x13, #-0x10]");
    /* 0x00ba5f24: str      x26, [x23, #0x10] */ ARM64("str x26, [x23, #0x10]");
    /* 0x00ba5f28: add      x8, sp, #0x1d9 */ ARM64("add x8, sp, #0x1d9");
    /* 0x00ba5f2c: stur     q0, [x8, #0xff] */ ARM64("stur q0, [x8, #0xff]");
loc_00ba5f30:
    /* 0x00ba5f30: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba5f34: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5f38: stxr     w10, x9, [x20] */ ARM64("stxr w10, x9, [x20]");
    /* 0x00ba5f3c: cbnz     w10, #0xba5f30 */ if (w10 != 0) goto loc_00ba5f30;
    /* 0x00ba5f40: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5f44: add      x0, x23, #0x18 */ ARM64("add x0, x23, #0x18");
    /* 0x00ba5f48: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba5f4c: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x00ba5f50: bl       #0xbcf85c */ CALL_DIRECT(sub_00bcf85c);
    /* 0x00ba5f54: cbz      x0, #0xba5f74 */ if (x0 == 0) goto loc_00ba5f74;
loc_00ba5f58:
    /* 0x00ba5f58: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba5f5c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5f60: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba5f64: cbnz     w9, #0xba5f58 */ if (w9 != 0) goto loc_00ba5f58;
    /* 0x00ba5f68: b.ne     #0xba5f74 */ if (COND_NE) goto loc_00ba5f74;
    /* 0x00ba5f6c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba5f70: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba5f74:
    /* 0x00ba5f74: ldr      x8, [x23, #0x10] */ ARM64("ldr x8, [x23, #0x10]");
    /* 0x00ba5f78: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba5f7c: str      x8, [x23, #0x10] */ ARM64("str x8, [x23, #0x10]");
loc_00ba5f80:
    /* 0x00ba5f80: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba5f84: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba5f88: stxr     w10, x9, [x20] */ ARM64("stxr w10, x9, [x20]");
    /* 0x00ba5f8c: cbnz     w10, #0xba5f80 */ if (w10 != 0) goto loc_00ba5f80;
    /* 0x00ba5f90: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba5f94: add      x0, x28, #0x120 */ ARM64("add x0, x28, #0x120");
    /* 0x00ba5f98: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00ba5f9c: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00ba5fa0: bl       #0xbafce0 */ CALL_DIRECT(sub_00bafce0);
    /* 0x00ba5fa4: cbz      x0, #0xba5fbc */ if (x0 == 0) goto loc_00ba5fbc;
    /* 0x00ba5fa8: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba5fac: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5fb0: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba5fb4: b.ne     #0xba5fbc */ if (COND_NE) goto loc_00ba5fbc;
    /* 0x00ba5fb8: bl       #0xbdc23c */ CALL_DIRECT(sub_00bdc23c);
loc_00ba5fbc:
    /* 0x00ba5fbc: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba5fc0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5fc4: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00ba5fc8: cbnz     w9, #0xba5fbc */ if (w9 != 0) goto loc_00ba5fbc;
    /* 0x00ba5fcc: b.ne     #0xba5fdc */ if (COND_NE) goto loc_00ba5fdc;
    /* 0x00ba5fd0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba5fd4: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba5fd8: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba5fdc:
    /* 0x00ba5fdc: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba5fe0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba5fe4: stlxr    w9, x8, [x20] */ ARM64("stlxr w9, x8, [x20]");
    /* 0x00ba5fe8: cbnz     w9, #0xba5fdc */ if (w9 != 0) goto loc_00ba5fdc;
    /* 0x00ba5fec: b.ne     #0xba5e24 */ if (COND_NE) goto loc_00ba5e24;
    /* 0x00ba5ff0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba5ff4: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba5ff8: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba5ffc: b        #0xba5e24 */ goto loc_00ba5e24;
loc_00ba6000:
    /* 0x00ba6000: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba6004: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba6008: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba600c: add      x2, x2, #0x710 */ ARM64("add x2, x2, #0x710");
    /* 0x00ba6010: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba6014: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba6018: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba601c:
    /* 0x00ba601c: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00ba6020: add      x0, x0, #0x4f9 */ ARM64("add x0, x0, #0x4f9");
    /* 0x00ba6024: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba6028: add      x2, x2, #0x758 */ ARM64("add x2, x2, #0x758");
    /* 0x00ba602c: mov      w1, #0x4c */ ARM64("mov w1, #0x4c");
    /* 0x00ba6030: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba6034: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00ba6038: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba603c:
    /* 0x00ba603c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba6040: bl       #0xbe704c */ CALL_DIRECT(sub_00be704c);
    /* 0x00ba6044: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba6048: ldp      x9, x8, [x8, #0x20] */ ARM64("ldp x9, x8, [x8, #0x20]");
    /* 0x00ba604c: add      x8, x9, x8, lsl #5 */ ARM64("add x8, x9, x8, lsl #5");
    /* 0x00ba6050: stp      x9, x8, [x29, #-0xf0] */ ARM64("stp x9, x8, [x29, #-0xf0]");
    /* 0x00ba6054: stur     xzr, [x29, #-0xe0] */ ARM64("stur xzr, [x29, #-0xe0]");
    /* 0x00ba6058: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba605c: sub      x1, x29, #0xf0 */ ARM64("sub x1, x29, #0xf0");
    /* 0x00ba6060: bl       #0xb9c8e4 */ CALL_DIRECT(sub_00b9c8e4);
    /* 0x00ba6064: ldp      x8, x27, [sp, #0x130] */ ARM64("ldp x8, x27, [sp, #0x130]");
    /* 0x00ba6068: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
    /* 0x00ba606c: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba6070: cbz      x8, #0xba6330 */ if (x8 == 0) goto loc_00ba6330;
    /* 0x00ba6074: mov      x21, #-0x8000000000000000 */ ARM64("mov x21, #-0x8000000000000000");
    /* 0x00ba6078: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00ba607c: mov      w23, #0x30 */ ARM64("mov w23, #0x30");
    /* 0x00ba6080: mov      w24, #8 */ ARM64("mov w24, #8");
    /* 0x00ba6084: mov      w25, #0x48 */ ARM64("mov w25, #0x48");
    /* 0x00ba6088: mov      x20, x27 */ ARM64("mov x20, x27");
    /* 0x00ba608c: add      x8, x27, x8, lsl #2 */ ARM64("add x8, x27, x8, lsl #2");
    /* 0x00ba6090: str      x8, [sp, #0xd0] */ ARM64("str x8, [sp, #0xd0]");
loc_00ba6094:
    /* 0x00ba6094: ldr      w8, [x20], #4 */ ARM64("ldr w8, [x20], #4");
    /* 0x00ba6098: ldr      x9, [x28, #0xd8] */ ARM64("ldr x9, [x28, #0xd8]");
    /* 0x00ba609c: ldr      x10, [x9, #0x28] */ ARM64("ldr x10, [x9, #0x28]");
    /* 0x00ba60a0: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00ba60a4: b.ls     #0xba60bc */ if (COND_LS) goto loc_00ba60bc;
    /* 0x00ba60a8: ldr      x10, [x9, #0x20] */ ARM64("ldr x10, [x9, #0x20]");
    /* 0x00ba60ac: add      x10, x10, x8, lsl #5 */ ARM64("add x10, x10, x8, lsl #5");
    /* 0x00ba60b0: ldr      x11, [x10] */ ARM64("ldr x11, [x10]");
    /* 0x00ba60b4: cmp      x11, x21 */ ARM64("cmp x11, x21");
    /* 0x00ba60b8: b.ne     #0xba60c4 */ if (COND_NE) goto loc_00ba60c4;
loc_00ba60bc:
    /* 0x00ba60bc: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00ba60c0: b        #0xba60c8 */ goto loc_00ba60c8;
loc_00ba60c4:
    /* 0x00ba60c4: ldr      d0, [x10, #0x18] */ ARM64("ldr d0, [x10, #0x18]");
loc_00ba60c8:
    /* 0x00ba60c8: ldp      x10, x9, [x9, #0x38] */ ARM64("ldp x10, x9, [x9, #0x38]");
    /* 0x00ba60cc: str      x12, [sp, #0x2d0] */ ARM64("str x12, [sp, #0x2d0]");
    /* 0x00ba60d0: str      x10, [sp, #0x2d8] */ ARM64("str x10, [sp, #0x2d8]");
    /* 0x00ba60d4: str      x9, [sp, #0x2e0] */ ARM64("str x9, [sp, #0x2e0]");
    /* 0x00ba60d8: str      d0, [sp, #0x2e8] */ ARM64("str d0, [sp, #0x2e8]");
    /* 0x00ba60dc: str      w8, [sp, #0x2f0] */ ARM64("str w8, [sp, #0x2f0]");
    /* 0x00ba60e0: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba60e4: add      x1, sp, #0x2d0 */ ARM64("add x1, sp, #0x2d0");
    /* 0x00ba60e8: bl       #0xb9c6ec */ CALL_DIRECT(sub_00b9c6ec);
    /* 0x00ba60ec: ldp      x8, x28, [sp, #0x130] */ ARM64("ldp x8, x28, [sp, #0x130]");
    /* 0x00ba60f0: str      x8, [sp, #0x110] */ ARM64("str x8, [sp, #0x110]");
    /* 0x00ba60f4: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba60f8: cbz      x8, #0xba630c */ if (x8 == 0) goto loc_00ba630c;
    /* 0x00ba60fc: add      x8, x28, x8, lsl #2 */ ARM64("add x8, x28, x8, lsl #2");
    /* 0x00ba6100: str      x8, [sp, #0xd8] */ ARM64("str x8, [sp, #0xd8]");
    /* 0x00ba6104: mov      x22, x28 */ ARM64("mov x22, x28");
loc_00ba6108:
    /* 0x00ba6108: ldr      w8, [x22], #4 */ ARM64("ldr w8, [x22], #4");
    /* 0x00ba610c: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00ba6110: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x00ba6114: ldr      x10, [x9, #0x40] */ ARM64("ldr x10, [x9, #0x40]");
    /* 0x00ba6118: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00ba611c: b.ls     #0xba798c */ if (COND_LS) goto loc_00ba798c;
    /* 0x00ba6120: ldr      x9, [x9, #0x38] */ ARM64("ldr x9, [x9, #0x38]");
    /* 0x00ba6124: umaddl   x9, w8, w23, x9 */ ARM64("umaddl x9, w8, w23, x9");
    /* 0x00ba6128: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00ba612c: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00ba6130: b.eq     #0xba798c */ if (COND_EQ) goto loc_00ba798c;
    /* 0x00ba6134: ldp      x26, x10, [x9, #8] */ ARM64("ldp x26, x10, [x9, #8]");
    /* 0x00ba6138: stp      xzr, x24, [x9] */ ARM64("stp xzr, x24, [x9]");
    /* 0x00ba613c: str      xzr, [x9, #0x10] */ ARM64("str xzr, [x9, #0x10]");
    /* 0x00ba6140: madd     x21, x10, x25, x26 */ ARM64("madd x21, x10, x25, x26");
    /* 0x00ba6144: stp      x26, x26, [x29, #-0xb0] */ ARM64("stp x26, x26, [x29, #-0xb0]");
    /* 0x00ba6148: stp      x8, x21, [x29, #-0xa0] */ ARM64("stp x8, x21, [x29, #-0xa0]");
    /* 0x00ba614c: cbnz     x10, #0xba6180 */ if (x10 != 0) goto loc_00ba6180;
loc_00ba6150:
    /* 0x00ba6150: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba6154: bl       #0xbe7278 */ CALL_DIRECT(sub_00be7278);
    /* 0x00ba6158: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba615c: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba6160: mov      x21, #-0x8000000000000000 */ ARM64("mov x21, #-0x8000000000000000");
    /* 0x00ba6164: mov      w23, #0x30 */ ARM64("mov w23, #0x30");
    /* 0x00ba6168: mov      w24, #8 */ ARM64("mov w24, #8");
    /* 0x00ba616c: mov      w25, #0x48 */ ARM64("mov w25, #0x48");
    /* 0x00ba6170: b.ne     #0xba6108 */ if (COND_NE) goto loc_00ba6108;
    /* 0x00ba6174: b        #0xba630c */ goto loc_00ba630c;
loc_00ba6178:
    /* 0x00ba6178: cmp      x25, x21 */ ARM64("cmp x25, x21");
    /* 0x00ba617c: b.eq     #0xba6150 */ if (COND_EQ) goto loc_00ba6150;
loc_00ba6180:
    /* 0x00ba6180: add      x25, x26, #0x48 */ ARM64("add x25, x26, #0x48");
    /* 0x00ba6184: stur     x25, [x29, #-0xa8] */ ARM64("stur x25, [x29, #-0xa8]");
    /* 0x00ba6188: ldr      x8, [x26, #8] */ ARM64("ldr x8, [x26, #8]");
    /* 0x00ba618c: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00ba6190: b.eq     #0xba6150 */ if (COND_EQ) goto loc_00ba6150;
    /* 0x00ba6194: ldr      x1, [x26] */ ARM64("ldr x1, [x26]");
    /* 0x00ba6198: ldr      x23, [x26, #0x10] */ ARM64("ldr x23, [x26, #0x10]");
    /* 0x00ba619c: cbnz     x8, #0xba799c */ if (x8 != 0) goto loc_00ba799c;
    /* 0x00ba61a0: ldr      x0, [sp, #0x128] */ ARM64("ldr x0, [sp, #0x128]");
    /* 0x00ba61a4: bl       #0xba9cf8 */ CALL_DIRECT(sub_00ba9cf8);
    /* 0x00ba61a8: ldr      x24, [x0] */ ARM64("ldr x24, [x0]");
    /* 0x00ba61ac: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba61b0: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00ba61b4: str      x8, [x24] */ ARM64("str x8, [x24]");
    /* 0x00ba61b8: b.hs     #0xba7a2c */ if (COND_HS) goto loc_00ba7a2c;
    /* 0x00ba61bc: ldr      x10, [sp, #0x128] */ ARM64("ldr x10, [sp, #0x128]");
    /* 0x00ba61c0: ldr      x8, [x10, #0x198] */ ARM64("ldr x8, [x10, #0x198]");
    /* 0x00ba61c4: cbz      x8, #0xba6394 */ if (x8 == 0) goto loc_00ba6394;
    /* 0x00ba61c8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba61cc: mov      x26, x25 */ ARM64("mov x26, x25");
    /* 0x00ba61d0: add      x9, x23, #8 */ ARM64("add x9, x23, #8");
    /* 0x00ba61d4: mul      x11, x9, x19 */ ARM64("mul x11, x9, x19");
    /* 0x00ba61d8: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba61dc: ldp      x10, x9, [x10, #0x180] */ ARM64("ldp x10, x9, [x10, #0x180]");
    /* 0x00ba61e0: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba61e4: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba61e8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba61ec: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba61f0: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba61f4: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba61f8: b.eq     #0xba6230 */ if (COND_EQ) goto loc_00ba6230;
loc_00ba61fc:
    /* 0x00ba61fc: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba6200: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba6204: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba6208: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba620c: mov      w14, #0x28 */ ARM64("mov w14, #0x28");
    /* 0x00ba6210: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00ba6214: add      x13, x10, x13 */ ARM64("add x13, x10, x13");
    /* 0x00ba6218: ldur     x14, [x13, #-0x28] */ ARM64("ldur x14, [x13, #-0x28]");
    /* 0x00ba621c: cmp      x23, x14 */ ARM64("cmp x23, x14");
    /* 0x00ba6220: b.eq     #0xba6268 */ if (COND_EQ) goto loc_00ba6268;
    /* 0x00ba6224: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba6228: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba622c: b.ne     #0xba61fc */ if (COND_NE) goto loc_00ba61fc;
loc_00ba6230:
    /* 0x00ba6230: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba6234: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba6238: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba623c: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba6240: tbnz     w12, #0, #0xba6394 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba6394;
    /* 0x00ba6244: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba6248: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba624c: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6250: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6254: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6258: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba625c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6260: b.ne     #0xba61fc */ if (COND_NE) goto loc_00ba61fc;
    /* 0x00ba6264: b        #0xba6230 */ goto loc_00ba6230;
loc_00ba6268:
    /* 0x00ba6268: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba626c: cbnz     x8, #0xba770c */ if (x8 != 0) goto loc_00ba770c;
    /* 0x00ba6270: ldur     x8, [x13, #-0x20] */ ARM64("ldur x8, [x13, #-0x20]");
    /* 0x00ba6274: str      x8, [sp, #0x130] */ ARM64("str x8, [sp, #0x130]");
    /* 0x00ba6278: ldur     q0, [x13, #-0x10] */ ARM64("ldur q0, [x13, #-0x10]");
    /* 0x00ba627c: mov      x8, #-1 */ ARM64("mov x8, #-1");
    /* 0x00ba6280: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba6284: add      x8, sp, #0x39 */ ARM64("add x8, sp, #0x39");
    /* 0x00ba6288: stur     q0, [x8, #0xff] */ ARM64("stur q0, [x8, #0xff]");
loc_00ba628c:
    /* 0x00ba628c: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba6290: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6294: stxr     w10, x9, [x23] */ ARM64("stxr w10, x9, [x23]");
    /* 0x00ba6298: cbnz     w10, #0xba628c */ if (w10 != 0) goto loc_00ba628c;
    /* 0x00ba629c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba62a0: add      x0, x24, #0x18 */ ARM64("add x0, x24, #0x18");
    /* 0x00ba62a4: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba62a8: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00ba62ac: bl       #0xbcf85c */ CALL_DIRECT(sub_00bcf85c);
    /* 0x00ba62b0: cbz      x0, #0xba62d0 */ if (x0 == 0) goto loc_00ba62d0;
loc_00ba62b4:
    /* 0x00ba62b4: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba62b8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba62bc: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba62c0: cbnz     w9, #0xba62b4 */ if (w9 != 0) goto loc_00ba62b4;
    /* 0x00ba62c4: b.ne     #0xba62d0 */ if (COND_NE) goto loc_00ba62d0;
    /* 0x00ba62c8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba62cc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba62d0:
    /* 0x00ba62d0: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba62d4: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba62d8: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba62dc: ldr      x8, [sp, #0x128] */ ARM64("ldr x8, [sp, #0x128]");
    /* 0x00ba62e0: add      x0, x8, #0x120 */ ARM64("add x0, x8, #0x120");
    /* 0x00ba62e4: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba62e8: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba62ec: bl       #0xbafce0 */ CALL_DIRECT(sub_00bafce0);
    /* 0x00ba62f0: cbz      x0, #0xba6178 */ if (x0 == 0) goto loc_00ba6178;
    /* 0x00ba62f4: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00ba62f8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba62fc: str      x8, [x0] */ ARM64("str x8, [x0]");
    /* 0x00ba6300: b.ne     #0xba6178 */ if (COND_NE) goto loc_00ba6178;
    /* 0x00ba6304: bl       #0xbdc23c */ CALL_DIRECT(sub_00bdc23c);
    /* 0x00ba6308: b        #0xba6178 */ goto loc_00ba6178;
loc_00ba630c:
    /* 0x00ba630c: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba6310: cbz      x8, #0xba631c */ if (x8 == 0) goto loc_00ba631c;
    /* 0x00ba6314: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba6318: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba631c:
    /* 0x00ba631c: ldr      x8, [sp, #0xd0] */ ARM64("ldr x8, [sp, #0xd0]");
    /* 0x00ba6320: cmp      x20, x8 */ ARM64("cmp x20, x8");
    /* 0x00ba6324: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba6328: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00ba632c: b.ne     #0xba6094 */ if (COND_NE) goto loc_00ba6094;
loc_00ba6330:
    /* 0x00ba6330: ldr      x8, [sp, #0x100] */ ARM64("ldr x8, [sp, #0x100]");
    /* 0x00ba6334: cbz      x8, #0xba6340 */ if (x8 == 0) goto loc_00ba6340;
    /* 0x00ba6338: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba633c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba6340:
    /* 0x00ba6340: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba6344: ldr      w9, [x8, #0x78] */ ARM64("ldr w9, [x8, #0x78]");
    /* 0x00ba6348: cmp      w9, #1 */ ARM64("cmp w9, #1");
    /* 0x00ba634c: b.ne     #0xba7788 */ if (COND_NE) goto loc_00ba7788;
    /* 0x00ba6350: ldr      w2, [x8, #0x7c] */ ARM64("ldr w2, [x8, #0x7c]");
    /* 0x00ba6354: ldr      x1, [x28, #0x78] */ ARM64("ldr x1, [x28, #0x78]");
    /* 0x00ba6358: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba635c: bl       #0xbda350 */ CALL_DIRECT(sub_00bda350);
loc_00ba6360:
    /* 0x00ba6360: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba6364: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba6368: add      x1, x8, #0x18 */ ARM64("add x1, x8, #0x18");
    /* 0x00ba636c: bl       #0xbda430 */ CALL_DIRECT(sub_00bda430);
    /* 0x00ba6370: tbz      w0, #0, #0xba63cc */ if (((w0 >> #0) & 1) == 0) goto loc_00ba63cc;
    /* 0x00ba6374: mov      x20, x1 */ ARM64("mov x20, x1");
    /* 0x00ba6378: add      x0, x28, #0x200 */ ARM64("add x0, x28, #0x200");
    /* 0x00ba637c: bl       #0xbaf1a4 */ CALL_DIRECT(sub_00baf1a4);
    /* 0x00ba6380: cbz      w0, #0xba6360 */ if (w0 == 0) goto loc_00ba6360;
    /* 0x00ba6384: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba6388: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00ba638c: bl       #0xbaa1d8 */ CALL_DIRECT(sub_00baa1d8);
    /* 0x00ba6390: b        #0xba6360 */ goto loc_00ba6360;
loc_00ba6394:
    /* 0x00ba6394: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba6398: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba639c: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba63a0: add      x2, x2, #0x6e0 */ ARM64("add x2, x2, #0x6e0");
    /* 0x00ba63a4: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba63a8: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba63ac: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba63b0:
    /* 0x00ba63b0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba63b4: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00ba63b8: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba63bc: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba63c0:
    /* 0x00ba63c0: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba63c4: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba63c8: b        #0xba0aa8 */ goto loc_00ba0aa8;
loc_00ba63cc:
    /* 0x00ba63cc: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba63d0: ldr      w9, [x8, #0x78] */ ARM64("ldr w9, [x8, #0x78]");
    /* 0x00ba63d4: tbz      w9, #0, #0xba7794 */ if (((w9 >> #0) & 1) == 0) goto loc_00ba7794;
    /* 0x00ba63d8: ldr      w2, [x8, #0x7c] */ ARM64("ldr w2, [x8, #0x7c]");
    /* 0x00ba63dc: ldr      x1, [x28, #0x78] */ ARM64("ldr x1, [x28, #0x78]");
    /* 0x00ba63e0: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba63e4: bl       #0xbda350 */ CALL_DIRECT(sub_00bda350);
loc_00ba63e8:
    /* 0x00ba63e8: ldr      x8, [x28, #0xd8] */ ARM64("ldr x8, [x28, #0xd8]");
    /* 0x00ba63ec: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba63f0: add      x1, x8, #0x18 */ ARM64("add x1, x8, #0x18");
    /* 0x00ba63f4: bl       #0xbda430 */ CALL_DIRECT(sub_00bda430);
    /* 0x00ba63f8: cmp      w0, #1 */ ARM64("cmp w0, #1");
    /* 0x00ba63fc: b.ne     #0xba640c */ if (COND_NE) goto loc_00ba640c;
    /* 0x00ba6400: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba6404: bl       #0xbaa1d8 */ CALL_DIRECT(sub_00baa1d8);
    /* 0x00ba6408: b        #0xba63e8 */ goto loc_00ba63e8;
loc_00ba640c:
    /* 0x00ba640c: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba6410: cbz      x8, #0xba641c */ if (x8 == 0) goto loc_00ba641c;
    /* 0x00ba6414: ldr      x0, [sp, #0x138] */ ARM64("ldr x0, [sp, #0x138]");
    /* 0x00ba6418: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba641c:
    /* 0x00ba641c: ldp      x0, x1, [sp, #0x148] */ ARM64("ldp x0, x1, [sp, #0x148]");
    /* 0x00ba6420: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00ba6424: ldr      x8, [sp, #0x2d0] */ ARM64("ldr x8, [sp, #0x2d0]");
    /* 0x00ba6428: cbz      x8, #0xba6434 */ if (x8 == 0) goto loc_00ba6434;
    /* 0x00ba642c: ldr      x0, [sp, #0x2d8] */ ARM64("ldr x0, [sp, #0x2d8]");
    /* 0x00ba6430: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba6434:
    /* 0x00ba6434: ldr      x0, [sp, #0x2e8] */ ARM64("ldr x0, [sp, #0x2e8]");
    /* 0x00ba6438: ldr      x1, [sp, #0x2f0] */ ARM64("ldr x1, [sp, #0x2f0]");
    /* 0x00ba643c: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00ba6440: ldr      x12, [sp, #0x128] */ ARM64("ldr x12, [sp, #0x128]");
    /* 0x00ba6444: ldr      x20, [x12, #0xd8] */ ARM64("ldr x20, [x12, #0xd8]");
    /* 0x00ba6448: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00ba644c: stp      q1, q0, [x29, #-0xb0] */ ARM64("stp q1, q0, [x29, #-0xb0]");
    /* 0x00ba6450: ldp      x8, x9, [x12, #0x120] */ ARM64("ldp x8, x9, [x12, #0x120]");
    /* 0x00ba6454: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba6458: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00ba645c: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba6460: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba6464: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00ba6468: add      x11, x8, #8 */ ARM64("add x11, x8, #8");
    /* 0x00ba646c: and      x10, x10, #0x8080808080808080 */ ARM64("and x10, x10, #0x8080808080808080");
    /* 0x00ba6470: ldr      x12, [x12, #0x138] */ ARM64("ldr x12, [x12, #0x138]");
    /* 0x00ba6474: str      x8, [sp, #0x2d0] */ ARM64("str x8, [sp, #0x2d0]");
    /* 0x00ba6478: str      x10, [sp, #0x2d8] */ ARM64("str x10, [sp, #0x2d8]");
    /* 0x00ba647c: str      x11, [sp, #0x2e0] */ ARM64("str x11, [sp, #0x2e0]");
    /* 0x00ba6480: str      x9, [sp, #0x2e8] */ ARM64("str x9, [sp, #0x2e8]");
    /* 0x00ba6484: str      x12, [sp, #0x2f0] */ ARM64("str x12, [sp, #0x2f0]");
    /* 0x00ba6488: mov      x23, #0x7fffffffffffffff */ ARM64("mov x23, #0x7fffffffffffffff");
    /* 0x00ba648c: b        #0xba649c */ goto loc_00ba649c;
loc_00ba6490:
    /* 0x00ba6490: ldr      x8, [x22, #0x10] */ ARM64("ldr x8, [x22, #0x10]");
    /* 0x00ba6494: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00ba6498: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
loc_00ba649c:
    /* 0x00ba649c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba64a0: bl       #0xbb0b64 */ CALL_DIRECT(sub_00bb0b64);
    /* 0x00ba64a4: cbz      x0, #0xba6570 */ if (x0 == 0) goto loc_00ba6570;
    /* 0x00ba64a8: ldr      x22, [x1] */ ARM64("ldr x22, [x1]");
    /* 0x00ba64ac: ldr      x8, [x22, #0x10] */ ARM64("ldr x8, [x22, #0x10]");
    /* 0x00ba64b0: cmp      x8, x23 */ ARM64("cmp x8, x23");
    /* 0x00ba64b4: b.hs     #0xba7638 */ if (COND_HS) goto loc_00ba7638;
    /* 0x00ba64b8: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00ba64bc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba64c0: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
    /* 0x00ba64c4: ldr      x9, [x22, #0x18] */ ARM64("ldr x9, [x22, #0x18]");
    /* 0x00ba64c8: cbz      x9, #0xba64e8 */ if (x9 == 0) goto loc_00ba64e8;
    /* 0x00ba64cc: ldp      x10, x8, [x22, #0x20] */ ARM64("ldp x10, x8, [x22, #0x20]");
    /* 0x00ba64d0: stp      xzr, x9, [sp, #0x138] */ ARM64("stp xzr, x9, [sp, #0x138]");
    /* 0x00ba64d4: str      x10, [sp, #0x148] */ ARM64("str x10, [sp, #0x148]");
    /* 0x00ba64d8: stp      xzr, x9, [sp, #0x158] */ ARM64("stp xzr, x9, [sp, #0x158]");
    /* 0x00ba64dc: str      x10, [sp, #0x168] */ ARM64("str x10, [sp, #0x168]");
    /* 0x00ba64e0: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00ba64e4: b        #0xba64ec */ goto loc_00ba64ec;
loc_00ba64e8:
    /* 0x00ba64e8: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00ba64ec:
    /* 0x00ba64ec: str      x9, [sp, #0x130] */ ARM64("str x9, [sp, #0x130]");
    /* 0x00ba64f0: str      x9, [sp, #0x150] */ ARM64("str x9, [sp, #0x150]");
    /* 0x00ba64f4: str      x8, [sp, #0x170] */ ARM64("str x8, [sp, #0x170]");
    /* 0x00ba64f8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba64fc: bl       #0xbd11f0 */ CALL_DIRECT(sub_00bd11f0);
    /* 0x00ba6500: cbz      x0, #0xba7648 */ if (x0 == 0) goto loc_00ba7648;
    /* 0x00ba6504: mov      x8, x1 */ ARM64("mov x8, x1");
    /* 0x00ba6508: ldr      x1, [x21] */ ARM64("ldr x1, [x21]");
    /* 0x00ba650c: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba6510: cmp      x1, x9 */ ARM64("cmp x1, x9");
    /* 0x00ba6514: b.eq     #0xba6490 */ if (COND_EQ) goto loc_00ba6490;
loc_00ba6518:
    /* 0x00ba6518: ldxr     x9, [x1] */ ARM64("ldxr x9, [x1]");
    /* 0x00ba651c: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba6520: stxr     w11, x10, [x1] */ ARM64("stxr w11, x10, [x1]");
    /* 0x00ba6524: cbnz     w11, #0xba6518 */ if (w11 != 0) goto loc_00ba6518;
    /* 0x00ba6528: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba652c: ldr      x2, [x8] */ ARM64("ldr x2, [x8]");
loc_00ba6530:
    /* 0x00ba6530: ldxr     x8, [x2] */ ARM64("ldxr x8, [x2]");
    /* 0x00ba6534: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6538: stxr     w10, x9, [x2] */ ARM64("stxr w10, x9, [x2]");
    /* 0x00ba653c: cbnz     w10, #0xba6530 */ if (w10 != 0) goto loc_00ba6530;
    /* 0x00ba6540: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6544: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba6548: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00ba654c: cbz      x0, #0xba6490 */ if (x0 == 0) goto loc_00ba6490;
loc_00ba6550:
    /* 0x00ba6550: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba6554: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6558: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba655c: cbnz     w9, #0xba6550 */ if (w9 != 0) goto loc_00ba6550;
    /* 0x00ba6560: b.ne     #0xba6490 */ if (COND_NE) goto loc_00ba6490;
    /* 0x00ba6564: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6568: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba656c: b        #0xba6490 */ goto loc_00ba6490;
loc_00ba6570:
    /* 0x00ba6570: ldp      q0, q1, [x29, #-0xb0] */ ARM64("ldp q0, q1, [x29, #-0xb0]");
    /* 0x00ba6574: stp      q0, q1, [sp, #0x130] */ ARM64("stp q0, q1, [sp, #0x130]");
    /* 0x00ba6578: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba657c: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba6580: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba6584: bl       #0xbb99e8 */ CALL_DIRECT(sub_00bb99e8);
    /* 0x00ba6588: ldr      x9, [x28, #0xd8] */ ARM64("ldr x9, [x28, #0xd8]");
    /* 0x00ba658c: str      x9, [sp, #0x110] */ ARM64("str x9, [sp, #0x110]");
    /* 0x00ba6590: ldp      x8, x9, [x9, #0x20] */ ARM64("ldp x8, x9, [x9, #0x20]");
    /* 0x00ba6594: add      x9, x8, x9, lsl #5 */ ARM64("add x9, x8, x9, lsl #5");
    /* 0x00ba6598: str      x8, [sp, #0x250] */ ARM64("str x8, [sp, #0x250]");
    /* 0x00ba659c: str      x9, [sp, #0x258] */ ARM64("str x9, [sp, #0x258]");
    /* 0x00ba65a0: str      xzr, [sp, #0x260] */ ARM64("str xzr, [sp, #0x260]");
    /* 0x00ba65a4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba65a8: add      x1, sp, #0x250 */ ARM64("add x1, sp, #0x250");
    /* 0x00ba65ac: bl       #0xb9c8e4 */ CALL_DIRECT(sub_00b9c8e4);
    /* 0x00ba65b0: ldp      x9, x8, [sp, #0x130] */ ARM64("ldp x9, x8, [sp, #0x130]");
    /* 0x00ba65b4: str      x9, [sp, #0x90] */ ARM64("str x9, [sp, #0x90]");
    /* 0x00ba65b8: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
    /* 0x00ba65bc: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba65c0: cbz      x8, #0xba7210 */ if (x8 == 0) goto loc_00ba7210;
    /* 0x00ba65c4: ldr      x9, [sp, #0xb0] */ ARM64("ldr x9, [sp, #0xb0]");
    /* 0x00ba65c8: add      x8, x9, x8, lsl #2 */ ARM64("add x8, x9, x8, lsl #2");
    /* 0x00ba65cc: str      x8, [sp, #0xa8] */ ARM64("str x8, [sp, #0xa8]");
    /* 0x00ba65d0: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba65d4: add      x10, x8, #0x4a0 */ ARM64("add x10, x8, #0x4a0");
    /* 0x00ba65d8: mov      x21, #-0x8000000000000000 */ ARM64("mov x21, #-0x8000000000000000");
    /* 0x00ba65dc: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba65e0: add      x8, x8, #0x590 */ ARM64("add x8, x8, #0x590");
    /* 0x00ba65e4: stp      x10, x8, [sp, #0x48] */ ARM64("stp x10, x8, [sp, #0x48]");
    /* 0x00ba65e8: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba65ec: add      x8, x8, #0x4e8 */ ARM64("add x8, x8, #0x4e8");
    /* 0x00ba65f0: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
    /* 0x00ba65f4: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba65f8: add      x8, x8, #0x578 */ ARM64("add x8, x8, #0x578");
    /* 0x00ba65fc: str      x8, [sp, #0x68] */ ARM64("str x8, [sp, #0x68]");
loc_00ba6600:
    /* 0x00ba6600: ldr      w10, [x9], #4 */ ARM64("ldr w10, [x9], #4");
    /* 0x00ba6604: str      x9, [sp, #0xc0] */ ARM64("str x9, [sp, #0xc0]");
    /* 0x00ba6608: str      xzr, [sp, #0x268] */ ARM64("str xzr, [sp, #0x268]");
    /* 0x00ba660c: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba6610: str      x8, [sp, #0x270] */ ARM64("str x8, [sp, #0x270]");
    /* 0x00ba6614: str      xzr, [sp, #0x278] */ ARM64("str xzr, [sp, #0x278]");
    /* 0x00ba6618: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba661c: ldr      x8, [x9, #0x28] */ ARM64("ldr x8, [x9, #0x28]");
    /* 0x00ba6620: cmp      x8, x10 */ ARM64("cmp x8, x10");
    /* 0x00ba6624: b.ls     #0xba7a24 */ if (COND_LS) goto loc_00ba7a24;
    /* 0x00ba6628: ldr      x9, [x9, #0x20] */ ARM64("ldr x9, [x9, #0x20]");
    /* 0x00ba662c: str      x10, [sp, #0xd0] */ ARM64("str x10, [sp, #0xd0]");
    /* 0x00ba6630: add      x9, x9, x10, lsl #5 */ ARM64("add x9, x9, x10, lsl #5");
    /* 0x00ba6634: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00ba6638: cmp      x10, x21 */ ARM64("cmp x10, x21");
    /* 0x00ba663c: b.eq     #0xba7a24 */ if (COND_EQ) goto loc_00ba7a24;
    /* 0x00ba6640: ldr      x10, [x9, #0x10] */ ARM64("ldr x10, [x9, #0x10]");
    /* 0x00ba6644: cbz      x10, #0xba712c */ if (x10 == 0) goto loc_00ba712c;
    /* 0x00ba6648: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00ba664c: ldr      x20, [x9, #8] */ ARM64("ldr x20, [x9, #8]");
    /* 0x00ba6650: mov      w8, #0x108 */ ARM64("mov w8, #0x108");
    /* 0x00ba6654: madd     x9, x10, x8, x20 */ ARM64("madd x9, x10, x8, x20");
    /* 0x00ba6658: str      x9, [sp, #0x100] */ ARM64("str x9, [sp, #0x100]");
    /* 0x00ba665c: b        #0xba6678 */ goto loc_00ba6678;
loc_00ba6660:
    /* 0x00ba6660: strb     wzr, [x20, #0x51] */ ARM64("strb wzr, [x20, #0x51]");
loc_00ba6664:
    /* 0x00ba6664: ldr      x9, [sp, #0x100] */ ARM64("ldr x9, [sp, #0x100]");
loc_00ba6668:
    /* 0x00ba6668: add      x20, x20, #0x108 */ ARM64("add x20, x20, #0x108");
    /* 0x00ba666c: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00ba6670: cmp      x20, x9 */ ARM64("cmp x20, x9");
    /* 0x00ba6674: b.eq     #0xba7124 */ if (COND_EQ) goto loc_00ba7124;
loc_00ba6678:
    /* 0x00ba6678: ldr      x8, [x20, #0x18] */ ARM64("ldr x8, [x20, #0x18]");
    /* 0x00ba667c: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00ba6680: b.ne     #0xba6668 */ if (COND_NE) goto loc_00ba6668;
    /* 0x00ba6684: ldrb     w8, [x20, #0x51] */ ARM64("ldrb w8, [x20, #0x51]");
    /* 0x00ba6688: tbz      w8, #0, #0xba6668 */ if (((w8 >> #0) & 1) == 0) goto loc_00ba6668;
    /* 0x00ba668c: ldr      x27, [x20, #0x30] */ ARM64("ldr x27, [x20, #0x30]");
    /* 0x00ba6690: cmp      x27, #1 */ ARM64("cmp x27, #1");
    /* 0x00ba6694: b.ne     #0xba6714 */ if (COND_NE) goto loc_00ba6714;
    /* 0x00ba6698: ldr      x8, [x20, #0x48] */ ARM64("ldr x8, [x20, #0x48]");
    /* 0x00ba669c: cbz      x8, #0xba7a00 */ if (x8 == 0) goto loc_00ba7a00;
    /* 0x00ba66a0: ldr      x8, [x20, #0x40] */ ARM64("ldr x8, [x20, #0x40]");
    /* 0x00ba66a4: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba66a8: cbnz     x9, #0xba6660 */ if (x9 != 0) goto loc_00ba6660;
    /* 0x00ba66ac: ldr      x9, [x20, #0x28] */ ARM64("ldr x9, [x20, #0x28]");
    /* 0x00ba66b0: ldr      x10, [x9] */ ARM64("ldr x10, [x9]");
    /* 0x00ba66b4: cmp      x10, x21 */ ARM64("cmp x10, x21");
    /* 0x00ba66b8: b.ne     #0xba77cc */ if (COND_NE) goto loc_00ba77cc;
    /* 0x00ba66bc: ldr      x8, [x8, #8] */ ARM64("ldr x8, [x8, #8]");
    /* 0x00ba66c0: ldr      x9, [x9, #8] */ ARM64("ldr x9, [x9, #8]");
    /* 0x00ba66c4: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba66c8: b.ne     #0xba6660 */ if (COND_NE) goto loc_00ba6660;
    /* 0x00ba66cc: stp      x26, xzr, [sp, #0x130] */ ARM64("stp x26, xzr, [sp, #0x130]");
    /* 0x00ba66d0: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba66d4: stp      x8, xzr, [sp, #0x140] */ ARM64("stp x8, xzr, [sp, #0x140]");
    /* 0x00ba66d8: ldr      x22, [sp, #0x278] */ ARM64("ldr x22, [sp, #0x278]");
    /* 0x00ba66dc: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00ba66e0: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba66e4: b.ne     #0xba66f0 */ if (COND_NE) goto loc_00ba66f0;
    /* 0x00ba66e8: add      x0, sp, #0x268 */ ARM64("add x0, sp, #0x268");
    /* 0x00ba66ec: bl       #0xc737b0 */ CALL_DIRECT(sub_00c737b0);
loc_00ba66f0:
    /* 0x00ba66f0: ldr      x8, [sp, #0x270] */ ARM64("ldr x8, [sp, #0x270]");
    /* 0x00ba66f4: add      x8, x8, x22, lsl #5 */ ARM64("add x8, x8, x22, lsl #5");
    /* 0x00ba66f8: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba66fc: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba6700: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba6704: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba6708: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba670c: str      x8, [sp, #0x278] */ ARM64("str x8, [sp, #0x278]");
    /* 0x00ba6710: b        #0xba6664 */ goto loc_00ba6664;
loc_00ba6714:
    /* 0x00ba6714: str      xzr, [sp, #0x280] */ ARM64("str xzr, [sp, #0x280]");
    /* 0x00ba6718: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba671c: str      x8, [sp, #0x288] */ ARM64("str x8, [sp, #0x288]");
    /* 0x00ba6720: str      xzr, [sp, #0x290] */ ARM64("str xzr, [sp, #0x290]");
    /* 0x00ba6724: str      xzr, [sp, #0x298] */ ARM64("str xzr, [sp, #0x298]");
    /* 0x00ba6728: str      x8, [sp, #0x2a0] */ ARM64("str x8, [sp, #0x2a0]");
    /* 0x00ba672c: str      xzr, [sp, #0x2a8] */ ARM64("str xzr, [sp, #0x2a8]");
    /* 0x00ba6730: ldp      q1, q0, [sp, #0xe0] */ ARM64("ldp q1, q0, [sp, #0xe0]");
    /* 0x00ba6734: stp      q0, q1, [x29, #-0xb0] */ ARM64("stp q0, q1, [x29, #-0xb0]");
    /* 0x00ba6738: stp      q0, q1, [sp, #0x2d0] */ ARM64("stp q0, q1, [sp, #0x2d0]");
    /* 0x00ba673c: str      xzr, [sp, #0x2b0] */ ARM64("str xzr, [sp, #0x2b0]");
    /* 0x00ba6740: str      x8, [sp, #0x2b8] */ ARM64("str x8, [sp, #0x2b8]");
    /* 0x00ba6744: str      xzr, [sp, #0x2c0] */ ARM64("str xzr, [sp, #0x2c0]");
    /* 0x00ba6748: cbz      x27, #0xba7010 */ if (x27 == 0) goto loc_00ba7010;
    /* 0x00ba674c: mov      x24, #0 */ ARM64("mov x24, #0");
    /* 0x00ba6750: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00ba6754: mov      w28, #0x38 */ ARM64("mov w28, #0x38");
    /* 0x00ba6758: b        #0xba6798 */ goto loc_00ba6798;
loc_00ba675c:
    /* 0x00ba675c: ldr      x8, [sp, #0x2b8] */ ARM64("ldr x8, [sp, #0x2b8]");
    /* 0x00ba6760: madd     x8, x22, x28, x8 */ ARM64("madd x8, x22, x28, x8");
    /* 0x00ba6764: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba6768: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba676c: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba6770: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba6774: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba6778: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00ba677c: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00ba6780: str      x9, [x8, #0x30] */ ARM64("str x9, [x8, #0x30]");
    /* 0x00ba6784: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba6788: str      x8, [sp, #0x2c0] */ ARM64("str x8, [sp, #0x2c0]");
    /* 0x00ba678c: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00ba6790: cmp      x25, x27 */ ARM64("cmp x25, x27");
    /* 0x00ba6794: b.eq     #0xba6970 */ if (COND_EQ) goto loc_00ba6970;
loc_00ba6798:
    /* 0x00ba6798: ldr      x1, [x20, #0x30] */ ARM64("ldr x1, [x20, #0x30]");
    /* 0x00ba679c: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00ba67a0: b.hs     #0xba7970 */ if (COND_HS) goto loc_00ba7970;
    /* 0x00ba67a4: ldr      x8, [x20, #0x28] */ ARM64("ldr x8, [x20, #0x28]");
    /* 0x00ba67a8: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba67ac: madd     x23, x25, x9, x8 */ ARM64("madd x23, x25, x9, x8");
    /* 0x00ba67b0: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00ba67b4: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00ba67b8: b.ne     #0xba7664 */ if (COND_NE) goto loc_00ba7664;
    /* 0x00ba67bc: ldr      x1, [x20, #0x48] */ ARM64("ldr x1, [x20, #0x48]");
    /* 0x00ba67c0: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00ba67c4: b.hs     #0xba7908 */ if (COND_HS) goto loc_00ba7908;
    /* 0x00ba67c8: ldr      x8, [x20, #0x40] */ ARM64("ldr x8, [x20, #0x40]");
    /* 0x00ba67cc: add      x22, x8, x25, lsl #6 */ ARM64("add x22, x8, x25, lsl #6");
    /* 0x00ba67d0: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00ba67d4: cbz      x8, #0xba6870 */ if (x8 == 0) goto loc_00ba6870;
    /* 0x00ba67d8: mov      w0, #0x18 */ ARM64("mov w0, #0x18");
    /* 0x00ba67dc: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba67e0: cbz      x0, #0xba767c */ if (x0 == 0) goto loc_00ba767c;
    /* 0x00ba67e4: ldr      x8, [x23, #8] */ ARM64("ldr x8, [x23, #8]");
loc_00ba67e8:
    /* 0x00ba67e8: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00ba67ec: add      x10, x9, #1 */ ARM64("add x10, x9, #1");
    /* 0x00ba67f0: stxr     w11, x10, [x8] */ ARM64("stxr w11, x10, [x8]");
    /* 0x00ba67f4: cbnz     w11, #0xba67e8 */ if (w11 != 0) goto loc_00ba67e8;
    /* 0x00ba67f8: tbnz     x9, #0x3f, #0xba724c */ if (((x9 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba67fc: stp      x21, x8, [x0] */ ARM64("stp x21, x8, [x0]");
    /* 0x00ba6800: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6804: stp      x8, x0, [x29, #-0xf0] */ ARM64("stp x8, x0, [x29, #-0xf0]");
    /* 0x00ba6808: stur     x8, [x29, #-0xe0] */ ARM64("stur x8, [x29, #-0xe0]");
    /* 0x00ba680c: mov      w0, #0x40 */ ARM64("mov w0, #0x40");
    /* 0x00ba6810: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6814: cbz      x0, #0xba768c */ if (x0 == 0) goto loc_00ba768c;
    /* 0x00ba6818: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00ba681c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba6820: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba6824: bl       #0xbab6a0 */ CALL_DIRECT(sub_00bab6a0);
    /* 0x00ba6828: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba682c: stp      q0, q1, [x23] */ ARM64("stp q0, q1, [x23]");
    /* 0x00ba6830: ldp      q0, q1, [sp, #0x150] */ ARM64("ldp q0, q1, [sp, #0x150]");
    /* 0x00ba6834: stp      q0, q1, [x23, #0x20] */ ARM64("stp q0, q1, [x23, #0x20]");
    /* 0x00ba6838: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00ba683c: str      q0, [sp, #0x130] */ ARM64("str q0, [sp, #0x130]");
    /* 0x00ba6840: ldur     x9, [x29, #-0xe0] */ ARM64("ldur x9, [x29, #-0xe0]");
    /* 0x00ba6844: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6848: stp      x9, x8, [sp, #0x140] */ ARM64("stp x9, x8, [sp, #0x140]");
    /* 0x00ba684c: stp      x23, x8, [sp, #0x150] */ ARM64("stp x23, x8, [sp, #0x150]");
    /* 0x00ba6850: strh     wzr, [sp, #0x160] */ ARM64("strh wzr, [sp, #0x160]");
    /* 0x00ba6854: ldr      x22, [sp, #0x2c0] */ ARM64("ldr x22, [sp, #0x2c0]");
    /* 0x00ba6858: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba685c: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba6860: b.ne     #0xba675c */ if (COND_NE) goto loc_00ba675c;
    /* 0x00ba6864: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba6868: bl       #0xc738e8 */ CALL_DIRECT(sub_00c738e8);
    /* 0x00ba686c: b        #0xba675c */ goto loc_00ba675c;
loc_00ba6870:
    /* 0x00ba6870: ldr      x24, [x22, #8] */ ARM64("ldr x24, [x22, #8]");
loc_00ba6874:
    /* 0x00ba6874: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba6878: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba687c: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba6880: cbnz     w10, #0xba6874 */ if (w10 != 0) goto loc_00ba6874;
    /* 0x00ba6884: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
loc_00ba6888:
    /* 0x00ba6888: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba688c: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6890: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba6894: cbnz     w10, #0xba6888 */ if (w10 != 0) goto loc_00ba6888;
    /* 0x00ba6898: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba689c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba68a0: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba68a4: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba68a8: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00ba68ac: cbz      x0, #0xba68cc */ if (x0 == 0) goto loc_00ba68cc;
loc_00ba68b0:
    /* 0x00ba68b0: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba68b4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba68b8: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba68bc: cbnz     w9, #0xba68b0 */ if (w9 != 0) goto loc_00ba68b0;
    /* 0x00ba68c0: b.ne     #0xba68cc */ if (COND_NE) goto loc_00ba68cc;
    /* 0x00ba68c4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba68c8: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba68cc:
    /* 0x00ba68cc: ldr      x22, [x23, #8] */ ARM64("ldr x22, [x23, #8]");
loc_00ba68d0:
    /* 0x00ba68d0: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba68d4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba68d8: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba68dc: cbnz     w10, #0xba68d0 */ if (w10 != 0) goto loc_00ba68d0;
    /* 0x00ba68e0: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
loc_00ba68e4:
    /* 0x00ba68e4: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba68e8: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba68ec: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba68f0: cbnz     w10, #0xba68e4 */ if (w10 != 0) goto loc_00ba68e4;
    /* 0x00ba68f4: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba68f8: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba68fc: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba6900: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00ba6904: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00ba6908: cbz      x0, #0xba6928 */ if (x0 == 0) goto loc_00ba6928;
loc_00ba690c:
    /* 0x00ba690c: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba6910: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6914: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba6918: cbnz     w9, #0xba690c */ if (w9 != 0) goto loc_00ba690c;
    /* 0x00ba691c: b.ne     #0xba6928 */ if (COND_NE) goto loc_00ba6928;
    /* 0x00ba6920: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6924: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba6928:
    /* 0x00ba6928: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba692c: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6930: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba6934: cbnz     w10, #0xba6928 */ if (w10 != 0) goto loc_00ba6928;
    /* 0x00ba6938: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba693c: ldr      x23, [sp, #0x2a8] */ ARM64("ldr x23, [sp, #0x2a8]");
    /* 0x00ba6940: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba6944: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba6948: b.ne     #0xba6954 */ if (COND_NE) goto loc_00ba6954;
    /* 0x00ba694c: add      x0, sp, #0x298 */ ARM64("add x0, sp, #0x298");
    /* 0x00ba6950: bl       #0xc73880 */ CALL_DIRECT(sub_00c73880);
loc_00ba6954:
    /* 0x00ba6954: ldr      x8, [sp, #0x2a0] */ ARM64("ldr x8, [sp, #0x2a0]");
    /* 0x00ba6958: str      x22, [x8, x23, lsl #3] */ ARM64("str x22, [x8, x23, lsl #3]");
    /* 0x00ba695c: add      x24, x23, #1 */ ARM64("add x24, x23, #1");
    /* 0x00ba6960: str      x24, [sp, #0x2a8] */ ARM64("str x24, [sp, #0x2a8]");
    /* 0x00ba6964: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00ba6968: cmp      x25, x27 */ ARM64("cmp x25, x27");
    /* 0x00ba696c: b.ne     #0xba6798 */ if (COND_NE) goto loc_00ba6798;
loc_00ba6970:
    /* 0x00ba6970: ldr      x23, [x20, #0x30] */ ARM64("ldr x23, [x20, #0x30]");
    /* 0x00ba6974: cbz      x23, #0xba6a20 */ if (x23 == 0) goto loc_00ba6a20;
    /* 0x00ba6978: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00ba697c: b        #0xba699c */ goto loc_00ba699c;
loc_00ba6980:
    /* 0x00ba6980: ldr      x8, [sp, #0x288] */ ARM64("ldr x8, [sp, #0x288]");
    /* 0x00ba6984: str      x22, [x8, x27, lsl #3] */ ARM64("str x22, [x8, x27, lsl #3]");
    /* 0x00ba6988: add      x8, x27, #1 */ ARM64("add x8, x27, #1");
    /* 0x00ba698c: str      x8, [sp, #0x290] */ ARM64("str x8, [sp, #0x290]");
loc_00ba6990:
    /* 0x00ba6990: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00ba6994: cmp      x25, x23 */ ARM64("cmp x25, x23");
    /* 0x00ba6998: b.eq     #0xba6a20 */ if (COND_EQ) goto loc_00ba6a20;
loc_00ba699c:
    /* 0x00ba699c: ldr      x1, [x20, #0x30] */ ARM64("ldr x1, [x20, #0x30]");
    /* 0x00ba69a0: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00ba69a4: b.hs     #0xba7924 */ if (COND_HS) goto loc_00ba7924;
    /* 0x00ba69a8: ldr      x8, [x20, #0x28] */ ARM64("ldr x8, [x20, #0x28]");
    /* 0x00ba69ac: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00ba69b0: madd     x8, x25, x9, x8 */ ARM64("madd x8, x25, x9, x8");
    /* 0x00ba69b4: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
    /* 0x00ba69b8: cmp      x9, x21 */ ARM64("cmp x9, x21");
    /* 0x00ba69bc: b.ne     #0xba7670 */ if (COND_NE) goto loc_00ba7670;
    /* 0x00ba69c0: ldr      x22, [x8, #8] */ ARM64("ldr x22, [x8, #8]");
    /* 0x00ba69c4: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba69c8: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba69cc: bl       #0xbaf260 */ CALL_DIRECT(sub_00baf260);
    /* 0x00ba69d0: tbnz     w0, #0, #0xba6990 */ if (((w0 >> #0) & 1) != 0) goto loc_00ba6990;
    /* 0x00ba69d4: ldr      x1, [x20, #0x48] */ ARM64("ldr x1, [x20, #0x48]");
    /* 0x00ba69d8: cmp      x25, x1 */ ARM64("cmp x25, x1");
    /* 0x00ba69dc: b.hs     #0xba7964 */ if (COND_HS) goto loc_00ba7964;
    /* 0x00ba69e0: ldr      x8, [x20, #0x40] */ ARM64("ldr x8, [x20, #0x40]");
    /* 0x00ba69e4: lsl      x9, x25, #6 */ ARM64("lsl x9, x25, #6");
    /* 0x00ba69e8: ldr      x8, [x8, x9] */ ARM64("ldr x8, [x8, x9]");
    /* 0x00ba69ec: cbnz     x8, #0xba6990 */ if (x8 != 0) goto loc_00ba6990;
loc_00ba69f0:
    /* 0x00ba69f0: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba69f4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba69f8: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba69fc: cbnz     w10, #0xba69f0 */ if (w10 != 0) goto loc_00ba69f0;
    /* 0x00ba6a00: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6a04: ldr      x27, [sp, #0x290] */ ARM64("ldr x27, [sp, #0x290]");
    /* 0x00ba6a08: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba6a0c: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00ba6a10: b.ne     #0xba6980 */ if (COND_NE) goto loc_00ba6980;
    /* 0x00ba6a14: add      x0, sp, #0x280 */ ARM64("add x0, sp, #0x280");
    /* 0x00ba6a18: bl       #0xc73880 */ CALL_DIRECT(sub_00c73880);
    /* 0x00ba6a1c: b        #0xba6980 */ goto loc_00ba6980;
loc_00ba6a20:
    /* 0x00ba6a20: str      xzr, [sp, #0x390] */ ARM64("str xzr, [sp, #0x390]");
    /* 0x00ba6a24: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba6a28: str      x8, [sp, #0x398] */ ARM64("str x8, [sp, #0x398]");
    /* 0x00ba6a2c: str      xzr, [sp, #0x3a0] */ ARM64("str xzr, [sp, #0x3a0]");
    /* 0x00ba6a30: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00ba6a34: cbz      x24, #0xba702c */ if (x24 == 0) goto loc_00ba702c;
    /* 0x00ba6a38: str      xzr, [sp, #0xd8] */ ARM64("str xzr, [sp, #0xd8]");
loc_00ba6a3c:
    /* 0x00ba6a3c: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00ba6a40: str      x8, [sp, #0x2a8] */ ARM64("str x8, [sp, #0x2a8]");
    /* 0x00ba6a44: ldr      x9, [sp, #0x2a0] */ ARM64("ldr x9, [sp, #0x2a0]");
    /* 0x00ba6a48: ldr      x27, [x9, x8, lsl #3] */ ARM64("ldr x27, [x9, x8, lsl #3]");
loc_00ba6a4c:
    /* 0x00ba6a4c: ldr      x8, [sp, #0x290] */ ARM64("ldr x8, [sp, #0x290]");
    /* 0x00ba6a50: str      x8, [sp, #0xa0] */ ARM64("str x8, [sp, #0xa0]");
    /* 0x00ba6a54: cbz      x8, #0xba6d1c */ if (x8 == 0) goto loc_00ba6d1c;
    /* 0x00ba6a58: ldr      x8, [sp, #0xa0] */ ARM64("ldr x8, [sp, #0xa0]");
    /* 0x00ba6a5c: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00ba6a60: str      x8, [sp, #0x290] */ ARM64("str x8, [sp, #0x290]");
    /* 0x00ba6a64: ldr      x9, [sp, #0x288] */ ARM64("ldr x9, [sp, #0x288]");
    /* 0x00ba6a68: stp      x9, x8, [sp, #0x70] */ ARM64("stp x9, x8, [sp, #0x70]");
    /* 0x00ba6a6c: ldr      x28, [x9, x8, lsl #3] */ ARM64("ldr x28, [x9, x8, lsl #3]");
    /* 0x00ba6a70: ldr      x8, [sp, #0x2e8] */ ARM64("ldr x8, [sp, #0x2e8]");
    /* 0x00ba6a74: cbz      x8, #0xba72a0 */ if (x8 == 0) goto loc_00ba72a0;
    /* 0x00ba6a78: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba6a7c: add      x9, x28, #8 */ ARM64("add x9, x28, #8");
    /* 0x00ba6a80: mul      x11, x9, x19 */ ARM64("mul x11, x9, x19");
    /* 0x00ba6a84: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba6a88: ldr      x9, [sp, #0x2d8] */ ARM64("ldr x9, [sp, #0x2d8]");
    /* 0x00ba6a8c: ldr      x10, [sp, #0x2d0] */ ARM64("ldr x10, [sp, #0x2d0]");
    /* 0x00ba6a90: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba6a94: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6a98: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6a9c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6aa0: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6aa4: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6aa8: b.eq     #0xba6ad8 */ if (COND_EQ) goto loc_00ba6ad8;
loc_00ba6aac:
    /* 0x00ba6aac: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba6ab0: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba6ab4: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba6ab8: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba6abc: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00ba6ac0: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00ba6ac4: cmp      x28, x14 */ ARM64("cmp x28, x14");
    /* 0x00ba6ac8: b.eq     #0xba6b10 */ if (COND_EQ) goto loc_00ba6b10;
    /* 0x00ba6acc: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba6ad0: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba6ad4: b.ne     #0xba6aac */ if (COND_NE) goto loc_00ba6aac;
loc_00ba6ad8:
    /* 0x00ba6ad8: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba6adc: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba6ae0: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba6ae4: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba6ae8: tbnz     w12, #0, #0xba72a0 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba72a0;
    /* 0x00ba6aec: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba6af0: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba6af4: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6af8: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6afc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6b00: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6b04: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6b08: b.ne     #0xba6aac */ if (COND_NE) goto loc_00ba6aac;
    /* 0x00ba6b0c: b        #0xba6ad8 */ goto loc_00ba6ad8;
loc_00ba6b10:
    /* 0x00ba6b10: ldur     x22, [x13, #-8] */ ARM64("ldur x22, [x13, #-8]");
loc_00ba6b14:
    /* 0x00ba6b14: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba6b18: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6b1c: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba6b20: cbnz     w10, #0xba6b14 */ if (w10 != 0) goto loc_00ba6b14;
    /* 0x00ba6b24: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6b28: ldur     x8, [x29, #-0x98] */ ARM64("ldur x8, [x29, #-0x98]");
    /* 0x00ba6b2c: cbz      x8, #0xba72bc */ if (x8 == 0) goto loc_00ba72bc;
    /* 0x00ba6b30: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba6b34: add      x9, x22, #8 */ ARM64("add x9, x22, #8");
    /* 0x00ba6b38: mul      x11, x9, x19 */ ARM64("mul x11, x9, x19");
    /* 0x00ba6b3c: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba6b40: ldp      x10, x9, [x29, #-0xb0] */ ARM64("ldp x10, x9, [x29, #-0xb0]");
    /* 0x00ba6b44: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba6b48: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6b4c: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6b50: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6b54: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6b58: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6b5c: b.eq     #0xba6b8c */ if (COND_EQ) goto loc_00ba6b8c;
loc_00ba6b60:
    /* 0x00ba6b60: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba6b64: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba6b68: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba6b6c: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba6b70: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00ba6b74: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00ba6b78: cmp      x22, x14 */ ARM64("cmp x22, x14");
    /* 0x00ba6b7c: b.eq     #0xba6bc4 */ if (COND_EQ) goto loc_00ba6bc4;
    /* 0x00ba6b80: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba6b84: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba6b88: b.ne     #0xba6b60 */ if (COND_NE) goto loc_00ba6b60;
loc_00ba6b8c:
    /* 0x00ba6b8c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba6b90: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba6b94: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba6b98: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba6b9c: tbnz     w12, #0, #0xba72bc */ if (((w12 >> #0) & 1) != 0) goto loc_00ba72bc;
    /* 0x00ba6ba0: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba6ba4: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba6ba8: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6bac: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6bb0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6bb4: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6bb8: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6bbc: b.ne     #0xba6b60 */ if (COND_NE) goto loc_00ba6b60;
    /* 0x00ba6bc0: b        #0xba6b8c */ goto loc_00ba6b8c;
loc_00ba6bc4:
    /* 0x00ba6bc4: ldur     x24, [x13, #-8] */ ARM64("ldur x24, [x13, #-8]");
loc_00ba6bc8:
    /* 0x00ba6bc8: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba6bcc: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6bd0: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba6bd4: cbnz     w10, #0xba6bc8 */ if (w10 != 0) goto loc_00ba6bc8;
    /* 0x00ba6bd8: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6bdc: mov      w0, #0x18 */ ARM64("mov w0, #0x18");
    /* 0x00ba6be0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6be4: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00ba6be8: cbz      x0, #0xba7840 */ if (x0 == 0) goto loc_00ba7840;
loc_00ba6bec:
    /* 0x00ba6bec: ldxr     x8, [x28] */ ARM64("ldxr x8, [x28]");
    /* 0x00ba6bf0: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6bf4: stxr     w10, x9, [x28] */ ARM64("stxr w10, x9, [x28]");
    /* 0x00ba6bf8: cbnz     w10, #0xba6bec */ if (w10 != 0) goto loc_00ba6bec;
    /* 0x00ba6bfc: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6c00: stp      x21, x28, [x23] */ ARM64("stp x21, x28, [x23]");
    /* 0x00ba6c04: mov      w0, #0x40 */ ARM64("mov w0, #0x40");
    /* 0x00ba6c08: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6c0c: cbz      x0, #0xba7850 */ if (x0 == 0) goto loc_00ba7850;
loc_00ba6c10:
    /* 0x00ba6c10: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba6c14: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6c18: stxr     w10, x9, [x24] */ ARM64("stxr w10, x9, [x24]");
    /* 0x00ba6c1c: cbnz     w10, #0xba6c10 */ if (w10 != 0) goto loc_00ba6c10;
    /* 0x00ba6c20: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6c24: stp      xzr, x24, [x0] */ ARM64("stp xzr, x24, [x0]");
    /* 0x00ba6c28: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6c2c: stp      x8, x23, [sp, #0x130] */ ARM64("stp x8, x23, [sp, #0x130]");
    /* 0x00ba6c30: dup      v0.2d, x8 */ ARM64("dup v0.2d, x8");
    /* 0x00ba6c34: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba6c38: stp      x0, x8, [sp, #0x150] */ ARM64("stp x0, x8, [sp, #0x150]");
    /* 0x00ba6c3c: strh     wzr, [sp, #0x160] */ ARM64("strh wzr, [sp, #0x160]");
    /* 0x00ba6c40: ldr      x23, [sp, #0x3a0] */ ARM64("ldr x23, [sp, #0x3a0]");
    /* 0x00ba6c44: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba6c48: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00ba6c4c: b.ne     #0xba6c58 */ if (COND_NE) goto loc_00ba6c58;
    /* 0x00ba6c50: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba6c54: bl       #0xc738e8 */ CALL_DIRECT(sub_00c738e8);
loc_00ba6c58:
    /* 0x00ba6c58: ldr      x8, [sp, #0x398] */ ARM64("ldr x8, [sp, #0x398]");
    /* 0x00ba6c5c: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00ba6c60: madd     x8, x23, x9, x8 */ ARM64("madd x8, x23, x9, x8");
    /* 0x00ba6c64: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba6c68: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba6c6c: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba6c70: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba6c74: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba6c78: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00ba6c7c: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00ba6c80: str      x9, [x8, #0x30] */ ARM64("str x9, [x8, #0x30]");
    /* 0x00ba6c84: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00ba6c88: str      x8, [sp, #0x3a0] */ ARM64("str x8, [sp, #0x3a0]");
    /* 0x00ba6c8c: cmp      x22, x24 */ ARM64("cmp x22, x24");
    /* 0x00ba6c90: b.ne     #0xba6cc8 */ if (COND_NE) goto loc_00ba6cc8;
    /* 0x00ba6c94: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba6c98: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba6c9c: bl       #0xbaf260 */ CALL_DIRECT(sub_00baf260);
    /* 0x00ba6ca0: cbz      w0, #0xba6cc8 */ if (w0 == 0) goto loc_00ba6cc8;
loc_00ba6ca4:
    /* 0x00ba6ca4: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba6ca8: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6cac: stxr     w10, x9, [x22] */ ARM64("stxr w10, x9, [x22]");
    /* 0x00ba6cb0: cbnz     w10, #0xba6ca4 */ if (w10 != 0) goto loc_00ba6ca4;
    /* 0x00ba6cb4: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6cb8: ldp      x9, x8, [sp, #0x70] */ ARM64("ldp x9, x8, [sp, #0x70]");
    /* 0x00ba6cbc: str      x22, [x9, x8, lsl #3] */ ARM64("str x22, [x9, x8, lsl #3]");
    /* 0x00ba6cc0: ldr      x8, [sp, #0xa0] */ ARM64("ldr x8, [sp, #0xa0]");
    /* 0x00ba6cc4: str      x8, [sp, #0x290] */ ARM64("str x8, [sp, #0x290]");
loc_00ba6cc8:
    /* 0x00ba6cc8: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba6ccc: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba6cd0: mov      x2, x28 */ ARM64("mov x2, x28");
    /* 0x00ba6cd4: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00ba6cd8: cbz      x0, #0xba6cf8 */ if (x0 == 0) goto loc_00ba6cf8;
loc_00ba6cdc:
    /* 0x00ba6cdc: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba6ce0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6ce4: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba6ce8: cbnz     w9, #0xba6cdc */ if (w9 != 0) goto loc_00ba6cdc;
    /* 0x00ba6cec: b.ne     #0xba6cf8 */ if (COND_NE) goto loc_00ba6cf8;
    /* 0x00ba6cf0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6cf4: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba6cf8:
    /* 0x00ba6cf8: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba6cfc: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6d00: stlxr    w9, x8, [x24] */ ARM64("stlxr w9, x8, [x24]");
    /* 0x00ba6d04: cbnz     w9, #0xba6cf8 */ if (w9 != 0) goto loc_00ba6cf8;
    /* 0x00ba6d08: b.ne     #0xba6a4c */ if (COND_NE) goto loc_00ba6a4c;
    /* 0x00ba6d0c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6d10: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba6d14: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba6d18: b        #0xba6a4c */ goto loc_00ba6a4c;
loc_00ba6d1c:
    /* 0x00ba6d1c: ldr      x8, [sp, #0x2e8] */ ARM64("ldr x8, [sp, #0x2e8]");
    /* 0x00ba6d20: cbz      x8, #0xba7550 */ if (x8 == 0) goto loc_00ba7550;
    /* 0x00ba6d24: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba6d28: add      x9, x27, #8 */ ARM64("add x9, x27, #8");
    /* 0x00ba6d2c: mul      x11, x9, x19 */ ARM64("mul x11, x9, x19");
    /* 0x00ba6d30: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00ba6d34: ldr      x9, [sp, #0x2d8] */ ARM64("ldr x9, [sp, #0x2d8]");
    /* 0x00ba6d38: ldr      x10, [sp, #0x2d0] */ ARM64("ldr x10, [sp, #0x2d0]");
    /* 0x00ba6d3c: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00ba6d40: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6d44: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6d48: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6d4c: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6d50: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6d54: b.eq     #0xba6d84 */ if (COND_EQ) goto loc_00ba6d84;
loc_00ba6d58:
    /* 0x00ba6d58: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00ba6d5c: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00ba6d60: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00ba6d64: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00ba6d68: sub      x13, x10, x13, lsl #4 */ ARM64("sub x13, x10, x13, lsl #4");
    /* 0x00ba6d6c: ldur     x14, [x13, #-0x10] */ ARM64("ldur x14, [x13, #-0x10]");
    /* 0x00ba6d70: cmp      x27, x14 */ ARM64("cmp x27, x14");
    /* 0x00ba6d74: b.eq     #0xba6dbc */ if (COND_EQ) goto loc_00ba6dbc;
    /* 0x00ba6d78: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00ba6d7c: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00ba6d80: b.ne     #0xba6d58 */ if (COND_NE) goto loc_00ba6d58;
loc_00ba6d84:
    /* 0x00ba6d84: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba6d88: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba6d8c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba6d90: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00ba6d94: tbnz     w12, #0, #0xba7550 */ if (((w12 >> #0) & 1) != 0) goto loc_00ba7550;
    /* 0x00ba6d98: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba6d9c: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00ba6da0: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00ba6da4: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00ba6da8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6dac: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00ba6db0: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6db4: b.ne     #0xba6d58 */ if (COND_NE) goto loc_00ba6d58;
    /* 0x00ba6db8: b        #0xba6d84 */ goto loc_00ba6d84;
loc_00ba6dbc:
    /* 0x00ba6dbc: ldur     x8, [x29, #-0x98] */ ARM64("ldur x8, [x29, #-0x98]");
    /* 0x00ba6dc0: cbz      x8, #0xba7544 */ if (x8 == 0) goto loc_00ba7544;
    /* 0x00ba6dc4: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00ba6dc8: ldur     x9, [x13, #-8] */ ARM64("ldur x9, [x13, #-8]");
    /* 0x00ba6dcc: add      x10, x9, #8 */ ARM64("add x10, x9, #8");
    /* 0x00ba6dd0: mul      x12, x10, x19 */ ARM64("mul x12, x10, x19");
    /* 0x00ba6dd4: lsr      x13, x12, #0x39 */ ARM64("lsr x13, x12, #0x39");
    /* 0x00ba6dd8: ldp      x11, x10, [x29, #-0xb0] */ ARM64("ldp x11, x10, [x29, #-0xb0]");
    /* 0x00ba6ddc: dup      v0.8b, w13 */ ARM64("dup v0.8b, w13");
    /* 0x00ba6de0: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba6de4: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00ba6de8: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6dec: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00ba6df0: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6df4: b.eq     #0xba6e24 */ if (COND_EQ) goto loc_00ba6e24;
loc_00ba6df8:
    /* 0x00ba6df8: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00ba6dfc: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00ba6e00: add      x14, x12, x14, lsr #3 */ ARM64("add x14, x12, x14, lsr #3");
    /* 0x00ba6e04: and      x14, x14, x10 */ ARM64("and x14, x14, x10");
    /* 0x00ba6e08: sub      x14, x11, x14, lsl #4 */ ARM64("sub x14, x11, x14, lsl #4");
    /* 0x00ba6e0c: ldur     x15, [x14, #-0x10] */ ARM64("ldur x15, [x14, #-0x10]");
    /* 0x00ba6e10: cmp      x9, x15 */ ARM64("cmp x9, x15");
    /* 0x00ba6e14: b.eq     #0xba6e5c */ if (COND_EQ) goto loc_00ba6e5c;
    /* 0x00ba6e18: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00ba6e1c: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00ba6e20: b.ne     #0xba6df8 */ if (COND_NE) goto loc_00ba6df8;
loc_00ba6e24:
    /* 0x00ba6e24: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba6e28: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba6e2c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba6e30: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba6e34: tbnz     w13, #0, #0xba7544 */ if (((w13 >> #0) & 1) != 0) goto loc_00ba7544;
    /* 0x00ba6e38: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00ba6e3c: add      x12, x12, x8 */ ARM64("add x12, x12, x8");
    /* 0x00ba6e40: and      x12, x12, x10 */ ARM64("and x12, x12, x10");
    /* 0x00ba6e44: ldr      d1, [x11, x12] */ ARM64("ldr d1, [x11, x12]");
    /* 0x00ba6e48: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba6e4c: fmov     x13, d2 */ ARM64("fmov x13, d2");
    /* 0x00ba6e50: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba6e54: b.ne     #0xba6df8 */ if (COND_NE) goto loc_00ba6df8;
    /* 0x00ba6e58: b        #0xba6e24 */ goto loc_00ba6e24;
loc_00ba6e5c:
    /* 0x00ba6e5c: ldur     x8, [x14, #-8] */ ARM64("ldur x8, [x14, #-8]");
    /* 0x00ba6e60: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00ba6e64: b.eq     #0xba6fe4 */ if (COND_EQ) goto loc_00ba6fe4;
    /* 0x00ba6e68: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba6e6c: cbnz     x8, #0xba6e98 */ if (x8 != 0) goto loc_00ba6e98;
    /* 0x00ba6e70: mov      w0, #0x28 */ ARM64("mov w0, #0x28");
    /* 0x00ba6e74: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6e78: str      x0, [sp, #0xd8] */ ARM64("str x0, [sp, #0xd8]");
    /* 0x00ba6e7c: cbz      x0, #0xba7954 */ if (x0 == 0) goto loc_00ba7954;
    /* 0x00ba6e80: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6e84: ldr      x9, [sp, #0xd8] */ ARM64("ldr x9, [sp, #0xd8]");
    /* 0x00ba6e88: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00ba6e8c: strb     wzr, [x9, #8] */ ARM64("strb wzr, [x9, #8]");
    /* 0x00ba6e90: mov      x25, x9 */ ARM64("mov x25, x9");
    /* 0x00ba6e94: str      x21, [x9, #0x10] */ ARM64("str x21, [x9, #0x10]");
loc_00ba6e98:
    /* 0x00ba6e98: mov      w0, #0x18 */ ARM64("mov w0, #0x18");
    /* 0x00ba6e9c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6ea0: ldr      x11, [sp, #0xd8] */ ARM64("ldr x11, [sp, #0xd8]");
    /* 0x00ba6ea4: cbz      x0, #0xba78e8 */ if (x0 == 0) goto loc_00ba78e8;
loc_00ba6ea8:
    /* 0x00ba6ea8: ldxr     x8, [x11] */ ARM64("ldxr x8, [x11]");
    /* 0x00ba6eac: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6eb0: stxr     w10, x9, [x11] */ ARM64("stxr w10, x9, [x11]");
    /* 0x00ba6eb4: cbnz     w10, #0xba6ea8 */ if (w10 != 0) goto loc_00ba6ea8;
    /* 0x00ba6eb8: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6ebc: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba6ec0: stp      x21, x8, [x0] */ ARM64("stp x21, x8, [x0]");
    /* 0x00ba6ec4: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6ec8: stp      x8, x0, [x29, #-0xf0] */ ARM64("stp x8, x0, [x29, #-0xf0]");
    /* 0x00ba6ecc: stur     x8, [x29, #-0xe0] */ ARM64("stur x8, [x29, #-0xe0]");
    /* 0x00ba6ed0: mov      w0, #0x40 */ ARM64("mov w0, #0x40");
    /* 0x00ba6ed4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00ba6ed8: cbz      x0, #0xba78f8 */ if (x0 == 0) goto loc_00ba78f8;
loc_00ba6edc:
    /* 0x00ba6edc: ldxr     x8, [x27] */ ARM64("ldxr x8, [x27]");
    /* 0x00ba6ee0: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6ee4: stxr     w10, x9, [x27] */ ARM64("stxr w10, x9, [x27]");
    /* 0x00ba6ee8: cbnz     w10, #0xba6edc */ if (w10 != 0) goto loc_00ba6edc;
    /* 0x00ba6eec: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6ef0: stp      xzr, x27, [x0] */ ARM64("stp xzr, x27, [x0]");
    /* 0x00ba6ef4: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00ba6ef8: str      q0, [sp, #0x130] */ ARM64("str q0, [sp, #0x130]");
    /* 0x00ba6efc: ldur     x9, [x29, #-0xe0] */ ARM64("ldur x9, [x29, #-0xe0]");
    /* 0x00ba6f00: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00ba6f04: stp      x9, x8, [sp, #0x140] */ ARM64("stp x9, x8, [sp, #0x140]");
    /* 0x00ba6f08: stp      x0, x8, [sp, #0x150] */ ARM64("stp x0, x8, [sp, #0x150]");
    /* 0x00ba6f0c: strh     wzr, [sp, #0x160] */ ARM64("strh wzr, [sp, #0x160]");
    /* 0x00ba6f10: ldr      x22, [sp, #0x3a0] */ ARM64("ldr x22, [sp, #0x3a0]");
    /* 0x00ba6f14: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba6f18: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba6f1c: b.ne     #0xba6f28 */ if (COND_NE) goto loc_00ba6f28;
    /* 0x00ba6f20: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba6f24: bl       #0xc738e8 */ CALL_DIRECT(sub_00c738e8);
loc_00ba6f28:
    /* 0x00ba6f28: ldr      x8, [sp, #0x398] */ ARM64("ldr x8, [sp, #0x398]");
    /* 0x00ba6f2c: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00ba6f30: madd     x8, x22, x9, x8 */ ARM64("madd x8, x22, x9, x8");
    /* 0x00ba6f34: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba6f38: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba6f3c: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba6f40: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba6f44: ldr      q0, [sp, #0x150] */ ARM64("ldr q0, [sp, #0x150]");
    /* 0x00ba6f48: str      q0, [x8, #0x20] */ ARM64("str q0, [x8, #0x20]");
    /* 0x00ba6f4c: ldr      x9, [sp, #0x160] */ ARM64("ldr x9, [sp, #0x160]");
    /* 0x00ba6f50: str      x9, [x8, #0x30] */ ARM64("str x9, [x8, #0x30]");
    /* 0x00ba6f54: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba6f58: str      x8, [sp, #0x3a0] */ ARM64("str x8, [sp, #0x3a0]");
loc_00ba6f5c:
    /* 0x00ba6f5c: ldxr     x8, [x27] */ ARM64("ldxr x8, [x27]");
    /* 0x00ba6f60: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6f64: stxr     w10, x9, [x27] */ ARM64("stxr w10, x9, [x27]");
    /* 0x00ba6f68: cbnz     w10, #0xba6f5c */ if (w10 != 0) goto loc_00ba6f5c;
    /* 0x00ba6f6c: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6f70: ldr      x11, [sp, #0xd8] */ ARM64("ldr x11, [sp, #0xd8]");
loc_00ba6f74:
    /* 0x00ba6f74: ldxr     x8, [x11] */ ARM64("ldxr x8, [x11]");
    /* 0x00ba6f78: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00ba6f7c: stxr     w10, x9, [x11] */ ARM64("stxr w10, x9, [x11]");
    /* 0x00ba6f80: cbnz     w10, #0xba6f74 */ if (w10 != 0) goto loc_00ba6f74;
    /* 0x00ba6f84: tbnz     x8, #0x3f, #0xba724c */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00ba724c;
    /* 0x00ba6f88: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba6f8c: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00ba6f90: ldr      x2, [sp, #0xd8] */ ARM64("ldr x2, [sp, #0xd8]");
    /* 0x00ba6f94: bl       #0xbafae4 */ CALL_DIRECT(sub_00bafae4);
    /* 0x00ba6f98: cbz      x0, #0xba6fb8 */ if (x0 == 0) goto loc_00ba6fb8;
loc_00ba6f9c:
    /* 0x00ba6f9c: ldxr     x8, [x0] */ ARM64("ldxr x8, [x0]");
    /* 0x00ba6fa0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6fa4: stlxr    w9, x8, [x0] */ ARM64("stlxr w9, x8, [x0]");
    /* 0x00ba6fa8: cbnz     w9, #0xba6f9c */ if (w9 != 0) goto loc_00ba6f9c;
    /* 0x00ba6fac: b.ne     #0xba6fb8 */ if (COND_NE) goto loc_00ba6fb8;
    /* 0x00ba6fb0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6fb4: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba6fb8:
    /* 0x00ba6fb8: ldr      x22, [sp, #0x290] */ ARM64("ldr x22, [sp, #0x290]");
    /* 0x00ba6fbc: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba6fc0: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba6fc4: b.ne     #0xba6fd0 */ if (COND_NE) goto loc_00ba6fd0;
    /* 0x00ba6fc8: add      x0, sp, #0x280 */ ARM64("add x0, sp, #0x280");
    /* 0x00ba6fcc: bl       #0xc73880 */ CALL_DIRECT(sub_00c73880);
loc_00ba6fd0:
    /* 0x00ba6fd0: ldr      x8, [sp, #0x288] */ ARM64("ldr x8, [sp, #0x288]");
    /* 0x00ba6fd4: str      x27, [x8, x22, lsl #3] */ ARM64("str x27, [x8, x22, lsl #3]");
    /* 0x00ba6fd8: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba6fdc: str      x8, [sp, #0x290] */ ARM64("str x8, [sp, #0x290]");
    /* 0x00ba6fe0: b        #0xba7004 */ goto loc_00ba7004;
loc_00ba6fe4:
    /* 0x00ba6fe4: ldxr     x8, [x27] */ ARM64("ldxr x8, [x27]");
    /* 0x00ba6fe8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba6fec: stlxr    w9, x8, [x27] */ ARM64("stlxr w9, x8, [x27]");
    /* 0x00ba6ff0: cbnz     w9, #0xba6fe4 */ if (w9 != 0) goto loc_00ba6fe4;
    /* 0x00ba6ff4: b.ne     #0xba7004 */ if (COND_NE) goto loc_00ba7004;
    /* 0x00ba6ff8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba6ffc: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba7000: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba7004:
    /* 0x00ba7004: ldr      x24, [sp, #0x2a8] */ ARM64("ldr x24, [sp, #0x2a8]");
    /* 0x00ba7008: cbnz     x24, #0xba6a3c */ if (x24 != 0) goto loc_00ba6a3c;
    /* 0x00ba700c: b        #0xba7030 */ goto loc_00ba7030;
loc_00ba7010:
    /* 0x00ba7010: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00ba7014: str      xzr, [sp, #0xd8] */ ARM64("str xzr, [sp, #0xd8]");
    /* 0x00ba7018: str      xzr, [sp, #0x390] */ ARM64("str xzr, [sp, #0x390]");
    /* 0x00ba701c: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00ba7020: str      x8, [sp, #0x398] */ ARM64("str x8, [sp, #0x398]");
    /* 0x00ba7024: str      xzr, [sp, #0x3a0] */ ARM64("str xzr, [sp, #0x3a0]");
    /* 0x00ba7028: b        #0xba7030 */ goto loc_00ba7030;
loc_00ba702c:
    /* 0x00ba702c: str      xzr, [sp, #0xd8] */ ARM64("str xzr, [sp, #0xd8]");
loc_00ba7030:
    /* 0x00ba7030: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba7034: ldr      x9, [sp, #0x2b8] */ ARM64("ldr x9, [sp, #0x2b8]");
    /* 0x00ba7038: ldr      x10, [sp, #0x2c0] */ ARM64("ldr x10, [sp, #0x2c0]");
    /* 0x00ba703c: mov      w11, #0x38 */ ARM64("mov w11, #0x38");
    /* 0x00ba7040: madd     x10, x10, x11, x9 */ ARM64("madd x10, x10, x11, x9");
    /* 0x00ba7044: stp      x9, x9, [sp, #0x130] */ ARM64("stp x9, x9, [sp, #0x130]");
    /* 0x00ba7048: stp      x8, x10, [sp, #0x140] */ ARM64("stp x8, x10, [sp, #0x140]");
    /* 0x00ba704c: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba7050: add      x1, sp, #0x130 */ ARM64("add x1, sp, #0x130");
    /* 0x00ba7054: bl       #0xb9d0d0 */ CALL_DIRECT(sub_00b9d0d0);
    /* 0x00ba7058: ldr      q0, [sp, #0x390] */ ARM64("ldr q0, [sp, #0x390]");
    /* 0x00ba705c: add      x9, sp, #0x130 */ ARM64("add x9, sp, #0x130");
    /* 0x00ba7060: stur     q0, [x9, #8] */ ARM64("stur q0, [x9, #8]");
    /* 0x00ba7064: ldr      x8, [sp, #0x3a0] */ ARM64("ldr x8, [sp, #0x3a0]");
    /* 0x00ba7068: stur     x8, [x9, #0x18] */ ARM64("stur x8, [x9, #0x18]");
    /* 0x00ba706c: str      x26, [sp, #0x130] */ ARM64("str x26, [sp, #0x130]");
    /* 0x00ba7070: ldr      x22, [sp, #0x278] */ ARM64("ldr x22, [sp, #0x278]");
    /* 0x00ba7074: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00ba7078: cmp      x22, x8 */ ARM64("cmp x22, x8");
    /* 0x00ba707c: b.ne     #0xba7088 */ if (COND_NE) goto loc_00ba7088;
    /* 0x00ba7080: add      x0, sp, #0x268 */ ARM64("add x0, sp, #0x268");
    /* 0x00ba7084: bl       #0xc737b0 */ CALL_DIRECT(sub_00c737b0);
loc_00ba7088:
    /* 0x00ba7088: ldr      x8, [sp, #0x270] */ ARM64("ldr x8, [sp, #0x270]");
    /* 0x00ba708c: add      x8, x8, x22, lsl #5 */ ARM64("add x8, x8, x22, lsl #5");
    /* 0x00ba7090: ldr      q0, [sp, #0x130] */ ARM64("ldr q0, [sp, #0x130]");
    /* 0x00ba7094: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00ba7098: ldr      q0, [sp, #0x140] */ ARM64("ldr q0, [sp, #0x140]");
    /* 0x00ba709c: str      q0, [x8, #0x10] */ ARM64("str q0, [x8, #0x10]");
    /* 0x00ba70a0: add      x8, x22, #1 */ ARM64("add x8, x22, #1");
    /* 0x00ba70a4: str      x8, [sp, #0x278] */ ARM64("str x8, [sp, #0x278]");
    /* 0x00ba70a8: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba70ac: cbz      x8, #0xba70d0 */ if (x8 == 0) goto loc_00ba70d0;
loc_00ba70b0:
    /* 0x00ba70b0: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba70b4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba70b8: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba70bc: cbnz     w9, #0xba70b0 */ if (w9 != 0) goto loc_00ba70b0;
    /* 0x00ba70c0: b.ne     #0xba70d0 */ if (COND_NE) goto loc_00ba70d0;
    /* 0x00ba70c4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba70c8: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba70cc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba70d0:
    /* 0x00ba70d0: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba70d4: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00ba70d8: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba70dc: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00ba70e0: ldr      x22, [sp, #0x2a0] */ ARM64("ldr x22, [sp, #0x2a0]");
    /* 0x00ba70e4: ldr      x1, [sp, #0x2a8] */ ARM64("ldr x1, [sp, #0x2a8]");
    /* 0x00ba70e8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba70ec: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
    /* 0x00ba70f0: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba70f4: cbz      x8, #0xba7100 */ if (x8 == 0) goto loc_00ba7100;
    /* 0x00ba70f8: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba70fc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba7100:
    /* 0x00ba7100: ldr      x22, [sp, #0x288] */ ARM64("ldr x22, [sp, #0x288]");
    /* 0x00ba7104: ldr      x1, [sp, #0x290] */ ARM64("ldr x1, [sp, #0x290]");
    /* 0x00ba7108: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba710c: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
    /* 0x00ba7110: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba7114: cbz      x8, #0xba6664 */ if (x8 == 0) goto loc_00ba6664;
    /* 0x00ba7118: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba711c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7120: b        #0xba6664 */ goto loc_00ba6664;
loc_00ba7124:
    /* 0x00ba7124: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba7128: ldr      x8, [x8, #0x28] */ ARM64("ldr x8, [x8, #0x28]");
loc_00ba712c:
    /* 0x00ba712c: ldr      x9, [sp, #0xd0] */ ARM64("ldr x9, [sp, #0xd0]");
    /* 0x00ba7130: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00ba7134: b.ls     #0xba7a18 */ if (COND_LS) goto loc_00ba7a18;
    /* 0x00ba7138: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba713c: ldr      x8, [x8, #0x20] */ ARM64("ldr x8, [x8, #0x20]");
    /* 0x00ba7140: add      x22, x8, x9, lsl #5 */ ARM64("add x22, x8, x9, lsl #5");
    /* 0x00ba7144: ldr      x8, [x22] */ ARM64("ldr x8, [x22]");
    /* 0x00ba7148: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00ba714c: b.eq     #0xba7a18 */ if (COND_EQ) goto loc_00ba7a18;
    /* 0x00ba7150: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00ba7154: ldr      x20, [sp, #0x270] */ ARM64("ldr x20, [sp, #0x270]");
    /* 0x00ba7158: ldr      x9, [sp, #0x278] */ ARM64("ldr x9, [sp, #0x278]");
    /* 0x00ba715c: lsl      x23, x9, #5 */ ARM64("lsl x23, x9, #5");
    /* 0x00ba7160: add      x10, x20, x23 */ ARM64("add x10, x20, x23");
    /* 0x00ba7164: stp      x20, x20, [x29, #-0xf0] */ ARM64("stp x20, x20, [x29, #-0xf0]");
    /* 0x00ba7168: stp      x8, x10, [x29, #-0xe0] */ ARM64("stp x8, x10, [x29, #-0xe0]");
    /* 0x00ba716c: cbz      x9, #0xba71f8 */ if (x9 == 0) goto loc_00ba71f8;
    /* 0x00ba7170: add      x25, sp, #0x130 */ ARM64("add x25, sp, #0x130");
    /* 0x00ba7174: mov      w26, #0x38 */ ARM64("mov w26, #0x38");
loc_00ba7178:
    /* 0x00ba7178: add      x9, x20, x23 */ ARM64("add x9, x20, x23");
    /* 0x00ba717c: sub      x24, x9, #0x20 */ ARM64("sub x24, x9, #0x20");
    /* 0x00ba7180: ldur     x8, [x9, #-0x18] */ ARM64("ldur x8, [x9, #-0x18]");
    /* 0x00ba7184: cmp      x8, x21 */ ARM64("cmp x8, x21");
    /* 0x00ba7188: b.eq     #0xba71f0 */ if (COND_EQ) goto loc_00ba71f0;
    /* 0x00ba718c: ldp      x9, x10, [x9, #-0x10] */ ARM64("ldp x9, x10, [x9, #-0x10]");
    /* 0x00ba7190: ldr      x2, [x24] */ ARM64("ldr x2, [x24]");
    /* 0x00ba7194: madd     x10, x10, x26, x9 */ ARM64("madd x10, x10, x26, x9");
    /* 0x00ba7198: stp      x9, x9, [x29, #-0xb0] */ ARM64("stp x9, x9, [x29, #-0xb0]");
    /* 0x00ba719c: stp      x8, x10, [x29, #-0xa0] */ ARM64("stp x8, x10, [x29, #-0xa0]");
    /* 0x00ba71a0: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba71a4: add      x3, x2, #1 */ ARM64("add x3, x2, #1");
    /* 0x00ba71a8: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba71ac: bl       #0xb9a884 */ CALL_DIRECT(sub_00b9a884);
    /* 0x00ba71b0: ldp      q0, q1, [x29, #-0xb0] */ ARM64("ldp q0, q1, [x29, #-0xb0]");
    /* 0x00ba71b4: stur     q0, [x25, #0x28] */ ARM64("stur q0, [x25, #0x28]");
    /* 0x00ba71b8: stur     q1, [x25, #0x38] */ ARM64("stur q1, [x25, #0x38]");
    /* 0x00ba71bc: ldp      q0, q1, [sp, #0x2d0] */ ARM64("ldp q0, q1, [sp, #0x2d0]");
    /* 0x00ba71c0: stp      q0, q1, [sp, #0x130] */ ARM64("stp q0, q1, [sp, #0x130]");
    /* 0x00ba71c4: ldr      x8, [sp, #0x2f0] */ ARM64("ldr x8, [sp, #0x2f0]");
    /* 0x00ba71c8: str      x8, [sp, #0x150] */ ARM64("str x8, [sp, #0x150]");
    /* 0x00ba71cc: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba71d0: bl       #0xbde21c */ CALL_DIRECT(sub_00bde21c);
    /* 0x00ba71d4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba71d8: bl       #0xbd1b58 */ CALL_DIRECT(sub_00bd1b58);
    /* 0x00ba71dc: add      x0, x25, #0x28 */ ARM64("add x0, x25, #0x28");
    /* 0x00ba71e0: bl       #0xbe6ea0 */ CALL_DIRECT(sub_00be6ea0);
    /* 0x00ba71e4: sub      x23, x23, #0x20 */ ARM64("sub x23, x23, #0x20");
    /* 0x00ba71e8: cbnz     x23, #0xba7178 */ if (x23 != 0) goto loc_00ba7178;
    /* 0x00ba71ec: b        #0xba71f4 */ goto loc_00ba71f4;
loc_00ba71f0:
    /* 0x00ba71f0: mov      x20, x24 */ ARM64("mov x20, x24");
loc_00ba71f4:
    /* 0x00ba71f4: stur     x20, [x29, #-0xd8] */ ARM64("stur x20, [x29, #-0xd8]");
loc_00ba71f8:
    /* 0x00ba71f8: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba71fc: bl       #0xbe73d8 */ CALL_DIRECT(sub_00be73d8);
    /* 0x00ba7200: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00ba7204: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00ba7208: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00ba720c: b.ne     #0xba6600 */ if (COND_NE) goto loc_00ba6600;
loc_00ba7210:
    /* 0x00ba7210: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba7214: cbz      x8, #0xba7220 */ if (x8 == 0) goto loc_00ba7220;
    /* 0x00ba7218: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00ba721c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba7220:
    /* 0x00ba7220: ldr      x0, [sp, #0x128] */ ARM64("ldr x0, [sp, #0x128]");
    /* 0x00ba7224: bl       #0xba95ec */ CALL_DIRECT(sub_00ba95ec);
    /* 0x00ba7228: add      sp, sp, #0x440 */ ARM64("add sp, sp, #0x440");
    /* 0x00ba722c: ldp      x29, x30, [sp, #0x60] */ ARM64("ldp x29, x30, [sp, #0x60]");
    /* 0x00ba7230: ldp      x20, x19, [sp, #0x50] */ ARM64("ldp x20, x19, [sp, #0x50]");
    /* 0x00ba7234: ldp      x22, x21, [sp, #0x40] */ ARM64("ldp x22, x21, [sp, #0x40]");
    /* 0x00ba7238: ldp      x24, x23, [sp, #0x30] */ ARM64("ldp x24, x23, [sp, #0x30]");
    /* 0x00ba723c: ldp      x26, x25, [sp, #0x20] */ ARM64("ldp x26, x25, [sp, #0x20]");
    /* 0x00ba7240: ldp      x28, x27, [sp, #0x10] */ ARM64("ldp x28, x27, [sp, #0x10]");
    /* 0x00ba7244: ldp      d9, d8, [sp], #0x70 */ ARM64("ldp d9, d8, [sp], #0x70");
    /* 0x00ba7248: ret       */ return;
loc_00ba724c:
    /* 0x00ba724c: bl       #0xc769bc */ CALL_DIRECT(sub_00c769bc);
loc_00ba7250:
    /* 0x00ba7250: mov      x24, x22 */ ARM64("mov x24, x22");
    /* 0x00ba7254: mov      w0, #8 */ ARM64("mov w0, #8");
loc_00ba7258:
    /* 0x00ba7258: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba725c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7260: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba7264: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba7268: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba726c:
    /* 0x00ba726c: mov      x8, x11 */ ARM64("mov x8, x11");
loc_00ba7270:
    /* 0x00ba7270: mov      x0, x9 */ ARM64("mov x0, x9");
    /* 0x00ba7274: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00ba7278: mov      x2, x8 */ ARM64("mov x2, x8");
    /* 0x00ba727c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba7280: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7284:
    /* 0x00ba7284: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00ba7288: add      x0, x0, #0xb78 */ ARM64("add x0, x0, #0xb78");
    /* 0x00ba728c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7290: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7294:
    /* 0x00ba7294: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7298: add      x8, x8, #0x7a0 */ ARM64("add x8, x8, #0x7a0");
    /* 0x00ba729c: b        #0xba7304 */ goto loc_00ba7304;
loc_00ba72a0:
    /* 0x00ba72a0: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba72a4: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba72a8: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba72ac: add      x2, x2, #0x518 */ ARM64("add x2, x2, #0x518");
    /* 0x00ba72b0: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba72b4: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba72b8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba72bc:
    /* 0x00ba72bc: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba72c0: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba72c4: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba72c8: add      x2, x2, #0x530 */ ARM64("add x2, x2, #0x530");
    /* 0x00ba72cc: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba72d0: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba72d4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba72d8:
    /* 0x00ba72d8: str      xzr, [sp, #0x90] */ ARM64("str xzr, [sp, #0x90]");
loc_00ba72dc:
    /* 0x00ba72dc: ldr      x0, [sp, #0x90] */ ARM64("ldr x0, [sp, #0x90]");
    /* 0x00ba72e0: ldr      x1, [sp, #0x70] */ ARM64("ldr x1, [sp, #0x70]");
    /* 0x00ba72e4: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba72e8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba72ec:
    /* 0x00ba72ec: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba72f0: mov      w1, #8 */ ARM64("mov w1, #8");
    /* 0x00ba72f4: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba72f8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba72fc:
    /* 0x00ba72fc: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7300: add      x8, x8, #0x7b8 */ ARM64("add x8, x8, #0x7b8");
loc_00ba7304:
    /* 0x00ba7304: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
loc_00ba7308:
    /* 0x00ba7308: ldr      x0, [sp, #0x80] */ ARM64("ldr x0, [sp, #0x80]");
    /* 0x00ba730c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7310: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7314:
    /* 0x00ba7314: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7318: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00ba731c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7320: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba7324: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba7328: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba732c:
    /* 0x00ba732c: add      x8, sp, #0x390 */ ARM64("add x8, sp, #0x390");
    /* 0x00ba7330: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba7334: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00ba7338: mov      x1, x20 */ ARM64("mov x1, x20");
    /* 0x00ba733c: bl       #0xc6fa44 */ CALL_DIRECT(sub_00c6fa44);
    /* 0x00ba7340: b        #0xba220c */ goto loc_00ba220c;
loc_00ba7344:
    /* 0x00ba7344: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7348: add      x0, x0, #0x410 */ ARM64("add x0, x0, #0x410");
loc_00ba734c:
    /* 0x00ba734c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7350: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7354: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7358:
    /* 0x00ba7358: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba735c: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba7360: b        #0xba2834 */ goto loc_00ba2834;
loc_00ba7364:
    /* 0x00ba7364: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba7368: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba736c: b        #0xba2ee0 */ goto loc_00ba2ee0;
loc_00ba7370:
    /* 0x00ba7370: mov      x26, x25 */ ARM64("mov x26, x25");
    /* 0x00ba7374: add      x20, sp, #0x130 */ ARM64("add x20, sp, #0x130");
    /* 0x00ba7378: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba737c: add      x2, x20, #0x20 */ ARM64("add x2, x20, #0x20");
    /* 0x00ba7380: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba7384: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00ba7388: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00ba738c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7390: mov      x23, x24 */ ARM64("mov x23, x24");
    /* 0x00ba7394: b        #0xba7454 */ goto loc_00ba7454;
loc_00ba7398:
    /* 0x00ba7398: and      x14, x25, x10 */ ARM64("and x14, x25, x10");
    /* 0x00ba739c: ldr      d1, [x8, x14] */ ARM64("ldr d1, [x8, x14]");
    /* 0x00ba73a0: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00ba73a4: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00ba73a8: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00ba73ac: b.eq     #0xba73dc */ if (COND_EQ) goto loc_00ba73dc;
loc_00ba73b0:
    /* 0x00ba73b0: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00ba73b4: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00ba73b8: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00ba73bc: and      x16, x16, x10 */ ARM64("and x16, x16, x10");
    /* 0x00ba73c0: sub      x17, x8, x16, lsl #4 */ ARM64("sub x17, x8, x16, lsl #4");
    /* 0x00ba73c4: ldur     w17, [x17, #-0x10] */ ARM64("ldur w17, [x17, #-0x10]");
    /* 0x00ba73c8: cmp      w22, w17 */ ARM64("cmp w22, w17");
    /* 0x00ba73cc: b.eq     #0xba7434 */ if (COND_EQ) goto loc_00ba7434;
    /* 0x00ba73d0: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00ba73d4: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00ba73d8: b.ne     #0xba73b0 */ if (COND_NE) goto loc_00ba73b0;
loc_00ba73dc:
    /* 0x00ba73dc: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00ba73e0: b.eq     #0xba7400 */ if (COND_EQ) goto loc_00ba7400;
    /* 0x00ba73e4: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00ba73e8: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00ba73ec: cbz      x11, #0xba741c */ if (x11 == 0) goto loc_00ba741c;
    /* 0x00ba73f0: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba73f4: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba73f8: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00ba73fc: and      x11, x11, x10 */ ARM64("and x11, x11, x10");
loc_00ba7400:
    /* 0x00ba7400: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00ba7404: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00ba7408: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00ba740c: fmov     w13, s1 */ ARM64("fmov w13, s1");
    /* 0x00ba7410: tbnz     w13, #0, #0xba748c */ if (((w13 >> #0) & 1) != 0) goto loc_00ba748c;
    /* 0x00ba7414: mov      w13, #1 */ ARM64("mov w13, #1");
    /* 0x00ba7418: b        #0xba7420 */ goto loc_00ba7420;
loc_00ba741c:
    /* 0x00ba741c: mov      x13, #0 */ ARM64("mov x13, #0");
loc_00ba7420:
    /* 0x00ba7420: add      x12, x12, #8 */ ARM64("add x12, x12, #8");
    /* 0x00ba7424: add      x25, x12, x14 */ ARM64("add x25, x12, x14");
    /* 0x00ba7428: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba742c: mov      x23, x24 */ ARM64("mov x23, x24");
    /* 0x00ba7430: b        #0xba7398 */ goto loc_00ba7398;
loc_00ba7434:
    /* 0x00ba7434: mov      x25, x26 */ ARM64("mov x25, x26");
    /* 0x00ba7438: neg      x9, x16 */ ARM64("neg x9, x16");
    /* 0x00ba743c: mov      w22, #0 */ ARM64("mov w22, #0");
    /* 0x00ba7440: add      x8, x8, x9, lsl #4 */ ARM64("add x8, x8, x9, lsl #4");
    /* 0x00ba7444: stur     x21, [x8, #-8] */ ARM64("stur x21, [x8, #-8]");
    /* 0x00ba7448: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00ba744c: cmp      x21, x23 */ ARM64("cmp x21, x23");
    /* 0x00ba7450: b.eq     #0xba2f08 */ if (COND_EQ) goto loc_00ba2f08;
loc_00ba7454:
    /* 0x00ba7454: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba7458: ldr      w22, [x8, x21, lsl #2] */ ARM64("ldr w22, [x8, x21, lsl #2]");
    /* 0x00ba745c: ldp      x0, x1, [sp, #0x150] */ ARM64("ldp x0, x1, [sp, #0x150]");
    /* 0x00ba7460: mov      x2, x22 */ ARM64("mov x2, x22");
    /* 0x00ba7464: bl       #0xbd9d64 */ CALL_DIRECT(sub_00bd9d64);
    /* 0x00ba7468: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00ba746c: ldr      x8, [sp, #0x140] */ ARM64("ldr x8, [sp, #0x140]");
    /* 0x00ba7470: cbz      x8, #0xba74f4 */ if (x8 == 0) goto loc_00ba74f4;
loc_00ba7474:
    /* 0x00ba7474: mov      x13, #0 */ ARM64("mov x13, #0");
    /* 0x00ba7478: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00ba747c: ldp      x8, x10, [sp, #0x130] */ ARM64("ldp x8, x10, [sp, #0x130]");
    /* 0x00ba7480: lsr      x9, x25, #0x39 */ ARM64("lsr x9, x25, #0x39");
    /* 0x00ba7484: dup      v0.8b, w9 */ ARM64("dup v0.8b, w9");
    /* 0x00ba7488: b        #0xba7398 */ goto loc_00ba7398;
loc_00ba748c:
    /* 0x00ba748c: ldrsb    w12, [x8, x11] */ ARM64("ldrsb w12, [x8, x11]");
    /* 0x00ba7490: tbz      w12, #0x1f, #0xba7508 */ if (((w12 >> #0x1f) & 1) == 0) goto loc_00ba7508;
loc_00ba7494:
    /* 0x00ba7494: and      x12, x12, #1 */ ARM64("and x12, x12, #1");
    /* 0x00ba7498: sub      x13, x11, #8 */ ARM64("sub x13, x11, #8");
    /* 0x00ba749c: strb     w9, [x8, x11] */ ARM64("strb w9, [x8, x11]");
    /* 0x00ba74a0: and      x10, x10, x13 */ ARM64("and x10, x10, x13");
    /* 0x00ba74a4: add      x10, x8, x10 */ ARM64("add x10, x8, x10");
    /* 0x00ba74a8: strb     w9, [x10, #8] */ ARM64("strb w9, [x10, #8]");
    /* 0x00ba74ac: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00ba74b0: mov      v0.d[0], x12 */ ARM64("mov v0.d[0], x12");
    /* 0x00ba74b4: ldr      q1, [sp, #0x140] */ ARM64("ldr q1, [sp, #0x140]");
    /* 0x00ba74b8: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00ba74bc: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba74c0: neg      x9, x11 */ ARM64("neg x9, x11");
    /* 0x00ba74c4: sub      x10, x8, x11, lsl #4 */ ARM64("sub x10, x8, x11, lsl #4");
    /* 0x00ba74c8: stur     w22, [x10, #-0x10] */ ARM64("stur w22, [x10, #-0x10]");
    /* 0x00ba74cc: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba74d0: mov      x23, x24 */ ARM64("mov x23, x24");
    /* 0x00ba74d4: mov      x25, x26 */ ARM64("mov x25, x26");
    /* 0x00ba74d8: mov      w22, #0 */ ARM64("mov w22, #0");
    /* 0x00ba74dc: add      x8, x8, x9, lsl #4 */ ARM64("add x8, x8, x9, lsl #4");
    /* 0x00ba74e0: stur     x21, [x8, #-8] */ ARM64("stur x21, [x8, #-8]");
    /* 0x00ba74e4: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00ba74e8: cmp      x21, x24 */ ARM64("cmp x21, x24");
    /* 0x00ba74ec: b.ne     #0xba7454 */ if (COND_NE) goto loc_00ba7454;
    /* 0x00ba74f0: b        #0xba2f08 */ goto loc_00ba2f08;
loc_00ba74f4:
    /* 0x00ba74f4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba74f8: add      x2, x20, #0x20 */ ARM64("add x2, x20, #0x20");
    /* 0x00ba74fc: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba7500: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00ba7504: b        #0xba7474 */ goto loc_00ba7474;
loc_00ba7508:
    /* 0x00ba7508: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00ba750c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00ba7510: fmov     x11, d0 */ ARM64("fmov x11, d0");
    /* 0x00ba7514: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00ba7518: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00ba751c: lsr      x11, x11, #3 */ ARM64("lsr x11, x11, #3");
    /* 0x00ba7520: ldrb     w12, [x8, x11] */ ARM64("ldrb w12, [x8, x11]");
    /* 0x00ba7524: b        #0xba7494 */ goto loc_00ba7494;
loc_00ba7528:
    /* 0x00ba7528: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00ba752c: add      x0, x0, #0xb78 */ ARM64("add x0, x0, #0xb78");
    /* 0x00ba7530: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7534: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7538:
    /* 0x00ba7538: adrp     x0, #0xefa000 */ ARM64("adrp x0, #0xefa000");
    /* 0x00ba753c: add      x0, x0, #0x348 */ ARM64("add x0, x0, #0x348");
    /* 0x00ba7540: b        #0xba2188 */ goto loc_00ba2188;
loc_00ba7544:
    /* 0x00ba7544: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7548: add      x8, x8, #0x500 */ ARM64("add x8, x8, #0x500");
    /* 0x00ba754c: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
loc_00ba7550:
    /* 0x00ba7550: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00ba7554: add      x0, x0, #0xdc6 */ ARM64("add x0, x0, #0xdc6");
    /* 0x00ba7558: mov      w1, #0x16 */ ARM64("mov w1, #0x16");
    /* 0x00ba755c: ldr      x2, [sp, #0x80] */ ARM64("ldr x2, [sp, #0x80]");
    /* 0x00ba7560: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba7564: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7568:
    /* 0x00ba7568: adrp     x0, #0xe0a000 */ ARM64("adrp x0, #0xe0a000");
    /* 0x00ba756c: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00ba7570: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00ba7574: add      x2, x2, #0x928 */ ARM64("add x2, x2, #0x928");
    /* 0x00ba7578: mov      w1, #0x9e */ ARM64("mov w1, #0x9e");
    /* 0x00ba757c: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00ba7580: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7584:
    /* 0x00ba7584: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7588: add      x0, x0, #0xa88 */ ARM64("add x0, x0, #0xa88");
    /* 0x00ba758c: bl       #0xc73cd4 */ CALL_DIRECT(sub_00c73cd4);
    /* 0x00ba7590: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7594:
    /* 0x00ba7594: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba7598: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba759c: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba75a0: b        #0xba36b8 */ goto loc_00ba36b8;
loc_00ba75a4:
    /* 0x00ba75a4: sub      x8, x20, x25 */ ARM64("sub x8, x20, x25");
    /* 0x00ba75a8: lsr      x1, x8, #3 */ ARM64("lsr x1, x8, #3");
    /* 0x00ba75ac: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba75b0: add      x8, sp, #0x130 */ ARM64("add x8, sp, #0x130");
    /* 0x00ba75b4: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00ba75b8: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00ba75bc: b        #0xba36e0 */ goto loc_00ba36e0;
loc_00ba75c0:
    /* 0x00ba75c0: add      x0, x28, #0x1c0 */ ARM64("add x0, x28, #0x1c0");
    /* 0x00ba75c4: add      x2, x28, #0x1e0 */ ARM64("add x2, x28, #0x1e0");
    /* 0x00ba75c8: bl       #0xc6ec00 */ CALL_DIRECT(sub_00c6ec00);
    /* 0x00ba75cc: b        #0xba4010 */ goto loc_00ba4010;
loc_00ba75d0:
    /* 0x00ba75d0: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba75d4: add      x0, x0, #0x428 */ ARM64("add x0, x0, #0x428");
    /* 0x00ba75d8: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba75dc: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba75e0:
    /* 0x00ba75e0: mov      x9, x3 */ ARM64("mov x9, x3");
    /* 0x00ba75e4: b        #0xba7270 */ goto loc_00ba7270;
loc_00ba75e8:
    /* 0x00ba75e8: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba75ec: add      x0, x0, #0xa58 */ ARM64("add x0, x0, #0xa58");
    /* 0x00ba75f0: bl       #0xc73cd4 */ CALL_DIRECT(sub_00c73cd4);
    /* 0x00ba75f4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba75f8:
    /* 0x00ba75f8: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba75fc: add      x0, x0, #0xa70 */ ARM64("add x0, x0, #0xa70");
    /* 0x00ba7600: bl       #0xc73cd4 */ CALL_DIRECT(sub_00c73cd4);
    /* 0x00ba7604: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7608:
    /* 0x00ba7608: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00ba760c: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00ba7610: mov      x0, x1 */ ARM64("mov x0, x1");
    /* 0x00ba7614: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00ba7618: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba761c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7620:
    /* 0x00ba7620: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7624: add      x0, x0, #0x770 */ ARM64("add x0, x0, #0x770");
    /* 0x00ba7628: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba762c: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba7630: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7634: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7638:
    /* 0x00ba7638: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba763c: add      x0, x0, #0x5d8 */ ARM64("add x0, x0, #0x5d8");
    /* 0x00ba7640: bl       #0xc73d04 */ CALL_DIRECT(sub_00c73d04);
    /* 0x00ba7644: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7648:
    /* 0x00ba7648: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba764c: add      x0, x0, #0x5f0 */ ARM64("add x0, x0, #0x5f0");
    /* 0x00ba7650: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7654: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7658:
    /* 0x00ba7658: mov      x9, x3 */ ARM64("mov x9, x3");
    /* 0x00ba765c: mov      x8, x13 */ ARM64("mov x8, x13");
    /* 0x00ba7660: b        #0xba7270 */ goto loc_00ba7270;
loc_00ba7664:
    /* 0x00ba7664: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7668: add      x8, x8, #0x5c0 */ ARM64("add x8, x8, #0x5c0");
    /* 0x00ba766c: str      x8, [sp, #0x68] */ ARM64("str x8, [sp, #0x68]");
loc_00ba7670:
    /* 0x00ba7670: ldr      x0, [sp, #0x68] */ ARM64("ldr x0, [sp, #0x68]");
    /* 0x00ba7674: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7678: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba767c:
    /* 0x00ba767c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7680: mov      w1, #0x18 */ ARM64("mov w1, #0x18");
    /* 0x00ba7684: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba7688: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba768c:
    /* 0x00ba768c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7690: mov      w1, #0x40 */ ARM64("mov w1, #0x40");
    /* 0x00ba7694: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba7698: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba769c:
    /* 0x00ba769c: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00ba76a0: mov      w1, #0x10 */ ARM64("mov w1, #0x10");
    /* 0x00ba76a4: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba76a8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba76ac:
    /* 0x00ba76ac: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba76b0: add      x0, x0, #0x9f8 */ ARM64("add x0, x0, #0x9f8");
    /* 0x00ba76b4: b        #0xba734c */ goto loc_00ba734c;
loc_00ba76b8:
    /* 0x00ba76b8: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba76bc: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba76c0: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba76c4: b        #0xba5310 */ goto loc_00ba5310;
loc_00ba76c8:
    /* 0x00ba76c8: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba76cc: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba76d0: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00ba76d4: b        #0xba5340 */ goto loc_00ba5340;
loc_00ba76d8:
    /* 0x00ba76d8: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba76dc: add      x0, x0, #0x728 */ ARM64("add x0, x0, #0x728");
    /* 0x00ba76e0: bl       #0xc73cd4 */ CALL_DIRECT(sub_00c73cd4);
    /* 0x00ba76e4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba76e8:
    /* 0x00ba76e8: mov      x21, x8 */ ARM64("mov x21, x8");
    /* 0x00ba76ec: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00ba76f0: add      x8, x8, #0x8c8 */ ARM64("add x8, x8, #0x8c8");
    /* 0x00ba76f4: str      x8, [sp, #0x100] */ ARM64("str x8, [sp, #0x100]");
loc_00ba76f8:
    /* 0x00ba76f8: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00ba76fc: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00ba7700: ldr      x2, [sp, #0x100] */ ARM64("ldr x2, [sp, #0x100]");
    /* 0x00ba7704: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba7708: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba770c:
    /* 0x00ba770c: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7710: add      x0, x0, #0x6f8 */ ARM64("add x0, x0, #0x6f8");
    /* 0x00ba7714: bl       #0xc73cd4 */ CALL_DIRECT(sub_00c73cd4);
    /* 0x00ba7718: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba771c:
    /* 0x00ba771c: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00ba7720: add      x0, x0, #0xb78 */ ARM64("add x0, x0, #0xb78");
    /* 0x00ba7724: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7728: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba772c:
    /* 0x00ba772c: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7730: add      x0, x0, #0x740 */ ARM64("add x0, x0, #0x740");
    /* 0x00ba7734: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba7738: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba773c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7740:
    /* 0x00ba7740: mov      x0, x15 */ ARM64("mov x0, x15");
    /* 0x00ba7744: mov      x27, x26 */ ARM64("mov x27, x26");
    /* 0x00ba7748: b        #0xba7754 */ goto loc_00ba7754;
loc_00ba774c:
    /* 0x00ba774c: mov      x0, x15 */ ARM64("mov x0, x15");
    /* 0x00ba7750: mov      x2, x10 */ ARM64("mov x2, x10");
loc_00ba7754:
    /* 0x00ba7754: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00ba7758: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba775c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7760:
    /* 0x00ba7760: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00ba7764: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00ba7768: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba776c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7770:
    /* 0x00ba7770: adrp     x2, #0xefa000 */ ARM64("adrp x2, #0xefa000");
    /* 0x00ba7774: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00ba7778: mov      x0, x1 */ ARM64("mov x0, x1");
    /* 0x00ba777c: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00ba7780: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba7784: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7788:
    /* 0x00ba7788: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba778c: add      x0, x0, #0x680 */ ARM64("add x0, x0, #0x680");
    /* 0x00ba7790: b        #0xba734c */ goto loc_00ba734c;
loc_00ba7794:
    /* 0x00ba7794: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7798: add      x0, x0, #0x698 */ ARM64("add x0, x0, #0x698");
    /* 0x00ba779c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba77a0: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba77a4:
    /* 0x00ba77a4: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba77a8: add      x0, x0, #0x3e0 */ ARM64("add x0, x0, #0x3e0");
    /* 0x00ba77ac: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba77b0: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba77b4:
    /* 0x00ba77b4: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba77b8: add      x8, x8, #0x458 */ ARM64("add x8, x8, #0x458");
    /* 0x00ba77bc: str      x8, [sp, #0x40] */ ARM64("str x8, [sp, #0x40]");
loc_00ba77c0:
    /* 0x00ba77c0: ldr      x0, [sp, #0x40] */ ARM64("ldr x0, [sp, #0x40]");
    /* 0x00ba77c4: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba77c8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba77cc:
    /* 0x00ba77cc: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba77d0: add      x0, x0, #0x390 */ ARM64("add x0, x0, #0x390");
    /* 0x00ba77d4: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba77d8: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba77dc:
    /* 0x00ba77dc: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00ba77e0: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00ba77e4: mov      x0, x9 */ ARM64("mov x0, x9");
    /* 0x00ba77e8: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba77ec: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba77f0:
    /* 0x00ba77f0: str      x22, [sp, #0x30] */ ARM64("str x22, [sp, #0x30]");
    /* 0x00ba77f4: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba77f8: b        #0xba0ae0 */ goto loc_00ba0ae0;
loc_00ba77fc:
    /* 0x00ba77fc: adrp     x8, #0xefb000 */ ARM64("adrp x8, #0xefb000");
    /* 0x00ba7800: add      x8, x8, #0xb90 */ ARM64("add x8, x8, #0xb90");
    /* 0x00ba7804: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
loc_00ba7808:
    /* 0x00ba7808: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00ba780c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7810: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7814:
    /* 0x00ba7814: adrp     x8, #0xe07000 */ ARM64("adrp x8, #0xe07000");
    /* 0x00ba7818: add      x9, x8, #0x478 */ ARM64("add x9, x8, #0x478");
    /* 0x00ba781c: mov      w8, #0x5b */ ARM64("mov w8, #0x5b");
    /* 0x00ba7820: stp      x8, x9, [sp, #0x28] */ ARM64("stp x8, x9, [sp, #0x28]");
    /* 0x00ba7824: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7828: add      x8, x8, #0x470 */ ARM64("add x8, x8, #0x470");
    /* 0x00ba782c: str      x8, [sp, #0x38] */ ARM64("str x8, [sp, #0x38]");
loc_00ba7830:
    /* 0x00ba7830: ldp      x1, x0, [sp, #0x28] */ ARM64("ldp x1, x0, [sp, #0x28]");
    /* 0x00ba7834: ldr      x2, [sp, #0x38] */ ARM64("ldr x2, [sp, #0x38]");
    /* 0x00ba7838: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00ba783c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7840:
    /* 0x00ba7840: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7844: mov      w1, #0x18 */ ARM64("mov w1, #0x18");
    /* 0x00ba7848: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba784c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7850:
    /* 0x00ba7850: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7854: mov      w1, #0x40 */ ARM64("mov w1, #0x40");
    /* 0x00ba7858: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba785c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7860:
    /* 0x00ba7860: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7864: str      x22, [sp, #0x28] */ ARM64("str x22, [sp, #0x28]");
loc_00ba7868:
    /* 0x00ba7868: ldr      x1, [sp, #0x28] */ ARM64("ldr x1, [sp, #0x28]");
    /* 0x00ba786c: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba7870: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7874:
    /* 0x00ba7874: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00ba7878: sub      x0, x23, #1 */ ARM64("sub x0, x23, #1");
    /* 0x00ba787c: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00ba7880: add      x2, x2, #0x8f8 */ ARM64("add x2, x2, #0x8f8");
    /* 0x00ba7884: mov      w25, #8 */ ARM64("mov w25, #8");
    /* 0x00ba7888: mov      x24, #0 */ ARM64("mov x24, #0");
    /* 0x00ba788c: b        #0xba7754 */ goto loc_00ba7754;
loc_00ba7890:
    /* 0x00ba7890: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7894: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00ba7898: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba789c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba78a0:
    /* 0x00ba78a0: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00ba78a4: add      x2, x2, #0x8f8 */ ARM64("add x2, x2, #0x8f8");
    /* 0x00ba78a8: b        #0xba7754 */ goto loc_00ba7754;
loc_00ba78ac:
    /* 0x00ba78ac: str      xzr, [sp, #0x80] */ ARM64("str xzr, [sp, #0x80]");
loc_00ba78b0:
    /* 0x00ba78b0: ldr      x0, [sp, #0x80] */ ARM64("ldr x0, [sp, #0x80]");
    /* 0x00ba78b4: ldr      x1, [sp, #0x70] */ ARM64("ldr x1, [sp, #0x70]");
    /* 0x00ba78b8: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba78bc: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba78c0:
    /* 0x00ba78c0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba78c4: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba78c8: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba78cc: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba78d0:
    /* 0x00ba78d0: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba78d4: add      x8, x8, #0xa28 */ ARM64("add x8, x8, #0xa28");
    /* 0x00ba78d8: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
loc_00ba78dc:
    /* 0x00ba78dc: ldr      x0, [sp, #0x80] */ ARM64("ldr x0, [sp, #0x80]");
    /* 0x00ba78e0: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba78e4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba78e8:
    /* 0x00ba78e8: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba78ec: mov      w1, #0x18 */ ARM64("mov w1, #0x18");
    /* 0x00ba78f0: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba78f4: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba78f8:
    /* 0x00ba78f8: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba78fc: mov      w1, #0x40 */ ARM64("mov w1, #0x40");
    /* 0x00ba7900: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba7904: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7908:
    /* 0x00ba7908: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba790c: add      x8, x8, #0x5a8 */ ARM64("add x8, x8, #0x5a8");
    /* 0x00ba7910: b        #0xba796c */ goto loc_00ba796c;
loc_00ba7914:
    /* 0x00ba7914: adrp     x0, #0xefb000 */ ARM64("adrp x0, #0xefb000");
    /* 0x00ba7918: add      x0, x0, #0xb78 */ ARM64("add x0, x0, #0xb78");
    /* 0x00ba791c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7920: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7924:
    /* 0x00ba7924: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7928: add      x8, x8, #0x548 */ ARM64("add x8, x8, #0x548");
    /* 0x00ba792c: b        #0xba796c */ goto loc_00ba796c;
loc_00ba7930:
    /* 0x00ba7930: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7934: str      x27, [sp] */ ARM64("str x27, [sp]");
loc_00ba7938:
    /* 0x00ba7938: ldr      x1, [sp] */ ARM64("ldr x1, [sp]");
    /* 0x00ba793c: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba7940: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7944:
    /* 0x00ba7944: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba7948: add      x2, x2, #0xa40 */ ARM64("add x2, x2, #0xa40");
    /* 0x00ba794c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba7950: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7954:
    /* 0x00ba7954: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7958: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00ba795c: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00ba7960: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7964:
    /* 0x00ba7964: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7968: add      x8, x8, #0x560 */ ARM64("add x8, x8, #0x560");
loc_00ba796c:
    /* 0x00ba796c: str      x8, [sp, #0x50] */ ARM64("str x8, [sp, #0x50]");
loc_00ba7970:
    /* 0x00ba7970: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba7974: ldr      x2, [sp, #0x50] */ ARM64("ldr x2, [sp, #0x50]");
    /* 0x00ba7978: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba797c: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7980:
    /* 0x00ba7980: str      x21, [sp, #0x20] */ ARM64("str x21, [sp, #0x20]");
    /* 0x00ba7984: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba7988: b        #0xba5274 */ goto loc_00ba5274;
loc_00ba798c:
    /* 0x00ba798c: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00ba7990: add      x0, x0, #0x6b0 */ ARM64("add x0, x0, #0x6b0");
    /* 0x00ba7994: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00ba7998: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba799c:
    /* 0x00ba799c: mov      x24, x1 */ ARM64("mov x24, x1");
    /* 0x00ba79a0: ldur     q0, [x26, #0x18] */ ARM64("ldur q0, [x26, #0x18]");
    /* 0x00ba79a4: ldur     q1, [x26, #0x28] */ ARM64("ldur q1, [x26, #0x28]");
    /* 0x00ba79a8: ldur     q2, [x26, #0x38] */ ARM64("ldur q2, [x26, #0x38]");
    /* 0x00ba79ac: stp      q1, q2, [sp, #0x150] */ ARM64("stp q1, q2, [sp, #0x150]");
    /* 0x00ba79b0: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00ba79b4: stp      x8, x23, [sp, #0x130] */ ARM64("stp x8, x23, [sp, #0x130]");
    /* 0x00ba79b8: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00ba79bc: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00ba79c0: adrp     x3, #0xef8000 */ ARM64("adrp x3, #0xef8000");
    /* 0x00ba79c4: add      x3, x3, #0x3c0 */ ARM64("add x3, x3, #0x3c0");
    /* 0x00ba79c8: adrp     x4, #0xef8000 */ ARM64("adrp x4, #0xef8000");
    /* 0x00ba79cc: add      x4, x4, #0x6c8 */ ARM64("add x4, x4, #0x6c8");
    /* 0x00ba79d0: add      x2, sp, #0x130 */ ARM64("add x2, sp, #0x130");
    /* 0x00ba79d4: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00ba79d8: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
    /* 0x00ba79dc: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba79e0:
    /* 0x00ba79e0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00ba79e4: mov      w1, #0x40 */ ARM64("mov w1, #0x40");
    /* 0x00ba79e8: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00ba79ec: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba79f0:
    /* 0x00ba79f0: ldp      x9, x8, [sp, #0x138] */ ARM64("ldp x9, x8, [sp, #0x138]");
    /* 0x00ba79f4: str      x9, [sp, #0x80] */ ARM64("str x9, [sp, #0x80]");
    /* 0x00ba79f8: str      x8, [sp, #0x70] */ ARM64("str x8, [sp, #0x70]");
    /* 0x00ba79fc: b        #0xba78b0 */ goto loc_00ba78b0;
loc_00ba7a00:
    /* 0x00ba7a00: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00ba7a04: add      x2, x2, #0x4d0 */ ARM64("add x2, x2, #0x4d0");
    /* 0x00ba7a08: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00ba7a0c: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00ba7a10: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00ba7a14: b        #0xba7a2c */ goto loc_00ba7a2c;
loc_00ba7a18:
    /* 0x00ba7a18: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00ba7a1c: add      x8, x8, #0x4b8 */ ARM64("add x8, x8, #0x4b8");
    /* 0x00ba7a20: str      x8, [sp, #0x48] */ ARM64("str x8, [sp, #0x48]");
loc_00ba7a24:
    /* 0x00ba7a24: ldr      x0, [sp, #0x48] */ ARM64("ldr x0, [sp, #0x48]");
    /* 0x00ba7a28: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
loc_00ba7a2c:
    /* 0x00ba7a2c: brk      #1 */ ARM64("brk #1");
loc_00ba7a30:
    /* 0x00ba7a30: str      x22, [sp, #0x70] */ ARM64("str x22, [sp, #0x70]");
    /* 0x00ba7a34: b        #0xba72dc */ goto loc_00ba72dc;
    /* 0x00ba7a38: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7a3c: cbnz     x23, #0xba80f0 */ if (x23 != 0) goto loc_00ba80f0;
    /* 0x00ba7a40: b        #0xba80f8 */ goto loc_00ba80f8;
    /* 0x00ba7a44: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7a48: cbnz     x23, #0xba8570 */ if (x23 != 0) goto loc_00ba8570;
    /* 0x00ba7a4c: b        #0xba8578 */ goto loc_00ba8578;
    /* 0x00ba7a50: b        #0xba7a54 */ goto loc_00ba7a54;
loc_00ba7a54:
    /* 0x00ba7a54: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7a58: ldr      x9, [sp, #0x138] */ ARM64("ldr x9, [sp, #0x138]");
    /* 0x00ba7a5c: cbz      x9, #0xba7a8c */ if (x9 == 0) goto loc_00ba7a8c;
    /* 0x00ba7a60: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00ba7a64: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba7a68: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00ba7a6c: b.eq     #0xba7a8c */ if (COND_EQ) goto loc_00ba7a8c;
    /* 0x00ba7a70: ldr      x9, [sp, #0x130] */ ARM64("ldr x9, [sp, #0x130]");
    /* 0x00ba7a74: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba7a78: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00ba7a7c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7a80: b        #0xba7a8c */ goto loc_00ba7a8c;
    /* 0x00ba7a84: mov      x26, x25 */ ARM64("mov x26, x25");
    /* 0x00ba7a88: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7a8c:
    /* 0x00ba7a8c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba7a90: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00ba7a94: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7a98: mov      x25, x26 */ ARM64("mov x25, x26");
    /* 0x00ba7a9c: b        #0xba8858 */ goto loc_00ba8858;
    /* 0x00ba7aa0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7aa4: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7aa8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7aac: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba7ab0: bl       #0xb9986c */ CALL_DIRECT(sub_00b9986c);
    /* 0x00ba7ab4: b        #0xba8094 */ goto loc_00ba8094;
    /* 0x00ba7ab8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7abc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ac0: b        #0xba8508 */ goto loc_00ba8508;
    /* 0x00ba7ac4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ac8: b        #0xba84d8 */ goto loc_00ba84d8;
    /* 0x00ba7acc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ad0: b        #0xba84b8 */ goto loc_00ba84b8;
    /* 0x00ba7ad4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ad8: b        #0xba84a8 */ goto loc_00ba84a8;
    /* 0x00ba7adc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ae0: b        #0xba84a0 */ goto loc_00ba84a0;
    /* 0x00ba7ae4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ae8: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7aec: bl       #0xbab5f4 */ CALL_DIRECT(sub_00bab5f4);
    /* 0x00ba7af0: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00ba7af4: b        #0xba844c */ goto loc_00ba844c;
    /* 0x00ba7af8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7afc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b00: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00ba7b04: b        #0xba842c */ goto loc_00ba842c;
    /* 0x00ba7b08: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7b0c:
    /* 0x00ba7b0c: ldxr     x8, [x27] */ ARM64("ldxr x8, [x27]");
    /* 0x00ba7b10: sub      x9, x8, #1 */ ARM64("sub x9, x8, #1");
    /* 0x00ba7b14: stlxr    w10, x9, [x27] */ ARM64("stlxr w10, x9, [x27]");
    /* 0x00ba7b18: cbnz     w10, #0xba7b0c */ if (w10 != 0) goto loc_00ba7b0c;
    /* 0x00ba7b1c: b        #0xba8414 */ goto loc_00ba8414;
    /* 0x00ba7b20: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b24: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba7b28: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b2c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7b30: bl       #0xbd232c */ CALL_DIRECT(sub_00bd232c);
    /* 0x00ba7b34: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba7b38: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7b3c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b40: mov      w20, #0 */ ARM64("mov w20, #0");
    /* 0x00ba7b44: b        #0xba7ef0 */ goto loc_00ba7ef0;
    /* 0x00ba7b48: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b4c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7b50: bl       #0xbd232c */ CALL_DIRECT(sub_00bd232c);
    /* 0x00ba7b54: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00ba7b58: b        #0xba7ef0 */ goto loc_00ba7ef0;
    /* 0x00ba7b5c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7b60: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b64: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7b68: bl       #0xbab5f4 */ CALL_DIRECT(sub_00bab5f4);
    /* 0x00ba7b6c: b        #0xba84e8 */ goto loc_00ba84e8;
    /* 0x00ba7b70: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7b74: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b78: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7b7c: b        #0xba7ffc */ goto loc_00ba7ffc;
    /* 0x00ba7b80: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7b84: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7b88: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00ba7b8c: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00ba7b90: b        #0xba828c */ goto loc_00ba828c;
    /* 0x00ba7b94: b        #0xba7fcc */ goto loc_00ba7fcc;
    /* 0x00ba7b98: b        #0xba80e8 */ goto loc_00ba80e8;
    /* 0x00ba7b9c: b        #0xba7cf0 */ goto loc_00ba7cf0;
    /* 0x00ba7ba0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7ba4:
    /* 0x00ba7ba4: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba7ba8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba7bac: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00ba7bb0: cbnz     w9, #0xba7ba4 */ if (w9 != 0) goto loc_00ba7ba4;
    /* 0x00ba7bb4: b        #0xba7cd4 */ goto loc_00ba7cd4;
    /* 0x00ba7bb8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7bbc: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7bc0: bl       #0xb9ce00 */ CALL_DIRECT(sub_00b9ce00);
    /* 0x00ba7bc4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7bc8: bl       #0xb9ce70 */ CALL_DIRECT(sub_00b9ce70);
    /* 0x00ba7bcc: b        #0xba83a0 */ goto loc_00ba83a0;
    /* 0x00ba7bd0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7bd4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7bd8: add      x0, x22, #0x10 */ ARM64("add x0, x22, #0x10");
    /* 0x00ba7bdc: bl       #0xbaf7cc */ CALL_DIRECT(sub_00baf7cc);
    /* 0x00ba7be0: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7be4: bl       #0xb9986c */ CALL_DIRECT(sub_00b9986c);
    /* 0x00ba7be8: b        #0xba8094 */ goto loc_00ba8094;
    /* 0x00ba7bec: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7bf0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7bf4: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7bf8: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba7bfc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba7c00: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba7c04: b        #0xba85ec */ goto loc_00ba85ec;
    /* 0x00ba7c08: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7c0c: b        #0xba863c */ goto loc_00ba863c;
    /* 0x00ba7c10: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7c14: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7c18: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7c1c: bl       #0xb9ce00 */ CALL_DIRECT(sub_00b9ce00);
    /* 0x00ba7c20: b        #0xba83a0 */ goto loc_00ba83a0;
    /* 0x00ba7c24: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7c28: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7c2c: b        #0xba8624 */ goto loc_00ba8624;
    /* 0x00ba7c30: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7c34: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba7c38: add      x8, x21, x25 */ ARM64("add x8, x21, x25");
    /* 0x00ba7c3c: ccmn     x8, #0x11, #4, ne */ ARM64("ccmn x8, #0x11, #4, ne");
    /* 0x00ba7c40: b.eq     #0xba8348 */ if (COND_EQ) goto loc_00ba8348;
    /* 0x00ba7c44: sub      x8, x20, x21 */ ARM64("sub x8, x20, x21");
    /* 0x00ba7c48: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba7c4c: b        #0xba835c */ goto loc_00ba835c;
    /* 0x00ba7c50: b        #0xba87f0 */ goto loc_00ba87f0;
    /* 0x00ba7c54: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7c58:
    /* 0x00ba7c58: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba7c5c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba7c60: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba7c64: cbnz     w9, #0xba7c58 */ if (w9 != 0) goto loc_00ba7c58;
    /* 0x00ba7c68: b.ne     #0xba7c78 */ if (COND_NE) goto loc_00ba7c78;
    /* 0x00ba7c6c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba7c70: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba7c74: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba7c78:
    /* 0x00ba7c78: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7c7c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00ba7c80: b        #0xba8890 */ goto loc_00ba8890;
    /* 0x00ba7c84: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7c88: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7c8c: bl       #0xba9254 */ CALL_DIRECT(sub_00ba9254);
    /* 0x00ba7c90: mov      x8, x24 */ ARM64("mov x8, x24");
loc_00ba7c94:
    /* 0x00ba7c94: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00ba7c98: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00ba7c9c: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00ba7ca0: cbnz     w10, #0xba7c94 */ if (w10 != 0) goto loc_00ba7c94;
    /* 0x00ba7ca4: b.ne     #0xba8624 */ if (COND_NE) goto loc_00ba8624;
    /* 0x00ba7ca8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba7cac: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba7cb0: b        #0xba8620 */ goto loc_00ba8620;
    /* 0x00ba7cb4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7cb8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7cbc: b        #0xba8604 */ goto loc_00ba8604;
    /* 0x00ba7cc0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7cc4:
    /* 0x00ba7cc4: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba7cc8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba7ccc: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00ba7cd0: cbnz     w9, #0xba7cc4 */ if (w9 != 0) goto loc_00ba7cc4;
loc_00ba7cd4:
    /* 0x00ba7cd4: b.ne     #0xba8478 */ if (COND_NE) goto loc_00ba8478;
    /* 0x00ba7cd8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba7cdc: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba7ce0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba7ce4: b        #0xba8478 */ goto loc_00ba8478;
    /* 0x00ba7ce8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7cec: b        #0xba89cc */ goto loc_00ba89cc;
loc_00ba7cf0:
    /* 0x00ba7cf0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7cf4: b        #0xba862c */ goto loc_00ba862c;
    /* 0x00ba7cf8: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7cfc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d00: ldr      x8, [x23, #0x10] */ ARM64("ldr x8, [x23, #0x10]");
    /* 0x00ba7d04: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba7d08: str      x8, [x23, #0x10] */ ARM64("str x8, [x23, #0x10]");
    /* 0x00ba7d0c: b        #0xba866c */ goto loc_00ba866c;
    /* 0x00ba7d10: b        #0xba7de0 */ goto loc_00ba7de0;
    /* 0x00ba7d14: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d18: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba7d1c: mov      x1, x23 */ ARM64("mov x1, x23");
    /* 0x00ba7d20: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00ba7d24: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7d28: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d2c: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7d30: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d34: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7d38: bl       #0xbd232c */ CALL_DIRECT(sub_00bd232c);
    /* 0x00ba7d3c: b        #0xba8478 */ goto loc_00ba8478;
    /* 0x00ba7d40: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7d44: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d48: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7d4c: bl       #0xba997c */ CALL_DIRECT(sub_00ba997c);
    /* 0x00ba7d50: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7d54: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d58: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00ba7d5c: b        #0xba7da0 */ goto loc_00ba7da0;
    /* 0x00ba7d60: add      x20, sp, #0x130 */ ARM64("add x20, sp, #0x130");
    /* 0x00ba7d64: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d68: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00ba7d6c: b        #0xba7d84 */ goto loc_00ba7d84;
    /* 0x00ba7d70: add      x20, sp, #0x130 */ ARM64("add x20, sp, #0x130");
    /* 0x00ba7d74: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d78: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00ba7d7c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7d80: bl       #0xbd1b58 */ CALL_DIRECT(sub_00bd1b58);
loc_00ba7d84:
    /* 0x00ba7d84: add      x0, x20, #0x28 */ ARM64("add x0, x20, #0x28");
    /* 0x00ba7d88: bl       #0xbe6ea0 */ CALL_DIRECT(sub_00be6ea0);
    /* 0x00ba7d8c: b        #0xba7da0 */ goto loc_00ba7da0;
    /* 0x00ba7d90: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7d94: stur     x24, [x29, #-0xd8] */ ARM64("stur x24, [x29, #-0xd8]");
    /* 0x00ba7d98: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7d9c: bl       #0xbe6ea0 */ CALL_DIRECT(sub_00be6ea0);
loc_00ba7da0:
    /* 0x00ba7da0: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba7da4: bl       #0xbe73d8 */ CALL_DIRECT(sub_00be73d8);
    /* 0x00ba7da8: b        #0xba8508 */ goto loc_00ba8508;
    /* 0x00ba7dac: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7db0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7db4:
    /* 0x00ba7db4: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba7db8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba7dbc: stlxr    w9, x8, [x23] */ ARM64("stlxr w9, x8, [x23]");
    /* 0x00ba7dc0: cbnz     w9, #0xba7db4 */ if (w9 != 0) goto loc_00ba7db4;
    /* 0x00ba7dc4: b.ne     #0xba7e20 */ if (COND_NE) goto loc_00ba7e20;
    /* 0x00ba7dc8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba7dcc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7dd0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba7dd4: b        #0xba7e20 */ goto loc_00ba7e20;
    /* 0x00ba7dd8: b        #0xba8294 */ goto loc_00ba8294;
    /* 0x00ba7ddc: b        #0xba8294 */ goto loc_00ba8294;
loc_00ba7de0:
    /* 0x00ba7de0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7de4: b        #0xba8684 */ goto loc_00ba8684;
    /* 0x00ba7de8: b        #0xba88c8 */ goto loc_00ba88c8;
    /* 0x00ba7dec: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7df0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7df4: str      xzr, [sp, #0xd8] */ ARM64("str xzr, [sp, #0xd8]");
    /* 0x00ba7df8: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba7dfc: b        #0xba8718 */ goto loc_00ba8718;
    /* 0x00ba7e00: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e04: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7e08: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7e0c: b        #0xba81a0 */ goto loc_00ba81a0;
    /* 0x00ba7e10: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7e14: b        #0xba81d8 */ goto loc_00ba81d8;
    /* 0x00ba7e18: b        #0xba81ac */ goto loc_00ba81ac;
    /* 0x00ba7e1c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7e20:
    /* 0x00ba7e20: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00ba7e24: cbz      x8, #0xba85c8 */ if (x8 == 0) goto loc_00ba85c8;
    /* 0x00ba7e28: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00ba7e2c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7e30: b        #0xba85c8 */ goto loc_00ba85c8;
    /* 0x00ba7e34: b        #0xba88c8 */ goto loc_00ba88c8;
    /* 0x00ba7e38: b        #0xba88c8 */ goto loc_00ba88c8;
    /* 0x00ba7e3c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e40: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba7e44: bl       #0xba89e4 */ CALL_DIRECT(sub_00ba89e4);
    /* 0x00ba7e48: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba7e4c: b        #0xba81d8 */ goto loc_00ba81d8;
    /* 0x00ba7e50: b        #0xba7f9c */ goto loc_00ba7f9c;
    /* 0x00ba7e54: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7e58: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e5c: b        #0xba8578 */ goto loc_00ba8578;
    /* 0x00ba7e60: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e64: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7e68: bl       #0xbaa178 */ CALL_DIRECT(sub_00baa178);
    /* 0x00ba7e6c: b        #0xba7fa0 */ goto loc_00ba7fa0;
    /* 0x00ba7e70: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e74: ldr      x8, [x24, #0x10] */ ARM64("ldr x8, [x24, #0x10]");
    /* 0x00ba7e78: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba7e7c: str      x8, [x24, #0x10] */ ARM64("str x8, [x24, #0x10]");
    /* 0x00ba7e80: b        #0xba82d4 */ goto loc_00ba82d4;
    /* 0x00ba7e84: b        #0xba82d0 */ goto loc_00ba82d0;
    /* 0x00ba7e88: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e8c: b        #0xba82f0 */ goto loc_00ba82f0;
    /* 0x00ba7e90: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7e94: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7e98: str      x21, [sp, #0x138] */ ARM64("str x21, [sp, #0x138]");
    /* 0x00ba7e9c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7ea0: bl       #0xb8bec4 */ CALL_DIRECT(sub_00b8bec4);
    /* 0x00ba7ea4: b        #0xba83a0 */ goto loc_00ba83a0;
    /* 0x00ba7ea8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7eac: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7eb0: bl       #0xba8a90 */ CALL_DIRECT(sub_00ba8a90);
    /* 0x00ba7eb4: b        #0xba82c4 */ goto loc_00ba82c4;
    /* 0x00ba7eb8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7ebc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7ec0: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7ec4: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00ba7ec8: bl       #0xb9eff8 */ CALL_DIRECT(sub_00b9eff8);
    /* 0x00ba7ecc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7ed0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7ed4: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00ba7ed8: b        #0xba7ef0 */ goto loc_00ba7ef0;
    /* 0x00ba7edc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba7ee0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7ee4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7ee8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7eec: mov      w20, #1 */ ARM64("mov w20, #1");
loc_00ba7ef0:
    /* 0x00ba7ef0: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba7ef4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba7ef8: stlxr    w9, x8, [x24] */ ARM64("stlxr w9, x8, [x24]");
    /* 0x00ba7efc: cbnz     w9, #0xba7ef0 */ if (w9 != 0) goto loc_00ba7ef0;
    /* 0x00ba7f00: b.ne     #0xba7f10 */ if (COND_NE) goto loc_00ba7f10;
    /* 0x00ba7f04: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba7f08: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba7f0c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba7f10:
    /* 0x00ba7f10: tbnz     w20, #0, #0xba83b4 */ if (((w20 >> #0) & 1) != 0) goto loc_00ba83b4;
    /* 0x00ba7f14: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba7f18: b        #0xba8268 */ goto loc_00ba8268;
    /* 0x00ba7f1c: b        #0xba7f78 */ goto loc_00ba7f78;
    /* 0x00ba7f20: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f24: cbz      x20, #0xba85c8 */ if (x20 == 0) goto loc_00ba85c8;
    /* 0x00ba7f28: ldr      x0, [sp, #0x20] */ ARM64("ldr x0, [sp, #0x20]");
    /* 0x00ba7f2c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba7f30: b        #0xba85c8 */ goto loc_00ba85c8;
    /* 0x00ba7f34: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f38: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba7f3c: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00ba7f40: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7f44: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f48: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7f4c: bl       #0xba8a90 */ CALL_DIRECT(sub_00ba8a90);
    /* 0x00ba7f50: b        #0xba7f6c */ goto loc_00ba7f6c;
    /* 0x00ba7f54: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba7f58: b        #0xba8120 */ goto loc_00ba8120;
    /* 0x00ba7f5c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f60: b        #0xba84e8 */ goto loc_00ba84e8;
    /* 0x00ba7f64: b        #0xba839c */ goto loc_00ba839c;
    /* 0x00ba7f68: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7f6c:
    /* 0x00ba7f6c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7f70: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba7f74: b        #0xba8968 */ goto loc_00ba8968;
loc_00ba7f78:
    /* 0x00ba7f78: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f7c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7f80: b        #0xba828c */ goto loc_00ba828c;
    /* 0x00ba7f84: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f88: cbz      x27, #0xba8348 */ if (x27 == 0) goto loc_00ba8348;
    /* 0x00ba7f8c: b        #0xba8224 */ goto loc_00ba8224;
    /* 0x00ba7f90: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7f94: cbz      x23, #0xba8348 */ if (x23 == 0) goto loc_00ba8348;
    /* 0x00ba7f98: b        #0xba8214 */ goto loc_00ba8214;
loc_00ba7f9c:
    /* 0x00ba7f9c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba7fa0:
    /* 0x00ba7fa0: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba7fa4: bl       #0xbaa178 */ CALL_DIRECT(sub_00baa178);
    /* 0x00ba7fa8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7fac: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba7fb0: b        #0xba7fe0 */ goto loc_00ba7fe0;
    /* 0x00ba7fb4: b        #0xba7fe0 */ goto loc_00ba7fe0;
    /* 0x00ba7fb8: b        #0xba85d8 */ goto loc_00ba85d8;
    /* 0x00ba7fbc: b        #0xba85d8 */ goto loc_00ba85d8;
    /* 0x00ba7fc0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7fc4: cbz      x21, #0xba8348 */ if (x21 == 0) goto loc_00ba8348;
    /* 0x00ba7fc8: b        #0xba8214 */ goto loc_00ba8214;
loc_00ba7fcc:
    /* 0x00ba7fcc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7fd0: ldp      x0, x1, [sp, #0x130] */ ARM64("ldp x0, x1, [sp, #0x130]");
    /* 0x00ba7fd4: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
    /* 0x00ba7fd8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba7fdc: b        #0xba828c */ goto loc_00ba828c;
loc_00ba7fe0:
    /* 0x00ba7fe0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7fe4: b        #0xba8068 */ goto loc_00ba8068;
    /* 0x00ba7fe8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba7fec: stp      x28, x22, [sp, #0x148] */ ARM64("stp x28, x22, [sp, #0x148]");
    /* 0x00ba7ff0: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba7ff4: str      x23, [sp, #0x168] */ ARM64("str x23, [sp, #0x168]");
    /* 0x00ba7ff8: str      x20, [sp, #0x158] */ ARM64("str x20, [sp, #0x158]");
loc_00ba7ffc:
    /* 0x00ba7ffc: bl       #0xb99af8 */ CALL_DIRECT(sub_00b99af8);
    /* 0x00ba8000: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba8004: ldr      x8, [x9, #0x10] */ ARM64("ldr x8, [x9, #0x10]");
    /* 0x00ba8008: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00ba800c: str      x8, [x9, #0x10] */ ARM64("str x8, [x9, #0x10]");
    /* 0x00ba8010: b        #0xba8248 */ goto loc_00ba8248;
    /* 0x00ba8014: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8018: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba801c: b        #0xba85c4 */ goto loc_00ba85c4;
    /* 0x00ba8020: b        #0xba822c */ goto loc_00ba822c;
    /* 0x00ba8024: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8028: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba802c: bl       #0xb9b2c4 */ CALL_DIRECT(sub_00b9b2c4);
    /* 0x00ba8030: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba8034: bl       #0xb9b774 */ CALL_DIRECT(sub_00b9b774);
    /* 0x00ba8038: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba803c: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba8040: b        #0xba8818 */ goto loc_00ba8818;
    /* 0x00ba8044: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8048: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba804c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba8050: bl       #0xba9254 */ CALL_DIRECT(sub_00ba9254);
    /* 0x00ba8054: b        #0xba85dc */ goto loc_00ba85dc;
    /* 0x00ba8058: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba805c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8060: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba8064: bl       #0xba9178 */ CALL_DIRECT(sub_00ba9178);
loc_00ba8068:
    /* 0x00ba8068: ldxr     x8, [x24] */ ARM64("ldxr x8, [x24]");
    /* 0x00ba806c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba8070: stlxr    w9, x8, [x24] */ ARM64("stlxr w9, x8, [x24]");
    /* 0x00ba8074: cbnz     w9, #0xba8068 */ if (w9 != 0) goto loc_00ba8068;
    /* 0x00ba8078: b.ne     #0xba85dc */ if (COND_NE) goto loc_00ba85dc;
    /* 0x00ba807c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba8080: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba8084: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba8088: b        #0xba85dc */ goto loc_00ba85dc;
    /* 0x00ba808c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8090: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba8094:
    /* 0x00ba8094: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba8098: bl       #0xb9a03c */ CALL_DIRECT(sub_00b9a03c);
    /* 0x00ba809c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba80a0: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba80a4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba80a8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba80ac: orn      w8, w25, w20 */ ARM64("orn w8, w25, w20");
    /* 0x00ba80b0: tbnz     w8, #0, #0xba8348 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba8348;
    /* 0x00ba80b4: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba80b8: b        #0xba835c */ goto loc_00ba835c;
    /* 0x00ba80bc: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba80c0: ldp      q0, q1, [sp, #0x130] */ ARM64("ldp q0, q1, [sp, #0x130]");
    /* 0x00ba80c4: stp      q0, q1, [x28, #0x1e0] */ ARM64("stp q0, q1, [x28, #0x1e0]");
    /* 0x00ba80c8: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba80cc: b        #0xba8888 */ goto loc_00ba8888;
    /* 0x00ba80d0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba80d4: ldr      x8, [sp, #0x130] */ ARM64("ldr x8, [sp, #0x130]");
    /* 0x00ba80d8: cbz      x8, #0xba8158 */ if (x8 == 0) goto loc_00ba8158;
    /* 0x00ba80dc: ldr      x0, [sp, #0x138] */ ARM64("ldr x0, [sp, #0x138]");
    /* 0x00ba80e0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba80e4: b        #0xba8158 */ goto loc_00ba8158;
loc_00ba80e8:
    /* 0x00ba80e8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba80ec: cbz      x24, #0xba80f8 */ if (x24 == 0) goto loc_00ba80f8;
loc_00ba80f0:
    /* 0x00ba80f0: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba80f4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba80f8:
    /* 0x00ba80f8: ldr      x9, [sp, #0x138] */ ARM64("ldr x9, [sp, #0x138]");
    /* 0x00ba80fc: cbz      x9, #0xba8578 */ if (x9 == 0) goto loc_00ba8578;
    /* 0x00ba8100: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00ba8104: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00ba8108: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00ba810c: b.eq     #0xba8578 */ if (COND_EQ) goto loc_00ba8578;
    /* 0x00ba8110: ldr      x9, [sp, #0x130] */ ARM64("ldr x9, [sp, #0x130]");
    /* 0x00ba8114: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba8118: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba811c: b        #0xba8574 */ goto loc_00ba8574;
loc_00ba8120:
    /* 0x00ba8120: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8124: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8128: b        #0xba86d8 */ goto loc_00ba86d8;
    /* 0x00ba812c: b        #0xba85c4 */ goto loc_00ba85c4;
    /* 0x00ba8130: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8134: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba8138: bl       #0xb9b65c */ CALL_DIRECT(sub_00b9b65c);
    /* 0x00ba813c: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba8140: bl       #0xb9c640 */ CALL_DIRECT(sub_00b9c640);
    /* 0x00ba8144: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8148: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba814c: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba8150: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8154: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba8158:
    /* 0x00ba8158: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba815c: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba8160: b        #0xba8978 */ goto loc_00ba8978;
    /* 0x00ba8164: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba8168:
    /* 0x00ba8168: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00ba816c: b.eq     #0xba8184 */ if (COND_EQ) goto loc_00ba8184;
    /* 0x00ba8170: add      x21, x22, #0x28 */ ARM64("add x21, x22, #0x28");
    /* 0x00ba8174: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8178: bl       #0xb9dd40 */ CALL_DIRECT(sub_00b9dd40);
    /* 0x00ba817c: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00ba8180: b        #0xba8168 */ goto loc_00ba8168;
loc_00ba8184:
    /* 0x00ba8184: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba8188: cbz      x8, #0xba85dc */ if (x8 == 0) goto loc_00ba85dc;
    /* 0x00ba818c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba8190: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba8194: b        #0xba85dc */ goto loc_00ba85dc;
    /* 0x00ba8198: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba819c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba81a0:
    /* 0x00ba81a0: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba81a4: bl       #0xba89e4 */ CALL_DIRECT(sub_00ba89e4);
    /* 0x00ba81a8: b        #0xba8478 */ goto loc_00ba8478;
loc_00ba81ac:
    /* 0x00ba81ac: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba81b0: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba81b4: bl       #0xbd989c */ CALL_DIRECT(sub_00bd989c);
    /* 0x00ba81b8: ldur     x20, [x29, #-0xf0] */ ARM64("ldur x20, [x29, #-0xf0]");
    /* 0x00ba81bc: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba81c0: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00ba81c4: cbz      x20, #0xba8644 */ if (x20 == 0) goto loc_00ba8644;
    /* 0x00ba81c8: ldur     x0, [x29, #-0xe8] */ ARM64("ldur x0, [x29, #-0xe8]");
    /* 0x00ba81cc: b        #0xba8650 */ goto loc_00ba8650;
    /* 0x00ba81d0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba81d4: b        #0xba89bc */ goto loc_00ba89bc;
loc_00ba81d8:
    /* 0x00ba81d8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba81dc: ldr      x8, [x22, #0x10] */ ARM64("ldr x8, [x22, #0x10]");
    /* 0x00ba81e0: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00ba81e4: str      x8, [x22, #0x10] */ ARM64("str x8, [x22, #0x10]");
    /* 0x00ba81e8: b        #0xba81f0 */ goto loc_00ba81f0;
    /* 0x00ba81ec: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba81f0:
    /* 0x00ba81f0: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba81f4: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
    /* 0x00ba81f8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba81fc: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba8200: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8204: b        #0xba82a0 */ goto loc_00ba82a0;
    /* 0x00ba8208: b        #0xba82a0 */ goto loc_00ba82a0;
    /* 0x00ba820c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8210: cbz      x23, #0xba8348 */ if (x23 == 0) goto loc_00ba8348;
loc_00ba8214:
    /* 0x00ba8214: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8218: b        #0xba835c */ goto loc_00ba835c;
    /* 0x00ba821c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8220: cbz      x27, #0xba8348 */ if (x27 == 0) goto loc_00ba8348;
loc_00ba8224:
    /* 0x00ba8224: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba8228: b        #0xba835c */ goto loc_00ba835c;
loc_00ba822c:
    /* 0x00ba822c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8230: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba8234: b        #0xba8244 */ goto loc_00ba8244;
    /* 0x00ba8238: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba823c: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00ba8240: add      x0, x0, #0x958 */ ARM64("add x0, x0, #0x958");
loc_00ba8244:
    /* 0x00ba8244: bl       #0xb86900 */ CALL_DIRECT(sub_00b86900);
loc_00ba8248:
    /* 0x00ba8248: ldr      x9, [sp, #0x100] */ ARM64("ldr x9, [sp, #0x100]");
    /* 0x00ba824c: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00ba8250: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba8254: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00ba8258: b.ne     #0xba82d4 */ if (COND_NE) goto loc_00ba82d4;
    /* 0x00ba825c: mov      x0, x9 */ ARM64("mov x0, x9");
    /* 0x00ba8260: bl       #0xbdc2b4 */ CALL_DIRECT(sub_00bdc2b4);
    /* 0x00ba8264: b        #0xba82d4 */ goto loc_00ba82d4;
loc_00ba8268:
    /* 0x00ba8268: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba826c: cbz      x21, #0xba85c8 */ if (x21 == 0) goto loc_00ba85c8;
    /* 0x00ba8270: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba8274: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba8278: b        #0xba85c8 */ goto loc_00ba85c8;
    /* 0x00ba827c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8280: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8284: b        #0xba8988 */ goto loc_00ba8988;
    /* 0x00ba8288: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba828c:
    /* 0x00ba828c: ldr      x25, [sp, #0xa0] */ ARM64("ldr x25, [sp, #0xa0]");
    /* 0x00ba8290: b        #0xba86f4 */ goto loc_00ba86f4;
loc_00ba8294:
    /* 0x00ba8294: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8298: b        #0xba8478 */ goto loc_00ba8478;
    /* 0x00ba829c: b        #0xba8768 */ goto loc_00ba8768;
loc_00ba82a0:
    /* 0x00ba82a0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba82a4:
    /* 0x00ba82a4: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba82a8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba82ac: stlxr    w9, x8, [x23] */ ARM64("stlxr w9, x8, [x23]");
    /* 0x00ba82b0: cbnz     w9, #0xba82a4 */ if (w9 != 0) goto loc_00ba82a4;
    /* 0x00ba82b4: b.ne     #0xba82c4 */ if (COND_NE) goto loc_00ba82c4;
    /* 0x00ba82b8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba82bc: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba82c0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba82c4:
    /* 0x00ba82c4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba82c8: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba82cc: b        #0xba89b4 */ goto loc_00ba89b4;
loc_00ba82d0:
    /* 0x00ba82d0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba82d4:
    /* 0x00ba82d4: ldr      x9, [sp, #0x110] */ ARM64("ldr x9, [sp, #0x110]");
    /* 0x00ba82d8: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00ba82dc: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba82e0: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00ba82e4: b.ne     #0xba82f0 */ if (COND_NE) goto loc_00ba82f0;
    /* 0x00ba82e8: ldr      x0, [sp, #0x110] */ ARM64("ldr x0, [sp, #0x110]");
    /* 0x00ba82ec: bl       #0xbdc2b4 */ CALL_DIRECT(sub_00bdc2b4);
loc_00ba82f0:
    /* 0x00ba82f0: ldxr     x8, [x26] */ ARM64("ldxr x8, [x26]");
    /* 0x00ba82f4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba82f8: stlxr    w9, x8, [x26] */ ARM64("stlxr w9, x8, [x26]");
    /* 0x00ba82fc: cbnz     w9, #0xba82f0 */ if (w9 != 0) goto loc_00ba82f0;
    /* 0x00ba8300: b.ne     #0xba8310 */ if (COND_NE) goto loc_00ba8310;
    /* 0x00ba8304: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba8308: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00ba830c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8310:
    /* 0x00ba8310: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba8314: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba8318: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba831c: cbnz     w9, #0xba8310 */ if (w9 != 0) goto loc_00ba8310;
    /* 0x00ba8320: b.ne     #0xba8330 */ if (COND_NE) goto loc_00ba8330;
    /* 0x00ba8324: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba8328: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba832c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8330:
    /* 0x00ba8330: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00ba8334: bl       #0xbe71b0 */ CALL_DIRECT(sub_00be71b0);
    /* 0x00ba8338: b        #0xba83a0 */ goto loc_00ba83a0;
    /* 0x00ba833c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8340: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8344: cbnz     x25, #0xba8358 */ if (x25 != 0) goto loc_00ba8358;
loc_00ba8348:
    /* 0x00ba8348: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba834c: ldr      x20, [sp, #0x2b8] */ ARM64("ldr x20, [sp, #0x2b8]");
    /* 0x00ba8350: cbnz     x20, #0xba88d4 */ if (x20 != 0) goto loc_00ba88d4;
    /* 0x00ba8354: b        #0xba89cc */ goto loc_00ba89cc;
loc_00ba8358:
    /* 0x00ba8358: mov      x0, x23 */ ARM64("mov x0, x23");
loc_00ba835c:
    /* 0x00ba835c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba8360: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8364: ldr      x20, [sp, #0x2b8] */ ARM64("ldr x20, [sp, #0x2b8]");
    /* 0x00ba8368: cbnz     x20, #0xba88d4 */ if (x20 != 0) goto loc_00ba88d4;
    /* 0x00ba836c: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba8370: b        #0xba87f0 */ goto loc_00ba87f0;
    /* 0x00ba8374: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8378: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba837c: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba8380: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8384: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba8388: bl       #0xbd7a64 */ CALL_DIRECT(sub_00bd7a64);
    /* 0x00ba838c: b        #0xba887c */ goto loc_00ba887c;
    /* 0x00ba8390: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8394: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba8398: b        #0xba85c4 */ goto loc_00ba85c4;
loc_00ba839c:
    /* 0x00ba839c: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba83a0:
    /* 0x00ba83a0: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba83a4: bl       #0xba997c */ CALL_DIRECT(sub_00ba997c);
    /* 0x00ba83a8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba83ac: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba83b0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba83b4:
    /* 0x00ba83b4: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba83b8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba83bc: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00ba83c0: cbnz     w9, #0xba83b4 */ if (w9 != 0) goto loc_00ba83b4;
    /* 0x00ba83c4: b.ne     #0xba83e4 */ if (COND_NE) goto loc_00ba83e4;
    /* 0x00ba83c8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba83cc: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba83d0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00ba83d4: b        #0xba83e4 */ goto loc_00ba83e4;
    /* 0x00ba83d8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba83dc: b        #0xba8404 */ goto loc_00ba8404;
    /* 0x00ba83e0: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba83e4:
    /* 0x00ba83e4: ldxr     x8, [x28] */ ARM64("ldxr x8, [x28]");
    /* 0x00ba83e8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba83ec: stlxr    w9, x8, [x28] */ ARM64("stlxr w9, x8, [x28]");
    /* 0x00ba83f0: cbnz     w9, #0xba83e4 */ if (w9 != 0) goto loc_00ba83e4;
    /* 0x00ba83f4: b.ne     #0xba8404 */ if (COND_NE) goto loc_00ba8404;
    /* 0x00ba83f8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba83fc: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba8400: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8404:
    /* 0x00ba8404: ldxr     x8, [x27] */ ARM64("ldxr x8, [x27]");
    /* 0x00ba8408: sub      x9, x8, #1 */ ARM64("sub x9, x8, #1");
    /* 0x00ba840c: stlxr    w10, x9, [x27] */ ARM64("stlxr w10, x9, [x27]");
    /* 0x00ba8410: cbnz     w10, #0xba8404 */ if (w10 != 0) goto loc_00ba8404;
loc_00ba8414:
    /* 0x00ba8414: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00ba8418: b.ne     #0xba8428 */ if (COND_NE) goto loc_00ba8428;
    /* 0x00ba841c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba8420: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00ba8424: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8428:
    /* 0x00ba8428: mov      w20, #1 */ ARM64("mov w20, #1");
loc_00ba842c:
    /* 0x00ba842c: ldr      x22, [sp, #0x398] */ ARM64("ldr x22, [sp, #0x398]");
    /* 0x00ba8430: ldr      x1, [sp, #0x3a0] */ ARM64("ldr x1, [sp, #0x3a0]");
    /* 0x00ba8434: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8438: bl       #0xb9f0c8 */ CALL_DIRECT(sub_00b9f0c8);
    /* 0x00ba843c: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba8440: cbz      x8, #0xba844c */ if (x8 == 0) goto loc_00ba844c;
    /* 0x00ba8444: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8448: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba844c:
    /* 0x00ba844c: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba8450: cbz      x8, #0xba8474 */ if (x8 == 0) goto loc_00ba8474;
loc_00ba8454:
    /* 0x00ba8454: ldxr     x8, [x25] */ ARM64("ldxr x8, [x25]");
    /* 0x00ba8458: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba845c: stlxr    w9, x8, [x25] */ ARM64("stlxr w9, x8, [x25]");
    /* 0x00ba8460: cbnz     w9, #0xba8454 */ if (w9 != 0) goto loc_00ba8454;
    /* 0x00ba8464: b.ne     #0xba8474 */ if (COND_NE) goto loc_00ba8474;
    /* 0x00ba8468: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba846c: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00ba8470: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8474:
    /* 0x00ba8474: tbz      w20, #0, #0xba8498 */ if (((w20 >> #0) & 1) == 0) goto loc_00ba8498;
loc_00ba8478:
    /* 0x00ba8478: ldr      x22, [sp, #0x2b8] */ ARM64("ldr x22, [sp, #0x2b8]");
    /* 0x00ba847c: ldr      x1, [sp, #0x2c0] */ ARM64("ldr x1, [sp, #0x2c0]");
    /* 0x00ba8480: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8484: bl       #0xb9f0c8 */ CALL_DIRECT(sub_00b9f0c8);
    /* 0x00ba8488: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba848c: cbz      x8, #0xba8498 */ if (x8 == 0) goto loc_00ba8498;
    /* 0x00ba8490: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8494: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8498:
    /* 0x00ba8498: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba849c: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
loc_00ba84a0:
    /* 0x00ba84a0: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba84a4: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
loc_00ba84a8:
    /* 0x00ba84a8: ldr      x22, [sp, #0x2a0] */ ARM64("ldr x22, [sp, #0x2a0]");
    /* 0x00ba84ac: ldr      x1, [sp, #0x2a8] */ ARM64("ldr x1, [sp, #0x2a8]");
    /* 0x00ba84b0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba84b4: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
loc_00ba84b8:
    /* 0x00ba84b8: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba84bc: cbz      x8, #0xba84c8 */ if (x8 == 0) goto loc_00ba84c8;
    /* 0x00ba84c0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba84c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba84c8:
    /* 0x00ba84c8: ldr      x22, [sp, #0x288] */ ARM64("ldr x22, [sp, #0x288]");
    /* 0x00ba84cc: ldr      x1, [sp, #0x290] */ ARM64("ldr x1, [sp, #0x290]");
    /* 0x00ba84d0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba84d4: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
loc_00ba84d8:
    /* 0x00ba84d8: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba84dc: cbz      x8, #0xba84e8 */ if (x8 == 0) goto loc_00ba84e8;
    /* 0x00ba84e0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba84e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba84e8:
    /* 0x00ba84e8: ldr      x22, [sp, #0x270] */ ARM64("ldr x22, [sp, #0x270]");
    /* 0x00ba84ec: ldr      x1, [sp, #0x278] */ ARM64("ldr x1, [sp, #0x278]");
    /* 0x00ba84f0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba84f4: bl       #0xb9f260 */ CALL_DIRECT(sub_00b9f260);
    /* 0x00ba84f8: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00ba84fc: cbz      x8, #0xba8508 */ if (x8 == 0) goto loc_00ba8508;
    /* 0x00ba8500: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8504: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8508:
    /* 0x00ba8508: ldr      x8, [sp, #0x90] */ ARM64("ldr x8, [sp, #0x90]");
    /* 0x00ba850c: cbz      x8, #0xba8644 */ if (x8 == 0) goto loc_00ba8644;
    /* 0x00ba8510: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00ba8514: b        #0xba8650 */ goto loc_00ba8650;
    /* 0x00ba8518: ldr      x8, [sp, #0x268] */ ARM64("ldr x8, [sp, #0x268]");
    /* 0x00ba851c: cbz      x8, #0xba855c */ if (x8 == 0) goto loc_00ba855c;
    /* 0x00ba8520: b        #0xba8544 */ goto loc_00ba8544;
    /* 0x00ba8524: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba8528: cbz      x8, #0xba855c */ if (x8 == 0) goto loc_00ba855c;
    /* 0x00ba852c: b        #0xba8544 */ goto loc_00ba8544;
    /* 0x00ba8530: ldr      x8, [sp, #0x298] */ ARM64("ldr x8, [sp, #0x298]");
    /* 0x00ba8534: cbz      x8, #0xba855c */ if (x8 == 0) goto loc_00ba855c;
    /* 0x00ba8538: b        #0xba8544 */ goto loc_00ba8544;
    /* 0x00ba853c: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00ba8540: cbz      x8, #0xba855c */ if (x8 == 0) goto loc_00ba855c;
loc_00ba8544:
    /* 0x00ba8544: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba8548: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba854c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8550: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8554: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba8558: cbnz     x8, #0xba8544 */ if (x8 != 0) goto loc_00ba8544;
loc_00ba855c:
    /* 0x00ba855c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8560: b        #0xba87f0 */ goto loc_00ba87f0;
    /* 0x00ba8564: b        #0xba85d8 */ goto loc_00ba85d8;
    /* 0x00ba8568: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba856c: cbz      x24, #0xba8578 */ if (x24 == 0) goto loc_00ba8578;
loc_00ba8570:
    /* 0x00ba8570: mov      x0, x25 */ ARM64("mov x0, x25");
loc_00ba8574:
    /* 0x00ba8574: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8578:
    /* 0x00ba8578: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba857c: add      x20, x8, #8 */ ARM64("add x20, x8, #8");
    /* 0x00ba8580: b        #0xba858c */ goto loc_00ba858c;
loc_00ba8584:
    /* 0x00ba8584: add      x20, x20, #0x18 */ ARM64("add x20, x20, #0x18");
    /* 0x00ba8588: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
loc_00ba858c:
    /* 0x00ba858c: cbz      x26, #0xba85a4 */ if (x26 == 0) goto loc_00ba85a4;
    /* 0x00ba8590: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00ba8594: cbz      x8, #0xba8584 */ if (x8 == 0) goto loc_00ba8584;
    /* 0x00ba8598: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00ba859c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba85a0: b        #0xba8584 */ goto loc_00ba8584;
loc_00ba85a4:
    /* 0x00ba85a4: ldr      x8, [sp, #0x70] */ ARM64("ldr x8, [sp, #0x70]");
    /* 0x00ba85a8: cbz      x8, #0xba85b4 */ if (x8 == 0) goto loc_00ba85b4;
    /* 0x00ba85ac: ldr      x0, [sp, #0x110] */ ARM64("ldr x0, [sp, #0x110]");
    /* 0x00ba85b0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba85b4:
    /* 0x00ba85b4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba85b8: ldr      x25, [sp, #0x40] */ ARM64("ldr x25, [sp, #0x40]");
    /* 0x00ba85bc: ldr      x20, [sp, #0x80] */ ARM64("ldr x20, [sp, #0x80]");
    /* 0x00ba85c0: b        #0xba8834 */ goto loc_00ba8834;
loc_00ba85c4:
    /* 0x00ba85c4: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba85c8:
    /* 0x00ba85c8: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba85cc: ldr      x25, [sp, #0xa0] */ ARM64("ldr x25, [sp, #0xa0]");
    /* 0x00ba85d0: b        #0xba86d8 */ goto loc_00ba86d8;
    /* 0x00ba85d4: b        #0xba88c8 */ goto loc_00ba88c8;
loc_00ba85d8:
    /* 0x00ba85d8: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba85dc:
    /* 0x00ba85dc: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba85e0: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba85e4: b        #0xba887c */ goto loc_00ba887c;
    /* 0x00ba85e8: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba85ec:
    /* 0x00ba85ec: ldr      x8, [x24] */ ARM64("ldr x8, [x24]");
    /* 0x00ba85f0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba85f4: str      x8, [x24] */ ARM64("str x8, [x24]");
    /* 0x00ba85f8: b.ne     #0xba8604 */ if (COND_NE) goto loc_00ba8604;
    /* 0x00ba85fc: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00ba8600: bl       #0xbdc23c */ CALL_DIRECT(sub_00bdc23c);
loc_00ba8604:
    /* 0x00ba8604: ldxr     x8, [x23] */ ARM64("ldxr x8, [x23]");
    /* 0x00ba8608: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba860c: stlxr    w9, x8, [x23] */ ARM64("stlxr w9, x8, [x23]");
    /* 0x00ba8610: cbnz     w9, #0xba8604 */ if (w9 != 0) goto loc_00ba8604;
    /* 0x00ba8614: b.ne     #0xba8624 */ if (COND_NE) goto loc_00ba8624;
    /* 0x00ba8618: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba861c: mov      x0, x23 */ ARM64("mov x0, x23");
loc_00ba8620:
    /* 0x00ba8620: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba8624:
    /* 0x00ba8624: sub      x0, x29, #0xb0 */ ARM64("sub x0, x29, #0xb0");
    /* 0x00ba8628: bl       #0xbe7278 */ CALL_DIRECT(sub_00be7278);
loc_00ba862c:
    /* 0x00ba862c: ldr      x8, [sp, #0x110] */ ARM64("ldr x8, [sp, #0x110]");
    /* 0x00ba8630: cbz      x8, #0xba863c */ if (x8 == 0) goto loc_00ba863c;
    /* 0x00ba8634: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba8638: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba863c:
    /* 0x00ba863c: ldr      x8, [sp, #0x100] */ ARM64("ldr x8, [sp, #0x100]");
    /* 0x00ba8640: cbnz     x8, #0xba864c */ if (x8 != 0) goto loc_00ba864c;
loc_00ba8644:
    /* 0x00ba8644: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8648: b        #0xba89cc */ goto loc_00ba89cc;
loc_00ba864c:
    /* 0x00ba864c: mov      x0, x27 */ ARM64("mov x0, x27");
loc_00ba8650:
    /* 0x00ba8650: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba8654: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8658: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba865c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8660: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8664: b        #0xba8978 */ goto loc_00ba8978;
    /* 0x00ba8668: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba866c:
    /* 0x00ba866c: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
    /* 0x00ba8670: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba8674: str      x8, [x23] */ ARM64("str x8, [x23]");
    /* 0x00ba8678: b.ne     #0xba8684 */ if (COND_NE) goto loc_00ba8684;
    /* 0x00ba867c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00ba8680: bl       #0xbdc23c */ CALL_DIRECT(sub_00bdc23c);
loc_00ba8684:
    /* 0x00ba8684: ldxr     x8, [x22] */ ARM64("ldxr x8, [x22]");
    /* 0x00ba8688: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba868c: stlxr    w9, x8, [x22] */ ARM64("stlxr w9, x8, [x22]");
    /* 0x00ba8690: cbnz     w9, #0xba8684 */ if (w9 != 0) goto loc_00ba8684;
    /* 0x00ba8694: b.ne     #0xba86a4 */ if (COND_NE) goto loc_00ba86a4;
    /* 0x00ba8698: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba869c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00ba86a0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba86a4:
    /* 0x00ba86a4: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00ba86a8: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00ba86ac: stlxr    w9, x8, [x20] */ ARM64("stlxr w9, x8, [x20]");
    /* 0x00ba86b0: cbnz     w9, #0xba86a4 */ if (w9 != 0) goto loc_00ba86a4;
    /* 0x00ba86b4: b.ne     #0xba86c4 */ if (COND_NE) goto loc_00ba86c4;
    /* 0x00ba86b8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00ba86bc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00ba86c0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00ba86c4:
    /* 0x00ba86c4: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba86c8: bl       #0xbe704c */ CALL_DIRECT(sub_00be704c);
    /* 0x00ba86cc: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba86d0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba86d4: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba86d8:
    /* 0x00ba86d8: ldr      x8, [sp, #0x2d0] */ ARM64("ldr x8, [sp, #0x2d0]");
    /* 0x00ba86dc: cbz      x8, #0xba86e8 */ if (x8 == 0) goto loc_00ba86e8;
    /* 0x00ba86e0: ldr      x0, [sp, #0x2d8] */ ARM64("ldr x0, [sp, #0x2d8]");
    /* 0x00ba86e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba86e8:
    /* 0x00ba86e8: ldr      x0, [sp, #0x2e8] */ ARM64("ldr x0, [sp, #0x2e8]");
    /* 0x00ba86ec: ldr      x1, [sp, #0x2f0] */ ARM64("ldr x1, [sp, #0x2f0]");
    /* 0x00ba86f0: bl       #0xb9a120 */ CALL_DIRECT(sub_00b9a120);
loc_00ba86f4:
    /* 0x00ba86f4: cbz      x25, #0xba89cc */ if (x25 == 0) goto loc_00ba89cc;
    /* 0x00ba86f8: lsl      x8, x25, #3 */ ARM64("lsl x8, x25, #3");
    /* 0x00ba86fc: add      x9, x8, x25 */ ARM64("add x9, x8, x25");
    /* 0x00ba8700: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00ba8704: b.eq     #0xba89cc */ if (COND_EQ) goto loc_00ba89cc;
    /* 0x00ba8708: ldr      x9, [sp, #0x68] */ ARM64("ldr x9, [sp, #0x68]");
    /* 0x00ba870c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba8710: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00ba8714: b        #0xba89c8 */ goto loc_00ba89c8;
loc_00ba8718:
    /* 0x00ba8718: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba871c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8720: ldr      x25, [sp, #0x40] */ ARM64("ldr x25, [sp, #0x40]");
    /* 0x00ba8724: ldr      x21, [sp, #0x110] */ ARM64("ldr x21, [sp, #0x110]");
    /* 0x00ba8728: ldr      x0, [sp, #0x10] */ ARM64("ldr x0, [sp, #0x10]");
    /* 0x00ba872c: ldr      x8, [sp, #0x20] */ ARM64("ldr x8, [sp, #0x20]");
    /* 0x00ba8730: ldr      w9, [sp, #0x1c] */ ARM64("ldr w9, [sp, #0x1c]");
    /* 0x00ba8734: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba8738: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba873c: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00ba8740: tbnz     w8, #0, #0xba8748 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba8748;
    /* 0x00ba8744: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8748:
    /* 0x00ba8748: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00ba874c: cbz      x8, #0xba87a0 */ if (x8 == 0) goto loc_00ba87a0;
    /* 0x00ba8750: ldur     x0, [x29, #-0xa8] */ ARM64("ldur x0, [x29, #-0xa8]");
    /* 0x00ba8754: b        #0xba879c */ goto loc_00ba879c;
    /* 0x00ba8758: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba875c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8760: ldr      x25, [sp, #0x40] */ ARM64("ldr x25, [sp, #0x40]");
    /* 0x00ba8764: b        #0xba877c */ goto loc_00ba877c;
loc_00ba8768:
    /* 0x00ba8768: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba876c: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00ba8770: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba8774: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8778: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
loc_00ba877c:
    /* 0x00ba877c: ldr      x21, [sp, #0x110] */ ARM64("ldr x21, [sp, #0x110]");
    /* 0x00ba8780: ldr      x0, [sp, #0x10] */ ARM64("ldr x0, [sp, #0x10]");
    /* 0x00ba8784: ldr      x8, [sp, #0x20] */ ARM64("ldr x8, [sp, #0x20]");
    /* 0x00ba8788: ldr      w9, [sp, #0x1c] */ ARM64("ldr w9, [sp, #0x1c]");
    /* 0x00ba878c: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00ba8790: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba8794: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00ba8798: tbnz     w8, #0, #0xba87a0 */ if (((w8 >> #0) & 1) != 0) goto loc_00ba87a0;
loc_00ba879c:
    /* 0x00ba879c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba87a0:
    /* 0x00ba87a0: add      x20, x21, #8 */ ARM64("add x20, x21, #8");
    /* 0x00ba87a4: b        #0xba87b0 */ goto loc_00ba87b0;
loc_00ba87a8:
    /* 0x00ba87a8: add      x20, x20, #0x18 */ ARM64("add x20, x20, #0x18");
    /* 0x00ba87ac: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
loc_00ba87b0:
    /* 0x00ba87b0: cbz      x26, #0xba87c8 */ if (x26 == 0) goto loc_00ba87c8;
    /* 0x00ba87b4: ldur     x8, [x20, #-8] */ ARM64("ldur x8, [x20, #-8]");
    /* 0x00ba87b8: cbz      x8, #0xba87a8 */ if (x8 == 0) goto loc_00ba87a8;
    /* 0x00ba87bc: ldr      x0, [x20] */ ARM64("ldr x0, [x20]");
    /* 0x00ba87c0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba87c4: b        #0xba87a8 */ goto loc_00ba87a8;
loc_00ba87c8:
    /* 0x00ba87c8: ldr      x8, [sp, #0x70] */ ARM64("ldr x8, [sp, #0x70]");
    /* 0x00ba87cc: cbnz     x8, #0xba87d8 */ if (x8 != 0) goto loc_00ba87d8;
    /* 0x00ba87d0: ldr      x20, [sp, #0x80] */ ARM64("ldr x20, [sp, #0x80]");
    /* 0x00ba87d4: b        #0xba882c */ goto loc_00ba882c;
loc_00ba87d8:
    /* 0x00ba87d8: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00ba87dc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00ba87e0: ldr      x20, [sp, #0x80] */ ARM64("ldr x20, [sp, #0x80]");
    /* 0x00ba87e4: b        #0xba882c */ goto loc_00ba882c;
    /* 0x00ba87e8: b        #0xba88c8 */ goto loc_00ba88c8;
    /* 0x00ba87ec: b        #0xba88c8 */ goto loc_00ba88c8;
loc_00ba87f0:
    /* 0x00ba87f0: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba87f4: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba87f8: ldr      x20, [sp, #0x2b8] */ ARM64("ldr x20, [sp, #0x2b8]");
    /* 0x00ba87fc: cbnz     x20, #0xba88d4 */ if (x20 != 0) goto loc_00ba88d4;
    /* 0x00ba8800: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba8804: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8808: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba880c: bl       #0xb9b2c4 */ CALL_DIRECT(sub_00b9b2c4);
    /* 0x00ba8810: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
    /* 0x00ba8814: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
loc_00ba8818:
    /* 0x00ba8818: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00ba881c: bl       #0xba89e4 */ CALL_DIRECT(sub_00ba89e4);
    /* 0x00ba8820: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba8824: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8828: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba882c:
    /* 0x00ba882c: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba8830: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
loc_00ba8834:
    /* 0x00ba8834: cbz      x20, #0xba8858 */ if (x20 == 0) goto loc_00ba8858;
    /* 0x00ba8838: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00ba883c: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00ba8840: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00ba8844: b.eq     #0xba8858 */ if (COND_EQ) goto loc_00ba8858;
    /* 0x00ba8848: ldr      x9, [sp, #0xa0] */ ARM64("ldr x9, [sp, #0xa0]");
    /* 0x00ba884c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba8850: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00ba8854: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8858:
    /* 0x00ba8858: cbz      x25, #0xba89cc */ if (x25 == 0) goto loc_00ba89cc;
    /* 0x00ba885c: ldr      x0, [sp, #0x90] */ ARM64("ldr x0, [sp, #0x90]");
    /* 0x00ba8860: b        #0xba89c8 */ goto loc_00ba89c8;
    /* 0x00ba8864: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba8868: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba886c: bl       #0xb9b65c */ CALL_DIRECT(sub_00b9b65c);
    /* 0x00ba8870: b        #0xba89b4 */ goto loc_00ba89b4;
    /* 0x00ba8874: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8878: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba887c:
    /* 0x00ba887c: add      x0, sp, #0x2d0 */ ARM64("add x0, sp, #0x2d0");
    /* 0x00ba8880: bl       #0xbd232c */ CALL_DIRECT(sub_00bd232c);
    /* 0x00ba8884: b        #0xba8968 */ goto loc_00ba8968;
loc_00ba8888:
    /* 0x00ba8888: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba888c: ldr      x28, [sp, #0x128] */ ARM64("ldr x28, [sp, #0x128]");
loc_00ba8890:
    /* 0x00ba8890: ldr      w9, [sp, #0x100] */ ARM64("ldr w9, [sp, #0x100]");
    /* 0x00ba8894: cmp      x25, #0 */ ARM64("cmp x25, #0");
    /* 0x00ba8898: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00ba889c: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00ba88a0: tbnz     w8, #0, #0xba88ac */ if (((w8 >> #0) & 1) != 0) goto loc_00ba88ac;
    /* 0x00ba88a4: ldr      x0, [sp, #0xf0] */ ARM64("ldr x0, [sp, #0xf0]");
    /* 0x00ba88a8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba88ac:
    /* 0x00ba88ac: ldr      x20, [sp, #0x2b8] */ ARM64("ldr x20, [sp, #0x2b8]");
    /* 0x00ba88b0: cbnz     x20, #0xba88d4 */ if (x20 != 0) goto loc_00ba88d4;
    /* 0x00ba88b4: b        #0xba89cc */ goto loc_00ba89cc;
    /* 0x00ba88b8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba88bc: add      x0, sp, #0x130 */ ARM64("add x0, sp, #0x130");
    /* 0x00ba88c0: bl       #0xba89e4 */ CALL_DIRECT(sub_00ba89e4);
    /* 0x00ba88c4: b        #0xba8968 */ goto loc_00ba8968;
loc_00ba88c8:
    /* 0x00ba88c8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00ba88cc: ldr      x20, [sp, #0x2b8] */ ARM64("ldr x20, [sp, #0x2b8]");
    /* 0x00ba88d0: cbz      x20, #0xba89cc */ if (x20 == 0) goto loc_00ba89cc;
loc_00ba88d4:
    /* 0x00ba88d4: ldr      x21, [sp, #0x2c8] */ ARM64("ldr x21, [sp, #0x2c8]");
    /* 0x00ba88d8: cbz      x21, #0xba893c */ if (x21 == 0) goto loc_00ba893c;
    /* 0x00ba88dc: ldr      x22, [sp, #0x2b0] */ ARM64("ldr x22, [sp, #0x2b0]");
    /* 0x00ba88e0: mov      x23, x22 */ ARM64("mov x23, x22");
    /* 0x00ba88e4: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba88e8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba88ec: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba88f0: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00ba88f4: mov      w24, #0xc8 */ ARM64("mov w24, #0xc8");
loc_00ba88f8:
    /* 0x00ba88f8: cbnz     x25, #0xba8914 */ if (x25 != 0) goto loc_00ba8914;
loc_00ba88fc:
    /* 0x00ba88fc: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00ba8900: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00ba8904: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00ba8908: sub      x22, x22, #0x640 */ ARM64("sub x22, x22, #0x640");
    /* 0x00ba890c: and      x25, x8, #0x8080808080808080 */ ARM64("and x25, x8, #0x8080808080808080");
    /* 0x00ba8910: cbz      x25, #0xba88fc */ if (x25 == 0) goto loc_00ba88fc;
loc_00ba8914:
    /* 0x00ba8914: rbit     x8, x25 */ ARM64("rbit x8, x25");
    /* 0x00ba8918: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00ba891c: neg      x8, x8, lsr #3 */ ARM64("neg x8, x8, lsr #3");
    /* 0x00ba8920: smaddl   x8, w8, w24, x22 */ ARM64("smaddl x8, w8, w24, x22");
    /* 0x00ba8924: sub      x0, x8, #0xc8 */ ARM64("sub x0, x8, #0xc8");
    /* 0x00ba8928: bl       #0xb98aa8 */ CALL_DIRECT(sub_00b98aa8);
    /* 0x00ba892c: sub      x8, x25, #1 */ ARM64("sub x8, x25, #1");
    /* 0x00ba8930: and      x25, x8, x25 */ ARM64("and x25, x8, x25");
    /* 0x00ba8934: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00ba8938: cbnz     x21, #0xba88f8 */ if (x21 != 0) goto loc_00ba88f8;
loc_00ba893c:
    /* 0x00ba893c: mov      w8, #0xc8 */ ARM64("mov w8, #0xc8");
    /* 0x00ba8940: mul      x8, x20, x8 */ ARM64("mul x8, x20, x8");
    /* 0x00ba8944: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00ba8948: cmn      x9, #0xd1 */ ARM64("cmn x9, #0xd1");
    /* 0x00ba894c: b.eq     #0xba89cc */ if (COND_EQ) goto loc_00ba89cc;
    /* 0x00ba8950: ldr      x9, [sp, #0x2b0] */ ARM64("ldr x9, [sp, #0x2b0]");
    /* 0x00ba8954: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00ba8958: sub      x0, x8, #0xc8 */ ARM64("sub x0, x8, #0xc8");
    /* 0x00ba895c: b        #0xba89c8 */ goto loc_00ba89c8;
    /* 0x00ba8960: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba8964: mov      x19, x0 */ ARM64("mov x19, x0");
loc_00ba8968:
    /* 0x00ba8968: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00ba896c: cbz      x8, #0xba8978 */ if (x8 == 0) goto loc_00ba8978;
    /* 0x00ba8970: ldr      x0, [sp, #0xa0] */ ARM64("ldr x0, [sp, #0xa0]");
    /* 0x00ba8974: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8978:
    /* 0x00ba8978: ldr      x8, [sp, #0x280] */ ARM64("ldr x8, [sp, #0x280]");
    /* 0x00ba897c: cbz      x8, #0xba8988 */ if (x8 == 0) goto loc_00ba8988;
    /* 0x00ba8980: ldr      x0, [sp, #0x288] */ ARM64("ldr x0, [sp, #0x288]");
    /* 0x00ba8984: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba8988:
    /* 0x00ba8988: ldr      x8, [sp, #0x398] */ ARM64("ldr x8, [sp, #0x398]");
    /* 0x00ba898c: cbz      x8, #0xba89b4 */ if (x8 == 0) goto loc_00ba89b4;
    /* 0x00ba8990: lsl      x9, x8, #2 */ ARM64("lsl x9, x8, #2");
    /* 0x00ba8994: add      x9, x9, #0xb */ ARM64("add x9, x9, #0xb");
    /* 0x00ba8998: and      x9, x9, #0xfffffffffffffff8 */ ARM64("and x9, x9, #0xfffffffffffffff8");
    /* 0x00ba899c: add      x8, x8, x9 */ ARM64("add x8, x8, x9");
    /* 0x00ba89a0: cmn      x8, #9 */ ARM64("cmn x8, #9");
    /* 0x00ba89a4: b.eq     #0xba89b4 */ if (COND_EQ) goto loc_00ba89b4;
    /* 0x00ba89a8: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00ba89ac: sub      x0, x8, x9 */ ARM64("sub x0, x8, x9");
    /* 0x00ba89b0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba89b4:
    /* 0x00ba89b4: add      x0, sp, #0x2b0 */ ARM64("add x0, sp, #0x2b0");
    /* 0x00ba89b8: bl       #0xb98884 */ CALL_DIRECT(sub_00b98884);
loc_00ba89bc:
    /* 0x00ba89bc: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00ba89c0: cbz      x8, #0xba89cc */ if (x8 == 0) goto loc_00ba89cc;
    /* 0x00ba89c4: mov      x0, x23 */ ARM64("mov x0, x23");
loc_00ba89c8:
    /* 0x00ba89c8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00ba89cc:
    /* 0x00ba89cc: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00ba89d0: bl       #0xba95ec */ CALL_DIRECT(sub_00ba95ec);
    /* 0x00ba89d4: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00ba89d8: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
    /* 0x00ba89dc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00ba89e0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
}
