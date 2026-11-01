
void FUN_00063740(long param_1,undefined8 param_2,undefined8 param_3,uint *param_4)

{
  ulong uVar1;
  int *piVar2;
  uint uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  uint *puVar9;
  ulong uVar10;
  uint *puVar11;
  ulong uVar12;
  uint *puVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  uint *puVar19;
  long lVar20;
  long lVar21;
  undefined8 *puVar22;
  ulong uVar23;
  int *piVar24;
  undefined4 *unaff_x19;
  uint *puVar25;
  uint *puVar26;
  long lVar27;
  uint *puVar28;
  long lVar29;
  long unaff_x29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined1 auVar36 [16];
  long in_stack_00000008;
  undefined1 uStack0000000000000024;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000038;
  
  for (; param_1 != 0x9c0; param_1 = param_1 + 4) {
    if (*(int *)((long)unaff_x19 + param_1) != 0) goto code_r0x00063750;
  }
  *unaff_x19 = 0x80000000;
code_r0x00063750:
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  __ZNSt3__113random_deviceD1Ev(&uStack0000000000000024);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  uVar5 = ___stack_chk_fail();
  if (in_stack_00000008 != 0) {
    __ZdlPv();
    __ZNSt3__113random_deviceD1Ev(&uStack0000000000000024);
    uVar5 = __Unwind_Resume(uVar5);
    if (in_stack_00000038._7_1_ < '\0') {
      __ZdlPv(in_stack_00000028);
    }
    uVar5 = __Unwind_Resume(uVar5);
  }
  __ZNSt3__113random_deviceD1Ev(&uStack0000000000000024);
  auVar36 = __Unwind_Resume(uVar5);
  puVar25 = auVar36._8_8_;
  puVar6 = auVar36._0_8_;
  if (puVar25 != param_4) {
    puVar9 = param_4;
    puVar13 = (uint *)puVar6[1];
    do {
      uVar3 = *puVar25;
      if (puVar13 < (uint *)puVar6[2]) {
        puVar28 = puVar13 + 1;
        *puVar13 = uVar3;
      }
      else {
        puVar26 = (uint *)*puVar6;
        lVar27 = (long)puVar13 - (long)puVar26;
        lVar29 = lVar27 >> 2;
        uVar12 = lVar29 + 1;
        if (uVar12 >> 0x3e != 0) {
          func_0x00017f90(puVar6);
LAB_000639d8:
          auVar36 = func_0x00017514();
          puVar25 = auVar36._8_8_;
          if (puVar25 != puVar9) {
            uVar12 = (long)puVar9 - (long)puVar25;
            if (0 < (long)uVar12) {
              _memset(puVar25,0x8b,((uVar12 >> 2) - (ulong)(3 < uVar12)) * 4 + 4);
            }
            uVar17 = (long)uVar12 >> 2;
            piVar24 = (int *)*auVar36._0_8_;
            piVar2 = (int *)auVar36._0_8_[1];
            uVar15 = (long)piVar2 - (long)piVar24;
            uVar23 = (long)uVar15 >> 2;
            uVar10 = uVar17 - 1;
            uVar14 = 3;
            if (uVar12 < 0x19) {
              uVar14 = uVar10 >> 1;
            }
            uVar1 = 5;
            if (uVar12 < 0x99) {
              uVar1 = uVar14;
            }
            uVar14 = 7;
            if (uVar12 < 0x10d) {
              uVar14 = uVar1;
            }
            uVar1 = 0xb;
            if (uVar12 < 0x9b9) {
              uVar1 = uVar14;
            }
            uVar8 = uVar17 - uVar1 >> 1;
            uVar1 = uVar8 + uVar1;
            uVar12 = uVar23 + 1;
            uVar14 = uVar17;
            if (uVar17 < uVar12) {
              uVar14 = uVar23 + 1;
            }
            uVar3 = *puVar25 ^ puVar25[uVar10] ^ puVar25[uVar8];
            iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
            puVar25[uVar8] = iVar4 + puVar25[uVar8];
            uVar3 = iVar4 + (int)(uVar15 >> 2);
            puVar25[uVar1] = uVar3 + puVar25[uVar1];
            *puVar25 = uVar3;
            uVar15 = 0;
            if (uVar17 != 0) {
              uVar15 = uVar8 / uVar17;
            }
            lVar27 = uVar8 - uVar15 * uVar17;
            uVar15 = 0;
            if (uVar17 != 0) {
              uVar15 = uVar1 / uVar17;
            }
            lVar29 = uVar1 - uVar15 * uVar17;
            if (piVar2 == piVar24) {
              lVar21 = 0;
            }
            else {
              uVar15 = uVar12;
              if (uVar12 < 3) {
                uVar15 = 2;
              }
              lVar7 = uVar15 - 1;
              uVar15 = uVar10;
              lVar16 = lVar27;
              lVar18 = lVar29;
              lVar20 = 0;
              do {
                lVar21 = 0;
                if (lVar20 + 1U != uVar17) {
                  lVar21 = lVar20 + 1;
                }
                uVar10 = 0;
                if (uVar15 + 1 != uVar17) {
                  uVar10 = uVar15 + 1;
                }
                lVar27 = 0;
                if (lVar16 + 1U != uVar17) {
                  lVar27 = lVar16 + 1;
                }
                uVar3 = puVar25[lVar21] ^ puVar25[uVar10] ^ puVar25[lVar27];
                iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
                puVar25[lVar27] = iVar4 + puVar25[lVar27];
                lVar29 = 0;
                if (lVar18 + 1U != uVar17) {
                  lVar29 = lVar18 + 1;
                }
                uVar3 = *piVar24 + (int)lVar21 + iVar4;
                puVar25[lVar29] = uVar3 + puVar25[lVar29];
                puVar25[lVar21] = uVar3;
                lVar7 = lVar7 + -1;
                uVar15 = uVar10;
                lVar16 = lVar27;
                lVar18 = lVar29;
                lVar20 = lVar21;
                piVar24 = piVar24 + 1;
              } while (lVar7 != 0);
            }
            if (uVar12 < uVar17) {
              lVar7 = ~uVar23 + uVar14;
              uVar12 = uVar10;
              lVar16 = lVar27;
              lVar18 = lVar29;
              lVar20 = lVar21;
              do {
                lVar21 = 0;
                if (lVar20 + 1U != uVar17) {
                  lVar21 = lVar20 + 1;
                }
                uVar10 = 0;
                if (uVar12 + 1 != uVar17) {
                  uVar10 = uVar12 + 1;
                }
                lVar27 = 0;
                if (lVar16 + 1U != uVar17) {
                  lVar27 = lVar16 + 1;
                }
                lVar29 = 0;
                if (lVar18 + 1U != uVar17) {
                  lVar29 = lVar18 + 1;
                }
                uVar3 = puVar25[lVar21] ^ puVar25[uVar10] ^ puVar25[lVar27];
                iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
                puVar25[lVar27] = iVar4 + puVar25[lVar27];
                uVar3 = iVar4 + (int)lVar21;
                puVar25[lVar29] = uVar3 + puVar25[lVar29];
                puVar25[lVar21] = uVar3;
                lVar7 = lVar7 + -1;
                uVar12 = uVar10;
                lVar16 = lVar27;
                lVar18 = lVar29;
                lVar20 = lVar21;
              } while (lVar7 != 0);
            }
            if (uVar14 < uVar14 + uVar17) {
              uVar12 = uVar17;
              do {
                lVar7 = 0;
                if (lVar21 + 1U != uVar17) {
                  lVar7 = lVar21 + 1;
                }
                uVar14 = 0;
                if (uVar10 + 1 != uVar17) {
                  uVar14 = uVar10 + 1;
                }
                lVar16 = 0;
                if (lVar27 + 1U != uVar17) {
                  lVar16 = lVar27 + 1;
                }
                lVar18 = 0;
                if (lVar29 + 1U != uVar17) {
                  lVar18 = lVar29 + 1;
                }
                uVar3 = puVar25[lVar16] + puVar25[lVar7] + puVar25[uVar14];
                uVar3 = (uVar3 ^ uVar3 >> 0x1b) * 0x5d588b65;
                puVar25[lVar16] = uVar3 ^ puVar25[lVar16];
                uVar3 = uVar3 - (int)lVar7;
                puVar25[lVar18] = uVar3 ^ puVar25[lVar18];
                puVar25[lVar7] = uVar3;
                uVar12 = uVar12 - 1;
                uVar10 = uVar14;
                lVar27 = lVar16;
                lVar29 = lVar18;
                lVar21 = lVar7;
              } while (uVar12 != 0);
            }
          }
          return;
        }
        uVar10 = (long)puVar6[2] - (long)puVar26;
        uVar14 = (long)uVar10 >> 1;
        if (uVar14 <= uVar12) {
          uVar14 = uVar12;
        }
        if (0x7ffffffffffffffb < uVar10) {
          uVar14 = 0x3fffffffffffffff;
        }
        if (uVar14 == 0) {
          lVar7 = 0;
          puVar11 = (uint *)(lVar29 * 4);
          *puVar11 = uVar3;
        }
        else {
          if (uVar14 >> 0x3e != 0) goto LAB_000639d8;
          lVar7 = __Znwm(uVar14 << 2);
          puVar11 = (uint *)(lVar7 + lVar29 * 4);
          *puVar11 = uVar3;
        }
        puVar28 = puVar11 + 1;
        if (puVar13 != puVar26) {
          puVar19 = puVar13 + -1;
          uVar12 = (long)puVar19 - (long)puVar26;
          if (uVar12 < 0xbc) {
          }
          else {
            uVar10 = (lVar7 + lVar27) - 4;
            if ((uVar10 - (uVar12 & 0xfffffffffffffffc) <= uVar10) &&
               ((uint *)((long)puVar19 - (uVar12 & 0xfffffffffffffffc)) <= puVar19)) {
              if ((ulong)((long)puVar19 + (-lVar27 - lVar7) + 4) < 0x40) {
              }
              else {
                uVar12 = (uVar12 >> 2) + 1;
                uVar17 = uVar12 & 0x7ffffffffffffff0;
                puVar11 = puVar11 + -uVar17;
                puVar19 = puVar13 + -8;
                puVar22 = (undefined8 *)(lVar7 + lVar29 * 4 + -0x20);
                uVar10 = uVar17;
                do {
                  uVar31 = *(undefined8 *)puVar19;
                  uVar30 = *(undefined8 *)(puVar19 + 6);
                  uVar5 = *(undefined8 *)(puVar19 + 4);
                  uVar35 = *(undefined8 *)(puVar19 + -6);
                  uVar34 = *(undefined8 *)(puVar19 + -8);
                  uVar33 = *(undefined8 *)(puVar19 + -2);
                  uVar32 = *(undefined8 *)(puVar19 + -4);
                  puVar22[1] = *(undefined8 *)(puVar19 + 2);
                  *puVar22 = uVar31;
                  puVar22[3] = uVar30;
                  puVar22[2] = uVar5;
                  puVar22[-3] = uVar35;
                  puVar22[-4] = uVar34;
                  puVar22[-1] = uVar33;
                  puVar22[-2] = uVar32;
                  puVar19 = puVar19 + -0x10;
                  puVar22 = puVar22 + -8;
                  uVar10 = uVar10 - 0x10;
                } while (uVar10 != 0);
                puVar13 = puVar13 + -uVar17;
                if (uVar12 == uVar17) goto LAB_00063998;
              }
            }
          }
          do {
            puVar13 = puVar13 + -1;
            puVar11 = puVar11 + -1;
            *puVar11 = *puVar13;
          } while (puVar13 != puVar26);
        }
LAB_00063998:
        *puVar6 = puVar11;
        puVar6[1] = puVar28;
        puVar6[2] = lVar7 + uVar14 * 4;
        if (puVar26 != (uint *)0x0) {
          __ZdlPv(puVar26);
        }
      }
      puVar6[1] = puVar28;
      puVar25 = puVar25 + 1;
      puVar13 = puVar28;
    } while (puVar25 != param_4);
  }
  return;
}

