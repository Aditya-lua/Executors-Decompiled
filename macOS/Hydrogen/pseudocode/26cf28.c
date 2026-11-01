
void FUN_0026cf28(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x26cf30);
  (*pcVar1)();
}

