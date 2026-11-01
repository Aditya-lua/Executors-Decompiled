
void FUN_00420638(long param_1)

{
  code *pcVar1;
  undefined8 uStack0000000000000010;
  long lStack0000000000000018;
  undefined *puStack0000000000000020;
  
  lStack0000000000000018 = param_1 + 0xf5;
  uStack0000000000000010 = 0x19;
  puStack0000000000000020 = &UNK_009d9300;
  func_0x007a23d8(lStack0000000000000018,0x19,&UNK_009d9300);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x420660);
  (*pcVar1)();
}

