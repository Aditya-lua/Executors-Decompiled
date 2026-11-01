
void FUN_004b2238(void)

{
  long lVar1;
  long in_x9;
  long extraout_x9;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  long lVar2;
  
  if (in_x9 != 0) goto LAB_004b225c;
  do {
    if (*unaff_x20 != 0) {
      func_0x00187bd4();
    }
    __Unwind_Resume();
    in_x9 = extraout_x9;
LAB_004b225c:
    unaff_x22 = (undefined8 *)((long)unaff_x22 + unaff_x19 + 8);
    lVar2 = -in_x9;
    do {
      lVar1 = *(long *)*unaff_x22;
      *(long *)*unaff_x22 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x22);
      }
      unaff_x22 = unaff_x22 + 1;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  } while( true );
}

