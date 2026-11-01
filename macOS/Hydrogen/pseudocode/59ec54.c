
void FUN_0059ec54(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  bool in_ZR;
  long lVar3;
  long lVar4;
  dword *pdVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  long *plVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  dword *pdVar12;
  undefined8 uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000020;
  ulong uStack_188;
  dword *pdStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  ulong uStack_140;
  dword *pdStack_138;
  ulong uStack_130;
  undefined8 uStack_128;
  ulong uStack_120;
  undefined8 uStack_118;
  undefined1 **ppuStack_110;
  undefined8 uStack_108;
  ulong uStack_f8;
  ulong uStack_f0;
  undefined8 uStack_e8;
  ulong uStack_e0;
  dword *pdStack_d8;
  undefined1 *puStack_b0;
  undefined8 uStack_a8;
  ulong uStack_98;
  dword *pdStack_90;
  dword *pdStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined1 auStack_6 [6];
  
  if (!in_ZR) {
    func_0x0059ce88(&uStack0000000000000020);
  }
  func_0x0059cb44(&uStack0000000000000008);
  __Unwind_Resume();
  func_0x007a2668();
  lVar4 = func_0x007a2668();
  uVar14 = *(ulong *)(lVar4 + 0x10);
  uVar9 = uVar14 * 0x40;
  if (uVar14 >> 0x3a == 0 && uVar9 < 0x7ffffffffffffff9) {
    if (uVar9 == 0) {
      uStack_98 = 0;
      pdStack_90 = &MACH_HEADER.cpusubtype;
code_r0x0059ed30:
      extraout_x8[1] = (ulong)pdStack_90;
      *extraout_x8 = uStack_98;
      extraout_x8[2] = uVar14;
      return;
    }
    lVar4 = *(long *)(lVar4 + 8);
    pdVar12 = &MACH_HEADER.cpusubtype;
    pdVar5 = (dword *)func_0x00187bd0(uVar9,8);
    if (pdVar5 != (dword *)0x0) {
      uStack_98 = uVar14;
      pdStack_90 = pdVar5;
      if (uVar14 != 0) {
        uVar11 = 0;
        do {
          if (uVar9 == 0) break;
          func_0x005a5b10(&uStack_80,lVar4);
          uVar11 = uVar11 + 1;
          lVar4 = lVar4 + 0x40;
          *(undefined8 *)(pdVar5 + 2) = uStack_78;
          *(undefined8 *)pdVar5 = uStack_80;
          *(undefined8 *)(pdVar5 + 6) = uStack_68;
          *(undefined8 *)(pdVar5 + 4) = uStack_70;
          *(undefined8 *)(pdVar5 + 10) = uStack_58;
          *(undefined8 *)(pdVar5 + 8) = uStack_60;
          *(undefined8 *)(pdVar5 + 0xe) = uStack_48;
          *(undefined8 *)(pdVar5 + 0xc) = uStack_50;
          uVar9 = uVar9 - 0x40;
          pdVar5 = pdVar5 + 0x10;
        } while (uVar14 != uVar11);
      }
      goto code_r0x0059ed30;
    }
  }
  else {
    pdVar12 = (dword *)0x0;
  }
  uVar6 = func_0x007a1f00(pdVar12,uVar9,&UNK_009f1b50);
  pdStack_88 = pdVar12;
  func_0x0059e200(&uStack_98);
  __Unwind_Resume(uVar6);
  lVar4 = func_0x007a2668();
  uStack_a8 = 0x59ed88;
  uStack_130 = *(ulong *)(lVar4 + 0x10);
  uVar9 = uStack_130 * 0x10;
  uStack_e0 = uVar14;
  pdStack_d8 = pdVar12;
  puStack_b0 = auStack_6 + -10;
  if (uStack_130 >> 0x3c == 0 && uVar9 < 0x7ffffffffffffff9) {
    if (uVar9 == 0) {
      uStack_f8 = 0;
      uStack_f0 = 8;
LAB_0059ee34:
      extraout_x8_00[1] = uStack_f0;
      *extraout_x8_00 = uStack_f8;
      extraout_x8_00[2] = uStack_130;
      return;
    }
    pdVar12 = *(dword **)(lVar4 + 8);
    uVar6 = 8;
    uStack_f0 = func_0x00187bd0(uVar9,8);
    if (uStack_f0 != 0) {
      uStack_f8 = uStack_130;
      if (uStack_130 != 0) {
        uVar14 = 0;
        puVar10 = (undefined8 *)(uStack_f0 + 8);
        do {
          if (uVar9 == 0) break;
          uVar6 = *(undefined8 *)pdVar12;
          plVar8 = *(long **)(pdVar12 + 2);
          lVar4 = *plVar8;
          *plVar8 = lVar4 + 1;
          if (lVar4 < 0) {
            func_0x007a05dc();
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x59ee60);
            (*pcVar2)();
          }
          uVar14 = uVar14 + 1;
          pdVar12 = pdVar12 + 4;
          puVar10[-1] = uVar6;
          *puVar10 = plVar8;
          uVar9 = uVar9 - 0x10;
          puVar10 = puVar10 + 2;
        } while (uStack_130 != uVar14);
      }
      goto LAB_0059ee34;
    }
  }
  else {
    uVar6 = 0;
  }
  uVar7 = func_0x007a1f00(uVar6,uVar9,&UNK_009f1b50);
  uStack_e8 = uVar6;
  func_0x0059e480(&uStack_f8);
  __Unwind_Resume(uVar7);
  lVar4 = func_0x007a2668();
  uStack_108 = 0x59ee94;
  uVar13 = 0;
  uVar15 = *(ulong *)(lVar4 + 0x10);
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar15;
  uVar11 = uVar15 * 0x30;
  uStack_140 = uVar14;
  pdStack_138 = pdVar12;
  uStack_128 = uVar6;
  uStack_120 = uVar9;
  uStack_118 = uVar7;
  ppuStack_110 = &puStack_b0;
  if ((SUB168(auVar1 * ZEXT816(0x30),8) == 0) && (uVar11 < 0x7ffffffffffffff9)) {
    if (uVar11 == 0) {
      uStack_188 = 0;
      pdStack_180 = &MACH_HEADER.cpusubtype;
code_r0x0059ef58:
      extraout_x8_01[1] = (ulong)pdStack_180;
      *extraout_x8_01 = uStack_188;
      extraout_x8_01[2] = uVar15;
      return;
    }
    lVar4 = *(long *)(lVar4 + 8);
    uVar13 = 8;
    pdVar12 = (dword *)func_0x00187bd0(uVar11,8);
    if (pdVar12 != (dword *)0x0) {
      uStack_188 = uVar15;
      pdStack_180 = pdVar12;
      if (uVar15 != 0) {
        uVar9 = 0;
        do {
          if (uVar11 == 0) break;
          func_0x005a51dc(&uStack_170,lVar4);
          uVar9 = uVar9 + 1;
          lVar4 = lVar4 + 0x30;
          *(undefined8 *)(pdVar12 + 2) = uStack_168;
          *(undefined8 *)pdVar12 = uStack_170;
          *(undefined8 *)(pdVar12 + 6) = uStack_158;
          *(undefined8 *)(pdVar12 + 4) = uStack_160;
          *(undefined8 *)(pdVar12 + 10) = uStack_148;
          *(undefined8 *)(pdVar12 + 8) = uStack_150;
          uVar11 = uVar11 - 0x30;
          pdVar12 = pdVar12 + 0xc;
        } while (uVar15 != uVar9);
      }
      goto code_r0x0059ef58;
    }
  }
  uVar6 = func_0x007a1f00(uVar13,uVar11,&UNK_009f1b50);
  uStack_178 = uVar13;
  func_0x0059e598(&uStack_188);
  __Unwind_Resume(uVar6);
  lVar4 = func_0x007a2668();
  uVar14 = *(ulong *)(lVar4 + 0x10);
  uVar9 = uVar14 * 4;
  if (uVar14 >> 0x3e == 0 && uVar9 < 0x7ffffffffffffffd) {
    uVar7 = *(undefined8 *)(lVar4 + 8);
    if (uVar9 == 0) {
      uVar11 = 0;
      uVar15 = 4;
    }
    else {
      uVar6 = 4;
      uVar15 = func_0x00187bd0(uVar9,4);
      if (uVar15 == 0) goto code_r0x0059f04c;
      uVar11 = uVar14;
    }
    _memcpy(uVar15,uVar7,uVar9);
    *extraout_x8_02 = uVar11;
    extraout_x8_02[1] = uVar15;
    extraout_x8_02[2] = uVar14;
    return;
  }
  uVar6 = 0;
code_r0x0059f04c:
  lVar4 = func_0x007a1f00(uVar6,uVar9,&UNK_009f1b38);
  if (*(long *)(lVar4 + 0x10) != 0) {
    puVar10 = *(undefined8 **)(lVar4 + 8);
    lVar4 = 1 - *(long *)(lVar4 + 0x10);
    do {
      plVar8 = (long *)*puVar10;
      if (plVar8 != (long *)0x0) {
        lVar3 = *plVar8;
        *plVar8 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          func_0x005d2c74(puVar10);
        }
      }
      puVar10 = puVar10 + 3;
      lVar4 = lVar4 + 1;
    } while (lVar4 != 1);
  }
  return;
}

