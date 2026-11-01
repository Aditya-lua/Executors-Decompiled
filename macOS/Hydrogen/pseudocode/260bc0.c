
void FUN_00260bc0(long param_1)

{
  code *pcVar1;
  
  func_0x007a247c(param_1 + 0x7b,0x19,&UNK_009cb0c8);
  func_0x007a1f18(8,0x380);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x260c40);
  (*pcVar1)();
}

