
void FUN_001a3004(void)

{
  code *pcVar1;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = 0;
  func_0x007a1f00(0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1a3028);
  (*pcVar1)();
}

