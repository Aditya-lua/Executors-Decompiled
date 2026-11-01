
void FUN_003fdc74(void)

{
  code *pcVar1;
  bool in_ZR;
  long in_x9;
  long in_x12;
  
  if (in_ZR && in_x9 == in_x12) {
    return;
  }
  func_0x007a286c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3fdcd0);
  (*pcVar1)();
}

