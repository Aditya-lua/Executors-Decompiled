
void FUN_0016ede4(void)

{
  long lVar1;
  long extraout_x9;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) {
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        func_0x00187bd4();
      }
      __Unwind_Resume();
      unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x19 + 8);
      unaff_x23 = -extraout_x9;
      unaff_x24 = -1;
    }
    lVar1 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar1 + unaff_x24;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9f8c(unaff_x22);
    }
    unaff_x22 = unaff_x22 + 1;
  } while( true );
}

