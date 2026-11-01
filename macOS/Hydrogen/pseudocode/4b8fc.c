
undefined8 FUN_0004b8fc(undefined *param_1)

{
  ulong uVar1;
  undefined *puVar2;
  code *pcVar3;
  undefined *puVar4;
  ulong uVar5;
  uint uVar6;
  long unaff_x21;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined7 uStack0000000000000060;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  _uStack0000000000000060 = unaff_x24 | 0x8000000000000000;
  _uStack0000000000000050 = param_1;
  _memmove(param_1);
  uVar5 = _uStack0000000000000060;
  puVar4 = _uStack0000000000000050;
  param_1[unaff_x21] = 0;
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000050);
  puVar2 = _uStack0000000000000050;
  uVar6 = (uint)_uStack0000000000000050;
  if ((long)uVar5 < 0) {
    __ZdlPv(puVar4);
    if ((uVar6 & 0xff) != 0xff) goto LAB_0004b970;
LAB_0004b974:
    auVar7 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000018);
    uVar5 = auVar7._8_8_;
    if (unaff_x25 < uVar5) {
      func_0x0001748c(&uStack0000000000000050);
      goto code_r0x0004bb30;
    }
    if (uVar5 < 0x17) {
      _uStack0000000000000060 = CONCAT17(auVar7[8],uStack0000000000000060);
      puVar4 = &uStack0000000000000050;
      if (uVar5 != 0) goto code_r0x0004b9d4;
    }
    else {
      uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
      if ((uVar5 | 7) != 0x17) {
        uVar1 = uVar5 | 7;
      }
      puVar4 = (undefined *)__Znwm(uVar1 + 1);
      _uStack0000000000000060 = uVar1 + 1 | 0x8000000000000000;
      _uStack0000000000000050 = puVar4;
code_r0x0004b9d4:
      _memmove(puVar4,auVar7._0_8_,uVar5);
    }
    puVar4[uVar5] = 0;
    uVar5 = _uStack0000000000000060;
    puVar4 = _uStack0000000000000050;
    __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE();
    if ((long)uVar5 < 0) {
      __ZdlPv(puVar4);
    }
  }
  else {
    if ((uVar6 & 0xff) == 0xff) goto LAB_0004b974;
LAB_0004b970:
    if (((ulong)puVar2 & 0xff) == 0) goto LAB_0004b974;
  }
  func_0x0004eec4(&uStack0000000000000050,&uStack0000000000000018,0x24);
  if (in_stack_000000d0 == 0) {
    func_0x006e644c();
    goto code_r0x0004bb30;
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl(&uStack0000000000000050);
  _uStack0000000000000050 = &UNK_009b7a40;
  func_0x0001aa68((long)register0x00000008 + 0x58);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000050,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001f0);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
    if (in_stack_00000048._7_1_ < '\0') goto code_r0x0004bad8;
code_r0x0004ba90:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return 0;
    }
  }
  else {
    if (-1 < in_stack_00000048._7_1_) goto code_r0x0004ba90;
code_r0x0004bad8:
    __ZdlPv(uStack0000000000000038);
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

