
void FUN_00590ae8(ulong param_1)

{
  long lVar1;
  ulong extraout_x8;
  long *plVar2;
  undefined8 *unaff_x19;
  long lVar3;
  
  do {
    lVar3 = 1 - param_1;
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
    __Unwind_Resume();
    param_1 = extraout_x8 >> 3;
  } while( true );
}

