
void FUN_0068a73c(undefined8 *param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong uVar12;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar13;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 *unaff_x28;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  long in_stack_00000000;
  
code_r0x0068a73c:
  puVar8 = param_1;
  puVar5 = unaff_x22;
  param_1 = unaff_x21;
  do {
    do {
      puVar3 = puVar8 + 1;
      *puVar8 = *puVar5;
      puVar8 = puVar3;
      puVar5 = puVar5 + 1;
      puVar13 = unaff_x20;
    } while (puVar3 != unaff_x24);
    do {
      do {
        unaff_x20 = unaff_x23;
        puVar8 = unaff_x20 + unaff_x26;
        if (puVar13 != (undefined8 *)0x0) {
          __ZdlPv(puVar13);
        }
        unaff_x22 = param_1;
        while( true ) {
          while( true ) {
            puVar5 = unaff_x24 + 1;
            *unaff_x24 = *unaff_x28;
            unaff_x28 = (undefined8 *)(unaff_x19[1] + 8);
            unaff_x19[1] = (long)unaff_x28;
            unaff_x25 = unaff_x25 + -1;
            if (unaff_x25 == 0) {
              puVar13 = (undefined8 *)unaff_x19[2];
              if (puVar13 != unaff_x28) goto code_r0x0068a7d0;
              goto code_r0x0068a618;
            }
            if (puVar5 == puVar8) break;
            unaff_x24 = puVar5;
          }
          if (unaff_x22 < unaff_x20 || (long)unaff_x22 - (long)unaff_x20 == 0) break;
          lVar4 = (long)unaff_x22 - (long)unaff_x20 >> 3;
          lVar2 = lVar4 + 2;
          if (-2 < lVar4) {
            lVar2 = lVar4 + 1;
          }
          puVar13 = unaff_x22 + -(lVar2 >> 1);
          lVar4 = (long)puVar8 - (long)unaff_x22;
          puVar5 = puVar8;
          if (lVar4 != 0) {
            _memmove(puVar13,unaff_x22,lVar4);
            puVar5 = unaff_x22;
          }
          unaff_x22 = puVar5 + -(lVar2 >> 1);
          unaff_x24 = (undefined8 *)((long)puVar13 + lVar4);
        }
        unaff_x26 = (long)puVar8 - (long)unaff_x20 >> 2;
        if ((long)puVar8 - (long)unaff_x20 == 0) {
          unaff_x26 = 1;
        }
        if (unaff_x26 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068ab68;
        }
        unaff_x23 = (undefined8 *)__Znwm(unaff_x26 << 3);
        uVar6 = unaff_x26 >> 2;
        param_1 = unaff_x23 + uVar6;
        uVar7 = (long)puVar8 - (long)unaff_x22;
        puVar13 = unaff_x20;
        unaff_x24 = param_1;
      } while (uVar7 == 0);
      unaff_x24 = (undefined8 *)((long)param_1 + (uVar7 & 0xfffffffffffffff8));
      if ((uVar7 - 8 < 0x38) || ((long)unaff_x23 + (uVar6 * 8 - (long)unaff_x22) < 0x40)) {
        unaff_x21 = param_1;
        goto code_r0x0068a73c;
      }
      uVar7 = (uVar7 - 8 >> 3) + 1;
      uVar11 = uVar7 & 0x3ffffffffffffff8;
      puVar8 = param_1 + uVar11;
      puVar5 = unaff_x22 + uVar11;
      puVar3 = unaff_x23 + uVar6 + 4;
      puVar10 = unaff_x22 + 4;
      uVar6 = uVar11;
      do {
        uVar14 = puVar10[-4];
        uVar16 = puVar10[-1];
        uVar15 = puVar10[-2];
        uVar18 = puVar10[1];
        uVar17 = *puVar10;
        uVar20 = puVar10[3];
        uVar19 = puVar10[2];
        puVar3[-3] = puVar10[-3];
        puVar3[-4] = uVar14;
        puVar3[-1] = uVar16;
        puVar3[-2] = uVar15;
        puVar3[1] = uVar18;
        *puVar3 = uVar17;
        puVar3[3] = uVar20;
        puVar3[2] = uVar19;
        uVar6 = uVar6 - 8;
        puVar3 = puVar3 + 8;
        puVar10 = puVar10 + 8;
      } while (uVar6 != 0);
    } while (uVar7 == uVar11);
  } while( true );
code_r0x0068a7d0:
  if (unaff_x22 == unaff_x20) {
    if (puVar5 < puVar8) {
      lVar4 = (long)puVar8 - (long)puVar5 >> 3;
      lVar2 = lVar4 + 2;
      if (-2 < lVar4) {
        lVar2 = lVar4 + 1;
      }
      unaff_x22 = unaff_x20 + (lVar2 >> 1);
      puVar3 = unaff_x20;
      if ((long)puVar5 - (long)unaff_x20 != 0) {
        _memmove(unaff_x22,unaff_x20,(long)puVar5 - (long)unaff_x20);
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
code_r0x0068ab68:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x68ab6c);
        (*pcVar1)();
      }
      puVar3 = (undefined8 *)__Znwm(uVar7 << 3);
      uVar11 = uVar7 + 3 >> 2;
      unaff_x22 = puVar3 + uVar11;
      uVar6 = (long)puVar5 - (long)unaff_x20;
      puVar5 = unaff_x22;
      if (uVar6 != 0) {
        puVar5 = (undefined8 *)((long)unaff_x22 + (uVar6 & 0xfffffffffffffff8));
        puVar8 = unaff_x22;
        puVar10 = unaff_x20;
        if ((0x37 < uVar6 - 8) && (0x3f < (long)puVar3 + (uVar11 * 8 - (long)unaff_x20))) {
          uVar6 = (uVar6 - 8 >> 3) + 1;
          uVar12 = uVar6 & 0x3ffffffffffffff8;
          puVar8 = puVar3 + uVar11 + 4;
          puVar10 = unaff_x20 + 4;
          uVar11 = uVar12;
          do {
            uVar14 = puVar10[-4];
            uVar16 = puVar10[-1];
            uVar15 = puVar10[-2];
            uVar18 = puVar10[1];
            uVar17 = *puVar10;
            uVar20 = puVar10[3];
            uVar19 = puVar10[2];
            puVar8[-3] = puVar10[-3];
            puVar8[-4] = uVar14;
            puVar8[-1] = uVar16;
            puVar8[-2] = uVar15;
            puVar8[1] = uVar18;
            *puVar8 = uVar17;
            puVar8[3] = uVar20;
            puVar8[2] = uVar19;
            uVar11 = uVar11 - 8;
            puVar8 = puVar8 + 8;
            puVar10 = puVar10 + 8;
          } while (uVar11 != 0);
          puVar8 = unaff_x22 + uVar12;
          puVar10 = unaff_x20 + uVar12;
          if (uVar6 == uVar12) goto code_r0x0068a8f0;
        }
        do {
          puVar9 = puVar8 + 1;
          *puVar8 = *puVar10;
          puVar8 = puVar9;
          puVar10 = puVar10 + 1;
        } while (puVar9 != puVar5);
      }
code_r0x0068a8f0:
      puVar8 = puVar3 + uVar7;
      if (unaff_x20 != (undefined8 *)0x0) {
        __ZdlPv(unaff_x20);
      }
    }
    unaff_x20 = puVar3;
  }
  puVar13 = puVar13 + -1;
  unaff_x22 = unaff_x22 + -1;
  *unaff_x22 = *puVar13;
  if (puVar13 == (undefined8 *)unaff_x19[1]) {
code_r0x0068a618:
    lVar2 = *unaff_x19;
    *unaff_x19 = (long)unaff_x20;
    unaff_x19[1] = (long)unaff_x22;
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
  goto code_r0x0068a7d0;
}

