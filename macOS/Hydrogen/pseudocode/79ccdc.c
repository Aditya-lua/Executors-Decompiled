
void FUN_0079ccdc(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 *puStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000038;
  
  _uStack0000000000000008 = &UNK_009c82b8;
  uStack0000000000000010 = 1;
  puStack0000000000000018 = &uStack0000000000000038;
  uStack0000000000000020 = 0;
  uStack0000000000000028 = 0;
  func_0x007a2420(&uStack0000000000000008,&UNK_009c82c8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x79cd1c);
  (*pcVar1)();
}

