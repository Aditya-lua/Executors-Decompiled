
bool FUN_0073346c(long param_1)

{
  bool in_ZR;
  long unaff_x19;
  ulong unaff_x22;
  
  if (param_1 != 0) {
    func_0x00732ed0(*(undefined8 *)(unaff_x19 + 0x78),param_1,0);
  }
  if ((unaff_x22 & 1) == 0) {
    *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
    if ((*(long *)(unaff_x19 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
      return !in_ZR;
    }
  }
  return !in_ZR;
}

