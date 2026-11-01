
undefined8 FUN_0004cec0(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  char ****ppppcVar10;
  undefined8 ****ppppuVar11;
  char *pcVar12;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  undefined8 auStack_f8 [2];
  char cStack_e1;
  undefined8 ****ppppuStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  char acStack_c8 [8];
  undefined8 auStack_80 [2];
  char cStack_69;
  char ****ppppcStack_68;
  ulong uStack_60;
  undefined8 uStack_58;
  ulong uStack_50;
  char acStack_48 [8];
  
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"makefolder",10);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x107);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000020,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000020,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  uVar4 = func_0x006e67c8(param_1,1,0);
  uVar7 = _strlen();
  if (uVar7 < 0x7ffffffffffffff8) {
    if (uVar7 < 0x17) {
      _uStack0000000000000030 = CONCAT17((char)uVar7,uStack0000000000000030);
      puVar8 = &uStack0000000000000020;
      if (uVar7 == 0) goto LAB_0004d008;
    }
    else {
      uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
      if ((uVar7 | 7) != 0x17) {
        uVar1 = uVar7 | 7;
      }
      puVar8 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000020 = puVar8;
      in_stack_00000028 = uVar7;
    }
    _memmove(puVar8,uVar4,uVar7);
LAB_0004d008:
    *(undefined1 *)((long)puVar8 + uVar7) = 0;
    func_0x0004dd60(&uStack0000000000000008,param_1,&uStack0000000000000020,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
              (&uStack0000000000000038,&uStack0000000000000008,0);
    if ((uStack0000000000000038 == '\0') || (uStack0000000000000038 == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE
                (&uStack0000000000000008,0);
    }
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
    }
    if ((long)_uStack0000000000000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    return 0;
  }
  uVar4 = func_0x0001748c(&uStack0000000000000020);
  if ((long)_uStack0000000000000030 < 0) {
    __ZdlPv(uStack0000000000000020);
    uVar4 = __Unwind_Resume(uVar4);
    __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  }
  uVar4 = __Unwind_Resume(uVar4);
  uVar9 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar9 = func_0x00086db4(uVar9,"delfolder",9);
  uVar9 = func_0x00086db4(uVar9," @ ",3);
  uVar9 = func_0x00086db4(uVar9,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar9 = func_0x00086db4(uVar9,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar9,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppcStack_68,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppcStack_68,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar9 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&ppppcStack_68);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar9);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  uStack_50 = 0;
  uVar9 = func_0x006e67c8(uVar4,1,&uStack_50);
  uVar7 = uStack_50;
  if (0x7ffffffffffffff7 < uStack_50) {
    uVar4 = func_0x0001748c(&ppppcStack_68);
    if ((long)uStack_58 < 0) {
      __ZdlPv(ppppcStack_68);
    }
    uVar4 = __Unwind_Resume(uVar4);
    uVar9 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar9 = func_0x00086db4(uVar9,"delfile",7);
    uVar9 = func_0x00086db4(uVar9," @ ",3);
    uVar9 = func_0x00086db4(uVar9,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar9 = func_0x00086db4(uVar9,":",1);
    plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar9,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppuStack_e0,(long)plVar5 + *(long *)(*plVar5 + -0x18));
    plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (&ppppuStack_e0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar9 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
    __ZNSt3__16localeD1Ev(&ppppuStack_e0);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar9);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
    uVar9 = func_0x006e67c8(uVar4,1,0);
    uVar7 = _strlen();
    if (uVar7 < 0x7ffffffffffffff8) {
      if (uVar7 < 0x17) {
        uStack_d0 = CONCAT17((char)uVar7,(undefined7)uStack_d0);
        ppppuVar11 = &ppppuStack_e0;
        if (uVar7 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
        if ((uVar7 | 7) != 0x17) {
          uVar1 = uVar7 | 7;
        }
        ppppuVar11 = (undefined8 ****)__Znwm(uVar1 + 1);
        uStack_d0 = uVar1 + 1 | 0x8000000000000000;
        ppppuStack_e0 = ppppuVar11;
        uStack_d8 = uVar7;
code_r0x0004d4ec:
        _memmove(ppppuVar11,uVar9,uVar7);
      }
      *(undefined1 *)((long)ppppuVar11 + uVar7) = 0;
      func_0x0004dd60(auStack_f8,uVar4,&ppppuStack_e0,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
      pcVar12 = "File does not exist";
      if ((acStack_c8[0] == '\0') || (acStack_c8[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
      if (acStack_c8[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_f8,0);
        if (cStack_e1 < '\0') {
          __ZdlPv(auStack_f8[0]);
        }
        if ((long)uStack_d0 < 0) {
          __ZdlPv(ppppuStack_e0);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&ppppuStack_e0);
    }
    pcVar12 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar4,pcVar12);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (uStack_50 < 0x17) {
    uStack_58 = CONCAT17((char)uStack_50,(undefined7)uStack_58);
    ppppcVar10 = (char ****)&ppppcStack_68;
    if (uStack_50 != 0) goto code_r0x0004d228;
  }
  else {
    uVar1 = (uStack_50 & 0xfffffffffffffff8) + 8;
    if ((uStack_50 | 7) != 0x17) {
      uVar1 = uStack_50 | 7;
    }
    ppppcVar10 = (char ****)__Znwm(uVar1 + 1);
    uStack_58 = uVar1 + 1 | 0x8000000000000000;
    uStack_60 = uVar7;
    ppppcStack_68 = ppppcVar10;
code_r0x0004d228:
    _memmove(ppppcVar10,uVar9,uVar7);
  }
  *(char *)((long)ppppcVar10 + uVar7) = '\0';
  if (uStack_50 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar4,"Cannot delete workspace directory");
  }
  else {
    uVar7 = uStack_60;
    if (-1 < (long)uStack_58) {
      uVar7 = uStack_58 >> 0x38;
    }
    if (uVar7 == 2) {
      ppppcVar10 = ppppcStack_68;
      if (-1 < (long)uStack_58) {
        ppppcVar10 = (char ****)&ppppcStack_68;
      }
      iVar3 = _memcmp(ppppcVar10,"./");
      if (iVar3 == 0) goto code_r0x0004d32c;
    }
    else if (uVar7 == 1) {
      ppppcVar10 = ppppcStack_68;
      if (-1 < (long)uStack_58) {
        ppppcVar10 = (char ****)&ppppcStack_68;
      }
      if (*(char *)ppppcVar10 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_80,uVar4,&ppppcStack_68,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_80,0);
    if ((acStack_48[0] != -1) && (acStack_48[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_80,0);
      if (cStack_69 < '\0') {
        __ZdlPv(auStack_80[0]);
      }
      if ((long)uStack_58 < 0) {
        __ZdlPv(ppppcStack_68);
      }
      return 0;
    }
    func_0x006e644c(uVar4,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar2)();
}

