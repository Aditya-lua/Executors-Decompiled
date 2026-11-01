
void FUN_0049be94(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a2810(param_1,0x37);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
  (*pcVar1)();
}

