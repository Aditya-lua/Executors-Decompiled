
/* WARNING: Removing unreachable block (ram,0x00425420) */
/* WARNING: Removing unreachable block (ram,0x004253ec) */
/* WARNING: Removing unreachable block (ram,0x0042561c) */

ulong FUN_00425328(void)

{
  undefined1 *puVar1;
  short *psVar2;
  char *pcVar3;
  undefined1 auVar4 [16];
  short *psVar5;
  long lVar6;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined *puVar7;
  ulong uVar8;
  char *pcVar9;
  ulong uVar10;
  ulong uVar11;
  ulong unaff_x19;
  ulong *unaff_x20;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong unaff_x22;
  ulong uVar14;
  char *pcVar15;
  short *unaff_x23;
  char *pcVar16;
  uint uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined4 uStack0000000000000018;
  short *in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000050;
  undefined2 uStack0000000000000088;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined1 ***pppuStack_140;
  undefined8 uStack_138;
  char *pcStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  long lStack_118;
  undefined1 **ppuStack_110;
  undefined8 uStack_108;
  char *pcStack_100;
  undefined8 uStack_f8;
  long *plStack_f0;
  undefined *puStack_e8;
  undefined1 *puStack_e0;
  undefined8 uStack_d8;
  uint auStack_c8 [2];
  char *pcStack_c0;
  long lStack_b8;
  char *pcStack_90;
  char *pcStack_88;
  char *pcStack_80;
  undefined2 uStack_58;
  undefined1 uStack_56;
  undefined1 auStack_6 [6];
  
  uStack0000000000000088 = 0x200;
  func_0x004248f4(&uStack0000000000000018,&uStack0000000000000050);
  if ((char)uStack0000000000000018 != '\t') {
    return 0;
  }
  uVar14 = in_stack_00000028;
  psVar5 = in_stack_00000020;
  if ((in_stack_00000028 == 2) && (*in_stack_00000020 == 0x2e2e)) {
    uVar10 = 2;
    psVar2 = (short *)0x0;
    if (in_stack_00000020 != (short *)0x0) {
      psVar2 = in_stack_00000020;
    }
  }
  else {
    uVar8 = in_stack_00000028;
    do {
      uVar11 = uVar8;
      if ((short *)((long)in_stack_00000020 + uVar11) == in_stack_00000020) {
        psVar5 = (short *)0x0;
        uVar10 = uVar11;
        psVar2 = in_stack_00000020;
        goto joined_r0x004253f0;
      }
      uVar8 = uVar11 - 1;
    } while (*(char *)((long)((long)in_stack_00000020 + uVar11) + -1) != '.');
    uVar14 = ~uVar8 + in_stack_00000028;
    uVar10 = uVar8;
    if (uVar8 == 0) {
      uVar14 = in_stack_00000028;
      uVar10 = in_stack_00000028;
    }
    psVar2 = (short *)0x0;
    if (uVar8 != 0) {
      psVar2 = (short *)((long)in_stack_00000020 + uVar11);
    }
    if (in_stack_00000020 != (short *)0x0) {
      psVar2 = in_stack_00000020;
    }
  }
joined_r0x004253f0:
  if (psVar2 == (short *)0x0) {
    return 0;
  }
  if (psVar5 != (short *)0x0) {
    uVar14 = uVar10;
  }
  uVar14 = (long)psVar2 + (uVar14 - (long)unaff_x23);
  uVar13 = extraout_x1;
  if (((uVar14 != 0) && (uVar14 != unaff_x22)) && (unaff_x22 <= uVar14)) {
    func_0x00434438();
    uVar13 = extraout_x1_00;
  }
  if (uVar14 <= unaff_x22) {
    unaff_x20[2] = uVar14;
    unaff_x22 = uVar14;
  }
  if (unaff_x19 == 0) {
    return 1;
  }
  uVar14 = unaff_x19 + 1;
  uVar8 = *unaff_x20;
  if (uVar14 <= uVar8 - unaff_x22) {
joined_r0x00425518:
    if (uVar8 == unaff_x22) {
      func_0x007a0000();
      unaff_x23 = (short *)unaff_x20[1];
      unaff_x22 = unaff_x20[2];
    }
    *(undefined1 *)((long)unaff_x23 + unaff_x22) = 0x2e;
    uVar14 = unaff_x22 + 1;
    unaff_x20[2] = uVar14;
    if (*unaff_x20 - uVar14 < unaff_x19) {
      func_0x007a0000();
      uVar14 = unaff_x20[2];
    }
    _memcpy(unaff_x20[1] + uVar14);
    unaff_x20[2] = uVar14 + unaff_x19;
    return 1;
  }
  if ((CARRY8(unaff_x22,uVar14)) || (uVar14 = unaff_x22 + uVar14, (long)uVar14 < 0)) {
    func_0x007a1f00(0,uVar13,&UNK_009daad0);
  }
  else {
    if (uVar8 != 0) {
      uStack0000000000000050 = unaff_x23;
    }
    func_0x0079a108(&uStack0000000000000018,1,uVar14,&uStack0000000000000050);
    if (uStack0000000000000018 != 1) {
      *unaff_x20 = uVar14;
      unaff_x20[1] = (ulong)in_stack_00000020;
      unaff_x23 = in_stack_00000020;
      uVar8 = uVar14;
      goto joined_r0x00425518;
    }
  }
  puVar7 = &UNK_009daad0;
  auVar18 = func_0x007a1f00(in_stack_00000020,in_stack_00000028);
  auVar18._0_8_ = auVar18._0_8_;
  puVar1 = auStack_6 + -10;
  pcVar16 = (char *)auVar18._0_8_[1];
  pcVar15 = (char *)auVar18._0_8_[2];
  if (pcVar15 == (char *)0x0) {
    uStack_56 = false;
  }
  else {
    uStack_56 = *pcVar16 == '/';
  }
  pcStack_80 = (char *)CONCAT71(pcStack_80._1_7_,6);
  uStack_58 = 0x200;
  pcStack_90 = pcVar16;
  pcStack_88 = pcVar15;
  func_0x004248f4(auStack_c8,&pcStack_90);
  uVar17 = auStack_c8[0] & 0xff;
  if ((puVar7 == (undefined *)0x0) || (uVar17 != 9)) goto LAB_004256a4;
  pcVar3 = pcStack_c0 + (lStack_b8 - (long)pcVar16);
  uVar13 = extraout_x1_01;
  if ((pcVar3 != (char *)0x0 && pcVar3 != pcVar15) && (pcVar15 <= pcVar3)) {
    func_0x00434438(pcVar16,pcVar15,pcVar3,&UNK_009da260);
    uVar13 = extraout_x1_02;
  }
  if (pcVar3 <= pcVar15) {
    auVar18._0_8_[2] = (long)pcVar3;
    pcVar15 = pcVar3;
  }
  pcVar3 = puVar7 + 1;
  pcVar9 = (char *)*auVar18._0_8_;
  if (pcVar3 <= pcVar9 + -(long)pcVar15) {
joined_r0x00425664:
    if (pcVar9 == pcVar15) {
      func_0x007a0000(auVar18._0_8_,pcVar15,1,1,1);
      pcVar16 = (char *)auVar18._0_8_[1];
      pcVar15 = (char *)auVar18._0_8_[2];
    }
    pcVar16[(long)pcVar15] = '.';
    pcVar15 = pcVar15 + 1;
    auVar18._0_8_[2] = (long)pcVar15;
    if ((undefined *)(*auVar18._0_8_ - (long)pcVar15) < puVar7) {
      func_0x007a0000(auVar18._0_8_,pcVar15,puVar7,1,1);
      pcVar15 = (char *)auVar18._0_8_[2];
    }
    _memcpy(pcVar15 + auVar18._0_8_[1],auVar18._8_8_,puVar7);
    auVar18._0_8_[2] = (long)(pcVar15 + (long)puVar7);
LAB_004256a4:
    return (ulong)(uVar17 == 9);
  }
  if ((CARRY8((ulong)pcVar15,(ulong)pcVar3)) || (pcVar3 = pcVar15 + (long)pcVar3, (long)pcVar3 < 0))
  {
    func_0x007a1f00(0,uVar13,&UNK_009daad0);
  }
  else {
    if (pcVar9 != (char *)0x0) {
      pcStack_90 = pcVar16;
      pcStack_80 = pcVar9;
    }
    pcStack_88 = (char *)(ulong)(pcVar9 != (char *)0x0);
    func_0x0079a108(auStack_c8,1,pcVar3,&pcStack_90);
    if (auStack_c8[0] != 1) {
      *auVar18._0_8_ = (long)pcVar3;
      auVar18._0_8_[1] = (long)pcStack_c0;
      pcVar16 = pcStack_c0;
      pcVar9 = pcVar3;
      goto joined_r0x00425664;
    }
  }
  auVar19 = func_0x007a1f00(pcStack_c0,lStack_b8,&UNK_009daad0);
  lStack_118 = auVar19._8_8_;
  uStack_d8 = 0x42577c;
  pcStack_100 = pcVar15;
  plStack_f0 = auVar18._0_8_;
  puStack_e8 = puVar7;
  puStack_e0 = puVar1;
  if (lStack_118 < 0) {
    uVar13 = 0;
  }
  else {
    if (lStack_118 == 0) {
      uVar14 = 1;
      auVar4 = auVar18;
LAB_004257c4:
      uStack_f8 = auVar4._8_8_;
      plStack_f0 = auVar4._0_8_;
      _memcpy(uVar14,auVar19._0_8_,lStack_118);
      return uVar14;
    }
    uVar13 = 1;
    uStack_f8 = auVar18._8_8_;
    uVar14 = func_0x00187bd0(lStack_118,1);
    auVar4._8_8_ = uStack_f8;
    auVar4._0_8_ = plStack_f0;
    auVar18._8_8_ = uStack_f8;
    auVar18._0_8_ = auVar19._0_8_;
    if (uVar14 != 0) goto LAB_004257c4;
  }
  uStack_f8 = auVar18._8_8_;
  uVar12 = auVar18._0_8_;
  auVar18 = func_0x007a1f00(uVar13,lStack_118,&UNK_009d90d8);
  lVar6 = auVar18._8_8_;
  uStack_108 = 0x425804;
  pcStack_130 = pcVar15;
  uStack_128 = uVar13;
  uStack_120 = uVar12;
  ppuStack_110 = &puStack_e0;
  if (lVar6 < 0) {
    uVar13 = 0;
LAB_00425878:
    lVar6 = func_0x007a1f00(uVar13,lVar6,&UNK_009d90d8);
    uStack_138 = 0x42588c;
    uStack_150 = *(undefined8 *)(lVar6 + 8);
    uStack_148 = *(undefined8 *)(lVar6 + 0x10);
    pppuStack_140 = &ppuStack_110;
    uVar14 = func_0x0046d710(&uStack_150);
    return uVar14;
  }
  if (lVar6 == 0) {
    uVar14 = 1;
  }
  else {
    uVar13 = 1;
    uVar14 = func_0x00187bd0(lVar6,1);
    if (uVar14 == 0) goto LAB_00425878;
  }
  _memcpy(uVar14,auVar18._0_8_,lVar6);
  return uVar14;
}

