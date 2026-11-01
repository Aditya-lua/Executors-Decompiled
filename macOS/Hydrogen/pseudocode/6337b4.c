
void FUN_006337b4(void)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long unaff_x20;
  long lVar4;
  long unaff_x29;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  lVar4 = *(long *)(unaff_x29 + -0x48);
  if (lVar4 != 0) {
    lVar3 = *(long *)(unaff_x29 + -0x40);
    lVar1 = lVar4;
    if (lVar3 != lVar4) {
      do {
        *(long *)(lVar3 + -0x30) = unaff_x20 + 0x10;
        lVar1 = *(long *)(lVar3 + -0x10);
        uVar2 = *(ulong *)(lVar3 + -0x20);
        if (*(ulong *)(lVar3 + -0x18) <= *(ulong *)(lVar3 + -0x20)) {
          uVar2 = *(ulong *)(lVar3 + -0x18);
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
        lVar3 = lVar3 + -0xa0;
        func_0x0064f6d0(lVar3);
      } while (lVar3 != lVar4);
      lVar1 = *(long *)(unaff_x29 + -0x48);
    }
    *(long *)(unaff_x29 + -0x40) = lVar4;
    __ZdlPv(lVar1);
  }
  return;
}

