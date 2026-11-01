
void FUN_004850e0(void)

{
  code *pcVar1;
  
  func_0x007a2570();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

