
undefined8 FUN_006ddec8(void)

{
  int iVar1;
  undefined1 in_ZR;
  long in_x9;
  long in_x10;
  int *in_x11;
  ulong in_x12;
  long in_x13;
  long in_x14;
  ulong in_x15;
  ulong in_x16;
  long lVar2;
  
  while( true ) {
    if ((bool)in_ZR || in_x12 < in_x15) {
      return 0;
    }
    in_x16 = in_x15 + in_x16 & in_x12;
    lVar2 = *(long *)(in_x9 + in_x16 * 0x10);
    if (lVar2 == in_x13) break;
    in_ZR = lVar2 == in_x14;
    in_x15 = in_x15 + 1;
  }
  if (in_x10 == 0) {
    return 0;
  }
  if ((*in_x11 != 8) && (iVar1 = *(int *)(in_x9 + in_x16 * 0x10 + 8), iVar1 != 8)) {
    if (*in_x11 != 2) {
      return 0;
    }
    if (iVar1 != 2) {
      return 0;
    }
  }
  func_0x006de830();
  return 0;
}

