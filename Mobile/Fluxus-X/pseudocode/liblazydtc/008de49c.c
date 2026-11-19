/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008de49c
 */

void * FUN_008de49c(undefined8 *param_1,void *param_2,void *param_3,undefined1 *param_4,
                   size_t param_5)

{
  void *__dest;
  undefined1 *puVar1;
  undefined8 *puVar2;
  void *pvVar3;
  void *extraout_x0;
  size_t __n;
  undefined1 *puVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  undefined8 *puVar12;
  void *pvVar13;
  size_t sVar14;
  ulong uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  
  if ((long)param_5 < 1) {
    return param_2;
  }
  puVar1 = (undefined1 *)param_1[1];
  if (param_1[2] - (long)puVar1 < (long)param_5) {
    pvVar13 = (void *)*param_1;
    puVar7 = puVar1 + (param_5 - (long)pvVar13);
    if (-1 < (long)puVar7) {
      uVar15 = param_1[2] - (long)pvVar13;
      puVar6 = (undefined1 *)(uVar15 * 2);
      if ((undefined1 *)(uVar15 * 2) <= puVar7) {
        puVar6 = puVar7;
      }
      if (0x3ffffffffffffffe < uVar15) {
        puVar6 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar6 == (undefined1 *)0x0) {
        pvVar3 = (void *)0x0;
      }
      else {
        pvVar3 = operator_new((ulong)puVar6);
      }
      __dest = (void *)((long)pvVar3 + ((long)param_2 - (long)pvVar13));
      memcpy(__dest,param_3,param_5);
      memcpy((void *)((long)__dest + param_5),param_2,(long)puVar1 - (long)param_2);
      param_1[1] = param_2;
      memcpy(pvVar3,pvVar13,(long)param_2 - (long)pvVar13);
      *param_1 = pvVar3;
      param_1[1] = (long)((long)__dest + param_5) + ((long)puVar1 - (long)param_2);
      param_1[2] = (undefined1 *)((long)pvVar3 + (long)puVar6);
      if (pvVar13 != (void *)0x0) {
        operator_delete(pvVar13,uVar15);
      }
      return __dest;
    }
    auVar19 = FUN_0080734c();
    pvVar13 = auVar19._8_8_;
    if (pvVar13 == (void *)0x0) {
      return auVar19._0_8_;
    }
    pvVar3 = *(void **)((long)pvVar13 + 0x870);
    if (pvVar3 != (void *)0x0) {
      *(void **)((long)pvVar13 + 0x878) = pvVar3;
      operator_delete(pvVar3,*(long *)((long)pvVar13 + 0x880) - (long)pvVar3);
    }
    pvVar3 = *(void **)((long)pvVar13 + 0x858);
    if (pvVar3 != (void *)0x0) {
      *(void **)((long)pvVar13 + 0x860) = pvVar3;
      operator_delete(pvVar3,*(long *)((long)pvVar13 + 0x868) - (long)pvVar3);
    }
    pvVar3 = *(void **)((long)pvVar13 + 0x40);
    if (pvVar3 != (void *)0x0) {
      *(void **)((long)pvVar13 + 0x48) = pvVar3;
      operator_delete(pvVar3,*(long *)((long)pvVar13 + 0x50) - (long)pvVar3);
    }
    pvVar3 = *(void **)((long)pvVar13 + 0x28);
    if (pvVar3 != (void *)0x0) {
      *(void **)((long)pvVar13 + 0x30) = pvVar3;
      operator_delete(pvVar3,*(long *)((long)pvVar13 + 0x38) - (long)pvVar3);
    }
    pvVar3 = *(void **)((long)pvVar13 + 0x10);
    if (pvVar3 != (void *)0x0) {
      *(void **)((long)pvVar13 + 0x18) = pvVar3;
      operator_delete(pvVar3,*(long *)((long)pvVar13 + 0x20) - (long)pvVar3);
    }
    operator_delete(pvVar13,0x888);
    return extraout_x0;
  }
  sVar14 = (long)puVar1 - (long)param_2;
  if ((long)sVar14 < (long)param_5) {
    puVar7 = (undefined1 *)((long)param_3 + sVar14);
    if (puVar7 == param_4) {
      puVar6 = puVar1;
    }
    else {
      puVar5 = (undefined1 *)((long)param_2 + (long)param_4) + (-(long)puVar1 - (long)param_3);
      puVar4 = puVar1;
      if (((undefined1 *)0x1f < puVar5) && (0x1f < (ulong)((long)param_2 - (long)param_3))) {
        puVar10 = (undefined8 *)(puVar1 + 0x10);
        puVar8 = (undefined1 *)((ulong)puVar5 & 0xffffffffffffffe0);
        puVar6 = puVar1 + (long)puVar8;
        puVar12 = (undefined8 *)((long)param_3 + ((long)puVar10 - (long)param_2));
        puVar4 = puVar8;
        do {
          puVar2 = puVar12 + -1;
          uVar16 = puVar12[-2];
          uVar18 = puVar12[1];
          uVar17 = *puVar12;
          puVar4 = puVar4 + -0x20;
          puVar12 = puVar12 + 4;
          puVar10[-1] = *puVar2;
          puVar10[-2] = uVar16;
          puVar10[1] = uVar18;
          *puVar10 = uVar17;
          puVar10 = puVar10 + 4;
        } while (puVar4 != (undefined1 *)0x0);
        puVar7 = puVar7 + (long)puVar8;
        puVar4 = puVar6;
        if (puVar5 == puVar8) goto LAB_008de6dc;
      }
      do {
        puVar5 = puVar7 + 1;
        *puVar4 = *puVar7;
        puVar7 = puVar5;
        puVar6 = puVar4 + 1;
        puVar4 = puVar4 + 1;
      } while (puVar5 != param_4);
    }
LAB_008de6dc:
    param_1[1] = puVar6;
    if ((long)sVar14 < 1) {
      return param_2;
    }
    puVar7 = puVar6 + -param_5;
    if (puVar7 < puVar1) {
      puVar8 = puVar1 + (param_5 - (long)puVar6);
      puVar5 = puVar6;
      if (((undefined1 *)0x1f < puVar8) && (0x1f < param_5)) {
        puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffe0);
        puVar10 = (undefined8 *)(puVar6 + 0x10);
        puVar4 = puVar6 + (long)puVar11;
        puVar12 = (undefined8 *)((long)puVar10 - param_5);
        puVar5 = puVar11;
        do {
          puVar2 = puVar12 + -1;
          uVar16 = puVar12[-2];
          uVar18 = puVar12[1];
          uVar17 = *puVar12;
          puVar5 = puVar5 + -0x20;
          puVar12 = puVar12 + 4;
          puVar10[-1] = *puVar2;
          puVar10[-2] = uVar16;
          puVar10[1] = uVar18;
          *puVar10 = uVar17;
          puVar10 = puVar10 + 4;
        } while (puVar5 != (undefined1 *)0x0);
        puVar7 = puVar7 + (long)puVar11;
        puVar5 = puVar4;
        if (puVar8 == puVar11) goto LAB_008de76c;
      }
      do {
        puVar8 = puVar7 + 1;
        *puVar5 = *puVar7;
        puVar7 = puVar8;
        puVar4 = puVar5 + 1;
        puVar5 = puVar5 + 1;
      } while (puVar8 != puVar1);
    }
    else {
      puVar4 = puVar6;
    }
LAB_008de76c:
    param_1[1] = puVar4;
    if (puVar6 != (undefined1 *)((long)param_2 + param_5)) {
      __n = (long)puVar6 - (long)((long)param_2 + param_5);
      memmove(puVar6 + -__n,param_2,__n);
    }
    param_5 = sVar14;
    goto LAB_008de7a0;
  }
  puVar7 = puVar1 + -param_5;
  if (puVar7 < puVar1) {
    puVar4 = puVar1;
    if (0x1f < param_5) {
      uVar9 = param_5 & 0x7fffffffffffffe0;
      puVar10 = (undefined8 *)(puVar1 + 0x10);
      puVar12 = (undefined8 *)((long)puVar10 - param_5);
      uVar15 = uVar9;
      do {
        puVar2 = puVar12 + -1;
        uVar16 = puVar12[-2];
        uVar18 = puVar12[1];
        uVar17 = *puVar12;
        uVar15 = uVar15 - 0x20;
        puVar12 = puVar12 + 4;
        puVar10[-1] = *puVar2;
        puVar10[-2] = uVar16;
        puVar10[1] = uVar18;
        *puVar10 = uVar17;
        puVar10 = puVar10 + 4;
      } while (uVar15 != 0);
      puVar7 = puVar7 + uVar9;
      puVar4 = puVar1 + uVar9;
      puVar6 = puVar1 + uVar9;
      if (param_5 == uVar9) goto LAB_008de688;
    }
    do {
      puVar5 = puVar7 + 1;
      puVar6 = puVar4 + 1;
      *puVar4 = *puVar7;
      puVar7 = puVar5;
      puVar4 = puVar6;
    } while (puVar5 != puVar1);
  }
  else {
    puVar6 = puVar1;
  }
LAB_008de688:
  param_1[1] = puVar6;
  if (puVar1 != (undefined1 *)((long)param_2 + param_5)) {
    sVar14 = (long)puVar1 - (long)((long)param_2 + param_5);
    memmove(puVar1 + -sVar14,param_2,sVar14);
  }
LAB_008de7a0:
  memmove(param_2,param_3,param_5);
  return param_2;
}

