
/* WARNING: Removing unreachable block (ram,0x0051dd50) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_0051dc9c(undefined8 param_1)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  undefined *puVar12;
  int unaff_w24;
  ulong unaff_x28;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000028;
  undefined **ppuStack_198;
  undefined *puStack_190;
  undefined **ppuStack_188;
  undefined *puStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined *puStack_160;
  undefined1 uStack_158;
  undefined7 uStack_157;
  undefined1 uStack_150;
  undefined7 uStack_14f;
  undefined1 uStack_148;
  undefined7 uStack_147;
  undefined *puStack_140;
  undefined8 uStack_138;
  undefined1 uStack_130;
  undefined6 uStack_12f;
  undefined1 uStack_129;
  undefined7 uStack_128;
  undefined1 uStack_121;
  undefined7 uStack_120;
  undefined1 uStack_119;
  undefined7 uStack_118;
  undefined1 uStack_111;
  undefined ***pppuStack_110;
  undefined *puStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 *puStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined4 uStack_b0;
  undefined2 uStack_ac;
  undefined1 uStack_aa;
  undefined1 uStack_a9;
  undefined2 uStack_a8;
  undefined4 uStack_a6;
  undefined1 uStack_a2;
  undefined1 uStack_a1;
  undefined2 uStack_a0;
  undefined2 uStack_9e;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined2 uStack_90;
  undefined4 uStack_8e;
  undefined1 uStack_8a;
  undefined1 uStack_89;
  undefined2 uStack_88;
  undefined4 uStack_86;
  undefined2 uStack_82;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined4 uStack_78;
  undefined2 uStack_74;
  undefined1 uStack_72;
  undefined1 uStack_71;
  undefined2 uStack_70;
  undefined4 uStack_6e;
  undefined1 uStack_6a;
  undefined1 uStack_69;
  undefined2 uStack_68;
  undefined2 uStack_66;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined2 uStack_58;
  undefined4 uStack_56;
  undefined2 uStack_52;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x0016b01c(&uStack0000000000000028);
  if (((unaff_w24 != 0) && (lVar8 = *unaff_x21, lVar8 != -0x8000000000000000)) && (lVar8 != 0)) {
    func_0x00187bd4(unaff_x21[1],lVar8,1);
  }
  lVar8 = *unaff_x20;
  if (lVar8 != -0x8000000000000000) {
    if (((unaff_x28 & 1) != 0) && (lVar8 != 0)) {
      func_0x00187bd4(unaff_x20[1],lVar8,1);
    }
    lVar8 = unaff_x20[3];
    if ((lVar8 != -0x8000000000000000) && (lVar8 != 0)) {
      func_0x00187bd4(unaff_x20[4],lVar8,1);
    }
  }
  __Unwind_Resume(param_1);
  plVar9 = (long *)((long)&MACH_HEADER.magic + 1);
  func_0x00187bd4(*(undefined8 *)(unaff_x19 + 8));
  __Unwind_Resume(param_1);
  auVar13 = func_0x007a2668();
  puVar7 = auVar13._8_8_;
  lVar4 = auVar13._0_8_;
  uStack_50 = 0;
  uStack_48 = 1;
  lVar8 = 0;
  lVar10 = *(long *)(lVar4 + 0xf0) << 4;
  uVar5 = 0xffffffffffffffff;
  plVar11 = *(long **)(lVar4 + 0xe8);
  do {
    if (lVar10 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x0051de54;
    }
    lVar1 = *plVar11;
    plVar2 = plVar11 + 1;
    uVar5 = uVar5 + 1;
    lVar8 = lVar8 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar11 = plVar11 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (uVar5 < *(ulong *)(lVar4 + 0x108)) {
    lVar8 = *(long *)(lVar4 + 0x100) + lVar8;
    lVar10 = *(long *)(lVar8 + -0x18);
    puVar12 = (undefined *)
              (*(long *)(lVar8 + -0x20) + (*(long *)(lVar10 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar14 = (**(code **)(lVar10 + 0x18))(puVar12);
    if (auVar14._0_8_ == 0x1414db8803bc16e0 && auVar14._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0051de54:
      puStack_180 = &UNK_008a6e36;
      if (puVar12 != (undefined *)0x0) {
        puStack_180 = puVar12;
      }
      puStack_190 = puStack_180 + 0x54;
      ppuStack_198 = &puStack_190;
      puStack_180 = puStack_180 + 0x46;
      ppuStack_188 = &puStack_180;
      puStack_108 = (undefined *)0x1;
      uStack_100 = 0;
      uStack_f8 = 0;
      puStack_f0 = (undefined8 *)0x8;
      pppuStack_110 = (undefined ***)0x0;
      uStack_130 = 2;
      uStack_12f = 0;
      uStack_129 = 0;
      uStack_c8 = 0;
      uStack_e0 = _UNK_0089f368;
      uStack_e8 = _UNK_0089f360;
      uStack_b8 = CONCAT31(uStack_b8._1_3_,3);
      uStack_b4 = CONCAT31(uStack_b4._1_3_,3);
      uStack_b0 = CONCAT31(uStack_b0._1_3_,3);
      uStack_ac = 0;
      uStack_aa = 3;
      uStack_a6 = CONCAT31(uStack_a6._1_3_,3);
      uStack_a2 = 3;
      uStack_9e = 0;
      uStack_9c = CONCAT31(uStack_9c._1_3_,3);
      uStack_98 = CONCAT31(uStack_98._1_3_,3);
      uStack_94 = CONCAT31(uStack_94._1_3_,3);
      uStack_90 = 0;
      uStack_8e = CONCAT31(uStack_8e._1_3_,3);
      uStack_8a = 3;
      uStack_86 = CONCAT31(uStack_86._1_3_,3);
      uStack_82 = 0;
      uStack_80 = CONCAT31(uStack_80._1_3_,3);
      uStack_7c = CONCAT31(uStack_7c._1_3_,3);
      uStack_78 = CONCAT31(uStack_78._1_3_,3);
      uStack_74 = 0;
      uStack_72 = 3;
      uStack_6e = CONCAT31(uStack_6e._1_3_,3);
      uStack_6a = 3;
      uStack_66 = 0;
      uStack_64 = CONCAT31(uStack_64._1_3_,3);
      uStack_60 = CONCAT31(uStack_60._1_3_,3);
      uStack_5c = CONCAT31(uStack_5c._1_3_,3);
      uStack_58 = 0;
      uStack_56 = (undefined4)_UNK_008a6b30;
      puVar6 = (undefined8 *)func_0x00187bd0(0xe0,8);
      if (puVar6 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0xe0);
      }
      else {
        puVar6[0x15] = CONCAT26(uStack_82,CONCAT42(uStack_86,uStack_88));
        puVar6[0x14] = CONCAT17(uStack_89,CONCAT16(uStack_8a,CONCAT42(uStack_8e,uStack_90)));
        puVar6[0x17] = CONCAT17(uStack_71,CONCAT16(uStack_72,CONCAT24(uStack_74,uStack_78)));
        puVar6[0x16] = CONCAT44(uStack_7c,uStack_80);
        puVar6[0x19] = CONCAT44(uStack_64,CONCAT22(uStack_66,uStack_68));
        puVar6[0x18] = CONCAT17(uStack_69,CONCAT16(uStack_6a,CONCAT42(uStack_6e,uStack_70)));
        puVar6[0x1b] = CONCAT26(uStack_52,CONCAT42(uStack_56,uStack_58));
        puVar6[0x1a] = CONCAT44(uStack_5c,uStack_60);
        puVar6[0xd] = uStack_c8;
        puVar6[0xc] = uStack_d0;
        puVar6[0xf] = CONCAT44(uStack_b4,uStack_b8);
        puVar6[0xe] = uStack_c0;
        puVar6[0x11] = CONCAT17(uStack_a1,CONCAT16(uStack_a2,CONCAT42(uStack_a6,uStack_a8)));
        puVar6[0x10] = CONCAT17(uStack_a9,CONCAT16(uStack_aa,CONCAT24(uStack_ac,uStack_b0)));
        puVar6[0x13] = CONCAT44(uStack_94,uStack_98);
        puVar6[0x12] = CONCAT44(uStack_9c,CONCAT22(uStack_9e,uStack_a0));
        puVar6[5] = puStack_108;
        puVar6[4] = pppuStack_110;
        puVar6[7] = uStack_f8;
        puVar6[6] = uStack_100;
        puVar6[9] = uStack_e8;
        puVar6[8] = puStack_f0;
        puVar6[0xb] = uStack_d8;
        puVar6[10] = uStack_e0;
        puVar6[1] = CONCAT17(uStack_121,uStack_128);
        *puVar6 = CONCAT17(uStack_129,CONCAT61(uStack_12f,uStack_130));
        puVar6[3] = CONCAT17(uStack_111,uStack_118);
        puVar6[2] = CONCAT17(uStack_119,uStack_120);
        func_0x0051ab00(puVar6,lVar4);
        uStack_178 = 0;
        uStack_170 = 1;
        uStack_130 = SUB81(&ppuStack_188,0);
        uStack_12f = (undefined6)((ulong)&ppuStack_188 >> 8);
        uStack_129 = (undefined1)((ulong)&ppuStack_188 >> 0x38);
        uStack_128 = 0x524310;
        uStack_121 = 0;
        uStack_120 = auVar13._8_7_;
        uStack_119 = auVar13[0xf];
        uStack_118 = 0x51a2a0;
        uStack_111 = 0;
        pppuStack_110 = &ppuStack_198;
        puStack_108 = &DAT_00524310;
        uStack_168 = 0;
        puStack_160 = &UNK_009ea1c8;
        uStack_158 = 6;
        uStack_157 = 0;
        puStack_140 = &UNK_008a72a0;
        uStack_138 = 5;
        uStack_150 = SUB81(&uStack_130,0);
        uStack_14f = (undefined7)((ulong)&uStack_130 >> 8);
        uStack_148 = 3;
        uStack_147 = 0;
        func_0x0046849c(&uStack_178,&UNK_009e9ef8,&puStack_160);
        uStack_121 = (undefined1)puVar7[1];
        uStack_120 = (undefined7)((ulong)puVar7[1] >> 8);
        uStack_129 = (undefined1)*puVar7;
        uStack_128 = (undefined7)((ulong)*puVar7 >> 8);
        puStack_140 = (undefined *)puVar7[2];
        uStack_119 = SUB81(puStack_140,0);
        uStack_118 = (undefined7)((ulong)puStack_140 >> 8);
        puStack_160 = (undefined *)CONCAT71(puStack_160._1_7_,1);
        uStack_158 = 2;
        uStack_157 = CONCAT61(uStack_12f,uStack_130);
        uStack_14f = uStack_128;
        uStack_150 = uStack_129;
        uStack_148 = uStack_121;
        uStack_147 = uStack_120;
        puVar7 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar7 != (undefined8 *)0x0) {
          puVar7[1] = uStack_170;
          *puVar7 = uStack_178;
          puVar7[2] = uStack_168;
          uStack_128 = (undefined7)CONCAT71(uStack_157,uStack_158);
          uStack_121 = (undefined1)((uint7)uStack_157 >> 0x30);
          uStack_130 = SUB81(puStack_160,0);
          uStack_12f = (undefined6)((ulong)puStack_160 >> 8);
          uStack_129 = (undefined1)((ulong)puStack_160 >> 0x38);
          uStack_118 = (undefined7)CONCAT71(uStack_147,uStack_148);
          uStack_111 = (undefined1)((uint7)uStack_147 >> 0x30);
          uStack_120 = (undefined7)CONCAT71(uStack_14f,uStack_150);
          uStack_119 = (undefined1)((uint7)uStack_14f >> 0x30);
          pppuStack_110 = (undefined ***)puStack_140;
          puStack_108 = (undefined *)CONCAT71(puStack_108._1_7_,0xe);
          uStack_100 = CONCAT71(uStack_100._1_7_,5);
          uStack_f8 = 1;
          uStack_e8 = 1;
          puStack_f0 = puVar7;
          func_0x0051b0b8(puVar6,&uStack_130);
          if (*plVar9 != -0x8000000000000000) {
            uStack_120 = (undefined7)plVar9[1];
            uStack_119 = (undefined1)((ulong)plVar9[1] >> 0x38);
            uStack_128 = (undefined7)*plVar9;
            uStack_121 = (undefined1)((ulong)*plVar9 >> 0x38);
            uStack_118 = (undefined7)plVar9[2];
            uStack_111 = (undefined1)((ulong)plVar9[2] >> 0x38);
            uStack_130 = 4;
            func_0x0051b078(puVar6,0xf,&uStack_130);
          }
          return puVar6;
        }
        func_0x007a1f18(8,0x18);
      }
    }
    else {
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
  }
  else {
    func_0x007a2570(uVar5,*(ulong *)(lVar4 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x51e108);
  (*pcVar3)();
}

