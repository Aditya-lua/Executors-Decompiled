
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0051d60c(long param_1,undefined8 param_2,long param_3,undefined8 param_4,ulong param_5,
                   long *param_6)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  long *plVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  long lVar14;
  long *unaff_x19;
  long unaff_x20;
  undefined *puVar15;
  ulong unaff_x24;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined **ppuStack_208;
  undefined *puStack_200;
  undefined **ppuStack_1f8;
  undefined *puStack_1f0;
  long lStack_1e8;
  long lStack_1e0;
  long lStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  long lStack_1b0;
  long lStack_1a8;
  long lStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined7 uStack_180;
  undefined1 uStack_179;
  undefined7 uStack_178;
  undefined1 uStack_171;
  undefined7 uStack_170;
  undefined1 uStack_169;
  undefined7 uStack_168;
  undefined1 uStack_161;
  undefined *puStack_160;
  undefined8 uStack_158;
  undefined ***pppuStack_150;
  undefined1 uStack_148;
  undefined7 uStack_147;
  undefined1 uStack_140;
  undefined7 uStack_13f;
  undefined1 uStack_138;
  undefined7 uStack_137;
  undefined ***pppuStack_130;
  undefined *puStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined4 uStack_d0;
  undefined2 uStack_cc;
  undefined1 uStack_ca;
  undefined1 uStack_c9;
  undefined2 uStack_c8;
  undefined4 uStack_c6;
  undefined1 uStack_c2;
  undefined1 uStack_c1;
  undefined2 uStack_c0;
  undefined2 uStack_be;
  undefined4 uStack_bc;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined2 uStack_b0;
  undefined4 uStack_ae;
  undefined1 uStack_aa;
  undefined1 uStack_a9;
  undefined2 uStack_a8;
  undefined4 uStack_a6;
  undefined2 uStack_a2;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined2 uStack_94;
  undefined1 uStack_92;
  undefined1 uStack_91;
  undefined2 uStack_90;
  undefined4 uStack_8e;
  undefined1 uStack_8a;
  undefined1 uStack_89;
  undefined2 uStack_88;
  undefined2 uStack_86;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined2 uStack_78;
  undefined4 uStack_76;
  undefined2 uStack_72;
  
  if ((param_3 != param_1) && (param_3 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x20 + 8),param_3,1);
  }
  if (((unaff_x24 & 1) == 0) || (*unaff_x19 == 0)) {
    __Unwind_Resume();
  }
  plVar10 = (long *)((long)&MACH_HEADER.magic + 1);
  func_0x00187bd4(unaff_x19[1]);
  __Unwind_Resume();
  auVar16 = func_0x007a2668();
  puVar13 = auVar16._8_8_;
  lVar7 = auVar16._0_8_;
  lVar11 = 0;
  lVar14 = *(long *)(lVar7 + 0xf0) << 4;
  uVar8 = 0xffffffffffffffff;
  plVar9 = *(long **)(lVar7 + 0xe8);
  do {
    if (lVar14 == 0) {
      puVar15 = (undefined *)0x0;
      goto code_r0x0051d73c;
    }
    lVar1 = *plVar9;
    plVar2 = plVar9 + 1;
    uVar8 = uVar8 + 1;
    lVar11 = lVar11 + 0x20;
    lVar14 = lVar14 + -0x10;
    plVar9 = plVar9 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (uVar8 < *(ulong *)(lVar7 + 0x108)) {
    lVar11 = *(long *)(lVar7 + 0x100) + lVar11;
    lVar14 = *(long *)(lVar11 + -0x18);
    puVar15 = (undefined *)
              (*(long *)(lVar11 + -0x20) + (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar17 = (**(code **)(lVar14 + 0x18))(puVar15);
    if (auVar17._0_8_ == 0x1414db8803bc16e0 && auVar17._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0051d73c:
      puStack_1f0 = &UNK_008a6e36;
      if (puVar15 != (undefined *)0x0) {
        puStack_1f0 = puVar15;
      }
      puStack_200 = puStack_1f0 + 0x54;
      ppuStack_208 = &puStack_200;
      puStack_1f0 = puStack_1f0 + 0x46;
      ppuStack_1f8 = &puStack_1f0;
      puStack_128 = (undefined *)0x1;
      lStack_120 = 0;
      lStack_118 = 0;
      lStack_110 = 8;
      pppuStack_130 = (undefined ***)0x0;
      pppuStack_150 = (undefined ***)((long)&MACH_HEADER.magic + 2);
      lStack_e8 = 0;
      lStack_100 = _UNK_0089f368;
      lStack_108 = _UNK_0089f360;
      uStack_d8 = CONCAT31(uStack_d8._1_3_,3);
      uStack_d4 = CONCAT31(uStack_d4._1_3_,3);
      uStack_d0 = CONCAT31(uStack_d0._1_3_,3);
      uStack_cc = 0;
      uStack_ca = 3;
      uStack_c6 = CONCAT31(uStack_c6._1_3_,3);
      uStack_c2 = 3;
      uStack_be = 0;
      uStack_bc = CONCAT31(uStack_bc._1_3_,3);
      uStack_b8 = CONCAT31(uStack_b8._1_3_,3);
      uStack_b4 = CONCAT31(uStack_b4._1_3_,3);
      uStack_b0 = 0;
      uStack_ae = CONCAT31(uStack_ae._1_3_,3);
      uStack_aa = 3;
      uStack_a6 = CONCAT31(uStack_a6._1_3_,3);
      uStack_a2 = 0;
      uStack_a0 = CONCAT31(uStack_a0._1_3_,3);
      uStack_9c = CONCAT31(uStack_9c._1_3_,3);
      uStack_98 = CONCAT31(uStack_98._1_3_,3);
      uStack_94 = 0;
      uStack_92 = 3;
      uStack_8e = CONCAT31(uStack_8e._1_3_,3);
      uStack_8a = 3;
      uStack_86 = 0;
      uStack_84 = CONCAT31(uStack_84._1_3_,3);
      uStack_80 = CONCAT31(uStack_80._1_3_,3);
      uStack_7c = CONCAT31(uStack_7c._1_3_,3);
      uStack_78 = 0;
      uStack_76 = (undefined4)_UNK_008a6b30;
      plVar9 = (long *)func_0x00187bd0(0xe0,8);
      if (plVar9 != (long *)0x0) {
        plVar9[0x15] = CONCAT26(uStack_a2,CONCAT42(uStack_a6,uStack_a8));
        plVar9[0x14] = CONCAT17(uStack_a9,CONCAT16(uStack_aa,CONCAT42(uStack_ae,uStack_b0)));
        plVar9[0x17] = CONCAT17(uStack_91,CONCAT16(uStack_92,CONCAT24(uStack_94,uStack_98)));
        plVar9[0x16] = CONCAT44(uStack_9c,uStack_a0);
        plVar9[0x19] = CONCAT44(uStack_84,CONCAT22(uStack_86,uStack_88));
        plVar9[0x18] = CONCAT17(uStack_89,CONCAT16(uStack_8a,CONCAT42(uStack_8e,uStack_90)));
        plVar9[0x1b] = CONCAT26(uStack_72,CONCAT42(uStack_76,uStack_78));
        plVar9[0x1a] = CONCAT44(uStack_7c,uStack_80);
        plVar9[0xd] = lStack_e8;
        plVar9[0xc] = lStack_f0;
        plVar9[0xf] = CONCAT44(uStack_d4,uStack_d8);
        plVar9[0xe] = lStack_e0;
        plVar9[0x11] = CONCAT17(uStack_c1,CONCAT16(uStack_c2,CONCAT42(uStack_c6,uStack_c8)));
        plVar9[0x10] = CONCAT17(uStack_c9,CONCAT16(uStack_ca,CONCAT24(uStack_cc,uStack_d0)));
        plVar9[0x13] = CONCAT44(uStack_b4,uStack_b8);
        plVar9[0x12] = CONCAT44(uStack_bc,CONCAT22(uStack_be,uStack_c0));
        plVar9[5] = (long)puStack_128;
        plVar9[4] = (long)pppuStack_130;
        plVar9[7] = lStack_118;
        plVar9[6] = lStack_120;
        plVar9[9] = lStack_108;
        plVar9[8] = lStack_110;
        plVar9[0xb] = lStack_f8;
        plVar9[10] = lStack_100;
        plVar9[1] = CONCAT71(uStack_147,uStack_148);
        *plVar9 = (long)pppuStack_150;
        plVar9[3] = CONCAT71(uStack_137,uStack_138);
        plVar9[2] = CONCAT71(uStack_13f,uStack_140);
        func_0x0051ab00(plVar9,lVar7);
        lStack_1e8 = 0;
        lStack_1e0 = 8;
        lStack_1d8 = 0;
        if ((param_5 & 1) != 0) {
          uStack_198 = 0;
          uStack_190 = 1;
          pppuStack_150 = &ppuStack_208;
          uStack_148 = 0x10;
          uStack_147 = 0x5243;
          uStack_140 = auVar16[8];
          uStack_13f = auVar16._9_7_;
          uStack_138 = 0xa0;
          uStack_137 = 0x51a2;
          pppuStack_130 = &ppuStack_1f8;
          puStack_128 = &DAT_00524310;
          uStack_188 = 0;
          uStack_180 = 0x9ea0d8;
          uStack_179 = 0;
          uStack_178 = 7;
          uStack_171 = 0;
          puStack_160 = &UNK_008a7078;
          uStack_158 = 6;
          uStack_170 = SUB87(&pppuStack_150,0);
          uStack_169 = (undefined1)((ulong)&pppuStack_150 >> 0x38);
          uStack_168 = 3;
          uStack_161 = 0;
          func_0x0046849c(&uStack_198,&UNK_009e9ef8,&uStack_180);
          uVar5 = uStack_188;
          uVar4 = uStack_190;
          uVar3 = uStack_198;
          lVar11 = lStack_1d8;
          if (lStack_1d8 == lStack_1e8) {
            func_0x0050c174(&lStack_1e8,&UNK_009ea148);
          }
          puVar12 = (undefined8 *)(lStack_1e0 + lVar11 * 0x18);
          *puVar12 = uVar3;
          puVar12[1] = uVar4;
          puVar12[2] = uVar5;
          lStack_1d8 = lVar11 + 1;
        }
        uStack_171 = (undefined1)puVar13[1];
        uStack_170 = (undefined7)((ulong)puVar13[1] >> 8);
        uStack_179 = (undefined1)*puVar13;
        uStack_178 = (undefined7)((ulong)*puVar13 >> 8);
        pppuStack_130 = (undefined ***)puVar13[2];
        uStack_169 = SUB81(pppuStack_130,0);
        uStack_168 = (undefined7)((ulong)pppuStack_130 >> 8);
        uStack_13f = uStack_178;
        uStack_147 = uStack_180;
        uStack_140 = uStack_179;
        pppuStack_150 = (undefined ***)CONCAT71(pppuStack_150._1_7_,1);
        uStack_148 = 2;
        uStack_138 = uStack_171;
        uStack_137 = uStack_170;
        func_0x0051b0f8(plVar9,&pppuStack_150);
        if (*param_6 != -0x8000000000000000) {
          uStack_140 = (undefined1)param_6[1];
          uStack_13f = (undefined7)((ulong)param_6[1] >> 8);
          uStack_148 = (undefined1)*param_6;
          uStack_147 = (undefined7)((ulong)*param_6 >> 8);
          uStack_138 = (undefined1)param_6[2];
          uStack_137 = (undefined7)((ulong)param_6[2] >> 8);
          pppuStack_150 = (undefined ***)CONCAT71(pppuStack_150._1_7_,4);
          func_0x0051b078(plVar9,0xf,&pppuStack_150);
        }
        if (*plVar10 != -0x8000000000000000) {
          if (plVar10[3] == -0x8000000000000000) {
            uStack_140 = (undefined1)plVar10[1];
            uStack_13f = (undefined7)((ulong)plVar10[1] >> 8);
            uStack_148 = (undefined1)*plVar10;
            uStack_147 = (undefined7)((ulong)*plVar10 >> 8);
            uStack_138 = (undefined1)plVar10[2];
            uStack_137 = (undefined7)((ulong)plVar10[2] >> 8);
            pppuStack_150 = (undefined ***)CONCAT71(pppuStack_150._1_7_,2);
            func_0x0051b078(plVar9,0xb,&pppuStack_150);
          }
          else {
            lStack_1c8 = plVar10[1];
            lStack_1d0 = *plVar10;
            lStack_1c0 = plVar10[2];
            lStack_1a8 = plVar10[4];
            lStack_1b0 = plVar10[3];
            lStack_1a0 = plVar10[5];
            uStack_198 = 0;
            uStack_190 = 1;
            uStack_188 = 0;
            pppuStack_150 = &ppuStack_1f8;
            uStack_148 = 0x10;
            uStack_147 = 0x5243;
            uStack_140 = SUB81(&lStack_1b0,0);
            uStack_13f = (undefined7)((ulong)&lStack_1b0 >> 8);
            uStack_138 = 0xa0;
            uStack_137 = 0x51a2;
            pppuStack_130 = (undefined ***)&lStack_1d0;
            puStack_128 = &DAT_0051a2a0;
            uStack_180 = 0x9ea160;
            uStack_179 = 0;
            uStack_178 = 5;
            uStack_171 = 0;
            puStack_160 = &UNK_008a71a0;
            uStack_158 = 4;
            uStack_170 = SUB87(&pppuStack_150,0);
            uStack_169 = (undefined1)((ulong)&pppuStack_150 >> 0x38);
            uStack_168 = 3;
            uStack_161 = 0;
            func_0x0046849c(&uStack_198,&UNK_009e9ef8,&uStack_180);
            uVar5 = uStack_188;
            uVar4 = uStack_190;
            uVar3 = uStack_198;
            lVar11 = lStack_1d8;
            if (lStack_1d8 == lStack_1e8) {
              func_0x0050c174(&lStack_1e8,&UNK_009ea1b0);
            }
            puVar13 = (undefined8 *)(lStack_1e0 + lVar11 * 0x18);
            *puVar13 = uVar3;
            puVar13[1] = uVar4;
            puVar13[2] = uVar5;
            lStack_1d8 = lVar11 + 1;
            if (lStack_1b0 != 0) {
              func_0x00187bd4(lStack_1a8,lStack_1b0,1);
            }
            if (lStack_1d0 != 0) {
              func_0x00187bd4(lStack_1c8,lStack_1d0,1);
            }
          }
        }
        if (lStack_1d8 == 0) {
          if (lStack_1e8 != 0) {
            func_0x00187bd4(lStack_1e0,lStack_1e8 * 0x18,8);
          }
        }
        else {
          uStack_140 = (undefined1)lStack_1e0;
          uStack_13f = (undefined7)((ulong)lStack_1e0 >> 8);
          uStack_148 = (undefined1)lStack_1e8;
          uStack_147 = (undefined7)((ulong)lStack_1e8 >> 8);
          uStack_138 = (undefined1)lStack_1d8;
          uStack_137 = (undefined7)((ulong)lStack_1d8 >> 8);
          pppuStack_150._1_7_ = (undefined7)((ulong)pppuStack_150 >> 8);
          pppuStack_150 = (undefined ***)CONCAT71(pppuStack_150._1_7_,5);
          func_0x0051b078(plVar9,0xe,&pppuStack_150);
        }
        return plVar9;
      }
      func_0x007a1f18(8,0xe0);
    }
    else {
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
  }
  else {
    func_0x007a2570(uVar8,*(ulong *)(lVar7 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x51dbb0);
  (*pcVar6)();
}

