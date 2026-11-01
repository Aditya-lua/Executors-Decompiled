
void FUN_004aa5c0(void)

{
  code *pcVar1;
  
  func_0x007a05dc();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4aa5d0);
  (*pcVar1)();
}

