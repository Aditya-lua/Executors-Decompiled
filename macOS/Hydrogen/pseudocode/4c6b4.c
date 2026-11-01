
/* WARNING: Removing unreachable block (ram,0x0004c940) */

undefined8 FUN_0004c6b4(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  code *pcVar6;
  bool bVar7;
  int iVar8;
  long *plVar9;
  long *plVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 uVar15;
  undefined8 *******pppppppuVar16;
  char *******pppppppcVar17;
  char *pcVar18;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 *in_stack_00000048;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000060;
  undefined7 uStack0000000000000068;
  undefined8 auStack_278 [2];
  char cStack_261;
  undefined8 *******pppppppuStack_260;
  ulong uStack_258;
  undefined8 uStack_250;
  char acStack_248 [8];
  undefined8 auStack_200 [2];
  char cStack_1e9;
  char *******pppppppcStack_1e8;
  ulong uStack_1e0;
  undefined8 uStack_1d8;
  ulong uStack_1d0;
  char acStack_1c8 [8];
  undefined8 auStack_178 [2];
  char cStack_161;
  undefined8 *******pppppppuStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  char acStack_148 [8];
  undefined8 auStack_f8 [2];
  char cStack_e1;
  undefined8 *******pppppppuStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  char acStack_c8 [8];
  undefined8 auStack_78 [2];
  char cStack_61;
  undefined8 *******pppppppuStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  char acStack_48 [8];
  
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi();
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000058,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack0000000000000058,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000058);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar11 = func_0x006e67c8();
  uVar12 = _strlen();
  if (uVar12 < 0x7ffffffffffffff8) {
    if (uVar12 < 0x17) {
      _uStack0000000000000068 = CONCAT17((char)uVar12,uStack0000000000000068);
      puVar13 = &uStack0000000000000058;
      if (uVar12 == 0) goto code_r0x0004c79c;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      puVar13 = (undefined8 *)__Znwm(uVar4 + 1);
      _uStack0000000000000068 = uVar4 + 1 | 0x8000000000000000;
      uStack0000000000000058 = puVar13;
      in_stack_00000060 = uVar12;
    }
    _memmove(puVar13,uVar11,uVar12);
code_r0x0004c79c:
    *(undefined1 *)((long)puVar13 + uVar12) = 0;
    func_0x0004f3d0(&uStack0000000000000040);
    func_0x006e4118();
    puVar5 = in_stack_00000048;
    puVar13 = uStack0000000000000040;
    uVar12 = _uStack0000000000000068;
    do {
      _uStack0000000000000068 = uVar12;
      if (puVar13 == puVar5) {
        if (uStack0000000000000040 != (undefined8 *)0x0) {
          for (; in_stack_00000048 != uStack0000000000000040;
              in_stack_00000048 = in_stack_00000048 + -3) {
          }
          in_stack_00000048 = uStack0000000000000040;
          __ZdlPv(uStack0000000000000040);
        }
        if ((long)_uStack0000000000000068 < 0) {
          __ZdlPv(uStack0000000000000058);
        }
        return 1;
      }
      uVar4 = in_stack_00000060;
      if (-1 < (long)uVar12) {
        uVar4 = uVar12 >> 0x38;
      }
      uVar1 = uVar4 + 1;
      if (0x7ffffffffffffff7 < uVar1) {
        func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x4c998);
        (*pcVar6)();
      }
      if (uVar1 < 0x17) {
        in_stack_00000010 = 0;
        uStack0000000000000008 = (undefined8 *)0x0;
        puVar14 = &uStack0000000000000008;
        in_stack_00000018 = uVar1 << 0x38;
        if (uVar4 != 0) goto code_r0x0004c84c;
      }
      else {
        uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar2 = uVar1 | 7;
        }
        puVar14 = (undefined8 *)__Znwm(uVar2 + 1);
        in_stack_00000018 = uVar2 + 1 | 0x8000000000000000;
        uStack0000000000000008 = puVar14;
        in_stack_00000010 = uVar1;
code_r0x0004c84c:
        puVar3 = uStack0000000000000058;
        if (-1 < (long)uVar12) {
          puVar3 = &uStack0000000000000058;
        }
        _memmove(puVar14,puVar3,uVar4);
      }
      *(undefined2 *)((long)puVar14 + uVar4) = 0x2f;
      uVar12 = puVar13[1];
      puVar14 = (undefined8 *)*puVar13;
      if (-1 < (char)*(byte *)((long)puVar13 + 0x17)) {
        uVar12 = (ulong)*(byte *)((long)puVar13 + 0x17);
        puVar14 = puVar13;
      }
      puVar14 = (undefined8 *)
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (&uStack0000000000000008,puVar14,uVar12);
      in_stack_00000028 = puVar14[1];
      in_stack_00000020 = *puVar14;
      in_stack_00000030 = puVar14[2];
      puVar14[1] = 0;
      puVar14[2] = 0;
      *puVar14 = 0;
      func_0x006e3964();
      if (in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if ((long)in_stack_00000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      func_0x006e4860();
      puVar13 = puVar13 + 3;
      uVar12 = _uStack0000000000000068;
    } while( true );
  }
  uVar11 = func_0x0001748c(&uStack0000000000000058);
  func_0x0000aad0(&uStack0000000000000040);
  if ((long)_uStack0000000000000068 < 0) {
    __ZdlPv(uStack0000000000000058);
  }
  uVar11 = __Unwind_Resume(uVar11);
  uVar15 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar15 = func_0x00086db4(uVar15,"isfile",6);
  uVar15 = func_0x00086db4(uVar15," @ ",3);
  uVar15 = func_0x00086db4(uVar15,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar15 = func_0x00086db4(uVar15,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar15,0xf1);
  __ZNKSt3__18ios_base6getlocEv(&pppppppuStack_60,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&pppppppuStack_60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar15 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&pppppppuStack_60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar15);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar15 = func_0x006e67c8(uVar11,1,0);
  uVar12 = _strlen();
  if (uVar12 < 0x7ffffffffffffff8) {
    if (uVar12 < 0x17) {
      uStack_50 = CONCAT17((char)uVar12,(undefined7)uStack_50);
      pppppppuVar16 = &pppppppuStack_60;
      if (uVar12 == 0) goto code_r0x0004cb70;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      pppppppuVar16 = (undefined8 *******)__Znwm(uVar4 + 1);
      uStack_50 = uVar4 + 1 | 0x8000000000000000;
      pppppppuStack_60 = pppppppuVar16;
      uStack_58 = uVar12;
    }
    _memmove(pppppppuVar16,uVar15,uVar12);
code_r0x0004cb70:
    *(undefined1 *)((long)pppppppuVar16 + uVar12) = 0;
    func_0x0004dd60(auStack_78,uVar11,&pppppppuStack_60,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
    bVar7 = false;
    if ((acStack_48[0] != '\0') && (acStack_48[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_48,auStack_78,0);
      bVar7 = acStack_48[0] == '\x01';
    }
    func_0x006e3c24(uVar11,bVar7);
    if (cStack_61 < '\0') {
      __ZdlPv(auStack_78[0]);
    }
    if ((long)uStack_50 < 0) {
      __ZdlPv(pppppppuStack_60);
    }
    return 1;
  }
  uVar11 = func_0x0001748c(&pppppppuStack_60);
  if ((long)uStack_50 < 0) {
    __ZdlPv(pppppppuStack_60);
  }
  uVar11 = __Unwind_Resume(uVar11);
  uVar15 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar15 = func_0x00086db4(uVar15,"isfolder",8);
  uVar15 = func_0x00086db4(uVar15," @ ",3);
  uVar15 = func_0x00086db4(uVar15,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar15 = func_0x00086db4(uVar15,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar15,0xfc);
  __ZNKSt3__18ios_base6getlocEv(&pppppppuStack_e0,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&pppppppuStack_e0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar15 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&pppppppuStack_e0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar15);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar15 = func_0x006e67c8(uVar11,1,0);
  uVar12 = _strlen();
  if (uVar12 < 0x7ffffffffffffff8) {
    if (uVar12 < 0x17) {
      uStack_d0 = CONCAT17((char)uVar12,(undefined7)uStack_d0);
      pppppppuVar16 = &pppppppuStack_e0;
      if (uVar12 == 0) goto code_r0x0004cdbc;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      pppppppuVar16 = (undefined8 *******)__Znwm(uVar4 + 1);
      uStack_d0 = uVar4 + 1 | 0x8000000000000000;
      pppppppuStack_e0 = pppppppuVar16;
      uStack_d8 = uVar12;
    }
    _memmove(pppppppuVar16,uVar15,uVar12);
code_r0x0004cdbc:
    *(undefined1 *)((long)pppppppuVar16 + uVar12) = 0;
    func_0x0004dd60(auStack_f8,uVar11,&pppppppuStack_e0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
    bVar7 = false;
    if ((acStack_c8[0] != '\0') && (acStack_c8[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_c8,auStack_f8,0);
      bVar7 = acStack_c8[0] == '\x02';
    }
    func_0x006e3c24(uVar11,bVar7);
    if (cStack_e1 < '\0') {
      __ZdlPv(auStack_f8[0]);
    }
    if ((long)uStack_d0 < 0) {
      __ZdlPv(pppppppuStack_e0);
    }
    return 1;
  }
  uVar11 = func_0x0001748c(&pppppppuStack_e0);
  if ((long)uStack_d0 < 0) {
    __ZdlPv(pppppppuStack_e0);
  }
  uVar11 = __Unwind_Resume(uVar11);
  uVar15 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar15 = func_0x00086db4(uVar15,"makefolder",10);
  uVar15 = func_0x00086db4(uVar15," @ ",3);
  uVar15 = func_0x00086db4(uVar15,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar15 = func_0x00086db4(uVar15,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar15,0x107);
  __ZNKSt3__18ios_base6getlocEv(&pppppppuStack_160,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&pppppppuStack_160,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar15 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&pppppppuStack_160);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar15);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar15 = func_0x006e67c8(uVar11,1,0);
  uVar12 = _strlen();
  if (uVar12 < 0x7ffffffffffffff8) {
    if (uVar12 < 0x17) {
      uStack_150 = CONCAT17((char)uVar12,(undefined7)uStack_150);
      pppppppuVar16 = &pppppppuStack_160;
      if (uVar12 == 0) goto code_r0x0004d008;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      pppppppuVar16 = (undefined8 *******)__Znwm(uVar4 + 1);
      uStack_150 = uVar4 + 1 | 0x8000000000000000;
      pppppppuStack_160 = pppppppuVar16;
      uStack_158 = uVar12;
    }
    _memmove(pppppppuVar16,uVar15,uVar12);
code_r0x0004d008:
    *(undefined1 *)((long)pppppppuVar16 + uVar12) = 0;
    func_0x0004dd60(auStack_178,uVar11,&pppppppuStack_160,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_148,auStack_178,0);
    if ((acStack_148[0] == '\0') || (acStack_148[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_178,0)
      ;
    }
    if (cStack_161 < '\0') {
      __ZdlPv(auStack_178[0]);
    }
    if ((long)uStack_150 < 0) {
      __ZdlPv(pppppppuStack_160);
    }
    return 0;
  }
  uVar11 = func_0x0001748c(&pppppppuStack_160);
  if ((long)uStack_150 < 0) {
    __ZdlPv(pppppppuStack_160);
    uVar11 = __Unwind_Resume(uVar11);
    __ZNSt3__16localeD1Ev(&pppppppuStack_160);
  }
  uVar11 = __Unwind_Resume(uVar11);
  uVar15 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar15 = func_0x00086db4(uVar15,"delfolder",9);
  uVar15 = func_0x00086db4(uVar15," @ ",3);
  uVar15 = func_0x00086db4(uVar15,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar15 = func_0x00086db4(uVar15,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar15,0x114);
  __ZNKSt3__18ios_base6getlocEv(&pppppppcStack_1e8,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&pppppppcStack_1e8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar15 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&pppppppcStack_1e8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar15);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uStack_1d0 = 0;
  uVar15 = func_0x006e67c8(uVar11,1,&uStack_1d0);
  uVar12 = uStack_1d0;
  if (0x7ffffffffffffff7 < uStack_1d0) {
    uVar11 = func_0x0001748c(&pppppppcStack_1e8);
    if ((long)uStack_1d8 < 0) {
      __ZdlPv(pppppppcStack_1e8);
    }
    uVar11 = __Unwind_Resume(uVar11);
    uVar15 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar15 = func_0x00086db4(uVar15,"delfile",7);
    uVar15 = func_0x00086db4(uVar15," @ ",3);
    uVar15 = func_0x00086db4(uVar15,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar15 = func_0x00086db4(uVar15,":",1);
    plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar15,0x124);
    __ZNKSt3__18ios_base6getlocEv(&pppppppuStack_260,(long)plVar9 + *(long *)(*plVar9 + -0x18));
    plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                (&pppppppuStack_260,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar15 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
    __ZNSt3__16localeD1Ev(&pppppppuStack_260);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar15);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
    uVar15 = func_0x006e67c8(uVar11,1,0);
    uVar12 = _strlen();
    if (uVar12 < 0x7ffffffffffffff8) {
      if (uVar12 < 0x17) {
        uStack_250 = CONCAT17((char)uVar12,(undefined7)uStack_250);
        pppppppuVar16 = &pppppppuStack_260;
        if (uVar12 != 0) goto LAB_0004d4ec;
      }
      else {
        uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
        if ((uVar12 | 7) != 0x17) {
          uVar4 = uVar12 | 7;
        }
        pppppppuVar16 = (undefined8 *******)__Znwm(uVar4 + 1);
        uStack_250 = uVar4 + 1 | 0x8000000000000000;
        pppppppuStack_260 = pppppppuVar16;
        uStack_258 = uVar12;
LAB_0004d4ec:
        _memmove(pppppppuVar16,uVar15,uVar12);
      }
      *(undefined1 *)((long)pppppppuVar16 + uVar12) = 0;
      func_0x0004dd60(auStack_278,uVar11,&pppppppuStack_260,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_248,auStack_278,0);
      pcVar18 = "File does not exist";
      if ((acStack_248[0] == '\0') || (acStack_248[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_248,auStack_278,0);
      if (acStack_248[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_278,0);
        if (cStack_261 < '\0') {
          __ZdlPv(auStack_278[0]);
        }
        if ((long)uStack_250 < 0) {
          __ZdlPv(pppppppuStack_260);
        }
        return 0;
      }
    }
    else {
      func_0x0001748c(&pppppppuStack_260);
    }
    pcVar18 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar11,pcVar18);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar6)();
  }
  if (uStack_1d0 < 0x17) {
    uStack_1d8 = CONCAT17((char)uStack_1d0,(undefined7)uStack_1d8);
    pppppppcVar17 = (char *******)&pppppppcStack_1e8;
    if (uStack_1d0 != 0) goto code_r0x0004d228;
  }
  else {
    uVar4 = (uStack_1d0 & 0xfffffffffffffff8) + 8;
    if ((uStack_1d0 | 7) != 0x17) {
      uVar4 = uStack_1d0 | 7;
    }
    pppppppcVar17 = (char *******)__Znwm(uVar4 + 1);
    uStack_1d8 = uVar4 + 1 | 0x8000000000000000;
    uStack_1e0 = uVar12;
    pppppppcStack_1e8 = pppppppcVar17;
code_r0x0004d228:
    _memmove(pppppppcVar17,uVar15,uVar12);
  }
  *(char *)((long)pppppppcVar17 + uVar12) = '\0';
  if (uStack_1d0 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar11,"Cannot delete workspace directory");
  }
  else {
    uVar12 = uStack_1e0;
    if (-1 < (long)uStack_1d8) {
      uVar12 = uStack_1d8 >> 0x38;
    }
    if (uVar12 == 2) {
      pppppppcVar17 = pppppppcStack_1e8;
      if (-1 < (long)uStack_1d8) {
        pppppppcVar17 = (char *******)&pppppppcStack_1e8;
      }
      iVar8 = _memcmp(pppppppcVar17,"./");
      if (iVar8 == 0) goto code_r0x0004d32c;
    }
    else if (uVar12 == 1) {
      pppppppcVar17 = pppppppcStack_1e8;
      if (-1 < (long)uStack_1d8) {
        pppppppcVar17 = (char *******)&pppppppcStack_1e8;
      }
      if (*(char *)pppppppcVar17 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_200,uVar11,&pppppppcStack_1e8,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_1c8,auStack_200,0);
    if ((acStack_1c8[0] != -1) && (acStack_1c8[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_200,0);
      if (cStack_1e9 < '\0') {
        __ZdlPv(auStack_200[0]);
      }
      if ((long)uStack_1d8 < 0) {
        __ZdlPv(pppppppcStack_1e8);
      }
      return 0;
    }
    func_0x006e644c(uVar11,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar6)();
}

