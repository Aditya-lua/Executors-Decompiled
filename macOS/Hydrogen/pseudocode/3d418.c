
undefined8 FUN_0003d418(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  code *pcVar5;
  long *plVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined8 *unaff_x20;
  long *unaff_x21;
  ulong unaff_x23;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
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
  
  do {
    uVar8 = __Znwm(0xd8);
    plVar9 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar9,0);
    *plVar9 = unaff_x26 + 0x10;
    plVar9[1] = unaff_x26 + 0x1a0;
    plVar9[3] = (long)&uStack0000000000000030;
    func_0x0066cd14(uVar8,unaff_x21 + 1,plVar9,2);
    func_0x0003f450(&uStack00000000000000c8,unaff_x20,unaff_x23,1,uVar8);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x006e38d8();
    if (in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (unaff_x21 != (long *)0x0) {
      (**(code **)(*unaff_x21 + 8))(unaff_x21);
    }
    if ((long)in_stack_00000058 < 0) {
      __ZdlPv(uStack0000000000000048);
      if (-1 < in_stack_00000070._7_1_) goto code_r0x0003d4f0;
LAB_0003d554:
      __ZdlPv(in_stack_00000060);
      if (-1 < (char)in_stack_00000090._7_1_) goto LAB_0003d4f8;
code_r0x0003d564:
      __ZdlPv(uStack0000000000000080);
      if (-1 < (char)in_stack_000000a8._7_1_) goto LAB_0003d500;
code_r0x0003d574:
      __ZdlPv(uStack0000000000000098);
      if (-1 < in_stack_000000c0._7_1_) goto LAB_0003d508;
code_r0x0003d584:
      __ZdlPv(uStack00000000000000b0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    else {
      if (in_stack_00000070._7_1_ < '\0') goto LAB_0003d554;
code_r0x0003d4f0:
      if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d564;
LAB_0003d4f8:
      if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003d574;
LAB_0003d500:
      if (in_stack_000000c0._7_1_ < '\0') goto code_r0x0003d584;
LAB_0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
    ___stack_chk_fail();
    if (in_stack_00000088 != 0) {
      func_0x006e644c();
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x3da40);
      (*pcVar5)();
    }
    *(undefined1 *)uStack0000000000000080 = 0;
    in_stack_00000088 = 0;
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    uStack0000000000000048 = (undefined8 *)0x0;
    in_stack_00000050 = 0;
    in_stack_00000058 = 0;
    uVar8 = _strlen(in_stack_00000028);
    plVar9 = (long *)__Znwm(0x68);
    plVar6 = (long *)__Znwm(0x20);
    func_0x005edf2c(plVar6,0);
    *plVar6 = unaff_x26 + 0x10;
    plVar6[1] = unaff_x26 + 0x1a0;
    plVar6[3] = (long)&uStack0000000000000048;
    uVar7 = func_0x006169b8();
    func_0x0003e7a4(plVar9,uVar7,6,plVar6);
    *plVar9 = unaff_x27 + 0x10;
    plVar9[1] = unaff_x27 + 0x1c0;
    func_0x0003f450(&uStack00000000000000c8,in_stack_00000028,uVar8,1,plVar9);
    uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
    in_stack_000000d0 = unaff_x25 + 0x1b8;
    if (in_stack_000000e0 != (long *)0x0) {
      (**(code **)(*in_stack_000000e0 + 8))();
    }
    func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
    unaff_x21 = uStack00000000000000c8;
    uStack0000000000000030 = 0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar1 = in_stack_000000a0;
    puVar3 = uStack0000000000000098;
    if (-1 < (char)in_stack_000000a8._7_1_) {
      uVar1 = (ulong)in_stack_000000a8._7_1_;
      puVar3 = &uStack0000000000000098;
    }
    uVar2 = in_stack_00000088;
    puVar4 = uStack0000000000000080;
    if (-1 < (char)in_stack_00000090._7_1_) {
      uVar2 = (ulong)in_stack_00000090._7_1_;
      puVar4 = &uStack0000000000000080;
    }
    func_0x005ee410(uStack00000000000000c8,puVar3,uVar1,puVar4,uVar2);
    unaff_x23 = in_stack_00000050;
    unaff_x20 = uStack0000000000000048;
    if (-1 < (long)in_stack_00000058) {
      unaff_x23 = in_stack_00000058 >> 0x38;
      unaff_x20 = &uStack0000000000000048;
    }
  } while( true );
}

