
undefined8 FUN_0042f47c(ulong param_1,undefined8 param_2)

{
  ulong uVar1;
  long *unaff_x19;
  long in_xzr;
  
  if (((param_1 & 0x7fffffffffffffff) != 0) && (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
  if (*unaff_x19 == 1) {
    *unaff_x19 = in_xzr;
  }
  else {
    func_0x007a1ae8();
  }
  return param_2;
}

