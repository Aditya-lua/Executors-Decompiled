
/* WARNING: Possible PIC construction at 0x005e1508: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005e1a28: Changing call to branch */

void thunk_FUN_005e14f4(undefined8 param_1,undefined8 param_2,ulong param_3,undefined8 param_4,
                       ulong param_5)

{
  byte *pbVar1;
  long *plVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  byte *pbVar10;
  byte *pbVar11;
  code *pcVar12;
  undefined1 *puVar13;
  bool bVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  undefined *puVar18;
  long lVar19;
  byte *pbVar20;
  undefined8 uVar21;
  long *plVar22;
  long *extraout_x8;
  ulong *extraout_x8_00;
  ulong uVar23;
  ulong uVar24;
  byte *extraout_x9;
  ulong uVar25;
  long *plVar26;
  byte bVar27;
  uint uVar28;
  int unaff_w19;
  ulong uVar29;
  byte *pbVar30;
  byte *pbVar31;
  undefined8 uVar32;
  byte **ppbVar33;
  byte bVar34;
  byte *pbVar35;
  byte *pbVar36;
  long *plVar37;
  byte *pbVar38;
  ulong uVar39;
  ulong uVar40;
  undefined1 *unaff_x29;
  ushort uVar41;
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  long in_stack_00000048;
  ulong uStack_210;
  ulong uStack_208;
  ulong uStack_200;
  ulong uStack_1f8;
  ulong uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  ulong uStack_1d8;
  undefined *puStack_178;
  undefined1 auStack_170 [8];
  long *plStack_168;
  ulong uStack_160;
  byte *pbStack_158;
  long lStack_150;
  long lStack_148;
  uint uStack_13c;
  ulong uStack_138;
  undefined *puStack_130;
  undefined1 auStack_128 [16];
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  byte *pbStack_f0;
  undefined8 uStack_e8;
  undefined2 uStack_e0;
  undefined *puStack_d8;
  byte *pbStack_d0;
  byte **ppbStack_c8;
  byte *pbStack_c0;
  byte *pbStack_b8;
  undefined1 auStack_b0 [16];
  byte *pbStack_a0;
  byte *pbStack_98;
  byte *pbStack_90;
  undefined2 uStack_88;
  byte *pbStack_80;
  undefined *puStack_78;
  byte *pbStack_70;
  undefined1 auStack_68 [8];
  
  if (in_stack_00000040 != 0) {
    uVar21 = 8;
    puStack_178 = (undefined *)0x5e150c;
    puVar13 = (undefined1 *)register0x00000008;
    puVar18 = (undefined *)in_stack_00000048;
    pbVar20 = (byte *)(in_stack_00000040 << 4);
    goto code_r0x00187bd4;
  }
  if ((unaff_w19 != 0) && (in_stack_00000028 != 0)) {
    param_3 = 1;
    func_0x00187bd4(in_stack_00000030,in_stack_00000028);
  }
  auStack_128 = __Unwind_Resume();
  lVar19 = auStack_128._8_8_;
  uVar21 = auStack_128._0_8_;
  puVar13 = auStack_170;
  unaff_x29 = auStack_68 + 0x58;
  if (lVar19 == 0) {
    pbStack_80 = auStack_128;
    puStack_78 = &DAT_005e2568;
    puStack_d8 = &UNK_007fc120;
    pbStack_d0 = (byte *)0x1;
    pbStack_c0 = (byte *)0x1;
    pbStack_b8 = (byte *)0x0;
    ppbStack_c8 = &pbStack_80;
    func_0x00459f08(extraout_x8,&puStack_d8);
    return;
  }
  auVar42 = func_0x0018de28();
  ppbVar33 = auVar42._8_8_;
  pbVar20 = auVar42._0_8_;
  if (ppbVar33 < (byte *)0x20) {
    uVar15 = func_0x0046c47c(pbVar20,ppbVar33);
    auVar8._8_8_ = auStack_b0._8_8_;
    auVar8._0_8_ = pbStack_a0;
    auVar7._8_8_ = pbStack_b8;
    auVar7._0_8_ = auStack_b0._0_8_;
    uVar29 = param_3 - uVar15;
    if (!(param_3 < uVar15 || uVar29 == 0)) goto LAB_005e15dc;
LAB_005e1644:
    auStack_b0._8_8_ = auVar8._8_8_;
    pbStack_a0 = auVar8._0_8_;
    pbStack_b8 = auVar7._8_8_;
    auStack_b0._0_8_ = auVar7._0_8_;
    if (lVar19 < 0) {
      uVar32 = 0;
    }
    else {
      uVar32 = 1;
      lVar16 = func_0x00187bd0(lVar19,1);
      auVar8._8_8_ = auStack_b0._8_8_;
      auVar8._0_8_ = pbStack_a0;
      auVar7._8_8_ = pbStack_b8;
      auVar7._0_8_ = auStack_b0._0_8_;
      if (lVar16 != 0) {
        _memcpy(lVar16,uVar21,lVar19);
        *extraout_x8 = lVar19;
        extraout_x8[1] = lVar16;
        extraout_x8[2] = lVar19;
        return;
      }
    }
    auStack_b0._8_8_ = auVar8._8_8_;
    pbStack_a0 = auVar8._0_8_;
    pbStack_b8 = auVar7._8_8_;
    auStack_b0._0_8_ = auVar7._0_8_;
    func_0x007a1f00(uVar32,lVar19,&UNK_009f33d8);
    auVar9._8_8_ = auStack_b0._8_8_;
    auVar9._0_8_ = pbStack_a0;
    auVar42._8_8_ = pbStack_b8;
    auVar42._0_8_ = auStack_b0._0_8_;
    pbVar38 = pbVar20;
code_r0x005e19f8:
    uVar21 = 0;
  }
  else {
    uVar15 = func_0x0046bd58(pbVar20,ppbVar33);
    auVar8._8_8_ = auStack_b0._8_8_;
    auVar8._0_8_ = pbStack_a0;
    auVar7._8_8_ = pbStack_b8;
    auVar7._0_8_ = auStack_b0._0_8_;
    uVar29 = param_3 - uVar15;
    if (!(uVar15 <= param_3 && uVar29 != 0)) goto LAB_005e1644;
LAB_005e15dc:
    pbVar38 = pbVar20 + (long)ppbVar33;
    uStack_118 = 0;
    uStack_e8 = 0;
    pbVar35 = (byte *)0x2;
    uStack_e0 = 1;
    pbStack_f0 = pbVar38;
    auVar5 = auVar42;
    auVar6 = auVar42;
    do {
      uStack_100 = auVar6._8_8_;
      uStack_f8 = auVar6._0_8_;
      uStack_110 = auVar5._8_8_;
      uStack_108 = auVar5._0_8_;
      lVar16 = func_0x005e0d84(&uStack_118);
      auVar6._8_8_ = uStack_100;
      auVar6._0_8_ = uStack_f8;
      auVar5._8_8_ = uStack_110;
      auVar5._0_8_ = uStack_108;
      pbVar35 = pbVar35 + -1;
    } while (lVar16 != 0);
    pbStack_c0 = (byte *)0x0;
    pbStack_90 = (byte *)0x0;
    uStack_88 = 1;
    pbStack_98 = pbVar38;
    auVar7 = auVar42;
    auVar8 = auVar42;
    if (pbVar35 == (byte *)0x0) goto LAB_005e1644;
    pbVar38 = (byte *)((long)ppbVar33 + -(long)pbVar35);
    auVar9 = auVar42;
    if ((long)pbVar38 < 0) goto code_r0x005e19f8;
    plStack_168 = extraout_x8;
    if (ppbVar33 == (byte **)pbVar35) {
      puVar18 = (undefined *)0x1;
code_r0x005e16a4:
      pbVar20 = (byte *)0x0;
      puStack_130 = (undefined *)0x0;
      uVar15 = -(long)pbVar35;
      pbStack_70 = (byte *)0x0;
      uStack_160 = 0;
      if (uVar15 != 0) {
        uStack_160 = uVar29 / uVar15;
      }
      pbVar35 = (byte *)(uVar29 - uStack_160 * uVar15);
      uStack_160 = uStack_160 + 1;
      pbStack_80 = pbVar38;
      puStack_78 = puVar18;
LAB_005e16ec:
      auStack_b0._8_8_ = auVar9._8_8_;
      pbStack_a0 = auVar9._0_8_;
      pbStack_b8 = auVar42._8_8_;
      auStack_b0._0_8_ = auVar42._0_8_;
      auVar43._8_8_ = ppbVar33;
      auVar43._0_8_ = pbVar38;
      puStack_d8 = (undefined *)0x0;
      if (((ulong)puStack_130 & 1) == 0) {
        auVar43 = func_0x005e0d84(&pbStack_c0);
        auVar9._8_8_ = auStack_b0._8_8_;
        auVar9._0_8_ = pbStack_a0;
        auVar42._8_8_ = pbStack_b8;
        auVar42._0_8_ = auStack_b0._0_8_;
      }
      auStack_b0._8_8_ = auVar9._8_8_;
      pbStack_a0 = auVar9._0_8_;
      pbStack_b8 = auVar42._8_8_;
      auStack_b0._0_8_ = auVar42._0_8_;
      uVar29 = auVar43._8_8_;
      if (auVar43._0_8_ == 0) {
        plStack_168[1] = (long)puStack_78;
        *plStack_168 = (long)pbStack_80;
        plStack_168[2] = (long)pbStack_70;
        return;
      }
      if ((ulong)((long)pbStack_80 - (long)pbVar20) < uVar29) {
        func_0x007afcf8(&pbStack_80,pbVar20,uVar29,1,1);
        auVar9._8_8_ = auStack_b0._8_8_;
        auVar9._0_8_ = pbStack_a0;
        auVar42._8_8_ = pbStack_b8;
        auVar42._0_8_ = auStack_b0._0_8_;
        puVar18 = puStack_78;
        pbVar20 = pbStack_70;
      }
      auStack_b0._8_8_ = auVar9._8_8_;
      pbStack_a0 = auVar9._0_8_;
      pbStack_b8 = auVar42._8_8_;
      auStack_b0._0_8_ = auVar42._0_8_;
      lStack_150 = (long)puVar18;
      _memcpy(pbVar20 + (long)puVar18,auVar43._0_8_,uVar29);
      pbVar11 = pbStack_98;
      pbVar10 = pbStack_b8;
      pbVar20 = pbVar20 + uVar29;
      bVar14 = pbVar35 != (byte *)0x0;
      pbVar38 = pbVar35 + -1;
      uStack_138 = uStack_160;
      pbVar35 = (byte *)0x0;
      if (bVar14) {
        uStack_138 = uStack_160 + 1;
        pbVar35 = pbVar38;
      }
      puStack_130 = puStack_d8;
      puVar18 = (undefined *)lStack_150;
      pbStack_70 = pbVar20;
      if (uStack_138 != 0) {
        uStack_13c = (uint)(byte)uStack_88;
        uVar29 = 1;
        lStack_148 = auStack_b0._0_8_;
        pbVar30 = pbStack_a0;
        pbVar31 = pbStack_c0;
        pbVar36 = pbStack_90;
        pbVar38 = pbStack_d0;
        pbStack_158 = pbVar35;
        bVar34 = uStack_88._1_1_;
        do {
          if (((ulong)puStack_130 & 1) == 0) {
            pbVar1 = pbVar31;
            bVar27 = bVar34;
            do {
              pbVar38 = pbVar1;
              pbVar1 = pbVar36;
              if ((bVar27 & 1) != 0) {
LAB_005e1938:
                pbVar38 = (byte *)0x0;
                pbStack_c0 = pbVar31;
                pbStack_a0 = pbVar30;
                pbStack_90 = pbVar36;
                goto LAB_005e1948;
              }
              do {
                while( true ) {
                  while( true ) {
                    do {
                      pbVar36 = pbVar1;
                      if (pbVar30 == pbVar11) {
                        bVar34 = 1;
                        if (((uStack_13c & 1) == 0) && (pbVar10 == pbVar38)) goto LAB_005e1938;
                        bVar27 = 1;
                        pbVar35 = pbVar10 + -(long)pbVar38;
                        pbVar1 = pbVar38;
                        goto joined_r0x005e191c;
                      }
                      pbVar35 = pbVar30 + 1;
                      uVar28 = (uint)*pbVar30;
                      uVar15 = (ulong)uVar28;
                      if ((char)*pbVar30 < '\0') {
                        if (uVar28 < 0xe0) {
                          pbVar35 = pbVar30 + 2;
                          uVar15 = (ulong)(pbVar30[1] & 0x3f | (uVar28 & 0x1f) << 6);
                        }
                        else {
                          uVar3 = pbVar30[2] & 0x3f | (pbVar30[1] & 0x3f) << 6;
                          if (uVar28 < 0xf0) {
                            pbVar35 = pbVar30 + 3;
                            uVar15 = (ulong)(uVar3 | (uVar28 & 0x1f) << 0xc);
                          }
                          else {
                            pbVar35 = pbVar30 + 4;
                            uVar15 = (ulong)(pbVar30[3] & 0x3f | uVar3 << 6 | (uVar28 & 7) << 0x12);
                          }
                        }
                      }
                      pbVar1 = pbVar35 + ((long)pbVar36 - (long)pbVar30);
                      uVar28 = (uint)uVar15;
                      pbVar30 = pbVar35;
                      if (uVar28 < 0x21 && (1L << (uVar15 & 0x3f) & 0x100003e00U) != 0)
                      goto code_r0x005e17e8;
                      pbVar35 = pbVar36;
                    } while (uVar28 < 0x80);
                    uVar3 = uVar28 >> 8;
                    if (0x1f < uVar3) break;
                    if (uVar3 == 0) {
                      if (((&
                           __ZN4core7unicode12unicode_data11white_space14WHITESPACE_MAP17h271c64803ec2808fE
                           )[uVar15 & 0xff] & 1) != 0) goto code_r0x005e17e8;
                    }
                    else if ((uVar3 == 0x16) && (uVar28 == 0x1680)) goto code_r0x005e17e8;
                  }
                  if (uVar3 == 0x20) break;
                  if ((uVar3 == 0x30) && (uVar28 == 0x3000)) goto code_r0x005e17e8;
                }
              } while (((byte)(&
                              __ZN4core7unicode12unicode_data11white_space14WHITESPACE_MAP17h271c64803ec2808fE
                              )[uVar15 & 0xff] >> 1 & 1) == 0);
code_r0x005e17e8:
              bVar27 = 0;
              pbVar35 = pbVar36 + -(long)pbVar38;
              pbVar31 = pbVar1;
              pbVar36 = pbVar1;
joined_r0x005e191c:
            } while (pbVar35 == (byte *)0x0);
            pbVar38 = pbVar38 + lStack_148;
            pbStack_c0 = pbVar31;
            pbStack_a0 = pbVar30;
            pbStack_90 = pbVar36;
LAB_005e1948:
            uStack_88 = CONCAT11(bVar34,(byte)uStack_88);
            puStack_d8 = (undefined *)0x1;
            puStack_130 = (undefined *)0x1;
            pbVar30 = pbStack_a0;
            pbVar31 = pbStack_c0;
            pbVar36 = pbStack_90;
            pbStack_d0 = pbVar38;
            ppbStack_c8 = (byte **)pbVar35;
          }
          if (pbVar38 != (byte *)0x0) {
            if (pbStack_80 == pbVar20) {
              func_0x007afcf8(&pbStack_80,pbVar20,1,1,1);
              puVar18 = puStack_78;
              pbVar20 = pbStack_70;
              pbVar35 = extraout_x9;
            }
            pbVar20[(long)puVar18] = 0x20;
            pbVar20 = pbVar20 + 1;
            pbStack_70 = pbVar20;
          }
          if (uStack_138 <= uVar29) goto code_r0x005e16d8;
          uVar29 = uVar29 + 1;
        } while( true );
      }
      goto code_r0x005e16e4;
    }
    uVar21 = 1;
    pbStack_b8 = (byte *)ppbVar33;
    pbStack_a0 = pbVar20;
    auStack_b0 = auVar42;
    puVar18 = (undefined *)func_0x00187bd0(pbVar38,1);
    auVar9._8_8_ = auStack_b0._8_8_;
    auVar9._0_8_ = pbStack_a0;
    auVar42._8_8_ = pbStack_b8;
    auVar42._0_8_ = auStack_b0._0_8_;
    if (puVar18 != (undefined *)0x0) goto code_r0x005e16a4;
  }
  auStack_b0._8_8_ = auVar9._8_8_;
  pbStack_a0 = auVar9._0_8_;
  pbStack_b8 = auVar42._8_8_;
  auStack_b0._0_8_ = auVar42._0_8_;
  plVar22 = (long *)&UNK_009f3450;
  uVar21 = func_0x007a1f00(uVar21,pbVar38);
  if (pbStack_80 != (byte *)0x0) {
    uVar21 = 1;
    puStack_178 = &UNK_005e1a2c;
    puVar13 = auStack_170;
    puVar18 = puStack_78;
    pbVar20 = pbStack_80;
    goto code_r0x00187bd4;
  }
  auVar42 = __Unwind_Resume(uVar21);
  uVar29 = auVar42._8_8_;
  lVar19 = auVar42._0_8_;
  puStack_178 = &
                __ZN54__LT_str_u20_as_u20_array_tool__string__SubstMarks_GT_11subst_marks17h39f8b3d83948db96E
  ;
  if ((long)uVar29 < 0) {
    uVar21 = 0;
LAB_005e1df0:
    func_0x007a1f00(uVar21,uVar29,&UNK_009f3468);
LAB_005e1e04:
                    /* WARNING: Does not return */
    pcVar12 = (code *)SoftwareBreakpoint(1,0x5e1e08);
    (*pcVar12)();
  }
  if (uVar29 == 0) {
    uVar15 = 0;
    uVar17 = 1;
    uStack_210 = 0;
    uStack_208 = 1;
    uStack_200 = 0;
  }
  else {
    uVar21 = 1;
    uVar17 = func_0x00187bd0(uVar29,1);
    if (uVar17 == 0) goto LAB_005e1df0;
    uVar15 = 0;
    uVar40 = 0;
    uVar39 = 0;
    lVar16 = 0;
    uStack_200 = 0;
    plVar37 = (long *)plVar22[1];
    uVar25 = plVar22[2] & 0xfffffffffffffff8;
    plVar2 = plVar37 + uVar25;
    uVar23 = plVar22[2] & 7;
    uStack_210 = uVar29;
    uStack_208 = uVar17;
    do {
      uVar39 = uVar39 + 1;
      if (uVar39 < uVar29) {
        if (-0x41 < *(char *)(lVar19 + uVar39)) goto LAB_005e1b30;
      }
      else {
LAB_005e1b30:
        uVar24 = uVar25 ^ 0xfffffffffffffff8;
        plVar26 = plVar37;
        do {
          uVar24 = uVar24 + 8;
          if (uVar24 == 0) {
            if ((uVar23 == 0) ||
               ((*plVar2 != lVar16 &&
                ((uVar23 == 1 ||
                 ((plVar2[1] != lVar16 &&
                  ((uVar23 == 2 ||
                   ((plVar2[2] != lVar16 &&
                    ((uVar23 == 3 ||
                     ((plVar2[3] != lVar16 &&
                      ((uVar23 == 4 ||
                       ((plVar2[4] != lVar16 &&
                        ((uVar23 == 5 ||
                         ((plVar2[5] != lVar16 &&
                          ((uVar23 == 6 || ((plVar2[6] != lVar16 && (uVar23 == 7))))))))))))))))))))
                  )))))))) {
              uVar24 = uVar39 - uVar40;
              if ((uVar39 < uVar40) ||
                 ((((uVar40 != 0 && (uVar40 < uVar29)) && (*(char *)(lVar19 + uVar40) < -0x40)) ||
                  ((uVar39 < uVar29 && (*(char *)(lVar19 + uVar39) < -0x40)))))) {
                func_0x007a297c(lVar19,uVar29,uVar40,uVar39,&UNK_009f3498);
                goto LAB_005e1e04;
              }
              if (uStack_210 - uVar15 < uVar24) {
                func_0x007afcf8(&uStack_210,uVar15,uVar24,1,1);
                uVar15 = uStack_200;
                uVar17 = uStack_208;
              }
              _memcpy(uVar17 + uVar15,lVar19 + uVar40,uVar24);
              uStack_200 = uVar15 + uVar24;
              goto LAB_005e1b0c;
            }
            break;
          }
          auVar4._2_2_ = -(ushort)(plVar26[1] == lVar16);
          auVar4._0_2_ = -(ushort)(*plVar26 == lVar16);
          auVar4._4_2_ = -(ushort)(plVar26[2] == lVar16);
          auVar4._6_2_ = -(ushort)(plVar26[3] == lVar16);
          auVar4._8_2_ = -(ushort)(plVar26[4] == lVar16);
          auVar4._10_2_ = -(ushort)(plVar26[5] == lVar16);
          auVar4._12_2_ = -(ushort)(plVar26[6] == lVar16);
          auVar4._14_2_ = -(ushort)(plVar26[7] == lVar16);
          uVar41 = NEON_umaxv(auVar4,2);
          plVar26 = plVar26 + 8;
        } while ((uVar41 & 1) == 0);
        if (uStack_210 - uVar15 < param_5) {
          func_0x007afcf8(&uStack_210,uVar15,param_5,1,1);
          uVar15 = uStack_200;
          uVar17 = uStack_208;
        }
        _memcpy(uVar17 + uVar15,param_4,param_5);
        uStack_200 = uVar15 + param_5;
LAB_005e1b0c:
        lVar16 = lVar16 + 1;
        uVar15 = uStack_200;
        uVar40 = uVar39;
      }
    } while (uVar39 != uVar29);
    uVar29 = uStack_210;
  }
  func_0x0046b8d0(&uStack_1f8,uVar17,uVar15);
  uVar39 = uVar15;
  uVar40 = uVar17;
  if (((uint)uStack_1f8 & 1) != 0) {
    if (uVar29 != 0x8000000000000000) {
      uStack_1d8 = uStack_1e8;
      uStack_1e0 = uStack_1f0;
      uStack_1f8 = uVar29;
      uStack_1f0 = uVar17;
      uStack_1e8 = uVar15;
      func_0x007a2810(&UNK_008b916f,0x24,&uStack_1f8,&UNK_009f3378,&UNK_009f3480);
      goto LAB_005e1e04;
    }
    uVar39 = uStack_1f0;
    uVar40 = uVar15;
    uVar29 = uVar17;
  }
  *extraout_x8_00 = uVar29;
  extraout_x8_00[1] = uVar40;
  extraout_x8_00[2] = uVar39;
  if (*plVar22 == 0) {
    return;
  }
  puVar18 = (undefined *)plVar22[1];
  pbVar20 = (byte *)(*plVar22 << 3);
  uVar21 = 8;
code_r0x00187bd4:
  *(undefined1 **)(puVar13 + -0x10) = unaff_x29;
  *(undefined **)(puVar13 + -8) = puStack_178;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puVar18,pbVar20,uVar21);
  return;
code_r0x005e16d8:
  puStack_130 = puStack_d8;
  pbVar35 = pbStack_158;
code_r0x005e16e4:
  auVar9._8_8_ = auStack_b0._8_8_;
  auVar9._0_8_ = pbStack_a0;
  auVar42._8_8_ = pbStack_b8;
  auVar42._0_8_ = auStack_b0._0_8_;
  ppbVar33 = ppbStack_c8;
  pbVar38 = pbStack_d0;
  goto LAB_005e16ec;
}

