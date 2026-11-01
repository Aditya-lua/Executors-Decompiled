
void FUN_005f02d8(void)

{
  code *pcVar1;
  
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f0300);
  (*pcVar1)();
}

