
void FUN_0040d574(void)

{
  code *pcVar1;
  
  func_0x007a1f00(8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x40ded4);
  (*pcVar1)();
}

