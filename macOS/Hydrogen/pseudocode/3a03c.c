
undefined8 FUN_0003a03c(void)

{
  code *pcVar1;
  long unaff_x29;
  long in_stack_00000010;
  
  func_0x006f410c();
  if (in_stack_00000010 != 0) {
    __ZdlPv();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    ___stack_chk_fail();
    func_0x006e63b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3a168);
    (*pcVar1)();
  }
  return 1;
}

