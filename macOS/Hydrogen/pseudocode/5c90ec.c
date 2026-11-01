
void FUN_005c90ec(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a1f18(param_1,0x60);
  func_0x007a23bc(&UNK_009f27f8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5c9104);
  (*pcVar1)();
}

