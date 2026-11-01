
void FUN_0004d338(void)

{
  code *pcVar1;
  
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar1)();
}

