
void FUN_0063c4d0(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  
  func_0x0000a968();
  func_0x0003a638(&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018);
  func_0x0003a638(unaff_x29 + -0x38,&uStack0000000000000030,"\'");
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x63c53c);
  (*pcVar1)();
}

