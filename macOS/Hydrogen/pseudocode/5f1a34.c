
undefined8 FUN_005f1a34(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  
  (**(code **)(*param_1 + 8))();
  __Unwind_Resume();
  auVar2 = func_0x0001753c();
  uVar1 = __Znwm(0xb0);
  func_0x005f1abc(uVar1,auVar2._8_8_,auVar2._0_8_,param_3,param_4);
  return uVar1;
}

