
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0056c4a8(void)

{
  long *plVar1;
  bool bVar2;
  bool bVar3;
  undefined8 uVar4;
  code *pcVar5;
  ulong uVar6;
  undefined8 *puVar7;
  int *piVar8;
  ulong uVar9;
  long lVar10;
  long extraout_x8;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  long lVar14;
  bool bVar15;
  ulong uVar16;
  undefined1 auVar17 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long lStack_350;
  int iStack_344;
  long lStack_338;
  int iStack_32c;
  long lStack_320;
  long lStack_318;
  undefined8 *puStack_310;
  long lStack_308;
  undefined8 uStack_300;
  undefined8 *puStack_2f8;
  undefined8 uStack_2f0;
  undefined8 uStack_2e8;
  undefined1 auStack_2e0 [24];
  undefined8 uStack_2c8;
  long lStack_2c0;
  undefined8 *puStack_2b8;
  long lStack_2b0;
  undefined8 uStack_2a8;
  undefined8 *puStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined8 uStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
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
  long lStack_1d8;
  undefined8 *puStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  undefined8 *puStack_1b8;
  long lStack_1b0;
  undefined1 uStack_1a8;
  undefined7 uStack_1a7;
  long lStack_198;
  undefined8 uStack_190;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined4 uStack_170;
  undefined4 uStack_16c;
  undefined8 uStack_168;
  int iStack_160;
  undefined4 uStack_15c;
  undefined8 *puStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  long *plStack_140;
  long *plStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
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
  
  func_0x00187bd4();
  if (in_stack_00000010 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000010 << 2,4);
  }
  func_0x00558024(&uStack0000000000000030);
  if (uStack0000000000000030 != 0) {
    func_0x00187bd4(in_stack_00000038,uStack0000000000000030 * 0x48,8);
  }
  __Unwind_Resume();
  lVar11 = uStack0000000000000030;
  if (uStack0000000000000030 == 0) {
    func_0x007a2668();
    lVar11 = extraout_x8;
  }
  func_0x00187bd4(in_stack_00000038,lVar11 * 0x48,8);
  auVar17 = func_0x007a2668();
  uVar9 = auVar17._8_8_;
  lVar11 = auVar17._0_8_;
  uVar16 = uVar9 & 0xffffffff;
  if ((*(ulong *)(lVar11 + 0x28) <= uVar16) ||
     (plVar1 = (long *)(*(long *)(lVar11 + 0x20) + uVar16 * 0x20), *plVar1 == -0x8000000000000000))
  {
    func_0x007a23bc(&UNK_009eed40);
code_r0x0056caa8:
    func_0x007a1f18(8,0x18);
    goto code_r0x0056cb80;
  }
  if ((plVar1[2] == 0) ||
     (lVar12 = plVar1[1] + plVar1[2] * 0x108, *(long *)(lVar12 + -0xf0) != 0x10 || lVar12 == 0xe8))
  {
    return 0;
  }
  func_0x00584d50(&lStack_350,lVar11);
  if (lStack_350 == 0) {
    return 0;
  }
  if (iStack_344 != iStack_32c) {
    return 0;
  }
  if (*(long *)(lStack_350 + 0x10) != *(long *)(lStack_338 + 0x10)) {
    return 0;
  }
  lVar12 = *(long *)(lStack_338 + 8) + 8;
  lVar10 = *(long *)(lStack_350 + 8) + 8;
  lVar14 = *(long *)(lStack_350 + 0x10) + 1;
  while (lVar14 = lVar14 + -1, lVar14 != 0) {
    if (*(long *)(lVar10 + -8) != *(long *)(lVar12 + -8)) {
      return 0;
    }
    lVar12 = lVar12 + 0x48;
    lVar10 = lVar10 + 0x48;
    uVar6 = func_0x00581ee4();
    if ((uVar6 & 1) == 0) {
      return 0;
    }
  }
  if ((*(ulong *)(lVar11 + 0x28) <= uVar16) ||
     (plVar1 = (long *)(*(long *)(lVar11 + 0x20) + uVar16 * 0x20), *plVar1 == -0x8000000000000000))
  {
    func_0x007a23bc(&UNK_009eed58);
    goto LAB_0056cad4;
  }
  if (plVar1[2] == 0) {
LAB_0056cae4:
    func_0x007a23bc(&UNK_009eed70);
  }
  else {
    lVar12 = plVar1[2] + -1;
    plVar1[2] = lVar12;
    puVar13 = (undefined8 *)(plVar1[1] + lVar12 * 0x108);
    lVar12 = puVar13[3];
    if (lVar12 == 0x21) goto LAB_0056cae4;
    if (lVar12 != 0x10) {
      uStack_170 = (undefined4)puVar13[2];
      uStack_16c = (undefined4)((ulong)puVar13[2] >> 0x20);
      uStack_178._0_4_ = (undefined4)puVar13[1];
      uStack_178._4_4_ = (undefined4)((ulong)puVar13[1] >> 0x20);
      uStack_180._0_4_ = (undefined4)*puVar13;
      uStack_180._4_4_ = (undefined4)((ulong)*puVar13 >> 0x20);
      uStack_108 = puVar13[0xf];
      uStack_110 = puVar13[0xe];
      uStack_f8 = puVar13[0x11];
      uStack_100 = puVar13[0x10];
      uStack_e8 = puVar13[0x13];
      uStack_f0 = puVar13[0x12];
      uStack_d8 = puVar13[0x15];
      uStack_e0 = puVar13[0x14];
      uStack_c8 = puVar13[0x17];
      uStack_d0 = puVar13[0x16];
      uStack_b8 = puVar13[0x19];
      uStack_c0 = puVar13[0x18];
      uStack_a8 = puVar13[0x1b];
      uStack_b0 = puVar13[0x1a];
      uStack_98 = puVar13[0x1d];
      uStack_a0 = puVar13[0x1c];
      uStack_88 = puVar13[0x1f];
      uStack_90 = puVar13[0x1e];
      uStack_80 = puVar13[0x20];
      uStack_168._0_4_ = (undefined4)lVar12;
      uStack_168._4_4_ = (undefined4)((ulong)lVar12 >> 0x20);
      puStack_158 = (undefined8 *)puVar13[5];
      iStack_160 = (int)puVar13[4];
      uStack_15c = (undefined4)((ulong)puVar13[4] >> 0x20);
      uStack_148 = puVar13[7];
      uStack_150 = puVar13[6];
      plStack_138 = (long *)puVar13[9];
      plStack_140 = (long *)puVar13[8];
      uStack_128 = puVar13[0xb];
      uStack_130 = puVar13[10];
      uStack_118 = puVar13[0xd];
      uStack_120 = puVar13[0xc];
      func_0x007a2810(&UNK_008abcc0,0x2b,&uStack_180,&UNK_009ee270,&UNK_009eed88);
      goto code_r0x0056cb80;
    }
    lStack_318 = puVar13[5];
    lStack_320 = puVar13[4];
    lStack_308 = puVar13[7];
    puStack_310 = (undefined8 *)puVar13[6];
    puStack_2f8 = (undefined8 *)puVar13[9];
    uStack_300 = puVar13[8];
    uStack_2e8 = puVar13[0xb];
    uStack_2f0 = puVar13[10];
    plStack_138 = (long *)puVar13[0xd];
    plStack_140 = (long *)puVar13[0xc];
    uStack_168._0_4_ = (undefined4)lStack_308;
    uStack_168._4_4_ = (undefined4)((ulong)lStack_308 >> 0x20);
    uStack_170 = SUB84(puStack_310,0);
    uStack_16c = (undefined4)((ulong)puStack_310 >> 0x20);
    iStack_160 = (int)uStack_300;
    uStack_15c = (undefined4)((ulong)uStack_300 >> 0x20);
    uStack_178._0_4_ = (undefined4)lStack_318;
    uStack_178._4_4_ = (undefined4)((ulong)lStack_318 >> 0x20);
    uStack_180._0_4_ = (undefined4)lStack_320;
    uStack_180._4_4_ = (undefined4)((ulong)lStack_320 >> 0x20);
    lVar12 = *plStack_140;
    *plStack_140 = lVar12 + -1;
    LORelease();
    puStack_158 = puStack_2f8;
    uStack_150 = uStack_2f0;
    uStack_148 = uStack_2e8;
    if (lVar12 == 1) {
      func_0x005d2c74(&plStack_140);
    }
    lVar12 = *plStack_138;
    *plStack_138 = lVar12 + -1;
    LORelease();
    if (lVar12 == 1) {
      func_0x005d2c74(&plStack_138);
    }
    if (lStack_320 == 2) {
      puStack_2b8 = puStack_310;
      lStack_2c0 = lStack_318;
      uStack_2a8 = uStack_300;
      lStack_2b0 = lStack_308;
      uStack_2c8 = 0xd;
      bVar15 = true;
      bVar3 = false;
      bVar2 = true;
    }
    else if (lStack_320 == 3) {
      puStack_2b8 = puStack_310;
      lStack_2c0 = lStack_318;
      uStack_2a8 = uStack_300;
      lStack_2b0 = lStack_308;
      uStack_298 = uStack_2f0;
      puStack_2a0 = puStack_2f8;
      uStack_290 = uStack_2e8;
      uStack_2c8 = 0xe;
      bVar15 = true;
      bVar3 = true;
      bVar2 = false;
    }
    else {
      uVar6 = func_0x00566f6c(&lStack_320);
      if ((uVar6 & 1) == 0) {
        uStack_2c8 = 0x21;
        bVar15 = true;
        bVar3 = true;
        bVar2 = true;
      }
      else {
        uStack_178._0_4_ = (undefined4)lStack_318;
        uStack_178._4_4_ = (undefined4)((ulong)lStack_318 >> 0x20);
        uStack_180._0_4_ = (undefined4)lStack_320;
        uStack_180._4_4_ = (undefined4)((ulong)lStack_320 >> 0x20);
        uStack_168._0_4_ = (undefined4)lStack_308;
        uStack_168._4_4_ = (undefined4)((ulong)lStack_308 >> 0x20);
        uStack_170 = SUB84(puStack_310,0);
        uStack_16c = (undefined4)((ulong)puStack_310 >> 0x20);
        puStack_158 = puStack_2f8;
        iStack_160 = (int)uStack_300;
        uStack_15c = (undefined4)((ulong)uStack_300 >> 0x20);
        uStack_148 = uStack_2e8;
        uStack_150 = uStack_2f0;
        puVar13 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar13 == (undefined8 *)0x0) goto code_r0x0056caa8;
        puVar7 = (undefined8 *)func_0x00202b80();
        uVar4 = _UNK_007fc120;
        puVar7[1] = _UNK_007fc128;
        *puVar7 = uVar4;
        puVar7[2] = 0x8000000000000000;
        *puVar13 = 0x8000000000000000;
        puVar13[1] = puVar7;
        lStack_1c0 = 1;
        lStack_1b0 = 1;
        puStack_1b8 = puVar13;
        puVar13 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar13 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x40);
          goto code_r0x0056cb80;
        }
        bVar15 = false;
        bVar3 = false;
        bVar2 = false;
        puVar13[1] = CONCAT44(uStack_178._4_4_,(undefined4)uStack_178);
        *puVar13 = CONCAT44(uStack_180._4_4_,(undefined4)uStack_180);
        puVar13[3] = CONCAT44(uStack_168._4_4_,(undefined4)uStack_168);
        puVar13[2] = CONCAT44(uStack_16c,uStack_170);
        puVar13[5] = puStack_158;
        puVar13[4] = CONCAT44(uStack_15c,iStack_160);
        puVar13[7] = uStack_148;
        puVar13[6] = uStack_150;
        uStack_2c8 = 0xf;
        lStack_2b0 = lStack_1b0;
        uStack_2a8 = 1;
        uStack_298 = 1;
        uStack_290 = CONCAT62(uStack_290._2_6_,1);
        puStack_2b8 = puStack_1b8;
        lStack_2c0 = lStack_1c0;
        puStack_2a0 = puVar13;
      }
    }
    if (*(ulong *)(lVar11 + 0x28) <= uVar16) {
LAB_0056cad4:
      func_0x007a23bc(&UNK_009eeda0);
      goto code_r0x0056cb80;
    }
    plVar1 = (long *)(*(long *)(lVar11 + 0x20) + uVar16 * 0x20);
    lVar12 = *plVar1;
    if (lVar12 == -0x8000000000000000) goto LAB_0056cad4;
    _memcpy(&uStack_180,auStack_2e0,0x108);
    lVar14 = CONCAT44(uStack_168._4_4_,(undefined4)uStack_168);
    lVar10 = plVar1[2];
    if ((ulong)(lVar12 - lVar10) < (ulong)(lVar14 != 0x21)) {
      func_0x007abb04(plVar1,lVar10,(ulong)(lVar14 != 0x21),8,0x108);
      lVar10 = plVar1[2];
    }
    if (lVar14 != 0x21) {
      lVar12 = plVar1[1] + lVar10 * 0x108;
      *(long *)(lVar12 + 0x18) = lVar14;
      *(undefined8 *)(lVar12 + 0x78) = uStack_268;
      *(undefined8 *)(lVar12 + 0x70) = uStack_270;
      *(undefined8 *)(lVar12 + 0x88) = uStack_258;
      *(undefined8 *)(lVar12 + 0x80) = uStack_260;
      *(undefined8 *)(lVar12 + 0x58) = uStack_288;
      *(undefined8 *)(lVar12 + 0x50) = uStack_290;
      *(undefined8 *)(lVar12 + 0x68) = uStack_278;
      *(undefined8 *)(lVar12 + 0x60) = uStack_280;
      *(undefined8 *)(lVar12 + 0xb8) = uStack_228;
      *(undefined8 *)(lVar12 + 0xb0) = uStack_230;
      *(undefined8 *)(lVar12 + 200) = uStack_218;
      *(undefined8 *)(lVar12 + 0xc0) = uStack_220;
      *(undefined8 *)(lVar12 + 0x98) = uStack_248;
      *(undefined8 *)(lVar12 + 0x90) = uStack_250;
      *(undefined8 *)(lVar12 + 0xa8) = uStack_238;
      *(undefined8 *)(lVar12 + 0xa0) = uStack_240;
      *(undefined8 *)(lVar12 + 0x100) = uStack_1e0;
      *(undefined8 *)(lVar12 + 0xe8) = uStack_1f8;
      *(undefined8 *)(lVar12 + 0xe0) = uStack_200;
      *(undefined8 *)(lVar12 + 0xf8) = uStack_1e8;
      *(undefined8 *)(lVar12 + 0xf0) = uStack_1f0;
      *(undefined8 *)(lVar12 + 0xd8) = uStack_208;
      *(undefined8 *)(lVar12 + 0xd0) = uStack_210;
      *(undefined8 *)(lVar12 + 0x38) = uStack_2a8;
      *(long *)(lVar12 + 0x30) = lStack_2b0;
      *(undefined8 *)(lVar12 + 0x48) = uStack_298;
      *(undefined8 **)(lVar12 + 0x40) = puStack_2a0;
      *(undefined8 **)(lVar12 + 0x28) = puStack_2b8;
      *(long *)(lVar12 + 0x20) = lStack_2c0;
      lVar10 = lVar10 + 1;
    }
    plVar1[2] = lVar10;
    func_0x0058497c(&lStack_1c0,lVar11,uVar9);
    uStack_168 = puStack_1b8 + lStack_1b0 * 5;
    uStack_170 = (undefined4)lStack_1c0;
    uStack_16c = (undefined4)((ulong)lStack_1c0 >> 0x20);
    uStack_178 = puStack_1b8;
    uStack_180 = puStack_1b8;
    if (lStack_1b0 != 0) {
      uStack_178 = puStack_1b8 + 5;
      if (puStack_1b8[1] != -0x8000000000000000) {
        lStack_1c8 = puStack_1b8[3];
        puStack_1d0 = (undefined8 *)puStack_1b8[2];
        lStack_1d8 = puStack_1b8[1];
        func_0x005934d8(&uStack_180);
        uStack_1a8 = 0;
        lStack_1c0 = 0;
        puStack_1b8 = (undefined8 *)0x8;
        lStack_1b0 = 0;
        func_0x00558024(&lStack_1c0);
        puStack_1b8 = puStack_1d0;
        lStack_1c0 = lStack_1d8;
        lStack_1b0 = lStack_1c8;
        piVar8 = (int *)func_0x00187bd0(0x28,8);
        if (piVar8 != (int *)0x0) {
          uStack_178._4_4_ = SUB84(puStack_1b8,0);
          uStack_170 = (undefined4)((ulong)puStack_1b8 >> 0x20);
          uStack_180._4_4_ = (undefined4)lStack_1c0;
          uStack_178._0_4_ = (undefined4)((ulong)lStack_1c0 >> 0x20);
          uStack_168._4_4_ = (undefined4)CONCAT71(uStack_1a7,uStack_1a8);
          iStack_160 = (int)((uint7)uStack_1a7 >> 0x18);
          uStack_16c = (undefined4)lStack_1b0;
          uStack_168._0_4_ = (undefined4)((ulong)lStack_1b0 >> 0x20);
          *(ulong *)(piVar8 + 3) = CONCAT44(uStack_178._4_4_,(undefined4)uStack_178);
          *(ulong *)(piVar8 + 1) = CONCAT44(uStack_180._4_4_,(undefined4)uStack_180);
          *piVar8 = iStack_344;
          *(ulong *)(piVar8 + 7) = CONCAT44(uStack_168._4_4_,(undefined4)uStack_168);
          *(ulong *)(piVar8 + 5) = CONCAT44(uStack_16c,uStack_170);
          piVar8[9] = iStack_160;
          uStack_180._0_4_ = 1;
          uStack_180._4_4_ = 0;
          uStack_178._0_4_ = SUB84(piVar8,0);
          uStack_178._4_4_ = (undefined4)((ulong)piVar8 >> 0x20);
          uStack_170 = 1;
          uStack_16c = 0;
          func_0x00584c34(&lStack_198,lVar11,uVar9,&uStack_180);
          func_0x005581a0(&lStack_198);
          if (lStack_198 != 0) {
            func_0x00187bd4(uStack_190,lStack_198 * 0x28,8);
          }
          if (bVar15) {
            if (lStack_320 == 2) {
              if (bVar3) {
                func_0x005656ec((ulong)&lStack_320 | 8);
              }
            }
            else if (lStack_320 == 3) {
              if (bVar2) {
                func_0x00565938((ulong)&lStack_320 | 8);
              }
            }
            else {
              func_0x005649d4(&lStack_320);
            }
          }
          return 1;
        }
        func_0x007a1f18(8,0x28);
        goto code_r0x0056cb80;
      }
    }
  }
  func_0x007a23bc(&UNK_009eedb8);
code_r0x0056cb80:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x56cb84);
  (*pcVar5)();
}

