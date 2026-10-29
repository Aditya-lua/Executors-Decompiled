/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xb8ce50..0xb91d48 (20216 bytes). */
#include "../lift_runtime.hpp"

void sub_00b8ce50(Arm64Context& cpu) {
    /* 0x00b8ce50: stp      x28, x27, [sp, #-0x60]! */ ARM64("stp x28, x27, [sp, #-0x60]!");
    /* 0x00b8ce54: stp      x26, x25, [sp, #0x10] */ ARM64("stp x26, x25, [sp, #0x10]");
    /* 0x00b8ce58: stp      x24, x23, [sp, #0x20] */ ARM64("stp x24, x23, [sp, #0x20]");
    /* 0x00b8ce5c: stp      x22, x21, [sp, #0x30] */ ARM64("stp x22, x21, [sp, #0x30]");
    /* 0x00b8ce60: stp      x20, x19, [sp, #0x40] */ ARM64("stp x20, x19, [sp, #0x40]");
    /* 0x00b8ce64: stp      x29, x30, [sp, #0x50] */ ARM64("stp x29, x30, [sp, #0x50]");
    /* 0x00b8ce68: add      x29, sp, #0x50 */ ARM64("add x29, sp, #0x50");
    /* 0x00b8ce6c: sub      sp, sp, #0x510 */ ARM64("sub sp, sp, #0x510");
    /* 0x00b8ce70: str      xzr, [sp] */ ARM64("str xzr, [sp]");
    /* 0x00b8ce74: mov      x21, x2 */ ARM64("mov x21, x2");
    /* 0x00b8ce78: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00b8ce7c: mov      x2, #0 */ ARM64("mov x2, #0");
    /* 0x00b8ce80: bl       #0xb91d48 */ CALL_DIRECT(sub_00b91d48);
    /* 0x00b8ce84: str      w0, [sp, #0xd0] */ ARM64("str w0, [sp, #0xd0]");
    /* 0x00b8ce88: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b8ce8c: str      xzr, [sp, #0x430] */ ARM64("str xzr, [sp, #0x430]");
    /* 0x00b8ce90: str      x8, [sp, #0x438] */ ARM64("str x8, [sp, #0x438]");
    /* 0x00b8ce94: str      xzr, [sp, #0x440] */ ARM64("str xzr, [sp, #0x440]");
    /* 0x00b8ce98: adrp     x0, #0xf0b000 */ ARM64("adrp x0, #0xf0b000");
    /* 0x00b8ce9c: add      x0, x0, #0x210 */ ARM64("add x0, x0, #0x210");
    /* 0x00b8cea0: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00b8cea4: blr      x8 */ CALL_INDIRECT(x8);
    /* 0x00b8cea8: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b8ceac: ldrb     w8, [x0, #0x10] */ ARM64("ldrb w8, [x0, #0x10]");
    /* 0x00b8ceb0: tbz      w8, #0, #0xb908b0 */ if (((w8 >> #0) & 1) == 0) goto loc_00b908b0;
loc_00b8ceb4:
    /* 0x00b8ceb4: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b8ceb8: add      x8, x8, #0x958 */ ARM64("add x8, x8, #0x958");
    /* 0x00b8cebc: ldp      q0, q1, [x8] */ ARM64("ldp q0, q1, [x8]");
    /* 0x00b8cec0: stp      q1, q0, [sp, #0xe0] */ ARM64("stp q1, q0, [sp, #0xe0]");
    /* 0x00b8cec4: stp      q0, q1, [x29, #-0xf0] */ ARM64("stp q0, q1, [x29, #-0xf0]");
    /* 0x00b8cec8: ldr      q0, [x28] */ ARM64("ldr q0, [x28]");
    /* 0x00b8cecc: ldr      x8, [x28] */ ARM64("ldr x8, [x28]");
    /* 0x00b8ced0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8ced4: str      x8, [x28] */ ARM64("str x8, [x28]");
    /* 0x00b8ced8: stur     q0, [x29, #-0xd0] */ ARM64("stur q0, [x29, #-0xd0]");
    /* 0x00b8cedc: ldr      x20, [x25, #0x10] */ ARM64("ldr x20, [x25, #0x10]");
    /* 0x00b8cee0: add      x8, x20, #0x1f */ ARM64("add x8, x20, #0x1f");
    /* 0x00b8cee4: lsr      x19, x8, #5 */ ARM64("lsr x19, x8, #5");
    /* 0x00b8cee8: str      x25, [sp, #0x110] */ ARM64("str x25, [sp, #0x110]");
    /* 0x00b8ceec: str      x21, [sp, #0xa0] */ ARM64("str x21, [sp, #0xa0]");
    /* 0x00b8cef0: cbz      x20, #0xb8cf40 */ if (x20 == 0) goto loc_00b8cf40;
    /* 0x00b8cef4: lsl      x24, x19, #2 */ ARM64("lsl x24, x19, #2");
    /* 0x00b8cef8: cbz      x19, #0xb8d7d0 */ if (x19 == 0) goto loc_00b8d7d0;
    /* 0x00b8cefc: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b8cf00: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b8cf04: bl       #0xc7a9dc */ CALL_DIRECT(sub_00c7a9dc);
    /* 0x00b8cf08: cbz      x0, #0xb90e20 */ if (x0 == 0) goto loc_00b90e20;
    /* 0x00b8cf0c: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b8cf10: add      x8, x20, #0x1f */ ARM64("add x8, x20, #0x1f");
    /* 0x00b8cf14: lsr      x22, x8, #5 */ ARM64("lsr x22, x8, #5");
    /* 0x00b8cf18: lsl      x24, x22, #2 */ ARM64("lsl x24, x22, #2");
    /* 0x00b8cf1c: mov      x23, x20 */ ARM64("mov x23, x20");
loc_00b8cf20:
    /* 0x00b8cf20: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b8cf24: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b8cf28: bl       #0xc7a9dc */ CALL_DIRECT(sub_00c7a9dc);
    /* 0x00b8cf2c: cbnz     x0, #0xb8cf50 */ if (x0 != 0) goto loc_00b8cf50;
loc_00b8cf30:
    /* 0x00b8cf30: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b8cf34: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b8cf38: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b8cf3c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b8cf40:
    /* 0x00b8cf40: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b8cf44: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00b8cf48: mov      w21, #4 */ ARM64("mov w21, #4");
loc_00b8cf4c:
    /* 0x00b8cf4c: mov      w0, #4 */ ARM64("mov w0, #4");
loc_00b8cf50:
    /* 0x00b8cf50: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b8cf54: str      xzr, [sp, #0x320] */ ARM64("str xzr, [sp, #0x320]");
    /* 0x00b8cf58: str      x8, [sp, #0x328] */ ARM64("str x8, [sp, #0x328]");
    /* 0x00b8cf5c: str      x21, [sp, #0x340] */ ARM64("str x21, [sp, #0x340]");
    /* 0x00b8cf60: str      x19, [sp, #0x348] */ ARM64("str x19, [sp, #0x348]");
    /* 0x00b8cf64: str      x20, [sp, #0x350] */ ARM64("str x20, [sp, #0x350]");
    /* 0x00b8cf68: str      x22, [sp, #0x358] */ ARM64("str x22, [sp, #0x358]");
    /* 0x00b8cf6c: str      x0, [sp, #0x360] */ ARM64("str x0, [sp, #0x360]");
    /* 0x00b8cf70: str      x22, [sp, #0x368] */ ARM64("str x22, [sp, #0x368]");
    /* 0x00b8cf74: str      x23, [sp, #0x370] */ ARM64("str x23, [sp, #0x370]");
    /* 0x00b8cf78: str      x19, [sp, #0x338] */ ARM64("str x19, [sp, #0x338]");
    /* 0x00b8cf7c: str      xzr, [sp, #0x330] */ ARM64("str xzr, [sp, #0x330]");
    /* 0x00b8cf80: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b8cf84: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b8cf88: ldr      x8, [sp, #0x328] */ ARM64("ldr x8, [sp, #0x328]");
    /* 0x00b8cf8c: ldr      w9, [sp, #0xd0] */ ARM64("ldr w9, [sp, #0xd0]");
    /* 0x00b8cf90: str      w9, [x8] */ ARM64("str w9, [x8]");
    /* 0x00b8cf94: mov      w20, #1 */ ARM64("mov w20, #1");
    /* 0x00b8cf98: str      x20, [sp, #0x330] */ ARM64("str x20, [sp, #0x330]");
    /* 0x00b8cf9c: ldp      q0, q1, [sp, #0x340] */ ARM64("ldp q0, q1, [sp, #0x340]");
    /* 0x00b8cfa0: stp      q0, q1, [sp, #0x230] */ ARM64("stp q0, q1, [sp, #0x230]");
    /* 0x00b8cfa4: ldr      q0, [sp, #0x360] */ ARM64("ldr q0, [sp, #0x360]");
    /* 0x00b8cfa8: str      q0, [sp, #0x250] */ ARM64("str q0, [sp, #0x250]");
    /* 0x00b8cfac: ldr      x8, [sp, #0x370] */ ARM64("ldr x8, [sp, #0x370]");
    /* 0x00b8cfb0: ldp      q1, q0, [sp, #0x320] */ ARM64("ldp q1, q0, [sp, #0x320]");
    /* 0x00b8cfb4: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8cfb8: str      x8, [sp, #0x260] */ ARM64("str x8, [sp, #0x260]");
    /* 0x00b8cfbc: str      x25, [sp, #0x268] */ ARM64("str x25, [sp, #0x268]");
    /* 0x00b8cfc0: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b8cfc4: str      x28, [sp, #0xd8] */ ARM64("str x28, [sp, #0xd8]");
    /* 0x00b8cfc8: mov      x19, #0 */ ARM64("mov x19, #0");
    /* 0x00b8cfcc: cbz      x8, #0xb8d6c0 */ if (x8 == 0) goto loc_00b8d6c0;
    /* 0x00b8cfd0: add      x9, sp, #0x210 */ ARM64("add x9, sp, #0x210");
    /* 0x00b8cfd4: add      x10, x9, #0x30 */ ARM64("add x10, x9, #0x30");
    /* 0x00b8cfd8: add      x9, x9, #0x50 */ ARM64("add x9, x9, #0x50");
    /* 0x00b8cfdc: stp      x9, x10, [sp, #0xb0] */ ARM64("stp x9, x10, [sp, #0xb0]");
    /* 0x00b8cfe0: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b8cfe4: str      x9, [sp, #0x108] */ ARM64("str x9, [sp, #0x108]");
    /* 0x00b8cfe8: mov      x22, x25 */ ARM64("mov x22, x25");
    /* 0x00b8cfec: b        #0xb8cff8 */ goto loc_00b8cff8;
loc_00b8cff0:
    /* 0x00b8cff0: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b8cff4: cbz      x8, #0xb8d6c8 */ if (x8 == 0) goto loc_00b8d6c8;
loc_00b8cff8:
    /* 0x00b8cff8: ldr      x9, [sp, #0x218] */ ARM64("ldr x9, [sp, #0x218]");
    /* 0x00b8cffc: ldr      x10, [sp, #0x240] */ ARM64("ldr x10, [sp, #0x240]");
    /* 0x00b8d000: add      x8, x9, x8, lsl #2 */ ARM64("add x8, x9, x8, lsl #2");
    /* 0x00b8d004: ldur     w25, [x8, #-4] */ ARM64("ldur w25, [x8, #-4]");
    /* 0x00b8d008: str      x25, [sp, #0x3f0] */ ARM64("str x25, [sp, #0x3f0]");
    /* 0x00b8d00c: cmp      x10, x25 */ ARM64("cmp x10, x25");
    /* 0x00b8d010: b.ls     #0xb9071c */ if (COND_LS) goto loc_00b9071c;
    /* 0x00b8d014: lsr      x8, x25, #5 */ ARM64("lsr x8, x25, #5");
    /* 0x00b8d018: ldr      x10, [sp, #0x230] */ ARM64("ldr x10, [sp, #0x230]");
    /* 0x00b8d01c: ldr      w11, [x10, x8, lsl #2] */ ARM64("ldr w11, [x10, x8, lsl #2]");
    /* 0x00b8d020: lsl      w9, w20, w25 */ ARM64("lsl w9, w20, w25");
    /* 0x00b8d024: orr      w12, w11, w9 */ ARM64("orr w12, w11, w9");
    /* 0x00b8d028: str      w12, [x10, x8, lsl #2] */ ARM64("str w12, [x10, x8, lsl #2]");
    /* 0x00b8d02c: tst      w11, w9 */ ARM64("tst w11, w9");
    /* 0x00b8d030: b.eq     #0xb8d0b8 */ if (COND_EQ) goto loc_00b8d0b8;
    /* 0x00b8d034: ldr      x10, [sp, #0x220] */ ARM64("ldr x10, [sp, #0x220]");
    /* 0x00b8d038: cbz      x10, #0xb8d044 */ if (x10 == 0) goto loc_00b8d044;
    /* 0x00b8d03c: sub      x10, x10, #1 */ ARM64("sub x10, x10, #1");
    /* 0x00b8d040: str      x10, [sp, #0x220] */ ARM64("str x10, [sp, #0x220]");
loc_00b8d044:
    /* 0x00b8d044: str      x25, [sp, #0x3f0] */ ARM64("str x25, [sp, #0x3f0]");
    /* 0x00b8d048: ldr      x10, [sp, #0x260] */ ARM64("ldr x10, [sp, #0x260]");
    /* 0x00b8d04c: cmp      x10, x25 */ ARM64("cmp x10, x25");
    /* 0x00b8d050: b.ls     #0xb907f4 */ if (COND_LS) goto loc_00b907f4;
    /* 0x00b8d054: ldr      x10, [sp, #0x250] */ ARM64("ldr x10, [sp, #0x250]");
    /* 0x00b8d058: ldr      w11, [x10, x8, lsl #2] */ ARM64("ldr w11, [x10, x8, lsl #2]");
    /* 0x00b8d05c: orr      w12, w11, w9 */ ARM64("orr w12, w11, w9");
    /* 0x00b8d060: str      w12, [x10, x8, lsl #2] */ ARM64("str w12, [x10, x8, lsl #2]");
    /* 0x00b8d064: tst      w11, w9 */ ARM64("tst w11, w9");
    /* 0x00b8d068: b.ne     #0xb8cff0 */ if (COND_NE) goto loc_00b8cff0;
    /* 0x00b8d06c: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00b8d070: cmp      x19, x8 */ ARM64("cmp x19, x8");
    /* 0x00b8d074: b.ne     #0xb8d088 */ if (COND_NE) goto loc_00b8d088;
    /* 0x00b8d078: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00b8d07c: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b8d080: ldr      x8, [sp, #0x438] */ ARM64("ldr x8, [sp, #0x438]");
    /* 0x00b8d084: str      x8, [sp, #0x108] */ ARM64("str x8, [sp, #0x108]");
loc_00b8d088:
    /* 0x00b8d088: ldp      x8, x9, [sp, #0x108] */ ARM64("ldp x8, x9, [sp, #0x108]");
    /* 0x00b8d08c: str      w25, [x8, x19, lsl #2] */ ARM64("str w25, [x8, x19, lsl #2]");
    /* 0x00b8d090: add      x19, x19, #1 */ ARM64("add x19, x19, #1");
    /* 0x00b8d094: str      x19, [sp, #0x440] */ ARM64("str x19, [sp, #0x440]");
    /* 0x00b8d098: ldr      x8, [x9, #0x10] */ ARM64("ldr x8, [x9, #0x10]");
    /* 0x00b8d09c: cmp      x8, x25 */ ARM64("cmp x8, x25");
    /* 0x00b8d0a0: b.ls     #0xb8d164 */ if (COND_LS) goto loc_00b8d164;
    /* 0x00b8d0a4: ldr      x8, [x9, #8] */ ARM64("ldr x8, [x9, #8]");
    /* 0x00b8d0a8: mov      w10, #0x18 */ ARM64("mov w10, #0x18");
    /* 0x00b8d0ac: umaddl   x8, w25, w10, x8 */ ARM64("umaddl x8, w25, w10, x8");
    /* 0x00b8d0b0: ldr      w10, [x8, #0x10] */ ARM64("ldr w10, [x8, #0x10]");
    /* 0x00b8d0b4: b        #0xb8d168 */ goto loc_00b8d168;
loc_00b8d0b8:
    /* 0x00b8d0b8: ldr      x8, [x22, #0x10] */ ARM64("ldr x8, [x22, #0x10]");
    /* 0x00b8d0bc: cmp      x8, x25 */ ARM64("cmp x8, x25");
    /* 0x00b8d0c0: b.ls     #0xb8d0d8 */ if (COND_LS) goto loc_00b8d0d8;
    /* 0x00b8d0c4: ldr      x8, [x22, #8] */ ARM64("ldr x8, [x22, #8]");
    /* 0x00b8d0c8: mov      w9, #0x18 */ ARM64("mov w9, #0x18");
    /* 0x00b8d0cc: umaddl   x8, w25, w9, x8 */ ARM64("umaddl x8, w25, w9, x8");
    /* 0x00b8d0d0: ldr      w21, [x8, #0x10] */ ARM64("ldr w21, [x8, #0x10]");
    /* 0x00b8d0d4: b        #0xb8d0dc */ goto loc_00b8d0dc;
loc_00b8d0d8:
    /* 0x00b8d0d8: mov      w21, #-1 */ ARM64("mov w21, #-1");
loc_00b8d0dc:
    /* 0x00b8d0dc: ldp      x23, x24, [x22, #0x20] */ ARM64("ldp x23, x24, [x22, #0x20]");
    /* 0x00b8d0e0: mov      w25, #-1 */ ARM64("mov w25, #-1");
    /* 0x00b8d0e4: b        #0xb8d0f8 */ goto loc_00b8d0f8;
loc_00b8d0e8:
    /* 0x00b8d0e8: ldr      x8, [sp, #0x218] */ ARM64("ldr x8, [sp, #0x218]");
    /* 0x00b8d0ec: str      w26, [x8, x27, lsl #2] */ ARM64("str w26, [x8, x27, lsl #2]");
    /* 0x00b8d0f0: add      x8, x27, #1 */ ARM64("add x8, x27, #1");
    /* 0x00b8d0f4: str      x8, [sp, #0x220] */ ARM64("str x8, [sp, #0x220]");
loc_00b8d0f8:
    /* 0x00b8d0f8: cmp      x24, x21 */ ARM64("cmp x24, x21");
    /* 0x00b8d0fc: b.ls     #0xb8d110 */ if (COND_LS) goto loc_00b8d110;
    /* 0x00b8d100: add      x8, x23, x21, lsl #4 */ ARM64("add x8, x23, x21, lsl #4");
    /* 0x00b8d104: ldr      w21, [x8] */ ARM64("ldr w21, [x8]");
    /* 0x00b8d108: ldr      w26, [x8, #0xc] */ ARM64("ldr w26, [x8, #0xc]");
    /* 0x00b8d10c: b        #0xb8d128 */ goto loc_00b8d128;
loc_00b8d110:
    /* 0x00b8d110: cmp      x24, x25 */ ARM64("cmp x24, x25");
    /* 0x00b8d114: b.ls     #0xb8cff0 */ if (COND_LS) goto loc_00b8cff0;
    /* 0x00b8d118: add      x8, x23, x25, lsl #4 */ ARM64("add x8, x23, x25, lsl #4");
    /* 0x00b8d11c: ldp      w25, w26, [x8, #4] */ ARM64("ldp w25, w26, [x8, #4]");
    /* 0x00b8d120: cmn      w26, #1 */ ARM64("cmn w26, #1");
    /* 0x00b8d124: b.eq     #0xb8d110 */ if (COND_EQ) goto loc_00b8d110;
loc_00b8d128:
    /* 0x00b8d128: ldr      x9, [sp, #0x238] */ ARM64("ldr x9, [sp, #0x238]");
    /* 0x00b8d12c: lsr      w8, w26, #5 */ ARM64("lsr w8, w26, #5");
    /* 0x00b8d130: cmp      x9, x8 */ ARM64("cmp x9, x8");
    /* 0x00b8d134: b.ls     #0xb8d148 */ if (COND_LS) goto loc_00b8d148;
    /* 0x00b8d138: ldr      x9, [sp, #0x230] */ ARM64("ldr x9, [sp, #0x230]");
    /* 0x00b8d13c: ldr      w8, [x9, x8, lsl #2] */ ARM64("ldr w8, [x9, x8, lsl #2]");
    /* 0x00b8d140: lsr      w8, w8, w26 */ ARM64("lsr w8, w8, w26");
    /* 0x00b8d144: tbnz     w8, #0, #0xb8d0f8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8d0f8;
loc_00b8d148:
    /* 0x00b8d148: ldr      x27, [sp, #0x220] */ ARM64("ldr x27, [sp, #0x220]");
    /* 0x00b8d14c: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b8d150: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00b8d154: b.ne     #0xb8d0e8 */ if (COND_NE) goto loc_00b8d0e8;
    /* 0x00b8d158: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8d15c: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b8d160: b        #0xb8d0e8 */ goto loc_00b8d0e8;
loc_00b8d164:
    /* 0x00b8d164: mov      w10, #-1 */ ARM64("mov w10, #-1");
loc_00b8d168:
    /* 0x00b8d168: ldp      x22, x28, [x9, #0x20] */ ARM64("ldp x22, x28, [x9, #0x20]");
    /* 0x00b8d16c: mov      x8, #0x6573 */ ARM64("mov x8, #0x6573");
    /* 0x00b8d170: movk     x8, #0x7974, lsl #16 */ ARM64("movk x8, #0x7974, lsl #16");
    /* 0x00b8d174: movk     x8, #0x6462, lsl #32 */ ARM64("movk x8, #0x6462, lsl #32");
    /* 0x00b8d178: movk     x8, #0x7065, lsl #48 */ ARM64("movk x8, #0x7065, lsl #48");
    /* 0x00b8d17c: eor      x8, x25, x8 */ ARM64("eor x8, x25, x8");
    /* 0x00b8d180: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00b8d184: mov      w24, #-1 */ ARM64("mov w24, #-1");
    /* 0x00b8d188: str      x19, [sp, #0x118] */ ARM64("str x19, [sp, #0x118]");
    /* 0x00b8d18c: cmp      x28, x10 */ ARM64("cmp x28, x10");
    /* 0x00b8d190: b.hi     #0xb8d29c */ if (COND_HI) goto loc_00b8d29c;
loc_00b8d194:
    /* 0x00b8d194: cmp      x28, x24 */ ARM64("cmp x28, x24");
    /* 0x00b8d198: b.ls     #0xb8d6ac */ if (COND_LS) goto loc_00b8d6ac;
    /* 0x00b8d19c: add      x8, x22, x24, lsl #4 */ ARM64("add x8, x22, x24, lsl #4");
    /* 0x00b8d1a0: ldp      w24, w23, [x8, #4] */ ARM64("ldp w24, w23, [x8, #4]");
    /* 0x00b8d1a4: cmn      w23, #1 */ ARM64("cmn w23, #1");
    /* 0x00b8d1a8: b.eq     #0xb8d194 */ if (COND_EQ) goto loc_00b8d194;
    /* 0x00b8d1ac: str      x10, [sp, #0xc8] */ ARM64("str x10, [sp, #0xc8]");
    /* 0x00b8d1b0: b        #0xb8d2ac */ goto loc_00b8d2ac;
loc_00b8d1b4:
    /* 0x00b8d1b4: and      x14, x14, x11 */ ARM64("and x14, x14, x11");
    /* 0x00b8d1b8: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b8d1bc: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8d1c0: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b8d1c4: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8d1c8: b.eq     #0xb8d1f8 */ if (COND_EQ) goto loc_00b8d1f8;
loc_00b8d1cc:
    /* 0x00b8d1cc: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b8d1d0: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b8d1d4: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b8d1d8: and      x16, x16, x11 */ ARM64("and x16, x16, x11");
    /* 0x00b8d1dc: sub      x16, x9, x16, lsl #2 */ ARM64("sub x16, x9, x16, lsl #2");
    /* 0x00b8d1e0: ldur     w16, [x16, #-4] */ ARM64("ldur w16, [x16, #-4]");
    /* 0x00b8d1e4: cmp      w25, w16 */ ARM64("cmp w25, w16");
    /* 0x00b8d1e8: b.eq     #0xb8d244 */ if (COND_EQ) goto loc_00b8d244;
    /* 0x00b8d1ec: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b8d1f0: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b8d1f4: b.ne     #0xb8d1cc */ if (COND_NE) goto loc_00b8d1cc;
loc_00b8d1f8:
    /* 0x00b8d1f8: cmp      x12, #1 */ ARM64("cmp x12, #1");
    /* 0x00b8d1fc: b.eq     #0xb8d21c */ if (COND_EQ) goto loc_00b8d21c;
    /* 0x00b8d200: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b8d204: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8d208: cbz      x12, #0xb8d238 */ if (x12 == 0) goto loc_00b8d238;
    /* 0x00b8d20c: rbit     x12, x12 */ ARM64("rbit x12, x12");
    /* 0x00b8d210: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b8d214: add      x12, x14, x12, lsr #3 */ ARM64("add x12, x14, x12, lsr #3");
    /* 0x00b8d218: and      x13, x12, x11 */ ARM64("and x13, x12, x11");
loc_00b8d21c:
    /* 0x00b8d21c: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b8d220: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b8d224: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8d228: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b8d22c: tbnz     w12, #0, #0xb8d254 */ if (((w12 >> #0) & 1) != 0) goto loc_00b8d254;
    /* 0x00b8d230: mov      w12, #1 */ ARM64("mov w12, #1");
    /* 0x00b8d234: b        #0xb8d238 */ goto loc_00b8d238;
loc_00b8d238:
    /* 0x00b8d238: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8d23c: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b8d240: b        #0xb8d1b4 */ goto loc_00b8d1b4;
loc_00b8d244:
    /* 0x00b8d244: ldr      x10, [sp, #0xc8] */ ARM64("ldr x10, [sp, #0xc8]");
    /* 0x00b8d248: cmp      x28, x10 */ ARM64("cmp x28, x10");
    /* 0x00b8d24c: b.ls     #0xb8d194 */ if (COND_LS) goto loc_00b8d194;
    /* 0x00b8d250: b        #0xb8d29c */ goto loc_00b8d29c;
loc_00b8d254:
    /* 0x00b8d254: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b8d258: tbz      w8, #0x1f, #0xb8d68c */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b8d68c;
loc_00b8d25c:
    /* 0x00b8d25c: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b8d260: sub      x12, x13, #8 */ ARM64("sub x12, x13, #8");
    /* 0x00b8d264: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b8d268: strb     w10, [x9, x13] */ ARM64("strb w10, [x9, x13]");
    /* 0x00b8d26c: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b8d270: strb     w10, [x11, #8] */ ARM64("strb w10, [x11, #8]");
    /* 0x00b8d274: ldur     q0, [x26, #-0x20] */ ARM64("ldur q0, [x26, #-0x20]");
    /* 0x00b8d278: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00b8d27c: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00b8d280: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00b8d284: stur     q0, [x26, #-0x20] */ ARM64("stur q0, [x26, #-0x20]");
    /* 0x00b8d288: sub      x8, x9, x13, lsl #2 */ ARM64("sub x8, x9, x13, lsl #2");
    /* 0x00b8d28c: stur     w25, [x8, #-4] */ ARM64("stur w25, [x8, #-4]");
    /* 0x00b8d290: ldr      x10, [sp, #0xc8] */ ARM64("ldr x10, [sp, #0xc8]");
    /* 0x00b8d294: cmp      x28, x10 */ ARM64("cmp x28, x10");
    /* 0x00b8d298: b.ls     #0xb8d194 */ if (COND_LS) goto loc_00b8d194;
loc_00b8d29c:
    /* 0x00b8d29c: add      x8, x22, x10, lsl #4 */ ARM64("add x8, x22, x10, lsl #4");
    /* 0x00b8d2a0: ldr      w9, [x8] */ ARM64("ldr w9, [x8]");
    /* 0x00b8d2a4: str      x9, [sp, #0xc8] */ ARM64("str x9, [sp, #0xc8]");
    /* 0x00b8d2a8: ldr      w23, [x8, #0xc] */ ARM64("ldr w23, [x8, #0xc]");
loc_00b8d2ac:
    /* 0x00b8d2ac: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8d2b0: ldp      x9, x10, [x29, #-0xd0] */ ARM64("ldp x9, x10, [x29, #-0xd0]");
    /* 0x00b8d2b4: mov      x11, #0x6575 */ ARM64("mov x11, #0x6575");
    /* 0x00b8d2b8: movk     x11, #0x7073, lsl #16 */ ARM64("movk x11, #0x7073, lsl #16");
    /* 0x00b8d2bc: movk     x11, #0x6d65, lsl #32 */ ARM64("movk x11, #0x6d65, lsl #32");
    /* 0x00b8d2c0: movk     x11, #0x736f, lsl #48 */ ARM64("movk x11, #0x736f, lsl #48");
    /* 0x00b8d2c4: eor      x11, x9, x11 */ ARM64("eor x11, x9, x11");
    /* 0x00b8d2c8: mov      x12, #0x6f6d */ ARM64("mov x12, #0x6f6d");
    /* 0x00b8d2cc: movk     x12, #0x6e64, lsl #16 */ ARM64("movk x12, #0x6e64, lsl #16");
    /* 0x00b8d2d0: movk     x12, #0x7261, lsl #32 */ ARM64("movk x12, #0x7261, lsl #32");
    /* 0x00b8d2d4: movk     x12, #0x646f, lsl #48 */ ARM64("movk x12, #0x646f, lsl #48");
    /* 0x00b8d2d8: eor      x12, x10, x12 */ ARM64("eor x12, x10, x12");
    /* 0x00b8d2dc: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00b8d2e0: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00b8d2e4: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00b8d2e8: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00b8d2ec: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b8d2f0: orr      x13, x23, #0x400000000000000 */ ARM64("orr x13, x23, #0x400000000000000");
    /* 0x00b8d2f4: mov      x14, #0x6573 */ ARM64("mov x14, #0x6573");
    /* 0x00b8d2f8: movk     x14, #0x7974, lsl #16 */ ARM64("movk x14, #0x7974, lsl #16");
    /* 0x00b8d2fc: movk     x14, #0x6462, lsl #32 */ ARM64("movk x14, #0x6462, lsl #32");
    /* 0x00b8d300: movk     x14, #0x7465, lsl #48 */ ARM64("movk x14, #0x7465, lsl #48");
    /* 0x00b8d304: eor      x10, x10, x14 */ ARM64("eor x10, x10, x14");
    /* 0x00b8d308: eor      x10, x10, x13 */ ARM64("eor x10, x10, x13");
    /* 0x00b8d30c: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b8d310: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d314: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b8d318: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b8d31c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d320: add      x9, x9, x12 */ ARM64("add x9, x9, x12");
    /* 0x00b8d324: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8d328: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b8d32c: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b8d330: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d334: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00b8d338: eor      x9, x9, #0xff */ ARM64("eor x9, x9, #0xff");
    /* 0x00b8d33c: add      x11, x11, x12 */ ARM64("add x11, x11, x12");
    /* 0x00b8d340: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d344: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b8d348: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b8d34c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d350: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00b8d354: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8d358: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b8d35c: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b8d360: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d364: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b8d368: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d36c: eor      x12, x11, x12, ror #51 */ ARM64("eor x12, x11, x12, ror #51");
    /* 0x00b8d370: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b8d374: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d378: add      x9, x12, x9 */ ARM64("add x9, x12, x9");
    /* 0x00b8d37c: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8d380: eor      x12, x9, x12, ror #47 */ ARM64("eor x12, x9, x12, ror #47");
    /* 0x00b8d384: eor      x10, x11, x10, ror #43 */ ARM64("eor x10, x11, x10, ror #43");
    /* 0x00b8d388: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d38c: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b8d390: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d394: eor      x11, x11, x12, ror #51 */ ARM64("eor x11, x11, x12, ror #51");
    /* 0x00b8d398: eor      x10, x9, x10, ror #48 */ ARM64("eor x10, x9, x10, ror #48");
    /* 0x00b8d39c: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b8d3a0: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b8d3a4: eor      x10, x10, x11, ror #47 */ ARM64("eor x10, x10, x11, ror #47");
    /* 0x00b8d3a8: eor      x10, x10, x9, ror #32 */ ARM64("eor x10, x10, x9, ror #32");
    /* 0x00b8d3ac: eor      x21, x10, x9 */ ARM64("eor x21, x10, x9");
    /* 0x00b8d3b0: lsr      x27, x21, #0x39 */ ARM64("lsr x27, x21, #0x39");
    /* 0x00b8d3b4: ldp      x10, x9, [x29, #-0xf0] */ ARM64("ldp x10, x9, [x29, #-0xf0]");
    /* 0x00b8d3b8: dup      v0.8b, w27 */ ARM64("dup v0.8b, w27");
    /* 0x00b8d3bc: and      x11, x21, x9 */ ARM64("and x11, x21, x9");
    /* 0x00b8d3c0: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b8d3c4: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8d3c8: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8d3cc: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8d3d0: b.eq     #0xb8d408 */ if (COND_EQ) goto loc_00b8d408;
loc_00b8d3d4:
    /* 0x00b8d3d4: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b8d3d8: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b8d3dc: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b8d3e0: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00b8d3e4: mov      w14, #0x38 */ ARM64("mov w14, #0x38");
    /* 0x00b8d3e8: mneg     x13, x13, x14 */ ARM64("mneg x13, x13, x14");
    /* 0x00b8d3ec: add      x26, x10, x13 */ ARM64("add x26, x10, x13");
    /* 0x00b8d3f0: ldur     w13, [x26, #-0x38] */ ARM64("ldur w13, [x26, #-0x38]");
    /* 0x00b8d3f4: cmp      x13, x23 */ ARM64("cmp x13, x23");
    /* 0x00b8d3f8: b.eq     #0xb8d500 */ if (COND_EQ) goto loc_00b8d500;
    /* 0x00b8d3fc: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b8d400: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b8d404: b.ne     #0xb8d3d4 */ if (COND_NE) goto loc_00b8d3d4;
loc_00b8d408:
    /* 0x00b8d408: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b8d40c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b8d410: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8d414: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b8d418: tbnz     w12, #0, #0xb8d440 */ if (((w12 >> #0) & 1) != 0) goto loc_00b8d440;
    /* 0x00b8d41c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8d420: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00b8d424: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00b8d428: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b8d42c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8d430: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8d434: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8d438: b.ne     #0xb8d3d4 */ if (COND_NE) goto loc_00b8d3d4;
    /* 0x00b8d43c: b        #0xb8d408 */ goto loc_00b8d408;
loc_00b8d440:
    /* 0x00b8d440: ldur     x8, [x29, #-0xe0] */ ARM64("ldur x8, [x29, #-0xe0]");
    /* 0x00b8d444: cbz      x8, #0xb8d648 */ if (x8 == 0) goto loc_00b8d648;
loc_00b8d448:
    /* 0x00b8d448: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00b8d44c: ldrb     w8, [x8, #0x10] */ ARM64("ldrb w8, [x8, #0x10]");
    /* 0x00b8d450: tbz      w8, #0, #0xb8d65c */ if (((w8 >> #0) & 1) == 0) goto loc_00b8d65c;
loc_00b8d454:
    /* 0x00b8d454: ldr      x9, [sp, #0xd8] */ ARM64("ldr x9, [sp, #0xd8]");
    /* 0x00b8d458: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00b8d45c: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00b8d460: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8d464: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00b8d468: ldp      q1, q2, [sp, #0xe0] */ ARM64("ldp q1, q2, [sp, #0xe0]");
    /* 0x00b8d46c: add      x8, sp, #0x320 */ ARM64("add x8, sp, #0x320");
    /* 0x00b8d470: stur     q2, [x8, #4] */ ARM64("stur q2, [x8, #4]");
    /* 0x00b8d474: stur     q1, [x8, #0x14] */ ARM64("stur q1, [x8, #0x14]");
    /* 0x00b8d478: ldp      x8, x9, [x29, #-0xf0] */ ARM64("ldp x8, x9, [x29, #-0xf0]");
    /* 0x00b8d47c: and      x10, x9, x21 */ ARM64("and x10, x9, x21");
    /* 0x00b8d480: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00b8d484: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b8d488: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00b8d48c: cbz      x12, #0xb8d624 */ if (x12 == 0) goto loc_00b8d624;
loc_00b8d490:
    /* 0x00b8d490: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00b8d494: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8d498: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00b8d49c: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00b8d4a0: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00b8d4a4: tbz      w10, #0x1f, #0xb8d66c */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00b8d66c;
loc_00b8d4a8:
    /* 0x00b8d4a8: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00b8d4ac: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00b8d4b0: strb     w27, [x8, x11] */ ARM64("strb w27, [x8, x11]");
    /* 0x00b8d4b4: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b8d4b8: strb     w27, [x9, #8] */ ARM64("strb w27, [x9, #8]");
    /* 0x00b8d4bc: mov      w9, #0x38 */ ARM64("mov w9, #0x38");
    /* 0x00b8d4c0: mneg     x9, x11, x9 */ ARM64("mneg x9, x11, x9");
    /* 0x00b8d4c4: add      x26, x8, x9 */ ARM64("add x26, x8, x9");
    /* 0x00b8d4c8: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00b8d4cc: stur     w23, [x26, #-0x38] */ ARM64("stur w23, [x26, #-0x38]");
    /* 0x00b8d4d0: ldr      q1, [sp, #0x320] */ ARM64("ldr q1, [sp, #0x320]");
    /* 0x00b8d4d4: stur     q1, [x26, #-0x34] */ ARM64("stur q1, [x26, #-0x34]");
    /* 0x00b8d4d8: ldr      q1, [sp, #0x330] */ ARM64("ldr q1, [sp, #0x330]");
    /* 0x00b8d4dc: stur     q1, [x26, #-0x24] */ ARM64("stur q1, [x26, #-0x24]");
    /* 0x00b8d4e0: ldr      w9, [sp, #0x340] */ ARM64("ldr w9, [sp, #0x340]");
    /* 0x00b8d4e4: stur     w9, [x26, #-0x14] */ ARM64("stur w9, [x26, #-0x14]");
    /* 0x00b8d4e8: stur     q0, [x26, #-0x10] */ ARM64("stur q0, [x26, #-0x10]");
    /* 0x00b8d4ec: ldur     q0, [x29, #-0xe0] */ ARM64("ldur q0, [x29, #-0xe0]");
    /* 0x00b8d4f0: movi     v1.2d, #0xffffffffffffffff */ ARM64("movi v1.2d, #0xffffffffffffffff");
    /* 0x00b8d4f4: mov      v1.d[0], x8 */ ARM64("mov v1.d[0], x8");
    /* 0x00b8d4f8: sub      v0.2d, v0.2d, v1.2d */ ARM64("sub v0.2d, v0.2d, v1.2d");
    /* 0x00b8d4fc: stur     q0, [x29, #-0xe0] */ ARM64("stur q0, [x29, #-0xe0]");
loc_00b8d500:
    /* 0x00b8d500: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b8d504: ldp      x21, x23, [x1, #-0x10]! */ ARM64("ldp x21, x23, [x1, #-0x10]!");
    /* 0x00b8d508: ldur     x8, [x1, #-0x10] */ ARM64("ldur x8, [x1, #-0x10]");
    /* 0x00b8d50c: cbz      x8, #0xb8d618 */ if (x8 == 0) goto loc_00b8d618;
loc_00b8d510:
    /* 0x00b8d510: mov      x12, #0 */ ARM64("mov x12, #0");
    /* 0x00b8d514: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8d518: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b8d51c: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b8d520: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b8d524: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b8d528: eor      x9, x21, x9 */ ARM64("eor x9, x21, x9");
    /* 0x00b8d52c: mov      x10, #0x6f6d */ ARM64("mov x10, #0x6f6d");
    /* 0x00b8d530: movk     x10, #0x6e64, lsl #16 */ ARM64("movk x10, #0x6e64, lsl #16");
    /* 0x00b8d534: movk     x10, #0x7261, lsl #32 */ ARM64("movk x10, #0x7261, lsl #32");
    /* 0x00b8d538: movk     x10, #0x646f, lsl #48 */ ARM64("movk x10, #0x646f, lsl #48");
    /* 0x00b8d53c: eor      x10, x23, x10 */ ARM64("eor x10, x23, x10");
    /* 0x00b8d540: mov      x11, #0x7261 */ ARM64("mov x11, #0x7261");
    /* 0x00b8d544: movk     x11, #0x6e65, lsl #16 */ ARM64("movk x11, #0x6e65, lsl #16");
    /* 0x00b8d548: movk     x11, #0x6765, lsl #32 */ ARM64("movk x11, #0x6765, lsl #32");
    /* 0x00b8d54c: movk     x11, #0x6c79, lsl #48 */ ARM64("movk x11, #0x6c79, lsl #48");
    /* 0x00b8d550: eor      x11, x21, x11 */ ARM64("eor x11, x21, x11");
    /* 0x00b8d554: ldr      x13, [sp, #0xc0] */ ARM64("ldr x13, [sp, #0xc0]");
    /* 0x00b8d558: eor      x13, x23, x13 */ ARM64("eor x13, x23, x13");
    /* 0x00b8d55c: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d560: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b8d564: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b8d568: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d56c: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b8d570: add      x11, x11, x10 */ ARM64("add x11, x11, x10");
    /* 0x00b8d574: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b8d578: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b8d57c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d580: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b8d584: orr      x14, x25, #0x400000000000000 */ ARM64("orr x14, x25, #0x400000000000000");
    /* 0x00b8d588: eor      x9, x9, x14 */ ARM64("eor x9, x9, x14");
    /* 0x00b8d58c: eor      x11, x11, #0xff */ ARM64("eor x11, x11, #0xff");
    /* 0x00b8d590: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00b8d594: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b8d598: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b8d59c: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b8d5a0: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d5a4: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8d5a8: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b8d5ac: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b8d5b0: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b8d5b4: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d5b8: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d5bc: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b8d5c0: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b8d5c4: eor      x13, x11, x13, ror #48 */ ARM64("eor x13, x11, x13, ror #48");
    /* 0x00b8d5c8: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8d5cc: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8d5d0: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b8d5d4: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b8d5d8: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b8d5dc: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8d5e0: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8d5e4: add      x11, x13, x11 */ ARM64("add x11, x13, x11");
    /* 0x00b8d5e8: eor      x9, x9, x10, ror #51 */ ARM64("eor x9, x9, x10, ror #51");
    /* 0x00b8d5ec: eor      x10, x11, x13, ror #48 */ ARM64("eor x10, x11, x13, ror #48");
    /* 0x00b8d5f0: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b8d5f4: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b8d5f8: eor      x9, x10, x9, ror #47 */ ARM64("eor x9, x10, x9, ror #47");
    /* 0x00b8d5fc: eor      x9, x9, x11, ror #32 */ ARM64("eor x9, x9, x11, ror #32");
    /* 0x00b8d600: eor      x14, x9, x11 */ ARM64("eor x14, x9, x11");
    /* 0x00b8d604: ldp      x9, x11, [x26, #-0x30] */ ARM64("ldp x9, x11, [x26, #-0x30]");
    /* 0x00b8d608: lsr      x10, x14, #0x39 */ ARM64("lsr x10, x14, #0x39");
    /* 0x00b8d60c: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
    /* 0x00b8d610: ldr      x19, [sp, #0x118] */ ARM64("ldr x19, [sp, #0x118]");
    /* 0x00b8d614: b        #0xb8d1b4 */ goto loc_00b8d1b4;
loc_00b8d618:
    /* 0x00b8d618: sub      x0, x1, #0x20 */ ARM64("sub x0, x1, #0x20");
    /* 0x00b8d61c: bl       #0xc6df10 */ CALL_DIRECT(sub_00c6df10);
    /* 0x00b8d620: b        #0xb8d510 */ goto loc_00b8d510;
loc_00b8d624:
    /* 0x00b8d624: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00b8d628:
    /* 0x00b8d628: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00b8d62c: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00b8d630: ldr      d1, [x8, x10] */ ARM64("ldr d1, [x8, x10]");
    /* 0x00b8d634: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b8d638: fmov     x12, d1 */ ARM64("fmov x12, d1");
    /* 0x00b8d63c: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00b8d640: cbnz     x12, #0xb8d490 */ if (x12 != 0) goto loc_00b8d490;
    /* 0x00b8d644: b        #0xb8d628 */ goto loc_00b8d628;
loc_00b8d648:
    /* 0x00b8d648: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b8d64c: sub      x8, x29, #0xf0 */ ARM64("sub x8, x29, #0xf0");
    /* 0x00b8d650: add      x1, x8, #0x20 */ ARM64("add x1, x8, #0x20");
    /* 0x00b8d654: bl       #0xc6d288 */ CALL_DIRECT(sub_00c6d288);
    /* 0x00b8d658: b        #0xb8d448 */ goto loc_00b8d448;
loc_00b8d65c:
    /* 0x00b8d65c: ldr      x0, [sp, #0xd8] */ ARM64("ldr x0, [sp, #0xd8]");
    /* 0x00b8d660: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b8d664: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b8d668: b        #0xb8d454 */ goto loc_00b8d454;
loc_00b8d66c:
    /* 0x00b8d66c: ldr      d1, [x8] */ ARM64("ldr d1, [x8]");
    /* 0x00b8d670: cmlt     v1.8b, v1.8b, #0 */ ARM64("cmlt v1.8b, v1.8b, #0");
    /* 0x00b8d674: fmov     x10, d1 */ ARM64("fmov x10, d1");
    /* 0x00b8d678: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b8d67c: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b8d680: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00b8d684: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00b8d688: b        #0xb8d4a8 */ goto loc_00b8d4a8;
loc_00b8d68c:
    /* 0x00b8d68c: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b8d690: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b8d694: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b8d698: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b8d69c: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b8d6a0: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b8d6a4: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b8d6a8: b        #0xb8d25c */ goto loc_00b8d25c;
loc_00b8d6ac:
    /* 0x00b8d6ac: ldr      x22, [sp, #0x268] */ ARM64("ldr x22, [sp, #0x268]");
    /* 0x00b8d6b0: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b8d6b4: ldr      x28, [sp, #0xd8] */ ARM64("ldr x28, [sp, #0xd8]");
    /* 0x00b8d6b8: cbnz     x8, #0xb8cff8 */ if (x8 != 0) goto loc_00b8cff8;
    /* 0x00b8d6bc: b        #0xb8d6c8 */ goto loc_00b8d6c8;
loc_00b8d6c0:
    /* 0x00b8d6c0: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b8d6c4: str      x8, [sp, #0x108] */ ARM64("str x8, [sp, #0x108]");
loc_00b8d6c8:
    /* 0x00b8d6c8: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b8d6cc: cbz      x8, #0xb8d6d8 */ if (x8 == 0) goto loc_00b8d6d8;
    /* 0x00b8d6d0: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b8d6d4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8d6d8:
    /* 0x00b8d6d8: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00b8d6dc: cbz      x8, #0xb8d6e8 */ if (x8 == 0) goto loc_00b8d6e8;
    /* 0x00b8d6e0: ldr      x0, [sp, #0x230] */ ARM64("ldr x0, [sp, #0x230]");
    /* 0x00b8d6e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8d6e8:
    /* 0x00b8d6e8: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b8d6ec: cbz      x8, #0xb8d6f8 */ if (x8 == 0) goto loc_00b8d6f8;
    /* 0x00b8d6f0: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b8d6f4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8d6f8:
    /* 0x00b8d6f8: ldr      x20, [sp, #0x430] */ ARM64("ldr x20, [sp, #0x430]");
    /* 0x00b8d6fc: ldp      q0, q1, [x29, #-0xf0] */ ARM64("ldp q0, q1, [x29, #-0xf0]");
    /* 0x00b8d700: stp      q0, q1, [sp, #0x320] */ ARM64("stp q0, q1, [sp, #0x320]");
    /* 0x00b8d704: ldur     q0, [x29, #-0xd0] */ ARM64("ldur q0, [x29, #-0xd0]");
    /* 0x00b8d708: str      q0, [sp, #0x340] */ ARM64("str q0, [sp, #0x340]");
    /* 0x00b8d70c: ldrb     w8, [x28, #0x10] */ ARM64("ldrb w8, [x28, #0x10]");
    /* 0x00b8d710: str      x20, [sp, #0xc8] */ ARM64("str x20, [sp, #0xc8]");
    /* 0x00b8d714: tbz      w8, #0, #0xb908c0 */ if (((w8 >> #0) & 1) == 0) goto loc_00b908c0;
loc_00b8d718:
    /* 0x00b8d718: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00b8d71c: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8d720: ldr      q0, [x28] */ ARM64("ldr q0, [x28]");
    /* 0x00b8d724: ldr      x8, [x28] */ ARM64("ldr x8, [x28]");
    /* 0x00b8d728: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8d72c: str      x8, [x28] */ ARM64("str x8, [x28]");
    /* 0x00b8d730: str      q0, [sp, #0x230] */ ARM64("str q0, [sp, #0x230]");
    /* 0x00b8d734: str      x19, [sp, #0x118] */ ARM64("str x19, [sp, #0x118]");
    /* 0x00b8d738: cbnz     x19, #0xb908d0 */ if (x19 != 0) goto loc_00b908d0;
    /* 0x00b8d73c: mov      w27, #1 */ ARM64("mov w27, #1");
loc_00b8d740:
    /* 0x00b8d740: mov      x8, #0x5555555555555555 */ ARM64("mov x8, #0x5555555555555555");
    /* 0x00b8d744: movk     x8, #0x5556 */ ARM64("movk x8, #0x5556");
    /* 0x00b8d748: movk     x8, #0x555, lsl #48 */ ARM64("movk x8, #0x555, lsl #48");
    /* 0x00b8d74c: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b8d750: str      x9, [sp, #0xc0] */ ARM64("str x9, [sp, #0xc0]");
    /* 0x00b8d754: ldr      x23, [sp, #0x218] */ ARM64("ldr x23, [sp, #0x218]");
    /* 0x00b8d758: ldr      x9, [sp, #0x228] */ ARM64("ldr x9, [sp, #0x228]");
    /* 0x00b8d75c: str      x9, [sp, #0xa8] */ ARM64("str x9, [sp, #0xa8]");
    /* 0x00b8d760: ldr      x20, [sp, #0x230] */ ARM64("ldr x20, [sp, #0x230]");
    /* 0x00b8d764: ldr      x21, [sp, #0x238] */ ARM64("ldr x21, [sp, #0x238]");
    /* 0x00b8d768: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00b8d76c: stp      q0, q1, [sp, #0x210] */ ARM64("stp q0, q1, [sp, #0x210]");
    /* 0x00b8d770: ldr      q0, [sp, #0x340] */ ARM64("ldr q0, [sp, #0x340]");
    /* 0x00b8d774: ldr      x10, [sp, #0x118] */ ARM64("ldr x10, [sp, #0x118]");
    /* 0x00b8d778: add      x9, x10, x10, lsl #1 */ ARM64("add x9, x10, x10, lsl #1");
    /* 0x00b8d77c: lsl      x1, x9, #3 */ ARM64("lsl x1, x9, #3");
    /* 0x00b8d780: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00b8d784: str      q0, [sp, #0x230] */ ARM64("str q0, [sp, #0x230]");
    /* 0x00b8d788: cmp      x10, x8 */ ARM64("cmp x10, x8");
    /* 0x00b8d78c: b.ls     #0xb8d7a0 */ if (COND_LS) goto loc_00b8d7a0;
    /* 0x00b8d790: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00b8d794:
    /* 0x00b8d794: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8d798: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b8d79c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b8d7a0:
    /* 0x00b8d7a0: str      x8, [sp, #0x80] */ ARM64("str x8, [sp, #0x80]");
    /* 0x00b8d7a4: cbz      x1, #0xb8d84c */ if (x1 == 0) goto loc_00b8d84c;
    /* 0x00b8d7a8: mov      x22, x1 */ ARM64("mov x22, x1");
    /* 0x00b8d7ac: mov      x0, x1 */ ARM64("mov x0, x1");
    /* 0x00b8d7b0: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8d7b4: ldr      x8, [sp, #0x118] */ ARM64("ldr x8, [sp, #0x118]");
    /* 0x00b8d7b8: str      x8, [sp, #0x98] */ ARM64("str x8, [sp, #0x98]");
    /* 0x00b8d7bc: str      x0, [sp, #0xb0] */ ARM64("str x0, [sp, #0xb0]");
    /* 0x00b8d7c0: cbnz     x0, #0xb8d858 */ if (x0 != 0) goto loc_00b8d858;
    /* 0x00b8d7c4: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b8d7c8: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8d7cc: b        #0xb8d794 */ goto loc_00b8d794;
loc_00b8d7d0:
    /* 0x00b8d7d0: str      xzr, [sp, #0x210] */ ARM64("str xzr, [sp, #0x210]");
    /* 0x00b8d7d4: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8d7d8: mov      w1, #8 */ ARM64("mov w1, #8");
    /* 0x00b8d7dc: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b8d7e0: bl       #0xc7ae50 */ CALL_DIRECT(sub_00c7ae50);
    /* 0x00b8d7e4: cbnz     w0, #0xb90e20 */ if (w0 != 0) goto loc_00b90e20;
    /* 0x00b8d7e8: ldr      x21, [sp, #0x210] */ ARM64("ldr x21, [sp, #0x210]");
    /* 0x00b8d7ec: cbz      x21, #0xb90e20 */ if (x21 == 0) goto loc_00b90e20;
    /* 0x00b8d7f0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b8d7f4: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b8d7f8: bl       #0xc7a9d0 */ CALL_DIRECT(sub_00c7a9d0);
    /* 0x00b8d7fc: ldr      x23, [x25, #0x10] */ ARM64("ldr x23, [x25, #0x10]");
    /* 0x00b8d800: add      x8, x23, #0x1f */ ARM64("add x8, x23, #0x1f");
    /* 0x00b8d804: lsr      x22, x8, #5 */ ARM64("lsr x22, x8, #5");
    /* 0x00b8d808: cbz      x23, #0xb8cf4c */ if (x23 == 0) goto loc_00b8cf4c;
    /* 0x00b8d80c: lsl      x24, x22, #2 */ ARM64("lsl x24, x22, #2");
    /* 0x00b8d810: cbnz     x22, #0xb8cf20 */ if (x22 != 0) goto loc_00b8cf20;
    /* 0x00b8d814: str      xzr, [sp, #0x210] */ ARM64("str xzr, [sp, #0x210]");
    /* 0x00b8d818: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8d81c: mov      w1, #8 */ ARM64("mov w1, #8");
    /* 0x00b8d820: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b8d824: bl       #0xc7ae50 */ CALL_DIRECT(sub_00c7ae50);
    /* 0x00b8d828: cbnz     w0, #0xb8cf30 */ if (w0 != 0) goto loc_00b8cf30;
    /* 0x00b8d82c: ldr      x25, [sp, #0x210] */ ARM64("ldr x25, [sp, #0x210]");
    /* 0x00b8d830: cbz      x25, #0xb8cf30 */ if (x25 == 0) goto loc_00b8cf30;
    /* 0x00b8d834: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b8d838: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b8d83c: bl       #0xc7a9d0 */ CALL_DIRECT(sub_00c7a9d0);
    /* 0x00b8d840: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b8d844: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8d848: b        #0xb8cf50 */ goto loc_00b8cf50;
loc_00b8d84c:
    /* 0x00b8d84c: str      xzr, [sp, #0x98] */ ARM64("str xzr, [sp, #0x98]");
    /* 0x00b8d850: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b8d854: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
loc_00b8d858:
    /* 0x00b8d858: mov      x19, #0x6573 */ ARM64("mov x19, #0x6573");
    /* 0x00b8d85c: movk     x19, #0x7974, lsl #16 */ ARM64("movk x19, #0x7974, lsl #16");
    /* 0x00b8d860: movk     x19, #0x6462, lsl #32 */ ARM64("movk x19, #0x6462, lsl #32");
    /* 0x00b8d864: movk     x19, #0x7465, lsl #48 */ ARM64("movk x19, #0x7465, lsl #48");
    /* 0x00b8d868: mov      x12, #0x6575 */ ARM64("mov x12, #0x6575");
    /* 0x00b8d86c: movk     x12, #0x7073, lsl #16 */ ARM64("movk x12, #0x7073, lsl #16");
    /* 0x00b8d870: movk     x12, #0x6d65, lsl #32 */ ARM64("movk x12, #0x6d65, lsl #32");
    /* 0x00b8d874: movk     x12, #0x736f, lsl #48 */ ARM64("movk x12, #0x736f, lsl #48");
    /* 0x00b8d878: mov      x13, #0x7261 */ ARM64("mov x13, #0x7261");
    /* 0x00b8d87c: movk     x13, #0x6e65, lsl #16 */ ARM64("movk x13, #0x6e65, lsl #16");
    /* 0x00b8d880: movk     x13, #0x6765, lsl #32 */ ARM64("movk x13, #0x6765, lsl #32");
    /* 0x00b8d884: movk     x13, #0x6c79, lsl #48 */ ARM64("movk x13, #0x6c79, lsl #48");
    /* 0x00b8d888: mov      x14, #0x6f6d */ ARM64("mov x14, #0x6f6d");
    /* 0x00b8d88c: movk     x14, #0x6e64, lsl #16 */ ARM64("movk x14, #0x6e64, lsl #16");
    /* 0x00b8d890: movk     x14, #0x7261, lsl #32 */ ARM64("movk x14, #0x7261, lsl #32");
    /* 0x00b8d894: movk     x14, #0x646f, lsl #48 */ ARM64("movk x14, #0x646f, lsl #48");
    /* 0x00b8d898: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8d89c: str      x23, [sp, #0xb8] */ ARM64("str x23, [sp, #0xb8]");
    /* 0x00b8d8a0: tbz      w27, #0, #0xb8d8ec */ if (((w27 >> #0) & 1) == 0) goto loc_00b8d8ec;
    /* 0x00b8d8a4: mov      x24, #0 */ ARM64("mov x24, #0");
    /* 0x00b8d8a8: ldr      x20, [sp, #0xb0] */ ARM64("ldr x20, [sp, #0xb0]");
    /* 0x00b8d8ac: ldr      x21, [sp, #0x118] */ ARM64("ldr x21, [sp, #0x118]");
    /* 0x00b8d8b0: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8d8b4: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b8d8b8: cbz      x21, #0xb8e044 */ if (x21 == 0) goto loc_00b8e044;
loc_00b8d8bc:
    /* 0x00b8d8bc: lsl      x27, x21, #3 */ ARM64("lsl x27, x21, #3");
    /* 0x00b8d8c0: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b8d8c4: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8d8c8: cbz      x0, #0xb90e6c */ if (x0 == 0) goto loc_00b90e6c;
    /* 0x00b8d8cc: mov      x26, x0 */ ARM64("mov x26, x0");
    /* 0x00b8d8d0: subs     x10, x21, #2 */ ARM64("subs x10, x21, #2");
    /* 0x00b8d8d4: b.lo     #0xb8e060 */ if (COND_LO) goto loc_00b8e060;
    /* 0x00b8d8d8: cmp      x21, #5 */ ARM64("cmp x21, #5");
    /* 0x00b8d8dc: b.hs     #0xb8e07c */ if (COND_HS) goto loc_00b8e07c;
    /* 0x00b8d8e0: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00b8d8e4: mov      x8, x26 */ ARM64("mov x8, x26");
    /* 0x00b8d8e8: b        #0xb8e0b4 */ goto loc_00b8e0b4;
loc_00b8d8ec:
    /* 0x00b8d8ec: mov      x26, #0 */ ARM64("mov x26, #0");
    /* 0x00b8d8f0: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b8d8f4: ldr      x16, [sp, #0x228] */ ARM64("ldr x16, [sp, #0x228]");
    /* 0x00b8d8f8: eor      x9, x8, x12 */ ARM64("eor x9, x8, x12");
    /* 0x00b8d8fc: ldr      x10, [sp, #0x238] */ ARM64("ldr x10, [sp, #0x238]");
    /* 0x00b8d900: eor      x11, x10, x14 */ ARM64("eor x11, x10, x14");
    /* 0x00b8d904: eor      x17, x8, x13 */ ARM64("eor x17, x8, x13");
    /* 0x00b8d908: add      x8, x11, x9 */ ARM64("add x8, x11, x9");
    /* 0x00b8d90c: eor      x1, x8, x11, ror #51 */ ARM64("eor x1, x8, x11, ror #51");
    /* 0x00b8d910: ror      x2, x8, #0x20 */ ARM64("ror x2, x8, #0x20");
    /* 0x00b8d914: ror      x3, x1, #0x2f */ ARM64("ror x3, x1, #0x2f");
    /* 0x00b8d918: ldr      x4, [sp, #0x218] */ ARM64("ldr x4, [sp, #0x218]");
    /* 0x00b8d91c: ldr      x5, [sp, #0x220] */ ARM64("ldr x5, [sp, #0x220]");
    /* 0x00b8d920: eor      x6, x10, x19 */ ARM64("eor x6, x10, x19");
    /* 0x00b8d924: eor      x8, x20, x12 */ ARM64("eor x8, x20, x12");
    /* 0x00b8d928: eor      x9, x21, x14 */ ARM64("eor x9, x21, x14");
    /* 0x00b8d92c: eor      x7, x20, x13 */ ARM64("eor x7, x20, x13");
    /* 0x00b8d930: eor      x30, x21, x19 */ ARM64("eor x30, x21, x19");
    /* 0x00b8d934: add      x8, x9, x8 */ ARM64("add x8, x9, x8");
    /* 0x00b8d938: eor      x0, x8, x9, ror #51 */ ARM64("eor x0, x8, x9, ror #51");
    /* 0x00b8d93c: ror      x19, x8, #0x20 */ ARM64("ror x19, x8, #0x20");
    /* 0x00b8d940: ror      x8, x0, #0x2f */ ARM64("ror x8, x0, #0x2f");
    /* 0x00b8d944: str      x8, [sp, #0x90] */ ARM64("str x8, [sp, #0x90]");
    /* 0x00b8d948: movi     v3.2d, #0xffffffffffffffff */ ARM64("movi v3.2d, #0xffffffffffffffff");
    /* 0x00b8d94c: mov      w22, #0x18 */ ARM64("mov w22, #0x18");
    /* 0x00b8d950: ldr      x20, [sp, #0xb0] */ ARM64("ldr x20, [sp, #0xb0]");
    /* 0x00b8d954: ldr      x21, [sp, #0x118] */ ARM64("ldr x21, [sp, #0x118]");
    /* 0x00b8d958: stp      x3, x2, [sp, #0x48] */ ARM64("stp x3, x2, [sp, #0x48]");
    /* 0x00b8d95c: stp      x6, x4, [sp, #0x38] */ ARM64("stp x6, x4, [sp, #0x38]");
loc_00b8d960:
    /* 0x00b8d960: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8d964: ldr      x9, [sp, #0x108] */ ARM64("ldr x9, [sp, #0x108]");
    /* 0x00b8d968: ldr      w9, [x9, x26, lsl #2] */ ARM64("ldr w9, [x9, x26, lsl #2]");
    /* 0x00b8d96c: orr      x10, x9, #0x400000000000000 */ ARM64("orr x10, x9, #0x400000000000000");
    /* 0x00b8d970: eor      x11, x10, x6 */ ARM64("eor x11, x10, x6");
    /* 0x00b8d974: add      x12, x11, x17 */ ARM64("add x12, x11, x17");
    /* 0x00b8d978: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8d97c: add      x12, x12, x1 */ ARM64("add x12, x12, x1");
    /* 0x00b8d980: add      x13, x11, x2 */ ARM64("add x13, x11, x2");
    /* 0x00b8d984: eor      x11, x13, x11, ror #43 */ ARM64("eor x11, x13, x11, ror #43");
    /* 0x00b8d988: eor      x10, x13, x10 */ ARM64("eor x10, x13, x10");
    /* 0x00b8d98c: eor      x13, x12, x3 */ ARM64("eor x13, x12, x3");
    /* 0x00b8d990: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8d994: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b8d998: add      x10, x10, x13 */ ARM64("add x10, x10, x13");
    /* 0x00b8d99c: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8d9a0: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b8d9a4: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8d9a8: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b8d9ac: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8d9b0: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b8d9b4: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b8d9b8: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b8d9bc: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8d9c0: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b8d9c4: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8d9c8: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b8d9cc: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8d9d0: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b8d9d4: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8d9d8: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b8d9dc: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b8d9e0: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b8d9e4: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8d9e8: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b8d9ec: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8d9f0: eor      x10, x10, x13, ror #51 */ ARM64("eor x10, x10, x13, ror #51");
    /* 0x00b8d9f4: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8d9f8: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b8d9fc: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b8da00: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b8da04: eor      x10, x10, x12, ror #32 */ ARM64("eor x10, x10, x12, ror #32");
    /* 0x00b8da08: eor      x11, x10, x12 */ ARM64("eor x11, x10, x12");
    /* 0x00b8da0c: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00b8da10: ldr      x10, [sp, #0x210] */ ARM64("ldr x10, [sp, #0x210]");
    /* 0x00b8da14: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
    /* 0x00b8da18: and      x12, x11, x4 */ ARM64("and x12, x11, x4");
    /* 0x00b8da1c: ldr      d1, [x10, x12] */ ARM64("ldr d1, [x10, x12]");
    /* 0x00b8da20: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8da24: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b8da28: ands     x13, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8da2c: b.eq     #0xb8da64 */ if (COND_EQ) goto loc_00b8da64;
loc_00b8da30:
    /* 0x00b8da30: rbit     x11, x13 */ ARM64("rbit x11, x13");
    /* 0x00b8da34: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8da38: add      x11, x12, x11, lsr #3 */ ARM64("add x11, x12, x11, lsr #3");
    /* 0x00b8da3c: and      x14, x11, x4 */ ARM64("and x14, x11, x4");
    /* 0x00b8da40: mov      w11, #0x38 */ ARM64("mov w11, #0x38");
    /* 0x00b8da44: mneg     x11, x14, x11 */ ARM64("mneg x11, x14, x11");
    /* 0x00b8da48: add      x11, x10, x11 */ ARM64("add x11, x10, x11");
    /* 0x00b8da4c: ldur     w15, [x11, #-0x38] */ ARM64("ldur w15, [x11, #-0x38]");
    /* 0x00b8da50: cmp      w9, w15 */ ARM64("cmp w9, w15");
    /* 0x00b8da54: b.eq     #0xb8da98 */ if (COND_EQ) goto loc_00b8da98;
    /* 0x00b8da58: sub      x11, x13, #1 */ ARM64("sub x11, x13, #1");
    /* 0x00b8da5c: ands     x13, x11, x13 */ ARM64("ands x13, x11, x13");
    /* 0x00b8da60: b.ne     #0xb8da30 */ if (COND_NE) goto loc_00b8da30;
loc_00b8da64:
    /* 0x00b8da64: cmeq     v1.8b, v1.8b, v3.8b */ ARM64("cmeq v1.8b, v1.8b, v3.8b");
    /* 0x00b8da68: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8da6c: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b8da70: tbnz     w11, #0, #0xb8dbd0 */ if (((w11 >> #0) & 1) != 0) goto loc_00b8dbd0;
    /* 0x00b8da74: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8da78: add      x11, x12, x8 */ ARM64("add x11, x12, x8");
    /* 0x00b8da7c: and      x12, x11, x4 */ ARM64("and x12, x11, x4");
    /* 0x00b8da80: ldr      d1, [x10, x12] */ ARM64("ldr d1, [x10, x12]");
    /* 0x00b8da84: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8da88: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b8da8c: ands     x13, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8da90: b.ne     #0xb8da30 */ if (COND_NE) goto loc_00b8da30;
    /* 0x00b8da94: b        #0xb8da64 */ goto loc_00b8da64;
loc_00b8da98:
    /* 0x00b8da98: lsl      x8, x14, #6 */ ARM64("lsl x8, x14, #6");
    /* 0x00b8da9c: sub      x8, x8, x14, lsl #3 */ ARM64("sub x8, x8, x14, lsl #3");
    /* 0x00b8daa0: asr      x8, x8, #3 */ ARM64("asr x8, x8, #3");
    /* 0x00b8daa4: mov      x9, #0x6db7 */ ARM64("mov x9, #0x6db7");
    /* 0x00b8daa8: movk     x9, #0xb6db, lsl #16 */ ARM64("movk x9, #0xb6db, lsl #16");
    /* 0x00b8daac: movk     x9, #0xdb6d, lsl #32 */ ARM64("movk x9, #0xdb6d, lsl #32");
    /* 0x00b8dab0: movk     x9, #0x6db6, lsl #48 */ ARM64("movk x9, #0x6db6, lsl #48");
    /* 0x00b8dab4: mul      x8, x8, x9 */ ARM64("mul x8, x8, x9");
    /* 0x00b8dab8: sub      x9, x8, #8 */ ARM64("sub x9, x8, #8");
    /* 0x00b8dabc: and      x9, x9, x4 */ ARM64("and x9, x9, x4");
    /* 0x00b8dac0: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b8dac4: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b8dac8: cmeq     v0.8b, v0.8b, v3.8b */ ARM64("cmeq v0.8b, v0.8b, v3.8b");
    /* 0x00b8dacc: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00b8dad0: ldr      d0, [x10, x8] */ ARM64("ldr d0, [x10, x8]");
    /* 0x00b8dad4: cmeq     v0.8b, v0.8b, v3.8b */ ARM64("cmeq v0.8b, v0.8b, v3.8b");
    /* 0x00b8dad8: fmov     x13, d0 */ ARM64("fmov x13, d0");
    /* 0x00b8dadc: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b8dae0: rbit     x13, x13 */ ARM64("rbit x13, x13");
    /* 0x00b8dae4: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b8dae8: lsr      x13, x13, #3 */ ARM64("lsr x13, x13, #3");
    /* 0x00b8daec: add      x12, x13, x12, lsr #3 */ ARM64("add x12, x13, x12, lsr #3");
    /* 0x00b8daf0: cmp      x12, #7 */ ARM64("cmp x12, #7");
    /* 0x00b8daf4: b.ls     #0xb8db18 */ if (COND_LS) goto loc_00b8db18;
    /* 0x00b8daf8: mov      w12, #0x80 */ ARM64("mov w12, #0x80");
    /* 0x00b8dafc: strb     w12, [x10, x8] */ ARM64("strb w12, [x10, x8]");
    /* 0x00b8db00: strb     w12, [x9, #8] */ ARM64("strb w12, [x9, #8]");
    /* 0x00b8db04: sub      x16, x16, #1 */ ARM64("sub x16, x16, #1");
    /* 0x00b8db08: str      x16, [sp, #0x228] */ ARM64("str x16, [sp, #0x228]");
    /* 0x00b8db0c: ldur     x24, [x11, #-0x30] */ ARM64("ldur x24, [x11, #-0x30]");
    /* 0x00b8db10: cbnz     x24, #0xb8db3c */ if (x24 != 0) goto loc_00b8db3c;
    /* 0x00b8db14: b        #0xb8dbd0 */ goto loc_00b8dbd0;
loc_00b8db18:
    /* 0x00b8db18: add      x5, x5, #1 */ ARM64("add x5, x5, #1");
    /* 0x00b8db1c: str      x5, [sp, #0x220] */ ARM64("str x5, [sp, #0x220]");
    /* 0x00b8db20: mov      w12, #0xff */ ARM64("mov w12, #0xff");
    /* 0x00b8db24: strb     w12, [x10, x8] */ ARM64("strb w12, [x10, x8]");
    /* 0x00b8db28: strb     w12, [x9, #8] */ ARM64("strb w12, [x9, #8]");
    /* 0x00b8db2c: sub      x16, x16, #1 */ ARM64("sub x16, x16, #1");
    /* 0x00b8db30: str      x16, [sp, #0x228] */ ARM64("str x16, [sp, #0x228]");
    /* 0x00b8db34: ldur     x24, [x11, #-0x30] */ ARM64("ldur x24, [x11, #-0x30]");
    /* 0x00b8db38: cbz      x24, #0xb8dbd0 */ if (x24 == 0) goto loc_00b8dbd0;
loc_00b8db3c:
    /* 0x00b8db3c: ldur     x10, [x11, #-0x28] */ ARM64("ldur x10, [x11, #-0x28]");
    /* 0x00b8db40: ldur     x27, [x11, #-0x18] */ ARM64("ldur x27, [x11, #-0x18]");
    /* 0x00b8db44: ldr      d0, [x24] */ ARM64("ldr d0, [x24]");
    /* 0x00b8db48: str      x10, [sp, #0x88] */ ARM64("str x10, [sp, #0x88]");
    /* 0x00b8db4c: cbz      x10, #0xb8dbf8 */ if (x10 == 0) goto loc_00b8dbf8;
    /* 0x00b8db50: lsl      x8, x10, #2 */ ARM64("lsl x8, x10, #2");
    /* 0x00b8db54: add      x8, x8, #0xb */ ARM64("add x8, x8, #0xb");
    /* 0x00b8db58: and      x9, x8, #0xfffffffffffffff8 */ ARM64("and x9, x8, #0xfffffffffffffff8");
    /* 0x00b8db5c: add      x8, x10, x9 */ ARM64("add x8, x10, x9");
    /* 0x00b8db60: adds     x8, x8, #9 */ ARM64("adds x8, x8, #9");
    /* 0x00b8db64: sub      x9, x24, x9 */ ARM64("sub x9, x24, x9");
    /* 0x00b8db68: str      x9, [sp, #0x78] */ ARM64("str x9, [sp, #0x78]");
    /* 0x00b8db6c: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00b8db70: str      w9, [sp, #0x70] */ ARM64("str w9, [sp, #0x70]");
    /* 0x00b8db74: cbnz     x27, #0xb8dbfc */ if (x27 != 0) goto loc_00b8dbfc;
    /* 0x00b8db78: cbz      x8, #0xb8dfb0 */ if (x8 == 0) goto loc_00b8dfb0;
    /* 0x00b8db7c: stp      x5, x0, [sp, #0x58] */ ARM64("stp x5, x0, [sp, #0x58]");
    /* 0x00b8db80: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b8db84: mov      x24, x16 */ ARM64("mov x24, x16");
    /* 0x00b8db88: mov      x27, x17 */ ARM64("mov x27, x17");
    /* 0x00b8db8c: str      x19, [sp, #0x68] */ ARM64("str x19, [sp, #0x68]");
    /* 0x00b8db90: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x00b8db94: mov      x23, x7 */ ARM64("mov x23, x7");
    /* 0x00b8db98: mov      x22, x30 */ ARM64("mov x22, x30");
    /* 0x00b8db9c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8dba0: movi     v3.2d, #0xffffffffffffffff */ ARM64("movi v3.2d, #0xffffffffffffffff");
    /* 0x00b8dba4: mov      x30, x22 */ ARM64("mov x30, x22");
    /* 0x00b8dba8: mov      w22, #0x18 */ ARM64("mov w22, #0x18");
    /* 0x00b8dbac: mov      x7, x23 */ ARM64("mov x7, x23");
    /* 0x00b8dbb0: mov      x1, x19 */ ARM64("mov x1, x19");
    /* 0x00b8dbb4: ldp      x0, x19, [sp, #0x60] */ ARM64("ldp x0, x19, [sp, #0x60]");
    /* 0x00b8dbb8: ldp      x6, x4, [sp, #0x38] */ ARM64("ldp x6, x4, [sp, #0x38]");
    /* 0x00b8dbbc: ldp      x2, x5, [sp, #0x50] */ ARM64("ldp x2, x5, [sp, #0x50]");
    /* 0x00b8dbc0: ldr      x3, [sp, #0x48] */ ARM64("ldr x3, [sp, #0x48]");
    /* 0x00b8dbc4: ldr      x23, [sp, #0xb8] */ ARM64("ldr x23, [sp, #0xb8]");
    /* 0x00b8dbc8: mov      x17, x27 */ ARM64("mov x17, x27");
    /* 0x00b8dbcc: mov      x16, x24 */ ARM64("mov x16, x24");
loc_00b8dbd0:
    /* 0x00b8dbd0: mov      x27, #0 */ ARM64("mov x27, #0");
loc_00b8dbd4:
    /* 0x00b8dbd4: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b8dbd8:
    /* 0x00b8dbd8: mov      w9, #8 */ ARM64("mov w9, #8");
    /* 0x00b8dbdc: madd     x10, x26, x22, x20 */ ARM64("madd x10, x26, x22, x20");
    /* 0x00b8dbe0: stp      x8, x9, [x10] */ ARM64("stp x8, x9, [x10]");
    /* 0x00b8dbe4: str      x27, [x10, #0x10] */ ARM64("str x27, [x10, #0x10]");
    /* 0x00b8dbe8: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00b8dbec: cmp      x26, x21 */ ARM64("cmp x26, x21");
    /* 0x00b8dbf0: b.ne     #0xb8d960 */ if (COND_NE) goto loc_00b8d960;
    /* 0x00b8dbf4: b        #0xb8e024 */ goto loc_00b8e024;
loc_00b8dbf8:
    /* 0x00b8dbf8: cbz      x27, #0xb8dbd4 */ if (x27 == 0) goto loc_00b8dbd4;
loc_00b8dbfc:
    /* 0x00b8dbfc: str      x5, [sp, #0x58] */ ARM64("str x5, [sp, #0x58]");
    /* 0x00b8dc00: add      x22, x24, #8 */ ARM64("add x22, x24, #8");
    /* 0x00b8dc04: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8dc08: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b8dc0c: ands     x9, x8, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x9, x8, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8dc10: b.ne     #0xb8dc2c */ if (COND_NE) goto loc_00b8dc2c;
loc_00b8dc14:
    /* 0x00b8dc14: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b8dc18: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8dc1c: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b8dc20: sub      x24, x24, #0x20 */ ARM64("sub x24, x24, #0x20");
    /* 0x00b8dc24: and      x9, x8, #0x8080808080808080 */ ARM64("and x9, x8, #0x8080808080808080");
    /* 0x00b8dc28: cbz      x9, #0xb8dc14 */ if (x9 == 0) goto loc_00b8dc14;
loc_00b8dc2c:
    /* 0x00b8dc2c: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00b8dc30: cbz      x8, #0xb8e06c */ if (x8 == 0) goto loc_00b8e06c;
    /* 0x00b8dc34: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8dc38: sub      x10, x9, #1 */ ARM64("sub x10, x9, #1");
    /* 0x00b8dc3c: rbit     x11, x9 */ ARM64("rbit x11, x9");
    /* 0x00b8dc40: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8dc44: and      x23, x10, x9 */ ARM64("and x23, x10, x9");
    /* 0x00b8dc48: lsr      x9, x11, #1 */ ARM64("lsr x9, x11, #1");
    /* 0x00b8dc4c: and      x9, x9, #0x3c */ ARM64("and x9, x9, #0x3c");
    /* 0x00b8dc50: sub      x9, x24, x9 */ ARM64("sub x9, x24, x9");
    /* 0x00b8dc54: sub      x14, x27, #1 */ ARM64("sub x14, x27, #1");
    /* 0x00b8dc58: ldur     w9, [x9, #-4] */ ARM64("ldur w9, [x9, #-4]");
    /* 0x00b8dc5c: orr      x10, x9, #0x400000000000000 */ ARM64("orr x10, x9, #0x400000000000000");
    /* 0x00b8dc60: eor      x11, x10, x30 */ ARM64("eor x11, x10, x30");
    /* 0x00b8dc64: add      x12, x11, x7 */ ARM64("add x12, x11, x7");
    /* 0x00b8dc68: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8dc6c: add      x12, x12, x0 */ ARM64("add x12, x12, x0");
    /* 0x00b8dc70: add      x13, x11, x19 */ ARM64("add x13, x11, x19");
    /* 0x00b8dc74: eor      x11, x13, x11, ror #43 */ ARM64("eor x11, x13, x11, ror #43");
    /* 0x00b8dc78: eor      x10, x13, x10 */ ARM64("eor x10, x13, x10");
    /* 0x00b8dc7c: ldr      x13, [sp, #0x90] */ ARM64("ldr x13, [sp, #0x90]");
    /* 0x00b8dc80: eor      x13, x12, x13 */ ARM64("eor x13, x12, x13");
    /* 0x00b8dc84: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8dc88: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b8dc8c: add      x10, x10, x13 */ ARM64("add x10, x10, x13");
    /* 0x00b8dc90: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8dc94: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b8dc98: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8dc9c: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b8dca0: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8dca4: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b8dca8: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b8dcac: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b8dcb0: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8dcb4: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b8dcb8: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8dcbc: eor      x13, x10, x13, ror #51 */ ARM64("eor x13, x10, x13, ror #51");
    /* 0x00b8dcc0: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8dcc4: ror      x10, x10, #0x20 */ ARM64("ror x10, x10, #0x20");
    /* 0x00b8dcc8: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8dccc: add      x10, x11, x10 */ ARM64("add x10, x11, x10");
    /* 0x00b8dcd0: eor      x13, x12, x13, ror #47 */ ARM64("eor x13, x12, x13, ror #47");
    /* 0x00b8dcd4: eor      x11, x10, x11, ror #43 */ ARM64("eor x11, x10, x11, ror #43");
    /* 0x00b8dcd8: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8dcdc: add      x10, x13, x10 */ ARM64("add x10, x13, x10");
    /* 0x00b8dce0: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8dce4: eor      x10, x10, x13, ror #51 */ ARM64("eor x10, x10, x13, ror #51");
    /* 0x00b8dce8: eor      x11, x12, x11, ror #48 */ ARM64("eor x11, x12, x11, ror #48");
    /* 0x00b8dcec: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b8dcf0: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b8dcf4: eor      x10, x11, x10, ror #47 */ ARM64("eor x10, x11, x10, ror #47");
    /* 0x00b8dcf8: eor      x10, x10, x12, ror #32 */ ARM64("eor x10, x10, x12, ror #32");
    /* 0x00b8dcfc: eor      x10, x10, x12 */ ARM64("eor x10, x10, x12");
    /* 0x00b8dd00: lsr      x11, x10, #0x39 */ ARM64("lsr x11, x10, #0x39");
    /* 0x00b8dd04: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
loc_00b8dd08:
    /* 0x00b8dd08: ldr      x11, [sp, #0xb8] */ ARM64("ldr x11, [sp, #0xb8]");
    /* 0x00b8dd0c: and      x10, x10, x11 */ ARM64("and x10, x10, x11");
    /* 0x00b8dd10: ldr      x11, [sp, #0xc0] */ ARM64("ldr x11, [sp, #0xc0]");
    /* 0x00b8dd14: ldr      d1, [x11, x10] */ ARM64("ldr d1, [x11, x10]");
    /* 0x00b8dd18: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8dd1c: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b8dd20: ands     x11, x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x11, x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8dd24: b.eq     #0xb8dd58 */ if (COND_EQ) goto loc_00b8dd58;
loc_00b8dd28:
    /* 0x00b8dd28: rbit     x12, x11 */ ARM64("rbit x12, x11");
    /* 0x00b8dd2c: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b8dd30: add      x12, x10, x12, lsr #3 */ ARM64("add x12, x10, x12, lsr #3");
    /* 0x00b8dd34: ldp      x15, x13, [sp, #0xb8] */ ARM64("ldp x15, x13, [sp, #0xb8]");
    /* 0x00b8dd38: and      x12, x12, x15 */ ARM64("and x12, x12, x15");
    /* 0x00b8dd3c: sub      x12, x13, x12, lsl #4 */ ARM64("sub x12, x13, x12, lsl #4");
    /* 0x00b8dd40: ldur     w13, [x12, #-0x10] */ ARM64("ldur w13, [x12, #-0x10]");
    /* 0x00b8dd44: cmp      w9, w13 */ ARM64("cmp w9, w13");
    /* 0x00b8dd48: b.eq     #0xb8dd74 */ if (COND_EQ) goto loc_00b8dd74;
    /* 0x00b8dd4c: sub      x12, x11, #1 */ ARM64("sub x12, x11, #1");
    /* 0x00b8dd50: ands     x11, x12, x11 */ ARM64("ands x11, x12, x11");
    /* 0x00b8dd54: b.ne     #0xb8dd28 */ if (COND_NE) goto loc_00b8dd28;
loc_00b8dd58:
    /* 0x00b8dd58: cmeq     v1.8b, v1.8b, v3.8b */ ARM64("cmeq v1.8b, v1.8b, v3.8b");
    /* 0x00b8dd5c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8dd60: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b8dd64: tbnz     w11, #0, #0xb8e06c */ if (((w11 >> #0) & 1) != 0) goto loc_00b8e06c;
    /* 0x00b8dd68: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8dd6c: add      x10, x10, x8 */ ARM64("add x10, x10, x8");
    /* 0x00b8dd70: b        #0xb8dd08 */ goto loc_00b8dd08;
loc_00b8dd74:
    /* 0x00b8dd74: stp      x0, x19, [sp, #0x60] */ ARM64("stp x0, x19, [sp, #0x60]");
    /* 0x00b8dd78: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b8dd7c: adds     x8, x14, #1 */ ARM64("adds x8, x14, #1");
    /* 0x00b8dd80: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00b8dd84: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00b8dd88: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b8dd8c: csel     x20, x8, x9, hi */ ARM64("csel x20, x8, x9, hi");
    /* 0x00b8dd90: lsr      x8, x8, #0x3d */ ARM64("lsr x8, x8, #0x3d");
    /* 0x00b8dd94: cbnz     x8, #0xb90ec0 */ if (x8 != 0) goto loc_00b90ec0;
    /* 0x00b8dd98: lsl      x28, x20, #3 */ ARM64("lsl x28, x20, #3");
    /* 0x00b8dd9c: mov      x8, #0x7ffffffffffffff8 */ ARM64("mov x8, #0x7ffffffffffffff8");
    /* 0x00b8dda0: cmp      x28, x8 */ ARM64("cmp x28, x8");
    /* 0x00b8dda4: b.hi     #0xb90ec0 */ if (COND_HI) goto loc_00b90ec0;
    /* 0x00b8dda8: stp      x30, x7, [sp, #0x18] */ ARM64("stp x30, x7, [sp, #0x18]");
    /* 0x00b8ddac: stp      x1, x17, [sp, #0x28] */ ARM64("stp x1, x17, [sp, #0x28]");
    /* 0x00b8ddb0: str      x16, [sp, #8] */ ARM64("str x16, [sp, #8]");
    /* 0x00b8ddb4: ldur     x21, [x12, #-8] */ ARM64("ldur x21, [x12, #-8]");
    /* 0x00b8ddb8: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b8ddbc: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8ddc0: cbz      x0, #0xb90eb8 */ if (x0 == 0) goto loc_00b90eb8;
    /* 0x00b8ddc4: str      x21, [x0] */ ARM64("str x21, [x0]");
    /* 0x00b8ddc8: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00b8ddcc: mov      w19, #1 */ ARM64("mov w19, #1");
    /* 0x00b8ddd0: stp      x20, x0, [x29, #-0xf0] */ ARM64("stp x20, x0, [x29, #-0xf0]");
    /* 0x00b8ddd4: str      x0, [sp, #0x10] */ ARM64("str x0, [sp, #0x10]");
    /* 0x00b8ddd8: ldr      x21, [sp, #0x118] */ ARM64("ldr x21, [sp, #0x118]");
    /* 0x00b8dddc: ldp      x1, x17, [sp, #0x28] */ ARM64("ldp x1, x17, [sp, #0x28]");
    /* 0x00b8dde0: ldp      x30, x7, [sp, #0x18] */ ARM64("ldp x30, x7, [sp, #0x18]");
    /* 0x00b8dde4: ldr      x0, [sp, #0x60] */ ARM64("ldr x0, [sp, #0x60]");
    /* 0x00b8dde8: movi     v3.2d, #0xffffffffffffffff */ ARM64("movi v3.2d, #0xffffffffffffffff");
    /* 0x00b8ddec: sub      x15, x27, #1 */ ARM64("sub x15, x27, #1");
    /* 0x00b8ddf0: b        #0xb8ddfc */ goto loc_00b8ddfc;
loc_00b8ddf4:
    /* 0x00b8ddf4: str      x20, [x8, x19, lsl #3] */ ARM64("str x20, [x8, x19, lsl #3]");
    /* 0x00b8ddf8: add      x19, x19, #1 */ ARM64("add x19, x19, #1");
loc_00b8ddfc:
    /* 0x00b8ddfc: stur     x19, [x29, #-0xe0] */ ARM64("stur x19, [x29, #-0xe0]");
    /* 0x00b8de00: cbz      x15, #0xb8dfb8 */ if (x15 == 0) goto loc_00b8dfb8;
    /* 0x00b8de04: cbnz     x23, #0xb8de20 */ if (x23 != 0) goto loc_00b8de20;
loc_00b8de08:
    /* 0x00b8de08: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b8de0c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8de10: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b8de14: sub      x24, x24, #0x20 */ ARM64("sub x24, x24, #0x20");
    /* 0x00b8de18: and      x23, x9, #0x8080808080808080 */ ARM64("and x23, x9, #0x8080808080808080");
    /* 0x00b8de1c: cbz      x23, #0xb8de08 */ if (x23 == 0) goto loc_00b8de08;
loc_00b8de20:
    /* 0x00b8de20: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b8de24: sub      x10, x23, #1 */ ARM64("sub x10, x23, #1");
    /* 0x00b8de28: rbit     x11, x23 */ ARM64("rbit x11, x23");
    /* 0x00b8de2c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8de30: and      x23, x10, x23 */ ARM64("and x23, x10, x23");
    /* 0x00b8de34: lsr      x10, x11, #1 */ ARM64("lsr x10, x11, #1");
    /* 0x00b8de38: and      x10, x10, #0x3c */ ARM64("and x10, x10, #0x3c");
    /* 0x00b8de3c: sub      x10, x24, x10 */ ARM64("sub x10, x24, x10");
    /* 0x00b8de40: sub      x15, x15, #1 */ ARM64("sub x15, x15, #1");
    /* 0x00b8de44: ldur     w10, [x10, #-4] */ ARM64("ldur w10, [x10, #-4]");
    /* 0x00b8de48: orr      x11, x10, #0x400000000000000 */ ARM64("orr x11, x10, #0x400000000000000");
    /* 0x00b8de4c: eor      x12, x11, x30 */ ARM64("eor x12, x11, x30");
    /* 0x00b8de50: add      x13, x12, x7 */ ARM64("add x13, x12, x7");
    /* 0x00b8de54: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b8de58: add      x13, x13, x0 */ ARM64("add x13, x13, x0");
    /* 0x00b8de5c: ldr      x14, [sp, #0x68] */ ARM64("ldr x14, [sp, #0x68]");
    /* 0x00b8de60: add      x14, x12, x14 */ ARM64("add x14, x12, x14");
    /* 0x00b8de64: eor      x12, x14, x12, ror #43 */ ARM64("eor x12, x14, x12, ror #43");
    /* 0x00b8de68: eor      x11, x14, x11 */ ARM64("eor x11, x14, x11");
    /* 0x00b8de6c: ldr      x14, [sp, #0x90] */ ARM64("ldr x14, [sp, #0x90]");
    /* 0x00b8de70: eor      x14, x13, x14 */ ARM64("eor x14, x13, x14");
    /* 0x00b8de74: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b8de78: eor      x13, x13, #0xff */ ARM64("eor x13, x13, #0xff");
    /* 0x00b8de7c: add      x11, x11, x14 */ ARM64("add x11, x11, x14");
    /* 0x00b8de80: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b8de84: eor      x14, x11, x14, ror #51 */ ARM64("eor x14, x11, x14, ror #51");
    /* 0x00b8de88: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b8de8c: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8de90: add      x13, x14, x13 */ ARM64("add x13, x14, x13");
    /* 0x00b8de94: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b8de98: eor      x14, x13, x14, ror #47 */ ARM64("eor x14, x13, x14, ror #47");
    /* 0x00b8de9c: eor      x12, x11, x12, ror #43 */ ARM64("eor x12, x11, x12, ror #43");
    /* 0x00b8dea0: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b8dea4: add      x11, x14, x11 */ ARM64("add x11, x14, x11");
    /* 0x00b8dea8: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b8deac: eor      x14, x11, x14, ror #51 */ ARM64("eor x14, x11, x14, ror #51");
    /* 0x00b8deb0: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b8deb4: ror      x11, x11, #0x20 */ ARM64("ror x11, x11, #0x20");
    /* 0x00b8deb8: add      x13, x14, x13 */ ARM64("add x13, x14, x13");
    /* 0x00b8debc: add      x11, x12, x11 */ ARM64("add x11, x12, x11");
    /* 0x00b8dec0: eor      x14, x13, x14, ror #47 */ ARM64("eor x14, x13, x14, ror #47");
    /* 0x00b8dec4: eor      x12, x11, x12, ror #43 */ ARM64("eor x12, x11, x12, ror #43");
    /* 0x00b8dec8: ror      x13, x13, #0x20 */ ARM64("ror x13, x13, #0x20");
    /* 0x00b8decc: add      x11, x14, x11 */ ARM64("add x11, x14, x11");
    /* 0x00b8ded0: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b8ded4: eor      x11, x11, x14, ror #51 */ ARM64("eor x11, x11, x14, ror #51");
    /* 0x00b8ded8: eor      x12, x13, x12, ror #48 */ ARM64("eor x12, x13, x12, ror #48");
    /* 0x00b8dedc: add      x13, x11, x13 */ ARM64("add x13, x11, x13");
    /* 0x00b8dee0: ror      x12, x12, #0x2b */ ARM64("ror x12, x12, #0x2b");
    /* 0x00b8dee4: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b8dee8: eor      x11, x11, x13, ror #32 */ ARM64("eor x11, x11, x13, ror #32");
    /* 0x00b8deec: eor      x11, x11, x13 */ ARM64("eor x11, x11, x13");
    /* 0x00b8def0: lsr      x12, x11, #0x39 */ ARM64("lsr x12, x11, #0x39");
    /* 0x00b8def4: dup      v0.8b, w12 */ ARM64("dup v0.8b, w12");
loc_00b8def8:
    /* 0x00b8def8: ldp      x13, x12, [sp, #0xb8] */ ARM64("ldp x13, x12, [sp, #0xb8]");
    /* 0x00b8defc: and      x11, x11, x13 */ ARM64("and x11, x11, x13");
    /* 0x00b8df00: ldr      d1, [x12, x11] */ ARM64("ldr d1, [x12, x11]");
    /* 0x00b8df04: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8df08: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8df0c: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8df10: b.eq     #0xb8df48 */ if (COND_EQ) goto loc_00b8df48;
loc_00b8df14:
    /* 0x00b8df14: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b8df18: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b8df1c: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b8df20: ldr      x14, [sp, #0xb8] */ ARM64("ldr x14, [sp, #0xb8]");
    /* 0x00b8df24: and      x13, x13, x14 */ ARM64("and x13, x13, x14");
    /* 0x00b8df28: ldr      x14, [sp, #0xc0] */ ARM64("ldr x14, [sp, #0xc0]");
    /* 0x00b8df2c: sub      x13, x14, x13, lsl #4 */ ARM64("sub x13, x14, x13, lsl #4");
    /* 0x00b8df30: ldur     w14, [x13, #-0x10] */ ARM64("ldur w14, [x13, #-0x10]");
    /* 0x00b8df34: cmp      w10, w14 */ ARM64("cmp w10, w14");
    /* 0x00b8df38: b.eq     #0xb8df64 */ if (COND_EQ) goto loc_00b8df64;
    /* 0x00b8df3c: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b8df40: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b8df44: b.ne     #0xb8df14 */ if (COND_NE) goto loc_00b8df14;
loc_00b8df48:
    /* 0x00b8df48: cmeq     v1.8b, v1.8b, v3.8b */ ARM64("cmeq v1.8b, v1.8b, v3.8b");
    /* 0x00b8df4c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8df50: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b8df54: tbnz     w12, #0, #0xb906f8 */ if (((w12 >> #0) & 1) != 0) goto loc_00b906f8;
    /* 0x00b8df58: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00b8df5c: add      x11, x11, x9 */ ARM64("add x11, x11, x9");
    /* 0x00b8df60: b        #0xb8def8 */ goto loc_00b8def8;
loc_00b8df64:
    /* 0x00b8df64: ldur     x20, [x13, #-8] */ ARM64("ldur x20, [x13, #-8]");
    /* 0x00b8df68: ldur     x9, [x29, #-0xf0] */ ARM64("ldur x9, [x29, #-0xf0]");
    /* 0x00b8df6c: cmp      x19, x9 */ ARM64("cmp x19, x9");
    /* 0x00b8df70: b.ne     #0xb8ddf4 */ if (COND_NE) goto loc_00b8ddf4;
    /* 0x00b8df74: mov      x28, x15 */ ARM64("mov x28, x15");
    /* 0x00b8df78: adds     x8, x15, #1 */ ARM64("adds x8, x15, #1");
    /* 0x00b8df7c: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00b8df80: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b8df84: mov      x1, x19 */ ARM64("mov x1, x19");
    /* 0x00b8df88: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b8df8c: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00b8df90: bl       #0xc6c0cc */ CALL_DIRECT(sub_00c6c0cc);
    /* 0x00b8df94: ldur     x8, [x29, #-0xe8] */ ARM64("ldur x8, [x29, #-0xe8]");
    /* 0x00b8df98: ldp      x1, x17, [sp, #0x28] */ ARM64("ldp x1, x17, [sp, #0x28]");
    /* 0x00b8df9c: ldp      x30, x7, [sp, #0x18] */ ARM64("ldp x30, x7, [sp, #0x18]");
    /* 0x00b8dfa0: ldr      x0, [sp, #0x60] */ ARM64("ldr x0, [sp, #0x60]");
    /* 0x00b8dfa4: movi     v3.2d, #0xffffffffffffffff */ ARM64("movi v3.2d, #0xffffffffffffffff");
    /* 0x00b8dfa8: mov      x15, x28 */ ARM64("mov x15, x28");
    /* 0x00b8dfac: b        #0xb8ddf4 */ goto loc_00b8ddf4;
loc_00b8dfb0:
    /* 0x00b8dfb0: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00b8dfb4: b        #0xb8dbd8 */ goto loc_00b8dbd8;
loc_00b8dfb8:
    /* 0x00b8dfb8: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b8dfbc: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b8dfc0: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b8dfc4: ldr      w9, [sp, #0x70] */ ARM64("ldr w9, [sp, #0x70]");
    /* 0x00b8dfc8: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b8dfcc: tbnz     w8, #0, #0xb8dfe8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8dfe8;
    /* 0x00b8dfd0: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b8dfd4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8dfd8: movi     v3.2d, #0xffffffffffffffff */ ARM64("movi v3.2d, #0xffffffffffffffff");
    /* 0x00b8dfdc: ldr      x0, [sp, #0x60] */ ARM64("ldr x0, [sp, #0x60]");
    /* 0x00b8dfe0: ldp      x30, x7, [sp, #0x18] */ ARM64("ldp x30, x7, [sp, #0x18]");
    /* 0x00b8dfe4: ldp      x1, x17, [sp, #0x28] */ ARM64("ldp x1, x17, [sp, #0x28]");
loc_00b8dfe8:
    /* 0x00b8dfe8: ldp      x8, x9, [x29, #-0xf0] */ ARM64("ldp x8, x9, [x29, #-0xf0]");
    /* 0x00b8dfec: ldr      x28, [sp, #0xd8] */ ARM64("ldr x28, [sp, #0xd8]");
    /* 0x00b8dff0: ldp      x20, x23, [sp, #0xb0] */ ARM64("ldp x20, x23, [sp, #0xb0]");
    /* 0x00b8dff4: ldr      x16, [sp, #8] */ ARM64("ldr x16, [sp, #8]");
    /* 0x00b8dff8: ldp      x3, x2, [sp, #0x48] */ ARM64("ldp x3, x2, [sp, #0x48]");
    /* 0x00b8dffc: ldp      x6, x4, [sp, #0x38] */ ARM64("ldp x6, x4, [sp, #0x38]");
    /* 0x00b8e000: ldr      x5, [sp, #0x58] */ ARM64("ldr x5, [sp, #0x58]");
    /* 0x00b8e004: ldr      x19, [sp, #0x68] */ ARM64("ldr x19, [sp, #0x68]");
    /* 0x00b8e008: mov      w22, #0x18 */ ARM64("mov w22, #0x18");
    /* 0x00b8e00c: madd     x10, x26, x22, x20 */ ARM64("madd x10, x26, x22, x20");
    /* 0x00b8e010: stp      x8, x9, [x10] */ ARM64("stp x8, x9, [x10]");
    /* 0x00b8e014: str      x27, [x10, #0x10] */ ARM64("str x27, [x10, #0x10]");
    /* 0x00b8e018: add      x26, x26, #1 */ ARM64("add x26, x26, #1");
    /* 0x00b8e01c: cmp      x26, x21 */ ARM64("cmp x26, x21");
    /* 0x00b8e020: b.ne     #0xb8d960 */ if (COND_NE) goto loc_00b8d960;
loc_00b8e024:
    /* 0x00b8e024: mov      x24, x21 */ ARM64("mov x24, x21");
    /* 0x00b8e028: mov      x19, #0x6573 */ ARM64("mov x19, #0x6573");
    /* 0x00b8e02c: movk     x19, #0x7974, lsl #16 */ ARM64("movk x19, #0x7974, lsl #16");
    /* 0x00b8e030: movk     x19, #0x6462, lsl #32 */ ARM64("movk x19, #0x6462, lsl #32");
    /* 0x00b8e034: movk     x19, #0x7465, lsl #48 */ ARM64("movk x19, #0x7465, lsl #48");
    /* 0x00b8e038: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8e03c: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b8e040: cbnz     x21, #0xb8d8bc */ if (x21 != 0) goto loc_00b8d8bc;
loc_00b8e044:
    /* 0x00b8e044: mov      x27, #0 */ ARM64("mov x27, #0");
    /* 0x00b8e048: sub      x0, x21, #1 */ ARM64("sub x0, x21, #1");
    /* 0x00b8e04c: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b8e050: add      x2, x2, #0x8f8 */ ARM64("add x2, x2, #0x8f8");
    /* 0x00b8e054: mov      w26, #8 */ ARM64("mov w26, #8");
    /* 0x00b8e058: str      xzr, [sp, #0x118] */ ARM64("str xzr, [sp, #0x118]");
    /* 0x00b8e05c: b        #0xb90d78 */ goto loc_00b90d78;
loc_00b8e060:
    /* 0x00b8e060: mov      w27, #1 */ ARM64("mov w27, #1");
    /* 0x00b8e064: mov      x8, x26 */ ARM64("mov x8, x26");
    /* 0x00b8e068: b        #0xb8e0cc */ goto loc_00b8e0cc;
loc_00b8e06c:
    /* 0x00b8e06c: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b8e070: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00b8e074: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b8e078: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b8e07c:
    /* 0x00b8e07c: sub      x11, x21, #1 */ ARM64("sub x11, x21, #1");
    /* 0x00b8e080: and      x12, x11, #0xfffffffffffffffc */ ARM64("and x12, x11, #0xfffffffffffffffc");
    /* 0x00b8e084: add      x8, x26, x12, lsl #3 */ ARM64("add x8, x26, x12, lsl #3");
    /* 0x00b8e088: orr      x9, x12, #1 */ ARM64("orr x9, x12, #1");
    /* 0x00b8e08c: add      x13, x26, #0x10 */ ARM64("add x13, x26, #0x10");
    /* 0x00b8e090: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b8e094: and      x14, x11, #0xfffffffffffffffc */ ARM64("and x14, x11, #0xfffffffffffffffc");
loc_00b8e098:
    /* 0x00b8e098: stp      q0, q0, [x13, #-0x10] */ ARM64("stp q0, q0, [x13, #-0x10]");
    /* 0x00b8e09c: add      x13, x13, #0x20 */ ARM64("add x13, x13, #0x20");
    /* 0x00b8e0a0: subs     x14, x14, #4 */ ARM64("subs x14, x14, #4");
    /* 0x00b8e0a4: b.ne     #0xb8e098 */ if (COND_NE) goto loc_00b8e098;
    /* 0x00b8e0a8: mov      x27, x21 */ ARM64("mov x27, x21");
    /* 0x00b8e0ac: cmp      x11, x12 */ ARM64("cmp x11, x12");
    /* 0x00b8e0b0: b.eq     #0xb8e0cc */ if (COND_EQ) goto loc_00b8e0cc;
loc_00b8e0b4:
    /* 0x00b8e0b4: sub      x9, x21, x9 */ ARM64("sub x9, x21, x9");
    /* 0x00b8e0b8: mov      x11, #-1 */ ARM64("mov x11, #-1");
loc_00b8e0bc:
    /* 0x00b8e0bc: str      x11, [x8], #8 */ ARM64("str x11, [x8], #8");
    /* 0x00b8e0c0: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b8e0c4: b.ne     #0xb8e0bc */ if (COND_NE) goto loc_00b8e0bc;
    /* 0x00b8e0c8: mov      x27, x21 */ ARM64("mov x27, x21");
loc_00b8e0cc:
    /* 0x00b8e0cc: mov      x9, #-1 */ ARM64("mov x9, #-1");
    /* 0x00b8e0d0: str      x9, [x8] */ ARM64("str x9, [x8]");
    /* 0x00b8e0d4: sub      x0, x21, #1 */ ARM64("sub x0, x21, #1");
    /* 0x00b8e0d8: cmp      x0, x27 */ ARM64("cmp x0, x27");
    /* 0x00b8e0dc: b.hs     #0xb90e7c */ if (COND_HS) goto loc_00b90e7c;
    /* 0x00b8e0e0: str      x0, [x26, x0, lsl #3] */ ARM64("str x0, [x26, x0, lsl #3]");
    /* 0x00b8e0e4: cbz      x0, #0xb8e208 */ if (x0 == 0) goto loc_00b8e208;
    /* 0x00b8e0e8: mov      w15, #0 */ ARM64("mov w15, #0");
    /* 0x00b8e0ec: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b8e0f0: add      x2, x2, #0x910 */ ARM64("add x2, x2, #0x910");
    /* 0x00b8e0f4: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b8e0f8: add      x8, x8, #0x978 */ ARM64("add x8, x8, #0x978");
    /* 0x00b8e0fc: adrp     x11, #0xefc000 */ ARM64("adrp x11, #0xefc000");
    /* 0x00b8e100: add      x11, x11, #0x940 */ ARM64("add x11, x11, #0x940");
    /* 0x00b8e104: mov      w13, #0x18 */ ARM64("mov w13, #0x18");
    /* 0x00b8e108: adrp     x12, #0xefc000 */ ARM64("adrp x12, #0xefc000");
    /* 0x00b8e10c: add      x12, x12, #0x990 */ ARM64("add x12, x12, #0x990");
    /* 0x00b8e110: sub      x9, x21, #1 */ ARM64("sub x9, x21, #1");
    /* 0x00b8e114: adrp     x14, #0xefc000 */ ARM64("adrp x14, #0xefc000");
    /* 0x00b8e118: add      x14, x14, #0x9a8 */ ARM64("add x14, x14, #0x9a8");
loc_00b8e11c:
    /* 0x00b8e11c: sub      x16, x9, #1 */ ARM64("sub x16, x9, #1");
    /* 0x00b8e120: cmp      x10, x24 */ ARM64("cmp x10, x24");
    /* 0x00b8e124: b.hs     #0xb90d64 */ if (COND_HS) goto loc_00b90d64;
    /* 0x00b8e128: madd     x9, x16, x13, x20 */ ARM64("madd x9, x16, x13, x20");
    /* 0x00b8e12c: ldp      x17, x9, [x9, #8] */ ARM64("ldp x17, x9, [x9, #8]");
    /* 0x00b8e130: lsl      x1, x9, #3 */ ARM64("lsl x1, x9, #3");
    /* 0x00b8e134: add      x3, x17, x1 */ ARM64("add x3, x17, x1");
loc_00b8e138:
    /* 0x00b8e138: cbz      x1, #0xb90b60 */ if (x1 == 0) goto loc_00b90b60;
    /* 0x00b8e13c: ldr      x9, [x17], #8 */ ARM64("ldr x9, [x17], #8");
    /* 0x00b8e140: cmp      x9, x27 */ ARM64("cmp x9, x27");
    /* 0x00b8e144: b.hs     #0xb9089c */ if (COND_HS) goto loc_00b9089c;
    /* 0x00b8e148: ldr      x4, [x26, x9, lsl #3] */ ARM64("ldr x4, [x26, x9, lsl #3]");
    /* 0x00b8e14c: sub      x1, x1, #8 */ ARM64("sub x1, x1, #8");
    /* 0x00b8e150: cmn      x4, #1 */ ARM64("cmn x4, #1");
    /* 0x00b8e154: b.eq     #0xb8e138 */ if (COND_EQ) goto loc_00b8e138;
    /* 0x00b8e158: cmp      x17, x3 */ ARM64("cmp x17, x3");
    /* 0x00b8e15c: b.eq     #0xb8e1d0 */ if (COND_EQ) goto loc_00b8e1d0;
    /* 0x00b8e160: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b8e164: sub      x3, x3, x17 */ ARM64("sub x3, x3, x17");
    /* 0x00b8e168: lsr      x3, x3, #3 */ ARM64("lsr x3, x3, #3");
    /* 0x00b8e16c: b        #0xb8e17c */ goto loc_00b8e17c;
loc_00b8e170:
    /* 0x00b8e170: add      x1, x1, #1 */ ARM64("add x1, x1, #1");
    /* 0x00b8e174: cmp      x1, x3 */ ARM64("cmp x1, x3");
    /* 0x00b8e178: b.eq     #0xb8e1d0 */ if (COND_EQ) goto loc_00b8e1d0;
loc_00b8e17c:
    /* 0x00b8e17c: ldr      x4, [x17, x1, lsl #3] */ ARM64("ldr x4, [x17, x1, lsl #3]");
    /* 0x00b8e180: cmp      x4, x27 */ ARM64("cmp x4, x27");
    /* 0x00b8e184: b.hs     #0xb90ba4 */ if (COND_HS) goto loc_00b90ba4;
    /* 0x00b8e188: ldr      x5, [x26, x4, lsl #3] */ ARM64("ldr x5, [x26, x4, lsl #3]");
    /* 0x00b8e18c: cmn      x5, #1 */ ARM64("cmn x5, #1");
    /* 0x00b8e190: b.eq     #0xb8e170 */ if (COND_EQ) goto loc_00b8e170;
loc_00b8e194:
    /* 0x00b8e194: cmp      x9, x4 */ ARM64("cmp x9, x4");
    /* 0x00b8e198: cset     w5, hi */ ARM64("cset w5, hi");
    /* 0x00b8e19c: csinv    w5, w5, wzr, hs */ ARM64("csinv w5, w5, wzr, hs");
    /* 0x00b8e1a0: and      w5, w5, #0xff */ ARM64("and w5, w5, #0xff");
    /* 0x00b8e1a4: cmp      w5, #0xff */ ARM64("cmp w5, #0xff");
    /* 0x00b8e1a8: b.ne     #0xb8e1bc */ if (COND_NE) goto loc_00b8e1bc;
    /* 0x00b8e1ac: cmp      x9, x27 */ ARM64("cmp x9, x27");
    /* 0x00b8e1b0: b.hs     #0xb90898 */ if (COND_HS) goto loc_00b90898;
    /* 0x00b8e1b4: ldr      x9, [x26, x9, lsl #3] */ ARM64("ldr x9, [x26, x9, lsl #3]");
    /* 0x00b8e1b8: b        #0xb8e194 */ goto loc_00b8e194;
loc_00b8e1bc:
    /* 0x00b8e1bc: cbz      w5, #0xb8e170 */ if (w5 == 0) goto loc_00b8e170;
    /* 0x00b8e1c0: cmp      x4, x27 */ ARM64("cmp x4, x27");
    /* 0x00b8e1c4: b.hs     #0xb90c0c */ if (COND_HS) goto loc_00b90c0c;
    /* 0x00b8e1c8: ldr      x4, [x26, x4, lsl #3] */ ARM64("ldr x4, [x26, x4, lsl #3]");
    /* 0x00b8e1cc: b        #0xb8e194 */ goto loc_00b8e194;
loc_00b8e1d0:
    /* 0x00b8e1d0: cmp      x10, x27 */ ARM64("cmp x10, x27");
    /* 0x00b8e1d4: b.hs     #0xb90d70 */ if (COND_HS) goto loc_00b90d70;
    /* 0x00b8e1d8: ldr      x1, [x26, x16, lsl #3] */ ARM64("ldr x1, [x26, x16, lsl #3]");
    /* 0x00b8e1dc: mov      x17, x15 */ ARM64("mov x17, x15");
    /* 0x00b8e1e0: cmp      x9, x1 */ ARM64("cmp x9, x1");
    /* 0x00b8e1e4: b.eq     #0xb8e1f0 */ if (COND_EQ) goto loc_00b8e1f0;
    /* 0x00b8e1e8: str      x9, [x26, x16, lsl #3] */ ARM64("str x9, [x26, x16, lsl #3]");
    /* 0x00b8e1ec: mov      w17, #1 */ ARM64("mov w17, #1");
loc_00b8e1f0:
    /* 0x00b8e1f0: cmp      x16, #0 */ ARM64("cmp x16, #0");
    /* 0x00b8e1f4: cset     w9, ne */ ARM64("cset w9, ne");
    /* 0x00b8e1f8: and      w15, w9, w17 */ ARM64("and w15, w9, w17");
    /* 0x00b8e1fc: csel     x9, x0, x16, eq */ ARM64("csel x9, x0, x16, eq");
    /* 0x00b8e200: cbnz     x16, #0xb8e11c */ if (x16 != 0) goto loc_00b8e11c;
    /* 0x00b8e204: tbnz     w17, #0, #0xb8e11c */ if (((w17 >> #0) & 1) != 0) goto loc_00b8e11c;
loc_00b8e208:
    /* 0x00b8e208: ldrb     w8, [x28, #0x10] */ ARM64("ldrb w8, [x28, #0x10]");
    /* 0x00b8e20c: tbz      w8, #0, #0xb90b7c */ if (((w8 >> #0) & 1) == 0) goto loc_00b90b7c;
loc_00b8e210:
    /* 0x00b8e210: ldp      q0, q1, [sp, #0xe0] */ ARM64("ldp q0, q1, [sp, #0xe0]");
    /* 0x00b8e214: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8e218: add      x9, sp, #0x210 */ ARM64("add x9, sp, #0x210");
    /* 0x00b8e21c: ldr      q0, [x28] */ ARM64("ldr q0, [x28]");
    /* 0x00b8e220: ldr      x8, [x28] */ ARM64("ldr x8, [x28]");
    /* 0x00b8e224: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8e228: str      x8, [x28] */ ARM64("str x8, [x28]");
    /* 0x00b8e22c: str      q0, [sp, #0x230] */ ARM64("str q0, [sp, #0x230]");
    /* 0x00b8e230: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8e234: add      x2, x9, #0x20 */ ARM64("add x2, x9, #0x20");
    /* 0x00b8e238: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b8e23c: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00b8e240: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00b8e244: add      x28, x26, x27, lsl #3 */ ARM64("add x28, x26, x27, lsl #3");
    /* 0x00b8e248: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b8e24c: add      x8, x8, #0x8b0 */ ARM64("add x8, x8, #0x8b0");
    /* 0x00b8e250: str      x8, [sp, #0xf0] */ ARM64("str x8, [sp, #0xf0]");
    /* 0x00b8e254: mov      x22, x26 */ ARM64("mov x22, x26");
    /* 0x00b8e258: b        #0xb8e304 */ goto loc_00b8e304;
loc_00b8e25c:
    /* 0x00b8e25c: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00b8e260: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b8e264: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8e268: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b8e26c: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8e270: b.eq     #0xb8e2a0 */ if (COND_EQ) goto loc_00b8e2a0;
loc_00b8e274:
    /* 0x00b8e274: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b8e278: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b8e27c: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b8e280: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00b8e284: sub      x17, x9, x16, lsl #3 */ ARM64("sub x17, x9, x16, lsl #3");
    /* 0x00b8e288: ldur     w17, [x17, #-8] */ ARM64("ldur w17, [x17, #-8]");
    /* 0x00b8e28c: cmp      w20, w17 */ ARM64("cmp w20, w17");
    /* 0x00b8e290: b.eq     #0xb8e2ec */ if (COND_EQ) goto loc_00b8e2ec;
    /* 0x00b8e294: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b8e298: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b8e29c: b.ne     #0xb8e274 */ if (COND_NE) goto loc_00b8e274;
loc_00b8e2a0:
    /* 0x00b8e2a0: cmp      x10, #1 */ ARM64("cmp x10, #1");
    /* 0x00b8e2a4: b.eq     #0xb8e2c4 */ if (COND_EQ) goto loc_00b8e2c4;
    /* 0x00b8e2a8: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b8e2ac: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00b8e2b0: cbz      x10, #0xb8e2e0 */ if (x10 == 0) goto loc_00b8e2e0;
    /* 0x00b8e2b4: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b8e2b8: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b8e2bc: add      x10, x14, x10, lsr #3 */ ARM64("add x10, x14, x10, lsr #3");
    /* 0x00b8e2c0: and      x13, x10, x12 */ ARM64("and x13, x10, x12");
loc_00b8e2c4:
    /* 0x00b8e2c4: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b8e2c8: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b8e2cc: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8e2d0: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00b8e2d4: tbnz     w10, #0, #0xb8e440 */ if (((w10 >> #0) & 1) != 0) goto loc_00b8e440;
    /* 0x00b8e2d8: mov      w10, #1 */ ARM64("mov w10, #1");
    /* 0x00b8e2dc: b        #0xb8e2e0 */ goto loc_00b8e2e0;
loc_00b8e2e0:
    /* 0x00b8e2e0: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8e2e4: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b8e2e8: b        #0xb8e25c */ goto loc_00b8e25c;
loc_00b8e2ec:
    /* 0x00b8e2ec: neg      x8, x16 */ ARM64("neg x8, x16");
    /* 0x00b8e2f0: add      x8, x9, x8, lsl #3 */ ARM64("add x8, x9, x8, lsl #3");
    /* 0x00b8e2f4: stur     w27, [x8, #-4] */ ARM64("stur w27, [x8, #-4]");
    /* 0x00b8e2f8: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00b8e2fc: cmp      x22, x28 */ ARM64("cmp x22, x28");
    /* 0x00b8e300: b.eq     #0xb8e4d0 */ if (COND_EQ) goto loc_00b8e4d0;
loc_00b8e304:
    /* 0x00b8e304: cmp      x23, x21 */ ARM64("cmp x23, x21");
    /* 0x00b8e308: b.eq     #0xb90cd0 */ if (COND_EQ) goto loc_00b90cd0;
    /* 0x00b8e30c: ldr      x0, [x22], #8 */ ARM64("ldr x0, [x22], #8");
    /* 0x00b8e310: cmp      x0, x21 */ ARM64("cmp x0, x21");
    /* 0x00b8e314: b.hs     #0xb90cd8 */ if (COND_HS) goto loc_00b90cd8;
    /* 0x00b8e318: ldr      x8, [sp, #0x108] */ ARM64("ldr x8, [sp, #0x108]");
    /* 0x00b8e31c: ldr      w20, [x8, x23, lsl #2] */ ARM64("ldr w20, [x8, x23, lsl #2]");
    /* 0x00b8e320: ldr      w27, [x8, x0, lsl #2] */ ARM64("ldr w27, [x8, x0, lsl #2]");
    /* 0x00b8e324: ldr      x21, [sp, #0x238] */ ARM64("ldr x21, [sp, #0x238]");
    /* 0x00b8e328: ldr      x25, [sp, #0x230] */ ARM64("ldr x25, [sp, #0x230]");
    /* 0x00b8e32c: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b8e330: cbz      x8, #0xb8e498 */ if (x8 == 0) goto loc_00b8e498;
loc_00b8e334:
    /* 0x00b8e334: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00b8e338: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8e33c: mov      x9, #0x6575 */ ARM64("mov x9, #0x6575");
    /* 0x00b8e340: movk     x9, #0x7073, lsl #16 */ ARM64("movk x9, #0x7073, lsl #16");
    /* 0x00b8e344: movk     x9, #0x6d65, lsl #32 */ ARM64("movk x9, #0x6d65, lsl #32");
    /* 0x00b8e348: movk     x9, #0x736f, lsl #48 */ ARM64("movk x9, #0x736f, lsl #48");
    /* 0x00b8e34c: eor      x9, x25, x9 */ ARM64("eor x9, x25, x9");
    /* 0x00b8e350: mov      x11, #0x6f6d */ ARM64("mov x11, #0x6f6d");
    /* 0x00b8e354: movk     x11, #0x6e64, lsl #16 */ ARM64("movk x11, #0x6e64, lsl #16");
    /* 0x00b8e358: movk     x11, #0x7261, lsl #32 */ ARM64("movk x11, #0x7261, lsl #32");
    /* 0x00b8e35c: movk     x11, #0x646f, lsl #48 */ ARM64("movk x11, #0x646f, lsl #48");
    /* 0x00b8e360: eor      x11, x21, x11 */ ARM64("eor x11, x21, x11");
    /* 0x00b8e364: mov      x12, #0x7261 */ ARM64("mov x12, #0x7261");
    /* 0x00b8e368: movk     x12, #0x6e65, lsl #16 */ ARM64("movk x12, #0x6e65, lsl #16");
    /* 0x00b8e36c: movk     x12, #0x6765, lsl #32 */ ARM64("movk x12, #0x6765, lsl #32");
    /* 0x00b8e370: movk     x12, #0x6c79, lsl #48 */ ARM64("movk x12, #0x6c79, lsl #48");
    /* 0x00b8e374: eor      x12, x25, x12 */ ARM64("eor x12, x25, x12");
    /* 0x00b8e378: orr      x13, x20, #0x400000000000000 */ ARM64("orr x13, x20, #0x400000000000000");
    /* 0x00b8e37c: eor      x14, x21, x19 */ ARM64("eor x14, x21, x19");
    /* 0x00b8e380: eor      x14, x14, x13 */ ARM64("eor x14, x14, x13");
    /* 0x00b8e384: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b8e388: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b8e38c: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b8e390: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8e394: eor      x14, x12, x14, ror #48 */ ARM64("eor x14, x12, x14, ror #48");
    /* 0x00b8e398: add      x12, x12, x11 */ ARM64("add x12, x12, x11");
    /* 0x00b8e39c: add      x9, x14, x9 */ ARM64("add x9, x14, x9");
    /* 0x00b8e3a0: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b8e3a4: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8e3a8: eor      x14, x9, x14, ror #43 */ ARM64("eor x14, x9, x14, ror #43");
    /* 0x00b8e3ac: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b8e3b0: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b8e3b4: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00b8e3b8: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b8e3bc: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b8e3c0: eor      x13, x12, x14, ror #48 */ ARM64("eor x13, x12, x14, ror #48");
    /* 0x00b8e3c4: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8e3c8: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8e3cc: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b8e3d0: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b8e3d4: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b8e3d8: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8e3dc: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b8e3e0: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8e3e4: eor      x11, x9, x11, ror #51 */ ARM64("eor x11, x9, x11, ror #51");
    /* 0x00b8e3e8: eor      x13, x12, x13, ror #48 */ ARM64("eor x13, x12, x13, ror #48");
    /* 0x00b8e3ec: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b8e3f0: add      x12, x11, x12 */ ARM64("add x12, x11, x12");
    /* 0x00b8e3f4: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b8e3f8: eor      x11, x12, x11, ror #47 */ ARM64("eor x11, x12, x11, ror #47");
    /* 0x00b8e3fc: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b8e400: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b8e404: add      x9, x11, x9 */ ARM64("add x9, x11, x9");
    /* 0x00b8e408: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b8e40c: eor      x9, x9, x11, ror #51 */ ARM64("eor x9, x9, x11, ror #51");
    /* 0x00b8e410: eor      x11, x12, x13, ror #48 */ ARM64("eor x11, x12, x13, ror #48");
    /* 0x00b8e414: add      x12, x9, x12 */ ARM64("add x12, x9, x12");
    /* 0x00b8e418: ror      x11, x11, #0x2b */ ARM64("ror x11, x11, #0x2b");
    /* 0x00b8e41c: eor      x9, x11, x9, ror #47 */ ARM64("eor x9, x11, x9, ror #47");
    /* 0x00b8e420: eor      x9, x9, x12, ror #32 */ ARM64("eor x9, x9, x12, ror #32");
    /* 0x00b8e424: eor      x14, x9, x12 */ ARM64("eor x14, x9, x12");
    /* 0x00b8e428: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b8e42c: ldr      x12, [sp, #0x218] */ ARM64("ldr x12, [sp, #0x218]");
    /* 0x00b8e430: lsr      x11, x14, #0x39 */ ARM64("lsr x11, x14, #0x39");
    /* 0x00b8e434: dup      v0.8b, w11 */ ARM64("dup v0.8b, w11");
    /* 0x00b8e438: ldp      x25, x21, [sp, #0x110] */ ARM64("ldp x25, x21, [sp, #0x110]");
    /* 0x00b8e43c: b        #0xb8e25c */ goto loc_00b8e25c;
loc_00b8e440:
    /* 0x00b8e440: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b8e444: tbz      w8, #0x1f, #0xb8e4b0 */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b8e4b0;
loc_00b8e448:
    /* 0x00b8e448: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b8e44c: sub      x10, x13, #8 */ ARM64("sub x10, x13, #8");
    /* 0x00b8e450: strb     w11, [x9, x13] */ ARM64("strb w11, [x9, x13]");
    /* 0x00b8e454: and      x10, x12, x10 */ ARM64("and x10, x12, x10");
    /* 0x00b8e458: add      x10, x9, x10 */ ARM64("add x10, x9, x10");
    /* 0x00b8e45c: strb     w11, [x10, #8] */ ARM64("strb w11, [x10, #8]");
    /* 0x00b8e460: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b8e464: mov      v0.d[0], x8 */ ARM64("mov v0.d[0], x8");
    /* 0x00b8e468: ldr      q1, [sp, #0x220] */ ARM64("ldr q1, [sp, #0x220]");
    /* 0x00b8e46c: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00b8e470: str      q0, [sp, #0x220] */ ARM64("str q0, [sp, #0x220]");
    /* 0x00b8e474: neg      x8, x13 */ ARM64("neg x8, x13");
    /* 0x00b8e478: sub      x10, x9, x13, lsl #3 */ ARM64("sub x10, x9, x13, lsl #3");
    /* 0x00b8e47c: stur     w20, [x10, #-8] */ ARM64("stur w20, [x10, #-8]");
    /* 0x00b8e480: add      x8, x9, x8, lsl #3 */ ARM64("add x8, x9, x8, lsl #3");
    /* 0x00b8e484: stur     w27, [x8, #-4] */ ARM64("stur w27, [x8, #-4]");
    /* 0x00b8e488: add      x23, x23, #1 */ ARM64("add x23, x23, #1");
    /* 0x00b8e48c: cmp      x22, x28 */ ARM64("cmp x22, x28");
    /* 0x00b8e490: b.ne     #0xb8e304 */ if (COND_NE) goto loc_00b8e304;
    /* 0x00b8e494: b        #0xb8e4d0 */ goto loc_00b8e4d0;
loc_00b8e498:
    /* 0x00b8e498: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8e49c: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b8e4a0: add      x2, x8, #0x20 */ ARM64("add x2, x8, #0x20");
    /* 0x00b8e4a4: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b8e4a8: bl       #0xc6ceb4 */ CALL_DIRECT(sub_00c6ceb4);
    /* 0x00b8e4ac: b        #0xb8e334 */ goto loc_00b8e334;
loc_00b8e4b0:
    /* 0x00b8e4b0: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b8e4b4: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b8e4b8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b8e4bc: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b8e4c0: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b8e4c4: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b8e4c8: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b8e4cc: b        #0xb8e448 */ goto loc_00b8e448;
loc_00b8e4d0:
    /* 0x00b8e4d0: cbz      x21, #0xb8e4dc */ if (x21 == 0) goto loc_00b8e4dc;
    /* 0x00b8e4d4: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b8e4d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e4dc:
    /* 0x00b8e4dc: ldp      q0, q1, [sp, #0x210] */ ARM64("ldp q0, q1, [sp, #0x210]");
    /* 0x00b8e4e0: stp      q0, q1, [sp, #0x120] */ ARM64("stp q0, q1, [sp, #0x120]");
    /* 0x00b8e4e4: ldr      q0, [sp, #0x230] */ ARM64("ldr q0, [sp, #0x230]");
    /* 0x00b8e4e8: str      q0, [sp, #0x140] */ ARM64("str q0, [sp, #0x140]");
    /* 0x00b8e4ec: ldr      w8, [sp, #0xd0] */ ARM64("ldr w8, [sp, #0xd0]");
    /* 0x00b8e4f0: str      w8, [sp, #0x150] */ ARM64("str w8, [sp, #0x150]");
    /* 0x00b8e4f4: ldp      x21, x20, [sp, #0xb0] */ ARM64("ldp x21, x20, [sp, #0xb0]");
    /* 0x00b8e4f8: add      x19, x21, #8 */ ARM64("add x19, x21, #8");
    /* 0x00b8e4fc: b        #0xb8e508 */ goto loc_00b8e508;
loc_00b8e500:
    /* 0x00b8e500: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
    /* 0x00b8e504: sub      x24, x24, #1 */ ARM64("sub x24, x24, #1");
loc_00b8e508:
    /* 0x00b8e508: cbz      x24, #0xb8e520 */ if (x24 == 0) goto loc_00b8e520;
    /* 0x00b8e50c: ldur     x8, [x19, #-8] */ ARM64("ldur x8, [x19, #-8]");
    /* 0x00b8e510: cbz      x8, #0xb8e500 */ if (x8 == 0) goto loc_00b8e500;
    /* 0x00b8e514: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x00b8e518: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8e51c: b        #0xb8e500 */ goto loc_00b8e500;
loc_00b8e520:
    /* 0x00b8e520: ldr      x8, [sp, #0x98] */ ARM64("ldr x8, [sp, #0x98]");
    /* 0x00b8e524: cbz      x8, #0xb8e530 */ if (x8 == 0) goto loc_00b8e530;
    /* 0x00b8e528: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b8e52c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e530:
    /* 0x00b8e530: ldr      x19, [sp, #0xc8] */ ARM64("ldr x19, [sp, #0xc8]");
    /* 0x00b8e534: cbz      x20, #0xb8e558 */ if (x20 == 0) goto loc_00b8e558;
    /* 0x00b8e538: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00b8e53c: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00b8e540: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b8e544: b.eq     #0xb8e558 */ if (COND_EQ) goto loc_00b8e558;
    /* 0x00b8e548: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00b8e54c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b8e550: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b8e554: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e558:
    /* 0x00b8e558: cbz      x19, #0xb8e564 */ if (x19 == 0) goto loc_00b8e564;
    /* 0x00b8e55c: ldr      x0, [sp, #0x108] */ ARM64("ldr x0, [sp, #0x108]");
    /* 0x00b8e560: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e564:
    /* 0x00b8e564: ldp      x19, x20, [x25, #0x30] */ ARM64("ldp x19, x20, [x25, #0x30]");
    /* 0x00b8e568: ldr      x21, [x25, #0x40] */ ARM64("ldr x21, [x25, #0x40]");
    /* 0x00b8e56c: ldr      x8, [x25, #0x50] */ ARM64("ldr x8, [x25, #0x50]");
    /* 0x00b8e570: cbz      x8, #0xb8e58c */ if (x8 == 0) goto loc_00b8e58c;
    /* 0x00b8e574: ldr      x9, [x25, #0x48] */ ARM64("ldr x9, [x25, #0x48]");
    /* 0x00b8e578: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b8e57c: add      x8, x8, #0xf */ ARM64("add x8, x8, #0xf");
    /* 0x00b8e580: and      x8, x8, #0xfffffffffffffff8 */ ARM64("and x8, x8, #0xfffffffffffffff8");
    /* 0x00b8e584: sub      x0, x9, x8 */ ARM64("sub x0, x9, x8");
    /* 0x00b8e588: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e58c:
    /* 0x00b8e58c: mov      w8, #0x30 */ ARM64("mov w8, #0x30");
    /* 0x00b8e590: stp      x20, x20, [sp, #0x160] */ ARM64("stp x20, x20, [sp, #0x160]");
    /* 0x00b8e594: madd     x22, x21, x8, x20 */ ARM64("madd x22, x21, x8, x20");
    /* 0x00b8e598: stp      x19, x22, [sp, #0x170] */ ARM64("stp x19, x22, [sp, #0x170]");
    /* 0x00b8e59c: cbz      x21, #0xb8fcf4 */ if (x21 == 0) goto loc_00b8fcf4;
    /* 0x00b8e5a0: mov      x24, #0xa95 */ ARM64("mov x24, #0xa95");
    /* 0x00b8e5a4: movk     x24, #0x2722, lsl #16 */ ARM64("movk x24, #0x2722, lsl #16");
    /* 0x00b8e5a8: movk     x24, #0xc1b7, lsl #32 */ ARM64("movk x24, #0xc1b7, lsl #32");
    /* 0x00b8e5ac: movk     x24, #0x517c, lsl #48 */ ARM64("movk x24, #0x517c, lsl #48");
    /* 0x00b8e5b0: ldr      x9, [sp, #0xa0] */ ARM64("ldr x9, [sp, #0xa0]");
    /* 0x00b8e5b4: ldr      x8, [x9, #0x18] */ ARM64("ldr x8, [x9, #0x18]");
    /* 0x00b8e5b8: str      x8, [sp, #0xd0] */ ARM64("str x8, [sp, #0xd0]");
    /* 0x00b8e5bc: mov      w26, #0x18 */ ARM64("mov w26, #0x18");
    /* 0x00b8e5c0: ldp      x8, x10, [x9] */ ARM64("ldp x8, x10, [x9]");
    /* 0x00b8e5c4: str      x10, [sp, #0xf0] */ ARM64("str x10, [sp, #0xf0]");
    /* 0x00b8e5c8: str      x8, [sp, #0xe0] */ ARM64("str x8, [sp, #0xe0]");
    /* 0x00b8e5cc: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b8e5d0: add      x10, x8, #0xe00 */ ARM64("add x10, x8, #0xe00");
    /* 0x00b8e5d4: adrp     x8, #0xe09000 */ ARM64("adrp x8, #0xe09000");
    /* 0x00b8e5d8: add      x8, x8, #0xcc5 */ ARM64("add x8, x8, #0xcc5");
    /* 0x00b8e5dc: stp      x8, x10, [sp, #0x68] */ ARM64("stp x8, x10, [sp, #0x68]");
    /* 0x00b8e5e0: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00b8e5e4: mov      w8, #0x30 */ ARM64("mov w8, #0x30");
    /* 0x00b8e5e8: str      x8, [sp, #0x60] */ ARM64("str x8, [sp, #0x60]");
    /* 0x00b8e5ec: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b8e5f0: add      x8, x8, #0x1f0 */ ARM64("add x8, x8, #0x1f0");
    /* 0x00b8e5f4: str      x8, [sp, #0x58] */ ARM64("str x8, [sp, #0x58]");
    /* 0x00b8e5f8: mov      x23, x20 */ ARM64("mov x23, x20");
    /* 0x00b8e5fc: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b8e600: add      x8, x8, #0x698 */ ARM64("add x8, x8, #0x698");
    /* 0x00b8e604: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
    /* 0x00b8e608: str      x22, [sp, #0x98] */ ARM64("str x22, [sp, #0x98]");
    /* 0x00b8e60c: b        #0xb8e628 */ goto loc_00b8e628;
loc_00b8e610:
    /* 0x00b8e610: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b8e614: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b8e618: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b8e61c:
    /* 0x00b8e61c: mov      x20, x23 */ ARM64("mov x20, x23");
    /* 0x00b8e620: cmp      x23, x22 */ ARM64("cmp x23, x22");
    /* 0x00b8e624: b.eq     #0xb8fcf4 */ if (COND_EQ) goto loc_00b8fcf4;
loc_00b8e628:
    /* 0x00b8e628: ldr      x21, [x23], #0x30 */ ARM64("ldr x21, [x23], #0x30");
    /* 0x00b8e62c: str      x23, [sp, #0x168] */ ARM64("str x23, [sp, #0x168]");
    /* 0x00b8e630: cbz      x21, #0xb8fcf4 */ if (x21 == 0) goto loc_00b8fcf4;
    /* 0x00b8e634: ldp      x27, x8, [x20, #8] */ ARM64("ldp x27, x8, [x20, #8]");
    /* 0x00b8e638: str      x8, [sp, #0x108] */ ARM64("str x8, [sp, #0x108]");
    /* 0x00b8e63c: ldr      x13, [x20, #0x20] */ ARM64("ldr x13, [x20, #0x20]");
    /* 0x00b8e640: ldr      x8, [sp, #0xd0] */ ARM64("ldr x8, [sp, #0xd0]");
    /* 0x00b8e644: cbz      x8, #0xb8e6d0 */ if (x8 == 0) goto loc_00b8e6d0;
    /* 0x00b8e648: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8e64c: add      x9, x21, #8 */ ARM64("add x9, x21, #8");
    /* 0x00b8e650: mul      x9, x9, x24 */ ARM64("mul x9, x9, x24");
    /* 0x00b8e654: lsr      x10, x9, #0x39 */ ARM64("lsr x10, x9, #0x39");
    /* 0x00b8e658: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
loc_00b8e65c:
    /* 0x00b8e65c: ldr      x10, [sp, #0xf0] */ ARM64("ldr x10, [sp, #0xf0]");
    /* 0x00b8e660: and      x9, x9, x10 */ ARM64("and x9, x9, x10");
    /* 0x00b8e664: ldr      x10, [sp, #0xe0] */ ARM64("ldr x10, [sp, #0xe0]");
    /* 0x00b8e668: ldr      d1, [x10, x9] */ ARM64("ldr d1, [x10, x9]");
    /* 0x00b8e66c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8e670: fmov     x10, d2 */ ARM64("fmov x10, d2");
    /* 0x00b8e674: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8e678: b.eq     #0xb8e6b0 */ if (COND_EQ) goto loc_00b8e6b0;
loc_00b8e67c:
    /* 0x00b8e67c: rbit     x11, x10 */ ARM64("rbit x11, x10");
    /* 0x00b8e680: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8e684: add      x11, x9, x11, lsr #3 */ ARM64("add x11, x9, x11, lsr #3");
    /* 0x00b8e688: ldr      x12, [sp, #0xf0] */ ARM64("ldr x12, [sp, #0xf0]");
    /* 0x00b8e68c: and      x11, x11, x12 */ ARM64("and x11, x11, x12");
    /* 0x00b8e690: ldr      x12, [sp, #0xe0] */ ARM64("ldr x12, [sp, #0xe0]");
    /* 0x00b8e694: sub      x11, x12, x11, lsl #3 */ ARM64("sub x11, x12, x11, lsl #3");
    /* 0x00b8e698: ldur     x11, [x11, #-8] */ ARM64("ldur x11, [x11, #-8]");
    /* 0x00b8e69c: cmp      x21, x11 */ ARM64("cmp x21, x11");
    /* 0x00b8e6a0: b.eq     #0xb8e924 */ if (COND_EQ) goto loc_00b8e924;
    /* 0x00b8e6a4: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00b8e6a8: ands     x10, x11, x10 */ ARM64("ands x10, x11, x10");
    /* 0x00b8e6ac: b.ne     #0xb8e67c */ if (COND_NE) goto loc_00b8e67c;
loc_00b8e6b0:
    /* 0x00b8e6b0: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b8e6b4: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b8e6b8: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8e6bc: fmov     w10, s1 */ ARM64("fmov w10, s1");
    /* 0x00b8e6c0: tbnz     w10, #0, #0xb8e6d0 */ if (((w10 >> #0) & 1) != 0) goto loc_00b8e6d0;
    /* 0x00b8e6c4: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8e6c8: add      x9, x9, x8 */ ARM64("add x9, x9, x8");
    /* 0x00b8e6cc: b        #0xb8e65c */ goto loc_00b8e65c;
loc_00b8e6d0:
    /* 0x00b8e6d0: cmp      x13, #1 */ ARM64("cmp x13, #1");
    /* 0x00b8e6d4: str      x23, [sp, #0xc8] */ ARM64("str x23, [sp, #0xc8]");
    /* 0x00b8e6d8: b.ne     #0xb8e960 */ if (COND_NE) goto loc_00b8e960;
    /* 0x00b8e6dc: ldr      d0, [x27] */ ARM64("ldr d0, [x27]");
    /* 0x00b8e6e0: ldr      x11, [sp, #0x108] */ ARM64("ldr x11, [sp, #0x108]");
    /* 0x00b8e6e4: lsl      x8, x11, #4 */ ARM64("lsl x8, x11, #4");
    /* 0x00b8e6e8: add      x9, x8, x11 */ ARM64("add x9, x8, x11");
    /* 0x00b8e6ec: sub      x8, x27, x8 */ ARM64("sub x8, x27, x8");
    /* 0x00b8e6f0: sub      x10, x8, #0x10 */ ARM64("sub x10, x8, #0x10");
    /* 0x00b8e6f4: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b8e6f8: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b8e6fc: cmp      x11, #0 */ ARM64("cmp x11, #0");
    /* 0x00b8e700: csel     w8, w8, w8, eq */ ARM64("csel w8, w8, w8, eq");
    /* 0x00b8e704: csel     x20, x8, x10, eq */ ARM64("csel x20, x8, x10, eq");
    /* 0x00b8e708: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8e70c: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b8e710: ands     x9, x9, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x9, x9, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8e714: b.ne     #0xb8e734 */ if (COND_NE) goto loc_00b8e734;
    /* 0x00b8e718: add      x10, x27, #8 */ ARM64("add x10, x27, #8");
loc_00b8e71c:
    /* 0x00b8e71c: ldr      d0, [x10], #8 */ ARM64("ldr d0, [x10], #8");
    /* 0x00b8e720: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8e724: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b8e728: sub      x27, x27, #0x80 */ ARM64("sub x27, x27, #0x80");
    /* 0x00b8e72c: and      x9, x9, #0x8080808080808080 */ ARM64("and x9, x9, #0x8080808080808080");
    /* 0x00b8e730: cbz      x9, #0xb8e71c */ if (x9 == 0) goto loc_00b8e71c;
loc_00b8e734:
    /* 0x00b8e734: ldr      x10, [sp, #0x108] */ ARM64("ldr x10, [sp, #0x108]");
    /* 0x00b8e738: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00b8e73c: cset     w10, eq */ ARM64("cset w10, eq");
    /* 0x00b8e740: rbit     x9, x9 */ ARM64("rbit x9, x9");
    /* 0x00b8e744: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b8e748: lsl      x9, x9, #1 */ ARM64("lsl x9, x9, #1");
    /* 0x00b8e74c: and      x9, x9, #0xf0 */ ARM64("and x9, x9, #0xf0");
    /* 0x00b8e750: sub      x9, x27, x9 */ ARM64("sub x9, x27, x9");
    /* 0x00b8e754: ldur     w22, [x9, #-0x10] */ ARM64("ldur w22, [x9, #-0x10]");
    /* 0x00b8e758: ldur     x27, [x9, #-8] */ ARM64("ldur x27, [x9, #-8]");
    /* 0x00b8e75c: orr      w8, w8, w10 */ ARM64("orr w8, w8, w10");
    /* 0x00b8e760: tbnz     w8, #0, #0xb8e76c */ if (((w8 >> #0) & 1) != 0) goto loc_00b8e76c;
loc_00b8e764:
    /* 0x00b8e764: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b8e768: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e76c:
    /* 0x00b8e76c: ldp      x11, x12, [x25, #8] */ ARM64("ldp x11, x12, [x25, #8]");
    /* 0x00b8e770: ldp      x8, x9, [x25, #0x20] */ ARM64("ldp x8, x9, [x25, #0x20]");
    /* 0x00b8e774: mov      x10, #0xffffffff0 */ ARM64("mov x10, #0xffffffff0");
    /* 0x00b8e778: add      x13, x8, x10 */ ARM64("add x13, x8, x10");
    /* 0x00b8e77c: b        #0xb8e784 */ goto loc_00b8e784;
loc_00b8e780:
    /* 0x00b8e780: ldr      x27, [x15, #8] */ ARM64("ldr x27, [x15, #8]");
loc_00b8e784:
    /* 0x00b8e784: cmp      x12, x22 */ ARM64("cmp x12, x22");
    /* 0x00b8e788: b.ls     #0xb90878 */ if (COND_LS) goto loc_00b90878;
    /* 0x00b8e78c: madd     x15, x22, x26, x11 */ ARM64("madd x15, x22, x26, x11");
    /* 0x00b8e790: ldr      x19, [x15] */ ARM64("ldr x19, [x15]");
    /* 0x00b8e794: cbnz     x19, #0xb8e7f0 */ if (x19 != 0) goto loc_00b8e7f0;
    /* 0x00b8e798: ldr      w10, [x15, #0x14] */ ARM64("ldr w10, [x15, #0x14]");
    /* 0x00b8e79c: lsr      x14, x9, #0x20 */ ARM64("lsr x14, x9, #0x20");
    /* 0x00b8e7a0: cbz      x14, #0xb8e7b0 */ if (x14 == 0) goto loc_00b8e7b0;
    /* 0x00b8e7a4: ldr      w14, [x13] */ ARM64("ldr w14, [x13]");
    /* 0x00b8e7a8: ldr      w22, [x13, #0xc] */ ARM64("ldr w22, [x13, #0xc]");
    /* 0x00b8e7ac: b        #0xb8e7cc */ goto loc_00b8e7cc;
loc_00b8e7b0:
    /* 0x00b8e7b0: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b8e7b4: b.ls     #0xb90c00 */ if (COND_LS) goto loc_00b90c00;
    /* 0x00b8e7b8: add      x14, x8, x10, lsl #4 */ ARM64("add x14, x8, x10, lsl #4");
    /* 0x00b8e7bc: ldp      w10, w22, [x14, #4] */ ARM64("ldp w10, w22, [x14, #4]");
    /* 0x00b8e7c0: cmn      w22, #1 */ ARM64("cmn w22, #1");
    /* 0x00b8e7c4: b.eq     #0xb8e7b0 */ if (COND_EQ) goto loc_00b8e7b0;
    /* 0x00b8e7c8: mov      w14, #-1 */ ARM64("mov w14, #-1");
loc_00b8e7cc:
    /* 0x00b8e7cc: cmp      x9, x14 */ ARM64("cmp x9, x14");
    /* 0x00b8e7d0: b.hi     #0xb90d84 */ if (COND_HI) goto loc_00b90d84;
loc_00b8e7d4:
    /* 0x00b8e7d4: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b8e7d8: b.ls     #0xb8e780 */ if (COND_LS) goto loc_00b8e780;
    /* 0x00b8e7dc: add      x16, x8, x10, lsl #4 */ ARM64("add x16, x8, x10, lsl #4");
    /* 0x00b8e7e0: ldp      w10, w16, [x16, #4] */ ARM64("ldp w10, w16, [x16, #4]");
    /* 0x00b8e7e4: cmn      w16, #1 */ ARM64("cmn w16, #1");
    /* 0x00b8e7e8: b.eq     #0xb8e7d4 */ if (COND_EQ) goto loc_00b8e7d4;
    /* 0x00b8e7ec: b        #0xb90d90 */ goto loc_00b90d90;
loc_00b8e7f0:
    /* 0x00b8e7f0: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b8e7f4: add      x9, x8, #1 */ ARM64("add x9, x8, #1");
    /* 0x00b8e7f8: stxr     w10, x9, [x19] */ ARM64("stxr w10, x9, [x19]");
    /* 0x00b8e7fc: cbnz     w10, #0xb8e7f0 */ if (w10 != 0) goto loc_00b8e7f0;
    /* 0x00b8e800: mov      w26, #0x48 */ ARM64("mov w26, #0x48");
    /* 0x00b8e804: tbnz     x8, #0x3f, #0xb90bfc */ if (((x8 >> #0x3f) & 1) != 0) goto loc_00b90bfc;
    /* 0x00b8e808: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8e80c: str      x19, [sp, #0x210] */ ARM64("str x19, [sp, #0x210]");
    /* 0x00b8e810: add      x9, x19, #8 */ ARM64("add x9, x19, #8");
    /* 0x00b8e814: mul      x22, x9, x24 */ ARM64("mul x22, x9, x24");
    /* 0x00b8e818: lsr      x20, x22, #0x39 */ ARM64("lsr x20, x22, #0x39");
    /* 0x00b8e81c: ldp      x10, x9, [x25, #0x98] */ ARM64("ldp x10, x9, [x25, #0x98]");
    /* 0x00b8e820: dup      v0.8b, w20 */ ARM64("dup v0.8b, w20");
    /* 0x00b8e824: and      x11, x22, x9 */ ARM64("and x11, x22, x9");
    /* 0x00b8e828: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b8e82c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8e830: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8e834: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8e838: b.eq     #0xb8e868 */ if (COND_EQ) goto loc_00b8e868;
loc_00b8e83c:
    /* 0x00b8e83c: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b8e840: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b8e844: add      x13, x11, x13, lsr #3 */ ARM64("add x13, x11, x13, lsr #3");
    /* 0x00b8e848: and      x13, x13, x9 */ ARM64("and x13, x13, x9");
    /* 0x00b8e84c: sub      x23, x10, x13, lsl #5 */ ARM64("sub x23, x10, x13, lsl #5");
    /* 0x00b8e850: ldur     x13, [x23, #-0x20] */ ARM64("ldur x13, [x23, #-0x20]");
    /* 0x00b8e854: cmp      x13, x19 */ ARM64("cmp x13, x19");
    /* 0x00b8e858: b.eq     #0xb8e8a0 */ if (COND_EQ) goto loc_00b8e8a0;
    /* 0x00b8e85c: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b8e860: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b8e864: b.ne     #0xb8e83c */ if (COND_NE) goto loc_00b8e83c;
loc_00b8e868:
    /* 0x00b8e868: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b8e86c: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b8e870: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b8e874: fmov     w12, s1 */ ARM64("fmov w12, s1");
    /* 0x00b8e878: tbnz     w12, #0, #0xb8ea18 */ if (((w12 >> #0) & 1) != 0) goto loc_00b8ea18;
    /* 0x00b8e87c: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b8e880: add      x11, x11, x8 */ ARM64("add x11, x11, x8");
    /* 0x00b8e884: and      x11, x11, x9 */ ARM64("and x11, x11, x9");
    /* 0x00b8e888: ldr      d1, [x10, x11] */ ARM64("ldr d1, [x10, x11]");
    /* 0x00b8e88c: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b8e890: fmov     x12, d2 */ ARM64("fmov x12, d2");
    /* 0x00b8e894: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8e898: b.ne     #0xb8e83c */ if (COND_NE) goto loc_00b8e83c;
    /* 0x00b8e89c: b        #0xb8e868 */ goto loc_00b8e868;
loc_00b8e8a0:
    /* 0x00b8e8a0: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b8e8a4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b8e8a8: stlxr    w9, x8, [x19] */ ARM64("stlxr w9, x8, [x19]");
    /* 0x00b8e8ac: cbnz     w9, #0xb8e8a0 */ if (w9 != 0) goto loc_00b8e8a0;
    /* 0x00b8e8b0: ldr      x19, [sp, #0xa8] */ ARM64("ldr x19, [sp, #0xa8]");
    /* 0x00b8e8b4: b.ne     #0xb8e8c4 */ if (COND_NE) goto loc_00b8e8c4;
    /* 0x00b8e8b8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b8e8bc: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8e8c0: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b8e8c4:
    /* 0x00b8e8c4: mov      x8, x23 */ ARM64("mov x8, x23");
    /* 0x00b8e8c8: ldr      x20, [x8, #-0x18]! */ ARM64("ldr x20, [x8, #-0x18]!");
    /* 0x00b8e8cc: cbz      x20, #0xb8ea9c */ if (x20 == 0) goto loc_00b8ea9c;
loc_00b8e8d0:
    /* 0x00b8e8d0: ldur     x9, [x23, #-0x10] */ ARM64("ldur x9, [x23, #-0x10]");
loc_00b8e8d4:
    /* 0x00b8e8d4: ldrh     w19, [x20, #0x37a] */ ARM64("ldrh w19, [x20, #0x37a]");
    /* 0x00b8e8d8: lsl      x11, x19, #3 */ ARM64("lsl x11, x19, #3");
    /* 0x00b8e8dc: mov      w10, #1 */ ARM64("mov w10, #1");
loc_00b8e8e0:
    /* 0x00b8e8e0: cbz      x11, #0xb8e910 */ if (x11 == 0) goto loc_00b8e910;
    /* 0x00b8e8e4: ldr      x12, [x20, x10, lsl #3] */ ARM64("ldr x12, [x20, x10, lsl #3]");
    /* 0x00b8e8e8: cmp      x27, x12 */ ARM64("cmp x27, x12");
    /* 0x00b8e8ec: cset     w12, hi */ ARM64("cset w12, hi");
    /* 0x00b8e8f0: csinv    w12, w12, wzr, hs */ ARM64("csinv w12, w12, wzr, hs");
    /* 0x00b8e8f4: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x00b8e8f8: sub      x11, x11, #8 */ ARM64("sub x11, x11, #8");
    /* 0x00b8e8fc: and      w12, w12, #0xff */ ARM64("and w12, w12, #0xff");
    /* 0x00b8e900: cmp      w12, #1 */ ARM64("cmp w12, #1");
    /* 0x00b8e904: b.eq     #0xb8e8e0 */ if (COND_EQ) goto loc_00b8e8e0;
    /* 0x00b8e908: cbz      w12, #0xb8e9c0 */ if (w12 == 0) goto loc_00b8e9c0;
    /* 0x00b8e90c: sub      x19, x10, #2 */ ARM64("sub x19, x10, #2");
loc_00b8e910:
    /* 0x00b8e910: cbz      x9, #0xb8f0b0 */ if (x9 == 0) goto loc_00b8f0b0;
    /* 0x00b8e914: add      x10, x20, x19, lsl #3 */ ARM64("add x10, x20, x19, lsl #3");
    /* 0x00b8e918: ldr      x20, [x10, #0x380] */ ARM64("ldr x20, [x10, #0x380]");
    /* 0x00b8e91c: sub      x9, x9, #1 */ ARM64("sub x9, x9, #1");
    /* 0x00b8e920: b        #0xb8e8d4 */ goto loc_00b8e8d4;
loc_00b8e924:
    /* 0x00b8e924: ldr      x9, [sp, #0x108] */ ARM64("ldr x9, [sp, #0x108]");
    /* 0x00b8e928: cbz      x9, #0xb8e948 */ if (x9 == 0) goto loc_00b8e948;
    /* 0x00b8e92c: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00b8e930: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b8e934: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b8e938: b.eq     #0xb8e948 */ if (COND_EQ) goto loc_00b8e948;
    /* 0x00b8e93c: sub      x8, x27, x8 */ ARM64("sub x8, x27, x8");
    /* 0x00b8e940: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b8e944: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8e948:
    /* 0x00b8e948: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b8e94c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b8e950: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b8e954: cbnz     w9, #0xb8e948 */ if (w9 != 0) goto loc_00b8e948;
    /* 0x00b8e958: b.ne     #0xb8e61c */ if (COND_NE) goto loc_00b8e61c;
    /* 0x00b8e95c: b        #0xb8e610 */ goto loc_00b8e610;
loc_00b8e960:
    /* 0x00b8e960: mov      x9, x27 */ ARM64("mov x9, x27");
    /* 0x00b8e964: ldr      d0, [x9], #8 */ ARM64("ldr d0, [x9], #8");
    /* 0x00b8e968: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8e96c: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b8e970: and      x8, x8, #0x8080808080808080 */ ARM64("and x8, x8, #0x8080808080808080");
    /* 0x00b8e974: stp      x27, x8, [sp, #0x180] */ ARM64("stp x27, x8, [sp, #0x180]");
    /* 0x00b8e978: ldr      x8, [sp, #0x108] */ ARM64("ldr x8, [sp, #0x108]");
    /* 0x00b8e97c: add      x8, x27, x8 */ ARM64("add x8, x27, x8");
    /* 0x00b8e980: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8e984: stp      x9, x13, [sp, #0x48] */ ARM64("stp x9, x13, [sp, #0x48]");
    /* 0x00b8e988: stp      x9, x8, [sp, #0x190] */ ARM64("stp x9, x8, [sp, #0x190]");
    /* 0x00b8e98c: add      x8, sp, #0x120 */ ARM64("add x8, sp, #0x120");
    /* 0x00b8e990: stp      x13, x8, [sp, #0x1a0] */ ARM64("stp x13, x8, [sp, #0x1a0]");
    /* 0x00b8e994: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b8e998: add      x1, sp, #0x180 */ ARM64("add x1, sp, #0x180");
    /* 0x00b8e99c: bl       #0xb7234c */ CALL_DIRECT(sub_00b7234c);
    /* 0x00b8e9a0: ldur     x19, [x29, #-0xf0] */ ARM64("ldur x19, [x29, #-0xf0]");
    /* 0x00b8e9a4: cmp      x19, x28 */ ARM64("cmp x19, x28");
    /* 0x00b8e9a8: b.ne     #0xb8e9d0 */ if (COND_NE) goto loc_00b8e9d0;
    /* 0x00b8e9ac: mov      x25, #0 */ ARM64("mov x25, #0");
    /* 0x00b8e9b0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b8e9b4: str      w8, [sp, #0x88] */ ARM64("str w8, [sp, #0x88]");
    /* 0x00b8e9b8: mov      w22, #8 */ ARM64("mov w22, #8");
    /* 0x00b8e9bc: b        #0xb8ec80 */ goto loc_00b8ec80;
loc_00b8e9c0:
    /* 0x00b8e9c0: sub      x25, x10, #2 */ ARM64("sub x25, x10, #2");
    /* 0x00b8e9c4: str      x8, [sp, #0xa8] */ ARM64("str x8, [sp, #0xa8]");
    /* 0x00b8e9c8: str      x25, [sp, #0x40] */ ARM64("str x25, [sp, #0x40]");
    /* 0x00b8e9cc: b        #0xb8f92c */ goto loc_00b8f92c;
loc_00b8e9d0:
    /* 0x00b8e9d0: ldur     x22, [x29, #-0xe8] */ ARM64("ldur x22, [x29, #-0xe8]");
    /* 0x00b8e9d4: ldr      x8, [sp, #0x1a0] */ ARM64("ldr x8, [sp, #0x1a0]");
    /* 0x00b8e9d8: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00b8e9dc: csinv    x8, x8, xzr, lo */ ARM64("csinv x8, x8, xzr, lo");
    /* 0x00b8e9e0: cmp      x8, #4 */ ARM64("cmp x8, #4");
    /* 0x00b8e9e4: mov      w9, #4 */ ARM64("mov w9, #4");
    /* 0x00b8e9e8: csel     x20, x8, x9, hi */ ARM64("csel x20, x8, x9, hi");
    /* 0x00b8e9ec: ldr      x9, [sp, #0x80] */ ARM64("ldr x9, [sp, #0x80]");
    /* 0x00b8e9f0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b8e9f4: b.hi     #0xb90708 */ if (COND_HI) goto loc_00b90708;
    /* 0x00b8e9f8: add      x8, x20, x20, lsl #1 */ ARM64("add x8, x20, x20, lsl #1");
    /* 0x00b8e9fc: lsl      x23, x8, #3 */ ARM64("lsl x23, x8, #3");
    /* 0x00b8ea00: cbz      x23, #0xb8ebb0 */ if (x23 == 0) goto loc_00b8ebb0;
    /* 0x00b8ea04: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b8ea08: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8ea0c: cbz      x0, #0xb90ef4 */ if (x0 == 0) goto loc_00b90ef4;
    /* 0x00b8ea10: mov      x9, x0 */ ARM64("mov x9, x0");
    /* 0x00b8ea14: b        #0xb8ebb8 */ goto loc_00b8ebb8;
loc_00b8ea18:
    /* 0x00b8ea18: ldr      x8, [x25, #0xa8] */ ARM64("ldr x8, [x25, #0xa8]");
    /* 0x00b8ea1c: cbz      x8, #0xb8fc68 */ if (x8 == 0) goto loc_00b8fc68;
loc_00b8ea20:
    /* 0x00b8ea20: ldp      x8, x9, [x25, #0x98] */ ARM64("ldp x8, x9, [x25, #0x98]");
    /* 0x00b8ea24: and      x10, x9, x22 */ ARM64("and x10, x9, x22");
    /* 0x00b8ea28: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00b8ea2c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b8ea30: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00b8ea34: cbz      x12, #0xb8fc44 */ if (x12 == 0) goto loc_00b8fc44;
loc_00b8ea38:
    /* 0x00b8ea38: rbit     x11, x12 */ ARM64("rbit x11, x12");
    /* 0x00b8ea3c: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b8ea40: add      x10, x10, x11, lsr #3 */ ARM64("add x10, x10, x11, lsr #3");
    /* 0x00b8ea44: and      x11, x10, x9 */ ARM64("and x11, x10, x9");
    /* 0x00b8ea48: ldrsb    w10, [x8, x11] */ ARM64("ldrsb w10, [x8, x11]");
    /* 0x00b8ea4c: tbz      w10, #0x1f, #0xb8fc78 */ if (((w10 >> #0x1f) & 1) == 0) goto loc_00b8fc78;
loc_00b8ea50:
    /* 0x00b8ea50: sub      x12, x11, #8 */ ARM64("sub x12, x11, #8");
    /* 0x00b8ea54: and      x9, x12, x9 */ ARM64("and x9, x12, x9");
    /* 0x00b8ea58: strb     w20, [x8, x11] */ ARM64("strb w20, [x8, x11]");
    /* 0x00b8ea5c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b8ea60: strb     w20, [x9, #8] */ ARM64("strb w20, [x9, #8]");
    /* 0x00b8ea64: sub      x23, x8, x11, lsl #5 */ ARM64("sub x23, x8, x11, lsl #5");
    /* 0x00b8ea68: and      x8, x10, #1 */ ARM64("and x8, x10, #1");
    /* 0x00b8ea6c: ldur     x9, [x25, #0xa8] */ ARM64("ldur x9, [x25, #0xa8]");
    /* 0x00b8ea70: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b8ea74: stur     x8, [x25, #0xa8] */ ARM64("stur x8, [x25, #0xa8]");
    /* 0x00b8ea78: stp      x19, xzr, [x23, #-0x20] */ ARM64("stp x19, xzr, [x23, #-0x20]");
    /* 0x00b8ea7c: stp      xzr, xzr, [x23, #-0x10] */ ARM64("stp xzr, xzr, [x23, #-0x10]");
    /* 0x00b8ea80: ldur     x8, [x25, #0xb0] */ ARM64("ldur x8, [x25, #0xb0]");
    /* 0x00b8ea84: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8ea88: stur     x8, [x25, #0xb0] */ ARM64("stur x8, [x25, #0xb0]");
    /* 0x00b8ea8c: ldr      x19, [sp, #0xa8] */ ARM64("ldr x19, [sp, #0xa8]");
    /* 0x00b8ea90: mov      x8, x23 */ ARM64("mov x8, x23");
    /* 0x00b8ea94: ldr      x20, [x8, #-0x18]! */ ARM64("ldr x20, [x8, #-0x18]!");
    /* 0x00b8ea98: cbnz     x20, #0xb8e8d0 */ if (x20 != 0) goto loc_00b8e8d0;
loc_00b8ea9c:
    /* 0x00b8ea9c: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00b8eaa0: ldrb     w8, [x8, #0x10] */ ARM64("ldrb w8, [x8, #0x10]");
    /* 0x00b8eaa4: tbz      w8, #0, #0xb8f0c0 */ if (((w8 >> #0) & 1) == 0) goto loc_00b8f0c0;
loc_00b8eaa8:
    /* 0x00b8eaa8: add      x8, sp, #0x3a8 */ ARM64("add x8, sp, #0x3a8");
    /* 0x00b8eaac: stp      xzr, xzr, [x8, #0x20] */ ARM64("stp xzr, xzr, [x8, #0x20]");
    /* 0x00b8eab0: stur     xzr, [x8, #0x30] */ ARM64("stur xzr, [x8, #0x30]");
    /* 0x00b8eab4: str      xzr, [sp, #0x3a8] */ ARM64("str xzr, [sp, #0x3a8]");
    /* 0x00b8eab8: mov      w8, #8 */ ARM64("mov w8, #8");
    /* 0x00b8eabc: str      x8, [sp, #0x3b0] */ ARM64("str x8, [sp, #0x3b0]");
    /* 0x00b8eac0: str      xzr, [sp, #0x3b8] */ ARM64("str xzr, [sp, #0x3b8]");
    /* 0x00b8eac4: adrp     x8, #0xe0e000 */ ARM64("adrp x8, #0xe0e000");
    /* 0x00b8eac8: add      x8, x8, #0xd10 */ ARM64("add x8, x8, #0xd10");
    /* 0x00b8eacc: str      x8, [sp, #0x3c0] */ ARM64("str x8, [sp, #0x3c0]");
    /* 0x00b8ead0: ldr      x9, [sp, #0xd8] */ ARM64("ldr x9, [sp, #0xd8]");
    /* 0x00b8ead4: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00b8ead8: ldr      x8, [x9] */ ARM64("ldr x8, [x9]");
    /* 0x00b8eadc: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8eae0: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00b8eae4: add      x8, sp, #0x3a8 */ ARM64("add x8, sp, #0x3a8");
    /* 0x00b8eae8: stur     q0, [x8, #0x38] */ ARM64("stur q0, [x8, #0x38]");
    /* 0x00b8eaec: str      x19, [sp, #0xa8] */ ARM64("str x19, [sp, #0xa8]");
    /* 0x00b8eaf0: cbz      x20, #0xb8eb40 */ if (x20 == 0) goto loc_00b8eb40;
    /* 0x00b8eaf4: ldrh     w19, [x20, #0x37a] */ ARM64("ldrh w19, [x20, #0x37a]");
    /* 0x00b8eaf8: cmp      w19, #0xb */ ARM64("cmp w19, #0xb");
    /* 0x00b8eafc: str      x23, [sp, #0x88] */ ARM64("str x23, [sp, #0x88]");
    /* 0x00b8eb00: b.hs     #0xb8eb98 */ if (COND_HS) goto loc_00b8eb98;
    /* 0x00b8eb04: add      x8, x20, #8 */ ARM64("add x8, x20, #8");
    /* 0x00b8eb08: ldr      x25, [sp, #0xa8] */ ARM64("ldr x25, [sp, #0xa8]");
    /* 0x00b8eb0c: add      x24, x25, #1 */ ARM64("add x24, x25, #1");
    /* 0x00b8eb10: add      x22, x8, x25, lsl #3 */ ARM64("add x22, x8, x25, lsl #3");
    /* 0x00b8eb14: cmp      x24, x19 */ ARM64("cmp x24, x19");
    /* 0x00b8eb18: b.ls     #0xb8ef48 */ if (COND_LS) goto loc_00b8ef48;
    /* 0x00b8eb1c: str      x27, [x22] */ ARM64("str x27, [x22]");
    /* 0x00b8eb20: add      x9, sp, #0x3a8 */ ARM64("add x9, sp, #0x3a8");
    /* 0x00b8eb24: ldp      q0, q1, [x9, #0x20] */ ARM64("ldp q0, q1, [x9, #0x20]");
    /* 0x00b8eb28: stp      q0, q1, [sp, #0x230] */ ARM64("stp q0, q1, [sp, #0x230]");
    /* 0x00b8eb2c: ldr      x8, [sp, #0x3e8] */ ARM64("ldr x8, [sp, #0x3e8]");
    /* 0x00b8eb30: str      x8, [sp, #0x250] */ ARM64("str x8, [sp, #0x250]");
    /* 0x00b8eb34: ldp      q1, q0, [x9] */ ARM64("ldp q1, q0, [x9]");
    /* 0x00b8eb38: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8eb3c: b        #0xb8ef9c */ goto loc_00b8ef9c;
loc_00b8eb40:
    /* 0x00b8eb40: mov      w0, #0x380 */ ARM64("mov w0, #0x380");
    /* 0x00b8eb44: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8eb48: cbz      x0, #0xb90c94 */ if (x0 == 0) goto loc_00b90c94;
    /* 0x00b8eb4c: str      xzr, [x0] */ ARM64("str xzr, [x0]");
    /* 0x00b8eb50: strh     wzr, [x0, #0x37a] */ ARM64("strh wzr, [x0, #0x37a]");
    /* 0x00b8eb54: stp      x0, xzr, [x23, #-0x18] */ ARM64("stp x0, xzr, [x23, #-0x18]");
    /* 0x00b8eb58: ldrh     w25, [x0, #0x37a] */ ARM64("ldrh w25, [x0, #0x37a]");
    /* 0x00b8eb5c: cmp      w25, #0xb */ ARM64("cmp w25, #0xb");
    /* 0x00b8eb60: b.hs     #0xb90ca4 */ if (COND_HS) goto loc_00b90ca4;
    /* 0x00b8eb64: add      w8, w25, #1 */ ARM64("add w8, w25, #1");
    /* 0x00b8eb68: strh     w8, [x0, #0x37a] */ ARM64("strh w8, [x0, #0x37a]");
    /* 0x00b8eb6c: add      x8, x0, x25, lsl #3 */ ARM64("add x8, x0, x25, lsl #3");
    /* 0x00b8eb70: str      x27, [x8, #8] */ ARM64("str x27, [x8, #8]");
    /* 0x00b8eb74: umaddl   x8, w25, w26, x0 */ ARM64("umaddl x8, w25, w26, x0");
    /* 0x00b8eb78: add      x10, sp, #0x3a8 */ ARM64("add x10, sp, #0x3a8");
    /* 0x00b8eb7c: ldp      q0, q1, [x10, #0x20] */ ARM64("ldp q0, q1, [x10, #0x20]");
    /* 0x00b8eb80: stp      q0, q1, [x8, #0x80] */ ARM64("stp q0, q1, [x8, #0x80]");
    /* 0x00b8eb84: ldr      x9, [sp, #0x3e8] */ ARM64("ldr x9, [sp, #0x3e8]");
    /* 0x00b8eb88: str      x9, [x8, #0xa0] */ ARM64("str x9, [x8, #0xa0]");
    /* 0x00b8eb8c: ldp      q1, q0, [x10] */ ARM64("ldp q1, q0, [x10]");
    /* 0x00b8eb90: stp      q1, q0, [x8, #0x60] */ ARM64("stp q1, q0, [x8, #0x60]");
    /* 0x00b8eb94: b        #0xb8f91c */ goto loc_00b8f91c;
loc_00b8eb98:
    /* 0x00b8eb98: ldr      x8, [sp, #0xa8] */ ARM64("ldr x8, [sp, #0xa8]");
    /* 0x00b8eb9c: cmp      x8, #5 */ ARM64("cmp x8, #5");
    /* 0x00b8eba0: b.hs     #0xb8efd8 */ if (COND_HS) goto loc_00b8efd8;
    /* 0x00b8eba4: mov      w19, #0 */ ARM64("mov w19, #0");
    /* 0x00b8eba8: mov      w24, #4 */ ARM64("mov w24, #4");
    /* 0x00b8ebac: b        #0xb8f140 */ goto loc_00b8f140;
loc_00b8ebb0:
    /* 0x00b8ebb0: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00b8ebb4: mov      w9, #8 */ ARM64("mov w9, #8");
loc_00b8ebb8:
    /* 0x00b8ebb8: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00b8ebbc: str      q0, [x9] */ ARM64("str q0, [x9]");
    /* 0x00b8ebc0: ldur     x8, [x29, #-0xe0] */ ARM64("ldur x8, [x29, #-0xe0]");
    /* 0x00b8ebc4: str      x8, [x9, #0x10] */ ARM64("str x8, [x9, #0x10]");
    /* 0x00b8ebc8: str      x20, [sp, #0x430] */ ARM64("str x20, [sp, #0x430]");
    /* 0x00b8ebcc: str      x9, [sp, #0x438] */ ARM64("str x9, [sp, #0x438]");
    /* 0x00b8ebd0: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b8ebd4: str      x8, [sp, #0x440] */ ARM64("str x8, [sp, #0x440]");
    /* 0x00b8ebd8: ldp      q0, q1, [sp, #0x180] */ ARM64("ldp q0, q1, [sp, #0x180]");
    /* 0x00b8ebdc: stp      q0, q1, [sp, #0x210] */ ARM64("stp q0, q1, [sp, #0x210]");
    /* 0x00b8ebe0: ldr      q0, [sp, #0x1a0] */ ARM64("ldr q0, [sp, #0x1a0]");
    /* 0x00b8ebe4: str      q0, [sp, #0x230] */ ARM64("str q0, [sp, #0x230]");
    /* 0x00b8ebe8: mov      x20, x9 */ ARM64("mov x20, x9");
    /* 0x00b8ebec: mov      w19, #0x18 */ ARM64("mov w19, #0x18");
    /* 0x00b8ebf0: str      x9, [sp, #0x28] */ ARM64("str x9, [sp, #0x28]");
    /* 0x00b8ebf4: mov      w25, #1 */ ARM64("mov w25, #1");
    /* 0x00b8ebf8: b        #0xb8ec1c */ goto loc_00b8ec1c;
loc_00b8ebfc:
    /* 0x00b8ebfc: add      x8, x20, x19 */ ARM64("add x8, x20, x19");
    /* 0x00b8ec00: ldr      q0, [sp, #0x320] */ ARM64("ldr q0, [sp, #0x320]");
    /* 0x00b8ec04: ldr      x9, [sp, #0x330] */ ARM64("ldr x9, [sp, #0x330]");
    /* 0x00b8ec08: str      x9, [x8, #0x10] */ ARM64("str x9, [x8, #0x10]");
    /* 0x00b8ec0c: str      q0, [x8] */ ARM64("str q0, [x8]");
    /* 0x00b8ec10: add      x25, x25, #1 */ ARM64("add x25, x25, #1");
    /* 0x00b8ec14: str      x25, [sp, #0x440] */ ARM64("str x25, [sp, #0x440]");
    /* 0x00b8ec18: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
loc_00b8ec1c:
    /* 0x00b8ec1c: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b8ec20: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b8ec24: bl       #0xb7234c */ CALL_DIRECT(sub_00b7234c);
    /* 0x00b8ec28: ldr      x23, [sp, #0x320] */ ARM64("ldr x23, [sp, #0x320]");
    /* 0x00b8ec2c: cmp      x23, x28 */ ARM64("cmp x23, x28");
    /* 0x00b8ec30: b.eq     #0xb8ec6c */ if (COND_EQ) goto loc_00b8ec6c;
    /* 0x00b8ec34: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00b8ec38: cmp      x25, x8 */ ARM64("cmp x25, x8");
    /* 0x00b8ec3c: b.ne     #0xb8ebfc */ if (COND_NE) goto loc_00b8ebfc;
    /* 0x00b8ec40: ldr      x22, [sp, #0x328] */ ARM64("ldr x22, [sp, #0x328]");
    /* 0x00b8ec44: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b8ec48: adds     x8, x8, #1 */ ARM64("adds x8, x8, #1");
    /* 0x00b8ec4c: csinv    x2, x8, xzr, lo */ ARM64("csinv x2, x8, xzr, lo");
    /* 0x00b8ec50: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00b8ec54: mov      x1, x25 */ ARM64("mov x1, x25");
    /* 0x00b8ec58: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b8ec5c: mov      w4, #0x18 */ ARM64("mov w4, #0x18");
    /* 0x00b8ec60: bl       #0xc6c0cc */ CALL_DIRECT(sub_00c6c0cc);
    /* 0x00b8ec64: ldr      x20, [sp, #0x438] */ ARM64("ldr x20, [sp, #0x438]");
    /* 0x00b8ec68: b        #0xb8ebfc */ goto loc_00b8ebfc;
loc_00b8ec6c:
    /* 0x00b8ec6c: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00b8ec70: ldr      x22, [sp, #0x438] */ ARM64("ldr x22, [sp, #0x438]");
    /* 0x00b8ec74: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b8ec78: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b8ec7c: str      w8, [sp, #0x88] */ ARM64("str w8, [sp, #0x88]");
loc_00b8ec80:
    /* 0x00b8ec80: madd     x8, x25, x26, x22 */ ARM64("madd x8, x25, x26, x22");
    /* 0x00b8ec84: str      x22, [sp, #0x430] */ ARM64("str x22, [sp, #0x430]");
    /* 0x00b8ec88: str      x8, [sp, #0x438] */ ARM64("str x8, [sp, #0x438]");
    /* 0x00b8ec8c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8ec90: add      x1, sp, #0x430 */ ARM64("add x1, sp, #0x430");
    /* 0x00b8ec94: bl       #0xb94628 */ CALL_DIRECT(sub_00b94628);
    /* 0x00b8ec98: ldr      x19, [sp, #0xa0] */ ARM64("ldr x19, [sp, #0xa0]");
    /* 0x00b8ec9c: str      x27, [sp, #0x90] */ ARM64("str x27, [sp, #0x90]");
    /* 0x00b8eca0: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b8eca4: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00b8eca8: cmp      x8, x28 */ ARM64("cmp x8, x28");
    /* 0x00b8ecac: b.eq     #0xb90c18 */ if (COND_EQ) goto loc_00b90c18;
    /* 0x00b8ecb0: ldr      x8, [sp, #0x218] */ ARM64("ldr x8, [sp, #0x218]");
    /* 0x00b8ecb4: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
    /* 0x00b8ecb8: ldr      x27, [sp, #0x220] */ ARM64("ldr x27, [sp, #0x220]");
    /* 0x00b8ecbc: ldr      q0, [sp, #0x430] */ ARM64("ldr q0, [sp, #0x430]");
    /* 0x00b8ecc0: stur     q0, [x29, #-0xf0] */ ARM64("stur q0, [x29, #-0xf0]");
loc_00b8ecc4:
    /* 0x00b8ecc4: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b8ecc8: sub      x1, x29, #0xf0 */ ARM64("sub x1, x29, #0xf0");
    /* 0x00b8eccc: bl       #0xb94628 */ CALL_DIRECT(sub_00b94628);
    /* 0x00b8ecd0: ldr      x8, [sp, #0x320] */ ARM64("ldr x8, [sp, #0x320]");
    /* 0x00b8ecd4: cmp      x8, x28 */ ARM64("cmp x8, x28");
    /* 0x00b8ecd8: b.eq     #0xb8eff8 */ if (COND_EQ) goto loc_00b8eff8;
    /* 0x00b8ecdc: str      x8, [sp, #0xb8] */ ARM64("str x8, [sp, #0xb8]");
    /* 0x00b8ece0: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b8ece4: ldr      x8, [sp, #0x328] */ ARM64("ldr x8, [sp, #0x328]");
    /* 0x00b8ece8: str      x8, [sp, #0x118] */ ARM64("str x8, [sp, #0x118]");
    /* 0x00b8ecec: ldr      x20, [sp, #0x330] */ ARM64("ldr x20, [sp, #0x330]");
    /* 0x00b8ecf0: str      xzr, [sp, #0x210] */ ARM64("str xzr, [sp, #0x210]");
    /* 0x00b8ecf4: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b8ecf8: str      x8, [sp, #0x218] */ ARM64("str x8, [sp, #0x218]");
    /* 0x00b8ecfc: lsr      x8, x27, #0x3e */ ARM64("lsr x8, x27, #0x3e");
    /* 0x00b8ed00: str      xzr, [sp, #0x220] */ ARM64("str xzr, [sp, #0x220]");
    /* 0x00b8ed04: cbnz     x8, #0xb90edc */ if (x8 != 0) goto loc_00b90edc;
    /* 0x00b8ed08: lsl      x23, x27, #2 */ ARM64("lsl x23, x27, #2");
    /* 0x00b8ed0c: mov      x8, #0x7ffffffffffffffc */ ARM64("mov x8, #0x7ffffffffffffffc");
    /* 0x00b8ed10: cmp      x23, x8 */ ARM64("cmp x23, x8");
    /* 0x00b8ed14: b.hi     #0xb90edc */ if (COND_HI) goto loc_00b90edc;
    /* 0x00b8ed18: cbz      x23, #0xb8ed5c */ if (x23 == 0) goto loc_00b8ed5c;
    /* 0x00b8ed1c: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b8ed20: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8ed24: cbz      x0, #0xb90ed4 */ if (x0 == 0) goto loc_00b90ed4;
    /* 0x00b8ed28: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00b8ed2c: cset     w14, eq */ ARM64("cset w14, eq");
    /* 0x00b8ed30: cbz      x27, #0xb8ed78 */ if (x27 == 0) goto loc_00b8ed78;
    /* 0x00b8ed34: sub      x8, x27, #1 */ ARM64("sub x8, x27, #1");
    /* 0x00b8ed38: cmp      x27, x8 */ ARM64("cmp x27, x8");
    /* 0x00b8ed3c: csel     x8, x27, x8, lo */ ARM64("csel x8, x27, x8, lo");
    /* 0x00b8ed40: cmp      x8, #8 */ ARM64("cmp x8, #8");
    /* 0x00b8ed44: b.hs     #0xb8ed80 */ if (COND_HS) goto loc_00b8ed80;
    /* 0x00b8ed48: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00b8ed4c: mov      x8, x27 */ ARM64("mov x8, x27");
    /* 0x00b8ed50: ldr      x11, [sp, #0xb0] */ ARM64("ldr x11, [sp, #0xb0]");
    /* 0x00b8ed54: mov      x9, x11 */ ARM64("mov x9, x11");
    /* 0x00b8ed58: b        #0xb8edc8 */ goto loc_00b8edc8;
loc_00b8ed5c:
    /* 0x00b8ed5c: mov      w14, #1 */ ARM64("mov w14, #1");
    /* 0x00b8ed60: mov      w23, #4 */ ARM64("mov w23, #4");
    /* 0x00b8ed64: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b8ed68: str      x0, [sp, #0xa0] */ ARM64("str x0, [sp, #0xa0]");
    /* 0x00b8ed6c: cbnz     x27, #0xb8edf8 */ if (x27 != 0) goto loc_00b8edf8;
loc_00b8ed70:
    /* 0x00b8ed70: tbz      w14, #0, #0xb8ef08 */ if (((w14 >> #0) & 1) == 0) goto loc_00b8ef08;
    /* 0x00b8ed74: b        #0xb8ef10 */ goto loc_00b8ef10;
loc_00b8ed78:
    /* 0x00b8ed78: str      x0, [sp, #0xa0] */ ARM64("str x0, [sp, #0xa0]");
    /* 0x00b8ed7c: b        #0xb8ef10 */ goto loc_00b8ef10;
loc_00b8ed80:
    /* 0x00b8ed80: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8ed84: ands     x9, x8, #7 */ ARM64("ands x9, x8, #7");
    /* 0x00b8ed88: mov      w10, #8 */ ARM64("mov w10, #8");
    /* 0x00b8ed8c: csel     x9, x10, x9, eq */ ARM64("csel x9, x10, x9, eq");
    /* 0x00b8ed90: sub      x10, x8, x9 */ ARM64("sub x10, x8, x9");
    /* 0x00b8ed94: sub      x8, x27, x10 */ ARM64("sub x8, x27, x10");
    /* 0x00b8ed98: ldr      x11, [sp, #0xb0] */ ARM64("ldr x11, [sp, #0xb0]");
    /* 0x00b8ed9c: add      x9, x11, x10, lsl #2 */ ARM64("add x9, x11, x10, lsl #2");
    /* 0x00b8eda0: add      x11, x11, #0x10 */ ARM64("add x11, x11, #0x10");
    /* 0x00b8eda4: add      x12, x0, #0x10 */ ARM64("add x12, x0, #0x10");
    /* 0x00b8eda8: mov      x13, x10 */ ARM64("mov x13, x10");
loc_00b8edac:
    /* 0x00b8edac: ldp      q0, q1, [x11, #-0x10] */ ARM64("ldp q0, q1, [x11, #-0x10]");
    /* 0x00b8edb0: stp      q0, q1, [x12, #-0x10] */ ARM64("stp q0, q1, [x12, #-0x10]");
    /* 0x00b8edb4: add      x11, x11, #0x20 */ ARM64("add x11, x11, #0x20");
    /* 0x00b8edb8: add      x12, x12, #0x20 */ ARM64("add x12, x12, #0x20");
    /* 0x00b8edbc: subs     x13, x13, #8 */ ARM64("subs x13, x13, #8");
    /* 0x00b8edc0: b.ne     #0xb8edac */ if (COND_NE) goto loc_00b8edac;
    /* 0x00b8edc4: ldr      x11, [sp, #0xb0] */ ARM64("ldr x11, [sp, #0xb0]");
loc_00b8edc8:
    /* 0x00b8edc8: lsl      x10, x10, #2 */ ARM64("lsl x10, x10, #2");
    /* 0x00b8edcc: add      x11, x11, x27, lsl #2 */ ARM64("add x11, x11, x27, lsl #2");
loc_00b8edd0:
    /* 0x00b8edd0: cmp      x9, x11 */ ARM64("cmp x9, x11");
    /* 0x00b8edd4: b.eq     #0xb8edec */ if (COND_EQ) goto loc_00b8edec;
    /* 0x00b8edd8: ldr      w12, [x9], #4 */ ARM64("ldr w12, [x9], #4");
    /* 0x00b8eddc: str      w12, [x0, x10] */ ARM64("str w12, [x0, x10]");
    /* 0x00b8ede0: add      x10, x10, #4 */ ARM64("add x10, x10, #4");
    /* 0x00b8ede4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b8ede8: b.ne     #0xb8edd0 */ if (COND_NE) goto loc_00b8edd0;
loc_00b8edec:
    /* 0x00b8edec: mov      x23, x0 */ ARM64("mov x23, x0");
    /* 0x00b8edf0: str      x0, [sp, #0xa0] */ ARM64("str x0, [sp, #0xa0]");
    /* 0x00b8edf4: cbz      x27, #0xb8ed70 */ if (x27 == 0) goto loc_00b8ed70;
loc_00b8edf8:
    /* 0x00b8edf8: str      w14, [sp, #0x30] */ ARM64("str w14, [sp, #0x30]");
    /* 0x00b8edfc: str      x22, [sp, #0x38] */ ARM64("str x22, [sp, #0x38]");
    /* 0x00b8ee00: mov      x19, x27 */ ARM64("mov x19, x27");
    /* 0x00b8ee04: b        #0xb8ee0c */ goto loc_00b8ee0c;
loc_00b8ee08:
    /* 0x00b8ee08: cbz      x27, #0xb8ee80 */ if (x27 == 0) goto loc_00b8ee80;
loc_00b8ee0c:
    /* 0x00b8ee0c: mov      x22, x27 */ ARM64("mov x22, x27");
    /* 0x00b8ee10: sub      x27, x27, #1 */ ARM64("sub x27, x27, #1");
    /* 0x00b8ee14: cmp      x22, x19 */ ARM64("cmp x22, x19");
    /* 0x00b8ee18: b.hs     #0xb8ee08 */ if (COND_HS) goto loc_00b8ee08;
    /* 0x00b8ee1c: neg      x24, x19 */ ARM64("neg x24, x19");
    /* 0x00b8ee20: sub      x8, x23, #4 */ ARM64("sub x8, x23, #4");
    /* 0x00b8ee24: add      x26, x8, x19, lsl #2 */ ARM64("add x26, x8, x19, lsl #2");
    /* 0x00b8ee28: mov      x28, x19 */ ARM64("mov x28, x19");
    /* 0x00b8ee2c: b        #0xb8ee40 */ goto loc_00b8ee40;
loc_00b8ee30:
    /* 0x00b8ee30: add      x24, x24, #1 */ ARM64("add x24, x24, #1");
    /* 0x00b8ee34: sub      x26, x26, #4 */ ARM64("sub x26, x26, #4");
    /* 0x00b8ee38: cmp      x22, x28 */ ARM64("cmp x22, x28");
    /* 0x00b8ee3c: b.hs     #0xb8ee08 */ if (COND_HS) goto loc_00b8ee08;
loc_00b8ee40:
    /* 0x00b8ee40: cmp      x27, x19 */ ARM64("cmp x27, x19");
    /* 0x00b8ee44: b.hs     #0xb90c64 */ if (COND_HS) goto loc_00b90c64;
    /* 0x00b8ee48: sub      x28, x28, #1 */ ARM64("sub x28, x28, #1");
    /* 0x00b8ee4c: cmp      x28, x19 */ ARM64("cmp x28, x19");
    /* 0x00b8ee50: b.hs     #0xb90c54 */ if (COND_HS) goto loc_00b90c54;
    /* 0x00b8ee54: ldr      w8, [x23, x27, lsl #2] */ ARM64("ldr w8, [x23, x27, lsl #2]");
    /* 0x00b8ee58: ldr      w9, [x26] */ ARM64("ldr w9, [x26]");
    /* 0x00b8ee5c: cmp      w8, w9 */ ARM64("cmp w8, w9");
    /* 0x00b8ee60: b.ne     #0xb8ee30 */ if (COND_NE) goto loc_00b8ee30;
    /* 0x00b8ee64: add      x8, x19, x24 */ ARM64("add x8, x19, x24");
    /* 0x00b8ee68: lsl      x2, x8, #2 */ ARM64("lsl x2, x8, #2");
    /* 0x00b8ee6c: add      x1, x26, #4 */ ARM64("add x1, x26, #4");
    /* 0x00b8ee70: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b8ee74: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8ee78: sub      x19, x19, #1 */ ARM64("sub x19, x19, #1");
    /* 0x00b8ee7c: b        #0xb8ee30 */ goto loc_00b8ee30;
loc_00b8ee80:
    /* 0x00b8ee80: mov      w8, #4 */ ARM64("mov w8, #4");
    /* 0x00b8ee84: mov      x22, x23 */ ARM64("mov x22, x23");
    /* 0x00b8ee88: add      x26, x23, x19, lsl #2 */ ARM64("add x26, x23, x19, lsl #2");
    /* 0x00b8ee8c: mov      x24, #0xa95 */ ARM64("mov x24, #0xa95");
    /* 0x00b8ee90: movk     x24, #0x2722, lsl #16 */ ARM64("movk x24, #0x2722, lsl #16");
    /* 0x00b8ee94: movk     x24, #0xc1b7, lsl #32 */ ARM64("movk x24, #0xc1b7, lsl #32");
    /* 0x00b8ee98: movk     x24, #0x517c, lsl #48 */ ARM64("movk x24, #0x517c, lsl #48");
    /* 0x00b8ee9c: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00b8eea0: b        #0xb8eeb8 */ goto loc_00b8eeb8;
loc_00b8eea4:
    /* 0x00b8eea4: str      w19, [x8, x27, lsl #2] */ ARM64("str w19, [x8, x27, lsl #2]");
    /* 0x00b8eea8: add      x27, x27, #1 */ ARM64("add x27, x27, #1");
    /* 0x00b8eeac: str      x27, [sp, #0x220] */ ARM64("str x27, [sp, #0x220]");
loc_00b8eeb0:
    /* 0x00b8eeb0: cmp      x22, x26 */ ARM64("cmp x22, x26");
    /* 0x00b8eeb4: b.eq     #0xb8eef8 */ if (COND_EQ) goto loc_00b8eef8;
loc_00b8eeb8:
    /* 0x00b8eeb8: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b8eebc: ldr      w19, [x22], #4 */ ARM64("ldr w19, [x22], #4");
loc_00b8eec0:
    /* 0x00b8eec0: cmp      x20, x9 */ ARM64("cmp x20, x9");
    /* 0x00b8eec4: b.eq     #0xb8eeb0 */ if (COND_EQ) goto loc_00b8eeb0;
    /* 0x00b8eec8: ldr      x10, [sp, #0x118] */ ARM64("ldr x10, [sp, #0x118]");
    /* 0x00b8eecc: ldr      w10, [x10, x9, lsl #2] */ ARM64("ldr w10, [x10, x9, lsl #2]");
    /* 0x00b8eed0: add      x9, x9, #1 */ ARM64("add x9, x9, #1");
    /* 0x00b8eed4: cmp      w19, w10 */ ARM64("cmp w19, w10");
    /* 0x00b8eed8: b.ne     #0xb8eec0 */ if (COND_NE) goto loc_00b8eec0;
    /* 0x00b8eedc: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b8eee0: cmp      x27, x9 */ ARM64("cmp x27, x9");
    /* 0x00b8eee4: b.ne     #0xb8eea4 */ if (COND_NE) goto loc_00b8eea4;
    /* 0x00b8eee8: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8eeec: bl       #0xc6c494 */ CALL_DIRECT(sub_00c6c494);
    /* 0x00b8eef0: ldr      x8, [sp, #0x218] */ ARM64("ldr x8, [sp, #0x218]");
    /* 0x00b8eef4: b        #0xb8eea4 */ goto loc_00b8eea4;
loc_00b8eef8:
    /* 0x00b8eef8: mov      w26, #0x18 */ ARM64("mov w26, #0x18");
    /* 0x00b8eefc: ldr      x22, [sp, #0x38] */ ARM64("ldr x22, [sp, #0x38]");
    /* 0x00b8ef00: ldr      w8, [sp, #0x30] */ ARM64("ldr w8, [sp, #0x30]");
    /* 0x00b8ef04: tbnz     w8, #0, #0xb8ef10 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8ef10;
loc_00b8ef08:
    /* 0x00b8ef08: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b8ef0c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8ef10:
    /* 0x00b8ef10: ldr      x8, [sp, #0xb8] */ ARM64("ldr x8, [sp, #0xb8]");
    /* 0x00b8ef14: ldr      x19, [sp, #0x210] */ ARM64("ldr x19, [sp, #0x210]");
    /* 0x00b8ef18: ldr      x20, [sp, #0x218] */ ARM64("ldr x20, [sp, #0x218]");
    /* 0x00b8ef1c: cbz      x8, #0xb8ef28 */ if (x8 == 0) goto loc_00b8ef28;
    /* 0x00b8ef20: ldr      x0, [sp, #0x118] */ ARM64("ldr x0, [sp, #0x118]");
    /* 0x00b8ef24: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8ef28:
    /* 0x00b8ef28: ldr      x8, [sp, #0xc0] */ ARM64("ldr x8, [sp, #0xc0]");
    /* 0x00b8ef2c: cbz      x8, #0xb8ef38 */ if (x8 == 0) goto loc_00b8ef38;
    /* 0x00b8ef30: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00b8ef34: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8ef38:
    /* 0x00b8ef38: str      x20, [sp, #0xb0] */ ARM64("str x20, [sp, #0xb0]");
    /* 0x00b8ef3c: str      x19, [sp, #0xc0] */ ARM64("str x19, [sp, #0xc0]");
    /* 0x00b8ef40: ldr      x19, [sp, #0xa0] */ ARM64("ldr x19, [sp, #0xa0]");
    /* 0x00b8ef44: b        #0xb8ecc4 */ goto loc_00b8ecc4;
loc_00b8ef48:
    /* 0x00b8ef48: add      x0, x8, x24, lsl #3 */ ARM64("add x0, x8, x24, lsl #3");
    /* 0x00b8ef4c: sub      x8, x19, x25 */ ARM64("sub x8, x19, x25");
    /* 0x00b8ef50: lsl      x23, x8, #3 */ ARM64("lsl x23, x8, #3");
    /* 0x00b8ef54: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8ef58: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8ef5c: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8ef60: str      x27, [x22] */ ARM64("str x27, [x22]");
    /* 0x00b8ef64: add      x8, x20, #0x60 */ ARM64("add x8, x20, #0x60");
    /* 0x00b8ef68: add      x10, sp, #0x3a8 */ ARM64("add x10, sp, #0x3a8");
    /* 0x00b8ef6c: ldp      q0, q1, [x10, #0x20] */ ARM64("ldp q0, q1, [x10, #0x20]");
    /* 0x00b8ef70: stp      q0, q1, [sp, #0x230] */ ARM64("stp q0, q1, [sp, #0x230]");
    /* 0x00b8ef74: ldr      x9, [sp, #0x3e8] */ ARM64("ldr x9, [sp, #0x3e8]");
    /* 0x00b8ef78: str      x9, [sp, #0x250] */ ARM64("str x9, [sp, #0x250]");
    /* 0x00b8ef7c: ldp      q1, q0, [x10] */ ARM64("ldp q1, q0, [x10]");
    /* 0x00b8ef80: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8ef84: madd     x1, x25, x26, x8 */ ARM64("madd x1, x25, x26, x8");
    /* 0x00b8ef88: madd     x0, x24, x26, x8 */ ARM64("madd x0, x24, x26, x8");
    /* 0x00b8ef8c: sub      x8, x19, x25 */ ARM64("sub x8, x19, x25");
    /* 0x00b8ef90: add      x8, x23, x8 */ ARM64("add x8, x23, x8");
    /* 0x00b8ef94: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b8ef98: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
loc_00b8ef9c:
    /* 0x00b8ef9c: madd     x8, x25, x26, x20 */ ARM64("madd x8, x25, x26, x20");
    /* 0x00b8efa0: add      w9, w19, #1 */ ARM64("add w9, w19, #1");
    /* 0x00b8efa4: ldr      q0, [sp, #0x210] */ ARM64("ldr q0, [sp, #0x210]");
    /* 0x00b8efa8: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
    /* 0x00b8efac: ldp      q0, q1, [sp, #0x220] */ ARM64("ldp q0, q1, [sp, #0x220]");
    /* 0x00b8efb0: ldr      q2, [sp, #0x240] */ ARM64("ldr q2, [sp, #0x240]");
    /* 0x00b8efb4: ldr      x10, [sp, #0x250] */ ARM64("ldr x10, [sp, #0x250]");
    /* 0x00b8efb8: str      x10, [x8, #0xa0] */ ARM64("str x10, [x8, #0xa0]");
    /* 0x00b8efbc: stp      q1, q2, [x8, #0x80] */ ARM64("stp q1, q2, [x8, #0x80]");
    /* 0x00b8efc0: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00b8efc4: strh     w9, [x20, #0x37a] */ ARM64("strh w9, [x20, #0x37a]");
    /* 0x00b8efc8: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00b8efcc: add      x9, sp, #0x430 */ ARM64("add x9, sp, #0x430");
    /* 0x00b8efd0: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b8efd4: b        #0xb8f304 */ goto loc_00b8f304;
loc_00b8efd8:
    /* 0x00b8efd8: cmp      x8, #5 */ ARM64("cmp x8, #5");
    /* 0x00b8efdc: b.eq     #0xb8f128 */ if (COND_EQ) goto loc_00b8f128;
    /* 0x00b8efe0: cmp      x8, #6 */ ARM64("cmp x8, #6");
    /* 0x00b8efe4: b.ne     #0xb8f134 */ if (COND_NE) goto loc_00b8f134;
    /* 0x00b8efe8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8efec: mov      w19, #1 */ ARM64("mov w19, #1");
    /* 0x00b8eff0: mov      w24, #5 */ ARM64("mov w24, #5");
    /* 0x00b8eff4: b        #0xb8f140 */ goto loc_00b8f140;
loc_00b8eff8:
    /* 0x00b8eff8: mov      x20, x22 */ ARM64("mov x20, x22");
    /* 0x00b8effc: cmp      x27, #0 */ ARM64("cmp x27, #0");
    /* 0x00b8f000: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b8f004: str      w8, [sp, #0x118] */ ARM64("str w8, [sp, #0x118]");
    /* 0x00b8f008: cbz      x27, #0xb90f00 */ if (x27 == 0) goto loc_00b90f00;
    /* 0x00b8f00c: ldr      x8, [sp, #0xb0] */ ARM64("ldr x8, [sp, #0xb0]");
    /* 0x00b8f010: ldr      w22, [x8] */ ARM64("ldr w22, [x8]");
    /* 0x00b8f014: ldr      x11, [sp, #0x90] */ ARM64("ldr x11, [sp, #0x90]");
    /* 0x00b8f018: ldr      d0, [x11] */ ARM64("ldr d0, [x11]");
    /* 0x00b8f01c: ldr      x12, [sp, #0x108] */ ARM64("ldr x12, [sp, #0x108]");
    /* 0x00b8f020: lsl      x8, x12, #4 */ ARM64("lsl x8, x12, #4");
    /* 0x00b8f024: add      x9, x8, x12 */ ARM64("add x9, x8, x12");
    /* 0x00b8f028: sub      x8, x11, x8 */ ARM64("sub x8, x11, x8");
    /* 0x00b8f02c: sub      x10, x8, #0x10 */ ARM64("sub x10, x8, #0x10");
    /* 0x00b8f030: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b8f034: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b8f038: cmp      x12, #0 */ ARM64("cmp x12, #0");
    /* 0x00b8f03c: csel     w8, w8, w8, eq */ ARM64("csel w8, w8, w8, eq");
    /* 0x00b8f040: csel     x0, x8, x10, eq */ ARM64("csel x0, x8, x10, eq");
    /* 0x00b8f044: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8f048: fmov     x9, d0 */ ARM64("fmov x9, d0");
    /* 0x00b8f04c: and      x10, x9, #0x8080808080808080 */ ARM64("and x10, x9, #0x8080808080808080");
    /* 0x00b8f050: mov      x9, x11 */ ARM64("mov x9, x11");
    /* 0x00b8f054: ldp      x15, x14, [sp, #0x48] */ ARM64("ldp x15, x14, [sp, #0x48]");
    /* 0x00b8f058: b        #0xb8f088 */ goto loc_00b8f088;
loc_00b8f05c:
    /* 0x00b8f05c: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00b8f060: rbit     x12, x10 */ ARM64("rbit x12, x10");
    /* 0x00b8f064: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b8f068: and      x10, x11, x10 */ ARM64("and x10, x11, x10");
    /* 0x00b8f06c: lsl      x11, x12, #1 */ ARM64("lsl x11, x12, #1");
    /* 0x00b8f070: and      x11, x11, #0xf0 */ ARM64("and x11, x11, #0xf0");
    /* 0x00b8f074: sub      x11, x9, x11 */ ARM64("sub x11, x9, x11");
    /* 0x00b8f078: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00b8f07c: ldur     w12, [x11, #-0x10] */ ARM64("ldur w12, [x11, #-0x10]");
    /* 0x00b8f080: cmp      x12, x22 */ ARM64("cmp x12, x22");
    /* 0x00b8f084: b.eq     #0xb8f108 */ if (COND_EQ) goto loc_00b8f108;
loc_00b8f088:
    /* 0x00b8f088: cbz      x14, #0xb8f0d0 */ if (x14 == 0) goto loc_00b8f0d0;
    /* 0x00b8f08c: mov      x13, x14 */ ARM64("mov x13, x14");
    /* 0x00b8f090: cbnz     x10, #0xb8f05c */ if (x10 != 0) goto loc_00b8f05c;
loc_00b8f094:
    /* 0x00b8f094: ldr      d0, [x15], #8 */ ARM64("ldr d0, [x15], #8");
    /* 0x00b8f098: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8f09c: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00b8f0a0: sub      x9, x9, #0x80 */ ARM64("sub x9, x9, #0x80");
    /* 0x00b8f0a4: and      x10, x10, #0x8080808080808080 */ ARM64("and x10, x10, #0x8080808080808080");
    /* 0x00b8f0a8: cbz      x10, #0xb8f094 */ if (x10 == 0) goto loc_00b8f094;
    /* 0x00b8f0ac: b        #0xb8f05c */ goto loc_00b8f05c;
loc_00b8f0b0:
    /* 0x00b8f0b0: str      xzr, [sp, #0x40] */ ARM64("str xzr, [sp, #0x40]");
    /* 0x00b8f0b4: ldr      x8, [sp, #0xd8] */ ARM64("ldr x8, [sp, #0xd8]");
    /* 0x00b8f0b8: ldrb     w8, [x8, #0x10] */ ARM64("ldrb w8, [x8, #0x10]");
    /* 0x00b8f0bc: tbnz     w8, #0, #0xb8eaa8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8eaa8;
loc_00b8f0c0:
    /* 0x00b8f0c0: ldr      x0, [sp, #0xd8] */ ARM64("ldr x0, [sp, #0xd8]");
    /* 0x00b8f0c4: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b8f0c8: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b8f0cc: b        #0xb8eaa8 */ goto loc_00b8eaa8;
loc_00b8f0d0:
    /* 0x00b8f0d0: ldr      x9, [sp, #0x108] */ ARM64("ldr x9, [sp, #0x108]");
    /* 0x00b8f0d4: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b8f0d8: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00b8f0dc: orr      w8, w8, w9 */ ARM64("orr w8, w8, w9");
    /* 0x00b8f0e0: tbnz     w8, #0, #0xb8f0e8 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8f0e8;
    /* 0x00b8f0e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8f0e8:
    /* 0x00b8f0e8: ldr      x11, [sp, #0x110] */ ARM64("ldr x11, [sp, #0x110]");
    /* 0x00b8f0ec: ldp      x8, x9, [x11, #0x20] */ ARM64("ldp x8, x9, [x11, #0x20]");
    /* 0x00b8f0f0: ldp      x11, x10, [x11, #8] */ ARM64("ldp x11, x10, [x11, #8]");
    /* 0x00b8f0f4: cmp      x10, x22 */ ARM64("cmp x10, x22");
    /* 0x00b8f0f8: b.ls     #0xb8fb24 */ if (COND_LS) goto loc_00b8fb24;
    /* 0x00b8f0fc: umaddl   x12, w22, w26, x11 */ ARM64("umaddl x12, w22, w26, x11");
    /* 0x00b8f100: ldr      w12, [x12, #0x10] */ ARM64("ldr w12, [x12, #0x10]");
    /* 0x00b8f104: b        #0xb8fb28 */ goto loc_00b8fb28;
loc_00b8f108:
    /* 0x00b8f108: ldur     x27, [x11, #-8] */ ARM64("ldur x27, [x11, #-8]");
    /* 0x00b8f10c: ldr      x9, [sp, #0x108] */ ARM64("ldr x9, [sp, #0x108]");
    /* 0x00b8f110: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b8f114: cset     w9, eq */ ARM64("cset w9, eq");
    /* 0x00b8f118: orr      w8, w8, w9 */ ARM64("orr w8, w8, w9");
    /* 0x00b8f11c: tbnz     w8, #0, #0xb8fbb4 */ if (((w8 >> #0) & 1) != 0) goto loc_00b8fbb4;
    /* 0x00b8f120: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8f124: b        #0xb8fbb4 */ goto loc_00b8fbb4;
loc_00b8f128:
    /* 0x00b8f128: mov      x24, x8 */ ARM64("mov x24, x8");
    /* 0x00b8f12c: mov      w19, #0 */ ARM64("mov w19, #0");
    /* 0x00b8f130: b        #0xb8f140 */ goto loc_00b8f140;
loc_00b8f134:
    /* 0x00b8f134: sub      x8, x8, #7 */ ARM64("sub x8, x8, #7");
    /* 0x00b8f138: mov      w19, #1 */ ARM64("mov w19, #1");
    /* 0x00b8f13c: mov      w24, #6 */ ARM64("mov w24, #6");
loc_00b8f140:
    /* 0x00b8f140: str      x8, [sp, #0x50] */ ARM64("str x8, [sp, #0x50]");
    /* 0x00b8f144: mov      w0, #0x380 */ ARM64("mov w0, #0x380");
    /* 0x00b8f148: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8f14c: cbz      x0, #0xb90cc0 */ if (x0 == 0) goto loc_00b90cc0;
    /* 0x00b8f150: str      w19, [sp, #0x118] */ ARM64("str w19, [sp, #0x118]");
    /* 0x00b8f154: str      xzr, [x0] */ ARM64("str xzr, [x0]");
    /* 0x00b8f158: strh     wzr, [x0, #0x37a] */ ARM64("strh wzr, [x0, #0x37a]");
    /* 0x00b8f15c: ldrh     w8, [x20, #0x37a] */ ARM64("ldrh w8, [x20, #0x37a]");
    /* 0x00b8f160: mvn      x9, x24 */ ARM64("mvn x9, x24");
    /* 0x00b8f164: add      x22, x8, x9 */ ARM64("add x22, x8, x9");
    /* 0x00b8f168: strh     w22, [x0, #0x37a] */ ARM64("strh w22, [x0, #0x37a]");
    /* 0x00b8f16c: add      x8, x20, #8 */ ARM64("add x8, x20, #8");
    /* 0x00b8f170: ldr      x9, [x8, x24, lsl #3] */ ARM64("ldr x9, [x8, x24, lsl #3]");
    /* 0x00b8f174: str      x9, [sp, #0x108] */ ARM64("str x9, [sp, #0x108]");
    /* 0x00b8f178: add      x25, x20, #0x60 */ ARM64("add x25, x20, #0x60");
    /* 0x00b8f17c: madd     x9, x24, x26, x25 */ ARM64("madd x9, x24, x26, x25");
    /* 0x00b8f180: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00b8f184: str      q0, [sp, #0x210] */ ARM64("str q0, [sp, #0x210]");
    /* 0x00b8f188: ldp      q0, q1, [x9, #0x10] */ ARM64("ldp q0, q1, [x9, #0x10]");
    /* 0x00b8f18c: ldr      q2, [x9, #0x30] */ ARM64("ldr q2, [x9, #0x30]");
    /* 0x00b8f190: ldr      x9, [x9, #0x40] */ ARM64("ldr x9, [x9, #0x40]");
    /* 0x00b8f194: str      x9, [sp, #0x250] */ ARM64("str x9, [sp, #0x250]");
    /* 0x00b8f198: stp      q1, q2, [sp, #0x230] */ ARM64("stp q1, q2, [sp, #0x230]");
    /* 0x00b8f19c: str      q0, [sp, #0x220] */ ARM64("str q0, [sp, #0x220]");
    /* 0x00b8f1a0: cmp      x22, #0xc */ ARM64("cmp x22, #0xc");
    /* 0x00b8f1a4: mov      w28, #0x48 */ ARM64("mov w28, #0x48");
    /* 0x00b8f1a8: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x00b8f1ac: b.hs     #0xb90c78 */ if (COND_HS) goto loc_00b90c78;
    /* 0x00b8f1b0: add      x26, x24, #1 */ ARM64("add x26, x24, #1");
    /* 0x00b8f1b4: add      x1, x8, x26, lsl #3 */ ARM64("add x1, x8, x26, lsl #3");
    /* 0x00b8f1b8: lsl      x23, x22, #3 */ ARM64("lsl x23, x22, #3");
    /* 0x00b8f1bc: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b8f1c0: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f1c4: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8f1c8: madd     x1, x26, x28, x25 */ ARM64("madd x1, x26, x28, x25");
    /* 0x00b8f1cc: add      x8, x23, x22 */ ARM64("add x8, x23, x22");
    /* 0x00b8f1d0: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b8f1d4: add      x0, x19, #0x60 */ ARM64("add x0, x19, #0x60");
    /* 0x00b8f1d8: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8f1dc: strh     w24, [x20, #0x37a] */ ARM64("strh w24, [x20, #0x37a]");
    /* 0x00b8f1e0: ldr      x11, [sp, #0x210] */ ARM64("ldr x11, [sp, #0x210]");
    /* 0x00b8f1e4: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b8f1e8: ldur     q0, [x8, #8] */ ARM64("ldur q0, [x8, #8]");
    /* 0x00b8f1ec: ldur     q1, [x8, #0x18] */ ARM64("ldur q1, [x8, #0x18]");
    /* 0x00b8f1f0: stp      q0, q1, [sp, #0x320] */ ARM64("stp q0, q1, [sp, #0x320]");
    /* 0x00b8f1f4: ldur     q0, [x8, #0x28] */ ARM64("ldur q0, [x8, #0x28]");
    /* 0x00b8f1f8: ldur     q1, [x8, #0x38] */ ARM64("ldur q1, [x8, #0x38]");
    /* 0x00b8f1fc: stp      q0, q1, [sp, #0x340] */ ARM64("stp q0, q1, [sp, #0x340]");
    /* 0x00b8f200: ldr      w8, [sp, #0x118] */ ARM64("ldr w8, [sp, #0x118]");
    /* 0x00b8f204: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x00b8f208: str      x19, [sp, #0xc0] */ ARM64("str x19, [sp, #0xc0]");
    /* 0x00b8f20c: csel     x23, x19, x20, ne */ ARM64("csel x23, x19, x20, ne");
    /* 0x00b8f210: ldrh     w12, [x23, #0x37a] */ ARM64("ldrh w12, [x23, #0x37a]");
    /* 0x00b8f214: add      x8, x23, #8 */ ARM64("add x8, x23, #8");
    /* 0x00b8f218: ldr      x24, [sp, #0x50] */ ARM64("ldr x24, [sp, #0x50]");
    /* 0x00b8f21c: add      x22, x8, x24, lsl #3 */ ARM64("add x22, x8, x24, lsl #3");
    /* 0x00b8f220: subs     x25, x12, x24 */ ARM64("subs x25, x12, x24");
    /* 0x00b8f224: mov      w26, #0x48 */ ARM64("mov w26, #0x48");
    /* 0x00b8f228: b.ls     #0xb8f288 */ if (COND_LS) goto loc_00b8f288;
    /* 0x00b8f22c: lsl      x19, x25, #3 */ ARM64("lsl x19, x25, #3");
    /* 0x00b8f230: add      x0, x22, #8 */ ARM64("add x0, x22, #8");
    /* 0x00b8f234: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8f238: mov      x2, x19 */ ARM64("mov x2, x19");
    /* 0x00b8f23c: str      x11, [sp, #0x118] */ ARM64("str x11, [sp, #0x118]");
    /* 0x00b8f240: mov      x28, x12 */ ARM64("mov x28, x12");
    /* 0x00b8f244: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f248: madd     x8, x24, x26, x23 */ ARM64("madd x8, x24, x26, x23");
    /* 0x00b8f24c: add      x10, sp, #0x3a8 */ ARM64("add x10, sp, #0x3a8");
    /* 0x00b8f250: ldp      q0, q1, [x10, #0x20] */ ARM64("ldp q0, q1, [x10, #0x20]");
    /* 0x00b8f254: stp      q0, q1, [sp, #0x230] */ ARM64("stp q0, q1, [sp, #0x230]");
    /* 0x00b8f258: ldr      x9, [sp, #0x3e8] */ ARM64("ldr x9, [sp, #0x3e8]");
    /* 0x00b8f25c: str      x9, [sp, #0x250] */ ARM64("str x9, [sp, #0x250]");
    /* 0x00b8f260: ldp      q1, q0, [x10] */ ARM64("ldp q1, q0, [x10]");
    /* 0x00b8f264: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b8f268: add      x9, x19, x25 */ ARM64("add x9, x19, x25");
    /* 0x00b8f26c: lsl      x2, x9, #3 */ ARM64("lsl x2, x9, #3");
    /* 0x00b8f270: add      x0, x8, #0xa8 */ ARM64("add x0, x8, #0xa8");
    /* 0x00b8f274: add      x1, x8, #0x60 */ ARM64("add x1, x8, #0x60");
    /* 0x00b8f278: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f27c: mov      x12, x28 */ ARM64("mov x12, x28");
    /* 0x00b8f280: ldr      x11, [sp, #0x118] */ ARM64("ldr x11, [sp, #0x118]");
    /* 0x00b8f284: b        #0xb8f2a4 */ goto loc_00b8f2a4;
loc_00b8f288:
    /* 0x00b8f288: add      x9, sp, #0x3a8 */ ARM64("add x9, sp, #0x3a8");
    /* 0x00b8f28c: ldp      q0, q1, [x9, #0x20] */ ARM64("ldp q0, q1, [x9, #0x20]");
    /* 0x00b8f290: stp      q0, q1, [sp, #0x230] */ ARM64("stp q0, q1, [sp, #0x230]");
    /* 0x00b8f294: ldr      x8, [sp, #0x3e8] */ ARM64("ldr x8, [sp, #0x3e8]");
    /* 0x00b8f298: str      x8, [sp, #0x250] */ ARM64("str x8, [sp, #0x250]");
    /* 0x00b8f29c: ldp      q1, q0, [x9] */ ARM64("ldp q1, q0, [x9]");
    /* 0x00b8f2a0: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
loc_00b8f2a4:
    /* 0x00b8f2a4: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00b8f2a8: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b8f2ac: str      x27, [x22] */ ARM64("str x27, [x22]");
    /* 0x00b8f2b0: madd     x9, x24, x26, x23 */ ARM64("madd x9, x24, x26, x23");
    /* 0x00b8f2b4: ldr      q0, [sp, #0x210] */ ARM64("ldr q0, [sp, #0x210]");
    /* 0x00b8f2b8: str      q0, [x9, #0x60] */ ARM64("str q0, [x9, #0x60]");
    /* 0x00b8f2bc: ldp      q0, q1, [sp, #0x220] */ ARM64("ldp q0, q1, [sp, #0x220]");
    /* 0x00b8f2c0: ldr      q2, [sp, #0x240] */ ARM64("ldr q2, [sp, #0x240]");
    /* 0x00b8f2c4: ldr      x10, [sp, #0x250] */ ARM64("ldr x10, [sp, #0x250]");
    /* 0x00b8f2c8: str      x10, [x9, #0xa0] */ ARM64("str x10, [x9, #0xa0]");
    /* 0x00b8f2cc: add      w10, w12, #1 */ ARM64("add w10, w12, #1");
    /* 0x00b8f2d0: stp      q1, q2, [x9, #0x80] */ ARM64("stp q1, q2, [x9, #0x80]");
    /* 0x00b8f2d4: str      q0, [x9, #0x70] */ ARM64("str q0, [x9, #0x70]");
    /* 0x00b8f2d8: strh     w10, [x23, #0x37a] */ ARM64("strh w10, [x23, #0x37a]");
    /* 0x00b8f2dc: str      x11, [sp, #0x430] */ ARM64("str x11, [sp, #0x430]");
    /* 0x00b8f2e0: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00b8f2e4: stp      q0, q1, [x29, #-0xf0] */ ARM64("stp q0, q1, [x29, #-0xf0]");
    /* 0x00b8f2e8: ldp      q0, q1, [sp, #0x340] */ ARM64("ldp q0, q1, [sp, #0x340]");
    /* 0x00b8f2ec: stp      q0, q1, [x29, #-0xd0] */ ARM64("stp q0, q1, [x29, #-0xd0]");
    /* 0x00b8f2f0: add      x9, sp, #0x390 */ ARM64("add x9, sp, #0x390");
    /* 0x00b8f2f4: mov      x25, x24 */ ARM64("mov x25, x24");
    /* 0x00b8f2f8: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b8f2fc: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00b8f300: ldr      x10, [sp, #0x108] */ ARM64("ldr x10, [sp, #0x108]");
loc_00b8f304:
    /* 0x00b8f304: str      x8, [x9] */ ARM64("str x8, [x9]");
    /* 0x00b8f308: ldr      x8, [sp, #0x430] */ ARM64("ldr x8, [sp, #0x430]");
    /* 0x00b8f30c: cmp      x8, x28 */ ARM64("cmp x8, x28");
    /* 0x00b8f310: b.ne     #0xb8f31c */ if (COND_NE) goto loc_00b8f31c;
    /* 0x00b8f314: ldr      x23, [sp, #0x88] */ ARM64("ldr x23, [sp, #0x88]");
    /* 0x00b8f318: b        #0xb8f91c */ goto loc_00b8f91c;
loc_00b8f31c:
    /* 0x00b8f31c: stp      x0, x25, [sp, #0x48] */ ARM64("stp x0, x25, [sp, #0x48]");
    /* 0x00b8f320: ldp      q0, q1, [x29, #-0xf0] */ ARM64("ldp q0, q1, [x29, #-0xf0]");
    /* 0x00b8f324: stp      q0, q1, [sp, #0x3f0] */ ARM64("stp q0, q1, [sp, #0x3f0]");
    /* 0x00b8f328: ldp      q0, q1, [x29, #-0xd0] */ ARM64("ldp q0, q1, [x29, #-0xd0]");
    /* 0x00b8f32c: str      q0, [sp, #0x410] */ ARM64("str q0, [sp, #0x410]");
    /* 0x00b8f330: str      q1, [sp, #0x420] */ ARM64("str q1, [sp, #0x420]");
    /* 0x00b8f334: ldr      x19, [sp, #0x390] */ ARM64("ldr x19, [sp, #0x390]");
    /* 0x00b8f338: ldr      x24, [x20] */ ARM64("ldr x24, [x20]");
    /* 0x00b8f33c: cbz      x24, #0xb8f830 */ if (x24 == 0) goto loc_00b8f830;
    /* 0x00b8f340: ldr      x12, [sp, #0x40] */ ARM64("ldr x12, [sp, #0x40]");
loc_00b8f344:
    /* 0x00b8f344: ldrh     w28, [x20, #0x378] */ ARM64("ldrh w28, [x20, #0x378]");
    /* 0x00b8f348: stur     x8, [x29, #-0xf0] */ ARM64("stur x8, [x29, #-0xf0]");
    /* 0x00b8f34c: ldp      q0, q1, [sp, #0x3f0] */ ARM64("ldp q0, q1, [sp, #0x3f0]");
    /* 0x00b8f350: sub      x8, x29, #0xf0 */ ARM64("sub x8, x29, #0xf0");
    /* 0x00b8f354: stur     q0, [x8, #8] */ ARM64("stur q0, [x8, #8]");
    /* 0x00b8f358: stur     q1, [x8, #0x18] */ ARM64("stur q1, [x8, #0x18]");
    /* 0x00b8f35c: ldr      q0, [sp, #0x410] */ ARM64("ldr q0, [sp, #0x410]");
    /* 0x00b8f360: ldr      q1, [sp, #0x420] */ ARM64("ldr q1, [sp, #0x420]");
    /* 0x00b8f364: stur     q0, [x8, #0x28] */ ARM64("stur q0, [x8, #0x28]");
    /* 0x00b8f368: stur     q1, [x8, #0x38] */ ARM64("stur q1, [x8, #0x38]");
    /* 0x00b8f36c: cmp      x19, x12 */ ARM64("cmp x19, x12");
    /* 0x00b8f370: b.ne     #0xb90bac */ if (COND_NE) goto loc_00b90bac;
    /* 0x00b8f374: ldrh     w11, [x24, #0x37a] */ ARM64("ldrh w11, [x24, #0x37a]");
    /* 0x00b8f378: cmp      w11, #0xb */ ARM64("cmp w11, #0xb");
    /* 0x00b8f37c: b.hs     #0xb8f44c */ if (COND_HS) goto loc_00b8f44c;
    /* 0x00b8f380: add      x8, x24, #8 */ ARM64("add x8, x24, #8");
    /* 0x00b8f384: add      x13, x28, #1 */ ARM64("add x13, x28, #1");
    /* 0x00b8f388: add      x22, x8, x28, lsl #3 */ ARM64("add x22, x8, x28, lsl #3");
    /* 0x00b8f38c: cmp      w28, w11 */ ARM64("cmp w28, w11");
    /* 0x00b8f390: b.hs     #0xb8f46c */ if (COND_HS) goto loc_00b8f46c;
    /* 0x00b8f394: lsl      x26, x13, #3 */ ARM64("lsl x26, x13, #3");
    /* 0x00b8f398: sub      x9, x11, x28 */ ARM64("sub x9, x11, x28");
    /* 0x00b8f39c: stp      x11, x23, [sp, #0xb8] */ ARM64("stp x11, x23, [sp, #0xb8]");
    /* 0x00b8f3a0: lsl      x23, x9, #3 */ ARM64("lsl x23, x9, #3");
    /* 0x00b8f3a4: sub      x19, x11, x28 */ ARM64("sub x19, x11, x28");
    /* 0x00b8f3a8: add      x0, x8, x26 */ ARM64("add x0, x8, x26");
    /* 0x00b8f3ac: str      x12, [sp, #0x118] */ ARM64("str x12, [sp, #0x118]");
    /* 0x00b8f3b0: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8f3b4: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f3b8: str      x10, [sp, #0x108] */ ARM64("str x10, [sp, #0x108]");
    /* 0x00b8f3bc: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f3c0: add      x8, x24, #0x60 */ ARM64("add x8, x24, #0x60");
    /* 0x00b8f3c4: str      x27, [sp, #0xb0] */ ARM64("str x27, [sp, #0xb0]");
    /* 0x00b8f3c8: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00b8f3cc: umaddl   x27, w28, w9, x8 */ ARM64("umaddl x27, w28, w9, x8");
    /* 0x00b8f3d0: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00b8f3d4: add      x10, x28, #1 */ ARM64("add x10, x28, #1");
    /* 0x00b8f3d8: umaddl   x0, w10, w9, x8 */ ARM64("umaddl x0, w10, w9, x8");
    /* 0x00b8f3dc: add      x8, x23, x19 */ ARM64("add x8, x23, x19");
    /* 0x00b8f3e0: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b8f3e4: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b8f3e8: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f3ec: ldur     q0, [x29, #-0xe0] */ ARM64("ldur q0, [x29, #-0xe0]");
    /* 0x00b8f3f0: str      q0, [x27, #0x10] */ ARM64("str q0, [x27, #0x10]");
    /* 0x00b8f3f4: ldur     q0, [x29, #-0xd0] */ ARM64("ldur q0, [x29, #-0xd0]");
    /* 0x00b8f3f8: str      q0, [x27, #0x20] */ ARM64("str q0, [x27, #0x20]");
    /* 0x00b8f3fc: ldur     q0, [x29, #-0xc0] */ ARM64("ldur q0, [x29, #-0xc0]");
    /* 0x00b8f400: str      q0, [x27, #0x30] */ ARM64("str q0, [x27, #0x30]");
    /* 0x00b8f404: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00b8f408: str      x8, [x27, #0x40] */ ARM64("str x8, [x27, #0x40]");
    /* 0x00b8f40c: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00b8f410: str      q0, [x27] */ ARM64("str q0, [x27]");
    /* 0x00b8f414: ldr      x27, [sp, #0xb0] */ ARM64("ldr x27, [sp, #0xb0]");
    /* 0x00b8f418: add      x8, x24, #0x380 */ ARM64("add x8, x24, #0x380");
    /* 0x00b8f41c: add      x9, x8, x28, lsl #3 */ ARM64("add x9, x8, x28, lsl #3");
    /* 0x00b8f420: add      x0, x9, #0x10 */ ARM64("add x0, x9, #0x10");
    /* 0x00b8f424: add      x1, x8, x26 */ ARM64("add x1, x8, x26");
    /* 0x00b8f428: mov      w26, #0x48 */ ARM64("mov w26, #0x48");
    /* 0x00b8f42c: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f430: ldr      x23, [sp, #0xc0] */ ARM64("ldr x23, [sp, #0xc0]");
    /* 0x00b8f434: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f438: add      x13, x28, #1 */ ARM64("add x13, x28, #1");
    /* 0x00b8f43c: ldr      x11, [sp, #0xb8] */ ARM64("ldr x11, [sp, #0xb8]");
    /* 0x00b8f440: ldr      x12, [sp, #0x118] */ ARM64("ldr x12, [sp, #0x118]");
    /* 0x00b8f444: ldr      x10, [sp, #0x108] */ ARM64("ldr x10, [sp, #0x108]");
    /* 0x00b8f448: b        #0xb8f498 */ goto loc_00b8f498;
loc_00b8f44c:
    /* 0x00b8f44c: cmp      w28, #5 */ ARM64("cmp w28, #5");
    /* 0x00b8f450: str      x10, [sp, #0x108] */ ARM64("str x10, [sp, #0x108]");
    /* 0x00b8f454: str      x12, [sp, #0x118] */ ARM64("str x12, [sp, #0x118]");
    /* 0x00b8f458: str      x11, [sp, #0xb8] */ ARM64("str x11, [sp, #0xb8]");
    /* 0x00b8f45c: b.hs     #0xb8f4ec */ if (COND_HS) goto loc_00b8f4ec;
    /* 0x00b8f460: str      wzr, [sp, #0x90] */ ARM64("str wzr, [sp, #0x90]");
    /* 0x00b8f464: mov      w27, #4 */ ARM64("mov w27, #4");
    /* 0x00b8f468: b        #0xb8f528 */ goto loc_00b8f528;
loc_00b8f46c:
    /* 0x00b8f46c: umaddl   x8, w28, w26, x24 */ ARM64("umaddl x8, w28, w26, x24");
    /* 0x00b8f470: ldur     q0, [x29, #-0xe0] */ ARM64("ldur q0, [x29, #-0xe0]");
    /* 0x00b8f474: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00b8f478: ldur     q0, [x29, #-0xd0] */ ARM64("ldur q0, [x29, #-0xd0]");
    /* 0x00b8f47c: str      q0, [x8, #0x80] */ ARM64("str q0, [x8, #0x80]");
    /* 0x00b8f480: ldur     q0, [x29, #-0xc0] */ ARM64("ldur q0, [x29, #-0xc0]");
    /* 0x00b8f484: str      q0, [x8, #0x90] */ ARM64("str q0, [x8, #0x90]");
    /* 0x00b8f488: ldur     x9, [x29, #-0xb0] */ ARM64("ldur x9, [x29, #-0xb0]");
    /* 0x00b8f48c: str      x9, [x8, #0xa0] */ ARM64("str x9, [x8, #0xa0]");
    /* 0x00b8f490: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00b8f494: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
loc_00b8f498:
    /* 0x00b8f498: add      w8, w11, #1 */ ARM64("add w8, w11, #1");
    /* 0x00b8f49c: str      x10, [x22] */ ARM64("str x10, [x22]");
    /* 0x00b8f4a0: add      x9, x24, x13, lsl #3 */ ARM64("add x9, x24, x13, lsl #3");
    /* 0x00b8f4a4: add      x10, x11, #2 */ ARM64("add x10, x11, #2");
    /* 0x00b8f4a8: str      x23, [x9, #0x380] */ ARM64("str x23, [x9, #0x380]");
    /* 0x00b8f4ac: strh     w8, [x24, #0x37a] */ ARM64("strh w8, [x24, #0x37a]");
    /* 0x00b8f4b0: cmp      x13, x10 */ ARM64("cmp x13, x10");
    /* 0x00b8f4b4: b.hs     #0xb8f4e0 */ if (COND_HS) goto loc_00b8f4e0;
    /* 0x00b8f4b8: add      x8, x28, #0x71 */ ARM64("add x8, x28, #0x71");
    /* 0x00b8f4bc: neg      x9, x11 */ ARM64("neg x9, x11");
loc_00b8f4c0:
    /* 0x00b8f4c0: ldr      x10, [x24, x8, lsl #3] */ ARM64("ldr x10, [x24, x8, lsl #3]");
    /* 0x00b8f4c4: sub      w11, w8, #0x70 */ ARM64("sub w11, w8, #0x70");
    /* 0x00b8f4c8: str      x24, [x10] */ ARM64("str x24, [x10]");
    /* 0x00b8f4cc: strh     w11, [x10, #0x378] */ ARM64("strh w11, [x10, #0x378]");
    /* 0x00b8f4d0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8f4d4: add      x10, x9, x8 */ ARM64("add x10, x9, x8");
    /* 0x00b8f4d8: cmp      x10, #0x72 */ ARM64("cmp x10, #0x72");
    /* 0x00b8f4dc: b.ne     #0xb8f4c0 */ if (COND_NE) goto loc_00b8f4c0;
loc_00b8f4e0:
    /* 0x00b8f4e0: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00b8f4e4: add      x8, sp, #0x390 */ ARM64("add x8, sp, #0x390");
    /* 0x00b8f4e8: b        #0xb8f7e8 */ goto loc_00b8f7e8;
loc_00b8f4ec:
    /* 0x00b8f4ec: b.eq     #0xb8f50c */ if (COND_EQ) goto loc_00b8f50c;
    /* 0x00b8f4f0: cmp      w28, #6 */ ARM64("cmp w28, #6");
    /* 0x00b8f4f4: b.ne     #0xb8f518 */ if (COND_NE) goto loc_00b8f518;
    /* 0x00b8f4f8: mov      x28, #0 */ ARM64("mov x28, #0");
    /* 0x00b8f4fc: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b8f500: str      w8, [sp, #0x90] */ ARM64("str w8, [sp, #0x90]");
    /* 0x00b8f504: mov      w27, #5 */ ARM64("mov w27, #5");
    /* 0x00b8f508: b        #0xb8f528 */ goto loc_00b8f528;
loc_00b8f50c:
    /* 0x00b8f50c: str      wzr, [sp, #0x90] */ ARM64("str wzr, [sp, #0x90]");
    /* 0x00b8f510: mov      x27, x28 */ ARM64("mov x27, x28");
    /* 0x00b8f514: b        #0xb8f528 */ goto loc_00b8f528;
loc_00b8f518:
    /* 0x00b8f518: sub      x28, x28, #7 */ ARM64("sub x28, x28, #7");
    /* 0x00b8f51c: mov      w8, #1 */ ARM64("mov w8, #1");
    /* 0x00b8f520: str      w8, [sp, #0x90] */ ARM64("str w8, [sp, #0x90]");
    /* 0x00b8f524: mov      w27, #6 */ ARM64("mov w27, #6");
loc_00b8f528:
    /* 0x00b8f528: mov      w0, #0x3e0 */ ARM64("mov w0, #0x3e0");
    /* 0x00b8f52c: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8f530: cbz      x0, #0xb90c28 */ if (x0 == 0) goto loc_00b90c28;
    /* 0x00b8f534: mov      x25, x0 */ ARM64("mov x25, x0");
    /* 0x00b8f538: str      x23, [sp, #0xc0] */ ARM64("str x23, [sp, #0xc0]");
    /* 0x00b8f53c: str      xzr, [x0] */ ARM64("str xzr, [x0]");
    /* 0x00b8f540: strh     wzr, [x0, #0x37a] */ ARM64("strh wzr, [x0, #0x37a]");
    /* 0x00b8f544: ldrh     w8, [x24, #0x37a] */ ARM64("ldrh w8, [x24, #0x37a]");
    /* 0x00b8f548: mvn      x9, x27 */ ARM64("mvn x9, x27");
    /* 0x00b8f54c: add      x22, x8, x9 */ ARM64("add x22, x8, x9");
    /* 0x00b8f550: strh     w22, [x0, #0x37a] */ ARM64("strh w22, [x0, #0x37a]");
    /* 0x00b8f554: add      x8, x24, #8 */ ARM64("add x8, x24, #8");
    /* 0x00b8f558: ldr      x20, [x8, x27, lsl #3] */ ARM64("ldr x20, [x8, x27, lsl #3]");
    /* 0x00b8f55c: add      x26, x24, #0x60 */ ARM64("add x26, x24, #0x60");
    /* 0x00b8f560: mov      w19, #0x48 */ ARM64("mov w19, #0x48");
    /* 0x00b8f564: umaddl   x9, w27, w19, x26 */ ARM64("umaddl x9, w27, w19, x26");
    /* 0x00b8f568: ldr      q0, [x9, #0x10] */ ARM64("ldr q0, [x9, #0x10]");
    /* 0x00b8f56c: str      q0, [sp, #0x330] */ ARM64("str q0, [sp, #0x330]");
    /* 0x00b8f570: ldr      q0, [x9, #0x20] */ ARM64("ldr q0, [x9, #0x20]");
    /* 0x00b8f574: str      q0, [sp, #0x340] */ ARM64("str q0, [sp, #0x340]");
    /* 0x00b8f578: ldr      q0, [x9, #0x30] */ ARM64("ldr q0, [x9, #0x30]");
    /* 0x00b8f57c: str      q0, [sp, #0x350] */ ARM64("str q0, [sp, #0x350]");
    /* 0x00b8f580: ldr      x10, [x9, #0x40] */ ARM64("ldr x10, [x9, #0x40]");
    /* 0x00b8f584: str      x10, [sp, #0x360] */ ARM64("str x10, [sp, #0x360]");
    /* 0x00b8f588: ldr      q0, [x9] */ ARM64("ldr q0, [x9]");
    /* 0x00b8f58c: str      q0, [sp, #0x320] */ ARM64("str q0, [sp, #0x320]");
    /* 0x00b8f590: cmp      x22, #0xc */ ARM64("cmp x22, #0xc");
    /* 0x00b8f594: b.hs     #0xb90bc8 */ if (COND_HS) goto loc_00b90bc8;
    /* 0x00b8f598: add      x9, x27, #1 */ ARM64("add x9, x27, #1");
    /* 0x00b8f59c: add      x1, x8, x9, lsl #3 */ ARM64("add x1, x8, x9, lsl #3");
    /* 0x00b8f5a0: lsl      x23, x22, #3 */ ARM64("lsl x23, x22, #3");
    /* 0x00b8f5a4: add      x0, x25, #8 */ ARM64("add x0, x25, #8");
    /* 0x00b8f5a8: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f5ac: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8f5b0: add      x8, x27, #1 */ ARM64("add x8, x27, #1");
    /* 0x00b8f5b4: umaddl   x1, w8, w19, x26 */ ARM64("umaddl x1, w8, w19, x26");
    /* 0x00b8f5b8: add      x8, x23, x22 */ ARM64("add x8, x23, x22");
    /* 0x00b8f5bc: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b8f5c0: add      x0, x25, #0x60 */ ARM64("add x0, x25, #0x60");
    /* 0x00b8f5c4: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8f5c8: ldp      q1, q0, [sp, #0x320] */ ARM64("ldp q1, q0, [sp, #0x320]");
    /* 0x00b8f5cc: add      x9, sp, #0x210 */ ARM64("add x9, sp, #0x210");
    /* 0x00b8f5d0: stur     q0, [x9, #0x18] */ ARM64("stur q0, [x9, #0x18]");
    /* 0x00b8f5d4: ldp      q0, q2, [sp, #0x340] */ ARM64("ldp q0, q2, [sp, #0x340]");
    /* 0x00b8f5d8: stur     q0, [x9, #0x28] */ ARM64("stur q0, [x9, #0x28]");
    /* 0x00b8f5dc: stur     q2, [x9, #0x38] */ ARM64("stur q2, [x9, #0x38]");
    /* 0x00b8f5e0: strh     w27, [x24, #0x37a] */ ARM64("strh w27, [x24, #0x37a]");
    /* 0x00b8f5e4: ldr      x8, [sp, #0x360] */ ARM64("ldr x8, [sp, #0x360]");
    /* 0x00b8f5e8: stur     x8, [x9, #0x48] */ ARM64("stur x8, [x9, #0x48]");
    /* 0x00b8f5ec: stur     q1, [x9, #8] */ ARM64("stur q1, [x9, #8]");
    /* 0x00b8f5f0: ldrh     w22, [x25, #0x37a] */ ARM64("ldrh w22, [x25, #0x37a]");
    /* 0x00b8f5f4: add      x1, x22, #1 */ ARM64("add x1, x22, #1");
    /* 0x00b8f5f8: str      x20, [sp, #0xb0] */ ARM64("str x20, [sp, #0xb0]");
    /* 0x00b8f5fc: str      x20, [sp, #0x210] */ ARM64("str x20, [sp, #0x210]");
    /* 0x00b8f600: cmp      x22, #0xc */ ARM64("cmp x22, #0xc");
    /* 0x00b8f604: b.hs     #0xb90be4 */ if (COND_HS) goto loc_00b90be4;
    /* 0x00b8f608: ldr      x8, [sp, #0xb8] */ ARM64("ldr x8, [sp, #0xb8]");
    /* 0x00b8f60c: sub      x8, x8, x27 */ ARM64("sub x8, x8, x27");
    /* 0x00b8f610: cmp      x8, x1 */ ARM64("cmp x8, x1");
    /* 0x00b8f614: b.ne     #0xb90c38 */ if (COND_NE) goto loc_00b90c38;
    /* 0x00b8f618: ldr      x8, [sp, #0x118] */ ARM64("ldr x8, [sp, #0x118]");
    /* 0x00b8f61c: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8f620: str      x8, [sp, #0x118] */ ARM64("str x8, [sp, #0x118]");
    /* 0x00b8f624: add      x19, x25, #0x380 */ ARM64("add x19, x25, #0x380");
    /* 0x00b8f628: lsl      x2, x1, #3 */ ARM64("lsl x2, x1, #3");
    /* 0x00b8f62c: add      x8, x24, x27, lsl #3 */ ARM64("add x8, x24, x27, lsl #3");
    /* 0x00b8f630: add      x0, x25, #0x380 */ ARM64("add x0, x25, #0x380");
    /* 0x00b8f634: add      x1, x8, #0x388 */ ARM64("add x1, x8, #0x388");
    /* 0x00b8f638: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8f63c: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b8f640:
    /* 0x00b8f640: ldr      x9, [x19, x8, lsl #3] */ ARM64("ldr x9, [x19, x8, lsl #3]");
    /* 0x00b8f644: str      x25, [x9] */ ARM64("str x25, [x9]");
    /* 0x00b8f648: strh     w8, [x9, #0x378] */ ARM64("strh w8, [x9, #0x378]");
    /* 0x00b8f64c: cmp      x8, x22 */ ARM64("cmp x8, x22");
    /* 0x00b8f650: cinc     x9, x8, lo */ ARM64("cinc x9, x8, lo");
    /* 0x00b8f654: b.hs     #0xb8f664 */ if (COND_HS) goto loc_00b8f664;
    /* 0x00b8f658: mov      x8, x9 */ ARM64("mov x8, x9");
    /* 0x00b8f65c: cmp      x9, x22 */ ARM64("cmp x9, x22");
    /* 0x00b8f660: b.ls     #0xb8f640 */ if (COND_LS) goto loc_00b8f640;
loc_00b8f664:
    /* 0x00b8f664: ldr      x13, [sp, #0x218] */ ARM64("ldr x13, [sp, #0x218]");
    /* 0x00b8f668: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b8f66c: ldp      q0, q1, [x8, #0x10] */ ARM64("ldp q0, q1, [x8, #0x10]");
    /* 0x00b8f670: stp      q0, q1, [sp, #0x320] */ ARM64("stp q0, q1, [sp, #0x320]");
    /* 0x00b8f674: ldp      q0, q1, [x8, #0x30] */ ARM64("ldp q0, q1, [x8, #0x30]");
    /* 0x00b8f678: stp      q0, q1, [sp, #0x340] */ ARM64("stp q0, q1, [sp, #0x340]");
    /* 0x00b8f67c: ldr      w8, [sp, #0x90] */ ARM64("ldr w8, [sp, #0x90]");
    /* 0x00b8f680: cmp      w8, #0 */ ARM64("cmp w8, #0");
    /* 0x00b8f684: csel     x20, x25, x24, ne */ ARM64("csel x20, x25, x24, ne");
    /* 0x00b8f688: ldrh     w19, [x20, #0x37a] */ ARM64("ldrh w19, [x20, #0x37a]");
    /* 0x00b8f68c: add      x8, x20, #8 */ ARM64("add x8, x20, #8");
    /* 0x00b8f690: add      x14, x28, #1 */ ARM64("add x14, x28, #1");
    /* 0x00b8f694: add      x22, x8, x28, lsl #3 */ ARM64("add x22, x8, x28, lsl #3");
    /* 0x00b8f698: subs     x26, x19, x28 */ ARM64("subs x26, x19, x28");
    /* 0x00b8f69c: b.ls     #0xb8f738 */ if (COND_LS) goto loc_00b8f738;
    /* 0x00b8f6a0: lsl      x9, x14, #3 */ ARM64("lsl x9, x14, #3");
    /* 0x00b8f6a4: str      x9, [sp, #0x90] */ ARM64("str x9, [sp, #0x90]");
    /* 0x00b8f6a8: lsl      x23, x26, #3 */ ARM64("lsl x23, x26, #3");
    /* 0x00b8f6ac: add      x0, x8, x9 */ ARM64("add x0, x8, x9");
    /* 0x00b8f6b0: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8f6b4: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f6b8: str      x13, [sp, #0xb8] */ ARM64("str x13, [sp, #0xb8]");
    /* 0x00b8f6bc: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f6c0: add      x8, x20, #0x60 */ ARM64("add x8, x20, #0x60");
    /* 0x00b8f6c4: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00b8f6c8: smaddl   x27, w28, w9, x8 */ ARM64("smaddl x27, w28, w9, x8");
    /* 0x00b8f6cc: add      x10, x28, #1 */ ARM64("add x10, x28, #1");
    /* 0x00b8f6d0: smaddl   x0, w10, w9, x8 */ ARM64("smaddl x0, w10, w9, x8");
    /* 0x00b8f6d4: add      x8, x23, x26 */ ARM64("add x8, x23, x26");
    /* 0x00b8f6d8: mov      w26, #0x48 */ ARM64("mov w26, #0x48");
    /* 0x00b8f6dc: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b8f6e0: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b8f6e4: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f6e8: ldur     q0, [x29, #-0xe0] */ ARM64("ldur q0, [x29, #-0xe0]");
    /* 0x00b8f6ec: str      q0, [x27, #0x10] */ ARM64("str q0, [x27, #0x10]");
    /* 0x00b8f6f0: ldur     q0, [x29, #-0xd0] */ ARM64("ldur q0, [x29, #-0xd0]");
    /* 0x00b8f6f4: str      q0, [x27, #0x20] */ ARM64("str q0, [x27, #0x20]");
    /* 0x00b8f6f8: ldur     q0, [x29, #-0xc0] */ ARM64("ldur q0, [x29, #-0xc0]");
    /* 0x00b8f6fc: str      q0, [x27, #0x30] */ ARM64("str q0, [x27, #0x30]");
    /* 0x00b8f700: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00b8f704: str      x8, [x27, #0x40] */ ARM64("str x8, [x27, #0x40]");
    /* 0x00b8f708: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00b8f70c: str      q0, [x27] */ ARM64("str q0, [x27]");
    /* 0x00b8f710: add      x8, x20, #0x380 */ ARM64("add x8, x20, #0x380");
    /* 0x00b8f714: add      x9, x8, x28, lsl #3 */ ARM64("add x9, x8, x28, lsl #3");
    /* 0x00b8f718: add      x0, x9, #0x10 */ ARM64("add x0, x9, #0x10");
    /* 0x00b8f71c: ldr      x9, [sp, #0x90] */ ARM64("ldr x9, [sp, #0x90]");
    /* 0x00b8f720: add      x1, x8, x9 */ ARM64("add x1, x8, x9");
    /* 0x00b8f724: mov      x2, x23 */ ARM64("mov x2, x23");
    /* 0x00b8f728: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b8f72c: add      x14, x28, #1 */ ARM64("add x14, x28, #1");
    /* 0x00b8f730: ldr      x13, [sp, #0xb8] */ ARM64("ldr x13, [sp, #0xb8]");
    /* 0x00b8f734: b        #0xb8f768 */ goto loc_00b8f768;
loc_00b8f738:
    /* 0x00b8f738: mov      w26, #0x48 */ ARM64("mov w26, #0x48");
    /* 0x00b8f73c: smaddl   x8, w28, w26, x20 */ ARM64("smaddl x8, w28, w26, x20");
    /* 0x00b8f740: ldur     q0, [x29, #-0xe0] */ ARM64("ldur q0, [x29, #-0xe0]");
    /* 0x00b8f744: str      q0, [x8, #0x70] */ ARM64("str q0, [x8, #0x70]");
    /* 0x00b8f748: ldur     q0, [x29, #-0xd0] */ ARM64("ldur q0, [x29, #-0xd0]");
    /* 0x00b8f74c: str      q0, [x8, #0x80] */ ARM64("str q0, [x8, #0x80]");
    /* 0x00b8f750: ldur     q0, [x29, #-0xc0] */ ARM64("ldur q0, [x29, #-0xc0]");
    /* 0x00b8f754: str      q0, [x8, #0x90] */ ARM64("str q0, [x8, #0x90]");
    /* 0x00b8f758: ldur     x9, [x29, #-0xb0] */ ARM64("ldur x9, [x29, #-0xb0]");
    /* 0x00b8f75c: str      x9, [x8, #0xa0] */ ARM64("str x9, [x8, #0xa0]");
    /* 0x00b8f760: ldur     q0, [x29, #-0xf0] */ ARM64("ldur q0, [x29, #-0xf0]");
    /* 0x00b8f764: str      q0, [x8, #0x60] */ ARM64("str q0, [x8, #0x60]");
loc_00b8f768:
    /* 0x00b8f768: ldr      x11, [sp, #0xc0] */ ARM64("ldr x11, [sp, #0xc0]");
    /* 0x00b8f76c: ldr      x9, [sp, #0x108] */ ARM64("ldr x9, [sp, #0x108]");
    /* 0x00b8f770: ldr      x12, [sp, #0x118] */ ARM64("ldr x12, [sp, #0x118]");
    /* 0x00b8f774: ldr      x27, [sp, #0xb0] */ ARM64("ldr x27, [sp, #0xb0]");
    /* 0x00b8f778: add      w8, w19, #1 */ ARM64("add w8, w19, #1");
    /* 0x00b8f77c: str      x9, [x22] */ ARM64("str x9, [x22]");
    /* 0x00b8f780: add      x9, x20, x14, lsl #3 */ ARM64("add x9, x20, x14, lsl #3");
    /* 0x00b8f784: add      x10, x19, #2 */ ARM64("add x10, x19, #2");
    /* 0x00b8f788: str      x11, [x9, #0x380] */ ARM64("str x11, [x9, #0x380]");
    /* 0x00b8f78c: strh     w8, [x20, #0x37a] */ ARM64("strh w8, [x20, #0x37a]");
    /* 0x00b8f790: cmp      x14, x10 */ ARM64("cmp x14, x10");
    /* 0x00b8f794: b.hs     #0xb8f7c0 */ if (COND_HS) goto loc_00b8f7c0;
    /* 0x00b8f798: add      x8, x28, #0x71 */ ARM64("add x8, x28, #0x71");
    /* 0x00b8f79c: neg      x9, x19 */ ARM64("neg x9, x19");
loc_00b8f7a0:
    /* 0x00b8f7a0: ldr      x10, [x20, x8, lsl #3] */ ARM64("ldr x10, [x20, x8, lsl #3]");
    /* 0x00b8f7a4: sub      w11, w8, #0x70 */ ARM64("sub w11, w8, #0x70");
    /* 0x00b8f7a8: str      x20, [x10] */ ARM64("str x20, [x10]");
    /* 0x00b8f7ac: strh     w11, [x10, #0x378] */ ARM64("strh w11, [x10, #0x378]");
    /* 0x00b8f7b0: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8f7b4: add      x10, x9, x8 */ ARM64("add x10, x9, x8");
    /* 0x00b8f7b8: cmp      x10, #0x72 */ ARM64("cmp x10, #0x72");
    /* 0x00b8f7bc: b.ne     #0xb8f7a0 */ if (COND_NE) goto loc_00b8f7a0;
loc_00b8f7c0:
    /* 0x00b8f7c0: str      x13, [sp, #0x390] */ ARM64("str x13, [sp, #0x390]");
    /* 0x00b8f7c4: ldp      q0, q1, [sp, #0x320] */ ARM64("ldp q0, q1, [sp, #0x320]");
    /* 0x00b8f7c8: str      q0, [sp, #0x430] */ ARM64("str q0, [sp, #0x430]");
    /* 0x00b8f7cc: str      q1, [sp, #0x440] */ ARM64("str q1, [sp, #0x440]");
    /* 0x00b8f7d0: ldp      q0, q1, [sp, #0x340] */ ARM64("ldp q0, q1, [sp, #0x340]");
    /* 0x00b8f7d4: str      q0, [sp, #0x450] */ ARM64("str q0, [sp, #0x450]");
    /* 0x00b8f7d8: str      q1, [sp, #0x460] */ ARM64("str q1, [sp, #0x460]");
    /* 0x00b8f7dc: add      x8, sp, #0x1d0 */ ARM64("add x8, sp, #0x1d0");
    /* 0x00b8f7e0: mov      x20, x24 */ ARM64("mov x20, x24");
    /* 0x00b8f7e4: mov      x9, x12 */ ARM64("mov x9, x12");
loc_00b8f7e8:
    /* 0x00b8f7e8: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00b8f7ec: str      x9, [x8] */ ARM64("str x9, [x8]");
    /* 0x00b8f7f0: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00b8f7f4: cmp      x8, x28 */ ARM64("cmp x8, x28");
    /* 0x00b8f7f8: b.eq     #0xb8f914 */ if (COND_EQ) goto loc_00b8f914;
    /* 0x00b8f7fc: ldr      q0, [sp, #0x430] */ ARM64("ldr q0, [sp, #0x430]");
    /* 0x00b8f800: ldr      q1, [sp, #0x440] */ ARM64("ldr q1, [sp, #0x440]");
    /* 0x00b8f804: stp      q0, q1, [sp, #0x3f0] */ ARM64("stp q0, q1, [sp, #0x3f0]");
    /* 0x00b8f808: ldr      q0, [sp, #0x450] */ ARM64("ldr q0, [sp, #0x450]");
    /* 0x00b8f80c: ldr      q1, [sp, #0x460] */ ARM64("ldr q1, [sp, #0x460]");
    /* 0x00b8f810: str      q0, [sp, #0x410] */ ARM64("str q0, [sp, #0x410]");
    /* 0x00b8f814: str      q1, [sp, #0x420] */ ARM64("str q1, [sp, #0x420]");
    /* 0x00b8f818: ldr      x19, [sp, #0x1d0] */ ARM64("ldr x19, [sp, #0x1d0]");
    /* 0x00b8f81c: ldr      x24, [x20] */ ARM64("ldr x24, [x20]");
    /* 0x00b8f820: mov      x10, x27 */ ARM64("mov x10, x27");
    /* 0x00b8f824: mov      x23, x25 */ ARM64("mov x23, x25");
    /* 0x00b8f828: cbnz     x24, #0xb8f344 */ if (x24 != 0) goto loc_00b8f344;
    /* 0x00b8f82c: b        #0xb8f83c */ goto loc_00b8f83c;
loc_00b8f830:
    /* 0x00b8f830: mov      x25, x23 */ ARM64("mov x25, x23");
    /* 0x00b8f834: mov      x27, x10 */ ARM64("mov x27, x10");
    /* 0x00b8f838: ldr      x12, [sp, #0x40] */ ARM64("ldr x12, [sp, #0x40]");
loc_00b8f83c:
    /* 0x00b8f83c: ldp      q0, q1, [sp, #0x3f0] */ ARM64("ldp q0, q1, [sp, #0x3f0]");
    /* 0x00b8f840: add      x9, sp, #0x210 */ ARM64("add x9, sp, #0x210");
    /* 0x00b8f844: stp      q0, q1, [x9, #0x10] */ ARM64("stp q0, q1, [x9, #0x10]");
    /* 0x00b8f848: ldr      q0, [sp, #0x410] */ ARM64("ldr q0, [sp, #0x410]");
    /* 0x00b8f84c: ldr      q1, [sp, #0x420] */ ARM64("ldr q1, [sp, #0x420]");
    /* 0x00b8f850: stp      q0, q1, [x9, #0x30] */ ARM64("stp q0, q1, [x9, #0x30]");
    /* 0x00b8f854: add      x24, sp, #0x210 */ ARM64("add x24, sp, #0x210");
    /* 0x00b8f858: str      x27, [sp, #0x210] */ ARM64("str x27, [sp, #0x210]");
    /* 0x00b8f85c: str      x8, [sp, #0x218] */ ARM64("str x8, [sp, #0x218]");
    /* 0x00b8f860: str      x20, [sp, #0x260] */ ARM64("str x20, [sp, #0x260]");
    /* 0x00b8f864: str      x12, [sp, #0x268] */ ARM64("str x12, [sp, #0x268]");
    /* 0x00b8f868: str      x25, [sp, #0x270] */ ARM64("str x25, [sp, #0x270]");
    /* 0x00b8f86c: str      x19, [sp, #0x278] */ ARM64("str x19, [sp, #0x278]");
    /* 0x00b8f870: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b8f874: ldur     x20, [x8, #-0x18] */ ARM64("ldur x20, [x8, #-0x18]");
    /* 0x00b8f878: cbz      x20, #0xb90cf4 */ if (x20 == 0) goto loc_00b90cf4;
    /* 0x00b8f87c: ldur     x23, [x8, #-0x10] */ ARM64("ldur x23, [x8, #-0x10]");
    /* 0x00b8f880: mov      w0, #0x3e0 */ ARM64("mov w0, #0x3e0");
    /* 0x00b8f884: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b8f888: cbz      x0, #0xb90d04 */ if (x0 == 0) goto loc_00b90d04;
    /* 0x00b8f88c: mov      x22, x0 */ ARM64("mov x22, x0");
    /* 0x00b8f890: str      xzr, [x0] */ ARM64("str xzr, [x0]");
    /* 0x00b8f894: strh     wzr, [x0, #0x37a] */ ARM64("strh wzr, [x0, #0x37a]");
    /* 0x00b8f898: str      x20, [x0, #0x380] */ ARM64("str x20, [x0, #0x380]");
    /* 0x00b8f89c: adds     x8, x23, #1 */ ARM64("adds x8, x23, #1");
    /* 0x00b8f8a0: b.hs     #0xb90d14 */ if (COND_HS) goto loc_00b90d14;
    /* 0x00b8f8a4: str      x22, [x20] */ ARM64("str x22, [x20]");
    /* 0x00b8f8a8: strh     wzr, [x20, #0x378] */ ARM64("strh wzr, [x20, #0x378]");
    /* 0x00b8f8ac: ldr      x9, [sp, #0x88] */ ARM64("ldr x9, [sp, #0x88]");
    /* 0x00b8f8b0: stp      x22, x8, [x9, #-0x18] */ ARM64("stp x22, x8, [x9, #-0x18]");
    /* 0x00b8f8b4: cmp      x19, x23 */ ARM64("cmp x19, x23");
    /* 0x00b8f8b8: b.ne     #0xb90d40 */ if (COND_NE) goto loc_00b90d40;
    /* 0x00b8f8bc: ldrh     w8, [x22, #0x37a] */ ARM64("ldrh w8, [x22, #0x37a]");
    /* 0x00b8f8c0: cmp      w8, #0xb */ ARM64("cmp w8, #0xb");
    /* 0x00b8f8c4: b.hs     #0xb90d24 */ if (COND_HS) goto loc_00b90d24;
    /* 0x00b8f8c8: add      w9, w8, #1 */ ARM64("add w9, w8, #1");
    /* 0x00b8f8cc: strh     w9, [x22, #0x37a] */ ARM64("strh w9, [x22, #0x37a]");
    /* 0x00b8f8d0: add      x9, x22, x8, lsl #3 */ ARM64("add x9, x22, x8, lsl #3");
    /* 0x00b8f8d4: str      x27, [x9, #8] */ ARM64("str x27, [x9, #8]");
    /* 0x00b8f8d8: add      x9, x22, #0x380 */ ARM64("add x9, x22, #0x380");
    /* 0x00b8f8dc: umaddl   x10, w8, w26, x22 */ ARM64("umaddl x10, w8, w26, x22");
    /* 0x00b8f8e0: add      x12, sp, #0x210 */ ARM64("add x12, sp, #0x210");
    /* 0x00b8f8e4: ldur     q0, [x12, #0x28] */ ARM64("ldur q0, [x12, #0x28]");
    /* 0x00b8f8e8: ldur     q1, [x12, #0x38] */ ARM64("ldur q1, [x12, #0x38]");
    /* 0x00b8f8ec: stp      q0, q1, [x10, #0x80] */ ARM64("stp q0, q1, [x10, #0x80]");
    /* 0x00b8f8f0: ldur     x11, [x12, #0x48] */ ARM64("ldur x11, [x12, #0x48]");
    /* 0x00b8f8f4: str      x11, [x10, #0xa0] */ ARM64("str x11, [x10, #0xa0]");
    /* 0x00b8f8f8: ldur     q0, [x12, #8] */ ARM64("ldur q0, [x12, #8]");
    /* 0x00b8f8fc: ldur     q1, [x12, #0x18] */ ARM64("ldur q1, [x12, #0x18]");
    /* 0x00b8f900: stp      q0, q1, [x10, #0x60] */ ARM64("stp q0, q1, [x10, #0x60]");
    /* 0x00b8f904: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8f908: str      x25, [x9, x8, lsl #3] */ ARM64("str x25, [x9, x8, lsl #3]");
    /* 0x00b8f90c: str      x22, [x25] */ ARM64("str x22, [x25]");
    /* 0x00b8f910: strh     w8, [x25, #0x378] */ ARM64("strh w8, [x25, #0x378]");
loc_00b8f914:
    /* 0x00b8f914: ldr      x23, [sp, #0x88] */ ARM64("ldr x23, [sp, #0x88]");
    /* 0x00b8f918: ldp      x0, x25, [sp, #0x48] */ ARM64("ldp x0, x25, [sp, #0x48]");
loc_00b8f91c:
    /* 0x00b8f91c: ldur     x8, [x23, #-8] */ ARM64("ldur x8, [x23, #-8]");
    /* 0x00b8f920: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8f924: stur     x8, [x23, #-8] */ ARM64("stur x8, [x23, #-8]");
    /* 0x00b8f928: mov      x20, x0 */ ARM64("mov x20, x0");
loc_00b8f92c:
    /* 0x00b8f92c: madd     x27, x25, x26, x20 */ ARM64("madd x27, x25, x26, x20");
    /* 0x00b8f930: ldp      x0, x1, [x27, #0x98] */ ARM64("ldp x0, x1, [x27, #0x98]");
    /* 0x00b8f934: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00b8f938: bl       #0xb8bd94 */ CALL_DIRECT(sub_00b8bd94);
    /* 0x00b8f93c: mov      x24, x0 */ ARM64("mov x24, x0");
    /* 0x00b8f940: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b8f944: ldr      x23, [x27, #0x78]! */ ARM64("ldr x23, [x27, #0x78]!");
    /* 0x00b8f948: sub      x25, x27, #0x18 */ ARM64("sub x25, x27, #0x18");
    /* 0x00b8f94c: ldp      x8, x1, [x27, #-0x10] */ ARM64("ldp x8, x1, [x27, #-0x10]");
    /* 0x00b8f950: ldr      x26, [x27, #8] */ ARM64("ldr x26, [x27, #8]");
    /* 0x00b8f954: lsr      x19, x0, #0x39 */ ARM64("lsr x19, x0, #0x39");
    /* 0x00b8f958: mov      x10, #0x101010101010101 */ ARM64("mov x10, #0x101010101010101");
    /* 0x00b8f95c: mul      x10, x19, x10 */ ARM64("mul x10, x19, x10");
    /* 0x00b8f960: mov      x11, x0 */ ARM64("mov x11, x0");
loc_00b8f964:
    /* 0x00b8f964: and      x11, x11, x26 */ ARM64("and x11, x11, x26");
    /* 0x00b8f968: ldr      x12, [x23, x11] */ ARM64("ldr x12, [x23, x11]");
    /* 0x00b8f96c: eor      x13, x12, x10 */ ARM64("eor x13, x12, x10");
    /* 0x00b8f970: mov      x14, #-0x101010101010102 */ ARM64("mov x14, #-0x101010101010102");
    /* 0x00b8f974: movk     x14, #0xfeff */ ARM64("movk x14, #0xfeff");
    /* 0x00b8f978: add      x14, x13, x14 */ ARM64("add x14, x13, x14");
    /* 0x00b8f97c: bic      x13, x14, x13 */ ARM64("bic x13, x14, x13");
    /* 0x00b8f980: ands     x13, x13, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x13, x13, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8f984: b.eq     #0xb8f9c4 */ if (COND_EQ) goto loc_00b8f9c4;
loc_00b8f988:
    /* 0x00b8f988: rbit     x14, x13 */ ARM64("rbit x14, x13");
    /* 0x00b8f98c: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00b8f990: add      x14, x11, x14, lsr #3 */ ARM64("add x14, x11, x14, lsr #3");
    /* 0x00b8f994: and      x14, x14, x26 */ ARM64("and x14, x14, x26");
    /* 0x00b8f998: sub      x14, x23, x14, lsl #3 */ ARM64("sub x14, x23, x14, lsl #3");
    /* 0x00b8f99c: ldur     x0, [x14, #-8] */ ARM64("ldur x0, [x14, #-8]");
    /* 0x00b8f9a0: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00b8f9a4: b.hs     #0xb90e88 */ if (COND_HS) goto loc_00b90e88;
    /* 0x00b8f9a8: lsl      x14, x0, #4 */ ARM64("lsl x14, x0, #4");
    /* 0x00b8f9ac: ldr      x14, [x8, x14] */ ARM64("ldr x14, [x8, x14]");
    /* 0x00b8f9b0: cmp      x21, x14 */ ARM64("cmp x21, x14");
    /* 0x00b8f9b4: b.eq     #0xb8f9dc */ if (COND_EQ) goto loc_00b8f9dc;
    /* 0x00b8f9b8: sub      x14, x13, #1 */ ARM64("sub x14, x13, #1");
    /* 0x00b8f9bc: ands     x13, x14, x13 */ ARM64("ands x13, x14, x13");
    /* 0x00b8f9c0: b.ne     #0xb8f988 */ if (COND_NE) goto loc_00b8f988;
loc_00b8f9c4:
    /* 0x00b8f9c4: and      x12, x12, x12, lsl #1 */ ARM64("and x12, x12, x12, lsl #1");
    /* 0x00b8f9c8: tst      x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8f9cc: b.ne     #0xb8fa14 */ if (COND_NE) goto loc_00b8fa14;
    /* 0x00b8f9d0: add      x9, x9, #8 */ ARM64("add x9, x9, #8");
    /* 0x00b8f9d4: add      x11, x11, x9 */ ARM64("add x11, x11, x9");
    /* 0x00b8f9d8: b        #0xb8f964 */ goto loc_00b8f964;
loc_00b8f9dc:
    /* 0x00b8f9dc: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b8f9e0: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b8f9e4: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b8f9e8: cbnz     w9, #0xb8f9dc */ if (w9 != 0) goto loc_00b8f9dc;
    /* 0x00b8f9ec: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8f9f0: ldr      x22, [sp, #0x98] */ ARM64("ldr x22, [sp, #0x98]");
    /* 0x00b8f9f4: mov      x24, #0xa95 */ ARM64("mov x24, #0xa95");
    /* 0x00b8f9f8: movk     x24, #0x2722, lsl #16 */ ARM64("movk x24, #0x2722, lsl #16");
    /* 0x00b8f9fc: movk     x24, #0xc1b7, lsl #32 */ ARM64("movk x24, #0xc1b7, lsl #32");
    /* 0x00b8fa00: movk     x24, #0x517c, lsl #48 */ ARM64("movk x24, #0x517c, lsl #48");
    /* 0x00b8fa04: mov      w26, #0x18 */ ARM64("mov w26, #0x18");
    /* 0x00b8fa08: ldr      x23, [sp, #0xc8] */ ARM64("ldr x23, [sp, #0xc8]");
    /* 0x00b8fa0c: b.ne     #0xb8e61c */ if (COND_NE) goto loc_00b8e61c;
    /* 0x00b8fa10: b        #0xb8e610 */ goto loc_00b8e610;
loc_00b8fa14:
    /* 0x00b8fa14: and      x9, x26, x24 */ ARM64("and x9, x26, x24");
    /* 0x00b8fa18: ldr      x10, [x23, x9] */ ARM64("ldr x10, [x23, x9]");
    /* 0x00b8fa1c: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8fa20: b.ne     #0xb8fa40 */ if (COND_NE) goto loc_00b8fa40;
    /* 0x00b8fa24: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00b8fa28:
    /* 0x00b8fa28: add      x9, x9, x11 */ ARM64("add x9, x9, x11");
    /* 0x00b8fa2c: and      x9, x9, x26 */ ARM64("and x9, x9, x26");
    /* 0x00b8fa30: ldr      x10, [x23, x9] */ ARM64("ldr x10, [x23, x9]");
    /* 0x00b8fa34: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00b8fa38: ands     x10, x10, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x10, x10, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b8fa3c: b.eq     #0xb8fa28 */ if (COND_EQ) goto loc_00b8fa28;
loc_00b8fa40:
    /* 0x00b8fa40: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b8fa44: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b8fa48: add      x9, x9, x10, lsr #3 */ ARM64("add x9, x9, x10, lsr #3");
    /* 0x00b8fa4c: and      x0, x9, x26 */ ARM64("and x0, x9, x26");
    /* 0x00b8fa50: ldrsb    w20, [x23, x0] */ ARM64("ldrsb w20, [x23, x0]");
    /* 0x00b8fa54: tbz      w20, #0x1f, #0xb8fc98 */ if (((w20 >> #0x1f) & 1) == 0) goto loc_00b8fc98;
    /* 0x00b8fa58: ldr      x9, [x25, #0x28] */ ARM64("ldr x9, [x25, #0x28]");
    /* 0x00b8fa5c: cbnz     x9, #0xb8fa64 */ if (x9 != 0) goto loc_00b8fa64;
loc_00b8fa60:
    /* 0x00b8fa60: tbnz     w20, #0, #0xb8fcbc */ if (((w20 >> #0) & 1) != 0) goto loc_00b8fcbc;
loc_00b8fa64:
    /* 0x00b8fa64: and      x8, x20, #1 */ ARM64("and x8, x20, #1");
    /* 0x00b8fa68: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b8fa6c: str      x8, [x25, #0x28] */ ARM64("str x8, [x25, #0x28]");
    /* 0x00b8fa70: sub      x8, x0, #8 */ ARM64("sub x8, x0, #8");
    /* 0x00b8fa74: and      x8, x8, x26 */ ARM64("and x8, x8, x26");
    /* 0x00b8fa78: strb     w19, [x23, x0] */ ARM64("strb w19, [x23, x0]");
    /* 0x00b8fa7c: ldr      x9, [x25, #0x18] */ ARM64("ldr x9, [x25, #0x18]");
    /* 0x00b8fa80: add      x8, x9, x8 */ ARM64("add x8, x9, x8");
    /* 0x00b8fa84: strb     w19, [x8, #8] */ ARM64("strb w19, [x8, #8]");
    /* 0x00b8fa88: ldr      x8, [x25, #0x30] */ ARM64("ldr x8, [x25, #0x30]");
    /* 0x00b8fa8c: add      x8, x8, #1 */ ARM64("add x8, x8, #1");
    /* 0x00b8fa90: str      x8, [x25, #0x30] */ ARM64("str x8, [x25, #0x30]");
    /* 0x00b8fa94: ldr      x8, [x25, #0x18] */ ARM64("ldr x8, [x25, #0x18]");
    /* 0x00b8fa98: sub      x8, x8, x0, lsl #3 */ ARM64("sub x8, x8, x0, lsl #3");
    /* 0x00b8fa9c: stur     x1, [x8, #-8] */ ARM64("stur x1, [x8, #-8]");
    /* 0x00b8faa0: ldr      x22, [x25] */ ARM64("ldr x22, [x25]");
    /* 0x00b8faa4: ldr      x19, [x25, #0x10] */ ARM64("ldr x19, [x25, #0x10]");
    /* 0x00b8faa8: cmp      x1, x22 */ ARM64("cmp x1, x22");
    /* 0x00b8faac: b.ne     #0xb8fadc */ if (COND_NE) goto loc_00b8fadc;
    /* 0x00b8fab0: ldp      x9, x8, [x25, #0x28] */ ARM64("ldp x9, x8, [x25, #0x28]");
    /* 0x00b8fab4: add      x22, x9, x8 */ ARM64("add x22, x9, x8");
    /* 0x00b8fab8: sub      x8, x22, x19 */ ARM64("sub x8, x22, x19");
    /* 0x00b8fabc: sub      x9, x1, x19 */ ARM64("sub x9, x1, x19");
    /* 0x00b8fac0: cmp      x8, x9 */ ARM64("cmp x8, x9");
    /* 0x00b8fac4: mov      w26, #0x18 */ ARM64("mov w26, #0x18");
    /* 0x00b8fac8: ldr      x23, [sp, #0xc8] */ ARM64("ldr x23, [sp, #0xc8]");
    /* 0x00b8facc: b.hi     #0xb8fc00 */ if (COND_HI) goto loc_00b8fc00;
    /* 0x00b8fad0: cmp      x19, x1 */ ARM64("cmp x19, x1");
    /* 0x00b8fad4: b.ne     #0xb8faf4 */ if (COND_NE) goto loc_00b8faf4;
    /* 0x00b8fad8: b        #0xb8faec */ goto loc_00b8faec;
loc_00b8fadc:
    /* 0x00b8fadc: mov      w26, #0x18 */ ARM64("mov w26, #0x18");
    /* 0x00b8fae0: ldr      x23, [sp, #0xc8] */ ARM64("ldr x23, [sp, #0xc8]");
    /* 0x00b8fae4: cmp      x19, x22 */ ARM64("cmp x19, x22");
    /* 0x00b8fae8: b.ne     #0xb8faf4 */ if (COND_NE) goto loc_00b8faf4;
loc_00b8faec:
    /* 0x00b8faec: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b8faf0: bl       #0xc6c28c */ CALL_DIRECT(sub_00c6c28c);
loc_00b8faf4:
    /* 0x00b8faf4: ldr      x8, [x25, #8] */ ARM64("ldr x8, [x25, #8]");
    /* 0x00b8faf8: add      x8, x8, x19, lsl #4 */ ARM64("add x8, x8, x19, lsl #4");
    /* 0x00b8fafc: stp      x21, x24, [x8] */ ARM64("stp x21, x24, [x8]");
    /* 0x00b8fb00: add      x8, x19, #1 */ ARM64("add x8, x19, #1");
    /* 0x00b8fb04: str      x8, [x25, #0x10] */ ARM64("str x8, [x25, #0x10]");
    /* 0x00b8fb08: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8fb0c: ldr      x22, [sp, #0x98] */ ARM64("ldr x22, [sp, #0x98]");
    /* 0x00b8fb10: mov      x24, #0xa95 */ ARM64("mov x24, #0xa95");
    /* 0x00b8fb14: movk     x24, #0x2722, lsl #16 */ ARM64("movk x24, #0x2722, lsl #16");
    /* 0x00b8fb18: movk     x24, #0xc1b7, lsl #32 */ ARM64("movk x24, #0xc1b7, lsl #32");
    /* 0x00b8fb1c: movk     x24, #0x517c, lsl #48 */ ARM64("movk x24, #0x517c, lsl #48");
    /* 0x00b8fb20: b        #0xb8e61c */ goto loc_00b8e61c;
loc_00b8fb24:
    /* 0x00b8fb24: mov      w12, #-1 */ ARM64("mov w12, #-1");
loc_00b8fb28:
    /* 0x00b8fb28: mov      w14, #0 */ ARM64("mov w14, #0");
    /* 0x00b8fb2c: madd     x13, x25, x26, x20 */ ARM64("madd x13, x25, x26, x20");
    /* 0x00b8fb30: mov      w15, #-1 */ ARM64("mov w15, #-1");
loc_00b8fb34:
    /* 0x00b8fb34: cmp      x9, x12 */ ARM64("cmp x9, x12");
    /* 0x00b8fb38: b.ls     #0xb8fb4c */ if (COND_LS) goto loc_00b8fb4c;
    /* 0x00b8fb3c: add      x16, x8, x12, lsl #4 */ ARM64("add x16, x8, x12, lsl #4");
    /* 0x00b8fb40: ldr      w12, [x16] */ ARM64("ldr w12, [x16]");
    /* 0x00b8fb44: ldr      w16, [x16, #0xc] */ ARM64("ldr w16, [x16, #0xc]");
    /* 0x00b8fb48: b        #0xb8fb64 */ goto loc_00b8fb64;
loc_00b8fb4c:
    /* 0x00b8fb4c: cmp      x9, x15 */ ARM64("cmp x9, x15");
    /* 0x00b8fb50: b.ls     #0xb8fbb0 */ if (COND_LS) goto loc_00b8fbb0;
    /* 0x00b8fb54: add      x16, x8, x15, lsl #4 */ ARM64("add x16, x8, x15, lsl #4");
    /* 0x00b8fb58: ldp      w15, w16, [x16, #4] */ ARM64("ldp w15, w16, [x16, #4]");
    /* 0x00b8fb5c: cmn      w16, #1 */ ARM64("cmn w16, #1");
    /* 0x00b8fb60: b.eq     #0xb8fb4c */ if (COND_EQ) goto loc_00b8fb4c;
loc_00b8fb64:
    /* 0x00b8fb64: cbz      x25, #0xb8fb34 */ if (x25 == 0) goto loc_00b8fb34;
    /* 0x00b8fb68: umaddl   x17, w16, w26, x11 */ ARM64("umaddl x17, w16, w26, x11");
    /* 0x00b8fb6c: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b8fb70: b        #0xb8fb84 */ goto loc_00b8fb84;
loc_00b8fb74:
    /* 0x00b8fb74: ldr      x27, [x17, #8] */ ARM64("ldr x27, [x17, #8]");
    /* 0x00b8fb78: mov      w14, #1 */ ARM64("mov w14, #1");
loc_00b8fb7c:
    /* 0x00b8fb7c: cmp      x0, x13 */ ARM64("cmp x0, x13");
    /* 0x00b8fb80: b.eq     #0xb8fb34 */ if (COND_EQ) goto loc_00b8fb34;
loc_00b8fb84:
    /* 0x00b8fb84: ldp      x1, x2, [x0, #8] */ ARM64("ldp x1, x2, [x0, #8]");
    /* 0x00b8fb88: add      x0, x0, #0x18 */ ARM64("add x0, x0, #0x18");
    /* 0x00b8fb8c: lsl      x2, x2, #2 */ ARM64("lsl x2, x2, #2");
loc_00b8fb90:
    /* 0x00b8fb90: cbz      x2, #0xb8fb7c */ if (x2 == 0) goto loc_00b8fb7c;
    /* 0x00b8fb94: ldr      w3, [x1], #4 */ ARM64("ldr w3, [x1], #4");
    /* 0x00b8fb98: sub      x2, x2, #4 */ ARM64("sub x2, x2, #4");
    /* 0x00b8fb9c: cmp      x3, x16 */ ARM64("cmp x3, x16");
    /* 0x00b8fba0: b.ne     #0xb8fb90 */ if (COND_NE) goto loc_00b8fb90;
    /* 0x00b8fba4: cmp      x10, x16 */ ARM64("cmp x10, x16");
    /* 0x00b8fba8: b.hi     #0xb8fb74 */ if (COND_HI) goto loc_00b8fb74;
    /* 0x00b8fbac: b        #0xb90dec */ goto loc_00b90dec;
loc_00b8fbb0:
    /* 0x00b8fbb0: tbz      w14, #0, #0xb90df8 */ if (((w14 >> #0) & 1) == 0) goto loc_00b90df8;
loc_00b8fbb4:
    /* 0x00b8fbb4: str      x19, [sp, #0xa0] */ ARM64("str x19, [sp, #0xa0]");
    /* 0x00b8fbb8: ldr      x8, [sp, #0xc0] */ ARM64("ldr x8, [sp, #0xc0]");
    /* 0x00b8fbbc: cbz      x8, #0xb8fbc8 */ if (x8 == 0) goto loc_00b8fbc8;
    /* 0x00b8fbc0: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00b8fbc4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b8fbc8:
    /* 0x00b8fbc8: add      x19, x20, #8 */ ARM64("add x19, x20, #8");
    /* 0x00b8fbcc: b        #0xb8fbd8 */ goto loc_00b8fbd8;
loc_00b8fbd0:
    /* 0x00b8fbd0: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
    /* 0x00b8fbd4: sub      x25, x25, #1 */ ARM64("sub x25, x25, #1");
loc_00b8fbd8:
    /* 0x00b8fbd8: cbz      x25, #0xb8fbf0 */ if (x25 == 0) goto loc_00b8fbf0;
    /* 0x00b8fbdc: ldur     x8, [x19, #-8] */ ARM64("ldur x8, [x19, #-8]");
    /* 0x00b8fbe0: cbz      x8, #0xb8fbd0 */ if (x8 == 0) goto loc_00b8fbd0;
    /* 0x00b8fbe4: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x00b8fbe8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8fbec: b        #0xb8fbd0 */ goto loc_00b8fbd0;
loc_00b8fbf0:
    /* 0x00b8fbf0: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b8fbf4: ldr      w8, [sp, #0x88] */ ARM64("ldr w8, [sp, #0x88]");
    /* 0x00b8fbf8: tbz      w8, #0, #0xb8e764 */ if (((w8 >> #0) & 1) == 0) goto loc_00b8e764;
    /* 0x00b8fbfc: b        #0xb8e76c */ goto loc_00b8e76c;
loc_00b8fc00:
    /* 0x00b8fc00: cmp      x22, x19 */ ARM64("cmp x22, x19");
    /* 0x00b8fc04: b.lo     #0xb90ee8 */ if (COND_LO) goto loc_00b90ee8;
    /* 0x00b8fc08: ldr      x2, [x25, #8] */ ARM64("ldr x2, [x25, #8]");
    /* 0x00b8fc0c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b8fc10: mov      x3, x22 */ ARM64("mov x3, x22");
    /* 0x00b8fc14: mov      w4, #8 */ ARM64("mov w4, #8");
    /* 0x00b8fc18: mov      w5, #0x10 */ ARM64("mov w5, #0x10");
    /* 0x00b8fc1c: bl       #0xc6c158 */ CALL_DIRECT(sub_00c6c158);
    /* 0x00b8fc20: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b8fc24: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b8fc28: b.eq     #0xb90f18 */ if (COND_EQ) goto loc_00b90f18;
    /* 0x00b8fc2c: ldr      x8, [sp, #0x218] */ ARM64("ldr x8, [sp, #0x218]");
    /* 0x00b8fc30: stp      x22, x8, [x25] */ ARM64("stp x22, x8, [x25]");
    /* 0x00b8fc34: ldr      x19, [x25, #0x10] */ ARM64("ldr x19, [x25, #0x10]");
    /* 0x00b8fc38: cmp      x19, x22 */ ARM64("cmp x19, x22");
    /* 0x00b8fc3c: b.ne     #0xb8faf4 */ if (COND_NE) goto loc_00b8faf4;
    /* 0x00b8fc40: b        #0xb8faec */ goto loc_00b8faec;
loc_00b8fc44:
    /* 0x00b8fc44: mov      w11, #8 */ ARM64("mov w11, #8");
loc_00b8fc48:
    /* 0x00b8fc48: add      x10, x10, x11 */ ARM64("add x10, x10, x11");
    /* 0x00b8fc4c: and      x10, x10, x9 */ ARM64("and x10, x10, x9");
    /* 0x00b8fc50: ldr      d0, [x8, x10] */ ARM64("ldr d0, [x8, x10]");
    /* 0x00b8fc54: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b8fc58: fmov     x12, d0 */ ARM64("fmov x12, d0");
    /* 0x00b8fc5c: add      x11, x11, #8 */ ARM64("add x11, x11, #8");
    /* 0x00b8fc60: cbnz     x12, #0xb8ea38 */ if (x12 != 0) goto loc_00b8ea38;
    /* 0x00b8fc64: b        #0xb8fc48 */ goto loc_00b8fc48;
loc_00b8fc68:
    /* 0x00b8fc68: add      x0, x25, #0x98 */ ARM64("add x0, x25, #0x98");
    /* 0x00b8fc6c: add      x1, x25, #0xb8 */ ARM64("add x1, x25, #0xb8");
    /* 0x00b8fc70: bl       #0xc6c4fc */ CALL_DIRECT(sub_00c6c4fc);
    /* 0x00b8fc74: b        #0xb8ea20 */ goto loc_00b8ea20;
loc_00b8fc78:
    /* 0x00b8fc78: ldr      d0, [x8] */ ARM64("ldr d0, [x8]");
    /* 0x00b8fc7c: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b8fc80: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00b8fc84: rbit     x10, x10 */ ARM64("rbit x10, x10");
    /* 0x00b8fc88: clz      x10, x10 */ ARM64("clz x10, x10");
    /* 0x00b8fc8c: lsr      x11, x10, #3 */ ARM64("lsr x11, x10, #3");
    /* 0x00b8fc90: ldrb     w10, [x8, x11] */ ARM64("ldrb w10, [x8, x11]");
    /* 0x00b8fc94: b        #0xb8ea50 */ goto loc_00b8ea50;
loc_00b8fc98:
    /* 0x00b8fc98: ldr      x9, [x23] */ ARM64("ldr x9, [x23]");
    /* 0x00b8fc9c: and      x9, x9, #0x8080808080808080 */ ARM64("and x9, x9, #0x8080808080808080");
    /* 0x00b8fca0: rbit     x9, x9 */ ARM64("rbit x9, x9");
    /* 0x00b8fca4: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b8fca8: lsr      x0, x9, #3 */ ARM64("lsr x0, x9, #3");
    /* 0x00b8fcac: ldrb     w20, [x23, x0] */ ARM64("ldrb w20, [x23, x0]");
    /* 0x00b8fcb0: ldr      x9, [x25, #0x28] */ ARM64("ldr x9, [x25, #0x28]");
    /* 0x00b8fcb4: cbz      x9, #0xb8fa60 */ if (x9 == 0) goto loc_00b8fa60;
    /* 0x00b8fcb8: b        #0xb8fa64 */ goto loc_00b8fa64;
loc_00b8fcbc:
    /* 0x00b8fcbc: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b8fcc0: mov      x2, x1 */ ARM64("mov x2, x1");
    /* 0x00b8fcc4: mov      x1, x8 */ ARM64("mov x1, x8");
    /* 0x00b8fcc8: mov      x22, x2 */ ARM64("mov x22, x2");
    /* 0x00b8fccc: bl       #0xc6be20 */ CALL_DIRECT(sub_00c6be20);
    /* 0x00b8fcd0: ldp      x23, x26, [x25, #0x18] */ ARM64("ldp x23, x26, [x25, #0x18]");
    /* 0x00b8fcd4: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b8fcd8: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b8fcdc: mov      x2, x24 */ ARM64("mov x2, x24");
    /* 0x00b8fce0: bl       #0xbd72f8 */ CALL_DIRECT(sub_00bd72f8);
    /* 0x00b8fce4: ldr      x9, [x25, #0x28] */ ARM64("ldr x9, [x25, #0x28]");
    /* 0x00b8fce8: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b8fcec: mov      x28, #-0x8000000000000000 */ ARM64("mov x28, #-0x8000000000000000");
    /* 0x00b8fcf0: b        #0xb8fa64 */ goto loc_00b8fa64;
loc_00b8fcf4:
    /* 0x00b8fcf4: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b8fcf8: add      x0, sp, #0x160 */ ARM64("add x0, sp, #0x160");
    /* 0x00b8fcfc: bl       #0xb8cce0 */ CALL_DIRECT(sub_00b8cce0);
    /* 0x00b8fd00: ldp      x9, x10, [x25, #0x98] */ ARM64("ldp x9, x10, [x25, #0x98]");
    /* 0x00b8fd04: ldr      x8, [x25, #0xb0] */ ARM64("ldr x8, [x25, #0xb0]");
    /* 0x00b8fd08: lsl      x11, x10, #5 */ ARM64("lsl x11, x10, #5");
    /* 0x00b8fd0c: add      x12, x11, x10 */ ARM64("add x12, x11, x10");
    /* 0x00b8fd10: add      x12, x12, #0x29 */ ARM64("add x12, x12, #0x29");
    /* 0x00b8fd14: sub      x11, x9, x11 */ ARM64("sub x11, x9, x11");
    /* 0x00b8fd18: sub      x11, x11, #0x20 */ ARM64("sub x11, x11, #0x20");
    /* 0x00b8fd1c: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b8fd20: cmp      x10, #0 */ ARM64("cmp x10, #0");
    /* 0x00b8fd24: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b8fd28: csel     x12, x8, x12, eq */ ARM64("csel x12, x8, x12, eq");
    /* 0x00b8fd2c: csel     x11, x8, x11, eq */ ARM64("csel x11, x8, x11, eq");
    /* 0x00b8fd30: csel     x13, xzr, x28, eq */ ARM64("csel x13, xzr, x28, eq");
    /* 0x00b8fd34: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8fd38: fmov     x14, d0 */ ARM64("fmov x14, d0");
    /* 0x00b8fd3c: and      x14, x14, #0x8080808080808080 */ ARM64("and x14, x14, #0x8080808080808080");
    /* 0x00b8fd40: add      x15, x9, #8 */ ARM64("add x15, x9, #8");
    /* 0x00b8fd44: add      x10, x9, x10 */ ARM64("add x10, x9, x10");
    /* 0x00b8fd48: add      x10, x10, #1 */ ARM64("add x10, x10, #1");
    /* 0x00b8fd4c: str      x13, [sp, #0x3f0] */ ARM64("str x13, [sp, #0x3f0]");
    /* 0x00b8fd50: str      x12, [sp, #0x3f8] */ ARM64("str x12, [sp, #0x3f8]");
    /* 0x00b8fd54: add      x13, sp, #0x210 */ ARM64("add x13, sp, #0x210");
    /* 0x00b8fd58: add      x12, x13, #0x20 */ ARM64("add x12, x13, #0x20");
    /* 0x00b8fd5c: str      x12, [sp, #0xc0] */ ARM64("str x12, [sp, #0xc0]");
    /* 0x00b8fd60: add      x12, x13, #0x50 */ ARM64("add x12, x13, #0x50");
    /* 0x00b8fd64: str      x11, [sp, #0x400] */ ARM64("str x11, [sp, #0x400]");
    /* 0x00b8fd68: str      x9, [sp, #0x408] */ ARM64("str x9, [sp, #0x408]");
    /* 0x00b8fd6c: mov      w23, #0x108 */ ARM64("mov w23, #0x108");
    /* 0x00b8fd70: str      x14, [sp, #0x410] */ ARM64("str x14, [sp, #0x410]");
    /* 0x00b8fd74: str      x15, [sp, #0x418] */ ARM64("str x15, [sp, #0x418]");
    /* 0x00b8fd78: str      x10, [sp, #0x420] */ ARM64("str x10, [sp, #0x420]");
    /* 0x00b8fd7c: str      x8, [sp, #0x428] */ ARM64("str x8, [sp, #0x428]");
    /* 0x00b8fd80: adrp     x9, #0xef8000 */ ARM64("adrp x9, #0xef8000");
    /* 0x00b8fd84: add      x9, x9, #0xb0 */ ARM64("add x9, x9, #0xb0");
    /* 0x00b8fd88: stp      x9, x12, [sp, #0xb0] */ ARM64("stp x9, x12, [sp, #0xb0]");
    /* 0x00b8fd8c: cbz      x8, #0xb90730 */ if (x8 == 0) goto loc_00b90730;
loc_00b8fd90:
    /* 0x00b8fd90: ldr      x10, [sp, #0x410] */ ARM64("ldr x10, [sp, #0x410]");
    /* 0x00b8fd94: ldr      x9, [sp, #0x408] */ ARM64("ldr x9, [sp, #0x408]");
    /* 0x00b8fd98: cbnz     x10, #0xb8fdc0 */ if (x10 != 0) goto loc_00b8fdc0;
    /* 0x00b8fd9c: ldr      x11, [sp, #0x418] */ ARM64("ldr x11, [sp, #0x418]");
loc_00b8fda0:
    /* 0x00b8fda0: ldr      d0, [x11], #8 */ ARM64("ldr d0, [x11], #8");
    /* 0x00b8fda4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b8fda8: fmov     x10, d0 */ ARM64("fmov x10, d0");
    /* 0x00b8fdac: sub      x9, x9, #0x100 */ ARM64("sub x9, x9, #0x100");
    /* 0x00b8fdb0: and      x10, x10, #0x8080808080808080 */ ARM64("and x10, x10, #0x8080808080808080");
    /* 0x00b8fdb4: cbz      x10, #0xb8fda0 */ if (x10 == 0) goto loc_00b8fda0;
    /* 0x00b8fdb8: str      x11, [sp, #0x418] */ ARM64("str x11, [sp, #0x418]");
    /* 0x00b8fdbc: str      x9, [sp, #0x408] */ ARM64("str x9, [sp, #0x408]");
loc_00b8fdc0:
    /* 0x00b8fdc0: sub      x11, x10, #1 */ ARM64("sub x11, x10, #1");
    /* 0x00b8fdc4: rbit     x12, x10 */ ARM64("rbit x12, x10");
    /* 0x00b8fdc8: clz      x12, x12 */ ARM64("clz x12, x12");
    /* 0x00b8fdcc: and      x10, x11, x10 */ ARM64("and x10, x11, x10");
    /* 0x00b8fdd0: lsl      x11, x12, #2 */ ARM64("lsl x11, x12, #2");
    /* 0x00b8fdd4: and      x11, x11, #0x1e0 */ ARM64("and x11, x11, #0x1e0");
    /* 0x00b8fdd8: sub      x9, x9, x11 */ ARM64("sub x9, x9, x11");
    /* 0x00b8fddc: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00b8fde0: str      x10, [sp, #0x410] */ ARM64("str x10, [sp, #0x410]");
    /* 0x00b8fde4: str      x8, [sp, #0x428] */ ARM64("str x8, [sp, #0x428]");
    /* 0x00b8fde8: ldur     x19, [x9, #-0x20] */ ARM64("ldur x19, [x9, #-0x20]");
    /* 0x00b8fdec: ldur     x8, [x9, #-8] */ ARM64("ldur x8, [x9, #-8]");
    /* 0x00b8fdf0: ldur     q0, [x9, #-0x18] */ ARM64("ldur q0, [x9, #-0x18]");
    /* 0x00b8fdf4: str      q0, [sp, #0x1b0] */ ARM64("str q0, [sp, #0x1b0]");
    /* 0x00b8fdf8: str      x8, [sp, #0x1c0] */ ARM64("str x8, [sp, #0x1c0]");
    /* 0x00b8fdfc: cbz      x19, #0xb90730 */ if (x19 == 0) goto loc_00b90730;
    /* 0x00b8fe00: str      x19, [sp, #0x1c8] */ ARM64("str x19, [sp, #0x1c8]");
    /* 0x00b8fe04: ldr      q0, [sp, #0x1b0] */ ARM64("ldr q0, [sp, #0x1b0]");
    /* 0x00b8fe08: str      q0, [sp, #0x1d0] */ ARM64("str q0, [sp, #0x1d0]");
    /* 0x00b8fe0c: ldr      x8, [sp, #0x1c0] */ ARM64("ldr x8, [sp, #0x1c0]");
    /* 0x00b8fe10: str      x8, [sp, #0x1e0] */ ARM64("str x8, [sp, #0x1e0]");
    /* 0x00b8fe14: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b8fe18: ldaxrb   w8, [x27] */ ARM64("ldaxrb w8, [x27]");
    /* 0x00b8fe1c: cbnz     w8, #0xb906c4 */ if (w8 != 0) goto loc_00b906c4;
    /* 0x00b8fe20: stxrb    w8, w26, [x27] */ ARM64("stxrb w8, w26, [x27]");
    /* 0x00b8fe24: cbnz     w8, #0xb906c8 */ if (w8 != 0) goto loc_00b906c8;
loc_00b8fe28:
    /* 0x00b8fe28: ldp      x9, x10, [sp, #0x1d0] */ ARM64("ldp x9, x10, [sp, #0x1d0]");
    /* 0x00b8fe2c: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b8fe30: cset     w11, ne */ ARM64("cset w11, ne");
    /* 0x00b8fe34: ldr      x8, [sp, #0x1e0] */ ARM64("ldr x8, [sp, #0x1e0]");
    /* 0x00b8fe38: csel     x8, x8, xzr, ne */ ARM64("csel x8, x8, xzr, ne");
    /* 0x00b8fe3c: stp      x11, xzr, [x29, #-0xf0] */ ARM64("stp x11, xzr, [x29, #-0xf0]");
    /* 0x00b8fe40: stp      x9, x10, [x29, #-0xe0] */ ARM64("stp x9, x10, [x29, #-0xe0]");
    /* 0x00b8fe44: stp      x11, xzr, [x29, #-0xd0] */ ARM64("stp x11, xzr, [x29, #-0xd0]");
    /* 0x00b8fe48: stp      x9, x10, [x29, #-0xc0] */ ARM64("stp x9, x10, [x29, #-0xc0]");
    /* 0x00b8fe4c: stur     x8, [x29, #-0xb0] */ ARM64("stur x8, [x29, #-0xb0]");
    /* 0x00b8fe50: cbnz     x8, #0xb8fec4 */ if (x8 != 0) goto loc_00b8fec4;
loc_00b8fe54:
    /* 0x00b8fe54: ldp      x10, x0, [x29, #-0xf0] */ ARM64("ldp x10, x0, [x29, #-0xf0]");
    /* 0x00b8fe58: ldp      x9, x8, [x29, #-0xe0] */ ARM64("ldp x9, x8, [x29, #-0xe0]");
    /* 0x00b8fe5c: stur     xzr, [x29, #-0xf0] */ ARM64("stur xzr, [x29, #-0xf0]");
    /* 0x00b8fe60: cmp      x10, #1 */ ARM64("cmp x10, #1");
    /* 0x00b8fe64: b.ne     #0xb9067c */ if (COND_NE) goto loc_00b9067c;
    /* 0x00b8fe68: cbnz     x0, #0xb8fe80 */ if (x0 != 0) goto loc_00b8fe80;
    /* 0x00b8fe6c: mov      x0, x9 */ ARM64("mov x0, x9");
    /* 0x00b8fe70: cbz      x8, #0xb8fe80 */ if (x8 == 0) goto loc_00b8fe80;
loc_00b8fe74:
    /* 0x00b8fe74: ldr      x0, [x0, #0x380] */ ARM64("ldr x0, [x0, #0x380]");
    /* 0x00b8fe78: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b8fe7c: b.ne     #0xb8fe74 */ if (COND_NE) goto loc_00b8fe74;
loc_00b8fe80:
    /* 0x00b8fe80: ldr      x8, [x0] */ ARM64("ldr x8, [x0]");
    /* 0x00b8fe84: cbz      x8, #0xb90670 */ if (x8 == 0) goto loc_00b90670;
loc_00b8fe88:
    /* 0x00b8fe88: mov      x21, x8 */ ARM64("mov x21, x8");
    /* 0x00b8fe8c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8fe90: ldr      x8, [x21] */ ARM64("ldr x8, [x21]");
    /* 0x00b8fe94: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b8fe98: cbnz     x8, #0xb8fe88 */ if (x8 != 0) goto loc_00b8fe88;
    /* 0x00b8fe9c: b        #0xb90674 */ goto loc_00b90674;
loc_00b8fea0:
    /* 0x00b8fea0: add      x1, sp, #0x210 */ ARM64("add x1, sp, #0x210");
    /* 0x00b8fea4: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b8fea8: mov      w2, #0x108 */ ARM64("mov w2, #0x108");
    /* 0x00b8feac: bl       #0xc7ad6c */ CALL_DIRECT(sub_00c7ad6c);
    /* 0x00b8feb0: add      x8, x21, #1 */ ARM64("add x8, x21, #1");
    /* 0x00b8feb4: str      x8, [x19, #0x20] */ ARM64("str x8, [x19, #0x20]");
    /* 0x00b8feb8: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b8febc: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00b8fec0: cbz      x8, #0xb8fe54 */ if (x8 == 0) goto loc_00b8fe54;
loc_00b8fec4:
    /* 0x00b8fec4: sub      x8, x8, #1 */ ARM64("sub x8, x8, #1");
    /* 0x00b8fec8: stur     x8, [x29, #-0xb0] */ ARM64("stur x8, [x29, #-0xb0]");
    /* 0x00b8fecc: ldur     x8, [x29, #-0xd0] */ ARM64("ldur x8, [x29, #-0xd0]");
    /* 0x00b8fed0: cmp      x8, #1 */ ARM64("cmp x8, #1");
    /* 0x00b8fed4: b.ne     #0xb90e30 */ if (COND_NE) goto loc_00b90e30;
    /* 0x00b8fed8: ldur     x0, [x29, #-0xc8] */ ARM64("ldur x0, [x29, #-0xc8]");
    /* 0x00b8fedc: ldur     x20, [x29, #-0xb8] */ ARM64("ldur x20, [x29, #-0xb8]");
    /* 0x00b8fee0: cbz      x0, #0xb8fef4 */ if (x0 == 0) goto loc_00b8fef4;
    /* 0x00b8fee4: ldur     x22, [x29, #-0xc0] */ ARM64("ldur x22, [x29, #-0xc0]");
    /* 0x00b8fee8: cbz      x20, #0xb8ff20 */ if (x20 == 0) goto loc_00b8ff20;
loc_00b8feec:
    /* 0x00b8feec: mov      x21, x0 */ ARM64("mov x21, x0");
    /* 0x00b8fef0: b        #0xb8ff3c */ goto loc_00b8ff3c;
loc_00b8fef4:
    /* 0x00b8fef4: ldur     x0, [x29, #-0xc0] */ ARM64("ldur x0, [x29, #-0xc0]");
    /* 0x00b8fef8: cbz      x20, #0xb8ff10 */ if (x20 == 0) goto loc_00b8ff10;
loc_00b8fefc:
    /* 0x00b8fefc: ldrh     w8, [x0, #0x37a] */ ARM64("ldrh w8, [x0, #0x37a]");
    /* 0x00b8ff00: add      x8, x0, x8, lsl #3 */ ARM64("add x8, x0, x8, lsl #3");
    /* 0x00b8ff04: ldr      x0, [x8, #0x380] */ ARM64("ldr x0, [x8, #0x380]");
    /* 0x00b8ff08: subs     x20, x20, #1 */ ARM64("subs x20, x20, #1");
    /* 0x00b8ff0c: b.ne     #0xb8fefc */ if (COND_NE) goto loc_00b8fefc;
loc_00b8ff10:
    /* 0x00b8ff10: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b8ff14: ldrh     w20, [x0, #0x37a] */ ARM64("ldrh w20, [x0, #0x37a]");
    /* 0x00b8ff18: stur     x26, [x29, #-0xd0] */ ARM64("stur x26, [x29, #-0xd0]");
    /* 0x00b8ff1c: cbnz     x20, #0xb8feec */ if (x20 != 0) goto loc_00b8feec;
loc_00b8ff20:
    /* 0x00b8ff20: ldr      x21, [x0] */ ARM64("ldr x21, [x0]");
    /* 0x00b8ff24: cbz      x21, #0xb90d50 */ if (x21 == 0) goto loc_00b90d50;
    /* 0x00b8ff28: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b8ff2c: ldrh     w20, [x0, #0x378] */ ARM64("ldrh w20, [x0, #0x378]");
    /* 0x00b8ff30: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b8ff34: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b8ff38: cbz      w20, #0xb8ff20 */ if (w20 == 0) goto loc_00b8ff20;
loc_00b8ff3c:
    /* 0x00b8ff3c: sub      x8, x20, #1 */ ARM64("sub x8, x20, #1");
    /* 0x00b8ff40: cbz      x22, #0xb8ff70 */ if (x22 == 0) goto loc_00b8ff70;
    /* 0x00b8ff44: add      x9, x21, x8, lsl #3 */ ARM64("add x9, x21, x8, lsl #3");
    /* 0x00b8ff48: ldr      x9, [x9, #0x380] */ ARM64("ldr x9, [x9, #0x380]");
    /* 0x00b8ff4c: subs     x10, x22, #1 */ ARM64("subs x10, x22, #1");
    /* 0x00b8ff50: b.eq     #0xb8ff68 */ if (COND_EQ) goto loc_00b8ff68;
loc_00b8ff54:
    /* 0x00b8ff54: ldrh     w11, [x9, #0x37a] */ ARM64("ldrh w11, [x9, #0x37a]");
    /* 0x00b8ff58: add      x9, x9, x11, lsl #3 */ ARM64("add x9, x9, x11, lsl #3");
    /* 0x00b8ff5c: ldr      x9, [x9, #0x380] */ ARM64("ldr x9, [x9, #0x380]");
    /* 0x00b8ff60: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b8ff64: b.ne     #0xb8ff54 */ if (COND_NE) goto loc_00b8ff54;
loc_00b8ff68:
    /* 0x00b8ff68: ldrh     w10, [x9, #0x37a] */ ARM64("ldrh w10, [x9, #0x37a]");
    /* 0x00b8ff6c: b        #0xb8ff78 */ goto loc_00b8ff78;
loc_00b8ff70:
    /* 0x00b8ff70: mov      x9, x21 */ ARM64("mov x9, x21");
    /* 0x00b8ff74: sub      x10, x20, #1 */ ARM64("sub x10, x20, #1");
loc_00b8ff78:
    /* 0x00b8ff78: stp      x9, xzr, [x29, #-0xc8] */ ARM64("stp x9, xzr, [x29, #-0xc8]");
    /* 0x00b8ff7c: stur     x10, [x29, #-0xb8] */ ARM64("stur x10, [x29, #-0xb8]");
    /* 0x00b8ff80: ldr      x0, [x21, x20, lsl #3] */ ARM64("ldr x0, [x21, x20, lsl #3]");
    /* 0x00b8ff84: mov      w9, #0x48 */ ARM64("mov w9, #0x48");
    /* 0x00b8ff88: madd     x8, x8, x9, x21 */ ARM64("madd x8, x8, x9, x21");
    /* 0x00b8ff8c: ldr      x24, [x8, #0x60] */ ARM64("ldr x24, [x8, #0x60]");
    /* 0x00b8ff90: ldur     q0, [x8, #0x68] */ ARM64("ldur q0, [x8, #0x68]");
    /* 0x00b8ff94: ldur     q1, [x8, #0x78] */ ARM64("ldur q1, [x8, #0x78]");
    /* 0x00b8ff98: ldur     q2, [x8, #0x88] */ ARM64("ldur q2, [x8, #0x88]");
    /* 0x00b8ff9c: ldur     q3, [x8, #0x98] */ ARM64("ldur q3, [x8, #0x98]");
    /* 0x00b8ffa0: str      q3, [sp, #0x460] */ ARM64("str q3, [sp, #0x460]");
    /* 0x00b8ffa4: str      q2, [sp, #0x450] */ ARM64("str q2, [sp, #0x450]");
    /* 0x00b8ffa8: str      q1, [sp, #0x440] */ ARM64("str q1, [sp, #0x440]");
    /* 0x00b8ffac: str      q0, [sp, #0x430] */ ARM64("str q0, [sp, #0x430]");
    /* 0x00b8ffb0: mov      x8, #-0x8000000000000000 */ ARM64("mov x8, #-0x8000000000000000");
    /* 0x00b8ffb4: cmp      x24, x8 */ ARM64("cmp x24, x8");
    /* 0x00b8ffb8: b.eq     #0xb9067c */ if (COND_EQ) goto loc_00b9067c;
    /* 0x00b8ffbc: str      x24, [sp, #0x320] */ ARM64("str x24, [sp, #0x320]");
    /* 0x00b8ffc0: ldr      q0, [sp, #0x430] */ ARM64("ldr q0, [sp, #0x430]");
    /* 0x00b8ffc4: ldr      q1, [sp, #0x440] */ ARM64("ldr q1, [sp, #0x440]");
    /* 0x00b8ffc8: add      x8, sp, #0x320 */ ARM64("add x8, sp, #0x320");
    /* 0x00b8ffcc: stur     q0, [x8, #8] */ ARM64("stur q0, [x8, #8]");
    /* 0x00b8ffd0: stur     q1, [x8, #0x18] */ ARM64("stur q1, [x8, #0x18]");
    /* 0x00b8ffd4: ldr      q0, [sp, #0x450] */ ARM64("ldr q0, [sp, #0x450]");
    /* 0x00b8ffd8: ldr      q1, [sp, #0x460] */ ARM64("ldr q1, [sp, #0x460]");
    /* 0x00b8ffdc: stur     q0, [x8, #0x28] */ ARM64("stur q0, [x8, #0x28]");
    /* 0x00b8ffe0: stur     q1, [x8, #0x38] */ ARM64("stur q1, [x8, #0x38]");
    /* 0x00b8ffe4: ldr      x1, [x19, #0x20] */ ARM64("ldr x1, [x19, #0x20]");
    /* 0x00b8ffe8: cmp      x0, x1 */ ARM64("cmp x0, x1");
    /* 0x00b8ffec: b.hs     #0xb90e40 */ if (COND_HS) goto loc_00b90e40;
    /* 0x00b8fff0: ldr      x8, [x19, #0x18] */ ARM64("ldr x8, [x19, #0x18]");
    /* 0x00b8fff4: str      x0, [sp, #0x118] */ ARM64("str x0, [sp, #0x118]");
    /* 0x00b8fff8: madd     x9, x0, x23, x8 */ ARM64("madd x9, x0, x23, x8");
    /* 0x00b8fffc: ldr      x8, [x9, #0x18] */ ARM64("ldr x8, [x9, #0x18]");
    /* 0x00b90000: ldr      x22, [sp, #0x350] */ ARM64("ldr x22, [sp, #0x350]");
    /* 0x00b90004: ldr      x23, [sp, #0x340] */ ARM64("ldr x23, [sp, #0x340]");
    /* 0x00b90008: cmp      x8, #0xf */ ARM64("cmp x8, #0xf");
    /* 0x00b9000c: b.ne     #0xb90398 */ if (COND_NE) goto loc_00b90398;
    /* 0x00b90010: str      x9, [sp, #0xe0] */ ARM64("str x9, [sp, #0xe0]");
    /* 0x00b90014: ldp      x10, x9, [x9, #0x28] */ ARM64("ldp x10, x9, [x9, #0x28]");
    /* 0x00b90018: mov      w8, #0x18 */ ARM64("mov w8, #0x18");
    /* 0x00b9001c: stp      x9, x10, [sp, #0xd0] */ ARM64("stp x9, x10, [sp, #0xd0]");
    /* 0x00b90020: madd     x26, x9, x8, x10 */ ARM64("madd x26, x9, x8, x10");
    /* 0x00b90024: ldr      x27, [sp, #0x360] */ ARM64("ldr x27, [sp, #0x360]");
    /* 0x00b90028: ldr      x8, [sp, #0x328] */ ARM64("ldr x8, [sp, #0x328]");
    /* 0x00b9002c: str      x8, [sp, #0xf0] */ ARM64("str x8, [sp, #0xf0]");
    /* 0x00b90030: ldr      x8, [sp, #0x330] */ ARM64("ldr x8, [sp, #0x330]");
    /* 0x00b90034: str      x8, [sp, #0x108] */ ARM64("str x8, [sp, #0x108]");
    /* 0x00b90038: ldr      x28, [sp, #0x358] */ ARM64("ldr x28, [sp, #0x358]");
    /* 0x00b9003c: ldr      x20, [sp, #0x338] */ ARM64("ldr x20, [sp, #0x338]");
    /* 0x00b90040: mov      x8, x10 */ ARM64("mov x8, x10");
    /* 0x00b90044: b        #0xb900d0 */ goto loc_00b900d0;
loc_00b90048:
    /* 0x00b90048: and      x10, x0, x23 */ ARM64("and x10, x0, x23");
    /* 0x00b9004c: ldr      x11, [x20, x10] */ ARM64("ldr x11, [x20, x10]");
    /* 0x00b90050: eor      x12, x11, x9 */ ARM64("eor x12, x11, x9");
    /* 0x00b90054: mov      x13, #-0x101010101010102 */ ARM64("mov x13, #-0x101010101010102");
    /* 0x00b90058: movk     x13, #0xfeff */ ARM64("movk x13, #0xfeff");
    /* 0x00b9005c: add      x13, x12, x13 */ ARM64("add x13, x12, x13");
    /* 0x00b90060: bic      x12, x13, x12 */ ARM64("bic x12, x13, x12");
    /* 0x00b90064: ands     x12, x12, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x12, x12, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b90068: b.eq     #0xb900b0 */ if (COND_EQ) goto loc_00b900b0;
loc_00b9006c:
    /* 0x00b9006c: rbit     x13, x12 */ ARM64("rbit x13, x12");
    /* 0x00b90070: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b90074: add      x13, x10, x13, lsr #3 */ ARM64("add x13, x10, x13, lsr #3");
    /* 0x00b90078: and      x13, x13, x23 */ ARM64("and x13, x13, x23");
    /* 0x00b9007c: sub      x13, x20, x13, lsl #3 */ ARM64("sub x13, x20, x13, lsl #3");
    /* 0x00b90080: ldur     x0, [x13, #-8] */ ARM64("ldur x0, [x13, #-8]");
    /* 0x00b90084: ldr      x13, [sp, #0x108] */ ARM64("ldr x13, [sp, #0x108]");
    /* 0x00b90088: cmp      x0, x13 */ ARM64("cmp x0, x13");
    /* 0x00b9008c: b.hs     #0xb90e50 */ if (COND_HS) goto loc_00b90e50;
    /* 0x00b90090: lsl      x13, x0, #4 */ ARM64("lsl x13, x0, #4");
    /* 0x00b90094: ldr      x14, [sp, #0xf0] */ ARM64("ldr x14, [sp, #0xf0]");
    /* 0x00b90098: ldr      x13, [x14, x13] */ ARM64("ldr x13, [x14, x13]");
    /* 0x00b9009c: cmp      x21, x13 */ ARM64("cmp x21, x13");
    /* 0x00b900a0: b.eq     #0xb900c8 */ if (COND_EQ) goto loc_00b900c8;
    /* 0x00b900a4: sub      x13, x12, #1 */ ARM64("sub x13, x12, #1");
    /* 0x00b900a8: ands     x12, x13, x12 */ ARM64("ands x12, x13, x12");
    /* 0x00b900ac: b.ne     #0xb9006c */ if (COND_NE) goto loc_00b9006c;
loc_00b900b0:
    /* 0x00b900b0: and      x11, x11, x11, lsl #1 */ ARM64("and x11, x11, x11, lsl #1");
    /* 0x00b900b4: tst      x11, #-0x7f7f7f7f7f7f7f80 */ ARM64("tst x11, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b900b8: b.ne     #0xb90118 */ if (COND_NE) goto loc_00b90118;
    /* 0x00b900bc: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b900c0: add      x0, x10, x8 */ ARM64("add x0, x10, x8");
    /* 0x00b900c4: b        #0xb90048 */ goto loc_00b90048;
loc_00b900c8:
    /* 0x00b900c8: mov      x8, x25 */ ARM64("mov x8, x25");
    /* 0x00b900cc: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
loc_00b900d0:
    /* 0x00b900d0: cmp      x8, x26 */ ARM64("cmp x8, x26");
    /* 0x00b900d4: b.eq     #0xb9012c */ if (COND_EQ) goto loc_00b9012c;
    /* 0x00b900d8: mov      x25, x8 */ ARM64("mov x25, x8");
    /* 0x00b900dc: ldr      x9, [x25], #0x18 */ ARM64("ldr x9, [x25], #0x18");
    /* 0x00b900e0: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b900e4: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b900e8: b.ne     #0xb90248 */ if (COND_NE) goto loc_00b90248;
    /* 0x00b900ec: cbz      x22, #0xb9025c */ if (x22 == 0) goto loc_00b9025c;
    /* 0x00b900f0: ldr      x21, [x8, #8] */ ARM64("ldr x21, [x8, #8]");
    /* 0x00b900f4: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b900f8: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b900fc: mov      x2, x21 */ ARM64("mov x2, x21");
    /* 0x00b90100: bl       #0xb8bd94 */ CALL_DIRECT(sub_00b8bd94);
    /* 0x00b90104: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b90108: lsr      x9, x0, #0x39 */ ARM64("lsr x9, x0, #0x39");
    /* 0x00b9010c: mov      x10, #0x101010101010101 */ ARM64("mov x10, #0x101010101010101");
    /* 0x00b90110: mul      x9, x9, x10 */ ARM64("mul x9, x9, x10");
    /* 0x00b90114: b        #0xb90048 */ goto loc_00b90048;
loc_00b90118:
    /* 0x00b90118: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9011c: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b90120: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b90124: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b90128: b        #0xb9039c */ goto loc_00b9039c;
loc_00b9012c:
    /* 0x00b9012c: ldr      x17, [sp, #0x108] */ ARM64("ldr x17, [sp, #0x108]");
    /* 0x00b90130: cbz      x17, #0xb90270 */ if (x17 == 0) goto loc_00b90270;
    /* 0x00b90134: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00b90138: mov      x10, #0 */ ARM64("mov x10, #0");
    /* 0x00b9013c: ldp      x8, x2, [sp, #0xd0] */ ARM64("ldp x8, x2, [sp, #0xd0]");
    /* 0x00b90140: add      x8, x8, x8, lsl #1 */ ARM64("add x8, x8, x8, lsl #1");
    /* 0x00b90144: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b90148: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b9014c: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b90150: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b90154: ldr      x16, [sp, #0xe0] */ ARM64("ldr x16, [sp, #0xe0]");
    /* 0x00b90158: ldr      x1, [sp, #0xf0] */ ARM64("ldr x1, [sp, #0xf0]");
    /* 0x00b9015c: b        #0xb9016c */ goto loc_00b9016c;
loc_00b90160:
    /* 0x00b90160: mov      x10, x9 */ ARM64("mov x10, x9");
    /* 0x00b90164: cmp      x9, x17 */ ARM64("cmp x9, x17");
    /* 0x00b90168: b.eq     #0xb90394 */ if (COND_EQ) goto loc_00b90394;
loc_00b9016c:
    /* 0x00b9016c: cmp      x10, x17 */ ARM64("cmp x10, x17");
    /* 0x00b90170: b.eq     #0xb90e64 */ if (COND_EQ) goto loc_00b90e64;
    /* 0x00b90174: add      x9, x10, #1 */ ARM64("add x9, x10, #1");
    /* 0x00b90178: mov      x12, x8 */ ARM64("mov x12, x8");
    /* 0x00b9017c: mov      x13, x2 */ ARM64("mov x13, x2");
    /* 0x00b90180: add      x11, x1, x10, lsl #4 */ ARM64("add x11, x1, x10, lsl #4");
loc_00b90184:
    /* 0x00b90184: cbz      x12, #0xb901c4 */ if (x12 == 0) goto loc_00b901c4;
    /* 0x00b90188: ldr      x14, [x13] */ ARM64("ldr x14, [x13]");
    /* 0x00b9018c: mov      x15, #-0x8000000000000000 */ ARM64("mov x15, #-0x8000000000000000");
    /* 0x00b90190: cmp      x14, x15 */ ARM64("cmp x14, x15");
    /* 0x00b90194: b.ne     #0xb90888 */ if (COND_NE) goto loc_00b90888;
    /* 0x00b90198: ldr      x14, [x13, #8] */ ARM64("ldr x14, [x13, #8]");
    /* 0x00b9019c: add      x13, x13, #0x18 */ ARM64("add x13, x13, #0x18");
    /* 0x00b901a0: ldr      x15, [x11] */ ARM64("ldr x15, [x11]");
    /* 0x00b901a4: sub      x12, x12, #0x18 */ ARM64("sub x12, x12, #0x18");
    /* 0x00b901a8: cmp      x14, x15 */ ARM64("cmp x14, x15");
    /* 0x00b901ac: b.ne     #0xb90184 */ if (COND_NE) goto loc_00b90184;
    /* 0x00b901b0: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b901b4: mov      x10, x9 */ ARM64("mov x10, x9");
    /* 0x00b901b8: cmp      x9, x17 */ ARM64("cmp x9, x17");
    /* 0x00b901bc: b.ne     #0xb9016c */ if (COND_NE) goto loc_00b9016c;
    /* 0x00b901c0: b        #0xb901f4 */ goto loc_00b901f4;
loc_00b901c4:
    /* 0x00b901c4: cbz      x21, #0xb90160 */ if (x21 == 0) goto loc_00b90160;
    /* 0x00b901c8: sub      x0, x10, x21 */ ARM64("sub x0, x10, x21");
    /* 0x00b901cc: cmp      x0, x17 */ ARM64("cmp x0, x17");
    /* 0x00b901d0: b.hs     #0xb90e98 */ if (COND_HS) goto loc_00b90e98;
    /* 0x00b901d4: lsl      x10, x0, #4 */ ARM64("lsl x10, x0, #4");
    /* 0x00b901d8: ldr      q0, [x1, x10] */ ARM64("ldr q0, [x1, x10]");
    /* 0x00b901dc: ldr      q1, [x11] */ ARM64("ldr q1, [x11]");
    /* 0x00b901e0: str      q1, [x1, x10] */ ARM64("str q1, [x1, x10]");
    /* 0x00b901e4: str      q0, [x11] */ ARM64("str q0, [x11]");
    /* 0x00b901e8: mov      x10, x9 */ ARM64("mov x10, x9");
    /* 0x00b901ec: cmp      x9, x17 */ ARM64("cmp x9, x17");
    /* 0x00b901f0: b.ne     #0xb9016c */ if (COND_NE) goto loc_00b9016c;
loc_00b901f4:
    /* 0x00b901f4: cbz      x21, #0xb90394 */ if (x21 == 0) goto loc_00b90394;
    /* 0x00b901f8: subs     x20, x17, x21 */ ARM64("subs x20, x17, x21");
    /* 0x00b901fc: b.lo     #0xb9028c */ if (COND_LO) goto loc_00b9028c;
    /* 0x00b90200: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b90204: ldr      x8, [sp, #0xf0] */ ARM64("ldr x8, [sp, #0xf0]");
    /* 0x00b90208: add      x23, x8, x20, lsl #4 */ ARM64("add x23, x8, x20, lsl #4");
    /* 0x00b9020c: str      x20, [sp, #0x330] */ ARM64("str x20, [sp, #0x330]");
loc_00b90210:
    /* 0x00b90210: cmp      x22, x21 */ ARM64("cmp x22, x21");
    /* 0x00b90214: b.eq     #0xb90284 */ if (COND_EQ) goto loc_00b90284;
    /* 0x00b90218: add      x8, x23, x22, lsl #4 */ ARM64("add x8, x23, x22, lsl #4");
    /* 0x00b9021c: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b90220: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
loc_00b90224:
    /* 0x00b90224: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b90228: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b9022c: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b90230: cbnz     w11, #0xb90224 */ if (w11 != 0) goto loc_00b90224;
    /* 0x00b90234: b.ne     #0xb90210 */ if (COND_NE) goto loc_00b90210;
    /* 0x00b90238: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b9023c: ldr      x0, [x8] */ ARM64("ldr x0, [x8]");
    /* 0x00b90240: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b90244: b        #0xb90210 */ goto loc_00b90210;
loc_00b90248:
    /* 0x00b90248: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9024c: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b90250: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b90254: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b90258: b        #0xb90398 */ goto loc_00b90398;
loc_00b9025c:
    /* 0x00b9025c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b90260: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b90264: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b90268: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b9026c: b        #0xb90454 */ goto loc_00b90454;
loc_00b90270:
    /* 0x00b90270: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b90274: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b90278: mov      w28, #8 */ ARM64("mov w28, #8");
    /* 0x00b9027c: ldr      x16, [sp, #0xe0] */ ARM64("ldr x16, [sp, #0xe0]");
    /* 0x00b90280: b        #0xb90394 */ goto loc_00b90394;
loc_00b90284:
    /* 0x00b90284: ldr      x23, [sp, #0x340] */ ARM64("ldr x23, [sp, #0x340]");
    /* 0x00b90288: str      x20, [sp, #0x108] */ ARM64("str x20, [sp, #0x108]");
loc_00b9028c:
    /* 0x00b9028c: cbz      x23, #0xb902bc */ if (x23 == 0) goto loc_00b902bc;
    /* 0x00b90290: ldr      x0, [sp, #0x338] */ ARM64("ldr x0, [sp, #0x338]");
    /* 0x00b90294: add      x2, x23, #9 */ ARM64("add x2, x23, #9");
    /* 0x00b90298: mov      w1, #0xff */ ARM64("mov w1, #0xff");
    /* 0x00b9029c: bl       #0xc7ad84 */ CALL_DIRECT(sub_00c7ad84);
    /* 0x00b902a0: add      x8, x23, #1 */ ARM64("add x8, x23, #1");
    /* 0x00b902a4: lsr      x8, x8, #3 */ ARM64("lsr x8, x8, #3");
    /* 0x00b902a8: lsl      x9, x8, #3 */ ARM64("lsl x9, x8, #3");
    /* 0x00b902ac: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b902b0: cmp      x23, #8 */ ARM64("cmp x23, #8");
    /* 0x00b902b4: csel     x8, x23, x8, lo */ ARM64("csel x8, x23, x8, lo");
    /* 0x00b902b8: b        #0xb902c0 */ goto loc_00b902c0;
loc_00b902bc:
    /* 0x00b902bc: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b902c0:
    /* 0x00b902c0: ldr      x16, [sp, #0xe0] */ ARM64("ldr x16, [sp, #0xe0]");
    /* 0x00b902c4: ldr      x11, [sp, #0x108] */ ARM64("ldr x11, [sp, #0x108]");
    /* 0x00b902c8: str      xzr, [sp, #0x350] */ ARM64("str xzr, [sp, #0x350]");
    /* 0x00b902cc: str      x8, [sp, #0x348] */ ARM64("str x8, [sp, #0x348]");
    /* 0x00b902d0: cmp      x8, x11 */ ARM64("cmp x8, x11");
    /* 0x00b902d4: b.lo     #0xb90e04 */ if (COND_LO) goto loc_00b90e04;
    /* 0x00b902d8: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b902dc: cbz      x11, #0xb90394 */ if (x11 == 0) goto loc_00b90394;
    /* 0x00b902e0: ldr      x9, [sp, #0x328] */ ARM64("ldr x9, [sp, #0x328]");
    /* 0x00b902e4: ldr      x10, [sp, #0x338] */ ARM64("ldr x10, [sp, #0x338]");
    /* 0x00b902e8: add      x11, x9, x11, lsl #4 */ ARM64("add x11, x9, x11, lsl #4");
loc_00b902ec:
    /* 0x00b902ec: ldr      x12, [x9, #8] */ ARM64("ldr x12, [x9, #8]");
    /* 0x00b902f0: and      x13, x23, x12 */ ARM64("and x13, x23, x12");
    /* 0x00b902f4: ldr      x14, [x10, x13] */ ARM64("ldr x14, [x10, x13]");
    /* 0x00b902f8: ands     x14, x14, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x14, x14, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b902fc: b.ne     #0xb9031c */ if (COND_NE) goto loc_00b9031c;
    /* 0x00b90300: mov      w15, #8 */ ARM64("mov w15, #8");
loc_00b90304:
    /* 0x00b90304: add      x13, x13, x15 */ ARM64("add x13, x13, x15");
    /* 0x00b90308: and      x13, x13, x23 */ ARM64("and x13, x13, x23");
    /* 0x00b9030c: ldr      x14, [x10, x13] */ ARM64("ldr x14, [x10, x13]");
    /* 0x00b90310: add      x15, x15, #8 */ ARM64("add x15, x15, #8");
    /* 0x00b90314: ands     x14, x14, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x14, x14, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b90318: b.eq     #0xb90304 */ if (COND_EQ) goto loc_00b90304;
loc_00b9031c:
    /* 0x00b9031c: rbit     x14, x14 */ ARM64("rbit x14, x14");
    /* 0x00b90320: clz      x14, x14 */ ARM64("clz x14, x14");
    /* 0x00b90324: add      x13, x13, x14, lsr #3 */ ARM64("add x13, x13, x14, lsr #3");
    /* 0x00b90328: and      x13, x13, x23 */ ARM64("and x13, x13, x23");
    /* 0x00b9032c: ldrsb    w14, [x10, x13] */ ARM64("ldrsb w14, [x10, x13]");
    /* 0x00b90330: tbz      w14, #0x1f, #0xb90370 */ if (((w14 >> #0x1f) & 1) == 0) goto loc_00b90370;
loc_00b90334:
    /* 0x00b90334: add      x9, x9, #0x10 */ ARM64("add x9, x9, #0x10");
    /* 0x00b90338: lsr      x12, x12, #0x39 */ ARM64("lsr x12, x12, #0x39");
    /* 0x00b9033c: sub      x15, x13, #8 */ ARM64("sub x15, x13, #8");
    /* 0x00b90340: and      x15, x15, x23 */ ARM64("and x15, x15, x23");
    /* 0x00b90344: strb     w12, [x10, x13] */ ARM64("strb w12, [x10, x13]");
    /* 0x00b90348: add      x15, x10, x15 */ ARM64("add x15, x10, x15");
    /* 0x00b9034c: strb     w12, [x15, #8] */ ARM64("strb w12, [x15, #8]");
    /* 0x00b90350: sub      x12, x10, x13, lsl #3 */ ARM64("sub x12, x10, x13, lsl #3");
    /* 0x00b90354: and      x13, x14, #1 */ ARM64("and x13, x14, #1");
    /* 0x00b90358: sub      x8, x8, x13 */ ARM64("sub x8, x8, x13");
    /* 0x00b9035c: stur     x22, [x12, #-8] */ ARM64("stur x22, [x12, #-8]");
    /* 0x00b90360: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b90364: cmp      x9, x11 */ ARM64("cmp x9, x11");
    /* 0x00b90368: b.ne     #0xb902ec */ if (COND_NE) goto loc_00b902ec;
    /* 0x00b9036c: b        #0xb9038c */ goto loc_00b9038c;
loc_00b90370:
    /* 0x00b90370: ldr      x13, [x10] */ ARM64("ldr x13, [x10]");
    /* 0x00b90374: and      x13, x13, #0x8080808080808080 */ ARM64("and x13, x13, #0x8080808080808080");
    /* 0x00b90378: rbit     x13, x13 */ ARM64("rbit x13, x13");
    /* 0x00b9037c: clz      x13, x13 */ ARM64("clz x13, x13");
    /* 0x00b90380: lsr      x13, x13, #3 */ ARM64("lsr x13, x13, #3");
    /* 0x00b90384: ldrb     w14, [x10, x13] */ ARM64("ldrb w14, [x10, x13]");
    /* 0x00b90388: b        #0xb90334 */ goto loc_00b90334;
loc_00b9038c:
    /* 0x00b9038c: str      x22, [sp, #0x350] */ ARM64("str x22, [sp, #0x350]");
    /* 0x00b90390: str      x8, [sp, #0x348] */ ARM64("str x8, [sp, #0x348]");
loc_00b90394:
    /* 0x00b90394: strb     w26, [x16, #0x50] */ ARM64("strb w26, [x16, #0x50]");
loc_00b90398:
    /* 0x00b90398: cbz      x22, #0xb90454 */ if (x22 == 0) goto loc_00b90454;
loc_00b9039c:
    /* 0x00b9039c: ldr      x21, [sp, #0x328] */ ARM64("ldr x21, [sp, #0x328]");
    /* 0x00b903a0: ldr      x20, [sp, #0x330] */ ARM64("ldr x20, [sp, #0x330]");
    /* 0x00b903a4: cbz      x23, #0xb903c0 */ if (x23 == 0) goto loc_00b903c0;
    /* 0x00b903a8: ldr      x8, [sp, #0x338] */ ARM64("ldr x8, [sp, #0x338]");
    /* 0x00b903ac: lsl      x9, x23, #3 */ ARM64("lsl x9, x23, #3");
    /* 0x00b903b0: add      x9, x9, #0xf */ ARM64("add x9, x9, #0xf");
    /* 0x00b903b4: and      x9, x9, #0xfffffffffffffff8 */ ARM64("and x9, x9, #0xfffffffffffffff8");
    /* 0x00b903b8: sub      x0, x8, x9 */ ARM64("sub x0, x8, x9");
    /* 0x00b903bc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b903c0:
    /* 0x00b903c0: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00b903c4: add      x9, x21, x8 */ ARM64("add x9, x21, x8");
    /* 0x00b903c8: stp      x21, x21, [sp, #0x1f0] */ ARM64("stp x21, x21, [sp, #0x1f0]");
    /* 0x00b903cc: str      x24, [sp, #0x200] */ ARM64("str x24, [sp, #0x200]");
    /* 0x00b903d0: str      x9, [sp, #0x208] */ ARM64("str x9, [sp, #0x208]");
    /* 0x00b903d4: cbz      x20, #0xb90430 */ if (x20 == 0) goto loc_00b90430;
    /* 0x00b903d8: ldr      x20, [x21], #0x10 */ ARM64("ldr x20, [x21], #0x10");
    /* 0x00b903dc: str      x21, [sp, #0x1f8] */ ARM64("str x21, [sp, #0x1f8]");
    /* 0x00b903e0: mov      x9, #-0x8000000000000000 */ ARM64("mov x9, #-0x8000000000000000");
    /* 0x00b903e4: str      x9, [sp, #0x210] */ ARM64("str x9, [sp, #0x210]");
    /* 0x00b903e8: str      x20, [sp, #0x218] */ ARM64("str x20, [sp, #0x218]");
    /* 0x00b903ec: sub      x9, x8, #0x10 */ ARM64("sub x9, x8, #0x10");
    /* 0x00b903f0: lsr      x8, x9, #4 */ ARM64("lsr x8, x9, #4");
    /* 0x00b903f4: cmp      x8, #3 */ ARM64("cmp x8, #3");
    /* 0x00b903f8: mov      w10, #3 */ ARM64("mov w10, #3");
    /* 0x00b903fc: csel     x8, x8, x10, hi */ ARM64("csel x8, x8, x10, hi");
    /* 0x00b90400: mov      x10, #0x5555555555555555 */ ARM64("mov x10, #0x5555555555555555");
    /* 0x00b90404: movk     x10, #0x5540 */ ARM64("movk x10, #0x5540");
    /* 0x00b90408: cmp      x9, x10 */ ARM64("cmp x9, x10");
    /* 0x00b9040c: b.hi     #0xb906e4 */ if (COND_HI) goto loc_00b906e4;
    /* 0x00b90410: add      x23, x8, #1 */ ARM64("add x23, x8, #1");
    /* 0x00b90414: add      x8, x23, x23, lsl #1 */ ARM64("add x8, x23, x23, lsl #1");
    /* 0x00b90418: lsl      x21, x8, #3 */ ARM64("lsl x21, x8, #3");
    /* 0x00b9041c: cbz      x21, #0xb904dc */ if (x21 == 0) goto loc_00b904dc;
    /* 0x00b90420: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b90424: bl       #0xc7ad48 */ CALL_DIRECT(sub_00c7ad48);
    /* 0x00b90428: cbnz     x0, #0xb904e4 */ if (x0 != 0) goto loc_00b904e4;
    /* 0x00b9042c: b        #0xb90ecc */ goto loc_00b90ecc;
loc_00b90430:
    /* 0x00b90430: ldr      x8, [sp, #0x200] */ ARM64("ldr x8, [sp, #0x200]");
    /* 0x00b90434: mov      w23, #0x108 */ ARM64("mov w23, #0x108");
    /* 0x00b90438: cbz      x8, #0xb904d0 */ if (x8 == 0) goto loc_00b904d0;
    /* 0x00b9043c: ldr      x0, [sp, #0x1f0] */ ARM64("ldr x0, [sp, #0x1f0]");
    /* 0x00b90440: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b90444: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b90448: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b9044c: mov      w10, #8 */ ARM64("mov w10, #8");
    /* 0x00b90450: b        #0xb90600 */ goto loc_00b90600;
loc_00b90454:
    /* 0x00b90454: cbz      x23, #0xb90470 */ if (x23 == 0) goto loc_00b90470;
    /* 0x00b90458: ldr      x8, [sp, #0x338] */ ARM64("ldr x8, [sp, #0x338]");
    /* 0x00b9045c: lsl      x9, x23, #3 */ ARM64("lsl x9, x23, #3");
    /* 0x00b90460: add      x9, x9, #0xf */ ARM64("add x9, x9, #0xf");
    /* 0x00b90464: and      x9, x9, #0xfffffffffffffff8 */ ARM64("and x9, x9, #0xfffffffffffffff8");
    /* 0x00b90468: sub      x0, x8, x9 */ ARM64("sub x0, x8, x9");
    /* 0x00b9046c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b90470:
    /* 0x00b90470: mov      x20, #0 */ ARM64("mov x20, #0");
    /* 0x00b90474: ldr      x21, [sp, #0x328] */ ARM64("ldr x21, [sp, #0x328]");
    /* 0x00b90478: ldr      x22, [sp, #0x330] */ ARM64("ldr x22, [sp, #0x330]");
    /* 0x00b9047c: mov      w23, #0x108 */ ARM64("mov w23, #0x108");
loc_00b90480:
    /* 0x00b90480: cmp      x20, x22 */ ARM64("cmp x20, x22");
    /* 0x00b90484: b.eq     #0xb904b8 */ if (COND_EQ) goto loc_00b904b8;
    /* 0x00b90488: add      x8, x21, x20, lsl #4 */ ARM64("add x8, x21, x20, lsl #4");
    /* 0x00b9048c: add      x20, x20, #1 */ ARM64("add x20, x20, #1");
    /* 0x00b90490: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
loc_00b90494:
    /* 0x00b90494: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b90498: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b9049c: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b904a0: cbnz     w11, #0xb90494 */ if (w11 != 0) goto loc_00b90494;
    /* 0x00b904a4: b.ne     #0xb90480 */ if (COND_NE) goto loc_00b90480;
    /* 0x00b904a8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b904ac: ldr      x0, [x8] */ ARM64("ldr x0, [x8]");
    /* 0x00b904b0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b904b4: b        #0xb90480 */ goto loc_00b90480;
loc_00b904b8:
    /* 0x00b904b8: cbz      x24, #0xb904c4 */ if (x24 == 0) goto loc_00b904c4;
    /* 0x00b904bc: ldr      x0, [sp, #0x328] */ ARM64("ldr x0, [sp, #0x328]");
    /* 0x00b904c0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b904c4:
    /* 0x00b904c4: ldur     x8, [x29, #-0xb0] */ ARM64("ldur x8, [x29, #-0xb0]");
    /* 0x00b904c8: cbnz     x8, #0xb8fec4 */ if (x8 != 0) goto loc_00b8fec4;
    /* 0x00b904cc: b        #0xb8fe54 */ goto loc_00b8fe54;
loc_00b904d0:
    /* 0x00b904d0: mov      x9, #0 */ ARM64("mov x9, #0");
    /* 0x00b904d4: mov      w10, #8 */ ARM64("mov w10, #8");
    /* 0x00b904d8: b        #0xb90600 */ goto loc_00b90600;
loc_00b904dc:
    /* 0x00b904dc: mov      x23, #0 */ ARM64("mov x23, #0");
    /* 0x00b904e0: mov      w0, #8 */ ARM64("mov w0, #8");
loc_00b904e4:
    /* 0x00b904e4: ldp      q0, q1, [sp, #0x200] */ ARM64("ldp q0, q1, [sp, #0x200]");
    /* 0x00b904e8: str      q1, [x0] */ ARM64("str q1, [x0]");
    /* 0x00b904ec: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b904f0: str      x8, [x0, #0x10] */ ARM64("str x8, [x0, #0x10]");
    /* 0x00b904f4: ldr      q1, [sp, #0x1f0] */ ARM64("ldr q1, [sp, #0x1f0]");
    /* 0x00b904f8: stp      q1, q0, [sp, #0x210] */ ARM64("stp q1, q0, [sp, #0x210]");
    /* 0x00b904fc: ldr      x22, [sp, #0x228] */ ARM64("ldr x22, [sp, #0x228]");
    /* 0x00b90500: ldr      x20, [sp, #0x218] */ ARM64("ldr x20, [sp, #0x218]");
    /* 0x00b90504: sub      x8, x22, x20 */ ARM64("sub x8, x22, x20");
    /* 0x00b90508: str      x23, [sp, #0x390] */ ARM64("str x23, [sp, #0x390]");
    /* 0x00b9050c: str      x0, [sp, #0x398] */ ARM64("str x0, [sp, #0x398]");
    /* 0x00b90510: str      x26, [sp, #0x3a0] */ ARM64("str x26, [sp, #0x3a0]");
    /* 0x00b90514: sub      x23, x8, #0x10 */ ARM64("sub x23, x8, #0x10");
    /* 0x00b90518: mov      w24, #0x18 */ ARM64("mov w24, #0x18");
    /* 0x00b9051c: str      x0, [sp, #0xc8] */ ARM64("str x0, [sp, #0xc8]");
    /* 0x00b90520: mov      x8, x0 */ ARM64("mov x8, x0");
    /* 0x00b90524: mov      w21, #1 */ ARM64("mov w21, #1");
    /* 0x00b90528: b        #0xb90554 */ goto loc_00b90554;
loc_00b9052c:
    /* 0x00b9052c: ldr      x8, [sp, #0x398] */ ARM64("ldr x8, [sp, #0x398]");
loc_00b90530:
    /* 0x00b90530: add      x9, x8, x24 */ ARM64("add x9, x8, x24");
    /* 0x00b90534: ldr      q0, [sp, #0x160] */ ARM64("ldr q0, [sp, #0x160]");
    /* 0x00b90538: ldr      x10, [sp, #0x170] */ ARM64("ldr x10, [sp, #0x170]");
    /* 0x00b9053c: str      x10, [x9, #0x10] */ ARM64("str x10, [x9, #0x10]");
    /* 0x00b90540: str      q0, [x9] */ ARM64("str q0, [x9]");
    /* 0x00b90544: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b90548: str      x21, [sp, #0x3a0] */ ARM64("str x21, [sp, #0x3a0]");
    /* 0x00b9054c: add      x24, x24, #0x18 */ ARM64("add x24, x24, #0x18");
    /* 0x00b90550: sub      x23, x23, #0x10 */ ARM64("sub x23, x23, #0x10");
loc_00b90554:
    /* 0x00b90554: cmp      x20, x22 */ ARM64("cmp x20, x22");
    /* 0x00b90558: b.eq     #0xb90594 */ if (COND_EQ) goto loc_00b90594;
    /* 0x00b9055c: ldr      x9, [x20], #0x10 */ ARM64("ldr x9, [x20], #0x10");
    /* 0x00b90560: mov      x10, #-0x8000000000000000 */ ARM64("mov x10, #-0x8000000000000000");
    /* 0x00b90564: stp      x10, x9, [sp, #0x160] */ ARM64("stp x10, x9, [sp, #0x160]");
    /* 0x00b90568: ldr      x9, [sp, #0x390] */ ARM64("ldr x9, [sp, #0x390]");
    /* 0x00b9056c: cmp      x21, x9 */ ARM64("cmp x21, x9");
    /* 0x00b90570: b.ne     #0xb90530 */ if (COND_NE) goto loc_00b90530;
    /* 0x00b90574: lsr      x8, x23, #4 */ ARM64("lsr x8, x23, #4");
    /* 0x00b90578: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00b9057c: add      x2, x8, #1 */ ARM64("add x2, x8, #1");
    /* 0x00b90580: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00b90584: mov      w3, #8 */ ARM64("mov w3, #8");
    /* 0x00b90588: mov      w4, #0x18 */ ARM64("mov w4, #0x18");
    /* 0x00b9058c: bl       #0xc6c0cc */ CALL_DIRECT(sub_00c6c0cc);
    /* 0x00b90590: b        #0xb9052c */ goto loc_00b9052c;
loc_00b90594:
    /* 0x00b90594: mov      x21, #0 */ ARM64("mov x21, #0");
    /* 0x00b90598: str      x20, [sp, #0x218] */ ARM64("str x20, [sp, #0x218]");
    /* 0x00b9059c: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00b905a0: sub      x8, x8, x22 */ ARM64("sub x8, x8, x22");
    /* 0x00b905a4: lsr      x22, x8, #4 */ ARM64("lsr x22, x8, #4");
    /* 0x00b905a8: mov      w23, #0x108 */ ARM64("mov w23, #0x108");
loc_00b905ac:
    /* 0x00b905ac: cmp      x21, x22 */ ARM64("cmp x21, x22");
    /* 0x00b905b0: b.eq     #0xb905e4 */ if (COND_EQ) goto loc_00b905e4;
    /* 0x00b905b4: add      x8, x20, x21, lsl #4 */ ARM64("add x8, x20, x21, lsl #4");
    /* 0x00b905b8: add      x21, x21, #1 */ ARM64("add x21, x21, #1");
    /* 0x00b905bc: ldr      x9, [x8] */ ARM64("ldr x9, [x8]");
loc_00b905c0:
    /* 0x00b905c0: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b905c4: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b905c8: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b905cc: cbnz     w11, #0xb905c0 */ if (w11 != 0) goto loc_00b905c0;
    /* 0x00b905d0: b.ne     #0xb905ac */ if (COND_NE) goto loc_00b905ac;
    /* 0x00b905d4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b905d8: ldr      x0, [x8] */ ARM64("ldr x0, [x8]");
    /* 0x00b905dc: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b905e0: b        #0xb905ac */ goto loc_00b905ac;
loc_00b905e4:
    /* 0x00b905e4: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b905e8: cbz      x8, #0xb905f4 */ if (x8 == 0) goto loc_00b905f4;
    /* 0x00b905ec: ldr      x0, [sp, #0x210] */ ARM64("ldr x0, [sp, #0x210]");
    /* 0x00b905f0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b905f4:
    /* 0x00b905f4: ldr      x8, [sp, #0x390] */ ARM64("ldr x8, [sp, #0x390]");
    /* 0x00b905f8: ldr      x10, [sp, #0x398] */ ARM64("ldr x10, [sp, #0x398]");
    /* 0x00b905fc: ldr      x9, [sp, #0x3a0] */ ARM64("ldr x9, [sp, #0x3a0]");
loc_00b90600:
    /* 0x00b90600: ldr      x20, [sp, #0x118] */ ARM64("ldr x20, [sp, #0x118]");
    /* 0x00b90604: str      x10, [sp, #0x238] */ ARM64("str x10, [sp, #0x238]");
    /* 0x00b90608: str      x9, [sp, #0x240] */ ARM64("str x9, [sp, #0x240]");
    /* 0x00b9060c: str      xzr, [sp, #0x248] */ ARM64("str xzr, [sp, #0x248]");
    /* 0x00b90610: str      x28, [sp, #0x250] */ ARM64("str x28, [sp, #0x250]");
    /* 0x00b90614: str      xzr, [sp, #0x258] */ ARM64("str xzr, [sp, #0x258]");
    /* 0x00b90618: strh     w26, [sp, #0x260] */ ARM64("strh w26, [sp, #0x260]");
    /* 0x00b9061c: str      x8, [sp, #0x230] */ ARM64("str x8, [sp, #0x230]");
    /* 0x00b90620: mov      w8, #0xf */ ARM64("mov w8, #0xf");
    /* 0x00b90624: str      x8, [sp, #0x228] */ ARM64("str x8, [sp, #0x228]");
    /* 0x00b90628: ldr      x21, [x19, #0x20] */ ARM64("ldr x21, [x19, #0x20]");
    /* 0x00b9062c: cmp      x21, x20 */ ARM64("cmp x21, x20");
    /* 0x00b90630: b.lo     #0xb90b8c */ if (COND_LO) goto loc_00b90b8c;
    /* 0x00b90634: ldur     x8, [x19, #0x10] */ ARM64("ldur x8, [x19, #0x10]");
    /* 0x00b90638: cmp      x21, x8 */ ARM64("cmp x21, x8");
    /* 0x00b9063c: b.ne     #0xb90648 */ if (COND_NE) goto loc_00b90648;
    /* 0x00b90640: add      x0, x19, #0x10 */ ARM64("add x0, x19, #0x10");
    /* 0x00b90644: bl       #0xc6c42c */ CALL_DIRECT(sub_00c6c42c);
loc_00b90648:
    /* 0x00b90648: ldr      x8, [x19, #0x18] */ ARM64("ldr x8, [x19, #0x18]");
    /* 0x00b9064c: madd     x26, x20, x23, x8 */ ARM64("madd x26, x20, x23, x8");
    /* 0x00b90650: subs     x8, x21, x20 */ ARM64("subs x8, x21, x20");
    /* 0x00b90654: b.ls     #0xb8fea0 */ if (COND_LS) goto loc_00b8fea0;
    /* 0x00b90658: add      x8, x8, x8, lsl #5 */ ARM64("add x8, x8, x8, lsl #5");
    /* 0x00b9065c: lsl      x2, x8, #3 */ ARM64("lsl x2, x8, #3");
    /* 0x00b90660: add      x0, x26, #0x108 */ ARM64("add x0, x26, #0x108");
    /* 0x00b90664: mov      x1, x26 */ ARM64("mov x1, x26");
    /* 0x00b90668: bl       #0xc7ad78 */ CALL_DIRECT(sub_00c7ad78);
    /* 0x00b9066c: b        #0xb8fea0 */ goto loc_00b8fea0;
loc_00b90670:
    /* 0x00b90670: mov      x21, x0 */ ARM64("mov x21, x0");
loc_00b90674:
    /* 0x00b90674: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b90678: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b9067c:
    /* 0x00b9067c: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b90680: bl       #0xb86c48 */ CALL_DIRECT(sub_00b86c48);
loc_00b90684:
    /* 0x00b90684: ldxrb    w8, [x27] */ ARM64("ldxrb w8, [x27]");
    /* 0x00b90688: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b9068c: b.ne     #0xb906d4 */ if (COND_NE) goto loc_00b906d4;
    /* 0x00b90690: stlxrb   w8, wzr, [x27] */ ARM64("stlxrb w8, wzr, [x27]");
    /* 0x00b90694: cbnz     w8, #0xb90684 */ if (w8 != 0) goto loc_00b90684;
loc_00b90698:
    /* 0x00b90698: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b9069c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b906a0: stlxr    w9, x8, [x19] */ ARM64("stlxr w9, x8, [x19]");
    /* 0x00b906a4: cbnz     w9, #0xb90698 */ if (w9 != 0) goto loc_00b90698;
    /* 0x00b906a8: b.ne     #0xb906b8 */ if (COND_NE) goto loc_00b906b8;
    /* 0x00b906ac: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b906b0: add      x0, sp, #0x1c8 */ ARM64("add x0, sp, #0x1c8");
    /* 0x00b906b4: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b906b8:
    /* 0x00b906b8: ldr      x8, [sp, #0x428] */ ARM64("ldr x8, [sp, #0x428]");
    /* 0x00b906bc: cbnz     x8, #0xb8fd90 */ if (x8 != 0) goto loc_00b8fd90;
    /* 0x00b906c0: b        #0xb90730 */ goto loc_00b90730;
loc_00b906c4:
    /* 0x00b906c4: clrex     */ ARM64("clrex");
loc_00b906c8:
    /* 0x00b906c8: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b906cc: bl       #0xc7573c */ CALL_DIRECT(sub_00c7573c);
    /* 0x00b906d0: b        #0xb8fe28 */ goto loc_00b8fe28;
loc_00b906d4:
    /* 0x00b906d4: clrex     */ ARM64("clrex");
    /* 0x00b906d8: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b906dc: bl       #0xc75418 */ CALL_DIRECT(sub_00c75418);
    /* 0x00b906e0: b        #0xb90698 */ goto loc_00b90698;
loc_00b906e4:
    /* 0x00b906e4: mov      x28, #0 */ ARM64("mov x28, #0");
loc_00b906e8:
    /* 0x00b906e8: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b906ec: ldr      x1, [sp, #0xc8] */ ARM64("ldr x1, [sp, #0xc8]");
    /* 0x00b906f0: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b906f4: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b906f8:
    /* 0x00b906f8: adrp     x0, #0xefc000 */ ARM64("adrp x0, #0xefc000");
    /* 0x00b906fc: add      x0, x0, #0x6c8 */ ARM64("add x0, x0, #0x6c8");
    /* 0x00b90700: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90704: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90708:
    /* 0x00b90708: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00b9070c:
    /* 0x00b9070c: ldr      x1, [sp, #0x28] */ ARM64("ldr x1, [sp, #0x28]");
    /* 0x00b90710: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b90714: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90718: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b9071c:
    /* 0x00b9071c: add      x8, sp, #0x3f0 */ ARM64("add x8, sp, #0x3f0");
    /* 0x00b90720: str      x8, [sp, #0x320] */ ARM64("str x8, [sp, #0x320]");
    /* 0x00b90724: add      x1, sp, #0x320 */ ARM64("add x1, sp, #0x320");
    /* 0x00b90728: ldr      x9, [sp, #0xb8] */ ARM64("ldr x9, [sp, #0xb8]");
    /* 0x00b9072c: b        #0xb90804 */ goto loc_00b90804;
loc_00b90730:
    /* 0x00b90730: mov      w26, #0 */ ARM64("mov w26, #0");
    /* 0x00b90734: add      x0, sp, #0x3f0 */ ARM64("add x0, sp, #0x3f0");
    /* 0x00b90738: bl       #0xb866a8 */ CALL_DIRECT(sub_00b866a8);
    /* 0x00b9073c: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00b90740: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b90744: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00b90748: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b9074c: ccmn     x9, #0x11, #4, ne */ ARM64("ccmn x9, #0x11, #4, ne");
    /* 0x00b90750: b.eq     #0xb90764 */ if (COND_EQ) goto loc_00b90764;
    /* 0x00b90754: ldr      x9, [sp, #0x120] */ ARM64("ldr x9, [sp, #0x120]");
    /* 0x00b90758: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b9075c: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b90760: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b90764:
    /* 0x00b90764: ldr      x19, [x25, #0x80] */ ARM64("ldr x19, [x25, #0x80]");
    /* 0x00b90768: cbz      x19, #0xb90850 */ if (x19 == 0) goto loc_00b90850;
    /* 0x00b9076c: ldr      x20, [x25, #0x90] */ ARM64("ldr x20, [x25, #0x90]");
    /* 0x00b90770: cbz      x20, #0xb90830 */ if (x20 == 0) goto loc_00b90830;
    /* 0x00b90774: ldr      x21, [x25, #0x78] */ ARM64("ldr x21, [x25, #0x78]");
    /* 0x00b90778: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00b9077c: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b90780: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b90784: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b90788: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00b9078c: b        #0xb90794 */ goto loc_00b90794;
loc_00b90790:
    /* 0x00b90790: cbz      x20, #0xb90830 */ if (x20 == 0) goto loc_00b90830;
loc_00b90794:
    /* 0x00b90794: cbnz     x23, #0xb907b0 */ if (x23 != 0) goto loc_00b907b0;
loc_00b90798:
    /* 0x00b90798: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b9079c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b907a0: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b907a4: sub      x21, x21, #0x80 */ ARM64("sub x21, x21, #0x80");
    /* 0x00b907a8: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00b907ac: cbz      x23, #0xb90798 */ if (x23 == 0) goto loc_00b90798;
loc_00b907b0:
    /* 0x00b907b0: sub      x8, x23, #1 */ ARM64("sub x8, x23, #1");
    /* 0x00b907b4: rbit     x9, x23 */ ARM64("rbit x9, x23");
    /* 0x00b907b8: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b907bc: and      x23, x8, x23 */ ARM64("and x23, x8, x23");
    /* 0x00b907c0: lsl      x8, x9, #1 */ ARM64("lsl x8, x9, #1");
    /* 0x00b907c4: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00b907c8: sub      x0, x21, x8 */ ARM64("sub x0, x21, x8");
    /* 0x00b907cc: sub      x20, x20, #1 */ ARM64("sub x20, x20, #1");
    /* 0x00b907d0: ldr      x8, [x0, #-0x10]! */ ARM64("ldr x8, [x0, #-0x10]!");
loc_00b907d4:
    /* 0x00b907d4: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b907d8: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b907dc: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b907e0: cbnz     w10, #0xb907d4 */ if (w10 != 0) goto loc_00b907d4;
    /* 0x00b907e4: b.ne     #0xb90790 */ if (COND_NE) goto loc_00b90790;
    /* 0x00b907e8: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b907ec: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b907f0: b        #0xb90790 */ goto loc_00b90790;
loc_00b907f4:
    /* 0x00b907f4: add      x8, sp, #0x3f0 */ ARM64("add x8, sp, #0x3f0");
    /* 0x00b907f8: str      x8, [sp, #0x320] */ ARM64("str x8, [sp, #0x320]");
    /* 0x00b907fc: add      x1, sp, #0x320 */ ARM64("add x1, sp, #0x320");
    /* 0x00b90800: ldr      x9, [sp, #0xb0] */ ARM64("ldr x9, [sp, #0xb0]");
loc_00b90804:
    /* 0x00b90804: adrp     x8, #0xbef000 */ ARM64("adrp x8, #0xbef000");
    /* 0x00b90808: add      x8, x8, #0x1c8 */ ARM64("add x8, x8, #0x1c8");
    /* 0x00b9080c: stp      x8, x9, [x1, #8] */ ARM64("stp x8, x9, [x1, #8]");
    /* 0x00b90810: str      x8, [x1, #0x18] */ ARM64("str x8, [x1, #0x18]");
    /* 0x00b90814: adrp     x0, #0xcb9000 */ ARM64("adrp x0, #0xcb9000");
    /* 0x00b90818: add      x0, x0, #0xf36 */ ARM64("add x0, x0, #0xf36");
    /* 0x00b9081c: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b90820: add      x2, x2, #0x830 */ ARM64("add x2, x2, #0x830");
    /* 0x00b90824: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b90828: bl       #0xc73b38 */ CALL_DIRECT(sub_00c73b38);
    /* 0x00b9082c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90830:
    /* 0x00b90830: lsl      x8, x19, #4 */ ARM64("lsl x8, x19, #4");
    /* 0x00b90834: add      x9, x8, x19 */ ARM64("add x9, x8, x19");
    /* 0x00b90838: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b9083c: b.eq     #0xb90850 */ if (COND_EQ) goto loc_00b90850;
    /* 0x00b90840: ldr      x9, [x25, #0x78] */ ARM64("ldr x9, [x25, #0x78]");
    /* 0x00b90844: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b90848: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b9084c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b90850:
    /* 0x00b90850: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b90854: bl       #0xb92b0c */ CALL_DIRECT(sub_00b92b0c);
    /* 0x00b90858: add      sp, sp, #0x510 */ ARM64("add sp, sp, #0x510");
    /* 0x00b9085c: ldp      x29, x30, [sp, #0x50] */ ARM64("ldp x29, x30, [sp, #0x50]");
    /* 0x00b90860: ldp      x20, x19, [sp, #0x40] */ ARM64("ldp x20, x19, [sp, #0x40]");
    /* 0x00b90864: ldp      x22, x21, [sp, #0x30] */ ARM64("ldp x22, x21, [sp, #0x30]");
    /* 0x00b90868: ldp      x24, x23, [sp, #0x20] */ ARM64("ldp x24, x23, [sp, #0x20]");
    /* 0x00b9086c: ldp      x26, x25, [sp, #0x10] */ ARM64("ldp x26, x25, [sp, #0x10]");
    /* 0x00b90870: ldp      x28, x27, [sp], #0x60 */ ARM64("ldp x28, x27, [sp], #0x60");
    /* 0x00b90874: ret       */ return;
loc_00b90878:
    /* 0x00b90878: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b9087c: add      x0, x0, #0x220 */ ARM64("add x0, x0, #0x220");
    /* 0x00b90880: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90884: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90888:
    /* 0x00b90888: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b9088c: add      x0, x0, #0xe0 */ ARM64("add x0, x0, #0xe0");
    /* 0x00b90890: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90894: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90898:
    /* 0x00b90898: mov      x8, x12 */ ARM64("mov x8, x12");
loc_00b9089c:
    /* 0x00b9089c: mov      x0, x9 */ ARM64("mov x0, x9");
    /* 0x00b908a0: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b908a4: mov      x2, x8 */ ARM64("mov x2, x8");
    /* 0x00b908a8: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b908ac: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b908b0:
    /* 0x00b908b0: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b908b4: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b908b8: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b908bc: b        #0xb8ceb4 */ goto loc_00b8ceb4;
loc_00b908c0:
    /* 0x00b908c0: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b908c4: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b908c8: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b908cc: b        #0xb8d718 */ goto loc_00b8d718;
loc_00b908d0:
    /* 0x00b908d0: add      x20, sp, #0x210 */ ARM64("add x20, sp, #0x210");
    /* 0x00b908d4: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b908d8: add      x2, x20, #0x20 */ ARM64("add x2, x20, #0x20");
    /* 0x00b908dc: mov      x1, x19 */ ARM64("mov x1, x19");
    /* 0x00b908e0: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00b908e4: mov      x22, #0 */ ARM64("mov x22, #0");
    /* 0x00b908e8: mov      x23, #0x6573 */ ARM64("mov x23, #0x6573");
    /* 0x00b908ec: movk     x23, #0x7974, lsl #16 */ ARM64("movk x23, #0x7974, lsl #16");
    /* 0x00b908f0: movk     x23, #0x6462, lsl #32 */ ARM64("movk x23, #0x6462, lsl #32");
    /* 0x00b908f4: movk     x23, #0x7465, lsl #48 */ ARM64("movk x23, #0x7465, lsl #48");
    /* 0x00b908f8: mov      x24, #0x6575 */ ARM64("mov x24, #0x6575");
    /* 0x00b908fc: movk     x24, #0x7073, lsl #16 */ ARM64("movk x24, #0x7073, lsl #16");
    /* 0x00b90900: movk     x24, #0x6d65, lsl #32 */ ARM64("movk x24, #0x6d65, lsl #32");
    /* 0x00b90904: movk     x24, #0x736f, lsl #48 */ ARM64("movk x24, #0x736f, lsl #48");
    /* 0x00b90908: mov      x25, #0x7261 */ ARM64("mov x25, #0x7261");
    /* 0x00b9090c: movk     x25, #0x6e65, lsl #16 */ ARM64("movk x25, #0x6e65, lsl #16");
    /* 0x00b90910: movk     x25, #0x6765, lsl #32 */ ARM64("movk x25, #0x6765, lsl #32");
    /* 0x00b90914: movk     x25, #0x6c79, lsl #48 */ ARM64("movk x25, #0x6c79, lsl #48");
    /* 0x00b90918: mov      x26, #0x6f6d */ ARM64("mov x26, #0x6f6d");
    /* 0x00b9091c: movk     x26, #0x6e64, lsl #16 */ ARM64("movk x26, #0x6e64, lsl #16");
    /* 0x00b90920: movk     x26, #0x7261, lsl #32 */ ARM64("movk x26, #0x7261, lsl #32");
    /* 0x00b90924: movk     x26, #0x646f, lsl #48 */ ARM64("movk x26, #0x646f, lsl #48");
    /* 0x00b90928: b        #0xb909d8 */ goto loc_00b909d8;
loc_00b9092c:
    /* 0x00b9092c: and      x14, x14, x12 */ ARM64("and x14, x14, x12");
    /* 0x00b90930: ldr      d1, [x9, x14] */ ARM64("ldr d1, [x9, x14]");
    /* 0x00b90934: cmeq     v2.8b, v1.8b, v0.8b */ ARM64("cmeq v2.8b, v1.8b, v0.8b");
    /* 0x00b90938: fmov     x15, d2 */ ARM64("fmov x15, d2");
    /* 0x00b9093c: ands     x15, x15, #-0x7f7f7f7f7f7f7f80 */ ARM64("ands x15, x15, #-0x7f7f7f7f7f7f7f80");
    /* 0x00b90940: b.eq     #0xb90970 */ if (COND_EQ) goto loc_00b90970;
loc_00b90944:
    /* 0x00b90944: rbit     x16, x15 */ ARM64("rbit x16, x15");
    /* 0x00b90948: clz      x16, x16 */ ARM64("clz x16, x16");
    /* 0x00b9094c: add      x16, x14, x16, lsr #3 */ ARM64("add x16, x14, x16, lsr #3");
    /* 0x00b90950: and      x16, x16, x12 */ ARM64("and x16, x16, x12");
    /* 0x00b90954: sub      x17, x9, x16, lsl #4 */ ARM64("sub x17, x9, x16, lsl #4");
    /* 0x00b90958: ldur     w17, [x17, #-0x10] */ ARM64("ldur w17, [x17, #-0x10]");
    /* 0x00b9095c: cmp      w27, w17 */ ARM64("cmp w27, w17");
    /* 0x00b90960: b.eq     #0xb909bc */ if (COND_EQ) goto loc_00b909bc;
    /* 0x00b90964: sub      x16, x15, #1 */ ARM64("sub x16, x15, #1");
    /* 0x00b90968: ands     x15, x16, x15 */ ARM64("ands x15, x16, x15");
    /* 0x00b9096c: b.ne     #0xb90944 */ if (COND_NE) goto loc_00b90944;
loc_00b90970:
    /* 0x00b90970: cmp      x11, #1 */ ARM64("cmp x11, #1");
    /* 0x00b90974: b.eq     #0xb90994 */ if (COND_EQ) goto loc_00b90994;
    /* 0x00b90978: cmlt     v2.8b, v1.8b, #0 */ ARM64("cmlt v2.8b, v1.8b, #0");
    /* 0x00b9097c: fmov     x11, d2 */ ARM64("fmov x11, d2");
    /* 0x00b90980: cbz      x11, #0xb909b0 */ if (x11 == 0) goto loc_00b909b0;
    /* 0x00b90984: rbit     x11, x11 */ ARM64("rbit x11, x11");
    /* 0x00b90988: clz      x11, x11 */ ARM64("clz x11, x11");
    /* 0x00b9098c: add      x11, x14, x11, lsr #3 */ ARM64("add x11, x14, x11, lsr #3");
    /* 0x00b90990: and      x13, x11, x12 */ ARM64("and x13, x11, x12");
loc_00b90994:
    /* 0x00b90994: movi     v2.2d, #0xffffffffffffffff */ ARM64("movi v2.2d, #0xffffffffffffffff");
    /* 0x00b90998: cmeq     v1.8b, v1.8b, v2.8b */ ARM64("cmeq v1.8b, v1.8b, v2.8b");
    /* 0x00b9099c: umaxv    b1, v1.8b */ ARM64("umaxv b1, v1.8b");
    /* 0x00b909a0: fmov     w11, s1 */ ARM64("fmov w11, s1");
    /* 0x00b909a4: tbnz     w11, #0, #0xb90ad0 */ if (((w11 >> #0) & 1) != 0) goto loc_00b90ad0;
    /* 0x00b909a8: mov      w11, #1 */ ARM64("mov w11, #1");
    /* 0x00b909ac: b        #0xb909b0 */ goto loc_00b909b0;
loc_00b909b0:
    /* 0x00b909b0: add      x8, x8, #8 */ ARM64("add x8, x8, #8");
    /* 0x00b909b4: add      x14, x8, x14 */ ARM64("add x14, x8, x14");
    /* 0x00b909b8: b        #0xb9092c */ goto loc_00b9092c;
loc_00b909bc:
    /* 0x00b909bc: neg      x8, x16 */ ARM64("neg x8, x16");
    /* 0x00b909c0: mov      w27, #0 */ ARM64("mov w27, #0");
    /* 0x00b909c4: add      x8, x9, x8, lsl #4 */ ARM64("add x8, x9, x8, lsl #4");
    /* 0x00b909c8: stur     x22, [x8, #-8] */ ARM64("stur x22, [x8, #-8]");
    /* 0x00b909cc: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b909d0: cmp      x22, x0 */ ARM64("cmp x22, x0");
    /* 0x00b909d4: b.eq     #0xb8d740 */ if (COND_EQ) goto loc_00b8d740;
loc_00b909d8:
    /* 0x00b909d8: ldr      x8, [sp, #0x108] */ ARM64("ldr x8, [sp, #0x108]");
    /* 0x00b909dc: ldr      w27, [x8, x22, lsl #2] */ ARM64("ldr w27, [x8, x22, lsl #2]");
    /* 0x00b909e0: ldr      x21, [sp, #0x238] */ ARM64("ldr x21, [sp, #0x238]");
    /* 0x00b909e4: ldr      x28, [sp, #0x230] */ ARM64("ldr x28, [sp, #0x230]");
    /* 0x00b909e8: ldr      x8, [sp, #0x220] */ ARM64("ldr x8, [sp, #0x220]");
    /* 0x00b909ec: cbz      x8, #0xb90b2c */ if (x8 == 0) goto loc_00b90b2c;
loc_00b909f0:
    /* 0x00b909f0: mov      x11, #0 */ ARM64("mov x11, #0");
    /* 0x00b909f4: mov      x8, #0 */ ARM64("mov x8, #0");
    /* 0x00b909f8: eor      x9, x28, x24 */ ARM64("eor x9, x28, x24");
    /* 0x00b909fc: eor      x10, x21, x26 */ ARM64("eor x10, x21, x26");
    /* 0x00b90a00: eor      x12, x28, x25 */ ARM64("eor x12, x28, x25");
    /* 0x00b90a04: orr      x13, x27, #0x400000000000000 */ ARM64("orr x13, x27, #0x400000000000000");
    /* 0x00b90a08: eor      x14, x21, x23 */ ARM64("eor x14, x21, x23");
    /* 0x00b90a0c: eor      x14, x14, x13 */ ARM64("eor x14, x14, x13");
    /* 0x00b90a10: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b90a14: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b90a18: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b90a1c: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b90a20: eor      x14, x12, x14, ror #48 */ ARM64("eor x14, x12, x14, ror #48");
    /* 0x00b90a24: add      x12, x12, x10 */ ARM64("add x12, x12, x10");
    /* 0x00b90a28: add      x9, x14, x9 */ ARM64("add x9, x14, x9");
    /* 0x00b90a2c: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b90a30: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b90a34: eor      x14, x9, x14, ror #43 */ ARM64("eor x14, x9, x14, ror #43");
    /* 0x00b90a38: eor      x9, x9, x13 */ ARM64("eor x9, x9, x13");
    /* 0x00b90a3c: eor      x12, x12, #0xff */ ARM64("eor x12, x12, #0xff");
    /* 0x00b90a40: add      x9, x9, x10 */ ARM64("add x9, x9, x10");
    /* 0x00b90a44: add      x12, x14, x12 */ ARM64("add x12, x14, x12");
    /* 0x00b90a48: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b90a4c: eor      x13, x12, x14, ror #48 */ ARM64("eor x13, x12, x14, ror #48");
    /* 0x00b90a50: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b90a54: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b90a58: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b90a5c: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b90a60: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b90a64: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b90a68: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b90a6c: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b90a70: eor      x10, x9, x10, ror #51 */ ARM64("eor x10, x9, x10, ror #51");
    /* 0x00b90a74: eor      x13, x12, x13, ror #48 */ ARM64("eor x13, x12, x13, ror #48");
    /* 0x00b90a78: ror      x9, x9, #0x20 */ ARM64("ror x9, x9, #0x20");
    /* 0x00b90a7c: add      x12, x10, x12 */ ARM64("add x12, x10, x12");
    /* 0x00b90a80: add      x9, x13, x9 */ ARM64("add x9, x13, x9");
    /* 0x00b90a84: eor      x10, x12, x10, ror #47 */ ARM64("eor x10, x12, x10, ror #47");
    /* 0x00b90a88: eor      x13, x9, x13, ror #43 */ ARM64("eor x13, x9, x13, ror #43");
    /* 0x00b90a8c: ror      x12, x12, #0x20 */ ARM64("ror x12, x12, #0x20");
    /* 0x00b90a90: add      x9, x10, x9 */ ARM64("add x9, x10, x9");
    /* 0x00b90a94: add      x12, x13, x12 */ ARM64("add x12, x13, x12");
    /* 0x00b90a98: eor      x9, x9, x10, ror #51 */ ARM64("eor x9, x9, x10, ror #51");
    /* 0x00b90a9c: eor      x10, x12, x13, ror #48 */ ARM64("eor x10, x12, x13, ror #48");
    /* 0x00b90aa0: add      x12, x9, x12 */ ARM64("add x12, x9, x12");
    /* 0x00b90aa4: ror      x10, x10, #0x2b */ ARM64("ror x10, x10, #0x2b");
    /* 0x00b90aa8: eor      x9, x10, x9, ror #47 */ ARM64("eor x9, x10, x9, ror #47");
    /* 0x00b90aac: eor      x9, x9, x12, ror #32 */ ARM64("eor x9, x9, x12, ror #32");
    /* 0x00b90ab0: eor      x14, x9, x12 */ ARM64("eor x14, x9, x12");
    /* 0x00b90ab4: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b90ab8: ldr      x12, [sp, #0x218] */ ARM64("ldr x12, [sp, #0x218]");
    /* 0x00b90abc: lsr      x10, x14, #0x39 */ ARM64("lsr x10, x14, #0x39");
    /* 0x00b90ac0: dup      v0.8b, w10 */ ARM64("dup v0.8b, w10");
    /* 0x00b90ac4: ldr      x28, [sp, #0xd8] */ ARM64("ldr x28, [sp, #0xd8]");
    /* 0x00b90ac8: ldr      x0, [sp, #0x118] */ ARM64("ldr x0, [sp, #0x118]");
    /* 0x00b90acc: b        #0xb9092c */ goto loc_00b9092c;
loc_00b90ad0:
    /* 0x00b90ad0: ldrsb    w8, [x9, x13] */ ARM64("ldrsb w8, [x9, x13]");
    /* 0x00b90ad4: tbz      w8, #0x1f, #0xb90b40 */ if (((w8 >> #0x1f) & 1) == 0) goto loc_00b90b40;
loc_00b90ad8:
    /* 0x00b90ad8: and      x8, x8, #1 */ ARM64("and x8, x8, #1");
    /* 0x00b90adc: sub      x11, x13, #8 */ ARM64("sub x11, x13, #8");
    /* 0x00b90ae0: strb     w10, [x9, x13] */ ARM64("strb w10, [x9, x13]");
    /* 0x00b90ae4: and      x11, x12, x11 */ ARM64("and x11, x12, x11");
    /* 0x00b90ae8: add      x11, x9, x11 */ ARM64("add x11, x9, x11");
    /* 0x00b90aec: strb     w10, [x11, #8] */ ARM64("strb w10, [x11, #8]");
    /* 0x00b90af0: movi     v0.2d, #0xffffffffffffffff */ ARM64("movi v0.2d, #0xffffffffffffffff");
    /* 0x00b90af4: mov      v0.d[0], x8 */ ARM64("mov v0.d[0], x8");
    /* 0x00b90af8: ldr      q1, [sp, #0x220] */ ARM64("ldr q1, [sp, #0x220]");
    /* 0x00b90afc: sub      v0.2d, v1.2d, v0.2d */ ARM64("sub v0.2d, v1.2d, v0.2d");
    /* 0x00b90b00: str      q0, [sp, #0x220] */ ARM64("str q0, [sp, #0x220]");
    /* 0x00b90b04: neg      x8, x13 */ ARM64("neg x8, x13");
    /* 0x00b90b08: sub      x10, x9, x13, lsl #4 */ ARM64("sub x10, x9, x13, lsl #4");
    /* 0x00b90b0c: stur     w27, [x10, #-0x10] */ ARM64("stur w27, [x10, #-0x10]");
    /* 0x00b90b10: mov      w27, #0 */ ARM64("mov w27, #0");
    /* 0x00b90b14: add      x8, x9, x8, lsl #4 */ ARM64("add x8, x9, x8, lsl #4");
    /* 0x00b90b18: stur     x22, [x8, #-8] */ ARM64("stur x22, [x8, #-8]");
    /* 0x00b90b1c: add      x22, x22, #1 */ ARM64("add x22, x22, #1");
    /* 0x00b90b20: cmp      x22, x0 */ ARM64("cmp x22, x0");
    /* 0x00b90b24: b.ne     #0xb909d8 */ if (COND_NE) goto loc_00b909d8;
    /* 0x00b90b28: b        #0xb8d740 */ goto loc_00b8d740;
loc_00b90b2c:
    /* 0x00b90b2c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b90b30: add      x2, x20, #0x20 */ ARM64("add x2, x20, #0x20");
    /* 0x00b90b34: mov      w1, #1 */ ARM64("mov w1, #1");
    /* 0x00b90b38: bl       #0xc6db3c */ CALL_DIRECT(sub_00c6db3c);
    /* 0x00b90b3c: b        #0xb909f0 */ goto loc_00b909f0;
loc_00b90b40:
    /* 0x00b90b40: ldr      d0, [x9] */ ARM64("ldr d0, [x9]");
    /* 0x00b90b44: cmlt     v0.8b, v0.8b, #0 */ ARM64("cmlt v0.8b, v0.8b, #0");
    /* 0x00b90b48: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b90b4c: rbit     x8, x8 */ ARM64("rbit x8, x8");
    /* 0x00b90b50: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b90b54: lsr      x13, x8, #3 */ ARM64("lsr x13, x8, #3");
    /* 0x00b90b58: ldrb     w8, [x9, x13] */ ARM64("ldrb w8, [x9, x13]");
    /* 0x00b90b5c: b        #0xb90ad8 */ goto loc_00b90ad8;
loc_00b90b60:
    /* 0x00b90b60: adrp     x0, #0xe0a000 */ ARM64("adrp x0, #0xe0a000");
    /* 0x00b90b64: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00b90b68: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b90b6c: add      x2, x2, #0x928 */ ARM64("add x2, x2, #0x928");
    /* 0x00b90b70: mov      w1, #0x9e */ ARM64("mov w1, #0x9e");
    /* 0x00b90b74: bl       #0xc73d34 */ CALL_DIRECT(sub_00c73d34);
    /* 0x00b90b78: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90b7c:
    /* 0x00b90b7c: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b90b80: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b90b84: bl       #0xc73644 */ CALL_DIRECT(sub_00c73644);
    /* 0x00b90b88: b        #0xb8e210 */ goto loc_00b8e210;
loc_00b90b8c:
    /* 0x00b90b8c: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90b90: add      x2, x2, #0x1a8 */ ARM64("add x2, x2, #0x1a8");
    /* 0x00b90b94: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b90b98: mov      x1, x21 */ ARM64("mov x1, x21");
    /* 0x00b90b9c: bl       #0xc6bb08 */ CALL_DIRECT(sub_00c6bb08);
    /* 0x00b90ba0: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90ba4:
    /* 0x00b90ba4: mov      x9, x4 */ ARM64("mov x9, x4");
    /* 0x00b90ba8: b        #0xb9089c */ goto loc_00b9089c;
loc_00b90bac:
    /* 0x00b90bac: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00b90bb0: add      x0, x0, #0xc48 */ ARM64("add x0, x0, #0xc48");
    /* 0x00b90bb4: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90bb8: add      x2, x2, #0xc80 */ ARM64("add x2, x2, #0xc80");
    /* 0x00b90bbc: mov      w1, #0x35 */ ARM64("mov w1, #0x35");
    /* 0x00b90bc0: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00b90bc4: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90bc8:
    /* 0x00b90bc8: adrp     x3, #0xef8000 */ ARM64("adrp x3, #0xef8000");
    /* 0x00b90bcc: add      x3, x3, #0xdb8 */ ARM64("add x3, x3, #0xdb8");
    /* 0x00b90bd0: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b90bd4: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b90bd8: mov      w2, #0xb */ ARM64("mov w2, #0xb");
    /* 0x00b90bdc: bl       #0xc73bb0 */ CALL_DIRECT(sub_00c73bb0);
    /* 0x00b90be0: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90be4:
    /* 0x00b90be4: adrp     x3, #0xef8000 */ ARM64("adrp x3, #0xef8000");
    /* 0x00b90be8: add      x3, x3, #0xc98 */ ARM64("add x3, x3, #0xc98");
    /* 0x00b90bec: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b90bf0: mov      w2, #0xc */ ARM64("mov w2, #0xc");
    /* 0x00b90bf4: bl       #0xc73bb0 */ CALL_DIRECT(sub_00c73bb0);
    /* 0x00b90bf8: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90bfc:
    /* 0x00b90bfc: bl       #0xc769bc */ CALL_DIRECT(sub_00c769bc);
loc_00b90c00:
    /* 0x00b90c00: mov      w11, #2 */ ARM64("mov w11, #2");
    /* 0x00b90c04: mov      w14, #-1 */ ARM64("mov w14, #-1");
    /* 0x00b90c08: b        #0xb90d98 */ goto loc_00b90d98;
loc_00b90c0c:
    /* 0x00b90c0c: mov      x9, x4 */ ARM64("mov x9, x4");
    /* 0x00b90c10: mov      x8, x14 */ ARM64("mov x8, x14");
    /* 0x00b90c14: b        #0xb9089c */ goto loc_00b9089c;
loc_00b90c18:
    /* 0x00b90c18: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b90c1c: add      x0, x0, #0x1c0 */ ARM64("add x0, x0, #0x1c0");
    /* 0x00b90c20: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90c24: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90c28:
    /* 0x00b90c28: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90c2c: mov      w1, #0x3e0 */ ARM64("mov w1, #0x3e0");
    /* 0x00b90c30: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b90c34: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90c38:
    /* 0x00b90c38: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00b90c3c: add      x0, x0, #0xc7d */ ARM64("add x0, x0, #0xc7d");
    /* 0x00b90c40: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90c44: add      x2, x2, #0xcf8 */ ARM64("add x2, x2, #0xcf8");
    /* 0x00b90c48: mov      w1, #0x28 */ ARM64("mov w1, #0x28");
    /* 0x00b90c4c: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00b90c50: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90c54:
    /* 0x00b90c54: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b90c58: add      x8, x8, #0x6b0 */ ARM64("add x8, x8, #0x6b0");
    /* 0x00b90c5c: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
    /* 0x00b90c60: mov      x27, x28 */ ARM64("mov x27, x28");
loc_00b90c64:
    /* 0x00b90c64: mov      x0, x27 */ ARM64("mov x0, x27");
    /* 0x00b90c68: mov      x1, x19 */ ARM64("mov x1, x19");
    /* 0x00b90c6c: ldr      x2, [sp, #0x78] */ ARM64("ldr x2, [sp, #0x78]");
    /* 0x00b90c70: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90c74: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90c78:
    /* 0x00b90c78: adrp     x3, #0xef8000 */ ARM64("adrp x3, #0xef8000");
    /* 0x00b90c7c: add      x3, x3, #0xdb8 */ ARM64("add x3, x3, #0xdb8");
    /* 0x00b90c80: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b90c84: mov      x1, x22 */ ARM64("mov x1, x22");
    /* 0x00b90c88: mov      w2, #0xb */ ARM64("mov w2, #0xb");
    /* 0x00b90c8c: bl       #0xc73bb0 */ CALL_DIRECT(sub_00c73bb0);
    /* 0x00b90c90: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90c94:
    /* 0x00b90c94: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90c98: mov      w1, #0x380 */ ARM64("mov w1, #0x380");
    /* 0x00b90c9c: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b90ca0: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90ca4:
    /* 0x00b90ca4: adrp     x0, #0xe09000 */ ARM64("adrp x0, #0xe09000");
    /* 0x00b90ca8: add      x0, x0, #0xca5 */ ARM64("add x0, x0, #0xca5");
    /* 0x00b90cac: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90cb0: add      x2, x2, #0xde8 */ ARM64("add x2, x2, #0xde8");
    /* 0x00b90cb4: mov      w1, #0x20 */ ARM64("mov w1, #0x20");
    /* 0x00b90cb8: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00b90cbc: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90cc0:
    /* 0x00b90cc0: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90cc4: mov      w1, #0x380 */ ARM64("mov w1, #0x380");
    /* 0x00b90cc8: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b90ccc: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90cd0:
    /* 0x00b90cd0: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b90cd4: b        #0xb90ce4 */ goto loc_00b90ce4;
loc_00b90cd8:
    /* 0x00b90cd8: adrp     x8, #0xefc000 */ ARM64("adrp x8, #0xefc000");
    /* 0x00b90cdc: add      x8, x8, #0x8c8 */ ARM64("add x8, x8, #0x8c8");
    /* 0x00b90ce0: str      x8, [sp, #0xf0] */ ARM64("str x8, [sp, #0xf0]");
loc_00b90ce4:
    /* 0x00b90ce4: ldr      x1, [sp, #0x118] */ ARM64("ldr x1, [sp, #0x118]");
    /* 0x00b90ce8: ldr      x2, [sp, #0xf0] */ ARM64("ldr x2, [sp, #0xf0]");
    /* 0x00b90cec: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90cf0: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90cf4:
    /* 0x00b90cf4: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b90cf8: add      x0, x0, #0xd10 */ ARM64("add x0, x0, #0xd10");
    /* 0x00b90cfc: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90d00: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d04:
    /* 0x00b90d04: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90d08: mov      w1, #0x3e0 */ ARM64("mov w1, #0x3e0");
    /* 0x00b90d0c: bl       #0xc6ba70 */ CALL_DIRECT(sub_00c6ba70);
    /* 0x00b90d10: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d14:
    /* 0x00b90d14: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b90d18: add      x0, x0, #0xc68 */ ARM64("add x0, x0, #0xc68");
    /* 0x00b90d1c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90d20: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d24:
    /* 0x00b90d24: adrp     x8, #0xe09000 */ ARM64("adrp x8, #0xe09000");
    /* 0x00b90d28: add      x9, x8, #0xca5 */ ARM64("add x9, x8, #0xca5");
    /* 0x00b90d2c: mov      w8, #0x20 */ ARM64("mov w8, #0x20");
    /* 0x00b90d30: stp      x8, x9, [sp, #0x60] */ ARM64("stp x8, x9, [sp, #0x60]");
    /* 0x00b90d34: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b90d38: add      x8, x8, #0xe18 */ ARM64("add x8, x8, #0xe18");
    /* 0x00b90d3c: str      x8, [sp, #0x70] */ ARM64("str x8, [sp, #0x70]");
loc_00b90d40:
    /* 0x00b90d40: ldp      x1, x0, [sp, #0x60] */ ARM64("ldp x1, x0, [sp, #0x60]");
    /* 0x00b90d44: ldr      x2, [sp, #0x70] */ ARM64("ldr x2, [sp, #0x70]");
    /* 0x00b90d48: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00b90d4c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d50:
    /* 0x00b90d50: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b90d54: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b90d58: add      x0, x0, #0x110 */ ARM64("add x0, x0, #0x110");
    /* 0x00b90d5c: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90d60: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d64:
    /* 0x00b90d64: mov      x0, x16 */ ARM64("mov x0, x16");
    /* 0x00b90d68: mov      x27, x24 */ ARM64("mov x27, x24");
    /* 0x00b90d6c: b        #0xb90d78 */ goto loc_00b90d78;
loc_00b90d70:
    /* 0x00b90d70: mov      x0, x16 */ ARM64("mov x0, x16");
    /* 0x00b90d74: mov      x2, x11 */ ARM64("mov x2, x11");
loc_00b90d78:
    /* 0x00b90d78: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b90d7c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90d80: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90d84:
    /* 0x00b90d84: add      x11, x8, x14, lsl #4 */ ARM64("add x11, x8, x14, lsl #4");
    /* 0x00b90d88: ldr      w14, [x11] */ ARM64("ldr w14, [x11]");
    /* 0x00b90d8c: ldr      w16, [x11, #0xc] */ ARM64("ldr w16, [x11, #0xc]");
loc_00b90d90:
    /* 0x00b90d90: mov      w11, #0 */ ARM64("mov w11, #0");
    /* 0x00b90d94: orr      x12, x22, x16, lsl #32 */ ARM64("orr x12, x22, x16, lsl #32");
loc_00b90d98:
    /* 0x00b90d98: lsr      x13, x8, #0x20 */ ARM64("lsr x13, x8, #0x20");
    /* 0x00b90d9c: str      w8, [sp, #0x210] */ ARM64("str w8, [sp, #0x210]");
    /* 0x00b90da0: str      w13, [sp, #0x214] */ ARM64("str w13, [sp, #0x214]");
    /* 0x00b90da4: str      x9, [sp, #0x218] */ ARM64("str x9, [sp, #0x218]");
    /* 0x00b90da8: str      w14, [sp, #0x220] */ ARM64("str w14, [sp, #0x220]");
    /* 0x00b90dac: str      w10, [sp, #0x224] */ ARM64("str w10, [sp, #0x224]");
    /* 0x00b90db0: mov      w8, #-1 */ ARM64("mov w8, #-1");
    /* 0x00b90db4: str      w8, [sp, #0x228] */ ARM64("str w8, [sp, #0x228]");
    /* 0x00b90db8: str      w11, [sp, #0x230] */ ARM64("str w11, [sp, #0x230]");
    /* 0x00b90dbc: add      x8, sp, #0x135 */ ARM64("add x8, sp, #0x135");
    /* 0x00b90dc0: stur     x12, [x8, #0xff] */ ARM64("stur x12, [x8, #0xff]");
    /* 0x00b90dc4: adrp     x0, #0xe0d000 */ ARM64("adrp x0, #0xe0d000");
    /* 0x00b90dc8: add      x0, x0, #0x176 */ ARM64("add x0, x0, #0x176");
    /* 0x00b90dcc: adrp     x3, #0xef8000 */ ARM64("adrp x3, #0xef8000");
    /* 0x00b90dd0: add      x3, x3, #0x250 */ ARM64("add x3, x3, #0x250");
    /* 0x00b90dd4: adrp     x4, #0xef8000 */ ARM64("adrp x4, #0xef8000");
    /* 0x00b90dd8: add      x4, x4, #0x238 */ ARM64("add x4, x4, #0x238");
    /* 0x00b90ddc: add      x2, sp, #0x210 */ ARM64("add x2, sp, #0x210");
    /* 0x00b90de0: mov      w1, #0x2b */ ARM64("mov w1, #0x2b");
    /* 0x00b90de4: bl       #0xc73d64 */ CALL_DIRECT(sub_00c73d64);
    /* 0x00b90de8: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90dec:
    /* 0x00b90dec: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b90df0: add      x8, x8, #0x208 */ ARM64("add x8, x8, #0x208");
    /* 0x00b90df4: str      x8, [sp, #0x58] */ ARM64("str x8, [sp, #0x58]");
loc_00b90df8:
    /* 0x00b90df8: ldr      x0, [sp, #0x58] */ ARM64("ldr x0, [sp, #0x58]");
    /* 0x00b90dfc: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90e00: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e04:
    /* 0x00b90e04: adrp     x0, #0xe07000 */ ARM64("adrp x0, #0xe07000");
    /* 0x00b90e08: add      x0, x0, #0x3d7 */ ARM64("add x0, x0, #0x3d7");
    /* 0x00b90e0c: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90e10: add      x2, x2, #0x2f8 */ ARM64("add x2, x2, #0x2f8");
    /* 0x00b90e14: mov      w1, #0x45 */ ARM64("mov w1, #0x45");
    /* 0x00b90e18: bl       #0xc73c80 */ CALL_DIRECT(sub_00c73c80);
    /* 0x00b90e1c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e20:
    /* 0x00b90e20: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b90e24: mov      x1, x24 */ ARM64("mov x1, x24");
    /* 0x00b90e28: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90e2c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e30:
    /* 0x00b90e30: adrp     x0, #0xef8000 */ ARM64("adrp x0, #0xef8000");
    /* 0x00b90e34: add      x0, x0, #0xf8 */ ARM64("add x0, x0, #0xf8");
    /* 0x00b90e38: bl       #0xc73c64 */ CALL_DIRECT(sub_00c73c64);
    /* 0x00b90e3c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e40:
    /* 0x00b90e40: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90e44: add      x2, x2, #0x190 */ ARM64("add x2, x2, #0x190");
    /* 0x00b90e48: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90e4c: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e50:
    /* 0x00b90e50: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00b90e54: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00b90e58: ldr      x1, [sp, #0x108] */ ARM64("ldr x1, [sp, #0x108]");
    /* 0x00b90e5c: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90e60: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e64:
    /* 0x00b90e64: mov      x0, x17 */ ARM64("mov x0, x17");
    /* 0x00b90e68: b        #0xb90ea4 */ goto loc_00b90ea4;
loc_00b90e6c:
    /* 0x00b90e6c: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90e70: mov      x1, x27 */ ARM64("mov x1, x27");
    /* 0x00b90e74: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90e78: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e7c:
    /* 0x00b90e7c: adrp     x2, #0xefc000 */ ARM64("adrp x2, #0xefc000");
    /* 0x00b90e80: add      x2, x2, #0x8f8 */ ARM64("add x2, x2, #0x8f8");
    /* 0x00b90e84: b        #0xb90d78 */ goto loc_00b90d78;
loc_00b90e88:
    /* 0x00b90e88: adrp     x2, #0xefb000 */ ARM64("adrp x2, #0xefb000");
    /* 0x00b90e8c: add      x2, x2, #0x4a0 */ ARM64("add x2, x2, #0x4a0");
    /* 0x00b90e90: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90e94: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90e98:
    /* 0x00b90e98: adrp     x8, #0xef8000 */ ARM64("adrp x8, #0xef8000");
    /* 0x00b90e9c: add      x8, x8, #0xc8 */ ARM64("add x8, x8, #0xc8");
    /* 0x00b90ea0: str      x8, [sp, #0xb0] */ ARM64("str x8, [sp, #0xb0]");
loc_00b90ea4:
    /* 0x00b90ea4: ldp      x1, x25, [sp, #0x108] */ ARM64("ldp x1, x25, [sp, #0x108]");
    /* 0x00b90ea8: ldr      x2, [sp, #0xb0] */ ARM64("ldr x2, [sp, #0xb0]");
    /* 0x00b90eac: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b90eb0: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
    /* 0x00b90eb4: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90eb8:
    /* 0x00b90eb8: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90ebc: str      x28, [sp, #0x10] */ ARM64("str x28, [sp, #0x10]");
loc_00b90ec0:
    /* 0x00b90ec0: ldr      x1, [sp, #0x10] */ ARM64("ldr x1, [sp, #0x10]");
    /* 0x00b90ec4: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90ec8: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90ecc:
    /* 0x00b90ecc: str      x21, [sp, #0xc8] */ ARM64("str x21, [sp, #0xc8]");
    /* 0x00b90ed0: b        #0xb906e8 */ goto loc_00b906e8;
loc_00b90ed4:
    /* 0x00b90ed4: mov      w0, #4 */ ARM64("mov w0, #4");
    /* 0x00b90ed8: mov      x19, x23 */ ARM64("mov x19, x23");
loc_00b90edc:
    /* 0x00b90edc: mov      x1, x19 */ ARM64("mov x1, x19");
    /* 0x00b90ee0: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90ee4: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90ee8:
    /* 0x00b90ee8: mov      x0, #0 */ ARM64("mov x0, #0");
loc_00b90eec:
    /* 0x00b90eec: bl       #0xc6b970 */ CALL_DIRECT(sub_00c6b970);
    /* 0x00b90ef0: b        #0xb90f14 */ goto loc_00b90f14;
loc_00b90ef4:
    /* 0x00b90ef4: str      x23, [sp, #0x28] */ ARM64("str x23, [sp, #0x28]");
    /* 0x00b90ef8: mov      w0, #8 */ ARM64("mov w0, #8");
    /* 0x00b90efc: b        #0xb9070c */ goto loc_00b9070c;
loc_00b90f00:
    /* 0x00b90f00: adrp     x2, #0xef8000 */ ARM64("adrp x2, #0xef8000");
    /* 0x00b90f04: add      x2, x2, #0x1d8 */ ARM64("add x2, x2, #0x1d8");
    /* 0x00b90f08: mov      x0, #0 */ ARM64("mov x0, #0");
    /* 0x00b90f0c: mov      x1, #0 */ ARM64("mov x1, #0");
    /* 0x00b90f10: bl       #0xc73c94 */ CALL_DIRECT(sub_00c73c94);
loc_00b90f14:
    /* 0x00b90f14: brk      #1 */ ARM64("brk #1");
loc_00b90f18:
    /* 0x00b90f18: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b90f1c: ldr      x1, [sp, #0x220] */ ARM64("ldr x1, [sp, #0x220]");
    /* 0x00b90f20: b        #0xb90eec */ goto loc_00b90eec;
    /* 0x00b90f24: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90f28: cbz      x21, #0xb9128c */ if (x21 == 0) goto loc_00b9128c;
    /* 0x00b90f2c: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b90f30: b        #0xb91288 */ goto loc_00b91288;
    /* 0x00b90f34: b        #0xb90f38 */ goto loc_00b90f38;
loc_00b90f38:
    /* 0x00b90f38: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90f3c: ldr      x9, [sp, #0x218] */ ARM64("ldr x9, [sp, #0x218]");
    /* 0x00b90f40: cbz      x9, #0xb90f6c */ if (x9 == 0) goto loc_00b90f6c;
    /* 0x00b90f44: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00b90f48: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b90f4c: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b90f50: b.eq     #0xb90f6c */ if (COND_EQ) goto loc_00b90f6c;
    /* 0x00b90f54: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b90f58: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b90f5c: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b90f60: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b90f64: b        #0xb90f6c */ goto loc_00b90f6c;
    /* 0x00b90f68: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b90f6c:
    /* 0x00b90f6c: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b90f70: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b90f74: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b90f78: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
    /* 0x00b90f7c: b        #0xb91ab8 */ goto loc_00b91ab8;
    /* 0x00b90f80: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90f84: b        #0xb91ac4 */ goto loc_00b91ac4;
    /* 0x00b90f88: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90f8c: b        #0xb91a2c */ goto loc_00b91a2c;
    /* 0x00b90f90: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90f94: add      x0, sp, #0x1d0 */ ARM64("add x0, sp, #0x1d0");
    /* 0x00b90f98: bl       #0xb86bf4 */ CALL_DIRECT(sub_00b86bf4);
    /* 0x00b90f9c: b        #0xb91a2c */ goto loc_00b91a2c;
    /* 0x00b90fa0: b        #0xb90fec */ goto loc_00b90fec;
    /* 0x00b90fa4: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b90fa8:
    /* 0x00b90fa8: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b90fac: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b90fb0: stlxr    w9, x8, [x19] */ ARM64("stlxr w9, x8, [x19]");
    /* 0x00b90fb4: cbnz     w9, #0xb90fa8 */ if (w9 != 0) goto loc_00b90fa8;
    /* 0x00b90fb8: b.ne     #0xb90fd0 */ if (COND_NE) goto loc_00b90fd0;
    /* 0x00b90fbc: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b90fc0: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b90fc4: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b90fc8: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b90fcc: b        #0xb91980 */ goto loc_00b91980;
loc_00b90fd0:
    /* 0x00b90fd0: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b90fd4: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b90fd8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b90fdc: b        #0xb911e8 */ goto loc_00b911e8;
    /* 0x00b90fe0: b        #0xb91258 */ goto loc_00b91258;
    /* 0x00b90fe4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b90fe8: b        #0xb91a4c */ goto loc_00b91a4c;
loc_00b90fec:
    /* 0x00b90fec: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b90ff0:
    /* 0x00b90ff0: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b90ff4: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b90ff8: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b90ffc: cbnz     w9, #0xb90ff0 */ if (w9 != 0) goto loc_00b90ff0;
    /* 0x00b91000: b        #0xb91054 */ goto loc_00b91054;
    /* 0x00b91004: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b91008:
    /* 0x00b91008: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b9100c: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b91010: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b91014: cbnz     w9, #0xb91008 */ if (w9 != 0) goto loc_00b91008;
    /* 0x00b91018: b        #0xb91054 */ goto loc_00b91054;
    /* 0x00b9101c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91020: b        #0xb91a18 */ goto loc_00b91a18;
    /* 0x00b91024: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91028: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b9102c: b        #0xb91828 */ goto loc_00b91828;
    /* 0x00b91030: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91034: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b91038: bl       #0xb92b0c */ CALL_DIRECT(sub_00b92b0c);
    /* 0x00b9103c: b        #0xb91c38 */ goto loc_00b91c38;
    /* 0x00b91040: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b91044:
    /* 0x00b91044: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b91048: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b9104c: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b91050: cbnz     w9, #0xb91044 */ if (w9 != 0) goto loc_00b91044;
loc_00b91054:
    /* 0x00b91054: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91058: b.eq     #0xb91994 */ if (COND_EQ) goto loc_00b91994;
    /* 0x00b9105c: b        #0xb919a0 */ goto loc_00b919a0;
    /* 0x00b91060: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91064: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b91068: b        #0xb912f4 */ goto loc_00b912f4;
    /* 0x00b9106c: b        #0xb9131c */ goto loc_00b9131c;
    /* 0x00b91070: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91074: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00b91078: cbnz     x9, #0xb919b4 */ if (x9 != 0) goto loc_00b919b4;
    /* 0x00b9107c: b        #0xb91a60 */ goto loc_00b91a60;
    /* 0x00b91080: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91084: b        #0xb91160 */ goto loc_00b91160;
    /* 0x00b91088: b        #0xb911e8 */ goto loc_00b911e8;
    /* 0x00b9108c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91090: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b91094: ldr      x27, [sp, #0x90] */ ARM64("ldr x27, [sp, #0x90]");
    /* 0x00b91098: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b9109c: ldr      w20, [sp, #0x88] */ ARM64("ldr w20, [sp, #0x88]");
    /* 0x00b910a0: ldr      x19, [sp, #0xc0] */ ARM64("ldr x19, [sp, #0xc0]");
    /* 0x00b910a4: cbnz     x19, #0xb9191c */ if (x19 != 0) goto loc_00b9191c;
    /* 0x00b910a8: b        #0xb91924 */ goto loc_00b91924;
    /* 0x00b910ac: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910b0: cbnz     x21, #0xb9125c */ if (x21 != 0) goto loc_00b9125c;
    /* 0x00b910b4: b        #0xb91264 */ goto loc_00b91264;
    /* 0x00b910b8: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910bc: b        #0xb9128c */ goto loc_00b9128c;
    /* 0x00b910c0: b        #0xb910d4 */ goto loc_00b910d4;
    /* 0x00b910c4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910c8: ldr      w8, [sp, #0x30] */ ARM64("ldr w8, [sp, #0x30]");
    /* 0x00b910cc: tbz      w8, #0, #0xb912d0 */ if (((w8 >> #0) & 1) == 0) goto loc_00b912d0;
    /* 0x00b910d0: b        #0xb912d8 */ goto loc_00b912d8;
loc_00b910d4:
    /* 0x00b910d4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910d8: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b910dc: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b910e0: b        #0xb91788 */ goto loc_00b91788;
    /* 0x00b910e4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910e8: b        #0xb91534 */ goto loc_00b91534;
    /* 0x00b910ec: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b910f0: cbz      x19, #0xb91128 */ if (x19 == 0) goto loc_00b91128;
    /* 0x00b910f4: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b910f8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b910fc: b        #0xb91128 */ goto loc_00b91128;
    /* 0x00b91100: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91104: cbz      x23, #0xb91154 */ if (x23 == 0) goto loc_00b91154;
    /* 0x00b91108: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b9110c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91110: b        #0xb91154 */ goto loc_00b91154;
    /* 0x00b91114: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91118: b        #0xb91128 */ goto loc_00b91128;
    /* 0x00b9111c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91120: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b91124: bl       #0xbd989c */ CALL_DIRECT(sub_00bd989c);
loc_00b91128:
    /* 0x00b91128: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b9112c: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b91130: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b91134: mov      w19, #1 */ ARM64("mov w19, #1");
    /* 0x00b91138: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9113c: ldr      x20, [x25, #0x80] */ ARM64("ldr x20, [x25, #0x80]");
    /* 0x00b91140: cbnz     x20, #0xb91ad4 */ if (x20 != 0) goto loc_00b91ad4;
    /* 0x00b91144: b        #0xb91afc */ goto loc_00b91afc;
    /* 0x00b91148: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9114c: b        #0xb91ac4 */ goto loc_00b91ac4;
    /* 0x00b91150: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b91154:
    /* 0x00b91154: add      x0, sp, #0x430 */ ARM64("add x0, sp, #0x430");
    /* 0x00b91158: bl       #0xb72668 */ CALL_DIRECT(sub_00b72668);
    /* 0x00b9115c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
loc_00b91160:
    /* 0x00b91160: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b91164: b        #0xb91960 */ goto loc_00b91960;
    /* 0x00b91168: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9116c: str      x20, [sp, #0x218] */ ARM64("str x20, [sp, #0x218]");
    /* 0x00b91170: add      x0, sp, #0x160 */ ARM64("add x0, sp, #0x160");
    /* 0x00b91174: bl       #0xb726d4 */ CALL_DIRECT(sub_00b726d4);
    /* 0x00b91178: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b9117c: bl       #0xb8cdc4 */ CALL_DIRECT(sub_00b8cdc4);
    /* 0x00b91180: add      x0, sp, #0x390 */ ARM64("add x0, sp, #0x390");
    /* 0x00b91184: bl       #0xb7272c */ CALL_DIRECT(sub_00b7272c);
    /* 0x00b91188: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9118c: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b91190: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91194: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91198: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9119c: ldr      x27, [sp, #0x90] */ ARM64("ldr x27, [sp, #0x90]");
    /* 0x00b911a0: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b911a4: mov      x22, x20 */ ARM64("mov x22, x20");
    /* 0x00b911a8: ldr      w20, [sp, #0x88] */ ARM64("ldr w20, [sp, #0x88]");
    /* 0x00b911ac: ldr      x19, [sp, #0xc0] */ ARM64("ldr x19, [sp, #0xc0]");
    /* 0x00b911b0: ldr      w24, [sp, #0x118] */ ARM64("ldr w24, [sp, #0x118]");
    /* 0x00b911b4: cbnz     x19, #0xb9191c */ if (x19 != 0) goto loc_00b9191c;
    /* 0x00b911b8: b        #0xb91924 */ goto loc_00b91924;
    /* 0x00b911bc: brk      #1 */ ARM64("brk #1");
    /* 0x00b911c0: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b911c4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b911c8: brk      #1 */ ARM64("brk #1");
    /* 0x00b911cc: brk      #1 */ ARM64("brk #1");
    /* 0x00b911d0: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b911d4: add      x0, x24, #8 */ ARM64("add x0, x24, #8");
    /* 0x00b911d8: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b911dc: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b911e0: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b911e4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b911e8:
    /* 0x00b911e8: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b911ec: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b911f0: b        #0xb917f4 */ goto loc_00b917f4;
    /* 0x00b911f4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b911f8: b        #0xb912ac */ goto loc_00b912ac;
    /* 0x00b911fc: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91200: ldp      x25, x8, [sp, #0x110] */ ARM64("ldp x25, x8, [sp, #0x110]");
    /* 0x00b91204: ldp      x20, x23, [sp, #0xb0] */ ARM64("ldp x20, x23, [sp, #0xb0]");
    /* 0x00b91208: cbnz     x8, #0xb91798 */ if (x8 != 0) goto loc_00b91798;
    /* 0x00b9120c: b        #0xb917a0 */ goto loc_00b917a0;
    /* 0x00b91210: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91214: add      x0, sp, #0x3a8 */ ARM64("add x0, sp, #0x3a8");
    /* 0x00b91218: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b9121c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91220: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b91224: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91228: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9122c: add      x0, sp, #0x3a8 */ ARM64("add x0, sp, #0x3a8");
    /* 0x00b91230: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b91234: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91238: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b9123c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91240: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91244: add      x0, x24, #8 */ ARM64("add x0, x24, #8");
    /* 0x00b91248: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b9124c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91250: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b91254: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b91258:
    /* 0x00b91258: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b9125c:
    /* 0x00b9125c: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b91260: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91264:
    /* 0x00b91264: ldr      x9, [sp, #0x218] */ ARM64("ldr x9, [sp, #0x218]");
    /* 0x00b91268: cbz      x9, #0xb9128c */ if (x9 == 0) goto loc_00b9128c;
    /* 0x00b9126c: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00b91270: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b91274: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b91278: b.eq     #0xb9128c */ if (COND_EQ) goto loc_00b9128c;
    /* 0x00b9127c: ldr      x9, [sp, #0x210] */ ARM64("ldr x9, [sp, #0x210]");
    /* 0x00b91280: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b91284: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
loc_00b91288:
    /* 0x00b91288: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b9128c:
    /* 0x00b9128c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91290: ldp      x20, x23, [sp, #0xb0] */ ARM64("ldp x20, x23, [sp, #0xb0]");
    /* 0x00b91294: b        #0xb917a0 */ goto loc_00b917a0;
    /* 0x00b91298: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9129c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b912a0: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b912a4: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00b912a8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b912ac:
    /* 0x00b912ac: add      x0, sp, #0x3a8 */ ARM64("add x0, sp, #0x3a8");
    /* 0x00b912b0: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b912b4: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b912b8: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b912bc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b912c0: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b912c4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b912c8: b        #0xb9176c */ goto loc_00b9176c;
    /* 0x00b912cc: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b912d0:
    /* 0x00b912d0: mov      x0, x23 */ ARM64("mov x0, x23");
    /* 0x00b912d4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b912d8:
    /* 0x00b912d8: ldr      x27, [sp, #0x90] */ ARM64("ldr x27, [sp, #0x90]");
    /* 0x00b912dc: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b912e0: ldr      x22, [sp, #0x38] */ ARM64("ldr x22, [sp, #0x38]");
    /* 0x00b912e4: b        #0xb918e0 */ goto loc_00b918e0;
    /* 0x00b912e8: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b912ec: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b912f0: ldr      x27, [sp, #0x90] */ ARM64("ldr x27, [sp, #0x90]");
loc_00b912f4:
    /* 0x00b912f4: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
    /* 0x00b912f8: ldr      w20, [sp, #0x88] */ ARM64("ldr w20, [sp, #0x88]");
    /* 0x00b912fc: b        #0xb91924 */ goto loc_00b91924;
    /* 0x00b91300: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91304: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b91308: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b9130c: b        #0xb91764 */ goto loc_00b91764;
    /* 0x00b91310: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91314: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91318: b        #0xb9176c */ goto loc_00b9176c;
loc_00b9131c:
    /* 0x00b9131c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91320: ldr      x8, [sp, #0x228] */ ARM64("ldr x8, [sp, #0x228]");
    /* 0x00b91324: sub      x9, x8, #0xc */ ARM64("sub x9, x8, #0xc");
    /* 0x00b91328: cmp      x8, #0xb */ ARM64("cmp x8, #0xb");
    /* 0x00b9132c: mov      w8, #9 */ ARM64("mov w8, #9");
    /* 0x00b91330: csel     x8, x9, x8, hi */ ARM64("csel x8, x9, x8, hi");
    /* 0x00b91334: cmp      x8, #0x13 */ ARM64("cmp x8, #0x13");
    /* 0x00b91338: b.hi     #0xb91524 */ if (COND_HI) goto loc_00b91524;
    /* 0x00b9133c: adrp     x9, #0xe06000 */ ARM64("adrp x9, #0xe06000");
    /* 0x00b91340: add      x9, x9, #0x2f2 */ ARM64("add x9, x9, #0x2f2");
    /* 0x00b91344: adr      x10, #0xb91354 */ ARM64("adr x10, #0xb91354");
    /* 0x00b91348: ldrh     w11, [x9, x8, lsl #1] */ ARM64("ldrh w11, [x9, x8, lsl #1]");
    /* 0x00b9134c: add      x10, x10, x11, lsl #2 */ ARM64("add x10, x10, x11, lsl #2");
    /* 0x00b91350: br       x10 */ ARM64("br x10");
loc_00b91354:
    /* 0x00b91354: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91358: bl       #0xb9328c */ CALL_DIRECT(sub_00b9328c);
    /* 0x00b9135c: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91360: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91364: bl       #0xb92c40 */ CALL_DIRECT(sub_00b92c40);
    /* 0x00b91368: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b9136c: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91370: bl       #0xb92d1c */ CALL_DIRECT(sub_00b92d1c);
    /* 0x00b91374: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91378: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b9137c: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91380: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91384: ldr      x9, [sp, #0x270] */ ARM64("ldr x9, [sp, #0x270]");
loc_00b91388:
    /* 0x00b91388: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b9138c: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b91390: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b91394: cbnz     w11, #0xb91388 */ if (w11 != 0) goto loc_00b91388;
    /* 0x00b91398: b.ne     #0xb913a8 */ if (COND_NE) goto loc_00b913a8;
    /* 0x00b9139c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b913a0: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b913a4: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b913a8:
    /* 0x00b913a8: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b913ac: add      x8, x8, #0x68 */ ARM64("add x8, x8, #0x68");
    /* 0x00b913b0: b        #0xb913d0 */ goto loc_00b913d0;
    /* 0x00b913b4: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b913b8: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b913bc: b        #0xb913c8 */ goto loc_00b913c8;
    /* 0x00b913c0: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b913c4: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b913c8:
    /* 0x00b913c8: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b913cc: add      x8, x8, #0x60 */ ARM64("add x8, x8, #0x60");
loc_00b913d0:
    /* 0x00b913d0: str      x8, [sp, #0xb8] */ ARM64("str x8, [sp, #0xb8]");
loc_00b913d4:
    /* 0x00b913d4: ldr      x8, [sp, #0xb8] */ ARM64("ldr x8, [sp, #0xb8]");
    /* 0x00b913d8: ldr      x8, [x8] */ ARM64("ldr x8, [x8]");
loc_00b913dc:
    /* 0x00b913dc: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b913e0: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b913e4: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b913e8: cbnz     w10, #0xb913dc */ if (w10 != 0) goto loc_00b913dc;
    /* 0x00b913ec: b.ne     #0xb91534 */ if (COND_NE) goto loc_00b91534;
    /* 0x00b913f0: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b913f4: ldr      x0, [sp, #0xb8] */ ARM64("ldr x0, [sp, #0xb8]");
    /* 0x00b913f8: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b913fc: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91400: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b91404: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91408: add      x20, sp, #0x210 */ ARM64("add x20, sp, #0x210");
    /* 0x00b9140c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b91410: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
    /* 0x00b91414: add      x0, x20, #0x58 */ ARM64("add x0, x20, #0x58");
    /* 0x00b91418: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
    /* 0x00b9141c: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91420: add      x0, x8, #0xb0 */ ARM64("add x0, x8, #0xb0");
    /* 0x00b91424: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
    /* 0x00b91428: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9142c: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b91430: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91434: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91438: add      x0, x8, #0xa0 */ ARM64("add x0, x8, #0xa0");
    /* 0x00b9143c: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
    /* 0x00b91440: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91444: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91448: b        #0xb914bc */ goto loc_00b914bc;
    /* 0x00b9144c: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91450: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91454: add      x20, sp, #0x210 */ ARM64("add x20, sp, #0x210");
    /* 0x00b91458: add      x0, x20, #0x60 */ ARM64("add x0, x20, #0x60");
    /* 0x00b9145c: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91460: add      x0, x20, #0xa0 */ ARM64("add x0, x20, #0xa0");
    /* 0x00b91464: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91468: ldr      x8, [sp, #0x2f0] */ ARM64("ldr x8, [sp, #0x2f0]");
loc_00b9146c:
    /* 0x00b9146c: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91470: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b91474: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91478: cbnz     w10, #0xb9146c */ if (w10 != 0) goto loc_00b9146c;
    /* 0x00b9147c: b.ne     #0xb9148c */ if (COND_NE) goto loc_00b9148c;
    /* 0x00b91480: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91484: ldr      x0, [sp, #0x2f0] */ ARM64("ldr x0, [sp, #0x2f0]");
    /* 0x00b91488: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b9148c:
    /* 0x00b9148c: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91490: add      x8, x8, #0xe8 */ ARM64("add x8, x8, #0xe8");
    /* 0x00b91494: b        #0xb913d0 */ goto loc_00b913d0;
    /* 0x00b91498: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b9149c: add      x0, x8, #0xa0 */ ARM64("add x0, x8, #0xa0");
    /* 0x00b914a0: bl       #0xb72780 */ CALL_DIRECT(sub_00b72780);
    /* 0x00b914a4: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00b914a8: cbz      x8, #0xb914b4 */ if (x8 == 0) goto loc_00b914b4;
    /* 0x00b914ac: ldr      x0, [sp, #0x2b8] */ ARM64("ldr x0, [sp, #0x2b8]");
    /* 0x00b914b0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b914b4:
    /* 0x00b914b4: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b914b8: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b914bc:
    /* 0x00b914bc: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b914c0: add      x8, x8, #0x60 */ ARM64("add x8, x8, #0x60");
    /* 0x00b914c4: str      x8, [sp, #0xc0] */ ARM64("str x8, [sp, #0xc0]");
    /* 0x00b914c8: b        #0xb9158c */ goto loc_00b9158c;
    /* 0x00b914cc: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b914d0: ldr      x1, [sp, #0x240] */ ARM64("ldr x1, [sp, #0x240]");
    /* 0x00b914d4: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
    /* 0x00b914d8: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b914dc: cbz      x8, #0xb914e8 */ if (x8 == 0) goto loc_00b914e8;
    /* 0x00b914e0: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b914e4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b914e8:
    /* 0x00b914e8: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b914ec: ldr      x1, [sp, #0x258] */ ARM64("ldr x1, [sp, #0x258]");
    /* 0x00b914f0: bl       #0xb784e4 */ CALL_DIRECT(sub_00b784e4);
    /* 0x00b914f4: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b914f8: cbz      x8, #0xb913d4 */ if (x8 == 0) goto loc_00b913d4;
    /* 0x00b914fc: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b91500: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91504: b        #0xb913d4 */ goto loc_00b913d4;
    /* 0x00b91508: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b9150c: ldr      x1, [sp, #0x220] */ ARM64("ldr x1, [sp, #0x220]");
    /* 0x00b91510: bl       #0xb784e4 */ CALL_DIRECT(sub_00b784e4);
    /* 0x00b91514: b        #0xb91524 */ goto loc_00b91524;
    /* 0x00b91518: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b9151c: ldr      x1, [sp, #0x220] */ ARM64("ldr x1, [sp, #0x220]");
    /* 0x00b91520: bl       #0xb78eac */ CALL_DIRECT(sub_00b78eac);
loc_00b91524:
    /* 0x00b91524: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b91528: cbz      x8, #0xb91534 */ if (x8 == 0) goto loc_00b91534;
    /* 0x00b9152c: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b91530: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91534:
    /* 0x00b91534: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91538: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b9153c: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91540: ldr      x8, [sp, #0x288] */ ARM64("ldr x8, [sp, #0x288]");
loc_00b91544:
    /* 0x00b91544: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91548: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b9154c: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91550: cbnz     w10, #0xb91544 */ if (w10 != 0) goto loc_00b91544;
    /* 0x00b91554: b.ne     #0xb91564 */ if (COND_NE) goto loc_00b91564;
    /* 0x00b91558: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b9155c: ldr      x0, [sp, #0x288] */ ARM64("ldr x0, [sp, #0x288]");
    /* 0x00b91560: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b91564:
    /* 0x00b91564: ldr      x0, [sp, #0x278] */ ARM64("ldr x0, [sp, #0x278]");
    /* 0x00b91568: ldr      x1, [sp, #0x280] */ ARM64("ldr x1, [sp, #0x280]");
    /* 0x00b9156c: bl       #0xb784e4 */ CALL_DIRECT(sub_00b784e4);
    /* 0x00b91570: ldr      x8, [sp, #0x270] */ ARM64("ldr x8, [sp, #0x270]");
    /* 0x00b91574: cbz      x8, #0xb91580 */ if (x8 == 0) goto loc_00b91580;
    /* 0x00b91578: ldr      x0, [sp, #0x278] */ ARM64("ldr x0, [sp, #0x278]");
    /* 0x00b9157c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91580:
    /* 0x00b91580: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b91584: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00b91588: b.eq     #0xb91534 */ if (COND_EQ) goto loc_00b91534;
loc_00b9158c:
    /* 0x00b9158c: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91590: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91594: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91598: add      x27, x19, #8 */ ARM64("add x27, x19, #8");
    /* 0x00b9159c: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b915a0: b        #0xb91680 */ goto loc_00b91680;
    /* 0x00b915a4: b        #0xb9173c */ goto loc_00b9173c;
    /* 0x00b915a8: ldr      x8, [sp, #0x248] */ ARM64("ldr x8, [sp, #0x248]");
    /* 0x00b915ac: cbz      x8, #0xb9162c */ if (x8 == 0) goto loc_00b9162c;
    /* 0x00b915b0: ldr      x0, [sp, #0x250] */ ARM64("ldr x0, [sp, #0x250]");
    /* 0x00b915b4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b915b8: b        #0xb9162c */ goto loc_00b9162c;
    /* 0x00b915bc: b        #0xb91654 */ goto loc_00b91654;
    /* 0x00b915c0: b        #0xb91674 */ goto loc_00b91674;
    /* 0x00b915c4: b        #0xb916bc */ goto loc_00b916bc;
    /* 0x00b915c8: b        #0xb916d8 */ goto loc_00b916d8;
    /* 0x00b915cc: ldr      x8, [sp, #0x270] */ ARM64("ldr x8, [sp, #0x270]");
    /* 0x00b915d0: cbz      x8, #0xb915dc */ if (x8 == 0) goto loc_00b915dc;
    /* 0x00b915d4: ldr      x0, [sp, #0x278] */ ARM64("ldr x0, [sp, #0x278]");
    /* 0x00b915d8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b915dc:
    /* 0x00b915dc: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b915e0: cmp      x8, #0xc */ ARM64("cmp x8, #0xc");
    /* 0x00b915e4: b.eq     #0xb91d44 */ if (COND_EQ) goto loc_00b91d44;
    /* 0x00b915e8: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b915ec: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b915f0: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b915f4: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b915f8: b        #0xb915fc */ goto loc_00b915fc;
loc_00b915fc:
    /* 0x00b915fc: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b91600: cbz      x8, #0xb91d44 */ if (x8 == 0) goto loc_00b91d44;
    /* 0x00b91604: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b91608: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b9160c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91610: ldr      x8, [sp, #0x230] */ ARM64("ldr x8, [sp, #0x230]");
    /* 0x00b91614: cbz      x8, #0xb91620 */ if (x8 == 0) goto loc_00b91620;
    /* 0x00b91618: ldr      x0, [sp, #0x238] */ ARM64("ldr x0, [sp, #0x238]");
    /* 0x00b9161c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91620:
    /* 0x00b91620: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91624: add      x0, x8, #0x38 */ ARM64("add x0, x8, #0x38");
    /* 0x00b91628: bl       #0xb7a750 */ CALL_DIRECT(sub_00b7a750);
loc_00b9162c:
    /* 0x00b9162c: ldr      x0, [sp, #0xb8] */ ARM64("ldr x0, [sp, #0xb8]");
    /* 0x00b91630: bl       #0xb86bd0 */ CALL_DIRECT(sub_00b86bd0);
    /* 0x00b91634: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b91638: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b9163c: ldr      x8, [sp, #0x2b0] */ ARM64("ldr x8, [sp, #0x2b0]");
    /* 0x00b91640: cbz      x8, #0xb9164c */ if (x8 == 0) goto loc_00b9164c;
    /* 0x00b91644: ldr      x0, [sp, #0x2b8] */ ARM64("ldr x0, [sp, #0x2b8]");
    /* 0x00b91648: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b9164c:
    /* 0x00b9164c: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b91650: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b91654:
    /* 0x00b91654: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91658: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b9165c: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b91660: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b91664: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91668: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b9166c: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b91670: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b91674:
    /* 0x00b91674: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91678: add      x0, x8, #0xa0 */ ARM64("add x0, x8, #0xa0");
    /* 0x00b9167c: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b91680:
    /* 0x00b91680: ldr      x8, [sp, #0x2f0] */ ARM64("ldr x8, [sp, #0x2f0]");
loc_00b91684:
    /* 0x00b91684: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91688: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b9168c: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91690: cbnz     w10, #0xb91684 */ if (w10 != 0) goto loc_00b91684;
    /* 0x00b91694: b.ne     #0xb916a4 */ if (COND_NE) goto loc_00b916a4;
    /* 0x00b91698: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b9169c: ldr      x0, [sp, #0x2f0] */ ARM64("ldr x0, [sp, #0x2f0]");
    /* 0x00b916a0: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b916a4:
    /* 0x00b916a4: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b916a8: add      x0, x8, #0xe8 */ ARM64("add x0, x8, #0xe8");
    /* 0x00b916ac: bl       #0xb86bd0 */ CALL_DIRECT(sub_00b86bd0);
    /* 0x00b916b0: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b916b4: ldr      x0, [sp, #0xc0] */ ARM64("ldr x0, [sp, #0xc0]");
    /* 0x00b916b8: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
loc_00b916bc:
    /* 0x00b916bc: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b916c0: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b916c4: bl       #0xb92e18 */ CALL_DIRECT(sub_00b92e18);
    /* 0x00b916c8: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b916cc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b916d0: add      x0, x20, #0x58 */ ARM64("add x0, x20, #0x58");
    /* 0x00b916d4: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
loc_00b916d8:
    /* 0x00b916d8: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b916dc: add      x0, x8, #0xb0 */ ARM64("add x0, x8, #0xb0");
    /* 0x00b916e0: bl       #0xb931b0 */ CALL_DIRECT(sub_00b931b0);
    /* 0x00b916e4: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b916e8: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b916ec: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b916f0: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b916f4: bl       #0xb86bd0 */ CALL_DIRECT(sub_00b86bd0);
    /* 0x00b916f8: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b916fc: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91700: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91704: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b91708: bl       #0xb86bd0 */ CALL_DIRECT(sub_00b86bd0);
    /* 0x00b9170c: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b91710: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91714: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91718: ldr      x9, [sp, #0x270] */ ARM64("ldr x9, [sp, #0x270]");
loc_00b9171c:
    /* 0x00b9171c: ldxr     x10, [x9] */ ARM64("ldxr x10, [x9]");
    /* 0x00b91720: subs     x10, x10, #1 */ ARM64("subs x10, x10, #1");
    /* 0x00b91724: stlxr    w11, x10, [x9] */ ARM64("stlxr w11, x10, [x9]");
    /* 0x00b91728: cbnz     w11, #0xb9171c */ if (w11 != 0) goto loc_00b9171c;
    /* 0x00b9172c: b.ne     #0xb9173c */ if (COND_NE) goto loc_00b9173c;
    /* 0x00b91730: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91734: add      x0, x8, #0x60 */ ARM64("add x0, x8, #0x60");
    /* 0x00b91738: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b9173c:
    /* 0x00b9173c: add      x8, sp, #0x210 */ ARM64("add x8, sp, #0x210");
    /* 0x00b91740: add      x0, x8, #0x68 */ ARM64("add x0, x8, #0x68");
    /* 0x00b91744: bl       #0xb86bd0 */ CALL_DIRECT(sub_00b86bd0);
    /* 0x00b91748: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b9174c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91750: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91754: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91758: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9175c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b91760: bl       #0xb7eb7c */ CALL_DIRECT(sub_00b7eb7c);
loc_00b91764:
    /* 0x00b91764: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b91768: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b9176c:
    /* 0x00b9176c: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b91770: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b91774: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b91778: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b9177c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91780: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91784: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b91788:
    /* 0x00b91788: add      x0, sp, #0x320 */ ARM64("add x0, sp, #0x320");
    /* 0x00b9178c: bl       #0xb7eadc */ CALL_DIRECT(sub_00b7eadc);
    /* 0x00b91790: b        #0xb91a10 */ goto loc_00b91a10;
    /* 0x00b91794: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b91798:
    /* 0x00b91798: mov      x0, x26 */ ARM64("mov x0, x26");
    /* 0x00b9179c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b917a0:
    /* 0x00b917a0: add      x19, x20, #8 */ ARM64("add x19, x20, #8");
    /* 0x00b917a4: b        #0xb917b0 */ goto loc_00b917b0;
loc_00b917a8:
    /* 0x00b917a8: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
    /* 0x00b917ac: sub      x24, x24, #1 */ ARM64("sub x24, x24, #1");
loc_00b917b0:
    /* 0x00b917b0: cbz      x24, #0xb917c8 */ if (x24 == 0) goto loc_00b917c8;
    /* 0x00b917b4: ldur     x8, [x19, #-8] */ ARM64("ldur x8, [x19, #-8]");
    /* 0x00b917b8: cbz      x8, #0xb917a8 */ if (x8 == 0) goto loc_00b917a8;
    /* 0x00b917bc: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x00b917c0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b917c4: b        #0xb917a8 */ goto loc_00b917a8;
loc_00b917c8:
    /* 0x00b917c8: ldr      x8, [sp, #0x98] */ ARM64("ldr x8, [sp, #0x98]");
    /* 0x00b917cc: cbnz     x8, #0xb917d8 */ if (x8 != 0) goto loc_00b917d8;
    /* 0x00b917d0: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
    /* 0x00b917d4: b        #0xb91a94 */ goto loc_00b91a94;
loc_00b917d8:
    /* 0x00b917d8: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x00b917dc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b917e0: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
    /* 0x00b917e4: b        #0xb91a94 */ goto loc_00b91a94;
    /* 0x00b917e8: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b917ec: b        #0xb91980 */ goto loc_00b91980;
    /* 0x00b917f0: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b917f4:
    /* 0x00b917f4: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b917f8: bl       #0xbd989c */ CALL_DIRECT(sub_00bd989c);
    /* 0x00b917fc: ldr      x19, [sp, #0x430] */ ARM64("ldr x19, [sp, #0x430]");
    /* 0x00b91800: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b91804: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
    /* 0x00b91808: cbz      x19, #0xb91ac4 */ if (x19 == 0) goto loc_00b91ac4;
    /* 0x00b9180c: ldr      x0, [sp, #0x438] */ ARM64("ldr x0, [sp, #0x438]");
    /* 0x00b91810: b        #0xb91ac0 */ goto loc_00b91ac0;
    /* 0x00b91814: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91818: cbz      x19, #0xb91960 */ if (x19 == 0) goto loc_00b91960;
    /* 0x00b9181c: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b91820: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91824: b        #0xb91960 */ goto loc_00b91960;
loc_00b91828:
    /* 0x00b91828: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b9182c: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
    /* 0x00b91830: ldp      x21, x23, [sp, #0xb0] */ ARM64("ldp x21, x23, [sp, #0xb0]");
    /* 0x00b91834: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b91838: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b9183c: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b91840: ldr      w9, [sp, #0x70] */ ARM64("ldr w9, [sp, #0x70]");
    /* 0x00b91844: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b91848: tbnz     w8, #0, #0xb91854 */ if (((w8 >> #0) & 1) != 0) goto loc_00b91854;
    /* 0x00b9184c: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b91850: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91854:
    /* 0x00b91854: ldur     x8, [x29, #-0xf0] */ ARM64("ldur x8, [x29, #-0xf0]");
    /* 0x00b91858: cbz      x8, #0xb91898 */ if (x8 == 0) goto loc_00b91898;
    /* 0x00b9185c: ldur     x8, [x29, #-0xe8] */ ARM64("ldur x8, [x29, #-0xe8]");
    /* 0x00b91860: str      x8, [sp, #0x78] */ ARM64("str x8, [sp, #0x78]");
    /* 0x00b91864: b        #0xb91890 */ goto loc_00b91890;
    /* 0x00b91868: b        #0xb9186c */ goto loc_00b9186c;
loc_00b9186c:
    /* 0x00b9186c: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91870: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
    /* 0x00b91874: ldp      x21, x23, [sp, #0xb0] */ ARM64("ldp x21, x23, [sp, #0xb0]");
    /* 0x00b91878: ldr      x8, [sp, #0x88] */ ARM64("ldr x8, [sp, #0x88]");
    /* 0x00b9187c: cmp      x8, #0 */ ARM64("cmp x8, #0");
    /* 0x00b91880: cset     w8, eq */ ARM64("cset w8, eq");
    /* 0x00b91884: ldr      w9, [sp, #0x70] */ ARM64("ldr w9, [sp, #0x70]");
    /* 0x00b91888: orr      w8, w9, w8 */ ARM64("orr w8, w9, w8");
    /* 0x00b9188c: tbnz     w8, #0, #0xb91898 */ if (((w8 >> #0) & 1) != 0) goto loc_00b91898;
loc_00b91890:
    /* 0x00b91890: ldr      x0, [sp, #0x78] */ ARM64("ldr x0, [sp, #0x78]");
    /* 0x00b91894: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91898:
    /* 0x00b91898: add      x19, x21, #8 */ ARM64("add x19, x21, #8");
    /* 0x00b9189c: b        #0xb918a8 */ goto loc_00b918a8;
loc_00b918a0:
    /* 0x00b918a0: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
    /* 0x00b918a4: sub      x26, x26, #1 */ ARM64("sub x26, x26, #1");
loc_00b918a8:
    /* 0x00b918a8: cbz      x26, #0xb918c0 */ if (x26 == 0) goto loc_00b918c0;
    /* 0x00b918ac: ldur     x8, [x19, #-8] */ ARM64("ldur x8, [x19, #-8]");
    /* 0x00b918b0: cbz      x8, #0xb918a0 */ if (x8 == 0) goto loc_00b918a0;
    /* 0x00b918b4: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x00b918b8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b918bc: b        #0xb918a0 */ goto loc_00b918a0;
loc_00b918c0:
    /* 0x00b918c0: ldr      x8, [sp, #0x98] */ ARM64("ldr x8, [sp, #0x98]");
    /* 0x00b918c4: cbz      x8, #0xb91a8c */ if (x8 == 0) goto loc_00b91a8c;
    /* 0x00b918c8: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b918cc: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b918d0: b        #0xb91a8c */ goto loc_00b91a8c;
    /* 0x00b918d4: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b918d8: ldr      x27, [sp, #0x90] */ ARM64("ldr x27, [sp, #0x90]");
    /* 0x00b918dc: ldr      x23, [sp, #0x108] */ ARM64("ldr x23, [sp, #0x108]");
loc_00b918e0:
    /* 0x00b918e0: ldr      w20, [sp, #0x88] */ ARM64("ldr w20, [sp, #0x88]");
    /* 0x00b918e4: ldr      x19, [sp, #0xc0] */ ARM64("ldr x19, [sp, #0xc0]");
    /* 0x00b918e8: ldr      x8, [sp, #0x210] */ ARM64("ldr x8, [sp, #0x210]");
    /* 0x00b918ec: cbz      x8, #0xb918f8 */ if (x8 == 0) goto loc_00b918f8;
    /* 0x00b918f0: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b918f4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b918f8:
    /* 0x00b918f8: ldr      x8, [sp, #0xb8] */ ARM64("ldr x8, [sp, #0xb8]");
    /* 0x00b918fc: cbnz     x8, #0xb9190c */ if (x8 != 0) goto loc_00b9190c;
    /* 0x00b91900: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b91904: cbnz     x19, #0xb9191c */ if (x19 != 0) goto loc_00b9191c;
    /* 0x00b91908: b        #0xb91924 */ goto loc_00b91924;
loc_00b9190c:
    /* 0x00b9190c: ldr      x0, [sp, #0x118] */ ARM64("ldr x0, [sp, #0x118]");
    /* 0x00b91910: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91914: mov      w24, #1 */ ARM64("mov w24, #1");
    /* 0x00b91918: cbz      x19, #0xb91924 */ if (x19 == 0) goto loc_00b91924;
loc_00b9191c:
    /* 0x00b9191c: ldr      x0, [sp, #0xb0] */ ARM64("ldr x0, [sp, #0xb0]");
    /* 0x00b91920: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91924:
    /* 0x00b91924: add      x19, x22, #8 */ ARM64("add x19, x22, #8");
    /* 0x00b91928: b        #0xb91934 */ goto loc_00b91934;
loc_00b9192c:
    /* 0x00b9192c: add      x19, x19, #0x18 */ ARM64("add x19, x19, #0x18");
    /* 0x00b91930: sub      x25, x25, #1 */ ARM64("sub x25, x25, #1");
loc_00b91934:
    /* 0x00b91934: cbz      x25, #0xb9194c */ if (x25 == 0) goto loc_00b9194c;
    /* 0x00b91938: ldur     x8, [x19, #-8] */ ARM64("ldur x8, [x19, #-8]");
    /* 0x00b9193c: cbz      x8, #0xb9192c */ if (x8 == 0) goto loc_00b9192c;
    /* 0x00b91940: ldr      x0, [x19] */ ARM64("ldr x0, [x19]");
    /* 0x00b91944: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91948: b        #0xb9192c */ goto loc_00b9192c;
loc_00b9194c:
    /* 0x00b9194c: tbnz     w20, #0, #0xb91958 */ if (((w20 >> #0) & 1) != 0) goto loc_00b91958;
    /* 0x00b91950: mov      x0, x22 */ ARM64("mov x0, x22");
    /* 0x00b91954: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91958:
    /* 0x00b91958: ldr      x25, [sp, #0x110] */ ARM64("ldr x25, [sp, #0x110]");
    /* 0x00b9195c: tbz      w24, #0, #0xb91980 */ if (((w24 >> #0) & 1) == 0) goto loc_00b91980;
loc_00b91960:
    /* 0x00b91960: cbz      x23, #0xb91980 */ if (x23 == 0) goto loc_00b91980;
    /* 0x00b91964: lsl      x8, x23, #4 */ ARM64("lsl x8, x23, #4");
    /* 0x00b91968: add      x9, x8, x23 */ ARM64("add x9, x8, x23");
    /* 0x00b9196c: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b91970: b.eq     #0xb91980 */ if (COND_EQ) goto loc_00b91980;
    /* 0x00b91974: sub      x8, x27, x8 */ ARM64("sub x8, x27, x8");
    /* 0x00b91978: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b9197c: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91980:
    /* 0x00b91980: ldxr     x8, [x21] */ ARM64("ldxr x8, [x21]");
    /* 0x00b91984: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b91988: stlxr    w9, x8, [x21] */ ARM64("stlxr w9, x8, [x21]");
    /* 0x00b9198c: cbnz     w9, #0xb91980 */ if (w9 != 0) goto loc_00b91980;
    /* 0x00b91990: b.ne     #0xb919a0 */ if (COND_NE) goto loc_00b919a0;
loc_00b91994:
    /* 0x00b91994: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91998: mov      x0, x21 */ ARM64("mov x0, x21");
    /* 0x00b9199c: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b919a0:
    /* 0x00b919a0: add      x0, sp, #0x160 */ ARM64("add x0, sp, #0x160");
    /* 0x00b919a4: bl       #0xb8cce0 */ CALL_DIRECT(sub_00b8cce0);
    /* 0x00b919a8: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b919ac: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00b919b0: cbz      x9, #0xb91a60 */ if (x9 == 0) goto loc_00b91a60;
loc_00b919b4:
    /* 0x00b919b4: lsl      x8, x9, #3 */ ARM64("lsl x8, x9, #3");
    /* 0x00b919b8: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b919bc: cmn      x9, #0x11 */ ARM64("cmn x9, #0x11");
    /* 0x00b919c0: b.eq     #0xb91a60 */ if (COND_EQ) goto loc_00b91a60;
    /* 0x00b919c4: ldr      x9, [sp, #0x120] */ ARM64("ldr x9, [sp, #0x120]");
    /* 0x00b919c8: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b919cc: sub      x0, x8, #8 */ ARM64("sub x0, x8, #8");
    /* 0x00b919d0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b919d4: mov      w19, #0 */ ARM64("mov w19, #0");
    /* 0x00b919d8: ldr      x20, [x25, #0x80] */ ARM64("ldr x20, [x25, #0x80]");
    /* 0x00b919dc: cbnz     x20, #0xb91ad4 */ if (x20 != 0) goto loc_00b91ad4;
    /* 0x00b919e0: b        #0xb91afc */ goto loc_00b91afc;
    /* 0x00b919e4: mov      x28, x0 */ ARM64("mov x28, x0");
loc_00b919e8:
    /* 0x00b919e8: ldxr     x8, [x20] */ ARM64("ldxr x8, [x20]");
    /* 0x00b919ec: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b919f0: stlxr    w9, x8, [x20] */ ARM64("stlxr w9, x8, [x20]");
    /* 0x00b919f4: cbnz     w9, #0xb919e8 */ if (w9 != 0) goto loc_00b919e8;
    /* 0x00b919f8: b.ne     #0xb91a08 */ if (COND_NE) goto loc_00b91a08;
    /* 0x00b919fc: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91a00: ldr      x0, [sp, #0x218] */ ARM64("ldr x0, [sp, #0x218]");
    /* 0x00b91a04: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
loc_00b91a08:
    /* 0x00b91a08: add      x0, sp, #0x1f0 */ ARM64("add x0, sp, #0x1f0");
    /* 0x00b91a0c: bl       #0xb8cdc4 */ CALL_DIRECT(sub_00b8cdc4);
loc_00b91a10:
    /* 0x00b91a10: sub      x0, x29, #0xf0 */ ARM64("sub x0, x29, #0xf0");
    /* 0x00b91a14: bl       #0xb86c48 */ CALL_DIRECT(sub_00b86c48);
loc_00b91a18:
    /* 0x00b91a18: ldxrb    w8, [x27] */ ARM64("ldxrb w8, [x27]");
    /* 0x00b91a1c: cmp      w8, #1 */ ARM64("cmp w8, #1");
    /* 0x00b91a20: b.ne     #0xb91a70 */ if (COND_NE) goto loc_00b91a70;
    /* 0x00b91a24: stlxrb   w8, wzr, [x27] */ ARM64("stlxrb w8, wzr, [x27]");
    /* 0x00b91a28: cbnz     w8, #0xb91a18 */ if (w8 != 0) goto loc_00b91a18;
loc_00b91a2c:
    /* 0x00b91a2c: ldxr     x8, [x19] */ ARM64("ldxr x8, [x19]");
    /* 0x00b91a30: subs     x8, x8, #1 */ ARM64("subs x8, x8, #1");
    /* 0x00b91a34: stlxr    w9, x8, [x19] */ ARM64("stlxr w9, x8, [x19]");
    /* 0x00b91a38: cbnz     w9, #0xb91a2c */ if (w9 != 0) goto loc_00b91a2c;
    /* 0x00b91a3c: b.ne     #0xb91a4c */ if (COND_NE) goto loc_00b91a4c;
    /* 0x00b91a40: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91a44: add      x0, sp, #0x1c8 */ ARM64("add x0, sp, #0x1c8");
    /* 0x00b91a48: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b91a4c:
    /* 0x00b91a4c: add      x0, sp, #0x3f0 */ ARM64("add x0, sp, #0x3f0");
    /* 0x00b91a50: bl       #0xb866a8 */ CALL_DIRECT(sub_00b866a8);
    /* 0x00b91a54: mov      w26, #0 */ ARM64("mov w26, #0");
    /* 0x00b91a58: ldr      x9, [sp, #0x128] */ ARM64("ldr x9, [sp, #0x128]");
    /* 0x00b91a5c: cbnz     x9, #0xb919b4 */ if (x9 != 0) goto loc_00b919b4;
loc_00b91a60:
    /* 0x00b91a60: mov      w19, #0 */ ARM64("mov w19, #0");
    /* 0x00b91a64: ldr      x20, [x25, #0x80] */ ARM64("ldr x20, [x25, #0x80]");
    /* 0x00b91a68: cbnz     x20, #0xb91ad4 */ if (x20 != 0) goto loc_00b91ad4;
    /* 0x00b91a6c: b        #0xb91afc */ goto loc_00b91afc;
loc_00b91a70:
    /* 0x00b91a70: clrex     */ ARM64("clrex");
    /* 0x00b91a74: add      x0, x19, #8 */ ARM64("add x0, x19, #8");
    /* 0x00b91a78: bl       #0xc75418 */ CALL_DIRECT(sub_00c75418);
    /* 0x00b91a7c: b        #0xb91a2c */ goto loc_00b91a2c;
    /* 0x00b91a80: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91a84: mov      x28, x0 */ ARM64("mov x28, x0");
    /* 0x00b91a88: ldr      x20, [sp, #0xc8] */ ARM64("ldr x20, [sp, #0xc8]");
loc_00b91a8c:
    /* 0x00b91a8c: add      x0, sp, #0x210 */ ARM64("add x0, sp, #0x210");
    /* 0x00b91a90: bl       #0xb867f8 */ CALL_DIRECT(sub_00b867f8);
loc_00b91a94:
    /* 0x00b91a94: cbz      x23, #0xb91ab8 */ if (x23 == 0) goto loc_00b91ab8;
    /* 0x00b91a98: lsl      x8, x23, #4 */ ARM64("lsl x8, x23, #4");
    /* 0x00b91a9c: add      x9, x8, x23 */ ARM64("add x9, x8, x23");
    /* 0x00b91aa0: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b91aa4: b.eq     #0xb91ab8 */ if (COND_EQ) goto loc_00b91ab8;
    /* 0x00b91aa8: ldr      x9, [sp, #0xc0] */ ARM64("ldr x9, [sp, #0xc0]");
    /* 0x00b91aac: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b91ab0: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b91ab4: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91ab8:
    /* 0x00b91ab8: cbz      x20, #0xb91ac4 */ if (x20 == 0) goto loc_00b91ac4;
    /* 0x00b91abc: ldr      x0, [sp, #0x108] */ ARM64("ldr x0, [sp, #0x108]");
loc_00b91ac0:
    /* 0x00b91ac0: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91ac4:
    /* 0x00b91ac4: mov      w26, #1 */ ARM64("mov w26, #1");
    /* 0x00b91ac8: mov      w19, #1 */ ARM64("mov w19, #1");
    /* 0x00b91acc: ldr      x20, [x25, #0x80] */ ARM64("ldr x20, [x25, #0x80]");
    /* 0x00b91ad0: cbz      x20, #0xb91afc */ if (x20 == 0) goto loc_00b91afc;
loc_00b91ad4:
    /* 0x00b91ad4: ldr      x21, [x25, #0x90] */ ARM64("ldr x21, [x25, #0x90]");
    /* 0x00b91ad8: cbnz     x21, #0xb91cac */ if (x21 != 0) goto loc_00b91cac;
loc_00b91adc:
    /* 0x00b91adc: lsl      x8, x20, #4 */ ARM64("lsl x8, x20, #4");
    /* 0x00b91ae0: add      x9, x8, x20 */ ARM64("add x9, x8, x20");
    /* 0x00b91ae4: cmn      x9, #0x19 */ ARM64("cmn x9, #0x19");
    /* 0x00b91ae8: b.eq     #0xb91afc */ if (COND_EQ) goto loc_00b91afc;
    /* 0x00b91aec: ldr      x9, [x25, #0x78] */ ARM64("ldr x9, [x25, #0x78]");
    /* 0x00b91af0: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b91af4: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b91af8: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91afc:
    /* 0x00b91afc: mov      x0, x25 */ ARM64("mov x0, x25");
    /* 0x00b91b00: bl       #0xb92b0c */ CALL_DIRECT(sub_00b92b0c);
    /* 0x00b91b04: tbz      w19, #0, #0xb91b4c */ if (((w19 >> #0) & 1) == 0) goto loc_00b91b4c;
    /* 0x00b91b08: ldr      x8, [x25, #0x50] */ ARM64("ldr x8, [x25, #0x50]");
    /* 0x00b91b0c: cbz      x8, #0xb91b28 */ if (x8 == 0) goto loc_00b91b28;
    /* 0x00b91b10: ldr      x9, [x25, #0x48] */ ARM64("ldr x9, [x25, #0x48]");
    /* 0x00b91b14: lsl      x8, x8, #3 */ ARM64("lsl x8, x8, #3");
    /* 0x00b91b18: add      x8, x8, #0xf */ ARM64("add x8, x8, #0xf");
    /* 0x00b91b1c: and      x8, x8, #0xfffffffffffffff8 */ ARM64("and x8, x8, #0xfffffffffffffff8");
    /* 0x00b91b20: sub      x0, x9, x8 */ ARM64("sub x0, x9, x8");
    /* 0x00b91b24: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91b28:
    /* 0x00b91b28: mov      x19, #0 */ ARM64("mov x19, #0");
    /* 0x00b91b2c: ldp      x20, x21, [x25, #0x38] */ ARM64("ldp x20, x21, [x25, #0x38]");
    /* 0x00b91b30: mov      w22, #0x30 */ ARM64("mov w22, #0x30");
    /* 0x00b91b34: cmp      x19, x21 */ ARM64("cmp x19, x21");
    /* 0x00b91b38: b.ne     #0xb91c7c */ if (COND_NE) goto loc_00b91c7c;
loc_00b91b3c:
    /* 0x00b91b3c: ldr      x8, [x25, #0x30] */ ARM64("ldr x8, [x25, #0x30]");
    /* 0x00b91b40: cbz      x8, #0xb91b4c */ if (x8 == 0) goto loc_00b91b4c;
    /* 0x00b91b44: ldr      x0, [x25, #0x38] */ ARM64("ldr x0, [x25, #0x38]");
    /* 0x00b91b48: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91b4c:
    /* 0x00b91b4c: tbz      w26, #0, #0xb91c38 */ if (((w26 >> #0) & 1) == 0) goto loc_00b91c38;
    /* 0x00b91b50: ldr      x19, [x25, #0xa0] */ ARM64("ldr x19, [x25, #0xa0]");
    /* 0x00b91b54: cbz      x19, #0xb91c38 */ if (x19 == 0) goto loc_00b91c38;
    /* 0x00b91b58: ldr      x20, [x25, #0xb0] */ ARM64("ldr x20, [x25, #0xb0]");
    /* 0x00b91b5c: cbz      x20, #0xb91c18 */ if (x20 == 0) goto loc_00b91c18;
    /* 0x00b91b60: ldr      x21, [x25, #0x98] */ ARM64("ldr x21, [x25, #0x98]");
    /* 0x00b91b64: mov      x22, x21 */ ARM64("mov x22, x21");
    /* 0x00b91b68: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b91b6c: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b91b70: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b91b74: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
loc_00b91b78:
    /* 0x00b91b78: cbnz     x23, #0xb91b94 */ if (x23 != 0) goto loc_00b91b94;
loc_00b91b7c:
    /* 0x00b91b7c: ldr      d0, [x22], #8 */ ARM64("ldr d0, [x22], #8");
    /* 0x00b91b80: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b91b84: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b91b88: sub      x21, x21, #0x100 */ ARM64("sub x21, x21, #0x100");
    /* 0x00b91b8c: and      x23, x8, #0x8080808080808080 */ ARM64("and x23, x8, #0x8080808080808080");
    /* 0x00b91b90: cbz      x23, #0xb91b7c */ if (x23 == 0) goto loc_00b91b7c;
loc_00b91b94:
    /* 0x00b91b94: rbit     x8, x23 */ ARM64("rbit x8, x23");
    /* 0x00b91b98: clz      x8, x8 */ ARM64("clz x8, x8");
    /* 0x00b91b9c: lsl      x8, x8, #2 */ ARM64("lsl x8, x8, #2");
    /* 0x00b91ba0: and      x8, x8, #0x1e0 */ ARM64("and x8, x8, #0x1e0");
    /* 0x00b91ba4: sub      x24, x21, x8 */ ARM64("sub x24, x21, x8");
    /* 0x00b91ba8: mov      x0, x24 */ ARM64("mov x0, x24");
    /* 0x00b91bac: ldr      x8, [x0, #-0x20]! */ ARM64("ldr x8, [x0, #-0x20]!");
loc_00b91bb0:
    /* 0x00b91bb0: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91bb4: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b91bb8: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91bbc: cbnz     w10, #0xb91bb0 */ if (w10 != 0) goto loc_00b91bb0;
    /* 0x00b91bc0: b.ne     #0xb91bcc */ if (COND_NE) goto loc_00b91bcc;
    /* 0x00b91bc4: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91bc8: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
loc_00b91bcc:
    /* 0x00b91bcc: ldur     x9, [x24, #-0x18] */ ARM64("ldur x9, [x24, #-0x18]");
    /* 0x00b91bd0: cbz      x9, #0xb91bf0 */ if (x9 == 0) goto loc_00b91bf0;
    /* 0x00b91bd4: ldp      x10, x8, [x24, #-0x10] */ ARM64("ldp x10, x8, [x24, #-0x10]");
    /* 0x00b91bd8: stp      xzr, x9, [x29, #-0xa0] */ ARM64("stp xzr, x9, [x29, #-0xa0]");
    /* 0x00b91bdc: stur     x10, [x29, #-0x90] */ ARM64("stur x10, [x29, #-0x90]");
    /* 0x00b91be0: stp      xzr, x9, [x29, #-0x80] */ ARM64("stp xzr, x9, [x29, #-0x80]");
    /* 0x00b91be4: stur     x10, [x29, #-0x70] */ ARM64("stur x10, [x29, #-0x70]");
    /* 0x00b91be8: mov      w9, #1 */ ARM64("mov w9, #1");
    /* 0x00b91bec: b        #0xb91bf4 */ goto loc_00b91bf4;
loc_00b91bf0:
    /* 0x00b91bf0: mov      x8, #0 */ ARM64("mov x8, #0");
loc_00b91bf4:
    /* 0x00b91bf4: stur     x9, [x29, #-0xa8] */ ARM64("stur x9, [x29, #-0xa8]");
    /* 0x00b91bf8: stur     x9, [x29, #-0x88] */ ARM64("stur x9, [x29, #-0x88]");
    /* 0x00b91bfc: stur     x8, [x29, #-0x68] */ ARM64("stur x8, [x29, #-0x68]");
    /* 0x00b91c00: sub      x0, x29, #0xa8 */ ARM64("sub x0, x29, #0xa8");
    /* 0x00b91c04: bl       #0xb86c48 */ CALL_DIRECT(sub_00b86c48);
    /* 0x00b91c08: sub      x8, x23, #1 */ ARM64("sub x8, x23, #1");
    /* 0x00b91c0c: and      x23, x8, x23 */ ARM64("and x23, x8, x23");
    /* 0x00b91c10: sub      x20, x20, #1 */ ARM64("sub x20, x20, #1");
    /* 0x00b91c14: cbnz     x20, #0xb91b78 */ if (x20 != 0) goto loc_00b91b78;
loc_00b91c18:
    /* 0x00b91c18: lsl      x8, x19, #5 */ ARM64("lsl x8, x19, #5");
    /* 0x00b91c1c: add      x9, x8, x19 */ ARM64("add x9, x8, x19");
    /* 0x00b91c20: cmn      x9, #0x29 */ ARM64("cmn x9, #0x29");
    /* 0x00b91c24: b.eq     #0xb91c38 */ if (COND_EQ) goto loc_00b91c38;
    /* 0x00b91c28: ldr      x9, [x25, #0x98] */ ARM64("ldr x9, [x25, #0x98]");
    /* 0x00b91c2c: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b91c30: sub      x0, x8, #0x20 */ ARM64("sub x0, x8, #0x20");
    /* 0x00b91c34: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
loc_00b91c38:
    /* 0x00b91c38: mov      x0, x28 */ ARM64("mov x0, x28");
    /* 0x00b91c3c: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
loc_00b91c40:
    /* 0x00b91c40: ldr      x9, [x23, #0x10] */ ARM64("ldr x9, [x23, #0x10]");
    /* 0x00b91c44: cmp      x9, #0 */ ARM64("cmp x9, #0");
    /* 0x00b91c48: lsl      x8, x9, #4 */ ARM64("lsl x8, x9, #4");
    /* 0x00b91c4c: add      x9, x8, x9 */ ARM64("add x9, x8, x9");
    /* 0x00b91c50: ccmn     x9, #0x19, #4, ne */ ARM64("ccmn x9, #0x19, #4, ne");
    /* 0x00b91c54: b.ne     #0xb91c64 */ if (COND_NE) goto loc_00b91c64;
    /* 0x00b91c58: cmp      x19, x21 */ ARM64("cmp x19, x21");
    /* 0x00b91c5c: b.ne     #0xb91c7c */ if (COND_NE) goto loc_00b91c7c;
    /* 0x00b91c60: b        #0xb91b3c */ goto loc_00b91b3c;
loc_00b91c64:
    /* 0x00b91c64: ldr      x9, [x23, #8] */ ARM64("ldr x9, [x23, #8]");
    /* 0x00b91c68: sub      x8, x9, x8 */ ARM64("sub x8, x9, x8");
    /* 0x00b91c6c: sub      x0, x8, #0x10 */ ARM64("sub x0, x8, #0x10");
    /* 0x00b91c70: bl       #0xc7ab98 */ CALL_DIRECT(sub_00c7ab98);
    /* 0x00b91c74: cmp      x19, x21 */ ARM64("cmp x19, x21");
    /* 0x00b91c78: b.eq     #0xb91b3c */ if (COND_EQ) goto loc_00b91b3c;
loc_00b91c7c:
    /* 0x00b91c7c: madd     x23, x19, x22, x20 */ ARM64("madd x23, x19, x22, x20");
    /* 0x00b91c80: add      x19, x19, #1 */ ARM64("add x19, x19, #1");
    /* 0x00b91c84: ldr      x8, [x23] */ ARM64("ldr x8, [x23]");
loc_00b91c88:
    /* 0x00b91c88: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91c8c: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b91c90: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91c94: cbnz     w10, #0xb91c88 */ if (w10 != 0) goto loc_00b91c88;
    /* 0x00b91c98: b.ne     #0xb91c40 */ if (COND_NE) goto loc_00b91c40;
    /* 0x00b91c9c: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91ca0: ldr      x0, [x23] */ ARM64("ldr x0, [x23]");
    /* 0x00b91ca4: bl       #0xb86a90 */ CALL_DIRECT(sub_00b86a90);
    /* 0x00b91ca8: b        #0xb91c40 */ goto loc_00b91c40;
loc_00b91cac:
    /* 0x00b91cac: ldr      x22, [x25, #0x78] */ ARM64("ldr x22, [x25, #0x78]");
    /* 0x00b91cb0: mov      x23, x22 */ ARM64("mov x23, x22");
    /* 0x00b91cb4: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00b91cb8: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b91cbc: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b91cc0: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b91cc4: b        #0xb91ccc */ goto loc_00b91ccc;
loc_00b91cc8:
    /* 0x00b91cc8: cbz      x21, #0xb91adc */ if (x21 == 0) goto loc_00b91adc;
loc_00b91ccc:
    /* 0x00b91ccc: cbnz     x24, #0xb91ce8 */ if (x24 != 0) goto loc_00b91ce8;
loc_00b91cd0:
    /* 0x00b91cd0: ldr      d0, [x23], #8 */ ARM64("ldr d0, [x23], #8");
    /* 0x00b91cd4: cmge     v0.8b, v0.8b, #0 */ ARM64("cmge v0.8b, v0.8b, #0");
    /* 0x00b91cd8: fmov     x8, d0 */ ARM64("fmov x8, d0");
    /* 0x00b91cdc: sub      x22, x22, #0x80 */ ARM64("sub x22, x22, #0x80");
    /* 0x00b91ce0: and      x24, x8, #0x8080808080808080 */ ARM64("and x24, x8, #0x8080808080808080");
    /* 0x00b91ce4: cbz      x24, #0xb91cd0 */ if (x24 == 0) goto loc_00b91cd0;
loc_00b91ce8:
    /* 0x00b91ce8: sub      x8, x24, #1 */ ARM64("sub x8, x24, #1");
    /* 0x00b91cec: rbit     x9, x24 */ ARM64("rbit x9, x24");
    /* 0x00b91cf0: clz      x9, x9 */ ARM64("clz x9, x9");
    /* 0x00b91cf4: and      x24, x8, x24 */ ARM64("and x24, x8, x24");
    /* 0x00b91cf8: lsl      x8, x9, #1 */ ARM64("lsl x8, x9, #1");
    /* 0x00b91cfc: and      x8, x8, #0xf0 */ ARM64("and x8, x8, #0xf0");
    /* 0x00b91d00: sub      x0, x22, x8 */ ARM64("sub x0, x22, x8");
    /* 0x00b91d04: sub      x21, x21, #1 */ ARM64("sub x21, x21, #1");
    /* 0x00b91d08: ldr      x8, [x0, #-0x10]! */ ARM64("ldr x8, [x0, #-0x10]!");
loc_00b91d0c:
    /* 0x00b91d0c: ldxr     x9, [x8] */ ARM64("ldxr x9, [x8]");
    /* 0x00b91d10: subs     x9, x9, #1 */ ARM64("subs x9, x9, #1");
    /* 0x00b91d14: stlxr    w10, x9, [x8] */ ARM64("stlxr w10, x9, [x8]");
    /* 0x00b91d18: cbnz     w10, #0xb91d0c */ if (w10 != 0) goto loc_00b91d0c;
    /* 0x00b91d1c: b.ne     #0xb91cc8 */ if (COND_NE) goto loc_00b91cc8;
    /* 0x00b91d20: dmb      ishld */ ARM64("dmb ishld");
    /* 0x00b91d24: bl       #0xb869ec */ CALL_DIRECT(sub_00b869ec);
    /* 0x00b91d28: b        #0xb91cc8 */ goto loc_00b91cc8;
    /* 0x00b91d2c: sub      x0, x24, #0x18 */ ARM64("sub x0, x24, #0x18");
    /* 0x00b91d30: bl       #0xb86bf4 */ CALL_DIRECT(sub_00b86bf4);
    /* 0x00b91d34: b        #0xb91d44 */ goto loc_00b91d44;
    /* 0x00b91d38: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91d3c: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
    /* 0x00b91d40: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
loc_00b91d44:
    /* 0x00b91d44: bl       #0xc73e0c */ CALL_DIRECT(sub_00c73e0c);
}
