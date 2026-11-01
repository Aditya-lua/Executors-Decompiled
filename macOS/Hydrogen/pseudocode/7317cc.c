
void FUN_007317cc(long param_1)

{
  long *unaff_x21;
  
  while( true ) {
    (**(code **)(param_1 + 0x38))(unaff_x21);
    unaff_x21 = (long *)unaff_x21[1];
    if (unaff_x21 == (long *)0x0) break;
    param_1 = *unaff_x21;
  }
  return;
}

