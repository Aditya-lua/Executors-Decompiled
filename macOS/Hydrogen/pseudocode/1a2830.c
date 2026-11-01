
void thunk_FUN_001a2854(void)

{
  code *pcVar1;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000010;
  
  func_0x007a1f00(in_stack_00000000,in_stack_00000010,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1a286c);
  (*pcVar1)();
}

