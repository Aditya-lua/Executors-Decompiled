
undefined8 FUN_0003d1ac(void)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  int *unaff_x22;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong uVar12;
  long unaff_x29;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 in_stack_00000060;
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
  
  iVar6 = _memcmp();
  if ((iVar6 == 0) || (*unaff_x22 == 0x5f736561 && *(int *)((long)unaff_x22 + 3) == 0x6263655f)) {
    bVar2 = false;
    uVar12 = 0;
    bVar3 = true;
  }
  else {
    bVar3 = false;
    bVar2 = true;
    uVar12 = 0x10;
  }
  _strlen();
  plVar7 = (long *)__Znwm(0x68);
  plVar8 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar8,0);
  *plVar8 = unaff_x26 + 0x10;
  plVar8[1] = unaff_x26 + 0x1a0;
  plVar8[3] = (long)&uStack0000000000000080;
  uVar9 = func_0x006169b8();
  func_0x0003e7a4(plVar7,uVar9,6,plVar8);
  *plVar7 = unaff_x27 + 0x10;
  plVar7[1] = unaff_x27 + 0x1c0;
  func_0x0003f450(&uStack00000000000000c8);
  if (bVar2) {
    if ((char)in_stack_00000090._7_1_ < '\0') {
      if (in_stack_00000088 < uVar12) goto code_r0x0003d5e0;
      if (uVar12 < in_stack_00000088) {
        puVar11 = (undefined8 *)
                  CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080);
        in_stack_00000088 = uVar12;
        goto code_r0x0003d2b8;
      }
    }
    else {
      if (in_stack_00000090._7_1_ < uVar12) {
code_r0x0003d5e0:
        func_0x006e644c(in_stack_00000020,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto code_r0x0003da3c;
      }
      if (uVar12 < in_stack_00000090._7_1_) {
        in_stack_00000090._7_1_ = (byte)uVar12;
        puVar11 = &uStack0000000000000080;
code_r0x0003d2b8:
        *(undefined1 *)((long)puVar11 + uVar12) = 0;
      }
    }
  }
  if (bVar3) {
    if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d5a8;
    if (in_stack_00000090._7_1_ != 0) {
code_r0x0003d610:
      func_0x006e644c(in_stack_00000020,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
code_r0x0003da3c:
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar5)();
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
    uVar9 = _strlen(in_stack_00000028);
    plVar7 = (long *)__Znwm(0x68);
    plVar8 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar8,0);
    *plVar8 = unaff_x26 + 0x10;
    plVar8[1] = unaff_x26 + 0x1a0;
    plVar8[3] = (long)&uStack0000000000000048;
    uVar10 = func_0x006169b8();
    func_0x0003e7a4(plVar7,uVar10,6,plVar8);
    *plVar7 = unaff_x27 + 0x10;
    plVar7[1] = unaff_x27 + 0x1c0;
    func_0x0003f450(&uStack00000000000000c8,in_stack_00000028,uVar9,1,plVar7);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    plVar7 = uStack00000000000000c8;
    uStack0000000000000030 = (undefined8 *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar12 = in_stack_000000a0;
    puVar11 = uStack0000000000000098;
    if (-1 < (char)in_stack_000000a8._7_1_) {
      uVar12 = (ulong)in_stack_000000a8._7_1_;
      puVar11 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar4 = (undefined8 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080)
    ;
    if (-1 < (char)in_stack_00000090._7_1_) {
      uVar1 = (ulong)in_stack_00000090._7_1_;
      puVar4 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar11,uVar12,puVar4,uVar1);
    uVar12 = in_stack_00000050;
    puVar11 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar12 = in_stack_00000058 >> 0x38;
      puVar11 = &uStack0000000000000048;
    }
    uVar9 = __Znwm(0xd8);
    plVar8 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar8,0);
    *plVar8 = unaff_x26 + 0x10;
    plVar8[1] = unaff_x26 + 0x1a0;
    plVar8[3] = (long)&uStack0000000000000030;
    func_0x0066cd14(uVar9,plVar7 + 1,plVar8,2);
    func_0x0003f450(&uStack00000000000000c8,puVar11,uVar12,1,uVar9);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar12 = in_stack_00000038;
    puVar11 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar12 = in_stack_00000040 >> 0x38;
      puVar11 = &uStack0000000000000030;
    }
    func_0x006e38d8(in_stack_00000020,puVar11,uVar12);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar7 != (long *)0x0) {
      (**(code **)(*plVar7 + 8))(plVar7);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if (in_stack_00000070._7_1_ < '\0') goto code_r0x0003d554;
code_r0x0003d4f0:
      if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003d4f8;
code_r0x0003d564:
      __ZdlPv(CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080));
      if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003d574;
code_r0x0003d500:
      if (-1 < in_stack_000000c0._7_1_) goto code_r0x0003d508;
code_r0x0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (-1 < in_stack_00000070._7_1_) goto code_r0x0003d4f0;
code_r0x0003d554:
      __ZdlPv(in_stack_00000060);
      if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d564;
code_r0x0003d4f8:
      if (-1 < (char)in_stack_000000a8._7_1_) goto code_r0x0003d500;
code_r0x0003d574:
      __ZdlPv(uStack0000000000000098);
      if (in_stack_000000c0._7_1_ < '\0') goto code_r0x0003d584;
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

