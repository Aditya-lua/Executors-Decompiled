
void FUN_00590774(void)

{
  long lVar1;
  ulong extraout_x8;
  long *plVar2;
  undefined8 *unaff_x19;
  long lVar3;
  
  do {
    __Unwind_Resume();
    lVar3 = 1 - (extraout_x8 >> 3);
    do {
      plVar2 = (long *)*unaff_x19;
      if (plVar2 != (long *)0x0) {
        lVar1 = *plVar2;
        *plVar2 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4(unaff_x19);
        }
      }
      unaff_x19 = unaff_x19 + 1;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  } while( true );
}

