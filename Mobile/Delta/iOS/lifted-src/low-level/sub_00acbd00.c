/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xacbd00..0xacbd60 (96 bytes). */
#include "../lift_runtime.hpp"

void sub_00acbd00(Arm64Context& cpu) {
    /* 0x00acbd00: ld1      {v16.4s}, [x0] */ ARM64("ld1 {v16.4s}, [x0]");
    /* 0x00acbd04: ld1      {v0.4s, v1.4s, v2.4s, v3.4s}, [x2], #64 */ ARM64("ld1 {v0.4s, v1.4s, v2.4s, v3.4s}, [x2], #64");
    /* 0x00acbd08: ld1      {v4.4s, v5.4s, v6.4s, v7.4s}, [x2] */ ARM64("ld1 {v4.4s, v5.4s, v6.4s, v7.4s}, [x2]");
    /* 0x00acbd0c: rev32    v16.16b, v16.16b */ ARM64("rev32 v16.16b, v16.16b");
    /* 0x00acbd10: sm4e     v16.4s, v0.4s */ ARM64("sm4e v16.4s, v0.4s");
    /* 0x00acbd14: sm4e     v16.4s, v1.4s */ ARM64("sm4e v16.4s, v1.4s");
    /* 0x00acbd18: sm4e     v16.4s, v2.4s */ ARM64("sm4e v16.4s, v2.4s");
    /* 0x00acbd1c: sm4e     v16.4s, v3.4s */ ARM64("sm4e v16.4s, v3.4s");
    /* 0x00acbd20: sm4e     v16.4s, v4.4s */ ARM64("sm4e v16.4s, v4.4s");
    /* 0x00acbd24: sm4e     v16.4s, v5.4s */ ARM64("sm4e v16.4s, v5.4s");
    /* 0x00acbd28: sm4e     v16.4s, v6.4s */ ARM64("sm4e v16.4s, v6.4s");
    /* 0x00acbd2c: sm4e     v16.4s, v7.4s */ ARM64("sm4e v16.4s, v7.4s");
    /* 0x00acbd30: rev64    v16.4s, v16.4s */ ARM64("rev64 v16.4s, v16.4s");
    /* 0x00acbd34: ext      v16.16b, v16.16b, v16.16b, #8 */ ARM64("ext v16.16b, v16.16b, v16.16b, #8");
    /* 0x00acbd38: rev32    v16.16b, v16.16b */ ARM64("rev32 v16.16b, v16.16b");
    /* 0x00acbd3c: st1      {v16.4s}, [x1] */ ARM64("st1 {v16.4s}, [x1]");
    /* 0x00acbd40: ret       */ return;
    /* 0x00acbd44: nop       */ ARM64("nop");
    /* 0x00acbd48: nop       */ ARM64("nop");
    /* 0x00acbd4c: nop       */ ARM64("nop");
    /* 0x00acbd50: nop       */ ARM64("nop");
    /* 0x00acbd54: nop       */ ARM64("nop");
    /* 0x00acbd58: nop       */ ARM64("nop");
    /* 0x00acbd5c: nop       */ ARM64("nop");
}
