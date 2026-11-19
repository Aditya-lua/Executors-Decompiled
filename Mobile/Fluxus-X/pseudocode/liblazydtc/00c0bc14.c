/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0bc14
 */

undefined1  [16] FUN_00c0bc14(undefined1 *param_1,undefined1 *param_2,undefined1 *param_3)

{
  undefined1 uVar1;
  size_t sVar2;
  size_t __n;
  undefined1 *puVar3;
  size_t sVar4;
  undefined1 *puVar5;
  long lVar6;
  size_t sVar7;
  size_t sVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  
  sVar2 = (long)param_2 - (long)param_1;
  puVar3 = param_3;
  if (sVar2 == 0) goto LAB_00c0bdac;
  __n = (long)param_3 - (long)param_2;
  if (__n == 0) {
    puVar3 = param_1;
    goto LAB_00c0bdac;
  }
  if (param_1 + 1 == param_2) {
    uVar1 = *param_1;
    memmove(param_1,param_1 + 1,__n);
    param_1[__n] = uVar1;
    puVar3 = param_1 + __n;
    goto LAB_00c0bdac;
  }
  if (param_2 + 1 == param_3) {
    puVar3 = param_3 + -1;
    uVar1 = *puVar3;
    if ((long)puVar3 - (long)param_1 != 0) {
      memmove(param_3 + -((long)puVar3 - (long)param_1),param_1,(long)puVar3 - (long)param_1);
    }
    *param_1 = uVar1;
    puVar3 = param_3 + -((long)puVar3 - (long)param_1);
    goto LAB_00c0bdac;
  }
  if (sVar2 != __n) {
    sVar4 = sVar2;
    sVar8 = __n;
    do {
      sVar7 = sVar8;
      lVar6 = 0;
      if (sVar7 != 0) {
        lVar6 = (long)sVar4 / (long)sVar7;
      }
      sVar8 = sVar4 - lVar6 * sVar7;
      sVar4 = sVar7;
    } while (sVar8 != 0);
    puVar3 = param_1 + sVar7;
    do {
      puVar3 = puVar3 + -1;
      uVar1 = *puVar3;
      puVar11 = puVar3;
      puVar5 = puVar3 + sVar2;
      do {
        puVar12 = puVar5;
        puVar5 = puVar12 + sVar2;
        if ((long)param_3 - (long)puVar12 <= (long)sVar2) {
          puVar5 = param_2 + -((long)param_3 - (long)puVar12);
        }
        *puVar11 = *puVar12;
        puVar11 = puVar12;
      } while (puVar5 != puVar3);
      *puVar12 = uVar1;
    } while (puVar3 != param_1);
    puVar3 = param_1 + __n;
    goto LAB_00c0bdac;
  }
  puVar5 = param_3 + ~(ulong)param_2;
  puVar11 = param_2 + ~(ulong)param_1;
  puVar3 = puVar5;
  if (puVar11 <= puVar5) {
    puVar3 = puVar11;
  }
  puVar3 = puVar3 + 1;
  puVar12 = param_2;
  if (puVar3 < (undefined1 *)0x8) {
LAB_00c0bd14:
    do {
      puVar3 = puVar12 + 1;
      uVar1 = *param_1;
      *param_1 = *puVar12;
      *puVar12 = uVar1;
      if (param_1 + 1 == param_2) break;
      param_1 = param_1 + 1;
      puVar12 = puVar3;
    } while (puVar3 != param_3);
  }
  else {
    if (puVar11 <= puVar5) {
      puVar5 = puVar11;
    }
    if ((param_1 < param_2 + (long)(puVar5 + 1)) && (param_2 < param_1 + (long)(puVar5 + 1)))
    goto LAB_00c0bd14;
    if (puVar3 < (undefined1 *)0x20) {
      puVar5 = (undefined1 *)0x0;
LAB_00c0be18:
      puVar11 = (undefined1 *)((ulong)puVar3 & 0xfffffffffffffff8);
      puVar9 = (undefined8 *)(param_1 + (long)puVar5);
      param_1 = param_1 + (long)puVar11;
      lVar6 = (long)puVar5 - (long)puVar11;
      puVar10 = (undefined8 *)(param_2 + (long)puVar5);
      do {
        uVar14 = *puVar9;
        lVar6 = lVar6 + 8;
        *puVar9 = *puVar10;
        *puVar10 = uVar14;
        puVar10 = puVar10 + 1;
        puVar9 = puVar9 + 1;
      } while (lVar6 != 0);
      puVar12 = param_2 + (long)puVar11;
      if (puVar3 != puVar11) goto LAB_00c0bd14;
    }
    else {
      puVar5 = (undefined1 *)((ulong)puVar3 & 0xffffffffffffffe0);
      puVar9 = (undefined8 *)(param_2 + 0x10);
      puVar10 = (undefined8 *)(param_1 + 0x10);
      puVar11 = puVar5;
      do {
        uVar14 = puVar10[-2];
        uVar15 = puVar10[1];
        uVar13 = *puVar10;
        puVar11 = puVar11 + -0x20;
        uVar17 = puVar9[-1];
        uVar16 = puVar9[-2];
        uVar19 = puVar9[1];
        uVar18 = *puVar9;
        puVar9[-1] = puVar10[-1];
        puVar9[-2] = uVar14;
        puVar9[1] = uVar15;
        *puVar9 = uVar13;
        puVar9 = puVar9 + 4;
        puVar10[-1] = uVar17;
        puVar10[-2] = uVar16;
        puVar10[1] = uVar19;
        *puVar10 = uVar18;
        puVar10 = puVar10 + 4;
      } while (puVar11 != (undefined1 *)0x0);
      if (puVar3 != puVar5) {
        if (((ulong)puVar3 & 0x18) == 0) {
          param_1 = param_1 + (long)puVar5;
          puVar12 = param_2 + (long)puVar5;
          goto LAB_00c0bd14;
        }
        goto LAB_00c0be18;
      }
    }
  }
  puVar3 = param_2;
LAB_00c0bdac:
  auVar20._8_8_ = param_3;
  auVar20._0_8_ = puVar3;
  return auVar20;
}

