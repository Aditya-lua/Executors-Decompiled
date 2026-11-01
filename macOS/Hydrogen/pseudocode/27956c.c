
void FUN_0027956c(long param_1)

{
  code *pcVar1;
  long unaff_x19;
  long unaff_x20;
  undefined1 uStack0000000000000050;
  
  while (param_1 = param_1 + 1, unaff_x19 != param_1) {
    *(undefined1 *)(unaff_x20 + param_1) = 0;
  }
  func_0x00187bd4();
  func_0x007a2810(&UNK_0082dc98,0x2b,&uStack0000000000000050,&UNK_009ccdc0,&UNK_009cd2e8);
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x2795dc);
  (*pcVar1)();
}

