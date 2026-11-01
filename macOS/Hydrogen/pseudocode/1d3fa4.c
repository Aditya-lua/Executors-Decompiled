
void FUN_001d3fa4(void)

{
  code *pcVar1;
  undefined8 in_stack_00000028;
  
  func_0x007a1f00(in_stack_00000028);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1d3fd4);
  (*pcVar1)();
}

