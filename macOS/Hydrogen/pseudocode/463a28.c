
bool FUN_00463a28(long param_1,undefined8 *param_2)

{
  byte bVar1;
  bool bVar2;
  byte in_w10;
  undefined8 in_x11;
  undefined8 in_x13;
  long in_x14;
  
  *param_2 = in_x11;
  param_2[1] = in_x13;
  if (in_x14 == 0) {
    bVar2 = false;
  }
  else {
    bVar1 = 0;
    if (in_x14 != 1) {
      bVar1 = in_w10;
    }
    bVar2 = (bVar1 & (*(byte *)(param_1 + 0x14) ^ 1)) == 0;
  }
  return bVar2;
}

