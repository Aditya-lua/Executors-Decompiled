
dword * FUN_0050873c(dword *param_1,long param_2,undefined4 *param_3,dword *param_4)

{
  undefined4 *puVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  long lVar5;
  undefined2 uVar6;
  uint uVar7;
  uint uVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  code *pcVar18;
  bool bVar19;
  byte *pbVar20;
  ulong uVar21;
  dword *pdVar22;
  dword *pdVar23;
  dword *pdVar24;
  dword *pdVar25;
  undefined8 uVar26;
  undefined *puVar27;
  undefined1 *puVar28;
  undefined4 *puVar29;
  undefined4 *puVar30;
  undefined *puVar31;
  undefined *puVar32;
  dword *pdVar33;
  byte *pbVar34;
  long lVar35;
  undefined1 *puVar36;
  dword *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  undefined8 *extraout_x8_03;
  byte *pbVar37;
  byte *pbVar38;
  ulong uVar39;
  dword *pdVar40;
  long lVar41;
  undefined *puVar42;
  undefined1 (*pauVar43) [16];
  byte *pbVar44;
  ulong *unaff_x19;
  undefined8 *puVar45;
  byte *pbVar46;
  ulong unaff_x20;
  undefined4 *unaff_x21;
  byte *pbVar47;
  code *pcVar48;
  ulong *puVar49;
  uint uVar50;
  dword *unaff_x24;
  undefined8 uVar51;
  uint uVar52;
  undefined8 uVar53;
  undefined1 *puVar54;
  byte *pbVar55;
  ulong uVar56;
  dword *pdVar57;
  byte bVar58;
  byte bVar59;
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  ulong uVar63;
  byte bVar64;
  undefined1 auVar65 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  char acStack_29c [4];
  undefined4 uStack_298;
  byte bStack_292;
  byte bStack_291;
  dword *pdStack_290;
  long lStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  ulong uStack_270;
  dword *pdStack_268;
  undefined1 auStack_260 [16];
  undefined *puStack_248;
  long ***ppplStack_240;
  undefined *puStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  ulong uStack_220;
  dword *pdStack_218;
  ulong uStack_210;
  undefined *puStack_208;
  ulong uStack_200;
  undefined *puStack_1f8;
  long **pplStack_1f0;
  undefined8 uStack_1e8;
  ulong uStack_1d8;
  ulong uStack_1d0;
  ulong uStack_1c8;
  undefined8 uStack_1c0;
  dword *pdStack_1b8;
  ulong uStack_1b0;
  dword *pdStack_1a8;
  long *plStack_180;
  undefined *puStack_178;
  ulong *puStack_170;
  undefined8 uStack_168;
  long lStack_160;
  ulong uStack_158;
  ulong uStack_150;
  long lStack_148;
  undefined *puStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  dword *pdStack_110;
  long lStack_c0;
  undefined *puStack_b8;
  dword *pdStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  undefined *puStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  ulong uStack_60;
  
  lVar35 = param_2 * 0x18;
  uVar56 = lVar35 - 0x18;
  uVar39 = (uVar56 >> 3) * -0x5555555555555555;
  auVar65._8_8_ = 0;
  auVar65._0_8_ = param_4;
  auVar62._8_8_ = 0;
  auVar62._0_8_ = uVar39;
  pdVar22 = param_4;
  if (SUB168(auVar65 * auVar62,8) == 0) {
    unaff_x20 = (long)param_4 * uVar39;
    pdVar25 = param_1;
    do {
      if (lVar35 == 0) goto LAB_005087b0;
      pdVar24 = pdVar25 + 4;
      pdVar25 = pdVar25 + 6;
      lVar35 = lVar35 + -0x18;
      bVar19 = CARRY8(unaff_x20,*(ulong *)pdVar24);
      unaff_x20 = *(ulong *)pdVar24 + unaff_x20;
      unaff_x21 = param_3;
      unaff_x24 = param_1;
    } while (!bVar19);
  }
  param_1 = unaff_x24;
  param_3 = unaff_x21;
  func_0x007a23d8(&UNK_008a49a9,0x35,&UNK_009e8d08);
LAB_005087b0:
  if ((long)unaff_x20 < 0) {
    uVar53 = 0;
LAB_00508aa0:
    puVar29 = (undefined4 *)&UNK_009e8d20;
    uVar53 = func_0x007a1f00(uVar53,unaff_x20);
    if (uStack0000000000000008 != 0) {
      puVar29 = (undefined4 *)((long)&MACH_HEADER.magic + 1);
      func_0x00187bd4(in_stack_00000010);
    }
    auVar65 = __Unwind_Resume(uVar53);
    pdVar25 = auVar65._8_8_;
    pdVar24 = auVar65._0_8_;
    if (pdVar25 == (dword *)0x0) {
      *(ulong *)extraout_x8 = 0;
      *(ulong *)(extraout_x8 + 2) = 1;
      *(ulong *)(extraout_x8 + 4) = 0;
      return pdVar24;
    }
    lVar35 = (long)pdVar25 * 0x18;
    pdVar57 = (dword *)(lVar35 + -0x18);
    uVar39 = ((ulong)pdVar57 >> 3) * -0x5555555555555555;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = pdVar22;
    auVar12._8_8_ = 0;
    auVar12._0_8_ = uVar39;
    pdVar23 = pdVar22;
    uStack_60 = uVar56;
    if (SUB168(auVar9 * auVar12,8) == 0) {
      unaff_x20 = (long)pdVar22 * uVar39;
      pdVar33 = pdVar24;
      do {
        if (lVar35 == 0) goto code_r0x00508b74;
        pdVar40 = pdVar33 + 4;
        pdVar33 = pdVar33 + 6;
        lVar35 = lVar35 + -0x18;
        bVar19 = CARRY8(unaff_x20,*(ulong *)pdVar40);
        unaff_x20 = *(ulong *)pdVar40 + unaff_x20;
        param_3 = puVar29;
        param_1 = pdVar24;
      } while (!bVar19);
    }
    pdVar24 = param_1;
    puVar29 = param_3;
    func_0x007a23d8(&UNK_008a49a9,0x35,&UNK_009e8d08);
code_r0x00508b74:
    if ((long)unaff_x20 < 0) {
      uVar53 = 0;
code_r0x00508e64:
      puVar30 = (undefined4 *)&UNK_009e8d20;
      pdVar24 = (dword *)func_0x007a1f00(uVar53,unaff_x20);
      pdVar22 = extraout_x8;
      if (uStack_a8 != 0) {
        puVar30 = (undefined4 *)((long)&MACH_HEADER.magic + 1);
        func_0x00187bd4(uStack_a0);
        pdVar22 = pdVar24;
      }
      auVar65 = __Unwind_Resume(pdVar24);
      lVar35 = auVar65._8_8_;
      pdVar24 = auVar65._0_8_;
      puStack_b8 = &DAT_00508e9c;
      if (lVar35 == 0) {
        *extraout_x8_00 = 0;
        extraout_x8_00[1] = 1;
        extraout_x8_00[2] = 0;
        return pdVar24;
      }
      lVar41 = lVar35 * 0x10;
      uVar56 = lVar41 - 0x10;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = pdVar23;
      auVar13._8_8_ = 0;
      auVar13._0_8_ = uVar56 >> 4;
      pdVar33 = pdVar23;
      pdStack_110 = pdVar57;
      lStack_c0 = (long)register0x00000008 + -0x10;
      if (SUB168(auVar10 * auVar13,8) == 0) {
        pdVar57 = pdVar24 + lVar35 * 4;
        pdVar22 = pdVar24 + 4;
        unaff_x20 = (long)pdVar23 * (uVar56 >> 4);
        pdVar40 = pdVar24;
        do {
          puStack_170 = extraout_x8_00;
          if (lVar41 == 0) goto code_r0x00508f2c;
          pdVar25 = pdVar40 + 2;
          pdVar40 = pdVar40 + 4;
          lVar41 = lVar41 + -0x10;
          bVar19 = CARRY8(unaff_x20,*(ulong *)pdVar25);
          unaff_x20 = *(ulong *)pdVar25 + unaff_x20;
          puVar29 = puVar30;
          pdVar25 = pdVar24;
        } while (!bVar19);
      }
      pdVar24 = pdVar25;
      puVar30 = puVar29;
      func_0x007a23d8(&UNK_008a49a9,0x35,&UNK_009e8d08);
      puStack_170 = extraout_x8_01;
code_r0x00508f2c:
      if ((long)unaff_x20 < 0) {
        uVar53 = 0;
code_r0x00509218:
        puVar31 = &UNK_009e8d20;
        uVar26 = func_0x007a1f00(uVar53,unaff_x20);
        if (uStack_158 != 0) {
          puVar31 = (undefined *)0x1;
          func_0x00187bd4(uStack_150);
        }
        auVar65 = __Unwind_Resume(uVar26);
        uVar39 = auVar65._8_8_;
        auVar17._8_8_ = puVar31;
        auVar17._0_8_ = uVar39;
        auVar16._8_8_ = puVar31;
        auVar16._0_8_ = uVar39;
        pdVar22 = auVar65._0_8_;
        puStack_178 = &DAT_00509250;
        if (puVar31 == (undefined *)0x0) {
          *extraout_x8_02 = 0;
          extraout_x8_02[1] = 1;
          extraout_x8_02[2] = 0;
          return pdVar22;
        }
        auVar11._8_8_ = 0;
        auVar11._0_8_ = uVar39;
        auVar14._8_8_ = 0;
        auVar14._0_8_ = puVar31;
        uStack_1c0 = uVar53;
        pdStack_1b8 = pdVar24;
        uStack_1b0 = uVar56;
        pdStack_1a8 = pdVar23;
        plStack_180 = &lStack_c0;
        if (SUB168(auVar11 * auVar14,8) == 0) {
          unaff_x20 = uVar39 * (long)puVar31;
          if ((long)unaff_x20 < 0) goto LAB_005093b8;
          if (unaff_x20 == 0) {
            uStack_1d0 = 1;
            if (uVar39 != 0) {
LAB_00509380:
              uStack_1c8 = 0;
              uStack_1d8 = unaff_x20;
              func_0x007a5594(&uStack_1d8,0,uVar39,1,1);
              goto LAB_005092d0;
            }
LAB_005092cc:
            uStack_1c8 = 0;
            uStack_1d8 = unaff_x20;
LAB_005092d0:
            uVar56 = uStack_1c8;
            uVar21 = uStack_1d0;
            pdVar22 = (dword *)_memcpy(uStack_1d0 + uStack_1c8,pdVar22,uVar39);
            uVar56 = uVar56 + uVar39;
            uStack_1c8 = uVar56;
            if (puVar31 != (undefined *)0x1) {
              do {
                pdVar22 = (dword *)_memcpy(uVar21 + uVar56,uVar21,uVar56);
                uVar56 = uVar56 << 1;
                bVar19 = (undefined *)0x3 < puVar31;
                puVar31 = (undefined *)((ulong)puVar31 >> 1);
              } while (bVar19);
              uStack_1c8 = uVar56;
            }
            if (unaff_x20 - uStack_1c8 != 0) {
              pdVar22 = (dword *)_memcpy(uVar21 + uStack_1c8,uVar21,unaff_x20 - uStack_1c8);
              uStack_1c8 = unaff_x20;
            }
            extraout_x8_02[1] = uStack_1d0;
            *extraout_x8_02 = uStack_1d8;
            extraout_x8_02[2] = uStack_1c8;
            return pdVar22;
          }
          uVar26 = 1;
          uVar21 = func_0x00187bd0(unaff_x20,1);
          pdVar23 = pdVar22;
          if (uVar21 != 0) {
            uStack_1d0 = uVar21;
            if (unaff_x20 < uVar39) goto LAB_00509380;
            goto LAB_005092cc;
          }
        }
        else {
          func_0x007a23d8(&UNK_008a4abd,0x11,&UNK_009e8d90);
LAB_005093b8:
          uVar26 = 0;
        }
        puVar32 = &UNK_009e8d60;
        puVar27 = (undefined *)func_0x007a1f00(uVar26,unaff_x20);
        if (uStack_1d8 != 0) {
          puVar32 = (undefined *)0x1;
          func_0x00187bd4(uStack_1d0);
        }
        auVar65 = __Unwind_Resume(puVar27);
        uStack_1e8 = 0x5093f0;
        uVar51 = 0;
        uVar21 = (long)puVar32 * 0x10;
        uStack_230 = uVar53;
        uStack_228 = uVar26;
        uStack_220 = uVar56;
        pdStack_218 = pdVar23;
        uStack_210 = uVar39;
        puStack_208 = puVar31;
        uStack_200 = unaff_x20;
        puStack_1f8 = puVar27;
        pplStack_1f0 = &plStack_180;
        if ((ulong)puVar32 >> 0x3c == 0) {
          auVar16 = auVar17;
          if (uVar21 < 0x7ffffffffffffff9) {
            if (uVar21 == 0) {
              puVar31 = (undefined *)0x0;
              pdVar22 = &MACH_HEADER.cpusubtype;
              if ((undefined *)0x1 < puVar32) goto LAB_00509468;
LAB_0050948c:
              pdVar25 = pdVar22;
              if (puVar32 == (undefined *)0x0) goto LAB_005094f8;
            }
            else {
              uVar51 = 8;
              pdVar22 = (dword *)func_0x00187bd0(uVar21,8);
              puVar27 = puVar32;
              auVar16 = auVar65;
              if (pdVar22 == (dword *)0x0)
              goto __ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE;
              puVar31 = puVar32;
              if (puVar32 < (undefined *)0x2) goto LAB_0050948c;
LAB_00509468:
              if (puVar32 < (undefined *)0x9) {
                uVar56 = 1;
                pdVar25 = pdVar22;
              }
              else {
                puVar42 = (undefined *)((ulong)(puVar32 + -1) & 0xfffffffffffffff8);
                pdVar25 = pdVar22 + (long)puVar42 * 4;
                uVar56 = (ulong)puVar42 | 1;
                auVar61._8_8_ = 0;
                auVar61._0_8_ = auVar65._8_8_;
                auVar15[8] = auVar65[0];
                auVar15._0_8_ = auVar65._0_8_;
                auVar15[9] = auVar65[1];
                auVar15[10] = auVar65[2];
                auVar15[0xb] = auVar65[3];
                auVar15[0xc] = auVar65[4];
                auVar15[0xd] = auVar65[5];
                auVar15[0xe] = auVar65[6];
                auVar15[0xf] = auVar65[7];
                auVar62 = NEON_ext(auVar15,auVar61,8,1);
                pauVar43 = (undefined1 (*) [16])(pdVar22 + 0x10);
                puVar27 = puVar42;
                do {
                  pauVar43[-4] = auVar65;
                  uVar26 = auVar62._8_8_;
                  *(undefined8 *)(pauVar43[-3] + 8) = uVar26;
                  uVar53 = auVar62._0_8_;
                  *(undefined8 *)pauVar43[-3] = uVar53;
                  pauVar43[-2] = auVar65;
                  *(undefined8 *)(pauVar43[-1] + 8) = uVar26;
                  *(undefined8 *)pauVar43[-1] = uVar53;
                  *pauVar43 = auVar65;
                  *(undefined8 *)(pauVar43[1] + 8) = uVar26;
                  *(undefined8 *)pauVar43[1] = uVar53;
                  pauVar43[2] = auVar65;
                  *(undefined8 *)(pauVar43[3] + 8) = uVar26;
                  *(undefined8 *)pauVar43[3] = uVar53;
                  pauVar43 = pauVar43 + 8;
                  puVar27 = puVar27 + -8;
                } while (puVar27 != (undefined *)0x0);
                if (puVar32 + -1 == puVar42) goto LAB_005094f4;
              }
              lVar35 = (long)puVar32 - uVar56;
              pdVar24 = pdVar25;
              do {
                *(undefined1 (*) [16])pdVar24 = auVar65;
                lVar35 = lVar35 + -1;
                pdVar25 = pdVar24 + 4;
                pdVar24 = pdVar24 + 4;
              } while (lVar35 != 0);
            }
LAB_005094f4:
            *(undefined1 (*) [16])pdVar25 = auVar65;
LAB_005094f8:
            *extraout_x8_03 = puVar31;
            extraout_x8_03[1] = pdVar22;
            extraout_x8_03[2] = puVar32;
            return pdVar22;
          }
        }
__ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE:
        auVar65 = func_0x007a1f00(uVar51,uVar21,pdVar33);
        pbVar46 = *(byte **)(auVar65._0_8_ + 8);
        pbVar20 = *(byte **)(auVar65._0_8_ + 0x10);
        puStack_238 = &DAT_00509528;
        uVar26 = *auVar65._8_8_;
        lVar41 = auVar65._8_8_[1];
        pcVar18 = *(code **)(lVar41 + 0x20);
        pdStack_290 = pdVar57;
        lStack_288 = lVar35;
        uStack_280 = uVar53;
        uStack_278 = uVar51;
        uStack_270 = uVar21;
        pdStack_268 = pdVar33;
        puStack_248 = puVar27;
        ppplStack_240 = &pplStack_1f0;
        auStack_260 = auVar16;
        uVar56 = (*pcVar18)(uVar26,0x22);
        if ((uVar56 & 1) == 0) {
          if (pbVar20 == (byte *)0x0) {
            pbVar37 = (byte *)0x0;
            pbVar47 = (byte *)0x0;
          }
          else {
            pbVar47 = (byte *)0x0;
            pbVar34 = pbVar46;
            pbVar38 = pbVar20;
            pbVar55 = (byte *)0x0;
            do {
              while( true ) {
                pbVar44 = (byte *)0x0;
                pbVar2 = pbVar34 + (long)pbVar38;
                while( true ) {
                  bVar58 = pbVar34[(long)pbVar44];
                  if (((bVar58 - 0x7f < 0xffffffa1) || (bVar58 == 0x22)) || (bVar58 == 0x5c)) break;
                  pbVar44 = pbVar44 + 1;
                  if (pbVar38 == pbVar44) {
                    pbVar37 = pbVar38 + (long)pbVar55;
                    goto code_r0x0046accc;
                  }
                }
                pbVar37 = pbVar55 + (long)pbVar44;
                pbVar38 = pbVar34 + (long)pbVar44;
                uVar50 = (uint)*pbVar38;
                if ((char)*pbVar38 < '\0') break;
                pbVar34 = pbVar38 + 1;
code_r0x0046ab60:
                func_0x004623d8(acStack_29c,uVar50,&UNK_00010001);
                if ((acStack_29c[0] != -0x80) && ((byte)(bStack_291 - bStack_292) != '\x01')) {
                  if (pbVar37 < pbVar47) goto code_r0x0046ad84;
                  if (pbVar47 != (byte *)0x0) {
                    if (pbVar47 < pbVar20) {
                      if (-0x41 < (char)pbVar46[(long)pbVar47]) goto code_r0x0046abc0;
                    }
                    else if (pbVar47 == pbVar20) goto code_r0x0046abc0;
                    goto code_r0x0046ad84;
                  }
code_r0x0046abc0:
                  if (pbVar37 != (byte *)0x0) {
                    if (pbVar37 < pbVar20) {
                      if ((char)(pbVar46 + (long)pbVar55)[(long)pbVar44] < -0x40)
                      goto code_r0x0046ad84;
                    }
                    else if (pbVar37 != pbVar20) {
code_r0x0046ad84:
                      func_0x007a297c(pbVar46,pbVar20,pbVar47,pbVar55 + (long)pbVar44,&UNK_009e06f8)
                      ;
                      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
                    }
                  }
                  pcVar48 = *(code **)(lVar41 + 0x18);
                  uVar56 = (*pcVar48)(uVar26,pbVar46 + (long)pbVar47,
                                      pbVar44 + ((long)pbVar55 - (long)pbVar47));
                  if ((uVar56 & 1) != 0) goto code_r0x0046ad50;
                  if (acStack_29c[0] == -0x80) {
                    uVar56 = (*pcVar18)(uVar26,uStack_298);
                  }
                  else {
                    uVar56 = (*pcVar48)(uVar26,acStack_29c + bStack_292,
                                        (ulong)bStack_291 - (ulong)bStack_292);
                  }
                  if ((uVar56 & 1) != 0) goto code_r0x0046ad50;
                  if (uVar50 < 0x80) {
                    lVar35 = 1;
                  }
                  else if (uVar50 < 0x800) {
                    lVar35 = 2;
                  }
                  else {
                    lVar35 = 3;
                    if (0xffff < uVar50) {
                      lVar35 = 4;
                    }
                  }
                  pbVar47 = pbVar55 + (long)pbVar44 + lVar35;
                }
                lVar35 = 3;
                if (0xffff < uVar50) {
                  lVar35 = 4;
                }
                lVar5 = 2;
                if (0x7ff < uVar50) {
                  lVar5 = lVar35;
                }
                lVar35 = 1;
                if (0x7f < uVar50) {
                  lVar35 = lVar5;
                }
                pbVar37 = pbVar55 + (long)pbVar44 + lVar35;
                pbVar38 = pbVar2 + -(long)pbVar34;
                pbVar55 = pbVar37;
                if (pbVar38 == (byte *)0x0) goto code_r0x0046accc;
              }
              uVar8 = pbVar38[1] & 0x3f;
              if (uVar50 < 0xe0) {
                uVar50 = uVar8 | (uVar50 & 0x1f) << 6;
                pbVar34 = pbVar38 + 2;
                goto code_r0x0046ab60;
              }
              pbVar3 = pbVar34 + (long)pbVar44;
              uVar8 = pbVar38[2] & 0x3f | uVar8 << 6;
              if (uVar50 < 0xf0) {
                uVar50 = uVar8 | (uVar50 & 0x1f) << 0xc;
                pbVar34 = pbVar3 + 3;
                goto code_r0x0046ab60;
              }
              pbVar34 = pbVar3 + 4;
              uVar50 = pbVar3[3] & 0x3f | uVar8 << 6 | (uVar50 & 7) << 0x12;
              if (uVar50 != 0x110000) goto code_r0x0046ab60;
              pbVar38 = pbVar2 + -(long)pbVar34;
              pbVar55 = pbVar37;
            } while (pbVar38 != (byte *)0x0);
code_r0x0046accc:
            if (pbVar37 < pbVar47) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
            if (pbVar47 != (byte *)0x0) {
              if (pbVar47 < pbVar20) {
                if ((char)pbVar46[(long)pbVar47] < -0x40)
                goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
              }
              else if (pbVar47 != pbVar20) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
            }
            if (pbVar37 != (byte *)0x0) {
              if (pbVar37 < pbVar20) {
                if ((char)pbVar46[(long)pbVar37] < -0x40)
                goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
              }
              else if (pbVar37 != pbVar20) {
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
                auVar65 = func_0x007a297c(pbVar46,pbVar20,pbVar47,pbVar37,&UNK_009e0710);
                pbVar46 = auVar65._8_8_;
                pbVar20 = auVar65._0_8_;
                uVar50 = *(uint *)(pbVar47 + 0x10);
                if ((uVar50 & 0x18000000) != 0) {
                  if ((uVar50 >> 0x1c & 1) == 0) {
                    if (pbVar46 < (byte *)0x20) {
                      if (pbVar46 == (byte *)0x0) {
                        uVar56 = 0;
                      }
                      else {
                        if ((byte *)0x7 < pbVar46) {
                          pbVar37 = (byte *)((ulong)pbVar46 & 0x18);
                          uVar53 = *(undefined8 *)pbVar20;
                          bVar58 = -(-0x41 < (char)((ulong)uVar53 >> 0x30)) & 1;
                          bVar59 = -(-0x41 < (char)((ulong)uVar53 >> 0x38)) & 1;
                          auVar60._0_8_ = CONCAT71(0,-(-0x41 < (char)((ulong)uVar53 >> 0x20)) & 1);
                          auVar60[8] = -(-0x41 < (char)((ulong)uVar53 >> 0x28)) & 1;
                          auVar60._9_7_ = 0;
                          uVar56 = (ulong)(-(-0x41 < (char)((ulong)uVar53 >> 0x10)) & 1);
                          uVar39 = (ulong)(-(-0x41 < (char)((ulong)uVar53 >> 0x18)) & 1);
                          uVar21 = (ulong)(-(-0x41 < (char)uVar53) & 1);
                          uVar63 = (ulong)(-(-0x41 < (char)((ulong)uVar53 >> 8)) & 1);
                          if (pbVar37 != (byte *)0x8) {
                            uVar53 = *(undefined8 *)(pbVar20 + 8);
                            bVar64 = -(-0x41 < (char)((ulong)uVar53 >> 0x28));
                            bVar58 = bVar58 + (-(-0x41 < (char)((ulong)uVar53 >> 0x30)) & 1U);
                            bVar59 = bVar59 + (-(-0x41 < (char)((ulong)uVar53 >> 0x38)) & 1U);
                            auVar60._0_8_ =
                                 auVar60._0_8_ +
                                 ((ulong)((uint6)CONCAT14(bVar64,(uint)CONCAT12(bVar64,(ushort)(byte
                                                  )-(-0x41 < (char)((ulong)uVar53 >> 0x20)))) &
                                         0xffff0000ffff) & 0xffffff01);
                            auVar60._8_8_ = (ulong)auVar60[8] + ((ulong)bVar64 & 0xffffff01);
                            uVar56 = uVar56 + (-(-0x41 < (char)((ulong)uVar53 >> 0x10)) & 1);
                            uVar39 = uVar39 + (-(-0x41 < (char)((ulong)uVar53 >> 0x18)) & 1);
                            uVar21 = uVar21 + (-(-0x41 < (char)uVar53) & 1);
                            uVar63 = uVar63 + (-(-0x41 < (char)((ulong)uVar53 >> 8)) & 1);
                            if (pbVar37 != (byte *)0x10) {
                              uVar53 = *(undefined8 *)(pbVar20 + 0x10);
                              bVar64 = -(-0x41 < (char)((ulong)uVar53 >> 0x28));
                              bVar58 = bVar58 + (-(-0x41 < (char)((ulong)uVar53 >> 0x30)) & 1U);
                              bVar59 = bVar59 + (-(-0x41 < (char)((ulong)uVar53 >> 0x38)) & 1U);
                              auVar60._0_8_ =
                                   auVar60._0_8_ +
                                   ((ulong)((uint6)CONCAT14(bVar64,(uint)CONCAT12(bVar64,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar53 >> 0x20)))) &
                                           0xffff0000ffff) & 0xffffff01);
                              auVar60._8_8_ = auVar60._8_8_ + ((ulong)bVar64 & 0xffffff01);
                              uVar56 = uVar56 + (-(-0x41 < (char)((ulong)uVar53 >> 0x10)) & 1);
                              uVar39 = uVar39 + (-(-0x41 < (char)((ulong)uVar53 >> 0x18)) & 1);
                              uVar21 = uVar21 + (-(-0x41 < (char)uVar53) & 1);
                              uVar63 = uVar63 + (-(-0x41 < (char)((ulong)uVar53 >> 8)) & 1);
                            }
                          }
                          uVar56 = uVar21 + auVar60._0_8_ + uVar56 + bVar58 +
                                   uVar63 + auVar60._8_8_ + uVar39 + bVar59;
                          goto code_r0x00468ca4;
                        }
                        uVar56 = 0;
                        pbVar37 = (byte *)0x0;
                        do {
                          if (-0x41 < (char)pbVar20[(long)pbVar37]) {
                            uVar56 = uVar56 + 1;
                          }
                          pbVar37 = pbVar37 + 1;
code_r0x00468ca4:
                        } while (pbVar46 != pbVar37);
                      }
                    }
                    else {
                      uVar56 = func_0x0046bd58(pbVar20,pbVar46);
                    }
                  }
                  else {
                    uVar56 = (ulong)*(ushort *)(pbVar47 + 0x16);
                    if (uVar56 == 0) {
                      pbVar46 = (byte *)0x0;
                      uVar39 = 0;
                    }
                    else {
                      pbVar37 = pbVar20 + (long)pbVar46;
                      pbVar46 = (byte *)0x0;
                      uVar39 = uVar56;
                      pbVar34 = pbVar20;
                      do {
                        if (pbVar34 == pbVar37) break;
                        bVar58 = *pbVar34;
                        pbVar38 = pbVar34 + 3;
                        if (0xef < bVar58) {
                          pbVar38 = pbVar34 + 4;
                        }
                        pbVar55 = pbVar34 + 2;
                        if (0xdf < bVar58) {
                          pbVar55 = pbVar38;
                        }
                        pbVar38 = pbVar34 + 1;
                        if (((int)(char)bVar58 & 0x80000000U) != 0) {
                          pbVar38 = pbVar55;
                        }
                        pbVar46 = pbVar38 + ((long)pbVar46 - (long)pbVar34);
                        uVar39 = uVar39 - 1;
                        pbVar34 = pbVar38;
                      } while (uVar39 != 0);
                    }
                    uVar56 = uVar56 - uVar39;
                  }
                  if (uVar56 < *(ushort *)(pbVar47 + 0x14)) {
                    uVar7 = (uint)*(ushort *)(pbVar47 + 0x14) - (int)uVar56;
                    uVar52 = uVar50 >> 0x1d & 3;
                    uVar8 = uVar7 >> 1 & 0x7fff;
                    if (uVar52 != 2) {
                      uVar8 = 0;
                    }
                    uVar4 = 0;
                    if (uVar52 != 0) {
                      uVar4 = uVar7;
                    }
                    if (uVar52 < 2) {
                      uVar8 = uVar4;
                    }
                    uVar52 = 0;
                    uVar53 = *(undefined8 *)pbVar47;
                    lVar35 = *(long *)(pbVar47 + 8);
                    do {
                      if ((uVar8 & 0xffff) <= (uVar52 & 0xffff)) {
                        uVar56 = (**(code **)(lVar35 + 0x18))(uVar53,pbVar20,pbVar46);
                        if ((uVar56 & 1) == 0) {
                          uVar52 = 0;
                          do {
                            if ((uVar7 - uVar8 & 0xffff) <= (uVar52 & 0xffff)) {
                              return (dword *)0x0;
                            }
                            uVar52 = uVar52 + 1;
                            uVar56 = (**(code **)(lVar35 + 0x20))(uVar53,uVar50 & 0x1fffff);
                          } while ((uVar56 & 1) == 0);
                          return (dword *)0x1;
                        }
                        break;
                      }
                      uVar52 = uVar52 + 1;
                      uVar56 = (**(code **)(lVar35 + 0x20))(uVar53,uVar50 & 0x1fffff);
                    } while ((uVar56 & 1) == 0);
                    return (dword *)((long)&MACH_HEADER.magic + 1);
                  }
                }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                pdVar22 = (dword *)(**(code **)(*(long *)(pbVar47 + 8) + 0x18))
                                             (*(undefined8 *)pbVar47,pbVar20,pbVar46);
                return pdVar22;
              }
            }
          }
          uVar56 = (**(code **)(lVar41 + 0x18))
                             (uVar26,pbVar46 + (long)pbVar47,(long)pbVar37 - (long)pbVar47);
          if ((uVar56 & 1) == 0) {
            pdVar22 = (dword *)(*pcVar18)(uVar26,0x22);
            return pdVar22;
          }
        }
code_r0x0046ad50:
        return (dword *)((long)&MACH_HEADER.magic + 1);
      }
      lStack_160 = lVar35;
      if (unaff_x20 == 0) {
        uStack_150 = 1;
        uStack_168 = *(undefined8 *)pdVar24;
        uVar39 = *(ulong *)(pdVar24 + 2);
        if (uVar39 == 0) goto code_r0x00508f74;
code_r0x00509078:
        lStack_148 = 0;
        uStack_158 = unaff_x20;
        func_0x007a5594(&uStack_158,0,uVar39,1,1);
      }
      else {
        uVar53 = 1;
        uVar21 = func_0x00187bd0(unaff_x20,1);
        if (uVar21 == 0) goto code_r0x00509218;
        uStack_168 = *(undefined8 *)pdVar24;
        uVar39 = *(ulong *)(pdVar24 + 2);
        uStack_150 = uVar21;
        if (unaff_x20 < uVar39) goto code_r0x00509078;
code_r0x00508f74:
        lStack_148 = 0;
        uStack_158 = unaff_x20;
      }
      lVar35 = lStack_148;
      uVar21 = uStack_150;
      pdVar25 = (dword *)_memcpy(uStack_150 + lStack_148,uStack_168,uVar39);
      puVar29 = (undefined4 *)(uVar21 + lVar35 + uVar39);
      puVar54 = (undefined1 *)(unaff_x20 - (lVar35 + uVar39));
      if ((long)pdVar23 < 2) {
        if (pdVar23 == (dword *)0x0) {
          if (lStack_160 != 1) {
            puVar45 = (undefined8 *)(pdVar24 + 6);
            do {
              puVar28 = (undefined1 *)*puVar45;
              bVar19 = puVar54 < puVar28;
              puVar54 = puVar54 + -(long)puVar28;
              if (bVar19) goto LAB_005091e4;
              pdVar25 = (dword *)_memcpy(puVar29,puVar45[-1]);
              puVar45 = puVar45 + 2;
              uVar56 = uVar56 - 0x10;
              puVar29 = (undefined4 *)((long)puVar29 + (long)puVar28);
            } while (uVar56 != 0);
          }
          goto LAB_005091b0;
        }
        if (pdVar23 == (dword *)((long)&MACH_HEADER.magic + 1)) {
          if (lStack_160 != 1) {
            do {
              if (puVar54 == (undefined1 *)0x0) goto LAB_005091e4;
              uVar56 = *(ulong *)pdVar22;
              puVar28 = *(undefined1 **)(pdVar22 + 2);
              puVar36 = puVar54 + -1;
              *(undefined1 *)puVar29 = *(undefined1 *)puVar30;
              puVar54 = puVar36 + -(long)puVar28;
              if (puVar36 < puVar28) goto LAB_005091e4;
              lVar35 = (long)puVar29 + 1;
              puVar29 = (undefined4 *)(puVar28 + lVar35);
              pdVar25 = (dword *)_memcpy(lVar35,uVar56);
              pdVar22 = pdVar22 + 4;
            } while (pdVar22 != pdVar57);
          }
          goto LAB_005091b0;
        }
      }
      else {
        if (pdVar23 == (dword *)((long)&MACH_HEADER.magic + 2)) {
          if (lStack_160 != 1) {
            do {
              if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) goto LAB_005091e4;
              uVar56 = *(ulong *)pdVar22;
              puVar28 = *(undefined1 **)(pdVar22 + 2);
              puVar36 = puVar54 + -2;
              *(undefined2 *)puVar29 = *(undefined2 *)puVar30;
              puVar54 = puVar36 + -(long)puVar28;
              if (puVar36 < puVar28) goto LAB_005091e4;
              lVar35 = (long)puVar29 + 2;
              puVar29 = (undefined4 *)(puVar28 + lVar35);
              pdVar25 = (dword *)_memcpy(lVar35,uVar56);
              pdVar22 = pdVar22 + 4;
            } while (pdVar22 != pdVar57);
          }
          goto LAB_005091b0;
        }
        if (pdVar23 == (dword *)((long)&MACH_HEADER.magic + 3)) {
          if (lStack_160 != 1) {
            do {
              if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 3)) goto LAB_005091e4;
              uVar56 = *(ulong *)pdVar22;
              puVar28 = *(undefined1 **)(pdVar22 + 2);
              puVar36 = puVar54 + -3;
              uVar6 = *(undefined2 *)puVar30;
              *(undefined *)((long)puVar29 + 2) = *(undefined *)((long)puVar30 + 2);
              *(undefined2 *)puVar29 = uVar6;
              puVar54 = puVar36 + -(long)puVar28;
              if (puVar36 < puVar28) goto LAB_005091e4;
              lVar35 = (long)puVar29 + 3;
              puVar29 = (undefined4 *)(puVar28 + lVar35);
              pdVar25 = (dword *)_memcpy(lVar35,uVar56);
              pdVar22 = pdVar22 + 4;
            } while (pdVar22 != pdVar57);
          }
          goto LAB_005091b0;
        }
        if (pdVar23 == &MACH_HEADER.cputype) {
          if (lStack_160 != 1) {
            do {
              if (puVar54 < &MACH_HEADER.cputype) goto LAB_005091e4;
              uVar56 = *(ulong *)pdVar22;
              puVar28 = *(undefined1 **)(pdVar22 + 2);
              puVar36 = puVar54 + -4;
              *puVar29 = *puVar30;
              puVar54 = puVar36 + -(long)puVar28;
              if (puVar36 < puVar28) goto LAB_005091e4;
              puVar1 = puVar29 + 1;
              puVar29 = (undefined4 *)((long)puVar1 + (long)puVar28);
              pdVar25 = (dword *)_memcpy(puVar1,uVar56);
              pdVar22 = pdVar22 + 4;
            } while (pdVar22 != pdVar57);
          }
          goto LAB_005091b0;
        }
      }
      if (lStack_160 != 1) {
        do {
          uVar56 = (long)puVar54 - (long)pdVar23;
          if (puVar54 < pdVar23) {
LAB_005091e4:
            puStack_140 = &UNK_009e8d38;
            uStack_138 = 1;
            uStack_128 = 0;
            uStack_120 = 0;
            uStack_130 = 8;
            func_0x007a2420(&puStack_140,&UNK_009e8d48);
                    /* WARNING: Does not return */
            pcVar18 = (code *)SoftwareBreakpoint(1,0x509214);
            (*pcVar18)();
          }
          uVar39 = *(ulong *)pdVar22;
          uVar21 = *(ulong *)(pdVar22 + 2);
          _memcpy(puVar29,puVar30,pdVar23);
          puVar54 = (undefined1 *)(uVar56 - uVar21);
          if (uVar56 < uVar21) goto LAB_005091e4;
          puVar28 = (undefined1 *)((long)puVar29 + (long)pdVar23);
          puVar29 = (undefined4 *)(puVar28 + uVar21);
          pdVar25 = (dword *)_memcpy(puVar28,uVar39,uVar21);
          pdVar22 = pdVar22 + 4;
        } while (pdVar22 != pdVar57);
      }
