
bool FUN_00463854(long param_1,long *param_2)

{
  byte bVar1;
  uint uVar2;
  bool bVar3;
  uint in_w8;
  ulong in_x9;
  byte in_w10;
  long in_x11;
  uint in_w12;
  ulong in_x13;
  ulong in_x14;
  uint in_w15;
  
  while( true ) {
    uVar2 = (in_w15 - 0x41 & 0xffffffdf) + 10;
    if (in_w15 < 0x3a) {
      uVar2 = in_w15 - 0x30;
    }
    if (in_w12 <= uVar2) {
      *param_2 = in_x11 + in_x14;
      param_2[1] = in_x9 - in_x14;
      in_x9 = in_x14;
      goto joined_r0x00463a00;
    }
    if (in_x13 <= in_x14) {
      *param_2 = in_x11 + in_x14 + 1;
      param_2[1] = ~in_x14 + in_x9;
      return false;
    }
    in_x14 = in_x14 + 1;
    in_w8 = uVar2 + in_w12 * in_w8;
    if (in_x9 == in_x14) break;
    in_w15 = (uint)*(byte *)(in_x11 + in_x14);
  }
  *param_2 = in_x11 + in_x9;
  param_2[1] = 0;
joined_r0x00463a00:
  if (in_x9 == 0) {
    bVar3 = false;
  }
  else {
    bVar1 = 0;
    if (in_x9 != 1) {
      bVar1 = in_w10;
    }
    bVar3 = (bVar1 & (*(byte *)(param_1 + 0x14) ^ 1)) == 0 && in_w8 < 0x10000;
  }
  return bVar3;
}

