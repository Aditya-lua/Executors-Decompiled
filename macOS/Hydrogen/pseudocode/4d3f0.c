
undefined8 FUN_0004d3f0(undefined8 param_1,long param_2)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  
  uVar3 = func_0x00086db4(param_1,param_2 + 0xe42,3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x124);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000020,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000020,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  uVar3 = func_0x006e67c8();
  uVar6 = _strlen();
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(&uStack0000000000000020);
    goto code_r0x0004d5bc;
  }
  if (uVar6 < 0x17) {
    _uStack0000000000000030 = CONCAT17((char)uVar6,uStack0000000000000030);
    puVar7 = &uStack0000000000000020;
    if (uVar6 != 0) goto code_r0x0004d4ec;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000020 = puVar7;
    in_stack_00000028 = uVar6;
code_r0x0004d4ec:
    _memmove(puVar7,uVar3,uVar6);
  }
  *(undefined1 *)((long)puVar7 + uVar6) = 0;
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

