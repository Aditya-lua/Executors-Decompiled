
undefined8 FUN_0003cf74(ulong param_1)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  int *piVar4;
  long *plVar5;
  code *pcVar6;
  undefined1 uVar7;
  int iVar8;
  int *piVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  byte bVar14;
  ulong uVar15;
  undefined8 unaff_x19;
  int *piVar16;
  undefined8 unaff_x28;
  long unaff_x29;
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
  
  if (param_1 < 0x17) {
    _uStack00000000000000c0 = CONCAT17((char)param_1,uStack00000000000000c0);
    piVar9 = (int *)&uStack00000000000000b0;
    if (param_1 != 0) goto LAB_0003cfc0;
  }
  else {
    uVar15 = (param_1 & 0xfffffffffffffff8) + 8;
    if ((param_1 | 7) != 0x17) {
      uVar15 = param_1 | 7;
    }
    piVar9 = (int *)__Znwm(uVar15 + 1);
    _uStack00000000000000c0 = uVar15 + 1 | 0x8000000000000000;
    uStack00000000000000b0 = piVar9;
    in_stack_000000b8 = param_1;
LAB_0003cfc0:
    _memmove(piVar9);
  }
  *(undefined1 *)((long)piVar9 + param_1) = 0;
  uStack0000000000000098 = (undefined8 *)0x0;
  in_stack_000000a0 = 0;
  in_stack_000000a8 = 0;
  _strlen();
  puVar10 = (undefined8 *)__Znwm(0x68);
  puVar11 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar11,0);
  *puVar11 = &UNK_009f9e90;
  puVar11[1] = &UNK_009fa020;
  puVar11[3] = &uStack0000000000000098;
  uVar12 = func_0x006169b8();
  func_0x0003e7a4(puVar10,uVar12,6,puVar11);
  *puVar10 = &UNK_009f7858;
  puVar10[1] = &UNK_009f7a08;
  func_0x0003f450(&uStack00000000000000c8);
  if ((long)in_stack_000000a8 < 0) {
    if (in_stack_000000a0 != 0x20) goto LAB_0003d0d8;
  }
  else if (in_stack_000000a8._7_1_ != ' ') {
LAB_0003d0d8:
    func_0x006e644c();
    goto code_r0x0003da3c;
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
  uVar15 = (ulong)in_stack_00000070._7_1_;
  piVar9 = uStack0000000000000060;
  piVar4 = (int *)((long)uStack0000000000000060 + in_stack_00000068);
  if (-1 < (long)in_stack_00000070) {
    piVar9 = (int *)&uStack0000000000000060;
    piVar4 = (int *)((long)&uStack0000000000000060 + uVar15);
  }
  bVar14 = in_stack_00000070._7_1_;
  if (piVar9 != piVar4) {
    do {
      uVar7 = ___tolower((char)*piVar9);
      piVar16 = (int *)((long)piVar9 + 1);
      *(undefined1 *)piVar9 = uVar7;
      piVar9 = piVar16;
    } while (piVar16 != piVar4);
    uVar15 = in_stack_00000070 >> 0x38;
    bVar14 = (byte)(in_stack_00000070 >> 0x38);
  }
  uVar1 = in_stack_00000068;
  if (-1 < (char)bVar14) {
    uVar1 = uVar15;
  }
  if (uVar1 == 7) {
    piVar9 = uStack0000000000000060;
    if (-1 < (char)bVar14) {
      piVar9 = (int *)&uStack0000000000000060;
    }
    iVar8 = _memcmp(piVar9,"aes-ecb");
    if ((iVar8 != 0) && (*piVar9 != 0x5f736561 || *(int *)((long)piVar9 + 3) != 0x6263655f))
    goto code_r0x0003d1e0;
code_r0x0003d1f0:
    bVar2 = false;
    uVar15 = 0;
    bVar3 = true;
  }
  else {
    if (uVar1 == 3) {
      piVar9 = uStack0000000000000060;
      if (-1 < (char)bVar14) {
        piVar9 = (int *)&uStack0000000000000060;
      }
      if ((short)*piVar9 == 0x6365 && *(char *)((long)piVar9 + 2) == 'b') goto code_r0x0003d1f0;
    }
code_r0x0003d1e0:
    bVar3 = false;
    bVar2 = true;
    uVar15 = 0x10;
  }
  _strlen();
  puVar10 = (undefined8 *)__Znwm(0x68);
  puVar11 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar11,0);
  *puVar11 = &UNK_009f9e90;
  puVar11[1] = &UNK_009fa020;
  puVar11[3] = &uStack0000000000000080;
  uVar12 = func_0x006169b8();
  func_0x0003e7a4(puVar10,uVar12,6,puVar11);
  *puVar10 = &UNK_009f7858;
  puVar10[1] = &UNK_009f7a08;
  func_0x0003f450(&uStack00000000000000c8);
  if (bVar2) {
    if ((long)_uStack0000000000000090 < 0) {
      if (in_stack_00000088 < uVar15) goto code_r0x0003d5e0;
      if (uVar15 < in_stack_00000088) {
        puVar10 = uStack0000000000000080;
        in_stack_00000088 = uVar15;
        goto code_r0x0003d2b8;
      }
    }
    else {
      if (_uStack0000000000000090 >> 0x38 < uVar15) {
code_r0x0003d5e0:
        func_0x006e644c(unaff_x28,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto code_r0x0003da3c;
      }
      if (uVar15 < _uStack0000000000000090 >> 0x38) {
        _uStack0000000000000090 = CONCAT17((char)uVar15,uStack0000000000000090);
        puVar10 = &uStack0000000000000080;
code_r0x0003d2b8:
        *(undefined1 *)((long)puVar10 + uVar15) = 0;
      }
    }
  }
  if (bVar3) {
    if ((long)_uStack0000000000000090 < 0) goto code_r0x0003d5a8;
    if (cStack0000000000000097 != '\0') {
code_r0x0003d610:
      func_0x006e644c(unaff_x28,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
code_r0x0003da3c:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar6)();
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
    uVar12 = _strlen(unaff_x19);
    puVar10 = (undefined8 *)__Znwm(0x68);
    puVar11 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar11,0);
    *puVar11 = &UNK_009f9e90;
    puVar11[1] = &UNK_009fa020;
    puVar11[3] = &uStack0000000000000048;
    uVar13 = func_0x006169b8();
    func_0x0003e7a4(puVar10,uVar13,6,puVar11);
    *puVar10 = &UNK_009f7858;
    puVar10[1] = &UNK_009f7a08;
    func_0x0003f450(&uStack00000000000000c8,unaff_x19,uVar12,1,puVar10);
    uStack00000000000000c8 = (long *)&UNK_00a0c238;
    in_stack_000000d0 = &UNK_00a0c3e0;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    plVar5 = uStack00000000000000c8;
    uStack0000000000000030 = (undefined8 *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar15 = in_stack_000000a0;
    puVar10 = uStack0000000000000098;
    if (-1 < (long)in_stack_000000a8) {
      uVar15 = in_stack_000000a8 >> 0x38;
      puVar10 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar11 = uStack0000000000000080;
    if (-1 < (long)_uStack0000000000000090) {
      uVar1 = _uStack0000000000000090 >> 0x38;
      puVar11 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar10,uVar15,puVar11,uVar1);
    uVar15 = in_stack_00000050;
    puVar10 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar15 = in_stack_00000058 >> 0x38;
      puVar10 = &uStack0000000000000048;
    }
    uVar12 = __Znwm(0xd8);
    puVar11 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar11,0);
    *puVar11 = &UNK_009f9e90;
    puVar11[1] = &UNK_009fa020;
    puVar11[3] = &uStack0000000000000030;
    func_0x0066cd14(uVar12,plVar5 + 1,puVar11,2);
    func_0x0003f450(&uStack00000000000000c8,puVar10,uVar15,1,uVar12);
    uStack00000000000000c8 = (long *)&UNK_00a0c238;
    in_stack_000000d0 = &UNK_00a0c3e0;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar15 = in_stack_00000038;
    puVar10 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar15 = in_stack_00000040 >> 0x38;
      puVar10 = &uStack0000000000000030;
    }
    func_0x006e38d8(unaff_x28,puVar10,uVar15);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar5 != (long *)0x0) {
      (**(code **)(*plVar5 + 8))(plVar5);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if ((long)in_stack_00000070 < 0) goto code_r0x0003d554;
code_r0x0003d4f0:
      if (-1 < (long)_uStack0000000000000090) goto code_r0x0003d4f8;
code_r0x0003d564:
      __ZdlPv(uStack0000000000000080);
      if ((long)in_stack_000000a8 < 0) goto code_r0x0003d574;
code_r0x0003d500:
      if (-1 < (long)_uStack00000000000000c0) goto code_r0x0003d508;
code_r0x0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (-1 < (long)in_stack_00000070) goto code_r0x0003d4f0;
code_r0x0003d554:
      __ZdlPv(uStack0000000000000060);
      if ((long)_uStack0000000000000090 < 0) goto code_r0x0003d564;
code_r0x0003d4f8:
      if (-1 < (long)in_stack_000000a8) goto code_r0x0003d500;
code_r0x0003d574:
      __ZdlPv(uStack0000000000000098);
      if ((long)_uStack00000000000000c0 < 0) goto code_r0x0003d584;
code_r0x0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    ___stack_chk_fail();
code_r0x0003d5a8:
    if (in_stack_00000088 != 0) goto code_r0x0003d610;
    *(undefined1 *)uStack0000000000000080 = 0;
    in_stack_00000088 = 0;
  } while( true );
}

