
void FUN_004004bc(void)

{
  long in_stack_00000028;
  undefined8 *in_stack_00000040;
  
  *(long *)(in_stack_00000028 + 0x10) = *(long *)(in_stack_00000028 + 0x10) + 1;
  *in_stack_00000040 = 0x8000000000000000;
  return;
}

