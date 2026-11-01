
void FUN_003fdca4(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  uStack0000000000000048 = 1;
  uStack0000000000000058 = 0;
  uStack0000000000000060 = 0;
  uStack0000000000000050 = 8;
  _uStack0000000000000040 = param_1;
  func_0x007a2420(&uStack0000000000000040,&UNK_009d9328);
  func_0x007a286c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3fdcd0);
  (*pcVar1)();
}

