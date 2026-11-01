
void FUN_00590a74(void)

{
  code *pcVar1;
  
  func_0x007a23d8(&UNK_008adc1c,0x16,&UNK_009f13b0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x590a90);
  (*pcVar1)();
}

