
bool FUN_00581e7c(void)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000020;
  
  uVar1 = __Unwind_Resume();
  func_0x005815d8(&uStack0000000000000020);
  __Unwind_Resume(uVar1);
  auVar2 = func_0x007a2668();
  return *auVar2._0_8_ == *(long *)*auVar2._8_8_;
}

