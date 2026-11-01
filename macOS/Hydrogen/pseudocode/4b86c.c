
undefined8 FUN_0004b86c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  code *pcVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long unaff_x20;
  uint uVar7;
  long unaff_x22;
  ulong unaff_x25;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined7 uStack0000000000000060;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  in_stack_00000030 = 0;
  uVar4 = func_0x006e67c8();
  func_0x0004dd60(&uStack0000000000000018);
  auVar8 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000018);
  uVar6 = auVar8._8_8_;
  if (unaff_x25 < uVar6) {
    func_0x0001748c(&uStack0000000000000050);
    goto code_r0x0004bb30;
  }
  if (uVar6 < 0x17) {
    _uStack0000000000000060 = CONCAT17(auVar8[8],uStack0000000000000060);
    puVar5 = &uStack0000000000000050;
    if (uVar6 != 0) goto LAB_0004b90c;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    puVar5 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000060 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000050 = puVar5;
    uStack0000000000000058 = uVar6;
LAB_0004b90c:
    _memmove(puVar5,auVar8._0_8_,uVar6);
  }
  *(undefined1 *)((long)puVar5 + uVar6) = 0;
  uVar6 = _uStack0000000000000060;
  puVar5 = uStack0000000000000050;
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000050);
  puVar2 = uStack0000000000000050;
  uVar7 = (uint)uStack0000000000000050;
  if ((long)uVar6 < 0) {
    __ZdlPv(puVar5);
    if ((uVar7 & 0xff) != 0xff) goto code_r0x0004b970;
code_r0x0004b974:
    auVar8 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000018);
    uVar6 = auVar8._8_8_;
    if (unaff_x25 < uVar6) {
      func_0x0001748c(&uStack0000000000000050);
      goto code_r0x0004bb30;
    }
    if (uVar6 < 0x17) {
      _uStack0000000000000060 = CONCAT17(auVar8[8],uStack0000000000000060);
      puVar5 = &uStack0000000000000050;
      if (uVar6 != 0) goto code_r0x0004b9d4;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      puVar5 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000060 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000050 = puVar5;
      uStack0000000000000058 = uVar6;
code_r0x0004b9d4:
      _memmove(puVar5,auVar8._0_8_,uVar6);
    }
    *(undefined1 *)((long)puVar5 + uVar6) = 0;
    uVar6 = _uStack0000000000000060;
    puVar5 = uStack0000000000000050;
    __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE();
    if ((long)uVar6 < 0) {
      __ZdlPv(puVar5);
    }
  }
  else {
    if ((uVar7 & 0xff) == 0xff) goto code_r0x0004b974;
code_r0x0004b970:
    if (((ulong)puVar2 & 0xff) == 0) goto code_r0x0004b974;
  }
  func_0x0004eec4(&uStack0000000000000050,&uStack0000000000000018,0x24);
  if (in_stack_000000d0 == 0) {
    func_0x006e644c();
    goto code_r0x0004bb30;
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl
            (&uStack0000000000000050,uVar4,in_stack_00000030);
  uStack0000000000000050 = (undefined8 *)&UNK_009b7a40;
  func_0x0001aa68(&uStack0000000000000058);
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

