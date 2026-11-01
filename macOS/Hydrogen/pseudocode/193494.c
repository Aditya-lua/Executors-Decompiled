
void FUN_00193494(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  long *extraout_x8;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long lStack_48;
  
  lStack0000000000000000 = 0;
  iVar2 = _SecCertificateCopyEmailAddresses(*param_1);
  if (iVar2 != 0) {
    *(int *)(unaff_x19 + 1) = iVar2;
    *unaff_x19 = 0x8000000000000000;
    return;
  }
  if (lStack0000000000000000 != 0) {
    uStack0000000000000008 = lStack0000000000000000;
    in_stack_00000038 = _CFArrayGetCount();
    uStack0000000000000028 = &uStack0000000000000008;
    in_stack_00000030 = 0;
    func_0x0018bf40(&uStack0000000000000010,&uStack0000000000000028,&UNK_009c12d0);
    unaff_x19[1] = in_stack_00000018;
    *unaff_x19 = uStack0000000000000010;
    unaff_x19[2] = in_stack_00000020;
    _CFRelease(uStack0000000000000008);
    return;
  }
  uVar3 = func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1378);
  _CFRelease(uStack0000000000000008);
  puVar4 = (undefined8 *)__Unwind_Resume(uVar3);
  lVar5 = _SecCertificateCopyNormalizedIssuerSequence(*puVar4);
  if (lVar5 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13c8);
code_r0x00193610:
    uVar3 = 0;
code_r0x00193614:
    func_0x007a1f00(uVar3,unaff_x20,&UNK_009c1360);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19362c);
    (*pcVar1)();
  }
  lStack_48 = lVar5;
  lVar6 = _CFDataGetBytePtr();
  if (lVar6 == 0) {
    unaff_x20 = 0;
    lVar6 = 1;
  }
  else {
    unaff_x20 = _CFDataGetLength(lVar5);
    if (unaff_x20 < 0) goto code_r0x00193610;
    if (unaff_x20 != 0) {
      uVar3 = 1;
      lVar5 = func_0x00187bd0(unaff_x20,1);
      if (lVar5 == 0) goto code_r0x00193614;
      goto code_r0x001935c0;
    }
  }
  lVar5 = 1;
code_r0x001935c0:
  _memcpy(lVar5,lVar6,unaff_x20);
  *extraout_x8 = unaff_x20;
  extraout_x8[1] = lVar5;
  extraout_x8[2] = unaff_x20;
  func_0x0019fb28(&lStack_48);
  return;
}

