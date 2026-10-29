/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0xac96b0..0xac96b8 (8 bytes). */
#include "../lift_runtime.hpp"

void sub_00ac96b0(Arm64Context& cpu) {
    /* 0x00ac96b0: ldrsh    w25, [x8, #0x622] */ ARM64("ldrsh w25, [x8, #0x622]");
    /* 0x00ac96b4: .byte    0x87, 0x7a, 0x8a, 0x9d */ ARM64(".byte 0x87, 0x7a, 0x8a, 0x9d");
}
