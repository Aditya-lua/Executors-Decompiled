
void FUN_005feb6c(void)

{
  code *pcVar1;
  
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5feb98);
  (*pcVar1)();
}

