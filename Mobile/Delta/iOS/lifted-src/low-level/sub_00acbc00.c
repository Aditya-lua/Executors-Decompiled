/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xacbc00..0xacbc60 (96 bytes). */
#include "../lift_runtime.hpp"

void sub_00acbc00(Arm64Context& cpu) {
    /* 0x00acbc00: ld1      {v0.4s}, [x0] */ ARM64("ld1 {v0.4s}, [x0]");
    /* 0x00acbc04: adrp     x2, #0xdf8000 */ ARM64("adrp x2, #0xdf8000");
    /* 0x00acbc08: add      x2, x2, #0x840 */ ARM64("add x2, x2, #0x840");
    /* 0x00acbc0c: ld1      {v24.4s}, [x2] */ ARM64("ld1 {v24.4s}, [x2]");
    /* 0x00acbc10: adrp     x2, #0xdf8000 */ ARM64("adrp x2, #0xdf8000");
    /* 0x00acbc14: add      x2, x2, #0x7c0 */ ARM64("add x2, x2, #0x7c0");
    /* 0x00acbc18: ld1      {v16.4s, v17.4s, v18.4s, v19.4s}, [x2], #64 */ ARM64("ld1 {v16.4s, v17.4s, v18.4s, v19.4s}, [x2], #64");
    /* 0x00acbc1c: rev32    v0.16b, v0.16b */ ARM64("rev32 v0.16b, v0.16b");
    /* 0x00acbc20: ld1      {v20.4s, v21.4s, v22.4s, v23.4s}, [x2] */ ARM64("ld1 {v20.4s, v21.4s, v22.4s, v23.4s}, [x2]");
    /* 0x00acbc24: eor      v0.16b, v0.16b, v24.16b */ ARM64("eor v0.16b, v0.16b, v24.16b");
    /* 0x00acbc28: sm4ekey  v0.4s, v0.4s, v16.4s */ ARM64("sm4ekey v0.4s, v0.4s, v16.4s");
    /* 0x00acbc2c: sm4ekey  v1.4s, v0.4s, v17.4s */ ARM64("sm4ekey v1.4s, v0.4s, v17.4s");
    /* 0x00acbc30: sm4ekey  v2.4s, v1.4s, v18.4s */ ARM64("sm4ekey v2.4s, v1.4s, v18.4s");
    /* 0x00acbc34: sm4ekey  v3.4s, v2.4s, v19.4s */ ARM64("sm4ekey v3.4s, v2.4s, v19.4s");
    /* 0x00acbc38: sm4ekey  v4.4s, v3.4s, v20.4s */ ARM64("sm4ekey v4.4s, v3.4s, v20.4s");
    /* 0x00acbc3c: st1      {v0.4s, v1.4s, v2.4s, v3.4s}, [x1], #64 */ ARM64("st1 {v0.4s, v1.4s, v2.4s, v3.4s}, [x1], #64");
    /* 0x00acbc40: sm4ekey  v5.4s, v4.4s, v21.4s */ ARM64("sm4ekey v5.4s, v4.4s, v21.4s");
    /* 0x00acbc44: sm4ekey  v6.4s, v5.4s, v22.4s */ ARM64("sm4ekey v6.4s, v5.4s, v22.4s");
    /* 0x00acbc48: sm4ekey  v7.4s, v6.4s, v23.4s */ ARM64("sm4ekey v7.4s, v6.4s, v23.4s");
    /* 0x00acbc4c: st1      {v4.4s, v5.4s, v6.4s, v7.4s}, [x1] */ ARM64("st1 {v4.4s, v5.4s, v6.4s, v7.4s}, [x1]");
    /* 0x00acbc50: ret       */ return;
    /* 0x00acbc54: nop       */ ARM64("nop");
    /* 0x00acbc58: nop       */ ARM64("nop");
    /* 0x00acbc5c: nop       */ ARM64("nop");
}
