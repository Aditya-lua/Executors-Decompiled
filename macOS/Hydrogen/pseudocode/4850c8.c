
void FUN_004850c8(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009e1508);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

