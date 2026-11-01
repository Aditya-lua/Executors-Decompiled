
void FUN_004fb4d0(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a23d8(param_1,0x1f);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4fb4dc);
  (*pcVar1)();
}

