
void FUN_0058753c(void)

{
  long lVar1;
  long *plVar2;
  long extraout_x9;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  
  do {
    func_0x005d2ac4(unaff_x21);
    do {
      do {
        unaff_x21 = unaff_x21 + 1;
        unaff_x23 = unaff_x23 + -1;
        if (unaff_x23 == 0) {
          if (unaff_x20 != 0) {
            func_0x00187bd4();
          }
          __Unwind_Resume();
          unaff_x21 = (undefined8 *)((long)unaff_x21 + unaff_x19 + 8);
          unaff_x23 = -extraout_x9;
          unaff_x24 = -1;
        }
        plVar2 = (long *)*unaff_x21;
      } while (plVar2 == (long *)0x0);
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x24;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

