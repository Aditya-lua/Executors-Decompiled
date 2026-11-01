
void FUN_00615724(void)

{
  code *pcVar1;
  
  func_0x0000a968();
  func_0x00616068();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x615758);
  (*pcVar1)();
}

