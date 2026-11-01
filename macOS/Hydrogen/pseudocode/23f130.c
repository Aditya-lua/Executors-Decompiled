
void FUN_0023f130(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  
  func_0x007a28b0(param_2,0xb,param_1);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x23f178);
  (*pcVar1)();
}

