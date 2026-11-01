
void FUN_003fed0c(void)

{
  code *pcVar1;
  
  func_0x007a2420();
  func_0x007a286c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3fed18);
  (*pcVar1)();
}

