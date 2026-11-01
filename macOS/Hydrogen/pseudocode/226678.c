
void FUN_00226678(void)

{
  code *pcVar1;
  
  func_0x007a1f18(8,200);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x226688);
  (*pcVar1)();
}

