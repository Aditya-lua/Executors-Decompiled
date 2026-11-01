
bool FUN_0044cd60(ushort *param_1)

{
  bool bVar1;
  int in_w8;
  int in_w9;
  
  if (in_w8 == in_w9) {
    bVar1 = true;
  }
  else if (*param_1 == 0x7367) {
    bVar1 = true;
  }
  else if (*param_1 == 0x7274) {
    bVar1 = true;
  }
  else if (*param_1 == 0x306b) {
    bVar1 = true;
  }
  else if (*param_1 == 0x316b) {
    bVar1 = true;
  }
  else if (*param_1 == 0x326b) {
    bVar1 = true;
  }
  else if (*param_1 == 0x336b) {
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

