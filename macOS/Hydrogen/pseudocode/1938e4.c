
void FUN_001938e4(int param_1)

{
  code *pcVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  undefined *puVar7;
  ulong *unaff_x21;
  char *pcVar8;
  ulong uVar9;
  bool bVar10;
  undefined8 uVar11;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  uVar4 = uStack0000000000000018;
  if (param_1 != 0) {
    uStack0000000000000018 = 0;
    iVar2 = _CFDictionaryGetValueIfPresent();
    uVar9 = uStack0000000000000018;
    if (iVar2 != 0) {
      if (uStack0000000000000018 == 0) {
        puVar7 = &UNK_009c13e0;
      }
      else {
        uStack0000000000000018 = 0;
        uVar3 = _CFNumberGetValue(uVar9,4,&uStack0000000000000018);
        uVar9 = uStack0000000000000018;
        if ((uVar3 & 1) == 0) goto LAB_00193af8;
        if (uVar4 != 0) {
          in_stack_00000000 = _CFRetain(uVar4);
          puVar7 = PTR__kSecAttrKeyTypeRSA_009b02f0;
          if (in_stack_00000000 != 0) {
            if ((*(long *)PTR__kSecAttrKeyTypeRSA_009b02f0 != 0) &&
               (uVar4 = _CFRetain(), uVar4 != 0)) {
              uStack0000000000000018 = uVar4;
              uVar4 = func_0x00193098(in_stack_00000000,uVar4);
              iVar2 = (int)uVar9;
              if ((uVar4 & 1) != 0) {
                func_0x0019fb28(&uStack0000000000000018);
                if (iVar2 != 0x800) goto code_r0x0019399c;
                bVar10 = false;
                pcVar8 = &UNK_0081b62e;
                uVar9 = 0x18;
code_r0x00193a9c:
                func_0x0019fb28();
                if (!bVar10) {
                  uStack0000000000000018 = 0;
                  lVar5 = _SecKeyCopyExternalRepresentation();
                  if (lVar5 != 0) {
                    uStack0000000000000010 = lVar5;
                    lVar5 = _CFDataGetLength();
                    uVar4 = lVar5 + uVar9;
                    if ((long)uVar4 < 0) {
                      uVar11 = 0;
code_r0x00193c70:
                      func_0x007a1f00(uVar11,uVar4,&UNK_009c13f8);
                      goto code_r0x00193c84;
                    }
                    if (uVar4 == 0) {
                      uVar3 = 1;
                    }
                    else {
                      uVar11 = 1;
                      uVar3 = func_0x00187bd0(uVar4,1);
                      if (uVar3 == 0) goto code_r0x00193c70;
                    }
                    in_stack_00000028 = 0;
                    uStack0000000000000018 = uVar4;
                    in_stack_00000020 = uVar3;
                    if (uVar4 < uVar9) {
                      func_0x0079ab9c(&uStack0000000000000018,0,uVar9,1,1);
                    }
                    lVar5 = in_stack_00000028;
                    uVar4 = in_stack_00000020;
                    _memcpy(in_stack_00000020 + in_stack_00000028,pcVar8,uVar9);
                    lVar5 = lVar5 + uVar9;
                    in_stack_00000028 = lVar5;
                    lVar6 = _CFDataGetBytePtr(uStack0000000000000010);
                    if (lVar6 == 0) {
                      in_stack_00000008 = 0;
                      lVar6 = 1;
                    }
                    else {
                      in_stack_00000008 = _CFDataGetLength(uStack0000000000000010);
                      if (uStack0000000000000018 - lVar5 < in_stack_00000008) {
                        func_0x0079ab9c(&uStack0000000000000018,lVar5,in_stack_00000008,1,1);
                        lVar5 = in_stack_00000028;
                        uVar4 = in_stack_00000020;
                      }
                    }
                    _memcpy(uVar4 + lVar5,lVar6,in_stack_00000008);
                    uVar4 = uStack0000000000000018;
                    in_stack_00000008 = lVar5 + in_stack_00000008;
                    in_stack_00000000 = in_stack_00000020;
                    in_stack_00000028 = in_stack_00000008;
                    func_0x0019fb28(&uStack0000000000000010);
                    goto code_r0x00193afc;
                  }
                }
                goto LAB_00193af8;
              }
              func_0x0019fb28(&uStack0000000000000018);
code_r0x0019399c:
              if ((*(long *)puVar7 != 0) && (uVar4 = _CFRetain(), uVar4 != 0)) {
                uStack0000000000000018 = uVar4;
                uVar4 = func_0x00193098(in_stack_00000000,uVar4);
                if ((uVar4 & 1) == 0) {
                  func_0x0019fb28(&uStack0000000000000018);
                }
                else {
                  func_0x0019fb28(&uStack0000000000000018);
                  if (iVar2 == 0x1000) {
                    bVar10 = false;
                    pcVar8 = &UNK_0081b646;
                    uVar9 = 0x18;
                    goto code_r0x00193a9c;
                  }
                }
                puVar7 = PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8;
                if ((*(long *)PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8 != 0) &&
                   (uVar4 = _CFRetain(), uVar4 != 0)) {
                  uStack0000000000000018 = uVar4;
                  uVar4 = func_0x00193098(in_stack_00000000,uVar4);
                  if ((uVar4 & 1) == 0) {
                    func_0x0019fb28(&uStack0000000000000018);
                  }
                  else {
                    func_0x0019fb28(&uStack0000000000000018);
                    if (iVar2 == 0x100) {
                      bVar10 = false;
                      pcVar8 = s_0Y0___H_____H___B_008db06a;
                      uVar9 = 0x1a;
                      goto code_r0x00193a9c;
                    }
                  }
                  if ((*(long *)puVar7 != 0) && (uVar4 = _CFRetain(), uVar4 != 0)) {
                    uStack0000000000000018 = uVar4;
                    uVar4 = func_0x00193098(in_stack_00000000,uVar4);
                    if ((uVar4 & 1) == 0) {
                      func_0x0019fb28(&uStack0000000000000018);
                    }
                    else {
                      func_0x0019fb28(&uStack0000000000000018);
                      if (iVar2 == 0x180) {
                        bVar10 = false;
                        pcVar8 = &UNK_0081b65e;
                        uVar9 = 0x17;
                        goto code_r0x00193a9c;
                      }
                    }
                    pcVar8 = (char *)0x0;
                    bVar10 = true;
                    goto code_r0x00193a9c;
                  }
                }
              }
            }
            func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
            goto code_r0x00193c84;
          }
        }
        puVar7 = &UNK_009c1348;
      }
      func_0x007a11c0(&UNK_0081b0e0,0x22,puVar7);
code_r0x00193c84:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x193c88);
      (*pcVar1)();
    }
  }
LAB_00193af8:
  uVar4 = 0x8000000000000000;
code_r0x00193afc:
  _CFRelease();
  _CFRelease();
  *unaff_x21 = uVar4;
  unaff_x21[2] = in_stack_00000008;
  unaff_x21[1] = in_stack_00000000;
  return;
}

