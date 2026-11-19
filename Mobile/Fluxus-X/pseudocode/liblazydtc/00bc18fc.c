/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc18fc
 */

uint ZSTD_XXH32(byte *param_1,ulong param_2,uint param_3)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  byte *pbVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  
  if (param_1 == (byte *)0x0) {
    param_3 = param_3 + 0x165667b1;
  }
  else {
    iVar7 = (int)param_2;
    if (param_2 < 0x10) {
      param_3 = param_3 + 0x165667b1 + iVar7;
    }
    else {
      pbVar8 = param_1 + (param_2 - 0xf);
      uVar11 = param_3 + 0x24234428;
      uVar10 = param_3 + 0x85ebca77;
      uVar9 = param_3 + 0x61c8864f;
      do {
        uVar11 = uVar11 + *(int *)param_1 * -0x7a143589;
        uVar10 = uVar10 + *(int *)(param_1 + 4) * -0x7a143589;
        pbVar1 = param_1 + 8;
        pbVar2 = param_1 + 0xc;
        uVar3 = uVar11 >> 0x13 | uVar11 * 0x2000;
        param_1 = param_1 + 0x10;
        uVar4 = uVar10 >> 0x13 | uVar10 * 0x2000;
        param_3 = param_3 + *(int *)pbVar1 * -0x7a143589;
        uVar9 = uVar9 + *(int *)pbVar2 * -0x7a143589;
        uVar11 = uVar3 * -0x61c8864f;
        uVar5 = param_3 >> 0x13 | param_3 * 0x2000;
        uVar10 = uVar4 * -0x61c8864f;
        uVar6 = uVar9 >> 0x13 | uVar9 * 0x2000;
        param_3 = uVar5 * -0x61c8864f;
        uVar9 = uVar6 * -0x61c8864f;
      } while (param_1 < pbVar8);
      param_2 = param_2 & 0xf;
      param_3 = (uVar11 >> 0x1f | uVar3 * 0x3c6ef362) + iVar7 +
                (uVar10 >> 0x19 | uVar4 * 0x1bbcd880) + (param_3 >> 0x14 | uVar5 * 0x779b1000) +
                (uVar9 >> 0xe | uVar6 * -0x193c0000);
    }
    for (; 3 < param_2; param_2 = param_2 - 4) {
      param_3 = param_3 + *(int *)param_1 * -0x3d4d51c3;
      param_3 = (param_3 >> 0xf | param_3 * 0x20000) * 0x27d4eb2f;
      param_1 = param_1 + 4;
    }
    for (; param_2 != 0; param_2 = param_2 - 1) {
      param_3 = param_3 + (uint)*param_1 * 0x165667b1;
      param_3 = (param_3 >> 0x15 | param_3 * 0x800) * -0x61c8864f;
      param_1 = param_1 + 1;
    }
  }
  uVar11 = (param_3 ^ param_3 >> 0xf) * -0x7a143589;
  uVar11 = (uVar11 ^ uVar11 >> 0xd) * -0x3d4d51c3;
  return uVar11 ^ uVar11 >> 0x10;
}

