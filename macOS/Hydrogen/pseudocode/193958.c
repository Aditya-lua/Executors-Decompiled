
void FUN_00193958(ulong param_1)

{
  undefined *puVar1;
  code *pcVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong *unaff_x21;
  char *pcVar7;
  int iVar8;
  ulong unaff_x23;
  bool bVar9;
  long *unaff_x24;
  undefined8 uVar10;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  if (param_1 != 0) {
    uStack0000000000000018 = param_1;
    uVar3 = func_0x00193098();
    iVar8 = (int)unaff_x23;
    if ((uVar3 & 1) != 0) {
      func_0x0019fb28(&uStack0000000000000018);
      if (iVar8 != 0x800) goto LAB_0019399c;
      bVar9 = false;
      pcVar7 = &UNK_0081b62e;
      unaff_x23 = 0x18;
LAB_00193a9c:
      func_0x0019fb28();
      if (!bVar9) {
        uStack0000000000000018 = 0;
        lVar4 = _SecKeyCopyExternalRepresentation();
        if (lVar4 != 0) {
          uStack0000000000000010 = lVar4;
          lVar4 = _CFDataGetLength();
          uVar3 = lVar4 + unaff_x23;
          if (-1 < (long)uVar3) {
            if (uVar3 == 0) {
              uVar5 = 1;
            }
            else {
              uVar10 = 1;
              uVar5 = func_0x00187bd0(uVar3,1);
              if (uVar5 == 0) goto code_r0x00193c70;
            }
            in_stack_00000028 = 0;
            uStack0000000000000018 = uVar3;
            in_stack_00000020 = uVar5;
            if (uVar3 < unaff_x23) {
              func_0x0079ab9c(&uStack0000000000000018,0,unaff_x23,1,1);
            }
            lVar4 = in_stack_00000028;
            uVar3 = in_stack_00000020;
            _memcpy(in_stack_00000020 + in_stack_00000028,pcVar7,unaff_x23);
            lVar4 = lVar4 + unaff_x23;
            in_stack_00000028 = lVar4;
            lVar6 = _CFDataGetBytePtr(uStack0000000000000010);
            if (lVar6 == 0) {
              in_stack_00000008 = 0;
              lVar6 = 1;
            }
            else {
              in_stack_00000008 = _CFDataGetLength(uStack0000000000000010);
              if (uStack0000000000000018 - lVar4 < in_stack_00000008) {
                func_0x0079ab9c(&uStack0000000000000018,lVar4,in_stack_00000008,1,1);
                lVar4 = in_stack_00000028;
                uVar3 = in_stack_00000020;
              }
            }
            _memcpy(uVar3 + lVar4,lVar6,in_stack_00000008);
            uVar3 = uStack0000000000000018;
            in_stack_00000008 = lVar4 + in_stack_00000008;
            in_stack_00000000 = in_stack_00000020;
            in_stack_00000028 = in_stack_00000008;
            func_0x0019fb28(&uStack0000000000000010);
            goto LAB_00193afc;
          }
          uVar10 = 0;
code_r0x00193c70:
          func_0x007a1f00(uVar10,uVar3,&UNK_009c13f8);
          goto code_r0x00193c84;
        }
      }
      uVar3 = 0x8000000000000000;
LAB_00193afc:
      _CFRelease();
      _CFRelease();
      *unaff_x21 = uVar3;
      unaff_x21[2] = in_stack_00000008;
      unaff_x21[1] = in_stack_00000000;
      return;
    }
    func_0x0019fb28(&uStack0000000000000018);
LAB_0019399c:
    if ((*unaff_x24 != 0) && (uVar3 = _CFRetain(), uVar3 != 0)) {
      uStack0000000000000018 = uVar3;
      uVar3 = func_0x00193098(in_stack_00000000,uVar3);
      if ((uVar3 & 1) == 0) {
        func_0x0019fb28(&uStack0000000000000018);
      }
      else {
        func_0x0019fb28(&uStack0000000000000018);
        if (iVar8 == 0x1000) {
          bVar9 = false;
          pcVar7 = &UNK_0081b646;
          unaff_x23 = 0x18;
          goto LAB_00193a9c;
        }
      }
      puVar1 = PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8;
      if ((*(long *)PTR__kSecAttrKeyTypeECSECPrimeRandom_009b02e8 != 0) &&
         (uVar3 = _CFRetain(), uVar3 != 0)) {
        uStack0000000000000018 = uVar3;
        uVar3 = func_0x00193098(in_stack_00000000,uVar3);
        if ((uVar3 & 1) == 0) {
          func_0x0019fb28(&uStack0000000000000018);
        }
        else {
          func_0x0019fb28(&uStack0000000000000018);
          if (iVar8 == 0x100) {
            bVar9 = false;
            pcVar7 = s_0Y0___H_____H___B_008db06a;
            unaff_x23 = 0x1a;
            goto LAB_00193a9c;
          }
        }
        if ((*(long *)puVar1 != 0) && (uVar3 = _CFRetain(), uVar3 != 0)) {
          uStack0000000000000018 = uVar3;
          uVar3 = func_0x00193098(in_stack_00000000,uVar3);
          if ((uVar3 & 1) == 0) {
            func_0x0019fb28(&uStack0000000000000018);
          }
          else {
            func_0x0019fb28(&uStack0000000000000018);
            if (iVar8 == 0x180) {
              bVar9 = false;
              pcVar7 = &UNK_0081b65e;
              unaff_x23 = 0x17;
              goto LAB_00193a9c;
            }
          }
          pcVar7 = (char *)0x0;
          bVar9 = true;
          goto LAB_00193a9c;
        }
      }
    }
  }
  func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
code_r0x00193c84:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x193c88);
  (*pcVar2)();
}

