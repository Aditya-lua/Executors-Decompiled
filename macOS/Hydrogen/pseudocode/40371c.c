
void FUN_0040371c(void)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_008854f9,0x2a,&UNK_009d9650);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4037a0);
  (*pcVar1)();
}

