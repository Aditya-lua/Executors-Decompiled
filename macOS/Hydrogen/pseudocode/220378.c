
void FUN_00220378(long param_1)

{
  long lVar1;
  undefined8 extraout_x1;
  long *unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 auStack_20 [16];
  
  lVar1 = *unaff_x19;
  *unaff_x19 = lVar1 + param_1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(unaff_x29 + -0x78);
  }
  func_0x00217a14(&uStack0000000000000010);
  __Unwind_Resume();
  func_0x007a2668();
  func_0x00469240(auStack_20,extraout_x1,&UNK_00828096,0x16);
  func_0x00465628(auStack_20);
  return;
}

