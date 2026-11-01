
void FUN_00592708(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009f1350);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x592718);
  (*pcVar1)();
}

