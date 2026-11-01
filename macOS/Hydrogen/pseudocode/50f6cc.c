
void FUN_0050f6cc(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x50f6dc);
  (*pcVar1)();
}

