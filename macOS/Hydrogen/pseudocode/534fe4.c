
void FUN_00534fe4(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  
  uStack0000000000000048 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000040 = param_1;
  func_0x007a2420(&uStack0000000000000030);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x534ffc);
  (*pcVar1)();
}

