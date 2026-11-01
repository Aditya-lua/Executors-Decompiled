
long FUN_0019c20c(void)

{
  undefined8 *puVar1;
  int iVar2;
  undefined4 uVar3;
  code *pcVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined *puVar9;
  undefined *puVar10;
  undefined4 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 *puVar15;
  long *unaff_x22;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  
  lVar5 = _CFRetain();
  if (lVar5 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
    goto code_r0x0019c628;
  }
  uStack0000000000000008 = lVar5;
  if (*unaff_x22 == 0) {
LAB_0019c534:
    puVar9 = &UNK_009c1c58;
  }
  else {
    iVar2 = *(int *)(unaff_x21 + 0x48);
    uVar3 = *(undefined4 *)(unaff_x21 + 0x4c);
    lVar5 = _CFRetain();
    if (lVar5 == 0) goto LAB_0019c534;
    uStack0000000000000018 = lVar5;
    uVar6 = func_0x0019b2bc(uStack0000000000000008,lVar5);
    if ((uVar6 & 1) == 0) {
      func_0x0019fb28(&uStack0000000000000018);
      if ((*(long *)PTR__kSecAttrKeyTypeEC_009b02e0 == 0) || (lVar5 = _CFRetain(), lVar5 == 0))
      goto LAB_0019c534;
      uStack0000000000000018 = lVar5;
      uVar6 = func_0x0019b2bc(uStack0000000000000008,lVar5);
      if ((uVar6 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      else {
        func_0x0019fb28(&uStack0000000000000018);
      }
      uVar11 = 0x100;
    }
    else {
      func_0x0019fb28(&uStack0000000000000018);
      uVar11 = 0x800;
    }
    if (iVar2 == 0) {
      uVar3 = uVar11;
    }
    uStack0000000000000018 = CONCAT44(uStack0000000000000018._4_4_,uVar3);
    lVar5 = _CFNumberCreate(*unaff_x24,3,&uStack0000000000000018);
    if (lVar5 != 0) {
      uStack0000000000000010 = lVar5;
      puVar7 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar7 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto code_r0x0019c628;
      }
      uVar12 = *(undefined8 *)PTR__kSecAttrKeySizeInBits_009b02d0;
      uVar13 = *(undefined8 *)PTR__kSecPrivateKeyAttrs_009b03e0;
      uVar14 = *(undefined8 *)PTR__kSecPublicKeyAttrs_009b0410;
      *puVar7 = *(undefined8 *)PTR__kSecAttrKeyType_009b02d8;
      puVar7[1] = uStack0000000000000008;
      puVar7[2] = uVar12;
      puVar7[3] = uStack0000000000000010;
      puVar7[4] = uVar13;
      puVar7[5] = unaff_x19;
      puVar7[6] = uVar14;
      puVar7[7] = unaff_x20;
      uStack0000000000000018 = 4;
      in_stack_00000028 = 4;
      in_stack_00000020 = puVar7;
      if (*(long *)(unaff_x21 + 0x30) == -0x8000000000000000) {
        in_stack_00000030 = 0;
        lVar5 = in_stack_00000028;
joined_r0x0019c3c4:
        in_stack_00000028 = lVar5;
        if ((unaff_x25 != 2) && ((unaff_x25 & 1) != 0)) {
          uVar12 = *(undefined8 *)PTR__kSecUseKeychain_009b0428;
          uVar13 = *(undefined8 *)(unaff_x21 + 0x28);
          if (lVar5 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d30);
          }
          in_stack_00000020[lVar5 * 2] = uVar12;
          (in_stack_00000020 + lVar5 * 2)[1] = uVar13;
          in_stack_00000028 = lVar5 + 1;
        }
        lVar5 = in_stack_00000028;
        if ((*(byte *)(unaff_x21 + 0x50) & 1) != 0) {
          uVar12 = *(undefined8 *)PTR__kSecAttrTokenID_009b0330;
          uVar13 = *(undefined8 *)PTR__kSecAttrTokenIDSecureEnclave_009b0338;
          if (in_stack_00000028 == uStack0000000000000018) {
            func_0x0019275c(&uStack0000000000000018,&UNK_009c1d48);
          }
          in_stack_00000020[lVar5 * 2] = uVar12;
          (in_stack_00000020 + lVar5 * 2)[1] = uVar13;
          in_stack_00000028 = lVar5 + 1;
        }
        lVar5 = in_stack_00000028;
        puVar7 = in_stack_00000020;
        lVar8 = _CFDictionaryCreateMutable
                          (*unaff_x24,in_stack_00000028,PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                           PTR__kCFTypeDictionaryValueCallBacks_009b0268);
        if (lVar8 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
        }
        else {
          if (lVar5 != 0) {
            puVar15 = puVar7;
            do {
              puVar1 = puVar15 + 2;
              _CFDictionaryAddValue(lVar8,*puVar15,puVar15[1]);
              puVar15 = puVar1;
            } while (puVar1 != puVar7 + lVar5 * 2);
          }
          lVar5 = _CFRetain(lVar8);
          if (lVar5 != 0) {
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
            _CFRelease(lVar8);
            return lVar5;
          }
          func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
        }
      }
      else {
        if (*(long *)(unaff_x21 + 0x40) < 0) {
          puVar10 = &UNK_009c1c70;
          uVar12 = 0x12;
          puVar9 = &UNK_0081c83c;
        }
        else {
          lVar8 = _CFStringCreateWithBytes
                            (*unaff_x24,*(undefined8 *)(unaff_x21 + 0x38),
                             *(long *)(unaff_x21 + 0x40),0x8000100,0);
          lVar5 = in_stack_00000028;
          if (lVar8 != 0) {
            in_stack_00000030 = 1;
            uVar12 = *(undefined8 *)PTR__kSecAttrLabel_009b02f8;
            uStack0000000000000038 = lVar8;
            if (in_stack_00000028 == uStack0000000000000018) {
              func_0x0019275c(&uStack0000000000000018,&UNK_009c1d18);
            }
            in_stack_00000020[lVar5 * 2] = uVar12;
            (in_stack_00000020 + lVar5 * 2)[1] = lVar8;
            lVar5 = lVar5 + 1;
            goto joined_r0x0019c3c4;
          }
          puVar10 = &UNK_009c1c58;
          uVar12 = 0x22;
          puVar9 = &UNK_0081c6e6;
        }
        func_0x007a11c0(puVar9,uVar12,puVar10);
      }
      goto code_r0x0019c628;
    }
    puVar9 = &UNK_009c1ce8;
  }
  func_0x007a11c0(&UNK_0081c6e6,0x22,puVar9);
code_r0x0019c628:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar4)();
}

