
void FUN_0047d570(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009e1fc8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x47da74);
  (*pcVar1)();
}

