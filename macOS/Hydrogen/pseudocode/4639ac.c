
bool FUN_004639ac(long param_1,long *param_2)

{
  uint uVar1;
  byte bVar2;
  uint in_w8;
  ulong in_x9;
  byte in_w10;
  long in_x11;
  uint in_w12;
  uint in_w13;
  long lVar3;
  ulong in_x14;
  uint in_w15;
  
  while ((in_w15 >> 0x10 & 1) == 0) {
    uVar1 = in_w8 + in_w13;
    in_x14 = in_x14 + 1;
    if (in_x9 == in_x14) {
      lVar3 = 0;
      in_x14 = in_x9;
LAB_00463a2c:
      *param_2 = in_x11 + in_x14;
      param_2[1] = lVar3;
      if (in_x14 == 0) {
        return false;
      }
      bVar2 = 0;
      if (in_x14 != 1) {
        bVar2 = in_w10;
      }
      return (bVar2 & (*(byte *)(param_1 + 0x14) ^ 1)) == 0;
    }
    in_w13 = *(byte *)(in_x11 + in_x14) - 0x30;
    if (in_w12 <= in_w13) {
      lVar3 = in_x9 - in_x14;
      goto LAB_00463a2c;
    }
    in_w8 = (uVar1 & 0xffff) * (in_w12 & 0xffff);
    if ((in_w8 & 0xffff0000) != 0) break;
    in_w15 = (in_w8 & 0xffff) + (in_w13 & 0xffff);
  }
  *param_2 = in_x11 + in_x14 + 1;
  param_2[1] = ~in_x14 + in_x9;
  return false;
}

