
undefined8 FUN_00382be0(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  bool in_CY;
  undefined8 in_x6;
  undefined8 in_x7;
  undefined8 in_x9;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  if (in_CY) {
    unaff_x22 = in_x9;
    unaff_x21 = param_1;
    unaff_x20 = in_x7;
    unaff_x19 = in_x6;
  }
  *param_3 = unaff_x19;
  param_3[1] = unaff_x20;
  param_3[2] = unaff_x21;
  param_3[3] = unaff_x22;
  return 1;
}

