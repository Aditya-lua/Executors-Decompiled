
void FUN_007334e4(void)

{
  long unaff_x19;
  
  if ((*(long *)(unaff_x19 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) == 0)) {
    return;
  }
  func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
  return;
}

