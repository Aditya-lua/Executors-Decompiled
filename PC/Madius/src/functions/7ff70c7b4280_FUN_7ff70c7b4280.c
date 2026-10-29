/* 7ff70c7b4280 FUN_7ff70c7b4280 */

ulonglong * FUN_7ff70c7b4280(ulonglong *param_1,ulonglong *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  longlong lVar9;
  ulonglong uVar10;
  longlong lVar11;
  ulonglong *puVar12;
  ulonglong uVar13;
  longlong lVar14;
  ulonglong *puVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  ulonglong *puVar20;
  ulonglong uVar21;
  ulonglong *puVar22;
  
  puVar12 = (ulonglong *)param_1[1];
  if (puVar12 != (ulonglong *)param_1[2]) {
    puVar12[2] = 0;
    puVar12[3] = 0;
    *puVar12 = 0;
    puVar12[1] = 0;
    uVar18 = param_2[2];
    if (0xf < param_2[3]) {
      param_2 = (ulonglong *)*param_2;
    }
    if (-1 < (longlong)uVar18) {
      if (uVar18 < 0x10) {
        puVar12[2] = uVar18;
        puVar12[3] = 0xf;
        uVar18 = param_2[1];
        *puVar12 = *param_2;
        puVar12[1] = uVar18;
      }
      else {
        uVar10 = uVar18 | 0xf;
        uVar21 = 0x16;
        if (0x16 < uVar10) {
          uVar21 = uVar10;
        }
        if (uVar10 < 0xfff) {
          uVar10 = FUN_7ff70ca8ff40(uVar21 + 1);
        }
        else {
          lVar11 = FUN_7ff70ca8ff40(uVar21 + 0x28);
          uVar10 = lVar11 + 0x27U & 0xffffffffffffffe0;
          *(longlong *)(uVar10 - 8) = lVar11;
        }
        *puVar12 = uVar10;
        puVar12[2] = uVar18;
        puVar12[3] = uVar21;
        FUN_7ff70cb12b60(uVar10,param_2,uVar18 + 1);
      }
      puVar12 = (ulonglong *)param_1[1];
      param_1[1] = (ulonglong)(puVar12 + 4);
      return puVar12;
    }
    FUN_7ff70ca00780();
    pcVar3 = (code *)swi(3);
    puVar12 = (ulonglong *)(*pcVar3)();
    return puVar12;
  }
  uVar18 = *param_1;
  uVar19 = ((longlong)(param_1[1] - uVar18) >> 5) + 1;
  uVar10 = (longlong)(param_1[2] - uVar18) >> 5;
  uVar21 = (uVar10 >> 1) + uVar10;
  if (uVar21 <= uVar19) {
    uVar21 = uVar19;
  }
  if (0x7ffffffffffffff - (uVar10 >> 1) < uVar10) {
    uVar21 = 0x7ffffffffffffff;
  }
  if (uVar21 >> 0x3b != 0) {
LAB_7ff70c7b4733:
    FUN_7ff70ca007a0();
LAB_7ff70c7b4739:
    FUN_7ff70ca00780();
    pcVar3 = (code *)swi(3);
    puVar12 = (ulonglong *)(*pcVar3)();
    return puVar12;
  }
  if (uVar21 == 0) {
    uVar10 = 0;
  }
  else if (uVar21 < 0x80) {
    uVar10 = FUN_7ff70ca8ff40();
  }
  else {
    if (uVar21 == 0x7ffffffffffffff) goto LAB_7ff70c7b4733;
    lVar11 = FUN_7ff70ca8ff40();
    uVar10 = lVar11 + 0x27U & 0xffffffffffffffe0;
    *(longlong *)(uVar10 - 8) = lVar11;
  }
  lVar11 = uVar10 - uVar18;
  puVar1 = (undefined8 *)((longlong)puVar12 + ((uVar10 + 0x10) - uVar18));
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1 = (undefined8 *)((longlong)puVar12 + (uVar10 - uVar18));
  *puVar1 = 0;
  puVar1[1] = 0;
  uVar16 = param_2[2];
  if (0xf < param_2[3]) {
    param_2 = (ulonglong *)*param_2;
  }
  if ((longlong)uVar16 < 0) goto LAB_7ff70c7b4739;
  puVar22 = (ulonglong *)((longlong)puVar12 + (uVar10 - uVar18));
  if (uVar16 < 0x10) {
    puVar22[2] = uVar16;
    puVar22[3] = 0xf;
    uVar4 = *(undefined4 *)((longlong)param_2 + 4);
    uVar18 = param_2[1];
    uVar5 = *(undefined4 *)((longlong)param_2 + 0xc);
    *(int *)puVar22 = (int)*param_2;
    *(undefined4 *)((longlong)puVar22 + 4) = uVar4;
    *(int *)(puVar22 + 1) = (int)uVar18;
    *(undefined4 *)((longlong)puVar22 + 0xc) = uVar5;
  }
  else {
    uVar13 = uVar16 | 0xf;
    uVar18 = 0x16;
    if (0x16 < uVar13) {
      uVar18 = uVar13;
    }
    if (uVar13 < 0xfff) {
      uVar13 = FUN_7ff70ca8ff40(uVar18 + 1);
    }
    else {
      lVar14 = FUN_7ff70ca8ff40(uVar18 + 0x28);
      uVar13 = lVar14 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar13 - 8) = lVar14;
    }
    *puVar22 = uVar13;
    puVar22[2] = uVar16;
    puVar22[3] = uVar18;
    FUN_7ff70cb12b60(uVar13,param_2,uVar16 + 1);
  }
  puVar20 = (ulonglong *)*param_1;
  puVar15 = (ulonglong *)param_1[1];
  if (puVar12 == puVar15) {
    if (puVar20 == puVar12) goto LAB_7ff70c7b4639;
    lVar11 = 0;
    do {
      puVar1 = (undefined8 *)(uVar10 + 0x10 + lVar11);
      *puVar1 = 0;
      puVar1[1] = 0;
      *(undefined8 *)(uVar10 + lVar11) = 0;
      ((undefined8 *)(uVar10 + lVar11))[1] = 0;
      uVar6 = *(undefined8 *)((longlong)puVar20 + lVar11);
      uVar7 = ((undefined8 *)((longlong)puVar20 + lVar11))[1];
      puVar1 = (undefined8 *)((longlong)puVar20 + lVar11 + 0x10);
      uVar8 = puVar1[1];
      puVar2 = (undefined8 *)(uVar10 + 0x10 + lVar11);
      *puVar2 = *puVar1;
      puVar2[1] = uVar8;
      *(undefined8 *)(uVar10 + lVar11) = uVar6;
      ((undefined8 *)(uVar10 + lVar11))[1] = uVar7;
      *(undefined8 *)((longlong)puVar20 + lVar11 + 0x10) = 0;
      *(undefined8 *)((longlong)puVar20 + lVar11 + 0x18) = 0xf;
      *(undefined1 *)((longlong)puVar20 + lVar11) = 0;
      lVar14 = lVar11 + 0x20;
      lVar11 = lVar11 + 0x20;
    } while ((ulonglong *)((longlong)puVar20 + lVar14) != puVar12);
  }
  else {
    if (puVar20 != puVar12) {
      lVar14 = 0;
      do {
        puVar1 = (undefined8 *)(uVar10 + 0x10 + lVar14);
        *puVar1 = 0;
        puVar1[1] = 0;
        *(undefined8 *)(uVar10 + lVar14) = 0;
        ((undefined8 *)(uVar10 + lVar14))[1] = 0;
        uVar6 = *(undefined8 *)((longlong)puVar20 + lVar14);
        uVar7 = ((undefined8 *)((longlong)puVar20 + lVar14))[1];
        puVar1 = (undefined8 *)((longlong)puVar20 + lVar14 + 0x10);
        uVar8 = puVar1[1];
        puVar2 = (undefined8 *)(uVar10 + 0x10 + lVar14);
        *puVar2 = *puVar1;
        puVar2[1] = uVar8;
        *(undefined8 *)(uVar10 + lVar14) = uVar6;
        ((undefined8 *)(uVar10 + lVar14))[1] = uVar7;
        *(undefined8 *)((longlong)puVar20 + lVar14 + 0x10) = 0;
        *(undefined8 *)((longlong)puVar20 + lVar14 + 0x18) = 0xf;
        *(undefined1 *)((longlong)puVar20 + lVar14) = 0;
        lVar9 = lVar14 + 0x20;
        lVar14 = lVar14 + 0x20;
      } while ((ulonglong *)((longlong)puVar20 + lVar9) != puVar12);
      puVar15 = (ulonglong *)param_1[1];
    }
    if (puVar12 != puVar15) {
      lVar14 = 0;
      do {
        puVar1 = (undefined8 *)((longlong)puVar12 + lVar14 + lVar11 + 0x30);
        *puVar1 = 0;
        puVar1[1] = 0;
        puVar1 = (undefined8 *)((longlong)puVar12 + lVar14 + lVar11 + 0x20);
        *puVar1 = 0;
        puVar1[1] = 0;
        uVar6 = *(undefined8 *)((longlong)puVar12 + lVar14);
        uVar7 = ((undefined8 *)((longlong)puVar12 + lVar14))[1];
        puVar1 = (undefined8 *)((longlong)puVar12 + lVar14 + 0x10);
        uVar8 = puVar1[1];
        puVar2 = (undefined8 *)((longlong)puVar12 + lVar14 + lVar11 + 0x30);
        *puVar2 = *puVar1;
        puVar2[1] = uVar8;
        puVar1 = (undefined8 *)((longlong)puVar12 + lVar14 + lVar11 + 0x20);
        *puVar1 = uVar6;
        puVar1[1] = uVar7;
        *(undefined8 *)((longlong)puVar12 + lVar14 + 0x10) = 0;
        *(undefined8 *)((longlong)puVar12 + lVar14 + 0x18) = 0xf;
        *(undefined1 *)((longlong)puVar12 + lVar14) = 0;
        lVar9 = lVar14 + 0x20;
        lVar14 = lVar14 + 0x20;
      } while ((ulonglong *)((longlong)puVar12 + lVar9) != puVar15);
    }
  }
  puVar20 = (ulonglong *)*param_1;
