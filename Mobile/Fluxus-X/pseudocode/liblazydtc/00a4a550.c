/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4a550
 */

void gf_serialize(long param_1,ulong *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong local_60 [4];
  ulong local_40;
  ulong uStack_38;
  ulong local_30;
  ulong uStack_28;
  
  uStack_28 = param_2[7];
  local_30 = param_2[6];
  uStack_38 = param_2[5];
  local_40 = param_2[4];
  local_60[3] = param_2[3];
  local_60[2] = param_2[2];
  local_60[1] = param_2[1];
  local_60[0] = *param_2;
  gf_strong_reduce(local_60);
  lVar3 = 0;
  uVar4 = 0;
  uVar5 = 0;
  uVar6 = 0;
  uVar7 = 0;
  do {
    if ((uVar6 | uVar7) < 8) {
      uVar8 = local_60[uVar7];
      uVar9 = (ulong)uVar6;
      uVar10 = uVar9 - 0x40;
      uVar2 = 0;
      if (uVar9 != 0) {
        uVar2 = uVar8 >> (0x40 - uVar9 & 0x3f);
      }
      uVar1 = uVar8 << (uVar10 & 0x3f);
      if ((long)uVar10 < 0) {
        uVar1 = uVar2;
      }
      uVar2 = 0;
      if ((long)uVar10 < 0) {
        uVar2 = uVar8 << (uVar9 & 0x3f);
      }
      uVar6 = uVar6 + 0x38;
      uVar5 = uVar1 | uVar5;
      uVar4 = uVar2 | uVar4;
      uVar7 = uVar7 + 1;
    }
    *(char *)(param_1 + lVar3) = (char)uVar4;
    lVar3 = lVar3 + 1;
    uVar6 = uVar6 - 8;
    uVar4 = uVar4 >> 8 | uVar5 << 0x38;
    uVar5 = uVar5 >> 8;
  } while (lVar3 != 0x38);
  return;
}

