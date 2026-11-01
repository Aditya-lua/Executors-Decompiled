
void FUN_0049bcd4(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long in_stack_00000008;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_000000a8;
  
  func_0x00187bd4(in_stack_000000a8,param_2,1);
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030,1);
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4();
  }
  lVar1 = __Unwind_Resume();
  *(undefined1 *)(lVar1 + 0x38) = 2;
  if (*(long *)(lVar1 + 8) == 2) {
    func_0x004a4fa4(lVar1 + 0x10);
  }
  return;
}

