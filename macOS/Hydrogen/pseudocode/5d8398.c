
void FUN_005d8398(void)

{
  long lVar1;
  long in_x9;
  long extraout_x9;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  long lVar2;
  
  if (in_x9 != 0) goto LAB_005d83bc;
  do {
    if (unaff_x19[2] != 0) {
      func_0x00187bd4(*unaff_x19,unaff_x19[2] << 3,8);
    }
    __Unwind_Resume();
    in_x9 = extraout_x9;
LAB_005d83bc:
    unaff_x21 = unaff_x21 + 1;
    lVar2 = -in_x9;
    do {
      lVar1 = *(long *)*unaff_x21;
      *(long *)*unaff_x21 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x21);
      }
      unaff_x21 = unaff_x21 + 1;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  } while( true );
}

