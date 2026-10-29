/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xacbc60..0xacbd00 (160 bytes). */
#include "../lift_runtime.hpp"

void sub_00acbc60(Arm64Context& cpu) {
    /* 0x00acbc60: ld1      {v7.4s}, [x0] */ ARM64("ld1 {v7.4s}, [x0]");
    /* 0x00acbc64: adrp     x2, #0xdf8000 */ ARM64("adrp x2, #0xdf8000");
    /* 0x00acbc68: add      x2, x2, #0x840 */ ARM64("add x2, x2, #0x840");
    /* 0x00acbc6c: ld1      {v24.4s}, [x2] */ ARM64("ld1 {v24.4s}, [x2]");
    /* 0x00acbc70: adrp     x2, #0xdf8000 */ ARM64("adrp x2, #0xdf8000");
    /* 0x00acbc74: add      x2, x2, #0x7c0 */ ARM64("add x2, x2, #0x7c0");
    /* 0x00acbc78: ld1      {v16.4s, v17.4s, v18.4s, v19.4s}, [x2], #64 */ ARM64("ld1 {v16.4s, v17.4s, v18.4s, v19.4s}, [x2], #64");
    /* 0x00acbc7c: rev32    v7.16b, v7.16b */ ARM64("rev32 v7.16b, v7.16b");
    /* 0x00acbc80: ld1      {v20.4s, v21.4s, v22.4s, v23.4s}, [x2] */ ARM64("ld1 {v20.4s, v21.4s, v22.4s, v23.4s}, [x2]");
    /* 0x00acbc84: eor      v7.16b, v7.16b, v24.16b */ ARM64("eor v7.16b, v7.16b, v24.16b");
    /* 0x00acbc88: sm4ekey  v7.4s, v7.4s, v16.4s */ ARM64("sm4ekey v7.4s, v7.4s, v16.4s");
    /* 0x00acbc8c: sm4ekey  v6.4s, v7.4s, v17.4s */ ARM64("sm4ekey v6.4s, v7.4s, v17.4s");
    /* 0x00acbc90: sm4ekey  v5.4s, v6.4s, v18.4s */ ARM64("sm4ekey v5.4s, v6.4s, v18.4s");
    /* 0x00acbc94: rev64    v7.4s, v7.4s */ ARM64("rev64 v7.4s, v7.4s");
    /* 0x00acbc98: rev64    v6.4s, v6.4s */ ARM64("rev64 v6.4s, v6.4s");
    /* 0x00acbc9c: ext      v7.16b, v7.16b, v7.16b, #8 */ ARM64("ext v7.16b, v7.16b, v7.16b, #8");
    /* 0x00acbca0: ext      v6.16b, v6.16b, v6.16b, #8 */ ARM64("ext v6.16b, v6.16b, v6.16b, #8");
    /* 0x00acbca4: sm4ekey  v4.4s, v5.4s, v19.4s */ ARM64("sm4ekey v4.4s, v5.4s, v19.4s");
    /* 0x00acbca8: sm4ekey  v3.4s, v4.4s, v20.4s */ ARM64("sm4ekey v3.4s, v4.4s, v20.4s");
    /* 0x00acbcac: rev64    v5.4s, v5.4s */ ARM64("rev64 v5.4s, v5.4s");
    /* 0x00acbcb0: rev64    v4.4s, v4.4s */ ARM64("rev64 v4.4s, v4.4s");
    /* 0x00acbcb4: ext      v5.16b, v5.16b, v5.16b, #8 */ ARM64("ext v5.16b, v5.16b, v5.16b, #8");
    /* 0x00acbcb8: ext      v4.16b, v4.16b, v4.16b, #8 */ ARM64("ext v4.16b, v4.16b, v4.16b, #8");
    /* 0x00acbcbc: sm4ekey  v2.4s, v3.4s, v21.4s */ ARM64("sm4ekey v2.4s, v3.4s, v21.4s");
    /* 0x00acbcc0: sm4ekey  v1.4s, v2.4s, v22.4s */ ARM64("sm4ekey v1.4s, v2.4s, v22.4s");
    /* 0x00acbcc4: rev64    v3.4s, v3.4s */ ARM64("rev64 v3.4s, v3.4s");
    /* 0x00acbcc8: rev64    v2.4s, v2.4s */ ARM64("rev64 v2.4s, v2.4s");
    /* 0x00acbccc: ext      v3.16b, v3.16b, v3.16b, #8 */ ARM64("ext v3.16b, v3.16b, v3.16b, #8");
    /* 0x00acbcd0: ext      v2.16b, v2.16b, v2.16b, #8 */ ARM64("ext v2.16b, v2.16b, v2.16b, #8");
    /* 0x00acbcd4: sm4ekey  v0.4s, v1.4s, v23.4s */ ARM64("sm4ekey v0.4s, v1.4s, v23.4s");
    /* 0x00acbcd8: rev64    v1.4s, v1.4s */ ARM64("rev64 v1.4s, v1.4s");
    /* 0x00acbcdc: rev64    v0.4s, v0.4s */ ARM64("rev64 v0.4s, v0.4s");
    /* 0x00acbce0: ext      v1.16b, v1.16b, v1.16b, #8 */ ARM64("ext v1.16b, v1.16b, v1.16b, #8");
    /* 0x00acbce4: ext      v0.16b, v0.16b, v0.16b, #8 */ ARM64("ext v0.16b, v0.16b, v0.16b, #8");
    /* 0x00acbce8: st1      {v0.4s, v1.4s, v2.4s, v3.4s}, [x1], #64 */ ARM64("st1 {v0.4s, v1.4s, v2.4s, v3.4s}, [x1], #64");
    /* 0x00acbcec: st1      {v4.4s, v5.4s, v6.4s, v7.4s}, [x1] */ ARM64("st1 {v4.4s, v5.4s, v6.4s, v7.4s}, [x1]");
    /* 0x00acbcf0: ret       */ return;
    /* 0x00acbcf4: nop       */ ARM64("nop");
    /* 0x00acbcf8: nop       */ ARM64("nop");
    /* 0x00acbcfc: nop       */ ARM64("nop");
}
