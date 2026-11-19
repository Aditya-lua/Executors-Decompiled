/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084d118
 */

void FUN_0084d118(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,ulong param_4)

{
  size_t __n;
  undefined8 *puVar1;
  void *pvVar2;
  long *plVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  void *__src;
  void *__dest;
  long lVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined1 auVar22 [16];
  
  uVar5 = param_1[2];
  puVar1 = (undefined8 *)*param_1;
  if ((ulong)((long)(uVar5 - (long)puVar1) >> 4) < param_4) {
    if (puVar1 != (undefined8 *)0x0) {
      param_1[1] = puVar1;
      operator_delete(puVar1,uVar5 - (long)puVar1);
      uVar5 = 0;
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
    }
    if (param_4 >> 0x3c == 0) {
      uVar7 = (long)uVar5 >> 3;
      if ((ulong)((long)uVar5 >> 3) <= param_4) {
        uVar7 = param_4;
      }
      if (0x7fffffffffffffef < uVar5) {
        uVar7 = 0xfffffffffffffff;
      }
      if (uVar7 >> 0x3c == 0) {
        pvVar2 = operator_new(uVar7 * 0x10);
        *param_1 = pvVar2;
        param_1[1] = pvVar2;
        param_1[2] = (void *)((long)pvVar2 + uVar7 * 0x10);
        if (param_2 != param_3) {
          __n = ((long)param_3 + (-0x10 - (long)param_2) & 0xfffffffffffffff0U) + 0x10;
          memcpy(pvVar2,param_2,__n);
          pvVar2 = (void *)((long)pvVar2 + __n);
        }
        param_1[1] = pvVar2;
        return;
      }
    }
    auVar22 = FUN_00844e28();
    uVar5 = auVar22._8_8_;
    plVar3 = auVar22._0_8_;
    puVar1 = (undefined8 *)plVar3[1];
    lVar8 = plVar3[2];
    if ((ulong)((lVar8 - (long)puVar1 >> 3) * -0x5555555555555555) < uVar5) {
      lVar14 = (long)puVar1 - *plVar3;
      uVar7 = uVar5 + (lVar14 >> 3) * -0x5555555555555555;
      if (0xaaaaaaaaaaaaaaa < uVar7) {
        FUN_0084d528();
LAB_0084d524:
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      lVar10 = lVar8 - *plVar3 >> 3;
      uVar12 = lVar10 * 0x5555555555555556;
      if (uVar12 <= uVar7) {
        uVar12 = uVar7;
      }
      if (0x555555555555554 < (ulong)(lVar10 * -0x5555555555555555)) {
        uVar12 = 0xaaaaaaaaaaaaaaa;
      }
      if (uVar12 == 0) {
        pvVar2 = (void *)0x0;
      }
      else {
        if (0xaaaaaaaaaaaaaaa < uVar12) goto LAB_0084d524;
        pvVar2 = operator_new(uVar12 * 0x18);
      }
      lVar10 = uVar5 * 0x18;
      puVar6 = (undefined8 *)((long)pvVar2 + lVar14);
      puVar4 = puVar6;
      do {
        *puVar4 = 0;
        puVar4[1] = 0;
        lVar10 = lVar10 + -0x18;
        *(undefined1 *)(puVar4 + 2) = 0;
        puVar4 = puVar4 + 3;
      } while (lVar10 != 0);
      __src = (void *)*plVar3;
      __dest = (void *)((long)puVar6 - ((long)puVar1 - (long)__src));
      memcpy(__dest,__src,(long)puVar1 - (long)__src);
      *plVar3 = (long)__dest;
      plVar3[1] = (long)(puVar6 + uVar5 * 3);
      plVar3[2] = (long)((long)pvVar2 + uVar12 * 0x18);
      if (__src != (void *)0x0) {
        operator_delete(__src,lVar8 - (long)__src);
        return;
      }
    }
    else {
      puVar4 = puVar1;
      if (uVar5 != 0) {
        puVar4 = puVar1 + uVar5 * 3;
        lVar8 = uVar5 * 0x18;
        do {
          *puVar1 = 0;
          puVar1[1] = 0;
          lVar8 = lVar8 + -0x18;
          *(undefined1 *)(puVar1 + 2) = 0;
          puVar1 = puVar1 + 3;
        } while (lVar8 != 0);
      }
      plVar3[1] = (long)puVar4;
    }
    return;
  }
  puVar4 = (undefined8 *)param_1[1];
  if (param_4 <= (ulong)((long)puVar4 - (long)puVar1 >> 4)) {
    if (param_2 == param_3) {
      param_1[1] = puVar1;
      return;
    }
    uVar5 = (long)param_3 + (-0x10 - (long)param_2);
    if (((uVar5 < 0xf0) ||
        (lVar8 = (uVar5 & 0xfffffffffffffff0) + 0x10, uVar7 = uVar5 & 0xfffffffffffffff0 | 8,
        param_2 < (undefined8 *)((long)puVar1 + uVar7) &&
        puVar1 < (undefined8 *)((long)param_2 + uVar7))) ||
       (puVar1 + 1 < (undefined8 *)((long)param_2 + lVar8) &&
        param_2 + 1 < (undefined8 *)((long)puVar1 + lVar8))) {
      puVar6 = param_2;
    }
    else {
      uVar5 = (uVar5 >> 4) + 1;
      uVar12 = uVar5 & 0x1ffffffffffffffc;
      puVar4 = puVar1 + uVar12 * 2;
      puVar6 = param_2 + uVar12 * 2;
      puVar9 = param_2 + 4;
      puVar1 = puVar1 + 4;
      uVar7 = uVar12;
      do {
        uVar15 = puVar9[-4];
        uVar17 = puVar9[-1];
        uVar16 = puVar9[-2];
        uVar7 = uVar7 - 4;
        uVar21 = puVar9[1];
        uVar20 = *puVar9;
        uVar19 = puVar9[3];
        uVar18 = puVar9[2];
        puVar1[-3] = puVar9[-3];
        puVar1[-4] = uVar15;
        puVar1[-1] = uVar17;
        puVar1[-2] = uVar16;
        puVar1[1] = uVar21;
        *puVar1 = uVar20;
        puVar1[3] = uVar19;
        puVar1[2] = uVar18;
        puVar9 = puVar9 + 8;
        puVar1 = puVar1 + 8;
      } while (uVar7 != 0);
      puVar1 = puVar4;
      if (uVar5 == uVar12) goto LAB_0084d284;
    }
    do {
      puVar9 = puVar6 + 2;
      uVar15 = puVar6[1];
      puVar4 = puVar1 + 2;
      *puVar1 = *puVar6;
      puVar1[1] = uVar15;
      puVar1 = puVar4;
      puVar6 = puVar9;
    } while (puVar9 != param_3);
    goto LAB_0084d284;
  }
  puVar6 = (undefined8 *)((long)param_2 + ((long)puVar4 - (long)puVar1));
  if ((long)puVar4 - (long)puVar1 != 0) {
    uVar5 = ((long)puVar4 - (long)puVar1) - 0x10;
    if (((uVar5 < 0xf0) ||
        (lVar8 = (uVar5 & 0xfffffffffffffff0) + 0x10, uVar7 = uVar5 & 0xfffffffffffffff0 | 8,
        param_2 < (undefined8 *)((long)puVar1 + uVar7) &&
        puVar1 < (undefined8 *)((long)param_2 + uVar7))) ||
       (puVar1 + 1 < (undefined8 *)((long)param_2 + lVar8) &&
        param_2 + 1 < (undefined8 *)((long)puVar1 + lVar8))) {
      puVar9 = puVar1;
      puVar11 = param_2;
    }
    else {
      uVar5 = (uVar5 >> 4) + 1;
      uVar12 = uVar5 & 0x1ffffffffffffffc;
      puVar9 = puVar1 + uVar12 * 2;
      puVar11 = param_2 + uVar12 * 2;
      puVar13 = param_2 + 4;
      puVar1 = puVar1 + 4;
      uVar7 = uVar12;
      do {
        uVar15 = puVar13[-4];
        uVar17 = puVar13[-1];
        uVar16 = puVar13[-2];
        uVar7 = uVar7 - 4;
        uVar21 = puVar13[1];
        uVar20 = *puVar13;
        uVar19 = puVar13[3];
        uVar18 = puVar13[2];
        puVar1[-3] = puVar13[-3];
        puVar1[-4] = uVar15;
        puVar1[-1] = uVar17;
        puVar1[-2] = uVar16;
        puVar1[1] = uVar21;
        *puVar1 = uVar20;
        puVar1[3] = uVar19;
        puVar1[2] = uVar18;
        puVar13 = puVar13 + 8;
        puVar1 = puVar1 + 8;
      } while (uVar7 != 0);
      if (uVar5 == uVar12) goto LAB_0084d22c;
    }
    do {
      puVar1 = puVar11 + 2;
      uVar15 = puVar11[1];
      *puVar9 = *puVar11;
      puVar9[1] = uVar15;
      puVar9 = puVar9 + 2;
      puVar11 = puVar1;
    } while (puVar1 != puVar6);
  }
LAB_0084d22c:
  if (puVar6 != param_3) {
    puVar1 = puVar4;
    do {
      puVar9 = puVar6 + 2;
      uVar15 = *puVar6;
      puVar4 = puVar4 + 2;
      puVar1[1] = puVar6[1];
      *puVar1 = uVar15;
      puVar1 = puVar1 + 2;
      puVar6 = puVar9;
    } while (puVar9 != param_3);
    param_1[1] = puVar4;
    return;
  }
LAB_0084d284:
  param_1[1] = puVar4;
  return;
}

