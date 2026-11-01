
void FUN_00428660(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009dc290);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4286ac);
  (*pcVar1)();
}

