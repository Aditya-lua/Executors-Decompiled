
void FUN_0056a0a8(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009ee848);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar1)();
}

