
void FUN_0019b358(undefined8 param_1)

{
  code *pcVar1;
  
  func_0x007a11c0(param_1,0x22);
  func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c28);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19b37c);
  (*pcVar1)();
}

