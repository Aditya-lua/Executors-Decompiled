
void FUN_006222ec(void)

{
  undefined1 in_ZR;
  long *plVar1;
  ulong uVar2;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x24;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  while (!(bool)in_ZR) {
    plVar1 = (long *)(**(code **)(*unaff_x19 + 0x28))();
    (**(code **)(*plVar1 + 0x58))(plVar1,unaff_x22 * 0x30 + *unaff_x20 + -0x30);
    func_0x005ffccc(*unaff_x20 + unaff_x22 * 0x30);
    uVar2 = in_stack_00000010;
    if (in_stack_00000018 <= in_stack_00000010) {
      uVar2 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    unaff_x22 = unaff_x22 + 1;
    in_ZR = unaff_x22 == unaff_x24;
  }
  return;
}

