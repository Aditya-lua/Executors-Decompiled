
void FUN_0071157c(void)

{
  code *pcVar1;
  
  func_0x0070f408();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x711584);
  (*pcVar1)();
}

