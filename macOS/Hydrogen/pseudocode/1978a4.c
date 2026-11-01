
void FUN_001978a4(void)

{
  code *pcVar1;
  
  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1710);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x197934);
  (*pcVar1)();
}

