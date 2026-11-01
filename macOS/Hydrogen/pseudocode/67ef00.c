
void FUN_0067ef00(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  code *unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  
  (*unaff_x20)(param_1,unaff_x29 + -0x60,&uStack0000000000000018);
  uStack0000000000000018 = &UNK_009f5d60;
  uVar2 = in_stack_00000028;
  if (in_stack_00000030 <= in_stack_00000028) {
    uVar2 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0x60) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x40);
  uVar2 = *(ulong *)(unaff_x29 + -0x50);
  if (*(ulong *)(unaff_x29 + -0x48) <= *(ulong *)(unaff_x29 + -0x50)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x48);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

