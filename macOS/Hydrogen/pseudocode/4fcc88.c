
void FUN_004fcc88(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000038;
  
  if (param_2 != 0) {
    func_0x00187bd4(in_stack_00000038,param_2,1);
  }
  if (in_stack_00000028 != 0) {
    puVar1 = (undefined8 *)(in_stack_00000020 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 3;
      in_stack_00000028 = in_stack_00000028 + -1;
    } while (in_stack_00000028 != 0);
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 * 0x18,8);
  }
  if (in_stack_00000010 != 0) {
    puVar1 = (undefined8 *)(in_stack_00000008 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 3;
      in_stack_00000010 = in_stack_00000010 + -1;
    } while (in_stack_00000010 != 0);
  }
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000 * 0x18,8);
  }
  return;
}

