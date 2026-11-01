
void thunk_FUN_001d3004(void)

{
  long lVar1;
  long unaff_x19;
  
  lVar1 = **(long **)(unaff_x19 + 0x38);
  **(long **)(unaff_x19 + 0x38) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x001be5e4();
  func_0x00252db4(unaff_x19 + 0x138);
  func_0x001bf718(unaff_x19 + 0x48);
  func_0x00187bd4();
  return;
}

