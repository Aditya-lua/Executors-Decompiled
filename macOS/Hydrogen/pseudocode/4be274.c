
void FUN_004be274(long param_1)

{
  code *pcVar1;
  
  func_0x007a23bc(param_1 + 0xe68);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4be2ac);
  (*pcVar1)();
}

