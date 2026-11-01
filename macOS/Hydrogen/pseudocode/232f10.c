
void FUN_00232f10(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  
  func_0x007a28b0(param_4,0x20,param_1);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x232f5c);
  (*pcVar1)();
}

