
long FUN_0063ba8c(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long lVar3;
  long in_x9;
  long unaff_x29;
  undefined1 uStack0000000000000048;
  undefined *in_stack_00000108;
  undefined *in_stack_00000110;
  long *in_stack_00000120;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  func_0x00655148(&uStack0000000000000048);
  __ZdlPv();
  in_stack_00000108 = &UNK_00a0c238;
  in_stack_00000110 = &UNK_00a0c3e0;
  if (in_stack_00000120 != (long *)0x0) {
    (**(code **)(*in_stack_00000120 + 8))();
  }
  *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
  plVar1 = *(long **)(unaff_x29 + -0x88);
  if (plVar1 == (long *)0x0) {
    plVar1 = (long *)__Unwind_Resume();
  }
  (**(code **)(*plVar1 + 8))();
  uVar2 = __Unwind_Resume();
  __ZdlPv();
  lVar3 = __Unwind_Resume(uVar2);
  return lVar3 + 0x18;
}

