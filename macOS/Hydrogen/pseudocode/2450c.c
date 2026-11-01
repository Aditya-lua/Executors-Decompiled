
void FUN_0002450c(void)

{
  code *pcVar1;
  bool in_ZR;
  
  if (in_ZR) {
    return;
  }
  ___stack_chk_fail();
  func_0x00023e84("wstring_convert: to_bytes error");
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x24554);
  (*pcVar1)();
}

