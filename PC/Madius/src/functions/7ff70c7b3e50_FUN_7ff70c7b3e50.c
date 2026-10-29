/* 7ff70c7b3e50 FUN_7ff70c7b3e50 */

undefined8 * FUN_7ff70c7b3e50(ulonglong *param_1,longlong *param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong lVar10;
  longlong *plVar11;
  ulonglong uVar12;
  undefined8 *puVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  longlong *plVar16;
  ulonglong uVar17;
  undefined8 *puVar18;
  
  uVar15 = *param_1;
  uVar14 = ((longlong)(param_1[1] - uVar15) >> 5) + 1;
  uVar12 = (longlong)(param_1[2] - uVar15) >> 5;
  uVar17 = (uVar12 >> 1) + uVar12;
  if (uVar17 <= uVar14) {
    uVar17 = uVar14;
  }
  if (0x7ffffffffffffff - (uVar12 >> 1) < uVar12) {
    uVar17 = 0x7ffffffffffffff;
  }
  if (uVar17 >> 0x3b != 0) {
LAB_7ff70c7b4205:
    FUN_7ff70ca007a0();
LAB_7ff70c7b420b:
    FUN_7ff70ca00780();
    pcVar2 = (code *)swi(3);
    puVar18 = (undefined8 *)(*pcVar2)();
    return puVar18;
  }
  if (uVar17 == 0) {
    uVar12 = 0;
  }
  else if (uVar17 < 0x80) {
    uVar12 = FUN_7ff70ca8ff40();
  }
  else {
    if (uVar17 == 0x7ffffffffffffff) goto LAB_7ff70c7b4205;
    lVar7 = FUN_7ff70ca8ff40(uVar17 * 0x20 + 0x27);
    uVar12 = lVar7 + 0x27U & 0xffffffffffffffe0;
    *(longlong *)(uVar12 - 8) = lVar7;
  }
  lVar7 = uVar12 - uVar15;
  puVar18 = (undefined8 *)((longlong)param_2 + ((uVar12 + 0x10) - uVar15));
  *puVar18 = 0;
  puVar18[1] = 0;
  puVar18 = (undefined8 *)((longlong)param_2 + (uVar12 - uVar15));
  *puVar18 = 0;
  puVar18[1] = 0;
  uVar8 = FUN_7ff70cb12e80(param_3);
  if ((longlong)uVar8 < 0) goto LAB_7ff70c7b420b;
  puVar13 = (undefined8 *)((longlong)param_2 + (uVar12 - uVar15));
  uVar15 = 0xf;
  puVar18 = puVar13;
  if (0xf < uVar8) {
    uVar9 = uVar8 | 0xf;
    uVar15 = 0x16;
    if (0x16 < uVar9) {
      uVar15 = uVar9;
    }
    if (uVar9 < 0xfff) {
      puVar18 = (undefined8 *)FUN_7ff70ca8ff40(uVar15 + 1);
    }
    else {
      lVar10 = FUN_7ff70ca8ff40(uVar15 + 0x28);
      puVar18 = (undefined8 *)(lVar10 + 0x27U & 0xffffffffffffffe0);
      puVar18[-1] = lVar10;
    }
    *puVar13 = puVar18;
  }
  puVar13[2] = uVar8;
  puVar13[3] = uVar15;
  FUN_7ff70cb12b60(puVar18,param_3,uVar8);
  *(undefined1 *)((longlong)puVar18 + uVar8) = 0;
  plVar16 = (longlong *)*param_1;
  plVar11 = (longlong *)param_1[1];
  if (param_2 == plVar11) {
    if (plVar16 == param_2) goto LAB_7ff70c7b4108;
    lVar7 = 0;
    do {
      puVar18 = (undefined8 *)(uVar12 + 0x10 + lVar7);
      *puVar18 = 0;
      puVar18[1] = 0;
      *(undefined8 *)(uVar12 + lVar7) = 0;
      ((undefined8 *)(uVar12 + lVar7))[1] = 0;
      uVar3 = *(undefined8 *)((longlong)plVar16 + lVar7);
      uVar4 = ((undefined8 *)((longlong)plVar16 + lVar7))[1];
      puVar18 = (undefined8 *)((longlong)plVar16 + lVar7 + 0x10);
      uVar5 = puVar18[1];
      puVar1 = (undefined8 *)(uVar12 + 0x10 + lVar7);
      *puVar1 = *puVar18;
      puVar1[1] = uVar5;
      *(undefined8 *)(uVar12 + lVar7) = uVar3;
      ((undefined8 *)(uVar12 + lVar7))[1] = uVar4;
      *(undefined8 *)((longlong)plVar16 + lVar7 + 0x10) = 0;
      *(undefined8 *)((longlong)plVar16 + lVar7 + 0x18) = 0xf;
      *(undefined1 *)((longlong)plVar16 + lVar7) = 0;
      lVar10 = lVar7 + 0x20;
      lVar7 = lVar7 + 0x20;
    } while ((longlong *)((longlong)plVar16 + lVar10) != param_2);
  }
  else {
    if (plVar16 != param_2) {
      lVar10 = 0;
      do {
        puVar18 = (undefined8 *)(uVar12 + 0x10 + lVar10);
        *puVar18 = 0;
        puVar18[1] = 0;
        *(undefined8 *)(uVar12 + lVar10) = 0;
        ((undefined8 *)(uVar12 + lVar10))[1] = 0;
        uVar3 = *(undefined8 *)((longlong)plVar16 + lVar10);
        uVar4 = ((undefined8 *)((longlong)plVar16 + lVar10))[1];
        puVar18 = (undefined8 *)((longlong)plVar16 + lVar10 + 0x10);
        uVar5 = puVar18[1];
        puVar1 = (undefined8 *)(uVar12 + 0x10 + lVar10);
        *puVar1 = *puVar18;
        puVar1[1] = uVar5;
        *(undefined8 *)(uVar12 + lVar10) = uVar3;
        ((undefined8 *)(uVar12 + lVar10))[1] = uVar4;
        *(undefined8 *)((longlong)plVar16 + lVar10 + 0x10) = 0;
        *(undefined8 *)((longlong)plVar16 + lVar10 + 0x18) = 0xf;
        *(undefined1 *)((longlong)plVar16 + lVar10) = 0;
        lVar6 = lVar10 + 0x20;
        lVar10 = lVar10 + 0x20;
      } while ((longlong *)((longlong)plVar16 + lVar6) != param_2);
      plVar11 = (longlong *)param_1[1];
    }
    if (param_2 != plVar11) {
      lVar10 = 0;
      do {
        puVar18 = (undefined8 *)((longlong)param_2 + lVar10 + lVar7 + 0x30);
        *puVar18 = 0;
        puVar18[1] = 0;
        puVar18 = (undefined8 *)((longlong)param_2 + lVar10 + lVar7 + 0x20);
        *puVar18 = 0;
        puVar18[1] = 0;
        uVar3 = *(undefined8 *)((longlong)param_2 + lVar10);
        uVar4 = ((undefined8 *)((longlong)param_2 + lVar10))[1];
        puVar18 = (undefined8 *)((longlong)param_2 + lVar10 + 0x10);
        uVar5 = puVar18[1];
        puVar1 = (undefined8 *)((longlong)param_2 + lVar10 + lVar7 + 0x30);
        *puVar1 = *puVar18;
        puVar1[1] = uVar5;
        puVar18 = (undefined8 *)((longlong)param_2 + lVar10 + lVar7 + 0x20);
        *puVar18 = uVar3;
        puVar18[1] = uVar4;
        *(undefined8 *)((longlong)param_2 + lVar10 + 0x10) = 0;
        *(undefined8 *)((longlong)param_2 + lVar10 + 0x18) = 0xf;
        *(undefined1 *)((longlong)param_2 + lVar10) = 0;
        lVar6 = lVar10 + 0x20;
        lVar10 = lVar10 + 0x20;
      } while ((longlong *)((longlong)param_2 + lVar6) != plVar11);
    }
  }
  plVar16 = (longlong *)*param_1;
LAB_7ff70c7b4108:
  if (plVar16 != (longlong *)0x0) {
    plVar11 = (longlong *)param_1[1];
    if (plVar16 == plVar11) {
      uVar15 = param_1[2] - (longlong)plVar16;
    }
    else {
      do {
        uVar15 = plVar16[3];
        if (0xf < uVar15) {
          lVar7 = *plVar16;
          uVar8 = uVar15 + 1;
          lVar10 = lVar7;
          if (0xfff < uVar8) {
            lVar10 = *(longlong *)(lVar7 + -8);
            if (0x1f < (ulonglong)((lVar7 + -8) - lVar10)) goto LAB_7ff70c7b4203;
            uVar8 = uVar15 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar10,uVar8);
        }
        plVar16[2] = 0;
        plVar16[3] = 0xf;
        *(undefined1 *)plVar16 = 0;
        plVar16 = plVar16 + 4;
      } while (plVar16 != plVar11);
      plVar16 = (longlong *)*param_1;
      uVar15 = param_1[2] - (longlong)plVar16;
    }
    if (0xfff < uVar15) {
      if ((undefined1 *)0x1f < (undefined1 *)((longlong)plVar16 + (-8 - plVar16[-1]))) {
LAB_7ff70c7b4203:
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar15 = uVar15 + 0x27;
      plVar16 = (longlong *)plVar16[-1];
    }
    thunk_FUN_7ff70ca90250(plVar16,uVar15);
  }
  *param_1 = uVar12;
  param_1[1] = uVar14 * 0x20 + uVar12;
  param_1[2] = uVar17 * 0x20 + uVar12;
  return puVar13;
}


