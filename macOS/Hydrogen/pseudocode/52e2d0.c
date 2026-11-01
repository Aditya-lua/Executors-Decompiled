
void FUN_0052e2d0(void)

{
  code *pcVar1;
  
  func_0x007a2810();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52e2f0);
  (*pcVar1)();
}

