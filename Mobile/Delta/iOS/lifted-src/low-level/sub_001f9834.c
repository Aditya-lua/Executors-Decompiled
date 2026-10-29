/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x1f9834..0x1f9868 (52 bytes). */
#include "../lift_runtime.hpp"

void sub_001f9834(Arm64Context& cpu) {
    /* 0x001f9834: udf      #0x10 */ ARM64("udf #0x10");
    /* 0x001f9838: udf      #0x70c */ ARM64("udf #0x70c");
    /* 0x001f983c: udf      #0x410 */ ARM64("udf #0x410");
    /* 0x001f9840: udf      #0x540 */ ARM64("udf #0x540");
    /* 0x001f9844: udf      #0x284 */ ARM64("udf #0x284");
    /* 0x001f9848: udf      #0x99c */ ARM64("udf #0x99c");
    /* 0x001f984c: udf      #0xa1c */ ARM64("udf #0xa1c");
    /* 0x001f9850: udf      #0x7bc */ ARM64("udf #0x7bc");
    /* 0x001f9854: udf      #0xa78 */ ARM64("udf #0xa78");
    /* 0x001f9858: udf      #0x304 */ ARM64("udf #0x304");
    /* 0x001f985c: udf      #0xb28 */ ARM64("udf #0xb28");
    /* 0x001f9860: udf      #0x154 */ ARM64("udf #0x154");
    /* 0x001f9864: udf      #0x360 */ ARM64("udf #0x360");
}
