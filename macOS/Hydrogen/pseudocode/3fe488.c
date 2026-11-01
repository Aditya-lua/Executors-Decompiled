
void FUN_003fe488(void)

{
  code *pcVar1;
  bool in_ZR;
  
  if (in_ZR) {
    return;
  }
  func_0x007a286c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3fe4e0);
  (*pcVar1)();
}

