
void FUN_0018c8cc(void)

{
  code *pcVar1;
  
  func_0x007a1f00();
  func_0x007a1f00(0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x18c8c4);
  (*pcVar1)();
}

