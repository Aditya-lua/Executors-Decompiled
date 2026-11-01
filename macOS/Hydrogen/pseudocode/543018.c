
void FUN_00543018(long param_1)

{
  code *pcVar1;
  long lStack0000000000000050;
  
  lStack0000000000000050 = param_1 + 0x6f8;
  func_0x007a23bc(lStack0000000000000050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar1)();
}

