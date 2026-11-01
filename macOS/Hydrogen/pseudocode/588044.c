
void FUN_00588044(undefined8 *param_1)

{
  long lVar1;
  long extraout_x9;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    func_0x005d2ac4(param_1);
    param_1 = unaff_x22;
    do {
      param_1 = param_1 + 1;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        if (*unaff_x20 != 0) {
          func_0x00187bd4();
        }
        __Unwind_Resume();
        param_1 = (undefined8 *)((long)param_1 + unaff_x19 + 8);
        unaff_x23 = -extraout_x9;
        unaff_x24 = -1;
      }
      lVar1 = *(long *)*param_1;
      *(long *)*param_1 = lVar1 + unaff_x24;
      LORelease();
    } while (lVar1 != 1);
    unaff_x22 = param_1;
  } while( true );
}

