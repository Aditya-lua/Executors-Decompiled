
void FUN_00441b3c(ulong *param_1)

{
  undefined *puVar1;
  ulong uVar2;
  ulong in_x9;
  undefined *in_x10;
  ulong in_x11;
  long in_x12;
  ulong uVar3;
  
  uVar3 = (in_x11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x11 & 0x5555555555555555) << 1;
  uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
  uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  uVar3 = (in_x12 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 2)) - (long)in_x10;
  puVar1 = &UNK_008889b4;
  if (uVar3 < in_x9) {
    puVar1 = in_x10;
  }
  uVar2 = 0x21;
  if (uVar3 < in_x9) {
    uVar2 = uVar3;
  }
  param_1[1] = (ulong)puVar1;
  param_1[2] = uVar2;
  *param_1 = (ulong)(in_x9 <= uVar3);
  return;
}

