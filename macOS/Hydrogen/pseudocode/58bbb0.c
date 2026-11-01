
void FUN_0058bbb0(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  
  uStack0000000000000040 = param_1;
  func_0x007a2420(&uStack0000000000000030,&UNK_009f15c8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x58bbc8);
  (*pcVar1)();
}

