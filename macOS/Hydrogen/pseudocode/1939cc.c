
void FUN_001939cc(void)

{
  undefined *puVar1;
  code *pcVar2;
  bool in_ZR;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong *unaff_x21;
  char *pcVar6;
  ulong uVar7;
  ulong unaff_x23;
  bool bVar8;
  undefined8 uVar9;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  puVar1 = PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8;
  if (!in_ZR) {
    if ((*(long *)PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8 != 0) &&
       (uVar7 = _CFRetain(), uVar7 != 0)) {
      uStack0000000000000018 = uVar7;
      uVar7 = func_0x00193098(in_stack_00000000,uVar7);
      if ((uVar7 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      else {
        func_0x0019fb28(&uStack0000000000000018);
        if ((int)unaff_x23 == 0x100) {
          bVar8 = false;
          pcVar6 = s_0Y0___H_____H___B_008db06a;
          unaff_x23 = 0x1a;
          goto LAB_00193a9c;
        }
      }
      if ((*(long *)puVar1 != 0) && (uVar7 = _CFRetain(), uVar7 != 0)) {
        uStack0000000000000018 = uVar7;
        uVar7 = func_0x00193098(in_stack_00000000,uVar7);
        if ((uVar7 & 1) == 0) {
          func_0x0019fb28(&uStack0000000000000018);
        }
        else {
          func_0x0019fb28(&uStack0000000000000018);
          if ((int)unaff_x23 == 0x180) {
            bVar8 = false;
            pcVar6 = &UNK_0081b65e;
            unaff_x23 = 0x17;
            goto LAB_00193a9c;
          }
        }
        pcVar6 = (char *)0x0;
        bVar8 = true;
        goto LAB_00193a9c;
      }
    }
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
    goto code_r0x00193c84;
  }
  bVar8 = false;
  pcVar6 = &UNK_0081b646;
  unaff_x23 = 0x18;
LAB_00193a9c:
  func_0x0019fb28();
  if (!bVar8) {
    uStack0000000000000018 = 0;
    lVar3 = _SecKeyCopyExternalRepresentation();
    if (lVar3 != 0) {
      uStack0000000000000010 = lVar3;
      lVar3 = _CFDataGetLength();
      uVar7 = lVar3 + unaff_x23;
      if ((long)uVar7 < 0) {
        uVar9 = 0;
code_r0x00193c70:
        func_0x007a1f00(uVar9,uVar7,&UNK_009c13f8);
code_r0x00193c84:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x193c88);
        (*pcVar2)();
      }
      if (uVar7 == 0) {
        uVar4 = 1;
      }
      else {
        uVar9 = 1;
        uVar4 = func_0x00187bd0(uVar7,1);
        if (uVar4 == 0) goto code_r0x00193c70;
      }
      in_stack_00000028 = 0;
      uStack0000000000000018 = uVar7;
      in_stack_00000020 = uVar4;
      if (uVar7 < unaff_x23) {
        func_0x0079ab9c(&uStack0000000000000018,0,unaff_x23,1,1);
      }
      lVar3 = in_stack_00000028;
      uVar7 = in_stack_00000020;
      _memcpy(in_stack_00000020 + in_stack_00000028,pcVar6,unaff_x23);
      lVar3 = lVar3 + unaff_x23;
      in_stack_00000028 = lVar3;
      lVar5 = _CFDataGetBytePtr(uStack0000000000000010);
      if (lVar5 == 0) {
        in_stack_00000008 = 0;
        lVar5 = 1;
      }
      else {
        in_stack_00000008 = _CFDataGetLength(uStack0000000000000010);
        if (uStack0000000000000018 - lVar3 < in_stack_00000008) {
          func_0x0079ab9c(&uStack0000000000000018,lVar3,in_stack_00000008,1,1);
          lVar3 = in_stack_00000028;
          uVar7 = in_stack_00000020;
        }
      }
      _memcpy(uVar7 + lVar3,lVar5,in_stack_00000008);
      uVar7 = uStack0000000000000018;
      in_stack_00000008 = lVar3 + in_stack_00000008;
      in_stack_00000000 = in_stack_00000020;
      in_stack_00000028 = in_stack_00000008;
      func_0x0019fb28(&uStack0000000000000010);
      goto LAB_00193afc;
    }
  }
  uVar7 = 0x8000000000000000;
LAB_00193afc:
  _CFRelease();
  _CFRelease();
  *unaff_x21 = uVar7;
  unaff_x21[2] = in_stack_00000008;
  unaff_x21[1] = in_stack_00000000;
  return;
}

