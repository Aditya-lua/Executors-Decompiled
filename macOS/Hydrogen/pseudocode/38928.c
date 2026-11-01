
void FUN_00038928(void)

{
  code *pcVar1;
  
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3896c);
  (*pcVar1)();
}

