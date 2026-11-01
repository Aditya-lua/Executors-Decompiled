
long FUN_0061a17c(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  lVar1 = func_0x006115d0(unaff_x21 << 2);
  if ((unaff_x19 == 0) || (lVar1 == 0)) {
    if (unaff_x19 == 0) {
      return lVar1;
    }
  }
  else {
    _memcpy(lVar1);
  }
  if (unaff_x20 != 0) {
    do {
      *(undefined4 *)(unaff_x19 + -4 + unaff_x20 * 4) = 0;
      unaff_x20 = unaff_x20 + -1;
    } while (unaff_x20 != 0);
  }
  func_0x00611644();
  return lVar1;
}

