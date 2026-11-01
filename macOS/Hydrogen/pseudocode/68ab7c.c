
void FUN_0068ab7c(void)

{
  long lVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uStack_68;
  
  __ZdlPv();
  __Unwind_Resume();
  plVar3 = (long *)func_0x0001753c();
  if (0x3ff < (ulong)plVar3[4]) {
    plVar3[4] = plVar3[4] - 0x400;
    puVar14 = (undefined8 *)plVar3[1];
    puVar18 = (undefined8 *)plVar3[2];
    puVar15 = puVar14 + 1;
    uVar17 = *puVar14;
    plVar3[1] = (long)puVar15;
    if (puVar18 != (undefined8 *)plVar3[3]) goto LAB_0068b034;
    puVar16 = (undefined8 *)*plVar3;
    lVar7 = (long)puVar15 - (long)puVar16;
    if (puVar16 <= puVar15 && lVar7 != 0) {
code_r0x0068abe8:
      lVar7 = lVar7 >> 3;
      lVar5 = lVar7 + 2;
      if (-2 < lVar7) {
        lVar5 = lVar7 + 1;
      }
      puVar14 = puVar15 + -(lVar5 >> 1);
      lVar7 = (long)puVar18 - (long)puVar15;
      if (lVar7 != 0) {
        _memmove(puVar14,puVar15,lVar7);
        puVar15 = (undefined8 *)plVar3[1];
      }
      puVar18 = (undefined8 *)((long)puVar14 + lVar7);
      plVar3[1] = (long)(puVar15 + -(lVar5 >> 1));
      plVar3[2] = (long)puVar18;
      goto LAB_0068b034;
    }
    uVar8 = (long)puVar18 - (long)puVar16 >> 2;
    if ((long)puVar18 - (long)puVar16 == 0) {
      uVar8 = 1;
    }
    if (uVar8 >> 0x3d != 0) goto code_r0x0068b0dc;
    lVar5 = __Znwm(uVar8 * 8);
    puVar4 = (undefined8 *)(lVar5 + (uVar8 >> 2) * 8);
    lVar7 = lVar5 + uVar8 * 8;
    uVar10 = (long)puVar18 - (long)puVar15;
    puVar18 = puVar4;
    if (uVar10 != 0) {
      puVar18 = (undefined8 *)((long)puVar4 + (uVar10 & 0xfffffffffffffff8));
      if (uVar10 - 8 < 0x38) {
        puVar11 = puVar4;
      }
      else {
        lVar1 = (uVar8 >> 2) * 8 + lVar5;
        puVar11 = puVar4;
        if (0x3f < (ulong)(lVar1 - (long)puVar15)) {
          uVar8 = (uVar10 - 8 >> 3) + 1;
          uVar13 = uVar8 & 0x3ffffffffffffff8;
          puVar11 = puVar4 + uVar13;
          puVar15 = puVar15 + uVar13;
          puVar6 = (undefined8 *)(lVar1 + 0x20);
          puVar14 = puVar14 + 5;
          uVar10 = uVar13;
          do {
            uVar19 = puVar14[-4];
            uVar21 = puVar14[-1];
            uVar20 = puVar14[-2];
            uVar23 = puVar14[1];
            uVar22 = *puVar14;
            uVar25 = puVar14[3];
            uVar24 = puVar14[2];
            puVar6[-3] = puVar14[-3];
            puVar6[-4] = uVar19;
            puVar6[-1] = uVar21;
            puVar6[-2] = uVar20;
            puVar6[1] = uVar23;
            *puVar6 = uVar22;
            puVar6[3] = uVar25;
            puVar6[2] = uVar24;
            uVar10 = uVar10 - 8;
            puVar6 = puVar6 + 8;
            puVar14 = puVar14 + 8;
          } while (uVar10 != 0);
          if (uVar8 == uVar13) goto code_r0x0068b01c;
        }
      }
      do {
        puVar14 = puVar11 + 1;
        *puVar11 = *puVar15;
        puVar11 = puVar14;
        puVar15 = puVar15 + 1;
      } while (puVar14 != puVar18);
    }
code_r0x0068b01c:
    *plVar3 = lVar5;
    plVar3[1] = (long)puVar4;
    plVar3[2] = (long)puVar18;
    plVar3[3] = lVar7;
    if (puVar16 != (undefined8 *)0x0) {
      __ZdlPv(puVar16);
      puVar18 = (undefined8 *)plVar3[2];
    }
LAB_0068b034:
    *puVar18 = uVar17;
    plVar3[2] = plVar3[2] + 8;
    return;
  }
  puVar18 = (undefined8 *)plVar3[2];
  puVar15 = (undefined8 *)plVar3[3];
  puVar14 = (undefined8 *)plVar3[1];
  lVar5 = (long)puVar18 - (long)puVar14;
  uVar8 = lVar5 >> 3;
  lVar7 = (long)puVar15 - *plVar3;
  if (uVar8 < (ulong)(lVar7 >> 3)) {
    if (puVar15 != puVar18) {
      uStack_68 = __Znwm(0x1000);
      func_0x00035e80(plVar3,&uStack_68);
      return;
    }
    uStack_68 = __Znwm(0x1000);
    func_0x0003600c(plVar3,&uStack_68);
    puVar14 = (undefined8 *)plVar3[1];
    puVar18 = (undefined8 *)plVar3[2];
    puVar15 = puVar14 + 1;
    uVar17 = *puVar14;
    plVar3[1] = (long)puVar15;
    if (puVar18 != (undefined8 *)plVar3[3]) goto LAB_0068b034;
    puVar16 = (undefined8 *)*plVar3;
    lVar7 = (long)puVar15 - (long)puVar16;
    if (puVar16 <= puVar15 && lVar7 != 0) goto code_r0x0068abe8;
    uVar8 = (long)puVar18 - (long)puVar16 >> 2;
    if ((long)puVar18 - (long)puVar16 == 0) {
      uVar8 = 1;
    }
    if (uVar8 >> 0x3d != 0) goto code_r0x0068b0dc;
    lVar5 = __Znwm(uVar8 * 8);
    puVar4 = (undefined8 *)(lVar5 + (uVar8 >> 2) * 8);
    lVar7 = lVar5 + uVar8 * 8;
    uVar10 = (long)puVar18 - (long)puVar15;
    puVar18 = puVar4;
    if (uVar10 != 0) {
      puVar18 = (undefined8 *)((long)puVar4 + (uVar10 & 0xfffffffffffffff8));
      if (uVar10 - 8 < 0x38) {
        puVar11 = puVar4;
      }
      else {
        lVar1 = (uVar8 >> 2) * 8 + lVar5;
        puVar11 = puVar4;
        if (0x3f < (ulong)(lVar1 - (long)puVar15)) {
          uVar8 = (uVar10 - 8 >> 3) + 1;
          uVar13 = uVar8 & 0x3ffffffffffffff8;
          puVar11 = puVar4 + uVar13;
          puVar15 = puVar15 + uVar13;
          puVar6 = (undefined8 *)(lVar1 + 0x20);
          puVar14 = puVar14 + 5;
          uVar10 = uVar13;
          do {
            uVar19 = puVar14[-4];
            uVar21 = puVar14[-1];
            uVar20 = puVar14[-2];
            uVar23 = puVar14[1];
            uVar22 = *puVar14;
            uVar25 = puVar14[3];
            uVar24 = puVar14[2];
            puVar6[-3] = puVar14[-3];
            puVar6[-4] = uVar19;
            puVar6[-1] = uVar21;
            puVar6[-2] = uVar20;
            puVar6[1] = uVar23;
            *puVar6 = uVar22;
            puVar6[3] = uVar25;
            puVar6[2] = uVar24;
            uVar10 = uVar10 - 8;
            puVar6 = puVar6 + 8;
            puVar14 = puVar14 + 8;
          } while (uVar10 != 0);
          if (uVar8 == uVar13) goto code_r0x0068b01c;
        }
      }
      do {
        puVar14 = puVar11 + 1;
        *puVar11 = *puVar15;
        puVar11 = puVar14;
        puVar15 = puVar15 + 1;
      } while (puVar14 != puVar18);
    }
    goto code_r0x0068b01c;
  }
  uVar10 = lVar7 >> 2;
  if (puVar15 == (undefined8 *)*plVar3) {
    uVar10 = 1;
  }
  if (uVar10 >> 0x3d != 0) {
code_r0x0068b0dc:
    func_0x00017514();
code_r0x0068b0e0:
    func_0x00017514();
code_r0x0068b0e4:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x68b0e8);
    (*pcVar2)();
  }
  puVar4 = (undefined8 *)__Znwm(uVar10 * 8);
  uVar17 = __Znwm(0x1000);
  puVar15 = puVar4 + uVar8;
  puVar16 = puVar4 + uVar10;
  if (uVar8 == uVar10) {
    if (0 < lVar5) {
      uVar10 = uVar8 + 2;
      if (-2 < (long)uVar8) {
        uVar10 = uVar8 + 1;
      }
      puVar15 = puVar15 + -(uVar10 >> 1);
      *puVar15 = uVar17;
      goto joined_r0x0068acf0;
    }
    uVar8 = lVar5 >> 2;
    if (puVar18 == puVar14) {
      uVar8 = 1;
    }
    if (uVar8 >> 0x3d != 0) goto code_r0x0068b0e0;
    puVar6 = (undefined8 *)__Znwm(uVar8 << 3);
    puVar15 = puVar6 + (uVar8 >> 2);
    puVar16 = puVar6 + uVar8;
    __ZdlPv(puVar4);
    puVar14 = (undefined8 *)plVar3[1];
    puVar18 = (undefined8 *)plVar3[2];
    puVar11 = puVar15 + 1;
    *puVar15 = uVar17;
    puVar4 = puVar6;
    if (puVar18 != puVar14) goto code_r0x0068ae7c;
  }
  else {
    *puVar15 = uVar17;
joined_r0x0068acf0:
    puVar11 = puVar15 + 1;
    puVar6 = puVar4;
    if (puVar18 != puVar14) {
code_r0x0068ae7c:
      do {
        if (puVar15 == puVar6) {
          if (puVar11 < puVar16) {
            lVar7 = (long)puVar16 - (long)puVar11 >> 3;
            uVar8 = lVar7 + 2;
            if (-2 < lVar7) {
              uVar8 = lVar7 + 1;
            }
            puVar14 = puVar11 + (uVar8 >> 1);
            puVar4 = (undefined8 *)((long)puVar14 - ((long)puVar11 - (long)puVar15));
            puVar6 = puVar15;
            if ((long)puVar11 - (long)puVar15 == 0) {
              puVar15 = puVar4;
              puVar11 = puVar14;
            }
            else {
              _memmove(puVar4,puVar15,(long)puVar11 - (long)puVar15);
              puVar15 = puVar4;
              puVar11 = puVar14;
            }
          }
          else {
            uVar8 = (long)puVar16 - (long)puVar15 >> 2;
            if ((long)puVar16 - (long)puVar15 == 0) {
              uVar8 = 1;
            }
            if (uVar8 >> 0x3d != 0) {
              func_0x00017514();
              goto code_r0x0068b0e4;
            }
            puVar6 = (undefined8 *)__Znwm(uVar8 << 3);
            uVar13 = uVar8 + 3 >> 2;
            puVar14 = puVar6 + uVar13;
            uVar10 = (long)puVar11 - (long)puVar15;
            puVar11 = puVar14;
            if (uVar10 != 0) {
              puVar11 = (undefined8 *)((long)puVar14 + (uVar10 & 0xfffffffffffffff8));
              puVar16 = puVar14;
              puVar4 = puVar15;
              if ((0x37 < uVar10 - 8) && (0x3f < (long)puVar6 + (uVar13 * 8 - (long)puVar15))) {
                uVar10 = (uVar10 - 8 >> 3) + 1;
                uVar12 = uVar10 & 0x3ffffffffffffff8;
                puVar16 = puVar6 + uVar13 + 4;
                puVar4 = puVar15 + 4;
                uVar13 = uVar12;
                do {
                  uVar17 = puVar4[-4];
                  uVar20 = puVar4[-1];
                  uVar19 = puVar4[-2];
                  uVar22 = puVar4[1];
                  uVar21 = *puVar4;
                  uVar24 = puVar4[3];
                  uVar23 = puVar4[2];
                  puVar16[-3] = puVar4[-3];
                  puVar16[-4] = uVar17;
                  puVar16[-1] = uVar20;
                  puVar16[-2] = uVar19;
                  puVar16[1] = uVar22;
                  *puVar16 = uVar21;
                  puVar16[3] = uVar24;
                  puVar16[2] = uVar23;
                  uVar13 = uVar13 - 8;
                  puVar16 = puVar16 + 8;
                  puVar4 = puVar4 + 8;
                } while (uVar13 != 0);
                puVar16 = puVar14 + uVar12;
                puVar4 = puVar15 + uVar12;
                if (uVar10 == uVar12) goto code_r0x0068af98;
              }
              do {
                puVar9 = puVar16 + 1;
                *puVar16 = *puVar4;
                puVar16 = puVar9;
                puVar4 = puVar4 + 1;
              } while (puVar9 != puVar11);
            }
code_r0x0068af98:
            puVar16 = puVar6 + uVar8;
            __ZdlPv(puVar15);
            puVar15 = puVar14;
          }
        }
        puVar18 = puVar18 + -1;
        puVar15 = puVar15 + -1;
        *puVar15 = *puVar18;
      } while (puVar18 != (undefined8 *)plVar3[1]);
      goto code_r0x0068ae30;
    }
  }
  puVar6 = puVar4;
code_r0x0068ae30:
  lVar7 = *plVar3;
  *plVar3 = (long)puVar6;
  plVar3[1] = (long)puVar15;
  plVar3[2] = (long)puVar11;
  plVar3[3] = (long)puVar16;
  if (lVar7 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

