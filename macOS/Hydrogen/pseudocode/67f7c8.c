
void FUN_0067f7c8(void)

{
  long lVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  long *unaff_x20;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  func_0x00607398();
  iVar2 = (**(code **)(*unaff_x20 + 0xb0))();
  (**(code **)(*unaff_x20 + 0xa0))();
  iVar3 = func_0x00602288();
  iVar2 = func_0x00692c9c(iVar3 * iVar2);
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
  uVar4 = *(ulong *)(unaff_x29 + -0x40);
  if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
    uVar4 = *(ulong *)(unaff_x29 + -0x38);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
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

