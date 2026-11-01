
uint FUN_0015ef64(long param_1)

{
  int in_w8;
  int in_w9;
  int in_w10;
  uint uVar1;
  int in_w11;
  byte *pbVar3;
  byte *pbVar2;
  ulong uVar4;
  
  uVar1 = in_w11 + in_w10;
  pbVar3 = (byte *)(param_1 + 0x18);
  uVar4 = (ulong)*(uint *)(param_1 + 0x28) & 0xf;
  pbVar2 = pbVar3;
  if (3 < (uint)uVar4) {
    do {
      pbVar2 = pbVar3 + 4;
      uVar1 = uVar1 + *(int *)pbVar3 * in_w9;
      uVar1 = (uVar1 >> 0xf | uVar1 * 0x20000) * 0x27d4eb2f;
      uVar4 = uVar4 - 4;
      pbVar3 = pbVar2;
    } while (3 < uVar4);
  }
  for (; uVar4 != 0; uVar4 = uVar4 - 1) {
    uVar1 = uVar1 + (uint)*pbVar2 * in_w8;
    uVar1 = (uVar1 >> 0x15 | uVar1 * 0x800) * -0x61c8864f;
    pbVar2 = pbVar2 + 1;
  }
  uVar1 = (uVar1 ^ uVar1 >> 0xf) * -0x7a143589;
  uVar1 = (uVar1 ^ uVar1 >> 0xd) * in_w9;
  return uVar1 ^ uVar1 >> 0x10;
}

