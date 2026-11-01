
undefined8 FUN_00193ed4(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  undefined4 *extraout_x8;
  undefined4 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 uVar7;
  long lStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 *puStack_a0;
  undefined *puStack_98;
  undefined8 uStack_90;
  undefined1 uStack_81;
  undefined8 uStack_80;
  undefined1 **ppuStack_70;
  undefined *puStack_68;
  long lStack_58;
  undefined8 uStack_50;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  long lStack_28;
  undefined8 uStack_20;
  undefined1 auStack_6 [6];
  
  uVar7 = *param_1;
  lVar3 = _CFDictionaryCreateMutable
                    (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,1,
                     PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                     PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar3 != 0) {
    _CFDictionaryAddValue();
    uVar7 = _SecItemDelete(lVar3);
    _CFRelease(lVar3);
    return uVar7;
  }
  puVar4 = (undefined8 *)func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
  lStack_28 = 0;
  uStack_20 = uVar7;
  uVar5 = _SecIdentityCopyCertificate(*puVar4,&lStack_28);
  if ((int)uVar5 == 0) {
    if (lStack_28 == 0) {
      puVar4 = (undefined8 *)func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13b0);
      uStack_38 = 0x193fc0;
      lStack_58 = 0;
      uStack_50 = uVar7;
      puStack_40 = auStack_6 + -10;
      uVar5 = _SecIdentityCopyPrivateKey(*puVar4,&lStack_58);
      if ((int)uVar5 == 0) {
        if (lStack_58 == 0) {
          puVar4 = (undefined8 *)func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1410);
          puStack_68 = &
                       __ZN129__LT_security_framework__certificate__SecCertificate_u20_as_u20_security_framework__os__macos__certificate__SecCertificateExt_GT_11common_name17h4ab9c4c5c8ce8829E
          ;
          lStack_c8 = 0;
          uStack_80 = uVar7;
          ppuStack_70 = &puStack_40;
          uVar7 = _SecCertificateCopyCommonName(*puVar4,&lStack_c8);
          if ((int)uVar7 != 0) {
            *(int *)(extraout_x8_01 + 1) = (int)uVar7;
            *extraout_x8_01 = 0x8000000000000000;
            return uVar7;
          }
          if (lStack_c8 == 0) {
            func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
          }
          else {
            lStack_c0 = lStack_c8;
            uStack_b8 = 0;
            uStack_b0 = 1;
            uStack_a8 = 0;
            uStack_90 = 0xe0000020;
            puStack_a0 = &uStack_b8;
            puStack_98 = &UNK_009c1288;
            iVar2 = func_0x0019f594(&lStack_c0,&puStack_a0);
            if (iVar2 == 0) {
              extraout_x8_01[1] = uStack_b0;
              *extraout_x8_01 = uStack_b8;
              extraout_x8_01[2] = uStack_a8;
              uVar7 = func_0x0019fb28(&lStack_c0);
              return uVar7;
            }
          }
          func_0x007a2810(&UNK_0081b1e7,0x37,&uStack_81,&UNK_009c12e8,&UNK_009c12b8);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x194110);
          (*pcVar1)();
        }
        uVar6 = 0;
        *(long *)(extraout_x8_00 + 2) = lStack_58;
      }
      else {
        extraout_x8_00[1] = (int)uVar5;
        uVar6 = 1;
      }
      *extraout_x8_00 = uVar6;
      return uVar5;
    }
    uVar6 = 0;
    *(long *)(extraout_x8 + 2) = lStack_28;
  }
  else {
    extraout_x8[1] = (int)uVar5;
    uVar6 = 1;
  }
  *extraout_x8 = uVar6;
  return uVar5;
}

