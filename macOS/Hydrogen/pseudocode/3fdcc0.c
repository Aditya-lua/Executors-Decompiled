
void FUN_003fdcc0(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000040;
  
  func_0x007a2420(&uStack0000000000000040);
  func_0x007a286c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3fdcd0);
  (*pcVar1)();
}

