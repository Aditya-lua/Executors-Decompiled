
void FUN_00689984(undefined8 *param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  long *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
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
    puVar14 = param_1 + -unaff_x20;
    puVar15 = (undefined8 *)((long)unaff_x23 + unaff_x24);
    while( true ) {
      do {
        puVar9 = puVar15 + 1;
        *puVar15 = unaff_x21;
        unaff_x28 = unaff_x28 + -1;
        if (unaff_x28 == 0) {
          puVar15 = (undefined8 *)unaff_x19[1];
          puVar3 = puVar9;
          if (unaff_x25 == 0) goto LAB_00689ae8;
          goto code_r0x00689b58;
        }
        unaff_x21 = __Znwm(0x1000);
        puVar15 = puVar9;
      } while (puVar9 != unaff_x27);
      if (unaff_x26 <= puVar14 && (long)puVar14 - (long)unaff_x26 != 0) break;
      uVar7 = (long)unaff_x27 - (long)unaff_x26 >> 2;
      if ((long)unaff_x27 - (long)unaff_x26 == 0) {
        uVar7 = 1;
      }
      if (uVar7 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x0068a044;
      }
      puVar3 = (undefined8 *)__Znwm(uVar7 << 3);
      uVar8 = uVar7 >> 2;
      puVar9 = puVar3 + uVar8;
      uVar1 = (long)unaff_x27 - (long)puVar14;
      puVar15 = puVar9;
      if (uVar1 != 0) {
        puVar15 = (undefined8 *)((long)puVar9 + (uVar1 & 0xfffffffffffffff8));
        if ((uVar1 - 8 < 0x38) || ((long)puVar3 + (uVar8 * 8 - (long)puVar14) < 0x40)) {
          puVar5 = puVar9;
          puVar10 = puVar14;
        }
        else {
          uVar1 = (uVar1 - 8 >> 3) + 1;
          uVar12 = uVar1 & 0x3ffffffffffffff8;
          puVar5 = puVar9 + uVar12;
          puVar10 = puVar14 + uVar12;
          puVar11 = puVar3 + uVar8 + 4;
          puVar14 = puVar14 + 4;
          uVar8 = uVar12;
          do {
            uVar16 = puVar14[-4];
            uVar18 = puVar14[-1];
            uVar17 = puVar14[-2];
            uVar20 = puVar14[1];
            uVar19 = *puVar14;
            uVar22 = puVar14[3];
            uVar21 = puVar14[2];
            puVar11[-3] = puVar14[-3];
            puVar11[-4] = uVar16;
            puVar11[-1] = uVar18;
            puVar11[-2] = uVar17;
            puVar11[1] = uVar20;
            *puVar11 = uVar19;
            puVar11[3] = uVar22;
            puVar11[2] = uVar21;
            uVar8 = uVar8 - 8;
            puVar11 = puVar11 + 8;
            puVar14 = puVar14 + 8;
          } while (uVar8 != 0);
          if (uVar1 == uVar12) goto LAB_00689a78;
        }
        do {
          puVar14 = puVar5 + 1;
          *puVar5 = *puVar10;
          puVar5 = puVar14;
          puVar10 = puVar10 + 1;
        } while (puVar14 != puVar15);
      }
LAB_00689a78:
      unaff_x27 = puVar3 + uVar7;
      if (unaff_x26 != (undefined8 *)0x0) {
        __ZdlPv();
      }
      unaff_x26 = puVar3;
      puVar14 = puVar9;
    }
    lVar6 = (long)puVar14 - (long)unaff_x26 >> 3;
    lVar4 = lVar6 + 2;
    if (-2 < lVar6) {
      lVar4 = lVar6 + 1;
    }
    unaff_x20 = lVar4 >> 1;
    unaff_x23 = puVar14 + -unaff_x20;
    unaff_x24 = (long)unaff_x27 - (long)puVar14;
    param_1 = unaff_x27;
    if (unaff_x24 != 0) {
      _memmove(unaff_x23,puVar14,unaff_x24);
      param_1 = puVar14;
    }
  } while( true );
