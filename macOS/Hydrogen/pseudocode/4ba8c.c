
undefined8 FUN_0004ba8c(void)

{
  code *pcVar1;
  int in_w8;
  long unaff_x29;
  undefined8 uStack0000000000000038;
  
  if (in_w8 < 0) {
    __ZdlPv(uStack0000000000000038);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) goto LAB_0004baf8;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
LAB_0004baf8:
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000038);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bb34);
    (*pcVar1)();
  }
  return 0;
}

