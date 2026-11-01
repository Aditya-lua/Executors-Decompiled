
bool FUN_0044cdc0(ushort *param_1)

{
  bool bVar1;
  int in_w8;
  int in_w9;
  
  if (in_w8 == in_w9) {
    bVar1 = true;
  }
  else if (*param_1 == 0x346b) {
    bVar1 = true;
  }
  else if (*param_1 == 0x356b) {
    bVar1 = true;
  }
  else if (*param_1 == 0x366b) {
    bVar1 = true;
  }
  else {
    bVar1 = (ushort)(*param_1 >> 8 | *param_1 << 8) == 0x6b37;
  }
  return bVar1;
}

