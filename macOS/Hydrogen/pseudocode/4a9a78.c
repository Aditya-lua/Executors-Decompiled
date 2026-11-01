
void FUN_004a9a78(void)

{
  long lVar1;
  long extraout_x9;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  long lVar2;
  
  do {
    func_0x00187bd4();
    do {
      __Unwind_Resume();
      unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x19 + 0x10);
      lVar2 = -extraout_x9;
      do {
        lVar1 = *(long *)*unaff_x22;
        *(long *)*unaff_x22 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4(unaff_x22);
        }
        unaff_x22 = unaff_x22 + 2;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    } while (*unaff_x20 == 0);
  } while( true );
}

