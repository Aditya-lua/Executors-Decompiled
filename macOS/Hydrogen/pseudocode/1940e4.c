
void FUN_001940e4(void)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x007a11c0();
  func_0x007a2810(&UNK_0081b1e7,0x37,unaff_x29 + -0x11,&UNK_009c12e8,&UNK_009c12b8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x194110);
  (*pcVar1)();
}