LAB_005091b0:
      puStack_170[1] = uStack_150;
      *puStack_170 = uStack_158;
      puStack_170[2] = unaff_x20 - (long)puVar54;
      return pdVar25;
    }
    pdStack_b0 = extraout_x8;
    if (unaff_x20 == 0) {
      uStack_a0 = 1;
      uVar53 = *(undefined8 *)(pdVar24 + 2);
      uVar56 = *(ulong *)(pdVar24 + 4);
      if (uVar56 == 0) goto code_r0x00508bb8;
code_r0x00508cb8:
      lStack_98 = 0;
      uStack_a8 = unaff_x20;
      func_0x007a5594(&uStack_a8,0,uVar56,1,1);
    }
    else {
      uVar53 = 1;
      uVar39 = func_0x00187bd0(unaff_x20,1);
      if (uVar39 == 0) goto code_r0x00508e64;
      uVar53 = *(undefined8 *)(pdVar24 + 2);
      uVar56 = *(ulong *)(pdVar24 + 4);
      uStack_a0 = uVar39;
      if (unaff_x20 < uVar56) goto code_r0x00508cb8;
code_r0x00508bb8:
      lStack_98 = 0;
      uStack_a8 = unaff_x20;
    }
    lVar35 = lStack_98;
    uVar39 = uStack_a0;
    pdVar23 = (dword *)_memcpy(uStack_a0 + lStack_98,uVar53,uVar56);
    puVar30 = (undefined4 *)(uVar39 + lVar35 + uVar56);
    puVar54 = (undefined1 *)(unaff_x20 - (lVar35 + uVar56));
    if ((long)pdVar22 < 2) {
      if (pdVar22 == (dword *)0x0) {
        if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
          puVar45 = (undefined8 *)(pdVar24 + 10);
          do {
            puVar28 = (undefined1 *)*puVar45;
            bVar19 = puVar54 < puVar28;
            puVar54 = puVar54 + -(long)puVar28;
            if (bVar19) goto code_r0x00508e30;
            pdVar23 = (dword *)_memcpy(puVar30,puVar45[-1]);
            puVar45 = puVar45 + 3;
            pdVar57 = pdVar57 + -6;
            puVar30 = (undefined4 *)((long)puVar30 + (long)puVar28);
          } while (pdVar57 != (dword *)0x0);
        }
        goto code_r0x00508dfc;
      }
      if (pdVar22 == (dword *)((long)&MACH_HEADER.magic + 1)) {
        if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
          puVar49 = (ulong *)(pdVar24 + 10);
          do {
            if (puVar54 == (undefined1 *)0x0) goto code_r0x00508e30;
            uVar56 = puVar49[-1];
            puVar28 = (undefined1 *)*puVar49;
            puVar36 = puVar54 + -1;
            *(undefined1 *)puVar30 = *(undefined1 *)puVar29;
            puVar54 = puVar36 + -(long)puVar28;
            if (puVar36 < puVar28) goto code_r0x00508e30;
            puVar49 = puVar49 + 3;
            lVar35 = (long)puVar30 + 1;
            puVar30 = (undefined4 *)(puVar28 + lVar35);
            pdVar23 = (dword *)_memcpy(lVar35,uVar56);
            pdVar57 = pdVar57 + -6;
          } while (pdVar57 != (dword *)0x0);
        }
        goto code_r0x00508dfc;
      }
    }
    else {
      if (pdVar22 == (dword *)((long)&MACH_HEADER.magic + 2)) {
        if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
          puVar49 = (ulong *)(pdVar24 + 10);
          do {
            if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) goto code_r0x00508e30;
            uVar56 = puVar49[-1];
            puVar28 = (undefined1 *)*puVar49;
            puVar36 = puVar54 + -2;
            *(undefined2 *)puVar30 = *(undefined2 *)puVar29;
            puVar54 = puVar36 + -(long)puVar28;
            if (puVar36 < puVar28) goto code_r0x00508e30;
            puVar49 = puVar49 + 3;
            lVar35 = (long)puVar30 + 2;
            puVar30 = (undefined4 *)(puVar28 + lVar35);
            pdVar23 = (dword *)_memcpy(lVar35,uVar56);
            pdVar57 = pdVar57 + -6;
          } while (pdVar57 != (dword *)0x0);
        }
        goto code_r0x00508dfc;
      }
      if (pdVar22 == (dword *)((long)&MACH_HEADER.magic + 3)) {
        if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
          puVar49 = (ulong *)(pdVar24 + 10);
          do {
            if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 3)) goto code_r0x00508e30;
            uVar56 = puVar49[-1];
            puVar28 = (undefined1 *)*puVar49;
            puVar36 = puVar54 + -3;
            uVar6 = *(undefined2 *)puVar29;
            *(undefined *)((long)puVar30 + 2) = *(undefined *)((long)puVar29 + 2);
            *(undefined2 *)puVar30 = uVar6;
            puVar54 = puVar36 + -(long)puVar28;
            if (puVar36 < puVar28) goto code_r0x00508e30;
            puVar49 = puVar49 + 3;
            lVar35 = (long)puVar30 + 3;
            puVar30 = (undefined4 *)(puVar28 + lVar35);
            pdVar23 = (dword *)_memcpy(lVar35,uVar56);
            pdVar57 = pdVar57 + -6;
          } while (pdVar57 != (dword *)0x0);
        }
        goto code_r0x00508dfc;
      }
      if (pdVar22 == &MACH_HEADER.cputype) {
        if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
          puVar49 = (ulong *)(pdVar24 + 10);
          do {
            if (puVar54 < &MACH_HEADER.cputype) goto code_r0x00508e30;
            uVar56 = puVar49[-1];
            puVar28 = (undefined1 *)*puVar49;
            puVar36 = puVar54 + -4;
            *puVar30 = *puVar29;
            puVar54 = puVar36 + -(long)puVar28;
            if (puVar36 < puVar28) goto code_r0x00508e30;
            puVar49 = puVar49 + 3;
            puVar1 = puVar30 + 1;
            puVar30 = (undefined4 *)((long)puVar1 + (long)puVar28);
            pdVar23 = (dword *)_memcpy(puVar1,uVar56);
            pdVar57 = pdVar57 + -6;
          } while (pdVar57 != (dword *)0x0);
        }
        goto code_r0x00508dfc;
      }
    }
    if (pdVar25 != (dword *)((long)&MACH_HEADER.magic + 1)) {
      puVar49 = (ulong *)(pdVar24 + 10);
      do {
        uVar56 = (long)puVar54 - (long)pdVar22;
        if (puVar54 < pdVar22) {
code_r0x00508e30:
          puStack_90 = &UNK_009e8d38;
          uStack_88 = 1;
          uStack_78 = 0;
          uStack_70 = 0;
          uStack_80 = 8;
          func_0x007a2420(&puStack_90,&UNK_009e8d48);
                    /* WARNING: Does not return */
          pcVar18 = (code *)SoftwareBreakpoint(1,0x508e60);
          (*pcVar18)();
        }
        uVar39 = puVar49[-1];
        uVar21 = *puVar49;
        _memcpy(puVar30,puVar29,pdVar22);
        puVar54 = (undefined1 *)(uVar56 - uVar21);
        if (uVar56 < uVar21) goto code_r0x00508e30;
        puVar49 = puVar49 + 3;
        puVar28 = (undefined1 *)((long)puVar30 + (long)pdVar22);
        puVar30 = (undefined4 *)(puVar28 + uVar21);
        pdVar23 = (dword *)_memcpy(puVar28,uVar39,uVar21);
        pdVar57 = pdVar57 + -6;
      } while (pdVar57 != (dword *)0x0);
    }
