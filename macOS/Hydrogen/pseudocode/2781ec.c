
void FUN_002781ec(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a2810(param_1,0x2b);
  func_0x007a28b0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x278224);
  (*pcVar1)();
}

