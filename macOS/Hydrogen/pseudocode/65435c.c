
void FUN_0065435c(void)

{
  code *pcVar1;
  
  func_0x00017f90();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x654364);
  (*pcVar1)();
}

