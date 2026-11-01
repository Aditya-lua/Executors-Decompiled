
undefined1  [16] FUN_0019421c(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x19;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  long in_stack_00000008;
  
  lVar2 = _SecCertificateCopyValues();
  if (in_stack_00000008 == 0) {
    if (lVar2 == 0) {
      func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1218);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x194290);
      (*pcVar1)();
    }
    uVar3 = 0;
    in_stack_00000008 = lVar2;
  }
  else {
    uVar3 = 1;
  }
  if (unaff_x19 != 0) {
    _CFRelease();
  }
  auVar4._8_8_ = in_stack_00000008;
  auVar4._0_8_ = uVar3;
  return auVar4;
}

