
void FUN_00401940(undefined8 param_1,long param_2)

{
  undefined8 in_x9;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  *(undefined8 *)(param_2 + 8) = unaff_x21;
  *(undefined8 *)(param_2 + 0x10) = 0;
  *(undefined8 *)(param_2 + 0x18) = in_x9;
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x20;
  return;
}

