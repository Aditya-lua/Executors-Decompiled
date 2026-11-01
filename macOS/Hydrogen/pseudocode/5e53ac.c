
void FUN_005e53ac(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  uStack0000000000000038 = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000030 = 8;
  func_0x007a2420(&uStack0000000000000020,&UNK_009f3890);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5e53cc);
  (*pcVar1)();
}

