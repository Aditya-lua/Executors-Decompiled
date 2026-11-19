/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbfc7c
 */

void FUN_00bbfc7c(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,ulong param_4,
                 int param_5)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long lVar12;
  undefined1 *puVar13;
  undefined1 *puVar14;
  undefined8 *puVar15;
  undefined1 *puVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  uVar7 = (long)param_1 - (long)param_3;
  puVar1 = (undefined8 *)((long)param_1 + param_4);
  if (param_4 < 8) {
    if (param_4 == 0) {
      return;
    }
    puVar13 = (undefined1 *)(param_4 + (long)param_1);
    if (puVar13 <= (undefined1 *)((long)param_1 + 1U)) {
      puVar13 = (undefined1 *)((long)param_1 + 1);
    }
    uVar5 = (long)puVar13 - (long)param_1;
    if ((7 < uVar5) && (0x1f < uVar7)) {
      if (uVar5 < 0x20) {
        uVar10 = 0;
      }
      else {
        uVar10 = uVar5 & 0xffffffffffffffe0;
        puVar8 = param_1 + 2;
        puVar6 = param_3 + 2;
        uVar7 = uVar10;
        do {
          puVar9 = puVar6 + -1;
          uVar18 = puVar6[-2];
          uVar20 = puVar6[1];
          uVar19 = *puVar6;
          uVar7 = uVar7 - 0x20;
          puVar6 = puVar6 + 4;
          puVar8[-1] = *puVar9;
          puVar8[-2] = uVar18;
          puVar8[1] = uVar20;
          *puVar8 = uVar19;
          puVar8 = puVar8 + 4;
        } while (uVar7 != 0);
        if (uVar5 == uVar10) {
          return;
        }
        if ((uVar5 & 0x18) == 0) {
          param_3 = (undefined8 *)((long)param_3 + uVar10);
          param_1 = (undefined8 *)((long)param_1 + uVar10);
          goto LAB_00bc003c;
        }
      }
      uVar7 = uVar5 & 0xfffffffffffffff8;
      lVar12 = uVar10 - uVar7;
      puVar8 = (undefined8 *)((long)param_1 + uVar10);
      puVar6 = (undefined8 *)((long)param_3 + uVar10);
      do {
        lVar12 = lVar12 + 8;
        *puVar8 = *puVar6;
        puVar8 = puVar8 + 1;
        puVar6 = puVar6 + 1;
      } while (lVar12 != 0);
      param_3 = (undefined8 *)((long)param_3 + uVar7);
      param_1 = (undefined8 *)((long)param_1 + uVar7);
      if (uVar5 == uVar7) {
        return;
      }
    }
LAB_00bc003c:
    do {
      puVar8 = (undefined8 *)((long)param_1 + 1);
      *(undefined1 *)param_1 = *(undefined1 *)param_3;
      param_3 = (undefined8 *)((long)param_3 + 1);
      param_1 = puVar8;
    } while (puVar8 < puVar1);
    return;
  }
  uVar5 = param_4;
  puVar8 = param_1;
  if (param_5 != 0) {
    if (uVar7 < 8) {
      iVar3 = *(int *)(&DAT_00364d10 + uVar7 * 4);
      *(undefined1 *)param_1 = *(undefined1 *)param_3;
      *(undefined1 *)((long)param_1 + 1) = *(undefined1 *)((long)param_3 + 1);
      *(undefined1 *)((long)param_1 + 2) = *(undefined1 *)((long)param_3 + 2);
      *(undefined1 *)((long)param_1 + 3) = *(undefined1 *)((long)param_3 + 3);
      puVar2 = (undefined4 *)((long)param_3 + (ulong)*(uint *)(&DAT_00364e10 + uVar7 * 4));
      param_3 = (undefined8 *)((long)puVar2 - (long)iVar3);
      *(undefined4 *)((long)param_1 + 4) = *puVar2;
    }
    else {
      *param_1 = *param_3;
    }
    param_3 = param_3 + 1;
    uVar5 = param_4 - 8;
    puVar8 = param_1 + 1;
  }
  if (puVar1 <= param_2) {
    puVar1 = (undefined8 *)((long)puVar8 + uVar5);
    if ((param_5 == 0) || (0xf < (long)puVar8 - (long)param_3)) {
      uVar18 = *param_3;
      puVar8[1] = param_3[1];
      *puVar8 = uVar18;
      if (uVar5 < 0x11) {
        return;
      }
      puVar8 = puVar8 + 2;
      do {
        uVar18 = param_3[2];
        puVar8[1] = param_3[3];
        *puVar8 = uVar18;
        uVar18 = param_3[4];
        puVar8[3] = param_3[5];
        puVar8[2] = uVar18;
        puVar8 = puVar8 + 4;
        param_3 = param_3 + 4;
      } while (puVar8 < puVar1);
      return;
    }
    puVar6 = (undefined8 *)(uVar5 + (long)puVar8);
    if ((undefined8 *)(uVar5 + (long)puVar8) <= puVar8 + 1) {
      puVar6 = puVar8 + 1;
    }
    if (((undefined1 *)0x17 < (undefined1 *)((long)puVar6 + ~(ulong)puVar8)) &&
       (0x1f < (ulong)((long)puVar8 - (long)param_3))) {
      puVar9 = param_3 + 2;
      uVar7 = ((long)puVar6 + ~(ulong)puVar8 >> 3) + 1;
      uVar10 = uVar7 & 0x3ffffffffffffffc;
      puVar6 = puVar8 + 2;
      uVar5 = uVar10;
      do {
        puVar11 = puVar9 + -1;
        uVar18 = puVar9[-2];
        uVar20 = puVar9[1];
        uVar19 = *puVar9;
        uVar5 = uVar5 - 4;
        puVar9 = puVar9 + 4;
        puVar6[-1] = *puVar11;
        puVar6[-2] = uVar18;
        puVar6[1] = uVar20;
        *puVar6 = uVar19;
        puVar6 = puVar6 + 4;
      } while (uVar5 != 0);
      puVar8 = puVar8 + uVar10;
      param_3 = param_3 + uVar10;
      if (uVar7 == uVar10) {
        return;
      }
    }
    do {
      puVar6 = puVar8 + 1;
      *puVar8 = *param_3;
      puVar8 = puVar6;
      param_3 = param_3 + 1;
    } while (puVar6 < puVar1);
    return;
  }
  puVar6 = param_3;
  puVar9 = puVar8;
  if (puVar8 <= param_2) {
    if ((param_5 == 0) || (0xf < (long)puVar8 - (long)param_3)) {
      uVar18 = *param_3;
      puVar8[1] = param_3[1];
      *puVar8 = uVar18;
      if (0x10 < (ulong)((long)param_2 - (long)puVar8)) {
        puVar6 = puVar8 + 2;
        puVar9 = param_3;
        do {
          uVar18 = puVar9[2];
          puVar6[1] = puVar9[3];
          *puVar6 = uVar18;
          uVar18 = puVar9[4];
          puVar6[3] = puVar9[5];
          puVar6[2] = uVar18;
          puVar6 = puVar6 + 4;
          puVar9 = puVar9 + 4;
        } while (puVar6 < param_2);
      }
    }
    else {
      puVar6 = param_2;
      if (param_2 <= puVar8 + 1) {
        puVar6 = puVar8 + 1;
      }
      puVar11 = param_3;
      if (((undefined1 *)0x17 < (undefined1 *)((long)puVar6 + ~(ulong)puVar8)) &&
         (0x1f < (ulong)((long)puVar8 - (long)param_3))) {
        puVar9 = param_3 + 2;
        puVar11 = puVar8 + 2;
        uVar7 = ((long)puVar6 + ~(ulong)puVar8 >> 3) + 1;
        uVar10 = uVar7 & 0x3ffffffffffffffc;
        uVar5 = uVar10;
        do {
          puVar6 = puVar9 + -1;
          uVar18 = puVar9[-2];
          uVar20 = puVar9[1];
          uVar19 = *puVar9;
          uVar5 = uVar5 - 4;
          puVar9 = puVar9 + 4;
          puVar11[-1] = *puVar6;
          puVar11[-2] = uVar18;
          puVar11[1] = uVar20;
          *puVar11 = uVar19;
          puVar11 = puVar11 + 4;
        } while (uVar5 != 0);
        puVar9 = puVar8 + uVar10;
        puVar11 = param_3 + uVar10;
        if (uVar7 == uVar10) goto LAB_00bbff60;
      }
      do {
        puVar6 = puVar9 + 1;
        *puVar9 = *puVar11;
        puVar9 = puVar6;
        puVar11 = puVar11 + 1;
      } while (puVar6 < param_2);
    }
LAB_00bbff60:
    puVar6 = (undefined8 *)((long)param_3 + ((long)param_2 - (long)puVar8));
    puVar9 = param_2;
  }
  if (puVar1 <= puVar9) {
    return;
  }
  puVar11 = puVar8;
  if (puVar8 <= param_2) {
    puVar11 = param_2;
  }
  puVar13 = (undefined1 *)((long)param_1 + (param_4 - (long)puVar11));
  if ((undefined1 *)0x7 < puVar13) {
    if (0x1f < (ulong)((long)puVar8 - (long)param_3)) {
      if (puVar13 < (undefined1 *)0x20) {
        puVar14 = (undefined1 *)0x0;
      }
      else {
        puVar15 = puVar11 + 2;
        puVar14 = (undefined1 *)((ulong)puVar13 & 0xffffffffffffffe0);
        puVar17 = (undefined8 *)((long)param_3 + ((long)puVar15 - (long)puVar8));
        puVar16 = puVar14;
        do {
          puVar4 = puVar17 + -1;
          uVar18 = puVar17[-2];
          uVar20 = puVar17[1];
          uVar19 = *puVar17;
          puVar16 = puVar16 + -0x20;
          puVar17 = puVar17 + 4;
          puVar15[-1] = *puVar4;
          puVar15[-2] = uVar18;
          puVar15[1] = uVar20;
          *puVar15 = uVar19;
          puVar15 = puVar15 + 4;
        } while (puVar16 != (undefined1 *)0x0);
        if (puVar13 == puVar14) {
          return;
        }
        if (((ulong)puVar13 & 0x18) == 0) {
          puVar6 = (undefined8 *)((long)puVar6 + (long)puVar14);
          puVar9 = (undefined8 *)((long)puVar9 + (long)puVar14);
          goto LAB_00bc0058;
        }
      }
      puVar16 = (undefined1 *)((ulong)puVar13 & 0xfffffffffffffff8);
      lVar12 = (long)puVar14 - (long)puVar16;
      puVar8 = (undefined8 *)((long)param_3 + ((long)(puVar14 + (long)puVar11) - (long)puVar8));
      puVar11 = (undefined8 *)(puVar14 + (long)puVar11);
      do {
        lVar12 = lVar12 + 8;
        *puVar11 = *puVar8;
        puVar8 = puVar8 + 1;
        puVar11 = puVar11 + 1;
      } while (lVar12 != 0);
      puVar6 = (undefined8 *)((long)puVar6 + (long)puVar16);
      puVar9 = (undefined8 *)((long)puVar9 + (long)puVar16);
      if (puVar13 == puVar16) {
        return;
      }
    }
  }
LAB_00bc0058:
  do {
    puVar8 = (undefined8 *)((long)puVar9 + 1);
    *(undefined1 *)puVar9 = *(undefined1 *)puVar6;
    puVar6 = (undefined8 *)((long)puVar6 + 1);
    puVar9 = puVar8;
  } while (puVar8 < puVar1);
  return;
}

