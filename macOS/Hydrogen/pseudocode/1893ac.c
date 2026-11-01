
void FUN_001893ac(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a1f18(param_1,0x38);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1893b8);
  (*pcVar1)();
}

