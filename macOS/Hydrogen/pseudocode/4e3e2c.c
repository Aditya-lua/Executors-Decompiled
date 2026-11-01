
void FUN_004e3e2c(void)

{
  code *pcVar1;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_000000b0;
  undefined8 uStack0000000000000100;
  
  uStack0000000000000010 = 0;
  uStack0000000000000100 = in_stack_000000b0;
  func_0x007a1f00(0,in_stack_000000b0,&UNK_009e7fc8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
  (*pcVar1)();
}

