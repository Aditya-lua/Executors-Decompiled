
bool FUN_00538394(undefined8 *param_1)

{
  short *psVar1;
  long in_x9;
  
  if ((in_x9 == 0) || (psVar1 = (short *)*param_1, (char)*psVar1 != '-')) {
    return false;
  }
  if (in_x9 == 1) {
    return (char)*psVar1 != '-';
  }
  return *psVar1 != 0x2d2d;
}

