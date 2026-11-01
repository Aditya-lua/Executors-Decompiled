
void FUN_004c50f8(void)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_008a24aa,0x20);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

