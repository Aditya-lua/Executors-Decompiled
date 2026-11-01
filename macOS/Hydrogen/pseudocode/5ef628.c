
void FUN_005ef628(void)

{
  code *pcVar1;
  
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5ef780);
  (*pcVar1)();
}

