
undefined8 FUN_006dde94(void)

{
  int iVar1;
  int iVar2;
  long *in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong uVar3;
  ulong uVar4;
  
  uVar3 = in_x13 >> 4 ^ in_x13 >> 9;
  while( true ) {
    uVar3 = uVar3 & in_x9[1] - 1U;
    uVar4 = *(ulong *)(*in_x9 + uVar3 * 0x10);
    if (uVar4 == in_x13) break;
    in_x15 = in_x15 + 1;
    uVar3 = in_x15 + uVar3;
    if (uVar4 == in_x14 || in_x9[1] - 1U < in_x15) {
      return 0;
    }
  }
  if (in_x10 == 0) {
    return 0;
  }
  iVar1 = *(int *)(in_x11 + in_x12 * 0x10 + 8);
  if ((iVar1 != 8) && (iVar2 = *(int *)(*in_x9 + uVar3 * 0x10 + 8), iVar2 != 8)) {
    if (iVar1 != 2) {
      return 0;
    }
    if (iVar2 != 2) {
      return 0;
    }
  }
  func_0x006de830();
  return 0;
}

