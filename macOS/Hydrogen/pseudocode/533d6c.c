
void FUN_00533d6c(void)

{
  code *pcVar1;
  
  func_0x007a2570();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

