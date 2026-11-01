
void FUN_00650050(undefined8 *param_1,undefined8 param_2)

{
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 *unaff_x22;
  
  if (param_1 != unaff_x22) {
    do {
      param_1 = param_1 + -10;
      (**(code **)*param_1)(param_1);
    } while (param_1 != unaff_x22);
    param_2 = *(undefined8 *)*unaff_x19;
  }
  *(undefined8 **)(unaff_x21 + 8) = unaff_x22;
  __ZdlPv(param_2);
  return;
}

