
void FUN_002488ac(long param_1)

{
  undefined8 *puVar1;
  long in_x9;
  long in_x11;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  puVar1 = (undefined8 *)(in_x11 + (in_x9 - param_1) * 0x18);
  *puVar1 = unaff_x20;
  puVar1[1] = unaff_x21;
  puVar1[2] = unaff_x22;
  *(long *)(unaff_x19 + 0xb0) = *(long *)(unaff_x19 + 0xb0) + 1;
  return;
}

