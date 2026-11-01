
long FUN_001840f8(long param_1)

{
  code *pcVar1;
  
  if (param_1 == 0) {
    func_0x007a1f18(8,0x480);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x184134);
    (*pcVar1)();
  }
  _memcpy();
  return param_1;
}

