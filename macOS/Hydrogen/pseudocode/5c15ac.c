
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005c15ac(void)

{
  uint uVar1;
  undefined8 uVar2;
  long *plVar3;
  code *pcVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined1 uVar7;
  byte bVar8;
  undefined8 *extraout_x8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  bool bVar12;
  long unaff_x23;
  ulong unaff_x25;
  ulong unaff_x26;
  uint unaff_w27;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  long *plStack_220;
  long *plStack_218;
  long *plStack_210;
  undefined1 *puStack_208;
  long *plStack_200;
  long *plStack_1f8;
  long *plStack_1f0;
  undefined1 *puStack_1e8;
  long *plStack_1e0;
  long *plStack_1d8;
  long *plStack_1d0;
  undefined1 *puStack_1c8;
  long *plStack_1c0;
  long *plStack_1b8;
  long *plStack_1b0;
  undefined1 *puStack_1a8;
  long *plStack_1a0;
  long *plStack_198;
  long *plStack_190;
  undefined1 *puStack_188;
  long *plStack_180;
  long *plStack_178;
  long *plStack_170;
  undefined1 *puStack_168;
  long *plStack_160;
  long *plStack_158;
  long *plStack_150;
  undefined1 *puStack_148;
  long *plStack_140;
  long *plStack_138;
  long *plStack_130;
  undefined1 *puStack_128;
  byte bStack_120;
  long *plStack_110;
  long *plStack_108;
  long *plStack_100;
  undefined1 *puStack_f8;
  long *plStack_f0;
  long *plStack_e8;
  long *plStack_e0;
  undefined1 *puStack_d8;
  long *plStack_d0;
  long *plStack_c8;
  long *plStack_c0;
  undefined1 *puStack_b8;
  long *plStack_b0;
  long *plStack_a8;
  long *plStack_a0;
  undefined1 *puStack_98;
  long *plStack_90;
  long *plStack_88;
  long *plStack_80;
  undefined1 *puStack_78;
  long *plStack_70;
  long *plStack_68;
  long *plStack_60;
  undefined1 *puStack_58;
  
  func_0x005c073c();
  if ((unaff_w27 & 1) != 0) {
    if (in_stack_00000040 == 6) {
      if ((((unaff_x26 & 1) == 0) && (-0x7ffffffffffffffc < uStack0000000000000048)) &&
         (uStack0000000000000048 != 0)) {
        func_0x00187bd4(in_stack_00000050,uStack0000000000000048,1);
      }
    }
    else if (in_stack_00000040 == 8) {
      if ((unaff_x25 & 1) != 0) {
        func_0x005c073c(&uStack0000000000000048);
      }
    }
    else {
      func_0x005c0010(unaff_x23 + 0x40);
    }
  }
  func_0x00187bd4();
  func_0x00187bd4();
  __Unwind_Resume();
  func_0x007a2668();
  plVar5 = (long *)func_0x007a2668();
  bVar8 = *(byte *)(plVar5 + 2);
  uVar1 = bVar8 - 0xd;
  if (uVar1 < 2) {
    puVar10 = (undefined8 *)*plVar5;
    plStack_198 = (long *)puVar10[1];
    plStack_1a0 = (long *)*puVar10;
    puStack_188 = (undefined1 *)puVar10[3];
    plStack_190 = (long *)puVar10[2];
    plStack_178 = (long *)puVar10[5];
    plStack_180 = (long *)puVar10[4];
    puStack_168 = (undefined1 *)puVar10[7];
    plStack_170 = (long *)puVar10[6];
    func_0x005af378(&plStack_220,&plStack_1a0);
    puVar11 = (undefined8 *)plVar5[1];
    plStack_198 = (long *)puVar11[1];
    plStack_1a0 = (long *)*puVar11;
    puStack_188 = (undefined1 *)puVar11[3];
    plStack_190 = (long *)puVar11[2];
    plStack_178 = (long *)puVar11[5];
    plStack_180 = (long *)puVar11[4];
    puStack_168 = (undefined1 *)puVar11[7];
    plStack_170 = (long *)puVar11[6];
    func_0x005af378(&plStack_1e0,&plStack_1a0);
  }
  else {
    puVar10 = (undefined8 *)*plVar5;
    plStack_198 = (long *)puVar10[1];
    plStack_1a0 = (long *)*puVar10;
    puStack_188 = (undefined1 *)puVar10[3];
    plStack_190 = (long *)puVar10[2];
    plStack_178 = (long *)puVar10[5];
    plStack_180 = (long *)puVar10[4];
    puStack_168 = (undefined1 *)puVar10[7];
    plStack_170 = (long *)puVar10[6];
    func_0x005af248(&plStack_220,&plStack_1a0);
    puVar11 = (undefined8 *)plVar5[1];
    plStack_198 = (long *)puVar11[1];
    plStack_1a0 = (long *)*puVar11;
    puStack_188 = (undefined1 *)puVar11[3];
    plStack_190 = (long *)puVar11[2];
    plStack_178 = (long *)puVar11[5];
    plStack_180 = (long *)puVar11[4];
    puStack_168 = (undefined1 *)puVar11[7];
    plStack_170 = (long *)puVar11[6];
    func_0x005af248(&plStack_1e0,&plStack_1a0);
  }
  plStack_c8 = plStack_218;
  plStack_d0 = plStack_220;
  puStack_b8 = puStack_208;
  plStack_c0 = plStack_210;
  plStack_a8 = plStack_1f8;
  plStack_b0 = plStack_200;
  puStack_98 = puStack_1e8;
  plStack_a0 = plStack_1f0;
  plStack_88 = plStack_1d8;
  plStack_90 = plStack_1e0;
  puStack_78 = puStack_1c8;
  plStack_80 = plStack_1d0;
  plStack_68 = plStack_1b8;
  plStack_70 = plStack_1c0;
  puStack_58 = puStack_1a8;
  plStack_60 = plStack_1b0;
  plStack_198 = plStack_218;
  plStack_1a0 = plStack_220;
  puStack_188 = puStack_208;
  plStack_190 = plStack_210;
  plVar5 = plStack_190;
  plStack_178 = plStack_1f8;
  plStack_180 = plStack_200;
  puStack_168 = puStack_1e8;
  plStack_170 = plStack_1f0;
  plStack_158 = plStack_1d8;
  plStack_160 = plStack_1e0;
  puStack_148 = puStack_1c8;
  plStack_150 = plStack_1d0;
  plVar3 = plStack_150;
  plStack_138 = plStack_1b8;
  plStack_140 = plStack_1c0;
  puStack_128 = puStack_1a8;
  plStack_130 = plStack_1b0;
  plStack_150._0_1_ = (byte)plStack_1d0;
  plStack_190._0_1_ = (byte)plStack_210;
  plStack_190 = plVar5;
  plStack_150 = plVar3;
  bStack_120 = bVar8;
  if (plStack_220 == (long *)((long)&MACH_HEADER.cputype + 2)) {
    plVar5 = plStack_218;
    if (((plStack_1e0 == (long *)((long)&MACH_HEADER.cputype + 2)) &&
        (plStack_218 == (long *)0x8000000000000001)) &&
       ((plVar5 = (long *)0x8000000000000001, uVar1 < 2 &&
        (plStack_1d8 == (long *)0x8000000000000001)))) {
      if (bVar8 == 0xd) {
        bVar8 = (byte)plStack_190 & (byte)plStack_150;
      }
      else {
        bVar8 = (byte)plStack_190 | (byte)plStack_150;
      }
      *(byte *)(extraout_x8 + 2) = bVar8 & 1;
      uVar2 = _UNK_0089eb10;
      extraout_x8[1] = _UNK_0089eb18;
      *extraout_x8 = uVar2;
      bVar12 = true;
    }
    else {
      if ((1 < uVar1) || (plVar5 != (long *)0x8000000000000001)) goto LAB_005c1920;
      plStack_c8 = plStack_1d8;
      plStack_d0 = plStack_1e0;
      puStack_b8 = puStack_1c8;
      plStack_c0 = plStack_1d0;
      plStack_a8 = plStack_1b8;
      plStack_b0 = plStack_1c0;
      puStack_98 = puStack_1a8;
      plStack_a0 = plStack_1b0;
      if (bVar8 == 0xd) {
        if (((ulong)plStack_210 & 1) == 0) {
          uVar7 = 0;
          goto LAB_005c1ae4;
        }
        func_0x005af248(extraout_x8,&plStack_90);
      }
      else if (((ulong)plStack_210 & 1) == 0) {
        func_0x005af248(extraout_x8,&plStack_90);
      }
      else {
        uVar7 = 1;
LAB_005c1ae4:
        *(undefined1 *)(extraout_x8 + 2) = uVar7;
        uVar2 = _UNK_0089eb10;
        extraout_x8[1] = _UNK_0089eb18;
        *extraout_x8 = uVar2;
        func_0x005c0010(&plStack_d0);
      }
      bVar12 = false;
      if (plStack_1a0 != (long *)0x6) goto LAB_005c1b5c;
    }
LAB_005c1b6c:
    if (!bVar12) goto LAB_005c1b8c;
  }
  else {
    if (((((dword *)plStack_220 == &MACH_HEADER.cpusubtype) && (uVar1 < 2)) &&
        ((dword *)plStack_1e0 == &MACH_HEADER.cpusubtype)) &&
       (((byte)plStack_190 == 0 && ((byte)plStack_150 == 0)))) {
      uVar7 = 0xd;
      if (bVar8 == 0xd) {
        uVar7 = 0xe;
      }
      plStack_88 = plStack_218;
      plStack_80 = plStack_1d8;
      puStack_78 = (undefined1 *)CONCAT71((int7)((ulong)puStack_1c8 >> 8),uVar7);
      plStack_90 = (long *)((long)&MACH_HEADER.cpusubtype + 1);
      puVar6 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar6 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto LAB_005c1c34;
      }
      puVar6[1] = plStack_88;
      *puVar6 = plStack_90;
      puVar6[3] = puStack_78;
      puVar6[2] = plStack_80;
      puVar6[5] = plStack_68;
      puVar6[4] = plStack_70;
      puVar6[7] = puStack_58;
      puVar6[6] = plStack_60;
      *(undefined1 *)(extraout_x8 + 2) = 0;
      *extraout_x8 = 8;
      extraout_x8[1] = puVar6;
joined_r0x005c1894:
      bVar12 = true;
      if (plStack_1a0 == (long *)0x6) goto LAB_005c1b6c;
LAB_005c1b5c:
      if (plStack_1a0 != (long *)0x8) {
        func_0x005c0010(&plStack_1a0);
      }
      goto LAB_005c1b6c;
    }
LAB_005c1920:
    if (plStack_1e0 != (long *)((long)&MACH_HEADER.cputype + 2)) {
LAB_005c1a00:
      plStack_108 = plStack_218;
      plStack_110 = plStack_220;
      puStack_f8 = puStack_208;
      plStack_100 = plStack_210;
      plStack_e8 = plStack_1f8;
      plStack_f0 = plStack_200;
      puStack_d8 = puStack_1e8;
      plStack_e0 = plStack_1f0;
      plStack_c8 = plStack_1d8;
      plStack_d0 = plStack_1e0;
      puStack_b8 = puStack_1c8;
      plStack_c0 = plStack_1d0;
      plStack_a8 = plStack_1b8;
      plStack_b0 = plStack_1c0;
      puStack_98 = puStack_1a8;
      plStack_a0 = plStack_1b0;
      plVar5 = (long *)func_0x00187bd0(0x40,8);
      if (plVar5 == (long *)0x0) {
        func_0x007a1f18(8,0x40);
LAB_005c1c34:
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x5c1c38);
        (*pcVar4)();
      }
      plVar5[1] = (long)plStack_198;
      *plVar5 = (long)plStack_1a0;
      plVar5[3] = (long)puStack_188;
      plVar5[2] = (long)plStack_190;
      plVar5[5] = (long)plStack_178;
      plVar5[4] = (long)plStack_180;
      plVar5[7] = (long)puStack_168;
      plVar5[6] = (long)plStack_170;
      plStack_88 = plStack_158;
      plStack_90 = plStack_160;
      puStack_78 = puStack_148;
      plStack_80 = plStack_150;
      plStack_68 = plStack_138;
      plStack_70 = plStack_140;
      puStack_58 = puStack_128;
      plStack_60 = plStack_130;
      plStack_1e0 = plVar5;
      puVar6 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar6 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto LAB_005c1c34;
      }
      puVar6[1] = plStack_158;
      *puVar6 = plStack_160;
      puVar6[3] = puStack_148;
      puVar6[2] = plStack_150;
      puVar6[5] = plStack_138;
      puVar6[4] = plStack_140;
      puVar6[7] = puStack_128;
      puVar6[6] = plStack_130;
      extraout_x8[1] = plVar5;
      extraout_x8[2] = puVar6;
      *(byte *)(extraout_x8 + 3) = bVar8;
      *extraout_x8 = 9;
      goto LAB_005c1b8c;
    }
    uVar9 = (ulong)plStack_1d8 ^ 0x8000000000000000;
    if (4 < uVar9) {
      uVar9 = 3;
    }
    if (uVar9 != 1) {
      if (((uVar9 == 3) && (bVar8 == 6)) &&
         ((plStack_220 == (long *)((long)&MACH_HEADER.cputype + 2) &&
          (-0x7ffffffffffffffc < (long)plStack_218)))) {
        puStack_78 = (undefined1 *)((long)plStack_210 + (long)puStack_208);
        puStack_58 = (undefined1 *)((long)plStack_1d0 + (long)puStack_1c8);
        plStack_90 = plStack_210;
        plStack_88 = plStack_210;
        plStack_80 = plStack_218;
        plStack_70 = plStack_1d0;
        plStack_68 = plStack_1d0;
        plStack_60 = plStack_1d8;
        func_0x005a4aa4(&plStack_d0,&plStack_90,&UNK_009f2320);
        extraout_x8[2] = plStack_c8;
        extraout_x8[1] = plStack_d0;
        extraout_x8[3] = plStack_c0;
        *extraout_x8 = 6;
        goto joined_r0x005c1894;
      }
      goto LAB_005c1a00;
    }
    if (1 < uVar1) goto LAB_005c1a00;
    if (bVar8 == 0xd) {
      if (((ulong)plStack_1d0 & 1) == 0) {
        uVar7 = 0;
        goto LAB_005c1bec;
      }
      plStack_88 = plStack_218;
      plStack_90 = plStack_220;
      puStack_78 = puStack_208;
      plStack_80 = plStack_210;
      plStack_68 = plStack_1f8;
      plStack_70 = plStack_200;
      puStack_58 = puStack_1e8;
      plStack_60 = plStack_1f0;
      func_0x005af248(extraout_x8,&plStack_90);
    }
    else if (((ulong)plStack_1d0 & 1) == 0) {
      plStack_88 = plStack_218;
      plStack_90 = plStack_220;
      puStack_78 = puStack_208;
      plStack_80 = plStack_210;
      plStack_68 = plStack_1f8;
      plStack_70 = plStack_200;
      puStack_58 = puStack_1e8;
      plStack_60 = plStack_1f0;
      func_0x005af248(extraout_x8,&plStack_90);
    }
    else {
      uVar7 = 1;
LAB_005c1bec:
      *(undefined1 *)(extraout_x8 + 2) = uVar7;
      uVar2 = _UNK_0089eb10;
      extraout_x8[1] = _UNK_0089eb18;
      *extraout_x8 = uVar2;
      func_0x005c0010(&plStack_d0);
    }
  }
  if ((plStack_160 != (long *)((long)&MACH_HEADER.cputype + 2)) &&
     ((dword *)plStack_160 != &MACH_HEADER.cpusubtype)) {
    func_0x005c0010(&plStack_160);
  }
LAB_005c1b8c:
  func_0x00187bd4(puVar10,0x40,8);
  func_0x00187bd4(puVar11,0x40,8);
  return;
}

