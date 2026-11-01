
void FUN_0003cc4c(void)

{
  code *pcVar1;
  
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3cd8c);
  (*pcVar1)();
}

