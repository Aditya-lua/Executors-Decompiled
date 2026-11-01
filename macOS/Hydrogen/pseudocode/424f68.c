
void FUN_00424f68(long param_1,undefined8 param_2,char *param_3)

{
  bool bVar1;
  long in_x9;
  ulong unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  
  if (unaff_x21 == 0 || (char *)(in_x9 + -1) == (char *)0x0) {
    bVar1 = false;
    if (unaff_x19 == 0) goto LAB_00424fa8;
LAB_00424f94:
    if (*param_3 != '/') goto LAB_00424fa8;
    unaff_x21 = 0;
  }
  else {
    bVar1 = *(char *)(in_x9 + -1) != '/';
    if (unaff_x19 != 0) goto LAB_00424f94;
LAB_00424fa8:
    if (!bVar1) goto LAB_00424fc8;
    if (*unaff_x20 == unaff_x21) {
      func_0x007a0000();
      param_1 = unaff_x20[1];
      unaff_x21 = unaff_x20[2];
    }
    *(undefined1 *)(param_1 + unaff_x21) = 0x2f;
    unaff_x21 = unaff_x21 + 1;
  }
  unaff_x20[2] = unaff_x21;
LAB_00424fc8:
  if ((ulong)(*unaff_x20 - unaff_x21) < unaff_x19) {
    func_0x007a0000();
    param_1 = unaff_x20[1];
    unaff_x21 = unaff_x20[2];
  }
  _memcpy(param_1 + unaff_x21,param_3);
  unaff_x20[2] = unaff_x21 + unaff_x19;
  return;
}

