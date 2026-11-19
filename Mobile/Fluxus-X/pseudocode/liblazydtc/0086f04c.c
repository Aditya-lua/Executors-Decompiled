/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f04c
 */

undefined8 * FUN_0086f04c(long *param_1,long param_2)

{
  undefined8 *puVar1;
  byte bVar2;
  long lVar3;
  void *pvVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long lVar14;
  undefined8 uVar15;
  
  lVar3 = tpidr_el0;
  lVar6 = *(long *)(lVar3 + 0x28);
  puVar5 = (undefined8 *)*param_1;
  puVar13 = (undefined8 *)param_1[1];
  lVar14 = (long)puVar13 - (long)puVar5;
  uVar9 = (lVar14 >> 4) * -0x5555555555555555 + 1;
  if (uVar9 < 0x555555555555556) {
    lVar11 = param_1[2] - (long)puVar5 >> 4;
    uVar12 = lVar11 * 0x5555555555555556;
    if (uVar12 <= uVar9) {
      uVar12 = uVar9;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar11 * -0x5555555555555555)) {
      uVar12 = 0x555555555555555;
    }
    if (uVar12 == 0) {
      pvVar4 = (void *)0x0;
    }
    else {
      if (0x555555555555555 < uVar12) goto LAB_0086f238;
      pvVar4 = operator_new(uVar12 * 0x30);
    }
    puVar1 = (undefined8 *)((long)pvVar4 + lVar14);
    bVar2 = *(byte *)(param_2 + 0x18);
    uVar15 = *(undefined8 *)(param_2 + 0x10);
    uVar7 = *(undefined8 *)(param_2 + 8);
    *puVar1 = &PTR_LAB_00c4a5f8;
    puVar1[2] = uVar15;
    puVar1[1] = uVar7;
    if ((bVar2 & 1) == 0) {
      uVar15 = *(undefined8 *)(param_2 + 0x18);
      uVar7 = *(undefined8 *)(param_2 + 0x28);
      puVar1[4] = *(undefined8 *)(param_2 + 0x20);
      puVar1[3] = uVar15;
      puVar1[5] = uVar7;
    }
    else {
                    /* try { // try from 0086f158 to 0086f15f has its CatchHandler @ 0086f24c */
      FUN_007ff40c(puVar1 + 3,*(undefined8 *)(param_2 + 0x28),*(undefined8 *)(param_2 + 0x20));
      puVar5 = (undefined8 *)*param_1;
      puVar13 = (undefined8 *)param_1[1];
      lVar14 = (long)puVar13 - (long)puVar5;
    }
    if (puVar5 != puVar13) {
      puVar8 = puVar5;
      puVar10 = (undefined8 *)((long)puVar1 - lVar14);
      do {
        *puVar10 = &PTR_LAB_00c4a5f8;
        uVar7 = puVar8[1];
        puVar10[2] = puVar8[2];
        puVar10[1] = uVar7;
        uVar15 = puVar8[4];
        uVar7 = puVar8[3];
        puVar10[5] = puVar8[5];
        puVar10[4] = uVar15;
        puVar10[3] = uVar7;
        puVar10 = puVar10 + 6;
        puVar8[4] = 0;
        puVar8[5] = 0;
        puVar8[3] = 0;
        puVar8 = puVar8 + 6;
      } while (puVar8 != puVar13);
      do {
        puVar10 = puVar5 + 6;
        (**(code **)*puVar5)(puVar5);
        puVar5 = puVar10;
      } while (puVar10 != puVar13);
      puVar5 = (undefined8 *)*param_1;
    }
    lVar11 = param_1[2];
    *param_1 = (long)puVar1 - lVar14;
    param_1[1] = (long)(puVar1 + 6);
    param_1[2] = (long)((long)pvVar4 + uVar12 * 0x30);
    if (puVar5 != (undefined8 *)0x0) {
      operator_delete(puVar5,lVar11 - (long)puVar5);
    }
    if (*(long *)(lVar3 + 0x28) == lVar6) {
      return puVar1 + 6;
    }
  }
  else {
    if (*(long *)(lVar3 + 0x28) != lVar6) goto LAB_0086f278;
    FUN_0086f2dc();
LAB_0086f238:
    if (*(long *)(lVar3 + 0x28) == lVar6) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_0086f278:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

