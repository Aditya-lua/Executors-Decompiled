
void FUN_0067f7f8(void)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  iVar2 = func_0x00692c9c();
  func_0x005ffa7c(iVar2 << 1);
  func_0x00609ec8();
  func_0x005fe0b4();
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
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x30);
  uVar3 = *(ulong *)(unaff_x29 + -0x40);
  if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
    uVar3 = *(ulong *)(unaff_x29 + -0x38);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
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

