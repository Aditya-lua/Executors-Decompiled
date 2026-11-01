
void FUN_006b851c(undefined8 param_1)

{
  bool in_ZR;
  bool in_CY;
  undefined8 uVar1;
  undefined8 *unaff_x20;
  
  if (in_CY && !in_ZR) {
    uVar1 = *unaff_x20;
    *unaff_x20 = param_1;
    unaff_x20[1] = uVar1;
    return;
  }
  return;
}

