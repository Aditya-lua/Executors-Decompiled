
undefined8 FUN_00286b34(void)

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
  undefined4 *puVar10;
  undefined4 *puVar11;
  undefined4 *puVar12;
  long in_x6;
  long in_x7;
  long lVar13;
  undefined4 *puVar14;
  long unaff_x19;
  undefined4 *unaff_x20;
  char *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined4 *unaff_x24;
  char *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000048;
  char acStack_174 [4];
  undefined8 uStack_170;
  undefined1 auStack_168 [32];
  long lStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined4 *puStack_120;
  undefined8 uStack_118;
  long lStack_110;
  char *pcStack_108;
  undefined4 *puStack_100;
  long lStack_f8;
  undefined1 *puStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined4 uStack_9c;
  undefined8 uStack_98;
  undefined1 auStack_90 [32];
  long lStack_70;
  undefined1 auStack_6 [6];
  
  auVar16._8_8_ = unaff_x23;
  auVar16._0_8_ = unaff_x25;
  puVar14 = (undefined4 *)((long)&MACH_HEADER.magic + 1);
  puVar10 = unaff_x24;
  func_0x002857d8();
  lVar7 = unaff_x19;
  iVar4 = func_0x0036e62c(&uStack0000000000000010);
  if (iVar4 == 0) {
    uVar5 = 1;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != in_stack_00000048) goto LAB_00286c14;
  }
  else {
    unaff_x25 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
    lVar7 = 0x65;
    puVar10 = (undefined4 *)((long)&section_00000108.addr + 1);
    func_0x0028f83c(0x1e,0);
    uVar5 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 != in_stack_00000048) {
LAB_00286c14:
      auVar15 = ___stack_chk_fail(uVar5);
      uVar5 = in_stack_00000020;
      lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
      if (in_x6 == 0x18) {
        uStack_a8 = in_stack_00000018;
        uStack_b0 = uStack0000000000000010;
        func_0x002855f4(auStack_90,auVar15._0_8_ + 8,puVar14);
        uStack_9c = 0;
        uStack_98 = *(undefined8 *)(puVar14 + 4);
        uStack_b8 = (ulong)*(byte *)(auVar15._0_8_ + 0x241);
        uStack_c0 = uVar5;
        puVar12 = &uStack_9c;
        uStack_d0 = uStack_b0;
        uStack_c8 = uStack_a8;
        uStack_e0 = in_stack_00000000;
        uStack_d8 = in_stack_00000008;
        in_x6 = 0xc;
        lVar8 = lVar7;
        pcVar9 = unaff_x25;
        puVar11 = puVar10;
        lVar13 = in_x7;
        uVar6 = func_0x0028656c(auStack_90,auVar15._8_8_,lVar7,unaff_x25,puVar10,puVar12,0xc,in_x7);
        unaff_x19 = in_x7;
        unaff_x20 = puVar10;
        unaff_x21 = unaff_x25;
        unaff_x22 = lVar7;
        unaff_x24 = puVar14;
        unaff_x26 = uVar5;
        auVar16 = auVar15;
      }
      else {
        pcVar9 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
        lVar8 = 0x79;
        puVar11 = (undefined4 *)((long)&section_000000b8.reloff + 1);
        func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0xf1);
        uVar6 = 0;
        puVar12 = puVar14;
        lVar13 = in_x7;
        in_stack_00000008 = unaff_x27;
        in_stack_00000000 = unaff_x28;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
        return uVar6;
      }
      auVar15 = ___stack_chk_fail(uVar6);
      uVar6 = uStack_d8;
      uVar5 = uStack_e0;
      puStack_e8 = &DAT_00286d34;
      lStack_148 = *(long *)PTR____stack_chk_guard_009b01e8;
      uStack_140 = in_stack_00000000;
      uStack_138 = in_stack_00000008;
      uStack_130 = unaff_x26;
      uStack_128 = auVar16._0_8_;
      puStack_120 = unaff_x24;
      uStack_118 = auVar16._8_8_;
      lStack_110 = unaff_x22;
      pcStack_108 = unaff_x21;
      puStack_100 = unaff_x20;
      lStack_f8 = unaff_x19;
      puStack_f0 = auStack_6 + -10;
      if (pcVar9 == (char *)0x18) {
        func_0x002855f4(auStack_168,auVar15._0_8_ + 8);
        acStack_174[0] = '\0';
        acStack_174[1] = '\0';
        acStack_174[2] = '\0';
        acStack_174[3] = '\0';
        uStack_170 = *(undefined8 *)(lVar8 + 0x10);
        pcVar9 = acStack_174;
        uVar5 = func_0x00286a40(auStack_168,auVar15._8_8_,pcVar9,0xc,puVar11,puVar12,in_x6,lVar13,
                                uVar5,uVar6,*(undefined1 *)(auVar15._0_8_ + 0x241));
      }
      else {
        pcVar9 = section_00000068.segname + 1;
        func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x144);
        uVar5 = 0;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_148) {
        return uVar5;
      }
      auVar16 = ___stack_chk_fail(uVar5);
      puVar10 = auVar16._8_8_;
      puVar14 = *(undefined4 **)(auVar16._0_8_ + 0x10);
      *(undefined8 *)(puVar14 + 0x26) = 0;
      *(undefined8 *)(puVar14 + 0x28) = 0;
      *(undefined8 *)(puVar14 + 0x2a) = 0;
      if (puVar10 != (undefined4 *)0x0 || pcVar9 != (char *)0x0) {
        if (pcVar9 != (char *)0x0) {
          uVar1 = *(undefined4 *)pcVar9;
          uVar2 = *(undefined4 *)(pcVar9 + 4);
          uVar3 = *(undefined4 *)(pcVar9 + 8);
          if (puVar10 != (undefined4 *)0x0) {
            *puVar14 = *puVar10;
            puVar14[1] = puVar10[1];
            puVar14[2] = puVar10[2];
            puVar14[3] = puVar10[3];
            puVar14[4] = puVar10[4];
            puVar14[5] = puVar10[5];
            puVar14[6] = puVar10[6];
            puVar14[7] = puVar10[7];
          }
          puVar14[8] = 0;
          puVar14[9] = uVar1;
          puVar14[10] = uVar2;
          puVar14[0xb] = uVar3;
          puVar14[0x1c] = 0;
          puVar14[0x1d] = uVar1;
          puVar14[0x1e] = uVar2;
          puVar14[0x1f] = uVar3;
          return 1;
        }
        if (puVar10 != (undefined4 *)0x0) {
          *puVar14 = *puVar10;
          puVar14[1] = puVar10[1];
          puVar14[2] = puVar10[2];
          puVar14[3] = puVar10[3];
          puVar14[4] = puVar10[4];
          puVar14[5] = puVar10[5];
          puVar14[6] = puVar10[6];
          puVar14[7] = puVar10[7];
        }
        puVar14[0x1c] = 0;
      }
      return 1;
    }
  }
  return uVar5;
}

