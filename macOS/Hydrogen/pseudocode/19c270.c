
long FUN_0019c270(undefined8 param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 *puVar12;
  int unaff_w22;
  undefined4 unaff_w23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined4 uStack000000000000001c;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  
  _uStack0000000000000018 = param_1;
  uVar3 = func_0x0019b2bc(uStack0000000000000008,param_1);
  if ((uVar3 & 1) == 0) {
    func_0x0019fb28(&uStack0000000000000018);
  }
  else {
    func_0x0019fb28(&uStack0000000000000018);
  }
  if (unaff_w22 == 0) {
    unaff_w23 = 0x100;
  }
  _uStack0000000000000018 = CONCAT44(uStack000000000000001c,unaff_w23);
  lVar4 = _CFNumberCreate(*unaff_x24,3,&uStack0000000000000018);
  if (lVar4 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1ce8);
    goto code_r0x0019c628;
  }
  uStack0000000000000010 = lVar4;
  puVar5 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (puVar5 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    goto code_r0x0019c628;
  }
  uVar9 = *(undefined8 *)PTR__kSecAttrKeySizeInBits_009b02d0;
  uVar10 = *(undefined8 *)PTR__kSecPrivateKeyAttrs_009b03e0;
  uVar11 = *(undefined8 *)PTR__kSecPublicKeyAttrs_009b0410;
  *puVar5 = *(undefined8 *)PTR__kSecAttrKeyType_009b02d8;
  puVar5[1] = uStack0000000000000008;
  puVar5[2] = uVar9;
  puVar5[3] = uStack0000000000000010;
  puVar5[4] = uVar10;
  puVar5[5] = unaff_x19;
  puVar5[6] = uVar11;
  puVar5[7] = unaff_x20;
  _uStack0000000000000018 = 4;
  in_stack_00000028 = 4;
  in_stack_00000020 = puVar5;
  if (*(long *)(unaff_x21 + 0x30) == -0x8000000000000000) {
    in_stack_00000030 = 0;
    lVar4 = in_stack_00000028;
joined_r0x0019c3c4:
    in_stack_00000028 = lVar4;
    if ((unaff_x25 != 2) && ((unaff_x25 & 1) != 0)) {
      uVar9 = *(undefined8 *)PTR__kSecUseKeychain_009b0428;
      uVar10 = *(undefined8 *)(unaff_x21 + 0x28);
      if (lVar4 == _uStack0000000000000018) {
        func_0x0019275c(&uStack0000000000000018,&UNK_009c1d30);
      }
      in_stack_00000020[lVar4 * 2] = uVar9;
      (in_stack_00000020 + lVar4 * 2)[1] = uVar10;
      in_stack_00000028 = lVar4 + 1;
    }
    lVar4 = in_stack_00000028;
    if ((*(byte *)(unaff_x21 + 0x50) & 1) != 0) {
      uVar9 = *(undefined8 *)PTR__kSecAttrTokenID_009b0330;
      uVar10 = *(undefined8 *)PTR__kSecAttrTokenIDSecureEnclave_009b0338;
      if (in_stack_00000028 == _uStack0000000000000018) {
        func_0x0019275c(&uStack0000000000000018,&UNK_009c1d48);
      }
      in_stack_00000020[lVar4 * 2] = uVar9;
      (in_stack_00000020 + lVar4 * 2)[1] = uVar10;
      in_stack_00000028 = lVar4 + 1;
    }
    lVar4 = in_stack_00000028;
    puVar5 = in_stack_00000020;
    lVar6 = _CFDictionaryCreateMutable
                      (*unaff_x24,in_stack_00000028,PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                       PTR__kCFTypeDictionaryValueCallBacks_009b0268);
    if (lVar6 == 0) {
      func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
    }
    else {
      if (lVar4 != 0) {
        puVar12 = puVar5;
        do {
          puVar1 = puVar12 + 2;
          _CFDictionaryAddValue(lVar6,*puVar12,puVar12[1]);
          puVar12 = puVar1;
        } while (puVar1 != puVar5 + lVar4 * 2);
      }
      lVar4 = _CFRetain(lVar6);
      if (lVar4 != 0) {
        if (in_stack_00000030 != 0) {
          func_0x0019fb28(&uStack0000000000000038);
        }
        if (_uStack0000000000000018 != 0) {
          func_0x00187bd4(in_stack_00000020,_uStack0000000000000018 << 4,8);
        }
        func_0x0019fb28(&uStack0000000000000010);
        func_0x0019fb28(&uStack0000000000000008);
        _CFRelease();
        _CFRelease();
        func_0x0019fb28();
        _CFRelease(lVar6);
        return lVar4;
      }
      func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
    }
  }
  else {
    if (*(long *)(unaff_x21 + 0x40) < 0) {
      puVar8 = &UNK_009c1c70;
      uVar9 = 0x12;
      puVar7 = &UNK_0081c83c;
    }
    else {
      lVar6 = _CFStringCreateWithBytes
                        (*unaff_x24,*(undefined8 *)(unaff_x21 + 0x38),*(long *)(unaff_x21 + 0x40),
                         0x8000100,0);
      lVar4 = in_stack_00000028;
      if (lVar6 != 0) {
        in_stack_00000030 = 1;
        uVar9 = *(undefined8 *)PTR__kSecAttrLabel_009b02f8;
        uStack0000000000000038 = lVar6;
        if (in_stack_00000028 == _uStack0000000000000018) {
          func_0x0019275c(&uStack0000000000000018,&UNK_009c1d18);
        }
        in_stack_00000020[lVar4 * 2] = uVar9;
        (in_stack_00000020 + lVar4 * 2)[1] = lVar6;
        lVar4 = lVar4 + 1;
        goto joined_r0x0019c3c4;
      }
      puVar8 = &UNK_009c1c58;
      uVar9 = 0x22;
      puVar7 = &UNK_0081c6e6;
    }
    func_0x007a11c0(puVar7,uVar9,puVar8);
  }
code_r0x0019c628:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar2)();
}

