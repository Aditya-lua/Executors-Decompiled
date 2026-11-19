/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a029fc
 */

undefined4 bn_cmp_part_words(long param_1,long param_2,int param_3,int param_4)

{
  long lVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  long *plVar9;
  
  iVar4 = (int)((long)param_3 + -1);
  if (param_4 < 0) {
    plVar9 = (long *)(param_2 + ((long)iVar4 - (long)param_4) * 8);
    lVar6 = (long)param_4 + -1;
    do {
      if (*plVar9 != 0) {
        return 0xffffffff;
      }
      lVar1 = lVar6 + 1;
      bVar3 = lVar6 == -3;
      plVar9 = plVar9 + -1;
      lVar6 = lVar1;
    } while (bVar3 || lVar1 < -2);
  }
  if (0 < param_4) {
    lVar6 = (long)param_4;
    do {
      if (*(long *)(param_1 + (long)iVar4 * 8 + lVar6 * 8) != 0) {
        return 1;
      }
      bVar3 = 1 < lVar6;
      lVar6 = lVar6 + -1;
    } while (bVar3);
  }
  if (param_3 == 0) {
    return 0;
  }
  lVar6 = ((long)param_3 + -1) * 8;
  uVar8 = *(ulong *)(param_1 + lVar6);
  uVar7 = *(ulong *)(param_2 + lVar6);
  bVar2 = uVar7 <= uVar8;
  bVar3 = false;
  if (uVar8 == uVar7) {
    if (param_3 < 2) {
      return 0;
    }
    lVar6 = (long)(param_3 + -2);
    while( true ) {
      uVar8 = *(ulong *)(param_1 + lVar6 * 8);
      uVar7 = *(ulong *)(param_2 + lVar6 * 8);
      bVar2 = uVar7 <= uVar8;
      bVar3 = uVar8 == uVar7;
      if (!bVar3) break;
      bVar3 = lVar6 < 1;
      lVar6 = lVar6 + -1;
      if (bVar3) {
        return 0;
      }
    }
  }
  uVar5 = 0xffffffff;
  if (bVar2 && !bVar3) {
    uVar5 = 1;
  }
  return uVar5;
}

