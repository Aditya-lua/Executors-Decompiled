
void FUN_0063c10c(long param_1)

{
  ulong in_x9;
  undefined8 unaff_x21;
  long unaff_x29;
  ulong in_stack_00000018;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  undefined1 uStack00000000000000e8;
  
  if (in_x9 <= in_stack_00000018) {
    in_stack_00000018 = in_x9;
  }
  if (param_1 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(param_1 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
  func_0x00639c70();
  if (in_stack_00000050 <= in_stack_00000048) {
    in_stack_00000048 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (in_stack_00000048 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + in_stack_00000048 * 8) = 0;
        in_stack_00000048 = in_stack_00000048 - 1;
      } while (in_stack_00000048 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000080 <= in_stack_00000078) {
    in_stack_00000078 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (in_stack_00000078 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + in_stack_00000078 * 8) = 0;
        in_stack_00000078 = in_stack_00000078 - 1;
      } while (in_stack_00000078 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000d0 <= in_stack_000000c8) {
    in_stack_000000c8 = in_stack_000000d0;
  }
  if (in_stack_000000d8 != 0) {
    if (in_stack_000000c8 != 0) {
      do {
        *(undefined8 *)(in_stack_000000d8 + -8 + in_stack_000000c8 * 8) = 0;
        in_stack_000000c8 = in_stack_000000c8 - 1;
      } while (in_stack_000000c8 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000b0 <= in_stack_000000a8) {
    in_stack_000000a8 = in_stack_000000b0;
  }
  if (in_stack_000000b8 != 0) {
    if (in_stack_000000a8 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b8 + -8 + in_stack_000000a8 * 8) = 0;
        in_stack_000000a8 = in_stack_000000a8 - 1;
      } while (in_stack_000000a8 != 0);
    }
    func_0x00611644();
  }
  func_0x0065556c(&uStack00000000000000e8);
  *(undefined8 *)(unaff_x29 + -0x50) = unaff_x21;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  return;
}

