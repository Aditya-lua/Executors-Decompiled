
void FUN_0049be7c(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009e2aa8);
  func_0x007a2810(&UNK_0089f5a4,0x37);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
  (*pcVar1)();
}

