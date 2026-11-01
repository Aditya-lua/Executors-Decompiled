
void FUN_00594d00(void)

{
  code *pcVar1;
  
  func_0x007a2570();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x594d0c);
  (*pcVar1)();
}

