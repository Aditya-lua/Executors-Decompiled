
long __ZN18security_framework2os5macos11certificate19CertificateProperty5label17hc79ae4954eeaa401E
               (undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined *puVar5;
  ulong uVar6;
  undefined *puVar7;
  undefined8 uVar8;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined *puStack_c0;
  undefined8 uStack_b8;
  undefined8 **ppuStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 *puStack_90;
  undefined *puStack_88;
  undefined8 uStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined8 **ppuStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 *puStack_20;
  undefined *puStack_18;
  
  uStack_58 = *(undefined8 *)PTR__kSecPropertyKeyLabel_009b03e8;
  puStack_50 = (undefined *)0x0;
  iVar2 = _CFDictionaryGetValueIfPresent(*param_1,uStack_58,&puStack_50);
  if (iVar2 != 0) {
    if ((puStack_50 != (undefined *)0x0) && (lVar3 = _CFRetain(), lVar3 != 0)) {
      return lVar3;
    }
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
  }
  puStack_20 = &uStack_58;
  puStack_18 = &DAT_00196e7c;
  puStack_50 = &UNK_009c1230;
  uStack_48 = 1;
  uStack_38 = 1;
  uStack_30 = 0;
  ppuStack_40 = &puStack_20;
  puVar4 = (undefined8 *)func_0x007a2420(&puStack_50,&UNK_009c1240);
  uStack_c8 = *(undefined8 *)PTR__kSecPropertyKeyType_009b03f0;
  uVar8 = *puVar4;
  puStack_c0 = (undefined *)0x0;
  iVar2 = _CFDictionaryGetValueIfPresent(uVar8,uStack_c8,&puStack_c0);
  if (iVar2 == 0) {
LAB_001946a8:
    puStack_90 = &uStack_c8;
    puStack_88 = &DAT_00196e7c;
    puStack_c0 = &UNK_009c1230;
    uStack_b8 = 1;
    uStack_a8 = 1;
    uStack_a0 = 0;
    ppuStack_b0 = &puStack_90;
    func_0x007a2420(&puStack_c0,&UNK_009c1240);
  }
  else {
    if ((puStack_c0 == (undefined *)0x0) || (lVar3 = _CFRetain(), lVar3 == 0)) {
      func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
      goto LAB_001946a8;
    }
    uStack_c8 = *(undefined8 *)PTR__kSecPropertyKeyValue_009b03f8;
    puStack_c0 = (undefined *)0x0;
    lStack_d0 = lVar3;
    iVar2 = _CFDictionaryGetValueIfPresent(uVar8,uStack_c8,&puStack_c0);
    puVar7 = puStack_c0;
    if (iVar2 != 0) {
      if (*(long *)PTR__kSecPropertyTypeSection_009b0400 == 0) {
LAB_00194684:
        puVar7 = &UNK_009c1348;
      }
      else {
        puVar5 = (undefined *)_CFRetain();
        if (puVar5 == (undefined *)0x0) goto LAB_00194684;
        puStack_c0 = puVar5;
        uVar6 = func_0x00193098(lStack_d0,puVar5);
        if ((uVar6 & 1) == 0) {
          func_0x0019fb28(&puStack_c0);
          if ((*(long *)PTR__kSecPropertyTypeString_009b0408 != 0) &&
             (puVar5 = (undefined *)_CFRetain(), puVar5 != (undefined *)0x0)) {
            puStack_c0 = puVar5;
            uVar6 = func_0x00193098(lStack_d0,puVar5);
            if ((uVar6 & 1) == 0) {
              func_0x0019fb28(&puStack_c0);
              lVar3 = 2;
LAB_00194664:
              func_0x0019fb28(&lStack_d0);
              return lVar3;
            }
            func_0x0019fb28(&puStack_c0);
            if ((puVar7 != (undefined *)0x0) && (lVar3 = _CFRetain(puVar7), lVar3 != 0)) {
              lVar3 = 1;
              goto LAB_00194664;
            }
          }
          goto LAB_00194684;
        }
        func_0x0019fb28(&puStack_c0);
        if ((puVar7 != (undefined *)0x0) && (lVar3 = _CFRetain(puVar7), lVar3 != 0)) {
          lVar3 = 0;
          goto LAB_00194664;
        }
        puVar7 = &UNK_009c1378;
      }
      func_0x007a11c0(&UNK_0081b0e0,0x22,puVar7);
      goto LAB_0019473c;
    }
  }
  puStack_90 = &uStack_c8;
  puStack_88 = &DAT_00196e7c;
  puStack_c0 = &UNK_009c1230;
  uStack_b8 = 1;
  uStack_a8 = 1;
  uStack_a0 = 0;
  ppuStack_b0 = &puStack_90;
  func_0x007a2420(&puStack_c0,&UNK_009c1240);
LAB_0019473c:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x194740);
  (*pcVar1)();
}

