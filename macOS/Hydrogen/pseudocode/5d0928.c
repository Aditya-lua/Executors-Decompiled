
undefined8 FUN_005d0928(long param_1)

{
  char *unaff_x20;
  char in_wzr;
  
  if (param_1 != 0) {
    param_1 = param_1 << 3;
    do {
      func_0x005d5ff8();
      param_1 = param_1 + -8;
    } while (param_1 != 0);
  }
  func_0x005d6394();
  if (*unaff_x20 == '\x01') {
    *unaff_x20 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  func_0x00187bd4();
  return 0;
}

