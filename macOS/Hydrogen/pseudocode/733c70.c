
void FUN_00733c70(void)

{
  byte in_w8;
  long unaff_x19;
  
  *(byte *)(unaff_x19 + 0x98) = in_w8 & 0xfe;
  if ((*(long *)(unaff_x19 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) == 0)) {
    return;
  }
  func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
  return;
}

