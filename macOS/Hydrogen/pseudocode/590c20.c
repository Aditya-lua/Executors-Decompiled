
void FUN_00590c20(void)

{
  long lVar1;
  long *plVar2;
  long extraout_x9;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  do {
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) {
      __Unwind_Resume();
      unaff_x19 = unaff_x19 + 1;
      unaff_x21 = -extraout_x9;
      unaff_x22 = -1;
    }
    plVar2 = (long *)*unaff_x19;
    if (plVar2 != (long *)0x0) {
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x22;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x19);
      }
    }
    unaff_x19 = unaff_x19 + 1;
  } while( true );
}

