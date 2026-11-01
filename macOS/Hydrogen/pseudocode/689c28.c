
void FUN_00689c28(undefined8 *param_1)

{
  code *pcVar1;
  undefined1 in_ZR;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *in_x9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar14;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 *unaff_x28;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  long in_stack_00000000;
  
  do {
    puVar8 = param_1;
    puVar5 = in_x9;
    puVar14 = unaff_x20;
    if ((bool)in_ZR) {
      do {
        do {
          unaff_x20 = unaff_x23;
          puVar8 = unaff_x20 + unaff_x26;
          if (puVar14 != (undefined8 *)0x0) {
            __ZdlPv(puVar14);
          }
          puVar13 = unaff_x21;
          while( true ) {
            while( true ) {
              puVar5 = unaff_x24 + 1;
              *unaff_x24 = *unaff_x28;
              unaff_x28 = (undefined8 *)(unaff_x19[1] + 8);
              unaff_x19[1] = (long)unaff_x28;
              unaff_x25 = unaff_x25 + -1;
              if (unaff_x25 == 0) {
                puVar14 = (undefined8 *)unaff_x19[2];
                if (puVar14 != unaff_x28) goto code_r0x00689cac;
                goto code_r0x00689af4;
              }
              if (puVar5 == puVar8) break;
              unaff_x24 = puVar5;
            }
            if (puVar13 < unaff_x20 || (long)puVar13 - (long)unaff_x20 == 0) break;
            lVar4 = (long)puVar13 - (long)unaff_x20 >> 3;
            lVar2 = lVar4 + 2;
            if (-2 < lVar4) {
              lVar2 = lVar4 + 1;
            }
            puVar14 = puVar13 + -(lVar2 >> 1);
            lVar4 = (long)puVar8 - (long)puVar13;
            puVar5 = puVar8;
            if (lVar4 != 0) {
              _memmove(puVar14,puVar13,lVar4);
              puVar5 = puVar13;
            }
            puVar13 = puVar5 + -(lVar2 >> 1);
            unaff_x24 = (undefined8 *)((long)puVar14 + lVar4);
          }
          unaff_x26 = (long)puVar8 - (long)unaff_x20 >> 2;
          if ((long)puVar8 - (long)unaff_x20 == 0) {
            unaff_x26 = 1;
          }
          if (unaff_x26 >> 0x3d != 0) {
            func_0x00017514();
            goto code_r0x0068a044;
          }
          unaff_x23 = (undefined8 *)__Znwm(unaff_x26 << 3);
          uVar6 = unaff_x26 >> 2;
          unaff_x21 = unaff_x23 + uVar6;
          uVar7 = (long)puVar8 - (long)puVar13;
          puVar14 = unaff_x20;
          unaff_x24 = unaff_x21;
        } while (uVar7 == 0);
        unaff_x24 = (undefined8 *)((long)unaff_x21 + (uVar7 & 0xfffffffffffffff8));
        if ((uVar7 - 8 < 0x38) || ((long)unaff_x23 + (uVar6 * 8 - (long)puVar13) < 0x40)) {
          puVar8 = unaff_x21;
          puVar5 = puVar13;
          break;
        }
        uVar7 = (uVar7 - 8 >> 3) + 1;
        uVar11 = uVar7 & 0x3ffffffffffffff8;
        puVar8 = unaff_x21 + uVar11;
        puVar5 = puVar13 + uVar11;
        puVar3 = unaff_x23 + uVar6 + 4;
        puVar13 = puVar13 + 4;
        uVar6 = uVar11;
        do {
          uVar15 = puVar13[-4];
          uVar17 = puVar13[-1];
          uVar16 = puVar13[-2];
          uVar19 = puVar13[1];
          uVar18 = *puVar13;
          uVar21 = puVar13[3];
          uVar20 = puVar13[2];
          puVar3[-3] = puVar13[-3];
          puVar3[-4] = uVar15;
          puVar3[-1] = uVar17;
          puVar3[-2] = uVar16;
          puVar3[1] = uVar19;
          *puVar3 = uVar18;
          puVar3[3] = uVar21;
          puVar3[2] = uVar20;
          uVar6 = uVar6 - 8;
          puVar3 = puVar3 + 8;
          puVar13 = puVar13 + 8;
        } while (uVar6 != 0);
      } while (uVar7 == uVar11);
    }
    in_x9 = puVar5 + 1;
    param_1 = puVar8 + 1;
    *puVar8 = *puVar5;
    in_ZR = param_1 == unaff_x24;
  } while( true );
code_r0x00689cac:
  if (puVar13 == unaff_x20) {
    if (puVar5 < puVar8) {
      lVar4 = (long)puVar8 - (long)puVar5 >> 3;
      lVar2 = lVar4 + 2;
      if (-2 < lVar4) {
        lVar2 = lVar4 + 1;
      }
      puVar13 = unaff_x20 + (lVar2 >> 1);
      puVar3 = unaff_x20;
      if ((long)puVar5 - (long)unaff_x20 != 0) {
        _memmove(puVar13,unaff_x20,(long)puVar5 - (long)unaff_x20);
        puVar3 = puVar5;
      }
      puVar5 = puVar3 + (lVar2 >> 1);
      puVar3 = unaff_x20;
    }
    else {
      uVar7 = (long)puVar8 - (long)unaff_x20 >> 2;
      if ((long)puVar8 - (long)unaff_x20 == 0) {
        uVar7 = 1;
      }
      if (uVar7 >> 0x3d != 0) {
        func_0x00017514();
code_r0x0068a044:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x68a048);
        (*pcVar1)();
      }
      puVar3 = (undefined8 *)__Znwm(uVar7 << 3);
      uVar11 = uVar7 + 3 >> 2;
      puVar13 = puVar3 + uVar11;
      uVar6 = (long)puVar5 - (long)unaff_x20;
      puVar5 = puVar13;
      if (uVar6 != 0) {
        puVar5 = (undefined8 *)((long)puVar13 + (uVar6 & 0xfffffffffffffff8));
        puVar8 = puVar13;
        puVar10 = unaff_x20;
        if ((0x37 < uVar6 - 8) && (0x3f < (long)puVar3 + (uVar11 * 8 - (long)unaff_x20))) {
          uVar6 = (uVar6 - 8 >> 3) + 1;
          uVar12 = uVar6 & 0x3ffffffffffffff8;
          puVar8 = puVar3 + uVar11 + 4;
          puVar10 = unaff_x20 + 4;
          uVar11 = uVar12;
          do {
            uVar15 = puVar10[-4];
            uVar17 = puVar10[-1];
            uVar16 = puVar10[-2];
            uVar19 = puVar10[1];
            uVar18 = *puVar10;
            uVar21 = puVar10[3];
            uVar20 = puVar10[2];
            puVar8[-3] = puVar10[-3];
            puVar8[-4] = uVar15;
            puVar8[-1] = uVar17;
            puVar8[-2] = uVar16;
            puVar8[1] = uVar19;
            *puVar8 = uVar18;
            puVar8[3] = uVar21;
            puVar8[2] = uVar20;
            uVar11 = uVar11 - 8;
            puVar8 = puVar8 + 8;
            puVar10 = puVar10 + 8;
          } while (uVar11 != 0);
          puVar8 = puVar13 + uVar12;
          puVar10 = unaff_x20 + uVar12;
          if (uVar6 == uVar12) goto code_r0x00689dcc;
        }
        do {
          puVar9 = puVar8 + 1;
          *puVar8 = *puVar10;
          puVar8 = puVar9;
          puVar10 = puVar10 + 1;
        } while (puVar9 != puVar5);
      }
code_r0x00689dcc:
      puVar8 = puVar3 + uVar7;
      if (unaff_x20 != (undefined8 *)0x0) {
        __ZdlPv(unaff_x20);
      }
    }
    unaff_x20 = puVar3;
  }
  puVar14 = puVar14 + -1;
  puVar13 = puVar13 + -1;
  *puVar13 = *puVar14;
  if (puVar14 == (undefined8 *)unaff_x19[1]) {
code_r0x00689af4:
    lVar2 = *unaff_x19;
    *unaff_x19 = (long)unaff_x20;
    unaff_x19[1] = (long)puVar13;
    unaff_x19[2] = (long)puVar5;
    unaff_x19[3] = (long)puVar8;
    unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
    if (lVar2 == 0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR___ZdlPv_009b01b8)();
    return;
  }
  goto code_r0x00689cac;
}

