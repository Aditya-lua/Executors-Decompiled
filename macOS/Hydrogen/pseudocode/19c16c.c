
long FUN_0019c16c(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  long *plVar2;
  int iVar3;
  int iVar4;
  code *pcVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined *puVar12;
  undefined *puVar13;
  int iVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  int *unaff_x21;
  undefined8 *puVar17;
  undefined8 uVar18;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  
  lVar6 = _CFDictionaryCreateMutable
                    (param_1,1,*(undefined8 *)(param_3 + 0x260),
                     PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar6 == 0) {
    func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
    goto code_r0x0019c628;
  }
  _CFDictionaryAddValue();
  if ((unaff_x21[4] & 1U) != 0) {
    _CFDictionarySetValue
              (lVar6,*(undefined8 *)PTR__kSecAttrAccessControl_009b0278,
               *(undefined8 *)(unaff_x21 + 6));
  }
  uVar18 = *unaff_x23;
  lVar7 = _CFDictionaryCreateMutable
                    (*unaff_x24,1,PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                     PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar7 == 0) {
    func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
    goto code_r0x0019c628;
  }
  _CFDictionaryAddValue(lVar7,uVar18,in_stack_00000000);
  puVar12 = PTR__kSecAttrKeyTypeRSA_009b02f0;
  plVar2 = (long *)(unaff_x21 + 2);
  if (*unaff_x21 == 0) {
    plVar2 = (long *)PTR__kSecAttrKeyTypeRSA_009b02f0;
  }
  if ((*plVar2 == 0) || (lVar8 = _CFRetain(), lVar8 == 0)) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
    goto code_r0x0019c628;
  }
  uStack0000000000000008 = lVar8;
  if (*(long *)puVar12 == 0) {
code_r0x0019c534:
    puVar12 = &UNK_009c1c58;
  }
  else {
    iVar3 = unaff_x21[0x12];
    iVar4 = unaff_x21[0x13];
    lVar8 = _CFRetain();
    if (lVar8 == 0) goto code_r0x0019c534;
    uStack0000000000000018 = lVar8;
    uVar9 = func_0x0019b2bc(uStack0000000000000008,lVar8);
    if ((uVar9 & 1) == 0) {
      func_0x0019fb28(&uStack0000000000000018);
      if ((*(long *)PTR__kSecAttrKeyTypeEC_009b02e0 == 0) || (lVar8 = _CFRetain(), lVar8 == 0))
      goto code_r0x0019c534;
      uStack0000000000000018 = lVar8;
      uVar9 = func_0x0019b2bc(uStack0000000000000008,lVar8);
      if ((uVar9 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      else {
        func_0x0019fb28(&uStack0000000000000018);
      }
      iVar14 = 0x100;
    }
    else {
      func_0x0019fb28(&uStack0000000000000018);
      iVar14 = 0x800;
    }
    if (iVar3 == 0) {
      iVar4 = iVar14;
    }
    uStack0000000000000018 = CONCAT44(uStack0000000000000018._4_4_,iVar4);
    lVar8 = _CFNumberCreate(*unaff_x24,3,&uStack0000000000000018);
    if (lVar8 != 0) {
      uStack0000000000000010 = lVar8;
      puVar10 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar10 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto code_r0x0019c628;
      }
      uVar18 = *(undefined8 *)PTR__kSecAttrKeySizeInBits_009b02d0;
      uVar15 = *(undefined8 *)PTR__kSecPrivateKeyAttrs_009b03e0;
      uVar16 = *(undefined8 *)PTR__kSecPublicKeyAttrs_009b0410;
      *puVar10 = *(undefined8 *)PTR__kSecAttrKeyType_009b02d8;
      puVar10[1] = uStack0000000000000008;
      puVar10[2] = uVar18;
      puVar10[3] = uStack0000000000000010;
      puVar10[4] = uVar15;
      puVar10[5] = lVar6;
      puVar10[6] = uVar16;
      puVar10[7] = lVar7;
      uStack0000000000000018 = 4;
      in_stack_00000028 = 4;
      in_stack_00000020 = puVar10;
      if (*(long *)(unaff_x21 + 0xc) == -0x8000000000000000) {
        in_stack_00000030 = 0;
        lVar8 = in_stack_00000028;
joined_r0x0019c3c4:
        in_stack_00000028 = lVar8;
        if ((unaff_x25 != 2) && ((unaff_x25 & 1) != 0)) {
          uVar18 = *(undefined8 *)PTR__kSecUseKeychain_009b0428;
          uVar15 = *(undefined8 *)(unaff_x21 + 10);
          if (lVar8 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d30);
          }
          in_stack_00000020[lVar8 * 2] = uVar18;
          (in_stack_00000020 + lVar8 * 2)[1] = uVar15;
          in_stack_00000028 = lVar8 + 1;
        }
        lVar8 = in_stack_00000028;
        if ((*(byte *)(unaff_x21 + 0x14) & 1) != 0) {
          uVar18 = *(undefined8 *)PTR__kSecAttrTokenID_009b0330;
          uVar15 = *(undefined8 *)PTR__kSecAttrTokenIDSecureEnclave_009b0338;
          if (in_stack_00000028 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d48);
          }
          in_stack_00000020[lVar8 * 2] = uVar18;
          (in_stack_00000020 + lVar8 * 2)[1] = uVar15;
          in_stack_00000028 = lVar8 + 1;
        }
        lVar8 = in_stack_00000028;
        puVar10 = in_stack_00000020;
        lVar11 = _CFDictionaryCreateMutable
                           (*unaff_x24,in_stack_00000028,PTR__kCFTypeDictionaryKeyCallBacks_009b0260
                            ,PTR__kCFTypeDictionaryValueCallBacks_009b0268);
        if (lVar11 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
        }
        else {
          if (lVar8 != 0) {
            puVar17 = puVar10;
            do {
              puVar1 = puVar17 + 2;
              _CFDictionaryAddValue(lVar11,*puVar17,puVar17[1]);
              puVar17 = puVar1;
            } while (puVar1 != puVar10 + lVar8 * 2);
          }
          lVar8 = _CFRetain(lVar11);
          if (lVar8 != 0) {
            if (in_stack_00000030 != 0) {
              func_0x0019fb28(&uStack0000000000000038);
            }
            if (uStack0000000000000018 != 0) {
              func_0x00187bd4(in_stack_00000020,uStack0000000000000018 << 4,8);
            }
            func_0x0019fb28(&uStack0000000000000010);
            func_0x0019fb28(&uStack0000000000000008);
            _CFRelease(lVar7);
            _CFRelease(lVar6);
            func_0x0019fb28();
            _CFRelease(lVar11);
            return lVar8;
          }
          func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
        }
      }
      else {
        if (*(long *)(unaff_x21 + 0x10) < 0) {
          puVar13 = &UNK_009c1c70;
          uVar18 = 0x12;
          puVar12 = &UNK_0081c83c;
        }
        else {
          lVar11 = _CFStringCreateWithBytes
                             (*unaff_x24,*(undefined8 *)(unaff_x21 + 0xe),
                              *(long *)(unaff_x21 + 0x10),0x8000100,0);
          lVar8 = in_stack_00000028;
          if (lVar11 != 0) {
            in_stack_00000030 = 1;
            uVar18 = *(undefined8 *)PTR__kSecAttrLabel_009b02f8;
            uStack0000000000000038 = lVar11;
            if (in_stack_00000028 == uStack0000000000000018) {
              func_0x0019275c(&uStack0000000000000018,&UNK_009c1d18);
            }
            in_stack_00000020[lVar8 * 2] = uVar18;
            (in_stack_00000020 + lVar8 * 2)[1] = lVar11;
            lVar8 = lVar8 + 1;
            goto joined_r0x0019c3c4;
          }
          puVar13 = &UNK_009c1c58;
          uVar18 = 0x22;
          puVar12 = &UNK_0081c6e6;
        }
        func_0x007a11c0(puVar12,uVar18,puVar13);
      }
      goto code_r0x0019c628;
    }
    puVar12 = &UNK_009c1ce8;
  }
  func_0x007a11c0(&UNK_0081c6e6,0x22,puVar12);
code_r0x0019c628:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar5)();
}

