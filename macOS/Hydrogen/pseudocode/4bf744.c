
void FUN_004bf744(void)

{
  code *pcVar1;
  
  func_0x007a23bc();
  func_0x007a23bc(&UNK_009e6060);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4bf7c4);
  (*pcVar1)();
}

