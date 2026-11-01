
void FUN_0066a488(void)

{
  ulong uVar1;
  bool in_CY;
  int iVar2;
  undefined8 uVar3;
  long unaff_x19;
  long *unaff_x20;
  ulong uVar4;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong uVar5;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  if (in_CY) {
    uVar1 = 1;
    uVar5 = 0;
    do {
      uVar4 = uVar1;
      iVar2 = func_0x005ffc7c(in_stack_00000008 + uVar5 * 6);
      if (iVar2 == 0) {
        func_0x00600180(unaff_x19,unaff_x19 + 0x30);
        uVar3 = (**(code **)(*unaff_x20 + 0x80))();
        func_0x005ffccc(unaff_x19,uVar3);
        uVar3 = (**(code **)(*unaff_x20 + 0x80))();
        func_0x005ffccc(unaff_x19 + 0x30,uVar3);
      }
      else {
        uVar3 = (**(code **)(*unaff_x20 + 0x88))();
        func_0x005ffccc(unaff_x19,uVar3);
        uVar3 = (**(code **)(*unaff_x20 + 0x88))();
        func_0x005ffccc(unaff_x19 + 0x30,uVar3);
      }
      unaff_x19 = unaff_x19 + 0x60;
      uVar1 = (ulong)((int)uVar4 + 1);
      uVar5 = uVar4;
    } while (uVar4 < unaff_x24);
  }
  if ((unaff_x23 & 1) != 0) {
    func_0x005ffccc(unaff_x19,in_stack_00000008 + unaff_x24 * 6);
  }
  if (in_stack_00000008 != (undefined8 *)0x0) {
    while (in_stack_00000010 != in_stack_00000008) {
      in_stack_00000010 = in_stack_00000010 + -6;
      (**(code **)*in_stack_00000010)(in_stack_00000010);
    }
    __ZdlPv(in_stack_00000008);
  }
  return;
}

