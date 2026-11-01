
void FUN_005a6f98(void)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_008ae948);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5a6fc0);
  (*pcVar1)();
}

