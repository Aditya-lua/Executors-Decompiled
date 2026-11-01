
undefined8 FUN_0004bcf4(ulong param_1)

{
  ulong uVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  int iVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000060;
  long in_stack_000000c0;
  undefined8 uStack00000000000001e0;
  
  if (param_1 < 0x7ffffffffffffff8) {
    if (param_1 < 0x17) {
      _uStack0000000000000038 = CONCAT17((char)param_1,uStack0000000000000038);
      puVar6 = &uStack0000000000000028;
      if (param_1 != 0) goto LAB_0004bd4c;
    }
    else {
      uVar1 = (param_1 & 0xfffffffffffffff8) + 8;
      if ((param_1 | 7) != 0x17) {
        uVar1 = param_1 | 7;
      }
      puVar6 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000038 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000028 = puVar6;
      in_stack_00000030 = param_1;
LAB_0004bd4c:
      _memmove(puVar6);
    }
    *(undefined1 *)((long)puVar6 + param_1) = 0;
    in_stack_00000020 = 0;
    uVar7 = func_0x006e67c8();
    func_0x0004dd60(&uStack0000000000000008);
    func_0x0004eec4(&uStack0000000000000040,&uStack0000000000000008,5);
    if (in_stack_000000c0 == 0) {
      func_0x006e644c();
      goto code_r0x0004befc;
    }
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl
              (&uStack0000000000000040,uVar7,in_stack_00000020);
    lVar2 = in_stack_000000c0;
    if (in_stack_000000c0 == 0) {
LAB_0004be08:
      __ZNSt3__18ios_base5clearEj
                ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
                 *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4)
      ;
    }
    else {
      iVar4 = (**(code **)(uStack0000000000000048 + 0x30))(&uStack0000000000000048);
      iVar5 = _fclose(lVar2);
      in_stack_000000c0 = 0;
      (**(code **)(uStack0000000000000048 + 0x18))(&uStack0000000000000048,0,0);
      if (iVar5 != 0 || iVar4 != 0) goto LAB_0004be08;
    }
    uStack0000000000000040 = &UNK_009b7a40;
    uStack00000000000001e0 = &UNK_009b7a68;
    func_0x0001aa68(&uStack0000000000000048);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
    __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001e0);
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
      if ((long)_uStack0000000000000038 < 0) goto code_r0x0004bebc;
code_r0x0004be78:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 0;
      }
    }
    else {
      if (-1 < (long)_uStack0000000000000038) goto code_r0x0004be78;
code_r0x0004bebc:
      __ZdlPv(uStack0000000000000028);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 0;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&uStack0000000000000028);
code_r0x0004befc:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4bf00);
  (*pcVar3)();
}

