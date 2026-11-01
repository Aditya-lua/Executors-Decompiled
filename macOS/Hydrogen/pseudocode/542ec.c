
/* WARNING: Possible PIC construction at 0x0005436c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00054370) */
/* WARNING: Removing unreachable block (ram,0x00054390) */
/* WARNING: Removing unreachable block (ram,0x00054378) */

long * FUN_000542ec(long param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  ulong uVar1;
  byte bVar2;
  ulong uVar3;
  ulong *puVar4;
  int iVar5;
  ulong uVar6;
  long *plVar7;
  undefined8 uVar8;
  long lVar9;
  long *plVar10;
  ulong uVar11;
  ulong *puVar12;
  long *plVar13;
  long *plVar14;
  ulong uVar15;
  ulong uVar16;
  ulong unaff_x25;
  ulong *puVar17;
  undefined2 uVar18;
  undefined1 auVar19 [16];
  long in_stack_00000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  long *plStack_78;
  long *plStack_70;
  undefined1 uStack_68;
  
  param_1 = param_1 + 8;
  uVar6 = _strlen();
  if (uVar6 < 0x7ffffffffffffff8) {
    if (uVar6 < 0x17) {
      _uStack0000000000000018 = CONCAT17((char)uVar6,uStack0000000000000018);
      if (uVar6 != 0) goto code_r0x00054348;
    }
    else {
      uVar16 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar16 = uVar6 | 7;
      }
      param_1 = __Znwm(uVar16 + 1);
      _uStack0000000000000018 = uVar16 + 1 | 0x8000000000000000;
      in_stack_00000008 = param_1;
      in_stack_00000010 = uVar6;
code_r0x00054348:
      _memmove(param_1);
    }
    *(undefined1 *)(param_1 + uVar6) = 0;
    plVar7 = (long *)0xa333b8;
    puVar12 = (ulong *)register0x00000008;
    param_4 = (long *)register0x00000008;
  }
  else {
    uVar8 = func_0x0001748c(param_1);
    if ((long)_uStack0000000000000018 < 0) {
      __ZdlPv(in_stack_00000008);
    }
    auVar19 = __Unwind_Resume(uVar8);
    puVar12 = auVar19._8_8_;
    plVar7 = auVar19._0_8_;
  }
  uVar16 = *puVar12;
  puVar17 = puVar12 + 1;
  uVar6 = puVar12[2];
  puVar4 = (ulong *)*puVar17;
  if (-1 < (char)*(byte *)((long)puVar12 + 0x1f)) {
    uVar6 = (ulong)*(byte *)((long)puVar12 + 0x1f);
    puVar4 = puVar17;
  }
  lVar9 = func_0x00027c78(&plStack_78,puVar4,uVar6);
  uVar16 = uVar16 ^ lVar9 << 1;
  uVar6 = plVar7[1];
  if (uVar6 != 0) {
    uVar8 = CONCAT17(POPCOUNT((char)(uVar6 >> 0x38)),
                     CONCAT16(POPCOUNT((char)(uVar6 >> 0x30)),
                              CONCAT15(POPCOUNT((char)(uVar6 >> 0x28)),
                                       CONCAT14(POPCOUNT((char)(uVar6 >> 0x20)),
                                                CONCAT13(POPCOUNT((char)(uVar6 >> 0x18)),
                                                         CONCAT12(POPCOUNT((char)(uVar6 >> 0x10)),
                                                                  CONCAT11(POPCOUNT((char)(uVar6 >> 
                                                  8)),POPCOUNT((char)uVar6))))))));
    uVar18 = NEON_uaddlv(uVar8,1);
    uVar15 = CONCAT62((int6)((ulong)uVar8 >> 0x10),uVar18) & 0xffffffff;
    if (uVar15 < 2) {
      unaff_x25 = uVar6 - 1 & uVar16;
    }
    else {
      unaff_x25 = uVar16;
      if (uVar6 <= uVar16) {
        uVar11 = 0;
        if (uVar6 != 0) {
          uVar11 = uVar16 / uVar6;
        }
        unaff_x25 = uVar16 - uVar11 * uVar6;
      }
    }
    plVar14 = *(long **)(*plVar7 + unaff_x25 * 8);
    if ((plVar14 != (long *)0x0) && (plVar14 = (long *)*plVar14, plVar14 != (long *)0x0)) {
      bVar2 = *(byte *)((long)puVar12 + 0x1f);
      uVar11 = puVar12[2];
      if (-1 < (char)bVar2) {
        uVar11 = (ulong)bVar2;
      }
      uVar1 = *puVar12;
      puVar12 = (ulong *)puVar12[1];
      if (-1 < (char)bVar2) {
        puVar12 = puVar17;
      }
      if (uVar15 < 2) {
        do {
          if (plVar14[1] == uVar16) {
            if (plVar14[2] == uVar1) {
              bVar2 = *(byte *)((long)plVar14 + 0x2f);
              uVar15 = plVar14[4];
              if (-1 < (char)bVar2) {
                uVar15 = (ulong)bVar2;
              }
              if (uVar15 == uVar11) {
                if ((char)bVar2 < '\0') {
                  iVar5 = _memcmp(plVar14[3],puVar12);
                  if (iVar5 == 0) {
                    return plVar14;
                  }
                }
                else {
                  if (bVar2 == 0) {
                    return plVar14;
                  }
                  uVar15 = 0;
                  while (*(char *)((long)plVar14 + uVar15 + 0x18) ==
                         *(char *)((long)puVar12 + uVar15)) {
                    uVar15 = uVar15 + 1;
                    if (bVar2 == uVar15) {
                      return plVar14;
                    }
                  }
                }
              }
            }
          }
          else if ((plVar14[1] & uVar6 - 1) != unaff_x25) break;
          plVar14 = (long *)*plVar14;
        } while (plVar14 != (long *)0x0);
      }
      else {
        do {
          uVar15 = plVar14[1];
          if (uVar15 == uVar16) {
            if (plVar14[2] == uVar1) {
              bVar2 = *(byte *)((long)plVar14 + 0x2f);
              uVar15 = plVar14[4];
              if (-1 < (char)bVar2) {
                uVar15 = (ulong)bVar2;
              }
              if (uVar15 == uVar11) {
                if ((char)bVar2 < '\0') {
                  iVar5 = _memcmp(plVar14[3],puVar12);
                  if (iVar5 == 0) {
                    return plVar14;
                  }
                }
                else {
                  if (bVar2 == 0) {
                    return plVar14;
                  }
                  uVar15 = 0;
                  while (*(char *)((long)plVar14 + uVar15 + 0x18) ==
                         *(char *)((long)puVar12 + uVar15)) {
                    uVar15 = uVar15 + 1;
                    if (bVar2 == uVar15) {
                      return plVar14;
                    }
                  }
                }
              }
            }
          }
          else {
            if (uVar6 <= uVar15) {
              uVar3 = 0;
              if (uVar6 != 0) {
                uVar3 = uVar15 / uVar6;
              }
              uVar15 = uVar15 - uVar3 * uVar6;
            }
            if (uVar15 != unaff_x25) break;
          }
          plVar14 = (long *)*plVar14;
        } while (plVar14 != (long *)0x0);
      }
    }
  }
  plVar14 = plVar7 + 2;
  plVar10 = (long *)__Znwm(0x30);
  plStack_78 = plVar10;
  plStack_70 = plVar14;
  *plVar10 = 0;
  plVar10[1] = uVar16;
  plVar10[2] = *param_4;
  lVar9 = param_4[1];
  plVar10[4] = param_4[2];
  plVar10[3] = lVar9;
  plVar10[5] = param_4[3];
  param_4[1] = 0;
  param_4[2] = 0;
  param_4[3] = 0;
  uStack_68 = 1;
  if ((uVar6 == 0) || (*(float *)(plVar7 + 4) * (float)uVar6 < (float)(plVar7[3] + 1))) {
    uVar15 = 1;
    if (2 < uVar6) {
      uVar15 = (ulong)((uVar6 & uVar6 - 1) != 0);
    }
    uVar15 = uVar15 | uVar6 << 1;
    uVar6 = (ulong)((float)(plVar7[3] + 1) / *(float *)(plVar7 + 4));
    if (uVar15 <= uVar6) {
      uVar15 = uVar6;
    }
    if (uVar15 - 1 == 0) {
      uVar15 = 2;
    }
    else if ((uVar15 & uVar15 - 1) != 0) {
      uVar15 = __ZNSt3__112__next_primeEm(uVar15);
    }
    uVar6 = plVar7[1];
    if (uVar6 < uVar15) {
LAB_000546bc:
      func_0x000280c4(plVar7,uVar15);
    }
    else if (uVar15 < uVar6) {
      uVar11 = (ulong)((float)(ulong)plVar7[3] / *(float *)(plVar7 + 4));
      if ((uVar6 < 3) ||
         (uVar8 = CONCAT17(POPCOUNT((char)(uVar6 >> 0x38)),
                           CONCAT16(POPCOUNT((char)(uVar6 >> 0x30)),
                                    CONCAT15(POPCOUNT((char)(uVar6 >> 0x28)),
                                             CONCAT14(POPCOUNT((char)(uVar6 >> 0x20)),
                                                      CONCAT13(POPCOUNT((char)(uVar6 >> 0x18)),
                                                               CONCAT12(POPCOUNT((char)(uVar6 >> 
                                                  0x10)),CONCAT11(POPCOUNT((char)(uVar6 >> 8)),
                                                                  POPCOUNT((char)uVar6)))))))),
         uVar18 = NEON_uaddlv(uVar8,1),
         1 < (CONCAT62((int6)((ulong)uVar8 >> 0x10),uVar18) & 0xffffffff))) {
        uVar11 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar11) {
        uVar11 = 1L << (-LZCOUNT(uVar11 - 1) & 0x3fU);
      }
      if (uVar15 <= uVar11) {
        uVar15 = uVar11;
      }
      if (uVar15 < uVar6) goto LAB_000546bc;
    }
    uVar6 = plVar7[1];
    if ((uVar6 & uVar6 - 1) == 0) {
      unaff_x25 = uVar6 - 1 & uVar16;
      lVar9 = *plVar7;
      plVar13 = *(long **)(lVar9 + unaff_x25 * 8);
      goto joined_r0x0005479c;
    }
    if (uVar16 < uVar6) {
      lVar9 = *plVar7;
      plVar13 = *(long **)(lVar9 + uVar16 * 8);
      unaff_x25 = uVar16;
      goto joined_r0x0005479c;
    }
    uVar15 = 0;
    if (uVar6 != 0) {
      uVar15 = uVar16 / uVar6;
    }
    unaff_x25 = uVar16 - uVar15 * uVar6;
    lVar9 = *plVar7;
    plVar13 = *(long **)(lVar9 + unaff_x25 * 8);
    if (plVar13 == (long *)0x0) goto code_r0x00054758;
LAB_00054650:
    *plVar10 = *plVar13;
  }
  else {
    lVar9 = *plVar7;
    plVar13 = *(long **)(lVar9 + unaff_x25 * 8);
joined_r0x0005479c:
    if (plVar13 != (long *)0x0) goto LAB_00054650;
code_r0x00054758:
    *plVar10 = *plVar14;
    *plVar14 = (long)plVar10;
    *(long **)(lVar9 + unaff_x25 * 8) = plVar14;
    if (*plVar10 == 0) goto LAB_000547d8;
    uVar16 = *(ulong *)(*plVar10 + 8);
    if ((uVar6 & uVar6 - 1) == 0) {
      uVar16 = uVar16 & uVar6 - 1;
    }
    else if (uVar6 <= uVar16) {
      uVar15 = 0;
      if (uVar6 != 0) {
        uVar15 = uVar16 / uVar6;
      }
      uVar16 = uVar16 - uVar15 * uVar6;
    }
    plVar13 = (long *)(*plVar7 + uVar16 * 8);
  }
  *plVar13 = (long)plVar10;
LAB_000547d8:
  plVar7[3] = plVar7[3] + 1;
  return plVar10;
}

