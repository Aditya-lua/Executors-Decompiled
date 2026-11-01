
void FUN_004c5034(void)

{
  code *pcVar1;
  
  func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

