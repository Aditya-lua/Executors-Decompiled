
void FUN_000832b0(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000010;
  
  func_0x00083520(0xca,&uStack0000000000000010);
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x8339c);
  (*pcVar1)();
}

