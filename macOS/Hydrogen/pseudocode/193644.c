
void __ZN18security_framework11certificate14SecCertificate7subject17h8be508685932276aE
               (long *param_1,undefined8 *param_2)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long unaff_x20;
  undefined8 uVar4;
  long lStack_48;
  
  lVar2 = _SecCertificateCopyNormalizedSubjectSequence(*param_2);
  if (lVar2 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13c8);
code_r0x00193718:
    uVar4 = 0;
code_r0x0019371c:
    func_0x007a1f00(uVar4,unaff_x20,&UNK_009c1360);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x193734);
    (*pcVar1)();
  }
  lStack_48 = lVar2;
  lVar3 = _CFDataGetBytePtr();
  if (lVar3 == 0) {
    unaff_x20 = 0;
    lVar3 = 1;
  }
  else {
    unaff_x20 = _CFDataGetLength(lVar2);
    if (unaff_x20 < 0) goto code_r0x00193718;
    if (unaff_x20 != 0) {
      uVar4 = 1;
      lVar2 = func_0x00187bd0(unaff_x20,1);
      if (lVar2 == 0) goto code_r0x0019371c;
      goto code_r0x001936c8;
    }
  }
  lVar2 = 1;
code_r0x001936c8:
  _memcpy(lVar2,lVar3,unaff_x20);
  *param_1 = unaff_x20;
  param_1[1] = lVar2;
  param_1[2] = unaff_x20;
  func_0x0019fb28(&lStack_48);
  return;
}

