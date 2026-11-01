
void FUN_005288d4(void)

{
  code *pcVar1;
  
  func_0x007a23bc(&UNK_009ea778);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52894c);
  (*pcVar1)();
}

