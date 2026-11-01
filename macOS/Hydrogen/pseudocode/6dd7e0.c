
undefined8 FUN_006dd7e0(ulong param_1)

{
  long lVar1;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = param_1 >> 4 ^ param_1 >> 9;
  while( true ) {
    uVar2 = uVar2 & in_x12 - 1U;
    uVar3 = *(ulong *)(in_x11 + uVar2 * 0x10);
    if (uVar3 == param_1) break;
    in_x10 = in_x10 + 1;
    uVar2 = in_x10 + uVar2;
    if (uVar3 == in_x9 || in_x12 - 1U < in_x10) {
      return 0;
    }
  }
  lVar1 = *(long *)(in_x11 + uVar2 * 0x10 + 8);
  if (lVar1 == 0 || *(int *)(lVar1 + 8) != iRam0000000000a27cc8) {
    return 0;
  }
  if (*(long *)(lVar1 + 0x30) == 0) {
    return 0;
  }
  func_0x006de830();
  return 0;
}

