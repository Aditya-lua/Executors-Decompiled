
void FUN_006506b4(undefined8 *param_1)

{
  undefined8 *unaff_x20;
  
  while (param_1 != unaff_x20) {
    param_1 = param_1 + -10;
    (**(code **)*param_1)(param_1);
  }
  if (unaff_x20 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  return;
}

