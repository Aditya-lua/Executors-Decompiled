
void FUN_004e3e10(void)

{
  code *pcVar1;
  undefined8 in_stack_00000010;
  undefined8 in_stack_000000b8;
  
  func_0x007a1f00(in_stack_00000010,in_stack_000000b8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
  (*pcVar1)();
}

