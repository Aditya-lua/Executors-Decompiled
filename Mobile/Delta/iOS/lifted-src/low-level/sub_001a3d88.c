/* Instruction-faithful low-level lift; not original vendor source.
 * Mach-O extent: 0x1a3d88..0x1a3dd4 (76 bytes). */
#include "../lift_runtime.hpp"

void sub_001a3d88(Arm64Context& cpu) {
    /* 0x001a3d88: stp      x20, x19, [sp, #-0x20]! */ ARM64("stp x20, x19, [sp, #-0x20]!");
    /* 0x001a3d8c: stp      x29, x30, [sp, #0x10] */ ARM64("stp x29, x30, [sp, #0x10]");
    /* 0x001a3d90: add      x29, sp, #0x10 */ ARM64("add x29, sp, #0x10");
    /* 0x001a3d94: mov      w0, #0x18 */ ARM64("mov w0, #0x18");
    /* 0x001a3d98: bl       #0xc7a844 */ CALL_DIRECT(sub_00c7a844);
    /* 0x001a3d9c: mov      x19, x0 */ ARM64("mov x19, x0");
    /* 0x001a3da0: mov      w1, #0xf */ ARM64("mov w1, #0xf");
    /* 0x001a3da4: bl       #0xc7a424 */ CALL_DIRECT(sub_00c7a424);
    /* 0x001a3da8: adrp     x1, #0xe6f000 */ ARM64("adrp x1, #0xe6f000");
    /* 0x001a3dac: add      x1, x1, #0xb60 */ ARM64("add x1, x1, #0xb60");
    /* 0x001a3db0: adrp     x2, #0xe5c000 */ ARM64("adrp x2, #0xe5c000");
    /* 0x001a3db4: ldr      x2, [x2, #0x28] */ ARM64("ldr x2, [x2, #0x28]");
    /* 0x001a3db8: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x001a3dbc: bl       #0xc7a8b0 */ CALL_DIRECT(sub_00c7a8b0);
    /* 0x001a3dc0: mov      x20, x0 */ ARM64("mov x20, x0");
    /* 0x001a3dc4: mov      x0, x19 */ ARM64("mov x0, x19");
    /* 0x001a3dc8: bl       #0xc7a874 */ CALL_DIRECT(sub_00c7a874);
    /* 0x001a3dcc: mov      x0, x20 */ ARM64("mov x0, x20");
    /* 0x001a3dd0: bl       #0xc7a334 */ CALL_DIRECT(sub_00c7a334);
}
