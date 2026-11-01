
/* WARNING: Possible PIC construction at 0x002a37cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3880: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3ef8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002a3884) */
/* WARNING: Removing unreachable block (ram,0x002a3888) */
/* WARNING: Removing unreachable block (ram,0x002a3898) */
/* WARNING: Removing unreachable block (ram,0x002a37d0) */
/* WARNING: Removing unreachable block (ram,0x002a37dc) */
/* WARNING: Removing unreachable block (ram,0x002a3808) */
/* WARNING: Removing unreachable block (ram,0x002a3efc) */
/* WARNING: Removing unreachable block (ram,0x002a3740) */

ulong FUN_002a35fc(undefined8 param_1,undefined8 param_2,undefined1 *param_3,ulong param_4,
                  ulong param_5)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  bool bVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  bool bVar8;
  int iVar9;
  int iVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  ulong in_x9;
  ulong uVar18;
  ulong uVar19;
  ulong unaff_x19;
  ulong unaff_x20;
  undefined1 *unaff_x21;
  ulong unaff_x23;
  ulong uVar20;
  long unaff_x26;
  ulong uVar21;
  ulong uVar22;
  undefined1 *unaff_x29;
  undefined *puVar23;
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  long in_stack_00000008;
  ulong in_stack_00000010;
  uint uStack0000000000000018;
  undefined4 uStack000000000000001c;
  undefined1 *in_stack_00000020;
  ulong in_stack_00000028;
  ulong uStack0000000000000030;
  ulong uStack0000000000000038;
  ulong uStack0000000000000040;
  uint uStack000000000000004c;
  undefined1 uStack0000000000000050;
  undefined1 auStack_7ffffffe [2147483438];
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long lStack_38;
  ulong uStack_30;
  undefined1 auStack_6 [6];
  
  auVar25._8_8_ = unaff_x21;
  auVar25._0_8_ = unaff_x21;
  auVar7._8_8_ = unaff_x21;
  auVar7._0_8_ = unaff_x21;
  auVar24._8_8_ = unaff_x19;
  auVar24._0_8_ = unaff_x21;
  auVar6._8_8_ = unaff_x19;
  auVar6._0_8_ = unaff_x21;
  auVar5._8_8_ = unaff_x19;
  auVar5._0_8_ = unaff_x21;
  uVar13 = in_x9 >> 0x20;
  uVar22 = uVar13;
  if (uVar13 == 0) {
    uVar22 = in_x9;
  }
  uStack0000000000000038 = 0x21;
  if (uVar13 == 0) {
    uStack0000000000000038 = 1;
  }
  uVar18 = uVar22 >> 0x10;
  uVar13 = uVar18;
  if (uVar18 == 0) {
    uVar13 = uVar22;
  }
  uVar18 = (ulong)(uVar18 != 0);
  uVar22 = uVar13 >> 8;
  if (uVar13 < 0x100) {
    uVar22 = uVar13;
  }
  uVar14 = uVar22 >> 4;
  if (uVar22 < 0x10) {
    uVar14 = uVar22;
  }
  uVar1 = uVar14 >> 2;
  if (uVar14 < 4) {
    uVar1 = uVar14;
  }
  uVar21 = (ulong)(3 < uVar14);
  uStack0000000000000030 = (ulong)(1 < uVar1);
  uVar14 = uStack0000000000000038 & 0xffffffffffffffe0 | uVar18 << 4 | (ulong)(0xff < uVar13) << 3 |
           (ulong)(0xf < uVar22) << 2 | uStack0000000000000038 & 0x1f | uVar21 << 1;
  if (1 < uVar1) {
    uVar14 = uVar14 + 1;
  }
  uVar14 = uVar14 - unaff_x23;
  if (uVar14 < 0x2a0) {
    if (uVar14 < 0xf0) {
      if (uVar14 < 0x50) {
        uStack000000000000004c = 3;
        if (uVar14 < 0x18) {
          uStack000000000000004c = 1;
        }
        if (4 < uStack000000000000004c) {
          uStack000000000000004c = 5;
        }
      }
      else {
        uStack000000000000004c = 4;
      }
    }
    else {
      uStack000000000000004c = 5;
    }
  }
  else {
    uStack000000000000004c = 5;
  }
  uStack0000000000000040 = param_4;
  if (unaff_x19 != 0) {
    param_3 = (undefined1 *)(unaff_x19 << 3);
    param_4 = 0x480;
    ___memcpy_chk(&uStack0000000000000050);
  }
  uVar14 = uStack0000000000000040;
  in_stack_00000020 = (undefined1 *)(unaff_x19 << 3);
  uVar18 = uVar18 * 0x10;
  lVar3 = (ulong)(0xff < uVar13) * 8;
  uVar22 = (ulong)(0xf < uVar22) * 4;
  in_stack_00000028 = (ulong)(uStack000000000000004c - 2);
  uVar13 = unaff_x20;
  if (uStack000000000000004c < 2) {
    bVar4 = false;
    uVar1 = unaff_x26 + 1;
    uVar18 = ~unaff_x23 + uVar21 * 2 + uStack0000000000000030 +
             uStack0000000000000038 + uVar18 + lVar3 + uVar22;
    uVar22 = unaff_x19 << 1;
    uStack0000000000000038 = unaff_x20 + 0x30;
    uVar20 = unaff_x19 << 4;
    do {
      if (bVar4) {
        if ((uVar1 <= uVar18 >> 6) ||
           ((*(ulong *)(uVar14 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) == 0)) {
          puVar23 = (undefined *)0x2a3884;
          puVar11 = (undefined8 *)unaff_x21;
          auVar24 = auVar6;
          auVar25 = auVar7;
          goto code_r0x002a4078;
        }
      }
      else {
        for (; (uVar1 <= uVar18 >> 6 ||
               ((*(ulong *)(uVar14 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) == 0));
            uVar18 = uVar18 - 1) {
          if (uVar18 == 0) {
            if (bVar4) goto code_r0x002a3f40;
            func_0x0079dd40();
            goto code_r0x002a3f88;
          }
        }
      }
      uStack0000000000000030 = uVar20;
      if ((1 < uStack000000000000004c) && (uVar18 != 0)) {
        uVar21 = uVar18 - 1;
        uVar20 = uVar21;
        if (in_stack_00000028 <= uVar21) {
          uVar20 = in_stack_00000028;
        }
        if (uVar21 >> 6 < uVar1) {
          uVar19 = *(ulong *)(uVar14 + (uVar21 >> 6) * 8) >> (uVar21 & 0x3f);
          uVar21 = (ulong)((uint)uVar19 & 1);
          uVar15 = 3;
          if ((uVar19 & 1) == 0) {
            uVar15 = 1;
          }
        }
        else {
          uVar21 = 0;
          uVar15 = 1;
        }
        if (uVar20 != 0) {
          uVar19 = uVar18 - 2 >> 6;
          if (uVar19 < uVar1) {
            uVar16 = (uint)(*(ulong *)(uVar14 + uVar19 * 8) >> (uVar18 - 2 & 0x3f)) & 1;
          }
          else {
            uVar16 = 0;
          }
          uVar17 = (uint)uVar21;
          uVar2 = 2 - uVar17;
          if (uVar16 != 0) {
            uVar17 = 2;
            uVar15 = uVar15 << (ulong)(uVar2 & 0x1f) | 1;
          }
          uVar21 = (ulong)uVar17;
          if (uVar20 != 1) {
            uVar21 = uVar18 - 3 >> 6;
            if (uVar21 < uVar1) {
              uVar16 = (uint)(*(ulong *)(uVar14 + uVar21 * 8) >> (uVar18 - 3 & 0x3f)) & 1;
            }
            else {
              uVar16 = 0;
            }
            uVar2 = uVar17 ^ 3;
            if (uVar16 != 0) {
              uVar17 = 3;
              uVar15 = uVar15 << (ulong)uVar2 | 1;
            }
            uVar21 = (ulong)uVar17;
            if (uVar20 != 2) {
              uVar21 = uVar18 - 4 >> 6;
              if (uVar21 < uVar1) {
                uVar16 = (uint)(*(ulong *)(uVar14 + uVar21 * 8) >> (uVar18 - 4 & 0x3f)) & 1;
              }
              else {
                uVar16 = 0;
              }
              uVar2 = 4 - uVar17;
              if (uVar16 != 0) {
                uVar17 = 4;
                uVar15 = uVar15 << (ulong)(uVar2 & 0x1f) | 1;
              }
              uVar21 = (ulong)uVar17;
            }
          }
        }
        if (bVar4) goto LAB_002a3a0c;
        goto code_r0x002a3ec4;
      }
      uVar21 = 0;
      uVar15 = 1;
      if (bVar4) {
LAB_002a3a0c:
        _uStack0000000000000018 = CONCAT44(uStack000000000000001c,uVar15);
        iVar10 = (int)uVar21;
        uVar20 = uVar22;
        uVar19 = param_4;
        if (unaff_x19 < 2) {
          if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
            func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
            uVar20 = uStack0000000000000030;
            func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
            param_3 = auStack_7ffffffe + 0x800004ce;
            param_5 = unaff_x20;
            in_stack_00000010 = uVar22;
            iVar9 = func_0x002ab2b0();
            uVar19 = uVar22;
            if (iVar9 != 0) {
              func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
              uVar12 = in_stack_00000010;
              param_4 = uVar22;
              if (iVar10 == 0) {
code_r0x002a3ebc:
                uVar22 = in_stack_00000010;
                uVar15 = uStack0000000000000018;
                goto code_r0x002a3ec4;
              }
              uVar19 = uVar22;
              if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                uVar20 = uStack0000000000000030;
                func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                param_3 = auStack_7ffffffe + 0x800004ce;
                param_5 = unaff_x20;
                iVar9 = func_0x002ab2b0();
                uVar19 = uVar12;
                if (iVar9 != 0) {
                  func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
                  uVar22 = in_stack_00000010;
                  param_4 = uVar12;
                  if (iVar10 == 1) goto code_r0x002a3ebc;
                  uVar19 = uVar12;
                  if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                    func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                    uVar20 = uStack0000000000000030;
                    func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                    param_3 = auStack_7ffffffe + 0x800004ce;
                    param_5 = unaff_x20;
                    iVar9 = func_0x002ab2b0();
                    uVar19 = uVar22;
                    if (iVar9 != 0) {
                      func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
                      uVar12 = in_stack_00000010;
                      param_4 = uVar22;
                      if (iVar10 == 2) goto code_r0x002a3ebc;
                      uVar19 = uVar22;
                      if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                        func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                        uVar20 = uStack0000000000000030;
                        func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                        param_3 = auStack_7ffffffe + 0x800004ce;
                        param_5 = unaff_x20;
                        iVar9 = func_0x002ab2b0();
                        uVar19 = uVar12;
                        if (iVar9 != 0) {
                          func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
                          uVar22 = in_stack_00000010;
                          param_4 = uVar12;
                          if (iVar10 == 3) goto code_r0x002a3ebc;
                          uVar19 = uVar12;
                          if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                            func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                            uVar20 = uStack0000000000000030;
                            func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                            param_3 = auStack_7ffffffe + 0x800004ce;
                            param_5 = unaff_x20;
                            iVar9 = func_0x002ab2b0();
                            uVar19 = uVar22;
                            if (iVar9 != 0) {
                              func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
                              uVar12 = in_stack_00000010;
                              param_4 = uVar22;
                              if (iVar10 == 4) goto code_r0x002a3ebc;
                              uVar19 = uVar22;
                              if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                                func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                                uVar20 = uStack0000000000000030;
                                func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                                param_3 = auStack_7ffffffe + 0x800004ce;
                                param_5 = unaff_x20;
                                iVar10 = func_0x002ab2b0();
                                uVar19 = uVar12;
                                if ((iVar10 != 0) &&
                                   (func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20),
                                   uVar22 = in_stack_00000010, uVar19 = uVar12,
                                   (long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                                  func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                                  uVar20 = uStack0000000000000030;
                                  func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                                  param_3 = auStack_7ffffffe + 0x800004ce;
                                  param_5 = unaff_x20;
                                  iVar10 = func_0x002ab2b0();
                                  uVar19 = uVar22;
                                  if ((iVar10 != 0) &&
                                     (func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20),
                                     param_4 = in_stack_00000010, uVar19 = uVar22,
                                     (long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                                    func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                                    uVar20 = uStack0000000000000030;
                                    func_0x0036e464(unaff_x29 + -0xf0,uStack0000000000000030);
                                    param_3 = auStack_7ffffffe + 0x800004ce;
                                    param_5 = unaff_x20;
                                    iVar10 = func_0x002ab2b0();
                                    uVar19 = param_4;
                                    if (iVar10 != 0) {
                                      func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar20);
                                      goto code_r0x002a3ebc;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
          uVar19 = *(ulong *)(unaff_x20 + 0x18);
          param_3 = unaff_x21;
          param_5 = uStack0000000000000038;
          iVar9 = func_0x00381a00();
          if (iVar9 != 0) {
            param_4 = uVar19;
            uVar15 = uStack0000000000000018;
            if (iVar10 == 0) {
code_r0x002a3ec4:
              if ((uVar15 & 1) == 0) {
code_r0x002a3f88:
                func_0x0079dd68();
              }
              else if (uVar15 >> (ulong)(uStack000000000000004c & 0x1f) == 0) {
                if (!bVar4) goto LAB_002a3f00;
                puVar11 = (undefined8 *)
                          (auStack_7ffffffe + (ulong)(uVar15 >> 1) * 0x48 + 0x8000004e);
                puVar23 = (undefined *)0x2a3efc;
                goto code_r0x002a4078;
              }
              func_0x0079dd90();
              uVar19 = param_4;
              uVar20 = uVar22;
            }
            else if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
              uVar19 = *(ulong *)(unaff_x20 + 0x18);
              param_3 = unaff_x21;
              param_5 = uStack0000000000000038;
              iVar9 = func_0x00381a00();
              if (iVar9 != 0) {
                param_4 = uVar19;
                uVar15 = uStack0000000000000018;
                if (iVar10 == 1) goto code_r0x002a3ec4;
                if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                  uVar19 = *(ulong *)(unaff_x20 + 0x18);
                  param_3 = unaff_x21;
                  param_5 = uStack0000000000000038;
                  iVar9 = func_0x00381a00();
                  if (iVar9 != 0) {
                    param_4 = uVar19;
                    uVar15 = uStack0000000000000018;
                    if (iVar10 == 2) goto code_r0x002a3ec4;
                    if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                      uVar19 = *(ulong *)(unaff_x20 + 0x18);
                      param_3 = unaff_x21;
                      param_5 = uStack0000000000000038;
                      iVar9 = func_0x00381a00();
                      if (iVar9 != 0) {
                        param_4 = uVar19;
                        uVar15 = uStack0000000000000018;
                        if (iVar10 == 3) goto code_r0x002a3ec4;
                        if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                          uVar19 = *(ulong *)(unaff_x20 + 0x18);
                          param_3 = unaff_x21;
                          param_5 = uStack0000000000000038;
                          iVar9 = func_0x00381a00();
                          if (iVar9 != 0) {
                            param_4 = uVar19;
                            uVar15 = uStack0000000000000018;
                            if (iVar10 == 4) goto code_r0x002a3ec4;
                            if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                              uVar19 = *(ulong *)(unaff_x20 + 0x18);
                              param_3 = unaff_x21;
                              param_5 = uStack0000000000000038;
                              iVar10 = func_0x00381a00();
                              if ((iVar10 != 0) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19))
                              {
                                uVar19 = *(ulong *)(unaff_x20 + 0x18);
                                param_3 = unaff_x21;
                                param_5 = uStack0000000000000038;
                                iVar10 = func_0x00381a00();
                                if ((iVar10 != 0) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19)
                                   ) {
                                  uVar19 = *(ulong *)(unaff_x20 + 0x18);
                                  param_3 = unaff_x21;
                                  param_5 = uStack0000000000000038;
                                  iVar10 = func_0x00381a00();
                                  param_4 = uVar19;
                                  uVar15 = uStack0000000000000018;
                                  if (iVar10 != 0) goto code_r0x002a3ec4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _abort();
        func_0x0079dd18();
        uVar22 = uVar20;
        goto code_r0x002a3f98;
      }
LAB_002a3f00:
      if (unaff_x19 != 0) {
        param_3 = in_stack_00000020;
        _memcpy();
      }
      bVar8 = uVar18 != uVar21;
      uVar18 = uVar18 - ((int)uVar21 + 1);
      bVar4 = true;
      uVar20 = uStack0000000000000030;
    } while (bVar8);
code_r0x002a3f40:
    uVar18 = func_0x0036e464(&uStack0000000000000050,0x480);
    uVar19 = param_4;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return uVar18;
    }
code_r0x002a3f98:
    auVar24 = ___stack_chk_fail();
    uVar18 = auVar24._8_8_;
    puVar11 = &uStack_d0;
    uStack_30 = uVar14;
    unaff_x29 = auStack_6 + -10;
    lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
    if ((uVar18 < 10) &&
       (uVar14 = uVar18 << 1, unaff_x19 = uVar18, uVar13 = param_5,
       (long)*(int *)(param_5 + 0x20) == uVar18 && uVar19 <= uVar14)) {
      uStack_58 = 0;
      uStack_60 = 0;
      uStack_48 = 0;
      uStack_50 = 0;
      uStack_78 = 0;
      uStack_80 = 0;
      uStack_68 = 0;
      uStack_70 = 0;
      uStack_98 = 0;
      uStack_a0 = 0;
      uStack_88 = 0;
      uStack_90 = 0;
      uStack_b8 = 0;
      uStack_c0 = 0;
      uStack_a8 = 0;
      uStack_b0 = 0;
      uStack_c8 = 0;
      uStack_d0 = 0;
      if (uVar19 != 0) {
        ___memcpy_chk(&uStack_d0,param_3,uVar19 << 3,0x90);
      }
      uVar19 = uVar14;
      iVar10 = func_0x002ab2b0(auVar24._0_8_,uVar18);
      param_3 = (undefined1 *)puVar11;
      unaff_x21 = auVar24._0_8_;
      if (iVar10 == 0) goto code_r0x002a4070;
      uVar18 = func_0x0036e464(&uStack_d0,uVar18 << 4);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
        return uVar18;
      }
    }
    else {
code_r0x002a4070:
      puVar11 = (undefined8 *)param_3;
      auVar24._8_8_ = unaff_x19;
      auVar24._0_8_ = unaff_x21;
      _abort();
    }
    puVar23 = &_aws_lc_0_24_0_bn_mod_mul_montgomery_small;
    auVar25 = ___stack_chk_fail();
    register0x00000008 = (BADSPACEBASE *)&uStack_d0;
    unaff_x19 = uVar19;
    unaff_x20 = param_5;
  }
  else {
    auVar25._8_8_ = &uStack0000000000000050;
    auVar25._0_8_ = unaff_x29 + -0xf0;
    puVar23 = (undefined *)0x2a37d0;
    puVar11 = (undefined8 *)&uStack0000000000000050;
    in_stack_00000008 = lVar3;
    in_stack_00000010 = uVar18;
    _uStack0000000000000018 = uVar21 * 2;
    auVar24 = auVar5;
  }
code_r0x002a4078:
  *(ulong *)((long)register0x00000008 + -0x40) = uVar22;
  *(ulong *)((long)register0x00000008 + -0x38) = uVar21;
  *(ulong *)((long)register0x00000008 + -0x30) = uVar14;
  *(long *)((long)register0x00000008 + -0x28) = auVar24._0_8_;
  *(ulong *)((long)register0x00000008 + -0x20) = uVar13;
  *(long *)((long)register0x00000008 + -0x18) = auVar24._8_8_;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar23;
  *(undefined8 *)((long)register0x00000008 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8
  ;
  if ((unaff_x19 < 10) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
    if (unaff_x19 < 2) {
      if ((undefined8 *)auVar25._8_8_ == puVar11) {
        func_0x002ac3fc((undefined1 *)((long)register0x00000008 + -0x168));
        func_0x0036e464((undefined1 *)((long)register0x00000008 + -0xd8),unaff_x19 << 4);
      }
      else {
        func_0x002abe4c();
      }
      puVar11 = (undefined8 *)((long)register0x00000008 + -0x168);
      iVar10 = func_0x002ab2b0(auVar25._0_8_,unaff_x19,puVar11,unaff_x19 << 1,unaff_x20);
      if (iVar10 != 0) {
        uVar22 = func_0x0036e464((undefined1 *)((long)register0x00000008 + -0x168),unaff_x19 << 4);
        goto code_r0x002a4150;
      }
    }
    else {
      uVar22 = func_0x00381a00(auVar25._0_8_);
      if ((int)uVar22 != 0) {
code_r0x002a4150:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x48))
        {
          return uVar22;
        }
        goto code_r0x002a4184;
      }
    }
  }
  _abort();
code_r0x002a4184:
  auVar24 = ___stack_chk_fail();
  if ((ulong)puVar11 >> 6 < auVar24._8_8_) {
    return (ulong)((uint)(*(ulong *)(auVar24._0_8_ + ((ulong)puVar11 >> 6) * 8) >>
                         ((ulong)puVar11 & 0x3f)) & 1);
  }
  return 0;
}

