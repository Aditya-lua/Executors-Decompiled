
void FUN_006372cc(void)

{
  code *pcVar1;
  
  func_0x0003a638();
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x637300);
  (*pcVar1)();
}

