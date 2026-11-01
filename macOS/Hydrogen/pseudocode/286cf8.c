
undefined8
FUN_00286cf8(undefined8 param_1,undefined8 param_2,long param_3,long param_4,undefined8 param_5,
            undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
            undefined8 param_10)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined4 *puVar5;
  char *pcVar6;
  undefined4 *puVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  char acStack_94 [4];
  undefined8 uStack_90;
  undefined1 auStack_88 [32];
  long lStack_68;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return param_1;
  }
  auVar8 = ___stack_chk_fail();
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_4 == 0x18) {
    func_0x002855f4(auStack_88,auVar8._0_8_ + 8);
    acStack_94[0] = '\0';
    acStack_94[1] = '\0';
    acStack_94[2] = '\0';
    acStack_94[3] = '\0';
    uStack_90 = *(undefined8 *)(param_3 + 0x10);
    pcVar6 = acStack_94;
    uVar4 = func_0x00286a40(auStack_88,auVar8._8_8_,pcVar6,0xc,param_5,param_6,param_7,param_8,
                            param_9,param_10,*(undefined1 *)(auVar8._0_8_ + 0x241));
  }
  else {
    pcVar6 = section_00000068.segname + 1;
    func_0x0028f83c(0x1e,0,0x79,"/aws-lc/crypto/cipher_extra/e_chacha20poly1305.c",0x144);
    uVar4 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return uVar4;
  }
  auVar8 = ___stack_chk_fail(uVar4);
  puVar5 = auVar8._8_8_;
  puVar7 = *(undefined4 **)(auVar8._0_8_ + 0x10);
  *(undefined8 *)(puVar7 + 0x26) = 0;
  *(undefined8 *)(puVar7 + 0x28) = 0;
  *(undefined8 *)(puVar7 + 0x2a) = 0;
  if (puVar5 != (undefined4 *)0x0 || pcVar6 != (char *)0x0) {
    if (pcVar6 != (char *)0x0) {
      uVar1 = *(undefined4 *)pcVar6;
      uVar2 = *(undefined4 *)(pcVar6 + 4);
      uVar3 = *(undefined4 *)(pcVar6 + 8);
      if (puVar5 != (undefined4 *)0x0) {
        *puVar7 = *puVar5;
        puVar7[1] = puVar5[1];
        puVar7[2] = puVar5[2];
        puVar7[3] = puVar5[3];
        puVar7[4] = puVar5[4];
        puVar7[5] = puVar5[5];
        puVar7[6] = puVar5[6];
        puVar7[7] = puVar5[7];
      }
      puVar7[8] = 0;
      puVar7[9] = uVar1;
      puVar7[10] = uVar2;
      puVar7[0xb] = uVar3;
      puVar7[0x1c] = 0;
      puVar7[0x1d] = uVar1;
      puVar7[0x1e] = uVar2;
      puVar7[0x1f] = uVar3;
      return 1;
    }
    if (puVar5 != (undefined4 *)0x0) {
      *puVar7 = *puVar5;
      puVar7[1] = puVar5[1];
      puVar7[2] = puVar5[2];
      puVar7[3] = puVar5[3];
      puVar7[4] = puVar5[4];
      puVar7[5] = puVar5[5];
      puVar7[6] = puVar5[6];
      puVar7[7] = puVar5[7];
    }
    puVar7[0x1c] = 0;
  }
  return 1;
}

