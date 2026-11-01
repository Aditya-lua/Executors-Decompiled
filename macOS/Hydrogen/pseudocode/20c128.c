
void FUN_0020c128(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a2810(param_1,0x16);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x20c154);
  (*pcVar1)();
}

