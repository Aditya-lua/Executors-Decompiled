
void FUN_00705c4c(void)

{
  code *pcVar1;
  
  func_0x0001748c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x705c64);
  (*pcVar1)();
}

