
void FUN_00733480(void)

{
  long unaff_x19;
  ulong unaff_x22;
  
  func_0x00732ed0();
  if ((unaff_x22 & 1) == 0) {
    *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
    if ((*(long *)(unaff_x19 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
      return;
    }
  }
  return;
}

