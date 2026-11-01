
void FUN_005f02c8(void)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x0003a638(unaff_x29 + -0x50);
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f0300);
  (*pcVar1)();
}

