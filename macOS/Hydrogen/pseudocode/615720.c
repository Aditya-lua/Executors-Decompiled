
void FUN_00615720(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  func_0x0000a968(&uStack0000000000000008);
  func_0x00616068();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x615758);
  (*pcVar1)();
}

