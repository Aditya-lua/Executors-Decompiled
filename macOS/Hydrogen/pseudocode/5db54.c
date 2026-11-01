
void thunk_FUN_0005db5c(void)

{
  code *pcVar1;
  long unaff_x29;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5dc90);
    (*pcVar1)();
  }
  return;
}

