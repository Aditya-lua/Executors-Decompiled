
void FUN_0078e13c(void)

{
  undefined8 uVar1;
  long unaff_x29;
  
  _strlen();
  func_0x0072a784();
  uVar1 = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    do {
      ___stack_chk_fail(uVar1);
      uVar1 = 0x1b;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38));
  }
  return;
}