LAB_7ff70c7b4639:
  if (puVar20 != (ulonglong *)0x0) {
    puVar12 = (ulonglong *)param_1[1];
    if (puVar20 == puVar12) {
      uVar18 = param_1[2] - (longlong)puVar20;
    }
    else {
      do {
        uVar18 = puVar20[3];
        if (0xf < uVar18) {
          uVar13 = *puVar20;
          uVar16 = uVar18 + 1;
          uVar17 = uVar13;
          if (0xfff < uVar16) {
            uVar17 = *(ulonglong *)(uVar13 - 8);
            if (0x1f < (uVar13 - 8) - uVar17) goto LAB_7ff70c7b4731;
            uVar16 = uVar18 + 0x28;
          }
          thunk_FUN_7ff70ca90250(uVar17,uVar16);
        }
        puVar20[2] = 0;
        puVar20[3] = 0xf;
        *(undefined1 *)puVar20 = 0;
        puVar20 = puVar20 + 4;
      } while (puVar20 != puVar12);
      puVar20 = (ulonglong *)*param_1;
      uVar18 = param_1[2] - (longlong)puVar20;
    }
    if (0xfff < uVar18) {
      if ((undefined1 *)0x1f < (undefined1 *)((longlong)puVar20 + (-8 - (longlong)puVar20[-1]))) {
LAB_7ff70c7b4731:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar18 = uVar18 + 0x27;
      puVar20 = (ulonglong *)puVar20[-1];
    }
    thunk_FUN_7ff70ca90250(puVar20,uVar18);
  }
  *param_1 = uVar10;
  param_1[1] = uVar19 * 0x20 + uVar10;
  param_1[2] = uVar21 * 0x20 + uVar10;
  return puVar22;
}


