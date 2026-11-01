
void FUN_00205a2c(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000020;
  
  func_0x00202648(&uStack0000000000000020);
  func_0x007a23bc(&UNK_009c62d8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x205a44);
  (*pcVar1)();
}

