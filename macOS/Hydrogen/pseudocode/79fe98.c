
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0079fe98(long *param_1,undefined8 param_2,undefined8 param_3)

{
  byte bVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  long *plVar9;
  byte *pbVar10;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  ulong uVar11;
  undefined *puVar12;
  undefined *puVar13;
  undefined **ppuVar14;
  undefined *puVar15;
  undefined8 extraout_x8;
  undefined8 extraout_x8_00;
  code *extraout_x9;
  ulong uVar16;
  long extraout_x12;
  long *unaff_x19;
  undefined1 auVar17 [16];
  undefined8 uStack_1b0;
  undefined *puStack_1a8;
  undefined8 uStack_1a0;
  dword *pdStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  dword adStack_178 [2];
  undefined *puStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 ****ppppuStack_110;
  undefined *puStack_108;
  undefined8 uStack_100;
  undefined *puStack_f8;
  undefined8 uStack_f0;
  undefined1 *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined1 auStack_c8 [8];
  long ***ppplStack_c0;
  undefined *puStack_b8;
  int aiStack_b0 [2];
  long lStack_a8;
  ulong uStack_a0;
  ulong uStack_98;
  undefined **ppuStack_90;
  long lStack_88;
  long ***ppplStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  long **pplStack_50;
  undefined *puStack_48;
  undefined8 uStack_40;
  undefined *puStack_38;
  long *plStack_30;
  undefined *puStack_28;
  undefined8 uStack_20;
  long lStack_18;
  
  lVar4 = *param_1;
  *param_1 = lVar4 + 1;
  if (lVar4 < 0) {
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x79fea8);
    (*pcVar3)();
  }
  if (*unaff_x19 == 0) {
    *unaff_x19 = (long)param_1;
    return unaff_x19;
  }
  func_0x003f5484();
  func_0x007a2420();
  puVar12 = &UNK_009d9438;
  uStack_20 = extraout_x1;
  lStack_18 = param_3;
  auVar17 = func_0x0043e520();
  uStack_40 = auVar17._8_8_;
  puStack_28 = &__ZN4core9panicking13assert_failed17h941d22ca71745078E;
  puVar13 = &UNK_009d9458;
  puVar15 = &UNK_009d9478;
  ppuVar14 = &puStack_38;
  puStack_38 = puVar12;
  plStack_30 = (long *)((long)register0x00000008 + -0x10);
  func_0x007a272c(auVar17._0_8_,&uStack_40);
  puStack_48 = &__ZN4core9panicking13assert_failed17hdefcbb4b9730ffe9E;
  puVar12 = &UNK_009d9498;
  uStack_60 = extraout_x1_00;
  puStack_58 = puVar13;
  pplStack_50 = &plStack_30;
  auVar17 = func_0x0043e520();
  uVar11 = auVar17._8_8_;
  plVar9 = auVar17._0_8_;
  puStack_68 = &DAT_007a0000;
  ppplStack_70 = &pplStack_50;
  if (CARRY8(uVar11,(ulong)puVar12)) {
code_r0x007a00d4:
    func_0x007a1f00(0,uVar11,&UNK_009d97e8);
code_r0x007a00e0:
    lVar6 = lStack_a8;
    uVar11 = uStack_a0;
  }
  else {
    lVar4 = *plVar9;
    puVar13 = puVar12 + uVar11;
    if (puVar12 + uVar11 <= (undefined *)(lVar4 * 2)) {
      puVar13 = (undefined *)(lVar4 * 2);
    }
    puVar12 = (undefined *)0x8;
    if (puVar15 != (undefined *)0x1) {
      puVar12 = (undefined *)0x4;
    }
    if (puVar13 <= puVar12) {
      puVar13 = puVar12;
    }
    uVar16 = (ulong)((long)ppuVar14 + (long)(puVar15 + -1)) & -(long)ppuVar14;
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar16;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = puVar13;
    if (SUB168(auVar17 * auVar2,8) != 0) goto code_r0x007a00d4;
    uVar16 = uVar16 * (long)puVar13;
    lVar6 = 0;
    if (uVar16 <= 0x8000000000000000U - (long)ppuVar14) {
      ppuStack_90 = (undefined **)0x0;
      if (lVar4 != 0) {
        uStack_98 = plVar9[1];
        lStack_88 = lVar4 * (long)puVar15;
        ppuStack_90 = ppuVar14;
      }
      plVar5 = (long *)func_0x0079a108(aiStack_b0,ppuVar14,uVar16,&uStack_98);
      if (aiStack_b0[0] != 1) {
        *plVar9 = (long)puVar13;
        plVar9[1] = lStack_a8;
        return plVar5;
      }
      goto code_r0x007a00e0;
    }
  }
  func_0x007a1f00(lVar6,uVar11,&UNK_009d97e8);
  puStack_b8 = &DAT_007a00f0;
  puStack_f8 = &UNK_009d9ee8;
  uStack_f0 = 1;
  puStack_e8 = auStack_c8;
  uStack_e0 = 0;
  uStack_d8 = 0;
  ppplStack_c0 = (long ***)&ppplStack_70;
  uStack_100 = func_0x0041f554(auStack_c8,&puStack_f8);
  func_0x003f77f4(&uStack_100);
  uVar7 = func_0x007a144c();
  puStack_108 = &DAT_007a0134;
  ppppuStack_110 = &ppplStack_c0;
  func_0x00411a78(uVar7,0);
  puStack_140 = &UNK_009d9f20;
  uStack_138 = 1;
  uStack_128 = 0;
  uStack_120 = 0;
  uStack_130 = 8;
  lVar4 = func_0x007a2420(&puStack_140,&UNK_009d9f30);
  pcVar3 = ___ZN3std6thread7current7CURRENT17h01073c2742dba4edE;
  if (lVar4 == 0) {
    puVar8 = (undefined8 *)
             (*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)
                       (&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
    *puVar8 = 1;
    plVar9 = (long *)(*___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E)
                               (&__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E);
    lVar4 = *plVar9;
    if (lVar4 == 0) {
      if (lRam0000000000a3bfe0 == -1) goto code_r0x007a02bc;
      lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
      plVar9 = (long *)(*extraout_x9)(extraout_x8);
      *plVar9 = extraout_x12;
      lVar4 = extraout_x12;
    }
    puStack_1a8 = (undefined *)0x8000000000000000;
    plVar9 = (long *)func_0x00412b1c(lVar4,&puStack_1a8);
    pbVar10 = (byte *)(*pcRam0000000000a2bca0)();
    bVar1 = *pbVar10;
    *pbVar10 = 1;
    if ((bVar1 & 1) == 0) {
      __tlv_atexit(&DAT_0043837c,0);
    }
    lVar4 = *plVar9;
    *plVar9 = lVar4 + 1;
    if (-1 < lVar4) {
      puVar8 = (undefined8 *)
               (*pcVar3)(plVar9 + 2,&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
      *puVar8 = extraout_x8_00;
      return plVar9;
    }
  }
  else {
    if (lVar4 == 1) {
      puStack_1a8 = &UNK_009d9fb0;
      uStack_1a0 = 1;
      pdStack_198 = adStack_178;
      uStack_190 = 0;
      uStack_188 = 0;
      uStack_1b0 = func_0x0041f554(adStack_178,&puStack_1a8);
      func_0x003f77f4(&uStack_1b0);
      func_0x007a144c();
code_r0x007a02bc:
      func_0x007a0378();
    }
    puStack_1a8 = &UNK_009d9f88;
    uStack_1a0 = 1;
    uStack_190 = 0;
    uStack_188 = 0;
    pdStack_198 = &MACH_HEADER.cpusubtype;
    func_0x007a2420(&puStack_1a8,&UNK_009d9f98);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x7a02f0);
  (*pcVar3)();
}

