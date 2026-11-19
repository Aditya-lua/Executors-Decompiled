/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00864920
 */

long FUN_00864920(long *param_1,ulong *param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  lVar1 = param_1[4];
  if ((ulong)(lVar1 * 3) >> 2 <= (ulong)param_1[5]) {
    if (param_1[5] != 0) {
      uVar2 = *param_2;
      uVar3 = (uVar2 >> 4 ^ uVar2 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(*param_1 + uVar3 * 8) == uVar2) goto LAB_008649c0;
          uVar3 = uVar3 + 1 & lVar1 - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
      }
    }
    FUN_0087151c(param_1);
    lVar1 = param_1[4];
  }
LAB_008649c0:
  uVar3 = *param_2;
  lVar5 = param_1[3];
  uVar2 = (uVar3 >> 4 ^ uVar3 >> 9) * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar6 = uVar2 >> 6;
  uVar8 = 1L << (uVar2 & 0x3f);
  lVar4 = *param_1;
  uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
  if ((uVar8 & uVar7) != 0) {
    do {
      if (*(ulong *)(lVar4 + uVar2 * 8) == uVar3) goto LAB_00864a40;
      uVar2 = uVar2 + 1 & lVar1 - 1U;
      uVar6 = uVar2 >> 6;
      uVar8 = 1L << (uVar2 & 0x3f);
      uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
    } while ((uVar7 & uVar8) != 0);
  }
  *(ulong *)(lVar5 + uVar6 * 8) = uVar7 | uVar8;
  lVar1 = param_1[5];
  *(ulong *)(lVar4 + uVar2 * 8) = uVar3;
  param_1[5] = lVar1 + 1;
LAB_00864a40:
  return lVar4 + uVar2 * 8;
}

