
long FUN_0019c1e4(void)

{
  undefined8 *puVar1;
  long *plVar2;
  int iVar3;
  int iVar4;
  code *pcVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined *puVar10;
  undefined *puVar11;
  int iVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  int *unaff_x21;
  undefined8 *puVar16;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  
  _CFDictionaryAddValue();
  puVar10 = PTR__kSecAttrKeyTypeRSA_009b02f0;
  plVar2 = (long *)(unaff_x21 + 2);
  if (*unaff_x21 == 0) {
    plVar2 = (long *)PTR__kSecAttrKeyTypeRSA_009b02f0;
  }
  if ((*plVar2 == 0) || (lVar6 = _CFRetain(), lVar6 == 0)) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
    goto code_r0x0019c628;
  }
  uStack0000000000000008 = lVar6;
  if (*(long *)puVar10 == 0) {
LAB_0019c534:
    puVar10 = &UNK_009c1c58;
  }
  else {
    iVar3 = unaff_x21[0x12];
    iVar4 = unaff_x21[0x13];
    lVar6 = _CFRetain();
    if (lVar6 == 0) goto LAB_0019c534;
    uStack0000000000000018 = lVar6;
    uVar7 = func_0x0019b2bc(uStack0000000000000008,lVar6);
    if ((uVar7 & 1) == 0) {
      func_0x0019fb28(&uStack0000000000000018);
      if ((*(long *)PTR__kSecAttrKeyTypeEC_009b02e0 == 0) || (lVar6 = _CFRetain(), lVar6 == 0))
      goto LAB_0019c534;
      uStack0000000000000018 = lVar6;
      uVar7 = func_0x0019b2bc(uStack0000000000000008,lVar6);
      if ((uVar7 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      else {
        func_0x0019fb28(&uStack0000000000000018);
      }
      iVar12 = 0x100;
    }
    else {
      func_0x0019fb28(&uStack0000000000000018);
      iVar12 = 0x800;
    }
    if (iVar3 == 0) {
      iVar4 = iVar12;
    }
    uStack0000000000000018 = CONCAT44(uStack0000000000000018._4_4_,iVar4);
    lVar6 = _CFNumberCreate(*unaff_x24,3,&uStack0000000000000018);
    if (lVar6 != 0) {
      uStack0000000000000010 = lVar6;
      puVar8 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar8 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto code_r0x0019c628;
      }
      uVar13 = *(undefined8 *)PTR__kSecAttrKeySizeInBits_009b02d0;
      uVar14 = *(undefined8 *)PTR__kSecPrivateKeyAttrs_009b03e0;
      uVar15 = *(undefined8 *)PTR__kSecPublicKeyAttrs_009b0410;
      *puVar8 = *(undefined8 *)PTR__kSecAttrKeyType_009b02d8;
      puVar8[1] = uStack0000000000000008;
      puVar8[2] = uVar13;
      puVar8[3] = uStack0000000000000010;
      puVar8[4] = uVar14;
      puVar8[5] = unaff_x19;
      puVar8[6] = uVar15;
      puVar8[7] = unaff_x20;
      uStack0000000000000018 = 4;
      in_stack_00000028 = 4;
      in_stack_00000020 = puVar8;
      if (*(long *)(unaff_x21 + 0xc) == -0x8000000000000000) {
        in_stack_00000030 = 0;
        lVar6 = in_stack_00000028;
joined_r0x0019c3c4:
        in_stack_00000028 = lVar6;
        if ((unaff_x25 != 2) && ((unaff_x25 & 1) != 0)) {
          uVar13 = *(undefined8 *)PTR__kSecUseKeychain_009b0428;
          uVar14 = *(undefined8 *)(unaff_x21 + 10);
          if (lVar6 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d30);
          }
          in_stack_00000020[lVar6 * 2] = uVar13;
          (in_stack_00000020 + lVar6 * 2)[1] = uVar14;
          in_stack_00000028 = lVar6 + 1;
        }
        lVar6 = in_stack_00000028;
        if ((*(byte *)(unaff_x21 + 0x14) & 1) != 0) {
          uVar13 = *(undefined8 *)PTR__kSecAttrTokenID_009b0330;
          uVar14 = *(undefined8 *)PTR__kSecAttrTokenIDSecureEnclave_009b0338;
          if (in_stack_00000028 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d48);
          }
          in_stack_00000020[lVar6 * 2] = uVar13;
          (in_stack_00000020 + lVar6 * 2)[1] = uVar14;
          in_stack_00000028 = lVar6 + 1;
        }
        lVar6 = in_stack_00000028;
        puVar8 = in_stack_00000020;
        lVar9 = _CFDictionaryCreateMutable
                          (*unaff_x24,in_stack_00000028,PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                           PTR__kCFTypeDictionaryValueCallBacks_009b0268);
        if (lVar9 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
        }
        else {
          if (lVar6 != 0) {
            puVar16 = puVar8;
            do {
              puVar1 = puVar16 + 2;
              _CFDictionaryAddValue(lVar9,*puVar16,puVar16[1]);
              puVar16 = puVar1;
            } while (puVar1 != puVar8 + lVar6 * 2);
          }
          lVar6 = _CFRetain(lVar9);
          if (lVar6 != 0) {
            if (in_stack_00000030 != 0) {
              func_0x0019fb28(&uStack0000000000000038);
            }
            if (uStack0000000000000018 != 0) {
              func_0x00187bd4(in_stack_00000020,uStack0000000000000018 << 4,8);
            }
            func_0x0019fb28(&uStack0000000000000010);
            func_0x0019fb28(&uStack0000000000000008);
            _CFRelease();
            _CFRelease();
            func_0x0019fb28();
            _CFRelease(lVar9);
            return lVar6;
          }
          func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
        }
      }
      else {
        if (*(long *)(unaff_x21 + 0x10) < 0) {
          puVar11 = &UNK_009c1c70;
          uVar13 = 0x12;
          puVar10 = &UNK_0081c83c;
        }
        else {
          lVar9 = _CFStringCreateWithBytes
                            (*unaff_x24,*(undefined8 *)(unaff_x21 + 0xe),*(long *)(unaff_x21 + 0x10)
                             ,0x8000100,0);
          lVar6 = in_stack_00000028;
          if (lVar9 != 0) {
            in_stack_00000030 = 1;
            uVar13 = *(undefined8 *)PTR__kSecAttrLabel_009b02f8;
            uStack0000000000000038 = lVar9;
            if (in_stack_00000028 == uStack0000000000000018) {
              func_0x0019275c(&uStack0000000000000018,&UNK_009c1d18);
            }
            in_stack_00000020[lVar6 * 2] = uVar13;
            (in_stack_00000020 + lVar6 * 2)[1] = lVar9;
            lVar6 = lVar6 + 1;
            goto joined_r0x0019c3c4;
          }
          puVar11 = &UNK_009c1c58;
          uVar13 = 0x22;
          puVar10 = &UNK_0081c6e6;
        }
        func_0x007a11c0(puVar10,uVar13,puVar11);
      }
      goto code_r0x0019c628;
    }
    puVar10 = &UNK_009c1ce8;
  }
  func_0x007a11c0(&UNK_0081c6e6,0x22,puVar10);
code_r0x0019c628:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar5)();
}

