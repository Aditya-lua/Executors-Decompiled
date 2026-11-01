
void FUN_0056a2b0(void)

{
  code *pcVar1;
  
  func_0x007a05dc();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar1)();
}

