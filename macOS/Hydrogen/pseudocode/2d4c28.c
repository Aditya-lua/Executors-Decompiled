
void FUN_002d4c28(long param_1,undefined8 param_2)

{
  long in_x9;
  long unaff_x29;
  
  if (**(long **)(in_x9 + 0x1e8) != param_1) {
    do {
      ___stack_chk_fail(param_2);
      param_2 = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

