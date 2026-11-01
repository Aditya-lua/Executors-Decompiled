
void FUN_006206c4(undefined8 *param_1,undefined8 param_2)

{
  bool in_ZR;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  
  if (!in_ZR) {
    do {
      param_1 = param_1 + -6;
      (**(code **)*param_1)(param_1);
    } while (param_1 != unaff_x21);
    param_2 = *unaff_x19;
  }
  unaff_x19[1] = unaff_x21;
  __ZdlPv(param_2);
  return;
}

