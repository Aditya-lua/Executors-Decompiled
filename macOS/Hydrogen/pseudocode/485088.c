
void FUN_00485088(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 in_stack_00000040;
  
  func_0x007a2570(param_1,param_2,in_stack_00000040);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

