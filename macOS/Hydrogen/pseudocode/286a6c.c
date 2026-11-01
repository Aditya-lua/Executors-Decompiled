
undefined8
FUN_00286a6c(section *param_1,undefined8 param_2,section *param_3,long param_4,long param_5,
            section *param_6,section *param_7,long param_8,undefined8 param_9,undefined8 param_10,
            undefined8 param_11,undefined8 param_12,undefined8 param_13,undefined8 param_14,
            undefined1 param_15 [16],undefined8 param_16,long param_17)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  char *pcVar9;
  char *pcVar10;
  section *psVar11;
  section *psVar12;
  section *psVar13;
  section *psVar14;
  section *psVar15;
  long lVar16;
  long lVar17;
  undefined4 *puVar18;
  long unaff_x19;
  section *unaff_x20;
  section *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  section *unaff_x24;
  section *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined4 uStack_174;
  undefined8 uStack_170;
  undefined1 auStack_168 [32];
  long lStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  char acStack_130 [8];
  undefined8 uStack_128;
  section *psStack_120;
  undefined8 uStack_118;
  long lStack_110;
  section *psStack_108;
  section *psStack_100;
  long lStack_f8;
  undefined1 *puStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  char acStack_d0 [8];
  char acStack_c8 [8];
  char acStack_c0 [8];
  ulong uStack_b8;
  char acStack_b0 [8];
  char acStack_a8 [12];
  char acStack_9c [12];
  undefined1 auStack_90 [32];
  long lStack_70;
  undefined1 auStack_68 [8];
  
  psVar13 = param_6;
  psVar15 = param_7;
  lVar16 = param_8;
  if (param_4 == 0xc) {
    unaff_x19 = param_8;
    if (param_8 == *(long *)(unaff_x29 + 0x20)) {
      unaff_x21 = param_6;
      if (param_6 < (section *)0x3fffffffc0) {
        pcVar9 = *(char **)(unaff_x29 + 0x10);
        psVar11 = *(section **)(unaff_x29 + 0x18);
        lVar7 = param_8;
        if ((bRam0000000000a334f8 & 1) == 0) {
          param_9 = 0;
          lVar16 = 0;
          psVar15 = param_6;
          func_0x002868e8(&param_11,param_1,param_3,pcVar9,psVar11,param_5);
          psVar13 = (section *)((long)&MACH_HEADER.magic + 1);
          pcVar9 = param_1->sectname;
          psVar11 = param_3;
          func_0x002857d8(param_2,param_5,param_6);
          iVar4 = func_0x0036e62c(&param_11,param_7);
        }
        else {
          param_12 = *(undefined8 *)((long)param_1->sectname + 8);
          param_11 = *(undefined8 *)param_1->sectname;
          param_14 = *(undefined8 *)((long)param_1->segname + 8);
          param_13 = *(undefined8 *)param_1->segname;
          param_15._0_4_ = 0;
          param_15._4_8_ = *(undefined8 *)param_3->sectname;
          param_15._12_4_ = *(dword *)((long)param_3->sectname + 8);
          psVar13 = (section *)&param_11;
          func_0x003770c0(param_2,param_5,param_6);
          iVar4 = func_0x0036e62c(&param_11,param_7);
        }
        if (iVar4 == 0) {
          uVar5 = 1;
          if (*(long *)PTR____stack_chk_guard_009b01e8 == param_17) {
            return 1;
          }
          goto LAB_00286c14;
        }
        lVar7 = 0x65;
        psVar11 = (section *)((long)&section_00000108.addr + 1);
        unaff_x20 = param_7;
        unaff_x22 = param_5;
        unaff_x23 = param_2;
        unaff_x24 = param_3;
        unaff_x25 = param_1;
      }
      else {
        lVar7 = 0x75;
        psVar11 = (section *)(section_00000108.segname + 1);
      }
    }
    else {
      lVar7 = 0x65;
      psVar11 = (section *)(section_00000108.sectname + 5);
    }
  }
  else {
    lVar7 = 0x79;
    psVar11 = &section_00000108;
  }
  pcVar9 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
  func_0x0028f83c(0x1e,0);
  uVar5 = 0;
  param_8 = unaff_x19;
  param_7 = unaff_x20;
  param_6 = unaff_x21;
  param_5 = unaff_x22;
  param_2 = unaff_x23;
  param_3 = unaff_x24;
  param_1 = unaff_x25;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_17) {
    return 0;
  }
