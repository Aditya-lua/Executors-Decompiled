
void FUN_00706d6c(undefined8 *param_1)

{
  undefined8 *unaff_x20;
  long unaff_x21;
  
  while( true ) {
    (**(code **)*param_1)();
    unaff_x21 = unaff_x21 + -8;
    if (unaff_x21 == 0) break;
    param_1 = (undefined8 *)*unaff_x20;
    unaff_x20 = unaff_x20 + 1;
  }
  return;
}

