
void __ZN18security_framework11certificate14SecCertificate19public_key_info_der17hf387866cdc00f0d6E
               (ulong *param_1)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  undefined *puVar8;
  char *pcVar9;
  ulong uVar10;
  bool bVar11;
  undefined8 uVar12;
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined8 uStack_68;
  ulong uStack_60;
  ulong uStack_58;
  
  func_0x00193d50(&uStack_68);
  uVar1 = uStack_60;
  if ((int)uStack_68 == 1) {
    *(undefined4 *)(param_1 + 1) = uStack_68._4_4_;
    *param_1 = 0x8000000000000001;
    return;
  }
  lVar4 = _SecKeyCopyAttributes(uStack_60);
  if (lVar4 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
    goto code_r0x00193c84;
  }
  uStack_68 = 0;
  iVar3 = _CFDictionaryGetValueIfPresent
                    (lVar4,*(undefined8 *)PTR__kSecAttrKeyType_009b02d8,&uStack_68);
  uVar6 = uStack_68;
  if (iVar3 != 0) {
    uStack_68 = 0;
    iVar3 = _CFDictionaryGetValueIfPresent
                      (lVar4,*(undefined8 *)PTR__kSecAttrKeySizeInBits_009b02d0,&uStack_68);
    uVar10 = uStack_68;
    if (iVar3 != 0) {
      if (uStack_68 == 0) {
        puVar8 = &UNK_009c13e0;
      }
      else {
        uStack_68 = 0;
        uVar5 = _CFNumberGetValue(uVar10,4,&uStack_68);
        uVar10 = uStack_68;
        if ((uVar5 & 1) == 0) goto LAB_00193af8;
        if (uVar6 != 0) {
          uVar6 = _CFRetain(uVar6);
          puVar8 = PTR__kSecAttrKeyTypeRSA_009b02f0;
          if (uVar6 != 0) {
            uStack_80 = uVar6;
            if ((*(long *)PTR__kSecAttrKeyTypeRSA_009b02f0 != 0) &&
               (uVar5 = _CFRetain(), uVar5 != 0)) {
              uStack_68 = uVar5;
              uVar6 = func_0x00193098(uVar6,uVar5);
              iVar3 = (int)uVar10;
              if ((uVar6 & 1) != 0) {
                func_0x0019fb28(&uStack_68);
                if (iVar3 != 0x800) goto code_r0x0019399c;
                bVar11 = false;
                pcVar9 = &UNK_0081b62e;
                uVar10 = 0x18;
code_r0x00193a9c:
                func_0x0019fb28(&uStack_80);
                if (!bVar11) {
                  uStack_68 = 0;
                  lVar7 = _SecKeyCopyExternalRepresentation(uVar1,&uStack_68);
                  if (lVar7 != 0) {
                    lStack_70 = lVar7;
                    lVar7 = _CFDataGetLength();
                    uVar6 = lVar7 + uVar10;
                    if ((long)uVar6 < 0) {
                      uVar12 = 0;
code_r0x00193c70:
                      func_0x007a1f00(uVar12,uVar6,&UNK_009c13f8);
                      goto code_r0x00193c84;
                    }
                    if (uVar6 == 0) {
                      uStack_60 = 1;
                    }
                    else {
                      uVar12 = 1;
                      uStack_60 = func_0x00187bd0(uVar6,1);
                      if (uStack_60 == 0) goto code_r0x00193c70;
                    }
                    uStack_58 = 0;
                    uStack_68 = uVar6;
                    if (uVar6 < uVar10) {
                      func_0x0079ab9c(&uStack_68,0,uVar10,1,1);
                    }
                    uVar5 = uStack_58;
                    uVar6 = uStack_60;
                    _memcpy(uStack_60 + uStack_58,pcVar9,uVar10);
                    uVar5 = uVar5 + uVar10;
                    uStack_58 = uVar5;
                    lVar7 = _CFDataGetBytePtr(lStack_70);
                    if (lVar7 == 0) {
                      uVar10 = 0;
                      lVar7 = 1;
                    }
                    else {
                      uVar10 = _CFDataGetLength(lStack_70);
                      if (uStack_68 - uVar5 < uVar10) {
                        func_0x0079ab9c(&uStack_68,uVar5,uVar10,1,1);
                        uVar5 = uStack_58;
                        uVar6 = uStack_60;
                      }
                    }
                    _memcpy(uVar6 + uVar5,lVar7,uVar10);
                    uVar6 = uStack_68;
                    uStack_78 = uVar5 + uVar10;
                    uStack_80 = uStack_60;
                    uStack_58 = uStack_78;
                    func_0x0019fb28(&lStack_70);
                    goto code_r0x00193afc;
                  }
                }
                goto LAB_00193af8;
              }
              func_0x0019fb28(&uStack_68);
code_r0x0019399c:
              if ((*(long *)puVar8 != 0) && (uVar6 = _CFRetain(), uVar6 != 0)) {
                uStack_68 = uVar6;
                uVar6 = func_0x00193098(uStack_80,uVar6);
                if ((uVar6 & 1) == 0) {
                  func_0x0019fb28(&uStack_68);
                }
                else {
                  func_0x0019fb28(&uStack_68);
                  if (iVar3 == 0x1000) {
                    bVar11 = false;
                    pcVar9 = &UNK_0081b646;
                    uVar10 = 0x18;
                    goto code_r0x00193a9c;
                  }
                }
                puVar8 = PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8;
                if ((*(long *)PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8 != 0) &&
                   (uVar6 = _CFRetain(), uVar6 != 0)) {
                  uStack_68 = uVar6;
                  uVar6 = func_0x00193098(uStack_80,uVar6);
                  if ((uVar6 & 1) == 0) {
                    func_0x0019fb28(&uStack_68);
                  }
                  else {
                    func_0x0019fb28(&uStack_68);
                    if (iVar3 == 0x100) {
                      bVar11 = false;
                      pcVar9 = s_0Y0___H_____H___B_008db06a;
                      uVar10 = 0x1a;
                      goto code_r0x00193a9c;
                    }
                  }
                  if ((*(long *)puVar8 != 0) && (uVar6 = _CFRetain(), uVar6 != 0)) {
                    uStack_68 = uVar6;
                    uVar6 = func_0x00193098(uStack_80,uVar6);
                    if ((uVar6 & 1) == 0) {
                      func_0x0019fb28(&uStack_68);
                    }
                    else {
                      func_0x0019fb28(&uStack_68);
                      if (iVar3 == 0x180) {
                        bVar11 = false;
                        pcVar9 = &UNK_0081b65e;
                        uVar10 = 0x17;
                        goto code_r0x00193a9c;
                      }
                    }
                    pcVar9 = (char *)0x0;
                    bVar11 = true;
                    goto code_r0x00193a9c;
                  }
                }
              }
            }
            func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
            goto code_r0x00193c84;
          }
        }
        puVar8 = &UNK_009c1348;
      }
      func_0x007a11c0(&UNK_0081b0e0,0x22,puVar8);
code_r0x00193c84:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x193c88);
      (*pcVar2)();
    }
  }
LAB_00193af8:
  uVar6 = 0x8000000000000000;
code_r0x00193afc:
  _CFRelease(lVar4);
  _CFRelease(uVar1);
  *param_1 = uVar6;
  param_1[2] = uStack_78;
  param_1[1] = uStack_80;
  return;
}

