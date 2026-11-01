
void FUN_000de40c(ulong param_1,undefined4 param_2)

{
  int iVar1;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  uint unaff_s8;
  undefined4 unaff_s9;
  
  while( true ) {
    func_0x000f3af4(param_1,param_2);
    func_0x000f3af4(unaff_s9,0x40000000);
    func_0x000f3bb0(unaff_s9);
    func_0x000f5834();
    iVar1 = func_0x000d6518(*(undefined4 *)(unaff_x22 + 0x10));
    if (iVar1 != 0) {
      func_0x000f3bb0(unaff_s8);
    }
    unaff_x20 = unaff_x20 + 0x18;
    if (unaff_x20 == 0x168) break;
    unaff_x22 = unaff_x21 + unaff_x20;
    func_0x000f3bb0(unaff_s8);
    param_2 = 0x3f800000;
    param_1 = (ulong)unaff_s8;
  }
  func_0x000f0b24();
  return;
}

