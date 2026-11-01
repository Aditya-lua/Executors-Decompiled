
void FUN_006772bc(void)

{
  code *pcVar1;
  
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x6772d4);
  (*pcVar1)();
}

