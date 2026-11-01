
void FUN_00193a40(void)

{
  code *pcVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong *unaff_x21;
  long *unaff_x22;
  undefined *puVar6;
  ulong unaff_x23;
  bool bVar7;
  undefined8 uVar8;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  
  func_0x0019fb28();
  if ((*unaff_x22 == 0) || (uVar2 = _CFRetain(), uVar2 == 0)) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1348);
    goto code_r0x00193c84;
  }
  uStack0000000000000018 = uVar2;
  uVar2 = func_0x00193098(in_stack_00000000,uVar2);
  if ((uVar2 & 1) == 0) {
    func_0x0019fb28(&uStack0000000000000018);
LAB_00193a94:
    puVar6 = (undefined *)0x0;
    bVar7 = true;
  }
  else {
    func_0x0019fb28(&uStack0000000000000018);
    if ((int)unaff_x23 != 0x180) goto LAB_00193a94;
    bVar7 = false;
    puVar6 = &UNK_0081b65e;
    unaff_x23 = 0x17;
  }
  func_0x0019fb28();
  if (!bVar7) {
    uStack0000000000000018 = 0;
    lVar3 = _SecKeyCopyExternalRepresentation();
    if (lVar3 != 0) {
      uStack0000000000000010 = lVar3;
      lVar3 = _CFDataGetLength();
      uVar2 = lVar3 + unaff_x23;
      if ((long)uVar2 < 0) {
        uVar8 = 0;
LAB_00193c70:
        func_0x007a1f00(uVar8,uVar2,&UNK_009c13f8);
code_r0x00193c84:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x193c88);
        (*pcVar1)();
      }
      if (uVar2 == 0) {
        uVar4 = 1;
      }
      else {
        uVar8 = 1;
        uVar4 = func_0x00187bd0(uVar2,1);
        if (uVar4 == 0) goto LAB_00193c70;
      }
      in_stack_00000028 = 0;
      uStack0000000000000018 = uVar2;
      in_stack_00000020 = uVar4;
      if (uVar2 < unaff_x23) {
        func_0x0079ab9c(&uStack0000000000000018,0,unaff_x23,1,1);
      }
      lVar3 = in_stack_00000028;
      uVar2 = in_stack_00000020;
      _memcpy(in_stack_00000020 + in_stack_00000028,puVar6,unaff_x23);
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
          uVar2 = in_stack_00000020;
        }
      }
      _memcpy(uVar2 + lVar3,lVar5,in_stack_00000008);
      uVar2 = uStack0000000000000018;
      in_stack_00000008 = lVar3 + in_stack_00000008;
      in_stack_00000000 = in_stack_00000020;
      in_stack_00000028 = in_stack_00000008;
      func_0x0019fb28(&uStack0000000000000010);
      goto code_r0x00193afc;
    }
  }
  uVar2 = 0x8000000000000000;
code_r0x00193afc:
  _CFRelease();
  _CFRelease();
  *unaff_x21 = uVar2;
  unaff_x21[2] = in_stack_00000008;
  unaff_x21[1] = in_stack_00000000;
  return;
}

