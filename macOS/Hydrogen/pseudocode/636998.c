
undefined8 FUN_00636998(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  undefined8 unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined1 auVar4 [12];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined *in_stack_00000090;
  undefined *in_stack_00000098;
  long *in_stack_000000a8;
  undefined *in_stack_000000f8;
  undefined *in_stack_00000100;
  long *in_stack_00000110;
  
  (**(code **)(param_1 + 8))();
  *(long *)(unaff_x29 + -0xa0) = unaff_x20 + 0x10;
  *(long *)(unaff_x29 + -0x98) = unaff_x20 + 0x1b8;
  if (*(long **)(unaff_x29 + -0x88) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x88) + 8))();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return unaff_x19;
  }
  auVar4 = ___stack_chk_fail();
  uVar1 = auVar4._0_8_;
  if (auVar4._8_4_ != 0) {
    uVar1 = func_0x0001753c(uVar1);
    func_0x00087574();
    func_0x00087574(&uStack0000000000000030);
    func_0x00087574(&uStack0000000000000060);
    __ZdlPv();
    in_stack_00000090 = &UNK_00a0c238;
    in_stack_00000098 = &UNK_00a0c3e0;
    if (in_stack_000000a8 != (long *)0x0) {
      (**(code **)(*in_stack_000000a8 + 8))();
    }
    in_stack_000000f8 = &UNK_00a0c238;
    in_stack_00000100 = &UNK_00a0c3e0;
    if (in_stack_00000110 != (long *)0x0) {
      (**(code **)(*in_stack_00000110 + 8))();
    }
    *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
    plVar2 = *(long **)(unaff_x29 + -0x88);
    if (plVar2 != (long *)0x0) goto code_r0x00636afc;
  }
  plVar2 = (long *)__Unwind_Resume(uVar1);
code_r0x00636afc:
  (**(code **)(*plVar2 + 8))();
  uVar1 = __Unwind_Resume(uVar1);
  __ZdlPv();
  lVar3 = __Unwind_Resume(uVar1);
  return *(undefined8 *)(lVar3 + 0x20);
}

