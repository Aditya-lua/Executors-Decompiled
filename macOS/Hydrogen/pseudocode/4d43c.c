
undefined8 FUN_0004d43c(void)

{
  ulong uVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  
  plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000020,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  (**(code **)(*plVar3 + 0x38))(plVar3,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  uVar4 = func_0x006e67c8();
  uVar5 = _strlen();
  if (0x7ffffffffffffff7 < uVar5) {
    func_0x0001748c(&uStack0000000000000020);
    goto code_r0x0004d5bc;
  }
  if (uVar5 < 0x17) {
    _uStack0000000000000030 = CONCAT17((char)uVar5,uStack0000000000000030);
    puVar6 = &uStack0000000000000020;
    if (uVar5 != 0) goto LAB_0004d4ec;
  }
  else {
    uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = uVar5 | 7;
    }
    puVar6 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000020 = puVar6;
    in_stack_00000028 = uVar5;
LAB_0004d4ec:
    _memmove(puVar6,uVar4,uVar5);
  }
  *(undefined1 *)((long)puVar6 + uVar5) = 0;
  func_0x0004dd60(&uStack0000000000000008);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (&uStack0000000000000038,&uStack0000000000000008,0);
  if (((uStack0000000000000038 != '\0') && (uStack0000000000000038 != -1)) &&
     (__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                (&uStack0000000000000038,&uStack0000000000000008,0),
     uStack0000000000000038 == '\x01')) {
    __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000008,0);
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
    }
    if ((long)_uStack0000000000000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    return 0;
  }
code_r0x0004d5bc:
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
  (*pcVar2)();
}

