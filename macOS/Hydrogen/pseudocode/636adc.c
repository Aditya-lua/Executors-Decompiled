
undefined8 FUN_00636adc(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x29;
  
  *(long *)(unaff_x29 + -0xa0) = param_1 + 0x238;
  *(long *)(unaff_x29 + -0x98) = param_1 + 0x3e0;
  plVar1 = *(long **)(unaff_x29 + -0x88);
  if (plVar1 == (long *)0x0) {
    plVar1 = (long *)__Unwind_Resume();
  }
  (**(code **)(*plVar1 + 8))();
  uVar2 = __Unwind_Resume();
  __ZdlPv();
  lVar3 = __Unwind_Resume(uVar2);
  return *(undefined8 *)(lVar3 + 0x20);
}

