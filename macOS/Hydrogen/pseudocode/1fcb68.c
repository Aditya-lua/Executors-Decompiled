
undefined8 FUN_001fcb68(long param_1)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  uint unaff_w28;
  undefined1 uStack0000000000000040;
  
  if (param_1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08(&uStack0000000000000040);
  }
  if ((unaff_w28 & 1) != 0) {
    plVar2 = *(long **)(unaff_x19 + 0x28);
    lVar1 = *plVar2;
    *plVar2 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9964((undefined8 *)(unaff_x19 + 0x28));
    }
  }
  __Unwind_Resume();
  func_0x007a2668();
  func_0x007a2668();
  return 1;
}

