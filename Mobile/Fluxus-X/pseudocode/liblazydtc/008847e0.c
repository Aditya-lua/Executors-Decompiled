/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008847e0
 */

undefined8 * FUN_008847e0(undefined8 *param_1,undefined8 *param_2,ulong param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  void *pvVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulong uVar13;
  void *__src;
  ulong uVar14;
  size_t sVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  if (param_3 == 0) {
    return param_2;
  }
  puVar12 = (undefined8 *)param_1[1];
  if ((ulong)(param_1[2] - (long)puVar12 >> 3) < param_3) {
    __src = (void *)*param_1;
    uVar5 = param_3 + ((long)puVar12 - (long)__src >> 3);
    if (uVar5 >> 0x3d != 0) {
      FUN_0086f78c();
LAB_00884b2c:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar14 = param_1[2] - (long)__src;
    uVar10 = (long)uVar14 >> 2;
    if ((ulong)((long)uVar14 >> 2) <= uVar5) {
      uVar10 = uVar5;
    }
    if (0x7ffffffffffffff7 < uVar14) {
      uVar10 = 0x1fffffffffffffff;
    }
    if (uVar10 == 0) {
      pvVar2 = (void *)0x0;
    }
    else {
      if (uVar10 >> 0x3d != 0) goto LAB_00884b2c;
      pvVar2 = operator_new(uVar10 << 3);
    }
    sVar15 = (long)param_2 - (long)__src;
    puVar4 = (undefined8 *)((long)pvVar2 + sVar15);
    uVar5 = param_3 - 1 & 0x1fffffffffffffff;
    puVar6 = puVar4 + param_3;
    uVar3 = *param_4;
    puVar9 = puVar4;
    if (2 < uVar5) {
      uVar5 = uVar5 + 1;
      uVar7 = uVar5 & 0x3ffffffffffffffc;
      puVar9 = (undefined8 *)((long)pvVar2 + sVar15 + 0x10);
      uVar13 = uVar7;
      do {
        uVar13 = uVar13 - 4;
        puVar9[-1] = uVar3;
        puVar9[-2] = uVar3;
        puVar9[1] = uVar3;
        *puVar9 = uVar3;
        puVar9 = puVar9 + 4;
      } while (uVar13 != 0);
      puVar9 = puVar4 + uVar7;
      if (uVar5 == uVar7) goto LAB_008849ac;
    }
    do {
      puVar11 = puVar9 + 1;
      *puVar9 = uVar3;
      puVar9 = puVar11;
    } while (puVar11 != puVar6);
LAB_008849ac:
    memcpy(puVar6,param_2,(long)puVar12 - (long)param_2);
    param_1[1] = param_2;
    memcpy(puVar4 + -((long)sVar15 >> 3),__src,sVar15);
    *param_1 = puVar4 + -((long)sVar15 >> 3);
    param_1[1] = (long)puVar6 + ((long)puVar12 - (long)param_2);
    param_1[2] = (void *)((long)pvVar2 + uVar10 * 8);
    if (__src != (void *)0x0) {
      operator_delete(__src,uVar14);
    }
    return puVar4;
  }
  uVar5 = (long)puVar12 - (long)param_2 >> 3;
  if (param_3 < uVar5 || param_3 - uVar5 == 0) {
    puVar4 = puVar12;
    uVar5 = param_3;
  }
  else {
    puVar4 = puVar12 + (param_3 - uVar5);
    uVar10 = (param_3 * 8 - ((long)puVar12 - (long)param_2)) - 8;
    uVar3 = *param_4;
    puVar6 = puVar12;
    if (uVar10 < 0x18) {
LAB_008848dc:
      do {
        puVar9 = puVar6 + 1;
        *puVar6 = uVar3;
        puVar6 = puVar9;
      } while (puVar9 != puVar4);
    }
    else {
      puVar6 = puVar12 + 2;
      uVar10 = (uVar10 >> 3) + 1;
      uVar13 = uVar10 & 0x3ffffffffffffffc;
      uVar14 = uVar13;
      do {
        uVar14 = uVar14 - 4;
        puVar6[-1] = uVar3;
        puVar6[-2] = uVar3;
        puVar6[1] = uVar3;
        *puVar6 = uVar3;
        puVar6 = puVar6 + 4;
      } while (uVar14 != 0);
      puVar6 = puVar12 + uVar13;
      if (uVar10 != uVar13) goto LAB_008848dc;
    }
    param_1[1] = puVar4;
    if (puVar12 == param_2) {
      return param_2;
    }
  }
  puVar6 = puVar4 + -param_3;
  puVar9 = puVar4;
  if (puVar6 < puVar12) {
    puVar9 = puVar12;
    if (puVar12 <= puVar6 + 1) {
      puVar9 = puVar6 + 1;
    }
    uVar10 = (long)puVar9 + param_3 * 8 + ~(ulong)puVar4;
    if (uVar10 < 0x38) {
      puVar8 = puVar4;
      puVar11 = puVar6;
    }
    else {
      puVar8 = puVar4;
      puVar11 = puVar6;
      if (0x1f < param_3 * 8) {
        puVar8 = puVar4 + 2;
        uVar10 = (uVar10 >> 3) + 1;
        uVar13 = uVar10 & 0x3ffffffffffffffc;
        puVar11 = puVar6 + uVar13;
        puVar9 = puVar4 + uVar13;
        puVar6 = puVar6 + 2;
        uVar14 = uVar13;
        do {
          puVar1 = puVar6 + -1;
          uVar3 = puVar6[-2];
          uVar17 = puVar6[1];
          uVar16 = *puVar6;
          uVar14 = uVar14 - 4;
          puVar6 = puVar6 + 4;
          puVar8[-1] = *puVar1;
          puVar8[-2] = uVar3;
          puVar8[1] = uVar17;
          *puVar8 = uVar16;
          puVar8 = puVar8 + 4;
        } while (uVar14 != 0);
        puVar8 = puVar9;
        if (uVar10 == uVar13) goto LAB_00884a70;
      }
    }
    do {
      puVar6 = puVar11 + 1;
      puVar9 = puVar8 + 1;
      *puVar8 = *puVar11;
      puVar8 = puVar9;
      puVar11 = puVar6;
    } while (puVar6 < puVar12);
  }
LAB_00884a70:
  param_1[1] = puVar9;
  if (puVar4 != param_2 + param_3) {
    sVar15 = (long)puVar4 - (long)(param_2 + param_3);
    memmove((void *)((long)puVar4 - sVar15),param_2,sVar15);
    puVar9 = (undefined8 *)param_1[1];
  }
  if (puVar9 <= param_4 || param_4 < param_2) {
    param_3 = 0;
  }
  uVar3 = param_4[param_3];
  if (uVar5 < 4) {
    puVar4 = param_2;
    uVar14 = uVar5;
  }
  else {
    uVar13 = uVar5 & 0xfffffffffffffffc;
    uVar14 = uVar5 & 3;
    puVar4 = param_2 + uVar13;
    puVar12 = param_2 + 2;
    uVar10 = uVar13;
    do {
      uVar10 = uVar10 - 4;
      puVar12[-1] = uVar3;
      puVar12[-2] = uVar3;
      puVar12[1] = uVar3;
      *puVar12 = uVar3;
      puVar12 = puVar12 + 4;
    } while (uVar10 != 0);
    if (uVar5 == uVar13) {
      return param_2;
    }
  }
  do {
    uVar14 = uVar14 - 1;
    *puVar4 = uVar3;
    puVar4 = puVar4 + 1;
  } while (uVar14 != 0);
  return param_2;
}

