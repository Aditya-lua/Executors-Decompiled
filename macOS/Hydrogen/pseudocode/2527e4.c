
void FUN_002527e4(void)

{
  code *pcVar1;
  
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x25281c);
  (*pcVar1)();
}

