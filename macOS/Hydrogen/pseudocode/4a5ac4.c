
undefined8 FUN_004a5ac4(void)

{
  long lVar1;
  undefined8 *puVar2;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  func_0x00187bd4();
  if ((in_stack_000000a8 != 0) && (lVar1 = in_stack_000000a8 * 0x11 + 0x19, lVar1 != 0)) {
    func_0x00187bd4(in_stack_000000a0 + in_stack_000000a8 * -0x10 + -0x10,lVar1,8);
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
  }
  puVar2 = (undefined8 *)__Unwind_Resume();
  return *puVar2;
}

