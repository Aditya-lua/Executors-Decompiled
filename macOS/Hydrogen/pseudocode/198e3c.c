
void FUN_00198e3c(long param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1 + 0xf7,0x22);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x198e6c);
  (*pcVar1)();
}

