
bool FUN_00581d4c(void)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  
  uVar1 = func_0x007a1f00();
  if (in_stack_00000020 != 0) {
    func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
  }
  func_0x005815d8(&uStack0000000000000018);
  __Unwind_Resume(uVar1);
  auVar2 = func_0x007a2668();
  return *auVar2._0_8_ == *(long *)*auVar2._8_8_;
}

