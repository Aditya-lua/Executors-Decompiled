
undefined8
FUN_00286c34(long param_1,undefined8 param_2,long param_3,char *param_4,undefined8 param_5,
            long param_6,long param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined4 *puVar8;
  long lVar9;
  char *pcVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined4 *puVar14;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  char *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 auVar15 [16];
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  long lStack0000000000000070;
  undefined1 uStack00000000000000d0;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  char acStack_94 [4];
  undefined8 uStack_90;
  undefined1 auStack_88 [32];
  long lStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  long lStack_48;
  long lStack_40;
  undefined8 uStack_38;
  long lStack_30;
  char *pcStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  undefined1 *puStack_10;
  undefined *puStack_8;
  
  uVar5 = in_stack_00000100;
  uVar4 = in_stack_000000e8;
  uVar7 = in_stack_000000e0;
  lStack0000000000000070 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_7 == 0x18) {
    func_0x002855f4(&uStack0000000000000050,param_1 + 8,param_6);
    uStack0000000000000040._4_4_ = 0;
    in_stack_00000048 = *(undefined8 *)(param_6 + 0x10);
    lVar12 = (long)&uStack0000000000000040 + 4;
    param_9 = uVar7;
    param_10 = uVar4;
    param_7 = 0xc;
    lVar9 = param_3;
    pcVar10 = param_4;
    uVar11 = param_5;
    uVar13 = param_8;
    uVar6 = func_0x0028656c(&uStack0000000000000050,param_2,param_3,param_4,param_5,lVar12,0xc,
                            param_8);
    unaff_x19 = param_8;
    unaff_x20 = param_5;
    unaff_x21 = param_4;
    unaff_x22 = param_3;
    unaff_x23 = param_2;
    unaff_x24 = param_6;
    unaff_x25 = param_1;
    unaff_x26 = uVar5;
    unaff_x27 = uVar4;
    unaff_x28 = uVar7;
  }
  else {
    pcVar10 = "/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c";
    lVar9 = 0x79;
    uVar11 = 0xf1;
    func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0xf1);
    uVar6 = 0;
    lVar12 = param_6;
    uVar13 = param_8;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000070) {
    return uVar6;
  }
  auVar15 = ___stack_chk_fail(uVar6);
  puStack_8 = &DAT_00286d34;
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_60 = unaff_x28;
  uStack_58 = unaff_x27;
  uStack_50 = unaff_x26;
  lStack_48 = unaff_x25;
  lStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  lStack_30 = unaff_x22;
  pcStack_28 = unaff_x21;
  uStack_20 = unaff_x20;
  uStack_18 = unaff_x19;
  puStack_10 = &uStack00000000000000d0;
  if (pcVar10 == (char *)0x18) {
    func_0x002855f4(auStack_88,auVar15._0_8_ + 8);
    acStack_94[0] = '\0';
    acStack_94[1] = '\0';
    acStack_94[2] = '\0';
    acStack_94[3] = '\0';
    uStack_90 = *(undefined8 *)(lVar9 + 0x10);
    pcVar10 = acStack_94;
    uVar7 = func_0x00286a40(auStack_88,auVar15._8_8_,pcVar10,0xc,uVar11,lVar12,param_7,uVar13,
                            param_9,param_10,*(undefined1 *)(auVar15._0_8_ + 0x241));
  }
  else {
    pcVar10 = section_00000068.segname + 1;
    func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x144);
    uVar7 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return uVar7;
  }
  auVar15 = ___stack_chk_fail(uVar7);
  puVar8 = auVar15._8_8_;
  puVar14 = *(undefined4 **)(auVar15._0_8_ + 0x10);
  *(undefined8 *)(puVar14 + 0x26) = 0;
  *(undefined8 *)(puVar14 + 0x28) = 0;
  *(undefined8 *)(puVar14 + 0x2a) = 0;
  if (puVar8 != (undefined4 *)0x0 || pcVar10 != (char *)0x0) {
    if (pcVar10 != (char *)0x0) {
      uVar1 = *(undefined4 *)pcVar10;
      uVar2 = *(undefined4 *)(pcVar10 + 4);
      uVar3 = *(undefined4 *)(pcVar10 + 8);
      if (puVar8 != (undefined4 *)0x0) {
        *puVar14 = *puVar8;
        puVar14[1] = puVar8[1];
        puVar14[2] = puVar8[2];
        puVar14[3] = puVar8[3];
        puVar14[4] = puVar8[4];
        puVar14[5] = puVar8[5];
        puVar14[6] = puVar8[6];
        puVar14[7] = puVar8[7];
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
    if (puVar8 != (undefined4 *)0x0) {
      *puVar14 = *puVar8;
      puVar14[1] = puVar8[1];
      puVar14[2] = puVar8[2];
      puVar14[3] = puVar8[3];
      puVar14[4] = puVar8[4];
      puVar14[5] = puVar8[5];
      puVar14[6] = puVar8[6];
      puVar14[7] = puVar8[7];
    }
    puVar14[0x1c] = 0;
  }
  return 1;
}

