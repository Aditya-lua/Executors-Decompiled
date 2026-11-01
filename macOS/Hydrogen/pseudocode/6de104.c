
undefined8 FUN_006de104(long param_1)

{
  undefined1 in_ZR;
  long in_x9;
  long in_x10;
  int *in_x11;
  long in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  long lVar1;
  
  while( true ) {
    if ((bool)in_ZR || in_x14 < in_x13) {
      return 0;
    }
    in_x15 = in_x13 + in_x15 & in_x14;
    lVar1 = *(long *)(in_x10 + in_x15 * 0x10);
    if (lVar1 == in_x12) break;
    in_ZR = lVar1 == in_x9;
    in_x13 = in_x13 + 1;
  }
  if (param_1 == 0) {
    return 0;
  }
  if (in_x11 == (int *)0x0) {
    return 0;
  }
  if (*in_x11 == *(int *)(in_x10 + in_x15 * 0x10 + 8)) {
    func_0x006de830();
    return 0;
  }
  return 0;
}

