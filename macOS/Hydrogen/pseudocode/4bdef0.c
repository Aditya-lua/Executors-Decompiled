
void FUN_004bdef0(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009e5e08);
  func_0x007a23bc(&UNK_009e5e20);
  func_0x007a1f18(8,0x108);
  func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4bdf34);
  (*pcVar1)();
}

