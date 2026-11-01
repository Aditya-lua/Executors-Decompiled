
bool FUN_0046391c(long param_1,long *param_2)

{
  uint uVar1;
  byte bVar2;
  uint uVar3;
  bool bVar4;
  uint in_w8;
  ulong in_x9;
  byte in_w10;
  long in_x11;
  uint in_w12;
  long lVar5;
  ulong in_x14;
  
  do {
    in_x14 = in_x14 + 1;
    if (in_x9 == in_x14) {
      lVar5 = 0;
      in_x14 = in_x9;
LAB_00463a2c:
      *param_2 = in_x11 + in_x14;
      param_2[1] = lVar5;
      if (in_x14 == 0) {
        bVar4 = false;
      }
      else {
        bVar2 = 0;
        if (in_x14 != 1) {
          bVar2 = in_w10;
        }
        bVar4 = (bVar2 & (*(byte *)(param_1 + 0x14) ^ 1)) == 0;
      }
      return bVar4;
    }
    bVar2 = *(byte *)(in_x11 + in_x14);
    uVar1 = (bVar2 - 0x41 & 0xffffffdf) + 10;
    if (bVar2 < 0x3a) {
      uVar1 = bVar2 - 0x30;
    }
    if (in_w12 <= uVar1) {
      lVar5 = in_x9 - in_x14;
      goto LAB_00463a2c;
    }
    uVar3 = (in_w8 & 0xffff) * (in_w12 & 0xffff);
    if (((uVar3 & 0xffff0000) != 0) || ((uVar3 & 0xffff) + (uVar1 & 0xffff) >> 0x10 != 0)) {
      *param_2 = in_x11 + in_x14 + 1;
      param_2[1] = ~in_x14 + in_x9;
      return false;
    }
    in_w8 = uVar3 + uVar1;
  } while( true );
}

