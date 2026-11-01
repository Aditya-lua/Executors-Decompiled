
void FUN_004e1600(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined1 in_ZR;
  undefined8 *in_x9;
  undefined8 *in_x10;
  undefined8 *in_x11;
  undefined8 *unaff_x19;
  undefined8 unaff_x22;
  
  for (; (!(bool)in_ZR && (in_x9 != in_x11)); in_x9 = in_x9 + 2) {
    uVar1 = in_x9[1];
    in_x10[-1] = *in_x9;
    *in_x10 = uVar1;
    in_x10 = in_x10 + 2;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  *unaff_x19 = unaff_x22;
  unaff_x19[1] = param_2;
  unaff_x19[2] = unaff_x22;
  return;
}

