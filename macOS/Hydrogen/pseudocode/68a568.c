
void FUN_0068a568(ulong param_1,undefined8 *param_2)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong in_x9;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar15;
  undefined8 *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x28;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  long in_stack_00000000;
  
  do {
    if ((in_x9 < 0x38) || ((long)unaff_x23 + (param_1 * 8 - (long)unaff_x22) < 0x40)) {
      puVar7 = unaff_x20;
      puVar8 = unaff_x22;
LAB_0068a58c:
      do {
        puVar5 = puVar7 + 1;
        *puVar7 = *puVar8;
        puVar7 = puVar5;
        puVar8 = puVar8 + 1;
      } while (puVar5 != unaff_x24);
    }
    else {
      uVar6 = (in_x9 >> 3) + 1;
      uVar10 = uVar6 & 0x3ffffffffffffff8;
      puVar7 = unaff_x20 + uVar10;
      puVar8 = unaff_x22 + uVar10;
      puVar5 = unaff_x23 + param_1 + 4;
      puVar16 = unaff_x22 + 4;
      uVar14 = uVar10;
      do {
        uVar17 = puVar16[-4];
        uVar19 = puVar16[-1];
        uVar18 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar23 = puVar16[3];
        uVar22 = puVar16[2];
        puVar5[-3] = puVar16[-3];
        puVar5[-4] = uVar17;
        puVar5[-1] = uVar19;
        puVar5[-2] = uVar18;
        puVar5[1] = uVar21;
        *puVar5 = uVar20;
        puVar5[3] = uVar23;
        puVar5[2] = uVar22;
        uVar14 = uVar14 - 8;
        puVar5 = puVar5 + 8;
        puVar16 = puVar16 + 8;
      } while (uVar14 != 0);
      if (uVar6 != uVar10) goto LAB_0068a58c;
    }
    do {
      puVar8 = unaff_x23;
      puVar7 = puVar8 + unaff_x26;
      if (param_2 != (undefined8 *)0x0) {
        __ZdlPv();
      }
      unaff_x22 = unaff_x20;
      while( true ) {
        do {
          puVar5 = unaff_x24 + 1;
          *unaff_x24 = unaff_x21;
          unaff_x28 = unaff_x28 + -1;
          if (unaff_x28 == 0) {
            puVar16 = (undefined8 *)unaff_x19[1];
            puVar15 = puVar5;
            if (unaff_x25 == 0) goto code_r0x0068a60c;
            goto code_r0x0068a67c;
          }
          unaff_x21 = __Znwm(0x1000);
          unaff_x24 = puVar5;
        } while (puVar5 != puVar7);
        if (unaff_x22 < puVar8 || (long)unaff_x22 - (long)puVar8 == 0) break;
        lVar4 = (long)unaff_x22 - (long)puVar8 >> 3;
        lVar2 = lVar4 + 2;
        if (-2 < lVar4) {
          lVar2 = lVar4 + 1;
        }
        lVar4 = (long)puVar7 - (long)unaff_x22;
        puVar5 = puVar7;
        if (lVar4 != 0) {
          _memmove(unaff_x22 + -(lVar2 >> 1),unaff_x22,lVar4);
          puVar5 = unaff_x22;
        }
        unaff_x24 = (undefined8 *)((long)(unaff_x22 + -(lVar2 >> 1)) + lVar4);
        unaff_x22 = puVar5 + -(lVar2 >> 1);
      }
      unaff_x26 = (long)puVar7 - (long)puVar8 >> 2;
      if ((long)puVar7 - (long)puVar8 == 0) {
        unaff_x26 = 1;
      }
      if (unaff_x26 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x0068ab68;
      }
      unaff_x23 = (undefined8 *)__Znwm(unaff_x26 << 3);
      param_1 = unaff_x26 >> 2;
      unaff_x20 = unaff_x23 + param_1;
      uVar6 = (long)puVar7 - (long)unaff_x22;
      param_2 = puVar8;
      unaff_x24 = unaff_x20;
    } while (uVar6 == 0);
    unaff_x24 = (undefined8 *)((long)unaff_x20 + (uVar6 & 0xfffffffffffffff8));
    in_x9 = uVar6 - 8;
  } while( true );
