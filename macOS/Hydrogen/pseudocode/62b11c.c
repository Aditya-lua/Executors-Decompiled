
void FUN_0062b11c(void)

{
  code *pcVar1;
  
  func_0x00017f90();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x62b124);
  (*pcVar1)();
}

