/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086191c
 */

/* WARNING: Removing unreachable block (ram,0x00861a14) */

undefined1  [16] FUN_0086191c(long param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  
  lVar10 = *(long *)(param_1 + 0x458);
  lVar9 = *(long *)(param_1 + 0x450);
  lVar8 = lVar10 - lVar9;
  if (param_2[2] == 0) {
    uVar6 = 0;
    lVar7 = 0;
    goto LAB_008619f4;
  }
  lVar7 = 0;
  uVar6 = 0;
  lVar11 = 0x20;
  do {
                    /* try { // try from 00861978 to 00861983 has its CatchHandler @ 00861a8c */
    FUN_00870ce4((long *)(param_1 + 0x450),*(long *)*param_2 + param_2[1] * 0x30 + lVar11);
    uVar6 = uVar6 + 1;
    lVar7 = lVar7 + 8;
    lVar11 = lVar11 + 0x30;
  } while (uVar6 < (ulong)param_2[2]);
  lVar11 = *(long *)(param_1 + 0x450);
                    /* try { // try from 008619a4 to 008619ab has its CatchHandler @ 00861a88 */
  lVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),lVar7);
  if ((uVar6 < 8) || ((ulong)((lVar9 + lVar7) - (lVar11 + lVar10)) < 0x20)) {
    uVar2 = 0;
LAB_008619cc:
    do {
      *(undefined8 *)(lVar7 + uVar2 * 8) = *(undefined8 *)(lVar11 + lVar8 + uVar2 * 8);
      uVar2 = uVar2 + 1;
    } while (uVar6 != uVar2);
  }
  else {
    uVar2 = uVar6 & 0xfffffffffffffffc;
    puVar3 = (undefined8 *)(lVar7 + 0x10);
    puVar4 = (undefined8 *)(lVar8 + lVar11 + 0x10);
    uVar5 = uVar2;
    do {
      puVar1 = puVar4 + -1;
      uVar12 = puVar4[-2];
      uVar14 = puVar4[1];
      uVar13 = *puVar4;
      uVar5 = uVar5 - 4;
      puVar4 = puVar4 + 4;
      puVar3[-1] = *puVar1;
      puVar3[-2] = uVar12;
      puVar3[1] = uVar14;
      *puVar3 = uVar13;
      puVar3 = puVar3 + 4;
    } while (uVar5 != 0);
    if (uVar6 != uVar2) goto LAB_008619cc;
  }
  lVar9 = *(long *)(param_1 + 0x450);
LAB_008619f4:
  if (lVar8 + lVar9 != *(long *)(param_1 + 0x458)) {
    *(long *)(param_1 + 0x458) = lVar8 + lVar9;
  }
  auVar15._8_8_ = uVar6;
  auVar15._0_8_ = lVar7;
  return auVar15;
}

