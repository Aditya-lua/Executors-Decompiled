
void FUN_00688a44(void)

{
  code *pcVar1;
  
  func_0x0000a968();
  func_0x005f3728();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x688a78);
  (*pcVar1)();
}

