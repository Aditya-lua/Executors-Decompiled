
void FUN_0040999c(undefined8 param_1,undefined1 *param_2)

{
  undefined8 in_stack_00000008;
  
  in_stack_00000008._3_3_ = in_stack_00000008._3_3_ & 0xff;
  in_stack_00000008._3_4_ = (uint)in_stack_00000008._3_3_;
  *(undefined2 *)(param_2 + 9) = 0;
  param_2[0xb] = 0;
  param_2[8] = 0x13;
  *(uint *)(param_2 + 0xc) = in_stack_00000008._3_4_;
  *(undefined8 *)(param_2 + 0x10) = param_1;
  *param_2 = 10;
  return;
}

