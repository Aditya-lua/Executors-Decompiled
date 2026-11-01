
void FUN_004dedd0(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a2810(param_1,0x37);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4dede8);
  (*pcVar1)();
}

