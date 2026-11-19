/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc006c
 */

ulong FUN_00bc006c(undefined8 *param_1,long param_2,undefined8 param_3,ulong *param_4,ulong *param_5
                  ,long param_6,long param_7,long param_8,ulong param_9)

{
  ulong uVar1;
  undefined8 *puVar2;
  void *__src;
  undefined8 *puVar3;
  undefined8 *__dest;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  undefined1 *puVar12;
  long lVar13;
  ulong uVar14;
  undefined1 *puVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  uVar7 = *param_4;
  uVar1 = param_4[1] + uVar7;
  if ((ulong)(param_2 - (long)param_1) < uVar1) {
    return 0xffffffffffffffba;
  }
  puVar6 = (undefined8 *)*param_5;
  if ((ulong)(param_6 - (long)puVar6) < uVar7) {
    return 0xffffffffffffffec;
  }
  uVar5 = param_4[2];
  uVar14 = (long)param_1 - (long)puVar6;
  puVar2 = (undefined8 *)((long)puVar6 + uVar7);
  if ((puVar6 < param_1) && (param_1 < puVar2)) {
    return 0xffffffffffffffba;
  }
  __dest = (undefined8 *)((long)param_1 + uVar7);
  if ((uVar7 < 8) || (-8 < (long)uVar14)) {
    if (uVar7 == 0) goto LAB_00bc02d0;
    puVar8 = (undefined1 *)(uVar7 + (long)param_1);
    if (puVar8 <= (undefined1 *)((long)param_1 + 1U)) {
      puVar8 = (undefined1 *)((long)param_1 + 1);
    }
    uVar7 = (long)puVar8 - (long)param_1;
    if ((7 < uVar7) && (0x1f < uVar14)) {
      if (uVar7 < 0x20) {
        uVar11 = 0;
      }
      else {
        uVar11 = uVar7 & 0xffffffffffffffe0;
        puVar9 = puVar6 + 2;
        puVar4 = param_1 + 2;
        uVar14 = uVar11;
        do {
          puVar10 = puVar9 + -1;
          uVar16 = puVar9[-2];
          uVar18 = puVar9[1];
          uVar17 = *puVar9;
          uVar14 = uVar14 - 0x20;
          puVar9 = puVar9 + 4;
          puVar4[-1] = *puVar10;
          puVar4[-2] = uVar16;
          puVar4[1] = uVar18;
          *puVar4 = uVar17;
          puVar4 = puVar4 + 4;
        } while (uVar14 != 0);
        if (uVar7 == uVar11) goto LAB_00bc02d0;
        if ((uVar7 & 0x18) == 0) {
          param_1 = (undefined8 *)((long)param_1 + uVar11);
          puVar6 = (undefined8 *)((long)puVar6 + uVar11);
          goto LAB_00bc02c0;
        }
      }
      uVar14 = uVar7 & 0xfffffffffffffff8;
      lVar13 = uVar11 - uVar14;
      puVar9 = (undefined8 *)((long)puVar6 + uVar11);
      puVar4 = (undefined8 *)((long)param_1 + uVar11);
      do {
        lVar13 = lVar13 + 8;
        *puVar4 = *puVar9;
        puVar9 = puVar9 + 1;
        puVar4 = puVar4 + 1;
      } while (lVar13 != 0);
      param_1 = (undefined8 *)((long)param_1 + uVar14);
      puVar6 = (undefined8 *)((long)puVar6 + uVar14);
      if (uVar7 == uVar14) goto LAB_00bc02d0;
    }
LAB_00bc02c0:
    do {
      puVar9 = (undefined8 *)((long)param_1 + 1);
      *(undefined1 *)param_1 = *(undefined1 *)puVar6;
      param_1 = puVar9;
      puVar6 = (undefined8 *)((long)puVar6 + 1);
    } while (puVar9 < __dest);
    goto LAB_00bc02d0;
  }
  puVar9 = __dest + -4;
  if ((puVar9 < param_1) || (0xffffffffffffffef < uVar14)) {
    puVar9 = param_1;
  }
  else {
    uVar16 = *puVar6;
    param_1[1] = puVar6[1];
    *param_1 = uVar16;
    if (0x10 < (ulong)((long)puVar9 - (long)param_1)) {
      puVar4 = param_1 + 2;
      puVar10 = puVar6;
      do {
        uVar16 = puVar10[2];
        puVar4[1] = puVar10[3];
        *puVar4 = uVar16;
        uVar16 = puVar10[4];
        puVar4[3] = puVar10[5];
        puVar4[2] = uVar16;
        puVar4 = puVar4 + 4;
        puVar10 = puVar10 + 4;
      } while (puVar4 < puVar9);
    }
    puVar6 = (undefined8 *)((long)puVar6 + ((long)puVar9 - (long)param_1));
  }
  puVar8 = (undefined1 *)((long)param_1 + (uVar7 - (long)puVar9));
  if ((puVar8 < (undefined1 *)0x8) || ((ulong)((long)puVar9 - (long)puVar6) < 0x20)) {
    puVar4 = puVar9;
  }
  else {
    if (puVar8 < (undefined1 *)0x20) {
      puVar12 = (undefined1 *)0x0;
    }
    else {
      puVar12 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffe0);
      puVar4 = puVar6 + 2;
      puVar10 = puVar9 + 2;
      puVar15 = puVar12;
      do {
        puVar3 = puVar4 + -1;
        uVar16 = puVar4[-2];
        uVar18 = puVar4[1];
        uVar17 = *puVar4;
        puVar15 = puVar15 + -0x20;
        puVar4 = puVar4 + 4;
        puVar10[-1] = *puVar3;
        puVar10[-2] = uVar16;
        puVar10[1] = uVar18;
        *puVar10 = uVar17;
        puVar10 = puVar10 + 4;
      } while (puVar15 != (undefined1 *)0x0);
      if (puVar8 == puVar12) goto LAB_00bc02d0;
      if (((ulong)puVar8 & 0x18) == 0) {
        puVar6 = (undefined8 *)((long)puVar6 + (long)puVar12);
        puVar4 = (undefined8 *)((long)puVar9 + (long)puVar12);
        goto LAB_00bc02a0;
      }
    }
    puVar15 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
    lVar13 = (long)puVar12 - (long)puVar15;
    puVar4 = (undefined8 *)((long)puVar9 + (long)puVar12);
    puVar10 = (undefined8 *)((long)puVar6 + (long)puVar12);
    do {
      lVar13 = lVar13 + 8;
      *puVar4 = *puVar10;
      puVar4 = puVar4 + 1;
      puVar10 = puVar10 + 1;
    } while (lVar13 != 0);
    puVar4 = (undefined8 *)((long)puVar9 + (long)puVar15);
    puVar6 = (undefined8 *)((long)puVar6 + (long)puVar15);
    if (puVar8 == puVar15) goto LAB_00bc02d0;
  }
