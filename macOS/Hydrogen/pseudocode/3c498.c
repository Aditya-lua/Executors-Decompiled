
undefined8 FUN_0003c498(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  code *pcVar4;
  long *plVar5;
  undefined8 uVar6;
  long *plVar7;
  int unaff_w20;
  undefined8 uVar8;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  long in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d8;
  
  *(undefined1 *)(param_1 + unaff_x28) = 0;
  if (unaff_w20 == 0) {
LAB_0003c4bc:
    *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
    *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
    plVar5 = *(long **)(unaff_x29 + -0xb0);
  }
  else {
    if (-1 < in_stack_000000a8) {
      if (in_stack_000000a8._7_1_ != 0) goto LAB_0003c900;
      uStack0000000000000098._0_1_ = 0;
      in_stack_000000a8._7_1_ = 0;
      goto LAB_0003c4bc;
    }
    if (unaff_x28 != 0) {
LAB_0003c900:
      func_0x006e644c(in_stack_00000018,
                      "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value.")
      ;
      goto code_r0x0003cd88;
    }
    *uStack0000000000000098 = 0;
    unaff_x28 = 0;
    *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
    *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
    plVar5 = *(long **)(unaff_x29 + -0xb0);
  }
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 8))();
  }
  func_0x0004052c(unaff_x29 + -200,&uStack00000000000000c8,1);
  plVar5 = *(long **)(unaff_x29 + -200);
  uStack0000000000000040 = 0;
  in_stack_00000048 = 0;
  in_stack_00000050 = 0;
  uVar1 = in_stack_000000b8;
  puVar2 = uStack00000000000000b0;
  if (-1 < (char)in_stack_000000c0._7_1_) {
    uVar1 = (ulong)in_stack_000000c0._7_1_;
    puVar2 = &uStack00000000000000b0;
  }
  puVar3 = (undefined8 *)CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098);
  if (-1 < (char)in_stack_000000a8._7_1_) {
    unaff_x28 = (ulong)in_stack_000000a8._7_1_;
    puVar3 = &uStack0000000000000098;
  }
  func_0x005ee410(plVar5,puVar2,uVar1,puVar3,unaff_x28);
  uVar8 = *(undefined8 *)(unaff_x29 + -0xd0);
  uVar6 = __Znwm(0xd8);
  plVar7 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar7,0);
  *plVar7 = unaff_x26 + 0x10;
  plVar7[1] = unaff_x26 + 0x1a0;
  plVar7[3] = (long)&uStack0000000000000040;
  func_0x0066cd14(uVar6,plVar5 + 1,plVar7,2);
  func_0x0003f450(unaff_x29 + -200,in_stack_00000020,uVar8,1,uVar6);
  *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
  *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
  if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
  }
  uStack0000000000000028 = (undefined8 *)0x0;
  in_stack_00000030 = 0;
  in_stack_00000038 = 0;
  uVar6 = __Znwm(0x98);
  plVar7 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar7,0);
  *plVar7 = unaff_x26 + 0x10;
  plVar7[1] = unaff_x26 + 0x1a0;
  plVar7[3] = (long)&uStack0000000000000028;
  func_0x0004004c(uVar6,plVar7,0,0x48);
  func_0x00040ad8(unaff_x29 + -200,&uStack0000000000000040,1,uVar6);
  *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
  *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
  if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
  }
  uVar1 = in_stack_00000030;
  puVar2 = uStack0000000000000028;
  if (-1 < (long)in_stack_00000038) {
    uVar1 = in_stack_00000038 >> 0x38;
    puVar2 = &uStack0000000000000028;
  }
  func_0x006e38d8(in_stack_00000018,puVar2,uVar1);
  uVar1 = in_stack_00000088;
  puVar2 = uStack0000000000000080;
  if (-1 < (char)in_stack_00000090._7_1_) {
    uVar1 = (ulong)in_stack_00000090._7_1_;
    puVar2 = &uStack0000000000000080;
  }
  func_0x006e38d8(in_stack_00000018,puVar2,uVar1);
  if ((long)in_stack_00000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 8))(plVar5);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(in_stack_00000060);
    if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003c7ec;
code_r0x0003c870:
    __ZdlPv(uStack0000000000000080);
    if (-1 < (char)in_stack_000000a8._7_1_) goto code_r0x0003c7f4;
code_r0x0003c880:
    __ZdlPv(CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098));
    if (-1 < (char)in_stack_000000c0._7_1_) goto code_r0x0003c7fc;
code_r0x0003c890:
    __ZdlPv(uStack00000000000000b0);
    if (-1 < in_stack_000000d8._7_1_) goto code_r0x0003c804;
code_r0x0003c8a0:
    __ZdlPv(uStack00000000000000c8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 2;
    }
  }
  else {
    if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003c870;
code_r0x0003c7ec:
    if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003c880;
code_r0x0003c7f4:
    if ((char)in_stack_000000c0._7_1_ < '\0') goto code_r0x0003c890;
code_r0x0003c7fc:
    if (in_stack_000000d8._7_1_ < '\0') goto code_r0x0003c8a0;
code_r0x0003c804:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 2;
    }
  }
  ___stack_chk_fail();
  func_0x0001748c(&uStack00000000000000c8);
code_r0x0003cd88:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x3cd8c);
  (*pcVar4)();
}

