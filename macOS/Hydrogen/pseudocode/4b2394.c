
void FUN_004b2394(void)

{
  undefined1 in_ZR;
  long lVar1;
  long extraout_x9;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    if ((bool)in_ZR) {
      if (*unaff_x20 != 0) {
        func_0x00187bd4();
      }
      __Unwind_Resume();
      unaff_x23 = -extraout_x9;
      unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x19 + 0x18);
      unaff_x24 = -1;
    }
    lVar1 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar1 + unaff_x24;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x22);
    }
    unaff_x22 = unaff_x22 + 2;
    unaff_x23 = unaff_x23 + -1;
    in_ZR = unaff_x23 == 0;
  } while( true );
}

