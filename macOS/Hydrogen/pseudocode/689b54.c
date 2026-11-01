
void FUN_00689b54(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar13;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  long in_stack_00000000;
  
  while (!(bool)in_ZR) {
    if (unaff_x24 == unaff_x27) {
      if (unaff_x22 < unaff_x20 || (long)unaff_x22 - (long)unaff_x20 == 0) {
        uVar6 = (long)unaff_x27 - (long)unaff_x20 >> 2;
        if ((long)unaff_x27 - (long)unaff_x20 == 0) {
          uVar6 = 1;
        }
        if (uVar6 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068a044;
        }
        puVar4 = (undefined8 *)__Znwm(uVar6 << 3);
        uVar7 = uVar6 >> 2;
        puVar13 = puVar4 + uVar7;
        uVar1 = (long)unaff_x27 - (long)unaff_x22;
        unaff_x24 = puVar13;
        if (uVar1 != 0) {
          unaff_x24 = (undefined8 *)((long)puVar13 + (uVar1 & 0xfffffffffffffff8));
          if ((uVar1 - 8 < 0x38) || ((long)puVar4 + (uVar7 * 8 - (long)unaff_x22) < 0x40)) {
            puVar8 = puVar13;
            puVar9 = unaff_x22;
          }
          else {
            uVar1 = (uVar1 - 8 >> 3) + 1;
            uVar10 = uVar1 & 0x3ffffffffffffff8;
            puVar8 = puVar13 + uVar10;
            puVar9 = unaff_x22 + uVar10;
            puVar11 = puVar4 + uVar7 + 4;
            puVar12 = unaff_x22 + 4;
            uVar7 = uVar10;
            do {
              uVar14 = puVar12[-4];
              uVar16 = puVar12[-1];
              uVar15 = puVar12[-2];
              uVar18 = puVar12[1];
              uVar17 = *puVar12;
              uVar20 = puVar12[3];
              uVar19 = puVar12[2];
              puVar11[-3] = puVar12[-3];
              puVar11[-4] = uVar14;
              puVar11[-1] = uVar16;
              puVar11[-2] = uVar15;
              puVar11[1] = uVar18;
              *puVar11 = uVar17;
              puVar11[3] = uVar20;
              puVar11[2] = uVar19;
              uVar7 = uVar7 - 8;
              puVar11 = puVar11 + 8;
              puVar12 = puVar12 + 8;
            } while (uVar7 != 0);
            if (uVar1 == uVar10) goto LAB_00689c2c;
          }
          do {
            puVar11 = puVar8 + 1;
            *puVar8 = *puVar9;
            puVar8 = puVar11;
            puVar9 = puVar9 + 1;
          } while (puVar11 != unaff_x24);
        }
LAB_00689c2c:
        unaff_x27 = puVar4 + uVar6;
        if (unaff_x20 != (undefined8 *)0x0) {
          __ZdlPv(unaff_x20);
        }
        unaff_x20 = puVar4;
        unaff_x22 = puVar13;
      }
      else {
        lVar5 = (long)unaff_x22 - (long)unaff_x20 >> 3;
        lVar3 = lVar5 + 2;
        if (-2 < lVar5) {
          lVar3 = lVar5 + 1;
        }
        lVar5 = (long)unaff_x27 - (long)unaff_x22;
        puVar13 = unaff_x27;
        if (lVar5 != 0) {
          _memmove(unaff_x22 + -(lVar3 >> 1),unaff_x22,lVar5);
          puVar13 = unaff_x22;
        }
        unaff_x24 = (undefined8 *)((long)(unaff_x22 + -(lVar3 >> 1)) + lVar5);
        unaff_x22 = puVar13 + -(lVar3 >> 1);
      }
    }
    *unaff_x24 = *unaff_x28;
    unaff_x28 = (undefined8 *)(unaff_x19[1] + 8);
    unaff_x19[1] = (long)unaff_x28;
    unaff_x25 = unaff_x25 + -1;
    unaff_x21 = unaff_x22;
    unaff_x24 = unaff_x24 + 1;
    in_ZR = unaff_x25 == 0;
  }
  puVar13 = (undefined8 *)unaff_x19[2];
  if (puVar13 != unaff_x28) {
    do {
      if (unaff_x21 == unaff_x20) {
        if (unaff_x24 < unaff_x27) {
          lVar5 = (long)unaff_x27 - (long)unaff_x24 >> 3;
          lVar3 = lVar5 + 2;
          if (-2 < lVar5) {
            lVar3 = lVar5 + 1;
          }
          unaff_x21 = unaff_x20 + (lVar3 >> 1);
          puVar4 = unaff_x20;
          if ((long)unaff_x24 - (long)unaff_x20 != 0) {
            _memmove(unaff_x21,unaff_x20,(long)unaff_x24 - (long)unaff_x20);
            puVar4 = unaff_x24;
          }
          unaff_x24 = puVar4 + (lVar3 >> 1);
          puVar4 = unaff_x20;
        }
        else {
          uVar6 = (long)unaff_x27 - (long)unaff_x20 >> 2;
          if ((long)unaff_x27 - (long)unaff_x20 == 0) {
            uVar6 = 1;
          }
          if (uVar6 >> 0x3d != 0) {
            func_0x00017514();
code_r0x0068a044:
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x68a048);
            (*pcVar2)();
          }
          puVar4 = (undefined8 *)__Znwm(uVar6 << 3);
          uVar7 = uVar6 + 3 >> 2;
          unaff_x21 = puVar4 + uVar7;
          uVar1 = (long)unaff_x24 - (long)unaff_x20;
          unaff_x24 = unaff_x21;
          if (uVar1 != 0) {
            unaff_x24 = (undefined8 *)((long)unaff_x21 + (uVar1 & 0xfffffffffffffff8));
            puVar8 = unaff_x21;
            puVar9 = unaff_x20;
            if ((0x37 < uVar1 - 8) && (0x3f < (long)puVar4 + (uVar7 * 8 - (long)unaff_x20))) {
              uVar1 = (uVar1 - 8 >> 3) + 1;
              uVar10 = uVar1 & 0x3ffffffffffffff8;
              puVar8 = puVar4 + uVar7 + 4;
              puVar9 = unaff_x20 + 4;
              uVar7 = uVar10;
              do {
                uVar14 = puVar9[-4];
                uVar16 = puVar9[-1];
                uVar15 = puVar9[-2];
                uVar18 = puVar9[1];
                uVar17 = *puVar9;
                uVar20 = puVar9[3];
                uVar19 = puVar9[2];
                puVar8[-3] = puVar9[-3];
                puVar8[-4] = uVar14;
                puVar8[-1] = uVar16;
                puVar8[-2] = uVar15;
                puVar8[1] = uVar18;
                *puVar8 = uVar17;
                puVar8[3] = uVar20;
                puVar8[2] = uVar19;
                uVar7 = uVar7 - 8;
                puVar8 = puVar8 + 8;
                puVar9 = puVar9 + 8;
              } while (uVar7 != 0);
              puVar8 = unaff_x21 + uVar10;
              puVar9 = unaff_x20 + uVar10;
              if (uVar1 == uVar10) goto code_r0x00689dcc;
            }
            do {
              puVar11 = puVar8 + 1;
              *puVar8 = *puVar9;
              puVar8 = puVar11;
              puVar9 = puVar9 + 1;
            } while (puVar11 != unaff_x24);
          }
code_r0x00689dcc:
          unaff_x27 = puVar4 + uVar6;
          if (unaff_x20 != (undefined8 *)0x0) {
            __ZdlPv(unaff_x20);
          }
        }
        unaff_x20 = puVar4;
      }
      puVar13 = puVar13 + -1;
      unaff_x21 = unaff_x21 + -1;
      *unaff_x21 = *puVar13;
    } while (puVar13 != (undefined8 *)unaff_x19[1]);
  }
  lVar3 = *unaff_x19;
  *unaff_x19 = (long)unaff_x20;
  unaff_x19[1] = (long)unaff_x21;
  unaff_x19[2] = (long)unaff_x24;
  unaff_x19[3] = (long)unaff_x27;
  unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
  if (lVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

