
undefined * FUN_00616990(long param_1)

{
  long lStack0000000000000010;
  long *in_stack_00000018;
  
  lStack0000000000000010 = param_1 + 0x10;
  if (in_stack_00000018 != (long *)0x0) {
    (**(code **)(*in_stack_00000018 + 8))();
  }
  __Unwind_Resume();
  func_0x0001753c();
  return &UNK_008bb220;
}

