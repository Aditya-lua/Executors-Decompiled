
void FUN_0019363c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  long *extraout_x8;
  long unaff_x20;
  undefined8 uVar5;
  long lStack_48;
  
  __Unwind_Resume();
  puVar2 = (undefined8 *)func_0x007a2668();
  lVar3 = _SecCertificateCopyNormalizedSubjectSequence(*puVar2);
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13c8);
code_r0x00193718:
    uVar5 = 0;
code_r0x0019371c:
    func_0x007a1f00(uVar5,unaff_x20,&UNK_009c1360);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x193734);
    (*pcVar1)();
  }
  lStack_48 = lVar3;
  lVar4 = _CFDataGetBytePtr();
  if (lVar4 == 0) {
    unaff_x20 = 0;
    lVar4 = 1;
  }
  else {
    unaff_x20 = _CFDataGetLength(lVar3);
    if (unaff_x20 < 0) goto code_r0x00193718;
    if (unaff_x20 != 0) {
      uVar5 = 1;
      lVar3 = func_0x00187bd0(unaff_x20,1);
      if (lVar3 == 0) goto code_r0x0019371c;
      goto code_r0x001936c8;
    }
  }
  lVar3 = 1;
code_r0x001936c8:
  _memcpy(lVar3,lVar4,unaff_x20);
  *extraout_x8 = unaff_x20;
  extraout_x8[1] = lVar3;
  extraout_x8[2] = unaff_x20;
  func_0x0019fb28(&lStack_48);
  return;
}

