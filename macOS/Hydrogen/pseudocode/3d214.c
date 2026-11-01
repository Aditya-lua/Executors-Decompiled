
undefined8 FUN_0003d214(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  code *pcVar4;
  long *plVar5;
  undefined8 uVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  int unaff_w19;
  int unaff_w20;
  long *unaff_x22;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
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
  long in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  long *in_stack_000000e0;
  
  plVar5 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar5,0);
  *plVar5 = unaff_x26 + 0x10;
  plVar5[1] = unaff_x26 + 0x1a0;
  plVar5[3] = (long)&uStack0000000000000080;
  func_0x006169b8();
  func_0x0003e7a4();
  *unaff_x22 = unaff_x27 + 0x10;
  unaff_x22[1] = unaff_x27 + 0x1c0;
  func_0x0003f450(&uStack00000000000000c8);
  if (unaff_w20 != 0) {
    if (in_stack_00000090 < 0) {
      if (in_stack_00000088 < unaff_x28) goto LAB_0003d5e0;
      if (unaff_x28 < in_stack_00000088) {
        puVar9 = (undefined8 *)
                 CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080);
        in_stack_00000088 = unaff_x28;
        goto LAB_0003d2b8;
      }
    }
    else {
      if (in_stack_00000090._7_1_ < unaff_x28) {
LAB_0003d5e0:
        func_0x006e644c(in_stack_00000020,
                        "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                       );
        goto LAB_0003da3c;
      }
      if (unaff_x28 < in_stack_00000090._7_1_) {
        in_stack_00000090._7_1_ = (byte)unaff_x28;
        puVar9 = &uStack0000000000000080;
LAB_0003d2b8:
        *(undefined1 *)((long)puVar9 + unaff_x28) = 0;
      }
    }
  }
  if (unaff_w19 != 0) {
    if ((char)in_stack_00000090._7_1_ < '\0') goto LAB_0003d5a8;
    if (in_stack_00000090._7_1_ != 0) {
LAB_0003d610:
      func_0x006e644c(in_stack_00000020,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
LAB_0003da3c:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar4)();
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
    uVar6 = _strlen(in_stack_00000028);
    plVar5 = (long *)__Znwm(0x68);
    plVar7 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar7,0);
    *plVar7 = unaff_x26 + 0x10;
    plVar7[1] = unaff_x26 + 0x1a0;
    plVar7[3] = (long)&uStack0000000000000048;
    uVar8 = func_0x006169b8();
    func_0x0003e7a4(plVar5,uVar8,6,plVar7);
    *plVar5 = unaff_x27 + 0x10;
    plVar5[1] = unaff_x27 + 0x1c0;
    func_0x0003f450(&uStack00000000000000c8,in_stack_00000028,uVar6,1,plVar5);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    plVar5 = uStack00000000000000c8;
    uStack0000000000000030 = (undefined8 *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar2 = in_stack_000000a0;
    puVar9 = uStack0000000000000098;
    if (-1 < (char)in_stack_000000a8._7_1_) {
      uVar2 = (ulong)in_stack_000000a8._7_1_;
      puVar9 = &uStack0000000000000098;
    }
    uVar1 = in_stack_00000088;
    puVar3 = (undefined8 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080)
    ;
    if (-1 < (char)in_stack_00000090._7_1_) {
      uVar1 = (ulong)in_stack_00000090._7_1_;
      puVar3 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar9,uVar2,puVar3,uVar1);
    uVar2 = in_stack_00000050;
    puVar9 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      uVar2 = in_stack_00000058 >> 0x38;
      puVar9 = &uStack0000000000000048;
    }
    uVar6 = __Znwm(0xd8);
    plVar7 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar7,0);
    *plVar7 = unaff_x26 + 0x10;
    plVar7[1] = unaff_x26 + 0x1a0;
    plVar7[3] = (long)&uStack0000000000000030;
    func_0x0066cd14(uVar6,plVar5 + 1,plVar7,2);
    func_0x0003f450(&uStack00000000000000c8,puVar9,uVar2,1,uVar6);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uVar2 = in_stack_00000038;
    puVar9 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar2 = in_stack_00000040 >> 0x38;
      puVar9 = &uStack0000000000000030;
    }
    func_0x006e38d8(in_stack_00000020,puVar9,uVar2);
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (plVar5 != (long *)0x0) {
      (**(code **)(*plVar5 + 8))(plVar5);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if (in_stack_00000070._7_1_ < '\0') goto LAB_0003d554;
code_r0x0003d4f0:
      if (-1 < (char)in_stack_00000090._7_1_) goto LAB_0003d4f8;
code_r0x0003d564:
      __ZdlPv(CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080));
      if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003d574;
LAB_0003d500:
      if (-1 < in_stack_000000c0._7_1_) goto LAB_0003d508;
code_r0x0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (-1 < in_stack_00000070._7_1_) goto code_r0x0003d4f0;
LAB_0003d554:
      __ZdlPv(in_stack_00000060);
      if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d564;
LAB_0003d4f8:
      if (-1 < (char)in_stack_000000a8._7_1_) goto LAB_0003d500;
code_r0x0003d574:
      __ZdlPv(uStack0000000000000098);
      if (in_stack_000000c0._7_1_ < '\0') goto code_r0x0003d584;
LAB_0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    ___stack_chk_fail();
LAB_0003d5a8:
    if (in_stack_00000088 != 0) goto LAB_0003d610;
    *(undefined1 *)CONCAT71(uStack0000000000000080._1_7_,(undefined1)uStack0000000000000080) = 0;
    in_stack_00000088 = 0;
  } while( true );
}

