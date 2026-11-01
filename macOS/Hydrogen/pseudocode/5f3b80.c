
void FUN_005f3b80(void)

{
  code *pcVar1;
  
  func_0x0003a638();
  func_0x005f3d74();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f3bb4);
  (*pcVar1)();
}

