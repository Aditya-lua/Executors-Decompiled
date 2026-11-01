
void FUN_0066a5e0(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  uint unaff_w22;
  ulong unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong uVar4;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  do {
    func_0x005ffccc(unaff_x21,param_2);
    lVar3 = unaff_x19;
    while( true ) {
      unaff_x19 = lVar3 + 0x60;
      uVar4 = (ulong)unaff_w22;
      unaff_w22 = unaff_w22 + 1;
      if (unaff_x24 <= uVar4) {
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
      iVar1 = func_0x005ffc7c((undefined8 *)((long)in_stack_00000008 + uVar4 * unaff_x25));
      if (iVar1 == 0) break;
      uVar2 = (**(code **)(*unaff_x20 + 0x88))();
      func_0x005ffccc(unaff_x19,uVar2);
      uVar2 = (**(code **)(*unaff_x20 + 0x88))();
      func_0x005ffccc(lVar3 + 0x90,uVar2);
      lVar3 = unaff_x19;
    }
    unaff_x21 = lVar3 + 0x90;
    func_0x00600180(unaff_x19,unaff_x21);
    uVar2 = (**(code **)(*unaff_x20 + 0x80))();
    func_0x005ffccc(unaff_x19,uVar2);
    param_2 = (**(code **)(*unaff_x20 + 0x80))();
  } while( true );
}

