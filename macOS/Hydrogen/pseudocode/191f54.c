
void FUN_00191f54(void)

{
  code *pcVar1;
  
  func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x192024);
  (*pcVar1)();
}

