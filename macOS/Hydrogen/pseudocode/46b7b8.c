
void FUN_0046b7b8(undefined8 *param_1,long param_2)

{
  undefined8 in_x9;
  undefined8 uVar1;
  long in_x10;
  long in_x11;
  
  if (in_x11 == 0) {
    if (in_x10 == -1) {
      uVar1 = 0;
      goto LAB_0046b7d0;
    }
    in_x10 = in_x10 + 1;
  }
  else if (in_x11 != 1) {
    in_x10 = param_2;
  }
  param_1[1] = in_x9;
  param_1[2] = in_x10;
  uVar1 = 1;
LAB_0046b7d0:
  *param_1 = uVar1;
  return;
}

