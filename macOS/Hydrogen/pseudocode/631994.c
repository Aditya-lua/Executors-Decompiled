
void FUN_00631994(undefined8 param_1,long param_2)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  
  if (param_2 != unaff_x20) {
    do {
      param_2 = func_0x00650db0(param_2 + -0x80);
    } while (param_2 != unaff_x20);
    param_1 = *unaff_x19;
  }
  unaff_x19[1] = unaff_x20;
  __ZdlPv(param_1);
  return;
}

