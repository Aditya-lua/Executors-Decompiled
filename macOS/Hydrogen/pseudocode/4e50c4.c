
void FUN_004e50c4(void)

{
  undefined1 in_ZR;
  long lVar1;
  long extraout_x9;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  do {
    if ((bool)in_ZR) {
      __Unwind_Resume();
      unaff_x20 = unaff_x20 + 4;
      unaff_x21 = -extraout_x9;
      unaff_x22 = -1;
    }
    lVar1 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar1 + unaff_x22;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00525414(unaff_x20);
    }
    unaff_x20 = unaff_x20 + 4;
    unaff_x21 = unaff_x21 + -1;
    in_ZR = unaff_x21 == 0;
  } while( true );
}

