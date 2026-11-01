
void FUN_00196454(long param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1 + 0x7f0,0x22,&UNK_009c1680);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1964dc);
  (*pcVar1)();
}

