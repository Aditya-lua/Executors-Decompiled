
void FUN_006181c4(undefined8 param_1)

{
  code *pcVar1;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  
  func_0x0000a968();
  func_0x0003a638(&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018);
  func_0x0003a638(unaff_x29 + -0x38,&uStack0000000000000030,"\'");
  func_0x0002703c(param_1,unaff_x29 + -0x38);
  ___cxa_throw(param_1,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x61823c);
  (*pcVar1)();
}

