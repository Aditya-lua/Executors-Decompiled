
void FUN_00675224(long param_1)

{
  long lVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  if (0xa9 < *(ulong *)(param_1 + 0x20)) {
    unaff_x19[4] = *(ulong *)(param_1 + 0x20) - 0xaa;
    puVar13 = (undefined8 *)unaff_x19[1];
    puVar17 = (undefined8 *)unaff_x19[2];
    puVar14 = puVar13 + 1;
    uVar16 = *puVar13;
    unaff_x19[1] = (long)puVar14;
    if (puVar17 != (undefined8 *)unaff_x19[3]) goto LAB_006756a8;
    puVar15 = (undefined8 *)*unaff_x19;
    lVar6 = (long)puVar14 - (long)puVar15;
    if (puVar15 <= puVar14 && lVar6 != 0) {
code_r0x0067525c:
      lVar6 = lVar6 >> 3;
      lVar4 = lVar6 + 2;
      if (-2 < lVar6) {
        lVar4 = lVar6 + 1;
      }
      puVar13 = puVar14 + -(lVar4 >> 1);
      lVar6 = (long)puVar17 - (long)puVar14;
      if (lVar6 != 0) {
        _memmove(puVar13,puVar14,lVar6);
        puVar14 = (undefined8 *)unaff_x19[1];
      }
      puVar17 = (undefined8 *)((long)puVar13 + lVar6);
      unaff_x19[1] = (long)(puVar14 + -(lVar4 >> 1));
      unaff_x19[2] = (long)puVar17;
      goto LAB_006756a8;
    }
    uVar7 = (long)puVar17 - (long)puVar15 >> 2;
    if ((long)puVar17 - (long)puVar15 == 0) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) goto LAB_00675750;
    lVar4 = __Znwm(uVar7 * 8);
    puVar3 = (undefined8 *)(lVar4 + (uVar7 >> 2) * 8);
    lVar6 = lVar4 + uVar7 * 8;
    uVar9 = (long)puVar17 - (long)puVar14;
    puVar17 = puVar3;
    if (uVar9 != 0) {
      puVar17 = (undefined8 *)((long)puVar3 + (uVar9 & 0xfffffffffffffff8));
      if (uVar9 - 8 < 0x38) {
        puVar10 = puVar3;
      }
      else {
        lVar1 = (uVar7 >> 2) * 8 + lVar4;
        puVar10 = puVar3;
        if (0x3f < (ulong)(lVar1 - (long)puVar14)) {
          uVar7 = (uVar9 - 8 >> 3) + 1;
          uVar12 = uVar7 & 0x3ffffffffffffff8;
          puVar10 = puVar3 + uVar12;
          puVar14 = puVar14 + uVar12;
          puVar5 = (undefined8 *)(lVar1 + 0x20);
          puVar13 = puVar13 + 5;
          uVar9 = uVar12;
          do {
            uVar18 = puVar13[-4];
            uVar20 = puVar13[-1];
            uVar19 = puVar13[-2];
            uVar22 = puVar13[1];
            uVar21 = *puVar13;
            uVar24 = puVar13[3];
            uVar23 = puVar13[2];
            puVar5[-3] = puVar13[-3];
            puVar5[-4] = uVar18;
            puVar5[-1] = uVar20;
            puVar5[-2] = uVar19;
            puVar5[1] = uVar22;
            *puVar5 = uVar21;
            puVar5[3] = uVar24;
            puVar5[2] = uVar23;
            uVar9 = uVar9 - 8;
            puVar5 = puVar5 + 8;
            puVar13 = puVar13 + 8;
          } while (uVar9 != 0);
          if (uVar7 == uVar12) goto code_r0x00675690;
        }
      }
      do {
        puVar13 = puVar10 + 1;
        *puVar10 = *puVar14;
        puVar10 = puVar13;
        puVar14 = puVar14 + 1;
      } while (puVar13 != puVar17);
    }
code_r0x00675690:
    *unaff_x19 = lVar4;
    unaff_x19[1] = (long)puVar3;
    unaff_x19[2] = (long)puVar17;
    unaff_x19[3] = lVar6;
    if (puVar15 != (undefined8 *)0x0) {
      __ZdlPv(puVar15);
      puVar17 = (undefined8 *)unaff_x19[2];
    }
LAB_006756a8:
    *puVar17 = uVar16;
    unaff_x19[2] = unaff_x19[2] + 8;
    return;
  }
  puVar17 = (undefined8 *)unaff_x19[2];
  puVar14 = (undefined8 *)unaff_x19[3];
  puVar13 = (undefined8 *)unaff_x19[1];
  lVar4 = (long)puVar17 - (long)puVar13;
  uVar7 = lVar4 >> 3;
  lVar6 = (long)puVar14 - *unaff_x19;
  if (uVar7 < (ulong)(lVar6 >> 3)) {
    if (puVar14 != puVar17) {
      __Znwm(0xff0);
      func_0x00035e80();
      return;
    }
    __Znwm(0xff0);
    func_0x0003600c();
    puVar13 = (undefined8 *)unaff_x19[1];
    puVar17 = (undefined8 *)unaff_x19[2];
    puVar14 = puVar13 + 1;
    uVar16 = *puVar13;
    unaff_x19[1] = (long)puVar14;
    if (puVar17 != (undefined8 *)unaff_x19[3]) goto LAB_006756a8;
    puVar15 = (undefined8 *)*unaff_x19;
    lVar6 = (long)puVar14 - (long)puVar15;
    if (puVar15 <= puVar14 && lVar6 != 0) goto code_r0x0067525c;
    uVar7 = (long)puVar17 - (long)puVar15 >> 2;
    if ((long)puVar17 - (long)puVar15 == 0) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) goto LAB_00675750;
    lVar4 = __Znwm(uVar7 * 8);
    puVar3 = (undefined8 *)(lVar4 + (uVar7 >> 2) * 8);
    lVar6 = lVar4 + uVar7 * 8;
    uVar9 = (long)puVar17 - (long)puVar14;
    puVar17 = puVar3;
    if (uVar9 != 0) {
      puVar17 = (undefined8 *)((long)puVar3 + (uVar9 & 0xfffffffffffffff8));
      if (uVar9 - 8 < 0x38) {
        puVar10 = puVar3;
      }
      else {
        lVar1 = (uVar7 >> 2) * 8 + lVar4;
        puVar10 = puVar3;
        if (0x3f < (ulong)(lVar1 - (long)puVar14)) {
          uVar7 = (uVar9 - 8 >> 3) + 1;
          uVar12 = uVar7 & 0x3ffffffffffffff8;
          puVar10 = puVar3 + uVar12;
          puVar14 = puVar14 + uVar12;
          puVar5 = (undefined8 *)(lVar1 + 0x20);
          puVar13 = puVar13 + 5;
          uVar9 = uVar12;
          do {
            uVar18 = puVar13[-4];
            uVar20 = puVar13[-1];
            uVar19 = puVar13[-2];
            uVar22 = puVar13[1];
            uVar21 = *puVar13;
            uVar24 = puVar13[3];
            uVar23 = puVar13[2];
            puVar5[-3] = puVar13[-3];
            puVar5[-4] = uVar18;
            puVar5[-1] = uVar20;
            puVar5[-2] = uVar19;
            puVar5[1] = uVar22;
            *puVar5 = uVar21;
            puVar5[3] = uVar24;
            puVar5[2] = uVar23;
            uVar9 = uVar9 - 8;
            puVar5 = puVar5 + 8;
            puVar13 = puVar13 + 8;
          } while (uVar9 != 0);
          if (uVar7 == uVar12) goto code_r0x00675690;
        }
      }
      do {
        puVar13 = puVar10 + 1;
        *puVar10 = *puVar14;
        puVar10 = puVar13;
        puVar14 = puVar14 + 1;
      } while (puVar13 != puVar17);
    }
    goto code_r0x00675690;
  }
  uVar9 = lVar6 >> 2;
  if (puVar14 == (undefined8 *)*unaff_x19) {
    uVar9 = 1;
  }
  if (uVar9 >> 0x3d != 0) {
LAB_00675750:
    func_0x00017514();
LAB_00675754:
    func_0x00017514();
code_r0x00675758:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x67575c);
    (*pcVar2)();
  }
  puVar3 = (undefined8 *)__Znwm(uVar9 * 8);
  uVar16 = __Znwm(0xff0);
  puVar14 = puVar3 + uVar7;
  puVar15 = puVar3 + uVar9;
  if (uVar7 == uVar9) {
    if (0 < lVar4) {
      uVar9 = uVar7 + 2;
      if (-2 < (long)uVar7) {
        uVar9 = uVar7 + 1;
      }
      puVar14 = puVar14 + -(uVar9 >> 1);
      *puVar14 = uVar16;
      goto joined_r0x00675364;
    }
    uVar7 = lVar4 >> 2;
    if (puVar17 == puVar13) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) goto LAB_00675754;
    puVar5 = (undefined8 *)__Znwm(uVar7 << 3);
    puVar14 = puVar5 + (uVar7 >> 2);
    puVar15 = puVar5 + uVar7;
    __ZdlPv(puVar3);
    puVar13 = (undefined8 *)unaff_x19[1];
    puVar17 = (undefined8 *)unaff_x19[2];
    puVar10 = puVar14 + 1;
    *puVar14 = uVar16;
    puVar3 = puVar5;
    if (puVar17 != puVar13) goto LAB_006754f0;
  }
  else {
    *puVar14 = uVar16;
joined_r0x00675364:
    puVar10 = puVar14 + 1;
    puVar5 = puVar3;
    if (puVar17 != puVar13) {
LAB_006754f0:
      do {
        if (puVar14 == puVar5) {
          if (puVar10 < puVar15) {
            lVar6 = (long)puVar15 - (long)puVar10 >> 3;
            uVar7 = lVar6 + 2;
            if (-2 < lVar6) {
              uVar7 = lVar6 + 1;
            }
            puVar13 = puVar10 + (uVar7 >> 1);
            puVar3 = (undefined8 *)((long)puVar13 - ((long)puVar10 - (long)puVar14));
            puVar5 = puVar14;
            if ((long)puVar10 - (long)puVar14 == 0) {
              puVar14 = puVar3;
              puVar10 = puVar13;
            }
            else {
              _memmove(puVar3,puVar14,(long)puVar10 - (long)puVar14);
              puVar14 = puVar3;
              puVar10 = puVar13;
            }
          }
          else {
            uVar7 = (long)puVar15 - (long)puVar14 >> 2;
            if ((long)puVar15 - (long)puVar14 == 0) {
              uVar7 = 1;
            }
            if (uVar7 >> 0x3d != 0) {
              func_0x00017514();
              goto code_r0x00675758;
            }
            puVar5 = (undefined8 *)__Znwm(uVar7 << 3);
            uVar12 = uVar7 + 3 >> 2;
            puVar13 = puVar5 + uVar12;
            uVar9 = (long)puVar10 - (long)puVar14;
            puVar10 = puVar13;
            if (uVar9 != 0) {
              puVar10 = (undefined8 *)((long)puVar13 + (uVar9 & 0xfffffffffffffff8));
              puVar15 = puVar13;
              puVar3 = puVar14;
              if ((0x37 < uVar9 - 8) && (0x3f < (long)puVar5 + (uVar12 * 8 - (long)puVar14))) {
                uVar9 = (uVar9 - 8 >> 3) + 1;
                uVar11 = uVar9 & 0x3ffffffffffffff8;
                puVar15 = puVar5 + uVar12 + 4;
                puVar3 = puVar14 + 4;
                uVar12 = uVar11;
                do {
                  uVar16 = puVar3[-4];
                  uVar19 = puVar3[-1];
                  uVar18 = puVar3[-2];
                  uVar21 = puVar3[1];
                  uVar20 = *puVar3;
                  uVar23 = puVar3[3];
                  uVar22 = puVar3[2];
                  puVar15[-3] = puVar3[-3];
                  puVar15[-4] = uVar16;
                  puVar15[-1] = uVar19;
                  puVar15[-2] = uVar18;
                  puVar15[1] = uVar21;
                  *puVar15 = uVar20;
                  puVar15[3] = uVar23;
                  puVar15[2] = uVar22;
                  uVar12 = uVar12 - 8;
                  puVar15 = puVar15 + 8;
                  puVar3 = puVar3 + 8;
                } while (uVar12 != 0);
                puVar15 = puVar13 + uVar11;
                puVar3 = puVar14 + uVar11;
                if (uVar9 == uVar11) goto code_r0x0067560c;
              }
              do {
                puVar8 = puVar15 + 1;
                *puVar15 = *puVar3;
                puVar15 = puVar8;
                puVar3 = puVar3 + 1;
              } while (puVar8 != puVar10);
            }
code_r0x0067560c:
            puVar15 = puVar5 + uVar7;
            __ZdlPv(puVar14);
            puVar14 = puVar13;
          }
        }
        puVar17 = puVar17 + -1;
        puVar14 = puVar14 + -1;
        *puVar14 = *puVar17;
      } while (puVar17 != (undefined8 *)unaff_x19[1]);
      goto code_r0x006754a4;
    }
  }
  puVar5 = puVar3;
code_r0x006754a4:
  lVar6 = *unaff_x19;
  *unaff_x19 = (long)puVar5;
  unaff_x19[1] = (long)puVar14;
  unaff_x19[2] = (long)puVar10;
  unaff_x19[3] = (long)puVar15;
  if (lVar6 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

