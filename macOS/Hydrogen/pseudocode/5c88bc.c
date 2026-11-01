
void FUN_005c88bc(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000030;
  
  func_0x007a2810(&UNK_008b56a9,0x37,&uStack0000000000000030,&UNK_009f2748,&UNK_009f2730);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5c88e4);
  (*pcVar1)();
}

