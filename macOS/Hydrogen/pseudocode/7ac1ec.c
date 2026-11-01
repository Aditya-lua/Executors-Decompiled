
undefined8 FUN_007ac1ec(long param_1)

{
  ulong uVar1;
  undefined8 in_x10;
  long in_x11;
  long in_x12;
  undefined8 unaff_x22;
  long in_stack_00000040;
  long in_stack_00000048;
  
  *(undefined8 *)(param_1 + 0x10) = in_x10;
  *(undefined8 *)(param_1 + 0x18) = unaff_x22;
  if (in_x12 != 0) {
    uVar1 = (in_stack_00000048 + in_stack_00000040 + in_stack_00000040 * in_x12) - 1U &
            -in_stack_00000048;
    func_0x00187bd4(in_x11 - uVar1,in_x12 + uVar1 + 9);
  }
  return 0x8000000000000001;
}

