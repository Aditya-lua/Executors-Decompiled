
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0003c5e0(void)

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
  long unaff_x29;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d8;
  
  func_0x00611644();
  func_0x0004052c(unaff_x29 + -200,&uStack00000000000000c8,1);
  plVar8 = *(long **)(unaff_x29 + -200);
  uStack0000000000000040 = 0;
  in_stack_00000048 = 0;
  in_stack_00000050 = 0;
  uVar1 = in_stack_000000b8;
  puVar3 = uStack00000000000000b0;
  if (-1 < (char)in_stack_000000c0._7_1_) {
    uVar1 = (ulong)in_stack_000000c0._7_1_;
    puVar3 = &uStack00000000000000b0;
  }
  uVar2 = in_stack_000000a0;
  puVar4 = uStack0000000000000098;
  if (-1 < (char)in_stack_000000a8._7_1_) {
    uVar2 = (ulong)in_stack_000000a8._7_1_;
    puVar4 = &uStack0000000000000098;
  }
  func_0x005ee410(plVar8,puVar3,uVar1,puVar4,uVar2);
  uVar9 = *(undefined8 *)(unaff_x29 + -0xd0);
  uVar6 = __Znwm(0xd8);
  plVar7 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar7,0);
  *plVar7 = unaff_x26 + 0x10;
  plVar7[1] = unaff_x26 + 0x1a0;
  plVar7[3] = (long)&uStack0000000000000040;
  func_0x0066cd14(uVar6,plVar8 + 1,plVar7,2);
  func_0x0003f450(unaff_x29 + -200,in_stack_00000020,uVar9,1,uVar6);
  *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
  *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
  if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
  }
  uStack0000000000000028 = 0;
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
  func_0x006e38d8();
  func_0x006e38d8();
  if (in_stack_00000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (plVar8 != (long *)0x0) {
    (**(code **)(*plVar8 + 8))(plVar8);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(in_stack_00000060);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    __ZdlPv(in_stack_00000080);
  }
  if ((char)in_stack_000000a8._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000098);
  }
  if ((char)in_stack_000000c0._7_1_ < '\0') {
    __ZdlPv(uStack00000000000000b0);
  }
  if (in_stack_000000d8._7_1_ < '\0') {
    __ZdlPv(uStack00000000000000c8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60)) goto LAB_0003c8c0;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60)) {
LAB_0003c8c0:
    ___stack_chk_fail();
    func_0x0001748c(&uStack00000000000000c8);
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x3cd8c);
    (*pcVar5)();
  }
  return 2;
}

