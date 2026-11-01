
long FUN_0063bb70(void)

{
  long *plVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x29;
  long *in_stack_00000120;
  
  __ZdlPv();
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

