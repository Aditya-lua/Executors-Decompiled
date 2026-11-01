
undefined * FUN_001869d4(long param_1)

{
  long unaff_x19;
  long unaff_x21;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  
  _memcpy(*(long *)(param_1 + 8) + *(long *)(unaff_x21 + 0x10) * 0x48);
  *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + unaff_x19;
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000 * 0x48,8);
  }
  return &UNK_00001b58;
}

