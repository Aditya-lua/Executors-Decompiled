
void FUN_00250a30(void)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_00829fec,0x28,&UNK_009ca3b0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x250a4c);
  (*pcVar1)();
}

