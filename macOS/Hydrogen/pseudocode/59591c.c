
void FUN_0059591c(long param_1,long *param_2,undefined8 param_3,undefined8 param_4)

{
  byte bVar1;
  ulong in_x9;
  ulong in_x10;
  ulong uVar2;
  ulong unaff_x20;
  
  uVar2 = (in_x10 & 0x8080808080808080) >> 7;
  uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
  uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
  uVar2 = (ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3;
  param_2[2] = param_2[2] - (unaff_x20 & 0xffffffff);
  bVar1 = (byte)((ulong)param_3 >> 0x38);
  *(byte *)(param_1 + uVar2) = bVar1 >> 1;
  *(byte *)(*param_2 + (uVar2 - 8 & in_x9) + 8) = bVar1 >> 1;
  param_2[3] = param_2[3] + 1;
  *(undefined8 *)(*param_2 + uVar2 * -8 + -8) = param_4;
  return;
}

