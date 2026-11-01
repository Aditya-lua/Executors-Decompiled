
void FUN_004bc774(void)

{
  long lVar1;
  long extraout_x9;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    unaff_x22 = unaff_x22 + 1;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) {
      if (*unaff_x19 != 0) {
        func_0x00187bd4();
      }
      func_0x004bb0d4(unaff_x19 + 3);
      __Unwind_Resume();
      unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x20 + 8);
      unaff_x23 = -extraout_x9;
      unaff_x24 = -1;
    }
    lVar1 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar1 + unaff_x24;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x22);
    }
  } while( true );
}

