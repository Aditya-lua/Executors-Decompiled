
void FUN_0041bbf4(void)

{
  code *pcVar1;
  
  func_0x007a28a4();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x41bbfc);
  (*pcVar1)();
}

