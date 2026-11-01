
void FUN_0006d9c8(undefined8 *param_1)

{
  int in_w8;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 unaff_x24;
  undefined8 uVar1;
  
  if (in_w8 < 0) {
    func_0x00017634(param_1,*unaff_x20,unaff_x20[1]);
  }
  else {
    uVar1 = *unaff_x20;
    param_1[1] = unaff_x20[1];
    *param_1 = uVar1;
    param_1[2] = unaff_x20[2];
  }
  *unaff_x21 = 0;
  unaff_x21[1] = 0;
  unaff_x21[2] = unaff_x24;
  *unaff_x22 = unaff_x21;
  if (*(long *)*unaff_x19 != 0) {
    *unaff_x19 = *(long *)*unaff_x19;
  }
  func_0x0003767c(unaff_x19[1]);
  unaff_x19[2] = unaff_x19[2] + 1;
  return;
}

