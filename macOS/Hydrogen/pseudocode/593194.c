
void FUN_00593194(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x005d2ac4(unaff_x20);
    do {
      unaff_x20 = unaff_x20 + 2;
      unaff_x22 = unaff_x22 + -1;
      if (unaff_x22 == 0) {
        if (unaff_x19[2] != 0) {
          func_0x00187bd4(*unaff_x19,unaff_x19[2] << 4,8);
        }
        __Unwind_Resume();
        unaff_x23 = -1;
      }
      lVar1 = *(long *)*unaff_x20;
      *(long *)*unaff_x20 = lVar1 + unaff_x23;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