code_r0x0068a67c:
  do {
    if (puVar15 == puVar7) {
      if (unaff_x22 < puVar8 || (long)unaff_x22 - (long)puVar8 == 0) {
        uVar6 = (long)puVar7 - (long)puVar8 >> 2;
        if ((long)puVar7 - (long)puVar8 == 0) {
          uVar6 = 1;
        }
        if (uVar6 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068ab68;
        }
        puVar3 = (undefined8 *)__Znwm(uVar6 << 3);
        uVar10 = uVar6 >> 2;
        puVar5 = puVar3 + uVar10;
        uVar14 = (long)puVar7 - (long)unaff_x22;
        puVar15 = puVar5;
        if (uVar14 != 0) {
          puVar15 = (undefined8 *)((long)puVar5 + (uVar14 & 0xfffffffffffffff8));
          if ((uVar14 - 8 < 0x38) || ((long)puVar3 + (uVar10 * 8 - (long)unaff_x22) < 0x40)) {
            puVar7 = puVar5;
            puVar9 = unaff_x22;
          }
          else {
            uVar14 = (uVar14 - 8 >> 3) + 1;
            uVar11 = uVar14 & 0x3ffffffffffffff8;
            puVar7 = puVar5 + uVar11;
            puVar9 = unaff_x22 + uVar11;
            puVar12 = puVar3 + uVar10 + 4;
            puVar13 = unaff_x22 + 4;
            uVar10 = uVar11;
            do {
              uVar17 = puVar13[-4];
              uVar19 = puVar13[-1];
              uVar18 = puVar13[-2];
              uVar21 = puVar13[1];
              uVar20 = *puVar13;
              uVar23 = puVar13[3];
              uVar22 = puVar13[2];
              puVar12[-3] = puVar13[-3];
              puVar12[-4] = uVar17;
              puVar12[-1] = uVar19;
              puVar12[-2] = uVar18;
              puVar12[1] = uVar21;
              *puVar12 = uVar20;
              puVar12[3] = uVar23;
              puVar12[2] = uVar22;
              uVar10 = uVar10 - 8;
              puVar12 = puVar12 + 8;
              puVar13 = puVar13 + 8;
            } while (uVar10 != 0);
            if (uVar14 == uVar11) goto code_r0x0068a750;
          }
          do {
            puVar12 = puVar7 + 1;
            *puVar7 = *puVar9;
            puVar7 = puVar12;
            puVar9 = puVar9 + 1;
          } while (puVar12 != puVar15);
        }
code_r0x0068a750:
        puVar7 = puVar3 + uVar6;
        if (puVar8 != (undefined8 *)0x0) {
          __ZdlPv(puVar8);
        }
        puVar8 = puVar3;
        unaff_x22 = puVar5;
      }
      else {
        lVar4 = (long)unaff_x22 - (long)puVar8 >> 3;
        lVar2 = lVar4 + 2;
        if (-2 < lVar4) {
          lVar2 = lVar4 + 1;
        }
        lVar4 = (long)puVar7 - (long)unaff_x22;
        puVar5 = puVar7;
        if (lVar4 != 0) {
          _memmove(unaff_x22 + -(lVar2 >> 1),unaff_x22,lVar4);
          puVar5 = unaff_x22;
        }
        puVar15 = (undefined8 *)((long)(unaff_x22 + -(lVar2 >> 1)) + lVar4);
        unaff_x22 = puVar5 + -(lVar2 >> 1);
      }
    }
    puVar5 = puVar15 + 1;
    *puVar15 = *puVar16;
    puVar16 = (undefined8 *)(unaff_x19[1] + 8);
    unaff_x19[1] = (long)puVar16;
    unaff_x25 = unaff_x25 + -1;
    puVar15 = puVar5;
  } while (unaff_x25 != 0);
