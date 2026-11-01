
void FUN_0019570c(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1,0x22);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x195734);
  (*pcVar1)();
}

