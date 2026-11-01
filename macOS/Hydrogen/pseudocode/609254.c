
void FUN_00609254(void)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  _memcpy();
  if (unaff_x26 != 0) {
    do {
      *(undefined8 *)(unaff_x24 + -8 + unaff_x26 * 8) = 0;
      unaff_x26 = unaff_x26 + -1;
    } while (unaff_x26 != 0);
  }
  func_0x00611644();
  *(undefined8 *)(unaff_x19 + 0x18) = unaff_x23;
  *(long *)(unaff_x19 + 0x20) = unaff_x25;
  *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
  if (unaff_x25 != *(long *)(unaff_x22 + 0x20)) {
    _memcpy();
  }
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  if (*(int *)(unaff_x22 + 0x28) == 1) {
    if (**(long **)(unaff_x19 + 0x20) == 0) {
      lVar3 = *(long *)(unaff_x19 + 0x18);
      do {
        if (lVar3 == 0) {
          return;
        }
        lVar4 = lVar3 + -1;
        lVar1 = lVar3 + -1;
        lVar3 = lVar4;
      } while ((*(long **)(unaff_x19 + 0x20))[lVar1] == 0);
      if ((int)lVar4 == -1) {
        return;
      }
    }
    func_0x00605d50();
    func_0x006001b4();
    func_0x005ffad4();
    func_0x00607398(&uStack0000000000000030);
    func_0x005ffccc();
    uStack0000000000000030 = &UNK_009f5d60;
    uVar2 = in_stack_00000040;
    if (in_stack_00000048 <= in_stack_00000040) {
      uVar2 = in_stack_00000048;
    }
    if (in_stack_00000050 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
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
  }
  return;
}

