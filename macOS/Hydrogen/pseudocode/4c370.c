
/* WARNING: Removing unreachable block (ram,0x0004c940) */

bool FUN_0004c370(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 ******ppppppuVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  code *pcVar7;
  bool bVar8;
  int iVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long *plVar12;
  long *plVar13;
  ulong uVar14;
  undefined8 ******ppppppuVar15;
  char ******ppppppcVar16;
  char *pcVar17;
  undefined8 *puVar18;
  undefined8 in_stack_000000a8;
  undefined8 auStack_3b8 [2];
  char cStack_3a1;
  undefined8 ******ppppppuStack_3a0;
  ulong uStack_398;
  undefined8 uStack_390;
  char acStack_388 [8];
  undefined8 auStack_340 [2];
  char cStack_329;
  char ******ppppppcStack_328;
  ulong uStack_320;
  undefined8 uStack_318;
  ulong uStack_310;
  char acStack_308 [8];
  undefined8 auStack_2b8 [2];
  char cStack_2a1;
  undefined8 ******ppppppuStack_2a0;
  ulong uStack_298;
  undefined8 uStack_290;
  char acStack_288 [8];
  undefined8 auStack_238 [2];
  char cStack_221;
  undefined8 ******ppppppuStack_220;
  ulong uStack_218;
  undefined8 uStack_210;
  char acStack_208 [8];
  undefined8 auStack_1b8 [2];
  char cStack_1a1;
  undefined8 ******ppppppuStack_1a0;
  ulong uStack_198;
  undefined8 uStack_190;
  char acStack_188 [8];
  undefined8 ******ppppppuStack_138;
  ulong uStack_130;
  ulong uStack_128;
  undefined8 ******ppppppuStack_120;
  long lStack_118;
  long lStack_110;
  undefined8 *puStack_100;
  undefined8 *puStack_f8;
  undefined8 ******ppppppuStack_e8;
  ulong uStack_e0;
  undefined8 uStack_d8;
  undefined8 auStack_70 [2];
  char cStack_59;
  undefined8 ******ppppppuStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  
  __ZdlPv(in_stack_000000a8);
  uVar10 = __Unwind_Resume();
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"runfile",7);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0xda);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_58,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_58,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_58);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uVar11 = func_0x006e67c8(uVar10,1,0);
  uVar14 = _strlen();
  if (uVar14 < 0x7ffffffffffffff8) {
    if (uVar14 < 0x17) {
      uStack_48 = CONCAT17((char)uVar14,(undefined7)uStack_48);
      ppppppuVar15 = &ppppppuStack_58;
      if (uVar14 == 0) goto code_r0x0004c4d4;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_48 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_58 = ppppppuVar15;
      uStack_50 = uVar14;
    }
    _memmove(ppppppuVar15,uVar11,uVar14);
code_r0x0004c4d4:
    *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
    func_0x0004dd60(auStack_70,uVar10,&ppppppuStack_58,0);
    func_0x006e3d18(uVar10,0xffffd8ee,"loadfile");
    ppppppuVar15 = ppppppuStack_58;
    if (-1 < (long)uStack_48) {
      ppppppuVar15 = &ppppppuStack_58;
    }
    func_0x006e3964(uVar10,ppppppuVar15);
    func_0x006e4c80(uVar10,1,0xffffffff);
    iVar9 = func_0x006e21f8(uVar10,0xffffffff);
    if (iVar9 == 0) {
      func_0x006e1d54(uVar10,0xfffffffe);
    }
    else {
      func_0x006e3d18(uVar10,0xffffd8ee,"task");
      func_0x006e3d18(uVar10,0xffffffff,"spawn");
      func_0x006e2154(uVar10,0xfffffffd);
      func_0x006e4c80(uVar10,1,0);
    }
    if (cStack_59 < '\0') {
      __ZdlPv(auStack_70[0]);
    }
    if ((long)uStack_48 < 0) {
      __ZdlPv(ppppppuStack_58);
    }
    return iVar9 == 0;
  }
  uVar10 = func_0x0001748c(&ppppppuStack_58);
  if ((long)uStack_48 < 0) {
    __ZdlPv(ppppppuStack_58);
  }
  uVar10 = __Unwind_Resume(uVar10);
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"listfiles",9);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0x144);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_e8,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_e8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_e8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uVar11 = func_0x006e67c8(uVar10,1,0);
  uVar14 = _strlen();
  if (uVar14 < 0x7ffffffffffffff8) {
    if (uVar14 < 0x17) {
      uStack_d8 = CONCAT17((char)uVar14,(undefined7)uStack_d8);
      ppppppuVar15 = &ppppppuStack_e8;
      if (uVar14 == 0) goto code_r0x0004c79c;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_d8 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_e8 = ppppppuVar15;
      uStack_e0 = uVar14;
    }
    _memmove(ppppppuVar15,uVar11,uVar14);
code_r0x0004c79c:
    *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
    func_0x0004f3d0(&puStack_100,uVar10,&ppppppuStack_e8);
    func_0x006e4118(uVar10,0,0);
    puVar6 = puStack_f8;
    if (puStack_100 != puStack_f8) {
      iVar9 = 1;
      puVar18 = puStack_100;
      do {
        uVar4 = uStack_d8;
        uVar14 = uStack_e0;
        if (-1 < (long)uStack_d8) {
          uVar14 = uStack_d8 >> 0x38;
        }
        uVar1 = uVar14 + 1;
        if (0x7ffffffffffffff7 < uVar1) {
          func_0x0001748c(&ppppppuStack_138);
                    /* WARNING: Does not return */
          pcVar7 = (code *)SoftwareBreakpoint(1,0x4c998);
          (*pcVar7)();
        }
        if (uVar1 < 0x17) {
          uStack_130 = 0;
          ppppppuStack_138 = (undefined8 ******)0x0;
          ppppppuVar15 = &ppppppuStack_138;
          uStack_128 = uVar1 << 0x38;
          if (uVar14 != 0) goto code_r0x0004c84c;
        }
        else {
          uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
          if ((uVar1 | 7) != 0x17) {
            uVar2 = uVar1 | 7;
          }
          ppppppuVar15 = (undefined8 ******)__Znwm(uVar2 + 1);
          uStack_128 = uVar2 + 1 | 0x8000000000000000;
          ppppppuStack_138 = ppppppuVar15;
          uStack_130 = uVar1;
code_r0x0004c84c:
          ppppppuVar3 = ppppppuStack_e8;
          if (-1 < (long)uVar4) {
            ppppppuVar3 = &ppppppuStack_e8;
          }
          _memmove(ppppppuVar15,ppppppuVar3,uVar14);
        }
        *(undefined2 *)((long)ppppppuVar15 + uVar14) = 0x2f;
        uVar14 = puVar18[1];
        puVar5 = (undefined8 *)*puVar18;
        if (-1 < (char)*(byte *)((long)puVar18 + 0x17)) {
          uVar14 = (ulong)*(byte *)((long)puVar18 + 0x17);
          puVar5 = puVar18;
        }
        plVar12 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                    (&ppppppuStack_138,puVar5,uVar14);
        lStack_118 = plVar12[1];
        ppppppuStack_120 = (undefined8 ******)*plVar12;
        lStack_110 = plVar12[2];
        plVar12[1] = 0;
        plVar12[2] = 0;
        *plVar12 = 0;
        ppppppuVar15 = ppppppuStack_120;
        if (-1 < lStack_110) {
          ppppppuVar15 = &ppppppuStack_120;
        }
        func_0x006e3964(uVar10,ppppppuVar15);
        if (lStack_110 < 0) {
          __ZdlPv(ppppppuStack_120);
        }
        if ((long)uStack_128 < 0) {
          __ZdlPv(ppppppuStack_138);
        }
        func_0x006e4860(uVar10,0xfffffffe,iVar9);
        puVar18 = puVar18 + 3;
        iVar9 = iVar9 + 1;
      } while (puVar18 != puVar6);
    }
    if (puStack_100 != (undefined8 *)0x0) {
      for (; puStack_f8 != puStack_100; puStack_f8 = puStack_f8 + -3) {
      }
      __ZdlPv(puStack_100);
    }
    if ((long)uStack_d8 < 0) {
      __ZdlPv(ppppppuStack_e8);
    }
    return true;
  }
  uVar10 = func_0x0001748c(&ppppppuStack_e8);
  func_0x0000aad0(&puStack_100);
  if (uStack_d8._7_1_ < '\0') {
    __ZdlPv(ppppppuStack_e8);
  }
  uVar10 = __Unwind_Resume(uVar10);
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"isfile",6);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0xf1);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_1a0,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_1a0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_1a0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uVar11 = func_0x006e67c8(uVar10,1,0);
  uVar14 = _strlen();
  if (uVar14 < 0x7ffffffffffffff8) {
    if (uVar14 < 0x17) {
      uStack_190 = CONCAT17((char)uVar14,(undefined7)uStack_190);
      ppppppuVar15 = &ppppppuStack_1a0;
      if (uVar14 == 0) goto code_r0x0004cb70;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_190 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_1a0 = ppppppuVar15;
      uStack_198 = uVar14;
    }
    _memmove(ppppppuVar15,uVar11,uVar14);
code_r0x0004cb70:
    *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
    func_0x0004dd60(auStack_1b8,uVar10,&ppppppuStack_1a0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_188,auStack_1b8,0);
    bVar8 = false;
    if ((acStack_188[0] != '\0') && (acStack_188[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_188,auStack_1b8,0);
      bVar8 = acStack_188[0] == '\x01';
    }
    func_0x006e3c24(uVar10,bVar8);
    if (cStack_1a1 < '\0') {
      __ZdlPv(auStack_1b8[0]);
    }
    if ((long)uStack_190 < 0) {
      __ZdlPv(ppppppuStack_1a0);
    }
    return true;
  }
  uVar10 = func_0x0001748c(&ppppppuStack_1a0);
  if ((long)uStack_190 < 0) {
    __ZdlPv(ppppppuStack_1a0);
  }
  uVar10 = __Unwind_Resume(uVar10);
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"isfolder",8);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0xfc);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_220,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_220,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_220);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uVar11 = func_0x006e67c8(uVar10,1,0);
  uVar14 = _strlen();
  if (uVar14 < 0x7ffffffffffffff8) {
    if (uVar14 < 0x17) {
      uStack_210 = CONCAT17((char)uVar14,(undefined7)uStack_210);
      ppppppuVar15 = &ppppppuStack_220;
      if (uVar14 == 0) goto code_r0x0004cdbc;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_210 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_220 = ppppppuVar15;
      uStack_218 = uVar14;
    }
    _memmove(ppppppuVar15,uVar11,uVar14);
code_r0x0004cdbc:
    *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
    func_0x0004dd60(auStack_238,uVar10,&ppppppuStack_220,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_208,auStack_238,0);
    bVar8 = false;
    if ((acStack_208[0] != '\0') && (acStack_208[0] != -1)) {
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_208,auStack_238,0);
      bVar8 = acStack_208[0] == '\x02';
    }
    func_0x006e3c24(uVar10,bVar8);
    if (cStack_221 < '\0') {
      __ZdlPv(auStack_238[0]);
    }
    if ((long)uStack_210 < 0) {
      __ZdlPv(ppppppuStack_220);
    }
    return true;
  }
  uVar10 = func_0x0001748c(&ppppppuStack_220);
  if ((long)uStack_210 < 0) {
    __ZdlPv(ppppppuStack_220);
  }
  uVar10 = __Unwind_Resume(uVar10);
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"makefolder",10);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0x107);
  __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_2a0,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppuStack_2a0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppuStack_2a0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uVar11 = func_0x006e67c8(uVar10,1,0);
  uVar14 = _strlen();
  if (uVar14 < 0x7ffffffffffffff8) {
    if (uVar14 < 0x17) {
      uStack_290 = CONCAT17((char)uVar14,(undefined7)uStack_290);
      ppppppuVar15 = &ppppppuStack_2a0;
      if (uVar14 == 0) goto code_r0x0004d008;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
      uStack_290 = uVar4 + 1 | 0x8000000000000000;
      ppppppuStack_2a0 = ppppppuVar15;
      uStack_298 = uVar14;
    }
    _memmove(ppppppuVar15,uVar11,uVar14);
code_r0x0004d008:
    *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
    func_0x0004dd60(auStack_2b8,uVar10,&ppppppuStack_2a0,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_288,auStack_2b8,0);
    if ((acStack_288[0] == '\0') || (acStack_288[0] == -1)) {
      __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(auStack_2b8,0)
      ;
    }
    if (cStack_2a1 < '\0') {
      __ZdlPv(auStack_2b8[0]);
    }
    if ((long)uStack_290 < 0) {
      __ZdlPv(ppppppuStack_2a0);
    }
    return false;
  }
  uVar10 = func_0x0001748c(&ppppppuStack_2a0);
  if ((long)uStack_290 < 0) {
    __ZdlPv(ppppppuStack_2a0);
    uVar10 = __Unwind_Resume(uVar10);
    __ZNSt3__16localeD1Ev(&ppppppuStack_2a0);
  }
  uVar10 = __Unwind_Resume(uVar10);
  uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar11 = func_0x00086db4(uVar11,"delfolder",9);
  uVar11 = func_0x00086db4(uVar11," @ ",3);
  uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar11 = func_0x00086db4(uVar11,":",1);
  plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0x114);
  __ZNKSt3__18ios_base6getlocEv(&ppppppcStack_328,(long)plVar12 + *(long *)(*plVar12 + -0x18));
  plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&ppppppcStack_328,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
  __ZNSt3__16localeD1Ev(&ppppppcStack_328);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
  uStack_310 = 0;
  uVar11 = func_0x006e67c8(uVar10,1,&uStack_310);
  uVar14 = uStack_310;
  if (0x7ffffffffffffff7 < uStack_310) {
    uVar10 = func_0x0001748c(&ppppppcStack_328);
    if ((long)uStack_318 < 0) {
      __ZdlPv(ppppppcStack_328);
    }
    uVar10 = __Unwind_Resume(uVar10);
    uVar11 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
    uVar11 = func_0x00086db4(uVar11,"delfile",7);
    uVar11 = func_0x00086db4(uVar11," @ ",3);
    uVar11 = func_0x00086db4(uVar11,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
    uVar11 = func_0x00086db4(uVar11,":",1);
    plVar12 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar11,0x124);
    __ZNKSt3__18ios_base6getlocEv(&ppppppuStack_3a0,(long)plVar12 + *(long *)(*plVar12 + -0x18));
    plVar13 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                (&ppppppuStack_3a0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    uVar11 = (**(code **)(*plVar13 + 0x38))(plVar13,10);
    __ZNSt3__16localeD1Ev(&ppppppuStack_3a0);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar12,uVar11);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar12);
    uVar11 = func_0x006e67c8(uVar10,1,0);
    uVar14 = _strlen();
    if (uVar14 < 0x7ffffffffffffff8) {
      if (uVar14 < 0x17) {
        uStack_390 = CONCAT17((char)uVar14,(undefined7)uStack_390);
        ppppppuVar15 = &ppppppuStack_3a0;
        if (uVar14 != 0) goto code_r0x0004d4ec;
      }
      else {
        uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
        if ((uVar14 | 7) != 0x17) {
          uVar4 = uVar14 | 7;
        }
        ppppppuVar15 = (undefined8 ******)__Znwm(uVar4 + 1);
        uStack_390 = uVar4 + 1 | 0x8000000000000000;
        ppppppuStack_3a0 = ppppppuVar15;
        uStack_398 = uVar14;
code_r0x0004d4ec:
        _memmove(ppppppuVar15,uVar11,uVar14);
      }
      *(undefined1 *)((long)ppppppuVar15 + uVar14) = 0;
      func_0x0004dd60(auStack_3b8,uVar10,&ppppppuStack_3a0,0);
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_388,auStack_3b8,0);
      pcVar17 = "File does not exist";
      if ((acStack_388[0] == '\0') || (acStack_388[0] == -1)) goto code_r0x0004d5bc;
      __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_388,auStack_3b8,0);
      if (acStack_388[0] == '\x01') {
        __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(auStack_3b8,0);
        if (cStack_3a1 < '\0') {
          __ZdlPv(auStack_3b8[0]);
        }
        if ((long)uStack_390 < 0) {
          __ZdlPv(ppppppuStack_3a0);
        }
        return false;
      }
    }
    else {
      func_0x0001748c(&ppppppuStack_3a0);
    }
    pcVar17 = "Not a file";
