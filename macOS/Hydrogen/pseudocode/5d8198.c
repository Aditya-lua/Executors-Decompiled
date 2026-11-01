
void FUN_005d8198(long param_1)

{
  long extraout_x9;
  undefined8 *unaff_x19;
  undefined8 *puVar1;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    if (param_1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    puVar1 = unaff_x21 + 2;
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) {
      if (unaff_x19[2] != 0) {
        func_0x00187bd4(*unaff_x19,unaff_x19[2] << 4,8);
      }
      __Unwind_Resume();
      puVar1 = unaff_x21 + 4;
      unaff_x22 = -extraout_x9;
      unaff_x23 = -1;
    }
    param_1 = *(long *)*puVar1;
    *(long *)*puVar1 = param_1 + unaff_x23;
    LORelease();
    unaff_x21 = puVar1;
  } while( true );
}

