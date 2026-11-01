
undefined8 FUN_0004ceb0(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  ulong uVar8;
  undefined8 ****ppppuVar9;
  char ****ppppcVar10;
  char *pcVar11;
  undefined8 auStack_178 [2];
  char cStack_161;
  undefined8 ****ppppuStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  char acStack_148 [8];
  undefined8 auStack_100 [2];
  char cStack_e9;
  char ****ppppcStack_e8;
  ulong uStack_e0;
  undefined8 uStack_d8;
  ulong uStack_d0;
  char acStack_c8 [8];
  undefined8 auStack_78 [2];
  char cStack_61;
  undefined8 ****ppppuStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  char acStack_48 [8];
  
  uVar4 = __Unwind_Resume();
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"makefolder",10);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x107);
  __ZNKSt3__18ios_base6getlocEv(&ppppuStack_60,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(&ppppuStack_60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  uVar5 = func_0x006e67c8(uVar4,1,0);
  uVar8 = _strlen();
  if (uVar8 < 0x7ffffffffffffff8) {
    if (uVar8 < 0x17) {
      uStack_50 = CONCAT17((char)uVar8,(undefined7)uStack_50);
      ppppuVar9 = &ppppuStack_60;
      if (uVar8 == 0) goto code_r0x0004d008;
    }
    else {
      uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
      if ((uVar8 | 7) != 0x17) {
        uVar1 = uVar8 | 7;
      }
      ppppuVar9 = (undefined8 ****)__Znwm(uVar1 + 1);
      uStack_50 = uVar1 + 1 | 0x8000000000000000;
      ppppuStack_60 = ppppuVar9;
      uStack_58 = uVar8;
    }
    _memmove(ppppuVar9,uVar5,uVar8);
code_r0x0004d008:
    *(undefined1 *)((long)ppppuVar9 + uVar8) = 0;
    func_0x0004dd60(auStack_78,uVar4,&ppppuStack_60,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    if ((acStack_48[0] == '\0') || (acStack_48[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_78,0);
    }
    if (cStack_61 < '\0') {
      __ZdlPv(auStack_78[0]);
    }
    if ((long)uStack_50 < 0) {
      __ZdlPv(ppppuStack_60);
    }
    return 0;
  }
  uVar4 = func_0x0001748c(&ppppuStack_60);
  if ((long)uStack_50 < 0) {
    __ZdlPv(ppppuStack_60);
    uVar4 = __Unwind_Resume(uVar4);
    __ZNSt3__16localeD1Ev(&ppppuStack_60);
  }
  uVar4 = __Unwind_Resume(uVar4);
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"delfolder",9);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppcStack_e8,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&ppppcStack_e8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(&ppppcStack_e8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  uStack_d0 = 0;
  uVar5 = func_0x006e67c8(uVar4,1,&uStack_d0);
  uVar8 = uStack_d0;
  if (0x7ffffffffffffff7 < uStack_d0) {
    uVar4 = func_0x0001748c(&ppppcStack_e8);
    if ((long)uStack_d8 < 0) {
      __ZdlPv(ppppcStack_e8);
    }
    uVar4 = __Unwind_Resume(uVar4);
    uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar5 = func_0x00086db4(uVar5,"delfile",7);
    uVar5 = func_0x00086db4(uVar5," @ ",3);
    uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar5 = func_0x00086db4(uVar5,":",1);
    plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppuStack_160,(long)plVar6 + *(long *)(*plVar6 + -0x18));
    plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (&ppppuStack_160,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
    __ZNSt3__16localeD1Ev(&ppppuStack_160);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
    uVar5 = func_0x006e67c8(uVar4,1,0);
    uVar8 = _strlen();
    if (uVar8 < 0x7ffffffffffffff8) {
      if (uVar8 < 0x17) {
        uStack_150 = CONCAT17((char)uVar8,(undefined7)uStack_150);
        ppppuVar9 = &ppppuStack_160;
        if (uVar8 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
        if ((uVar8 | 7) != 0x17) {
          uVar1 = uVar8 | 7;
        }
        ppppuVar9 = (undefined8 ****)__Znwm(uVar1 + 1);
        uStack_150 = uVar1 + 1 | 0x8000000000000000;
        ppppuStack_160 = ppppuVar9;
        uStack_158 = uVar8;
code_r0x0004d4ec:
        _memmove(ppppuVar9,uVar5,uVar8);
      }
      *(undefined1 *)((long)ppppuVar9 + uVar8) = 0;
      func_0x0004dd60(auStack_178,uVar4,&ppppuStack_160,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_148,auStack_178,0);
      pcVar11 = "File does not exist";
      if ((acStack_148[0] == '\0') || (acStack_148[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_148,auStack_178,0);
      if (acStack_148[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_178,0);
        if (cStack_161 < '\0') {
          __ZdlPv(auStack_178[0]);
        }
        if ((long)uStack_150 < 0) {
          __ZdlPv(ppppuStack_160);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&ppppuStack_160);
    }
    pcVar11 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar4,pcVar11);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar2)();
  }
  if (uStack_d0 < 0x17) {
    uStack_d8 = CONCAT17((char)uStack_d0,(undefined7)uStack_d8);
    ppppcVar10 = (char ****)&ppppcStack_e8;
    if (uStack_d0 != 0) goto code_r0x0004d228;
  }
  else {
    uVar1 = (uStack_d0 & 0xfffffffffffffff8) + 8;
    if ((uStack_d0 | 7) != 0x17) {
      uVar1 = uStack_d0 | 7;
    }
    ppppcVar10 = (char ****)__Znwm(uVar1 + 1);
    uStack_d8 = uVar1 + 1 | 0x8000000000000000;
    uStack_e0 = uVar8;
    ppppcStack_e8 = ppppcVar10;
code_r0x0004d228:
    _memmove(ppppcVar10,uVar5,uVar8);
  }
  *(char *)((long)ppppcVar10 + uVar8) = '\0';
  if (uStack_d0 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar4,"Cannot delete workspace directory");
  }
  else {
    uVar8 = uStack_e0;
    if (-1 < (long)uStack_d8) {
      uVar8 = uStack_d8 >> 0x38;
    }
    if (uVar8 == 2) {
      ppppcVar10 = ppppcStack_e8;
      if (-1 < (long)uStack_d8) {
        ppppcVar10 = (char ****)&ppppcStack_e8;
      }
      iVar3 = _memcmp(ppppcVar10,"./");
      if (iVar3 == 0) goto code_r0x0004d32c;
    }
    else if (uVar8 == 1) {
      ppppcVar10 = ppppcStack_e8;
      if (-1 < (long)uStack_d8) {
        ppppcVar10 = (char ****)&ppppcStack_e8;
      }
      if (*(char *)ppppcVar10 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_100,uVar4,&ppppcStack_e8,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_100,0);
    if ((acStack_c8[0] != -1) && (acStack_c8[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_100,0);
      if (cStack_e9 < '\0') {
        __ZdlPv(auStack_100[0]);
      }
      if ((long)uStack_d8 < 0) {
        __ZdlPv(ppppcStack_e8);
      }
      return 0;
    }
    func_0x006e644c(uVar4,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar2)();
}

