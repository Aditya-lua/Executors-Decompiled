
undefined8 FUN_0003ce40(undefined8 param_1)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  int *piVar4;
  code *pcVar5;
  undefined1 uVar6;
  int iVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong uVar14;
  int *piVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  byte bVar19;
  int *piVar20;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined7 uStack0000000000000090;
  char cStack0000000000000097;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  undefined7 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined *in_stack_000000d0;
  long *in_stack_000000e0;
  long lStack0000000000000130;
  
  lStack0000000000000130 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"crypt_decrypt",0xd);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,399);
  __ZNKSt3__18ios_base6getlocEv(&uStack00000000000000c8,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack00000000000000c8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&uStack00000000000000c8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar8 = func_0x006e67c8(param_1,1,0);
  uVar11 = func_0x006e67c8(param_1,2,0);
  uVar12 = func_0x006e67c8(param_1,3,0);
  uVar13 = func_0x006e67c8(param_1,4,0);
  uVar14 = _strlen();
  if (0x7ffffffffffffff7 < uVar14) {
    func_0x0001748c(&uStack00000000000000b0);
    goto LAB_0003da3c;
  }
  if (uVar14 < 0x17) {
    _uStack00000000000000c0 = CONCAT17((char)uVar14,uStack00000000000000c0);
    piVar15 = (int *)&uStack00000000000000b0;
    if (uVar14 != 0) goto code_r0x0003cfc0;
  }
  else {
    uVar1 = (uVar14 & 0xfffffffffffffff8) + 8;
    if ((uVar14 | 7) != 0x17) {
      uVar1 = uVar14 | 7;
    }
    piVar15 = (int *)__Znwm(uVar1 + 1);
    _uStack00000000000000c0 = uVar1 + 1 | 0x8000000000000000;
    uStack00000000000000b0 = piVar15;
    in_stack_000000b8 = uVar14;
code_r0x0003cfc0:
    _memmove(piVar15,uVar13,uVar14);
  }
  *(undefined1 *)((long)piVar15 + uVar14) = 0;
  uStack0000000000000098 = (undefined8 *)0x0;
  in_stack_000000a0 = 0;
  in_stack_000000a8 = 0;
  uVar13 = _strlen(uVar11);
  puVar16 = (undefined8 *)__Znwm(0x68);
  puVar17 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar17,0);
  *puVar17 = &UNK_009f9e90;
  puVar17[1] = &UNK_009fa020;
  puVar17[3] = &uStack0000000000000098;
  uVar18 = func_0x006169b8();
  func_0x0003e7a4(puVar16,uVar18,6,puVar17);
  *puVar16 = &UNK_009f7858;
  puVar16[1] = &UNK_009f7a08;
  func_0x0003f450(&uStack00000000000000c8,uVar11,uVar13,1,puVar16);
  if ((long)in_stack_000000a8 < 0) {
    if (in_stack_000000a0 != 0x20) goto code_r0x0003d0d8;
  }
  else if (in_stack_000000a8._7_1_ != ' ') {
code_r0x0003d0d8:
    func_0x006e644c(param_1,"Key must decode to 32 bytes (256 bits) as per spec, got %zu bytes");
    goto LAB_0003da3c;
  }
  uStack00000000000000c8 = (long *)&UNK_00a0c238;
  in_stack_000000d0 = &UNK_00a0c3e0;
  if (in_stack_000000e0 != (long *)0x0) {
    (**(code **)(*in_stack_000000e0 + 8))();
  }
  uStack0000000000000080 = (undefined8 *)0x0;
  in_stack_00000088 = 0;
  _uStack0000000000000090 = 0;
  if ((long)_uStack00000000000000c0 < 0) {
    func_0x00017634(&uStack0000000000000060,uStack00000000000000b0,in_stack_000000b8);
  }
  else {
    in_stack_00000068 = in_stack_000000b8;
    uStack0000000000000060 = uStack00000000000000b0;
    in_stack_00000070 = _uStack00000000000000c0;
  }
  uVar14 = (ulong)in_stack_00000070._7_1_;
  piVar15 = uStack0000000000000060;
  piVar4 = (int *)((long)uStack0000000000000060 + in_stack_00000068);
  if (-1 < (long)in_stack_00000070) {
    piVar15 = (int *)&uStack0000000000000060;
    piVar4 = (int *)((long)&uStack0000000000000060 + uVar14);
  }
  bVar19 = in_stack_00000070._7_1_;
  if (piVar15 != piVar4) {
    do {
      uVar6 = ___tolower((char)*piVar15);
      piVar20 = (int *)((long)piVar15 + 1);
      *(undefined1 *)piVar15 = uVar6;
      piVar15 = piVar20;
    } while (piVar20 != piVar4);
    uVar14 = in_stack_00000070 >> 0x38;
    bVar19 = (byte)(in_stack_00000070 >> 0x38);
  }
  uVar1 = in_stack_00000068;
  if (-1 < (char)bVar19) {
    uVar1 = uVar14;
  }
  if (uVar1 == 7) {
    piVar15 = uStack0000000000000060;
    if (-1 < (char)bVar19) {
      piVar15 = (int *)&uStack0000000000000060;
    }
    iVar7 = _memcmp(piVar15,"aes-ecb");
    if ((iVar7 != 0) && (*piVar15 != 0x5f736561 || *(int *)((long)piVar15 + 3) != 0x6263655f))
    goto code_r0x0003d1e0;
code_r0x0003d1f0:
    bVar2 = false;
    uVar14 = 0;
    bVar3 = true;
  }
  else {
    if (uVar1 == 3) {
      piVar15 = uStack0000000000000060;
      if (-1 < (char)bVar19) {
        piVar15 = (int *)&uStack0000000000000060;
      }
      if ((short)*piVar15 == 0x6365 && *(char *)((long)piVar15 + 2) == 'b') goto code_r0x0003d1f0;
    }
code_r0x0003d1e0:
    bVar3 = false;
    bVar2 = true;
    uVar14 = 0x10;
  }
  uVar11 = _strlen(uVar12);
  puVar16 = (undefined8 *)__Znwm(0x68);
  puVar17 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar17,0);
  *puVar17 = &UNK_009f9e90;
  puVar17[1] = &UNK_009fa020;
  puVar17[3] = &uStack0000000000000080;
  uVar13 = func_0x006169b8();
  func_0x0003e7a4(puVar16,uVar13,6,puVar17);
  *puVar16 = &UNK_009f7858;
  puVar16[1] = &UNK_009f7a08;
  func_0x0003f450(&uStack00000000000000c8,uVar12,uVar11,1,puVar16);
  if (bVar2) {
    if ((long)_uStack0000000000000090 < 0) {
      if (in_stack_00000088 < uVar14) goto LAB_0003d5e0;
      if (uVar14 < in_stack_00000088) {
        puVar16 = uStack0000000000000080;
        in_stack_00000088 = uVar14;
        goto LAB_0003d2b8;
      }
    }
    else {
      if (_uStack0000000000000090 >> 0x38 < uVar14) {
LAB_0003d5e0:
        func_0x006e644c(param_1,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto LAB_0003da3c;
      }
      if (uVar14 < _uStack0000000000000090 >> 0x38) {
        _uStack0000000000000090 = CONCAT17((char)uVar14,uStack0000000000000090);
        puVar16 = &uStack0000000000000080;
LAB_0003d2b8:
        *(undefined1 *)((long)puVar16 + uVar14) = 0;
      }
    }
  }
  if (bVar3) {
    if ((long)_uStack0000000000000090 < 0) goto LAB_0003d5a8;
    if (cStack0000000000000097 != '\0') {
LAB_0003d610:
      func_0x006e644c(param_1,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
LAB_0003da3c:
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar5)();
    }
    uStack0000000000000080 = (undefined8 *)((ulong)uStack0000000000000080 & 0xffffffffffffff00);
    _uStack0000000000000090 = _uStack0000000000000090 & 0xffffffffffffff;
  }
  do {
    in_stack_000000d0 = &UNK_00a0c3e0;
    uStack00000000000000c8 = (long *)&UNK_00a0c238;
    if (in_stack_000000e0 != (long *)0x0) {
      in_stack_000000d0 = &UNK_00a0c3e0;
      uStack00000000000000c8 = (long *)&UNK_00a0c238;
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uStack0000000000000048 = (undefined8 *)0x0;
    in_stack_00000050 = 0;
    in_stack_00000058 = 0;
    uVar11 = _strlen(uVar8);
    puVar16 = (undefined8 *)__Znwm(0x68);
    puVar17 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar17,0);
    *puVar17 = &UNK_009f9e90;
    puVar17[1] = &UNK_009fa020;
    puVar17[3] = &uStack0000000000000048;
    uVar12 = func_0x006169b8();
    func_0x0003e7a4(puVar16,uVar12,6,puVar17);
    *puVar16 = &UNK_009f7858;
    puVar16[1] = &UNK_009f7a08;
    func_0x0003f450(&uStack00000000000000c8,uVar8,uVar11,1,puVar16);
    uStack00000000000000c8 = (long *)&UNK_00a0c238;
    in_stack_000000d0 = &UNK_00a0c3e0;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    plVar9 = uStack00000000000000c8;
    uStack0000000000000030 = (undefined8 *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar14 = in_stack_000000a0;
    puVar16 = uStack0000000000000098;
    if (-1 < (long)in_stack_000000a8) {
      uVar14 = in_stack_000000a8 >> 0x38;
      puVar16 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar17 = uStack0000000000000080;
    if (-1 < (long)_uStack0000000000000090) {
      uVar1 = _uStack0000000000000090 >> 0x38;
      puVar17 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar16,uVar14,puVar17,uVar1);
    uVar14 = in_stack_00000050;
    puVar16 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar14 = in_stack_00000058 >> 0x38;
      puVar16 = &uStack0000000000000048;
    }
    uVar11 = __Znwm(0xd8);
    puVar17 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar17,0);
    *puVar17 = &UNK_009f9e90;
    puVar17[1] = &UNK_009fa020;
    puVar17[3] = &uStack0000000000000030;
    func_0x0066cd14(uVar11,plVar9 + 1,puVar17,2);
    func_0x0003f450(&uStack00000000000000c8,puVar16,uVar14,1,uVar11);
    uStack00000000000000c8 = (long *)&UNK_00a0c238;
    in_stack_000000d0 = &UNK_00a0c3e0;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar14 = in_stack_00000038;
    puVar16 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar14 = in_stack_00000040 >> 0x38;
      puVar16 = &uStack0000000000000030;
    }
    func_0x006e38d8(param_1,puVar16,uVar14);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar9 != (long *)0x0) {
      (**(code **)(*plVar9 + 8))(plVar9);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if ((long)in_stack_00000070 < 0) goto LAB_0003d554;
code_r0x0003d4f0:
      if (-1 < (long)_uStack0000000000000090) goto LAB_0003d4f8;
code_r0x0003d564:
      __ZdlPv(uStack0000000000000080);
      if ((long)in_stack_000000a8 < 0) goto code_r0x0003d574;
LAB_0003d500:
      if (-1 < (long)_uStack00000000000000c0) goto LAB_0003d508;
code_r0x0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000130) {
        return 1;
      }
    }
    else {
      if (-1 < (long)in_stack_00000070) goto code_r0x0003d4f0;
LAB_0003d554:
      __ZdlPv(uStack0000000000000060);
      if ((long)_uStack0000000000000090 < 0) goto code_r0x0003d564;
LAB_0003d4f8:
      if (-1 < (long)in_stack_000000a8) goto LAB_0003d500;
code_r0x0003d574:
      __ZdlPv(uStack0000000000000098);
      if ((long)_uStack00000000000000c0 < 0) goto code_r0x0003d584;
LAB_0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000130) {
        return 1;
      }
    }
    ___stack_chk_fail();
LAB_0003d5a8:
    if (in_stack_00000088 != 0) goto LAB_0003d610;
    *(undefined1 *)uStack0000000000000080 = 0;
    in_stack_00000088 = 0;
  } while( true );
}

