/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x43aa64..0x43ac98 (564 bytes). */
#include "../lift_runtime.hpp"

void sub_0043aa64(Arm64Context& cpu) {
loc_0043aa64:
    /* 0x0043aa64: adr      x16, #0x43aa64 */ ARM64("adr x16, #0x43aa64");
    /* 0x0043aa68: ldr      x0, [x1, #0x18] */ ARM64("ldr x0, [x1, #0x18]");
    /* 0x0043aa6c: ldr      x1, #0x43aa74 */ ARM64("ldr x1, #0x43aa74");
    /* 0x0043aa70: blr      x17 */ CALL_INDIRECT(x17);
loc_0043aa74:
    /* 0x0043aa74: ldr      x1, #0x43aa7c */ ARM64("ldr x1, #0x43aa7c");
    /* 0x0043aa78: .byte    0x60, 0x06, 0x3f, 0xd6 */ ARM64(".byte 0x60, 0x06, 0x3f, 0xd6");
loc_0043aa7c:
    /* 0x0043aa7c: .byte    0xf1, 0xff, 0xf2, 0xa2 */ ARM64(".byte 0xf1, 0xff, 0xf2, 0xa2");
    /* 0x0043aa80: .byte    0xf8, 0xff, 0xe2, 0xc2 */ ARM64(".byte 0xf8, 0xff, 0xe2, 0xc2");
    /* 0x0043aa84: sub      sp, sp, #0x50 */ ARM64("sub sp, sp, #0x50");
    /* 0x0043aa88: stp      x29, x30, [sp, #0x40] */ ARM64("stp x29, x30, [sp, #0x40]");
    /* 0x0043aa8c: add      x29, sp, #0x40 */ ARM64("add x29, sp, #0x40");
    /* 0x0043aa90: adrp     x8, #0xe5c000 */ ARM64("adrp x8, #0xe5c000");
    /* 0x0043aa94: ldr      x8, [x8, #0xd8] */ ARM64("ldr x8, [x8, #0xd8]");
    /* 0x0043aa98: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
    /* 0x0043aa9c: adrp     x9, #0xf0d000 */ ARM64("adrp x9, #0xf0d000");
    /* 0x0043aaa0: add      x9, x9, #0x198 */ ARM64("add x9, x9, #0x198");
    /* 0x0043aaa4: stur     x8, [x29, #-8] */ ARM64("stur x8, [x29, #-8]");
    /* 0x0043aaa8: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x0043aaac: ldr      x8, [x8, #0x60] */ ARM64("ldr x8, [x8, #0x60]");
    /* 0x0043aab0: adrp     x9, #0xd1e000 */ ARM64("adrp x9, #0xd1e000");
    /* 0x0043aab4: ldr      d0, [x9, #0xf70] */ ARM64("ldr d0, [x9, #0xf70]");
    /* 0x0043aab8: str      d0, [sp, #0x10] */ ARM64("str d0, [sp, #0x10]");
    /* 0x0043aabc: stp      xzr, xzr, [sp, #0x18] */ ARM64("stp xzr, xzr, [sp, #0x18]");
    /* 0x0043aac0: stur     xzr, [sp, #0x25] */ ARM64("stur xzr, [sp, #0x25]");
    /* 0x0043aac4: str      xzr, [sp, #8] */ ARM64("str xzr, [sp, #8]");
    /* 0x0043aac8: ldr      x9, [sp, #8] */ ARM64("ldr x9, [sp, #8]");
    /* 0x0043aacc: cmp      x9, #0x1c */ ARM64("cmp x9, #0x1c");
    /* 0x0043aad0: b.hi     #0x43ab68 */ if (COND_HI) goto loc_0043ab68;
    /* 0x0043aad4: mov      w9, #0x4ffa */ ARM64("mov w9, #0x4ffa");
    /* 0x0043aad8: movk     w9, #0xf0c4, lsl #16 */ ARM64("movk w9, #0xf0c4, lsl #16");
    /* 0x0043aadc: add      x10, sp, #0x10 */ ARM64("add x10, sp, #0x10");
    /* 0x0043aae0: mov      w11, #0x2a */ ARM64("mov w11, #0x2a");
loc_0043aae4:
    /* 0x0043aae4: ldr      x12, [sp, #8] */ ARM64("ldr x12, [sp, #8]");
    /* 0x0043aae8: ldrb     w12, [x10, x12] */ ARM64("ldrb w12, [x10, x12]");
    /* 0x0043aaec: ldr      x13, [sp, #8] */ ARM64("ldr x13, [sp, #8]");
    /* 0x0043aaf0: orn      w14, w9, w13 */ ARM64("orn w14, w9, w13");
    /* 0x0043aaf4: add      w14, w13, w14 */ ARM64("add w14, w13, w14");
    /* 0x0043aaf8: orr      w13, w13, w9 */ ARM64("orr w13, w13, w9");
    /* 0x0043aafc: add      w13, w14, w13 */ ARM64("add w13, w14, w13");
    /* 0x0043ab00: add      w13, w13, #1 */ ARM64("add w13, w13, #1");
    /* 0x0043ab04: add      w14, w13, w12 */ ARM64("add w14, w13, w12");
    /* 0x0043ab08: orr      w12, w12, w13 */ ARM64("orr w12, w12, w13");
    /* 0x0043ab0c: neg      w12, w12 */ ARM64("neg w12, w12");
    /* 0x0043ab10: eor      w13, w14, w12 */ ARM64("eor w13, w14, w12");
    /* 0x0043ab14: and      w12, w14, w12 */ ARM64("and w12, w14, w12");
    /* 0x0043ab18: lsl      w13, w13, #1 */ ARM64("lsl w13, w13, #1");
    /* 0x0043ab1c: add      w12, w13, w12, lsl #2 */ ARM64("add w12, w13, w12, lsl #2");
    /* 0x0043ab20: sub      w12, w14, w12 */ ARM64("sub w12, w14, w12");
    /* 0x0043ab24: eor      w13, w12, w11 */ ARM64("eor w13, w12, w11");
    /* 0x0043ab28: lsl      w12, w12, #1 */ ARM64("lsl w12, w12, #1");
    /* 0x0043ab2c: and      w12, w12, #0x55555555 */ ARM64("and w12, w12, #0x55555555");
    /* 0x0043ab30: add      w12, w13, w12 */ ARM64("add w12, w13, w12");
    /* 0x0043ab34: ldr      x13, [sp, #8] */ ARM64("ldr x13, [sp, #8]");
    /* 0x0043ab38: strb     w12, [x10, x13] */ ARM64("strb w12, [x10, x13]");
    /* 0x0043ab3c: ldr      x12, [sp, #8] */ ARM64("ldr x12, [sp, #8]");
    /* 0x0043ab40: mvn      x13, x12 */ ARM64("mvn x13, x12");
    /* 0x0043ab44: orr      x13, x13, #1 */ ARM64("orr x13, x13, #1");
    /* 0x0043ab48: orr      x14, x12, #1 */ ARM64("orr x14, x12, #1");
    /* 0x0043ab4c: add      x12, x12, x14 */ ARM64("add x12, x12, x14");
    /* 0x0043ab50: add      x12, x12, x13 */ ARM64("add x12, x12, x13");
    /* 0x0043ab54: add      x12, x12, #1 */ ARM64("add x12, x12, #1");
    /* 0x0043ab58: str      x12, [sp, #8] */ ARM64("str x12, [sp, #8]");
    /* 0x0043ab5c: ldr      x12, [sp, #8] */ ARM64("ldr x12, [sp, #8]");
    /* 0x0043ab60: cmp      x12, #0x1d */ ARM64("cmp x12, #0x1d");
    /* 0x0043ab64: b.lo     #0x43aae4 */ if (COND_LO) goto loc_0043aae4;
loc_0043ab68:
    /* 0x0043ab68: ldr      x9, [sp, #0x10] */ ARM64("ldr x9, [sp, #0x10]");
    /* 0x0043ab6c: ldr      x10, [x8, #0x100] */ ARM64("ldr x10, [x8, #0x100]");
    /* 0x0043ab70: orn      x11, x9, x10 */ ARM64("orn x11, x9, x10");
    /* 0x0043ab74: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x0043ab78: eor      x12, x10, x11 */ ARM64("eor x12, x10, x11");
    /* 0x0043ab7c: and      x10, x10, x11 */ ARM64("and x10, x10, x11");
    /* 0x0043ab80: add      x10, x12, x10, lsl #1 */ ARM64("add x10, x12, x10, lsl #1");
    /* 0x0043ab84: cmp      x10, x9 */ ARM64("cmp x10, x9");
    /* 0x0043ab88: b.ne     #0x43aba8 */ if (COND_NE) goto loc_0043aba8;
    /* 0x0043ab8c: ldr      x9, [x0, #0x58] */ ARM64("ldr x9, [x0, #0x58]");
    /* 0x0043ab90: ldr      d0, [x8, #0x660] */ ARM64("ldr d0, [x8, #0x660]");
    /* 0x0043ab94: scvtf    d0, d0 */ ARM64("scvtf d0, d0");
    /* 0x0043ab98: str      d0, [x9] */ ARM64("str d0, [x9]");
    /* 0x0043ab9c: mov      w8, #3 */ ARM64("mov w8, #3");
    /* 0x0043aba0: str      w8, [x9, #0xc] */ ARM64("str w8, [x9, #0xc]");
    /* 0x0043aba4: b        #0x43ac60 */ goto loc_0043ac60;
loc_0043aba8:
    /* 0x0043aba8: stp      xzr, xzr, [sp, #0x10] */ ARM64("stp xzr, xzr, [sp, #0x10]");
    /* 0x0043abac: stur     xzr, [sp, #0x27] */ ARM64("stur xzr, [sp, #0x27]");
    /* 0x0043abb0: str      xzr, [sp, #0x20] */ ARM64("str xzr, [sp, #0x20]");
    /* 0x0043abb4: adrp     x8, #0xd0d000 */ ARM64("adrp x8, #0xd0d000");
    /* 0x0043abb8: ldr      d0, [x8, #0x7e0] */ ARM64("ldr d0, [x8, #0x7e0]");
    /* 0x0043abbc: str      s0, [sp, #0x10] */ ARM64("str s0, [sp, #0x10]");
    /* 0x0043abc0: str      xzr, [sp, #8] */ ARM64("str xzr, [sp, #8]");
    /* 0x0043abc4: ldr      x8, [sp, #8] */ ARM64("ldr x8, [sp, #8]");
    /* 0x0043abc8: cmp      x8, #0x1e */ ARM64("cmp x8, #0x1e");
    /* 0x0043abcc: b.hi     #0x43ac44 */ if (COND_HI) goto loc_0043ac44;
    /* 0x0043abd0: mov      w8, #0x5b91 */ ARM64("mov w8, #0x5b91");
    /* 0x0043abd4: movk     w8, #0x19a1, lsl #16 */ ARM64("movk w8, #0x19a1, lsl #16");
    /* 0x0043abd8: add      x9, sp, #0x10 */ ARM64("add x9, sp, #0x10");
loc_0043abdc:
    /* 0x0043abdc: ldr      x10, [sp, #8] */ ARM64("ldr x10, [sp, #8]");
    /* 0x0043abe0: ldrb     w10, [x9, x10] */ ARM64("ldrb w10, [x9, x10]");
    /* 0x0043abe4: ldr      x11, [sp, #8] */ ARM64("ldr x11, [sp, #8]");
    /* 0x0043abe8: orn      w12, w8, w11 */ ARM64("orn w12, w8, w11");
    /* 0x0043abec: and      w13, w11, w8 */ ARM64("and w13, w11, w8");
    /* 0x0043abf0: sub      w12, w12, w13 */ ARM64("sub w12, w12, w13");
    /* 0x0043abf4: add      w12, w8, w12 */ ARM64("add w12, w8, w12");
    /* 0x0043abf8: add      w11, w12, w11, lsl #1 */ ARM64("add w11, w12, w11, lsl #1");
    /* 0x0043abfc: add      w12, w11, #2 */ ARM64("add w12, w11, #2");
    /* 0x0043ac00: add      w11, w11, #0x81 */ ARM64("add w11, w11, #0x81");
    /* 0x0043ac04: eor      w13, w12, w10 */ ARM64("eor w13, w12, w10");
    /* 0x0043ac08: and      w12, w12, w10 */ ARM64("and w12, w12, w10");
    /* 0x0043ac0c: add      w12, w13, w12, lsl #1 */ ARM64("add w12, w13, w12, lsl #1");
    /* 0x0043ac10: mvn      w13, w12 */ ARM64("mvn w13, w12");
    /* 0x0043ac14: and      w10, w11, w10 */ ARM64("and w10, w11, w10");
    /* 0x0043ac18: sub      w10, w13, w10, lsl #1 */ ARM64("sub w10, w13, w10, lsl #1");
    /* 0x0043ac1c: add      w10, w10, w12, lsl #1 */ ARM64("add w10, w10, w12, lsl #1");
    /* 0x0043ac20: add      w10, w10, #9 */ ARM64("add w10, w10, #9");
    /* 0x0043ac24: ldr      x11, [sp, #8] */ ARM64("ldr x11, [sp, #8]");
    /* 0x0043ac28: strb     w10, [x9, x11] */ ARM64("strb w10, [x9, x11]");
    /* 0x0043ac2c: ldr      x10, [sp, #8] */ ARM64("ldr x10, [sp, #8]");
    /* 0x0043ac30: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x0043ac34: str      x10, [sp, #8] */ ARM64("str x10, [sp, #8]");
    /* 0x0043ac38: ldr      x10, [sp, #8] */ ARM64("ldr x10, [sp, #8]");
    /* 0x0043ac3c: cmp      x10, #0x1f */ ARM64("cmp x10, #0x1f");
    /* 0x0043ac40: b.lo     #0x43abdc */ if (COND_LO) goto loc_0043abdc;
loc_0043ac44:
    /* 0x0043ac44: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0043ac48: ldr      s0, [sp, #0x10] */ ARM64("ldr s0, [sp, #0x10]");
    /* 0x0043ac4c: sshll    v0.2d, v0.2s, #0 */ ARM64("sshll v0.2d, v0.2s, #0");
    /* 0x0043ac50: scvtf    d0, d0 */ ARM64("scvtf d0, d0");
    /* 0x0043ac54: str      d0, [x8] */ ARM64("str d0, [x8]");
    /* 0x0043ac58: mov      w9, #3 */ ARM64("mov w9, #3");
    /* 0x0043ac5c: str      w9, [x8, #0xc] */ ARM64("str w9, [x8, #0xc]");
loc_0043ac60:
    /* 0x0043ac60: ldr      x8, [x0, #0x58] */ ARM64("ldr x8, [x0, #0x58]");
    /* 0x0043ac64: add      x8, x8, #0x10 */ ARM64("add x8, x8, #0x10");
    /* 0x0043ac68: str      x8, [x0, #0x58] */ ARM64("str x8, [x0, #0x58]");
    /* 0x0043ac6c: ldur     x8, [x29, #-8] */ ARM64("ldur x8, [x29, #-8]");
    /* 0x0043ac70: adrp     x9, #0xe5c000 */ ARM64("adrp x9, #0xe5c000");
    /* 0x0043ac74: ldr      x9, [x9, #0xd8] */ ARM64("ldr x9, [x9, #0xd8]");
    /* 0x0043ac78: ldr      x9, [x9] */ ARM64("ldr x9, [x9]");
    /* 0x0043ac7c: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x0043ac80: b.ne     #0x43ac94 */ if (COND_NE) goto loc_0043ac94;
    /* 0x0043ac84: mov      w0, #1 */ ARM64("mov w0, #1");
    /* 0x0043ac88: ldp      x29, x30, [sp, #0x40] */ ARM64("ldp x29, x30, [sp, #0x40]");
    /* 0x0043ac8c: add      sp, sp, #0x50 */ ARM64("add sp, sp, #0x50");
    /* 0x0043ac90: ret       */ return;
loc_0043ac94:
    /* 0x0043ac94: bl       #0xc7a904 */ CALL_DIRECT(sub_00c7a904);
}
