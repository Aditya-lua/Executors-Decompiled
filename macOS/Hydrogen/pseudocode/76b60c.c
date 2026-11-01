
undefined8 FUN_0076b60c(void)

{
  byte bVar1;
  int in_w8;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x21;
  
  if (in_w8 != 0) {
    func_0x00733ea4();
  }
  bVar1 = *(byte *)(unaff_x19 + 0x271);
  *(byte *)(unaff_x19 + 0x271) = bVar1 & 0xfd;
  if ((bVar1 >> 1 & 1) != 0) {
    func_0x00768960();
  }
  if (unaff_x20 != (undefined4 *)0x0) {
    *unaff_x20 = *(undefined4 *)(unaff_x19 + 8);
  }
  if ((int)unaff_x21 < 1) {
    unaff_x21 = func_0x007681c0();
  }
  return unaff_x21;
}

