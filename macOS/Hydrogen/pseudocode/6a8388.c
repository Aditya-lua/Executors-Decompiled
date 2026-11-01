
void FUN_006a8388(void)

{
  long lVar1;
  long unaff_x20;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  func_0x0060a860();
  lVar1 = func_0x00609cf4();
  if (lVar1 == 0xc) {
    func_0x005fe0b4();
  }
  else {
    func_0x00607398(unaff_x20 + 0x18);
  }
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  return;
}

