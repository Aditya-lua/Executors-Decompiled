
void FUN_0065c6a8(void)

{
  long unaff_x24;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  undefined1 in_stack_00000090;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  
  *(undefined1 *)(unaff_x24 + 0x68) = in_stack_00000090;
  func_0x005ffccc();
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
  if (in_stack_00000078 <= in_stack_00000070) {
    in_stack_00000070 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (in_stack_00000070 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + in_stack_00000070 * 8) = 0;
        in_stack_00000070 = in_stack_00000070 - 1;
      } while (in_stack_00000070 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  return;
}

