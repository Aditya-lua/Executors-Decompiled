
void FUN_00050380(undefined8 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  ulong unaff_x23;
  
  *unaff_x20 = in_x10;
  *param_1 = unaff_x20;
  *(undefined8 **)(in_x9 + unaff_x22 * 8) = param_1;
  if (*unaff_x20 != 0) {
    uVar2 = *(ulong *)(*unaff_x20 + 8);
    if ((unaff_x23 & unaff_x23 - 1) == 0) {
      uVar2 = uVar2 & unaff_x23 - 1;
    }
    else if (unaff_x23 <= uVar2) {
      uVar1 = 0;
      if (unaff_x23 != 0) {
        uVar1 = uVar2 / unaff_x23;
      }
      uVar2 = uVar2 - uVar1 * unaff_x23;
    }
    *(long **)(*unaff_x19 + uVar2 * 8) = unaff_x20;
  }
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

