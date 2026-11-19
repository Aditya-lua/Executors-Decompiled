/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a8334
 */

long FUN_008a8334(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  lVar2 = param_1[4];
  if ((ulong)(lVar2 * 3) >> 2 <= (ulong)param_1[5]) {
    if (param_1[5] != 0) {
      uVar3 = *param_2;
      uVar4 = (uVar3 >> 4 ^ uVar3 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(*param_1 + uVar4 * 0x10) == uVar3) goto LAB_008a83d8;
          uVar4 = uVar4 + 1 & lVar2 - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
      }
    }
    FUN_008a8564(param_1);
    lVar2 = param_1[4];
  }
LAB_008a83d8:
  uVar4 = *param_2;
  lVar6 = param_1[3];
  uVar3 = (uVar4 >> 4 ^ uVar4 >> 9) * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar7 = uVar3 >> 6;
  uVar9 = 1L << (uVar3 & 0x3f);
  lVar5 = *param_1;
  uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
  if ((uVar9 & uVar8) != 0) {
    do {
      if (*(ulong *)(lVar5 + uVar3 * 0x10) == uVar4) goto LAB_008a8460;
      uVar3 = uVar3 + 1 & lVar2 - 1U;
      uVar7 = uVar3 >> 6;
      uVar9 = 1L << (uVar3 & 0x3f);
      uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
    } while ((uVar8 & uVar9) != 0);
  }
  *(ulong *)(lVar6 + uVar7 * 8) = uVar8 | uVar9;
  puVar1 = (ulong *)(lVar5 + uVar3 * 0x10);
  lVar2 = param_1[5];
  *puVar1 = uVar4;
  puVar1[1] = 0;
  param_1[5] = lVar2 + 1;
LAB_008a8460:
  return lVar5 + uVar3 * 0x10 + 8;
}

