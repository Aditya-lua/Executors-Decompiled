
void FUN_00713924(long param_1)

{
  long in_x9;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  
  *(undefined8 *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x22;
  return;
}

