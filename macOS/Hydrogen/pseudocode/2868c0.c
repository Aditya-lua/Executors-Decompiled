
/* WARNING: Possible PIC construction at 0x00286dd0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00286b2c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00286dd4) */
/* WARNING: Removing unreachable block (ram,0x00286b30) */

undefined8
FUN_002868c0(undefined8 param_1,undefined8 param_2,section *param_3,char *param_4,section *param_5,
            section *param_6,section *param_7,section *param_8)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  byte bVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  long *plVar7;
  int iVar8;
  undefined8 uVar9;
  dword *pdVar10;
  undefined4 *puVar11;
  section *psVar12;
  section *psVar13;
  char *pcVar14;
  section *psVar15;
  section *psVar16;
  section *psVar17;
  undefined4 *puVar18;
  section *unaff_x19;
  section *psVar19;
  section *unaff_x20;
  section *psVar20;
  section *unaff_x21;
  section *psVar21;
  section *unaff_x22;
  long unaff_x23;
  long lVar22;
  section *unaff_x24;
  section *psVar23;
  section *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *unaff_x29;
  long *plVar24;
  undefined *puVar25;
  long lVar26;
  long lVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  
  _memcpy();
  *(section **)unaff_x19->sectname = unaff_x22;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == unaff_x29[-0xc]) {
    return 1;
  }
  puVar25 = (undefined *)0x2868e8;
  auVar28 = ___stack_chk_fail(1);
