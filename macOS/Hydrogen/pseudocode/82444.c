
void FUN_00082444(void)

{
  code *pcVar1;
  
  func_0x00082c0c(0x198);
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x8246c);
  (*pcVar1)();
}

