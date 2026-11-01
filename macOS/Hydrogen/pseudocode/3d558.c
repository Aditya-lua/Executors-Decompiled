
undefined8 FUN_0003d558(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  code *pcVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
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
  
code_r0x0003d558:
  __ZdlPv(param_1);
  if (-1 < (char)in_stack_00000090._7_1_) goto LAB_0003d4f8;
code_r0x0003d564:
  __ZdlPv(uStack0000000000000080);
  if (-1 < (char)in_stack_000000a8._7_1_) goto LAB_0003d500;
code_r0x0003d574:
  __ZdlPv(uStack0000000000000098);
  if (-1 < in_stack_000000c0._7_1_) goto LAB_0003d508;
  do {
    __ZdlPv(uStack00000000000000b0);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 1;
    }
    while( true ) {
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
      uVar6 = _strlen(in_stack_00000028);
      plVar7 = (long *)__Znwm(0x68);
      plVar8 = (long *)__Znwm(0x20);
      func_0x005edf2c(plVar8,0);
      *plVar8 = unaff_x26 + 0x10;
      plVar8[1] = unaff_x26 + 0x1a0;
      plVar8[3] = (long)&uStack0000000000000048;
      uVar9 = func_0x006169b8();
      func_0x0003e7a4(plVar7,uVar9,6,plVar8);
      *plVar7 = unaff_x27 + 0x10;
      plVar7[1] = unaff_x27 + 0x1c0;
      func_0x0003f450(&uStack00000000000000c8,in_stack_00000028,uVar6,1,plVar7);
      uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
      in_stack_000000d0 = unaff_x25 + 0x1b8;
      if (in_stack_000000e0 != (long *)0x0) {
        (**(code **)(*in_stack_000000e0 + 8))();
      }
      func_0x0004052c(&uStack00000000000000c8,&uStack00000000000000b0,0);
      plVar7 = uStack00000000000000c8;
      uStack0000000000000030 = 0;
      in_stack_00000038 = 0;
      in_stack_00000040 = 0;
      uVar2 = in_stack_000000a0;
      puVar3 = uStack0000000000000098;
      if (-1 < (char)in_stack_000000a8._7_1_) {
        uVar2 = (ulong)in_stack_000000a8._7_1_;
        puVar3 = &uStack0000000000000098;
      }
      uVar1 = in_stack_00000088;
      puVar4 = uStack0000000000000080;
      if (-1 < (char)in_stack_00000090._7_1_) {
        uVar1 = (ulong)in_stack_00000090._7_1_;
        puVar4 = &uStack0000000000000080;
      }
      func_0x005ee410(uStack00000000000000c8,puVar3,uVar2,puVar4,uVar1);
      uVar2 = in_stack_00000050;
      puVar3 = uStack0000000000000048;
      if (-1 < (long)in_stack_00000058) {
        uVar2 = in_stack_00000058 >> 0x38;
        puVar3 = &uStack0000000000000048;
      }
      uVar6 = __Znwm(0xd8);
      plVar8 = (long *)__Znwm(0x20);
      func_0x005edf2c(plVar8,0);
      *plVar8 = unaff_x26 + 0x10;
      plVar8[1] = unaff_x26 + 0x1a0;
      plVar8[3] = (long)&uStack0000000000000030;
      func_0x0066cd14(uVar6,plVar7 + 1,plVar8,2);
      func_0x0003f450(&uStack00000000000000c8,puVar3,uVar2,1,uVar6);
      uStack00000000000000c8 = (long *)(unaff_x25 + 0x10);
      in_stack_000000d0 = unaff_x25 + 0x1b8;
      if (in_stack_000000e0 != (long *)0x0) {
        (**(code **)(*in_stack_000000e0 + 8))();
      }
      func_0x006e38d8();
      if (in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (plVar7 != (long *)0x0) {
        (**(code **)(*plVar7 + 8))(plVar7);
      }
      param_1 = in_stack_00000060;
      if ((long)in_stack_00000058 < 0) {
        __ZdlPv(uStack0000000000000048);
        param_1 = in_stack_00000060;
      }
      in_stack_00000060 = param_1;
      if (in_stack_00000070._7_1_ < '\0') goto code_r0x0003d558;
      if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003d564;
LAB_0003d4f8:
      if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003d574;
LAB_0003d500:
      if (in_stack_000000c0._7_1_ < '\0') break;
LAB_0003d508:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 1;
      }
    }
  } while( true );
}

