
undefined8 FUN_002b2110(undefined8 param_1)

{
  int iVar1;
  code *in_x9;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  undefined8 uStack0000000000000010;
  
  uStack0000000000000010 = param_1;
  iVar1 = (*in_x9)();
  if (iVar1 != 0) {
    return 1;
  }
  if (unaff_x23 != 0) {
    _bzero();
  }
  if (unaff_x20 != 0) {
    _bzero();
  }
  *unaff_x19 = 0;
  return 0;
}

