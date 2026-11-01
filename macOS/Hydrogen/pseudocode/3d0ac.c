
undefined8 FUN_0003d0ac(void)

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
  byte bVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 unaff_x19;
  int *piVar16;
  int *piVar17;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
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
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  undefined7 uStack00000000000000c0;
  char cStack00000000000000c7;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  long *in_stack_000000e0;
  
  if ((long)_uStack00000000000000c0 < 0) {
    func_0x00017634(&uStack0000000000000060,uStack00000000000000b0,in_stack_000000b8);
  }
  else {
    in_stack_00000068 = in_stack_000000b8;
    uStack0000000000000060 = uStack00000000000000b0;
    in_stack_00000070 = _uStack00000000000000c0;
  }
  uVar14 = (ulong)in_stack_00000070._7_1_;
  piVar16 = uStack0000000000000060;
  piVar4 = (int *)((long)uStack0000000000000060 + in_stack_00000068);
  if (-1 < (long)in_stack_00000070) {
    piVar16 = (int *)&uStack0000000000000060;
    piVar4 = (int *)((long)&uStack0000000000000060 + uVar14);
  }
  bVar13 = in_stack_00000070._7_1_;
  if (piVar16 != piVar4) {
    do {
      uVar7 = ___tolower((char)*piVar16);
      piVar17 = (int *)((long)piVar16 + 1);
      *(undefined1 *)piVar16 = uVar7;
      piVar16 = piVar17;
    } while (piVar17 != piVar4);
    uVar14 = in_stack_00000070 >> 0x38;
    bVar13 = (byte)(in_stack_00000070 >> 0x38);
  }
  uVar1 = in_stack_00000068;
  if (-1 < (char)bVar13) {
    uVar1 = uVar14;
  }
  if (uVar1 == 7) {
    piVar16 = uStack0000000000000060;
    if (-1 < (char)bVar13) {
      piVar16 = (int *)&uStack0000000000000060;
    }
    iVar8 = _memcmp(piVar16,"aes-ecb");
    if ((iVar8 != 0) && (*piVar16 != 0x5f736561 || *(int *)((long)piVar16 + 3) != 0x6263655f))
    goto code_r0x0003d1e0;
code_r0x0003d1f0:
    bVar2 = false;
    uVar14 = 0;
    bVar3 = true;
  }
  else {
    if (uVar1 == 3) {
      piVar16 = uStack0000000000000060;
      if (-1 < (char)bVar13) {
        piVar16 = (int *)&uStack0000000000000060;
      }
      if ((short)*piVar16 == 0x6365 && *(char *)((long)piVar16 + 2) == 'b') goto code_r0x0003d1f0;
    }
code_r0x0003d1e0:
    bVar3 = false;
    bVar2 = true;
    uVar14 = 0x10;
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
      if (in_stack_00000088 < uVar14) goto code_r0x0003d5e0;
      if (uVar14 < in_stack_00000088) {
        puVar15 = (undefined8 *)
                  CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080);
        in_stack_00000088 = uVar14;
        goto code_r0x0003d2b8;
      }
    }
    else {
      if (in_stack_00000090._7_1_ < uVar14) {
code_r0x0003d5e0:
        func_0x006e644c(unaff_x28,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto LAB_0003da3c;
      }
      if (uVar14 < in_stack_00000090._7_1_) {
        in_stack_00000090._7_1_ = (byte)uVar14;
        puVar15 = &uStack0000000000000080;
code_r0x0003d2b8:
        *(undefined1 *)((long)puVar15 + uVar14) = 0;
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
    uVar11 = _strlen(unaff_x19);
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
    func_0x0003f450(&uStack00000000000000c8,unaff_x19,uVar11,1,plVar9);
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
    uVar14 = in_stack_000000a0;
    puVar15 = uStack0000000000000098;
    if (-1 < (char)in_stack_000000a8._7_1_) {
      uVar14 = (ulong)in_stack_000000a8._7_1_;
      puVar15 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar5 = (undefined8 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080)
    ;
    if (-1 < (char)in_stack_00000090._7_1_) {
      uVar1 = (ulong)in_stack_00000090._7_1_;
      puVar5 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar15,uVar14,puVar5,uVar1);
    uVar14 = in_stack_00000050;
    puVar15 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar14 = in_stack_00000058 >> 0x38;
      puVar15 = &uStack0000000000000048;
    }
    uVar11 = __Znwm(0xd8);
    plVar10 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar10,0);
    *plVar10 = unaff_x26 + 0x10;
    plVar10[1] = unaff_x26 + 0x1a0;
    plVar10[3] = (long)&uStack0000000000000030;
    func_0x0066cd14(uVar11,plVar9 + 1,plVar10,2);
    func_0x0003f450(&uStack00000000000000c8,puVar15,uVar14,1,uVar11);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar14 = in_stack_00000038;
    puVar15 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar14 = in_stack_00000040 >> 0x38;
      puVar15 = &uStack0000000000000030;
    }
    func_0x006e38d8(unaff_x28,puVar15,uVar14);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar9 != (long *)0x0) {
      (**(code **)(*plVar9 + 8))(plVar9);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if ((long)in_stack_00000070 < 0) goto code_r0x0003d554;
FUN_0003d4f0:
      if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003d4f8;
LAB_0003d564:
      __ZdlPv(CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080));
      if ((char)in_stack_000000a8._7_1_ < '\0') goto LAB_0003d574;
code_r0x0003d500:
      if (-1 < cStack00000000000000c7) goto code_r0x0003d508;
LAB_0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (-1 < (long)in_stack_00000070) goto FUN_0003d4f0;
code_r0x0003d554:
      __ZdlPv(uStack0000000000000060);
      if ((char)in_stack_00000090._7_1_ < '\0') goto LAB_0003d564;
code_r0x0003d4f8:
      if (-1 < (char)in_stack_000000a8._7_1_) goto code_r0x0003d500;
LAB_0003d574:
      __ZdlPv(uStack0000000000000098);
      if (cStack00000000000000c7 < '\0') goto LAB_0003d584;
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

