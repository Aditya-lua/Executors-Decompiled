
void FUN_00400394(undefined8 *param_1)

{
  long in_x13;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 *unaff_x25;
  
  *(undefined2 *)((long)param_1 + 0x21a) = 1;
  *param_1 = 0;
  param_1[1] = unaff_x21;
  param_1[2] = unaff_x22;
  param_1[3] = unaff_x19;
  param_1[0x22] = unaff_x23;
  param_1[0x23] = unaff_x24;
  param_1[0x24] = unaff_x20;
  *(long *)(in_x13 + 0x10) = *(long *)(in_x13 + 0x10) + 1;
  *unaff_x25 = 0x8000000000000000;
  return;
}

