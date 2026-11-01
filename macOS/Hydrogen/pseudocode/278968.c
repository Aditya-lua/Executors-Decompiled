
void FUN_00278968(void)

{
  code *pcVar1;
  ulong unaff_x22;
  long unaff_x29;
  
  func_0x007a2810(&UNK_0082d08a,0x2b,unaff_x29 + -0x90,&UNK_009cc780,&UNK_009cc7d8);
  func_0x00276f14(unaff_x22 | 8);
  func_0x007a2810(&UNK_0082de83,0x16,unaff_x29 + -0x90,&UNK_009ccdc0,&UNK_009cd0d8);
  func_0x007a2810(&UNK_0082de0f,0x14,unaff_x29 + -0x90,&UNK_009ccdc0,&UNK_009cd0c0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x2789e0);
  (*pcVar1)();
}

