
void FUN_001934bc(long param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  long *extraout_x8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long lStack_48;
  
  if (param_1 != 0) {
    uStack0000000000000008 = param_1;
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
  uVar2 = func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1378);
  _CFRelease(uStack0000000000000008);
  puVar3 = (undefined8 *)__Unwind_Resume(uVar2);
  lVar4 = _SecCertificateCopyNormalizedIssuerSequence(*puVar3);
  if (lVar4 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13c8);
code_r0x00193610:
    uVar2 = 0;
code_r0x00193614:
    func_0x007a1f00(uVar2,unaff_x20,&UNK_009c1360);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19362c);
    (*pcVar1)();
  }
  lStack_48 = lVar4;
  lVar5 = _CFDataGetBytePtr();
  if (lVar5 == 0) {
    unaff_x20 = 0;
    lVar5 = 1;
  }
  else {
    unaff_x20 = _CFDataGetLength(lVar4);
    if (unaff_x20 < 0) goto code_r0x00193610;
    if (unaff_x20 != 0) {
      uVar2 = 1;
      lVar4 = func_0x00187bd0(unaff_x20,1);
      if (lVar4 == 0) goto code_r0x00193614;
      goto code_r0x001935c0;
    }
  }
  lVar4 = 1;
code_r0x001935c0:
  _memcpy(lVar4,lVar5,unaff_x20);
  *extraout_x8 = unaff_x20;
  extraout_x8[1] = lVar4;
  extraout_x8[2] = unaff_x20;
  func_0x0019fb28(&lStack_48);
  return;
}

