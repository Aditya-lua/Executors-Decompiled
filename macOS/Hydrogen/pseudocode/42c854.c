
void FUN_0042c854(void)

{
  code *pcVar1;
  undefined *puStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  puStack0000000000000000 = &UNK_009db0c8;
  uStack0000000000000008 = 1;
  uStack0000000000000018 = 0;
  uStack0000000000000020 = 0;
  uStack0000000000000010 = 8;
  func_0x007a2420();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x42c884);
  (*pcVar1)();
}

