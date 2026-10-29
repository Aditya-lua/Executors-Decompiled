/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x1f6a18..0x1f6a4c (52 bytes). */
#include "../lift_runtime.hpp"

void sub_001f6a18(Arm64Context& cpu) {
    /* 0x001f6a18: udf      #0x10 */ ARM64("udf #0x10");
    /* 0x001f6a1c: udf      #0x5fc */ ARM64("udf #0x5fc");
    /* 0x001f6a20: udf      #0x160 */ ARM64("udf #0x160");
    /* 0x001f6a24: udf      #0x6ac */ ARM64("udf #0x6ac");
    /* 0x001f6a28: udf      #0x290 */ ARM64("udf #0x290");
    /* 0x001f6a2c: udf      #0x878 */ ARM64("udf #0x878");
    /* 0x001f6a30: udf      #0x8f8 */ ARM64("udf #0x8f8");
    /* 0x001f6a34: udf      #0x954 */ ARM64("udf #0x954");
    /* 0x001f6a38: udf      #0xa84 */ ARM64("udf #0xa84");
    /* 0x001f6a3c: udf      #0x310 */ ARM64("udf #0x310");
    /* 0x001f6a40: udf      #0xb34 */ ARM64("udf #0xb34");
    /* 0x001f6a44: udf      #0x36c */ ARM64("udf #0x36c");
    /* 0x001f6a48: udf      #0x49c */ ARM64("udf #0x49c");
}
