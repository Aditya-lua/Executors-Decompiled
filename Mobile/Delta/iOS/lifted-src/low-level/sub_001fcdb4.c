/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x1fcdb4..0x1fcde8 (52 bytes). */
#include "../lift_runtime.hpp"

void sub_001fcdb4(Arm64Context& cpu) {
    /* 0x001fcdb4: udf      #0x10 */ ARM64("udf #0x10");
    /* 0x001fcdb8: udf      #0x86c */ ARM64("udf #0x86c");
    /* 0x001fcdbc: udf      #0x424 */ ARM64("udf #0x424");
    /* 0x001fcdc0: udf      #0x55c */ ARM64("udf #0x55c");
    /* 0x001fcdc4: udf      #0x294 */ ARM64("udf #0x294");
    /* 0x001fcdc8: udf      #0x91c */ ARM64("udf #0x91c");
    /* 0x001fcdcc: udf      #0xa50 */ ARM64("udf #0xa50");
    /* 0x001fcdd0: udf      #0x734 */ ARM64("udf #0x734");
    /* 0x001fcdd4: udf      #0xaac */ ARM64("udf #0xaac");
    /* 0x001fcdd8: udf      #0x3c8 */ ARM64("udf #0x3c8");
    /* 0x001fcddc: udf      #0xb5c */ ARM64("udf #0xb5c");
    /* 0x001fcde0: udf      #0x15c */ ARM64("udf #0x15c");
    /* 0x001fcde4: udf      #0x318 */ ARM64("udf #0x318");
}
