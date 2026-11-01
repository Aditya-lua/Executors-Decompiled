
/* WARNING: Possible PIC construction at 0x00063700: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00063704) */
/* WARNING: Removing unreachable block (ram,0x00063730) */
/* WARNING: Removing unreachable block (ram,0x00063734) */
/* WARNING: Removing unreachable block (ram,0x0006373c) */
/* WARNING: Removing unreachable block (ram,0x00063748) */
/* WARNING: Removing unreachable block (ram,0x00063750) */
/* WARNING: Removing unreachable block (ram,0x00063758) */
/* WARNING: Removing unreachable block (ram,0x00063760) */
/* WARNING: Removing unreachable block (ram,0x00063794) */
/* WARNING: Removing unreachable block (ram,0x0006379c) */
/* WARNING: Removing unreachable block (ram,0x000637a8) */
/* WARNING: Removing unreachable block (ram,0x000637cc) */
/* WARNING: Removing unreachable block (ram,0x000637d4) */
/* WARNING: Removing unreachable block (ram,0x000637e0) */
/* WARNING: Removing unreachable block (ram,0x00063780) */

void FUN_000636c8(void)

{
  ulong uVar1;
  int *piVar2;
  uint uVar3;
  int iVar4;
  uint *puVar5;
  long lVar6;
  ulong uVar7;
  uint *puVar8;
  ulong uVar9;
  uint *puVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  uint *puVar17;
  long lVar18;
  long lVar19;
  undefined8 *puVar20;
  ulong uVar21;
  int *piVar22;
  uint *puVar23;
  long lVar24;
  uint *puVar25;
  long lVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined1 auVar34 [16];
  undefined8 uStack0000000000000008;
  uint *in_stack_00000010;
  uint *in_stack_00000018;
  undefined1 uStack0000000000000024;
  uint uStack0000000000000028;
  undefined4 uStack000000000000002c;
  undefined4 in_stack_00000030;
  undefined4 uStack0000000000000034;
  uint uStack0000000000000038;
  
  uStack000000000000002c = __ZNSt3__113random_deviceclEv();
  in_stack_00000030 = __ZNSt3__113random_deviceclEv(&uStack0000000000000024);
  uStack0000000000000034 = __ZNSt3__113random_deviceclEv(&uStack0000000000000024);
  in_stack_00000010 = (uint *)0x0;
  in_stack_00000018 = (uint *)0x0;
  uStack0000000000000008 = (uint *)0x0;
  puVar23 = &uStack0000000000000028;
  if (puVar23 != &uStack0000000000000038) {
    puVar8 = &uStack0000000000000038;
    do {
      puVar10 = in_stack_00000010;
      puVar5 = uStack0000000000000008;
      uVar3 = *puVar23;
      if (in_stack_00000010 < in_stack_00000018) {
        puVar25 = in_stack_00000010 + 1;
        *in_stack_00000010 = uVar3;
      }
      else {
        lVar24 = (long)in_stack_00000010 - (long)uStack0000000000000008;
        lVar26 = lVar24 >> 2;
        uVar9 = lVar26 + 1;
        if (uVar9 >> 0x3e != 0) {
          func_0x00017f90(&uStack0000000000000008);
code_r0x000639d8:
          auVar34 = func_0x00017514();
          puVar23 = auVar34._8_8_;
          if (puVar23 != puVar8) {
            uVar9 = (long)puVar8 - (long)puVar23;
            if (0 < (long)uVar9) {
              _memset(puVar23,0x8b,((uVar9 >> 2) - (ulong)(3 < uVar9)) * 4 + 4);
            }
            uVar14 = (long)uVar9 >> 2;
            piVar22 = (int *)*auVar34._0_8_;
            piVar2 = (int *)auVar34._0_8_[1];
            uVar12 = (long)piVar2 - (long)piVar22;
            uVar21 = (long)uVar12 >> 2;
            uVar16 = uVar14 - 1;
            uVar11 = 3;
            if (uVar9 < 0x19) {
              uVar11 = uVar16 >> 1;
            }
            uVar1 = 5;
            if (uVar9 < 0x99) {
              uVar1 = uVar11;
            }
            uVar11 = 7;
            if (uVar9 < 0x10d) {
              uVar11 = uVar1;
            }
            uVar1 = 0xb;
            if (uVar9 < 0x9b9) {
              uVar1 = uVar11;
            }
            uVar7 = uVar14 - uVar1 >> 1;
            uVar1 = uVar7 + uVar1;
            uVar9 = uVar21 + 1;
            uVar11 = uVar14;
            if (uVar14 < uVar9) {
              uVar11 = uVar21 + 1;
            }
            uVar3 = *puVar23 ^ puVar23[uVar16] ^ puVar23[uVar7];
            iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
            puVar23[uVar7] = iVar4 + puVar23[uVar7];
            uVar3 = iVar4 + (int)(uVar12 >> 2);
            puVar23[uVar1] = uVar3 + puVar23[uVar1];
            *puVar23 = uVar3;
            uVar12 = 0;
            if (uVar14 != 0) {
              uVar12 = uVar7 / uVar14;
            }
            lVar24 = uVar7 - uVar12 * uVar14;
            uVar12 = 0;
            if (uVar14 != 0) {
              uVar12 = uVar1 / uVar14;
            }
            lVar26 = uVar1 - uVar12 * uVar14;
            if (piVar2 == piVar22) {
              lVar19 = 0;
            }
            else {
              uVar12 = uVar9;
              if (uVar9 < 3) {
                uVar12 = 2;
              }
              lVar6 = uVar12 - 1;
              uVar12 = uVar16;
              lVar13 = lVar24;
              lVar15 = lVar26;
              lVar18 = 0;
              do {
                lVar19 = 0;
                if (lVar18 + 1U != uVar14) {
                  lVar19 = lVar18 + 1;
                }
                uVar16 = 0;
                if (uVar12 + 1 != uVar14) {
                  uVar16 = uVar12 + 1;
                }
                lVar24 = 0;
                if (lVar13 + 1U != uVar14) {
                  lVar24 = lVar13 + 1;
                }
                uVar3 = puVar23[lVar19] ^ puVar23[uVar16] ^ puVar23[lVar24];
                iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
                puVar23[lVar24] = iVar4 + puVar23[lVar24];
                lVar26 = 0;
                if (lVar15 + 1U != uVar14) {
                  lVar26 = lVar15 + 1;
                }
                uVar3 = *piVar22 + (int)lVar19 + iVar4;
                puVar23[lVar26] = uVar3 + puVar23[lVar26];
                puVar23[lVar19] = uVar3;
                lVar6 = lVar6 + -1;
                uVar12 = uVar16;
                lVar13 = lVar24;
                lVar15 = lVar26;
                lVar18 = lVar19;
                piVar22 = piVar22 + 1;
              } while (lVar6 != 0);
            }
            if (uVar9 < uVar14) {
              lVar6 = ~uVar21 + uVar11;
              uVar9 = uVar16;
              lVar13 = lVar24;
              lVar15 = lVar26;
              lVar18 = lVar19;
              do {
                lVar19 = 0;
                if (lVar18 + 1U != uVar14) {
                  lVar19 = lVar18 + 1;
                }
                uVar16 = 0;
                if (uVar9 + 1 != uVar14) {
                  uVar16 = uVar9 + 1;
                }
                lVar24 = 0;
                if (lVar13 + 1U != uVar14) {
                  lVar24 = lVar13 + 1;
                }
                lVar26 = 0;
                if (lVar15 + 1U != uVar14) {
                  lVar26 = lVar15 + 1;
                }
                uVar3 = puVar23[lVar19] ^ puVar23[uVar16] ^ puVar23[lVar24];
                iVar4 = (uVar3 ^ uVar3 >> 0x1b) * 0x19660d;
                puVar23[lVar24] = iVar4 + puVar23[lVar24];
                uVar3 = iVar4 + (int)lVar19;
                puVar23[lVar26] = uVar3 + puVar23[lVar26];
                puVar23[lVar19] = uVar3;
                lVar6 = lVar6 + -1;
                uVar9 = uVar16;
                lVar13 = lVar24;
                lVar15 = lVar26;
                lVar18 = lVar19;
              } while (lVar6 != 0);
            }
            if (uVar11 < uVar11 + uVar14) {
              uVar9 = uVar14;
              do {
                lVar6 = 0;
                if (lVar19 + 1U != uVar14) {
                  lVar6 = lVar19 + 1;
                }
                uVar11 = 0;
                if (uVar16 + 1 != uVar14) {
                  uVar11 = uVar16 + 1;
                }
                lVar13 = 0;
                if (lVar24 + 1U != uVar14) {
                  lVar13 = lVar24 + 1;
                }
                lVar15 = 0;
                if (lVar26 + 1U != uVar14) {
                  lVar15 = lVar26 + 1;
                }
                uVar3 = puVar23[lVar13] + puVar23[lVar6] + puVar23[uVar11];
                uVar3 = (uVar3 ^ uVar3 >> 0x1b) * 0x5d588b65;
                puVar23[lVar13] = uVar3 ^ puVar23[lVar13];
                uVar3 = uVar3 - (int)lVar6;
                puVar23[lVar15] = uVar3 ^ puVar23[lVar15];
                puVar23[lVar6] = uVar3;
                uVar9 = uVar9 - 1;
                uVar16 = uVar11;
                lVar24 = lVar13;
                lVar26 = lVar15;
                lVar19 = lVar6;
              } while (uVar9 != 0);
            }
          }
          return;
        }
        uVar11 = (long)in_stack_00000018 - (long)uStack0000000000000008 >> 1;
        if (uVar11 <= uVar9) {
          uVar11 = uVar9;
        }
        if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000018 - (long)uStack0000000000000008)) {
          uVar11 = 0x3fffffffffffffff;
        }
        if (uVar11 == 0) {
          lVar6 = 0;
          uStack0000000000000008 = (uint *)(lVar26 * 4);
          *uStack0000000000000008 = uVar3;
        }
        else {
          if (uVar11 >> 0x3e != 0) goto code_r0x000639d8;
          lVar6 = __Znwm(uVar11 << 2);
          uStack0000000000000008 = (uint *)(lVar6 + lVar26 * 4);
          *uStack0000000000000008 = uVar3;
        }
        puVar25 = uStack0000000000000008 + 1;
        if (puVar10 != puVar5) {
          puVar17 = puVar10 + -1;
          uVar9 = (long)puVar17 - (long)puVar5;
          if (uVar9 < 0xbc) {
          }
          else {
            uVar16 = (lVar6 + lVar24) - 4;
            if ((uVar16 - (uVar9 & 0xfffffffffffffffc) <= uVar16) &&
               ((uint *)((long)puVar17 - (uVar9 & 0xfffffffffffffffc)) <= puVar17)) {
              if ((ulong)((long)puVar17 + (-lVar24 - lVar6) + 4) < 0x40) {
              }
              else {
                uVar9 = (uVar9 >> 2) + 1;
                uVar14 = uVar9 & 0x7ffffffffffffff0;
                uStack0000000000000008 = uStack0000000000000008 + -uVar14;
                puVar17 = puVar10 + -8;
                puVar20 = (undefined8 *)(lVar6 + lVar26 * 4 + -0x20);
                uVar16 = uVar14;
                do {
                  uVar29 = *(undefined8 *)puVar17;
                  uVar28 = *(undefined8 *)(puVar17 + 6);
                  uVar27 = *(undefined8 *)(puVar17 + 4);
                  uVar33 = *(undefined8 *)(puVar17 + -6);
                  uVar32 = *(undefined8 *)(puVar17 + -8);
                  uVar31 = *(undefined8 *)(puVar17 + -2);
                  uVar30 = *(undefined8 *)(puVar17 + -4);
                  puVar20[1] = *(undefined8 *)(puVar17 + 2);
                  *puVar20 = uVar29;
                  puVar20[3] = uVar28;
                  puVar20[2] = uVar27;
                  puVar20[-3] = uVar33;
                  puVar20[-4] = uVar32;
                  puVar20[-1] = uVar31;
                  puVar20[-2] = uVar30;
                  puVar17 = puVar17 + -0x10;
                  puVar20 = puVar20 + -8;
                  uVar16 = uVar16 - 0x10;
                } while (uVar16 != 0);
                puVar10 = puVar10 + -uVar14;
                if (uVar9 == uVar14) goto code_r0x00063998;
              }
            }
          }
          do {
            puVar10 = puVar10 + -1;
            uStack0000000000000008 = uStack0000000000000008 + -1;
            *uStack0000000000000008 = *puVar10;
          } while (puVar10 != puVar5);
        }
code_r0x00063998:
        in_stack_00000018 = (uint *)(lVar6 + uVar11 * 4);
        if (puVar5 != (uint *)0x0) {
          in_stack_00000010 = puVar25;
          __ZdlPv(puVar5);
        }
      }
      puVar23 = puVar23 + 1;
      in_stack_00000010 = puVar25;
    } while (puVar23 != &uStack0000000000000038);
  }
  return;
}

