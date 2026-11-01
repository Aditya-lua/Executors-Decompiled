
undefined8 FUN_0004c9ac(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  undefined8 ****ppppuVar10;
  char ****ppppcVar11;
  char *pcVar12;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000068;
  undefined8 auStack_278 [2];
  char cStack_261;
  undefined8 ****ppppuStack_260;
  ulong uStack_258;
  undefined8 uStack_250;
  char acStack_248 [8];
  undefined8 auStack_200 [2];
  char cStack_1e9;
  char ****ppppcStack_1e8;
  ulong uStack_1e0;
  undefined8 uStack_1d8;
  ulong uStack_1d0;
  char acStack_1c8 [8];
  undefined8 auStack_178 [2];
  char cStack_161;
  undefined8 ****ppppuStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
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
  
  __ZNSt3__16localeD1Ev(&uStack0000000000000058);
  uVar5 = __Unwind_Resume(param_1);
  func_0x0000aad0(&uStack0000000000000040);
  if (in_stack_00000068._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000058);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"isfile",6);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0xf1);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_60,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar6 = func_0x006e67c8(uVar5,1,0);
  uVar9 = _strlen();
  if (uVar9 < 0x7ffffffffffffff8) {
    if (uVar9 < 0x17) {
      uStack_50 = CONCAT17((char)uVar9,(undefined7)uStack_50);
      ppppuVar10 = &ppppuStack_60;
      if (uVar9 == 0) goto code_r0x0004cb70;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      ppppuVar10 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_50 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_60 = ppppuVar10;
      uStack_58 = uVar9;
    }
    _memmove(ppppuVar10,uVar6,uVar9);
code_r0x0004cb70:
    *(undefined1 *)((long)ppppuVar10 + uVar9) = 0;
    func_0x0004dd60(auStack_78,uVar5,&ppppuStack_60,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    bVar3 = false;
    if ((acStack_48[0] != '\0') && (acStack_48[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      bVar3 = acStack_48[0] == '\x01';
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
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"isfolder",8);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0xfc);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_e0,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppuStack_e0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_e0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar6 = func_0x006e67c8(uVar5,1,0);
  uVar9 = _strlen();
  if (uVar9 < 0x7ffffffffffffff8) {
    if (uVar9 < 0x17) {
      uStack_d0 = CONCAT17((char)uVar9,(undefined7)uStack_d0);
      ppppuVar10 = &ppppuStack_e0;
      if (uVar9 == 0) goto code_r0x0004cdbc;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      ppppuVar10 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_d0 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_e0 = ppppuVar10;
      uStack_d8 = uVar9;
    }
    _memmove(ppppuVar10,uVar6,uVar9);
code_r0x0004cdbc:
    *(undefined1 *)((long)ppppuVar10 + uVar9) = 0;
    func_0x0004dd60(auStack_f8,uVar5,&ppppuStack_e0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
    bVar3 = false;
    if ((acStack_c8[0] != '\0') && (acStack_c8[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
      bVar3 = acStack_c8[0] == '\x02';
    }
    func_0x006e3c24(uVar5,bVar3);
    if (cStack_e1 < '\0') {
      __ZdlPv(auStack_f8[0]);
    }
    if ((long)uStack_d0 < 0) {
      __ZdlPv(ppppuStack_e0);
    }
    return 1;
  }
  uVar5 = func_0x0001748c(&ppppuStack_e0);
  if ((long)uStack_d0 < 0) {
    __ZdlPv(ppppuStack_e0);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"makefolder",10);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x107);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_160,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppuStack_160,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_160);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar6 = func_0x006e67c8(uVar5,1,0);
  uVar9 = _strlen();
  if (uVar9 < 0x7ffffffffffffff8) {
    if (uVar9 < 0x17) {
      uStack_150 = CONCAT17((char)uVar9,(undefined7)uStack_150);
      ppppuVar10 = &ppppuStack_160;
      if (uVar9 == 0) goto code_r0x0004d008;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      ppppuVar10 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_150 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_160 = ppppuVar10;
      uStack_158 = uVar9;
    }
    _memmove(ppppuVar10,uVar6,uVar9);
code_r0x0004d008:
    *(undefined1 *)((long)ppppuVar10 + uVar9) = 0;
    func_0x0004dd60(auStack_178,uVar5,&ppppuStack_160,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_148,auStack_178,0);
    if ((acStack_148[0] == '\0') || (acStack_148[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_178,0)
      ;
    }
    if (cStack_161 < '\0') {
      __ZdlPv(auStack_178[0]);
    }
    if ((long)uStack_150 < 0) {
      __ZdlPv(ppppuStack_160);
    }
    return 0;
  }
  uVar5 = func_0x0001748c(&ppppuStack_160);
  if ((long)uStack_150 < 0) {
    __ZdlPv(ppppuStack_160);
    uVar5 = __Unwind_Resume(uVar5);
    __ZNSt3__16localeD1Ev(&ppppuStack_160);
  }
  uVar5 = __Unwind_Resume(uVar5);
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"delfolder",9);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppcStack_1e8,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppcStack_1e8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&ppppcStack_1e8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uStack_1d0 = 0;
  uVar6 = func_0x006e67c8(uVar5,1,&uStack_1d0);
  uVar9 = uStack_1d0;
  if (0x7ffffffffffffff7 < uStack_1d0) {
    uVar5 = func_0x0001748c(&ppppcStack_1e8);
    if ((long)uStack_1d8 < 0) {
      __ZdlPv(ppppcStack_1e8);
    }
    uVar5 = __Unwind_Resume(uVar5);
    uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar6 = func_0x00086db4(uVar6,"delfile",7);
    uVar6 = func_0x00086db4(uVar6," @ ",3);
    uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar6 = func_0x00086db4(uVar6,":",1);
    plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppuStack_260,(long)plVar7 + *(long *)(*plVar7 + -0x18));
    plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (&ppppuStack_260,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
    __ZNSt3__16localeD1Ev(&ppppuStack_260);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
    uVar6 = func_0x006e67c8(uVar5,1,0);
    uVar9 = _strlen();
    if (uVar9 < 0x7ffffffffffffff8) {
      if (uVar9 < 0x17) {
        uStack_250 = CONCAT17((char)uVar9,(undefined7)uStack_250);
        ppppuVar10 = &ppppuStack_260;
        if (uVar9 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
        if ((uVar9 | 7) != 0x17) {
          uVar1 = uVar9 | 7;
        }
        ppppuVar10 = (undefined8 ****)__Znwm(uVar1 + 1);
        uStack_250 = uVar1 + 1 | 0x8000000000000000;
        ppppuStack_260 = ppppuVar10;
        uStack_258 = uVar9;
code_r0x0004d4ec:
        _memmove(ppppuVar10,uVar6,uVar9);
      }
      *(undefined1 *)((long)ppppuVar10 + uVar9) = 0;
      func_0x0004dd60(auStack_278,uVar5,&ppppuStack_260,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_248,auStack_278,0);
      pcVar12 = "File does not exist";
      if ((acStack_248[0] == '\0') || (acStack_248[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_248,auStack_278,0);
      if (acStack_248[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_278,0);
        if (cStack_261 < '\0') {
          __ZdlPv(auStack_278[0]);
        }
        if ((long)uStack_250 < 0) {
          __ZdlPv(ppppuStack_260);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&ppppuStack_260);
    }
    pcVar12 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar5,pcVar12);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (uStack_1d0 < 0x17) {
    uStack_1d8 = CONCAT17((char)uStack_1d0,(undefined7)uStack_1d8);
    ppppcVar11 = (char ****)&ppppcStack_1e8;
    if (uStack_1d0 != 0) goto LAB_0004d228;
  }
  else {
    uVar1 = (uStack_1d0 & 0xfffffffffffffff8) + 8;
    if ((uStack_1d0 | 7) != 0x17) {
      uVar1 = uStack_1d0 | 7;
    }
    ppppcVar11 = (char ****)__Znwm(uVar1 + 1);
    uStack_1d8 = uVar1 + 1 | 0x8000000000000000;
    uStack_1e0 = uVar9;
    ppppcStack_1e8 = ppppcVar11;
LAB_0004d228:
    _memmove(ppppcVar11,uVar6,uVar9);
  }
  *(char *)((long)ppppcVar11 + uVar9) = '\0';
  if (uStack_1d0 == 0) {
LAB_0004d32c:
    func_0x006e644c(uVar5,"Cannot delete workspace directory");
  }
  else {
    uVar9 = uStack_1e0;
    if (-1 < (long)uStack_1d8) {
      uVar9 = uStack_1d8 >> 0x38;
    }
    if (uVar9 == 2) {
      ppppcVar11 = ppppcStack_1e8;
      if (-1 < (long)uStack_1d8) {
        ppppcVar11 = (char ****)&ppppcStack_1e8;
      }
      iVar4 = _memcmp(ppppcVar11,"./");
      if (iVar4 == 0) goto LAB_0004d32c;
    }
    else if (uVar9 == 1) {
      ppppcVar11 = ppppcStack_1e8;
      if (-1 < (long)uStack_1d8) {
        ppppcVar11 = (char ****)&ppppcStack_1e8;
      }
      if (*(char *)ppppcVar11 == '.') goto LAB_0004d32c;
    }
    func_0x0004dd60(auStack_200,uVar5,&ppppcStack_1e8,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_1c8,auStack_200,0);
    if ((acStack_1c8[0] != -1) && (acStack_1c8[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_200,0);
      if (cStack_1e9 < '\0') {
        __ZdlPv(auStack_200[0]);
      }
      if ((long)uStack_1d8 < 0) {
        __ZdlPv(ppppcStack_1e8);
      }
      return 0;
    }
    func_0x006e644c(uVar5,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar2)();
}

