
/* WARNING: Removing unreachable block (ram,0x00143264) */
/* WARNING: Removing unreachable block (ram,0x00142da4) */
/* WARNING: Removing unreachable block (ram,0x00142da8) */
/* WARNING: Removing unreachable block (ram,0x00142db8) */
/* WARNING: Removing unreachable block (ram,0x00143260) */
/* WARNING: Removing unreachable block (ram,0x00143274) */
/* WARNING: Type propagation algorithm not settling */

void thunk_FUN_00142b58(long *param_1)

{
  byte *pbVar1;
  undefined8 *puVar2;
  undefined1 uVar3;
  uint uVar4;
  int iVar5;
  byte bVar6;
  undefined1 uVar7;
  bool bVar8;
  undefined8 uVar9;
  long *plVar10;
  long extraout_x1;
  long lVar11;
  byte *pbVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 *extraout_x8;
  long lVar15;
  byte *pbVar16;
  byte *pbVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  int iVar24;
  long lVar25;
  long lVar26;
  byte bVar27;
  long unaff_x19;
  ulong *puVar28;
  long *plVar29;
  long *unaff_x20;
  long *plVar30;
  undefined1 *puVar31;
  uint uVar32;
  byte *unaff_x21;
  byte *pbVar33;
  byte *pbVar34;
  long lVar35;
  long *plVar36;
  long *unaff_x22;
  undefined8 *puVar37;
  undefined8 *puVar38;
  int iVar39;
  int iVar40;
  ulong uVar41;
  byte *pbVar42;
  uint uVar43;
  long lVar44;
  undefined8 *puVar45;
  undefined8 *puVar46;
  byte *pbVar47;
  long *plVar48;
  undefined1 auVar49 [16];
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long lStack_78;
  long lStack_70;
  undefined8 uStack_68;
  byte *pbStack_60;
  byte *pbStack_58;
  long lStack_50;
  ulong uStack_48;
  long lStack_40;
  byte *pbStack_38;
  long *plStack_30;
  byte *pbStack_28;
  ulong uStack_20;
  undefined8 uStack_18;
  
  do {
    unaff_x22 = unaff_x22 + -3;
    if (*unaff_x22 != 0) {
      param_1[-2] = *unaff_x22;
      __ZdlPv();
    }
    param_1 = unaff_x22;
  } while (unaff_x22 != unaff_x20);
  *(long **)(unaff_x19 + 0x10) = unaff_x20;
  uStack0000000000000010 = 0;
  in_stack_00000018 = 0;
  in_stack_00000020 = 0;
  if (unaff_x20 < *(long **)(unaff_x19 + 0x18)) {
    *unaff_x20 = 0;
    unaff_x20[1] = 0;
    unaff_x20[2] = 0;
    *(long **)(unaff_x19 + 0x10) = unaff_x20 + 3;
  }
  else {
    uVar9 = func_0x001477a8(in_stack_00000008,&uStack0000000000000010);
    *(undefined8 *)(unaff_x19 + 0x10) = uVar9;
    if (uStack0000000000000010 != 0) {
      in_stack_00000018 = uStack0000000000000010;
      __ZdlPv();
    }
  }
  uVar20 = *(ulong *)(unaff_x21 + 8);
  pbVar42 = *(byte **)unaff_x21;
  if (-1 < (char)unaff_x21[0x17]) {
    uVar20 = (ulong)unaff_x21[0x17];
    pbVar42 = unaff_x21;
  }
  if (uVar20 != 0) {
    pbVar1 = pbVar42 + uVar20;
    do {
      uVar20 = 0x1555555555555555;
      bVar27 = *pbVar42;
      if (bVar27 != 0xd) {
        if (bVar27 == 10) {
          uStack0000000000000010 = 0;
          in_stack_00000018 = 0;
          in_stack_00000020 = 0;
          puVar2 = *(undefined8 **)(unaff_x19 + 0x10);
          if (puVar2 < *(undefined8 **)(unaff_x19 + 0x18)) {
            *puVar2 = 0;
            puVar2[1] = 0;
            puVar2[2] = 0;
            puVar2[1] = 0;
            *puVar2 = 0;
            puVar2[2] = 0;
            *(undefined8 **)(unaff_x19 + 0x10) = puVar2 + 3;
          }
          else {
            uVar9 = func_0x001477a8(in_stack_00000008,&uStack0000000000000010);
            *(undefined8 *)(unaff_x19 + 0x10) = uVar9;
            if (uStack0000000000000010 != 0) {
              in_stack_00000018 = uStack0000000000000010;
              __ZdlPv();
            }
          }
        }
        else {
          lVar35 = *(long *)(unaff_x19 + 0x10);
          uVar32 = (uint)unaff_x22 & 0xfffffff8;
          unaff_x22 = (long *)(ulong)uVar32;
          pbVar34 = *(byte **)(lVar35 + -0x10);
          bVar6 = (byte)uVar32;
          if (pbVar34 < *(byte **)(lVar35 + -8)) {
            *pbVar34 = bVar27;
            pbVar34[4] = 0;
            pbVar34[5] = 0;
            pbVar34[6] = 0;
            pbVar34[7] = 0;
            pbVar12 = pbVar34 + 0xc;
            pbVar34[8] = bVar6;
          }
          else {
            puVar28 = (ulong *)(lVar35 + -0x18);
            pbVar47 = (byte *)*puVar28;
            lVar15 = (long)pbVar34 - (long)pbVar47 >> 2;
            lVar44 = lVar15 * -0x5555555555555555;
            uVar13 = lVar44 + 1;
            if (0x1555555555555555 < uVar13) {
              func_0x00017f90(puVar28);
LAB_00142e28:
              uVar9 = func_0x00017514();
              if (uStack0000000000000010 != 0) {
                in_stack_00000018 = uStack0000000000000010;
                __ZdlPv();
              }
              auVar49 = __Unwind_Resume(uVar9);
              plVar10 = auVar49._8_8_;
              lVar15 = auVar49._0_8_;
              plVar48 = (long *)(lVar15 + 8);
              plVar29 = (long *)*plVar48;
              pbStack_60 = pbVar1;
              pbStack_58 = pbVar47;
              lStack_50 = lVar35;
              uStack_48 = (ulong)bVar27;
              lStack_40 = lVar44;
              pbStack_38 = pbVar42;
              plStack_30 = unaff_x22;
              pbStack_28 = pbVar34;
              uStack_20 = uVar20;
              uStack_18 = uVar9;
              if (*(long **)(lVar15 + 0x10) != plVar29) {
                plVar30 = *(long **)(lVar15 + 0x10);
                do {
                  plVar36 = plVar30 + -3;
                  if (*plVar36 != 0) {
                    plVar30[-2] = *plVar36;
                    __ZdlPv();
                  }
                  plVar30 = plVar36;
                } while (plVar36 != plVar29);
              }
              *(long **)(lVar15 + 0x10) = plVar29;
              if (*plVar10 == plVar10[1]) {
                lStack_78 = 0;
                lStack_70 = 0;
                uStack_68 = 0;
                if (plVar29 < *(long **)(lVar15 + 0x18)) {
                  *plVar29 = 0;
                  plVar29[1] = 0;
                  plVar29[2] = 0;
                  *(long **)(lVar15 + 0x10) = plVar29 + 3;
                }
                else {
                  uVar9 = func_0x001477a8(plVar48,&lStack_78);
                  *(undefined8 *)(lVar15 + 0x10) = uVar9;
                  if (lStack_78 != 0) {
                    lStack_70 = lStack_78;
                    __ZdlPv();
                  }
                }
                goto LAB_00143230;
              }
              lVar44 = plVar10[1] - *plVar10 >> 3;
              uVar20 = lVar44 * -0x5555555555555555;
              lVar35 = (long)plVar29 - *plVar48 >> 3;
              bVar8 = uVar20 < (ulong)(lVar35 * -0x5555555555555555);
              lVar35 = uVar20 + lVar35 * 0x5555555555555555;
              if (bVar8 || lVar35 == 0) {
                if (bVar8) {
                  plVar30 = (long *)(*plVar48 + lVar44 * 8);
                  if (plVar29 != plVar30) {
                    do {
                      plVar36 = plVar29 + -3;
                      lVar44 = *plVar36;
                      if (lVar44 != 0) {
                        plVar29[-2] = lVar44;
                        __ZdlPv(lVar44,lVar35);
                        lVar35 = extraout_x1;
                      }
                      plVar29 = plVar36;
                    } while (plVar36 != plVar30);
                  }
                  *(long **)(lVar15 + 0x10) = plVar30;
                }
              }
              else {
                func_0x00149b10(plVar48);
              }
              lVar35 = *plVar10;
              if (plVar10[1] == lVar35) goto LAB_00143230;
              uVar20 = 0;
              do {
                puVar2 = (undefined8 *)(lVar35 + uVar20 * 0x18);
                if ((char)*(byte *)((long)puVar2 + 0x17) < '\0') {
                  uVar13 = puVar2[1];
                }
                else {
                  uVar13 = (ulong)*(byte *)((long)puVar2 + 0x17);
                }
                lVar35 = *plVar48;
                plVar30 = (long *)(lVar35 + uVar20 * 0x18 + 0x10);
                plVar29 = (long *)(lVar35 + uVar20 * 0x18);
                puVar37 = (undefined8 *)*plVar29;
                if ((ulong)((*plVar30 - (long)puVar37 >> 2) * -0x5555555555555555) < uVar13) {
                  if (0x1555555555555555 < uVar13) {
LAB_001432e8:
                    uVar9 = func_0x00017f90(plVar29);
                    if (lStack_78 != 0) {
                      lStack_70 = lStack_78;
                      __ZdlPv();
                    }
                    lVar15 = __Unwind_Resume(uVar9);
                    *extraout_x8 = 0;
                    extraout_x8[1] = 0;
                    extraout_x8[2] = 0;
                    uVar32 = *(uint *)(lVar15 + 0x20);
                    uVar4 = *(uint *)(lVar15 + 0x28);
                    uVar21 = (ulong)(int)uVar4;
                    uVar20 = (ulong)(int)uVar32;
                    lVar35 = *(long *)(lVar15 + 8);
                    uVar13 = (*(long *)(lVar15 + 0x10) - lVar35 >> 3) * -0x5555555555555555;
                    if (uVar20 < uVar13) {
                      plVar29 = (long *)(lVar35 + (long)(int)uVar32 * 0x18);
                      lVar44 = *plVar29;
                      lVar11 = plVar29[1] - lVar44;
                      if (lVar11 == 0 || *(int *)(lVar15 + 0x24) < 1) {
                        uVar41 = 0;
                      }
                      else {
                        iVar40 = 0;
                        uVar41 = 0;
                        do {
                          bVar27 = *(byte *)(lVar44 + uVar41 * 0xc);
                          iVar39 = (int)uVar41;
                          if (bVar27 == 9) {
                            iVar24 = *(int *)(lVar15 + 0x54);
                            iVar5 = 0;
                            if (iVar24 != 0) {
                              iVar5 = iVar40 / iVar24;
                            }
                            iVar40 = iVar24 + iVar5 * iVar24;
                            bVar27 = 0;
code_r0x00137918:
                            iVar24 = 1;
                            if ((bVar27 & 0xe0) == 0xc0) {
                              iVar24 = 2;
                            }
                            uVar43 = iVar24 + iVar39;
                          }
                          else {
                            iVar40 = iVar40 + 1;
                            if ((bVar27 & 0xfe) == 0xfc) {
                              uVar43 = iVar39 + 6;
                            }
                            else if ((bVar27 & 0xfc) == 0xf8) {
                              uVar43 = iVar39 + 5;
                            }
                            else if ((bVar27 & 0xf8) == 0xf0) {
                              uVar43 = iVar39 + 4;
                            }
                            else {
                              if ((bVar27 & 0xf0) != 0xe0) goto code_r0x00137918;
                              uVar43 = iVar39 + 3;
                            }
                          }
                          uVar41 = (ulong)uVar43;
                        } while ((uVar41 < (ulong)((lVar11 >> 2) * -0x5555555555555555)) &&
                                (iVar40 < *(int *)(lVar15 + 0x24)));
                      }
                    }
                    else {
                      uVar41 = 0xffffffff;
                    }
                    if (uVar21 < uVar13) {
                      plVar29 = (long *)(lVar35 + (long)(int)uVar4 * 0x18);
                      lVar44 = *plVar29;
                      lVar11 = plVar29[1] - lVar44;
                      if (lVar11 == 0 || *(int *)(lVar15 + 0x2c) < 1) {
                        uVar43 = 0;
                      }
                      else {
                        iVar40 = 0;
                        uVar13 = 0;
                        do {
                          bVar27 = *(byte *)(lVar44 + uVar13 * 0xc);
                          iVar39 = (int)uVar13;
                          if (bVar27 == 9) {
                            iVar24 = *(int *)(lVar15 + 0x54);
                            iVar5 = 0;
                            if (iVar24 != 0) {
                              iVar5 = iVar40 / iVar24;
                            }
                            iVar40 = iVar24 + iVar5 * iVar24;
                            bVar27 = 0;
code_r0x00137a24:
                            iVar24 = 1;
                            if ((bVar27 & 0xe0) == 0xc0) {
                              iVar24 = 2;
                            }
                            uVar43 = iVar24 + iVar39;
                          }
                          else {
                            iVar40 = iVar40 + 1;
                            if ((bVar27 & 0xfe) == 0xfc) {
                              uVar43 = iVar39 + 6;
                            }
                            else if ((bVar27 & 0xfc) == 0xf8) {
                              uVar43 = iVar39 + 5;
                            }
                            else if ((bVar27 & 0xf8) == 0xf0) {
                              uVar43 = iVar39 + 4;
                            }
                            else {
                              if ((bVar27 & 0xf0) != 0xe0) goto code_r0x00137a24;
                              uVar43 = iVar39 + 3;
                            }
                          }
                          uVar13 = (ulong)uVar43;
                        } while ((uVar13 < (ulong)((lVar11 >> 2) * -0x5555555555555555)) &&
                                (iVar40 < *(int *)(lVar15 + 0x2c)));
                      }
                    }
                    else {
                      uVar43 = 0xffffffff;
                    }
                    if (uVar32 < uVar4) {
                      uVar22 = uVar21;
                      if (uVar21 < uVar20 + 1) {
                        uVar22 = uVar20 + 1;
                      }
                      uVar22 = uVar22 - uVar20;
                      if (uVar22 < 4) {
                        uVar13 = 0;
                      }
                      else {
                        lVar11 = 0;
                        lVar26 = 0;
                        lVar44 = 0;
                        lVar25 = 0;
                        uVar23 = uVar22 & 0xfffffffffffffffc;
                        uVar20 = uVar23 + uVar20;
                        plVar29 = (long *)(lVar35 + (long)(int)uVar32 * 0x18 + 0x30);
                        uVar13 = uVar23;
                        do {
                          lVar11 = lVar11 + (plVar29[-5] - plVar29[-6] >> 2) * -0x5555555555555555;
                          lVar26 = lVar26 + (plVar29[-2] - plVar29[-3] >> 2) * -0x5555555555555555;
                          lVar44 = lVar44 + (plVar29[1] - *plVar29 >> 2) * -0x5555555555555555;
                          lVar25 = lVar25 + (plVar29[4] - plVar29[3] >> 2) * -0x5555555555555555;
                          plVar29 = plVar29 + 0xc;
                          uVar13 = uVar13 - 4;
                        } while (uVar13 != 0);
                        uVar13 = lVar25 + lVar44 + lVar26 + lVar11;
                        if (uVar22 == uVar23) goto code_r0x00137ba4;
                      }
                      plVar29 = (long *)(lVar35 + uVar20 * 0x18 + 8);
                      do {
                        uVar13 = uVar13 + (*plVar29 - plVar29[-1] >> 2) * -0x5555555555555555;
                        uVar20 = uVar20 + 1;
                        plVar29 = plVar29 + 3;
                      } while (uVar20 < uVar21);
                    }
                    else {
                      uVar13 = 0;
                    }
code_r0x00137ba4:
                    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
                              (extraout_x8,uVar13 + (uVar13 >> 3));
                    while (((iVar40 = (int)uVar41, iVar40 < (int)uVar43 ||
                            ((int)uVar32 < (int)uVar4)) &&
                           ((int)uVar32 <
                            (int)((ulong)(*(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8)) >> 3) *
                            -0x55555555))) {
                      plVar29 = (long *)(*(long *)(lVar15 + 8) + (long)(int)uVar32 * 0x18);
                      lVar35 = *plVar29;
                      if (iVar40 < (int)((ulong)(plVar29[1] - lVar35) >> 2) * -0x55555555) {
                        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                  (extraout_x8,(long)*(char *)(lVar35 + (long)iVar40 * 0xc));
                        uVar41 = (ulong)(iVar40 + 1);
                      }
                      else {
                        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                  (extraout_x8,10);
                        uVar41 = 0;
                        uVar32 = uVar32 + 1;
                      }
                    }
                    return;
                  }
                  plVar36 = (long *)(lVar35 + uVar20 * 0x18 + 8);
                  puVar45 = (undefined8 *)*plVar36;
                  lVar44 = __Znwm(uVar13 * 0xc);
                  lVar35 = (long)puVar45 - (long)puVar37;
                  puVar14 = (undefined8 *)(lVar44 + lVar35);
                  puVar18 = puVar14;
                  if (lVar35 != 0) {
                    puVar19 = puVar14;
                    do {
                      puVar46 = (undefined8 *)((long)puVar45 + -0xc);
                      uVar3 = *(undefined1 *)((long)puVar45 + -4);
                      puVar18 = (undefined8 *)((long)puVar19 + -0xc);
                      *puVar18 = *puVar46;
                      *(undefined1 *)((long)puVar19 + -4) = uVar3;
                      puVar19 = puVar18;
                      puVar45 = puVar46;
                    } while (puVar46 != puVar37);
                  }
                  *plVar29 = (long)puVar18;
                  *plVar36 = (long)puVar14;
                  *plVar30 = lVar44 + uVar13 * 0xc;
                  if (puVar37 != (undefined8 *)0x0) {
                    __ZdlPv(puVar37);
                  }
                }
                plVar29 = (long *)0x0;
                uVar32 = (uint)pbVar42 & 0xfffffff8;
                while( true ) {
                  bVar27 = *(byte *)((long)puVar2 + 0x17);
                  plVar30 = (long *)(ulong)bVar27;
                  if ((char)bVar27 < '\0') {
                    plVar30 = (long *)puVar2[1];
                  }
                  if (plVar30 <= plVar29) break;
                  puVar37 = puVar2;
                  if ((char)bVar27 < '\0') {
                    puVar37 = (undefined8 *)*puVar2;
                  }
                  uVar3 = *(undefined1 *)((long)puVar37 + (long)plVar29);
                  lVar35 = *plVar48 + uVar20 * 0x18;
                  plVar36 = (long *)(lVar35 + 8);
                  puVar37 = (undefined8 *)*plVar36;
                  plVar30 = (long *)(lVar35 + 0x10);
                  puVar14 = (undefined8 *)*plVar30;
                  uVar7 = (undefined1)uVar32;
                  if (puVar37 < puVar14) {
                    *(undefined1 *)puVar37 = uVar3;
                    *(undefined4 *)((long)puVar37 + 4) = 0;
                    puVar31 = (undefined1 *)((long)puVar37 + 0xc);
                    *(undefined1 *)(puVar37 + 1) = uVar7;
                  }
                  else {
                    puVar45 = (undefined8 *)(*plVar48 + uVar20 * 0x18);
                    puVar18 = (undefined8 *)*puVar45;
                    lVar35 = (long)puVar37 - (long)puVar18 >> 2;
                    uVar13 = lVar35 * -0x5555555555555555 + 1;
                    if (0x1555555555555555 < uVar13) {
                      func_0x00017f90(puVar45);
LAB_001432e4:
                      func_0x00017514();
                      goto LAB_001432e8;
                    }
                    lVar44 = (long)puVar14 - (long)puVar18 >> 2;
                    uVar21 = lVar44 * 0x5555555555555556;
                    if (uVar21 <= uVar13) {
                      uVar21 = uVar13;
                    }
                    if (0xaaaaaaaaaaaaaa9 < (ulong)(lVar44 * -0x5555555555555555)) {
                      uVar21 = 0x1555555555555555;
                    }
                    if (uVar21 == 0) {
                      lVar44 = 0;
                    }
                    else {
                      if (0x1555555555555555 < uVar21) goto LAB_001432e4;
                      lVar44 = __Znwm(uVar21 * 0xc);
                    }
                    puVar46 = (undefined8 *)(lVar44 + lVar35 * 4);
                    *(undefined1 *)puVar46 = uVar3;
                    *(undefined4 *)((long)puVar46 + 4) = 0;
                    *(undefined1 *)(puVar46 + 1) = uVar7;
                    puVar14 = puVar46;
                    puVar19 = puVar46;
                    if (puVar37 != puVar18) {
                      do {
                        puVar38 = (undefined8 *)((long)puVar37 + -0xc);
                        uVar3 = *(undefined1 *)((long)puVar37 + -4);
                        puVar19 = (undefined8 *)((long)puVar14 + -0xc);
                        *puVar19 = *puVar38;
                        *(undefined1 *)((long)puVar14 + -4) = uVar3;
                        puVar14 = puVar19;
                        puVar37 = puVar38;
                      } while (puVar38 != puVar18);
                      puVar37 = (undefined8 *)*puVar45;
                    }
                    *puVar45 = puVar19;
                    puVar31 = (undefined1 *)((long)puVar46 + 0xc);
                    *plVar36 = (long)puVar31;
                    *plVar30 = lVar44 + uVar21 * 0xc;
                    if (puVar37 != (undefined8 *)0x0) {
                      __ZdlPv(puVar37);
                    }
                  }
                  *plVar36 = (long)puVar31;
                  plVar29 = (long *)((long)plVar29 + 1);
                  pbVar42 = (byte *)(ulong)uVar32;
                }
                uVar20 = uVar20 + 1;
                lVar35 = *plVar10;
                if ((ulong)((plVar10[1] - lVar35 >> 3) * -0x5555555555555555) <= uVar20) {
LAB_00143230:
                  *(undefined2 *)(lVar15 + 0x5c) = 0x101;
                  for (lVar35 = *(long *)(lVar15 + 0x40); lVar35 != *(long *)(lVar15 + 0x38);
                      lVar35 = lVar35 + -0x80) {
                  }
                  *(long *)(lVar15 + 0x40) = *(long *)(lVar15 + 0x38);
                  *(undefined4 *)(lVar15 + 0x50) = 0;
                  uVar4 = (int)((ulong)(*(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8)) >> 3) *
                          -0x55555555;
                  uVar32 = *(uint *)(lVar15 + 0x70);
                  if ((int)*(uint *)(lVar15 + 0x70) <= (int)uVar4) {
                    uVar32 = uVar4;
                  }
                  *(undefined4 *)(lVar15 + 0x6c) = 0;
                  *(uint *)(lVar15 + 0x70) = uVar32 & ((int)uVar32 >> 0x1f ^ 0xffffffffU);
                  *(undefined1 *)(lVar15 + 0x248) = 1;
                  return;
                }
              } while( true );
            }
            lVar11 = (long)*(byte **)(lVar35 + -8) - (long)pbVar47 >> 2;
            uVar20 = lVar11 * 0x5555555555555556;
            if (uVar20 <= uVar13) {
              uVar20 = uVar13;
            }
            if (0xaaaaaaaaaaaaaa9 < (ulong)(lVar11 * -0x5555555555555555)) {
              uVar20 = 0x1555555555555555;
            }
            if (uVar20 == 0) {
              lVar44 = 0;
            }
            else {
              if (0x1555555555555555 < uVar20) goto LAB_00142e28;
              lVar44 = __Znwm(uVar20 * 0xc);
            }
            pbVar12 = (byte *)(lVar44 + lVar15 * 4);
            *pbVar12 = bVar27;
            pbVar12[4] = 0;
            pbVar12[5] = 0;
            pbVar12[6] = 0;
            pbVar12[7] = 0;
            pbVar12[8] = bVar6;
            pbVar16 = pbVar12;
            pbVar17 = pbVar12;
            if (pbVar34 != pbVar47) {
              do {
                pbVar33 = pbVar34 + -0xc;
                bVar27 = pbVar34[-4];
                pbVar17 = pbVar16 + -0xc;
                *(undefined8 *)pbVar17 = *(undefined8 *)pbVar33;
                pbVar16[-4] = bVar27;
                pbVar16 = pbVar17;
                pbVar34 = pbVar33;
              } while (pbVar33 != pbVar47);
              pbVar34 = (byte *)*puVar28;
            }
            pbVar12 = pbVar12 + 0xc;
            *(byte **)(lVar35 + -0x18) = pbVar17;
            *(byte **)(lVar35 + -0x10) = pbVar12;
            *(ulong *)(lVar35 + -8) = lVar44 + uVar20 * 0xc;
            if (pbVar34 != (byte *)0x0) {
              __ZdlPv(pbVar34);
            }
          }
          *(byte **)(lVar35 + -0x10) = pbVar12;
        }
      }
      pbVar42 = pbVar42 + 1;
    } while (pbVar42 != pbVar1);
  }
  *(undefined2 *)(unaff_x19 + 0x5c) = 0x101;
  for (lVar35 = *(long *)(unaff_x19 + 0x40); lVar35 != *(long *)(unaff_x19 + 0x38);
      lVar35 = lVar35 + -0x80) {
  }
  *(long *)(unaff_x19 + 0x40) = *(long *)(unaff_x19 + 0x38);
  *(undefined4 *)(unaff_x19 + 0x50) = 0;
  uVar4 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar32 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar4) {
    uVar32 = uVar4;
  }
  *(undefined4 *)(unaff_x19 + 0x6c) = 0;
  *(uint *)(unaff_x19 + 0x70) = uVar32 & ((int)uVar32 >> 0x1f ^ 0xffffffffU);
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  return;
}

