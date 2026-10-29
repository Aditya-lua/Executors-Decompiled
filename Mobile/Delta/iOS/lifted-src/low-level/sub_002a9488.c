/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x2a9488..0x2a9580 (248 bytes). */
#include "../lift_runtime.hpp"

void sub_002a9488(Arm64Context& cpu) {
    /* 0x002a9488: sub      sp, sp, #0x30 */ ARM64("sub sp, sp, #0x30");
    /* 0x002a948c: stp      x20, x19, [sp, #0x10] */ ARM64("stp x20, x19, [sp, #0x10]");
    /* 0x002a9490: stp      x29, x30, [sp, #0x20] */ ARM64("stp x29, x30, [sp, #0x20]");
    /* 0x002a9494: add      x29, sp, #0x20 */ ARM64("add x29, sp, #0x20");
    /* 0x002a9498: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x002a949c: mov      x8, sp */ ARM64("mov x8, sp");
    /* 0x002a94a0: str      x8, [sp, #8] */ ARM64("str x8, [sp, #8]");
    /* 0x002a94a4: add      x8, sp, #8 */ ARM64("add x8, sp, #8");
    /* 0x002a94a8: str      x8, [sp] */ ARM64("str x8, [sp]");
    /* 0x002a94ac: bl       #0x2aa6a8 */ CALL_DIRECT(sub_002aa6a8);
    /* 0x002a94b0: cmp      w0, #0x2f */ ARM64("cmp w0, #0x2f");
    /* 0x002a94b4: cset     w8, ne */ ARM64("cset w8, ne");
    /* 0x002a94b8: ubfiz    x8, x8, #6, #0x20 */ ARM64("ubfiz x8, x8, #6, #0x20");
    /* 0x002a94bc: cmp      w0, #0x2a */ ARM64("cmp w0, #0x2a");
    /* 0x002a94c0: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x002a94c4: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x002a94c8: adrp     x20, #0xe7b000 */ ARM64("adrp x20, #0xe7b000");
    /* 0x002a94cc: add      x20, x20, #0xcb8 */ ARM64("add x20, x20, #0xcb8");
    /* 0x002a94d0: ldr      x9, [x20, x8] */ ARM64("ldr x9, [x20, x8]");
    /* 0x002a94d4: adrp     x8, #0xc81000 */ ARM64("adrp x8, #0xc81000");
    /* 0x002a94d8: add      x8, x8, #0x4d2 */ ARM64("add x8, x8, #0x4d2");
    /* 0x002a94dc: br       x9 */ ARM64("br x9");
    /* 0x002a94e0: mov      w0, #0 */ ARM64("mov w0, #0");
    /* 0x002a94e4: str      x8, [x19, #0x68] */ ARM64("str x8, [x19, #0x68]");
    /* 0x002a94e8: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x002a94ec: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x002a94f0: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x002a94f4: ret       */ return;
loc_002a94f8:
    /* 0x002a94f8: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x002a94fc: bl       #0x2aa6a8 */ CALL_DIRECT(sub_002aa6a8);
    /* 0x002a9500: add      w8, w0, #1 */ ARM64("add w8, w0, #1");
    /* 0x002a9504: cmp      w8, #0xf */ ARM64("cmp w8, #0xf");
    /* 0x002a9508: b.hs     #0x2a94f8 */ if (COND_HS) goto loc_002a94f8;
    /* 0x002a950c: mov      w9, #0x4803 */ ARM64("mov w9, #0x4803");
    /* 0x002a9510: lsr      w8, w9, w8 */ ARM64("lsr w8, w9, w8");
    /* 0x002a9514: tbz      w8, #0, #0x2a94f8 */ if (((w8 >> #0) & 1) == 0) goto loc_002a94f8;
loc_002a9518:
    /* 0x002a9518: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x002a951c: ldp      x29, x30, [sp, #0x20] */ ARM64("ldp x29, x30, [sp, #0x20]");
    /* 0x002a9520: ldp      x20, x19, [sp, #0x10] */ ARM64("ldp x20, x19, [sp, #0x10]");
    /* 0x002a9524: add      sp, sp, #0x30 */ ARM64("add sp, sp, #0x30");
    /* 0x002a9528: ret       */ return;
loc_002a952c:
    /* 0x002a952c: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x002a9530: bl       #0x2aa6a8 */ CALL_DIRECT(sub_002aa6a8);
    /* 0x002a9534: add      w8, w0, #1 */ ARM64("add w8, w0, #1");
    /* 0x002a9538: cmp      w8, #2 */ ARM64("cmp w8, #2");
    /* 0x002a953c: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x002a9540: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x002a9544: csel     x8, x9, x8, lo */ ARM64("csel x8, x9, x8, lo");
    /* 0x002a9548: cmp      w0, #0x2a */ ARM64("cmp w0, #0x2a");
    /* 0x002a954c: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x002a9550: csel     x8, x9, x8, eq */ ARM64("csel x8, x9, x8, eq");
    /* 0x002a9554: ldr      x9, [x20, x8] */ ARM64("ldr x9, [x20, x8]");
    /* 0x002a9558: adrp     x8, #0xc81000 */ ARM64("adrp x8, #0xc81000");
    /* 0x002a955c: add      x8, x8, #0x4ac */ ARM64("add x8, x8, #0x4ac");
    /* 0x002a9560: br       x9 */ ARM64("br x9");
    /* 0x002a9564: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x002a9568: bl       #0x2aa6a8 */ CALL_DIRECT(sub_002aa6a8);
    /* 0x002a956c: cmp      w0, #0x2f */ ARM64("cmp w0, #0x2f");
    /* 0x002a9570: b.eq     #0x2a9518 */ if (COND_EQ) goto loc_002a9518;
    /* 0x002a9574: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x002a9578: bl       #0x2aeaa0 */ CALL_DIRECT(sub_002aeaa0);
    /* 0x002a957c: b        #0x2a952c */ goto loc_002a952c;
}
