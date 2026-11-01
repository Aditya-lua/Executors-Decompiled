
undefined8 FUN_00207a1c(void)

{
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x23;
  long in_xzr;
  
  *(undefined1 *)(unaff_x20 + 0x10) = 1;
  if (*unaff_x19 == 1) {
    *unaff_x19 = in_xzr;
  }
  else {
    func_0x007a1ae8();
  }
  if ((code *)*unaff_x23 != (code *)0x0) {
    (*(code *)*unaff_x23)();
  }
  if (unaff_x23[1] != 0) {
    func_0x00187bd4();
  }
  return 0;
}

