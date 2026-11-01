
void FUN_0065ebb4(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  
  uVar2 = ___cxa_allocate_exception();
  func_0x0000a968();
  func_0x0003a638(&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018);
  func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,"\'");
  func_0x0002703c(uVar2,&uStack0000000000000048);
  ___cxa_throw(uVar2,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x65ec38);
  (*pcVar1)();
}

