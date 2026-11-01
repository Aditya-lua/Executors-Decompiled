
void FUN_00265e54(void)

{
  long unaff_x20;
  undefined8 *puVar1;
  long in_stack_00000758;
  long in_stack_00000760;
  
  if (in_stack_00000760 != 0) {
    puVar1 = (undefined8 *)(in_stack_00000758 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 3;
      in_stack_00000760 = in_stack_00000760 + -1;
    } while (in_stack_00000760 != 0);
  }
  if (unaff_x20 != 0) {
    func_0x00187bd4(in_stack_00000758,unaff_x20 * 0x18,8);
  }
  return;
}

