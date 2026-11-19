/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbf92c
 */

ulong FUN_00bbf92c(undefined8 *param_1,long param_2,ulong *param_3,long *param_4,long param_5,
                  long param_6,long param_7,ulong param_8)

{
  ulong uVar1;
  undefined1 *puVar2;
  void *__src;
  undefined8 *puVar3;
  undefined8 *__dest;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined1 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined1 *puVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined1 *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  
  uVar10 = *param_3;
  uVar1 = param_3[1] + uVar10;
  if ((ulong)(param_2 - (long)param_1) < uVar1) {
    return 0xffffffffffffffba;
  }
  puVar8 = (undefined8 *)*param_4;
  if ((ulong)(param_5 - (long)puVar8) < uVar10) {
    return 0xffffffffffffffec;
  }
  uVar7 = param_3[2];
  __dest = (undefined8 *)((long)param_1 + uVar10);
  puVar2 = (undefined1 *)((long)puVar8 + uVar10);
  puVar4 = (undefined8 *)(param_2 + -0x20);
  if (7 < uVar10) {
    if (__dest <= puVar4) {
      uVar19 = *puVar8;
      param_1[1] = puVar8[1];
      *param_1 = uVar19;
      if (0x10 < uVar10) {
        param_1 = param_1 + 2;
        do {
          uVar19 = puVar8[2];
          param_1[1] = puVar8[3];
          *param_1 = uVar19;
          uVar19 = puVar8[4];
          param_1[3] = puVar8[5];
          param_1[2] = uVar19;
          param_1 = param_1 + 4;
          puVar8 = puVar8 + 4;
        } while (param_1 < __dest);
      }
      goto LAB_00bbfbbc;
    }
    if (puVar4 < param_1) {
      puVar12 = puVar8;
      puVar9 = param_1;
    }
    else {
      uVar19 = *puVar8;
      param_1[1] = puVar8[1];
      *param_1 = uVar19;
      if (0x10 < (ulong)((long)puVar4 - (long)param_1)) {
        puVar12 = param_1 + 2;
        puVar9 = puVar8;
        do {
          uVar19 = puVar9[2];
          puVar12[1] = puVar9[3];
          *puVar12 = uVar19;
          uVar19 = puVar9[4];
          puVar12[3] = puVar9[5];
          puVar12[2] = uVar19;
          puVar12 = puVar12 + 4;
          puVar9 = puVar9 + 4;
        } while (puVar12 < puVar4);
      }
      puVar12 = (undefined8 *)((long)puVar8 + ((long)puVar4 - (long)param_1));
      puVar9 = puVar4;
    }
    if (__dest <= puVar9) goto LAB_00bbfbbc;
    puVar15 = param_1;
    if (param_1 <= puVar4) {
      puVar15 = puVar4;
    }
    puVar11 = (undefined1 *)((long)param_1 + (uVar10 - (long)puVar15));
    if ((undefined1 *)0x7 < puVar11) {
      if (0x1f < (ulong)((long)param_1 - (long)puVar8)) {
        if (puVar11 < (undefined1 *)0x20) {
          puVar16 = (undefined1 *)0x0;
        }
        else {
          puVar5 = puVar15 + 2;
          puVar16 = (undefined1 *)((ulong)puVar11 & 0xffffffffffffffe0);
          puVar18 = (undefined8 *)((long)puVar8 + ((long)puVar5 - (long)param_1));
          puVar6 = puVar16;
          do {
            puVar3 = puVar18 + -1;
            uVar19 = puVar18[-2];
            uVar21 = puVar18[1];
            uVar20 = *puVar18;
            puVar6 = puVar6 + -0x20;
            puVar18 = puVar18 + 4;
            puVar5[-1] = *puVar3;
            puVar5[-2] = uVar19;
            puVar5[1] = uVar21;
            *puVar5 = uVar20;
            puVar5 = puVar5 + 4;
          } while (puVar6 != (undefined1 *)0x0);
          if (puVar11 == puVar16) goto LAB_00bbfbbc;
          if (((ulong)puVar11 & 0x18) == 0) {
            puVar12 = (undefined8 *)((long)puVar12 + (long)puVar16);
            puVar9 = (undefined8 *)((long)puVar9 + (long)puVar16);
            goto LAB_00bbfbac;
          }
        }
        puVar6 = (undefined1 *)((ulong)puVar11 & 0xfffffffffffffff8);
        lVar14 = (long)puVar16 - (long)puVar6;
        puVar8 = (undefined8 *)((long)puVar8 + ((long)(puVar16 + (long)puVar15) - (long)param_1));
        puVar15 = (undefined8 *)(puVar16 + (long)puVar15);
        do {
          lVar14 = lVar14 + 8;
          *puVar15 = *puVar8;
          puVar8 = puVar8 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar14 != 0);
        puVar12 = (undefined8 *)((long)puVar12 + (long)puVar6);
        puVar9 = (undefined8 *)((long)puVar9 + (long)puVar6);
        if (puVar11 == puVar6) goto LAB_00bbfbbc;
      }
    }
LAB_00bbfbac:
    do {
      puVar8 = (undefined8 *)((long)puVar9 + 1);
      *(undefined1 *)puVar9 = *(undefined1 *)puVar12;
      puVar12 = (undefined8 *)((long)puVar12 + 1);
      puVar9 = puVar8;
    } while (puVar8 < __dest);
    goto LAB_00bbfbbc;
  }
  if (uVar10 == 0) goto LAB_00bbfbbc;
  puVar11 = (undefined1 *)(uVar10 + (long)param_1);
  if (puVar11 <= (undefined1 *)((long)param_1 + 1U)) {
    puVar11 = (undefined1 *)((long)param_1 + 1);
  }
  uVar10 = (long)puVar11 - (long)param_1;
  if ((7 < uVar10) && (0x1f < (ulong)((long)param_1 - (long)puVar8))) {
    if (uVar10 < 0x20) {
      uVar13 = 0;
    }
    else {
      uVar13 = uVar10 & 0xffffffffffffffe0;
      puVar12 = param_1 + 2;
      puVar9 = puVar8 + 2;
      uVar17 = uVar13;
      do {
        puVar15 = puVar9 + -1;
        uVar19 = puVar9[-2];
        uVar21 = puVar9[1];
        uVar20 = *puVar9;
        uVar17 = uVar17 - 0x20;
        puVar9 = puVar9 + 4;
        puVar12[-1] = *puVar15;
        puVar12[-2] = uVar19;
        puVar12[1] = uVar21;
        *puVar12 = uVar20;
        puVar12 = puVar12 + 4;
      } while (uVar17 != 0);
      if (uVar10 == uVar13) goto LAB_00bbfbbc;
      if ((uVar10 & 0x18) == 0) {
        puVar8 = (undefined8 *)((long)puVar8 + uVar13);
        param_1 = (undefined8 *)((long)param_1 + uVar13);
        goto LAB_00bbfb90;
      }
    }
    uVar17 = uVar10 & 0xfffffffffffffff8;
    lVar14 = uVar13 - uVar17;
    puVar12 = (undefined8 *)((long)param_1 + uVar13);
    puVar9 = (undefined8 *)((long)puVar8 + uVar13);
    do {
      lVar14 = lVar14 + 8;
      *puVar12 = *puVar9;
      puVar12 = puVar12 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar14 != 0);
    puVar8 = (undefined8 *)((long)puVar8 + uVar17);
    param_1 = (undefined8 *)((long)param_1 + uVar17);
    if (uVar10 == uVar17) goto LAB_00bbfbbc;
  }
LAB_00bbfb90:
  do {
    puVar12 = (undefined8 *)((long)param_1 + 1);
    *(undefined1 *)param_1 = *(undefined1 *)puVar8;
    puVar8 = (undefined8 *)((long)puVar8 + 1);
    param_1 = puVar12;
  } while (puVar12 < __dest);
LAB_00bbfbbc:
  uVar10 = param_3[2];
  *param_4 = (long)puVar2;
  lVar14 = (long)__dest - uVar7;
  if ((ulong)((long)__dest - param_6) < uVar10) {
    if ((ulong)((long)__dest - param_7) < uVar10) {
      return 0xffffffffffffffec;
    }
    lVar14 = lVar14 - param_6;
    __src = (void *)(param_8 + lVar14);
    if ((long)__src + param_3[1] <= param_8) {
      memmove(__dest,__src,param_3[1]);
      return uVar1;
    }
    memmove(__dest,__src,-lVar14);
    __dest = (undefined8 *)((long)__dest - lVar14);
    uVar10 = param_3[1] + lVar14;
    param_3[1] = uVar10;
    lVar14 = param_6;
  }
  else {
    uVar10 = param_3[1];
  }
  FUN_00bbfc7c(__dest,puVar4,lVar14,uVar10,1);
  return uVar1;
}

