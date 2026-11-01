
void FUN_0003d968(long param_1)

{
  code *pcVar1;
  undefined8 in_stack_00000020;
  
  (**(code **)(param_1 + 0x10))();
  func_0x006e644c(in_stack_00000020,"Failed to decode base64 IV (invalid format): %s");
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3da40);
  (*pcVar1)();
}