code_r0x00689b58:
  do {
    if (puVar3 == unaff_x27) {
      if (puVar14 < unaff_x26 || (long)puVar14 - (long)unaff_x26 == 0) {
        uVar7 = (long)unaff_x27 - (long)unaff_x26 >> 2;
        if ((long)unaff_x27 - (long)unaff_x26 == 0) {
          uVar7 = 1;
        }
        if (uVar7 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068a044;
        }
        puVar5 = (undefined8 *)__Znwm(uVar7 << 3);
        uVar8 = uVar7 >> 2;
        puVar9 = puVar5 + uVar8;
        uVar1 = (long)unaff_x27 - (long)puVar14;
        puVar3 = puVar9;
        if (uVar1 != 0) {
          puVar3 = (undefined8 *)((long)puVar9 + (uVar1 & 0xfffffffffffffff8));
          if ((uVar1 - 8 < 0x38) || ((long)puVar5 + (uVar8 * 8 - (long)puVar14) < 0x40)) {
            puVar10 = puVar9;
            puVar11 = puVar14;
          }
          else {
            uVar1 = (uVar1 - 8 >> 3) + 1;
            uVar12 = uVar1 & 0x3ffffffffffffff8;
            puVar10 = puVar9 + uVar12;
            puVar11 = puVar14 + uVar12;
            puVar13 = puVar5 + uVar8 + 4;
            puVar14 = puVar14 + 4;
            uVar8 = uVar12;
            do {
              uVar16 = puVar14[-4];
              uVar18 = puVar14[-1];
              uVar17 = puVar14[-2];
              uVar20 = puVar14[1];
              uVar19 = *puVar14;
              uVar22 = puVar14[3];
              uVar21 = puVar14[2];
              puVar13[-3] = puVar14[-3];
              puVar13[-4] = uVar16;
              puVar13[-1] = uVar18;
              puVar13[-2] = uVar17;
              puVar13[1] = uVar20;
              *puVar13 = uVar19;
              puVar13[3] = uVar22;
              puVar13[2] = uVar21;
              uVar8 = uVar8 - 8;
              puVar13 = puVar13 + 8;
              puVar14 = puVar14 + 8;
            } while (uVar8 != 0);
            if (uVar1 == uVar12) goto LAB_00689c2c;
          }
          do {
            puVar14 = puVar10 + 1;
            *puVar10 = *puVar11;
            puVar10 = puVar14;
            puVar11 = puVar11 + 1;
          } while (puVar14 != puVar3);
        }
LAB_00689c2c:
        unaff_x27 = puVar5 + uVar7;
        if (unaff_x26 != (undefined8 *)0x0) {
          __ZdlPv(unaff_x26);
        }
        unaff_x26 = puVar5;
        puVar14 = puVar9;
      }
      else {
        lVar6 = (long)puVar14 - (long)unaff_x26 >> 3;
        lVar4 = lVar6 + 2;
        if (-2 < lVar6) {
          lVar4 = lVar6 + 1;
        }
        lVar6 = (long)unaff_x27 - (long)puVar14;
        puVar9 = unaff_x27;
        if (lVar6 != 0) {
          _memmove(puVar14 + -(lVar4 >> 1),puVar14,lVar6);
          puVar9 = puVar14;
        }
        puVar3 = (undefined8 *)((long)(puVar14 + -(lVar4 >> 1)) + lVar6);
        puVar14 = puVar9 + -(lVar4 >> 1);
      }
    }
    puVar9 = puVar3 + 1;
    *puVar3 = *puVar15;
    puVar15 = (undefined8 *)(unaff_x19[1] + 8);
    unaff_x19[1] = (long)puVar15;
    unaff_x25 = unaff_x25 + -1;
    puVar3 = puVar9;
  } while (unaff_x25 != 0);
