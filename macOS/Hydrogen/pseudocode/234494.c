
void FUN_00234494(void)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x007a2810();
  func_0x007a2810(&UNK_0082910f,0x12,unaff_x29 + -0x90,&UNK_009c8a18,&UNK_009c8d60);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x234508);
  (*pcVar1)();
}

