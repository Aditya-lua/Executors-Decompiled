
undefined8 FUN_0042f58c(long *param_1,undefined8 param_2)

{
  bool in_ZR;
  ulong uVar1;
  long in_xzr;
  
  if ((!in_ZR) && (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
    *(undefined1 *)(param_1 + 1) = 1;
  }
  if (*param_1 == 1) {
    *param_1 = in_xzr;
  }
  else {
    func_0x007a1ae8(param_1);
  }
  return param_2;
}

