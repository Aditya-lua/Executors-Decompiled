
void FUN_00275fe0(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x275fec);
  (*pcVar1)();
}

