
long FUN_00665110(code *param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  long *unaff_x22;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  
  (*param_1)();
  uVar2 = (**(code **)(*unaff_x22 + 0x20))();
  func_0x00677180(unaff_x19 + 0x80,uVar2);
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x48))();
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x48))(*(long **)(unaff_x19 + 0x10),unaff_x19 + 0x80)
  ;
  uVar4 = *(ulong *)(unaff_x19 + 0x68);
  uVar1 = *(ulong *)(unaff_x19 + 0x70);
  *(undefined8 *)(unaff_x19 + 0x70) = in_stack_00000010;
  *(undefined8 *)(unaff_x19 + 0x68) = in_stack_00000008;
  lVar3 = *(long *)(unaff_x19 + 0x78);
  *(undefined8 *)(unaff_x19 + 0x78) = in_stack_00000018;
  if (uVar1 <= uVar4) {
    uVar4 = uVar1;
  }
  *(undefined1 *)(unaff_x19 + 0xa0) = 0;
  if (lVar3 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000030 <= in_stack_00000028) {
    in_stack_00000028 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (in_stack_00000028 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + in_stack_00000028 * 8) = 0;
        in_stack_00000028 = in_stack_00000028 - 1;
      } while (in_stack_00000028 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0x58;
}

