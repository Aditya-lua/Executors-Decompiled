
undefined8 FUN_0004d184(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  char *pcVar6;
  undefined8 uVar7;
  long *plVar8;
  ulong uVar9;
  undefined8 ***pppuVar10;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined8 auStack_78 [2];
  char cStack_61;
  undefined8 ***pppuStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  char acStack_48 [8];
  
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000018);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  in_stack_00000030 = 0;
  uVar5 = func_0x006e67c8();
  uVar9 = in_stack_00000030;
  if (0x7ffffffffffffff7 < in_stack_00000030) {
    uVar5 = func_0x0001748c(&uStack0000000000000018);
    if ((long)_uStack0000000000000028 < 0) {
      __ZdlPv(uStack0000000000000018);
    }
    uVar5 = __Unwind_Resume(uVar5);
    uVar7 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar7 = func_0x00086db4(uVar7,"delfile",7);
    uVar7 = func_0x00086db4(uVar7," @ ",3);
    uVar7 = func_0x00086db4(uVar7,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar7 = func_0x00086db4(uVar7,":",1);
    plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar7,0x124);
    __ZNKSt3__18ios_base6getlocEv(&pppuStack_60,(long)plVar4 + *(long *)(*plVar4 + -0x18));
    plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (&pppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar7 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
    __ZNSt3__16localeD1Ev(&pppuStack_60);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar7);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
    uVar7 = func_0x006e67c8(uVar5,1,0);
    uVar9 = _strlen();
    if (uVar9 < 0x7ffffffffffffff8) {
      if (uVar9 < 0x17) {
        uStack_50 = CONCAT17((char)uVar9,(undefined7)uStack_50);
        pppuVar10 = &pppuStack_60;
        if (uVar9 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
        if ((uVar9 | 7) != 0x17) {
          uVar1 = uVar9 | 7;
        }
        pppuVar10 = (undefined8 ***)__Znwm(uVar1 + 1);
        uStack_50 = uVar1 + 1 | 0x8000000000000000;
        pppuStack_60 = pppuVar10;
        uStack_58 = uVar9;
code_r0x0004d4ec:
        _memmove(pppuVar10,uVar7,uVar9);
      }
      *(undefined1 *)((long)pppuVar10 + uVar9) = 0;
      func_0x0004dd60(auStack_78,uVar5,&pppuStack_60,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      pcVar6 = "File does not exist";
      if ((acStack_48[0] == '\0') || (acStack_48[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      if (acStack_48[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_78,0);
        if (cStack_61 < '\0') {
          __ZdlPv(auStack_78[0]);
        }
        if ((long)uStack_50 < 0) {
          __ZdlPv(pppuStack_60);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&pppuStack_60);
    }
    pcVar6 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar5,pcVar6);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (in_stack_00000030 < 0x17) {
    _uStack0000000000000028 = CONCAT17((char)in_stack_00000030,uStack0000000000000028);
    pcVar6 = (char *)&uStack0000000000000018;
    if (in_stack_00000030 != 0) goto code_r0x0004d228;
  }
  else {
    uVar1 = (in_stack_00000030 & 0xfffffffffffffff8) + 8;
    if ((in_stack_00000030 | 7) != 0x17) {
      uVar1 = in_stack_00000030 | 7;
    }
    pcVar6 = (char *)__Znwm(uVar1 + 1);
    _uStack0000000000000028 = uVar1 + 1 | 0x8000000000000000;
    in_stack_00000020 = uVar9;
    uStack0000000000000018 = pcVar6;
code_r0x0004d228:
    _memmove(pcVar6,uVar5,uVar9);
  }
  pcVar6[uVar9] = '\0';
  if (in_stack_00000030 == 0) {
code_r0x0004d32c:
    func_0x006e644c();
  }
  else {
    uVar9 = in_stack_00000020;
    if (-1 < (long)_uStack0000000000000028) {
      uVar9 = _uStack0000000000000028 >> 0x38;
    }
    if (uVar9 == 2) {
      pcVar6 = uStack0000000000000018;
      if (-1 < (long)_uStack0000000000000028) {
        pcVar6 = (char *)&uStack0000000000000018;
      }
      iVar3 = _memcmp(pcVar6,"./");
      if (iVar3 == 0) goto code_r0x0004d32c;
    }
    else if (uVar9 == 1) {
      pcVar6 = uStack0000000000000018;
      if (-1 < (long)_uStack0000000000000028) {
        pcVar6 = (char *)&uStack0000000000000018;
      }
      if (*pcVar6 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60();
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000038);
    if ((uStack0000000000000038 != -1) && (uStack0000000000000038 != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE();
      if (in_stack_00000010 < 0) {
        __ZdlPv(in_stack_00000000);
      }
      if ((long)_uStack0000000000000028 < 0) {
        __ZdlPv(uStack0000000000000018);
      }
      return 0;
    }
    func_0x006e644c();
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar2)();
}

