
void FUN_0019e244(void)

{
  code *pcVar1;
  
  func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2050);
  func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19e278);
  (*pcVar1)();
}

