
void FUN_001fadd8(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  long in_stack_00000008;
  
  func_0x001f9f08(in_stack_00000008);
  plVar2 = *(long **)(in_stack_00000008 + 8);
  lVar1 = *plVar2;
  *plVar2 = lVar1 + unaff_x19;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964((undefined8 *)(in_stack_00000008 + 8));
  }
  __Unwind_Resume();
  func_0x007a2668();
  return;
}

