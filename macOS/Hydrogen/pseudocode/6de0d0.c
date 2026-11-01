
undefined8 FUN_006de0d0(long param_1)

{
  bool in_ZR;
  ulong in_x9;
  long *in_x10;
  int *in_x11;
  ulong in_x12;
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  
  if (!in_ZR) {
    uVar1 = 0;
    uVar2 = in_x12 >> 4 ^ in_x12 >> 9;
    do {
      uVar2 = uVar2 & in_x10[1] - 1U;
      uVar3 = *(ulong *)(*in_x10 + uVar2 * 0x10);
      if (uVar3 == in_x12) {
        if (param_1 == 0) {
          return 0;
        }
        if (in_x11 == (int *)0x0) {
          return 0;
        }
        if (*in_x11 == *(int *)(*in_x10 + uVar2 * 0x10 + 8)) {
          func_0x006de830();
          return 0;
        }
        return 0;
      }
      uVar1 = uVar1 + 1;
      uVar2 = uVar1 + uVar2;
    } while (uVar3 != in_x9 && uVar1 <= in_x10[1] - 1U);
  }
  return 0;
}

