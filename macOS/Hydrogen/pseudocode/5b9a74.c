
void FUN_005b9a74(long param_1)

{
  long lVar1;
  long extraout_x9;
  long *unaff_x19;
  long unaff_x21;
  undefined8 *unaff_x22;
  
  do {
    param_1 = -param_1;
    do {
      lVar1 = *(long *)*unaff_x22;
      *(long *)*unaff_x22 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x22);
      }
      unaff_x22 = unaff_x22 + 1;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
    if (*unaff_x19 != 0) {
      func_0x00187bd4();
    }
    __Unwind_Resume();
    unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x21 + 8);
    param_1 = extraout_x9;
  } while( true );
}

