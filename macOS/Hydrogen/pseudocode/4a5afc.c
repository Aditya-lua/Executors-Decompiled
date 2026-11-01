
undefined8 FUN_004a5afc(void)

{
  undefined8 *puVar1;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
  }
  puVar1 = (undefined8 *)__Unwind_Resume();
  return *puVar1;
}

