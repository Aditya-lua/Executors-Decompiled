
void FUN_005934c4(void)

{
  long lVar1;
  long extraout_x9;
  undefined8 *unaff_x19;
  undefined8 *puVar2;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x005d2ac4(unaff_x21);
    puVar2 = unaff_x21;
    do {
      unaff_x21 = puVar2 + 3;
      unaff_x22 = unaff_x22 + -1;
      if (unaff_x22 == 0) {
        if (unaff_x19[2] != 0) {
          func_0x00187bd4(*unaff_x19,unaff_x19[2] * 0x18,8);
        }
        __Unwind_Resume();
        unaff_x21 = puVar2 + 6;
        unaff_x22 = -extraout_x9;
        unaff_x23 = -1;
      }
      lVar1 = *(long *)*unaff_x21;
      *(long *)*unaff_x21 = lVar1 + unaff_x23;
      LORelease();
      puVar2 = unaff_x21;
    } while (lVar1 != 1);
  } while( true );
}

