
/* WARNING: Removing unreachable block (ram,0x0004c940) */

bool FUN_0004c460(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 ******ppppppuVar3;
  ulong uVar4;
  undefined8 *puVar5;
  code *pcVar6;
  bool bVar7;
  int iVar8;
  undefined8 uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long *plVar13;
  long *plVar14;
  undefined8 ******ppppppuVar15;
  char ******ppppppcVar16;
  char *pcVar17;
  undefined8 *puVar18;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  undefined8 auStack_348 [2];
  char cStack_331;
  undefined8 ******ppppppuStack_330;
  ulong uStack_328;
  undefined8 uStack_320;
  char acStack_318 [8];
  undefined8 auStack_2d0 [2];
  char cStack_2b9;
  char ******ppppppcStack_2b8;
  ulong uStack_2b0;
  undefined8 uStack_2a8;
  ulong uStack_2a0;
  char acStack_298 [8];
  undefined8 auStack_248 [2];
  char cStack_231;
  undefined8 ******ppppppuStack_230;
  ulong uStack_228;
  undefined8 uStack_220;
  char acStack_218 [8];
  undefined8 auStack_1c8 [2];
  char cStack_1b1;
  undefined8 ******ppppppuStack_1b0;
  ulong uStack_1a8;
  undefined8 uStack_1a0;
  char acStack_198 [8];
  undefined8 auStack_148 [2];
  char cStack_131;
  undefined8 ******ppppppuStack_130;
  ulong uStack_128;
  undefined8 uStack_120;
  char acStack_118 [8];
  undefined8 ******ppppppuStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  undefined8 ******ppppppuStack_b0;
  long lStack_a8;
  long lStack_a0;
  undefined8 *puStack_90;
  undefined8 *puStack_88;
  undefined8 ******ppppppuStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  
  uVar9 = func_0x006e67c8();
  uVar10 = _strlen();
  if (uVar10 < 0x7ffffffffffffff8) {
    if (uVar10 < 0x17) {
      _uStack0000000000000028 = CONCAT17((char)uVar10,uStack0000000000000028);
      puVar11 = &uStack0000000000000018;
      if (uVar10 == 0) goto LAB_0004c4d4;
    }
    else {
      uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar4 = uVar10 | 7;
      }
      puVar11 = (undefined8 *)__Znwm(uVar4 + 1);
      _uStack0000000000000028 = uVar4 + 1 | 0x8000000000000000;
      uStack0000000000000018 = puVar11;
      in_stack_00000020 = uVar10;
    }
    _memmove(puVar11,uVar9,uVar10);
LAB_0004c4d4:
    *(undefined1 *)((long)puVar11 + uVar10) = 0;
    func_0x0004dd60();
    func_0x006e3d18();
    func_0x006e3964();
    func_0x006e4c80();
    iVar8 = func_0x006e21f8();
    if (iVar8 == 0) {
      func_0x006e1d54();
    }
    else {
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e2154();
      func_0x006e4c80();
    }
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
    }
    if ((long)_uStack0000000000000028 < 0) {
      __ZdlPv(uStack0000000000000018);
    }
    return iVar8 == 0;
  }
  uVar9 = func_0x0001748c(&uStack0000000000000018);
  if ((long)_uStack0000000000000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  uVar9 = __Unwind_Resume(uVar9);
  uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar12 = func_0x00086db4(uVar12,"listfiles",9);
  uVar12 = func_0x00086db4(uVar12," @ ",3);
  uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar12 = func_0x00086db4(uVar12,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0x144);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_78,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_78,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_78);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uVar12 = func_0x006e67c8(uVar9,1,0);
  uVar10 = _strlen();
  if (uVar10 < 0x7ffffffffffffff8) {
    if (uVar10 < 0x17) {
      uStack_68 = CONCAT17((char)uVar10,(undefined7)uStack_68);
      ppppppuVar15 = &ppppppuStack_78;
      if (uVar10 == 0) goto code_r0x0004c79c;
    }
    else {
      uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar4 = uVar10 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_68 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_78 = ppppppuVar15;
      uStack_70 = uVar10;
    }
    _memmove(ppppppuVar15,uVar12,uVar10);
code_r0x0004c79c:
    *(undefined1 *)((long)ppppppuVar15 + uVar10) = 0;
    func_0x0004f3d0(&puStack_90,uVar9,&ppppppuStack_78);
    func_0x006e4118(uVar9,0,0);
    puVar11 = puStack_88;
    if (puStack_90 != puStack_88) {
      iVar8 = 1;
      puVar18 = puStack_90;
      do {
        uVar4 = uStack_68;
        uVar10 = uStack_70;
        if (-1 < (long)uStack_68) {
          uVar10 = uStack_68 >> 0x38;
        }
        uVar1 = uVar10 + 1;
        if (0x7ffffffffffffff7 < uVar1) {
          func_0x0001748c(&ppppppuStack_c8);
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x4c998);
          (*pcVar6)();
        }
        if (uVar1 < 0x17) {
          uStack_c0 = 0;
          ppppppuStack_c8 = (undefined8 ******)0x0;
          ppppppuVar15 = &ppppppuStack_c8;
          uStack_b8 = uVar1 << 0x38;
          if (uVar10 != 0) goto code_r0x0004c84c;
        }
        else {
          uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
          if ((uVar1 | 7) != 0x17) {
            uVar2 = uVar1 | 7;
          }
          ppppppuVar15 = (undefined8 ******)__Znwm(uVar2 + 1);
          uStack_b8 = uVar2 + 1 | 0x8000000000000000;
          ppppppuStack_c8 = ppppppuVar15;
          uStack_c0 = uVar1;
code_r0x0004c84c:
          ppppppuVar3 = ppppppuStack_78;
          if (-1 < (long)uVar4) {
            ppppppuVar3 = &ppppppuStack_78;
          }
          _memmove(ppppppuVar15,ppppppuVar3,uVar10);
        }
        *(undefined2 *)((long)ppppppuVar15 + uVar10) = 0x2f;
        uVar10 = puVar18[1];
        puVar5 = (undefined8 *)*puVar18;
        if (-1 < (char)*(byte *)((long)puVar18 + 0x17)) {
          uVar10 = (ulong)*(byte *)((long)puVar18 + 0x17);
          puVar5 = puVar18;
        }
        plVar13 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                    (&ppppppuStack_c8,puVar5,uVar10);
        lStack_a8 = plVar13[1];
        ppppppuStack_b0 = (undefined8 ******)*plVar13;
        lStack_a0 = plVar13[2];
        plVar13[1] = 0;
        plVar13[2] = 0;
        *plVar13 = 0;
        ppppppuVar15 = ppppppuStack_b0;
        if (-1 < lStack_a0) {
          ppppppuVar15 = &ppppppuStack_b0;
        }
        func_0x006e3964(uVar9,ppppppuVar15);
        if (lStack_a0 < 0) {
          __ZdlPv(ppppppuStack_b0);
        }
        if ((long)uStack_b8 < 0) {
          __ZdlPv(ppppppuStack_c8);
        }
        func_0x006e4860(uVar9,0xfffffffe,iVar8);
        puVar18 = puVar18 + 3;
        iVar8 = iVar8 + 1;
      } while (puVar18 != puVar11);
    }
    if (puStack_90 != (undefined8 *)0x0) {
      for (; puStack_88 != puStack_90; puStack_88 = puStack_88 + -3) {
      }
      __ZdlPv(puStack_90);
    }
    if ((long)uStack_68 < 0) {
      __ZdlPv(ppppppuStack_78);
    }
    return true;
  }
  uVar9 = func_0x0001748c(&ppppppuStack_78);
  func_0x0000aad0(&puStack_90);
  if (uStack_68._7_1_ < '\0') {
    __ZdlPv(ppppppuStack_78);
  }
  uVar9 = __Unwind_Resume(uVar9);
  uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar12 = func_0x00086db4(uVar12,"isfile",6);
  uVar12 = func_0x00086db4(uVar12," @ ",3);
  uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar12 = func_0x00086db4(uVar12,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0xf1);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_130,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_130,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_130);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uVar12 = func_0x006e67c8(uVar9,1,0);
  uVar10 = _strlen();
  if (uVar10 < 0x7ffffffffffffff8) {
    if (uVar10 < 0x17) {
      uStack_120 = CONCAT17((char)uVar10,(undefined7)uStack_120);
      ppppppuVar15 = &ppppppuStack_130;
      if (uVar10 == 0) goto code_r0x0004cb70;
    }
    else {
      uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar4 = uVar10 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_120 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_130 = ppppppuVar15;
      uStack_128 = uVar10;
    }
    _memmove(ppppppuVar15,uVar12,uVar10);
code_r0x0004cb70:
    *(undefined1 *)((long)ppppppuVar15 + uVar10) = 0;
    func_0x0004dd60(auStack_148,uVar9,&ppppppuStack_130,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_118,auStack_148,0);
    bVar7 = false;
    if ((acStack_118[0] != '\0') && (acStack_118[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_118,auStack_148,0);
      bVar7 = acStack_118[0] == '\x01';
    }
    func_0x006e3c24(uVar9,bVar7);
    if (cStack_131 < '\0') {
      __ZdlPv(auStack_148[0]);
    }
    if ((long)uStack_120 < 0) {
      __ZdlPv(ppppppuStack_130);
    }
    return true;
  }
  uVar9 = func_0x0001748c(&ppppppuStack_130);
  if ((long)uStack_120 < 0) {
    __ZdlPv(ppppppuStack_130);
  }
  uVar9 = __Unwind_Resume(uVar9);
  uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar12 = func_0x00086db4(uVar12,"isfolder",8);
  uVar12 = func_0x00086db4(uVar12," @ ",3);
  uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar12 = func_0x00086db4(uVar12,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0xfc);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_1b0,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_1b0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_1b0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uVar12 = func_0x006e67c8(uVar9,1,0);
  uVar10 = _strlen();
  if (uVar10 < 0x7ffffffffffffff8) {
    if (uVar10 < 0x17) {
      uStack_1a0 = CONCAT17((char)uVar10,(undefined7)uStack_1a0);
      ppppppuVar15 = &ppppppuStack_1b0;
      if (uVar10 == 0) goto code_r0x0004cdbc;
    }
    else {
      uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar4 = uVar10 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_1a0 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_1b0 = ppppppuVar15;
      uStack_1a8 = uVar10;
    }
    _memmove(ppppppuVar15,uVar12,uVar10);
code_r0x0004cdbc:
    *(undefined1 *)((long)ppppppuVar15 + uVar10) = 0;
    func_0x0004dd60(auStack_1c8,uVar9,&ppppppuStack_1b0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_198,auStack_1c8,0);
    bVar7 = false;
    if ((acStack_198[0] != '\0') && (acStack_198[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_198,auStack_1c8,0);
      bVar7 = acStack_198[0] == '\x02';
    }
    func_0x006e3c24(uVar9,bVar7);
    if (cStack_1b1 < '\0') {
      __ZdlPv(auStack_1c8[0]);
    }
    if ((long)uStack_1a0 < 0) {
      __ZdlPv(ppppppuStack_1b0);
    }
    return true;
  }
  uVar9 = func_0x0001748c(&ppppppuStack_1b0);
  if ((long)uStack_1a0 < 0) {
    __ZdlPv(ppppppuStack_1b0);
  }
  uVar9 = __Unwind_Resume(uVar9);
  uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar12 = func_0x00086db4(uVar12,"makefolder",10);
  uVar12 = func_0x00086db4(uVar12," @ ",3);
  uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar12 = func_0x00086db4(uVar12,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0x107);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_230,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_230,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_230);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uVar12 = func_0x006e67c8(uVar9,1,0);
  uVar10 = _strlen();
  if (uVar10 < 0x7ffffffffffffff8) {
    if (uVar10 < 0x17) {
      uStack_220 = CONCAT17((char)uVar10,(undefined7)uStack_220);
      ppppppuVar15 = &ppppppuStack_230;
      if (uVar10 == 0) goto code_r0x0004d008;
    }
    else {
      uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar4 = uVar10 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_220 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_230 = ppppppuVar15;
      uStack_228 = uVar10;
    }
    _memmove(ppppppuVar15,uVar12,uVar10);
code_r0x0004d008:
    *(undefined1 *)((long)ppppppuVar15 + uVar10) = 0;
    func_0x0004dd60(auStack_248,uVar9,&ppppppuStack_230,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_218,auStack_248,0);
    if ((acStack_218[0] == '\0') || (acStack_218[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_248,0)
      ;
    }
    if (cStack_231 < '\0') {
      __ZdlPv(auStack_248[0]);
    }
    if ((long)uStack_220 < 0) {
      __ZdlPv(ppppppuStack_230);
    }
    return false;
  }
  uVar9 = func_0x0001748c(&ppppppuStack_230);
  if ((long)uStack_220 < 0) {
    __ZdlPv(ppppppuStack_230);
    uVar9 = __Unwind_Resume(uVar9);
    __ZNSt3__16localeD1Ev(&ppppppuStack_230);
  }
  uVar9 = __Unwind_Resume(uVar9);
  uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar12 = func_0x00086db4(uVar12,"delfolder",9);
  uVar12 = func_0x00086db4(uVar12," @ ",3);
  uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar12 = func_0x00086db4(uVar12,":",1);
  plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppppcStack_2b8,(long)plVar13 + *(long *)(*plVar13 + -0x18));
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppcStack_2b8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&ppppppcStack_2b8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
  uStack_2a0 = 0;
  uVar12 = func_0x006e67c8(uVar9,1,&uStack_2a0);
  uVar10 = uStack_2a0;
  if (0x7ffffffffffffff7 < uStack_2a0) {
    uVar9 = func_0x0001748c(&ppppppcStack_2b8);
    if ((long)uStack_2a8 < 0) {
      __ZdlPv(ppppppcStack_2b8);
    }
    uVar9 = __Unwind_Resume(uVar9);
    uVar12 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar12 = func_0x00086db4(uVar12,"delfile",7);
    uVar12 = func_0x00086db4(uVar12," @ ",3);
    uVar12 = func_0x00086db4(uVar12,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar12 = func_0x00086db4(uVar12,":",1);
    plVar13 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar12,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_330,(long)plVar13 + *(long *)(*plVar13 + -0x18));
    plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                (&ppppppuStack_330,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar12 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
    __ZNSt3__16localeD1Ev(&ppppppuStack_330);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar13,uVar12);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar13);
    uVar12 = func_0x006e67c8(uVar9,1,0);
    uVar10 = _strlen();
    if (uVar10 < 0x7ffffffffffffff8) {
      if (uVar10 < 0x17) {
        uStack_320 = CONCAT17((char)uVar10,(undefined7)uStack_320);
        ppppppuVar15 = &ppppppuStack_330;
        if (uVar10 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar4 = (uVar10 & 0xfffffffffffffff8) + 8;
        if ((uVar10 | 7) != 0x17) {
          uVar4 = uVar10 | 7;
        }
        ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
        uStack_320 = uVar4 + 1 | 0x8000000000000000;
        ppppppuStack_330 = ppppppuVar15;
        uStack_328 = uVar10;
code_r0x0004d4ec:
        _memmove(ppppppuVar15,uVar12,uVar10);
      }
      *(undefined1 *)((long)ppppppuVar15 + uVar10) = 0;
      func_0x0004dd60(auStack_348,uVar9,&ppppppuStack_330,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_318,auStack_348,0);
      pcVar17 = "File does not exist";
      if ((acStack_318[0] == '\0') || (acStack_318[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_318,auStack_348,0);
      if (acStack_318[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_348,0);
        if (cStack_331 < '\0') {
          __ZdlPv(auStack_348[0]);
        }
        if ((long)uStack_320 < 0) {
          __ZdlPv(ppppppuStack_330);
        }
        return false;
      }
    }
    else {
      func_0x0001748c(&ppppppuStack_330);
    }
    pcVar17 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar9,pcVar17);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar6)();
  }
  if (uStack_2a0 < 0x17) {
    uStack_2a8 = CONCAT17((char)uStack_2a0,(undefined7)uStack_2a8);
    ppppppcVar16 = (char ******)&ppppppcStack_2b8;
    if (uStack_2a0 != 0) goto code_r0x0004d228;
  }
  else {
    uVar4 = (uStack_2a0 & 0xfffffffffffffff8) + 8;
    if ((uStack_2a0 | 7) != 0x17) {
      uVar4 = uStack_2a0 | 7;
    }
    ppppppcVar16 = (char ******)__Znwm(uVar4 + 1);
    uStack_2a8 = uVar4 + 1 | 0x8000000000000000;
    uStack_2b0 = uVar10;
    ppppppcStack_2b8 = ppppppcVar16;
code_r0x0004d228:
    _memmove(ppppppcVar16,uVar12,uVar10);
  }
  *(char *)((long)ppppppcVar16 + uVar10) = '\0';
  if (uStack_2a0 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar9,"Cannot delete workspace directory");
  }
  else {
    uVar10 = uStack_2b0;
    if (-1 < (long)uStack_2a8) {
      uVar10 = uStack_2a8 >> 0x38;
    }
    if (uVar10 == 2) {
      ppppppcVar16 = ppppppcStack_2b8;
      if (-1 < (long)uStack_2a8) {
        ppppppcVar16 = (char ******)&ppppppcStack_2b8;
      }
      iVar8 = _memcmp(ppppppcVar16,"./");
      if (iVar8 == 0) goto code_r0x0004d32c;
    }
    else if (uVar10 == 1) {
      ppppppcVar16 = ppppppcStack_2b8;
      if (-1 < (long)uStack_2a8) {
        ppppppcVar16 = (char ******)&ppppppcStack_2b8;
      }
      if (*(char *)ppppppcVar16 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_2d0,uVar9,&ppppppcStack_2b8,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_298,auStack_2d0,0);
    if ((acStack_298[0] != -1) && (acStack_298[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_2d0,0);
      if (cStack_2b9 < '\0') {
        __ZdlPv(auStack_2d0[0]);
      }
      if ((long)uStack_2a8 < 0) {
        __ZdlPv(ppppppcStack_2b8);
      }
      return false;
    }
    func_0x006e644c(uVar9,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar6)();
}

