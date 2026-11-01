
void FUN_00533dbc(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined *puStack0000000000000020;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000098;
  
  puStack0000000000000020 = &UNK_009eb918;
  uStack0000000000000058 = in_stack_00000098;
  func_0x007a2570(param_1,param_2,&UNK_009eb918);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

