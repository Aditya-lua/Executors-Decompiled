/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087987c
 */

long FUN_0087987c(long *param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  void *pvVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  
  lVar3 = tpidr_el0;
  lVar5 = *(long *)(lVar3 + 0x28);
  lVar12 = param_1[1] - *param_1;
  uVar7 = (lVar12 >> 3) * -0xf0f0f0f0f0f0f0f + 1;
  if (uVar7 < 0x1e1e1e1e1e1e1e2) {
    lVar9 = param_1[2] - *param_1 >> 3;
    uVar10 = lVar9 * -0x1e1e1e1e1e1e1e1e;
    if (uVar10 <= uVar7) {
      uVar10 = uVar7;
    }
    if (0xf0f0f0f0f0f0ef < (ulong)(lVar9 * -0xf0f0f0f0f0f0f0f)) {
      uVar10 = 0x1e1e1e1e1e1e1e1;
    }
    if (uVar10 == 0) {
      pvVar4 = (void *)0x0;
    }
    else {
      if (0x1e1e1e1e1e1e1e1 < uVar10) goto LAB_00879a84;
      pvVar4 = operator_new(uVar10 * 0x88);
    }
    lVar12 = (long)pvVar4 + lVar12;
                    /* try { // try from 00879940 to 00879947 has its CatchHandler @ 00879a98 */
    FUN_00879ac0(lVar12,param_2);
    puVar13 = (undefined8 *)*param_1;
    puVar2 = (undefined8 *)param_1[1];
    puVar1 = (undefined8 *)((long)puVar13 + (lVar12 - (long)puVar2));
    if (puVar2 != puVar13) {
      puVar6 = puVar13;
      puVar8 = puVar1;
      do {
        uVar14 = puVar6[1];
        uVar11 = *puVar6;
        puVar8[2] = puVar6[2];
        puVar8[1] = uVar14;
        *puVar8 = uVar11;
        uVar11 = puVar6[3];
        puVar6[1] = 0;
        puVar6[2] = 0;
        *puVar6 = 0;
        *(undefined4 *)(puVar8 + 4) = *(undefined4 *)(puVar6 + 4);
        puVar8[3] = uVar11;
        uVar14 = puVar6[6];
        uVar11 = puVar6[5];
        puVar8[7] = puVar6[7];
        puVar8[6] = uVar14;
        puVar8[5] = uVar11;
        uVar14 = puVar6[9];
        uVar11 = puVar6[8];
        puVar6[6] = 0;
        puVar6[7] = 0;
        puVar6[5] = 0;
        puVar8[10] = puVar6[10];
        puVar8[9] = uVar14;
        puVar8[8] = uVar11;
        puVar6[8] = 0;
        puVar6[9] = 0;
        puVar6[10] = 0;
        puVar8[0xb] = 0;
        puVar8[0xc] = 0;
        puVar8[0xd] = 0;
        uVar11 = puVar6[0xb];
        puVar8[0xc] = puVar6[0xc];
        puVar8[0xb] = uVar11;
        puVar8[0xd] = puVar6[0xd];
        uVar14 = puVar6[0xf];
        uVar11 = puVar6[0xe];
        puVar6[0xb] = 0;
        puVar6[0xc] = 0;
        puVar6[0xd] = 0;
        puVar8[0x10] = puVar6[0x10];
        puVar8[0xf] = uVar14;
        puVar8[0xe] = uVar11;
        puVar8 = puVar8 + 0x11;
        puVar6[0xf] = 0;
        puVar6[0x10] = 0;
        puVar6[0xe] = 0;
        puVar6 = puVar6 + 0x11;
      } while (puVar6 != puVar2);
      do {
        FUN_00873e90(puVar13);
        puVar13 = puVar13 + 0x11;
      } while (puVar13 != puVar2);
      puVar13 = (undefined8 *)*param_1;
    }
    lVar9 = param_1[2];
    *param_1 = (long)puVar1;
    param_1[1] = lVar12 + 0x88;
    param_1[2] = (long)((long)pvVar4 + uVar10 * 0x88);
    if (puVar13 != (undefined8 *)0x0) {
      operator_delete(puVar13,lVar9 - (long)puVar13);
    }
    if (*(long *)(lVar3 + 0x28) == lVar5) {
      return lVar12 + 0x88;
    }
  }
  else {
    if (*(long *)(lVar3 + 0x28) != lVar5) goto LAB_00879abc;
    FUN_008797b8();
LAB_00879a84:
    if (*(long *)(lVar3 + 0x28) == lVar5) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_00879abc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

