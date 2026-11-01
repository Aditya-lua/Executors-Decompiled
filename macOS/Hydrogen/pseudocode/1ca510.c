
bool FUN_001ca510(void)

{
  long lVar1;
  long unaff_x20;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000028;
  
  if (unaff_x20 != 0) {
    func_0x00187bd4();
  }
  func_0x001be540(&uStack0000000000000028);
  func_0x001be4cc(&uStack0000000000000010);
  func_0x002d8de8(in_stack_00000008);
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x0027c52c();
  return lVar1 == 0;
}

