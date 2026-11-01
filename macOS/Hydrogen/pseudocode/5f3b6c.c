
void FUN_005f3b6c(void)

{
  code *pcVar1;
  code *in_x9;
  undefined1 uStack0000000000000018;
  
  (*in_x9)();
  func_0x0003a638(&uStack0000000000000018);
  func_0x005f3d74();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f3bb4);
  (*pcVar1)();
}

