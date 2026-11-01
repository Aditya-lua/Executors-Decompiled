
void FUN_00015cfc(void)

{
  code *pcVar1;
  
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x15de0);
  (*pcVar1)();
}

