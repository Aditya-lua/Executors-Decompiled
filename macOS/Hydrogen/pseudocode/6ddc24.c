
undefined8 FUN_006ddc24(long param_1)

{
  int iVar1;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  long *in_x13;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = in_x10 >> 4 ^ in_x10 >> 9;
  while( true ) {
    uVar2 = uVar2 & in_x13[1] - 1U;
    uVar3 = *(ulong *)(*in_x13 + uVar2 * 0x10);
    if (uVar3 == in_x10) break;
    in_x12 = in_x12 + 1;
    uVar2 = in_x12 + uVar2;
    if (uVar3 == in_x11 || in_x13[1] - 1U < in_x12) {
      return 0;
    }
  }
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(*in_x13 + uVar2 * 0x10 + 8);
  if ((iVar1 == 2) || (iVar1 == 8)) {
    func_0x006de830();
    return 0;
  }
  return 0;
}

