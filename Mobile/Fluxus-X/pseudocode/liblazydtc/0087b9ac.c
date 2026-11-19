/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b9ac
 */

long FUN_0087b9ac(long *param_1,int *param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong uVar7;
  int *piVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  lVar9 = param_1[4];
  lVar1 = FUN_0087337c();
  lVar6 = param_1[3];
  uVar4 = (ulong)(lVar1 * -0x61c8864680b583eb) >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar7 = uVar4 >> 6;
  uVar3 = 1L << (uVar4 & 0x3f);
  lVar1 = *param_1;
  uVar2 = *(ulong *)(lVar6 + uVar7 * 8);
  if ((uVar3 & uVar2) != 0) {
    do {
      piVar8 = (int *)(lVar1 + uVar4 * 0x30);
      if ((((*piVar8 == *param_2) && (*(long *)(piVar8 + 2) == *(long *)(param_2 + 2))) &&
          (*(long *)(piVar8 + 4) == *(long *)(param_2 + 4))) &&
         ((*(long *)(piVar8 + 6) == *(long *)(param_2 + 6) &&
          (*(long *)(piVar8 + 8) == *(long *)(param_2 + 8))))) goto LAB_0087bab8;
      uVar4 = uVar4 + 1 & lVar9 - 1U;
      uVar7 = uVar4 >> 6;
      uVar3 = 1L << (uVar4 & 0x3f);
      uVar2 = *(ulong *)(lVar6 + uVar7 * 8);
    } while ((uVar2 & uVar3) != 0);
  }
  puVar5 = (undefined8 *)(lVar1 + uVar4 * 0x30);
  *(ulong *)(lVar6 + uVar7 * 8) = uVar2 | uVar3;
  uVar13 = *(undefined8 *)(param_2 + 2);
  uVar12 = *(undefined8 *)param_2;
  uVar11 = *(undefined8 *)(param_2 + 6);
  uVar10 = *(undefined8 *)(param_2 + 4);
  puVar5[4] = *(undefined8 *)(param_2 + 8);
  puVar5[1] = uVar13;
  *puVar5 = uVar12;
  puVar5[3] = uVar11;
  puVar5[2] = uVar10;
  lVar6 = param_1[5];
  *(undefined4 *)(puVar5 + 5) = 0;
  lVar1 = *param_1;
  param_1[5] = lVar6 + 1;
LAB_0087bab8:
  return lVar1 + uVar4 * 0x30;
}

