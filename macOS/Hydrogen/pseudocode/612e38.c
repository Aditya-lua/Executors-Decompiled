
void FUN_00612e38(long param_1)

{
  long *unaff_x19;
  byte unaff_w20;
  int unaff_w21;
  byte bStack000000000000000e;
  
  while( true ) {
    (**(code **)(param_1 + 0x38))();
    unaff_w21 = unaff_w21 + -7;
    if (unaff_w21 == 0) break;
    param_1 = *unaff_x19;
  }
  bStack000000000000000e = unaff_w20 & 0x7f;
  (**(code **)(*unaff_x19 + 0x38))();
  return;
}

