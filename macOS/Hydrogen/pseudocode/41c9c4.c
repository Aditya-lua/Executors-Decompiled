
void FUN_0041c9c4(void)

{
  code *pcVar1;
  
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x41c9f4);
  (*pcVar1)();
}

