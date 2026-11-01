
void FUN_005a99fc(void)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x007a2810(&UNK_008ae9d5,0x37,unaff_x29 + -0x59,&UNK_009f1cb8,&UNK_009f1c88);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5a9a24);
  (*pcVar1)();
}

