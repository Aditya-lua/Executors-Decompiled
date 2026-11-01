
void FUN_00689a68(undefined8 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *in_x9;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *puVar14;
  undefined8 *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x28;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long in_stack_00000000;
  
  do {
    do {
      puVar8 = param_1 + 1;
      *param_1 = *in_x9;
      puVar2 = param_2;
      param_1 = puVar8;
      in_x9 = in_x9 + 1;
    } while (puVar8 != unaff_x24);
    do {
      do {
        param_2 = unaff_x23;
        puVar8 = param_2 + unaff_x26;
        if (puVar2 != (undefined8 *)0x0) {
          __ZdlPv();
        }
        puVar13 = unaff_x20;
        while( true ) {
          do {
            puVar2 = unaff_x24 + 1;
            *unaff_x24 = unaff_x21;
            unaff_x28 = unaff_x28 + -1;
            if (unaff_x28 == 0) {
              puVar15 = (undefined8 *)unaff_x19[1];
              puVar14 = puVar2;
              if (unaff_x25 == 0) goto code_r0x00689ae8;
              goto code_r0x00689b58;
            }
            unaff_x21 = __Znwm(0x1000);
            unaff_x24 = puVar2;
          } while (puVar2 != puVar8);
          if (puVar13 < param_2 || (long)puVar13 - (long)param_2 == 0) break;
          lVar5 = (long)puVar13 - (long)param_2 >> 3;
          lVar3 = lVar5 + 2;
          if (-2 < lVar5) {
            lVar3 = lVar5 + 1;
          }
          lVar5 = (long)puVar8 - (long)puVar13;
          puVar2 = puVar8;
          if (lVar5 != 0) {
            _memmove(puVar13 + -(lVar3 >> 1),puVar13,lVar5);
            puVar2 = puVar13;
          }
          unaff_x24 = (undefined8 *)((long)(puVar13 + -(lVar3 >> 1)) + lVar5);
          puVar13 = puVar2 + -(lVar3 >> 1);
        }
        unaff_x26 = (long)puVar8 - (long)param_2 >> 2;
        if ((long)puVar8 - (long)param_2 == 0) {
          unaff_x26 = 1;
        }
        if (unaff_x26 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068a044;
        }
        unaff_x23 = (undefined8 *)__Znwm(unaff_x26 << 3);
        uVar6 = unaff_x26 >> 2;
        unaff_x20 = unaff_x23 + uVar6;
        uVar7 = (long)puVar8 - (long)puVar13;
        puVar2 = param_2;
        unaff_x24 = unaff_x20;
      } while (uVar7 == 0);
      unaff_x24 = (undefined8 *)((long)unaff_x20 + (uVar7 & 0xfffffffffffffff8));
      if ((uVar7 - 8 < 0x38) || ((long)unaff_x23 + (uVar6 * 8 - (long)puVar13) < 0x40)) {
        param_1 = unaff_x20;
        in_x9 = puVar13;
        break;
      }
      uVar7 = (uVar7 - 8 >> 3) + 1;
      uVar10 = uVar7 & 0x3ffffffffffffff8;
      param_1 = unaff_x20 + uVar10;
      in_x9 = puVar13 + uVar10;
      puVar8 = unaff_x23 + uVar6 + 4;
      puVar13 = puVar13 + 4;
      uVar6 = uVar10;
      do {
        uVar16 = puVar13[-4];
        uVar18 = puVar13[-1];
        uVar17 = puVar13[-2];
        uVar20 = puVar13[1];
        uVar19 = *puVar13;
        uVar22 = puVar13[3];
        uVar21 = puVar13[2];
        puVar8[-3] = puVar13[-3];
        puVar8[-4] = uVar16;
        puVar8[-1] = uVar18;
        puVar8[-2] = uVar17;
        puVar8[1] = uVar20;
        *puVar8 = uVar19;
        puVar8[3] = uVar22;
        puVar8[2] = uVar21;
        uVar6 = uVar6 - 8;
        puVar8 = puVar8 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar6 != 0);
    } while (uVar7 == uVar10);
  } while( true );
code_r0x00689b58:
  do {
    if (puVar14 == puVar8) {
      if (puVar13 < param_2 || (long)puVar13 - (long)param_2 == 0) {
        uVar7 = (long)puVar8 - (long)param_2 >> 2;
        if ((long)puVar8 - (long)param_2 == 0) {
          uVar7 = 1;
        }
        if (uVar7 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068a044;
        }
        puVar4 = (undefined8 *)__Znwm(uVar7 << 3);
        uVar10 = uVar7 >> 2;
        puVar2 = puVar4 + uVar10;
        uVar6 = (long)puVar8 - (long)puVar13;
        puVar14 = puVar2;
        if (uVar6 != 0) {
          puVar14 = (undefined8 *)((long)puVar2 + (uVar6 & 0xfffffffffffffff8));
          if ((uVar6 - 8 < 0x38) || ((long)puVar4 + (uVar10 * 8 - (long)puVar13) < 0x40)) {
            puVar8 = puVar2;
            puVar9 = puVar13;
          }
          else {
            uVar6 = (uVar6 - 8 >> 3) + 1;
            uVar11 = uVar6 & 0x3ffffffffffffff8;
            puVar8 = puVar2 + uVar11;
            puVar9 = puVar13 + uVar11;
            puVar12 = puVar4 + uVar10 + 4;
            puVar13 = puVar13 + 4;
            uVar10 = uVar11;
            do {
              uVar16 = puVar13[-4];
              uVar18 = puVar13[-1];
              uVar17 = puVar13[-2];
              uVar20 = puVar13[1];
              uVar19 = *puVar13;
              uVar22 = puVar13[3];
              uVar21 = puVar13[2];
              puVar12[-3] = puVar13[-3];
              puVar12[-4] = uVar16;
              puVar12[-1] = uVar18;
              puVar12[-2] = uVar17;
              puVar12[1] = uVar20;
              *puVar12 = uVar19;
              puVar12[3] = uVar22;
              puVar12[2] = uVar21;
              uVar10 = uVar10 - 8;
              puVar12 = puVar12 + 8;
              puVar13 = puVar13 + 8;
            } while (uVar10 != 0);
            if (uVar6 == uVar11) goto code_r0x00689c2c;
          }
          do {
            puVar13 = puVar8 + 1;
            *puVar8 = *puVar9;
            puVar8 = puVar13;
            puVar9 = puVar9 + 1;
          } while (puVar13 != puVar14);
        }
code_r0x00689c2c:
        puVar8 = puVar4 + uVar7;
        if (param_2 != (undefined8 *)0x0) {
          __ZdlPv(param_2);
        }
        param_2 = puVar4;
        puVar13 = puVar2;
      }
      else {
        lVar5 = (long)puVar13 - (long)param_2 >> 3;
        lVar3 = lVar5 + 2;
        if (-2 < lVar5) {
          lVar3 = lVar5 + 1;
        }
        lVar5 = (long)puVar8 - (long)puVar13;
        puVar2 = puVar8;
        if (lVar5 != 0) {
          _memmove(puVar13 + -(lVar3 >> 1),puVar13,lVar5);
          puVar2 = puVar13;
        }
        puVar14 = (undefined8 *)((long)(puVar13 + -(lVar3 >> 1)) + lVar5);
        puVar13 = puVar2 + -(lVar3 >> 1);
      }
    }
    puVar2 = puVar14 + 1;
    *puVar14 = *puVar15;
    puVar15 = (undefined8 *)(unaff_x19[1] + 8);
    unaff_x19[1] = (long)puVar15;
    unaff_x25 = unaff_x25 + -1;
    puVar14 = puVar2;
  } while (unaff_x25 != 0);
code_r0x00689ae8:
  puVar14 = (undefined8 *)unaff_x19[2];
  if (puVar14 != puVar15) {
    do {
      if (puVar13 == param_2) {
        if (puVar2 < puVar8) {
          lVar5 = (long)puVar8 - (long)puVar2 >> 3;
          lVar3 = lVar5 + 2;
          if (-2 < lVar5) {
            lVar3 = lVar5 + 1;
          }
          puVar13 = param_2 + (lVar3 >> 1);
          puVar15 = param_2;
          if ((long)puVar2 - (long)param_2 != 0) {
            _memmove(puVar13,param_2,(long)puVar2 - (long)param_2);
            puVar15 = puVar2;
          }
          puVar2 = puVar15 + (lVar3 >> 1);
          puVar15 = param_2;
        }
        else {
          uVar7 = (long)puVar8 - (long)param_2 >> 2;
          if ((long)puVar8 - (long)param_2 == 0) {
            uVar7 = 1;
          }
          if (uVar7 >> 0x3d != 0) {
            func_0x00017514();
code_r0x0068a044:
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x68a048);
            (*pcVar1)();
          }
          puVar15 = (undefined8 *)__Znwm(uVar7 << 3);
          uVar10 = uVar7 + 3 >> 2;
          puVar13 = puVar15 + uVar10;
          uVar6 = (long)puVar2 - (long)param_2;
          puVar2 = puVar13;
          if (uVar6 != 0) {
            puVar2 = (undefined8 *)((long)puVar13 + (uVar6 & 0xfffffffffffffff8));
            puVar8 = puVar13;
            puVar4 = param_2;
            if ((0x37 < uVar6 - 8) && (0x3f < (long)puVar15 + (uVar10 * 8 - (long)param_2))) {
              uVar6 = (uVar6 - 8 >> 3) + 1;
              uVar11 = uVar6 & 0x3ffffffffffffff8;
              puVar8 = puVar15 + uVar10 + 4;
              puVar4 = param_2 + 4;
              uVar10 = uVar11;
              do {
                uVar16 = puVar4[-4];
                uVar18 = puVar4[-1];
                uVar17 = puVar4[-2];
                uVar20 = puVar4[1];
                uVar19 = *puVar4;
                uVar22 = puVar4[3];
                uVar21 = puVar4[2];
                puVar8[-3] = puVar4[-3];
                puVar8[-4] = uVar16;
                puVar8[-1] = uVar18;
                puVar8[-2] = uVar17;
                puVar8[1] = uVar20;
                *puVar8 = uVar19;
                puVar8[3] = uVar22;
                puVar8[2] = uVar21;
                uVar10 = uVar10 - 8;
                puVar8 = puVar8 + 8;
                puVar4 = puVar4 + 8;
              } while (uVar10 != 0);
              puVar8 = puVar13 + uVar11;
              puVar4 = param_2 + uVar11;
              if (uVar6 == uVar11) goto code_r0x00689dcc;
            }
            do {
              puVar9 = puVar8 + 1;
              *puVar8 = *puVar4;
              puVar8 = puVar9;
              puVar4 = puVar4 + 1;
            } while (puVar9 != puVar2);
          }
code_r0x00689dcc:
          puVar8 = puVar15 + uVar7;
          if (param_2 != (undefined8 *)0x0) {
            __ZdlPv(param_2);
          }
        }
        param_2 = puVar15;
      }
      puVar14 = puVar14 + -1;
      puVar13 = puVar13 + -1;
      *puVar13 = *puVar14;
    } while (puVar14 != (undefined8 *)unaff_x19[1]);
  }
  lVar3 = *unaff_x19;
  *unaff_x19 = (long)param_2;
  unaff_x19[1] = (long)puVar13;
  unaff_x19[2] = (long)puVar2;
  unaff_x19[3] = (long)puVar8;
  unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
  if (lVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

