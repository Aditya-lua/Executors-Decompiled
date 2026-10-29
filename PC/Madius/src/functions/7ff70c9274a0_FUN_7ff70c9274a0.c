/* 7ff70c9274a0 FUN_7ff70c9274a0 */

longlong * FUN_7ff70c9274a0(longlong *param_1,longlong *param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 *puVar10;
  int iVar11;
  longlong *plVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  longlong lVar15;
  longlong lVar16;
  longlong *plVar17;
  longlong *plVar18;
  longlong lVar19;
  longlong *plVar20;
  undefined4 *puVar21;
  longlong lVar22;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  
  if ((param_1 != param_2) && (param_1 + 4 != param_2)) {
    lVar22 = 0x20;
    plVar17 = param_1 + 4;
    plVar20 = param_1;
    do {
      plVar12 = plVar17;
      uStack_68 = (undefined4)*plVar12;
      uStack_64 = *(undefined4 *)((longlong)plVar12 + 4);
      puVar10 = (undefined4 *)*plVar12;
      uStack_60 = (undefined4)plVar12[1];
      uStack_5c = *(undefined4 *)((longlong)plVar12 + 0xc);
      uStack_58 = (undefined4)plVar12[2];
      uStack_54 = *(undefined4 *)((longlong)plVar12 + 0x14);
      uVar1 = plVar12[2];
      uStack_50 = (undefined4)plVar12[3];
      uStack_4c = *(undefined4 *)((longlong)plVar12 + 0x1c);
      uVar13 = plVar12[3];
      plVar20[6] = 0;
      plVar20[7] = 0xf;
      *(undefined1 *)(plVar20 + 4) = 0;
      plVar17 = param_1;
      if (0xf < (ulonglong)param_1[3]) {
        plVar17 = (longlong *)*param_1;
      }
      puVar21 = &uStack_68;
      if (0xf < uVar13) {
        puVar21 = puVar10;
      }
      lVar19 = lVar22;
      if (((ulonglong)param_1[2] < uVar1) ||
         ((plVar20 = plVar12, uVar1 == param_1[2] &&
          (iVar11 = FUN_7ff70cb12b50(puVar21,plVar17), iVar11 < 0)))) {
        do {
          plVar17 = (longlong *)((longlong)param_1 + lVar19);
          uVar1 = *(ulonglong *)((longlong)param_1 + lVar19 + 0x18);
          if (0xf < uVar1) {
            lVar16 = *plVar17;
            uVar13 = uVar1 + 1;
            lVar15 = lVar16;
            if (0xfff < uVar13) {
              lVar15 = *(longlong *)(lVar16 + -8);
              if (0x1f < (ulonglong)((lVar16 + -8) - lVar15)) goto LAB_7ff70c927778;
              uVar13 = uVar1 + 0x28;
            }
            thunk_FUN_7ff70ca90250(lVar15,uVar13);
          }
          *(undefined8 *)((longlong)param_1 + lVar19 + 0x10) = 0;
          *(undefined8 *)((longlong)param_1 + lVar19 + 0x18) = 0xf;
          *(undefined1 *)((longlong)param_1 + lVar19) = 0;
          uVar3 = *(undefined4 *)((longlong)param_1 + lVar19 + -0x20);
          uVar4 = *(undefined4 *)((longlong)param_1 + lVar19 + -0x1c);
          uVar5 = *(undefined4 *)((longlong)param_1 + lVar19 + -0x18);
          uVar6 = *(undefined4 *)((longlong)param_1 + lVar19 + -0x14);
          uVar7 = *(undefined4 *)((longlong)param_1 + lVar19 + -0xc);
          uVar8 = *(undefined4 *)((longlong)param_1 + lVar19 + -8);
          uVar9 = *(undefined4 *)((longlong)param_1 + lVar19 + -4);
          *(undefined4 *)(plVar17 + 2) = *(undefined4 *)((longlong)param_1 + lVar19 + -0x10);
          *(undefined4 *)((longlong)plVar17 + 0x14) = uVar7;
          *(undefined4 *)(plVar17 + 3) = uVar8;
          *(undefined4 *)((longlong)plVar17 + 0x1c) = uVar9;
          *(undefined4 *)plVar17 = uVar3;
          *(undefined4 *)((longlong)plVar17 + 4) = uVar4;
          *(undefined4 *)(plVar17 + 1) = uVar5;
          *(undefined4 *)((longlong)plVar17 + 0xc) = uVar6;
          *(undefined8 *)((longlong)param_1 + lVar19 + -0x10) = 0;
          *(undefined8 *)((longlong)param_1 + lVar19 + -8) = 0xf;
          *(undefined1 *)((longlong)param_1 + lVar19 + -0x20) = 0;
          lVar19 = lVar19 + -0x20;
        } while (lVar19 != 0);
        uVar1 = param_1[3];
        plVar20 = param_1;
        if (0xf < uVar1) {
          lVar19 = *param_1;
          uVar13 = uVar1 + 1;
          lVar16 = lVar19;
          if (0xfff < uVar13) {
            lVar16 = *(longlong *)(lVar19 + -8);
            if (0x1f < (ulonglong)((lVar19 + -8) - lVar16)) {
LAB_7ff70c927778:
                    /* WARNING: Does not return */
              pcVar2 = (code *)invalidInstructionException();
              (*pcVar2)();
            }
            uVar13 = uVar1 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar16,uVar13);
        }
      }
      else {
        while( true ) {
          plVar17 = plVar20 + -4;
          plVar18 = plVar17;
          if (0xf < (ulonglong)plVar20[-1]) {
            plVar18 = (longlong *)plVar20[-4];
          }
          if ((uVar1 <= (ulonglong)plVar20[-2]) &&
             ((uVar1 != plVar20[-2] ||
              (iVar11 = FUN_7ff70cb12b50(puVar21,plVar18,uVar1), -1 < iVar11)))) break;
          uVar13 = plVar20[3];
          if (0xf < uVar13) {
            lVar19 = *plVar20;
            uVar14 = uVar13 + 1;
            lVar16 = lVar19;
            if (0xfff < uVar14) {
              lVar16 = *(longlong *)(lVar19 + -8);
              if (0x1f < (ulonglong)((lVar19 + -8) - lVar16)) goto LAB_7ff70c927778;
              uVar14 = uVar13 + 0x28;
            }
            thunk_FUN_7ff70ca90250(lVar16,uVar14);
          }
          plVar20[2] = plVar20[-2];
          plVar20[3] = plVar20[-1];
          *(int *)plVar20 = (int)*plVar17;
          *(undefined4 *)((longlong)plVar20 + 4) = *(undefined4 *)((longlong)plVar20 + -0x1c);
          *(int *)(plVar20 + 1) = (int)plVar20[-3];
          *(undefined4 *)((longlong)plVar20 + 0xc) = *(undefined4 *)((longlong)plVar20 + -0x14);
          plVar20[-2] = 0;
          plVar20[-1] = 0xf;
          *(undefined1 *)(plVar20 + -4) = 0;
          plVar20 = plVar17;
        }
        uVar1 = plVar20[3];
        if (0xf < uVar1) {
          lVar19 = *plVar20;
          uVar13 = uVar1 + 1;
          lVar16 = lVar19;
          if (0xfff < uVar13) {
            lVar16 = *(longlong *)(lVar19 + -8);
            if (0x1f < (ulonglong)((lVar19 + -8) - lVar16)) goto LAB_7ff70c927778;
            uVar13 = uVar1 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar16,uVar13);
        }
      }
      plVar20[2] = CONCAT44(uStack_54,uStack_58);
      plVar20[3] = CONCAT44(uStack_4c,uStack_50);
      *plVar20 = CONCAT44(uStack_64,uStack_68);
      plVar20[1] = CONCAT44(uStack_5c,uStack_60);
      lVar22 = lVar22 + 0x20;
      plVar17 = plVar12 + 4;
      plVar20 = plVar12;
    } while (plVar12 + 4 != param_2);
  }
  return param_2;
}


