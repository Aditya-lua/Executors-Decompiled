
bool FUN_0044cdf0(ushort *param_1)

{
  bool bVar1;
  int in_w8;
  int in_w9;
  
  if (in_w8 == in_w9) {
    bVar1 = true;
  }
  else {
    bVar1 = (ushort)(*param_1 >> 8 | *param_1 << 8) == 0x6b37;
  }
  return bVar1;
}

