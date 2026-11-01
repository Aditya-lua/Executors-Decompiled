
undefined8 * FUN_00663d1c(undefined8 param_1)

{
  undefined8 *puVar1;
  long unaff_x19;
  
  func_0x0062a89c();
  func_0x0062a89c();
  if (*(long **)(unaff_x19 + 0x10) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x10) + 8))();
  }
  puVar1 = (undefined8 *)__Unwind_Resume(param_1);
  *puVar1 = &UNK_00a09a70;
  func_0x00675af8(puVar1 + 1);
  func_0x00675af8(puVar1 + 5);
  *(undefined1 *)(puVar1 + 9) = 1;
  return puVar1;
}

