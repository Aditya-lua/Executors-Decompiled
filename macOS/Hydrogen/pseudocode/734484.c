
void FUN_00734484(undefined1 param_1 [16])

{
  long unaff_x20;
  undefined8 *unaff_x24;
  
  unaff_x24[1] = param_1._8_8_;
  *unaff_x24 = param_1._0_8_;
  *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) & 0xfe;
  if ((*(long *)(unaff_x20 + 0x88) != 0) &&
     ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) != 0)) {
    func_0x00779d40(*(undefined8 *)(unaff_x20 + 0x78),5);
  }
  return;
}