LAB_00286c14:
  auVar20._8_8_ = param_2;
  auVar20._0_8_ = param_1;
  auVar19 = ___stack_chk_fail(uVar5);
  uVar5 = param_13;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (psVar15 == (section *)&MACH_HEADER.flags) {
    acStack_a8[0] = (char)param_12;
    acStack_a8[1] = param_12._1_1_;
    acStack_a8[2] = param_12._2_1_;
    acStack_a8[3] = param_12._3_1_;
    acStack_a8[4] = param_12._4_1_;
    acStack_a8[5] = param_12._5_1_;
    acStack_a8[6] = param_12._6_1_;
    acStack_a8[7] = param_12._7_1_;
    acStack_b0[0] = (char)param_11;
    acStack_b0[1] = param_11._1_1_;
    acStack_b0[2] = param_11._2_1_;
    acStack_b0[3] = param_11._3_1_;
    acStack_b0[4] = param_11._4_1_;
    acStack_b0[5] = param_11._5_1_;
    acStack_b0[6] = param_11._6_1_;
    acStack_b0[7] = param_11._7_1_;
    func_0x002855f4(auStack_90,auVar19._0_8_ + 8,psVar13);
    uVar6 = param_13;
    acStack_9c[0] = '\0';
    acStack_9c[1] = '\0';
    acStack_9c[2] = '\0';
    acStack_9c[3] = '\0';
    acStack_9c._4_8_ = *(undefined8 *)psVar13->segname;
    uStack_b8 = (ulong)*(byte *)(auVar19._0_8_ + 0x241);
    param_13._0_1_ = (char)uVar5;
    param_13._1_1_ = SUB81(uVar5,1);
    param_13._2_1_ = SUB81(uVar5,2);
    param_13._3_1_ = SUB81(uVar5,3);
    param_13._4_1_ = SUB81(uVar5,4);
    param_13._5_1_ = SUB81(uVar5,5);
    param_13._6_1_ = SUB81(uVar5,6);
    param_13._7_1_ = SUB81(uVar5,7);
    acStack_c0[0] = (char)param_13;
    acStack_c0[1] = param_13._1_1_;
    acStack_c0[2] = param_13._2_1_;
    acStack_c0[3] = param_13._3_1_;
    acStack_c0[4] = param_13._4_1_;
    acStack_c0[5] = param_13._5_1_;
    acStack_c0[6] = param_13._6_1_;
    acStack_c0[7] = param_13._7_1_;
    psVar14 = (section *)acStack_9c;
    acStack_d0[0] = acStack_b0[0];
    acStack_d0[1] = acStack_b0[1];
    acStack_d0[2] = acStack_b0[2];
    acStack_d0[3] = acStack_b0[3];
    acStack_d0[4] = acStack_b0[4];
    acStack_d0[5] = acStack_b0[5];
    acStack_d0[6] = acStack_b0[6];
    acStack_d0[7] = acStack_b0[7];
    acStack_c8[0] = acStack_a8[0];
    acStack_c8[1] = acStack_a8[1];
    acStack_c8[2] = acStack_a8[2];
    acStack_c8[3] = acStack_a8[3];
    acStack_c8[4] = acStack_a8[4];
    acStack_c8[5] = acStack_a8[5];
    acStack_c8[6] = acStack_a8[6];
    acStack_c8[7] = acStack_a8[7];
    uStack_e0 = param_9;
    uStack_d8 = param_10;
    psVar15 = (section *)&MACH_HEADER.filetype;
    lVar8 = lVar7;
    pcVar10 = pcVar9;
    psVar12 = psVar11;
    lVar17 = lVar16;
    param_13 = uVar6;
    uVar6 = func_0x0028656c(auStack_90,auVar19._8_8_,lVar7,pcVar9,psVar11,psVar14,0xc,lVar16);
    param_8 = lVar16;
    param_7 = psVar11;
    param_6 = (section *)pcVar9;
    param_5 = lVar7;
    param_3 = psVar13;
    unaff_x26 = uVar5;
    auVar20 = auVar19;
  }
  else {
    pcVar10 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
    lVar8 = 0x79;
    psVar12 = (section *)((long)&section_000000b8.reloff + 1);
    func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0xf1);
    uVar6 = 0;
    psVar14 = psVar13;
    lVar17 = lVar16;
    param_10 = unaff_x27;
    param_9 = unaff_x28;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
    return uVar6;
  }
  auVar19 = ___stack_chk_fail(uVar6);
  uVar6 = uStack_d8;
  uVar5 = uStack_e0;
  puStack_e8 = &DAT_00286d34;
  lStack_148 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_140 = param_9;
  uStack_138 = param_10;
  acStack_130 = (char  [8])unaff_x26;
  uStack_128 = auVar20._0_8_;
  psStack_120 = param_3;
  uStack_118 = auVar20._8_8_;
  lStack_110 = param_5;
  psStack_108 = param_6;
  psStack_100 = param_7;
  lStack_f8 = param_8;
  puStack_f0 = auStack_68 + 0x58;
  if ((dword *)pcVar10 == &MACH_HEADER.flags) {
    func_0x002855f4(auStack_168,auVar19._0_8_ + 8);
    uStack_174 = 0;
    uStack_170 = *(undefined8 *)(lVar8 + 0x10);
    pcVar9 = (char *)&uStack_174;
    uVar5 = func_0x00286a40(auStack_168,auVar19._8_8_,pcVar9,0xc,psVar12,psVar14,psVar15,lVar17,
                            uVar5,uVar6,*(undefined1 *)(auVar19._0_8_ + 0x241));
  }
  else {
    pcVar9 = section_00000068.segname + 1;
    func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x144);
    uVar5 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_148) {
    return uVar5;
  }
  auVar20 = ___stack_chk_fail(uVar5);
  auVar20._8_8_ = auVar20._8_8_;
  puVar18 = *(undefined4 **)(auVar20._0_8_ + 0x10);
  *(undefined8 *)(puVar18 + 0x26) = 0;
  *(undefined8 *)(puVar18 + 0x28) = 0;
  *(undefined8 *)(puVar18 + 0x2a) = 0;
  if (auVar20._8_8_ != (undefined4 *)0x0 || pcVar9 != (char *)0x0) {
    if (pcVar9 != (char *)0x0) {
      uVar1 = *(undefined4 *)pcVar9;
      uVar2 = *(undefined4 *)(pcVar9 + 4);
      uVar3 = *(undefined4 *)(pcVar9 + 8);
      if (auVar20._8_8_ != (undefined4 *)0x0) {
        *puVar18 = *auVar20._8_8_;
        puVar18[1] = auVar20._8_8_[1];
        puVar18[2] = auVar20._8_8_[2];
        puVar18[3] = auVar20._8_8_[3];
        puVar18[4] = auVar20._8_8_[4];
        puVar18[5] = auVar20._8_8_[5];
        puVar18[6] = auVar20._8_8_[6];
        puVar18[7] = auVar20._8_8_[7];
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
    if (auVar20._8_8_ != (undefined4 *)0x0) {
      *puVar18 = *auVar20._8_8_;
      puVar18[1] = auVar20._8_8_[1];
      puVar18[2] = auVar20._8_8_[2];
      puVar18[3] = auVar20._8_8_[3];
      puVar18[4] = auVar20._8_8_[4];
      puVar18[5] = auVar20._8_8_[5];
      puVar18[6] = auVar20._8_8_[6];
      puVar18[7] = auVar20._8_8_[7];
    }
    puVar18[0x1c] = 0;
  }
  return 1;
}

