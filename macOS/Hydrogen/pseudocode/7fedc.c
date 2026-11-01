
void FUN_0007fedc(void)

{
  code *pcVar1;
  
  func_0x00017f90();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7ff54);
  (*pcVar1)();
}

