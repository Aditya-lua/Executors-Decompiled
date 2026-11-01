
void FUN_00241798(void)

{
  long lVar1;
  long extraout_x9;
  undefined8 *unaff_x19;
  long lVar2;
  
  do {
    __Unwind_Resume();
    unaff_x19 = unaff_x19 + 1;
    lVar2 = -extraout_x9;
    do {
      lVar1 = *(long *)*unaff_x19;
      *(long *)*unaff_x19 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9a18(unaff_x19);
      }
      unaff_x19 = unaff_x19 + 1;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  } while( true );
}