code_r0x0068a60c:
  puVar15 = (undefined8 *)unaff_x19[2];
  if (puVar15 != puVar16) {
    do {
      if (unaff_x22 == puVar8) {
        if (puVar5 < puVar7) {
          lVar4 = (long)puVar7 - (long)puVar5 >> 3;
          lVar2 = lVar4 + 2;
          if (-2 < lVar4) {
            lVar2 = lVar4 + 1;
          }
          unaff_x22 = puVar8 + (lVar2 >> 1);
          puVar16 = puVar8;
          if ((long)puVar5 - (long)puVar8 != 0) {
            _memmove(unaff_x22,puVar8,(long)puVar5 - (long)puVar8);
            puVar16 = puVar5;
          }
          puVar5 = puVar16 + (lVar2 >> 1);
          puVar16 = puVar8;
        }
        else {
          uVar6 = (long)puVar7 - (long)puVar8 >> 2;
          if ((long)puVar7 - (long)puVar8 == 0) {
            uVar6 = 1;
          }
          if (uVar6 >> 0x3d != 0) {
            func_0x00017514();
code_r0x0068ab68:
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x68ab6c);
            (*pcVar1)();
          }
          puVar16 = (undefined8 *)__Znwm(uVar6 << 3);
          uVar10 = uVar6 + 3 >> 2;
          unaff_x22 = puVar16 + uVar10;
          uVar14 = (long)puVar5 - (long)puVar8;
          puVar5 = unaff_x22;
          if (uVar14 != 0) {
            puVar5 = (undefined8 *)((long)unaff_x22 + (uVar14 & 0xfffffffffffffff8));
            puVar7 = unaff_x22;
            puVar3 = puVar8;
            if ((0x37 < uVar14 - 8) && (0x3f < (long)puVar16 + (uVar10 * 8 - (long)puVar8))) {
              uVar14 = (uVar14 - 8 >> 3) + 1;
              uVar11 = uVar14 & 0x3ffffffffffffff8;
              puVar7 = puVar16 + uVar10 + 4;
              puVar3 = puVar8 + 4;
              uVar10 = uVar11;
              do {
                uVar17 = puVar3[-4];
                uVar19 = puVar3[-1];
                uVar18 = puVar3[-2];
                uVar21 = puVar3[1];
                uVar20 = *puVar3;
                uVar23 = puVar3[3];
                uVar22 = puVar3[2];
                puVar7[-3] = puVar3[-3];
                puVar7[-4] = uVar17;
                puVar7[-1] = uVar19;
                puVar7[-2] = uVar18;
                puVar7[1] = uVar21;
                *puVar7 = uVar20;
                puVar7[3] = uVar23;
                puVar7[2] = uVar22;
                uVar10 = uVar10 - 8;
                puVar7 = puVar7 + 8;
                puVar3 = puVar3 + 8;
              } while (uVar10 != 0);
              puVar7 = unaff_x22 + uVar11;
              puVar3 = puVar8 + uVar11;
              if (uVar14 == uVar11) goto code_r0x0068a8f0;
            }
            do {
              puVar9 = puVar7 + 1;
              *puVar7 = *puVar3;
              puVar7 = puVar9;
              puVar3 = puVar3 + 1;
            } while (puVar9 != puVar5);
          }
code_r0x0068a8f0:
          puVar7 = puVar16 + uVar6;
          if (puVar8 != (undefined8 *)0x0) {
            __ZdlPv(puVar8);
          }
        }
        puVar8 = puVar16;
      }
      puVar15 = puVar15 + -1;
      unaff_x22 = unaff_x22 + -1;
      *unaff_x22 = *puVar15;
    } while (puVar15 != (undefined8 *)unaff_x19[1]);
  }
  lVar2 = *unaff_x19;
  *unaff_x19 = (long)puVar8;
  unaff_x19[1] = (long)unaff_x22;
  unaff_x19[2] = (long)puVar5;
  unaff_x19[3] = (long)puVar7;
  unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
  if (lVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

