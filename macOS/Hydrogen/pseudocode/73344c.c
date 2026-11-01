
bool FUN_0073344c(void)

{
  char in_NG;
  char in_OV;
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  
  if (in_NG == in_OV) {
    func_0x0073cab8();
  }
  lVar1 = func_0x007330bc();
  if (lVar1 != 0) {
    func_0x00732ed0(*(undefined8 *)(unaff_x19 + 0x78),lVar1,0);
  }
  if ((unaff_x22 & 1) == 0) {
    *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
    if ((*(long *)(unaff_x19 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
      return lVar1 != unaff_x20;
    }
  }
  return lVar1 != unaff_x20;
}

