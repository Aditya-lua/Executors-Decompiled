
void FUN_00686ebc(void)

{
  code *pcVar1;
  
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x686ecc);
  (*pcVar1)();
}

