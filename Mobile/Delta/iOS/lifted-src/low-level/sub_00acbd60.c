/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xacbd60..0xacbdc0 (96 bytes). */
#include "../lift_runtime.hpp"

void sub_00acbd60(Arm64Context& cpu) {
    /* 0x00acbd60: ld1      {v16.4s}, [x0] */ ARM64("ld1 {v16.4s}, [x0]");
    /* 0x00acbd64: ld1      {v0.4s, v1.4s, v2.4s, v3.4s}, [x2], #64 */ ARM64("ld1 {v0.4s, v1.4s, v2.4s, v3.4s}, [x2], #64");
    /* 0x00acbd68: ld1      {v4.4s, v5.4s, v6.4s, v7.4s}, [x2] */ ARM64("ld1 {v4.4s, v5.4s, v6.4s, v7.4s}, [x2]");
    /* 0x00acbd6c: rev32    v16.16b, v16.16b */ ARM64("rev32 v16.16b, v16.16b");
    /* 0x00acbd70: sm4e     v16.4s, v0.4s */ ARM64("sm4e v16.4s, v0.4s");
    /* 0x00acbd74: sm4e     v16.4s, v1.4s */ ARM64("sm4e v16.4s, v1.4s");
    /* 0x00acbd78: sm4e     v16.4s, v2.4s */ ARM64("sm4e v16.4s, v2.4s");
    /* 0x00acbd7c: sm4e     v16.4s, v3.4s */ ARM64("sm4e v16.4s, v3.4s");
    /* 0x00acbd80: sm4e     v16.4s, v4.4s */ ARM64("sm4e v16.4s, v4.4s");
    /* 0x00acbd84: sm4e     v16.4s, v5.4s */ ARM64("sm4e v16.4s, v5.4s");
    /* 0x00acbd88: sm4e     v16.4s, v6.4s */ ARM64("sm4e v16.4s, v6.4s");
    /* 0x00acbd8c: sm4e     v16.4s, v7.4s */ ARM64("sm4e v16.4s, v7.4s");
    /* 0x00acbd90: rev64    v16.4s, v16.4s */ ARM64("rev64 v16.4s, v16.4s");
    /* 0x00acbd94: ext      v16.16b, v16.16b, v16.16b, #8 */ ARM64("ext v16.16b, v16.16b, v16.16b, #8");
    /* 0x00acbd98: rev32    v16.16b, v16.16b */ ARM64("rev32 v16.16b, v16.16b");
    /* 0x00acbd9c: st1      {v16.4s}, [x1] */ ARM64("st1 {v16.4s}, [x1]");
    /* 0x00acbda0: ret       */ return;
    /* 0x00acbda4: nop       */ ARM64("nop");
    /* 0x00acbda8: nop       */ ARM64("nop");
    /* 0x00acbdac: nop       */ ARM64("nop");
    /* 0x00acbdb0: nop       */ ARM64("nop");
    /* 0x00acbdb4: nop       */ ARM64("nop");
    /* 0x00acbdb8: nop       */ ARM64("nop");
    /* 0x00acbdbc: nop       */ ARM64("nop");
}
