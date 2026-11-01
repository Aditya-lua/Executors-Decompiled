
undefined8 FUN_0004be08(void)

{
  code *pcVar1;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000060;
  undefined8 uStack00000000000001e0;
  
  __ZNSt3__18ios_base5clearEj
            ((long)&uStack0000000000000040 + *(long *)((long)uStack0000000000000040 + -0x18),
             *(uint *)(&uStack0000000000000060 + *(long *)((long)uStack0000000000000040 + -0x18)) |
             4);
  uStack0000000000000040 = &UNK_009b7a40;
  uStack00000000000001e0 = &UNK_009b7a68;
  func_0x0001aa68();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001e0);
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) goto LAB_0004bedc;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
LAB_0004bedc:
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bf00);
    (*pcVar1)();
  }
  return 0;
}

