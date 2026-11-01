
/* WARNING: Possible PIC construction at 0x002a3880: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3ef8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002a3884) */
/* WARNING: Removing unreachable block (ram,0x002a3888) */
/* WARNING: Removing unreachable block (ram,0x002a3898) */
/* WARNING: Removing unreachable block (ram,0x002a3efc) */
/* WARNING: Removing unreachable block (ram,0x002a389c) */
/* WARNING: Removing unreachable block (ram,0x002a38a8) */
/* WARNING: Removing unreachable block (ram,0x002a38b4) */
/* WARNING: Removing unreachable block (ram,0x002a3f3c) */
/* WARNING: Removing unreachable block (ram,0x002a38b8) */
/* WARNING: Removing unreachable block (ram,0x002a391c) */
/* WARNING: Removing unreachable block (ram,0x002a3f00) */
/* WARNING: Removing unreachable block (ram,0x002a3f04) */
/* WARNING: Removing unreachable block (ram,0x002a3f20) */
/* WARNING: Removing unreachable block (ram,0x002a3f84) */

ulong FUN_002a3f30(undefined8 param_1,undefined8 param_2,undefined1 *param_3,ulong param_4,
                  long param_5)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  bool in_ZR;
  int iVar4;
  ulong uVar6;
  int iVar5;
  undefined8 *puVar7;
  ulong uVar8;
  ulong uVar9;
  uint uVar10;
  uint uVar11;
  ulong uVar12;
  ulong unaff_x19;
  long unaff_x20;
  long lVar13;
  undefined1 *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  ulong in_stack_00000010;
  uint in_stack_00000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000048;
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
  undefined1 auStack_6 [6];
  
  auVar16._8_8_ = unaff_x21;
  auVar16._0_8_ = unaff_x21;
  auVar3._8_8_ = unaff_x21;
  auVar3._0_8_ = unaff_x21;
  auVar15._8_8_ = unaff_x19;
  auVar15._0_8_ = unaff_x21;
  auVar2._8_8_ = unaff_x19;
  auVar2._0_8_ = unaff_x21;
  lVar13 = unaff_x20;
  if (in_ZR) {
    uVar6 = func_0x0036e464(&uStack0000000000000050,0x480);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return uVar6;
    }
