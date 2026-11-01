
void FUN_00437f14(void)

{
  code *pcVar1;
  
  func_0x007a26e4();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x437f1c);
  (*pcVar1)();
}

