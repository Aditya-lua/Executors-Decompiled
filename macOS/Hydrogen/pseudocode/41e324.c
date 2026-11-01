
void FUN_0041e324(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000020;
  
  func_0x007a2420(&uStack0000000000000020);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x41e330);
  (*pcVar1)();
}

