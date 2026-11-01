
void FUN_0027947c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *extraout_x8;
  long unaff_x19;
  undefined1 *unaff_x20;
  long *unaff_x21;
  long unaff_x24;
  long unaff_x25;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000050;
  undefined1 auStack_5a8 [16];
  undefined8 uStack_598;
  undefined8 *puStack_590;
  undefined1 *puStack_580;
  undefined *puStack_578;
  undefined8 auStack_570 [84];
  undefined1 auStack_2d0 [672];
  undefined1 auStack_6 [6];
  
  func_0x00273ea8();
  if (*(long *)(unaff_x25 + 8) == 0) {
    iVar2 = func_0x002dd0c0(&uStack0000000000000010);
  }
  else {
    iVar2 = func_0x002dcf44(&uStack0000000000000010);
  }
  if (iVar2 != 1) {
    if (unaff_x19 != 0) {
      lVar5 = 0;
      do {
        unaff_x20[lVar5] = 0;
        lVar5 = lVar5 + 1;
      } while (unaff_x19 != lVar5);
      func_0x00187bd4();
    }
    func_0x007a2810(&UNK_0082dc98,0x2b,&uStack0000000000000050,&UNK_009ccdc0,&UNK_009cd2e8);
    func_0x007a28b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x2795dc);
    (*pcVar1)();
  }
  if (unaff_x19 != 0) {
    lVar5 = 0;
    do {
      unaff_x20[lVar5] = 0;
      lVar5 = lVar5 + 1;
    } while (unaff_x19 != lVar5);
    func_0x00187bd4();
  }
  func_0x002dd670(&uStack0000000000000050);
  func_0x00273ea8(unaff_x24 + 0x28);
  iVar2 = func_0x002c18e4(&uStack0000000000000050,&uStack0000000000000010);
  if (iVar2 == 1) {
    _memcpy(unaff_x21 + 1,&uStack0000000000000050,0x2a0);
    *unaff_x21 = unaff_x24;
    return;
  }
  uVar3 = func_0x007a2810(&UNK_0082e030,0x1c,&uStack0000000000000050,&UNK_009ccdc0,&UNK_009cd2d0);
  if (unaff_x19 != 0) {
    do {
      *unaff_x20 = 0;
      unaff_x19 = unaff_x19 + -1;
      unaff_x20 = unaff_x20 + 1;
    } while (unaff_x19 != 0);
    func_0x00187bd4();
  }
  puVar4 = (undefined8 *)__Unwind_Resume(uVar3);
  auStack_570[0] = 0;
  uVar3 = *puVar4;
  func_0x002dd670(auStack_570);
  _memcpy(auStack_2d0,auStack_570,0x2a0);
  iVar2 = func_0x002ddf9c(auStack_2d0,puVar4 + 1);
  if (iVar2 == 1) {
    _memcpy(extraout_x8 + 1,auStack_2d0,0x2a0);
    *extraout_x8 = uVar3;
    return;
  }
  auVar6 = func_0x007a2810(&UNK_0082dfb6,0x19,auStack_2d0,&UNK_009ccdc0,&UNK_009cd280);
  puStack_578 = &
                __ZN61__LT_aws_lc_rs__hmac__Context_u20_as_u20_core__fmt__Debug_GT_3fmt17h50c7b0e61ba4c00eE
  ;
  puStack_590 = puVar4 + 1;
  puStack_580 = auStack_6 + -10;
  func_0x00469240(auStack_5a8,auVar6._8_8_,&UNK_0082e04c,7);
  uStack_598 = *auVar6._0_8_;
  func_0x004653b0(auStack_5a8,&UNK_0082dd30,9,&uStack_598,&UNK_009cd298);
  func_0x00465628();
  return;
}

