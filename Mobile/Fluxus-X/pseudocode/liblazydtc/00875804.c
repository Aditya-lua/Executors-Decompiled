/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875804
 */

long FUN_00875804(long *param_1,uint *param_2)

{
  uint *puVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  lVar3 = param_1[4];
  if ((ulong)(lVar3 * 3) >> 2 <= (ulong)param_1[5]) {
    if (param_1[5] != 0) {
      uVar4 = (ulong)*param_2 * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
        do {
          if (*(uint *)(*param_1 + uVar4 * 8) == *param_2) goto LAB_008758a0;
          uVar4 = uVar4 + 1 & lVar3 - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
      }
    }
    FUN_0087c8e4(param_1);
    lVar3 = param_1[4];
  }
LAB_008758a0:
  uVar2 = *param_2;
  lVar6 = param_1[3];
  uVar4 = (ulong)uVar2 * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar7 = uVar4 >> 6;
  uVar9 = 1L << (uVar4 & 0x3f);
  lVar5 = *param_1;
  uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
  if ((uVar9 & uVar8) != 0) {
    do {
      if (*(uint *)(lVar5 + uVar4 * 8) == uVar2) goto LAB_00875924;
      uVar4 = uVar4 + 1 & lVar3 - 1U;
      uVar7 = uVar4 >> 6;
      uVar9 = 1L << (uVar4 & 0x3f);
      uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
    } while ((uVar8 & uVar9) != 0);
  }
  *(ulong *)(lVar6 + uVar7 * 8) = uVar8 | uVar9;
  puVar1 = (uint *)(lVar5 + uVar4 * 8);
  lVar3 = param_1[5];
  *puVar1 = uVar2;
  *(undefined2 *)(puVar1 + 1) = 0;
  param_1[5] = lVar3 + 1;
LAB_00875924:
  return lVar5 + uVar4 * 8 + 4;
}