LAB_00bc02a0:
  do {
    puVar10 = (undefined8 *)((long)puVar4 + 1);
    *(undefined1 *)puVar4 = *(undefined1 *)puVar6;
    puVar4 = puVar10;
    puVar6 = (undefined8 *)((long)puVar6 + 1);
  } while (puVar10 != (undefined8 *)((long)puVar9 + (long)puVar8));
LAB_00bc02d0:
  uVar7 = param_4[2];
  lVar13 = (long)__dest - uVar5;
  *param_5 = (ulong)puVar2;
  if ((ulong)((long)__dest - param_7) < uVar7) {
    if ((ulong)((long)__dest - param_8) < uVar7) {
      return 0xffffffffffffffec;
    }
    lVar13 = lVar13 - param_7;
    __src = (void *)(param_9 + lVar13);
    if ((long)__src + param_4[1] <= param_9) {
      memmove(__dest,__src,param_4[1]);
      return uVar1;
    }
    memmove(__dest,__src,-lVar13);
    __dest = (undefined8 *)((long)__dest - lVar13);
    uVar7 = param_4[1] + lVar13;
    param_4[1] = uVar7;
    lVar13 = param_7;
  }
  else {
    uVar7 = param_4[1];
  }
  FUN_00bbfc7c(__dest,param_3,lVar13,uVar7,1);
  return uVar1;
}

