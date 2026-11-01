
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ca610(void)

{
  undefined8 uVar1;
  undefined1 in_w8;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x24;
  
  *(undefined1 *)(unaff_x21 + 2) = in_w8;
  uVar1 = _UNK_0089eb10;
  unaff_x21[1] = _UNK_0089eb18;
  *unaff_x21 = uVar1;
  for (; unaff_x24 != 0; unaff_x24 = unaff_x24 + -1) {
    if (*unaff_x19 != 0xc) {
      func_0x0059ce88(unaff_x19);
    }
    func_0x0059ce88(unaff_x19 + 8);
    unaff_x19 = unaff_x19 + 0x10;
  }
  if (*unaff_x20 != 0) {
    func_0x00187bd4();
  }
  return;
}

