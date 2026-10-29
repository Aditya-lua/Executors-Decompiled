/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xac8fc4..0xac9000 (60 bytes). */
#include "../lift_runtime.hpp"

void sub_00ac8fc4(Arm64Context& cpu) {
    /* 0x00ac8fc4: stp      x20, x19, [sp, #-0x20]! */ ARM64("stp x20, x19, [sp, #-0x20]!");
    /* 0x00ac8fc8: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x00ac8fcc: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x00ac8fd0: mov      x19, x1 */ ARM64("mov x19, x1");
    /* 0x00ac8fd4: bl       #0x975ff4 */ CALL_DIRECT(sub_00975ff4);
    /* 0x00ac8fd8: mov      x1, x0 */ ARM64("mov x1, x0");
    /* 0x00ac8fdc: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x00ac8fe0: ldp      x29, x30, [sp, #0x10] */ ARM64("ldp x29, x30, [sp, #0x10]");
    /* 0x00ac8fe4: ldp      x20, x19, [sp], #0x20 */ ARM64("ldp x20, x19, [sp], #0x20");
    /* 0x00ac8fe8: b        #0xacba80 */ goto sub_00acba80;
    /* 0x00ac8fec: udf      #0 */ ARM64("udf #0");
    /* 0x00ac8ff0: udf      #0 */ ARM64("udf #0");
    /* 0x00ac8ff4: udf      #0 */ ARM64("udf #0");
    /* 0x00ac8ff8: udf      #0 */ ARM64("udf #0");
    /* 0x00ac8ffc: udf      #0 */ ARM64("udf #0");
}
