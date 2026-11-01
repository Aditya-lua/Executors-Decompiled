
void FUN_00512b9c(long param_1)

{
  undefined8 *puVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  puVar1 = (undefined8 *)(param_1 + unaff_x20 * 0x18);
  puVar1[1] = in_stack_00000010;
  *puVar1 = in_stack_00000008;
  puVar1[2] = in_stack_00000018;
  *(long *)(unaff_x19 + 0x58) = unaff_x20 + 1;
  return;
}

