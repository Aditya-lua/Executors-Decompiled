
void FUN_006693bc(undefined8 *param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  uint unaff_w22;
  ulong unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  while( true ) {
    func_0x005ffccc(param_1,param_2);
    uVar5 = (ulong)unaff_w22;
    unaff_w22 = unaff_w22 + 1;
    if (unaff_x24 <= uVar5) break;
    param_2 = (**(code **)(*unaff_x20 + 0x80))();
    param_1 = (undefined8 *)((long)in_stack_00000008 + uVar5 * unaff_x25);
    unaff_x21 = unaff_x21 + 0x120;
  }
  if ((unaff_x23 & 1) != 0) {
    func_0x005ffccc(in_stack_00000008 + unaff_x24 * 6,unaff_x21 + 0x180);
  }
  func_0x0066a368();
  if ((unaff_x23 & 0xffffffff) >> 1 != 0) {
    uVar5 = 1;
    uVar6 = 0;
    do {
      uVar4 = uVar5;
      iVar2 = func_0x005ffc7c(in_stack_00000008 + uVar6 * 6);
      lVar1 = unaff_x19 + 0x60;
      if (iVar2 == 0) {
        func_0x00600180(lVar1,unaff_x19 + 0xf0);
        uVar3 = (**(code **)(*unaff_x20 + 0x80))();
        func_0x005ffccc(lVar1,uVar3);
        uVar3 = (**(code **)(*unaff_x20 + 0x80))();
        func_0x005ffccc(unaff_x19 + 0xf0,uVar3);
      }
      else {
        uVar3 = (**(code **)(*unaff_x20 + 0x88))();
        func_0x005ffccc(lVar1,uVar3);
        uVar3 = (**(code **)(*unaff_x20 + 0x88))();
        func_0x005ffccc(unaff_x19 + 0xf0,uVar3);
      }
      unaff_x19 = unaff_x19 + 0x120;
      uVar5 = (ulong)((int)uVar4 + 1);
      uVar6 = uVar4;
    } while (uVar4 < unaff_x24);
  }
  if ((unaff_x23 & 1) != 0) {
    func_0x005ffccc(unaff_x19 + 0x60,in_stack_00000008 + unaff_x24 * 6);
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

