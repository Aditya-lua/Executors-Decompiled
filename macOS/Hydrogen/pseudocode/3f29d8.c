
ulong FUN_003f29d8(long param_1,long *param_2)

{
  byte bVar1;
  uint uVar2;
  bool in_ZR;
  bool bVar3;
  byte *pbVar4;
  long lVar5;
  long in_x9;
  uint in_w10;
  uint in_w11;
  uint in_w12;
  long in_x13;
  long in_x14;
  long in_x16;
  uint in_w17;
  
  if (!in_ZR) goto LAB_003f2aac;
  if (in_x16 + -1 == 0) {
LAB_003f2a70:
    bVar3 = false;
LAB_003f2a74:
    *param_2 = in_x14;
    param_2[1] = in_x16 + -1;
  }
  else {
    bVar1 = *(byte *)(in_x13 + 1);
    in_w17 = bVar1 - 0x30;
    if (9 < in_w17) goto LAB_003f2a70;
    if ((in_x16 + -2 != 0) && (uVar2 = *(byte *)(in_x13 + 2) - 0x30, uVar2 < 10)) {
      pbVar4 = (byte *)(in_x13 + 3);
      in_w17 = uVar2 + in_w17 * 10;
      lVar5 = in_x16 + -3;
      if ((lVar5 != 0) && (uVar2 = *(byte *)(in_x13 + 3) - 0x30, uVar2 < 10)) {
        in_w17 = ((in_w17 & 0xff) + (in_w17 & 0xff) * 4) * 2;
        if (((in_w17 & 0xf00) == 0) && ((in_w17 & 0xff) + (uVar2 & 0xff) >> 8 == 0)) {
          pbVar4 = (byte *)(in_x13 + 4);
          in_w17 = in_w17 + uVar2;
          lVar5 = in_x16 + -4;
          if ((lVar5 == 0) || (9 < *pbVar4 - 0x30)) goto LAB_003f2ac0;
        }
        goto LAB_003f2a70;
      }
LAB_003f2ac0:
      *param_2 = (long)pbVar4;
      param_2[1] = lVar5;
      bVar3 = bVar1 != 0x30;
      if (bVar3) goto LAB_003f2a88;
      goto LAB_003f2a74;
    }
    *param_2 = in_x13 + 2;
    param_2[1] = in_x16 + -2;
    bVar3 = true;
  }
LAB_003f2a88:
  if (bVar3) {
    return (ulong)((in_w12 & 0xff) << 0x10 | in_w17 << 0x18 | (in_w11 & 0xff) << 8 | in_w10 & 0xff)
           << 8 | 1;
  }
LAB_003f2aac:
  *param_2 = param_1;
  param_2[1] = in_x9;
  return param_1 << 8;
}

