
void FUN_00053058(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000028;
  
  func_0x0001748c(&uStack0000000000000028);
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5308c);
  (*pcVar1)();
}

