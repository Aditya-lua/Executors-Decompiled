
undefined8 FUN_002dc60c(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  long *unaff_x21;
  
  lVar1 = func_0x0036effc();
  unaff_x19[2] = lVar1;
  if (*unaff_x21 == 0 || lVar1 == 0) {
    *unaff_x19 = 0;
    func_0x0036e3d8();
    func_0x0036e3d8(unaff_x19[2]);
    *unaff_x21 = 0;
    unaff_x21[1] = 0;
    return 0;
  }
  return 1;
}

