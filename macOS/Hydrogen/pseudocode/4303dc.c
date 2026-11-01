
void FUN_004303dc(undefined8 param_1)

{
  ulong in_x9;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  if (0x3e < in_x9) {
    in_x9 = 0x3f;
  }
  if (in_x9 < 2) {
    in_x9 = 1;
  }
  _memcpy(&uStack0000000000000040,param_1,in_x9);
  _pthread_setname_np();
  return;
}