LAB_00689ae8:
  puVar3 = (undefined8 *)unaff_x19[2];
  if (puVar3 != puVar15) {
    do {
      if (puVar14 == unaff_x26) {
        if (puVar9 < unaff_x27) {
          lVar6 = (long)unaff_x27 - (long)puVar9 >> 3;
          lVar4 = lVar6 + 2;
          if (-2 < lVar6) {
            lVar4 = lVar6 + 1;
          }
          puVar14 = unaff_x26 + (lVar4 >> 1);
          puVar15 = unaff_x26;
          if ((long)puVar9 - (long)unaff_x26 != 0) {
            _memmove(puVar14,unaff_x26,(long)puVar9 - (long)unaff_x26);
            puVar15 = puVar9;
          }
          puVar9 = puVar15 + (lVar4 >> 1);
          puVar15 = unaff_x26;
        }
        else {
          uVar7 = (long)unaff_x27 - (long)unaff_x26 >> 2;
          if ((long)unaff_x27 - (long)unaff_x26 == 0) {
            uVar7 = 1;
          }
          if (uVar7 >> 0x3d != 0) {
            func_0x00017514();
code_r0x0068a044:
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x68a048);
            (*pcVar2)();
          }
          puVar15 = (undefined8 *)__Znwm(uVar7 << 3);
          uVar8 = uVar7 + 3 >> 2;
          puVar14 = puVar15 + uVar8;
          uVar1 = (long)puVar9 - (long)unaff_x26;
          puVar9 = puVar14;
          if (uVar1 != 0) {
            puVar9 = (undefined8 *)((long)puVar14 + (uVar1 & 0xfffffffffffffff8));
            puVar5 = puVar14;
            puVar10 = unaff_x26;
            if ((0x37 < uVar1 - 8) && (0x3f < (long)puVar15 + (uVar8 * 8 - (long)unaff_x26))) {
              uVar1 = (uVar1 - 8 >> 3) + 1;
              uVar12 = uVar1 & 0x3ffffffffffffff8;
              puVar5 = puVar15 + uVar8 + 4;
              puVar10 = unaff_x26 + 4;
              uVar8 = uVar12;
              do {
                uVar16 = puVar10[-4];
                uVar18 = puVar10[-1];
                uVar17 = puVar10[-2];
                uVar20 = puVar10[1];
                uVar19 = *puVar10;
                uVar22 = puVar10[3];
                uVar21 = puVar10[2];
                puVar5[-3] = puVar10[-3];
                puVar5[-4] = uVar16;
                puVar5[-1] = uVar18;
                puVar5[-2] = uVar17;
                puVar5[1] = uVar20;
                *puVar5 = uVar19;
                puVar5[3] = uVar22;
                puVar5[2] = uVar21;
                uVar8 = uVar8 - 8;
                puVar5 = puVar5 + 8;
                puVar10 = puVar10 + 8;
              } while (uVar8 != 0);
              puVar5 = puVar14 + uVar12;
              puVar10 = unaff_x26 + uVar12;
              if (uVar1 == uVar12) goto code_r0x00689dcc;
            }
            do {
              puVar11 = puVar5 + 1;
              *puVar5 = *puVar10;
              puVar5 = puVar11;
              puVar10 = puVar10 + 1;
            } while (puVar11 != puVar9);
          }
code_r0x00689dcc:
          unaff_x27 = puVar15 + uVar7;
          if (unaff_x26 != (undefined8 *)0x0) {
            __ZdlPv(unaff_x26);
          }
        }
        unaff_x26 = puVar15;
      }
      puVar3 = puVar3 + -1;
      puVar14 = puVar14 + -1;
      *puVar14 = *puVar3;
    } while (puVar3 != (undefined8 *)unaff_x19[1]);
  }
  lVar4 = *unaff_x19;
  *unaff_x19 = (long)unaff_x26;
  unaff_x19[1] = (long)puVar14;
  unaff_x19[2] = (long)puVar9;
  unaff_x19[3] = (long)unaff_x27;
  unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
  if (lVar4 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

