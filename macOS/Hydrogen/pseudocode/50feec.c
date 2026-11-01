
undefined8 FUN_0050feec(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  long *plVar1;
  long lVar2;
  undefined1 auVar3 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  if (in_stack_00000008 != 0) {
    param_3 = 1;
    func_0x00187bd4(in_stack_00000010);
  }
  auVar3 = __Unwind_Resume();
  plVar1 = auVar3._0_8_;
  lVar2 = plVar1[2];
  if ((ulong)(*plVar1 - lVar2) < param_3) {
    func_0x007a5594(plVar1,lVar2,param_3,1,1);
    lVar2 = plVar1[2];
  }
  _memcpy(plVar1[1] + lVar2,auVar3._8_8_,param_3);
  plVar1[2] = lVar2 + param_3;
  return 0;
}

