
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_004be2d8(void)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  int *piVar8;
  undefined8 uVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long *extraout_x8;
  long extraout_x9;
  bool bVar13;
  bool bVar14;
  bool bVar15;
  undefined1 auVar16 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long lStack_300;
  int iStack_2f4;
  int iStack_2dc;
  long lStack_2d0;
  long lStack_2c8;
  undefined8 *puStack_2c0;
  long lStack_2b8;
  long lStack_2b0;
  long *plStack_2a8;
  long lStack_2a0;
  long lStack_298;
  undefined1 auStack_290 [24];
  undefined8 uStack_278;
  long lStack_270;
  undefined8 *puStack_268;
  long lStack_260;
  long lStack_258;
  long *plStack_250;
  long lStack_248;
  long lStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined8 uStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  long lStack_188;
  undefined8 *puStack_180;
  long lStack_178;
  long lStack_170;
  int *piStack_168;
  undefined8 *puStack_160;
  long lStack_158;
  long lStack_150;
  long *plStack_148;
  long lStack_140;
  long lStack_138;
  long *plStack_130;
  long *plStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  
  if (in_stack_00000040 != 0) {
    func_0x00187bd4(in_stack_00000048,in_stack_00000040 * 0x28,8);
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 2,4);
  }
  __Unwind_Resume();
  auVar16 = func_0x007a2668();
  uVar9 = auVar16._8_8_;
  uVar3 = auVar16._0_8_;
  lVar4 = func_0x005847cc();
  if (lVar4 == 0) {
    func_0x007a23bc(&UNK_009e5f58);
code_r0x004be7d8:
    func_0x007a23bc(&UNK_009e5f70);
  }
  else {
    if ((((*(long *)(lVar4 + 0x10) == 0) ||
         (lVar4 = *(long *)(lVar4 + 8) + *(long *)(lVar4 + 0x10) * 0x108,
         *(long *)(lVar4 + -0xf0) != 0x10 || lVar4 == 0xe8)) ||
        (func_0x00584d50(&lStack_300,uVar3,uVar9), lStack_300 == 0)) || (iStack_2f4 != iStack_2dc))
    {
      return 0;
    }
    lVar4 = func_0x005847cc(uVar3,uVar9);
    if (lVar4 == 0) goto code_r0x004be7d8;
    if (*(long *)(lVar4 + 0x10) == 0) {
code_r0x004be854:
      func_0x007a23bc(&UNK_009e5f88);
      plVar11 = extraout_x8;
      lStack_158 = extraout_x9;
code_r0x004be860:
      piStack_168 = (int *)plVar11[1];
      lStack_170 = *plVar11;
      puStack_160 = (undefined8 *)plVar11[2];
      lStack_f8 = plVar11[0xf];
      lStack_100 = plVar11[0xe];
      lStack_e8 = plVar11[0x11];
      lStack_f0 = plVar11[0x10];
      lStack_d8 = plVar11[0x13];
      lStack_e0 = plVar11[0x12];
      lStack_c8 = plVar11[0x15];
      lStack_d0 = plVar11[0x14];
      lStack_b8 = plVar11[0x17];
      lStack_c0 = plVar11[0x16];
      lStack_a8 = plVar11[0x19];
      lStack_b0 = plVar11[0x18];
      lStack_98 = plVar11[0x1b];
      lStack_a0 = plVar11[0x1a];
      lStack_88 = plVar11[0x1d];
      lStack_90 = plVar11[0x1c];
      lStack_78 = plVar11[0x1f];
      lStack_80 = plVar11[0x1e];
      lStack_70 = plVar11[0x20];
      plStack_148 = (long *)plVar11[5];
      lStack_150 = plVar11[4];
      lStack_138 = plVar11[7];
      lStack_140 = plVar11[6];
      plStack_128 = (long *)plVar11[9];
      plStack_130 = (long *)plVar11[8];
      lStack_118 = plVar11[0xb];
      lStack_120 = plVar11[10];
      lStack_108 = plVar11[0xd];
      lStack_110 = plVar11[0xc];
      func_0x007a2810(&UNK_008a2019,0x2b,&lStack_170,&UNK_009e5948,&UNK_009e5fa0);
      goto LAB_004be8e0;
    }
    lVar10 = *(long *)(lVar4 + 0x10) + -1;
    *(long *)(lVar4 + 0x10) = lVar10;
    plVar11 = (long *)(*(long *)(lVar4 + 8) + lVar10 * 0x108);
    lStack_158 = plVar11[3];
    if (lStack_158 == 0x21) goto code_r0x004be854;
    if (lStack_158 != 0x10) goto code_r0x004be860;
    lStack_2c8 = plVar11[5];
    lStack_2d0 = plVar11[4];
    lStack_2b8 = plVar11[7];
    puStack_2c0 = (undefined8 *)plVar11[6];
    plStack_2a8 = (long *)plVar11[9];
    lStack_2b0 = plVar11[8];
    lStack_298 = plVar11[0xb];
    lStack_2a0 = plVar11[10];
    plStack_128 = (long *)plVar11[0xd];
    plStack_130 = (long *)plVar11[0xc];
    lVar4 = *plStack_130;
    *plStack_130 = lVar4 + -1;
    LORelease();
    lStack_170 = lStack_2d0;
    piStack_168 = (int *)lStack_2c8;
    puStack_160 = puStack_2c0;
    lStack_158 = lStack_2b8;
    lStack_150 = lStack_2b0;
    plStack_148 = plStack_2a8;
    lStack_140 = lStack_2a0;
    lStack_138 = lStack_298;
    if (lVar4 == 1) {
      func_0x005d2c74(&plStack_130);
    }
    lVar4 = *plStack_128;
    *plStack_128 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      func_0x005d2c74(&plStack_128);
    }
    if (lStack_2d0 < 6) {
      if (lStack_2d0 < 3) {
        if (lStack_2d0 == 0) goto code_r0x004be64c;
        if (lStack_2d0 == 1) goto code_r0x004be548;
        bVar14 = false;
        puStack_268 = puStack_2c0;
        lStack_270 = lStack_2c8;
        lStack_258 = lStack_2b0;
        lStack_260 = lStack_2b8;
        uStack_278 = 0xd;
        goto FUN_004be660;
      }
      if (lStack_2d0 != 3) {
        if (lStack_2d0 != 4) {
          uVar5 = func_0x005ca810((ulong)&lStack_2d0 | 8);
          goto code_r0x004be648;
        }
        goto code_r0x004be64c;
      }
      bVar13 = false;
      puStack_268 = puStack_2c0;
      lStack_270 = lStack_2c8;
      lStack_258 = lStack_2b0;
      lStack_260 = lStack_2b8;
      lStack_248 = lStack_2a0;
      plStack_250 = plStack_2a8;
      lStack_240 = lStack_298;
      uStack_278 = 0xe;
      bVar15 = true;
      bVar14 = true;
    }
    else {
      if (lStack_2d0 < 9) {
        if (lStack_2d0 != 6) {
          if (lStack_2d0 != 7) {
            uVar5 = func_0x005ca90c((ulong)&lStack_2d0 | 8);
            goto code_r0x004be648;
          }
code_r0x004be548:
          piStack_168 = (int *)lStack_2c8;
          lStack_170 = lStack_2d0;
          lStack_158 = lStack_2b8;
          puStack_160 = puStack_2c0;
          plStack_148 = plStack_2a8;
          lStack_150 = lStack_2b0;
          lStack_138 = lStack_298;
          lStack_140 = lStack_2a0;
          puVar6 = (undefined8 *)func_0x00187bd0(0x18,8);
          if (puVar6 == (undefined8 *)0x0) {
            func_0x007a1f18(8,0x18);
            goto LAB_004be8e0;
          }
          puVar7 = (undefined8 *)func_0x00187bd0(0x28,8);
          uVar1 = _UNK_007fc120;
          if (puVar7 == (undefined8 *)0x0) {
            func_0x007a1f18(8,0x28);
            goto LAB_004be8e0;
          }
          puVar7[1] = _UNK_007fc128;
          *puVar7 = uVar1;
          puVar7[2] = 0x8000000000000000;
          *puVar6 = 0x8000000000000000;
          puVar6[1] = puVar7;
          lStack_188 = 1;
          lStack_178 = 1;
          puStack_180 = puVar6;
          plVar11 = (long *)func_0x00187bd0(0x40,8);
          if (plVar11 == (long *)0x0) {
            func_0x007a1f18(8,0x40);
            goto LAB_004be8e0;
          }
          bVar15 = false;
          bVar14 = false;
          bVar13 = false;
          plVar11[1] = (long)piStack_168;
          *plVar11 = lStack_170;
          plVar11[3] = lStack_158;
          plVar11[2] = (long)puStack_160;
          plVar11[5] = (long)plStack_148;
          plVar11[4] = lStack_150;
          plVar11[7] = lStack_138;
          plVar11[6] = lStack_140;
          uStack_278 = 0xf;
          lStack_260 = lStack_178;
          lStack_258 = 1;
          lStack_248 = 1;
          lStack_240 = CONCAT62(lStack_240._2_6_,1);
          puStack_268 = puStack_180;
          lStack_270 = lStack_188;
          plStack_250 = plVar11;
          goto code_r0x004be664;
        }
      }
      else if (lStack_2d0 == 9) {
        uVar5 = func_0x005c0b7c((ulong)&lStack_2d0 | 8);
code_r0x004be648:
        if ((uVar5 & 1) != 0) goto code_r0x004be548;
      }
      else if ((lStack_2d0 != 10) && (lStack_2c8 != -0x8000000000000000)) goto code_r0x004be548;
code_r0x004be64c:
      uStack_278 = 0x21;
      bVar14 = true;
FUN_004be660:
      bVar15 = true;
      bVar13 = true;
    }
