
void FUN_005134c8(void)

{
  code *pcVar1;
  
  func_0x007a1f00(0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5134c8);
  (*pcVar1)();
}

