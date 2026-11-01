
undefined8 FUN_006ddc58(long param_1)

{
  int iVar1;
  undefined1 in_ZR;
  undefined1 in_CY;
  long in_x10;
  long in_x11;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong uVar2;
  ulong in_x15;
  long lVar3;
  
  while( true ) {
    if ((bool)in_CY && !(bool)in_ZR) {
      return 0;
    }
    uVar2 = in_x15 & in_x14;
    lVar3 = *(long *)(in_x13 + uVar2 * 0x10);
    if (lVar3 == in_x10) break;
    in_x12 = in_x12 + 1;
    in_x15 = in_x12 + uVar2;
    in_ZR = false;
    in_CY = true;
    if (lVar3 != in_x11) {
      in_CY = in_x14 <= in_x12;
      in_ZR = in_x12 == in_x14;
    }
  }
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(in_x13 + uVar2 * 0x10 + 8);
  if ((iVar1 == 2) || (iVar1 == 8)) {
    func_0x006de830();
    return 0;
  }
  return 0;
}

