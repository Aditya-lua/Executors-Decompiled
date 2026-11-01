
void FUN_0058f980(void)

{
  code *pcVar1;
  
  func_0x007a23d8();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x58f954);
  (*pcVar1)();
}

