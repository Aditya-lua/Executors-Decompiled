
void FUN_00401318(long param_1)

{
  undefined2 in_w8;
  undefined8 *in_x12;
  long in_x13;
  undefined8 unaff_x21;
  long *unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x27;
  
  *(undefined8 *)(param_1 + 0x110) = unaff_x21;
  *(undefined8 *)(param_1 + 0x118) = unaff_x27;
  *(undefined8 *)(param_1 + 0x120) = unaff_x24;
  *(long **)(param_1 + 0x228) = unaff_x23;
  *unaff_x23 = param_1;
  *(undefined2 *)(unaff_x23 + 0x43) = in_w8;
  *(long *)(in_x13 + 0x10) = *(long *)(in_x13 + 0x10) + 1;
  *in_x12 = 0x8000000000000001;
  return;
}

