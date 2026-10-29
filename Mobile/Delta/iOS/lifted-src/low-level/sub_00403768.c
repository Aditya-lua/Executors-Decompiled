/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x403768..0x4039a4 (572 bytes). */
#include "../lift_runtime.hpp"

void sub_00403768(Arm64Context& cpu) {
loc_00403768:
    /* 0x00403768: adr      x16, #0x403768 */ ARM64("adr x16, #0x403768");
    /* 0x0040376c: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x00403770: ldr      x1, #0x403778 */ ARM64("ldr x1, #0x403778");
    /* 0x00403774: blr      x17 */ CALL_INDIRECT(x17);
loc_00403778:
    /* 0x00403778: ldr      x1, #0x403780 */ ARM64("ldr x1, #0x403780");
    /* 0x0040377c: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_00403780:
    /* 0x00403780: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x00403784: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x00403788: sub      sp, sp, #0x80 */ ARM64("sub sp, sp, #0x80");
    /* 0x0040378c: stp      x22, x21, [sp, #0x50] */ ARM64("stp x22, x21, [sp, #0x50]");
    /* 0x00403790: stp      x20, x19, [sp, #0x60] */ ARM64("stp x20, x19, [sp, #0x60]");
    /* 0x00403794: stp      x29, x30, [sp, #0x70] */ ARM64("stp x29, x30, [sp, #0x70]");
    /* 0x00403798: add      x29, sp, #0x70 */ ARM64("add x29, sp, #0x70");
    /* 0x0040379c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x004037a0: adrp     x8, #0xe5c000 */ ARM64("adrp x8, #0xe5c000");
    /* 0x004037a4: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x004037a8: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x004037ac: stur     x8, [x29, #-0x28] */ ARM64("stur x8, [x29, #-0x28]");
    /* 0x004037b0: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x004037b4: str      x8, [sp, #0x10] */ ARM64("str x8, [sp, #0x10]");
    /* 0x004037b8: add      x8, sp, #0x10 */ ARM64("add x8, sp, #0x10");
    /* 0x004037bc: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x004037c0: adrp     x21, #0xf0d000 */ ARM64("adrp x21, #0xf0d000");
    /* 0x004037c4: add      x21, x21, #0x3d8 */ ARM64("add x21, x21, #0x3d8");
    /* 0x004037c8: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x004037cc: ldr      x8, [x8, #0x178] */ ARM64("ldr x8, [x8, #0x178]");
    /* 0x004037d0: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x004037d4: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x004037d8: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x004037dc: cbnz     x0, #0x4037e8 */ if (x0 != 0) goto loc_004037e8;
    /* 0x004037e0: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x004037e4: ldr      x20, [x8, #0x150] */ ARM64("ldr x20, [x8, #0x150]");
loc_004037e8:
    /* 0x004037e8: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x004037ec: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x004037f0: mov      x2, x20 */ ARM64("mov x2, x20");
    /* 0x004037f4: mov      w3, #6 */ ARM64("mov w3, #6");
    /* 0x004037f8: mov      x4, #0 */ ARM64("mov x4, #0");
    /* 0x004037fc: bl       #0xe6664 */ CALL_DIRECT(sub_000e6664);
    /* 0x00403800: ldr      x8, [x20] */ ARM64("ldr x8, [x20]");
    /* 0x00403804: ldr      w8, [x8, #0x10] */ ARM64("ldr w8, [x8, #0x10]");
    /* 0x00403808: mov      w9, #0xdf94 */ ARM64("mov w9, #0xdf94");
    /* 0x0040380c: movk     w9, #0xece2, lsl #16 */ ARM64("movk w9, #0xece2, lsl #16");
    /* 0x00403810: cmp      w8, w9 */ ARM64("cmp w8, w9");
    /* 0x00403814: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00403818: ubfiz    x9, x9, #3, #0x20 */ ARM64("ubfiz x9, x9, #3, #0x20");
    /* 0x0040381c: mov      w10, #0x44a6 */ ARM64("mov w10, #0x44a6");
    /* 0x00403820: movk     w10, #0x624b, lsl #16 */ ARM64("movk w10, #0x624b, lsl #16");
    /* 0x00403824: cmp      w8, w10 */ ARM64("cmp w8, w10");
    /* 0x00403828: mov      w10, #0x18 */ ARM64("mov w10, #0x18");
    /* 0x0040382c: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x00403830: mov      w10, #0x184f */ ARM64("mov w10, #0x184f");
    /* 0x00403834: movk     w10, #0x9f02, lsl #16 */ ARM64("movk w10, #0x9f02, lsl #16");
    /* 0x00403838: cmp      w8, w10 */ ARM64("cmp w8, w10");
    /* 0x0040383c: mov      w8, #0x10 */ ARM64("mov w8, #0x10");
    /* 0x00403840: csel     x8, x8, x9, eq */ ARM64("csel x8, x8, x9, eq");
    /* 0x00403844: adrp     x9, #0xe81000 */ ARM64("adrp x9, #0xe81000");
    /* 0x00403848: add      x9, x9, #0x7f8 */ ARM64("add x9, x9, #0x7f8");
    /* 0x0040384c: ldr      x8, [x9, x8] */ ARM64("ldr x8, [x9, x8]");
    /* 0x00403850: br       x8 */ ARM64("br x8");
    /* 0x00403854: mov      w9, #0 */ ARM64("mov w9, #0");
    /* 0x00403858: ldr      x8, [x19, #0x58]! */ ARM64("ldr x8, [x19, #0x58]!");
    /* 0x0040385c: b        #0x4038c4 */ goto loc_004038c4;
    /* 0x00403860: adrp     x8, #0xf0d000 */ ARM64("adrp x8, #0xf0d000");
    /* 0x00403864: add      x8, x8, #0x198 */ ARM64("add x8, x8, #0x198");
    /* 0x00403868: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x0040386c: ldr      w8, [x8, #0x440] */ ARM64("ldr w8, [x8, #0x440]");
    /* 0x00403870: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x00403874: b        #0x40388c */ goto loc_0040388c;
    /* 0x00403878: adrp     x8, #0xf0d000 */ ARM64("adrp x8, #0xf0d000");
    /* 0x0040387c: add      x8, x8, #0x198 */ ARM64("add x8, x8, #0x198");
    /* 0x00403880: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x00403884: ldr      s0, [x8, #0x300] */ ARM64("ldr s0, [x8, #0x300]");
    /* 0x00403888: fcmp     s0, #0.0 */ ARM64("fcmp s0, #0.0");
loc_0040388c:
    /* 0x0040388c: cset     w9, ne */ ARM64("cset w9, ne");
    /* 0x00403890: ldr      x8, [x19, #0x58]! */ ARM64("ldr x8, [x19, #0x58]!");
    /* 0x00403894: str      w9, [x8] */ ARM64("str w9, [x8]");
    /* 0x00403898: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x0040389c: b        #0x4038c4 */ goto loc_004038c4;
    /* 0x004038a0: adrp     x9, #0xf0d000 */ ARM64("adrp x9, #0xf0d000");
    /* 0x004038a4: add      x9, x9, #0x198 */ ARM64("add x9, x9, #0x198");
    /* 0x004038a8: ldr      x8, [x19, #0x58]! */ ARM64("ldr x8, [x19, #0x58]!");
    /* 0x004038ac: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x004038b0: ldr      s0, [x9, #0x2c0] */ ARM64("ldr s0, [x9, #0x2c0]");
    /* 0x004038b4: sshll    v0.2d, v0.2s, #0 */ ARM64("sshll v0.2d, v0.2s, #0");
    /* 0x004038b8: scvtf    d0, d0 */ ARM64("scvtf d0, d0");
    /* 0x004038bc: str      d0, [x8] */ ARM64("str d0, [x8]");
    /* 0x004038c0: mov      w9, #3 */ ARM64("mov w9, #3");
loc_004038c4:
    /* 0x004038c4: str      w9, [x8, #0xc] */ ARM64("str w9, [x8, #0xc]");
    /* 0x004038c8: ldr      x8, [x19] */ ARM64("ldr x8, [x19]");
    /* 0x004038cc: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x004038d0: str      x8, [x19] */ ARM64("str x8, [x19]");
    /* 0x004038d4: stp      xzr, xzr, [sp, #0x20] */ ARM64("stp xzr, xzr, [sp, #0x20]");
    /* 0x004038d8: stur     xzr, [sp, #0x2f] */ ARM64("stur xzr, [sp, #0x2f]");
    /* 0x004038dc: adrp     x8, #0xd1e000 */ ARM64("adrp x8, #0xd1e000");
    /* 0x004038e0: ldr      d0, [x8, #0x618] */ ARM64("ldr d0, [x8, #0x618]");
    /* 0x004038e4: str      s0, [sp, #0x20] */ ARM64("str s0, [sp, #0x20]");
    /* 0x004038e8: str      xzr, [sp, #0x18] */ ARM64("str xzr, [sp, #0x18]");
    /* 0x004038ec: ldr      x8, [sp, #0x18] */ ARM64("ldr x8, [sp, #0x18]");
    /* 0x004038f0: cmp      x8, #0x16 */ ARM64("cmp x8, #0x16");
    /* 0x004038f4: b.hi     #0x403970 */ if (COND_HI) goto loc_00403970;
    /* 0x004038f8: add      x8, sp, #0x20 */ ARM64("add x8, sp, #0x20");
    /* 0x004038fc: mov      w9, #0x6ee7 */ ARM64("mov w9, #0x6ee7");
    /* 0x00403900: movk     w9, #0x2ae6, lsl #16 */ ARM64("movk w9, #0x2ae6, lsl #16");
    /* 0x00403904: mov      w10, #0xaf */ ARM64("mov w10, #0xaf");
    /* 0x00403908: mov      w11, #0x2f */ ARM64("mov w11, #0x2f");
loc_0040390c:
    /* 0x0040390c: ldr      x12, [sp, #0x18] */ ARM64("ldr x12, [sp, #0x18]");
    /* 0x00403910: ldrb     w12, [x8, x12] */ ARM64("ldrb w12, [x8, x12]");
    /* 0x00403914: ldr      x13, [sp, #0x18] */ ARM64("ldr x13, [sp, #0x18]");
    /* 0x00403918: add      w13, w13, w9 */ ARM64("add w13, w13, w9");
    /* 0x0040391c: mvn      w14, w12 */ ARM64("mvn w14, w12");
    /* 0x00403920: add      w14, w12, w14, lsl #1 */ ARM64("add w14, w12, w14, lsl #1");
    /* 0x00403924: add      w14, w14, #1 */ ARM64("add w14, w14, #1");
    /* 0x00403928: orr      w14, w14, w13 */ ARM64("orr w14, w14, w13");
    /* 0x0040392c: add      w14, w14, w12 */ ARM64("add w14, w14, w12");
    /* 0x00403930: add      w12, w12, w13 */ ARM64("add w12, w12, w13");
    /* 0x00403934: sub      w12, w12, w14, lsl #1 */ ARM64("sub w12, w12, w14, lsl #1");
    /* 0x00403938: sub      w12, w12, #2 */ ARM64("sub w12, w12, #2");
    /* 0x0040393c: eor      w13, w12, w10 */ ARM64("eor w13, w12, w10");
    /* 0x00403940: orn      w14, w11, w12 */ ARM64("orn w14, w11, w12");
    /* 0x00403944: add      w12, w12, w14 */ ARM64("add w12, w12, w14");
    /* 0x00403948: add      w12, w13, w12, lsl #1 */ ARM64("add w12, w13, w12, lsl #1");
    /* 0x0040394c: add      w12, w12, #2 */ ARM64("add w12, w12, #2");
    /* 0x00403950: ldr      x13, [sp, #0x18] */ ARM64("ldr x13, [sp, #0x18]");
    /* 0x00403954: strb     w12, [x8, x13] */ ARM64("strb w12, [x8, x13]");
    /* 0x00403958: ldr      x12, [sp, #0x18] */ ARM64("ldr x12, [sp, #0x18]");
    /* 0x0040395c: add      x12, x12, #1 */ ARM64("add x12, x12, #1");
    /* 0x00403960: str      x12, [sp, #0x18] */ ARM64("str x12, [sp, #0x18]");
    /* 0x00403964: ldr      x12, [sp, #0x18] */ ARM64("ldr x12, [sp, #0x18]");
    /* 0x00403968: cmp      x12, #0x17 */ ARM64("cmp x12, #0x17");
    /* 0x0040396c: b.lo     #0x40390c */ if (COND_LO) goto loc_0040390c;
loc_00403970:
    /* 0x00403970: ldr      w0, [sp, #0x20] */ ARM64("ldr w0, [sp, #0x20]");
    /* 0x00403974: ldur     x8, [x29, #-0x28] */ ARM64("ldur x8, [x29, #-0x28]");
    /* 0x00403978: adrp     x9, #0xe5c000 */ ARM64("adrp x9, #0xe5c000");
    /* 0x0040397c: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x00403980: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x00403984: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00403988: b.ne     #0x4039a0 */ if (COND_NE) goto loc_004039a0;
    /* 0x0040398c: ldp      x29, x30, [sp, #0x70] */ ARM64("ldp x29, x30, [sp, #0x70]");
    /* 0x00403990: ldp      x20, x19, [sp, #0x60] */ ARM64("ldp x20, x19, [sp, #0x60]");
    /* 0x00403994: ldp      x22, x21, [sp, #0x50] */ ARM64("ldp x22, x21, [sp, #0x50]");
    /* 0x00403998: add      sp, sp, #0x80 */ ARM64("add sp, sp, #0x80");
    /* 0x0040399c: ret       */ return;
loc_004039a0:
    /* 0x004039a0: bl       #0xc7a904 */ CALL_DIRECT(sub_00c7a904);
}
