/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089dd88
 */

long FUN_0089dd88(long *param_1,ulong *param_2)

{
  ulong uVar1;
  long lVar2;
  ulong *puVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  lVar2 = param_1[4];
  if ((ulong)(lVar2 * 3) >> 2 <= (ulong)param_1[5]) {
    if (param_1[5] != 0) {
      uVar1 = *param_2;
      uVar4 = (uVar1 >> 4 ^ uVar1 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(*param_1 + uVar4 * 0x30) == uVar1) goto LAB_0089de30;
          uVar4 = uVar4 + 1 & lVar2 - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
      }
    }
    FUN_0089f75c(param_1);
    lVar2 = param_1[4];
  }
LAB_0089de30:
  uVar4 = *param_2;
  lVar6 = param_1[3];
  uVar1 = (uVar4 >> 4 ^ uVar4 >> 9) * -0x61c8864680b583eb >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar7 = uVar1 >> 6;
  uVar9 = 1L << (uVar1 & 0x3f);
  lVar5 = *param_1;
  uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
  if ((uVar9 & uVar8) != 0) {
    do {
      if (*(ulong *)(lVar5 + uVar1 * 0x30) == uVar4) goto LAB_0089ded4;
      uVar1 = uVar1 + 1 & lVar2 - 1U;
      uVar7 = uVar1 >> 6;
      uVar9 = 1L << (uVar1 & 0x3f);
      uVar8 = *(ulong *)(lVar6 + uVar7 * 8);
    } while ((uVar8 & uVar9) != 0);
  }
  puVar3 = (ulong *)(lVar5 + uVar1 * 0x30);
  *(ulong *)(lVar6 + uVar7 * 8) = uVar8 | uVar9;
  puVar3[2] = 0;
  puVar3[1] = 0;
  puVar3[4] = 0;
  puVar3[3] = 0;
  puVar3[5] = 0;
  lVar2 = param_1[5];
  *puVar3 = uVar4;
  lVar5 = *param_1;
  param_1[5] = lVar2 + 1;
LAB_0089ded4:
  return lVar5 + uVar1 * 0x30 + 8;
}

