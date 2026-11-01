
undefined1  [16] FUN_005b0ea8(void)

{
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long *unaff_x24;
  undefined1 auVar1 [16];
  
  for (; func_0x0059ce88(unaff_x21 + 8), unaff_x20 != 0; unaff_x20 = unaff_x20 + -1) {
    if (*unaff_x24 != 0xc) {
      func_0x0059ce88(unaff_x24);
    }
    unaff_x21 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x10;
  }
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  auVar1._8_8_ = 0x28;
  auVar1._0_8_ = &UNK_008af8ee;
  return auVar1;
}

