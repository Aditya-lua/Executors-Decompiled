
void FUN_0060cb18(void)

{
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined1 uStack0000000000000098;
  
  func_0x005fc898();
  func_0x005fde88();
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
  if (in_stack_00000020 <= in_stack_00000018) {
    in_stack_00000018 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
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
  func_0x00610518(&uStack0000000000000098);
  return;
}

