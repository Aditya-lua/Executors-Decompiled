
void FUN_006625cc(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  
  func_0x0000a968();
  func_0x0003a638(&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,"\'");
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x662644);
  (*pcVar1)();
}

