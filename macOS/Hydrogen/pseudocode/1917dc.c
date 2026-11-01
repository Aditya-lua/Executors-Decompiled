
long FUN_001917dc(void)

{
  uint *puVar1;
  bool bVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined *puVar9;
  long in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 uVar10;
  uint *extraout_x8;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined4 uStack0000000000000014;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined4 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000078;
  long lStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  uint *puStack_90;
  undefined *puStack_88;
  uint auStack_78 [2];
  undefined8 uStack_70;
  undefined8 uStack_60;
  long lStack_58;
  
  lVar5 = in_x3;
  uVar8 = in_x5;
  uVar10 = in_x6;
  if ((unaff_x25 != 0) && (lVar4 = _CFRetain(), unaff_x20 = in_x6, unaff_x21 = in_x3, lVar4 != 0)) {
    uStack0000000000000014 = *(undefined4 *)(unaff_x29 + 0x1c);
    *(long *)(unaff_x29 + -0x60) = lVar4;
    func_0x00192bd0(&uStack0000000000000060,unaff_x29 + -0x60,1,in_stack_00000050,in_stack_00000048,
                    in_x3,in_stack_00000040,in_x5,in_x6);
    uVar8 = *(undefined8 *)(unaff_x29 + 0x28);
    uVar10 = *(undefined8 *)(unaff_x29 + 0x30);
    _CFRelease(lVar4);
    uVar6 = in_stack_00000078;
    if ((uStack0000000000000060 & 1) == 0) {
      lVar5 = _SecKeychainItemModifyAttributesAndData(in_stack_00000078,0,uVar10,uVar8);
      _CFRelease(uVar6);
      _SecKeychainItemFreeContent(0,in_stack_00000068);
    }
    else {
      uStack0000000000000014 = (undefined4)uVar10;
      lVar5 = _SecKeychainAddInternetPassword();
    }
    return lVar5;
  }
  puVar9 = &UNK_009c11a0;
  uVar6 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11a0);
  _CFRelease();
  auVar11 = __Unwind_Resume(uVar6);
  puVar1 = auStack_78 + 0x1a;
  lVar4 = *auVar11._0_8_;
  if ((lVar4 != 0) &&
     (lVar7 = _CFRetain(lVar4), unaff_x20 = uVar10, unaff_x21 = lVar5, unaff_x22 = in_x4, lVar7 != 0
     )) {
    lStack_58 = lVar7;
    func_0x00192acc(auStack_78,&lStack_58,1,auVar11._8_8_,puVar9,lVar5,in_x4);
    _CFRelease(lVar7);
    if ((auStack_78[0] & 1) == 0) {
      lVar5 = _SecKeychainItemModifyAttributesAndData(uStack_60,0,uVar10,uVar8);
      _CFRelease(uStack_60);
      _SecKeychainItemFreeContent(0,uStack_70);
    }
    else {
      lVar5 = _SecKeychainAddGenericPassword(lVar4,puVar9,auVar11._8_8_,in_x4,lVar5,uVar10,uVar8,0);
    }
    return lVar5;
  }
  puVar9 = &UNK_009c11a0;
  uVar8 = func_0x007a11c0(&UNK_0081a9b0,0x22);
  _CFRelease();
  auVar11 = __Unwind_Resume(uVar8);
  lVar4 = auVar11._8_8_;
  lVar5 = auVar11._0_8_;
  puStack_88 = &__ZN18security_framework6policy9SecPolicy10create_ssl17hb0494bb0374407cfE;
  uStack_b0 = unaff_x22;
  lStack_a8 = unaff_x21;
  uStack_a0 = unaff_x20;
  uStack_98 = uVar8;
  puStack_90 = puVar1;
  if (lVar4 == 0) {
    bVar2 = false;
code_r0x00191a9c:
    if (!bVar2) {
      lVar5 = 0;
    }
    lVar5 = _SecPolicyCreateSSL(auVar11._0_4_ == 0,lVar5);
    if (lVar5 == 0) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11b8);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x191b00);
      (*pcVar3)();
    }
    if (lVar4 != 0) {
      func_0x0019fb28(&lStack_b8);
    }
    return lVar5;
  }
  if ((long)puVar9 < 0) {
    func_0x007a11c0(&UNK_0081aa9c,0x12,&UNK_009c0e88);
  }
  else {
    lVar5 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,lVar4);
    if (lVar5 != 0) {
      bVar2 = true;
      lStack_b8 = lVar5;
      goto code_r0x00191a9c;
    }
  }
  uVar8 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
  if (lStack_c0 != 0) {
    func_0x0019fb28(unaff_x21 + 8);
  }
  __Unwind_Resume(uVar8);
  func_0x007a2668();
  lVar5 = _SecPolicyCreateRevocation();
  if (lVar5 == 0) {
    extraout_x8[1] = 0xffffffce;
  }
  else {
    *(long *)(extraout_x8 + 2) = lVar5;
  }
  *extraout_x8 = (uint)(lVar5 == 0);
  return lVar5;
}

