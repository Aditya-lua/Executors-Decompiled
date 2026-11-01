
void FUN_006752a8(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long *unaff_x19;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  undefined8 *unaff_x24;
  undefined8 *puVar13;
  ulong uVar14;
  long lVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  puVar13 = (undefined8 *)unaff_x19[1];
  lVar15 = (long)unaff_x24 - (long)puVar13;
  uVar14 = lVar15 >> 3;
  lVar4 = (long)param_1 - *unaff_x19;
  if (uVar14 < (ulong)(lVar4 >> 3)) {
    if (param_1 != unaff_x24) {
      __Znwm(0xff0);
      func_0x00035e80();
      return;
    }
    __Znwm(0xff0);
    func_0x0003600c();
    puVar3 = (undefined8 *)unaff_x19[1];
    puVar13 = (undefined8 *)unaff_x19[2];
    puVar9 = puVar3 + 1;
    uVar11 = *puVar3;
    unaff_x19[1] = (long)puVar9;
    if (puVar13 != (undefined8 *)unaff_x19[3]) goto code_r0x006756a8;
    puVar10 = (undefined8 *)*unaff_x19;
    if (puVar10 <= puVar9 && (long)puVar9 - (long)puVar10 != 0) {
      lVar15 = (long)puVar9 - (long)puVar10 >> 3;
      lVar4 = lVar15 + 2;
      if (-2 < lVar15) {
        lVar4 = lVar15 + 1;
      }
      puVar3 = puVar9 + -(lVar4 >> 1);
      lVar15 = (long)puVar13 - (long)puVar9;
      if (lVar15 != 0) {
        _memmove(puVar3,puVar9,lVar15);
        puVar9 = (undefined8 *)unaff_x19[1];
      }
      puVar13 = (undefined8 *)((long)puVar3 + lVar15);
      unaff_x19[1] = (long)(puVar9 + -(lVar4 >> 1));
      unaff_x19[2] = (long)puVar13;
      goto code_r0x006756a8;
    }
    uVar14 = (long)puVar13 - (long)puVar10 >> 2;
    if ((long)puVar13 - (long)puVar10 == 0) {
      uVar14 = 1;
    }
    if (uVar14 >> 0x3d != 0) goto LAB_00675750;
    lVar4 = __Znwm(uVar14 * 8);
    puVar12 = (undefined8 *)(lVar4 + (uVar14 >> 2) * 8);
    uVar5 = (long)puVar13 - (long)puVar9;
    puVar13 = puVar12;
    if (uVar5 != 0) {
      puVar13 = (undefined8 *)((long)puVar12 + (uVar5 & 0xfffffffffffffff8));
      if (uVar5 - 8 < 0x38) {
        puVar2 = puVar12;
      }
      else {
        lVar15 = (uVar14 >> 2) * 8 + lVar4;
        puVar2 = puVar12;
        if (0x3f < (ulong)(lVar15 - (long)puVar9)) {
          uVar5 = (uVar5 - 8 >> 3) + 1;
          uVar7 = uVar5 & 0x3ffffffffffffff8;
          puVar2 = puVar12 + uVar7;
          puVar9 = puVar9 + uVar7;
          puVar8 = (undefined8 *)(lVar15 + 0x20);
          puVar3 = puVar3 + 5;
          uVar6 = uVar7;
          do {
            uVar16 = puVar3[-4];
            uVar18 = puVar3[-1];
            uVar17 = puVar3[-2];
            uVar20 = puVar3[1];
            uVar19 = *puVar3;
            uVar22 = puVar3[3];
            uVar21 = puVar3[2];
            puVar8[-3] = puVar3[-3];
            puVar8[-4] = uVar16;
            puVar8[-1] = uVar18;
            puVar8[-2] = uVar17;
            puVar8[1] = uVar20;
            *puVar8 = uVar19;
            puVar8[3] = uVar22;
            puVar8[2] = uVar21;
            uVar6 = uVar6 - 8;
            puVar8 = puVar8 + 8;
            puVar3 = puVar3 + 8;
          } while (uVar6 != 0);
          if (uVar5 == uVar7) goto code_r0x00675690;
        }
      }
      do {
        puVar3 = puVar2 + 1;
        *puVar2 = *puVar9;
        puVar2 = puVar3;
        puVar9 = puVar9 + 1;
      } while (puVar3 != puVar13);
    }
code_r0x00675690:
    *unaff_x19 = lVar4;
    unaff_x19[1] = (long)puVar12;
    unaff_x19[2] = (long)puVar13;
    unaff_x19[3] = lVar4 + uVar14 * 8;
    if (puVar10 != (undefined8 *)0x0) {
      __ZdlPv(puVar10);
      puVar13 = (undefined8 *)unaff_x19[2];
    }
code_r0x006756a8:
    *puVar13 = uVar11;
    unaff_x19[2] = unaff_x19[2] + 8;
    return;
  }
  uVar5 = lVar4 >> 2;
  if (param_1 == (undefined8 *)*unaff_x19) {
    uVar5 = 1;
  }
  if (uVar5 >> 0x3d != 0) {
LAB_00675750:
    func_0x00017514();
LAB_00675754:
    func_0x00017514();
code_r0x00675758:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x67575c);
    (*pcVar1)();
  }
  puVar10 = (undefined8 *)__Znwm(uVar5 * 8);
  uVar11 = __Znwm(0xff0);
  puVar9 = puVar10 + uVar14;
  puVar3 = puVar10 + uVar5;
  if (uVar14 == uVar5) {
    if (0 < lVar15) {
      uVar5 = uVar14 + 2;
      if (-2 < (long)uVar14) {
        uVar5 = uVar14 + 1;
      }
      puVar9 = puVar9 + -(uVar5 >> 1);
      *puVar9 = uVar11;
      goto joined_r0x00675364;
    }
    uVar14 = lVar15 >> 2;
    if (unaff_x24 == puVar13) {
      uVar14 = 1;
    }
    if (uVar14 >> 0x3d != 0) goto LAB_00675754;
    puVar2 = (undefined8 *)__Znwm(uVar14 << 3);
    puVar9 = puVar2 + (uVar14 >> 2);
    puVar3 = puVar2 + uVar14;
    __ZdlPv(puVar10);
    puVar13 = (undefined8 *)unaff_x19[1];
    unaff_x24 = (undefined8 *)unaff_x19[2];
    puVar12 = puVar9 + 1;
    *puVar9 = uVar11;
    puVar10 = puVar2;
    if (unaff_x24 != puVar13) goto LAB_006754f0;
  }
  else {
    *puVar9 = uVar11;
joined_r0x00675364:
    puVar12 = puVar9 + 1;
    puVar2 = puVar10;
    if (unaff_x24 != puVar13) {
LAB_006754f0:
      do {
        if (puVar9 == puVar2) {
          if (puVar12 < puVar3) {
            lVar4 = (long)puVar3 - (long)puVar12 >> 3;
            uVar14 = lVar4 + 2;
            if (-2 < lVar4) {
              uVar14 = lVar4 + 1;
            }
            puVar13 = puVar12 + (uVar14 >> 1);
            puVar10 = (undefined8 *)((long)puVar13 - ((long)puVar12 - (long)puVar9));
            puVar2 = puVar9;
            if ((long)puVar12 - (long)puVar9 == 0) {
              puVar9 = puVar10;
              puVar12 = puVar13;
            }
            else {
              _memmove(puVar10,puVar9,(long)puVar12 - (long)puVar9);
              puVar9 = puVar10;
              puVar12 = puVar13;
            }
          }
          else {
            uVar14 = (long)puVar3 - (long)puVar9 >> 2;
            if ((long)puVar3 - (long)puVar9 == 0) {
              uVar14 = 1;
            }
            if (uVar14 >> 0x3d != 0) {
              func_0x00017514();
              goto code_r0x00675758;
            }
            puVar2 = (undefined8 *)__Znwm(uVar14 << 3);
            uVar6 = uVar14 + 3 >> 2;
            puVar13 = puVar2 + uVar6;
            uVar5 = (long)puVar12 - (long)puVar9;
            puVar12 = puVar13;
            if (uVar5 != 0) {
              puVar12 = (undefined8 *)((long)puVar13 + (uVar5 & 0xfffffffffffffff8));
              puVar3 = puVar13;
              puVar10 = puVar9;
              if ((0x37 < uVar5 - 8) && (0x3f < (long)puVar2 + (uVar6 * 8 - (long)puVar9))) {
                uVar5 = (uVar5 - 8 >> 3) + 1;
                uVar7 = uVar5 & 0x3ffffffffffffff8;
                puVar3 = puVar2 + uVar6 + 4;
                puVar10 = puVar9 + 4;
                uVar6 = uVar7;
                do {
                  uVar11 = puVar10[-4];
                  uVar17 = puVar10[-1];
                  uVar16 = puVar10[-2];
                  uVar19 = puVar10[1];
                  uVar18 = *puVar10;
                  uVar21 = puVar10[3];
                  uVar20 = puVar10[2];
                  puVar3[-3] = puVar10[-3];
                  puVar3[-4] = uVar11;
                  puVar3[-1] = uVar17;
                  puVar3[-2] = uVar16;
                  puVar3[1] = uVar19;
                  *puVar3 = uVar18;
                  puVar3[3] = uVar21;
                  puVar3[2] = uVar20;
                  uVar6 = uVar6 - 8;
                  puVar3 = puVar3 + 8;
                  puVar10 = puVar10 + 8;
                } while (uVar6 != 0);
                puVar3 = puVar13 + uVar7;
                puVar10 = puVar9 + uVar7;
                if (uVar5 == uVar7) goto code_r0x0067560c;
              }
              do {
                puVar8 = puVar3 + 1;
                *puVar3 = *puVar10;
                puVar3 = puVar8;
                puVar10 = puVar10 + 1;
              } while (puVar8 != puVar12);
            }
code_r0x0067560c:
            puVar3 = puVar2 + uVar14;
            __ZdlPv(puVar9);
            puVar9 = puVar13;
          }
        }
        unaff_x24 = unaff_x24 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *unaff_x24;
      } while (unaff_x24 != (undefined8 *)unaff_x19[1]);
      goto code_r0x006754a4;
    }
  }
  puVar2 = puVar10;
code_r0x006754a4:
  lVar4 = *unaff_x19;
  *unaff_x19 = (long)puVar2;
  unaff_x19[1] = (long)puVar9;
  unaff_x19[2] = (long)puVar12;
  unaff_x19[3] = (long)puVar3;
  if (lVar4 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

