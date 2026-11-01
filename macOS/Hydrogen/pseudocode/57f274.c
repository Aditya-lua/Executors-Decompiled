
void FUN_0057f274(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 8) + unaff_x20 * 0x20);
  puVar1[1] = in_stack_00000008;
  *puVar1 = in_stack_00000000;
  puVar1[3] = in_stack_00000018;
  puVar1[2] = in_stack_00000010;
  *(long *)(unaff_x19 + 0x10) = unaff_x20 + 1;
  return;
}

