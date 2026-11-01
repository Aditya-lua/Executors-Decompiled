
undefined8 FUN_0042f6b8(undefined8 param_1)

{
  ulong uVar1;
  long *unaff_x19;
  long in_xzr;
  
  uVar1 = func_0x007a1140();
  if ((uVar1 & 1) == 0) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
  if (*unaff_x19 == 1) {
    *unaff_x19 = in_xzr;
  }
  else {
    func_0x007a1ae8();
  }
  return param_1;
}

