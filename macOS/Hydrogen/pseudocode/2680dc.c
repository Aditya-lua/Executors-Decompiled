
void FUN_002680dc(void)

{
  code *pcVar1;
  
  func_0x007a1f00(8,0x60);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x2680f0);
  (*pcVar1)();
}

