
void thunk_FUN_00542ffc(undefined8 param_1)

{
  code *pcVar1;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = param_1;
  func_0x007a23bc(param_1);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar1)();
}

