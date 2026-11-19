/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00865548
 */

void FUN_00865548(long *param_1,long param_2,long *param_3)

{
  ulong uVar1;
  byte bVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined4 uVar5;
  long lVar6;
  ulong uVar7;
  undefined1 uVar8;
  ulong uVar9;
  undefined1 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined1 *puVar14;
  long lVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  uVar16 = *(undefined8 *)(param_2 + 0xa8);
  uVar5 = FUN_008521f4(param_2 + 0x90);
  FUN_00802564(param_2 + 0x498,uVar16,uVar5);
  if (param_3 != (long *)0x0) {
    bVar2 = *(byte *)(param_2 + 0x498);
    uVar9 = *(ulong *)(param_2 + 0x4a0);
    uVar11 = (ulong)(bVar2 >> 1);
    uVar7 = uVar11;
    lVar4 = param_2 + 0x499;
    if ((bVar2 & 1) != 0) {
      uVar7 = uVar9;
      lVar4 = *(long *)(param_2 + 0x4a8);
    }
    uVar1 = uVar7 + 1;
    if (uVar7 == 0xffffffffffffffff) {
      lVar6 = 0;
    }
    else {
      lVar6 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar1);
      uVar11 = 0;
      if ((uVar1 < 8) || ((ulong)(lVar6 - lVar4) < 0x20)) {
LAB_00865650:
        lVar15 = (uVar7 - uVar11) + 1;
        puVar10 = (undefined1 *)(lVar6 + uVar11);
        puVar14 = (undefined1 *)(lVar4 + uVar11);
        do {
          lVar15 = lVar15 + -1;
          *puVar10 = *puVar14;
          puVar10 = puVar10 + 1;
          puVar14 = puVar14 + 1;
        } while (lVar15 != 0);
      }
      else if (uVar1 < 0x20) {
        uVar9 = 0;
LAB_00865624:
        uVar11 = uVar1 & 0xfffffffffffffff8;
        lVar15 = uVar9 - uVar11;
        puVar12 = (undefined8 *)(lVar6 + uVar9);
        puVar13 = (undefined8 *)(lVar4 + uVar9);
        do {
          lVar15 = lVar15 + 8;
          *puVar12 = *puVar13;
          puVar12 = puVar12 + 1;
          puVar13 = puVar13 + 1;
        } while (lVar15 != 0);
        if (uVar1 != uVar11) goto LAB_00865650;
      }
      else {
        uVar11 = uVar1 & 0xffffffffffffffe0;
        puVar12 = (undefined8 *)(lVar6 + 0x10);
        puVar13 = (undefined8 *)(lVar4 + 0x10);
        uVar9 = uVar11;
        do {
          puVar3 = puVar13 + -1;
          uVar16 = puVar13[-2];
          uVar18 = puVar13[1];
          uVar17 = *puVar13;
          uVar9 = uVar9 - 0x20;
          puVar13 = puVar13 + 4;
          puVar12[-1] = *puVar3;
          puVar12[-2] = uVar16;
          puVar12[1] = uVar18;
          *puVar12 = uVar17;
          puVar12 = puVar12 + 4;
        } while (uVar9 != 0);
        if (uVar1 != uVar11) {
          uVar9 = uVar11;
          if ((uVar1 & 0x18) == 0) goto LAB_00865650;
          goto LAB_00865624;
        }
      }
      bVar2 = *(byte *)(param_2 + 0x498);
      uVar9 = *(ulong *)(param_2 + 0x4a0);
      uVar11 = (ulong)(bVar2 >> 1);
    }
    if ((bVar2 & 1) != 0) {
      uVar11 = uVar9;
    }
    *param_3 = lVar6;
    param_3[1] = uVar11;
  }
  if ((*(int *)(param_2 + 0x90) == 0x117) || (*(int *)(param_2 + 0x90) == 0x10d)) {
    uVar7 = FUN_00854cb0(param_2 + 0x498);
    if ((uVar7 & 1) == 0) {
      FUN_00858f2c(param_2);
      uVar8 = 0;
      *(undefined1 *)param_1 = 0;
      goto LAB_008657dc;
    }
  }
  else {
    FUN_0085523c(param_2 + 0x498);
  }
  bVar2 = *(byte *)(param_2 + 0x498);
  uVar9 = *(ulong *)(param_2 + 0x4a0);
  uVar11 = (ulong)(bVar2 >> 1);
  uVar7 = uVar11;
  lVar4 = param_2 + 0x499;
  if ((bVar2 & 1) != 0) {
    uVar7 = uVar9;
    lVar4 = *(long *)(param_2 + 0x4a8);
  }
  uVar1 = uVar7 + 1;
  if (uVar7 == 0xffffffffffffffff) {
    lVar6 = 0;
  }
  else {
    lVar6 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar1);
    uVar11 = 0;
    if ((uVar1 < 8) || ((ulong)(lVar6 - lVar4) < 0x20)) {
LAB_00865794:
      lVar15 = (uVar7 - uVar11) + 1;
      puVar10 = (undefined1 *)(lVar6 + uVar11);
      puVar14 = (undefined1 *)(lVar4 + uVar11);
      do {
        lVar15 = lVar15 + -1;
        *puVar10 = *puVar14;
        puVar10 = puVar10 + 1;
        puVar14 = puVar14 + 1;
      } while (lVar15 != 0);
    }
    else if (uVar1 < 0x20) {
      uVar9 = 0;
LAB_00865768:
      uVar11 = uVar1 & 0xfffffffffffffff8;
      lVar15 = uVar9 - uVar11;
      puVar12 = (undefined8 *)(lVar6 + uVar9);
      puVar13 = (undefined8 *)(lVar4 + uVar9);
      do {
        lVar15 = lVar15 + 8;
        *puVar12 = *puVar13;
        puVar12 = puVar12 + 1;
        puVar13 = puVar13 + 1;
      } while (lVar15 != 0);
      if (uVar1 != uVar11) goto LAB_00865794;
    }
    else {
      uVar11 = uVar1 & 0xffffffffffffffe0;
      puVar12 = (undefined8 *)(lVar6 + 0x10);
      puVar13 = (undefined8 *)(lVar4 + 0x10);
      uVar9 = uVar11;
      do {
        puVar3 = puVar13 + -1;
        uVar16 = puVar13[-2];
        uVar18 = puVar13[1];
        uVar17 = *puVar13;
        uVar9 = uVar9 - 0x20;
        puVar13 = puVar13 + 4;
        puVar12[-1] = *puVar3;
        puVar12[-2] = uVar16;
        puVar12[1] = uVar18;
        *puVar12 = uVar17;
        puVar12 = puVar12 + 4;
      } while (uVar9 != 0);
      if (uVar1 != uVar11) {
        uVar9 = uVar11;
        if ((uVar1 & 0x18) == 0) goto LAB_00865794;
        goto LAB_00865768;
      }
    }
    bVar2 = *(byte *)(param_2 + 0x498);
    uVar9 = *(ulong *)(param_2 + 0x4a0);
    uVar11 = (ulong)(bVar2 >> 1);
  }
  if ((bVar2 & 1) != 0) {
    uVar11 = uVar9;
  }
  FUN_00858f2c(param_2);
  uVar8 = 1;
  *param_1 = lVar6;
  param_1[1] = uVar11;
LAB_008657dc:
  *(undefined1 *)(param_1 + 2) = uVar8;
  return;
}

