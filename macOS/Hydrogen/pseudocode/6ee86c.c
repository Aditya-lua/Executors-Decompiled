
undefined8 FUN_006ee86c(void)

{
  undefined2 in_w8;
  long unaff_x19;
  
  *(undefined2 *)(unaff_x19 + 0x52) = in_w8;
  *(undefined2 *)(unaff_x19 + 0x50) = in_w8;
  *(undefined1 *)(unaff_x19 + 5) = 1;
  if ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4();
  }
  return 0;
}

