
bool FUN_00581df4(undefined8 param_1,undefined8 param_2)

{
  undefined1 auVar1 [16];
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000018;
  
  func_0x00187bd4(in_stack_00000008,param_2,1);
  func_0x005815d8(&uStack0000000000000018);
  __Unwind_Resume();
  auVar1 = func_0x007a2668();
  return *auVar1._0_8_ == *(long *)*auVar1._8_8_;
}

