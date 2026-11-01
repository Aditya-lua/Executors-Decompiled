
void FUN_0022a0dc(void)

{
  long lVar1;
  undefined8 extraout_x1;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  
  func_0x0022200c();
  do {
    if ((unaff_w22 & 1) != 0) {
      lVar1 = *(long *)unaff_x19[0x1d];
      *(long *)unaff_x19[0x1d] = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9b44();
      }
      if (*unaff_x19 != -0x8000000000000000) {
        func_0x00222b5c();
      }
      func_0x00209524(unaff_x19 + 0x19);
      func_0x00221a70(unaff_x19 + 0x12);
    }
    func_0x00187bd4();
    __Unwind_Resume();
    func_0x00187bd4(*(undefined8 *)(unaff_x20 + 8),extraout_x1,1);
  } while( true );
}

