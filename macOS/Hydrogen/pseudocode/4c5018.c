
void FUN_004c5018(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009e6120);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

