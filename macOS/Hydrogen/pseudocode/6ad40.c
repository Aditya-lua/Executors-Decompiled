
undefined8 * FUN_0006ad40(undefined8 param_1,undefined8 *param_2)

{
  undefined1 uVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined1 auVar6 [12];
  undefined1 auVar7 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined1 uStack000000000000001f;
  undefined7 uStack0000000000000020;
  long in_stack_00000028;
  long alStack_68 [3];
  long *plStack_50;
  long alStack_48 [3];
  long *plStack_30;
  long lStack_28;
  
  uStack0000000000000018 = (undefined7)param_1;
  uStack000000000000001f = (undefined1)*(undefined8 *)((long)param_2 + 0xf);
  uStack0000000000000020 = (undefined7)((ulong)*(undefined8 *)((long)param_2 + 0xf) >> 8);
  uVar1 = *(undefined1 *)((long)param_2 + 0x17);
  param_2[1] = 0;
  param_2[2] = 0;
  *param_2 = 0;
  if (*(char *)(unaff_x19 + 0x77) < '\0') {
    param_2 = (undefined8 *)__ZdlPv(*(undefined8 *)(unaff_x19 + 0x60));
  }
  *(undefined8 *)(unaff_x19 + 0x60) = unaff_x20;
  *(ulong *)(unaff_x19 + 0x68) = CONCAT17(uStack000000000000001f,uStack0000000000000018);
  *(ulong *)(unaff_x19 + 0x6f) = CONCAT71(uStack0000000000000020,uStack000000000000001f);
  *(undefined1 *)(unaff_x19 + 0x77) = uVar1;
  if (in_stack_00000010 < 0) {
    param_2 = (undefined8 *)__ZdlPv(in_stack_00000000);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return param_2;
  }
  uVar2 = ___stack_chk_fail();
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    uVar2 = __Unwind_Resume(uVar2);
  }
  auVar7 = __Unwind_Resume(uVar2);
  plVar3 = auVar7._8_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  plStack_50 = (long *)plVar3[3];
  if (plStack_50 == (long *)0x0) {
    plStack_50 = (long *)0x0;
  }
  else if (plStack_50 == plVar3) {
    plStack_50 = alStack_68;
    (**(code **)(*plVar3 + 0x18))(plVar3,alStack_68);
  }
  else {
    plVar3[3] = 0;
  }
  plStack_30 = (long *)0x0;
  plVar3 = (long *)__Znwm(0x28);
  *plVar3 = (long)&UNK_009b8df8;
  if (plStack_50 == (long *)0x0) {
    plVar3[4] = 0;
  }
  else if (plStack_50 == alStack_68) {
    plVar3[4] = (long)(plVar3 + 1);
    (**(code **)(alStack_68[0] + 0x18))(alStack_68);
  }
  else {
    plVar3[4] = (long)plStack_50;
    plStack_50 = (long *)0x0;
  }
  plStack_30 = plVar3;
  func_0x0006dd48(alStack_48,auVar7._0_8_);
  if (plStack_30 == alStack_48) {
    lVar5 = 4;
    plVar3 = alStack_48;
LAB_0006af4c:
    (**(code **)(*plVar3 + lVar5 * 8))();
  }
  else if (plStack_30 != (long *)0x0) {
    lVar5 = 5;
    plVar3 = plStack_30;
    goto LAB_0006af4c;
  }
  if (plStack_50 == alStack_68) {
    lVar5 = 4;
    plVar3 = alStack_68;
LAB_0006af7c:
    (**(code **)(*plVar3 + lVar5 * 8))();
  }
  else if (plStack_50 != (long *)0x0) {
    lVar5 = 5;
    plVar3 = plStack_50;
    goto LAB_0006af7c;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return auVar7._0_8_;
  }
  auVar6 = ___stack_chk_fail();
  uVar2 = auVar6._0_8_;
  if (auVar6._8_4_ != 0) {
    uVar2 = func_0x0001753c(uVar2);
    if (plStack_50 == alStack_68) {
      lVar5 = 4;
      plVar3 = alStack_68;
    }
    else {
      if (plStack_50 == (long *)0x0) goto LAB_0006b000;
      lVar5 = 5;
      plVar3 = plStack_50;
    }
    (**(code **)(*plVar3 + lVar5 * 8))();
  }
LAB_0006b000:
  puVar4 = (undefined8 *)__Unwind_Resume(uVar2);
  return puVar4;
}

