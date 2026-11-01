
void FUN_000215c8(void)

{
  code *pcVar1;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  
  func_0x00023f98(&uStack0000000000000030,&uStack0000000000000060);
  func_0x006eceb0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x21610);
  (*pcVar1)();
}

