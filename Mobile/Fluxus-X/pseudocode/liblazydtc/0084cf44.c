/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084cf44
 */

void FUN_0084cf44(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,ulong param_4)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  void *pvVar3;
  long *plVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 *puVar14;
  ulong uVar15;
  undefined8 *puVar16;
  size_t sVar17;
  void *__src;
  void *__dest;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  
  lVar7 = param_1[2];
  puVar2 = (undefined8 *)*param_1;
  if (param_4 <= (ulong)((lVar7 - (long)puVar2 >> 3) * -0x5555555555555555)) {
    puVar5 = (undefined8 *)param_1[1];
    if ((ulong)(((long)puVar5 - (long)puVar2 >> 3) * -0x5555555555555555) < param_4) {
      puVar8 = (undefined8 *)((long)param_2 + ((long)puVar5 - (long)puVar2));
      if (puVar5 != puVar2) {
        do {
          puVar16 = param_2 + 1;
          uVar19 = *param_2;
          uVar1 = *(undefined1 *)(param_2 + 2);
          param_2 = param_2 + 3;
          puVar2[1] = *puVar16;
          *puVar2 = uVar19;
          *(undefined1 *)(puVar2 + 2) = uVar1;
          puVar2 = puVar2 + 3;
        } while (param_2 != puVar8);
      }
      if (puVar8 == param_3) {
        param_1[1] = puVar5;
      }
      else {
        puVar2 = puVar5;
        do {
          puVar16 = puVar8 + 3;
          uVar20 = puVar8[1];
          uVar19 = *puVar8;
          puVar5 = puVar5 + 3;
          puVar2[2] = puVar8[2];
          puVar2[1] = uVar20;
          *puVar2 = uVar19;
          puVar2 = puVar2 + 3;
          puVar8 = puVar16;
        } while (puVar16 != param_3);
        param_1[1] = puVar5;
      }
    }
    else {
      for (; param_2 != param_3; param_2 = param_2 + 3) {
        uVar19 = *param_2;
        uVar1 = *(undefined1 *)(param_2 + 2);
        puVar2[1] = param_2[1];
        *puVar2 = uVar19;
        *(undefined1 *)(puVar2 + 2) = uVar1;
        puVar2 = puVar2 + 3;
      }
      param_1[1] = puVar2;
    }
    return;
  }
  puVar5 = param_3;
  if (puVar2 != (undefined8 *)0x0) {
    param_1[1] = puVar2;
    operator_delete(puVar2,lVar7 - (long)puVar2);
    lVar7 = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  if (param_4 < 0xaaaaaaaaaaaaaab) {
    uVar11 = (lVar7 >> 3) * 0x5555555555555556;
    if (uVar11 <= param_4) {
      uVar11 = param_4;
    }
    if (0x555555555555554 < (ulong)((lVar7 >> 3) * -0x5555555555555555)) {
      uVar11 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar11 < 0xaaaaaaaaaaaaaab) {
      pvVar3 = operator_new(uVar11 * 0x18);
      *param_1 = pvVar3;
      param_1[1] = pvVar3;
      param_1[2] = (void *)((long)pvVar3 + uVar11 * 0x18);
      if (param_2 != param_3) {
        sVar17 = ((ulong)((long)param_3 + (-0x18 - (long)param_2)) / 0x18) * 0x18 + 0x18;
        memcpy(pvVar3,param_2,sVar17);
        pvVar3 = (void *)((long)pvVar3 + sVar17);
      }
      param_1[1] = pvVar3;
      return;
    }
  }
  auVar26 = FUN_00844480();
  puVar16 = auVar26._8_8_;
  puVar8 = auVar26._0_8_;
  uVar11 = puVar8[2];
  puVar2 = (undefined8 *)*puVar8;
  if ((ulong)((long)(uVar11 - (long)puVar2) >> 4) < param_4) {
    if (puVar2 != (undefined8 *)0x0) {
      puVar8[1] = puVar2;
      operator_delete(puVar2,uVar11 - (long)puVar2);
      uVar11 = 0;
      *puVar8 = 0;
      puVar8[1] = 0;
      puVar8[2] = 0;
    }
    if (param_4 >> 0x3c == 0) {
      uVar10 = (long)uVar11 >> 3;
      if ((ulong)((long)uVar11 >> 3) <= param_4) {
        uVar10 = param_4;
      }
      if (0x7fffffffffffffef < uVar11) {
        uVar10 = 0xfffffffffffffff;
      }
      if (uVar10 >> 0x3c == 0) {
        pvVar3 = operator_new(uVar10 * 0x10);
        *puVar8 = pvVar3;
        puVar8[1] = pvVar3;
        puVar8[2] = (void *)((long)pvVar3 + uVar10 * 0x10);
        if (puVar16 != puVar5) {
          sVar17 = ((long)puVar5 + (-0x10 - (long)puVar16) & 0xfffffffffffffff0U) + 0x10;
          memcpy(pvVar3,puVar16,sVar17);
          pvVar3 = (void *)((long)pvVar3 + sVar17);
        }
        puVar8[1] = pvVar3;
        return;
      }
    }
    auVar26 = FUN_00844e28();
    uVar11 = auVar26._8_8_;
    plVar4 = auVar26._0_8_;
    puVar2 = (undefined8 *)plVar4[1];
    lVar7 = plVar4[2];
    if ((ulong)((lVar7 - (long)puVar2 >> 3) * -0x5555555555555555) < uVar11) {
      lVar18 = (long)puVar2 - *plVar4;
      uVar10 = uVar11 + (lVar18 >> 3) * -0x5555555555555555;
      if (0xaaaaaaaaaaaaaaa < uVar10) {
        FUN_0084d528();
LAB_0084d524:
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      lVar13 = lVar7 - *plVar4 >> 3;
      uVar15 = lVar13 * 0x5555555555555556;
      if (uVar15 <= uVar10) {
        uVar15 = uVar10;
      }
      if (0x555555555555554 < (ulong)(lVar13 * -0x5555555555555555)) {
        uVar15 = 0xaaaaaaaaaaaaaaa;
      }
      if (uVar15 == 0) {
        pvVar3 = (void *)0x0;
      }
      else {
        if (0xaaaaaaaaaaaaaaa < uVar15) goto LAB_0084d524;
        pvVar3 = operator_new(uVar15 * 0x18);
      }
      lVar13 = uVar11 * 0x18;
      puVar8 = (undefined8 *)((long)pvVar3 + lVar18);
      puVar5 = puVar8;
      do {
        *puVar5 = 0;
        puVar5[1] = 0;
        lVar13 = lVar13 + -0x18;
        *(undefined1 *)(puVar5 + 2) = 0;
        puVar5 = puVar5 + 3;
      } while (lVar13 != 0);
      __src = (void *)*plVar4;
      __dest = (void *)((long)puVar8 - ((long)puVar2 - (long)__src));
      memcpy(__dest,__src,(long)puVar2 - (long)__src);
      *plVar4 = (long)__dest;
      plVar4[1] = (long)(puVar8 + uVar11 * 3);
      plVar4[2] = (long)((long)pvVar3 + uVar15 * 0x18);
      if (__src != (void *)0x0) {
        operator_delete(__src,lVar7 - (long)__src);
        return;
      }
    }
    else {
      puVar5 = puVar2;
      if (uVar11 != 0) {
        puVar5 = puVar2 + uVar11 * 3;
        lVar7 = uVar11 * 0x18;
        do {
          *puVar2 = 0;
          puVar2[1] = 0;
          lVar7 = lVar7 + -0x18;
          *(undefined1 *)(puVar2 + 2) = 0;
          puVar2 = puVar2 + 3;
        } while (lVar7 != 0);
      }
      plVar4[1] = (long)puVar5;
    }
    return;
  }
  puVar6 = (undefined8 *)puVar8[1];
  if (param_4 <= (ulong)((long)puVar6 - (long)puVar2 >> 4)) {
    if (puVar16 == puVar5) {
      puVar8[1] = puVar2;
      return;
    }
    uVar11 = (long)puVar5 + (-0x10 - (long)puVar16);
    if (((uVar11 < 0xf0) ||
        (lVar7 = (uVar11 & 0xfffffffffffffff0) + 0x10, uVar10 = uVar11 & 0xfffffffffffffff0 | 8,
        puVar16 < (undefined8 *)((long)puVar2 + uVar10) &&
        puVar2 < (undefined8 *)((long)puVar16 + uVar10))) ||
       (puVar2 + 1 < (undefined8 *)((long)puVar16 + lVar7) &&
        puVar16 + 1 < (undefined8 *)((long)puVar2 + lVar7))) {
      puVar9 = puVar16;
    }
    else {
      uVar11 = (uVar11 >> 4) + 1;
      uVar15 = uVar11 & 0x1ffffffffffffffc;
      puVar6 = puVar2 + uVar15 * 2;
      puVar9 = puVar16 + uVar15 * 2;
      puVar16 = puVar16 + 4;
      puVar2 = puVar2 + 4;
      uVar10 = uVar15;
      do {
        uVar19 = puVar16[-4];
        uVar21 = puVar16[-1];
        uVar20 = puVar16[-2];
        uVar10 = uVar10 - 4;
        uVar25 = puVar16[1];
        uVar24 = *puVar16;
        uVar23 = puVar16[3];
        uVar22 = puVar16[2];
        puVar2[-3] = puVar16[-3];
        puVar2[-4] = uVar19;
        puVar2[-1] = uVar21;
        puVar2[-2] = uVar20;
        puVar2[1] = uVar25;
        *puVar2 = uVar24;
        puVar2[3] = uVar23;
        puVar2[2] = uVar22;
        puVar16 = puVar16 + 8;
        puVar2 = puVar2 + 8;
      } while (uVar10 != 0);
      puVar2 = puVar6;
      if (uVar11 == uVar15) goto LAB_0084d284;
    }
    do {
      puVar16 = puVar9 + 2;
      uVar19 = puVar9[1];
      puVar6 = puVar2 + 2;
      *puVar2 = *puVar9;
      puVar2[1] = uVar19;
      puVar2 = puVar6;
      puVar9 = puVar16;
    } while (puVar16 != puVar5);
    goto LAB_0084d284;
  }
  puVar9 = (undefined8 *)((long)puVar16 + ((long)puVar6 - (long)puVar2));
  if ((long)puVar6 - (long)puVar2 != 0) {
    uVar11 = ((long)puVar6 - (long)puVar2) - 0x10;
    if (((uVar11 < 0xf0) ||
        (lVar7 = (uVar11 & 0xfffffffffffffff0) + 0x10, uVar10 = uVar11 & 0xfffffffffffffff0 | 8,
        puVar16 < (undefined8 *)((long)puVar2 + uVar10) &&
        puVar2 < (undefined8 *)((long)puVar16 + uVar10))) ||
       (puVar2 + 1 < (undefined8 *)((long)puVar16 + lVar7) &&
        puVar16 + 1 < (undefined8 *)((long)puVar2 + lVar7))) {
      puVar12 = puVar2;
      puVar14 = puVar16;
    }
    else {
      uVar11 = (uVar11 >> 4) + 1;
      uVar15 = uVar11 & 0x1ffffffffffffffc;
      puVar12 = puVar2 + uVar15 * 2;
      puVar14 = puVar16 + uVar15 * 2;
      puVar16 = puVar16 + 4;
      puVar2 = puVar2 + 4;
      uVar10 = uVar15;
      do {
        uVar19 = puVar16[-4];
        uVar21 = puVar16[-1];
        uVar20 = puVar16[-2];
        uVar10 = uVar10 - 4;
        uVar25 = puVar16[1];
        uVar24 = *puVar16;
        uVar23 = puVar16[3];
        uVar22 = puVar16[2];
        puVar2[-3] = puVar16[-3];
        puVar2[-4] = uVar19;
        puVar2[-1] = uVar21;
        puVar2[-2] = uVar20;
        puVar2[1] = uVar25;
        *puVar2 = uVar24;
        puVar2[3] = uVar23;
        puVar2[2] = uVar22;
        puVar16 = puVar16 + 8;
        puVar2 = puVar2 + 8;
      } while (uVar10 != 0);
      if (uVar11 == uVar15) goto LAB_0084d22c;
    }
    do {
      puVar2 = puVar14 + 2;
      uVar19 = puVar14[1];
      *puVar12 = *puVar14;
      puVar12[1] = uVar19;
      puVar12 = puVar12 + 2;
      puVar14 = puVar2;
    } while (puVar2 != puVar9);
  }
LAB_0084d22c:
  if (puVar9 != puVar5) {
    puVar2 = puVar6;
    do {
      puVar16 = puVar9 + 2;
      uVar19 = *puVar9;
      puVar6 = puVar6 + 2;
      puVar2[1] = puVar9[1];
      *puVar2 = uVar19;
      puVar2 = puVar2 + 2;
      puVar9 = puVar16;
    } while (puVar16 != puVar5);
    puVar8[1] = puVar6;
    return;
  }
LAB_0084d284:
  puVar8[1] = puVar6;
  return;
}

