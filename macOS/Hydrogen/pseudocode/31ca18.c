
undefined8 FUN_0031ca18(ulong *param_1,ulong *param_2,ulong param_3)

{
  ulong uVar1;
  undefined4 in_w8;
  
  *(undefined4 *)((long)param_1 + 0xd4) = in_w8;
  uVar1 = (*param_2 & 0xff00ff00ff00ff00) >> 8 | (*param_2 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  *param_1 = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[1] & 0xff00ff00ff00ff00) >> 8 | (param_2[1] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[1] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[2] & 0xff00ff00ff00ff00) >> 8 | (param_2[2] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[2] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[3] & 0xff00ff00ff00ff00) >> 8 | (param_2[3] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[3] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[4] & 0xff00ff00ff00ff00) >> 8 | (param_2[4] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[4] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[5] & 0xff00ff00ff00ff00) >> 8 | (param_2[5] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[5] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[6] & 0xff00ff00ff00ff00) >> 8 | (param_2[6] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[6] = uVar1 >> 0x20 | uVar1 << 0x20;
  uVar1 = (param_2[7] & 0xff00ff00ff00ff00) >> 8 | (param_2[7] & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_1[8] = param_3;
  param_1[9] = 0;
  param_1[7] = uVar1 >> 0x20 | uVar1 << 0x20;
  return 1;
}

