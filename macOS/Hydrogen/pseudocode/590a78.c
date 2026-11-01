
void FUN_00590a78(long param_1)

{
  code *pcVar1;
  
  func_0x007a23d8(param_1 + 0xc1c,0x16,&UNK_009f13b0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x590a90);
  (*pcVar1)();
}

