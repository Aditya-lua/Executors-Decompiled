/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1c38
 */

uint ZSTD_XXH32_digest(int *param_1)

{
  ulong uVar1;
  int iVar2;
  uint uVar3;
  byte *pbVar5;
  byte *pbVar4;
  
  if (param_1[1] == 0) {
    iVar2 = param_1[4] + 0x165667b1;
  }
  else {
    iVar2 = ((uint)param_1[3] >> 0x19 | param_1[3] << 7) +
            ((uint)param_1[2] >> 0x1f | param_1[2] << 1) +
            ((uint)param_1[4] >> 0x14 | param_1[4] << 0xc) +
            ((uint)param_1[5] >> 0xe | param_1[5] << 0x12);
  }
  uVar1 = (ulong)(uint)param_1[10] & 0xf;
  uVar3 = *param_1 + iVar2;
  pbVar5 = (byte *)(param_1 + 6);
  pbVar4 = pbVar5;
  if (3 < (uint)uVar1) {
    do {
      pbVar4 = pbVar5 + 4;
      uVar1 = uVar1 - 4;
      uVar3 = uVar3 + *(int *)pbVar5 * -0x3d4d51c3;
      uVar3 = (uVar3 >> 0xf | uVar3 * 0x20000) * 0x27d4eb2f;
      pbVar5 = pbVar4;
    } while (3 < uVar1);
  }
  for (; uVar1 != 0; uVar1 = uVar1 - 1) {
    uVar3 = uVar3 + (uint)*pbVar4 * 0x165667b1;
    uVar3 = (uVar3 >> 0x15 | uVar3 * 0x800) * -0x61c8864f;
    pbVar4 = pbVar4 + 1;
  }
  uVar3 = (uVar3 ^ uVar3 >> 0xf) * -0x7a143589;
  uVar3 = (uVar3 ^ uVar3 >> 0xd) * -0x3d4d51c3;
  return uVar3 ^ uVar3 >> 0x10;
}