LAB_002868e8:
  pdVar10 = auVar28._8_8_;
  *(long *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(section **)((long)register0x00000008 + -0x48) = unaff_x25;
  *(section **)((long)register0x00000008 + -0x40) = unaff_x24;
  *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(section **)((long)register0x00000008 + -0x30) = unaff_x22;
  *(section **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(section **)((long)register0x00000008 + -0x20) = unaff_x20;
  *(section **)((long)register0x00000008 + -0x18) = unaff_x19;
  *(long **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar25;
  plVar24 = (long *)((long)register0x00000008 + -0x10);
  lVar22 = *(long *)register0x00000008;
  auVar30._8_8_ = lVar22;
  auVar30._0_8_ = param_6;
  *(long *)((long)register0x00000008 + -0x58) = *(long *)PTR____stack_chk_guard_009b01e8;
  *(long *)((long)register0x00000008 + -0x78) = 0;
  *(long *)((long)register0x00000008 + -0x80) = 0;
  *(long *)((long)register0x00000008 + -0x68) = 0;
  *(long *)((long)register0x00000008 + -0x70) = 0;
  unaff_x21 = (section *)0x0;
  unaff_x20 = param_7;
  unaff_x19 = param_8;
  func_0x002857d8((long *)((long)register0x00000008 + -0x80),
                  (long *)((long)register0x00000008 + -0x80),0x20);
  func_0x00370258((long *)((long)register0x00000008 + -0x280),
                  (long *)((long)register0x00000008 + -0x80));
  func_0x003702f0((long *)((long)register0x00000008 + -0x280),param_4,param_5);
  unaff_x22 = param_3;
  if (((ulong)param_5 & 0xf) != 0) {
    func_0x003702f0((long *)((long)register0x00000008 + -0x280),&UNK_0082e9b3,
                    0x10 - ((ulong)param_5 & 0xf));
    unaff_x22 = param_3;
  }
  func_0x003702f0((long *)((long)register0x00000008 + -0x280),param_6,param_7);
  func_0x003702f0((long *)((long)register0x00000008 + -0x280),param_8,lVar22);
  psVar21 = (section *)((long)param_7->sectname + lVar22);
  if (((ulong)psVar21 & 0xf) != 0) {
    func_0x003702f0((long *)((long)register0x00000008 + -0x280),&UNK_0082e9b3,
                    0x10 - ((ulong)psVar21 & 0xf));
  }
  *(section **)((long)register0x00000008 + -0x60) = param_5;
  func_0x003702f0((long *)((long)register0x00000008 + -0x280),
                  (long *)((long)register0x00000008 + -0x60),8);
  *(section **)((long)register0x00000008 + -0x60) = psVar21;
  param_3 = (section *)&MACH_HEADER.cpusubtype;
  func_0x003702f0((long *)((long)register0x00000008 + -0x280),
                  (long *)((long)register0x00000008 + -0x60));
  uVar9 = func_0x0037062c((long *)((long)register0x00000008 + -0x280),auVar28._0_8_);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x58)) {
    return uVar9;
  }
  puVar25 = &SUB_00286a40;
  auVar29 = ___stack_chk_fail();
  plVar7 = (long *)((long)register0x00000008 + -0x280);
  psVar19 = auVar28._0_8_;
  psVar20 = param_5;
  psVar13 = (section *)param_4;
  do {
    unaff_x23 = auVar29._8_8_;
    auVar6._8_8_ = unaff_x23;
    auVar6._0_8_ = param_3;
    unaff_x25 = auVar29._0_8_;
    register0x00000008 = (BADSPACEBASE *)(plVar7 + -0x14);
    plVar7[-10] = unaff_x26;
    plVar7[-9] = (long)psVar13;
    *(undefined1 (*) [16])(plVar7 + -8) = auVar30;
    plVar7[-6] = (long)param_8;
    plVar7[-5] = (long)psVar21;
    plVar7[-4] = (long)psVar20;
    plVar7[-3] = (long)psVar19;
    plVar7[-2] = (long)plVar24;
    plVar7[-1] = (long)puVar25;
    unaff_x29 = plVar7 + -2;
    plVar7[-0xb] = *(long *)PTR____stack_chk_guard_009b01e8;
    psVar15 = unaff_x21;
    psVar16 = unaff_x20;
    psVar17 = unaff_x19;
    if (pdVar10 == &MACH_HEADER.filetype) {
      psVar19 = unaff_x19;
      if (unaff_x19 != (section *)plVar7[2]) {
        psVar12 = (section *)((long)&segment_command_00000020.flags + 1);
        param_5 = (section *)(section_00000108.sectname + 5);
        goto code_r0x00286b78;
      }
      psVar21 = unaff_x21;
      if ((section *)0x3fffffffbf < unaff_x21) {
        psVar12 = (section *)(section_00000068.sectname + 0xd);
        param_5 = (section *)(section_00000108.segname + 1);
        goto code_r0x00286b78;
      }
      param_4 = (char *)*plVar7;
      param_5 = (section *)plVar7[1];
      if ((bRam0000000000a334f8 & 1) == 0) break;
      lVar22 = *(long *)unaff_x25->sectname;
      lVar27 = *(long *)((long)unaff_x25->segname + 8);
      lVar26 = *(long *)unaff_x25->segname;
      plVar7[-0x11] = *(long *)((long)unaff_x25->sectname + 8);
      plVar7[-0x12] = lVar22;
      plVar7[-0xf] = lVar27;
      plVar7[-0x10] = lVar26;
      *(undefined4 *)(plVar7 + -0xe) = 0;
      *(long *)((long)plVar7 + -0x6c) = *(long *)param_3->sectname;
      *(dword *)((long)plVar7 + -100) = *(dword *)((long)param_3->sectname + 8);
      psVar15 = (section *)(plVar7 + -0x12);
      func_0x003770c0(unaff_x23,unaff_x22,unaff_x21);
      psVar12 = unaff_x19;
      iVar8 = func_0x0036e62c(plVar7 + -0x12,unaff_x20);
      psVar20 = unaff_x20;
      param_8 = unaff_x22;
      if (iVar8 != 0) {
        psVar12 = (section *)((long)&segment_command_00000020.flags + 1);
        param_5 = (section *)((long)&section_00000108.addr + 1);
        psVar13 = unaff_x25;
        auVar30 = auVar6;
        goto code_r0x00286b78;
      }
      uVar9 = 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == plVar7[-0xb]) {
        return 1;
      }
    }
    else {
      psVar12 = (section *)(section_00000068.segname + 1);
      param_5 = &section_00000108;
code_r0x00286b78:
      param_4 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
      func_0x0028f83c(0x1e,0);
      uVar9 = 0;
      unaff_x25 = psVar13;
      auVar6 = auVar30;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == plVar7[-0xb]) {
        return 0;
      }
    }
    psVar23 = auVar6._0_8_;
    auVar5._8_8_ = auVar6._8_8_;
    auVar5._0_8_ = unaff_x25;
    auVar28 = ___stack_chk_fail(uVar9);
    plVar7[-0x20] = unaff_x28;
    plVar7[-0x1f] = unaff_x27;
    plVar7[-0x1e] = unaff_x26;
    plVar7[-0x1d] = (long)unaff_x25;
    *(undefined1 (*) [16])(plVar7 + -0x1c) = auVar6;
    plVar7[-0x1a] = (long)param_8;
    plVar7[-0x19] = (long)psVar21;
    plVar7[-0x18] = (long)psVar20;
    plVar7[-0x17] = (long)psVar19;
    plVar7[-0x16] = (long)unaff_x29;
    plVar7[-0x15] = (long)&DAT_00286c18;
    plVar7[-0x22] = *(long *)PTR____stack_chk_guard_009b01e8;
    if (psVar16 == (section *)&MACH_HEADER.flags) {
      unaff_x26 = plVar7[-0x10];
      plVar7[-0x29] = plVar7[-0x11];
      plVar7[-0x2a] = plVar7[-0x12];
      unaff_x28 = plVar7[-0x14];
      unaff_x27 = plVar7[-0x13];
      func_0x002855f4(plVar7 + -0x26,auVar28._0_8_ + 8,psVar15);
      *(undefined4 *)((long)plVar7 + -0x13c) = 0;
      plVar7[-0x27] = *(long *)psVar15->segname;
      bVar4 = *(byte *)(auVar28._0_8_ + 0x241);
      plVar7[-0x2c] = unaff_x26;
      plVar7[-0x2b] = (ulong)bVar4;
      unaff_x21 = (section *)((long)plVar7 + -0x13c);
      plVar7[-0x2e] = plVar7[-0x2a];
      plVar7[-0x2d] = plVar7[-0x29];
      plVar7[-0x30] = unaff_x28;
      plVar7[-0x2f] = unaff_x27;
      unaff_x20 = (section *)&MACH_HEADER.filetype;
      psVar13 = psVar12;
      pcVar14 = param_4;
      unaff_x22 = param_5;
      unaff_x19 = psVar17;
      uVar9 = func_0x0028656c(plVar7 + -0x26,auVar28._8_8_);
      psVar19 = psVar17;
      psVar20 = param_5;
      psVar21 = (section *)param_4;
      param_8 = psVar12;
      psVar23 = psVar15;
      auVar5 = auVar28;
    }
    else {
      pcVar14 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
      psVar13 = (section *)(section_00000068.segname + 1);
      unaff_x22 = (section *)((long)&section_000000b8.reloff + 1);
      func_0x0028f83c(0x1e,0);
      uVar9 = 0;
      unaff_x21 = psVar15;
      unaff_x20 = psVar16;
      unaff_x19 = psVar17;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == plVar7[-0x22]) {
      return uVar9;
    }
    auVar30 = ___stack_chk_fail(uVar9);
    plVar7[-0x3c] = unaff_x28;
    plVar7[-0x3b] = unaff_x27;
    plVar7[-0x3a] = unaff_x26;
    plVar7[-0x39] = auVar5._0_8_;
    plVar7[-0x38] = (long)psVar23;
    plVar7[-0x37] = auVar5._8_8_;
    plVar7[-0x36] = (long)param_8;
    plVar7[-0x35] = (long)psVar21;
    plVar7[-0x34] = (long)psVar20;
    plVar7[-0x33] = (long)psVar19;
    plVar7[-0x32] = (long)(plVar7 + -0x16);
    plVar7[-0x31] = 0x286d34;
    plVar24 = plVar7 + -0x32;
    plVar7[-0x3d] = *(long *)PTR____stack_chk_guard_009b01e8;
    if ((dword *)pcVar14 != &MACH_HEADER.flags) {
      pcVar14 = section_00000068.segname + 1;
      func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x144);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == plVar7[-0x3d]) {
        return 0;
      }
      auVar28 = ___stack_chk_fail(0);
      puVar11 = auVar28._8_8_;
      puVar18 = *(undefined4 **)(auVar28._0_8_ + 0x10);
      *(undefined8 *)(puVar18 + 0x26) = 0;
      *(undefined8 *)(puVar18 + 0x28) = 0;
      *(undefined8 *)(puVar18 + 0x2a) = 0;
      if (puVar11 != (undefined4 *)0x0 || pcVar14 != (char *)0x0) {
        if (pcVar14 != (char *)0x0) {
          uVar1 = *(undefined4 *)pcVar14;
          uVar2 = *(undefined4 *)(pcVar14 + 4);
          uVar3 = *(undefined4 *)(pcVar14 + 8);
          if (puVar11 != (undefined4 *)0x0) {
            *puVar18 = *puVar11;
            puVar18[1] = puVar11[1];
            puVar18[2] = puVar11[2];
            puVar18[3] = puVar11[3];
            puVar18[4] = puVar11[4];
            puVar18[5] = puVar11[5];
            puVar18[6] = puVar11[6];
            puVar18[7] = puVar11[7];
          }
          puVar18[8] = 0;
          puVar18[9] = uVar1;
          puVar18[10] = uVar2;
          puVar18[0xb] = uVar3;
          puVar18[0x1c] = 0;
          puVar18[0x1d] = uVar1;
          puVar18[0x1e] = uVar2;
          puVar18[0x1f] = uVar3;
          return 1;
        }
        if (puVar11 != (undefined4 *)0x0) {
          *puVar18 = *puVar11;
          puVar18[1] = puVar11[1];
          puVar18[2] = puVar11[2];
          puVar18[3] = puVar11[3];
          puVar18[4] = puVar11[4];
          puVar18[5] = puVar11[5];
          puVar18[6] = puVar11[6];
          puVar18[7] = puVar11[7];
        }
        puVar18[0x1c] = 0;
      }
      return 1;
    }
    unaff_x27 = plVar7[-0x30];
    unaff_x26 = plVar7[-0x2f];
    func_0x002855f4(plVar7 + -0x41,auVar30._0_8_ + 8);
    *(undefined4 *)((long)plVar7 + -0x214) = 0;
    plVar7[-0x42] = *(long *)psVar13->segname;
    bVar4 = *(byte *)(auVar30._0_8_ + 0x241);
    plVar7[-0x45] = unaff_x26;
    plVar7[-0x44] = (ulong)bVar4;
    auVar29._8_8_ = auVar30._8_8_;
    auVar29._0_8_ = plVar7 + -0x41;
    param_3 = (section *)((long)plVar7 + -0x214);
    plVar7[-0x46] = unaff_x27;
    pdVar10 = &MACH_HEADER.filetype;
    puVar25 = (undefined *)0x286dd4;
    plVar7 = plVar7 + -0x46;
    psVar19 = unaff_x19;
    psVar20 = unaff_x20;
    psVar21 = unaff_x21;
    param_8 = unaff_x22;
  } while( true );
  plVar7[-0x14] = 0;
  auVar28._8_8_ = unaff_x25;
  auVar28._0_8_ = plVar7 + -0x12;
  param_8 = (section *)0x0;
  puVar25 = &UNK_00286b30;
  param_6 = unaff_x22;
  param_7 = unaff_x21;
  unaff_x24 = param_3;
  goto LAB_002868e8;
}

