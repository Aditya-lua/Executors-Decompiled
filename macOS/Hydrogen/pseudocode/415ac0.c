
void FUN_00415ac0(void)

{
  long *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar1 [16];
  long lVar2;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  lStack0000000000000010 = 1;
  lStack0000000000000018 = 0;
  lVar2 = 0;
  if (unaff_x21 == 0) {
LAB_00415b30:
    auVar1 = func_0x0041e6c8();
    if ((auVar1._0_8_ & 1) == 0) {
      unaff_x20[1] = lStack0000000000000010;
      *unaff_x20 = lVar2;
      unaff_x20[2] = lStack0000000000000018;
    }
    else {
      *unaff_x20 = -0x8000000000000000;
      unaff_x20[1] = auVar1._8_8_;
      if (lVar2 != 0) {
        func_0x00187bd4(lStack0000000000000010,lVar2,1);
      }
    }
  }
  else {
    if (-1 < unaff_x21) {
      func_0x0079a108(unaff_x29 + -0x38,1);
      if (*(int *)(unaff_x29 + -0x38) != 1) {
        lStack0000000000000010 = *(long *)(unaff_x29 + -0x30);
        lVar2 = unaff_x21;
        goto LAB_00415b30;
      }
    }
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = 0x2600000003;
  }
  _close();
  return;
}

