
undefined8 FUN_0004b4e0(void)

{
  code *pcVar1;
  long unaff_x20;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  char cStack0000000000000047;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000058;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  cStack0000000000000047 = (char)unaff_x20;
  if (unaff_x20 != 0) {
    _memmove(&uStack0000000000000030);
  }
  *(undefined1 *)((long)&uStack0000000000000030 + unaff_x20) = 0;
  func_0x0004dd60(&uStack0000000000000018);
  func_0x0000bffc(&uStack0000000000000048,&uStack0000000000000018,4);
  if (in_stack_000000d0 == 0) {
    func_0x006e644c();
    goto code_r0x0004b68c;
  }
  func_0x0004ed78();
  func_0x006e38d8();
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  uStack0000000000000048 = &UNK_009b2a18;
  func_0x0001aa68(&uStack0000000000000058);
  __ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000048,&UNK_009b2a58);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001f0);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
    if (cStack0000000000000047 < '\0') goto code_r0x0004b64c;
code_r0x0004b608:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 1;
    }
  }
  else {
    if (-1 < cStack0000000000000047) goto code_r0x0004b608;
code_r0x0004b64c:
    __ZdlPv(uStack0000000000000030);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 1;
    }
  }
  ___stack_chk_fail();
  func_0x0001748c(&uStack0000000000000030);
code_r0x0004b68c:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b690);
  (*pcVar1)();
}

