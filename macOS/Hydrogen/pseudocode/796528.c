
undefined8 FUN_00796528(undefined8 *param_1)

{
  long lVar1;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  
  param_1[1] = unaff_x24;
  param_1[2] = unaff_x25;
  param_1[5] = unaff_x23;
  *param_1 = unaff_x22;
  param_1[6] = 0;
  param_1[7] = 0;
  if (unaff_x21 != 0) {
    lVar1 = (*pcRam0000000000a2b600)();
    unaff_x19[4] = lVar1;
    if (lVar1 == 0) {
      if (*unaff_x19 != 0) {
        (*pcRam0000000000a2b5f0)();
        *unaff_x19 = 0;
      }
      unaff_x19[1] = 0;
      if (unaff_x19[6] != 0) {
        (*pcRam0000000000a2b5f0)();
        param_1[6] = 0;
      }
      unaff_x19[7] = 0;
      *(undefined4 *)(unaff_x19 + 3) = 0;
      unaff_x19[2] = 0;
      (*pcRam0000000000a2b5f0)(unaff_x19[4]);
      unaff_x19[4] = 0;
      (*pcRam0000000000a2b5f0)();
      return 0x1b;
    }
  }
  *unaff_x20 = unaff_x19;
  return 0;
}

