
void FUN_00533df4(undefined8 param_1)

{
  code *pcVar1;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined *puStack0000000000000018;
  undefined8 uStack0000000000000058;
  
  puStack0000000000000018 = &UNK_009eb930;
  uStack0000000000000058 = param_1;
  func_0x007a1f00(in_stack_00000008,in_stack_00000010,&UNK_009eb930);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

