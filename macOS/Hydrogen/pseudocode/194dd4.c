
undefined1  [16] FUN_00194dd4(void)

{
  long lVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000008;
  long in_stack_00000018;
  
  lVar1 = in_stack_00000018;
  if (in_stack_00000018 == 0) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c15f0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x194e48);
    (*pcVar2)();
  }
  func_0x0019fb28(&uStack0000000000000008);
  _CFRelease();
  auVar3._8_8_ = lVar1;
  auVar3._0_8_ = 1;
  return auVar3;
}

