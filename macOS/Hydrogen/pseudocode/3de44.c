
undefined8 FUN_0003de44(long param_1)

{
  code *pcVar1;
  long in_x9;
  undefined1 uStack0000000000000060;
  
  if (in_x9 != param_1) {
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000060);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3df98);
    (*pcVar1)();
  }
  return 1;
}

