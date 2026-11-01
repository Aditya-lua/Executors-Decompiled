
void FUN_007250a8(void)

{
  code *pcVar1;
  
  func_0x00017f90();
  func_0x0001748c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7250b8);
  (*pcVar1)();
}

