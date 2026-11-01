
void FUN_00427b60(void)

{
  code *pcVar1;
  
  func_0x007a2810();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x427b94);
  (*pcVar1)();
}

