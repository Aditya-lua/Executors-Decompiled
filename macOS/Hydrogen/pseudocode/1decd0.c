
void FUN_001decd0(long param_1,undefined8 param_2)

{
  long unaff_x19;
  uint unaff_w20;
  uint unaff_w22;
  bool bVar1;
  uint unaff_w24;
  long unaff_x25;
  
  func_0x00187bd4(param_2,param_1 << 2,2);
  bVar1 = true;
  do {
    if ((unaff_w20 & 1) != 0) {
      func_0x001d55a4(unaff_x19 + 0x108);
    }
    if (*(long *)(unaff_x19 + 200) != unaff_x25 + -2) {
      func_0x001d5248();
    }
    if (((unaff_w24 & 1) != 0) && (*(long *)(unaff_x19 + 0x180) != 0)) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x188),*(long *)(unaff_x19 + 0x180),1);
    }
    if (bVar1) {
      func_0x001d4918(*(undefined8 *)(unaff_x19 + 0x290),*(undefined8 *)(unaff_x19 + 0x298));
      func_0x001d4918(*(undefined8 *)(unaff_x19 + 0x2a8),*(undefined8 *)(unaff_x19 + 0x2b0));
    }
    if ((unaff_w22 & 1) != 0) {
      func_0x001d5f88(unaff_x19 + 0x1a0);
    }
    func_0x00187bd4();
    __Unwind_Resume();
    bVar1 = false;
  } while( true );
}

