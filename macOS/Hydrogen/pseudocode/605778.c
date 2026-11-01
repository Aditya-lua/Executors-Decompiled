
void FUN_00605778(void)

{
  uint uVar1;
  uint uVar2;
  uint in_w8;
  uint in_w9;
  uint in_w10;
  ulong *unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  while( true ) {
    uVar2 = in_w10 >> 1;
    uVar1 = uVar2;
    if (unaff_x22 >> ((ulong)uVar2 & 0x3f) != 0) {
      uVar1 = in_w9;
      in_w8 = uVar2;
    }
    if (uVar1 - in_w8 < 2) break;
    in_w10 = in_w8 + uVar1;
    in_w9 = uVar1;
  }
  func_0x00609afc();
  func_0x005ffccc();
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
  *unaff_x19 = **(ulong **)(unaff_x20 + 0x20) & unaff_x23;
  return;
}

