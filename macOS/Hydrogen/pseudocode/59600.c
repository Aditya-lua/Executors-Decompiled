
undefined8 FUN_00059600(undefined8 *param_1,undefined8 *param_2)

{
  long *in_x9;
  long lVar1;
  long unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  
  *param_2 = 0;
  param_2[1] = 0;
  if (in_x9 == (long *)0x0) {
    unaff_x21[5] = 0;
  }
  else if (in_x9 == unaff_x22) {
    unaff_x21[5] = (long)(unaff_x21 + 2);
    (**(code **)(*unaff_x22 + 0x18))();
  }
  else {
    unaff_x21[5] = (long)in_x9;
    *param_1 = 0;
  }
  lVar1 = *(long *)(unaff_x20 + 0x20);
  *unaff_x21 = lVar1;
  unaff_x21[1] = unaff_x20 + 0x20;
  *(long **)(lVar1 + 8) = unaff_x21;
  *(long **)(unaff_x20 + 0x20) = unaff_x21;
  *(long *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + 1;
  __ZNSt3__15mutex6unlockEv();
  __ZNSt3__118condition_variable10notify_oneEv(unaff_x20 + 0x48);
  return 1;
}

