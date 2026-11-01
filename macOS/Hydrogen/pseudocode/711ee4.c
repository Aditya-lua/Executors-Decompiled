
void FUN_00711ee4(undefined8 param_1)

{
  undefined8 in_x9;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  
  *unaff_x20 = in_x9;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = param_1;
  if (unaff_x21 != 0) {
    __ZdlPv();
  }
  unaff_x20[1] = unaff_x22;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

