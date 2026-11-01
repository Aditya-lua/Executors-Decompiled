
undefined8 FUN_0004d110(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  char *pcVar7;
  undefined8 uVar8;
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
  
  uVar4 = func_0x00086db4(param_1,param_2,6);
  uVar4 = func_0x00086db4(uVar4,"delfolder",9);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x114);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000018,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000018,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000018);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  in_stack_00000030 = 0;
  uVar4 = func_0x006e67c8();
  uVar9 = in_stack_00000030;
  if (0x7ffffffffffffff7 < in_stack_00000030) {
    uVar4 = func_0x0001748c(&uStack0000000000000018);
    if ((long)_uStack0000000000000028 < 0) {
      __ZdlPv(uStack0000000000000018);
    }
    uVar4 = __Unwind_Resume(uVar4);
    uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar8 = func_0x00086db4(uVar8,"delfile",7);
    uVar8 = func_0x00086db4(uVar8," @ ",3);
    uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar8 = func_0x00086db4(uVar8,":",1);
    plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x124);
    __ZNKSt3__18ios_base6getlocEv(&pppuStack_60,(long)plVar5 + *(long *)(*plVar5 + -0x18));
    plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (&pppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar8 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
    __ZNSt3__16localeD1Ev(&pppuStack_60);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar8);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
    uVar8 = func_0x006e67c8(uVar4,1,0);
    uVar9 = _strlen();
    if (uVar9 < 0x7ffffffffffffff8) {
      if (uVar9 < 0x17) {
        uStack_50 = CONCAT17((char)uVar9,(undefined7)uStack_50);
        pppuVar10 = &pppuStack_60;
        if (uVar9 != 0) goto LAB_0004d4ec;
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
LAB_0004d4ec:
        _memmove(pppuVar10,uVar8,uVar9);
      }
      *(undefined1 *)((long)pppuVar10 + uVar9) = 0;
      func_0x0004dd60(auStack_78,uVar4,&pppuStack_60,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      pcVar7 = "File does not exist";
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
    pcVar7 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar4,pcVar7);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (in_stack_00000030 < 0x17) {
    _uStack0000000000000028 = CONCAT17((char)in_stack_00000030,uStack0000000000000028);
    pcVar7 = (char *)&uStack0000000000000018;
    if (in_stack_00000030 != 0) goto code_r0x0004d228;
  }
  else {
    uVar1 = (in_stack_00000030 & 0xfffffffffffffff8) + 8;
    if ((in_stack_00000030 | 7) != 0x17) {
      uVar1 = in_stack_00000030 | 7;
    }
    pcVar7 = (char *)__Znwm(uVar1 + 1);
    _uStack0000000000000028 = uVar1 + 1 | 0x8000000000000000;
    in_stack_00000020 = uVar9;
    uStack0000000000000018 = pcVar7;
code_r0x0004d228:
    _memmove(pcVar7,uVar4,uVar9);
  }
  pcVar7[uVar9] = '\0';
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
      pcVar7 = uStack0000000000000018;
      if (-1 < (long)_uStack0000000000000028) {
        pcVar7 = (char *)&uStack0000000000000018;
      }
      iVar3 = _memcmp(pcVar7,"./");
      if (iVar3 == 0) goto code_r0x0004d32c;
    }
    else if (uVar9 == 1) {
      pcVar7 = uStack0000000000000018;
      if (-1 < (long)_uStack0000000000000028) {
        pcVar7 = (char *)&uStack0000000000000018;
      }
      if (*pcVar7 == '.') goto code_r0x0004d32c;
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

