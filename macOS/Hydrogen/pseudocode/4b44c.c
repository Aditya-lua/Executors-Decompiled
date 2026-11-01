
undefined8 FUN_0004b44c(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  undefined7 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000058;
  long in_stack_000000d0;
  undefined1 uStack00000000000001f0;
  
  uVar3 = func_0x00086db4();
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x8c);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000048,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000048,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000048);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  uVar3 = func_0x006e67c8();
  uVar6 = _strlen();
  if (uVar6 < 0x7ffffffffffffff8) {
    if (uVar6 < 0x17) {
      _uStack0000000000000040 = CONCAT17((char)uVar6,uStack0000000000000040);
      puVar7 = &uStack0000000000000030;
      if (uVar6 != 0) goto code_r0x0004b520;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000040 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000030 = puVar7;
      in_stack_00000038 = uVar6;
code_r0x0004b520:
      _memmove(puVar7,uVar3,uVar6);
    }
    *(undefined1 *)((long)puVar7 + uVar6) = 0;
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
      if ((long)_uStack0000000000000040 < 0) goto code_r0x0004b64c;
code_r0x0004b608:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 1;
      }
    }
    else {
      if (-1 < (long)_uStack0000000000000040) goto code_r0x0004b608;
code_r0x0004b64c:
      __ZdlPv(uStack0000000000000030);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 1;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&uStack0000000000000030);
code_r0x0004b68c:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4b690);
  (*pcVar2)();
}

