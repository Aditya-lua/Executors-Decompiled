
undefined8 FUN_00194fe8(undefined8 param_1,undefined8 param_2,dword *param_3)

{
  undefined1 in_ZR;
  undefined8 uVar1;
  long unaff_x21;
  long lVar2;
  long lVar3;
  undefined1 auVar4 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  while (!(bool)in_ZR) {
    func_0x0018b2e8();
    unaff_x21 = unaff_x21 + -1;
    in_ZR = unaff_x21 == 0;
  }
  if (in_stack_00000008 != 0) {
    param_3 = &MACH_HEADER.cpusubtype;
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 4);
  }
  __Unwind_Resume();
  auVar4 = func_0x007a2668();
  uVar1 = func_0x00195930(param_3,auVar4._0_8_,auVar4._8_8_);
  lVar2 = *(long *)(param_3 + 2);
  for (lVar3 = *(long *)(param_3 + 4); lVar3 != 0; lVar3 = lVar3 + -1) {
    func_0x0019fb28(lVar2);
    func_0x0019e6a4(lVar2 + 8);
    lVar2 = lVar2 + 0x10;
  }
  if (*(long *)param_3 != 0) {
    func_0x00187bd4(*(undefined8 *)(param_3 + 2),*(long *)param_3 << 4,8);
  }
  return uVar1;
}

