
void FUN_005293c8(void)

{
  code *pcVar1;
  
  func_0x007a2570();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5293d4);
  (*pcVar1)();
}

