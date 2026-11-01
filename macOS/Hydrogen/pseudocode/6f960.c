
/* WARNING: Possible PIC construction at 0x0006fa10: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006fa14) */
/* WARNING: Removing unreachable block (ram,0x0006fa30) */
/* WARNING: Removing unreachable block (ram,0x0006fa24) */
/* WARNING: Removing unreachable block (ram,0x0006fa28) */
/* WARNING: Removing unreachable block (ram,0x0006fa38) */
/* WARNING: Removing unreachable block (ram,0x0006fa44) */
/* WARNING: Removing unreachable block (ram,0x0006fa60) */
/* WARNING: Removing unreachable block (ram,0x0006fa54) */
/* WARNING: Removing unreachable block (ram,0x0006fa58) */
/* WARNING: Removing unreachable block (ram,0x0006fa68) */
/* WARNING: Removing unreachable block (ram,0x0006fa74) */
/* WARNING: Removing unreachable block (ram,0x0006faa0) */
/* WARNING: Removing unreachable block (ram,0x0006faa8) */
/* WARNING: Removing unreachable block (ram,0x0006fab0) */
/* WARNING: Removing unreachable block (ram,0x0006fad4) */
/* WARNING: Removing unreachable block (ram,0x0006fad8) */
/* WARNING: Removing unreachable block (ram,0x0006fac8) */
/* WARNING: Removing unreachable block (ram,0x0006fadc) */
/* WARNING: Removing unreachable block (ram,0x0006fae8) */
/* WARNING: Removing unreachable block (ram,0x0006faf8) */
/* WARNING: Removing unreachable block (ram,0x0006fa8c) */

undefined8 FUN_0006f960(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  undefined8 *in_x9;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x29;
  undefined1 auVar7 [12];
  long lStack0000000000000008;
  long *in_stack_00000020;
  long lStack0000000000000028;
  long *plStack0000000000000040;
  long alStack_a8 [3];
  long *plStack_90;
  long alStack_88 [3];
  long *plStack_70;
  long alStack_68 [3];
  long *plStack_50;
  long lStack_48;
  
  *(undefined8 *)(unaff_x29 + -0x18) = *in_x9;
  plStack0000000000000040 = (long *)param_2[3];
  if (plStack0000000000000040 == (long *)0x0) {
    plStack0000000000000040 = (long *)0x0;
  }
  else if (plStack0000000000000040 == param_2) {
    plStack0000000000000040 = &lStack0000000000000028;
    (**(code **)(*param_2 + 0x18))(param_2,&lStack0000000000000028);
  }
  else {
    param_2[3] = 0;
  }
  in_stack_00000020 = (long *)unaff_x20[3];
  if (in_stack_00000020 == (long *)0x0) {
    in_stack_00000020 = (long *)0x0;
  }
  else if (in_stack_00000020 == unaff_x20) {
    in_stack_00000020 = &lStack0000000000000008;
    (**(code **)(*unaff_x20 + 0x18))();
  }
  else {
    unaff_x20[3] = 0;
  }
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar4 = *unaff_x19;
  uVar2 = unaff_x19[1];
  uVar1 = unaff_x19[2];
  uVar3 = unaff_x19[3];
  plStack_50 = (long *)0x0;
  if (plStack0000000000000040 == (long *)0x0) {
    plStack_70 = (long *)0x0;
  }
  else if (plStack0000000000000040 == &lStack0000000000000028) {
    plStack_70 = alStack_88;
    (**(code **)(lStack0000000000000028 + 0x18))(&lStack0000000000000028,alStack_88);
  }
  else {
    plStack_70 = plStack0000000000000040;
    plStack0000000000000040 = (long *)0x0;
  }
  if (in_stack_00000020 == (long *)0x0) {
    plStack_90 = (long *)0x0;
  }
  else if (in_stack_00000020 == &lStack0000000000000008) {
    plStack_90 = alStack_a8;
    (**(code **)(lStack0000000000000008 + 0x18))(&lStack0000000000000008,alStack_a8);
  }
  else {
    plStack_90 = in_stack_00000020;
    in_stack_00000020 = (long *)0x0;
  }
  uVar4 = func_0x00069bb8(uVar4,uVar2,uVar1,uVar3,alStack_68,alStack_88,alStack_a8);
  if (plStack_90 == alStack_a8) {
    lVar6 = 4;
    plVar5 = alStack_a8;
LAB_0006fc18:
    (**(code **)(*plVar5 + lVar6 * 8))();
  }
  else if (plStack_90 != (long *)0x0) {
    lVar6 = 5;
    plVar5 = plStack_90;
    goto LAB_0006fc18;
  }
  if (plStack_70 == alStack_88) {
    lVar6 = 4;
    plVar5 = alStack_88;
LAB_0006fc48:
    (**(code **)(*plVar5 + lVar6 * 8))();
  }
  else if (plStack_70 != (long *)0x0) {
    lVar6 = 5;
    plVar5 = plStack_70;
    goto LAB_0006fc48;
  }
  if (plStack_50 == alStack_68) {
    lVar6 = 4;
    plVar5 = alStack_68;
LAB_0006fc78:
    (**(code **)(*plVar5 + lVar6 * 8))();
  }
  else if (plStack_50 != (long *)0x0) {
    lVar6 = 5;
    plVar5 = plStack_50;
    goto LAB_0006fc78;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return uVar4;
  }
  auVar7 = ___stack_chk_fail();
  uVar4 = auVar7._0_8_;
  if (auVar7._8_4_ == 0) goto LAB_0006fd1c;
  uVar4 = func_0x0001753c(uVar4);
  if (plStack_90 == alStack_a8) {
    lVar6 = 4;
    plVar5 = alStack_a8;
LAB_0006fcf4:
    (**(code **)(*plVar5 + lVar6 * 8))();
  }
  else if (plStack_90 != (long *)0x0) {
    lVar6 = 5;
    plVar5 = plStack_90;
    goto LAB_0006fcf4;
  }
  func_0x00799d74(alStack_88,&plStack_50,alStack_68);
LAB_0006fd1c:
  uVar4 = __Unwind_Resume(uVar4);
  return uVar4;
}

