
void FUN_0019c5c4(long param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1 + 0x21,0x22,&UNK_009c07c0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar1)();
}

