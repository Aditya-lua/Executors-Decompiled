
void FUN_005b99cc(undefined8 param_1)

{
  long lVar1;
  long extraout_x9;
  long *unaff_x19;
  long unaff_x21;
  undefined8 *unaff_x22;
  long lVar2;
  undefined1 uStack0000000000000040;
  
  func_0x005adc80();
  func_0x005adc80(&uStack0000000000000040);
  do {
    __Unwind_Resume(param_1);
    unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x21 + 8);
    lVar2 = -extraout_x9;
    do {
      lVar1 = *(long *)*unaff_x22;
      *(long *)*unaff_x22 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x22);
      }
      unaff_x22 = unaff_x22 + 1;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
    if (*unaff_x19 != 0) {
      func_0x00187bd4();
    }
  } while( true );
}

