/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a3c28
 */

long FUN_008a3c28(long *param_1,long *param_2)

{
  long *plVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  lVar3 = param_1[4];
  if ((ulong)(lVar3 * 3) >> 2 <= (ulong)param_1[5]) {
    if (param_1[5] != 0) {
      uVar2 = param_2[1];
      uVar5 = *param_2 * -0x40a7b892e31b1a47;
      uVar5 = (uVar2 >> 4 ^ uVar2 >> 9 ^ uVar5 >> 0x1f ^ uVar5) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
        do {
          plVar1 = (long *)(*param_1 + uVar5 * 0x10);
          if (*plVar1 == *param_2 && plVar1[1] == uVar2) goto LAB_008a3cec;
          uVar5 = uVar5 + 1 & lVar3 - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
      }
    }
    FUN_008a3d9c(param_1);
    lVar3 = param_1[4];
  }
LAB_008a3cec:
  uVar2 = param_2[1];
  lVar6 = param_1[3];
  uVar5 = *param_2 * -0x40a7b892e31b1a47;
  uVar5 = (uVar2 >> 9 ^ uVar2 >> 4 ^ uVar5 >> 0x1f ^ uVar5) * -0x61c8864680b583eb >>
          ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar7 = uVar5 >> 6;
  uVar9 = 1L << (uVar5 & 0x3f);
  lVar4 = *param_1;
  uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
  if ((uVar9 & uVar8) != 0) {
    do {
      plVar1 = (long *)(lVar4 + uVar5 * 0x10);
      if (*plVar1 == *param_2 && plVar1[1] == uVar2) goto LAB_008a3d88;
      uVar5 = uVar5 + 1 & lVar3 - 1U;
      uVar7 = uVar5 >> 6;
      uVar9 = 1L << (uVar5 & 0x3f);
      uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
    } while ((uVar8 & uVar9) != 0);
  }
  *(ulong *)(lVar6 + uVar7 * 8) = uVar8 | uVar9;
  lVar3 = *param_2;
  plVar1 = (long *)(lVar4 + uVar5 * 0x10);
  plVar1[1] = param_2[1];
  *plVar1 = lVar3;
  lVar4 = *param_1;
  param_1[5] = param_1[5] + 1;
LAB_008a3d88:
  return lVar4 + uVar5 * 0x10;
}

