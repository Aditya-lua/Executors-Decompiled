
void FUN_0023ead0(void)

{
  code *pcVar1;
  
  func_0x007a247c();
  func_0x007a1f18(8,0x28);
  func_0x007a23bc(&UNK_009c99b8);
  func_0x007a1f18(8,0x88);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x23eb6c);
  (*pcVar1)();
}

