
void FUN_002d4bf0(void)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  long unaff_x29;
  
  ___memcpy_chk();
  iVar1 = func_0x002ab2b0();
  if (iVar1 == 0) {
    plVar3 = (long *)_abort();
                    /* WARNING: Could not recover jumptable at 0x002d4c78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar3 + 0x88))();
    return;
  }
  func_0x0036e464();
  uVar2 = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28)) {
    do {
      ___stack_chk_fail(uVar2);
      uVar2 = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

