
undefined8 FUN_0004b798(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long *plVar4;
  long *plVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  uint uVar9;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  undefined7 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined7 uStack0000000000000060;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(param_1,0x9d);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000050,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000050,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000050);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  uVar6 = func_0x006e67c8();
  uVar7 = _strlen();
  if (uVar7 < 0x7ffffffffffffff8) {
    if (uVar7 < 0x17) {
      _uStack0000000000000048 = CONCAT17((char)uVar7,uStack0000000000000048);
      puVar8 = &uStack0000000000000038;
      if (uVar7 != 0) goto LAB_0004b86c;
    }
    else {
      uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
      if ((uVar7 | 7) != 0x17) {
        uVar1 = uVar7 | 7;
      }
      puVar8 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000048 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000038 = puVar8;
      in_stack_00000040 = uVar7;
LAB_0004b86c:
      _memmove(puVar8,uVar6,uVar7);
    }
    *(undefined1 *)((long)puVar8 + uVar7) = 0;
    in_stack_00000030 = 0;
    uVar6 = func_0x006e67c8();
    func_0x0004dd60(&uStack0000000000000018);
    auVar10 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000018);
    uVar7 = auVar10._8_8_;
    if (0x7ffffffffffffff7 < uVar7) {
      func_0x0001748c(&uStack0000000000000050);
      goto code_r0x0004bb30;
    }
    if (uVar7 < 0x17) {
      _uStack0000000000000060 = CONCAT17(auVar10[8],uStack0000000000000060);
      puVar8 = &uStack0000000000000050;
      if (uVar7 != 0) goto code_r0x0004b90c;
    }
    else {
      uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
      if ((uVar7 | 7) != 0x17) {
        uVar1 = uVar7 | 7;
      }
      puVar8 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000060 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000050 = puVar8;
      uStack0000000000000058 = uVar7;
code_r0x0004b90c:
      _memmove(puVar8,auVar10._0_8_,uVar7);
    }
    *(undefined1 *)((long)puVar8 + uVar7) = 0;
    uVar7 = _uStack0000000000000060;
    puVar8 = uStack0000000000000050;
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000050);
    puVar2 = uStack0000000000000050;
    uVar9 = (uint)uStack0000000000000050;
    if ((long)uVar7 < 0) {
      __ZdlPv(puVar8);
      if ((uVar9 & 0xff) != 0xff) goto code_r0x0004b970;
code_r0x0004b974:
      auVar10 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000018);
      uVar7 = auVar10._8_8_;
      if (0x7ffffffffffffff7 < uVar7) {
        func_0x0001748c(&uStack0000000000000050);
        goto code_r0x0004bb30;
      }
      if (uVar7 < 0x17) {
        _uStack0000000000000060 = CONCAT17(auVar10[8],uStack0000000000000060);
        puVar8 = &uStack0000000000000050;
        if (uVar7 != 0) goto code_r0x0004b9d4;
      }
      else {
        uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
        if ((uVar7 | 7) != 0x17) {
          uVar1 = uVar7 | 7;
        }
        puVar8 = (undefined8 *)__Znwm(uVar1 + 1);
        _uStack0000000000000060 = uVar1 + 1 | 0x8000000000000000;
        uStack0000000000000050 = puVar8;
        uStack0000000000000058 = uVar7;
code_r0x0004b9d4:
        _memmove(puVar8,auVar10._0_8_,uVar7);
      }
      *(undefined1 *)((long)puVar8 + uVar7) = 0;
      uVar7 = _uStack0000000000000060;
      puVar8 = uStack0000000000000050;
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE();
      if ((long)uVar7 < 0) {
        __ZdlPv(puVar8);
      }
    }
    else {
      if ((uVar9 & 0xff) == 0xff) goto code_r0x0004b974;
code_r0x0004b970:
      if (((ulong)puVar2 & 0xff) == 0) goto code_r0x0004b974;
    }
    func_0x0004eec4(&uStack0000000000000050,&uStack0000000000000018,0x24);
    if (in_stack_000000d0 == 0) {
      func_0x006e644c();
      goto code_r0x0004bb30;
    }
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl
              (&uStack0000000000000050,uVar6,in_stack_00000030);
    uStack0000000000000050 = (undefined8 *)&UNK_009b7a40;
    func_0x0001aa68(&uStack0000000000000058);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000050,&UNK_009b7a80);
    __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001f0);
    if (in_stack_00000028._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000018);
      if ((long)_uStack0000000000000048 < 0) goto code_r0x0004bad8;
code_r0x0004ba90:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
        return 0;
      }
    }
    else {
      if (-1 < (long)_uStack0000000000000048) goto code_r0x0004ba90;
code_r0x0004bad8:
      __ZdlPv(uStack0000000000000038);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
        return 0;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&uStack0000000000000038);
code_r0x0004bb30:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4bb34);
  (*pcVar3)();
}

