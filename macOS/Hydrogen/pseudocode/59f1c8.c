
void FUN_0059f1c8(void)

{
  long lVar1;
  long extraout_x9;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  do {
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) {
      __Unwind_Resume();
      unaff_x20 = unaff_x20 + 2;
      unaff_x21 = -extraout_x9;
      unaff_x22 = -1;
    }
    lVar1 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar1 + unaff_x22;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x20);
    }
    unaff_x20 = unaff_x20 + 2;
  } while( true );
}

