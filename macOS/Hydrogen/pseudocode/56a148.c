
void FUN_0056a148(long param_1)

{
  code *pcVar1;
  
  func_0x007a23bc(param_1 + 0x5d8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar1)();
}

