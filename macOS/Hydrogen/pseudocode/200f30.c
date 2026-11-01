
void FUN_00200f30(undefined8 param_1)

{
  undefined8 extraout_x1;
  long unaff_x19;
  undefined1 uStack0000000000000010;
  undefined1 auStack_20 [16];
  
  func_0x001f8e9c(&uStack0000000000000010);
  func_0x001f772c();
  func_0x001f8508(unaff_x19 + 0x498);
  if (*(long *)(unaff_x19 + 0x480) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x488),*(long *)(unaff_x19 + 0x480) << 2,2);
  }
  __Unwind_Resume(param_1);
  func_0x007a2668();
  func_0x00469240(auStack_20,extraout_x1,&UNK_00826ed0,8);
  func_0x00465628(auStack_20);
  return;
}

