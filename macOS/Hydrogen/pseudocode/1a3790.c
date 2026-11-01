
void FUN_001a3790(void)

{
  code *pcVar1;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  uStack0000000000000028 = in_stack_00000000;
  uStack0000000000000030 = 0;
  func_0x007a1f00(0,in_stack_00000000,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1a37ac);
  (*pcVar1)();
}