code_r0x0004d5bc:
    func_0x006e644c(uVar10,pcVar17);
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar7)();
  }
  if (uStack_310 < 0x17) {
    uStack_318 = CONCAT17((char)uStack_310,(undefined7)uStack_318);
    ppppppcVar16 = (char ******)&ppppppcStack_328;
    if (uStack_310 != 0) goto code_r0x0004d228;
  }
  else {
    uVar4 = (uStack_310 & 0xfffffffffffffff8) + 8;
    if ((uStack_310 | 7) != 0x17) {
      uVar4 = uStack_310 | 7;
    }
    ppppppcVar16 = (char ******)__Znwm(uVar4 + 1);
    uStack_318 = uVar4 + 1 | 0x8000000000000000;
    uStack_320 = uVar14;
    ppppppcStack_328 = ppppppcVar16;
code_r0x0004d228:
    _memmove(ppppppcVar16,uVar11,uVar14);
  }
  *(char *)((long)ppppppcVar16 + uVar14) = '\0';
  if (uStack_310 == 0) {
code_r0x0004d32c:
    func_0x006e644c(uVar10,"Cannot delete workspace directory");
  }
  else {
    uVar14 = uStack_320;
    if (-1 < (long)uStack_318) {
      uVar14 = uStack_318 >> 0x38;
    }
    if (uVar14 == 2) {
      ppppppcVar16 = ppppppcStack_328;
      if (-1 < (long)uStack_318) {
        ppppppcVar16 = (char ******)&ppppppcStack_328;
      }
      iVar9 = _memcmp(ppppppcVar16,"./");
      if (iVar9 == 0) goto code_r0x0004d32c;
    }
    else if (uVar14 == 1) {
      ppppppcVar16 = ppppppcStack_328;
      if (-1 < (long)uStack_318) {
        ppppppcVar16 = (char ******)&ppppppcStack_328;
      }
      if (*(char *)ppppppcVar16 == '.') goto code_r0x0004d32c;
    }
    func_0x0004dd60(auStack_340,uVar10,&ppppppcStack_328,0);
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(acStack_308,auStack_340,0);
    if ((acStack_308[0] != -1) && (acStack_308[0] != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE(auStack_340,0);
      if (cStack_329 < '\0') {
        __ZdlPv(auStack_340[0]);
      }
      if ((long)uStack_318 < 0) {
        __ZdlPv(ppppppcStack_328);
      }
      return false;
    }
    func_0x006e644c(uVar10,"Directory does not exist");
  }
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar7)();
}

