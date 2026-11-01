
void FUN_001d9b50(void)

{
  code *pcVar1;
  
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1d9b7c);
  (*pcVar1)();
}

