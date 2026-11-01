
void FUN_0054655c(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a23d8(param_1,0x16);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x546fd4);
  (*pcVar1)();
}

