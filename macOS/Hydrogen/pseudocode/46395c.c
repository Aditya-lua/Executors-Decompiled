
bool FUN_0046395c(long param_1,long *param_2)

{
  byte bVar1;
  bool bVar2;
  uint in_w8;
  long in_x9;
  byte in_w10;
  long in_x11;
  
  *param_2 = in_x11 + in_x9;
  param_2[1] = 0;
  if (in_x9 == 0) {
    bVar2 = false;
  }
  else {
    bVar1 = 0;
    if (in_x9 != 1) {
      bVar1 = in_w10;
    }
    bVar2 = (bVar1 & (*(byte *)(param_1 + 0x14) ^ 1)) == 0 && in_w8 < 0x10000;
  }
  return bVar2;
}

