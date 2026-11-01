
void FUN_0004ec6c(long param_1)

{
  code *pcVar1;
  long *in_x9;
  undefined1 uStack0000000000000090;
  
  if (*in_x9 != param_1) {
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000090);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4ec88);
    (*pcVar1)();
  }
  return;
}

