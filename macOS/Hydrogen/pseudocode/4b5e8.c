
undefined8 FUN_0004b5e8(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000048;
  
  __ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000048);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38))
    goto code_r0x0004b66c;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
code_r0x0004b66c:
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000030);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4b690);
    (*pcVar1)();
  }
  return 1;
}

