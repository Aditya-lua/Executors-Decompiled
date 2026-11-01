
void FUN_00533de0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000058;
  
  uStack0000000000000058 = param_1;
  func_0x007a2570(param_2,param_3,in_stack_00000020);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar1)();
}