code_r0x004be664:
    plVar11 = (long *)func_0x005847cc(uVar3,uVar9);
    if (plVar11 != (long *)0x0) {
      _memcpy(&lStack_170,auStack_290,0x108);
      lVar10 = lStack_158;
      lVar4 = plVar11[2];
      if ((ulong)(*plVar11 - lVar4) < (ulong)(lStack_158 != 0x21)) {
        func_0x007a535c(plVar11,lVar4,(ulong)(lStack_158 != 0x21),8,0x108);
        lVar4 = plVar11[2];
      }
      if (lVar10 != 0x21) {
        lVar12 = plVar11[1] + lVar4 * 0x108;
        *(long *)(lVar12 + 0x18) = lVar10;
        *(undefined8 *)(lVar12 + 0x78) = uStack_218;
        *(undefined8 *)(lVar12 + 0x70) = uStack_220;
        *(undefined8 *)(lVar12 + 0x88) = uStack_208;
        *(undefined8 *)(lVar12 + 0x80) = uStack_210;
        *(undefined8 *)(lVar12 + 0x58) = uStack_238;
        *(long *)(lVar12 + 0x50) = lStack_240;
        *(undefined8 *)(lVar12 + 0x68) = uStack_228;
        *(undefined8 *)(lVar12 + 0x60) = uStack_230;
        *(undefined8 *)(lVar12 + 0xb8) = uStack_1d8;
        *(undefined8 *)(lVar12 + 0xb0) = uStack_1e0;
        *(undefined8 *)(lVar12 + 200) = uStack_1c8;
        *(undefined8 *)(lVar12 + 0xc0) = uStack_1d0;
        *(undefined8 *)(lVar12 + 0x98) = uStack_1f8;
        *(undefined8 *)(lVar12 + 0x90) = uStack_200;
        *(undefined8 *)(lVar12 + 0xa8) = uStack_1e8;
        *(undefined8 *)(lVar12 + 0xa0) = uStack_1f0;
        *(undefined8 *)(lVar12 + 0x100) = uStack_190;
        *(undefined8 *)(lVar12 + 0xe8) = uStack_1a8;
        *(undefined8 *)(lVar12 + 0xe0) = uStack_1b0;
        *(undefined8 *)(lVar12 + 0xf8) = uStack_198;
        *(undefined8 *)(lVar12 + 0xf0) = uStack_1a0;
        *(undefined8 *)(lVar12 + 0xd8) = uStack_1b8;
        *(undefined8 *)(lVar12 + 0xd0) = uStack_1c0;
        *(long *)(lVar12 + 0x38) = lStack_258;
        *(long *)(lVar12 + 0x30) = lStack_260;
        *(long *)(lVar12 + 0x48) = lStack_248;
        *(long **)(lVar12 + 0x40) = plStack_250;
        *(undefined8 **)(lVar12 + 0x28) = puStack_268;
        *(long *)(lVar12 + 0x20) = lStack_270;
        lVar4 = lVar4 + 1;
      }
      plVar11[2] = lVar4;
      piVar8 = (int *)func_0x00187bd0(0x28,8);
      if (piVar8 != (int *)0x0) {
        *piVar8 = iStack_2f4;
        piVar8[2] = 0;
        piVar8[3] = 0;
        piVar8[4] = 8;
        piVar8[5] = 0;
        piVar8[6] = 0;
        piVar8[7] = 0;
        *(undefined1 *)(piVar8 + 8) = 0;
        lStack_170 = 1;
        puStack_160 = (undefined8 *)0x1;
        piStack_168 = piVar8;
        func_0x00584c34(&lStack_188,uVar3,uVar9,&lStack_170);
        func_0x004ce364(&lStack_188);
        if (lStack_188 != 0) {
          func_0x00187bd4(puStack_180,lStack_188 * 0x28,8);
        }
        if (bVar15) {
          if (lStack_2d0 == 2) {
            if (bVar14) {
              func_0x004bc150((ulong)&lStack_2d0 | 8);
            }
          }
          else if (lStack_2d0 == 3) {
            if (bVar13) {
              func_0x004bc4a8((ulong)&lStack_2d0 | 8);
            }
          }
          else {
            func_0x004bb4f4(&lStack_2d0);
          }
        }
        return 1;
      }
      func_0x007a1f18(8,0x28);
      goto LAB_004be8e0;
    }
  }
  func_0x007a23bc(&UNK_009e5fb8);
LAB_004be8e0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4be8e4);
  (*pcVar2)();
}

