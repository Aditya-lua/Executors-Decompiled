
void FUN_00086d5c(void)

{
  code *pcVar1;
  
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x86d6c);
  (*pcVar1)();
}

