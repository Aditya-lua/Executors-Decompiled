
undefined8 FUN_0003d0f8(void)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  int *piVar4;
  undefined8 *puVar5;
  code *pcVar6;
  undefined1 uVar7;
  int iVar8;
  long *plVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  int *piVar15;
  int *piVar16;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  int iStack0000000000000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  long *in_stack_000000e0;
  
  func_0x00017634();
  uVar13 = (ulong)in_stack_00000070._7_1_;
  piVar15 = _iStack0000000000000060;
  piVar4 = (int *)((long)_iStack0000000000000060 + in_stack_00000068);
  if (-1 < (char)in_stack_00000070._7_1_) {
    piVar15 = &iStack0000000000000060;
    piVar4 = (int *)((long)&iStack0000000000000060 + uVar13);
  }
  if (piVar15 != piVar4) {
    do {
      uVar7 = ___tolower((char)*piVar15);
      piVar16 = (int *)((long)piVar15 + 1);
      *(undefined1 *)piVar15 = uVar7;
      piVar15 = piVar16;
    } while (piVar16 != piVar4);
    uVar13 = (ulong)in_stack_00000070._7_1_;
  }
  uVar1 = in_stack_00000068;
  if (-1 < (char)in_stack_00000070._7_1_) {
    uVar1 = uVar13;
  }
  if (uVar1 == 7) {
    piVar15 = _iStack0000000000000060;
    if (-1 < (char)in_stack_00000070._7_1_) {
      piVar15 = &iStack0000000000000060;
    }
    iVar8 = _memcmp(piVar15,"aes-ecb");
    if ((iVar8 != 0) && (*piVar15 != 0x5f736561 || *(int *)((long)piVar15 + 3) != 0x6263655f))
    goto code_r0x0003d1e0;
code_r0x0003d1f0:
    bVar2 = false;
    uVar13 = 0;
    bVar3 = true;
  }
  else {
    if (uVar1 == 3) {
      piVar15 = _iStack0000000000000060;
      if (-1 < (char)in_stack_00000070._7_1_) {
        piVar15 = &iStack0000000000000060;
      }
      if ((short)*piVar15 == 0x6365 && *(char *)((long)piVar15 + 2) == 'b') goto code_r0x0003d1f0;
    }
code_r0x0003d1e0:
    bVar3 = false;
    bVar2 = true;
    uVar13 = 0x10;
  }
  _strlen();
  plVar9 = (long *)__Znwm(0x68);
  plVar10 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar10,0);
  *plVar10 = unaff_x26 + 0x10;
  plVar10[1] = unaff_x26 + 0x1a0;
  plVar10[3] = (long)&uStack0000000000000080;
  uVar11 = func_0x006169b8();
  func_0x0003e7a4(plVar9,uVar11,6,plVar10);
  *plVar9 = unaff_x27 + 0x10;
  plVar9[1] = unaff_x27 + 0x1c0;
  func_0x0003f450(&uStack00000000000000c8);
  if (bVar2) {
    if ((char)in_stack_00000090._7_1_ < '\0') {
      if (in_stack_00000088 < uVar13) goto code_r0x0003d5e0;
      if (uVar13 < in_stack_00000088) {
        puVar14 = (undefined8 *)
                  CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080);
        in_stack_00000088 = uVar13;
        goto code_r0x0003d2b8;
      }
    }
    else {
      if (in_stack_00000090._7_1_ < uVar13) {
code_r0x0003d5e0:
        func_0x006e644c(unaff_x28,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto LAB_0003da3c;
      }
      if (uVar13 < in_stack_00000090._7_1_) {
        in_stack_00000090._7_1_ = (byte)uVar13;
        puVar14 = &uStack0000000000000080;
code_r0x0003d2b8:
        *(undefined1 *)((long)puVar14 + uVar13) = 0;
      }
    }
  }
  if (bVar3) {
    if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d5a8;
    if (in_stack_00000090._7_1_ != 0) {
code_r0x0003d610:
      func_0x006e644c(unaff_x28,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
LAB_0003da3c:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar6)();
    }
    uStack0000000000000080._0_1_ = 0;
    in_stack_00000090._7_1_ = 0;
  }
  do {
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    if (in_stack_000000e0 != (long *)0x0) {
      in_stack_000000d0 = unaff_x25 + 0x1b8;
      uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uStack0000000000000048 = (undefined8 *)0x0;
    in_stack_00000050 = 0;
    in_stack_00000058 = 0;
    uVar11 = _strlen(in_stack_00000028);
    plVar9 = (long *)__Znwm(0x68);
    plVar10 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar10,0);
    *plVar10 = unaff_x26 + 0x10;
    plVar10[1] = unaff_x26 + 0x1a0;
    plVar10[3] = (long)&uStack0000000000000048;
    uVar12 = func_0x006169b8();
    func_0x0003e7a4(plVar9,uVar12,6,plVar10);
    *plVar9 = unaff_x27 + 0x10;
    plVar9[1] = unaff_x27 + 0x1c0;
    func_0x0003f450(&uStack00000000000000c8,in_stack_00000028,uVar11,1,plVar9);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    plVar9 = uStack00000000000000c8;
    uStack0000000000000030 = (undefined8 *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar13 = in_stack_000000a0;
    puVar14 = uStack0000000000000098;
    if (-1 < (char)in_stack_000000a8._7_1_) {
      uVar13 = (ulong)in_stack_000000a8._7_1_;
      puVar14 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar5 = (undefined8 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080)
    ;
    if (-1 < (char)in_stack_00000090._7_1_) {
      uVar1 = (ulong)in_stack_00000090._7_1_;
      puVar5 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar14,uVar13,puVar5,uVar1);
    uVar13 = in_stack_00000050;
    puVar14 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar13 = in_stack_00000058 >> 0x38;
      puVar14 = &uStack0000000000000048;
    }
    uVar11 = __Znwm(0xd8);
    plVar10 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar10,0);
    *plVar10 = unaff_x26 + 0x10;
    plVar10[1] = unaff_x26 + 0x1a0;
    plVar10[3] = (long)&uStack0000000000000030;
    func_0x0066cd14(uVar11,plVar9 + 1,plVar10,2);
    func_0x0003f450(&uStack00000000000000c8,puVar14,uVar13,1,uVar11);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar13 = in_stack_00000038;
    puVar14 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar13 = in_stack_00000040 >> 0x38;
      puVar14 = &uStack0000000000000030;
    }
    func_0x006e38d8(unaff_x28,puVar14,uVar13);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar9 != (long *)0x0) {
      (**(code **)(*plVar9 + 8))(plVar9);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if ((char)in_stack_00000070._7_1_ < '\0') goto code_r0x0003d554;
FUN_0003d4f0:
      if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003d4f8;
LAB_0003d564:
      __ZdlPv(CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080));
      if ((char)in_stack_000000a8._7_1_ < '\0') goto LAB_0003d574;
code_r0x0003d500:
      if (-1 < in_stack_000000c0._7_1_) goto code_r0x0003d508;
LAB_0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (-1 < (char)in_stack_00000070._7_1_) goto FUN_0003d4f0;
code_r0x0003d554:
      __ZdlPv(_iStack0000000000000060);
      if ((char)in_stack_00000090._7_1_ < '\0') goto LAB_0003d564;
code_r0x0003d4f8:
      if (-1 < (char)in_stack_000000a8._7_1_) goto code_r0x0003d500;
LAB_0003d574:
      __ZdlPv(uStack0000000000000098);
      if (in_stack_000000c0._7_1_ < '\0') goto LAB_0003d584;
code_r0x0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    ___stack_chk_fail();
code_r0x0003d5a8:
    if (in_stack_00000088 != 0) goto code_r0x0003d610;
    *(undefined1 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080) = 0;
    in_stack_00000088 = 0;
  } while( true );
}

