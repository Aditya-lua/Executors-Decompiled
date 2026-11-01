
long FUN_004dbd34(long param_1)

{
  byte *in_x9;
  long in_x10;
  ulong in_x11;
  
  if (in_x10 != 0) {
    in_x11 = ((ulong)*in_x9 ^ (in_x11 >> 0x3b | in_x11 << 5)) * param_1;
  }
  return ((in_x11 >> 0x3b | in_x11 << 5) ^ 0xff) * param_1;
}

