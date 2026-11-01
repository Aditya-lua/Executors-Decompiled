
void FUN_0061a444(void)

{
  code *pcVar1;
  
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61a474);
  (*pcVar1)();
}

