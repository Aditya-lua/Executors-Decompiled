
void FUN_00685aac(void)

{
  code *pcVar1;
  
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x685ac8);
  (*pcVar1)();
}

