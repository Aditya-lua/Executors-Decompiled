
undefined8 FUN_0004caf0(void)

{
  ulong uVar1;
  code *pcVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  undefined8 ****ppppuVar11;
  char ****ppppcVar12;
  char *pcVar13;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  undefined8 auStack_1f8 [2];
  char cStack_1e1;
  undefined8 ****ppppuStack_1e0;
  ulong uStack_1d8;
  undefined8 uStack_1d0;
  char acStack_1c8 [8];
  undefined8 auStack_180 [2];
  char cStack_169;
  char ****ppppcStack_168;
  ulong uStack_160;
  undefined8 uStack_158;
  ulong uStack_150;
  char acStack_148 [8];
  undefined8 auStack_f8 [2];
  char cStack_e1;
  undefined8 ****ppppuStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  char acStack_c8 [8];
  undefined8 auStack_78 [2];
  char cStack_61;
  undefined8 ****ppppuStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  char acStack_48 [8];
  
  uVar5 = func_0x006e67c8();
  uVar6 = _strlen();
  if (uVar6 < 0x7ffffffffffffff8) {
    if (uVar6 < 0x17) {
      _uStack0000000000000030 = CONCAT17((char)uVar6,uStack0000000000000030);
      puVar7 = &uStack0000000000000020;
      if (uVar6 == 0) goto LAB_0004cb70;
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
    }
    _memmove(puVar7,uVar5,uVar6);
LAB_0004cb70:
    *(undefined1 *)((long)puVar7 + uVar6) = 0;
    func_0x0004dd60(&uStack0000000000000008);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
              (&uStack0000000000000038,&uStack0000000000000008,0);
    if ((uStack0000000000000038 != '\0') && (uStack0000000000000038 != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                (&uStack0000000000000038,&uStack0000000000000008,0);
    }
    func_0x006e3c24();
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
    }
    if ((long)_uStack0000000000000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    return 1;
  }
  uVar5 = func_0x0001748c(&uStack0000000000000020);
  if ((long)_uStack0000000000000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"isfolder",8);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0xfc);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_60,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar8 = func_0x006e67c8(uVar5,1,0);
  uVar6 = _strlen();
  if (uVar6 < 0x7ffffffffffffff8) {
    if (uVar6 < 0x17) {
      uStack_50 = CONCAT17((char)uVar6,(undefined7)uStack_50);
      ppppuVar11 = &ppppuStack_60;
      if (uVar6 == 0) goto code_r0x0004cdbc;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      ppppuVar11 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_50 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_60 = ppppuVar11;
      uStack_58 = uVar6;
    }
    _memmove(ppppuVar11,uVar8,uVar6);
code_r0x0004cdbc:
    *(undefined1 *)((long)ppppuVar11 + uVar6) = 0;
    func_0x0004dd60(auStack_78,uVar5,&ppppuStack_60,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    bVar3 = false;
    if ((acStack_48[0] != '\0') && (acStack_48[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      bVar3 = acStack_48[0] == '\x02';
    }
    func_0x006e3c24(uVar5,bVar3);
    if (cStack_61 < '\0') {
      __ZdlPv(auStack_78[0]);
    }
    if ((long)uStack_50 < 0) {
      __ZdlPv(ppppuStack_60);
    }
    return 1;
  }
  uVar5 = func_0x0001748c(&ppppuStack_60);
  if ((long)uStack_50 < 0) {
    __ZdlPv(ppppuStack_60);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"makefolder",10);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x107);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_e0,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppuStack_e0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_e0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar8 = func_0x006e67c8(uVar5,1,0);
  uVar6 = _strlen();
  if (uVar6 < 0x7ffffffffffffff8) {
    if (uVar6 < 0x17) {
      uStack_d0 = CONCAT17((char)uVar6,(undefined7)uStack_d0);
      ppppuVar11 = &ppppuStack_e0;
      if (uVar6 == 0) goto code_r0x0004d008;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      ppppuVar11 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_d0 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_e0 = ppppuVar11;
      uStack_d8 = uVar6;
    }
    _memmove(ppppuVar11,uVar8,uVar6);
code_r0x0004d008:
    *(undefined1 *)((long)ppppuVar11 + uVar6) = 0;
    func_0x0004dd60(auStack_f8,uVar5,&ppppuStack_e0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
    if ((acStack_c8[0] == '\0') || (acStack_c8[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_f8,0);
    }
    if (cStack_e1 < '\0') {
      __ZdlPv(auStack_f8[0]);
    }
    if ((long)uStack_d0 < 0) {
      __ZdlPv(ppppuStack_e0);
    }
    return 0;
  }
  uVar5 = func_0x0001748c(&ppppuStack_e0);
  if ((long)uStack_d0 < 0) {
    __ZdlPv(ppppuStack_e0);
    uVar5 = __Unwind_Resume(uVar5);
    __ZNSt3__16localeD1Ev(&ppppuStack_e0);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"delfolder",9);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppcStack_168,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppcStack_168,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&ppppcStack_168);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uStack_150 = 0;
  uVar8 = func_0x006e67c8(uVar5,1,&uStack_150);
  uVar6 = uStack_150;
  if (0x7ffffffffffffff7 < uStack_150) {
    uVar5 = func_0x0001748c(&ppppcStack_168);
    if ((long)uStack_158 < 0) {
      __ZdlPv(ppppcStack_168);
    }
    uVar5 = __Unwind_Resume(uVar5);
    uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar8 = func_0x00086db4(uVar8,"delfile",7);
    uVar8 = func_0x00086db4(uVar8," @ ",3);
    uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar8 = func_0x00086db4(uVar8,":",1);
    plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppuStack_1e0,(long)plVar9 + *(long *)(*plVar9 + -0x18));
    plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                (&ppppuStack_1e0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
    __ZNSt3__16localeD1Ev(&ppppuStack_1e0);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
    uVar8 = func_0x006e67c8(uVar5,1,0);
    uVar6 = _strlen();
    if (uVar6 < 0x7ffffffffffffff8) {
      if (uVar6 < 0x17) {
        uStack_1d0 = CONCAT17((char)uVar6,(undefined7)uStack_1d0);
        ppppuVar11 = &ppppuStack_1e0;
        if (uVar6 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
        if ((uVar6 | 7) != 0x17) {
          uVar1 = uVar6 | 7;
        }
        ppppuVar11 = (undefined8 ****)__Znwm(uVar1 + 1);
        uStack_1d0 = uVar1 + 1 | 0x8000000000000000;
        ppppuStack_1e0 = ppppuVar11;
        uStack_1d8 = uVar6;
code_r0x0004d4ec:
        _memmove(ppppuVar11,uVar8,uVar6);
      }
      *(undefined1 *)((long)ppppuVar11 + uVar6) = 0;
      func_0x0004dd60(auStack_1f8,uVar5,&ppppuStack_1e0,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_1c8,auStack_1f8,0);
      pcVar13 = "File does not exist";
      if ((acStack_1c8[0] == '\0') || (acStack_1c8[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_1c8,auStack_1f8,0);
      if (acStack_1c8[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_1f8,0);
        if (cStack_1e1 < '\0') {
          __ZdlPv(auStack_1f8[0]);
        }
        if ((long)uStack_1d0 < 0) {
          __ZdlPv(ppppuStack_1e0);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&ppppuStack_1e0);
    }
    pcVar13 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar5,pcVar13);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (uStack_150 < 0x17) {
    uStack_158 = CONCAT17((char)uStack_150,(undefined7)uStack_158);
    ppppcVar12 = (char ****)&ppppcStack_168;
    if (uStack_150 != 0) goto code_r0x0004d228;
  }
  else {
    uVar1 = (uStack_150 & 0xfffffffffffffff8) + 8;
    if ((uStack_150 | 7) != 0x17) {
      uVar1 = uStack_150 | 7;
    }
    ppppcVar12 = (char ****)__Znwm(uVar1 + 1);
    uStack_158 = uVar1 + 1 | 0x8000000000000000;
    uStack_160 = uVar6;
    ppppcStack_168 = ppppcVar12;
code_r0x0004d228:
    _memmove(ppppcVar12,uVar8,uVar6);
  }
  *(char *)((long)ppppcVar12 + uVar6) = '\0';
  if (uStack_150 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar5,"Cannot delete workspace directory");
  }
  else {
    uVar6 = uStack_160;
    if (-1 < (long)uStack_158) {
      uVar6 = uStack_158 >> 0x38;
    }
    if (uVar6 == 2) {
      ppppcVar12 = ppppcStack_168;
      if (-1 < (long)uStack_158) {
        ppppcVar12 = (char ****)&ppppcStack_168;
      }
      iVar4 = _memcmp(ppppcVar12,"./");
      if (iVar4 == 0) goto code_r0x0004d32c;
    }
    else if (uVar6 == 1) {
      ppppcVar12 = ppppcStack_168;
      if (-1 < (long)uStack_158) {
        ppppcVar12 = (char ****)&ppppcStack_168;
      }
      if (*(char *)ppppcVar12 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_180,uVar5,&ppppcStack_168,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_148,auStack_180,0);
    if ((acStack_148[0] != -1) && (acStack_148[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_180,0);
      if (cStack_169 < '\0') {
        __ZdlPv(auStack_180[0]);
      }
      if ((long)uStack_158 < 0) {
        __ZdlPv(ppppcStack_168);
      }
      return 0;
    }
    func_0x006e644c(uVar5,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar2)();
}

