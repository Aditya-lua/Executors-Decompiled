
undefined8 FUN_0004b9d8(void)

{
  undefined *puVar1;
  long lVar2;
  code *pcVar3;
  long unaff_x21;
  long unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  _memmove();
  lVar2 = in_stack_00000060;
  puVar1 = uStack0000000000000050;
  *(undefined1 *)(unaff_x23 + unaff_x21) = 0;
  __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE();
  if (lVar2 < 0) {
    __ZdlPv(puVar1);
  }
  func_0x0004eec4(&uStack0000000000000050,&uStack0000000000000018,0x24);
  if (in_stack_000000d0 == 0) {
    func_0x006e644c();
    goto code_r0x0004bb30;
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl(&uStack0000000000000050);
  uStack0000000000000050 = &UNK_009b7a40;
  func_0x0001aa68(&uStack0000000000000058);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000050,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001f0);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
    if (-1 < in_stack_00000048._7_1_) goto code_r0x0004ba90;
LAB_0004bad8:
    __ZdlPv(uStack0000000000000038);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return 0;
    }
  }
  else {
    if (in_stack_00000048._7_1_ < '\0') goto LAB_0004bad8;
code_r0x0004ba90:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return 0;
    }
  }
  ___stack_chk_fail();
  func_0x0001748c(&uStack0000000000000038);
code_r0x0004bb30:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4bb34);
  (*pcVar3)();
}

