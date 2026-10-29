/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x9d95fc..0x9d9620 (36 bytes). */
#include "../lift_runtime.hpp"

void sub_009d95fc(Arm64Context& cpu) {
    /* 0x009d95fc: ldr      x0, [x0, #8] */ ARM64("ldr x0, [x0, #8]");
    /* 0x009d9600: b        #0x9d5274 */ goto sub_009d5274;
    /* 0x009d9604: udf      #0 */ ARM64("udf #0");
    /* 0x009d9608: udf      #0 */ ARM64("udf #0");
    /* 0x009d960c: udf      #0 */ ARM64("udf #0");
    /* 0x009d9610: udf      #0 */ ARM64("udf #0");
    /* 0x009d9614: udf      #0 */ ARM64("udf #0");
    /* 0x009d9618: udf      #0 */ ARM64("udf #0");
    /* 0x009d961c: udf      #0 */ ARM64("udf #0");
}
