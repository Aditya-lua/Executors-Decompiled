/* 7ff70c8ce5f0 FUN_7ff70c8ce5f0 */

longlong * FUN_7ff70c8ce5f0(longlong *param_1,longlong *param_2,undefined8 *param_3)

{
  longlong *plVar1;
  longlong lVar2;
  undefined8 uVar3;
  longlong lVar4;
  undefined8 *puVar5;
  code *pcVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong *plVar12;
  longlong *plVar13;
  longlong *plVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  
  lVar2 = *param_1;
  uVar17 = (param_1[1] - lVar2 >> 3) + 1;
  uVar10 = param_1[2] - lVar2 >> 3;
  uVar18 = (uVar10 >> 1) + uVar10;
  if (uVar18 <= uVar17) {
    uVar18 = uVar17;
  }
  if (0x1fffffffffffffff - (uVar10 >> 1) < uVar10) {
    uVar18 = 0x1fffffffffffffff;
  }
  if (uVar18 >> 0x3d != 0) {
LAB_7ff70c8ce9e8:
    FUN_7ff70ca007a0();
    goto LAB_7ff70c8ce9ed;
  }
  if (uVar18 == 0) {
    plVar14 = (longlong *)0x0;
  }
  else if (uVar18 < 0x200) {
    plVar14 = (longlong *)FUN_7ff70ca8ff40(uVar18 * 8);
  }
  else {
    if (0x1ffffffffffffffb < uVar18) goto LAB_7ff70c8ce9e8;
    lVar11 = FUN_7ff70ca8ff40(uVar18 * 8 + 0x27);
    plVar14 = (longlong *)(lVar11 + 0x27U & 0xffffffffffffffe0);
    plVar14[-1] = lVar11;
  }
  lVar11 = (longlong)param_2 - lVar2;
  plVar1 = (longlong *)((longlong)plVar14 + lVar11);
  uVar3 = *param_3;
  *param_3 = 0;
  *(undefined8 *)((longlong)plVar14 + lVar11) = uVar3;
  plVar12 = (longlong *)*param_1;
  plVar13 = (longlong *)param_1[1];
  if (param_2 == plVar13) {
    if (plVar12 != param_2) {
      uVar10 = (longlong)param_2 + (-8 - (longlong)plVar12);
      plVar13 = plVar14;
      if ((uVar10 < 0x98) ||
         ((plVar12 < (longlong *)((longlong)plVar14 + (uVar10 & 0xfffffffffffffff8) + 8) &&
          (plVar14 < (longlong *)((longlong)plVar12 + (uVar10 & 0xfffffffffffffff8) + 8))))) {
LAB_7ff70c8ce810:
        do {
          lVar2 = *plVar12;
          *plVar12 = 0;
          *plVar13 = lVar2;
          plVar12 = plVar12 + 1;
          plVar13 = plVar13 + 1;
        } while (plVar12 != param_2);
      }
      else {
        uVar10 = (uVar10 >> 3) + 1;
        uVar15 = uVar10 & 0xfffffffffffffffc;
        uVar16 = 0;
        do {
          lVar2 = plVar12[uVar16];
          lVar11 = (plVar12 + uVar16)[1];
          lVar4 = plVar12[uVar16 + 2];
          lVar7 = (plVar12 + uVar16 + 2)[1];
          plVar12[uVar16] = 0;
          (plVar12 + uVar16)[1] = 0;
          plVar12[uVar16 + 2] = 0;
          (plVar12 + uVar16 + 2)[1] = 0;
          plVar14[uVar16] = lVar2;
          (plVar14 + uVar16)[1] = lVar11;
          plVar14[uVar16 + 2] = lVar4;
          (plVar14 + uVar16 + 2)[1] = lVar7;
          uVar16 = uVar16 + 4;
        } while (uVar15 != uVar16);
        plVar12 = plVar12 + uVar15;
        plVar13 = plVar14 + uVar15;
        if (uVar10 != uVar15) goto LAB_7ff70c8ce810;
      }
      goto LAB_7ff70c8ce82a;
    }
  }
  else {
    if (plVar12 != param_2) {
      uVar10 = (longlong)param_2 + (-8 - (longlong)plVar12);
      plVar13 = plVar14;
      if ((uVar10 < 0x98) ||
         ((plVar12 < (longlong *)((longlong)plVar14 + (uVar10 & 0xfffffffffffffff8) + 8) &&
          (plVar14 < (longlong *)((longlong)plVar12 + (uVar10 & 0xfffffffffffffff8) + 8))))) {
LAB_7ff70c8ce720:
        do {
          lVar4 = *plVar12;
          *plVar12 = 0;
          *plVar13 = lVar4;
          plVar12 = plVar12 + 1;
          plVar13 = plVar13 + 1;
        } while (plVar12 != param_2);
      }
      else {
        uVar10 = (uVar10 >> 3) + 1;
        uVar15 = uVar10 & 0xfffffffffffffffc;
        uVar16 = 0;
        do {
          lVar4 = plVar12[uVar16];
          lVar7 = (plVar12 + uVar16)[1];
          lVar8 = plVar12[uVar16 + 2];
          lVar9 = (plVar12 + uVar16 + 2)[1];
          plVar12[uVar16] = 0;
          (plVar12 + uVar16)[1] = 0;
          plVar12[uVar16 + 2] = 0;
          (plVar12 + uVar16 + 2)[1] = 0;
          plVar14[uVar16] = lVar4;
          (plVar14 + uVar16)[1] = lVar7;
          plVar14[uVar16 + 2] = lVar8;
          (plVar14 + uVar16 + 2)[1] = lVar9;
          uVar16 = uVar16 + 4;
        } while (uVar15 != uVar16);
        plVar12 = plVar12 + uVar15;
        plVar13 = plVar14 + uVar15;
        if (uVar10 != uVar15) goto LAB_7ff70c8ce720;
      }
      plVar13 = (longlong *)param_1[1];
    }
    if (param_2 != plVar13) {
      uVar10 = (longlong)plVar13 + (-8 - (longlong)param_2);
      plVar12 = plVar1;
      if ((0x107 < uVar10) &&
         (((longlong *)
           ((longlong)plVar14 + (longlong)param_2 + ((uVar10 & 0xfffffffffffffff8) - lVar2) + 0x10)
           <= param_2 ||
          ((longlong)param_2 + (uVar10 & 0xfffffffffffffff8) + 8 <=
           (ulonglong)((longlong)plVar14 + lVar11 + 8))))) {
        uVar10 = (uVar10 >> 3) + 1;
        uVar15 = uVar10 & 0xfffffffffffffffc;
        uVar16 = 0;
        do {
          lVar2 = param_2[uVar16];
          lVar4 = (param_2 + uVar16)[1];
          lVar7 = param_2[uVar16 + 2];
          lVar8 = (param_2 + uVar16 + 2)[1];
          param_2[uVar16] = 0;
          (param_2 + uVar16)[1] = 0;
          param_2[uVar16 + 2] = 0;
          (param_2 + uVar16 + 2)[1] = 0;
          plVar12 = (longlong *)((longlong)plVar14 + uVar16 * 8 + lVar11 + 8);
          *plVar12 = lVar2;
          plVar12[1] = lVar4;
          plVar12 = (longlong *)((longlong)plVar14 + uVar16 * 8 + lVar11 + 0x18);
          *plVar12 = lVar7;
          plVar12[1] = lVar8;
          uVar16 = uVar16 + 4;
        } while (uVar15 != uVar16);
        param_2 = param_2 + uVar15;
        plVar12 = plVar1 + uVar15;
        if (uVar10 == uVar15) goto LAB_7ff70c8ce82a;
      }
      do {
        lVar2 = *param_2;
        *param_2 = 0;
        plVar12[1] = lVar2;
        param_2 = param_2 + 1;
        plVar12 = plVar12 + 1;
      } while (param_2 != plVar13);
    }
LAB_7ff70c8ce82a:
    plVar12 = (longlong *)*param_1;
  }
  if (plVar12 != (longlong *)0x0) {
    plVar13 = (longlong *)param_1[1];
    if (plVar12 == plVar13) {
      uVar10 = param_1[2] - (longlong)plVar12;
    }
    else {
      do {
        puVar5 = (undefined8 *)*plVar12;
        if (puVar5 != (undefined8 *)0x0) {
          (**(code **)*puVar5)(puVar5,1);
        }
        plVar12 = plVar12 + 1;
      } while (plVar12 != plVar13);
      plVar12 = (longlong *)*param_1;
      uVar10 = param_1[2] - (longlong)plVar12;
    }
    if (0xfff < uVar10) {
      if (0x1f < (ulonglong)((longlong)plVar12 + (-8 - plVar12[-1]))) {
LAB_7ff70c8ce9ed:
                    /* WARNING: Does not return */
        pcVar6 = (code *)invalidInstructionException();
        (*pcVar6)();
      }
      uVar10 = uVar10 + 0x27;
      plVar12 = (longlong *)plVar12[-1];
    }
    thunk_FUN_7ff70ca90250(plVar12,uVar10);
  }
  *param_1 = (longlong)plVar14;
  param_1[1] = (longlong)(plVar14 + uVar17);
  param_1[2] = (longlong)(plVar14 + uVar18);
  return plVar1;
}


