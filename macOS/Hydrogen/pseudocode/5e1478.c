
void FUN_005e1478(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
  func_0x007a297c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5e14a8);
  (*pcVar1)();
}

