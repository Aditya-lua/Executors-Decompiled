
void FUN_0055d5a8(void)

{
  code *pcVar1;
  
  func_0x007a23bc();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x55d5dc);
  (*pcVar1)();
}