LAB_002a3f98:
    auVar15 = ___stack_chk_fail();
    uVar12 = auVar15._8_8_;
    puVar7 = &uStack_d0;
    unaff_x29 = auStack_6 + -10;
    lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
    uVar6 = unaff_x19;
    if ((uVar12 < 10) &&
       (unaff_x22 = uVar12 << 1, uVar6 = uVar12, lVar13 = param_5,
       (long)*(int *)(param_5 + 0x20) == uVar12 && param_4 <= unaff_x22)) {
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
      if (param_4 != 0) {
        ___memcpy_chk(&uStack_d0,param_3,param_4 << 3,0x90);
      }
      unaff_x19 = unaff_x22;
      unaff_x20 = param_5;
      iVar5 = func_0x002ab2b0(auVar15._0_8_,uVar12);
      param_3 = (undefined1 *)puVar7;
      param_4 = unaff_x19;
      param_5 = unaff_x20;
      unaff_x21 = auVar15._0_8_;
      if (iVar5 == 0) goto LAB_002a4070;
      uVar6 = func_0x0036e464(&uStack_d0,uVar12 << 4);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
        return uVar6;
      }
    }
    else {
LAB_002a4070:
      unaff_x20 = param_5;
      unaff_x19 = param_4;
      puVar7 = (undefined8 *)param_3;
      auVar15._8_8_ = uVar6;
      auVar15._0_8_ = unaff_x21;
      _abort();
    }
    puVar14 = &_aws_lc_0_24_0_bn_mod_mul_montgomery_small;
    auVar16 = ___stack_chk_fail();
    register0x00000008 = (BADSPACEBASE *)&uStack_d0;
    unaff_x21 = (undefined1 *)puVar7;
  }
  else {
    if ((unaff_x26 >> 6 < unaff_x25) &&
       ((*(ulong *)(unaff_x22 + (unaff_x26 >> 6) * 8) >> (unaff_x26 & 0x3f) & 1) != 0)) {
      if ((in_stack_00000048._4_4_ < 2) || (unaff_x26 == 0)) {
        unaff_x27 = 0;
        in_stack_00000018 = 1;
      }
      else {
        uVar12 = unaff_x26 - 1;
        uVar6 = uVar12;
        if (in_stack_00000028 <= uVar12) {
          uVar6 = in_stack_00000028;
        }
        if (uVar12 >> 6 < unaff_x25) {
          uVar12 = *(ulong *)(unaff_x22 + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f);
          unaff_x27 = (ulong)((uint)uVar12 & 1);
          in_stack_00000018 = 3;
          if ((uVar12 & 1) == 0) {
            in_stack_00000018 = 1;
          }
        }
        else {
          unaff_x27 = 0;
          in_stack_00000018 = 1;
        }
        if (uVar6 != 0) {
          uVar12 = unaff_x26 - 2 >> 6;
          if (uVar12 < unaff_x25) {
            uVar10 = (uint)(*(ulong *)(unaff_x22 + uVar12 * 8) >> (unaff_x26 - 2 & 0x3f)) & 1;
          }
          else {
            uVar10 = 0;
          }
          uVar11 = (uint)unaff_x27;
          uVar1 = 2 - uVar11;
          if (uVar10 != 0) {
            uVar11 = 2;
            in_stack_00000018 = in_stack_00000018 << (ulong)(uVar1 & 0x1f) | 1;
          }
          unaff_x27 = (ulong)uVar11;
          if (uVar6 != 1) {
            uVar12 = unaff_x26 - 3 >> 6;
            if (uVar12 < unaff_x25) {
              uVar10 = (uint)(*(ulong *)(unaff_x22 + uVar12 * 8) >> (unaff_x26 - 3 & 0x3f)) & 1;
            }
            else {
              uVar10 = 0;
            }
            uVar1 = uVar11 ^ 3;
            if (uVar10 != 0) {
              uVar11 = 3;
              in_stack_00000018 = in_stack_00000018 << (ulong)uVar1 | 1;
            }
            unaff_x27 = (ulong)uVar11;
            if (uVar6 != 2) {
              uVar6 = unaff_x26 - 4 >> 6;
              if (uVar6 < unaff_x25) {
                uVar10 = (uint)(*(ulong *)(unaff_x22 + uVar6 * 8) >> (unaff_x26 - 4 & 0x3f)) & 1;
              }
              else {
                uVar10 = 0;
              }
              uVar1 = 4 - uVar11;
              if (uVar10 != 0) {
                uVar11 = 4;
                in_stack_00000018 = in_stack_00000018 << (ulong)(uVar1 & 0x1f) | 1;
              }
              unaff_x27 = (ulong)uVar11;
            }
          }
        }
      }
      iVar5 = (int)unaff_x27;
      uVar6 = unaff_x28;
      in_stack_00000030 = unaff_x23;
      if (unaff_x19 < 2) {
        if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
          func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
          uVar6 = in_stack_00000030;
          func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
          param_3 = auStack_7ffffffe + 0x800004ce;
          param_5 = unaff_x20;
          in_stack_00000010 = unaff_x28;
          iVar4 = func_0x002ab2b0();
          param_4 = unaff_x28;
          if (iVar4 != 0) {
            func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
            uVar12 = in_stack_00000010;
            uVar9 = unaff_x28;
            if (iVar5 == 0) {
code_r0x002a3ebc:
              unaff_x28 = in_stack_00000010;
              goto code_r0x002a3ec4;
            }
            param_4 = unaff_x28;
            if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
              func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
              uVar6 = in_stack_00000030;
              func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
              param_3 = auStack_7ffffffe + 0x800004ce;
              param_5 = unaff_x20;
              iVar4 = func_0x002ab2b0();
              param_4 = uVar12;
              if (iVar4 != 0) {
                func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
                uVar8 = in_stack_00000010;
                uVar9 = uVar12;
                if (iVar5 == 1) goto code_r0x002a3ebc;
                param_4 = uVar12;
                if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                  func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                  uVar6 = in_stack_00000030;
                  func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                  param_3 = auStack_7ffffffe + 0x800004ce;
                  param_5 = unaff_x20;
                  iVar4 = func_0x002ab2b0();
                  param_4 = uVar8;
                  if (iVar4 != 0) {
                    func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
                    uVar12 = in_stack_00000010;
                    uVar9 = uVar8;
                    if (iVar5 == 2) goto code_r0x002a3ebc;
                    param_4 = uVar8;
                    if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                      func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                      uVar6 = in_stack_00000030;
                      func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                      param_3 = auStack_7ffffffe + 0x800004ce;
                      param_5 = unaff_x20;
                      iVar4 = func_0x002ab2b0();
                      param_4 = uVar12;
                      if (iVar4 != 0) {
                        func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
                        uVar8 = in_stack_00000010;
                        uVar9 = uVar12;
                        if (iVar5 == 3) goto code_r0x002a3ebc;
                        param_4 = uVar12;
                        if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                          func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                          uVar6 = in_stack_00000030;
                          func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                          param_3 = auStack_7ffffffe + 0x800004ce;
                          param_5 = unaff_x20;
                          iVar4 = func_0x002ab2b0();
                          param_4 = uVar8;
                          if (iVar4 != 0) {
                            func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
                            uVar12 = in_stack_00000010;
                            uVar9 = uVar8;
                            if (iVar5 == 4) goto code_r0x002a3ebc;
                            param_4 = uVar8;
                            if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                              func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                              uVar6 = in_stack_00000030;
                              func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                              param_3 = auStack_7ffffffe + 0x800004ce;
                              param_5 = unaff_x20;
                              iVar5 = func_0x002ab2b0();
                              param_4 = uVar12;
                              if ((iVar5 != 0) &&
                                 (func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6),
                                 uVar8 = in_stack_00000010, param_4 = uVar12,
                                 (long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                                func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                                uVar6 = in_stack_00000030;
                                func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                                param_3 = auStack_7ffffffe + 0x800004ce;
                                param_5 = unaff_x20;
                                iVar5 = func_0x002ab2b0();
                                param_4 = uVar8;
                                if ((iVar5 != 0) &&
                                   (func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6),
                                   uVar9 = in_stack_00000010, param_4 = uVar8,
                                   (long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                                  func_0x002ac3fc(auStack_7ffffffe + 0x800004ce);
                                  uVar6 = in_stack_00000030;
                                  func_0x0036e464(unaff_x29 + -0xf0,in_stack_00000030);
                                  param_3 = auStack_7ffffffe + 0x800004ce;
                                  param_5 = unaff_x20;
                                  iVar5 = func_0x002ab2b0();
                                  param_4 = uVar9;
                                  if (iVar5 != 0) {
                                    func_0x0036e464(auStack_7ffffffe + 0x800004ce,uVar6);
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
        param_4 = *(ulong *)(unaff_x20 + 0x18);
        param_3 = unaff_x21;
        param_5 = in_stack_00000038;
        iVar4 = func_0x00381a00();
        if (iVar4 != 0) {
          uVar9 = param_4;
          if (iVar5 == 0) {
code_r0x002a3ec4:
            if ((in_stack_00000018 & 1) == 0) {
              func_0x0079dd68();
            }
            else if (in_stack_00000018 >> (ulong)(in_stack_00000048._4_4_ & 0x1f) == 0) {
              unaff_x21 = auStack_7ffffffe + (ulong)(in_stack_00000018 >> 1) * 0x48 + 0x8000004e;
              puVar14 = &UNK_002a3efc;
              goto code_r0x002a4078;
            }
            func_0x0079dd90();
            param_4 = uVar9;
            uVar6 = unaff_x28;
          }
          else if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
            param_4 = *(ulong *)(unaff_x20 + 0x18);
            param_3 = unaff_x21;
            param_5 = in_stack_00000038;
            iVar4 = func_0x00381a00();
            if (iVar4 != 0) {
              uVar9 = param_4;
              if (iVar5 == 1) goto code_r0x002a3ec4;
              if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                param_4 = *(ulong *)(unaff_x20 + 0x18);
                param_3 = unaff_x21;
                param_5 = in_stack_00000038;
                iVar4 = func_0x00381a00();
                if (iVar4 != 0) {
                  uVar9 = param_4;
                  if (iVar5 == 2) goto code_r0x002a3ec4;
                  if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                    param_4 = *(ulong *)(unaff_x20 + 0x18);
                    param_3 = unaff_x21;
                    param_5 = in_stack_00000038;
                    iVar4 = func_0x00381a00();
                    if (iVar4 != 0) {
                      uVar9 = param_4;
                      if (iVar5 == 3) goto code_r0x002a3ec4;
                      if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                        param_4 = *(ulong *)(unaff_x20 + 0x18);
                        param_3 = unaff_x21;
                        param_5 = in_stack_00000038;
                        iVar4 = func_0x00381a00();
                        if (iVar4 != 0) {
                          uVar9 = param_4;
                          if (iVar5 == 4) goto code_r0x002a3ec4;
                          if ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19) {
                            param_4 = *(ulong *)(unaff_x20 + 0x18);
                            param_3 = unaff_x21;
                            param_5 = in_stack_00000038;
                            iVar5 = func_0x00381a00();
                            if ((iVar5 != 0) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                              param_4 = *(ulong *)(unaff_x20 + 0x18);
                              param_3 = unaff_x21;
                              param_5 = in_stack_00000038;
                              iVar5 = func_0x00381a00();
                              if ((iVar5 != 0) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
                                param_4 = *(ulong *)(unaff_x20 + 0x18);
                                param_3 = unaff_x21;
                                param_5 = in_stack_00000038;
                                iVar5 = func_0x00381a00();
                                uVar9 = param_4;
                                if (iVar5 != 0) goto code_r0x002a3ec4;
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
      unaff_x28 = uVar6;
      goto LAB_002a3f98;
    }
    puVar14 = &UNK_002a3884;
    auVar15 = auVar2;
    auVar16 = auVar3;
  }
code_r0x002a4078:
  *(ulong *)((long)register0x00000008 + -0x40) = unaff_x28;
  *(ulong *)((long)register0x00000008 + -0x38) = unaff_x27;
  *(ulong *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(long *)((long)register0x00000008 + -0x28) = auVar15._0_8_;
  *(long *)((long)register0x00000008 + -0x20) = lVar13;
  *(long *)((long)register0x00000008 + -0x18) = auVar15._8_8_;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar14;
  *(undefined8 *)((long)register0x00000008 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8
  ;
  if ((unaff_x19 < 10) && ((long)*(int *)(unaff_x20 + 0x20) == unaff_x19)) {
    if (unaff_x19 < 2) {
      if (auVar16._8_8_ == unaff_x21) {
        func_0x002ac3fc((undefined1 *)((long)register0x00000008 + -0x168));
        func_0x0036e464((undefined1 *)((long)register0x00000008 + -0xd8),unaff_x19 << 4);
      }
      else {
        func_0x002abe4c();
      }
      unaff_x21 = (undefined1 *)((long)register0x00000008 + -0x168);
      iVar5 = func_0x002ab2b0(auVar16._0_8_,unaff_x19,unaff_x21,unaff_x19 << 1,unaff_x20);
      if (iVar5 != 0) {
        uVar6 = func_0x0036e464((undefined1 *)((long)register0x00000008 + -0x168),unaff_x19 << 4);
        goto code_r0x002a4150;
      }
    }
    else {
      uVar6 = func_0x00381a00(auVar16._0_8_);
      if ((int)uVar6 != 0) {
code_r0x002a4150:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x48))
        {
          return uVar6;
        }
        goto code_r0x002a4184;
      }
    }
  }
  _abort();
code_r0x002a4184:
  auVar15 = ___stack_chk_fail();
  if ((ulong)unaff_x21 >> 6 < auVar15._8_8_) {
    return (ulong)((uint)(*(ulong *)(auVar15._0_8_ + ((ulong)unaff_x21 >> 6) * 8) >>
                         ((ulong)unaff_x21 & 0x3f)) & 1);
  }
  return 0;
}

