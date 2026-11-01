
void FUN_006e1fb4(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *in_x9;
  long unaff_x19;
  undefined8 uVar1;
  
  while (param_2 < in_x9) {
    param_1[1] = param_1[-1];
    *param_1 = param_1[-2];
    param_1 = param_1 + -2;
    in_x9 = param_1;
  }
  uVar1 = **(undefined8 **)(unaff_x19 + 8);
  param_2[1] = (*(undefined8 **)(unaff_x19 + 8))[1];
  *param_2 = uVar1;
  return;
}

