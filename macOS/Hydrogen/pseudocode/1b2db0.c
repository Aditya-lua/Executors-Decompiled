
bool FUN_001b2db0(long param_1)

{
  bool in_CY;
  ulong in_x9;
  ulong in_x10;
  
  if (in_CY) {
    in_x9 = in_x10;
  }
  if ((1L << (in_x9 & 0x3f) & 0x3ffdffU) != 0) {
    return false;
  }
  if (in_x9 == 9) {
    return true;
  }
  return *(short *)(param_1 + -0x20) == 0x18;
}