code_r0x00508dfc:
    *(ulong *)(pdStack_b0 + 2) = uStack_a0;
    *(ulong *)pdStack_b0 = uStack_a8;
    *(ulong *)(pdStack_b0 + 4) = unaff_x20 - (long)puVar54;
    return pdVar23;
  }
  if (unaff_x20 == 0) {
    in_stack_00000010 = 1;
    uVar53 = *(undefined8 *)(param_1 + 2);
    uVar39 = *(ulong *)(param_1 + 4);
    if (uVar39 == 0) goto LAB_005087f4;
LAB_005088f4:
    in_stack_00000018 = 0;
    uStack0000000000000008 = unaff_x20;
    func_0x007a5594(&uStack0000000000000008,0,uVar39,1,1);
  }
  else {
    uVar53 = 1;
    uVar21 = func_0x00187bd0(unaff_x20,1);
    if (uVar21 == 0) goto LAB_00508aa0;
    uVar53 = *(undefined8 *)(param_1 + 2);
    uVar39 = *(ulong *)(param_1 + 4);
    in_stack_00000010 = uVar21;
    if (unaff_x20 < uVar39) goto LAB_005088f4;
LAB_005087f4:
    in_stack_00000018 = 0;
    uStack0000000000000008 = unaff_x20;
  }
  lVar35 = in_stack_00000018;
  uVar21 = in_stack_00000010;
  pdVar22 = (dword *)_memcpy(in_stack_00000010 + in_stack_00000018,uVar53,uVar39);
  puVar29 = (undefined4 *)(uVar21 + lVar35 + uVar39);
  puVar54 = (undefined1 *)(unaff_x20 - (lVar35 + uVar39));
  if ((long)param_4 < 2) {
    if (param_4 == (dword *)0x0) {
      if (param_2 != 1) {
        puVar45 = (undefined8 *)(param_1 + 10);
        do {
          puVar28 = (undefined1 *)*puVar45;
          bVar19 = puVar54 < puVar28;
          puVar54 = puVar54 + -(long)puVar28;
          if (bVar19) goto LAB_00508a6c;
          pdVar22 = (dword *)_memcpy(puVar29,puVar45[-1]);
          puVar45 = puVar45 + 3;
          uVar56 = uVar56 - 0x18;
          puVar29 = (undefined4 *)((long)puVar29 + (long)puVar28);
        } while (uVar56 != 0);
      }
      goto LAB_00508a38;
    }
    if (param_4 == (dword *)((long)&MACH_HEADER.magic + 1)) {
      if (param_2 != 1) {
        puVar49 = (ulong *)(param_1 + 10);
        do {
          if (puVar54 == (undefined1 *)0x0) goto LAB_00508a6c;
          uVar39 = puVar49[-1];
          puVar28 = (undefined1 *)*puVar49;
          puVar36 = puVar54 + -1;
          *(undefined1 *)puVar29 = *(undefined1 *)param_3;
          puVar54 = puVar36 + -(long)puVar28;
          if (puVar36 < puVar28) goto LAB_00508a6c;
          puVar49 = puVar49 + 3;
          lVar35 = (long)puVar29 + 1;
          puVar29 = (undefined4 *)(puVar28 + lVar35);
          pdVar22 = (dword *)_memcpy(lVar35,uVar39);
          uVar56 = uVar56 - 0x18;
        } while (uVar56 != 0);
      }
      goto LAB_00508a38;
    }
  }
  else {
    if (param_4 == (dword *)((long)&MACH_HEADER.magic + 2)) {
      if (param_2 != 1) {
        puVar49 = (ulong *)(param_1 + 10);
        do {
          if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) goto LAB_00508a6c;
          uVar39 = puVar49[-1];
          puVar28 = (undefined1 *)*puVar49;
          puVar36 = puVar54 + -2;
          *(undefined2 *)puVar29 = *(undefined2 *)param_3;
          puVar54 = puVar36 + -(long)puVar28;
          if (puVar36 < puVar28) goto LAB_00508a6c;
          puVar49 = puVar49 + 3;
          lVar35 = (long)puVar29 + 2;
          puVar29 = (undefined4 *)(puVar28 + lVar35);
          pdVar22 = (dword *)_memcpy(lVar35,uVar39);
          uVar56 = uVar56 - 0x18;
        } while (uVar56 != 0);
      }
      goto LAB_00508a38;
    }
    if (param_4 == (dword *)((long)&MACH_HEADER.magic + 3)) {
      if (param_2 != 1) {
        puVar49 = (ulong *)(param_1 + 10);
        do {
          if (puVar54 < (undefined1 *)((long)&MACH_HEADER.magic + 3)) goto LAB_00508a6c;
          uVar39 = puVar49[-1];
          puVar28 = (undefined1 *)*puVar49;
          puVar36 = puVar54 + -3;
          uVar6 = *(undefined2 *)param_3;
          *(undefined *)((long)puVar29 + 2) = *(undefined *)((long)param_3 + 2);
          *(undefined2 *)puVar29 = uVar6;
          puVar54 = puVar36 + -(long)puVar28;
          if (puVar36 < puVar28) goto LAB_00508a6c;
          puVar49 = puVar49 + 3;
          lVar35 = (long)puVar29 + 3;
          puVar29 = (undefined4 *)(puVar28 + lVar35);
          pdVar22 = (dword *)_memcpy(lVar35,uVar39);
          uVar56 = uVar56 - 0x18;
        } while (uVar56 != 0);
      }
      goto LAB_00508a38;
    }
    if (param_4 == &MACH_HEADER.cputype) {
      if (param_2 != 1) {
        puVar49 = (ulong *)(param_1 + 10);
        do {
          if (puVar54 < &MACH_HEADER.cputype) goto LAB_00508a6c;
          uVar39 = puVar49[-1];
          puVar28 = (undefined1 *)*puVar49;
          puVar36 = puVar54 + -4;
          *puVar29 = *param_3;
          puVar54 = puVar36 + -(long)puVar28;
          if (puVar36 < puVar28) goto LAB_00508a6c;
          puVar49 = puVar49 + 3;
          puVar30 = puVar29 + 1;
          puVar29 = (undefined4 *)((long)puVar30 + (long)puVar28);
          pdVar22 = (dword *)_memcpy(puVar30,uVar39);
          uVar56 = uVar56 - 0x18;
        } while (uVar56 != 0);
      }
      goto LAB_00508a38;
    }
  }
  if (param_2 != 1) {
    puVar49 = (ulong *)(param_1 + 10);
    do {
      uVar39 = (long)puVar54 - (long)param_4;
      if (puVar54 < param_4) {
LAB_00508a6c:
        uStack0000000000000020 = &UNK_009e8d38;
        in_stack_00000028 = 1;
        in_stack_00000038 = 0;
        in_stack_00000040 = 0;
        in_stack_00000030 = 8;
        func_0x007a2420(&uStack0000000000000020,&UNK_009e8d48);
                    /* WARNING: Does not return */
        pcVar18 = (code *)SoftwareBreakpoint(1,0x508a9c);
        (*pcVar18)();
      }
      uVar21 = puVar49[-1];
      uVar63 = *puVar49;
      _memcpy(puVar29,param_3,param_4);
      puVar54 = (undefined1 *)(uVar39 - uVar63);
      if (uVar39 < uVar63) goto LAB_00508a6c;
      puVar49 = puVar49 + 3;
      puVar28 = (undefined1 *)((long)puVar29 + (long)param_4);
      puVar29 = (undefined4 *)(puVar28 + uVar63);
      pdVar22 = (dword *)_memcpy(puVar28,uVar21,uVar63);
      uVar56 = uVar56 - 0x18;
    } while (uVar56 != 0);
  }
LAB_00508a38:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = unaff_x20 - (long)puVar54;
  return pdVar22;
}

