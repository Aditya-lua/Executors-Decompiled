
void FUN_0020cfa8(void)

{
  code *pcVar1;
  undefined8 in_stack_00000000;
  
  func_0x007a1f00(8,in_stack_00000000,&UNK_009c6470);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x20cfc0);
  (*pcVar1)();
}

