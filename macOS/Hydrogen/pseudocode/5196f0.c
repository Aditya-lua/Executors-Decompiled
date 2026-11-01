
void FUN_005196f0(void)

{
  code *pcVar1;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  uStack0000000000000008 = 1;
  uStack0000000000000010 = 8;
  uStack0000000000000018 = 0;
  uStack0000000000000020 = 0;
  func_0x007a2420();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x51973c);
  (*pcVar1)();
}

