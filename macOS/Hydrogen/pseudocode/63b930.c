
long FUN_0063b930(long param_1,long param_2)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar4 [12];
  undefined1 uStack0000000000000048;
  undefined *in_stack_00000108;
  undefined *in_stack_00000110;
  long *in_stack_00000120;
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  func_0x006553a4(&uStack0000000000000048);
  in_stack_00000108 = &UNK_00a0c238;
  in_stack_00000110 = &UNK_00a0c3e0;
  if (in_stack_00000120 != (long *)0x0) {
    (**(code **)(*in_stack_00000120 + 8))();
  }
  *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
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
    func_0x006553a4(&uStack0000000000000048);
    __ZdlPv();
    in_stack_00000108 = &UNK_00a0c238;
    in_stack_00000110 = &UNK_00a0c3e0;
    if (in_stack_00000120 != (long *)0x0) {
      (**(code **)(*in_stack_00000120 + 8))();
    }
    *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
    plVar2 = *(long **)(unaff_x29 + -0x88);
    if (plVar2 != (long *)0x0) goto code_r0x0063bbec;
  }
  plVar2 = (long *)__Unwind_Resume(uVar1);
code_r0x0063bbec:
  (**(code **)(*plVar2 + 8))();
  uVar1 = __Unwind_Resume(uVar1);
  __ZdlPv();
  lVar3 = __Unwind_Resume(uVar1);
  return lVar3 + 0x18;
}

